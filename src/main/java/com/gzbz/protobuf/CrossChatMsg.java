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
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class CrossChatMsg {
   private static final Descriptors.Descriptor internal_static_crossChat_com_gzbz_protobuf_S2CR_Chat_11701_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossChat_com_gzbz_protobuf_S2CR_Chat_11701_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossChat_com_gzbz_protobuf_CR2S_Chat_11702_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossChat_com_gzbz_protobuf_CR2S_Chat_11702_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossChat_com_gzbz_protobuf_S2CR_ChatCountryWar_11703_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossChat_com_gzbz_protobuf_S2CR_ChatCountryWar_11703_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossChat_com_gzbz_protobuf_CR2S_ChatCountryWar_11704_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossChat_com_gzbz_protobuf_CR2S_ChatCountryWar_11704_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfo_11705_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfo_11705_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfoForCross_11707_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfoForCross_11707_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfoForCross_11708_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfoForCross_11708_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossChat_com_gzbz_protobuf_S2CR_FightToPlayer_11715_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossChat_com_gzbz_protobuf_S2CR_FightToPlayer_11715_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossChat_com_gzbz_protobuf_CR2S_FightToPlayer_11716_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossChat_com_gzbz_protobuf_CR2S_FightToPlayer_11716_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossChat_com_gzbz_protobuf_S2CR_FightToPlayerResult_11717_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossChat_com_gzbz_protobuf_S2CR_FightToPlayerResult_11717_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossChat_com_gzbz_protobuf_CR2S_FightToPlayerResult_11718_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossChat_com_gzbz_protobuf_CR2S_FightToPlayerResult_11718_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerBeautyInfo_11719_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerBeautyInfo_11719_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossChat_com_gzbz_protobuf_S2CR_CityChat_11721_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossChat_com_gzbz_protobuf_S2CR_CityChat_11721_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossChat_com_gzbz_protobuf_S2CR_KingOfChallenge_11723_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossChat_com_gzbz_protobuf_S2CR_KingOfChallenge_11723_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfChallenge_11724_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfChallenge_11724_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossChat_com_gzbz_protobuf_S2CR_KingOfChallenge_11725_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossChat_com_gzbz_protobuf_S2CR_KingOfChallenge_11725_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfChallenge_11726_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfChallenge_11726_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfRecord_11728_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfRecord_11728_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossChat_com_gzbz_protobuf_S2CR_RemoveChatInfo_11729_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossChat_com_gzbz_protobuf_S2CR_RemoveChatInfo_11729_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossChat_com_gzbz_protobuf_CR2S_RemoveChatInfo_11730_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossChat_com_gzbz_protobuf_CR2S_RemoveChatInfo_11730_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private CrossChatMsg() {
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
      String[] descriptorData = new String[]{"\n\u000fCrossChat.proto\u0012\u001bcrossChat.com.gzbz.protobuf\u001a\nChat.proto\u001a\fBattle.proto\u001a\fcommon.proto\"F\n\u000fS2CR_Chat_11701\u00123\n\bchatInfo\u0018\u0001 \u0002(\u000b2!.chat.com.gzbz.protobuf.Chat_Info\"F\n\u000fCR2S_Chat_11702\u00123\n\bchatInfo\u0018\u0001 \u0002(\u000b2!.chat.com.gzbz.protobuf.Chat_Info\"P\n\u0019S2CR_ChatCountryWar_11703\u00123\n\bchatInfo\u0018\u0001 \u0002(\u000b2!.chat.com.gzbz.protobuf.Chat_Info\"P\n\u0019CR2S_ChatCountryWar_11704\u00123\n\bchatInfo\u0018\u0001 \u0002(\u000b2!.chat.com.gzbz.protobuf.Chat_Info\"B\n\u001bS2CR_PlayerDetailInfo_11705\u0012#\n\barraying\u0018\u0001 \u0002(\u000e2\u0011.common.HeroState\"\u008e\u0001\n#S2CR_PlayerDetailInfoForCross_11707\u0012\u0014\n\fdestServerId\u0018\u0001 \u0002(\u0005\u0012\u0014\n\fdestPlayerId\u0018\u0002 \u0002(\u0005\u0012#\n\barraying\u0018\u0003 \u0002(\u000e2\u0011.common.HeroState\u0012\u0016\n\u000esourcePlayerLv\u0018\u0004 \u0002(\u0005\"v\n#S2CR_PlayerDetailInfoForCross_11708\u0012\u0014\n\fdestServerId\u0018\u0001 \u0002(\u0005\u0012\u0014\n\fdestPlayerId\u0018\u0002 \u0002(\u0005\u0012#\n\barraying\u0018\u0003 \u0002(\u000e2\u0011.common.HeroState\"\u0089\u0001\n\u0018S2CR_FightToPlayer_11715\u0012\u0013\n\u000bdefServerId\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bdefPlayerId\u0018\u0002 \u0002(\u0005\u0012)\n\ratkPlayerInfo\u0018\u0003 \u0002(\u000b2\u0012.common.PlayerInfo\u0012\u0018\n\u0010heroArrayingData\u0018\u0004 \u0002(\f\"_\n\u0018CR2S_FightToPlayer_11716\u0012)\n\ratkPlayerInfo\u0018\u0001 \u0002(\u000b2\u0012.common.PlayerInfo\u0012\u0018\n\u0010heroArrayingData\u0018\u0002 \u0002(\f\"\u0090\u0001\n\u001eS2CR_FightToPlayerResult_11717\u0012\u0014\n\fdestServerId\u0018\u0001 \u0002(\u0005\u0012\u0014\n\fdestPlayerId\u0018\u0002 \u0002(\u0005\u0012B\n\tbattleMsg\u0018\u0003 \u0002(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\"y\n\u001eCR2S_FightToPlayerResult_11718\u0012\u0013\n\u000bdefPlayerId\u0018\u0001 \u0002(\u0005\u0012B\n\tbattleMsg\u0018\u0002 \u0002(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\"/\n\u001bS2CR_PlayerBeautyInfo_11719\u0012\u0010\n\bbeautyId\u0018\u0001 \u0001(\u0005\"J\n\u0013S2CR_CityChat_11721\u00123\n\bchatInfo\u0018\u0001 \u0002(\u000b2!.chat.com.gzbz.protobuf.Chat_Info\"\u008b\u0001\n\u001aS2CR_KingOfChallenge_11723\u0012\u0013\n\u000bdefServerId\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bdefPlayerId\u0018\u0002 \u0002(\u0005\u0012)\n\ratkPlayerInfo\u0018\u0003 \u0002(\u000b2\u0012.common.PlayerInfo\u0012\u0018\n\u0010heroArrayingData\u0018\u0004 \u0002(\f\"a\n\u001aCR2S_KingOfChallenge_11724\u0012)\n\ratkPlayerInfo\u0018\u0001 \u0002(\u000b2\u0012.common.PlayerInfo\u0012\u0018\n\u0010heroArrayingData\u0018\u0002 \u0002(\f\"´\u0001\n\u001aS2CR_KingOfChallenge_11725\u0012B\n\tbattleMsg\u0018\u0001 \u0002(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\u0012\u0013\n\u000batkServerId\u0018\u0002 \u0002(\u0005\u0012\u0013\n\u000batkPlayerId\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000bdefServerId\u0018\u0004 \u0002(\u0005\u0012\u0013\n\u000bdefPlayerId\u0018\u0005 \u0002(\u0005\"u\n\u001aCR2S_KingOfChallenge_11726\u0012\u0013\n\u000bdefPlayerId\u0018\u0001 \u0002(\u0005\u0012B\n\tbattleMsg\u0018\u0002 \u0002(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\"-\n\u0017CR2S_KingOfRecord_11728\u0012\u0012\n\nrecordInfo\u0018\u0001 \u0003(\t\".\n\u0019S2CR_RemoveChatInfo_11729\u0012\u0011\n\tplayerIds\u0018\u0001 \u0003(\u0005\".\n\u0019CR2S_RemoveChatInfo_11730\u0012\u0011\n\tplayerIds\u0018\u0001 \u0003(\u0005B#\n\u0011com.gzbz.protobufB\fCrossChatMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{ChatMsg.getDescriptor(), BattleMsg.getDescriptor(), CommonMsg.getDescriptor()});
      internal_static_crossChat_com_gzbz_protobuf_S2CR_Chat_11701_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_crossChat_com_gzbz_protobuf_S2CR_Chat_11701_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossChat_com_gzbz_protobuf_S2CR_Chat_11701_descriptor, new String[]{"ChatInfo"});
      internal_static_crossChat_com_gzbz_protobuf_CR2S_Chat_11702_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_crossChat_com_gzbz_protobuf_CR2S_Chat_11702_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossChat_com_gzbz_protobuf_CR2S_Chat_11702_descriptor, new String[]{"ChatInfo"});
      internal_static_crossChat_com_gzbz_protobuf_S2CR_ChatCountryWar_11703_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_crossChat_com_gzbz_protobuf_S2CR_ChatCountryWar_11703_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossChat_com_gzbz_protobuf_S2CR_ChatCountryWar_11703_descriptor, new String[]{"ChatInfo"});
      internal_static_crossChat_com_gzbz_protobuf_CR2S_ChatCountryWar_11704_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_crossChat_com_gzbz_protobuf_CR2S_ChatCountryWar_11704_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossChat_com_gzbz_protobuf_CR2S_ChatCountryWar_11704_descriptor, new String[]{"ChatInfo"});
      internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfo_11705_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfo_11705_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfo_11705_descriptor, new String[]{"Arraying"});
      internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfoForCross_11707_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfoForCross_11707_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfoForCross_11707_descriptor, new String[]{"DestServerId", "DestPlayerId", "Arraying", "SourcePlayerLv"});
      internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfoForCross_11708_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfoForCross_11708_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfoForCross_11708_descriptor, new String[]{"DestServerId", "DestPlayerId", "Arraying"});
      internal_static_crossChat_com_gzbz_protobuf_S2CR_FightToPlayer_11715_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_crossChat_com_gzbz_protobuf_S2CR_FightToPlayer_11715_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossChat_com_gzbz_protobuf_S2CR_FightToPlayer_11715_descriptor, new String[]{"DefServerId", "DefPlayerId", "AtkPlayerInfo", "HeroArrayingData"});
      internal_static_crossChat_com_gzbz_protobuf_CR2S_FightToPlayer_11716_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_crossChat_com_gzbz_protobuf_CR2S_FightToPlayer_11716_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossChat_com_gzbz_protobuf_CR2S_FightToPlayer_11716_descriptor, new String[]{"AtkPlayerInfo", "HeroArrayingData"});
      internal_static_crossChat_com_gzbz_protobuf_S2CR_FightToPlayerResult_11717_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_crossChat_com_gzbz_protobuf_S2CR_FightToPlayerResult_11717_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossChat_com_gzbz_protobuf_S2CR_FightToPlayerResult_11717_descriptor, new String[]{"DestServerId", "DestPlayerId", "BattleMsg"});
      internal_static_crossChat_com_gzbz_protobuf_CR2S_FightToPlayerResult_11718_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_crossChat_com_gzbz_protobuf_CR2S_FightToPlayerResult_11718_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossChat_com_gzbz_protobuf_CR2S_FightToPlayerResult_11718_descriptor, new String[]{"DefPlayerId", "BattleMsg"});
      internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerBeautyInfo_11719_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerBeautyInfo_11719_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerBeautyInfo_11719_descriptor, new String[]{"BeautyId"});
      internal_static_crossChat_com_gzbz_protobuf_S2CR_CityChat_11721_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_crossChat_com_gzbz_protobuf_S2CR_CityChat_11721_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossChat_com_gzbz_protobuf_S2CR_CityChat_11721_descriptor, new String[]{"ChatInfo"});
      internal_static_crossChat_com_gzbz_protobuf_S2CR_KingOfChallenge_11723_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_crossChat_com_gzbz_protobuf_S2CR_KingOfChallenge_11723_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossChat_com_gzbz_protobuf_S2CR_KingOfChallenge_11723_descriptor, new String[]{"DefServerId", "DefPlayerId", "AtkPlayerInfo", "HeroArrayingData"});
      internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfChallenge_11724_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfChallenge_11724_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfChallenge_11724_descriptor, new String[]{"AtkPlayerInfo", "HeroArrayingData"});
      internal_static_crossChat_com_gzbz_protobuf_S2CR_KingOfChallenge_11725_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_crossChat_com_gzbz_protobuf_S2CR_KingOfChallenge_11725_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossChat_com_gzbz_protobuf_S2CR_KingOfChallenge_11725_descriptor, new String[]{"BattleMsg", "AtkServerId", "AtkPlayerId", "DefServerId", "DefPlayerId"});
      internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfChallenge_11726_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfChallenge_11726_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfChallenge_11726_descriptor, new String[]{"DefPlayerId", "BattleMsg"});
      internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfRecord_11728_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfRecord_11728_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfRecord_11728_descriptor, new String[]{"RecordInfo"});
      internal_static_crossChat_com_gzbz_protobuf_S2CR_RemoveChatInfo_11729_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_crossChat_com_gzbz_protobuf_S2CR_RemoveChatInfo_11729_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossChat_com_gzbz_protobuf_S2CR_RemoveChatInfo_11729_descriptor, new String[]{"PlayerIds"});
      internal_static_crossChat_com_gzbz_protobuf_CR2S_RemoveChatInfo_11730_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_crossChat_com_gzbz_protobuf_CR2S_RemoveChatInfo_11730_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossChat_com_gzbz_protobuf_CR2S_RemoveChatInfo_11730_descriptor, new String[]{"PlayerIds"});
      ChatMsg.getDescriptor();
      BattleMsg.getDescriptor();
      CommonMsg.getDescriptor();
   }

   public static final class S2CR_Chat_11701 extends GeneratedMessageV3 implements S2CR_Chat_11701OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHATINFO_FIELD_NUMBER = 1;
      private ChatMsg.Chat_Info chatInfo_;
      private byte memoizedIsInitialized;
      private static final S2CR_Chat_11701 DEFAULT_INSTANCE = new S2CR_Chat_11701();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Chat_11701> PARSER = new AbstractParser<S2CR_Chat_11701>() {
         public S2CR_Chat_11701 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Chat_11701(input, extensionRegistry);
         }
      };

      private S2CR_Chat_11701(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Chat_11701() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Chat_11701();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Chat_11701(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ChatMsg.Chat_Info.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.chatInfo_.toBuilder();
                        }

                        this.chatInfo_ = (ChatMsg.Chat_Info)input.readMessage(ChatMsg.Chat_Info.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.chatInfo_);
                           this.chatInfo_ = subBuilder.buildPartial();
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
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_Chat_11701_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_Chat_11701_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Chat_11701.class, Builder.class);
      }

      public boolean hasChatInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public ChatMsg.Chat_Info getChatInfo() {
         return this.chatInfo_ == null ? ChatMsg.Chat_Info.getDefaultInstance() : this.chatInfo_;
      }

      public ChatMsg.Chat_InfoOrBuilder getChatInfoOrBuilder() {
         return this.chatInfo_ == null ? ChatMsg.Chat_Info.getDefaultInstance() : this.chatInfo_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChatInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getChatInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getChatInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getChatInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_Chat_11701)) {
            return super.equals(obj);
         } else {
            S2CR_Chat_11701 other = (S2CR_Chat_11701)obj;
            if (this.hasChatInfo() != other.hasChatInfo()) {
               return false;
            } else if (this.hasChatInfo() && !this.getChatInfo().equals(other.getChatInfo())) {
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
            if (this.hasChatInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChatInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_Chat_11701 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Chat_11701)PARSER.parseFrom(data);
      }

      public static S2CR_Chat_11701 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Chat_11701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Chat_11701 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Chat_11701)PARSER.parseFrom(data);
      }

      public static S2CR_Chat_11701 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Chat_11701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Chat_11701 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Chat_11701)PARSER.parseFrom(data);
      }

      public static S2CR_Chat_11701 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Chat_11701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Chat_11701 parseFrom(InputStream input) throws IOException {
         return (S2CR_Chat_11701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Chat_11701 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Chat_11701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Chat_11701 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Chat_11701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Chat_11701 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Chat_11701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Chat_11701 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Chat_11701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Chat_11701 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Chat_11701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Chat_11701 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Chat_11701 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Chat_11701> parser() {
         return PARSER;
      }

      public Parser<S2CR_Chat_11701> getParserForType() {
         return PARSER;
      }

      public S2CR_Chat_11701 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Chat_11701OrBuilder {
         private int bitField0_;
         private ChatMsg.Chat_Info chatInfo_;
         private SingleFieldBuilderV3<ChatMsg.Chat_Info, ChatMsg.Chat_Info.Builder, ChatMsg.Chat_InfoOrBuilder> chatInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_Chat_11701_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_Chat_11701_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Chat_11701.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossChatMsg.S2CR_Chat_11701.alwaysUseFieldBuilders) {
               this.getChatInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.chatInfoBuilder_ == null) {
               this.chatInfo_ = null;
            } else {
               this.chatInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_Chat_11701_descriptor;
         }

         public S2CR_Chat_11701 getDefaultInstanceForType() {
            return CrossChatMsg.S2CR_Chat_11701.getDefaultInstance();
         }

         public S2CR_Chat_11701 build() {
            S2CR_Chat_11701 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Chat_11701 buildPartial() {
            S2CR_Chat_11701 result = new S2CR_Chat_11701(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.chatInfoBuilder_ == null) {
                  result.chatInfo_ = this.chatInfo_;
               } else {
                  result.chatInfo_ = (ChatMsg.Chat_Info)this.chatInfoBuilder_.build();
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
            if (other instanceof S2CR_Chat_11701) {
               return this.mergeFrom((S2CR_Chat_11701)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Chat_11701 other) {
            if (other == CrossChatMsg.S2CR_Chat_11701.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChatInfo()) {
                  this.mergeChatInfo(other.getChatInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChatInfo()) {
               return false;
            } else {
               return this.getChatInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_Chat_11701 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Chat_11701)CrossChatMsg.S2CR_Chat_11701.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Chat_11701)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChatInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public ChatMsg.Chat_Info getChatInfo() {
            if (this.chatInfoBuilder_ == null) {
               return this.chatInfo_ == null ? ChatMsg.Chat_Info.getDefaultInstance() : this.chatInfo_;
            } else {
               return (ChatMsg.Chat_Info)this.chatInfoBuilder_.getMessage();
            }
         }

         public Builder setChatInfo(ChatMsg.Chat_Info value) {
            if (this.chatInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.chatInfo_ = value;
               this.onChanged();
            } else {
               this.chatInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setChatInfo(ChatMsg.Chat_Info.Builder builderForValue) {
            if (this.chatInfoBuilder_ == null) {
               this.chatInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.chatInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeChatInfo(ChatMsg.Chat_Info value) {
            if (this.chatInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.chatInfo_ != null && this.chatInfo_ != ChatMsg.Chat_Info.getDefaultInstance()) {
                  this.chatInfo_ = ChatMsg.Chat_Info.newBuilder(this.chatInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.chatInfo_ = value;
               }

               this.onChanged();
            } else {
               this.chatInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearChatInfo() {
            if (this.chatInfoBuilder_ == null) {
               this.chatInfo_ = null;
               this.onChanged();
            } else {
               this.chatInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public ChatMsg.Chat_Info.Builder getChatInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (ChatMsg.Chat_Info.Builder)this.getChatInfoFieldBuilder().getBuilder();
         }

         public ChatMsg.Chat_InfoOrBuilder getChatInfoOrBuilder() {
            if (this.chatInfoBuilder_ != null) {
               return (ChatMsg.Chat_InfoOrBuilder)this.chatInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.chatInfo_ == null ? ChatMsg.Chat_Info.getDefaultInstance() : this.chatInfo_;
            }
         }

         private SingleFieldBuilderV3<ChatMsg.Chat_Info, ChatMsg.Chat_Info.Builder, ChatMsg.Chat_InfoOrBuilder> getChatInfoFieldBuilder() {
            if (this.chatInfoBuilder_ == null) {
               this.chatInfoBuilder_ = new SingleFieldBuilderV3(this.getChatInfo(), this.getParentForChildren(), this.isClean());
               this.chatInfo_ = null;
            }

            return this.chatInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_Chat_11702 extends GeneratedMessageV3 implements CR2S_Chat_11702OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHATINFO_FIELD_NUMBER = 1;
      private ChatMsg.Chat_Info chatInfo_;
      private byte memoizedIsInitialized;
      private static final CR2S_Chat_11702 DEFAULT_INSTANCE = new CR2S_Chat_11702();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_Chat_11702> PARSER = new AbstractParser<CR2S_Chat_11702>() {
         public CR2S_Chat_11702 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_Chat_11702(input, extensionRegistry);
         }
      };

      private CR2S_Chat_11702(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_Chat_11702() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_Chat_11702();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_Chat_11702(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ChatMsg.Chat_Info.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.chatInfo_.toBuilder();
                        }

                        this.chatInfo_ = (ChatMsg.Chat_Info)input.readMessage(ChatMsg.Chat_Info.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.chatInfo_);
                           this.chatInfo_ = subBuilder.buildPartial();
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
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_Chat_11702_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_Chat_11702_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Chat_11702.class, Builder.class);
      }

      public boolean hasChatInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public ChatMsg.Chat_Info getChatInfo() {
         return this.chatInfo_ == null ? ChatMsg.Chat_Info.getDefaultInstance() : this.chatInfo_;
      }

      public ChatMsg.Chat_InfoOrBuilder getChatInfoOrBuilder() {
         return this.chatInfo_ == null ? ChatMsg.Chat_Info.getDefaultInstance() : this.chatInfo_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChatInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getChatInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getChatInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getChatInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_Chat_11702)) {
            return super.equals(obj);
         } else {
            CR2S_Chat_11702 other = (CR2S_Chat_11702)obj;
            if (this.hasChatInfo() != other.hasChatInfo()) {
               return false;
            } else if (this.hasChatInfo() && !this.getChatInfo().equals(other.getChatInfo())) {
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
            if (this.hasChatInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChatInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_Chat_11702 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_Chat_11702)PARSER.parseFrom(data);
      }

      public static CR2S_Chat_11702 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Chat_11702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Chat_11702 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_Chat_11702)PARSER.parseFrom(data);
      }

      public static CR2S_Chat_11702 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Chat_11702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Chat_11702 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_Chat_11702)PARSER.parseFrom(data);
      }

      public static CR2S_Chat_11702 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Chat_11702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Chat_11702 parseFrom(InputStream input) throws IOException {
         return (CR2S_Chat_11702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Chat_11702 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Chat_11702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Chat_11702 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_Chat_11702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_Chat_11702 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Chat_11702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Chat_11702 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_Chat_11702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Chat_11702 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Chat_11702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_Chat_11702 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_Chat_11702 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_Chat_11702> parser() {
         return PARSER;
      }

      public Parser<CR2S_Chat_11702> getParserForType() {
         return PARSER;
      }

      public CR2S_Chat_11702 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_Chat_11702OrBuilder {
         private int bitField0_;
         private ChatMsg.Chat_Info chatInfo_;
         private SingleFieldBuilderV3<ChatMsg.Chat_Info, ChatMsg.Chat_Info.Builder, ChatMsg.Chat_InfoOrBuilder> chatInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_Chat_11702_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_Chat_11702_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Chat_11702.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossChatMsg.CR2S_Chat_11702.alwaysUseFieldBuilders) {
               this.getChatInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.chatInfoBuilder_ == null) {
               this.chatInfo_ = null;
            } else {
               this.chatInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_Chat_11702_descriptor;
         }

         public CR2S_Chat_11702 getDefaultInstanceForType() {
            return CrossChatMsg.CR2S_Chat_11702.getDefaultInstance();
         }

         public CR2S_Chat_11702 build() {
            CR2S_Chat_11702 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_Chat_11702 buildPartial() {
            CR2S_Chat_11702 result = new CR2S_Chat_11702(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.chatInfoBuilder_ == null) {
                  result.chatInfo_ = this.chatInfo_;
               } else {
                  result.chatInfo_ = (ChatMsg.Chat_Info)this.chatInfoBuilder_.build();
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
            if (other instanceof CR2S_Chat_11702) {
               return this.mergeFrom((CR2S_Chat_11702)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_Chat_11702 other) {
            if (other == CrossChatMsg.CR2S_Chat_11702.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChatInfo()) {
                  this.mergeChatInfo(other.getChatInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChatInfo()) {
               return false;
            } else {
               return this.getChatInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_Chat_11702 parsedMessage = null;

            try {
               parsedMessage = (CR2S_Chat_11702)CrossChatMsg.CR2S_Chat_11702.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_Chat_11702)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChatInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public ChatMsg.Chat_Info getChatInfo() {
            if (this.chatInfoBuilder_ == null) {
               return this.chatInfo_ == null ? ChatMsg.Chat_Info.getDefaultInstance() : this.chatInfo_;
            } else {
               return (ChatMsg.Chat_Info)this.chatInfoBuilder_.getMessage();
            }
         }

         public Builder setChatInfo(ChatMsg.Chat_Info value) {
            if (this.chatInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.chatInfo_ = value;
               this.onChanged();
            } else {
               this.chatInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setChatInfo(ChatMsg.Chat_Info.Builder builderForValue) {
            if (this.chatInfoBuilder_ == null) {
               this.chatInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.chatInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeChatInfo(ChatMsg.Chat_Info value) {
            if (this.chatInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.chatInfo_ != null && this.chatInfo_ != ChatMsg.Chat_Info.getDefaultInstance()) {
                  this.chatInfo_ = ChatMsg.Chat_Info.newBuilder(this.chatInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.chatInfo_ = value;
               }

               this.onChanged();
            } else {
               this.chatInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearChatInfo() {
            if (this.chatInfoBuilder_ == null) {
               this.chatInfo_ = null;
               this.onChanged();
            } else {
               this.chatInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public ChatMsg.Chat_Info.Builder getChatInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (ChatMsg.Chat_Info.Builder)this.getChatInfoFieldBuilder().getBuilder();
         }

         public ChatMsg.Chat_InfoOrBuilder getChatInfoOrBuilder() {
            if (this.chatInfoBuilder_ != null) {
               return (ChatMsg.Chat_InfoOrBuilder)this.chatInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.chatInfo_ == null ? ChatMsg.Chat_Info.getDefaultInstance() : this.chatInfo_;
            }
         }

         private SingleFieldBuilderV3<ChatMsg.Chat_Info, ChatMsg.Chat_Info.Builder, ChatMsg.Chat_InfoOrBuilder> getChatInfoFieldBuilder() {
            if (this.chatInfoBuilder_ == null) {
               this.chatInfoBuilder_ = new SingleFieldBuilderV3(this.getChatInfo(), this.getParentForChildren(), this.isClean());
               this.chatInfo_ = null;
            }

            return this.chatInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_ChatCountryWar_11703 extends GeneratedMessageV3 implements S2CR_ChatCountryWar_11703OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHATINFO_FIELD_NUMBER = 1;
      private ChatMsg.Chat_Info chatInfo_;
      private byte memoizedIsInitialized;
      private static final S2CR_ChatCountryWar_11703 DEFAULT_INSTANCE = new S2CR_ChatCountryWar_11703();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_ChatCountryWar_11703> PARSER = new AbstractParser<S2CR_ChatCountryWar_11703>() {
         public S2CR_ChatCountryWar_11703 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_ChatCountryWar_11703(input, extensionRegistry);
         }
      };

      private S2CR_ChatCountryWar_11703(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_ChatCountryWar_11703() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_ChatCountryWar_11703();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_ChatCountryWar_11703(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ChatMsg.Chat_Info.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.chatInfo_.toBuilder();
                        }

                        this.chatInfo_ = (ChatMsg.Chat_Info)input.readMessage(ChatMsg.Chat_Info.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.chatInfo_);
                           this.chatInfo_ = subBuilder.buildPartial();
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
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_ChatCountryWar_11703_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_ChatCountryWar_11703_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ChatCountryWar_11703.class, Builder.class);
      }

      public boolean hasChatInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public ChatMsg.Chat_Info getChatInfo() {
         return this.chatInfo_ == null ? ChatMsg.Chat_Info.getDefaultInstance() : this.chatInfo_;
      }

      public ChatMsg.Chat_InfoOrBuilder getChatInfoOrBuilder() {
         return this.chatInfo_ == null ? ChatMsg.Chat_Info.getDefaultInstance() : this.chatInfo_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChatInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getChatInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getChatInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getChatInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_ChatCountryWar_11703)) {
            return super.equals(obj);
         } else {
            S2CR_ChatCountryWar_11703 other = (S2CR_ChatCountryWar_11703)obj;
            if (this.hasChatInfo() != other.hasChatInfo()) {
               return false;
            } else if (this.hasChatInfo() && !this.getChatInfo().equals(other.getChatInfo())) {
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
            if (this.hasChatInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChatInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_ChatCountryWar_11703 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_ChatCountryWar_11703)PARSER.parseFrom(data);
      }

      public static S2CR_ChatCountryWar_11703 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ChatCountryWar_11703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ChatCountryWar_11703 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_ChatCountryWar_11703)PARSER.parseFrom(data);
      }

      public static S2CR_ChatCountryWar_11703 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ChatCountryWar_11703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ChatCountryWar_11703 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_ChatCountryWar_11703)PARSER.parseFrom(data);
      }

      public static S2CR_ChatCountryWar_11703 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ChatCountryWar_11703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ChatCountryWar_11703 parseFrom(InputStream input) throws IOException {
         return (S2CR_ChatCountryWar_11703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ChatCountryWar_11703 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ChatCountryWar_11703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ChatCountryWar_11703 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_ChatCountryWar_11703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_ChatCountryWar_11703 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ChatCountryWar_11703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ChatCountryWar_11703 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_ChatCountryWar_11703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ChatCountryWar_11703 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ChatCountryWar_11703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_ChatCountryWar_11703 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_ChatCountryWar_11703 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_ChatCountryWar_11703> parser() {
         return PARSER;
      }

      public Parser<S2CR_ChatCountryWar_11703> getParserForType() {
         return PARSER;
      }

      public S2CR_ChatCountryWar_11703 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_ChatCountryWar_11703OrBuilder {
         private int bitField0_;
         private ChatMsg.Chat_Info chatInfo_;
         private SingleFieldBuilderV3<ChatMsg.Chat_Info, ChatMsg.Chat_Info.Builder, ChatMsg.Chat_InfoOrBuilder> chatInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_ChatCountryWar_11703_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_ChatCountryWar_11703_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ChatCountryWar_11703.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossChatMsg.S2CR_ChatCountryWar_11703.alwaysUseFieldBuilders) {
               this.getChatInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.chatInfoBuilder_ == null) {
               this.chatInfo_ = null;
            } else {
               this.chatInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_ChatCountryWar_11703_descriptor;
         }

         public S2CR_ChatCountryWar_11703 getDefaultInstanceForType() {
            return CrossChatMsg.S2CR_ChatCountryWar_11703.getDefaultInstance();
         }

         public S2CR_ChatCountryWar_11703 build() {
            S2CR_ChatCountryWar_11703 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_ChatCountryWar_11703 buildPartial() {
            S2CR_ChatCountryWar_11703 result = new S2CR_ChatCountryWar_11703(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.chatInfoBuilder_ == null) {
                  result.chatInfo_ = this.chatInfo_;
               } else {
                  result.chatInfo_ = (ChatMsg.Chat_Info)this.chatInfoBuilder_.build();
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
            if (other instanceof S2CR_ChatCountryWar_11703) {
               return this.mergeFrom((S2CR_ChatCountryWar_11703)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_ChatCountryWar_11703 other) {
            if (other == CrossChatMsg.S2CR_ChatCountryWar_11703.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChatInfo()) {
                  this.mergeChatInfo(other.getChatInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChatInfo()) {
               return false;
            } else {
               return this.getChatInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_ChatCountryWar_11703 parsedMessage = null;

            try {
               parsedMessage = (S2CR_ChatCountryWar_11703)CrossChatMsg.S2CR_ChatCountryWar_11703.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_ChatCountryWar_11703)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChatInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public ChatMsg.Chat_Info getChatInfo() {
            if (this.chatInfoBuilder_ == null) {
               return this.chatInfo_ == null ? ChatMsg.Chat_Info.getDefaultInstance() : this.chatInfo_;
            } else {
               return (ChatMsg.Chat_Info)this.chatInfoBuilder_.getMessage();
            }
         }

         public Builder setChatInfo(ChatMsg.Chat_Info value) {
            if (this.chatInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.chatInfo_ = value;
               this.onChanged();
            } else {
               this.chatInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setChatInfo(ChatMsg.Chat_Info.Builder builderForValue) {
            if (this.chatInfoBuilder_ == null) {
               this.chatInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.chatInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeChatInfo(ChatMsg.Chat_Info value) {
            if (this.chatInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.chatInfo_ != null && this.chatInfo_ != ChatMsg.Chat_Info.getDefaultInstance()) {
                  this.chatInfo_ = ChatMsg.Chat_Info.newBuilder(this.chatInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.chatInfo_ = value;
               }

               this.onChanged();
            } else {
               this.chatInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearChatInfo() {
            if (this.chatInfoBuilder_ == null) {
               this.chatInfo_ = null;
               this.onChanged();
            } else {
               this.chatInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public ChatMsg.Chat_Info.Builder getChatInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (ChatMsg.Chat_Info.Builder)this.getChatInfoFieldBuilder().getBuilder();
         }

         public ChatMsg.Chat_InfoOrBuilder getChatInfoOrBuilder() {
            if (this.chatInfoBuilder_ != null) {
               return (ChatMsg.Chat_InfoOrBuilder)this.chatInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.chatInfo_ == null ? ChatMsg.Chat_Info.getDefaultInstance() : this.chatInfo_;
            }
         }

         private SingleFieldBuilderV3<ChatMsg.Chat_Info, ChatMsg.Chat_Info.Builder, ChatMsg.Chat_InfoOrBuilder> getChatInfoFieldBuilder() {
            if (this.chatInfoBuilder_ == null) {
               this.chatInfoBuilder_ = new SingleFieldBuilderV3(this.getChatInfo(), this.getParentForChildren(), this.isClean());
               this.chatInfo_ = null;
            }

            return this.chatInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_ChatCountryWar_11704 extends GeneratedMessageV3 implements CR2S_ChatCountryWar_11704OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHATINFO_FIELD_NUMBER = 1;
      private ChatMsg.Chat_Info chatInfo_;
      private byte memoizedIsInitialized;
      private static final CR2S_ChatCountryWar_11704 DEFAULT_INSTANCE = new CR2S_ChatCountryWar_11704();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_ChatCountryWar_11704> PARSER = new AbstractParser<CR2S_ChatCountryWar_11704>() {
         public CR2S_ChatCountryWar_11704 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_ChatCountryWar_11704(input, extensionRegistry);
         }
      };

      private CR2S_ChatCountryWar_11704(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_ChatCountryWar_11704() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_ChatCountryWar_11704();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_ChatCountryWar_11704(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ChatMsg.Chat_Info.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.chatInfo_.toBuilder();
                        }

                        this.chatInfo_ = (ChatMsg.Chat_Info)input.readMessage(ChatMsg.Chat_Info.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.chatInfo_);
                           this.chatInfo_ = subBuilder.buildPartial();
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
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_ChatCountryWar_11704_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_ChatCountryWar_11704_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ChatCountryWar_11704.class, Builder.class);
      }

      public boolean hasChatInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public ChatMsg.Chat_Info getChatInfo() {
         return this.chatInfo_ == null ? ChatMsg.Chat_Info.getDefaultInstance() : this.chatInfo_;
      }

      public ChatMsg.Chat_InfoOrBuilder getChatInfoOrBuilder() {
         return this.chatInfo_ == null ? ChatMsg.Chat_Info.getDefaultInstance() : this.chatInfo_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChatInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getChatInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getChatInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getChatInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_ChatCountryWar_11704)) {
            return super.equals(obj);
         } else {
            CR2S_ChatCountryWar_11704 other = (CR2S_ChatCountryWar_11704)obj;
            if (this.hasChatInfo() != other.hasChatInfo()) {
               return false;
            } else if (this.hasChatInfo() && !this.getChatInfo().equals(other.getChatInfo())) {
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
            if (this.hasChatInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChatInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_ChatCountryWar_11704 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_ChatCountryWar_11704)PARSER.parseFrom(data);
      }

      public static CR2S_ChatCountryWar_11704 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ChatCountryWar_11704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ChatCountryWar_11704 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_ChatCountryWar_11704)PARSER.parseFrom(data);
      }

      public static CR2S_ChatCountryWar_11704 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ChatCountryWar_11704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ChatCountryWar_11704 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_ChatCountryWar_11704)PARSER.parseFrom(data);
      }

      public static CR2S_ChatCountryWar_11704 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ChatCountryWar_11704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ChatCountryWar_11704 parseFrom(InputStream input) throws IOException {
         return (CR2S_ChatCountryWar_11704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ChatCountryWar_11704 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ChatCountryWar_11704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ChatCountryWar_11704 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_ChatCountryWar_11704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_ChatCountryWar_11704 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ChatCountryWar_11704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ChatCountryWar_11704 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_ChatCountryWar_11704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ChatCountryWar_11704 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ChatCountryWar_11704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_ChatCountryWar_11704 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_ChatCountryWar_11704 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_ChatCountryWar_11704> parser() {
         return PARSER;
      }

      public Parser<CR2S_ChatCountryWar_11704> getParserForType() {
         return PARSER;
      }

      public CR2S_ChatCountryWar_11704 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_ChatCountryWar_11704OrBuilder {
         private int bitField0_;
         private ChatMsg.Chat_Info chatInfo_;
         private SingleFieldBuilderV3<ChatMsg.Chat_Info, ChatMsg.Chat_Info.Builder, ChatMsg.Chat_InfoOrBuilder> chatInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_ChatCountryWar_11704_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_ChatCountryWar_11704_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ChatCountryWar_11704.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossChatMsg.CR2S_ChatCountryWar_11704.alwaysUseFieldBuilders) {
               this.getChatInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.chatInfoBuilder_ == null) {
               this.chatInfo_ = null;
            } else {
               this.chatInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_ChatCountryWar_11704_descriptor;
         }

         public CR2S_ChatCountryWar_11704 getDefaultInstanceForType() {
            return CrossChatMsg.CR2S_ChatCountryWar_11704.getDefaultInstance();
         }

         public CR2S_ChatCountryWar_11704 build() {
            CR2S_ChatCountryWar_11704 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_ChatCountryWar_11704 buildPartial() {
            CR2S_ChatCountryWar_11704 result = new CR2S_ChatCountryWar_11704(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.chatInfoBuilder_ == null) {
                  result.chatInfo_ = this.chatInfo_;
               } else {
                  result.chatInfo_ = (ChatMsg.Chat_Info)this.chatInfoBuilder_.build();
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
            if (other instanceof CR2S_ChatCountryWar_11704) {
               return this.mergeFrom((CR2S_ChatCountryWar_11704)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_ChatCountryWar_11704 other) {
            if (other == CrossChatMsg.CR2S_ChatCountryWar_11704.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChatInfo()) {
                  this.mergeChatInfo(other.getChatInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChatInfo()) {
               return false;
            } else {
               return this.getChatInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_ChatCountryWar_11704 parsedMessage = null;

            try {
               parsedMessage = (CR2S_ChatCountryWar_11704)CrossChatMsg.CR2S_ChatCountryWar_11704.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_ChatCountryWar_11704)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChatInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public ChatMsg.Chat_Info getChatInfo() {
            if (this.chatInfoBuilder_ == null) {
               return this.chatInfo_ == null ? ChatMsg.Chat_Info.getDefaultInstance() : this.chatInfo_;
            } else {
               return (ChatMsg.Chat_Info)this.chatInfoBuilder_.getMessage();
            }
         }

         public Builder setChatInfo(ChatMsg.Chat_Info value) {
            if (this.chatInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.chatInfo_ = value;
               this.onChanged();
            } else {
               this.chatInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setChatInfo(ChatMsg.Chat_Info.Builder builderForValue) {
            if (this.chatInfoBuilder_ == null) {
               this.chatInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.chatInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeChatInfo(ChatMsg.Chat_Info value) {
            if (this.chatInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.chatInfo_ != null && this.chatInfo_ != ChatMsg.Chat_Info.getDefaultInstance()) {
                  this.chatInfo_ = ChatMsg.Chat_Info.newBuilder(this.chatInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.chatInfo_ = value;
               }

               this.onChanged();
            } else {
               this.chatInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearChatInfo() {
            if (this.chatInfoBuilder_ == null) {
               this.chatInfo_ = null;
               this.onChanged();
            } else {
               this.chatInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public ChatMsg.Chat_Info.Builder getChatInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (ChatMsg.Chat_Info.Builder)this.getChatInfoFieldBuilder().getBuilder();
         }

         public ChatMsg.Chat_InfoOrBuilder getChatInfoOrBuilder() {
            if (this.chatInfoBuilder_ != null) {
               return (ChatMsg.Chat_InfoOrBuilder)this.chatInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.chatInfo_ == null ? ChatMsg.Chat_Info.getDefaultInstance() : this.chatInfo_;
            }
         }

         private SingleFieldBuilderV3<ChatMsg.Chat_Info, ChatMsg.Chat_Info.Builder, ChatMsg.Chat_InfoOrBuilder> getChatInfoFieldBuilder() {
            if (this.chatInfoBuilder_ == null) {
               this.chatInfoBuilder_ = new SingleFieldBuilderV3(this.getChatInfo(), this.getParentForChildren(), this.isClean());
               this.chatInfo_ = null;
            }

            return this.chatInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_PlayerDetailInfo_11705 extends GeneratedMessageV3 implements S2CR_PlayerDetailInfo_11705OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ARRAYING_FIELD_NUMBER = 1;
      private int arraying_;
      private byte memoizedIsInitialized;
      private static final S2CR_PlayerDetailInfo_11705 DEFAULT_INSTANCE = new S2CR_PlayerDetailInfo_11705();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_PlayerDetailInfo_11705> PARSER = new AbstractParser<S2CR_PlayerDetailInfo_11705>() {
         public S2CR_PlayerDetailInfo_11705 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_PlayerDetailInfo_11705(input, extensionRegistry);
         }
      };

      private S2CR_PlayerDetailInfo_11705(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_PlayerDetailInfo_11705() {
         this.memoizedIsInitialized = -1;
         this.arraying_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_PlayerDetailInfo_11705();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_PlayerDetailInfo_11705(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.HeroState value = CommonMsg.HeroState.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.arraying_ = rawValue;
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
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfo_11705_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfo_11705_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerDetailInfo_11705.class, Builder.class);
      }

      public boolean hasArraying() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.HeroState getArraying() {
         CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arraying_);
         return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
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
            output.writeEnum(1, this.arraying_);
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
               size += CodedOutputStream.computeEnumSize(1, this.arraying_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_PlayerDetailInfo_11705)) {
            return super.equals(obj);
         } else {
            S2CR_PlayerDetailInfo_11705 other = (S2CR_PlayerDetailInfo_11705)obj;
            if (this.hasArraying() != other.hasArraying()) {
               return false;
            } else if (this.hasArraying() && this.arraying_ != other.arraying_) {
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
               hash = 53 * hash + this.arraying_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_PlayerDetailInfo_11705 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerDetailInfo_11705)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerDetailInfo_11705 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerDetailInfo_11705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerDetailInfo_11705 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerDetailInfo_11705)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerDetailInfo_11705 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerDetailInfo_11705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerDetailInfo_11705 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerDetailInfo_11705)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerDetailInfo_11705 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerDetailInfo_11705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerDetailInfo_11705 parseFrom(InputStream input) throws IOException {
         return (S2CR_PlayerDetailInfo_11705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerDetailInfo_11705 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerDetailInfo_11705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerDetailInfo_11705 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_PlayerDetailInfo_11705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_PlayerDetailInfo_11705 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerDetailInfo_11705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerDetailInfo_11705 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_PlayerDetailInfo_11705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerDetailInfo_11705 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerDetailInfo_11705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_PlayerDetailInfo_11705 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_PlayerDetailInfo_11705 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_PlayerDetailInfo_11705> parser() {
         return PARSER;
      }

      public Parser<S2CR_PlayerDetailInfo_11705> getParserForType() {
         return PARSER;
      }

      public S2CR_PlayerDetailInfo_11705 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_PlayerDetailInfo_11705OrBuilder {
         private int bitField0_;
         private int arraying_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfo_11705_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfo_11705_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerDetailInfo_11705.class, Builder.class);
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
            if (CrossChatMsg.S2CR_PlayerDetailInfo_11705.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.arraying_ = 1;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfo_11705_descriptor;
         }

         public S2CR_PlayerDetailInfo_11705 getDefaultInstanceForType() {
            return CrossChatMsg.S2CR_PlayerDetailInfo_11705.getDefaultInstance();
         }

         public S2CR_PlayerDetailInfo_11705 build() {
            S2CR_PlayerDetailInfo_11705 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_PlayerDetailInfo_11705 buildPartial() {
            S2CR_PlayerDetailInfo_11705 result = new S2CR_PlayerDetailInfo_11705(this);
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
            if (other instanceof S2CR_PlayerDetailInfo_11705) {
               return this.mergeFrom((S2CR_PlayerDetailInfo_11705)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_PlayerDetailInfo_11705 other) {
            if (other == CrossChatMsg.S2CR_PlayerDetailInfo_11705.getDefaultInstance()) {
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
            S2CR_PlayerDetailInfo_11705 parsedMessage = null;

            try {
               parsedMessage = (S2CR_PlayerDetailInfo_11705)CrossChatMsg.S2CR_PlayerDetailInfo_11705.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_PlayerDetailInfo_11705)e.getUnfinishedMessage();
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

         public CommonMsg.HeroState getArraying() {
            CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arraying_);
            return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
         }

         public Builder setArraying(CommonMsg.HeroState value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.arraying_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearArraying() {
            this.bitField0_ &= -2;
            this.arraying_ = 1;
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

   public static final class S2CR_PlayerDetailInfoForCross_11707 extends GeneratedMessageV3 implements S2CR_PlayerDetailInfoForCross_11707OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DESTSERVERID_FIELD_NUMBER = 1;
      private int destServerId_;
      public static final int DESTPLAYERID_FIELD_NUMBER = 2;
      private int destPlayerId_;
      public static final int ARRAYING_FIELD_NUMBER = 3;
      private int arraying_;
      public static final int SOURCEPLAYERLV_FIELD_NUMBER = 4;
      private int sourcePlayerLv_;
      private byte memoizedIsInitialized;
      private static final S2CR_PlayerDetailInfoForCross_11707 DEFAULT_INSTANCE = new S2CR_PlayerDetailInfoForCross_11707();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_PlayerDetailInfoForCross_11707> PARSER = new AbstractParser<S2CR_PlayerDetailInfoForCross_11707>() {
         public S2CR_PlayerDetailInfoForCross_11707 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_PlayerDetailInfoForCross_11707(input, extensionRegistry);
         }
      };

      private S2CR_PlayerDetailInfoForCross_11707(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_PlayerDetailInfoForCross_11707() {
         this.memoizedIsInitialized = -1;
         this.arraying_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_PlayerDetailInfoForCross_11707();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_PlayerDetailInfoForCross_11707(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.destServerId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.destPlayerId_ = input.readInt32();
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
                        this.sourcePlayerLv_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfoForCross_11707_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfoForCross_11707_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerDetailInfoForCross_11707.class, Builder.class);
      }

      public boolean hasDestServerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDestServerId() {
         return this.destServerId_;
      }

      public boolean hasDestPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDestPlayerId() {
         return this.destPlayerId_;
      }

      public boolean hasArraying() {
         return (this.bitField0_ & 4) != 0;
      }

      public CommonMsg.HeroState getArraying() {
         CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arraying_);
         return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
      }

      public boolean hasSourcePlayerLv() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getSourcePlayerLv() {
         return this.sourcePlayerLv_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDestServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDestPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasArraying()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSourcePlayerLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.destServerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.destPlayerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeEnum(3, this.arraying_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.sourcePlayerLv_);
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
               size += CodedOutputStream.computeInt32Size(1, this.destServerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.destPlayerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeEnumSize(3, this.arraying_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.sourcePlayerLv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_PlayerDetailInfoForCross_11707)) {
            return super.equals(obj);
         } else {
            S2CR_PlayerDetailInfoForCross_11707 other = (S2CR_PlayerDetailInfoForCross_11707)obj;
            if (this.hasDestServerId() != other.hasDestServerId()) {
               return false;
            } else if (this.hasDestServerId() && this.getDestServerId() != other.getDestServerId()) {
               return false;
            } else if (this.hasDestPlayerId() != other.hasDestPlayerId()) {
               return false;
            } else if (this.hasDestPlayerId() && this.getDestPlayerId() != other.getDestPlayerId()) {
               return false;
            } else if (this.hasArraying() != other.hasArraying()) {
               return false;
            } else if (this.hasArraying() && this.arraying_ != other.arraying_) {
               return false;
            } else if (this.hasSourcePlayerLv() != other.hasSourcePlayerLv()) {
               return false;
            } else if (this.hasSourcePlayerLv() && this.getSourcePlayerLv() != other.getSourcePlayerLv()) {
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
            if (this.hasDestServerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDestServerId();
            }

            if (this.hasDestPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDestPlayerId();
            }

            if (this.hasArraying()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.arraying_;
            }

            if (this.hasSourcePlayerLv()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSourcePlayerLv();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_PlayerDetailInfoForCross_11707 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerDetailInfoForCross_11707)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerDetailInfoForCross_11707 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerDetailInfoForCross_11707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerDetailInfoForCross_11707 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerDetailInfoForCross_11707)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerDetailInfoForCross_11707 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerDetailInfoForCross_11707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerDetailInfoForCross_11707 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerDetailInfoForCross_11707)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerDetailInfoForCross_11707 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerDetailInfoForCross_11707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerDetailInfoForCross_11707 parseFrom(InputStream input) throws IOException {
         return (S2CR_PlayerDetailInfoForCross_11707)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerDetailInfoForCross_11707 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerDetailInfoForCross_11707)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerDetailInfoForCross_11707 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_PlayerDetailInfoForCross_11707)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_PlayerDetailInfoForCross_11707 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerDetailInfoForCross_11707)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerDetailInfoForCross_11707 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_PlayerDetailInfoForCross_11707)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerDetailInfoForCross_11707 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerDetailInfoForCross_11707)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_PlayerDetailInfoForCross_11707 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_PlayerDetailInfoForCross_11707 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_PlayerDetailInfoForCross_11707> parser() {
         return PARSER;
      }

      public Parser<S2CR_PlayerDetailInfoForCross_11707> getParserForType() {
         return PARSER;
      }

      public S2CR_PlayerDetailInfoForCross_11707 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_PlayerDetailInfoForCross_11707OrBuilder {
         private int bitField0_;
         private int destServerId_;
         private int destPlayerId_;
         private int arraying_;
         private int sourcePlayerLv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfoForCross_11707_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfoForCross_11707_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerDetailInfoForCross_11707.class, Builder.class);
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
            if (CrossChatMsg.S2CR_PlayerDetailInfoForCross_11707.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.destServerId_ = 0;
            this.bitField0_ &= -2;
            this.destPlayerId_ = 0;
            this.bitField0_ &= -3;
            this.arraying_ = 1;
            this.bitField0_ &= -5;
            this.sourcePlayerLv_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfoForCross_11707_descriptor;
         }

         public S2CR_PlayerDetailInfoForCross_11707 getDefaultInstanceForType() {
            return CrossChatMsg.S2CR_PlayerDetailInfoForCross_11707.getDefaultInstance();
         }

         public S2CR_PlayerDetailInfoForCross_11707 build() {
            S2CR_PlayerDetailInfoForCross_11707 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_PlayerDetailInfoForCross_11707 buildPartial() {
            S2CR_PlayerDetailInfoForCross_11707 result = new S2CR_PlayerDetailInfoForCross_11707(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.destServerId_ = this.destServerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.destPlayerId_ = this.destPlayerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.arraying_ = this.arraying_;
            if ((from_bitField0_ & 8) != 0) {
               result.sourcePlayerLv_ = this.sourcePlayerLv_;
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
            if (other instanceof S2CR_PlayerDetailInfoForCross_11707) {
               return this.mergeFrom((S2CR_PlayerDetailInfoForCross_11707)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_PlayerDetailInfoForCross_11707 other) {
            if (other == CrossChatMsg.S2CR_PlayerDetailInfoForCross_11707.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDestServerId()) {
                  this.setDestServerId(other.getDestServerId());
               }

               if (other.hasDestPlayerId()) {
                  this.setDestPlayerId(other.getDestPlayerId());
               }

               if (other.hasArraying()) {
                  this.setArraying(other.getArraying());
               }

               if (other.hasSourcePlayerLv()) {
                  this.setSourcePlayerLv(other.getSourcePlayerLv());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDestServerId()) {
               return false;
            } else if (!this.hasDestPlayerId()) {
               return false;
            } else if (!this.hasArraying()) {
               return false;
            } else {
               return this.hasSourcePlayerLv();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_PlayerDetailInfoForCross_11707 parsedMessage = null;

            try {
               parsedMessage = (S2CR_PlayerDetailInfoForCross_11707)CrossChatMsg.S2CR_PlayerDetailInfoForCross_11707.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_PlayerDetailInfoForCross_11707)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDestServerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDestServerId() {
            return this.destServerId_;
         }

         public Builder setDestServerId(int value) {
            this.bitField0_ |= 1;
            this.destServerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDestServerId() {
            this.bitField0_ &= -2;
            this.destServerId_ = 0;
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

         public boolean hasSourcePlayerLv() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getSourcePlayerLv() {
            return this.sourcePlayerLv_;
         }

         public Builder setSourcePlayerLv(int value) {
            this.bitField0_ |= 8;
            this.sourcePlayerLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSourcePlayerLv() {
            this.bitField0_ &= -9;
            this.sourcePlayerLv_ = 0;
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

   public static final class S2CR_PlayerDetailInfoForCross_11708 extends GeneratedMessageV3 implements S2CR_PlayerDetailInfoForCross_11708OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DESTSERVERID_FIELD_NUMBER = 1;
      private int destServerId_;
      public static final int DESTPLAYERID_FIELD_NUMBER = 2;
      private int destPlayerId_;
      public static final int ARRAYING_FIELD_NUMBER = 3;
      private int arraying_;
      private byte memoizedIsInitialized;
      private static final S2CR_PlayerDetailInfoForCross_11708 DEFAULT_INSTANCE = new S2CR_PlayerDetailInfoForCross_11708();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_PlayerDetailInfoForCross_11708> PARSER = new AbstractParser<S2CR_PlayerDetailInfoForCross_11708>() {
         public S2CR_PlayerDetailInfoForCross_11708 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_PlayerDetailInfoForCross_11708(input, extensionRegistry);
         }
      };

      private S2CR_PlayerDetailInfoForCross_11708(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_PlayerDetailInfoForCross_11708() {
         this.memoizedIsInitialized = -1;
         this.arraying_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_PlayerDetailInfoForCross_11708();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_PlayerDetailInfoForCross_11708(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.destServerId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.destPlayerId_ = input.readInt32();
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfoForCross_11708_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfoForCross_11708_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerDetailInfoForCross_11708.class, Builder.class);
      }

      public boolean hasDestServerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDestServerId() {
         return this.destServerId_;
      }

      public boolean hasDestPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDestPlayerId() {
         return this.destPlayerId_;
      }

      public boolean hasArraying() {
         return (this.bitField0_ & 4) != 0;
      }

      public CommonMsg.HeroState getArraying() {
         CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arraying_);
         return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDestServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDestPlayerId()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.destServerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.destPlayerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeEnum(3, this.arraying_);
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
               size += CodedOutputStream.computeInt32Size(1, this.destServerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.destPlayerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeEnumSize(3, this.arraying_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_PlayerDetailInfoForCross_11708)) {
            return super.equals(obj);
         } else {
            S2CR_PlayerDetailInfoForCross_11708 other = (S2CR_PlayerDetailInfoForCross_11708)obj;
            if (this.hasDestServerId() != other.hasDestServerId()) {
               return false;
            } else if (this.hasDestServerId() && this.getDestServerId() != other.getDestServerId()) {
               return false;
            } else if (this.hasDestPlayerId() != other.hasDestPlayerId()) {
               return false;
            } else if (this.hasDestPlayerId() && this.getDestPlayerId() != other.getDestPlayerId()) {
               return false;
            } else if (this.hasArraying() != other.hasArraying()) {
               return false;
            } else if (this.hasArraying() && this.arraying_ != other.arraying_) {
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
            if (this.hasDestServerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDestServerId();
            }

            if (this.hasDestPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDestPlayerId();
            }

            if (this.hasArraying()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.arraying_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_PlayerDetailInfoForCross_11708 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerDetailInfoForCross_11708)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerDetailInfoForCross_11708 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerDetailInfoForCross_11708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerDetailInfoForCross_11708 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerDetailInfoForCross_11708)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerDetailInfoForCross_11708 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerDetailInfoForCross_11708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerDetailInfoForCross_11708 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerDetailInfoForCross_11708)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerDetailInfoForCross_11708 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerDetailInfoForCross_11708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerDetailInfoForCross_11708 parseFrom(InputStream input) throws IOException {
         return (S2CR_PlayerDetailInfoForCross_11708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerDetailInfoForCross_11708 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerDetailInfoForCross_11708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerDetailInfoForCross_11708 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_PlayerDetailInfoForCross_11708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_PlayerDetailInfoForCross_11708 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerDetailInfoForCross_11708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerDetailInfoForCross_11708 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_PlayerDetailInfoForCross_11708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerDetailInfoForCross_11708 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerDetailInfoForCross_11708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_PlayerDetailInfoForCross_11708 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_PlayerDetailInfoForCross_11708 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_PlayerDetailInfoForCross_11708> parser() {
         return PARSER;
      }

      public Parser<S2CR_PlayerDetailInfoForCross_11708> getParserForType() {
         return PARSER;
      }

      public S2CR_PlayerDetailInfoForCross_11708 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_PlayerDetailInfoForCross_11708OrBuilder {
         private int bitField0_;
         private int destServerId_;
         private int destPlayerId_;
         private int arraying_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfoForCross_11708_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfoForCross_11708_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerDetailInfoForCross_11708.class, Builder.class);
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
            if (CrossChatMsg.S2CR_PlayerDetailInfoForCross_11708.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.destServerId_ = 0;
            this.bitField0_ &= -2;
            this.destPlayerId_ = 0;
            this.bitField0_ &= -3;
            this.arraying_ = 1;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerDetailInfoForCross_11708_descriptor;
         }

         public S2CR_PlayerDetailInfoForCross_11708 getDefaultInstanceForType() {
            return CrossChatMsg.S2CR_PlayerDetailInfoForCross_11708.getDefaultInstance();
         }

         public S2CR_PlayerDetailInfoForCross_11708 build() {
            S2CR_PlayerDetailInfoForCross_11708 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_PlayerDetailInfoForCross_11708 buildPartial() {
            S2CR_PlayerDetailInfoForCross_11708 result = new S2CR_PlayerDetailInfoForCross_11708(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.destServerId_ = this.destServerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.destPlayerId_ = this.destPlayerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
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
            if (other instanceof S2CR_PlayerDetailInfoForCross_11708) {
               return this.mergeFrom((S2CR_PlayerDetailInfoForCross_11708)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_PlayerDetailInfoForCross_11708 other) {
            if (other == CrossChatMsg.S2CR_PlayerDetailInfoForCross_11708.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDestServerId()) {
                  this.setDestServerId(other.getDestServerId());
               }

               if (other.hasDestPlayerId()) {
                  this.setDestPlayerId(other.getDestPlayerId());
               }

               if (other.hasArraying()) {
                  this.setArraying(other.getArraying());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDestServerId()) {
               return false;
            } else if (!this.hasDestPlayerId()) {
               return false;
            } else {
               return this.hasArraying();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_PlayerDetailInfoForCross_11708 parsedMessage = null;

            try {
               parsedMessage = (S2CR_PlayerDetailInfoForCross_11708)CrossChatMsg.S2CR_PlayerDetailInfoForCross_11708.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_PlayerDetailInfoForCross_11708)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDestServerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDestServerId() {
            return this.destServerId_;
         }

         public Builder setDestServerId(int value) {
            this.bitField0_ |= 1;
            this.destServerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDestServerId() {
            this.bitField0_ &= -2;
            this.destServerId_ = 0;
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_FightToPlayer_11715 extends GeneratedMessageV3 implements S2CR_FightToPlayer_11715OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DEFSERVERID_FIELD_NUMBER = 1;
      private int defServerId_;
      public static final int DEFPLAYERID_FIELD_NUMBER = 2;
      private int defPlayerId_;
      public static final int ATKPLAYERINFO_FIELD_NUMBER = 3;
      private CommonMsg.PlayerInfo atkPlayerInfo_;
      public static final int HEROARRAYINGDATA_FIELD_NUMBER = 4;
      private ByteString heroArrayingData_;
      private byte memoizedIsInitialized;
      private static final S2CR_FightToPlayer_11715 DEFAULT_INSTANCE = new S2CR_FightToPlayer_11715();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_FightToPlayer_11715> PARSER = new AbstractParser<S2CR_FightToPlayer_11715>() {
         public S2CR_FightToPlayer_11715 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_FightToPlayer_11715(input, extensionRegistry);
         }
      };

      private S2CR_FightToPlayer_11715(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_FightToPlayer_11715() {
         this.memoizedIsInitialized = -1;
         this.heroArrayingData_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_FightToPlayer_11715();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_FightToPlayer_11715(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.defServerId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.defPlayerId_ = input.readInt32();
                        break;
                     case 26:
                        CommonMsg.PlayerInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.atkPlayerInfo_.toBuilder();
                        }

                        this.atkPlayerInfo_ = (CommonMsg.PlayerInfo)input.readMessage(CommonMsg.PlayerInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.atkPlayerInfo_);
                           this.atkPlayerInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4;
                        break;
                     case 34:
                        this.bitField0_ |= 8;
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
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_FightToPlayer_11715_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_FightToPlayer_11715_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_FightToPlayer_11715.class, Builder.class);
      }

      public boolean hasDefServerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDefServerId() {
         return this.defServerId_;
      }

      public boolean hasDefPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDefPlayerId() {
         return this.defPlayerId_;
      }

      public boolean hasAtkPlayerInfo() {
         return (this.bitField0_ & 4) != 0;
      }

      public CommonMsg.PlayerInfo getAtkPlayerInfo() {
         return this.atkPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.atkPlayerInfo_;
      }

      public CommonMsg.PlayerInfoOrBuilder getAtkPlayerInfoOrBuilder() {
         return this.atkPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.atkPlayerInfo_;
      }

      public boolean hasHeroArrayingData() {
         return (this.bitField0_ & 8) != 0;
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
         } else if (!this.hasDefServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDefPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAtkPlayerInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroArrayingData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getAtkPlayerInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.defServerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.defPlayerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(3, this.getAtkPlayerInfo());
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBytes(4, this.heroArrayingData_);
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
               size += CodedOutputStream.computeInt32Size(1, this.defServerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.defPlayerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getAtkPlayerInfo());
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBytesSize(4, this.heroArrayingData_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_FightToPlayer_11715)) {
            return super.equals(obj);
         } else {
            S2CR_FightToPlayer_11715 other = (S2CR_FightToPlayer_11715)obj;
            if (this.hasDefServerId() != other.hasDefServerId()) {
               return false;
            } else if (this.hasDefServerId() && this.getDefServerId() != other.getDefServerId()) {
               return false;
            } else if (this.hasDefPlayerId() != other.hasDefPlayerId()) {
               return false;
            } else if (this.hasDefPlayerId() && this.getDefPlayerId() != other.getDefPlayerId()) {
               return false;
            } else if (this.hasAtkPlayerInfo() != other.hasAtkPlayerInfo()) {
               return false;
            } else if (this.hasAtkPlayerInfo() && !this.getAtkPlayerInfo().equals(other.getAtkPlayerInfo())) {
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
            if (this.hasDefServerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDefServerId();
            }

            if (this.hasDefPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDefPlayerId();
            }

            if (this.hasAtkPlayerInfo()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getAtkPlayerInfo().hashCode();
            }

            if (this.hasHeroArrayingData()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHeroArrayingData().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_FightToPlayer_11715 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_FightToPlayer_11715)PARSER.parseFrom(data);
      }

      public static S2CR_FightToPlayer_11715 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_FightToPlayer_11715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_FightToPlayer_11715 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_FightToPlayer_11715)PARSER.parseFrom(data);
      }

      public static S2CR_FightToPlayer_11715 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_FightToPlayer_11715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_FightToPlayer_11715 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_FightToPlayer_11715)PARSER.parseFrom(data);
      }

      public static S2CR_FightToPlayer_11715 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_FightToPlayer_11715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_FightToPlayer_11715 parseFrom(InputStream input) throws IOException {
         return (S2CR_FightToPlayer_11715)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_FightToPlayer_11715 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_FightToPlayer_11715)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_FightToPlayer_11715 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_FightToPlayer_11715)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_FightToPlayer_11715 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_FightToPlayer_11715)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_FightToPlayer_11715 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_FightToPlayer_11715)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_FightToPlayer_11715 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_FightToPlayer_11715)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_FightToPlayer_11715 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_FightToPlayer_11715 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_FightToPlayer_11715> parser() {
         return PARSER;
      }

      public Parser<S2CR_FightToPlayer_11715> getParserForType() {
         return PARSER;
      }

      public S2CR_FightToPlayer_11715 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_FightToPlayer_11715OrBuilder {
         private int bitField0_;
         private int defServerId_;
         private int defPlayerId_;
         private CommonMsg.PlayerInfo atkPlayerInfo_;
         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> atkPlayerInfoBuilder_;
         private ByteString heroArrayingData_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_FightToPlayer_11715_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_FightToPlayer_11715_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_FightToPlayer_11715.class, Builder.class);
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
            if (CrossChatMsg.S2CR_FightToPlayer_11715.alwaysUseFieldBuilders) {
               this.getAtkPlayerInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.defServerId_ = 0;
            this.bitField0_ &= -2;
            this.defPlayerId_ = 0;
            this.bitField0_ &= -3;
            if (this.atkPlayerInfoBuilder_ == null) {
               this.atkPlayerInfo_ = null;
            } else {
               this.atkPlayerInfoBuilder_.clear();
            }

            this.bitField0_ &= -5;
            this.heroArrayingData_ = ByteString.EMPTY;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_FightToPlayer_11715_descriptor;
         }

         public S2CR_FightToPlayer_11715 getDefaultInstanceForType() {
            return CrossChatMsg.S2CR_FightToPlayer_11715.getDefaultInstance();
         }

         public S2CR_FightToPlayer_11715 build() {
            S2CR_FightToPlayer_11715 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_FightToPlayer_11715 buildPartial() {
            S2CR_FightToPlayer_11715 result = new S2CR_FightToPlayer_11715(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.defServerId_ = this.defServerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.defPlayerId_ = this.defPlayerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.atkPlayerInfoBuilder_ == null) {
                  result.atkPlayerInfo_ = this.atkPlayerInfo_;
               } else {
                  result.atkPlayerInfo_ = (CommonMsg.PlayerInfo)this.atkPlayerInfoBuilder_.build();
               }

               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
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
            if (other instanceof S2CR_FightToPlayer_11715) {
               return this.mergeFrom((S2CR_FightToPlayer_11715)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_FightToPlayer_11715 other) {
            if (other == CrossChatMsg.S2CR_FightToPlayer_11715.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDefServerId()) {
                  this.setDefServerId(other.getDefServerId());
               }

               if (other.hasDefPlayerId()) {
                  this.setDefPlayerId(other.getDefPlayerId());
               }

               if (other.hasAtkPlayerInfo()) {
                  this.mergeAtkPlayerInfo(other.getAtkPlayerInfo());
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
            if (!this.hasDefServerId()) {
               return false;
            } else if (!this.hasDefPlayerId()) {
               return false;
            } else if (!this.hasAtkPlayerInfo()) {
               return false;
            } else if (!this.hasHeroArrayingData()) {
               return false;
            } else {
               return this.getAtkPlayerInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_FightToPlayer_11715 parsedMessage = null;

            try {
               parsedMessage = (S2CR_FightToPlayer_11715)CrossChatMsg.S2CR_FightToPlayer_11715.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_FightToPlayer_11715)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDefServerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDefServerId() {
            return this.defServerId_;
         }

         public Builder setDefServerId(int value) {
            this.bitField0_ |= 1;
            this.defServerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDefServerId() {
            this.bitField0_ &= -2;
            this.defServerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDefPlayerId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDefPlayerId() {
            return this.defPlayerId_;
         }

         public Builder setDefPlayerId(int value) {
            this.bitField0_ |= 2;
            this.defPlayerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDefPlayerId() {
            this.bitField0_ &= -3;
            this.defPlayerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAtkPlayerInfo() {
            return (this.bitField0_ & 4) != 0;
         }

         public CommonMsg.PlayerInfo getAtkPlayerInfo() {
            if (this.atkPlayerInfoBuilder_ == null) {
               return this.atkPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.atkPlayerInfo_;
            } else {
               return (CommonMsg.PlayerInfo)this.atkPlayerInfoBuilder_.getMessage();
            }
         }

         public Builder setAtkPlayerInfo(CommonMsg.PlayerInfo value) {
            if (this.atkPlayerInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.atkPlayerInfo_ = value;
               this.onChanged();
            } else {
               this.atkPlayerInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setAtkPlayerInfo(CommonMsg.PlayerInfo.Builder builderForValue) {
            if (this.atkPlayerInfoBuilder_ == null) {
               this.atkPlayerInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.atkPlayerInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeAtkPlayerInfo(CommonMsg.PlayerInfo value) {
            if (this.atkPlayerInfoBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.atkPlayerInfo_ != null && this.atkPlayerInfo_ != CommonMsg.PlayerInfo.getDefaultInstance()) {
                  this.atkPlayerInfo_ = CommonMsg.PlayerInfo.newBuilder(this.atkPlayerInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.atkPlayerInfo_ = value;
               }

               this.onChanged();
            } else {
               this.atkPlayerInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearAtkPlayerInfo() {
            if (this.atkPlayerInfoBuilder_ == null) {
               this.atkPlayerInfo_ = null;
               this.onChanged();
            } else {
               this.atkPlayerInfoBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public CommonMsg.PlayerInfo.Builder getAtkPlayerInfoBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (CommonMsg.PlayerInfo.Builder)this.getAtkPlayerInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.PlayerInfoOrBuilder getAtkPlayerInfoOrBuilder() {
            if (this.atkPlayerInfoBuilder_ != null) {
               return (CommonMsg.PlayerInfoOrBuilder)this.atkPlayerInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.atkPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.atkPlayerInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> getAtkPlayerInfoFieldBuilder() {
            if (this.atkPlayerInfoBuilder_ == null) {
               this.atkPlayerInfoBuilder_ = new SingleFieldBuilderV3(this.getAtkPlayerInfo(), this.getParentForChildren(), this.isClean());
               this.atkPlayerInfo_ = null;
            }

            return this.atkPlayerInfoBuilder_;
         }

         public boolean hasHeroArrayingData() {
            return (this.bitField0_ & 8) != 0;
         }

         public ByteString getHeroArrayingData() {
            return this.heroArrayingData_;
         }

         public Builder setHeroArrayingData(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.heroArrayingData_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearHeroArrayingData() {
            this.bitField0_ &= -9;
            this.heroArrayingData_ = CrossChatMsg.S2CR_FightToPlayer_11715.getDefaultInstance().getHeroArrayingData();
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

   public static final class CR2S_FightToPlayer_11716 extends GeneratedMessageV3 implements CR2S_FightToPlayer_11716OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ATKPLAYERINFO_FIELD_NUMBER = 1;
      private CommonMsg.PlayerInfo atkPlayerInfo_;
      public static final int HEROARRAYINGDATA_FIELD_NUMBER = 2;
      private ByteString heroArrayingData_;
      private byte memoizedIsInitialized;
      private static final CR2S_FightToPlayer_11716 DEFAULT_INSTANCE = new CR2S_FightToPlayer_11716();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_FightToPlayer_11716> PARSER = new AbstractParser<CR2S_FightToPlayer_11716>() {
         public CR2S_FightToPlayer_11716 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_FightToPlayer_11716(input, extensionRegistry);
         }
      };

      private CR2S_FightToPlayer_11716(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_FightToPlayer_11716() {
         this.memoizedIsInitialized = -1;
         this.heroArrayingData_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_FightToPlayer_11716();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_FightToPlayer_11716(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           subBuilder = this.atkPlayerInfo_.toBuilder();
                        }

                        this.atkPlayerInfo_ = (CommonMsg.PlayerInfo)input.readMessage(CommonMsg.PlayerInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.atkPlayerInfo_);
                           this.atkPlayerInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        this.bitField0_ |= 2;
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
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_FightToPlayer_11716_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_FightToPlayer_11716_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_FightToPlayer_11716.class, Builder.class);
      }

      public boolean hasAtkPlayerInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.PlayerInfo getAtkPlayerInfo() {
         return this.atkPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.atkPlayerInfo_;
      }

      public CommonMsg.PlayerInfoOrBuilder getAtkPlayerInfoOrBuilder() {
         return this.atkPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.atkPlayerInfo_;
      }

      public boolean hasHeroArrayingData() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasAtkPlayerInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroArrayingData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getAtkPlayerInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getAtkPlayerInfo());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBytes(2, this.heroArrayingData_);
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
               size += CodedOutputStream.computeMessageSize(1, this.getAtkPlayerInfo());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBytesSize(2, this.heroArrayingData_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_FightToPlayer_11716)) {
            return super.equals(obj);
         } else {
            CR2S_FightToPlayer_11716 other = (CR2S_FightToPlayer_11716)obj;
            if (this.hasAtkPlayerInfo() != other.hasAtkPlayerInfo()) {
               return false;
            } else if (this.hasAtkPlayerInfo() && !this.getAtkPlayerInfo().equals(other.getAtkPlayerInfo())) {
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
            if (this.hasAtkPlayerInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAtkPlayerInfo().hashCode();
            }

            if (this.hasHeroArrayingData()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroArrayingData().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_FightToPlayer_11716 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_FightToPlayer_11716)PARSER.parseFrom(data);
      }

      public static CR2S_FightToPlayer_11716 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_FightToPlayer_11716)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_FightToPlayer_11716 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_FightToPlayer_11716)PARSER.parseFrom(data);
      }

      public static CR2S_FightToPlayer_11716 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_FightToPlayer_11716)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_FightToPlayer_11716 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_FightToPlayer_11716)PARSER.parseFrom(data);
      }

      public static CR2S_FightToPlayer_11716 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_FightToPlayer_11716)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_FightToPlayer_11716 parseFrom(InputStream input) throws IOException {
         return (CR2S_FightToPlayer_11716)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_FightToPlayer_11716 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_FightToPlayer_11716)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_FightToPlayer_11716 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_FightToPlayer_11716)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_FightToPlayer_11716 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_FightToPlayer_11716)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_FightToPlayer_11716 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_FightToPlayer_11716)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_FightToPlayer_11716 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_FightToPlayer_11716)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_FightToPlayer_11716 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_FightToPlayer_11716 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_FightToPlayer_11716> parser() {
         return PARSER;
      }

      public Parser<CR2S_FightToPlayer_11716> getParserForType() {
         return PARSER;
      }

      public CR2S_FightToPlayer_11716 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_FightToPlayer_11716OrBuilder {
         private int bitField0_;
         private CommonMsg.PlayerInfo atkPlayerInfo_;
         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> atkPlayerInfoBuilder_;
         private ByteString heroArrayingData_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_FightToPlayer_11716_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_FightToPlayer_11716_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_FightToPlayer_11716.class, Builder.class);
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
            if (CrossChatMsg.CR2S_FightToPlayer_11716.alwaysUseFieldBuilders) {
               this.getAtkPlayerInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.atkPlayerInfoBuilder_ == null) {
               this.atkPlayerInfo_ = null;
            } else {
               this.atkPlayerInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.heroArrayingData_ = ByteString.EMPTY;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_FightToPlayer_11716_descriptor;
         }

         public CR2S_FightToPlayer_11716 getDefaultInstanceForType() {
            return CrossChatMsg.CR2S_FightToPlayer_11716.getDefaultInstance();
         }

         public CR2S_FightToPlayer_11716 build() {
            CR2S_FightToPlayer_11716 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_FightToPlayer_11716 buildPartial() {
            CR2S_FightToPlayer_11716 result = new CR2S_FightToPlayer_11716(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.atkPlayerInfoBuilder_ == null) {
                  result.atkPlayerInfo_ = this.atkPlayerInfo_;
               } else {
                  result.atkPlayerInfo_ = (CommonMsg.PlayerInfo)this.atkPlayerInfoBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
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
            if (other instanceof CR2S_FightToPlayer_11716) {
               return this.mergeFrom((CR2S_FightToPlayer_11716)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_FightToPlayer_11716 other) {
            if (other == CrossChatMsg.CR2S_FightToPlayer_11716.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasAtkPlayerInfo()) {
                  this.mergeAtkPlayerInfo(other.getAtkPlayerInfo());
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
            if (!this.hasAtkPlayerInfo()) {
               return false;
            } else if (!this.hasHeroArrayingData()) {
               return false;
            } else {
               return this.getAtkPlayerInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_FightToPlayer_11716 parsedMessage = null;

            try {
               parsedMessage = (CR2S_FightToPlayer_11716)CrossChatMsg.CR2S_FightToPlayer_11716.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_FightToPlayer_11716)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasAtkPlayerInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public CommonMsg.PlayerInfo getAtkPlayerInfo() {
            if (this.atkPlayerInfoBuilder_ == null) {
               return this.atkPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.atkPlayerInfo_;
            } else {
               return (CommonMsg.PlayerInfo)this.atkPlayerInfoBuilder_.getMessage();
            }
         }

         public Builder setAtkPlayerInfo(CommonMsg.PlayerInfo value) {
            if (this.atkPlayerInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.atkPlayerInfo_ = value;
               this.onChanged();
            } else {
               this.atkPlayerInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setAtkPlayerInfo(CommonMsg.PlayerInfo.Builder builderForValue) {
            if (this.atkPlayerInfoBuilder_ == null) {
               this.atkPlayerInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.atkPlayerInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeAtkPlayerInfo(CommonMsg.PlayerInfo value) {
            if (this.atkPlayerInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.atkPlayerInfo_ != null && this.atkPlayerInfo_ != CommonMsg.PlayerInfo.getDefaultInstance()) {
                  this.atkPlayerInfo_ = CommonMsg.PlayerInfo.newBuilder(this.atkPlayerInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.atkPlayerInfo_ = value;
               }

               this.onChanged();
            } else {
               this.atkPlayerInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearAtkPlayerInfo() {
            if (this.atkPlayerInfoBuilder_ == null) {
               this.atkPlayerInfo_ = null;
               this.onChanged();
            } else {
               this.atkPlayerInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public CommonMsg.PlayerInfo.Builder getAtkPlayerInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (CommonMsg.PlayerInfo.Builder)this.getAtkPlayerInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.PlayerInfoOrBuilder getAtkPlayerInfoOrBuilder() {
            if (this.atkPlayerInfoBuilder_ != null) {
               return (CommonMsg.PlayerInfoOrBuilder)this.atkPlayerInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.atkPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.atkPlayerInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> getAtkPlayerInfoFieldBuilder() {
            if (this.atkPlayerInfoBuilder_ == null) {
               this.atkPlayerInfoBuilder_ = new SingleFieldBuilderV3(this.getAtkPlayerInfo(), this.getParentForChildren(), this.isClean());
               this.atkPlayerInfo_ = null;
            }

            return this.atkPlayerInfoBuilder_;
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
            this.heroArrayingData_ = CrossChatMsg.CR2S_FightToPlayer_11716.getDefaultInstance().getHeroArrayingData();
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

   public static final class S2CR_FightToPlayerResult_11717 extends GeneratedMessageV3 implements S2CR_FightToPlayerResult_11717OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DESTSERVERID_FIELD_NUMBER = 1;
      private int destServerId_;
      public static final int DESTPLAYERID_FIELD_NUMBER = 2;
      private int destPlayerId_;
      public static final int BATTLEMSG_FIELD_NUMBER = 3;
      private BattleMsg.S2C_BattleResult_6102 battleMsg_;
      private byte memoizedIsInitialized;
      private static final S2CR_FightToPlayerResult_11717 DEFAULT_INSTANCE = new S2CR_FightToPlayerResult_11717();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_FightToPlayerResult_11717> PARSER = new AbstractParser<S2CR_FightToPlayerResult_11717>() {
         public S2CR_FightToPlayerResult_11717 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_FightToPlayerResult_11717(input, extensionRegistry);
         }
      };

      private S2CR_FightToPlayerResult_11717(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_FightToPlayerResult_11717() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_FightToPlayerResult_11717();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_FightToPlayerResult_11717(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.destServerId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.destPlayerId_ = input.readInt32();
                        break;
                     case 26:
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.battleMsg_.toBuilder();
                        }

                        this.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.battleMsg_);
                           this.battleMsg_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_FightToPlayerResult_11717_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_FightToPlayerResult_11717_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_FightToPlayerResult_11717.class, Builder.class);
      }

      public boolean hasDestServerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDestServerId() {
         return this.destServerId_;
      }

      public boolean hasDestPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDestPlayerId() {
         return this.destPlayerId_;
      }

      public boolean hasBattleMsg() {
         return (this.bitField0_ & 4) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getBattleMsg() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDestServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDestPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBattleMsg()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getBattleMsg().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.destServerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.destPlayerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(3, this.getBattleMsg());
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
               size += CodedOutputStream.computeInt32Size(1, this.destServerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.destPlayerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getBattleMsg());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_FightToPlayerResult_11717)) {
            return super.equals(obj);
         } else {
            S2CR_FightToPlayerResult_11717 other = (S2CR_FightToPlayerResult_11717)obj;
            if (this.hasDestServerId() != other.hasDestServerId()) {
               return false;
            } else if (this.hasDestServerId() && this.getDestServerId() != other.getDestServerId()) {
               return false;
            } else if (this.hasDestPlayerId() != other.hasDestPlayerId()) {
               return false;
            } else if (this.hasDestPlayerId() && this.getDestPlayerId() != other.getDestPlayerId()) {
               return false;
            } else if (this.hasBattleMsg() != other.hasBattleMsg()) {
               return false;
            } else if (this.hasBattleMsg() && !this.getBattleMsg().equals(other.getBattleMsg())) {
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
            if (this.hasDestServerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDestServerId();
            }

            if (this.hasDestPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDestPlayerId();
            }

            if (this.hasBattleMsg()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBattleMsg().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_FightToPlayerResult_11717 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_FightToPlayerResult_11717)PARSER.parseFrom(data);
      }

      public static S2CR_FightToPlayerResult_11717 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_FightToPlayerResult_11717)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_FightToPlayerResult_11717 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_FightToPlayerResult_11717)PARSER.parseFrom(data);
      }

      public static S2CR_FightToPlayerResult_11717 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_FightToPlayerResult_11717)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_FightToPlayerResult_11717 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_FightToPlayerResult_11717)PARSER.parseFrom(data);
      }

      public static S2CR_FightToPlayerResult_11717 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_FightToPlayerResult_11717)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_FightToPlayerResult_11717 parseFrom(InputStream input) throws IOException {
         return (S2CR_FightToPlayerResult_11717)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_FightToPlayerResult_11717 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_FightToPlayerResult_11717)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_FightToPlayerResult_11717 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_FightToPlayerResult_11717)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_FightToPlayerResult_11717 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_FightToPlayerResult_11717)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_FightToPlayerResult_11717 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_FightToPlayerResult_11717)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_FightToPlayerResult_11717 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_FightToPlayerResult_11717)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_FightToPlayerResult_11717 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_FightToPlayerResult_11717 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_FightToPlayerResult_11717> parser() {
         return PARSER;
      }

      public Parser<S2CR_FightToPlayerResult_11717> getParserForType() {
         return PARSER;
      }

      public S2CR_FightToPlayerResult_11717 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_FightToPlayerResult_11717OrBuilder {
         private int bitField0_;
         private int destServerId_;
         private int destPlayerId_;
         private BattleMsg.S2C_BattleResult_6102 battleMsg_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> battleMsgBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_FightToPlayerResult_11717_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_FightToPlayerResult_11717_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_FightToPlayerResult_11717.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossChatMsg.S2CR_FightToPlayerResult_11717.alwaysUseFieldBuilders) {
               this.getBattleMsgFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.destServerId_ = 0;
            this.bitField0_ &= -2;
            this.destPlayerId_ = 0;
            this.bitField0_ &= -3;
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_FightToPlayerResult_11717_descriptor;
         }

         public S2CR_FightToPlayerResult_11717 getDefaultInstanceForType() {
            return CrossChatMsg.S2CR_FightToPlayerResult_11717.getDefaultInstance();
         }

         public S2CR_FightToPlayerResult_11717 build() {
            S2CR_FightToPlayerResult_11717 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_FightToPlayerResult_11717 buildPartial() {
            S2CR_FightToPlayerResult_11717 result = new S2CR_FightToPlayerResult_11717(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.destServerId_ = this.destServerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.destPlayerId_ = this.destPlayerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.battleMsgBuilder_ == null) {
                  result.battleMsg_ = this.battleMsg_;
               } else {
                  result.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)this.battleMsgBuilder_.build();
               }

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
            if (other instanceof S2CR_FightToPlayerResult_11717) {
               return this.mergeFrom((S2CR_FightToPlayerResult_11717)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_FightToPlayerResult_11717 other) {
            if (other == CrossChatMsg.S2CR_FightToPlayerResult_11717.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDestServerId()) {
                  this.setDestServerId(other.getDestServerId());
               }

               if (other.hasDestPlayerId()) {
                  this.setDestPlayerId(other.getDestPlayerId());
               }

               if (other.hasBattleMsg()) {
                  this.mergeBattleMsg(other.getBattleMsg());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDestServerId()) {
               return false;
            } else if (!this.hasDestPlayerId()) {
               return false;
            } else if (!this.hasBattleMsg()) {
               return false;
            } else {
               return this.getBattleMsg().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_FightToPlayerResult_11717 parsedMessage = null;

            try {
               parsedMessage = (S2CR_FightToPlayerResult_11717)CrossChatMsg.S2CR_FightToPlayerResult_11717.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_FightToPlayerResult_11717)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDestServerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDestServerId() {
            return this.destServerId_;
         }

         public Builder setDestServerId(int value) {
            this.bitField0_ |= 1;
            this.destServerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDestServerId() {
            this.bitField0_ &= -2;
            this.destServerId_ = 0;
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

         public boolean hasBattleMsg() {
            return (this.bitField0_ & 4) != 0;
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

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setBattleMsg(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = builderForValue.build();
               this.onChanged();
            } else {
               this.battleMsgBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeBattleMsg(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleMsgBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.battleMsg_ != null && this.battleMsg_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.battleMsg_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.battleMsg_).mergeFrom(value).buildPartial();
               } else {
                  this.battleMsg_ = value;
               }

               this.onChanged();
            } else {
               this.battleMsgBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearBattleMsg() {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
               this.onChanged();
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getBattleMsgBuilder() {
            this.bitField0_ |= 4;
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_FightToPlayerResult_11718 extends GeneratedMessageV3 implements CR2S_FightToPlayerResult_11718OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DEFPLAYERID_FIELD_NUMBER = 1;
      private int defPlayerId_;
      public static final int BATTLEMSG_FIELD_NUMBER = 2;
      private BattleMsg.S2C_BattleResult_6102 battleMsg_;
      private byte memoizedIsInitialized;
      private static final CR2S_FightToPlayerResult_11718 DEFAULT_INSTANCE = new CR2S_FightToPlayerResult_11718();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_FightToPlayerResult_11718> PARSER = new AbstractParser<CR2S_FightToPlayerResult_11718>() {
         public CR2S_FightToPlayerResult_11718 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_FightToPlayerResult_11718(input, extensionRegistry);
         }
      };

      private CR2S_FightToPlayerResult_11718(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_FightToPlayerResult_11718() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_FightToPlayerResult_11718();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_FightToPlayerResult_11718(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.defPlayerId_ = input.readInt32();
                        break;
                     case 18:
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.battleMsg_.toBuilder();
                        }

                        this.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.battleMsg_);
                           this.battleMsg_ = subBuilder.buildPartial();
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
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_FightToPlayerResult_11718_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_FightToPlayerResult_11718_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_FightToPlayerResult_11718.class, Builder.class);
      }

      public boolean hasDefPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDefPlayerId() {
         return this.defPlayerId_;
      }

      public boolean hasBattleMsg() {
         return (this.bitField0_ & 2) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getBattleMsg() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDefPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBattleMsg()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getBattleMsg().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.defPlayerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getBattleMsg());
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
               size += CodedOutputStream.computeInt32Size(1, this.defPlayerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getBattleMsg());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_FightToPlayerResult_11718)) {
            return super.equals(obj);
         } else {
            CR2S_FightToPlayerResult_11718 other = (CR2S_FightToPlayerResult_11718)obj;
            if (this.hasDefPlayerId() != other.hasDefPlayerId()) {
               return false;
            } else if (this.hasDefPlayerId() && this.getDefPlayerId() != other.getDefPlayerId()) {
               return false;
            } else if (this.hasBattleMsg() != other.hasBattleMsg()) {
               return false;
            } else if (this.hasBattleMsg() && !this.getBattleMsg().equals(other.getBattleMsg())) {
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
            if (this.hasDefPlayerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDefPlayerId();
            }

            if (this.hasBattleMsg()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBattleMsg().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_FightToPlayerResult_11718 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_FightToPlayerResult_11718)PARSER.parseFrom(data);
      }

      public static CR2S_FightToPlayerResult_11718 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_FightToPlayerResult_11718)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_FightToPlayerResult_11718 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_FightToPlayerResult_11718)PARSER.parseFrom(data);
      }

      public static CR2S_FightToPlayerResult_11718 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_FightToPlayerResult_11718)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_FightToPlayerResult_11718 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_FightToPlayerResult_11718)PARSER.parseFrom(data);
      }

      public static CR2S_FightToPlayerResult_11718 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_FightToPlayerResult_11718)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_FightToPlayerResult_11718 parseFrom(InputStream input) throws IOException {
         return (CR2S_FightToPlayerResult_11718)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_FightToPlayerResult_11718 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_FightToPlayerResult_11718)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_FightToPlayerResult_11718 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_FightToPlayerResult_11718)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_FightToPlayerResult_11718 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_FightToPlayerResult_11718)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_FightToPlayerResult_11718 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_FightToPlayerResult_11718)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_FightToPlayerResult_11718 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_FightToPlayerResult_11718)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_FightToPlayerResult_11718 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_FightToPlayerResult_11718 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_FightToPlayerResult_11718> parser() {
         return PARSER;
      }

      public Parser<CR2S_FightToPlayerResult_11718> getParserForType() {
         return PARSER;
      }

      public CR2S_FightToPlayerResult_11718 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_FightToPlayerResult_11718OrBuilder {
         private int bitField0_;
         private int defPlayerId_;
         private BattleMsg.S2C_BattleResult_6102 battleMsg_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> battleMsgBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_FightToPlayerResult_11718_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_FightToPlayerResult_11718_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_FightToPlayerResult_11718.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossChatMsg.CR2S_FightToPlayerResult_11718.alwaysUseFieldBuilders) {
               this.getBattleMsgFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.defPlayerId_ = 0;
            this.bitField0_ &= -2;
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_FightToPlayerResult_11718_descriptor;
         }

         public CR2S_FightToPlayerResult_11718 getDefaultInstanceForType() {
            return CrossChatMsg.CR2S_FightToPlayerResult_11718.getDefaultInstance();
         }

         public CR2S_FightToPlayerResult_11718 build() {
            CR2S_FightToPlayerResult_11718 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_FightToPlayerResult_11718 buildPartial() {
            CR2S_FightToPlayerResult_11718 result = new CR2S_FightToPlayerResult_11718(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.defPlayerId_ = this.defPlayerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.battleMsgBuilder_ == null) {
                  result.battleMsg_ = this.battleMsg_;
               } else {
                  result.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)this.battleMsgBuilder_.build();
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
            if (other instanceof CR2S_FightToPlayerResult_11718) {
               return this.mergeFrom((CR2S_FightToPlayerResult_11718)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_FightToPlayerResult_11718 other) {
            if (other == CrossChatMsg.CR2S_FightToPlayerResult_11718.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDefPlayerId()) {
                  this.setDefPlayerId(other.getDefPlayerId());
               }

               if (other.hasBattleMsg()) {
                  this.mergeBattleMsg(other.getBattleMsg());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDefPlayerId()) {
               return false;
            } else if (!this.hasBattleMsg()) {
               return false;
            } else {
               return this.getBattleMsg().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_FightToPlayerResult_11718 parsedMessage = null;

            try {
               parsedMessage = (CR2S_FightToPlayerResult_11718)CrossChatMsg.CR2S_FightToPlayerResult_11718.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_FightToPlayerResult_11718)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDefPlayerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDefPlayerId() {
            return this.defPlayerId_;
         }

         public Builder setDefPlayerId(int value) {
            this.bitField0_ |= 1;
            this.defPlayerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDefPlayerId() {
            this.bitField0_ &= -2;
            this.defPlayerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBattleMsg() {
            return (this.bitField0_ & 2) != 0;
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

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setBattleMsg(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = builderForValue.build();
               this.onChanged();
            } else {
               this.battleMsgBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeBattleMsg(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleMsgBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.battleMsg_ != null && this.battleMsg_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.battleMsg_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.battleMsg_).mergeFrom(value).buildPartial();
               } else {
                  this.battleMsg_ = value;
               }

               this.onChanged();
            } else {
               this.battleMsgBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearBattleMsg() {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
               this.onChanged();
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getBattleMsgBuilder() {
            this.bitField0_ |= 2;
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_PlayerBeautyInfo_11719 extends GeneratedMessageV3 implements S2CR_PlayerBeautyInfo_11719OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BEAUTYID_FIELD_NUMBER = 1;
      private int beautyId_;
      private byte memoizedIsInitialized;
      private static final S2CR_PlayerBeautyInfo_11719 DEFAULT_INSTANCE = new S2CR_PlayerBeautyInfo_11719();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_PlayerBeautyInfo_11719> PARSER = new AbstractParser<S2CR_PlayerBeautyInfo_11719>() {
         public S2CR_PlayerBeautyInfo_11719 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_PlayerBeautyInfo_11719(input, extensionRegistry);
         }
      };

      private S2CR_PlayerBeautyInfo_11719(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_PlayerBeautyInfo_11719() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_PlayerBeautyInfo_11719();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_PlayerBeautyInfo_11719(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.beautyId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerBeautyInfo_11719_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerBeautyInfo_11719_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerBeautyInfo_11719.class, Builder.class);
      }

      public boolean hasBeautyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBeautyId() {
         return this.beautyId_;
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
            output.writeInt32(1, this.beautyId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.beautyId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_PlayerBeautyInfo_11719)) {
            return super.equals(obj);
         } else {
            S2CR_PlayerBeautyInfo_11719 other = (S2CR_PlayerBeautyInfo_11719)obj;
            if (this.hasBeautyId() != other.hasBeautyId()) {
               return false;
            } else if (this.hasBeautyId() && this.getBeautyId() != other.getBeautyId()) {
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
            if (this.hasBeautyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBeautyId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_PlayerBeautyInfo_11719 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerBeautyInfo_11719)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerBeautyInfo_11719 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerBeautyInfo_11719)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerBeautyInfo_11719 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerBeautyInfo_11719)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerBeautyInfo_11719 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerBeautyInfo_11719)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerBeautyInfo_11719 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerBeautyInfo_11719)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerBeautyInfo_11719 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerBeautyInfo_11719)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerBeautyInfo_11719 parseFrom(InputStream input) throws IOException {
         return (S2CR_PlayerBeautyInfo_11719)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerBeautyInfo_11719 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerBeautyInfo_11719)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerBeautyInfo_11719 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_PlayerBeautyInfo_11719)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_PlayerBeautyInfo_11719 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerBeautyInfo_11719)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerBeautyInfo_11719 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_PlayerBeautyInfo_11719)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerBeautyInfo_11719 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerBeautyInfo_11719)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_PlayerBeautyInfo_11719 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_PlayerBeautyInfo_11719 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_PlayerBeautyInfo_11719> parser() {
         return PARSER;
      }

      public Parser<S2CR_PlayerBeautyInfo_11719> getParserForType() {
         return PARSER;
      }

      public S2CR_PlayerBeautyInfo_11719 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_PlayerBeautyInfo_11719OrBuilder {
         private int bitField0_;
         private int beautyId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerBeautyInfo_11719_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerBeautyInfo_11719_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerBeautyInfo_11719.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossChatMsg.S2CR_PlayerBeautyInfo_11719.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.beautyId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_PlayerBeautyInfo_11719_descriptor;
         }

         public S2CR_PlayerBeautyInfo_11719 getDefaultInstanceForType() {
            return CrossChatMsg.S2CR_PlayerBeautyInfo_11719.getDefaultInstance();
         }

         public S2CR_PlayerBeautyInfo_11719 build() {
            S2CR_PlayerBeautyInfo_11719 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_PlayerBeautyInfo_11719 buildPartial() {
            S2CR_PlayerBeautyInfo_11719 result = new S2CR_PlayerBeautyInfo_11719(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.beautyId_ = this.beautyId_;
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
            if (other instanceof S2CR_PlayerBeautyInfo_11719) {
               return this.mergeFrom((S2CR_PlayerBeautyInfo_11719)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_PlayerBeautyInfo_11719 other) {
            if (other == CrossChatMsg.S2CR_PlayerBeautyInfo_11719.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBeautyId()) {
                  this.setBeautyId(other.getBeautyId());
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
            S2CR_PlayerBeautyInfo_11719 parsedMessage = null;

            try {
               parsedMessage = (S2CR_PlayerBeautyInfo_11719)CrossChatMsg.S2CR_PlayerBeautyInfo_11719.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_PlayerBeautyInfo_11719)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBeautyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBeautyId() {
            return this.beautyId_;
         }

         public Builder setBeautyId(int value) {
            this.bitField0_ |= 1;
            this.beautyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeautyId() {
            this.bitField0_ &= -2;
            this.beautyId_ = 0;
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

   public static final class S2CR_CityChat_11721 extends GeneratedMessageV3 implements S2CR_CityChat_11721OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHATINFO_FIELD_NUMBER = 1;
      private ChatMsg.Chat_Info chatInfo_;
      private byte memoizedIsInitialized;
      private static final S2CR_CityChat_11721 DEFAULT_INSTANCE = new S2CR_CityChat_11721();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_CityChat_11721> PARSER = new AbstractParser<S2CR_CityChat_11721>() {
         public S2CR_CityChat_11721 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_CityChat_11721(input, extensionRegistry);
         }
      };

      private S2CR_CityChat_11721(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_CityChat_11721() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_CityChat_11721();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_CityChat_11721(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ChatMsg.Chat_Info.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.chatInfo_.toBuilder();
                        }

                        this.chatInfo_ = (ChatMsg.Chat_Info)input.readMessage(ChatMsg.Chat_Info.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.chatInfo_);
                           this.chatInfo_ = subBuilder.buildPartial();
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
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_CityChat_11721_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_CityChat_11721_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_CityChat_11721.class, Builder.class);
      }

      public boolean hasChatInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public ChatMsg.Chat_Info getChatInfo() {
         return this.chatInfo_ == null ? ChatMsg.Chat_Info.getDefaultInstance() : this.chatInfo_;
      }

      public ChatMsg.Chat_InfoOrBuilder getChatInfoOrBuilder() {
         return this.chatInfo_ == null ? ChatMsg.Chat_Info.getDefaultInstance() : this.chatInfo_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChatInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getChatInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getChatInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getChatInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_CityChat_11721)) {
            return super.equals(obj);
         } else {
            S2CR_CityChat_11721 other = (S2CR_CityChat_11721)obj;
            if (this.hasChatInfo() != other.hasChatInfo()) {
               return false;
            } else if (this.hasChatInfo() && !this.getChatInfo().equals(other.getChatInfo())) {
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
            if (this.hasChatInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChatInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_CityChat_11721 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_CityChat_11721)PARSER.parseFrom(data);
      }

      public static S2CR_CityChat_11721 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CityChat_11721)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CityChat_11721 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_CityChat_11721)PARSER.parseFrom(data);
      }

      public static S2CR_CityChat_11721 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CityChat_11721)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CityChat_11721 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_CityChat_11721)PARSER.parseFrom(data);
      }

      public static S2CR_CityChat_11721 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CityChat_11721)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CityChat_11721 parseFrom(InputStream input) throws IOException {
         return (S2CR_CityChat_11721)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_CityChat_11721 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CityChat_11721)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_CityChat_11721 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_CityChat_11721)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_CityChat_11721 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CityChat_11721)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_CityChat_11721 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_CityChat_11721)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_CityChat_11721 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CityChat_11721)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_CityChat_11721 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_CityChat_11721 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_CityChat_11721> parser() {
         return PARSER;
      }

      public Parser<S2CR_CityChat_11721> getParserForType() {
         return PARSER;
      }

      public S2CR_CityChat_11721 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_CityChat_11721OrBuilder {
         private int bitField0_;
         private ChatMsg.Chat_Info chatInfo_;
         private SingleFieldBuilderV3<ChatMsg.Chat_Info, ChatMsg.Chat_Info.Builder, ChatMsg.Chat_InfoOrBuilder> chatInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_CityChat_11721_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_CityChat_11721_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_CityChat_11721.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossChatMsg.S2CR_CityChat_11721.alwaysUseFieldBuilders) {
               this.getChatInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.chatInfoBuilder_ == null) {
               this.chatInfo_ = null;
            } else {
               this.chatInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_CityChat_11721_descriptor;
         }

         public S2CR_CityChat_11721 getDefaultInstanceForType() {
            return CrossChatMsg.S2CR_CityChat_11721.getDefaultInstance();
         }

         public S2CR_CityChat_11721 build() {
            S2CR_CityChat_11721 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_CityChat_11721 buildPartial() {
            S2CR_CityChat_11721 result = new S2CR_CityChat_11721(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.chatInfoBuilder_ == null) {
                  result.chatInfo_ = this.chatInfo_;
               } else {
                  result.chatInfo_ = (ChatMsg.Chat_Info)this.chatInfoBuilder_.build();
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
            if (other instanceof S2CR_CityChat_11721) {
               return this.mergeFrom((S2CR_CityChat_11721)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_CityChat_11721 other) {
            if (other == CrossChatMsg.S2CR_CityChat_11721.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChatInfo()) {
                  this.mergeChatInfo(other.getChatInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChatInfo()) {
               return false;
            } else {
               return this.getChatInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_CityChat_11721 parsedMessage = null;

            try {
               parsedMessage = (S2CR_CityChat_11721)CrossChatMsg.S2CR_CityChat_11721.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_CityChat_11721)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChatInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public ChatMsg.Chat_Info getChatInfo() {
            if (this.chatInfoBuilder_ == null) {
               return this.chatInfo_ == null ? ChatMsg.Chat_Info.getDefaultInstance() : this.chatInfo_;
            } else {
               return (ChatMsg.Chat_Info)this.chatInfoBuilder_.getMessage();
            }
         }

         public Builder setChatInfo(ChatMsg.Chat_Info value) {
            if (this.chatInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.chatInfo_ = value;
               this.onChanged();
            } else {
               this.chatInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setChatInfo(ChatMsg.Chat_Info.Builder builderForValue) {
            if (this.chatInfoBuilder_ == null) {
               this.chatInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.chatInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeChatInfo(ChatMsg.Chat_Info value) {
            if (this.chatInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.chatInfo_ != null && this.chatInfo_ != ChatMsg.Chat_Info.getDefaultInstance()) {
                  this.chatInfo_ = ChatMsg.Chat_Info.newBuilder(this.chatInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.chatInfo_ = value;
               }

               this.onChanged();
            } else {
               this.chatInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearChatInfo() {
            if (this.chatInfoBuilder_ == null) {
               this.chatInfo_ = null;
               this.onChanged();
            } else {
               this.chatInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public ChatMsg.Chat_Info.Builder getChatInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (ChatMsg.Chat_Info.Builder)this.getChatInfoFieldBuilder().getBuilder();
         }

         public ChatMsg.Chat_InfoOrBuilder getChatInfoOrBuilder() {
            if (this.chatInfoBuilder_ != null) {
               return (ChatMsg.Chat_InfoOrBuilder)this.chatInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.chatInfo_ == null ? ChatMsg.Chat_Info.getDefaultInstance() : this.chatInfo_;
            }
         }

         private SingleFieldBuilderV3<ChatMsg.Chat_Info, ChatMsg.Chat_Info.Builder, ChatMsg.Chat_InfoOrBuilder> getChatInfoFieldBuilder() {
            if (this.chatInfoBuilder_ == null) {
               this.chatInfoBuilder_ = new SingleFieldBuilderV3(this.getChatInfo(), this.getParentForChildren(), this.isClean());
               this.chatInfo_ = null;
            }

            return this.chatInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_KingOfChallenge_11723 extends GeneratedMessageV3 implements S2CR_KingOfChallenge_11723OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DEFSERVERID_FIELD_NUMBER = 1;
      private int defServerId_;
      public static final int DEFPLAYERID_FIELD_NUMBER = 2;
      private int defPlayerId_;
      public static final int ATKPLAYERINFO_FIELD_NUMBER = 3;
      private CommonMsg.PlayerInfo atkPlayerInfo_;
      public static final int HEROARRAYINGDATA_FIELD_NUMBER = 4;
      private ByteString heroArrayingData_;
      private byte memoizedIsInitialized;
      private static final S2CR_KingOfChallenge_11723 DEFAULT_INSTANCE = new S2CR_KingOfChallenge_11723();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_KingOfChallenge_11723> PARSER = new AbstractParser<S2CR_KingOfChallenge_11723>() {
         public S2CR_KingOfChallenge_11723 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_KingOfChallenge_11723(input, extensionRegistry);
         }
      };

      private S2CR_KingOfChallenge_11723(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_KingOfChallenge_11723() {
         this.memoizedIsInitialized = -1;
         this.heroArrayingData_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_KingOfChallenge_11723();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_KingOfChallenge_11723(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.defServerId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.defPlayerId_ = input.readInt32();
                        break;
                     case 26:
                        CommonMsg.PlayerInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.atkPlayerInfo_.toBuilder();
                        }

                        this.atkPlayerInfo_ = (CommonMsg.PlayerInfo)input.readMessage(CommonMsg.PlayerInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.atkPlayerInfo_);
                           this.atkPlayerInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4;
                        break;
                     case 34:
                        this.bitField0_ |= 8;
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
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_KingOfChallenge_11723_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_KingOfChallenge_11723_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_KingOfChallenge_11723.class, Builder.class);
      }

      public boolean hasDefServerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDefServerId() {
         return this.defServerId_;
      }

      public boolean hasDefPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDefPlayerId() {
         return this.defPlayerId_;
      }

      public boolean hasAtkPlayerInfo() {
         return (this.bitField0_ & 4) != 0;
      }

      public CommonMsg.PlayerInfo getAtkPlayerInfo() {
         return this.atkPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.atkPlayerInfo_;
      }

      public CommonMsg.PlayerInfoOrBuilder getAtkPlayerInfoOrBuilder() {
         return this.atkPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.atkPlayerInfo_;
      }

      public boolean hasHeroArrayingData() {
         return (this.bitField0_ & 8) != 0;
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
         } else if (!this.hasDefServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDefPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAtkPlayerInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroArrayingData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getAtkPlayerInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.defServerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.defPlayerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(3, this.getAtkPlayerInfo());
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBytes(4, this.heroArrayingData_);
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
               size += CodedOutputStream.computeInt32Size(1, this.defServerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.defPlayerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getAtkPlayerInfo());
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBytesSize(4, this.heroArrayingData_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_KingOfChallenge_11723)) {
            return super.equals(obj);
         } else {
            S2CR_KingOfChallenge_11723 other = (S2CR_KingOfChallenge_11723)obj;
            if (this.hasDefServerId() != other.hasDefServerId()) {
               return false;
            } else if (this.hasDefServerId() && this.getDefServerId() != other.getDefServerId()) {
               return false;
            } else if (this.hasDefPlayerId() != other.hasDefPlayerId()) {
               return false;
            } else if (this.hasDefPlayerId() && this.getDefPlayerId() != other.getDefPlayerId()) {
               return false;
            } else if (this.hasAtkPlayerInfo() != other.hasAtkPlayerInfo()) {
               return false;
            } else if (this.hasAtkPlayerInfo() && !this.getAtkPlayerInfo().equals(other.getAtkPlayerInfo())) {
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
            if (this.hasDefServerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDefServerId();
            }

            if (this.hasDefPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDefPlayerId();
            }

            if (this.hasAtkPlayerInfo()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getAtkPlayerInfo().hashCode();
            }

            if (this.hasHeroArrayingData()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHeroArrayingData().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_KingOfChallenge_11723 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_KingOfChallenge_11723)PARSER.parseFrom(data);
      }

      public static S2CR_KingOfChallenge_11723 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_KingOfChallenge_11723)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_KingOfChallenge_11723 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_KingOfChallenge_11723)PARSER.parseFrom(data);
      }

      public static S2CR_KingOfChallenge_11723 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_KingOfChallenge_11723)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_KingOfChallenge_11723 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_KingOfChallenge_11723)PARSER.parseFrom(data);
      }

      public static S2CR_KingOfChallenge_11723 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_KingOfChallenge_11723)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_KingOfChallenge_11723 parseFrom(InputStream input) throws IOException {
         return (S2CR_KingOfChallenge_11723)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_KingOfChallenge_11723 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_KingOfChallenge_11723)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_KingOfChallenge_11723 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_KingOfChallenge_11723)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_KingOfChallenge_11723 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_KingOfChallenge_11723)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_KingOfChallenge_11723 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_KingOfChallenge_11723)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_KingOfChallenge_11723 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_KingOfChallenge_11723)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_KingOfChallenge_11723 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_KingOfChallenge_11723 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_KingOfChallenge_11723> parser() {
         return PARSER;
      }

      public Parser<S2CR_KingOfChallenge_11723> getParserForType() {
         return PARSER;
      }

      public S2CR_KingOfChallenge_11723 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_KingOfChallenge_11723OrBuilder {
         private int bitField0_;
         private int defServerId_;
         private int defPlayerId_;
         private CommonMsg.PlayerInfo atkPlayerInfo_;
         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> atkPlayerInfoBuilder_;
         private ByteString heroArrayingData_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_KingOfChallenge_11723_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_KingOfChallenge_11723_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_KingOfChallenge_11723.class, Builder.class);
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
            if (CrossChatMsg.S2CR_KingOfChallenge_11723.alwaysUseFieldBuilders) {
               this.getAtkPlayerInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.defServerId_ = 0;
            this.bitField0_ &= -2;
            this.defPlayerId_ = 0;
            this.bitField0_ &= -3;
            if (this.atkPlayerInfoBuilder_ == null) {
               this.atkPlayerInfo_ = null;
            } else {
               this.atkPlayerInfoBuilder_.clear();
            }

            this.bitField0_ &= -5;
            this.heroArrayingData_ = ByteString.EMPTY;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_KingOfChallenge_11723_descriptor;
         }

         public S2CR_KingOfChallenge_11723 getDefaultInstanceForType() {
            return CrossChatMsg.S2CR_KingOfChallenge_11723.getDefaultInstance();
         }

         public S2CR_KingOfChallenge_11723 build() {
            S2CR_KingOfChallenge_11723 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_KingOfChallenge_11723 buildPartial() {
            S2CR_KingOfChallenge_11723 result = new S2CR_KingOfChallenge_11723(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.defServerId_ = this.defServerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.defPlayerId_ = this.defPlayerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.atkPlayerInfoBuilder_ == null) {
                  result.atkPlayerInfo_ = this.atkPlayerInfo_;
               } else {
                  result.atkPlayerInfo_ = (CommonMsg.PlayerInfo)this.atkPlayerInfoBuilder_.build();
               }

               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
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
            if (other instanceof S2CR_KingOfChallenge_11723) {
               return this.mergeFrom((S2CR_KingOfChallenge_11723)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_KingOfChallenge_11723 other) {
            if (other == CrossChatMsg.S2CR_KingOfChallenge_11723.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDefServerId()) {
                  this.setDefServerId(other.getDefServerId());
               }

               if (other.hasDefPlayerId()) {
                  this.setDefPlayerId(other.getDefPlayerId());
               }

               if (other.hasAtkPlayerInfo()) {
                  this.mergeAtkPlayerInfo(other.getAtkPlayerInfo());
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
            if (!this.hasDefServerId()) {
               return false;
            } else if (!this.hasDefPlayerId()) {
               return false;
            } else if (!this.hasAtkPlayerInfo()) {
               return false;
            } else if (!this.hasHeroArrayingData()) {
               return false;
            } else {
               return this.getAtkPlayerInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_KingOfChallenge_11723 parsedMessage = null;

            try {
               parsedMessage = (S2CR_KingOfChallenge_11723)CrossChatMsg.S2CR_KingOfChallenge_11723.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_KingOfChallenge_11723)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDefServerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDefServerId() {
            return this.defServerId_;
         }

         public Builder setDefServerId(int value) {
            this.bitField0_ |= 1;
            this.defServerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDefServerId() {
            this.bitField0_ &= -2;
            this.defServerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDefPlayerId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDefPlayerId() {
            return this.defPlayerId_;
         }

         public Builder setDefPlayerId(int value) {
            this.bitField0_ |= 2;
            this.defPlayerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDefPlayerId() {
            this.bitField0_ &= -3;
            this.defPlayerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAtkPlayerInfo() {
            return (this.bitField0_ & 4) != 0;
         }

         public CommonMsg.PlayerInfo getAtkPlayerInfo() {
            if (this.atkPlayerInfoBuilder_ == null) {
               return this.atkPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.atkPlayerInfo_;
            } else {
               return (CommonMsg.PlayerInfo)this.atkPlayerInfoBuilder_.getMessage();
            }
         }

         public Builder setAtkPlayerInfo(CommonMsg.PlayerInfo value) {
            if (this.atkPlayerInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.atkPlayerInfo_ = value;
               this.onChanged();
            } else {
               this.atkPlayerInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setAtkPlayerInfo(CommonMsg.PlayerInfo.Builder builderForValue) {
            if (this.atkPlayerInfoBuilder_ == null) {
               this.atkPlayerInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.atkPlayerInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeAtkPlayerInfo(CommonMsg.PlayerInfo value) {
            if (this.atkPlayerInfoBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.atkPlayerInfo_ != null && this.atkPlayerInfo_ != CommonMsg.PlayerInfo.getDefaultInstance()) {
                  this.atkPlayerInfo_ = CommonMsg.PlayerInfo.newBuilder(this.atkPlayerInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.atkPlayerInfo_ = value;
               }

               this.onChanged();
            } else {
               this.atkPlayerInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearAtkPlayerInfo() {
            if (this.atkPlayerInfoBuilder_ == null) {
               this.atkPlayerInfo_ = null;
               this.onChanged();
            } else {
               this.atkPlayerInfoBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public CommonMsg.PlayerInfo.Builder getAtkPlayerInfoBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (CommonMsg.PlayerInfo.Builder)this.getAtkPlayerInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.PlayerInfoOrBuilder getAtkPlayerInfoOrBuilder() {
            if (this.atkPlayerInfoBuilder_ != null) {
               return (CommonMsg.PlayerInfoOrBuilder)this.atkPlayerInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.atkPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.atkPlayerInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> getAtkPlayerInfoFieldBuilder() {
            if (this.atkPlayerInfoBuilder_ == null) {
               this.atkPlayerInfoBuilder_ = new SingleFieldBuilderV3(this.getAtkPlayerInfo(), this.getParentForChildren(), this.isClean());
               this.atkPlayerInfo_ = null;
            }

            return this.atkPlayerInfoBuilder_;
         }

         public boolean hasHeroArrayingData() {
            return (this.bitField0_ & 8) != 0;
         }

         public ByteString getHeroArrayingData() {
            return this.heroArrayingData_;
         }

         public Builder setHeroArrayingData(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.heroArrayingData_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearHeroArrayingData() {
            this.bitField0_ &= -9;
            this.heroArrayingData_ = CrossChatMsg.S2CR_KingOfChallenge_11723.getDefaultInstance().getHeroArrayingData();
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

   public static final class CR2S_KingOfChallenge_11724 extends GeneratedMessageV3 implements CR2S_KingOfChallenge_11724OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ATKPLAYERINFO_FIELD_NUMBER = 1;
      private CommonMsg.PlayerInfo atkPlayerInfo_;
      public static final int HEROARRAYINGDATA_FIELD_NUMBER = 2;
      private ByteString heroArrayingData_;
      private byte memoizedIsInitialized;
      private static final CR2S_KingOfChallenge_11724 DEFAULT_INSTANCE = new CR2S_KingOfChallenge_11724();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_KingOfChallenge_11724> PARSER = new AbstractParser<CR2S_KingOfChallenge_11724>() {
         public CR2S_KingOfChallenge_11724 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_KingOfChallenge_11724(input, extensionRegistry);
         }
      };

      private CR2S_KingOfChallenge_11724(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_KingOfChallenge_11724() {
         this.memoizedIsInitialized = -1;
         this.heroArrayingData_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_KingOfChallenge_11724();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_KingOfChallenge_11724(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           subBuilder = this.atkPlayerInfo_.toBuilder();
                        }

                        this.atkPlayerInfo_ = (CommonMsg.PlayerInfo)input.readMessage(CommonMsg.PlayerInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.atkPlayerInfo_);
                           this.atkPlayerInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        this.bitField0_ |= 2;
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
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfChallenge_11724_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfChallenge_11724_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_KingOfChallenge_11724.class, Builder.class);
      }

      public boolean hasAtkPlayerInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.PlayerInfo getAtkPlayerInfo() {
         return this.atkPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.atkPlayerInfo_;
      }

      public CommonMsg.PlayerInfoOrBuilder getAtkPlayerInfoOrBuilder() {
         return this.atkPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.atkPlayerInfo_;
      }

      public boolean hasHeroArrayingData() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasAtkPlayerInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroArrayingData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getAtkPlayerInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getAtkPlayerInfo());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBytes(2, this.heroArrayingData_);
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
               size += CodedOutputStream.computeMessageSize(1, this.getAtkPlayerInfo());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBytesSize(2, this.heroArrayingData_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_KingOfChallenge_11724)) {
            return super.equals(obj);
         } else {
            CR2S_KingOfChallenge_11724 other = (CR2S_KingOfChallenge_11724)obj;
            if (this.hasAtkPlayerInfo() != other.hasAtkPlayerInfo()) {
               return false;
            } else if (this.hasAtkPlayerInfo() && !this.getAtkPlayerInfo().equals(other.getAtkPlayerInfo())) {
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
            if (this.hasAtkPlayerInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAtkPlayerInfo().hashCode();
            }

            if (this.hasHeroArrayingData()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroArrayingData().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_KingOfChallenge_11724 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_KingOfChallenge_11724)PARSER.parseFrom(data);
      }

      public static CR2S_KingOfChallenge_11724 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_KingOfChallenge_11724)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_KingOfChallenge_11724 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_KingOfChallenge_11724)PARSER.parseFrom(data);
      }

      public static CR2S_KingOfChallenge_11724 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_KingOfChallenge_11724)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_KingOfChallenge_11724 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_KingOfChallenge_11724)PARSER.parseFrom(data);
      }

      public static CR2S_KingOfChallenge_11724 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_KingOfChallenge_11724)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_KingOfChallenge_11724 parseFrom(InputStream input) throws IOException {
         return (CR2S_KingOfChallenge_11724)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_KingOfChallenge_11724 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_KingOfChallenge_11724)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_KingOfChallenge_11724 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_KingOfChallenge_11724)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_KingOfChallenge_11724 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_KingOfChallenge_11724)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_KingOfChallenge_11724 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_KingOfChallenge_11724)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_KingOfChallenge_11724 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_KingOfChallenge_11724)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_KingOfChallenge_11724 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_KingOfChallenge_11724 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_KingOfChallenge_11724> parser() {
         return PARSER;
      }

      public Parser<CR2S_KingOfChallenge_11724> getParserForType() {
         return PARSER;
      }

      public CR2S_KingOfChallenge_11724 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_KingOfChallenge_11724OrBuilder {
         private int bitField0_;
         private CommonMsg.PlayerInfo atkPlayerInfo_;
         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> atkPlayerInfoBuilder_;
         private ByteString heroArrayingData_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfChallenge_11724_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfChallenge_11724_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_KingOfChallenge_11724.class, Builder.class);
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
            if (CrossChatMsg.CR2S_KingOfChallenge_11724.alwaysUseFieldBuilders) {
               this.getAtkPlayerInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.atkPlayerInfoBuilder_ == null) {
               this.atkPlayerInfo_ = null;
            } else {
               this.atkPlayerInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.heroArrayingData_ = ByteString.EMPTY;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfChallenge_11724_descriptor;
         }

         public CR2S_KingOfChallenge_11724 getDefaultInstanceForType() {
            return CrossChatMsg.CR2S_KingOfChallenge_11724.getDefaultInstance();
         }

         public CR2S_KingOfChallenge_11724 build() {
            CR2S_KingOfChallenge_11724 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_KingOfChallenge_11724 buildPartial() {
            CR2S_KingOfChallenge_11724 result = new CR2S_KingOfChallenge_11724(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.atkPlayerInfoBuilder_ == null) {
                  result.atkPlayerInfo_ = this.atkPlayerInfo_;
               } else {
                  result.atkPlayerInfo_ = (CommonMsg.PlayerInfo)this.atkPlayerInfoBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
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
            if (other instanceof CR2S_KingOfChallenge_11724) {
               return this.mergeFrom((CR2S_KingOfChallenge_11724)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_KingOfChallenge_11724 other) {
            if (other == CrossChatMsg.CR2S_KingOfChallenge_11724.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasAtkPlayerInfo()) {
                  this.mergeAtkPlayerInfo(other.getAtkPlayerInfo());
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
            if (!this.hasAtkPlayerInfo()) {
               return false;
            } else if (!this.hasHeroArrayingData()) {
               return false;
            } else {
               return this.getAtkPlayerInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_KingOfChallenge_11724 parsedMessage = null;

            try {
               parsedMessage = (CR2S_KingOfChallenge_11724)CrossChatMsg.CR2S_KingOfChallenge_11724.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_KingOfChallenge_11724)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasAtkPlayerInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public CommonMsg.PlayerInfo getAtkPlayerInfo() {
            if (this.atkPlayerInfoBuilder_ == null) {
               return this.atkPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.atkPlayerInfo_;
            } else {
               return (CommonMsg.PlayerInfo)this.atkPlayerInfoBuilder_.getMessage();
            }
         }

         public Builder setAtkPlayerInfo(CommonMsg.PlayerInfo value) {
            if (this.atkPlayerInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.atkPlayerInfo_ = value;
               this.onChanged();
            } else {
               this.atkPlayerInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setAtkPlayerInfo(CommonMsg.PlayerInfo.Builder builderForValue) {
            if (this.atkPlayerInfoBuilder_ == null) {
               this.atkPlayerInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.atkPlayerInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeAtkPlayerInfo(CommonMsg.PlayerInfo value) {
            if (this.atkPlayerInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.atkPlayerInfo_ != null && this.atkPlayerInfo_ != CommonMsg.PlayerInfo.getDefaultInstance()) {
                  this.atkPlayerInfo_ = CommonMsg.PlayerInfo.newBuilder(this.atkPlayerInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.atkPlayerInfo_ = value;
               }

               this.onChanged();
            } else {
               this.atkPlayerInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearAtkPlayerInfo() {
            if (this.atkPlayerInfoBuilder_ == null) {
               this.atkPlayerInfo_ = null;
               this.onChanged();
            } else {
               this.atkPlayerInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public CommonMsg.PlayerInfo.Builder getAtkPlayerInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (CommonMsg.PlayerInfo.Builder)this.getAtkPlayerInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.PlayerInfoOrBuilder getAtkPlayerInfoOrBuilder() {
            if (this.atkPlayerInfoBuilder_ != null) {
               return (CommonMsg.PlayerInfoOrBuilder)this.atkPlayerInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.atkPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.atkPlayerInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> getAtkPlayerInfoFieldBuilder() {
            if (this.atkPlayerInfoBuilder_ == null) {
               this.atkPlayerInfoBuilder_ = new SingleFieldBuilderV3(this.getAtkPlayerInfo(), this.getParentForChildren(), this.isClean());
               this.atkPlayerInfo_ = null;
            }

            return this.atkPlayerInfoBuilder_;
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
            this.heroArrayingData_ = CrossChatMsg.CR2S_KingOfChallenge_11724.getDefaultInstance().getHeroArrayingData();
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

   public static final class S2CR_KingOfChallenge_11725 extends GeneratedMessageV3 implements S2CR_KingOfChallenge_11725OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BATTLEMSG_FIELD_NUMBER = 1;
      private BattleMsg.S2C_BattleResult_6102 battleMsg_;
      public static final int ATKSERVERID_FIELD_NUMBER = 2;
      private int atkServerId_;
      public static final int ATKPLAYERID_FIELD_NUMBER = 3;
      private int atkPlayerId_;
      public static final int DEFSERVERID_FIELD_NUMBER = 4;
      private int defServerId_;
      public static final int DEFPLAYERID_FIELD_NUMBER = 5;
      private int defPlayerId_;
      private byte memoizedIsInitialized;
      private static final S2CR_KingOfChallenge_11725 DEFAULT_INSTANCE = new S2CR_KingOfChallenge_11725();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_KingOfChallenge_11725> PARSER = new AbstractParser<S2CR_KingOfChallenge_11725>() {
         public S2CR_KingOfChallenge_11725 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_KingOfChallenge_11725(input, extensionRegistry);
         }
      };

      private S2CR_KingOfChallenge_11725(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_KingOfChallenge_11725() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_KingOfChallenge_11725();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_KingOfChallenge_11725(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           subBuilder = this.battleMsg_.toBuilder();
                        }

                        this.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.battleMsg_);
                           this.battleMsg_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.atkServerId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.atkPlayerId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.defServerId_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.defPlayerId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_KingOfChallenge_11725_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_KingOfChallenge_11725_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_KingOfChallenge_11725.class, Builder.class);
      }

      public boolean hasBattleMsg() {
         return (this.bitField0_ & 1) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getBattleMsg() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public boolean hasAtkServerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getAtkServerId() {
         return this.atkServerId_;
      }

      public boolean hasAtkPlayerId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getAtkPlayerId() {
         return this.atkPlayerId_;
      }

      public boolean hasDefServerId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getDefServerId() {
         return this.defServerId_;
      }

      public boolean hasDefPlayerId() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getDefPlayerId() {
         return this.defPlayerId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBattleMsg()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAtkServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAtkPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDefServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDefPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getBattleMsg().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getBattleMsg());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.atkServerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.atkPlayerId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.defServerId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.defPlayerId_);
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
               size += CodedOutputStream.computeMessageSize(1, this.getBattleMsg());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.atkServerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.atkPlayerId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.defServerId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.defPlayerId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_KingOfChallenge_11725)) {
            return super.equals(obj);
         } else {
            S2CR_KingOfChallenge_11725 other = (S2CR_KingOfChallenge_11725)obj;
            if (this.hasBattleMsg() != other.hasBattleMsg()) {
               return false;
            } else if (this.hasBattleMsg() && !this.getBattleMsg().equals(other.getBattleMsg())) {
               return false;
            } else if (this.hasAtkServerId() != other.hasAtkServerId()) {
               return false;
            } else if (this.hasAtkServerId() && this.getAtkServerId() != other.getAtkServerId()) {
               return false;
            } else if (this.hasAtkPlayerId() != other.hasAtkPlayerId()) {
               return false;
            } else if (this.hasAtkPlayerId() && this.getAtkPlayerId() != other.getAtkPlayerId()) {
               return false;
            } else if (this.hasDefServerId() != other.hasDefServerId()) {
               return false;
            } else if (this.hasDefServerId() && this.getDefServerId() != other.getDefServerId()) {
               return false;
            } else if (this.hasDefPlayerId() != other.hasDefPlayerId()) {
               return false;
            } else if (this.hasDefPlayerId() && this.getDefPlayerId() != other.getDefPlayerId()) {
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
            if (this.hasBattleMsg()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBattleMsg().hashCode();
            }

            if (this.hasAtkServerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAtkServerId();
            }

            if (this.hasAtkPlayerId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getAtkPlayerId();
            }

            if (this.hasDefServerId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getDefServerId();
            }

            if (this.hasDefPlayerId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getDefPlayerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_KingOfChallenge_11725 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_KingOfChallenge_11725)PARSER.parseFrom(data);
      }

      public static S2CR_KingOfChallenge_11725 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_KingOfChallenge_11725)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_KingOfChallenge_11725 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_KingOfChallenge_11725)PARSER.parseFrom(data);
      }

      public static S2CR_KingOfChallenge_11725 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_KingOfChallenge_11725)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_KingOfChallenge_11725 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_KingOfChallenge_11725)PARSER.parseFrom(data);
      }

      public static S2CR_KingOfChallenge_11725 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_KingOfChallenge_11725)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_KingOfChallenge_11725 parseFrom(InputStream input) throws IOException {
         return (S2CR_KingOfChallenge_11725)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_KingOfChallenge_11725 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_KingOfChallenge_11725)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_KingOfChallenge_11725 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_KingOfChallenge_11725)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_KingOfChallenge_11725 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_KingOfChallenge_11725)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_KingOfChallenge_11725 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_KingOfChallenge_11725)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_KingOfChallenge_11725 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_KingOfChallenge_11725)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_KingOfChallenge_11725 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_KingOfChallenge_11725 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_KingOfChallenge_11725> parser() {
         return PARSER;
      }

      public Parser<S2CR_KingOfChallenge_11725> getParserForType() {
         return PARSER;
      }

      public S2CR_KingOfChallenge_11725 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_KingOfChallenge_11725OrBuilder {
         private int bitField0_;
         private BattleMsg.S2C_BattleResult_6102 battleMsg_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> battleMsgBuilder_;
         private int atkServerId_;
         private int atkPlayerId_;
         private int defServerId_;
         private int defPlayerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_KingOfChallenge_11725_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_KingOfChallenge_11725_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_KingOfChallenge_11725.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossChatMsg.S2CR_KingOfChallenge_11725.alwaysUseFieldBuilders) {
               this.getBattleMsgFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.atkServerId_ = 0;
            this.bitField0_ &= -3;
            this.atkPlayerId_ = 0;
            this.bitField0_ &= -5;
            this.defServerId_ = 0;
            this.bitField0_ &= -9;
            this.defPlayerId_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_KingOfChallenge_11725_descriptor;
         }

         public S2CR_KingOfChallenge_11725 getDefaultInstanceForType() {
            return CrossChatMsg.S2CR_KingOfChallenge_11725.getDefaultInstance();
         }

         public S2CR_KingOfChallenge_11725 build() {
            S2CR_KingOfChallenge_11725 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_KingOfChallenge_11725 buildPartial() {
            S2CR_KingOfChallenge_11725 result = new S2CR_KingOfChallenge_11725(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.battleMsgBuilder_ == null) {
                  result.battleMsg_ = this.battleMsg_;
               } else {
                  result.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)this.battleMsgBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.atkServerId_ = this.atkServerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.atkPlayerId_ = this.atkPlayerId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.defServerId_ = this.defServerId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.defPlayerId_ = this.defPlayerId_;
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
            if (other instanceof S2CR_KingOfChallenge_11725) {
               return this.mergeFrom((S2CR_KingOfChallenge_11725)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_KingOfChallenge_11725 other) {
            if (other == CrossChatMsg.S2CR_KingOfChallenge_11725.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBattleMsg()) {
                  this.mergeBattleMsg(other.getBattleMsg());
               }

               if (other.hasAtkServerId()) {
                  this.setAtkServerId(other.getAtkServerId());
               }

               if (other.hasAtkPlayerId()) {
                  this.setAtkPlayerId(other.getAtkPlayerId());
               }

               if (other.hasDefServerId()) {
                  this.setDefServerId(other.getDefServerId());
               }

               if (other.hasDefPlayerId()) {
                  this.setDefPlayerId(other.getDefPlayerId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBattleMsg()) {
               return false;
            } else if (!this.hasAtkServerId()) {
               return false;
            } else if (!this.hasAtkPlayerId()) {
               return false;
            } else if (!this.hasDefServerId()) {
               return false;
            } else if (!this.hasDefPlayerId()) {
               return false;
            } else {
               return this.getBattleMsg().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_KingOfChallenge_11725 parsedMessage = null;

            try {
               parsedMessage = (S2CR_KingOfChallenge_11725)CrossChatMsg.S2CR_KingOfChallenge_11725.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_KingOfChallenge_11725)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBattleMsg() {
            return (this.bitField0_ & 1) != 0;
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

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setBattleMsg(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = builderForValue.build();
               this.onChanged();
            } else {
               this.battleMsgBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeBattleMsg(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleMsgBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.battleMsg_ != null && this.battleMsg_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.battleMsg_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.battleMsg_).mergeFrom(value).buildPartial();
               } else {
                  this.battleMsg_ = value;
               }

               this.onChanged();
            } else {
               this.battleMsgBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearBattleMsg() {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
               this.onChanged();
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getBattleMsgBuilder() {
            this.bitField0_ |= 1;
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

         public boolean hasAtkServerId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getAtkServerId() {
            return this.atkServerId_;
         }

         public Builder setAtkServerId(int value) {
            this.bitField0_ |= 2;
            this.atkServerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAtkServerId() {
            this.bitField0_ &= -3;
            this.atkServerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAtkPlayerId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getAtkPlayerId() {
            return this.atkPlayerId_;
         }

         public Builder setAtkPlayerId(int value) {
            this.bitField0_ |= 4;
            this.atkPlayerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAtkPlayerId() {
            this.bitField0_ &= -5;
            this.atkPlayerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDefServerId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getDefServerId() {
            return this.defServerId_;
         }

         public Builder setDefServerId(int value) {
            this.bitField0_ |= 8;
            this.defServerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDefServerId() {
            this.bitField0_ &= -9;
            this.defServerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDefPlayerId() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getDefPlayerId() {
            return this.defPlayerId_;
         }

         public Builder setDefPlayerId(int value) {
            this.bitField0_ |= 16;
            this.defPlayerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDefPlayerId() {
            this.bitField0_ &= -17;
            this.defPlayerId_ = 0;
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

   public static final class CR2S_KingOfChallenge_11726 extends GeneratedMessageV3 implements CR2S_KingOfChallenge_11726OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DEFPLAYERID_FIELD_NUMBER = 1;
      private int defPlayerId_;
      public static final int BATTLEMSG_FIELD_NUMBER = 2;
      private BattleMsg.S2C_BattleResult_6102 battleMsg_;
      private byte memoizedIsInitialized;
      private static final CR2S_KingOfChallenge_11726 DEFAULT_INSTANCE = new CR2S_KingOfChallenge_11726();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_KingOfChallenge_11726> PARSER = new AbstractParser<CR2S_KingOfChallenge_11726>() {
         public CR2S_KingOfChallenge_11726 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_KingOfChallenge_11726(input, extensionRegistry);
         }
      };

      private CR2S_KingOfChallenge_11726(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_KingOfChallenge_11726() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_KingOfChallenge_11726();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_KingOfChallenge_11726(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.defPlayerId_ = input.readInt32();
                        break;
                     case 18:
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.battleMsg_.toBuilder();
                        }

                        this.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.battleMsg_);
                           this.battleMsg_ = subBuilder.buildPartial();
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
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfChallenge_11726_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfChallenge_11726_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_KingOfChallenge_11726.class, Builder.class);
      }

      public boolean hasDefPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDefPlayerId() {
         return this.defPlayerId_;
      }

      public boolean hasBattleMsg() {
         return (this.bitField0_ & 2) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getBattleMsg() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDefPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBattleMsg()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getBattleMsg().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.defPlayerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getBattleMsg());
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
               size += CodedOutputStream.computeInt32Size(1, this.defPlayerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getBattleMsg());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_KingOfChallenge_11726)) {
            return super.equals(obj);
         } else {
            CR2S_KingOfChallenge_11726 other = (CR2S_KingOfChallenge_11726)obj;
            if (this.hasDefPlayerId() != other.hasDefPlayerId()) {
               return false;
            } else if (this.hasDefPlayerId() && this.getDefPlayerId() != other.getDefPlayerId()) {
               return false;
            } else if (this.hasBattleMsg() != other.hasBattleMsg()) {
               return false;
            } else if (this.hasBattleMsg() && !this.getBattleMsg().equals(other.getBattleMsg())) {
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
            if (this.hasDefPlayerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDefPlayerId();
            }

            if (this.hasBattleMsg()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBattleMsg().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_KingOfChallenge_11726 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_KingOfChallenge_11726)PARSER.parseFrom(data);
      }

      public static CR2S_KingOfChallenge_11726 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_KingOfChallenge_11726)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_KingOfChallenge_11726 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_KingOfChallenge_11726)PARSER.parseFrom(data);
      }

      public static CR2S_KingOfChallenge_11726 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_KingOfChallenge_11726)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_KingOfChallenge_11726 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_KingOfChallenge_11726)PARSER.parseFrom(data);
      }

      public static CR2S_KingOfChallenge_11726 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_KingOfChallenge_11726)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_KingOfChallenge_11726 parseFrom(InputStream input) throws IOException {
         return (CR2S_KingOfChallenge_11726)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_KingOfChallenge_11726 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_KingOfChallenge_11726)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_KingOfChallenge_11726 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_KingOfChallenge_11726)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_KingOfChallenge_11726 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_KingOfChallenge_11726)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_KingOfChallenge_11726 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_KingOfChallenge_11726)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_KingOfChallenge_11726 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_KingOfChallenge_11726)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_KingOfChallenge_11726 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_KingOfChallenge_11726 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_KingOfChallenge_11726> parser() {
         return PARSER;
      }

      public Parser<CR2S_KingOfChallenge_11726> getParserForType() {
         return PARSER;
      }

      public CR2S_KingOfChallenge_11726 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_KingOfChallenge_11726OrBuilder {
         private int bitField0_;
         private int defPlayerId_;
         private BattleMsg.S2C_BattleResult_6102 battleMsg_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> battleMsgBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfChallenge_11726_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfChallenge_11726_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_KingOfChallenge_11726.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossChatMsg.CR2S_KingOfChallenge_11726.alwaysUseFieldBuilders) {
               this.getBattleMsgFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.defPlayerId_ = 0;
            this.bitField0_ &= -2;
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfChallenge_11726_descriptor;
         }

         public CR2S_KingOfChallenge_11726 getDefaultInstanceForType() {
            return CrossChatMsg.CR2S_KingOfChallenge_11726.getDefaultInstance();
         }

         public CR2S_KingOfChallenge_11726 build() {
            CR2S_KingOfChallenge_11726 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_KingOfChallenge_11726 buildPartial() {
            CR2S_KingOfChallenge_11726 result = new CR2S_KingOfChallenge_11726(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.defPlayerId_ = this.defPlayerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.battleMsgBuilder_ == null) {
                  result.battleMsg_ = this.battleMsg_;
               } else {
                  result.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)this.battleMsgBuilder_.build();
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
            if (other instanceof CR2S_KingOfChallenge_11726) {
               return this.mergeFrom((CR2S_KingOfChallenge_11726)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_KingOfChallenge_11726 other) {
            if (other == CrossChatMsg.CR2S_KingOfChallenge_11726.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDefPlayerId()) {
                  this.setDefPlayerId(other.getDefPlayerId());
               }

               if (other.hasBattleMsg()) {
                  this.mergeBattleMsg(other.getBattleMsg());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDefPlayerId()) {
               return false;
            } else if (!this.hasBattleMsg()) {
               return false;
            } else {
               return this.getBattleMsg().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_KingOfChallenge_11726 parsedMessage = null;

            try {
               parsedMessage = (CR2S_KingOfChallenge_11726)CrossChatMsg.CR2S_KingOfChallenge_11726.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_KingOfChallenge_11726)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDefPlayerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDefPlayerId() {
            return this.defPlayerId_;
         }

         public Builder setDefPlayerId(int value) {
            this.bitField0_ |= 1;
            this.defPlayerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDefPlayerId() {
            this.bitField0_ &= -2;
            this.defPlayerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBattleMsg() {
            return (this.bitField0_ & 2) != 0;
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

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setBattleMsg(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = builderForValue.build();
               this.onChanged();
            } else {
               this.battleMsgBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeBattleMsg(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleMsgBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.battleMsg_ != null && this.battleMsg_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.battleMsg_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.battleMsg_).mergeFrom(value).buildPartial();
               } else {
                  this.battleMsg_ = value;
               }

               this.onChanged();
            } else {
               this.battleMsgBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearBattleMsg() {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
               this.onChanged();
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getBattleMsgBuilder() {
            this.bitField0_ |= 2;
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_KingOfRecord_11728 extends GeneratedMessageV3 implements CR2S_KingOfRecord_11728OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECORDINFO_FIELD_NUMBER = 1;
      private LazyStringList recordInfo_;
      private byte memoizedIsInitialized;
      private static final CR2S_KingOfRecord_11728 DEFAULT_INSTANCE = new CR2S_KingOfRecord_11728();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_KingOfRecord_11728> PARSER = new AbstractParser<CR2S_KingOfRecord_11728>() {
         public CR2S_KingOfRecord_11728 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_KingOfRecord_11728(input, extensionRegistry);
         }
      };

      private CR2S_KingOfRecord_11728(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_KingOfRecord_11728() {
         this.memoizedIsInitialized = -1;
         this.recordInfo_ = LazyStringArrayList.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_KingOfRecord_11728();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_KingOfRecord_11728(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.recordInfo_ = new LazyStringArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.recordInfo_.add(bs);
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.recordInfo_ = this.recordInfo_.getUnmodifiableView();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfRecord_11728_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfRecord_11728_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_KingOfRecord_11728.class, Builder.class);
      }

      public ProtocolStringList getRecordInfoList() {
         return this.recordInfo_;
      }

      public int getRecordInfoCount() {
         return this.recordInfo_.size();
      }

      public String getRecordInfo(int index) {
         return (String)this.recordInfo_.get(index);
      }

      public ByteString getRecordInfoBytes(int index) {
         return this.recordInfo_.getByteString(index);
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
         for(int i = 0; i < this.recordInfo_.size(); ++i) {
            GeneratedMessageV3.writeString(output, 1, this.recordInfo_.getRaw(i));
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

            for(int i = 0; i < this.recordInfo_.size(); ++i) {
               dataSize += computeStringSizeNoTag(this.recordInfo_.getRaw(i));
            }

            size += dataSize;
            size += 1 * this.getRecordInfoList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_KingOfRecord_11728)) {
            return super.equals(obj);
         } else {
            CR2S_KingOfRecord_11728 other = (CR2S_KingOfRecord_11728)obj;
            if (!this.getRecordInfoList().equals(other.getRecordInfoList())) {
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
            if (this.getRecordInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecordInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_KingOfRecord_11728 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_KingOfRecord_11728)PARSER.parseFrom(data);
      }

      public static CR2S_KingOfRecord_11728 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_KingOfRecord_11728)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_KingOfRecord_11728 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_KingOfRecord_11728)PARSER.parseFrom(data);
      }

      public static CR2S_KingOfRecord_11728 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_KingOfRecord_11728)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_KingOfRecord_11728 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_KingOfRecord_11728)PARSER.parseFrom(data);
      }

      public static CR2S_KingOfRecord_11728 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_KingOfRecord_11728)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_KingOfRecord_11728 parseFrom(InputStream input) throws IOException {
         return (CR2S_KingOfRecord_11728)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_KingOfRecord_11728 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_KingOfRecord_11728)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_KingOfRecord_11728 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_KingOfRecord_11728)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_KingOfRecord_11728 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_KingOfRecord_11728)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_KingOfRecord_11728 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_KingOfRecord_11728)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_KingOfRecord_11728 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_KingOfRecord_11728)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_KingOfRecord_11728 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_KingOfRecord_11728 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_KingOfRecord_11728> parser() {
         return PARSER;
      }

      public Parser<CR2S_KingOfRecord_11728> getParserForType() {
         return PARSER;
      }

      public CR2S_KingOfRecord_11728 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_KingOfRecord_11728OrBuilder {
         private int bitField0_;
         private LazyStringList recordInfo_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfRecord_11728_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfRecord_11728_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_KingOfRecord_11728.class, Builder.class);
         }

         private Builder() {
            this.recordInfo_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.recordInfo_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossChatMsg.CR2S_KingOfRecord_11728.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.recordInfo_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_KingOfRecord_11728_descriptor;
         }

         public CR2S_KingOfRecord_11728 getDefaultInstanceForType() {
            return CrossChatMsg.CR2S_KingOfRecord_11728.getDefaultInstance();
         }

         public CR2S_KingOfRecord_11728 build() {
            CR2S_KingOfRecord_11728 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_KingOfRecord_11728 buildPartial() {
            CR2S_KingOfRecord_11728 result = new CR2S_KingOfRecord_11728(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.recordInfo_ = this.recordInfo_.getUnmodifiableView();
               this.bitField0_ &= -2;
            }

            result.recordInfo_ = this.recordInfo_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_KingOfRecord_11728) {
               return this.mergeFrom((CR2S_KingOfRecord_11728)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_KingOfRecord_11728 other) {
            if (other == CrossChatMsg.CR2S_KingOfRecord_11728.getDefaultInstance()) {
               return this;
            } else {
               if (!other.recordInfo_.isEmpty()) {
                  if (this.recordInfo_.isEmpty()) {
                     this.recordInfo_ = other.recordInfo_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureRecordInfoIsMutable();
                     this.recordInfo_.addAll(other.recordInfo_);
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
            CR2S_KingOfRecord_11728 parsedMessage = null;

            try {
               parsedMessage = (CR2S_KingOfRecord_11728)CrossChatMsg.CR2S_KingOfRecord_11728.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_KingOfRecord_11728)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRecordInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.recordInfo_ = new LazyStringArrayList(this.recordInfo_);
               this.bitField0_ |= 1;
            }

         }

         public ProtocolStringList getRecordInfoList() {
            return this.recordInfo_.getUnmodifiableView();
         }

         public int getRecordInfoCount() {
            return this.recordInfo_.size();
         }

         public String getRecordInfo(int index) {
            return (String)this.recordInfo_.get(index);
         }

         public ByteString getRecordInfoBytes(int index) {
            return this.recordInfo_.getByteString(index);
         }

         public Builder setRecordInfo(int index, String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRecordInfoIsMutable();
               this.recordInfo_.set(index, value);
               this.onChanged();
               return this;
            }
         }

         public Builder addRecordInfo(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRecordInfoIsMutable();
               this.recordInfo_.add(value);
               this.onChanged();
               return this;
            }
         }

         public Builder addAllRecordInfo(Iterable<String> values) {
            this.ensureRecordInfoIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recordInfo_);
            this.onChanged();
            return this;
         }

         public Builder clearRecordInfo() {
            this.recordInfo_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public Builder addRecordInfoBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRecordInfoIsMutable();
               this.recordInfo_.add(value);
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

   public static final class S2CR_RemoveChatInfo_11729 extends GeneratedMessageV3 implements S2CR_RemoveChatInfo_11729OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int PLAYERIDS_FIELD_NUMBER = 1;
      private Internal.IntList playerIds_;
      private byte memoizedIsInitialized;
      private static final S2CR_RemoveChatInfo_11729 DEFAULT_INSTANCE = new S2CR_RemoveChatInfo_11729();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_RemoveChatInfo_11729> PARSER = new AbstractParser<S2CR_RemoveChatInfo_11729>() {
         public S2CR_RemoveChatInfo_11729 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_RemoveChatInfo_11729(input, extensionRegistry);
         }
      };

      private S2CR_RemoveChatInfo_11729(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_RemoveChatInfo_11729() {
         this.memoizedIsInitialized = -1;
         this.playerIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_RemoveChatInfo_11729();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_RemoveChatInfo_11729(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_RemoveChatInfo_11729_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_RemoveChatInfo_11729_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_RemoveChatInfo_11729.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_RemoveChatInfo_11729)) {
            return super.equals(obj);
         } else {
            S2CR_RemoveChatInfo_11729 other = (S2CR_RemoveChatInfo_11729)obj;
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

      public static S2CR_RemoveChatInfo_11729 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_RemoveChatInfo_11729)PARSER.parseFrom(data);
      }

      public static S2CR_RemoveChatInfo_11729 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RemoveChatInfo_11729)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RemoveChatInfo_11729 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_RemoveChatInfo_11729)PARSER.parseFrom(data);
      }

      public static S2CR_RemoveChatInfo_11729 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RemoveChatInfo_11729)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RemoveChatInfo_11729 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_RemoveChatInfo_11729)PARSER.parseFrom(data);
      }

      public static S2CR_RemoveChatInfo_11729 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RemoveChatInfo_11729)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RemoveChatInfo_11729 parseFrom(InputStream input) throws IOException {
         return (S2CR_RemoveChatInfo_11729)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_RemoveChatInfo_11729 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RemoveChatInfo_11729)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_RemoveChatInfo_11729 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_RemoveChatInfo_11729)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_RemoveChatInfo_11729 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RemoveChatInfo_11729)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_RemoveChatInfo_11729 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_RemoveChatInfo_11729)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_RemoveChatInfo_11729 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RemoveChatInfo_11729)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_RemoveChatInfo_11729 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_RemoveChatInfo_11729 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_RemoveChatInfo_11729> parser() {
         return PARSER;
      }

      public Parser<S2CR_RemoveChatInfo_11729> getParserForType() {
         return PARSER;
      }

      public S2CR_RemoveChatInfo_11729 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_RemoveChatInfo_11729OrBuilder {
         private int bitField0_;
         private Internal.IntList playerIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_RemoveChatInfo_11729_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_RemoveChatInfo_11729_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_RemoveChatInfo_11729.class, Builder.class);
         }

         private Builder() {
            this.playerIds_ = CrossChatMsg.S2CR_RemoveChatInfo_11729.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerIds_ = CrossChatMsg.S2CR_RemoveChatInfo_11729.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossChatMsg.S2CR_RemoveChatInfo_11729.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerIds_ = CrossChatMsg.S2CR_RemoveChatInfo_11729.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_S2CR_RemoveChatInfo_11729_descriptor;
         }

         public S2CR_RemoveChatInfo_11729 getDefaultInstanceForType() {
            return CrossChatMsg.S2CR_RemoveChatInfo_11729.getDefaultInstance();
         }

         public S2CR_RemoveChatInfo_11729 build() {
            S2CR_RemoveChatInfo_11729 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_RemoveChatInfo_11729 buildPartial() {
            S2CR_RemoveChatInfo_11729 result = new S2CR_RemoveChatInfo_11729(this);
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
            if (other instanceof S2CR_RemoveChatInfo_11729) {
               return this.mergeFrom((S2CR_RemoveChatInfo_11729)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_RemoveChatInfo_11729 other) {
            if (other == CrossChatMsg.S2CR_RemoveChatInfo_11729.getDefaultInstance()) {
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
            S2CR_RemoveChatInfo_11729 parsedMessage = null;

            try {
               parsedMessage = (S2CR_RemoveChatInfo_11729)CrossChatMsg.S2CR_RemoveChatInfo_11729.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_RemoveChatInfo_11729)e.getUnfinishedMessage();
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
               this.playerIds_ = CrossChatMsg.S2CR_RemoveChatInfo_11729.mutableCopy(this.playerIds_);
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
            this.playerIds_ = CrossChatMsg.S2CR_RemoveChatInfo_11729.emptyIntList();
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

   public static final class CR2S_RemoveChatInfo_11730 extends GeneratedMessageV3 implements CR2S_RemoveChatInfo_11730OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int PLAYERIDS_FIELD_NUMBER = 1;
      private Internal.IntList playerIds_;
      private byte memoizedIsInitialized;
      private static final CR2S_RemoveChatInfo_11730 DEFAULT_INSTANCE = new CR2S_RemoveChatInfo_11730();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_RemoveChatInfo_11730> PARSER = new AbstractParser<CR2S_RemoveChatInfo_11730>() {
         public CR2S_RemoveChatInfo_11730 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_RemoveChatInfo_11730(input, extensionRegistry);
         }
      };

      private CR2S_RemoveChatInfo_11730(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_RemoveChatInfo_11730() {
         this.memoizedIsInitialized = -1;
         this.playerIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_RemoveChatInfo_11730();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_RemoveChatInfo_11730(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_RemoveChatInfo_11730_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_RemoveChatInfo_11730_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_RemoveChatInfo_11730.class, Builder.class);
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
         } else if (!(obj instanceof CR2S_RemoveChatInfo_11730)) {
            return super.equals(obj);
         } else {
            CR2S_RemoveChatInfo_11730 other = (CR2S_RemoveChatInfo_11730)obj;
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

      public static CR2S_RemoveChatInfo_11730 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_RemoveChatInfo_11730)PARSER.parseFrom(data);
      }

      public static CR2S_RemoveChatInfo_11730 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RemoveChatInfo_11730)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RemoveChatInfo_11730 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_RemoveChatInfo_11730)PARSER.parseFrom(data);
      }

      public static CR2S_RemoveChatInfo_11730 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RemoveChatInfo_11730)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RemoveChatInfo_11730 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_RemoveChatInfo_11730)PARSER.parseFrom(data);
      }

      public static CR2S_RemoveChatInfo_11730 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RemoveChatInfo_11730)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RemoveChatInfo_11730 parseFrom(InputStream input) throws IOException {
         return (CR2S_RemoveChatInfo_11730)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_RemoveChatInfo_11730 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RemoveChatInfo_11730)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_RemoveChatInfo_11730 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_RemoveChatInfo_11730)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_RemoveChatInfo_11730 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RemoveChatInfo_11730)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_RemoveChatInfo_11730 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_RemoveChatInfo_11730)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_RemoveChatInfo_11730 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RemoveChatInfo_11730)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_RemoveChatInfo_11730 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_RemoveChatInfo_11730 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_RemoveChatInfo_11730> parser() {
         return PARSER;
      }

      public Parser<CR2S_RemoveChatInfo_11730> getParserForType() {
         return PARSER;
      }

      public CR2S_RemoveChatInfo_11730 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_RemoveChatInfo_11730OrBuilder {
         private int bitField0_;
         private Internal.IntList playerIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_RemoveChatInfo_11730_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_RemoveChatInfo_11730_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_RemoveChatInfo_11730.class, Builder.class);
         }

         private Builder() {
            this.playerIds_ = CrossChatMsg.CR2S_RemoveChatInfo_11730.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerIds_ = CrossChatMsg.CR2S_RemoveChatInfo_11730.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossChatMsg.CR2S_RemoveChatInfo_11730.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerIds_ = CrossChatMsg.CR2S_RemoveChatInfo_11730.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossChatMsg.internal_static_crossChat_com_gzbz_protobuf_CR2S_RemoveChatInfo_11730_descriptor;
         }

         public CR2S_RemoveChatInfo_11730 getDefaultInstanceForType() {
            return CrossChatMsg.CR2S_RemoveChatInfo_11730.getDefaultInstance();
         }

         public CR2S_RemoveChatInfo_11730 build() {
            CR2S_RemoveChatInfo_11730 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_RemoveChatInfo_11730 buildPartial() {
            CR2S_RemoveChatInfo_11730 result = new CR2S_RemoveChatInfo_11730(this);
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
            if (other instanceof CR2S_RemoveChatInfo_11730) {
               return this.mergeFrom((CR2S_RemoveChatInfo_11730)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_RemoveChatInfo_11730 other) {
            if (other == CrossChatMsg.CR2S_RemoveChatInfo_11730.getDefaultInstance()) {
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
            CR2S_RemoveChatInfo_11730 parsedMessage = null;

            try {
               parsedMessage = (CR2S_RemoveChatInfo_11730)CrossChatMsg.CR2S_RemoveChatInfo_11730.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_RemoveChatInfo_11730)e.getUnfinishedMessage();
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
               this.playerIds_ = CrossChatMsg.CR2S_RemoveChatInfo_11730.mutableCopy(this.playerIds_);
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
            this.playerIds_ = CrossChatMsg.CR2S_RemoveChatInfo_11730.emptyIntList();
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

   public interface CR2S_ChatCountryWar_11704OrBuilder extends MessageOrBuilder {
      boolean hasChatInfo();

      ChatMsg.Chat_Info getChatInfo();

      ChatMsg.Chat_InfoOrBuilder getChatInfoOrBuilder();
   }

   public interface CR2S_Chat_11702OrBuilder extends MessageOrBuilder {
      boolean hasChatInfo();

      ChatMsg.Chat_Info getChatInfo();

      ChatMsg.Chat_InfoOrBuilder getChatInfoOrBuilder();
   }

   public interface CR2S_FightToPlayerResult_11718OrBuilder extends MessageOrBuilder {
      boolean hasDefPlayerId();

      int getDefPlayerId();

      boolean hasBattleMsg();

      BattleMsg.S2C_BattleResult_6102 getBattleMsg();

      BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder();
   }

   public interface CR2S_FightToPlayer_11716OrBuilder extends MessageOrBuilder {
      boolean hasAtkPlayerInfo();

      CommonMsg.PlayerInfo getAtkPlayerInfo();

      CommonMsg.PlayerInfoOrBuilder getAtkPlayerInfoOrBuilder();

      boolean hasHeroArrayingData();

      ByteString getHeroArrayingData();
   }

   public interface CR2S_KingOfChallenge_11724OrBuilder extends MessageOrBuilder {
      boolean hasAtkPlayerInfo();

      CommonMsg.PlayerInfo getAtkPlayerInfo();

      CommonMsg.PlayerInfoOrBuilder getAtkPlayerInfoOrBuilder();

      boolean hasHeroArrayingData();

      ByteString getHeroArrayingData();
   }

   public interface CR2S_KingOfChallenge_11726OrBuilder extends MessageOrBuilder {
      boolean hasDefPlayerId();

      int getDefPlayerId();

      boolean hasBattleMsg();

      BattleMsg.S2C_BattleResult_6102 getBattleMsg();

      BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder();
   }

   public interface CR2S_KingOfRecord_11728OrBuilder extends MessageOrBuilder {
      List<String> getRecordInfoList();

      int getRecordInfoCount();

      String getRecordInfo(int index);

      ByteString getRecordInfoBytes(int index);
   }

   public interface CR2S_RemoveChatInfo_11730OrBuilder extends MessageOrBuilder {
      List<Integer> getPlayerIdsList();

      int getPlayerIdsCount();

      int getPlayerIds(int index);
   }

   public interface S2CR_ChatCountryWar_11703OrBuilder extends MessageOrBuilder {
      boolean hasChatInfo();

      ChatMsg.Chat_Info getChatInfo();

      ChatMsg.Chat_InfoOrBuilder getChatInfoOrBuilder();
   }

   public interface S2CR_Chat_11701OrBuilder extends MessageOrBuilder {
      boolean hasChatInfo();

      ChatMsg.Chat_Info getChatInfo();

      ChatMsg.Chat_InfoOrBuilder getChatInfoOrBuilder();
   }

   public interface S2CR_CityChat_11721OrBuilder extends MessageOrBuilder {
      boolean hasChatInfo();

      ChatMsg.Chat_Info getChatInfo();

      ChatMsg.Chat_InfoOrBuilder getChatInfoOrBuilder();
   }

   public interface S2CR_FightToPlayerResult_11717OrBuilder extends MessageOrBuilder {
      boolean hasDestServerId();

      int getDestServerId();

      boolean hasDestPlayerId();

      int getDestPlayerId();

      boolean hasBattleMsg();

      BattleMsg.S2C_BattleResult_6102 getBattleMsg();

      BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder();
   }

   public interface S2CR_FightToPlayer_11715OrBuilder extends MessageOrBuilder {
      boolean hasDefServerId();

      int getDefServerId();

      boolean hasDefPlayerId();

      int getDefPlayerId();

      boolean hasAtkPlayerInfo();

      CommonMsg.PlayerInfo getAtkPlayerInfo();

      CommonMsg.PlayerInfoOrBuilder getAtkPlayerInfoOrBuilder();

      boolean hasHeroArrayingData();

      ByteString getHeroArrayingData();
   }

   public interface S2CR_KingOfChallenge_11723OrBuilder extends MessageOrBuilder {
      boolean hasDefServerId();

      int getDefServerId();

      boolean hasDefPlayerId();

      int getDefPlayerId();

      boolean hasAtkPlayerInfo();

      CommonMsg.PlayerInfo getAtkPlayerInfo();

      CommonMsg.PlayerInfoOrBuilder getAtkPlayerInfoOrBuilder();

      boolean hasHeroArrayingData();

      ByteString getHeroArrayingData();
   }

   public interface S2CR_KingOfChallenge_11725OrBuilder extends MessageOrBuilder {
      boolean hasBattleMsg();

      BattleMsg.S2C_BattleResult_6102 getBattleMsg();

      BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder();

      boolean hasAtkServerId();

      int getAtkServerId();

      boolean hasAtkPlayerId();

      int getAtkPlayerId();

      boolean hasDefServerId();

      int getDefServerId();

      boolean hasDefPlayerId();

      int getDefPlayerId();
   }

   public interface S2CR_PlayerBeautyInfo_11719OrBuilder extends MessageOrBuilder {
      boolean hasBeautyId();

      int getBeautyId();
   }

   public interface S2CR_PlayerDetailInfoForCross_11707OrBuilder extends MessageOrBuilder {
      boolean hasDestServerId();

      int getDestServerId();

      boolean hasDestPlayerId();

      int getDestPlayerId();

      boolean hasArraying();

      CommonMsg.HeroState getArraying();

      boolean hasSourcePlayerLv();

      int getSourcePlayerLv();
   }

   public interface S2CR_PlayerDetailInfoForCross_11708OrBuilder extends MessageOrBuilder {
      boolean hasDestServerId();

      int getDestServerId();

      boolean hasDestPlayerId();

      int getDestPlayerId();

      boolean hasArraying();

      CommonMsg.HeroState getArraying();
   }

   public interface S2CR_PlayerDetailInfo_11705OrBuilder extends MessageOrBuilder {
      boolean hasArraying();

      CommonMsg.HeroState getArraying();
   }

   public interface S2CR_RemoveChatInfo_11729OrBuilder extends MessageOrBuilder {
      List<Integer> getPlayerIdsList();

      int getPlayerIdsCount();

      int getPlayerIds(int index);
   }
}
