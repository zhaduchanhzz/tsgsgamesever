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

public final class ZhenYuMsg {
   private static final Descriptors.Descriptor internal_static_zhenYu_com_gzbz_protobuf_C2S_ShopInfo_29001_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_zhenYu_com_gzbz_protobuf_C2S_ShopInfo_29001_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_zhenYu_com_gzbz_protobuf_S2C_ShopInfo_29002_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_zhenYu_com_gzbz_protobuf_S2C_ShopInfo_29002_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_zhenYu_com_gzbz_protobuf_ShopInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_zhenYu_com_gzbz_protobuf_ShopInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_zhenYu_com_gzbz_protobuf_C2S_Buy_29003_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_zhenYu_com_gzbz_protobuf_C2S_Buy_29003_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ZhenYuMsg() {
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
      String[] descriptorData = new String[]{"\n\fZhenYu.proto\u0012\u0018zhenYu.com.gzbz.protobuf\"\u0014\n\u0012C2S_ShopInfo_29001\"m\n\u0012S2C_ShopInfo_29002\u0012\u000e\n\u0006ActDay\u0018\u0001 \u0002(\u0005\u0012\u0015\n\ropenServerDay\u0018\u0002 \u0002(\u0005\u00120\n\u0004shop\u0018\u0003 \u0003(\u000b2\".zhenYu.com.gzbz.protobuf.ShopInfo\"#\n\bShopInfo\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003buy\u0018\u0002 \u0002(\u0005\"\u001b\n\rC2S_Buy_29003\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005B \n\u0011com.gzbz.protobufB\tZhenYuMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_zhenYu_com_gzbz_protobuf_C2S_ShopInfo_29001_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_zhenYu_com_gzbz_protobuf_C2S_ShopInfo_29001_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_zhenYu_com_gzbz_protobuf_C2S_ShopInfo_29001_descriptor, new String[0]);
      internal_static_zhenYu_com_gzbz_protobuf_S2C_ShopInfo_29002_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_zhenYu_com_gzbz_protobuf_S2C_ShopInfo_29002_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_zhenYu_com_gzbz_protobuf_S2C_ShopInfo_29002_descriptor, new String[]{"ActDay", "OpenServerDay", "Shop"});
      internal_static_zhenYu_com_gzbz_protobuf_ShopInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_zhenYu_com_gzbz_protobuf_ShopInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_zhenYu_com_gzbz_protobuf_ShopInfo_descriptor, new String[]{"Id", "Buy"});
      internal_static_zhenYu_com_gzbz_protobuf_C2S_Buy_29003_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_zhenYu_com_gzbz_protobuf_C2S_Buy_29003_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_zhenYu_com_gzbz_protobuf_C2S_Buy_29003_descriptor, new String[]{"Id"});
   }

   public static final class C2S_ShopInfo_29001 extends GeneratedMessageV3 implements C2S_ShopInfo_29001OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ShopInfo_29001 DEFAULT_INSTANCE = new C2S_ShopInfo_29001();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ShopInfo_29001> PARSER = new AbstractParser<C2S_ShopInfo_29001>() {
         public C2S_ShopInfo_29001 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ShopInfo_29001(input, extensionRegistry);
         }
      };

      private C2S_ShopInfo_29001(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ShopInfo_29001() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ShopInfo_29001();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ShopInfo_29001(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ZhenYuMsg.internal_static_zhenYu_com_gzbz_protobuf_C2S_ShopInfo_29001_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ZhenYuMsg.internal_static_zhenYu_com_gzbz_protobuf_C2S_ShopInfo_29001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopInfo_29001.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ShopInfo_29001)) {
            return super.equals(obj);
         } else {
            C2S_ShopInfo_29001 other = (C2S_ShopInfo_29001)obj;
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

      public static C2S_ShopInfo_29001 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ShopInfo_29001)PARSER.parseFrom(data);
      }

      public static C2S_ShopInfo_29001 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopInfo_29001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopInfo_29001 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ShopInfo_29001)PARSER.parseFrom(data);
      }

      public static C2S_ShopInfo_29001 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopInfo_29001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopInfo_29001 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ShopInfo_29001)PARSER.parseFrom(data);
      }

      public static C2S_ShopInfo_29001 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopInfo_29001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopInfo_29001 parseFrom(InputStream input) throws IOException {
         return (C2S_ShopInfo_29001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopInfo_29001 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopInfo_29001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopInfo_29001 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ShopInfo_29001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ShopInfo_29001 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopInfo_29001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopInfo_29001 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ShopInfo_29001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopInfo_29001 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopInfo_29001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ShopInfo_29001 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ShopInfo_29001 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ShopInfo_29001> parser() {
         return PARSER;
      }

      public Parser<C2S_ShopInfo_29001> getParserForType() {
         return PARSER;
      }

      public C2S_ShopInfo_29001 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ShopInfo_29001OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ZhenYuMsg.internal_static_zhenYu_com_gzbz_protobuf_C2S_ShopInfo_29001_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ZhenYuMsg.internal_static_zhenYu_com_gzbz_protobuf_C2S_ShopInfo_29001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopInfo_29001.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ZhenYuMsg.C2S_ShopInfo_29001.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ZhenYuMsg.internal_static_zhenYu_com_gzbz_protobuf_C2S_ShopInfo_29001_descriptor;
         }

         public C2S_ShopInfo_29001 getDefaultInstanceForType() {
            return ZhenYuMsg.C2S_ShopInfo_29001.getDefaultInstance();
         }

         public C2S_ShopInfo_29001 build() {
            C2S_ShopInfo_29001 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ShopInfo_29001 buildPartial() {
            C2S_ShopInfo_29001 result = new C2S_ShopInfo_29001(this);
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
            if (other instanceof C2S_ShopInfo_29001) {
               return this.mergeFrom((C2S_ShopInfo_29001)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ShopInfo_29001 other) {
            if (other == ZhenYuMsg.C2S_ShopInfo_29001.getDefaultInstance()) {
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
            C2S_ShopInfo_29001 parsedMessage = null;

            try {
               parsedMessage = (C2S_ShopInfo_29001)ZhenYuMsg.C2S_ShopInfo_29001.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ShopInfo_29001)e.getUnfinishedMessage();
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

   public static final class S2C_ShopInfo_29002 extends GeneratedMessageV3 implements S2C_ShopInfo_29002OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTDAY_FIELD_NUMBER = 1;
      private int actDay_;
      public static final int OPENSERVERDAY_FIELD_NUMBER = 2;
      private int openServerDay_;
      public static final int SHOP_FIELD_NUMBER = 3;
      private List<ShopInfo> shop_;
      private byte memoizedIsInitialized;
      private static final S2C_ShopInfo_29002 DEFAULT_INSTANCE = new S2C_ShopInfo_29002();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ShopInfo_29002> PARSER = new AbstractParser<S2C_ShopInfo_29002>() {
         public S2C_ShopInfo_29002 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ShopInfo_29002(input, extensionRegistry);
         }
      };

      private S2C_ShopInfo_29002(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ShopInfo_29002() {
         this.memoizedIsInitialized = -1;
         this.shop_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ShopInfo_29002();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ShopInfo_29002(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.actDay_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.openServerDay_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.shop_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.shop_.add(input.readMessage(ZhenYuMsg.ShopInfo.PARSER, extensionRegistry));
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
                  this.shop_ = Collections.unmodifiableList(this.shop_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ZhenYuMsg.internal_static_zhenYu_com_gzbz_protobuf_S2C_ShopInfo_29002_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ZhenYuMsg.internal_static_zhenYu_com_gzbz_protobuf_S2C_ShopInfo_29002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopInfo_29002.class, Builder.class);
      }

      public boolean hasActDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActDay() {
         return this.actDay_;
      }

      public boolean hasOpenServerDay() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getOpenServerDay() {
         return this.openServerDay_;
      }

      public List<ShopInfo> getShopList() {
         return this.shop_;
      }

      public List<? extends ShopInfoOrBuilder> getShopOrBuilderList() {
         return this.shop_;
      }

      public int getShopCount() {
         return this.shop_.size();
      }

      public ShopInfo getShop(int index) {
         return (ShopInfo)this.shop_.get(index);
      }

      public ShopInfoOrBuilder getShopOrBuilder(int index) {
         return (ShopInfoOrBuilder)this.shop_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasActDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOpenServerDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getShopCount(); ++i) {
               if (!this.getShop(i).isInitialized()) {
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
            output.writeInt32(1, this.actDay_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.openServerDay_);
         }

         for(int i = 0; i < this.shop_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.shop_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.actDay_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.openServerDay_);
            }

            for(int i = 0; i < this.shop_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.shop_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ShopInfo_29002)) {
            return super.equals(obj);
         } else {
            S2C_ShopInfo_29002 other = (S2C_ShopInfo_29002)obj;
            if (this.hasActDay() != other.hasActDay()) {
               return false;
            } else if (this.hasActDay() && this.getActDay() != other.getActDay()) {
               return false;
            } else if (this.hasOpenServerDay() != other.hasOpenServerDay()) {
               return false;
            } else if (this.hasOpenServerDay() && this.getOpenServerDay() != other.getOpenServerDay()) {
               return false;
            } else if (!this.getShopList().equals(other.getShopList())) {
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
            if (this.hasActDay()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getActDay();
            }

            if (this.hasOpenServerDay()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getOpenServerDay();
            }

            if (this.getShopCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getShopList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ShopInfo_29002 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ShopInfo_29002)PARSER.parseFrom(data);
      }

      public static S2C_ShopInfo_29002 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopInfo_29002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopInfo_29002 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ShopInfo_29002)PARSER.parseFrom(data);
      }

      public static S2C_ShopInfo_29002 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopInfo_29002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopInfo_29002 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ShopInfo_29002)PARSER.parseFrom(data);
      }

      public static S2C_ShopInfo_29002 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopInfo_29002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopInfo_29002 parseFrom(InputStream input) throws IOException {
         return (S2C_ShopInfo_29002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopInfo_29002 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopInfo_29002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopInfo_29002 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ShopInfo_29002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ShopInfo_29002 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopInfo_29002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopInfo_29002 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ShopInfo_29002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopInfo_29002 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopInfo_29002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ShopInfo_29002 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ShopInfo_29002 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ShopInfo_29002> parser() {
         return PARSER;
      }

      public Parser<S2C_ShopInfo_29002> getParserForType() {
         return PARSER;
      }

      public S2C_ShopInfo_29002 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ShopInfo_29002OrBuilder {
         private int bitField0_;
         private int actDay_;
         private int openServerDay_;
         private List<ShopInfo> shop_;
         private RepeatedFieldBuilderV3<ShopInfo, ShopInfo.Builder, ShopInfoOrBuilder> shopBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ZhenYuMsg.internal_static_zhenYu_com_gzbz_protobuf_S2C_ShopInfo_29002_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ZhenYuMsg.internal_static_zhenYu_com_gzbz_protobuf_S2C_ShopInfo_29002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopInfo_29002.class, Builder.class);
         }

         private Builder() {
            this.shop_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.shop_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ZhenYuMsg.S2C_ShopInfo_29002.alwaysUseFieldBuilders) {
               this.getShopFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.actDay_ = 0;
            this.bitField0_ &= -2;
            this.openServerDay_ = 0;
            this.bitField0_ &= -3;
            if (this.shopBuilder_ == null) {
               this.shop_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.shopBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ZhenYuMsg.internal_static_zhenYu_com_gzbz_protobuf_S2C_ShopInfo_29002_descriptor;
         }

         public S2C_ShopInfo_29002 getDefaultInstanceForType() {
            return ZhenYuMsg.S2C_ShopInfo_29002.getDefaultInstance();
         }

         public S2C_ShopInfo_29002 build() {
            S2C_ShopInfo_29002 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ShopInfo_29002 buildPartial() {
            S2C_ShopInfo_29002 result = new S2C_ShopInfo_29002(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.actDay_ = this.actDay_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.openServerDay_ = this.openServerDay_;
               to_bitField0_ |= 2;
            }

            if (this.shopBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.shop_ = Collections.unmodifiableList(this.shop_);
                  this.bitField0_ &= -5;
               }

               result.shop_ = this.shop_;
            } else {
               result.shop_ = this.shopBuilder_.build();
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
            if (other instanceof S2C_ShopInfo_29002) {
               return this.mergeFrom((S2C_ShopInfo_29002)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ShopInfo_29002 other) {
            if (other == ZhenYuMsg.S2C_ShopInfo_29002.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActDay()) {
                  this.setActDay(other.getActDay());
               }

               if (other.hasOpenServerDay()) {
                  this.setOpenServerDay(other.getOpenServerDay());
               }

               if (this.shopBuilder_ == null) {
                  if (!other.shop_.isEmpty()) {
                     if (this.shop_.isEmpty()) {
                        this.shop_ = other.shop_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureShopIsMutable();
                        this.shop_.addAll(other.shop_);
                     }

                     this.onChanged();
                  }
               } else if (!other.shop_.isEmpty()) {
                  if (this.shopBuilder_.isEmpty()) {
                     this.shopBuilder_.dispose();
                     this.shopBuilder_ = null;
                     this.shop_ = other.shop_;
                     this.bitField0_ &= -5;
                     this.shopBuilder_ = ZhenYuMsg.S2C_ShopInfo_29002.alwaysUseFieldBuilders ? this.getShopFieldBuilder() : null;
                  } else {
                     this.shopBuilder_.addAllMessages(other.shop_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActDay()) {
               return false;
            } else if (!this.hasOpenServerDay()) {
               return false;
            } else {
               for(int i = 0; i < this.getShopCount(); ++i) {
                  if (!this.getShop(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ShopInfo_29002 parsedMessage = null;

            try {
               parsedMessage = (S2C_ShopInfo_29002)ZhenYuMsg.S2C_ShopInfo_29002.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ShopInfo_29002)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasActDay() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getActDay() {
            return this.actDay_;
         }

         public Builder setActDay(int value) {
            this.bitField0_ |= 1;
            this.actDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActDay() {
            this.bitField0_ &= -2;
            this.actDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOpenServerDay() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getOpenServerDay() {
            return this.openServerDay_;
         }

         public Builder setOpenServerDay(int value) {
            this.bitField0_ |= 2;
            this.openServerDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpenServerDay() {
            this.bitField0_ &= -3;
            this.openServerDay_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureShopIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.shop_ = new ArrayList(this.shop_);
               this.bitField0_ |= 4;
            }

         }

         public List<ShopInfo> getShopList() {
            return this.shopBuilder_ == null ? Collections.unmodifiableList(this.shop_) : this.shopBuilder_.getMessageList();
         }

         public int getShopCount() {
            return this.shopBuilder_ == null ? this.shop_.size() : this.shopBuilder_.getCount();
         }

         public ShopInfo getShop(int index) {
            return this.shopBuilder_ == null ? (ShopInfo)this.shop_.get(index) : (ShopInfo)this.shopBuilder_.getMessage(index);
         }

         public Builder setShop(int index, ShopInfo value) {
            if (this.shopBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureShopIsMutable();
               this.shop_.set(index, value);
               this.onChanged();
            } else {
               this.shopBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setShop(int index, ShopInfo.Builder builderForValue) {
            if (this.shopBuilder_ == null) {
               this.ensureShopIsMutable();
               this.shop_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.shopBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addShop(ShopInfo value) {
            if (this.shopBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureShopIsMutable();
               this.shop_.add(value);
               this.onChanged();
            } else {
               this.shopBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addShop(int index, ShopInfo value) {
            if (this.shopBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureShopIsMutable();
               this.shop_.add(index, value);
               this.onChanged();
            } else {
               this.shopBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addShop(ShopInfo.Builder builderForValue) {
            if (this.shopBuilder_ == null) {
               this.ensureShopIsMutable();
               this.shop_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.shopBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addShop(int index, ShopInfo.Builder builderForValue) {
            if (this.shopBuilder_ == null) {
               this.ensureShopIsMutable();
               this.shop_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.shopBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllShop(Iterable<? extends ShopInfo> values) {
            if (this.shopBuilder_ == null) {
               this.ensureShopIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.shop_);
               this.onChanged();
            } else {
               this.shopBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearShop() {
            if (this.shopBuilder_ == null) {
               this.shop_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.shopBuilder_.clear();
            }

            return this;
         }

         public Builder removeShop(int index) {
            if (this.shopBuilder_ == null) {
               this.ensureShopIsMutable();
               this.shop_.remove(index);
               this.onChanged();
            } else {
               this.shopBuilder_.remove(index);
            }

            return this;
         }

         public ShopInfo.Builder getShopBuilder(int index) {
            return (ShopInfo.Builder)this.getShopFieldBuilder().getBuilder(index);
         }

         public ShopInfoOrBuilder getShopOrBuilder(int index) {
            return this.shopBuilder_ == null ? (ShopInfoOrBuilder)this.shop_.get(index) : (ShopInfoOrBuilder)this.shopBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ShopInfoOrBuilder> getShopOrBuilderList() {
            return this.shopBuilder_ != null ? this.shopBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.shop_);
         }

         public ShopInfo.Builder addShopBuilder() {
            return (ShopInfo.Builder)this.getShopFieldBuilder().addBuilder(ZhenYuMsg.ShopInfo.getDefaultInstance());
         }

         public ShopInfo.Builder addShopBuilder(int index) {
            return (ShopInfo.Builder)this.getShopFieldBuilder().addBuilder(index, ZhenYuMsg.ShopInfo.getDefaultInstance());
         }

         public List<ShopInfo.Builder> getShopBuilderList() {
            return this.getShopFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ShopInfo, ShopInfo.Builder, ShopInfoOrBuilder> getShopFieldBuilder() {
            if (this.shopBuilder_ == null) {
               this.shopBuilder_ = new RepeatedFieldBuilderV3(this.shop_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.shop_ = null;
            }

            return this.shopBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class ShopInfo extends GeneratedMessageV3 implements ShopInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int BUY_FIELD_NUMBER = 2;
      private int buy_;
      private byte memoizedIsInitialized;
      private static final ShopInfo DEFAULT_INSTANCE = new ShopInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<ShopInfo> PARSER = new AbstractParser<ShopInfo>() {
         public ShopInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new ShopInfo(input, extensionRegistry);
         }
      };

      private ShopInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ShopInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new ShopInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ShopInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buy_ = input.readInt32();
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
         return ZhenYuMsg.internal_static_zhenYu_com_gzbz_protobuf_ShopInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ZhenYuMsg.internal_static_zhenYu_com_gzbz_protobuf_ShopInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ShopInfo.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasBuy() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBuy() {
         return this.buy_;
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
         } else if (!this.hasBuy()) {
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
            output.writeInt32(2, this.buy_);
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
               size += CodedOutputStream.computeInt32Size(2, this.buy_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof ShopInfo)) {
            return super.equals(obj);
         } else {
            ShopInfo other = (ShopInfo)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasBuy() != other.hasBuy()) {
               return false;
            } else if (this.hasBuy() && this.getBuy() != other.getBuy()) {
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

            if (this.hasBuy()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuy();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static ShopInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (ShopInfo)PARSER.parseFrom(data);
      }

      public static ShopInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ShopInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ShopInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (ShopInfo)PARSER.parseFrom(data);
      }

      public static ShopInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ShopInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ShopInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (ShopInfo)PARSER.parseFrom(data);
      }

      public static ShopInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ShopInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ShopInfo parseFrom(InputStream input) throws IOException {
         return (ShopInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ShopInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ShopInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static ShopInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (ShopInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static ShopInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ShopInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static ShopInfo parseFrom(CodedInputStream input) throws IOException {
         return (ShopInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ShopInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ShopInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(ShopInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static ShopInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ShopInfo> parser() {
         return PARSER;
      }

      public Parser<ShopInfo> getParserForType() {
         return PARSER;
      }

      public ShopInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ShopInfoOrBuilder {
         private int bitField0_;
         private int id_;
         private int buy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ZhenYuMsg.internal_static_zhenYu_com_gzbz_protobuf_ShopInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ZhenYuMsg.internal_static_zhenYu_com_gzbz_protobuf_ShopInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ShopInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ZhenYuMsg.ShopInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.buy_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ZhenYuMsg.internal_static_zhenYu_com_gzbz_protobuf_ShopInfo_descriptor;
         }

         public ShopInfo getDefaultInstanceForType() {
            return ZhenYuMsg.ShopInfo.getDefaultInstance();
         }

         public ShopInfo build() {
            ShopInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public ShopInfo buildPartial() {
            ShopInfo result = new ShopInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buy_ = this.buy_;
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
            if (other instanceof ShopInfo) {
               return this.mergeFrom((ShopInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ShopInfo other) {
            if (other == ZhenYuMsg.ShopInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasBuy()) {
                  this.setBuy(other.getBuy());
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
               return this.hasBuy();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            ShopInfo parsedMessage = null;

            try {
               parsedMessage = (ShopInfo)ZhenYuMsg.ShopInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (ShopInfo)e.getUnfinishedMessage();
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

         public boolean hasBuy() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuy() {
            return this.buy_;
         }

         public Builder setBuy(int value) {
            this.bitField0_ |= 2;
            this.buy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuy() {
            this.bitField0_ &= -3;
            this.buy_ = 0;
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

   public static final class C2S_Buy_29003 extends GeneratedMessageV3 implements C2S_Buy_29003OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_Buy_29003 DEFAULT_INSTANCE = new C2S_Buy_29003();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Buy_29003> PARSER = new AbstractParser<C2S_Buy_29003>() {
         public C2S_Buy_29003 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Buy_29003(input, extensionRegistry);
         }
      };

      private C2S_Buy_29003(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Buy_29003() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Buy_29003();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Buy_29003(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ZhenYuMsg.internal_static_zhenYu_com_gzbz_protobuf_C2S_Buy_29003_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ZhenYuMsg.internal_static_zhenYu_com_gzbz_protobuf_C2S_Buy_29003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Buy_29003.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Buy_29003)) {
            return super.equals(obj);
         } else {
            C2S_Buy_29003 other = (C2S_Buy_29003)obj;
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

      public static C2S_Buy_29003 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Buy_29003)PARSER.parseFrom(data);
      }

      public static C2S_Buy_29003 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Buy_29003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Buy_29003 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Buy_29003)PARSER.parseFrom(data);
      }

      public static C2S_Buy_29003 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Buy_29003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Buy_29003 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Buy_29003)PARSER.parseFrom(data);
      }

      public static C2S_Buy_29003 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Buy_29003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Buy_29003 parseFrom(InputStream input) throws IOException {
         return (C2S_Buy_29003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Buy_29003 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Buy_29003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Buy_29003 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Buy_29003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Buy_29003 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Buy_29003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Buy_29003 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Buy_29003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Buy_29003 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Buy_29003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Buy_29003 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Buy_29003 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Buy_29003> parser() {
         return PARSER;
      }

      public Parser<C2S_Buy_29003> getParserForType() {
         return PARSER;
      }

      public C2S_Buy_29003 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Buy_29003OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ZhenYuMsg.internal_static_zhenYu_com_gzbz_protobuf_C2S_Buy_29003_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ZhenYuMsg.internal_static_zhenYu_com_gzbz_protobuf_C2S_Buy_29003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Buy_29003.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ZhenYuMsg.C2S_Buy_29003.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ZhenYuMsg.internal_static_zhenYu_com_gzbz_protobuf_C2S_Buy_29003_descriptor;
         }

         public C2S_Buy_29003 getDefaultInstanceForType() {
            return ZhenYuMsg.C2S_Buy_29003.getDefaultInstance();
         }

         public C2S_Buy_29003 build() {
            C2S_Buy_29003 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Buy_29003 buildPartial() {
            C2S_Buy_29003 result = new C2S_Buy_29003(this);
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
            if (other instanceof C2S_Buy_29003) {
               return this.mergeFrom((C2S_Buy_29003)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Buy_29003 other) {
            if (other == ZhenYuMsg.C2S_Buy_29003.getDefaultInstance()) {
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
            C2S_Buy_29003 parsedMessage = null;

            try {
               parsedMessage = (C2S_Buy_29003)ZhenYuMsg.C2S_Buy_29003.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Buy_29003)e.getUnfinishedMessage();
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

   public interface C2S_Buy_29003OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_ShopInfo_29001OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_ShopInfo_29002OrBuilder extends MessageOrBuilder {
      boolean hasActDay();

      int getActDay();

      boolean hasOpenServerDay();

      int getOpenServerDay();

      List<ShopInfo> getShopList();

      ShopInfo getShop(int index);

      int getShopCount();

      List<? extends ShopInfoOrBuilder> getShopOrBuilderList();

      ShopInfoOrBuilder getShopOrBuilder(int index);
   }

   public interface ShopInfoOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasBuy();

      int getBuy();
   }
}
