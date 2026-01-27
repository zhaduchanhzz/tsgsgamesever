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

public final class VideoMsg {
   private static final Descriptors.Descriptor internal_static_video_com_gzbz_protobuf_C2S_VideoInfo_28401_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_video_com_gzbz_protobuf_C2S_VideoInfo_28401_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_video_com_gzbz_protobuf_S2C_VideoInfo_28402_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_video_com_gzbz_protobuf_S2C_VideoInfo_28402_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_video_com_gzbz_protobuf_C2S_WatchAndReward_28403_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_video_com_gzbz_protobuf_C2S_WatchAndReward_28403_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_video_com_gzbz_protobuf_S2C_WatchAndReward_28404_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_video_com_gzbz_protobuf_S2C_WatchAndReward_28404_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_video_com_gzbz_protobuf_C2S_VideoTimeReward_28405_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_video_com_gzbz_protobuf_C2S_VideoTimeReward_28405_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_video_com_gzbz_protobuf_S2C_WatchAndReward_28406_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_video_com_gzbz_protobuf_S2C_WatchAndReward_28406_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_video_com_gzbz_protobuf_C2S_SkipVideoReward_28407_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_video_com_gzbz_protobuf_C2S_SkipVideoReward_28407_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_video_com_gzbz_protobuf_S2C_SkipVideoReward_28408_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_video_com_gzbz_protobuf_S2C_SkipVideoReward_28408_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_video_com_gzbz_protobuf_C2S_DailyRechargeReward_28409_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_video_com_gzbz_protobuf_C2S_DailyRechargeReward_28409_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_video_com_gzbz_protobuf_S2C_DailyRechargeReward_28410_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_video_com_gzbz_protobuf_S2C_DailyRechargeReward_28410_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_video_com_gzbz_protobuf_C2S_WatchFailReward_28411_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_video_com_gzbz_protobuf_C2S_WatchFailReward_28411_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_video_com_gzbz_protobuf_S2C_WatchFailReward_28412_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_video_com_gzbz_protobuf_S2C_WatchFailReward_28412_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private VideoMsg() {
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
      String[] descriptorData = new String[]{"\n\u0011VideoReward.proto\u0012\u0017video.com.gzbz.protobuf\u001a\fcommon.proto\"\u0015\n\u0013C2S_VideoInfo_28401\"µ\u0001\n\u0013S2C_VideoInfo_28402\u0012\u0015\n\ropenServerDay\u0018\u0001 \u0002(\u0005\u0012'\n\fvideoRewards\u0018\u0002 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0018\n\u0010maxRoundRewardId\u0018\u0003 \u0002(\u0005\u0012\u0016\n\u000eviewDideoCount\u0018\u0004 \u0002(\u0005\u0012\u0013\n\u000brechargeNum\u0018\u0005 \u0003(\u0005\u0012\u0017\n\u000ffailRewardTimes\u0018\u0006 \u0002(\u0005\"+\n\u0018C2S_WatchAndReward_28403\u0012\u000f\n\u0007package\u0018\u0001 \u0002(\u0005\"W\n\u0018S2C_WatchAndReward_28404\u0012\u000f\n\u0007package\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nrewardTime\u0018\u0002 \u0002(\u0005\u0012\u0016\n\u000eviewDideoCount\u0018\u0003 \u0002(\u0005\"\u001b\n\u0019C2S_VideoTimeReward_28405\"4\n\u0018S2C_WatchAndReward_28406\u0012\u0018\n\u0010maxRoundRewardId\u0018\u0001 \u0002(\u0005\",\n\u0019C2S_SkipVideoReward_28407\u0012\u000f\n\u0007package\u0018\u0001 \u0002(\u0005\"X\n\u0019S2C_SkipVideoReward_28408\u0012\u000f\n\u0007package\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nrewardTime\u0018\u0002 \u0002(\u0005\u0012\u0016\n\u000eviewDideoCount\u0018\u0003 \u0002(\u0005\"4\n\u001dC2S_DailyRechargeReward_28409\u0012\u0013\n\u000brechargeNum\u0018\u0001 \u0002(\u0005\"4\n\u001dS2C_DailyRechargeReward_28410\u0012\u0013\n\u000brechargeNum\u0018\u0001 \u0002(\u0005\",\n\u0019C2S_WatchFailReward_28411\u0012\u000f\n\u0007package\u0018\u0001 \u0002(\u0005\"q\n\u0019S2C_WatchFailReward_28412\u0012\u000f\n\u0007package\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nrewardTime\u0018\u0002 \u0002(\u0005\u0012\u0016\n\u000eviewDideoCount\u0018\u0003 \u0002(\u0005\u0012\u0017\n\u000ffailRewardTimes\u0018\u0004 \u0002(\u0005B\u001f\n\u0011com.gzbz.protobufB\bVideoMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_video_com_gzbz_protobuf_C2S_VideoInfo_28401_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_video_com_gzbz_protobuf_C2S_VideoInfo_28401_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_video_com_gzbz_protobuf_C2S_VideoInfo_28401_descriptor, new String[0]);
      internal_static_video_com_gzbz_protobuf_S2C_VideoInfo_28402_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_video_com_gzbz_protobuf_S2C_VideoInfo_28402_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_video_com_gzbz_protobuf_S2C_VideoInfo_28402_descriptor, new String[]{"OpenServerDay", "VideoRewards", "MaxRoundRewardId", "ViewDideoCount", "RechargeNum", "FailRewardTimes"});
      internal_static_video_com_gzbz_protobuf_C2S_WatchAndReward_28403_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_video_com_gzbz_protobuf_C2S_WatchAndReward_28403_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_video_com_gzbz_protobuf_C2S_WatchAndReward_28403_descriptor, new String[]{"Package"});
      internal_static_video_com_gzbz_protobuf_S2C_WatchAndReward_28404_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_video_com_gzbz_protobuf_S2C_WatchAndReward_28404_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_video_com_gzbz_protobuf_S2C_WatchAndReward_28404_descriptor, new String[]{"Package", "RewardTime", "ViewDideoCount"});
      internal_static_video_com_gzbz_protobuf_C2S_VideoTimeReward_28405_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_video_com_gzbz_protobuf_C2S_VideoTimeReward_28405_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_video_com_gzbz_protobuf_C2S_VideoTimeReward_28405_descriptor, new String[0]);
      internal_static_video_com_gzbz_protobuf_S2C_WatchAndReward_28406_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_video_com_gzbz_protobuf_S2C_WatchAndReward_28406_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_video_com_gzbz_protobuf_S2C_WatchAndReward_28406_descriptor, new String[]{"MaxRoundRewardId"});
      internal_static_video_com_gzbz_protobuf_C2S_SkipVideoReward_28407_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_video_com_gzbz_protobuf_C2S_SkipVideoReward_28407_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_video_com_gzbz_protobuf_C2S_SkipVideoReward_28407_descriptor, new String[]{"Package"});
      internal_static_video_com_gzbz_protobuf_S2C_SkipVideoReward_28408_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_video_com_gzbz_protobuf_S2C_SkipVideoReward_28408_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_video_com_gzbz_protobuf_S2C_SkipVideoReward_28408_descriptor, new String[]{"Package", "RewardTime", "ViewDideoCount"});
      internal_static_video_com_gzbz_protobuf_C2S_DailyRechargeReward_28409_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_video_com_gzbz_protobuf_C2S_DailyRechargeReward_28409_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_video_com_gzbz_protobuf_C2S_DailyRechargeReward_28409_descriptor, new String[]{"RechargeNum"});
      internal_static_video_com_gzbz_protobuf_S2C_DailyRechargeReward_28410_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_video_com_gzbz_protobuf_S2C_DailyRechargeReward_28410_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_video_com_gzbz_protobuf_S2C_DailyRechargeReward_28410_descriptor, new String[]{"RechargeNum"});
      internal_static_video_com_gzbz_protobuf_C2S_WatchFailReward_28411_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_video_com_gzbz_protobuf_C2S_WatchFailReward_28411_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_video_com_gzbz_protobuf_C2S_WatchFailReward_28411_descriptor, new String[]{"Package"});
      internal_static_video_com_gzbz_protobuf_S2C_WatchFailReward_28412_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_video_com_gzbz_protobuf_S2C_WatchFailReward_28412_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_video_com_gzbz_protobuf_S2C_WatchFailReward_28412_descriptor, new String[]{"Package", "RewardTime", "ViewDideoCount", "FailRewardTimes"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_VideoInfo_28401 extends GeneratedMessageV3 implements C2S_VideoInfo_28401OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_VideoInfo_28401 DEFAULT_INSTANCE = new C2S_VideoInfo_28401();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_VideoInfo_28401> PARSER = new AbstractParser<C2S_VideoInfo_28401>() {
         public C2S_VideoInfo_28401 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_VideoInfo_28401(input, extensionRegistry);
         }
      };

      private C2S_VideoInfo_28401(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_VideoInfo_28401() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_VideoInfo_28401();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_VideoInfo_28401(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_VideoInfo_28401_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_VideoInfo_28401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_VideoInfo_28401.class, Builder.class);
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
         } else if (!(obj instanceof C2S_VideoInfo_28401)) {
            return super.equals(obj);
         } else {
            C2S_VideoInfo_28401 other = (C2S_VideoInfo_28401)obj;
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

      public static C2S_VideoInfo_28401 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_VideoInfo_28401)PARSER.parseFrom(data);
      }

      public static C2S_VideoInfo_28401 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VideoInfo_28401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VideoInfo_28401 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_VideoInfo_28401)PARSER.parseFrom(data);
      }

      public static C2S_VideoInfo_28401 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VideoInfo_28401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VideoInfo_28401 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_VideoInfo_28401)PARSER.parseFrom(data);
      }

      public static C2S_VideoInfo_28401 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VideoInfo_28401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VideoInfo_28401 parseFrom(InputStream input) throws IOException {
         return (C2S_VideoInfo_28401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_VideoInfo_28401 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VideoInfo_28401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_VideoInfo_28401 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_VideoInfo_28401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_VideoInfo_28401 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VideoInfo_28401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_VideoInfo_28401 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_VideoInfo_28401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_VideoInfo_28401 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VideoInfo_28401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_VideoInfo_28401 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_VideoInfo_28401 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_VideoInfo_28401> parser() {
         return PARSER;
      }

      public Parser<C2S_VideoInfo_28401> getParserForType() {
         return PARSER;
      }

      public C2S_VideoInfo_28401 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_VideoInfo_28401OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_VideoInfo_28401_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_VideoInfo_28401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_VideoInfo_28401.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (VideoMsg.C2S_VideoInfo_28401.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_VideoInfo_28401_descriptor;
         }

         public C2S_VideoInfo_28401 getDefaultInstanceForType() {
            return VideoMsg.C2S_VideoInfo_28401.getDefaultInstance();
         }

         public C2S_VideoInfo_28401 build() {
            C2S_VideoInfo_28401 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_VideoInfo_28401 buildPartial() {
            C2S_VideoInfo_28401 result = new C2S_VideoInfo_28401(this);
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
            if (other instanceof C2S_VideoInfo_28401) {
               return this.mergeFrom((C2S_VideoInfo_28401)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_VideoInfo_28401 other) {
            if (other == VideoMsg.C2S_VideoInfo_28401.getDefaultInstance()) {
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
            C2S_VideoInfo_28401 parsedMessage = null;

            try {
               parsedMessage = (C2S_VideoInfo_28401)VideoMsg.C2S_VideoInfo_28401.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_VideoInfo_28401)e.getUnfinishedMessage();
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

   public static final class S2C_VideoInfo_28402 extends GeneratedMessageV3 implements S2C_VideoInfo_28402OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OPENSERVERDAY_FIELD_NUMBER = 1;
      private int openServerDay_;
      public static final int VIDEOREWARDS_FIELD_NUMBER = 2;
      private List<CommonMsg.MapDataII> videoRewards_;
      public static final int MAXROUNDREWARDID_FIELD_NUMBER = 3;
      private int maxRoundRewardId_;
      public static final int VIEWDIDEOCOUNT_FIELD_NUMBER = 4;
      private int viewDideoCount_;
      public static final int RECHARGENUM_FIELD_NUMBER = 5;
      private Internal.IntList rechargeNum_;
      public static final int FAILREWARDTIMES_FIELD_NUMBER = 6;
      private int failRewardTimes_;
      private byte memoizedIsInitialized;
      private static final S2C_VideoInfo_28402 DEFAULT_INSTANCE = new S2C_VideoInfo_28402();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_VideoInfo_28402> PARSER = new AbstractParser<S2C_VideoInfo_28402>() {
         public S2C_VideoInfo_28402 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_VideoInfo_28402(input, extensionRegistry);
         }
      };

      private S2C_VideoInfo_28402(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_VideoInfo_28402() {
         this.memoizedIsInitialized = -1;
         this.videoRewards_ = Collections.emptyList();
         this.rechargeNum_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_VideoInfo_28402();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_VideoInfo_28402(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.openServerDay_ = input.readInt32();
                        continue;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.videoRewards_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.videoRewards_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        continue;
                     case 24:
                        this.bitField0_ |= 2;
                        this.maxRoundRewardId_ = input.readInt32();
                        continue;
                     case 32:
                        this.bitField0_ |= 4;
                        this.viewDideoCount_ = input.readInt32();
                        continue;
                     case 40:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.rechargeNum_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        this.rechargeNum_.addInt(input.readInt32());
                        continue;
                     case 42:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 16) == 0 && input.getBytesUntilLimit() > 0) {
                           this.rechargeNum_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }
                        break;
                     case 48:
                        this.bitField0_ |= 8;
                        this.failRewardTimes_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.rechargeNum_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.videoRewards_ = Collections.unmodifiableList(this.videoRewards_);
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.rechargeNum_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_VideoInfo_28402_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_VideoInfo_28402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_VideoInfo_28402.class, Builder.class);
      }

      public boolean hasOpenServerDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getOpenServerDay() {
         return this.openServerDay_;
      }

      public List<CommonMsg.MapDataII> getVideoRewardsList() {
         return this.videoRewards_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getVideoRewardsOrBuilderList() {
         return this.videoRewards_;
      }

      public int getVideoRewardsCount() {
         return this.videoRewards_.size();
      }

      public CommonMsg.MapDataII getVideoRewards(int index) {
         return (CommonMsg.MapDataII)this.videoRewards_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getVideoRewardsOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.videoRewards_.get(index);
      }

      public boolean hasMaxRoundRewardId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getMaxRoundRewardId() {
         return this.maxRoundRewardId_;
      }

      public boolean hasViewDideoCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getViewDideoCount() {
         return this.viewDideoCount_;
      }

      public List<Integer> getRechargeNumList() {
         return this.rechargeNum_;
      }

      public int getRechargeNumCount() {
         return this.rechargeNum_.size();
      }

      public int getRechargeNum(int index) {
         return this.rechargeNum_.getInt(index);
      }

      public boolean hasFailRewardTimes() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getFailRewardTimes() {
         return this.failRewardTimes_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasOpenServerDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMaxRoundRewardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasViewDideoCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFailRewardTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getVideoRewardsCount(); ++i) {
               if (!this.getVideoRewards(i).isInitialized()) {
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
            output.writeInt32(1, this.openServerDay_);
         }

         for(int i = 0; i < this.videoRewards_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.videoRewards_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.maxRoundRewardId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.viewDideoCount_);
         }

         for(int i = 0; i < this.rechargeNum_.size(); ++i) {
            output.writeInt32(5, this.rechargeNum_.getInt(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(6, this.failRewardTimes_);
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
               size += CodedOutputStream.computeInt32Size(1, this.openServerDay_);
            }

            for(int i = 0; i < this.videoRewards_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.videoRewards_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.maxRoundRewardId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.viewDideoCount_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.rechargeNum_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.rechargeNum_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRechargeNumList().size();
            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.failRewardTimes_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_VideoInfo_28402)) {
            return super.equals(obj);
         } else {
            S2C_VideoInfo_28402 other = (S2C_VideoInfo_28402)obj;
            if (this.hasOpenServerDay() != other.hasOpenServerDay()) {
               return false;
            } else if (this.hasOpenServerDay() && this.getOpenServerDay() != other.getOpenServerDay()) {
               return false;
            } else if (!this.getVideoRewardsList().equals(other.getVideoRewardsList())) {
               return false;
            } else if (this.hasMaxRoundRewardId() != other.hasMaxRoundRewardId()) {
               return false;
            } else if (this.hasMaxRoundRewardId() && this.getMaxRoundRewardId() != other.getMaxRoundRewardId()) {
               return false;
            } else if (this.hasViewDideoCount() != other.hasViewDideoCount()) {
               return false;
            } else if (this.hasViewDideoCount() && this.getViewDideoCount() != other.getViewDideoCount()) {
               return false;
            } else if (!this.getRechargeNumList().equals(other.getRechargeNumList())) {
               return false;
            } else if (this.hasFailRewardTimes() != other.hasFailRewardTimes()) {
               return false;
            } else if (this.hasFailRewardTimes() && this.getFailRewardTimes() != other.getFailRewardTimes()) {
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
            if (this.hasOpenServerDay()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOpenServerDay();
            }

            if (this.getVideoRewardsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getVideoRewardsList().hashCode();
            }

            if (this.hasMaxRoundRewardId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getMaxRoundRewardId();
            }

            if (this.hasViewDideoCount()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getViewDideoCount();
            }

            if (this.getRechargeNumCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getRechargeNumList().hashCode();
            }

            if (this.hasFailRewardTimes()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getFailRewardTimes();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_VideoInfo_28402 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_VideoInfo_28402)PARSER.parseFrom(data);
      }

      public static S2C_VideoInfo_28402 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_VideoInfo_28402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_VideoInfo_28402 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_VideoInfo_28402)PARSER.parseFrom(data);
      }

      public static S2C_VideoInfo_28402 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_VideoInfo_28402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_VideoInfo_28402 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_VideoInfo_28402)PARSER.parseFrom(data);
      }

      public static S2C_VideoInfo_28402 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_VideoInfo_28402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_VideoInfo_28402 parseFrom(InputStream input) throws IOException {
         return (S2C_VideoInfo_28402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_VideoInfo_28402 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_VideoInfo_28402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_VideoInfo_28402 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_VideoInfo_28402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_VideoInfo_28402 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_VideoInfo_28402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_VideoInfo_28402 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_VideoInfo_28402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_VideoInfo_28402 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_VideoInfo_28402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_VideoInfo_28402 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_VideoInfo_28402 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_VideoInfo_28402> parser() {
         return PARSER;
      }

      public Parser<S2C_VideoInfo_28402> getParserForType() {
         return PARSER;
      }

      public S2C_VideoInfo_28402 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_VideoInfo_28402OrBuilder {
         private int bitField0_;
         private int openServerDay_;
         private List<CommonMsg.MapDataII> videoRewards_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> videoRewardsBuilder_;
         private int maxRoundRewardId_;
         private int viewDideoCount_;
         private Internal.IntList rechargeNum_;
         private int failRewardTimes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_VideoInfo_28402_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_VideoInfo_28402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_VideoInfo_28402.class, Builder.class);
         }

         private Builder() {
            this.videoRewards_ = Collections.emptyList();
            this.rechargeNum_ = VideoMsg.S2C_VideoInfo_28402.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.videoRewards_ = Collections.emptyList();
            this.rechargeNum_ = VideoMsg.S2C_VideoInfo_28402.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (VideoMsg.S2C_VideoInfo_28402.alwaysUseFieldBuilders) {
               this.getVideoRewardsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.openServerDay_ = 0;
            this.bitField0_ &= -2;
            if (this.videoRewardsBuilder_ == null) {
               this.videoRewards_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.videoRewardsBuilder_.clear();
            }

            this.maxRoundRewardId_ = 0;
            this.bitField0_ &= -5;
            this.viewDideoCount_ = 0;
            this.bitField0_ &= -9;
            this.rechargeNum_ = VideoMsg.S2C_VideoInfo_28402.emptyIntList();
            this.bitField0_ &= -17;
            this.failRewardTimes_ = 0;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_VideoInfo_28402_descriptor;
         }

         public S2C_VideoInfo_28402 getDefaultInstanceForType() {
            return VideoMsg.S2C_VideoInfo_28402.getDefaultInstance();
         }

         public S2C_VideoInfo_28402 build() {
            S2C_VideoInfo_28402 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_VideoInfo_28402 buildPartial() {
            S2C_VideoInfo_28402 result = new S2C_VideoInfo_28402(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.openServerDay_ = this.openServerDay_;
               to_bitField0_ |= 1;
            }

            if (this.videoRewardsBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.videoRewards_ = Collections.unmodifiableList(this.videoRewards_);
                  this.bitField0_ &= -3;
               }

               result.videoRewards_ = this.videoRewards_;
            } else {
               result.videoRewards_ = this.videoRewardsBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.maxRoundRewardId_ = this.maxRoundRewardId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.viewDideoCount_ = this.viewDideoCount_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 16) != 0) {
               this.rechargeNum_.makeImmutable();
               this.bitField0_ &= -17;
            }

            result.rechargeNum_ = this.rechargeNum_;
            if ((from_bitField0_ & 32) != 0) {
               result.failRewardTimes_ = this.failRewardTimes_;
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
            if (other instanceof S2C_VideoInfo_28402) {
               return this.mergeFrom((S2C_VideoInfo_28402)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_VideoInfo_28402 other) {
            if (other == VideoMsg.S2C_VideoInfo_28402.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOpenServerDay()) {
                  this.setOpenServerDay(other.getOpenServerDay());
               }

               if (this.videoRewardsBuilder_ == null) {
                  if (!other.videoRewards_.isEmpty()) {
                     if (this.videoRewards_.isEmpty()) {
                        this.videoRewards_ = other.videoRewards_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureVideoRewardsIsMutable();
                        this.videoRewards_.addAll(other.videoRewards_);
                     }

                     this.onChanged();
                  }
               } else if (!other.videoRewards_.isEmpty()) {
                  if (this.videoRewardsBuilder_.isEmpty()) {
                     this.videoRewardsBuilder_.dispose();
                     this.videoRewardsBuilder_ = null;
                     this.videoRewards_ = other.videoRewards_;
                     this.bitField0_ &= -3;
                     this.videoRewardsBuilder_ = VideoMsg.S2C_VideoInfo_28402.alwaysUseFieldBuilders ? this.getVideoRewardsFieldBuilder() : null;
                  } else {
                     this.videoRewardsBuilder_.addAllMessages(other.videoRewards_);
                  }
               }

               if (other.hasMaxRoundRewardId()) {
                  this.setMaxRoundRewardId(other.getMaxRoundRewardId());
               }

               if (other.hasViewDideoCount()) {
                  this.setViewDideoCount(other.getViewDideoCount());
               }

               if (!other.rechargeNum_.isEmpty()) {
                  if (this.rechargeNum_.isEmpty()) {
                     this.rechargeNum_ = other.rechargeNum_;
                     this.bitField0_ &= -17;
                  } else {
                     this.ensureRechargeNumIsMutable();
                     this.rechargeNum_.addAll(other.rechargeNum_);
                  }

                  this.onChanged();
               }

               if (other.hasFailRewardTimes()) {
                  this.setFailRewardTimes(other.getFailRewardTimes());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasOpenServerDay()) {
               return false;
            } else if (!this.hasMaxRoundRewardId()) {
               return false;
            } else if (!this.hasViewDideoCount()) {
               return false;
            } else if (!this.hasFailRewardTimes()) {
               return false;
            } else {
               for(int i = 0; i < this.getVideoRewardsCount(); ++i) {
                  if (!this.getVideoRewards(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_VideoInfo_28402 parsedMessage = null;

            try {
               parsedMessage = (S2C_VideoInfo_28402)VideoMsg.S2C_VideoInfo_28402.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_VideoInfo_28402)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOpenServerDay() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getOpenServerDay() {
            return this.openServerDay_;
         }

         public Builder setOpenServerDay(int value) {
            this.bitField0_ |= 1;
            this.openServerDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpenServerDay() {
            this.bitField0_ &= -2;
            this.openServerDay_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureVideoRewardsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.videoRewards_ = new ArrayList(this.videoRewards_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.MapDataII> getVideoRewardsList() {
            return this.videoRewardsBuilder_ == null ? Collections.unmodifiableList(this.videoRewards_) : this.videoRewardsBuilder_.getMessageList();
         }

         public int getVideoRewardsCount() {
            return this.videoRewardsBuilder_ == null ? this.videoRewards_.size() : this.videoRewardsBuilder_.getCount();
         }

         public CommonMsg.MapDataII getVideoRewards(int index) {
            return this.videoRewardsBuilder_ == null ? (CommonMsg.MapDataII)this.videoRewards_.get(index) : (CommonMsg.MapDataII)this.videoRewardsBuilder_.getMessage(index);
         }

         public Builder setVideoRewards(int index, CommonMsg.MapDataII value) {
            if (this.videoRewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureVideoRewardsIsMutable();
               this.videoRewards_.set(index, value);
               this.onChanged();
            } else {
               this.videoRewardsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setVideoRewards(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.videoRewardsBuilder_ == null) {
               this.ensureVideoRewardsIsMutable();
               this.videoRewards_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.videoRewardsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addVideoRewards(CommonMsg.MapDataII value) {
            if (this.videoRewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureVideoRewardsIsMutable();
               this.videoRewards_.add(value);
               this.onChanged();
            } else {
               this.videoRewardsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addVideoRewards(int index, CommonMsg.MapDataII value) {
            if (this.videoRewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureVideoRewardsIsMutable();
               this.videoRewards_.add(index, value);
               this.onChanged();
            } else {
               this.videoRewardsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addVideoRewards(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.videoRewardsBuilder_ == null) {
               this.ensureVideoRewardsIsMutable();
               this.videoRewards_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.videoRewardsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addVideoRewards(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.videoRewardsBuilder_ == null) {
               this.ensureVideoRewardsIsMutable();
               this.videoRewards_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.videoRewardsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllVideoRewards(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.videoRewardsBuilder_ == null) {
               this.ensureVideoRewardsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.videoRewards_);
               this.onChanged();
            } else {
               this.videoRewardsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearVideoRewards() {
            if (this.videoRewardsBuilder_ == null) {
               this.videoRewards_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.videoRewardsBuilder_.clear();
            }

            return this;
         }

         public Builder removeVideoRewards(int index) {
            if (this.videoRewardsBuilder_ == null) {
               this.ensureVideoRewardsIsMutable();
               this.videoRewards_.remove(index);
               this.onChanged();
            } else {
               this.videoRewardsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getVideoRewardsBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getVideoRewardsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getVideoRewardsOrBuilder(int index) {
            return this.videoRewardsBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.videoRewards_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.videoRewardsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getVideoRewardsOrBuilderList() {
            return this.videoRewardsBuilder_ != null ? this.videoRewardsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.videoRewards_);
         }

         public CommonMsg.MapDataII.Builder addVideoRewardsBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getVideoRewardsFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addVideoRewardsBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getVideoRewardsFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getVideoRewardsBuilderList() {
            return this.getVideoRewardsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getVideoRewardsFieldBuilder() {
            if (this.videoRewardsBuilder_ == null) {
               this.videoRewardsBuilder_ = new RepeatedFieldBuilderV3(this.videoRewards_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.videoRewards_ = null;
            }

            return this.videoRewardsBuilder_;
         }

         public boolean hasMaxRoundRewardId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getMaxRoundRewardId() {
            return this.maxRoundRewardId_;
         }

         public Builder setMaxRoundRewardId(int value) {
            this.bitField0_ |= 4;
            this.maxRoundRewardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMaxRoundRewardId() {
            this.bitField0_ &= -5;
            this.maxRoundRewardId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasViewDideoCount() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getViewDideoCount() {
            return this.viewDideoCount_;
         }

         public Builder setViewDideoCount(int value) {
            this.bitField0_ |= 8;
            this.viewDideoCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearViewDideoCount() {
            this.bitField0_ &= -9;
            this.viewDideoCount_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRechargeNumIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.rechargeNum_ = VideoMsg.S2C_VideoInfo_28402.mutableCopy(this.rechargeNum_);
               this.bitField0_ |= 16;
            }

         }

         public List<Integer> getRechargeNumList() {
            return (List<Integer>)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.rechargeNum_) : this.rechargeNum_);
         }

         public int getRechargeNumCount() {
            return this.rechargeNum_.size();
         }

         public int getRechargeNum(int index) {
            return this.rechargeNum_.getInt(index);
         }

         public Builder setRechargeNum(int index, int value) {
            this.ensureRechargeNumIsMutable();
            this.rechargeNum_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRechargeNum(int value) {
            this.ensureRechargeNumIsMutable();
            this.rechargeNum_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRechargeNum(Iterable<? extends Integer> values) {
            this.ensureRechargeNumIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rechargeNum_);
            this.onChanged();
            return this;
         }

         public Builder clearRechargeNum() {
            this.rechargeNum_ = VideoMsg.S2C_VideoInfo_28402.emptyIntList();
            this.bitField0_ &= -17;
            this.onChanged();
            return this;
         }

         public boolean hasFailRewardTimes() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getFailRewardTimes() {
            return this.failRewardTimes_;
         }

         public Builder setFailRewardTimes(int value) {
            this.bitField0_ |= 32;
            this.failRewardTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFailRewardTimes() {
            this.bitField0_ &= -33;
            this.failRewardTimes_ = 0;
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

   public static final class C2S_WatchAndReward_28403 extends GeneratedMessageV3 implements C2S_WatchAndReward_28403OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PACKAGE_FIELD_NUMBER = 1;
      private int package_;
      private byte memoizedIsInitialized;
      private static final C2S_WatchAndReward_28403 DEFAULT_INSTANCE = new C2S_WatchAndReward_28403();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WatchAndReward_28403> PARSER = new AbstractParser<C2S_WatchAndReward_28403>() {
         public C2S_WatchAndReward_28403 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WatchAndReward_28403(input, extensionRegistry);
         }
      };

      private C2S_WatchAndReward_28403(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WatchAndReward_28403() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WatchAndReward_28403();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WatchAndReward_28403(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.package_ = input.readInt32();
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
         return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_WatchAndReward_28403_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_WatchAndReward_28403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WatchAndReward_28403.class, Builder.class);
      }

      public boolean hasPackage() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPackage() {
         return this.package_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPackage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.package_);
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
               size += CodedOutputStream.computeInt32Size(1, this.package_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_WatchAndReward_28403)) {
            return super.equals(obj);
         } else {
            C2S_WatchAndReward_28403 other = (C2S_WatchAndReward_28403)obj;
            if (this.hasPackage() != other.hasPackage()) {
               return false;
            } else if (this.hasPackage() && this.getPackage() != other.getPackage()) {
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
            if (this.hasPackage()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPackage();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_WatchAndReward_28403 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WatchAndReward_28403)PARSER.parseFrom(data);
      }

      public static C2S_WatchAndReward_28403 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WatchAndReward_28403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WatchAndReward_28403 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WatchAndReward_28403)PARSER.parseFrom(data);
      }

      public static C2S_WatchAndReward_28403 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WatchAndReward_28403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WatchAndReward_28403 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WatchAndReward_28403)PARSER.parseFrom(data);
      }

      public static C2S_WatchAndReward_28403 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WatchAndReward_28403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WatchAndReward_28403 parseFrom(InputStream input) throws IOException {
         return (C2S_WatchAndReward_28403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WatchAndReward_28403 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WatchAndReward_28403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WatchAndReward_28403 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WatchAndReward_28403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WatchAndReward_28403 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WatchAndReward_28403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WatchAndReward_28403 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WatchAndReward_28403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WatchAndReward_28403 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WatchAndReward_28403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WatchAndReward_28403 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WatchAndReward_28403 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WatchAndReward_28403> parser() {
         return PARSER;
      }

      public Parser<C2S_WatchAndReward_28403> getParserForType() {
         return PARSER;
      }

      public C2S_WatchAndReward_28403 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WatchAndReward_28403OrBuilder {
         private int bitField0_;
         private int package_;

         public static final Descriptors.Descriptor getDescriptor() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_WatchAndReward_28403_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_WatchAndReward_28403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WatchAndReward_28403.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (VideoMsg.C2S_WatchAndReward_28403.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.package_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_WatchAndReward_28403_descriptor;
         }

         public C2S_WatchAndReward_28403 getDefaultInstanceForType() {
            return VideoMsg.C2S_WatchAndReward_28403.getDefaultInstance();
         }

         public C2S_WatchAndReward_28403 build() {
            C2S_WatchAndReward_28403 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WatchAndReward_28403 buildPartial() {
            C2S_WatchAndReward_28403 result = new C2S_WatchAndReward_28403(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.package_ = this.package_;
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
            if (other instanceof C2S_WatchAndReward_28403) {
               return this.mergeFrom((C2S_WatchAndReward_28403)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WatchAndReward_28403 other) {
            if (other == VideoMsg.C2S_WatchAndReward_28403.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPackage()) {
                  this.setPackage(other.getPackage());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPackage();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_WatchAndReward_28403 parsedMessage = null;

            try {
               parsedMessage = (C2S_WatchAndReward_28403)VideoMsg.C2S_WatchAndReward_28403.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WatchAndReward_28403)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPackage() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPackage() {
            return this.package_;
         }

         public Builder setPackage(int value) {
            this.bitField0_ |= 1;
            this.package_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPackage() {
            this.bitField0_ &= -2;
            this.package_ = 0;
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

   public static final class S2C_WatchAndReward_28404 extends GeneratedMessageV3 implements S2C_WatchAndReward_28404OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PACKAGE_FIELD_NUMBER = 1;
      private int package_;
      public static final int REWARDTIME_FIELD_NUMBER = 2;
      private int rewardTime_;
      public static final int VIEWDIDEOCOUNT_FIELD_NUMBER = 3;
      private int viewDideoCount_;
      private byte memoizedIsInitialized;
      private static final S2C_WatchAndReward_28404 DEFAULT_INSTANCE = new S2C_WatchAndReward_28404();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WatchAndReward_28404> PARSER = new AbstractParser<S2C_WatchAndReward_28404>() {
         public S2C_WatchAndReward_28404 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WatchAndReward_28404(input, extensionRegistry);
         }
      };

      private S2C_WatchAndReward_28404(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WatchAndReward_28404() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WatchAndReward_28404();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WatchAndReward_28404(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.package_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.rewardTime_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.viewDideoCount_ = input.readInt32();
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
         return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_WatchAndReward_28404_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_WatchAndReward_28404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WatchAndReward_28404.class, Builder.class);
      }

      public boolean hasPackage() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPackage() {
         return this.package_;
      }

      public boolean hasRewardTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRewardTime() {
         return this.rewardTime_;
      }

      public boolean hasViewDideoCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getViewDideoCount() {
         return this.viewDideoCount_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPackage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRewardTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasViewDideoCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.package_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.rewardTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.viewDideoCount_);
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
               size += CodedOutputStream.computeInt32Size(1, this.package_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.rewardTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.viewDideoCount_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WatchAndReward_28404)) {
            return super.equals(obj);
         } else {
            S2C_WatchAndReward_28404 other = (S2C_WatchAndReward_28404)obj;
            if (this.hasPackage() != other.hasPackage()) {
               return false;
            } else if (this.hasPackage() && this.getPackage() != other.getPackage()) {
               return false;
            } else if (this.hasRewardTime() != other.hasRewardTime()) {
               return false;
            } else if (this.hasRewardTime() && this.getRewardTime() != other.getRewardTime()) {
               return false;
            } else if (this.hasViewDideoCount() != other.hasViewDideoCount()) {
               return false;
            } else if (this.hasViewDideoCount() && this.getViewDideoCount() != other.getViewDideoCount()) {
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
            if (this.hasPackage()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPackage();
            }

            if (this.hasRewardTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRewardTime();
            }

            if (this.hasViewDideoCount()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getViewDideoCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WatchAndReward_28404 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WatchAndReward_28404)PARSER.parseFrom(data);
      }

      public static S2C_WatchAndReward_28404 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WatchAndReward_28404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WatchAndReward_28404 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WatchAndReward_28404)PARSER.parseFrom(data);
      }

      public static S2C_WatchAndReward_28404 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WatchAndReward_28404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WatchAndReward_28404 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WatchAndReward_28404)PARSER.parseFrom(data);
      }

      public static S2C_WatchAndReward_28404 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WatchAndReward_28404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WatchAndReward_28404 parseFrom(InputStream input) throws IOException {
         return (S2C_WatchAndReward_28404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WatchAndReward_28404 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WatchAndReward_28404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WatchAndReward_28404 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WatchAndReward_28404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WatchAndReward_28404 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WatchAndReward_28404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WatchAndReward_28404 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WatchAndReward_28404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WatchAndReward_28404 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WatchAndReward_28404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WatchAndReward_28404 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WatchAndReward_28404 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WatchAndReward_28404> parser() {
         return PARSER;
      }

      public Parser<S2C_WatchAndReward_28404> getParserForType() {
         return PARSER;
      }

      public S2C_WatchAndReward_28404 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WatchAndReward_28404OrBuilder {
         private int bitField0_;
         private int package_;
         private int rewardTime_;
         private int viewDideoCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_WatchAndReward_28404_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_WatchAndReward_28404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WatchAndReward_28404.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (VideoMsg.S2C_WatchAndReward_28404.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.package_ = 0;
            this.bitField0_ &= -2;
            this.rewardTime_ = 0;
            this.bitField0_ &= -3;
            this.viewDideoCount_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_WatchAndReward_28404_descriptor;
         }

         public S2C_WatchAndReward_28404 getDefaultInstanceForType() {
            return VideoMsg.S2C_WatchAndReward_28404.getDefaultInstance();
         }

         public S2C_WatchAndReward_28404 build() {
            S2C_WatchAndReward_28404 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WatchAndReward_28404 buildPartial() {
            S2C_WatchAndReward_28404 result = new S2C_WatchAndReward_28404(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.package_ = this.package_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.rewardTime_ = this.rewardTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.viewDideoCount_ = this.viewDideoCount_;
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
            if (other instanceof S2C_WatchAndReward_28404) {
               return this.mergeFrom((S2C_WatchAndReward_28404)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WatchAndReward_28404 other) {
            if (other == VideoMsg.S2C_WatchAndReward_28404.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPackage()) {
                  this.setPackage(other.getPackage());
               }

               if (other.hasRewardTime()) {
                  this.setRewardTime(other.getRewardTime());
               }

               if (other.hasViewDideoCount()) {
                  this.setViewDideoCount(other.getViewDideoCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPackage()) {
               return false;
            } else if (!this.hasRewardTime()) {
               return false;
            } else {
               return this.hasViewDideoCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WatchAndReward_28404 parsedMessage = null;

            try {
               parsedMessage = (S2C_WatchAndReward_28404)VideoMsg.S2C_WatchAndReward_28404.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WatchAndReward_28404)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPackage() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPackage() {
            return this.package_;
         }

         public Builder setPackage(int value) {
            this.bitField0_ |= 1;
            this.package_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPackage() {
            this.bitField0_ &= -2;
            this.package_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRewardTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRewardTime() {
            return this.rewardTime_;
         }

         public Builder setRewardTime(int value) {
            this.bitField0_ |= 2;
            this.rewardTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardTime() {
            this.bitField0_ &= -3;
            this.rewardTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasViewDideoCount() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getViewDideoCount() {
            return this.viewDideoCount_;
         }

         public Builder setViewDideoCount(int value) {
            this.bitField0_ |= 4;
            this.viewDideoCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearViewDideoCount() {
            this.bitField0_ &= -5;
            this.viewDideoCount_ = 0;
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

   public static final class C2S_VideoTimeReward_28405 extends GeneratedMessageV3 implements C2S_VideoTimeReward_28405OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_VideoTimeReward_28405 DEFAULT_INSTANCE = new C2S_VideoTimeReward_28405();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_VideoTimeReward_28405> PARSER = new AbstractParser<C2S_VideoTimeReward_28405>() {
         public C2S_VideoTimeReward_28405 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_VideoTimeReward_28405(input, extensionRegistry);
         }
      };

      private C2S_VideoTimeReward_28405(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_VideoTimeReward_28405() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_VideoTimeReward_28405();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_VideoTimeReward_28405(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_VideoTimeReward_28405_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_VideoTimeReward_28405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_VideoTimeReward_28405.class, Builder.class);
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
         } else if (!(obj instanceof C2S_VideoTimeReward_28405)) {
            return super.equals(obj);
         } else {
            C2S_VideoTimeReward_28405 other = (C2S_VideoTimeReward_28405)obj;
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

      public static C2S_VideoTimeReward_28405 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_VideoTimeReward_28405)PARSER.parseFrom(data);
      }

      public static C2S_VideoTimeReward_28405 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VideoTimeReward_28405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VideoTimeReward_28405 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_VideoTimeReward_28405)PARSER.parseFrom(data);
      }

      public static C2S_VideoTimeReward_28405 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VideoTimeReward_28405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VideoTimeReward_28405 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_VideoTimeReward_28405)PARSER.parseFrom(data);
      }

      public static C2S_VideoTimeReward_28405 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_VideoTimeReward_28405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_VideoTimeReward_28405 parseFrom(InputStream input) throws IOException {
         return (C2S_VideoTimeReward_28405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_VideoTimeReward_28405 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VideoTimeReward_28405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_VideoTimeReward_28405 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_VideoTimeReward_28405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_VideoTimeReward_28405 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VideoTimeReward_28405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_VideoTimeReward_28405 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_VideoTimeReward_28405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_VideoTimeReward_28405 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_VideoTimeReward_28405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_VideoTimeReward_28405 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_VideoTimeReward_28405 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_VideoTimeReward_28405> parser() {
         return PARSER;
      }

      public Parser<C2S_VideoTimeReward_28405> getParserForType() {
         return PARSER;
      }

      public C2S_VideoTimeReward_28405 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_VideoTimeReward_28405OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_VideoTimeReward_28405_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_VideoTimeReward_28405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_VideoTimeReward_28405.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (VideoMsg.C2S_VideoTimeReward_28405.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_VideoTimeReward_28405_descriptor;
         }

         public C2S_VideoTimeReward_28405 getDefaultInstanceForType() {
            return VideoMsg.C2S_VideoTimeReward_28405.getDefaultInstance();
         }

         public C2S_VideoTimeReward_28405 build() {
            C2S_VideoTimeReward_28405 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_VideoTimeReward_28405 buildPartial() {
            C2S_VideoTimeReward_28405 result = new C2S_VideoTimeReward_28405(this);
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
            if (other instanceof C2S_VideoTimeReward_28405) {
               return this.mergeFrom((C2S_VideoTimeReward_28405)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_VideoTimeReward_28405 other) {
            if (other == VideoMsg.C2S_VideoTimeReward_28405.getDefaultInstance()) {
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
            C2S_VideoTimeReward_28405 parsedMessage = null;

            try {
               parsedMessage = (C2S_VideoTimeReward_28405)VideoMsg.C2S_VideoTimeReward_28405.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_VideoTimeReward_28405)e.getUnfinishedMessage();
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

   public static final class S2C_WatchAndReward_28406 extends GeneratedMessageV3 implements S2C_WatchAndReward_28406OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MAXROUNDREWARDID_FIELD_NUMBER = 1;
      private int maxRoundRewardId_;
      private byte memoizedIsInitialized;
      private static final S2C_WatchAndReward_28406 DEFAULT_INSTANCE = new S2C_WatchAndReward_28406();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WatchAndReward_28406> PARSER = new AbstractParser<S2C_WatchAndReward_28406>() {
         public S2C_WatchAndReward_28406 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WatchAndReward_28406(input, extensionRegistry);
         }
      };

      private S2C_WatchAndReward_28406(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WatchAndReward_28406() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WatchAndReward_28406();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WatchAndReward_28406(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.maxRoundRewardId_ = input.readInt32();
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
         return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_WatchAndReward_28406_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_WatchAndReward_28406_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WatchAndReward_28406.class, Builder.class);
      }

      public boolean hasMaxRoundRewardId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getMaxRoundRewardId() {
         return this.maxRoundRewardId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMaxRoundRewardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.maxRoundRewardId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.maxRoundRewardId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WatchAndReward_28406)) {
            return super.equals(obj);
         } else {
            S2C_WatchAndReward_28406 other = (S2C_WatchAndReward_28406)obj;
            if (this.hasMaxRoundRewardId() != other.hasMaxRoundRewardId()) {
               return false;
            } else if (this.hasMaxRoundRewardId() && this.getMaxRoundRewardId() != other.getMaxRoundRewardId()) {
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
            if (this.hasMaxRoundRewardId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMaxRoundRewardId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WatchAndReward_28406 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WatchAndReward_28406)PARSER.parseFrom(data);
      }

      public static S2C_WatchAndReward_28406 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WatchAndReward_28406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WatchAndReward_28406 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WatchAndReward_28406)PARSER.parseFrom(data);
      }

      public static S2C_WatchAndReward_28406 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WatchAndReward_28406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WatchAndReward_28406 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WatchAndReward_28406)PARSER.parseFrom(data);
      }

      public static S2C_WatchAndReward_28406 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WatchAndReward_28406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WatchAndReward_28406 parseFrom(InputStream input) throws IOException {
         return (S2C_WatchAndReward_28406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WatchAndReward_28406 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WatchAndReward_28406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WatchAndReward_28406 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WatchAndReward_28406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WatchAndReward_28406 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WatchAndReward_28406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WatchAndReward_28406 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WatchAndReward_28406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WatchAndReward_28406 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WatchAndReward_28406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WatchAndReward_28406 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WatchAndReward_28406 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WatchAndReward_28406> parser() {
         return PARSER;
      }

      public Parser<S2C_WatchAndReward_28406> getParserForType() {
         return PARSER;
      }

      public S2C_WatchAndReward_28406 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WatchAndReward_28406OrBuilder {
         private int bitField0_;
         private int maxRoundRewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_WatchAndReward_28406_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_WatchAndReward_28406_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WatchAndReward_28406.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (VideoMsg.S2C_WatchAndReward_28406.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.maxRoundRewardId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_WatchAndReward_28406_descriptor;
         }

         public S2C_WatchAndReward_28406 getDefaultInstanceForType() {
            return VideoMsg.S2C_WatchAndReward_28406.getDefaultInstance();
         }

         public S2C_WatchAndReward_28406 build() {
            S2C_WatchAndReward_28406 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WatchAndReward_28406 buildPartial() {
            S2C_WatchAndReward_28406 result = new S2C_WatchAndReward_28406(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.maxRoundRewardId_ = this.maxRoundRewardId_;
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
            if (other instanceof S2C_WatchAndReward_28406) {
               return this.mergeFrom((S2C_WatchAndReward_28406)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WatchAndReward_28406 other) {
            if (other == VideoMsg.S2C_WatchAndReward_28406.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMaxRoundRewardId()) {
                  this.setMaxRoundRewardId(other.getMaxRoundRewardId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasMaxRoundRewardId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WatchAndReward_28406 parsedMessage = null;

            try {
               parsedMessage = (S2C_WatchAndReward_28406)VideoMsg.S2C_WatchAndReward_28406.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WatchAndReward_28406)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMaxRoundRewardId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getMaxRoundRewardId() {
            return this.maxRoundRewardId_;
         }

         public Builder setMaxRoundRewardId(int value) {
            this.bitField0_ |= 1;
            this.maxRoundRewardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMaxRoundRewardId() {
            this.bitField0_ &= -2;
            this.maxRoundRewardId_ = 0;
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

   public static final class C2S_SkipVideoReward_28407 extends GeneratedMessageV3 implements C2S_SkipVideoReward_28407OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PACKAGE_FIELD_NUMBER = 1;
      private int package_;
      private byte memoizedIsInitialized;
      private static final C2S_SkipVideoReward_28407 DEFAULT_INSTANCE = new C2S_SkipVideoReward_28407();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SkipVideoReward_28407> PARSER = new AbstractParser<C2S_SkipVideoReward_28407>() {
         public C2S_SkipVideoReward_28407 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SkipVideoReward_28407(input, extensionRegistry);
         }
      };

      private C2S_SkipVideoReward_28407(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SkipVideoReward_28407() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SkipVideoReward_28407();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SkipVideoReward_28407(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.package_ = input.readInt32();
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
         return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_SkipVideoReward_28407_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_SkipVideoReward_28407_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SkipVideoReward_28407.class, Builder.class);
      }

      public boolean hasPackage() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPackage() {
         return this.package_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPackage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.package_);
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
               size += CodedOutputStream.computeInt32Size(1, this.package_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SkipVideoReward_28407)) {
            return super.equals(obj);
         } else {
            C2S_SkipVideoReward_28407 other = (C2S_SkipVideoReward_28407)obj;
            if (this.hasPackage() != other.hasPackage()) {
               return false;
            } else if (this.hasPackage() && this.getPackage() != other.getPackage()) {
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
            if (this.hasPackage()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPackage();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SkipVideoReward_28407 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SkipVideoReward_28407)PARSER.parseFrom(data);
      }

      public static C2S_SkipVideoReward_28407 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SkipVideoReward_28407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SkipVideoReward_28407 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SkipVideoReward_28407)PARSER.parseFrom(data);
      }

      public static C2S_SkipVideoReward_28407 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SkipVideoReward_28407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SkipVideoReward_28407 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SkipVideoReward_28407)PARSER.parseFrom(data);
      }

      public static C2S_SkipVideoReward_28407 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SkipVideoReward_28407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SkipVideoReward_28407 parseFrom(InputStream input) throws IOException {
         return (C2S_SkipVideoReward_28407)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SkipVideoReward_28407 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SkipVideoReward_28407)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SkipVideoReward_28407 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SkipVideoReward_28407)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SkipVideoReward_28407 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SkipVideoReward_28407)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SkipVideoReward_28407 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SkipVideoReward_28407)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SkipVideoReward_28407 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SkipVideoReward_28407)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SkipVideoReward_28407 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SkipVideoReward_28407 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SkipVideoReward_28407> parser() {
         return PARSER;
      }

      public Parser<C2S_SkipVideoReward_28407> getParserForType() {
         return PARSER;
      }

      public C2S_SkipVideoReward_28407 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SkipVideoReward_28407OrBuilder {
         private int bitField0_;
         private int package_;

         public static final Descriptors.Descriptor getDescriptor() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_SkipVideoReward_28407_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_SkipVideoReward_28407_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SkipVideoReward_28407.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (VideoMsg.C2S_SkipVideoReward_28407.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.package_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_SkipVideoReward_28407_descriptor;
         }

         public C2S_SkipVideoReward_28407 getDefaultInstanceForType() {
            return VideoMsg.C2S_SkipVideoReward_28407.getDefaultInstance();
         }

         public C2S_SkipVideoReward_28407 build() {
            C2S_SkipVideoReward_28407 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SkipVideoReward_28407 buildPartial() {
            C2S_SkipVideoReward_28407 result = new C2S_SkipVideoReward_28407(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.package_ = this.package_;
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
            if (other instanceof C2S_SkipVideoReward_28407) {
               return this.mergeFrom((C2S_SkipVideoReward_28407)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SkipVideoReward_28407 other) {
            if (other == VideoMsg.C2S_SkipVideoReward_28407.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPackage()) {
                  this.setPackage(other.getPackage());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPackage();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_SkipVideoReward_28407 parsedMessage = null;

            try {
               parsedMessage = (C2S_SkipVideoReward_28407)VideoMsg.C2S_SkipVideoReward_28407.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SkipVideoReward_28407)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPackage() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPackage() {
            return this.package_;
         }

         public Builder setPackage(int value) {
            this.bitField0_ |= 1;
            this.package_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPackage() {
            this.bitField0_ &= -2;
            this.package_ = 0;
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

   public static final class S2C_SkipVideoReward_28408 extends GeneratedMessageV3 implements S2C_SkipVideoReward_28408OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PACKAGE_FIELD_NUMBER = 1;
      private int package_;
      public static final int REWARDTIME_FIELD_NUMBER = 2;
      private int rewardTime_;
      public static final int VIEWDIDEOCOUNT_FIELD_NUMBER = 3;
      private int viewDideoCount_;
      private byte memoizedIsInitialized;
      private static final S2C_SkipVideoReward_28408 DEFAULT_INSTANCE = new S2C_SkipVideoReward_28408();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SkipVideoReward_28408> PARSER = new AbstractParser<S2C_SkipVideoReward_28408>() {
         public S2C_SkipVideoReward_28408 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SkipVideoReward_28408(input, extensionRegistry);
         }
      };

      private S2C_SkipVideoReward_28408(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SkipVideoReward_28408() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SkipVideoReward_28408();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SkipVideoReward_28408(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.package_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.rewardTime_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.viewDideoCount_ = input.readInt32();
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
         return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_SkipVideoReward_28408_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_SkipVideoReward_28408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SkipVideoReward_28408.class, Builder.class);
      }

      public boolean hasPackage() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPackage() {
         return this.package_;
      }

      public boolean hasRewardTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRewardTime() {
         return this.rewardTime_;
      }

      public boolean hasViewDideoCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getViewDideoCount() {
         return this.viewDideoCount_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPackage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRewardTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasViewDideoCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.package_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.rewardTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.viewDideoCount_);
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
               size += CodedOutputStream.computeInt32Size(1, this.package_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.rewardTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.viewDideoCount_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SkipVideoReward_28408)) {
            return super.equals(obj);
         } else {
            S2C_SkipVideoReward_28408 other = (S2C_SkipVideoReward_28408)obj;
            if (this.hasPackage() != other.hasPackage()) {
               return false;
            } else if (this.hasPackage() && this.getPackage() != other.getPackage()) {
               return false;
            } else if (this.hasRewardTime() != other.hasRewardTime()) {
               return false;
            } else if (this.hasRewardTime() && this.getRewardTime() != other.getRewardTime()) {
               return false;
            } else if (this.hasViewDideoCount() != other.hasViewDideoCount()) {
               return false;
            } else if (this.hasViewDideoCount() && this.getViewDideoCount() != other.getViewDideoCount()) {
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
            if (this.hasPackage()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPackage();
            }

            if (this.hasRewardTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRewardTime();
            }

            if (this.hasViewDideoCount()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getViewDideoCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SkipVideoReward_28408 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SkipVideoReward_28408)PARSER.parseFrom(data);
      }

      public static S2C_SkipVideoReward_28408 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SkipVideoReward_28408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SkipVideoReward_28408 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SkipVideoReward_28408)PARSER.parseFrom(data);
      }

      public static S2C_SkipVideoReward_28408 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SkipVideoReward_28408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SkipVideoReward_28408 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SkipVideoReward_28408)PARSER.parseFrom(data);
      }

      public static S2C_SkipVideoReward_28408 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SkipVideoReward_28408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SkipVideoReward_28408 parseFrom(InputStream input) throws IOException {
         return (S2C_SkipVideoReward_28408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SkipVideoReward_28408 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SkipVideoReward_28408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SkipVideoReward_28408 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SkipVideoReward_28408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SkipVideoReward_28408 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SkipVideoReward_28408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SkipVideoReward_28408 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SkipVideoReward_28408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SkipVideoReward_28408 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SkipVideoReward_28408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SkipVideoReward_28408 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SkipVideoReward_28408 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SkipVideoReward_28408> parser() {
         return PARSER;
      }

      public Parser<S2C_SkipVideoReward_28408> getParserForType() {
         return PARSER;
      }

      public S2C_SkipVideoReward_28408 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SkipVideoReward_28408OrBuilder {
         private int bitField0_;
         private int package_;
         private int rewardTime_;
         private int viewDideoCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_SkipVideoReward_28408_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_SkipVideoReward_28408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SkipVideoReward_28408.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (VideoMsg.S2C_SkipVideoReward_28408.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.package_ = 0;
            this.bitField0_ &= -2;
            this.rewardTime_ = 0;
            this.bitField0_ &= -3;
            this.viewDideoCount_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_SkipVideoReward_28408_descriptor;
         }

         public S2C_SkipVideoReward_28408 getDefaultInstanceForType() {
            return VideoMsg.S2C_SkipVideoReward_28408.getDefaultInstance();
         }

         public S2C_SkipVideoReward_28408 build() {
            S2C_SkipVideoReward_28408 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SkipVideoReward_28408 buildPartial() {
            S2C_SkipVideoReward_28408 result = new S2C_SkipVideoReward_28408(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.package_ = this.package_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.rewardTime_ = this.rewardTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.viewDideoCount_ = this.viewDideoCount_;
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
            if (other instanceof S2C_SkipVideoReward_28408) {
               return this.mergeFrom((S2C_SkipVideoReward_28408)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SkipVideoReward_28408 other) {
            if (other == VideoMsg.S2C_SkipVideoReward_28408.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPackage()) {
                  this.setPackage(other.getPackage());
               }

               if (other.hasRewardTime()) {
                  this.setRewardTime(other.getRewardTime());
               }

               if (other.hasViewDideoCount()) {
                  this.setViewDideoCount(other.getViewDideoCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPackage()) {
               return false;
            } else if (!this.hasRewardTime()) {
               return false;
            } else {
               return this.hasViewDideoCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SkipVideoReward_28408 parsedMessage = null;

            try {
               parsedMessage = (S2C_SkipVideoReward_28408)VideoMsg.S2C_SkipVideoReward_28408.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SkipVideoReward_28408)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPackage() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPackage() {
            return this.package_;
         }

         public Builder setPackage(int value) {
            this.bitField0_ |= 1;
            this.package_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPackage() {
            this.bitField0_ &= -2;
            this.package_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRewardTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRewardTime() {
            return this.rewardTime_;
         }

         public Builder setRewardTime(int value) {
            this.bitField0_ |= 2;
            this.rewardTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardTime() {
            this.bitField0_ &= -3;
            this.rewardTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasViewDideoCount() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getViewDideoCount() {
            return this.viewDideoCount_;
         }

         public Builder setViewDideoCount(int value) {
            this.bitField0_ |= 4;
            this.viewDideoCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearViewDideoCount() {
            this.bitField0_ &= -5;
            this.viewDideoCount_ = 0;
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

   public static final class C2S_DailyRechargeReward_28409 extends GeneratedMessageV3 implements C2S_DailyRechargeReward_28409OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECHARGENUM_FIELD_NUMBER = 1;
      private int rechargeNum_;
      private byte memoizedIsInitialized;
      private static final C2S_DailyRechargeReward_28409 DEFAULT_INSTANCE = new C2S_DailyRechargeReward_28409();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DailyRechargeReward_28409> PARSER = new AbstractParser<C2S_DailyRechargeReward_28409>() {
         public C2S_DailyRechargeReward_28409 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DailyRechargeReward_28409(input, extensionRegistry);
         }
      };

      private C2S_DailyRechargeReward_28409(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DailyRechargeReward_28409() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DailyRechargeReward_28409();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DailyRechargeReward_28409(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rechargeNum_ = input.readInt32();
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
         return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_DailyRechargeReward_28409_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_DailyRechargeReward_28409_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DailyRechargeReward_28409.class, Builder.class);
      }

      public boolean hasRechargeNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRechargeNum() {
         return this.rechargeNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRechargeNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.rechargeNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.rechargeNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_DailyRechargeReward_28409)) {
            return super.equals(obj);
         } else {
            C2S_DailyRechargeReward_28409 other = (C2S_DailyRechargeReward_28409)obj;
            if (this.hasRechargeNum() != other.hasRechargeNum()) {
               return false;
            } else if (this.hasRechargeNum() && this.getRechargeNum() != other.getRechargeNum()) {
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
            if (this.hasRechargeNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRechargeNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_DailyRechargeReward_28409 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DailyRechargeReward_28409)PARSER.parseFrom(data);
      }

      public static C2S_DailyRechargeReward_28409 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailyRechargeReward_28409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailyRechargeReward_28409 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DailyRechargeReward_28409)PARSER.parseFrom(data);
      }

      public static C2S_DailyRechargeReward_28409 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailyRechargeReward_28409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailyRechargeReward_28409 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DailyRechargeReward_28409)PARSER.parseFrom(data);
      }

      public static C2S_DailyRechargeReward_28409 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailyRechargeReward_28409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailyRechargeReward_28409 parseFrom(InputStream input) throws IOException {
         return (C2S_DailyRechargeReward_28409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DailyRechargeReward_28409 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailyRechargeReward_28409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DailyRechargeReward_28409 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DailyRechargeReward_28409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DailyRechargeReward_28409 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailyRechargeReward_28409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DailyRechargeReward_28409 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DailyRechargeReward_28409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DailyRechargeReward_28409 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailyRechargeReward_28409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DailyRechargeReward_28409 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DailyRechargeReward_28409 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DailyRechargeReward_28409> parser() {
         return PARSER;
      }

      public Parser<C2S_DailyRechargeReward_28409> getParserForType() {
         return PARSER;
      }

      public C2S_DailyRechargeReward_28409 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DailyRechargeReward_28409OrBuilder {
         private int bitField0_;
         private int rechargeNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_DailyRechargeReward_28409_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_DailyRechargeReward_28409_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DailyRechargeReward_28409.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (VideoMsg.C2S_DailyRechargeReward_28409.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rechargeNum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_DailyRechargeReward_28409_descriptor;
         }

         public C2S_DailyRechargeReward_28409 getDefaultInstanceForType() {
            return VideoMsg.C2S_DailyRechargeReward_28409.getDefaultInstance();
         }

         public C2S_DailyRechargeReward_28409 build() {
            C2S_DailyRechargeReward_28409 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DailyRechargeReward_28409 buildPartial() {
            C2S_DailyRechargeReward_28409 result = new C2S_DailyRechargeReward_28409(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rechargeNum_ = this.rechargeNum_;
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
            if (other instanceof C2S_DailyRechargeReward_28409) {
               return this.mergeFrom((C2S_DailyRechargeReward_28409)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DailyRechargeReward_28409 other) {
            if (other == VideoMsg.C2S_DailyRechargeReward_28409.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRechargeNum()) {
                  this.setRechargeNum(other.getRechargeNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRechargeNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_DailyRechargeReward_28409 parsedMessage = null;

            try {
               parsedMessage = (C2S_DailyRechargeReward_28409)VideoMsg.C2S_DailyRechargeReward_28409.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DailyRechargeReward_28409)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRechargeNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRechargeNum() {
            return this.rechargeNum_;
         }

         public Builder setRechargeNum(int value) {
            this.bitField0_ |= 1;
            this.rechargeNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRechargeNum() {
            this.bitField0_ &= -2;
            this.rechargeNum_ = 0;
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

   public static final class S2C_DailyRechargeReward_28410 extends GeneratedMessageV3 implements S2C_DailyRechargeReward_28410OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECHARGENUM_FIELD_NUMBER = 1;
      private int rechargeNum_;
      private byte memoizedIsInitialized;
      private static final S2C_DailyRechargeReward_28410 DEFAULT_INSTANCE = new S2C_DailyRechargeReward_28410();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DailyRechargeReward_28410> PARSER = new AbstractParser<S2C_DailyRechargeReward_28410>() {
         public S2C_DailyRechargeReward_28410 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DailyRechargeReward_28410(input, extensionRegistry);
         }
      };

      private S2C_DailyRechargeReward_28410(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DailyRechargeReward_28410() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DailyRechargeReward_28410();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DailyRechargeReward_28410(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rechargeNum_ = input.readInt32();
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
         return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_DailyRechargeReward_28410_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_DailyRechargeReward_28410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DailyRechargeReward_28410.class, Builder.class);
      }

      public boolean hasRechargeNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRechargeNum() {
         return this.rechargeNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRechargeNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.rechargeNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.rechargeNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DailyRechargeReward_28410)) {
            return super.equals(obj);
         } else {
            S2C_DailyRechargeReward_28410 other = (S2C_DailyRechargeReward_28410)obj;
            if (this.hasRechargeNum() != other.hasRechargeNum()) {
               return false;
            } else if (this.hasRechargeNum() && this.getRechargeNum() != other.getRechargeNum()) {
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
            if (this.hasRechargeNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRechargeNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DailyRechargeReward_28410 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DailyRechargeReward_28410)PARSER.parseFrom(data);
      }

      public static S2C_DailyRechargeReward_28410 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailyRechargeReward_28410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailyRechargeReward_28410 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DailyRechargeReward_28410)PARSER.parseFrom(data);
      }

      public static S2C_DailyRechargeReward_28410 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailyRechargeReward_28410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailyRechargeReward_28410 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DailyRechargeReward_28410)PARSER.parseFrom(data);
      }

      public static S2C_DailyRechargeReward_28410 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailyRechargeReward_28410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailyRechargeReward_28410 parseFrom(InputStream input) throws IOException {
         return (S2C_DailyRechargeReward_28410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DailyRechargeReward_28410 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailyRechargeReward_28410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DailyRechargeReward_28410 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DailyRechargeReward_28410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DailyRechargeReward_28410 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailyRechargeReward_28410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DailyRechargeReward_28410 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DailyRechargeReward_28410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DailyRechargeReward_28410 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailyRechargeReward_28410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DailyRechargeReward_28410 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DailyRechargeReward_28410 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DailyRechargeReward_28410> parser() {
         return PARSER;
      }

      public Parser<S2C_DailyRechargeReward_28410> getParserForType() {
         return PARSER;
      }

      public S2C_DailyRechargeReward_28410 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DailyRechargeReward_28410OrBuilder {
         private int bitField0_;
         private int rechargeNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_DailyRechargeReward_28410_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_DailyRechargeReward_28410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DailyRechargeReward_28410.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (VideoMsg.S2C_DailyRechargeReward_28410.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rechargeNum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_DailyRechargeReward_28410_descriptor;
         }

         public S2C_DailyRechargeReward_28410 getDefaultInstanceForType() {
            return VideoMsg.S2C_DailyRechargeReward_28410.getDefaultInstance();
         }

         public S2C_DailyRechargeReward_28410 build() {
            S2C_DailyRechargeReward_28410 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DailyRechargeReward_28410 buildPartial() {
            S2C_DailyRechargeReward_28410 result = new S2C_DailyRechargeReward_28410(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rechargeNum_ = this.rechargeNum_;
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
            if (other instanceof S2C_DailyRechargeReward_28410) {
               return this.mergeFrom((S2C_DailyRechargeReward_28410)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DailyRechargeReward_28410 other) {
            if (other == VideoMsg.S2C_DailyRechargeReward_28410.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRechargeNum()) {
                  this.setRechargeNum(other.getRechargeNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRechargeNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DailyRechargeReward_28410 parsedMessage = null;

            try {
               parsedMessage = (S2C_DailyRechargeReward_28410)VideoMsg.S2C_DailyRechargeReward_28410.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DailyRechargeReward_28410)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRechargeNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRechargeNum() {
            return this.rechargeNum_;
         }

         public Builder setRechargeNum(int value) {
            this.bitField0_ |= 1;
            this.rechargeNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRechargeNum() {
            this.bitField0_ &= -2;
            this.rechargeNum_ = 0;
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

   public static final class C2S_WatchFailReward_28411 extends GeneratedMessageV3 implements C2S_WatchFailReward_28411OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PACKAGE_FIELD_NUMBER = 1;
      private int package_;
      private byte memoizedIsInitialized;
      private static final C2S_WatchFailReward_28411 DEFAULT_INSTANCE = new C2S_WatchFailReward_28411();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WatchFailReward_28411> PARSER = new AbstractParser<C2S_WatchFailReward_28411>() {
         public C2S_WatchFailReward_28411 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WatchFailReward_28411(input, extensionRegistry);
         }
      };

      private C2S_WatchFailReward_28411(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WatchFailReward_28411() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WatchFailReward_28411();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WatchFailReward_28411(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.package_ = input.readInt32();
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
         return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_WatchFailReward_28411_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_WatchFailReward_28411_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WatchFailReward_28411.class, Builder.class);
      }

      public boolean hasPackage() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPackage() {
         return this.package_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPackage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.package_);
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
               size += CodedOutputStream.computeInt32Size(1, this.package_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_WatchFailReward_28411)) {
            return super.equals(obj);
         } else {
            C2S_WatchFailReward_28411 other = (C2S_WatchFailReward_28411)obj;
            if (this.hasPackage() != other.hasPackage()) {
               return false;
            } else if (this.hasPackage() && this.getPackage() != other.getPackage()) {
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
            if (this.hasPackage()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPackage();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_WatchFailReward_28411 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WatchFailReward_28411)PARSER.parseFrom(data);
      }

      public static C2S_WatchFailReward_28411 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WatchFailReward_28411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WatchFailReward_28411 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WatchFailReward_28411)PARSER.parseFrom(data);
      }

      public static C2S_WatchFailReward_28411 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WatchFailReward_28411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WatchFailReward_28411 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WatchFailReward_28411)PARSER.parseFrom(data);
      }

      public static C2S_WatchFailReward_28411 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WatchFailReward_28411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WatchFailReward_28411 parseFrom(InputStream input) throws IOException {
         return (C2S_WatchFailReward_28411)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WatchFailReward_28411 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WatchFailReward_28411)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WatchFailReward_28411 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WatchFailReward_28411)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WatchFailReward_28411 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WatchFailReward_28411)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WatchFailReward_28411 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WatchFailReward_28411)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WatchFailReward_28411 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WatchFailReward_28411)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WatchFailReward_28411 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WatchFailReward_28411 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WatchFailReward_28411> parser() {
         return PARSER;
      }

      public Parser<C2S_WatchFailReward_28411> getParserForType() {
         return PARSER;
      }

      public C2S_WatchFailReward_28411 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WatchFailReward_28411OrBuilder {
         private int bitField0_;
         private int package_;

         public static final Descriptors.Descriptor getDescriptor() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_WatchFailReward_28411_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_WatchFailReward_28411_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WatchFailReward_28411.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (VideoMsg.C2S_WatchFailReward_28411.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.package_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_C2S_WatchFailReward_28411_descriptor;
         }

         public C2S_WatchFailReward_28411 getDefaultInstanceForType() {
            return VideoMsg.C2S_WatchFailReward_28411.getDefaultInstance();
         }

         public C2S_WatchFailReward_28411 build() {
            C2S_WatchFailReward_28411 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WatchFailReward_28411 buildPartial() {
            C2S_WatchFailReward_28411 result = new C2S_WatchFailReward_28411(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.package_ = this.package_;
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
            if (other instanceof C2S_WatchFailReward_28411) {
               return this.mergeFrom((C2S_WatchFailReward_28411)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WatchFailReward_28411 other) {
            if (other == VideoMsg.C2S_WatchFailReward_28411.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPackage()) {
                  this.setPackage(other.getPackage());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPackage();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_WatchFailReward_28411 parsedMessage = null;

            try {
               parsedMessage = (C2S_WatchFailReward_28411)VideoMsg.C2S_WatchFailReward_28411.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WatchFailReward_28411)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPackage() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPackage() {
            return this.package_;
         }

         public Builder setPackage(int value) {
            this.bitField0_ |= 1;
            this.package_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPackage() {
            this.bitField0_ &= -2;
            this.package_ = 0;
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

   public static final class S2C_WatchFailReward_28412 extends GeneratedMessageV3 implements S2C_WatchFailReward_28412OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PACKAGE_FIELD_NUMBER = 1;
      private int package_;
      public static final int REWARDTIME_FIELD_NUMBER = 2;
      private int rewardTime_;
      public static final int VIEWDIDEOCOUNT_FIELD_NUMBER = 3;
      private int viewDideoCount_;
      public static final int FAILREWARDTIMES_FIELD_NUMBER = 4;
      private int failRewardTimes_;
      private byte memoizedIsInitialized;
      private static final S2C_WatchFailReward_28412 DEFAULT_INSTANCE = new S2C_WatchFailReward_28412();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WatchFailReward_28412> PARSER = new AbstractParser<S2C_WatchFailReward_28412>() {
         public S2C_WatchFailReward_28412 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WatchFailReward_28412(input, extensionRegistry);
         }
      };

      private S2C_WatchFailReward_28412(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WatchFailReward_28412() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WatchFailReward_28412();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WatchFailReward_28412(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.package_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.rewardTime_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.viewDideoCount_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.failRewardTimes_ = input.readInt32();
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
         return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_WatchFailReward_28412_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_WatchFailReward_28412_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WatchFailReward_28412.class, Builder.class);
      }

      public boolean hasPackage() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPackage() {
         return this.package_;
      }

      public boolean hasRewardTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRewardTime() {
         return this.rewardTime_;
      }

      public boolean hasViewDideoCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getViewDideoCount() {
         return this.viewDideoCount_;
      }

      public boolean hasFailRewardTimes() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getFailRewardTimes() {
         return this.failRewardTimes_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPackage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRewardTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasViewDideoCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFailRewardTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.package_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.rewardTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.viewDideoCount_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.failRewardTimes_);
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
               size += CodedOutputStream.computeInt32Size(1, this.package_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.rewardTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.viewDideoCount_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.failRewardTimes_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WatchFailReward_28412)) {
            return super.equals(obj);
         } else {
            S2C_WatchFailReward_28412 other = (S2C_WatchFailReward_28412)obj;
            if (this.hasPackage() != other.hasPackage()) {
               return false;
            } else if (this.hasPackage() && this.getPackage() != other.getPackage()) {
               return false;
            } else if (this.hasRewardTime() != other.hasRewardTime()) {
               return false;
            } else if (this.hasRewardTime() && this.getRewardTime() != other.getRewardTime()) {
               return false;
            } else if (this.hasViewDideoCount() != other.hasViewDideoCount()) {
               return false;
            } else if (this.hasViewDideoCount() && this.getViewDideoCount() != other.getViewDideoCount()) {
               return false;
            } else if (this.hasFailRewardTimes() != other.hasFailRewardTimes()) {
               return false;
            } else if (this.hasFailRewardTimes() && this.getFailRewardTimes() != other.getFailRewardTimes()) {
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
            if (this.hasPackage()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPackage();
            }

            if (this.hasRewardTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRewardTime();
            }

            if (this.hasViewDideoCount()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getViewDideoCount();
            }

            if (this.hasFailRewardTimes()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getFailRewardTimes();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WatchFailReward_28412 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WatchFailReward_28412)PARSER.parseFrom(data);
      }

      public static S2C_WatchFailReward_28412 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WatchFailReward_28412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WatchFailReward_28412 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WatchFailReward_28412)PARSER.parseFrom(data);
      }

      public static S2C_WatchFailReward_28412 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WatchFailReward_28412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WatchFailReward_28412 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WatchFailReward_28412)PARSER.parseFrom(data);
      }

      public static S2C_WatchFailReward_28412 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WatchFailReward_28412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WatchFailReward_28412 parseFrom(InputStream input) throws IOException {
         return (S2C_WatchFailReward_28412)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WatchFailReward_28412 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WatchFailReward_28412)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WatchFailReward_28412 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WatchFailReward_28412)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WatchFailReward_28412 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WatchFailReward_28412)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WatchFailReward_28412 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WatchFailReward_28412)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WatchFailReward_28412 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WatchFailReward_28412)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WatchFailReward_28412 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WatchFailReward_28412 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WatchFailReward_28412> parser() {
         return PARSER;
      }

      public Parser<S2C_WatchFailReward_28412> getParserForType() {
         return PARSER;
      }

      public S2C_WatchFailReward_28412 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WatchFailReward_28412OrBuilder {
         private int bitField0_;
         private int package_;
         private int rewardTime_;
         private int viewDideoCount_;
         private int failRewardTimes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_WatchFailReward_28412_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_WatchFailReward_28412_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WatchFailReward_28412.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (VideoMsg.S2C_WatchFailReward_28412.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.package_ = 0;
            this.bitField0_ &= -2;
            this.rewardTime_ = 0;
            this.bitField0_ &= -3;
            this.viewDideoCount_ = 0;
            this.bitField0_ &= -5;
            this.failRewardTimes_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return VideoMsg.internal_static_video_com_gzbz_protobuf_S2C_WatchFailReward_28412_descriptor;
         }

         public S2C_WatchFailReward_28412 getDefaultInstanceForType() {
            return VideoMsg.S2C_WatchFailReward_28412.getDefaultInstance();
         }

         public S2C_WatchFailReward_28412 build() {
            S2C_WatchFailReward_28412 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WatchFailReward_28412 buildPartial() {
            S2C_WatchFailReward_28412 result = new S2C_WatchFailReward_28412(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.package_ = this.package_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.rewardTime_ = this.rewardTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.viewDideoCount_ = this.viewDideoCount_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.failRewardTimes_ = this.failRewardTimes_;
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
            if (other instanceof S2C_WatchFailReward_28412) {
               return this.mergeFrom((S2C_WatchFailReward_28412)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WatchFailReward_28412 other) {
            if (other == VideoMsg.S2C_WatchFailReward_28412.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPackage()) {
                  this.setPackage(other.getPackage());
               }

               if (other.hasRewardTime()) {
                  this.setRewardTime(other.getRewardTime());
               }

               if (other.hasViewDideoCount()) {
                  this.setViewDideoCount(other.getViewDideoCount());
               }

               if (other.hasFailRewardTimes()) {
                  this.setFailRewardTimes(other.getFailRewardTimes());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPackage()) {
               return false;
            } else if (!this.hasRewardTime()) {
               return false;
            } else if (!this.hasViewDideoCount()) {
               return false;
            } else {
               return this.hasFailRewardTimes();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WatchFailReward_28412 parsedMessage = null;

            try {
               parsedMessage = (S2C_WatchFailReward_28412)VideoMsg.S2C_WatchFailReward_28412.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WatchFailReward_28412)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPackage() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPackage() {
            return this.package_;
         }

         public Builder setPackage(int value) {
            this.bitField0_ |= 1;
            this.package_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPackage() {
            this.bitField0_ &= -2;
            this.package_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRewardTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRewardTime() {
            return this.rewardTime_;
         }

         public Builder setRewardTime(int value) {
            this.bitField0_ |= 2;
            this.rewardTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardTime() {
            this.bitField0_ &= -3;
            this.rewardTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasViewDideoCount() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getViewDideoCount() {
            return this.viewDideoCount_;
         }

         public Builder setViewDideoCount(int value) {
            this.bitField0_ |= 4;
            this.viewDideoCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearViewDideoCount() {
            this.bitField0_ &= -5;
            this.viewDideoCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFailRewardTimes() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getFailRewardTimes() {
            return this.failRewardTimes_;
         }

         public Builder setFailRewardTimes(int value) {
            this.bitField0_ |= 8;
            this.failRewardTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFailRewardTimes() {
            this.bitField0_ &= -9;
            this.failRewardTimes_ = 0;
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

   public interface C2S_DailyRechargeReward_28409OrBuilder extends MessageOrBuilder {
      boolean hasRechargeNum();

      int getRechargeNum();
   }

   public interface C2S_SkipVideoReward_28407OrBuilder extends MessageOrBuilder {
      boolean hasPackage();

      int getPackage();
   }

   public interface C2S_VideoInfo_28401OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_VideoTimeReward_28405OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_WatchAndReward_28403OrBuilder extends MessageOrBuilder {
      boolean hasPackage();

      int getPackage();
   }

   public interface C2S_WatchFailReward_28411OrBuilder extends MessageOrBuilder {
      boolean hasPackage();

      int getPackage();
   }

   public interface S2C_DailyRechargeReward_28410OrBuilder extends MessageOrBuilder {
      boolean hasRechargeNum();

      int getRechargeNum();
   }

   public interface S2C_SkipVideoReward_28408OrBuilder extends MessageOrBuilder {
      boolean hasPackage();

      int getPackage();

      boolean hasRewardTime();

      int getRewardTime();

      boolean hasViewDideoCount();

      int getViewDideoCount();
   }

   public interface S2C_VideoInfo_28402OrBuilder extends MessageOrBuilder {
      boolean hasOpenServerDay();

      int getOpenServerDay();

      List<CommonMsg.MapDataII> getVideoRewardsList();

      CommonMsg.MapDataII getVideoRewards(int index);

      int getVideoRewardsCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getVideoRewardsOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getVideoRewardsOrBuilder(int index);

      boolean hasMaxRoundRewardId();

      int getMaxRoundRewardId();

      boolean hasViewDideoCount();

      int getViewDideoCount();

      List<Integer> getRechargeNumList();

      int getRechargeNumCount();

      int getRechargeNum(int index);

      boolean hasFailRewardTimes();

      int getFailRewardTimes();
   }

   public interface S2C_WatchAndReward_28404OrBuilder extends MessageOrBuilder {
      boolean hasPackage();

      int getPackage();

      boolean hasRewardTime();

      int getRewardTime();

      boolean hasViewDideoCount();

      int getViewDideoCount();
   }

   public interface S2C_WatchAndReward_28406OrBuilder extends MessageOrBuilder {
      boolean hasMaxRoundRewardId();

      int getMaxRoundRewardId();
   }

   public interface S2C_WatchFailReward_28412OrBuilder extends MessageOrBuilder {
      boolean hasPackage();

      int getPackage();

      boolean hasRewardTime();

      int getRewardTime();

      boolean hasViewDideoCount();

      int getViewDideoCount();

      boolean hasFailRewardTimes();

      int getFailRewardTimes();
   }
}
