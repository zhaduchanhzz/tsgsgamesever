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

public final class NewYearGiftMsg {
   private static final Descriptors.Descriptor internal_static_NewYearGift_com_gzbz_protobuf_C2S_ActivityInfo_18201_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_NewYearGift_com_gzbz_protobuf_C2S_ActivityInfo_18201_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_NewYearGift_com_gzbz_protobuf_S2C_ActivityInfo_18202_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_NewYearGift_com_gzbz_protobuf_S2C_ActivityInfo_18202_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private NewYearGiftMsg() {
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
      String[] descriptorData = new String[]{"\n\u0011NewYearGift.proto\u0012\u001dNewYearGift.com.gzbz.protobuf\"\u0018\n\u0016C2S_ActivityInfo_18201\"\\\n\u0016S2C_ActivityInfo_18202\u0012\u001b\n\u0013newYearGiftPlayerLv\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007openDay\u0018\u0002 \u0002(\u0005\u0012\u0014\n\fisResetDaily\u0018\u0003 \u0002(\bB%\n\u0011com.gzbz.protobufB\u000eNewYearGiftMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_NewYearGift_com_gzbz_protobuf_C2S_ActivityInfo_18201_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_NewYearGift_com_gzbz_protobuf_C2S_ActivityInfo_18201_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_NewYearGift_com_gzbz_protobuf_C2S_ActivityInfo_18201_descriptor, new String[0]);
      internal_static_NewYearGift_com_gzbz_protobuf_S2C_ActivityInfo_18202_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_NewYearGift_com_gzbz_protobuf_S2C_ActivityInfo_18202_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_NewYearGift_com_gzbz_protobuf_S2C_ActivityInfo_18202_descriptor, new String[]{"NewYearGiftPlayerLv", "OpenDay", "IsResetDaily"});
   }

