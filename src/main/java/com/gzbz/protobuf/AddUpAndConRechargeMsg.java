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

public final class AddUpAndConRechargeMsg {
   private static final Descriptors.Descriptor internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_AddUpInfo_18601_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_AddUpInfo_18601_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_addUpAndConRecharge_com_gzbz_protobuf_S2C_AddUpInfo_18602_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_addUpAndConRecharge_com_gzbz_protobuf_S2C_AddUpInfo_18602_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ReceiveAddUpReward_18603_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ReceiveAddUpReward_18603_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ConInfo_18604_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ConInfo_18604_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_addUpAndConRecharge_com_gzbz_protobuf_S2C_ConInfo_18605_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_addUpAndConRecharge_com_gzbz_protobuf_S2C_ConInfo_18605_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ReceiveConReward_18606_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ReceiveConReward_18606_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_addUpAndConRecharge_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_addUpAndConRecharge_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private AddUpAndConRechargeMsg() {
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
      String[] descriptorData = new String[]{"\n\u0019AddUpAndConRecharge.proto\u0012%addUpAndConRecharge.com.gzbz.protobuf\"+\n\u0013C2S_AddUpInfo_18601\u0012\u0014\n\factivityType\u0018\u0001 \u0002(\u0005\"\u008c\u0001\n\u0013S2C_AddUpInfo_18602\u0012\u0014\n\factivityType\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ngotRewards\u0018\u0002 \u0003(\u0005\u0012\u0015\n\rstageRecharge\u0018\u0003 \u0002(\u0005\u0012\u0014\n\fstageEndTime\u0018\u0004 \u0002(\u0003\u0012\r\n\u0005stage\u0018\u0005 \u0002(\u0005\u0012\u000f\n\u0007openDay\u0018\u0006 \u0002(\u0005\"F\n\u001cC2S_ReceiveAddUpReward_18603\u0012\u0014\n\factivityType\u0018\u0001 \u0002(\u0005\u0012\u0010\n\brewardId\u0018\u0002 \u0002(\u0005\")\n\u0011C2S_ConInfo_18604\u0012\u0014\n\factivityType\u0018\u0001 \u0002(\u0005\"Ü\u0001\n\u0011S2C_ConInfo_18605\u0012\u0014\n\factivityType\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000eunlockStageNum\u0018\u0002 \u0002(\u0005\u0012\u001b\n\u0013canReceiveRewardIds\u0018\u0003 \u0003(\u0005\u0012\u001b\n\u0013hasReceiveRewardIds\u0018\u0004 \u0003(\u0005\u0012_\n\u0017nextUnlockReceiveReward\u0018\u0005 \u0003(\u000b2>.addUpAndConRecharge.com.gzbz.protobuf.NextUnlockReceiveReward\"D\n\u001aC2S_ReceiveConReward_18606\u0012\u0014\n\factivityType\u0018\u0001 \u0002(\u0005\u0012\u0010\n\brewardId\u0018\u0002 \u0002(\u0005\"=\n\u0017NextUnlockReceiveReward\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bprogress\u0018\u0002 \u0002(\u0001B-\n\u0011com.gzbz.protobufB\u0016AddUpAndConRechargeMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_AddUpInfo_18601_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_AddUpInfo_18601_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_AddUpInfo_18601_descriptor, new String[]{"ActivityType"});
      internal_static_addUpAndConRecharge_com_gzbz_protobuf_S2C_AddUpInfo_18602_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_addUpAndConRecharge_com_gzbz_protobuf_S2C_AddUpInfo_18602_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_addUpAndConRecharge_com_gzbz_protobuf_S2C_AddUpInfo_18602_descriptor, new String[]{"ActivityType", "GotRewards", "StageRecharge", "StageEndTime", "Stage", "OpenDay"});
      internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ReceiveAddUpReward_18603_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ReceiveAddUpReward_18603_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ReceiveAddUpReward_18603_descriptor, new String[]{"ActivityType", "RewardId"});
      internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ConInfo_18604_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ConInfo_18604_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ConInfo_18604_descriptor, new String[]{"ActivityType"});
      internal_static_addUpAndConRecharge_com_gzbz_protobuf_S2C_ConInfo_18605_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_addUpAndConRecharge_com_gzbz_protobuf_S2C_ConInfo_18605_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_addUpAndConRecharge_com_gzbz_protobuf_S2C_ConInfo_18605_descriptor, new String[]{"ActivityType", "UnlockStageNum", "CanReceiveRewardIds", "HasReceiveRewardIds", "NextUnlockReceiveReward"});
      internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ReceiveConReward_18606_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ReceiveConReward_18606_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ReceiveConReward_18606_descriptor, new String[]{"ActivityType", "RewardId"});
      internal_static_addUpAndConRecharge_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_addUpAndConRecharge_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_addUpAndConRecharge_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor, new String[]{"RewardId", "Progress"});
   }

   public static final class C2S_AddUpInfo_18601 extends GeneratedMessageV3 implements C2S_AddUpInfo_18601OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYTYPE_FIELD_NUMBER = 1;
      private int activityType_;
      private byte memoizedIsInitialized;
      private static final C2S_AddUpInfo_18601 DEFAULT_INSTANCE = new C2S_AddUpInfo_18601();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AddUpInfo_18601> PARSER = new AbstractParser<C2S_AddUpInfo_18601>() {
         public C2S_AddUpInfo_18601 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AddUpInfo_18601(input, extensionRegistry);
         }
      };

      private C2S_AddUpInfo_18601(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AddUpInfo_18601() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AddUpInfo_18601();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AddUpInfo_18601(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.activityType_ = input.readInt32();
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
         return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_AddUpInfo_18601_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_AddUpInfo_18601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AddUpInfo_18601.class, Builder.class);
      }

      public boolean hasActivityType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityType() {
         return this.activityType_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasActivityType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.activityType_);
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
               size += CodedOutputStream.computeInt32Size(1, this.activityType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_AddUpInfo_18601)) {
            return super.equals(obj);
         } else {
            C2S_AddUpInfo_18601 other = (C2S_AddUpInfo_18601)obj;
            if (this.hasActivityType() != other.hasActivityType()) {
               return false;
            } else if (this.hasActivityType() && this.getActivityType() != other.getActivityType()) {
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
            if (this.hasActivityType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getActivityType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_AddUpInfo_18601 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AddUpInfo_18601)PARSER.parseFrom(data);
      }

      public static C2S_AddUpInfo_18601 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AddUpInfo_18601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AddUpInfo_18601 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AddUpInfo_18601)PARSER.parseFrom(data);
      }

      public static C2S_AddUpInfo_18601 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AddUpInfo_18601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AddUpInfo_18601 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AddUpInfo_18601)PARSER.parseFrom(data);
      }

      public static C2S_AddUpInfo_18601 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AddUpInfo_18601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AddUpInfo_18601 parseFrom(InputStream input) throws IOException {
         return (C2S_AddUpInfo_18601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AddUpInfo_18601 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AddUpInfo_18601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AddUpInfo_18601 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AddUpInfo_18601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AddUpInfo_18601 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AddUpInfo_18601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AddUpInfo_18601 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AddUpInfo_18601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AddUpInfo_18601 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AddUpInfo_18601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AddUpInfo_18601 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AddUpInfo_18601 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AddUpInfo_18601> parser() {
         return PARSER;
      }

      public Parser<C2S_AddUpInfo_18601> getParserForType() {
         return PARSER;
      }

      public C2S_AddUpInfo_18601 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AddUpInfo_18601OrBuilder {
         private int bitField0_;
         private int activityType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_AddUpInfo_18601_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_AddUpInfo_18601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AddUpInfo_18601.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AddUpAndConRechargeMsg.C2S_AddUpInfo_18601.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityType_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_AddUpInfo_18601_descriptor;
         }

         public C2S_AddUpInfo_18601 getDefaultInstanceForType() {
            return AddUpAndConRechargeMsg.C2S_AddUpInfo_18601.getDefaultInstance();
         }

         public C2S_AddUpInfo_18601 build() {
            C2S_AddUpInfo_18601 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AddUpInfo_18601 buildPartial() {
            C2S_AddUpInfo_18601 result = new C2S_AddUpInfo_18601(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityType_ = this.activityType_;
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
            if (other instanceof C2S_AddUpInfo_18601) {
               return this.mergeFrom((C2S_AddUpInfo_18601)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AddUpInfo_18601 other) {
            if (other == AddUpAndConRechargeMsg.C2S_AddUpInfo_18601.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityType()) {
                  this.setActivityType(other.getActivityType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasActivityType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_AddUpInfo_18601 parsedMessage = null;

            try {
               parsedMessage = (C2S_AddUpInfo_18601)AddUpAndConRechargeMsg.C2S_AddUpInfo_18601.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AddUpInfo_18601)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasActivityType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getActivityType() {
            return this.activityType_;
         }

         public Builder setActivityType(int value) {
            this.bitField0_ |= 1;
            this.activityType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityType() {
            this.bitField0_ &= -2;
            this.activityType_ = 0;
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

   public static final class S2C_AddUpInfo_18602 extends GeneratedMessageV3 implements S2C_AddUpInfo_18602OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYTYPE_FIELD_NUMBER = 1;
      private int activityType_;
      public static final int GOTREWARDS_FIELD_NUMBER = 2;
      private Internal.IntList gotRewards_;
      public static final int STAGERECHARGE_FIELD_NUMBER = 3;
      private int stageRecharge_;
      public static final int STAGEENDTIME_FIELD_NUMBER = 4;
      private long stageEndTime_;
      public static final int STAGE_FIELD_NUMBER = 5;
      private int stage_;
      public static final int OPENDAY_FIELD_NUMBER = 6;
      private int openDay_;
      private byte memoizedIsInitialized;
      private static final S2C_AddUpInfo_18602 DEFAULT_INSTANCE = new S2C_AddUpInfo_18602();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AddUpInfo_18602> PARSER = new AbstractParser<S2C_AddUpInfo_18602>() {
         public S2C_AddUpInfo_18602 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AddUpInfo_18602(input, extensionRegistry);
         }
      };

      private S2C_AddUpInfo_18602(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AddUpInfo_18602() {
         this.memoizedIsInitialized = -1;
         this.gotRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AddUpInfo_18602();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AddUpInfo_18602(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.activityType_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.gotRewards_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.gotRewards_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotRewards_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.stageRecharge_ = input.readInt32();
                        continue;
                     case 32:
                        this.bitField0_ |= 4;
                        this.stageEndTime_ = input.readInt64();
                        continue;
                     case 40:
                        this.bitField0_ |= 8;
                        this.stage_ = input.readInt32();
                        continue;
                     case 48:
                        this.bitField0_ |= 16;
                        this.openDay_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.gotRewards_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.gotRewards_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_S2C_AddUpInfo_18602_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_S2C_AddUpInfo_18602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AddUpInfo_18602.class, Builder.class);
      }

      public boolean hasActivityType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityType() {
         return this.activityType_;
      }

      public List<Integer> getGotRewardsList() {
         return this.gotRewards_;
      }

      public int getGotRewardsCount() {
         return this.gotRewards_.size();
      }

      public int getGotRewards(int index) {
         return this.gotRewards_.getInt(index);
      }

      public boolean hasStageRecharge() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStageRecharge() {
         return this.stageRecharge_;
      }

      public boolean hasStageEndTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getStageEndTime() {
         return this.stageEndTime_;
      }

      public boolean hasStage() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public boolean hasOpenDay() {
         return (this.bitField0_ & 16) != 0;
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
         } else if (!this.hasActivityType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStageRecharge()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStageEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.activityType_);
         }

         for(int i = 0; i < this.gotRewards_.size(); ++i) {
            output.writeInt32(2, this.gotRewards_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.stageRecharge_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(4, this.stageEndTime_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.stage_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(6, this.openDay_);
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
               size += CodedOutputStream.computeInt32Size(1, this.activityType_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotRewards_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotRewards_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotRewardsList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.stageRecharge_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(4, this.stageEndTime_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.stage_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.openDay_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_AddUpInfo_18602)) {
            return super.equals(obj);
         } else {
            S2C_AddUpInfo_18602 other = (S2C_AddUpInfo_18602)obj;
            if (this.hasActivityType() != other.hasActivityType()) {
               return false;
            } else if (this.hasActivityType() && this.getActivityType() != other.getActivityType()) {
               return false;
            } else if (!this.getGotRewardsList().equals(other.getGotRewardsList())) {
               return false;
            } else if (this.hasStageRecharge() != other.hasStageRecharge()) {
               return false;
            } else if (this.hasStageRecharge() && this.getStageRecharge() != other.getStageRecharge()) {
               return false;
            } else if (this.hasStageEndTime() != other.hasStageEndTime()) {
               return false;
            } else if (this.hasStageEndTime() && this.getStageEndTime() != other.getStageEndTime()) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else if (this.hasOpenDay() != other.hasOpenDay()) {
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
            if (this.hasActivityType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getActivityType();
            }

            if (this.getGotRewardsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGotRewardsList().hashCode();
            }

            if (this.hasStageRecharge()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStageRecharge();
            }

            if (this.hasStageEndTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashLong(this.getStageEndTime());
            }

            if (this.hasStage()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getStage();
            }

            if (this.hasOpenDay()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getOpenDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_AddUpInfo_18602 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AddUpInfo_18602)PARSER.parseFrom(data);
      }

      public static S2C_AddUpInfo_18602 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AddUpInfo_18602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AddUpInfo_18602 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AddUpInfo_18602)PARSER.parseFrom(data);
      }

      public static S2C_AddUpInfo_18602 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AddUpInfo_18602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AddUpInfo_18602 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AddUpInfo_18602)PARSER.parseFrom(data);
      }

      public static S2C_AddUpInfo_18602 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AddUpInfo_18602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AddUpInfo_18602 parseFrom(InputStream input) throws IOException {
         return (S2C_AddUpInfo_18602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AddUpInfo_18602 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AddUpInfo_18602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AddUpInfo_18602 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AddUpInfo_18602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AddUpInfo_18602 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AddUpInfo_18602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AddUpInfo_18602 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AddUpInfo_18602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AddUpInfo_18602 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AddUpInfo_18602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AddUpInfo_18602 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AddUpInfo_18602 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AddUpInfo_18602> parser() {
         return PARSER;
      }

      public Parser<S2C_AddUpInfo_18602> getParserForType() {
         return PARSER;
      }

      public S2C_AddUpInfo_18602 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AddUpInfo_18602OrBuilder {
         private int bitField0_;
         private int activityType_;
         private Internal.IntList gotRewards_;
         private int stageRecharge_;
         private long stageEndTime_;
         private int stage_;
         private int openDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_S2C_AddUpInfo_18602_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_S2C_AddUpInfo_18602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AddUpInfo_18602.class, Builder.class);
         }

         private Builder() {
            this.gotRewards_ = AddUpAndConRechargeMsg.S2C_AddUpInfo_18602.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotRewards_ = AddUpAndConRechargeMsg.S2C_AddUpInfo_18602.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AddUpAndConRechargeMsg.S2C_AddUpInfo_18602.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityType_ = 0;
            this.bitField0_ &= -2;
            this.gotRewards_ = AddUpAndConRechargeMsg.S2C_AddUpInfo_18602.emptyIntList();
            this.bitField0_ &= -3;
            this.stageRecharge_ = 0;
            this.bitField0_ &= -5;
            this.stageEndTime_ = 0L;
            this.bitField0_ &= -9;
            this.stage_ = 0;
            this.bitField0_ &= -17;
            this.openDay_ = 0;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_S2C_AddUpInfo_18602_descriptor;
         }

         public S2C_AddUpInfo_18602 getDefaultInstanceForType() {
            return AddUpAndConRechargeMsg.S2C_AddUpInfo_18602.getDefaultInstance();
         }

         public S2C_AddUpInfo_18602 build() {
            S2C_AddUpInfo_18602 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AddUpInfo_18602 buildPartial() {
            S2C_AddUpInfo_18602 result = new S2C_AddUpInfo_18602(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityType_ = this.activityType_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.gotRewards_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.gotRewards_ = this.gotRewards_;
            if ((from_bitField0_ & 4) != 0) {
               result.stageRecharge_ = this.stageRecharge_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.stageEndTime_ = this.stageEndTime_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.stage_ = this.stage_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.openDay_ = this.openDay_;
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
            if (other instanceof S2C_AddUpInfo_18602) {
               return this.mergeFrom((S2C_AddUpInfo_18602)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AddUpInfo_18602 other) {
            if (other == AddUpAndConRechargeMsg.S2C_AddUpInfo_18602.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityType()) {
                  this.setActivityType(other.getActivityType());
               }

               if (!other.gotRewards_.isEmpty()) {
                  if (this.gotRewards_.isEmpty()) {
                     this.gotRewards_ = other.gotRewards_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureGotRewardsIsMutable();
                     this.gotRewards_.addAll(other.gotRewards_);
                  }

                  this.onChanged();
               }

               if (other.hasStageRecharge()) {
                  this.setStageRecharge(other.getStageRecharge());
               }

               if (other.hasStageEndTime()) {
                  this.setStageEndTime(other.getStageEndTime());
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               if (other.hasOpenDay()) {
                  this.setOpenDay(other.getOpenDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActivityType()) {
               return false;
            } else if (!this.hasStageRecharge()) {
               return false;
            } else if (!this.hasStageEndTime()) {
               return false;
            } else if (!this.hasStage()) {
               return false;
            } else {
               return this.hasOpenDay();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_AddUpInfo_18602 parsedMessage = null;

            try {
               parsedMessage = (S2C_AddUpInfo_18602)AddUpAndConRechargeMsg.S2C_AddUpInfo_18602.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AddUpInfo_18602)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasActivityType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getActivityType() {
            return this.activityType_;
         }

         public Builder setActivityType(int value) {
            this.bitField0_ |= 1;
            this.activityType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityType() {
            this.bitField0_ &= -2;
            this.activityType_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGotRewardsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.gotRewards_ = AddUpAndConRechargeMsg.S2C_AddUpInfo_18602.mutableCopy(this.gotRewards_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getGotRewardsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.gotRewards_) : this.gotRewards_);
         }

         public int getGotRewardsCount() {
            return this.gotRewards_.size();
         }

         public int getGotRewards(int index) {
            return this.gotRewards_.getInt(index);
         }

         public Builder setGotRewards(int index, int value) {
            this.ensureGotRewardsIsMutable();
            this.gotRewards_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotRewards(int value) {
            this.ensureGotRewardsIsMutable();
            this.gotRewards_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotRewards(Iterable<? extends Integer> values) {
            this.ensureGotRewardsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotRewards_);
            this.onChanged();
            return this;
         }

         public Builder clearGotRewards() {
            this.gotRewards_ = AddUpAndConRechargeMsg.S2C_AddUpInfo_18602.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasStageRecharge() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getStageRecharge() {
            return this.stageRecharge_;
         }

         public Builder setStageRecharge(int value) {
            this.bitField0_ |= 4;
            this.stageRecharge_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageRecharge() {
            this.bitField0_ &= -5;
            this.stageRecharge_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStageEndTime() {
            return (this.bitField0_ & 8) != 0;
         }

         public long getStageEndTime() {
            return this.stageEndTime_;
         }

         public Builder setStageEndTime(long value) {
            this.bitField0_ |= 8;
            this.stageEndTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageEndTime() {
            this.bitField0_ &= -9;
            this.stageEndTime_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 16;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -17;
            this.stage_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOpenDay() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getOpenDay() {
            return this.openDay_;
         }

         public Builder setOpenDay(int value) {
            this.bitField0_ |= 32;
            this.openDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpenDay() {
            this.bitField0_ &= -33;
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

   public static final class C2S_ReceiveAddUpReward_18603 extends GeneratedMessageV3 implements C2S_ReceiveAddUpReward_18603OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYTYPE_FIELD_NUMBER = 1;
      private int activityType_;
      public static final int REWARDID_FIELD_NUMBER = 2;
      private int rewardId_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveAddUpReward_18603 DEFAULT_INSTANCE = new C2S_ReceiveAddUpReward_18603();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveAddUpReward_18603> PARSER = new AbstractParser<C2S_ReceiveAddUpReward_18603>() {
         public C2S_ReceiveAddUpReward_18603 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveAddUpReward_18603(input, extensionRegistry);
         }
      };

      private C2S_ReceiveAddUpReward_18603(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveAddUpReward_18603() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveAddUpReward_18603();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveAddUpReward_18603(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.activityType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.rewardId_ = input.readInt32();
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
         return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ReceiveAddUpReward_18603_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ReceiveAddUpReward_18603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveAddUpReward_18603.class, Builder.class);
      }

      public boolean hasActivityType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityType() {
         return this.activityType_;
      }

      public boolean hasRewardId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRewardId() {
         return this.rewardId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasActivityType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRewardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.activityType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.rewardId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.activityType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.rewardId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ReceiveAddUpReward_18603)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveAddUpReward_18603 other = (C2S_ReceiveAddUpReward_18603)obj;
            if (this.hasActivityType() != other.hasActivityType()) {
               return false;
            } else if (this.hasActivityType() && this.getActivityType() != other.getActivityType()) {
               return false;
            } else if (this.hasRewardId() != other.hasRewardId()) {
               return false;
            } else if (this.hasRewardId() && this.getRewardId() != other.getRewardId()) {
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
            if (this.hasActivityType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getActivityType();
            }

            if (this.hasRewardId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRewardId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ReceiveAddUpReward_18603 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAddUpReward_18603)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveAddUpReward_18603 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAddUpReward_18603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveAddUpReward_18603 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAddUpReward_18603)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveAddUpReward_18603 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAddUpReward_18603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveAddUpReward_18603 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAddUpReward_18603)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveAddUpReward_18603 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAddUpReward_18603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveAddUpReward_18603 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveAddUpReward_18603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveAddUpReward_18603 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveAddUpReward_18603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveAddUpReward_18603 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveAddUpReward_18603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveAddUpReward_18603 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveAddUpReward_18603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveAddUpReward_18603 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveAddUpReward_18603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveAddUpReward_18603 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveAddUpReward_18603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveAddUpReward_18603 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveAddUpReward_18603 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveAddUpReward_18603> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveAddUpReward_18603> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveAddUpReward_18603 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveAddUpReward_18603OrBuilder {
         private int bitField0_;
         private int activityType_;
         private int rewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ReceiveAddUpReward_18603_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ReceiveAddUpReward_18603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveAddUpReward_18603.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AddUpAndConRechargeMsg.C2S_ReceiveAddUpReward_18603.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityType_ = 0;
            this.bitField0_ &= -2;
            this.rewardId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ReceiveAddUpReward_18603_descriptor;
         }

         public C2S_ReceiveAddUpReward_18603 getDefaultInstanceForType() {
            return AddUpAndConRechargeMsg.C2S_ReceiveAddUpReward_18603.getDefaultInstance();
         }

         public C2S_ReceiveAddUpReward_18603 build() {
            C2S_ReceiveAddUpReward_18603 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveAddUpReward_18603 buildPartial() {
            C2S_ReceiveAddUpReward_18603 result = new C2S_ReceiveAddUpReward_18603(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityType_ = this.activityType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.rewardId_ = this.rewardId_;
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
            if (other instanceof C2S_ReceiveAddUpReward_18603) {
               return this.mergeFrom((C2S_ReceiveAddUpReward_18603)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveAddUpReward_18603 other) {
            if (other == AddUpAndConRechargeMsg.C2S_ReceiveAddUpReward_18603.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityType()) {
                  this.setActivityType(other.getActivityType());
               }

               if (other.hasRewardId()) {
                  this.setRewardId(other.getRewardId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActivityType()) {
               return false;
            } else {
               return this.hasRewardId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ReceiveAddUpReward_18603 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveAddUpReward_18603)AddUpAndConRechargeMsg.C2S_ReceiveAddUpReward_18603.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveAddUpReward_18603)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasActivityType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getActivityType() {
            return this.activityType_;
         }

         public Builder setActivityType(int value) {
            this.bitField0_ |= 1;
            this.activityType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityType() {
            this.bitField0_ &= -2;
            this.activityType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRewardId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRewardId() {
            return this.rewardId_;
         }

         public Builder setRewardId(int value) {
            this.bitField0_ |= 2;
            this.rewardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardId() {
            this.bitField0_ &= -3;
            this.rewardId_ = 0;
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

   public static final class C2S_ConInfo_18604 extends GeneratedMessageV3 implements C2S_ConInfo_18604OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYTYPE_FIELD_NUMBER = 1;
      private int activityType_;
      private byte memoizedIsInitialized;
      private static final C2S_ConInfo_18604 DEFAULT_INSTANCE = new C2S_ConInfo_18604();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ConInfo_18604> PARSER = new AbstractParser<C2S_ConInfo_18604>() {
         public C2S_ConInfo_18604 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ConInfo_18604(input, extensionRegistry);
         }
      };

      private C2S_ConInfo_18604(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ConInfo_18604() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ConInfo_18604();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ConInfo_18604(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.activityType_ = input.readInt32();
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
         return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ConInfo_18604_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ConInfo_18604_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ConInfo_18604.class, Builder.class);
      }

      public boolean hasActivityType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityType() {
         return this.activityType_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasActivityType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.activityType_);
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
               size += CodedOutputStream.computeInt32Size(1, this.activityType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ConInfo_18604)) {
            return super.equals(obj);
         } else {
            C2S_ConInfo_18604 other = (C2S_ConInfo_18604)obj;
            if (this.hasActivityType() != other.hasActivityType()) {
               return false;
            } else if (this.hasActivityType() && this.getActivityType() != other.getActivityType()) {
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
            if (this.hasActivityType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getActivityType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ConInfo_18604 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ConInfo_18604)PARSER.parseFrom(data);
      }

      public static C2S_ConInfo_18604 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ConInfo_18604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ConInfo_18604 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ConInfo_18604)PARSER.parseFrom(data);
      }

      public static C2S_ConInfo_18604 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ConInfo_18604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ConInfo_18604 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ConInfo_18604)PARSER.parseFrom(data);
      }

      public static C2S_ConInfo_18604 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ConInfo_18604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ConInfo_18604 parseFrom(InputStream input) throws IOException {
         return (C2S_ConInfo_18604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ConInfo_18604 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ConInfo_18604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ConInfo_18604 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ConInfo_18604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ConInfo_18604 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ConInfo_18604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ConInfo_18604 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ConInfo_18604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ConInfo_18604 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ConInfo_18604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ConInfo_18604 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ConInfo_18604 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ConInfo_18604> parser() {
         return PARSER;
      }

      public Parser<C2S_ConInfo_18604> getParserForType() {
         return PARSER;
      }

      public C2S_ConInfo_18604 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ConInfo_18604OrBuilder {
         private int bitField0_;
         private int activityType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ConInfo_18604_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ConInfo_18604_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ConInfo_18604.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AddUpAndConRechargeMsg.C2S_ConInfo_18604.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityType_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ConInfo_18604_descriptor;
         }

         public C2S_ConInfo_18604 getDefaultInstanceForType() {
            return AddUpAndConRechargeMsg.C2S_ConInfo_18604.getDefaultInstance();
         }

         public C2S_ConInfo_18604 build() {
            C2S_ConInfo_18604 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ConInfo_18604 buildPartial() {
            C2S_ConInfo_18604 result = new C2S_ConInfo_18604(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityType_ = this.activityType_;
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
            if (other instanceof C2S_ConInfo_18604) {
               return this.mergeFrom((C2S_ConInfo_18604)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ConInfo_18604 other) {
            if (other == AddUpAndConRechargeMsg.C2S_ConInfo_18604.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityType()) {
                  this.setActivityType(other.getActivityType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasActivityType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ConInfo_18604 parsedMessage = null;

            try {
               parsedMessage = (C2S_ConInfo_18604)AddUpAndConRechargeMsg.C2S_ConInfo_18604.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ConInfo_18604)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasActivityType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getActivityType() {
            return this.activityType_;
         }

         public Builder setActivityType(int value) {
            this.bitField0_ |= 1;
            this.activityType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityType() {
            this.bitField0_ &= -2;
            this.activityType_ = 0;
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

   public static final class S2C_ConInfo_18605 extends GeneratedMessageV3 implements S2C_ConInfo_18605OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYTYPE_FIELD_NUMBER = 1;
      private int activityType_;
      public static final int UNLOCKSTAGENUM_FIELD_NUMBER = 2;
      private int unlockStageNum_;
      public static final int CANRECEIVEREWARDIDS_FIELD_NUMBER = 3;
      private Internal.IntList canReceiveRewardIds_;
      public static final int HASRECEIVEREWARDIDS_FIELD_NUMBER = 4;
      private Internal.IntList hasReceiveRewardIds_;
      public static final int NEXTUNLOCKRECEIVEREWARD_FIELD_NUMBER = 5;
      private List<NextUnlockReceiveReward> nextUnlockReceiveReward_;
      private byte memoizedIsInitialized;
      private static final S2C_ConInfo_18605 DEFAULT_INSTANCE = new S2C_ConInfo_18605();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ConInfo_18605> PARSER = new AbstractParser<S2C_ConInfo_18605>() {
         public S2C_ConInfo_18605 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ConInfo_18605(input, extensionRegistry);
         }
      };

      private S2C_ConInfo_18605(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ConInfo_18605() {
         this.memoizedIsInitialized = -1;
         this.canReceiveRewardIds_ = emptyIntList();
         this.hasReceiveRewardIds_ = emptyIntList();
         this.nextUnlockReceiveReward_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ConInfo_18605();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ConInfo_18605(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.activityType_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.unlockStageNum_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.canReceiveRewardIds_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.canReceiveRewardIds_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.canReceiveRewardIds_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.hasReceiveRewardIds_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.hasReceiveRewardIds_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.hasReceiveRewardIds_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.hasReceiveRewardIds_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.nextUnlockReceiveReward_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.nextUnlockReceiveReward_.add(input.readMessage(AddUpAndConRechargeMsg.NextUnlockReceiveReward.PARSER, extensionRegistry));
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.canReceiveRewardIds_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.canReceiveRewardIds_.makeImmutable();
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.hasReceiveRewardIds_.makeImmutable();
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.nextUnlockReceiveReward_ = Collections.unmodifiableList(this.nextUnlockReceiveReward_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_S2C_ConInfo_18605_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_S2C_ConInfo_18605_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ConInfo_18605.class, Builder.class);
      }

      public boolean hasActivityType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityType() {
         return this.activityType_;
      }

      public boolean hasUnlockStageNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getUnlockStageNum() {
         return this.unlockStageNum_;
      }

      public List<Integer> getCanReceiveRewardIdsList() {
         return this.canReceiveRewardIds_;
      }

      public int getCanReceiveRewardIdsCount() {
         return this.canReceiveRewardIds_.size();
      }

      public int getCanReceiveRewardIds(int index) {
         return this.canReceiveRewardIds_.getInt(index);
      }

      public List<Integer> getHasReceiveRewardIdsList() {
         return this.hasReceiveRewardIds_;
      }

      public int getHasReceiveRewardIdsCount() {
         return this.hasReceiveRewardIds_.size();
      }

      public int getHasReceiveRewardIds(int index) {
         return this.hasReceiveRewardIds_.getInt(index);
      }

      public List<NextUnlockReceiveReward> getNextUnlockReceiveRewardList() {
         return this.nextUnlockReceiveReward_;
      }

      public List<? extends NextUnlockReceiveRewardOrBuilder> getNextUnlockReceiveRewardOrBuilderList() {
         return this.nextUnlockReceiveReward_;
      }

      public int getNextUnlockReceiveRewardCount() {
         return this.nextUnlockReceiveReward_.size();
      }

      public NextUnlockReceiveReward getNextUnlockReceiveReward(int index) {
         return (NextUnlockReceiveReward)this.nextUnlockReceiveReward_.get(index);
      }

      public NextUnlockReceiveRewardOrBuilder getNextUnlockReceiveRewardOrBuilder(int index) {
         return (NextUnlockReceiveRewardOrBuilder)this.nextUnlockReceiveReward_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasActivityType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasUnlockStageNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getNextUnlockReceiveRewardCount(); ++i) {
               if (!this.getNextUnlockReceiveReward(i).isInitialized()) {
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
            output.writeInt32(1, this.activityType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.unlockStageNum_);
         }

         for(int i = 0; i < this.canReceiveRewardIds_.size(); ++i) {
            output.writeInt32(3, this.canReceiveRewardIds_.getInt(i));
         }

         for(int i = 0; i < this.hasReceiveRewardIds_.size(); ++i) {
            output.writeInt32(4, this.hasReceiveRewardIds_.getInt(i));
         }

         for(int i = 0; i < this.nextUnlockReceiveReward_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.nextUnlockReceiveReward_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.activityType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.unlockStageNum_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.canReceiveRewardIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.canReceiveRewardIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCanReceiveRewardIdsList().size();
            dataSize = 0;

            for(int i = 0; i < this.hasReceiveRewardIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.hasReceiveRewardIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHasReceiveRewardIdsList().size();

            for(int i = 0; i < this.nextUnlockReceiveReward_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.nextUnlockReceiveReward_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ConInfo_18605)) {
            return super.equals(obj);
         } else {
            S2C_ConInfo_18605 other = (S2C_ConInfo_18605)obj;
            if (this.hasActivityType() != other.hasActivityType()) {
               return false;
            } else if (this.hasActivityType() && this.getActivityType() != other.getActivityType()) {
               return false;
            } else if (this.hasUnlockStageNum() != other.hasUnlockStageNum()) {
               return false;
            } else if (this.hasUnlockStageNum() && this.getUnlockStageNum() != other.getUnlockStageNum()) {
               return false;
            } else if (!this.getCanReceiveRewardIdsList().equals(other.getCanReceiveRewardIdsList())) {
               return false;
            } else if (!this.getHasReceiveRewardIdsList().equals(other.getHasReceiveRewardIdsList())) {
               return false;
            } else if (!this.getNextUnlockReceiveRewardList().equals(other.getNextUnlockReceiveRewardList())) {
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
            if (this.hasActivityType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getActivityType();
            }

            if (this.hasUnlockStageNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getUnlockStageNum();
            }

            if (this.getCanReceiveRewardIdsCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCanReceiveRewardIdsList().hashCode();
            }

            if (this.getHasReceiveRewardIdsCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHasReceiveRewardIdsList().hashCode();
            }

            if (this.getNextUnlockReceiveRewardCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getNextUnlockReceiveRewardList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ConInfo_18605 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ConInfo_18605)PARSER.parseFrom(data);
      }

      public static S2C_ConInfo_18605 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ConInfo_18605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ConInfo_18605 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ConInfo_18605)PARSER.parseFrom(data);
      }

      public static S2C_ConInfo_18605 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ConInfo_18605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ConInfo_18605 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ConInfo_18605)PARSER.parseFrom(data);
      }

      public static S2C_ConInfo_18605 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ConInfo_18605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ConInfo_18605 parseFrom(InputStream input) throws IOException {
         return (S2C_ConInfo_18605)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ConInfo_18605 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ConInfo_18605)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ConInfo_18605 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ConInfo_18605)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ConInfo_18605 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ConInfo_18605)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ConInfo_18605 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ConInfo_18605)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ConInfo_18605 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ConInfo_18605)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ConInfo_18605 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ConInfo_18605 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ConInfo_18605> parser() {
         return PARSER;
      }

      public Parser<S2C_ConInfo_18605> getParserForType() {
         return PARSER;
      }

      public S2C_ConInfo_18605 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ConInfo_18605OrBuilder {
         private int bitField0_;
         private int activityType_;
         private int unlockStageNum_;
         private Internal.IntList canReceiveRewardIds_;
         private Internal.IntList hasReceiveRewardIds_;
         private List<NextUnlockReceiveReward> nextUnlockReceiveReward_;
         private RepeatedFieldBuilderV3<NextUnlockReceiveReward, NextUnlockReceiveReward.Builder, NextUnlockReceiveRewardOrBuilder> nextUnlockReceiveRewardBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_S2C_ConInfo_18605_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_S2C_ConInfo_18605_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ConInfo_18605.class, Builder.class);
         }

         private Builder() {
            this.canReceiveRewardIds_ = AddUpAndConRechargeMsg.S2C_ConInfo_18605.emptyIntList();
            this.hasReceiveRewardIds_ = AddUpAndConRechargeMsg.S2C_ConInfo_18605.emptyIntList();
            this.nextUnlockReceiveReward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.canReceiveRewardIds_ = AddUpAndConRechargeMsg.S2C_ConInfo_18605.emptyIntList();
            this.hasReceiveRewardIds_ = AddUpAndConRechargeMsg.S2C_ConInfo_18605.emptyIntList();
            this.nextUnlockReceiveReward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AddUpAndConRechargeMsg.S2C_ConInfo_18605.alwaysUseFieldBuilders) {
               this.getNextUnlockReceiveRewardFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.activityType_ = 0;
            this.bitField0_ &= -2;
            this.unlockStageNum_ = 0;
            this.bitField0_ &= -3;
            this.canReceiveRewardIds_ = AddUpAndConRechargeMsg.S2C_ConInfo_18605.emptyIntList();
            this.bitField0_ &= -5;
            this.hasReceiveRewardIds_ = AddUpAndConRechargeMsg.S2C_ConInfo_18605.emptyIntList();
            this.bitField0_ &= -9;
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.nextUnlockReceiveReward_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.nextUnlockReceiveRewardBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_S2C_ConInfo_18605_descriptor;
         }

         public S2C_ConInfo_18605 getDefaultInstanceForType() {
            return AddUpAndConRechargeMsg.S2C_ConInfo_18605.getDefaultInstance();
         }

         public S2C_ConInfo_18605 build() {
            S2C_ConInfo_18605 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ConInfo_18605 buildPartial() {
            S2C_ConInfo_18605 result = new S2C_ConInfo_18605(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityType_ = this.activityType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.unlockStageNum_ = this.unlockStageNum_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.canReceiveRewardIds_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.canReceiveRewardIds_ = this.canReceiveRewardIds_;
            if ((this.bitField0_ & 8) != 0) {
               this.hasReceiveRewardIds_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.hasReceiveRewardIds_ = this.hasReceiveRewardIds_;
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.nextUnlockReceiveReward_ = Collections.unmodifiableList(this.nextUnlockReceiveReward_);
                  this.bitField0_ &= -17;
               }

               result.nextUnlockReceiveReward_ = this.nextUnlockReceiveReward_;
            } else {
               result.nextUnlockReceiveReward_ = this.nextUnlockReceiveRewardBuilder_.build();
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
            if (other instanceof S2C_ConInfo_18605) {
               return this.mergeFrom((S2C_ConInfo_18605)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ConInfo_18605 other) {
            if (other == AddUpAndConRechargeMsg.S2C_ConInfo_18605.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityType()) {
                  this.setActivityType(other.getActivityType());
               }

               if (other.hasUnlockStageNum()) {
                  this.setUnlockStageNum(other.getUnlockStageNum());
               }

               if (!other.canReceiveRewardIds_.isEmpty()) {
                  if (this.canReceiveRewardIds_.isEmpty()) {
                     this.canReceiveRewardIds_ = other.canReceiveRewardIds_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureCanReceiveRewardIdsIsMutable();
                     this.canReceiveRewardIds_.addAll(other.canReceiveRewardIds_);
                  }

                  this.onChanged();
               }

               if (!other.hasReceiveRewardIds_.isEmpty()) {
                  if (this.hasReceiveRewardIds_.isEmpty()) {
                     this.hasReceiveRewardIds_ = other.hasReceiveRewardIds_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureHasReceiveRewardIdsIsMutable();
                     this.hasReceiveRewardIds_.addAll(other.hasReceiveRewardIds_);
                  }

                  this.onChanged();
               }

               if (this.nextUnlockReceiveRewardBuilder_ == null) {
                  if (!other.nextUnlockReceiveReward_.isEmpty()) {
                     if (this.nextUnlockReceiveReward_.isEmpty()) {
                        this.nextUnlockReceiveReward_ = other.nextUnlockReceiveReward_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureNextUnlockReceiveRewardIsMutable();
                        this.nextUnlockReceiveReward_.addAll(other.nextUnlockReceiveReward_);
                     }

                     this.onChanged();
                  }
               } else if (!other.nextUnlockReceiveReward_.isEmpty()) {
                  if (this.nextUnlockReceiveRewardBuilder_.isEmpty()) {
                     this.nextUnlockReceiveRewardBuilder_.dispose();
                     this.nextUnlockReceiveRewardBuilder_ = null;
                     this.nextUnlockReceiveReward_ = other.nextUnlockReceiveReward_;
                     this.bitField0_ &= -17;
                     this.nextUnlockReceiveRewardBuilder_ = AddUpAndConRechargeMsg.S2C_ConInfo_18605.alwaysUseFieldBuilders ? this.getNextUnlockReceiveRewardFieldBuilder() : null;
                  } else {
                     this.nextUnlockReceiveRewardBuilder_.addAllMessages(other.nextUnlockReceiveReward_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActivityType()) {
               return false;
            } else if (!this.hasUnlockStageNum()) {
               return false;
            } else {
               for(int i = 0; i < this.getNextUnlockReceiveRewardCount(); ++i) {
                  if (!this.getNextUnlockReceiveReward(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ConInfo_18605 parsedMessage = null;

            try {
               parsedMessage = (S2C_ConInfo_18605)AddUpAndConRechargeMsg.S2C_ConInfo_18605.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ConInfo_18605)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasActivityType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getActivityType() {
            return this.activityType_;
         }

         public Builder setActivityType(int value) {
            this.bitField0_ |= 1;
            this.activityType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityType() {
            this.bitField0_ &= -2;
            this.activityType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnlockStageNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getUnlockStageNum() {
            return this.unlockStageNum_;
         }

         public Builder setUnlockStageNum(int value) {
            this.bitField0_ |= 2;
            this.unlockStageNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnlockStageNum() {
            this.bitField0_ &= -3;
            this.unlockStageNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureCanReceiveRewardIdsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.canReceiveRewardIds_ = AddUpAndConRechargeMsg.S2C_ConInfo_18605.mutableCopy(this.canReceiveRewardIds_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getCanReceiveRewardIdsList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.canReceiveRewardIds_) : this.canReceiveRewardIds_);
         }

         public int getCanReceiveRewardIdsCount() {
            return this.canReceiveRewardIds_.size();
         }

         public int getCanReceiveRewardIds(int index) {
            return this.canReceiveRewardIds_.getInt(index);
         }

         public Builder setCanReceiveRewardIds(int index, int value) {
            this.ensureCanReceiveRewardIdsIsMutable();
            this.canReceiveRewardIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCanReceiveRewardIds(int value) {
            this.ensureCanReceiveRewardIdsIsMutable();
            this.canReceiveRewardIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCanReceiveRewardIds(Iterable<? extends Integer> values) {
            this.ensureCanReceiveRewardIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.canReceiveRewardIds_);
            this.onChanged();
            return this;
         }

         public Builder clearCanReceiveRewardIds() {
            this.canReceiveRewardIds_ = AddUpAndConRechargeMsg.S2C_ConInfo_18605.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         private void ensureHasReceiveRewardIdsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.hasReceiveRewardIds_ = AddUpAndConRechargeMsg.S2C_ConInfo_18605.mutableCopy(this.hasReceiveRewardIds_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getHasReceiveRewardIdsList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.hasReceiveRewardIds_) : this.hasReceiveRewardIds_);
         }

         public int getHasReceiveRewardIdsCount() {
            return this.hasReceiveRewardIds_.size();
         }

         public int getHasReceiveRewardIds(int index) {
            return this.hasReceiveRewardIds_.getInt(index);
         }

         public Builder setHasReceiveRewardIds(int index, int value) {
            this.ensureHasReceiveRewardIdsIsMutable();
            this.hasReceiveRewardIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHasReceiveRewardIds(int value) {
            this.ensureHasReceiveRewardIdsIsMutable();
            this.hasReceiveRewardIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHasReceiveRewardIds(Iterable<? extends Integer> values) {
            this.ensureHasReceiveRewardIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.hasReceiveRewardIds_);
            this.onChanged();
            return this;
         }

         public Builder clearHasReceiveRewardIds() {
            this.hasReceiveRewardIds_ = AddUpAndConRechargeMsg.S2C_ConInfo_18605.emptyIntList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         private void ensureNextUnlockReceiveRewardIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.nextUnlockReceiveReward_ = new ArrayList(this.nextUnlockReceiveReward_);
               this.bitField0_ |= 16;
            }

         }

         public List<NextUnlockReceiveReward> getNextUnlockReceiveRewardList() {
            return this.nextUnlockReceiveRewardBuilder_ == null ? Collections.unmodifiableList(this.nextUnlockReceiveReward_) : this.nextUnlockReceiveRewardBuilder_.getMessageList();
         }

         public int getNextUnlockReceiveRewardCount() {
            return this.nextUnlockReceiveRewardBuilder_ == null ? this.nextUnlockReceiveReward_.size() : this.nextUnlockReceiveRewardBuilder_.getCount();
         }

         public NextUnlockReceiveReward getNextUnlockReceiveReward(int index) {
            return this.nextUnlockReceiveRewardBuilder_ == null ? (NextUnlockReceiveReward)this.nextUnlockReceiveReward_.get(index) : (NextUnlockReceiveReward)this.nextUnlockReceiveRewardBuilder_.getMessage(index);
         }

         public Builder setNextUnlockReceiveReward(int index, NextUnlockReceiveReward value) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureNextUnlockReceiveRewardIsMutable();
               this.nextUnlockReceiveReward_.set(index, value);
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setNextUnlockReceiveReward(int index, NextUnlockReceiveReward.Builder builderForValue) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.ensureNextUnlockReceiveRewardIsMutable();
               this.nextUnlockReceiveReward_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addNextUnlockReceiveReward(NextUnlockReceiveReward value) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureNextUnlockReceiveRewardIsMutable();
               this.nextUnlockReceiveReward_.add(value);
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addNextUnlockReceiveReward(int index, NextUnlockReceiveReward value) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureNextUnlockReceiveRewardIsMutable();
               this.nextUnlockReceiveReward_.add(index, value);
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addNextUnlockReceiveReward(NextUnlockReceiveReward.Builder builderForValue) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.ensureNextUnlockReceiveRewardIsMutable();
               this.nextUnlockReceiveReward_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addNextUnlockReceiveReward(int index, NextUnlockReceiveReward.Builder builderForValue) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.ensureNextUnlockReceiveRewardIsMutable();
               this.nextUnlockReceiveReward_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllNextUnlockReceiveReward(Iterable<? extends NextUnlockReceiveReward> values) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.ensureNextUnlockReceiveRewardIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.nextUnlockReceiveReward_);
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearNextUnlockReceiveReward() {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.nextUnlockReceiveReward_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.clear();
            }

            return this;
         }

         public Builder removeNextUnlockReceiveReward(int index) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.ensureNextUnlockReceiveRewardIsMutable();
               this.nextUnlockReceiveReward_.remove(index);
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.remove(index);
            }

            return this;
         }

         public NextUnlockReceiveReward.Builder getNextUnlockReceiveRewardBuilder(int index) {
            return (NextUnlockReceiveReward.Builder)this.getNextUnlockReceiveRewardFieldBuilder().getBuilder(index);
         }

         public NextUnlockReceiveRewardOrBuilder getNextUnlockReceiveRewardOrBuilder(int index) {
            return this.nextUnlockReceiveRewardBuilder_ == null ? (NextUnlockReceiveRewardOrBuilder)this.nextUnlockReceiveReward_.get(index) : (NextUnlockReceiveRewardOrBuilder)this.nextUnlockReceiveRewardBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends NextUnlockReceiveRewardOrBuilder> getNextUnlockReceiveRewardOrBuilderList() {
            return this.nextUnlockReceiveRewardBuilder_ != null ? this.nextUnlockReceiveRewardBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.nextUnlockReceiveReward_);
         }

         public NextUnlockReceiveReward.Builder addNextUnlockReceiveRewardBuilder() {
            return (NextUnlockReceiveReward.Builder)this.getNextUnlockReceiveRewardFieldBuilder().addBuilder(AddUpAndConRechargeMsg.NextUnlockReceiveReward.getDefaultInstance());
         }

         public NextUnlockReceiveReward.Builder addNextUnlockReceiveRewardBuilder(int index) {
            return (NextUnlockReceiveReward.Builder)this.getNextUnlockReceiveRewardFieldBuilder().addBuilder(index, AddUpAndConRechargeMsg.NextUnlockReceiveReward.getDefaultInstance());
         }

         public List<NextUnlockReceiveReward.Builder> getNextUnlockReceiveRewardBuilderList() {
            return this.getNextUnlockReceiveRewardFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<NextUnlockReceiveReward, NextUnlockReceiveReward.Builder, NextUnlockReceiveRewardOrBuilder> getNextUnlockReceiveRewardFieldBuilder() {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.nextUnlockReceiveRewardBuilder_ = new RepeatedFieldBuilderV3(this.nextUnlockReceiveReward_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.nextUnlockReceiveReward_ = null;
            }

            return this.nextUnlockReceiveRewardBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ReceiveConReward_18606 extends GeneratedMessageV3 implements C2S_ReceiveConReward_18606OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYTYPE_FIELD_NUMBER = 1;
      private int activityType_;
      public static final int REWARDID_FIELD_NUMBER = 2;
      private int rewardId_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveConReward_18606 DEFAULT_INSTANCE = new C2S_ReceiveConReward_18606();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveConReward_18606> PARSER = new AbstractParser<C2S_ReceiveConReward_18606>() {
         public C2S_ReceiveConReward_18606 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveConReward_18606(input, extensionRegistry);
         }
      };

      private C2S_ReceiveConReward_18606(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveConReward_18606() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveConReward_18606();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveConReward_18606(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.activityType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.rewardId_ = input.readInt32();
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
         return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ReceiveConReward_18606_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ReceiveConReward_18606_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveConReward_18606.class, Builder.class);
      }

      public boolean hasActivityType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityType() {
         return this.activityType_;
      }

      public boolean hasRewardId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRewardId() {
         return this.rewardId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasActivityType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRewardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.activityType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.rewardId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.activityType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.rewardId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ReceiveConReward_18606)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveConReward_18606 other = (C2S_ReceiveConReward_18606)obj;
            if (this.hasActivityType() != other.hasActivityType()) {
               return false;
            } else if (this.hasActivityType() && this.getActivityType() != other.getActivityType()) {
               return false;
            } else if (this.hasRewardId() != other.hasRewardId()) {
               return false;
            } else if (this.hasRewardId() && this.getRewardId() != other.getRewardId()) {
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
            if (this.hasActivityType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getActivityType();
            }

            if (this.hasRewardId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRewardId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ReceiveConReward_18606 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveConReward_18606)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveConReward_18606 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveConReward_18606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveConReward_18606 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveConReward_18606)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveConReward_18606 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveConReward_18606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveConReward_18606 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveConReward_18606)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveConReward_18606 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveConReward_18606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveConReward_18606 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveConReward_18606)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveConReward_18606 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveConReward_18606)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveConReward_18606 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveConReward_18606)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveConReward_18606 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveConReward_18606)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveConReward_18606 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveConReward_18606)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveConReward_18606 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveConReward_18606)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveConReward_18606 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveConReward_18606 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveConReward_18606> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveConReward_18606> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveConReward_18606 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveConReward_18606OrBuilder {
         private int bitField0_;
         private int activityType_;
         private int rewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ReceiveConReward_18606_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ReceiveConReward_18606_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveConReward_18606.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AddUpAndConRechargeMsg.C2S_ReceiveConReward_18606.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityType_ = 0;
            this.bitField0_ &= -2;
            this.rewardId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_C2S_ReceiveConReward_18606_descriptor;
         }

         public C2S_ReceiveConReward_18606 getDefaultInstanceForType() {
            return AddUpAndConRechargeMsg.C2S_ReceiveConReward_18606.getDefaultInstance();
         }

         public C2S_ReceiveConReward_18606 build() {
            C2S_ReceiveConReward_18606 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveConReward_18606 buildPartial() {
            C2S_ReceiveConReward_18606 result = new C2S_ReceiveConReward_18606(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityType_ = this.activityType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.rewardId_ = this.rewardId_;
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
            if (other instanceof C2S_ReceiveConReward_18606) {
               return this.mergeFrom((C2S_ReceiveConReward_18606)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveConReward_18606 other) {
            if (other == AddUpAndConRechargeMsg.C2S_ReceiveConReward_18606.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityType()) {
                  this.setActivityType(other.getActivityType());
               }

               if (other.hasRewardId()) {
                  this.setRewardId(other.getRewardId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActivityType()) {
               return false;
            } else {
               return this.hasRewardId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ReceiveConReward_18606 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveConReward_18606)AddUpAndConRechargeMsg.C2S_ReceiveConReward_18606.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveConReward_18606)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasActivityType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getActivityType() {
            return this.activityType_;
         }

         public Builder setActivityType(int value) {
            this.bitField0_ |= 1;
            this.activityType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityType() {
            this.bitField0_ &= -2;
            this.activityType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRewardId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRewardId() {
            return this.rewardId_;
         }

         public Builder setRewardId(int value) {
            this.bitField0_ |= 2;
            this.rewardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardId() {
            this.bitField0_ &= -3;
            this.rewardId_ = 0;
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

   public static final class NextUnlockReceiveReward extends GeneratedMessageV3 implements NextUnlockReceiveRewardOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private int rewardId_;
      public static final int PROGRESS_FIELD_NUMBER = 2;
      private double progress_;
      private byte memoizedIsInitialized;
      private static final NextUnlockReceiveReward DEFAULT_INSTANCE = new NextUnlockReceiveReward();
      /** @deprecated */
      @Deprecated
      public static final Parser<NextUnlockReceiveReward> PARSER = new AbstractParser<NextUnlockReceiveReward>() {
         public NextUnlockReceiveReward parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new NextUnlockReceiveReward(input, extensionRegistry);
         }
      };

      private NextUnlockReceiveReward(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private NextUnlockReceiveReward() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new NextUnlockReceiveReward();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private NextUnlockReceiveReward(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rewardId_ = input.readInt32();
                        break;
                     case 17:
                        this.bitField0_ |= 2;
                        this.progress_ = input.readDouble();
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
         return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable.ensureFieldAccessorsInitialized(NextUnlockReceiveReward.class, Builder.class);
      }

      public boolean hasRewardId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRewardId() {
         return this.rewardId_;
      }

      public boolean hasProgress() {
         return (this.bitField0_ & 2) != 0;
      }

      public double getProgress() {
         return this.progress_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRewardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasProgress()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.rewardId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeDouble(2, this.progress_);
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
               size += CodedOutputStream.computeInt32Size(1, this.rewardId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeDoubleSize(2, this.progress_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof NextUnlockReceiveReward)) {
            return super.equals(obj);
         } else {
            NextUnlockReceiveReward other = (NextUnlockReceiveReward)obj;
            if (this.hasRewardId() != other.hasRewardId()) {
               return false;
            } else if (this.hasRewardId() && this.getRewardId() != other.getRewardId()) {
               return false;
            } else if (this.hasProgress() != other.hasProgress()) {
               return false;
            } else if (this.hasProgress() && Double.doubleToLongBits(this.getProgress()) != Double.doubleToLongBits(other.getProgress())) {
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
            if (this.hasRewardId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRewardId();
            }

            if (this.hasProgress()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(Double.doubleToLongBits(this.getProgress()));
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static NextUnlockReceiveReward parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (NextUnlockReceiveReward)PARSER.parseFrom(data);
      }

      public static NextUnlockReceiveReward parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (NextUnlockReceiveReward)PARSER.parseFrom(data, extensionRegistry);
      }

      public static NextUnlockReceiveReward parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (NextUnlockReceiveReward)PARSER.parseFrom(data);
      }

      public static NextUnlockReceiveReward parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (NextUnlockReceiveReward)PARSER.parseFrom(data, extensionRegistry);
      }

      public static NextUnlockReceiveReward parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (NextUnlockReceiveReward)PARSER.parseFrom(data);
      }

      public static NextUnlockReceiveReward parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (NextUnlockReceiveReward)PARSER.parseFrom(data, extensionRegistry);
      }

      public static NextUnlockReceiveReward parseFrom(InputStream input) throws IOException {
         return (NextUnlockReceiveReward)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static NextUnlockReceiveReward parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (NextUnlockReceiveReward)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static NextUnlockReceiveReward parseDelimitedFrom(InputStream input) throws IOException {
         return (NextUnlockReceiveReward)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static NextUnlockReceiveReward parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (NextUnlockReceiveReward)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static NextUnlockReceiveReward parseFrom(CodedInputStream input) throws IOException {
         return (NextUnlockReceiveReward)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static NextUnlockReceiveReward parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (NextUnlockReceiveReward)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(NextUnlockReceiveReward prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static NextUnlockReceiveReward getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<NextUnlockReceiveReward> parser() {
         return PARSER;
      }

      public Parser<NextUnlockReceiveReward> getParserForType() {
         return PARSER;
      }

      public NextUnlockReceiveReward getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NextUnlockReceiveRewardOrBuilder {
         private int bitField0_;
         private int rewardId_;
         private double progress_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable.ensureFieldAccessorsInitialized(NextUnlockReceiveReward.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AddUpAndConRechargeMsg.NextUnlockReceiveReward.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = 0;
            this.bitField0_ &= -2;
            this.progress_ = (double)0.0F;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AddUpAndConRechargeMsg.internal_static_addUpAndConRecharge_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
         }

         public NextUnlockReceiveReward getDefaultInstanceForType() {
            return AddUpAndConRechargeMsg.NextUnlockReceiveReward.getDefaultInstance();
         }

         public NextUnlockReceiveReward build() {
            NextUnlockReceiveReward result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public NextUnlockReceiveReward buildPartial() {
            NextUnlockReceiveReward result = new NextUnlockReceiveReward(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rewardId_ = this.rewardId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.progress_ = this.progress_;
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
            if (other instanceof NextUnlockReceiveReward) {
               return this.mergeFrom((NextUnlockReceiveReward)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(NextUnlockReceiveReward other) {
            if (other == AddUpAndConRechargeMsg.NextUnlockReceiveReward.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRewardId()) {
                  this.setRewardId(other.getRewardId());
               }

               if (other.hasProgress()) {
                  this.setProgress(other.getProgress());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRewardId()) {
               return false;
            } else {
               return this.hasProgress();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            NextUnlockReceiveReward parsedMessage = null;

            try {
               parsedMessage = (NextUnlockReceiveReward)AddUpAndConRechargeMsg.NextUnlockReceiveReward.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (NextUnlockReceiveReward)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRewardId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRewardId() {
            return this.rewardId_;
         }

         public Builder setRewardId(int value) {
            this.bitField0_ |= 1;
            this.rewardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardId() {
            this.bitField0_ &= -2;
            this.rewardId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasProgress() {
            return (this.bitField0_ & 2) != 0;
         }

         public double getProgress() {
            return this.progress_;
         }

         public Builder setProgress(double value) {
            this.bitField0_ |= 2;
            this.progress_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearProgress() {
            this.bitField0_ &= -3;
            this.progress_ = (double)0.0F;
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

   public interface C2S_AddUpInfo_18601OrBuilder extends MessageOrBuilder {
      boolean hasActivityType();

      int getActivityType();
   }

   public interface C2S_ConInfo_18604OrBuilder extends MessageOrBuilder {
      boolean hasActivityType();

      int getActivityType();
   }

   public interface C2S_ReceiveAddUpReward_18603OrBuilder extends MessageOrBuilder {
      boolean hasActivityType();

      int getActivityType();

      boolean hasRewardId();

      int getRewardId();
   }

   public interface C2S_ReceiveConReward_18606OrBuilder extends MessageOrBuilder {
      boolean hasActivityType();

      int getActivityType();

      boolean hasRewardId();

      int getRewardId();
   }

   public interface NextUnlockReceiveRewardOrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();

      boolean hasProgress();

      double getProgress();
   }

   public interface S2C_AddUpInfo_18602OrBuilder extends MessageOrBuilder {
      boolean hasActivityType();

      int getActivityType();

      List<Integer> getGotRewardsList();

      int getGotRewardsCount();

      int getGotRewards(int index);

      boolean hasStageRecharge();

      int getStageRecharge();

      boolean hasStageEndTime();

      long getStageEndTime();

      boolean hasStage();

      int getStage();

      boolean hasOpenDay();

      int getOpenDay();
   }

   public interface S2C_ConInfo_18605OrBuilder extends MessageOrBuilder {
      boolean hasActivityType();

      int getActivityType();

      boolean hasUnlockStageNum();

      int getUnlockStageNum();

      List<Integer> getCanReceiveRewardIdsList();

      int getCanReceiveRewardIdsCount();

      int getCanReceiveRewardIds(int index);

      List<Integer> getHasReceiveRewardIdsList();

      int getHasReceiveRewardIdsCount();

      int getHasReceiveRewardIds(int index);

      List<NextUnlockReceiveReward> getNextUnlockReceiveRewardList();

      NextUnlockReceiveReward getNextUnlockReceiveReward(int index);

      int getNextUnlockReceiveRewardCount();

      List<? extends NextUnlockReceiveRewardOrBuilder> getNextUnlockReceiveRewardOrBuilderList();

      NextUnlockReceiveRewardOrBuilder getNextUnlockReceiveRewardOrBuilder(int index);
   }
}
