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

public final class FaQiuMsg {
   private static final Descriptors.Descriptor internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuMain_23601_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuMain_23601_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuMain_23602_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuMain_23602_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuCommitTask_23603_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuCommitTask_23603_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuCommitTask_23604_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuCommitTask_23604_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuDraw_23605_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuDraw_23605_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuDraw_23606_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuDraw_23606_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuGetCollectReward_23607_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuGetCollectReward_23607_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuGetCollectReward_23608_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuGetCollectReward_23608_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuGetUltimateReward_23609_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuGetUltimateReward_23609_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuGetUltimateReward_23610_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuGetUltimateReward_23610_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private FaQiuMsg() {
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
      String[] descriptorData = new String[]{"\n\u000bFaQiu.proto\u0012\u0017faQiu.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u000eActivity.proto\"\u0015\n\u0013C2S_FaQiuMain_23601\"\u008b\u0001\n\u0013S2C_FaQiuMain_23602\u0012\u0010\n\bopenChip\u0018\u0001 \u0003(\u0005\u0012\u0015\n\rcollectReward\u0018\u0002 \u0003(\u0005\u0012\u0013\n\u000bfinalReward\u0018\u0003 \u0002(\b\u00126\n\btaskList\u0018\u0004 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"+\n\u0019C2S_FaQiuCommitTask_23603\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"S\n\u0019S2C_FaQiuCommitTask_23604\u00126\n\btaskList\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"!\n\u0013C2S_FaQiuDraw_23605\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"'\n\u0013S2C_FaQiuDraw_23606\u0012\u0010\n\bopenChip\u0018\u0001 \u0003(\u0005\"3\n\u001fC2S_FaQiuGetCollectReward_23607\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\"8\n\u001fS2C_FaQiuGetCollectReward_23608\u0012\u0015\n\rcollectReward\u0018\u0002 \u0003(\u0005\"4\n C2S_FaQiuGetUltimateReward_23609\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\"7\n S2C_FaQiuGetUltimateReward_23610\u0012\u0013\n\u000bfinalReward\u0018\u0003 \u0002(\bB\u001f\n\u0011com.gzbz.protobufB\bFaQiuMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), ActivityMsg.getDescriptor()});
      internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuMain_23601_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuMain_23601_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuMain_23601_descriptor, new String[0]);
      internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuMain_23602_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuMain_23602_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuMain_23602_descriptor, new String[]{"OpenChip", "CollectReward", "FinalReward", "TaskList"});
      internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuCommitTask_23603_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuCommitTask_23603_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuCommitTask_23603_descriptor, new String[]{"TaskId"});
      internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuCommitTask_23604_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuCommitTask_23604_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuCommitTask_23604_descriptor, new String[]{"TaskList"});
      internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuDraw_23605_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuDraw_23605_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuDraw_23605_descriptor, new String[]{"Id"});
      internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuDraw_23606_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuDraw_23606_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuDraw_23606_descriptor, new String[]{"OpenChip"});
      internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuGetCollectReward_23607_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuGetCollectReward_23607_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuGetCollectReward_23607_descriptor, new String[]{"RewardId"});
      internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuGetCollectReward_23608_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuGetCollectReward_23608_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuGetCollectReward_23608_descriptor, new String[]{"CollectReward"});
      internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuGetUltimateReward_23609_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuGetUltimateReward_23609_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuGetUltimateReward_23609_descriptor, new String[]{"RewardId"});
      internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuGetUltimateReward_23610_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuGetUltimateReward_23610_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuGetUltimateReward_23610_descriptor, new String[]{"FinalReward"});
      CommonMsg.getDescriptor();
      ActivityMsg.getDescriptor();
   }

   public static final class C2S_FaQiuMain_23601 extends GeneratedMessageV3 implements C2S_FaQiuMain_23601OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_FaQiuMain_23601 DEFAULT_INSTANCE = new C2S_FaQiuMain_23601();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FaQiuMain_23601> PARSER = new AbstractParser<C2S_FaQiuMain_23601>() {
         public C2S_FaQiuMain_23601 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FaQiuMain_23601(input, extensionRegistry);
         }
      };

      private C2S_FaQiuMain_23601(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FaQiuMain_23601() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FaQiuMain_23601();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FaQiuMain_23601(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuMain_23601_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuMain_23601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FaQiuMain_23601.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FaQiuMain_23601)) {
            return super.equals(obj);
         } else {
            C2S_FaQiuMain_23601 other = (C2S_FaQiuMain_23601)obj;
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

      public static C2S_FaQiuMain_23601 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FaQiuMain_23601)PARSER.parseFrom(data);
      }

      public static C2S_FaQiuMain_23601 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FaQiuMain_23601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FaQiuMain_23601 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FaQiuMain_23601)PARSER.parseFrom(data);
      }

      public static C2S_FaQiuMain_23601 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FaQiuMain_23601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FaQiuMain_23601 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FaQiuMain_23601)PARSER.parseFrom(data);
      }

      public static C2S_FaQiuMain_23601 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FaQiuMain_23601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FaQiuMain_23601 parseFrom(InputStream input) throws IOException {
         return (C2S_FaQiuMain_23601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FaQiuMain_23601 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FaQiuMain_23601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FaQiuMain_23601 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FaQiuMain_23601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FaQiuMain_23601 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FaQiuMain_23601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FaQiuMain_23601 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FaQiuMain_23601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FaQiuMain_23601 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FaQiuMain_23601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FaQiuMain_23601 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FaQiuMain_23601 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FaQiuMain_23601> parser() {
         return PARSER;
      }

      public Parser<C2S_FaQiuMain_23601> getParserForType() {
         return PARSER;
      }

      public C2S_FaQiuMain_23601 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FaQiuMain_23601OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuMain_23601_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuMain_23601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FaQiuMain_23601.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FaQiuMsg.C2S_FaQiuMain_23601.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuMain_23601_descriptor;
         }

         public C2S_FaQiuMain_23601 getDefaultInstanceForType() {
            return FaQiuMsg.C2S_FaQiuMain_23601.getDefaultInstance();
         }

         public C2S_FaQiuMain_23601 build() {
            C2S_FaQiuMain_23601 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FaQiuMain_23601 buildPartial() {
            C2S_FaQiuMain_23601 result = new C2S_FaQiuMain_23601(this);
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
            if (other instanceof C2S_FaQiuMain_23601) {
               return this.mergeFrom((C2S_FaQiuMain_23601)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FaQiuMain_23601 other) {
            if (other == FaQiuMsg.C2S_FaQiuMain_23601.getDefaultInstance()) {
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
            C2S_FaQiuMain_23601 parsedMessage = null;

            try {
               parsedMessage = (C2S_FaQiuMain_23601)FaQiuMsg.C2S_FaQiuMain_23601.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FaQiuMain_23601)e.getUnfinishedMessage();
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

   public static final class S2C_FaQiuMain_23602 extends GeneratedMessageV3 implements S2C_FaQiuMain_23602OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OPENCHIP_FIELD_NUMBER = 1;
      private Internal.IntList openChip_;
      public static final int COLLECTREWARD_FIELD_NUMBER = 2;
      private Internal.IntList collectReward_;
      public static final int FINALREWARD_FIELD_NUMBER = 3;
      private boolean finalReward_;
      public static final int TASKLIST_FIELD_NUMBER = 4;
      private List<ActivityMsg.TaskData> taskList_;
      private byte memoizedIsInitialized;
      private static final S2C_FaQiuMain_23602 DEFAULT_INSTANCE = new S2C_FaQiuMain_23602();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FaQiuMain_23602> PARSER = new AbstractParser<S2C_FaQiuMain_23602>() {
         public S2C_FaQiuMain_23602 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FaQiuMain_23602(input, extensionRegistry);
         }
      };

      private S2C_FaQiuMain_23602(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FaQiuMain_23602() {
         this.memoizedIsInitialized = -1;
         this.openChip_ = emptyIntList();
         this.collectReward_ = emptyIntList();
         this.taskList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FaQiuMain_23602();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FaQiuMain_23602(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.openChip_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.openChip_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.openChip_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.collectReward_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.collectReward_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.collectReward_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.collectReward_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 24:
                        this.bitField0_ |= 1;
                        this.finalReward_ = input.readBool();
                        continue;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.taskList_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.taskList_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.openChip_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.openChip_.makeImmutable();
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.collectReward_.makeImmutable();
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuMain_23602_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuMain_23602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FaQiuMain_23602.class, Builder.class);
      }

      public List<Integer> getOpenChipList() {
         return this.openChip_;
      }

      public int getOpenChipCount() {
         return this.openChip_.size();
      }

      public int getOpenChip(int index) {
         return this.openChip_.getInt(index);
      }

      public List<Integer> getCollectRewardList() {
         return this.collectReward_;
      }

      public int getCollectRewardCount() {
         return this.collectReward_.size();
      }

      public int getCollectReward(int index) {
         return this.collectReward_.getInt(index);
      }

      public boolean hasFinalReward() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getFinalReward() {
         return this.finalReward_;
      }

      public List<ActivityMsg.TaskData> getTaskListList() {
         return this.taskList_;
      }

      public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList() {
         return this.taskList_;
      }

      public int getTaskListCount() {
         return this.taskList_.size();
      }

      public ActivityMsg.TaskData getTaskList(int index) {
         return (ActivityMsg.TaskData)this.taskList_.get(index);
      }

      public ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index) {
         return (ActivityMsg.TaskDataOrBuilder)this.taskList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFinalReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getTaskListCount(); ++i) {
               if (!this.getTaskList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.openChip_.size(); ++i) {
            output.writeInt32(1, this.openChip_.getInt(i));
         }

         for(int i = 0; i < this.collectReward_.size(); ++i) {
            output.writeInt32(2, this.collectReward_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(3, this.finalReward_);
         }

         for(int i = 0; i < this.taskList_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.taskList_.get(i));
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

            for(int i = 0; i < this.openChip_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.openChip_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getOpenChipList().size();
            dataSize = 0;

            for(int i = 0; i < this.collectReward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.collectReward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCollectRewardList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.finalReward_);
            }

            for(int i = 0; i < this.taskList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.taskList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FaQiuMain_23602)) {
            return super.equals(obj);
         } else {
            S2C_FaQiuMain_23602 other = (S2C_FaQiuMain_23602)obj;
            if (!this.getOpenChipList().equals(other.getOpenChipList())) {
               return false;
            } else if (!this.getCollectRewardList().equals(other.getCollectRewardList())) {
               return false;
            } else if (this.hasFinalReward() != other.hasFinalReward()) {
               return false;
            } else if (this.hasFinalReward() && this.getFinalReward() != other.getFinalReward()) {
               return false;
            } else if (!this.getTaskListList().equals(other.getTaskListList())) {
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
            if (this.getOpenChipCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOpenChipList().hashCode();
            }

            if (this.getCollectRewardCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCollectRewardList().hashCode();
            }

            if (this.hasFinalReward()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getFinalReward());
            }

            if (this.getTaskListCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTaskListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FaQiuMain_23602 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FaQiuMain_23602)PARSER.parseFrom(data);
      }

      public static S2C_FaQiuMain_23602 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FaQiuMain_23602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FaQiuMain_23602 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FaQiuMain_23602)PARSER.parseFrom(data);
      }

      public static S2C_FaQiuMain_23602 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FaQiuMain_23602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FaQiuMain_23602 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FaQiuMain_23602)PARSER.parseFrom(data);
      }

      public static S2C_FaQiuMain_23602 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FaQiuMain_23602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FaQiuMain_23602 parseFrom(InputStream input) throws IOException {
         return (S2C_FaQiuMain_23602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FaQiuMain_23602 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FaQiuMain_23602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FaQiuMain_23602 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FaQiuMain_23602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FaQiuMain_23602 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FaQiuMain_23602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FaQiuMain_23602 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FaQiuMain_23602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FaQiuMain_23602 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FaQiuMain_23602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FaQiuMain_23602 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FaQiuMain_23602 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FaQiuMain_23602> parser() {
         return PARSER;
      }

      public Parser<S2C_FaQiuMain_23602> getParserForType() {
         return PARSER;
      }

      public S2C_FaQiuMain_23602 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FaQiuMain_23602OrBuilder {
         private int bitField0_;
         private Internal.IntList openChip_;
         private Internal.IntList collectReward_;
         private boolean finalReward_;
         private List<ActivityMsg.TaskData> taskList_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuMain_23602_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuMain_23602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FaQiuMain_23602.class, Builder.class);
         }

         private Builder() {
            this.openChip_ = FaQiuMsg.S2C_FaQiuMain_23602.emptyIntList();
            this.collectReward_ = FaQiuMsg.S2C_FaQiuMain_23602.emptyIntList();
            this.taskList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.openChip_ = FaQiuMsg.S2C_FaQiuMain_23602.emptyIntList();
            this.collectReward_ = FaQiuMsg.S2C_FaQiuMain_23602.emptyIntList();
            this.taskList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FaQiuMsg.S2C_FaQiuMain_23602.alwaysUseFieldBuilders) {
               this.getTaskListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.openChip_ = FaQiuMsg.S2C_FaQiuMain_23602.emptyIntList();
            this.bitField0_ &= -2;
            this.collectReward_ = FaQiuMsg.S2C_FaQiuMain_23602.emptyIntList();
            this.bitField0_ &= -3;
            this.finalReward_ = false;
            this.bitField0_ &= -5;
            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.taskListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuMain_23602_descriptor;
         }

         public S2C_FaQiuMain_23602 getDefaultInstanceForType() {
            return FaQiuMsg.S2C_FaQiuMain_23602.getDefaultInstance();
         }

         public S2C_FaQiuMain_23602 build() {
            S2C_FaQiuMain_23602 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FaQiuMain_23602 buildPartial() {
            S2C_FaQiuMain_23602 result = new S2C_FaQiuMain_23602(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.openChip_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.openChip_ = this.openChip_;
            if ((this.bitField0_ & 2) != 0) {
               this.collectReward_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.collectReward_ = this.collectReward_;
            if ((from_bitField0_ & 4) != 0) {
               result.finalReward_ = this.finalReward_;
               to_bitField0_ |= 1;
            }

            if (this.taskListBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
                  this.bitField0_ &= -9;
               }

               result.taskList_ = this.taskList_;
            } else {
               result.taskList_ = this.taskListBuilder_.build();
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
            if (other instanceof S2C_FaQiuMain_23602) {
               return this.mergeFrom((S2C_FaQiuMain_23602)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FaQiuMain_23602 other) {
            if (other == FaQiuMsg.S2C_FaQiuMain_23602.getDefaultInstance()) {
               return this;
            } else {
               if (!other.openChip_.isEmpty()) {
                  if (this.openChip_.isEmpty()) {
                     this.openChip_ = other.openChip_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureOpenChipIsMutable();
                     this.openChip_.addAll(other.openChip_);
                  }

                  this.onChanged();
               }

               if (!other.collectReward_.isEmpty()) {
                  if (this.collectReward_.isEmpty()) {
                     this.collectReward_ = other.collectReward_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureCollectRewardIsMutable();
                     this.collectReward_.addAll(other.collectReward_);
                  }

                  this.onChanged();
               }

               if (other.hasFinalReward()) {
                  this.setFinalReward(other.getFinalReward());
               }

               if (this.taskListBuilder_ == null) {
                  if (!other.taskList_.isEmpty()) {
                     if (this.taskList_.isEmpty()) {
                        this.taskList_ = other.taskList_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureTaskListIsMutable();
                        this.taskList_.addAll(other.taskList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.taskList_.isEmpty()) {
                  if (this.taskListBuilder_.isEmpty()) {
                     this.taskListBuilder_.dispose();
                     this.taskListBuilder_ = null;
                     this.taskList_ = other.taskList_;
                     this.bitField0_ &= -9;
                     this.taskListBuilder_ = FaQiuMsg.S2C_FaQiuMain_23602.alwaysUseFieldBuilders ? this.getTaskListFieldBuilder() : null;
                  } else {
                     this.taskListBuilder_.addAllMessages(other.taskList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFinalReward()) {
               return false;
            } else {
               for(int i = 0; i < this.getTaskListCount(); ++i) {
                  if (!this.getTaskList(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FaQiuMain_23602 parsedMessage = null;

            try {
               parsedMessage = (S2C_FaQiuMain_23602)FaQiuMsg.S2C_FaQiuMain_23602.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FaQiuMain_23602)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureOpenChipIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.openChip_ = FaQiuMsg.S2C_FaQiuMain_23602.mutableCopy(this.openChip_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getOpenChipList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.openChip_) : this.openChip_);
         }

         public int getOpenChipCount() {
            return this.openChip_.size();
         }

         public int getOpenChip(int index) {
            return this.openChip_.getInt(index);
         }

         public Builder setOpenChip(int index, int value) {
            this.ensureOpenChipIsMutable();
            this.openChip_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addOpenChip(int value) {
            this.ensureOpenChipIsMutable();
            this.openChip_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllOpenChip(Iterable<? extends Integer> values) {
            this.ensureOpenChipIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.openChip_);
            this.onChanged();
            return this;
         }

         public Builder clearOpenChip() {
            this.openChip_ = FaQiuMsg.S2C_FaQiuMain_23602.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         private void ensureCollectRewardIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.collectReward_ = FaQiuMsg.S2C_FaQiuMain_23602.mutableCopy(this.collectReward_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getCollectRewardList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.collectReward_) : this.collectReward_);
         }

         public int getCollectRewardCount() {
            return this.collectReward_.size();
         }

         public int getCollectReward(int index) {
            return this.collectReward_.getInt(index);
         }

         public Builder setCollectReward(int index, int value) {
            this.ensureCollectRewardIsMutable();
            this.collectReward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCollectReward(int value) {
            this.ensureCollectRewardIsMutable();
            this.collectReward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCollectReward(Iterable<? extends Integer> values) {
            this.ensureCollectRewardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.collectReward_);
            this.onChanged();
            return this;
         }

         public Builder clearCollectReward() {
            this.collectReward_ = FaQiuMsg.S2C_FaQiuMain_23602.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasFinalReward() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getFinalReward() {
            return this.finalReward_;
         }

         public Builder setFinalReward(boolean value) {
            this.bitField0_ |= 4;
            this.finalReward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFinalReward() {
            this.bitField0_ &= -5;
            this.finalReward_ = false;
            this.onChanged();
            return this;
         }

         private void ensureTaskListIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.taskList_ = new ArrayList(this.taskList_);
               this.bitField0_ |= 8;
            }

         }

         public List<ActivityMsg.TaskData> getTaskListList() {
            return this.taskListBuilder_ == null ? Collections.unmodifiableList(this.taskList_) : this.taskListBuilder_.getMessageList();
         }

         public int getTaskListCount() {
            return this.taskListBuilder_ == null ? this.taskList_.size() : this.taskListBuilder_.getCount();
         }

         public ActivityMsg.TaskData getTaskList(int index) {
            return this.taskListBuilder_ == null ? (ActivityMsg.TaskData)this.taskList_.get(index) : (ActivityMsg.TaskData)this.taskListBuilder_.getMessage(index);
         }

         public Builder setTaskList(int index, ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.set(index, value);
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTaskList(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.add(value);
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTaskList(int index, ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.add(index, value);
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTaskList(ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTaskList(Iterable<? extends ActivityMsg.TaskData> values) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.taskList_);
               this.onChanged();
            } else {
               this.taskListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTaskList() {
            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.taskListBuilder_.clear();
            }

            return this;
         }

         public Builder removeTaskList(int index) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.remove(index);
               this.onChanged();
            } else {
               this.taskListBuilder_.remove(index);
            }

            return this;
         }

         public ActivityMsg.TaskData.Builder getTaskListBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index) {
            return this.taskListBuilder_ == null ? (ActivityMsg.TaskDataOrBuilder)this.taskList_.get(index) : (ActivityMsg.TaskDataOrBuilder)this.taskListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList() {
            return this.taskListBuilder_ != null ? this.taskListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.taskList_);
         }

         public ActivityMsg.TaskData.Builder addTaskListBuilder() {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().addBuilder(ActivityMsg.TaskData.getDefaultInstance());
         }

         public ActivityMsg.TaskData.Builder addTaskListBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().addBuilder(index, ActivityMsg.TaskData.getDefaultInstance());
         }

         public List<ActivityMsg.TaskData.Builder> getTaskListBuilderList() {
            return this.getTaskListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> getTaskListFieldBuilder() {
            if (this.taskListBuilder_ == null) {
               this.taskListBuilder_ = new RepeatedFieldBuilderV3(this.taskList_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.taskList_ = null;
            }

            return this.taskListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_FaQiuCommitTask_23603 extends GeneratedMessageV3 implements C2S_FaQiuCommitTask_23603OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_FaQiuCommitTask_23603 DEFAULT_INSTANCE = new C2S_FaQiuCommitTask_23603();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FaQiuCommitTask_23603> PARSER = new AbstractParser<C2S_FaQiuCommitTask_23603>() {
         public C2S_FaQiuCommitTask_23603 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FaQiuCommitTask_23603(input, extensionRegistry);
         }
      };

      private C2S_FaQiuCommitTask_23603(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FaQiuCommitTask_23603() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FaQiuCommitTask_23603();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FaQiuCommitTask_23603(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.taskId_ = input.readInt32();
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
         return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuCommitTask_23603_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuCommitTask_23603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FaQiuCommitTask_23603.class, Builder.class);
      }

      public boolean hasTaskId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTaskId() {
         return this.taskId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTaskId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.taskId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.taskId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FaQiuCommitTask_23603)) {
            return super.equals(obj);
         } else {
            C2S_FaQiuCommitTask_23603 other = (C2S_FaQiuCommitTask_23603)obj;
            if (this.hasTaskId() != other.hasTaskId()) {
               return false;
            } else if (this.hasTaskId() && this.getTaskId() != other.getTaskId()) {
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
            if (this.hasTaskId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FaQiuCommitTask_23603 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FaQiuCommitTask_23603)PARSER.parseFrom(data);
      }

      public static C2S_FaQiuCommitTask_23603 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FaQiuCommitTask_23603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FaQiuCommitTask_23603 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FaQiuCommitTask_23603)PARSER.parseFrom(data);
      }

      public static C2S_FaQiuCommitTask_23603 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FaQiuCommitTask_23603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FaQiuCommitTask_23603 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FaQiuCommitTask_23603)PARSER.parseFrom(data);
      }

      public static C2S_FaQiuCommitTask_23603 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FaQiuCommitTask_23603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FaQiuCommitTask_23603 parseFrom(InputStream input) throws IOException {
         return (C2S_FaQiuCommitTask_23603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FaQiuCommitTask_23603 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FaQiuCommitTask_23603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FaQiuCommitTask_23603 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FaQiuCommitTask_23603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FaQiuCommitTask_23603 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FaQiuCommitTask_23603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FaQiuCommitTask_23603 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FaQiuCommitTask_23603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FaQiuCommitTask_23603 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FaQiuCommitTask_23603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FaQiuCommitTask_23603 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FaQiuCommitTask_23603 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FaQiuCommitTask_23603> parser() {
         return PARSER;
      }

      public Parser<C2S_FaQiuCommitTask_23603> getParserForType() {
         return PARSER;
      }

      public C2S_FaQiuCommitTask_23603 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FaQiuCommitTask_23603OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuCommitTask_23603_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuCommitTask_23603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FaQiuCommitTask_23603.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FaQiuMsg.C2S_FaQiuCommitTask_23603.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuCommitTask_23603_descriptor;
         }

         public C2S_FaQiuCommitTask_23603 getDefaultInstanceForType() {
            return FaQiuMsg.C2S_FaQiuCommitTask_23603.getDefaultInstance();
         }

         public C2S_FaQiuCommitTask_23603 build() {
            C2S_FaQiuCommitTask_23603 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FaQiuCommitTask_23603 buildPartial() {
            C2S_FaQiuCommitTask_23603 result = new C2S_FaQiuCommitTask_23603(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.taskId_ = this.taskId_;
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
            if (other instanceof C2S_FaQiuCommitTask_23603) {
               return this.mergeFrom((C2S_FaQiuCommitTask_23603)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FaQiuCommitTask_23603 other) {
            if (other == FaQiuMsg.C2S_FaQiuCommitTask_23603.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTaskId()) {
                  this.setTaskId(other.getTaskId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTaskId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_FaQiuCommitTask_23603 parsedMessage = null;

            try {
               parsedMessage = (C2S_FaQiuCommitTask_23603)FaQiuMsg.C2S_FaQiuCommitTask_23603.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FaQiuCommitTask_23603)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTaskId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTaskId() {
            return this.taskId_;
         }

         public Builder setTaskId(int value) {
            this.bitField0_ |= 1;
            this.taskId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskId() {
            this.bitField0_ &= -2;
            this.taskId_ = 0;
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

   public static final class S2C_FaQiuCommitTask_23604 extends GeneratedMessageV3 implements S2C_FaQiuCommitTask_23604OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASKLIST_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> taskList_;
      private byte memoizedIsInitialized;
      private static final S2C_FaQiuCommitTask_23604 DEFAULT_INSTANCE = new S2C_FaQiuCommitTask_23604();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FaQiuCommitTask_23604> PARSER = new AbstractParser<S2C_FaQiuCommitTask_23604>() {
         public S2C_FaQiuCommitTask_23604 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FaQiuCommitTask_23604(input, extensionRegistry);
         }
      };

      private S2C_FaQiuCommitTask_23604(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FaQiuCommitTask_23604() {
         this.memoizedIsInitialized = -1;
         this.taskList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FaQiuCommitTask_23604();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FaQiuCommitTask_23604(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.taskList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.taskList_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
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
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuCommitTask_23604_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuCommitTask_23604_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FaQiuCommitTask_23604.class, Builder.class);
      }

      public List<ActivityMsg.TaskData> getTaskListList() {
         return this.taskList_;
      }

      public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList() {
         return this.taskList_;
      }

      public int getTaskListCount() {
         return this.taskList_.size();
      }

      public ActivityMsg.TaskData getTaskList(int index) {
         return (ActivityMsg.TaskData)this.taskList_.get(index);
      }

      public ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index) {
         return (ActivityMsg.TaskDataOrBuilder)this.taskList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTaskListCount(); ++i) {
               if (!this.getTaskList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.taskList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.taskList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.taskList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.taskList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FaQiuCommitTask_23604)) {
            return super.equals(obj);
         } else {
            S2C_FaQiuCommitTask_23604 other = (S2C_FaQiuCommitTask_23604)obj;
            if (!this.getTaskListList().equals(other.getTaskListList())) {
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
            if (this.getTaskListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FaQiuCommitTask_23604 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FaQiuCommitTask_23604)PARSER.parseFrom(data);
      }

      public static S2C_FaQiuCommitTask_23604 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FaQiuCommitTask_23604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FaQiuCommitTask_23604 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FaQiuCommitTask_23604)PARSER.parseFrom(data);
      }

      public static S2C_FaQiuCommitTask_23604 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FaQiuCommitTask_23604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FaQiuCommitTask_23604 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FaQiuCommitTask_23604)PARSER.parseFrom(data);
      }

      public static S2C_FaQiuCommitTask_23604 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FaQiuCommitTask_23604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FaQiuCommitTask_23604 parseFrom(InputStream input) throws IOException {
         return (S2C_FaQiuCommitTask_23604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FaQiuCommitTask_23604 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FaQiuCommitTask_23604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FaQiuCommitTask_23604 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FaQiuCommitTask_23604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FaQiuCommitTask_23604 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FaQiuCommitTask_23604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FaQiuCommitTask_23604 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FaQiuCommitTask_23604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FaQiuCommitTask_23604 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FaQiuCommitTask_23604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FaQiuCommitTask_23604 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FaQiuCommitTask_23604 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FaQiuCommitTask_23604> parser() {
         return PARSER;
      }

      public Parser<S2C_FaQiuCommitTask_23604> getParserForType() {
         return PARSER;
      }

      public S2C_FaQiuCommitTask_23604 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FaQiuCommitTask_23604OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> taskList_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuCommitTask_23604_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuCommitTask_23604_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FaQiuCommitTask_23604.class, Builder.class);
         }

         private Builder() {
            this.taskList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.taskList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FaQiuMsg.S2C_FaQiuCommitTask_23604.alwaysUseFieldBuilders) {
               this.getTaskListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.taskListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuCommitTask_23604_descriptor;
         }

         public S2C_FaQiuCommitTask_23604 getDefaultInstanceForType() {
            return FaQiuMsg.S2C_FaQiuCommitTask_23604.getDefaultInstance();
         }

         public S2C_FaQiuCommitTask_23604 build() {
            S2C_FaQiuCommitTask_23604 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FaQiuCommitTask_23604 buildPartial() {
            S2C_FaQiuCommitTask_23604 result = new S2C_FaQiuCommitTask_23604(this);
            int from_bitField0_ = this.bitField0_;
            if (this.taskListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
                  this.bitField0_ &= -2;
               }

               result.taskList_ = this.taskList_;
            } else {
               result.taskList_ = this.taskListBuilder_.build();
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
            if (other instanceof S2C_FaQiuCommitTask_23604) {
               return this.mergeFrom((S2C_FaQiuCommitTask_23604)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FaQiuCommitTask_23604 other) {
            if (other == FaQiuMsg.S2C_FaQiuCommitTask_23604.getDefaultInstance()) {
               return this;
            } else {
               if (this.taskListBuilder_ == null) {
                  if (!other.taskList_.isEmpty()) {
                     if (this.taskList_.isEmpty()) {
                        this.taskList_ = other.taskList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTaskListIsMutable();
                        this.taskList_.addAll(other.taskList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.taskList_.isEmpty()) {
                  if (this.taskListBuilder_.isEmpty()) {
                     this.taskListBuilder_.dispose();
                     this.taskListBuilder_ = null;
                     this.taskList_ = other.taskList_;
                     this.bitField0_ &= -2;
                     this.taskListBuilder_ = FaQiuMsg.S2C_FaQiuCommitTask_23604.alwaysUseFieldBuilders ? this.getTaskListFieldBuilder() : null;
                  } else {
                     this.taskListBuilder_.addAllMessages(other.taskList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTaskListCount(); ++i) {
               if (!this.getTaskList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FaQiuCommitTask_23604 parsedMessage = null;

            try {
               parsedMessage = (S2C_FaQiuCommitTask_23604)FaQiuMsg.S2C_FaQiuCommitTask_23604.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FaQiuCommitTask_23604)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTaskListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.taskList_ = new ArrayList(this.taskList_);
               this.bitField0_ |= 1;
            }

         }

         public List<ActivityMsg.TaskData> getTaskListList() {
            return this.taskListBuilder_ == null ? Collections.unmodifiableList(this.taskList_) : this.taskListBuilder_.getMessageList();
         }

         public int getTaskListCount() {
            return this.taskListBuilder_ == null ? this.taskList_.size() : this.taskListBuilder_.getCount();
         }

         public ActivityMsg.TaskData getTaskList(int index) {
            return this.taskListBuilder_ == null ? (ActivityMsg.TaskData)this.taskList_.get(index) : (ActivityMsg.TaskData)this.taskListBuilder_.getMessage(index);
         }

         public Builder setTaskList(int index, ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.set(index, value);
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTaskList(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.add(value);
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTaskList(int index, ActivityMsg.TaskData value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.add(index, value);
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTaskList(ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTaskList(Iterable<? extends ActivityMsg.TaskData> values) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.taskList_);
               this.onChanged();
            } else {
               this.taskListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTaskList() {
            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.taskListBuilder_.clear();
            }

            return this;
         }

         public Builder removeTaskList(int index) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.remove(index);
               this.onChanged();
            } else {
               this.taskListBuilder_.remove(index);
            }

            return this;
         }

         public ActivityMsg.TaskData.Builder getTaskListBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index) {
            return this.taskListBuilder_ == null ? (ActivityMsg.TaskDataOrBuilder)this.taskList_.get(index) : (ActivityMsg.TaskDataOrBuilder)this.taskListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList() {
            return this.taskListBuilder_ != null ? this.taskListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.taskList_);
         }

         public ActivityMsg.TaskData.Builder addTaskListBuilder() {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().addBuilder(ActivityMsg.TaskData.getDefaultInstance());
         }

         public ActivityMsg.TaskData.Builder addTaskListBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskListFieldBuilder().addBuilder(index, ActivityMsg.TaskData.getDefaultInstance());
         }

         public List<ActivityMsg.TaskData.Builder> getTaskListBuilderList() {
            return this.getTaskListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> getTaskListFieldBuilder() {
            if (this.taskListBuilder_ == null) {
               this.taskListBuilder_ = new RepeatedFieldBuilderV3(this.taskList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.taskList_ = null;
            }

            return this.taskListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_FaQiuDraw_23605 extends GeneratedMessageV3 implements C2S_FaQiuDraw_23605OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_FaQiuDraw_23605 DEFAULT_INSTANCE = new C2S_FaQiuDraw_23605();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FaQiuDraw_23605> PARSER = new AbstractParser<C2S_FaQiuDraw_23605>() {
         public C2S_FaQiuDraw_23605 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FaQiuDraw_23605(input, extensionRegistry);
         }
      };

      private C2S_FaQiuDraw_23605(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FaQiuDraw_23605() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FaQiuDraw_23605();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FaQiuDraw_23605(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuDraw_23605_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuDraw_23605_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FaQiuDraw_23605.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FaQiuDraw_23605)) {
            return super.equals(obj);
         } else {
            C2S_FaQiuDraw_23605 other = (C2S_FaQiuDraw_23605)obj;
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

      public static C2S_FaQiuDraw_23605 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FaQiuDraw_23605)PARSER.parseFrom(data);
      }

      public static C2S_FaQiuDraw_23605 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FaQiuDraw_23605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FaQiuDraw_23605 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FaQiuDraw_23605)PARSER.parseFrom(data);
      }

      public static C2S_FaQiuDraw_23605 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FaQiuDraw_23605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FaQiuDraw_23605 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FaQiuDraw_23605)PARSER.parseFrom(data);
      }

      public static C2S_FaQiuDraw_23605 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FaQiuDraw_23605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FaQiuDraw_23605 parseFrom(InputStream input) throws IOException {
         return (C2S_FaQiuDraw_23605)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FaQiuDraw_23605 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FaQiuDraw_23605)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FaQiuDraw_23605 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FaQiuDraw_23605)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FaQiuDraw_23605 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FaQiuDraw_23605)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FaQiuDraw_23605 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FaQiuDraw_23605)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FaQiuDraw_23605 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FaQiuDraw_23605)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FaQiuDraw_23605 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FaQiuDraw_23605 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FaQiuDraw_23605> parser() {
         return PARSER;
      }

      public Parser<C2S_FaQiuDraw_23605> getParserForType() {
         return PARSER;
      }

      public C2S_FaQiuDraw_23605 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FaQiuDraw_23605OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuDraw_23605_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuDraw_23605_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FaQiuDraw_23605.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FaQiuMsg.C2S_FaQiuDraw_23605.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuDraw_23605_descriptor;
         }

         public C2S_FaQiuDraw_23605 getDefaultInstanceForType() {
            return FaQiuMsg.C2S_FaQiuDraw_23605.getDefaultInstance();
         }

         public C2S_FaQiuDraw_23605 build() {
            C2S_FaQiuDraw_23605 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FaQiuDraw_23605 buildPartial() {
            C2S_FaQiuDraw_23605 result = new C2S_FaQiuDraw_23605(this);
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
            if (other instanceof C2S_FaQiuDraw_23605) {
               return this.mergeFrom((C2S_FaQiuDraw_23605)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FaQiuDraw_23605 other) {
            if (other == FaQiuMsg.C2S_FaQiuDraw_23605.getDefaultInstance()) {
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
            C2S_FaQiuDraw_23605 parsedMessage = null;

            try {
               parsedMessage = (C2S_FaQiuDraw_23605)FaQiuMsg.C2S_FaQiuDraw_23605.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FaQiuDraw_23605)e.getUnfinishedMessage();
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

   public static final class S2C_FaQiuDraw_23606 extends GeneratedMessageV3 implements S2C_FaQiuDraw_23606OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int OPENCHIP_FIELD_NUMBER = 1;
      private Internal.IntList openChip_;
      private byte memoizedIsInitialized;
      private static final S2C_FaQiuDraw_23606 DEFAULT_INSTANCE = new S2C_FaQiuDraw_23606();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FaQiuDraw_23606> PARSER = new AbstractParser<S2C_FaQiuDraw_23606>() {
         public S2C_FaQiuDraw_23606 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FaQiuDraw_23606(input, extensionRegistry);
         }
      };

      private S2C_FaQiuDraw_23606(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FaQiuDraw_23606() {
         this.memoizedIsInitialized = -1;
         this.openChip_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FaQiuDraw_23606();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FaQiuDraw_23606(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.openChip_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.openChip_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.openChip_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.openChip_.addInt(input.readInt32());
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
               if ((mutable_bitField0_ & 1) != 0) {
                  this.openChip_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuDraw_23606_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuDraw_23606_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FaQiuDraw_23606.class, Builder.class);
      }

      public List<Integer> getOpenChipList() {
         return this.openChip_;
      }

      public int getOpenChipCount() {
         return this.openChip_.size();
      }

      public int getOpenChip(int index) {
         return this.openChip_.getInt(index);
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
         for(int i = 0; i < this.openChip_.size(); ++i) {
            output.writeInt32(1, this.openChip_.getInt(i));
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

            for(int i = 0; i < this.openChip_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.openChip_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getOpenChipList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FaQiuDraw_23606)) {
            return super.equals(obj);
         } else {
            S2C_FaQiuDraw_23606 other = (S2C_FaQiuDraw_23606)obj;
            if (!this.getOpenChipList().equals(other.getOpenChipList())) {
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
            if (this.getOpenChipCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOpenChipList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FaQiuDraw_23606 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FaQiuDraw_23606)PARSER.parseFrom(data);
      }

      public static S2C_FaQiuDraw_23606 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FaQiuDraw_23606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FaQiuDraw_23606 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FaQiuDraw_23606)PARSER.parseFrom(data);
      }

      public static S2C_FaQiuDraw_23606 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FaQiuDraw_23606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FaQiuDraw_23606 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FaQiuDraw_23606)PARSER.parseFrom(data);
      }

      public static S2C_FaQiuDraw_23606 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FaQiuDraw_23606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FaQiuDraw_23606 parseFrom(InputStream input) throws IOException {
         return (S2C_FaQiuDraw_23606)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FaQiuDraw_23606 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FaQiuDraw_23606)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FaQiuDraw_23606 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FaQiuDraw_23606)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FaQiuDraw_23606 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FaQiuDraw_23606)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FaQiuDraw_23606 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FaQiuDraw_23606)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FaQiuDraw_23606 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FaQiuDraw_23606)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FaQiuDraw_23606 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FaQiuDraw_23606 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FaQiuDraw_23606> parser() {
         return PARSER;
      }

      public Parser<S2C_FaQiuDraw_23606> getParserForType() {
         return PARSER;
      }

      public S2C_FaQiuDraw_23606 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FaQiuDraw_23606OrBuilder {
         private int bitField0_;
         private Internal.IntList openChip_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuDraw_23606_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuDraw_23606_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FaQiuDraw_23606.class, Builder.class);
         }

         private Builder() {
            this.openChip_ = FaQiuMsg.S2C_FaQiuDraw_23606.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.openChip_ = FaQiuMsg.S2C_FaQiuDraw_23606.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FaQiuMsg.S2C_FaQiuDraw_23606.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.openChip_ = FaQiuMsg.S2C_FaQiuDraw_23606.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuDraw_23606_descriptor;
         }

         public S2C_FaQiuDraw_23606 getDefaultInstanceForType() {
            return FaQiuMsg.S2C_FaQiuDraw_23606.getDefaultInstance();
         }

         public S2C_FaQiuDraw_23606 build() {
            S2C_FaQiuDraw_23606 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FaQiuDraw_23606 buildPartial() {
            S2C_FaQiuDraw_23606 result = new S2C_FaQiuDraw_23606(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.openChip_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.openChip_ = this.openChip_;
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
            if (other instanceof S2C_FaQiuDraw_23606) {
               return this.mergeFrom((S2C_FaQiuDraw_23606)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FaQiuDraw_23606 other) {
            if (other == FaQiuMsg.S2C_FaQiuDraw_23606.getDefaultInstance()) {
               return this;
            } else {
               if (!other.openChip_.isEmpty()) {
                  if (this.openChip_.isEmpty()) {
                     this.openChip_ = other.openChip_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureOpenChipIsMutable();
                     this.openChip_.addAll(other.openChip_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FaQiuDraw_23606 parsedMessage = null;

            try {
               parsedMessage = (S2C_FaQiuDraw_23606)FaQiuMsg.S2C_FaQiuDraw_23606.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FaQiuDraw_23606)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureOpenChipIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.openChip_ = FaQiuMsg.S2C_FaQiuDraw_23606.mutableCopy(this.openChip_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getOpenChipList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.openChip_) : this.openChip_);
         }

         public int getOpenChipCount() {
            return this.openChip_.size();
         }

         public int getOpenChip(int index) {
            return this.openChip_.getInt(index);
         }

         public Builder setOpenChip(int index, int value) {
            this.ensureOpenChipIsMutable();
            this.openChip_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addOpenChip(int value) {
            this.ensureOpenChipIsMutable();
            this.openChip_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllOpenChip(Iterable<? extends Integer> values) {
            this.ensureOpenChipIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.openChip_);
            this.onChanged();
            return this;
         }

         public Builder clearOpenChip() {
            this.openChip_ = FaQiuMsg.S2C_FaQiuDraw_23606.emptyIntList();
            this.bitField0_ &= -2;
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

   public static final class C2S_FaQiuGetCollectReward_23607 extends GeneratedMessageV3 implements C2S_FaQiuGetCollectReward_23607OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private int rewardId_;
      private byte memoizedIsInitialized;
      private static final C2S_FaQiuGetCollectReward_23607 DEFAULT_INSTANCE = new C2S_FaQiuGetCollectReward_23607();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FaQiuGetCollectReward_23607> PARSER = new AbstractParser<C2S_FaQiuGetCollectReward_23607>() {
         public C2S_FaQiuGetCollectReward_23607 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FaQiuGetCollectReward_23607(input, extensionRegistry);
         }
      };

      private C2S_FaQiuGetCollectReward_23607(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FaQiuGetCollectReward_23607() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FaQiuGetCollectReward_23607();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FaQiuGetCollectReward_23607(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuGetCollectReward_23607_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuGetCollectReward_23607_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FaQiuGetCollectReward_23607.class, Builder.class);
      }

      public boolean hasRewardId() {
         return (this.bitField0_ & 1) != 0;
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
            output.writeInt32(1, this.rewardId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.rewardId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FaQiuGetCollectReward_23607)) {
            return super.equals(obj);
         } else {
            C2S_FaQiuGetCollectReward_23607 other = (C2S_FaQiuGetCollectReward_23607)obj;
            if (this.hasRewardId() != other.hasRewardId()) {
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
            if (this.hasRewardId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRewardId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FaQiuGetCollectReward_23607 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FaQiuGetCollectReward_23607)PARSER.parseFrom(data);
      }

      public static C2S_FaQiuGetCollectReward_23607 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FaQiuGetCollectReward_23607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FaQiuGetCollectReward_23607 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FaQiuGetCollectReward_23607)PARSER.parseFrom(data);
      }

      public static C2S_FaQiuGetCollectReward_23607 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FaQiuGetCollectReward_23607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FaQiuGetCollectReward_23607 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FaQiuGetCollectReward_23607)PARSER.parseFrom(data);
      }

      public static C2S_FaQiuGetCollectReward_23607 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FaQiuGetCollectReward_23607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FaQiuGetCollectReward_23607 parseFrom(InputStream input) throws IOException {
         return (C2S_FaQiuGetCollectReward_23607)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FaQiuGetCollectReward_23607 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FaQiuGetCollectReward_23607)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FaQiuGetCollectReward_23607 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FaQiuGetCollectReward_23607)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FaQiuGetCollectReward_23607 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FaQiuGetCollectReward_23607)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FaQiuGetCollectReward_23607 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FaQiuGetCollectReward_23607)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FaQiuGetCollectReward_23607 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FaQiuGetCollectReward_23607)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FaQiuGetCollectReward_23607 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FaQiuGetCollectReward_23607 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FaQiuGetCollectReward_23607> parser() {
         return PARSER;
      }

      public Parser<C2S_FaQiuGetCollectReward_23607> getParserForType() {
         return PARSER;
      }

      public C2S_FaQiuGetCollectReward_23607 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FaQiuGetCollectReward_23607OrBuilder {
         private int bitField0_;
         private int rewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuGetCollectReward_23607_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuGetCollectReward_23607_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FaQiuGetCollectReward_23607.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FaQiuMsg.C2S_FaQiuGetCollectReward_23607.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuGetCollectReward_23607_descriptor;
         }

         public C2S_FaQiuGetCollectReward_23607 getDefaultInstanceForType() {
            return FaQiuMsg.C2S_FaQiuGetCollectReward_23607.getDefaultInstance();
         }

         public C2S_FaQiuGetCollectReward_23607 build() {
            C2S_FaQiuGetCollectReward_23607 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FaQiuGetCollectReward_23607 buildPartial() {
            C2S_FaQiuGetCollectReward_23607 result = new C2S_FaQiuGetCollectReward_23607(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rewardId_ = this.rewardId_;
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
            if (other instanceof C2S_FaQiuGetCollectReward_23607) {
               return this.mergeFrom((C2S_FaQiuGetCollectReward_23607)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FaQiuGetCollectReward_23607 other) {
            if (other == FaQiuMsg.C2S_FaQiuGetCollectReward_23607.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRewardId()) {
                  this.setRewardId(other.getRewardId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRewardId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_FaQiuGetCollectReward_23607 parsedMessage = null;

            try {
               parsedMessage = (C2S_FaQiuGetCollectReward_23607)FaQiuMsg.C2S_FaQiuGetCollectReward_23607.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FaQiuGetCollectReward_23607)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRewardId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRewardId() {
            return this.rewardId_;
         }

         public Builder setRewardId(int value) {
            this.bitField0_ |= 1;
            this.rewardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardId() {
            this.bitField0_ &= -2;
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

   public static final class S2C_FaQiuGetCollectReward_23608 extends GeneratedMessageV3 implements S2C_FaQiuGetCollectReward_23608OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int COLLECTREWARD_FIELD_NUMBER = 2;
      private Internal.IntList collectReward_;
      private byte memoizedIsInitialized;
      private static final S2C_FaQiuGetCollectReward_23608 DEFAULT_INSTANCE = new S2C_FaQiuGetCollectReward_23608();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FaQiuGetCollectReward_23608> PARSER = new AbstractParser<S2C_FaQiuGetCollectReward_23608>() {
         public S2C_FaQiuGetCollectReward_23608 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FaQiuGetCollectReward_23608(input, extensionRegistry);
         }
      };

      private S2C_FaQiuGetCollectReward_23608(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FaQiuGetCollectReward_23608() {
         this.memoizedIsInitialized = -1;
         this.collectReward_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FaQiuGetCollectReward_23608();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FaQiuGetCollectReward_23608(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.collectReward_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.collectReward_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.collectReward_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.collectReward_.addInt(input.readInt32());
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
               if ((mutable_bitField0_ & 1) != 0) {
                  this.collectReward_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuGetCollectReward_23608_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuGetCollectReward_23608_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FaQiuGetCollectReward_23608.class, Builder.class);
      }

      public List<Integer> getCollectRewardList() {
         return this.collectReward_;
      }

      public int getCollectRewardCount() {
         return this.collectReward_.size();
      }

      public int getCollectReward(int index) {
         return this.collectReward_.getInt(index);
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
         for(int i = 0; i < this.collectReward_.size(); ++i) {
            output.writeInt32(2, this.collectReward_.getInt(i));
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

            for(int i = 0; i < this.collectReward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.collectReward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCollectRewardList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FaQiuGetCollectReward_23608)) {
            return super.equals(obj);
         } else {
            S2C_FaQiuGetCollectReward_23608 other = (S2C_FaQiuGetCollectReward_23608)obj;
            if (!this.getCollectRewardList().equals(other.getCollectRewardList())) {
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
            if (this.getCollectRewardCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCollectRewardList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FaQiuGetCollectReward_23608 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FaQiuGetCollectReward_23608)PARSER.parseFrom(data);
      }

      public static S2C_FaQiuGetCollectReward_23608 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FaQiuGetCollectReward_23608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FaQiuGetCollectReward_23608 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FaQiuGetCollectReward_23608)PARSER.parseFrom(data);
      }

      public static S2C_FaQiuGetCollectReward_23608 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FaQiuGetCollectReward_23608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FaQiuGetCollectReward_23608 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FaQiuGetCollectReward_23608)PARSER.parseFrom(data);
      }

      public static S2C_FaQiuGetCollectReward_23608 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FaQiuGetCollectReward_23608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FaQiuGetCollectReward_23608 parseFrom(InputStream input) throws IOException {
         return (S2C_FaQiuGetCollectReward_23608)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FaQiuGetCollectReward_23608 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FaQiuGetCollectReward_23608)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FaQiuGetCollectReward_23608 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FaQiuGetCollectReward_23608)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FaQiuGetCollectReward_23608 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FaQiuGetCollectReward_23608)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FaQiuGetCollectReward_23608 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FaQiuGetCollectReward_23608)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FaQiuGetCollectReward_23608 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FaQiuGetCollectReward_23608)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FaQiuGetCollectReward_23608 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FaQiuGetCollectReward_23608 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FaQiuGetCollectReward_23608> parser() {
         return PARSER;
      }

      public Parser<S2C_FaQiuGetCollectReward_23608> getParserForType() {
         return PARSER;
      }

      public S2C_FaQiuGetCollectReward_23608 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FaQiuGetCollectReward_23608OrBuilder {
         private int bitField0_;
         private Internal.IntList collectReward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuGetCollectReward_23608_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuGetCollectReward_23608_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FaQiuGetCollectReward_23608.class, Builder.class);
         }

         private Builder() {
            this.collectReward_ = FaQiuMsg.S2C_FaQiuGetCollectReward_23608.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.collectReward_ = FaQiuMsg.S2C_FaQiuGetCollectReward_23608.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FaQiuMsg.S2C_FaQiuGetCollectReward_23608.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.collectReward_ = FaQiuMsg.S2C_FaQiuGetCollectReward_23608.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuGetCollectReward_23608_descriptor;
         }

         public S2C_FaQiuGetCollectReward_23608 getDefaultInstanceForType() {
            return FaQiuMsg.S2C_FaQiuGetCollectReward_23608.getDefaultInstance();
         }

         public S2C_FaQiuGetCollectReward_23608 build() {
            S2C_FaQiuGetCollectReward_23608 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FaQiuGetCollectReward_23608 buildPartial() {
            S2C_FaQiuGetCollectReward_23608 result = new S2C_FaQiuGetCollectReward_23608(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.collectReward_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.collectReward_ = this.collectReward_;
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
            if (other instanceof S2C_FaQiuGetCollectReward_23608) {
               return this.mergeFrom((S2C_FaQiuGetCollectReward_23608)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FaQiuGetCollectReward_23608 other) {
            if (other == FaQiuMsg.S2C_FaQiuGetCollectReward_23608.getDefaultInstance()) {
               return this;
            } else {
               if (!other.collectReward_.isEmpty()) {
                  if (this.collectReward_.isEmpty()) {
                     this.collectReward_ = other.collectReward_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureCollectRewardIsMutable();
                     this.collectReward_.addAll(other.collectReward_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FaQiuGetCollectReward_23608 parsedMessage = null;

            try {
               parsedMessage = (S2C_FaQiuGetCollectReward_23608)FaQiuMsg.S2C_FaQiuGetCollectReward_23608.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FaQiuGetCollectReward_23608)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureCollectRewardIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.collectReward_ = FaQiuMsg.S2C_FaQiuGetCollectReward_23608.mutableCopy(this.collectReward_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getCollectRewardList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.collectReward_) : this.collectReward_);
         }

         public int getCollectRewardCount() {
            return this.collectReward_.size();
         }

         public int getCollectReward(int index) {
            return this.collectReward_.getInt(index);
         }

         public Builder setCollectReward(int index, int value) {
            this.ensureCollectRewardIsMutable();
            this.collectReward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCollectReward(int value) {
            this.ensureCollectRewardIsMutable();
            this.collectReward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCollectReward(Iterable<? extends Integer> values) {
            this.ensureCollectRewardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.collectReward_);
            this.onChanged();
            return this;
         }

         public Builder clearCollectReward() {
            this.collectReward_ = FaQiuMsg.S2C_FaQiuGetCollectReward_23608.emptyIntList();
            this.bitField0_ &= -2;
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

   public static final class C2S_FaQiuGetUltimateReward_23609 extends GeneratedMessageV3 implements C2S_FaQiuGetUltimateReward_23609OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private int rewardId_;
      private byte memoizedIsInitialized;
      private static final C2S_FaQiuGetUltimateReward_23609 DEFAULT_INSTANCE = new C2S_FaQiuGetUltimateReward_23609();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FaQiuGetUltimateReward_23609> PARSER = new AbstractParser<C2S_FaQiuGetUltimateReward_23609>() {
         public C2S_FaQiuGetUltimateReward_23609 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FaQiuGetUltimateReward_23609(input, extensionRegistry);
         }
      };

      private C2S_FaQiuGetUltimateReward_23609(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FaQiuGetUltimateReward_23609() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FaQiuGetUltimateReward_23609();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FaQiuGetUltimateReward_23609(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuGetUltimateReward_23609_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuGetUltimateReward_23609_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FaQiuGetUltimateReward_23609.class, Builder.class);
      }

      public boolean hasRewardId() {
         return (this.bitField0_ & 1) != 0;
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
            output.writeInt32(1, this.rewardId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.rewardId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FaQiuGetUltimateReward_23609)) {
            return super.equals(obj);
         } else {
            C2S_FaQiuGetUltimateReward_23609 other = (C2S_FaQiuGetUltimateReward_23609)obj;
            if (this.hasRewardId() != other.hasRewardId()) {
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
            if (this.hasRewardId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRewardId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FaQiuGetUltimateReward_23609 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FaQiuGetUltimateReward_23609)PARSER.parseFrom(data);
      }

      public static C2S_FaQiuGetUltimateReward_23609 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FaQiuGetUltimateReward_23609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FaQiuGetUltimateReward_23609 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FaQiuGetUltimateReward_23609)PARSER.parseFrom(data);
      }

      public static C2S_FaQiuGetUltimateReward_23609 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FaQiuGetUltimateReward_23609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FaQiuGetUltimateReward_23609 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FaQiuGetUltimateReward_23609)PARSER.parseFrom(data);
      }

      public static C2S_FaQiuGetUltimateReward_23609 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FaQiuGetUltimateReward_23609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FaQiuGetUltimateReward_23609 parseFrom(InputStream input) throws IOException {
         return (C2S_FaQiuGetUltimateReward_23609)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FaQiuGetUltimateReward_23609 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FaQiuGetUltimateReward_23609)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FaQiuGetUltimateReward_23609 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FaQiuGetUltimateReward_23609)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FaQiuGetUltimateReward_23609 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FaQiuGetUltimateReward_23609)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FaQiuGetUltimateReward_23609 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FaQiuGetUltimateReward_23609)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FaQiuGetUltimateReward_23609 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FaQiuGetUltimateReward_23609)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FaQiuGetUltimateReward_23609 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FaQiuGetUltimateReward_23609 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FaQiuGetUltimateReward_23609> parser() {
         return PARSER;
      }

      public Parser<C2S_FaQiuGetUltimateReward_23609> getParserForType() {
         return PARSER;
      }

      public C2S_FaQiuGetUltimateReward_23609 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FaQiuGetUltimateReward_23609OrBuilder {
         private int bitField0_;
         private int rewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuGetUltimateReward_23609_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuGetUltimateReward_23609_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FaQiuGetUltimateReward_23609.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FaQiuMsg.C2S_FaQiuGetUltimateReward_23609.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_C2S_FaQiuGetUltimateReward_23609_descriptor;
         }

         public C2S_FaQiuGetUltimateReward_23609 getDefaultInstanceForType() {
            return FaQiuMsg.C2S_FaQiuGetUltimateReward_23609.getDefaultInstance();
         }

         public C2S_FaQiuGetUltimateReward_23609 build() {
            C2S_FaQiuGetUltimateReward_23609 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FaQiuGetUltimateReward_23609 buildPartial() {
            C2S_FaQiuGetUltimateReward_23609 result = new C2S_FaQiuGetUltimateReward_23609(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rewardId_ = this.rewardId_;
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
            if (other instanceof C2S_FaQiuGetUltimateReward_23609) {
               return this.mergeFrom((C2S_FaQiuGetUltimateReward_23609)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FaQiuGetUltimateReward_23609 other) {
            if (other == FaQiuMsg.C2S_FaQiuGetUltimateReward_23609.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRewardId()) {
                  this.setRewardId(other.getRewardId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRewardId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_FaQiuGetUltimateReward_23609 parsedMessage = null;

            try {
               parsedMessage = (C2S_FaQiuGetUltimateReward_23609)FaQiuMsg.C2S_FaQiuGetUltimateReward_23609.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FaQiuGetUltimateReward_23609)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRewardId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRewardId() {
            return this.rewardId_;
         }

         public Builder setRewardId(int value) {
            this.bitField0_ |= 1;
            this.rewardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardId() {
            this.bitField0_ &= -2;
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

   public static final class S2C_FaQiuGetUltimateReward_23610 extends GeneratedMessageV3 implements S2C_FaQiuGetUltimateReward_23610OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FINALREWARD_FIELD_NUMBER = 3;
      private boolean finalReward_;
      private byte memoizedIsInitialized;
      private static final S2C_FaQiuGetUltimateReward_23610 DEFAULT_INSTANCE = new S2C_FaQiuGetUltimateReward_23610();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FaQiuGetUltimateReward_23610> PARSER = new AbstractParser<S2C_FaQiuGetUltimateReward_23610>() {
         public S2C_FaQiuGetUltimateReward_23610 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FaQiuGetUltimateReward_23610(input, extensionRegistry);
         }
      };

      private S2C_FaQiuGetUltimateReward_23610(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FaQiuGetUltimateReward_23610() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FaQiuGetUltimateReward_23610();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FaQiuGetUltimateReward_23610(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 24:
                        this.bitField0_ |= 1;
                        this.finalReward_ = input.readBool();
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
         return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuGetUltimateReward_23610_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuGetUltimateReward_23610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FaQiuGetUltimateReward_23610.class, Builder.class);
      }

      public boolean hasFinalReward() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getFinalReward() {
         return this.finalReward_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFinalReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(3, this.finalReward_);
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
               size += CodedOutputStream.computeBoolSize(3, this.finalReward_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FaQiuGetUltimateReward_23610)) {
            return super.equals(obj);
         } else {
            S2C_FaQiuGetUltimateReward_23610 other = (S2C_FaQiuGetUltimateReward_23610)obj;
            if (this.hasFinalReward() != other.hasFinalReward()) {
               return false;
            } else if (this.hasFinalReward() && this.getFinalReward() != other.getFinalReward()) {
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
            if (this.hasFinalReward()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getFinalReward());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FaQiuGetUltimateReward_23610 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FaQiuGetUltimateReward_23610)PARSER.parseFrom(data);
      }

      public static S2C_FaQiuGetUltimateReward_23610 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FaQiuGetUltimateReward_23610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FaQiuGetUltimateReward_23610 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FaQiuGetUltimateReward_23610)PARSER.parseFrom(data);
      }

      public static S2C_FaQiuGetUltimateReward_23610 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FaQiuGetUltimateReward_23610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FaQiuGetUltimateReward_23610 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FaQiuGetUltimateReward_23610)PARSER.parseFrom(data);
      }

      public static S2C_FaQiuGetUltimateReward_23610 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FaQiuGetUltimateReward_23610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FaQiuGetUltimateReward_23610 parseFrom(InputStream input) throws IOException {
         return (S2C_FaQiuGetUltimateReward_23610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FaQiuGetUltimateReward_23610 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FaQiuGetUltimateReward_23610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FaQiuGetUltimateReward_23610 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FaQiuGetUltimateReward_23610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FaQiuGetUltimateReward_23610 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FaQiuGetUltimateReward_23610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FaQiuGetUltimateReward_23610 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FaQiuGetUltimateReward_23610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FaQiuGetUltimateReward_23610 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FaQiuGetUltimateReward_23610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FaQiuGetUltimateReward_23610 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FaQiuGetUltimateReward_23610 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FaQiuGetUltimateReward_23610> parser() {
         return PARSER;
      }

      public Parser<S2C_FaQiuGetUltimateReward_23610> getParserForType() {
         return PARSER;
      }

      public S2C_FaQiuGetUltimateReward_23610 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FaQiuGetUltimateReward_23610OrBuilder {
         private int bitField0_;
         private boolean finalReward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuGetUltimateReward_23610_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuGetUltimateReward_23610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FaQiuGetUltimateReward_23610.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FaQiuMsg.S2C_FaQiuGetUltimateReward_23610.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.finalReward_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FaQiuMsg.internal_static_faQiu_com_gzbz_protobuf_S2C_FaQiuGetUltimateReward_23610_descriptor;
         }

         public S2C_FaQiuGetUltimateReward_23610 getDefaultInstanceForType() {
            return FaQiuMsg.S2C_FaQiuGetUltimateReward_23610.getDefaultInstance();
         }

         public S2C_FaQiuGetUltimateReward_23610 build() {
            S2C_FaQiuGetUltimateReward_23610 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FaQiuGetUltimateReward_23610 buildPartial() {
            S2C_FaQiuGetUltimateReward_23610 result = new S2C_FaQiuGetUltimateReward_23610(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.finalReward_ = this.finalReward_;
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
            if (other instanceof S2C_FaQiuGetUltimateReward_23610) {
               return this.mergeFrom((S2C_FaQiuGetUltimateReward_23610)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FaQiuGetUltimateReward_23610 other) {
            if (other == FaQiuMsg.S2C_FaQiuGetUltimateReward_23610.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFinalReward()) {
                  this.setFinalReward(other.getFinalReward());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasFinalReward();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FaQiuGetUltimateReward_23610 parsedMessage = null;

            try {
               parsedMessage = (S2C_FaQiuGetUltimateReward_23610)FaQiuMsg.S2C_FaQiuGetUltimateReward_23610.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FaQiuGetUltimateReward_23610)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFinalReward() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getFinalReward() {
            return this.finalReward_;
         }

         public Builder setFinalReward(boolean value) {
            this.bitField0_ |= 1;
            this.finalReward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFinalReward() {
            this.bitField0_ &= -2;
            this.finalReward_ = false;
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

   public interface C2S_FaQiuCommitTask_23603OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_FaQiuDraw_23605OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_FaQiuGetCollectReward_23607OrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();
   }

   public interface C2S_FaQiuGetUltimateReward_23609OrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();
   }

   public interface C2S_FaQiuMain_23601OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_FaQiuCommitTask_23604OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskListList();

      ActivityMsg.TaskData getTaskList(int index);

      int getTaskListCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index);
   }

   public interface S2C_FaQiuDraw_23606OrBuilder extends MessageOrBuilder {
      List<Integer> getOpenChipList();

      int getOpenChipCount();

      int getOpenChip(int index);
   }

   public interface S2C_FaQiuGetCollectReward_23608OrBuilder extends MessageOrBuilder {
      List<Integer> getCollectRewardList();

      int getCollectRewardCount();

      int getCollectReward(int index);
   }

   public interface S2C_FaQiuGetUltimateReward_23610OrBuilder extends MessageOrBuilder {
      boolean hasFinalReward();

      boolean getFinalReward();
   }

   public interface S2C_FaQiuMain_23602OrBuilder extends MessageOrBuilder {
      List<Integer> getOpenChipList();

      int getOpenChipCount();

      int getOpenChip(int index);

      List<Integer> getCollectRewardList();

      int getCollectRewardCount();

      int getCollectReward(int index);

      boolean hasFinalReward();

      boolean getFinalReward();

      List<ActivityMsg.TaskData> getTaskListList();

      ActivityMsg.TaskData getTaskList(int index);

      int getTaskListCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index);
   }
}
