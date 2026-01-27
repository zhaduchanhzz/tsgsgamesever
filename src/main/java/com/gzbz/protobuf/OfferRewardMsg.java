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

public final class OfferRewardMsg {
   private static final Descriptors.Descriptor internal_static_offerReward_com_gzbz_protobuf_OfferRewardInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_offerReward_com_gzbz_protobuf_OfferRewardInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_offerReward_com_gzbz_protobuf_C2S_EnterView_14401_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_offerReward_com_gzbz_protobuf_C2S_EnterView_14401_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_offerReward_com_gzbz_protobuf_S2C_EnterView_14402_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_offerReward_com_gzbz_protobuf_S2C_EnterView_14402_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_offerReward_com_gzbz_protobuf_C2S_Publish_14403_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_offerReward_com_gzbz_protobuf_C2S_Publish_14403_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_offerReward_com_gzbz_protobuf_S2C_Publish_14404_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_offerReward_com_gzbz_protobuf_S2C_Publish_14404_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_offerReward_com_gzbz_protobuf_C2S_PublishCommit_14405_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_offerReward_com_gzbz_protobuf_C2S_PublishCommit_14405_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_offerReward_com_gzbz_protobuf_S2C_PublishCommit_14406_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_offerReward_com_gzbz_protobuf_S2C_PublishCommit_14406_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_offerReward_com_gzbz_protobuf_S2C_AddOffer_14408_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_offerReward_com_gzbz_protobuf_S2C_AddOffer_14408_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_offerReward_com_gzbz_protobuf_S2C_DelOffer_14410_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_offerReward_com_gzbz_protobuf_S2C_DelOffer_14410_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_offerReward_com_gzbz_protobuf_S2C_UpdateOffer_14412_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_offerReward_com_gzbz_protobuf_S2C_UpdateOffer_14412_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_offerReward_com_gzbz_protobuf_S2C_Fight_14414_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_offerReward_com_gzbz_protobuf_S2C_Fight_14414_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_offerReward_com_gzbz_protobuf_C2S_InviteFriend_14415_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_offerReward_com_gzbz_protobuf_C2S_InviteFriend_14415_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_offerReward_com_gzbz_protobuf_S2C_BeInvite_14416_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_offerReward_com_gzbz_protobuf_S2C_BeInvite_14416_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_offerReward_com_gzbz_protobuf_C2S_HadInvited_14417_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_offerReward_com_gzbz_protobuf_C2S_HadInvited_14417_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_offerReward_com_gzbz_protobuf_S2C_HadInvited_14418_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_offerReward_com_gzbz_protobuf_S2C_HadInvited_14418_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private OfferRewardMsg() {
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
      String[] descriptorData = new String[]{"\n\u0011OfferReward.proto\u0012\u001dofferReward.com.gzbz.protobuf\u001a\nRank.proto\"¦\u0001\n\u000fOfferRewardInfo\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0002(\t\u0012\u0012\n\ncreateTime\u0018\u0004 \u0002(\u0005\u0012\u0011\n\thpPersent\u0018\u0005 \u0002(\u0005\u0012\f\n\u0004head\u0018\u0006 \u0002(\u0005\u0012\u0011\n\theadFrame\u0018\u0007 \u0002(\u0005\u0012\f\n\u0004type\u0018\b \u0002(\u0005\u0012\u000f\n\u0007unionId\u0018\t \u0001(\u0005\"$\n\u0013C2S_EnterView_14401\u0012\r\n\u0005enter\u0018\u0001 \u0002(\u0005\"\u008c\u0001\n\u0013S2C_EnterView_14402\u0012\u0011\n\trewardNum\u0018\u0001 \u0002(\u0005\u0012\u0012\n\npublishSec\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bfightNum\u0018\u0003 \u0002(\u0005\u0012<\n\u0004info\u0018\u0004 \u0003(\u000b2..offerReward.com.gzbz.protobuf.OfferRewardInfo\"\u0013\n\u0011C2S_Publish_14403\"\u001f\n\u0011S2C_Publish_14404\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"7\n\u0017C2S_PublishCommit_14405\u0012\u000e\n\u0006opType\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0002 \u0001(\u0005\"-\n\u0017S2C_PublishCommit_14406\u0012\u0012\n\npublishSec\u0018\u0001 \u0002(\u0005\"R\n\u0012S2C_AddOffer_14408\u0012<\n\u0004info\u0018\u0001 \u0002(\u000b2..offerReward.com.gzbz.protobuf.OfferRewardInfo\"#\n\u0012S2C_DelOffer_14410\u0012\r\n\u0005codes\u0018\u0001 \u0003(\u0005\"U\n\u0015S2C_UpdateOffer_14412\u0012<\n\u0004info\u0018\u0001 \u0002(\u000b2..offerReward.com.gzbz.protobuf.OfferRewardInfo\"#\n\u000fS2C_Fight_14414\u0012\u0010\n\bfightNum\u0018\u0001 \u0002(\u0005\":\n\u0016C2S_InviteFriend_14415\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nfriendCode\u0018\u0002 \u0003(\u0005\"3\n\u0012S2C_BeInvite_14416\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007inviter\u0018\u0002 \u0002(\u0005\"$\n\u0014C2S_HadInvited_14417\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\")\n\u0014S2C_HadInvited_14418\u0012\u0011\n\tplayerIds\u0018\u0001 \u0003(\u0005B%\n\u0011com.gzbz.protobufB\u000eOfferRewardMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{RankMsg.getDescriptor()});
      internal_static_offerReward_com_gzbz_protobuf_OfferRewardInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_offerReward_com_gzbz_protobuf_OfferRewardInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_offerReward_com_gzbz_protobuf_OfferRewardInfo_descriptor, new String[]{"Code", "Id", "PlayerName", "CreateTime", "HpPersent", "Head", "HeadFrame", "Type", "UnionId"});
      internal_static_offerReward_com_gzbz_protobuf_C2S_EnterView_14401_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_offerReward_com_gzbz_protobuf_C2S_EnterView_14401_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_offerReward_com_gzbz_protobuf_C2S_EnterView_14401_descriptor, new String[]{"Enter"});
      internal_static_offerReward_com_gzbz_protobuf_S2C_EnterView_14402_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_offerReward_com_gzbz_protobuf_S2C_EnterView_14402_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_offerReward_com_gzbz_protobuf_S2C_EnterView_14402_descriptor, new String[]{"RewardNum", "PublishSec", "FightNum", "Info"});
      internal_static_offerReward_com_gzbz_protobuf_C2S_Publish_14403_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_offerReward_com_gzbz_protobuf_C2S_Publish_14403_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_offerReward_com_gzbz_protobuf_C2S_Publish_14403_descriptor, new String[0]);
      internal_static_offerReward_com_gzbz_protobuf_S2C_Publish_14404_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_offerReward_com_gzbz_protobuf_S2C_Publish_14404_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_offerReward_com_gzbz_protobuf_S2C_Publish_14404_descriptor, new String[]{"Id"});
      internal_static_offerReward_com_gzbz_protobuf_C2S_PublishCommit_14405_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_offerReward_com_gzbz_protobuf_C2S_PublishCommit_14405_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_offerReward_com_gzbz_protobuf_C2S_PublishCommit_14405_descriptor, new String[]{"OpType", "Type"});
      internal_static_offerReward_com_gzbz_protobuf_S2C_PublishCommit_14406_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_offerReward_com_gzbz_protobuf_S2C_PublishCommit_14406_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_offerReward_com_gzbz_protobuf_S2C_PublishCommit_14406_descriptor, new String[]{"PublishSec"});
      internal_static_offerReward_com_gzbz_protobuf_S2C_AddOffer_14408_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_offerReward_com_gzbz_protobuf_S2C_AddOffer_14408_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_offerReward_com_gzbz_protobuf_S2C_AddOffer_14408_descriptor, new String[]{"Info"});
      internal_static_offerReward_com_gzbz_protobuf_S2C_DelOffer_14410_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_offerReward_com_gzbz_protobuf_S2C_DelOffer_14410_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_offerReward_com_gzbz_protobuf_S2C_DelOffer_14410_descriptor, new String[]{"Codes"});
      internal_static_offerReward_com_gzbz_protobuf_S2C_UpdateOffer_14412_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_offerReward_com_gzbz_protobuf_S2C_UpdateOffer_14412_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_offerReward_com_gzbz_protobuf_S2C_UpdateOffer_14412_descriptor, new String[]{"Info"});
      internal_static_offerReward_com_gzbz_protobuf_S2C_Fight_14414_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_offerReward_com_gzbz_protobuf_S2C_Fight_14414_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_offerReward_com_gzbz_protobuf_S2C_Fight_14414_descriptor, new String[]{"FightNum"});
      internal_static_offerReward_com_gzbz_protobuf_C2S_InviteFriend_14415_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_offerReward_com_gzbz_protobuf_C2S_InviteFriend_14415_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_offerReward_com_gzbz_protobuf_C2S_InviteFriend_14415_descriptor, new String[]{"Code", "FriendCode"});
      internal_static_offerReward_com_gzbz_protobuf_S2C_BeInvite_14416_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_offerReward_com_gzbz_protobuf_S2C_BeInvite_14416_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_offerReward_com_gzbz_protobuf_S2C_BeInvite_14416_descriptor, new String[]{"Code", "Inviter"});
      internal_static_offerReward_com_gzbz_protobuf_C2S_HadInvited_14417_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_offerReward_com_gzbz_protobuf_C2S_HadInvited_14417_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_offerReward_com_gzbz_protobuf_C2S_HadInvited_14417_descriptor, new String[]{"Code"});
      internal_static_offerReward_com_gzbz_protobuf_S2C_HadInvited_14418_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_offerReward_com_gzbz_protobuf_S2C_HadInvited_14418_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_offerReward_com_gzbz_protobuf_S2C_HadInvited_14418_descriptor, new String[]{"PlayerIds"});
      RankMsg.getDescriptor();
   }

   public static final class OfferRewardInfo extends GeneratedMessageV3 implements OfferRewardInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int ID_FIELD_NUMBER = 2;
      private int id_;
      public static final int PLAYERNAME_FIELD_NUMBER = 3;
      private volatile Object playerName_;
      public static final int CREATETIME_FIELD_NUMBER = 4;
      private int createTime_;
      public static final int HPPERSENT_FIELD_NUMBER = 5;
      private int hpPersent_;
      public static final int HEAD_FIELD_NUMBER = 6;
      private int head_;
      public static final int HEADFRAME_FIELD_NUMBER = 7;
      private int headFrame_;
      public static final int TYPE_FIELD_NUMBER = 8;
      private int type_;
      public static final int UNIONID_FIELD_NUMBER = 9;
      private int unionId_;
      private byte memoizedIsInitialized;
      private static final OfferRewardInfo DEFAULT_INSTANCE = new OfferRewardInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<OfferRewardInfo> PARSER = new AbstractParser<OfferRewardInfo>() {
         public OfferRewardInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new OfferRewardInfo(input, extensionRegistry);
         }
      };

      private OfferRewardInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private OfferRewardInfo() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new OfferRewardInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private OfferRewardInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.id_ = input.readInt32();
                        break;
                     case 26:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.playerName_ = bs;
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.createTime_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.hpPersent_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.head_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.type_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.unionId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_OfferRewardInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_OfferRewardInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(OfferRewardInfo.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getId() {
         return this.id_;
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

      public boolean hasCreateTime() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getCreateTime() {
         return this.createTime_;
      }

      public boolean hasHpPersent() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getHpPersent() {
         return this.hpPersent_;
      }

      public boolean hasHead() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasUnionId() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCreateTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHpPersent()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeadFrame()) {
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
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.id_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.playerName_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.createTime_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.hpPersent_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.head_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.headFrame_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.type_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.unionId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.id_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.playerName_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.createTime_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.hpPersent_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.head_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.headFrame_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.type_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.unionId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof OfferRewardInfo)) {
            return super.equals(obj);
         } else {
            OfferRewardInfo other = (OfferRewardInfo)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasCreateTime() != other.hasCreateTime()) {
               return false;
            } else if (this.hasCreateTime() && this.getCreateTime() != other.getCreateTime()) {
               return false;
            } else if (this.hasHpPersent() != other.hasHpPersent()) {
               return false;
            } else if (this.hasHpPersent() && this.getHpPersent() != other.getHpPersent()) {
               return false;
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getId();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasCreateTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getCreateTime();
            }

            if (this.hasHpPersent()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getHpPersent();
            }

            if (this.hasHead()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasType()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getType();
            }

            if (this.hasUnionId()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getUnionId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static OfferRewardInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (OfferRewardInfo)PARSER.parseFrom(data);
      }

      public static OfferRewardInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (OfferRewardInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static OfferRewardInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (OfferRewardInfo)PARSER.parseFrom(data);
      }

      public static OfferRewardInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (OfferRewardInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static OfferRewardInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (OfferRewardInfo)PARSER.parseFrom(data);
      }

      public static OfferRewardInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (OfferRewardInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static OfferRewardInfo parseFrom(InputStream input) throws IOException {
         return (OfferRewardInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static OfferRewardInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (OfferRewardInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static OfferRewardInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (OfferRewardInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static OfferRewardInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (OfferRewardInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static OfferRewardInfo parseFrom(CodedInputStream input) throws IOException {
         return (OfferRewardInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static OfferRewardInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (OfferRewardInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(OfferRewardInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static OfferRewardInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<OfferRewardInfo> parser() {
         return PARSER;
      }

      public Parser<OfferRewardInfo> getParserForType() {
         return PARSER;
      }

      public OfferRewardInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OfferRewardInfoOrBuilder {
         private int bitField0_;
         private int code_;
         private int id_;
         private Object playerName_;
         private int createTime_;
         private int hpPersent_;
         private int head_;
         private int headFrame_;
         private int type_;
         private int unionId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_OfferRewardInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_OfferRewardInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(OfferRewardInfo.class, Builder.class);
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
            if (OfferRewardMsg.OfferRewardInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.id_ = 0;
            this.bitField0_ &= -3;
            this.playerName_ = "";
            this.bitField0_ &= -5;
            this.createTime_ = 0;
            this.bitField0_ &= -9;
            this.hpPersent_ = 0;
            this.bitField0_ &= -17;
            this.head_ = 0;
            this.bitField0_ &= -33;
            this.headFrame_ = 0;
            this.bitField0_ &= -65;
            this.type_ = 0;
            this.bitField0_ &= -129;
            this.unionId_ = 0;
            this.bitField0_ &= -257;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_OfferRewardInfo_descriptor;
         }

         public OfferRewardInfo getDefaultInstanceForType() {
            return OfferRewardMsg.OfferRewardInfo.getDefaultInstance();
         }

         public OfferRewardInfo build() {
            OfferRewardInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public OfferRewardInfo buildPartial() {
            OfferRewardInfo result = new OfferRewardInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 8) != 0) {
               result.createTime_ = this.createTime_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.hpPersent_ = this.hpPersent_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.unionId_ = this.unionId_;
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
            if (other instanceof OfferRewardInfo) {
               return this.mergeFrom((OfferRewardInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(OfferRewardInfo other) {
            if (other == OfferRewardMsg.OfferRewardInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 4;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasCreateTime()) {
                  this.setCreateTime(other.getCreateTime());
               }

               if (other.hasHpPersent()) {
                  this.setHpPersent(other.getHpPersent());
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else if (!this.hasId()) {
               return false;
            } else if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasCreateTime()) {
               return false;
            } else if (!this.hasHpPersent()) {
               return false;
            } else if (!this.hasHead()) {
               return false;
            } else if (!this.hasHeadFrame()) {
               return false;
            } else {
               return this.hasType();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            OfferRewardInfo parsedMessage = null;

            try {
               parsedMessage = (OfferRewardInfo)OfferRewardMsg.OfferRewardInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (OfferRewardInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getId() {
            return this.id_;
         }

         public Builder setId(int value) {
            this.bitField0_ |= 2;
            this.id_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearId() {
            this.bitField0_ &= -3;
            this.id_ = 0;
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
            this.playerName_ = OfferRewardMsg.OfferRewardInfo.getDefaultInstance().getPlayerName();
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

         public boolean hasCreateTime() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getCreateTime() {
            return this.createTime_;
         }

         public Builder setCreateTime(int value) {
            this.bitField0_ |= 8;
            this.createTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCreateTime() {
            this.bitField0_ &= -9;
            this.createTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHpPersent() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getHpPersent() {
            return this.hpPersent_;
         }

         public Builder setHpPersent(int value) {
            this.bitField0_ |= 16;
            this.hpPersent_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHpPersent() {
            this.bitField0_ &= -17;
            this.hpPersent_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHead() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getHead() {
            return this.head_;
         }

         public Builder setHead(int value) {
            this.bitField0_ |= 32;
            this.head_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHead() {
            this.bitField0_ &= -33;
            this.head_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeadFrame() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getHeadFrame() {
            return this.headFrame_;
         }

         public Builder setHeadFrame(int value) {
            this.bitField0_ |= 64;
            this.headFrame_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadFrame() {
            this.bitField0_ &= -65;
            this.headFrame_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 128;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -129;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionId() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getUnionId() {
            return this.unionId_;
         }

         public Builder setUnionId(int value) {
            this.bitField0_ |= 256;
            this.unionId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionId() {
            this.bitField0_ &= -257;
            this.unionId_ = 0;
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

   public static final class C2S_EnterView_14401 extends GeneratedMessageV3 implements C2S_EnterView_14401OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ENTER_FIELD_NUMBER = 1;
      private int enter_;
      private byte memoizedIsInitialized;
      private static final C2S_EnterView_14401 DEFAULT_INSTANCE = new C2S_EnterView_14401();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_EnterView_14401> PARSER = new AbstractParser<C2S_EnterView_14401>() {
         public C2S_EnterView_14401 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_EnterView_14401(input, extensionRegistry);
         }
      };

      private C2S_EnterView_14401(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_EnterView_14401() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_EnterView_14401();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_EnterView_14401(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.enter_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_EnterView_14401_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_EnterView_14401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnterView_14401.class, Builder.class);
      }

      public boolean hasEnter() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getEnter() {
         return this.enter_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasEnter()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.enter_);
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
               size += CodedOutputStream.computeInt32Size(1, this.enter_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_EnterView_14401)) {
            return super.equals(obj);
         } else {
            C2S_EnterView_14401 other = (C2S_EnterView_14401)obj;
            if (this.hasEnter() != other.hasEnter()) {
               return false;
            } else if (this.hasEnter() && this.getEnter() != other.getEnter()) {
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
            if (this.hasEnter()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEnter();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_EnterView_14401 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_EnterView_14401)PARSER.parseFrom(data);
      }

      public static C2S_EnterView_14401 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterView_14401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterView_14401 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_EnterView_14401)PARSER.parseFrom(data);
      }

      public static C2S_EnterView_14401 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterView_14401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterView_14401 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_EnterView_14401)PARSER.parseFrom(data);
      }

      public static C2S_EnterView_14401 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterView_14401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterView_14401 parseFrom(InputStream input) throws IOException {
         return (C2S_EnterView_14401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnterView_14401 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterView_14401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnterView_14401 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_EnterView_14401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_EnterView_14401 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterView_14401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnterView_14401 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_EnterView_14401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnterView_14401 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterView_14401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_EnterView_14401 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_EnterView_14401 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_EnterView_14401> parser() {
         return PARSER;
      }

      public Parser<C2S_EnterView_14401> getParserForType() {
         return PARSER;
      }

      public C2S_EnterView_14401 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_EnterView_14401OrBuilder {
         private int bitField0_;
         private int enter_;

         public static final Descriptors.Descriptor getDescriptor() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_EnterView_14401_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_EnterView_14401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnterView_14401.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (OfferRewardMsg.C2S_EnterView_14401.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.enter_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_EnterView_14401_descriptor;
         }

         public C2S_EnterView_14401 getDefaultInstanceForType() {
            return OfferRewardMsg.C2S_EnterView_14401.getDefaultInstance();
         }

         public C2S_EnterView_14401 build() {
            C2S_EnterView_14401 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_EnterView_14401 buildPartial() {
            C2S_EnterView_14401 result = new C2S_EnterView_14401(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.enter_ = this.enter_;
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
            if (other instanceof C2S_EnterView_14401) {
               return this.mergeFrom((C2S_EnterView_14401)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_EnterView_14401 other) {
            if (other == OfferRewardMsg.C2S_EnterView_14401.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEnter()) {
                  this.setEnter(other.getEnter());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasEnter();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_EnterView_14401 parsedMessage = null;

            try {
               parsedMessage = (C2S_EnterView_14401)OfferRewardMsg.C2S_EnterView_14401.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_EnterView_14401)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasEnter() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getEnter() {
            return this.enter_;
         }

         public Builder setEnter(int value) {
            this.bitField0_ |= 1;
            this.enter_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEnter() {
            this.bitField0_ &= -2;
            this.enter_ = 0;
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

   public static final class S2C_EnterView_14402 extends GeneratedMessageV3 implements S2C_EnterView_14402OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDNUM_FIELD_NUMBER = 1;
      private int rewardNum_;
      public static final int PUBLISHSEC_FIELD_NUMBER = 2;
      private int publishSec_;
      public static final int FIGHTNUM_FIELD_NUMBER = 3;
      private int fightNum_;
      public static final int INFO_FIELD_NUMBER = 4;
      private List<OfferRewardInfo> info_;
      private byte memoizedIsInitialized;
      private static final S2C_EnterView_14402 DEFAULT_INSTANCE = new S2C_EnterView_14402();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_EnterView_14402> PARSER = new AbstractParser<S2C_EnterView_14402>() {
         public S2C_EnterView_14402 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_EnterView_14402(input, extensionRegistry);
         }
      };

      private S2C_EnterView_14402(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_EnterView_14402() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_EnterView_14402();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_EnterView_14402(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rewardNum_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.publishSec_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.fightNum_ = input.readInt32();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.info_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.info_.add(input.readMessage(OfferRewardMsg.OfferRewardInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.info_ = Collections.unmodifiableList(this.info_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_EnterView_14402_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_EnterView_14402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnterView_14402.class, Builder.class);
      }

      public boolean hasRewardNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRewardNum() {
         return this.rewardNum_;
      }

      public boolean hasPublishSec() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPublishSec() {
         return this.publishSec_;
      }

      public boolean hasFightNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getFightNum() {
         return this.fightNum_;
      }

      public List<OfferRewardInfo> getInfoList() {
         return this.info_;
      }

      public List<? extends OfferRewardInfoOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public OfferRewardInfo getInfo(int index) {
         return (OfferRewardInfo)this.info_.get(index);
      }

      public OfferRewardInfoOrBuilder getInfoOrBuilder(int index) {
         return (OfferRewardInfoOrBuilder)this.info_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRewardNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPublishSec()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFightNum()) {
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
            output.writeInt32(1, this.rewardNum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.publishSec_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.fightNum_);
         }

         for(int i = 0; i < this.info_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.info_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.rewardNum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.publishSec_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.fightNum_);
            }

            for(int i = 0; i < this.info_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.info_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_EnterView_14402)) {
            return super.equals(obj);
         } else {
            S2C_EnterView_14402 other = (S2C_EnterView_14402)obj;
            if (this.hasRewardNum() != other.hasRewardNum()) {
               return false;
            } else if (this.hasRewardNum() && this.getRewardNum() != other.getRewardNum()) {
               return false;
            } else if (this.hasPublishSec() != other.hasPublishSec()) {
               return false;
            } else if (this.hasPublishSec() && this.getPublishSec() != other.getPublishSec()) {
               return false;
            } else if (this.hasFightNum() != other.hasFightNum()) {
               return false;
            } else if (this.hasFightNum() && this.getFightNum() != other.getFightNum()) {
               return false;
            } else if (!this.getInfoList().equals(other.getInfoList())) {
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
            if (this.hasRewardNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRewardNum();
            }

            if (this.hasPublishSec()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPublishSec();
            }

            if (this.hasFightNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getFightNum();
            }

            if (this.getInfoCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_EnterView_14402 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_EnterView_14402)PARSER.parseFrom(data);
      }

      public static S2C_EnterView_14402 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnterView_14402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnterView_14402 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_EnterView_14402)PARSER.parseFrom(data);
      }

      public static S2C_EnterView_14402 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnterView_14402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnterView_14402 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_EnterView_14402)PARSER.parseFrom(data);
      }

      public static S2C_EnterView_14402 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnterView_14402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnterView_14402 parseFrom(InputStream input) throws IOException {
         return (S2C_EnterView_14402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnterView_14402 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnterView_14402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnterView_14402 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_EnterView_14402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_EnterView_14402 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnterView_14402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnterView_14402 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_EnterView_14402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnterView_14402 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnterView_14402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_EnterView_14402 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_EnterView_14402 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_EnterView_14402> parser() {
         return PARSER;
      }

      public Parser<S2C_EnterView_14402> getParserForType() {
         return PARSER;
      }

      public S2C_EnterView_14402 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_EnterView_14402OrBuilder {
         private int bitField0_;
         private int rewardNum_;
         private int publishSec_;
         private int fightNum_;
         private List<OfferRewardInfo> info_;
         private RepeatedFieldBuilderV3<OfferRewardInfo, OfferRewardInfo.Builder, OfferRewardInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_EnterView_14402_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_EnterView_14402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnterView_14402.class, Builder.class);
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
            if (OfferRewardMsg.S2C_EnterView_14402.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardNum_ = 0;
            this.bitField0_ &= -2;
            this.publishSec_ = 0;
            this.bitField0_ &= -3;
            this.fightNum_ = 0;
            this.bitField0_ &= -5;
            if (this.infoBuilder_ == null) {
               this.info_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.infoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_EnterView_14402_descriptor;
         }

         public S2C_EnterView_14402 getDefaultInstanceForType() {
            return OfferRewardMsg.S2C_EnterView_14402.getDefaultInstance();
         }

         public S2C_EnterView_14402 build() {
            S2C_EnterView_14402 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_EnterView_14402 buildPartial() {
            S2C_EnterView_14402 result = new S2C_EnterView_14402(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rewardNum_ = this.rewardNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.publishSec_ = this.publishSec_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.fightNum_ = this.fightNum_;
               to_bitField0_ |= 4;
            }

            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.info_ = Collections.unmodifiableList(this.info_);
                  this.bitField0_ &= -9;
               }

               result.info_ = this.info_;
            } else {
               result.info_ = this.infoBuilder_.build();
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
            if (other instanceof S2C_EnterView_14402) {
               return this.mergeFrom((S2C_EnterView_14402)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_EnterView_14402 other) {
            if (other == OfferRewardMsg.S2C_EnterView_14402.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRewardNum()) {
                  this.setRewardNum(other.getRewardNum());
               }

               if (other.hasPublishSec()) {
                  this.setPublishSec(other.getPublishSec());
               }

               if (other.hasFightNum()) {
                  this.setFightNum(other.getFightNum());
               }

               if (this.infoBuilder_ == null) {
                  if (!other.info_.isEmpty()) {
                     if (this.info_.isEmpty()) {
                        this.info_ = other.info_;
                        this.bitField0_ &= -9;
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
                     this.bitField0_ &= -9;
                     this.infoBuilder_ = OfferRewardMsg.S2C_EnterView_14402.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
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
            if (!this.hasRewardNum()) {
               return false;
            } else if (!this.hasPublishSec()) {
               return false;
            } else if (!this.hasFightNum()) {
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
            S2C_EnterView_14402 parsedMessage = null;

            try {
               parsedMessage = (S2C_EnterView_14402)OfferRewardMsg.S2C_EnterView_14402.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_EnterView_14402)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRewardNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRewardNum() {
            return this.rewardNum_;
         }

         public Builder setRewardNum(int value) {
            this.bitField0_ |= 1;
            this.rewardNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardNum() {
            this.bitField0_ &= -2;
            this.rewardNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPublishSec() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPublishSec() {
            return this.publishSec_;
         }

         public Builder setPublishSec(int value) {
            this.bitField0_ |= 2;
            this.publishSec_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPublishSec() {
            this.bitField0_ &= -3;
            this.publishSec_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFightNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getFightNum() {
            return this.fightNum_;
         }

         public Builder setFightNum(int value) {
            this.bitField0_ |= 4;
            this.fightNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFightNum() {
            this.bitField0_ &= -5;
            this.fightNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureInfoIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.info_ = new ArrayList(this.info_);
               this.bitField0_ |= 8;
            }

         }

         public List<OfferRewardInfo> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public OfferRewardInfo getInfo(int index) {
            return this.infoBuilder_ == null ? (OfferRewardInfo)this.info_.get(index) : (OfferRewardInfo)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, OfferRewardInfo value) {
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

         public Builder setInfo(int index, OfferRewardInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(OfferRewardInfo value) {
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

         public Builder addInfo(int index, OfferRewardInfo value) {
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

         public Builder addInfo(OfferRewardInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, OfferRewardInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends OfferRewardInfo> values) {
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
               this.bitField0_ &= -9;
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

         public OfferRewardInfo.Builder getInfoBuilder(int index) {
            return (OfferRewardInfo.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public OfferRewardInfoOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (OfferRewardInfoOrBuilder)this.info_.get(index) : (OfferRewardInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends OfferRewardInfoOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public OfferRewardInfo.Builder addInfoBuilder() {
            return (OfferRewardInfo.Builder)this.getInfoFieldBuilder().addBuilder(OfferRewardMsg.OfferRewardInfo.getDefaultInstance());
         }

         public OfferRewardInfo.Builder addInfoBuilder(int index) {
            return (OfferRewardInfo.Builder)this.getInfoFieldBuilder().addBuilder(index, OfferRewardMsg.OfferRewardInfo.getDefaultInstance());
         }

         public List<OfferRewardInfo.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<OfferRewardInfo, OfferRewardInfo.Builder, OfferRewardInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new RepeatedFieldBuilderV3(this.info_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class C2S_Publish_14403 extends GeneratedMessageV3 implements C2S_Publish_14403OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Publish_14403 DEFAULT_INSTANCE = new C2S_Publish_14403();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Publish_14403> PARSER = new AbstractParser<C2S_Publish_14403>() {
         public C2S_Publish_14403 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Publish_14403(input, extensionRegistry);
         }
      };

      private C2S_Publish_14403(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Publish_14403() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Publish_14403();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Publish_14403(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_Publish_14403_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_Publish_14403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Publish_14403.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Publish_14403)) {
            return super.equals(obj);
         } else {
            C2S_Publish_14403 other = (C2S_Publish_14403)obj;
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

      public static C2S_Publish_14403 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Publish_14403)PARSER.parseFrom(data);
      }

      public static C2S_Publish_14403 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Publish_14403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Publish_14403 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Publish_14403)PARSER.parseFrom(data);
      }

      public static C2S_Publish_14403 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Publish_14403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Publish_14403 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Publish_14403)PARSER.parseFrom(data);
      }

      public static C2S_Publish_14403 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Publish_14403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Publish_14403 parseFrom(InputStream input) throws IOException {
         return (C2S_Publish_14403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Publish_14403 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Publish_14403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Publish_14403 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Publish_14403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Publish_14403 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Publish_14403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Publish_14403 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Publish_14403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Publish_14403 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Publish_14403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Publish_14403 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Publish_14403 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Publish_14403> parser() {
         return PARSER;
      }

      public Parser<C2S_Publish_14403> getParserForType() {
         return PARSER;
      }

      public C2S_Publish_14403 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Publish_14403OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_Publish_14403_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_Publish_14403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Publish_14403.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (OfferRewardMsg.C2S_Publish_14403.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_Publish_14403_descriptor;
         }

         public C2S_Publish_14403 getDefaultInstanceForType() {
            return OfferRewardMsg.C2S_Publish_14403.getDefaultInstance();
         }

         public C2S_Publish_14403 build() {
            C2S_Publish_14403 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Publish_14403 buildPartial() {
            C2S_Publish_14403 result = new C2S_Publish_14403(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_Publish_14403) {
               return this.mergeFrom((C2S_Publish_14403)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Publish_14403 other) {
            if (other == OfferRewardMsg.C2S_Publish_14403.getDefaultInstance()) {
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
            C2S_Publish_14403 parsedMessage = null;

            try {
               parsedMessage = (C2S_Publish_14403)OfferRewardMsg.C2S_Publish_14403.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Publish_14403)e.getUnfinishedMessage();
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

   public static final class S2C_Publish_14404 extends GeneratedMessageV3 implements S2C_Publish_14404OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_Publish_14404 DEFAULT_INSTANCE = new S2C_Publish_14404();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Publish_14404> PARSER = new AbstractParser<S2C_Publish_14404>() {
         public S2C_Publish_14404 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Publish_14404(input, extensionRegistry);
         }
      };

      private S2C_Publish_14404(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Publish_14404() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Publish_14404();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Publish_14404(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_Publish_14404_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_Publish_14404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Publish_14404.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Publish_14404)) {
            return super.equals(obj);
         } else {
            S2C_Publish_14404 other = (S2C_Publish_14404)obj;
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

      public static S2C_Publish_14404 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Publish_14404)PARSER.parseFrom(data);
      }

      public static S2C_Publish_14404 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Publish_14404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Publish_14404 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Publish_14404)PARSER.parseFrom(data);
      }

      public static S2C_Publish_14404 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Publish_14404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Publish_14404 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Publish_14404)PARSER.parseFrom(data);
      }

      public static S2C_Publish_14404 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Publish_14404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Publish_14404 parseFrom(InputStream input) throws IOException {
         return (S2C_Publish_14404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Publish_14404 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Publish_14404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Publish_14404 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Publish_14404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Publish_14404 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Publish_14404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Publish_14404 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Publish_14404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Publish_14404 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Publish_14404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Publish_14404 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Publish_14404 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Publish_14404> parser() {
         return PARSER;
      }

      public Parser<S2C_Publish_14404> getParserForType() {
         return PARSER;
      }

      public S2C_Publish_14404 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Publish_14404OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_Publish_14404_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_Publish_14404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Publish_14404.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (OfferRewardMsg.S2C_Publish_14404.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_Publish_14404_descriptor;
         }

         public S2C_Publish_14404 getDefaultInstanceForType() {
            return OfferRewardMsg.S2C_Publish_14404.getDefaultInstance();
         }

         public S2C_Publish_14404 build() {
            S2C_Publish_14404 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Publish_14404 buildPartial() {
            S2C_Publish_14404 result = new S2C_Publish_14404(this);
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
            if (other instanceof S2C_Publish_14404) {
               return this.mergeFrom((S2C_Publish_14404)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Publish_14404 other) {
            if (other == OfferRewardMsg.S2C_Publish_14404.getDefaultInstance()) {
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
            return this.hasId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Publish_14404 parsedMessage = null;

            try {
               parsedMessage = (S2C_Publish_14404)OfferRewardMsg.S2C_Publish_14404.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Publish_14404)e.getUnfinishedMessage();
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

   public static final class C2S_PublishCommit_14405 extends GeneratedMessageV3 implements C2S_PublishCommit_14405OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OPTYPE_FIELD_NUMBER = 1;
      private int opType_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_PublishCommit_14405 DEFAULT_INSTANCE = new C2S_PublishCommit_14405();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PublishCommit_14405> PARSER = new AbstractParser<C2S_PublishCommit_14405>() {
         public C2S_PublishCommit_14405 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PublishCommit_14405(input, extensionRegistry);
         }
      };

      private C2S_PublishCommit_14405(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PublishCommit_14405() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PublishCommit_14405();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PublishCommit_14405(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.opType_ = input.readInt32();
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
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_PublishCommit_14405_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_PublishCommit_14405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PublishCommit_14405.class, Builder.class);
      }

      public boolean hasOpType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getOpType() {
         return this.opType_;
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
            output.writeInt32(1, this.opType_);
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
               size += CodedOutputStream.computeInt32Size(1, this.opType_);
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
         } else if (!(obj instanceof C2S_PublishCommit_14405)) {
            return super.equals(obj);
         } else {
            C2S_PublishCommit_14405 other = (C2S_PublishCommit_14405)obj;
            if (this.hasOpType() != other.hasOpType()) {
               return false;
            } else if (this.hasOpType() && this.getOpType() != other.getOpType()) {
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
            if (this.hasOpType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOpType();
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

      public static C2S_PublishCommit_14405 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PublishCommit_14405)PARSER.parseFrom(data);
      }

      public static C2S_PublishCommit_14405 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PublishCommit_14405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PublishCommit_14405 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PublishCommit_14405)PARSER.parseFrom(data);
      }

      public static C2S_PublishCommit_14405 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PublishCommit_14405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PublishCommit_14405 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PublishCommit_14405)PARSER.parseFrom(data);
      }

      public static C2S_PublishCommit_14405 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PublishCommit_14405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PublishCommit_14405 parseFrom(InputStream input) throws IOException {
         return (C2S_PublishCommit_14405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PublishCommit_14405 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PublishCommit_14405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PublishCommit_14405 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PublishCommit_14405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PublishCommit_14405 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PublishCommit_14405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PublishCommit_14405 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PublishCommit_14405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PublishCommit_14405 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PublishCommit_14405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PublishCommit_14405 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PublishCommit_14405 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PublishCommit_14405> parser() {
         return PARSER;
      }

      public Parser<C2S_PublishCommit_14405> getParserForType() {
         return PARSER;
      }

      public C2S_PublishCommit_14405 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PublishCommit_14405OrBuilder {
         private int bitField0_;
         private int opType_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_PublishCommit_14405_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_PublishCommit_14405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PublishCommit_14405.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (OfferRewardMsg.C2S_PublishCommit_14405.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.opType_ = 0;
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_PublishCommit_14405_descriptor;
         }

         public C2S_PublishCommit_14405 getDefaultInstanceForType() {
            return OfferRewardMsg.C2S_PublishCommit_14405.getDefaultInstance();
         }

         public C2S_PublishCommit_14405 build() {
            C2S_PublishCommit_14405 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PublishCommit_14405 buildPartial() {
            C2S_PublishCommit_14405 result = new C2S_PublishCommit_14405(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.opType_ = this.opType_;
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
            if (other instanceof C2S_PublishCommit_14405) {
               return this.mergeFrom((C2S_PublishCommit_14405)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PublishCommit_14405 other) {
            if (other == OfferRewardMsg.C2S_PublishCommit_14405.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOpType()) {
                  this.setOpType(other.getOpType());
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
            return this.hasOpType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_PublishCommit_14405 parsedMessage = null;

            try {
               parsedMessage = (C2S_PublishCommit_14405)OfferRewardMsg.C2S_PublishCommit_14405.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PublishCommit_14405)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOpType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getOpType() {
            return this.opType_;
         }

         public Builder setOpType(int value) {
            this.bitField0_ |= 1;
            this.opType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpType() {
            this.bitField0_ &= -2;
            this.opType_ = 0;
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

   public static final class S2C_PublishCommit_14406 extends GeneratedMessageV3 implements S2C_PublishCommit_14406OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PUBLISHSEC_FIELD_NUMBER = 1;
      private int publishSec_;
      private byte memoizedIsInitialized;
      private static final S2C_PublishCommit_14406 DEFAULT_INSTANCE = new S2C_PublishCommit_14406();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PublishCommit_14406> PARSER = new AbstractParser<S2C_PublishCommit_14406>() {
         public S2C_PublishCommit_14406 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PublishCommit_14406(input, extensionRegistry);
         }
      };

      private S2C_PublishCommit_14406(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PublishCommit_14406() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PublishCommit_14406();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PublishCommit_14406(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.publishSec_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_PublishCommit_14406_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_PublishCommit_14406_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PublishCommit_14406.class, Builder.class);
      }

      public boolean hasPublishSec() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPublishSec() {
         return this.publishSec_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPublishSec()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.publishSec_);
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
               size += CodedOutputStream.computeInt32Size(1, this.publishSec_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PublishCommit_14406)) {
            return super.equals(obj);
         } else {
            S2C_PublishCommit_14406 other = (S2C_PublishCommit_14406)obj;
            if (this.hasPublishSec() != other.hasPublishSec()) {
               return false;
            } else if (this.hasPublishSec() && this.getPublishSec() != other.getPublishSec()) {
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
            if (this.hasPublishSec()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPublishSec();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PublishCommit_14406 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PublishCommit_14406)PARSER.parseFrom(data);
      }

      public static S2C_PublishCommit_14406 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PublishCommit_14406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PublishCommit_14406 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PublishCommit_14406)PARSER.parseFrom(data);
      }

      public static S2C_PublishCommit_14406 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PublishCommit_14406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PublishCommit_14406 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PublishCommit_14406)PARSER.parseFrom(data);
      }

      public static S2C_PublishCommit_14406 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PublishCommit_14406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PublishCommit_14406 parseFrom(InputStream input) throws IOException {
         return (S2C_PublishCommit_14406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PublishCommit_14406 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PublishCommit_14406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PublishCommit_14406 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PublishCommit_14406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PublishCommit_14406 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PublishCommit_14406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PublishCommit_14406 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PublishCommit_14406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PublishCommit_14406 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PublishCommit_14406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PublishCommit_14406 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PublishCommit_14406 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PublishCommit_14406> parser() {
         return PARSER;
      }

      public Parser<S2C_PublishCommit_14406> getParserForType() {
         return PARSER;
      }

      public S2C_PublishCommit_14406 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PublishCommit_14406OrBuilder {
         private int bitField0_;
         private int publishSec_;

         public static final Descriptors.Descriptor getDescriptor() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_PublishCommit_14406_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_PublishCommit_14406_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PublishCommit_14406.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (OfferRewardMsg.S2C_PublishCommit_14406.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.publishSec_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_PublishCommit_14406_descriptor;
         }

         public S2C_PublishCommit_14406 getDefaultInstanceForType() {
            return OfferRewardMsg.S2C_PublishCommit_14406.getDefaultInstance();
         }

         public S2C_PublishCommit_14406 build() {
            S2C_PublishCommit_14406 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PublishCommit_14406 buildPartial() {
            S2C_PublishCommit_14406 result = new S2C_PublishCommit_14406(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.publishSec_ = this.publishSec_;
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
            if (other instanceof S2C_PublishCommit_14406) {
               return this.mergeFrom((S2C_PublishCommit_14406)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PublishCommit_14406 other) {
            if (other == OfferRewardMsg.S2C_PublishCommit_14406.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPublishSec()) {
                  this.setPublishSec(other.getPublishSec());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPublishSec();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PublishCommit_14406 parsedMessage = null;

            try {
               parsedMessage = (S2C_PublishCommit_14406)OfferRewardMsg.S2C_PublishCommit_14406.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PublishCommit_14406)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPublishSec() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPublishSec() {
            return this.publishSec_;
         }

         public Builder setPublishSec(int value) {
            this.bitField0_ |= 1;
            this.publishSec_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPublishSec() {
            this.bitField0_ &= -2;
            this.publishSec_ = 0;
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

   public static final class S2C_AddOffer_14408 extends GeneratedMessageV3 implements S2C_AddOffer_14408OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private OfferRewardInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_AddOffer_14408 DEFAULT_INSTANCE = new S2C_AddOffer_14408();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AddOffer_14408> PARSER = new AbstractParser<S2C_AddOffer_14408>() {
         public S2C_AddOffer_14408 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AddOffer_14408(input, extensionRegistry);
         }
      };

      private S2C_AddOffer_14408(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AddOffer_14408() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AddOffer_14408();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AddOffer_14408(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        OfferRewardInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (OfferRewardInfo)input.readMessage(OfferRewardMsg.OfferRewardInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
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
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_AddOffer_14408_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_AddOffer_14408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AddOffer_14408.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public OfferRewardInfo getInfo() {
         return this.info_ == null ? OfferRewardMsg.OfferRewardInfo.getDefaultInstance() : this.info_;
      }

      public OfferRewardInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? OfferRewardMsg.OfferRewardInfo.getDefaultInstance() : this.info_;
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_AddOffer_14408)) {
            return super.equals(obj);
         } else {
            S2C_AddOffer_14408 other = (S2C_AddOffer_14408)obj;
            if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_AddOffer_14408 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AddOffer_14408)PARSER.parseFrom(data);
      }

      public static S2C_AddOffer_14408 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AddOffer_14408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AddOffer_14408 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AddOffer_14408)PARSER.parseFrom(data);
      }

      public static S2C_AddOffer_14408 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AddOffer_14408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AddOffer_14408 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AddOffer_14408)PARSER.parseFrom(data);
      }

      public static S2C_AddOffer_14408 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AddOffer_14408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AddOffer_14408 parseFrom(InputStream input) throws IOException {
         return (S2C_AddOffer_14408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AddOffer_14408 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AddOffer_14408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AddOffer_14408 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AddOffer_14408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AddOffer_14408 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AddOffer_14408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AddOffer_14408 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AddOffer_14408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AddOffer_14408 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AddOffer_14408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AddOffer_14408 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AddOffer_14408 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AddOffer_14408> parser() {
         return PARSER;
      }

      public Parser<S2C_AddOffer_14408> getParserForType() {
         return PARSER;
      }

      public S2C_AddOffer_14408 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AddOffer_14408OrBuilder {
         private int bitField0_;
         private OfferRewardInfo info_;
         private SingleFieldBuilderV3<OfferRewardInfo, OfferRewardInfo.Builder, OfferRewardInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_AddOffer_14408_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_AddOffer_14408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AddOffer_14408.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (OfferRewardMsg.S2C_AddOffer_14408.alwaysUseFieldBuilders) {
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
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_AddOffer_14408_descriptor;
         }

         public S2C_AddOffer_14408 getDefaultInstanceForType() {
            return OfferRewardMsg.S2C_AddOffer_14408.getDefaultInstance();
         }

         public S2C_AddOffer_14408 build() {
            S2C_AddOffer_14408 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AddOffer_14408 buildPartial() {
            S2C_AddOffer_14408 result = new S2C_AddOffer_14408(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (OfferRewardInfo)this.infoBuilder_.build();
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
            if (other instanceof S2C_AddOffer_14408) {
               return this.mergeFrom((S2C_AddOffer_14408)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AddOffer_14408 other) {
            if (other == OfferRewardMsg.S2C_AddOffer_14408.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasInfo()) {
               return false;
            } else {
               return this.getInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_AddOffer_14408 parsedMessage = null;

            try {
               parsedMessage = (S2C_AddOffer_14408)OfferRewardMsg.S2C_AddOffer_14408.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AddOffer_14408)e.getUnfinishedMessage();
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

         public OfferRewardInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? OfferRewardMsg.OfferRewardInfo.getDefaultInstance() : this.info_;
            } else {
               return (OfferRewardInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(OfferRewardInfo value) {
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

         public Builder setInfo(OfferRewardInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(OfferRewardInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != OfferRewardMsg.OfferRewardInfo.getDefaultInstance()) {
                  this.info_ = OfferRewardMsg.OfferRewardInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public OfferRewardInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (OfferRewardInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public OfferRewardInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (OfferRewardInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? OfferRewardMsg.OfferRewardInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<OfferRewardInfo, OfferRewardInfo.Builder, OfferRewardInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
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

   public static final class S2C_DelOffer_14410 extends GeneratedMessageV3 implements S2C_DelOffer_14410OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CODES_FIELD_NUMBER = 1;
      private Internal.IntList codes_;
      private byte memoizedIsInitialized;
      private static final S2C_DelOffer_14410 DEFAULT_INSTANCE = new S2C_DelOffer_14410();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DelOffer_14410> PARSER = new AbstractParser<S2C_DelOffer_14410>() {
         public S2C_DelOffer_14410 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DelOffer_14410(input, extensionRegistry);
         }
      };

      private S2C_DelOffer_14410(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DelOffer_14410() {
         this.memoizedIsInitialized = -1;
         this.codes_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DelOffer_14410();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DelOffer_14410(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.codes_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.codes_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.codes_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.codes_.addInt(input.readInt32());
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
                  this.codes_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_DelOffer_14410_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_DelOffer_14410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DelOffer_14410.class, Builder.class);
      }

      public List<Integer> getCodesList() {
         return this.codes_;
      }

      public int getCodesCount() {
         return this.codes_.size();
      }

      public int getCodes(int index) {
         return this.codes_.getInt(index);
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
         for(int i = 0; i < this.codes_.size(); ++i) {
            output.writeInt32(1, this.codes_.getInt(i));
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

            for(int i = 0; i < this.codes_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.codes_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCodesList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DelOffer_14410)) {
            return super.equals(obj);
         } else {
            S2C_DelOffer_14410 other = (S2C_DelOffer_14410)obj;
            if (!this.getCodesList().equals(other.getCodesList())) {
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
            if (this.getCodesCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCodesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DelOffer_14410 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DelOffer_14410)PARSER.parseFrom(data);
      }

      public static S2C_DelOffer_14410 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DelOffer_14410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DelOffer_14410 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DelOffer_14410)PARSER.parseFrom(data);
      }

      public static S2C_DelOffer_14410 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DelOffer_14410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DelOffer_14410 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DelOffer_14410)PARSER.parseFrom(data);
      }

      public static S2C_DelOffer_14410 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DelOffer_14410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DelOffer_14410 parseFrom(InputStream input) throws IOException {
         return (S2C_DelOffer_14410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DelOffer_14410 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DelOffer_14410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DelOffer_14410 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DelOffer_14410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DelOffer_14410 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DelOffer_14410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DelOffer_14410 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DelOffer_14410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DelOffer_14410 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DelOffer_14410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DelOffer_14410 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DelOffer_14410 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DelOffer_14410> parser() {
         return PARSER;
      }

      public Parser<S2C_DelOffer_14410> getParserForType() {
         return PARSER;
      }

      public S2C_DelOffer_14410 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DelOffer_14410OrBuilder {
         private int bitField0_;
         private Internal.IntList codes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_DelOffer_14410_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_DelOffer_14410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DelOffer_14410.class, Builder.class);
         }

         private Builder() {
            this.codes_ = OfferRewardMsg.S2C_DelOffer_14410.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codes_ = OfferRewardMsg.S2C_DelOffer_14410.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (OfferRewardMsg.S2C_DelOffer_14410.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.codes_ = OfferRewardMsg.S2C_DelOffer_14410.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_DelOffer_14410_descriptor;
         }

         public S2C_DelOffer_14410 getDefaultInstanceForType() {
            return OfferRewardMsg.S2C_DelOffer_14410.getDefaultInstance();
         }

         public S2C_DelOffer_14410 build() {
            S2C_DelOffer_14410 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DelOffer_14410 buildPartial() {
            S2C_DelOffer_14410 result = new S2C_DelOffer_14410(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.codes_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.codes_ = this.codes_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_DelOffer_14410) {
               return this.mergeFrom((S2C_DelOffer_14410)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DelOffer_14410 other) {
            if (other == OfferRewardMsg.S2C_DelOffer_14410.getDefaultInstance()) {
               return this;
            } else {
               if (!other.codes_.isEmpty()) {
                  if (this.codes_.isEmpty()) {
                     this.codes_ = other.codes_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureCodesIsMutable();
                     this.codes_.addAll(other.codes_);
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
            S2C_DelOffer_14410 parsedMessage = null;

            try {
               parsedMessage = (S2C_DelOffer_14410)OfferRewardMsg.S2C_DelOffer_14410.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DelOffer_14410)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureCodesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.codes_ = OfferRewardMsg.S2C_DelOffer_14410.mutableCopy(this.codes_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getCodesList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.codes_) : this.codes_);
         }

         public int getCodesCount() {
            return this.codes_.size();
         }

         public int getCodes(int index) {
            return this.codes_.getInt(index);
         }

         public Builder setCodes(int index, int value) {
            this.ensureCodesIsMutable();
            this.codes_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCodes(int value) {
            this.ensureCodesIsMutable();
            this.codes_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCodes(Iterable<? extends Integer> values) {
            this.ensureCodesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.codes_);
            this.onChanged();
            return this;
         }

         public Builder clearCodes() {
            this.codes_ = OfferRewardMsg.S2C_DelOffer_14410.emptyIntList();
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

   public static final class S2C_UpdateOffer_14412 extends GeneratedMessageV3 implements S2C_UpdateOffer_14412OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private OfferRewardInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateOffer_14412 DEFAULT_INSTANCE = new S2C_UpdateOffer_14412();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateOffer_14412> PARSER = new AbstractParser<S2C_UpdateOffer_14412>() {
         public S2C_UpdateOffer_14412 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateOffer_14412(input, extensionRegistry);
         }
      };

      private S2C_UpdateOffer_14412(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateOffer_14412() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateOffer_14412();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateOffer_14412(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        OfferRewardInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (OfferRewardInfo)input.readMessage(OfferRewardMsg.OfferRewardInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
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
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_UpdateOffer_14412_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_UpdateOffer_14412_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateOffer_14412.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public OfferRewardInfo getInfo() {
         return this.info_ == null ? OfferRewardMsg.OfferRewardInfo.getDefaultInstance() : this.info_;
      }

      public OfferRewardInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? OfferRewardMsg.OfferRewardInfo.getDefaultInstance() : this.info_;
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpdateOffer_14412)) {
            return super.equals(obj);
         } else {
            S2C_UpdateOffer_14412 other = (S2C_UpdateOffer_14412)obj;
            if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpdateOffer_14412 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateOffer_14412)PARSER.parseFrom(data);
      }

      public static S2C_UpdateOffer_14412 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateOffer_14412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateOffer_14412 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateOffer_14412)PARSER.parseFrom(data);
      }

      public static S2C_UpdateOffer_14412 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateOffer_14412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateOffer_14412 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateOffer_14412)PARSER.parseFrom(data);
      }

      public static S2C_UpdateOffer_14412 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateOffer_14412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateOffer_14412 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateOffer_14412)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateOffer_14412 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateOffer_14412)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateOffer_14412 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateOffer_14412)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateOffer_14412 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateOffer_14412)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateOffer_14412 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateOffer_14412)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateOffer_14412 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateOffer_14412)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateOffer_14412 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateOffer_14412 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateOffer_14412> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateOffer_14412> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateOffer_14412 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateOffer_14412OrBuilder {
         private int bitField0_;
         private OfferRewardInfo info_;
         private SingleFieldBuilderV3<OfferRewardInfo, OfferRewardInfo.Builder, OfferRewardInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_UpdateOffer_14412_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_UpdateOffer_14412_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateOffer_14412.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (OfferRewardMsg.S2C_UpdateOffer_14412.alwaysUseFieldBuilders) {
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
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_UpdateOffer_14412_descriptor;
         }

         public S2C_UpdateOffer_14412 getDefaultInstanceForType() {
            return OfferRewardMsg.S2C_UpdateOffer_14412.getDefaultInstance();
         }

         public S2C_UpdateOffer_14412 build() {
            S2C_UpdateOffer_14412 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateOffer_14412 buildPartial() {
            S2C_UpdateOffer_14412 result = new S2C_UpdateOffer_14412(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (OfferRewardInfo)this.infoBuilder_.build();
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
            if (other instanceof S2C_UpdateOffer_14412) {
               return this.mergeFrom((S2C_UpdateOffer_14412)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateOffer_14412 other) {
            if (other == OfferRewardMsg.S2C_UpdateOffer_14412.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasInfo()) {
               return false;
            } else {
               return this.getInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpdateOffer_14412 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateOffer_14412)OfferRewardMsg.S2C_UpdateOffer_14412.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateOffer_14412)e.getUnfinishedMessage();
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

         public OfferRewardInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? OfferRewardMsg.OfferRewardInfo.getDefaultInstance() : this.info_;
            } else {
               return (OfferRewardInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(OfferRewardInfo value) {
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

         public Builder setInfo(OfferRewardInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(OfferRewardInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != OfferRewardMsg.OfferRewardInfo.getDefaultInstance()) {
                  this.info_ = OfferRewardMsg.OfferRewardInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public OfferRewardInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (OfferRewardInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public OfferRewardInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (OfferRewardInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? OfferRewardMsg.OfferRewardInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<OfferRewardInfo, OfferRewardInfo.Builder, OfferRewardInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
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

   public static final class S2C_Fight_14414 extends GeneratedMessageV3 implements S2C_Fight_14414OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FIGHTNUM_FIELD_NUMBER = 1;
      private int fightNum_;
      private byte memoizedIsInitialized;
      private static final S2C_Fight_14414 DEFAULT_INSTANCE = new S2C_Fight_14414();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Fight_14414> PARSER = new AbstractParser<S2C_Fight_14414>() {
         public S2C_Fight_14414 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Fight_14414(input, extensionRegistry);
         }
      };

      private S2C_Fight_14414(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Fight_14414() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Fight_14414();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Fight_14414(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.fightNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_Fight_14414_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_Fight_14414_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Fight_14414.class, Builder.class);
      }

      public boolean hasFightNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFightNum() {
         return this.fightNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFightNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.fightNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.fightNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Fight_14414)) {
            return super.equals(obj);
         } else {
            S2C_Fight_14414 other = (S2C_Fight_14414)obj;
            if (this.hasFightNum() != other.hasFightNum()) {
               return false;
            } else if (this.hasFightNum() && this.getFightNum() != other.getFightNum()) {
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
            if (this.hasFightNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFightNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Fight_14414 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Fight_14414)PARSER.parseFrom(data);
      }

      public static S2C_Fight_14414 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Fight_14414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Fight_14414 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Fight_14414)PARSER.parseFrom(data);
      }

      public static S2C_Fight_14414 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Fight_14414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Fight_14414 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Fight_14414)PARSER.parseFrom(data);
      }

      public static S2C_Fight_14414 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Fight_14414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Fight_14414 parseFrom(InputStream input) throws IOException {
         return (S2C_Fight_14414)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Fight_14414 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Fight_14414)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Fight_14414 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Fight_14414)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Fight_14414 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Fight_14414)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Fight_14414 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Fight_14414)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Fight_14414 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Fight_14414)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Fight_14414 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Fight_14414 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Fight_14414> parser() {
         return PARSER;
      }

      public Parser<S2C_Fight_14414> getParserForType() {
         return PARSER;
      }

      public S2C_Fight_14414 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Fight_14414OrBuilder {
         private int bitField0_;
         private int fightNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_Fight_14414_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_Fight_14414_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Fight_14414.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (OfferRewardMsg.S2C_Fight_14414.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.fightNum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_Fight_14414_descriptor;
         }

         public S2C_Fight_14414 getDefaultInstanceForType() {
            return OfferRewardMsg.S2C_Fight_14414.getDefaultInstance();
         }

         public S2C_Fight_14414 build() {
            S2C_Fight_14414 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Fight_14414 buildPartial() {
            S2C_Fight_14414 result = new S2C_Fight_14414(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.fightNum_ = this.fightNum_;
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
            if (other instanceof S2C_Fight_14414) {
               return this.mergeFrom((S2C_Fight_14414)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Fight_14414 other) {
            if (other == OfferRewardMsg.S2C_Fight_14414.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFightNum()) {
                  this.setFightNum(other.getFightNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasFightNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Fight_14414 parsedMessage = null;

            try {
               parsedMessage = (S2C_Fight_14414)OfferRewardMsg.S2C_Fight_14414.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Fight_14414)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFightNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFightNum() {
            return this.fightNum_;
         }

         public Builder setFightNum(int value) {
            this.bitField0_ |= 1;
            this.fightNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFightNum() {
            this.bitField0_ &= -2;
            this.fightNum_ = 0;
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

   public static final class C2S_InviteFriend_14415 extends GeneratedMessageV3 implements C2S_InviteFriend_14415OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int FRIENDCODE_FIELD_NUMBER = 2;
      private Internal.IntList friendCode_;
      private byte memoizedIsInitialized;
      private static final C2S_InviteFriend_14415 DEFAULT_INSTANCE = new C2S_InviteFriend_14415();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_InviteFriend_14415> PARSER = new AbstractParser<C2S_InviteFriend_14415>() {
         public C2S_InviteFriend_14415 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_InviteFriend_14415(input, extensionRegistry);
         }
      };

      private C2S_InviteFriend_14415(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_InviteFriend_14415() {
         this.memoizedIsInitialized = -1;
         this.friendCode_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_InviteFriend_14415();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_InviteFriend_14415(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.friendCode_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.friendCode_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.friendCode_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.friendCode_.addInt(input.readInt32());
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
                  this.friendCode_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_InviteFriend_14415_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_InviteFriend_14415_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_InviteFriend_14415.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public List<Integer> getFriendCodeList() {
         return this.friendCode_;
      }

      public int getFriendCodeCount() {
         return this.friendCode_.size();
      }

      public int getFriendCode(int index) {
         return this.friendCode_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
         }

         for(int i = 0; i < this.friendCode_.size(); ++i) {
            output.writeInt32(2, this.friendCode_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.friendCode_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.friendCode_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getFriendCodeList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_InviteFriend_14415)) {
            return super.equals(obj);
         } else {
            C2S_InviteFriend_14415 other = (C2S_InviteFriend_14415)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (!this.getFriendCodeList().equals(other.getFriendCodeList())) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.getFriendCodeCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getFriendCodeList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_InviteFriend_14415 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_InviteFriend_14415)PARSER.parseFrom(data);
      }

      public static C2S_InviteFriend_14415 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_InviteFriend_14415)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_InviteFriend_14415 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_InviteFriend_14415)PARSER.parseFrom(data);
      }

      public static C2S_InviteFriend_14415 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_InviteFriend_14415)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_InviteFriend_14415 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_InviteFriend_14415)PARSER.parseFrom(data);
      }

      public static C2S_InviteFriend_14415 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_InviteFriend_14415)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_InviteFriend_14415 parseFrom(InputStream input) throws IOException {
         return (C2S_InviteFriend_14415)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_InviteFriend_14415 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_InviteFriend_14415)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_InviteFriend_14415 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_InviteFriend_14415)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_InviteFriend_14415 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_InviteFriend_14415)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_InviteFriend_14415 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_InviteFriend_14415)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_InviteFriend_14415 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_InviteFriend_14415)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_InviteFriend_14415 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_InviteFriend_14415 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_InviteFriend_14415> parser() {
         return PARSER;
      }

      public Parser<C2S_InviteFriend_14415> getParserForType() {
         return PARSER;
      }

      public C2S_InviteFriend_14415 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_InviteFriend_14415OrBuilder {
         private int bitField0_;
         private int code_;
         private Internal.IntList friendCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_InviteFriend_14415_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_InviteFriend_14415_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_InviteFriend_14415.class, Builder.class);
         }

         private Builder() {
            this.friendCode_ = OfferRewardMsg.C2S_InviteFriend_14415.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.friendCode_ = OfferRewardMsg.C2S_InviteFriend_14415.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (OfferRewardMsg.C2S_InviteFriend_14415.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.friendCode_ = OfferRewardMsg.C2S_InviteFriend_14415.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_InviteFriend_14415_descriptor;
         }

         public C2S_InviteFriend_14415 getDefaultInstanceForType() {
            return OfferRewardMsg.C2S_InviteFriend_14415.getDefaultInstance();
         }

         public C2S_InviteFriend_14415 build() {
            C2S_InviteFriend_14415 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_InviteFriend_14415 buildPartial() {
            C2S_InviteFriend_14415 result = new C2S_InviteFriend_14415(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.friendCode_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.friendCode_ = this.friendCode_;
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
            if (other instanceof C2S_InviteFriend_14415) {
               return this.mergeFrom((C2S_InviteFriend_14415)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_InviteFriend_14415 other) {
            if (other == OfferRewardMsg.C2S_InviteFriend_14415.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (!other.friendCode_.isEmpty()) {
                  if (this.friendCode_.isEmpty()) {
                     this.friendCode_ = other.friendCode_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureFriendCodeIsMutable();
                     this.friendCode_.addAll(other.friendCode_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_InviteFriend_14415 parsedMessage = null;

            try {
               parsedMessage = (C2S_InviteFriend_14415)OfferRewardMsg.C2S_InviteFriend_14415.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_InviteFriend_14415)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureFriendCodeIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.friendCode_ = OfferRewardMsg.C2S_InviteFriend_14415.mutableCopy(this.friendCode_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getFriendCodeList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.friendCode_) : this.friendCode_);
         }

         public int getFriendCodeCount() {
            return this.friendCode_.size();
         }

         public int getFriendCode(int index) {
            return this.friendCode_.getInt(index);
         }

         public Builder setFriendCode(int index, int value) {
            this.ensureFriendCodeIsMutable();
            this.friendCode_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addFriendCode(int value) {
            this.ensureFriendCodeIsMutable();
            this.friendCode_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllFriendCode(Iterable<? extends Integer> values) {
            this.ensureFriendCodeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.friendCode_);
            this.onChanged();
            return this;
         }

         public Builder clearFriendCode() {
            this.friendCode_ = OfferRewardMsg.C2S_InviteFriend_14415.emptyIntList();
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

   public static final class S2C_BeInvite_14416 extends GeneratedMessageV3 implements S2C_BeInvite_14416OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int INVITER_FIELD_NUMBER = 2;
      private int inviter_;
      private byte memoizedIsInitialized;
      private static final S2C_BeInvite_14416 DEFAULT_INSTANCE = new S2C_BeInvite_14416();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BeInvite_14416> PARSER = new AbstractParser<S2C_BeInvite_14416>() {
         public S2C_BeInvite_14416 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BeInvite_14416(input, extensionRegistry);
         }
      };

      private S2C_BeInvite_14416(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BeInvite_14416() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BeInvite_14416();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BeInvite_14416(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.inviter_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_BeInvite_14416_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_BeInvite_14416_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BeInvite_14416.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasInviter() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getInviter() {
         return this.inviter_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasInviter()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.inviter_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.inviter_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BeInvite_14416)) {
            return super.equals(obj);
         } else {
            S2C_BeInvite_14416 other = (S2C_BeInvite_14416)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasInviter() != other.hasInviter()) {
               return false;
            } else if (this.hasInviter() && this.getInviter() != other.getInviter()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasInviter()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInviter();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BeInvite_14416 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BeInvite_14416)PARSER.parseFrom(data);
      }

      public static S2C_BeInvite_14416 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BeInvite_14416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BeInvite_14416 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BeInvite_14416)PARSER.parseFrom(data);
      }

      public static S2C_BeInvite_14416 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BeInvite_14416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BeInvite_14416 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BeInvite_14416)PARSER.parseFrom(data);
      }

      public static S2C_BeInvite_14416 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BeInvite_14416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BeInvite_14416 parseFrom(InputStream input) throws IOException {
         return (S2C_BeInvite_14416)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BeInvite_14416 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BeInvite_14416)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BeInvite_14416 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BeInvite_14416)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BeInvite_14416 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BeInvite_14416)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BeInvite_14416 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BeInvite_14416)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BeInvite_14416 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BeInvite_14416)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BeInvite_14416 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BeInvite_14416 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BeInvite_14416> parser() {
         return PARSER;
      }

      public Parser<S2C_BeInvite_14416> getParserForType() {
         return PARSER;
      }

      public S2C_BeInvite_14416 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BeInvite_14416OrBuilder {
         private int bitField0_;
         private int code_;
         private int inviter_;

         public static final Descriptors.Descriptor getDescriptor() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_BeInvite_14416_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_BeInvite_14416_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BeInvite_14416.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (OfferRewardMsg.S2C_BeInvite_14416.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.inviter_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_BeInvite_14416_descriptor;
         }

         public S2C_BeInvite_14416 getDefaultInstanceForType() {
            return OfferRewardMsg.S2C_BeInvite_14416.getDefaultInstance();
         }

         public S2C_BeInvite_14416 build() {
            S2C_BeInvite_14416 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BeInvite_14416 buildPartial() {
            S2C_BeInvite_14416 result = new S2C_BeInvite_14416(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.inviter_ = this.inviter_;
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
            if (other instanceof S2C_BeInvite_14416) {
               return this.mergeFrom((S2C_BeInvite_14416)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BeInvite_14416 other) {
            if (other == OfferRewardMsg.S2C_BeInvite_14416.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasInviter()) {
                  this.setInviter(other.getInviter());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasInviter();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BeInvite_14416 parsedMessage = null;

            try {
               parsedMessage = (S2C_BeInvite_14416)OfferRewardMsg.S2C_BeInvite_14416.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BeInvite_14416)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasInviter() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getInviter() {
            return this.inviter_;
         }

         public Builder setInviter(int value) {
            this.bitField0_ |= 2;
            this.inviter_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearInviter() {
            this.bitField0_ &= -3;
            this.inviter_ = 0;
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

   public static final class C2S_HadInvited_14417 extends GeneratedMessageV3 implements C2S_HadInvited_14417OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      private byte memoizedIsInitialized;
      private static final C2S_HadInvited_14417 DEFAULT_INSTANCE = new C2S_HadInvited_14417();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HadInvited_14417> PARSER = new AbstractParser<C2S_HadInvited_14417>() {
         public C2S_HadInvited_14417 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HadInvited_14417(input, extensionRegistry);
         }
      };

      private C2S_HadInvited_14417(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HadInvited_14417() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HadInvited_14417();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HadInvited_14417(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_HadInvited_14417_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_HadInvited_14417_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HadInvited_14417.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_HadInvited_14417)) {
            return super.equals(obj);
         } else {
            C2S_HadInvited_14417 other = (C2S_HadInvited_14417)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_HadInvited_14417 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HadInvited_14417)PARSER.parseFrom(data);
      }

      public static C2S_HadInvited_14417 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HadInvited_14417)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HadInvited_14417 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HadInvited_14417)PARSER.parseFrom(data);
      }

      public static C2S_HadInvited_14417 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HadInvited_14417)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HadInvited_14417 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HadInvited_14417)PARSER.parseFrom(data);
      }

      public static C2S_HadInvited_14417 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HadInvited_14417)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HadInvited_14417 parseFrom(InputStream input) throws IOException {
         return (C2S_HadInvited_14417)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HadInvited_14417 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HadInvited_14417)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HadInvited_14417 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HadInvited_14417)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HadInvited_14417 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HadInvited_14417)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HadInvited_14417 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HadInvited_14417)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HadInvited_14417 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HadInvited_14417)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HadInvited_14417 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HadInvited_14417 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HadInvited_14417> parser() {
         return PARSER;
      }

      public Parser<C2S_HadInvited_14417> getParserForType() {
         return PARSER;
      }

      public C2S_HadInvited_14417 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HadInvited_14417OrBuilder {
         private int bitField0_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_HadInvited_14417_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_HadInvited_14417_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HadInvited_14417.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (OfferRewardMsg.C2S_HadInvited_14417.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_C2S_HadInvited_14417_descriptor;
         }

         public C2S_HadInvited_14417 getDefaultInstanceForType() {
            return OfferRewardMsg.C2S_HadInvited_14417.getDefaultInstance();
         }

         public C2S_HadInvited_14417 build() {
            C2S_HadInvited_14417 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HadInvited_14417 buildPartial() {
            C2S_HadInvited_14417 result = new C2S_HadInvited_14417(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
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
            if (other instanceof C2S_HadInvited_14417) {
               return this.mergeFrom((C2S_HadInvited_14417)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HadInvited_14417 other) {
            if (other == OfferRewardMsg.C2S_HadInvited_14417.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_HadInvited_14417 parsedMessage = null;

            try {
               parsedMessage = (C2S_HadInvited_14417)OfferRewardMsg.C2S_HadInvited_14417.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HadInvited_14417)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
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

   public static final class S2C_HadInvited_14418 extends GeneratedMessageV3 implements S2C_HadInvited_14418OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int PLAYERIDS_FIELD_NUMBER = 1;
      private Internal.IntList playerIds_;
      private byte memoizedIsInitialized;
      private static final S2C_HadInvited_14418 DEFAULT_INSTANCE = new S2C_HadInvited_14418();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HadInvited_14418> PARSER = new AbstractParser<S2C_HadInvited_14418>() {
         public S2C_HadInvited_14418 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HadInvited_14418(input, extensionRegistry);
         }
      };

      private S2C_HadInvited_14418(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HadInvited_14418() {
         this.memoizedIsInitialized = -1;
         this.playerIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HadInvited_14418();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HadInvited_14418(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_HadInvited_14418_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_HadInvited_14418_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HadInvited_14418.class, Builder.class);
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
         } else if (!(obj instanceof S2C_HadInvited_14418)) {
            return super.equals(obj);
         } else {
            S2C_HadInvited_14418 other = (S2C_HadInvited_14418)obj;
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

      public static S2C_HadInvited_14418 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HadInvited_14418)PARSER.parseFrom(data);
      }

      public static S2C_HadInvited_14418 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HadInvited_14418)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HadInvited_14418 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HadInvited_14418)PARSER.parseFrom(data);
      }

      public static S2C_HadInvited_14418 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HadInvited_14418)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HadInvited_14418 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HadInvited_14418)PARSER.parseFrom(data);
      }

      public static S2C_HadInvited_14418 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HadInvited_14418)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HadInvited_14418 parseFrom(InputStream input) throws IOException {
         return (S2C_HadInvited_14418)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HadInvited_14418 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HadInvited_14418)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HadInvited_14418 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HadInvited_14418)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HadInvited_14418 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HadInvited_14418)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HadInvited_14418 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HadInvited_14418)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HadInvited_14418 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HadInvited_14418)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HadInvited_14418 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HadInvited_14418 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HadInvited_14418> parser() {
         return PARSER;
      }

      public Parser<S2C_HadInvited_14418> getParserForType() {
         return PARSER;
      }

      public S2C_HadInvited_14418 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HadInvited_14418OrBuilder {
         private int bitField0_;
         private Internal.IntList playerIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_HadInvited_14418_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_HadInvited_14418_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HadInvited_14418.class, Builder.class);
         }

         private Builder() {
            this.playerIds_ = OfferRewardMsg.S2C_HadInvited_14418.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerIds_ = OfferRewardMsg.S2C_HadInvited_14418.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (OfferRewardMsg.S2C_HadInvited_14418.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerIds_ = OfferRewardMsg.S2C_HadInvited_14418.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return OfferRewardMsg.internal_static_offerReward_com_gzbz_protobuf_S2C_HadInvited_14418_descriptor;
         }

         public S2C_HadInvited_14418 getDefaultInstanceForType() {
            return OfferRewardMsg.S2C_HadInvited_14418.getDefaultInstance();
         }

         public S2C_HadInvited_14418 build() {
            S2C_HadInvited_14418 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HadInvited_14418 buildPartial() {
            S2C_HadInvited_14418 result = new S2C_HadInvited_14418(this);
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
            if (other instanceof S2C_HadInvited_14418) {
               return this.mergeFrom((S2C_HadInvited_14418)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HadInvited_14418 other) {
            if (other == OfferRewardMsg.S2C_HadInvited_14418.getDefaultInstance()) {
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
            S2C_HadInvited_14418 parsedMessage = null;

            try {
               parsedMessage = (S2C_HadInvited_14418)OfferRewardMsg.S2C_HadInvited_14418.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HadInvited_14418)e.getUnfinishedMessage();
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
               this.playerIds_ = OfferRewardMsg.S2C_HadInvited_14418.mutableCopy(this.playerIds_);
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
            this.playerIds_ = OfferRewardMsg.S2C_HadInvited_14418.emptyIntList();
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

   public interface C2S_EnterView_14401OrBuilder extends MessageOrBuilder {
      boolean hasEnter();

      int getEnter();
   }

   public interface C2S_HadInvited_14417OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();
   }

   public interface C2S_InviteFriend_14415OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      List<Integer> getFriendCodeList();

      int getFriendCodeCount();

      int getFriendCode(int index);
   }

   public interface C2S_PublishCommit_14405OrBuilder extends MessageOrBuilder {
      boolean hasOpType();

      int getOpType();

      boolean hasType();

      int getType();
   }

   public interface C2S_Publish_14403OrBuilder extends MessageOrBuilder {
   }

   public interface OfferRewardInfoOrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasId();

      int getId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasCreateTime();

      int getCreateTime();

      boolean hasHpPersent();

      int getHpPersent();

      boolean hasHead();

      int getHead();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasType();

      int getType();

      boolean hasUnionId();

      int getUnionId();
   }

   public interface S2C_AddOffer_14408OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      OfferRewardInfo getInfo();

      OfferRewardInfoOrBuilder getInfoOrBuilder();
   }

   public interface S2C_BeInvite_14416OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasInviter();

      int getInviter();
   }

   public interface S2C_DelOffer_14410OrBuilder extends MessageOrBuilder {
      List<Integer> getCodesList();

      int getCodesCount();

      int getCodes(int index);
   }

   public interface S2C_EnterView_14402OrBuilder extends MessageOrBuilder {
      boolean hasRewardNum();

      int getRewardNum();

      boolean hasPublishSec();

      int getPublishSec();

      boolean hasFightNum();

      int getFightNum();

      List<OfferRewardInfo> getInfoList();

      OfferRewardInfo getInfo(int index);

      int getInfoCount();

      List<? extends OfferRewardInfoOrBuilder> getInfoOrBuilderList();

      OfferRewardInfoOrBuilder getInfoOrBuilder(int index);
   }

   public interface S2C_Fight_14414OrBuilder extends MessageOrBuilder {
      boolean hasFightNum();

      int getFightNum();
   }

   public interface S2C_HadInvited_14418OrBuilder extends MessageOrBuilder {
      List<Integer> getPlayerIdsList();

      int getPlayerIdsCount();

      int getPlayerIds(int index);
   }

   public interface S2C_PublishCommit_14406OrBuilder extends MessageOrBuilder {
      boolean hasPublishSec();

      int getPublishSec();
   }

   public interface S2C_Publish_14404OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_UpdateOffer_14412OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      OfferRewardInfo getInfo();

      OfferRewardInfoOrBuilder getInfoOrBuilder();
   }
}
