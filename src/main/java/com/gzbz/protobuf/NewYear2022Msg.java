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

public final class NewYear2022Msg {
   private static final Descriptors.Descriptor internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearDailyTask_18001_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearDailyTask_18001_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearDailyTask_18002_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearDailyTask_18002_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearLiYuTask_18003_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearLiYuTask_18003_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearLiYuTask_18004_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearLiYuTask_18004_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearTaskNotify_18006_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearTaskNotify_18006_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearTaskCommit_18007_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearTaskCommit_18007_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearTaskCommit_18008_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearTaskCommit_18008_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearBuyIntegral_18009_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearBuyIntegral_18009_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearBuyIntegral_18010_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearBuyIntegral_18010_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private NewYear2022Msg() {
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
      String[] descriptorData = new String[]{"\n\u0011NewYear2022.proto\u0012\u001dnewYear2022.com.gzbz.protobuf\u001a\fcommon.proto\"\u001c\n\u001aC2S_NewYearDailyTask_18001\"\\\n\u001aS2C_NewYearDailyTask_18002\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\u0012\u000e\n\u0006actDay\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nalreadyBuy\u0018\u0003 \u0002(\u0005\"\u001b\n\u0019C2S_NewYearLiYuTask_18003\"7\n\u0019S2C_NewYearLiYuTask_18004\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\"9\n\u001bS2C_NewYearTaskNotify_18006\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\"-\n\u001bC2S_NewYearTaskCommit_18007\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"-\n\u001bS2C_NewYearTaskCommit_18008\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"+\n\u001cC2S_NewYearBuyIntegral_18009\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\"?\n\u001cS2C_NewYearBuyIntegral_18010\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nalreadyBuy\u0018\u0002 \u0002(\u0005B%\n\u0011com.gzbz.protobufB\u000eNewYear2022MsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearDailyTask_18001_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearDailyTask_18001_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearDailyTask_18001_descriptor, new String[0]);
      internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearDailyTask_18002_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearDailyTask_18002_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearDailyTask_18002_descriptor, new String[]{"Task", "ActDay", "AlreadyBuy"});
      internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearLiYuTask_18003_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearLiYuTask_18003_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearLiYuTask_18003_descriptor, new String[0]);
      internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearLiYuTask_18004_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearLiYuTask_18004_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearLiYuTask_18004_descriptor, new String[]{"Task"});
      internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearTaskNotify_18006_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearTaskNotify_18006_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearTaskNotify_18006_descriptor, new String[]{"Task"});
      internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearTaskCommit_18007_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearTaskCommit_18007_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearTaskCommit_18007_descriptor, new String[]{"TaskId"});
      internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearTaskCommit_18008_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearTaskCommit_18008_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearTaskCommit_18008_descriptor, new String[]{"TaskId"});
      internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearBuyIntegral_18009_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearBuyIntegral_18009_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearBuyIntegral_18009_descriptor, new String[]{"Num"});
      internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearBuyIntegral_18010_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearBuyIntegral_18010_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearBuyIntegral_18010_descriptor, new String[]{"Num", "AlreadyBuy"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_NewYearDailyTask_18001 extends GeneratedMessageV3 implements C2S_NewYearDailyTask_18001OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_NewYearDailyTask_18001 DEFAULT_INSTANCE = new C2S_NewYearDailyTask_18001();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_NewYearDailyTask_18001> PARSER = new AbstractParser<C2S_NewYearDailyTask_18001>() {
         public C2S_NewYearDailyTask_18001 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_NewYearDailyTask_18001(input, extensionRegistry);
         }
      };

      private C2S_NewYearDailyTask_18001(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_NewYearDailyTask_18001() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_NewYearDailyTask_18001();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_NewYearDailyTask_18001(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearDailyTask_18001_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearDailyTask_18001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NewYearDailyTask_18001.class, Builder.class);
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
         } else if (!(obj instanceof C2S_NewYearDailyTask_18001)) {
            return super.equals(obj);
         } else {
            C2S_NewYearDailyTask_18001 other = (C2S_NewYearDailyTask_18001)obj;
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

      public static C2S_NewYearDailyTask_18001 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_NewYearDailyTask_18001)PARSER.parseFrom(data);
      }

      public static C2S_NewYearDailyTask_18001 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NewYearDailyTask_18001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NewYearDailyTask_18001 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_NewYearDailyTask_18001)PARSER.parseFrom(data);
      }

      public static C2S_NewYearDailyTask_18001 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NewYearDailyTask_18001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NewYearDailyTask_18001 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_NewYearDailyTask_18001)PARSER.parseFrom(data);
      }

      public static C2S_NewYearDailyTask_18001 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NewYearDailyTask_18001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NewYearDailyTask_18001 parseFrom(InputStream input) throws IOException {
         return (C2S_NewYearDailyTask_18001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NewYearDailyTask_18001 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NewYearDailyTask_18001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NewYearDailyTask_18001 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_NewYearDailyTask_18001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_NewYearDailyTask_18001 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NewYearDailyTask_18001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NewYearDailyTask_18001 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_NewYearDailyTask_18001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NewYearDailyTask_18001 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NewYearDailyTask_18001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_NewYearDailyTask_18001 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_NewYearDailyTask_18001 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_NewYearDailyTask_18001> parser() {
         return PARSER;
      }

      public Parser<C2S_NewYearDailyTask_18001> getParserForType() {
         return PARSER;
      }

      public C2S_NewYearDailyTask_18001 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_NewYearDailyTask_18001OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearDailyTask_18001_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearDailyTask_18001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NewYearDailyTask_18001.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NewYear2022Msg.C2S_NewYearDailyTask_18001.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearDailyTask_18001_descriptor;
         }

         public C2S_NewYearDailyTask_18001 getDefaultInstanceForType() {
            return NewYear2022Msg.C2S_NewYearDailyTask_18001.getDefaultInstance();
         }

         public C2S_NewYearDailyTask_18001 build() {
            C2S_NewYearDailyTask_18001 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_NewYearDailyTask_18001 buildPartial() {
            C2S_NewYearDailyTask_18001 result = new C2S_NewYearDailyTask_18001(this);
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
            if (other instanceof C2S_NewYearDailyTask_18001) {
               return this.mergeFrom((C2S_NewYearDailyTask_18001)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_NewYearDailyTask_18001 other) {
            if (other == NewYear2022Msg.C2S_NewYearDailyTask_18001.getDefaultInstance()) {
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
            C2S_NewYearDailyTask_18001 parsedMessage = null;

            try {
               parsedMessage = (C2S_NewYearDailyTask_18001)NewYear2022Msg.C2S_NewYearDailyTask_18001.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_NewYearDailyTask_18001)e.getUnfinishedMessage();
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

   public static final class S2C_NewYearDailyTask_18002 extends GeneratedMessageV3 implements S2C_NewYearDailyTask_18002OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      public static final int ACTDAY_FIELD_NUMBER = 2;
      private int actDay_;
      public static final int ALREADYBUY_FIELD_NUMBER = 3;
      private int alreadyBuy_;
      private byte memoizedIsInitialized;
      private static final S2C_NewYearDailyTask_18002 DEFAULT_INSTANCE = new S2C_NewYearDailyTask_18002();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NewYearDailyTask_18002> PARSER = new AbstractParser<S2C_NewYearDailyTask_18002>() {
         public S2C_NewYearDailyTask_18002 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NewYearDailyTask_18002(input, extensionRegistry);
         }
      };

      private S2C_NewYearDailyTask_18002(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NewYearDailyTask_18002() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NewYearDailyTask_18002();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NewYearDailyTask_18002(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearDailyTask_18002_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearDailyTask_18002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NewYearDailyTask_18002.class, Builder.class);
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
         } else if (!(obj instanceof S2C_NewYearDailyTask_18002)) {
            return super.equals(obj);
         } else {
            S2C_NewYearDailyTask_18002 other = (S2C_NewYearDailyTask_18002)obj;
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

      public static S2C_NewYearDailyTask_18002 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NewYearDailyTask_18002)PARSER.parseFrom(data);
      }

      public static S2C_NewYearDailyTask_18002 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewYearDailyTask_18002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewYearDailyTask_18002 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NewYearDailyTask_18002)PARSER.parseFrom(data);
      }

      public static S2C_NewYearDailyTask_18002 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewYearDailyTask_18002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewYearDailyTask_18002 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NewYearDailyTask_18002)PARSER.parseFrom(data);
      }

      public static S2C_NewYearDailyTask_18002 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewYearDailyTask_18002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewYearDailyTask_18002 parseFrom(InputStream input) throws IOException {
         return (S2C_NewYearDailyTask_18002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NewYearDailyTask_18002 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewYearDailyTask_18002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NewYearDailyTask_18002 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NewYearDailyTask_18002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NewYearDailyTask_18002 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewYearDailyTask_18002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NewYearDailyTask_18002 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NewYearDailyTask_18002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NewYearDailyTask_18002 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewYearDailyTask_18002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NewYearDailyTask_18002 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NewYearDailyTask_18002 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NewYearDailyTask_18002> parser() {
         return PARSER;
      }

      public Parser<S2C_NewYearDailyTask_18002> getParserForType() {
         return PARSER;
      }

      public S2C_NewYearDailyTask_18002 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NewYearDailyTask_18002OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;
         private int actDay_;
         private int alreadyBuy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearDailyTask_18002_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearDailyTask_18002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NewYearDailyTask_18002.class, Builder.class);
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
            if (NewYear2022Msg.S2C_NewYearDailyTask_18002.alwaysUseFieldBuilders) {
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
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearDailyTask_18002_descriptor;
         }

         public S2C_NewYearDailyTask_18002 getDefaultInstanceForType() {
            return NewYear2022Msg.S2C_NewYearDailyTask_18002.getDefaultInstance();
         }

         public S2C_NewYearDailyTask_18002 build() {
            S2C_NewYearDailyTask_18002 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NewYearDailyTask_18002 buildPartial() {
            S2C_NewYearDailyTask_18002 result = new S2C_NewYearDailyTask_18002(this);
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
            if (other instanceof S2C_NewYearDailyTask_18002) {
               return this.mergeFrom((S2C_NewYearDailyTask_18002)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NewYearDailyTask_18002 other) {
            if (other == NewYear2022Msg.S2C_NewYearDailyTask_18002.getDefaultInstance()) {
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
                     this.taskBuilder_ = NewYear2022Msg.S2C_NewYearDailyTask_18002.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_NewYearDailyTask_18002 parsedMessage = null;

            try {
               parsedMessage = (S2C_NewYearDailyTask_18002)NewYear2022Msg.S2C_NewYearDailyTask_18002.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NewYearDailyTask_18002)e.getUnfinishedMessage();
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

   public static final class C2S_NewYearLiYuTask_18003 extends GeneratedMessageV3 implements C2S_NewYearLiYuTask_18003OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_NewYearLiYuTask_18003 DEFAULT_INSTANCE = new C2S_NewYearLiYuTask_18003();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_NewYearLiYuTask_18003> PARSER = new AbstractParser<C2S_NewYearLiYuTask_18003>() {
         public C2S_NewYearLiYuTask_18003 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_NewYearLiYuTask_18003(input, extensionRegistry);
         }
      };

      private C2S_NewYearLiYuTask_18003(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_NewYearLiYuTask_18003() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_NewYearLiYuTask_18003();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_NewYearLiYuTask_18003(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearLiYuTask_18003_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearLiYuTask_18003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NewYearLiYuTask_18003.class, Builder.class);
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
         } else if (!(obj instanceof C2S_NewYearLiYuTask_18003)) {
            return super.equals(obj);
         } else {
            C2S_NewYearLiYuTask_18003 other = (C2S_NewYearLiYuTask_18003)obj;
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

      public static C2S_NewYearLiYuTask_18003 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_NewYearLiYuTask_18003)PARSER.parseFrom(data);
      }

      public static C2S_NewYearLiYuTask_18003 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NewYearLiYuTask_18003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NewYearLiYuTask_18003 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_NewYearLiYuTask_18003)PARSER.parseFrom(data);
      }

      public static C2S_NewYearLiYuTask_18003 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NewYearLiYuTask_18003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NewYearLiYuTask_18003 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_NewYearLiYuTask_18003)PARSER.parseFrom(data);
      }

      public static C2S_NewYearLiYuTask_18003 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NewYearLiYuTask_18003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NewYearLiYuTask_18003 parseFrom(InputStream input) throws IOException {
         return (C2S_NewYearLiYuTask_18003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NewYearLiYuTask_18003 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NewYearLiYuTask_18003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NewYearLiYuTask_18003 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_NewYearLiYuTask_18003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_NewYearLiYuTask_18003 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NewYearLiYuTask_18003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NewYearLiYuTask_18003 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_NewYearLiYuTask_18003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NewYearLiYuTask_18003 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NewYearLiYuTask_18003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_NewYearLiYuTask_18003 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_NewYearLiYuTask_18003 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_NewYearLiYuTask_18003> parser() {
         return PARSER;
      }

      public Parser<C2S_NewYearLiYuTask_18003> getParserForType() {
         return PARSER;
      }

      public C2S_NewYearLiYuTask_18003 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_NewYearLiYuTask_18003OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearLiYuTask_18003_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearLiYuTask_18003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NewYearLiYuTask_18003.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NewYear2022Msg.C2S_NewYearLiYuTask_18003.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearLiYuTask_18003_descriptor;
         }

         public C2S_NewYearLiYuTask_18003 getDefaultInstanceForType() {
            return NewYear2022Msg.C2S_NewYearLiYuTask_18003.getDefaultInstance();
         }

         public C2S_NewYearLiYuTask_18003 build() {
            C2S_NewYearLiYuTask_18003 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_NewYearLiYuTask_18003 buildPartial() {
            C2S_NewYearLiYuTask_18003 result = new C2S_NewYearLiYuTask_18003(this);
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
            if (other instanceof C2S_NewYearLiYuTask_18003) {
               return this.mergeFrom((C2S_NewYearLiYuTask_18003)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_NewYearLiYuTask_18003 other) {
            if (other == NewYear2022Msg.C2S_NewYearLiYuTask_18003.getDefaultInstance()) {
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
            C2S_NewYearLiYuTask_18003 parsedMessage = null;

            try {
               parsedMessage = (C2S_NewYearLiYuTask_18003)NewYear2022Msg.C2S_NewYearLiYuTask_18003.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_NewYearLiYuTask_18003)e.getUnfinishedMessage();
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

   public static final class S2C_NewYearLiYuTask_18004 extends GeneratedMessageV3 implements S2C_NewYearLiYuTask_18004OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_NewYearLiYuTask_18004 DEFAULT_INSTANCE = new S2C_NewYearLiYuTask_18004();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NewYearLiYuTask_18004> PARSER = new AbstractParser<S2C_NewYearLiYuTask_18004>() {
         public S2C_NewYearLiYuTask_18004 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NewYearLiYuTask_18004(input, extensionRegistry);
         }
      };

      private S2C_NewYearLiYuTask_18004(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NewYearLiYuTask_18004() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NewYearLiYuTask_18004();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NewYearLiYuTask_18004(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearLiYuTask_18004_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearLiYuTask_18004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NewYearLiYuTask_18004.class, Builder.class);
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
         } else if (!(obj instanceof S2C_NewYearLiYuTask_18004)) {
            return super.equals(obj);
         } else {
            S2C_NewYearLiYuTask_18004 other = (S2C_NewYearLiYuTask_18004)obj;
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

      public static S2C_NewYearLiYuTask_18004 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NewYearLiYuTask_18004)PARSER.parseFrom(data);
      }

      public static S2C_NewYearLiYuTask_18004 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewYearLiYuTask_18004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewYearLiYuTask_18004 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NewYearLiYuTask_18004)PARSER.parseFrom(data);
      }

      public static S2C_NewYearLiYuTask_18004 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewYearLiYuTask_18004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewYearLiYuTask_18004 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NewYearLiYuTask_18004)PARSER.parseFrom(data);
      }

      public static S2C_NewYearLiYuTask_18004 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewYearLiYuTask_18004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewYearLiYuTask_18004 parseFrom(InputStream input) throws IOException {
         return (S2C_NewYearLiYuTask_18004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NewYearLiYuTask_18004 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewYearLiYuTask_18004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NewYearLiYuTask_18004 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NewYearLiYuTask_18004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NewYearLiYuTask_18004 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewYearLiYuTask_18004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NewYearLiYuTask_18004 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NewYearLiYuTask_18004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NewYearLiYuTask_18004 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewYearLiYuTask_18004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NewYearLiYuTask_18004 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NewYearLiYuTask_18004 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NewYearLiYuTask_18004> parser() {
         return PARSER;
      }

      public Parser<S2C_NewYearLiYuTask_18004> getParserForType() {
         return PARSER;
      }

      public S2C_NewYearLiYuTask_18004 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NewYearLiYuTask_18004OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearLiYuTask_18004_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearLiYuTask_18004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NewYearLiYuTask_18004.class, Builder.class);
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
            if (NewYear2022Msg.S2C_NewYearLiYuTask_18004.alwaysUseFieldBuilders) {
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
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearLiYuTask_18004_descriptor;
         }

         public S2C_NewYearLiYuTask_18004 getDefaultInstanceForType() {
            return NewYear2022Msg.S2C_NewYearLiYuTask_18004.getDefaultInstance();
         }

         public S2C_NewYearLiYuTask_18004 build() {
            S2C_NewYearLiYuTask_18004 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NewYearLiYuTask_18004 buildPartial() {
            S2C_NewYearLiYuTask_18004 result = new S2C_NewYearLiYuTask_18004(this);
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
            if (other instanceof S2C_NewYearLiYuTask_18004) {
               return this.mergeFrom((S2C_NewYearLiYuTask_18004)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NewYearLiYuTask_18004 other) {
            if (other == NewYear2022Msg.S2C_NewYearLiYuTask_18004.getDefaultInstance()) {
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
                     this.taskBuilder_ = NewYear2022Msg.S2C_NewYearLiYuTask_18004.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_NewYearLiYuTask_18004 parsedMessage = null;

            try {
               parsedMessage = (S2C_NewYearLiYuTask_18004)NewYear2022Msg.S2C_NewYearLiYuTask_18004.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NewYearLiYuTask_18004)e.getUnfinishedMessage();
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

   public static final class S2C_NewYearTaskNotify_18006 extends GeneratedMessageV3 implements S2C_NewYearTaskNotify_18006OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_NewYearTaskNotify_18006 DEFAULT_INSTANCE = new S2C_NewYearTaskNotify_18006();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NewYearTaskNotify_18006> PARSER = new AbstractParser<S2C_NewYearTaskNotify_18006>() {
         public S2C_NewYearTaskNotify_18006 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NewYearTaskNotify_18006(input, extensionRegistry);
         }
      };

      private S2C_NewYearTaskNotify_18006(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NewYearTaskNotify_18006() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NewYearTaskNotify_18006();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NewYearTaskNotify_18006(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearTaskNotify_18006_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearTaskNotify_18006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NewYearTaskNotify_18006.class, Builder.class);
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
         } else if (!(obj instanceof S2C_NewYearTaskNotify_18006)) {
            return super.equals(obj);
         } else {
            S2C_NewYearTaskNotify_18006 other = (S2C_NewYearTaskNotify_18006)obj;
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

      public static S2C_NewYearTaskNotify_18006 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NewYearTaskNotify_18006)PARSER.parseFrom(data);
      }

      public static S2C_NewYearTaskNotify_18006 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewYearTaskNotify_18006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewYearTaskNotify_18006 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NewYearTaskNotify_18006)PARSER.parseFrom(data);
      }

      public static S2C_NewYearTaskNotify_18006 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewYearTaskNotify_18006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewYearTaskNotify_18006 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NewYearTaskNotify_18006)PARSER.parseFrom(data);
      }

      public static S2C_NewYearTaskNotify_18006 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewYearTaskNotify_18006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewYearTaskNotify_18006 parseFrom(InputStream input) throws IOException {
         return (S2C_NewYearTaskNotify_18006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NewYearTaskNotify_18006 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewYearTaskNotify_18006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NewYearTaskNotify_18006 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NewYearTaskNotify_18006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NewYearTaskNotify_18006 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewYearTaskNotify_18006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NewYearTaskNotify_18006 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NewYearTaskNotify_18006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NewYearTaskNotify_18006 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewYearTaskNotify_18006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NewYearTaskNotify_18006 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NewYearTaskNotify_18006 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NewYearTaskNotify_18006> parser() {
         return PARSER;
      }

      public Parser<S2C_NewYearTaskNotify_18006> getParserForType() {
         return PARSER;
      }

      public S2C_NewYearTaskNotify_18006 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NewYearTaskNotify_18006OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearTaskNotify_18006_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearTaskNotify_18006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NewYearTaskNotify_18006.class, Builder.class);
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
            if (NewYear2022Msg.S2C_NewYearTaskNotify_18006.alwaysUseFieldBuilders) {
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
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearTaskNotify_18006_descriptor;
         }

         public S2C_NewYearTaskNotify_18006 getDefaultInstanceForType() {
            return NewYear2022Msg.S2C_NewYearTaskNotify_18006.getDefaultInstance();
         }

         public S2C_NewYearTaskNotify_18006 build() {
            S2C_NewYearTaskNotify_18006 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NewYearTaskNotify_18006 buildPartial() {
            S2C_NewYearTaskNotify_18006 result = new S2C_NewYearTaskNotify_18006(this);
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
            if (other instanceof S2C_NewYearTaskNotify_18006) {
               return this.mergeFrom((S2C_NewYearTaskNotify_18006)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NewYearTaskNotify_18006 other) {
            if (other == NewYear2022Msg.S2C_NewYearTaskNotify_18006.getDefaultInstance()) {
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
                     this.taskBuilder_ = NewYear2022Msg.S2C_NewYearTaskNotify_18006.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_NewYearTaskNotify_18006 parsedMessage = null;

            try {
               parsedMessage = (S2C_NewYearTaskNotify_18006)NewYear2022Msg.S2C_NewYearTaskNotify_18006.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NewYearTaskNotify_18006)e.getUnfinishedMessage();
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

   public static final class C2S_NewYearTaskCommit_18007 extends GeneratedMessageV3 implements C2S_NewYearTaskCommit_18007OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_NewYearTaskCommit_18007 DEFAULT_INSTANCE = new C2S_NewYearTaskCommit_18007();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_NewYearTaskCommit_18007> PARSER = new AbstractParser<C2S_NewYearTaskCommit_18007>() {
         public C2S_NewYearTaskCommit_18007 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_NewYearTaskCommit_18007(input, extensionRegistry);
         }
      };

      private C2S_NewYearTaskCommit_18007(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_NewYearTaskCommit_18007() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_NewYearTaskCommit_18007();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_NewYearTaskCommit_18007(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearTaskCommit_18007_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearTaskCommit_18007_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NewYearTaskCommit_18007.class, Builder.class);
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
         } else if (!(obj instanceof C2S_NewYearTaskCommit_18007)) {
            return super.equals(obj);
         } else {
            C2S_NewYearTaskCommit_18007 other = (C2S_NewYearTaskCommit_18007)obj;
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

      public static C2S_NewYearTaskCommit_18007 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_NewYearTaskCommit_18007)PARSER.parseFrom(data);
      }

      public static C2S_NewYearTaskCommit_18007 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NewYearTaskCommit_18007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NewYearTaskCommit_18007 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_NewYearTaskCommit_18007)PARSER.parseFrom(data);
      }

      public static C2S_NewYearTaskCommit_18007 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NewYearTaskCommit_18007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NewYearTaskCommit_18007 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_NewYearTaskCommit_18007)PARSER.parseFrom(data);
      }

      public static C2S_NewYearTaskCommit_18007 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NewYearTaskCommit_18007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NewYearTaskCommit_18007 parseFrom(InputStream input) throws IOException {
         return (C2S_NewYearTaskCommit_18007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NewYearTaskCommit_18007 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NewYearTaskCommit_18007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NewYearTaskCommit_18007 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_NewYearTaskCommit_18007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_NewYearTaskCommit_18007 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NewYearTaskCommit_18007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NewYearTaskCommit_18007 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_NewYearTaskCommit_18007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NewYearTaskCommit_18007 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NewYearTaskCommit_18007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_NewYearTaskCommit_18007 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_NewYearTaskCommit_18007 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_NewYearTaskCommit_18007> parser() {
         return PARSER;
      }

      public Parser<C2S_NewYearTaskCommit_18007> getParserForType() {
         return PARSER;
      }

      public C2S_NewYearTaskCommit_18007 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_NewYearTaskCommit_18007OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearTaskCommit_18007_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearTaskCommit_18007_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NewYearTaskCommit_18007.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NewYear2022Msg.C2S_NewYearTaskCommit_18007.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearTaskCommit_18007_descriptor;
         }

         public C2S_NewYearTaskCommit_18007 getDefaultInstanceForType() {
            return NewYear2022Msg.C2S_NewYearTaskCommit_18007.getDefaultInstance();
         }

         public C2S_NewYearTaskCommit_18007 build() {
            C2S_NewYearTaskCommit_18007 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_NewYearTaskCommit_18007 buildPartial() {
            C2S_NewYearTaskCommit_18007 result = new C2S_NewYearTaskCommit_18007(this);
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
            if (other instanceof C2S_NewYearTaskCommit_18007) {
               return this.mergeFrom((C2S_NewYearTaskCommit_18007)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_NewYearTaskCommit_18007 other) {
            if (other == NewYear2022Msg.C2S_NewYearTaskCommit_18007.getDefaultInstance()) {
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
            C2S_NewYearTaskCommit_18007 parsedMessage = null;

            try {
               parsedMessage = (C2S_NewYearTaskCommit_18007)NewYear2022Msg.C2S_NewYearTaskCommit_18007.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_NewYearTaskCommit_18007)e.getUnfinishedMessage();
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

   public static final class S2C_NewYearTaskCommit_18008 extends GeneratedMessageV3 implements S2C_NewYearTaskCommit_18008OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_NewYearTaskCommit_18008 DEFAULT_INSTANCE = new S2C_NewYearTaskCommit_18008();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NewYearTaskCommit_18008> PARSER = new AbstractParser<S2C_NewYearTaskCommit_18008>() {
         public S2C_NewYearTaskCommit_18008 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NewYearTaskCommit_18008(input, extensionRegistry);
         }
      };

      private S2C_NewYearTaskCommit_18008(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NewYearTaskCommit_18008() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NewYearTaskCommit_18008();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NewYearTaskCommit_18008(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearTaskCommit_18008_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearTaskCommit_18008_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NewYearTaskCommit_18008.class, Builder.class);
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
         } else if (!(obj instanceof S2C_NewYearTaskCommit_18008)) {
            return super.equals(obj);
         } else {
            S2C_NewYearTaskCommit_18008 other = (S2C_NewYearTaskCommit_18008)obj;
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

      public static S2C_NewYearTaskCommit_18008 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NewYearTaskCommit_18008)PARSER.parseFrom(data);
      }

      public static S2C_NewYearTaskCommit_18008 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewYearTaskCommit_18008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewYearTaskCommit_18008 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NewYearTaskCommit_18008)PARSER.parseFrom(data);
      }

      public static S2C_NewYearTaskCommit_18008 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewYearTaskCommit_18008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewYearTaskCommit_18008 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NewYearTaskCommit_18008)PARSER.parseFrom(data);
      }

      public static S2C_NewYearTaskCommit_18008 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewYearTaskCommit_18008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewYearTaskCommit_18008 parseFrom(InputStream input) throws IOException {
         return (S2C_NewYearTaskCommit_18008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NewYearTaskCommit_18008 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewYearTaskCommit_18008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NewYearTaskCommit_18008 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NewYearTaskCommit_18008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NewYearTaskCommit_18008 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewYearTaskCommit_18008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NewYearTaskCommit_18008 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NewYearTaskCommit_18008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NewYearTaskCommit_18008 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewYearTaskCommit_18008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NewYearTaskCommit_18008 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NewYearTaskCommit_18008 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NewYearTaskCommit_18008> parser() {
         return PARSER;
      }

      public Parser<S2C_NewYearTaskCommit_18008> getParserForType() {
         return PARSER;
      }

      public S2C_NewYearTaskCommit_18008 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NewYearTaskCommit_18008OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearTaskCommit_18008_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearTaskCommit_18008_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NewYearTaskCommit_18008.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NewYear2022Msg.S2C_NewYearTaskCommit_18008.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearTaskCommit_18008_descriptor;
         }

         public S2C_NewYearTaskCommit_18008 getDefaultInstanceForType() {
            return NewYear2022Msg.S2C_NewYearTaskCommit_18008.getDefaultInstance();
         }

         public S2C_NewYearTaskCommit_18008 build() {
            S2C_NewYearTaskCommit_18008 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NewYearTaskCommit_18008 buildPartial() {
            S2C_NewYearTaskCommit_18008 result = new S2C_NewYearTaskCommit_18008(this);
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
            if (other instanceof S2C_NewYearTaskCommit_18008) {
               return this.mergeFrom((S2C_NewYearTaskCommit_18008)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NewYearTaskCommit_18008 other) {
            if (other == NewYear2022Msg.S2C_NewYearTaskCommit_18008.getDefaultInstance()) {
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
            S2C_NewYearTaskCommit_18008 parsedMessage = null;

            try {
               parsedMessage = (S2C_NewYearTaskCommit_18008)NewYear2022Msg.S2C_NewYearTaskCommit_18008.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NewYearTaskCommit_18008)e.getUnfinishedMessage();
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

   public static final class C2S_NewYearBuyIntegral_18009 extends GeneratedMessageV3 implements C2S_NewYearBuyIntegral_18009OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_NewYearBuyIntegral_18009 DEFAULT_INSTANCE = new C2S_NewYearBuyIntegral_18009();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_NewYearBuyIntegral_18009> PARSER = new AbstractParser<C2S_NewYearBuyIntegral_18009>() {
         public C2S_NewYearBuyIntegral_18009 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_NewYearBuyIntegral_18009(input, extensionRegistry);
         }
      };

      private C2S_NewYearBuyIntegral_18009(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_NewYearBuyIntegral_18009() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_NewYearBuyIntegral_18009();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_NewYearBuyIntegral_18009(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearBuyIntegral_18009_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearBuyIntegral_18009_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NewYearBuyIntegral_18009.class, Builder.class);
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
         } else if (!(obj instanceof C2S_NewYearBuyIntegral_18009)) {
            return super.equals(obj);
         } else {
            C2S_NewYearBuyIntegral_18009 other = (C2S_NewYearBuyIntegral_18009)obj;
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

      public static C2S_NewYearBuyIntegral_18009 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_NewYearBuyIntegral_18009)PARSER.parseFrom(data);
      }

      public static C2S_NewYearBuyIntegral_18009 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NewYearBuyIntegral_18009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NewYearBuyIntegral_18009 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_NewYearBuyIntegral_18009)PARSER.parseFrom(data);
      }

      public static C2S_NewYearBuyIntegral_18009 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NewYearBuyIntegral_18009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NewYearBuyIntegral_18009 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_NewYearBuyIntegral_18009)PARSER.parseFrom(data);
      }

      public static C2S_NewYearBuyIntegral_18009 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NewYearBuyIntegral_18009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NewYearBuyIntegral_18009 parseFrom(InputStream input) throws IOException {
         return (C2S_NewYearBuyIntegral_18009)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NewYearBuyIntegral_18009 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NewYearBuyIntegral_18009)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NewYearBuyIntegral_18009 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_NewYearBuyIntegral_18009)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_NewYearBuyIntegral_18009 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NewYearBuyIntegral_18009)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NewYearBuyIntegral_18009 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_NewYearBuyIntegral_18009)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NewYearBuyIntegral_18009 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NewYearBuyIntegral_18009)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_NewYearBuyIntegral_18009 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_NewYearBuyIntegral_18009 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_NewYearBuyIntegral_18009> parser() {
         return PARSER;
      }

      public Parser<C2S_NewYearBuyIntegral_18009> getParserForType() {
         return PARSER;
      }

      public C2S_NewYearBuyIntegral_18009 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_NewYearBuyIntegral_18009OrBuilder {
         private int bitField0_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearBuyIntegral_18009_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearBuyIntegral_18009_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NewYearBuyIntegral_18009.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NewYear2022Msg.C2S_NewYearBuyIntegral_18009.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_C2S_NewYearBuyIntegral_18009_descriptor;
         }

         public C2S_NewYearBuyIntegral_18009 getDefaultInstanceForType() {
            return NewYear2022Msg.C2S_NewYearBuyIntegral_18009.getDefaultInstance();
         }

         public C2S_NewYearBuyIntegral_18009 build() {
            C2S_NewYearBuyIntegral_18009 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_NewYearBuyIntegral_18009 buildPartial() {
            C2S_NewYearBuyIntegral_18009 result = new C2S_NewYearBuyIntegral_18009(this);
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
            if (other instanceof C2S_NewYearBuyIntegral_18009) {
               return this.mergeFrom((C2S_NewYearBuyIntegral_18009)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_NewYearBuyIntegral_18009 other) {
            if (other == NewYear2022Msg.C2S_NewYearBuyIntegral_18009.getDefaultInstance()) {
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
            C2S_NewYearBuyIntegral_18009 parsedMessage = null;

            try {
               parsedMessage = (C2S_NewYearBuyIntegral_18009)NewYear2022Msg.C2S_NewYearBuyIntegral_18009.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_NewYearBuyIntegral_18009)e.getUnfinishedMessage();
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

   public static final class S2C_NewYearBuyIntegral_18010 extends GeneratedMessageV3 implements S2C_NewYearBuyIntegral_18010OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      public static final int ALREADYBUY_FIELD_NUMBER = 2;
      private int alreadyBuy_;
      private byte memoizedIsInitialized;
      private static final S2C_NewYearBuyIntegral_18010 DEFAULT_INSTANCE = new S2C_NewYearBuyIntegral_18010();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NewYearBuyIntegral_18010> PARSER = new AbstractParser<S2C_NewYearBuyIntegral_18010>() {
         public S2C_NewYearBuyIntegral_18010 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NewYearBuyIntegral_18010(input, extensionRegistry);
         }
      };

      private S2C_NewYearBuyIntegral_18010(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NewYearBuyIntegral_18010() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NewYearBuyIntegral_18010();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NewYearBuyIntegral_18010(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearBuyIntegral_18010_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearBuyIntegral_18010_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NewYearBuyIntegral_18010.class, Builder.class);
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
         } else if (!(obj instanceof S2C_NewYearBuyIntegral_18010)) {
            return super.equals(obj);
         } else {
            S2C_NewYearBuyIntegral_18010 other = (S2C_NewYearBuyIntegral_18010)obj;
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

      public static S2C_NewYearBuyIntegral_18010 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NewYearBuyIntegral_18010)PARSER.parseFrom(data);
      }

      public static S2C_NewYearBuyIntegral_18010 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewYearBuyIntegral_18010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewYearBuyIntegral_18010 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NewYearBuyIntegral_18010)PARSER.parseFrom(data);
      }

      public static S2C_NewYearBuyIntegral_18010 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewYearBuyIntegral_18010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewYearBuyIntegral_18010 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NewYearBuyIntegral_18010)PARSER.parseFrom(data);
      }

      public static S2C_NewYearBuyIntegral_18010 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewYearBuyIntegral_18010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewYearBuyIntegral_18010 parseFrom(InputStream input) throws IOException {
         return (S2C_NewYearBuyIntegral_18010)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NewYearBuyIntegral_18010 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewYearBuyIntegral_18010)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NewYearBuyIntegral_18010 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NewYearBuyIntegral_18010)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NewYearBuyIntegral_18010 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewYearBuyIntegral_18010)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NewYearBuyIntegral_18010 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NewYearBuyIntegral_18010)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NewYearBuyIntegral_18010 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewYearBuyIntegral_18010)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NewYearBuyIntegral_18010 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NewYearBuyIntegral_18010 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NewYearBuyIntegral_18010> parser() {
         return PARSER;
      }

      public Parser<S2C_NewYearBuyIntegral_18010> getParserForType() {
         return PARSER;
      }

      public S2C_NewYearBuyIntegral_18010 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NewYearBuyIntegral_18010OrBuilder {
         private int bitField0_;
         private int num_;
         private int alreadyBuy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearBuyIntegral_18010_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearBuyIntegral_18010_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NewYearBuyIntegral_18010.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NewYear2022Msg.S2C_NewYearBuyIntegral_18010.alwaysUseFieldBuilders) {
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
            return NewYear2022Msg.internal_static_newYear2022_com_gzbz_protobuf_S2C_NewYearBuyIntegral_18010_descriptor;
         }

         public S2C_NewYearBuyIntegral_18010 getDefaultInstanceForType() {
            return NewYear2022Msg.S2C_NewYearBuyIntegral_18010.getDefaultInstance();
         }

         public S2C_NewYearBuyIntegral_18010 build() {
            S2C_NewYearBuyIntegral_18010 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NewYearBuyIntegral_18010 buildPartial() {
            S2C_NewYearBuyIntegral_18010 result = new S2C_NewYearBuyIntegral_18010(this);
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
            if (other instanceof S2C_NewYearBuyIntegral_18010) {
               return this.mergeFrom((S2C_NewYearBuyIntegral_18010)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NewYearBuyIntegral_18010 other) {
            if (other == NewYear2022Msg.S2C_NewYearBuyIntegral_18010.getDefaultInstance()) {
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
            S2C_NewYearBuyIntegral_18010 parsedMessage = null;

            try {
               parsedMessage = (S2C_NewYearBuyIntegral_18010)NewYear2022Msg.S2C_NewYearBuyIntegral_18010.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NewYearBuyIntegral_18010)e.getUnfinishedMessage();
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

   public interface C2S_NewYearBuyIntegral_18009OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();
   }

   public interface C2S_NewYearDailyTask_18001OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_NewYearLiYuTask_18003OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_NewYearTaskCommit_18007OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_NewYearBuyIntegral_18010OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();

      boolean hasAlreadyBuy();

      int getAlreadyBuy();
   }

   public interface S2C_NewYearDailyTask_18002OrBuilder extends MessageOrBuilder {
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

   public interface S2C_NewYearLiYuTask_18004OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_NewYearTaskCommit_18008OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_NewYearTaskNotify_18006OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }
}
