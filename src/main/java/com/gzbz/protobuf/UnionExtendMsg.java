package com.gzbz.protobuf;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
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

public final class UnionExtendMsg {
   private static final Descriptors.Descriptor internal_static_unionExtend_com_gzbz_protobuf_UnionHeadData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionExtend_com_gzbz_protobuf_UnionHeadData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionHead_17501_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionHead_17501_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionHead_17502_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionHead_17502_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionSettingHead_17503_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionSettingHead_17503_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionSettingHead_17504_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionSettingHead_17504_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionAddNumber_17505_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionAddNumber_17505_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionAddNumber_17506_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionAddNumber_17506_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private UnionExtendMsg() {
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
      String[] descriptorData = new String[]{"\n\u0011UnionExtend.proto\u0012\u001dunionExtend.com.gzbz.protobuf\"2\n\rUnionHeadData\u0012\f\n\u0004head\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000binvalidTime\u0018\u0002 \u0002(\u0005\"\u0015\n\u0013C2S_UnionHead_17501\"Q\n\u0013S2C_UnionHead_17502\u0012:\n\u0004head\u0018\u0001 \u0003(\u000b2,.unionExtend.com.gzbz.protobuf.UnionHeadData\"0\n\u001aC2S_UnionSettingHead_17503\u0012\u0012\n\nchoiceHead\u0018\u0001 \u0002(\u0005\"0\n\u001aS2C_UnionSettingHead_17504\u0012\u0012\n\nchoiceHead\u0018\u0001 \u0002(\u0005\"\u001a\n\u0018C2S_UnionAddNumber_17505\"I\n\u0018S2C_UnionAddNumber_17506\u0012\u001b\n\u0013curUnionAddNumberId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005B%\n\u0011com.gzbz.protobufB\u000eUnionExtendMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_unionExtend_com_gzbz_protobuf_UnionHeadData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_unionExtend_com_gzbz_protobuf_UnionHeadData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionExtend_com_gzbz_protobuf_UnionHeadData_descriptor, new String[]{"Head", "InvalidTime"});
      internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionHead_17501_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionHead_17501_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionHead_17501_descriptor, new String[0]);
      internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionHead_17502_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionHead_17502_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionHead_17502_descriptor, new String[]{"Head"});
      internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionSettingHead_17503_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionSettingHead_17503_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionSettingHead_17503_descriptor, new String[]{"ChoiceHead"});
      internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionSettingHead_17504_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionSettingHead_17504_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionSettingHead_17504_descriptor, new String[]{"ChoiceHead"});
      internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionAddNumber_17505_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionAddNumber_17505_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionAddNumber_17505_descriptor, new String[0]);
      internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionAddNumber_17506_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionAddNumber_17506_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionAddNumber_17506_descriptor, new String[]{"CurUnionAddNumberId", "PlayerId"});
   }

   public static final class UnionHeadData extends GeneratedMessageV3 implements UnionHeadDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEAD_FIELD_NUMBER = 1;
      private int head_;
      public static final int INVALIDTIME_FIELD_NUMBER = 2;
      private int invalidTime_;
      private byte memoizedIsInitialized;
      private static final UnionHeadData DEFAULT_INSTANCE = new UnionHeadData();
      /** @deprecated */
      @Deprecated
      public static final Parser<UnionHeadData> PARSER = new AbstractParser<UnionHeadData>() {
         public UnionHeadData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new UnionHeadData(input, extensionRegistry);
         }
      };

      private UnionHeadData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private UnionHeadData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new UnionHeadData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private UnionHeadData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.head_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.invalidTime_ = input.readInt32();
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
         return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_UnionHeadData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_UnionHeadData_fieldAccessorTable.ensureFieldAccessorsInitialized(UnionHeadData.class, Builder.class);
      }

      public boolean hasHead() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasInvalidTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getInvalidTime() {
         return this.invalidTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasInvalidTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.head_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.invalidTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.head_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.invalidTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof UnionHeadData)) {
            return super.equals(obj);
         } else {
            UnionHeadData other = (UnionHeadData)obj;
            if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasInvalidTime() != other.hasInvalidTime()) {
               return false;
            } else if (this.hasInvalidTime() && this.getInvalidTime() != other.getInvalidTime()) {
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
            if (this.hasHead()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasInvalidTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInvalidTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static UnionHeadData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (UnionHeadData)PARSER.parseFrom(data);
      }

      public static UnionHeadData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (UnionHeadData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static UnionHeadData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (UnionHeadData)PARSER.parseFrom(data);
      }

      public static UnionHeadData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (UnionHeadData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static UnionHeadData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (UnionHeadData)PARSER.parseFrom(data);
      }

      public static UnionHeadData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (UnionHeadData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static UnionHeadData parseFrom(InputStream input) throws IOException {
         return (UnionHeadData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static UnionHeadData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (UnionHeadData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static UnionHeadData parseDelimitedFrom(InputStream input) throws IOException {
         return (UnionHeadData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static UnionHeadData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (UnionHeadData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static UnionHeadData parseFrom(CodedInputStream input) throws IOException {
         return (UnionHeadData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static UnionHeadData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (UnionHeadData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(UnionHeadData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static UnionHeadData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<UnionHeadData> parser() {
         return PARSER;
      }

      public Parser<UnionHeadData> getParserForType() {
         return PARSER;
      }

      public UnionHeadData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UnionHeadDataOrBuilder {
         private int bitField0_;
         private int head_;
         private int invalidTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_UnionHeadData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_UnionHeadData_fieldAccessorTable.ensureFieldAccessorsInitialized(UnionHeadData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionExtendMsg.UnionHeadData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.head_ = 0;
            this.bitField0_ &= -2;
            this.invalidTime_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_UnionHeadData_descriptor;
         }

         public UnionHeadData getDefaultInstanceForType() {
            return UnionExtendMsg.UnionHeadData.getDefaultInstance();
         }

         public UnionHeadData build() {
            UnionHeadData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public UnionHeadData buildPartial() {
            UnionHeadData result = new UnionHeadData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.invalidTime_ = this.invalidTime_;
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
            if (other instanceof UnionHeadData) {
               return this.mergeFrom((UnionHeadData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(UnionHeadData other) {
            if (other == UnionExtendMsg.UnionHeadData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasInvalidTime()) {
                  this.setInvalidTime(other.getInvalidTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHead()) {
               return false;
            } else {
               return this.hasInvalidTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            UnionHeadData parsedMessage = null;

            try {
               parsedMessage = (UnionHeadData)UnionExtendMsg.UnionHeadData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (UnionHeadData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHead() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHead() {
            return this.head_;
         }

         public Builder setHead(int value) {
            this.bitField0_ |= 1;
            this.head_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHead() {
            this.bitField0_ &= -2;
            this.head_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasInvalidTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getInvalidTime() {
            return this.invalidTime_;
         }

         public Builder setInvalidTime(int value) {
            this.bitField0_ |= 2;
            this.invalidTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearInvalidTime() {
            this.bitField0_ &= -3;
            this.invalidTime_ = 0;
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

   public static final class C2S_UnionHead_17501 extends GeneratedMessageV3 implements C2S_UnionHead_17501OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_UnionHead_17501 DEFAULT_INSTANCE = new C2S_UnionHead_17501();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UnionHead_17501> PARSER = new AbstractParser<C2S_UnionHead_17501>() {
         public C2S_UnionHead_17501 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UnionHead_17501(input, extensionRegistry);
         }
      };

      private C2S_UnionHead_17501(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UnionHead_17501() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UnionHead_17501();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UnionHead_17501(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionHead_17501_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionHead_17501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnionHead_17501.class, Builder.class);
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
         } else if (!(obj instanceof C2S_UnionHead_17501)) {
            return super.equals(obj);
         } else {
            C2S_UnionHead_17501 other = (C2S_UnionHead_17501)obj;
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

      public static C2S_UnionHead_17501 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UnionHead_17501)PARSER.parseFrom(data);
      }

      public static C2S_UnionHead_17501 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnionHead_17501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnionHead_17501 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UnionHead_17501)PARSER.parseFrom(data);
      }

      public static C2S_UnionHead_17501 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnionHead_17501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnionHead_17501 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UnionHead_17501)PARSER.parseFrom(data);
      }

      public static C2S_UnionHead_17501 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnionHead_17501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnionHead_17501 parseFrom(InputStream input) throws IOException {
         return (C2S_UnionHead_17501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnionHead_17501 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnionHead_17501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnionHead_17501 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UnionHead_17501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UnionHead_17501 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnionHead_17501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnionHead_17501 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UnionHead_17501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnionHead_17501 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnionHead_17501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UnionHead_17501 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UnionHead_17501 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UnionHead_17501> parser() {
         return PARSER;
      }

      public Parser<C2S_UnionHead_17501> getParserForType() {
         return PARSER;
      }

      public C2S_UnionHead_17501 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UnionHead_17501OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionHead_17501_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionHead_17501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnionHead_17501.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionExtendMsg.C2S_UnionHead_17501.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionHead_17501_descriptor;
         }

         public C2S_UnionHead_17501 getDefaultInstanceForType() {
            return UnionExtendMsg.C2S_UnionHead_17501.getDefaultInstance();
         }

         public C2S_UnionHead_17501 build() {
            C2S_UnionHead_17501 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UnionHead_17501 buildPartial() {
            C2S_UnionHead_17501 result = new C2S_UnionHead_17501(this);
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
            if (other instanceof C2S_UnionHead_17501) {
               return this.mergeFrom((C2S_UnionHead_17501)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UnionHead_17501 other) {
            if (other == UnionExtendMsg.C2S_UnionHead_17501.getDefaultInstance()) {
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
            C2S_UnionHead_17501 parsedMessage = null;

            try {
               parsedMessage = (C2S_UnionHead_17501)UnionExtendMsg.C2S_UnionHead_17501.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UnionHead_17501)e.getUnfinishedMessage();
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

   public static final class S2C_UnionHead_17502 extends GeneratedMessageV3 implements S2C_UnionHead_17502OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int HEAD_FIELD_NUMBER = 1;
      private List<UnionHeadData> head_;
      private byte memoizedIsInitialized;
      private static final S2C_UnionHead_17502 DEFAULT_INSTANCE = new S2C_UnionHead_17502();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UnionHead_17502> PARSER = new AbstractParser<S2C_UnionHead_17502>() {
         public S2C_UnionHead_17502 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UnionHead_17502(input, extensionRegistry);
         }
      };

      private S2C_UnionHead_17502(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UnionHead_17502() {
         this.memoizedIsInitialized = -1;
         this.head_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UnionHead_17502();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UnionHead_17502(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.head_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.head_.add(input.readMessage(UnionExtendMsg.UnionHeadData.PARSER, extensionRegistry));
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
                  this.head_ = Collections.unmodifiableList(this.head_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionHead_17502_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionHead_17502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnionHead_17502.class, Builder.class);
      }

      public List<UnionHeadData> getHeadList() {
         return this.head_;
      }

      public List<? extends UnionHeadDataOrBuilder> getHeadOrBuilderList() {
         return this.head_;
      }

      public int getHeadCount() {
         return this.head_.size();
      }

      public UnionHeadData getHead(int index) {
         return (UnionHeadData)this.head_.get(index);
      }

      public UnionHeadDataOrBuilder getHeadOrBuilder(int index) {
         return (UnionHeadDataOrBuilder)this.head_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getHeadCount(); ++i) {
               if (!this.getHead(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.head_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.head_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.head_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.head_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UnionHead_17502)) {
            return super.equals(obj);
         } else {
            S2C_UnionHead_17502 other = (S2C_UnionHead_17502)obj;
            if (!this.getHeadList().equals(other.getHeadList())) {
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
            if (this.getHeadCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeadList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UnionHead_17502 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UnionHead_17502)PARSER.parseFrom(data);
      }

      public static S2C_UnionHead_17502 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnionHead_17502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnionHead_17502 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UnionHead_17502)PARSER.parseFrom(data);
      }

      public static S2C_UnionHead_17502 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnionHead_17502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnionHead_17502 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UnionHead_17502)PARSER.parseFrom(data);
      }

      public static S2C_UnionHead_17502 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnionHead_17502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnionHead_17502 parseFrom(InputStream input) throws IOException {
         return (S2C_UnionHead_17502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnionHead_17502 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnionHead_17502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnionHead_17502 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UnionHead_17502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UnionHead_17502 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnionHead_17502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnionHead_17502 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UnionHead_17502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnionHead_17502 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnionHead_17502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UnionHead_17502 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UnionHead_17502 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UnionHead_17502> parser() {
         return PARSER;
      }

      public Parser<S2C_UnionHead_17502> getParserForType() {
         return PARSER;
      }

      public S2C_UnionHead_17502 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UnionHead_17502OrBuilder {
         private int bitField0_;
         private List<UnionHeadData> head_;
         private RepeatedFieldBuilderV3<UnionHeadData, UnionHeadData.Builder, UnionHeadDataOrBuilder> headBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionHead_17502_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionHead_17502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnionHead_17502.class, Builder.class);
         }

         private Builder() {
            this.head_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.head_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionExtendMsg.S2C_UnionHead_17502.alwaysUseFieldBuilders) {
               this.getHeadFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.headBuilder_ == null) {
               this.head_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.headBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionHead_17502_descriptor;
         }

         public S2C_UnionHead_17502 getDefaultInstanceForType() {
            return UnionExtendMsg.S2C_UnionHead_17502.getDefaultInstance();
         }

         public S2C_UnionHead_17502 build() {
            S2C_UnionHead_17502 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UnionHead_17502 buildPartial() {
            S2C_UnionHead_17502 result = new S2C_UnionHead_17502(this);
            int from_bitField0_ = this.bitField0_;
            if (this.headBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.head_ = Collections.unmodifiableList(this.head_);
                  this.bitField0_ &= -2;
               }

               result.head_ = this.head_;
            } else {
               result.head_ = this.headBuilder_.build();
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
            if (other instanceof S2C_UnionHead_17502) {
               return this.mergeFrom((S2C_UnionHead_17502)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UnionHead_17502 other) {
            if (other == UnionExtendMsg.S2C_UnionHead_17502.getDefaultInstance()) {
               return this;
            } else {
               if (this.headBuilder_ == null) {
                  if (!other.head_.isEmpty()) {
                     if (this.head_.isEmpty()) {
                        this.head_ = other.head_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureHeadIsMutable();
                        this.head_.addAll(other.head_);
                     }

                     this.onChanged();
                  }
               } else if (!other.head_.isEmpty()) {
                  if (this.headBuilder_.isEmpty()) {
                     this.headBuilder_.dispose();
                     this.headBuilder_ = null;
                     this.head_ = other.head_;
                     this.bitField0_ &= -2;
                     this.headBuilder_ = UnionExtendMsg.S2C_UnionHead_17502.alwaysUseFieldBuilders ? this.getHeadFieldBuilder() : null;
                  } else {
                     this.headBuilder_.addAllMessages(other.head_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getHeadCount(); ++i) {
               if (!this.getHead(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UnionHead_17502 parsedMessage = null;

            try {
               parsedMessage = (S2C_UnionHead_17502)UnionExtendMsg.S2C_UnionHead_17502.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UnionHead_17502)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureHeadIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.head_ = new ArrayList(this.head_);
               this.bitField0_ |= 1;
            }

         }

         public List<UnionHeadData> getHeadList() {
            return this.headBuilder_ == null ? Collections.unmodifiableList(this.head_) : this.headBuilder_.getMessageList();
         }

         public int getHeadCount() {
            return this.headBuilder_ == null ? this.head_.size() : this.headBuilder_.getCount();
         }

         public UnionHeadData getHead(int index) {
            return this.headBuilder_ == null ? (UnionHeadData)this.head_.get(index) : (UnionHeadData)this.headBuilder_.getMessage(index);
         }

         public Builder setHead(int index, UnionHeadData value) {
            if (this.headBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeadIsMutable();
               this.head_.set(index, value);
               this.onChanged();
            } else {
               this.headBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setHead(int index, UnionHeadData.Builder builderForValue) {
            if (this.headBuilder_ == null) {
               this.ensureHeadIsMutable();
               this.head_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.headBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHead(UnionHeadData value) {
            if (this.headBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeadIsMutable();
               this.head_.add(value);
               this.onChanged();
            } else {
               this.headBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addHead(int index, UnionHeadData value) {
            if (this.headBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeadIsMutable();
               this.head_.add(index, value);
               this.onChanged();
            } else {
               this.headBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addHead(UnionHeadData.Builder builderForValue) {
            if (this.headBuilder_ == null) {
               this.ensureHeadIsMutable();
               this.head_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.headBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHead(int index, UnionHeadData.Builder builderForValue) {
            if (this.headBuilder_ == null) {
               this.ensureHeadIsMutable();
               this.head_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.headBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHead(Iterable<? extends UnionHeadData> values) {
            if (this.headBuilder_ == null) {
               this.ensureHeadIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.head_);
               this.onChanged();
            } else {
               this.headBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearHead() {
            if (this.headBuilder_ == null) {
               this.head_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.headBuilder_.clear();
            }

            return this;
         }

         public Builder removeHead(int index) {
            if (this.headBuilder_ == null) {
               this.ensureHeadIsMutable();
               this.head_.remove(index);
               this.onChanged();
            } else {
               this.headBuilder_.remove(index);
            }

            return this;
         }

         public UnionHeadData.Builder getHeadBuilder(int index) {
            return (UnionHeadData.Builder)this.getHeadFieldBuilder().getBuilder(index);
         }

         public UnionHeadDataOrBuilder getHeadOrBuilder(int index) {
            return this.headBuilder_ == null ? (UnionHeadDataOrBuilder)this.head_.get(index) : (UnionHeadDataOrBuilder)this.headBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends UnionHeadDataOrBuilder> getHeadOrBuilderList() {
            return this.headBuilder_ != null ? this.headBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.head_);
         }

         public UnionHeadData.Builder addHeadBuilder() {
            return (UnionHeadData.Builder)this.getHeadFieldBuilder().addBuilder(UnionExtendMsg.UnionHeadData.getDefaultInstance());
         }

         public UnionHeadData.Builder addHeadBuilder(int index) {
            return (UnionHeadData.Builder)this.getHeadFieldBuilder().addBuilder(index, UnionExtendMsg.UnionHeadData.getDefaultInstance());
         }

         public List<UnionHeadData.Builder> getHeadBuilderList() {
            return this.getHeadFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<UnionHeadData, UnionHeadData.Builder, UnionHeadDataOrBuilder> getHeadFieldBuilder() {
            if (this.headBuilder_ == null) {
               this.headBuilder_ = new RepeatedFieldBuilderV3(this.head_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.head_ = null;
            }

            return this.headBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_UnionSettingHead_17503 extends GeneratedMessageV3 implements C2S_UnionSettingHead_17503OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHOICEHEAD_FIELD_NUMBER = 1;
      private int choiceHead_;
      private byte memoizedIsInitialized;
      private static final C2S_UnionSettingHead_17503 DEFAULT_INSTANCE = new C2S_UnionSettingHead_17503();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UnionSettingHead_17503> PARSER = new AbstractParser<C2S_UnionSettingHead_17503>() {
         public C2S_UnionSettingHead_17503 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UnionSettingHead_17503(input, extensionRegistry);
         }
      };

      private C2S_UnionSettingHead_17503(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UnionSettingHead_17503() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UnionSettingHead_17503();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UnionSettingHead_17503(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.choiceHead_ = input.readInt32();
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
         return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionSettingHead_17503_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionSettingHead_17503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnionSettingHead_17503.class, Builder.class);
      }

      public boolean hasChoiceHead() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChoiceHead() {
         return this.choiceHead_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChoiceHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.choiceHead_);
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
               size += CodedOutputStream.computeInt32Size(1, this.choiceHead_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_UnionSettingHead_17503)) {
            return super.equals(obj);
         } else {
            C2S_UnionSettingHead_17503 other = (C2S_UnionSettingHead_17503)obj;
            if (this.hasChoiceHead() != other.hasChoiceHead()) {
               return false;
            } else if (this.hasChoiceHead() && this.getChoiceHead() != other.getChoiceHead()) {
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
            if (this.hasChoiceHead()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChoiceHead();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_UnionSettingHead_17503 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UnionSettingHead_17503)PARSER.parseFrom(data);
      }

      public static C2S_UnionSettingHead_17503 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnionSettingHead_17503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnionSettingHead_17503 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UnionSettingHead_17503)PARSER.parseFrom(data);
      }

      public static C2S_UnionSettingHead_17503 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnionSettingHead_17503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnionSettingHead_17503 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UnionSettingHead_17503)PARSER.parseFrom(data);
      }

      public static C2S_UnionSettingHead_17503 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnionSettingHead_17503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnionSettingHead_17503 parseFrom(InputStream input) throws IOException {
         return (C2S_UnionSettingHead_17503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnionSettingHead_17503 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnionSettingHead_17503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnionSettingHead_17503 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UnionSettingHead_17503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UnionSettingHead_17503 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnionSettingHead_17503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnionSettingHead_17503 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UnionSettingHead_17503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnionSettingHead_17503 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnionSettingHead_17503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UnionSettingHead_17503 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UnionSettingHead_17503 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UnionSettingHead_17503> parser() {
         return PARSER;
      }

      public Parser<C2S_UnionSettingHead_17503> getParserForType() {
         return PARSER;
      }

      public C2S_UnionSettingHead_17503 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UnionSettingHead_17503OrBuilder {
         private int bitField0_;
         private int choiceHead_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionSettingHead_17503_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionSettingHead_17503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnionSettingHead_17503.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionExtendMsg.C2S_UnionSettingHead_17503.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.choiceHead_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionSettingHead_17503_descriptor;
         }

         public C2S_UnionSettingHead_17503 getDefaultInstanceForType() {
            return UnionExtendMsg.C2S_UnionSettingHead_17503.getDefaultInstance();
         }

         public C2S_UnionSettingHead_17503 build() {
            C2S_UnionSettingHead_17503 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UnionSettingHead_17503 buildPartial() {
            C2S_UnionSettingHead_17503 result = new C2S_UnionSettingHead_17503(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.choiceHead_ = this.choiceHead_;
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
            if (other instanceof C2S_UnionSettingHead_17503) {
               return this.mergeFrom((C2S_UnionSettingHead_17503)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UnionSettingHead_17503 other) {
            if (other == UnionExtendMsg.C2S_UnionSettingHead_17503.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChoiceHead()) {
                  this.setChoiceHead(other.getChoiceHead());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasChoiceHead();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_UnionSettingHead_17503 parsedMessage = null;

            try {
               parsedMessage = (C2S_UnionSettingHead_17503)UnionExtendMsg.C2S_UnionSettingHead_17503.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UnionSettingHead_17503)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChoiceHead() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getChoiceHead() {
            return this.choiceHead_;
         }

         public Builder setChoiceHead(int value) {
            this.bitField0_ |= 1;
            this.choiceHead_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChoiceHead() {
            this.bitField0_ &= -2;
            this.choiceHead_ = 0;
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

   public static final class S2C_UnionSettingHead_17504 extends GeneratedMessageV3 implements S2C_UnionSettingHead_17504OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHOICEHEAD_FIELD_NUMBER = 1;
      private int choiceHead_;
      private byte memoizedIsInitialized;
      private static final S2C_UnionSettingHead_17504 DEFAULT_INSTANCE = new S2C_UnionSettingHead_17504();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UnionSettingHead_17504> PARSER = new AbstractParser<S2C_UnionSettingHead_17504>() {
         public S2C_UnionSettingHead_17504 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UnionSettingHead_17504(input, extensionRegistry);
         }
      };

      private S2C_UnionSettingHead_17504(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UnionSettingHead_17504() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UnionSettingHead_17504();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UnionSettingHead_17504(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.choiceHead_ = input.readInt32();
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
         return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionSettingHead_17504_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionSettingHead_17504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnionSettingHead_17504.class, Builder.class);
      }

      public boolean hasChoiceHead() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChoiceHead() {
         return this.choiceHead_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChoiceHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.choiceHead_);
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
               size += CodedOutputStream.computeInt32Size(1, this.choiceHead_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UnionSettingHead_17504)) {
            return super.equals(obj);
         } else {
            S2C_UnionSettingHead_17504 other = (S2C_UnionSettingHead_17504)obj;
            if (this.hasChoiceHead() != other.hasChoiceHead()) {
               return false;
            } else if (this.hasChoiceHead() && this.getChoiceHead() != other.getChoiceHead()) {
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
            if (this.hasChoiceHead()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChoiceHead();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UnionSettingHead_17504 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UnionSettingHead_17504)PARSER.parseFrom(data);
      }

      public static S2C_UnionSettingHead_17504 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnionSettingHead_17504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnionSettingHead_17504 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UnionSettingHead_17504)PARSER.parseFrom(data);
      }

      public static S2C_UnionSettingHead_17504 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnionSettingHead_17504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnionSettingHead_17504 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UnionSettingHead_17504)PARSER.parseFrom(data);
      }

      public static S2C_UnionSettingHead_17504 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnionSettingHead_17504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnionSettingHead_17504 parseFrom(InputStream input) throws IOException {
         return (S2C_UnionSettingHead_17504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnionSettingHead_17504 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnionSettingHead_17504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnionSettingHead_17504 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UnionSettingHead_17504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UnionSettingHead_17504 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnionSettingHead_17504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnionSettingHead_17504 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UnionSettingHead_17504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnionSettingHead_17504 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnionSettingHead_17504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UnionSettingHead_17504 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UnionSettingHead_17504 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UnionSettingHead_17504> parser() {
         return PARSER;
      }

      public Parser<S2C_UnionSettingHead_17504> getParserForType() {
         return PARSER;
      }

      public S2C_UnionSettingHead_17504 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UnionSettingHead_17504OrBuilder {
         private int bitField0_;
         private int choiceHead_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionSettingHead_17504_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionSettingHead_17504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnionSettingHead_17504.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionExtendMsg.S2C_UnionSettingHead_17504.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.choiceHead_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionSettingHead_17504_descriptor;
         }

         public S2C_UnionSettingHead_17504 getDefaultInstanceForType() {
            return UnionExtendMsg.S2C_UnionSettingHead_17504.getDefaultInstance();
         }

         public S2C_UnionSettingHead_17504 build() {
            S2C_UnionSettingHead_17504 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UnionSettingHead_17504 buildPartial() {
            S2C_UnionSettingHead_17504 result = new S2C_UnionSettingHead_17504(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.choiceHead_ = this.choiceHead_;
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
            if (other instanceof S2C_UnionSettingHead_17504) {
               return this.mergeFrom((S2C_UnionSettingHead_17504)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UnionSettingHead_17504 other) {
            if (other == UnionExtendMsg.S2C_UnionSettingHead_17504.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChoiceHead()) {
                  this.setChoiceHead(other.getChoiceHead());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasChoiceHead();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UnionSettingHead_17504 parsedMessage = null;

            try {
               parsedMessage = (S2C_UnionSettingHead_17504)UnionExtendMsg.S2C_UnionSettingHead_17504.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UnionSettingHead_17504)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChoiceHead() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getChoiceHead() {
            return this.choiceHead_;
         }

         public Builder setChoiceHead(int value) {
            this.bitField0_ |= 1;
            this.choiceHead_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChoiceHead() {
            this.bitField0_ &= -2;
            this.choiceHead_ = 0;
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

   public static final class C2S_UnionAddNumber_17505 extends GeneratedMessageV3 implements C2S_UnionAddNumber_17505OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_UnionAddNumber_17505 DEFAULT_INSTANCE = new C2S_UnionAddNumber_17505();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UnionAddNumber_17505> PARSER = new AbstractParser<C2S_UnionAddNumber_17505>() {
         public C2S_UnionAddNumber_17505 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UnionAddNumber_17505(input, extensionRegistry);
         }
      };

      private C2S_UnionAddNumber_17505(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UnionAddNumber_17505() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UnionAddNumber_17505();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UnionAddNumber_17505(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionAddNumber_17505_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionAddNumber_17505_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnionAddNumber_17505.class, Builder.class);
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
         } else if (!(obj instanceof C2S_UnionAddNumber_17505)) {
            return super.equals(obj);
         } else {
            C2S_UnionAddNumber_17505 other = (C2S_UnionAddNumber_17505)obj;
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

      public static C2S_UnionAddNumber_17505 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UnionAddNumber_17505)PARSER.parseFrom(data);
      }

      public static C2S_UnionAddNumber_17505 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnionAddNumber_17505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnionAddNumber_17505 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UnionAddNumber_17505)PARSER.parseFrom(data);
      }

      public static C2S_UnionAddNumber_17505 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnionAddNumber_17505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnionAddNumber_17505 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UnionAddNumber_17505)PARSER.parseFrom(data);
      }

      public static C2S_UnionAddNumber_17505 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnionAddNumber_17505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnionAddNumber_17505 parseFrom(InputStream input) throws IOException {
         return (C2S_UnionAddNumber_17505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnionAddNumber_17505 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnionAddNumber_17505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnionAddNumber_17505 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UnionAddNumber_17505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UnionAddNumber_17505 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnionAddNumber_17505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnionAddNumber_17505 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UnionAddNumber_17505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnionAddNumber_17505 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnionAddNumber_17505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UnionAddNumber_17505 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UnionAddNumber_17505 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UnionAddNumber_17505> parser() {
         return PARSER;
      }

      public Parser<C2S_UnionAddNumber_17505> getParserForType() {
         return PARSER;
      }

      public C2S_UnionAddNumber_17505 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UnionAddNumber_17505OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionAddNumber_17505_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionAddNumber_17505_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnionAddNumber_17505.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionExtendMsg.C2S_UnionAddNumber_17505.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_C2S_UnionAddNumber_17505_descriptor;
         }

         public C2S_UnionAddNumber_17505 getDefaultInstanceForType() {
            return UnionExtendMsg.C2S_UnionAddNumber_17505.getDefaultInstance();
         }

         public C2S_UnionAddNumber_17505 build() {
            C2S_UnionAddNumber_17505 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UnionAddNumber_17505 buildPartial() {
            C2S_UnionAddNumber_17505 result = new C2S_UnionAddNumber_17505(this);
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
            if (other instanceof C2S_UnionAddNumber_17505) {
               return this.mergeFrom((C2S_UnionAddNumber_17505)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UnionAddNumber_17505 other) {
            if (other == UnionExtendMsg.C2S_UnionAddNumber_17505.getDefaultInstance()) {
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
            C2S_UnionAddNumber_17505 parsedMessage = null;

            try {
               parsedMessage = (C2S_UnionAddNumber_17505)UnionExtendMsg.C2S_UnionAddNumber_17505.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UnionAddNumber_17505)e.getUnfinishedMessage();
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

   public static final class S2C_UnionAddNumber_17506 extends GeneratedMessageV3 implements S2C_UnionAddNumber_17506OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CURUNIONADDNUMBERID_FIELD_NUMBER = 1;
      private int curUnionAddNumberId_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      private byte memoizedIsInitialized;
      private static final S2C_UnionAddNumber_17506 DEFAULT_INSTANCE = new S2C_UnionAddNumber_17506();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UnionAddNumber_17506> PARSER = new AbstractParser<S2C_UnionAddNumber_17506>() {
         public S2C_UnionAddNumber_17506 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UnionAddNumber_17506(input, extensionRegistry);
         }
      };

      private S2C_UnionAddNumber_17506(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UnionAddNumber_17506() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UnionAddNumber_17506();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UnionAddNumber_17506(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.curUnionAddNumberId_ = input.readInt32();
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
         return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionAddNumber_17506_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionAddNumber_17506_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnionAddNumber_17506.class, Builder.class);
      }

      public boolean hasCurUnionAddNumberId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCurUnionAddNumberId() {
         return this.curUnionAddNumberId_;
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
         } else if (!this.hasCurUnionAddNumberId()) {
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
            output.writeInt32(1, this.curUnionAddNumberId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.curUnionAddNumberId_);
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
         } else if (!(obj instanceof S2C_UnionAddNumber_17506)) {
            return super.equals(obj);
         } else {
            S2C_UnionAddNumber_17506 other = (S2C_UnionAddNumber_17506)obj;
            if (this.hasCurUnionAddNumberId() != other.hasCurUnionAddNumberId()) {
               return false;
            } else if (this.hasCurUnionAddNumberId() && this.getCurUnionAddNumberId() != other.getCurUnionAddNumberId()) {
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
            if (this.hasCurUnionAddNumberId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCurUnionAddNumberId();
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

      public static S2C_UnionAddNumber_17506 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UnionAddNumber_17506)PARSER.parseFrom(data);
      }

      public static S2C_UnionAddNumber_17506 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnionAddNumber_17506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnionAddNumber_17506 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UnionAddNumber_17506)PARSER.parseFrom(data);
      }

      public static S2C_UnionAddNumber_17506 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnionAddNumber_17506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnionAddNumber_17506 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UnionAddNumber_17506)PARSER.parseFrom(data);
      }

      public static S2C_UnionAddNumber_17506 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnionAddNumber_17506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnionAddNumber_17506 parseFrom(InputStream input) throws IOException {
         return (S2C_UnionAddNumber_17506)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnionAddNumber_17506 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnionAddNumber_17506)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnionAddNumber_17506 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UnionAddNumber_17506)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UnionAddNumber_17506 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnionAddNumber_17506)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnionAddNumber_17506 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UnionAddNumber_17506)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnionAddNumber_17506 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnionAddNumber_17506)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UnionAddNumber_17506 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UnionAddNumber_17506 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UnionAddNumber_17506> parser() {
         return PARSER;
      }

      public Parser<S2C_UnionAddNumber_17506> getParserForType() {
         return PARSER;
      }

      public S2C_UnionAddNumber_17506 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UnionAddNumber_17506OrBuilder {
         private int bitField0_;
         private int curUnionAddNumberId_;
         private int playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionAddNumber_17506_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionAddNumber_17506_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnionAddNumber_17506.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionExtendMsg.S2C_UnionAddNumber_17506.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.curUnionAddNumberId_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionExtendMsg.internal_static_unionExtend_com_gzbz_protobuf_S2C_UnionAddNumber_17506_descriptor;
         }

         public S2C_UnionAddNumber_17506 getDefaultInstanceForType() {
            return UnionExtendMsg.S2C_UnionAddNumber_17506.getDefaultInstance();
         }

         public S2C_UnionAddNumber_17506 build() {
            S2C_UnionAddNumber_17506 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UnionAddNumber_17506 buildPartial() {
            S2C_UnionAddNumber_17506 result = new S2C_UnionAddNumber_17506(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.curUnionAddNumberId_ = this.curUnionAddNumberId_;
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
            if (other instanceof S2C_UnionAddNumber_17506) {
               return this.mergeFrom((S2C_UnionAddNumber_17506)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UnionAddNumber_17506 other) {
            if (other == UnionExtendMsg.S2C_UnionAddNumber_17506.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCurUnionAddNumberId()) {
                  this.setCurUnionAddNumberId(other.getCurUnionAddNumberId());
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
            if (!this.hasCurUnionAddNumberId()) {
               return false;
            } else {
               return this.hasPlayerId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UnionAddNumber_17506 parsedMessage = null;

            try {
               parsedMessage = (S2C_UnionAddNumber_17506)UnionExtendMsg.S2C_UnionAddNumber_17506.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UnionAddNumber_17506)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCurUnionAddNumberId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCurUnionAddNumberId() {
            return this.curUnionAddNumberId_;
         }

         public Builder setCurUnionAddNumberId(int value) {
            this.bitField0_ |= 1;
            this.curUnionAddNumberId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurUnionAddNumberId() {
            this.bitField0_ &= -2;
            this.curUnionAddNumberId_ = 0;
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

   public interface C2S_UnionAddNumber_17505OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_UnionHead_17501OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_UnionSettingHead_17503OrBuilder extends MessageOrBuilder {
      boolean hasChoiceHead();

      int getChoiceHead();
   }

   public interface S2C_UnionAddNumber_17506OrBuilder extends MessageOrBuilder {
      boolean hasCurUnionAddNumberId();

      int getCurUnionAddNumberId();

      boolean hasPlayerId();

      int getPlayerId();
   }

   public interface S2C_UnionHead_17502OrBuilder extends MessageOrBuilder {
      List<UnionHeadData> getHeadList();

      UnionHeadData getHead(int index);

      int getHeadCount();

      List<? extends UnionHeadDataOrBuilder> getHeadOrBuilderList();

      UnionHeadDataOrBuilder getHeadOrBuilder(int index);
   }

   public interface S2C_UnionSettingHead_17504OrBuilder extends MessageOrBuilder {
      boolean hasChoiceHead();

      int getChoiceHead();
   }

   public interface UnionHeadDataOrBuilder extends MessageOrBuilder {
      boolean hasHead();

      int getHead();

      boolean hasInvalidTime();

      int getInvalidTime();
   }
}
