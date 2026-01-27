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

public final class LongHuMsg {
   private static final Descriptors.Descriptor internal_static_longHu_com_gzbz_protobuf_C2S_LongHuDailyTask_19001_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_longHu_com_gzbz_protobuf_C2S_LongHuDailyTask_19001_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_longHu_com_gzbz_protobuf_S2C_LongHuDailyTask_19002_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_longHu_com_gzbz_protobuf_S2C_LongHuDailyTask_19002_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_longHu_com_gzbz_protobuf_C2S_LongHuLiYuTask_19003_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_longHu_com_gzbz_protobuf_C2S_LongHuLiYuTask_19003_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_longHu_com_gzbz_protobuf_S2C_LongHuLiYuTask_19004_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_longHu_com_gzbz_protobuf_S2C_LongHuLiYuTask_19004_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_longHu_com_gzbz_protobuf_S2C_LongHuTaskNotify_19006_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_longHu_com_gzbz_protobuf_S2C_LongHuTaskNotify_19006_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_longHu_com_gzbz_protobuf_C2S_LongHuTaskCommit_19007_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_longHu_com_gzbz_protobuf_C2S_LongHuTaskCommit_19007_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_longHu_com_gzbz_protobuf_S2C_LongHuTaskCommit_19008_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_longHu_com_gzbz_protobuf_S2C_LongHuTaskCommit_19008_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_longHu_com_gzbz_protobuf_C2S_LongHuBuyIntegral_19009_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_longHu_com_gzbz_protobuf_C2S_LongHuBuyIntegral_19009_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_longHu_com_gzbz_protobuf_S2C_LongHuBuyIntegral_19010_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_longHu_com_gzbz_protobuf_S2C_LongHuBuyIntegral_19010_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_longHu_com_gzbz_protobuf_C2S_LongHu_19021_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_longHu_com_gzbz_protobuf_C2S_LongHu_19021_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_longHu_com_gzbz_protobuf_S2C_LongHu_19022_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_longHu_com_gzbz_protobuf_S2C_LongHu_19022_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private LongHuMsg() {
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
      String[] descriptorData = new String[]{"\n\fLongHu.proto\u0012\u0018longHu.com.gzbz.protobuf\u001a\fcommon.proto\"\u001b\n\u0019C2S_LongHuDailyTask_19001\"[\n\u0019S2C_LongHuDailyTask_19002\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\u0012\u000e\n\u0006actDay\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nalreadyBuy\u0018\u0003 \u0002(\u0005\"\u001a\n\u0018C2S_LongHuLiYuTask_19003\"6\n\u0018S2C_LongHuLiYuTask_19004\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\"8\n\u001aS2C_LongHuTaskNotify_19006\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\",\n\u001aC2S_LongHuTaskCommit_19007\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\",\n\u001aS2C_LongHuTaskCommit_19008\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"*\n\u001bC2S_LongHuBuyIntegral_19009\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\">\n\u001bS2C_LongHuBuyIntegral_19010\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nalreadyBuy\u0018\u0002 \u0002(\u0005\"\u0012\n\u0010C2S_LongHu_19021\"H\n\u0010S2C_LongHu_19022\u0012\u0011\n\tstartTime\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bdropTime\u0018\u0003 \u0002(\u0005B \n\u0011com.gzbz.protobufB\tLongHuMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_longHu_com_gzbz_protobuf_C2S_LongHuDailyTask_19001_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_longHu_com_gzbz_protobuf_C2S_LongHuDailyTask_19001_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_longHu_com_gzbz_protobuf_C2S_LongHuDailyTask_19001_descriptor, new String[0]);
      internal_static_longHu_com_gzbz_protobuf_S2C_LongHuDailyTask_19002_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_longHu_com_gzbz_protobuf_S2C_LongHuDailyTask_19002_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_longHu_com_gzbz_protobuf_S2C_LongHuDailyTask_19002_descriptor, new String[]{"Task", "ActDay", "AlreadyBuy"});
      internal_static_longHu_com_gzbz_protobuf_C2S_LongHuLiYuTask_19003_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_longHu_com_gzbz_protobuf_C2S_LongHuLiYuTask_19003_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_longHu_com_gzbz_protobuf_C2S_LongHuLiYuTask_19003_descriptor, new String[0]);
      internal_static_longHu_com_gzbz_protobuf_S2C_LongHuLiYuTask_19004_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_longHu_com_gzbz_protobuf_S2C_LongHuLiYuTask_19004_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_longHu_com_gzbz_protobuf_S2C_LongHuLiYuTask_19004_descriptor, new String[]{"Task"});
      internal_static_longHu_com_gzbz_protobuf_S2C_LongHuTaskNotify_19006_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_longHu_com_gzbz_protobuf_S2C_LongHuTaskNotify_19006_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_longHu_com_gzbz_protobuf_S2C_LongHuTaskNotify_19006_descriptor, new String[]{"Task"});
      internal_static_longHu_com_gzbz_protobuf_C2S_LongHuTaskCommit_19007_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_longHu_com_gzbz_protobuf_C2S_LongHuTaskCommit_19007_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_longHu_com_gzbz_protobuf_C2S_LongHuTaskCommit_19007_descriptor, new String[]{"TaskId"});
      internal_static_longHu_com_gzbz_protobuf_S2C_LongHuTaskCommit_19008_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_longHu_com_gzbz_protobuf_S2C_LongHuTaskCommit_19008_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_longHu_com_gzbz_protobuf_S2C_LongHuTaskCommit_19008_descriptor, new String[]{"TaskId"});
      internal_static_longHu_com_gzbz_protobuf_C2S_LongHuBuyIntegral_19009_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_longHu_com_gzbz_protobuf_C2S_LongHuBuyIntegral_19009_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_longHu_com_gzbz_protobuf_C2S_LongHuBuyIntegral_19009_descriptor, new String[]{"Num"});
      internal_static_longHu_com_gzbz_protobuf_S2C_LongHuBuyIntegral_19010_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_longHu_com_gzbz_protobuf_S2C_LongHuBuyIntegral_19010_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_longHu_com_gzbz_protobuf_S2C_LongHuBuyIntegral_19010_descriptor, new String[]{"Num", "AlreadyBuy"});
      internal_static_longHu_com_gzbz_protobuf_C2S_LongHu_19021_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_longHu_com_gzbz_protobuf_C2S_LongHu_19021_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_longHu_com_gzbz_protobuf_C2S_LongHu_19021_descriptor, new String[0]);
      internal_static_longHu_com_gzbz_protobuf_S2C_LongHu_19022_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_longHu_com_gzbz_protobuf_S2C_LongHu_19022_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_longHu_com_gzbz_protobuf_S2C_LongHu_19022_descriptor, new String[]{"StartTime", "EndTime", "DropTime"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_LongHuDailyTask_19001 extends GeneratedMessageV3 implements C2S_LongHuDailyTask_19001OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LongHuDailyTask_19001 DEFAULT_INSTANCE = new C2S_LongHuDailyTask_19001();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LongHuDailyTask_19001> PARSER = new AbstractParser<C2S_LongHuDailyTask_19001>() {
         public C2S_LongHuDailyTask_19001 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LongHuDailyTask_19001(input, extensionRegistry);
         }
      };

      private C2S_LongHuDailyTask_19001(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LongHuDailyTask_19001() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LongHuDailyTask_19001();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LongHuDailyTask_19001(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHuDailyTask_19001_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHuDailyTask_19001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LongHuDailyTask_19001.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LongHuDailyTask_19001)) {
            return super.equals(obj);
         } else {
            C2S_LongHuDailyTask_19001 other = (C2S_LongHuDailyTask_19001)obj;
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

      public static C2S_LongHuDailyTask_19001 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LongHuDailyTask_19001)PARSER.parseFrom(data);
      }

      public static C2S_LongHuDailyTask_19001 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LongHuDailyTask_19001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LongHuDailyTask_19001 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LongHuDailyTask_19001)PARSER.parseFrom(data);
      }

      public static C2S_LongHuDailyTask_19001 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LongHuDailyTask_19001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LongHuDailyTask_19001 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LongHuDailyTask_19001)PARSER.parseFrom(data);
      }

      public static C2S_LongHuDailyTask_19001 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LongHuDailyTask_19001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LongHuDailyTask_19001 parseFrom(InputStream input) throws IOException {
         return (C2S_LongHuDailyTask_19001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LongHuDailyTask_19001 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LongHuDailyTask_19001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LongHuDailyTask_19001 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LongHuDailyTask_19001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LongHuDailyTask_19001 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LongHuDailyTask_19001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LongHuDailyTask_19001 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LongHuDailyTask_19001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LongHuDailyTask_19001 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LongHuDailyTask_19001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LongHuDailyTask_19001 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LongHuDailyTask_19001 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LongHuDailyTask_19001> parser() {
         return PARSER;
      }

      public Parser<C2S_LongHuDailyTask_19001> getParserForType() {
         return PARSER;
      }

      public C2S_LongHuDailyTask_19001 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LongHuDailyTask_19001OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHuDailyTask_19001_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHuDailyTask_19001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LongHuDailyTask_19001.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LongHuMsg.C2S_LongHuDailyTask_19001.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHuDailyTask_19001_descriptor;
         }

         public C2S_LongHuDailyTask_19001 getDefaultInstanceForType() {
            return LongHuMsg.C2S_LongHuDailyTask_19001.getDefaultInstance();
         }

         public C2S_LongHuDailyTask_19001 build() {
            C2S_LongHuDailyTask_19001 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LongHuDailyTask_19001 buildPartial() {
            C2S_LongHuDailyTask_19001 result = new C2S_LongHuDailyTask_19001(this);
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
            if (other instanceof C2S_LongHuDailyTask_19001) {
               return this.mergeFrom((C2S_LongHuDailyTask_19001)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LongHuDailyTask_19001 other) {
            if (other == LongHuMsg.C2S_LongHuDailyTask_19001.getDefaultInstance()) {
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
            C2S_LongHuDailyTask_19001 parsedMessage = null;

            try {
               parsedMessage = (C2S_LongHuDailyTask_19001)LongHuMsg.C2S_LongHuDailyTask_19001.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LongHuDailyTask_19001)e.getUnfinishedMessage();
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

   public static final class S2C_LongHuDailyTask_19002 extends GeneratedMessageV3 implements S2C_LongHuDailyTask_19002OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      public static final int ACTDAY_FIELD_NUMBER = 2;
      private int actDay_;
      public static final int ALREADYBUY_FIELD_NUMBER = 3;
      private int alreadyBuy_;
      private byte memoizedIsInitialized;
      private static final S2C_LongHuDailyTask_19002 DEFAULT_INSTANCE = new S2C_LongHuDailyTask_19002();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LongHuDailyTask_19002> PARSER = new AbstractParser<S2C_LongHuDailyTask_19002>() {
         public S2C_LongHuDailyTask_19002 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LongHuDailyTask_19002(input, extensionRegistry);
         }
      };

      private S2C_LongHuDailyTask_19002(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LongHuDailyTask_19002() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LongHuDailyTask_19002();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LongHuDailyTask_19002(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.task_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.task_.add(input.readMessage(CommonMsg.Task.PARSER, extensionRegistry));
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.actDay_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.alreadyBuy_ = input.readInt32();
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
                  this.task_ = Collections.unmodifiableList(this.task_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuDailyTask_19002_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuDailyTask_19002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LongHuDailyTask_19002.class, Builder.class);
      }

      public List<CommonMsg.Task> getTaskList() {
         return this.task_;
      }

      public List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList() {
         return this.task_;
      }

      public int getTaskCount() {
         return this.task_.size();
      }

      public CommonMsg.Task getTask(int index) {
         return (CommonMsg.Task)this.task_.get(index);
      }

      public CommonMsg.TaskOrBuilder getTaskOrBuilder(int index) {
         return (CommonMsg.TaskOrBuilder)this.task_.get(index);
      }

      public boolean hasActDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActDay() {
         return this.actDay_;
      }

      public boolean hasAlreadyBuy() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getAlreadyBuy() {
         return this.alreadyBuy_;
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
         } else if (!this.hasAlreadyBuy()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.task_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.task_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.actDay_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.alreadyBuy_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.task_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.task_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.actDay_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.alreadyBuy_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LongHuDailyTask_19002)) {
            return super.equals(obj);
         } else {
            S2C_LongHuDailyTask_19002 other = (S2C_LongHuDailyTask_19002)obj;
            if (!this.getTaskList().equals(other.getTaskList())) {
               return false;
            } else if (this.hasActDay() != other.hasActDay()) {
               return false;
            } else if (this.hasActDay() && this.getActDay() != other.getActDay()) {
               return false;
            } else if (this.hasAlreadyBuy() != other.hasAlreadyBuy()) {
               return false;
            } else if (this.hasAlreadyBuy() && this.getAlreadyBuy() != other.getAlreadyBuy()) {
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
            if (this.getTaskCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskList().hashCode();
            }

            if (this.hasActDay()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getActDay();
            }

            if (this.hasAlreadyBuy()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getAlreadyBuy();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LongHuDailyTask_19002 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LongHuDailyTask_19002)PARSER.parseFrom(data);
      }

      public static S2C_LongHuDailyTask_19002 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LongHuDailyTask_19002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LongHuDailyTask_19002 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LongHuDailyTask_19002)PARSER.parseFrom(data);
      }

      public static S2C_LongHuDailyTask_19002 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LongHuDailyTask_19002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LongHuDailyTask_19002 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LongHuDailyTask_19002)PARSER.parseFrom(data);
      }

      public static S2C_LongHuDailyTask_19002 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LongHuDailyTask_19002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LongHuDailyTask_19002 parseFrom(InputStream input) throws IOException {
         return (S2C_LongHuDailyTask_19002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LongHuDailyTask_19002 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LongHuDailyTask_19002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LongHuDailyTask_19002 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LongHuDailyTask_19002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LongHuDailyTask_19002 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LongHuDailyTask_19002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LongHuDailyTask_19002 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LongHuDailyTask_19002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LongHuDailyTask_19002 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LongHuDailyTask_19002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LongHuDailyTask_19002 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LongHuDailyTask_19002 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LongHuDailyTask_19002> parser() {
         return PARSER;
      }

      public Parser<S2C_LongHuDailyTask_19002> getParserForType() {
         return PARSER;
      }

      public S2C_LongHuDailyTask_19002 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LongHuDailyTask_19002OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;
         private int actDay_;
         private int alreadyBuy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuDailyTask_19002_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuDailyTask_19002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LongHuDailyTask_19002.class, Builder.class);
         }

         private Builder() {
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LongHuMsg.S2C_LongHuDailyTask_19002.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.taskBuilder_.clear();
            }

            this.actDay_ = 0;
            this.bitField0_ &= -3;
            this.alreadyBuy_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuDailyTask_19002_descriptor;
         }

         public S2C_LongHuDailyTask_19002 getDefaultInstanceForType() {
            return LongHuMsg.S2C_LongHuDailyTask_19002.getDefaultInstance();
         }

         public S2C_LongHuDailyTask_19002 build() {
            S2C_LongHuDailyTask_19002 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LongHuDailyTask_19002 buildPartial() {
            S2C_LongHuDailyTask_19002 result = new S2C_LongHuDailyTask_19002(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
                  this.bitField0_ &= -2;
               }

               result.task_ = this.task_;
            } else {
               result.task_ = this.taskBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               result.actDay_ = this.actDay_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.alreadyBuy_ = this.alreadyBuy_;
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
            if (other instanceof S2C_LongHuDailyTask_19002) {
               return this.mergeFrom((S2C_LongHuDailyTask_19002)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LongHuDailyTask_19002 other) {
            if (other == LongHuMsg.S2C_LongHuDailyTask_19002.getDefaultInstance()) {
               return this;
            } else {
               if (this.taskBuilder_ == null) {
                  if (!other.task_.isEmpty()) {
                     if (this.task_.isEmpty()) {
                        this.task_ = other.task_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTaskIsMutable();
                        this.task_.addAll(other.task_);
                     }

                     this.onChanged();
                  }
               } else if (!other.task_.isEmpty()) {
                  if (this.taskBuilder_.isEmpty()) {
                     this.taskBuilder_.dispose();
                     this.taskBuilder_ = null;
                     this.task_ = other.task_;
                     this.bitField0_ &= -2;
                     this.taskBuilder_ = LongHuMsg.S2C_LongHuDailyTask_19002.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
                  } else {
                     this.taskBuilder_.addAllMessages(other.task_);
                  }
               }

               if (other.hasActDay()) {
                  this.setActDay(other.getActDay());
               }

               if (other.hasAlreadyBuy()) {
                  this.setAlreadyBuy(other.getAlreadyBuy());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActDay()) {
               return false;
            } else if (!this.hasAlreadyBuy()) {
               return false;
            } else {
               for(int i = 0; i < this.getTaskCount(); ++i) {
                  if (!this.getTask(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LongHuDailyTask_19002 parsedMessage = null;

            try {
               parsedMessage = (S2C_LongHuDailyTask_19002)LongHuMsg.S2C_LongHuDailyTask_19002.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LongHuDailyTask_19002)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTaskIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.task_ = new ArrayList(this.task_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.Task> getTaskList() {
            return this.taskBuilder_ == null ? Collections.unmodifiableList(this.task_) : this.taskBuilder_.getMessageList();
         }

         public int getTaskCount() {
            return this.taskBuilder_ == null ? this.task_.size() : this.taskBuilder_.getCount();
         }

         public CommonMsg.Task getTask(int index) {
            return this.taskBuilder_ == null ? (CommonMsg.Task)this.task_.get(index) : (CommonMsg.Task)this.taskBuilder_.getMessage(index);
         }

         public Builder setTask(int index, CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.set(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTask(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTask(CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTask(int index, CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTask(CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTask(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTask(Iterable<? extends CommonMsg.Task> values) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.task_);
               this.onChanged();
            } else {
               this.taskBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTask() {
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Builder removeTask(int index) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.remove(index);
               this.onChanged();
            } else {
               this.taskBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.Task.Builder getTaskBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TaskOrBuilder getTaskOrBuilder(int index) {
            return this.taskBuilder_ == null ? (CommonMsg.TaskOrBuilder)this.task_.get(index) : (CommonMsg.TaskOrBuilder)this.taskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList() {
            return this.taskBuilder_ != null ? this.taskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.task_);
         }

         public CommonMsg.Task.Builder addTaskBuilder() {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().addBuilder(CommonMsg.Task.getDefaultInstance());
         }

         public CommonMsg.Task.Builder addTaskBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().addBuilder(index, CommonMsg.Task.getDefaultInstance());
         }

         public List<CommonMsg.Task.Builder> getTaskBuilderList() {
            return this.getTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTaskFieldBuilder() {
            if (this.taskBuilder_ == null) {
               this.taskBuilder_ = new RepeatedFieldBuilderV3(this.task_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.task_ = null;
            }

            return this.taskBuilder_;
         }

         public boolean hasActDay() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getActDay() {
            return this.actDay_;
         }

         public Builder setActDay(int value) {
            this.bitField0_ |= 2;
            this.actDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActDay() {
            this.bitField0_ &= -3;
            this.actDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAlreadyBuy() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getAlreadyBuy() {
            return this.alreadyBuy_;
         }

         public Builder setAlreadyBuy(int value) {
            this.bitField0_ |= 4;
            this.alreadyBuy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAlreadyBuy() {
            this.bitField0_ &= -5;
            this.alreadyBuy_ = 0;
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

   public static final class C2S_LongHuLiYuTask_19003 extends GeneratedMessageV3 implements C2S_LongHuLiYuTask_19003OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LongHuLiYuTask_19003 DEFAULT_INSTANCE = new C2S_LongHuLiYuTask_19003();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LongHuLiYuTask_19003> PARSER = new AbstractParser<C2S_LongHuLiYuTask_19003>() {
         public C2S_LongHuLiYuTask_19003 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LongHuLiYuTask_19003(input, extensionRegistry);
         }
      };

      private C2S_LongHuLiYuTask_19003(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LongHuLiYuTask_19003() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LongHuLiYuTask_19003();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LongHuLiYuTask_19003(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHuLiYuTask_19003_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHuLiYuTask_19003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LongHuLiYuTask_19003.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LongHuLiYuTask_19003)) {
            return super.equals(obj);
         } else {
            C2S_LongHuLiYuTask_19003 other = (C2S_LongHuLiYuTask_19003)obj;
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

      public static C2S_LongHuLiYuTask_19003 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LongHuLiYuTask_19003)PARSER.parseFrom(data);
      }

      public static C2S_LongHuLiYuTask_19003 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LongHuLiYuTask_19003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LongHuLiYuTask_19003 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LongHuLiYuTask_19003)PARSER.parseFrom(data);
      }

      public static C2S_LongHuLiYuTask_19003 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LongHuLiYuTask_19003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LongHuLiYuTask_19003 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LongHuLiYuTask_19003)PARSER.parseFrom(data);
      }

      public static C2S_LongHuLiYuTask_19003 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LongHuLiYuTask_19003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LongHuLiYuTask_19003 parseFrom(InputStream input) throws IOException {
         return (C2S_LongHuLiYuTask_19003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LongHuLiYuTask_19003 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LongHuLiYuTask_19003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LongHuLiYuTask_19003 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LongHuLiYuTask_19003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LongHuLiYuTask_19003 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LongHuLiYuTask_19003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LongHuLiYuTask_19003 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LongHuLiYuTask_19003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LongHuLiYuTask_19003 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LongHuLiYuTask_19003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LongHuLiYuTask_19003 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LongHuLiYuTask_19003 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LongHuLiYuTask_19003> parser() {
         return PARSER;
      }

      public Parser<C2S_LongHuLiYuTask_19003> getParserForType() {
         return PARSER;
      }

      public C2S_LongHuLiYuTask_19003 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LongHuLiYuTask_19003OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHuLiYuTask_19003_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHuLiYuTask_19003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LongHuLiYuTask_19003.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LongHuMsg.C2S_LongHuLiYuTask_19003.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHuLiYuTask_19003_descriptor;
         }

         public C2S_LongHuLiYuTask_19003 getDefaultInstanceForType() {
            return LongHuMsg.C2S_LongHuLiYuTask_19003.getDefaultInstance();
         }

         public C2S_LongHuLiYuTask_19003 build() {
            C2S_LongHuLiYuTask_19003 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LongHuLiYuTask_19003 buildPartial() {
            C2S_LongHuLiYuTask_19003 result = new C2S_LongHuLiYuTask_19003(this);
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
            if (other instanceof C2S_LongHuLiYuTask_19003) {
               return this.mergeFrom((C2S_LongHuLiYuTask_19003)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LongHuLiYuTask_19003 other) {
            if (other == LongHuMsg.C2S_LongHuLiYuTask_19003.getDefaultInstance()) {
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
            C2S_LongHuLiYuTask_19003 parsedMessage = null;

            try {
               parsedMessage = (C2S_LongHuLiYuTask_19003)LongHuMsg.C2S_LongHuLiYuTask_19003.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LongHuLiYuTask_19003)e.getUnfinishedMessage();
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

   public static final class S2C_LongHuLiYuTask_19004 extends GeneratedMessageV3 implements S2C_LongHuLiYuTask_19004OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_LongHuLiYuTask_19004 DEFAULT_INSTANCE = new S2C_LongHuLiYuTask_19004();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LongHuLiYuTask_19004> PARSER = new AbstractParser<S2C_LongHuLiYuTask_19004>() {
         public S2C_LongHuLiYuTask_19004 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LongHuLiYuTask_19004(input, extensionRegistry);
         }
      };

      private S2C_LongHuLiYuTask_19004(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LongHuLiYuTask_19004() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LongHuLiYuTask_19004();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LongHuLiYuTask_19004(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.task_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.task_.add(input.readMessage(CommonMsg.Task.PARSER, extensionRegistry));
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
                  this.task_ = Collections.unmodifiableList(this.task_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuLiYuTask_19004_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuLiYuTask_19004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LongHuLiYuTask_19004.class, Builder.class);
      }

      public List<CommonMsg.Task> getTaskList() {
         return this.task_;
      }

      public List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList() {
         return this.task_;
      }

      public int getTaskCount() {
         return this.task_.size();
      }

      public CommonMsg.Task getTask(int index) {
         return (CommonMsg.Task)this.task_.get(index);
      }

      public CommonMsg.TaskOrBuilder getTaskOrBuilder(int index) {
         return (CommonMsg.TaskOrBuilder)this.task_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.task_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.task_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.task_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.task_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LongHuLiYuTask_19004)) {
            return super.equals(obj);
         } else {
            S2C_LongHuLiYuTask_19004 other = (S2C_LongHuLiYuTask_19004)obj;
            if (!this.getTaskList().equals(other.getTaskList())) {
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
            if (this.getTaskCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LongHuLiYuTask_19004 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LongHuLiYuTask_19004)PARSER.parseFrom(data);
      }

      public static S2C_LongHuLiYuTask_19004 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LongHuLiYuTask_19004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LongHuLiYuTask_19004 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LongHuLiYuTask_19004)PARSER.parseFrom(data);
      }

      public static S2C_LongHuLiYuTask_19004 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LongHuLiYuTask_19004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LongHuLiYuTask_19004 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LongHuLiYuTask_19004)PARSER.parseFrom(data);
      }

      public static S2C_LongHuLiYuTask_19004 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LongHuLiYuTask_19004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LongHuLiYuTask_19004 parseFrom(InputStream input) throws IOException {
         return (S2C_LongHuLiYuTask_19004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LongHuLiYuTask_19004 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LongHuLiYuTask_19004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LongHuLiYuTask_19004 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LongHuLiYuTask_19004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LongHuLiYuTask_19004 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LongHuLiYuTask_19004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LongHuLiYuTask_19004 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LongHuLiYuTask_19004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LongHuLiYuTask_19004 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LongHuLiYuTask_19004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LongHuLiYuTask_19004 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LongHuLiYuTask_19004 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LongHuLiYuTask_19004> parser() {
         return PARSER;
      }

      public Parser<S2C_LongHuLiYuTask_19004> getParserForType() {
         return PARSER;
      }

      public S2C_LongHuLiYuTask_19004 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LongHuLiYuTask_19004OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuLiYuTask_19004_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuLiYuTask_19004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LongHuLiYuTask_19004.class, Builder.class);
         }

         private Builder() {
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LongHuMsg.S2C_LongHuLiYuTask_19004.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuLiYuTask_19004_descriptor;
         }

         public S2C_LongHuLiYuTask_19004 getDefaultInstanceForType() {
            return LongHuMsg.S2C_LongHuLiYuTask_19004.getDefaultInstance();
         }

         public S2C_LongHuLiYuTask_19004 build() {
            S2C_LongHuLiYuTask_19004 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LongHuLiYuTask_19004 buildPartial() {
            S2C_LongHuLiYuTask_19004 result = new S2C_LongHuLiYuTask_19004(this);
            int from_bitField0_ = this.bitField0_;
            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
                  this.bitField0_ &= -2;
               }

               result.task_ = this.task_;
            } else {
               result.task_ = this.taskBuilder_.build();
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
            if (other instanceof S2C_LongHuLiYuTask_19004) {
               return this.mergeFrom((S2C_LongHuLiYuTask_19004)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LongHuLiYuTask_19004 other) {
            if (other == LongHuMsg.S2C_LongHuLiYuTask_19004.getDefaultInstance()) {
               return this;
            } else {
               if (this.taskBuilder_ == null) {
                  if (!other.task_.isEmpty()) {
                     if (this.task_.isEmpty()) {
                        this.task_ = other.task_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTaskIsMutable();
                        this.task_.addAll(other.task_);
                     }

                     this.onChanged();
                  }
               } else if (!other.task_.isEmpty()) {
                  if (this.taskBuilder_.isEmpty()) {
                     this.taskBuilder_.dispose();
                     this.taskBuilder_ = null;
                     this.task_ = other.task_;
                     this.bitField0_ &= -2;
                     this.taskBuilder_ = LongHuMsg.S2C_LongHuLiYuTask_19004.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
                  } else {
                     this.taskBuilder_.addAllMessages(other.task_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LongHuLiYuTask_19004 parsedMessage = null;

            try {
               parsedMessage = (S2C_LongHuLiYuTask_19004)LongHuMsg.S2C_LongHuLiYuTask_19004.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LongHuLiYuTask_19004)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTaskIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.task_ = new ArrayList(this.task_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.Task> getTaskList() {
            return this.taskBuilder_ == null ? Collections.unmodifiableList(this.task_) : this.taskBuilder_.getMessageList();
         }

         public int getTaskCount() {
            return this.taskBuilder_ == null ? this.task_.size() : this.taskBuilder_.getCount();
         }

         public CommonMsg.Task getTask(int index) {
            return this.taskBuilder_ == null ? (CommonMsg.Task)this.task_.get(index) : (CommonMsg.Task)this.taskBuilder_.getMessage(index);
         }

         public Builder setTask(int index, CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.set(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTask(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTask(CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTask(int index, CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTask(CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTask(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTask(Iterable<? extends CommonMsg.Task> values) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.task_);
               this.onChanged();
            } else {
               this.taskBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTask() {
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Builder removeTask(int index) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.remove(index);
               this.onChanged();
            } else {
               this.taskBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.Task.Builder getTaskBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TaskOrBuilder getTaskOrBuilder(int index) {
            return this.taskBuilder_ == null ? (CommonMsg.TaskOrBuilder)this.task_.get(index) : (CommonMsg.TaskOrBuilder)this.taskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList() {
            return this.taskBuilder_ != null ? this.taskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.task_);
         }

         public CommonMsg.Task.Builder addTaskBuilder() {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().addBuilder(CommonMsg.Task.getDefaultInstance());
         }

         public CommonMsg.Task.Builder addTaskBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().addBuilder(index, CommonMsg.Task.getDefaultInstance());
         }

         public List<CommonMsg.Task.Builder> getTaskBuilderList() {
            return this.getTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTaskFieldBuilder() {
            if (this.taskBuilder_ == null) {
               this.taskBuilder_ = new RepeatedFieldBuilderV3(this.task_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.task_ = null;
            }

            return this.taskBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_LongHuTaskNotify_19006 extends GeneratedMessageV3 implements S2C_LongHuTaskNotify_19006OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_LongHuTaskNotify_19006 DEFAULT_INSTANCE = new S2C_LongHuTaskNotify_19006();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LongHuTaskNotify_19006> PARSER = new AbstractParser<S2C_LongHuTaskNotify_19006>() {
         public S2C_LongHuTaskNotify_19006 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LongHuTaskNotify_19006(input, extensionRegistry);
         }
      };

      private S2C_LongHuTaskNotify_19006(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LongHuTaskNotify_19006() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LongHuTaskNotify_19006();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LongHuTaskNotify_19006(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.task_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.task_.add(input.readMessage(CommonMsg.Task.PARSER, extensionRegistry));
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
                  this.task_ = Collections.unmodifiableList(this.task_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuTaskNotify_19006_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuTaskNotify_19006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LongHuTaskNotify_19006.class, Builder.class);
      }

      public List<CommonMsg.Task> getTaskList() {
         return this.task_;
      }

      public List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList() {
         return this.task_;
      }

      public int getTaskCount() {
         return this.task_.size();
      }

      public CommonMsg.Task getTask(int index) {
         return (CommonMsg.Task)this.task_.get(index);
      }

      public CommonMsg.TaskOrBuilder getTaskOrBuilder(int index) {
         return (CommonMsg.TaskOrBuilder)this.task_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.task_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.task_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.task_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.task_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LongHuTaskNotify_19006)) {
            return super.equals(obj);
         } else {
            S2C_LongHuTaskNotify_19006 other = (S2C_LongHuTaskNotify_19006)obj;
            if (!this.getTaskList().equals(other.getTaskList())) {
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
            if (this.getTaskCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LongHuTaskNotify_19006 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LongHuTaskNotify_19006)PARSER.parseFrom(data);
      }

      public static S2C_LongHuTaskNotify_19006 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LongHuTaskNotify_19006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LongHuTaskNotify_19006 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LongHuTaskNotify_19006)PARSER.parseFrom(data);
      }

      public static S2C_LongHuTaskNotify_19006 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LongHuTaskNotify_19006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LongHuTaskNotify_19006 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LongHuTaskNotify_19006)PARSER.parseFrom(data);
      }

      public static S2C_LongHuTaskNotify_19006 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LongHuTaskNotify_19006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LongHuTaskNotify_19006 parseFrom(InputStream input) throws IOException {
         return (S2C_LongHuTaskNotify_19006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LongHuTaskNotify_19006 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LongHuTaskNotify_19006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LongHuTaskNotify_19006 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LongHuTaskNotify_19006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LongHuTaskNotify_19006 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LongHuTaskNotify_19006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LongHuTaskNotify_19006 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LongHuTaskNotify_19006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LongHuTaskNotify_19006 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LongHuTaskNotify_19006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LongHuTaskNotify_19006 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LongHuTaskNotify_19006 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LongHuTaskNotify_19006> parser() {
         return PARSER;
      }

      public Parser<S2C_LongHuTaskNotify_19006> getParserForType() {
         return PARSER;
      }

      public S2C_LongHuTaskNotify_19006 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LongHuTaskNotify_19006OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuTaskNotify_19006_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuTaskNotify_19006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LongHuTaskNotify_19006.class, Builder.class);
         }

         private Builder() {
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LongHuMsg.S2C_LongHuTaskNotify_19006.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuTaskNotify_19006_descriptor;
         }

         public S2C_LongHuTaskNotify_19006 getDefaultInstanceForType() {
            return LongHuMsg.S2C_LongHuTaskNotify_19006.getDefaultInstance();
         }

         public S2C_LongHuTaskNotify_19006 build() {
            S2C_LongHuTaskNotify_19006 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LongHuTaskNotify_19006 buildPartial() {
            S2C_LongHuTaskNotify_19006 result = new S2C_LongHuTaskNotify_19006(this);
            int from_bitField0_ = this.bitField0_;
            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
                  this.bitField0_ &= -2;
               }

               result.task_ = this.task_;
            } else {
               result.task_ = this.taskBuilder_.build();
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
            if (other instanceof S2C_LongHuTaskNotify_19006) {
               return this.mergeFrom((S2C_LongHuTaskNotify_19006)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LongHuTaskNotify_19006 other) {
            if (other == LongHuMsg.S2C_LongHuTaskNotify_19006.getDefaultInstance()) {
               return this;
            } else {
               if (this.taskBuilder_ == null) {
                  if (!other.task_.isEmpty()) {
                     if (this.task_.isEmpty()) {
                        this.task_ = other.task_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTaskIsMutable();
                        this.task_.addAll(other.task_);
                     }

                     this.onChanged();
                  }
               } else if (!other.task_.isEmpty()) {
                  if (this.taskBuilder_.isEmpty()) {
                     this.taskBuilder_.dispose();
                     this.taskBuilder_ = null;
                     this.task_ = other.task_;
                     this.bitField0_ &= -2;
                     this.taskBuilder_ = LongHuMsg.S2C_LongHuTaskNotify_19006.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
                  } else {
                     this.taskBuilder_.addAllMessages(other.task_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LongHuTaskNotify_19006 parsedMessage = null;

            try {
               parsedMessage = (S2C_LongHuTaskNotify_19006)LongHuMsg.S2C_LongHuTaskNotify_19006.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LongHuTaskNotify_19006)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTaskIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.task_ = new ArrayList(this.task_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.Task> getTaskList() {
            return this.taskBuilder_ == null ? Collections.unmodifiableList(this.task_) : this.taskBuilder_.getMessageList();
         }

         public int getTaskCount() {
            return this.taskBuilder_ == null ? this.task_.size() : this.taskBuilder_.getCount();
         }

         public CommonMsg.Task getTask(int index) {
            return this.taskBuilder_ == null ? (CommonMsg.Task)this.task_.get(index) : (CommonMsg.Task)this.taskBuilder_.getMessage(index);
         }

         public Builder setTask(int index, CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.set(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTask(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTask(CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTask(int index, CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTask(CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTask(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTask(Iterable<? extends CommonMsg.Task> values) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.task_);
               this.onChanged();
            } else {
               this.taskBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTask() {
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Builder removeTask(int index) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.remove(index);
               this.onChanged();
            } else {
               this.taskBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.Task.Builder getTaskBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TaskOrBuilder getTaskOrBuilder(int index) {
            return this.taskBuilder_ == null ? (CommonMsg.TaskOrBuilder)this.task_.get(index) : (CommonMsg.TaskOrBuilder)this.taskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList() {
            return this.taskBuilder_ != null ? this.taskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.task_);
         }

         public CommonMsg.Task.Builder addTaskBuilder() {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().addBuilder(CommonMsg.Task.getDefaultInstance());
         }

         public CommonMsg.Task.Builder addTaskBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().addBuilder(index, CommonMsg.Task.getDefaultInstance());
         }

         public List<CommonMsg.Task.Builder> getTaskBuilderList() {
            return this.getTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTaskFieldBuilder() {
            if (this.taskBuilder_ == null) {
               this.taskBuilder_ = new RepeatedFieldBuilderV3(this.task_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.task_ = null;
            }

            return this.taskBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_LongHuTaskCommit_19007 extends GeneratedMessageV3 implements C2S_LongHuTaskCommit_19007OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_LongHuTaskCommit_19007 DEFAULT_INSTANCE = new C2S_LongHuTaskCommit_19007();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LongHuTaskCommit_19007> PARSER = new AbstractParser<C2S_LongHuTaskCommit_19007>() {
         public C2S_LongHuTaskCommit_19007 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LongHuTaskCommit_19007(input, extensionRegistry);
         }
      };

      private C2S_LongHuTaskCommit_19007(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LongHuTaskCommit_19007() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LongHuTaskCommit_19007();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LongHuTaskCommit_19007(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHuTaskCommit_19007_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHuTaskCommit_19007_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LongHuTaskCommit_19007.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LongHuTaskCommit_19007)) {
            return super.equals(obj);
         } else {
            C2S_LongHuTaskCommit_19007 other = (C2S_LongHuTaskCommit_19007)obj;
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

      public static C2S_LongHuTaskCommit_19007 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LongHuTaskCommit_19007)PARSER.parseFrom(data);
      }

      public static C2S_LongHuTaskCommit_19007 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LongHuTaskCommit_19007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LongHuTaskCommit_19007 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LongHuTaskCommit_19007)PARSER.parseFrom(data);
      }

      public static C2S_LongHuTaskCommit_19007 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LongHuTaskCommit_19007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LongHuTaskCommit_19007 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LongHuTaskCommit_19007)PARSER.parseFrom(data);
      }

      public static C2S_LongHuTaskCommit_19007 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LongHuTaskCommit_19007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LongHuTaskCommit_19007 parseFrom(InputStream input) throws IOException {
         return (C2S_LongHuTaskCommit_19007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LongHuTaskCommit_19007 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LongHuTaskCommit_19007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LongHuTaskCommit_19007 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LongHuTaskCommit_19007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LongHuTaskCommit_19007 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LongHuTaskCommit_19007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LongHuTaskCommit_19007 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LongHuTaskCommit_19007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LongHuTaskCommit_19007 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LongHuTaskCommit_19007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LongHuTaskCommit_19007 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LongHuTaskCommit_19007 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LongHuTaskCommit_19007> parser() {
         return PARSER;
      }

      public Parser<C2S_LongHuTaskCommit_19007> getParserForType() {
         return PARSER;
      }

      public C2S_LongHuTaskCommit_19007 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LongHuTaskCommit_19007OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHuTaskCommit_19007_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHuTaskCommit_19007_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LongHuTaskCommit_19007.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LongHuMsg.C2S_LongHuTaskCommit_19007.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHuTaskCommit_19007_descriptor;
         }

         public C2S_LongHuTaskCommit_19007 getDefaultInstanceForType() {
            return LongHuMsg.C2S_LongHuTaskCommit_19007.getDefaultInstance();
         }

         public C2S_LongHuTaskCommit_19007 build() {
            C2S_LongHuTaskCommit_19007 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LongHuTaskCommit_19007 buildPartial() {
            C2S_LongHuTaskCommit_19007 result = new C2S_LongHuTaskCommit_19007(this);
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
            if (other instanceof C2S_LongHuTaskCommit_19007) {
               return this.mergeFrom((C2S_LongHuTaskCommit_19007)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LongHuTaskCommit_19007 other) {
            if (other == LongHuMsg.C2S_LongHuTaskCommit_19007.getDefaultInstance()) {
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
            C2S_LongHuTaskCommit_19007 parsedMessage = null;

            try {
               parsedMessage = (C2S_LongHuTaskCommit_19007)LongHuMsg.C2S_LongHuTaskCommit_19007.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LongHuTaskCommit_19007)e.getUnfinishedMessage();
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

   public static final class S2C_LongHuTaskCommit_19008 extends GeneratedMessageV3 implements S2C_LongHuTaskCommit_19008OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_LongHuTaskCommit_19008 DEFAULT_INSTANCE = new S2C_LongHuTaskCommit_19008();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LongHuTaskCommit_19008> PARSER = new AbstractParser<S2C_LongHuTaskCommit_19008>() {
         public S2C_LongHuTaskCommit_19008 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LongHuTaskCommit_19008(input, extensionRegistry);
         }
      };

      private S2C_LongHuTaskCommit_19008(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LongHuTaskCommit_19008() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LongHuTaskCommit_19008();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LongHuTaskCommit_19008(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuTaskCommit_19008_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuTaskCommit_19008_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LongHuTaskCommit_19008.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LongHuTaskCommit_19008)) {
            return super.equals(obj);
         } else {
            S2C_LongHuTaskCommit_19008 other = (S2C_LongHuTaskCommit_19008)obj;
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

      public static S2C_LongHuTaskCommit_19008 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LongHuTaskCommit_19008)PARSER.parseFrom(data);
      }

      public static S2C_LongHuTaskCommit_19008 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LongHuTaskCommit_19008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LongHuTaskCommit_19008 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LongHuTaskCommit_19008)PARSER.parseFrom(data);
      }

      public static S2C_LongHuTaskCommit_19008 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LongHuTaskCommit_19008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LongHuTaskCommit_19008 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LongHuTaskCommit_19008)PARSER.parseFrom(data);
      }

      public static S2C_LongHuTaskCommit_19008 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LongHuTaskCommit_19008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LongHuTaskCommit_19008 parseFrom(InputStream input) throws IOException {
         return (S2C_LongHuTaskCommit_19008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LongHuTaskCommit_19008 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LongHuTaskCommit_19008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LongHuTaskCommit_19008 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LongHuTaskCommit_19008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LongHuTaskCommit_19008 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LongHuTaskCommit_19008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LongHuTaskCommit_19008 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LongHuTaskCommit_19008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LongHuTaskCommit_19008 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LongHuTaskCommit_19008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LongHuTaskCommit_19008 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LongHuTaskCommit_19008 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LongHuTaskCommit_19008> parser() {
         return PARSER;
      }

      public Parser<S2C_LongHuTaskCommit_19008> getParserForType() {
         return PARSER;
      }

      public S2C_LongHuTaskCommit_19008 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LongHuTaskCommit_19008OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuTaskCommit_19008_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuTaskCommit_19008_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LongHuTaskCommit_19008.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LongHuMsg.S2C_LongHuTaskCommit_19008.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuTaskCommit_19008_descriptor;
         }

         public S2C_LongHuTaskCommit_19008 getDefaultInstanceForType() {
            return LongHuMsg.S2C_LongHuTaskCommit_19008.getDefaultInstance();
         }

         public S2C_LongHuTaskCommit_19008 build() {
            S2C_LongHuTaskCommit_19008 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LongHuTaskCommit_19008 buildPartial() {
            S2C_LongHuTaskCommit_19008 result = new S2C_LongHuTaskCommit_19008(this);
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
            if (other instanceof S2C_LongHuTaskCommit_19008) {
               return this.mergeFrom((S2C_LongHuTaskCommit_19008)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LongHuTaskCommit_19008 other) {
            if (other == LongHuMsg.S2C_LongHuTaskCommit_19008.getDefaultInstance()) {
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
            S2C_LongHuTaskCommit_19008 parsedMessage = null;

            try {
               parsedMessage = (S2C_LongHuTaskCommit_19008)LongHuMsg.S2C_LongHuTaskCommit_19008.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LongHuTaskCommit_19008)e.getUnfinishedMessage();
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

   public static final class C2S_LongHuBuyIntegral_19009 extends GeneratedMessageV3 implements C2S_LongHuBuyIntegral_19009OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_LongHuBuyIntegral_19009 DEFAULT_INSTANCE = new C2S_LongHuBuyIntegral_19009();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LongHuBuyIntegral_19009> PARSER = new AbstractParser<C2S_LongHuBuyIntegral_19009>() {
         public C2S_LongHuBuyIntegral_19009 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LongHuBuyIntegral_19009(input, extensionRegistry);
         }
      };

      private C2S_LongHuBuyIntegral_19009(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LongHuBuyIntegral_19009() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LongHuBuyIntegral_19009();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LongHuBuyIntegral_19009(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.num_ = input.readInt32();
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
         return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHuBuyIntegral_19009_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHuBuyIntegral_19009_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LongHuBuyIntegral_19009.class, Builder.class);
      }

      public boolean hasNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.num_);
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
               size += CodedOutputStream.computeInt32Size(1, this.num_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LongHuBuyIntegral_19009)) {
            return super.equals(obj);
         } else {
            C2S_LongHuBuyIntegral_19009 other = (C2S_LongHuBuyIntegral_19009)obj;
            if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
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
            if (this.hasNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LongHuBuyIntegral_19009 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LongHuBuyIntegral_19009)PARSER.parseFrom(data);
      }

      public static C2S_LongHuBuyIntegral_19009 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LongHuBuyIntegral_19009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LongHuBuyIntegral_19009 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LongHuBuyIntegral_19009)PARSER.parseFrom(data);
      }

      public static C2S_LongHuBuyIntegral_19009 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LongHuBuyIntegral_19009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LongHuBuyIntegral_19009 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LongHuBuyIntegral_19009)PARSER.parseFrom(data);
      }

      public static C2S_LongHuBuyIntegral_19009 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LongHuBuyIntegral_19009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LongHuBuyIntegral_19009 parseFrom(InputStream input) throws IOException {
         return (C2S_LongHuBuyIntegral_19009)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LongHuBuyIntegral_19009 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LongHuBuyIntegral_19009)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LongHuBuyIntegral_19009 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LongHuBuyIntegral_19009)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LongHuBuyIntegral_19009 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LongHuBuyIntegral_19009)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LongHuBuyIntegral_19009 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LongHuBuyIntegral_19009)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LongHuBuyIntegral_19009 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LongHuBuyIntegral_19009)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LongHuBuyIntegral_19009 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LongHuBuyIntegral_19009 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LongHuBuyIntegral_19009> parser() {
         return PARSER;
      }

      public Parser<C2S_LongHuBuyIntegral_19009> getParserForType() {
         return PARSER;
      }

      public C2S_LongHuBuyIntegral_19009 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LongHuBuyIntegral_19009OrBuilder {
         private int bitField0_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHuBuyIntegral_19009_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHuBuyIntegral_19009_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LongHuBuyIntegral_19009.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LongHuMsg.C2S_LongHuBuyIntegral_19009.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHuBuyIntegral_19009_descriptor;
         }

         public C2S_LongHuBuyIntegral_19009 getDefaultInstanceForType() {
            return LongHuMsg.C2S_LongHuBuyIntegral_19009.getDefaultInstance();
         }

         public C2S_LongHuBuyIntegral_19009 build() {
            C2S_LongHuBuyIntegral_19009 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LongHuBuyIntegral_19009 buildPartial() {
            C2S_LongHuBuyIntegral_19009 result = new C2S_LongHuBuyIntegral_19009(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.num_ = this.num_;
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
            if (other instanceof C2S_LongHuBuyIntegral_19009) {
               return this.mergeFrom((C2S_LongHuBuyIntegral_19009)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LongHuBuyIntegral_19009 other) {
            if (other == LongHuMsg.C2S_LongHuBuyIntegral_19009.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_LongHuBuyIntegral_19009 parsedMessage = null;

            try {
               parsedMessage = (C2S_LongHuBuyIntegral_19009)LongHuMsg.C2S_LongHuBuyIntegral_19009.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LongHuBuyIntegral_19009)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 1;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -2;
            this.num_ = 0;
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

   public static final class S2C_LongHuBuyIntegral_19010 extends GeneratedMessageV3 implements S2C_LongHuBuyIntegral_19010OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      public static final int ALREADYBUY_FIELD_NUMBER = 2;
      private int alreadyBuy_;
      private byte memoizedIsInitialized;
      private static final S2C_LongHuBuyIntegral_19010 DEFAULT_INSTANCE = new S2C_LongHuBuyIntegral_19010();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LongHuBuyIntegral_19010> PARSER = new AbstractParser<S2C_LongHuBuyIntegral_19010>() {
         public S2C_LongHuBuyIntegral_19010 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LongHuBuyIntegral_19010(input, extensionRegistry);
         }
      };

      private S2C_LongHuBuyIntegral_19010(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LongHuBuyIntegral_19010() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LongHuBuyIntegral_19010();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LongHuBuyIntegral_19010(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.num_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.alreadyBuy_ = input.readInt32();
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
         return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuBuyIntegral_19010_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuBuyIntegral_19010_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LongHuBuyIntegral_19010.class, Builder.class);
      }

      public boolean hasNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public boolean hasAlreadyBuy() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getAlreadyBuy() {
         return this.alreadyBuy_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAlreadyBuy()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.num_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.alreadyBuy_);
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
               size += CodedOutputStream.computeInt32Size(1, this.num_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.alreadyBuy_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LongHuBuyIntegral_19010)) {
            return super.equals(obj);
         } else {
            S2C_LongHuBuyIntegral_19010 other = (S2C_LongHuBuyIntegral_19010)obj;
            if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
               return false;
            } else if (this.hasAlreadyBuy() != other.hasAlreadyBuy()) {
               return false;
            } else if (this.hasAlreadyBuy() && this.getAlreadyBuy() != other.getAlreadyBuy()) {
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
            if (this.hasNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getNum();
            }

            if (this.hasAlreadyBuy()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAlreadyBuy();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LongHuBuyIntegral_19010 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LongHuBuyIntegral_19010)PARSER.parseFrom(data);
      }

      public static S2C_LongHuBuyIntegral_19010 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LongHuBuyIntegral_19010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LongHuBuyIntegral_19010 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LongHuBuyIntegral_19010)PARSER.parseFrom(data);
      }

      public static S2C_LongHuBuyIntegral_19010 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LongHuBuyIntegral_19010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LongHuBuyIntegral_19010 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LongHuBuyIntegral_19010)PARSER.parseFrom(data);
      }

      public static S2C_LongHuBuyIntegral_19010 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LongHuBuyIntegral_19010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LongHuBuyIntegral_19010 parseFrom(InputStream input) throws IOException {
         return (S2C_LongHuBuyIntegral_19010)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LongHuBuyIntegral_19010 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LongHuBuyIntegral_19010)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LongHuBuyIntegral_19010 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LongHuBuyIntegral_19010)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LongHuBuyIntegral_19010 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LongHuBuyIntegral_19010)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LongHuBuyIntegral_19010 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LongHuBuyIntegral_19010)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LongHuBuyIntegral_19010 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LongHuBuyIntegral_19010)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LongHuBuyIntegral_19010 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LongHuBuyIntegral_19010 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LongHuBuyIntegral_19010> parser() {
         return PARSER;
      }

      public Parser<S2C_LongHuBuyIntegral_19010> getParserForType() {
         return PARSER;
      }

      public S2C_LongHuBuyIntegral_19010 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LongHuBuyIntegral_19010OrBuilder {
         private int bitField0_;
         private int num_;
         private int alreadyBuy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuBuyIntegral_19010_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuBuyIntegral_19010_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LongHuBuyIntegral_19010.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LongHuMsg.S2C_LongHuBuyIntegral_19010.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            this.alreadyBuy_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHuBuyIntegral_19010_descriptor;
         }

         public S2C_LongHuBuyIntegral_19010 getDefaultInstanceForType() {
            return LongHuMsg.S2C_LongHuBuyIntegral_19010.getDefaultInstance();
         }

         public S2C_LongHuBuyIntegral_19010 build() {
            S2C_LongHuBuyIntegral_19010 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LongHuBuyIntegral_19010 buildPartial() {
            S2C_LongHuBuyIntegral_19010 result = new S2C_LongHuBuyIntegral_19010(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.num_ = this.num_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.alreadyBuy_ = this.alreadyBuy_;
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
            if (other instanceof S2C_LongHuBuyIntegral_19010) {
               return this.mergeFrom((S2C_LongHuBuyIntegral_19010)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LongHuBuyIntegral_19010 other) {
            if (other == LongHuMsg.S2C_LongHuBuyIntegral_19010.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               if (other.hasAlreadyBuy()) {
                  this.setAlreadyBuy(other.getAlreadyBuy());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasNum()) {
               return false;
            } else {
               return this.hasAlreadyBuy();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LongHuBuyIntegral_19010 parsedMessage = null;

            try {
               parsedMessage = (S2C_LongHuBuyIntegral_19010)LongHuMsg.S2C_LongHuBuyIntegral_19010.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LongHuBuyIntegral_19010)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 1;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAlreadyBuy() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getAlreadyBuy() {
            return this.alreadyBuy_;
         }

         public Builder setAlreadyBuy(int value) {
            this.bitField0_ |= 2;
            this.alreadyBuy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAlreadyBuy() {
            this.bitField0_ &= -3;
            this.alreadyBuy_ = 0;
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

   public static final class C2S_LongHu_19021 extends GeneratedMessageV3 implements C2S_LongHu_19021OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LongHu_19021 DEFAULT_INSTANCE = new C2S_LongHu_19021();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LongHu_19021> PARSER = new AbstractParser<C2S_LongHu_19021>() {
         public C2S_LongHu_19021 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LongHu_19021(input, extensionRegistry);
         }
      };

      private C2S_LongHu_19021(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LongHu_19021() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LongHu_19021();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LongHu_19021(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHu_19021_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHu_19021_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LongHu_19021.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LongHu_19021)) {
            return super.equals(obj);
         } else {
            C2S_LongHu_19021 other = (C2S_LongHu_19021)obj;
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

      public static C2S_LongHu_19021 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LongHu_19021)PARSER.parseFrom(data);
      }

      public static C2S_LongHu_19021 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LongHu_19021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LongHu_19021 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LongHu_19021)PARSER.parseFrom(data);
      }

      public static C2S_LongHu_19021 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LongHu_19021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LongHu_19021 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LongHu_19021)PARSER.parseFrom(data);
      }

      public static C2S_LongHu_19021 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LongHu_19021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LongHu_19021 parseFrom(InputStream input) throws IOException {
         return (C2S_LongHu_19021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LongHu_19021 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LongHu_19021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LongHu_19021 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LongHu_19021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LongHu_19021 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LongHu_19021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LongHu_19021 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LongHu_19021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LongHu_19021 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LongHu_19021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LongHu_19021 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LongHu_19021 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LongHu_19021> parser() {
         return PARSER;
      }

      public Parser<C2S_LongHu_19021> getParserForType() {
         return PARSER;
      }

      public C2S_LongHu_19021 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LongHu_19021OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHu_19021_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHu_19021_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LongHu_19021.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LongHuMsg.C2S_LongHu_19021.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_C2S_LongHu_19021_descriptor;
         }

         public C2S_LongHu_19021 getDefaultInstanceForType() {
            return LongHuMsg.C2S_LongHu_19021.getDefaultInstance();
         }

         public C2S_LongHu_19021 build() {
            C2S_LongHu_19021 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LongHu_19021 buildPartial() {
            C2S_LongHu_19021 result = new C2S_LongHu_19021(this);
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
            if (other instanceof C2S_LongHu_19021) {
               return this.mergeFrom((C2S_LongHu_19021)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LongHu_19021 other) {
            if (other == LongHuMsg.C2S_LongHu_19021.getDefaultInstance()) {
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
            C2S_LongHu_19021 parsedMessage = null;

            try {
               parsedMessage = (C2S_LongHu_19021)LongHuMsg.C2S_LongHu_19021.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LongHu_19021)e.getUnfinishedMessage();
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

   public static final class S2C_LongHu_19022 extends GeneratedMessageV3 implements S2C_LongHu_19022OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STARTTIME_FIELD_NUMBER = 1;
      private int startTime_;
      public static final int ENDTIME_FIELD_NUMBER = 2;
      private int endTime_;
      public static final int DROPTIME_FIELD_NUMBER = 3;
      private int dropTime_;
      private byte memoizedIsInitialized;
      private static final S2C_LongHu_19022 DEFAULT_INSTANCE = new S2C_LongHu_19022();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LongHu_19022> PARSER = new AbstractParser<S2C_LongHu_19022>() {
         public S2C_LongHu_19022 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LongHu_19022(input, extensionRegistry);
         }
      };

      private S2C_LongHu_19022(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LongHu_19022() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LongHu_19022();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LongHu_19022(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.startTime_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.endTime_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.dropTime_ = input.readInt32();
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
         return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHu_19022_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHu_19022_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LongHu_19022.class, Builder.class);
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public boolean hasDropTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getDropTime() {
         return this.dropTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStartTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDropTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.startTime_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.endTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.dropTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.startTime_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.endTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.dropTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LongHu_19022)) {
            return super.equals(obj);
         } else {
            S2C_LongHu_19022 other = (S2C_LongHu_19022)obj;
            if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasDropTime() != other.hasDropTime()) {
               return false;
            } else if (this.hasDropTime() && this.getDropTime() != other.getDropTime()) {
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
            if (this.hasStartTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStartTime();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.hasDropTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getDropTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LongHu_19022 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LongHu_19022)PARSER.parseFrom(data);
      }

      public static S2C_LongHu_19022 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LongHu_19022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LongHu_19022 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LongHu_19022)PARSER.parseFrom(data);
      }

      public static S2C_LongHu_19022 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LongHu_19022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LongHu_19022 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LongHu_19022)PARSER.parseFrom(data);
      }

      public static S2C_LongHu_19022 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LongHu_19022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LongHu_19022 parseFrom(InputStream input) throws IOException {
         return (S2C_LongHu_19022)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LongHu_19022 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LongHu_19022)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LongHu_19022 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LongHu_19022)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LongHu_19022 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LongHu_19022)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LongHu_19022 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LongHu_19022)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LongHu_19022 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LongHu_19022)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LongHu_19022 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LongHu_19022 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LongHu_19022> parser() {
         return PARSER;
      }

      public Parser<S2C_LongHu_19022> getParserForType() {
         return PARSER;
      }

      public S2C_LongHu_19022 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LongHu_19022OrBuilder {
         private int bitField0_;
         private int startTime_;
         private int endTime_;
         private int dropTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHu_19022_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHu_19022_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LongHu_19022.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LongHuMsg.S2C_LongHu_19022.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.startTime_ = 0;
            this.bitField0_ &= -2;
            this.endTime_ = 0;
            this.bitField0_ &= -3;
            this.dropTime_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LongHuMsg.internal_static_longHu_com_gzbz_protobuf_S2C_LongHu_19022_descriptor;
         }

         public S2C_LongHu_19022 getDefaultInstanceForType() {
            return LongHuMsg.S2C_LongHu_19022.getDefaultInstance();
         }

         public S2C_LongHu_19022 build() {
            S2C_LongHu_19022 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LongHu_19022 buildPartial() {
            S2C_LongHu_19022 result = new S2C_LongHu_19022(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.dropTime_ = this.dropTime_;
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
            if (other instanceof S2C_LongHu_19022) {
               return this.mergeFrom((S2C_LongHu_19022)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LongHu_19022 other) {
            if (other == LongHuMsg.S2C_LongHu_19022.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasDropTime()) {
                  this.setDropTime(other.getDropTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStartTime()) {
               return false;
            } else if (!this.hasEndTime()) {
               return false;
            } else {
               return this.hasDropTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LongHu_19022 parsedMessage = null;

            try {
               parsedMessage = (S2C_LongHu_19022)LongHuMsg.S2C_LongHu_19022.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LongHu_19022)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStartTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(int value) {
            this.bitField0_ |= 1;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -2;
            this.startTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 2;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -3;
            this.endTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDropTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getDropTime() {
            return this.dropTime_;
         }

         public Builder setDropTime(int value) {
            this.bitField0_ |= 4;
            this.dropTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDropTime() {
            this.bitField0_ &= -5;
            this.dropTime_ = 0;
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

   public interface C2S_LongHuBuyIntegral_19009OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();
   }

   public interface C2S_LongHuDailyTask_19001OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LongHuLiYuTask_19003OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LongHuTaskCommit_19007OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_LongHu_19021OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_LongHuBuyIntegral_19010OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();

      boolean hasAlreadyBuy();

      int getAlreadyBuy();
   }

   public interface S2C_LongHuDailyTask_19002OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);

      boolean hasActDay();

      int getActDay();

      boolean hasAlreadyBuy();

      int getAlreadyBuy();
   }

   public interface S2C_LongHuLiYuTask_19004OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_LongHuTaskCommit_19008OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_LongHuTaskNotify_19006OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_LongHu_19022OrBuilder extends MessageOrBuilder {
      boolean hasStartTime();

      int getStartTime();

      boolean hasEndTime();

      int getEndTime();

      boolean hasDropTime();

      int getDropTime();
   }
}
