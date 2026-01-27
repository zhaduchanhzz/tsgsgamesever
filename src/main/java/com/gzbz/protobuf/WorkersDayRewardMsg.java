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
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class WorkersDayRewardMsg {
   private static final Descriptors.Descriptor internal_static_workersDayReward_com_gzbz_protobuf_C2S_GetWorkersDayRewardInfo_19701_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_workersDayReward_com_gzbz_protobuf_C2S_GetWorkersDayRewardInfo_19701_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_workersDayReward_com_gzbz_protobuf_S2C_GetWorkersDayRewardInfo_19702_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_workersDayReward_com_gzbz_protobuf_S2C_GetWorkersDayRewardInfo_19702_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_workersDayReward_com_gzbz_protobuf_C2S_ReceiveWorkersDayReward_19703_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_workersDayReward_com_gzbz_protobuf_C2S_ReceiveWorkersDayReward_19703_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private WorkersDayRewardMsg() {
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
      String[] descriptorData = new String[]{"\n\u0013WorkersReward.proto\u0012\"workersDayReward.com.gzbz.protobuf\"#\n!C2S_GetWorkersDayRewardInfo_19701\"<\n!S2C_GetWorkersDayRewardInfo_19702\u0012\u0017\n\u000fisReceiveReward\u0018\u0001 \u0002(\b\"#\n!C2S_ReceiveWorkersDayReward_19703B*\n\u0011com.gzbz.protobufB\u0013WorkersDayRewardMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_workersDayReward_com_gzbz_protobuf_C2S_GetWorkersDayRewardInfo_19701_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_workersDayReward_com_gzbz_protobuf_C2S_GetWorkersDayRewardInfo_19701_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_workersDayReward_com_gzbz_protobuf_C2S_GetWorkersDayRewardInfo_19701_descriptor, new String[0]);
      internal_static_workersDayReward_com_gzbz_protobuf_S2C_GetWorkersDayRewardInfo_19702_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_workersDayReward_com_gzbz_protobuf_S2C_GetWorkersDayRewardInfo_19702_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_workersDayReward_com_gzbz_protobuf_S2C_GetWorkersDayRewardInfo_19702_descriptor, new String[]{"IsReceiveReward"});
      internal_static_workersDayReward_com_gzbz_protobuf_C2S_ReceiveWorkersDayReward_19703_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_workersDayReward_com_gzbz_protobuf_C2S_ReceiveWorkersDayReward_19703_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_workersDayReward_com_gzbz_protobuf_C2S_ReceiveWorkersDayReward_19703_descriptor, new String[0]);
   }

   public static final class C2S_GetWorkersDayRewardInfo_19701 extends GeneratedMessageV3 implements C2S_GetWorkersDayRewardInfo_19701OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GetWorkersDayRewardInfo_19701 DEFAULT_INSTANCE = new C2S_GetWorkersDayRewardInfo_19701();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GetWorkersDayRewardInfo_19701> PARSER = new AbstractParser<C2S_GetWorkersDayRewardInfo_19701>() {
         public C2S_GetWorkersDayRewardInfo_19701 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GetWorkersDayRewardInfo_19701(input, extensionRegistry);
         }
      };

      private C2S_GetWorkersDayRewardInfo_19701(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GetWorkersDayRewardInfo_19701() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GetWorkersDayRewardInfo_19701();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GetWorkersDayRewardInfo_19701(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WorkersDayRewardMsg.internal_static_workersDayReward_com_gzbz_protobuf_C2S_GetWorkersDayRewardInfo_19701_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorkersDayRewardMsg.internal_static_workersDayReward_com_gzbz_protobuf_C2S_GetWorkersDayRewardInfo_19701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetWorkersDayRewardInfo_19701.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GetWorkersDayRewardInfo_19701)) {
            return super.equals(obj);
         } else {
            C2S_GetWorkersDayRewardInfo_19701 other = (C2S_GetWorkersDayRewardInfo_19701)obj;
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

      public static C2S_GetWorkersDayRewardInfo_19701 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GetWorkersDayRewardInfo_19701)PARSER.parseFrom(data);
      }

      public static C2S_GetWorkersDayRewardInfo_19701 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetWorkersDayRewardInfo_19701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetWorkersDayRewardInfo_19701 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GetWorkersDayRewardInfo_19701)PARSER.parseFrom(data);
      }

      public static C2S_GetWorkersDayRewardInfo_19701 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetWorkersDayRewardInfo_19701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetWorkersDayRewardInfo_19701 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GetWorkersDayRewardInfo_19701)PARSER.parseFrom(data);
      }

      public static C2S_GetWorkersDayRewardInfo_19701 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetWorkersDayRewardInfo_19701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetWorkersDayRewardInfo_19701 parseFrom(InputStream input) throws IOException {
         return (C2S_GetWorkersDayRewardInfo_19701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetWorkersDayRewardInfo_19701 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetWorkersDayRewardInfo_19701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetWorkersDayRewardInfo_19701 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GetWorkersDayRewardInfo_19701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GetWorkersDayRewardInfo_19701 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetWorkersDayRewardInfo_19701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetWorkersDayRewardInfo_19701 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GetWorkersDayRewardInfo_19701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetWorkersDayRewardInfo_19701 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetWorkersDayRewardInfo_19701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GetWorkersDayRewardInfo_19701 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GetWorkersDayRewardInfo_19701 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GetWorkersDayRewardInfo_19701> parser() {
         return PARSER;
      }

      public Parser<C2S_GetWorkersDayRewardInfo_19701> getParserForType() {
         return PARSER;
      }

      public C2S_GetWorkersDayRewardInfo_19701 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GetWorkersDayRewardInfo_19701OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return WorkersDayRewardMsg.internal_static_workersDayReward_com_gzbz_protobuf_C2S_GetWorkersDayRewardInfo_19701_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorkersDayRewardMsg.internal_static_workersDayReward_com_gzbz_protobuf_C2S_GetWorkersDayRewardInfo_19701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetWorkersDayRewardInfo_19701.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorkersDayRewardMsg.C2S_GetWorkersDayRewardInfo_19701.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorkersDayRewardMsg.internal_static_workersDayReward_com_gzbz_protobuf_C2S_GetWorkersDayRewardInfo_19701_descriptor;
         }

         public C2S_GetWorkersDayRewardInfo_19701 getDefaultInstanceForType() {
            return WorkersDayRewardMsg.C2S_GetWorkersDayRewardInfo_19701.getDefaultInstance();
         }

         public C2S_GetWorkersDayRewardInfo_19701 build() {
            C2S_GetWorkersDayRewardInfo_19701 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GetWorkersDayRewardInfo_19701 buildPartial() {
            C2S_GetWorkersDayRewardInfo_19701 result = new C2S_GetWorkersDayRewardInfo_19701(this);
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
            if (other instanceof C2S_GetWorkersDayRewardInfo_19701) {
               return this.mergeFrom((C2S_GetWorkersDayRewardInfo_19701)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GetWorkersDayRewardInfo_19701 other) {
            if (other == WorkersDayRewardMsg.C2S_GetWorkersDayRewardInfo_19701.getDefaultInstance()) {
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
            C2S_GetWorkersDayRewardInfo_19701 parsedMessage = null;

            try {
               parsedMessage = (C2S_GetWorkersDayRewardInfo_19701)WorkersDayRewardMsg.C2S_GetWorkersDayRewardInfo_19701.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GetWorkersDayRewardInfo_19701)e.getUnfinishedMessage();
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

   public static final class S2C_GetWorkersDayRewardInfo_19702 extends GeneratedMessageV3 implements S2C_GetWorkersDayRewardInfo_19702OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ISRECEIVEREWARD_FIELD_NUMBER = 1;
      private boolean isReceiveReward_;
      private byte memoizedIsInitialized;
      private static final S2C_GetWorkersDayRewardInfo_19702 DEFAULT_INSTANCE = new S2C_GetWorkersDayRewardInfo_19702();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GetWorkersDayRewardInfo_19702> PARSER = new AbstractParser<S2C_GetWorkersDayRewardInfo_19702>() {
         public S2C_GetWorkersDayRewardInfo_19702 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GetWorkersDayRewardInfo_19702(input, extensionRegistry);
         }
      };

      private S2C_GetWorkersDayRewardInfo_19702(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GetWorkersDayRewardInfo_19702() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GetWorkersDayRewardInfo_19702();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GetWorkersDayRewardInfo_19702(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.isReceiveReward_ = input.readBool();
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
         return WorkersDayRewardMsg.internal_static_workersDayReward_com_gzbz_protobuf_S2C_GetWorkersDayRewardInfo_19702_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorkersDayRewardMsg.internal_static_workersDayReward_com_gzbz_protobuf_S2C_GetWorkersDayRewardInfo_19702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetWorkersDayRewardInfo_19702.class, Builder.class);
      }

      public boolean hasIsReceiveReward() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsReceiveReward() {
         return this.isReceiveReward_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIsReceiveReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.isReceiveReward_);
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
               size += CodedOutputStream.computeBoolSize(1, this.isReceiveReward_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GetWorkersDayRewardInfo_19702)) {
            return super.equals(obj);
         } else {
            S2C_GetWorkersDayRewardInfo_19702 other = (S2C_GetWorkersDayRewardInfo_19702)obj;
            if (this.hasIsReceiveReward() != other.hasIsReceiveReward()) {
               return false;
            } else if (this.hasIsReceiveReward() && this.getIsReceiveReward() != other.getIsReceiveReward()) {
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
            if (this.hasIsReceiveReward()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getIsReceiveReward());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GetWorkersDayRewardInfo_19702 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GetWorkersDayRewardInfo_19702)PARSER.parseFrom(data);
      }

      public static S2C_GetWorkersDayRewardInfo_19702 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetWorkersDayRewardInfo_19702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetWorkersDayRewardInfo_19702 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GetWorkersDayRewardInfo_19702)PARSER.parseFrom(data);
      }

      public static S2C_GetWorkersDayRewardInfo_19702 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetWorkersDayRewardInfo_19702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetWorkersDayRewardInfo_19702 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GetWorkersDayRewardInfo_19702)PARSER.parseFrom(data);
      }

      public static S2C_GetWorkersDayRewardInfo_19702 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetWorkersDayRewardInfo_19702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetWorkersDayRewardInfo_19702 parseFrom(InputStream input) throws IOException {
         return (S2C_GetWorkersDayRewardInfo_19702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetWorkersDayRewardInfo_19702 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetWorkersDayRewardInfo_19702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetWorkersDayRewardInfo_19702 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GetWorkersDayRewardInfo_19702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GetWorkersDayRewardInfo_19702 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetWorkersDayRewardInfo_19702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetWorkersDayRewardInfo_19702 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GetWorkersDayRewardInfo_19702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetWorkersDayRewardInfo_19702 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetWorkersDayRewardInfo_19702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GetWorkersDayRewardInfo_19702 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GetWorkersDayRewardInfo_19702 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GetWorkersDayRewardInfo_19702> parser() {
         return PARSER;
      }

      public Parser<S2C_GetWorkersDayRewardInfo_19702> getParserForType() {
         return PARSER;
      }

      public S2C_GetWorkersDayRewardInfo_19702 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GetWorkersDayRewardInfo_19702OrBuilder {
         private int bitField0_;
         private boolean isReceiveReward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WorkersDayRewardMsg.internal_static_workersDayReward_com_gzbz_protobuf_S2C_GetWorkersDayRewardInfo_19702_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorkersDayRewardMsg.internal_static_workersDayReward_com_gzbz_protobuf_S2C_GetWorkersDayRewardInfo_19702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetWorkersDayRewardInfo_19702.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorkersDayRewardMsg.S2C_GetWorkersDayRewardInfo_19702.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.isReceiveReward_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorkersDayRewardMsg.internal_static_workersDayReward_com_gzbz_protobuf_S2C_GetWorkersDayRewardInfo_19702_descriptor;
         }

         public S2C_GetWorkersDayRewardInfo_19702 getDefaultInstanceForType() {
            return WorkersDayRewardMsg.S2C_GetWorkersDayRewardInfo_19702.getDefaultInstance();
         }

         public S2C_GetWorkersDayRewardInfo_19702 build() {
            S2C_GetWorkersDayRewardInfo_19702 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GetWorkersDayRewardInfo_19702 buildPartial() {
            S2C_GetWorkersDayRewardInfo_19702 result = new S2C_GetWorkersDayRewardInfo_19702(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.isReceiveReward_ = this.isReceiveReward_;
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
            if (other instanceof S2C_GetWorkersDayRewardInfo_19702) {
               return this.mergeFrom((S2C_GetWorkersDayRewardInfo_19702)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GetWorkersDayRewardInfo_19702 other) {
            if (other == WorkersDayRewardMsg.S2C_GetWorkersDayRewardInfo_19702.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIsReceiveReward()) {
                  this.setIsReceiveReward(other.getIsReceiveReward());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasIsReceiveReward();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GetWorkersDayRewardInfo_19702 parsedMessage = null;

            try {
               parsedMessage = (S2C_GetWorkersDayRewardInfo_19702)WorkersDayRewardMsg.S2C_GetWorkersDayRewardInfo_19702.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GetWorkersDayRewardInfo_19702)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIsReceiveReward() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getIsReceiveReward() {
            return this.isReceiveReward_;
         }

         public Builder setIsReceiveReward(boolean value) {
            this.bitField0_ |= 1;
            this.isReceiveReward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsReceiveReward() {
            this.bitField0_ &= -2;
            this.isReceiveReward_ = false;
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

   public static final class C2S_ReceiveWorkersDayReward_19703 extends GeneratedMessageV3 implements C2S_ReceiveWorkersDayReward_19703OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveWorkersDayReward_19703 DEFAULT_INSTANCE = new C2S_ReceiveWorkersDayReward_19703();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveWorkersDayReward_19703> PARSER = new AbstractParser<C2S_ReceiveWorkersDayReward_19703>() {
         public C2S_ReceiveWorkersDayReward_19703 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveWorkersDayReward_19703(input, extensionRegistry);
         }
      };

      private C2S_ReceiveWorkersDayReward_19703(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveWorkersDayReward_19703() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveWorkersDayReward_19703();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveWorkersDayReward_19703(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WorkersDayRewardMsg.internal_static_workersDayReward_com_gzbz_protobuf_C2S_ReceiveWorkersDayReward_19703_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorkersDayRewardMsg.internal_static_workersDayReward_com_gzbz_protobuf_C2S_ReceiveWorkersDayReward_19703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveWorkersDayReward_19703.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveWorkersDayReward_19703)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveWorkersDayReward_19703 other = (C2S_ReceiveWorkersDayReward_19703)obj;
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

      public static C2S_ReceiveWorkersDayReward_19703 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWorkersDayReward_19703)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveWorkersDayReward_19703 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWorkersDayReward_19703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveWorkersDayReward_19703 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWorkersDayReward_19703)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveWorkersDayReward_19703 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWorkersDayReward_19703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveWorkersDayReward_19703 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWorkersDayReward_19703)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveWorkersDayReward_19703 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWorkersDayReward_19703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveWorkersDayReward_19703 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveWorkersDayReward_19703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveWorkersDayReward_19703 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveWorkersDayReward_19703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveWorkersDayReward_19703 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveWorkersDayReward_19703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveWorkersDayReward_19703 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveWorkersDayReward_19703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveWorkersDayReward_19703 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveWorkersDayReward_19703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveWorkersDayReward_19703 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveWorkersDayReward_19703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveWorkersDayReward_19703 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveWorkersDayReward_19703 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveWorkersDayReward_19703> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveWorkersDayReward_19703> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveWorkersDayReward_19703 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveWorkersDayReward_19703OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return WorkersDayRewardMsg.internal_static_workersDayReward_com_gzbz_protobuf_C2S_ReceiveWorkersDayReward_19703_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WorkersDayRewardMsg.internal_static_workersDayReward_com_gzbz_protobuf_C2S_ReceiveWorkersDayReward_19703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveWorkersDayReward_19703.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WorkersDayRewardMsg.C2S_ReceiveWorkersDayReward_19703.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WorkersDayRewardMsg.internal_static_workersDayReward_com_gzbz_protobuf_C2S_ReceiveWorkersDayReward_19703_descriptor;
         }

         public C2S_ReceiveWorkersDayReward_19703 getDefaultInstanceForType() {
            return WorkersDayRewardMsg.C2S_ReceiveWorkersDayReward_19703.getDefaultInstance();
         }

         public C2S_ReceiveWorkersDayReward_19703 build() {
            C2S_ReceiveWorkersDayReward_19703 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveWorkersDayReward_19703 buildPartial() {
            C2S_ReceiveWorkersDayReward_19703 result = new C2S_ReceiveWorkersDayReward_19703(this);
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
            if (other instanceof C2S_ReceiveWorkersDayReward_19703) {
               return this.mergeFrom((C2S_ReceiveWorkersDayReward_19703)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveWorkersDayReward_19703 other) {
            if (other == WorkersDayRewardMsg.C2S_ReceiveWorkersDayReward_19703.getDefaultInstance()) {
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
            C2S_ReceiveWorkersDayReward_19703 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveWorkersDayReward_19703)WorkersDayRewardMsg.C2S_ReceiveWorkersDayReward_19703.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveWorkersDayReward_19703)e.getUnfinishedMessage();
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

   public interface C2S_GetWorkersDayRewardInfo_19701OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ReceiveWorkersDayReward_19703OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_GetWorkersDayRewardInfo_19702OrBuilder extends MessageOrBuilder {
      boolean hasIsReceiveReward();

      boolean getIsReceiveReward();
   }
}
