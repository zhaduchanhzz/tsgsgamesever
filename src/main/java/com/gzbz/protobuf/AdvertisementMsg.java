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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class AdvertisementMsg {
   private static final Descriptors.Descriptor internal_static_advertisement_com_gzbz_protobuf_VN_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_advertisement_com_gzbz_protobuf_VN_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_advertisement_com_gzbz_protobuf_C2S_VNMain_21701_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_advertisement_com_gzbz_protobuf_C2S_VNMain_21701_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_advertisement_com_gzbz_protobuf_S2C_VNMain_21702_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_advertisement_com_gzbz_protobuf_S2C_VNMain_21702_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_advertisement_com_gzbz_protobuf_C2S_VNReward_21703_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_advertisement_com_gzbz_protobuf_C2S_VNReward_21703_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_advertisement_com_gzbz_protobuf_S2C_VNReward_21704_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_advertisement_com_gzbz_protobuf_S2C_VNReward_21704_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private AdvertisementMsg() {
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
      String[] descriptorData = new String[]{"\n\u0013Advertisement.proto\u0012\u001fadvertisement.com.gzbz.protobuf\"+\n\u0002VN\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004time\u0018\u0003 \u0002(\u0005\"\u0012\n\u0010C2S_VNMain_21701\"E\n\u0010S2C_VNMain_21702\u00121\n\u0004data\u0018\u0001 \u0003(\u000b2#.advertisement.com.gzbz.protobuf.VN\" \n\u0012C2S_VNReward_21703\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"G\n\u0012S2C_VNReward_21704\u00121\n\u0004data\u0018\u0001 \u0002(\u000b2#.advertisement.com.gzbz.protobuf.VNB'\n\u0011com.gzbz.protobufB\u0010AdvertisementMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_advertisement_com_gzbz_protobuf_VN_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_advertisement_com_gzbz_protobuf_VN_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_advertisement_com_gzbz_protobuf_VN_descriptor, new String[]{"Id", "Num", "Time"});
      internal_static_advertisement_com_gzbz_protobuf_C2S_VNMain_21701_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_advertisement_com_gzbz_protobuf_C2S_VNMain_21701_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_advertisement_com_gzbz_protobuf_C2S_VNMain_21701_descriptor, new String[0]);
      internal_static_advertisement_com_gzbz_protobuf_S2C_VNMain_21702_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_advertisement_com_gzbz_protobuf_S2C_VNMain_21702_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_advertisement_com_gzbz_protobuf_S2C_VNMain_21702_descriptor, new String[]{"Data"});
      internal_static_advertisement_com_gzbz_protobuf_C2S_VNReward_21703_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_advertisement_com_gzbz_protobuf_C2S_VNReward_21703_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_advertisement_com_gzbz_protobuf_C2S_VNReward_21703_descriptor, new String[]{"Id"});
      internal_static_advertisement_com_gzbz_protobuf_S2C_VNReward_21704_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_advertisement_com_gzbz_protobuf_S2C_VNReward_21704_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_advertisement_com_gzbz_protobuf_S2C_VNReward_21704_descriptor, new String[]{"Data"});
   }

   public static final class VN extends GeneratedMessageV3 implements VNOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      public static final int TIME_FIELD_NUMBER = 3;
      private int time_;
      private byte memoizedIsInitialized;
      private static final VN DEFAULT_INSTANCE = new VN();
      /** @deprecated */
      @Deprecated
      public static final Parser<VN> PARSER = new AbstractParser<VN>() {
         public VN parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new VN(input, extensionRegistry);
         }
      };

      private VN(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private VN() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new VN();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private VN(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.num_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.time_ = input.readInt32();
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
         return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_VN_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_VN_fieldAccessorTable.ensureFieldAccessorsInitialized(VN.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public boolean hasTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getTime() {
         return this.time_;
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
         } else if (!this.hasNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTime()) {
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
            output.writeInt32(2, this.num_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.time_);
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
               size += CodedOutputStream.computeInt32Size(2, this.num_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.time_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof VN)) {
            return super.equals(obj);
         } else {
            VN other = (VN)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
               return false;
            } else if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
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

            if (this.hasNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getNum();
            }

            if (this.hasTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static VN parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (VN)PARSER.parseFrom(data);
      }

      public static VN parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (VN)PARSER.parseFrom(data, extensionRegistry);
      }

      public static VN parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (VN)PARSER.parseFrom(data);
      }

      public static VN parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (VN)PARSER.parseFrom(data, extensionRegistry);
      }

      public static VN parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (VN)PARSER.parseFrom(data);
      }

      public static VN parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (VN)PARSER.parseFrom(data, extensionRegistry);
      }

      public static VN parseFrom(InputStream input) throws IOException {
         return (VN)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static VN parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (VN)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static VN parseDelimitedFrom(InputStream input) throws IOException {
         return (VN)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static VN parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (VN)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static VN parseFrom(CodedInputStream input) throws IOException {
         return (VN)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static VN parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (VN)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(VN prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static VN getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<VN> parser() {
         return PARSER;
      }

      public Parser<VN> getParserForType() {
         return PARSER;
      }

      public VN getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VNOrBuilder {
         private int bitField0_;
         private int id_;
         private int num_;
         private int time_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_VN_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_VN_fieldAccessorTable.ensureFieldAccessorsInitialized(VN.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AdvertisementMsg.VN.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            this.time_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_VN_descriptor;
         }

         public VN getDefaultInstanceForType() {
            return AdvertisementMsg.VN.getDefaultInstance();
         }

         public VN build() {
            VN result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public VN buildPartial() {
            VN result = new VN(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.num_ = this.num_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.time_ = this.time_;
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
            if (other instanceof VN) {
               return this.mergeFrom((VN)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(VN other) {
            if (other == AdvertisementMsg.VN.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               if (other.hasTime()) {
                  this.setTime(other.getTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else if (!this.hasNum()) {
               return false;
            } else {
               return this.hasTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            VN parsedMessage = null;

            try {
               parsedMessage = (VN)AdvertisementMsg.VN.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (VN)e.getUnfinishedMessage();
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

         public boolean hasNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 2;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -3;
            this.num_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getTime() {
            return this.time_;
         }

         public Builder setTime(int value) {
            this.bitField0_ |= 4;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -5;
            this.time_ = 0;
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

   public static final class C2S_VNMain_21701 extends GeneratedMessageV3 implements C2S_VNMain_21701OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_VNMain_21701 DEFAULT_INSTANCE = new C2S_VNMain_21701();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_VNMain_21701> PARSER = new AbstractParser<C2S_VNMain_21701>() {
         public C2S_VNMain_21701 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_VNMain_21701(input, extensionRegistry);
         }
      };

      private C2S_VNMain_21701(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_VNMain_21701() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_VNMain_21701();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_VNMain_21701(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_C2S_VNMain_21701_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_C2S_VNMain_21701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_VNMain_21701.class, Builder.class);
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
         } else if (!(obj instanceof C2S_VNMain_21701)) {
            return super.equals(obj);
         } else {
            C2S_VNMain_21701 other = (C2S_VNMain_21701)obj;
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

      public static C2S_VNMain_21701 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_VNMain_21701)PARSER.parseFrom(data);
      }

      public static C2S_VNMain_21701 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VNMain_21701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VNMain_21701 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_VNMain_21701)PARSER.parseFrom(data);
      }

      public static C2S_VNMain_21701 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VNMain_21701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VNMain_21701 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_VNMain_21701)PARSER.parseFrom(data);
      }

      public static C2S_VNMain_21701 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VNMain_21701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VNMain_21701 parseFrom(InputStream input) throws IOException {
         return (C2S_VNMain_21701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_VNMain_21701 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VNMain_21701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_VNMain_21701 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_VNMain_21701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_VNMain_21701 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VNMain_21701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_VNMain_21701 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_VNMain_21701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_VNMain_21701 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VNMain_21701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_VNMain_21701 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_VNMain_21701 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_VNMain_21701> parser() {
         return PARSER;
      }

      public Parser<C2S_VNMain_21701> getParserForType() {
         return PARSER;
      }

      public C2S_VNMain_21701 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_VNMain_21701OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_C2S_VNMain_21701_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_C2S_VNMain_21701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_VNMain_21701.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AdvertisementMsg.C2S_VNMain_21701.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_C2S_VNMain_21701_descriptor;
         }

         public C2S_VNMain_21701 getDefaultInstanceForType() {
            return AdvertisementMsg.C2S_VNMain_21701.getDefaultInstance();
         }

         public C2S_VNMain_21701 build() {
            C2S_VNMain_21701 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_VNMain_21701 buildPartial() {
            C2S_VNMain_21701 result = new C2S_VNMain_21701(this);
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
            if (other instanceof C2S_VNMain_21701) {
               return this.mergeFrom((C2S_VNMain_21701)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_VNMain_21701 other) {
            if (other == AdvertisementMsg.C2S_VNMain_21701.getDefaultInstance()) {
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
            C2S_VNMain_21701 parsedMessage = null;

            try {
               parsedMessage = (C2S_VNMain_21701)AdvertisementMsg.C2S_VNMain_21701.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_VNMain_21701)e.getUnfinishedMessage();
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

   public static final class S2C_VNMain_21702 extends GeneratedMessageV3 implements S2C_VNMain_21702OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int DATA_FIELD_NUMBER = 1;
      private List<VN> data_;
      private byte memoizedIsInitialized;
      private static final S2C_VNMain_21702 DEFAULT_INSTANCE = new S2C_VNMain_21702();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_VNMain_21702> PARSER = new AbstractParser<S2C_VNMain_21702>() {
         public S2C_VNMain_21702 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_VNMain_21702(input, extensionRegistry);
         }
      };

      private S2C_VNMain_21702(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_VNMain_21702() {
         this.memoizedIsInitialized = -1;
         this.data_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_VNMain_21702();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_VNMain_21702(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.data_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.data_.add(input.readMessage(AdvertisementMsg.VN.PARSER, extensionRegistry));
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
                  this.data_ = Collections.unmodifiableList(this.data_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_S2C_VNMain_21702_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_S2C_VNMain_21702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_VNMain_21702.class, Builder.class);
      }

      public List<VN> getDataList() {
         return this.data_;
      }

      public List<? extends VNOrBuilder> getDataOrBuilderList() {
         return this.data_;
      }

      public int getDataCount() {
         return this.data_.size();
      }

      public VN getData(int index) {
         return (VN)this.data_.get(index);
      }

      public VNOrBuilder getDataOrBuilder(int index) {
         return (VNOrBuilder)this.data_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getDataCount(); ++i) {
               if (!this.getData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.data_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.data_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.data_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.data_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_VNMain_21702)) {
            return super.equals(obj);
         } else {
            S2C_VNMain_21702 other = (S2C_VNMain_21702)obj;
            if (!this.getDataList().equals(other.getDataList())) {
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
            if (this.getDataCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_VNMain_21702 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_VNMain_21702)PARSER.parseFrom(data);
      }

      public static S2C_VNMain_21702 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_VNMain_21702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_VNMain_21702 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_VNMain_21702)PARSER.parseFrom(data);
      }

      public static S2C_VNMain_21702 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_VNMain_21702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_VNMain_21702 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_VNMain_21702)PARSER.parseFrom(data);
      }

      public static S2C_VNMain_21702 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_VNMain_21702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_VNMain_21702 parseFrom(InputStream input) throws IOException {
         return (S2C_VNMain_21702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_VNMain_21702 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_VNMain_21702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_VNMain_21702 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_VNMain_21702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_VNMain_21702 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_VNMain_21702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_VNMain_21702 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_VNMain_21702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_VNMain_21702 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_VNMain_21702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_VNMain_21702 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_VNMain_21702 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_VNMain_21702> parser() {
         return PARSER;
      }

      public Parser<S2C_VNMain_21702> getParserForType() {
         return PARSER;
      }

      public S2C_VNMain_21702 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_VNMain_21702OrBuilder {
         private int bitField0_;
         private List<VN> data_;
         private RepeatedFieldBuilderV3<VN, VN.Builder, VNOrBuilder> dataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_S2C_VNMain_21702_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_S2C_VNMain_21702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_VNMain_21702.class, Builder.class);
         }

         private Builder() {
            this.data_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.data_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AdvertisementMsg.S2C_VNMain_21702.alwaysUseFieldBuilders) {
               this.getDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.dataBuilder_ == null) {
               this.data_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.dataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_S2C_VNMain_21702_descriptor;
         }

         public S2C_VNMain_21702 getDefaultInstanceForType() {
            return AdvertisementMsg.S2C_VNMain_21702.getDefaultInstance();
         }

         public S2C_VNMain_21702 build() {
            S2C_VNMain_21702 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_VNMain_21702 buildPartial() {
            S2C_VNMain_21702 result = new S2C_VNMain_21702(this);
            int from_bitField0_ = this.bitField0_;
            if (this.dataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.data_ = Collections.unmodifiableList(this.data_);
                  this.bitField0_ &= -2;
               }

               result.data_ = this.data_;
            } else {
               result.data_ = this.dataBuilder_.build();
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
            if (other instanceof S2C_VNMain_21702) {
               return this.mergeFrom((S2C_VNMain_21702)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_VNMain_21702 other) {
            if (other == AdvertisementMsg.S2C_VNMain_21702.getDefaultInstance()) {
               return this;
            } else {
               if (this.dataBuilder_ == null) {
                  if (!other.data_.isEmpty()) {
                     if (this.data_.isEmpty()) {
                        this.data_ = other.data_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureDataIsMutable();
                        this.data_.addAll(other.data_);
                     }

                     this.onChanged();
                  }
               } else if (!other.data_.isEmpty()) {
                  if (this.dataBuilder_.isEmpty()) {
                     this.dataBuilder_.dispose();
                     this.dataBuilder_ = null;
                     this.data_ = other.data_;
                     this.bitField0_ &= -2;
                     this.dataBuilder_ = AdvertisementMsg.S2C_VNMain_21702.alwaysUseFieldBuilders ? this.getDataFieldBuilder() : null;
                  } else {
                     this.dataBuilder_.addAllMessages(other.data_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getDataCount(); ++i) {
               if (!this.getData(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_VNMain_21702 parsedMessage = null;

            try {
               parsedMessage = (S2C_VNMain_21702)AdvertisementMsg.S2C_VNMain_21702.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_VNMain_21702)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureDataIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.data_ = new ArrayList(this.data_);
               this.bitField0_ |= 1;
            }

         }

         public List<VN> getDataList() {
            return this.dataBuilder_ == null ? Collections.unmodifiableList(this.data_) : this.dataBuilder_.getMessageList();
         }

         public int getDataCount() {
            return this.dataBuilder_ == null ? this.data_.size() : this.dataBuilder_.getCount();
         }

         public VN getData(int index) {
            return this.dataBuilder_ == null ? (VN)this.data_.get(index) : (VN)this.dataBuilder_.getMessage(index);
         }

         public Builder setData(int index, VN value) {
            if (this.dataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDataIsMutable();
               this.data_.set(index, value);
               this.onChanged();
            } else {
               this.dataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setData(int index, VN.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addData(VN value) {
            if (this.dataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDataIsMutable();
               this.data_.add(value);
               this.onChanged();
            } else {
               this.dataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addData(int index, VN value) {
            if (this.dataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDataIsMutable();
               this.data_.add(index, value);
               this.onChanged();
            } else {
               this.dataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addData(VN.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.dataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addData(int index, VN.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllData(Iterable<? extends VN> values) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.data_);
               this.onChanged();
            } else {
               this.dataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearData() {
            if (this.dataBuilder_ == null) {
               this.data_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.dataBuilder_.clear();
            }

            return this;
         }

         public Builder removeData(int index) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.remove(index);
               this.onChanged();
            } else {
               this.dataBuilder_.remove(index);
            }

            return this;
         }

         public VN.Builder getDataBuilder(int index) {
            return (VN.Builder)this.getDataFieldBuilder().getBuilder(index);
         }

         public VNOrBuilder getDataOrBuilder(int index) {
            return this.dataBuilder_ == null ? (VNOrBuilder)this.data_.get(index) : (VNOrBuilder)this.dataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends VNOrBuilder> getDataOrBuilderList() {
            return this.dataBuilder_ != null ? this.dataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.data_);
         }

         public VN.Builder addDataBuilder() {
            return (VN.Builder)this.getDataFieldBuilder().addBuilder(AdvertisementMsg.VN.getDefaultInstance());
         }

         public VN.Builder addDataBuilder(int index) {
            return (VN.Builder)this.getDataFieldBuilder().addBuilder(index, AdvertisementMsg.VN.getDefaultInstance());
         }

         public List<VN.Builder> getDataBuilderList() {
            return this.getDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<VN, VN.Builder, VNOrBuilder> getDataFieldBuilder() {
            if (this.dataBuilder_ == null) {
               this.dataBuilder_ = new RepeatedFieldBuilderV3(this.data_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.data_ = null;
            }

            return this.dataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_VNReward_21703 extends GeneratedMessageV3 implements C2S_VNReward_21703OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_VNReward_21703 DEFAULT_INSTANCE = new C2S_VNReward_21703();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_VNReward_21703> PARSER = new AbstractParser<C2S_VNReward_21703>() {
         public C2S_VNReward_21703 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_VNReward_21703(input, extensionRegistry);
         }
      };

      private C2S_VNReward_21703(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_VNReward_21703() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_VNReward_21703();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_VNReward_21703(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_C2S_VNReward_21703_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_C2S_VNReward_21703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_VNReward_21703.class, Builder.class);
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
         } else if (!(obj instanceof C2S_VNReward_21703)) {
            return super.equals(obj);
         } else {
            C2S_VNReward_21703 other = (C2S_VNReward_21703)obj;
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

      public static C2S_VNReward_21703 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_VNReward_21703)PARSER.parseFrom(data);
      }

      public static C2S_VNReward_21703 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VNReward_21703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VNReward_21703 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_VNReward_21703)PARSER.parseFrom(data);
      }

      public static C2S_VNReward_21703 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VNReward_21703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VNReward_21703 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_VNReward_21703)PARSER.parseFrom(data);
      }

      public static C2S_VNReward_21703 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VNReward_21703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VNReward_21703 parseFrom(InputStream input) throws IOException {
         return (C2S_VNReward_21703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_VNReward_21703 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VNReward_21703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_VNReward_21703 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_VNReward_21703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_VNReward_21703 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VNReward_21703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_VNReward_21703 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_VNReward_21703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_VNReward_21703 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VNReward_21703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_VNReward_21703 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_VNReward_21703 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_VNReward_21703> parser() {
         return PARSER;
      }

      public Parser<C2S_VNReward_21703> getParserForType() {
         return PARSER;
      }

      public C2S_VNReward_21703 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_VNReward_21703OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_C2S_VNReward_21703_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_C2S_VNReward_21703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_VNReward_21703.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AdvertisementMsg.C2S_VNReward_21703.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_C2S_VNReward_21703_descriptor;
         }

         public C2S_VNReward_21703 getDefaultInstanceForType() {
            return AdvertisementMsg.C2S_VNReward_21703.getDefaultInstance();
         }

         public C2S_VNReward_21703 build() {
            C2S_VNReward_21703 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_VNReward_21703 buildPartial() {
            C2S_VNReward_21703 result = new C2S_VNReward_21703(this);
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
            if (other instanceof C2S_VNReward_21703) {
               return this.mergeFrom((C2S_VNReward_21703)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_VNReward_21703 other) {
            if (other == AdvertisementMsg.C2S_VNReward_21703.getDefaultInstance()) {
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
            C2S_VNReward_21703 parsedMessage = null;

            try {
               parsedMessage = (C2S_VNReward_21703)AdvertisementMsg.C2S_VNReward_21703.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_VNReward_21703)e.getUnfinishedMessage();
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

   public static final class S2C_VNReward_21704 extends GeneratedMessageV3 implements S2C_VNReward_21704OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DATA_FIELD_NUMBER = 1;
      private VN data_;
      private byte memoizedIsInitialized;
      private static final S2C_VNReward_21704 DEFAULT_INSTANCE = new S2C_VNReward_21704();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_VNReward_21704> PARSER = new AbstractParser<S2C_VNReward_21704>() {
         public S2C_VNReward_21704 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_VNReward_21704(input, extensionRegistry);
         }
      };

      private S2C_VNReward_21704(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_VNReward_21704() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_VNReward_21704();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_VNReward_21704(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        VN.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.data_.toBuilder();
                        }

                        this.data_ = (VN)input.readMessage(AdvertisementMsg.VN.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.data_);
                           this.data_ = subBuilder.buildPartial();
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
         return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_S2C_VNReward_21704_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_S2C_VNReward_21704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_VNReward_21704.class, Builder.class);
      }

      public boolean hasData() {
         return (this.bitField0_ & 1) != 0;
      }

      public VN getData() {
         return this.data_ == null ? AdvertisementMsg.VN.getDefaultInstance() : this.data_;
      }

      public VNOrBuilder getDataOrBuilder() {
         return this.data_ == null ? AdvertisementMsg.VN.getDefaultInstance() : this.data_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getData().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getData());
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
               size += CodedOutputStream.computeMessageSize(1, this.getData());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_VNReward_21704)) {
            return super.equals(obj);
         } else {
            S2C_VNReward_21704 other = (S2C_VNReward_21704)obj;
            if (this.hasData() != other.hasData()) {
               return false;
            } else if (this.hasData() && !this.getData().equals(other.getData())) {
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
            if (this.hasData()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getData().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_VNReward_21704 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_VNReward_21704)PARSER.parseFrom(data);
      }

      public static S2C_VNReward_21704 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_VNReward_21704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_VNReward_21704 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_VNReward_21704)PARSER.parseFrom(data);
      }

      public static S2C_VNReward_21704 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_VNReward_21704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_VNReward_21704 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_VNReward_21704)PARSER.parseFrom(data);
      }

      public static S2C_VNReward_21704 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_VNReward_21704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_VNReward_21704 parseFrom(InputStream input) throws IOException {
         return (S2C_VNReward_21704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_VNReward_21704 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_VNReward_21704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_VNReward_21704 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_VNReward_21704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_VNReward_21704 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_VNReward_21704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_VNReward_21704 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_VNReward_21704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_VNReward_21704 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_VNReward_21704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_VNReward_21704 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_VNReward_21704 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_VNReward_21704> parser() {
         return PARSER;
      }

      public Parser<S2C_VNReward_21704> getParserForType() {
         return PARSER;
      }

      public S2C_VNReward_21704 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_VNReward_21704OrBuilder {
         private int bitField0_;
         private VN data_;
         private SingleFieldBuilderV3<VN, VN.Builder, VNOrBuilder> dataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_S2C_VNReward_21704_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_S2C_VNReward_21704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_VNReward_21704.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AdvertisementMsg.S2C_VNReward_21704.alwaysUseFieldBuilders) {
               this.getDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.dataBuilder_ == null) {
               this.data_ = null;
            } else {
               this.dataBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AdvertisementMsg.internal_static_advertisement_com_gzbz_protobuf_S2C_VNReward_21704_descriptor;
         }

         public S2C_VNReward_21704 getDefaultInstanceForType() {
            return AdvertisementMsg.S2C_VNReward_21704.getDefaultInstance();
         }

         public S2C_VNReward_21704 build() {
            S2C_VNReward_21704 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_VNReward_21704 buildPartial() {
            S2C_VNReward_21704 result = new S2C_VNReward_21704(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.dataBuilder_ == null) {
                  result.data_ = this.data_;
               } else {
                  result.data_ = (VN)this.dataBuilder_.build();
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
            if (other instanceof S2C_VNReward_21704) {
               return this.mergeFrom((S2C_VNReward_21704)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_VNReward_21704 other) {
            if (other == AdvertisementMsg.S2C_VNReward_21704.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasData()) {
                  this.mergeData(other.getData());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasData()) {
               return false;
            } else {
               return this.getData().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_VNReward_21704 parsedMessage = null;

            try {
               parsedMessage = (S2C_VNReward_21704)AdvertisementMsg.S2C_VNReward_21704.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_VNReward_21704)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
         }

         public VN getData() {
            if (this.dataBuilder_ == null) {
               return this.data_ == null ? AdvertisementMsg.VN.getDefaultInstance() : this.data_;
            } else {
               return (VN)this.dataBuilder_.getMessage();
            }
         }

         public Builder setData(VN value) {
            if (this.dataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.data_ = value;
               this.onChanged();
            } else {
               this.dataBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setData(VN.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.data_ = builderForValue.build();
               this.onChanged();
            } else {
               this.dataBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeData(VN value) {
            if (this.dataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.data_ != null && this.data_ != AdvertisementMsg.VN.getDefaultInstance()) {
                  this.data_ = AdvertisementMsg.VN.newBuilder(this.data_).mergeFrom(value).buildPartial();
               } else {
                  this.data_ = value;
               }

               this.onChanged();
            } else {
               this.dataBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearData() {
            if (this.dataBuilder_ == null) {
               this.data_ = null;
               this.onChanged();
            } else {
               this.dataBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public VN.Builder getDataBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (VN.Builder)this.getDataFieldBuilder().getBuilder();
         }

         public VNOrBuilder getDataOrBuilder() {
            if (this.dataBuilder_ != null) {
               return (VNOrBuilder)this.dataBuilder_.getMessageOrBuilder();
            } else {
               return this.data_ == null ? AdvertisementMsg.VN.getDefaultInstance() : this.data_;
            }
         }

         private SingleFieldBuilderV3<VN, VN.Builder, VNOrBuilder> getDataFieldBuilder() {
            if (this.dataBuilder_ == null) {
               this.dataBuilder_ = new SingleFieldBuilderV3(this.getData(), this.getParentForChildren(), this.isClean());
               this.data_ = null;
            }

            return this.dataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_VNMain_21701OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_VNReward_21703OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_VNMain_21702OrBuilder extends MessageOrBuilder {
      List<VN> getDataList();

      VN getData(int index);

      int getDataCount();

      List<? extends VNOrBuilder> getDataOrBuilderList();

      VNOrBuilder getDataOrBuilder(int index);
   }

   public interface S2C_VNReward_21704OrBuilder extends MessageOrBuilder {
      boolean hasData();

      VN getData();

      VNOrBuilder getDataOrBuilder();
   }

   public interface VNOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasNum();

      int getNum();

      boolean hasTime();

      int getTime();
   }
}
