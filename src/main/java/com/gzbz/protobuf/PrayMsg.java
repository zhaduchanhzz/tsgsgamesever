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

public final class PrayMsg {
   private static final Descriptors.Descriptor internal_static_pray_com_gzbz_protobuf_C2S_GetPrayInfo_7501_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pray_com_gzbz_protobuf_C2S_GetPrayInfo_7501_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pray_com_gzbz_protobuf_S2C_GetPrayInfo_7502_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pray_com_gzbz_protobuf_S2C_GetPrayInfo_7502_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pray_com_gzbz_protobuf_C2S_Pray_7503_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pray_com_gzbz_protobuf_C2S_Pray_7503_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pray_com_gzbz_protobuf_S2C_Pray_7504_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pray_com_gzbz_protobuf_S2C_Pray_7504_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pray_com_gzbz_protobuf_C2S_RefreshPrayReward_7505_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pray_com_gzbz_protobuf_C2S_RefreshPrayReward_7505_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pray_com_gzbz_protobuf_S2C_RefreshPrayReward_7506_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pray_com_gzbz_protobuf_S2C_RefreshPrayReward_7506_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pray_com_gzbz_protobuf_PrayGridInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pray_com_gzbz_protobuf_PrayGridInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pray_com_gzbz_protobuf_C2S_GetLuckyReward_7507_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pray_com_gzbz_protobuf_C2S_GetLuckyReward_7507_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pray_com_gzbz_protobuf_S2C_GetLuckyReward_7508_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pray_com_gzbz_protobuf_S2C_GetLuckyReward_7508_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pray_com_gzbz_protobuf_C2S_PlayerAwardInfo_7509_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pray_com_gzbz_protobuf_C2S_PlayerAwardInfo_7509_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pray_com_gzbz_protobuf_S2C_PlayerAwardInfo_7510_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pray_com_gzbz_protobuf_S2C_PlayerAwardInfo_7510_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_pray_com_gzbz_protobuf_Pray_RecordData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_pray_com_gzbz_protobuf_Pray_RecordData_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private PrayMsg() {
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
      String[] descriptorData = new String[]{"\n\nPray.proto\u0012\u0016pray.com.gzbz.protobuf\u001a\fcommon.proto\"&\n\u0014C2S_GetPrayInfo_7501\u0012\u000e\n\u0006prayId\u0018\u0001 \u0002(\u0005\" \u0001\n\u0014S2C_GetPrayInfo_7502\u0012D\n\bprayInfo\u0018\u0001 \u0003(\u000b22.pray.com.gzbz.protobuf.S2C_RefreshPrayReward_7506\u0012B\n\tluckyInfo\u0018\u0002 \u0003(\u000b2/.pray.com.gzbz.protobuf.S2C_GetLuckyReward_7508\"7\n\rC2S_Pray_7503\u0012\u000e\n\u0006prayId\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000eprayTimesIndex\u0018\u0002 \u0002(\u0005\"g\n\rS2C_Pray_7504\u0012\u000b\n\u0003pos\u0018\u0001 \u0003(\u0005\u0012\u0012\n\nluckyPoint\u0018\u0002 \u0002(\u0005\u00125\n\u0004data\u0018\u0003 \u0003(\u000b2'.pray.com.gzbz.protobuf.Pray_RecordData\",\n\u001aC2S_RefreshPrayReward_7505\u0012\u000e\n\u0006prayId\u0018\u0001 \u0002(\u0005\"v\n\u001aS2C_RefreshPrayReward_7506\u0012\u000e\n\u0006prayId\u0018\u0001 \u0002(\u0005\u00122\n\u0004grid\u0018\u0002 \u0003(\u000b2$.pray.com.gzbz.protobuf.PrayGridInfo\u0012\u0014\n\frefreshTimes\u0018\u0003 \u0002(\u0005\"[\n\fPrayGridInfo\u0012\u000b\n\u0003pos\u0018\u0001 \u0002(\u0005\u0012 \n\u0006reward\u0018\u0002 \u0002(\u000b2\u0010.common.ItemInfo\u0012\r\n\u0005count\u0018\u0003 \u0002(\u0005\u0012\r\n\u0005limit\u0018\u0004 \u0002(\u0005\";\n\u0017C2S_GetLuckyReward_7507\u0012\u000e\n\u0006prayId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\brewardId\u0018\u0002 \u0002(\u0005\"O\n\u0017S2C_GetLuckyReward_7508\u0012\u000e\n\u0006prayId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\brewardId\u0018\u0002 \u0003(\u0005\u0012\u0012\n\nluckyPoint\u0018\u0003 \u0002(\u0005\"*\n\u0018C2S_PlayerAwardInfo_7509\u0012\u000e\n\u0006prayId\u0018\u0001 \u0002(\u0005\"a\n\u0018S2C_PlayerAwardInfo_7510\u0012\u000e\n\u0006prayId\u0018\u0001 \u0002(\u0005\u00125\n\u0004data\u0018\u0002 \u0003(\u000b2'.pray.com.gzbz.protobuf.Pray_RecordData\"G\n\u000fPray_RecordData\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012 \n\u0006reward\u0018\u0002 \u0002(\u000b2\u0010.common.ItemInfoB\u001e\n\u0011com.gzbz.protobufB\u0007PrayMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_pray_com_gzbz_protobuf_C2S_GetPrayInfo_7501_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_pray_com_gzbz_protobuf_C2S_GetPrayInfo_7501_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pray_com_gzbz_protobuf_C2S_GetPrayInfo_7501_descriptor, new String[]{"PrayId"});
      internal_static_pray_com_gzbz_protobuf_S2C_GetPrayInfo_7502_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_pray_com_gzbz_protobuf_S2C_GetPrayInfo_7502_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pray_com_gzbz_protobuf_S2C_GetPrayInfo_7502_descriptor, new String[]{"PrayInfo", "LuckyInfo"});
      internal_static_pray_com_gzbz_protobuf_C2S_Pray_7503_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_pray_com_gzbz_protobuf_C2S_Pray_7503_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pray_com_gzbz_protobuf_C2S_Pray_7503_descriptor, new String[]{"PrayId", "PrayTimesIndex"});
      internal_static_pray_com_gzbz_protobuf_S2C_Pray_7504_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_pray_com_gzbz_protobuf_S2C_Pray_7504_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pray_com_gzbz_protobuf_S2C_Pray_7504_descriptor, new String[]{"Pos", "LuckyPoint", "Data"});
      internal_static_pray_com_gzbz_protobuf_C2S_RefreshPrayReward_7505_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_pray_com_gzbz_protobuf_C2S_RefreshPrayReward_7505_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pray_com_gzbz_protobuf_C2S_RefreshPrayReward_7505_descriptor, new String[]{"PrayId"});
      internal_static_pray_com_gzbz_protobuf_S2C_RefreshPrayReward_7506_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_pray_com_gzbz_protobuf_S2C_RefreshPrayReward_7506_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pray_com_gzbz_protobuf_S2C_RefreshPrayReward_7506_descriptor, new String[]{"PrayId", "Grid", "RefreshTimes"});
      internal_static_pray_com_gzbz_protobuf_PrayGridInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_pray_com_gzbz_protobuf_PrayGridInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pray_com_gzbz_protobuf_PrayGridInfo_descriptor, new String[]{"Pos", "Reward", "Count", "Limit"});
      internal_static_pray_com_gzbz_protobuf_C2S_GetLuckyReward_7507_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_pray_com_gzbz_protobuf_C2S_GetLuckyReward_7507_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pray_com_gzbz_protobuf_C2S_GetLuckyReward_7507_descriptor, new String[]{"PrayId", "RewardId"});
      internal_static_pray_com_gzbz_protobuf_S2C_GetLuckyReward_7508_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_pray_com_gzbz_protobuf_S2C_GetLuckyReward_7508_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pray_com_gzbz_protobuf_S2C_GetLuckyReward_7508_descriptor, new String[]{"PrayId", "RewardId", "LuckyPoint"});
      internal_static_pray_com_gzbz_protobuf_C2S_PlayerAwardInfo_7509_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_pray_com_gzbz_protobuf_C2S_PlayerAwardInfo_7509_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pray_com_gzbz_protobuf_C2S_PlayerAwardInfo_7509_descriptor, new String[]{"PrayId"});
      internal_static_pray_com_gzbz_protobuf_S2C_PlayerAwardInfo_7510_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_pray_com_gzbz_protobuf_S2C_PlayerAwardInfo_7510_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pray_com_gzbz_protobuf_S2C_PlayerAwardInfo_7510_descriptor, new String[]{"PrayId", "Data"});
      internal_static_pray_com_gzbz_protobuf_Pray_RecordData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_pray_com_gzbz_protobuf_Pray_RecordData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_pray_com_gzbz_protobuf_Pray_RecordData_descriptor, new String[]{"PlayerName", "Reward"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_GetPrayInfo_7501 extends GeneratedMessageV3 implements C2S_GetPrayInfo_7501OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PRAYID_FIELD_NUMBER = 1;
      private int prayId_;
      private byte memoizedIsInitialized;
      private static final C2S_GetPrayInfo_7501 DEFAULT_INSTANCE = new C2S_GetPrayInfo_7501();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GetPrayInfo_7501> PARSER = new AbstractParser<C2S_GetPrayInfo_7501>() {
         public C2S_GetPrayInfo_7501 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GetPrayInfo_7501(input, extensionRegistry);
         }
      };

      private C2S_GetPrayInfo_7501(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GetPrayInfo_7501() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GetPrayInfo_7501();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GetPrayInfo_7501(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.prayId_ = input.readInt32();
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
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_GetPrayInfo_7501_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_GetPrayInfo_7501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetPrayInfo_7501.class, Builder.class);
      }

      public boolean hasPrayId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPrayId() {
         return this.prayId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPrayId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.prayId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.prayId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_GetPrayInfo_7501)) {
            return super.equals(obj);
         } else {
            C2S_GetPrayInfo_7501 other = (C2S_GetPrayInfo_7501)obj;
            if (this.hasPrayId() != other.hasPrayId()) {
               return false;
            } else if (this.hasPrayId() && this.getPrayId() != other.getPrayId()) {
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
            if (this.hasPrayId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPrayId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_GetPrayInfo_7501 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GetPrayInfo_7501)PARSER.parseFrom(data);
      }

      public static C2S_GetPrayInfo_7501 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetPrayInfo_7501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetPrayInfo_7501 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GetPrayInfo_7501)PARSER.parseFrom(data);
      }

      public static C2S_GetPrayInfo_7501 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetPrayInfo_7501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetPrayInfo_7501 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GetPrayInfo_7501)PARSER.parseFrom(data);
      }

      public static C2S_GetPrayInfo_7501 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetPrayInfo_7501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetPrayInfo_7501 parseFrom(InputStream input) throws IOException {
         return (C2S_GetPrayInfo_7501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetPrayInfo_7501 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetPrayInfo_7501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetPrayInfo_7501 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GetPrayInfo_7501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GetPrayInfo_7501 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetPrayInfo_7501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetPrayInfo_7501 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GetPrayInfo_7501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetPrayInfo_7501 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetPrayInfo_7501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GetPrayInfo_7501 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GetPrayInfo_7501 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GetPrayInfo_7501> parser() {
         return PARSER;
      }

      public Parser<C2S_GetPrayInfo_7501> getParserForType() {
         return PARSER;
      }

      public C2S_GetPrayInfo_7501 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GetPrayInfo_7501OrBuilder {
         private int bitField0_;
         private int prayId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_GetPrayInfo_7501_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_GetPrayInfo_7501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetPrayInfo_7501.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrayMsg.C2S_GetPrayInfo_7501.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.prayId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_GetPrayInfo_7501_descriptor;
         }

         public C2S_GetPrayInfo_7501 getDefaultInstanceForType() {
            return PrayMsg.C2S_GetPrayInfo_7501.getDefaultInstance();
         }

         public C2S_GetPrayInfo_7501 build() {
            C2S_GetPrayInfo_7501 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GetPrayInfo_7501 buildPartial() {
            C2S_GetPrayInfo_7501 result = new C2S_GetPrayInfo_7501(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.prayId_ = this.prayId_;
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
            if (other instanceof C2S_GetPrayInfo_7501) {
               return this.mergeFrom((C2S_GetPrayInfo_7501)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GetPrayInfo_7501 other) {
            if (other == PrayMsg.C2S_GetPrayInfo_7501.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPrayId()) {
                  this.setPrayId(other.getPrayId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPrayId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_GetPrayInfo_7501 parsedMessage = null;

            try {
               parsedMessage = (C2S_GetPrayInfo_7501)PrayMsg.C2S_GetPrayInfo_7501.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GetPrayInfo_7501)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPrayId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPrayId() {
            return this.prayId_;
         }

         public Builder setPrayId(int value) {
            this.bitField0_ |= 1;
            this.prayId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrayId() {
            this.bitField0_ &= -2;
            this.prayId_ = 0;
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

   public static final class S2C_GetPrayInfo_7502 extends GeneratedMessageV3 implements S2C_GetPrayInfo_7502OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int PRAYINFO_FIELD_NUMBER = 1;
      private List<S2C_RefreshPrayReward_7506> prayInfo_;
      public static final int LUCKYINFO_FIELD_NUMBER = 2;
      private List<S2C_GetLuckyReward_7508> luckyInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_GetPrayInfo_7502 DEFAULT_INSTANCE = new S2C_GetPrayInfo_7502();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GetPrayInfo_7502> PARSER = new AbstractParser<S2C_GetPrayInfo_7502>() {
         public S2C_GetPrayInfo_7502 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GetPrayInfo_7502(input, extensionRegistry);
         }
      };

      private S2C_GetPrayInfo_7502(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GetPrayInfo_7502() {
         this.memoizedIsInitialized = -1;
         this.prayInfo_ = Collections.emptyList();
         this.luckyInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GetPrayInfo_7502();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GetPrayInfo_7502(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.prayInfo_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.prayInfo_.add(input.readMessage(PrayMsg.S2C_RefreshPrayReward_7506.PARSER, extensionRegistry));
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.luckyInfo_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.luckyInfo_.add(input.readMessage(PrayMsg.S2C_GetLuckyReward_7508.PARSER, extensionRegistry));
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
                  this.prayInfo_ = Collections.unmodifiableList(this.prayInfo_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.luckyInfo_ = Collections.unmodifiableList(this.luckyInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_GetPrayInfo_7502_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_GetPrayInfo_7502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetPrayInfo_7502.class, Builder.class);
      }

      public List<S2C_RefreshPrayReward_7506> getPrayInfoList() {
         return this.prayInfo_;
      }

      public List<? extends S2C_RefreshPrayReward_7506OrBuilder> getPrayInfoOrBuilderList() {
         return this.prayInfo_;
      }

      public int getPrayInfoCount() {
         return this.prayInfo_.size();
      }

      public S2C_RefreshPrayReward_7506 getPrayInfo(int index) {
         return (S2C_RefreshPrayReward_7506)this.prayInfo_.get(index);
      }

      public S2C_RefreshPrayReward_7506OrBuilder getPrayInfoOrBuilder(int index) {
         return (S2C_RefreshPrayReward_7506OrBuilder)this.prayInfo_.get(index);
      }

      public List<S2C_GetLuckyReward_7508> getLuckyInfoList() {
         return this.luckyInfo_;
      }

      public List<? extends S2C_GetLuckyReward_7508OrBuilder> getLuckyInfoOrBuilderList() {
         return this.luckyInfo_;
      }

      public int getLuckyInfoCount() {
         return this.luckyInfo_.size();
      }

      public S2C_GetLuckyReward_7508 getLuckyInfo(int index) {
         return (S2C_GetLuckyReward_7508)this.luckyInfo_.get(index);
      }

      public S2C_GetLuckyReward_7508OrBuilder getLuckyInfoOrBuilder(int index) {
         return (S2C_GetLuckyReward_7508OrBuilder)this.luckyInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getPrayInfoCount(); ++i) {
               if (!this.getPrayInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getLuckyInfoCount(); ++i) {
               if (!this.getLuckyInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.prayInfo_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.prayInfo_.get(i));
         }

         for(int i = 0; i < this.luckyInfo_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.luckyInfo_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.prayInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.prayInfo_.get(i));
            }

            for(int i = 0; i < this.luckyInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.luckyInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GetPrayInfo_7502)) {
            return super.equals(obj);
         } else {
            S2C_GetPrayInfo_7502 other = (S2C_GetPrayInfo_7502)obj;
            if (!this.getPrayInfoList().equals(other.getPrayInfoList())) {
               return false;
            } else if (!this.getLuckyInfoList().equals(other.getLuckyInfoList())) {
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
            if (this.getPrayInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPrayInfoList().hashCode();
            }

            if (this.getLuckyInfoCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLuckyInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GetPrayInfo_7502 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GetPrayInfo_7502)PARSER.parseFrom(data);
      }

      public static S2C_GetPrayInfo_7502 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetPrayInfo_7502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetPrayInfo_7502 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GetPrayInfo_7502)PARSER.parseFrom(data);
      }

      public static S2C_GetPrayInfo_7502 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetPrayInfo_7502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetPrayInfo_7502 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GetPrayInfo_7502)PARSER.parseFrom(data);
      }

      public static S2C_GetPrayInfo_7502 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetPrayInfo_7502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetPrayInfo_7502 parseFrom(InputStream input) throws IOException {
         return (S2C_GetPrayInfo_7502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetPrayInfo_7502 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetPrayInfo_7502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetPrayInfo_7502 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GetPrayInfo_7502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GetPrayInfo_7502 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetPrayInfo_7502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetPrayInfo_7502 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GetPrayInfo_7502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetPrayInfo_7502 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetPrayInfo_7502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GetPrayInfo_7502 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GetPrayInfo_7502 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GetPrayInfo_7502> parser() {
         return PARSER;
      }

      public Parser<S2C_GetPrayInfo_7502> getParserForType() {
         return PARSER;
      }

      public S2C_GetPrayInfo_7502 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GetPrayInfo_7502OrBuilder {
         private int bitField0_;
         private List<S2C_RefreshPrayReward_7506> prayInfo_;
         private RepeatedFieldBuilderV3<S2C_RefreshPrayReward_7506, S2C_RefreshPrayReward_7506.Builder, S2C_RefreshPrayReward_7506OrBuilder> prayInfoBuilder_;
         private List<S2C_GetLuckyReward_7508> luckyInfo_;
         private RepeatedFieldBuilderV3<S2C_GetLuckyReward_7508, S2C_GetLuckyReward_7508.Builder, S2C_GetLuckyReward_7508OrBuilder> luckyInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_GetPrayInfo_7502_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_GetPrayInfo_7502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetPrayInfo_7502.class, Builder.class);
         }

         private Builder() {
            this.prayInfo_ = Collections.emptyList();
            this.luckyInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.prayInfo_ = Collections.emptyList();
            this.luckyInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrayMsg.S2C_GetPrayInfo_7502.alwaysUseFieldBuilders) {
               this.getPrayInfoFieldBuilder();
               this.getLuckyInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.prayInfoBuilder_ == null) {
               this.prayInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.prayInfoBuilder_.clear();
            }

            if (this.luckyInfoBuilder_ == null) {
               this.luckyInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.luckyInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_GetPrayInfo_7502_descriptor;
         }

         public S2C_GetPrayInfo_7502 getDefaultInstanceForType() {
            return PrayMsg.S2C_GetPrayInfo_7502.getDefaultInstance();
         }

         public S2C_GetPrayInfo_7502 build() {
            S2C_GetPrayInfo_7502 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GetPrayInfo_7502 buildPartial() {
            S2C_GetPrayInfo_7502 result = new S2C_GetPrayInfo_7502(this);
            int from_bitField0_ = this.bitField0_;
            if (this.prayInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.prayInfo_ = Collections.unmodifiableList(this.prayInfo_);
                  this.bitField0_ &= -2;
               }

               result.prayInfo_ = this.prayInfo_;
            } else {
               result.prayInfo_ = this.prayInfoBuilder_.build();
            }

            if (this.luckyInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.luckyInfo_ = Collections.unmodifiableList(this.luckyInfo_);
                  this.bitField0_ &= -3;
               }

               result.luckyInfo_ = this.luckyInfo_;
            } else {
               result.luckyInfo_ = this.luckyInfoBuilder_.build();
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
            if (other instanceof S2C_GetPrayInfo_7502) {
               return this.mergeFrom((S2C_GetPrayInfo_7502)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GetPrayInfo_7502 other) {
            if (other == PrayMsg.S2C_GetPrayInfo_7502.getDefaultInstance()) {
               return this;
            } else {
               if (this.prayInfoBuilder_ == null) {
                  if (!other.prayInfo_.isEmpty()) {
                     if (this.prayInfo_.isEmpty()) {
                        this.prayInfo_ = other.prayInfo_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensurePrayInfoIsMutable();
                        this.prayInfo_.addAll(other.prayInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.prayInfo_.isEmpty()) {
                  if (this.prayInfoBuilder_.isEmpty()) {
                     this.prayInfoBuilder_.dispose();
                     this.prayInfoBuilder_ = null;
                     this.prayInfo_ = other.prayInfo_;
                     this.bitField0_ &= -2;
                     this.prayInfoBuilder_ = PrayMsg.S2C_GetPrayInfo_7502.alwaysUseFieldBuilders ? this.getPrayInfoFieldBuilder() : null;
                  } else {
                     this.prayInfoBuilder_.addAllMessages(other.prayInfo_);
                  }
               }

               if (this.luckyInfoBuilder_ == null) {
                  if (!other.luckyInfo_.isEmpty()) {
                     if (this.luckyInfo_.isEmpty()) {
                        this.luckyInfo_ = other.luckyInfo_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureLuckyInfoIsMutable();
                        this.luckyInfo_.addAll(other.luckyInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.luckyInfo_.isEmpty()) {
                  if (this.luckyInfoBuilder_.isEmpty()) {
                     this.luckyInfoBuilder_.dispose();
                     this.luckyInfoBuilder_ = null;
                     this.luckyInfo_ = other.luckyInfo_;
                     this.bitField0_ &= -3;
                     this.luckyInfoBuilder_ = PrayMsg.S2C_GetPrayInfo_7502.alwaysUseFieldBuilders ? this.getLuckyInfoFieldBuilder() : null;
                  } else {
                     this.luckyInfoBuilder_.addAllMessages(other.luckyInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getPrayInfoCount(); ++i) {
               if (!this.getPrayInfo(i).isInitialized()) {
                  return false;
               }
            }

            for(int i = 0; i < this.getLuckyInfoCount(); ++i) {
               if (!this.getLuckyInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GetPrayInfo_7502 parsedMessage = null;

            try {
               parsedMessage = (S2C_GetPrayInfo_7502)PrayMsg.S2C_GetPrayInfo_7502.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GetPrayInfo_7502)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensurePrayInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.prayInfo_ = new ArrayList(this.prayInfo_);
               this.bitField0_ |= 1;
            }

         }

         public List<S2C_RefreshPrayReward_7506> getPrayInfoList() {
            return this.prayInfoBuilder_ == null ? Collections.unmodifiableList(this.prayInfo_) : this.prayInfoBuilder_.getMessageList();
         }

         public int getPrayInfoCount() {
            return this.prayInfoBuilder_ == null ? this.prayInfo_.size() : this.prayInfoBuilder_.getCount();
         }

         public S2C_RefreshPrayReward_7506 getPrayInfo(int index) {
            return this.prayInfoBuilder_ == null ? (S2C_RefreshPrayReward_7506)this.prayInfo_.get(index) : (S2C_RefreshPrayReward_7506)this.prayInfoBuilder_.getMessage(index);
         }

         public Builder setPrayInfo(int index, S2C_RefreshPrayReward_7506 value) {
            if (this.prayInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePrayInfoIsMutable();
               this.prayInfo_.set(index, value);
               this.onChanged();
            } else {
               this.prayInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPrayInfo(int index, S2C_RefreshPrayReward_7506.Builder builderForValue) {
            if (this.prayInfoBuilder_ == null) {
               this.ensurePrayInfoIsMutable();
               this.prayInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.prayInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPrayInfo(S2C_RefreshPrayReward_7506 value) {
            if (this.prayInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePrayInfoIsMutable();
               this.prayInfo_.add(value);
               this.onChanged();
            } else {
               this.prayInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPrayInfo(int index, S2C_RefreshPrayReward_7506 value) {
            if (this.prayInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePrayInfoIsMutable();
               this.prayInfo_.add(index, value);
               this.onChanged();
            } else {
               this.prayInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPrayInfo(S2C_RefreshPrayReward_7506.Builder builderForValue) {
            if (this.prayInfoBuilder_ == null) {
               this.ensurePrayInfoIsMutable();
               this.prayInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.prayInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPrayInfo(int index, S2C_RefreshPrayReward_7506.Builder builderForValue) {
            if (this.prayInfoBuilder_ == null) {
               this.ensurePrayInfoIsMutable();
               this.prayInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.prayInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPrayInfo(Iterable<? extends S2C_RefreshPrayReward_7506> values) {
            if (this.prayInfoBuilder_ == null) {
               this.ensurePrayInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.prayInfo_);
               this.onChanged();
            } else {
               this.prayInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPrayInfo() {
            if (this.prayInfoBuilder_ == null) {
               this.prayInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.prayInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removePrayInfo(int index) {
            if (this.prayInfoBuilder_ == null) {
               this.ensurePrayInfoIsMutable();
               this.prayInfo_.remove(index);
               this.onChanged();
            } else {
               this.prayInfoBuilder_.remove(index);
            }

            return this;
         }

         public S2C_RefreshPrayReward_7506.Builder getPrayInfoBuilder(int index) {
            return (S2C_RefreshPrayReward_7506.Builder)this.getPrayInfoFieldBuilder().getBuilder(index);
         }

         public S2C_RefreshPrayReward_7506OrBuilder getPrayInfoOrBuilder(int index) {
            return this.prayInfoBuilder_ == null ? (S2C_RefreshPrayReward_7506OrBuilder)this.prayInfo_.get(index) : (S2C_RefreshPrayReward_7506OrBuilder)this.prayInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends S2C_RefreshPrayReward_7506OrBuilder> getPrayInfoOrBuilderList() {
            return this.prayInfoBuilder_ != null ? this.prayInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.prayInfo_);
         }

         public S2C_RefreshPrayReward_7506.Builder addPrayInfoBuilder() {
            return (S2C_RefreshPrayReward_7506.Builder)this.getPrayInfoFieldBuilder().addBuilder(PrayMsg.S2C_RefreshPrayReward_7506.getDefaultInstance());
         }

         public S2C_RefreshPrayReward_7506.Builder addPrayInfoBuilder(int index) {
            return (S2C_RefreshPrayReward_7506.Builder)this.getPrayInfoFieldBuilder().addBuilder(index, PrayMsg.S2C_RefreshPrayReward_7506.getDefaultInstance());
         }

         public List<S2C_RefreshPrayReward_7506.Builder> getPrayInfoBuilderList() {
            return this.getPrayInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<S2C_RefreshPrayReward_7506, S2C_RefreshPrayReward_7506.Builder, S2C_RefreshPrayReward_7506OrBuilder> getPrayInfoFieldBuilder() {
            if (this.prayInfoBuilder_ == null) {
               this.prayInfoBuilder_ = new RepeatedFieldBuilderV3(this.prayInfo_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.prayInfo_ = null;
            }

            return this.prayInfoBuilder_;
         }

         private void ensureLuckyInfoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.luckyInfo_ = new ArrayList(this.luckyInfo_);
               this.bitField0_ |= 2;
            }

         }

         public List<S2C_GetLuckyReward_7508> getLuckyInfoList() {
            return this.luckyInfoBuilder_ == null ? Collections.unmodifiableList(this.luckyInfo_) : this.luckyInfoBuilder_.getMessageList();
         }

         public int getLuckyInfoCount() {
            return this.luckyInfoBuilder_ == null ? this.luckyInfo_.size() : this.luckyInfoBuilder_.getCount();
         }

         public S2C_GetLuckyReward_7508 getLuckyInfo(int index) {
            return this.luckyInfoBuilder_ == null ? (S2C_GetLuckyReward_7508)this.luckyInfo_.get(index) : (S2C_GetLuckyReward_7508)this.luckyInfoBuilder_.getMessage(index);
         }

         public Builder setLuckyInfo(int index, S2C_GetLuckyReward_7508 value) {
            if (this.luckyInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLuckyInfoIsMutable();
               this.luckyInfo_.set(index, value);
               this.onChanged();
            } else {
               this.luckyInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setLuckyInfo(int index, S2C_GetLuckyReward_7508.Builder builderForValue) {
            if (this.luckyInfoBuilder_ == null) {
               this.ensureLuckyInfoIsMutable();
               this.luckyInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.luckyInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addLuckyInfo(S2C_GetLuckyReward_7508 value) {
            if (this.luckyInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLuckyInfoIsMutable();
               this.luckyInfo_.add(value);
               this.onChanged();
            } else {
               this.luckyInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addLuckyInfo(int index, S2C_GetLuckyReward_7508 value) {
            if (this.luckyInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLuckyInfoIsMutable();
               this.luckyInfo_.add(index, value);
               this.onChanged();
            } else {
               this.luckyInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addLuckyInfo(S2C_GetLuckyReward_7508.Builder builderForValue) {
            if (this.luckyInfoBuilder_ == null) {
               this.ensureLuckyInfoIsMutable();
               this.luckyInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.luckyInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addLuckyInfo(int index, S2C_GetLuckyReward_7508.Builder builderForValue) {
            if (this.luckyInfoBuilder_ == null) {
               this.ensureLuckyInfoIsMutable();
               this.luckyInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.luckyInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllLuckyInfo(Iterable<? extends S2C_GetLuckyReward_7508> values) {
            if (this.luckyInfoBuilder_ == null) {
               this.ensureLuckyInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.luckyInfo_);
               this.onChanged();
            } else {
               this.luckyInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearLuckyInfo() {
            if (this.luckyInfoBuilder_ == null) {
               this.luckyInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.luckyInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeLuckyInfo(int index) {
            if (this.luckyInfoBuilder_ == null) {
               this.ensureLuckyInfoIsMutable();
               this.luckyInfo_.remove(index);
               this.onChanged();
            } else {
               this.luckyInfoBuilder_.remove(index);
            }

            return this;
         }

         public S2C_GetLuckyReward_7508.Builder getLuckyInfoBuilder(int index) {
            return (S2C_GetLuckyReward_7508.Builder)this.getLuckyInfoFieldBuilder().getBuilder(index);
         }

         public S2C_GetLuckyReward_7508OrBuilder getLuckyInfoOrBuilder(int index) {
            return this.luckyInfoBuilder_ == null ? (S2C_GetLuckyReward_7508OrBuilder)this.luckyInfo_.get(index) : (S2C_GetLuckyReward_7508OrBuilder)this.luckyInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends S2C_GetLuckyReward_7508OrBuilder> getLuckyInfoOrBuilderList() {
            return this.luckyInfoBuilder_ != null ? this.luckyInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.luckyInfo_);
         }

         public S2C_GetLuckyReward_7508.Builder addLuckyInfoBuilder() {
            return (S2C_GetLuckyReward_7508.Builder)this.getLuckyInfoFieldBuilder().addBuilder(PrayMsg.S2C_GetLuckyReward_7508.getDefaultInstance());
         }

         public S2C_GetLuckyReward_7508.Builder addLuckyInfoBuilder(int index) {
            return (S2C_GetLuckyReward_7508.Builder)this.getLuckyInfoFieldBuilder().addBuilder(index, PrayMsg.S2C_GetLuckyReward_7508.getDefaultInstance());
         }

         public List<S2C_GetLuckyReward_7508.Builder> getLuckyInfoBuilderList() {
            return this.getLuckyInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<S2C_GetLuckyReward_7508, S2C_GetLuckyReward_7508.Builder, S2C_GetLuckyReward_7508OrBuilder> getLuckyInfoFieldBuilder() {
            if (this.luckyInfoBuilder_ == null) {
               this.luckyInfoBuilder_ = new RepeatedFieldBuilderV3(this.luckyInfo_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.luckyInfo_ = null;
            }

            return this.luckyInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_Pray_7503 extends GeneratedMessageV3 implements C2S_Pray_7503OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PRAYID_FIELD_NUMBER = 1;
      private int prayId_;
      public static final int PRAYTIMESINDEX_FIELD_NUMBER = 2;
      private int prayTimesIndex_;
      private byte memoizedIsInitialized;
      private static final C2S_Pray_7503 DEFAULT_INSTANCE = new C2S_Pray_7503();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Pray_7503> PARSER = new AbstractParser<C2S_Pray_7503>() {
         public C2S_Pray_7503 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Pray_7503(input, extensionRegistry);
         }
      };

      private C2S_Pray_7503(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Pray_7503() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Pray_7503();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Pray_7503(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.prayId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.prayTimesIndex_ = input.readInt32();
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
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_Pray_7503_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_Pray_7503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Pray_7503.class, Builder.class);
      }

      public boolean hasPrayId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPrayId() {
         return this.prayId_;
      }

      public boolean hasPrayTimesIndex() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPrayTimesIndex() {
         return this.prayTimesIndex_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPrayId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPrayTimesIndex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.prayId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.prayTimesIndex_);
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
               size += CodedOutputStream.computeInt32Size(1, this.prayId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.prayTimesIndex_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Pray_7503)) {
            return super.equals(obj);
         } else {
            C2S_Pray_7503 other = (C2S_Pray_7503)obj;
            if (this.hasPrayId() != other.hasPrayId()) {
               return false;
            } else if (this.hasPrayId() && this.getPrayId() != other.getPrayId()) {
               return false;
            } else if (this.hasPrayTimesIndex() != other.hasPrayTimesIndex()) {
               return false;
            } else if (this.hasPrayTimesIndex() && this.getPrayTimesIndex() != other.getPrayTimesIndex()) {
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
            if (this.hasPrayId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPrayId();
            }

            if (this.hasPrayTimesIndex()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPrayTimesIndex();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Pray_7503 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Pray_7503)PARSER.parseFrom(data);
      }

      public static C2S_Pray_7503 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_7503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_7503 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Pray_7503)PARSER.parseFrom(data);
      }

      public static C2S_Pray_7503 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_7503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_7503 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Pray_7503)PARSER.parseFrom(data);
      }

      public static C2S_Pray_7503 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_7503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_7503 parseFrom(InputStream input) throws IOException {
         return (C2S_Pray_7503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Pray_7503 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_7503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Pray_7503 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Pray_7503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Pray_7503 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_7503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Pray_7503 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Pray_7503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Pray_7503 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_7503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Pray_7503 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Pray_7503 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Pray_7503> parser() {
         return PARSER;
      }

      public Parser<C2S_Pray_7503> getParserForType() {
         return PARSER;
      }

      public C2S_Pray_7503 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Pray_7503OrBuilder {
         private int bitField0_;
         private int prayId_;
         private int prayTimesIndex_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_Pray_7503_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_Pray_7503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Pray_7503.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrayMsg.C2S_Pray_7503.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.prayId_ = 0;
            this.bitField0_ &= -2;
            this.prayTimesIndex_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_Pray_7503_descriptor;
         }

         public C2S_Pray_7503 getDefaultInstanceForType() {
            return PrayMsg.C2S_Pray_7503.getDefaultInstance();
         }

         public C2S_Pray_7503 build() {
            C2S_Pray_7503 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Pray_7503 buildPartial() {
            C2S_Pray_7503 result = new C2S_Pray_7503(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.prayId_ = this.prayId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.prayTimesIndex_ = this.prayTimesIndex_;
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
            if (other instanceof C2S_Pray_7503) {
               return this.mergeFrom((C2S_Pray_7503)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Pray_7503 other) {
            if (other == PrayMsg.C2S_Pray_7503.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPrayId()) {
                  this.setPrayId(other.getPrayId());
               }

               if (other.hasPrayTimesIndex()) {
                  this.setPrayTimesIndex(other.getPrayTimesIndex());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPrayId()) {
               return false;
            } else {
               return this.hasPrayTimesIndex();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Pray_7503 parsedMessage = null;

            try {
               parsedMessage = (C2S_Pray_7503)PrayMsg.C2S_Pray_7503.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Pray_7503)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPrayId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPrayId() {
            return this.prayId_;
         }

         public Builder setPrayId(int value) {
            this.bitField0_ |= 1;
            this.prayId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrayId() {
            this.bitField0_ &= -2;
            this.prayId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPrayTimesIndex() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPrayTimesIndex() {
            return this.prayTimesIndex_;
         }

         public Builder setPrayTimesIndex(int value) {
            this.bitField0_ |= 2;
            this.prayTimesIndex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrayTimesIndex() {
            this.bitField0_ &= -3;
            this.prayTimesIndex_ = 0;
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

   public static final class S2C_Pray_7504 extends GeneratedMessageV3 implements S2C_Pray_7504OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POS_FIELD_NUMBER = 1;
      private Internal.IntList pos_;
      public static final int LUCKYPOINT_FIELD_NUMBER = 2;
      private int luckyPoint_;
      public static final int DATA_FIELD_NUMBER = 3;
      private List<Pray_RecordData> data_;
      private byte memoizedIsInitialized;
      private static final S2C_Pray_7504 DEFAULT_INSTANCE = new S2C_Pray_7504();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Pray_7504> PARSER = new AbstractParser<S2C_Pray_7504>() {
         public S2C_Pray_7504 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Pray_7504(input, extensionRegistry);
         }
      };

      private S2C_Pray_7504(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Pray_7504() {
         this.memoizedIsInitialized = -1;
         this.pos_ = emptyIntList();
         this.data_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Pray_7504();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Pray_7504(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.pos_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.pos_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.pos_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.luckyPoint_ = input.readInt32();
                        continue;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.data_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.data_.add(input.readMessage(PrayMsg.Pray_RecordData.PARSER, extensionRegistry));
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.pos_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.pos_.makeImmutable();
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.data_ = Collections.unmodifiableList(this.data_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_Pray_7504_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_Pray_7504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Pray_7504.class, Builder.class);
      }

      public List<Integer> getPosList() {
         return this.pos_;
      }

      public int getPosCount() {
         return this.pos_.size();
      }

      public int getPos(int index) {
         return this.pos_.getInt(index);
      }

      public boolean hasLuckyPoint() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLuckyPoint() {
         return this.luckyPoint_;
      }

      public List<Pray_RecordData> getDataList() {
         return this.data_;
      }

      public List<? extends Pray_RecordDataOrBuilder> getDataOrBuilderList() {
         return this.data_;
      }

      public int getDataCount() {
         return this.data_.size();
      }

      public Pray_RecordData getData(int index) {
         return (Pray_RecordData)this.data_.get(index);
      }

      public Pray_RecordDataOrBuilder getDataOrBuilder(int index) {
         return (Pray_RecordDataOrBuilder)this.data_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLuckyPoint()) {
            this.memoizedIsInitialized = 0;
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
         for(int i = 0; i < this.pos_.size(); ++i) {
            output.writeInt32(1, this.pos_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.luckyPoint_);
         }

         for(int i = 0; i < this.data_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.data_.get(i));
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

            for(int i = 0; i < this.pos_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.pos_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPosList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.luckyPoint_);
            }

            for(int i = 0; i < this.data_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.data_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Pray_7504)) {
            return super.equals(obj);
         } else {
            S2C_Pray_7504 other = (S2C_Pray_7504)obj;
            if (!this.getPosList().equals(other.getPosList())) {
               return false;
            } else if (this.hasLuckyPoint() != other.hasLuckyPoint()) {
               return false;
            } else if (this.hasLuckyPoint() && this.getLuckyPoint() != other.getLuckyPoint()) {
               return false;
            } else if (!this.getDataList().equals(other.getDataList())) {
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
            if (this.getPosCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPosList().hashCode();
            }

            if (this.hasLuckyPoint()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLuckyPoint();
            }

            if (this.getDataCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Pray_7504 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Pray_7504)PARSER.parseFrom(data);
      }

      public static S2C_Pray_7504 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_7504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_7504 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Pray_7504)PARSER.parseFrom(data);
      }

      public static S2C_Pray_7504 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_7504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_7504 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Pray_7504)PARSER.parseFrom(data);
      }

      public static S2C_Pray_7504 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_7504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_7504 parseFrom(InputStream input) throws IOException {
         return (S2C_Pray_7504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Pray_7504 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_7504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Pray_7504 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Pray_7504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Pray_7504 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_7504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Pray_7504 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Pray_7504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Pray_7504 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_7504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Pray_7504 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Pray_7504 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Pray_7504> parser() {
         return PARSER;
      }

      public Parser<S2C_Pray_7504> getParserForType() {
         return PARSER;
      }

      public S2C_Pray_7504 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Pray_7504OrBuilder {
         private int bitField0_;
         private Internal.IntList pos_;
         private int luckyPoint_;
         private List<Pray_RecordData> data_;
         private RepeatedFieldBuilderV3<Pray_RecordData, Pray_RecordData.Builder, Pray_RecordDataOrBuilder> dataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_Pray_7504_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_Pray_7504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Pray_7504.class, Builder.class);
         }

         private Builder() {
            this.pos_ = PrayMsg.S2C_Pray_7504.emptyIntList();
            this.data_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.pos_ = PrayMsg.S2C_Pray_7504.emptyIntList();
            this.data_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrayMsg.S2C_Pray_7504.alwaysUseFieldBuilders) {
               this.getDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.pos_ = PrayMsg.S2C_Pray_7504.emptyIntList();
            this.bitField0_ &= -2;
            this.luckyPoint_ = 0;
            this.bitField0_ &= -3;
            if (this.dataBuilder_ == null) {
               this.data_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.dataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_Pray_7504_descriptor;
         }

         public S2C_Pray_7504 getDefaultInstanceForType() {
            return PrayMsg.S2C_Pray_7504.getDefaultInstance();
         }

         public S2C_Pray_7504 build() {
            S2C_Pray_7504 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Pray_7504 buildPartial() {
            S2C_Pray_7504 result = new S2C_Pray_7504(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.pos_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.pos_ = this.pos_;
            if ((from_bitField0_ & 2) != 0) {
               result.luckyPoint_ = this.luckyPoint_;
               to_bitField0_ |= 1;
            }

            if (this.dataBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.data_ = Collections.unmodifiableList(this.data_);
                  this.bitField0_ &= -5;
               }

               result.data_ = this.data_;
            } else {
               result.data_ = this.dataBuilder_.build();
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
            if (other instanceof S2C_Pray_7504) {
               return this.mergeFrom((S2C_Pray_7504)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Pray_7504 other) {
            if (other == PrayMsg.S2C_Pray_7504.getDefaultInstance()) {
               return this;
            } else {
               if (!other.pos_.isEmpty()) {
                  if (this.pos_.isEmpty()) {
                     this.pos_ = other.pos_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensurePosIsMutable();
                     this.pos_.addAll(other.pos_);
                  }

                  this.onChanged();
               }

               if (other.hasLuckyPoint()) {
                  this.setLuckyPoint(other.getLuckyPoint());
               }

               if (this.dataBuilder_ == null) {
                  if (!other.data_.isEmpty()) {
                     if (this.data_.isEmpty()) {
                        this.data_ = other.data_;
                        this.bitField0_ &= -5;
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
                     this.bitField0_ &= -5;
                     this.dataBuilder_ = PrayMsg.S2C_Pray_7504.alwaysUseFieldBuilders ? this.getDataFieldBuilder() : null;
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
            if (!this.hasLuckyPoint()) {
               return false;
            } else {
               for(int i = 0; i < this.getDataCount(); ++i) {
                  if (!this.getData(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Pray_7504 parsedMessage = null;

            try {
               parsedMessage = (S2C_Pray_7504)PrayMsg.S2C_Pray_7504.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Pray_7504)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensurePosIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.pos_ = PrayMsg.S2C_Pray_7504.mutableCopy(this.pos_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getPosList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.pos_) : this.pos_);
         }

         public int getPosCount() {
            return this.pos_.size();
         }

         public int getPos(int index) {
            return this.pos_.getInt(index);
         }

         public Builder setPos(int index, int value) {
            this.ensurePosIsMutable();
            this.pos_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPos(int value) {
            this.ensurePosIsMutable();
            this.pos_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPos(Iterable<? extends Integer> values) {
            this.ensurePosIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.pos_);
            this.onChanged();
            return this;
         }

         public Builder clearPos() {
            this.pos_ = PrayMsg.S2C_Pray_7504.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public boolean hasLuckyPoint() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLuckyPoint() {
            return this.luckyPoint_;
         }

         public Builder setLuckyPoint(int value) {
            this.bitField0_ |= 2;
            this.luckyPoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLuckyPoint() {
            this.bitField0_ &= -3;
            this.luckyPoint_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureDataIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.data_ = new ArrayList(this.data_);
               this.bitField0_ |= 4;
            }

         }

         public List<Pray_RecordData> getDataList() {
            return this.dataBuilder_ == null ? Collections.unmodifiableList(this.data_) : this.dataBuilder_.getMessageList();
         }

         public int getDataCount() {
            return this.dataBuilder_ == null ? this.data_.size() : this.dataBuilder_.getCount();
         }

         public Pray_RecordData getData(int index) {
            return this.dataBuilder_ == null ? (Pray_RecordData)this.data_.get(index) : (Pray_RecordData)this.dataBuilder_.getMessage(index);
         }

         public Builder setData(int index, Pray_RecordData value) {
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

         public Builder setData(int index, Pray_RecordData.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addData(Pray_RecordData value) {
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

         public Builder addData(int index, Pray_RecordData value) {
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

         public Builder addData(Pray_RecordData.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.dataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addData(int index, Pray_RecordData.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllData(Iterable<? extends Pray_RecordData> values) {
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
               this.bitField0_ &= -5;
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

         public Pray_RecordData.Builder getDataBuilder(int index) {
            return (Pray_RecordData.Builder)this.getDataFieldBuilder().getBuilder(index);
         }

         public Pray_RecordDataOrBuilder getDataOrBuilder(int index) {
            return this.dataBuilder_ == null ? (Pray_RecordDataOrBuilder)this.data_.get(index) : (Pray_RecordDataOrBuilder)this.dataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends Pray_RecordDataOrBuilder> getDataOrBuilderList() {
            return this.dataBuilder_ != null ? this.dataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.data_);
         }

         public Pray_RecordData.Builder addDataBuilder() {
            return (Pray_RecordData.Builder)this.getDataFieldBuilder().addBuilder(PrayMsg.Pray_RecordData.getDefaultInstance());
         }

         public Pray_RecordData.Builder addDataBuilder(int index) {
            return (Pray_RecordData.Builder)this.getDataFieldBuilder().addBuilder(index, PrayMsg.Pray_RecordData.getDefaultInstance());
         }

         public List<Pray_RecordData.Builder> getDataBuilderList() {
            return this.getDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<Pray_RecordData, Pray_RecordData.Builder, Pray_RecordDataOrBuilder> getDataFieldBuilder() {
            if (this.dataBuilder_ == null) {
               this.dataBuilder_ = new RepeatedFieldBuilderV3(this.data_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class C2S_RefreshPrayReward_7505 extends GeneratedMessageV3 implements C2S_RefreshPrayReward_7505OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PRAYID_FIELD_NUMBER = 1;
      private int prayId_;
      private byte memoizedIsInitialized;
      private static final C2S_RefreshPrayReward_7505 DEFAULT_INSTANCE = new C2S_RefreshPrayReward_7505();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RefreshPrayReward_7505> PARSER = new AbstractParser<C2S_RefreshPrayReward_7505>() {
         public C2S_RefreshPrayReward_7505 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RefreshPrayReward_7505(input, extensionRegistry);
         }
      };

      private C2S_RefreshPrayReward_7505(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RefreshPrayReward_7505() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RefreshPrayReward_7505();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RefreshPrayReward_7505(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.prayId_ = input.readInt32();
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
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_RefreshPrayReward_7505_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_RefreshPrayReward_7505_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RefreshPrayReward_7505.class, Builder.class);
      }

      public boolean hasPrayId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPrayId() {
         return this.prayId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPrayId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.prayId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.prayId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RefreshPrayReward_7505)) {
            return super.equals(obj);
         } else {
            C2S_RefreshPrayReward_7505 other = (C2S_RefreshPrayReward_7505)obj;
            if (this.hasPrayId() != other.hasPrayId()) {
               return false;
            } else if (this.hasPrayId() && this.getPrayId() != other.getPrayId()) {
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
            if (this.hasPrayId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPrayId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RefreshPrayReward_7505 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RefreshPrayReward_7505)PARSER.parseFrom(data);
      }

      public static C2S_RefreshPrayReward_7505 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefreshPrayReward_7505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefreshPrayReward_7505 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RefreshPrayReward_7505)PARSER.parseFrom(data);
      }

      public static C2S_RefreshPrayReward_7505 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefreshPrayReward_7505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefreshPrayReward_7505 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RefreshPrayReward_7505)PARSER.parseFrom(data);
      }

      public static C2S_RefreshPrayReward_7505 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefreshPrayReward_7505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefreshPrayReward_7505 parseFrom(InputStream input) throws IOException {
         return (C2S_RefreshPrayReward_7505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RefreshPrayReward_7505 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefreshPrayReward_7505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RefreshPrayReward_7505 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RefreshPrayReward_7505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RefreshPrayReward_7505 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefreshPrayReward_7505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RefreshPrayReward_7505 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RefreshPrayReward_7505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RefreshPrayReward_7505 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefreshPrayReward_7505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RefreshPrayReward_7505 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RefreshPrayReward_7505 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RefreshPrayReward_7505> parser() {
         return PARSER;
      }

      public Parser<C2S_RefreshPrayReward_7505> getParserForType() {
         return PARSER;
      }

      public C2S_RefreshPrayReward_7505 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RefreshPrayReward_7505OrBuilder {
         private int bitField0_;
         private int prayId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_RefreshPrayReward_7505_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_RefreshPrayReward_7505_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RefreshPrayReward_7505.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrayMsg.C2S_RefreshPrayReward_7505.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.prayId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_RefreshPrayReward_7505_descriptor;
         }

         public C2S_RefreshPrayReward_7505 getDefaultInstanceForType() {
            return PrayMsg.C2S_RefreshPrayReward_7505.getDefaultInstance();
         }

         public C2S_RefreshPrayReward_7505 build() {
            C2S_RefreshPrayReward_7505 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RefreshPrayReward_7505 buildPartial() {
            C2S_RefreshPrayReward_7505 result = new C2S_RefreshPrayReward_7505(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.prayId_ = this.prayId_;
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
            if (other instanceof C2S_RefreshPrayReward_7505) {
               return this.mergeFrom((C2S_RefreshPrayReward_7505)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RefreshPrayReward_7505 other) {
            if (other == PrayMsg.C2S_RefreshPrayReward_7505.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPrayId()) {
                  this.setPrayId(other.getPrayId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPrayId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RefreshPrayReward_7505 parsedMessage = null;

            try {
               parsedMessage = (C2S_RefreshPrayReward_7505)PrayMsg.C2S_RefreshPrayReward_7505.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RefreshPrayReward_7505)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPrayId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPrayId() {
            return this.prayId_;
         }

         public Builder setPrayId(int value) {
            this.bitField0_ |= 1;
            this.prayId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrayId() {
            this.bitField0_ &= -2;
            this.prayId_ = 0;
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

   public static final class S2C_RefreshPrayReward_7506 extends GeneratedMessageV3 implements S2C_RefreshPrayReward_7506OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PRAYID_FIELD_NUMBER = 1;
      private int prayId_;
      public static final int GRID_FIELD_NUMBER = 2;
      private List<PrayGridInfo> grid_;
      public static final int REFRESHTIMES_FIELD_NUMBER = 3;
      private int refreshTimes_;
      private byte memoizedIsInitialized;
      private static final S2C_RefreshPrayReward_7506 DEFAULT_INSTANCE = new S2C_RefreshPrayReward_7506();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RefreshPrayReward_7506> PARSER = new AbstractParser<S2C_RefreshPrayReward_7506>() {
         public S2C_RefreshPrayReward_7506 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RefreshPrayReward_7506(input, extensionRegistry);
         }
      };

      private S2C_RefreshPrayReward_7506(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RefreshPrayReward_7506() {
         this.memoizedIsInitialized = -1;
         this.grid_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RefreshPrayReward_7506();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RefreshPrayReward_7506(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.prayId_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.grid_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.grid_.add(input.readMessage(PrayMsg.PrayGridInfo.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.refreshTimes_ = input.readInt32();
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
                  this.grid_ = Collections.unmodifiableList(this.grid_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_RefreshPrayReward_7506_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_RefreshPrayReward_7506_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RefreshPrayReward_7506.class, Builder.class);
      }

      public boolean hasPrayId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPrayId() {
         return this.prayId_;
      }

      public List<PrayGridInfo> getGridList() {
         return this.grid_;
      }

      public List<? extends PrayGridInfoOrBuilder> getGridOrBuilderList() {
         return this.grid_;
      }

      public int getGridCount() {
         return this.grid_.size();
      }

      public PrayGridInfo getGrid(int index) {
         return (PrayGridInfo)this.grid_.get(index);
      }

      public PrayGridInfoOrBuilder getGridOrBuilder(int index) {
         return (PrayGridInfoOrBuilder)this.grid_.get(index);
      }

      public boolean hasRefreshTimes() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRefreshTimes() {
         return this.refreshTimes_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPrayId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRefreshTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getGridCount(); ++i) {
               if (!this.getGrid(i).isInitialized()) {
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
            output.writeInt32(1, this.prayId_);
         }

         for(int i = 0; i < this.grid_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.grid_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.refreshTimes_);
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
               size += CodedOutputStream.computeInt32Size(1, this.prayId_);
            }

            for(int i = 0; i < this.grid_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.grid_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.refreshTimes_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RefreshPrayReward_7506)) {
            return super.equals(obj);
         } else {
            S2C_RefreshPrayReward_7506 other = (S2C_RefreshPrayReward_7506)obj;
            if (this.hasPrayId() != other.hasPrayId()) {
               return false;
            } else if (this.hasPrayId() && this.getPrayId() != other.getPrayId()) {
               return false;
            } else if (!this.getGridList().equals(other.getGridList())) {
               return false;
            } else if (this.hasRefreshTimes() != other.hasRefreshTimes()) {
               return false;
            } else if (this.hasRefreshTimes() && this.getRefreshTimes() != other.getRefreshTimes()) {
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
            if (this.hasPrayId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPrayId();
            }

            if (this.getGridCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGridList().hashCode();
            }

            if (this.hasRefreshTimes()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRefreshTimes();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RefreshPrayReward_7506 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RefreshPrayReward_7506)PARSER.parseFrom(data);
      }

      public static S2C_RefreshPrayReward_7506 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefreshPrayReward_7506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefreshPrayReward_7506 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RefreshPrayReward_7506)PARSER.parseFrom(data);
      }

      public static S2C_RefreshPrayReward_7506 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefreshPrayReward_7506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefreshPrayReward_7506 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RefreshPrayReward_7506)PARSER.parseFrom(data);
      }

      public static S2C_RefreshPrayReward_7506 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefreshPrayReward_7506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefreshPrayReward_7506 parseFrom(InputStream input) throws IOException {
         return (S2C_RefreshPrayReward_7506)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RefreshPrayReward_7506 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefreshPrayReward_7506)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RefreshPrayReward_7506 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RefreshPrayReward_7506)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RefreshPrayReward_7506 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefreshPrayReward_7506)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RefreshPrayReward_7506 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RefreshPrayReward_7506)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RefreshPrayReward_7506 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefreshPrayReward_7506)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RefreshPrayReward_7506 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RefreshPrayReward_7506 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RefreshPrayReward_7506> parser() {
         return PARSER;
      }

      public Parser<S2C_RefreshPrayReward_7506> getParserForType() {
         return PARSER;
      }

      public S2C_RefreshPrayReward_7506 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RefreshPrayReward_7506OrBuilder {
         private int bitField0_;
         private int prayId_;
         private List<PrayGridInfo> grid_;
         private RepeatedFieldBuilderV3<PrayGridInfo, PrayGridInfo.Builder, PrayGridInfoOrBuilder> gridBuilder_;
         private int refreshTimes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_RefreshPrayReward_7506_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_RefreshPrayReward_7506_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RefreshPrayReward_7506.class, Builder.class);
         }

         private Builder() {
            this.grid_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.grid_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrayMsg.S2C_RefreshPrayReward_7506.alwaysUseFieldBuilders) {
               this.getGridFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.prayId_ = 0;
            this.bitField0_ &= -2;
            if (this.gridBuilder_ == null) {
               this.grid_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.gridBuilder_.clear();
            }

            this.refreshTimes_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_RefreshPrayReward_7506_descriptor;
         }

         public S2C_RefreshPrayReward_7506 getDefaultInstanceForType() {
            return PrayMsg.S2C_RefreshPrayReward_7506.getDefaultInstance();
         }

         public S2C_RefreshPrayReward_7506 build() {
            S2C_RefreshPrayReward_7506 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RefreshPrayReward_7506 buildPartial() {
            S2C_RefreshPrayReward_7506 result = new S2C_RefreshPrayReward_7506(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.prayId_ = this.prayId_;
               to_bitField0_ |= 1;
            }

            if (this.gridBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.grid_ = Collections.unmodifiableList(this.grid_);
                  this.bitField0_ &= -3;
               }

               result.grid_ = this.grid_;
            } else {
               result.grid_ = this.gridBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.refreshTimes_ = this.refreshTimes_;
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
            if (other instanceof S2C_RefreshPrayReward_7506) {
               return this.mergeFrom((S2C_RefreshPrayReward_7506)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RefreshPrayReward_7506 other) {
            if (other == PrayMsg.S2C_RefreshPrayReward_7506.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPrayId()) {
                  this.setPrayId(other.getPrayId());
               }

               if (this.gridBuilder_ == null) {
                  if (!other.grid_.isEmpty()) {
                     if (this.grid_.isEmpty()) {
                        this.grid_ = other.grid_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureGridIsMutable();
                        this.grid_.addAll(other.grid_);
                     }

                     this.onChanged();
                  }
               } else if (!other.grid_.isEmpty()) {
                  if (this.gridBuilder_.isEmpty()) {
                     this.gridBuilder_.dispose();
                     this.gridBuilder_ = null;
                     this.grid_ = other.grid_;
                     this.bitField0_ &= -3;
                     this.gridBuilder_ = PrayMsg.S2C_RefreshPrayReward_7506.alwaysUseFieldBuilders ? this.getGridFieldBuilder() : null;
                  } else {
                     this.gridBuilder_.addAllMessages(other.grid_);
                  }
               }

               if (other.hasRefreshTimes()) {
                  this.setRefreshTimes(other.getRefreshTimes());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPrayId()) {
               return false;
            } else if (!this.hasRefreshTimes()) {
               return false;
            } else {
               for(int i = 0; i < this.getGridCount(); ++i) {
                  if (!this.getGrid(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RefreshPrayReward_7506 parsedMessage = null;

            try {
               parsedMessage = (S2C_RefreshPrayReward_7506)PrayMsg.S2C_RefreshPrayReward_7506.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RefreshPrayReward_7506)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPrayId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPrayId() {
            return this.prayId_;
         }

         public Builder setPrayId(int value) {
            this.bitField0_ |= 1;
            this.prayId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrayId() {
            this.bitField0_ &= -2;
            this.prayId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGridIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.grid_ = new ArrayList(this.grid_);
               this.bitField0_ |= 2;
            }

         }

         public List<PrayGridInfo> getGridList() {
            return this.gridBuilder_ == null ? Collections.unmodifiableList(this.grid_) : this.gridBuilder_.getMessageList();
         }

         public int getGridCount() {
            return this.gridBuilder_ == null ? this.grid_.size() : this.gridBuilder_.getCount();
         }

         public PrayGridInfo getGrid(int index) {
            return this.gridBuilder_ == null ? (PrayGridInfo)this.grid_.get(index) : (PrayGridInfo)this.gridBuilder_.getMessage(index);
         }

         public Builder setGrid(int index, PrayGridInfo value) {
            if (this.gridBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGridIsMutable();
               this.grid_.set(index, value);
               this.onChanged();
            } else {
               this.gridBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setGrid(int index, PrayGridInfo.Builder builderForValue) {
            if (this.gridBuilder_ == null) {
               this.ensureGridIsMutable();
               this.grid_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.gridBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addGrid(PrayGridInfo value) {
            if (this.gridBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGridIsMutable();
               this.grid_.add(value);
               this.onChanged();
            } else {
               this.gridBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addGrid(int index, PrayGridInfo value) {
            if (this.gridBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGridIsMutable();
               this.grid_.add(index, value);
               this.onChanged();
            } else {
               this.gridBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addGrid(PrayGridInfo.Builder builderForValue) {
            if (this.gridBuilder_ == null) {
               this.ensureGridIsMutable();
               this.grid_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.gridBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addGrid(int index, PrayGridInfo.Builder builderForValue) {
            if (this.gridBuilder_ == null) {
               this.ensureGridIsMutable();
               this.grid_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.gridBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllGrid(Iterable<? extends PrayGridInfo> values) {
            if (this.gridBuilder_ == null) {
               this.ensureGridIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.grid_);
               this.onChanged();
            } else {
               this.gridBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearGrid() {
            if (this.gridBuilder_ == null) {
               this.grid_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.gridBuilder_.clear();
            }

            return this;
         }

         public Builder removeGrid(int index) {
            if (this.gridBuilder_ == null) {
               this.ensureGridIsMutable();
               this.grid_.remove(index);
               this.onChanged();
            } else {
               this.gridBuilder_.remove(index);
            }

            return this;
         }

         public PrayGridInfo.Builder getGridBuilder(int index) {
            return (PrayGridInfo.Builder)this.getGridFieldBuilder().getBuilder(index);
         }

         public PrayGridInfoOrBuilder getGridOrBuilder(int index) {
            return this.gridBuilder_ == null ? (PrayGridInfoOrBuilder)this.grid_.get(index) : (PrayGridInfoOrBuilder)this.gridBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PrayGridInfoOrBuilder> getGridOrBuilderList() {
            return this.gridBuilder_ != null ? this.gridBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.grid_);
         }

         public PrayGridInfo.Builder addGridBuilder() {
            return (PrayGridInfo.Builder)this.getGridFieldBuilder().addBuilder(PrayMsg.PrayGridInfo.getDefaultInstance());
         }

         public PrayGridInfo.Builder addGridBuilder(int index) {
            return (PrayGridInfo.Builder)this.getGridFieldBuilder().addBuilder(index, PrayMsg.PrayGridInfo.getDefaultInstance());
         }

         public List<PrayGridInfo.Builder> getGridBuilderList() {
            return this.getGridFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PrayGridInfo, PrayGridInfo.Builder, PrayGridInfoOrBuilder> getGridFieldBuilder() {
            if (this.gridBuilder_ == null) {
               this.gridBuilder_ = new RepeatedFieldBuilderV3(this.grid_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.grid_ = null;
            }

            return this.gridBuilder_;
         }

         public boolean hasRefreshTimes() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getRefreshTimes() {
            return this.refreshTimes_;
         }

         public Builder setRefreshTimes(int value) {
            this.bitField0_ |= 4;
            this.refreshTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRefreshTimes() {
            this.bitField0_ &= -5;
            this.refreshTimes_ = 0;
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

   public static final class PrayGridInfo extends GeneratedMessageV3 implements PrayGridInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POS_FIELD_NUMBER = 1;
      private int pos_;
      public static final int REWARD_FIELD_NUMBER = 2;
      private CommonMsg.ItemInfo reward_;
      public static final int COUNT_FIELD_NUMBER = 3;
      private int count_;
      public static final int LIMIT_FIELD_NUMBER = 4;
      private int limit_;
      private byte memoizedIsInitialized;
      private static final PrayGridInfo DEFAULT_INSTANCE = new PrayGridInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<PrayGridInfo> PARSER = new AbstractParser<PrayGridInfo>() {
         public PrayGridInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new PrayGridInfo(input, extensionRegistry);
         }
      };

      private PrayGridInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private PrayGridInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new PrayGridInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private PrayGridInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.pos_ = input.readInt32();
                        break;
                     case 18:
                        CommonMsg.ItemInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.reward_.toBuilder();
                        }

                        this.reward_ = (CommonMsg.ItemInfo)input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.reward_);
                           this.reward_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.count_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.limit_ = input.readInt32();
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
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_PrayGridInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_PrayGridInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PrayGridInfo.class, Builder.class);
      }

      public boolean hasPos() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPos() {
         return this.pos_;
      }

      public boolean hasReward() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.ItemInfo getReward() {
         return this.reward_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.reward_;
      }

      public CommonMsg.ItemInfoOrBuilder getRewardOrBuilder() {
         return this.reward_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.reward_;
      }

      public boolean hasCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getCount() {
         return this.count_;
      }

      public boolean hasLimit() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getLimit() {
         return this.limit_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLimit()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getReward().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.pos_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getReward());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.count_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.limit_);
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
               size += CodedOutputStream.computeInt32Size(1, this.pos_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getReward());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.count_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.limit_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof PrayGridInfo)) {
            return super.equals(obj);
         } else {
            PrayGridInfo other = (PrayGridInfo)obj;
            if (this.hasPos() != other.hasPos()) {
               return false;
            } else if (this.hasPos() && this.getPos() != other.getPos()) {
               return false;
            } else if (this.hasReward() != other.hasReward()) {
               return false;
            } else if (this.hasReward() && !this.getReward().equals(other.getReward())) {
               return false;
            } else if (this.hasCount() != other.hasCount()) {
               return false;
            } else if (this.hasCount() && this.getCount() != other.getCount()) {
               return false;
            } else if (this.hasLimit() != other.hasLimit()) {
               return false;
            } else if (this.hasLimit() && this.getLimit() != other.getLimit()) {
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
            if (this.hasPos()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPos();
            }

            if (this.hasReward()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getReward().hashCode();
            }

            if (this.hasCount()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCount();
            }

            if (this.hasLimit()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getLimit();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static PrayGridInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (PrayGridInfo)PARSER.parseFrom(data);
      }

      public static PrayGridInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PrayGridInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PrayGridInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (PrayGridInfo)PARSER.parseFrom(data);
      }

      public static PrayGridInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PrayGridInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PrayGridInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (PrayGridInfo)PARSER.parseFrom(data);
      }

      public static PrayGridInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PrayGridInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PrayGridInfo parseFrom(InputStream input) throws IOException {
         return (PrayGridInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PrayGridInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PrayGridInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static PrayGridInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (PrayGridInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static PrayGridInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PrayGridInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static PrayGridInfo parseFrom(CodedInputStream input) throws IOException {
         return (PrayGridInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PrayGridInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PrayGridInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(PrayGridInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static PrayGridInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<PrayGridInfo> parser() {
         return PARSER;
      }

      public Parser<PrayGridInfo> getParserForType() {
         return PARSER;
      }

      public PrayGridInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PrayGridInfoOrBuilder {
         private int bitField0_;
         private int pos_;
         private CommonMsg.ItemInfo reward_;
         private SingleFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> rewardBuilder_;
         private int count_;
         private int limit_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_PrayGridInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_PrayGridInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PrayGridInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrayMsg.PrayGridInfo.alwaysUseFieldBuilders) {
               this.getRewardFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.pos_ = 0;
            this.bitField0_ &= -2;
            if (this.rewardBuilder_ == null) {
               this.reward_ = null;
            } else {
               this.rewardBuilder_.clear();
            }

            this.bitField0_ &= -3;
            this.count_ = 0;
            this.bitField0_ &= -5;
            this.limit_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_PrayGridInfo_descriptor;
         }

         public PrayGridInfo getDefaultInstanceForType() {
            return PrayMsg.PrayGridInfo.getDefaultInstance();
         }

         public PrayGridInfo build() {
            PrayGridInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public PrayGridInfo buildPartial() {
            PrayGridInfo result = new PrayGridInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.pos_ = this.pos_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.rewardBuilder_ == null) {
                  result.reward_ = this.reward_;
               } else {
                  result.reward_ = (CommonMsg.ItemInfo)this.rewardBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.count_ = this.count_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.limit_ = this.limit_;
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
            if (other instanceof PrayGridInfo) {
               return this.mergeFrom((PrayGridInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(PrayGridInfo other) {
            if (other == PrayMsg.PrayGridInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPos()) {
                  this.setPos(other.getPos());
               }

               if (other.hasReward()) {
                  this.mergeReward(other.getReward());
               }

               if (other.hasCount()) {
                  this.setCount(other.getCount());
               }

               if (other.hasLimit()) {
                  this.setLimit(other.getLimit());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPos()) {
               return false;
            } else if (!this.hasReward()) {
               return false;
            } else if (!this.hasCount()) {
               return false;
            } else if (!this.hasLimit()) {
               return false;
            } else {
               return this.getReward().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            PrayGridInfo parsedMessage = null;

            try {
               parsedMessage = (PrayGridInfo)PrayMsg.PrayGridInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (PrayGridInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPos() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPos() {
            return this.pos_;
         }

         public Builder setPos(int value) {
            this.bitField0_ |= 1;
            this.pos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPos() {
            this.bitField0_ &= -2;
            this.pos_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasReward() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.ItemInfo getReward() {
            if (this.rewardBuilder_ == null) {
               return this.reward_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.reward_;
            } else {
               return (CommonMsg.ItemInfo)this.rewardBuilder_.getMessage();
            }
         }

         public Builder setReward(CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.reward_ = value;
               this.onChanged();
            } else {
               this.rewardBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setReward(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.reward_ = builderForValue.build();
               this.onChanged();
            } else {
               this.rewardBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeReward(CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.reward_ != null && this.reward_ != CommonMsg.ItemInfo.getDefaultInstance()) {
                  this.reward_ = CommonMsg.ItemInfo.newBuilder(this.reward_).mergeFrom(value).buildPartial();
               } else {
                  this.reward_ = value;
               }

               this.onChanged();
            } else {
               this.rewardBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearReward() {
            if (this.rewardBuilder_ == null) {
               this.reward_ = null;
               this.onChanged();
            } else {
               this.rewardBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.ItemInfo.Builder getRewardBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.ItemInfo.Builder)this.getRewardFieldBuilder().getBuilder();
         }

         public CommonMsg.ItemInfoOrBuilder getRewardOrBuilder() {
            if (this.rewardBuilder_ != null) {
               return (CommonMsg.ItemInfoOrBuilder)this.rewardBuilder_.getMessageOrBuilder();
            } else {
               return this.reward_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.reward_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getRewardFieldBuilder() {
            if (this.rewardBuilder_ == null) {
               this.rewardBuilder_ = new SingleFieldBuilderV3(this.getReward(), this.getParentForChildren(), this.isClean());
               this.reward_ = null;
            }

            return this.rewardBuilder_;
         }

         public boolean hasCount() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getCount() {
            return this.count_;
         }

         public Builder setCount(int value) {
            this.bitField0_ |= 4;
            this.count_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCount() {
            this.bitField0_ &= -5;
            this.count_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLimit() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getLimit() {
            return this.limit_;
         }

         public Builder setLimit(int value) {
            this.bitField0_ |= 8;
            this.limit_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLimit() {
            this.bitField0_ &= -9;
            this.limit_ = 0;
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

   public static final class C2S_GetLuckyReward_7507 extends GeneratedMessageV3 implements C2S_GetLuckyReward_7507OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PRAYID_FIELD_NUMBER = 1;
      private int prayId_;
      public static final int REWARDID_FIELD_NUMBER = 2;
      private int rewardId_;
      private byte memoizedIsInitialized;
      private static final C2S_GetLuckyReward_7507 DEFAULT_INSTANCE = new C2S_GetLuckyReward_7507();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GetLuckyReward_7507> PARSER = new AbstractParser<C2S_GetLuckyReward_7507>() {
         public C2S_GetLuckyReward_7507 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GetLuckyReward_7507(input, extensionRegistry);
         }
      };

      private C2S_GetLuckyReward_7507(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GetLuckyReward_7507() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GetLuckyReward_7507();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GetLuckyReward_7507(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.prayId_ = input.readInt32();
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
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_GetLuckyReward_7507_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_GetLuckyReward_7507_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetLuckyReward_7507.class, Builder.class);
      }

      public boolean hasPrayId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPrayId() {
         return this.prayId_;
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
         } else if (!this.hasPrayId()) {
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
            output.writeInt32(1, this.prayId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.prayId_);
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
         } else if (!(obj instanceof C2S_GetLuckyReward_7507)) {
            return super.equals(obj);
         } else {
            C2S_GetLuckyReward_7507 other = (C2S_GetLuckyReward_7507)obj;
            if (this.hasPrayId() != other.hasPrayId()) {
               return false;
            } else if (this.hasPrayId() && this.getPrayId() != other.getPrayId()) {
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
            if (this.hasPrayId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPrayId();
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

      public static C2S_GetLuckyReward_7507 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GetLuckyReward_7507)PARSER.parseFrom(data);
      }

      public static C2S_GetLuckyReward_7507 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetLuckyReward_7507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetLuckyReward_7507 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GetLuckyReward_7507)PARSER.parseFrom(data);
      }

      public static C2S_GetLuckyReward_7507 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetLuckyReward_7507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetLuckyReward_7507 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GetLuckyReward_7507)PARSER.parseFrom(data);
      }

      public static C2S_GetLuckyReward_7507 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetLuckyReward_7507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetLuckyReward_7507 parseFrom(InputStream input) throws IOException {
         return (C2S_GetLuckyReward_7507)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetLuckyReward_7507 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetLuckyReward_7507)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetLuckyReward_7507 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GetLuckyReward_7507)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GetLuckyReward_7507 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetLuckyReward_7507)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetLuckyReward_7507 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GetLuckyReward_7507)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetLuckyReward_7507 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetLuckyReward_7507)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GetLuckyReward_7507 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GetLuckyReward_7507 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GetLuckyReward_7507> parser() {
         return PARSER;
      }

      public Parser<C2S_GetLuckyReward_7507> getParserForType() {
         return PARSER;
      }

      public C2S_GetLuckyReward_7507 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GetLuckyReward_7507OrBuilder {
         private int bitField0_;
         private int prayId_;
         private int rewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_GetLuckyReward_7507_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_GetLuckyReward_7507_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetLuckyReward_7507.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrayMsg.C2S_GetLuckyReward_7507.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.prayId_ = 0;
            this.bitField0_ &= -2;
            this.rewardId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_GetLuckyReward_7507_descriptor;
         }

         public C2S_GetLuckyReward_7507 getDefaultInstanceForType() {
            return PrayMsg.C2S_GetLuckyReward_7507.getDefaultInstance();
         }

         public C2S_GetLuckyReward_7507 build() {
            C2S_GetLuckyReward_7507 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GetLuckyReward_7507 buildPartial() {
            C2S_GetLuckyReward_7507 result = new C2S_GetLuckyReward_7507(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.prayId_ = this.prayId_;
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
            if (other instanceof C2S_GetLuckyReward_7507) {
               return this.mergeFrom((C2S_GetLuckyReward_7507)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GetLuckyReward_7507 other) {
            if (other == PrayMsg.C2S_GetLuckyReward_7507.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPrayId()) {
                  this.setPrayId(other.getPrayId());
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
            if (!this.hasPrayId()) {
               return false;
            } else {
               return this.hasRewardId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_GetLuckyReward_7507 parsedMessage = null;

            try {
               parsedMessage = (C2S_GetLuckyReward_7507)PrayMsg.C2S_GetLuckyReward_7507.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GetLuckyReward_7507)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPrayId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPrayId() {
            return this.prayId_;
         }

         public Builder setPrayId(int value) {
            this.bitField0_ |= 1;
            this.prayId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrayId() {
            this.bitField0_ &= -2;
            this.prayId_ = 0;
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

   public static final class S2C_GetLuckyReward_7508 extends GeneratedMessageV3 implements S2C_GetLuckyReward_7508OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PRAYID_FIELD_NUMBER = 1;
      private int prayId_;
      public static final int REWARDID_FIELD_NUMBER = 2;
      private Internal.IntList rewardId_;
      public static final int LUCKYPOINT_FIELD_NUMBER = 3;
      private int luckyPoint_;
      private byte memoizedIsInitialized;
      private static final S2C_GetLuckyReward_7508 DEFAULT_INSTANCE = new S2C_GetLuckyReward_7508();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GetLuckyReward_7508> PARSER = new AbstractParser<S2C_GetLuckyReward_7508>() {
         public S2C_GetLuckyReward_7508 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GetLuckyReward_7508(input, extensionRegistry);
         }
      };

      private S2C_GetLuckyReward_7508(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GetLuckyReward_7508() {
         this.memoizedIsInitialized = -1;
         this.rewardId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GetLuckyReward_7508();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GetLuckyReward_7508(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.prayId_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.rewardId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.rewardId_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.rewardId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.luckyPoint_ = input.readInt32();
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
               if ((mutable_bitField0_ & 2) != 0) {
                  this.rewardId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_GetLuckyReward_7508_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_GetLuckyReward_7508_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetLuckyReward_7508.class, Builder.class);
      }

      public boolean hasPrayId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPrayId() {
         return this.prayId_;
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

      public boolean hasLuckyPoint() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLuckyPoint() {
         return this.luckyPoint_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPrayId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLuckyPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.prayId_);
         }

         for(int i = 0; i < this.rewardId_.size(); ++i) {
            output.writeInt32(2, this.rewardId_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.luckyPoint_);
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
               size += CodedOutputStream.computeInt32Size(1, this.prayId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.rewardId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.rewardId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRewardIdList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.luckyPoint_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GetLuckyReward_7508)) {
            return super.equals(obj);
         } else {
            S2C_GetLuckyReward_7508 other = (S2C_GetLuckyReward_7508)obj;
            if (this.hasPrayId() != other.hasPrayId()) {
               return false;
            } else if (this.hasPrayId() && this.getPrayId() != other.getPrayId()) {
               return false;
            } else if (!this.getRewardIdList().equals(other.getRewardIdList())) {
               return false;
            } else if (this.hasLuckyPoint() != other.hasLuckyPoint()) {
               return false;
            } else if (this.hasLuckyPoint() && this.getLuckyPoint() != other.getLuckyPoint()) {
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
            if (this.hasPrayId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPrayId();
            }

            if (this.getRewardIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRewardIdList().hashCode();
            }

            if (this.hasLuckyPoint()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLuckyPoint();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GetLuckyReward_7508 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GetLuckyReward_7508)PARSER.parseFrom(data);
      }

      public static S2C_GetLuckyReward_7508 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetLuckyReward_7508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetLuckyReward_7508 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GetLuckyReward_7508)PARSER.parseFrom(data);
      }

      public static S2C_GetLuckyReward_7508 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetLuckyReward_7508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetLuckyReward_7508 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GetLuckyReward_7508)PARSER.parseFrom(data);
      }

      public static S2C_GetLuckyReward_7508 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetLuckyReward_7508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetLuckyReward_7508 parseFrom(InputStream input) throws IOException {
         return (S2C_GetLuckyReward_7508)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetLuckyReward_7508 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetLuckyReward_7508)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetLuckyReward_7508 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GetLuckyReward_7508)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GetLuckyReward_7508 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetLuckyReward_7508)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetLuckyReward_7508 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GetLuckyReward_7508)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetLuckyReward_7508 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetLuckyReward_7508)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GetLuckyReward_7508 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GetLuckyReward_7508 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GetLuckyReward_7508> parser() {
         return PARSER;
      }

      public Parser<S2C_GetLuckyReward_7508> getParserForType() {
         return PARSER;
      }

      public S2C_GetLuckyReward_7508 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GetLuckyReward_7508OrBuilder {
         private int bitField0_;
         private int prayId_;
         private Internal.IntList rewardId_;
         private int luckyPoint_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_GetLuckyReward_7508_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_GetLuckyReward_7508_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetLuckyReward_7508.class, Builder.class);
         }

         private Builder() {
            this.rewardId_ = PrayMsg.S2C_GetLuckyReward_7508.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardId_ = PrayMsg.S2C_GetLuckyReward_7508.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrayMsg.S2C_GetLuckyReward_7508.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.prayId_ = 0;
            this.bitField0_ &= -2;
            this.rewardId_ = PrayMsg.S2C_GetLuckyReward_7508.emptyIntList();
            this.bitField0_ &= -3;
            this.luckyPoint_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_GetLuckyReward_7508_descriptor;
         }

         public S2C_GetLuckyReward_7508 getDefaultInstanceForType() {
            return PrayMsg.S2C_GetLuckyReward_7508.getDefaultInstance();
         }

         public S2C_GetLuckyReward_7508 build() {
            S2C_GetLuckyReward_7508 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GetLuckyReward_7508 buildPartial() {
            S2C_GetLuckyReward_7508 result = new S2C_GetLuckyReward_7508(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.prayId_ = this.prayId_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.rewardId_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.rewardId_ = this.rewardId_;
            if ((from_bitField0_ & 4) != 0) {
               result.luckyPoint_ = this.luckyPoint_;
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
            if (other instanceof S2C_GetLuckyReward_7508) {
               return this.mergeFrom((S2C_GetLuckyReward_7508)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GetLuckyReward_7508 other) {
            if (other == PrayMsg.S2C_GetLuckyReward_7508.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPrayId()) {
                  this.setPrayId(other.getPrayId());
               }

               if (!other.rewardId_.isEmpty()) {
                  if (this.rewardId_.isEmpty()) {
                     this.rewardId_ = other.rewardId_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureRewardIdIsMutable();
                     this.rewardId_.addAll(other.rewardId_);
                  }

                  this.onChanged();
               }

               if (other.hasLuckyPoint()) {
                  this.setLuckyPoint(other.getLuckyPoint());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPrayId()) {
               return false;
            } else {
               return this.hasLuckyPoint();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GetLuckyReward_7508 parsedMessage = null;

            try {
               parsedMessage = (S2C_GetLuckyReward_7508)PrayMsg.S2C_GetLuckyReward_7508.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GetLuckyReward_7508)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPrayId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPrayId() {
            return this.prayId_;
         }

         public Builder setPrayId(int value) {
            this.bitField0_ |= 1;
            this.prayId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrayId() {
            this.bitField0_ &= -2;
            this.prayId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRewardIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.rewardId_ = PrayMsg.S2C_GetLuckyReward_7508.mutableCopy(this.rewardId_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getRewardIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.rewardId_) : this.rewardId_);
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
            this.rewardId_ = PrayMsg.S2C_GetLuckyReward_7508.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasLuckyPoint() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLuckyPoint() {
            return this.luckyPoint_;
         }

         public Builder setLuckyPoint(int value) {
            this.bitField0_ |= 4;
            this.luckyPoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLuckyPoint() {
            this.bitField0_ &= -5;
            this.luckyPoint_ = 0;
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

   public static final class C2S_PlayerAwardInfo_7509 extends GeneratedMessageV3 implements C2S_PlayerAwardInfo_7509OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PRAYID_FIELD_NUMBER = 1;
      private int prayId_;
      private byte memoizedIsInitialized;
      private static final C2S_PlayerAwardInfo_7509 DEFAULT_INSTANCE = new C2S_PlayerAwardInfo_7509();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PlayerAwardInfo_7509> PARSER = new AbstractParser<C2S_PlayerAwardInfo_7509>() {
         public C2S_PlayerAwardInfo_7509 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PlayerAwardInfo_7509(input, extensionRegistry);
         }
      };

      private C2S_PlayerAwardInfo_7509(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PlayerAwardInfo_7509() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PlayerAwardInfo_7509();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PlayerAwardInfo_7509(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.prayId_ = input.readInt32();
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
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_PlayerAwardInfo_7509_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_PlayerAwardInfo_7509_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PlayerAwardInfo_7509.class, Builder.class);
      }

      public boolean hasPrayId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPrayId() {
         return this.prayId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPrayId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.prayId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.prayId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PlayerAwardInfo_7509)) {
            return super.equals(obj);
         } else {
            C2S_PlayerAwardInfo_7509 other = (C2S_PlayerAwardInfo_7509)obj;
            if (this.hasPrayId() != other.hasPrayId()) {
               return false;
            } else if (this.hasPrayId() && this.getPrayId() != other.getPrayId()) {
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
            if (this.hasPrayId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPrayId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PlayerAwardInfo_7509 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PlayerAwardInfo_7509)PARSER.parseFrom(data);
      }

      public static C2S_PlayerAwardInfo_7509 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PlayerAwardInfo_7509)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PlayerAwardInfo_7509 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PlayerAwardInfo_7509)PARSER.parseFrom(data);
      }

      public static C2S_PlayerAwardInfo_7509 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PlayerAwardInfo_7509)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PlayerAwardInfo_7509 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PlayerAwardInfo_7509)PARSER.parseFrom(data);
      }

      public static C2S_PlayerAwardInfo_7509 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PlayerAwardInfo_7509)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PlayerAwardInfo_7509 parseFrom(InputStream input) throws IOException {
         return (C2S_PlayerAwardInfo_7509)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PlayerAwardInfo_7509 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PlayerAwardInfo_7509)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PlayerAwardInfo_7509 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PlayerAwardInfo_7509)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PlayerAwardInfo_7509 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PlayerAwardInfo_7509)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PlayerAwardInfo_7509 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PlayerAwardInfo_7509)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PlayerAwardInfo_7509 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PlayerAwardInfo_7509)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PlayerAwardInfo_7509 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PlayerAwardInfo_7509 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PlayerAwardInfo_7509> parser() {
         return PARSER;
      }

      public Parser<C2S_PlayerAwardInfo_7509> getParserForType() {
         return PARSER;
      }

      public C2S_PlayerAwardInfo_7509 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PlayerAwardInfo_7509OrBuilder {
         private int bitField0_;
         private int prayId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_PlayerAwardInfo_7509_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_PlayerAwardInfo_7509_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PlayerAwardInfo_7509.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PrayMsg.C2S_PlayerAwardInfo_7509.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.prayId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_C2S_PlayerAwardInfo_7509_descriptor;
         }

         public C2S_PlayerAwardInfo_7509 getDefaultInstanceForType() {
            return PrayMsg.C2S_PlayerAwardInfo_7509.getDefaultInstance();
         }

         public C2S_PlayerAwardInfo_7509 build() {
            C2S_PlayerAwardInfo_7509 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PlayerAwardInfo_7509 buildPartial() {
            C2S_PlayerAwardInfo_7509 result = new C2S_PlayerAwardInfo_7509(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.prayId_ = this.prayId_;
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
            if (other instanceof C2S_PlayerAwardInfo_7509) {
               return this.mergeFrom((C2S_PlayerAwardInfo_7509)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PlayerAwardInfo_7509 other) {
            if (other == PrayMsg.C2S_PlayerAwardInfo_7509.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPrayId()) {
                  this.setPrayId(other.getPrayId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPrayId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_PlayerAwardInfo_7509 parsedMessage = null;

            try {
               parsedMessage = (C2S_PlayerAwardInfo_7509)PrayMsg.C2S_PlayerAwardInfo_7509.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PlayerAwardInfo_7509)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPrayId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPrayId() {
            return this.prayId_;
         }

         public Builder setPrayId(int value) {
            this.bitField0_ |= 1;
            this.prayId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrayId() {
            this.bitField0_ &= -2;
            this.prayId_ = 0;
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

   public static final class S2C_PlayerAwardInfo_7510 extends GeneratedMessageV3 implements S2C_PlayerAwardInfo_7510OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PRAYID_FIELD_NUMBER = 1;
      private int prayId_;
      public static final int DATA_FIELD_NUMBER = 2;
      private List<Pray_RecordData> data_;
      private byte memoizedIsInitialized;
      private static final S2C_PlayerAwardInfo_7510 DEFAULT_INSTANCE = new S2C_PlayerAwardInfo_7510();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PlayerAwardInfo_7510> PARSER = new AbstractParser<S2C_PlayerAwardInfo_7510>() {
         public S2C_PlayerAwardInfo_7510 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PlayerAwardInfo_7510(input, extensionRegistry);
         }
      };

      private S2C_PlayerAwardInfo_7510(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PlayerAwardInfo_7510() {
         this.memoizedIsInitialized = -1;
         this.data_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PlayerAwardInfo_7510();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PlayerAwardInfo_7510(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.prayId_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.data_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.data_.add(input.readMessage(PrayMsg.Pray_RecordData.PARSER, extensionRegistry));
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
                  this.data_ = Collections.unmodifiableList(this.data_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_PlayerAwardInfo_7510_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_PlayerAwardInfo_7510_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PlayerAwardInfo_7510.class, Builder.class);
      }

      public boolean hasPrayId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPrayId() {
         return this.prayId_;
      }

      public List<Pray_RecordData> getDataList() {
         return this.data_;
      }

      public List<? extends Pray_RecordDataOrBuilder> getDataOrBuilderList() {
         return this.data_;
      }

      public int getDataCount() {
         return this.data_.size();
      }

      public Pray_RecordData getData(int index) {
         return (Pray_RecordData)this.data_.get(index);
      }

      public Pray_RecordDataOrBuilder getDataOrBuilder(int index) {
         return (Pray_RecordDataOrBuilder)this.data_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPrayId()) {
            this.memoizedIsInitialized = 0;
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
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.prayId_);
         }

         for(int i = 0; i < this.data_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.data_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.prayId_);
            }

            for(int i = 0; i < this.data_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.data_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PlayerAwardInfo_7510)) {
            return super.equals(obj);
         } else {
            S2C_PlayerAwardInfo_7510 other = (S2C_PlayerAwardInfo_7510)obj;
            if (this.hasPrayId() != other.hasPrayId()) {
               return false;
            } else if (this.hasPrayId() && this.getPrayId() != other.getPrayId()) {
               return false;
            } else if (!this.getDataList().equals(other.getDataList())) {
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
            if (this.hasPrayId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPrayId();
            }

            if (this.getDataCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PlayerAwardInfo_7510 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PlayerAwardInfo_7510)PARSER.parseFrom(data);
      }

      public static S2C_PlayerAwardInfo_7510 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PlayerAwardInfo_7510)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PlayerAwardInfo_7510 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PlayerAwardInfo_7510)PARSER.parseFrom(data);
      }

      public static S2C_PlayerAwardInfo_7510 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PlayerAwardInfo_7510)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PlayerAwardInfo_7510 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PlayerAwardInfo_7510)PARSER.parseFrom(data);
      }

      public static S2C_PlayerAwardInfo_7510 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PlayerAwardInfo_7510)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PlayerAwardInfo_7510 parseFrom(InputStream input) throws IOException {
         return (S2C_PlayerAwardInfo_7510)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PlayerAwardInfo_7510 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PlayerAwardInfo_7510)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PlayerAwardInfo_7510 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PlayerAwardInfo_7510)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PlayerAwardInfo_7510 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PlayerAwardInfo_7510)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PlayerAwardInfo_7510 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PlayerAwardInfo_7510)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PlayerAwardInfo_7510 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PlayerAwardInfo_7510)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PlayerAwardInfo_7510 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PlayerAwardInfo_7510 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PlayerAwardInfo_7510> parser() {
         return PARSER;
      }

      public Parser<S2C_PlayerAwardInfo_7510> getParserForType() {
         return PARSER;
      }

      public S2C_PlayerAwardInfo_7510 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PlayerAwardInfo_7510OrBuilder {
         private int bitField0_;
         private int prayId_;
         private List<Pray_RecordData> data_;
         private RepeatedFieldBuilderV3<Pray_RecordData, Pray_RecordData.Builder, Pray_RecordDataOrBuilder> dataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_PlayerAwardInfo_7510_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_PlayerAwardInfo_7510_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PlayerAwardInfo_7510.class, Builder.class);
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
            if (PrayMsg.S2C_PlayerAwardInfo_7510.alwaysUseFieldBuilders) {
               this.getDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.prayId_ = 0;
            this.bitField0_ &= -2;
            if (this.dataBuilder_ == null) {
               this.data_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.dataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_S2C_PlayerAwardInfo_7510_descriptor;
         }

         public S2C_PlayerAwardInfo_7510 getDefaultInstanceForType() {
            return PrayMsg.S2C_PlayerAwardInfo_7510.getDefaultInstance();
         }

         public S2C_PlayerAwardInfo_7510 build() {
            S2C_PlayerAwardInfo_7510 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PlayerAwardInfo_7510 buildPartial() {
            S2C_PlayerAwardInfo_7510 result = new S2C_PlayerAwardInfo_7510(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.prayId_ = this.prayId_;
               to_bitField0_ |= 1;
            }

            if (this.dataBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.data_ = Collections.unmodifiableList(this.data_);
                  this.bitField0_ &= -3;
               }

               result.data_ = this.data_;
            } else {
               result.data_ = this.dataBuilder_.build();
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
            if (other instanceof S2C_PlayerAwardInfo_7510) {
               return this.mergeFrom((S2C_PlayerAwardInfo_7510)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PlayerAwardInfo_7510 other) {
            if (other == PrayMsg.S2C_PlayerAwardInfo_7510.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPrayId()) {
                  this.setPrayId(other.getPrayId());
               }

               if (this.dataBuilder_ == null) {
                  if (!other.data_.isEmpty()) {
                     if (this.data_.isEmpty()) {
                        this.data_ = other.data_;
                        this.bitField0_ &= -3;
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
                     this.bitField0_ &= -3;
                     this.dataBuilder_ = PrayMsg.S2C_PlayerAwardInfo_7510.alwaysUseFieldBuilders ? this.getDataFieldBuilder() : null;
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
            if (!this.hasPrayId()) {
               return false;
            } else {
               for(int i = 0; i < this.getDataCount(); ++i) {
                  if (!this.getData(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PlayerAwardInfo_7510 parsedMessage = null;

            try {
               parsedMessage = (S2C_PlayerAwardInfo_7510)PrayMsg.S2C_PlayerAwardInfo_7510.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PlayerAwardInfo_7510)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPrayId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPrayId() {
            return this.prayId_;
         }

         public Builder setPrayId(int value) {
            this.bitField0_ |= 1;
            this.prayId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrayId() {
            this.bitField0_ &= -2;
            this.prayId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureDataIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.data_ = new ArrayList(this.data_);
               this.bitField0_ |= 2;
            }

         }

         public List<Pray_RecordData> getDataList() {
            return this.dataBuilder_ == null ? Collections.unmodifiableList(this.data_) : this.dataBuilder_.getMessageList();
         }

         public int getDataCount() {
            return this.dataBuilder_ == null ? this.data_.size() : this.dataBuilder_.getCount();
         }

         public Pray_RecordData getData(int index) {
            return this.dataBuilder_ == null ? (Pray_RecordData)this.data_.get(index) : (Pray_RecordData)this.dataBuilder_.getMessage(index);
         }

         public Builder setData(int index, Pray_RecordData value) {
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

         public Builder setData(int index, Pray_RecordData.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addData(Pray_RecordData value) {
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

         public Builder addData(int index, Pray_RecordData value) {
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

         public Builder addData(Pray_RecordData.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.dataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addData(int index, Pray_RecordData.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllData(Iterable<? extends Pray_RecordData> values) {
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
               this.bitField0_ &= -3;
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

         public Pray_RecordData.Builder getDataBuilder(int index) {
            return (Pray_RecordData.Builder)this.getDataFieldBuilder().getBuilder(index);
         }

         public Pray_RecordDataOrBuilder getDataOrBuilder(int index) {
            return this.dataBuilder_ == null ? (Pray_RecordDataOrBuilder)this.data_.get(index) : (Pray_RecordDataOrBuilder)this.dataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends Pray_RecordDataOrBuilder> getDataOrBuilderList() {
            return this.dataBuilder_ != null ? this.dataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.data_);
         }

         public Pray_RecordData.Builder addDataBuilder() {
            return (Pray_RecordData.Builder)this.getDataFieldBuilder().addBuilder(PrayMsg.Pray_RecordData.getDefaultInstance());
         }

         public Pray_RecordData.Builder addDataBuilder(int index) {
            return (Pray_RecordData.Builder)this.getDataFieldBuilder().addBuilder(index, PrayMsg.Pray_RecordData.getDefaultInstance());
         }

         public List<Pray_RecordData.Builder> getDataBuilderList() {
            return this.getDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<Pray_RecordData, Pray_RecordData.Builder, Pray_RecordDataOrBuilder> getDataFieldBuilder() {
            if (this.dataBuilder_ == null) {
               this.dataBuilder_ = new RepeatedFieldBuilderV3(this.data_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class Pray_RecordData extends GeneratedMessageV3 implements Pray_RecordDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERNAME_FIELD_NUMBER = 1;
      private volatile Object playerName_;
      public static final int REWARD_FIELD_NUMBER = 2;
      private CommonMsg.ItemInfo reward_;
      private byte memoizedIsInitialized;
      private static final Pray_RecordData DEFAULT_INSTANCE = new Pray_RecordData();
      /** @deprecated */
      @Deprecated
      public static final Parser<Pray_RecordData> PARSER = new AbstractParser<Pray_RecordData>() {
         public Pray_RecordData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new Pray_RecordData(input, extensionRegistry);
         }
      };

      private Pray_RecordData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private Pray_RecordData() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new Pray_RecordData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private Pray_RecordData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 1;
                        this.playerName_ = bs;
                        break;
                     case 18:
                        CommonMsg.ItemInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.reward_.toBuilder();
                        }

                        this.reward_ = (CommonMsg.ItemInfo)input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.reward_);
                           this.reward_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
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
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_Pray_RecordData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PrayMsg.internal_static_pray_com_gzbz_protobuf_Pray_RecordData_fieldAccessorTable.ensureFieldAccessorsInitialized(Pray_RecordData.class, Builder.class);
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 1) != 0;
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

      public boolean hasReward() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.ItemInfo getReward() {
         return this.reward_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.reward_;
      }

      public CommonMsg.ItemInfoOrBuilder getRewardOrBuilder() {
         return this.reward_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.reward_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getReward().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.playerName_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getReward());
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
               size += GeneratedMessageV3.computeStringSize(1, this.playerName_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getReward());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof Pray_RecordData)) {
            return super.equals(obj);
         } else {
            Pray_RecordData other = (Pray_RecordData)obj;
            if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasReward() != other.hasReward()) {
               return false;
            } else if (this.hasReward() && !this.getReward().equals(other.getReward())) {
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
            if (this.hasPlayerName()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasReward()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getReward().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static Pray_RecordData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (Pray_RecordData)PARSER.parseFrom(data);
      }

      public static Pray_RecordData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Pray_RecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Pray_RecordData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (Pray_RecordData)PARSER.parseFrom(data);
      }

      public static Pray_RecordData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Pray_RecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Pray_RecordData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (Pray_RecordData)PARSER.parseFrom(data);
      }

      public static Pray_RecordData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Pray_RecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Pray_RecordData parseFrom(InputStream input) throws IOException {
         return (Pray_RecordData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static Pray_RecordData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Pray_RecordData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static Pray_RecordData parseDelimitedFrom(InputStream input) throws IOException {
         return (Pray_RecordData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static Pray_RecordData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Pray_RecordData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static Pray_RecordData parseFrom(CodedInputStream input) throws IOException {
         return (Pray_RecordData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static Pray_RecordData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Pray_RecordData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(Pray_RecordData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static Pray_RecordData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<Pray_RecordData> parser() {
         return PARSER;
      }

      public Parser<Pray_RecordData> getParserForType() {
         return PARSER;
      }

      public Pray_RecordData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Pray_RecordDataOrBuilder {
         private int bitField0_;
         private Object playerName_;
         private CommonMsg.ItemInfo reward_;
         private SingleFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> rewardBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_Pray_RecordData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_Pray_RecordData_fieldAccessorTable.ensureFieldAccessorsInitialized(Pray_RecordData.class, Builder.class);
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
            if (PrayMsg.Pray_RecordData.alwaysUseFieldBuilders) {
               this.getRewardFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.playerName_ = "";
            this.bitField0_ &= -2;
            if (this.rewardBuilder_ == null) {
               this.reward_ = null;
            } else {
               this.rewardBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return PrayMsg.internal_static_pray_com_gzbz_protobuf_Pray_RecordData_descriptor;
         }

         public Pray_RecordData getDefaultInstanceForType() {
            return PrayMsg.Pray_RecordData.getDefaultInstance();
         }

         public Pray_RecordData build() {
            Pray_RecordData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public Pray_RecordData buildPartial() {
            Pray_RecordData result = new Pray_RecordData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 2) != 0) {
               if (this.rewardBuilder_ == null) {
                  result.reward_ = this.reward_;
               } else {
                  result.reward_ = (CommonMsg.ItemInfo)this.rewardBuilder_.build();
               }

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
            if (other instanceof Pray_RecordData) {
               return this.mergeFrom((Pray_RecordData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(Pray_RecordData other) {
            if (other == PrayMsg.Pray_RecordData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerName()) {
                  this.bitField0_ |= 1;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasReward()) {
                  this.mergeReward(other.getReward());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasReward()) {
               return false;
            } else {
               return this.getReward().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            Pray_RecordData parsedMessage = null;

            try {
               parsedMessage = (Pray_RecordData)PrayMsg.Pray_RecordData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (Pray_RecordData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 1) != 0;
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
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -2;
            this.playerName_ = PrayMsg.Pray_RecordData.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasReward() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.ItemInfo getReward() {
            if (this.rewardBuilder_ == null) {
               return this.reward_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.reward_;
            } else {
               return (CommonMsg.ItemInfo)this.rewardBuilder_.getMessage();
            }
         }

         public Builder setReward(CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.reward_ = value;
               this.onChanged();
            } else {
               this.rewardBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setReward(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.reward_ = builderForValue.build();
               this.onChanged();
            } else {
               this.rewardBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeReward(CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.reward_ != null && this.reward_ != CommonMsg.ItemInfo.getDefaultInstance()) {
                  this.reward_ = CommonMsg.ItemInfo.newBuilder(this.reward_).mergeFrom(value).buildPartial();
               } else {
                  this.reward_ = value;
               }

               this.onChanged();
            } else {
               this.rewardBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearReward() {
            if (this.rewardBuilder_ == null) {
               this.reward_ = null;
               this.onChanged();
            } else {
               this.rewardBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.ItemInfo.Builder getRewardBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.ItemInfo.Builder)this.getRewardFieldBuilder().getBuilder();
         }

         public CommonMsg.ItemInfoOrBuilder getRewardOrBuilder() {
            if (this.rewardBuilder_ != null) {
               return (CommonMsg.ItemInfoOrBuilder)this.rewardBuilder_.getMessageOrBuilder();
            } else {
               return this.reward_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.reward_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getRewardFieldBuilder() {
            if (this.rewardBuilder_ == null) {
               this.rewardBuilder_ = new SingleFieldBuilderV3(this.getReward(), this.getParentForChildren(), this.isClean());
               this.reward_ = null;
            }

            return this.rewardBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_GetLuckyReward_7507OrBuilder extends MessageOrBuilder {
      boolean hasPrayId();

      int getPrayId();

      boolean hasRewardId();

      int getRewardId();
   }

   public interface C2S_GetPrayInfo_7501OrBuilder extends MessageOrBuilder {
      boolean hasPrayId();

      int getPrayId();
   }

   public interface C2S_PlayerAwardInfo_7509OrBuilder extends MessageOrBuilder {
      boolean hasPrayId();

      int getPrayId();
   }

   public interface C2S_Pray_7503OrBuilder extends MessageOrBuilder {
      boolean hasPrayId();

      int getPrayId();

      boolean hasPrayTimesIndex();

      int getPrayTimesIndex();
   }

   public interface C2S_RefreshPrayReward_7505OrBuilder extends MessageOrBuilder {
      boolean hasPrayId();

      int getPrayId();
   }

   public interface PrayGridInfoOrBuilder extends MessageOrBuilder {
      boolean hasPos();

      int getPos();

      boolean hasReward();

      CommonMsg.ItemInfo getReward();

      CommonMsg.ItemInfoOrBuilder getRewardOrBuilder();

      boolean hasCount();

      int getCount();

      boolean hasLimit();

      int getLimit();
   }

   public interface Pray_RecordDataOrBuilder extends MessageOrBuilder {
      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasReward();

      CommonMsg.ItemInfo getReward();

      CommonMsg.ItemInfoOrBuilder getRewardOrBuilder();
   }

   public interface S2C_GetLuckyReward_7508OrBuilder extends MessageOrBuilder {
      boolean hasPrayId();

      int getPrayId();

      List<Integer> getRewardIdList();

      int getRewardIdCount();

      int getRewardId(int index);

      boolean hasLuckyPoint();

      int getLuckyPoint();
   }

   public interface S2C_GetPrayInfo_7502OrBuilder extends MessageOrBuilder {
      List<S2C_RefreshPrayReward_7506> getPrayInfoList();

      S2C_RefreshPrayReward_7506 getPrayInfo(int index);

      int getPrayInfoCount();

      List<? extends S2C_RefreshPrayReward_7506OrBuilder> getPrayInfoOrBuilderList();

      S2C_RefreshPrayReward_7506OrBuilder getPrayInfoOrBuilder(int index);

      List<S2C_GetLuckyReward_7508> getLuckyInfoList();

      S2C_GetLuckyReward_7508 getLuckyInfo(int index);

      int getLuckyInfoCount();

      List<? extends S2C_GetLuckyReward_7508OrBuilder> getLuckyInfoOrBuilderList();

      S2C_GetLuckyReward_7508OrBuilder getLuckyInfoOrBuilder(int index);
   }

   public interface S2C_PlayerAwardInfo_7510OrBuilder extends MessageOrBuilder {
      boolean hasPrayId();

      int getPrayId();

      List<Pray_RecordData> getDataList();

      Pray_RecordData getData(int index);

      int getDataCount();

      List<? extends Pray_RecordDataOrBuilder> getDataOrBuilderList();

      Pray_RecordDataOrBuilder getDataOrBuilder(int index);
   }

   public interface S2C_Pray_7504OrBuilder extends MessageOrBuilder {
      List<Integer> getPosList();

      int getPosCount();

      int getPos(int index);

      boolean hasLuckyPoint();

      int getLuckyPoint();

      List<Pray_RecordData> getDataList();

      Pray_RecordData getData(int index);

      int getDataCount();

      List<? extends Pray_RecordDataOrBuilder> getDataOrBuilderList();

      Pray_RecordDataOrBuilder getDataOrBuilder(int index);
   }

   public interface S2C_RefreshPrayReward_7506OrBuilder extends MessageOrBuilder {
      boolean hasPrayId();

      int getPrayId();

      List<PrayGridInfo> getGridList();

      PrayGridInfo getGrid(int index);

      int getGridCount();

      List<? extends PrayGridInfoOrBuilder> getGridOrBuilderList();

      PrayGridInfoOrBuilder getGridOrBuilder(int index);

      boolean hasRefreshTimes();

      int getRefreshTimes();
   }
}
