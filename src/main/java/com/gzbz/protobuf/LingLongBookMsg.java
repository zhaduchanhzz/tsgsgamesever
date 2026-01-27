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

public final class LingLongBookMsg {
   private static final Descriptors.Descriptor internal_static_lingLong_com_gzbz_protobuf_LingLongBookTaskGroupDate_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_lingLong_com_gzbz_protobuf_LingLongBookTaskGroupDate_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookTaskInfo_28971_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookTaskInfo_28971_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTaskInfo_28972_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTaskInfo_28972_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookTaskReward_28973_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookTaskReward_28973_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTaskReward_28974_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTaskReward_28974_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookBuy_28975_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookBuy_28975_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookBuy_28976_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookBuy_28976_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookUpdate_28977_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookUpdate_28977_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTasks_28978_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTasks_28978_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private LingLongBookMsg() {
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
      String[] descriptorData = new String[]{"\n\u0012LingLongBook.proto\u0012\u001alingLong.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u000eActivity.proto\"p\n\u0019LingLongBookTaskGroupDate\u0012\u000e\n\u0006stepId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0002 \u0002(\u0005\u00122\n\u0004task\u0018\u0003 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\" \n\u001eC2S_LingLongBookTaskInfo_28971\"¡\u0001\n\u001eS2C_LingLongBookTaskInfo_28972\u0012\u0011\n\tstartTime\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0003 \u0002(\u0005\u0012L\n\rtaskGroupData\u0018\u0004 \u0003(\u000b25.lingLong.com.gzbz.protobuf.LingLongBookTaskGroupDate\"2\n C2S_LingLongBookTaskReward_28973\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"2\n S2C_LingLongBookTaskReward_28974\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"8\n\u0019C2S_LingLongBookBuy_28975\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005count\u0018\u0002 \u0002(\u0005\"G\n\u0019S2C_LingLongBookBuy_28976\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005count\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0003 \u0002(\u0005\"-\n\u001cS2C_LingLongBookUpdate_28977\u0012\r\n\u0005level\u0018\u0001 \u0002(\u0005\"Q\n\u001bS2C_LingLongBookTasks_28978\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskDataB&\n\u0011com.gzbz.protobufB\u000fLingLongBookMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), ActivityMsg.getDescriptor()});
      internal_static_lingLong_com_gzbz_protobuf_LingLongBookTaskGroupDate_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_lingLong_com_gzbz_protobuf_LingLongBookTaskGroupDate_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_lingLong_com_gzbz_protobuf_LingLongBookTaskGroupDate_descriptor, new String[]{"StepId", "EndTime", "Task"});
      internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookTaskInfo_28971_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookTaskInfo_28971_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookTaskInfo_28971_descriptor, new String[0]);
      internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTaskInfo_28972_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTaskInfo_28972_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTaskInfo_28972_descriptor, new String[]{"StartTime", "EndTime", "Level", "TaskGroupData"});
      internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookTaskReward_28973_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookTaskReward_28973_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookTaskReward_28973_descriptor, new String[]{"TaskId"});
      internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTaskReward_28974_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTaskReward_28974_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTaskReward_28974_descriptor, new String[]{"TaskId"});
      internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookBuy_28975_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookBuy_28975_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookBuy_28975_descriptor, new String[]{"Type", "Count"});
      internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookBuy_28976_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookBuy_28976_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookBuy_28976_descriptor, new String[]{"Type", "Count", "Level"});
      internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookUpdate_28977_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookUpdate_28977_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookUpdate_28977_descriptor, new String[]{"Level"});
      internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTasks_28978_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTasks_28978_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTasks_28978_descriptor, new String[]{"Task"});
      CommonMsg.getDescriptor();
      ActivityMsg.getDescriptor();
   }

   public static final class LingLongBookTaskGroupDate extends GeneratedMessageV3 implements LingLongBookTaskGroupDateOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STEPID_FIELD_NUMBER = 1;
      private int stepId_;
      public static final int ENDTIME_FIELD_NUMBER = 2;
      private int endTime_;
      public static final int TASK_FIELD_NUMBER = 3;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final LingLongBookTaskGroupDate DEFAULT_INSTANCE = new LingLongBookTaskGroupDate();
      /** @deprecated */
      @Deprecated
      public static final Parser<LingLongBookTaskGroupDate> PARSER = new AbstractParser<LingLongBookTaskGroupDate>() {
         public LingLongBookTaskGroupDate parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new LingLongBookTaskGroupDate(input, extensionRegistry);
         }
      };

      private LingLongBookTaskGroupDate(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private LingLongBookTaskGroupDate() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new LingLongBookTaskGroupDate();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private LingLongBookTaskGroupDate(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.stepId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.endTime_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.task_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.task_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
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
                  this.task_ = Collections.unmodifiableList(this.task_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_LingLongBookTaskGroupDate_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_LingLongBookTaskGroupDate_fieldAccessorTable.ensureFieldAccessorsInitialized(LingLongBookTaskGroupDate.class, Builder.class);
      }

      public boolean hasStepId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStepId() {
         return this.stepId_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public List<ActivityMsg.TaskData> getTaskList() {
         return this.task_;
      }

      public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList() {
         return this.task_;
      }

      public int getTaskCount() {
         return this.task_.size();
      }

      public ActivityMsg.TaskData getTask(int index) {
         return (ActivityMsg.TaskData)this.task_.get(index);
      }

      public ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index) {
         return (ActivityMsg.TaskDataOrBuilder)this.task_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStepId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEndTime()) {
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
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.stepId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.endTime_);
         }

         for(int i = 0; i < this.task_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.task_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.stepId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.endTime_);
            }

            for(int i = 0; i < this.task_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.task_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof LingLongBookTaskGroupDate)) {
            return super.equals(obj);
         } else {
            LingLongBookTaskGroupDate other = (LingLongBookTaskGroupDate)obj;
            if (this.hasStepId() != other.hasStepId()) {
               return false;
            } else if (this.hasStepId() && this.getStepId() != other.getStepId()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (!this.getTaskList().equals(other.getTaskList())) {
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
            if (this.hasStepId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStepId();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.getTaskCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTaskList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static LingLongBookTaskGroupDate parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (LingLongBookTaskGroupDate)PARSER.parseFrom(data);
      }

      public static LingLongBookTaskGroupDate parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (LingLongBookTaskGroupDate)PARSER.parseFrom(data, extensionRegistry);
      }

      public static LingLongBookTaskGroupDate parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (LingLongBookTaskGroupDate)PARSER.parseFrom(data);
      }

      public static LingLongBookTaskGroupDate parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (LingLongBookTaskGroupDate)PARSER.parseFrom(data, extensionRegistry);
      }

      public static LingLongBookTaskGroupDate parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (LingLongBookTaskGroupDate)PARSER.parseFrom(data);
      }

      public static LingLongBookTaskGroupDate parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (LingLongBookTaskGroupDate)PARSER.parseFrom(data, extensionRegistry);
      }

      public static LingLongBookTaskGroupDate parseFrom(InputStream input) throws IOException {
         return (LingLongBookTaskGroupDate)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static LingLongBookTaskGroupDate parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (LingLongBookTaskGroupDate)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static LingLongBookTaskGroupDate parseDelimitedFrom(InputStream input) throws IOException {
         return (LingLongBookTaskGroupDate)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static LingLongBookTaskGroupDate parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (LingLongBookTaskGroupDate)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static LingLongBookTaskGroupDate parseFrom(CodedInputStream input) throws IOException {
         return (LingLongBookTaskGroupDate)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static LingLongBookTaskGroupDate parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (LingLongBookTaskGroupDate)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(LingLongBookTaskGroupDate prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static LingLongBookTaskGroupDate getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<LingLongBookTaskGroupDate> parser() {
         return PARSER;
      }

      public Parser<LingLongBookTaskGroupDate> getParserForType() {
         return PARSER;
      }

      public LingLongBookTaskGroupDate getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LingLongBookTaskGroupDateOrBuilder {
         private int bitField0_;
         private int stepId_;
         private int endTime_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_LingLongBookTaskGroupDate_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_LingLongBookTaskGroupDate_fieldAccessorTable.ensureFieldAccessorsInitialized(LingLongBookTaskGroupDate.class, Builder.class);
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
            if (LingLongBookMsg.LingLongBookTaskGroupDate.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.stepId_ = 0;
            this.bitField0_ &= -2;
            this.endTime_ = 0;
            this.bitField0_ &= -3;
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_LingLongBookTaskGroupDate_descriptor;
         }

         public LingLongBookTaskGroupDate getDefaultInstanceForType() {
            return LingLongBookMsg.LingLongBookTaskGroupDate.getDefaultInstance();
         }

         public LingLongBookTaskGroupDate build() {
            LingLongBookTaskGroupDate result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public LingLongBookTaskGroupDate buildPartial() {
            LingLongBookTaskGroupDate result = new LingLongBookTaskGroupDate(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stepId_ = this.stepId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 2;
            }

            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
                  this.bitField0_ &= -5;
               }

               result.task_ = this.task_;
            } else {
               result.task_ = this.taskBuilder_.build();
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
            if (other instanceof LingLongBookTaskGroupDate) {
               return this.mergeFrom((LingLongBookTaskGroupDate)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(LingLongBookTaskGroupDate other) {
            if (other == LingLongBookMsg.LingLongBookTaskGroupDate.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStepId()) {
                  this.setStepId(other.getStepId());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (this.taskBuilder_ == null) {
                  if (!other.task_.isEmpty()) {
                     if (this.task_.isEmpty()) {
                        this.task_ = other.task_;
                        this.bitField0_ &= -5;
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
                     this.bitField0_ &= -5;
                     this.taskBuilder_ = LingLongBookMsg.LingLongBookTaskGroupDate.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            if (!this.hasStepId()) {
               return false;
            } else if (!this.hasEndTime()) {
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
            LingLongBookTaskGroupDate parsedMessage = null;

            try {
               parsedMessage = (LingLongBookTaskGroupDate)LingLongBookMsg.LingLongBookTaskGroupDate.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (LingLongBookTaskGroupDate)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStepId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStepId() {
            return this.stepId_;
         }

         public Builder setStepId(int value) {
            this.bitField0_ |= 1;
            this.stepId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStepId() {
            this.bitField0_ &= -2;
            this.stepId_ = 0;
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

         private void ensureTaskIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.task_ = new ArrayList(this.task_);
               this.bitField0_ |= 4;
            }

         }

         public List<ActivityMsg.TaskData> getTaskList() {
            return this.taskBuilder_ == null ? Collections.unmodifiableList(this.task_) : this.taskBuilder_.getMessageList();
         }

         public int getTaskCount() {
            return this.taskBuilder_ == null ? this.task_.size() : this.taskBuilder_.getCount();
         }

         public ActivityMsg.TaskData getTask(int index) {
            return this.taskBuilder_ == null ? (ActivityMsg.TaskData)this.task_.get(index) : (ActivityMsg.TaskData)this.taskBuilder_.getMessage(index);
         }

         public Builder setTask(int index, ActivityMsg.TaskData value) {
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

         public Builder setTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTask(ActivityMsg.TaskData value) {
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

         public Builder addTask(int index, ActivityMsg.TaskData value) {
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

         public Builder addTask(ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTask(Iterable<? extends ActivityMsg.TaskData> values) {
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
               this.bitField0_ &= -5;
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

         public ActivityMsg.TaskData.Builder getTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index) {
            return this.taskBuilder_ == null ? (ActivityMsg.TaskDataOrBuilder)this.task_.get(index) : (ActivityMsg.TaskDataOrBuilder)this.taskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList() {
            return this.taskBuilder_ != null ? this.taskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.task_);
         }

         public ActivityMsg.TaskData.Builder addTaskBuilder() {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().addBuilder(ActivityMsg.TaskData.getDefaultInstance());
         }

         public ActivityMsg.TaskData.Builder addTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().addBuilder(index, ActivityMsg.TaskData.getDefaultInstance());
         }

         public List<ActivityMsg.TaskData.Builder> getTaskBuilderList() {
            return this.getTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> getTaskFieldBuilder() {
            if (this.taskBuilder_ == null) {
               this.taskBuilder_ = new RepeatedFieldBuilderV3(this.task_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class C2S_LingLongBookTaskInfo_28971 extends GeneratedMessageV3 implements C2S_LingLongBookTaskInfo_28971OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LingLongBookTaskInfo_28971 DEFAULT_INSTANCE = new C2S_LingLongBookTaskInfo_28971();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LingLongBookTaskInfo_28971> PARSER = new AbstractParser<C2S_LingLongBookTaskInfo_28971>() {
         public C2S_LingLongBookTaskInfo_28971 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LingLongBookTaskInfo_28971(input, extensionRegistry);
         }
      };

      private C2S_LingLongBookTaskInfo_28971(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LingLongBookTaskInfo_28971() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LingLongBookTaskInfo_28971();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LingLongBookTaskInfo_28971(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookTaskInfo_28971_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookTaskInfo_28971_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LingLongBookTaskInfo_28971.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LingLongBookTaskInfo_28971)) {
            return super.equals(obj);
         } else {
            C2S_LingLongBookTaskInfo_28971 other = (C2S_LingLongBookTaskInfo_28971)obj;
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

      public static C2S_LingLongBookTaskInfo_28971 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LingLongBookTaskInfo_28971)PARSER.parseFrom(data);
      }

      public static C2S_LingLongBookTaskInfo_28971 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LingLongBookTaskInfo_28971)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LingLongBookTaskInfo_28971 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LingLongBookTaskInfo_28971)PARSER.parseFrom(data);
      }

      public static C2S_LingLongBookTaskInfo_28971 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LingLongBookTaskInfo_28971)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LingLongBookTaskInfo_28971 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LingLongBookTaskInfo_28971)PARSER.parseFrom(data);
      }

      public static C2S_LingLongBookTaskInfo_28971 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LingLongBookTaskInfo_28971)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LingLongBookTaskInfo_28971 parseFrom(InputStream input) throws IOException {
         return (C2S_LingLongBookTaskInfo_28971)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LingLongBookTaskInfo_28971 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LingLongBookTaskInfo_28971)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LingLongBookTaskInfo_28971 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LingLongBookTaskInfo_28971)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LingLongBookTaskInfo_28971 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LingLongBookTaskInfo_28971)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LingLongBookTaskInfo_28971 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LingLongBookTaskInfo_28971)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LingLongBookTaskInfo_28971 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LingLongBookTaskInfo_28971)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LingLongBookTaskInfo_28971 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LingLongBookTaskInfo_28971 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LingLongBookTaskInfo_28971> parser() {
         return PARSER;
      }

      public Parser<C2S_LingLongBookTaskInfo_28971> getParserForType() {
         return PARSER;
      }

      public C2S_LingLongBookTaskInfo_28971 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LingLongBookTaskInfo_28971OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookTaskInfo_28971_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookTaskInfo_28971_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LingLongBookTaskInfo_28971.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LingLongBookMsg.C2S_LingLongBookTaskInfo_28971.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookTaskInfo_28971_descriptor;
         }

         public C2S_LingLongBookTaskInfo_28971 getDefaultInstanceForType() {
            return LingLongBookMsg.C2S_LingLongBookTaskInfo_28971.getDefaultInstance();
         }

         public C2S_LingLongBookTaskInfo_28971 build() {
            C2S_LingLongBookTaskInfo_28971 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LingLongBookTaskInfo_28971 buildPartial() {
            C2S_LingLongBookTaskInfo_28971 result = new C2S_LingLongBookTaskInfo_28971(this);
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
            if (other instanceof C2S_LingLongBookTaskInfo_28971) {
               return this.mergeFrom((C2S_LingLongBookTaskInfo_28971)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LingLongBookTaskInfo_28971 other) {
            if (other == LingLongBookMsg.C2S_LingLongBookTaskInfo_28971.getDefaultInstance()) {
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
            C2S_LingLongBookTaskInfo_28971 parsedMessage = null;

            try {
               parsedMessage = (C2S_LingLongBookTaskInfo_28971)LingLongBookMsg.C2S_LingLongBookTaskInfo_28971.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LingLongBookTaskInfo_28971)e.getUnfinishedMessage();
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

   public static final class S2C_LingLongBookTaskInfo_28972 extends GeneratedMessageV3 implements S2C_LingLongBookTaskInfo_28972OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STARTTIME_FIELD_NUMBER = 1;
      private int startTime_;
      public static final int ENDTIME_FIELD_NUMBER = 2;
      private int endTime_;
      public static final int LEVEL_FIELD_NUMBER = 3;
      private int level_;
      public static final int TASKGROUPDATA_FIELD_NUMBER = 4;
      private List<LingLongBookTaskGroupDate> taskGroupData_;
      private byte memoizedIsInitialized;
      private static final S2C_LingLongBookTaskInfo_28972 DEFAULT_INSTANCE = new S2C_LingLongBookTaskInfo_28972();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LingLongBookTaskInfo_28972> PARSER = new AbstractParser<S2C_LingLongBookTaskInfo_28972>() {
         public S2C_LingLongBookTaskInfo_28972 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LingLongBookTaskInfo_28972(input, extensionRegistry);
         }
      };

      private S2C_LingLongBookTaskInfo_28972(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LingLongBookTaskInfo_28972() {
         this.memoizedIsInitialized = -1;
         this.taskGroupData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LingLongBookTaskInfo_28972();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LingLongBookTaskInfo_28972(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.level_ = input.readInt32();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.taskGroupData_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.taskGroupData_.add(input.readMessage(LingLongBookMsg.LingLongBookTaskGroupDate.PARSER, extensionRegistry));
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
               if ((mutable_bitField0_ & 8) != 0) {
                  this.taskGroupData_ = Collections.unmodifiableList(this.taskGroupData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTaskInfo_28972_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTaskInfo_28972_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LingLongBookTaskInfo_28972.class, Builder.class);
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

      public boolean hasLevel() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public List<LingLongBookTaskGroupDate> getTaskGroupDataList() {
         return this.taskGroupData_;
      }

      public List<? extends LingLongBookTaskGroupDateOrBuilder> getTaskGroupDataOrBuilderList() {
         return this.taskGroupData_;
      }

      public int getTaskGroupDataCount() {
         return this.taskGroupData_.size();
      }

      public LingLongBookTaskGroupDate getTaskGroupData(int index) {
         return (LingLongBookTaskGroupDate)this.taskGroupData_.get(index);
      }

      public LingLongBookTaskGroupDateOrBuilder getTaskGroupDataOrBuilder(int index) {
         return (LingLongBookTaskGroupDateOrBuilder)this.taskGroupData_.get(index);
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
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getTaskGroupDataCount(); ++i) {
               if (!this.getTaskGroupData(i).isInitialized()) {
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
            output.writeInt32(1, this.startTime_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.endTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.level_);
         }

         for(int i = 0; i < this.taskGroupData_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.taskGroupData_.get(i));
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
               size += CodedOutputStream.computeInt32Size(3, this.level_);
            }

            for(int i = 0; i < this.taskGroupData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.taskGroupData_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LingLongBookTaskInfo_28972)) {
            return super.equals(obj);
         } else {
            S2C_LingLongBookTaskInfo_28972 other = (S2C_LingLongBookTaskInfo_28972)obj;
            if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (!this.getTaskGroupDataList().equals(other.getTaskGroupDataList())) {
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

            if (this.hasLevel()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLevel();
            }

            if (this.getTaskGroupDataCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTaskGroupDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LingLongBookTaskInfo_28972 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookTaskInfo_28972)PARSER.parseFrom(data);
      }

      public static S2C_LingLongBookTaskInfo_28972 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookTaskInfo_28972)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LingLongBookTaskInfo_28972 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookTaskInfo_28972)PARSER.parseFrom(data);
      }

      public static S2C_LingLongBookTaskInfo_28972 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookTaskInfo_28972)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LingLongBookTaskInfo_28972 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookTaskInfo_28972)PARSER.parseFrom(data);
      }

      public static S2C_LingLongBookTaskInfo_28972 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookTaskInfo_28972)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LingLongBookTaskInfo_28972 parseFrom(InputStream input) throws IOException {
         return (S2C_LingLongBookTaskInfo_28972)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LingLongBookTaskInfo_28972 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LingLongBookTaskInfo_28972)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LingLongBookTaskInfo_28972 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LingLongBookTaskInfo_28972)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LingLongBookTaskInfo_28972 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LingLongBookTaskInfo_28972)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LingLongBookTaskInfo_28972 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LingLongBookTaskInfo_28972)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LingLongBookTaskInfo_28972 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LingLongBookTaskInfo_28972)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LingLongBookTaskInfo_28972 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LingLongBookTaskInfo_28972 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LingLongBookTaskInfo_28972> parser() {
         return PARSER;
      }

      public Parser<S2C_LingLongBookTaskInfo_28972> getParserForType() {
         return PARSER;
      }

      public S2C_LingLongBookTaskInfo_28972 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LingLongBookTaskInfo_28972OrBuilder {
         private int bitField0_;
         private int startTime_;
         private int endTime_;
         private int level_;
         private List<LingLongBookTaskGroupDate> taskGroupData_;
         private RepeatedFieldBuilderV3<LingLongBookTaskGroupDate, LingLongBookTaskGroupDate.Builder, LingLongBookTaskGroupDateOrBuilder> taskGroupDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTaskInfo_28972_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTaskInfo_28972_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LingLongBookTaskInfo_28972.class, Builder.class);
         }

         private Builder() {
            this.taskGroupData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.taskGroupData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LingLongBookMsg.S2C_LingLongBookTaskInfo_28972.alwaysUseFieldBuilders) {
               this.getTaskGroupDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.startTime_ = 0;
            this.bitField0_ &= -2;
            this.endTime_ = 0;
            this.bitField0_ &= -3;
            this.level_ = 0;
            this.bitField0_ &= -5;
            if (this.taskGroupDataBuilder_ == null) {
               this.taskGroupData_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.taskGroupDataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTaskInfo_28972_descriptor;
         }

         public S2C_LingLongBookTaskInfo_28972 getDefaultInstanceForType() {
            return LingLongBookMsg.S2C_LingLongBookTaskInfo_28972.getDefaultInstance();
         }

         public S2C_LingLongBookTaskInfo_28972 build() {
            S2C_LingLongBookTaskInfo_28972 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LingLongBookTaskInfo_28972 buildPartial() {
            S2C_LingLongBookTaskInfo_28972 result = new S2C_LingLongBookTaskInfo_28972(this);
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
               result.level_ = this.level_;
               to_bitField0_ |= 4;
            }

            if (this.taskGroupDataBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.taskGroupData_ = Collections.unmodifiableList(this.taskGroupData_);
                  this.bitField0_ &= -9;
               }

               result.taskGroupData_ = this.taskGroupData_;
            } else {
               result.taskGroupData_ = this.taskGroupDataBuilder_.build();
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
            if (other instanceof S2C_LingLongBookTaskInfo_28972) {
               return this.mergeFrom((S2C_LingLongBookTaskInfo_28972)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LingLongBookTaskInfo_28972 other) {
            if (other == LingLongBookMsg.S2C_LingLongBookTaskInfo_28972.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (this.taskGroupDataBuilder_ == null) {
                  if (!other.taskGroupData_.isEmpty()) {
                     if (this.taskGroupData_.isEmpty()) {
                        this.taskGroupData_ = other.taskGroupData_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureTaskGroupDataIsMutable();
                        this.taskGroupData_.addAll(other.taskGroupData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.taskGroupData_.isEmpty()) {
                  if (this.taskGroupDataBuilder_.isEmpty()) {
                     this.taskGroupDataBuilder_.dispose();
                     this.taskGroupDataBuilder_ = null;
                     this.taskGroupData_ = other.taskGroupData_;
                     this.bitField0_ &= -9;
                     this.taskGroupDataBuilder_ = LingLongBookMsg.S2C_LingLongBookTaskInfo_28972.alwaysUseFieldBuilders ? this.getTaskGroupDataFieldBuilder() : null;
                  } else {
                     this.taskGroupDataBuilder_.addAllMessages(other.taskGroupData_);
                  }
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
            } else if (!this.hasLevel()) {
               return false;
            } else {
               for(int i = 0; i < this.getTaskGroupDataCount(); ++i) {
                  if (!this.getTaskGroupData(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LingLongBookTaskInfo_28972 parsedMessage = null;

            try {
               parsedMessage = (S2C_LingLongBookTaskInfo_28972)LingLongBookMsg.S2C_LingLongBookTaskInfo_28972.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LingLongBookTaskInfo_28972)e.getUnfinishedMessage();
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

         public boolean hasLevel() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 4;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -5;
            this.level_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureTaskGroupDataIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.taskGroupData_ = new ArrayList(this.taskGroupData_);
               this.bitField0_ |= 8;
            }

         }

         public List<LingLongBookTaskGroupDate> getTaskGroupDataList() {
            return this.taskGroupDataBuilder_ == null ? Collections.unmodifiableList(this.taskGroupData_) : this.taskGroupDataBuilder_.getMessageList();
         }

         public int getTaskGroupDataCount() {
            return this.taskGroupDataBuilder_ == null ? this.taskGroupData_.size() : this.taskGroupDataBuilder_.getCount();
         }

         public LingLongBookTaskGroupDate getTaskGroupData(int index) {
            return this.taskGroupDataBuilder_ == null ? (LingLongBookTaskGroupDate)this.taskGroupData_.get(index) : (LingLongBookTaskGroupDate)this.taskGroupDataBuilder_.getMessage(index);
         }

         public Builder setTaskGroupData(int index, LingLongBookTaskGroupDate value) {
            if (this.taskGroupDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskGroupDataIsMutable();
               this.taskGroupData_.set(index, value);
               this.onChanged();
            } else {
               this.taskGroupDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTaskGroupData(int index, LingLongBookTaskGroupDate.Builder builderForValue) {
            if (this.taskGroupDataBuilder_ == null) {
               this.ensureTaskGroupDataIsMutable();
               this.taskGroupData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskGroupDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTaskGroupData(LingLongBookTaskGroupDate value) {
            if (this.taskGroupDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskGroupDataIsMutable();
               this.taskGroupData_.add(value);
               this.onChanged();
            } else {
               this.taskGroupDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTaskGroupData(int index, LingLongBookTaskGroupDate value) {
            if (this.taskGroupDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskGroupDataIsMutable();
               this.taskGroupData_.add(index, value);
               this.onChanged();
            } else {
               this.taskGroupDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTaskGroupData(LingLongBookTaskGroupDate.Builder builderForValue) {
            if (this.taskGroupDataBuilder_ == null) {
               this.ensureTaskGroupDataIsMutable();
               this.taskGroupData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskGroupDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTaskGroupData(int index, LingLongBookTaskGroupDate.Builder builderForValue) {
            if (this.taskGroupDataBuilder_ == null) {
               this.ensureTaskGroupDataIsMutable();
               this.taskGroupData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskGroupDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTaskGroupData(Iterable<? extends LingLongBookTaskGroupDate> values) {
            if (this.taskGroupDataBuilder_ == null) {
               this.ensureTaskGroupDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.taskGroupData_);
               this.onChanged();
            } else {
               this.taskGroupDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTaskGroupData() {
            if (this.taskGroupDataBuilder_ == null) {
               this.taskGroupData_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.taskGroupDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeTaskGroupData(int index) {
            if (this.taskGroupDataBuilder_ == null) {
               this.ensureTaskGroupDataIsMutable();
               this.taskGroupData_.remove(index);
               this.onChanged();
            } else {
               this.taskGroupDataBuilder_.remove(index);
            }

            return this;
         }

         public LingLongBookTaskGroupDate.Builder getTaskGroupDataBuilder(int index) {
            return (LingLongBookTaskGroupDate.Builder)this.getTaskGroupDataFieldBuilder().getBuilder(index);
         }

         public LingLongBookTaskGroupDateOrBuilder getTaskGroupDataOrBuilder(int index) {
            return this.taskGroupDataBuilder_ == null ? (LingLongBookTaskGroupDateOrBuilder)this.taskGroupData_.get(index) : (LingLongBookTaskGroupDateOrBuilder)this.taskGroupDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends LingLongBookTaskGroupDateOrBuilder> getTaskGroupDataOrBuilderList() {
            return this.taskGroupDataBuilder_ != null ? this.taskGroupDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.taskGroupData_);
         }

         public LingLongBookTaskGroupDate.Builder addTaskGroupDataBuilder() {
            return (LingLongBookTaskGroupDate.Builder)this.getTaskGroupDataFieldBuilder().addBuilder(LingLongBookMsg.LingLongBookTaskGroupDate.getDefaultInstance());
         }

         public LingLongBookTaskGroupDate.Builder addTaskGroupDataBuilder(int index) {
            return (LingLongBookTaskGroupDate.Builder)this.getTaskGroupDataFieldBuilder().addBuilder(index, LingLongBookMsg.LingLongBookTaskGroupDate.getDefaultInstance());
         }

         public List<LingLongBookTaskGroupDate.Builder> getTaskGroupDataBuilderList() {
            return this.getTaskGroupDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<LingLongBookTaskGroupDate, LingLongBookTaskGroupDate.Builder, LingLongBookTaskGroupDateOrBuilder> getTaskGroupDataFieldBuilder() {
            if (this.taskGroupDataBuilder_ == null) {
               this.taskGroupDataBuilder_ = new RepeatedFieldBuilderV3(this.taskGroupData_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.taskGroupData_ = null;
            }

            return this.taskGroupDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_LingLongBookTaskReward_28973 extends GeneratedMessageV3 implements C2S_LingLongBookTaskReward_28973OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_LingLongBookTaskReward_28973 DEFAULT_INSTANCE = new C2S_LingLongBookTaskReward_28973();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LingLongBookTaskReward_28973> PARSER = new AbstractParser<C2S_LingLongBookTaskReward_28973>() {
         public C2S_LingLongBookTaskReward_28973 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LingLongBookTaskReward_28973(input, extensionRegistry);
         }
      };

      private C2S_LingLongBookTaskReward_28973(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LingLongBookTaskReward_28973() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LingLongBookTaskReward_28973();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LingLongBookTaskReward_28973(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookTaskReward_28973_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookTaskReward_28973_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LingLongBookTaskReward_28973.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LingLongBookTaskReward_28973)) {
            return super.equals(obj);
         } else {
            C2S_LingLongBookTaskReward_28973 other = (C2S_LingLongBookTaskReward_28973)obj;
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

      public static C2S_LingLongBookTaskReward_28973 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LingLongBookTaskReward_28973)PARSER.parseFrom(data);
      }

      public static C2S_LingLongBookTaskReward_28973 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LingLongBookTaskReward_28973)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LingLongBookTaskReward_28973 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LingLongBookTaskReward_28973)PARSER.parseFrom(data);
      }

      public static C2S_LingLongBookTaskReward_28973 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LingLongBookTaskReward_28973)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LingLongBookTaskReward_28973 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LingLongBookTaskReward_28973)PARSER.parseFrom(data);
      }

      public static C2S_LingLongBookTaskReward_28973 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LingLongBookTaskReward_28973)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LingLongBookTaskReward_28973 parseFrom(InputStream input) throws IOException {
         return (C2S_LingLongBookTaskReward_28973)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LingLongBookTaskReward_28973 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LingLongBookTaskReward_28973)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LingLongBookTaskReward_28973 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LingLongBookTaskReward_28973)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LingLongBookTaskReward_28973 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LingLongBookTaskReward_28973)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LingLongBookTaskReward_28973 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LingLongBookTaskReward_28973)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LingLongBookTaskReward_28973 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LingLongBookTaskReward_28973)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LingLongBookTaskReward_28973 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LingLongBookTaskReward_28973 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LingLongBookTaskReward_28973> parser() {
         return PARSER;
      }

      public Parser<C2S_LingLongBookTaskReward_28973> getParserForType() {
         return PARSER;
      }

      public C2S_LingLongBookTaskReward_28973 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LingLongBookTaskReward_28973OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookTaskReward_28973_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookTaskReward_28973_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LingLongBookTaskReward_28973.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LingLongBookMsg.C2S_LingLongBookTaskReward_28973.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookTaskReward_28973_descriptor;
         }

         public C2S_LingLongBookTaskReward_28973 getDefaultInstanceForType() {
            return LingLongBookMsg.C2S_LingLongBookTaskReward_28973.getDefaultInstance();
         }

         public C2S_LingLongBookTaskReward_28973 build() {
            C2S_LingLongBookTaskReward_28973 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LingLongBookTaskReward_28973 buildPartial() {
            C2S_LingLongBookTaskReward_28973 result = new C2S_LingLongBookTaskReward_28973(this);
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
            if (other instanceof C2S_LingLongBookTaskReward_28973) {
               return this.mergeFrom((C2S_LingLongBookTaskReward_28973)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LingLongBookTaskReward_28973 other) {
            if (other == LingLongBookMsg.C2S_LingLongBookTaskReward_28973.getDefaultInstance()) {
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
            C2S_LingLongBookTaskReward_28973 parsedMessage = null;

            try {
               parsedMessage = (C2S_LingLongBookTaskReward_28973)LingLongBookMsg.C2S_LingLongBookTaskReward_28973.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LingLongBookTaskReward_28973)e.getUnfinishedMessage();
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

   public static final class S2C_LingLongBookTaskReward_28974 extends GeneratedMessageV3 implements S2C_LingLongBookTaskReward_28974OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_LingLongBookTaskReward_28974 DEFAULT_INSTANCE = new S2C_LingLongBookTaskReward_28974();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LingLongBookTaskReward_28974> PARSER = new AbstractParser<S2C_LingLongBookTaskReward_28974>() {
         public S2C_LingLongBookTaskReward_28974 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LingLongBookTaskReward_28974(input, extensionRegistry);
         }
      };

      private S2C_LingLongBookTaskReward_28974(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LingLongBookTaskReward_28974() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LingLongBookTaskReward_28974();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LingLongBookTaskReward_28974(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTaskReward_28974_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTaskReward_28974_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LingLongBookTaskReward_28974.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LingLongBookTaskReward_28974)) {
            return super.equals(obj);
         } else {
            S2C_LingLongBookTaskReward_28974 other = (S2C_LingLongBookTaskReward_28974)obj;
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

      public static S2C_LingLongBookTaskReward_28974 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookTaskReward_28974)PARSER.parseFrom(data);
      }

      public static S2C_LingLongBookTaskReward_28974 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookTaskReward_28974)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LingLongBookTaskReward_28974 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookTaskReward_28974)PARSER.parseFrom(data);
      }

      public static S2C_LingLongBookTaskReward_28974 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookTaskReward_28974)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LingLongBookTaskReward_28974 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookTaskReward_28974)PARSER.parseFrom(data);
      }

      public static S2C_LingLongBookTaskReward_28974 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookTaskReward_28974)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LingLongBookTaskReward_28974 parseFrom(InputStream input) throws IOException {
         return (S2C_LingLongBookTaskReward_28974)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LingLongBookTaskReward_28974 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LingLongBookTaskReward_28974)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LingLongBookTaskReward_28974 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LingLongBookTaskReward_28974)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LingLongBookTaskReward_28974 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LingLongBookTaskReward_28974)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LingLongBookTaskReward_28974 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LingLongBookTaskReward_28974)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LingLongBookTaskReward_28974 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LingLongBookTaskReward_28974)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LingLongBookTaskReward_28974 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LingLongBookTaskReward_28974 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LingLongBookTaskReward_28974> parser() {
         return PARSER;
      }

      public Parser<S2C_LingLongBookTaskReward_28974> getParserForType() {
         return PARSER;
      }

      public S2C_LingLongBookTaskReward_28974 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LingLongBookTaskReward_28974OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTaskReward_28974_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTaskReward_28974_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LingLongBookTaskReward_28974.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LingLongBookMsg.S2C_LingLongBookTaskReward_28974.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTaskReward_28974_descriptor;
         }

         public S2C_LingLongBookTaskReward_28974 getDefaultInstanceForType() {
            return LingLongBookMsg.S2C_LingLongBookTaskReward_28974.getDefaultInstance();
         }

         public S2C_LingLongBookTaskReward_28974 build() {
            S2C_LingLongBookTaskReward_28974 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LingLongBookTaskReward_28974 buildPartial() {
            S2C_LingLongBookTaskReward_28974 result = new S2C_LingLongBookTaskReward_28974(this);
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
            if (other instanceof S2C_LingLongBookTaskReward_28974) {
               return this.mergeFrom((S2C_LingLongBookTaskReward_28974)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LingLongBookTaskReward_28974 other) {
            if (other == LingLongBookMsg.S2C_LingLongBookTaskReward_28974.getDefaultInstance()) {
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
            S2C_LingLongBookTaskReward_28974 parsedMessage = null;

            try {
               parsedMessage = (S2C_LingLongBookTaskReward_28974)LingLongBookMsg.S2C_LingLongBookTaskReward_28974.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LingLongBookTaskReward_28974)e.getUnfinishedMessage();
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

   public static final class C2S_LingLongBookBuy_28975 extends GeneratedMessageV3 implements C2S_LingLongBookBuy_28975OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int COUNT_FIELD_NUMBER = 2;
      private int count_;
      private byte memoizedIsInitialized;
      private static final C2S_LingLongBookBuy_28975 DEFAULT_INSTANCE = new C2S_LingLongBookBuy_28975();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LingLongBookBuy_28975> PARSER = new AbstractParser<C2S_LingLongBookBuy_28975>() {
         public C2S_LingLongBookBuy_28975 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LingLongBookBuy_28975(input, extensionRegistry);
         }
      };

      private C2S_LingLongBookBuy_28975(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LingLongBookBuy_28975() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LingLongBookBuy_28975();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LingLongBookBuy_28975(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.type_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.count_ = input.readInt32();
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
         return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookBuy_28975_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookBuy_28975_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LingLongBookBuy_28975.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCount() {
         return this.count_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.type_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.count_);
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
               size += CodedOutputStream.computeInt32Size(1, this.type_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.count_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LingLongBookBuy_28975)) {
            return super.equals(obj);
         } else {
            C2S_LingLongBookBuy_28975 other = (C2S_LingLongBookBuy_28975)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasCount() != other.hasCount()) {
               return false;
            } else if (this.hasCount() && this.getCount() != other.getCount()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            if (this.hasCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LingLongBookBuy_28975 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LingLongBookBuy_28975)PARSER.parseFrom(data);
      }

      public static C2S_LingLongBookBuy_28975 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LingLongBookBuy_28975)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LingLongBookBuy_28975 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LingLongBookBuy_28975)PARSER.parseFrom(data);
      }

      public static C2S_LingLongBookBuy_28975 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LingLongBookBuy_28975)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LingLongBookBuy_28975 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LingLongBookBuy_28975)PARSER.parseFrom(data);
      }

      public static C2S_LingLongBookBuy_28975 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LingLongBookBuy_28975)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LingLongBookBuy_28975 parseFrom(InputStream input) throws IOException {
         return (C2S_LingLongBookBuy_28975)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LingLongBookBuy_28975 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LingLongBookBuy_28975)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LingLongBookBuy_28975 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LingLongBookBuy_28975)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LingLongBookBuy_28975 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LingLongBookBuy_28975)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LingLongBookBuy_28975 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LingLongBookBuy_28975)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LingLongBookBuy_28975 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LingLongBookBuy_28975)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LingLongBookBuy_28975 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LingLongBookBuy_28975 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LingLongBookBuy_28975> parser() {
         return PARSER;
      }

      public Parser<C2S_LingLongBookBuy_28975> getParserForType() {
         return PARSER;
      }

      public C2S_LingLongBookBuy_28975 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LingLongBookBuy_28975OrBuilder {
         private int bitField0_;
         private int type_;
         private int count_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookBuy_28975_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookBuy_28975_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LingLongBookBuy_28975.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LingLongBookMsg.C2S_LingLongBookBuy_28975.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.count_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_C2S_LingLongBookBuy_28975_descriptor;
         }

         public C2S_LingLongBookBuy_28975 getDefaultInstanceForType() {
            return LingLongBookMsg.C2S_LingLongBookBuy_28975.getDefaultInstance();
         }

         public C2S_LingLongBookBuy_28975 build() {
            C2S_LingLongBookBuy_28975 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LingLongBookBuy_28975 buildPartial() {
            C2S_LingLongBookBuy_28975 result = new C2S_LingLongBookBuy_28975(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.count_ = this.count_;
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
            if (other instanceof C2S_LingLongBookBuy_28975) {
               return this.mergeFrom((C2S_LingLongBookBuy_28975)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LingLongBookBuy_28975 other) {
            if (other == LingLongBookMsg.C2S_LingLongBookBuy_28975.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasCount()) {
                  this.setCount(other.getCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else {
               return this.hasCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_LingLongBookBuy_28975 parsedMessage = null;

            try {
               parsedMessage = (C2S_LingLongBookBuy_28975)LingLongBookMsg.C2S_LingLongBookBuy_28975.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LingLongBookBuy_28975)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 1;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCount() {
            return this.count_;
         }

         public Builder setCount(int value) {
            this.bitField0_ |= 2;
            this.count_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCount() {
            this.bitField0_ &= -3;
            this.count_ = 0;
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

   public static final class S2C_LingLongBookBuy_28976 extends GeneratedMessageV3 implements S2C_LingLongBookBuy_28976OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int COUNT_FIELD_NUMBER = 2;
      private int count_;
      public static final int LEVEL_FIELD_NUMBER = 3;
      private int level_;
      private byte memoizedIsInitialized;
      private static final S2C_LingLongBookBuy_28976 DEFAULT_INSTANCE = new S2C_LingLongBookBuy_28976();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LingLongBookBuy_28976> PARSER = new AbstractParser<S2C_LingLongBookBuy_28976>() {
         public S2C_LingLongBookBuy_28976 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LingLongBookBuy_28976(input, extensionRegistry);
         }
      };

      private S2C_LingLongBookBuy_28976(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LingLongBookBuy_28976() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LingLongBookBuy_28976();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LingLongBookBuy_28976(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.type_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.count_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.level_ = input.readInt32();
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
         return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookBuy_28976_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookBuy_28976_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LingLongBookBuy_28976.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCount() {
         return this.count_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.type_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.count_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.level_);
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
               size += CodedOutputStream.computeInt32Size(1, this.type_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.count_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.level_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LingLongBookBuy_28976)) {
            return super.equals(obj);
         } else {
            S2C_LingLongBookBuy_28976 other = (S2C_LingLongBookBuy_28976)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasCount() != other.hasCount()) {
               return false;
            } else if (this.hasCount() && this.getCount() != other.getCount()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            if (this.hasCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCount();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLevel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LingLongBookBuy_28976 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookBuy_28976)PARSER.parseFrom(data);
      }

      public static S2C_LingLongBookBuy_28976 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookBuy_28976)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LingLongBookBuy_28976 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookBuy_28976)PARSER.parseFrom(data);
      }

      public static S2C_LingLongBookBuy_28976 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookBuy_28976)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LingLongBookBuy_28976 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookBuy_28976)PARSER.parseFrom(data);
      }

      public static S2C_LingLongBookBuy_28976 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookBuy_28976)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LingLongBookBuy_28976 parseFrom(InputStream input) throws IOException {
         return (S2C_LingLongBookBuy_28976)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LingLongBookBuy_28976 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LingLongBookBuy_28976)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LingLongBookBuy_28976 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LingLongBookBuy_28976)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LingLongBookBuy_28976 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LingLongBookBuy_28976)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LingLongBookBuy_28976 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LingLongBookBuy_28976)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LingLongBookBuy_28976 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LingLongBookBuy_28976)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LingLongBookBuy_28976 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LingLongBookBuy_28976 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LingLongBookBuy_28976> parser() {
         return PARSER;
      }

      public Parser<S2C_LingLongBookBuy_28976> getParserForType() {
         return PARSER;
      }

      public S2C_LingLongBookBuy_28976 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LingLongBookBuy_28976OrBuilder {
         private int bitField0_;
         private int type_;
         private int count_;
         private int level_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookBuy_28976_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookBuy_28976_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LingLongBookBuy_28976.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LingLongBookMsg.S2C_LingLongBookBuy_28976.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.count_ = 0;
            this.bitField0_ &= -3;
            this.level_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookBuy_28976_descriptor;
         }

         public S2C_LingLongBookBuy_28976 getDefaultInstanceForType() {
            return LingLongBookMsg.S2C_LingLongBookBuy_28976.getDefaultInstance();
         }

         public S2C_LingLongBookBuy_28976 build() {
            S2C_LingLongBookBuy_28976 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LingLongBookBuy_28976 buildPartial() {
            S2C_LingLongBookBuy_28976 result = new S2C_LingLongBookBuy_28976(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.count_ = this.count_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.level_ = this.level_;
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
            if (other instanceof S2C_LingLongBookBuy_28976) {
               return this.mergeFrom((S2C_LingLongBookBuy_28976)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LingLongBookBuy_28976 other) {
            if (other == LingLongBookMsg.S2C_LingLongBookBuy_28976.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasCount()) {
                  this.setCount(other.getCount());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else if (!this.hasCount()) {
               return false;
            } else {
               return this.hasLevel();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LingLongBookBuy_28976 parsedMessage = null;

            try {
               parsedMessage = (S2C_LingLongBookBuy_28976)LingLongBookMsg.S2C_LingLongBookBuy_28976.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LingLongBookBuy_28976)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 1;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCount() {
            return this.count_;
         }

         public Builder setCount(int value) {
            this.bitField0_ |= 2;
            this.count_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCount() {
            this.bitField0_ &= -3;
            this.count_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 4;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -5;
            this.level_ = 0;
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

   public static final class S2C_LingLongBookUpdate_28977 extends GeneratedMessageV3 implements S2C_LingLongBookUpdate_28977OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LEVEL_FIELD_NUMBER = 1;
      private int level_;
      private byte memoizedIsInitialized;
      private static final S2C_LingLongBookUpdate_28977 DEFAULT_INSTANCE = new S2C_LingLongBookUpdate_28977();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LingLongBookUpdate_28977> PARSER = new AbstractParser<S2C_LingLongBookUpdate_28977>() {
         public S2C_LingLongBookUpdate_28977 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LingLongBookUpdate_28977(input, extensionRegistry);
         }
      };

      private S2C_LingLongBookUpdate_28977(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LingLongBookUpdate_28977() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LingLongBookUpdate_28977();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LingLongBookUpdate_28977(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.level_ = input.readInt32();
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
         return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookUpdate_28977_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookUpdate_28977_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LingLongBookUpdate_28977.class, Builder.class);
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.level_);
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
               size += CodedOutputStream.computeInt32Size(1, this.level_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LingLongBookUpdate_28977)) {
            return super.equals(obj);
         } else {
            S2C_LingLongBookUpdate_28977 other = (S2C_LingLongBookUpdate_28977)obj;
            if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
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
            if (this.hasLevel()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLevel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LingLongBookUpdate_28977 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookUpdate_28977)PARSER.parseFrom(data);
      }

      public static S2C_LingLongBookUpdate_28977 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookUpdate_28977)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LingLongBookUpdate_28977 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookUpdate_28977)PARSER.parseFrom(data);
      }

      public static S2C_LingLongBookUpdate_28977 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookUpdate_28977)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LingLongBookUpdate_28977 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookUpdate_28977)PARSER.parseFrom(data);
      }

      public static S2C_LingLongBookUpdate_28977 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookUpdate_28977)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LingLongBookUpdate_28977 parseFrom(InputStream input) throws IOException {
         return (S2C_LingLongBookUpdate_28977)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LingLongBookUpdate_28977 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LingLongBookUpdate_28977)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LingLongBookUpdate_28977 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LingLongBookUpdate_28977)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LingLongBookUpdate_28977 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LingLongBookUpdate_28977)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LingLongBookUpdate_28977 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LingLongBookUpdate_28977)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LingLongBookUpdate_28977 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LingLongBookUpdate_28977)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LingLongBookUpdate_28977 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LingLongBookUpdate_28977 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LingLongBookUpdate_28977> parser() {
         return PARSER;
      }

      public Parser<S2C_LingLongBookUpdate_28977> getParserForType() {
         return PARSER;
      }

      public S2C_LingLongBookUpdate_28977 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LingLongBookUpdate_28977OrBuilder {
         private int bitField0_;
         private int level_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookUpdate_28977_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookUpdate_28977_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LingLongBookUpdate_28977.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LingLongBookMsg.S2C_LingLongBookUpdate_28977.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.level_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookUpdate_28977_descriptor;
         }

         public S2C_LingLongBookUpdate_28977 getDefaultInstanceForType() {
            return LingLongBookMsg.S2C_LingLongBookUpdate_28977.getDefaultInstance();
         }

         public S2C_LingLongBookUpdate_28977 build() {
            S2C_LingLongBookUpdate_28977 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LingLongBookUpdate_28977 buildPartial() {
            S2C_LingLongBookUpdate_28977 result = new S2C_LingLongBookUpdate_28977(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.level_ = this.level_;
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
            if (other instanceof S2C_LingLongBookUpdate_28977) {
               return this.mergeFrom((S2C_LingLongBookUpdate_28977)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LingLongBookUpdate_28977 other) {
            if (other == LingLongBookMsg.S2C_LingLongBookUpdate_28977.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasLevel();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LingLongBookUpdate_28977 parsedMessage = null;

            try {
               parsedMessage = (S2C_LingLongBookUpdate_28977)LingLongBookMsg.S2C_LingLongBookUpdate_28977.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LingLongBookUpdate_28977)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 1;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -2;
            this.level_ = 0;
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

   public static final class S2C_LingLongBookTasks_28978 extends GeneratedMessageV3 implements S2C_LingLongBookTasks_28978OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_LingLongBookTasks_28978 DEFAULT_INSTANCE = new S2C_LingLongBookTasks_28978();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LingLongBookTasks_28978> PARSER = new AbstractParser<S2C_LingLongBookTasks_28978>() {
         public S2C_LingLongBookTasks_28978 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LingLongBookTasks_28978(input, extensionRegistry);
         }
      };

      private S2C_LingLongBookTasks_28978(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LingLongBookTasks_28978() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LingLongBookTasks_28978();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LingLongBookTasks_28978(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.task_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
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
         return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTasks_28978_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTasks_28978_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LingLongBookTasks_28978.class, Builder.class);
      }

      public List<ActivityMsg.TaskData> getTaskList() {
         return this.task_;
      }

      public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList() {
         return this.task_;
      }

      public int getTaskCount() {
         return this.task_.size();
      }

      public ActivityMsg.TaskData getTask(int index) {
         return (ActivityMsg.TaskData)this.task_.get(index);
      }

      public ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index) {
         return (ActivityMsg.TaskDataOrBuilder)this.task_.get(index);
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
         } else if (!(obj instanceof S2C_LingLongBookTasks_28978)) {
            return super.equals(obj);
         } else {
            S2C_LingLongBookTasks_28978 other = (S2C_LingLongBookTasks_28978)obj;
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

      public static S2C_LingLongBookTasks_28978 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookTasks_28978)PARSER.parseFrom(data);
      }

      public static S2C_LingLongBookTasks_28978 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookTasks_28978)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LingLongBookTasks_28978 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookTasks_28978)PARSER.parseFrom(data);
      }

      public static S2C_LingLongBookTasks_28978 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookTasks_28978)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LingLongBookTasks_28978 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookTasks_28978)PARSER.parseFrom(data);
      }

      public static S2C_LingLongBookTasks_28978 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LingLongBookTasks_28978)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LingLongBookTasks_28978 parseFrom(InputStream input) throws IOException {
         return (S2C_LingLongBookTasks_28978)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LingLongBookTasks_28978 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LingLongBookTasks_28978)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LingLongBookTasks_28978 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LingLongBookTasks_28978)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LingLongBookTasks_28978 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LingLongBookTasks_28978)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LingLongBookTasks_28978 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LingLongBookTasks_28978)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LingLongBookTasks_28978 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LingLongBookTasks_28978)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LingLongBookTasks_28978 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LingLongBookTasks_28978 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LingLongBookTasks_28978> parser() {
         return PARSER;
      }

      public Parser<S2C_LingLongBookTasks_28978> getParserForType() {
         return PARSER;
      }

      public S2C_LingLongBookTasks_28978 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LingLongBookTasks_28978OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTasks_28978_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTasks_28978_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LingLongBookTasks_28978.class, Builder.class);
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
            if (LingLongBookMsg.S2C_LingLongBookTasks_28978.alwaysUseFieldBuilders) {
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
            return LingLongBookMsg.internal_static_lingLong_com_gzbz_protobuf_S2C_LingLongBookTasks_28978_descriptor;
         }

         public S2C_LingLongBookTasks_28978 getDefaultInstanceForType() {
            return LingLongBookMsg.S2C_LingLongBookTasks_28978.getDefaultInstance();
         }

         public S2C_LingLongBookTasks_28978 build() {
            S2C_LingLongBookTasks_28978 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LingLongBookTasks_28978 buildPartial() {
            S2C_LingLongBookTasks_28978 result = new S2C_LingLongBookTasks_28978(this);
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
            if (other instanceof S2C_LingLongBookTasks_28978) {
               return this.mergeFrom((S2C_LingLongBookTasks_28978)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LingLongBookTasks_28978 other) {
            if (other == LingLongBookMsg.S2C_LingLongBookTasks_28978.getDefaultInstance()) {
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
                     this.taskBuilder_ = LingLongBookMsg.S2C_LingLongBookTasks_28978.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_LingLongBookTasks_28978 parsedMessage = null;

            try {
               parsedMessage = (S2C_LingLongBookTasks_28978)LingLongBookMsg.S2C_LingLongBookTasks_28978.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LingLongBookTasks_28978)e.getUnfinishedMessage();
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

         public List<ActivityMsg.TaskData> getTaskList() {
            return this.taskBuilder_ == null ? Collections.unmodifiableList(this.task_) : this.taskBuilder_.getMessageList();
         }

         public int getTaskCount() {
            return this.taskBuilder_ == null ? this.task_.size() : this.taskBuilder_.getCount();
         }

         public ActivityMsg.TaskData getTask(int index) {
            return this.taskBuilder_ == null ? (ActivityMsg.TaskData)this.task_.get(index) : (ActivityMsg.TaskData)this.taskBuilder_.getMessage(index);
         }

         public Builder setTask(int index, ActivityMsg.TaskData value) {
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

         public Builder setTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTask(ActivityMsg.TaskData value) {
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

         public Builder addTask(int index, ActivityMsg.TaskData value) {
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

         public Builder addTask(ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTask(Iterable<? extends ActivityMsg.TaskData> values) {
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

         public ActivityMsg.TaskData.Builder getTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index) {
            return this.taskBuilder_ == null ? (ActivityMsg.TaskDataOrBuilder)this.task_.get(index) : (ActivityMsg.TaskDataOrBuilder)this.taskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList() {
            return this.taskBuilder_ != null ? this.taskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.task_);
         }

         public ActivityMsg.TaskData.Builder addTaskBuilder() {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().addBuilder(ActivityMsg.TaskData.getDefaultInstance());
         }

         public ActivityMsg.TaskData.Builder addTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().addBuilder(index, ActivityMsg.TaskData.getDefaultInstance());
         }

         public List<ActivityMsg.TaskData.Builder> getTaskBuilderList() {
            return this.getTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> getTaskFieldBuilder() {
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

   public interface C2S_LingLongBookBuy_28975OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasCount();

      int getCount();
   }

   public interface C2S_LingLongBookTaskInfo_28971OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LingLongBookTaskReward_28973OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface LingLongBookTaskGroupDateOrBuilder extends MessageOrBuilder {
      boolean hasStepId();

      int getStepId();

      boolean hasEndTime();

      int getEndTime();

      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_LingLongBookBuy_28976OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasCount();

      int getCount();

      boolean hasLevel();

      int getLevel();
   }

   public interface S2C_LingLongBookTaskInfo_28972OrBuilder extends MessageOrBuilder {
      boolean hasStartTime();

      int getStartTime();

      boolean hasEndTime();

      int getEndTime();

      boolean hasLevel();

      int getLevel();

      List<LingLongBookTaskGroupDate> getTaskGroupDataList();

      LingLongBookTaskGroupDate getTaskGroupData(int index);

      int getTaskGroupDataCount();

      List<? extends LingLongBookTaskGroupDateOrBuilder> getTaskGroupDataOrBuilderList();

      LingLongBookTaskGroupDateOrBuilder getTaskGroupDataOrBuilder(int index);
   }

   public interface S2C_LingLongBookTaskReward_28974OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_LingLongBookTasks_28978OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_LingLongBookUpdate_28977OrBuilder extends MessageOrBuilder {
      boolean hasLevel();

      int getLevel();
   }
}
