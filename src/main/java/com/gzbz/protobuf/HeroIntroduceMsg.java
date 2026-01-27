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

public final class HeroIntroduceMsg {
   private static final Descriptors.Descriptor internal_static_heroIntroduce_com_gzbz_protobuf_SimpleInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroIntroduce_com_gzbz_protobuf_SimpleInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroIntroduce_com_gzbz_protobuf_C2S_IntroduceTaskList_14301_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroIntroduce_com_gzbz_protobuf_C2S_IntroduceTaskList_14301_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroIntroduce_com_gzbz_protobuf_S2C_IntroduceTaskList_14302_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroIntroduce_com_gzbz_protobuf_S2C_IntroduceTaskList_14302_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroIntroduce_com_gzbz_protobuf_C2S_IntroduceTaskCommit_14303_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroIntroduce_com_gzbz_protobuf_C2S_IntroduceTaskCommit_14303_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroIntroduce_com_gzbz_protobuf_S2C_IntroduceTaskCommit_14304_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroIntroduce_com_gzbz_protobuf_S2C_IntroduceTaskCommit_14304_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroIntroduce_com_gzbz_protobuf_C2S_GroupReward_14305_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroIntroduce_com_gzbz_protobuf_C2S_GroupReward_14305_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroIntroduce_com_gzbz_protobuf_S2C_GroupReward_14306_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroIntroduce_com_gzbz_protobuf_S2C_GroupReward_14306_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private HeroIntroduceMsg() {
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
      String[] descriptorData = new String[]{"\n\u0013HeroIntroduce.proto\u0012\u001fheroIntroduce.com.gzbz.protobuf\u001a\fcommon.proto\"=\n\nSimpleInfo\u0012\u000f\n\u0007groupId\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005state\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0003 \u0002(\u0005\"\u001d\n\u001bC2S_IntroduceTaskList_14301\"~\n\u001bS2C_IntroduceTaskList_14302\u0012\u001e\n\btaskList\u0018\u0001 \u0003(\u000b2\f.common.Task\u0012?\n\nsimpleInfo\u0018\u0002 \u0003(\u000b2+.heroIntroduce.com.gzbz.protobuf.SimpleInfo\"/\n\u001dC2S_IntroduceTaskCommit_14303\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"/\n\u001dS2C_IntroduceTaskCommit_14304\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"(\n\u0015C2S_GroupReward_14305\u0012\u000f\n\u0007groupId\u0018\u0001 \u0002(\u0005\"(\n\u0015S2C_GroupReward_14306\u0012\u000f\n\u0007groupId\u0018\u0001 \u0002(\u0005B'\n\u0011com.gzbz.protobufB\u0010HeroIntroduceMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_heroIntroduce_com_gzbz_protobuf_SimpleInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_heroIntroduce_com_gzbz_protobuf_SimpleInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroIntroduce_com_gzbz_protobuf_SimpleInfo_descriptor, new String[]{"GroupId", "State", "EndTime"});
      internal_static_heroIntroduce_com_gzbz_protobuf_C2S_IntroduceTaskList_14301_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_heroIntroduce_com_gzbz_protobuf_C2S_IntroduceTaskList_14301_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroIntroduce_com_gzbz_protobuf_C2S_IntroduceTaskList_14301_descriptor, new String[0]);
      internal_static_heroIntroduce_com_gzbz_protobuf_S2C_IntroduceTaskList_14302_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_heroIntroduce_com_gzbz_protobuf_S2C_IntroduceTaskList_14302_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroIntroduce_com_gzbz_protobuf_S2C_IntroduceTaskList_14302_descriptor, new String[]{"TaskList", "SimpleInfo"});
      internal_static_heroIntroduce_com_gzbz_protobuf_C2S_IntroduceTaskCommit_14303_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_heroIntroduce_com_gzbz_protobuf_C2S_IntroduceTaskCommit_14303_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroIntroduce_com_gzbz_protobuf_C2S_IntroduceTaskCommit_14303_descriptor, new String[]{"TaskId"});
      internal_static_heroIntroduce_com_gzbz_protobuf_S2C_IntroduceTaskCommit_14304_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_heroIntroduce_com_gzbz_protobuf_S2C_IntroduceTaskCommit_14304_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroIntroduce_com_gzbz_protobuf_S2C_IntroduceTaskCommit_14304_descriptor, new String[]{"TaskId"});
      internal_static_heroIntroduce_com_gzbz_protobuf_C2S_GroupReward_14305_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_heroIntroduce_com_gzbz_protobuf_C2S_GroupReward_14305_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroIntroduce_com_gzbz_protobuf_C2S_GroupReward_14305_descriptor, new String[]{"GroupId"});
      internal_static_heroIntroduce_com_gzbz_protobuf_S2C_GroupReward_14306_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_heroIntroduce_com_gzbz_protobuf_S2C_GroupReward_14306_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroIntroduce_com_gzbz_protobuf_S2C_GroupReward_14306_descriptor, new String[]{"GroupId"});
      CommonMsg.getDescriptor();
   }

   public static final class SimpleInfo extends GeneratedMessageV3 implements SimpleInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GROUPID_FIELD_NUMBER = 1;
      private int groupId_;
      public static final int STATE_FIELD_NUMBER = 2;
      private int state_;
      public static final int ENDTIME_FIELD_NUMBER = 3;
      private int endTime_;
      private byte memoizedIsInitialized;
      private static final SimpleInfo DEFAULT_INSTANCE = new SimpleInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<SimpleInfo> PARSER = new AbstractParser<SimpleInfo>() {
         public SimpleInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new SimpleInfo(input, extensionRegistry);
         }
      };

      private SimpleInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private SimpleInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new SimpleInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private SimpleInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.groupId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.state_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.endTime_ = input.readInt32();
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
         return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_SimpleInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_SimpleInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SimpleInfo.class, Builder.class);
      }

      public boolean hasGroupId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGroupId() {
         return this.groupId_;
      }

      public boolean hasState() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGroupId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.groupId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.state_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.endTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.groupId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.state_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.endTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof SimpleInfo)) {
            return super.equals(obj);
         } else {
            SimpleInfo other = (SimpleInfo)obj;
            if (this.hasGroupId() != other.hasGroupId()) {
               return false;
            } else if (this.hasGroupId() && this.getGroupId() != other.getGroupId()) {
               return false;
            } else if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
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
            if (this.hasGroupId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGroupId();
            }

            if (this.hasState()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getState();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getEndTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static SimpleInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (SimpleInfo)PARSER.parseFrom(data);
      }

      public static SimpleInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SimpleInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SimpleInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (SimpleInfo)PARSER.parseFrom(data);
      }

      public static SimpleInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SimpleInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SimpleInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (SimpleInfo)PARSER.parseFrom(data);
      }

      public static SimpleInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SimpleInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SimpleInfo parseFrom(InputStream input) throws IOException {
         return (SimpleInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SimpleInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SimpleInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static SimpleInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (SimpleInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static SimpleInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SimpleInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static SimpleInfo parseFrom(CodedInputStream input) throws IOException {
         return (SimpleInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SimpleInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SimpleInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(SimpleInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static SimpleInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<SimpleInfo> parser() {
         return PARSER;
      }

      public Parser<SimpleInfo> getParserForType() {
         return PARSER;
      }

      public SimpleInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SimpleInfoOrBuilder {
         private int bitField0_;
         private int groupId_;
         private int state_;
         private int endTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_SimpleInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_SimpleInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SimpleInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroIntroduceMsg.SimpleInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.groupId_ = 0;
            this.bitField0_ &= -2;
            this.state_ = 0;
            this.bitField0_ &= -3;
            this.endTime_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_SimpleInfo_descriptor;
         }

         public SimpleInfo getDefaultInstanceForType() {
            return HeroIntroduceMsg.SimpleInfo.getDefaultInstance();
         }

         public SimpleInfo build() {
            SimpleInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public SimpleInfo buildPartial() {
            SimpleInfo result = new SimpleInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.groupId_ = this.groupId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.state_ = this.state_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.endTime_ = this.endTime_;
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
            if (other instanceof SimpleInfo) {
               return this.mergeFrom((SimpleInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(SimpleInfo other) {
            if (other == HeroIntroduceMsg.SimpleInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGroupId()) {
                  this.setGroupId(other.getGroupId());
               }

               if (other.hasState()) {
                  this.setState(other.getState());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGroupId()) {
               return false;
            } else if (!this.hasState()) {
               return false;
            } else {
               return this.hasEndTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            SimpleInfo parsedMessage = null;

            try {
               parsedMessage = (SimpleInfo)HeroIntroduceMsg.SimpleInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (SimpleInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGroupId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGroupId() {
            return this.groupId_;
         }

         public Builder setGroupId(int value) {
            this.bitField0_ |= 1;
            this.groupId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGroupId() {
            this.bitField0_ &= -2;
            this.groupId_ = 0;
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

         public boolean hasEndTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 4;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -5;
            this.endTime_ = 0;
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

   public static final class C2S_IntroduceTaskList_14301 extends GeneratedMessageV3 implements C2S_IntroduceTaskList_14301OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_IntroduceTaskList_14301 DEFAULT_INSTANCE = new C2S_IntroduceTaskList_14301();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_IntroduceTaskList_14301> PARSER = new AbstractParser<C2S_IntroduceTaskList_14301>() {
         public C2S_IntroduceTaskList_14301 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_IntroduceTaskList_14301(input, extensionRegistry);
         }
      };

      private C2S_IntroduceTaskList_14301(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_IntroduceTaskList_14301() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_IntroduceTaskList_14301();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_IntroduceTaskList_14301(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_C2S_IntroduceTaskList_14301_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_C2S_IntroduceTaskList_14301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_IntroduceTaskList_14301.class, Builder.class);
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
         } else if (!(obj instanceof C2S_IntroduceTaskList_14301)) {
            return super.equals(obj);
         } else {
            C2S_IntroduceTaskList_14301 other = (C2S_IntroduceTaskList_14301)obj;
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

      public static C2S_IntroduceTaskList_14301 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_IntroduceTaskList_14301)PARSER.parseFrom(data);
      }

      public static C2S_IntroduceTaskList_14301 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_IntroduceTaskList_14301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_IntroduceTaskList_14301 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_IntroduceTaskList_14301)PARSER.parseFrom(data);
      }

      public static C2S_IntroduceTaskList_14301 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_IntroduceTaskList_14301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_IntroduceTaskList_14301 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_IntroduceTaskList_14301)PARSER.parseFrom(data);
      }

      public static C2S_IntroduceTaskList_14301 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_IntroduceTaskList_14301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_IntroduceTaskList_14301 parseFrom(InputStream input) throws IOException {
         return (C2S_IntroduceTaskList_14301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_IntroduceTaskList_14301 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_IntroduceTaskList_14301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_IntroduceTaskList_14301 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_IntroduceTaskList_14301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_IntroduceTaskList_14301 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_IntroduceTaskList_14301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_IntroduceTaskList_14301 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_IntroduceTaskList_14301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_IntroduceTaskList_14301 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_IntroduceTaskList_14301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_IntroduceTaskList_14301 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_IntroduceTaskList_14301 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_IntroduceTaskList_14301> parser() {
         return PARSER;
      }

      public Parser<C2S_IntroduceTaskList_14301> getParserForType() {
         return PARSER;
      }

      public C2S_IntroduceTaskList_14301 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_IntroduceTaskList_14301OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_C2S_IntroduceTaskList_14301_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_C2S_IntroduceTaskList_14301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_IntroduceTaskList_14301.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroIntroduceMsg.C2S_IntroduceTaskList_14301.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_C2S_IntroduceTaskList_14301_descriptor;
         }

         public C2S_IntroduceTaskList_14301 getDefaultInstanceForType() {
            return HeroIntroduceMsg.C2S_IntroduceTaskList_14301.getDefaultInstance();
         }

         public C2S_IntroduceTaskList_14301 build() {
            C2S_IntroduceTaskList_14301 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_IntroduceTaskList_14301 buildPartial() {
            C2S_IntroduceTaskList_14301 result = new C2S_IntroduceTaskList_14301(this);
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
            if (other instanceof C2S_IntroduceTaskList_14301) {
               return this.mergeFrom((C2S_IntroduceTaskList_14301)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_IntroduceTaskList_14301 other) {
            if (other == HeroIntroduceMsg.C2S_IntroduceTaskList_14301.getDefaultInstance()) {
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
            C2S_IntroduceTaskList_14301 parsedMessage = null;

            try {
               parsedMessage = (C2S_IntroduceTaskList_14301)HeroIntroduceMsg.C2S_IntroduceTaskList_14301.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_IntroduceTaskList_14301)e.getUnfinishedMessage();
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

   public static final class S2C_IntroduceTaskList_14302 extends GeneratedMessageV3 implements S2C_IntroduceTaskList_14302OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASKLIST_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> taskList_;
      public static final int SIMPLEINFO_FIELD_NUMBER = 2;
      private List<SimpleInfo> simpleInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_IntroduceTaskList_14302 DEFAULT_INSTANCE = new S2C_IntroduceTaskList_14302();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_IntroduceTaskList_14302> PARSER = new AbstractParser<S2C_IntroduceTaskList_14302>() {
         public S2C_IntroduceTaskList_14302 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_IntroduceTaskList_14302(input, extensionRegistry);
         }
      };

      private S2C_IntroduceTaskList_14302(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_IntroduceTaskList_14302() {
         this.memoizedIsInitialized = -1;
         this.taskList_ = Collections.emptyList();
         this.simpleInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_IntroduceTaskList_14302();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_IntroduceTaskList_14302(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.taskList_.add(input.readMessage(CommonMsg.Task.PARSER, extensionRegistry));
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.simpleInfo_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.simpleInfo_.add(input.readMessage(HeroIntroduceMsg.SimpleInfo.PARSER, extensionRegistry));
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

               if ((mutable_bitField0_ & 2) != 0) {
                  this.simpleInfo_ = Collections.unmodifiableList(this.simpleInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_S2C_IntroduceTaskList_14302_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_S2C_IntroduceTaskList_14302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_IntroduceTaskList_14302.class, Builder.class);
      }

      public List<CommonMsg.Task> getTaskListList() {
         return this.taskList_;
      }

      public List<? extends CommonMsg.TaskOrBuilder> getTaskListOrBuilderList() {
         return this.taskList_;
      }

      public int getTaskListCount() {
         return this.taskList_.size();
      }

      public CommonMsg.Task getTaskList(int index) {
         return (CommonMsg.Task)this.taskList_.get(index);
      }

      public CommonMsg.TaskOrBuilder getTaskListOrBuilder(int index) {
         return (CommonMsg.TaskOrBuilder)this.taskList_.get(index);
      }

      public List<SimpleInfo> getSimpleInfoList() {
         return this.simpleInfo_;
      }

      public List<? extends SimpleInfoOrBuilder> getSimpleInfoOrBuilderList() {
         return this.simpleInfo_;
      }

      public int getSimpleInfoCount() {
         return this.simpleInfo_.size();
      }

      public SimpleInfo getSimpleInfo(int index) {
         return (SimpleInfo)this.simpleInfo_.get(index);
      }

      public SimpleInfoOrBuilder getSimpleInfoOrBuilder(int index) {
         return (SimpleInfoOrBuilder)this.simpleInfo_.get(index);
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

            for(int i = 0; i < this.getSimpleInfoCount(); ++i) {
               if (!this.getSimpleInfo(i).isInitialized()) {
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

         for(int i = 0; i < this.simpleInfo_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.simpleInfo_.get(i));
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

            for(int i = 0; i < this.simpleInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.simpleInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_IntroduceTaskList_14302)) {
            return super.equals(obj);
         } else {
            S2C_IntroduceTaskList_14302 other = (S2C_IntroduceTaskList_14302)obj;
            if (!this.getTaskListList().equals(other.getTaskListList())) {
               return false;
            } else if (!this.getSimpleInfoList().equals(other.getSimpleInfoList())) {
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

            if (this.getSimpleInfoCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSimpleInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_IntroduceTaskList_14302 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_IntroduceTaskList_14302)PARSER.parseFrom(data);
      }

      public static S2C_IntroduceTaskList_14302 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IntroduceTaskList_14302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IntroduceTaskList_14302 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_IntroduceTaskList_14302)PARSER.parseFrom(data);
      }

      public static S2C_IntroduceTaskList_14302 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IntroduceTaskList_14302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IntroduceTaskList_14302 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_IntroduceTaskList_14302)PARSER.parseFrom(data);
      }

      public static S2C_IntroduceTaskList_14302 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IntroduceTaskList_14302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IntroduceTaskList_14302 parseFrom(InputStream input) throws IOException {
         return (S2C_IntroduceTaskList_14302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_IntroduceTaskList_14302 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IntroduceTaskList_14302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_IntroduceTaskList_14302 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_IntroduceTaskList_14302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_IntroduceTaskList_14302 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IntroduceTaskList_14302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_IntroduceTaskList_14302 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_IntroduceTaskList_14302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_IntroduceTaskList_14302 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IntroduceTaskList_14302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_IntroduceTaskList_14302 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_IntroduceTaskList_14302 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_IntroduceTaskList_14302> parser() {
         return PARSER;
      }

      public Parser<S2C_IntroduceTaskList_14302> getParserForType() {
         return PARSER;
      }

      public S2C_IntroduceTaskList_14302 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_IntroduceTaskList_14302OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> taskList_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskListBuilder_;
         private List<SimpleInfo> simpleInfo_;
         private RepeatedFieldBuilderV3<SimpleInfo, SimpleInfo.Builder, SimpleInfoOrBuilder> simpleInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_S2C_IntroduceTaskList_14302_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_S2C_IntroduceTaskList_14302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_IntroduceTaskList_14302.class, Builder.class);
         }

         private Builder() {
            this.taskList_ = Collections.emptyList();
            this.simpleInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.taskList_ = Collections.emptyList();
            this.simpleInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroIntroduceMsg.S2C_IntroduceTaskList_14302.alwaysUseFieldBuilders) {
               this.getTaskListFieldBuilder();
               this.getSimpleInfoFieldBuilder();
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

            if (this.simpleInfoBuilder_ == null) {
               this.simpleInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.simpleInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_S2C_IntroduceTaskList_14302_descriptor;
         }

         public S2C_IntroduceTaskList_14302 getDefaultInstanceForType() {
            return HeroIntroduceMsg.S2C_IntroduceTaskList_14302.getDefaultInstance();
         }

         public S2C_IntroduceTaskList_14302 build() {
            S2C_IntroduceTaskList_14302 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_IntroduceTaskList_14302 buildPartial() {
            S2C_IntroduceTaskList_14302 result = new S2C_IntroduceTaskList_14302(this);
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

            if (this.simpleInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.simpleInfo_ = Collections.unmodifiableList(this.simpleInfo_);
                  this.bitField0_ &= -3;
               }

               result.simpleInfo_ = this.simpleInfo_;
            } else {
               result.simpleInfo_ = this.simpleInfoBuilder_.build();
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
            if (other instanceof S2C_IntroduceTaskList_14302) {
               return this.mergeFrom((S2C_IntroduceTaskList_14302)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_IntroduceTaskList_14302 other) {
            if (other == HeroIntroduceMsg.S2C_IntroduceTaskList_14302.getDefaultInstance()) {
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
                     this.taskListBuilder_ = HeroIntroduceMsg.S2C_IntroduceTaskList_14302.alwaysUseFieldBuilders ? this.getTaskListFieldBuilder() : null;
                  } else {
                     this.taskListBuilder_.addAllMessages(other.taskList_);
                  }
               }

               if (this.simpleInfoBuilder_ == null) {
                  if (!other.simpleInfo_.isEmpty()) {
                     if (this.simpleInfo_.isEmpty()) {
                        this.simpleInfo_ = other.simpleInfo_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureSimpleInfoIsMutable();
                        this.simpleInfo_.addAll(other.simpleInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.simpleInfo_.isEmpty()) {
                  if (this.simpleInfoBuilder_.isEmpty()) {
                     this.simpleInfoBuilder_.dispose();
                     this.simpleInfoBuilder_ = null;
                     this.simpleInfo_ = other.simpleInfo_;
                     this.bitField0_ &= -3;
                     this.simpleInfoBuilder_ = HeroIntroduceMsg.S2C_IntroduceTaskList_14302.alwaysUseFieldBuilders ? this.getSimpleInfoFieldBuilder() : null;
                  } else {
                     this.simpleInfoBuilder_.addAllMessages(other.simpleInfo_);
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

            for(int i = 0; i < this.getSimpleInfoCount(); ++i) {
               if (!this.getSimpleInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_IntroduceTaskList_14302 parsedMessage = null;

            try {
               parsedMessage = (S2C_IntroduceTaskList_14302)HeroIntroduceMsg.S2C_IntroduceTaskList_14302.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_IntroduceTaskList_14302)e.getUnfinishedMessage();
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

         public List<CommonMsg.Task> getTaskListList() {
            return this.taskListBuilder_ == null ? Collections.unmodifiableList(this.taskList_) : this.taskListBuilder_.getMessageList();
         }

         public int getTaskListCount() {
            return this.taskListBuilder_ == null ? this.taskList_.size() : this.taskListBuilder_.getCount();
         }

         public CommonMsg.Task getTaskList(int index) {
            return this.taskListBuilder_ == null ? (CommonMsg.Task)this.taskList_.get(index) : (CommonMsg.Task)this.taskListBuilder_.getMessage(index);
         }

         public Builder setTaskList(int index, CommonMsg.Task value) {
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

         public Builder setTaskList(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(CommonMsg.Task value) {
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

         public Builder addTaskList(int index, CommonMsg.Task value) {
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

         public Builder addTaskList(CommonMsg.Task.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTaskList(Iterable<? extends CommonMsg.Task> values) {
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

         public CommonMsg.Task.Builder getTaskListBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskListFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TaskOrBuilder getTaskListOrBuilder(int index) {
            return this.taskListBuilder_ == null ? (CommonMsg.TaskOrBuilder)this.taskList_.get(index) : (CommonMsg.TaskOrBuilder)this.taskListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TaskOrBuilder> getTaskListOrBuilderList() {
            return this.taskListBuilder_ != null ? this.taskListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.taskList_);
         }

         public CommonMsg.Task.Builder addTaskListBuilder() {
            return (CommonMsg.Task.Builder)this.getTaskListFieldBuilder().addBuilder(CommonMsg.Task.getDefaultInstance());
         }

         public CommonMsg.Task.Builder addTaskListBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskListFieldBuilder().addBuilder(index, CommonMsg.Task.getDefaultInstance());
         }

         public List<CommonMsg.Task.Builder> getTaskListBuilderList() {
            return this.getTaskListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTaskListFieldBuilder() {
            if (this.taskListBuilder_ == null) {
               this.taskListBuilder_ = new RepeatedFieldBuilderV3(this.taskList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.taskList_ = null;
            }

            return this.taskListBuilder_;
         }

         private void ensureSimpleInfoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.simpleInfo_ = new ArrayList(this.simpleInfo_);
               this.bitField0_ |= 2;
            }

         }

         public List<SimpleInfo> getSimpleInfoList() {
            return this.simpleInfoBuilder_ == null ? Collections.unmodifiableList(this.simpleInfo_) : this.simpleInfoBuilder_.getMessageList();
         }

         public int getSimpleInfoCount() {
            return this.simpleInfoBuilder_ == null ? this.simpleInfo_.size() : this.simpleInfoBuilder_.getCount();
         }

         public SimpleInfo getSimpleInfo(int index) {
            return this.simpleInfoBuilder_ == null ? (SimpleInfo)this.simpleInfo_.get(index) : (SimpleInfo)this.simpleInfoBuilder_.getMessage(index);
         }

         public Builder setSimpleInfo(int index, SimpleInfo value) {
            if (this.simpleInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSimpleInfoIsMutable();
               this.simpleInfo_.set(index, value);
               this.onChanged();
            } else {
               this.simpleInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setSimpleInfo(int index, SimpleInfo.Builder builderForValue) {
            if (this.simpleInfoBuilder_ == null) {
               this.ensureSimpleInfoIsMutable();
               this.simpleInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.simpleInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addSimpleInfo(SimpleInfo value) {
            if (this.simpleInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSimpleInfoIsMutable();
               this.simpleInfo_.add(value);
               this.onChanged();
            } else {
               this.simpleInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addSimpleInfo(int index, SimpleInfo value) {
            if (this.simpleInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSimpleInfoIsMutable();
               this.simpleInfo_.add(index, value);
               this.onChanged();
            } else {
               this.simpleInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addSimpleInfo(SimpleInfo.Builder builderForValue) {
            if (this.simpleInfoBuilder_ == null) {
               this.ensureSimpleInfoIsMutable();
               this.simpleInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.simpleInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addSimpleInfo(int index, SimpleInfo.Builder builderForValue) {
            if (this.simpleInfoBuilder_ == null) {
               this.ensureSimpleInfoIsMutable();
               this.simpleInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.simpleInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllSimpleInfo(Iterable<? extends SimpleInfo> values) {
            if (this.simpleInfoBuilder_ == null) {
               this.ensureSimpleInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.simpleInfo_);
               this.onChanged();
            } else {
               this.simpleInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearSimpleInfo() {
            if (this.simpleInfoBuilder_ == null) {
               this.simpleInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.simpleInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeSimpleInfo(int index) {
            if (this.simpleInfoBuilder_ == null) {
               this.ensureSimpleInfoIsMutable();
               this.simpleInfo_.remove(index);
               this.onChanged();
            } else {
               this.simpleInfoBuilder_.remove(index);
            }

            return this;
         }

         public SimpleInfo.Builder getSimpleInfoBuilder(int index) {
            return (SimpleInfo.Builder)this.getSimpleInfoFieldBuilder().getBuilder(index);
         }

         public SimpleInfoOrBuilder getSimpleInfoOrBuilder(int index) {
            return this.simpleInfoBuilder_ == null ? (SimpleInfoOrBuilder)this.simpleInfo_.get(index) : (SimpleInfoOrBuilder)this.simpleInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SimpleInfoOrBuilder> getSimpleInfoOrBuilderList() {
            return this.simpleInfoBuilder_ != null ? this.simpleInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.simpleInfo_);
         }

         public SimpleInfo.Builder addSimpleInfoBuilder() {
            return (SimpleInfo.Builder)this.getSimpleInfoFieldBuilder().addBuilder(HeroIntroduceMsg.SimpleInfo.getDefaultInstance());
         }

         public SimpleInfo.Builder addSimpleInfoBuilder(int index) {
            return (SimpleInfo.Builder)this.getSimpleInfoFieldBuilder().addBuilder(index, HeroIntroduceMsg.SimpleInfo.getDefaultInstance());
         }

         public List<SimpleInfo.Builder> getSimpleInfoBuilderList() {
            return this.getSimpleInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SimpleInfo, SimpleInfo.Builder, SimpleInfoOrBuilder> getSimpleInfoFieldBuilder() {
            if (this.simpleInfoBuilder_ == null) {
               this.simpleInfoBuilder_ = new RepeatedFieldBuilderV3(this.simpleInfo_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.simpleInfo_ = null;
            }

            return this.simpleInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_IntroduceTaskCommit_14303 extends GeneratedMessageV3 implements C2S_IntroduceTaskCommit_14303OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_IntroduceTaskCommit_14303 DEFAULT_INSTANCE = new C2S_IntroduceTaskCommit_14303();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_IntroduceTaskCommit_14303> PARSER = new AbstractParser<C2S_IntroduceTaskCommit_14303>() {
         public C2S_IntroduceTaskCommit_14303 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_IntroduceTaskCommit_14303(input, extensionRegistry);
         }
      };

      private C2S_IntroduceTaskCommit_14303(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_IntroduceTaskCommit_14303() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_IntroduceTaskCommit_14303();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_IntroduceTaskCommit_14303(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_C2S_IntroduceTaskCommit_14303_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_C2S_IntroduceTaskCommit_14303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_IntroduceTaskCommit_14303.class, Builder.class);
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
         } else if (!(obj instanceof C2S_IntroduceTaskCommit_14303)) {
            return super.equals(obj);
         } else {
            C2S_IntroduceTaskCommit_14303 other = (C2S_IntroduceTaskCommit_14303)obj;
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

      public static C2S_IntroduceTaskCommit_14303 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_IntroduceTaskCommit_14303)PARSER.parseFrom(data);
      }

      public static C2S_IntroduceTaskCommit_14303 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_IntroduceTaskCommit_14303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_IntroduceTaskCommit_14303 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_IntroduceTaskCommit_14303)PARSER.parseFrom(data);
      }

      public static C2S_IntroduceTaskCommit_14303 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_IntroduceTaskCommit_14303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_IntroduceTaskCommit_14303 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_IntroduceTaskCommit_14303)PARSER.parseFrom(data);
      }

      public static C2S_IntroduceTaskCommit_14303 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_IntroduceTaskCommit_14303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_IntroduceTaskCommit_14303 parseFrom(InputStream input) throws IOException {
         return (C2S_IntroduceTaskCommit_14303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_IntroduceTaskCommit_14303 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_IntroduceTaskCommit_14303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_IntroduceTaskCommit_14303 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_IntroduceTaskCommit_14303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_IntroduceTaskCommit_14303 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_IntroduceTaskCommit_14303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_IntroduceTaskCommit_14303 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_IntroduceTaskCommit_14303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_IntroduceTaskCommit_14303 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_IntroduceTaskCommit_14303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_IntroduceTaskCommit_14303 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_IntroduceTaskCommit_14303 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_IntroduceTaskCommit_14303> parser() {
         return PARSER;
      }

      public Parser<C2S_IntroduceTaskCommit_14303> getParserForType() {
         return PARSER;
      }

      public C2S_IntroduceTaskCommit_14303 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_IntroduceTaskCommit_14303OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_C2S_IntroduceTaskCommit_14303_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_C2S_IntroduceTaskCommit_14303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_IntroduceTaskCommit_14303.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroIntroduceMsg.C2S_IntroduceTaskCommit_14303.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_C2S_IntroduceTaskCommit_14303_descriptor;
         }

         public C2S_IntroduceTaskCommit_14303 getDefaultInstanceForType() {
            return HeroIntroduceMsg.C2S_IntroduceTaskCommit_14303.getDefaultInstance();
         }

         public C2S_IntroduceTaskCommit_14303 build() {
            C2S_IntroduceTaskCommit_14303 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_IntroduceTaskCommit_14303 buildPartial() {
            C2S_IntroduceTaskCommit_14303 result = new C2S_IntroduceTaskCommit_14303(this);
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
            if (other instanceof C2S_IntroduceTaskCommit_14303) {
               return this.mergeFrom((C2S_IntroduceTaskCommit_14303)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_IntroduceTaskCommit_14303 other) {
            if (other == HeroIntroduceMsg.C2S_IntroduceTaskCommit_14303.getDefaultInstance()) {
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
            C2S_IntroduceTaskCommit_14303 parsedMessage = null;

            try {
               parsedMessage = (C2S_IntroduceTaskCommit_14303)HeroIntroduceMsg.C2S_IntroduceTaskCommit_14303.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_IntroduceTaskCommit_14303)e.getUnfinishedMessage();
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

   public static final class S2C_IntroduceTaskCommit_14304 extends GeneratedMessageV3 implements S2C_IntroduceTaskCommit_14304OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_IntroduceTaskCommit_14304 DEFAULT_INSTANCE = new S2C_IntroduceTaskCommit_14304();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_IntroduceTaskCommit_14304> PARSER = new AbstractParser<S2C_IntroduceTaskCommit_14304>() {
         public S2C_IntroduceTaskCommit_14304 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_IntroduceTaskCommit_14304(input, extensionRegistry);
         }
      };

      private S2C_IntroduceTaskCommit_14304(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_IntroduceTaskCommit_14304() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_IntroduceTaskCommit_14304();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_IntroduceTaskCommit_14304(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_S2C_IntroduceTaskCommit_14304_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_S2C_IntroduceTaskCommit_14304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_IntroduceTaskCommit_14304.class, Builder.class);
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
         } else if (!(obj instanceof S2C_IntroduceTaskCommit_14304)) {
            return super.equals(obj);
         } else {
            S2C_IntroduceTaskCommit_14304 other = (S2C_IntroduceTaskCommit_14304)obj;
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

      public static S2C_IntroduceTaskCommit_14304 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_IntroduceTaskCommit_14304)PARSER.parseFrom(data);
      }

      public static S2C_IntroduceTaskCommit_14304 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IntroduceTaskCommit_14304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IntroduceTaskCommit_14304 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_IntroduceTaskCommit_14304)PARSER.parseFrom(data);
      }

      public static S2C_IntroduceTaskCommit_14304 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IntroduceTaskCommit_14304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IntroduceTaskCommit_14304 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_IntroduceTaskCommit_14304)PARSER.parseFrom(data);
      }

      public static S2C_IntroduceTaskCommit_14304 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IntroduceTaskCommit_14304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IntroduceTaskCommit_14304 parseFrom(InputStream input) throws IOException {
         return (S2C_IntroduceTaskCommit_14304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_IntroduceTaskCommit_14304 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IntroduceTaskCommit_14304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_IntroduceTaskCommit_14304 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_IntroduceTaskCommit_14304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_IntroduceTaskCommit_14304 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IntroduceTaskCommit_14304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_IntroduceTaskCommit_14304 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_IntroduceTaskCommit_14304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_IntroduceTaskCommit_14304 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IntroduceTaskCommit_14304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_IntroduceTaskCommit_14304 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_IntroduceTaskCommit_14304 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_IntroduceTaskCommit_14304> parser() {
         return PARSER;
      }

      public Parser<S2C_IntroduceTaskCommit_14304> getParserForType() {
         return PARSER;
      }

      public S2C_IntroduceTaskCommit_14304 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_IntroduceTaskCommit_14304OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_S2C_IntroduceTaskCommit_14304_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_S2C_IntroduceTaskCommit_14304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_IntroduceTaskCommit_14304.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroIntroduceMsg.S2C_IntroduceTaskCommit_14304.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_S2C_IntroduceTaskCommit_14304_descriptor;
         }

         public S2C_IntroduceTaskCommit_14304 getDefaultInstanceForType() {
            return HeroIntroduceMsg.S2C_IntroduceTaskCommit_14304.getDefaultInstance();
         }

         public S2C_IntroduceTaskCommit_14304 build() {
            S2C_IntroduceTaskCommit_14304 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_IntroduceTaskCommit_14304 buildPartial() {
            S2C_IntroduceTaskCommit_14304 result = new S2C_IntroduceTaskCommit_14304(this);
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
            if (other instanceof S2C_IntroduceTaskCommit_14304) {
               return this.mergeFrom((S2C_IntroduceTaskCommit_14304)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_IntroduceTaskCommit_14304 other) {
            if (other == HeroIntroduceMsg.S2C_IntroduceTaskCommit_14304.getDefaultInstance()) {
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
            S2C_IntroduceTaskCommit_14304 parsedMessage = null;

            try {
               parsedMessage = (S2C_IntroduceTaskCommit_14304)HeroIntroduceMsg.S2C_IntroduceTaskCommit_14304.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_IntroduceTaskCommit_14304)e.getUnfinishedMessage();
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

   public static final class C2S_GroupReward_14305 extends GeneratedMessageV3 implements C2S_GroupReward_14305OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GROUPID_FIELD_NUMBER = 1;
      private int groupId_;
      private byte memoizedIsInitialized;
      private static final C2S_GroupReward_14305 DEFAULT_INSTANCE = new C2S_GroupReward_14305();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GroupReward_14305> PARSER = new AbstractParser<C2S_GroupReward_14305>() {
         public C2S_GroupReward_14305 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GroupReward_14305(input, extensionRegistry);
         }
      };

      private C2S_GroupReward_14305(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GroupReward_14305() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GroupReward_14305();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GroupReward_14305(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.groupId_ = input.readInt32();
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
         return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_C2S_GroupReward_14305_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_C2S_GroupReward_14305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GroupReward_14305.class, Builder.class);
      }

      public boolean hasGroupId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGroupId() {
         return this.groupId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGroupId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.groupId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.groupId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_GroupReward_14305)) {
            return super.equals(obj);
         } else {
            C2S_GroupReward_14305 other = (C2S_GroupReward_14305)obj;
            if (this.hasGroupId() != other.hasGroupId()) {
               return false;
            } else if (this.hasGroupId() && this.getGroupId() != other.getGroupId()) {
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
            if (this.hasGroupId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGroupId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_GroupReward_14305 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GroupReward_14305)PARSER.parseFrom(data);
      }

      public static C2S_GroupReward_14305 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GroupReward_14305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GroupReward_14305 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GroupReward_14305)PARSER.parseFrom(data);
      }

      public static C2S_GroupReward_14305 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GroupReward_14305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GroupReward_14305 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GroupReward_14305)PARSER.parseFrom(data);
      }

      public static C2S_GroupReward_14305 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GroupReward_14305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GroupReward_14305 parseFrom(InputStream input) throws IOException {
         return (C2S_GroupReward_14305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GroupReward_14305 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GroupReward_14305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GroupReward_14305 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GroupReward_14305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GroupReward_14305 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GroupReward_14305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GroupReward_14305 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GroupReward_14305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GroupReward_14305 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GroupReward_14305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GroupReward_14305 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GroupReward_14305 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GroupReward_14305> parser() {
         return PARSER;
      }

      public Parser<C2S_GroupReward_14305> getParserForType() {
         return PARSER;
      }

      public C2S_GroupReward_14305 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GroupReward_14305OrBuilder {
         private int bitField0_;
         private int groupId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_C2S_GroupReward_14305_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_C2S_GroupReward_14305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GroupReward_14305.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroIntroduceMsg.C2S_GroupReward_14305.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.groupId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_C2S_GroupReward_14305_descriptor;
         }

         public C2S_GroupReward_14305 getDefaultInstanceForType() {
            return HeroIntroduceMsg.C2S_GroupReward_14305.getDefaultInstance();
         }

         public C2S_GroupReward_14305 build() {
            C2S_GroupReward_14305 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GroupReward_14305 buildPartial() {
            C2S_GroupReward_14305 result = new C2S_GroupReward_14305(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.groupId_ = this.groupId_;
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
            if (other instanceof C2S_GroupReward_14305) {
               return this.mergeFrom((C2S_GroupReward_14305)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GroupReward_14305 other) {
            if (other == HeroIntroduceMsg.C2S_GroupReward_14305.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGroupId()) {
                  this.setGroupId(other.getGroupId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGroupId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_GroupReward_14305 parsedMessage = null;

            try {
               parsedMessage = (C2S_GroupReward_14305)HeroIntroduceMsg.C2S_GroupReward_14305.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GroupReward_14305)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGroupId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGroupId() {
            return this.groupId_;
         }

         public Builder setGroupId(int value) {
            this.bitField0_ |= 1;
            this.groupId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGroupId() {
            this.bitField0_ &= -2;
            this.groupId_ = 0;
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

   public static final class S2C_GroupReward_14306 extends GeneratedMessageV3 implements S2C_GroupReward_14306OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GROUPID_FIELD_NUMBER = 1;
      private int groupId_;
      private byte memoizedIsInitialized;
      private static final S2C_GroupReward_14306 DEFAULT_INSTANCE = new S2C_GroupReward_14306();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GroupReward_14306> PARSER = new AbstractParser<S2C_GroupReward_14306>() {
         public S2C_GroupReward_14306 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GroupReward_14306(input, extensionRegistry);
         }
      };

      private S2C_GroupReward_14306(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GroupReward_14306() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GroupReward_14306();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GroupReward_14306(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.groupId_ = input.readInt32();
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
         return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_S2C_GroupReward_14306_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_S2C_GroupReward_14306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GroupReward_14306.class, Builder.class);
      }

      public boolean hasGroupId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGroupId() {
         return this.groupId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGroupId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.groupId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.groupId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GroupReward_14306)) {
            return super.equals(obj);
         } else {
            S2C_GroupReward_14306 other = (S2C_GroupReward_14306)obj;
            if (this.hasGroupId() != other.hasGroupId()) {
               return false;
            } else if (this.hasGroupId() && this.getGroupId() != other.getGroupId()) {
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
            if (this.hasGroupId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGroupId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GroupReward_14306 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GroupReward_14306)PARSER.parseFrom(data);
      }

      public static S2C_GroupReward_14306 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GroupReward_14306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GroupReward_14306 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GroupReward_14306)PARSER.parseFrom(data);
      }

      public static S2C_GroupReward_14306 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GroupReward_14306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GroupReward_14306 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GroupReward_14306)PARSER.parseFrom(data);
      }

      public static S2C_GroupReward_14306 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GroupReward_14306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GroupReward_14306 parseFrom(InputStream input) throws IOException {
         return (S2C_GroupReward_14306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GroupReward_14306 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GroupReward_14306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GroupReward_14306 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GroupReward_14306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GroupReward_14306 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GroupReward_14306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GroupReward_14306 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GroupReward_14306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GroupReward_14306 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GroupReward_14306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GroupReward_14306 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GroupReward_14306 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GroupReward_14306> parser() {
         return PARSER;
      }

      public Parser<S2C_GroupReward_14306> getParserForType() {
         return PARSER;
      }

      public S2C_GroupReward_14306 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GroupReward_14306OrBuilder {
         private int bitField0_;
         private int groupId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_S2C_GroupReward_14306_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_S2C_GroupReward_14306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GroupReward_14306.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroIntroduceMsg.S2C_GroupReward_14306.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.groupId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroIntroduceMsg.internal_static_heroIntroduce_com_gzbz_protobuf_S2C_GroupReward_14306_descriptor;
         }

         public S2C_GroupReward_14306 getDefaultInstanceForType() {
            return HeroIntroduceMsg.S2C_GroupReward_14306.getDefaultInstance();
         }

         public S2C_GroupReward_14306 build() {
            S2C_GroupReward_14306 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GroupReward_14306 buildPartial() {
            S2C_GroupReward_14306 result = new S2C_GroupReward_14306(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.groupId_ = this.groupId_;
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
            if (other instanceof S2C_GroupReward_14306) {
               return this.mergeFrom((S2C_GroupReward_14306)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GroupReward_14306 other) {
            if (other == HeroIntroduceMsg.S2C_GroupReward_14306.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGroupId()) {
                  this.setGroupId(other.getGroupId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGroupId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GroupReward_14306 parsedMessage = null;

            try {
               parsedMessage = (S2C_GroupReward_14306)HeroIntroduceMsg.S2C_GroupReward_14306.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GroupReward_14306)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGroupId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGroupId() {
            return this.groupId_;
         }

         public Builder setGroupId(int value) {
            this.bitField0_ |= 1;
            this.groupId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGroupId() {
            this.bitField0_ &= -2;
            this.groupId_ = 0;
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

   public interface C2S_GroupReward_14305OrBuilder extends MessageOrBuilder {
      boolean hasGroupId();

      int getGroupId();
   }

   public interface C2S_IntroduceTaskCommit_14303OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_IntroduceTaskList_14301OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_GroupReward_14306OrBuilder extends MessageOrBuilder {
      boolean hasGroupId();

      int getGroupId();
   }

   public interface S2C_IntroduceTaskCommit_14304OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_IntroduceTaskList_14302OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskListList();

      CommonMsg.Task getTaskList(int index);

      int getTaskListCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskListOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskListOrBuilder(int index);

      List<SimpleInfo> getSimpleInfoList();

      SimpleInfo getSimpleInfo(int index);

      int getSimpleInfoCount();

      List<? extends SimpleInfoOrBuilder> getSimpleInfoOrBuilderList();

      SimpleInfoOrBuilder getSimpleInfoOrBuilder(int index);
   }

   public interface SimpleInfoOrBuilder extends MessageOrBuilder {
      boolean hasGroupId();

      int getGroupId();

      boolean hasState();

      int getState();

      boolean hasEndTime();

      int getEndTime();
   }
}