   public static final class C2S_ActivityInfo_18201 extends GeneratedMessageV3 implements C2S_ActivityInfo_18201OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ActivityInfo_18201 DEFAULT_INSTANCE = new C2S_ActivityInfo_18201();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActivityInfo_18201> PARSER = new AbstractParser<C2S_ActivityInfo_18201>() {
         public C2S_ActivityInfo_18201 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActivityInfo_18201(input, extensionRegistry);
         }
      };

      private C2S_ActivityInfo_18201(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActivityInfo_18201() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActivityInfo_18201();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActivityInfo_18201(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return NewYearGiftMsg.internal_static_NewYearGift_com_gzbz_protobuf_C2S_ActivityInfo_18201_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NewYearGiftMsg.internal_static_NewYearGift_com_gzbz_protobuf_C2S_ActivityInfo_18201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_18201.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ActivityInfo_18201)) {
            return super.equals(obj);
         } else {
            C2S_ActivityInfo_18201 other = (C2S_ActivityInfo_18201)obj;
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

      public static C2S_ActivityInfo_18201 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_18201)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_18201 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_18201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_18201 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_18201)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_18201 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_18201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_18201 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_18201)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_18201 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_18201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_18201 parseFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_18201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_18201 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_18201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_18201 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_18201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_18201 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_18201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_18201 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActivityInfo_18201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_18201 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_18201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActivityInfo_18201 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActivityInfo_18201 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActivityInfo_18201> parser() {
         return PARSER;
      }

      public Parser<C2S_ActivityInfo_18201> getParserForType() {
         return PARSER;
      }

      public C2S_ActivityInfo_18201 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActivityInfo_18201OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return NewYearGiftMsg.internal_static_NewYearGift_com_gzbz_protobuf_C2S_ActivityInfo_18201_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NewYearGiftMsg.internal_static_NewYearGift_com_gzbz_protobuf_C2S_ActivityInfo_18201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_18201.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NewYearGiftMsg.C2S_ActivityInfo_18201.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NewYearGiftMsg.internal_static_NewYearGift_com_gzbz_protobuf_C2S_ActivityInfo_18201_descriptor;
         }

         public C2S_ActivityInfo_18201 getDefaultInstanceForType() {
            return NewYearGiftMsg.C2S_ActivityInfo_18201.getDefaultInstance();
         }

         public C2S_ActivityInfo_18201 build() {
            C2S_ActivityInfo_18201 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActivityInfo_18201 buildPartial() {
            C2S_ActivityInfo_18201 result = new C2S_ActivityInfo_18201(this);
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
            if (other instanceof C2S_ActivityInfo_18201) {
               return this.mergeFrom((C2S_ActivityInfo_18201)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActivityInfo_18201 other) {
            if (other == NewYearGiftMsg.C2S_ActivityInfo_18201.getDefaultInstance()) {
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
            C2S_ActivityInfo_18201 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActivityInfo_18201)NewYearGiftMsg.C2S_ActivityInfo_18201.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActivityInfo_18201)e.getUnfinishedMessage();
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

   public static final class S2C_ActivityInfo_18202 extends GeneratedMessageV3 implements S2C_ActivityInfo_18202OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NEWYEARGIFTPLAYERLV_FIELD_NUMBER = 1;
      private int newYearGiftPlayerLv_;
      public static final int OPENDAY_FIELD_NUMBER = 2;
      private int openDay_;
      public static final int ISRESETDAILY_FIELD_NUMBER = 3;
      private boolean isResetDaily_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivityInfo_18202 DEFAULT_INSTANCE = new S2C_ActivityInfo_18202();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivityInfo_18202> PARSER = new AbstractParser<S2C_ActivityInfo_18202>() {
         public S2C_ActivityInfo_18202 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivityInfo_18202(input, extensionRegistry);
         }
      };

      private S2C_ActivityInfo_18202(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivityInfo_18202() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivityInfo_18202();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivityInfo_18202(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.newYearGiftPlayerLv_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.openDay_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.isResetDaily_ = input.readBool();
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
         return NewYearGiftMsg.internal_static_NewYearGift_com_gzbz_protobuf_S2C_ActivityInfo_18202_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NewYearGiftMsg.internal_static_NewYearGift_com_gzbz_protobuf_S2C_ActivityInfo_18202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_18202.class, Builder.class);
      }

      public boolean hasNewYearGiftPlayerLv() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getNewYearGiftPlayerLv() {
         return this.newYearGiftPlayerLv_;
      }

      public boolean hasOpenDay() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getOpenDay() {
         return this.openDay_;
      }

      public boolean hasIsResetDaily() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsResetDaily() {
         return this.isResetDaily_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasNewYearGiftPlayerLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOpenDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsResetDaily()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.newYearGiftPlayerLv_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.openDay_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.isResetDaily_);
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
               size += CodedOutputStream.computeInt32Size(1, this.newYearGiftPlayerLv_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.openDay_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.isResetDaily_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ActivityInfo_18202)) {
            return super.equals(obj);
         } else {
            S2C_ActivityInfo_18202 other = (S2C_ActivityInfo_18202)obj;
            if (this.hasNewYearGiftPlayerLv() != other.hasNewYearGiftPlayerLv()) {
               return false;
            } else if (this.hasNewYearGiftPlayerLv() && this.getNewYearGiftPlayerLv() != other.getNewYearGiftPlayerLv()) {
               return false;
            } else if (this.hasOpenDay() != other.hasOpenDay()) {
               return false;
            } else if (this.hasOpenDay() && this.getOpenDay() != other.getOpenDay()) {
               return false;
            } else if (this.hasIsResetDaily() != other.hasIsResetDaily()) {
               return false;
            } else if (this.hasIsResetDaily() && this.getIsResetDaily() != other.getIsResetDaily()) {
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
            if (this.hasNewYearGiftPlayerLv()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getNewYearGiftPlayerLv();
            }

            if (this.hasOpenDay()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getOpenDay();
            }

            if (this.hasIsResetDaily()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getIsResetDaily());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ActivityInfo_18202 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_18202)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_18202 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_18202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_18202 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_18202)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_18202 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_18202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_18202 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_18202)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_18202 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_18202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_18202 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_18202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_18202 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_18202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_18202 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_18202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_18202 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_18202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_18202 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivityInfo_18202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_18202 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_18202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivityInfo_18202 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivityInfo_18202 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivityInfo_18202> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivityInfo_18202> getParserForType() {
         return PARSER;
      }

      public S2C_ActivityInfo_18202 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivityInfo_18202OrBuilder {
         private int bitField0_;
         private int newYearGiftPlayerLv_;
         private int openDay_;
         private boolean isResetDaily_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NewYearGiftMsg.internal_static_NewYearGift_com_gzbz_protobuf_S2C_ActivityInfo_18202_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NewYearGiftMsg.internal_static_NewYearGift_com_gzbz_protobuf_S2C_ActivityInfo_18202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_18202.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NewYearGiftMsg.S2C_ActivityInfo_18202.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.newYearGiftPlayerLv_ = 0;
            this.bitField0_ &= -2;
            this.openDay_ = 0;
            this.bitField0_ &= -3;
            this.isResetDaily_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NewYearGiftMsg.internal_static_NewYearGift_com_gzbz_protobuf_S2C_ActivityInfo_18202_descriptor;
         }

         public S2C_ActivityInfo_18202 getDefaultInstanceForType() {
            return NewYearGiftMsg.S2C_ActivityInfo_18202.getDefaultInstance();
         }

         public S2C_ActivityInfo_18202 build() {
            S2C_ActivityInfo_18202 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivityInfo_18202 buildPartial() {
            S2C_ActivityInfo_18202 result = new S2C_ActivityInfo_18202(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.newYearGiftPlayerLv_ = this.newYearGiftPlayerLv_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.openDay_ = this.openDay_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.isResetDaily_ = this.isResetDaily_;
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
            if (other instanceof S2C_ActivityInfo_18202) {
               return this.mergeFrom((S2C_ActivityInfo_18202)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivityInfo_18202 other) {
            if (other == NewYearGiftMsg.S2C_ActivityInfo_18202.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasNewYearGiftPlayerLv()) {
                  this.setNewYearGiftPlayerLv(other.getNewYearGiftPlayerLv());
               }

               if (other.hasOpenDay()) {
                  this.setOpenDay(other.getOpenDay());
               }

               if (other.hasIsResetDaily()) {
                  this.setIsResetDaily(other.getIsResetDaily());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasNewYearGiftPlayerLv()) {
               return false;
            } else if (!this.hasOpenDay()) {
               return false;
            } else {
               return this.hasIsResetDaily();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ActivityInfo_18202 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivityInfo_18202)NewYearGiftMsg.S2C_ActivityInfo_18202.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivityInfo_18202)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasNewYearGiftPlayerLv() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getNewYearGiftPlayerLv() {
            return this.newYearGiftPlayerLv_;
         }

         public Builder setNewYearGiftPlayerLv(int value) {
            this.bitField0_ |= 1;
            this.newYearGiftPlayerLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNewYearGiftPlayerLv() {
            this.bitField0_ &= -2;
            this.newYearGiftPlayerLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOpenDay() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getOpenDay() {
            return this.openDay_;
         }

         public Builder setOpenDay(int value) {
            this.bitField0_ |= 2;
            this.openDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpenDay() {
            this.bitField0_ &= -3;
            this.openDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsResetDaily() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getIsResetDaily() {
            return this.isResetDaily_;
         }

         public Builder setIsResetDaily(boolean value) {
            this.bitField0_ |= 4;
            this.isResetDaily_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsResetDaily() {
            this.bitField0_ &= -5;
            this.isResetDaily_ = false;
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

   public interface C2S_ActivityInfo_18201OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_ActivityInfo_18202OrBuilder extends MessageOrBuilder {
      boolean hasNewYearGiftPlayerLv();

      int getNewYearGiftPlayerLv();

      boolean hasOpenDay();

      int getOpenDay();

      boolean hasIsResetDaily();

      boolean getIsResetDaily();
   }
}
