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

public final class TrailTowerMsg {
   private static final Descriptors.Descriptor internal_static_trailtower_com_gzbz_protobuf_Condition_Info_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_trailtower_com_gzbz_protobuf_Condition_Info_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_trailtower_com_gzbz_protobuf_TowerOwner_Info_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_trailtower_com_gzbz_protobuf_TowerOwner_Info_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_trailtower_com_gzbz_protobuf_C2S_GetTowerInfo_10401_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_trailtower_com_gzbz_protobuf_C2S_GetTowerInfo_10401_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_trailtower_com_gzbz_protobuf_S2C_GetTowerInfo_10402_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_trailtower_com_gzbz_protobuf_S2C_GetTowerInfo_10402_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_trailtower_com_gzbz_protobuf_C2S_SweapTower_10403_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_trailtower_com_gzbz_protobuf_C2S_SweapTower_10403_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_trailtower_com_gzbz_protobuf_C2S_GetTowerReward_10405_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_trailtower_com_gzbz_protobuf_C2S_GetTowerReward_10405_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_trailtower_com_gzbz_protobuf_S2C_GetTowerReward_10406_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_trailtower_com_gzbz_protobuf_S2C_GetTowerReward_10406_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_trailtower_com_gzbz_protobuf_C2S_BuyTimes_10407_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_trailtower_com_gzbz_protobuf_C2S_BuyTimes_10407_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_trailtower_com_gzbz_protobuf_S2C_BuyTimes_10408_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_trailtower_com_gzbz_protobuf_S2C_BuyTimes_10408_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_trailtower_com_gzbz_protobuf_C2S_TowerReport_10409_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_trailtower_com_gzbz_protobuf_C2S_TowerReport_10409_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_trailtower_com_gzbz_protobuf_C2S_ChallengeOwner_10411_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_trailtower_com_gzbz_protobuf_C2S_ChallengeOwner_10411_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_trailtower_com_gzbz_protobuf_S2C_UpdateTowerOwner_10414_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_trailtower_com_gzbz_protobuf_S2C_UpdateTowerOwner_10414_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_trailtower_com_gzbz_protobuf_S2C_Condition_10416_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_trailtower_com_gzbz_protobuf_S2C_Condition_10416_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private TrailTowerMsg() {
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
      String[] descriptorData = new String[]{"\n\u0010TrailTower.proto\u0012\u001ctrailtower.com.gzbz.protobuf\u001a\nRank.proto\"6\n\u000eCondition_Info\u0012\u000f\n\u0007towerId\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bconditionId\u0018\u0002 \u0003(\u0005\"i\n\u000fTowerOwner_Info\u0012\u000f\n\u0007towerId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0002(\t\u0012\f\n\u0004head\u0018\u0004 \u0002(\u0005\u0012\u0011\n\theadFrame\u0018\u0005 \u0002(\u0005\"\u0018\n\u0016C2S_GetTowerInfo_10401\" \u0001\n\u0016S2C_GetTowerInfo_10402\u0012\u000f\n\u0007towerId\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005count\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bbuyTimes\u0018\u0003 \u0002(\u0005\u0012\u0010\n\brewardId\u0018\u0004 \u0003(\u0005\u0012\u0011\n\ttotalStar\u0018\u0005 \u0002(\u0005\u0012/\n\u0005ranks\u0018\u0006 \u0003(\u000b2 .rank.com.gzbz.protobuf.RankData\"'\n\u0014C2S_SweapTower_10403\u0012\u000f\n\u0007towerId\u0018\u0001 \u0002(\u0005\"&\n\u0018C2S_GetTowerReward_10405\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"&\n\u0018S2C_GetTowerReward_10406\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0014\n\u0012C2S_BuyTimes_10407\"&\n\u0012S2C_BuyTimes_10408\u0012\u0010\n\bbuyTimes\u0018\u0001 \u0002(\u0005\"(\n\u0015C2S_TowerReport_10409\u0012\u000f\n\u0007towerId\u0018\u0001 \u0002(\u0005\"<\n\u0018C2S_ChallengeOwner_10411\u0012\u000f\n\u0007towerId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007ownerId\u0018\u0002 \u0002(\u0005\"^\n\u001aS2C_UpdateTowerOwner_10414\u0012@\n\townerInfo\u0018\u0001 \u0003(\u000b2-.trailtower.com.gzbz.protobuf.TowerOwner_Info\"Z\n\u0013S2C_Condition_10416\u0012C\n\rconditionInfo\u0018\u0001 \u0003(\u000b2,.trailtower.com.gzbz.protobuf.Condition_InfoB$\n\u0011com.gzbz.protobufB\rTrailTowerMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{RankMsg.getDescriptor()});
      internal_static_trailtower_com_gzbz_protobuf_Condition_Info_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_trailtower_com_gzbz_protobuf_Condition_Info_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_trailtower_com_gzbz_protobuf_Condition_Info_descriptor, new String[]{"TowerId", "ConditionId"});
      internal_static_trailtower_com_gzbz_protobuf_TowerOwner_Info_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_trailtower_com_gzbz_protobuf_TowerOwner_Info_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_trailtower_com_gzbz_protobuf_TowerOwner_Info_descriptor, new String[]{"TowerId", "PlayerId", "PlayerName", "Head", "HeadFrame"});
      internal_static_trailtower_com_gzbz_protobuf_C2S_GetTowerInfo_10401_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_trailtower_com_gzbz_protobuf_C2S_GetTowerInfo_10401_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_trailtower_com_gzbz_protobuf_C2S_GetTowerInfo_10401_descriptor, new String[0]);
      internal_static_trailtower_com_gzbz_protobuf_S2C_GetTowerInfo_10402_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_trailtower_com_gzbz_protobuf_S2C_GetTowerInfo_10402_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_trailtower_com_gzbz_protobuf_S2C_GetTowerInfo_10402_descriptor, new String[]{"TowerId", "Count", "BuyTimes", "RewardId", "TotalStar", "Ranks"});
      internal_static_trailtower_com_gzbz_protobuf_C2S_SweapTower_10403_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_trailtower_com_gzbz_protobuf_C2S_SweapTower_10403_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_trailtower_com_gzbz_protobuf_C2S_SweapTower_10403_descriptor, new String[]{"TowerId"});
      internal_static_trailtower_com_gzbz_protobuf_C2S_GetTowerReward_10405_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_trailtower_com_gzbz_protobuf_C2S_GetTowerReward_10405_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_trailtower_com_gzbz_protobuf_C2S_GetTowerReward_10405_descriptor, new String[]{"Id"});
      internal_static_trailtower_com_gzbz_protobuf_S2C_GetTowerReward_10406_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_trailtower_com_gzbz_protobuf_S2C_GetTowerReward_10406_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_trailtower_com_gzbz_protobuf_S2C_GetTowerReward_10406_descriptor, new String[]{"Id"});
      internal_static_trailtower_com_gzbz_protobuf_C2S_BuyTimes_10407_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_trailtower_com_gzbz_protobuf_C2S_BuyTimes_10407_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_trailtower_com_gzbz_protobuf_C2S_BuyTimes_10407_descriptor, new String[0]);
      internal_static_trailtower_com_gzbz_protobuf_S2C_BuyTimes_10408_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_trailtower_com_gzbz_protobuf_S2C_BuyTimes_10408_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_trailtower_com_gzbz_protobuf_S2C_BuyTimes_10408_descriptor, new String[]{"BuyTimes"});
      internal_static_trailtower_com_gzbz_protobuf_C2S_TowerReport_10409_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_trailtower_com_gzbz_protobuf_C2S_TowerReport_10409_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_trailtower_com_gzbz_protobuf_C2S_TowerReport_10409_descriptor, new String[]{"TowerId"});
      internal_static_trailtower_com_gzbz_protobuf_C2S_ChallengeOwner_10411_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_trailtower_com_gzbz_protobuf_C2S_ChallengeOwner_10411_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_trailtower_com_gzbz_protobuf_C2S_ChallengeOwner_10411_descriptor, new String[]{"TowerId", "OwnerId"});
      internal_static_trailtower_com_gzbz_protobuf_S2C_UpdateTowerOwner_10414_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_trailtower_com_gzbz_protobuf_S2C_UpdateTowerOwner_10414_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_trailtower_com_gzbz_protobuf_S2C_UpdateTowerOwner_10414_descriptor, new String[]{"OwnerInfo"});
      internal_static_trailtower_com_gzbz_protobuf_S2C_Condition_10416_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_trailtower_com_gzbz_protobuf_S2C_Condition_10416_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_trailtower_com_gzbz_protobuf_S2C_Condition_10416_descriptor, new String[]{"ConditionInfo"});
      RankMsg.getDescriptor();
   }

   public static final class Condition_Info extends GeneratedMessageV3 implements Condition_InfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TOWERID_FIELD_NUMBER = 1;
      private int towerId_;
      public static final int CONDITIONID_FIELD_NUMBER = 2;
      private Internal.IntList conditionId_;
      private byte memoizedIsInitialized;
      private static final Condition_Info DEFAULT_INSTANCE = new Condition_Info();
      /** @deprecated */
      @Deprecated
      public static final Parser<Condition_Info> PARSER = new AbstractParser<Condition_Info>() {
         public Condition_Info parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new Condition_Info(input, extensionRegistry);
         }
      };

      private Condition_Info(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private Condition_Info() {
         this.memoizedIsInitialized = -1;
         this.conditionId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new Condition_Info();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private Condition_Info(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.towerId_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.conditionId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.conditionId_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.conditionId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.conditionId_.addInt(input.readInt32());
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
                  this.conditionId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_Condition_Info_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_Condition_Info_fieldAccessorTable.ensureFieldAccessorsInitialized(Condition_Info.class, Builder.class);
      }

      public boolean hasTowerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTowerId() {
         return this.towerId_;
      }

      public List<Integer> getConditionIdList() {
         return this.conditionId_;
      }

      public int getConditionIdCount() {
         return this.conditionId_.size();
      }

      public int getConditionId(int index) {
         return this.conditionId_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTowerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.towerId_);
         }

         for(int i = 0; i < this.conditionId_.size(); ++i) {
            output.writeInt32(2, this.conditionId_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.towerId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.conditionId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.conditionId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getConditionIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof Condition_Info)) {
            return super.equals(obj);
         } else {
            Condition_Info other = (Condition_Info)obj;
            if (this.hasTowerId() != other.hasTowerId()) {
               return false;
            } else if (this.hasTowerId() && this.getTowerId() != other.getTowerId()) {
               return false;
            } else if (!this.getConditionIdList().equals(other.getConditionIdList())) {
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
            if (this.hasTowerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTowerId();
            }

            if (this.getConditionIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getConditionIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static Condition_Info parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (Condition_Info)PARSER.parseFrom(data);
      }

      public static Condition_Info parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Condition_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Condition_Info parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (Condition_Info)PARSER.parseFrom(data);
      }

      public static Condition_Info parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Condition_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Condition_Info parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (Condition_Info)PARSER.parseFrom(data);
      }

      public static Condition_Info parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Condition_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Condition_Info parseFrom(InputStream input) throws IOException {
         return (Condition_Info)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static Condition_Info parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Condition_Info)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static Condition_Info parseDelimitedFrom(InputStream input) throws IOException {
         return (Condition_Info)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static Condition_Info parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Condition_Info)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static Condition_Info parseFrom(CodedInputStream input) throws IOException {
         return (Condition_Info)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static Condition_Info parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Condition_Info)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(Condition_Info prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static Condition_Info getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<Condition_Info> parser() {
         return PARSER;
      }

      public Parser<Condition_Info> getParserForType() {
         return PARSER;
      }

      public Condition_Info getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Condition_InfoOrBuilder {
         private int bitField0_;
         private int towerId_;
         private Internal.IntList conditionId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_Condition_Info_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_Condition_Info_fieldAccessorTable.ensureFieldAccessorsInitialized(Condition_Info.class, Builder.class);
         }

         private Builder() {
            this.conditionId_ = TrailTowerMsg.Condition_Info.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.conditionId_ = TrailTowerMsg.Condition_Info.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TrailTowerMsg.Condition_Info.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.towerId_ = 0;
            this.bitField0_ &= -2;
            this.conditionId_ = TrailTowerMsg.Condition_Info.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_Condition_Info_descriptor;
         }

         public Condition_Info getDefaultInstanceForType() {
            return TrailTowerMsg.Condition_Info.getDefaultInstance();
         }

         public Condition_Info build() {
            Condition_Info result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public Condition_Info buildPartial() {
            Condition_Info result = new Condition_Info(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.towerId_ = this.towerId_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.conditionId_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.conditionId_ = this.conditionId_;
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
            if (other instanceof Condition_Info) {
               return this.mergeFrom((Condition_Info)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(Condition_Info other) {
            if (other == TrailTowerMsg.Condition_Info.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTowerId()) {
                  this.setTowerId(other.getTowerId());
               }

               if (!other.conditionId_.isEmpty()) {
                  if (this.conditionId_.isEmpty()) {
                     this.conditionId_ = other.conditionId_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureConditionIdIsMutable();
                     this.conditionId_.addAll(other.conditionId_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTowerId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            Condition_Info parsedMessage = null;

            try {
               parsedMessage = (Condition_Info)TrailTowerMsg.Condition_Info.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (Condition_Info)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTowerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTowerId() {
            return this.towerId_;
         }

         public Builder setTowerId(int value) {
            this.bitField0_ |= 1;
            this.towerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTowerId() {
            this.bitField0_ &= -2;
            this.towerId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureConditionIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.conditionId_ = TrailTowerMsg.Condition_Info.mutableCopy(this.conditionId_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getConditionIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.conditionId_) : this.conditionId_);
         }

         public int getConditionIdCount() {
            return this.conditionId_.size();
         }

         public int getConditionId(int index) {
            return this.conditionId_.getInt(index);
         }

         public Builder setConditionId(int index, int value) {
            this.ensureConditionIdIsMutable();
            this.conditionId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addConditionId(int value) {
            this.ensureConditionIdIsMutable();
            this.conditionId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllConditionId(Iterable<? extends Integer> values) {
            this.ensureConditionIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.conditionId_);
            this.onChanged();
            return this;
         }

         public Builder clearConditionId() {
            this.conditionId_ = TrailTowerMsg.Condition_Info.emptyIntList();
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

   public static final class TowerOwner_Info extends GeneratedMessageV3 implements TowerOwner_InfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TOWERID_FIELD_NUMBER = 1;
      private int towerId_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 3;
      private volatile Object playerName_;
      public static final int HEAD_FIELD_NUMBER = 4;
      private int head_;
      public static final int HEADFRAME_FIELD_NUMBER = 5;
      private int headFrame_;
      private byte memoizedIsInitialized;
      private static final TowerOwner_Info DEFAULT_INSTANCE = new TowerOwner_Info();
      /** @deprecated */
      @Deprecated
      public static final Parser<TowerOwner_Info> PARSER = new AbstractParser<TowerOwner_Info>() {
         public TowerOwner_Info parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new TowerOwner_Info(input, extensionRegistry);
         }
      };

      private TowerOwner_Info(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private TowerOwner_Info() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new TowerOwner_Info();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private TowerOwner_Info(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.towerId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.playerId_ = input.readInt32();
                        break;
                     case 26:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.playerName_ = bs;
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
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_TowerOwner_Info_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_TowerOwner_Info_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerOwner_Info.class, Builder.class);
      }

      public boolean hasTowerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTowerId() {
         return this.towerId_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
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
         } else if (!this.hasTowerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeadFrame()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.towerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.playerName_);
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
               size += CodedOutputStream.computeInt32Size(1, this.towerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.playerName_);
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
         } else if (!(obj instanceof TowerOwner_Info)) {
            return super.equals(obj);
         } else {
            TowerOwner_Info other = (TowerOwner_Info)obj;
            if (this.hasTowerId() != other.hasTowerId()) {
               return false;
            } else if (this.hasTowerId() && this.getTowerId() != other.getTowerId()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
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
            if (this.hasTowerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTowerId();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerName().hashCode();
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

      public static TowerOwner_Info parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (TowerOwner_Info)PARSER.parseFrom(data);
      }

      public static TowerOwner_Info parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TowerOwner_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TowerOwner_Info parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (TowerOwner_Info)PARSER.parseFrom(data);
      }

      public static TowerOwner_Info parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TowerOwner_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TowerOwner_Info parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (TowerOwner_Info)PARSER.parseFrom(data);
      }

      public static TowerOwner_Info parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TowerOwner_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TowerOwner_Info parseFrom(InputStream input) throws IOException {
         return (TowerOwner_Info)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TowerOwner_Info parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TowerOwner_Info)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static TowerOwner_Info parseDelimitedFrom(InputStream input) throws IOException {
         return (TowerOwner_Info)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static TowerOwner_Info parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TowerOwner_Info)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static TowerOwner_Info parseFrom(CodedInputStream input) throws IOException {
         return (TowerOwner_Info)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TowerOwner_Info parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TowerOwner_Info)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(TowerOwner_Info prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static TowerOwner_Info getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<TowerOwner_Info> parser() {
         return PARSER;
      }

      public Parser<TowerOwner_Info> getParserForType() {
         return PARSER;
      }

      public TowerOwner_Info getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TowerOwner_InfoOrBuilder {
         private int bitField0_;
         private int towerId_;
         private int playerId_;
         private Object playerName_;
         private int head_;
         private int headFrame_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_TowerOwner_Info_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_TowerOwner_Info_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerOwner_Info.class, Builder.class);
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
            if (TrailTowerMsg.TowerOwner_Info.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.towerId_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.playerName_ = "";
            this.bitField0_ &= -5;
            this.head_ = 0;
            this.bitField0_ &= -9;
            this.headFrame_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_TowerOwner_Info_descriptor;
         }

         public TowerOwner_Info getDefaultInstanceForType() {
            return TrailTowerMsg.TowerOwner_Info.getDefaultInstance();
         }

         public TowerOwner_Info build() {
            TowerOwner_Info result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public TowerOwner_Info buildPartial() {
            TowerOwner_Info result = new TowerOwner_Info(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.towerId_ = this.towerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.playerName_ = this.playerName_;
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
            if (other instanceof TowerOwner_Info) {
               return this.mergeFrom((TowerOwner_Info)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(TowerOwner_Info other) {
            if (other == TrailTowerMsg.TowerOwner_Info.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTowerId()) {
                  this.setTowerId(other.getTowerId());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 4;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
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
            if (!this.hasTowerId()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasHead()) {
               return false;
            } else {
               return this.hasHeadFrame();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            TowerOwner_Info parsedMessage = null;

            try {
               parsedMessage = (TowerOwner_Info)TrailTowerMsg.TowerOwner_Info.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (TowerOwner_Info)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTowerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTowerId() {
            return this.towerId_;
         }

         public Builder setTowerId(int value) {
            this.bitField0_ |= 1;
            this.towerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTowerId() {
            this.bitField0_ &= -2;
            this.towerId_ = 0;
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
            this.playerName_ = TrailTowerMsg.TowerOwner_Info.getDefaultInstance().getPlayerName();
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

   public static final class C2S_GetTowerInfo_10401 extends GeneratedMessageV3 implements C2S_GetTowerInfo_10401OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GetTowerInfo_10401 DEFAULT_INSTANCE = new C2S_GetTowerInfo_10401();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GetTowerInfo_10401> PARSER = new AbstractParser<C2S_GetTowerInfo_10401>() {
         public C2S_GetTowerInfo_10401 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GetTowerInfo_10401(input, extensionRegistry);
         }
      };

      private C2S_GetTowerInfo_10401(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GetTowerInfo_10401() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GetTowerInfo_10401();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GetTowerInfo_10401(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_GetTowerInfo_10401_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_GetTowerInfo_10401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetTowerInfo_10401.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GetTowerInfo_10401)) {
            return super.equals(obj);
         } else {
            C2S_GetTowerInfo_10401 other = (C2S_GetTowerInfo_10401)obj;
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

      public static C2S_GetTowerInfo_10401 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GetTowerInfo_10401)PARSER.parseFrom(data);
      }

      public static C2S_GetTowerInfo_10401 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetTowerInfo_10401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetTowerInfo_10401 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GetTowerInfo_10401)PARSER.parseFrom(data);
      }

      public static C2S_GetTowerInfo_10401 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetTowerInfo_10401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetTowerInfo_10401 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GetTowerInfo_10401)PARSER.parseFrom(data);
      }

      public static C2S_GetTowerInfo_10401 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetTowerInfo_10401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetTowerInfo_10401 parseFrom(InputStream input) throws IOException {
         return (C2S_GetTowerInfo_10401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetTowerInfo_10401 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetTowerInfo_10401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetTowerInfo_10401 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GetTowerInfo_10401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GetTowerInfo_10401 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetTowerInfo_10401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetTowerInfo_10401 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GetTowerInfo_10401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetTowerInfo_10401 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetTowerInfo_10401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GetTowerInfo_10401 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GetTowerInfo_10401 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GetTowerInfo_10401> parser() {
         return PARSER;
      }

      public Parser<C2S_GetTowerInfo_10401> getParserForType() {
         return PARSER;
      }

      public C2S_GetTowerInfo_10401 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GetTowerInfo_10401OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_GetTowerInfo_10401_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_GetTowerInfo_10401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetTowerInfo_10401.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TrailTowerMsg.C2S_GetTowerInfo_10401.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_GetTowerInfo_10401_descriptor;
         }

         public C2S_GetTowerInfo_10401 getDefaultInstanceForType() {
            return TrailTowerMsg.C2S_GetTowerInfo_10401.getDefaultInstance();
         }

         public C2S_GetTowerInfo_10401 build() {
            C2S_GetTowerInfo_10401 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GetTowerInfo_10401 buildPartial() {
            C2S_GetTowerInfo_10401 result = new C2S_GetTowerInfo_10401(this);
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
            if (other instanceof C2S_GetTowerInfo_10401) {
               return this.mergeFrom((C2S_GetTowerInfo_10401)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GetTowerInfo_10401 other) {
            if (other == TrailTowerMsg.C2S_GetTowerInfo_10401.getDefaultInstance()) {
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
            C2S_GetTowerInfo_10401 parsedMessage = null;

            try {
               parsedMessage = (C2S_GetTowerInfo_10401)TrailTowerMsg.C2S_GetTowerInfo_10401.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GetTowerInfo_10401)e.getUnfinishedMessage();
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

   public static final class S2C_GetTowerInfo_10402 extends GeneratedMessageV3 implements S2C_GetTowerInfo_10402OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TOWERID_FIELD_NUMBER = 1;
      private int towerId_;
      public static final int COUNT_FIELD_NUMBER = 2;
      private int count_;
      public static final int BUYTIMES_FIELD_NUMBER = 3;
      private int buyTimes_;
      public static final int REWARDID_FIELD_NUMBER = 4;
      private Internal.IntList rewardId_;
      public static final int TOTALSTAR_FIELD_NUMBER = 5;
      private int totalStar_;
      public static final int RANKS_FIELD_NUMBER = 6;
      private List<RankMsg.RankData> ranks_;
      private byte memoizedIsInitialized;
      private static final S2C_GetTowerInfo_10402 DEFAULT_INSTANCE = new S2C_GetTowerInfo_10402();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GetTowerInfo_10402> PARSER = new AbstractParser<S2C_GetTowerInfo_10402>() {
         public S2C_GetTowerInfo_10402 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GetTowerInfo_10402(input, extensionRegistry);
         }
      };

      private S2C_GetTowerInfo_10402(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GetTowerInfo_10402() {
         this.memoizedIsInitialized = -1;
         this.rewardId_ = emptyIntList();
         this.ranks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GetTowerInfo_10402();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GetTowerInfo_10402(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.towerId_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.count_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 4;
                        this.buyTimes_ = input.readInt32();
                        continue;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.rewardId_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.rewardId_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.rewardId_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.totalStar_ = input.readInt32();
                        continue;
                     case 50:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.ranks_ = new ArrayList();
                           mutable_bitField0_ |= 32;
                        }

                        this.ranks_.add(input.readMessage(RankMsg.RankData.PARSER, extensionRegistry));
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.rewardId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 8) != 0) {
                  this.rewardId_.makeImmutable();
               }

               if ((mutable_bitField0_ & 32) != 0) {
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_GetTowerInfo_10402_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_GetTowerInfo_10402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetTowerInfo_10402.class, Builder.class);
      }

      public boolean hasTowerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTowerId() {
         return this.towerId_;
      }

      public boolean hasCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCount() {
         return this.count_;
      }

      public boolean hasBuyTimes() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBuyTimes() {
         return this.buyTimes_;
      }

      public List<Integer> getRewardIdList() {
         return this.rewardId_;
      }

      public int getRewardIdCount() {
         return this.rewardId_.size();
      }

      public int getRewardId(int index) {
         return this.rewardId_.getInt(index);
      }

      public boolean hasTotalStar() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getTotalStar() {
         return this.totalStar_;
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
         } else if (!this.hasTowerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuyTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalStar()) {
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
            output.writeInt32(1, this.towerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.count_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.buyTimes_);
         }

         for(int i = 0; i < this.rewardId_.size(); ++i) {
            output.writeInt32(4, this.rewardId_.getInt(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.totalStar_);
         }

         for(int i = 0; i < this.ranks_.size(); ++i) {
            output.writeMessage(6, (MessageLite)this.ranks_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.towerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.count_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.buyTimes_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.rewardId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.rewardId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRewardIdList().size();
            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.totalStar_);
            }

            for(int i = 0; i < this.ranks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(6, (MessageLite)this.ranks_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GetTowerInfo_10402)) {
            return super.equals(obj);
         } else {
            S2C_GetTowerInfo_10402 other = (S2C_GetTowerInfo_10402)obj;
            if (this.hasTowerId() != other.hasTowerId()) {
               return false;
            } else if (this.hasTowerId() && this.getTowerId() != other.getTowerId()) {
               return false;
            } else if (this.hasCount() != other.hasCount()) {
               return false;
            } else if (this.hasCount() && this.getCount() != other.getCount()) {
               return false;
            } else if (this.hasBuyTimes() != other.hasBuyTimes()) {
               return false;
            } else if (this.hasBuyTimes() && this.getBuyTimes() != other.getBuyTimes()) {
               return false;
            } else if (!this.getRewardIdList().equals(other.getRewardIdList())) {
               return false;
            } else if (this.hasTotalStar() != other.hasTotalStar()) {
               return false;
            } else if (this.hasTotalStar() && this.getTotalStar() != other.getTotalStar()) {
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
            if (this.hasTowerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTowerId();
            }

            if (this.hasCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCount();
            }

            if (this.hasBuyTimes()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBuyTimes();
            }

            if (this.getRewardIdCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getRewardIdList().hashCode();
            }

            if (this.hasTotalStar()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getTotalStar();
            }

            if (this.getRanksCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getRanksList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GetTowerInfo_10402 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GetTowerInfo_10402)PARSER.parseFrom(data);
      }

      public static S2C_GetTowerInfo_10402 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetTowerInfo_10402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetTowerInfo_10402 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GetTowerInfo_10402)PARSER.parseFrom(data);
      }

      public static S2C_GetTowerInfo_10402 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetTowerInfo_10402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetTowerInfo_10402 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GetTowerInfo_10402)PARSER.parseFrom(data);
      }

      public static S2C_GetTowerInfo_10402 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetTowerInfo_10402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetTowerInfo_10402 parseFrom(InputStream input) throws IOException {
         return (S2C_GetTowerInfo_10402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetTowerInfo_10402 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetTowerInfo_10402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetTowerInfo_10402 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GetTowerInfo_10402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GetTowerInfo_10402 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetTowerInfo_10402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetTowerInfo_10402 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GetTowerInfo_10402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetTowerInfo_10402 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetTowerInfo_10402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GetTowerInfo_10402 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GetTowerInfo_10402 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GetTowerInfo_10402> parser() {
         return PARSER;
      }

      public Parser<S2C_GetTowerInfo_10402> getParserForType() {
         return PARSER;
      }

      public S2C_GetTowerInfo_10402 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GetTowerInfo_10402OrBuilder {
         private int bitField0_;
         private int towerId_;
         private int count_;
         private int buyTimes_;
         private Internal.IntList rewardId_;
         private int totalStar_;
         private List<RankMsg.RankData> ranks_;
         private RepeatedFieldBuilderV3<RankMsg.RankData, RankMsg.RankData.Builder, RankMsg.RankDataOrBuilder> ranksBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_GetTowerInfo_10402_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_GetTowerInfo_10402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetTowerInfo_10402.class, Builder.class);
         }

         private Builder() {
            this.rewardId_ = TrailTowerMsg.S2C_GetTowerInfo_10402.emptyIntList();
            this.ranks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardId_ = TrailTowerMsg.S2C_GetTowerInfo_10402.emptyIntList();
            this.ranks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TrailTowerMsg.S2C_GetTowerInfo_10402.alwaysUseFieldBuilders) {
               this.getRanksFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.towerId_ = 0;
            this.bitField0_ &= -2;
            this.count_ = 0;
            this.bitField0_ &= -3;
            this.buyTimes_ = 0;
            this.bitField0_ &= -5;
            this.rewardId_ = TrailTowerMsg.S2C_GetTowerInfo_10402.emptyIntList();
            this.bitField0_ &= -9;
            this.totalStar_ = 0;
            this.bitField0_ &= -17;
            if (this.ranksBuilder_ == null) {
               this.ranks_ = Collections.emptyList();
               this.bitField0_ &= -33;
            } else {
               this.ranksBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_GetTowerInfo_10402_descriptor;
         }

         public S2C_GetTowerInfo_10402 getDefaultInstanceForType() {
            return TrailTowerMsg.S2C_GetTowerInfo_10402.getDefaultInstance();
         }

         public S2C_GetTowerInfo_10402 build() {
            S2C_GetTowerInfo_10402 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GetTowerInfo_10402 buildPartial() {
            S2C_GetTowerInfo_10402 result = new S2C_GetTowerInfo_10402(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.towerId_ = this.towerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.count_ = this.count_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.buyTimes_ = this.buyTimes_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.rewardId_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.rewardId_ = this.rewardId_;
            if ((from_bitField0_ & 16) != 0) {
               result.totalStar_ = this.totalStar_;
               to_bitField0_ |= 8;
            }

            if (this.ranksBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0) {
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
                  this.bitField0_ &= -33;
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
            if (other instanceof S2C_GetTowerInfo_10402) {
               return this.mergeFrom((S2C_GetTowerInfo_10402)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GetTowerInfo_10402 other) {
            if (other == TrailTowerMsg.S2C_GetTowerInfo_10402.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTowerId()) {
                  this.setTowerId(other.getTowerId());
               }

               if (other.hasCount()) {
                  this.setCount(other.getCount());
               }

               if (other.hasBuyTimes()) {
                  this.setBuyTimes(other.getBuyTimes());
               }

               if (!other.rewardId_.isEmpty()) {
                  if (this.rewardId_.isEmpty()) {
                     this.rewardId_ = other.rewardId_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureRewardIdIsMutable();
                     this.rewardId_.addAll(other.rewardId_);
                  }

                  this.onChanged();
               }

               if (other.hasTotalStar()) {
                  this.setTotalStar(other.getTotalStar());
               }

               if (this.ranksBuilder_ == null) {
                  if (!other.ranks_.isEmpty()) {
                     if (this.ranks_.isEmpty()) {
                        this.ranks_ = other.ranks_;
                        this.bitField0_ &= -33;
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
                     this.bitField0_ &= -33;
                     this.ranksBuilder_ = TrailTowerMsg.S2C_GetTowerInfo_10402.alwaysUseFieldBuilders ? this.getRanksFieldBuilder() : null;
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
            if (!this.hasTowerId()) {
               return false;
            } else if (!this.hasCount()) {
               return false;
            } else if (!this.hasBuyTimes()) {
               return false;
            } else if (!this.hasTotalStar()) {
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
            S2C_GetTowerInfo_10402 parsedMessage = null;

            try {
               parsedMessage = (S2C_GetTowerInfo_10402)TrailTowerMsg.S2C_GetTowerInfo_10402.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GetTowerInfo_10402)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTowerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTowerId() {
            return this.towerId_;
         }

         public Builder setTowerId(int value) {
            this.bitField0_ |= 1;
            this.towerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTowerId() {
            this.bitField0_ &= -2;
            this.towerId_ = 0;
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

         public boolean hasBuyTimes() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBuyTimes() {
            return this.buyTimes_;
         }

         public Builder setBuyTimes(int value) {
            this.bitField0_ |= 4;
            this.buyTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyTimes() {
            this.bitField0_ &= -5;
            this.buyTimes_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRewardIdIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.rewardId_ = TrailTowerMsg.S2C_GetTowerInfo_10402.mutableCopy(this.rewardId_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getRewardIdList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.rewardId_) : this.rewardId_);
         }

         public int getRewardIdCount() {
            return this.rewardId_.size();
         }

         public int getRewardId(int index) {
            return this.rewardId_.getInt(index);
         }

         public Builder setRewardId(int index, int value) {
            this.ensureRewardIdIsMutable();
            this.rewardId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRewardId(int value) {
            this.ensureRewardIdIsMutable();
            this.rewardId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRewardId(Iterable<? extends Integer> values) {
            this.ensureRewardIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rewardId_);
            this.onChanged();
            return this;
         }

         public Builder clearRewardId() {
            this.rewardId_ = TrailTowerMsg.S2C_GetTowerInfo_10402.emptyIntList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         public boolean hasTotalStar() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getTotalStar() {
            return this.totalStar_;
         }

         public Builder setTotalStar(int value) {
            this.bitField0_ |= 16;
            this.totalStar_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalStar() {
            this.bitField0_ &= -17;
            this.totalStar_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRanksIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.ranks_ = new ArrayList(this.ranks_);
               this.bitField0_ |= 32;
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
               this.bitField0_ &= -33;
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
               this.ranksBuilder_ = new RepeatedFieldBuilderV3(this.ranks_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class C2S_SweapTower_10403 extends GeneratedMessageV3 implements C2S_SweapTower_10403OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TOWERID_FIELD_NUMBER = 1;
      private int towerId_;
      private byte memoizedIsInitialized;
      private static final C2S_SweapTower_10403 DEFAULT_INSTANCE = new C2S_SweapTower_10403();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SweapTower_10403> PARSER = new AbstractParser<C2S_SweapTower_10403>() {
         public C2S_SweapTower_10403 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SweapTower_10403(input, extensionRegistry);
         }
      };

      private C2S_SweapTower_10403(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SweapTower_10403() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SweapTower_10403();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SweapTower_10403(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.towerId_ = input.readInt32();
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
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_SweapTower_10403_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_SweapTower_10403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SweapTower_10403.class, Builder.class);
      }

      public boolean hasTowerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTowerId() {
         return this.towerId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTowerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.towerId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.towerId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SweapTower_10403)) {
            return super.equals(obj);
         } else {
            C2S_SweapTower_10403 other = (C2S_SweapTower_10403)obj;
            if (this.hasTowerId() != other.hasTowerId()) {
               return false;
            } else if (this.hasTowerId() && this.getTowerId() != other.getTowerId()) {
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
            if (this.hasTowerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTowerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SweapTower_10403 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SweapTower_10403)PARSER.parseFrom(data);
      }

      public static C2S_SweapTower_10403 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SweapTower_10403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SweapTower_10403 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SweapTower_10403)PARSER.parseFrom(data);
      }

      public static C2S_SweapTower_10403 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SweapTower_10403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SweapTower_10403 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SweapTower_10403)PARSER.parseFrom(data);
      }

      public static C2S_SweapTower_10403 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SweapTower_10403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SweapTower_10403 parseFrom(InputStream input) throws IOException {
         return (C2S_SweapTower_10403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SweapTower_10403 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SweapTower_10403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SweapTower_10403 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SweapTower_10403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SweapTower_10403 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SweapTower_10403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SweapTower_10403 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SweapTower_10403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SweapTower_10403 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SweapTower_10403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SweapTower_10403 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SweapTower_10403 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SweapTower_10403> parser() {
         return PARSER;
      }

      public Parser<C2S_SweapTower_10403> getParserForType() {
         return PARSER;
      }

      public C2S_SweapTower_10403 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SweapTower_10403OrBuilder {
         private int bitField0_;
         private int towerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_SweapTower_10403_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_SweapTower_10403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SweapTower_10403.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TrailTowerMsg.C2S_SweapTower_10403.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.towerId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_SweapTower_10403_descriptor;
         }

         public C2S_SweapTower_10403 getDefaultInstanceForType() {
            return TrailTowerMsg.C2S_SweapTower_10403.getDefaultInstance();
         }

         public C2S_SweapTower_10403 build() {
            C2S_SweapTower_10403 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SweapTower_10403 buildPartial() {
            C2S_SweapTower_10403 result = new C2S_SweapTower_10403(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.towerId_ = this.towerId_;
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
            if (other instanceof C2S_SweapTower_10403) {
               return this.mergeFrom((C2S_SweapTower_10403)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SweapTower_10403 other) {
            if (other == TrailTowerMsg.C2S_SweapTower_10403.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTowerId()) {
                  this.setTowerId(other.getTowerId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTowerId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_SweapTower_10403 parsedMessage = null;

            try {
               parsedMessage = (C2S_SweapTower_10403)TrailTowerMsg.C2S_SweapTower_10403.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SweapTower_10403)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTowerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTowerId() {
            return this.towerId_;
         }

         public Builder setTowerId(int value) {
            this.bitField0_ |= 1;
            this.towerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTowerId() {
            this.bitField0_ &= -2;
            this.towerId_ = 0;
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

   public static final class C2S_GetTowerReward_10405 extends GeneratedMessageV3 implements C2S_GetTowerReward_10405OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_GetTowerReward_10405 DEFAULT_INSTANCE = new C2S_GetTowerReward_10405();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GetTowerReward_10405> PARSER = new AbstractParser<C2S_GetTowerReward_10405>() {
         public C2S_GetTowerReward_10405 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GetTowerReward_10405(input, extensionRegistry);
         }
      };

      private C2S_GetTowerReward_10405(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GetTowerReward_10405() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GetTowerReward_10405();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GetTowerReward_10405(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_GetTowerReward_10405_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_GetTowerReward_10405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetTowerReward_10405.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GetTowerReward_10405)) {
            return super.equals(obj);
         } else {
            C2S_GetTowerReward_10405 other = (C2S_GetTowerReward_10405)obj;
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

      public static C2S_GetTowerReward_10405 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GetTowerReward_10405)PARSER.parseFrom(data);
      }

      public static C2S_GetTowerReward_10405 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetTowerReward_10405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetTowerReward_10405 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GetTowerReward_10405)PARSER.parseFrom(data);
      }

      public static C2S_GetTowerReward_10405 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetTowerReward_10405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetTowerReward_10405 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GetTowerReward_10405)PARSER.parseFrom(data);
      }

      public static C2S_GetTowerReward_10405 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetTowerReward_10405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetTowerReward_10405 parseFrom(InputStream input) throws IOException {
         return (C2S_GetTowerReward_10405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetTowerReward_10405 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetTowerReward_10405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetTowerReward_10405 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GetTowerReward_10405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GetTowerReward_10405 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetTowerReward_10405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetTowerReward_10405 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GetTowerReward_10405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetTowerReward_10405 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetTowerReward_10405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GetTowerReward_10405 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GetTowerReward_10405 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GetTowerReward_10405> parser() {
         return PARSER;
      }

      public Parser<C2S_GetTowerReward_10405> getParserForType() {
         return PARSER;
      }

      public C2S_GetTowerReward_10405 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GetTowerReward_10405OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_GetTowerReward_10405_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_GetTowerReward_10405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetTowerReward_10405.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TrailTowerMsg.C2S_GetTowerReward_10405.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_GetTowerReward_10405_descriptor;
         }

         public C2S_GetTowerReward_10405 getDefaultInstanceForType() {
            return TrailTowerMsg.C2S_GetTowerReward_10405.getDefaultInstance();
         }

         public C2S_GetTowerReward_10405 build() {
            C2S_GetTowerReward_10405 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GetTowerReward_10405 buildPartial() {
            C2S_GetTowerReward_10405 result = new C2S_GetTowerReward_10405(this);
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
            if (other instanceof C2S_GetTowerReward_10405) {
               return this.mergeFrom((C2S_GetTowerReward_10405)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GetTowerReward_10405 other) {
            if (other == TrailTowerMsg.C2S_GetTowerReward_10405.getDefaultInstance()) {
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
            C2S_GetTowerReward_10405 parsedMessage = null;

            try {
               parsedMessage = (C2S_GetTowerReward_10405)TrailTowerMsg.C2S_GetTowerReward_10405.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GetTowerReward_10405)e.getUnfinishedMessage();
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

   public static final class S2C_GetTowerReward_10406 extends GeneratedMessageV3 implements S2C_GetTowerReward_10406OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_GetTowerReward_10406 DEFAULT_INSTANCE = new S2C_GetTowerReward_10406();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GetTowerReward_10406> PARSER = new AbstractParser<S2C_GetTowerReward_10406>() {
         public S2C_GetTowerReward_10406 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GetTowerReward_10406(input, extensionRegistry);
         }
      };

      private S2C_GetTowerReward_10406(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GetTowerReward_10406() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GetTowerReward_10406();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GetTowerReward_10406(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_GetTowerReward_10406_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_GetTowerReward_10406_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetTowerReward_10406.class, Builder.class);
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
         } else if (!(obj instanceof S2C_GetTowerReward_10406)) {
            return super.equals(obj);
         } else {
            S2C_GetTowerReward_10406 other = (S2C_GetTowerReward_10406)obj;
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

      public static S2C_GetTowerReward_10406 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GetTowerReward_10406)PARSER.parseFrom(data);
      }

      public static S2C_GetTowerReward_10406 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetTowerReward_10406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetTowerReward_10406 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GetTowerReward_10406)PARSER.parseFrom(data);
      }

      public static S2C_GetTowerReward_10406 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetTowerReward_10406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetTowerReward_10406 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GetTowerReward_10406)PARSER.parseFrom(data);
      }

      public static S2C_GetTowerReward_10406 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetTowerReward_10406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetTowerReward_10406 parseFrom(InputStream input) throws IOException {
         return (S2C_GetTowerReward_10406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetTowerReward_10406 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetTowerReward_10406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetTowerReward_10406 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GetTowerReward_10406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GetTowerReward_10406 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetTowerReward_10406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetTowerReward_10406 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GetTowerReward_10406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetTowerReward_10406 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetTowerReward_10406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GetTowerReward_10406 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GetTowerReward_10406 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GetTowerReward_10406> parser() {
         return PARSER;
      }

      public Parser<S2C_GetTowerReward_10406> getParserForType() {
         return PARSER;
      }

      public S2C_GetTowerReward_10406 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GetTowerReward_10406OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_GetTowerReward_10406_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_GetTowerReward_10406_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetTowerReward_10406.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TrailTowerMsg.S2C_GetTowerReward_10406.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_GetTowerReward_10406_descriptor;
         }

         public S2C_GetTowerReward_10406 getDefaultInstanceForType() {
            return TrailTowerMsg.S2C_GetTowerReward_10406.getDefaultInstance();
         }

         public S2C_GetTowerReward_10406 build() {
            S2C_GetTowerReward_10406 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GetTowerReward_10406 buildPartial() {
            S2C_GetTowerReward_10406 result = new S2C_GetTowerReward_10406(this);
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
            if (other instanceof S2C_GetTowerReward_10406) {
               return this.mergeFrom((S2C_GetTowerReward_10406)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GetTowerReward_10406 other) {
            if (other == TrailTowerMsg.S2C_GetTowerReward_10406.getDefaultInstance()) {
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
            S2C_GetTowerReward_10406 parsedMessage = null;

            try {
               parsedMessage = (S2C_GetTowerReward_10406)TrailTowerMsg.S2C_GetTowerReward_10406.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GetTowerReward_10406)e.getUnfinishedMessage();
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

   public static final class C2S_BuyTimes_10407 extends GeneratedMessageV3 implements C2S_BuyTimes_10407OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_BuyTimes_10407 DEFAULT_INSTANCE = new C2S_BuyTimes_10407();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BuyTimes_10407> PARSER = new AbstractParser<C2S_BuyTimes_10407>() {
         public C2S_BuyTimes_10407 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BuyTimes_10407(input, extensionRegistry);
         }
      };

      private C2S_BuyTimes_10407(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BuyTimes_10407() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BuyTimes_10407();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BuyTimes_10407(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_BuyTimes_10407_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_BuyTimes_10407_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyTimes_10407.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BuyTimes_10407)) {
            return super.equals(obj);
         } else {
            C2S_BuyTimes_10407 other = (C2S_BuyTimes_10407)obj;
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

      public static C2S_BuyTimes_10407 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BuyTimes_10407)PARSER.parseFrom(data);
      }

      public static C2S_BuyTimes_10407 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyTimes_10407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyTimes_10407 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BuyTimes_10407)PARSER.parseFrom(data);
      }

      public static C2S_BuyTimes_10407 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyTimes_10407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyTimes_10407 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BuyTimes_10407)PARSER.parseFrom(data);
      }

      public static C2S_BuyTimes_10407 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyTimes_10407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyTimes_10407 parseFrom(InputStream input) throws IOException {
         return (C2S_BuyTimes_10407)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyTimes_10407 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyTimes_10407)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyTimes_10407 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BuyTimes_10407)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BuyTimes_10407 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyTimes_10407)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyTimes_10407 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BuyTimes_10407)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyTimes_10407 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyTimes_10407)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BuyTimes_10407 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BuyTimes_10407 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BuyTimes_10407> parser() {
         return PARSER;
      }

      public Parser<C2S_BuyTimes_10407> getParserForType() {
         return PARSER;
      }

      public C2S_BuyTimes_10407 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BuyTimes_10407OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_BuyTimes_10407_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_BuyTimes_10407_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyTimes_10407.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TrailTowerMsg.C2S_BuyTimes_10407.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_BuyTimes_10407_descriptor;
         }

         public C2S_BuyTimes_10407 getDefaultInstanceForType() {
            return TrailTowerMsg.C2S_BuyTimes_10407.getDefaultInstance();
         }

         public C2S_BuyTimes_10407 build() {
            C2S_BuyTimes_10407 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BuyTimes_10407 buildPartial() {
            C2S_BuyTimes_10407 result = new C2S_BuyTimes_10407(this);
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
            if (other instanceof C2S_BuyTimes_10407) {
               return this.mergeFrom((C2S_BuyTimes_10407)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BuyTimes_10407 other) {
            if (other == TrailTowerMsg.C2S_BuyTimes_10407.getDefaultInstance()) {
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
            C2S_BuyTimes_10407 parsedMessage = null;

            try {
               parsedMessage = (C2S_BuyTimes_10407)TrailTowerMsg.C2S_BuyTimes_10407.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BuyTimes_10407)e.getUnfinishedMessage();
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

   public static final class S2C_BuyTimes_10408 extends GeneratedMessageV3 implements S2C_BuyTimes_10408OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYTIMES_FIELD_NUMBER = 1;
      private int buyTimes_;
      private byte memoizedIsInitialized;
      private static final S2C_BuyTimes_10408 DEFAULT_INSTANCE = new S2C_BuyTimes_10408();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BuyTimes_10408> PARSER = new AbstractParser<S2C_BuyTimes_10408>() {
         public S2C_BuyTimes_10408 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BuyTimes_10408(input, extensionRegistry);
         }
      };

      private S2C_BuyTimes_10408(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BuyTimes_10408() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BuyTimes_10408();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BuyTimes_10408(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buyTimes_ = input.readInt32();
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
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_BuyTimes_10408_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_BuyTimes_10408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyTimes_10408.class, Builder.class);
      }

      public boolean hasBuyTimes() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuyTimes() {
         return this.buyTimes_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuyTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.buyTimes_);
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
               size += CodedOutputStream.computeInt32Size(1, this.buyTimes_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BuyTimes_10408)) {
            return super.equals(obj);
         } else {
            S2C_BuyTimes_10408 other = (S2C_BuyTimes_10408)obj;
            if (this.hasBuyTimes() != other.hasBuyTimes()) {
               return false;
            } else if (this.hasBuyTimes() && this.getBuyTimes() != other.getBuyTimes()) {
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
            if (this.hasBuyTimes()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuyTimes();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BuyTimes_10408 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BuyTimes_10408)PARSER.parseFrom(data);
      }

      public static S2C_BuyTimes_10408 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyTimes_10408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyTimes_10408 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BuyTimes_10408)PARSER.parseFrom(data);
      }

      public static S2C_BuyTimes_10408 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyTimes_10408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyTimes_10408 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BuyTimes_10408)PARSER.parseFrom(data);
      }

      public static S2C_BuyTimes_10408 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyTimes_10408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyTimes_10408 parseFrom(InputStream input) throws IOException {
         return (S2C_BuyTimes_10408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyTimes_10408 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyTimes_10408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyTimes_10408 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BuyTimes_10408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BuyTimes_10408 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyTimes_10408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyTimes_10408 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BuyTimes_10408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyTimes_10408 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyTimes_10408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BuyTimes_10408 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BuyTimes_10408 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BuyTimes_10408> parser() {
         return PARSER;
      }

      public Parser<S2C_BuyTimes_10408> getParserForType() {
         return PARSER;
      }

      public S2C_BuyTimes_10408 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BuyTimes_10408OrBuilder {
         private int bitField0_;
         private int buyTimes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_BuyTimes_10408_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_BuyTimes_10408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyTimes_10408.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TrailTowerMsg.S2C_BuyTimes_10408.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyTimes_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_BuyTimes_10408_descriptor;
         }

         public S2C_BuyTimes_10408 getDefaultInstanceForType() {
            return TrailTowerMsg.S2C_BuyTimes_10408.getDefaultInstance();
         }

         public S2C_BuyTimes_10408 build() {
            S2C_BuyTimes_10408 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BuyTimes_10408 buildPartial() {
            S2C_BuyTimes_10408 result = new S2C_BuyTimes_10408(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buyTimes_ = this.buyTimes_;
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
            if (other instanceof S2C_BuyTimes_10408) {
               return this.mergeFrom((S2C_BuyTimes_10408)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BuyTimes_10408 other) {
            if (other == TrailTowerMsg.S2C_BuyTimes_10408.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuyTimes()) {
                  this.setBuyTimes(other.getBuyTimes());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBuyTimes();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BuyTimes_10408 parsedMessage = null;

            try {
               parsedMessage = (S2C_BuyTimes_10408)TrailTowerMsg.S2C_BuyTimes_10408.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BuyTimes_10408)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuyTimes() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuyTimes() {
            return this.buyTimes_;
         }

         public Builder setBuyTimes(int value) {
            this.bitField0_ |= 1;
            this.buyTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyTimes() {
            this.bitField0_ &= -2;
            this.buyTimes_ = 0;
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

   public static final class C2S_TowerReport_10409 extends GeneratedMessageV3 implements C2S_TowerReport_10409OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TOWERID_FIELD_NUMBER = 1;
      private int towerId_;
      private byte memoizedIsInitialized;
      private static final C2S_TowerReport_10409 DEFAULT_INSTANCE = new C2S_TowerReport_10409();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TowerReport_10409> PARSER = new AbstractParser<C2S_TowerReport_10409>() {
         public C2S_TowerReport_10409 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TowerReport_10409(input, extensionRegistry);
         }
      };

      private C2S_TowerReport_10409(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TowerReport_10409() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TowerReport_10409();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TowerReport_10409(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.towerId_ = input.readInt32();
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
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_TowerReport_10409_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_TowerReport_10409_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TowerReport_10409.class, Builder.class);
      }

      public boolean hasTowerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTowerId() {
         return this.towerId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTowerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.towerId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.towerId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TowerReport_10409)) {
            return super.equals(obj);
         } else {
            C2S_TowerReport_10409 other = (C2S_TowerReport_10409)obj;
            if (this.hasTowerId() != other.hasTowerId()) {
               return false;
            } else if (this.hasTowerId() && this.getTowerId() != other.getTowerId()) {
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
            if (this.hasTowerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTowerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TowerReport_10409 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TowerReport_10409)PARSER.parseFrom(data);
      }

      public static C2S_TowerReport_10409 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TowerReport_10409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TowerReport_10409 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TowerReport_10409)PARSER.parseFrom(data);
      }

      public static C2S_TowerReport_10409 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TowerReport_10409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TowerReport_10409 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TowerReport_10409)PARSER.parseFrom(data);
      }

      public static C2S_TowerReport_10409 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TowerReport_10409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TowerReport_10409 parseFrom(InputStream input) throws IOException {
         return (C2S_TowerReport_10409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TowerReport_10409 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TowerReport_10409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TowerReport_10409 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TowerReport_10409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TowerReport_10409 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TowerReport_10409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TowerReport_10409 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TowerReport_10409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TowerReport_10409 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TowerReport_10409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TowerReport_10409 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TowerReport_10409 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TowerReport_10409> parser() {
         return PARSER;
      }

      public Parser<C2S_TowerReport_10409> getParserForType() {
         return PARSER;
      }

      public C2S_TowerReport_10409 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TowerReport_10409OrBuilder {
         private int bitField0_;
         private int towerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_TowerReport_10409_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_TowerReport_10409_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TowerReport_10409.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TrailTowerMsg.C2S_TowerReport_10409.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.towerId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_TowerReport_10409_descriptor;
         }

         public C2S_TowerReport_10409 getDefaultInstanceForType() {
            return TrailTowerMsg.C2S_TowerReport_10409.getDefaultInstance();
         }

         public C2S_TowerReport_10409 build() {
            C2S_TowerReport_10409 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TowerReport_10409 buildPartial() {
            C2S_TowerReport_10409 result = new C2S_TowerReport_10409(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.towerId_ = this.towerId_;
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
            if (other instanceof C2S_TowerReport_10409) {
               return this.mergeFrom((C2S_TowerReport_10409)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TowerReport_10409 other) {
            if (other == TrailTowerMsg.C2S_TowerReport_10409.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTowerId()) {
                  this.setTowerId(other.getTowerId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTowerId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TowerReport_10409 parsedMessage = null;

            try {
               parsedMessage = (C2S_TowerReport_10409)TrailTowerMsg.C2S_TowerReport_10409.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TowerReport_10409)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTowerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTowerId() {
            return this.towerId_;
         }

         public Builder setTowerId(int value) {
            this.bitField0_ |= 1;
            this.towerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTowerId() {
            this.bitField0_ &= -2;
            this.towerId_ = 0;
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

   public static final class C2S_ChallengeOwner_10411 extends GeneratedMessageV3 implements C2S_ChallengeOwner_10411OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TOWERID_FIELD_NUMBER = 1;
      private int towerId_;
      public static final int OWNERID_FIELD_NUMBER = 2;
      private int ownerId_;
      private byte memoizedIsInitialized;
      private static final C2S_ChallengeOwner_10411 DEFAULT_INSTANCE = new C2S_ChallengeOwner_10411();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ChallengeOwner_10411> PARSER = new AbstractParser<C2S_ChallengeOwner_10411>() {
         public C2S_ChallengeOwner_10411 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ChallengeOwner_10411(input, extensionRegistry);
         }
      };

      private C2S_ChallengeOwner_10411(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ChallengeOwner_10411() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ChallengeOwner_10411();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ChallengeOwner_10411(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.towerId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.ownerId_ = input.readInt32();
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
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_ChallengeOwner_10411_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_ChallengeOwner_10411_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChallengeOwner_10411.class, Builder.class);
      }

      public boolean hasTowerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTowerId() {
         return this.towerId_;
      }

      public boolean hasOwnerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getOwnerId() {
         return this.ownerId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTowerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOwnerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.towerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.ownerId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.towerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.ownerId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ChallengeOwner_10411)) {
            return super.equals(obj);
         } else {
            C2S_ChallengeOwner_10411 other = (C2S_ChallengeOwner_10411)obj;
            if (this.hasTowerId() != other.hasTowerId()) {
               return false;
            } else if (this.hasTowerId() && this.getTowerId() != other.getTowerId()) {
               return false;
            } else if (this.hasOwnerId() != other.hasOwnerId()) {
               return false;
            } else if (this.hasOwnerId() && this.getOwnerId() != other.getOwnerId()) {
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
            if (this.hasTowerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTowerId();
            }

            if (this.hasOwnerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getOwnerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ChallengeOwner_10411 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ChallengeOwner_10411)PARSER.parseFrom(data);
      }

      public static C2S_ChallengeOwner_10411 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChallengeOwner_10411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChallengeOwner_10411 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ChallengeOwner_10411)PARSER.parseFrom(data);
      }

      public static C2S_ChallengeOwner_10411 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChallengeOwner_10411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChallengeOwner_10411 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ChallengeOwner_10411)PARSER.parseFrom(data);
      }

      public static C2S_ChallengeOwner_10411 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChallengeOwner_10411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChallengeOwner_10411 parseFrom(InputStream input) throws IOException {
         return (C2S_ChallengeOwner_10411)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChallengeOwner_10411 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChallengeOwner_10411)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChallengeOwner_10411 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ChallengeOwner_10411)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ChallengeOwner_10411 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChallengeOwner_10411)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChallengeOwner_10411 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ChallengeOwner_10411)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChallengeOwner_10411 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChallengeOwner_10411)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ChallengeOwner_10411 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ChallengeOwner_10411 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ChallengeOwner_10411> parser() {
         return PARSER;
      }

      public Parser<C2S_ChallengeOwner_10411> getParserForType() {
         return PARSER;
      }

      public C2S_ChallengeOwner_10411 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ChallengeOwner_10411OrBuilder {
         private int bitField0_;
         private int towerId_;
         private int ownerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_ChallengeOwner_10411_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_ChallengeOwner_10411_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChallengeOwner_10411.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TrailTowerMsg.C2S_ChallengeOwner_10411.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.towerId_ = 0;
            this.bitField0_ &= -2;
            this.ownerId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_C2S_ChallengeOwner_10411_descriptor;
         }

         public C2S_ChallengeOwner_10411 getDefaultInstanceForType() {
            return TrailTowerMsg.C2S_ChallengeOwner_10411.getDefaultInstance();
         }

         public C2S_ChallengeOwner_10411 build() {
            C2S_ChallengeOwner_10411 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ChallengeOwner_10411 buildPartial() {
            C2S_ChallengeOwner_10411 result = new C2S_ChallengeOwner_10411(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.towerId_ = this.towerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.ownerId_ = this.ownerId_;
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
            if (other instanceof C2S_ChallengeOwner_10411) {
               return this.mergeFrom((C2S_ChallengeOwner_10411)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ChallengeOwner_10411 other) {
            if (other == TrailTowerMsg.C2S_ChallengeOwner_10411.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTowerId()) {
                  this.setTowerId(other.getTowerId());
               }

               if (other.hasOwnerId()) {
                  this.setOwnerId(other.getOwnerId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTowerId()) {
               return false;
            } else {
               return this.hasOwnerId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ChallengeOwner_10411 parsedMessage = null;

            try {
               parsedMessage = (C2S_ChallengeOwner_10411)TrailTowerMsg.C2S_ChallengeOwner_10411.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ChallengeOwner_10411)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTowerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTowerId() {
            return this.towerId_;
         }

         public Builder setTowerId(int value) {
            this.bitField0_ |= 1;
            this.towerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTowerId() {
            this.bitField0_ &= -2;
            this.towerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOwnerId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getOwnerId() {
            return this.ownerId_;
         }

         public Builder setOwnerId(int value) {
            this.bitField0_ |= 2;
            this.ownerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOwnerId() {
            this.bitField0_ &= -3;
            this.ownerId_ = 0;
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

   public static final class S2C_UpdateTowerOwner_10414 extends GeneratedMessageV3 implements S2C_UpdateTowerOwner_10414OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int OWNERINFO_FIELD_NUMBER = 1;
      private List<TowerOwner_Info> ownerInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateTowerOwner_10414 DEFAULT_INSTANCE = new S2C_UpdateTowerOwner_10414();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateTowerOwner_10414> PARSER = new AbstractParser<S2C_UpdateTowerOwner_10414>() {
         public S2C_UpdateTowerOwner_10414 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateTowerOwner_10414(input, extensionRegistry);
         }
      };

      private S2C_UpdateTowerOwner_10414(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateTowerOwner_10414() {
         this.memoizedIsInitialized = -1;
         this.ownerInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateTowerOwner_10414();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateTowerOwner_10414(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.ownerInfo_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.ownerInfo_.add(input.readMessage(TrailTowerMsg.TowerOwner_Info.PARSER, extensionRegistry));
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
                  this.ownerInfo_ = Collections.unmodifiableList(this.ownerInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_UpdateTowerOwner_10414_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_UpdateTowerOwner_10414_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateTowerOwner_10414.class, Builder.class);
      }

      public List<TowerOwner_Info> getOwnerInfoList() {
         return this.ownerInfo_;
      }

      public List<? extends TowerOwner_InfoOrBuilder> getOwnerInfoOrBuilderList() {
         return this.ownerInfo_;
      }

      public int getOwnerInfoCount() {
         return this.ownerInfo_.size();
      }

      public TowerOwner_Info getOwnerInfo(int index) {
         return (TowerOwner_Info)this.ownerInfo_.get(index);
      }

      public TowerOwner_InfoOrBuilder getOwnerInfoOrBuilder(int index) {
         return (TowerOwner_InfoOrBuilder)this.ownerInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getOwnerInfoCount(); ++i) {
               if (!this.getOwnerInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.ownerInfo_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.ownerInfo_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.ownerInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.ownerInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpdateTowerOwner_10414)) {
            return super.equals(obj);
         } else {
            S2C_UpdateTowerOwner_10414 other = (S2C_UpdateTowerOwner_10414)obj;
            if (!this.getOwnerInfoList().equals(other.getOwnerInfoList())) {
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
            if (this.getOwnerInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOwnerInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpdateTowerOwner_10414 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTowerOwner_10414)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTowerOwner_10414 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTowerOwner_10414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTowerOwner_10414 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTowerOwner_10414)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTowerOwner_10414 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTowerOwner_10414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTowerOwner_10414 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTowerOwner_10414)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTowerOwner_10414 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTowerOwner_10414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTowerOwner_10414 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateTowerOwner_10414)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateTowerOwner_10414 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTowerOwner_10414)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateTowerOwner_10414 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateTowerOwner_10414)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateTowerOwner_10414 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTowerOwner_10414)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateTowerOwner_10414 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateTowerOwner_10414)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateTowerOwner_10414 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTowerOwner_10414)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateTowerOwner_10414 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateTowerOwner_10414 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateTowerOwner_10414> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateTowerOwner_10414> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateTowerOwner_10414 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateTowerOwner_10414OrBuilder {
         private int bitField0_;
         private List<TowerOwner_Info> ownerInfo_;
         private RepeatedFieldBuilderV3<TowerOwner_Info, TowerOwner_Info.Builder, TowerOwner_InfoOrBuilder> ownerInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_UpdateTowerOwner_10414_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_UpdateTowerOwner_10414_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateTowerOwner_10414.class, Builder.class);
         }

         private Builder() {
            this.ownerInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.ownerInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TrailTowerMsg.S2C_UpdateTowerOwner_10414.alwaysUseFieldBuilders) {
               this.getOwnerInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.ownerInfoBuilder_ == null) {
               this.ownerInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.ownerInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_UpdateTowerOwner_10414_descriptor;
         }

         public S2C_UpdateTowerOwner_10414 getDefaultInstanceForType() {
            return TrailTowerMsg.S2C_UpdateTowerOwner_10414.getDefaultInstance();
         }

         public S2C_UpdateTowerOwner_10414 build() {
            S2C_UpdateTowerOwner_10414 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateTowerOwner_10414 buildPartial() {
            S2C_UpdateTowerOwner_10414 result = new S2C_UpdateTowerOwner_10414(this);
            int from_bitField0_ = this.bitField0_;
            if (this.ownerInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.ownerInfo_ = Collections.unmodifiableList(this.ownerInfo_);
                  this.bitField0_ &= -2;
               }

               result.ownerInfo_ = this.ownerInfo_;
            } else {
               result.ownerInfo_ = this.ownerInfoBuilder_.build();
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
            if (other instanceof S2C_UpdateTowerOwner_10414) {
               return this.mergeFrom((S2C_UpdateTowerOwner_10414)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateTowerOwner_10414 other) {
            if (other == TrailTowerMsg.S2C_UpdateTowerOwner_10414.getDefaultInstance()) {
               return this;
            } else {
               if (this.ownerInfoBuilder_ == null) {
                  if (!other.ownerInfo_.isEmpty()) {
                     if (this.ownerInfo_.isEmpty()) {
                        this.ownerInfo_ = other.ownerInfo_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureOwnerInfoIsMutable();
                        this.ownerInfo_.addAll(other.ownerInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.ownerInfo_.isEmpty()) {
                  if (this.ownerInfoBuilder_.isEmpty()) {
                     this.ownerInfoBuilder_.dispose();
                     this.ownerInfoBuilder_ = null;
                     this.ownerInfo_ = other.ownerInfo_;
                     this.bitField0_ &= -2;
                     this.ownerInfoBuilder_ = TrailTowerMsg.S2C_UpdateTowerOwner_10414.alwaysUseFieldBuilders ? this.getOwnerInfoFieldBuilder() : null;
                  } else {
                     this.ownerInfoBuilder_.addAllMessages(other.ownerInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getOwnerInfoCount(); ++i) {
               if (!this.getOwnerInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpdateTowerOwner_10414 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateTowerOwner_10414)TrailTowerMsg.S2C_UpdateTowerOwner_10414.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateTowerOwner_10414)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureOwnerInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.ownerInfo_ = new ArrayList(this.ownerInfo_);
               this.bitField0_ |= 1;
            }

         }

         public List<TowerOwner_Info> getOwnerInfoList() {
            return this.ownerInfoBuilder_ == null ? Collections.unmodifiableList(this.ownerInfo_) : this.ownerInfoBuilder_.getMessageList();
         }

         public int getOwnerInfoCount() {
            return this.ownerInfoBuilder_ == null ? this.ownerInfo_.size() : this.ownerInfoBuilder_.getCount();
         }

         public TowerOwner_Info getOwnerInfo(int index) {
            return this.ownerInfoBuilder_ == null ? (TowerOwner_Info)this.ownerInfo_.get(index) : (TowerOwner_Info)this.ownerInfoBuilder_.getMessage(index);
         }

         public Builder setOwnerInfo(int index, TowerOwner_Info value) {
            if (this.ownerInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureOwnerInfoIsMutable();
               this.ownerInfo_.set(index, value);
               this.onChanged();
            } else {
               this.ownerInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setOwnerInfo(int index, TowerOwner_Info.Builder builderForValue) {
            if (this.ownerInfoBuilder_ == null) {
               this.ensureOwnerInfoIsMutable();
               this.ownerInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ownerInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addOwnerInfo(TowerOwner_Info value) {
            if (this.ownerInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureOwnerInfoIsMutable();
               this.ownerInfo_.add(value);
               this.onChanged();
            } else {
               this.ownerInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addOwnerInfo(int index, TowerOwner_Info value) {
            if (this.ownerInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureOwnerInfoIsMutable();
               this.ownerInfo_.add(index, value);
               this.onChanged();
            } else {
               this.ownerInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addOwnerInfo(TowerOwner_Info.Builder builderForValue) {
            if (this.ownerInfoBuilder_ == null) {
               this.ensureOwnerInfoIsMutable();
               this.ownerInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.ownerInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addOwnerInfo(int index, TowerOwner_Info.Builder builderForValue) {
            if (this.ownerInfoBuilder_ == null) {
               this.ensureOwnerInfoIsMutable();
               this.ownerInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ownerInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllOwnerInfo(Iterable<? extends TowerOwner_Info> values) {
            if (this.ownerInfoBuilder_ == null) {
               this.ensureOwnerInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.ownerInfo_);
               this.onChanged();
            } else {
               this.ownerInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearOwnerInfo() {
            if (this.ownerInfoBuilder_ == null) {
               this.ownerInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.ownerInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeOwnerInfo(int index) {
            if (this.ownerInfoBuilder_ == null) {
               this.ensureOwnerInfoIsMutable();
               this.ownerInfo_.remove(index);
               this.onChanged();
            } else {
               this.ownerInfoBuilder_.remove(index);
            }

            return this;
         }

         public TowerOwner_Info.Builder getOwnerInfoBuilder(int index) {
            return (TowerOwner_Info.Builder)this.getOwnerInfoFieldBuilder().getBuilder(index);
         }

         public TowerOwner_InfoOrBuilder getOwnerInfoOrBuilder(int index) {
            return this.ownerInfoBuilder_ == null ? (TowerOwner_InfoOrBuilder)this.ownerInfo_.get(index) : (TowerOwner_InfoOrBuilder)this.ownerInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends TowerOwner_InfoOrBuilder> getOwnerInfoOrBuilderList() {
            return this.ownerInfoBuilder_ != null ? this.ownerInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.ownerInfo_);
         }

         public TowerOwner_Info.Builder addOwnerInfoBuilder() {
            return (TowerOwner_Info.Builder)this.getOwnerInfoFieldBuilder().addBuilder(TrailTowerMsg.TowerOwner_Info.getDefaultInstance());
         }

         public TowerOwner_Info.Builder addOwnerInfoBuilder(int index) {
            return (TowerOwner_Info.Builder)this.getOwnerInfoFieldBuilder().addBuilder(index, TrailTowerMsg.TowerOwner_Info.getDefaultInstance());
         }

         public List<TowerOwner_Info.Builder> getOwnerInfoBuilderList() {
            return this.getOwnerInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<TowerOwner_Info, TowerOwner_Info.Builder, TowerOwner_InfoOrBuilder> getOwnerInfoFieldBuilder() {
            if (this.ownerInfoBuilder_ == null) {
               this.ownerInfoBuilder_ = new RepeatedFieldBuilderV3(this.ownerInfo_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.ownerInfo_ = null;
            }

            return this.ownerInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_Condition_10416 extends GeneratedMessageV3 implements S2C_Condition_10416OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CONDITIONINFO_FIELD_NUMBER = 1;
      private List<Condition_Info> conditionInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_Condition_10416 DEFAULT_INSTANCE = new S2C_Condition_10416();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Condition_10416> PARSER = new AbstractParser<S2C_Condition_10416>() {
         public S2C_Condition_10416 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Condition_10416(input, extensionRegistry);
         }
      };

      private S2C_Condition_10416(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Condition_10416() {
         this.memoizedIsInitialized = -1;
         this.conditionInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Condition_10416();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Condition_10416(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.conditionInfo_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.conditionInfo_.add(input.readMessage(TrailTowerMsg.Condition_Info.PARSER, extensionRegistry));
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
                  this.conditionInfo_ = Collections.unmodifiableList(this.conditionInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_Condition_10416_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_Condition_10416_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Condition_10416.class, Builder.class);
      }

      public List<Condition_Info> getConditionInfoList() {
         return this.conditionInfo_;
      }

      public List<? extends Condition_InfoOrBuilder> getConditionInfoOrBuilderList() {
         return this.conditionInfo_;
      }

      public int getConditionInfoCount() {
         return this.conditionInfo_.size();
      }

      public Condition_Info getConditionInfo(int index) {
         return (Condition_Info)this.conditionInfo_.get(index);
      }

      public Condition_InfoOrBuilder getConditionInfoOrBuilder(int index) {
         return (Condition_InfoOrBuilder)this.conditionInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getConditionInfoCount(); ++i) {
               if (!this.getConditionInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.conditionInfo_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.conditionInfo_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.conditionInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.conditionInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Condition_10416)) {
            return super.equals(obj);
         } else {
            S2C_Condition_10416 other = (S2C_Condition_10416)obj;
            if (!this.getConditionInfoList().equals(other.getConditionInfoList())) {
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
            if (this.getConditionInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getConditionInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Condition_10416 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Condition_10416)PARSER.parseFrom(data);
      }

      public static S2C_Condition_10416 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Condition_10416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Condition_10416 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Condition_10416)PARSER.parseFrom(data);
      }

      public static S2C_Condition_10416 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Condition_10416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Condition_10416 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Condition_10416)PARSER.parseFrom(data);
      }

      public static S2C_Condition_10416 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Condition_10416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Condition_10416 parseFrom(InputStream input) throws IOException {
         return (S2C_Condition_10416)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Condition_10416 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Condition_10416)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Condition_10416 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Condition_10416)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Condition_10416 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Condition_10416)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Condition_10416 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Condition_10416)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Condition_10416 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Condition_10416)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Condition_10416 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Condition_10416 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Condition_10416> parser() {
         return PARSER;
      }

      public Parser<S2C_Condition_10416> getParserForType() {
         return PARSER;
      }

      public S2C_Condition_10416 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Condition_10416OrBuilder {
         private int bitField0_;
         private List<Condition_Info> conditionInfo_;
         private RepeatedFieldBuilderV3<Condition_Info, Condition_Info.Builder, Condition_InfoOrBuilder> conditionInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_Condition_10416_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_Condition_10416_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Condition_10416.class, Builder.class);
         }

         private Builder() {
            this.conditionInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.conditionInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TrailTowerMsg.S2C_Condition_10416.alwaysUseFieldBuilders) {
               this.getConditionInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.conditionInfoBuilder_ == null) {
               this.conditionInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.conditionInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TrailTowerMsg.internal_static_trailtower_com_gzbz_protobuf_S2C_Condition_10416_descriptor;
         }

         public S2C_Condition_10416 getDefaultInstanceForType() {
            return TrailTowerMsg.S2C_Condition_10416.getDefaultInstance();
         }

         public S2C_Condition_10416 build() {
            S2C_Condition_10416 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Condition_10416 buildPartial() {
            S2C_Condition_10416 result = new S2C_Condition_10416(this);
            int from_bitField0_ = this.bitField0_;
            if (this.conditionInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.conditionInfo_ = Collections.unmodifiableList(this.conditionInfo_);
                  this.bitField0_ &= -2;
               }

               result.conditionInfo_ = this.conditionInfo_;
            } else {
               result.conditionInfo_ = this.conditionInfoBuilder_.build();
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
            if (other instanceof S2C_Condition_10416) {
               return this.mergeFrom((S2C_Condition_10416)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Condition_10416 other) {
            if (other == TrailTowerMsg.S2C_Condition_10416.getDefaultInstance()) {
               return this;
            } else {
               if (this.conditionInfoBuilder_ == null) {
                  if (!other.conditionInfo_.isEmpty()) {
                     if (this.conditionInfo_.isEmpty()) {
                        this.conditionInfo_ = other.conditionInfo_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureConditionInfoIsMutable();
                        this.conditionInfo_.addAll(other.conditionInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.conditionInfo_.isEmpty()) {
                  if (this.conditionInfoBuilder_.isEmpty()) {
                     this.conditionInfoBuilder_.dispose();
                     this.conditionInfoBuilder_ = null;
                     this.conditionInfo_ = other.conditionInfo_;
                     this.bitField0_ &= -2;
                     this.conditionInfoBuilder_ = TrailTowerMsg.S2C_Condition_10416.alwaysUseFieldBuilders ? this.getConditionInfoFieldBuilder() : null;
                  } else {
                     this.conditionInfoBuilder_.addAllMessages(other.conditionInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getConditionInfoCount(); ++i) {
               if (!this.getConditionInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Condition_10416 parsedMessage = null;

            try {
               parsedMessage = (S2C_Condition_10416)TrailTowerMsg.S2C_Condition_10416.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Condition_10416)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureConditionInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.conditionInfo_ = new ArrayList(this.conditionInfo_);
               this.bitField0_ |= 1;
            }

         }

         public List<Condition_Info> getConditionInfoList() {
            return this.conditionInfoBuilder_ == null ? Collections.unmodifiableList(this.conditionInfo_) : this.conditionInfoBuilder_.getMessageList();
         }

         public int getConditionInfoCount() {
            return this.conditionInfoBuilder_ == null ? this.conditionInfo_.size() : this.conditionInfoBuilder_.getCount();
         }

         public Condition_Info getConditionInfo(int index) {
            return this.conditionInfoBuilder_ == null ? (Condition_Info)this.conditionInfo_.get(index) : (Condition_Info)this.conditionInfoBuilder_.getMessage(index);
         }

         public Builder setConditionInfo(int index, Condition_Info value) {
            if (this.conditionInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureConditionInfoIsMutable();
               this.conditionInfo_.set(index, value);
               this.onChanged();
            } else {
               this.conditionInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setConditionInfo(int index, Condition_Info.Builder builderForValue) {
            if (this.conditionInfoBuilder_ == null) {
               this.ensureConditionInfoIsMutable();
               this.conditionInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.conditionInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addConditionInfo(Condition_Info value) {
            if (this.conditionInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureConditionInfoIsMutable();
               this.conditionInfo_.add(value);
               this.onChanged();
            } else {
               this.conditionInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addConditionInfo(int index, Condition_Info value) {
            if (this.conditionInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureConditionInfoIsMutable();
               this.conditionInfo_.add(index, value);
               this.onChanged();
            } else {
               this.conditionInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addConditionInfo(Condition_Info.Builder builderForValue) {
            if (this.conditionInfoBuilder_ == null) {
               this.ensureConditionInfoIsMutable();
               this.conditionInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.conditionInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addConditionInfo(int index, Condition_Info.Builder builderForValue) {
            if (this.conditionInfoBuilder_ == null) {
               this.ensureConditionInfoIsMutable();
               this.conditionInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.conditionInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllConditionInfo(Iterable<? extends Condition_Info> values) {
            if (this.conditionInfoBuilder_ == null) {
               this.ensureConditionInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.conditionInfo_);
               this.onChanged();
            } else {
               this.conditionInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearConditionInfo() {
            if (this.conditionInfoBuilder_ == null) {
               this.conditionInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.conditionInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeConditionInfo(int index) {
            if (this.conditionInfoBuilder_ == null) {
               this.ensureConditionInfoIsMutable();
               this.conditionInfo_.remove(index);
               this.onChanged();
            } else {
               this.conditionInfoBuilder_.remove(index);
            }

            return this;
         }

         public Condition_Info.Builder getConditionInfoBuilder(int index) {
            return (Condition_Info.Builder)this.getConditionInfoFieldBuilder().getBuilder(index);
         }

         public Condition_InfoOrBuilder getConditionInfoOrBuilder(int index) {
            return this.conditionInfoBuilder_ == null ? (Condition_InfoOrBuilder)this.conditionInfo_.get(index) : (Condition_InfoOrBuilder)this.conditionInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends Condition_InfoOrBuilder> getConditionInfoOrBuilderList() {
            return this.conditionInfoBuilder_ != null ? this.conditionInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.conditionInfo_);
         }

         public Condition_Info.Builder addConditionInfoBuilder() {
            return (Condition_Info.Builder)this.getConditionInfoFieldBuilder().addBuilder(TrailTowerMsg.Condition_Info.getDefaultInstance());
         }

         public Condition_Info.Builder addConditionInfoBuilder(int index) {
            return (Condition_Info.Builder)this.getConditionInfoFieldBuilder().addBuilder(index, TrailTowerMsg.Condition_Info.getDefaultInstance());
         }

         public List<Condition_Info.Builder> getConditionInfoBuilderList() {
            return this.getConditionInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<Condition_Info, Condition_Info.Builder, Condition_InfoOrBuilder> getConditionInfoFieldBuilder() {
            if (this.conditionInfoBuilder_ == null) {
               this.conditionInfoBuilder_ = new RepeatedFieldBuilderV3(this.conditionInfo_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.conditionInfo_ = null;
            }

            return this.conditionInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_BuyTimes_10407OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ChallengeOwner_10411OrBuilder extends MessageOrBuilder {
      boolean hasTowerId();

      int getTowerId();

      boolean hasOwnerId();

      int getOwnerId();
   }

   public interface C2S_GetTowerInfo_10401OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GetTowerReward_10405OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_SweapTower_10403OrBuilder extends MessageOrBuilder {
      boolean hasTowerId();

      int getTowerId();
   }

   public interface C2S_TowerReport_10409OrBuilder extends MessageOrBuilder {
      boolean hasTowerId();

      int getTowerId();
   }

   public interface Condition_InfoOrBuilder extends MessageOrBuilder {
      boolean hasTowerId();

      int getTowerId();

      List<Integer> getConditionIdList();

      int getConditionIdCount();

      int getConditionId(int index);
   }

   public interface S2C_BuyTimes_10408OrBuilder extends MessageOrBuilder {
      boolean hasBuyTimes();

      int getBuyTimes();
   }

   public interface S2C_Condition_10416OrBuilder extends MessageOrBuilder {
      List<Condition_Info> getConditionInfoList();

      Condition_Info getConditionInfo(int index);

      int getConditionInfoCount();

      List<? extends Condition_InfoOrBuilder> getConditionInfoOrBuilderList();

      Condition_InfoOrBuilder getConditionInfoOrBuilder(int index);
   }

   public interface S2C_GetTowerInfo_10402OrBuilder extends MessageOrBuilder {
      boolean hasTowerId();

      int getTowerId();

      boolean hasCount();

      int getCount();

      boolean hasBuyTimes();

      int getBuyTimes();

      List<Integer> getRewardIdList();

      int getRewardIdCount();

      int getRewardId(int index);

      boolean hasTotalStar();

      int getTotalStar();

      List<RankMsg.RankData> getRanksList();

      RankMsg.RankData getRanks(int index);

      int getRanksCount();

      List<? extends RankMsg.RankDataOrBuilder> getRanksOrBuilderList();

      RankMsg.RankDataOrBuilder getRanksOrBuilder(int index);
   }

   public interface S2C_GetTowerReward_10406OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_UpdateTowerOwner_10414OrBuilder extends MessageOrBuilder {
      List<TowerOwner_Info> getOwnerInfoList();

      TowerOwner_Info getOwnerInfo(int index);

      int getOwnerInfoCount();

      List<? extends TowerOwner_InfoOrBuilder> getOwnerInfoOrBuilderList();

      TowerOwner_InfoOrBuilder getOwnerInfoOrBuilder(int index);
   }

   public interface TowerOwner_InfoOrBuilder extends MessageOrBuilder {
      boolean hasTowerId();

      int getTowerId();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasHead();

      int getHead();

      boolean hasHeadFrame();

      int getHeadFrame();
   }
}
