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

public final class QqBigPlayerMsg {
   private static final Descriptors.Descriptor internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_Info_24101_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_Info_24101_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_Info_24102_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_Info_24102_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_QqBigPlayer_com_gzbz_protobuf_WeekGiftInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_QqBigPlayer_com_gzbz_protobuf_WeekGiftInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecGift_24103_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecGift_24103_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecGift_24104_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecGift_24104_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecWanKaLvBox_24105_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecWanKaLvBox_24105_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecWanKaLvBox_24106_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecWanKaLvBox_24106_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecWeekGift_24107_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecWeekGift_24107_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecWeekGift_24108_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecWeekGift_24108_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private QqBigPlayerMsg() {
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
      String[] descriptorData = new String[]{"\n\u0011QqBigPlayer.proto\u0012\u001dQqBigPlayer.com.gzbz.protobuf\u001a\fcommon.proto\"\u0010\n\u000eC2S_Info_24101\"¸\u0002\n\u000eS2C_Info_24102\u0012\u0011\n\tisSysOpen\u0018\u0001 \u0002(\b\u0012\u0010\n\bvalCount\u0018\u0002 \u0002(\u0003\u0012\n\n\u0002lv\u0018\u0003 \u0002(\u0005\u0012\u0014\n\fisRecRegGift\u0018\u0004 \u0002(\b\u0012\u0019\n\u0011isRecDailyActGift\u0018\u0005 \u0002(\b\u0012\u0014\n\frecLevelGift\u0018\u0006 \u0003(\u0005\u0012\u0015\n\rrecWanKaLvBox\u0018\u0007 \u0003(\u0005\u0012\u0015\n\rnoHighOrderLv\u0018\b \u0002(\u0005\u0012\u0013\n\u000brecWeekGift\u0018\t \u0003(\u0005\u0012\u0016\n\u000epayReturnCount\u0018\n \u0002(\u0005\u0012A\n\fweekGiftInfo\u0018\u000b \u0003(\u000b2+.QqBigPlayer.com.gzbz.protobuf.WeekGiftInfo\u0012\u0010\n\bdiscount\u0018\f \u0002(\u0005\".\n\fWeekGiftInfo\u0012\u000f\n\u0007wanKaLv\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005state\u0018\u0002 \u0002(\u0005\"4\n\u0011C2S_RecGift_24103\u0012\u0010\n\bgiftType\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005param\u0018\u0002 \u0001(\u0005\"\u0013\n\u0011S2C_RecGift_24104\"%\n\u0017C2S_RecWanKaLvBox_24105\u0012\n\n\u0002lv\u0018\u0001 \u0002(\u0005\"\u0019\n\u0017S2C_RecWanKaLvBox_24106\"#\n\u0015C2S_RecWeekGift_24107\u0012\n\n\u0002lv\u0018\u0002 \u0002(\u0005\"\u0017\n\u0015S2C_RecWeekGift_24108B%\n\u0011com.gzbz.protobufB\u000eQqBigPlayerMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_Info_24101_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_Info_24101_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_Info_24101_descriptor, new String[0]);
      internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_Info_24102_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_Info_24102_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_Info_24102_descriptor, new String[]{"IsSysOpen", "ValCount", "Lv", "IsRecRegGift", "IsRecDailyActGift", "RecLevelGift", "RecWanKaLvBox", "NoHighOrderLv", "RecWeekGift", "PayReturnCount", "WeekGiftInfo", "Discount"});
      internal_static_QqBigPlayer_com_gzbz_protobuf_WeekGiftInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_QqBigPlayer_com_gzbz_protobuf_WeekGiftInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_QqBigPlayer_com_gzbz_protobuf_WeekGiftInfo_descriptor, new String[]{"WanKaLv", "State"});
      internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecGift_24103_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecGift_24103_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecGift_24103_descriptor, new String[]{"GiftType", "Param"});
      internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecGift_24104_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecGift_24104_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecGift_24104_descriptor, new String[0]);
      internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecWanKaLvBox_24105_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecWanKaLvBox_24105_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecWanKaLvBox_24105_descriptor, new String[]{"Lv"});
      internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecWanKaLvBox_24106_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecWanKaLvBox_24106_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecWanKaLvBox_24106_descriptor, new String[0]);
      internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecWeekGift_24107_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecWeekGift_24107_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecWeekGift_24107_descriptor, new String[]{"Lv"});
      internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecWeekGift_24108_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecWeekGift_24108_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecWeekGift_24108_descriptor, new String[0]);
      CommonMsg.getDescriptor();
   }

   public static final class C2S_Info_24101 extends GeneratedMessageV3 implements C2S_Info_24101OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Info_24101 DEFAULT_INSTANCE = new C2S_Info_24101();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Info_24101> PARSER = new AbstractParser<C2S_Info_24101>() {
         public C2S_Info_24101 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Info_24101(input, extensionRegistry);
         }
      };

      private C2S_Info_24101(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Info_24101() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Info_24101();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Info_24101(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_Info_24101_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_Info_24101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Info_24101.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Info_24101)) {
            return super.equals(obj);
         } else {
            C2S_Info_24101 other = (C2S_Info_24101)obj;
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

      public static C2S_Info_24101 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Info_24101)PARSER.parseFrom(data);
      }

      public static C2S_Info_24101 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Info_24101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Info_24101 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Info_24101)PARSER.parseFrom(data);
      }

      public static C2S_Info_24101 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Info_24101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Info_24101 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Info_24101)PARSER.parseFrom(data);
      }

      public static C2S_Info_24101 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Info_24101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Info_24101 parseFrom(InputStream input) throws IOException {
         return (C2S_Info_24101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Info_24101 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Info_24101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Info_24101 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Info_24101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Info_24101 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Info_24101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Info_24101 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Info_24101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Info_24101 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Info_24101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Info_24101 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Info_24101 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Info_24101> parser() {
         return PARSER;
      }

      public Parser<C2S_Info_24101> getParserForType() {
         return PARSER;
      }

      public C2S_Info_24101 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Info_24101OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_Info_24101_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_Info_24101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Info_24101.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (QqBigPlayerMsg.C2S_Info_24101.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_Info_24101_descriptor;
         }

         public C2S_Info_24101 getDefaultInstanceForType() {
            return QqBigPlayerMsg.C2S_Info_24101.getDefaultInstance();
         }

         public C2S_Info_24101 build() {
            C2S_Info_24101 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Info_24101 buildPartial() {
            C2S_Info_24101 result = new C2S_Info_24101(this);
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
            if (other instanceof C2S_Info_24101) {
               return this.mergeFrom((C2S_Info_24101)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Info_24101 other) {
            if (other == QqBigPlayerMsg.C2S_Info_24101.getDefaultInstance()) {
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
            C2S_Info_24101 parsedMessage = null;

            try {
               parsedMessage = (C2S_Info_24101)QqBigPlayerMsg.C2S_Info_24101.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Info_24101)e.getUnfinishedMessage();
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

   public static final class S2C_Info_24102 extends GeneratedMessageV3 implements S2C_Info_24102OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ISSYSOPEN_FIELD_NUMBER = 1;
      private boolean isSysOpen_;
      public static final int VALCOUNT_FIELD_NUMBER = 2;
      private long valCount_;
      public static final int LV_FIELD_NUMBER = 3;
      private int lv_;
      public static final int ISRECREGGIFT_FIELD_NUMBER = 4;
      private boolean isRecRegGift_;
      public static final int ISRECDAILYACTGIFT_FIELD_NUMBER = 5;
      private boolean isRecDailyActGift_;
      public static final int RECLEVELGIFT_FIELD_NUMBER = 6;
      private Internal.IntList recLevelGift_;
      public static final int RECWANKALVBOX_FIELD_NUMBER = 7;
      private Internal.IntList recWanKaLvBox_;
      public static final int NOHIGHORDERLV_FIELD_NUMBER = 8;
      private int noHighOrderLv_;
      public static final int RECWEEKGIFT_FIELD_NUMBER = 9;
      private Internal.IntList recWeekGift_;
      public static final int PAYRETURNCOUNT_FIELD_NUMBER = 10;
      private int payReturnCount_;
      public static final int WEEKGIFTINFO_FIELD_NUMBER = 11;
      private List<WeekGiftInfo> weekGiftInfo_;
      public static final int DISCOUNT_FIELD_NUMBER = 12;
      private int discount_;
      private byte memoizedIsInitialized;
      private static final S2C_Info_24102 DEFAULT_INSTANCE = new S2C_Info_24102();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Info_24102> PARSER = new AbstractParser<S2C_Info_24102>() {
         public S2C_Info_24102 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Info_24102(input, extensionRegistry);
         }
      };

      private S2C_Info_24102(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Info_24102() {
         this.memoizedIsInitialized = -1;
         this.recLevelGift_ = emptyIntList();
         this.recWanKaLvBox_ = emptyIntList();
         this.recWeekGift_ = emptyIntList();
         this.weekGiftInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Info_24102();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Info_24102(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.isSysOpen_ = input.readBool();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.valCount_ = input.readInt64();
                        continue;
                     case 24:
                        this.bitField0_ |= 4;
                        this.lv_ = input.readInt32();
                        continue;
                     case 32:
                        this.bitField0_ |= 8;
                        this.isRecRegGift_ = input.readBool();
                        continue;
                     case 40:
                        this.bitField0_ |= 16;
                        this.isRecDailyActGift_ = input.readBool();
                        continue;
                     case 48:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.recLevelGift_ = newIntList();
                           mutable_bitField0_ |= 32;
                        }

                        this.recLevelGift_.addInt(input.readInt32());
                        continue;
                     case 50:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 32) == 0 && input.getBytesUntilLimit() > 0) {
                           this.recLevelGift_ = newIntList();
                           mutable_bitField0_ |= 32;
                        }
                        break;
                     case 56:
                        if ((mutable_bitField0_ & 64) == 0) {
                           this.recWanKaLvBox_ = newIntList();
                           mutable_bitField0_ |= 64;
                        }

                        this.recWanKaLvBox_.addInt(input.readInt32());
                        continue;
                     case 58:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 64) == 0 && input.getBytesUntilLimit() > 0) {
                           this.recWanKaLvBox_ = newIntList();
                           mutable_bitField0_ |= 64;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.recWanKaLvBox_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 64:
                        this.bitField0_ |= 32;
                        this.noHighOrderLv_ = input.readInt32();
                        continue;
                     case 72:
                        if ((mutable_bitField0_ & 256) == 0) {
                           this.recWeekGift_ = newIntList();
                           mutable_bitField0_ |= 256;
                        }

                        this.recWeekGift_.addInt(input.readInt32());
                        continue;
                     case 74:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 256) == 0 && input.getBytesUntilLimit() > 0) {
                           this.recWeekGift_ = newIntList();
                           mutable_bitField0_ |= 256;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.recWeekGift_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 80:
                        this.bitField0_ |= 64;
                        this.payReturnCount_ = input.readInt32();
                        continue;
                     case 90:
                        if ((mutable_bitField0_ & 1024) == 0) {
                           this.weekGiftInfo_ = new ArrayList();
                           mutable_bitField0_ |= 1024;
                        }

                        this.weekGiftInfo_.add(input.readMessage(QqBigPlayerMsg.WeekGiftInfo.PARSER, extensionRegistry));
                        continue;
                     case 96:
                        this.bitField0_ |= 128;
                        this.discount_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.recLevelGift_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 32) != 0) {
                  this.recLevelGift_.makeImmutable();
               }

               if ((mutable_bitField0_ & 64) != 0) {
                  this.recWanKaLvBox_.makeImmutable();
               }

               if ((mutable_bitField0_ & 256) != 0) {
                  this.recWeekGift_.makeImmutable();
               }

               if ((mutable_bitField0_ & 1024) != 0) {
                  this.weekGiftInfo_ = Collections.unmodifiableList(this.weekGiftInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_Info_24102_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_Info_24102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Info_24102.class, Builder.class);
      }

      public boolean hasIsSysOpen() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsSysOpen() {
         return this.isSysOpen_;
      }

      public boolean hasValCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getValCount() {
         return this.valCount_;
      }

      public boolean hasLv() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public boolean hasIsRecRegGift() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getIsRecRegGift() {
         return this.isRecRegGift_;
      }

      public boolean hasIsRecDailyActGift() {
         return (this.bitField0_ & 16) != 0;
      }

      public boolean getIsRecDailyActGift() {
         return this.isRecDailyActGift_;
      }

      public List<Integer> getRecLevelGiftList() {
         return this.recLevelGift_;
      }

      public int getRecLevelGiftCount() {
         return this.recLevelGift_.size();
      }

      public int getRecLevelGift(int index) {
         return this.recLevelGift_.getInt(index);
      }

      public List<Integer> getRecWanKaLvBoxList() {
         return this.recWanKaLvBox_;
      }

      public int getRecWanKaLvBoxCount() {
         return this.recWanKaLvBox_.size();
      }

      public int getRecWanKaLvBox(int index) {
         return this.recWanKaLvBox_.getInt(index);
      }

      public boolean hasNoHighOrderLv() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getNoHighOrderLv() {
         return this.noHighOrderLv_;
      }

      public List<Integer> getRecWeekGiftList() {
         return this.recWeekGift_;
      }

      public int getRecWeekGiftCount() {
         return this.recWeekGift_.size();
      }

      public int getRecWeekGift(int index) {
         return this.recWeekGift_.getInt(index);
      }

      public boolean hasPayReturnCount() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getPayReturnCount() {
         return this.payReturnCount_;
      }

      public List<WeekGiftInfo> getWeekGiftInfoList() {
         return this.weekGiftInfo_;
      }

      public List<? extends WeekGiftInfoOrBuilder> getWeekGiftInfoOrBuilderList() {
         return this.weekGiftInfo_;
      }

      public int getWeekGiftInfoCount() {
         return this.weekGiftInfo_.size();
      }

      public WeekGiftInfo getWeekGiftInfo(int index) {
         return (WeekGiftInfo)this.weekGiftInfo_.get(index);
      }

      public WeekGiftInfoOrBuilder getWeekGiftInfoOrBuilder(int index) {
         return (WeekGiftInfoOrBuilder)this.weekGiftInfo_.get(index);
      }

      public boolean hasDiscount() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getDiscount() {
         return this.discount_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIsSysOpen()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasValCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsRecRegGift()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsRecDailyActGift()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasNoHighOrderLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPayReturnCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDiscount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getWeekGiftInfoCount(); ++i) {
               if (!this.getWeekGiftInfo(i).isInitialized()) {
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
            output.writeBool(1, this.isSysOpen_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.valCount_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.lv_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBool(4, this.isRecRegGift_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeBool(5, this.isRecDailyActGift_);
         }

         for(int i = 0; i < this.recLevelGift_.size(); ++i) {
            output.writeInt32(6, this.recLevelGift_.getInt(i));
         }

         for(int i = 0; i < this.recWanKaLvBox_.size(); ++i) {
            output.writeInt32(7, this.recWanKaLvBox_.getInt(i));
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(8, this.noHighOrderLv_);
         }

         for(int i = 0; i < this.recWeekGift_.size(); ++i) {
            output.writeInt32(9, this.recWeekGift_.getInt(i));
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(10, this.payReturnCount_);
         }

         for(int i = 0; i < this.weekGiftInfo_.size(); ++i) {
            output.writeMessage(11, (MessageLite)this.weekGiftInfo_.get(i));
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(12, this.discount_);
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
               size += CodedOutputStream.computeBoolSize(1, this.isSysOpen_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.valCount_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.lv_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.isRecRegGift_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeBoolSize(5, this.isRecDailyActGift_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.recLevelGift_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.recLevelGift_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRecLevelGiftList().size();
            dataSize = 0;

            for(int i = 0; i < this.recWanKaLvBox_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.recWanKaLvBox_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRecWanKaLvBoxList().size();
            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.noHighOrderLv_);
            }

            dataSize = 0;

            for(int i = 0; i < this.recWeekGift_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.recWeekGift_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRecWeekGiftList().size();
            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.payReturnCount_);
            }

            for(int i = 0; i < this.weekGiftInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(11, (MessageLite)this.weekGiftInfo_.get(i));
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(12, this.discount_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Info_24102)) {
            return super.equals(obj);
         } else {
            S2C_Info_24102 other = (S2C_Info_24102)obj;
            if (this.hasIsSysOpen() != other.hasIsSysOpen()) {
               return false;
            } else if (this.hasIsSysOpen() && this.getIsSysOpen() != other.getIsSysOpen()) {
               return false;
            } else if (this.hasValCount() != other.hasValCount()) {
               return false;
            } else if (this.hasValCount() && this.getValCount() != other.getValCount()) {
               return false;
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
               return false;
            } else if (this.hasIsRecRegGift() != other.hasIsRecRegGift()) {
               return false;
            } else if (this.hasIsRecRegGift() && this.getIsRecRegGift() != other.getIsRecRegGift()) {
               return false;
            } else if (this.hasIsRecDailyActGift() != other.hasIsRecDailyActGift()) {
               return false;
            } else if (this.hasIsRecDailyActGift() && this.getIsRecDailyActGift() != other.getIsRecDailyActGift()) {
               return false;
            } else if (!this.getRecLevelGiftList().equals(other.getRecLevelGiftList())) {
               return false;
            } else if (!this.getRecWanKaLvBoxList().equals(other.getRecWanKaLvBoxList())) {
               return false;
            } else if (this.hasNoHighOrderLv() != other.hasNoHighOrderLv()) {
               return false;
            } else if (this.hasNoHighOrderLv() && this.getNoHighOrderLv() != other.getNoHighOrderLv()) {
               return false;
            } else if (!this.getRecWeekGiftList().equals(other.getRecWeekGiftList())) {
               return false;
            } else if (this.hasPayReturnCount() != other.hasPayReturnCount()) {
               return false;
            } else if (this.hasPayReturnCount() && this.getPayReturnCount() != other.getPayReturnCount()) {
               return false;
            } else if (!this.getWeekGiftInfoList().equals(other.getWeekGiftInfoList())) {
               return false;
            } else if (this.hasDiscount() != other.hasDiscount()) {
               return false;
            } else if (this.hasDiscount() && this.getDiscount() != other.getDiscount()) {
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
            if (this.hasIsSysOpen()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getIsSysOpen());
            }

            if (this.hasValCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getValCount());
            }

            if (this.hasLv()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLv();
            }

            if (this.hasIsRecRegGift()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getIsRecRegGift());
            }

            if (this.hasIsRecDailyActGift()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashBoolean(this.getIsRecDailyActGift());
            }

            if (this.getRecLevelGiftCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getRecLevelGiftList().hashCode();
            }

            if (this.getRecWanKaLvBoxCount() > 0) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getRecWanKaLvBoxList().hashCode();
            }

            if (this.hasNoHighOrderLv()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getNoHighOrderLv();
            }

            if (this.getRecWeekGiftCount() > 0) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getRecWeekGiftList().hashCode();
            }

            if (this.hasPayReturnCount()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getPayReturnCount();
            }

            if (this.getWeekGiftInfoCount() > 0) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getWeekGiftInfoList().hashCode();
            }

            if (this.hasDiscount()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getDiscount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Info_24102 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Info_24102)PARSER.parseFrom(data);
      }

      public static S2C_Info_24102 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Info_24102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Info_24102 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Info_24102)PARSER.parseFrom(data);
      }

      public static S2C_Info_24102 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Info_24102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Info_24102 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Info_24102)PARSER.parseFrom(data);
      }

      public static S2C_Info_24102 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Info_24102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Info_24102 parseFrom(InputStream input) throws IOException {
         return (S2C_Info_24102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Info_24102 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Info_24102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Info_24102 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Info_24102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Info_24102 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Info_24102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Info_24102 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Info_24102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Info_24102 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Info_24102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Info_24102 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Info_24102 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Info_24102> parser() {
         return PARSER;
      }

      public Parser<S2C_Info_24102> getParserForType() {
         return PARSER;
      }

      public S2C_Info_24102 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Info_24102OrBuilder {
         private int bitField0_;
         private boolean isSysOpen_;
         private long valCount_;
         private int lv_;
         private boolean isRecRegGift_;
         private boolean isRecDailyActGift_;
         private Internal.IntList recLevelGift_;
         private Internal.IntList recWanKaLvBox_;
         private int noHighOrderLv_;
         private Internal.IntList recWeekGift_;
         private int payReturnCount_;
         private List<WeekGiftInfo> weekGiftInfo_;
         private RepeatedFieldBuilderV3<WeekGiftInfo, WeekGiftInfo.Builder, WeekGiftInfoOrBuilder> weekGiftInfoBuilder_;
         private int discount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_Info_24102_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_Info_24102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Info_24102.class, Builder.class);
         }

         private Builder() {
            this.recLevelGift_ = QqBigPlayerMsg.S2C_Info_24102.emptyIntList();
            this.recWanKaLvBox_ = QqBigPlayerMsg.S2C_Info_24102.emptyIntList();
            this.recWeekGift_ = QqBigPlayerMsg.S2C_Info_24102.emptyIntList();
            this.weekGiftInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.recLevelGift_ = QqBigPlayerMsg.S2C_Info_24102.emptyIntList();
            this.recWanKaLvBox_ = QqBigPlayerMsg.S2C_Info_24102.emptyIntList();
            this.recWeekGift_ = QqBigPlayerMsg.S2C_Info_24102.emptyIntList();
            this.weekGiftInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (QqBigPlayerMsg.S2C_Info_24102.alwaysUseFieldBuilders) {
               this.getWeekGiftInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.isSysOpen_ = false;
            this.bitField0_ &= -2;
            this.valCount_ = 0L;
            this.bitField0_ &= -3;
            this.lv_ = 0;
            this.bitField0_ &= -5;
            this.isRecRegGift_ = false;
            this.bitField0_ &= -9;
            this.isRecDailyActGift_ = false;
            this.bitField0_ &= -17;
            this.recLevelGift_ = QqBigPlayerMsg.S2C_Info_24102.emptyIntList();
            this.bitField0_ &= -33;
            this.recWanKaLvBox_ = QqBigPlayerMsg.S2C_Info_24102.emptyIntList();
            this.bitField0_ &= -65;
            this.noHighOrderLv_ = 0;
            this.bitField0_ &= -129;
            this.recWeekGift_ = QqBigPlayerMsg.S2C_Info_24102.emptyIntList();
            this.bitField0_ &= -257;
            this.payReturnCount_ = 0;
            this.bitField0_ &= -513;
            if (this.weekGiftInfoBuilder_ == null) {
               this.weekGiftInfo_ = Collections.emptyList();
               this.bitField0_ &= -1025;
            } else {
               this.weekGiftInfoBuilder_.clear();
            }

            this.discount_ = 0;
            this.bitField0_ &= -2049;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_Info_24102_descriptor;
         }

         public S2C_Info_24102 getDefaultInstanceForType() {
            return QqBigPlayerMsg.S2C_Info_24102.getDefaultInstance();
         }

         public S2C_Info_24102 build() {
            S2C_Info_24102 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Info_24102 buildPartial() {
            S2C_Info_24102 result = new S2C_Info_24102(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.isSysOpen_ = this.isSysOpen_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.valCount_ = this.valCount_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.lv_ = this.lv_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.isRecRegGift_ = this.isRecRegGift_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.isRecDailyActGift_ = this.isRecDailyActGift_;
               to_bitField0_ |= 16;
            }

            if ((this.bitField0_ & 32) != 0) {
               this.recLevelGift_.makeImmutable();
               this.bitField0_ &= -33;
            }

            result.recLevelGift_ = this.recLevelGift_;
            if ((this.bitField0_ & 64) != 0) {
               this.recWanKaLvBox_.makeImmutable();
               this.bitField0_ &= -65;
            }

            result.recWanKaLvBox_ = this.recWanKaLvBox_;
            if ((from_bitField0_ & 128) != 0) {
               result.noHighOrderLv_ = this.noHighOrderLv_;
               to_bitField0_ |= 32;
            }

            if ((this.bitField0_ & 256) != 0) {
               this.recWeekGift_.makeImmutable();
               this.bitField0_ &= -257;
            }

            result.recWeekGift_ = this.recWeekGift_;
            if ((from_bitField0_ & 512) != 0) {
               result.payReturnCount_ = this.payReturnCount_;
               to_bitField0_ |= 64;
            }

            if (this.weekGiftInfoBuilder_ == null) {
               if ((this.bitField0_ & 1024) != 0) {
                  this.weekGiftInfo_ = Collections.unmodifiableList(this.weekGiftInfo_);
                  this.bitField0_ &= -1025;
               }

               result.weekGiftInfo_ = this.weekGiftInfo_;
            } else {
               result.weekGiftInfo_ = this.weekGiftInfoBuilder_.build();
            }

            if ((from_bitField0_ & 2048) != 0) {
               result.discount_ = this.discount_;
               to_bitField0_ |= 128;
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
            if (other instanceof S2C_Info_24102) {
               return this.mergeFrom((S2C_Info_24102)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Info_24102 other) {
            if (other == QqBigPlayerMsg.S2C_Info_24102.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIsSysOpen()) {
                  this.setIsSysOpen(other.getIsSysOpen());
               }

               if (other.hasValCount()) {
                  this.setValCount(other.getValCount());
               }

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               if (other.hasIsRecRegGift()) {
                  this.setIsRecRegGift(other.getIsRecRegGift());
               }

               if (other.hasIsRecDailyActGift()) {
                  this.setIsRecDailyActGift(other.getIsRecDailyActGift());
               }

               if (!other.recLevelGift_.isEmpty()) {
                  if (this.recLevelGift_.isEmpty()) {
                     this.recLevelGift_ = other.recLevelGift_;
                     this.bitField0_ &= -33;
                  } else {
                     this.ensureRecLevelGiftIsMutable();
                     this.recLevelGift_.addAll(other.recLevelGift_);
                  }

                  this.onChanged();
               }

               if (!other.recWanKaLvBox_.isEmpty()) {
                  if (this.recWanKaLvBox_.isEmpty()) {
                     this.recWanKaLvBox_ = other.recWanKaLvBox_;
                     this.bitField0_ &= -65;
                  } else {
                     this.ensureRecWanKaLvBoxIsMutable();
                     this.recWanKaLvBox_.addAll(other.recWanKaLvBox_);
                  }

                  this.onChanged();
               }

               if (other.hasNoHighOrderLv()) {
                  this.setNoHighOrderLv(other.getNoHighOrderLv());
               }

               if (!other.recWeekGift_.isEmpty()) {
                  if (this.recWeekGift_.isEmpty()) {
                     this.recWeekGift_ = other.recWeekGift_;
                     this.bitField0_ &= -257;
                  } else {
                     this.ensureRecWeekGiftIsMutable();
                     this.recWeekGift_.addAll(other.recWeekGift_);
                  }

                  this.onChanged();
               }

               if (other.hasPayReturnCount()) {
                  this.setPayReturnCount(other.getPayReturnCount());
               }

               if (this.weekGiftInfoBuilder_ == null) {
                  if (!other.weekGiftInfo_.isEmpty()) {
                     if (this.weekGiftInfo_.isEmpty()) {
                        this.weekGiftInfo_ = other.weekGiftInfo_;
                        this.bitField0_ &= -1025;
                     } else {
                        this.ensureWeekGiftInfoIsMutable();
                        this.weekGiftInfo_.addAll(other.weekGiftInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.weekGiftInfo_.isEmpty()) {
                  if (this.weekGiftInfoBuilder_.isEmpty()) {
                     this.weekGiftInfoBuilder_.dispose();
                     this.weekGiftInfoBuilder_ = null;
                     this.weekGiftInfo_ = other.weekGiftInfo_;
                     this.bitField0_ &= -1025;
                     this.weekGiftInfoBuilder_ = QqBigPlayerMsg.S2C_Info_24102.alwaysUseFieldBuilders ? this.getWeekGiftInfoFieldBuilder() : null;
                  } else {
                     this.weekGiftInfoBuilder_.addAllMessages(other.weekGiftInfo_);
                  }
               }

               if (other.hasDiscount()) {
                  this.setDiscount(other.getDiscount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasIsSysOpen()) {
               return false;
            } else if (!this.hasValCount()) {
               return false;
            } else if (!this.hasLv()) {
               return false;
            } else if (!this.hasIsRecRegGift()) {
               return false;
            } else if (!this.hasIsRecDailyActGift()) {
               return false;
            } else if (!this.hasNoHighOrderLv()) {
               return false;
            } else if (!this.hasPayReturnCount()) {
               return false;
            } else if (!this.hasDiscount()) {
               return false;
            } else {
               for(int i = 0; i < this.getWeekGiftInfoCount(); ++i) {
                  if (!this.getWeekGiftInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Info_24102 parsedMessage = null;

            try {
               parsedMessage = (S2C_Info_24102)QqBigPlayerMsg.S2C_Info_24102.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Info_24102)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIsSysOpen() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getIsSysOpen() {
            return this.isSysOpen_;
         }

         public Builder setIsSysOpen(boolean value) {
            this.bitField0_ |= 1;
            this.isSysOpen_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsSysOpen() {
            this.bitField0_ &= -2;
            this.isSysOpen_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasValCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getValCount() {
            return this.valCount_;
         }

         public Builder setValCount(long value) {
            this.bitField0_ |= 2;
            this.valCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearValCount() {
            this.bitField0_ &= -3;
            this.valCount_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasLv() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 4;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -5;
            this.lv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsRecRegGift() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getIsRecRegGift() {
            return this.isRecRegGift_;
         }

         public Builder setIsRecRegGift(boolean value) {
            this.bitField0_ |= 8;
            this.isRecRegGift_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsRecRegGift() {
            this.bitField0_ &= -9;
            this.isRecRegGift_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasIsRecDailyActGift() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getIsRecDailyActGift() {
            return this.isRecDailyActGift_;
         }

         public Builder setIsRecDailyActGift(boolean value) {
            this.bitField0_ |= 16;
            this.isRecDailyActGift_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsRecDailyActGift() {
            this.bitField0_ &= -17;
            this.isRecDailyActGift_ = false;
            this.onChanged();
            return this;
         }

         private void ensureRecLevelGiftIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.recLevelGift_ = QqBigPlayerMsg.S2C_Info_24102.mutableCopy(this.recLevelGift_);
               this.bitField0_ |= 32;
            }

         }

         public List<Integer> getRecLevelGiftList() {
            return (List<Integer>)((this.bitField0_ & 32) != 0 ? Collections.unmodifiableList(this.recLevelGift_) : this.recLevelGift_);
         }

         public int getRecLevelGiftCount() {
            return this.recLevelGift_.size();
         }

         public int getRecLevelGift(int index) {
            return this.recLevelGift_.getInt(index);
         }

         public Builder setRecLevelGift(int index, int value) {
            this.ensureRecLevelGiftIsMutable();
            this.recLevelGift_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRecLevelGift(int value) {
            this.ensureRecLevelGiftIsMutable();
            this.recLevelGift_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRecLevelGift(Iterable<? extends Integer> values) {
            this.ensureRecLevelGiftIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recLevelGift_);
            this.onChanged();
            return this;
         }

         public Builder clearRecLevelGift() {
            this.recLevelGift_ = QqBigPlayerMsg.S2C_Info_24102.emptyIntList();
            this.bitField0_ &= -33;
            this.onChanged();
            return this;
         }

         private void ensureRecWanKaLvBoxIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
               this.recWanKaLvBox_ = QqBigPlayerMsg.S2C_Info_24102.mutableCopy(this.recWanKaLvBox_);
               this.bitField0_ |= 64;
            }

         }

         public List<Integer> getRecWanKaLvBoxList() {
            return (List<Integer>)((this.bitField0_ & 64) != 0 ? Collections.unmodifiableList(this.recWanKaLvBox_) : this.recWanKaLvBox_);
         }

         public int getRecWanKaLvBoxCount() {
            return this.recWanKaLvBox_.size();
         }

         public int getRecWanKaLvBox(int index) {
            return this.recWanKaLvBox_.getInt(index);
         }

         public Builder setRecWanKaLvBox(int index, int value) {
            this.ensureRecWanKaLvBoxIsMutable();
            this.recWanKaLvBox_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRecWanKaLvBox(int value) {
            this.ensureRecWanKaLvBoxIsMutable();
            this.recWanKaLvBox_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRecWanKaLvBox(Iterable<? extends Integer> values) {
            this.ensureRecWanKaLvBoxIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recWanKaLvBox_);
            this.onChanged();
            return this;
         }

         public Builder clearRecWanKaLvBox() {
            this.recWanKaLvBox_ = QqBigPlayerMsg.S2C_Info_24102.emptyIntList();
            this.bitField0_ &= -65;
            this.onChanged();
            return this;
         }

         public boolean hasNoHighOrderLv() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getNoHighOrderLv() {
            return this.noHighOrderLv_;
         }

         public Builder setNoHighOrderLv(int value) {
            this.bitField0_ |= 128;
            this.noHighOrderLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNoHighOrderLv() {
            this.bitField0_ &= -129;
            this.noHighOrderLv_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRecWeekGiftIsMutable() {
            if ((this.bitField0_ & 256) == 0) {
               this.recWeekGift_ = QqBigPlayerMsg.S2C_Info_24102.mutableCopy(this.recWeekGift_);
               this.bitField0_ |= 256;
            }

         }

         public List<Integer> getRecWeekGiftList() {
            return (List<Integer>)((this.bitField0_ & 256) != 0 ? Collections.unmodifiableList(this.recWeekGift_) : this.recWeekGift_);
         }

         public int getRecWeekGiftCount() {
            return this.recWeekGift_.size();
         }

         public int getRecWeekGift(int index) {
            return this.recWeekGift_.getInt(index);
         }

         public Builder setRecWeekGift(int index, int value) {
            this.ensureRecWeekGiftIsMutable();
            this.recWeekGift_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRecWeekGift(int value) {
            this.ensureRecWeekGiftIsMutable();
            this.recWeekGift_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRecWeekGift(Iterable<? extends Integer> values) {
            this.ensureRecWeekGiftIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recWeekGift_);
            this.onChanged();
            return this;
         }

         public Builder clearRecWeekGift() {
            this.recWeekGift_ = QqBigPlayerMsg.S2C_Info_24102.emptyIntList();
            this.bitField0_ &= -257;
            this.onChanged();
            return this;
         }

         public boolean hasPayReturnCount() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getPayReturnCount() {
            return this.payReturnCount_;
         }

         public Builder setPayReturnCount(int value) {
            this.bitField0_ |= 512;
            this.payReturnCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPayReturnCount() {
            this.bitField0_ &= -513;
            this.payReturnCount_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureWeekGiftInfoIsMutable() {
            if ((this.bitField0_ & 1024) == 0) {
               this.weekGiftInfo_ = new ArrayList(this.weekGiftInfo_);
               this.bitField0_ |= 1024;
            }

         }

         public List<WeekGiftInfo> getWeekGiftInfoList() {
            return this.weekGiftInfoBuilder_ == null ? Collections.unmodifiableList(this.weekGiftInfo_) : this.weekGiftInfoBuilder_.getMessageList();
         }

         public int getWeekGiftInfoCount() {
            return this.weekGiftInfoBuilder_ == null ? this.weekGiftInfo_.size() : this.weekGiftInfoBuilder_.getCount();
         }

         public WeekGiftInfo getWeekGiftInfo(int index) {
            return this.weekGiftInfoBuilder_ == null ? (WeekGiftInfo)this.weekGiftInfo_.get(index) : (WeekGiftInfo)this.weekGiftInfoBuilder_.getMessage(index);
         }

         public Builder setWeekGiftInfo(int index, WeekGiftInfo value) {
            if (this.weekGiftInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWeekGiftInfoIsMutable();
               this.weekGiftInfo_.set(index, value);
               this.onChanged();
            } else {
               this.weekGiftInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setWeekGiftInfo(int index, WeekGiftInfo.Builder builderForValue) {
            if (this.weekGiftInfoBuilder_ == null) {
               this.ensureWeekGiftInfoIsMutable();
               this.weekGiftInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.weekGiftInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addWeekGiftInfo(WeekGiftInfo value) {
            if (this.weekGiftInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWeekGiftInfoIsMutable();
               this.weekGiftInfo_.add(value);
               this.onChanged();
            } else {
               this.weekGiftInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addWeekGiftInfo(int index, WeekGiftInfo value) {
            if (this.weekGiftInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWeekGiftInfoIsMutable();
               this.weekGiftInfo_.add(index, value);
               this.onChanged();
            } else {
               this.weekGiftInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addWeekGiftInfo(WeekGiftInfo.Builder builderForValue) {
            if (this.weekGiftInfoBuilder_ == null) {
               this.ensureWeekGiftInfoIsMutable();
               this.weekGiftInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.weekGiftInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addWeekGiftInfo(int index, WeekGiftInfo.Builder builderForValue) {
            if (this.weekGiftInfoBuilder_ == null) {
               this.ensureWeekGiftInfoIsMutable();
               this.weekGiftInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.weekGiftInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllWeekGiftInfo(Iterable<? extends WeekGiftInfo> values) {
            if (this.weekGiftInfoBuilder_ == null) {
               this.ensureWeekGiftInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.weekGiftInfo_);
               this.onChanged();
            } else {
               this.weekGiftInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearWeekGiftInfo() {
            if (this.weekGiftInfoBuilder_ == null) {
               this.weekGiftInfo_ = Collections.emptyList();
               this.bitField0_ &= -1025;
               this.onChanged();
            } else {
               this.weekGiftInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeWeekGiftInfo(int index) {
            if (this.weekGiftInfoBuilder_ == null) {
               this.ensureWeekGiftInfoIsMutable();
               this.weekGiftInfo_.remove(index);
               this.onChanged();
            } else {
               this.weekGiftInfoBuilder_.remove(index);
            }

            return this;
         }

         public WeekGiftInfo.Builder getWeekGiftInfoBuilder(int index) {
            return (WeekGiftInfo.Builder)this.getWeekGiftInfoFieldBuilder().getBuilder(index);
         }

         public WeekGiftInfoOrBuilder getWeekGiftInfoOrBuilder(int index) {
            return this.weekGiftInfoBuilder_ == null ? (WeekGiftInfoOrBuilder)this.weekGiftInfo_.get(index) : (WeekGiftInfoOrBuilder)this.weekGiftInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends WeekGiftInfoOrBuilder> getWeekGiftInfoOrBuilderList() {
            return this.weekGiftInfoBuilder_ != null ? this.weekGiftInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.weekGiftInfo_);
         }

         public WeekGiftInfo.Builder addWeekGiftInfoBuilder() {
            return (WeekGiftInfo.Builder)this.getWeekGiftInfoFieldBuilder().addBuilder(QqBigPlayerMsg.WeekGiftInfo.getDefaultInstance());
         }

         public WeekGiftInfo.Builder addWeekGiftInfoBuilder(int index) {
            return (WeekGiftInfo.Builder)this.getWeekGiftInfoFieldBuilder().addBuilder(index, QqBigPlayerMsg.WeekGiftInfo.getDefaultInstance());
         }

         public List<WeekGiftInfo.Builder> getWeekGiftInfoBuilderList() {
            return this.getWeekGiftInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<WeekGiftInfo, WeekGiftInfo.Builder, WeekGiftInfoOrBuilder> getWeekGiftInfoFieldBuilder() {
            if (this.weekGiftInfoBuilder_ == null) {
               this.weekGiftInfoBuilder_ = new RepeatedFieldBuilderV3(this.weekGiftInfo_, (this.bitField0_ & 1024) != 0, this.getParentForChildren(), this.isClean());
               this.weekGiftInfo_ = null;
            }

            return this.weekGiftInfoBuilder_;
         }

         public boolean hasDiscount() {
            return (this.bitField0_ & 2048) != 0;
         }

         public int getDiscount() {
            return this.discount_;
         }

         public Builder setDiscount(int value) {
            this.bitField0_ |= 2048;
            this.discount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDiscount() {
            this.bitField0_ &= -2049;
            this.discount_ = 0;
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

   public static final class WeekGiftInfo extends GeneratedMessageV3 implements WeekGiftInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int WANKALV_FIELD_NUMBER = 1;
      private int wanKaLv_;
      public static final int STATE_FIELD_NUMBER = 2;
      private int state_;
      private byte memoizedIsInitialized;
      private static final WeekGiftInfo DEFAULT_INSTANCE = new WeekGiftInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<WeekGiftInfo> PARSER = new AbstractParser<WeekGiftInfo>() {
         public WeekGiftInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new WeekGiftInfo(input, extensionRegistry);
         }
      };

      private WeekGiftInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private WeekGiftInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new WeekGiftInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private WeekGiftInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.wanKaLv_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.state_ = input.readInt32();
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
         return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_WeekGiftInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_WeekGiftInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(WeekGiftInfo.class, Builder.class);
      }

      public boolean hasWanKaLv() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getWanKaLv() {
         return this.wanKaLv_;
      }

      public boolean hasState() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasWanKaLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.wanKaLv_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.state_);
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
               size += CodedOutputStream.computeInt32Size(1, this.wanKaLv_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.state_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof WeekGiftInfo)) {
            return super.equals(obj);
         } else {
            WeekGiftInfo other = (WeekGiftInfo)obj;
            if (this.hasWanKaLv() != other.hasWanKaLv()) {
               return false;
            } else if (this.hasWanKaLv() && this.getWanKaLv() != other.getWanKaLv()) {
               return false;
            } else if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
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
            if (this.hasWanKaLv()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getWanKaLv();
            }

            if (this.hasState()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getState();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static WeekGiftInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (WeekGiftInfo)PARSER.parseFrom(data);
      }

      public static WeekGiftInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WeekGiftInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WeekGiftInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (WeekGiftInfo)PARSER.parseFrom(data);
      }

      public static WeekGiftInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WeekGiftInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WeekGiftInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (WeekGiftInfo)PARSER.parseFrom(data);
      }

      public static WeekGiftInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WeekGiftInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WeekGiftInfo parseFrom(InputStream input) throws IOException {
         return (WeekGiftInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WeekGiftInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WeekGiftInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static WeekGiftInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (WeekGiftInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static WeekGiftInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WeekGiftInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static WeekGiftInfo parseFrom(CodedInputStream input) throws IOException {
         return (WeekGiftInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WeekGiftInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WeekGiftInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(WeekGiftInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static WeekGiftInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<WeekGiftInfo> parser() {
         return PARSER;
      }

      public Parser<WeekGiftInfo> getParserForType() {
         return PARSER;
      }

      public WeekGiftInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WeekGiftInfoOrBuilder {
         private int bitField0_;
         private int wanKaLv_;
         private int state_;

         public static final Descriptors.Descriptor getDescriptor() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_WeekGiftInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_WeekGiftInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(WeekGiftInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (QqBigPlayerMsg.WeekGiftInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.wanKaLv_ = 0;
            this.bitField0_ &= -2;
            this.state_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_WeekGiftInfo_descriptor;
         }

         public WeekGiftInfo getDefaultInstanceForType() {
            return QqBigPlayerMsg.WeekGiftInfo.getDefaultInstance();
         }

         public WeekGiftInfo build() {
            WeekGiftInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public WeekGiftInfo buildPartial() {
            WeekGiftInfo result = new WeekGiftInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.wanKaLv_ = this.wanKaLv_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.state_ = this.state_;
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
            if (other instanceof WeekGiftInfo) {
               return this.mergeFrom((WeekGiftInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(WeekGiftInfo other) {
            if (other == QqBigPlayerMsg.WeekGiftInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasWanKaLv()) {
                  this.setWanKaLv(other.getWanKaLv());
               }

               if (other.hasState()) {
                  this.setState(other.getState());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasWanKaLv()) {
               return false;
            } else {
               return this.hasState();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            WeekGiftInfo parsedMessage = null;

            try {
               parsedMessage = (WeekGiftInfo)QqBigPlayerMsg.WeekGiftInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (WeekGiftInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasWanKaLv() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getWanKaLv() {
            return this.wanKaLv_;
         }

         public Builder setWanKaLv(int value) {
            this.bitField0_ |= 1;
            this.wanKaLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWanKaLv() {
            this.bitField0_ &= -2;
            this.wanKaLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasState() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getState() {
            return this.state_;
         }

         public Builder setState(int value) {
            this.bitField0_ |= 2;
            this.state_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearState() {
            this.bitField0_ &= -3;
            this.state_ = 0;
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

   public static final class C2S_RecGift_24103 extends GeneratedMessageV3 implements C2S_RecGift_24103OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GIFTTYPE_FIELD_NUMBER = 1;
      private int giftType_;
      public static final int PARAM_FIELD_NUMBER = 2;
      private int param_;
      private byte memoizedIsInitialized;
      private static final C2S_RecGift_24103 DEFAULT_INSTANCE = new C2S_RecGift_24103();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecGift_24103> PARSER = new AbstractParser<C2S_RecGift_24103>() {
         public C2S_RecGift_24103 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecGift_24103(input, extensionRegistry);
         }
      };

      private C2S_RecGift_24103(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecGift_24103() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecGift_24103();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecGift_24103(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.giftType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.param_ = input.readInt32();
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
         return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecGift_24103_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecGift_24103_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecGift_24103.class, Builder.class);
      }

      public boolean hasGiftType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGiftType() {
         return this.giftType_;
      }

      public boolean hasParam() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getParam() {
         return this.param_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGiftType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.giftType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.param_);
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
               size += CodedOutputStream.computeInt32Size(1, this.giftType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.param_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RecGift_24103)) {
            return super.equals(obj);
         } else {
            C2S_RecGift_24103 other = (C2S_RecGift_24103)obj;
            if (this.hasGiftType() != other.hasGiftType()) {
               return false;
            } else if (this.hasGiftType() && this.getGiftType() != other.getGiftType()) {
               return false;
            } else if (this.hasParam() != other.hasParam()) {
               return false;
            } else if (this.hasParam() && this.getParam() != other.getParam()) {
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
            if (this.hasGiftType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGiftType();
            }

            if (this.hasParam()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getParam();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RecGift_24103 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecGift_24103)PARSER.parseFrom(data);
      }

      public static C2S_RecGift_24103 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecGift_24103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecGift_24103 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecGift_24103)PARSER.parseFrom(data);
      }

      public static C2S_RecGift_24103 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecGift_24103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecGift_24103 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecGift_24103)PARSER.parseFrom(data);
      }

      public static C2S_RecGift_24103 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecGift_24103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecGift_24103 parseFrom(InputStream input) throws IOException {
         return (C2S_RecGift_24103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecGift_24103 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecGift_24103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecGift_24103 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecGift_24103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecGift_24103 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecGift_24103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecGift_24103 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecGift_24103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecGift_24103 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecGift_24103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecGift_24103 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecGift_24103 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecGift_24103> parser() {
         return PARSER;
      }

      public Parser<C2S_RecGift_24103> getParserForType() {
         return PARSER;
      }

      public C2S_RecGift_24103 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecGift_24103OrBuilder {
         private int bitField0_;
         private int giftType_;
         private int param_;

         public static final Descriptors.Descriptor getDescriptor() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecGift_24103_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecGift_24103_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecGift_24103.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (QqBigPlayerMsg.C2S_RecGift_24103.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.giftType_ = 0;
            this.bitField0_ &= -2;
            this.param_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecGift_24103_descriptor;
         }

         public C2S_RecGift_24103 getDefaultInstanceForType() {
            return QqBigPlayerMsg.C2S_RecGift_24103.getDefaultInstance();
         }

         public C2S_RecGift_24103 build() {
            C2S_RecGift_24103 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecGift_24103 buildPartial() {
            C2S_RecGift_24103 result = new C2S_RecGift_24103(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.giftType_ = this.giftType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.param_ = this.param_;
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
            if (other instanceof C2S_RecGift_24103) {
               return this.mergeFrom((C2S_RecGift_24103)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecGift_24103 other) {
            if (other == QqBigPlayerMsg.C2S_RecGift_24103.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGiftType()) {
                  this.setGiftType(other.getGiftType());
               }

               if (other.hasParam()) {
                  this.setParam(other.getParam());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGiftType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RecGift_24103 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecGift_24103)QqBigPlayerMsg.C2S_RecGift_24103.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecGift_24103)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGiftType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGiftType() {
            return this.giftType_;
         }

         public Builder setGiftType(int value) {
            this.bitField0_ |= 1;
            this.giftType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGiftType() {
            this.bitField0_ &= -2;
            this.giftType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasParam() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getParam() {
            return this.param_;
         }

         public Builder setParam(int value) {
            this.bitField0_ |= 2;
            this.param_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearParam() {
            this.bitField0_ &= -3;
            this.param_ = 0;
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

   public static final class S2C_RecGift_24104 extends GeneratedMessageV3 implements S2C_RecGift_24104OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_RecGift_24104 DEFAULT_INSTANCE = new S2C_RecGift_24104();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecGift_24104> PARSER = new AbstractParser<S2C_RecGift_24104>() {
         public S2C_RecGift_24104 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecGift_24104(input, extensionRegistry);
         }
      };

      private S2C_RecGift_24104(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecGift_24104() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecGift_24104();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecGift_24104(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecGift_24104_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecGift_24104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecGift_24104.class, Builder.class);
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
         } else if (!(obj instanceof S2C_RecGift_24104)) {
            return super.equals(obj);
         } else {
            S2C_RecGift_24104 other = (S2C_RecGift_24104)obj;
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

      public static S2C_RecGift_24104 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecGift_24104)PARSER.parseFrom(data);
      }

      public static S2C_RecGift_24104 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecGift_24104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecGift_24104 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecGift_24104)PARSER.parseFrom(data);
      }

      public static S2C_RecGift_24104 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecGift_24104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecGift_24104 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecGift_24104)PARSER.parseFrom(data);
      }

      public static S2C_RecGift_24104 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecGift_24104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecGift_24104 parseFrom(InputStream input) throws IOException {
         return (S2C_RecGift_24104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecGift_24104 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecGift_24104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecGift_24104 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecGift_24104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecGift_24104 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecGift_24104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecGift_24104 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecGift_24104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecGift_24104 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecGift_24104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecGift_24104 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecGift_24104 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecGift_24104> parser() {
         return PARSER;
      }

      public Parser<S2C_RecGift_24104> getParserForType() {
         return PARSER;
      }

      public S2C_RecGift_24104 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecGift_24104OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecGift_24104_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecGift_24104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecGift_24104.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (QqBigPlayerMsg.S2C_RecGift_24104.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecGift_24104_descriptor;
         }

         public S2C_RecGift_24104 getDefaultInstanceForType() {
            return QqBigPlayerMsg.S2C_RecGift_24104.getDefaultInstance();
         }

         public S2C_RecGift_24104 build() {
            S2C_RecGift_24104 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecGift_24104 buildPartial() {
            S2C_RecGift_24104 result = new S2C_RecGift_24104(this);
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
            if (other instanceof S2C_RecGift_24104) {
               return this.mergeFrom((S2C_RecGift_24104)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecGift_24104 other) {
            if (other == QqBigPlayerMsg.S2C_RecGift_24104.getDefaultInstance()) {
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
            S2C_RecGift_24104 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecGift_24104)QqBigPlayerMsg.S2C_RecGift_24104.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecGift_24104)e.getUnfinishedMessage();
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

   public static final class C2S_RecWanKaLvBox_24105 extends GeneratedMessageV3 implements C2S_RecWanKaLvBox_24105OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LV_FIELD_NUMBER = 1;
      private int lv_;
      private byte memoizedIsInitialized;
      private static final C2S_RecWanKaLvBox_24105 DEFAULT_INSTANCE = new C2S_RecWanKaLvBox_24105();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecWanKaLvBox_24105> PARSER = new AbstractParser<C2S_RecWanKaLvBox_24105>() {
         public C2S_RecWanKaLvBox_24105 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecWanKaLvBox_24105(input, extensionRegistry);
         }
      };

      private C2S_RecWanKaLvBox_24105(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecWanKaLvBox_24105() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecWanKaLvBox_24105();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecWanKaLvBox_24105(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.lv_ = input.readInt32();
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
         return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecWanKaLvBox_24105_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecWanKaLvBox_24105_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecWanKaLvBox_24105.class, Builder.class);
      }

      public boolean hasLv() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.lv_);
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
               size += CodedOutputStream.computeInt32Size(1, this.lv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RecWanKaLvBox_24105)) {
            return super.equals(obj);
         } else {
            C2S_RecWanKaLvBox_24105 other = (C2S_RecWanKaLvBox_24105)obj;
            if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
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
            if (this.hasLv()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLv();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RecWanKaLvBox_24105 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecWanKaLvBox_24105)PARSER.parseFrom(data);
      }

      public static C2S_RecWanKaLvBox_24105 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecWanKaLvBox_24105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecWanKaLvBox_24105 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecWanKaLvBox_24105)PARSER.parseFrom(data);
      }

      public static C2S_RecWanKaLvBox_24105 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecWanKaLvBox_24105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecWanKaLvBox_24105 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecWanKaLvBox_24105)PARSER.parseFrom(data);
      }

      public static C2S_RecWanKaLvBox_24105 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecWanKaLvBox_24105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecWanKaLvBox_24105 parseFrom(InputStream input) throws IOException {
         return (C2S_RecWanKaLvBox_24105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecWanKaLvBox_24105 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecWanKaLvBox_24105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecWanKaLvBox_24105 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecWanKaLvBox_24105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecWanKaLvBox_24105 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecWanKaLvBox_24105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecWanKaLvBox_24105 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecWanKaLvBox_24105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecWanKaLvBox_24105 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecWanKaLvBox_24105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecWanKaLvBox_24105 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecWanKaLvBox_24105 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecWanKaLvBox_24105> parser() {
         return PARSER;
      }

      public Parser<C2S_RecWanKaLvBox_24105> getParserForType() {
         return PARSER;
      }

      public C2S_RecWanKaLvBox_24105 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecWanKaLvBox_24105OrBuilder {
         private int bitField0_;
         private int lv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecWanKaLvBox_24105_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecWanKaLvBox_24105_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecWanKaLvBox_24105.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (QqBigPlayerMsg.C2S_RecWanKaLvBox_24105.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.lv_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecWanKaLvBox_24105_descriptor;
         }

         public C2S_RecWanKaLvBox_24105 getDefaultInstanceForType() {
            return QqBigPlayerMsg.C2S_RecWanKaLvBox_24105.getDefaultInstance();
         }

         public C2S_RecWanKaLvBox_24105 build() {
            C2S_RecWanKaLvBox_24105 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecWanKaLvBox_24105 buildPartial() {
            C2S_RecWanKaLvBox_24105 result = new C2S_RecWanKaLvBox_24105(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.lv_ = this.lv_;
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
            if (other instanceof C2S_RecWanKaLvBox_24105) {
               return this.mergeFrom((C2S_RecWanKaLvBox_24105)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecWanKaLvBox_24105 other) {
            if (other == QqBigPlayerMsg.C2S_RecWanKaLvBox_24105.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasLv();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RecWanKaLvBox_24105 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecWanKaLvBox_24105)QqBigPlayerMsg.C2S_RecWanKaLvBox_24105.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecWanKaLvBox_24105)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLv() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 1;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -2;
            this.lv_ = 0;
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

   public static final class S2C_RecWanKaLvBox_24106 extends GeneratedMessageV3 implements S2C_RecWanKaLvBox_24106OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_RecWanKaLvBox_24106 DEFAULT_INSTANCE = new S2C_RecWanKaLvBox_24106();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecWanKaLvBox_24106> PARSER = new AbstractParser<S2C_RecWanKaLvBox_24106>() {
         public S2C_RecWanKaLvBox_24106 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecWanKaLvBox_24106(input, extensionRegistry);
         }
      };

      private S2C_RecWanKaLvBox_24106(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecWanKaLvBox_24106() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecWanKaLvBox_24106();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecWanKaLvBox_24106(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecWanKaLvBox_24106_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecWanKaLvBox_24106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecWanKaLvBox_24106.class, Builder.class);
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
         } else if (!(obj instanceof S2C_RecWanKaLvBox_24106)) {
            return super.equals(obj);
         } else {
            S2C_RecWanKaLvBox_24106 other = (S2C_RecWanKaLvBox_24106)obj;
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

      public static S2C_RecWanKaLvBox_24106 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecWanKaLvBox_24106)PARSER.parseFrom(data);
      }

      public static S2C_RecWanKaLvBox_24106 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecWanKaLvBox_24106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecWanKaLvBox_24106 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecWanKaLvBox_24106)PARSER.parseFrom(data);
      }

      public static S2C_RecWanKaLvBox_24106 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecWanKaLvBox_24106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecWanKaLvBox_24106 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecWanKaLvBox_24106)PARSER.parseFrom(data);
      }

      public static S2C_RecWanKaLvBox_24106 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecWanKaLvBox_24106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecWanKaLvBox_24106 parseFrom(InputStream input) throws IOException {
         return (S2C_RecWanKaLvBox_24106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecWanKaLvBox_24106 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecWanKaLvBox_24106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecWanKaLvBox_24106 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecWanKaLvBox_24106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecWanKaLvBox_24106 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecWanKaLvBox_24106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecWanKaLvBox_24106 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecWanKaLvBox_24106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecWanKaLvBox_24106 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecWanKaLvBox_24106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecWanKaLvBox_24106 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecWanKaLvBox_24106 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecWanKaLvBox_24106> parser() {
         return PARSER;
      }

      public Parser<S2C_RecWanKaLvBox_24106> getParserForType() {
         return PARSER;
      }

      public S2C_RecWanKaLvBox_24106 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecWanKaLvBox_24106OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecWanKaLvBox_24106_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecWanKaLvBox_24106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecWanKaLvBox_24106.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (QqBigPlayerMsg.S2C_RecWanKaLvBox_24106.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecWanKaLvBox_24106_descriptor;
         }

         public S2C_RecWanKaLvBox_24106 getDefaultInstanceForType() {
            return QqBigPlayerMsg.S2C_RecWanKaLvBox_24106.getDefaultInstance();
         }

         public S2C_RecWanKaLvBox_24106 build() {
            S2C_RecWanKaLvBox_24106 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecWanKaLvBox_24106 buildPartial() {
            S2C_RecWanKaLvBox_24106 result = new S2C_RecWanKaLvBox_24106(this);
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
            if (other instanceof S2C_RecWanKaLvBox_24106) {
               return this.mergeFrom((S2C_RecWanKaLvBox_24106)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecWanKaLvBox_24106 other) {
            if (other == QqBigPlayerMsg.S2C_RecWanKaLvBox_24106.getDefaultInstance()) {
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
            S2C_RecWanKaLvBox_24106 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecWanKaLvBox_24106)QqBigPlayerMsg.S2C_RecWanKaLvBox_24106.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecWanKaLvBox_24106)e.getUnfinishedMessage();
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

   public static final class C2S_RecWeekGift_24107 extends GeneratedMessageV3 implements C2S_RecWeekGift_24107OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LV_FIELD_NUMBER = 2;
      private int lv_;
      private byte memoizedIsInitialized;
      private static final C2S_RecWeekGift_24107 DEFAULT_INSTANCE = new C2S_RecWeekGift_24107();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecWeekGift_24107> PARSER = new AbstractParser<C2S_RecWeekGift_24107>() {
         public C2S_RecWeekGift_24107 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecWeekGift_24107(input, extensionRegistry);
         }
      };

      private C2S_RecWeekGift_24107(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecWeekGift_24107() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecWeekGift_24107();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecWeekGift_24107(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 1;
                        this.lv_ = input.readInt32();
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
         return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecWeekGift_24107_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecWeekGift_24107_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecWeekGift_24107.class, Builder.class);
      }

      public boolean hasLv() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.lv_);
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
               size += CodedOutputStream.computeInt32Size(2, this.lv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RecWeekGift_24107)) {
            return super.equals(obj);
         } else {
            C2S_RecWeekGift_24107 other = (C2S_RecWeekGift_24107)obj;
            if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
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
            if (this.hasLv()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLv();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RecWeekGift_24107 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecWeekGift_24107)PARSER.parseFrom(data);
      }

      public static C2S_RecWeekGift_24107 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecWeekGift_24107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecWeekGift_24107 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecWeekGift_24107)PARSER.parseFrom(data);
      }

      public static C2S_RecWeekGift_24107 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecWeekGift_24107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecWeekGift_24107 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecWeekGift_24107)PARSER.parseFrom(data);
      }

      public static C2S_RecWeekGift_24107 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecWeekGift_24107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecWeekGift_24107 parseFrom(InputStream input) throws IOException {
         return (C2S_RecWeekGift_24107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecWeekGift_24107 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecWeekGift_24107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecWeekGift_24107 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecWeekGift_24107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecWeekGift_24107 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecWeekGift_24107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecWeekGift_24107 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecWeekGift_24107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecWeekGift_24107 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecWeekGift_24107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecWeekGift_24107 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecWeekGift_24107 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecWeekGift_24107> parser() {
         return PARSER;
      }

      public Parser<C2S_RecWeekGift_24107> getParserForType() {
         return PARSER;
      }

      public C2S_RecWeekGift_24107 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecWeekGift_24107OrBuilder {
         private int bitField0_;
         private int lv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecWeekGift_24107_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecWeekGift_24107_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecWeekGift_24107.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (QqBigPlayerMsg.C2S_RecWeekGift_24107.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.lv_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_C2S_RecWeekGift_24107_descriptor;
         }

         public C2S_RecWeekGift_24107 getDefaultInstanceForType() {
            return QqBigPlayerMsg.C2S_RecWeekGift_24107.getDefaultInstance();
         }

         public C2S_RecWeekGift_24107 build() {
            C2S_RecWeekGift_24107 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecWeekGift_24107 buildPartial() {
            C2S_RecWeekGift_24107 result = new C2S_RecWeekGift_24107(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.lv_ = this.lv_;
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
            if (other instanceof C2S_RecWeekGift_24107) {
               return this.mergeFrom((C2S_RecWeekGift_24107)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecWeekGift_24107 other) {
            if (other == QqBigPlayerMsg.C2S_RecWeekGift_24107.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasLv();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RecWeekGift_24107 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecWeekGift_24107)QqBigPlayerMsg.C2S_RecWeekGift_24107.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecWeekGift_24107)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLv() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 1;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -2;
            this.lv_ = 0;
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

   public static final class S2C_RecWeekGift_24108 extends GeneratedMessageV3 implements S2C_RecWeekGift_24108OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_RecWeekGift_24108 DEFAULT_INSTANCE = new S2C_RecWeekGift_24108();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecWeekGift_24108> PARSER = new AbstractParser<S2C_RecWeekGift_24108>() {
         public S2C_RecWeekGift_24108 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecWeekGift_24108(input, extensionRegistry);
         }
      };

      private S2C_RecWeekGift_24108(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecWeekGift_24108() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecWeekGift_24108();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecWeekGift_24108(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecWeekGift_24108_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecWeekGift_24108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecWeekGift_24108.class, Builder.class);
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
         } else if (!(obj instanceof S2C_RecWeekGift_24108)) {
            return super.equals(obj);
         } else {
            S2C_RecWeekGift_24108 other = (S2C_RecWeekGift_24108)obj;
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

      public static S2C_RecWeekGift_24108 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecWeekGift_24108)PARSER.parseFrom(data);
      }

      public static S2C_RecWeekGift_24108 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecWeekGift_24108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecWeekGift_24108 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecWeekGift_24108)PARSER.parseFrom(data);
      }

      public static S2C_RecWeekGift_24108 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecWeekGift_24108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecWeekGift_24108 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecWeekGift_24108)PARSER.parseFrom(data);
      }

      public static S2C_RecWeekGift_24108 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecWeekGift_24108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecWeekGift_24108 parseFrom(InputStream input) throws IOException {
         return (S2C_RecWeekGift_24108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecWeekGift_24108 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecWeekGift_24108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecWeekGift_24108 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecWeekGift_24108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecWeekGift_24108 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecWeekGift_24108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecWeekGift_24108 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecWeekGift_24108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecWeekGift_24108 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecWeekGift_24108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecWeekGift_24108 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecWeekGift_24108 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecWeekGift_24108> parser() {
         return PARSER;
      }

      public Parser<S2C_RecWeekGift_24108> getParserForType() {
         return PARSER;
      }

      public S2C_RecWeekGift_24108 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecWeekGift_24108OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecWeekGift_24108_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecWeekGift_24108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecWeekGift_24108.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (QqBigPlayerMsg.S2C_RecWeekGift_24108.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return QqBigPlayerMsg.internal_static_QqBigPlayer_com_gzbz_protobuf_S2C_RecWeekGift_24108_descriptor;
         }

         public S2C_RecWeekGift_24108 getDefaultInstanceForType() {
            return QqBigPlayerMsg.S2C_RecWeekGift_24108.getDefaultInstance();
         }

         public S2C_RecWeekGift_24108 build() {
            S2C_RecWeekGift_24108 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecWeekGift_24108 buildPartial() {
            S2C_RecWeekGift_24108 result = new S2C_RecWeekGift_24108(this);
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
            if (other instanceof S2C_RecWeekGift_24108) {
               return this.mergeFrom((S2C_RecWeekGift_24108)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecWeekGift_24108 other) {
            if (other == QqBigPlayerMsg.S2C_RecWeekGift_24108.getDefaultInstance()) {
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
            S2C_RecWeekGift_24108 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecWeekGift_24108)QqBigPlayerMsg.S2C_RecWeekGift_24108.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecWeekGift_24108)e.getUnfinishedMessage();
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

   public interface C2S_Info_24101OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_RecGift_24103OrBuilder extends MessageOrBuilder {
      boolean hasGiftType();

      int getGiftType();

      boolean hasParam();

      int getParam();
   }

   public interface C2S_RecWanKaLvBox_24105OrBuilder extends MessageOrBuilder {
      boolean hasLv();

      int getLv();
   }

   public interface C2S_RecWeekGift_24107OrBuilder extends MessageOrBuilder {
      boolean hasLv();

      int getLv();
   }

   public interface S2C_Info_24102OrBuilder extends MessageOrBuilder {
      boolean hasIsSysOpen();

      boolean getIsSysOpen();

      boolean hasValCount();

      long getValCount();

      boolean hasLv();

      int getLv();

      boolean hasIsRecRegGift();

      boolean getIsRecRegGift();

      boolean hasIsRecDailyActGift();

      boolean getIsRecDailyActGift();

      List<Integer> getRecLevelGiftList();

      int getRecLevelGiftCount();

      int getRecLevelGift(int index);

      List<Integer> getRecWanKaLvBoxList();

      int getRecWanKaLvBoxCount();

      int getRecWanKaLvBox(int index);

      boolean hasNoHighOrderLv();

      int getNoHighOrderLv();

      List<Integer> getRecWeekGiftList();

      int getRecWeekGiftCount();

      int getRecWeekGift(int index);

      boolean hasPayReturnCount();

      int getPayReturnCount();

      List<WeekGiftInfo> getWeekGiftInfoList();

      WeekGiftInfo getWeekGiftInfo(int index);

      int getWeekGiftInfoCount();

      List<? extends WeekGiftInfoOrBuilder> getWeekGiftInfoOrBuilderList();

      WeekGiftInfoOrBuilder getWeekGiftInfoOrBuilder(int index);

      boolean hasDiscount();

      int getDiscount();
   }

   public interface S2C_RecGift_24104OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_RecWanKaLvBox_24106OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_RecWeekGift_24108OrBuilder extends MessageOrBuilder {
   }

   public interface WeekGiftInfoOrBuilder extends MessageOrBuilder {
      boolean hasWanKaLv();

      int getWanKaLv();

      boolean hasState();

      int getState();
   }
}
