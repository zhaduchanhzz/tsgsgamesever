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

public final class ActivityExtendMsg {
   private static final Descriptors.Descriptor internal_static_activityExtend_com_gzbz_protobuf_C2S_GetServerOpenTotalRechargeRewardInfo_19901_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityExtend_com_gzbz_protobuf_C2S_GetServerOpenTotalRechargeRewardInfo_19901_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityExtend_com_gzbz_protobuf_S2C_GetServerOpenTotalRechargeRewardInfo_19902_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityExtend_com_gzbz_protobuf_S2C_GetServerOpenTotalRechargeRewardInfo_19902_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityExtend_com_gzbz_protobuf_C2S_ReceiveServerOpenTotalRechargeReward_19903_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityExtend_com_gzbz_protobuf_C2S_ReceiveServerOpenTotalRechargeReward_19903_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityExtend_com_gzbz_protobuf_C2S_KoiRecordList_19905_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityExtend_com_gzbz_protobuf_C2S_KoiRecordList_19905_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityExtend_com_gzbz_protobuf_KoiRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityExtend_com_gzbz_protobuf_KoiRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityExtend_com_gzbz_protobuf_S2C_KoiRecordList_19906_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityExtend_com_gzbz_protobuf_S2C_KoiRecordList_19906_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityExtend_com_gzbz_protobuf_C2S_GetLimitTimeAddupRechargeRewardInfo_19907_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityExtend_com_gzbz_protobuf_C2S_GetLimitTimeAddupRechargeRewardInfo_19907_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityExtend_com_gzbz_protobuf_S2C_GetLimitTimeAddupRechargeRewardInfo_19908_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityExtend_com_gzbz_protobuf_S2C_GetLimitTimeAddupRechargeRewardInfo_19908_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityExtend_com_gzbz_protobuf_C2S_ReceiveLimitTimeAddupRechargeReward_19909_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityExtend_com_gzbz_protobuf_C2S_ReceiveLimitTimeAddupRechargeReward_19909_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ActivityExtendMsg() {
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
      String[] descriptorData = new String[]{"\n\u0014ActivityExtend.proto\u0012 activityExtend.com.gzbz.protobuf\u001a\nShop.proto\u001a\fcommon.proto\u001a\u000eActivity.proto\"0\n.C2S_GetServerOpenTotalRechargeRewardInfo_19901\"`\n.S2C_GetServerOpenTotalRechargeRewardInfo_19902\u0012\u0017\n\u000fisReceiveReward\u0018\u0001 \u0002(\b\u0012\u0015\n\rtotalRecharge\u0018\u0002 \u0002(\u0005\"0\n.C2S_ReceiveServerOpenTotalRechargeReward_19903\"\u0019\n\u0017C2S_KoiRecordList_19905\"@\n\tKoiRecord\u0012\u0010\n\bserverId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0002 \u0002(\t\u0012\r\n\u0005label\u0018\u0003 \u0002(\u0005\"V\n\u0017S2C_KoiRecordList_19906\u0012;\n\u0006record\u0018\u0001 \u0003(\u000b2+.activityExtend.com.gzbz.protobuf.KoiRecord\"/\n-C2S_GetLimitTimeAddupRechargeRewardInfo_19907\"W\n-S2C_GetLimitTimeAddupRechargeRewardInfo_19908\u0012\u0015\n\rtotalRecharge\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007gotGear\u0018\u0002 \u0002(\u0005\"/\n-C2S_ReceiveLimitTimeAddupRechargeReward_19909B(\n\u0011com.gzbz.protobufB\u0011ActivityExtendMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{ShopMsg.getDescriptor(), CommonMsg.getDescriptor(), ActivityMsg.getDescriptor()});
      internal_static_activityExtend_com_gzbz_protobuf_C2S_GetServerOpenTotalRechargeRewardInfo_19901_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_activityExtend_com_gzbz_protobuf_C2S_GetServerOpenTotalRechargeRewardInfo_19901_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityExtend_com_gzbz_protobuf_C2S_GetServerOpenTotalRechargeRewardInfo_19901_descriptor, new String[0]);
      internal_static_activityExtend_com_gzbz_protobuf_S2C_GetServerOpenTotalRechargeRewardInfo_19902_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_activityExtend_com_gzbz_protobuf_S2C_GetServerOpenTotalRechargeRewardInfo_19902_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityExtend_com_gzbz_protobuf_S2C_GetServerOpenTotalRechargeRewardInfo_19902_descriptor, new String[]{"IsReceiveReward", "TotalRecharge"});
      internal_static_activityExtend_com_gzbz_protobuf_C2S_ReceiveServerOpenTotalRechargeReward_19903_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_activityExtend_com_gzbz_protobuf_C2S_ReceiveServerOpenTotalRechargeReward_19903_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityExtend_com_gzbz_protobuf_C2S_ReceiveServerOpenTotalRechargeReward_19903_descriptor, new String[0]);
      internal_static_activityExtend_com_gzbz_protobuf_C2S_KoiRecordList_19905_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_activityExtend_com_gzbz_protobuf_C2S_KoiRecordList_19905_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityExtend_com_gzbz_protobuf_C2S_KoiRecordList_19905_descriptor, new String[0]);
      internal_static_activityExtend_com_gzbz_protobuf_KoiRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_activityExtend_com_gzbz_protobuf_KoiRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityExtend_com_gzbz_protobuf_KoiRecord_descriptor, new String[]{"ServerId", "PlayerName", "Label"});
      internal_static_activityExtend_com_gzbz_protobuf_S2C_KoiRecordList_19906_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_activityExtend_com_gzbz_protobuf_S2C_KoiRecordList_19906_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityExtend_com_gzbz_protobuf_S2C_KoiRecordList_19906_descriptor, new String[]{"Record"});
      internal_static_activityExtend_com_gzbz_protobuf_C2S_GetLimitTimeAddupRechargeRewardInfo_19907_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_activityExtend_com_gzbz_protobuf_C2S_GetLimitTimeAddupRechargeRewardInfo_19907_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityExtend_com_gzbz_protobuf_C2S_GetLimitTimeAddupRechargeRewardInfo_19907_descriptor, new String[0]);
      internal_static_activityExtend_com_gzbz_protobuf_S2C_GetLimitTimeAddupRechargeRewardInfo_19908_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_activityExtend_com_gzbz_protobuf_S2C_GetLimitTimeAddupRechargeRewardInfo_19908_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityExtend_com_gzbz_protobuf_S2C_GetLimitTimeAddupRechargeRewardInfo_19908_descriptor, new String[]{"TotalRecharge", "GotGear"});
      internal_static_activityExtend_com_gzbz_protobuf_C2S_ReceiveLimitTimeAddupRechargeReward_19909_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_activityExtend_com_gzbz_protobuf_C2S_ReceiveLimitTimeAddupRechargeReward_19909_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityExtend_com_gzbz_protobuf_C2S_ReceiveLimitTimeAddupRechargeReward_19909_descriptor, new String[0]);
      ShopMsg.getDescriptor();
      CommonMsg.getDescriptor();
      ActivityMsg.getDescriptor();
   }

   public static final class C2S_GetServerOpenTotalRechargeRewardInfo_19901 extends GeneratedMessageV3 implements C2S_GetServerOpenTotalRechargeRewardInfo_19901OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GetServerOpenTotalRechargeRewardInfo_19901 DEFAULT_INSTANCE = new C2S_GetServerOpenTotalRechargeRewardInfo_19901();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GetServerOpenTotalRechargeRewardInfo_19901> PARSER = new AbstractParser<C2S_GetServerOpenTotalRechargeRewardInfo_19901>() {
         public C2S_GetServerOpenTotalRechargeRewardInfo_19901 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GetServerOpenTotalRechargeRewardInfo_19901(input, extensionRegistry);
         }
      };

      private C2S_GetServerOpenTotalRechargeRewardInfo_19901(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GetServerOpenTotalRechargeRewardInfo_19901() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GetServerOpenTotalRechargeRewardInfo_19901();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GetServerOpenTotalRechargeRewardInfo_19901(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_GetServerOpenTotalRechargeRewardInfo_19901_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_GetServerOpenTotalRechargeRewardInfo_19901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetServerOpenTotalRechargeRewardInfo_19901.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GetServerOpenTotalRechargeRewardInfo_19901)) {
            return super.equals(obj);
         } else {
            C2S_GetServerOpenTotalRechargeRewardInfo_19901 other = (C2S_GetServerOpenTotalRechargeRewardInfo_19901)obj;
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

      public static C2S_GetServerOpenTotalRechargeRewardInfo_19901 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GetServerOpenTotalRechargeRewardInfo_19901)PARSER.parseFrom(data);
      }

      public static C2S_GetServerOpenTotalRechargeRewardInfo_19901 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetServerOpenTotalRechargeRewardInfo_19901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetServerOpenTotalRechargeRewardInfo_19901 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GetServerOpenTotalRechargeRewardInfo_19901)PARSER.parseFrom(data);
      }

      public static C2S_GetServerOpenTotalRechargeRewardInfo_19901 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetServerOpenTotalRechargeRewardInfo_19901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetServerOpenTotalRechargeRewardInfo_19901 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GetServerOpenTotalRechargeRewardInfo_19901)PARSER.parseFrom(data);
      }

      public static C2S_GetServerOpenTotalRechargeRewardInfo_19901 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetServerOpenTotalRechargeRewardInfo_19901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetServerOpenTotalRechargeRewardInfo_19901 parseFrom(InputStream input) throws IOException {
         return (C2S_GetServerOpenTotalRechargeRewardInfo_19901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetServerOpenTotalRechargeRewardInfo_19901 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetServerOpenTotalRechargeRewardInfo_19901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetServerOpenTotalRechargeRewardInfo_19901 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GetServerOpenTotalRechargeRewardInfo_19901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GetServerOpenTotalRechargeRewardInfo_19901 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetServerOpenTotalRechargeRewardInfo_19901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetServerOpenTotalRechargeRewardInfo_19901 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GetServerOpenTotalRechargeRewardInfo_19901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetServerOpenTotalRechargeRewardInfo_19901 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetServerOpenTotalRechargeRewardInfo_19901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GetServerOpenTotalRechargeRewardInfo_19901 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GetServerOpenTotalRechargeRewardInfo_19901 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GetServerOpenTotalRechargeRewardInfo_19901> parser() {
         return PARSER;
      }

      public Parser<C2S_GetServerOpenTotalRechargeRewardInfo_19901> getParserForType() {
         return PARSER;
      }

      public C2S_GetServerOpenTotalRechargeRewardInfo_19901 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GetServerOpenTotalRechargeRewardInfo_19901OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_GetServerOpenTotalRechargeRewardInfo_19901_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_GetServerOpenTotalRechargeRewardInfo_19901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetServerOpenTotalRechargeRewardInfo_19901.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityExtendMsg.C2S_GetServerOpenTotalRechargeRewardInfo_19901.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_GetServerOpenTotalRechargeRewardInfo_19901_descriptor;
         }

         public C2S_GetServerOpenTotalRechargeRewardInfo_19901 getDefaultInstanceForType() {
            return ActivityExtendMsg.C2S_GetServerOpenTotalRechargeRewardInfo_19901.getDefaultInstance();
         }

         public C2S_GetServerOpenTotalRechargeRewardInfo_19901 build() {
            C2S_GetServerOpenTotalRechargeRewardInfo_19901 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GetServerOpenTotalRechargeRewardInfo_19901 buildPartial() {
            C2S_GetServerOpenTotalRechargeRewardInfo_19901 result = new C2S_GetServerOpenTotalRechargeRewardInfo_19901(this);
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
            if (other instanceof C2S_GetServerOpenTotalRechargeRewardInfo_19901) {
               return this.mergeFrom((C2S_GetServerOpenTotalRechargeRewardInfo_19901)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GetServerOpenTotalRechargeRewardInfo_19901 other) {
            if (other == ActivityExtendMsg.C2S_GetServerOpenTotalRechargeRewardInfo_19901.getDefaultInstance()) {
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
            C2S_GetServerOpenTotalRechargeRewardInfo_19901 parsedMessage = null;

            try {
               parsedMessage = (C2S_GetServerOpenTotalRechargeRewardInfo_19901)ActivityExtendMsg.C2S_GetServerOpenTotalRechargeRewardInfo_19901.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GetServerOpenTotalRechargeRewardInfo_19901)e.getUnfinishedMessage();
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

   public static final class S2C_GetServerOpenTotalRechargeRewardInfo_19902 extends GeneratedMessageV3 implements S2C_GetServerOpenTotalRechargeRewardInfo_19902OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ISRECEIVEREWARD_FIELD_NUMBER = 1;
      private boolean isReceiveReward_;
      public static final int TOTALRECHARGE_FIELD_NUMBER = 2;
      private int totalRecharge_;
      private byte memoizedIsInitialized;
      private static final S2C_GetServerOpenTotalRechargeRewardInfo_19902 DEFAULT_INSTANCE = new S2C_GetServerOpenTotalRechargeRewardInfo_19902();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GetServerOpenTotalRechargeRewardInfo_19902> PARSER = new AbstractParser<S2C_GetServerOpenTotalRechargeRewardInfo_19902>() {
         public S2C_GetServerOpenTotalRechargeRewardInfo_19902 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GetServerOpenTotalRechargeRewardInfo_19902(input, extensionRegistry);
         }
      };

      private S2C_GetServerOpenTotalRechargeRewardInfo_19902(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GetServerOpenTotalRechargeRewardInfo_19902() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GetServerOpenTotalRechargeRewardInfo_19902();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GetServerOpenTotalRechargeRewardInfo_19902(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.totalRecharge_ = input.readInt32();
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
         return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_S2C_GetServerOpenTotalRechargeRewardInfo_19902_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_S2C_GetServerOpenTotalRechargeRewardInfo_19902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetServerOpenTotalRechargeRewardInfo_19902.class, Builder.class);
      }

      public boolean hasIsReceiveReward() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsReceiveReward() {
         return this.isReceiveReward_;
      }

      public boolean hasTotalRecharge() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTotalRecharge() {
         return this.totalRecharge_;
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
         } else if (!this.hasTotalRecharge()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.totalRecharge_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.totalRecharge_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GetServerOpenTotalRechargeRewardInfo_19902)) {
            return super.equals(obj);
         } else {
            S2C_GetServerOpenTotalRechargeRewardInfo_19902 other = (S2C_GetServerOpenTotalRechargeRewardInfo_19902)obj;
            if (this.hasIsReceiveReward() != other.hasIsReceiveReward()) {
               return false;
            } else if (this.hasIsReceiveReward() && this.getIsReceiveReward() != other.getIsReceiveReward()) {
               return false;
            } else if (this.hasTotalRecharge() != other.hasTotalRecharge()) {
               return false;
            } else if (this.hasTotalRecharge() && this.getTotalRecharge() != other.getTotalRecharge()) {
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

            if (this.hasTotalRecharge()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTotalRecharge();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GetServerOpenTotalRechargeRewardInfo_19902 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GetServerOpenTotalRechargeRewardInfo_19902)PARSER.parseFrom(data);
      }

      public static S2C_GetServerOpenTotalRechargeRewardInfo_19902 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetServerOpenTotalRechargeRewardInfo_19902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetServerOpenTotalRechargeRewardInfo_19902 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GetServerOpenTotalRechargeRewardInfo_19902)PARSER.parseFrom(data);
      }

      public static S2C_GetServerOpenTotalRechargeRewardInfo_19902 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetServerOpenTotalRechargeRewardInfo_19902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetServerOpenTotalRechargeRewardInfo_19902 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GetServerOpenTotalRechargeRewardInfo_19902)PARSER.parseFrom(data);
      }

      public static S2C_GetServerOpenTotalRechargeRewardInfo_19902 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetServerOpenTotalRechargeRewardInfo_19902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetServerOpenTotalRechargeRewardInfo_19902 parseFrom(InputStream input) throws IOException {
         return (S2C_GetServerOpenTotalRechargeRewardInfo_19902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetServerOpenTotalRechargeRewardInfo_19902 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetServerOpenTotalRechargeRewardInfo_19902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetServerOpenTotalRechargeRewardInfo_19902 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GetServerOpenTotalRechargeRewardInfo_19902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GetServerOpenTotalRechargeRewardInfo_19902 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetServerOpenTotalRechargeRewardInfo_19902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetServerOpenTotalRechargeRewardInfo_19902 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GetServerOpenTotalRechargeRewardInfo_19902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetServerOpenTotalRechargeRewardInfo_19902 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetServerOpenTotalRechargeRewardInfo_19902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GetServerOpenTotalRechargeRewardInfo_19902 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GetServerOpenTotalRechargeRewardInfo_19902 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GetServerOpenTotalRechargeRewardInfo_19902> parser() {
         return PARSER;
      }

      public Parser<S2C_GetServerOpenTotalRechargeRewardInfo_19902> getParserForType() {
         return PARSER;
      }

      public S2C_GetServerOpenTotalRechargeRewardInfo_19902 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GetServerOpenTotalRechargeRewardInfo_19902OrBuilder {
         private int bitField0_;
         private boolean isReceiveReward_;
         private int totalRecharge_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_S2C_GetServerOpenTotalRechargeRewardInfo_19902_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_S2C_GetServerOpenTotalRechargeRewardInfo_19902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetServerOpenTotalRechargeRewardInfo_19902.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityExtendMsg.S2C_GetServerOpenTotalRechargeRewardInfo_19902.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.isReceiveReward_ = false;
            this.bitField0_ &= -2;
            this.totalRecharge_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_S2C_GetServerOpenTotalRechargeRewardInfo_19902_descriptor;
         }

         public S2C_GetServerOpenTotalRechargeRewardInfo_19902 getDefaultInstanceForType() {
            return ActivityExtendMsg.S2C_GetServerOpenTotalRechargeRewardInfo_19902.getDefaultInstance();
         }

         public S2C_GetServerOpenTotalRechargeRewardInfo_19902 build() {
            S2C_GetServerOpenTotalRechargeRewardInfo_19902 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GetServerOpenTotalRechargeRewardInfo_19902 buildPartial() {
            S2C_GetServerOpenTotalRechargeRewardInfo_19902 result = new S2C_GetServerOpenTotalRechargeRewardInfo_19902(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.isReceiveReward_ = this.isReceiveReward_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.totalRecharge_ = this.totalRecharge_;
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
            if (other instanceof S2C_GetServerOpenTotalRechargeRewardInfo_19902) {
               return this.mergeFrom((S2C_GetServerOpenTotalRechargeRewardInfo_19902)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GetServerOpenTotalRechargeRewardInfo_19902 other) {
            if (other == ActivityExtendMsg.S2C_GetServerOpenTotalRechargeRewardInfo_19902.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIsReceiveReward()) {
                  this.setIsReceiveReward(other.getIsReceiveReward());
               }

               if (other.hasTotalRecharge()) {
                  this.setTotalRecharge(other.getTotalRecharge());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasIsReceiveReward()) {
               return false;
            } else {
               return this.hasTotalRecharge();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GetServerOpenTotalRechargeRewardInfo_19902 parsedMessage = null;

            try {
               parsedMessage = (S2C_GetServerOpenTotalRechargeRewardInfo_19902)ActivityExtendMsg.S2C_GetServerOpenTotalRechargeRewardInfo_19902.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GetServerOpenTotalRechargeRewardInfo_19902)e.getUnfinishedMessage();
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

         public boolean hasTotalRecharge() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTotalRecharge() {
            return this.totalRecharge_;
         }

         public Builder setTotalRecharge(int value) {
            this.bitField0_ |= 2;
            this.totalRecharge_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalRecharge() {
            this.bitField0_ &= -3;
            this.totalRecharge_ = 0;
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

   public static final class C2S_ReceiveServerOpenTotalRechargeReward_19903 extends GeneratedMessageV3 implements C2S_ReceiveServerOpenTotalRechargeReward_19903OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveServerOpenTotalRechargeReward_19903 DEFAULT_INSTANCE = new C2S_ReceiveServerOpenTotalRechargeReward_19903();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveServerOpenTotalRechargeReward_19903> PARSER = new AbstractParser<C2S_ReceiveServerOpenTotalRechargeReward_19903>() {
         public C2S_ReceiveServerOpenTotalRechargeReward_19903 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveServerOpenTotalRechargeReward_19903(input, extensionRegistry);
         }
      };

      private C2S_ReceiveServerOpenTotalRechargeReward_19903(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveServerOpenTotalRechargeReward_19903() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveServerOpenTotalRechargeReward_19903();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveServerOpenTotalRechargeReward_19903(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_ReceiveServerOpenTotalRechargeReward_19903_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_ReceiveServerOpenTotalRechargeReward_19903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveServerOpenTotalRechargeReward_19903.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveServerOpenTotalRechargeReward_19903)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveServerOpenTotalRechargeReward_19903 other = (C2S_ReceiveServerOpenTotalRechargeReward_19903)obj;
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

      public static C2S_ReceiveServerOpenTotalRechargeReward_19903 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveServerOpenTotalRechargeReward_19903)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveServerOpenTotalRechargeReward_19903 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveServerOpenTotalRechargeReward_19903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveServerOpenTotalRechargeReward_19903 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveServerOpenTotalRechargeReward_19903)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveServerOpenTotalRechargeReward_19903 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveServerOpenTotalRechargeReward_19903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveServerOpenTotalRechargeReward_19903 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveServerOpenTotalRechargeReward_19903)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveServerOpenTotalRechargeReward_19903 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveServerOpenTotalRechargeReward_19903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveServerOpenTotalRechargeReward_19903 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveServerOpenTotalRechargeReward_19903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveServerOpenTotalRechargeReward_19903 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveServerOpenTotalRechargeReward_19903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveServerOpenTotalRechargeReward_19903 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveServerOpenTotalRechargeReward_19903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveServerOpenTotalRechargeReward_19903 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveServerOpenTotalRechargeReward_19903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveServerOpenTotalRechargeReward_19903 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveServerOpenTotalRechargeReward_19903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveServerOpenTotalRechargeReward_19903 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveServerOpenTotalRechargeReward_19903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveServerOpenTotalRechargeReward_19903 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveServerOpenTotalRechargeReward_19903 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveServerOpenTotalRechargeReward_19903> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveServerOpenTotalRechargeReward_19903> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveServerOpenTotalRechargeReward_19903 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveServerOpenTotalRechargeReward_19903OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_ReceiveServerOpenTotalRechargeReward_19903_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_ReceiveServerOpenTotalRechargeReward_19903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveServerOpenTotalRechargeReward_19903.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityExtendMsg.C2S_ReceiveServerOpenTotalRechargeReward_19903.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_ReceiveServerOpenTotalRechargeReward_19903_descriptor;
         }

         public C2S_ReceiveServerOpenTotalRechargeReward_19903 getDefaultInstanceForType() {
            return ActivityExtendMsg.C2S_ReceiveServerOpenTotalRechargeReward_19903.getDefaultInstance();
         }

         public C2S_ReceiveServerOpenTotalRechargeReward_19903 build() {
            C2S_ReceiveServerOpenTotalRechargeReward_19903 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveServerOpenTotalRechargeReward_19903 buildPartial() {
            C2S_ReceiveServerOpenTotalRechargeReward_19903 result = new C2S_ReceiveServerOpenTotalRechargeReward_19903(this);
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
            if (other instanceof C2S_ReceiveServerOpenTotalRechargeReward_19903) {
               return this.mergeFrom((C2S_ReceiveServerOpenTotalRechargeReward_19903)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveServerOpenTotalRechargeReward_19903 other) {
            if (other == ActivityExtendMsg.C2S_ReceiveServerOpenTotalRechargeReward_19903.getDefaultInstance()) {
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
            C2S_ReceiveServerOpenTotalRechargeReward_19903 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveServerOpenTotalRechargeReward_19903)ActivityExtendMsg.C2S_ReceiveServerOpenTotalRechargeReward_19903.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveServerOpenTotalRechargeReward_19903)e.getUnfinishedMessage();
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

   public static final class C2S_KoiRecordList_19905 extends GeneratedMessageV3 implements C2S_KoiRecordList_19905OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_KoiRecordList_19905 DEFAULT_INSTANCE = new C2S_KoiRecordList_19905();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_KoiRecordList_19905> PARSER = new AbstractParser<C2S_KoiRecordList_19905>() {
         public C2S_KoiRecordList_19905 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_KoiRecordList_19905(input, extensionRegistry);
         }
      };

      private C2S_KoiRecordList_19905(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_KoiRecordList_19905() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_KoiRecordList_19905();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_KoiRecordList_19905(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_KoiRecordList_19905_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_KoiRecordList_19905_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_KoiRecordList_19905.class, Builder.class);
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
         } else if (!(obj instanceof C2S_KoiRecordList_19905)) {
            return super.equals(obj);
         } else {
            C2S_KoiRecordList_19905 other = (C2S_KoiRecordList_19905)obj;
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

      public static C2S_KoiRecordList_19905 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_KoiRecordList_19905)PARSER.parseFrom(data);
      }

      public static C2S_KoiRecordList_19905 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_KoiRecordList_19905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_KoiRecordList_19905 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_KoiRecordList_19905)PARSER.parseFrom(data);
      }

      public static C2S_KoiRecordList_19905 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_KoiRecordList_19905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_KoiRecordList_19905 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_KoiRecordList_19905)PARSER.parseFrom(data);
      }

      public static C2S_KoiRecordList_19905 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_KoiRecordList_19905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_KoiRecordList_19905 parseFrom(InputStream input) throws IOException {
         return (C2S_KoiRecordList_19905)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_KoiRecordList_19905 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_KoiRecordList_19905)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_KoiRecordList_19905 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_KoiRecordList_19905)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_KoiRecordList_19905 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_KoiRecordList_19905)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_KoiRecordList_19905 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_KoiRecordList_19905)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_KoiRecordList_19905 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_KoiRecordList_19905)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_KoiRecordList_19905 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_KoiRecordList_19905 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_KoiRecordList_19905> parser() {
         return PARSER;
      }

      public Parser<C2S_KoiRecordList_19905> getParserForType() {
         return PARSER;
      }

      public C2S_KoiRecordList_19905 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_KoiRecordList_19905OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_KoiRecordList_19905_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_KoiRecordList_19905_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_KoiRecordList_19905.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityExtendMsg.C2S_KoiRecordList_19905.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_KoiRecordList_19905_descriptor;
         }

         public C2S_KoiRecordList_19905 getDefaultInstanceForType() {
            return ActivityExtendMsg.C2S_KoiRecordList_19905.getDefaultInstance();
         }

         public C2S_KoiRecordList_19905 build() {
            C2S_KoiRecordList_19905 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_KoiRecordList_19905 buildPartial() {
            C2S_KoiRecordList_19905 result = new C2S_KoiRecordList_19905(this);
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
            if (other instanceof C2S_KoiRecordList_19905) {
               return this.mergeFrom((C2S_KoiRecordList_19905)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_KoiRecordList_19905 other) {
            if (other == ActivityExtendMsg.C2S_KoiRecordList_19905.getDefaultInstance()) {
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
            C2S_KoiRecordList_19905 parsedMessage = null;

            try {
               parsedMessage = (C2S_KoiRecordList_19905)ActivityExtendMsg.C2S_KoiRecordList_19905.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_KoiRecordList_19905)e.getUnfinishedMessage();
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

   public static final class KoiRecord extends GeneratedMessageV3 implements KoiRecordOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SERVERID_FIELD_NUMBER = 1;
      private int serverId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 2;
      private volatile Object playerName_;
      public static final int LABEL_FIELD_NUMBER = 3;
      private int label_;
      private byte memoizedIsInitialized;
      private static final KoiRecord DEFAULT_INSTANCE = new KoiRecord();
      /** @deprecated */
      @Deprecated
      public static final Parser<KoiRecord> PARSER = new AbstractParser<KoiRecord>() {
         public KoiRecord parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new KoiRecord(input, extensionRegistry);
         }
      };

      private KoiRecord(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private KoiRecord() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new KoiRecord();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private KoiRecord(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.playerName_ = bs;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.label_ = input.readInt32();
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
         return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_KoiRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_KoiRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(KoiRecord.class, Builder.class);
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 2) != 0;
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

      public boolean hasLabel() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLabel() {
         return this.label_;
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
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLabel()) {
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
            GeneratedMessageV3.writeString(output, 2, this.playerName_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.label_);
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
               size += GeneratedMessageV3.computeStringSize(2, this.playerName_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.label_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof KoiRecord)) {
            return super.equals(obj);
         } else {
            KoiRecord other = (KoiRecord)obj;
            if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasLabel() != other.hasLabel()) {
               return false;
            } else if (this.hasLabel() && this.getLabel() != other.getLabel()) {
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

            if (this.hasPlayerName()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasLabel()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLabel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static KoiRecord parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (KoiRecord)PARSER.parseFrom(data);
      }

      public static KoiRecord parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (KoiRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static KoiRecord parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (KoiRecord)PARSER.parseFrom(data);
      }

      public static KoiRecord parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (KoiRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static KoiRecord parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (KoiRecord)PARSER.parseFrom(data);
      }

      public static KoiRecord parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (KoiRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static KoiRecord parseFrom(InputStream input) throws IOException {
         return (KoiRecord)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static KoiRecord parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (KoiRecord)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static KoiRecord parseDelimitedFrom(InputStream input) throws IOException {
         return (KoiRecord)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static KoiRecord parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (KoiRecord)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static KoiRecord parseFrom(CodedInputStream input) throws IOException {
         return (KoiRecord)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static KoiRecord parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (KoiRecord)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(KoiRecord prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static KoiRecord getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<KoiRecord> parser() {
         return PARSER;
      }

      public Parser<KoiRecord> getParserForType() {
         return PARSER;
      }

      public KoiRecord getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements KoiRecordOrBuilder {
         private int bitField0_;
         private int serverId_;
         private Object playerName_;
         private int label_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_KoiRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_KoiRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(KoiRecord.class, Builder.class);
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
            if (ActivityExtendMsg.KoiRecord.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.serverId_ = 0;
            this.bitField0_ &= -2;
            this.playerName_ = "";
            this.bitField0_ &= -3;
            this.label_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_KoiRecord_descriptor;
         }

         public KoiRecord getDefaultInstanceForType() {
            return ActivityExtendMsg.KoiRecord.getDefaultInstance();
         }

         public KoiRecord build() {
            KoiRecord result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public KoiRecord buildPartial() {
            KoiRecord result = new KoiRecord(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 4) != 0) {
               result.label_ = this.label_;
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
            if (other instanceof KoiRecord) {
               return this.mergeFrom((KoiRecord)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(KoiRecord other) {
            if (other == ActivityExtendMsg.KoiRecord.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 2;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasLabel()) {
                  this.setLabel(other.getLabel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasServerId()) {
               return false;
            } else if (!this.hasPlayerName()) {
               return false;
            } else {
               return this.hasLabel();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            KoiRecord parsedMessage = null;

            try {
               parsedMessage = (KoiRecord)ActivityExtendMsg.KoiRecord.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (KoiRecord)e.getUnfinishedMessage();
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

         public boolean hasPlayerName() {
            return (this.bitField0_ & 2) != 0;
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
               this.bitField0_ |= 2;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -3;
            this.playerName_ = ActivityExtendMsg.KoiRecord.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasLabel() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLabel() {
            return this.label_;
         }

         public Builder setLabel(int value) {
            this.bitField0_ |= 4;
            this.label_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLabel() {
            this.bitField0_ &= -5;
            this.label_ = 0;
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

   public static final class S2C_KoiRecordList_19906 extends GeneratedMessageV3 implements S2C_KoiRecordList_19906OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECORD_FIELD_NUMBER = 1;
      private List<KoiRecord> record_;
      private byte memoizedIsInitialized;
      private static final S2C_KoiRecordList_19906 DEFAULT_INSTANCE = new S2C_KoiRecordList_19906();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_KoiRecordList_19906> PARSER = new AbstractParser<S2C_KoiRecordList_19906>() {
         public S2C_KoiRecordList_19906 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_KoiRecordList_19906(input, extensionRegistry);
         }
      };

      private S2C_KoiRecordList_19906(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_KoiRecordList_19906() {
         this.memoizedIsInitialized = -1;
         this.record_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_KoiRecordList_19906();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_KoiRecordList_19906(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.record_.add(input.readMessage(ActivityExtendMsg.KoiRecord.PARSER, extensionRegistry));
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
         return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_S2C_KoiRecordList_19906_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_S2C_KoiRecordList_19906_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_KoiRecordList_19906.class, Builder.class);
      }

      public List<KoiRecord> getRecordList() {
         return this.record_;
      }

      public List<? extends KoiRecordOrBuilder> getRecordOrBuilderList() {
         return this.record_;
      }

      public int getRecordCount() {
         return this.record_.size();
      }

      public KoiRecord getRecord(int index) {
         return (KoiRecord)this.record_.get(index);
      }

      public KoiRecordOrBuilder getRecordOrBuilder(int index) {
         return (KoiRecordOrBuilder)this.record_.get(index);
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
         } else if (!(obj instanceof S2C_KoiRecordList_19906)) {
            return super.equals(obj);
         } else {
            S2C_KoiRecordList_19906 other = (S2C_KoiRecordList_19906)obj;
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

      public static S2C_KoiRecordList_19906 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_KoiRecordList_19906)PARSER.parseFrom(data);
      }

      public static S2C_KoiRecordList_19906 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_KoiRecordList_19906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_KoiRecordList_19906 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_KoiRecordList_19906)PARSER.parseFrom(data);
      }

      public static S2C_KoiRecordList_19906 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_KoiRecordList_19906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_KoiRecordList_19906 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_KoiRecordList_19906)PARSER.parseFrom(data);
      }

      public static S2C_KoiRecordList_19906 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_KoiRecordList_19906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_KoiRecordList_19906 parseFrom(InputStream input) throws IOException {
         return (S2C_KoiRecordList_19906)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_KoiRecordList_19906 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_KoiRecordList_19906)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_KoiRecordList_19906 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_KoiRecordList_19906)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_KoiRecordList_19906 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_KoiRecordList_19906)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_KoiRecordList_19906 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_KoiRecordList_19906)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_KoiRecordList_19906 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_KoiRecordList_19906)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_KoiRecordList_19906 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_KoiRecordList_19906 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_KoiRecordList_19906> parser() {
         return PARSER;
      }

      public Parser<S2C_KoiRecordList_19906> getParserForType() {
         return PARSER;
      }

      public S2C_KoiRecordList_19906 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_KoiRecordList_19906OrBuilder {
         private int bitField0_;
         private List<KoiRecord> record_;
         private RepeatedFieldBuilderV3<KoiRecord, KoiRecord.Builder, KoiRecordOrBuilder> recordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_S2C_KoiRecordList_19906_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_S2C_KoiRecordList_19906_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_KoiRecordList_19906.class, Builder.class);
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
            if (ActivityExtendMsg.S2C_KoiRecordList_19906.alwaysUseFieldBuilders) {
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
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_S2C_KoiRecordList_19906_descriptor;
         }

         public S2C_KoiRecordList_19906 getDefaultInstanceForType() {
            return ActivityExtendMsg.S2C_KoiRecordList_19906.getDefaultInstance();
         }

         public S2C_KoiRecordList_19906 build() {
            S2C_KoiRecordList_19906 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_KoiRecordList_19906 buildPartial() {
            S2C_KoiRecordList_19906 result = new S2C_KoiRecordList_19906(this);
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
            if (other instanceof S2C_KoiRecordList_19906) {
               return this.mergeFrom((S2C_KoiRecordList_19906)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_KoiRecordList_19906 other) {
            if (other == ActivityExtendMsg.S2C_KoiRecordList_19906.getDefaultInstance()) {
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
                     this.recordBuilder_ = ActivityExtendMsg.S2C_KoiRecordList_19906.alwaysUseFieldBuilders ? this.getRecordFieldBuilder() : null;
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
            S2C_KoiRecordList_19906 parsedMessage = null;

            try {
               parsedMessage = (S2C_KoiRecordList_19906)ActivityExtendMsg.S2C_KoiRecordList_19906.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_KoiRecordList_19906)e.getUnfinishedMessage();
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

         public List<KoiRecord> getRecordList() {
            return this.recordBuilder_ == null ? Collections.unmodifiableList(this.record_) : this.recordBuilder_.getMessageList();
         }

         public int getRecordCount() {
            return this.recordBuilder_ == null ? this.record_.size() : this.recordBuilder_.getCount();
         }

         public KoiRecord getRecord(int index) {
            return this.recordBuilder_ == null ? (KoiRecord)this.record_.get(index) : (KoiRecord)this.recordBuilder_.getMessage(index);
         }

         public Builder setRecord(int index, KoiRecord value) {
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

         public Builder setRecord(int index, KoiRecord.Builder builderForValue) {
            if (this.recordBuilder_ == null) {
               this.ensureRecordIsMutable();
               this.record_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecord(KoiRecord value) {
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

         public Builder addRecord(int index, KoiRecord value) {
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

         public Builder addRecord(KoiRecord.Builder builderForValue) {
            if (this.recordBuilder_ == null) {
               this.ensureRecordIsMutable();
               this.record_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recordBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecord(int index, KoiRecord.Builder builderForValue) {
            if (this.recordBuilder_ == null) {
               this.ensureRecordIsMutable();
               this.record_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecord(Iterable<? extends KoiRecord> values) {
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

         public KoiRecord.Builder getRecordBuilder(int index) {
            return (KoiRecord.Builder)this.getRecordFieldBuilder().getBuilder(index);
         }

         public KoiRecordOrBuilder getRecordOrBuilder(int index) {
            return this.recordBuilder_ == null ? (KoiRecordOrBuilder)this.record_.get(index) : (KoiRecordOrBuilder)this.recordBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends KoiRecordOrBuilder> getRecordOrBuilderList() {
            return this.recordBuilder_ != null ? this.recordBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.record_);
         }

         public KoiRecord.Builder addRecordBuilder() {
            return (KoiRecord.Builder)this.getRecordFieldBuilder().addBuilder(ActivityExtendMsg.KoiRecord.getDefaultInstance());
         }

         public KoiRecord.Builder addRecordBuilder(int index) {
            return (KoiRecord.Builder)this.getRecordFieldBuilder().addBuilder(index, ActivityExtendMsg.KoiRecord.getDefaultInstance());
         }

         public List<KoiRecord.Builder> getRecordBuilderList() {
            return this.getRecordFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<KoiRecord, KoiRecord.Builder, KoiRecordOrBuilder> getRecordFieldBuilder() {
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

   public static final class C2S_GetLimitTimeAddupRechargeRewardInfo_19907 extends GeneratedMessageV3 implements C2S_GetLimitTimeAddupRechargeRewardInfo_19907OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GetLimitTimeAddupRechargeRewardInfo_19907 DEFAULT_INSTANCE = new C2S_GetLimitTimeAddupRechargeRewardInfo_19907();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GetLimitTimeAddupRechargeRewardInfo_19907> PARSER = new AbstractParser<C2S_GetLimitTimeAddupRechargeRewardInfo_19907>() {
         public C2S_GetLimitTimeAddupRechargeRewardInfo_19907 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GetLimitTimeAddupRechargeRewardInfo_19907(input, extensionRegistry);
         }
      };

      private C2S_GetLimitTimeAddupRechargeRewardInfo_19907(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GetLimitTimeAddupRechargeRewardInfo_19907() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GetLimitTimeAddupRechargeRewardInfo_19907();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GetLimitTimeAddupRechargeRewardInfo_19907(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_GetLimitTimeAddupRechargeRewardInfo_19907_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_GetLimitTimeAddupRechargeRewardInfo_19907_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetLimitTimeAddupRechargeRewardInfo_19907.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GetLimitTimeAddupRechargeRewardInfo_19907)) {
            return super.equals(obj);
         } else {
            C2S_GetLimitTimeAddupRechargeRewardInfo_19907 other = (C2S_GetLimitTimeAddupRechargeRewardInfo_19907)obj;
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

      public static C2S_GetLimitTimeAddupRechargeRewardInfo_19907 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GetLimitTimeAddupRechargeRewardInfo_19907)PARSER.parseFrom(data);
      }

      public static C2S_GetLimitTimeAddupRechargeRewardInfo_19907 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetLimitTimeAddupRechargeRewardInfo_19907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetLimitTimeAddupRechargeRewardInfo_19907 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GetLimitTimeAddupRechargeRewardInfo_19907)PARSER.parseFrom(data);
      }

      public static C2S_GetLimitTimeAddupRechargeRewardInfo_19907 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetLimitTimeAddupRechargeRewardInfo_19907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetLimitTimeAddupRechargeRewardInfo_19907 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GetLimitTimeAddupRechargeRewardInfo_19907)PARSER.parseFrom(data);
      }

      public static C2S_GetLimitTimeAddupRechargeRewardInfo_19907 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetLimitTimeAddupRechargeRewardInfo_19907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetLimitTimeAddupRechargeRewardInfo_19907 parseFrom(InputStream input) throws IOException {
         return (C2S_GetLimitTimeAddupRechargeRewardInfo_19907)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetLimitTimeAddupRechargeRewardInfo_19907 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetLimitTimeAddupRechargeRewardInfo_19907)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetLimitTimeAddupRechargeRewardInfo_19907 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GetLimitTimeAddupRechargeRewardInfo_19907)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GetLimitTimeAddupRechargeRewardInfo_19907 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetLimitTimeAddupRechargeRewardInfo_19907)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetLimitTimeAddupRechargeRewardInfo_19907 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GetLimitTimeAddupRechargeRewardInfo_19907)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetLimitTimeAddupRechargeRewardInfo_19907 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetLimitTimeAddupRechargeRewardInfo_19907)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GetLimitTimeAddupRechargeRewardInfo_19907 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GetLimitTimeAddupRechargeRewardInfo_19907 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GetLimitTimeAddupRechargeRewardInfo_19907> parser() {
         return PARSER;
      }

      public Parser<C2S_GetLimitTimeAddupRechargeRewardInfo_19907> getParserForType() {
         return PARSER;
      }

      public C2S_GetLimitTimeAddupRechargeRewardInfo_19907 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GetLimitTimeAddupRechargeRewardInfo_19907OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_GetLimitTimeAddupRechargeRewardInfo_19907_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_GetLimitTimeAddupRechargeRewardInfo_19907_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetLimitTimeAddupRechargeRewardInfo_19907.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityExtendMsg.C2S_GetLimitTimeAddupRechargeRewardInfo_19907.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_GetLimitTimeAddupRechargeRewardInfo_19907_descriptor;
         }

         public C2S_GetLimitTimeAddupRechargeRewardInfo_19907 getDefaultInstanceForType() {
            return ActivityExtendMsg.C2S_GetLimitTimeAddupRechargeRewardInfo_19907.getDefaultInstance();
         }

         public C2S_GetLimitTimeAddupRechargeRewardInfo_19907 build() {
            C2S_GetLimitTimeAddupRechargeRewardInfo_19907 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GetLimitTimeAddupRechargeRewardInfo_19907 buildPartial() {
            C2S_GetLimitTimeAddupRechargeRewardInfo_19907 result = new C2S_GetLimitTimeAddupRechargeRewardInfo_19907(this);
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
            if (other instanceof C2S_GetLimitTimeAddupRechargeRewardInfo_19907) {
               return this.mergeFrom((C2S_GetLimitTimeAddupRechargeRewardInfo_19907)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GetLimitTimeAddupRechargeRewardInfo_19907 other) {
            if (other == ActivityExtendMsg.C2S_GetLimitTimeAddupRechargeRewardInfo_19907.getDefaultInstance()) {
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
            C2S_GetLimitTimeAddupRechargeRewardInfo_19907 parsedMessage = null;

            try {
               parsedMessage = (C2S_GetLimitTimeAddupRechargeRewardInfo_19907)ActivityExtendMsg.C2S_GetLimitTimeAddupRechargeRewardInfo_19907.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GetLimitTimeAddupRechargeRewardInfo_19907)e.getUnfinishedMessage();
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

   public static final class S2C_GetLimitTimeAddupRechargeRewardInfo_19908 extends GeneratedMessageV3 implements S2C_GetLimitTimeAddupRechargeRewardInfo_19908OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TOTALRECHARGE_FIELD_NUMBER = 1;
      private int totalRecharge_;
      public static final int GOTGEAR_FIELD_NUMBER = 2;
      private int gotGear_;
      private byte memoizedIsInitialized;
      private static final S2C_GetLimitTimeAddupRechargeRewardInfo_19908 DEFAULT_INSTANCE = new S2C_GetLimitTimeAddupRechargeRewardInfo_19908();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GetLimitTimeAddupRechargeRewardInfo_19908> PARSER = new AbstractParser<S2C_GetLimitTimeAddupRechargeRewardInfo_19908>() {
         public S2C_GetLimitTimeAddupRechargeRewardInfo_19908 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GetLimitTimeAddupRechargeRewardInfo_19908(input, extensionRegistry);
         }
      };

      private S2C_GetLimitTimeAddupRechargeRewardInfo_19908(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GetLimitTimeAddupRechargeRewardInfo_19908() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GetLimitTimeAddupRechargeRewardInfo_19908();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GetLimitTimeAddupRechargeRewardInfo_19908(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.totalRecharge_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.gotGear_ = input.readInt32();
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
         return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_S2C_GetLimitTimeAddupRechargeRewardInfo_19908_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_S2C_GetLimitTimeAddupRechargeRewardInfo_19908_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetLimitTimeAddupRechargeRewardInfo_19908.class, Builder.class);
      }

      public boolean hasTotalRecharge() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTotalRecharge() {
         return this.totalRecharge_;
      }

      public boolean hasGotGear() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getGotGear() {
         return this.gotGear_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTotalRecharge()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGotGear()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.totalRecharge_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.gotGear_);
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
               size += CodedOutputStream.computeInt32Size(1, this.totalRecharge_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.gotGear_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GetLimitTimeAddupRechargeRewardInfo_19908)) {
            return super.equals(obj);
         } else {
            S2C_GetLimitTimeAddupRechargeRewardInfo_19908 other = (S2C_GetLimitTimeAddupRechargeRewardInfo_19908)obj;
            if (this.hasTotalRecharge() != other.hasTotalRecharge()) {
               return false;
            } else if (this.hasTotalRecharge() && this.getTotalRecharge() != other.getTotalRecharge()) {
               return false;
            } else if (this.hasGotGear() != other.hasGotGear()) {
               return false;
            } else if (this.hasGotGear() && this.getGotGear() != other.getGotGear()) {
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
            if (this.hasTotalRecharge()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTotalRecharge();
            }

            if (this.hasGotGear()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGotGear();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GetLimitTimeAddupRechargeRewardInfo_19908 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GetLimitTimeAddupRechargeRewardInfo_19908)PARSER.parseFrom(data);
      }

      public static S2C_GetLimitTimeAddupRechargeRewardInfo_19908 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetLimitTimeAddupRechargeRewardInfo_19908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetLimitTimeAddupRechargeRewardInfo_19908 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GetLimitTimeAddupRechargeRewardInfo_19908)PARSER.parseFrom(data);
      }

      public static S2C_GetLimitTimeAddupRechargeRewardInfo_19908 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetLimitTimeAddupRechargeRewardInfo_19908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetLimitTimeAddupRechargeRewardInfo_19908 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GetLimitTimeAddupRechargeRewardInfo_19908)PARSER.parseFrom(data);
      }

      public static S2C_GetLimitTimeAddupRechargeRewardInfo_19908 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetLimitTimeAddupRechargeRewardInfo_19908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetLimitTimeAddupRechargeRewardInfo_19908 parseFrom(InputStream input) throws IOException {
         return (S2C_GetLimitTimeAddupRechargeRewardInfo_19908)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetLimitTimeAddupRechargeRewardInfo_19908 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetLimitTimeAddupRechargeRewardInfo_19908)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetLimitTimeAddupRechargeRewardInfo_19908 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GetLimitTimeAddupRechargeRewardInfo_19908)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GetLimitTimeAddupRechargeRewardInfo_19908 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetLimitTimeAddupRechargeRewardInfo_19908)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetLimitTimeAddupRechargeRewardInfo_19908 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GetLimitTimeAddupRechargeRewardInfo_19908)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetLimitTimeAddupRechargeRewardInfo_19908 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetLimitTimeAddupRechargeRewardInfo_19908)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GetLimitTimeAddupRechargeRewardInfo_19908 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GetLimitTimeAddupRechargeRewardInfo_19908 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GetLimitTimeAddupRechargeRewardInfo_19908> parser() {
         return PARSER;
      }

      public Parser<S2C_GetLimitTimeAddupRechargeRewardInfo_19908> getParserForType() {
         return PARSER;
      }

      public S2C_GetLimitTimeAddupRechargeRewardInfo_19908 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GetLimitTimeAddupRechargeRewardInfo_19908OrBuilder {
         private int bitField0_;
         private int totalRecharge_;
         private int gotGear_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_S2C_GetLimitTimeAddupRechargeRewardInfo_19908_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_S2C_GetLimitTimeAddupRechargeRewardInfo_19908_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetLimitTimeAddupRechargeRewardInfo_19908.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityExtendMsg.S2C_GetLimitTimeAddupRechargeRewardInfo_19908.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.totalRecharge_ = 0;
            this.bitField0_ &= -2;
            this.gotGear_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_S2C_GetLimitTimeAddupRechargeRewardInfo_19908_descriptor;
         }

         public S2C_GetLimitTimeAddupRechargeRewardInfo_19908 getDefaultInstanceForType() {
            return ActivityExtendMsg.S2C_GetLimitTimeAddupRechargeRewardInfo_19908.getDefaultInstance();
         }

         public S2C_GetLimitTimeAddupRechargeRewardInfo_19908 build() {
            S2C_GetLimitTimeAddupRechargeRewardInfo_19908 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GetLimitTimeAddupRechargeRewardInfo_19908 buildPartial() {
            S2C_GetLimitTimeAddupRechargeRewardInfo_19908 result = new S2C_GetLimitTimeAddupRechargeRewardInfo_19908(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.totalRecharge_ = this.totalRecharge_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.gotGear_ = this.gotGear_;
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
            if (other instanceof S2C_GetLimitTimeAddupRechargeRewardInfo_19908) {
               return this.mergeFrom((S2C_GetLimitTimeAddupRechargeRewardInfo_19908)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GetLimitTimeAddupRechargeRewardInfo_19908 other) {
            if (other == ActivityExtendMsg.S2C_GetLimitTimeAddupRechargeRewardInfo_19908.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTotalRecharge()) {
                  this.setTotalRecharge(other.getTotalRecharge());
               }

               if (other.hasGotGear()) {
                  this.setGotGear(other.getGotGear());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTotalRecharge()) {
               return false;
            } else {
               return this.hasGotGear();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GetLimitTimeAddupRechargeRewardInfo_19908 parsedMessage = null;

            try {
               parsedMessage = (S2C_GetLimitTimeAddupRechargeRewardInfo_19908)ActivityExtendMsg.S2C_GetLimitTimeAddupRechargeRewardInfo_19908.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GetLimitTimeAddupRechargeRewardInfo_19908)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTotalRecharge() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTotalRecharge() {
            return this.totalRecharge_;
         }

         public Builder setTotalRecharge(int value) {
            this.bitField0_ |= 1;
            this.totalRecharge_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalRecharge() {
            this.bitField0_ &= -2;
            this.totalRecharge_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGotGear() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getGotGear() {
            return this.gotGear_;
         }

         public Builder setGotGear(int value) {
            this.bitField0_ |= 2;
            this.gotGear_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGotGear() {
            this.bitField0_ &= -3;
            this.gotGear_ = 0;
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

   public static final class C2S_ReceiveLimitTimeAddupRechargeReward_19909 extends GeneratedMessageV3 implements C2S_ReceiveLimitTimeAddupRechargeReward_19909OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveLimitTimeAddupRechargeReward_19909 DEFAULT_INSTANCE = new C2S_ReceiveLimitTimeAddupRechargeReward_19909();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveLimitTimeAddupRechargeReward_19909> PARSER = new AbstractParser<C2S_ReceiveLimitTimeAddupRechargeReward_19909>() {
         public C2S_ReceiveLimitTimeAddupRechargeReward_19909 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveLimitTimeAddupRechargeReward_19909(input, extensionRegistry);
         }
      };

      private C2S_ReceiveLimitTimeAddupRechargeReward_19909(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveLimitTimeAddupRechargeReward_19909() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveLimitTimeAddupRechargeReward_19909();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveLimitTimeAddupRechargeReward_19909(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_ReceiveLimitTimeAddupRechargeReward_19909_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_ReceiveLimitTimeAddupRechargeReward_19909_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveLimitTimeAddupRechargeReward_19909.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveLimitTimeAddupRechargeReward_19909)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveLimitTimeAddupRechargeReward_19909 other = (C2S_ReceiveLimitTimeAddupRechargeReward_19909)obj;
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

      public static C2S_ReceiveLimitTimeAddupRechargeReward_19909 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveLimitTimeAddupRechargeReward_19909)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveLimitTimeAddupRechargeReward_19909 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveLimitTimeAddupRechargeReward_19909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveLimitTimeAddupRechargeReward_19909 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveLimitTimeAddupRechargeReward_19909)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveLimitTimeAddupRechargeReward_19909 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveLimitTimeAddupRechargeReward_19909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveLimitTimeAddupRechargeReward_19909 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveLimitTimeAddupRechargeReward_19909)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveLimitTimeAddupRechargeReward_19909 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveLimitTimeAddupRechargeReward_19909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveLimitTimeAddupRechargeReward_19909 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveLimitTimeAddupRechargeReward_19909)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveLimitTimeAddupRechargeReward_19909 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveLimitTimeAddupRechargeReward_19909)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveLimitTimeAddupRechargeReward_19909 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveLimitTimeAddupRechargeReward_19909)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveLimitTimeAddupRechargeReward_19909 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveLimitTimeAddupRechargeReward_19909)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveLimitTimeAddupRechargeReward_19909 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveLimitTimeAddupRechargeReward_19909)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveLimitTimeAddupRechargeReward_19909 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveLimitTimeAddupRechargeReward_19909)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveLimitTimeAddupRechargeReward_19909 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveLimitTimeAddupRechargeReward_19909 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveLimitTimeAddupRechargeReward_19909> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveLimitTimeAddupRechargeReward_19909> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveLimitTimeAddupRechargeReward_19909 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveLimitTimeAddupRechargeReward_19909OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_ReceiveLimitTimeAddupRechargeReward_19909_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_ReceiveLimitTimeAddupRechargeReward_19909_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveLimitTimeAddupRechargeReward_19909.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityExtendMsg.C2S_ReceiveLimitTimeAddupRechargeReward_19909.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityExtendMsg.internal_static_activityExtend_com_gzbz_protobuf_C2S_ReceiveLimitTimeAddupRechargeReward_19909_descriptor;
         }

         public C2S_ReceiveLimitTimeAddupRechargeReward_19909 getDefaultInstanceForType() {
            return ActivityExtendMsg.C2S_ReceiveLimitTimeAddupRechargeReward_19909.getDefaultInstance();
         }

         public C2S_ReceiveLimitTimeAddupRechargeReward_19909 build() {
            C2S_ReceiveLimitTimeAddupRechargeReward_19909 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveLimitTimeAddupRechargeReward_19909 buildPartial() {
            C2S_ReceiveLimitTimeAddupRechargeReward_19909 result = new C2S_ReceiveLimitTimeAddupRechargeReward_19909(this);
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
            if (other instanceof C2S_ReceiveLimitTimeAddupRechargeReward_19909) {
               return this.mergeFrom((C2S_ReceiveLimitTimeAddupRechargeReward_19909)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveLimitTimeAddupRechargeReward_19909 other) {
            if (other == ActivityExtendMsg.C2S_ReceiveLimitTimeAddupRechargeReward_19909.getDefaultInstance()) {
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
            C2S_ReceiveLimitTimeAddupRechargeReward_19909 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveLimitTimeAddupRechargeReward_19909)ActivityExtendMsg.C2S_ReceiveLimitTimeAddupRechargeReward_19909.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveLimitTimeAddupRechargeReward_19909)e.getUnfinishedMessage();
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

   public interface C2S_GetLimitTimeAddupRechargeRewardInfo_19907OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GetServerOpenTotalRechargeRewardInfo_19901OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_KoiRecordList_19905OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ReceiveLimitTimeAddupRechargeReward_19909OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ReceiveServerOpenTotalRechargeReward_19903OrBuilder extends MessageOrBuilder {
   }

   public interface KoiRecordOrBuilder extends MessageOrBuilder {
      boolean hasServerId();

      int getServerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasLabel();

      int getLabel();
   }

   public interface S2C_GetLimitTimeAddupRechargeRewardInfo_19908OrBuilder extends MessageOrBuilder {
      boolean hasTotalRecharge();

      int getTotalRecharge();

      boolean hasGotGear();

      int getGotGear();
   }

   public interface S2C_GetServerOpenTotalRechargeRewardInfo_19902OrBuilder extends MessageOrBuilder {
      boolean hasIsReceiveReward();

      boolean getIsReceiveReward();

      boolean hasTotalRecharge();

      int getTotalRecharge();
   }

   public interface S2C_KoiRecordList_19906OrBuilder extends MessageOrBuilder {
      List<KoiRecord> getRecordList();

      KoiRecord getRecord(int index);

      int getRecordCount();

      List<? extends KoiRecordOrBuilder> getRecordOrBuilderList();

      KoiRecordOrBuilder getRecordOrBuilder(int index);
   }
}
