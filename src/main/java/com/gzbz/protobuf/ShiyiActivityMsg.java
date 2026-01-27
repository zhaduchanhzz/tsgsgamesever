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
import java.util.Collections;
import java.util.List;

public final class ShiyiActivityMsg {
   private static final Descriptors.Descriptor internal_static_shiyiActivity_com_gzbz_protobuf_C2S_ActivityInfo_16901_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shiyiActivity_com_gzbz_protobuf_C2S_ActivityInfo_16901_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shiyiActivity_com_gzbz_protobuf_S2C_ActivityInfo_16902_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shiyiActivity_com_gzbz_protobuf_S2C_ActivityInfo_16902_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shiyiActivity_com_gzbz_protobuf_C2S_ShiyiRewardTotalInfo_16903_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shiyiActivity_com_gzbz_protobuf_C2S_ShiyiRewardTotalInfo_16903_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shiyiActivity_com_gzbz_protobuf_S2C_ShiyiRewardTotalInfo_16904_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shiyiActivity_com_gzbz_protobuf_S2C_ShiyiRewardTotalInfo_16904_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shiyiActivity_com_gzbz_protobuf_C2S_SubmitBag_16905_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shiyiActivity_com_gzbz_protobuf_C2S_SubmitBag_16905_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ShiyiActivityMsg() {
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
      String[] descriptorData = new String[]{"\n\u0013ShiyiActivity.proto\u0012\u001fshiyiActivity.com.gzbz.protobuf\"\u0018\n\u0016C2S_ActivityInfo_16901\"<\n\u0016S2C_ActivityInfo_16902\u0012\u0011\n\tstartTime\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0002 \u0002(\u0005\" \n\u001eC2S_ShiyiRewardTotalInfo_16903\"H\n\u001eS2C_ShiyiRewardTotalInfo_16904\u0012\u0010\n\brewardId\u0018\u0001 \u0003(\u0005\u0012\u0014\n\fsurplusTimes\u0018\u0002 \u0002(\u0005\"'\n\u0013C2S_SubmitBag_16905\u0012\u0010\n\brewardId\u0018\u0001 \u0003(\u0005B'\n\u0011com.gzbz.protobufB\u0010ShiyiActivityMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_shiyiActivity_com_gzbz_protobuf_C2S_ActivityInfo_16901_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_shiyiActivity_com_gzbz_protobuf_C2S_ActivityInfo_16901_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shiyiActivity_com_gzbz_protobuf_C2S_ActivityInfo_16901_descriptor, new String[0]);
      internal_static_shiyiActivity_com_gzbz_protobuf_S2C_ActivityInfo_16902_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_shiyiActivity_com_gzbz_protobuf_S2C_ActivityInfo_16902_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shiyiActivity_com_gzbz_protobuf_S2C_ActivityInfo_16902_descriptor, new String[]{"StartTime", "EndTime"});
      internal_static_shiyiActivity_com_gzbz_protobuf_C2S_ShiyiRewardTotalInfo_16903_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_shiyiActivity_com_gzbz_protobuf_C2S_ShiyiRewardTotalInfo_16903_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shiyiActivity_com_gzbz_protobuf_C2S_ShiyiRewardTotalInfo_16903_descriptor, new String[0]);
      internal_static_shiyiActivity_com_gzbz_protobuf_S2C_ShiyiRewardTotalInfo_16904_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_shiyiActivity_com_gzbz_protobuf_S2C_ShiyiRewardTotalInfo_16904_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shiyiActivity_com_gzbz_protobuf_S2C_ShiyiRewardTotalInfo_16904_descriptor, new String[]{"RewardId", "SurplusTimes"});
      internal_static_shiyiActivity_com_gzbz_protobuf_C2S_SubmitBag_16905_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_shiyiActivity_com_gzbz_protobuf_C2S_SubmitBag_16905_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shiyiActivity_com_gzbz_protobuf_C2S_SubmitBag_16905_descriptor, new String[]{"RewardId"});
   }

   public static final class C2S_ActivityInfo_16901 extends GeneratedMessageV3 implements C2S_ActivityInfo_16901OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ActivityInfo_16901 DEFAULT_INSTANCE = new C2S_ActivityInfo_16901();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActivityInfo_16901> PARSER = new AbstractParser<C2S_ActivityInfo_16901>() {
         public C2S_ActivityInfo_16901 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActivityInfo_16901(input, extensionRegistry);
         }
      };

      private C2S_ActivityInfo_16901(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActivityInfo_16901() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActivityInfo_16901();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActivityInfo_16901(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_C2S_ActivityInfo_16901_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_C2S_ActivityInfo_16901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_16901.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ActivityInfo_16901)) {
            return super.equals(obj);
         } else {
            C2S_ActivityInfo_16901 other = (C2S_ActivityInfo_16901)obj;
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

      public static C2S_ActivityInfo_16901 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_16901)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_16901 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_16901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_16901 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_16901)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_16901 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_16901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_16901 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_16901)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_16901 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_16901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_16901 parseFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_16901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_16901 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_16901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_16901 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_16901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_16901 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_16901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_16901 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActivityInfo_16901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_16901 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_16901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActivityInfo_16901 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActivityInfo_16901 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActivityInfo_16901> parser() {
         return PARSER;
      }

      public Parser<C2S_ActivityInfo_16901> getParserForType() {
         return PARSER;
      }

      public C2S_ActivityInfo_16901 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActivityInfo_16901OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_C2S_ActivityInfo_16901_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_C2S_ActivityInfo_16901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_16901.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShiyiActivityMsg.C2S_ActivityInfo_16901.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_C2S_ActivityInfo_16901_descriptor;
         }

         public C2S_ActivityInfo_16901 getDefaultInstanceForType() {
            return ShiyiActivityMsg.C2S_ActivityInfo_16901.getDefaultInstance();
         }

         public C2S_ActivityInfo_16901 build() {
            C2S_ActivityInfo_16901 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActivityInfo_16901 buildPartial() {
            C2S_ActivityInfo_16901 result = new C2S_ActivityInfo_16901(this);
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
            if (other instanceof C2S_ActivityInfo_16901) {
               return this.mergeFrom((C2S_ActivityInfo_16901)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActivityInfo_16901 other) {
            if (other == ShiyiActivityMsg.C2S_ActivityInfo_16901.getDefaultInstance()) {
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
            C2S_ActivityInfo_16901 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActivityInfo_16901)ShiyiActivityMsg.C2S_ActivityInfo_16901.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActivityInfo_16901)e.getUnfinishedMessage();
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

   public static final class S2C_ActivityInfo_16902 extends GeneratedMessageV3 implements S2C_ActivityInfo_16902OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STARTTIME_FIELD_NUMBER = 1;
      private int startTime_;
      public static final int ENDTIME_FIELD_NUMBER = 2;
      private int endTime_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivityInfo_16902 DEFAULT_INSTANCE = new S2C_ActivityInfo_16902();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivityInfo_16902> PARSER = new AbstractParser<S2C_ActivityInfo_16902>() {
         public S2C_ActivityInfo_16902 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivityInfo_16902(input, extensionRegistry);
         }
      };

      private S2C_ActivityInfo_16902(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivityInfo_16902() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivityInfo_16902();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivityInfo_16902(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.startTime_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.endTime_ = input.readInt32();
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
         return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_S2C_ActivityInfo_16902_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_S2C_ActivityInfo_16902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_16902.class, Builder.class);
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStartTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.startTime_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.endTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.startTime_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.endTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ActivityInfo_16902)) {
            return super.equals(obj);
         } else {
            S2C_ActivityInfo_16902 other = (S2C_ActivityInfo_16902)obj;
            if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
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
            if (this.hasStartTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStartTime();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEndTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ActivityInfo_16902 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_16902)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_16902 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_16902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_16902 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_16902)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_16902 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_16902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_16902 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_16902)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_16902 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_16902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_16902 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_16902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_16902 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_16902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_16902 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_16902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_16902 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_16902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_16902 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivityInfo_16902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_16902 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_16902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivityInfo_16902 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivityInfo_16902 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivityInfo_16902> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivityInfo_16902> getParserForType() {
         return PARSER;
      }

      public S2C_ActivityInfo_16902 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivityInfo_16902OrBuilder {
         private int bitField0_;
         private int startTime_;
         private int endTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_S2C_ActivityInfo_16902_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_S2C_ActivityInfo_16902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_16902.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShiyiActivityMsg.S2C_ActivityInfo_16902.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.startTime_ = 0;
            this.bitField0_ &= -2;
            this.endTime_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_S2C_ActivityInfo_16902_descriptor;
         }

         public S2C_ActivityInfo_16902 getDefaultInstanceForType() {
            return ShiyiActivityMsg.S2C_ActivityInfo_16902.getDefaultInstance();
         }

         public S2C_ActivityInfo_16902 build() {
            S2C_ActivityInfo_16902 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivityInfo_16902 buildPartial() {
            S2C_ActivityInfo_16902 result = new S2C_ActivityInfo_16902(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.endTime_ = this.endTime_;
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
            if (other instanceof S2C_ActivityInfo_16902) {
               return this.mergeFrom((S2C_ActivityInfo_16902)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivityInfo_16902 other) {
            if (other == ShiyiActivityMsg.S2C_ActivityInfo_16902.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStartTime()) {
               return false;
            } else {
               return this.hasEndTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ActivityInfo_16902 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivityInfo_16902)ShiyiActivityMsg.S2C_ActivityInfo_16902.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivityInfo_16902)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStartTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(int value) {
            this.bitField0_ |= 1;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -2;
            this.startTime_ = 0;
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ShiyiRewardTotalInfo_16903 extends GeneratedMessageV3 implements C2S_ShiyiRewardTotalInfo_16903OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ShiyiRewardTotalInfo_16903 DEFAULT_INSTANCE = new C2S_ShiyiRewardTotalInfo_16903();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ShiyiRewardTotalInfo_16903> PARSER = new AbstractParser<C2S_ShiyiRewardTotalInfo_16903>() {
         public C2S_ShiyiRewardTotalInfo_16903 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ShiyiRewardTotalInfo_16903(input, extensionRegistry);
         }
      };

      private C2S_ShiyiRewardTotalInfo_16903(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ShiyiRewardTotalInfo_16903() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ShiyiRewardTotalInfo_16903();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ShiyiRewardTotalInfo_16903(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_C2S_ShiyiRewardTotalInfo_16903_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_C2S_ShiyiRewardTotalInfo_16903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShiyiRewardTotalInfo_16903.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ShiyiRewardTotalInfo_16903)) {
            return super.equals(obj);
         } else {
            C2S_ShiyiRewardTotalInfo_16903 other = (C2S_ShiyiRewardTotalInfo_16903)obj;
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

      public static C2S_ShiyiRewardTotalInfo_16903 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ShiyiRewardTotalInfo_16903)PARSER.parseFrom(data);
      }

      public static C2S_ShiyiRewardTotalInfo_16903 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShiyiRewardTotalInfo_16903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShiyiRewardTotalInfo_16903 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ShiyiRewardTotalInfo_16903)PARSER.parseFrom(data);
      }

      public static C2S_ShiyiRewardTotalInfo_16903 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShiyiRewardTotalInfo_16903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShiyiRewardTotalInfo_16903 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ShiyiRewardTotalInfo_16903)PARSER.parseFrom(data);
      }

      public static C2S_ShiyiRewardTotalInfo_16903 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShiyiRewardTotalInfo_16903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShiyiRewardTotalInfo_16903 parseFrom(InputStream input) throws IOException {
         return (C2S_ShiyiRewardTotalInfo_16903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShiyiRewardTotalInfo_16903 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShiyiRewardTotalInfo_16903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShiyiRewardTotalInfo_16903 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ShiyiRewardTotalInfo_16903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ShiyiRewardTotalInfo_16903 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShiyiRewardTotalInfo_16903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShiyiRewardTotalInfo_16903 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ShiyiRewardTotalInfo_16903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShiyiRewardTotalInfo_16903 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShiyiRewardTotalInfo_16903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ShiyiRewardTotalInfo_16903 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ShiyiRewardTotalInfo_16903 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ShiyiRewardTotalInfo_16903> parser() {
         return PARSER;
      }

      public Parser<C2S_ShiyiRewardTotalInfo_16903> getParserForType() {
         return PARSER;
      }

      public C2S_ShiyiRewardTotalInfo_16903 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ShiyiRewardTotalInfo_16903OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_C2S_ShiyiRewardTotalInfo_16903_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_C2S_ShiyiRewardTotalInfo_16903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShiyiRewardTotalInfo_16903.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShiyiActivityMsg.C2S_ShiyiRewardTotalInfo_16903.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_C2S_ShiyiRewardTotalInfo_16903_descriptor;
         }

         public C2S_ShiyiRewardTotalInfo_16903 getDefaultInstanceForType() {
            return ShiyiActivityMsg.C2S_ShiyiRewardTotalInfo_16903.getDefaultInstance();
         }

         public C2S_ShiyiRewardTotalInfo_16903 build() {
            C2S_ShiyiRewardTotalInfo_16903 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ShiyiRewardTotalInfo_16903 buildPartial() {
            C2S_ShiyiRewardTotalInfo_16903 result = new C2S_ShiyiRewardTotalInfo_16903(this);
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
            if (other instanceof C2S_ShiyiRewardTotalInfo_16903) {
               return this.mergeFrom((C2S_ShiyiRewardTotalInfo_16903)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ShiyiRewardTotalInfo_16903 other) {
            if (other == ShiyiActivityMsg.C2S_ShiyiRewardTotalInfo_16903.getDefaultInstance()) {
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
            C2S_ShiyiRewardTotalInfo_16903 parsedMessage = null;

            try {
               parsedMessage = (C2S_ShiyiRewardTotalInfo_16903)ShiyiActivityMsg.C2S_ShiyiRewardTotalInfo_16903.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ShiyiRewardTotalInfo_16903)e.getUnfinishedMessage();
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

   public static final class S2C_ShiyiRewardTotalInfo_16904 extends GeneratedMessageV3 implements S2C_ShiyiRewardTotalInfo_16904OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private Internal.IntList rewardId_;
      public static final int SURPLUSTIMES_FIELD_NUMBER = 2;
      private int surplusTimes_;
      private byte memoizedIsInitialized;
      private static final S2C_ShiyiRewardTotalInfo_16904 DEFAULT_INSTANCE = new S2C_ShiyiRewardTotalInfo_16904();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ShiyiRewardTotalInfo_16904> PARSER = new AbstractParser<S2C_ShiyiRewardTotalInfo_16904>() {
         public S2C_ShiyiRewardTotalInfo_16904 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ShiyiRewardTotalInfo_16904(input, extensionRegistry);
         }
      };

      private S2C_ShiyiRewardTotalInfo_16904(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ShiyiRewardTotalInfo_16904() {
         this.memoizedIsInitialized = -1;
         this.rewardId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ShiyiRewardTotalInfo_16904();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ShiyiRewardTotalInfo_16904(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.rewardId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.rewardId_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.rewardId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.surplusTimes_ = input.readInt32();
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
               if ((mutable_bitField0_ & 1) != 0) {
                  this.rewardId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_S2C_ShiyiRewardTotalInfo_16904_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_S2C_ShiyiRewardTotalInfo_16904_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShiyiRewardTotalInfo_16904.class, Builder.class);
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

      public boolean hasSurplusTimes() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSurplusTimes() {
         return this.surplusTimes_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSurplusTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.rewardId_.size(); ++i) {
            output.writeInt32(1, this.rewardId_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.surplusTimes_);
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

            for(int i = 0; i < this.rewardId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.rewardId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRewardIdList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.surplusTimes_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ShiyiRewardTotalInfo_16904)) {
            return super.equals(obj);
         } else {
            S2C_ShiyiRewardTotalInfo_16904 other = (S2C_ShiyiRewardTotalInfo_16904)obj;
            if (!this.getRewardIdList().equals(other.getRewardIdList())) {
               return false;
            } else if (this.hasSurplusTimes() != other.hasSurplusTimes()) {
               return false;
            } else if (this.hasSurplusTimes() && this.getSurplusTimes() != other.getSurplusTimes()) {
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
            if (this.getRewardIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRewardIdList().hashCode();
            }

            if (this.hasSurplusTimes()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSurplusTimes();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ShiyiRewardTotalInfo_16904 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ShiyiRewardTotalInfo_16904)PARSER.parseFrom(data);
      }

      public static S2C_ShiyiRewardTotalInfo_16904 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShiyiRewardTotalInfo_16904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShiyiRewardTotalInfo_16904 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ShiyiRewardTotalInfo_16904)PARSER.parseFrom(data);
      }

      public static S2C_ShiyiRewardTotalInfo_16904 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShiyiRewardTotalInfo_16904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShiyiRewardTotalInfo_16904 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ShiyiRewardTotalInfo_16904)PARSER.parseFrom(data);
      }

      public static S2C_ShiyiRewardTotalInfo_16904 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShiyiRewardTotalInfo_16904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShiyiRewardTotalInfo_16904 parseFrom(InputStream input) throws IOException {
         return (S2C_ShiyiRewardTotalInfo_16904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShiyiRewardTotalInfo_16904 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShiyiRewardTotalInfo_16904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShiyiRewardTotalInfo_16904 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ShiyiRewardTotalInfo_16904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ShiyiRewardTotalInfo_16904 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShiyiRewardTotalInfo_16904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShiyiRewardTotalInfo_16904 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ShiyiRewardTotalInfo_16904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShiyiRewardTotalInfo_16904 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShiyiRewardTotalInfo_16904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ShiyiRewardTotalInfo_16904 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ShiyiRewardTotalInfo_16904 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ShiyiRewardTotalInfo_16904> parser() {
         return PARSER;
      }

      public Parser<S2C_ShiyiRewardTotalInfo_16904> getParserForType() {
         return PARSER;
      }

      public S2C_ShiyiRewardTotalInfo_16904 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ShiyiRewardTotalInfo_16904OrBuilder {
         private int bitField0_;
         private Internal.IntList rewardId_;
         private int surplusTimes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_S2C_ShiyiRewardTotalInfo_16904_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_S2C_ShiyiRewardTotalInfo_16904_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShiyiRewardTotalInfo_16904.class, Builder.class);
         }

         private Builder() {
            this.rewardId_ = ShiyiActivityMsg.S2C_ShiyiRewardTotalInfo_16904.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardId_ = ShiyiActivityMsg.S2C_ShiyiRewardTotalInfo_16904.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShiyiActivityMsg.S2C_ShiyiRewardTotalInfo_16904.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = ShiyiActivityMsg.S2C_ShiyiRewardTotalInfo_16904.emptyIntList();
            this.bitField0_ &= -2;
            this.surplusTimes_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_S2C_ShiyiRewardTotalInfo_16904_descriptor;
         }

         public S2C_ShiyiRewardTotalInfo_16904 getDefaultInstanceForType() {
            return ShiyiActivityMsg.S2C_ShiyiRewardTotalInfo_16904.getDefaultInstance();
         }

         public S2C_ShiyiRewardTotalInfo_16904 build() {
            S2C_ShiyiRewardTotalInfo_16904 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ShiyiRewardTotalInfo_16904 buildPartial() {
            S2C_ShiyiRewardTotalInfo_16904 result = new S2C_ShiyiRewardTotalInfo_16904(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.rewardId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.rewardId_ = this.rewardId_;
            if ((from_bitField0_ & 2) != 0) {
               result.surplusTimes_ = this.surplusTimes_;
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
            if (other instanceof S2C_ShiyiRewardTotalInfo_16904) {
               return this.mergeFrom((S2C_ShiyiRewardTotalInfo_16904)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ShiyiRewardTotalInfo_16904 other) {
            if (other == ShiyiActivityMsg.S2C_ShiyiRewardTotalInfo_16904.getDefaultInstance()) {
               return this;
            } else {
               if (!other.rewardId_.isEmpty()) {
                  if (this.rewardId_.isEmpty()) {
                     this.rewardId_ = other.rewardId_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureRewardIdIsMutable();
                     this.rewardId_.addAll(other.rewardId_);
                  }

                  this.onChanged();
               }

               if (other.hasSurplusTimes()) {
                  this.setSurplusTimes(other.getSurplusTimes());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasSurplusTimes();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ShiyiRewardTotalInfo_16904 parsedMessage = null;

            try {
               parsedMessage = (S2C_ShiyiRewardTotalInfo_16904)ShiyiActivityMsg.S2C_ShiyiRewardTotalInfo_16904.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ShiyiRewardTotalInfo_16904)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRewardIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.rewardId_ = ShiyiActivityMsg.S2C_ShiyiRewardTotalInfo_16904.mutableCopy(this.rewardId_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getRewardIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.rewardId_) : this.rewardId_);
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
            this.rewardId_ = ShiyiActivityMsg.S2C_ShiyiRewardTotalInfo_16904.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public boolean hasSurplusTimes() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSurplusTimes() {
            return this.surplusTimes_;
         }

         public Builder setSurplusTimes(int value) {
            this.bitField0_ |= 2;
            this.surplusTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSurplusTimes() {
            this.bitField0_ &= -3;
            this.surplusTimes_ = 0;
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

   public static final class C2S_SubmitBag_16905 extends GeneratedMessageV3 implements C2S_SubmitBag_16905OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private Internal.IntList rewardId_;
      private byte memoizedIsInitialized;
      private static final C2S_SubmitBag_16905 DEFAULT_INSTANCE = new C2S_SubmitBag_16905();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SubmitBag_16905> PARSER = new AbstractParser<C2S_SubmitBag_16905>() {
         public C2S_SubmitBag_16905 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SubmitBag_16905(input, extensionRegistry);
         }
      };

      private C2S_SubmitBag_16905(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SubmitBag_16905() {
         this.memoizedIsInitialized = -1;
         this.rewardId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SubmitBag_16905();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SubmitBag_16905(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.rewardId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.rewardId_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.rewardId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.rewardId_.addInt(input.readInt32());
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
                  this.rewardId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_C2S_SubmitBag_16905_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_C2S_SubmitBag_16905_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SubmitBag_16905.class, Builder.class);
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
         for(int i = 0; i < this.rewardId_.size(); ++i) {
            output.writeInt32(1, this.rewardId_.getInt(i));
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

            for(int i = 0; i < this.rewardId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.rewardId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRewardIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SubmitBag_16905)) {
            return super.equals(obj);
         } else {
            C2S_SubmitBag_16905 other = (C2S_SubmitBag_16905)obj;
            if (!this.getRewardIdList().equals(other.getRewardIdList())) {
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
            if (this.getRewardIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRewardIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SubmitBag_16905 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SubmitBag_16905)PARSER.parseFrom(data);
      }

      public static C2S_SubmitBag_16905 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SubmitBag_16905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SubmitBag_16905 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SubmitBag_16905)PARSER.parseFrom(data);
      }

      public static C2S_SubmitBag_16905 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SubmitBag_16905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SubmitBag_16905 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SubmitBag_16905)PARSER.parseFrom(data);
      }

      public static C2S_SubmitBag_16905 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SubmitBag_16905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SubmitBag_16905 parseFrom(InputStream input) throws IOException {
         return (C2S_SubmitBag_16905)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SubmitBag_16905 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SubmitBag_16905)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SubmitBag_16905 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SubmitBag_16905)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SubmitBag_16905 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SubmitBag_16905)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SubmitBag_16905 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SubmitBag_16905)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SubmitBag_16905 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SubmitBag_16905)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SubmitBag_16905 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SubmitBag_16905 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SubmitBag_16905> parser() {
         return PARSER;
      }

      public Parser<C2S_SubmitBag_16905> getParserForType() {
         return PARSER;
      }

      public C2S_SubmitBag_16905 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SubmitBag_16905OrBuilder {
         private int bitField0_;
         private Internal.IntList rewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_C2S_SubmitBag_16905_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_C2S_SubmitBag_16905_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SubmitBag_16905.class, Builder.class);
         }

         private Builder() {
            this.rewardId_ = ShiyiActivityMsg.C2S_SubmitBag_16905.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardId_ = ShiyiActivityMsg.C2S_SubmitBag_16905.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShiyiActivityMsg.C2S_SubmitBag_16905.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = ShiyiActivityMsg.C2S_SubmitBag_16905.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShiyiActivityMsg.internal_static_shiyiActivity_com_gzbz_protobuf_C2S_SubmitBag_16905_descriptor;
         }

         public C2S_SubmitBag_16905 getDefaultInstanceForType() {
            return ShiyiActivityMsg.C2S_SubmitBag_16905.getDefaultInstance();
         }

         public C2S_SubmitBag_16905 build() {
            C2S_SubmitBag_16905 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SubmitBag_16905 buildPartial() {
            C2S_SubmitBag_16905 result = new C2S_SubmitBag_16905(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.rewardId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.rewardId_ = this.rewardId_;
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
            if (other instanceof C2S_SubmitBag_16905) {
               return this.mergeFrom((C2S_SubmitBag_16905)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SubmitBag_16905 other) {
            if (other == ShiyiActivityMsg.C2S_SubmitBag_16905.getDefaultInstance()) {
               return this;
            } else {
               if (!other.rewardId_.isEmpty()) {
                  if (this.rewardId_.isEmpty()) {
                     this.rewardId_ = other.rewardId_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureRewardIdIsMutable();
                     this.rewardId_.addAll(other.rewardId_);
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
            C2S_SubmitBag_16905 parsedMessage = null;

            try {
               parsedMessage = (C2S_SubmitBag_16905)ShiyiActivityMsg.C2S_SubmitBag_16905.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SubmitBag_16905)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRewardIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.rewardId_ = ShiyiActivityMsg.C2S_SubmitBag_16905.mutableCopy(this.rewardId_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getRewardIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.rewardId_) : this.rewardId_);
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
            this.rewardId_ = ShiyiActivityMsg.C2S_SubmitBag_16905.emptyIntList();
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

   public interface C2S_ActivityInfo_16901OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ShiyiRewardTotalInfo_16903OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SubmitBag_16905OrBuilder extends MessageOrBuilder {
      List<Integer> getRewardIdList();

      int getRewardIdCount();

      int getRewardId(int index);
   }

   public interface S2C_ActivityInfo_16902OrBuilder extends MessageOrBuilder {
      boolean hasStartTime();

      int getStartTime();

      boolean hasEndTime();

      int getEndTime();
   }

   public interface S2C_ShiyiRewardTotalInfo_16904OrBuilder extends MessageOrBuilder {
      List<Integer> getRewardIdList();

      int getRewardIdCount();

      int getRewardId(int index);

      boolean hasSurplusTimes();

      int getSurplusTimes();
   }
}
