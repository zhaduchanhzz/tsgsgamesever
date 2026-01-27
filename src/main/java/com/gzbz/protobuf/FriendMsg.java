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

public final class FriendMsg {
   private static final Descriptors.Descriptor internal_static_friend_com_gzbz_protobuf_Friend_Info_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_friend_com_gzbz_protobuf_Friend_Info_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_friend_com_gzbz_protobuf_C2S_FriendList_6301_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_friend_com_gzbz_protobuf_C2S_FriendList_6301_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_friend_com_gzbz_protobuf_S2C_FriendList_6302_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_friend_com_gzbz_protobuf_S2C_FriendList_6302_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_friend_com_gzbz_protobuf_C2S_FriendOperate_6303_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_friend_com_gzbz_protobuf_C2S_FriendOperate_6303_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_friend_com_gzbz_protobuf_S2C_FriendOperate_6304_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_friend_com_gzbz_protobuf_S2C_FriendOperate_6304_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_friend_com_gzbz_protobuf_C2S_FriendSearch_6305_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_friend_com_gzbz_protobuf_C2S_FriendSearch_6305_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_friend_com_gzbz_protobuf_S2C_FriendSearch_6306_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_friend_com_gzbz_protobuf_S2C_FriendSearch_6306_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_friend_com_gzbz_protobuf_C2S_FriendBaseInfo_6307_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_friend_com_gzbz_protobuf_C2S_FriendBaseInfo_6307_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_friend_com_gzbz_protobuf_S2C_FriendBaseInfo_6308_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_friend_com_gzbz_protobuf_S2C_FriendBaseInfo_6308_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_friend_com_gzbz_protobuf_S2C_FriendOnline_6310_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_friend_com_gzbz_protobuf_S2C_FriendOnline_6310_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_friend_com_gzbz_protobuf_C2S_FriendTipOff_6311_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_friend_com_gzbz_protobuf_C2S_FriendTipOff_6311_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_friend_com_gzbz_protobuf_S2C_FriendTipOff_6312_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_friend_com_gzbz_protobuf_S2C_FriendTipOff_6312_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_friend_com_gzbz_protobuf_C2S_ReportInfo_6313_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_friend_com_gzbz_protobuf_C2S_ReportInfo_6313_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_friend_com_gzbz_protobuf_S2C_ReportInfo_6314_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_friend_com_gzbz_protobuf_S2C_ReportInfo_6314_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_friend_com_gzbz_protobuf_S2S_ReportPlayer_6315_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_friend_com_gzbz_protobuf_S2S_ReportPlayer_6315_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_friend_com_gzbz_protobuf_S2S_ReportResult_6317_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_friend_com_gzbz_protobuf_S2S_ReportResult_6317_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_friend_com_gzbz_protobuf_C2S_FlushCrossPkList_6319_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_friend_com_gzbz_protobuf_C2S_FlushCrossPkList_6319_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private FriendMsg() {
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
      String[] descriptorData = new String[]{"\n\fFriend.proto\u0012\u0018friend.com.gzbz.protobuf\"\u008a\u0002\n\u000bFriend_Info\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0002 \u0002(\t\u0012\u000b\n\u0003sex\u0018\u0003 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0004 \u0002(\u0005\u0012\r\n\u0005vipLv\u0018\u0005 \u0002(\u0005\u0012\r\n\u0005fight\u0018\u0006 \u0002(\u0003\u0012\f\n\u0004head\u0018\u0007 \u0002(\u0005\u0012\u0011\n\theadFrame\u0018\b \u0002(\u0005\u0012\u000f\n\u0007offline\u0018\t \u0002(\u0005\u0012\u0011\n\tgiveState\u0018\n \u0001(\u0005\u0012\u0013\n\u000bpickUpState\u0018\u000b \u0001(\u0005\u0012\u000f\n\u0007showVip\u0018\f \u0001(\b\u0012\u0010\n\bserverId\u0018\r \u0001(\u0005\u0012\u000e\n\u0006qqLogo\u0018\u000e \u0001(\t\u0012\u0011\n\tqqWanKaLv\u0018\u000f \u0001(\u0005\"'\n\u0013C2S_FriendList_6301\u0012\u0010\n\btypeData\u0018\u0001 \u0002(\u0005\"o\n\u0013S2C_FriendList_6302\u0012\u0010\n\btypeData\u0018\u0001 \u0002(\u0005\u00123\n\u0004info\u0018\u0002 \u0003(\u000b2%.friend.com.gzbz.protobuf.Friend_Info\u0012\u0011\n\tblacklist\u0018\u0003 \u0003(\u0005\"?\n\u0016C2S_FriendOperate_6303\u0012\u0013\n\u000btypeOperate\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0003(\u0005\"e\n\u0016S2C_FriendOperate_6304\u0012\u0010\n\brelation\u0018\u0001 \u0001(\u0005\u0012\u0013\n\u000btypeOperate\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0003 \u0003(\u0005\u0012\u0012\n\nplayerName\u0018\u0004 \u0001(\t\"9\n\u0015C2S_FriendSearch_6305\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0002 \u0001(\t\"q\n\u0015S2C_FriendSearch_6306\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0002 \u0002(\u0005\u0012:\n\u000bfriendInfos\u0018\u0003 \u0003(\u000b2%.friend.com.gzbz.protobuf.Friend_Info\"+\n\u0017C2S_FriendBaseInfo_6307\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\",\n\u0017S2C_FriendBaseInfo_6308\u0012\u0011\n\tgiveTimes\u0018\u0001 \u0002(\u0005\"+\n\u0015S2C_FriendOnline_6310\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\"L\n\u0015C2S_FriendTipOff_6311\u0012\u0010\n\bserverId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007tipTyps\u0018\u0003 \u0003(\u0005\"n\n\u0015S2C_FriendTipOff_6312\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bserverId\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0003 \u0002(\u0005\u0012\r\n\u0005count\u0018\u0004 \u0002(\u0005\u0012\u0012\n\nreportTime\u0018\u0005 \u0002(\u0005\"\u0015\n\u0013C2S_ReportInfo_6313\"D\n\u0013S2C_ReportInfo_6314\u0012\n\n\u0002hp\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005count\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nreportTime\u0018\u0003 \u0002(\u0005\",\n\u0015S2S_ReportPlayer_6315\u0012\u0013\n\u000breportFight\u0018\u0001 \u0002(\u0005\"'\n\u0015S2S_ReportResult_6317\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"]\n\u0019C2S_FlushCrossPkList_6319\u0012\u0015\n\rmatchPowerMin\u0018\u0001 \u0002(\u0003\u0012\u0015\n\rmatchPowerMax\u0018\u0002 \u0002(\u0003\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\tB \n\u0011com.gzbz.protobufB\tFriendMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_friend_com_gzbz_protobuf_Friend_Info_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_friend_com_gzbz_protobuf_Friend_Info_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_friend_com_gzbz_protobuf_Friend_Info_descriptor, new String[]{"PlayerId", "PlayerName", "Sex", "Lv", "VipLv", "Fight", "Head", "HeadFrame", "Offline", "GiveState", "PickUpState", "ShowVip", "ServerId", "QqLogo", "QqWanKaLv"});
      internal_static_friend_com_gzbz_protobuf_C2S_FriendList_6301_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_friend_com_gzbz_protobuf_C2S_FriendList_6301_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_friend_com_gzbz_protobuf_C2S_FriendList_6301_descriptor, new String[]{"TypeData"});
      internal_static_friend_com_gzbz_protobuf_S2C_FriendList_6302_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_friend_com_gzbz_protobuf_S2C_FriendList_6302_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_friend_com_gzbz_protobuf_S2C_FriendList_6302_descriptor, new String[]{"TypeData", "Info", "Blacklist"});
      internal_static_friend_com_gzbz_protobuf_C2S_FriendOperate_6303_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_friend_com_gzbz_protobuf_C2S_FriendOperate_6303_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_friend_com_gzbz_protobuf_C2S_FriendOperate_6303_descriptor, new String[]{"TypeOperate", "PlayerId"});
      internal_static_friend_com_gzbz_protobuf_S2C_FriendOperate_6304_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_friend_com_gzbz_protobuf_S2C_FriendOperate_6304_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_friend_com_gzbz_protobuf_S2C_FriendOperate_6304_descriptor, new String[]{"Relation", "TypeOperate", "PlayerId", "PlayerName"});
      internal_static_friend_com_gzbz_protobuf_C2S_FriendSearch_6305_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_friend_com_gzbz_protobuf_C2S_FriendSearch_6305_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_friend_com_gzbz_protobuf_C2S_FriendSearch_6305_descriptor, new String[]{"Type", "PlayerName"});
      internal_static_friend_com_gzbz_protobuf_S2C_FriendSearch_6306_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_friend_com_gzbz_protobuf_S2C_FriendSearch_6306_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_friend_com_gzbz_protobuf_S2C_FriendSearch_6306_descriptor, new String[]{"Result", "Type", "FriendInfos"});
      internal_static_friend_com_gzbz_protobuf_C2S_FriendBaseInfo_6307_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_friend_com_gzbz_protobuf_C2S_FriendBaseInfo_6307_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_friend_com_gzbz_protobuf_C2S_FriendBaseInfo_6307_descriptor, new String[]{"PlayerId"});
      internal_static_friend_com_gzbz_protobuf_S2C_FriendBaseInfo_6308_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_friend_com_gzbz_protobuf_S2C_FriendBaseInfo_6308_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_friend_com_gzbz_protobuf_S2C_FriendBaseInfo_6308_descriptor, new String[]{"GiveTimes"});
      internal_static_friend_com_gzbz_protobuf_S2C_FriendOnline_6310_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_friend_com_gzbz_protobuf_S2C_FriendOnline_6310_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_friend_com_gzbz_protobuf_S2C_FriendOnline_6310_descriptor, new String[]{"PlayerName"});
      internal_static_friend_com_gzbz_protobuf_C2S_FriendTipOff_6311_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_friend_com_gzbz_protobuf_C2S_FriendTipOff_6311_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_friend_com_gzbz_protobuf_C2S_FriendTipOff_6311_descriptor, new String[]{"ServerId", "PlayerId", "TipTyps"});
      internal_static_friend_com_gzbz_protobuf_S2C_FriendTipOff_6312_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_friend_com_gzbz_protobuf_S2C_FriendTipOff_6312_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_friend_com_gzbz_protobuf_S2C_FriendTipOff_6312_descriptor, new String[]{"Result", "ServerId", "PlayerId", "Count", "ReportTime"});
      internal_static_friend_com_gzbz_protobuf_C2S_ReportInfo_6313_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_friend_com_gzbz_protobuf_C2S_ReportInfo_6313_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_friend_com_gzbz_protobuf_C2S_ReportInfo_6313_descriptor, new String[0]);
      internal_static_friend_com_gzbz_protobuf_S2C_ReportInfo_6314_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_friend_com_gzbz_protobuf_S2C_ReportInfo_6314_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_friend_com_gzbz_protobuf_S2C_ReportInfo_6314_descriptor, new String[]{"Hp", "Count", "ReportTime"});
      internal_static_friend_com_gzbz_protobuf_S2S_ReportPlayer_6315_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_friend_com_gzbz_protobuf_S2S_ReportPlayer_6315_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_friend_com_gzbz_protobuf_S2S_ReportPlayer_6315_descriptor, new String[]{"ReportFight"});
      internal_static_friend_com_gzbz_protobuf_S2S_ReportResult_6317_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_friend_com_gzbz_protobuf_S2S_ReportResult_6317_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_friend_com_gzbz_protobuf_S2S_ReportResult_6317_descriptor, new String[]{"Result"});
      internal_static_friend_com_gzbz_protobuf_C2S_FlushCrossPkList_6319_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_friend_com_gzbz_protobuf_C2S_FlushCrossPkList_6319_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_friend_com_gzbz_protobuf_C2S_FlushCrossPkList_6319_descriptor, new String[]{"MatchPowerMin", "MatchPowerMax", "PlayerName"});
   }

   public static final class Friend_Info extends GeneratedMessageV3 implements Friend_InfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 2;
      private volatile Object playerName_;
      public static final int SEX_FIELD_NUMBER = 3;
      private int sex_;
      public static final int LV_FIELD_NUMBER = 4;
      private int lv_;
      public static final int VIPLV_FIELD_NUMBER = 5;
      private int vipLv_;
      public static final int FIGHT_FIELD_NUMBER = 6;
      private long fight_;
      public static final int HEAD_FIELD_NUMBER = 7;
      private int head_;
      public static final int HEADFRAME_FIELD_NUMBER = 8;
      private int headFrame_;
      public static final int OFFLINE_FIELD_NUMBER = 9;
      private int offline_;
      public static final int GIVESTATE_FIELD_NUMBER = 10;
      private int giveState_;
      public static final int PICKUPSTATE_FIELD_NUMBER = 11;
      private int pickUpState_;
      public static final int SHOWVIP_FIELD_NUMBER = 12;
      private boolean showVip_;
      public static final int SERVERID_FIELD_NUMBER = 13;
      private int serverId_;
      public static final int QQLOGO_FIELD_NUMBER = 14;
      private volatile Object qqLogo_;
      public static final int QQWANKALV_FIELD_NUMBER = 15;
      private int qqWanKaLv_;
      private byte memoizedIsInitialized;
      private static final Friend_Info DEFAULT_INSTANCE = new Friend_Info();
      /** @deprecated */
      @Deprecated
      public static final Parser<Friend_Info> PARSER = new AbstractParser<Friend_Info>() {
         public Friend_Info parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new Friend_Info(input, extensionRegistry);
         }
      };

      private Friend_Info(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private Friend_Info() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
         this.qqLogo_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new Friend_Info();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private Friend_Info(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.sex_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.lv_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.vipLv_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.fight_ = input.readInt64();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.head_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.offline_ = input.readInt32();
                        break;
                     case 80:
                        this.bitField0_ |= 512;
                        this.giveState_ = input.readInt32();
                        break;
                     case 88:
                        this.bitField0_ |= 1024;
                        this.pickUpState_ = input.readInt32();
                        break;
                     case 96:
                        this.bitField0_ |= 2048;
                        this.showVip_ = input.readBool();
                        break;
                     case 104:
                        this.bitField0_ |= 4096;
                        this.serverId_ = input.readInt32();
                        break;
                     case 114:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 8192;
                        this.qqLogo_ = bs;
                        break;
                     case 120:
                        this.bitField0_ |= 16384;
                        this.qqWanKaLv_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_Friend_Info_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_Friend_Info_fieldAccessorTable.ensureFieldAccessorsInitialized(Friend_Info.class, Builder.class);
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

      public boolean hasSex() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSex() {
         return this.sex_;
      }

      public boolean hasLv() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public boolean hasVipLv() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getVipLv() {
         return this.vipLv_;
      }

      public boolean hasFight() {
         return (this.bitField0_ & 32) != 0;
      }

      public long getFight() {
         return this.fight_;
      }

      public boolean hasHead() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasOffline() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getOffline() {
         return this.offline_;
      }

      public boolean hasGiveState() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getGiveState() {
         return this.giveState_;
      }

      public boolean hasPickUpState() {
         return (this.bitField0_ & 1024) != 0;
      }

      public int getPickUpState() {
         return this.pickUpState_;
      }

      public boolean hasShowVip() {
         return (this.bitField0_ & 2048) != 0;
      }

      public boolean getShowVip() {
         return this.showVip_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 4096) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasQqLogo() {
         return (this.bitField0_ & 8192) != 0;
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
         return (this.bitField0_ & 16384) != 0;
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
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasVipLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFight()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeadFrame()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOffline()) {
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
            GeneratedMessageV3.writeString(output, 2, this.playerName_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.sex_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.lv_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.vipLv_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt64(6, this.fight_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.head_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.headFrame_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.offline_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(10, this.giveState_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeInt32(11, this.pickUpState_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            output.writeBool(12, this.showVip_);
         }

         if ((this.bitField0_ & 4096) != 0) {
            output.writeInt32(13, this.serverId_);
         }

         if ((this.bitField0_ & 8192) != 0) {
            GeneratedMessageV3.writeString(output, 14, this.qqLogo_);
         }

         if ((this.bitField0_ & 16384) != 0) {
            output.writeInt32(15, this.qqWanKaLv_);
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
               size += CodedOutputStream.computeInt32Size(3, this.sex_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.lv_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.vipLv_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt64Size(6, this.fight_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.head_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.headFrame_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.offline_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.giveState_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.pickUpState_);
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += CodedOutputStream.computeBoolSize(12, this.showVip_);
            }

            if ((this.bitField0_ & 4096) != 0) {
               size += CodedOutputStream.computeInt32Size(13, this.serverId_);
            }

            if ((this.bitField0_ & 8192) != 0) {
               size += GeneratedMessageV3.computeStringSize(14, this.qqLogo_);
            }

            if ((this.bitField0_ & 16384) != 0) {
               size += CodedOutputStream.computeInt32Size(15, this.qqWanKaLv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof Friend_Info)) {
            return super.equals(obj);
         } else {
            Friend_Info other = (Friend_Info)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
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
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
               return false;
            } else if (this.hasVipLv() != other.hasVipLv()) {
               return false;
            } else if (this.hasVipLv() && this.getVipLv() != other.getVipLv()) {
               return false;
            } else if (this.hasFight() != other.hasFight()) {
               return false;
            } else if (this.hasFight() && this.getFight() != other.getFight()) {
               return false;
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else if (this.hasOffline() != other.hasOffline()) {
               return false;
            } else if (this.hasOffline() && this.getOffline() != other.getOffline()) {
               return false;
            } else if (this.hasGiveState() != other.hasGiveState()) {
               return false;
            } else if (this.hasGiveState() && this.getGiveState() != other.getGiveState()) {
               return false;
            } else if (this.hasPickUpState() != other.hasPickUpState()) {
               return false;
            } else if (this.hasPickUpState() && this.getPickUpState() != other.getPickUpState()) {
               return false;
            } else if (this.hasShowVip() != other.hasShowVip()) {
               return false;
            } else if (this.hasShowVip() && this.getShowVip() != other.getShowVip()) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
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
            if (this.hasPlayerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasSex()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSex();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getLv();
            }

            if (this.hasVipLv()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getVipLv();
            }

            if (this.hasFight()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashLong(this.getFight());
            }

            if (this.hasHead()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasOffline()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getOffline();
            }

            if (this.hasGiveState()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getGiveState();
            }

            if (this.hasPickUpState()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getPickUpState();
            }

            if (this.hasShowVip()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + Internal.hashBoolean(this.getShowVip());
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasQqLogo()) {
               hash = 37 * hash + 14;
               hash = 53 * hash + this.getQqLogo().hashCode();
            }

            if (this.hasQqWanKaLv()) {
               hash = 37 * hash + 15;
               hash = 53 * hash + this.getQqWanKaLv();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static Friend_Info parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (Friend_Info)PARSER.parseFrom(data);
      }

      public static Friend_Info parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Friend_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Friend_Info parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (Friend_Info)PARSER.parseFrom(data);
      }

      public static Friend_Info parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Friend_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Friend_Info parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (Friend_Info)PARSER.parseFrom(data);
      }

      public static Friend_Info parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Friend_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Friend_Info parseFrom(InputStream input) throws IOException {
         return (Friend_Info)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static Friend_Info parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Friend_Info)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static Friend_Info parseDelimitedFrom(InputStream input) throws IOException {
         return (Friend_Info)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static Friend_Info parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Friend_Info)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static Friend_Info parseFrom(CodedInputStream input) throws IOException {
         return (Friend_Info)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static Friend_Info parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Friend_Info)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(Friend_Info prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static Friend_Info getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<Friend_Info> parser() {
         return PARSER;
      }

      public Parser<Friend_Info> getParserForType() {
         return PARSER;
      }

      public Friend_Info getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Friend_InfoOrBuilder {
         private int bitField0_;
         private int playerId_;
         private Object playerName_;
         private int sex_;
         private int lv_;
         private int vipLv_;
         private long fight_;
         private int head_;
         private int headFrame_;
         private int offline_;
         private int giveState_;
         private int pickUpState_;
         private boolean showVip_;
         private int serverId_;
         private Object qqLogo_;
         private int qqWanKaLv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_Friend_Info_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_Friend_Info_fieldAccessorTable.ensureFieldAccessorsInitialized(Friend_Info.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.qqLogo_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.qqLogo_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FriendMsg.Friend_Info.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.playerName_ = "";
            this.bitField0_ &= -3;
            this.sex_ = 0;
            this.bitField0_ &= -5;
            this.lv_ = 0;
            this.bitField0_ &= -9;
            this.vipLv_ = 0;
            this.bitField0_ &= -17;
            this.fight_ = 0L;
            this.bitField0_ &= -33;
            this.head_ = 0;
            this.bitField0_ &= -65;
            this.headFrame_ = 0;
            this.bitField0_ &= -129;
            this.offline_ = 0;
            this.bitField0_ &= -257;
            this.giveState_ = 0;
            this.bitField0_ &= -513;
            this.pickUpState_ = 0;
            this.bitField0_ &= -1025;
            this.showVip_ = false;
            this.bitField0_ &= -2049;
            this.serverId_ = 0;
            this.bitField0_ &= -4097;
            this.qqLogo_ = "";
            this.bitField0_ &= -8193;
            this.qqWanKaLv_ = 0;
            this.bitField0_ &= -16385;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_Friend_Info_descriptor;
         }

         public Friend_Info getDefaultInstanceForType() {
            return FriendMsg.Friend_Info.getDefaultInstance();
         }

         public Friend_Info build() {
            Friend_Info result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public Friend_Info buildPartial() {
            Friend_Info result = new Friend_Info(this);
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
               result.sex_ = this.sex_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.lv_ = this.lv_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.vipLv_ = this.vipLv_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.fight_ = this.fight_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.offline_ = this.offline_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.giveState_ = this.giveState_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.pickUpState_ = this.pickUpState_;
               to_bitField0_ |= 1024;
            }

            if ((from_bitField0_ & 2048) != 0) {
               result.showVip_ = this.showVip_;
               to_bitField0_ |= 2048;
            }

            if ((from_bitField0_ & 4096) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 4096;
            }

            if ((from_bitField0_ & 8192) != 0) {
               to_bitField0_ |= 8192;
            }

            result.qqLogo_ = this.qqLogo_;
            if ((from_bitField0_ & 16384) != 0) {
               result.qqWanKaLv_ = this.qqWanKaLv_;
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
            if (other instanceof Friend_Info) {
               return this.mergeFrom((Friend_Info)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(Friend_Info other) {
            if (other == FriendMsg.Friend_Info.getDefaultInstance()) {
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

               if (other.hasSex()) {
                  this.setSex(other.getSex());
               }

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               if (other.hasVipLv()) {
                  this.setVipLv(other.getVipLv());
               }

               if (other.hasFight()) {
                  this.setFight(other.getFight());
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (other.hasOffline()) {
                  this.setOffline(other.getOffline());
               }

               if (other.hasGiveState()) {
                  this.setGiveState(other.getGiveState());
               }

               if (other.hasPickUpState()) {
                  this.setPickUpState(other.getPickUpState());
               }

               if (other.hasShowVip()) {
                  this.setShowVip(other.getShowVip());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasQqLogo()) {
                  this.bitField0_ |= 8192;
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
            if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasSex()) {
               return false;
            } else if (!this.hasLv()) {
               return false;
            } else if (!this.hasVipLv()) {
               return false;
            } else if (!this.hasFight()) {
               return false;
            } else if (!this.hasHead()) {
               return false;
            } else if (!this.hasHeadFrame()) {
               return false;
            } else {
               return this.hasOffline();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            Friend_Info parsedMessage = null;

            try {
               parsedMessage = (Friend_Info)FriendMsg.Friend_Info.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (Friend_Info)e.getUnfinishedMessage();
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
            this.playerName_ = FriendMsg.Friend_Info.getDefaultInstance().getPlayerName();
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

         public boolean hasSex() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSex() {
            return this.sex_;
         }

         public Builder setSex(int value) {
            this.bitField0_ |= 4;
            this.sex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSex() {
            this.bitField0_ &= -5;
            this.sex_ = 0;
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

         public boolean hasVipLv() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getVipLv() {
            return this.vipLv_;
         }

         public Builder setVipLv(int value) {
            this.bitField0_ |= 16;
            this.vipLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearVipLv() {
            this.bitField0_ &= -17;
            this.vipLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFight() {
            return (this.bitField0_ & 32) != 0;
         }

         public long getFight() {
            return this.fight_;
         }

         public Builder setFight(long value) {
            this.bitField0_ |= 32;
            this.fight_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFight() {
            this.bitField0_ &= -33;
            this.fight_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasHead() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getHead() {
            return this.head_;
         }

         public Builder setHead(int value) {
            this.bitField0_ |= 64;
            this.head_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHead() {
            this.bitField0_ &= -65;
            this.head_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeadFrame() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getHeadFrame() {
            return this.headFrame_;
         }

         public Builder setHeadFrame(int value) {
            this.bitField0_ |= 128;
            this.headFrame_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadFrame() {
            this.bitField0_ &= -129;
            this.headFrame_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOffline() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getOffline() {
            return this.offline_;
         }

         public Builder setOffline(int value) {
            this.bitField0_ |= 256;
            this.offline_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOffline() {
            this.bitField0_ &= -257;
            this.offline_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGiveState() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getGiveState() {
            return this.giveState_;
         }

         public Builder setGiveState(int value) {
            this.bitField0_ |= 512;
            this.giveState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGiveState() {
            this.bitField0_ &= -513;
            this.giveState_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPickUpState() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getPickUpState() {
            return this.pickUpState_;
         }

         public Builder setPickUpState(int value) {
            this.bitField0_ |= 1024;
            this.pickUpState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPickUpState() {
            this.bitField0_ &= -1025;
            this.pickUpState_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasShowVip() {
            return (this.bitField0_ & 2048) != 0;
         }

         public boolean getShowVip() {
            return this.showVip_;
         }

         public Builder setShowVip(boolean value) {
            this.bitField0_ |= 2048;
            this.showVip_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShowVip() {
            this.bitField0_ &= -2049;
            this.showVip_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 4096) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 4096;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -4097;
            this.serverId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasQqLogo() {
            return (this.bitField0_ & 8192) != 0;
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
               this.bitField0_ |= 8192;
               this.qqLogo_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearQqLogo() {
            this.bitField0_ &= -8193;
            this.qqLogo_ = FriendMsg.Friend_Info.getDefaultInstance().getQqLogo();
            this.onChanged();
            return this;
         }

         public Builder setQqLogoBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8192;
               this.qqLogo_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasQqWanKaLv() {
            return (this.bitField0_ & 16384) != 0;
         }

         public int getQqWanKaLv() {
            return this.qqWanKaLv_;
         }

         public Builder setQqWanKaLv(int value) {
            this.bitField0_ |= 16384;
            this.qqWanKaLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearQqWanKaLv() {
            this.bitField0_ &= -16385;
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

   public static final class C2S_FriendList_6301 extends GeneratedMessageV3 implements C2S_FriendList_6301OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPEDATA_FIELD_NUMBER = 1;
      private int typeData_;
      private byte memoizedIsInitialized;
      private static final C2S_FriendList_6301 DEFAULT_INSTANCE = new C2S_FriendList_6301();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FriendList_6301> PARSER = new AbstractParser<C2S_FriendList_6301>() {
         public C2S_FriendList_6301 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FriendList_6301(input, extensionRegistry);
         }
      };

      private C2S_FriendList_6301(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FriendList_6301() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FriendList_6301();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FriendList_6301(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.typeData_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendList_6301_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendList_6301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FriendList_6301.class, Builder.class);
      }

      public boolean hasTypeData() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTypeData() {
         return this.typeData_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTypeData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.typeData_);
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
               size += CodedOutputStream.computeInt32Size(1, this.typeData_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FriendList_6301)) {
            return super.equals(obj);
         } else {
            C2S_FriendList_6301 other = (C2S_FriendList_6301)obj;
            if (this.hasTypeData() != other.hasTypeData()) {
               return false;
            } else if (this.hasTypeData() && this.getTypeData() != other.getTypeData()) {
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
            if (this.hasTypeData()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTypeData();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FriendList_6301 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FriendList_6301)PARSER.parseFrom(data);
      }

      public static C2S_FriendList_6301 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FriendList_6301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FriendList_6301 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FriendList_6301)PARSER.parseFrom(data);
      }

      public static C2S_FriendList_6301 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FriendList_6301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FriendList_6301 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FriendList_6301)PARSER.parseFrom(data);
      }

      public static C2S_FriendList_6301 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FriendList_6301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FriendList_6301 parseFrom(InputStream input) throws IOException {
         return (C2S_FriendList_6301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FriendList_6301 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FriendList_6301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FriendList_6301 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FriendList_6301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FriendList_6301 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FriendList_6301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FriendList_6301 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FriendList_6301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FriendList_6301 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FriendList_6301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FriendList_6301 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FriendList_6301 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FriendList_6301> parser() {
         return PARSER;
      }

      public Parser<C2S_FriendList_6301> getParserForType() {
         return PARSER;
      }

      public C2S_FriendList_6301 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FriendList_6301OrBuilder {
         private int bitField0_;
         private int typeData_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendList_6301_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendList_6301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FriendList_6301.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FriendMsg.C2S_FriendList_6301.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.typeData_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendList_6301_descriptor;
         }

         public C2S_FriendList_6301 getDefaultInstanceForType() {
            return FriendMsg.C2S_FriendList_6301.getDefaultInstance();
         }

         public C2S_FriendList_6301 build() {
            C2S_FriendList_6301 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FriendList_6301 buildPartial() {
            C2S_FriendList_6301 result = new C2S_FriendList_6301(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.typeData_ = this.typeData_;
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
            if (other instanceof C2S_FriendList_6301) {
               return this.mergeFrom((C2S_FriendList_6301)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FriendList_6301 other) {
            if (other == FriendMsg.C2S_FriendList_6301.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTypeData()) {
                  this.setTypeData(other.getTypeData());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTypeData();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_FriendList_6301 parsedMessage = null;

            try {
               parsedMessage = (C2S_FriendList_6301)FriendMsg.C2S_FriendList_6301.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FriendList_6301)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTypeData() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTypeData() {
            return this.typeData_;
         }

         public Builder setTypeData(int value) {
            this.bitField0_ |= 1;
            this.typeData_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTypeData() {
            this.bitField0_ &= -2;
            this.typeData_ = 0;
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

   public static final class S2C_FriendList_6302 extends GeneratedMessageV3 implements S2C_FriendList_6302OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPEDATA_FIELD_NUMBER = 1;
      private int typeData_;
      public static final int INFO_FIELD_NUMBER = 2;
      private List<Friend_Info> info_;
      public static final int BLACKLIST_FIELD_NUMBER = 3;
      private Internal.IntList blacklist_;
      private byte memoizedIsInitialized;
      private static final S2C_FriendList_6302 DEFAULT_INSTANCE = new S2C_FriendList_6302();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FriendList_6302> PARSER = new AbstractParser<S2C_FriendList_6302>() {
         public S2C_FriendList_6302 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FriendList_6302(input, extensionRegistry);
         }
      };

      private S2C_FriendList_6302(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FriendList_6302() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
         this.blacklist_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FriendList_6302();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FriendList_6302(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.typeData_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.info_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.info_.add(input.readMessage(FriendMsg.Friend_Info.PARSER, extensionRegistry));
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.blacklist_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.blacklist_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.blacklist_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.blacklist_.addInt(input.readInt32());
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
                  this.info_ = Collections.unmodifiableList(this.info_);
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.blacklist_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendList_6302_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendList_6302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FriendList_6302.class, Builder.class);
      }

      public boolean hasTypeData() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTypeData() {
         return this.typeData_;
      }

      public List<Friend_Info> getInfoList() {
         return this.info_;
      }

      public List<? extends Friend_InfoOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public Friend_Info getInfo(int index) {
         return (Friend_Info)this.info_.get(index);
      }

      public Friend_InfoOrBuilder getInfoOrBuilder(int index) {
         return (Friend_InfoOrBuilder)this.info_.get(index);
      }

      public List<Integer> getBlacklistList() {
         return this.blacklist_;
      }

      public int getBlacklistCount() {
         return this.blacklist_.size();
      }

      public int getBlacklist(int index) {
         return this.blacklist_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTypeData()) {
            this.memoizedIsInitialized = 0;
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
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.typeData_);
         }

         for(int i = 0; i < this.info_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.info_.get(i));
         }

         for(int i = 0; i < this.blacklist_.size(); ++i) {
            output.writeInt32(3, this.blacklist_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.typeData_);
            }

            for(int i = 0; i < this.info_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.info_.get(i));
            }

            int dataSize = 0;

            for(int i = 0; i < this.blacklist_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.blacklist_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getBlacklistList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FriendList_6302)) {
            return super.equals(obj);
         } else {
            S2C_FriendList_6302 other = (S2C_FriendList_6302)obj;
            if (this.hasTypeData() != other.hasTypeData()) {
               return false;
            } else if (this.hasTypeData() && this.getTypeData() != other.getTypeData()) {
               return false;
            } else if (!this.getInfoList().equals(other.getInfoList())) {
               return false;
            } else if (!this.getBlacklistList().equals(other.getBlacklistList())) {
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
            if (this.hasTypeData()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTypeData();
            }

            if (this.getInfoCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfoList().hashCode();
            }

            if (this.getBlacklistCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBlacklistList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FriendList_6302 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FriendList_6302)PARSER.parseFrom(data);
      }

      public static S2C_FriendList_6302 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FriendList_6302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FriendList_6302 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FriendList_6302)PARSER.parseFrom(data);
      }

      public static S2C_FriendList_6302 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FriendList_6302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FriendList_6302 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FriendList_6302)PARSER.parseFrom(data);
      }

      public static S2C_FriendList_6302 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FriendList_6302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FriendList_6302 parseFrom(InputStream input) throws IOException {
         return (S2C_FriendList_6302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FriendList_6302 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FriendList_6302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FriendList_6302 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FriendList_6302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FriendList_6302 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FriendList_6302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FriendList_6302 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FriendList_6302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FriendList_6302 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FriendList_6302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FriendList_6302 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FriendList_6302 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FriendList_6302> parser() {
         return PARSER;
      }

      public Parser<S2C_FriendList_6302> getParserForType() {
         return PARSER;
      }

      public S2C_FriendList_6302 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FriendList_6302OrBuilder {
         private int bitField0_;
         private int typeData_;
         private List<Friend_Info> info_;
         private RepeatedFieldBuilderV3<Friend_Info, Friend_Info.Builder, Friend_InfoOrBuilder> infoBuilder_;
         private Internal.IntList blacklist_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendList_6302_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendList_6302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FriendList_6302.class, Builder.class);
         }

         private Builder() {
            this.info_ = Collections.emptyList();
            this.blacklist_ = FriendMsg.S2C_FriendList_6302.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.info_ = Collections.emptyList();
            this.blacklist_ = FriendMsg.S2C_FriendList_6302.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FriendMsg.S2C_FriendList_6302.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.typeData_ = 0;
            this.bitField0_ &= -2;
            if (this.infoBuilder_ == null) {
               this.info_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.infoBuilder_.clear();
            }

            this.blacklist_ = FriendMsg.S2C_FriendList_6302.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendList_6302_descriptor;
         }

         public S2C_FriendList_6302 getDefaultInstanceForType() {
            return FriendMsg.S2C_FriendList_6302.getDefaultInstance();
         }

         public S2C_FriendList_6302 build() {
            S2C_FriendList_6302 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FriendList_6302 buildPartial() {
            S2C_FriendList_6302 result = new S2C_FriendList_6302(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.typeData_ = this.typeData_;
               to_bitField0_ |= 1;
            }

            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.info_ = Collections.unmodifiableList(this.info_);
                  this.bitField0_ &= -3;
               }

               result.info_ = this.info_;
            } else {
               result.info_ = this.infoBuilder_.build();
            }

            if ((this.bitField0_ & 4) != 0) {
               this.blacklist_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.blacklist_ = this.blacklist_;
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
            if (other instanceof S2C_FriendList_6302) {
               return this.mergeFrom((S2C_FriendList_6302)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FriendList_6302 other) {
            if (other == FriendMsg.S2C_FriendList_6302.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTypeData()) {
                  this.setTypeData(other.getTypeData());
               }

               if (this.infoBuilder_ == null) {
                  if (!other.info_.isEmpty()) {
                     if (this.info_.isEmpty()) {
                        this.info_ = other.info_;
                        this.bitField0_ &= -3;
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
                     this.bitField0_ &= -3;
                     this.infoBuilder_ = FriendMsg.S2C_FriendList_6302.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
                  } else {
                     this.infoBuilder_.addAllMessages(other.info_);
                  }
               }

               if (!other.blacklist_.isEmpty()) {
                  if (this.blacklist_.isEmpty()) {
                     this.blacklist_ = other.blacklist_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureBlacklistIsMutable();
                     this.blacklist_.addAll(other.blacklist_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTypeData()) {
               return false;
            } else {
               for(int i = 0; i < this.getInfoCount(); ++i) {
                  if (!this.getInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FriendList_6302 parsedMessage = null;

            try {
               parsedMessage = (S2C_FriendList_6302)FriendMsg.S2C_FriendList_6302.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FriendList_6302)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTypeData() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTypeData() {
            return this.typeData_;
         }

         public Builder setTypeData(int value) {
            this.bitField0_ |= 1;
            this.typeData_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTypeData() {
            this.bitField0_ &= -2;
            this.typeData_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureInfoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.info_ = new ArrayList(this.info_);
               this.bitField0_ |= 2;
            }

         }

         public List<Friend_Info> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public Friend_Info getInfo(int index) {
            return this.infoBuilder_ == null ? (Friend_Info)this.info_.get(index) : (Friend_Info)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, Friend_Info value) {
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

         public Builder setInfo(int index, Friend_Info.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(Friend_Info value) {
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

         public Builder addInfo(int index, Friend_Info value) {
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

         public Builder addInfo(Friend_Info.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, Friend_Info.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends Friend_Info> values) {
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
               this.bitField0_ &= -3;
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

         public Friend_Info.Builder getInfoBuilder(int index) {
            return (Friend_Info.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public Friend_InfoOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (Friend_InfoOrBuilder)this.info_.get(index) : (Friend_InfoOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends Friend_InfoOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public Friend_Info.Builder addInfoBuilder() {
            return (Friend_Info.Builder)this.getInfoFieldBuilder().addBuilder(FriendMsg.Friend_Info.getDefaultInstance());
         }

         public Friend_Info.Builder addInfoBuilder(int index) {
            return (Friend_Info.Builder)this.getInfoFieldBuilder().addBuilder(index, FriendMsg.Friend_Info.getDefaultInstance());
         }

         public List<Friend_Info.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<Friend_Info, Friend_Info.Builder, Friend_InfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new RepeatedFieldBuilderV3(this.info_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         private void ensureBlacklistIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.blacklist_ = FriendMsg.S2C_FriendList_6302.mutableCopy(this.blacklist_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getBlacklistList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.blacklist_) : this.blacklist_);
         }

         public int getBlacklistCount() {
            return this.blacklist_.size();
         }

         public int getBlacklist(int index) {
            return this.blacklist_.getInt(index);
         }

         public Builder setBlacklist(int index, int value) {
            this.ensureBlacklistIsMutable();
            this.blacklist_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addBlacklist(int value) {
            this.ensureBlacklistIsMutable();
            this.blacklist_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllBlacklist(Iterable<? extends Integer> values) {
            this.ensureBlacklistIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.blacklist_);
            this.onChanged();
            return this;
         }

         public Builder clearBlacklist() {
            this.blacklist_ = FriendMsg.S2C_FriendList_6302.emptyIntList();
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

   public static final class C2S_FriendOperate_6303 extends GeneratedMessageV3 implements C2S_FriendOperate_6303OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPEOPERATE_FIELD_NUMBER = 1;
      private int typeOperate_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private Internal.IntList playerId_;
      private byte memoizedIsInitialized;
      private static final C2S_FriendOperate_6303 DEFAULT_INSTANCE = new C2S_FriendOperate_6303();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FriendOperate_6303> PARSER = new AbstractParser<C2S_FriendOperate_6303>() {
         public C2S_FriendOperate_6303 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FriendOperate_6303(input, extensionRegistry);
         }
      };

      private C2S_FriendOperate_6303(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FriendOperate_6303() {
         this.memoizedIsInitialized = -1;
         this.playerId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FriendOperate_6303();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FriendOperate_6303(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.typeOperate_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.playerId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.playerId_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.playerId_ = newIntList();
                           mutable_bitField0_ |= 2;
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
               if ((mutable_bitField0_ & 2) != 0) {
                  this.playerId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendOperate_6303_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendOperate_6303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FriendOperate_6303.class, Builder.class);
      }

      public boolean hasTypeOperate() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTypeOperate() {
         return this.typeOperate_;
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
         } else if (!this.hasTypeOperate()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.typeOperate_);
         }

         for(int i = 0; i < this.playerId_.size(); ++i) {
            output.writeInt32(2, this.playerId_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.typeOperate_);
            }

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
         } else if (!(obj instanceof C2S_FriendOperate_6303)) {
            return super.equals(obj);
         } else {
            C2S_FriendOperate_6303 other = (C2S_FriendOperate_6303)obj;
            if (this.hasTypeOperate() != other.hasTypeOperate()) {
               return false;
            } else if (this.hasTypeOperate() && this.getTypeOperate() != other.getTypeOperate()) {
               return false;
            } else if (!this.getPlayerIdList().equals(other.getPlayerIdList())) {
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
            if (this.hasTypeOperate()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTypeOperate();
            }

            if (this.getPlayerIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FriendOperate_6303 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FriendOperate_6303)PARSER.parseFrom(data);
      }

      public static C2S_FriendOperate_6303 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FriendOperate_6303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FriendOperate_6303 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FriendOperate_6303)PARSER.parseFrom(data);
      }

      public static C2S_FriendOperate_6303 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FriendOperate_6303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FriendOperate_6303 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FriendOperate_6303)PARSER.parseFrom(data);
      }

      public static C2S_FriendOperate_6303 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FriendOperate_6303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FriendOperate_6303 parseFrom(InputStream input) throws IOException {
         return (C2S_FriendOperate_6303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FriendOperate_6303 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FriendOperate_6303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FriendOperate_6303 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FriendOperate_6303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FriendOperate_6303 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FriendOperate_6303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FriendOperate_6303 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FriendOperate_6303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FriendOperate_6303 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FriendOperate_6303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FriendOperate_6303 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FriendOperate_6303 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FriendOperate_6303> parser() {
         return PARSER;
      }

      public Parser<C2S_FriendOperate_6303> getParserForType() {
         return PARSER;
      }

      public C2S_FriendOperate_6303 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FriendOperate_6303OrBuilder {
         private int bitField0_;
         private int typeOperate_;
         private Internal.IntList playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendOperate_6303_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendOperate_6303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FriendOperate_6303.class, Builder.class);
         }

         private Builder() {
            this.playerId_ = FriendMsg.C2S_FriendOperate_6303.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerId_ = FriendMsg.C2S_FriendOperate_6303.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FriendMsg.C2S_FriendOperate_6303.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.typeOperate_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = FriendMsg.C2S_FriendOperate_6303.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendOperate_6303_descriptor;
         }

         public C2S_FriendOperate_6303 getDefaultInstanceForType() {
            return FriendMsg.C2S_FriendOperate_6303.getDefaultInstance();
         }

         public C2S_FriendOperate_6303 build() {
            C2S_FriendOperate_6303 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FriendOperate_6303 buildPartial() {
            C2S_FriendOperate_6303 result = new C2S_FriendOperate_6303(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.typeOperate_ = this.typeOperate_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.playerId_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.playerId_ = this.playerId_;
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
            if (other instanceof C2S_FriendOperate_6303) {
               return this.mergeFrom((C2S_FriendOperate_6303)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FriendOperate_6303 other) {
            if (other == FriendMsg.C2S_FriendOperate_6303.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTypeOperate()) {
                  this.setTypeOperate(other.getTypeOperate());
               }

               if (!other.playerId_.isEmpty()) {
                  if (this.playerId_.isEmpty()) {
                     this.playerId_ = other.playerId_;
                     this.bitField0_ &= -3;
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
            return this.hasTypeOperate();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_FriendOperate_6303 parsedMessage = null;

            try {
               parsedMessage = (C2S_FriendOperate_6303)FriendMsg.C2S_FriendOperate_6303.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FriendOperate_6303)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTypeOperate() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTypeOperate() {
            return this.typeOperate_;
         }

         public Builder setTypeOperate(int value) {
            this.bitField0_ |= 1;
            this.typeOperate_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTypeOperate() {
            this.bitField0_ &= -2;
            this.typeOperate_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePlayerIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.playerId_ = FriendMsg.C2S_FriendOperate_6303.mutableCopy(this.playerId_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getPlayerIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.playerId_) : this.playerId_);
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
            this.playerId_ = FriendMsg.C2S_FriendOperate_6303.emptyIntList();
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

   public static final class S2C_FriendOperate_6304 extends GeneratedMessageV3 implements S2C_FriendOperate_6304OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RELATION_FIELD_NUMBER = 1;
      private int relation_;
      public static final int TYPEOPERATE_FIELD_NUMBER = 2;
      private int typeOperate_;
      public static final int PLAYERID_FIELD_NUMBER = 3;
      private Internal.IntList playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 4;
      private volatile Object playerName_;
      private byte memoizedIsInitialized;
      private static final S2C_FriendOperate_6304 DEFAULT_INSTANCE = new S2C_FriendOperate_6304();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FriendOperate_6304> PARSER = new AbstractParser<S2C_FriendOperate_6304>() {
         public S2C_FriendOperate_6304 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FriendOperate_6304(input, extensionRegistry);
         }
      };

      private S2C_FriendOperate_6304(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FriendOperate_6304() {
         this.memoizedIsInitialized = -1;
         this.playerId_ = emptyIntList();
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FriendOperate_6304();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FriendOperate_6304(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.relation_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.typeOperate_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.playerId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.playerId_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.playerId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 34:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.playerName_ = bs;
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.playerId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.playerId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendOperate_6304_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendOperate_6304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FriendOperate_6304.class, Builder.class);
      }

      public boolean hasRelation() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRelation() {
         return this.relation_;
      }

      public boolean hasTypeOperate() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTypeOperate() {
         return this.typeOperate_;
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

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTypeOperate()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.relation_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.typeOperate_);
         }

         for(int i = 0; i < this.playerId_.size(); ++i) {
            output.writeInt32(3, this.playerId_.getInt(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 4, this.playerName_);
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
               size += CodedOutputStream.computeInt32Size(1, this.relation_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.typeOperate_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.playerId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.playerId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPlayerIdList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(4, this.playerName_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FriendOperate_6304)) {
            return super.equals(obj);
         } else {
            S2C_FriendOperate_6304 other = (S2C_FriendOperate_6304)obj;
            if (this.hasRelation() != other.hasRelation()) {
               return false;
            } else if (this.hasRelation() && this.getRelation() != other.getRelation()) {
               return false;
            } else if (this.hasTypeOperate() != other.hasTypeOperate()) {
               return false;
            } else if (this.hasTypeOperate() && this.getTypeOperate() != other.getTypeOperate()) {
               return false;
            } else if (!this.getPlayerIdList().equals(other.getPlayerIdList())) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
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
            if (this.hasRelation()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRelation();
            }

            if (this.hasTypeOperate()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTypeOperate();
            }

            if (this.getPlayerIdCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerIdList().hashCode();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FriendOperate_6304 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FriendOperate_6304)PARSER.parseFrom(data);
      }

      public static S2C_FriendOperate_6304 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FriendOperate_6304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FriendOperate_6304 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FriendOperate_6304)PARSER.parseFrom(data);
      }

      public static S2C_FriendOperate_6304 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FriendOperate_6304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FriendOperate_6304 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FriendOperate_6304)PARSER.parseFrom(data);
      }

      public static S2C_FriendOperate_6304 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FriendOperate_6304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FriendOperate_6304 parseFrom(InputStream input) throws IOException {
         return (S2C_FriendOperate_6304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FriendOperate_6304 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FriendOperate_6304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FriendOperate_6304 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FriendOperate_6304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FriendOperate_6304 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FriendOperate_6304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FriendOperate_6304 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FriendOperate_6304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FriendOperate_6304 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FriendOperate_6304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FriendOperate_6304 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FriendOperate_6304 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FriendOperate_6304> parser() {
         return PARSER;
      }

      public Parser<S2C_FriendOperate_6304> getParserForType() {
         return PARSER;
      }

      public S2C_FriendOperate_6304 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FriendOperate_6304OrBuilder {
         private int bitField0_;
         private int relation_;
         private int typeOperate_;
         private Internal.IntList playerId_;
         private Object playerName_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendOperate_6304_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendOperate_6304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FriendOperate_6304.class, Builder.class);
         }

         private Builder() {
            this.playerId_ = FriendMsg.S2C_FriendOperate_6304.emptyIntList();
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerId_ = FriendMsg.S2C_FriendOperate_6304.emptyIntList();
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FriendMsg.S2C_FriendOperate_6304.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.relation_ = 0;
            this.bitField0_ &= -2;
            this.typeOperate_ = 0;
            this.bitField0_ &= -3;
            this.playerId_ = FriendMsg.S2C_FriendOperate_6304.emptyIntList();
            this.bitField0_ &= -5;
            this.playerName_ = "";
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendOperate_6304_descriptor;
         }

         public S2C_FriendOperate_6304 getDefaultInstanceForType() {
            return FriendMsg.S2C_FriendOperate_6304.getDefaultInstance();
         }

         public S2C_FriendOperate_6304 build() {
            S2C_FriendOperate_6304 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FriendOperate_6304 buildPartial() {
            S2C_FriendOperate_6304 result = new S2C_FriendOperate_6304(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.relation_ = this.relation_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.typeOperate_ = this.typeOperate_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.playerId_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.playerId_ = this.playerId_;
            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 4;
            }

            result.playerName_ = this.playerName_;
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
            if (other instanceof S2C_FriendOperate_6304) {
               return this.mergeFrom((S2C_FriendOperate_6304)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FriendOperate_6304 other) {
            if (other == FriendMsg.S2C_FriendOperate_6304.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRelation()) {
                  this.setRelation(other.getRelation());
               }

               if (other.hasTypeOperate()) {
                  this.setTypeOperate(other.getTypeOperate());
               }

               if (!other.playerId_.isEmpty()) {
                  if (this.playerId_.isEmpty()) {
                     this.playerId_ = other.playerId_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensurePlayerIdIsMutable();
                     this.playerId_.addAll(other.playerId_);
                  }

                  this.onChanged();
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 8;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTypeOperate();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FriendOperate_6304 parsedMessage = null;

            try {
               parsedMessage = (S2C_FriendOperate_6304)FriendMsg.S2C_FriendOperate_6304.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FriendOperate_6304)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRelation() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRelation() {
            return this.relation_;
         }

         public Builder setRelation(int value) {
            this.bitField0_ |= 1;
            this.relation_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRelation() {
            this.bitField0_ &= -2;
            this.relation_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTypeOperate() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTypeOperate() {
            return this.typeOperate_;
         }

         public Builder setTypeOperate(int value) {
            this.bitField0_ |= 2;
            this.typeOperate_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTypeOperate() {
            this.bitField0_ &= -3;
            this.typeOperate_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePlayerIdIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.playerId_ = FriendMsg.S2C_FriendOperate_6304.mutableCopy(this.playerId_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getPlayerIdList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.playerId_) : this.playerId_);
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
            this.playerId_ = FriendMsg.S2C_FriendOperate_6304.emptyIntList();
            this.bitField0_ &= -5;
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
            this.playerName_ = FriendMsg.S2C_FriendOperate_6304.getDefaultInstance().getPlayerName();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_FriendSearch_6305 extends GeneratedMessageV3 implements C2S_FriendSearch_6305OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int PLAYERNAME_FIELD_NUMBER = 2;
      private volatile Object playerName_;
      private byte memoizedIsInitialized;
      private static final C2S_FriendSearch_6305 DEFAULT_INSTANCE = new C2S_FriendSearch_6305();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FriendSearch_6305> PARSER = new AbstractParser<C2S_FriendSearch_6305>() {
         public C2S_FriendSearch_6305 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FriendSearch_6305(input, extensionRegistry);
         }
      };

      private C2S_FriendSearch_6305(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FriendSearch_6305() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FriendSearch_6305();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FriendSearch_6305(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.playerName_ = bs;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendSearch_6305_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendSearch_6305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FriendSearch_6305.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
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
            GeneratedMessageV3.writeString(output, 2, this.playerName_);
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
               size += GeneratedMessageV3.computeStringSize(2, this.playerName_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FriendSearch_6305)) {
            return super.equals(obj);
         } else {
            C2S_FriendSearch_6305 other = (C2S_FriendSearch_6305)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
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

            if (this.hasPlayerName()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FriendSearch_6305 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FriendSearch_6305)PARSER.parseFrom(data);
      }

      public static C2S_FriendSearch_6305 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FriendSearch_6305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FriendSearch_6305 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FriendSearch_6305)PARSER.parseFrom(data);
      }

      public static C2S_FriendSearch_6305 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FriendSearch_6305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FriendSearch_6305 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FriendSearch_6305)PARSER.parseFrom(data);
      }

      public static C2S_FriendSearch_6305 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FriendSearch_6305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FriendSearch_6305 parseFrom(InputStream input) throws IOException {
         return (C2S_FriendSearch_6305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FriendSearch_6305 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FriendSearch_6305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FriendSearch_6305 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FriendSearch_6305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FriendSearch_6305 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FriendSearch_6305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FriendSearch_6305 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FriendSearch_6305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FriendSearch_6305 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FriendSearch_6305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FriendSearch_6305 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FriendSearch_6305 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FriendSearch_6305> parser() {
         return PARSER;
      }

      public Parser<C2S_FriendSearch_6305> getParserForType() {
         return PARSER;
      }

      public C2S_FriendSearch_6305 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FriendSearch_6305OrBuilder {
         private int bitField0_;
         private int type_;
         private Object playerName_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendSearch_6305_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendSearch_6305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FriendSearch_6305.class, Builder.class);
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
            if (FriendMsg.C2S_FriendSearch_6305.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.playerName_ = "";
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendSearch_6305_descriptor;
         }

         public C2S_FriendSearch_6305 getDefaultInstanceForType() {
            return FriendMsg.C2S_FriendSearch_6305.getDefaultInstance();
         }

         public C2S_FriendSearch_6305 build() {
            C2S_FriendSearch_6305 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FriendSearch_6305 buildPartial() {
            C2S_FriendSearch_6305 result = new C2S_FriendSearch_6305(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.playerName_ = this.playerName_;
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
            if (other instanceof C2S_FriendSearch_6305) {
               return this.mergeFrom((C2S_FriendSearch_6305)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FriendSearch_6305 other) {
            if (other == FriendMsg.C2S_FriendSearch_6305.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 2;
                  this.playerName_ = other.playerName_;
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
            C2S_FriendSearch_6305 parsedMessage = null;

            try {
               parsedMessage = (C2S_FriendSearch_6305)FriendMsg.C2S_FriendSearch_6305.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FriendSearch_6305)e.getUnfinishedMessage();
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
            this.playerName_ = FriendMsg.C2S_FriendSearch_6305.getDefaultInstance().getPlayerName();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_FriendSearch_6306 extends GeneratedMessageV3 implements S2C_FriendSearch_6306OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      public static final int FRIENDINFOS_FIELD_NUMBER = 3;
      private List<Friend_Info> friendInfos_;
      private byte memoizedIsInitialized;
      private static final S2C_FriendSearch_6306 DEFAULT_INSTANCE = new S2C_FriendSearch_6306();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FriendSearch_6306> PARSER = new AbstractParser<S2C_FriendSearch_6306>() {
         public S2C_FriendSearch_6306 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FriendSearch_6306(input, extensionRegistry);
         }
      };

      private S2C_FriendSearch_6306(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FriendSearch_6306() {
         this.memoizedIsInitialized = -1;
         this.friendInfos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FriendSearch_6306();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FriendSearch_6306(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.friendInfos_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.friendInfos_.add(input.readMessage(FriendMsg.Friend_Info.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.friendInfos_ = Collections.unmodifiableList(this.friendInfos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendSearch_6306_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendSearch_6306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FriendSearch_6306.class, Builder.class);
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

      public List<Friend_Info> getFriendInfosList() {
         return this.friendInfos_;
      }

      public List<? extends Friend_InfoOrBuilder> getFriendInfosOrBuilderList() {
         return this.friendInfos_;
      }

      public int getFriendInfosCount() {
         return this.friendInfos_.size();
      }

      public Friend_Info getFriendInfos(int index) {
         return (Friend_Info)this.friendInfos_.get(index);
      }

      public Friend_InfoOrBuilder getFriendInfosOrBuilder(int index) {
         return (Friend_InfoOrBuilder)this.friendInfos_.get(index);
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
            for(int i = 0; i < this.getFriendInfosCount(); ++i) {
               if (!this.getFriendInfos(i).isInitialized()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.type_);
         }

         for(int i = 0; i < this.friendInfos_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.friendInfos_.get(i));
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

            for(int i = 0; i < this.friendInfos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.friendInfos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FriendSearch_6306)) {
            return super.equals(obj);
         } else {
            S2C_FriendSearch_6306 other = (S2C_FriendSearch_6306)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (!this.getFriendInfosList().equals(other.getFriendInfosList())) {
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

            if (this.getFriendInfosCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getFriendInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FriendSearch_6306 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FriendSearch_6306)PARSER.parseFrom(data);
      }

      public static S2C_FriendSearch_6306 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FriendSearch_6306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FriendSearch_6306 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FriendSearch_6306)PARSER.parseFrom(data);
      }

      public static S2C_FriendSearch_6306 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FriendSearch_6306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FriendSearch_6306 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FriendSearch_6306)PARSER.parseFrom(data);
      }

      public static S2C_FriendSearch_6306 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FriendSearch_6306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FriendSearch_6306 parseFrom(InputStream input) throws IOException {
         return (S2C_FriendSearch_6306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FriendSearch_6306 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FriendSearch_6306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FriendSearch_6306 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FriendSearch_6306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FriendSearch_6306 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FriendSearch_6306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FriendSearch_6306 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FriendSearch_6306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FriendSearch_6306 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FriendSearch_6306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FriendSearch_6306 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FriendSearch_6306 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FriendSearch_6306> parser() {
         return PARSER;
      }

      public Parser<S2C_FriendSearch_6306> getParserForType() {
         return PARSER;
      }

      public S2C_FriendSearch_6306 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FriendSearch_6306OrBuilder {
         private int bitField0_;
         private int result_;
         private int type_;
         private List<Friend_Info> friendInfos_;
         private RepeatedFieldBuilderV3<Friend_Info, Friend_Info.Builder, Friend_InfoOrBuilder> friendInfosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendSearch_6306_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendSearch_6306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FriendSearch_6306.class, Builder.class);
         }

         private Builder() {
            this.friendInfos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.friendInfos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FriendMsg.S2C_FriendSearch_6306.alwaysUseFieldBuilders) {
               this.getFriendInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            if (this.friendInfosBuilder_ == null) {
               this.friendInfos_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.friendInfosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendSearch_6306_descriptor;
         }

         public S2C_FriendSearch_6306 getDefaultInstanceForType() {
            return FriendMsg.S2C_FriendSearch_6306.getDefaultInstance();
         }

         public S2C_FriendSearch_6306 build() {
            S2C_FriendSearch_6306 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FriendSearch_6306 buildPartial() {
            S2C_FriendSearch_6306 result = new S2C_FriendSearch_6306(this);
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

            if (this.friendInfosBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.friendInfos_ = Collections.unmodifiableList(this.friendInfos_);
                  this.bitField0_ &= -5;
               }

               result.friendInfos_ = this.friendInfos_;
            } else {
               result.friendInfos_ = this.friendInfosBuilder_.build();
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
            if (other instanceof S2C_FriendSearch_6306) {
               return this.mergeFrom((S2C_FriendSearch_6306)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FriendSearch_6306 other) {
            if (other == FriendMsg.S2C_FriendSearch_6306.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (this.friendInfosBuilder_ == null) {
                  if (!other.friendInfos_.isEmpty()) {
                     if (this.friendInfos_.isEmpty()) {
                        this.friendInfos_ = other.friendInfos_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureFriendInfosIsMutable();
                        this.friendInfos_.addAll(other.friendInfos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.friendInfos_.isEmpty()) {
                  if (this.friendInfosBuilder_.isEmpty()) {
                     this.friendInfosBuilder_.dispose();
                     this.friendInfosBuilder_ = null;
                     this.friendInfos_ = other.friendInfos_;
                     this.bitField0_ &= -5;
                     this.friendInfosBuilder_ = FriendMsg.S2C_FriendSearch_6306.alwaysUseFieldBuilders ? this.getFriendInfosFieldBuilder() : null;
                  } else {
                     this.friendInfosBuilder_.addAllMessages(other.friendInfos_);
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
            } else if (!this.hasType()) {
               return false;
            } else {
               for(int i = 0; i < this.getFriendInfosCount(); ++i) {
                  if (!this.getFriendInfos(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FriendSearch_6306 parsedMessage = null;

            try {
               parsedMessage = (S2C_FriendSearch_6306)FriendMsg.S2C_FriendSearch_6306.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FriendSearch_6306)e.getUnfinishedMessage();
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

         private void ensureFriendInfosIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.friendInfos_ = new ArrayList(this.friendInfos_);
               this.bitField0_ |= 4;
            }

         }

         public List<Friend_Info> getFriendInfosList() {
            return this.friendInfosBuilder_ == null ? Collections.unmodifiableList(this.friendInfos_) : this.friendInfosBuilder_.getMessageList();
         }

         public int getFriendInfosCount() {
            return this.friendInfosBuilder_ == null ? this.friendInfos_.size() : this.friendInfosBuilder_.getCount();
         }

         public Friend_Info getFriendInfos(int index) {
            return this.friendInfosBuilder_ == null ? (Friend_Info)this.friendInfos_.get(index) : (Friend_Info)this.friendInfosBuilder_.getMessage(index);
         }

         public Builder setFriendInfos(int index, Friend_Info value) {
            if (this.friendInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFriendInfosIsMutable();
               this.friendInfos_.set(index, value);
               this.onChanged();
            } else {
               this.friendInfosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setFriendInfos(int index, Friend_Info.Builder builderForValue) {
            if (this.friendInfosBuilder_ == null) {
               this.ensureFriendInfosIsMutable();
               this.friendInfos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.friendInfosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addFriendInfos(Friend_Info value) {
            if (this.friendInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFriendInfosIsMutable();
               this.friendInfos_.add(value);
               this.onChanged();
            } else {
               this.friendInfosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addFriendInfos(int index, Friend_Info value) {
            if (this.friendInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFriendInfosIsMutable();
               this.friendInfos_.add(index, value);
               this.onChanged();
            } else {
               this.friendInfosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addFriendInfos(Friend_Info.Builder builderForValue) {
            if (this.friendInfosBuilder_ == null) {
               this.ensureFriendInfosIsMutable();
               this.friendInfos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.friendInfosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addFriendInfos(int index, Friend_Info.Builder builderForValue) {
            if (this.friendInfosBuilder_ == null) {
               this.ensureFriendInfosIsMutable();
               this.friendInfos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.friendInfosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllFriendInfos(Iterable<? extends Friend_Info> values) {
            if (this.friendInfosBuilder_ == null) {
               this.ensureFriendInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.friendInfos_);
               this.onChanged();
            } else {
               this.friendInfosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearFriendInfos() {
            if (this.friendInfosBuilder_ == null) {
               this.friendInfos_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.friendInfosBuilder_.clear();
            }

            return this;
         }

         public Builder removeFriendInfos(int index) {
            if (this.friendInfosBuilder_ == null) {
               this.ensureFriendInfosIsMutable();
               this.friendInfos_.remove(index);
               this.onChanged();
            } else {
               this.friendInfosBuilder_.remove(index);
            }

            return this;
         }

         public Friend_Info.Builder getFriendInfosBuilder(int index) {
            return (Friend_Info.Builder)this.getFriendInfosFieldBuilder().getBuilder(index);
         }

         public Friend_InfoOrBuilder getFriendInfosOrBuilder(int index) {
            return this.friendInfosBuilder_ == null ? (Friend_InfoOrBuilder)this.friendInfos_.get(index) : (Friend_InfoOrBuilder)this.friendInfosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends Friend_InfoOrBuilder> getFriendInfosOrBuilderList() {
            return this.friendInfosBuilder_ != null ? this.friendInfosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.friendInfos_);
         }

         public Friend_Info.Builder addFriendInfosBuilder() {
            return (Friend_Info.Builder)this.getFriendInfosFieldBuilder().addBuilder(FriendMsg.Friend_Info.getDefaultInstance());
         }

         public Friend_Info.Builder addFriendInfosBuilder(int index) {
            return (Friend_Info.Builder)this.getFriendInfosFieldBuilder().addBuilder(index, FriendMsg.Friend_Info.getDefaultInstance());
         }

         public List<Friend_Info.Builder> getFriendInfosBuilderList() {
            return this.getFriendInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<Friend_Info, Friend_Info.Builder, Friend_InfoOrBuilder> getFriendInfosFieldBuilder() {
            if (this.friendInfosBuilder_ == null) {
               this.friendInfosBuilder_ = new RepeatedFieldBuilderV3(this.friendInfos_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.friendInfos_ = null;
            }

            return this.friendInfosBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_FriendBaseInfo_6307 extends GeneratedMessageV3 implements C2S_FriendBaseInfo_6307OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      private byte memoizedIsInitialized;
      private static final C2S_FriendBaseInfo_6307 DEFAULT_INSTANCE = new C2S_FriendBaseInfo_6307();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FriendBaseInfo_6307> PARSER = new AbstractParser<C2S_FriendBaseInfo_6307>() {
         public C2S_FriendBaseInfo_6307 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FriendBaseInfo_6307(input, extensionRegistry);
         }
      };

      private C2S_FriendBaseInfo_6307(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FriendBaseInfo_6307() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FriendBaseInfo_6307();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FriendBaseInfo_6307(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendBaseInfo_6307_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendBaseInfo_6307_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FriendBaseInfo_6307.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FriendBaseInfo_6307)) {
            return super.equals(obj);
         } else {
            C2S_FriendBaseInfo_6307 other = (C2S_FriendBaseInfo_6307)obj;
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

      public static C2S_FriendBaseInfo_6307 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FriendBaseInfo_6307)PARSER.parseFrom(data);
      }

      public static C2S_FriendBaseInfo_6307 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FriendBaseInfo_6307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FriendBaseInfo_6307 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FriendBaseInfo_6307)PARSER.parseFrom(data);
      }

      public static C2S_FriendBaseInfo_6307 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FriendBaseInfo_6307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FriendBaseInfo_6307 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FriendBaseInfo_6307)PARSER.parseFrom(data);
      }

      public static C2S_FriendBaseInfo_6307 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FriendBaseInfo_6307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FriendBaseInfo_6307 parseFrom(InputStream input) throws IOException {
         return (C2S_FriendBaseInfo_6307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FriendBaseInfo_6307 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FriendBaseInfo_6307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FriendBaseInfo_6307 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FriendBaseInfo_6307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FriendBaseInfo_6307 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FriendBaseInfo_6307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FriendBaseInfo_6307 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FriendBaseInfo_6307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FriendBaseInfo_6307 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FriendBaseInfo_6307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FriendBaseInfo_6307 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FriendBaseInfo_6307 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FriendBaseInfo_6307> parser() {
         return PARSER;
      }

      public Parser<C2S_FriendBaseInfo_6307> getParserForType() {
         return PARSER;
      }

      public C2S_FriendBaseInfo_6307 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FriendBaseInfo_6307OrBuilder {
         private int bitField0_;
         private int playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendBaseInfo_6307_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendBaseInfo_6307_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FriendBaseInfo_6307.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FriendMsg.C2S_FriendBaseInfo_6307.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendBaseInfo_6307_descriptor;
         }

         public C2S_FriendBaseInfo_6307 getDefaultInstanceForType() {
            return FriendMsg.C2S_FriendBaseInfo_6307.getDefaultInstance();
         }

         public C2S_FriendBaseInfo_6307 build() {
            C2S_FriendBaseInfo_6307 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FriendBaseInfo_6307 buildPartial() {
            C2S_FriendBaseInfo_6307 result = new C2S_FriendBaseInfo_6307(this);
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
            if (other instanceof C2S_FriendBaseInfo_6307) {
               return this.mergeFrom((C2S_FriendBaseInfo_6307)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FriendBaseInfo_6307 other) {
            if (other == FriendMsg.C2S_FriendBaseInfo_6307.getDefaultInstance()) {
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
            C2S_FriendBaseInfo_6307 parsedMessage = null;

            try {
               parsedMessage = (C2S_FriendBaseInfo_6307)FriendMsg.C2S_FriendBaseInfo_6307.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FriendBaseInfo_6307)e.getUnfinishedMessage();
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

   public static final class S2C_FriendBaseInfo_6308 extends GeneratedMessageV3 implements S2C_FriendBaseInfo_6308OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GIVETIMES_FIELD_NUMBER = 1;
      private int giveTimes_;
      private byte memoizedIsInitialized;
      private static final S2C_FriendBaseInfo_6308 DEFAULT_INSTANCE = new S2C_FriendBaseInfo_6308();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FriendBaseInfo_6308> PARSER = new AbstractParser<S2C_FriendBaseInfo_6308>() {
         public S2C_FriendBaseInfo_6308 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FriendBaseInfo_6308(input, extensionRegistry);
         }
      };

      private S2C_FriendBaseInfo_6308(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FriendBaseInfo_6308() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FriendBaseInfo_6308();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FriendBaseInfo_6308(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.giveTimes_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendBaseInfo_6308_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendBaseInfo_6308_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FriendBaseInfo_6308.class, Builder.class);
      }

      public boolean hasGiveTimes() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGiveTimes() {
         return this.giveTimes_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGiveTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.giveTimes_);
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
               size += CodedOutputStream.computeInt32Size(1, this.giveTimes_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FriendBaseInfo_6308)) {
            return super.equals(obj);
         } else {
            S2C_FriendBaseInfo_6308 other = (S2C_FriendBaseInfo_6308)obj;
            if (this.hasGiveTimes() != other.hasGiveTimes()) {
               return false;
            } else if (this.hasGiveTimes() && this.getGiveTimes() != other.getGiveTimes()) {
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
            if (this.hasGiveTimes()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGiveTimes();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FriendBaseInfo_6308 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FriendBaseInfo_6308)PARSER.parseFrom(data);
      }

      public static S2C_FriendBaseInfo_6308 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FriendBaseInfo_6308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FriendBaseInfo_6308 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FriendBaseInfo_6308)PARSER.parseFrom(data);
      }

      public static S2C_FriendBaseInfo_6308 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FriendBaseInfo_6308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FriendBaseInfo_6308 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FriendBaseInfo_6308)PARSER.parseFrom(data);
      }

      public static S2C_FriendBaseInfo_6308 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FriendBaseInfo_6308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FriendBaseInfo_6308 parseFrom(InputStream input) throws IOException {
         return (S2C_FriendBaseInfo_6308)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FriendBaseInfo_6308 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FriendBaseInfo_6308)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FriendBaseInfo_6308 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FriendBaseInfo_6308)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FriendBaseInfo_6308 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FriendBaseInfo_6308)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FriendBaseInfo_6308 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FriendBaseInfo_6308)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FriendBaseInfo_6308 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FriendBaseInfo_6308)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FriendBaseInfo_6308 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FriendBaseInfo_6308 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FriendBaseInfo_6308> parser() {
         return PARSER;
      }

      public Parser<S2C_FriendBaseInfo_6308> getParserForType() {
         return PARSER;
      }

      public S2C_FriendBaseInfo_6308 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FriendBaseInfo_6308OrBuilder {
         private int bitField0_;
         private int giveTimes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendBaseInfo_6308_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendBaseInfo_6308_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FriendBaseInfo_6308.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FriendMsg.S2C_FriendBaseInfo_6308.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.giveTimes_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendBaseInfo_6308_descriptor;
         }

         public S2C_FriendBaseInfo_6308 getDefaultInstanceForType() {
            return FriendMsg.S2C_FriendBaseInfo_6308.getDefaultInstance();
         }

         public S2C_FriendBaseInfo_6308 build() {
            S2C_FriendBaseInfo_6308 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FriendBaseInfo_6308 buildPartial() {
            S2C_FriendBaseInfo_6308 result = new S2C_FriendBaseInfo_6308(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.giveTimes_ = this.giveTimes_;
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
            if (other instanceof S2C_FriendBaseInfo_6308) {
               return this.mergeFrom((S2C_FriendBaseInfo_6308)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FriendBaseInfo_6308 other) {
            if (other == FriendMsg.S2C_FriendBaseInfo_6308.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGiveTimes()) {
                  this.setGiveTimes(other.getGiveTimes());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGiveTimes();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FriendBaseInfo_6308 parsedMessage = null;

            try {
               parsedMessage = (S2C_FriendBaseInfo_6308)FriendMsg.S2C_FriendBaseInfo_6308.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FriendBaseInfo_6308)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGiveTimes() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGiveTimes() {
            return this.giveTimes_;
         }

         public Builder setGiveTimes(int value) {
            this.bitField0_ |= 1;
            this.giveTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGiveTimes() {
            this.bitField0_ &= -2;
            this.giveTimes_ = 0;
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

   public static final class S2C_FriendOnline_6310 extends GeneratedMessageV3 implements S2C_FriendOnline_6310OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERNAME_FIELD_NUMBER = 1;
      private volatile Object playerName_;
      private byte memoizedIsInitialized;
      private static final S2C_FriendOnline_6310 DEFAULT_INSTANCE = new S2C_FriendOnline_6310();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FriendOnline_6310> PARSER = new AbstractParser<S2C_FriendOnline_6310>() {
         public S2C_FriendOnline_6310 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FriendOnline_6310(input, extensionRegistry);
         }
      };

      private S2C_FriendOnline_6310(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FriendOnline_6310() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FriendOnline_6310();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FriendOnline_6310(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.playerName_ = bs;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendOnline_6310_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendOnline_6310_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FriendOnline_6310.class, Builder.class);
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 1) != 0;
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

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.playerName_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.playerName_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FriendOnline_6310)) {
            return super.equals(obj);
         } else {
            S2C_FriendOnline_6310 other = (S2C_FriendOnline_6310)obj;
            if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
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
            if (this.hasPlayerName()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FriendOnline_6310 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FriendOnline_6310)PARSER.parseFrom(data);
      }

      public static S2C_FriendOnline_6310 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FriendOnline_6310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FriendOnline_6310 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FriendOnline_6310)PARSER.parseFrom(data);
      }

      public static S2C_FriendOnline_6310 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FriendOnline_6310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FriendOnline_6310 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FriendOnline_6310)PARSER.parseFrom(data);
      }

      public static S2C_FriendOnline_6310 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FriendOnline_6310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FriendOnline_6310 parseFrom(InputStream input) throws IOException {
         return (S2C_FriendOnline_6310)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FriendOnline_6310 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FriendOnline_6310)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FriendOnline_6310 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FriendOnline_6310)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FriendOnline_6310 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FriendOnline_6310)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FriendOnline_6310 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FriendOnline_6310)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FriendOnline_6310 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FriendOnline_6310)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FriendOnline_6310 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FriendOnline_6310 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FriendOnline_6310> parser() {
         return PARSER;
      }

      public Parser<S2C_FriendOnline_6310> getParserForType() {
         return PARSER;
      }

      public S2C_FriendOnline_6310 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FriendOnline_6310OrBuilder {
         private int bitField0_;
         private Object playerName_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendOnline_6310_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendOnline_6310_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FriendOnline_6310.class, Builder.class);
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
            if (FriendMsg.S2C_FriendOnline_6310.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerName_ = "";
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendOnline_6310_descriptor;
         }

         public S2C_FriendOnline_6310 getDefaultInstanceForType() {
            return FriendMsg.S2C_FriendOnline_6310.getDefaultInstance();
         }

         public S2C_FriendOnline_6310 build() {
            S2C_FriendOnline_6310 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FriendOnline_6310 buildPartial() {
            S2C_FriendOnline_6310 result = new S2C_FriendOnline_6310(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.playerName_ = this.playerName_;
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
            if (other instanceof S2C_FriendOnline_6310) {
               return this.mergeFrom((S2C_FriendOnline_6310)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FriendOnline_6310 other) {
            if (other == FriendMsg.S2C_FriendOnline_6310.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerName()) {
                  this.bitField0_ |= 1;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPlayerName();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FriendOnline_6310 parsedMessage = null;

            try {
               parsedMessage = (S2C_FriendOnline_6310)FriendMsg.S2C_FriendOnline_6310.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FriendOnline_6310)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 1) != 0;
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
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -2;
            this.playerName_ = FriendMsg.S2C_FriendOnline_6310.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.playerName_ = value;
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

   public static final class C2S_FriendTipOff_6311 extends GeneratedMessageV3 implements C2S_FriendTipOff_6311OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SERVERID_FIELD_NUMBER = 1;
      private int serverId_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int TIPTYPS_FIELD_NUMBER = 3;
      private Internal.IntList tipTyps_;
      private byte memoizedIsInitialized;
      private static final C2S_FriendTipOff_6311 DEFAULT_INSTANCE = new C2S_FriendTipOff_6311();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FriendTipOff_6311> PARSER = new AbstractParser<C2S_FriendTipOff_6311>() {
         public C2S_FriendTipOff_6311 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FriendTipOff_6311(input, extensionRegistry);
         }
      };

      private C2S_FriendTipOff_6311(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FriendTipOff_6311() {
         this.memoizedIsInitialized = -1;
         this.tipTyps_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FriendTipOff_6311();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FriendTipOff_6311(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.tipTyps_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.tipTyps_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.tipTyps_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.tipTyps_.addInt(input.readInt32());
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
                  this.tipTyps_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendTipOff_6311_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendTipOff_6311_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FriendTipOff_6311.class, Builder.class);
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

      public List<Integer> getTipTypsList() {
         return this.tipTyps_;
      }

      public int getTipTypsCount() {
         return this.tipTyps_.size();
      }

      public int getTipTyps(int index) {
         return this.tipTyps_.getInt(index);
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

         for(int i = 0; i < this.tipTyps_.size(); ++i) {
            output.writeInt32(3, this.tipTyps_.getInt(i));
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

            int dataSize = 0;

            for(int i = 0; i < this.tipTyps_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.tipTyps_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTipTypsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FriendTipOff_6311)) {
            return super.equals(obj);
         } else {
            C2S_FriendTipOff_6311 other = (C2S_FriendTipOff_6311)obj;
            if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (!this.getTipTypsList().equals(other.getTipTypsList())) {
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

            if (this.getTipTypsCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTipTypsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FriendTipOff_6311 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FriendTipOff_6311)PARSER.parseFrom(data);
      }

      public static C2S_FriendTipOff_6311 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FriendTipOff_6311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FriendTipOff_6311 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FriendTipOff_6311)PARSER.parseFrom(data);
      }

      public static C2S_FriendTipOff_6311 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FriendTipOff_6311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FriendTipOff_6311 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FriendTipOff_6311)PARSER.parseFrom(data);
      }

      public static C2S_FriendTipOff_6311 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FriendTipOff_6311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FriendTipOff_6311 parseFrom(InputStream input) throws IOException {
         return (C2S_FriendTipOff_6311)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FriendTipOff_6311 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FriendTipOff_6311)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FriendTipOff_6311 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FriendTipOff_6311)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FriendTipOff_6311 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FriendTipOff_6311)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FriendTipOff_6311 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FriendTipOff_6311)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FriendTipOff_6311 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FriendTipOff_6311)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FriendTipOff_6311 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FriendTipOff_6311 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FriendTipOff_6311> parser() {
         return PARSER;
      }

      public Parser<C2S_FriendTipOff_6311> getParserForType() {
         return PARSER;
      }

      public C2S_FriendTipOff_6311 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FriendTipOff_6311OrBuilder {
         private int bitField0_;
         private int serverId_;
         private int playerId_;
         private Internal.IntList tipTyps_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendTipOff_6311_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendTipOff_6311_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FriendTipOff_6311.class, Builder.class);
         }

         private Builder() {
            this.tipTyps_ = FriendMsg.C2S_FriendTipOff_6311.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.tipTyps_ = FriendMsg.C2S_FriendTipOff_6311.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FriendMsg.C2S_FriendTipOff_6311.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.serverId_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.tipTyps_ = FriendMsg.C2S_FriendTipOff_6311.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FriendTipOff_6311_descriptor;
         }

         public C2S_FriendTipOff_6311 getDefaultInstanceForType() {
            return FriendMsg.C2S_FriendTipOff_6311.getDefaultInstance();
         }

         public C2S_FriendTipOff_6311 build() {
            C2S_FriendTipOff_6311 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FriendTipOff_6311 buildPartial() {
            C2S_FriendTipOff_6311 result = new C2S_FriendTipOff_6311(this);
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

            if ((this.bitField0_ & 4) != 0) {
               this.tipTyps_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.tipTyps_ = this.tipTyps_;
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
            if (other instanceof C2S_FriendTipOff_6311) {
               return this.mergeFrom((C2S_FriendTipOff_6311)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FriendTipOff_6311 other) {
            if (other == FriendMsg.C2S_FriendTipOff_6311.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (!other.tipTyps_.isEmpty()) {
                  if (this.tipTyps_.isEmpty()) {
                     this.tipTyps_ = other.tipTyps_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureTipTypsIsMutable();
                     this.tipTyps_.addAll(other.tipTyps_);
                  }

                  this.onChanged();
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
            C2S_FriendTipOff_6311 parsedMessage = null;

            try {
               parsedMessage = (C2S_FriendTipOff_6311)FriendMsg.C2S_FriendTipOff_6311.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FriendTipOff_6311)e.getUnfinishedMessage();
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

         private void ensureTipTypsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.tipTyps_ = FriendMsg.C2S_FriendTipOff_6311.mutableCopy(this.tipTyps_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getTipTypsList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.tipTyps_) : this.tipTyps_);
         }

         public int getTipTypsCount() {
            return this.tipTyps_.size();
         }

         public int getTipTyps(int index) {
            return this.tipTyps_.getInt(index);
         }

         public Builder setTipTyps(int index, int value) {
            this.ensureTipTypsIsMutable();
            this.tipTyps_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTipTyps(int value) {
            this.ensureTipTypsIsMutable();
            this.tipTyps_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTipTyps(Iterable<? extends Integer> values) {
            this.ensureTipTypsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.tipTyps_);
            this.onChanged();
            return this;
         }

         public Builder clearTipTyps() {
            this.tipTyps_ = FriendMsg.C2S_FriendTipOff_6311.emptyIntList();
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

   public static final class S2C_FriendTipOff_6312 extends GeneratedMessageV3 implements S2C_FriendTipOff_6312OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int SERVERID_FIELD_NUMBER = 2;
      private int serverId_;
      public static final int PLAYERID_FIELD_NUMBER = 3;
      private int playerId_;
      public static final int COUNT_FIELD_NUMBER = 4;
      private int count_;
      public static final int REPORTTIME_FIELD_NUMBER = 5;
      private int reportTime_;
      private byte memoizedIsInitialized;
      private static final S2C_FriendTipOff_6312 DEFAULT_INSTANCE = new S2C_FriendTipOff_6312();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FriendTipOff_6312> PARSER = new AbstractParser<S2C_FriendTipOff_6312>() {
         public S2C_FriendTipOff_6312 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FriendTipOff_6312(input, extensionRegistry);
         }
      };

      private S2C_FriendTipOff_6312(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FriendTipOff_6312() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FriendTipOff_6312();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FriendTipOff_6312(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.serverId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.playerId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.count_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.reportTime_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendTipOff_6312_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendTipOff_6312_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FriendTipOff_6312.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasCount() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getCount() {
         return this.count_;
      }

      public boolean hasReportTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getReportTime() {
         return this.reportTime_;
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
         } else if (!this.hasServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasReportTime()) {
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
            output.writeInt32(2, this.serverId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.playerId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.count_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.reportTime_);
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
               size += CodedOutputStream.computeInt32Size(2, this.serverId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.playerId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.count_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.reportTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FriendTipOff_6312)) {
            return super.equals(obj);
         } else {
            S2C_FriendTipOff_6312 other = (S2C_FriendTipOff_6312)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasCount() != other.hasCount()) {
               return false;
            } else if (this.hasCount() && this.getCount() != other.getCount()) {
               return false;
            } else if (this.hasReportTime() != other.hasReportTime()) {
               return false;
            } else if (this.hasReportTime() && this.getReportTime() != other.getReportTime()) {
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

            if (this.hasServerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasCount()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getCount();
            }

            if (this.hasReportTime()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getReportTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FriendTipOff_6312 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FriendTipOff_6312)PARSER.parseFrom(data);
      }

      public static S2C_FriendTipOff_6312 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FriendTipOff_6312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FriendTipOff_6312 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FriendTipOff_6312)PARSER.parseFrom(data);
      }

      public static S2C_FriendTipOff_6312 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FriendTipOff_6312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FriendTipOff_6312 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FriendTipOff_6312)PARSER.parseFrom(data);
      }

      public static S2C_FriendTipOff_6312 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FriendTipOff_6312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FriendTipOff_6312 parseFrom(InputStream input) throws IOException {
         return (S2C_FriendTipOff_6312)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FriendTipOff_6312 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FriendTipOff_6312)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FriendTipOff_6312 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FriendTipOff_6312)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FriendTipOff_6312 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FriendTipOff_6312)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FriendTipOff_6312 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FriendTipOff_6312)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FriendTipOff_6312 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FriendTipOff_6312)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FriendTipOff_6312 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FriendTipOff_6312 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FriendTipOff_6312> parser() {
         return PARSER;
      }

      public Parser<S2C_FriendTipOff_6312> getParserForType() {
         return PARSER;
      }

      public S2C_FriendTipOff_6312 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FriendTipOff_6312OrBuilder {
         private int bitField0_;
         private int result_;
         private int serverId_;
         private int playerId_;
         private int count_;
         private int reportTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendTipOff_6312_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendTipOff_6312_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FriendTipOff_6312.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FriendMsg.S2C_FriendTipOff_6312.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.serverId_ = 0;
            this.bitField0_ &= -3;
            this.playerId_ = 0;
            this.bitField0_ &= -5;
            this.count_ = 0;
            this.bitField0_ &= -9;
            this.reportTime_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_FriendTipOff_6312_descriptor;
         }

         public S2C_FriendTipOff_6312 getDefaultInstanceForType() {
            return FriendMsg.S2C_FriendTipOff_6312.getDefaultInstance();
         }

         public S2C_FriendTipOff_6312 build() {
            S2C_FriendTipOff_6312 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FriendTipOff_6312 buildPartial() {
            S2C_FriendTipOff_6312 result = new S2C_FriendTipOff_6312(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.count_ = this.count_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.reportTime_ = this.reportTime_;
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
            if (other instanceof S2C_FriendTipOff_6312) {
               return this.mergeFrom((S2C_FriendTipOff_6312)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FriendTipOff_6312 other) {
            if (other == FriendMsg.S2C_FriendTipOff_6312.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasCount()) {
                  this.setCount(other.getCount());
               }

               if (other.hasReportTime()) {
                  this.setReportTime(other.getReportTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasServerId()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasCount()) {
               return false;
            } else {
               return this.hasReportTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FriendTipOff_6312 parsedMessage = null;

            try {
               parsedMessage = (S2C_FriendTipOff_6312)FriendMsg.S2C_FriendTipOff_6312.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FriendTipOff_6312)e.getUnfinishedMessage();
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

         public boolean hasCount() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getCount() {
            return this.count_;
         }

         public Builder setCount(int value) {
            this.bitField0_ |= 8;
            this.count_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCount() {
            this.bitField0_ &= -9;
            this.count_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasReportTime() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getReportTime() {
            return this.reportTime_;
         }

         public Builder setReportTime(int value) {
            this.bitField0_ |= 16;
            this.reportTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearReportTime() {
            this.bitField0_ &= -17;
            this.reportTime_ = 0;
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

   public static final class C2S_ReportInfo_6313 extends GeneratedMessageV3 implements C2S_ReportInfo_6313OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ReportInfo_6313 DEFAULT_INSTANCE = new C2S_ReportInfo_6313();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReportInfo_6313> PARSER = new AbstractParser<C2S_ReportInfo_6313>() {
         public C2S_ReportInfo_6313 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReportInfo_6313(input, extensionRegistry);
         }
      };

      private C2S_ReportInfo_6313(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReportInfo_6313() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReportInfo_6313();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReportInfo_6313(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_ReportInfo_6313_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_ReportInfo_6313_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReportInfo_6313.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReportInfo_6313)) {
            return super.equals(obj);
         } else {
            C2S_ReportInfo_6313 other = (C2S_ReportInfo_6313)obj;
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

      public static C2S_ReportInfo_6313 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReportInfo_6313)PARSER.parseFrom(data);
      }

      public static C2S_ReportInfo_6313 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReportInfo_6313)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReportInfo_6313 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReportInfo_6313)PARSER.parseFrom(data);
      }

      public static C2S_ReportInfo_6313 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReportInfo_6313)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReportInfo_6313 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReportInfo_6313)PARSER.parseFrom(data);
      }

      public static C2S_ReportInfo_6313 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReportInfo_6313)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReportInfo_6313 parseFrom(InputStream input) throws IOException {
         return (C2S_ReportInfo_6313)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReportInfo_6313 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReportInfo_6313)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReportInfo_6313 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReportInfo_6313)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReportInfo_6313 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReportInfo_6313)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReportInfo_6313 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReportInfo_6313)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReportInfo_6313 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReportInfo_6313)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReportInfo_6313 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReportInfo_6313 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReportInfo_6313> parser() {
         return PARSER;
      }

      public Parser<C2S_ReportInfo_6313> getParserForType() {
         return PARSER;
      }

      public C2S_ReportInfo_6313 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReportInfo_6313OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_ReportInfo_6313_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_ReportInfo_6313_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReportInfo_6313.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FriendMsg.C2S_ReportInfo_6313.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_ReportInfo_6313_descriptor;
         }

         public C2S_ReportInfo_6313 getDefaultInstanceForType() {
            return FriendMsg.C2S_ReportInfo_6313.getDefaultInstance();
         }

         public C2S_ReportInfo_6313 build() {
            C2S_ReportInfo_6313 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReportInfo_6313 buildPartial() {
            C2S_ReportInfo_6313 result = new C2S_ReportInfo_6313(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ReportInfo_6313) {
               return this.mergeFrom((C2S_ReportInfo_6313)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReportInfo_6313 other) {
            if (other == FriendMsg.C2S_ReportInfo_6313.getDefaultInstance()) {
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
            C2S_ReportInfo_6313 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReportInfo_6313)FriendMsg.C2S_ReportInfo_6313.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReportInfo_6313)e.getUnfinishedMessage();
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

   public static final class S2C_ReportInfo_6314 extends GeneratedMessageV3 implements S2C_ReportInfo_6314OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HP_FIELD_NUMBER = 1;
      private int hp_;
      public static final int COUNT_FIELD_NUMBER = 2;
      private int count_;
      public static final int REPORTTIME_FIELD_NUMBER = 3;
      private int reportTime_;
      private byte memoizedIsInitialized;
      private static final S2C_ReportInfo_6314 DEFAULT_INSTANCE = new S2C_ReportInfo_6314();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ReportInfo_6314> PARSER = new AbstractParser<S2C_ReportInfo_6314>() {
         public S2C_ReportInfo_6314 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ReportInfo_6314(input, extensionRegistry);
         }
      };

      private S2C_ReportInfo_6314(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ReportInfo_6314() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ReportInfo_6314();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ReportInfo_6314(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.hp_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.count_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.reportTime_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_ReportInfo_6314_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_ReportInfo_6314_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReportInfo_6314.class, Builder.class);
      }

      public boolean hasHp() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHp() {
         return this.hp_;
      }

      public boolean hasCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCount() {
         return this.count_;
      }

      public boolean hasReportTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getReportTime() {
         return this.reportTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasReportTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.hp_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.count_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.reportTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.hp_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.count_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.reportTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ReportInfo_6314)) {
            return super.equals(obj);
         } else {
            S2C_ReportInfo_6314 other = (S2C_ReportInfo_6314)obj;
            if (this.hasHp() != other.hasHp()) {
               return false;
            } else if (this.hasHp() && this.getHp() != other.getHp()) {
               return false;
            } else if (this.hasCount() != other.hasCount()) {
               return false;
            } else if (this.hasCount() && this.getCount() != other.getCount()) {
               return false;
            } else if (this.hasReportTime() != other.hasReportTime()) {
               return false;
            } else if (this.hasReportTime() && this.getReportTime() != other.getReportTime()) {
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
            if (this.hasHp()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHp();
            }

            if (this.hasCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCount();
            }

            if (this.hasReportTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getReportTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ReportInfo_6314 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ReportInfo_6314)PARSER.parseFrom(data);
      }

      public static S2C_ReportInfo_6314 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReportInfo_6314)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReportInfo_6314 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ReportInfo_6314)PARSER.parseFrom(data);
      }

      public static S2C_ReportInfo_6314 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReportInfo_6314)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReportInfo_6314 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ReportInfo_6314)PARSER.parseFrom(data);
      }

      public static S2C_ReportInfo_6314 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReportInfo_6314)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReportInfo_6314 parseFrom(InputStream input) throws IOException {
         return (S2C_ReportInfo_6314)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReportInfo_6314 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReportInfo_6314)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReportInfo_6314 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ReportInfo_6314)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ReportInfo_6314 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReportInfo_6314)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReportInfo_6314 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ReportInfo_6314)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReportInfo_6314 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReportInfo_6314)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ReportInfo_6314 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ReportInfo_6314 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ReportInfo_6314> parser() {
         return PARSER;
      }

      public Parser<S2C_ReportInfo_6314> getParserForType() {
         return PARSER;
      }

      public S2C_ReportInfo_6314 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ReportInfo_6314OrBuilder {
         private int bitField0_;
         private int hp_;
         private int count_;
         private int reportTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_ReportInfo_6314_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_ReportInfo_6314_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReportInfo_6314.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FriendMsg.S2C_ReportInfo_6314.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.hp_ = 0;
            this.bitField0_ &= -2;
            this.count_ = 0;
            this.bitField0_ &= -3;
            this.reportTime_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2C_ReportInfo_6314_descriptor;
         }

         public S2C_ReportInfo_6314 getDefaultInstanceForType() {
            return FriendMsg.S2C_ReportInfo_6314.getDefaultInstance();
         }

         public S2C_ReportInfo_6314 build() {
            S2C_ReportInfo_6314 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ReportInfo_6314 buildPartial() {
            S2C_ReportInfo_6314 result = new S2C_ReportInfo_6314(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.hp_ = this.hp_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.count_ = this.count_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.reportTime_ = this.reportTime_;
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
            if (other instanceof S2C_ReportInfo_6314) {
               return this.mergeFrom((S2C_ReportInfo_6314)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ReportInfo_6314 other) {
            if (other == FriendMsg.S2C_ReportInfo_6314.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHp()) {
                  this.setHp(other.getHp());
               }

               if (other.hasCount()) {
                  this.setCount(other.getCount());
               }

               if (other.hasReportTime()) {
                  this.setReportTime(other.getReportTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHp()) {
               return false;
            } else if (!this.hasCount()) {
               return false;
            } else {
               return this.hasReportTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ReportInfo_6314 parsedMessage = null;

            try {
               parsedMessage = (S2C_ReportInfo_6314)FriendMsg.S2C_ReportInfo_6314.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ReportInfo_6314)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHp() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHp() {
            return this.hp_;
         }

         public Builder setHp(int value) {
            this.bitField0_ |= 1;
            this.hp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHp() {
            this.bitField0_ &= -2;
            this.hp_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCount() {
            return this.count_;
         }

         public Builder setCount(int value) {
            this.bitField0_ |= 2;
            this.count_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCount() {
            this.bitField0_ &= -3;
            this.count_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasReportTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getReportTime() {
            return this.reportTime_;
         }

         public Builder setReportTime(int value) {
            this.bitField0_ |= 4;
            this.reportTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearReportTime() {
            this.bitField0_ &= -5;
            this.reportTime_ = 0;
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

   public static final class S2S_ReportPlayer_6315 extends GeneratedMessageV3 implements S2S_ReportPlayer_6315OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REPORTFIGHT_FIELD_NUMBER = 1;
      private int reportFight_;
      private byte memoizedIsInitialized;
      private static final S2S_ReportPlayer_6315 DEFAULT_INSTANCE = new S2S_ReportPlayer_6315();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_ReportPlayer_6315> PARSER = new AbstractParser<S2S_ReportPlayer_6315>() {
         public S2S_ReportPlayer_6315 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_ReportPlayer_6315(input, extensionRegistry);
         }
      };

      private S2S_ReportPlayer_6315(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_ReportPlayer_6315() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_ReportPlayer_6315();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_ReportPlayer_6315(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.reportFight_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2S_ReportPlayer_6315_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2S_ReportPlayer_6315_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_ReportPlayer_6315.class, Builder.class);
      }

      public boolean hasReportFight() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getReportFight() {
         return this.reportFight_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasReportFight()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.reportFight_);
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
               size += CodedOutputStream.computeInt32Size(1, this.reportFight_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_ReportPlayer_6315)) {
            return super.equals(obj);
         } else {
            S2S_ReportPlayer_6315 other = (S2S_ReportPlayer_6315)obj;
            if (this.hasReportFight() != other.hasReportFight()) {
               return false;
            } else if (this.hasReportFight() && this.getReportFight() != other.getReportFight()) {
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
            if (this.hasReportFight()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getReportFight();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_ReportPlayer_6315 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_ReportPlayer_6315)PARSER.parseFrom(data);
      }

      public static S2S_ReportPlayer_6315 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_ReportPlayer_6315)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_ReportPlayer_6315 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_ReportPlayer_6315)PARSER.parseFrom(data);
      }

      public static S2S_ReportPlayer_6315 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_ReportPlayer_6315)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_ReportPlayer_6315 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_ReportPlayer_6315)PARSER.parseFrom(data);
      }

      public static S2S_ReportPlayer_6315 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_ReportPlayer_6315)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_ReportPlayer_6315 parseFrom(InputStream input) throws IOException {
         return (S2S_ReportPlayer_6315)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_ReportPlayer_6315 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_ReportPlayer_6315)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_ReportPlayer_6315 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_ReportPlayer_6315)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_ReportPlayer_6315 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_ReportPlayer_6315)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_ReportPlayer_6315 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_ReportPlayer_6315)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_ReportPlayer_6315 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_ReportPlayer_6315)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_ReportPlayer_6315 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_ReportPlayer_6315 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_ReportPlayer_6315> parser() {
         return PARSER;
      }

      public Parser<S2S_ReportPlayer_6315> getParserForType() {
         return PARSER;
      }

      public S2S_ReportPlayer_6315 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_ReportPlayer_6315OrBuilder {
         private int bitField0_;
         private int reportFight_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2S_ReportPlayer_6315_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2S_ReportPlayer_6315_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_ReportPlayer_6315.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FriendMsg.S2S_ReportPlayer_6315.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.reportFight_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2S_ReportPlayer_6315_descriptor;
         }

         public S2S_ReportPlayer_6315 getDefaultInstanceForType() {
            return FriendMsg.S2S_ReportPlayer_6315.getDefaultInstance();
         }

         public S2S_ReportPlayer_6315 build() {
            S2S_ReportPlayer_6315 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_ReportPlayer_6315 buildPartial() {
            S2S_ReportPlayer_6315 result = new S2S_ReportPlayer_6315(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.reportFight_ = this.reportFight_;
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
            if (other instanceof S2S_ReportPlayer_6315) {
               return this.mergeFrom((S2S_ReportPlayer_6315)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_ReportPlayer_6315 other) {
            if (other == FriendMsg.S2S_ReportPlayer_6315.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasReportFight()) {
                  this.setReportFight(other.getReportFight());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasReportFight();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_ReportPlayer_6315 parsedMessage = null;

            try {
               parsedMessage = (S2S_ReportPlayer_6315)FriendMsg.S2S_ReportPlayer_6315.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_ReportPlayer_6315)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasReportFight() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getReportFight() {
            return this.reportFight_;
         }

         public Builder setReportFight(int value) {
            this.bitField0_ |= 1;
            this.reportFight_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearReportFight() {
            this.bitField0_ &= -2;
            this.reportFight_ = 0;
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

   public static final class S2S_ReportResult_6317 extends GeneratedMessageV3 implements S2S_ReportResult_6317OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2S_ReportResult_6317 DEFAULT_INSTANCE = new S2S_ReportResult_6317();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_ReportResult_6317> PARSER = new AbstractParser<S2S_ReportResult_6317>() {
         public S2S_ReportResult_6317 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_ReportResult_6317(input, extensionRegistry);
         }
      };

      private S2S_ReportResult_6317(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_ReportResult_6317() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_ReportResult_6317();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_ReportResult_6317(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2S_ReportResult_6317_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2S_ReportResult_6317_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_ReportResult_6317.class, Builder.class);
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
         } else if (!(obj instanceof S2S_ReportResult_6317)) {
            return super.equals(obj);
         } else {
            S2S_ReportResult_6317 other = (S2S_ReportResult_6317)obj;
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

      public static S2S_ReportResult_6317 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_ReportResult_6317)PARSER.parseFrom(data);
      }

      public static S2S_ReportResult_6317 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_ReportResult_6317)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_ReportResult_6317 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_ReportResult_6317)PARSER.parseFrom(data);
      }

      public static S2S_ReportResult_6317 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_ReportResult_6317)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_ReportResult_6317 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_ReportResult_6317)PARSER.parseFrom(data);
      }

      public static S2S_ReportResult_6317 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_ReportResult_6317)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_ReportResult_6317 parseFrom(InputStream input) throws IOException {
         return (S2S_ReportResult_6317)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_ReportResult_6317 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_ReportResult_6317)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_ReportResult_6317 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_ReportResult_6317)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_ReportResult_6317 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_ReportResult_6317)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_ReportResult_6317 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_ReportResult_6317)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_ReportResult_6317 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_ReportResult_6317)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_ReportResult_6317 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_ReportResult_6317 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_ReportResult_6317> parser() {
         return PARSER;
      }

      public Parser<S2S_ReportResult_6317> getParserForType() {
         return PARSER;
      }

      public S2S_ReportResult_6317 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_ReportResult_6317OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2S_ReportResult_6317_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2S_ReportResult_6317_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_ReportResult_6317.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FriendMsg.S2S_ReportResult_6317.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_S2S_ReportResult_6317_descriptor;
         }

         public S2S_ReportResult_6317 getDefaultInstanceForType() {
            return FriendMsg.S2S_ReportResult_6317.getDefaultInstance();
         }

         public S2S_ReportResult_6317 build() {
            S2S_ReportResult_6317 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_ReportResult_6317 buildPartial() {
            S2S_ReportResult_6317 result = new S2S_ReportResult_6317(this);
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
            if (other instanceof S2S_ReportResult_6317) {
               return this.mergeFrom((S2S_ReportResult_6317)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_ReportResult_6317 other) {
            if (other == FriendMsg.S2S_ReportResult_6317.getDefaultInstance()) {
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
            S2S_ReportResult_6317 parsedMessage = null;

            try {
               parsedMessage = (S2S_ReportResult_6317)FriendMsg.S2S_ReportResult_6317.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_ReportResult_6317)e.getUnfinishedMessage();
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

   public static final class C2S_FlushCrossPkList_6319 extends GeneratedMessageV3 implements C2S_FlushCrossPkList_6319OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MATCHPOWERMIN_FIELD_NUMBER = 1;
      private long matchPowerMin_;
      public static final int MATCHPOWERMAX_FIELD_NUMBER = 2;
      private long matchPowerMax_;
      public static final int PLAYERNAME_FIELD_NUMBER = 3;
      private volatile Object playerName_;
      private byte memoizedIsInitialized;
      private static final C2S_FlushCrossPkList_6319 DEFAULT_INSTANCE = new C2S_FlushCrossPkList_6319();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FlushCrossPkList_6319> PARSER = new AbstractParser<C2S_FlushCrossPkList_6319>() {
         public C2S_FlushCrossPkList_6319 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FlushCrossPkList_6319(input, extensionRegistry);
         }
      };

      private C2S_FlushCrossPkList_6319(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FlushCrossPkList_6319() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FlushCrossPkList_6319();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FlushCrossPkList_6319(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.matchPowerMin_ = input.readInt64();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.matchPowerMax_ = input.readInt64();
                        break;
                     case 26:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.playerName_ = bs;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FlushCrossPkList_6319_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FlushCrossPkList_6319_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FlushCrossPkList_6319.class, Builder.class);
      }

      public boolean hasMatchPowerMin() {
         return (this.bitField0_ & 1) != 0;
      }

      public long getMatchPowerMin() {
         return this.matchPowerMin_;
      }

      public boolean hasMatchPowerMax() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getMatchPowerMax() {
         return this.matchPowerMax_;
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

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMatchPowerMin()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMatchPowerMax()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt64(1, this.matchPowerMin_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.matchPowerMax_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.playerName_);
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
               size += CodedOutputStream.computeInt64Size(1, this.matchPowerMin_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.matchPowerMax_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.playerName_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FlushCrossPkList_6319)) {
            return super.equals(obj);
         } else {
            C2S_FlushCrossPkList_6319 other = (C2S_FlushCrossPkList_6319)obj;
            if (this.hasMatchPowerMin() != other.hasMatchPowerMin()) {
               return false;
            } else if (this.hasMatchPowerMin() && this.getMatchPowerMin() != other.getMatchPowerMin()) {
               return false;
            } else if (this.hasMatchPowerMax() != other.hasMatchPowerMax()) {
               return false;
            } else if (this.hasMatchPowerMax() && this.getMatchPowerMax() != other.getMatchPowerMax()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
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
            if (this.hasMatchPowerMin()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashLong(this.getMatchPowerMin());
            }

            if (this.hasMatchPowerMax()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getMatchPowerMax());
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FlushCrossPkList_6319 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FlushCrossPkList_6319)PARSER.parseFrom(data);
      }

      public static C2S_FlushCrossPkList_6319 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FlushCrossPkList_6319)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FlushCrossPkList_6319 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FlushCrossPkList_6319)PARSER.parseFrom(data);
      }

      public static C2S_FlushCrossPkList_6319 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FlushCrossPkList_6319)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FlushCrossPkList_6319 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FlushCrossPkList_6319)PARSER.parseFrom(data);
      }

      public static C2S_FlushCrossPkList_6319 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FlushCrossPkList_6319)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FlushCrossPkList_6319 parseFrom(InputStream input) throws IOException {
         return (C2S_FlushCrossPkList_6319)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FlushCrossPkList_6319 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FlushCrossPkList_6319)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FlushCrossPkList_6319 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FlushCrossPkList_6319)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FlushCrossPkList_6319 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FlushCrossPkList_6319)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FlushCrossPkList_6319 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FlushCrossPkList_6319)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FlushCrossPkList_6319 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FlushCrossPkList_6319)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FlushCrossPkList_6319 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FlushCrossPkList_6319 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FlushCrossPkList_6319> parser() {
         return PARSER;
      }

      public Parser<C2S_FlushCrossPkList_6319> getParserForType() {
         return PARSER;
      }

      public C2S_FlushCrossPkList_6319 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FlushCrossPkList_6319OrBuilder {
         private int bitField0_;
         private long matchPowerMin_;
         private long matchPowerMax_;
         private Object playerName_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FlushCrossPkList_6319_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FlushCrossPkList_6319_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FlushCrossPkList_6319.class, Builder.class);
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
            if (FriendMsg.C2S_FlushCrossPkList_6319.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.matchPowerMin_ = 0L;
            this.bitField0_ &= -2;
            this.matchPowerMax_ = 0L;
            this.bitField0_ &= -3;
            this.playerName_ = "";
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FriendMsg.internal_static_friend_com_gzbz_protobuf_C2S_FlushCrossPkList_6319_descriptor;
         }

         public C2S_FlushCrossPkList_6319 getDefaultInstanceForType() {
            return FriendMsg.C2S_FlushCrossPkList_6319.getDefaultInstance();
         }

         public C2S_FlushCrossPkList_6319 build() {
            C2S_FlushCrossPkList_6319 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FlushCrossPkList_6319 buildPartial() {
            C2S_FlushCrossPkList_6319 result = new C2S_FlushCrossPkList_6319(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.matchPowerMin_ = this.matchPowerMin_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.matchPowerMax_ = this.matchPowerMax_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.playerName_ = this.playerName_;
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
            if (other instanceof C2S_FlushCrossPkList_6319) {
               return this.mergeFrom((C2S_FlushCrossPkList_6319)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FlushCrossPkList_6319 other) {
            if (other == FriendMsg.C2S_FlushCrossPkList_6319.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMatchPowerMin()) {
                  this.setMatchPowerMin(other.getMatchPowerMin());
               }

               if (other.hasMatchPowerMax()) {
                  this.setMatchPowerMax(other.getMatchPowerMax());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 4;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasMatchPowerMin()) {
               return false;
            } else {
               return this.hasMatchPowerMax();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_FlushCrossPkList_6319 parsedMessage = null;

            try {
               parsedMessage = (C2S_FlushCrossPkList_6319)FriendMsg.C2S_FlushCrossPkList_6319.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FlushCrossPkList_6319)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMatchPowerMin() {
            return (this.bitField0_ & 1) != 0;
         }

         public long getMatchPowerMin() {
            return this.matchPowerMin_;
         }

         public Builder setMatchPowerMin(long value) {
            this.bitField0_ |= 1;
            this.matchPowerMin_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMatchPowerMin() {
            this.bitField0_ &= -2;
            this.matchPowerMin_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasMatchPowerMax() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getMatchPowerMax() {
            return this.matchPowerMax_;
         }

         public Builder setMatchPowerMax(long value) {
            this.bitField0_ |= 2;
            this.matchPowerMax_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMatchPowerMax() {
            this.bitField0_ &= -3;
            this.matchPowerMax_ = 0L;
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
            this.playerName_ = FriendMsg.C2S_FlushCrossPkList_6319.getDefaultInstance().getPlayerName();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_FlushCrossPkList_6319OrBuilder extends MessageOrBuilder {
      boolean hasMatchPowerMin();

      long getMatchPowerMin();

      boolean hasMatchPowerMax();

      long getMatchPowerMax();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();
   }

   public interface C2S_FriendBaseInfo_6307OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();
   }

   public interface C2S_FriendList_6301OrBuilder extends MessageOrBuilder {
      boolean hasTypeData();

      int getTypeData();
   }

   public interface C2S_FriendOperate_6303OrBuilder extends MessageOrBuilder {
      boolean hasTypeOperate();

      int getTypeOperate();

      List<Integer> getPlayerIdList();

      int getPlayerIdCount();

      int getPlayerId(int index);
   }

   public interface C2S_FriendSearch_6305OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();
   }

   public interface C2S_FriendTipOff_6311OrBuilder extends MessageOrBuilder {
      boolean hasServerId();

      int getServerId();

      boolean hasPlayerId();

      int getPlayerId();

      List<Integer> getTipTypsList();

      int getTipTypsCount();

      int getTipTyps(int index);
   }

   public interface C2S_ReportInfo_6313OrBuilder extends MessageOrBuilder {
   }

   public interface Friend_InfoOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasSex();

      int getSex();

      boolean hasLv();

      int getLv();

      boolean hasVipLv();

      int getVipLv();

      boolean hasFight();

      long getFight();

      boolean hasHead();

      int getHead();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasOffline();

      int getOffline();

      boolean hasGiveState();

      int getGiveState();

      boolean hasPickUpState();

      int getPickUpState();

      boolean hasShowVip();

      boolean getShowVip();

      boolean hasServerId();

      int getServerId();

      boolean hasQqLogo();

      String getQqLogo();

      ByteString getQqLogoBytes();

      boolean hasQqWanKaLv();

      int getQqWanKaLv();
   }

   public interface S2C_FriendBaseInfo_6308OrBuilder extends MessageOrBuilder {
      boolean hasGiveTimes();

      int getGiveTimes();
   }

   public interface S2C_FriendList_6302OrBuilder extends MessageOrBuilder {
      boolean hasTypeData();

      int getTypeData();

      List<Friend_Info> getInfoList();

      Friend_Info getInfo(int index);

      int getInfoCount();

      List<? extends Friend_InfoOrBuilder> getInfoOrBuilderList();

      Friend_InfoOrBuilder getInfoOrBuilder(int index);

      List<Integer> getBlacklistList();

      int getBlacklistCount();

      int getBlacklist(int index);
   }

   public interface S2C_FriendOnline_6310OrBuilder extends MessageOrBuilder {
      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();
   }

   public interface S2C_FriendOperate_6304OrBuilder extends MessageOrBuilder {
      boolean hasRelation();

      int getRelation();

      boolean hasTypeOperate();

      int getTypeOperate();

      List<Integer> getPlayerIdList();

      int getPlayerIdCount();

      int getPlayerId(int index);

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();
   }

   public interface S2C_FriendSearch_6306OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasType();

      int getType();

      List<Friend_Info> getFriendInfosList();

      Friend_Info getFriendInfos(int index);

      int getFriendInfosCount();

      List<? extends Friend_InfoOrBuilder> getFriendInfosOrBuilderList();

      Friend_InfoOrBuilder getFriendInfosOrBuilder(int index);
   }

   public interface S2C_FriendTipOff_6312OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasServerId();

      int getServerId();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasCount();

      int getCount();

      boolean hasReportTime();

      int getReportTime();
   }

   public interface S2C_ReportInfo_6314OrBuilder extends MessageOrBuilder {
      boolean hasHp();

      int getHp();

      boolean hasCount();

      int getCount();

      boolean hasReportTime();

      int getReportTime();
   }

   public interface S2S_ReportPlayer_6315OrBuilder extends MessageOrBuilder {
      boolean hasReportFight();

      int getReportFight();
   }

   public interface S2S_ReportResult_6317OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }
}
