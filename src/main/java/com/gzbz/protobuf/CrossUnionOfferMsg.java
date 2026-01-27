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

public final class CrossUnionOfferMsg {
   private static final Descriptors.Descriptor internal_static_crossUnionOffer_com_gzbz_protobuf_RankInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossUnionOffer_com_gzbz_protobuf_RankInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_EnterView_14701_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_EnterView_14701_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_PublishOffer_14703_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_PublishOffer_14703_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_PublishOffer_14704_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_PublishOffer_14704_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UpdateOffer_14706_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UpdateOffer_14706_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_DelOffer_14708_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_DelOffer_14708_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_Fight_14709_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_Fight_14709_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_Fight_14710_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_Fight_14710_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_Record_14711_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_Record_14711_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_OfferDetail_14715_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_OfferDetail_14715_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_DamageRank_14717_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_DamageRank_14717_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_MyRankPoint_14719_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_MyRankPoint_14719_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_Kill_14722_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_Kill_14722_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_RamageRand_14724_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_RamageRand_14724_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UnionPointRand_14726_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UnionPointRand_14726_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UpdateUnionPoint_14728_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UpdateUnionPoint_14728_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_SystemPublish_14729_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_SystemPublish_14729_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_PointRank_14731_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_PointRank_14731_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_DailyUpdate_14734_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_DailyUpdate_14734_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_SETTLEMENT_14751_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_SETTLEMENT_14751_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private CrossUnionOfferMsg() {
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
      String[] descriptorData = new String[]{"\n\u0010CrossOffer.proto\u0012!crossUnionOffer.com.gzbz.protobuf\u001a\u0010UnionOffer.proto\u001a\fBattle.proto\u001a\fcommon.proto\"$\n\bRankInfo\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004rank\u0018\u0002 \u0002(\u0005\"y\n\u0014S2CR_EnterView_14701\u0012\u0010\n\bfightNum\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006buyNum\u0018\u0002 \u0002(\u0005\u0012\u0014\n\funionCopyNum\u0018\u0003 \u0002(\u0005\u0012\u0017\n\u000funionPublishNum\u0018\u0004 \u0002(\u0005\u0012\u0010\n\bcoolTime\u0018\u0005 \u0002(\u0005\"[\n\u0017S2CR_PublishOffer_14703\u0012\u000f\n\u0007unionId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007offerId\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0004 \u0002(\u0005\"W\n\u0017CR2S_PublishOffer_14704\u0012<\n\u0005offer\u0018\u0001 \u0002(\u000b2-.unionOffer.com.gzbz.protobuf.OfferRewardInfo\"U\n\u0016CR2S_UpdateOffer_14706\u0012;\n\u0004info\u0018\u0001 \u0002(\u000b2-.unionOffer.com.gzbz.protobuf.OfferRewardInfo\"$\n\u0013CR2S_DelOffer_14708\u0012\r\n\u0005codes\u0018\u0001 \u0003(\u0005\":\n\u0010S2CR_Fight_14709\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u0018\n\u0010heroArrayingData\u0018\u0002 \u0002(\f\"´\u0001\n\u0010CR2S_Fight_14710\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nunionPoint\u0018\u0002 \u0002(\u0005\u0012\u0015\n\rofferRewardId\u0018\u0003 \u0002(\u0005\u0012\u000e\n\u0006isKill\u0018\u0004 \u0002(\b\u0012\u0013\n\u000bofferHeroId\u0018\u0005 \u0002(\u0005\u0012B\n\tbattleMsg\u0018\u0006 \u0002(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\"$\n\u0011S2CR_Record_14711\u0012\u000f\n\u0007unionId\u0018\u0001 \u0002(\u0005\"&\n\u0016S2CR_OfferDetail_14715\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\"%\n\u0015S2CR_DamageRank_14717\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\"\u0018\n\u0016S2CR_MyRankPoint_14719\"\u0093\u0001\n\u000fCR2S_Kill_14722\u0012\u000f\n\u0007offerId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bserverId\u0018\u0002 \u0002(\u0005\u0012\u0010\n\brewardId\u0018\u0003 \u0002(\u0005\u0012\u0011\n\tkillPoint\u0018\u0004 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0005 \u0001(\t\u0012\u000f\n\u0007unionId\u0018\u0006 \u0001(\u0005\u0012\u0013\n\u000bofferHeroId\u0018\u0007 \u0002(\u0005\"\u0080\u0001\n\u0015CR2S_RamageRand_14724\u0012\u0013\n\u000brewardGroup\u0018\u0001 \u0002(\u0005\u0012=\n\brankInfo\u0018\u0002 \u0003(\u000b2+.crossUnionOffer.com.gzbz.protobuf.RankInfo\u0012\u0013\n\u000bofferHeroId\u0018\u0003 \u0002(\u0005\"Z\n\u0019CR2S_UnionPointRand_14726\u0012=\n\brankInfo\u0018\u0001 \u0003(\u000b2+.crossUnionOffer.com.gzbz.protobuf.RankInfo\"D\n\u001bCR2S_UpdateUnionPoint_14728\u0012%\n\nunionPoint\u0018\u0001 \u0003(\u000b2\u0011.common.MapDataII\"<\n\u0018S2CR_SystemPublish_14729\u0012\u000b\n\u0003num\u0018\u0001 \u0001(\u0005\u0012\u0013\n\u000bunionCopyid\u0018\u0002 \u0001(\u0005\"$\n\u0014S2CR_PointRank_14731\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"\u0018\n\u0016CR2S_DailyUpdate_14734\")\n\u0015S2CR_SETTLEMENT_14751\u0012\u0010\n\bserverId\u0018\u0001 \u0001(\u0005B)\n\u0011com.gzbz.protobufB\u0012CrossUnionOfferMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{UnionOfferMsg.getDescriptor(), BattleMsg.getDescriptor(), CommonMsg.getDescriptor()});
      internal_static_crossUnionOffer_com_gzbz_protobuf_RankInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_crossUnionOffer_com_gzbz_protobuf_RankInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossUnionOffer_com_gzbz_protobuf_RankInfo_descriptor, new String[]{"Id", "Rank"});
      internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_EnterView_14701_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_EnterView_14701_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_EnterView_14701_descriptor, new String[]{"FightNum", "BuyNum", "UnionCopyNum", "UnionPublishNum", "CoolTime"});
      internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_PublishOffer_14703_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_PublishOffer_14703_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_PublishOffer_14703_descriptor, new String[]{"UnionId", "PlayerId", "OfferId", "Type"});
      internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_PublishOffer_14704_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_PublishOffer_14704_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_PublishOffer_14704_descriptor, new String[]{"Offer"});
      internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UpdateOffer_14706_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UpdateOffer_14706_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UpdateOffer_14706_descriptor, new String[]{"Info"});
      internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_DelOffer_14708_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_DelOffer_14708_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_DelOffer_14708_descriptor, new String[]{"Codes"});
      internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_Fight_14709_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_Fight_14709_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_Fight_14709_descriptor, new String[]{"Code", "HeroArrayingData"});
      internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_Fight_14710_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_Fight_14710_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_Fight_14710_descriptor, new String[]{"Code", "UnionPoint", "OfferRewardId", "IsKill", "OfferHeroId", "BattleMsg"});
      internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_Record_14711_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_Record_14711_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_Record_14711_descriptor, new String[]{"UnionId"});
      internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_OfferDetail_14715_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_OfferDetail_14715_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_OfferDetail_14715_descriptor, new String[]{"Code"});
      internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_DamageRank_14717_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_DamageRank_14717_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_DamageRank_14717_descriptor, new String[]{"Code"});
      internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_MyRankPoint_14719_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_MyRankPoint_14719_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_MyRankPoint_14719_descriptor, new String[0]);
      internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_Kill_14722_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_Kill_14722_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_Kill_14722_descriptor, new String[]{"OfferId", "ServerId", "RewardId", "KillPoint", "PlayerName", "UnionId", "OfferHeroId"});
      internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_RamageRand_14724_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_RamageRand_14724_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_RamageRand_14724_descriptor, new String[]{"RewardGroup", "RankInfo", "OfferHeroId"});
      internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UnionPointRand_14726_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UnionPointRand_14726_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UnionPointRand_14726_descriptor, new String[]{"RankInfo"});
      internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UpdateUnionPoint_14728_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UpdateUnionPoint_14728_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UpdateUnionPoint_14728_descriptor, new String[]{"UnionPoint"});
      internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_SystemPublish_14729_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_SystemPublish_14729_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_SystemPublish_14729_descriptor, new String[]{"Num", "UnionCopyid"});
      internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_PointRank_14731_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_PointRank_14731_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_PointRank_14731_descriptor, new String[]{"Type"});
      internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_DailyUpdate_14734_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_DailyUpdate_14734_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_DailyUpdate_14734_descriptor, new String[0]);
      internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_SETTLEMENT_14751_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_SETTLEMENT_14751_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_SETTLEMENT_14751_descriptor, new String[]{"ServerId"});
      UnionOfferMsg.getDescriptor();
      BattleMsg.getDescriptor();
      CommonMsg.getDescriptor();
   }

   public static final class RankInfo extends GeneratedMessageV3 implements RankInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int RANK_FIELD_NUMBER = 2;
      private int rank_;
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
                        this.id_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.rank_ = input.readInt32();
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
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_RankInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_RankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RankInfo.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasRank() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRank() {
         return this.rank_;
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
            output.writeInt32(1, this.id_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.rank_);
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
               size += CodedOutputStream.computeInt32Size(2, this.rank_);
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
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
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

            if (this.hasRank()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRank();
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
         private int id_;
         private int rank_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_RankInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_RankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RankInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionOfferMsg.RankInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.rank_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_RankInfo_descriptor;
         }

         public RankInfo getDefaultInstanceForType() {
            return CrossUnionOfferMsg.RankInfo.getDefaultInstance();
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
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.rank_ = this.rank_;
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
            if (other instanceof RankInfo) {
               return this.mergeFrom((RankInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RankInfo other) {
            if (other == CrossUnionOfferMsg.RankInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else {
               return this.hasRank();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RankInfo parsedMessage = null;

            try {
               parsedMessage = (RankInfo)CrossUnionOfferMsg.RankInfo.PARSER.parsePartialFrom(input, extensionRegistry);
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

         public boolean hasRank() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRank() {
            return this.rank_;
         }

         public Builder setRank(int value) {
            this.bitField0_ |= 2;
            this.rank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRank() {
            this.bitField0_ &= -3;
            this.rank_ = 0;
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

   public static final class S2CR_EnterView_14701 extends GeneratedMessageV3 implements S2CR_EnterView_14701OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FIGHTNUM_FIELD_NUMBER = 1;
      private int fightNum_;
      public static final int BUYNUM_FIELD_NUMBER = 2;
      private int buyNum_;
      public static final int UNIONCOPYNUM_FIELD_NUMBER = 3;
      private int unionCopyNum_;
      public static final int UNIONPUBLISHNUM_FIELD_NUMBER = 4;
      private int unionPublishNum_;
      public static final int COOLTIME_FIELD_NUMBER = 5;
      private int coolTime_;
      private byte memoizedIsInitialized;
      private static final S2CR_EnterView_14701 DEFAULT_INSTANCE = new S2CR_EnterView_14701();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_EnterView_14701> PARSER = new AbstractParser<S2CR_EnterView_14701>() {
         public S2CR_EnterView_14701 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_EnterView_14701(input, extensionRegistry);
         }
      };

      private S2CR_EnterView_14701(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_EnterView_14701() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_EnterView_14701();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_EnterView_14701(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.buyNum_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.unionCopyNum_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.unionPublishNum_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.coolTime_ = input.readInt32();
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
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_EnterView_14701_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_EnterView_14701_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_EnterView_14701.class, Builder.class);
      }

      public boolean hasFightNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFightNum() {
         return this.fightNum_;
      }

      public boolean hasBuyNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBuyNum() {
         return this.buyNum_;
      }

      public boolean hasUnionCopyNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getUnionCopyNum() {
         return this.unionCopyNum_;
      }

      public boolean hasUnionPublishNum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getUnionPublishNum() {
         return this.unionPublishNum_;
      }

      public boolean hasCoolTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getCoolTime() {
         return this.coolTime_;
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
         } else if (!this.hasBuyNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasUnionCopyNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasUnionPublishNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCoolTime()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.buyNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.unionCopyNum_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.unionPublishNum_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.coolTime_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.buyNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.unionCopyNum_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.unionPublishNum_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.coolTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_EnterView_14701)) {
            return super.equals(obj);
         } else {
            S2CR_EnterView_14701 other = (S2CR_EnterView_14701)obj;
            if (this.hasFightNum() != other.hasFightNum()) {
               return false;
            } else if (this.hasFightNum() && this.getFightNum() != other.getFightNum()) {
               return false;
            } else if (this.hasBuyNum() != other.hasBuyNum()) {
               return false;
            } else if (this.hasBuyNum() && this.getBuyNum() != other.getBuyNum()) {
               return false;
            } else if (this.hasUnionCopyNum() != other.hasUnionCopyNum()) {
               return false;
            } else if (this.hasUnionCopyNum() && this.getUnionCopyNum() != other.getUnionCopyNum()) {
               return false;
            } else if (this.hasUnionPublishNum() != other.hasUnionPublishNum()) {
               return false;
            } else if (this.hasUnionPublishNum() && this.getUnionPublishNum() != other.getUnionPublishNum()) {
               return false;
            } else if (this.hasCoolTime() != other.hasCoolTime()) {
               return false;
            } else if (this.hasCoolTime() && this.getCoolTime() != other.getCoolTime()) {
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

            if (this.hasBuyNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyNum();
            }

            if (this.hasUnionCopyNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getUnionCopyNum();
            }

            if (this.hasUnionPublishNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getUnionPublishNum();
            }

            if (this.hasCoolTime()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getCoolTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_EnterView_14701 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_EnterView_14701)PARSER.parseFrom(data);
      }

      public static S2CR_EnterView_14701 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_EnterView_14701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_EnterView_14701 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_EnterView_14701)PARSER.parseFrom(data);
      }

      public static S2CR_EnterView_14701 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_EnterView_14701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_EnterView_14701 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_EnterView_14701)PARSER.parseFrom(data);
      }

      public static S2CR_EnterView_14701 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_EnterView_14701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_EnterView_14701 parseFrom(InputStream input) throws IOException {
         return (S2CR_EnterView_14701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_EnterView_14701 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_EnterView_14701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_EnterView_14701 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_EnterView_14701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_EnterView_14701 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_EnterView_14701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_EnterView_14701 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_EnterView_14701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_EnterView_14701 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_EnterView_14701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_EnterView_14701 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_EnterView_14701 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_EnterView_14701> parser() {
         return PARSER;
      }

      public Parser<S2CR_EnterView_14701> getParserForType() {
         return PARSER;
      }

      public S2CR_EnterView_14701 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_EnterView_14701OrBuilder {
         private int bitField0_;
         private int fightNum_;
         private int buyNum_;
         private int unionCopyNum_;
         private int unionPublishNum_;
         private int coolTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_EnterView_14701_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_EnterView_14701_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_EnterView_14701.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionOfferMsg.S2CR_EnterView_14701.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.fightNum_ = 0;
            this.bitField0_ &= -2;
            this.buyNum_ = 0;
            this.bitField0_ &= -3;
            this.unionCopyNum_ = 0;
            this.bitField0_ &= -5;
            this.unionPublishNum_ = 0;
            this.bitField0_ &= -9;
            this.coolTime_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_EnterView_14701_descriptor;
         }

         public S2CR_EnterView_14701 getDefaultInstanceForType() {
            return CrossUnionOfferMsg.S2CR_EnterView_14701.getDefaultInstance();
         }

         public S2CR_EnterView_14701 build() {
            S2CR_EnterView_14701 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_EnterView_14701 buildPartial() {
            S2CR_EnterView_14701 result = new S2CR_EnterView_14701(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.fightNum_ = this.fightNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buyNum_ = this.buyNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.unionCopyNum_ = this.unionCopyNum_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.unionPublishNum_ = this.unionPublishNum_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.coolTime_ = this.coolTime_;
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
            if (other instanceof S2CR_EnterView_14701) {
               return this.mergeFrom((S2CR_EnterView_14701)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_EnterView_14701 other) {
            if (other == CrossUnionOfferMsg.S2CR_EnterView_14701.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFightNum()) {
                  this.setFightNum(other.getFightNum());
               }

               if (other.hasBuyNum()) {
                  this.setBuyNum(other.getBuyNum());
               }

               if (other.hasUnionCopyNum()) {
                  this.setUnionCopyNum(other.getUnionCopyNum());
               }

               if (other.hasUnionPublishNum()) {
                  this.setUnionPublishNum(other.getUnionPublishNum());
               }

               if (other.hasCoolTime()) {
                  this.setCoolTime(other.getCoolTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFightNum()) {
               return false;
            } else if (!this.hasBuyNum()) {
               return false;
            } else if (!this.hasUnionCopyNum()) {
               return false;
            } else if (!this.hasUnionPublishNum()) {
               return false;
            } else {
               return this.hasCoolTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_EnterView_14701 parsedMessage = null;

            try {
               parsedMessage = (S2CR_EnterView_14701)CrossUnionOfferMsg.S2CR_EnterView_14701.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_EnterView_14701)e.getUnfinishedMessage();
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

         public boolean hasBuyNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuyNum() {
            return this.buyNum_;
         }

         public Builder setBuyNum(int value) {
            this.bitField0_ |= 2;
            this.buyNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyNum() {
            this.bitField0_ &= -3;
            this.buyNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionCopyNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getUnionCopyNum() {
            return this.unionCopyNum_;
         }

         public Builder setUnionCopyNum(int value) {
            this.bitField0_ |= 4;
            this.unionCopyNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionCopyNum() {
            this.bitField0_ &= -5;
            this.unionCopyNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionPublishNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getUnionPublishNum() {
            return this.unionPublishNum_;
         }

         public Builder setUnionPublishNum(int value) {
            this.bitField0_ |= 8;
            this.unionPublishNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionPublishNum() {
            this.bitField0_ &= -9;
            this.unionPublishNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCoolTime() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getCoolTime() {
            return this.coolTime_;
         }

         public Builder setCoolTime(int value) {
            this.bitField0_ |= 16;
            this.coolTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCoolTime() {
            this.bitField0_ &= -17;
            this.coolTime_ = 0;
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

   public static final class S2CR_PublishOffer_14703 extends GeneratedMessageV3 implements S2CR_PublishOffer_14703OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int UNIONID_FIELD_NUMBER = 1;
      private int unionId_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int OFFERID_FIELD_NUMBER = 3;
      private int offerId_;
      public static final int TYPE_FIELD_NUMBER = 4;
      private int type_;
      private byte memoizedIsInitialized;
      private static final S2CR_PublishOffer_14703 DEFAULT_INSTANCE = new S2CR_PublishOffer_14703();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_PublishOffer_14703> PARSER = new AbstractParser<S2CR_PublishOffer_14703>() {
         public S2CR_PublishOffer_14703 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_PublishOffer_14703(input, extensionRegistry);
         }
      };

      private S2CR_PublishOffer_14703(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_PublishOffer_14703() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_PublishOffer_14703();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_PublishOffer_14703(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.playerId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.offerId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
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
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_PublishOffer_14703_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_PublishOffer_14703_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PublishOffer_14703.class, Builder.class);
      }

      public boolean hasUnionId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasOfferId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getOfferId() {
         return this.offerId_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 8) != 0;
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
         } else if (!this.hasUnionId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOfferId()) {
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
            output.writeInt32(1, this.unionId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.offerId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.type_);
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
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.offerId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_PublishOffer_14703)) {
            return super.equals(obj);
         } else {
            S2CR_PublishOffer_14703 other = (S2CR_PublishOffer_14703)obj;
            if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasOfferId() != other.hasOfferId()) {
               return false;
            } else if (this.hasOfferId() && this.getOfferId() != other.getOfferId()) {
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
            if (this.hasUnionId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUnionId();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasOfferId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getOfferId();
            }

            if (this.hasType()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_PublishOffer_14703 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_PublishOffer_14703)PARSER.parseFrom(data);
      }

      public static S2CR_PublishOffer_14703 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PublishOffer_14703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PublishOffer_14703 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_PublishOffer_14703)PARSER.parseFrom(data);
      }

      public static S2CR_PublishOffer_14703 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PublishOffer_14703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PublishOffer_14703 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_PublishOffer_14703)PARSER.parseFrom(data);
      }

      public static S2CR_PublishOffer_14703 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PublishOffer_14703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PublishOffer_14703 parseFrom(InputStream input) throws IOException {
         return (S2CR_PublishOffer_14703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PublishOffer_14703 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PublishOffer_14703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PublishOffer_14703 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_PublishOffer_14703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_PublishOffer_14703 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PublishOffer_14703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PublishOffer_14703 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_PublishOffer_14703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PublishOffer_14703 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PublishOffer_14703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_PublishOffer_14703 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_PublishOffer_14703 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_PublishOffer_14703> parser() {
         return PARSER;
      }

      public Parser<S2CR_PublishOffer_14703> getParserForType() {
         return PARSER;
      }

      public S2CR_PublishOffer_14703 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_PublishOffer_14703OrBuilder {
         private int bitField0_;
         private int unionId_;
         private int playerId_;
         private int offerId_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_PublishOffer_14703_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_PublishOffer_14703_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PublishOffer_14703.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionOfferMsg.S2CR_PublishOffer_14703.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.unionId_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.offerId_ = 0;
            this.bitField0_ &= -5;
            this.type_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_PublishOffer_14703_descriptor;
         }

         public S2CR_PublishOffer_14703 getDefaultInstanceForType() {
            return CrossUnionOfferMsg.S2CR_PublishOffer_14703.getDefaultInstance();
         }

         public S2CR_PublishOffer_14703 build() {
            S2CR_PublishOffer_14703 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_PublishOffer_14703 buildPartial() {
            S2CR_PublishOffer_14703 result = new S2CR_PublishOffer_14703(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.unionId_ = this.unionId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.offerId_ = this.offerId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof S2CR_PublishOffer_14703) {
               return this.mergeFrom((S2CR_PublishOffer_14703)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_PublishOffer_14703 other) {
            if (other == CrossUnionOfferMsg.S2CR_PublishOffer_14703.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasOfferId()) {
                  this.setOfferId(other.getOfferId());
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
            if (!this.hasUnionId()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasOfferId()) {
               return false;
            } else {
               return this.hasType();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_PublishOffer_14703 parsedMessage = null;

            try {
               parsedMessage = (S2CR_PublishOffer_14703)CrossUnionOfferMsg.S2CR_PublishOffer_14703.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_PublishOffer_14703)e.getUnfinishedMessage();
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

         public boolean hasOfferId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getOfferId() {
            return this.offerId_;
         }

         public Builder setOfferId(int value) {
            this.bitField0_ |= 4;
            this.offerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOfferId() {
            this.bitField0_ &= -5;
            this.offerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 8;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -9;
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

   public static final class CR2S_PublishOffer_14704 extends GeneratedMessageV3 implements CR2S_PublishOffer_14704OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OFFER_FIELD_NUMBER = 1;
      private UnionOfferMsg.OfferRewardInfo offer_;
      private byte memoizedIsInitialized;
      private static final CR2S_PublishOffer_14704 DEFAULT_INSTANCE = new CR2S_PublishOffer_14704();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_PublishOffer_14704> PARSER = new AbstractParser<CR2S_PublishOffer_14704>() {
         public CR2S_PublishOffer_14704 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_PublishOffer_14704(input, extensionRegistry);
         }
      };

      private CR2S_PublishOffer_14704(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_PublishOffer_14704() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_PublishOffer_14704();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_PublishOffer_14704(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        UnionOfferMsg.OfferRewardInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.offer_.toBuilder();
                        }

                        this.offer_ = (UnionOfferMsg.OfferRewardInfo)input.readMessage(UnionOfferMsg.OfferRewardInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.offer_);
                           this.offer_ = subBuilder.buildPartial();
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
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_PublishOffer_14704_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_PublishOffer_14704_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PublishOffer_14704.class, Builder.class);
      }

      public boolean hasOffer() {
         return (this.bitField0_ & 1) != 0;
      }

      public UnionOfferMsg.OfferRewardInfo getOffer() {
         return this.offer_ == null ? UnionOfferMsg.OfferRewardInfo.getDefaultInstance() : this.offer_;
      }

      public UnionOfferMsg.OfferRewardInfoOrBuilder getOfferOrBuilder() {
         return this.offer_ == null ? UnionOfferMsg.OfferRewardInfo.getDefaultInstance() : this.offer_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasOffer()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getOffer().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getOffer());
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
               size += CodedOutputStream.computeMessageSize(1, this.getOffer());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_PublishOffer_14704)) {
            return super.equals(obj);
         } else {
            CR2S_PublishOffer_14704 other = (CR2S_PublishOffer_14704)obj;
            if (this.hasOffer() != other.hasOffer()) {
               return false;
            } else if (this.hasOffer() && !this.getOffer().equals(other.getOffer())) {
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
            if (this.hasOffer()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOffer().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_PublishOffer_14704 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_PublishOffer_14704)PARSER.parseFrom(data);
      }

      public static CR2S_PublishOffer_14704 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PublishOffer_14704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PublishOffer_14704 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_PublishOffer_14704)PARSER.parseFrom(data);
      }

      public static CR2S_PublishOffer_14704 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PublishOffer_14704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PublishOffer_14704 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_PublishOffer_14704)PARSER.parseFrom(data);
      }

      public static CR2S_PublishOffer_14704 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PublishOffer_14704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PublishOffer_14704 parseFrom(InputStream input) throws IOException {
         return (CR2S_PublishOffer_14704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PublishOffer_14704 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PublishOffer_14704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PublishOffer_14704 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_PublishOffer_14704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_PublishOffer_14704 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PublishOffer_14704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PublishOffer_14704 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_PublishOffer_14704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PublishOffer_14704 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PublishOffer_14704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_PublishOffer_14704 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_PublishOffer_14704 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_PublishOffer_14704> parser() {
         return PARSER;
      }

      public Parser<CR2S_PublishOffer_14704> getParserForType() {
         return PARSER;
      }

      public CR2S_PublishOffer_14704 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_PublishOffer_14704OrBuilder {
         private int bitField0_;
         private UnionOfferMsg.OfferRewardInfo offer_;
         private SingleFieldBuilderV3<UnionOfferMsg.OfferRewardInfo, UnionOfferMsg.OfferRewardInfo.Builder, UnionOfferMsg.OfferRewardInfoOrBuilder> offerBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_PublishOffer_14704_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_PublishOffer_14704_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PublishOffer_14704.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionOfferMsg.CR2S_PublishOffer_14704.alwaysUseFieldBuilders) {
               this.getOfferFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.offerBuilder_ == null) {
               this.offer_ = null;
            } else {
               this.offerBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_PublishOffer_14704_descriptor;
         }

         public CR2S_PublishOffer_14704 getDefaultInstanceForType() {
            return CrossUnionOfferMsg.CR2S_PublishOffer_14704.getDefaultInstance();
         }

         public CR2S_PublishOffer_14704 build() {
            CR2S_PublishOffer_14704 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_PublishOffer_14704 buildPartial() {
            CR2S_PublishOffer_14704 result = new CR2S_PublishOffer_14704(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.offerBuilder_ == null) {
                  result.offer_ = this.offer_;
               } else {
                  result.offer_ = (UnionOfferMsg.OfferRewardInfo)this.offerBuilder_.build();
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
            if (other instanceof CR2S_PublishOffer_14704) {
               return this.mergeFrom((CR2S_PublishOffer_14704)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_PublishOffer_14704 other) {
            if (other == CrossUnionOfferMsg.CR2S_PublishOffer_14704.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOffer()) {
                  this.mergeOffer(other.getOffer());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasOffer()) {
               return false;
            } else {
               return this.getOffer().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_PublishOffer_14704 parsedMessage = null;

            try {
               parsedMessage = (CR2S_PublishOffer_14704)CrossUnionOfferMsg.CR2S_PublishOffer_14704.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_PublishOffer_14704)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOffer() {
            return (this.bitField0_ & 1) != 0;
         }

         public UnionOfferMsg.OfferRewardInfo getOffer() {
            if (this.offerBuilder_ == null) {
               return this.offer_ == null ? UnionOfferMsg.OfferRewardInfo.getDefaultInstance() : this.offer_;
            } else {
               return (UnionOfferMsg.OfferRewardInfo)this.offerBuilder_.getMessage();
            }
         }

         public Builder setOffer(UnionOfferMsg.OfferRewardInfo value) {
            if (this.offerBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.offer_ = value;
               this.onChanged();
            } else {
               this.offerBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setOffer(UnionOfferMsg.OfferRewardInfo.Builder builderForValue) {
            if (this.offerBuilder_ == null) {
               this.offer_ = builderForValue.build();
               this.onChanged();
            } else {
               this.offerBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeOffer(UnionOfferMsg.OfferRewardInfo value) {
            if (this.offerBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.offer_ != null && this.offer_ != UnionOfferMsg.OfferRewardInfo.getDefaultInstance()) {
                  this.offer_ = UnionOfferMsg.OfferRewardInfo.newBuilder(this.offer_).mergeFrom(value).buildPartial();
               } else {
                  this.offer_ = value;
               }

               this.onChanged();
            } else {
               this.offerBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearOffer() {
            if (this.offerBuilder_ == null) {
               this.offer_ = null;
               this.onChanged();
            } else {
               this.offerBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public UnionOfferMsg.OfferRewardInfo.Builder getOfferBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (UnionOfferMsg.OfferRewardInfo.Builder)this.getOfferFieldBuilder().getBuilder();
         }

         public UnionOfferMsg.OfferRewardInfoOrBuilder getOfferOrBuilder() {
            if (this.offerBuilder_ != null) {
               return (UnionOfferMsg.OfferRewardInfoOrBuilder)this.offerBuilder_.getMessageOrBuilder();
            } else {
               return this.offer_ == null ? UnionOfferMsg.OfferRewardInfo.getDefaultInstance() : this.offer_;
            }
         }

         private SingleFieldBuilderV3<UnionOfferMsg.OfferRewardInfo, UnionOfferMsg.OfferRewardInfo.Builder, UnionOfferMsg.OfferRewardInfoOrBuilder> getOfferFieldBuilder() {
            if (this.offerBuilder_ == null) {
               this.offerBuilder_ = new SingleFieldBuilderV3(this.getOffer(), this.getParentForChildren(), this.isClean());
               this.offer_ = null;
            }

            return this.offerBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_UpdateOffer_14706 extends GeneratedMessageV3 implements CR2S_UpdateOffer_14706OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private UnionOfferMsg.OfferRewardInfo info_;
      private byte memoizedIsInitialized;
      private static final CR2S_UpdateOffer_14706 DEFAULT_INSTANCE = new CR2S_UpdateOffer_14706();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UpdateOffer_14706> PARSER = new AbstractParser<CR2S_UpdateOffer_14706>() {
         public CR2S_UpdateOffer_14706 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UpdateOffer_14706(input, extensionRegistry);
         }
      };

      private CR2S_UpdateOffer_14706(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UpdateOffer_14706() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UpdateOffer_14706();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UpdateOffer_14706(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        UnionOfferMsg.OfferRewardInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (UnionOfferMsg.OfferRewardInfo)input.readMessage(UnionOfferMsg.OfferRewardInfo.PARSER, extensionRegistry);
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
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UpdateOffer_14706_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UpdateOffer_14706_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdateOffer_14706.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public UnionOfferMsg.OfferRewardInfo getInfo() {
         return this.info_ == null ? UnionOfferMsg.OfferRewardInfo.getDefaultInstance() : this.info_;
      }

      public UnionOfferMsg.OfferRewardInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? UnionOfferMsg.OfferRewardInfo.getDefaultInstance() : this.info_;
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
         } else if (!(obj instanceof CR2S_UpdateOffer_14706)) {
            return super.equals(obj);
         } else {
            CR2S_UpdateOffer_14706 other = (CR2S_UpdateOffer_14706)obj;
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

      public static CR2S_UpdateOffer_14706 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateOffer_14706)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateOffer_14706 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateOffer_14706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateOffer_14706 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateOffer_14706)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateOffer_14706 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateOffer_14706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateOffer_14706 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateOffer_14706)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateOffer_14706 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateOffer_14706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateOffer_14706 parseFrom(InputStream input) throws IOException {
         return (CR2S_UpdateOffer_14706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdateOffer_14706 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateOffer_14706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdateOffer_14706 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UpdateOffer_14706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UpdateOffer_14706 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateOffer_14706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdateOffer_14706 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UpdateOffer_14706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdateOffer_14706 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateOffer_14706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UpdateOffer_14706 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UpdateOffer_14706 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UpdateOffer_14706> parser() {
         return PARSER;
      }

      public Parser<CR2S_UpdateOffer_14706> getParserForType() {
         return PARSER;
      }

      public CR2S_UpdateOffer_14706 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UpdateOffer_14706OrBuilder {
         private int bitField0_;
         private UnionOfferMsg.OfferRewardInfo info_;
         private SingleFieldBuilderV3<UnionOfferMsg.OfferRewardInfo, UnionOfferMsg.OfferRewardInfo.Builder, UnionOfferMsg.OfferRewardInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UpdateOffer_14706_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UpdateOffer_14706_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdateOffer_14706.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionOfferMsg.CR2S_UpdateOffer_14706.alwaysUseFieldBuilders) {
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
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UpdateOffer_14706_descriptor;
         }

         public CR2S_UpdateOffer_14706 getDefaultInstanceForType() {
            return CrossUnionOfferMsg.CR2S_UpdateOffer_14706.getDefaultInstance();
         }

         public CR2S_UpdateOffer_14706 build() {
            CR2S_UpdateOffer_14706 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UpdateOffer_14706 buildPartial() {
            CR2S_UpdateOffer_14706 result = new CR2S_UpdateOffer_14706(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (UnionOfferMsg.OfferRewardInfo)this.infoBuilder_.build();
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
            if (other instanceof CR2S_UpdateOffer_14706) {
               return this.mergeFrom((CR2S_UpdateOffer_14706)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UpdateOffer_14706 other) {
            if (other == CrossUnionOfferMsg.CR2S_UpdateOffer_14706.getDefaultInstance()) {
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
            CR2S_UpdateOffer_14706 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UpdateOffer_14706)CrossUnionOfferMsg.CR2S_UpdateOffer_14706.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UpdateOffer_14706)e.getUnfinishedMessage();
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

         public UnionOfferMsg.OfferRewardInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? UnionOfferMsg.OfferRewardInfo.getDefaultInstance() : this.info_;
            } else {
               return (UnionOfferMsg.OfferRewardInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(UnionOfferMsg.OfferRewardInfo value) {
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

         public Builder setInfo(UnionOfferMsg.OfferRewardInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(UnionOfferMsg.OfferRewardInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != UnionOfferMsg.OfferRewardInfo.getDefaultInstance()) {
                  this.info_ = UnionOfferMsg.OfferRewardInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public UnionOfferMsg.OfferRewardInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (UnionOfferMsg.OfferRewardInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public UnionOfferMsg.OfferRewardInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (UnionOfferMsg.OfferRewardInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? UnionOfferMsg.OfferRewardInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<UnionOfferMsg.OfferRewardInfo, UnionOfferMsg.OfferRewardInfo.Builder, UnionOfferMsg.OfferRewardInfoOrBuilder> getInfoFieldBuilder() {
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

   public static final class CR2S_DelOffer_14708 extends GeneratedMessageV3 implements CR2S_DelOffer_14708OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CODES_FIELD_NUMBER = 1;
      private Internal.IntList codes_;
      private byte memoizedIsInitialized;
      private static final CR2S_DelOffer_14708 DEFAULT_INSTANCE = new CR2S_DelOffer_14708();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_DelOffer_14708> PARSER = new AbstractParser<CR2S_DelOffer_14708>() {
         public CR2S_DelOffer_14708 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_DelOffer_14708(input, extensionRegistry);
         }
      };

      private CR2S_DelOffer_14708(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_DelOffer_14708() {
         this.memoizedIsInitialized = -1;
         this.codes_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_DelOffer_14708();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_DelOffer_14708(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_DelOffer_14708_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_DelOffer_14708_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_DelOffer_14708.class, Builder.class);
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
         } else if (!(obj instanceof CR2S_DelOffer_14708)) {
            return super.equals(obj);
         } else {
            CR2S_DelOffer_14708 other = (CR2S_DelOffer_14708)obj;
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

      public static CR2S_DelOffer_14708 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_DelOffer_14708)PARSER.parseFrom(data);
      }

      public static CR2S_DelOffer_14708 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_DelOffer_14708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_DelOffer_14708 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_DelOffer_14708)PARSER.parseFrom(data);
      }

      public static CR2S_DelOffer_14708 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_DelOffer_14708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_DelOffer_14708 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_DelOffer_14708)PARSER.parseFrom(data);
      }

      public static CR2S_DelOffer_14708 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_DelOffer_14708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_DelOffer_14708 parseFrom(InputStream input) throws IOException {
         return (CR2S_DelOffer_14708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_DelOffer_14708 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_DelOffer_14708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_DelOffer_14708 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_DelOffer_14708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_DelOffer_14708 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_DelOffer_14708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_DelOffer_14708 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_DelOffer_14708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_DelOffer_14708 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_DelOffer_14708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_DelOffer_14708 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_DelOffer_14708 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_DelOffer_14708> parser() {
         return PARSER;
      }

      public Parser<CR2S_DelOffer_14708> getParserForType() {
         return PARSER;
      }

      public CR2S_DelOffer_14708 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_DelOffer_14708OrBuilder {
         private int bitField0_;
         private Internal.IntList codes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_DelOffer_14708_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_DelOffer_14708_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_DelOffer_14708.class, Builder.class);
         }

         private Builder() {
            this.codes_ = CrossUnionOfferMsg.CR2S_DelOffer_14708.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codes_ = CrossUnionOfferMsg.CR2S_DelOffer_14708.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionOfferMsg.CR2S_DelOffer_14708.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.codes_ = CrossUnionOfferMsg.CR2S_DelOffer_14708.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_DelOffer_14708_descriptor;
         }

         public CR2S_DelOffer_14708 getDefaultInstanceForType() {
            return CrossUnionOfferMsg.CR2S_DelOffer_14708.getDefaultInstance();
         }

         public CR2S_DelOffer_14708 build() {
            CR2S_DelOffer_14708 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_DelOffer_14708 buildPartial() {
            CR2S_DelOffer_14708 result = new CR2S_DelOffer_14708(this);
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
            if (other instanceof CR2S_DelOffer_14708) {
               return this.mergeFrom((CR2S_DelOffer_14708)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_DelOffer_14708 other) {
            if (other == CrossUnionOfferMsg.CR2S_DelOffer_14708.getDefaultInstance()) {
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
            CR2S_DelOffer_14708 parsedMessage = null;

            try {
               parsedMessage = (CR2S_DelOffer_14708)CrossUnionOfferMsg.CR2S_DelOffer_14708.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_DelOffer_14708)e.getUnfinishedMessage();
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
               this.codes_ = CrossUnionOfferMsg.CR2S_DelOffer_14708.mutableCopy(this.codes_);
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
            this.codes_ = CrossUnionOfferMsg.CR2S_DelOffer_14708.emptyIntList();
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

   public static final class S2CR_Fight_14709 extends GeneratedMessageV3 implements S2CR_Fight_14709OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int HEROARRAYINGDATA_FIELD_NUMBER = 2;
      private ByteString heroArrayingData_;
      private byte memoizedIsInitialized;
      private static final S2CR_Fight_14709 DEFAULT_INSTANCE = new S2CR_Fight_14709();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Fight_14709> PARSER = new AbstractParser<S2CR_Fight_14709>() {
         public S2CR_Fight_14709 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Fight_14709(input, extensionRegistry);
         }
      };

      private S2CR_Fight_14709(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Fight_14709() {
         this.memoizedIsInitialized = -1;
         this.heroArrayingData_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Fight_14709();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Fight_14709(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_Fight_14709_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_Fight_14709_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Fight_14709.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
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
         } else if (!this.hasCode()) {
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
            output.writeInt32(1, this.code_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
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
         } else if (!(obj instanceof S2CR_Fight_14709)) {
            return super.equals(obj);
         } else {
            S2CR_Fight_14709 other = (S2CR_Fight_14709)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
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

      public static S2CR_Fight_14709 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Fight_14709)PARSER.parseFrom(data);
      }

      public static S2CR_Fight_14709 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Fight_14709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Fight_14709 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Fight_14709)PARSER.parseFrom(data);
      }

      public static S2CR_Fight_14709 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Fight_14709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Fight_14709 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Fight_14709)PARSER.parseFrom(data);
      }

      public static S2CR_Fight_14709 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Fight_14709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Fight_14709 parseFrom(InputStream input) throws IOException {
         return (S2CR_Fight_14709)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Fight_14709 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Fight_14709)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Fight_14709 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Fight_14709)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Fight_14709 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Fight_14709)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Fight_14709 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Fight_14709)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Fight_14709 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Fight_14709)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Fight_14709 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Fight_14709 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Fight_14709> parser() {
         return PARSER;
      }

      public Parser<S2CR_Fight_14709> getParserForType() {
         return PARSER;
      }

      public S2CR_Fight_14709 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Fight_14709OrBuilder {
         private int bitField0_;
         private int code_;
         private ByteString heroArrayingData_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_Fight_14709_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_Fight_14709_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Fight_14709.class, Builder.class);
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
            if (CrossUnionOfferMsg.S2CR_Fight_14709.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.heroArrayingData_ = ByteString.EMPTY;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_Fight_14709_descriptor;
         }

         public S2CR_Fight_14709 getDefaultInstanceForType() {
            return CrossUnionOfferMsg.S2CR_Fight_14709.getDefaultInstance();
         }

         public S2CR_Fight_14709 build() {
            S2CR_Fight_14709 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Fight_14709 buildPartial() {
            S2CR_Fight_14709 result = new S2CR_Fight_14709(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
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
            if (other instanceof S2CR_Fight_14709) {
               return this.mergeFrom((S2CR_Fight_14709)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Fight_14709 other) {
            if (other == CrossUnionOfferMsg.S2CR_Fight_14709.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
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
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasHeroArrayingData();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_Fight_14709 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Fight_14709)CrossUnionOfferMsg.S2CR_Fight_14709.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Fight_14709)e.getUnfinishedMessage();
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
            this.heroArrayingData_ = CrossUnionOfferMsg.S2CR_Fight_14709.getDefaultInstance().getHeroArrayingData();
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

   public static final class CR2S_Fight_14710 extends GeneratedMessageV3 implements CR2S_Fight_14710OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int UNIONPOINT_FIELD_NUMBER = 2;
      private int unionPoint_;
      public static final int OFFERREWARDID_FIELD_NUMBER = 3;
      private int offerRewardId_;
      public static final int ISKILL_FIELD_NUMBER = 4;
      private boolean isKill_;
      public static final int OFFERHEROID_FIELD_NUMBER = 5;
      private int offerHeroId_;
      public static final int BATTLEMSG_FIELD_NUMBER = 6;
      private BattleMsg.S2C_BattleResult_6102 battleMsg_;
      private byte memoizedIsInitialized;
      private static final CR2S_Fight_14710 DEFAULT_INSTANCE = new CR2S_Fight_14710();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_Fight_14710> PARSER = new AbstractParser<CR2S_Fight_14710>() {
         public CR2S_Fight_14710 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_Fight_14710(input, extensionRegistry);
         }
      };

      private CR2S_Fight_14710(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_Fight_14710() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_Fight_14710();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_Fight_14710(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.unionPoint_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.offerRewardId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.isKill_ = input.readBool();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.offerHeroId_ = input.readInt32();
                        break;
                     case 50:
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 32) != 0) {
                           subBuilder = this.battleMsg_.toBuilder();
                        }

                        this.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.battleMsg_);
                           this.battleMsg_ = subBuilder.buildPartial();
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
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_Fight_14710_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_Fight_14710_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Fight_14710.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasUnionPoint() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getUnionPoint() {
         return this.unionPoint_;
      }

      public boolean hasOfferRewardId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getOfferRewardId() {
         return this.offerRewardId_;
      }

      public boolean hasIsKill() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getIsKill() {
         return this.isKill_;
      }

      public boolean hasOfferHeroId() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getOfferHeroId() {
         return this.offerHeroId_;
      }

      public boolean hasBattleMsg() {
         return (this.bitField0_ & 32) != 0;
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
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasUnionPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOfferRewardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsKill()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOfferHeroId()) {
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
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.unionPoint_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.offerRewardId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBool(4, this.isKill_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.offerHeroId_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeMessage(6, this.getBattleMsg());
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
               size += CodedOutputStream.computeInt32Size(2, this.unionPoint_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.offerRewardId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.isKill_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.offerHeroId_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeMessageSize(6, this.getBattleMsg());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_Fight_14710)) {
            return super.equals(obj);
         } else {
            CR2S_Fight_14710 other = (CR2S_Fight_14710)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasUnionPoint() != other.hasUnionPoint()) {
               return false;
            } else if (this.hasUnionPoint() && this.getUnionPoint() != other.getUnionPoint()) {
               return false;
            } else if (this.hasOfferRewardId() != other.hasOfferRewardId()) {
               return false;
            } else if (this.hasOfferRewardId() && this.getOfferRewardId() != other.getOfferRewardId()) {
               return false;
            } else if (this.hasIsKill() != other.hasIsKill()) {
               return false;
            } else if (this.hasIsKill() && this.getIsKill() != other.getIsKill()) {
               return false;
            } else if (this.hasOfferHeroId() != other.hasOfferHeroId()) {
               return false;
            } else if (this.hasOfferHeroId() && this.getOfferHeroId() != other.getOfferHeroId()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasUnionPoint()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getUnionPoint();
            }

            if (this.hasOfferRewardId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getOfferRewardId();
            }

            if (this.hasIsKill()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getIsKill());
            }

            if (this.hasOfferHeroId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getOfferHeroId();
            }

            if (this.hasBattleMsg()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getBattleMsg().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_Fight_14710 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_Fight_14710)PARSER.parseFrom(data);
      }

      public static CR2S_Fight_14710 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Fight_14710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Fight_14710 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_Fight_14710)PARSER.parseFrom(data);
      }

      public static CR2S_Fight_14710 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Fight_14710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Fight_14710 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_Fight_14710)PARSER.parseFrom(data);
      }

      public static CR2S_Fight_14710 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Fight_14710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Fight_14710 parseFrom(InputStream input) throws IOException {
         return (CR2S_Fight_14710)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Fight_14710 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Fight_14710)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Fight_14710 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_Fight_14710)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_Fight_14710 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Fight_14710)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Fight_14710 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_Fight_14710)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Fight_14710 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Fight_14710)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_Fight_14710 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_Fight_14710 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_Fight_14710> parser() {
         return PARSER;
      }

      public Parser<CR2S_Fight_14710> getParserForType() {
         return PARSER;
      }

      public CR2S_Fight_14710 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_Fight_14710OrBuilder {
         private int bitField0_;
         private int code_;
         private int unionPoint_;
         private int offerRewardId_;
         private boolean isKill_;
         private int offerHeroId_;
         private BattleMsg.S2C_BattleResult_6102 battleMsg_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> battleMsgBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_Fight_14710_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_Fight_14710_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Fight_14710.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionOfferMsg.CR2S_Fight_14710.alwaysUseFieldBuilders) {
               this.getBattleMsgFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.unionPoint_ = 0;
            this.bitField0_ &= -3;
            this.offerRewardId_ = 0;
            this.bitField0_ &= -5;
            this.isKill_ = false;
            this.bitField0_ &= -9;
            this.offerHeroId_ = 0;
            this.bitField0_ &= -17;
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_Fight_14710_descriptor;
         }

         public CR2S_Fight_14710 getDefaultInstanceForType() {
            return CrossUnionOfferMsg.CR2S_Fight_14710.getDefaultInstance();
         }

         public CR2S_Fight_14710 build() {
            CR2S_Fight_14710 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_Fight_14710 buildPartial() {
            CR2S_Fight_14710 result = new CR2S_Fight_14710(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.unionPoint_ = this.unionPoint_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.offerRewardId_ = this.offerRewardId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.isKill_ = this.isKill_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.offerHeroId_ = this.offerHeroId_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               if (this.battleMsgBuilder_ == null) {
                  result.battleMsg_ = this.battleMsg_;
               } else {
                  result.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)this.battleMsgBuilder_.build();
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
            if (other instanceof CR2S_Fight_14710) {
               return this.mergeFrom((CR2S_Fight_14710)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_Fight_14710 other) {
            if (other == CrossUnionOfferMsg.CR2S_Fight_14710.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasUnionPoint()) {
                  this.setUnionPoint(other.getUnionPoint());
               }

               if (other.hasOfferRewardId()) {
                  this.setOfferRewardId(other.getOfferRewardId());
               }

               if (other.hasIsKill()) {
                  this.setIsKill(other.getIsKill());
               }

               if (other.hasOfferHeroId()) {
                  this.setOfferHeroId(other.getOfferHeroId());
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
            if (!this.hasCode()) {
               return false;
            } else if (!this.hasUnionPoint()) {
               return false;
            } else if (!this.hasOfferRewardId()) {
               return false;
            } else if (!this.hasIsKill()) {
               return false;
            } else if (!this.hasOfferHeroId()) {
               return false;
            } else if (!this.hasBattleMsg()) {
               return false;
            } else {
               return this.getBattleMsg().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_Fight_14710 parsedMessage = null;

            try {
               parsedMessage = (CR2S_Fight_14710)CrossUnionOfferMsg.CR2S_Fight_14710.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_Fight_14710)e.getUnfinishedMessage();
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

         public boolean hasUnionPoint() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getUnionPoint() {
            return this.unionPoint_;
         }

         public Builder setUnionPoint(int value) {
            this.bitField0_ |= 2;
            this.unionPoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionPoint() {
            this.bitField0_ &= -3;
            this.unionPoint_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOfferRewardId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getOfferRewardId() {
            return this.offerRewardId_;
         }

         public Builder setOfferRewardId(int value) {
            this.bitField0_ |= 4;
            this.offerRewardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOfferRewardId() {
            this.bitField0_ &= -5;
            this.offerRewardId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsKill() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getIsKill() {
            return this.isKill_;
         }

         public Builder setIsKill(boolean value) {
            this.bitField0_ |= 8;
            this.isKill_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsKill() {
            this.bitField0_ &= -9;
            this.isKill_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasOfferHeroId() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getOfferHeroId() {
            return this.offerHeroId_;
         }

         public Builder setOfferHeroId(int value) {
            this.bitField0_ |= 16;
            this.offerHeroId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOfferHeroId() {
            this.bitField0_ &= -17;
            this.offerHeroId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBattleMsg() {
            return (this.bitField0_ & 32) != 0;
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

            this.bitField0_ |= 32;
            return this;
         }

         public Builder setBattleMsg(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = builderForValue.build();
               this.onChanged();
            } else {
               this.battleMsgBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder mergeBattleMsg(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleMsgBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0 && this.battleMsg_ != null && this.battleMsg_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.battleMsg_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.battleMsg_).mergeFrom(value).buildPartial();
               } else {
                  this.battleMsg_ = value;
               }

               this.onChanged();
            } else {
               this.battleMsgBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder clearBattleMsg() {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
               this.onChanged();
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -33;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getBattleMsgBuilder() {
            this.bitField0_ |= 32;
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

   public static final class S2CR_Record_14711 extends GeneratedMessageV3 implements S2CR_Record_14711OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int UNIONID_FIELD_NUMBER = 1;
      private int unionId_;
      private byte memoizedIsInitialized;
      private static final S2CR_Record_14711 DEFAULT_INSTANCE = new S2CR_Record_14711();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Record_14711> PARSER = new AbstractParser<S2CR_Record_14711>() {
         public S2CR_Record_14711 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Record_14711(input, extensionRegistry);
         }
      };

      private S2CR_Record_14711(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Record_14711() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Record_14711();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Record_14711(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_Record_14711_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_Record_14711_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Record_14711.class, Builder.class);
      }

      public boolean hasUnionId() {
         return (this.bitField0_ & 1) != 0;
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
         } else if (!this.hasUnionId()) {
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_Record_14711)) {
            return super.equals(obj);
         } else {
            S2CR_Record_14711 other = (S2CR_Record_14711)obj;
            if (this.hasUnionId() != other.hasUnionId()) {
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
            if (this.hasUnionId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUnionId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_Record_14711 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Record_14711)PARSER.parseFrom(data);
      }

      public static S2CR_Record_14711 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Record_14711)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Record_14711 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Record_14711)PARSER.parseFrom(data);
      }

      public static S2CR_Record_14711 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Record_14711)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Record_14711 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Record_14711)PARSER.parseFrom(data);
      }

      public static S2CR_Record_14711 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Record_14711)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Record_14711 parseFrom(InputStream input) throws IOException {
         return (S2CR_Record_14711)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Record_14711 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Record_14711)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Record_14711 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Record_14711)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Record_14711 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Record_14711)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Record_14711 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Record_14711)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Record_14711 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Record_14711)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Record_14711 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Record_14711 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Record_14711> parser() {
         return PARSER;
      }

      public Parser<S2CR_Record_14711> getParserForType() {
         return PARSER;
      }

      public S2CR_Record_14711 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Record_14711OrBuilder {
         private int bitField0_;
         private int unionId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_Record_14711_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_Record_14711_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Record_14711.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionOfferMsg.S2CR_Record_14711.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.unionId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_Record_14711_descriptor;
         }

         public S2CR_Record_14711 getDefaultInstanceForType() {
            return CrossUnionOfferMsg.S2CR_Record_14711.getDefaultInstance();
         }

         public S2CR_Record_14711 build() {
            S2CR_Record_14711 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Record_14711 buildPartial() {
            S2CR_Record_14711 result = new S2CR_Record_14711(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.unionId_ = this.unionId_;
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
            if (other instanceof S2CR_Record_14711) {
               return this.mergeFrom((S2CR_Record_14711)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Record_14711 other) {
            if (other == CrossUnionOfferMsg.S2CR_Record_14711.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasUnionId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_Record_14711 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Record_14711)CrossUnionOfferMsg.S2CR_Record_14711.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Record_14711)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_OfferDetail_14715 extends GeneratedMessageV3 implements S2CR_OfferDetail_14715OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      private byte memoizedIsInitialized;
      private static final S2CR_OfferDetail_14715 DEFAULT_INSTANCE = new S2CR_OfferDetail_14715();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_OfferDetail_14715> PARSER = new AbstractParser<S2CR_OfferDetail_14715>() {
         public S2CR_OfferDetail_14715 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_OfferDetail_14715(input, extensionRegistry);
         }
      };

      private S2CR_OfferDetail_14715(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_OfferDetail_14715() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_OfferDetail_14715();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_OfferDetail_14715(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_OfferDetail_14715_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_OfferDetail_14715_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_OfferDetail_14715.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_OfferDetail_14715)) {
            return super.equals(obj);
         } else {
            S2CR_OfferDetail_14715 other = (S2CR_OfferDetail_14715)obj;
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

      public static S2CR_OfferDetail_14715 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_OfferDetail_14715)PARSER.parseFrom(data);
      }

      public static S2CR_OfferDetail_14715 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_OfferDetail_14715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_OfferDetail_14715 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_OfferDetail_14715)PARSER.parseFrom(data);
      }

      public static S2CR_OfferDetail_14715 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_OfferDetail_14715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_OfferDetail_14715 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_OfferDetail_14715)PARSER.parseFrom(data);
      }

      public static S2CR_OfferDetail_14715 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_OfferDetail_14715)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_OfferDetail_14715 parseFrom(InputStream input) throws IOException {
         return (S2CR_OfferDetail_14715)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_OfferDetail_14715 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_OfferDetail_14715)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_OfferDetail_14715 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_OfferDetail_14715)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_OfferDetail_14715 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_OfferDetail_14715)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_OfferDetail_14715 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_OfferDetail_14715)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_OfferDetail_14715 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_OfferDetail_14715)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_OfferDetail_14715 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_OfferDetail_14715 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_OfferDetail_14715> parser() {
         return PARSER;
      }

      public Parser<S2CR_OfferDetail_14715> getParserForType() {
         return PARSER;
      }

      public S2CR_OfferDetail_14715 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_OfferDetail_14715OrBuilder {
         private int bitField0_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_OfferDetail_14715_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_OfferDetail_14715_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_OfferDetail_14715.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionOfferMsg.S2CR_OfferDetail_14715.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_OfferDetail_14715_descriptor;
         }

         public S2CR_OfferDetail_14715 getDefaultInstanceForType() {
            return CrossUnionOfferMsg.S2CR_OfferDetail_14715.getDefaultInstance();
         }

         public S2CR_OfferDetail_14715 build() {
            S2CR_OfferDetail_14715 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_OfferDetail_14715 buildPartial() {
            S2CR_OfferDetail_14715 result = new S2CR_OfferDetail_14715(this);
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
            if (other instanceof S2CR_OfferDetail_14715) {
               return this.mergeFrom((S2CR_OfferDetail_14715)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_OfferDetail_14715 other) {
            if (other == CrossUnionOfferMsg.S2CR_OfferDetail_14715.getDefaultInstance()) {
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
            S2CR_OfferDetail_14715 parsedMessage = null;

            try {
               parsedMessage = (S2CR_OfferDetail_14715)CrossUnionOfferMsg.S2CR_OfferDetail_14715.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_OfferDetail_14715)e.getUnfinishedMessage();
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

   public static final class S2CR_DamageRank_14717 extends GeneratedMessageV3 implements S2CR_DamageRank_14717OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      private byte memoizedIsInitialized;
      private static final S2CR_DamageRank_14717 DEFAULT_INSTANCE = new S2CR_DamageRank_14717();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_DamageRank_14717> PARSER = new AbstractParser<S2CR_DamageRank_14717>() {
         public S2CR_DamageRank_14717 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_DamageRank_14717(input, extensionRegistry);
         }
      };

      private S2CR_DamageRank_14717(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_DamageRank_14717() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_DamageRank_14717();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_DamageRank_14717(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_DamageRank_14717_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_DamageRank_14717_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_DamageRank_14717.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_DamageRank_14717)) {
            return super.equals(obj);
         } else {
            S2CR_DamageRank_14717 other = (S2CR_DamageRank_14717)obj;
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

      public static S2CR_DamageRank_14717 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_DamageRank_14717)PARSER.parseFrom(data);
      }

      public static S2CR_DamageRank_14717 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DamageRank_14717)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DamageRank_14717 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_DamageRank_14717)PARSER.parseFrom(data);
      }

      public static S2CR_DamageRank_14717 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DamageRank_14717)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DamageRank_14717 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_DamageRank_14717)PARSER.parseFrom(data);
      }

      public static S2CR_DamageRank_14717 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DamageRank_14717)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DamageRank_14717 parseFrom(InputStream input) throws IOException {
         return (S2CR_DamageRank_14717)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_DamageRank_14717 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DamageRank_14717)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_DamageRank_14717 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_DamageRank_14717)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_DamageRank_14717 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DamageRank_14717)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_DamageRank_14717 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_DamageRank_14717)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_DamageRank_14717 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DamageRank_14717)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_DamageRank_14717 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_DamageRank_14717 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_DamageRank_14717> parser() {
         return PARSER;
      }

      public Parser<S2CR_DamageRank_14717> getParserForType() {
         return PARSER;
      }

      public S2CR_DamageRank_14717 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_DamageRank_14717OrBuilder {
         private int bitField0_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_DamageRank_14717_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_DamageRank_14717_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_DamageRank_14717.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionOfferMsg.S2CR_DamageRank_14717.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_DamageRank_14717_descriptor;
         }

         public S2CR_DamageRank_14717 getDefaultInstanceForType() {
            return CrossUnionOfferMsg.S2CR_DamageRank_14717.getDefaultInstance();
         }

         public S2CR_DamageRank_14717 build() {
            S2CR_DamageRank_14717 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_DamageRank_14717 buildPartial() {
            S2CR_DamageRank_14717 result = new S2CR_DamageRank_14717(this);
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
            if (other instanceof S2CR_DamageRank_14717) {
               return this.mergeFrom((S2CR_DamageRank_14717)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_DamageRank_14717 other) {
            if (other == CrossUnionOfferMsg.S2CR_DamageRank_14717.getDefaultInstance()) {
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
            S2CR_DamageRank_14717 parsedMessage = null;

            try {
               parsedMessage = (S2CR_DamageRank_14717)CrossUnionOfferMsg.S2CR_DamageRank_14717.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_DamageRank_14717)e.getUnfinishedMessage();
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

   public static final class S2CR_MyRankPoint_14719 extends GeneratedMessageV3 implements S2CR_MyRankPoint_14719OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_MyRankPoint_14719 DEFAULT_INSTANCE = new S2CR_MyRankPoint_14719();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_MyRankPoint_14719> PARSER = new AbstractParser<S2CR_MyRankPoint_14719>() {
         public S2CR_MyRankPoint_14719 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_MyRankPoint_14719(input, extensionRegistry);
         }
      };

      private S2CR_MyRankPoint_14719(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_MyRankPoint_14719() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_MyRankPoint_14719();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_MyRankPoint_14719(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_MyRankPoint_14719_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_MyRankPoint_14719_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MyRankPoint_14719.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_MyRankPoint_14719)) {
            return super.equals(obj);
         } else {
            S2CR_MyRankPoint_14719 other = (S2CR_MyRankPoint_14719)obj;
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

      public static S2CR_MyRankPoint_14719 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_MyRankPoint_14719)PARSER.parseFrom(data);
      }

      public static S2CR_MyRankPoint_14719 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MyRankPoint_14719)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MyRankPoint_14719 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_MyRankPoint_14719)PARSER.parseFrom(data);
      }

      public static S2CR_MyRankPoint_14719 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MyRankPoint_14719)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MyRankPoint_14719 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_MyRankPoint_14719)PARSER.parseFrom(data);
      }

      public static S2CR_MyRankPoint_14719 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MyRankPoint_14719)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MyRankPoint_14719 parseFrom(InputStream input) throws IOException {
         return (S2CR_MyRankPoint_14719)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MyRankPoint_14719 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MyRankPoint_14719)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MyRankPoint_14719 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_MyRankPoint_14719)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_MyRankPoint_14719 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MyRankPoint_14719)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MyRankPoint_14719 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_MyRankPoint_14719)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MyRankPoint_14719 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MyRankPoint_14719)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_MyRankPoint_14719 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_MyRankPoint_14719 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_MyRankPoint_14719> parser() {
         return PARSER;
      }

      public Parser<S2CR_MyRankPoint_14719> getParserForType() {
         return PARSER;
      }

      public S2CR_MyRankPoint_14719 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_MyRankPoint_14719OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_MyRankPoint_14719_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_MyRankPoint_14719_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MyRankPoint_14719.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionOfferMsg.S2CR_MyRankPoint_14719.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_MyRankPoint_14719_descriptor;
         }

         public S2CR_MyRankPoint_14719 getDefaultInstanceForType() {
            return CrossUnionOfferMsg.S2CR_MyRankPoint_14719.getDefaultInstance();
         }

         public S2CR_MyRankPoint_14719 build() {
            S2CR_MyRankPoint_14719 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_MyRankPoint_14719 buildPartial() {
            S2CR_MyRankPoint_14719 result = new S2CR_MyRankPoint_14719(this);
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
            if (other instanceof S2CR_MyRankPoint_14719) {
               return this.mergeFrom((S2CR_MyRankPoint_14719)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_MyRankPoint_14719 other) {
            if (other == CrossUnionOfferMsg.S2CR_MyRankPoint_14719.getDefaultInstance()) {
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
            S2CR_MyRankPoint_14719 parsedMessage = null;

            try {
               parsedMessage = (S2CR_MyRankPoint_14719)CrossUnionOfferMsg.S2CR_MyRankPoint_14719.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_MyRankPoint_14719)e.getUnfinishedMessage();
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

   public static final class CR2S_Kill_14722 extends GeneratedMessageV3 implements CR2S_Kill_14722OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OFFERID_FIELD_NUMBER = 1;
      private int offerId_;
      public static final int SERVERID_FIELD_NUMBER = 2;
      private int serverId_;
      public static final int REWARDID_FIELD_NUMBER = 3;
      private int rewardId_;
      public static final int KILLPOINT_FIELD_NUMBER = 4;
      private int killPoint_;
      public static final int PLAYERNAME_FIELD_NUMBER = 5;
      private volatile Object playerName_;
      public static final int UNIONID_FIELD_NUMBER = 6;
      private int unionId_;
      public static final int OFFERHEROID_FIELD_NUMBER = 7;
      private int offerHeroId_;
      private byte memoizedIsInitialized;
      private static final CR2S_Kill_14722 DEFAULT_INSTANCE = new CR2S_Kill_14722();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_Kill_14722> PARSER = new AbstractParser<CR2S_Kill_14722>() {
         public CR2S_Kill_14722 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_Kill_14722(input, extensionRegistry);
         }
      };

      private CR2S_Kill_14722(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_Kill_14722() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_Kill_14722();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_Kill_14722(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.offerId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.serverId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.rewardId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.killPoint_ = input.readInt32();
                        break;
                     case 42:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 16;
                        this.playerName_ = bs;
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.unionId_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.offerHeroId_ = input.readInt32();
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
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_Kill_14722_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_Kill_14722_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Kill_14722.class, Builder.class);
      }

      public boolean hasOfferId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getOfferId() {
         return this.offerId_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasRewardId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getRewardId() {
         return this.rewardId_;
      }

      public boolean hasKillPoint() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getKillPoint() {
         return this.killPoint_;
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 16) != 0;
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

      public boolean hasUnionId() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
      }

      public boolean hasOfferHeroId() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getOfferHeroId() {
         return this.offerHeroId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasOfferId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRewardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasKillPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOfferHeroId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.offerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.serverId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.rewardId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.killPoint_);
         }

         if ((this.bitField0_ & 16) != 0) {
            GeneratedMessageV3.writeString(output, 5, this.playerName_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.unionId_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.offerHeroId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.offerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.serverId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.rewardId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.killPoint_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += GeneratedMessageV3.computeStringSize(5, this.playerName_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.unionId_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.offerHeroId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_Kill_14722)) {
            return super.equals(obj);
         } else {
            CR2S_Kill_14722 other = (CR2S_Kill_14722)obj;
            if (this.hasOfferId() != other.hasOfferId()) {
               return false;
            } else if (this.hasOfferId() && this.getOfferId() != other.getOfferId()) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasRewardId() != other.hasRewardId()) {
               return false;
            } else if (this.hasRewardId() && this.getRewardId() != other.getRewardId()) {
               return false;
            } else if (this.hasKillPoint() != other.hasKillPoint()) {
               return false;
            } else if (this.hasKillPoint() && this.getKillPoint() != other.getKillPoint()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
               return false;
            } else if (this.hasOfferHeroId() != other.hasOfferHeroId()) {
               return false;
            } else if (this.hasOfferHeroId() && this.getOfferHeroId() != other.getOfferHeroId()) {
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
            if (this.hasOfferId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOfferId();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasRewardId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRewardId();
            }

            if (this.hasKillPoint()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getKillPoint();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasUnionId()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getUnionId();
            }

            if (this.hasOfferHeroId()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getOfferHeroId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_Kill_14722 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_Kill_14722)PARSER.parseFrom(data);
      }

      public static CR2S_Kill_14722 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Kill_14722)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Kill_14722 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_Kill_14722)PARSER.parseFrom(data);
      }

      public static CR2S_Kill_14722 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Kill_14722)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Kill_14722 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_Kill_14722)PARSER.parseFrom(data);
      }

      public static CR2S_Kill_14722 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Kill_14722)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Kill_14722 parseFrom(InputStream input) throws IOException {
         return (CR2S_Kill_14722)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Kill_14722 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Kill_14722)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Kill_14722 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_Kill_14722)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_Kill_14722 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Kill_14722)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Kill_14722 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_Kill_14722)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Kill_14722 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Kill_14722)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_Kill_14722 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_Kill_14722 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_Kill_14722> parser() {
         return PARSER;
      }

      public Parser<CR2S_Kill_14722> getParserForType() {
         return PARSER;
      }

      public CR2S_Kill_14722 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_Kill_14722OrBuilder {
         private int bitField0_;
         private int offerId_;
         private int serverId_;
         private int rewardId_;
         private int killPoint_;
         private Object playerName_;
         private int unionId_;
         private int offerHeroId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_Kill_14722_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_Kill_14722_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Kill_14722.class, Builder.class);
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
            if (CrossUnionOfferMsg.CR2S_Kill_14722.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.offerId_ = 0;
            this.bitField0_ &= -2;
            this.serverId_ = 0;
            this.bitField0_ &= -3;
            this.rewardId_ = 0;
            this.bitField0_ &= -5;
            this.killPoint_ = 0;
            this.bitField0_ &= -9;
            this.playerName_ = "";
            this.bitField0_ &= -17;
            this.unionId_ = 0;
            this.bitField0_ &= -33;
            this.offerHeroId_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_Kill_14722_descriptor;
         }

         public CR2S_Kill_14722 getDefaultInstanceForType() {
            return CrossUnionOfferMsg.CR2S_Kill_14722.getDefaultInstance();
         }

         public CR2S_Kill_14722 build() {
            CR2S_Kill_14722 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_Kill_14722 buildPartial() {
            CR2S_Kill_14722 result = new CR2S_Kill_14722(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.offerId_ = this.offerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.rewardId_ = this.rewardId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.killPoint_ = this.killPoint_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               to_bitField0_ |= 16;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 32) != 0) {
               result.unionId_ = this.unionId_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.offerHeroId_ = this.offerHeroId_;
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
            if (other instanceof CR2S_Kill_14722) {
               return this.mergeFrom((CR2S_Kill_14722)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_Kill_14722 other) {
            if (other == CrossUnionOfferMsg.CR2S_Kill_14722.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOfferId()) {
                  this.setOfferId(other.getOfferId());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasRewardId()) {
                  this.setRewardId(other.getRewardId());
               }

               if (other.hasKillPoint()) {
                  this.setKillPoint(other.getKillPoint());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 16;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               if (other.hasOfferHeroId()) {
                  this.setOfferHeroId(other.getOfferHeroId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasOfferId()) {
               return false;
            } else if (!this.hasServerId()) {
               return false;
            } else if (!this.hasRewardId()) {
               return false;
            } else if (!this.hasKillPoint()) {
               return false;
            } else {
               return this.hasOfferHeroId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_Kill_14722 parsedMessage = null;

            try {
               parsedMessage = (CR2S_Kill_14722)CrossUnionOfferMsg.CR2S_Kill_14722.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_Kill_14722)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOfferId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getOfferId() {
            return this.offerId_;
         }

         public Builder setOfferId(int value) {
            this.bitField0_ |= 1;
            this.offerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOfferId() {
            this.bitField0_ &= -2;
            this.offerId_ = 0;
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

         public boolean hasRewardId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getRewardId() {
            return this.rewardId_;
         }

         public Builder setRewardId(int value) {
            this.bitField0_ |= 4;
            this.rewardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardId() {
            this.bitField0_ &= -5;
            this.rewardId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasKillPoint() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getKillPoint() {
            return this.killPoint_;
         }

         public Builder setKillPoint(int value) {
            this.bitField0_ |= 8;
            this.killPoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearKillPoint() {
            this.bitField0_ &= -9;
            this.killPoint_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 16) != 0;
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
               this.bitField0_ |= 16;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -17;
            this.playerName_ = CrossUnionOfferMsg.CR2S_Kill_14722.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasUnionId() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getUnionId() {
            return this.unionId_;
         }

         public Builder setUnionId(int value) {
            this.bitField0_ |= 32;
            this.unionId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionId() {
            this.bitField0_ &= -33;
            this.unionId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOfferHeroId() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getOfferHeroId() {
            return this.offerHeroId_;
         }

         public Builder setOfferHeroId(int value) {
            this.bitField0_ |= 64;
            this.offerHeroId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOfferHeroId() {
            this.bitField0_ &= -65;
            this.offerHeroId_ = 0;
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

   public static final class CR2S_RamageRand_14724 extends GeneratedMessageV3 implements CR2S_RamageRand_14724OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDGROUP_FIELD_NUMBER = 1;
      private int rewardGroup_;
      public static final int RANKINFO_FIELD_NUMBER = 2;
      private List<RankInfo> rankInfo_;
      public static final int OFFERHEROID_FIELD_NUMBER = 3;
      private int offerHeroId_;
      private byte memoizedIsInitialized;
      private static final CR2S_RamageRand_14724 DEFAULT_INSTANCE = new CR2S_RamageRand_14724();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_RamageRand_14724> PARSER = new AbstractParser<CR2S_RamageRand_14724>() {
         public CR2S_RamageRand_14724 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_RamageRand_14724(input, extensionRegistry);
         }
      };

      private CR2S_RamageRand_14724(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_RamageRand_14724() {
         this.memoizedIsInitialized = -1;
         this.rankInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_RamageRand_14724();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_RamageRand_14724(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rewardGroup_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.rankInfo_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.rankInfo_.add(input.readMessage(CrossUnionOfferMsg.RankInfo.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.offerHeroId_ = input.readInt32();
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
                  this.rankInfo_ = Collections.unmodifiableList(this.rankInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_RamageRand_14724_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_RamageRand_14724_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_RamageRand_14724.class, Builder.class);
      }

      public boolean hasRewardGroup() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRewardGroup() {
         return this.rewardGroup_;
      }

      public List<RankInfo> getRankInfoList() {
         return this.rankInfo_;
      }

      public List<? extends RankInfoOrBuilder> getRankInfoOrBuilderList() {
         return this.rankInfo_;
      }

      public int getRankInfoCount() {
         return this.rankInfo_.size();
      }

      public RankInfo getRankInfo(int index) {
         return (RankInfo)this.rankInfo_.get(index);
      }

      public RankInfoOrBuilder getRankInfoOrBuilder(int index) {
         return (RankInfoOrBuilder)this.rankInfo_.get(index);
      }

      public boolean hasOfferHeroId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getOfferHeroId() {
         return this.offerHeroId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRewardGroup()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOfferHeroId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRankInfoCount(); ++i) {
               if (!this.getRankInfo(i).isInitialized()) {
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
            output.writeInt32(1, this.rewardGroup_);
         }

         for(int i = 0; i < this.rankInfo_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.rankInfo_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.offerHeroId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.rewardGroup_);
            }

            for(int i = 0; i < this.rankInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.rankInfo_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.offerHeroId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_RamageRand_14724)) {
            return super.equals(obj);
         } else {
            CR2S_RamageRand_14724 other = (CR2S_RamageRand_14724)obj;
            if (this.hasRewardGroup() != other.hasRewardGroup()) {
               return false;
            } else if (this.hasRewardGroup() && this.getRewardGroup() != other.getRewardGroup()) {
               return false;
            } else if (!this.getRankInfoList().equals(other.getRankInfoList())) {
               return false;
            } else if (this.hasOfferHeroId() != other.hasOfferHeroId()) {
               return false;
            } else if (this.hasOfferHeroId() && this.getOfferHeroId() != other.getOfferHeroId()) {
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
            if (this.hasRewardGroup()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRewardGroup();
            }

            if (this.getRankInfoCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRankInfoList().hashCode();
            }

            if (this.hasOfferHeroId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getOfferHeroId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_RamageRand_14724 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_RamageRand_14724)PARSER.parseFrom(data);
      }

      public static CR2S_RamageRand_14724 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RamageRand_14724)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RamageRand_14724 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_RamageRand_14724)PARSER.parseFrom(data);
      }

      public static CR2S_RamageRand_14724 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RamageRand_14724)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RamageRand_14724 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_RamageRand_14724)PARSER.parseFrom(data);
      }

      public static CR2S_RamageRand_14724 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RamageRand_14724)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RamageRand_14724 parseFrom(InputStream input) throws IOException {
         return (CR2S_RamageRand_14724)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_RamageRand_14724 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RamageRand_14724)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_RamageRand_14724 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_RamageRand_14724)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_RamageRand_14724 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RamageRand_14724)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_RamageRand_14724 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_RamageRand_14724)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_RamageRand_14724 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RamageRand_14724)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_RamageRand_14724 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_RamageRand_14724 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_RamageRand_14724> parser() {
         return PARSER;
      }

      public Parser<CR2S_RamageRand_14724> getParserForType() {
         return PARSER;
      }

      public CR2S_RamageRand_14724 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_RamageRand_14724OrBuilder {
         private int bitField0_;
         private int rewardGroup_;
         private List<RankInfo> rankInfo_;
         private RepeatedFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> rankInfoBuilder_;
         private int offerHeroId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_RamageRand_14724_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_RamageRand_14724_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_RamageRand_14724.class, Builder.class);
         }

         private Builder() {
            this.rankInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rankInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionOfferMsg.CR2S_RamageRand_14724.alwaysUseFieldBuilders) {
               this.getRankInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardGroup_ = 0;
            this.bitField0_ &= -2;
            if (this.rankInfoBuilder_ == null) {
               this.rankInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.rankInfoBuilder_.clear();
            }

            this.offerHeroId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_RamageRand_14724_descriptor;
         }

         public CR2S_RamageRand_14724 getDefaultInstanceForType() {
            return CrossUnionOfferMsg.CR2S_RamageRand_14724.getDefaultInstance();
         }

         public CR2S_RamageRand_14724 build() {
            CR2S_RamageRand_14724 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_RamageRand_14724 buildPartial() {
            CR2S_RamageRand_14724 result = new CR2S_RamageRand_14724(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rewardGroup_ = this.rewardGroup_;
               to_bitField0_ |= 1;
            }

            if (this.rankInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.rankInfo_ = Collections.unmodifiableList(this.rankInfo_);
                  this.bitField0_ &= -3;
               }

               result.rankInfo_ = this.rankInfo_;
            } else {
               result.rankInfo_ = this.rankInfoBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.offerHeroId_ = this.offerHeroId_;
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
            if (other instanceof CR2S_RamageRand_14724) {
               return this.mergeFrom((CR2S_RamageRand_14724)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_RamageRand_14724 other) {
            if (other == CrossUnionOfferMsg.CR2S_RamageRand_14724.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRewardGroup()) {
                  this.setRewardGroup(other.getRewardGroup());
               }

               if (this.rankInfoBuilder_ == null) {
                  if (!other.rankInfo_.isEmpty()) {
                     if (this.rankInfo_.isEmpty()) {
                        this.rankInfo_ = other.rankInfo_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureRankInfoIsMutable();
                        this.rankInfo_.addAll(other.rankInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.rankInfo_.isEmpty()) {
                  if (this.rankInfoBuilder_.isEmpty()) {
                     this.rankInfoBuilder_.dispose();
                     this.rankInfoBuilder_ = null;
                     this.rankInfo_ = other.rankInfo_;
                     this.bitField0_ &= -3;
                     this.rankInfoBuilder_ = CrossUnionOfferMsg.CR2S_RamageRand_14724.alwaysUseFieldBuilders ? this.getRankInfoFieldBuilder() : null;
                  } else {
                     this.rankInfoBuilder_.addAllMessages(other.rankInfo_);
                  }
               }

               if (other.hasOfferHeroId()) {
                  this.setOfferHeroId(other.getOfferHeroId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRewardGroup()) {
               return false;
            } else if (!this.hasOfferHeroId()) {
               return false;
            } else {
               for(int i = 0; i < this.getRankInfoCount(); ++i) {
                  if (!this.getRankInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_RamageRand_14724 parsedMessage = null;

            try {
               parsedMessage = (CR2S_RamageRand_14724)CrossUnionOfferMsg.CR2S_RamageRand_14724.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_RamageRand_14724)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRewardGroup() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRewardGroup() {
            return this.rewardGroup_;
         }

         public Builder setRewardGroup(int value) {
            this.bitField0_ |= 1;
            this.rewardGroup_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardGroup() {
            this.bitField0_ &= -2;
            this.rewardGroup_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRankInfoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.rankInfo_ = new ArrayList(this.rankInfo_);
               this.bitField0_ |= 2;
            }

         }

         public List<RankInfo> getRankInfoList() {
            return this.rankInfoBuilder_ == null ? Collections.unmodifiableList(this.rankInfo_) : this.rankInfoBuilder_.getMessageList();
         }

         public int getRankInfoCount() {
            return this.rankInfoBuilder_ == null ? this.rankInfo_.size() : this.rankInfoBuilder_.getCount();
         }

         public RankInfo getRankInfo(int index) {
            return this.rankInfoBuilder_ == null ? (RankInfo)this.rankInfo_.get(index) : (RankInfo)this.rankInfoBuilder_.getMessage(index);
         }

         public Builder setRankInfo(int index, RankInfo value) {
            if (this.rankInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankInfoIsMutable();
               this.rankInfo_.set(index, value);
               this.onChanged();
            } else {
               this.rankInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRankInfo(int index, RankInfo.Builder builderForValue) {
            if (this.rankInfoBuilder_ == null) {
               this.ensureRankInfoIsMutable();
               this.rankInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRankInfo(RankInfo value) {
            if (this.rankInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankInfoIsMutable();
               this.rankInfo_.add(value);
               this.onChanged();
            } else {
               this.rankInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRankInfo(int index, RankInfo value) {
            if (this.rankInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankInfoIsMutable();
               this.rankInfo_.add(index, value);
               this.onChanged();
            } else {
               this.rankInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRankInfo(RankInfo.Builder builderForValue) {
            if (this.rankInfoBuilder_ == null) {
               this.ensureRankInfoIsMutable();
               this.rankInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rankInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRankInfo(int index, RankInfo.Builder builderForValue) {
            if (this.rankInfoBuilder_ == null) {
               this.ensureRankInfoIsMutable();
               this.rankInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRankInfo(Iterable<? extends RankInfo> values) {
            if (this.rankInfoBuilder_ == null) {
               this.ensureRankInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rankInfo_);
               this.onChanged();
            } else {
               this.rankInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRankInfo() {
            if (this.rankInfoBuilder_ == null) {
               this.rankInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.rankInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeRankInfo(int index) {
            if (this.rankInfoBuilder_ == null) {
               this.ensureRankInfoIsMutable();
               this.rankInfo_.remove(index);
               this.onChanged();
            } else {
               this.rankInfoBuilder_.remove(index);
            }

            return this;
         }

         public RankInfo.Builder getRankInfoBuilder(int index) {
            return (RankInfo.Builder)this.getRankInfoFieldBuilder().getBuilder(index);
         }

         public RankInfoOrBuilder getRankInfoOrBuilder(int index) {
            return this.rankInfoBuilder_ == null ? (RankInfoOrBuilder)this.rankInfo_.get(index) : (RankInfoOrBuilder)this.rankInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankInfoOrBuilder> getRankInfoOrBuilderList() {
            return this.rankInfoBuilder_ != null ? this.rankInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rankInfo_);
         }

         public RankInfo.Builder addRankInfoBuilder() {
            return (RankInfo.Builder)this.getRankInfoFieldBuilder().addBuilder(CrossUnionOfferMsg.RankInfo.getDefaultInstance());
         }

         public RankInfo.Builder addRankInfoBuilder(int index) {
            return (RankInfo.Builder)this.getRankInfoFieldBuilder().addBuilder(index, CrossUnionOfferMsg.RankInfo.getDefaultInstance());
         }

         public List<RankInfo.Builder> getRankInfoBuilderList() {
            return this.getRankInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> getRankInfoFieldBuilder() {
            if (this.rankInfoBuilder_ == null) {
               this.rankInfoBuilder_ = new RepeatedFieldBuilderV3(this.rankInfo_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.rankInfo_ = null;
            }

            return this.rankInfoBuilder_;
         }

         public boolean hasOfferHeroId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getOfferHeroId() {
            return this.offerHeroId_;
         }

         public Builder setOfferHeroId(int value) {
            this.bitField0_ |= 4;
            this.offerHeroId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOfferHeroId() {
            this.bitField0_ &= -5;
            this.offerHeroId_ = 0;
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

   public static final class CR2S_UnionPointRand_14726 extends GeneratedMessageV3 implements CR2S_UnionPointRand_14726OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RANKINFO_FIELD_NUMBER = 1;
      private List<RankInfo> rankInfo_;
      private byte memoizedIsInitialized;
      private static final CR2S_UnionPointRand_14726 DEFAULT_INSTANCE = new CR2S_UnionPointRand_14726();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UnionPointRand_14726> PARSER = new AbstractParser<CR2S_UnionPointRand_14726>() {
         public CR2S_UnionPointRand_14726 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UnionPointRand_14726(input, extensionRegistry);
         }
      };

      private CR2S_UnionPointRand_14726(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UnionPointRand_14726() {
         this.memoizedIsInitialized = -1;
         this.rankInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UnionPointRand_14726();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UnionPointRand_14726(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.rankInfo_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.rankInfo_.add(input.readMessage(CrossUnionOfferMsg.RankInfo.PARSER, extensionRegistry));
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
                  this.rankInfo_ = Collections.unmodifiableList(this.rankInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UnionPointRand_14726_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UnionPointRand_14726_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnionPointRand_14726.class, Builder.class);
      }

      public List<RankInfo> getRankInfoList() {
         return this.rankInfo_;
      }

      public List<? extends RankInfoOrBuilder> getRankInfoOrBuilderList() {
         return this.rankInfo_;
      }

      public int getRankInfoCount() {
         return this.rankInfo_.size();
      }

      public RankInfo getRankInfo(int index) {
         return (RankInfo)this.rankInfo_.get(index);
      }

      public RankInfoOrBuilder getRankInfoOrBuilder(int index) {
         return (RankInfoOrBuilder)this.rankInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getRankInfoCount(); ++i) {
               if (!this.getRankInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.rankInfo_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.rankInfo_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.rankInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.rankInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_UnionPointRand_14726)) {
            return super.equals(obj);
         } else {
            CR2S_UnionPointRand_14726 other = (CR2S_UnionPointRand_14726)obj;
            if (!this.getRankInfoList().equals(other.getRankInfoList())) {
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
            if (this.getRankInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRankInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_UnionPointRand_14726 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UnionPointRand_14726)PARSER.parseFrom(data);
      }

      public static CR2S_UnionPointRand_14726 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionPointRand_14726)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionPointRand_14726 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UnionPointRand_14726)PARSER.parseFrom(data);
      }

      public static CR2S_UnionPointRand_14726 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionPointRand_14726)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionPointRand_14726 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UnionPointRand_14726)PARSER.parseFrom(data);
      }

      public static CR2S_UnionPointRand_14726 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnionPointRand_14726)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnionPointRand_14726 parseFrom(InputStream input) throws IOException {
         return (CR2S_UnionPointRand_14726)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnionPointRand_14726 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionPointRand_14726)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnionPointRand_14726 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UnionPointRand_14726)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UnionPointRand_14726 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionPointRand_14726)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnionPointRand_14726 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UnionPointRand_14726)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnionPointRand_14726 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnionPointRand_14726)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UnionPointRand_14726 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UnionPointRand_14726 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UnionPointRand_14726> parser() {
         return PARSER;
      }

      public Parser<CR2S_UnionPointRand_14726> getParserForType() {
         return PARSER;
      }

      public CR2S_UnionPointRand_14726 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UnionPointRand_14726OrBuilder {
         private int bitField0_;
         private List<RankInfo> rankInfo_;
         private RepeatedFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> rankInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UnionPointRand_14726_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UnionPointRand_14726_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnionPointRand_14726.class, Builder.class);
         }

         private Builder() {
            this.rankInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rankInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionOfferMsg.CR2S_UnionPointRand_14726.alwaysUseFieldBuilders) {
               this.getRankInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.rankInfoBuilder_ == null) {
               this.rankInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.rankInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UnionPointRand_14726_descriptor;
         }

         public CR2S_UnionPointRand_14726 getDefaultInstanceForType() {
            return CrossUnionOfferMsg.CR2S_UnionPointRand_14726.getDefaultInstance();
         }

         public CR2S_UnionPointRand_14726 build() {
            CR2S_UnionPointRand_14726 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UnionPointRand_14726 buildPartial() {
            CR2S_UnionPointRand_14726 result = new CR2S_UnionPointRand_14726(this);
            int from_bitField0_ = this.bitField0_;
            if (this.rankInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.rankInfo_ = Collections.unmodifiableList(this.rankInfo_);
                  this.bitField0_ &= -2;
               }

               result.rankInfo_ = this.rankInfo_;
            } else {
               result.rankInfo_ = this.rankInfoBuilder_.build();
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
            if (other instanceof CR2S_UnionPointRand_14726) {
               return this.mergeFrom((CR2S_UnionPointRand_14726)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UnionPointRand_14726 other) {
            if (other == CrossUnionOfferMsg.CR2S_UnionPointRand_14726.getDefaultInstance()) {
               return this;
            } else {
               if (this.rankInfoBuilder_ == null) {
                  if (!other.rankInfo_.isEmpty()) {
                     if (this.rankInfo_.isEmpty()) {
                        this.rankInfo_ = other.rankInfo_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureRankInfoIsMutable();
                        this.rankInfo_.addAll(other.rankInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.rankInfo_.isEmpty()) {
                  if (this.rankInfoBuilder_.isEmpty()) {
                     this.rankInfoBuilder_.dispose();
                     this.rankInfoBuilder_ = null;
                     this.rankInfo_ = other.rankInfo_;
                     this.bitField0_ &= -2;
                     this.rankInfoBuilder_ = CrossUnionOfferMsg.CR2S_UnionPointRand_14726.alwaysUseFieldBuilders ? this.getRankInfoFieldBuilder() : null;
                  } else {
                     this.rankInfoBuilder_.addAllMessages(other.rankInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getRankInfoCount(); ++i) {
               if (!this.getRankInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_UnionPointRand_14726 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UnionPointRand_14726)CrossUnionOfferMsg.CR2S_UnionPointRand_14726.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UnionPointRand_14726)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRankInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.rankInfo_ = new ArrayList(this.rankInfo_);
               this.bitField0_ |= 1;
            }

         }

         public List<RankInfo> getRankInfoList() {
            return this.rankInfoBuilder_ == null ? Collections.unmodifiableList(this.rankInfo_) : this.rankInfoBuilder_.getMessageList();
         }

         public int getRankInfoCount() {
            return this.rankInfoBuilder_ == null ? this.rankInfo_.size() : this.rankInfoBuilder_.getCount();
         }

         public RankInfo getRankInfo(int index) {
            return this.rankInfoBuilder_ == null ? (RankInfo)this.rankInfo_.get(index) : (RankInfo)this.rankInfoBuilder_.getMessage(index);
         }

         public Builder setRankInfo(int index, RankInfo value) {
            if (this.rankInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankInfoIsMutable();
               this.rankInfo_.set(index, value);
               this.onChanged();
            } else {
               this.rankInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRankInfo(int index, RankInfo.Builder builderForValue) {
            if (this.rankInfoBuilder_ == null) {
               this.ensureRankInfoIsMutable();
               this.rankInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRankInfo(RankInfo value) {
            if (this.rankInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankInfoIsMutable();
               this.rankInfo_.add(value);
               this.onChanged();
            } else {
               this.rankInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRankInfo(int index, RankInfo value) {
            if (this.rankInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankInfoIsMutable();
               this.rankInfo_.add(index, value);
               this.onChanged();
            } else {
               this.rankInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRankInfo(RankInfo.Builder builderForValue) {
            if (this.rankInfoBuilder_ == null) {
               this.ensureRankInfoIsMutable();
               this.rankInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rankInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRankInfo(int index, RankInfo.Builder builderForValue) {
            if (this.rankInfoBuilder_ == null) {
               this.ensureRankInfoIsMutable();
               this.rankInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRankInfo(Iterable<? extends RankInfo> values) {
            if (this.rankInfoBuilder_ == null) {
               this.ensureRankInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rankInfo_);
               this.onChanged();
            } else {
               this.rankInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRankInfo() {
            if (this.rankInfoBuilder_ == null) {
               this.rankInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.rankInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeRankInfo(int index) {
            if (this.rankInfoBuilder_ == null) {
               this.ensureRankInfoIsMutable();
               this.rankInfo_.remove(index);
               this.onChanged();
            } else {
               this.rankInfoBuilder_.remove(index);
            }

            return this;
         }

         public RankInfo.Builder getRankInfoBuilder(int index) {
            return (RankInfo.Builder)this.getRankInfoFieldBuilder().getBuilder(index);
         }

         public RankInfoOrBuilder getRankInfoOrBuilder(int index) {
            return this.rankInfoBuilder_ == null ? (RankInfoOrBuilder)this.rankInfo_.get(index) : (RankInfoOrBuilder)this.rankInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankInfoOrBuilder> getRankInfoOrBuilderList() {
            return this.rankInfoBuilder_ != null ? this.rankInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rankInfo_);
         }

         public RankInfo.Builder addRankInfoBuilder() {
            return (RankInfo.Builder)this.getRankInfoFieldBuilder().addBuilder(CrossUnionOfferMsg.RankInfo.getDefaultInstance());
         }

         public RankInfo.Builder addRankInfoBuilder(int index) {
            return (RankInfo.Builder)this.getRankInfoFieldBuilder().addBuilder(index, CrossUnionOfferMsg.RankInfo.getDefaultInstance());
         }

         public List<RankInfo.Builder> getRankInfoBuilderList() {
            return this.getRankInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> getRankInfoFieldBuilder() {
            if (this.rankInfoBuilder_ == null) {
               this.rankInfoBuilder_ = new RepeatedFieldBuilderV3(this.rankInfo_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.rankInfo_ = null;
            }

            return this.rankInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_UpdateUnionPoint_14728 extends GeneratedMessageV3 implements CR2S_UpdateUnionPoint_14728OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int UNIONPOINT_FIELD_NUMBER = 1;
      private List<CommonMsg.MapDataII> unionPoint_;
      private byte memoizedIsInitialized;
      private static final CR2S_UpdateUnionPoint_14728 DEFAULT_INSTANCE = new CR2S_UpdateUnionPoint_14728();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UpdateUnionPoint_14728> PARSER = new AbstractParser<CR2S_UpdateUnionPoint_14728>() {
         public CR2S_UpdateUnionPoint_14728 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UpdateUnionPoint_14728(input, extensionRegistry);
         }
      };

      private CR2S_UpdateUnionPoint_14728(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UpdateUnionPoint_14728() {
         this.memoizedIsInitialized = -1;
         this.unionPoint_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UpdateUnionPoint_14728();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UpdateUnionPoint_14728(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.unionPoint_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.unionPoint_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
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
                  this.unionPoint_ = Collections.unmodifiableList(this.unionPoint_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UpdateUnionPoint_14728_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UpdateUnionPoint_14728_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdateUnionPoint_14728.class, Builder.class);
      }

      public List<CommonMsg.MapDataII> getUnionPointList() {
         return this.unionPoint_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getUnionPointOrBuilderList() {
         return this.unionPoint_;
      }

      public int getUnionPointCount() {
         return this.unionPoint_.size();
      }

      public CommonMsg.MapDataII getUnionPoint(int index) {
         return (CommonMsg.MapDataII)this.unionPoint_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getUnionPointOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.unionPoint_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getUnionPointCount(); ++i) {
               if (!this.getUnionPoint(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.unionPoint_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.unionPoint_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.unionPoint_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.unionPoint_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_UpdateUnionPoint_14728)) {
            return super.equals(obj);
         } else {
            CR2S_UpdateUnionPoint_14728 other = (CR2S_UpdateUnionPoint_14728)obj;
            if (!this.getUnionPointList().equals(other.getUnionPointList())) {
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
            if (this.getUnionPointCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUnionPointList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_UpdateUnionPoint_14728 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateUnionPoint_14728)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateUnionPoint_14728 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateUnionPoint_14728)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateUnionPoint_14728 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateUnionPoint_14728)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateUnionPoint_14728 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateUnionPoint_14728)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateUnionPoint_14728 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateUnionPoint_14728)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateUnionPoint_14728 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateUnionPoint_14728)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateUnionPoint_14728 parseFrom(InputStream input) throws IOException {
         return (CR2S_UpdateUnionPoint_14728)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdateUnionPoint_14728 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateUnionPoint_14728)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdateUnionPoint_14728 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UpdateUnionPoint_14728)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UpdateUnionPoint_14728 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateUnionPoint_14728)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdateUnionPoint_14728 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UpdateUnionPoint_14728)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdateUnionPoint_14728 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateUnionPoint_14728)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UpdateUnionPoint_14728 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UpdateUnionPoint_14728 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UpdateUnionPoint_14728> parser() {
         return PARSER;
      }

      public Parser<CR2S_UpdateUnionPoint_14728> getParserForType() {
         return PARSER;
      }

      public CR2S_UpdateUnionPoint_14728 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UpdateUnionPoint_14728OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataII> unionPoint_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> unionPointBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UpdateUnionPoint_14728_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UpdateUnionPoint_14728_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdateUnionPoint_14728.class, Builder.class);
         }

         private Builder() {
            this.unionPoint_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.unionPoint_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionOfferMsg.CR2S_UpdateUnionPoint_14728.alwaysUseFieldBuilders) {
               this.getUnionPointFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.unionPointBuilder_ == null) {
               this.unionPoint_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.unionPointBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_UpdateUnionPoint_14728_descriptor;
         }

         public CR2S_UpdateUnionPoint_14728 getDefaultInstanceForType() {
            return CrossUnionOfferMsg.CR2S_UpdateUnionPoint_14728.getDefaultInstance();
         }

         public CR2S_UpdateUnionPoint_14728 build() {
            CR2S_UpdateUnionPoint_14728 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UpdateUnionPoint_14728 buildPartial() {
            CR2S_UpdateUnionPoint_14728 result = new CR2S_UpdateUnionPoint_14728(this);
            int from_bitField0_ = this.bitField0_;
            if (this.unionPointBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.unionPoint_ = Collections.unmodifiableList(this.unionPoint_);
                  this.bitField0_ &= -2;
               }

               result.unionPoint_ = this.unionPoint_;
            } else {
               result.unionPoint_ = this.unionPointBuilder_.build();
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
            if (other instanceof CR2S_UpdateUnionPoint_14728) {
               return this.mergeFrom((CR2S_UpdateUnionPoint_14728)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UpdateUnionPoint_14728 other) {
            if (other == CrossUnionOfferMsg.CR2S_UpdateUnionPoint_14728.getDefaultInstance()) {
               return this;
            } else {
               if (this.unionPointBuilder_ == null) {
                  if (!other.unionPoint_.isEmpty()) {
                     if (this.unionPoint_.isEmpty()) {
                        this.unionPoint_ = other.unionPoint_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureUnionPointIsMutable();
                        this.unionPoint_.addAll(other.unionPoint_);
                     }

                     this.onChanged();
                  }
               } else if (!other.unionPoint_.isEmpty()) {
                  if (this.unionPointBuilder_.isEmpty()) {
                     this.unionPointBuilder_.dispose();
                     this.unionPointBuilder_ = null;
                     this.unionPoint_ = other.unionPoint_;
                     this.bitField0_ &= -2;
                     this.unionPointBuilder_ = CrossUnionOfferMsg.CR2S_UpdateUnionPoint_14728.alwaysUseFieldBuilders ? this.getUnionPointFieldBuilder() : null;
                  } else {
                     this.unionPointBuilder_.addAllMessages(other.unionPoint_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getUnionPointCount(); ++i) {
               if (!this.getUnionPoint(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_UpdateUnionPoint_14728 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UpdateUnionPoint_14728)CrossUnionOfferMsg.CR2S_UpdateUnionPoint_14728.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UpdateUnionPoint_14728)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureUnionPointIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.unionPoint_ = new ArrayList(this.unionPoint_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MapDataII> getUnionPointList() {
            return this.unionPointBuilder_ == null ? Collections.unmodifiableList(this.unionPoint_) : this.unionPointBuilder_.getMessageList();
         }

         public int getUnionPointCount() {
            return this.unionPointBuilder_ == null ? this.unionPoint_.size() : this.unionPointBuilder_.getCount();
         }

         public CommonMsg.MapDataII getUnionPoint(int index) {
            return this.unionPointBuilder_ == null ? (CommonMsg.MapDataII)this.unionPoint_.get(index) : (CommonMsg.MapDataII)this.unionPointBuilder_.getMessage(index);
         }

         public Builder setUnionPoint(int index, CommonMsg.MapDataII value) {
            if (this.unionPointBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureUnionPointIsMutable();
               this.unionPoint_.set(index, value);
               this.onChanged();
            } else {
               this.unionPointBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setUnionPoint(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.unionPointBuilder_ == null) {
               this.ensureUnionPointIsMutable();
               this.unionPoint_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.unionPointBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addUnionPoint(CommonMsg.MapDataII value) {
            if (this.unionPointBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureUnionPointIsMutable();
               this.unionPoint_.add(value);
               this.onChanged();
            } else {
               this.unionPointBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addUnionPoint(int index, CommonMsg.MapDataII value) {
            if (this.unionPointBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureUnionPointIsMutable();
               this.unionPoint_.add(index, value);
               this.onChanged();
            } else {
               this.unionPointBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addUnionPoint(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.unionPointBuilder_ == null) {
               this.ensureUnionPointIsMutable();
               this.unionPoint_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.unionPointBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addUnionPoint(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.unionPointBuilder_ == null) {
               this.ensureUnionPointIsMutable();
               this.unionPoint_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.unionPointBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllUnionPoint(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.unionPointBuilder_ == null) {
               this.ensureUnionPointIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.unionPoint_);
               this.onChanged();
            } else {
               this.unionPointBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearUnionPoint() {
            if (this.unionPointBuilder_ == null) {
               this.unionPoint_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.unionPointBuilder_.clear();
            }

            return this;
         }

         public Builder removeUnionPoint(int index) {
            if (this.unionPointBuilder_ == null) {
               this.ensureUnionPointIsMutable();
               this.unionPoint_.remove(index);
               this.onChanged();
            } else {
               this.unionPointBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getUnionPointBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getUnionPointFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getUnionPointOrBuilder(int index) {
            return this.unionPointBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.unionPoint_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.unionPointBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getUnionPointOrBuilderList() {
            return this.unionPointBuilder_ != null ? this.unionPointBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.unionPoint_);
         }

         public CommonMsg.MapDataII.Builder addUnionPointBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getUnionPointFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addUnionPointBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getUnionPointFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getUnionPointBuilderList() {
            return this.getUnionPointFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getUnionPointFieldBuilder() {
            if (this.unionPointBuilder_ == null) {
               this.unionPointBuilder_ = new RepeatedFieldBuilderV3(this.unionPoint_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.unionPoint_ = null;
            }

            return this.unionPointBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_SystemPublish_14729 extends GeneratedMessageV3 implements S2CR_SystemPublish_14729OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      public static final int UNIONCOPYID_FIELD_NUMBER = 2;
      private int unionCopyid_;
      private byte memoizedIsInitialized;
      private static final S2CR_SystemPublish_14729 DEFAULT_INSTANCE = new S2CR_SystemPublish_14729();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_SystemPublish_14729> PARSER = new AbstractParser<S2CR_SystemPublish_14729>() {
         public S2CR_SystemPublish_14729 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_SystemPublish_14729(input, extensionRegistry);
         }
      };

      private S2CR_SystemPublish_14729(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_SystemPublish_14729() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_SystemPublish_14729();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_SystemPublish_14729(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.num_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.unionCopyid_ = input.readInt32();
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
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_SystemPublish_14729_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_SystemPublish_14729_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_SystemPublish_14729.class, Builder.class);
      }

      public boolean hasNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public boolean hasUnionCopyid() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getUnionCopyid() {
         return this.unionCopyid_;
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
            output.writeInt32(1, this.num_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.unionCopyid_);
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
               size += CodedOutputStream.computeInt32Size(1, this.num_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.unionCopyid_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_SystemPublish_14729)) {
            return super.equals(obj);
         } else {
            S2CR_SystemPublish_14729 other = (S2CR_SystemPublish_14729)obj;
            if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
               return false;
            } else if (this.hasUnionCopyid() != other.hasUnionCopyid()) {
               return false;
            } else if (this.hasUnionCopyid() && this.getUnionCopyid() != other.getUnionCopyid()) {
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
            if (this.hasNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getNum();
            }

            if (this.hasUnionCopyid()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getUnionCopyid();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_SystemPublish_14729 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_SystemPublish_14729)PARSER.parseFrom(data);
      }

      public static S2CR_SystemPublish_14729 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SystemPublish_14729)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SystemPublish_14729 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_SystemPublish_14729)PARSER.parseFrom(data);
      }

      public static S2CR_SystemPublish_14729 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SystemPublish_14729)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SystemPublish_14729 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_SystemPublish_14729)PARSER.parseFrom(data);
      }

      public static S2CR_SystemPublish_14729 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SystemPublish_14729)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SystemPublish_14729 parseFrom(InputStream input) throws IOException {
         return (S2CR_SystemPublish_14729)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_SystemPublish_14729 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SystemPublish_14729)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_SystemPublish_14729 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_SystemPublish_14729)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_SystemPublish_14729 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SystemPublish_14729)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_SystemPublish_14729 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_SystemPublish_14729)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_SystemPublish_14729 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SystemPublish_14729)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_SystemPublish_14729 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_SystemPublish_14729 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_SystemPublish_14729> parser() {
         return PARSER;
      }

      public Parser<S2CR_SystemPublish_14729> getParserForType() {
         return PARSER;
      }

      public S2CR_SystemPublish_14729 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_SystemPublish_14729OrBuilder {
         private int bitField0_;
         private int num_;
         private int unionCopyid_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_SystemPublish_14729_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_SystemPublish_14729_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_SystemPublish_14729.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionOfferMsg.S2CR_SystemPublish_14729.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            this.unionCopyid_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_SystemPublish_14729_descriptor;
         }

         public S2CR_SystemPublish_14729 getDefaultInstanceForType() {
            return CrossUnionOfferMsg.S2CR_SystemPublish_14729.getDefaultInstance();
         }

         public S2CR_SystemPublish_14729 build() {
            S2CR_SystemPublish_14729 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_SystemPublish_14729 buildPartial() {
            S2CR_SystemPublish_14729 result = new S2CR_SystemPublish_14729(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.num_ = this.num_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.unionCopyid_ = this.unionCopyid_;
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
            if (other instanceof S2CR_SystemPublish_14729) {
               return this.mergeFrom((S2CR_SystemPublish_14729)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_SystemPublish_14729 other) {
            if (other == CrossUnionOfferMsg.S2CR_SystemPublish_14729.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               if (other.hasUnionCopyid()) {
                  this.setUnionCopyid(other.getUnionCopyid());
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
            S2CR_SystemPublish_14729 parsedMessage = null;

            try {
               parsedMessage = (S2CR_SystemPublish_14729)CrossUnionOfferMsg.S2CR_SystemPublish_14729.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_SystemPublish_14729)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 1;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionCopyid() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getUnionCopyid() {
            return this.unionCopyid_;
         }

         public Builder setUnionCopyid(int value) {
            this.bitField0_ |= 2;
            this.unionCopyid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionCopyid() {
            this.bitField0_ &= -3;
            this.unionCopyid_ = 0;
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

   public static final class S2CR_PointRank_14731 extends GeneratedMessageV3 implements S2CR_PointRank_14731OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final S2CR_PointRank_14731 DEFAULT_INSTANCE = new S2CR_PointRank_14731();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_PointRank_14731> PARSER = new AbstractParser<S2CR_PointRank_14731>() {
         public S2CR_PointRank_14731 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_PointRank_14731(input, extensionRegistry);
         }
      };

      private S2CR_PointRank_14731(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_PointRank_14731() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_PointRank_14731();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_PointRank_14731(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_PointRank_14731_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_PointRank_14731_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PointRank_14731.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_PointRank_14731)) {
            return super.equals(obj);
         } else {
            S2CR_PointRank_14731 other = (S2CR_PointRank_14731)obj;
            if (this.hasType() != other.hasType()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_PointRank_14731 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_PointRank_14731)PARSER.parseFrom(data);
      }

      public static S2CR_PointRank_14731 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PointRank_14731)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PointRank_14731 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_PointRank_14731)PARSER.parseFrom(data);
      }

      public static S2CR_PointRank_14731 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PointRank_14731)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PointRank_14731 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_PointRank_14731)PARSER.parseFrom(data);
      }

      public static S2CR_PointRank_14731 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PointRank_14731)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PointRank_14731 parseFrom(InputStream input) throws IOException {
         return (S2CR_PointRank_14731)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PointRank_14731 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PointRank_14731)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PointRank_14731 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_PointRank_14731)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_PointRank_14731 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PointRank_14731)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PointRank_14731 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_PointRank_14731)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PointRank_14731 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PointRank_14731)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_PointRank_14731 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_PointRank_14731 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_PointRank_14731> parser() {
         return PARSER;
      }

      public Parser<S2CR_PointRank_14731> getParserForType() {
         return PARSER;
      }

      public S2CR_PointRank_14731 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_PointRank_14731OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_PointRank_14731_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_PointRank_14731_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PointRank_14731.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionOfferMsg.S2CR_PointRank_14731.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_PointRank_14731_descriptor;
         }

         public S2CR_PointRank_14731 getDefaultInstanceForType() {
            return CrossUnionOfferMsg.S2CR_PointRank_14731.getDefaultInstance();
         }

         public S2CR_PointRank_14731 build() {
            S2CR_PointRank_14731 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_PointRank_14731 buildPartial() {
            S2CR_PointRank_14731 result = new S2CR_PointRank_14731(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof S2CR_PointRank_14731) {
               return this.mergeFrom((S2CR_PointRank_14731)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_PointRank_14731 other) {
            if (other == CrossUnionOfferMsg.S2CR_PointRank_14731.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
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
            S2CR_PointRank_14731 parsedMessage = null;

            try {
               parsedMessage = (S2CR_PointRank_14731)CrossUnionOfferMsg.S2CR_PointRank_14731.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_PointRank_14731)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_DailyUpdate_14734 extends GeneratedMessageV3 implements CR2S_DailyUpdate_14734OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final CR2S_DailyUpdate_14734 DEFAULT_INSTANCE = new CR2S_DailyUpdate_14734();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_DailyUpdate_14734> PARSER = new AbstractParser<CR2S_DailyUpdate_14734>() {
         public CR2S_DailyUpdate_14734 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_DailyUpdate_14734(input, extensionRegistry);
         }
      };

      private CR2S_DailyUpdate_14734(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_DailyUpdate_14734() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_DailyUpdate_14734();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_DailyUpdate_14734(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_DailyUpdate_14734_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_DailyUpdate_14734_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_DailyUpdate_14734.class, Builder.class);
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
         } else if (!(obj instanceof CR2S_DailyUpdate_14734)) {
            return super.equals(obj);
         } else {
            CR2S_DailyUpdate_14734 other = (CR2S_DailyUpdate_14734)obj;
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

      public static CR2S_DailyUpdate_14734 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_DailyUpdate_14734)PARSER.parseFrom(data);
      }

      public static CR2S_DailyUpdate_14734 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_DailyUpdate_14734)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_DailyUpdate_14734 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_DailyUpdate_14734)PARSER.parseFrom(data);
      }

      public static CR2S_DailyUpdate_14734 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_DailyUpdate_14734)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_DailyUpdate_14734 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_DailyUpdate_14734)PARSER.parseFrom(data);
      }

      public static CR2S_DailyUpdate_14734 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_DailyUpdate_14734)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_DailyUpdate_14734 parseFrom(InputStream input) throws IOException {
         return (CR2S_DailyUpdate_14734)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_DailyUpdate_14734 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_DailyUpdate_14734)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_DailyUpdate_14734 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_DailyUpdate_14734)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_DailyUpdate_14734 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_DailyUpdate_14734)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_DailyUpdate_14734 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_DailyUpdate_14734)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_DailyUpdate_14734 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_DailyUpdate_14734)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_DailyUpdate_14734 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_DailyUpdate_14734 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_DailyUpdate_14734> parser() {
         return PARSER;
      }

      public Parser<CR2S_DailyUpdate_14734> getParserForType() {
         return PARSER;
      }

      public CR2S_DailyUpdate_14734 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_DailyUpdate_14734OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_DailyUpdate_14734_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_DailyUpdate_14734_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_DailyUpdate_14734.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionOfferMsg.CR2S_DailyUpdate_14734.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_CR2S_DailyUpdate_14734_descriptor;
         }

         public CR2S_DailyUpdate_14734 getDefaultInstanceForType() {
            return CrossUnionOfferMsg.CR2S_DailyUpdate_14734.getDefaultInstance();
         }

         public CR2S_DailyUpdate_14734 build() {
            CR2S_DailyUpdate_14734 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_DailyUpdate_14734 buildPartial() {
            CR2S_DailyUpdate_14734 result = new CR2S_DailyUpdate_14734(this);
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
            if (other instanceof CR2S_DailyUpdate_14734) {
               return this.mergeFrom((CR2S_DailyUpdate_14734)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_DailyUpdate_14734 other) {
            if (other == CrossUnionOfferMsg.CR2S_DailyUpdate_14734.getDefaultInstance()) {
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
            CR2S_DailyUpdate_14734 parsedMessage = null;

            try {
               parsedMessage = (CR2S_DailyUpdate_14734)CrossUnionOfferMsg.CR2S_DailyUpdate_14734.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_DailyUpdate_14734)e.getUnfinishedMessage();
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

   public static final class S2CR_SETTLEMENT_14751 extends GeneratedMessageV3 implements S2CR_SETTLEMENT_14751OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SERVERID_FIELD_NUMBER = 1;
      private int serverId_;
      private byte memoizedIsInitialized;
      private static final S2CR_SETTLEMENT_14751 DEFAULT_INSTANCE = new S2CR_SETTLEMENT_14751();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_SETTLEMENT_14751> PARSER = new AbstractParser<S2CR_SETTLEMENT_14751>() {
         public S2CR_SETTLEMENT_14751 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_SETTLEMENT_14751(input, extensionRegistry);
         }
      };

      private S2CR_SETTLEMENT_14751(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_SETTLEMENT_14751() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_SETTLEMENT_14751();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_SETTLEMENT_14751(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_SETTLEMENT_14751_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_SETTLEMENT_14751_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_SETTLEMENT_14751.class, Builder.class);
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 1) != 0;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.serverId_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_SETTLEMENT_14751)) {
            return super.equals(obj);
         } else {
            S2CR_SETTLEMENT_14751 other = (S2CR_SETTLEMENT_14751)obj;
            if (this.hasServerId() != other.hasServerId()) {
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
            if (this.hasServerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getServerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_SETTLEMENT_14751 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_SETTLEMENT_14751)PARSER.parseFrom(data);
      }

      public static S2CR_SETTLEMENT_14751 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SETTLEMENT_14751)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SETTLEMENT_14751 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_SETTLEMENT_14751)PARSER.parseFrom(data);
      }

      public static S2CR_SETTLEMENT_14751 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SETTLEMENT_14751)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SETTLEMENT_14751 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_SETTLEMENT_14751)PARSER.parseFrom(data);
      }

      public static S2CR_SETTLEMENT_14751 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SETTLEMENT_14751)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SETTLEMENT_14751 parseFrom(InputStream input) throws IOException {
         return (S2CR_SETTLEMENT_14751)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_SETTLEMENT_14751 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SETTLEMENT_14751)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_SETTLEMENT_14751 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_SETTLEMENT_14751)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_SETTLEMENT_14751 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SETTLEMENT_14751)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_SETTLEMENT_14751 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_SETTLEMENT_14751)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_SETTLEMENT_14751 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SETTLEMENT_14751)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_SETTLEMENT_14751 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_SETTLEMENT_14751 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_SETTLEMENT_14751> parser() {
         return PARSER;
      }

      public Parser<S2CR_SETTLEMENT_14751> getParserForType() {
         return PARSER;
      }

      public S2CR_SETTLEMENT_14751 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_SETTLEMENT_14751OrBuilder {
         private int bitField0_;
         private int serverId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_SETTLEMENT_14751_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_SETTLEMENT_14751_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_SETTLEMENT_14751.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossUnionOfferMsg.S2CR_SETTLEMENT_14751.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.serverId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossUnionOfferMsg.internal_static_crossUnionOffer_com_gzbz_protobuf_S2CR_SETTLEMENT_14751_descriptor;
         }

         public S2CR_SETTLEMENT_14751 getDefaultInstanceForType() {
            return CrossUnionOfferMsg.S2CR_SETTLEMENT_14751.getDefaultInstance();
         }

         public S2CR_SETTLEMENT_14751 build() {
            S2CR_SETTLEMENT_14751 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_SETTLEMENT_14751 buildPartial() {
            S2CR_SETTLEMENT_14751 result = new S2CR_SETTLEMENT_14751(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.serverId_ = this.serverId_;
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
            if (other instanceof S2CR_SETTLEMENT_14751) {
               return this.mergeFrom((S2CR_SETTLEMENT_14751)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_SETTLEMENT_14751 other) {
            if (other == CrossUnionOfferMsg.S2CR_SETTLEMENT_14751.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
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
            S2CR_SETTLEMENT_14751 parsedMessage = null;

            try {
               parsedMessage = (S2CR_SETTLEMENT_14751)CrossUnionOfferMsg.S2CR_SETTLEMENT_14751.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_SETTLEMENT_14751)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface CR2S_DailyUpdate_14734OrBuilder extends MessageOrBuilder {
   }

   public interface CR2S_DelOffer_14708OrBuilder extends MessageOrBuilder {
      List<Integer> getCodesList();

      int getCodesCount();

      int getCodes(int index);
   }

   public interface CR2S_Fight_14710OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasUnionPoint();

      int getUnionPoint();

      boolean hasOfferRewardId();

      int getOfferRewardId();

      boolean hasIsKill();

      boolean getIsKill();

      boolean hasOfferHeroId();

      int getOfferHeroId();

      boolean hasBattleMsg();

      BattleMsg.S2C_BattleResult_6102 getBattleMsg();

      BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder();
   }

   public interface CR2S_Kill_14722OrBuilder extends MessageOrBuilder {
      boolean hasOfferId();

      int getOfferId();

      boolean hasServerId();

      int getServerId();

      boolean hasRewardId();

      int getRewardId();

      boolean hasKillPoint();

      int getKillPoint();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasUnionId();

      int getUnionId();

      boolean hasOfferHeroId();

      int getOfferHeroId();
   }

   public interface CR2S_PublishOffer_14704OrBuilder extends MessageOrBuilder {
      boolean hasOffer();

      UnionOfferMsg.OfferRewardInfo getOffer();

      UnionOfferMsg.OfferRewardInfoOrBuilder getOfferOrBuilder();
   }

   public interface CR2S_RamageRand_14724OrBuilder extends MessageOrBuilder {
      boolean hasRewardGroup();

      int getRewardGroup();

      List<RankInfo> getRankInfoList();

      RankInfo getRankInfo(int index);

      int getRankInfoCount();

      List<? extends RankInfoOrBuilder> getRankInfoOrBuilderList();

      RankInfoOrBuilder getRankInfoOrBuilder(int index);

      boolean hasOfferHeroId();

      int getOfferHeroId();
   }

   public interface CR2S_UnionPointRand_14726OrBuilder extends MessageOrBuilder {
      List<RankInfo> getRankInfoList();

      RankInfo getRankInfo(int index);

      int getRankInfoCount();

      List<? extends RankInfoOrBuilder> getRankInfoOrBuilderList();

      RankInfoOrBuilder getRankInfoOrBuilder(int index);
   }

   public interface CR2S_UpdateOffer_14706OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      UnionOfferMsg.OfferRewardInfo getInfo();

      UnionOfferMsg.OfferRewardInfoOrBuilder getInfoOrBuilder();
   }

   public interface CR2S_UpdateUnionPoint_14728OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataII> getUnionPointList();

      CommonMsg.MapDataII getUnionPoint(int index);

      int getUnionPointCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getUnionPointOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getUnionPointOrBuilder(int index);
   }

   public interface RankInfoOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasRank();

      int getRank();
   }

   public interface S2CR_DamageRank_14717OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();
   }

   public interface S2CR_EnterView_14701OrBuilder extends MessageOrBuilder {
      boolean hasFightNum();

      int getFightNum();

      boolean hasBuyNum();

      int getBuyNum();

      boolean hasUnionCopyNum();

      int getUnionCopyNum();

      boolean hasUnionPublishNum();

      int getUnionPublishNum();

      boolean hasCoolTime();

      int getCoolTime();
   }

   public interface S2CR_Fight_14709OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasHeroArrayingData();

      ByteString getHeroArrayingData();
   }

   public interface S2CR_MyRankPoint_14719OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_OfferDetail_14715OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();
   }

   public interface S2CR_PointRank_14731OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface S2CR_PublishOffer_14703OrBuilder extends MessageOrBuilder {
      boolean hasUnionId();

      int getUnionId();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasOfferId();

      int getOfferId();

      boolean hasType();

      int getType();
   }

   public interface S2CR_Record_14711OrBuilder extends MessageOrBuilder {
      boolean hasUnionId();

      int getUnionId();
   }

   public interface S2CR_SETTLEMENT_14751OrBuilder extends MessageOrBuilder {
      boolean hasServerId();

      int getServerId();
   }

   public interface S2CR_SystemPublish_14729OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();

      boolean hasUnionCopyid();

      int getUnionCopyid();
   }
}
