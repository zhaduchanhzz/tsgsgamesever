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

public final class QianKunLotteryMsg {
   private static final Descriptors.Descriptor internal_static_qiankunlottery_com_gzbz_protobuf_C2S_QianKunLotteryInfo_19801_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_qiankunlottery_com_gzbz_protobuf_C2S_QianKunLotteryInfo_19801_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_qiankunlottery_com_gzbz_protobuf_S2C_QianKunLotteryInfo_19802_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_qiankunlottery_com_gzbz_protobuf_S2C_QianKunLotteryInfo_19802_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_qiankunlottery_com_gzbz_protobuf_RecruitRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_qiankunlottery_com_gzbz_protobuf_RecruitRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_qiankunlottery_com_gzbz_protobuf_C2S_RecruitQianKunLottery_19803_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_qiankunlottery_com_gzbz_protobuf_C2S_RecruitQianKunLottery_19803_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitQianKunLottery_19804_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitQianKunLottery_19804_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitRecordInfo_19805_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitRecordInfo_19805_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_qiankunlottery_com_gzbz_protobuf_C2S_RecruitResult_19806_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_qiankunlottery_com_gzbz_protobuf_C2S_RecruitResult_19806_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitResult_19807_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitResult_19807_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_qiankunlottery_com_gzbz_protobuf_S2S_RecruitRecord_19808_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_qiankunlottery_com_gzbz_protobuf_S2S_RecruitRecord_19808_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private QianKunLotteryMsg() {
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
      String[] descriptorData = new String[]{"\n\u0014QianKunLottery.proto\u0012 qiankunlottery.com.gzbz.protobuf\u001a\fcommon.proto\"\u001e\n\u001cC2S_QianKunLotteryInfo_19801\"ç\u0002\n\u001cS2C_QianKunLotteryInfo_19802\u0012A\n\bmyRecord\u0018\u0001 \u0003(\u000b2/.qiankunlottery.com.gzbz.protobuf.RecruitRecord\u0012B\n\tallRecord\u0018\u0002 \u0003(\u000b2/.qiankunlottery.com.gzbz.protobuf.RecruitRecord\u0012$\n\tawardList\u0018\u0003 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0018\n\u0010commonRecruitNum\u0018\u0005 \u0002(\u0005\u0012\u0016\n\u000ehighRecruitNum\u0018\u0006 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0007 \u0001(\u0005\u0012\u0015\n\rcommonDrawNum\u0018\b \u0002(\u0005\u0012\u0013\n\u000bhighDrawNum\u0018\t \u0002(\u0005\u0012\u0018\n\u0010activityStartDay\u0018\n \u0002(\u0005\u0012\u0013\n\u000bfreeRecruit\u0018\u000b \u0002(\u0005\"\u0080\u0001\n\rRecruitRecord\u0012\u0010\n\bserverId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0002(\t\u0012\u000f\n\u0007awardId\u0018\u0004 \u0002(\u0005\u0012\u0013\n\u000brecruitType\u0018\u0005 \u0002(\u0005\u0012\u0011\n\tbroadcast\u0018\u0006 \u0002(\b\"Y\n\u001fC2S_RecruitQianKunLottery_19803\u0012\u0013\n\u000brecruitType\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nrecruitNum\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0003 \u0002(\u0005\"\u0085\u0001\n\u001fS2C_RecruitQianKunLottery_19804\u0012\u0012\n\nresultList\u0018\u0001 \u0003(\u0005\u0012\r\n\u0005stage\u0018\u0002 \u0002(\u0005\u0012\u0015\n\rcommonDrawNum\u0018\u0007 \u0001(\u0005\u0012\u0013\n\u000bhighDrawNum\u0018\b \u0001(\u0005\u0012\u0013\n\u000bfreeRecruit\u0018\u000b \u0002(\u0005\"a\n\u001bS2C_RecruitRecordInfo_19805\u0012B\n\tallRecord\u0018\u0002 \u0003(\u000b2/.qiankunlottery.com.gzbz.protobuf.RecruitRecord\"\u0019\n\u0017C2S_RecruitResult_19806\"\u0082\u0001\n\u0017S2C_RecruitResult_19807\u0012A\n\bmyRecord\u0018\u0001 \u0003(\u000b2/.qiankunlottery.com.gzbz.protobuf.RecruitRecord\u0012$\n\tawardList\u0018\u0002 \u0003(\u000b2\u0011.common.MapDataII\"Z\n\u0017S2S_RecruitRecord_19808\u0012?\n\u0006record\u0018\u0001 \u0003(\u000b2/.qiankunlottery.com.gzbz.protobuf.RecruitRecordB(\n\u0011com.gzbz.protobufB\u0011QianKunLotteryMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_qiankunlottery_com_gzbz_protobuf_C2S_QianKunLotteryInfo_19801_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_qiankunlottery_com_gzbz_protobuf_C2S_QianKunLotteryInfo_19801_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_qiankunlottery_com_gzbz_protobuf_C2S_QianKunLotteryInfo_19801_descriptor, new String[0]);
      internal_static_qiankunlottery_com_gzbz_protobuf_S2C_QianKunLotteryInfo_19802_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_qiankunlottery_com_gzbz_protobuf_S2C_QianKunLotteryInfo_19802_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_qiankunlottery_com_gzbz_protobuf_S2C_QianKunLotteryInfo_19802_descriptor, new String[]{"MyRecord", "AllRecord", "AwardList", "CommonRecruitNum", "HighRecruitNum", "Stage", "CommonDrawNum", "HighDrawNum", "ActivityStartDay", "FreeRecruit"});
      internal_static_qiankunlottery_com_gzbz_protobuf_RecruitRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_qiankunlottery_com_gzbz_protobuf_RecruitRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_qiankunlottery_com_gzbz_protobuf_RecruitRecord_descriptor, new String[]{"ServerId", "PlayerId", "PlayerName", "AwardId", "RecruitType", "Broadcast"});
      internal_static_qiankunlottery_com_gzbz_protobuf_C2S_RecruitQianKunLottery_19803_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_qiankunlottery_com_gzbz_protobuf_C2S_RecruitQianKunLottery_19803_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_qiankunlottery_com_gzbz_protobuf_C2S_RecruitQianKunLottery_19803_descriptor, new String[]{"RecruitType", "RecruitNum", "Stage"});
      internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitQianKunLottery_19804_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitQianKunLottery_19804_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitQianKunLottery_19804_descriptor, new String[]{"ResultList", "Stage", "CommonDrawNum", "HighDrawNum", "FreeRecruit"});
      internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitRecordInfo_19805_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitRecordInfo_19805_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitRecordInfo_19805_descriptor, new String[]{"AllRecord"});
      internal_static_qiankunlottery_com_gzbz_protobuf_C2S_RecruitResult_19806_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_qiankunlottery_com_gzbz_protobuf_C2S_RecruitResult_19806_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_qiankunlottery_com_gzbz_protobuf_C2S_RecruitResult_19806_descriptor, new String[0]);
      internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitResult_19807_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitResult_19807_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitResult_19807_descriptor, new String[]{"MyRecord", "AwardList"});
      internal_static_qiankunlottery_com_gzbz_protobuf_S2S_RecruitRecord_19808_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_qiankunlottery_com_gzbz_protobuf_S2S_RecruitRecord_19808_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_qiankunlottery_com_gzbz_protobuf_S2S_RecruitRecord_19808_descriptor, new String[]{"Record"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_QianKunLotteryInfo_19801 extends GeneratedMessageV3 implements C2S_QianKunLotteryInfo_19801OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_QianKunLotteryInfo_19801 DEFAULT_INSTANCE = new C2S_QianKunLotteryInfo_19801();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_QianKunLotteryInfo_19801> PARSER = new AbstractParser<C2S_QianKunLotteryInfo_19801>() {
         public C2S_QianKunLotteryInfo_19801 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_QianKunLotteryInfo_19801(input, extensionRegistry);
         }
      };

      private C2S_QianKunLotteryInfo_19801(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_QianKunLotteryInfo_19801() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_QianKunLotteryInfo_19801();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_QianKunLotteryInfo_19801(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_C2S_QianKunLotteryInfo_19801_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_C2S_QianKunLotteryInfo_19801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_QianKunLotteryInfo_19801.class, Builder.class);
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
         } else if (!(obj instanceof C2S_QianKunLotteryInfo_19801)) {
            return super.equals(obj);
         } else {
            C2S_QianKunLotteryInfo_19801 other = (C2S_QianKunLotteryInfo_19801)obj;
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

      public static C2S_QianKunLotteryInfo_19801 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_QianKunLotteryInfo_19801)PARSER.parseFrom(data);
      }

      public static C2S_QianKunLotteryInfo_19801 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_QianKunLotteryInfo_19801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_QianKunLotteryInfo_19801 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_QianKunLotteryInfo_19801)PARSER.parseFrom(data);
      }

      public static C2S_QianKunLotteryInfo_19801 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_QianKunLotteryInfo_19801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_QianKunLotteryInfo_19801 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_QianKunLotteryInfo_19801)PARSER.parseFrom(data);
      }

      public static C2S_QianKunLotteryInfo_19801 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_QianKunLotteryInfo_19801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_QianKunLotteryInfo_19801 parseFrom(InputStream input) throws IOException {
         return (C2S_QianKunLotteryInfo_19801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_QianKunLotteryInfo_19801 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_QianKunLotteryInfo_19801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_QianKunLotteryInfo_19801 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_QianKunLotteryInfo_19801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_QianKunLotteryInfo_19801 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_QianKunLotteryInfo_19801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_QianKunLotteryInfo_19801 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_QianKunLotteryInfo_19801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_QianKunLotteryInfo_19801 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_QianKunLotteryInfo_19801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_QianKunLotteryInfo_19801 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_QianKunLotteryInfo_19801 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_QianKunLotteryInfo_19801> parser() {
         return PARSER;
      }

      public Parser<C2S_QianKunLotteryInfo_19801> getParserForType() {
         return PARSER;
      }

      public C2S_QianKunLotteryInfo_19801 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_QianKunLotteryInfo_19801OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_C2S_QianKunLotteryInfo_19801_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_C2S_QianKunLotteryInfo_19801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_QianKunLotteryInfo_19801.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (QianKunLotteryMsg.C2S_QianKunLotteryInfo_19801.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_C2S_QianKunLotteryInfo_19801_descriptor;
         }

         public C2S_QianKunLotteryInfo_19801 getDefaultInstanceForType() {
            return QianKunLotteryMsg.C2S_QianKunLotteryInfo_19801.getDefaultInstance();
         }

         public C2S_QianKunLotteryInfo_19801 build() {
            C2S_QianKunLotteryInfo_19801 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_QianKunLotteryInfo_19801 buildPartial() {
            C2S_QianKunLotteryInfo_19801 result = new C2S_QianKunLotteryInfo_19801(this);
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
            if (other instanceof C2S_QianKunLotteryInfo_19801) {
               return this.mergeFrom((C2S_QianKunLotteryInfo_19801)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_QianKunLotteryInfo_19801 other) {
            if (other == QianKunLotteryMsg.C2S_QianKunLotteryInfo_19801.getDefaultInstance()) {
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
            C2S_QianKunLotteryInfo_19801 parsedMessage = null;

            try {
               parsedMessage = (C2S_QianKunLotteryInfo_19801)QianKunLotteryMsg.C2S_QianKunLotteryInfo_19801.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_QianKunLotteryInfo_19801)e.getUnfinishedMessage();
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

   public static final class S2C_QianKunLotteryInfo_19802 extends GeneratedMessageV3 implements S2C_QianKunLotteryInfo_19802OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MYRECORD_FIELD_NUMBER = 1;
      private List<RecruitRecord> myRecord_;
      public static final int ALLRECORD_FIELD_NUMBER = 2;
      private List<RecruitRecord> allRecord_;
      public static final int AWARDLIST_FIELD_NUMBER = 3;
      private List<CommonMsg.MapDataII> awardList_;
      public static final int COMMONRECRUITNUM_FIELD_NUMBER = 5;
      private int commonRecruitNum_;
      public static final int HIGHRECRUITNUM_FIELD_NUMBER = 6;
      private int highRecruitNum_;
      public static final int STAGE_FIELD_NUMBER = 7;
      private int stage_;
      public static final int COMMONDRAWNUM_FIELD_NUMBER = 8;
      private int commonDrawNum_;
      public static final int HIGHDRAWNUM_FIELD_NUMBER = 9;
      private int highDrawNum_;
      public static final int ACTIVITYSTARTDAY_FIELD_NUMBER = 10;
      private int activityStartDay_;
      public static final int FREERECRUIT_FIELD_NUMBER = 11;
      private int freeRecruit_;
      private byte memoizedIsInitialized;
      private static final S2C_QianKunLotteryInfo_19802 DEFAULT_INSTANCE = new S2C_QianKunLotteryInfo_19802();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_QianKunLotteryInfo_19802> PARSER = new AbstractParser<S2C_QianKunLotteryInfo_19802>() {
         public S2C_QianKunLotteryInfo_19802 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_QianKunLotteryInfo_19802(input, extensionRegistry);
         }
      };

      private S2C_QianKunLotteryInfo_19802(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_QianKunLotteryInfo_19802() {
         this.memoizedIsInitialized = -1;
         this.myRecord_ = Collections.emptyList();
         this.allRecord_ = Collections.emptyList();
         this.awardList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_QianKunLotteryInfo_19802();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_QianKunLotteryInfo_19802(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.myRecord_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.myRecord_.add(input.readMessage(QianKunLotteryMsg.RecruitRecord.PARSER, extensionRegistry));
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.allRecord_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.allRecord_.add(input.readMessage(QianKunLotteryMsg.RecruitRecord.PARSER, extensionRegistry));
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.awardList_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.awardList_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     case 40:
                        this.bitField0_ |= 1;
                        this.commonRecruitNum_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 2;
                        this.highRecruitNum_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 4;
                        this.stage_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 8;
                        this.commonDrawNum_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 16;
                        this.highDrawNum_ = input.readInt32();
                        break;
                     case 80:
                        this.bitField0_ |= 32;
                        this.activityStartDay_ = input.readInt32();
                        break;
                     case 88:
                        this.bitField0_ |= 64;
                        this.freeRecruit_ = input.readInt32();
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
                  this.myRecord_ = Collections.unmodifiableList(this.myRecord_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.allRecord_ = Collections.unmodifiableList(this.allRecord_);
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.awardList_ = Collections.unmodifiableList(this.awardList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2C_QianKunLotteryInfo_19802_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2C_QianKunLotteryInfo_19802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_QianKunLotteryInfo_19802.class, Builder.class);
      }

      public List<RecruitRecord> getMyRecordList() {
         return this.myRecord_;
      }

      public List<? extends RecruitRecordOrBuilder> getMyRecordOrBuilderList() {
         return this.myRecord_;
      }

      public int getMyRecordCount() {
         return this.myRecord_.size();
      }

      public RecruitRecord getMyRecord(int index) {
         return (RecruitRecord)this.myRecord_.get(index);
      }

      public RecruitRecordOrBuilder getMyRecordOrBuilder(int index) {
         return (RecruitRecordOrBuilder)this.myRecord_.get(index);
      }

      public List<RecruitRecord> getAllRecordList() {
         return this.allRecord_;
      }

      public List<? extends RecruitRecordOrBuilder> getAllRecordOrBuilderList() {
         return this.allRecord_;
      }

      public int getAllRecordCount() {
         return this.allRecord_.size();
      }

      public RecruitRecord getAllRecord(int index) {
         return (RecruitRecord)this.allRecord_.get(index);
      }

      public RecruitRecordOrBuilder getAllRecordOrBuilder(int index) {
         return (RecruitRecordOrBuilder)this.allRecord_.get(index);
      }

      public List<CommonMsg.MapDataII> getAwardListList() {
         return this.awardList_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getAwardListOrBuilderList() {
         return this.awardList_;
      }

      public int getAwardListCount() {
         return this.awardList_.size();
      }

      public CommonMsg.MapDataII getAwardList(int index) {
         return (CommonMsg.MapDataII)this.awardList_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getAwardListOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.awardList_.get(index);
      }

      public boolean hasCommonRecruitNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCommonRecruitNum() {
         return this.commonRecruitNum_;
      }

      public boolean hasHighRecruitNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHighRecruitNum() {
         return this.highRecruitNum_;
      }

      public boolean hasStage() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public boolean hasCommonDrawNum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getCommonDrawNum() {
         return this.commonDrawNum_;
      }

      public boolean hasHighDrawNum() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getHighDrawNum() {
         return this.highDrawNum_;
      }

      public boolean hasActivityStartDay() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getActivityStartDay() {
         return this.activityStartDay_;
      }

      public boolean hasFreeRecruit() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getFreeRecruit() {
         return this.freeRecruit_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCommonRecruitNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHighRecruitNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCommonDrawNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHighDrawNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasActivityStartDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFreeRecruit()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getMyRecordCount(); ++i) {
               if (!this.getMyRecord(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getAllRecordCount(); ++i) {
               if (!this.getAllRecord(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getAwardListCount(); ++i) {
               if (!this.getAwardList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.myRecord_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.myRecord_.get(i));
         }

         for(int i = 0; i < this.allRecord_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.allRecord_.get(i));
         }

         for(int i = 0; i < this.awardList_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.awardList_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(5, this.commonRecruitNum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(6, this.highRecruitNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(7, this.stage_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(8, this.commonDrawNum_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(9, this.highDrawNum_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(10, this.activityStartDay_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(11, this.freeRecruit_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.myRecord_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.myRecord_.get(i));
            }

            for(int i = 0; i < this.allRecord_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.allRecord_.get(i));
            }

            for(int i = 0; i < this.awardList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.awardList_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.commonRecruitNum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.highRecruitNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.stage_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.commonDrawNum_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.highDrawNum_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.activityStartDay_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.freeRecruit_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_QianKunLotteryInfo_19802)) {
            return super.equals(obj);
         } else {
            S2C_QianKunLotteryInfo_19802 other = (S2C_QianKunLotteryInfo_19802)obj;
            if (!this.getMyRecordList().equals(other.getMyRecordList())) {
               return false;
            } else if (!this.getAllRecordList().equals(other.getAllRecordList())) {
               return false;
            } else if (!this.getAwardListList().equals(other.getAwardListList())) {
               return false;
            } else if (this.hasCommonRecruitNum() != other.hasCommonRecruitNum()) {
               return false;
            } else if (this.hasCommonRecruitNum() && this.getCommonRecruitNum() != other.getCommonRecruitNum()) {
               return false;
            } else if (this.hasHighRecruitNum() != other.hasHighRecruitNum()) {
               return false;
            } else if (this.hasHighRecruitNum() && this.getHighRecruitNum() != other.getHighRecruitNum()) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else if (this.hasCommonDrawNum() != other.hasCommonDrawNum()) {
               return false;
            } else if (this.hasCommonDrawNum() && this.getCommonDrawNum() != other.getCommonDrawNum()) {
               return false;
            } else if (this.hasHighDrawNum() != other.hasHighDrawNum()) {
               return false;
            } else if (this.hasHighDrawNum() && this.getHighDrawNum() != other.getHighDrawNum()) {
               return false;
            } else if (this.hasActivityStartDay() != other.hasActivityStartDay()) {
               return false;
            } else if (this.hasActivityStartDay() && this.getActivityStartDay() != other.getActivityStartDay()) {
               return false;
            } else if (this.hasFreeRecruit() != other.hasFreeRecruit()) {
               return false;
            } else if (this.hasFreeRecruit() && this.getFreeRecruit() != other.getFreeRecruit()) {
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
            if (this.getMyRecordCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMyRecordList().hashCode();
            }

            if (this.getAllRecordCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAllRecordList().hashCode();
            }

            if (this.getAwardListCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getAwardListList().hashCode();
            }

            if (this.hasCommonRecruitNum()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getCommonRecruitNum();
            }

            if (this.hasHighRecruitNum()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getHighRecruitNum();
            }

            if (this.hasStage()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getStage();
            }

            if (this.hasCommonDrawNum()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getCommonDrawNum();
            }

            if (this.hasHighDrawNum()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getHighDrawNum();
            }

            if (this.hasActivityStartDay()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getActivityStartDay();
            }

            if (this.hasFreeRecruit()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getFreeRecruit();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_QianKunLotteryInfo_19802 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_QianKunLotteryInfo_19802)PARSER.parseFrom(data);
      }

      public static S2C_QianKunLotteryInfo_19802 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_QianKunLotteryInfo_19802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_QianKunLotteryInfo_19802 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_QianKunLotteryInfo_19802)PARSER.parseFrom(data);
      }

      public static S2C_QianKunLotteryInfo_19802 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_QianKunLotteryInfo_19802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_QianKunLotteryInfo_19802 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_QianKunLotteryInfo_19802)PARSER.parseFrom(data);
      }

      public static S2C_QianKunLotteryInfo_19802 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_QianKunLotteryInfo_19802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_QianKunLotteryInfo_19802 parseFrom(InputStream input) throws IOException {
         return (S2C_QianKunLotteryInfo_19802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_QianKunLotteryInfo_19802 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_QianKunLotteryInfo_19802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_QianKunLotteryInfo_19802 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_QianKunLotteryInfo_19802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_QianKunLotteryInfo_19802 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_QianKunLotteryInfo_19802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_QianKunLotteryInfo_19802 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_QianKunLotteryInfo_19802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_QianKunLotteryInfo_19802 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_QianKunLotteryInfo_19802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_QianKunLotteryInfo_19802 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_QianKunLotteryInfo_19802 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_QianKunLotteryInfo_19802> parser() {
         return PARSER;
      }

      public Parser<S2C_QianKunLotteryInfo_19802> getParserForType() {
         return PARSER;
      }

      public S2C_QianKunLotteryInfo_19802 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_QianKunLotteryInfo_19802OrBuilder {
         private int bitField0_;
         private List<RecruitRecord> myRecord_;
         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> myRecordBuilder_;
         private List<RecruitRecord> allRecord_;
         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> allRecordBuilder_;
         private List<CommonMsg.MapDataII> awardList_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> awardListBuilder_;
         private int commonRecruitNum_;
         private int highRecruitNum_;
         private int stage_;
         private int commonDrawNum_;
         private int highDrawNum_;
         private int activityStartDay_;
         private int freeRecruit_;

         public static final Descriptors.Descriptor getDescriptor() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2C_QianKunLotteryInfo_19802_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2C_QianKunLotteryInfo_19802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_QianKunLotteryInfo_19802.class, Builder.class);
         }

         private Builder() {
            this.myRecord_ = Collections.emptyList();
            this.allRecord_ = Collections.emptyList();
            this.awardList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.myRecord_ = Collections.emptyList();
            this.allRecord_ = Collections.emptyList();
            this.awardList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (QianKunLotteryMsg.S2C_QianKunLotteryInfo_19802.alwaysUseFieldBuilders) {
               this.getMyRecordFieldBuilder();
               this.getAllRecordFieldBuilder();
               this.getAwardListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.myRecordBuilder_ == null) {
               this.myRecord_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.myRecordBuilder_.clear();
            }

            if (this.allRecordBuilder_ == null) {
               this.allRecord_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.allRecordBuilder_.clear();
            }

            if (this.awardListBuilder_ == null) {
               this.awardList_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.awardListBuilder_.clear();
            }

            this.commonRecruitNum_ = 0;
            this.bitField0_ &= -9;
            this.highRecruitNum_ = 0;
            this.bitField0_ &= -17;
            this.stage_ = 0;
            this.bitField0_ &= -33;
            this.commonDrawNum_ = 0;
            this.bitField0_ &= -65;
            this.highDrawNum_ = 0;
            this.bitField0_ &= -129;
            this.activityStartDay_ = 0;
            this.bitField0_ &= -257;
            this.freeRecruit_ = 0;
            this.bitField0_ &= -513;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2C_QianKunLotteryInfo_19802_descriptor;
         }

         public S2C_QianKunLotteryInfo_19802 getDefaultInstanceForType() {
            return QianKunLotteryMsg.S2C_QianKunLotteryInfo_19802.getDefaultInstance();
         }

         public S2C_QianKunLotteryInfo_19802 build() {
            S2C_QianKunLotteryInfo_19802 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_QianKunLotteryInfo_19802 buildPartial() {
            S2C_QianKunLotteryInfo_19802 result = new S2C_QianKunLotteryInfo_19802(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.myRecordBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.myRecord_ = Collections.unmodifiableList(this.myRecord_);
                  this.bitField0_ &= -2;
               }

               result.myRecord_ = this.myRecord_;
            } else {
               result.myRecord_ = this.myRecordBuilder_.build();
            }

            if (this.allRecordBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.allRecord_ = Collections.unmodifiableList(this.allRecord_);
                  this.bitField0_ &= -3;
               }

               result.allRecord_ = this.allRecord_;
            } else {
               result.allRecord_ = this.allRecordBuilder_.build();
            }

            if (this.awardListBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.awardList_ = Collections.unmodifiableList(this.awardList_);
                  this.bitField0_ &= -5;
               }

               result.awardList_ = this.awardList_;
            } else {
               result.awardList_ = this.awardListBuilder_.build();
            }

            if ((from_bitField0_ & 8) != 0) {
               result.commonRecruitNum_ = this.commonRecruitNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.highRecruitNum_ = this.highRecruitNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.stage_ = this.stage_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.commonDrawNum_ = this.commonDrawNum_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.highDrawNum_ = this.highDrawNum_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.activityStartDay_ = this.activityStartDay_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.freeRecruit_ = this.freeRecruit_;
               to_bitField0_ |= 64;
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
            if (other instanceof S2C_QianKunLotteryInfo_19802) {
               return this.mergeFrom((S2C_QianKunLotteryInfo_19802)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_QianKunLotteryInfo_19802 other) {
            if (other == QianKunLotteryMsg.S2C_QianKunLotteryInfo_19802.getDefaultInstance()) {
               return this;
            } else {
               if (this.myRecordBuilder_ == null) {
                  if (!other.myRecord_.isEmpty()) {
                     if (this.myRecord_.isEmpty()) {
                        this.myRecord_ = other.myRecord_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureMyRecordIsMutable();
                        this.myRecord_.addAll(other.myRecord_);
                     }

                     this.onChanged();
                  }
               } else if (!other.myRecord_.isEmpty()) {
                  if (this.myRecordBuilder_.isEmpty()) {
                     this.myRecordBuilder_.dispose();
                     this.myRecordBuilder_ = null;
                     this.myRecord_ = other.myRecord_;
                     this.bitField0_ &= -2;
                     this.myRecordBuilder_ = QianKunLotteryMsg.S2C_QianKunLotteryInfo_19802.alwaysUseFieldBuilders ? this.getMyRecordFieldBuilder() : null;
                  } else {
                     this.myRecordBuilder_.addAllMessages(other.myRecord_);
                  }
               }

               if (this.allRecordBuilder_ == null) {
                  if (!other.allRecord_.isEmpty()) {
                     if (this.allRecord_.isEmpty()) {
                        this.allRecord_ = other.allRecord_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureAllRecordIsMutable();
                        this.allRecord_.addAll(other.allRecord_);
                     }

                     this.onChanged();
                  }
               } else if (!other.allRecord_.isEmpty()) {
                  if (this.allRecordBuilder_.isEmpty()) {
                     this.allRecordBuilder_.dispose();
                     this.allRecordBuilder_ = null;
                     this.allRecord_ = other.allRecord_;
                     this.bitField0_ &= -3;
                     this.allRecordBuilder_ = QianKunLotteryMsg.S2C_QianKunLotteryInfo_19802.alwaysUseFieldBuilders ? this.getAllRecordFieldBuilder() : null;
                  } else {
                     this.allRecordBuilder_.addAllMessages(other.allRecord_);
                  }
               }

               if (this.awardListBuilder_ == null) {
                  if (!other.awardList_.isEmpty()) {
                     if (this.awardList_.isEmpty()) {
                        this.awardList_ = other.awardList_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureAwardListIsMutable();
                        this.awardList_.addAll(other.awardList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.awardList_.isEmpty()) {
                  if (this.awardListBuilder_.isEmpty()) {
                     this.awardListBuilder_.dispose();
                     this.awardListBuilder_ = null;
                     this.awardList_ = other.awardList_;
                     this.bitField0_ &= -5;
                     this.awardListBuilder_ = QianKunLotteryMsg.S2C_QianKunLotteryInfo_19802.alwaysUseFieldBuilders ? this.getAwardListFieldBuilder() : null;
                  } else {
                     this.awardListBuilder_.addAllMessages(other.awardList_);
                  }
               }

               if (other.hasCommonRecruitNum()) {
                  this.setCommonRecruitNum(other.getCommonRecruitNum());
               }

               if (other.hasHighRecruitNum()) {
                  this.setHighRecruitNum(other.getHighRecruitNum());
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               if (other.hasCommonDrawNum()) {
                  this.setCommonDrawNum(other.getCommonDrawNum());
               }

               if (other.hasHighDrawNum()) {
                  this.setHighDrawNum(other.getHighDrawNum());
               }

               if (other.hasActivityStartDay()) {
                  this.setActivityStartDay(other.getActivityStartDay());
               }

               if (other.hasFreeRecruit()) {
                  this.setFreeRecruit(other.getFreeRecruit());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCommonRecruitNum()) {
               return false;
            } else if (!this.hasHighRecruitNum()) {
               return false;
            } else if (!this.hasCommonDrawNum()) {
               return false;
            } else if (!this.hasHighDrawNum()) {
               return false;
            } else if (!this.hasActivityStartDay()) {
               return false;
            } else if (!this.hasFreeRecruit()) {
               return false;
            } else {
               for(int i = 0; i < this.getMyRecordCount(); ++i) {
                  if (!this.getMyRecord(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getAllRecordCount(); ++i) {
                  if (!this.getAllRecord(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getAwardListCount(); ++i) {
                  if (!this.getAwardList(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_QianKunLotteryInfo_19802 parsedMessage = null;

            try {
               parsedMessage = (S2C_QianKunLotteryInfo_19802)QianKunLotteryMsg.S2C_QianKunLotteryInfo_19802.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_QianKunLotteryInfo_19802)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureMyRecordIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.myRecord_ = new ArrayList(this.myRecord_);
               this.bitField0_ |= 1;
            }

         }

         public List<RecruitRecord> getMyRecordList() {
            return this.myRecordBuilder_ == null ? Collections.unmodifiableList(this.myRecord_) : this.myRecordBuilder_.getMessageList();
         }

         public int getMyRecordCount() {
            return this.myRecordBuilder_ == null ? this.myRecord_.size() : this.myRecordBuilder_.getCount();
         }

         public RecruitRecord getMyRecord(int index) {
            return this.myRecordBuilder_ == null ? (RecruitRecord)this.myRecord_.get(index) : (RecruitRecord)this.myRecordBuilder_.getMessage(index);
         }

         public Builder setMyRecord(int index, RecruitRecord value) {
            if (this.myRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyRecordIsMutable();
               this.myRecord_.set(index, value);
               this.onChanged();
            } else {
               this.myRecordBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setMyRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMyRecord(RecruitRecord value) {
            if (this.myRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyRecordIsMutable();
               this.myRecord_.add(value);
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addMyRecord(int index, RecruitRecord value) {
            if (this.myRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyRecordIsMutable();
               this.myRecord_.add(index, value);
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addMyRecord(RecruitRecord.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMyRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMyRecord(Iterable<? extends RecruitRecord> values) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.myRecord_);
               this.onChanged();
            } else {
               this.myRecordBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearMyRecord() {
            if (this.myRecordBuilder_ == null) {
               this.myRecord_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.myRecordBuilder_.clear();
            }

            return this;
         }

         public Builder removeMyRecord(int index) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.remove(index);
               this.onChanged();
            } else {
               this.myRecordBuilder_.remove(index);
            }

            return this;
         }

         public RecruitRecord.Builder getMyRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getMyRecordFieldBuilder().getBuilder(index);
         }

         public RecruitRecordOrBuilder getMyRecordOrBuilder(int index) {
            return this.myRecordBuilder_ == null ? (RecruitRecordOrBuilder)this.myRecord_.get(index) : (RecruitRecordOrBuilder)this.myRecordBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RecruitRecordOrBuilder> getMyRecordOrBuilderList() {
            return this.myRecordBuilder_ != null ? this.myRecordBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.myRecord_);
         }

         public RecruitRecord.Builder addMyRecordBuilder() {
            return (RecruitRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(QianKunLotteryMsg.RecruitRecord.getDefaultInstance());
         }

         public RecruitRecord.Builder addMyRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(index, QianKunLotteryMsg.RecruitRecord.getDefaultInstance());
         }

         public List<RecruitRecord.Builder> getMyRecordBuilderList() {
            return this.getMyRecordFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> getMyRecordFieldBuilder() {
            if (this.myRecordBuilder_ == null) {
               this.myRecordBuilder_ = new RepeatedFieldBuilderV3(this.myRecord_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.myRecord_ = null;
            }

            return this.myRecordBuilder_;
         }

         private void ensureAllRecordIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.allRecord_ = new ArrayList(this.allRecord_);
               this.bitField0_ |= 2;
            }

         }

         public List<RecruitRecord> getAllRecordList() {
            return this.allRecordBuilder_ == null ? Collections.unmodifiableList(this.allRecord_) : this.allRecordBuilder_.getMessageList();
         }

         public int getAllRecordCount() {
            return this.allRecordBuilder_ == null ? this.allRecord_.size() : this.allRecordBuilder_.getCount();
         }

         public RecruitRecord getAllRecord(int index) {
            return this.allRecordBuilder_ == null ? (RecruitRecord)this.allRecord_.get(index) : (RecruitRecord)this.allRecordBuilder_.getMessage(index);
         }

         public Builder setAllRecord(int index, RecruitRecord value) {
            if (this.allRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAllRecordIsMutable();
               this.allRecord_.set(index, value);
               this.onChanged();
            } else {
               this.allRecordBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAllRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.allRecordBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecord(RecruitRecord value) {
            if (this.allRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAllRecordIsMutable();
               this.allRecord_.add(value);
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAllRecord(int index, RecruitRecord value) {
            if (this.allRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAllRecordIsMutable();
               this.allRecord_.add(index, value);
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAllRecord(RecruitRecord.Builder builderForValue) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAllRecord(Iterable<? extends RecruitRecord> values) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.allRecord_);
               this.onChanged();
            } else {
               this.allRecordBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAllRecord() {
            if (this.allRecordBuilder_ == null) {
               this.allRecord_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.allRecordBuilder_.clear();
            }

            return this;
         }

         public Builder removeAllRecord(int index) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.remove(index);
               this.onChanged();
            } else {
               this.allRecordBuilder_.remove(index);
            }

            return this;
         }

         public RecruitRecord.Builder getAllRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getAllRecordFieldBuilder().getBuilder(index);
         }

         public RecruitRecordOrBuilder getAllRecordOrBuilder(int index) {
            return this.allRecordBuilder_ == null ? (RecruitRecordOrBuilder)this.allRecord_.get(index) : (RecruitRecordOrBuilder)this.allRecordBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RecruitRecordOrBuilder> getAllRecordOrBuilderList() {
            return this.allRecordBuilder_ != null ? this.allRecordBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.allRecord_);
         }

         public RecruitRecord.Builder addAllRecordBuilder() {
            return (RecruitRecord.Builder)this.getAllRecordFieldBuilder().addBuilder(QianKunLotteryMsg.RecruitRecord.getDefaultInstance());
         }

         public RecruitRecord.Builder addAllRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getAllRecordFieldBuilder().addBuilder(index, QianKunLotteryMsg.RecruitRecord.getDefaultInstance());
         }

         public List<RecruitRecord.Builder> getAllRecordBuilderList() {
            return this.getAllRecordFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> getAllRecordFieldBuilder() {
            if (this.allRecordBuilder_ == null) {
               this.allRecordBuilder_ = new RepeatedFieldBuilderV3(this.allRecord_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.allRecord_ = null;
            }

            return this.allRecordBuilder_;
         }

         private void ensureAwardListIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.awardList_ = new ArrayList(this.awardList_);
               this.bitField0_ |= 4;
            }

         }

         public List<CommonMsg.MapDataII> getAwardListList() {
            return this.awardListBuilder_ == null ? Collections.unmodifiableList(this.awardList_) : this.awardListBuilder_.getMessageList();
         }

         public int getAwardListCount() {
            return this.awardListBuilder_ == null ? this.awardList_.size() : this.awardListBuilder_.getCount();
         }

         public CommonMsg.MapDataII getAwardList(int index) {
            return this.awardListBuilder_ == null ? (CommonMsg.MapDataII)this.awardList_.get(index) : (CommonMsg.MapDataII)this.awardListBuilder_.getMessage(index);
         }

         public Builder setAwardList(int index, CommonMsg.MapDataII value) {
            if (this.awardListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardListIsMutable();
               this.awardList_.set(index, value);
               this.onChanged();
            } else {
               this.awardListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAwardList(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               this.awardList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.awardListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAwardList(CommonMsg.MapDataII value) {
            if (this.awardListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardListIsMutable();
               this.awardList_.add(value);
               this.onChanged();
            } else {
               this.awardListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAwardList(int index, CommonMsg.MapDataII value) {
            if (this.awardListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardListIsMutable();
               this.awardList_.add(index, value);
               this.onChanged();
            } else {
               this.awardListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAwardList(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               this.awardList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.awardListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAwardList(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               this.awardList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.awardListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAwardList(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.awardList_);
               this.onChanged();
            } else {
               this.awardListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAwardList() {
            if (this.awardListBuilder_ == null) {
               this.awardList_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.awardListBuilder_.clear();
            }

            return this;
         }

         public Builder removeAwardList(int index) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               this.awardList_.remove(index);
               this.onChanged();
            } else {
               this.awardListBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getAwardListBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getAwardListFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getAwardListOrBuilder(int index) {
            return this.awardListBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.awardList_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.awardListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getAwardListOrBuilderList() {
            return this.awardListBuilder_ != null ? this.awardListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.awardList_);
         }

         public CommonMsg.MapDataII.Builder addAwardListBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getAwardListFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addAwardListBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getAwardListFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getAwardListBuilderList() {
            return this.getAwardListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getAwardListFieldBuilder() {
            if (this.awardListBuilder_ == null) {
               this.awardListBuilder_ = new RepeatedFieldBuilderV3(this.awardList_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.awardList_ = null;
            }

            return this.awardListBuilder_;
         }

         public boolean hasCommonRecruitNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getCommonRecruitNum() {
            return this.commonRecruitNum_;
         }

         public Builder setCommonRecruitNum(int value) {
            this.bitField0_ |= 8;
            this.commonRecruitNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCommonRecruitNum() {
            this.bitField0_ &= -9;
            this.commonRecruitNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHighRecruitNum() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getHighRecruitNum() {
            return this.highRecruitNum_;
         }

         public Builder setHighRecruitNum(int value) {
            this.bitField0_ |= 16;
            this.highRecruitNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHighRecruitNum() {
            this.bitField0_ &= -17;
            this.highRecruitNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 32;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -33;
            this.stage_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCommonDrawNum() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getCommonDrawNum() {
            return this.commonDrawNum_;
         }

         public Builder setCommonDrawNum(int value) {
            this.bitField0_ |= 64;
            this.commonDrawNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCommonDrawNum() {
            this.bitField0_ &= -65;
            this.commonDrawNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHighDrawNum() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getHighDrawNum() {
            return this.highDrawNum_;
         }

         public Builder setHighDrawNum(int value) {
            this.bitField0_ |= 128;
            this.highDrawNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHighDrawNum() {
            this.bitField0_ &= -129;
            this.highDrawNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasActivityStartDay() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getActivityStartDay() {
            return this.activityStartDay_;
         }

         public Builder setActivityStartDay(int value) {
            this.bitField0_ |= 256;
            this.activityStartDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityStartDay() {
            this.bitField0_ &= -257;
            this.activityStartDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFreeRecruit() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getFreeRecruit() {
            return this.freeRecruit_;
         }

         public Builder setFreeRecruit(int value) {
            this.bitField0_ |= 512;
            this.freeRecruit_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFreeRecruit() {
            this.bitField0_ &= -513;
            this.freeRecruit_ = 0;
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

   public static final class RecruitRecord extends GeneratedMessageV3 implements RecruitRecordOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SERVERID_FIELD_NUMBER = 1;
      private int serverId_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 3;
      private volatile Object playerName_;
      public static final int AWARDID_FIELD_NUMBER = 4;
      private int awardId_;
      public static final int RECRUITTYPE_FIELD_NUMBER = 5;
      private int recruitType_;
      public static final int BROADCAST_FIELD_NUMBER = 6;
      private boolean broadcast_;
      private byte memoizedIsInitialized;
      private static final RecruitRecord DEFAULT_INSTANCE = new RecruitRecord();
      /** @deprecated */
      @Deprecated
      public static final Parser<RecruitRecord> PARSER = new AbstractParser<RecruitRecord>() {
         public RecruitRecord parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RecruitRecord(input, extensionRegistry);
         }
      };

      private RecruitRecord(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RecruitRecord() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RecruitRecord();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RecruitRecord(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.serverId_ = input.readInt32();
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
                        this.awardId_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.recruitType_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.broadcast_ = input.readBool();
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
         return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_RecruitRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_RecruitRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(RecruitRecord.class, Builder.class);
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getServerId() {
         return this.serverId_;
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

      public boolean hasAwardId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getAwardId() {
         return this.awardId_;
      }

      public boolean hasRecruitType() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getRecruitType() {
         return this.recruitType_;
      }

      public boolean hasBroadcast() {
         return (this.bitField0_ & 32) != 0;
      }

      public boolean getBroadcast() {
         return this.broadcast_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAwardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecruitType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBroadcast()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.serverId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.playerName_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.awardId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.recruitType_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeBool(6, this.broadcast_);
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
               size += CodedOutputStream.computeInt32Size(1, this.serverId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.playerName_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.awardId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.recruitType_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeBoolSize(6, this.broadcast_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RecruitRecord)) {
            return super.equals(obj);
         } else {
            RecruitRecord other = (RecruitRecord)obj;
            if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasAwardId() != other.hasAwardId()) {
               return false;
            } else if (this.hasAwardId() && this.getAwardId() != other.getAwardId()) {
               return false;
            } else if (this.hasRecruitType() != other.hasRecruitType()) {
               return false;
            } else if (this.hasRecruitType() && this.getRecruitType() != other.getRecruitType()) {
               return false;
            } else if (this.hasBroadcast() != other.hasBroadcast()) {
               return false;
            } else if (this.hasBroadcast() && this.getBroadcast() != other.getBroadcast()) {
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
            if (this.hasServerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasAwardId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getAwardId();
            }

            if (this.hasRecruitType()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getRecruitType();
            }

            if (this.hasBroadcast()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashBoolean(this.getBroadcast());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RecruitRecord parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RecruitRecord)PARSER.parseFrom(data);
      }

      public static RecruitRecord parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecruitRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecruitRecord parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RecruitRecord)PARSER.parseFrom(data);
      }

      public static RecruitRecord parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecruitRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecruitRecord parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RecruitRecord)PARSER.parseFrom(data);
      }

      public static RecruitRecord parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecruitRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecruitRecord parseFrom(InputStream input) throws IOException {
         return (RecruitRecord)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RecruitRecord parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecruitRecord)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RecruitRecord parseDelimitedFrom(InputStream input) throws IOException {
         return (RecruitRecord)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RecruitRecord parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecruitRecord)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RecruitRecord parseFrom(CodedInputStream input) throws IOException {
         return (RecruitRecord)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RecruitRecord parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecruitRecord)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RecruitRecord prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RecruitRecord getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RecruitRecord> parser() {
         return PARSER;
      }

      public Parser<RecruitRecord> getParserForType() {
         return PARSER;
      }

      public RecruitRecord getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RecruitRecordOrBuilder {
         private int bitField0_;
         private int serverId_;
         private int playerId_;
         private Object playerName_;
         private int awardId_;
         private int recruitType_;
         private boolean broadcast_;

         public static final Descriptors.Descriptor getDescriptor() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_RecruitRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_RecruitRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(RecruitRecord.class, Builder.class);
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
            if (QianKunLotteryMsg.RecruitRecord.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.serverId_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.playerName_ = "";
            this.bitField0_ &= -5;
            this.awardId_ = 0;
            this.bitField0_ &= -9;
            this.recruitType_ = 0;
            this.bitField0_ &= -17;
            this.broadcast_ = false;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_RecruitRecord_descriptor;
         }

         public RecruitRecord getDefaultInstanceForType() {
            return QianKunLotteryMsg.RecruitRecord.getDefaultInstance();
         }

         public RecruitRecord build() {
            RecruitRecord result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RecruitRecord buildPartial() {
            RecruitRecord result = new RecruitRecord(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.serverId_ = this.serverId_;
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
               result.awardId_ = this.awardId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.recruitType_ = this.recruitType_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.broadcast_ = this.broadcast_;
               to_bitField0_ |= 32;
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
            if (other instanceof RecruitRecord) {
               return this.mergeFrom((RecruitRecord)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RecruitRecord other) {
            if (other == QianKunLotteryMsg.RecruitRecord.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 4;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasAwardId()) {
                  this.setAwardId(other.getAwardId());
               }

               if (other.hasRecruitType()) {
                  this.setRecruitType(other.getRecruitType());
               }

               if (other.hasBroadcast()) {
                  this.setBroadcast(other.getBroadcast());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasServerId()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasAwardId()) {
               return false;
            } else if (!this.hasRecruitType()) {
               return false;
            } else {
               return this.hasBroadcast();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RecruitRecord parsedMessage = null;

            try {
               parsedMessage = (RecruitRecord)QianKunLotteryMsg.RecruitRecord.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RecruitRecord)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 1;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -2;
            this.serverId_ = 0;
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
            this.playerName_ = QianKunLotteryMsg.RecruitRecord.getDefaultInstance().getPlayerName();
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

         public boolean hasAwardId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getAwardId() {
            return this.awardId_;
         }

         public Builder setAwardId(int value) {
            this.bitField0_ |= 8;
            this.awardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAwardId() {
            this.bitField0_ &= -9;
            this.awardId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRecruitType() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getRecruitType() {
            return this.recruitType_;
         }

         public Builder setRecruitType(int value) {
            this.bitField0_ |= 16;
            this.recruitType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecruitType() {
            this.bitField0_ &= -17;
            this.recruitType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBroadcast() {
            return (this.bitField0_ & 32) != 0;
         }

         public boolean getBroadcast() {
            return this.broadcast_;
         }

         public Builder setBroadcast(boolean value) {
            this.bitField0_ |= 32;
            this.broadcast_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBroadcast() {
            this.bitField0_ &= -33;
            this.broadcast_ = false;
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

   public static final class C2S_RecruitQianKunLottery_19803 extends GeneratedMessageV3 implements C2S_RecruitQianKunLottery_19803OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECRUITTYPE_FIELD_NUMBER = 1;
      private int recruitType_;
      public static final int RECRUITNUM_FIELD_NUMBER = 2;
      private int recruitNum_;
      public static final int STAGE_FIELD_NUMBER = 3;
      private int stage_;
      private byte memoizedIsInitialized;
      private static final C2S_RecruitQianKunLottery_19803 DEFAULT_INSTANCE = new C2S_RecruitQianKunLottery_19803();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecruitQianKunLottery_19803> PARSER = new AbstractParser<C2S_RecruitQianKunLottery_19803>() {
         public C2S_RecruitQianKunLottery_19803 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecruitQianKunLottery_19803(input, extensionRegistry);
         }
      };

      private C2S_RecruitQianKunLottery_19803(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecruitQianKunLottery_19803() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecruitQianKunLottery_19803();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecruitQianKunLottery_19803(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.recruitType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.recruitNum_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.stage_ = input.readInt32();
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
         return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_C2S_RecruitQianKunLottery_19803_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_C2S_RecruitQianKunLottery_19803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecruitQianKunLottery_19803.class, Builder.class);
      }

      public boolean hasRecruitType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRecruitType() {
         return this.recruitType_;
      }

      public boolean hasRecruitNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRecruitNum() {
         return this.recruitNum_;
      }

      public boolean hasStage() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRecruitType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecruitNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.recruitType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.recruitNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.stage_);
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
               size += CodedOutputStream.computeInt32Size(1, this.recruitType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.recruitNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.stage_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RecruitQianKunLottery_19803)) {
            return super.equals(obj);
         } else {
            C2S_RecruitQianKunLottery_19803 other = (C2S_RecruitQianKunLottery_19803)obj;
            if (this.hasRecruitType() != other.hasRecruitType()) {
               return false;
            } else if (this.hasRecruitType() && this.getRecruitType() != other.getRecruitType()) {
               return false;
            } else if (this.hasRecruitNum() != other.hasRecruitNum()) {
               return false;
            } else if (this.hasRecruitNum() && this.getRecruitNum() != other.getRecruitNum()) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
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
            if (this.hasRecruitType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecruitType();
            }

            if (this.hasRecruitNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRecruitNum();
            }

            if (this.hasStage()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStage();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RecruitQianKunLottery_19803 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecruitQianKunLottery_19803)PARSER.parseFrom(data);
      }

      public static C2S_RecruitQianKunLottery_19803 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitQianKunLottery_19803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitQianKunLottery_19803 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecruitQianKunLottery_19803)PARSER.parseFrom(data);
      }

      public static C2S_RecruitQianKunLottery_19803 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitQianKunLottery_19803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitQianKunLottery_19803 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecruitQianKunLottery_19803)PARSER.parseFrom(data);
      }

      public static C2S_RecruitQianKunLottery_19803 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitQianKunLottery_19803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitQianKunLottery_19803 parseFrom(InputStream input) throws IOException {
         return (C2S_RecruitQianKunLottery_19803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecruitQianKunLottery_19803 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitQianKunLottery_19803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecruitQianKunLottery_19803 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecruitQianKunLottery_19803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecruitQianKunLottery_19803 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitQianKunLottery_19803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecruitQianKunLottery_19803 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecruitQianKunLottery_19803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecruitQianKunLottery_19803 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitQianKunLottery_19803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecruitQianKunLottery_19803 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecruitQianKunLottery_19803 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecruitQianKunLottery_19803> parser() {
         return PARSER;
      }

      public Parser<C2S_RecruitQianKunLottery_19803> getParserForType() {
         return PARSER;
      }

      public C2S_RecruitQianKunLottery_19803 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecruitQianKunLottery_19803OrBuilder {
         private int bitField0_;
         private int recruitType_;
         private int recruitNum_;
         private int stage_;

         public static final Descriptors.Descriptor getDescriptor() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_C2S_RecruitQianKunLottery_19803_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_C2S_RecruitQianKunLottery_19803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecruitQianKunLottery_19803.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (QianKunLotteryMsg.C2S_RecruitQianKunLottery_19803.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.recruitType_ = 0;
            this.bitField0_ &= -2;
            this.recruitNum_ = 0;
            this.bitField0_ &= -3;
            this.stage_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_C2S_RecruitQianKunLottery_19803_descriptor;
         }

         public C2S_RecruitQianKunLottery_19803 getDefaultInstanceForType() {
            return QianKunLotteryMsg.C2S_RecruitQianKunLottery_19803.getDefaultInstance();
         }

         public C2S_RecruitQianKunLottery_19803 build() {
            C2S_RecruitQianKunLottery_19803 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecruitQianKunLottery_19803 buildPartial() {
            C2S_RecruitQianKunLottery_19803 result = new C2S_RecruitQianKunLottery_19803(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.recruitType_ = this.recruitType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.recruitNum_ = this.recruitNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.stage_ = this.stage_;
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
            if (other instanceof C2S_RecruitQianKunLottery_19803) {
               return this.mergeFrom((C2S_RecruitQianKunLottery_19803)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecruitQianKunLottery_19803 other) {
            if (other == QianKunLotteryMsg.C2S_RecruitQianKunLottery_19803.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRecruitType()) {
                  this.setRecruitType(other.getRecruitType());
               }

               if (other.hasRecruitNum()) {
                  this.setRecruitNum(other.getRecruitNum());
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRecruitType()) {
               return false;
            } else if (!this.hasRecruitNum()) {
               return false;
            } else {
               return this.hasStage();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RecruitQianKunLottery_19803 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecruitQianKunLottery_19803)QianKunLotteryMsg.C2S_RecruitQianKunLottery_19803.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecruitQianKunLottery_19803)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRecruitType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRecruitType() {
            return this.recruitType_;
         }

         public Builder setRecruitType(int value) {
            this.bitField0_ |= 1;
            this.recruitType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecruitType() {
            this.bitField0_ &= -2;
            this.recruitType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRecruitNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRecruitNum() {
            return this.recruitNum_;
         }

         public Builder setRecruitNum(int value) {
            this.bitField0_ |= 2;
            this.recruitNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecruitNum() {
            this.bitField0_ &= -3;
            this.recruitNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 4;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -5;
            this.stage_ = 0;
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

   public static final class S2C_RecruitQianKunLottery_19804 extends GeneratedMessageV3 implements S2C_RecruitQianKunLottery_19804OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULTLIST_FIELD_NUMBER = 1;
      private Internal.IntList resultList_;
      public static final int STAGE_FIELD_NUMBER = 2;
      private int stage_;
      public static final int COMMONDRAWNUM_FIELD_NUMBER = 7;
      private int commonDrawNum_;
      public static final int HIGHDRAWNUM_FIELD_NUMBER = 8;
      private int highDrawNum_;
      public static final int FREERECRUIT_FIELD_NUMBER = 11;
      private int freeRecruit_;
      private byte memoizedIsInitialized;
      private static final S2C_RecruitQianKunLottery_19804 DEFAULT_INSTANCE = new S2C_RecruitQianKunLottery_19804();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecruitQianKunLottery_19804> PARSER = new AbstractParser<S2C_RecruitQianKunLottery_19804>() {
         public S2C_RecruitQianKunLottery_19804 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecruitQianKunLottery_19804(input, extensionRegistry);
         }
      };

      private S2C_RecruitQianKunLottery_19804(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecruitQianKunLottery_19804() {
         this.memoizedIsInitialized = -1;
         this.resultList_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecruitQianKunLottery_19804();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecruitQianKunLottery_19804(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.resultList_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.resultList_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.resultList_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.stage_ = input.readInt32();
                        continue;
                     case 56:
                        this.bitField0_ |= 2;
                        this.commonDrawNum_ = input.readInt32();
                        continue;
                     case 64:
                        this.bitField0_ |= 4;
                        this.highDrawNum_ = input.readInt32();
                        continue;
                     case 88:
                        this.bitField0_ |= 8;
                        this.freeRecruit_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.resultList_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.resultList_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitQianKunLottery_19804_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitQianKunLottery_19804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitQianKunLottery_19804.class, Builder.class);
      }

      public List<Integer> getResultListList() {
         return this.resultList_;
      }

      public int getResultListCount() {
         return this.resultList_.size();
      }

      public int getResultList(int index) {
         return this.resultList_.getInt(index);
      }

      public boolean hasStage() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public boolean hasCommonDrawNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCommonDrawNum() {
         return this.commonDrawNum_;
      }

      public boolean hasHighDrawNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHighDrawNum() {
         return this.highDrawNum_;
      }

      public boolean hasFreeRecruit() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getFreeRecruit() {
         return this.freeRecruit_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFreeRecruit()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.resultList_.size(); ++i) {
            output.writeInt32(1, this.resultList_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.stage_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(7, this.commonDrawNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(8, this.highDrawNum_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(11, this.freeRecruit_);
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

            for(int i = 0; i < this.resultList_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.resultList_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getResultListList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.stage_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.commonDrawNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.highDrawNum_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.freeRecruit_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RecruitQianKunLottery_19804)) {
            return super.equals(obj);
         } else {
            S2C_RecruitQianKunLottery_19804 other = (S2C_RecruitQianKunLottery_19804)obj;
            if (!this.getResultListList().equals(other.getResultListList())) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else if (this.hasCommonDrawNum() != other.hasCommonDrawNum()) {
               return false;
            } else if (this.hasCommonDrawNum() && this.getCommonDrawNum() != other.getCommonDrawNum()) {
               return false;
            } else if (this.hasHighDrawNum() != other.hasHighDrawNum()) {
               return false;
            } else if (this.hasHighDrawNum() && this.getHighDrawNum() != other.getHighDrawNum()) {
               return false;
            } else if (this.hasFreeRecruit() != other.hasFreeRecruit()) {
               return false;
            } else if (this.hasFreeRecruit() && this.getFreeRecruit() != other.getFreeRecruit()) {
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
            if (this.getResultListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResultListList().hashCode();
            }

            if (this.hasStage()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStage();
            }

            if (this.hasCommonDrawNum()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getCommonDrawNum();
            }

            if (this.hasHighDrawNum()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getHighDrawNum();
            }

            if (this.hasFreeRecruit()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getFreeRecruit();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RecruitQianKunLottery_19804 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecruitQianKunLottery_19804)PARSER.parseFrom(data);
      }

      public static S2C_RecruitQianKunLottery_19804 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitQianKunLottery_19804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitQianKunLottery_19804 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecruitQianKunLottery_19804)PARSER.parseFrom(data);
      }

      public static S2C_RecruitQianKunLottery_19804 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitQianKunLottery_19804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitQianKunLottery_19804 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecruitQianKunLottery_19804)PARSER.parseFrom(data);
      }

      public static S2C_RecruitQianKunLottery_19804 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitQianKunLottery_19804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitQianKunLottery_19804 parseFrom(InputStream input) throws IOException {
         return (S2C_RecruitQianKunLottery_19804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitQianKunLottery_19804 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitQianKunLottery_19804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitQianKunLottery_19804 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecruitQianKunLottery_19804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecruitQianKunLottery_19804 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitQianKunLottery_19804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitQianKunLottery_19804 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecruitQianKunLottery_19804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitQianKunLottery_19804 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitQianKunLottery_19804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecruitQianKunLottery_19804 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecruitQianKunLottery_19804 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecruitQianKunLottery_19804> parser() {
         return PARSER;
      }

      public Parser<S2C_RecruitQianKunLottery_19804> getParserForType() {
         return PARSER;
      }

      public S2C_RecruitQianKunLottery_19804 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecruitQianKunLottery_19804OrBuilder {
         private int bitField0_;
         private Internal.IntList resultList_;
         private int stage_;
         private int commonDrawNum_;
         private int highDrawNum_;
         private int freeRecruit_;

         public static final Descriptors.Descriptor getDescriptor() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitQianKunLottery_19804_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitQianKunLottery_19804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitQianKunLottery_19804.class, Builder.class);
         }

         private Builder() {
            this.resultList_ = QianKunLotteryMsg.S2C_RecruitQianKunLottery_19804.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.resultList_ = QianKunLotteryMsg.S2C_RecruitQianKunLottery_19804.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (QianKunLotteryMsg.S2C_RecruitQianKunLottery_19804.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.resultList_ = QianKunLotteryMsg.S2C_RecruitQianKunLottery_19804.emptyIntList();
            this.bitField0_ &= -2;
            this.stage_ = 0;
            this.bitField0_ &= -3;
            this.commonDrawNum_ = 0;
            this.bitField0_ &= -5;
            this.highDrawNum_ = 0;
            this.bitField0_ &= -9;
            this.freeRecruit_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitQianKunLottery_19804_descriptor;
         }

         public S2C_RecruitQianKunLottery_19804 getDefaultInstanceForType() {
            return QianKunLotteryMsg.S2C_RecruitQianKunLottery_19804.getDefaultInstance();
         }

         public S2C_RecruitQianKunLottery_19804 build() {
            S2C_RecruitQianKunLottery_19804 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecruitQianKunLottery_19804 buildPartial() {
            S2C_RecruitQianKunLottery_19804 result = new S2C_RecruitQianKunLottery_19804(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.resultList_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.resultList_ = this.resultList_;
            if ((from_bitField0_ & 2) != 0) {
               result.stage_ = this.stage_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.commonDrawNum_ = this.commonDrawNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.highDrawNum_ = this.highDrawNum_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.freeRecruit_ = this.freeRecruit_;
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
            if (other instanceof S2C_RecruitQianKunLottery_19804) {
               return this.mergeFrom((S2C_RecruitQianKunLottery_19804)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecruitQianKunLottery_19804 other) {
            if (other == QianKunLotteryMsg.S2C_RecruitQianKunLottery_19804.getDefaultInstance()) {
               return this;
            } else {
               if (!other.resultList_.isEmpty()) {
                  if (this.resultList_.isEmpty()) {
                     this.resultList_ = other.resultList_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureResultListIsMutable();
                     this.resultList_.addAll(other.resultList_);
                  }

                  this.onChanged();
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               if (other.hasCommonDrawNum()) {
                  this.setCommonDrawNum(other.getCommonDrawNum());
               }

               if (other.hasHighDrawNum()) {
                  this.setHighDrawNum(other.getHighDrawNum());
               }

               if (other.hasFreeRecruit()) {
                  this.setFreeRecruit(other.getFreeRecruit());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStage()) {
               return false;
            } else {
               return this.hasFreeRecruit();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RecruitQianKunLottery_19804 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecruitQianKunLottery_19804)QianKunLotteryMsg.S2C_RecruitQianKunLottery_19804.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecruitQianKunLottery_19804)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureResultListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.resultList_ = QianKunLotteryMsg.S2C_RecruitQianKunLottery_19804.mutableCopy(this.resultList_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getResultListList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.resultList_) : this.resultList_);
         }

         public int getResultListCount() {
            return this.resultList_.size();
         }

         public int getResultList(int index) {
            return this.resultList_.getInt(index);
         }

         public Builder setResultList(int index, int value) {
            this.ensureResultListIsMutable();
            this.resultList_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addResultList(int value) {
            this.ensureResultListIsMutable();
            this.resultList_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllResultList(Iterable<? extends Integer> values) {
            this.ensureResultListIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.resultList_);
            this.onChanged();
            return this;
         }

         public Builder clearResultList() {
            this.resultList_ = QianKunLotteryMsg.S2C_RecruitQianKunLottery_19804.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 2;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -3;
            this.stage_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCommonDrawNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getCommonDrawNum() {
            return this.commonDrawNum_;
         }

         public Builder setCommonDrawNum(int value) {
            this.bitField0_ |= 4;
            this.commonDrawNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCommonDrawNum() {
            this.bitField0_ &= -5;
            this.commonDrawNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHighDrawNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getHighDrawNum() {
            return this.highDrawNum_;
         }

         public Builder setHighDrawNum(int value) {
            this.bitField0_ |= 8;
            this.highDrawNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHighDrawNum() {
            this.bitField0_ &= -9;
            this.highDrawNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFreeRecruit() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getFreeRecruit() {
            return this.freeRecruit_;
         }

         public Builder setFreeRecruit(int value) {
            this.bitField0_ |= 16;
            this.freeRecruit_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFreeRecruit() {
            this.bitField0_ &= -17;
            this.freeRecruit_ = 0;
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

   public static final class S2C_RecruitRecordInfo_19805 extends GeneratedMessageV3 implements S2C_RecruitRecordInfo_19805OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ALLRECORD_FIELD_NUMBER = 2;
      private List<RecruitRecord> allRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_RecruitRecordInfo_19805 DEFAULT_INSTANCE = new S2C_RecruitRecordInfo_19805();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecruitRecordInfo_19805> PARSER = new AbstractParser<S2C_RecruitRecordInfo_19805>() {
         public S2C_RecruitRecordInfo_19805 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecruitRecordInfo_19805(input, extensionRegistry);
         }
      };

      private S2C_RecruitRecordInfo_19805(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecruitRecordInfo_19805() {
         this.memoizedIsInitialized = -1;
         this.allRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecruitRecordInfo_19805();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecruitRecordInfo_19805(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.allRecord_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.allRecord_.add(input.readMessage(QianKunLotteryMsg.RecruitRecord.PARSER, extensionRegistry));
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
                  this.allRecord_ = Collections.unmodifiableList(this.allRecord_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitRecordInfo_19805_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitRecordInfo_19805_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitRecordInfo_19805.class, Builder.class);
      }

      public List<RecruitRecord> getAllRecordList() {
         return this.allRecord_;
      }

      public List<? extends RecruitRecordOrBuilder> getAllRecordOrBuilderList() {
         return this.allRecord_;
      }

      public int getAllRecordCount() {
         return this.allRecord_.size();
      }

      public RecruitRecord getAllRecord(int index) {
         return (RecruitRecord)this.allRecord_.get(index);
      }

      public RecruitRecordOrBuilder getAllRecordOrBuilder(int index) {
         return (RecruitRecordOrBuilder)this.allRecord_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getAllRecordCount(); ++i) {
               if (!this.getAllRecord(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.allRecord_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.allRecord_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.allRecord_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.allRecord_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RecruitRecordInfo_19805)) {
            return super.equals(obj);
         } else {
            S2C_RecruitRecordInfo_19805 other = (S2C_RecruitRecordInfo_19805)obj;
            if (!this.getAllRecordList().equals(other.getAllRecordList())) {
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
            if (this.getAllRecordCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAllRecordList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RecruitRecordInfo_19805 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecruitRecordInfo_19805)PARSER.parseFrom(data);
      }

      public static S2C_RecruitRecordInfo_19805 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitRecordInfo_19805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitRecordInfo_19805 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecruitRecordInfo_19805)PARSER.parseFrom(data);
      }

      public static S2C_RecruitRecordInfo_19805 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitRecordInfo_19805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitRecordInfo_19805 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecruitRecordInfo_19805)PARSER.parseFrom(data);
      }

      public static S2C_RecruitRecordInfo_19805 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitRecordInfo_19805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitRecordInfo_19805 parseFrom(InputStream input) throws IOException {
         return (S2C_RecruitRecordInfo_19805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitRecordInfo_19805 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitRecordInfo_19805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitRecordInfo_19805 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecruitRecordInfo_19805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecruitRecordInfo_19805 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitRecordInfo_19805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitRecordInfo_19805 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecruitRecordInfo_19805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitRecordInfo_19805 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitRecordInfo_19805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecruitRecordInfo_19805 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecruitRecordInfo_19805 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecruitRecordInfo_19805> parser() {
         return PARSER;
      }

      public Parser<S2C_RecruitRecordInfo_19805> getParserForType() {
         return PARSER;
      }

      public S2C_RecruitRecordInfo_19805 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecruitRecordInfo_19805OrBuilder {
         private int bitField0_;
         private List<RecruitRecord> allRecord_;
         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> allRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitRecordInfo_19805_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitRecordInfo_19805_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitRecordInfo_19805.class, Builder.class);
         }

         private Builder() {
            this.allRecord_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.allRecord_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (QianKunLotteryMsg.S2C_RecruitRecordInfo_19805.alwaysUseFieldBuilders) {
               this.getAllRecordFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.allRecordBuilder_ == null) {
               this.allRecord_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.allRecordBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitRecordInfo_19805_descriptor;
         }

         public S2C_RecruitRecordInfo_19805 getDefaultInstanceForType() {
            return QianKunLotteryMsg.S2C_RecruitRecordInfo_19805.getDefaultInstance();
         }

         public S2C_RecruitRecordInfo_19805 build() {
            S2C_RecruitRecordInfo_19805 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecruitRecordInfo_19805 buildPartial() {
            S2C_RecruitRecordInfo_19805 result = new S2C_RecruitRecordInfo_19805(this);
            int from_bitField0_ = this.bitField0_;
            if (this.allRecordBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.allRecord_ = Collections.unmodifiableList(this.allRecord_);
                  this.bitField0_ &= -2;
               }

               result.allRecord_ = this.allRecord_;
            } else {
               result.allRecord_ = this.allRecordBuilder_.build();
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
            if (other instanceof S2C_RecruitRecordInfo_19805) {
               return this.mergeFrom((S2C_RecruitRecordInfo_19805)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecruitRecordInfo_19805 other) {
            if (other == QianKunLotteryMsg.S2C_RecruitRecordInfo_19805.getDefaultInstance()) {
               return this;
            } else {
               if (this.allRecordBuilder_ == null) {
                  if (!other.allRecord_.isEmpty()) {
                     if (this.allRecord_.isEmpty()) {
                        this.allRecord_ = other.allRecord_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureAllRecordIsMutable();
                        this.allRecord_.addAll(other.allRecord_);
                     }

                     this.onChanged();
                  }
               } else if (!other.allRecord_.isEmpty()) {
                  if (this.allRecordBuilder_.isEmpty()) {
                     this.allRecordBuilder_.dispose();
                     this.allRecordBuilder_ = null;
                     this.allRecord_ = other.allRecord_;
                     this.bitField0_ &= -2;
                     this.allRecordBuilder_ = QianKunLotteryMsg.S2C_RecruitRecordInfo_19805.alwaysUseFieldBuilders ? this.getAllRecordFieldBuilder() : null;
                  } else {
                     this.allRecordBuilder_.addAllMessages(other.allRecord_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getAllRecordCount(); ++i) {
               if (!this.getAllRecord(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RecruitRecordInfo_19805 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecruitRecordInfo_19805)QianKunLotteryMsg.S2C_RecruitRecordInfo_19805.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecruitRecordInfo_19805)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureAllRecordIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.allRecord_ = new ArrayList(this.allRecord_);
               this.bitField0_ |= 1;
            }

         }

         public List<RecruitRecord> getAllRecordList() {
            return this.allRecordBuilder_ == null ? Collections.unmodifiableList(this.allRecord_) : this.allRecordBuilder_.getMessageList();
         }

         public int getAllRecordCount() {
            return this.allRecordBuilder_ == null ? this.allRecord_.size() : this.allRecordBuilder_.getCount();
         }

         public RecruitRecord getAllRecord(int index) {
            return this.allRecordBuilder_ == null ? (RecruitRecord)this.allRecord_.get(index) : (RecruitRecord)this.allRecordBuilder_.getMessage(index);
         }

         public Builder setAllRecord(int index, RecruitRecord value) {
            if (this.allRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAllRecordIsMutable();
               this.allRecord_.set(index, value);
               this.onChanged();
            } else {
               this.allRecordBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAllRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.allRecordBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecord(RecruitRecord value) {
            if (this.allRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAllRecordIsMutable();
               this.allRecord_.add(value);
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAllRecord(int index, RecruitRecord value) {
            if (this.allRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAllRecordIsMutable();
               this.allRecord_.add(index, value);
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAllRecord(RecruitRecord.Builder builderForValue) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAllRecord(Iterable<? extends RecruitRecord> values) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.allRecord_);
               this.onChanged();
            } else {
               this.allRecordBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAllRecord() {
            if (this.allRecordBuilder_ == null) {
               this.allRecord_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.allRecordBuilder_.clear();
            }

            return this;
         }

         public Builder removeAllRecord(int index) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.remove(index);
               this.onChanged();
            } else {
               this.allRecordBuilder_.remove(index);
            }

            return this;
         }

         public RecruitRecord.Builder getAllRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getAllRecordFieldBuilder().getBuilder(index);
         }

         public RecruitRecordOrBuilder getAllRecordOrBuilder(int index) {
            return this.allRecordBuilder_ == null ? (RecruitRecordOrBuilder)this.allRecord_.get(index) : (RecruitRecordOrBuilder)this.allRecordBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RecruitRecordOrBuilder> getAllRecordOrBuilderList() {
            return this.allRecordBuilder_ != null ? this.allRecordBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.allRecord_);
         }

         public RecruitRecord.Builder addAllRecordBuilder() {
            return (RecruitRecord.Builder)this.getAllRecordFieldBuilder().addBuilder(QianKunLotteryMsg.RecruitRecord.getDefaultInstance());
         }

         public RecruitRecord.Builder addAllRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getAllRecordFieldBuilder().addBuilder(index, QianKunLotteryMsg.RecruitRecord.getDefaultInstance());
         }

         public List<RecruitRecord.Builder> getAllRecordBuilderList() {
            return this.getAllRecordFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> getAllRecordFieldBuilder() {
            if (this.allRecordBuilder_ == null) {
               this.allRecordBuilder_ = new RepeatedFieldBuilderV3(this.allRecord_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.allRecord_ = null;
            }

            return this.allRecordBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_RecruitResult_19806 extends GeneratedMessageV3 implements C2S_RecruitResult_19806OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_RecruitResult_19806 DEFAULT_INSTANCE = new C2S_RecruitResult_19806();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecruitResult_19806> PARSER = new AbstractParser<C2S_RecruitResult_19806>() {
         public C2S_RecruitResult_19806 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecruitResult_19806(input, extensionRegistry);
         }
      };

      private C2S_RecruitResult_19806(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecruitResult_19806() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecruitResult_19806();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecruitResult_19806(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_C2S_RecruitResult_19806_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_C2S_RecruitResult_19806_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecruitResult_19806.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RecruitResult_19806)) {
            return super.equals(obj);
         } else {
            C2S_RecruitResult_19806 other = (C2S_RecruitResult_19806)obj;
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

      public static C2S_RecruitResult_19806 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecruitResult_19806)PARSER.parseFrom(data);
      }

      public static C2S_RecruitResult_19806 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitResult_19806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitResult_19806 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecruitResult_19806)PARSER.parseFrom(data);
      }

      public static C2S_RecruitResult_19806 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitResult_19806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitResult_19806 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecruitResult_19806)PARSER.parseFrom(data);
      }

      public static C2S_RecruitResult_19806 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitResult_19806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitResult_19806 parseFrom(InputStream input) throws IOException {
         return (C2S_RecruitResult_19806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecruitResult_19806 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitResult_19806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecruitResult_19806 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecruitResult_19806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecruitResult_19806 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitResult_19806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecruitResult_19806 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecruitResult_19806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecruitResult_19806 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitResult_19806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecruitResult_19806 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecruitResult_19806 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecruitResult_19806> parser() {
         return PARSER;
      }

      public Parser<C2S_RecruitResult_19806> getParserForType() {
         return PARSER;
      }

      public C2S_RecruitResult_19806 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecruitResult_19806OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_C2S_RecruitResult_19806_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_C2S_RecruitResult_19806_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecruitResult_19806.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (QianKunLotteryMsg.C2S_RecruitResult_19806.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_C2S_RecruitResult_19806_descriptor;
         }

         public C2S_RecruitResult_19806 getDefaultInstanceForType() {
            return QianKunLotteryMsg.C2S_RecruitResult_19806.getDefaultInstance();
         }

         public C2S_RecruitResult_19806 build() {
            C2S_RecruitResult_19806 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecruitResult_19806 buildPartial() {
            C2S_RecruitResult_19806 result = new C2S_RecruitResult_19806(this);
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
            if (other instanceof C2S_RecruitResult_19806) {
               return this.mergeFrom((C2S_RecruitResult_19806)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecruitResult_19806 other) {
            if (other == QianKunLotteryMsg.C2S_RecruitResult_19806.getDefaultInstance()) {
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
            C2S_RecruitResult_19806 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecruitResult_19806)QianKunLotteryMsg.C2S_RecruitResult_19806.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecruitResult_19806)e.getUnfinishedMessage();
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

   public static final class S2C_RecruitResult_19807 extends GeneratedMessageV3 implements S2C_RecruitResult_19807OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MYRECORD_FIELD_NUMBER = 1;
      private List<RecruitRecord> myRecord_;
      public static final int AWARDLIST_FIELD_NUMBER = 2;
      private List<CommonMsg.MapDataII> awardList_;
      private byte memoizedIsInitialized;
      private static final S2C_RecruitResult_19807 DEFAULT_INSTANCE = new S2C_RecruitResult_19807();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecruitResult_19807> PARSER = new AbstractParser<S2C_RecruitResult_19807>() {
         public S2C_RecruitResult_19807 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecruitResult_19807(input, extensionRegistry);
         }
      };

      private S2C_RecruitResult_19807(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecruitResult_19807() {
         this.memoizedIsInitialized = -1;
         this.myRecord_ = Collections.emptyList();
         this.awardList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecruitResult_19807();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecruitResult_19807(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.myRecord_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.myRecord_.add(input.readMessage(QianKunLotteryMsg.RecruitRecord.PARSER, extensionRegistry));
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.awardList_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.awardList_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
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
                  this.myRecord_ = Collections.unmodifiableList(this.myRecord_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.awardList_ = Collections.unmodifiableList(this.awardList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitResult_19807_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitResult_19807_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitResult_19807.class, Builder.class);
      }

      public List<RecruitRecord> getMyRecordList() {
         return this.myRecord_;
      }

      public List<? extends RecruitRecordOrBuilder> getMyRecordOrBuilderList() {
         return this.myRecord_;
      }

      public int getMyRecordCount() {
         return this.myRecord_.size();
      }

      public RecruitRecord getMyRecord(int index) {
         return (RecruitRecord)this.myRecord_.get(index);
      }

      public RecruitRecordOrBuilder getMyRecordOrBuilder(int index) {
         return (RecruitRecordOrBuilder)this.myRecord_.get(index);
      }

      public List<CommonMsg.MapDataII> getAwardListList() {
         return this.awardList_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getAwardListOrBuilderList() {
         return this.awardList_;
      }

      public int getAwardListCount() {
         return this.awardList_.size();
      }

      public CommonMsg.MapDataII getAwardList(int index) {
         return (CommonMsg.MapDataII)this.awardList_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getAwardListOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.awardList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getMyRecordCount(); ++i) {
               if (!this.getMyRecord(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getAwardListCount(); ++i) {
               if (!this.getAwardList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.myRecord_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.myRecord_.get(i));
         }

         for(int i = 0; i < this.awardList_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.awardList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.myRecord_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.myRecord_.get(i));
            }

            for(int i = 0; i < this.awardList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.awardList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RecruitResult_19807)) {
            return super.equals(obj);
         } else {
            S2C_RecruitResult_19807 other = (S2C_RecruitResult_19807)obj;
            if (!this.getMyRecordList().equals(other.getMyRecordList())) {
               return false;
            } else if (!this.getAwardListList().equals(other.getAwardListList())) {
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
            if (this.getMyRecordCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMyRecordList().hashCode();
            }

            if (this.getAwardListCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAwardListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RecruitResult_19807 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_19807)PARSER.parseFrom(data);
      }

      public static S2C_RecruitResult_19807 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_19807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitResult_19807 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_19807)PARSER.parseFrom(data);
      }

      public static S2C_RecruitResult_19807 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_19807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitResult_19807 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_19807)PARSER.parseFrom(data);
      }

      public static S2C_RecruitResult_19807 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitResult_19807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitResult_19807 parseFrom(InputStream input) throws IOException {
         return (S2C_RecruitResult_19807)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitResult_19807 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitResult_19807)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitResult_19807 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecruitResult_19807)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecruitResult_19807 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitResult_19807)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitResult_19807 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecruitResult_19807)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitResult_19807 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitResult_19807)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecruitResult_19807 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecruitResult_19807 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecruitResult_19807> parser() {
         return PARSER;
      }

      public Parser<S2C_RecruitResult_19807> getParserForType() {
         return PARSER;
      }

      public S2C_RecruitResult_19807 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecruitResult_19807OrBuilder {
         private int bitField0_;
         private List<RecruitRecord> myRecord_;
         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> myRecordBuilder_;
         private List<CommonMsg.MapDataII> awardList_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> awardListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitResult_19807_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitResult_19807_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitResult_19807.class, Builder.class);
         }

         private Builder() {
            this.myRecord_ = Collections.emptyList();
            this.awardList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.myRecord_ = Collections.emptyList();
            this.awardList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (QianKunLotteryMsg.S2C_RecruitResult_19807.alwaysUseFieldBuilders) {
               this.getMyRecordFieldBuilder();
               this.getAwardListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.myRecordBuilder_ == null) {
               this.myRecord_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.myRecordBuilder_.clear();
            }

            if (this.awardListBuilder_ == null) {
               this.awardList_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.awardListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2C_RecruitResult_19807_descriptor;
         }

         public S2C_RecruitResult_19807 getDefaultInstanceForType() {
            return QianKunLotteryMsg.S2C_RecruitResult_19807.getDefaultInstance();
         }

         public S2C_RecruitResult_19807 build() {
            S2C_RecruitResult_19807 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecruitResult_19807 buildPartial() {
            S2C_RecruitResult_19807 result = new S2C_RecruitResult_19807(this);
            int from_bitField0_ = this.bitField0_;
            if (this.myRecordBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.myRecord_ = Collections.unmodifiableList(this.myRecord_);
                  this.bitField0_ &= -2;
               }

               result.myRecord_ = this.myRecord_;
            } else {
               result.myRecord_ = this.myRecordBuilder_.build();
            }

            if (this.awardListBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.awardList_ = Collections.unmodifiableList(this.awardList_);
                  this.bitField0_ &= -3;
               }

               result.awardList_ = this.awardList_;
            } else {
               result.awardList_ = this.awardListBuilder_.build();
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
            if (other instanceof S2C_RecruitResult_19807) {
               return this.mergeFrom((S2C_RecruitResult_19807)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecruitResult_19807 other) {
            if (other == QianKunLotteryMsg.S2C_RecruitResult_19807.getDefaultInstance()) {
               return this;
            } else {
               if (this.myRecordBuilder_ == null) {
                  if (!other.myRecord_.isEmpty()) {
                     if (this.myRecord_.isEmpty()) {
                        this.myRecord_ = other.myRecord_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureMyRecordIsMutable();
                        this.myRecord_.addAll(other.myRecord_);
                     }

                     this.onChanged();
                  }
               } else if (!other.myRecord_.isEmpty()) {
                  if (this.myRecordBuilder_.isEmpty()) {
                     this.myRecordBuilder_.dispose();
                     this.myRecordBuilder_ = null;
                     this.myRecord_ = other.myRecord_;
                     this.bitField0_ &= -2;
                     this.myRecordBuilder_ = QianKunLotteryMsg.S2C_RecruitResult_19807.alwaysUseFieldBuilders ? this.getMyRecordFieldBuilder() : null;
                  } else {
                     this.myRecordBuilder_.addAllMessages(other.myRecord_);
                  }
               }

               if (this.awardListBuilder_ == null) {
                  if (!other.awardList_.isEmpty()) {
                     if (this.awardList_.isEmpty()) {
                        this.awardList_ = other.awardList_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureAwardListIsMutable();
                        this.awardList_.addAll(other.awardList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.awardList_.isEmpty()) {
                  if (this.awardListBuilder_.isEmpty()) {
                     this.awardListBuilder_.dispose();
                     this.awardListBuilder_ = null;
                     this.awardList_ = other.awardList_;
                     this.bitField0_ &= -3;
                     this.awardListBuilder_ = QianKunLotteryMsg.S2C_RecruitResult_19807.alwaysUseFieldBuilders ? this.getAwardListFieldBuilder() : null;
                  } else {
                     this.awardListBuilder_.addAllMessages(other.awardList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getMyRecordCount(); ++i) {
               if (!this.getMyRecord(i).isInitialized()) {
                  return false;
               }
            }

            for(int i = 0; i < this.getAwardListCount(); ++i) {
               if (!this.getAwardList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RecruitResult_19807 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecruitResult_19807)QianKunLotteryMsg.S2C_RecruitResult_19807.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecruitResult_19807)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureMyRecordIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.myRecord_ = new ArrayList(this.myRecord_);
               this.bitField0_ |= 1;
            }

         }

         public List<RecruitRecord> getMyRecordList() {
            return this.myRecordBuilder_ == null ? Collections.unmodifiableList(this.myRecord_) : this.myRecordBuilder_.getMessageList();
         }

         public int getMyRecordCount() {
            return this.myRecordBuilder_ == null ? this.myRecord_.size() : this.myRecordBuilder_.getCount();
         }

         public RecruitRecord getMyRecord(int index) {
            return this.myRecordBuilder_ == null ? (RecruitRecord)this.myRecord_.get(index) : (RecruitRecord)this.myRecordBuilder_.getMessage(index);
         }

         public Builder setMyRecord(int index, RecruitRecord value) {
            if (this.myRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyRecordIsMutable();
               this.myRecord_.set(index, value);
               this.onChanged();
            } else {
               this.myRecordBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setMyRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMyRecord(RecruitRecord value) {
            if (this.myRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyRecordIsMutable();
               this.myRecord_.add(value);
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addMyRecord(int index, RecruitRecord value) {
            if (this.myRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyRecordIsMutable();
               this.myRecord_.add(index, value);
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addMyRecord(RecruitRecord.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMyRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMyRecord(Iterable<? extends RecruitRecord> values) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.myRecord_);
               this.onChanged();
            } else {
               this.myRecordBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearMyRecord() {
            if (this.myRecordBuilder_ == null) {
               this.myRecord_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.myRecordBuilder_.clear();
            }

            return this;
         }

         public Builder removeMyRecord(int index) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.remove(index);
               this.onChanged();
            } else {
               this.myRecordBuilder_.remove(index);
            }

            return this;
         }

         public RecruitRecord.Builder getMyRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getMyRecordFieldBuilder().getBuilder(index);
         }

         public RecruitRecordOrBuilder getMyRecordOrBuilder(int index) {
            return this.myRecordBuilder_ == null ? (RecruitRecordOrBuilder)this.myRecord_.get(index) : (RecruitRecordOrBuilder)this.myRecordBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RecruitRecordOrBuilder> getMyRecordOrBuilderList() {
            return this.myRecordBuilder_ != null ? this.myRecordBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.myRecord_);
         }

         public RecruitRecord.Builder addMyRecordBuilder() {
            return (RecruitRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(QianKunLotteryMsg.RecruitRecord.getDefaultInstance());
         }

         public RecruitRecord.Builder addMyRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(index, QianKunLotteryMsg.RecruitRecord.getDefaultInstance());
         }

         public List<RecruitRecord.Builder> getMyRecordBuilderList() {
            return this.getMyRecordFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> getMyRecordFieldBuilder() {
            if (this.myRecordBuilder_ == null) {
               this.myRecordBuilder_ = new RepeatedFieldBuilderV3(this.myRecord_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.myRecord_ = null;
            }

            return this.myRecordBuilder_;
         }

         private void ensureAwardListIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.awardList_ = new ArrayList(this.awardList_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.MapDataII> getAwardListList() {
            return this.awardListBuilder_ == null ? Collections.unmodifiableList(this.awardList_) : this.awardListBuilder_.getMessageList();
         }

         public int getAwardListCount() {
            return this.awardListBuilder_ == null ? this.awardList_.size() : this.awardListBuilder_.getCount();
         }

         public CommonMsg.MapDataII getAwardList(int index) {
            return this.awardListBuilder_ == null ? (CommonMsg.MapDataII)this.awardList_.get(index) : (CommonMsg.MapDataII)this.awardListBuilder_.getMessage(index);
         }

         public Builder setAwardList(int index, CommonMsg.MapDataII value) {
            if (this.awardListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardListIsMutable();
               this.awardList_.set(index, value);
               this.onChanged();
            } else {
               this.awardListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAwardList(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               this.awardList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.awardListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAwardList(CommonMsg.MapDataII value) {
            if (this.awardListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardListIsMutable();
               this.awardList_.add(value);
               this.onChanged();
            } else {
               this.awardListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAwardList(int index, CommonMsg.MapDataII value) {
            if (this.awardListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardListIsMutable();
               this.awardList_.add(index, value);
               this.onChanged();
            } else {
               this.awardListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAwardList(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               this.awardList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.awardListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAwardList(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               this.awardList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.awardListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAwardList(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.awardList_);
               this.onChanged();
            } else {
               this.awardListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAwardList() {
            if (this.awardListBuilder_ == null) {
               this.awardList_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.awardListBuilder_.clear();
            }

            return this;
         }

         public Builder removeAwardList(int index) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               this.awardList_.remove(index);
               this.onChanged();
            } else {
               this.awardListBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getAwardListBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getAwardListFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getAwardListOrBuilder(int index) {
            return this.awardListBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.awardList_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.awardListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getAwardListOrBuilderList() {
            return this.awardListBuilder_ != null ? this.awardListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.awardList_);
         }

         public CommonMsg.MapDataII.Builder addAwardListBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getAwardListFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addAwardListBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getAwardListFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getAwardListBuilderList() {
            return this.getAwardListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getAwardListFieldBuilder() {
            if (this.awardListBuilder_ == null) {
               this.awardListBuilder_ = new RepeatedFieldBuilderV3(this.awardList_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.awardList_ = null;
            }

            return this.awardListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2S_RecruitRecord_19808 extends GeneratedMessageV3 implements S2S_RecruitRecord_19808OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECORD_FIELD_NUMBER = 1;
      private List<RecruitRecord> record_;
      private byte memoizedIsInitialized;
      private static final S2S_RecruitRecord_19808 DEFAULT_INSTANCE = new S2S_RecruitRecord_19808();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_RecruitRecord_19808> PARSER = new AbstractParser<S2S_RecruitRecord_19808>() {
         public S2S_RecruitRecord_19808 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_RecruitRecord_19808(input, extensionRegistry);
         }
      };

      private S2S_RecruitRecord_19808(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_RecruitRecord_19808() {
         this.memoizedIsInitialized = -1;
         this.record_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_RecruitRecord_19808();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_RecruitRecord_19808(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.record_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.record_.add(input.readMessage(QianKunLotteryMsg.RecruitRecord.PARSER, extensionRegistry));
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
                  this.record_ = Collections.unmodifiableList(this.record_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2S_RecruitRecord_19808_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2S_RecruitRecord_19808_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_RecruitRecord_19808.class, Builder.class);
      }

      public List<RecruitRecord> getRecordList() {
         return this.record_;
      }

      public List<? extends RecruitRecordOrBuilder> getRecordOrBuilderList() {
         return this.record_;
      }

      public int getRecordCount() {
         return this.record_.size();
      }

      public RecruitRecord getRecord(int index) {
         return (RecruitRecord)this.record_.get(index);
      }

      public RecruitRecordOrBuilder getRecordOrBuilder(int index) {
         return (RecruitRecordOrBuilder)this.record_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getRecordCount(); ++i) {
               if (!this.getRecord(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.record_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.record_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.record_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.record_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_RecruitRecord_19808)) {
            return super.equals(obj);
         } else {
            S2S_RecruitRecord_19808 other = (S2S_RecruitRecord_19808)obj;
            if (!this.getRecordList().equals(other.getRecordList())) {
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
            if (this.getRecordCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecordList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_RecruitRecord_19808 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_RecruitRecord_19808)PARSER.parseFrom(data);
      }

      public static S2S_RecruitRecord_19808 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_RecruitRecord_19808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_RecruitRecord_19808 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_RecruitRecord_19808)PARSER.parseFrom(data);
      }

      public static S2S_RecruitRecord_19808 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_RecruitRecord_19808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_RecruitRecord_19808 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_RecruitRecord_19808)PARSER.parseFrom(data);
      }

      public static S2S_RecruitRecord_19808 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_RecruitRecord_19808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_RecruitRecord_19808 parseFrom(InputStream input) throws IOException {
         return (S2S_RecruitRecord_19808)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_RecruitRecord_19808 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_RecruitRecord_19808)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_RecruitRecord_19808 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_RecruitRecord_19808)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_RecruitRecord_19808 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_RecruitRecord_19808)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_RecruitRecord_19808 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_RecruitRecord_19808)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_RecruitRecord_19808 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_RecruitRecord_19808)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_RecruitRecord_19808 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_RecruitRecord_19808 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_RecruitRecord_19808> parser() {
         return PARSER;
      }

      public Parser<S2S_RecruitRecord_19808> getParserForType() {
         return PARSER;
      }

      public S2S_RecruitRecord_19808 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_RecruitRecord_19808OrBuilder {
         private int bitField0_;
         private List<RecruitRecord> record_;
         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> recordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2S_RecruitRecord_19808_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2S_RecruitRecord_19808_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_RecruitRecord_19808.class, Builder.class);
         }

         private Builder() {
            this.record_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.record_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (QianKunLotteryMsg.S2S_RecruitRecord_19808.alwaysUseFieldBuilders) {
               this.getRecordFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.recordBuilder_ == null) {
               this.record_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.recordBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return QianKunLotteryMsg.internal_static_qiankunlottery_com_gzbz_protobuf_S2S_RecruitRecord_19808_descriptor;
         }

         public S2S_RecruitRecord_19808 getDefaultInstanceForType() {
            return QianKunLotteryMsg.S2S_RecruitRecord_19808.getDefaultInstance();
         }

         public S2S_RecruitRecord_19808 build() {
            S2S_RecruitRecord_19808 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_RecruitRecord_19808 buildPartial() {
            S2S_RecruitRecord_19808 result = new S2S_RecruitRecord_19808(this);
            int from_bitField0_ = this.bitField0_;
            if (this.recordBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.record_ = Collections.unmodifiableList(this.record_);
                  this.bitField0_ &= -2;
               }

               result.record_ = this.record_;
            } else {
               result.record_ = this.recordBuilder_.build();
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
            if (other instanceof S2S_RecruitRecord_19808) {
               return this.mergeFrom((S2S_RecruitRecord_19808)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_RecruitRecord_19808 other) {
            if (other == QianKunLotteryMsg.S2S_RecruitRecord_19808.getDefaultInstance()) {
               return this;
            } else {
               if (this.recordBuilder_ == null) {
                  if (!other.record_.isEmpty()) {
                     if (this.record_.isEmpty()) {
                        this.record_ = other.record_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureRecordIsMutable();
                        this.record_.addAll(other.record_);
                     }

                     this.onChanged();
                  }
               } else if (!other.record_.isEmpty()) {
                  if (this.recordBuilder_.isEmpty()) {
                     this.recordBuilder_.dispose();
                     this.recordBuilder_ = null;
                     this.record_ = other.record_;
                     this.bitField0_ &= -2;
                     this.recordBuilder_ = QianKunLotteryMsg.S2S_RecruitRecord_19808.alwaysUseFieldBuilders ? this.getRecordFieldBuilder() : null;
                  } else {
                     this.recordBuilder_.addAllMessages(other.record_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getRecordCount(); ++i) {
               if (!this.getRecord(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_RecruitRecord_19808 parsedMessage = null;

            try {
               parsedMessage = (S2S_RecruitRecord_19808)QianKunLotteryMsg.S2S_RecruitRecord_19808.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_RecruitRecord_19808)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRecordIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.record_ = new ArrayList(this.record_);
               this.bitField0_ |= 1;
            }

         }

         public List<RecruitRecord> getRecordList() {
            return this.recordBuilder_ == null ? Collections.unmodifiableList(this.record_) : this.recordBuilder_.getMessageList();
         }

         public int getRecordCount() {
            return this.recordBuilder_ == null ? this.record_.size() : this.recordBuilder_.getCount();
         }

         public RecruitRecord getRecord(int index) {
            return this.recordBuilder_ == null ? (RecruitRecord)this.record_.get(index) : (RecruitRecord)this.recordBuilder_.getMessage(index);
         }

         public Builder setRecord(int index, RecruitRecord value) {
            if (this.recordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordIsMutable();
               this.record_.set(index, value);
               this.onChanged();
            } else {
               this.recordBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.recordBuilder_ == null) {
               this.ensureRecordIsMutable();
               this.record_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecord(RecruitRecord value) {
            if (this.recordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordIsMutable();
               this.record_.add(value);
               this.onChanged();
            } else {
               this.recordBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRecord(int index, RecruitRecord value) {
            if (this.recordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordIsMutable();
               this.record_.add(index, value);
               this.onChanged();
            } else {
               this.recordBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRecord(RecruitRecord.Builder builderForValue) {
            if (this.recordBuilder_ == null) {
               this.ensureRecordIsMutable();
               this.record_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recordBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.recordBuilder_ == null) {
               this.ensureRecordIsMutable();
               this.record_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecord(Iterable<? extends RecruitRecord> values) {
            if (this.recordBuilder_ == null) {
               this.ensureRecordIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.record_);
               this.onChanged();
            } else {
               this.recordBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRecord() {
            if (this.recordBuilder_ == null) {
               this.record_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.recordBuilder_.clear();
            }

            return this;
         }

         public Builder removeRecord(int index) {
            if (this.recordBuilder_ == null) {
               this.ensureRecordIsMutable();
               this.record_.remove(index);
               this.onChanged();
            } else {
               this.recordBuilder_.remove(index);
            }

            return this;
         }

         public RecruitRecord.Builder getRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getRecordFieldBuilder().getBuilder(index);
         }

         public RecruitRecordOrBuilder getRecordOrBuilder(int index) {
            return this.recordBuilder_ == null ? (RecruitRecordOrBuilder)this.record_.get(index) : (RecruitRecordOrBuilder)this.recordBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RecruitRecordOrBuilder> getRecordOrBuilderList() {
            return this.recordBuilder_ != null ? this.recordBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.record_);
         }

         public RecruitRecord.Builder addRecordBuilder() {
            return (RecruitRecord.Builder)this.getRecordFieldBuilder().addBuilder(QianKunLotteryMsg.RecruitRecord.getDefaultInstance());
         }

         public RecruitRecord.Builder addRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getRecordFieldBuilder().addBuilder(index, QianKunLotteryMsg.RecruitRecord.getDefaultInstance());
         }

         public List<RecruitRecord.Builder> getRecordBuilderList() {
            return this.getRecordFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> getRecordFieldBuilder() {
            if (this.recordBuilder_ == null) {
               this.recordBuilder_ = new RepeatedFieldBuilderV3(this.record_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.record_ = null;
            }

            return this.recordBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_QianKunLotteryInfo_19801OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_RecruitQianKunLottery_19803OrBuilder extends MessageOrBuilder {
      boolean hasRecruitType();

      int getRecruitType();

      boolean hasRecruitNum();

      int getRecruitNum();

      boolean hasStage();

      int getStage();
   }

   public interface C2S_RecruitResult_19806OrBuilder extends MessageOrBuilder {
   }

   public interface RecruitRecordOrBuilder extends MessageOrBuilder {
      boolean hasServerId();

      int getServerId();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasAwardId();

      int getAwardId();

      boolean hasRecruitType();

      int getRecruitType();

      boolean hasBroadcast();

      boolean getBroadcast();
   }

   public interface S2C_QianKunLotteryInfo_19802OrBuilder extends MessageOrBuilder {
      List<RecruitRecord> getMyRecordList();

      RecruitRecord getMyRecord(int index);

      int getMyRecordCount();

      List<? extends RecruitRecordOrBuilder> getMyRecordOrBuilderList();

      RecruitRecordOrBuilder getMyRecordOrBuilder(int index);

      List<RecruitRecord> getAllRecordList();

      RecruitRecord getAllRecord(int index);

      int getAllRecordCount();

      List<? extends RecruitRecordOrBuilder> getAllRecordOrBuilderList();

      RecruitRecordOrBuilder getAllRecordOrBuilder(int index);

      List<CommonMsg.MapDataII> getAwardListList();

      CommonMsg.MapDataII getAwardList(int index);

      int getAwardListCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getAwardListOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getAwardListOrBuilder(int index);

      boolean hasCommonRecruitNum();

      int getCommonRecruitNum();

      boolean hasHighRecruitNum();

      int getHighRecruitNum();

      boolean hasStage();

      int getStage();

      boolean hasCommonDrawNum();

      int getCommonDrawNum();

      boolean hasHighDrawNum();

      int getHighDrawNum();

      boolean hasActivityStartDay();

      int getActivityStartDay();

      boolean hasFreeRecruit();

      int getFreeRecruit();
   }

   public interface S2C_RecruitQianKunLottery_19804OrBuilder extends MessageOrBuilder {
      List<Integer> getResultListList();

      int getResultListCount();

      int getResultList(int index);

      boolean hasStage();

      int getStage();

      boolean hasCommonDrawNum();

      int getCommonDrawNum();

      boolean hasHighDrawNum();

      int getHighDrawNum();

      boolean hasFreeRecruit();

      int getFreeRecruit();
   }

   public interface S2C_RecruitRecordInfo_19805OrBuilder extends MessageOrBuilder {
      List<RecruitRecord> getAllRecordList();

      RecruitRecord getAllRecord(int index);

      int getAllRecordCount();

      List<? extends RecruitRecordOrBuilder> getAllRecordOrBuilderList();

      RecruitRecordOrBuilder getAllRecordOrBuilder(int index);
   }

   public interface S2C_RecruitResult_19807OrBuilder extends MessageOrBuilder {
      List<RecruitRecord> getMyRecordList();

      RecruitRecord getMyRecord(int index);

      int getMyRecordCount();

      List<? extends RecruitRecordOrBuilder> getMyRecordOrBuilderList();

      RecruitRecordOrBuilder getMyRecordOrBuilder(int index);

      List<CommonMsg.MapDataII> getAwardListList();

      CommonMsg.MapDataII getAwardList(int index);

      int getAwardListCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getAwardListOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getAwardListOrBuilder(int index);
   }

   public interface S2S_RecruitRecord_19808OrBuilder extends MessageOrBuilder {
      List<RecruitRecord> getRecordList();

      RecruitRecord getRecord(int index);

      int getRecordCount();

      List<? extends RecruitRecordOrBuilder> getRecordOrBuilderList();

      RecruitRecordOrBuilder getRecordOrBuilder(int index);
   }
}
