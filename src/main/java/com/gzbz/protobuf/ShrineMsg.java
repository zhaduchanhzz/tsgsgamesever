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

public final class ShrineMsg {
   private static final Descriptors.Descriptor internal_static_shrine_com_gzbz_protobuf_C2S_Preview_8701_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shrine_com_gzbz_protobuf_C2S_Preview_8701_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shrine_com_gzbz_protobuf_S2C_Preview_8702_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shrine_com_gzbz_protobuf_S2C_Preview_8702_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shrine_com_gzbz_protobuf_C2S_Exchange_8703_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shrine_com_gzbz_protobuf_C2S_Exchange_8703_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shrine_com_gzbz_protobuf_S2C_Exchange_8704_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shrine_com_gzbz_protobuf_S2C_Exchange_8704_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shrine_com_gzbz_protobuf_C2S_Recall_8705_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shrine_com_gzbz_protobuf_C2S_Recall_8705_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shrine_com_gzbz_protobuf_S2C_Recall_8706_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shrine_com_gzbz_protobuf_S2C_Recall_8706_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shrine_com_gzbz_protobuf_C2S_Rebirth_8707_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shrine_com_gzbz_protobuf_C2S_Rebirth_8707_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shrine_com_gzbz_protobuf_S2C_Rebirth_8708_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shrine_com_gzbz_protobuf_S2C_Rebirth_8708_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ShrineMsg() {
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
      String[] descriptorData = new String[]{"\n\fShrine.proto\u0012\u0018shrine.com.gzbz.protobuf\u001a\fcommon.proto\"@\n\u0010C2S_Preview_8701\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bdestCode\u0018\u0003 \u0001(\u0005\"R\n\u0010S2C_Preview_8702\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0002 \u0002(\u0005\u0012\"\n\bitemInfo\u0018\u0003 \u0003(\u000b2\u0010.common.ItemInfo\"=\n\u0011C2S_Exchange_8703\u0012\u0012\n\noriginCode\u0018\u0001 \u0002(\u0005\u0012\u0014\n\fmaterialCode\u0018\u0002 \u0003(\u0005\"]\n\u0011S2C_Exchange_8704\u0012\u0011\n\toriHeroId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ndestHeroId\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005stars\u0018\u0003 \u0002(\u0005\u0012\u0012\n\noriginCode\u0018\u0004 \u0002(\u0005\"\u001f\n\u000fC2S_Recall_8705\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\"\u001f\n\u000fS2C_Recall_8706\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\" \n\u0010C2S_Rebirth_8707\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\" \n\u0010S2C_Rebirth_8708\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005B \n\u0011com.gzbz.protobufB\tShrineMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_shrine_com_gzbz_protobuf_C2S_Preview_8701_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_shrine_com_gzbz_protobuf_C2S_Preview_8701_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shrine_com_gzbz_protobuf_C2S_Preview_8701_descriptor, new String[]{"Type", "Code", "DestCode"});
      internal_static_shrine_com_gzbz_protobuf_S2C_Preview_8702_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_shrine_com_gzbz_protobuf_S2C_Preview_8702_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shrine_com_gzbz_protobuf_S2C_Preview_8702_descriptor, new String[]{"Type", "Code", "ItemInfo"});
      internal_static_shrine_com_gzbz_protobuf_C2S_Exchange_8703_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_shrine_com_gzbz_protobuf_C2S_Exchange_8703_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shrine_com_gzbz_protobuf_C2S_Exchange_8703_descriptor, new String[]{"OriginCode", "MaterialCode"});
      internal_static_shrine_com_gzbz_protobuf_S2C_Exchange_8704_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_shrine_com_gzbz_protobuf_S2C_Exchange_8704_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shrine_com_gzbz_protobuf_S2C_Exchange_8704_descriptor, new String[]{"OriHeroId", "DestHeroId", "Stars", "OriginCode"});
      internal_static_shrine_com_gzbz_protobuf_C2S_Recall_8705_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_shrine_com_gzbz_protobuf_C2S_Recall_8705_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shrine_com_gzbz_protobuf_C2S_Recall_8705_descriptor, new String[]{"Code"});
      internal_static_shrine_com_gzbz_protobuf_S2C_Recall_8706_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_shrine_com_gzbz_protobuf_S2C_Recall_8706_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shrine_com_gzbz_protobuf_S2C_Recall_8706_descriptor, new String[]{"Code"});
      internal_static_shrine_com_gzbz_protobuf_C2S_Rebirth_8707_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_shrine_com_gzbz_protobuf_C2S_Rebirth_8707_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shrine_com_gzbz_protobuf_C2S_Rebirth_8707_descriptor, new String[]{"Code"});
      internal_static_shrine_com_gzbz_protobuf_S2C_Rebirth_8708_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_shrine_com_gzbz_protobuf_S2C_Rebirth_8708_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shrine_com_gzbz_protobuf_S2C_Rebirth_8708_descriptor, new String[]{"Code"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_Preview_8701 extends GeneratedMessageV3 implements C2S_Preview_8701OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      public static final int DESTCODE_FIELD_NUMBER = 3;
      private int destCode_;
      private byte memoizedIsInitialized;
      private static final C2S_Preview_8701 DEFAULT_INSTANCE = new C2S_Preview_8701();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Preview_8701> PARSER = new AbstractParser<C2S_Preview_8701>() {
         public C2S_Preview_8701 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Preview_8701(input, extensionRegistry);
         }
      };

      private C2S_Preview_8701(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Preview_8701() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Preview_8701();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Preview_8701(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.code_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.destCode_ = input.readInt32();
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
         return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_C2S_Preview_8701_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_C2S_Preview_8701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Preview_8701.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasDestCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getDestCode() {
         return this.destCode_;
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
            output.writeInt32(1, this.type_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.code_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.destCode_);
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
               size += CodedOutputStream.computeInt32Size(2, this.code_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.destCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Preview_8701)) {
            return super.equals(obj);
         } else {
            C2S_Preview_8701 other = (C2S_Preview_8701)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasDestCode() != other.hasDestCode()) {
               return false;
            } else if (this.hasDestCode() && this.getDestCode() != other.getDestCode()) {
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

            if (this.hasCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasDestCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getDestCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Preview_8701 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Preview_8701)PARSER.parseFrom(data);
      }

      public static C2S_Preview_8701 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Preview_8701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Preview_8701 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Preview_8701)PARSER.parseFrom(data);
      }

      public static C2S_Preview_8701 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Preview_8701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Preview_8701 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Preview_8701)PARSER.parseFrom(data);
      }

      public static C2S_Preview_8701 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Preview_8701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Preview_8701 parseFrom(InputStream input) throws IOException {
         return (C2S_Preview_8701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Preview_8701 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Preview_8701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Preview_8701 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Preview_8701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Preview_8701 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Preview_8701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Preview_8701 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Preview_8701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Preview_8701 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Preview_8701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Preview_8701 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Preview_8701 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Preview_8701> parser() {
         return PARSER;
      }

      public Parser<C2S_Preview_8701> getParserForType() {
         return PARSER;
      }

      public C2S_Preview_8701 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Preview_8701OrBuilder {
         private int bitField0_;
         private int type_;
         private int code_;
         private int destCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_C2S_Preview_8701_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_C2S_Preview_8701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Preview_8701.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShrineMsg.C2S_Preview_8701.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.bitField0_ &= -3;
            this.destCode_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_C2S_Preview_8701_descriptor;
         }

         public C2S_Preview_8701 getDefaultInstanceForType() {
            return ShrineMsg.C2S_Preview_8701.getDefaultInstance();
         }

         public C2S_Preview_8701 build() {
            C2S_Preview_8701 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Preview_8701 buildPartial() {
            C2S_Preview_8701 result = new C2S_Preview_8701(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.destCode_ = this.destCode_;
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
            if (other instanceof C2S_Preview_8701) {
               return this.mergeFrom((C2S_Preview_8701)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Preview_8701 other) {
            if (other == ShrineMsg.C2S_Preview_8701.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasDestCode()) {
                  this.setDestCode(other.getDestCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else {
               return this.hasCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Preview_8701 parsedMessage = null;

            try {
               parsedMessage = (C2S_Preview_8701)ShrineMsg.C2S_Preview_8701.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Preview_8701)e.getUnfinishedMessage();
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

         public boolean hasCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 2;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -3;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDestCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getDestCode() {
            return this.destCode_;
         }

         public Builder setDestCode(int value) {
            this.bitField0_ |= 4;
            this.destCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDestCode() {
            this.bitField0_ &= -5;
            this.destCode_ = 0;
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

   public static final class S2C_Preview_8702 extends GeneratedMessageV3 implements S2C_Preview_8702OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      public static final int ITEMINFO_FIELD_NUMBER = 3;
      private List<CommonMsg.ItemInfo> itemInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_Preview_8702 DEFAULT_INSTANCE = new S2C_Preview_8702();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Preview_8702> PARSER = new AbstractParser<S2C_Preview_8702>() {
         public S2C_Preview_8702 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Preview_8702(input, extensionRegistry);
         }
      };

      private S2C_Preview_8702(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Preview_8702() {
         this.memoizedIsInitialized = -1;
         this.itemInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Preview_8702();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Preview_8702(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.code_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.itemInfo_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.itemInfo_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
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
                  this.itemInfo_ = Collections.unmodifiableList(this.itemInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_S2C_Preview_8702_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_S2C_Preview_8702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Preview_8702.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public List<CommonMsg.ItemInfo> getItemInfoList() {
         return this.itemInfo_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getItemInfoOrBuilderList() {
         return this.itemInfo_;
      }

      public int getItemInfoCount() {
         return this.itemInfo_.size();
      }

      public CommonMsg.ItemInfo getItemInfo(int index) {
         return (CommonMsg.ItemInfo)this.itemInfo_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getItemInfoOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.itemInfo_.get(index);
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
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getItemInfoCount(); ++i) {
               if (!this.getItemInfo(i).isInitialized()) {
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
            output.writeInt32(1, this.type_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.code_);
         }

         for(int i = 0; i < this.itemInfo_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.itemInfo_.get(i));
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
               size += CodedOutputStream.computeInt32Size(2, this.code_);
            }

            for(int i = 0; i < this.itemInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.itemInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Preview_8702)) {
            return super.equals(obj);
         } else {
            S2C_Preview_8702 other = (S2C_Preview_8702)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (!this.getItemInfoList().equals(other.getItemInfoList())) {
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

            if (this.hasCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCode();
            }

            if (this.getItemInfoCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getItemInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Preview_8702 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Preview_8702)PARSER.parseFrom(data);
      }

      public static S2C_Preview_8702 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Preview_8702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Preview_8702 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Preview_8702)PARSER.parseFrom(data);
      }

      public static S2C_Preview_8702 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Preview_8702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Preview_8702 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Preview_8702)PARSER.parseFrom(data);
      }

      public static S2C_Preview_8702 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Preview_8702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Preview_8702 parseFrom(InputStream input) throws IOException {
         return (S2C_Preview_8702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Preview_8702 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Preview_8702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Preview_8702 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Preview_8702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Preview_8702 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Preview_8702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Preview_8702 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Preview_8702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Preview_8702 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Preview_8702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Preview_8702 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Preview_8702 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Preview_8702> parser() {
         return PARSER;
      }

      public Parser<S2C_Preview_8702> getParserForType() {
         return PARSER;
      }

      public S2C_Preview_8702 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Preview_8702OrBuilder {
         private int bitField0_;
         private int type_;
         private int code_;
         private List<CommonMsg.ItemInfo> itemInfo_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_S2C_Preview_8702_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_S2C_Preview_8702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Preview_8702.class, Builder.class);
         }

         private Builder() {
            this.itemInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.itemInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShrineMsg.S2C_Preview_8702.alwaysUseFieldBuilders) {
               this.getItemInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.bitField0_ &= -3;
            if (this.itemInfoBuilder_ == null) {
               this.itemInfo_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.itemInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_S2C_Preview_8702_descriptor;
         }

         public S2C_Preview_8702 getDefaultInstanceForType() {
            return ShrineMsg.S2C_Preview_8702.getDefaultInstance();
         }

         public S2C_Preview_8702 build() {
            S2C_Preview_8702 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Preview_8702 buildPartial() {
            S2C_Preview_8702 result = new S2C_Preview_8702(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 2;
            }

            if (this.itemInfoBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.itemInfo_ = Collections.unmodifiableList(this.itemInfo_);
                  this.bitField0_ &= -5;
               }

               result.itemInfo_ = this.itemInfo_;
            } else {
               result.itemInfo_ = this.itemInfoBuilder_.build();
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
            if (other instanceof S2C_Preview_8702) {
               return this.mergeFrom((S2C_Preview_8702)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Preview_8702 other) {
            if (other == ShrineMsg.S2C_Preview_8702.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (this.itemInfoBuilder_ == null) {
                  if (!other.itemInfo_.isEmpty()) {
                     if (this.itemInfo_.isEmpty()) {
                        this.itemInfo_ = other.itemInfo_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureItemInfoIsMutable();
                        this.itemInfo_.addAll(other.itemInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.itemInfo_.isEmpty()) {
                  if (this.itemInfoBuilder_.isEmpty()) {
                     this.itemInfoBuilder_.dispose();
                     this.itemInfoBuilder_ = null;
                     this.itemInfo_ = other.itemInfo_;
                     this.bitField0_ &= -5;
                     this.itemInfoBuilder_ = ShrineMsg.S2C_Preview_8702.alwaysUseFieldBuilders ? this.getItemInfoFieldBuilder() : null;
                  } else {
                     this.itemInfoBuilder_.addAllMessages(other.itemInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else if (!this.hasCode()) {
               return false;
            } else {
               for(int i = 0; i < this.getItemInfoCount(); ++i) {
                  if (!this.getItemInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Preview_8702 parsedMessage = null;

            try {
               parsedMessage = (S2C_Preview_8702)ShrineMsg.S2C_Preview_8702.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Preview_8702)e.getUnfinishedMessage();
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

         public boolean hasCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 2;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -3;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureItemInfoIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.itemInfo_ = new ArrayList(this.itemInfo_);
               this.bitField0_ |= 4;
            }

         }

         public List<CommonMsg.ItemInfo> getItemInfoList() {
            return this.itemInfoBuilder_ == null ? Collections.unmodifiableList(this.itemInfo_) : this.itemInfoBuilder_.getMessageList();
         }

         public int getItemInfoCount() {
            return this.itemInfoBuilder_ == null ? this.itemInfo_.size() : this.itemInfoBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getItemInfo(int index) {
            return this.itemInfoBuilder_ == null ? (CommonMsg.ItemInfo)this.itemInfo_.get(index) : (CommonMsg.ItemInfo)this.itemInfoBuilder_.getMessage(index);
         }

         public Builder setItemInfo(int index, CommonMsg.ItemInfo value) {
            if (this.itemInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemInfoIsMutable();
               this.itemInfo_.set(index, value);
               this.onChanged();
            } else {
               this.itemInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setItemInfo(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemInfoBuilder_ == null) {
               this.ensureItemInfoIsMutable();
               this.itemInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItemInfo(CommonMsg.ItemInfo value) {
            if (this.itemInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemInfoIsMutable();
               this.itemInfo_.add(value);
               this.onChanged();
            } else {
               this.itemInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addItemInfo(int index, CommonMsg.ItemInfo value) {
            if (this.itemInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemInfoIsMutable();
               this.itemInfo_.add(index, value);
               this.onChanged();
            } else {
               this.itemInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addItemInfo(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemInfoBuilder_ == null) {
               this.ensureItemInfoIsMutable();
               this.itemInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItemInfo(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemInfoBuilder_ == null) {
               this.ensureItemInfoIsMutable();
               this.itemInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItemInfo(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.itemInfoBuilder_ == null) {
               this.ensureItemInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.itemInfo_);
               this.onChanged();
            } else {
               this.itemInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearItemInfo() {
            if (this.itemInfoBuilder_ == null) {
               this.itemInfo_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.itemInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeItemInfo(int index) {
            if (this.itemInfoBuilder_ == null) {
               this.ensureItemInfoIsMutable();
               this.itemInfo_.remove(index);
               this.onChanged();
            } else {
               this.itemInfoBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getItemInfoBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemInfoFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getItemInfoOrBuilder(int index) {
            return this.itemInfoBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.itemInfo_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.itemInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getItemInfoOrBuilderList() {
            return this.itemInfoBuilder_ != null ? this.itemInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.itemInfo_);
         }

         public CommonMsg.ItemInfo.Builder addItemInfoBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getItemInfoFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addItemInfoBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemInfoFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getItemInfoBuilderList() {
            return this.getItemInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getItemInfoFieldBuilder() {
            if (this.itemInfoBuilder_ == null) {
               this.itemInfoBuilder_ = new RepeatedFieldBuilderV3(this.itemInfo_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.itemInfo_ = null;
            }

            return this.itemInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_Exchange_8703 extends GeneratedMessageV3 implements C2S_Exchange_8703OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ORIGINCODE_FIELD_NUMBER = 1;
      private int originCode_;
      public static final int MATERIALCODE_FIELD_NUMBER = 2;
      private Internal.IntList materialCode_;
      private byte memoizedIsInitialized;
      private static final C2S_Exchange_8703 DEFAULT_INSTANCE = new C2S_Exchange_8703();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Exchange_8703> PARSER = new AbstractParser<C2S_Exchange_8703>() {
         public C2S_Exchange_8703 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Exchange_8703(input, extensionRegistry);
         }
      };

      private C2S_Exchange_8703(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Exchange_8703() {
         this.memoizedIsInitialized = -1;
         this.materialCode_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Exchange_8703();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Exchange_8703(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.originCode_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.materialCode_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.materialCode_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.materialCode_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.materialCode_.addInt(input.readInt32());
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
                  this.materialCode_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_C2S_Exchange_8703_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_C2S_Exchange_8703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Exchange_8703.class, Builder.class);
      }

      public boolean hasOriginCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getOriginCode() {
         return this.originCode_;
      }

      public List<Integer> getMaterialCodeList() {
         return this.materialCode_;
      }

      public int getMaterialCodeCount() {
         return this.materialCode_.size();
      }

      public int getMaterialCode(int index) {
         return this.materialCode_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasOriginCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.originCode_);
         }

         for(int i = 0; i < this.materialCode_.size(); ++i) {
            output.writeInt32(2, this.materialCode_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.originCode_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.materialCode_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.materialCode_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getMaterialCodeList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Exchange_8703)) {
            return super.equals(obj);
         } else {
            C2S_Exchange_8703 other = (C2S_Exchange_8703)obj;
            if (this.hasOriginCode() != other.hasOriginCode()) {
               return false;
            } else if (this.hasOriginCode() && this.getOriginCode() != other.getOriginCode()) {
               return false;
            } else if (!this.getMaterialCodeList().equals(other.getMaterialCodeList())) {
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
            if (this.hasOriginCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOriginCode();
            }

            if (this.getMaterialCodeCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMaterialCodeList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Exchange_8703 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Exchange_8703)PARSER.parseFrom(data);
      }

      public static C2S_Exchange_8703 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Exchange_8703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Exchange_8703 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Exchange_8703)PARSER.parseFrom(data);
      }

      public static C2S_Exchange_8703 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Exchange_8703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Exchange_8703 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Exchange_8703)PARSER.parseFrom(data);
      }

      public static C2S_Exchange_8703 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Exchange_8703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Exchange_8703 parseFrom(InputStream input) throws IOException {
         return (C2S_Exchange_8703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Exchange_8703 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Exchange_8703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Exchange_8703 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Exchange_8703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Exchange_8703 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Exchange_8703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Exchange_8703 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Exchange_8703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Exchange_8703 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Exchange_8703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Exchange_8703 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Exchange_8703 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Exchange_8703> parser() {
         return PARSER;
      }

      public Parser<C2S_Exchange_8703> getParserForType() {
         return PARSER;
      }

      public C2S_Exchange_8703 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Exchange_8703OrBuilder {
         private int bitField0_;
         private int originCode_;
         private Internal.IntList materialCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_C2S_Exchange_8703_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_C2S_Exchange_8703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Exchange_8703.class, Builder.class);
         }

         private Builder() {
            this.materialCode_ = ShrineMsg.C2S_Exchange_8703.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.materialCode_ = ShrineMsg.C2S_Exchange_8703.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShrineMsg.C2S_Exchange_8703.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.originCode_ = 0;
            this.bitField0_ &= -2;
            this.materialCode_ = ShrineMsg.C2S_Exchange_8703.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_C2S_Exchange_8703_descriptor;
         }

         public C2S_Exchange_8703 getDefaultInstanceForType() {
            return ShrineMsg.C2S_Exchange_8703.getDefaultInstance();
         }

         public C2S_Exchange_8703 build() {
            C2S_Exchange_8703 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Exchange_8703 buildPartial() {
            C2S_Exchange_8703 result = new C2S_Exchange_8703(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.originCode_ = this.originCode_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.materialCode_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.materialCode_ = this.materialCode_;
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
            if (other instanceof C2S_Exchange_8703) {
               return this.mergeFrom((C2S_Exchange_8703)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Exchange_8703 other) {
            if (other == ShrineMsg.C2S_Exchange_8703.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOriginCode()) {
                  this.setOriginCode(other.getOriginCode());
               }

               if (!other.materialCode_.isEmpty()) {
                  if (this.materialCode_.isEmpty()) {
                     this.materialCode_ = other.materialCode_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureMaterialCodeIsMutable();
                     this.materialCode_.addAll(other.materialCode_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasOriginCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Exchange_8703 parsedMessage = null;

            try {
               parsedMessage = (C2S_Exchange_8703)ShrineMsg.C2S_Exchange_8703.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Exchange_8703)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOriginCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getOriginCode() {
            return this.originCode_;
         }

         public Builder setOriginCode(int value) {
            this.bitField0_ |= 1;
            this.originCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOriginCode() {
            this.bitField0_ &= -2;
            this.originCode_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureMaterialCodeIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.materialCode_ = ShrineMsg.C2S_Exchange_8703.mutableCopy(this.materialCode_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getMaterialCodeList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.materialCode_) : this.materialCode_);
         }

         public int getMaterialCodeCount() {
            return this.materialCode_.size();
         }

         public int getMaterialCode(int index) {
            return this.materialCode_.getInt(index);
         }

         public Builder setMaterialCode(int index, int value) {
            this.ensureMaterialCodeIsMutable();
            this.materialCode_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addMaterialCode(int value) {
            this.ensureMaterialCodeIsMutable();
            this.materialCode_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllMaterialCode(Iterable<? extends Integer> values) {
            this.ensureMaterialCodeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.materialCode_);
            this.onChanged();
            return this;
         }

         public Builder clearMaterialCode() {
            this.materialCode_ = ShrineMsg.C2S_Exchange_8703.emptyIntList();
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

   public static final class S2C_Exchange_8704 extends GeneratedMessageV3 implements S2C_Exchange_8704OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ORIHEROID_FIELD_NUMBER = 1;
      private int oriHeroId_;
      public static final int DESTHEROID_FIELD_NUMBER = 2;
      private int destHeroId_;
      public static final int STARS_FIELD_NUMBER = 3;
      private int stars_;
      public static final int ORIGINCODE_FIELD_NUMBER = 4;
      private int originCode_;
      private byte memoizedIsInitialized;
      private static final S2C_Exchange_8704 DEFAULT_INSTANCE = new S2C_Exchange_8704();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Exchange_8704> PARSER = new AbstractParser<S2C_Exchange_8704>() {
         public S2C_Exchange_8704 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Exchange_8704(input, extensionRegistry);
         }
      };

      private S2C_Exchange_8704(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Exchange_8704() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Exchange_8704();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Exchange_8704(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.oriHeroId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.destHeroId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.stars_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.originCode_ = input.readInt32();
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
         return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_S2C_Exchange_8704_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_S2C_Exchange_8704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Exchange_8704.class, Builder.class);
      }

      public boolean hasOriHeroId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getOriHeroId() {
         return this.oriHeroId_;
      }

      public boolean hasDestHeroId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDestHeroId() {
         return this.destHeroId_;
      }

      public boolean hasStars() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getStars() {
         return this.stars_;
      }

      public boolean hasOriginCode() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getOriginCode() {
         return this.originCode_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasOriHeroId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDestHeroId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStars()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOriginCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.oriHeroId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.destHeroId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.stars_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.originCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.oriHeroId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.destHeroId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.stars_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.originCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Exchange_8704)) {
            return super.equals(obj);
         } else {
            S2C_Exchange_8704 other = (S2C_Exchange_8704)obj;
            if (this.hasOriHeroId() != other.hasOriHeroId()) {
               return false;
            } else if (this.hasOriHeroId() && this.getOriHeroId() != other.getOriHeroId()) {
               return false;
            } else if (this.hasDestHeroId() != other.hasDestHeroId()) {
               return false;
            } else if (this.hasDestHeroId() && this.getDestHeroId() != other.getDestHeroId()) {
               return false;
            } else if (this.hasStars() != other.hasStars()) {
               return false;
            } else if (this.hasStars() && this.getStars() != other.getStars()) {
               return false;
            } else if (this.hasOriginCode() != other.hasOriginCode()) {
               return false;
            } else if (this.hasOriginCode() && this.getOriginCode() != other.getOriginCode()) {
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
            if (this.hasOriHeroId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOriHeroId();
            }

            if (this.hasDestHeroId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDestHeroId();
            }

            if (this.hasStars()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStars();
            }

            if (this.hasOriginCode()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getOriginCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Exchange_8704 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Exchange_8704)PARSER.parseFrom(data);
      }

      public static S2C_Exchange_8704 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Exchange_8704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Exchange_8704 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Exchange_8704)PARSER.parseFrom(data);
      }

      public static S2C_Exchange_8704 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Exchange_8704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Exchange_8704 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Exchange_8704)PARSER.parseFrom(data);
      }

      public static S2C_Exchange_8704 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Exchange_8704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Exchange_8704 parseFrom(InputStream input) throws IOException {
         return (S2C_Exchange_8704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Exchange_8704 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Exchange_8704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Exchange_8704 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Exchange_8704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Exchange_8704 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Exchange_8704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Exchange_8704 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Exchange_8704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Exchange_8704 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Exchange_8704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Exchange_8704 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Exchange_8704 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Exchange_8704> parser() {
         return PARSER;
      }

      public Parser<S2C_Exchange_8704> getParserForType() {
         return PARSER;
      }

      public S2C_Exchange_8704 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Exchange_8704OrBuilder {
         private int bitField0_;
         private int oriHeroId_;
         private int destHeroId_;
         private int stars_;
         private int originCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_S2C_Exchange_8704_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_S2C_Exchange_8704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Exchange_8704.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShrineMsg.S2C_Exchange_8704.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.oriHeroId_ = 0;
            this.bitField0_ &= -2;
            this.destHeroId_ = 0;
            this.bitField0_ &= -3;
            this.stars_ = 0;
            this.bitField0_ &= -5;
            this.originCode_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_S2C_Exchange_8704_descriptor;
         }

         public S2C_Exchange_8704 getDefaultInstanceForType() {
            return ShrineMsg.S2C_Exchange_8704.getDefaultInstance();
         }

         public S2C_Exchange_8704 build() {
            S2C_Exchange_8704 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Exchange_8704 buildPartial() {
            S2C_Exchange_8704 result = new S2C_Exchange_8704(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.oriHeroId_ = this.oriHeroId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.destHeroId_ = this.destHeroId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.stars_ = this.stars_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.originCode_ = this.originCode_;
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
            if (other instanceof S2C_Exchange_8704) {
               return this.mergeFrom((S2C_Exchange_8704)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Exchange_8704 other) {
            if (other == ShrineMsg.S2C_Exchange_8704.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOriHeroId()) {
                  this.setOriHeroId(other.getOriHeroId());
               }

               if (other.hasDestHeroId()) {
                  this.setDestHeroId(other.getDestHeroId());
               }

               if (other.hasStars()) {
                  this.setStars(other.getStars());
               }

               if (other.hasOriginCode()) {
                  this.setOriginCode(other.getOriginCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasOriHeroId()) {
               return false;
            } else if (!this.hasDestHeroId()) {
               return false;
            } else if (!this.hasStars()) {
               return false;
            } else {
               return this.hasOriginCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Exchange_8704 parsedMessage = null;

            try {
               parsedMessage = (S2C_Exchange_8704)ShrineMsg.S2C_Exchange_8704.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Exchange_8704)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOriHeroId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getOriHeroId() {
            return this.oriHeroId_;
         }

         public Builder setOriHeroId(int value) {
            this.bitField0_ |= 1;
            this.oriHeroId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOriHeroId() {
            this.bitField0_ &= -2;
            this.oriHeroId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDestHeroId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDestHeroId() {
            return this.destHeroId_;
         }

         public Builder setDestHeroId(int value) {
            this.bitField0_ |= 2;
            this.destHeroId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDestHeroId() {
            this.bitField0_ &= -3;
            this.destHeroId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStars() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getStars() {
            return this.stars_;
         }

         public Builder setStars(int value) {
            this.bitField0_ |= 4;
            this.stars_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStars() {
            this.bitField0_ &= -5;
            this.stars_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOriginCode() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getOriginCode() {
            return this.originCode_;
         }

         public Builder setOriginCode(int value) {
            this.bitField0_ |= 8;
            this.originCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOriginCode() {
            this.bitField0_ &= -9;
            this.originCode_ = 0;
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

   public static final class C2S_Recall_8705 extends GeneratedMessageV3 implements C2S_Recall_8705OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      private byte memoizedIsInitialized;
      private static final C2S_Recall_8705 DEFAULT_INSTANCE = new C2S_Recall_8705();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Recall_8705> PARSER = new AbstractParser<C2S_Recall_8705>() {
         public C2S_Recall_8705 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Recall_8705(input, extensionRegistry);
         }
      };

      private C2S_Recall_8705(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Recall_8705() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Recall_8705();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Recall_8705(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_C2S_Recall_8705_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_C2S_Recall_8705_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Recall_8705.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Recall_8705)) {
            return super.equals(obj);
         } else {
            C2S_Recall_8705 other = (C2S_Recall_8705)obj;
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

      public static C2S_Recall_8705 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Recall_8705)PARSER.parseFrom(data);
      }

      public static C2S_Recall_8705 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Recall_8705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Recall_8705 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Recall_8705)PARSER.parseFrom(data);
      }

      public static C2S_Recall_8705 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Recall_8705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Recall_8705 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Recall_8705)PARSER.parseFrom(data);
      }

      public static C2S_Recall_8705 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Recall_8705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Recall_8705 parseFrom(InputStream input) throws IOException {
         return (C2S_Recall_8705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Recall_8705 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Recall_8705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Recall_8705 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Recall_8705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Recall_8705 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Recall_8705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Recall_8705 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Recall_8705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Recall_8705 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Recall_8705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Recall_8705 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Recall_8705 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Recall_8705> parser() {
         return PARSER;
      }

      public Parser<C2S_Recall_8705> getParserForType() {
         return PARSER;
      }

      public C2S_Recall_8705 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Recall_8705OrBuilder {
         private int bitField0_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_C2S_Recall_8705_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_C2S_Recall_8705_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Recall_8705.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShrineMsg.C2S_Recall_8705.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_C2S_Recall_8705_descriptor;
         }

         public C2S_Recall_8705 getDefaultInstanceForType() {
            return ShrineMsg.C2S_Recall_8705.getDefaultInstance();
         }

         public C2S_Recall_8705 build() {
            C2S_Recall_8705 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Recall_8705 buildPartial() {
            C2S_Recall_8705 result = new C2S_Recall_8705(this);
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
            if (other instanceof C2S_Recall_8705) {
               return this.mergeFrom((C2S_Recall_8705)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Recall_8705 other) {
            if (other == ShrineMsg.C2S_Recall_8705.getDefaultInstance()) {
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
            C2S_Recall_8705 parsedMessage = null;

            try {
               parsedMessage = (C2S_Recall_8705)ShrineMsg.C2S_Recall_8705.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Recall_8705)e.getUnfinishedMessage();
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

   public static final class S2C_Recall_8706 extends GeneratedMessageV3 implements S2C_Recall_8706OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      private byte memoizedIsInitialized;
      private static final S2C_Recall_8706 DEFAULT_INSTANCE = new S2C_Recall_8706();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Recall_8706> PARSER = new AbstractParser<S2C_Recall_8706>() {
         public S2C_Recall_8706 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Recall_8706(input, extensionRegistry);
         }
      };

      private S2C_Recall_8706(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Recall_8706() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Recall_8706();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Recall_8706(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_S2C_Recall_8706_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_S2C_Recall_8706_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Recall_8706.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Recall_8706)) {
            return super.equals(obj);
         } else {
            S2C_Recall_8706 other = (S2C_Recall_8706)obj;
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

      public static S2C_Recall_8706 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Recall_8706)PARSER.parseFrom(data);
      }

      public static S2C_Recall_8706 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Recall_8706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Recall_8706 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Recall_8706)PARSER.parseFrom(data);
      }

      public static S2C_Recall_8706 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Recall_8706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Recall_8706 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Recall_8706)PARSER.parseFrom(data);
      }

      public static S2C_Recall_8706 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Recall_8706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Recall_8706 parseFrom(InputStream input) throws IOException {
         return (S2C_Recall_8706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Recall_8706 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Recall_8706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Recall_8706 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Recall_8706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Recall_8706 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Recall_8706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Recall_8706 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Recall_8706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Recall_8706 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Recall_8706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Recall_8706 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Recall_8706 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Recall_8706> parser() {
         return PARSER;
      }

      public Parser<S2C_Recall_8706> getParserForType() {
         return PARSER;
      }

      public S2C_Recall_8706 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Recall_8706OrBuilder {
         private int bitField0_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_S2C_Recall_8706_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_S2C_Recall_8706_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Recall_8706.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShrineMsg.S2C_Recall_8706.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_S2C_Recall_8706_descriptor;
         }

         public S2C_Recall_8706 getDefaultInstanceForType() {
            return ShrineMsg.S2C_Recall_8706.getDefaultInstance();
         }

         public S2C_Recall_8706 build() {
            S2C_Recall_8706 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Recall_8706 buildPartial() {
            S2C_Recall_8706 result = new S2C_Recall_8706(this);
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
            if (other instanceof S2C_Recall_8706) {
               return this.mergeFrom((S2C_Recall_8706)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Recall_8706 other) {
            if (other == ShrineMsg.S2C_Recall_8706.getDefaultInstance()) {
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
            S2C_Recall_8706 parsedMessage = null;

            try {
               parsedMessage = (S2C_Recall_8706)ShrineMsg.S2C_Recall_8706.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Recall_8706)e.getUnfinishedMessage();
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

   public static final class C2S_Rebirth_8707 extends GeneratedMessageV3 implements C2S_Rebirth_8707OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      private byte memoizedIsInitialized;
      private static final C2S_Rebirth_8707 DEFAULT_INSTANCE = new C2S_Rebirth_8707();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Rebirth_8707> PARSER = new AbstractParser<C2S_Rebirth_8707>() {
         public C2S_Rebirth_8707 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Rebirth_8707(input, extensionRegistry);
         }
      };

      private C2S_Rebirth_8707(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Rebirth_8707() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Rebirth_8707();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Rebirth_8707(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_C2S_Rebirth_8707_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_C2S_Rebirth_8707_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Rebirth_8707.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Rebirth_8707)) {
            return super.equals(obj);
         } else {
            C2S_Rebirth_8707 other = (C2S_Rebirth_8707)obj;
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

      public static C2S_Rebirth_8707 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Rebirth_8707)PARSER.parseFrom(data);
      }

      public static C2S_Rebirth_8707 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Rebirth_8707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Rebirth_8707 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Rebirth_8707)PARSER.parseFrom(data);
      }

      public static C2S_Rebirth_8707 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Rebirth_8707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Rebirth_8707 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Rebirth_8707)PARSER.parseFrom(data);
      }

      public static C2S_Rebirth_8707 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Rebirth_8707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Rebirth_8707 parseFrom(InputStream input) throws IOException {
         return (C2S_Rebirth_8707)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Rebirth_8707 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Rebirth_8707)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Rebirth_8707 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Rebirth_8707)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Rebirth_8707 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Rebirth_8707)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Rebirth_8707 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Rebirth_8707)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Rebirth_8707 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Rebirth_8707)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Rebirth_8707 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Rebirth_8707 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Rebirth_8707> parser() {
         return PARSER;
      }

      public Parser<C2S_Rebirth_8707> getParserForType() {
         return PARSER;
      }

      public C2S_Rebirth_8707 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Rebirth_8707OrBuilder {
         private int bitField0_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_C2S_Rebirth_8707_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_C2S_Rebirth_8707_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Rebirth_8707.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShrineMsg.C2S_Rebirth_8707.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_C2S_Rebirth_8707_descriptor;
         }

         public C2S_Rebirth_8707 getDefaultInstanceForType() {
            return ShrineMsg.C2S_Rebirth_8707.getDefaultInstance();
         }

         public C2S_Rebirth_8707 build() {
            C2S_Rebirth_8707 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Rebirth_8707 buildPartial() {
            C2S_Rebirth_8707 result = new C2S_Rebirth_8707(this);
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
            if (other instanceof C2S_Rebirth_8707) {
               return this.mergeFrom((C2S_Rebirth_8707)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Rebirth_8707 other) {
            if (other == ShrineMsg.C2S_Rebirth_8707.getDefaultInstance()) {
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
            C2S_Rebirth_8707 parsedMessage = null;

            try {
               parsedMessage = (C2S_Rebirth_8707)ShrineMsg.C2S_Rebirth_8707.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Rebirth_8707)e.getUnfinishedMessage();
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

   public static final class S2C_Rebirth_8708 extends GeneratedMessageV3 implements S2C_Rebirth_8708OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      private byte memoizedIsInitialized;
      private static final S2C_Rebirth_8708 DEFAULT_INSTANCE = new S2C_Rebirth_8708();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Rebirth_8708> PARSER = new AbstractParser<S2C_Rebirth_8708>() {
         public S2C_Rebirth_8708 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Rebirth_8708(input, extensionRegistry);
         }
      };

      private S2C_Rebirth_8708(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Rebirth_8708() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Rebirth_8708();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Rebirth_8708(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_S2C_Rebirth_8708_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_S2C_Rebirth_8708_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Rebirth_8708.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Rebirth_8708)) {
            return super.equals(obj);
         } else {
            S2C_Rebirth_8708 other = (S2C_Rebirth_8708)obj;
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

      public static S2C_Rebirth_8708 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Rebirth_8708)PARSER.parseFrom(data);
      }

      public static S2C_Rebirth_8708 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Rebirth_8708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Rebirth_8708 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Rebirth_8708)PARSER.parseFrom(data);
      }

      public static S2C_Rebirth_8708 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Rebirth_8708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Rebirth_8708 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Rebirth_8708)PARSER.parseFrom(data);
      }

      public static S2C_Rebirth_8708 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Rebirth_8708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Rebirth_8708 parseFrom(InputStream input) throws IOException {
         return (S2C_Rebirth_8708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Rebirth_8708 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Rebirth_8708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Rebirth_8708 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Rebirth_8708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Rebirth_8708 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Rebirth_8708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Rebirth_8708 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Rebirth_8708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Rebirth_8708 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Rebirth_8708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Rebirth_8708 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Rebirth_8708 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Rebirth_8708> parser() {
         return PARSER;
      }

      public Parser<S2C_Rebirth_8708> getParserForType() {
         return PARSER;
      }

      public S2C_Rebirth_8708 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Rebirth_8708OrBuilder {
         private int bitField0_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_S2C_Rebirth_8708_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_S2C_Rebirth_8708_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Rebirth_8708.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShrineMsg.S2C_Rebirth_8708.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShrineMsg.internal_static_shrine_com_gzbz_protobuf_S2C_Rebirth_8708_descriptor;
         }

         public S2C_Rebirth_8708 getDefaultInstanceForType() {
            return ShrineMsg.S2C_Rebirth_8708.getDefaultInstance();
         }

         public S2C_Rebirth_8708 build() {
            S2C_Rebirth_8708 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Rebirth_8708 buildPartial() {
            S2C_Rebirth_8708 result = new S2C_Rebirth_8708(this);
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
            if (other instanceof S2C_Rebirth_8708) {
               return this.mergeFrom((S2C_Rebirth_8708)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Rebirth_8708 other) {
            if (other == ShrineMsg.S2C_Rebirth_8708.getDefaultInstance()) {
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
            S2C_Rebirth_8708 parsedMessage = null;

            try {
               parsedMessage = (S2C_Rebirth_8708)ShrineMsg.S2C_Rebirth_8708.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Rebirth_8708)e.getUnfinishedMessage();
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

   public interface C2S_Exchange_8703OrBuilder extends MessageOrBuilder {
      boolean hasOriginCode();

      int getOriginCode();

      List<Integer> getMaterialCodeList();

      int getMaterialCodeCount();

      int getMaterialCode(int index);
   }

   public interface C2S_Preview_8701OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasCode();

      int getCode();

      boolean hasDestCode();

      int getDestCode();
   }

   public interface C2S_Rebirth_8707OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();
   }

   public interface C2S_Recall_8705OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();
   }

   public interface S2C_Exchange_8704OrBuilder extends MessageOrBuilder {
      boolean hasOriHeroId();

      int getOriHeroId();

      boolean hasDestHeroId();

      int getDestHeroId();

      boolean hasStars();

      int getStars();

      boolean hasOriginCode();

      int getOriginCode();
   }

   public interface S2C_Preview_8702OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasCode();

      int getCode();

      List<CommonMsg.ItemInfo> getItemInfoList();

      CommonMsg.ItemInfo getItemInfo(int index);

      int getItemInfoCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getItemInfoOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getItemInfoOrBuilder(int index);
   }

   public interface S2C_Rebirth_8708OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();
   }

   public interface S2C_Recall_8706OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();
   }
}
