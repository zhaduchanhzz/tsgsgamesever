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

public final class TaskMsg {
   private static final Descriptors.Descriptor internal_static_task_com_gzbz_protobuf_TaskData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_task_com_gzbz_protobuf_TaskData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_task_com_gzbz_protobuf_C2S_TaskList_6501_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_task_com_gzbz_protobuf_C2S_TaskList_6501_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_task_com_gzbz_protobuf_S2C_TaskListResult_6502_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_task_com_gzbz_protobuf_S2C_TaskListResult_6502_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_task_com_gzbz_protobuf_C2S_CommitTask_6503_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_task_com_gzbz_protobuf_C2S_CommitTask_6503_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_task_com_gzbz_protobuf_S2C_CommitTaskResult_6504_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_task_com_gzbz_protobuf_S2C_CommitTaskResult_6504_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_task_com_gzbz_protobuf_C2S_GetActiveBox_6505_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_task_com_gzbz_protobuf_C2S_GetActiveBox_6505_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_task_com_gzbz_protobuf_S2C_GetActiveBoxResult_6506_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_task_com_gzbz_protobuf_S2C_GetActiveBoxResult_6506_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_task_com_gzbz_protobuf_S2C_TaskNotify_6508_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_task_com_gzbz_protobuf_S2C_TaskNotify_6508_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_task_com_gzbz_protobuf_S2C_TasksNotify_6510_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_task_com_gzbz_protobuf_S2C_TasksNotify_6510_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_task_com_gzbz_protobuf_C2S_OneKeyCommit_6511_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_task_com_gzbz_protobuf_C2S_OneKeyCommit_6511_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_task_com_gzbz_protobuf_S2C_OneKeyCommit_6512_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_task_com_gzbz_protobuf_S2C_OneKeyCommit_6512_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private TaskMsg() {
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
      String[] descriptorData = new String[]{"\n\nTask.proto\u0012\u0016task.com.gzbz.protobuf\"c\n\bTaskData\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\btaskType\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005state\u0018\u0003 \u0002(\u0005\u0012\u0010\n\bprogress\u0018\u0004 \u0002(\u0005\u0012\u0014\n\fcompleteTime\u0018\u0005 \u0001(\u0005\"%\n\u0011C2S_TaskList_6501\u0012\u0010\n\btaskType\u0018\u0001 \u0002(\u0005\"i\n\u0017S2C_TaskListResult_6502\u0012/\n\u0005tasks\u0018\u0001 \u0003(\u000b2 .task.com.gzbz.protobuf.TaskData\u0012\u000e\n\u0006active\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005boxId\u0018\u0003 \u0003(\u0005\"%\n\u0013C2S_CommitTask_6503\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"Q\n\u0019S2C_CommitTaskResult_6504\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006taskId\u0018\u0002 \u0002(\u0005\u0012\u0014\n\fcompleteTime\u0018\u0003 \u0001(\u0005\"&\n\u0015C2S_GetActiveBox_6505\u0012\r\n\u0005boxId\u0018\u0001 \u0002(\u0005\"<\n\u001bS2C_GetActiveBoxResult_6506\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005boxId\u0018\u0002 \u0002(\u0005\"E\n\u0013S2C_TaskNotify_6508\u0012.\n\u0004task\u0018\u0001 \u0002(\u000b2 .task.com.gzbz.protobuf.TaskData\"F\n\u0014S2C_TasksNotify_6510\u0012.\n\u0004task\u0018\u0001 \u0003(\u000b2 .task.com.gzbz.protobuf.TaskData\")\n\u0015C2S_OneKeyCommit_6511\u0012\u0010\n\btaskType\u0018\u0001 \u0002(\u0005\"F\n\u0015S2C_OneKeyCommit_6512\u0012\u0010\n\btaskType\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006taskId\u0018\u0002 \u0003(\u0005\u0012\u000b\n\u0003box\u0018\u0003 \u0003(\u0005B\u001e\n\u0011com.gzbz.protobufB\u0007TaskMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_task_com_gzbz_protobuf_TaskData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_task_com_gzbz_protobuf_TaskData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_task_com_gzbz_protobuf_TaskData_descriptor, new String[]{"TaskId", "TaskType", "State", "Progress", "CompleteTime"});
      internal_static_task_com_gzbz_protobuf_C2S_TaskList_6501_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_task_com_gzbz_protobuf_C2S_TaskList_6501_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_task_com_gzbz_protobuf_C2S_TaskList_6501_descriptor, new String[]{"TaskType"});
      internal_static_task_com_gzbz_protobuf_S2C_TaskListResult_6502_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_task_com_gzbz_protobuf_S2C_TaskListResult_6502_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_task_com_gzbz_protobuf_S2C_TaskListResult_6502_descriptor, new String[]{"Tasks", "Active", "BoxId"});
      internal_static_task_com_gzbz_protobuf_C2S_CommitTask_6503_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_task_com_gzbz_protobuf_C2S_CommitTask_6503_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_task_com_gzbz_protobuf_C2S_CommitTask_6503_descriptor, new String[]{"TaskId"});
      internal_static_task_com_gzbz_protobuf_S2C_CommitTaskResult_6504_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_task_com_gzbz_protobuf_S2C_CommitTaskResult_6504_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_task_com_gzbz_protobuf_S2C_CommitTaskResult_6504_descriptor, new String[]{"Result", "TaskId", "CompleteTime"});
      internal_static_task_com_gzbz_protobuf_C2S_GetActiveBox_6505_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_task_com_gzbz_protobuf_C2S_GetActiveBox_6505_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_task_com_gzbz_protobuf_C2S_GetActiveBox_6505_descriptor, new String[]{"BoxId"});
      internal_static_task_com_gzbz_protobuf_S2C_GetActiveBoxResult_6506_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_task_com_gzbz_protobuf_S2C_GetActiveBoxResult_6506_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_task_com_gzbz_protobuf_S2C_GetActiveBoxResult_6506_descriptor, new String[]{"Result", "BoxId"});
      internal_static_task_com_gzbz_protobuf_S2C_TaskNotify_6508_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_task_com_gzbz_protobuf_S2C_TaskNotify_6508_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_task_com_gzbz_protobuf_S2C_TaskNotify_6508_descriptor, new String[]{"Task"});
      internal_static_task_com_gzbz_protobuf_S2C_TasksNotify_6510_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_task_com_gzbz_protobuf_S2C_TasksNotify_6510_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_task_com_gzbz_protobuf_S2C_TasksNotify_6510_descriptor, new String[]{"Task"});
      internal_static_task_com_gzbz_protobuf_C2S_OneKeyCommit_6511_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_task_com_gzbz_protobuf_C2S_OneKeyCommit_6511_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_task_com_gzbz_protobuf_C2S_OneKeyCommit_6511_descriptor, new String[]{"TaskType"});
      internal_static_task_com_gzbz_protobuf_S2C_OneKeyCommit_6512_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_task_com_gzbz_protobuf_S2C_OneKeyCommit_6512_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_task_com_gzbz_protobuf_S2C_OneKeyCommit_6512_descriptor, new String[]{"TaskType", "TaskId", "Box"});
   }

   public static final class TaskData extends GeneratedMessageV3 implements TaskDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      public static final int TASKTYPE_FIELD_NUMBER = 2;
      private int taskType_;
      public static final int STATE_FIELD_NUMBER = 3;
      private int state_;
      public static final int PROGRESS_FIELD_NUMBER = 4;
      private int progress_;
      public static final int COMPLETETIME_FIELD_NUMBER = 5;
      private int completeTime_;
      private byte memoizedIsInitialized;
      private static final TaskData DEFAULT_INSTANCE = new TaskData();
      /** @deprecated */
      @Deprecated
      public static final Parser<TaskData> PARSER = new AbstractParser<TaskData>() {
         public TaskData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new TaskData(input, extensionRegistry);
         }
      };

      private TaskData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private TaskData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new TaskData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private TaskData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.taskType_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.state_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.progress_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.completeTime_ = input.readInt32();
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
         return TaskMsg.internal_static_task_com_gzbz_protobuf_TaskData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TaskMsg.internal_static_task_com_gzbz_protobuf_TaskData_fieldAccessorTable.ensureFieldAccessorsInitialized(TaskData.class, Builder.class);
      }

      public boolean hasTaskId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTaskId() {
         return this.taskId_;
      }

      public boolean hasTaskType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTaskType() {
         return this.taskType_;
      }

      public boolean hasState() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public boolean hasProgress() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getProgress() {
         return this.progress_;
      }

      public boolean hasCompleteTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getCompleteTime() {
         return this.completeTime_;
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
         } else if (!this.hasTaskType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasProgress()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.taskType_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.state_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.progress_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.completeTime_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.taskType_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.state_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.progress_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.completeTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof TaskData)) {
            return super.equals(obj);
         } else {
            TaskData other = (TaskData)obj;
            if (this.hasTaskId() != other.hasTaskId()) {
               return false;
            } else if (this.hasTaskId() && this.getTaskId() != other.getTaskId()) {
               return false;
            } else if (this.hasTaskType() != other.hasTaskType()) {
               return false;
            } else if (this.hasTaskType() && this.getTaskType() != other.getTaskType()) {
               return false;
            } else if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
               return false;
            } else if (this.hasProgress() != other.hasProgress()) {
               return false;
            } else if (this.hasProgress() && this.getProgress() != other.getProgress()) {
               return false;
            } else if (this.hasCompleteTime() != other.hasCompleteTime()) {
               return false;
            } else if (this.hasCompleteTime() && this.getCompleteTime() != other.getCompleteTime()) {
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

            if (this.hasTaskType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTaskType();
            }

            if (this.hasState()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getState();
            }

            if (this.hasProgress()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getProgress();
            }

            if (this.hasCompleteTime()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getCompleteTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static TaskData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (TaskData)PARSER.parseFrom(data);
      }

      public static TaskData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TaskData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TaskData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (TaskData)PARSER.parseFrom(data);
      }

      public static TaskData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TaskData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TaskData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (TaskData)PARSER.parseFrom(data);
      }

      public static TaskData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TaskData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TaskData parseFrom(InputStream input) throws IOException {
         return (TaskData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TaskData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TaskData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static TaskData parseDelimitedFrom(InputStream input) throws IOException {
         return (TaskData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static TaskData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TaskData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static TaskData parseFrom(CodedInputStream input) throws IOException {
         return (TaskData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TaskData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TaskData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(TaskData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static TaskData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<TaskData> parser() {
         return PARSER;
      }

      public Parser<TaskData> getParserForType() {
         return PARSER;
      }

      public TaskData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TaskDataOrBuilder {
         private int bitField0_;
         private int taskId_;
         private int taskType_;
         private int state_;
         private int progress_;
         private int completeTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_TaskData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_TaskData_fieldAccessorTable.ensureFieldAccessorsInitialized(TaskData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TaskMsg.TaskData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            this.taskType_ = 0;
            this.bitField0_ &= -3;
            this.state_ = 0;
            this.bitField0_ &= -5;
            this.progress_ = 0;
            this.bitField0_ &= -9;
            this.completeTime_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_TaskData_descriptor;
         }

         public TaskData getDefaultInstanceForType() {
            return TaskMsg.TaskData.getDefaultInstance();
         }

         public TaskData build() {
            TaskData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public TaskData buildPartial() {
            TaskData result = new TaskData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.taskId_ = this.taskId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.taskType_ = this.taskType_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.state_ = this.state_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.progress_ = this.progress_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.completeTime_ = this.completeTime_;
               to_bitField0_ |= 16;
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
            if (other instanceof TaskData) {
               return this.mergeFrom((TaskData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(TaskData other) {
            if (other == TaskMsg.TaskData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTaskId()) {
                  this.setTaskId(other.getTaskId());
               }

               if (other.hasTaskType()) {
                  this.setTaskType(other.getTaskType());
               }

               if (other.hasState()) {
                  this.setState(other.getState());
               }

               if (other.hasProgress()) {
                  this.setProgress(other.getProgress());
               }

               if (other.hasCompleteTime()) {
                  this.setCompleteTime(other.getCompleteTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTaskId()) {
               return false;
            } else if (!this.hasTaskType()) {
               return false;
            } else if (!this.hasState()) {
               return false;
            } else {
               return this.hasProgress();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            TaskData parsedMessage = null;

            try {
               parsedMessage = (TaskData)TaskMsg.TaskData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (TaskData)e.getUnfinishedMessage();
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

         public boolean hasTaskType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTaskType() {
            return this.taskType_;
         }

         public Builder setTaskType(int value) {
            this.bitField0_ |= 2;
            this.taskType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskType() {
            this.bitField0_ &= -3;
            this.taskType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasState() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getState() {
            return this.state_;
         }

         public Builder setState(int value) {
            this.bitField0_ |= 4;
            this.state_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearState() {
            this.bitField0_ &= -5;
            this.state_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasProgress() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getProgress() {
            return this.progress_;
         }

         public Builder setProgress(int value) {
            this.bitField0_ |= 8;
            this.progress_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearProgress() {
            this.bitField0_ &= -9;
            this.progress_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCompleteTime() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getCompleteTime() {
            return this.completeTime_;
         }

         public Builder setCompleteTime(int value) {
            this.bitField0_ |= 16;
            this.completeTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCompleteTime() {
            this.bitField0_ &= -17;
            this.completeTime_ = 0;
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

   public static final class C2S_TaskList_6501 extends GeneratedMessageV3 implements C2S_TaskList_6501OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKTYPE_FIELD_NUMBER = 1;
      private int taskType_;
      private byte memoizedIsInitialized;
      private static final C2S_TaskList_6501 DEFAULT_INSTANCE = new C2S_TaskList_6501();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TaskList_6501> PARSER = new AbstractParser<C2S_TaskList_6501>() {
         public C2S_TaskList_6501 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TaskList_6501(input, extensionRegistry);
         }
      };

      private C2S_TaskList_6501(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TaskList_6501() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TaskList_6501();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TaskList_6501(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.taskType_ = input.readInt32();
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
         return TaskMsg.internal_static_task_com_gzbz_protobuf_C2S_TaskList_6501_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TaskMsg.internal_static_task_com_gzbz_protobuf_C2S_TaskList_6501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskList_6501.class, Builder.class);
      }

      public boolean hasTaskType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTaskType() {
         return this.taskType_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTaskType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.taskType_);
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
               size += CodedOutputStream.computeInt32Size(1, this.taskType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TaskList_6501)) {
            return super.equals(obj);
         } else {
            C2S_TaskList_6501 other = (C2S_TaskList_6501)obj;
            if (this.hasTaskType() != other.hasTaskType()) {
               return false;
            } else if (this.hasTaskType() && this.getTaskType() != other.getTaskType()) {
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
            if (this.hasTaskType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TaskList_6501 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TaskList_6501)PARSER.parseFrom(data);
      }

      public static C2S_TaskList_6501 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskList_6501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskList_6501 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TaskList_6501)PARSER.parseFrom(data);
      }

      public static C2S_TaskList_6501 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskList_6501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskList_6501 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TaskList_6501)PARSER.parseFrom(data);
      }

      public static C2S_TaskList_6501 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskList_6501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskList_6501 parseFrom(InputStream input) throws IOException {
         return (C2S_TaskList_6501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskList_6501 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskList_6501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskList_6501 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TaskList_6501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TaskList_6501 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskList_6501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskList_6501 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TaskList_6501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskList_6501 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskList_6501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TaskList_6501 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TaskList_6501 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TaskList_6501> parser() {
         return PARSER;
      }

      public Parser<C2S_TaskList_6501> getParserForType() {
         return PARSER;
      }

      public C2S_TaskList_6501 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TaskList_6501OrBuilder {
         private int bitField0_;
         private int taskType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_C2S_TaskList_6501_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_C2S_TaskList_6501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskList_6501.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TaskMsg.C2S_TaskList_6501.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskType_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_C2S_TaskList_6501_descriptor;
         }

         public C2S_TaskList_6501 getDefaultInstanceForType() {
            return TaskMsg.C2S_TaskList_6501.getDefaultInstance();
         }

         public C2S_TaskList_6501 build() {
            C2S_TaskList_6501 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TaskList_6501 buildPartial() {
            C2S_TaskList_6501 result = new C2S_TaskList_6501(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.taskType_ = this.taskType_;
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
            if (other instanceof C2S_TaskList_6501) {
               return this.mergeFrom((C2S_TaskList_6501)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TaskList_6501 other) {
            if (other == TaskMsg.C2S_TaskList_6501.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTaskType()) {
                  this.setTaskType(other.getTaskType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTaskType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TaskList_6501 parsedMessage = null;

            try {
               parsedMessage = (C2S_TaskList_6501)TaskMsg.C2S_TaskList_6501.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TaskList_6501)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTaskType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTaskType() {
            return this.taskType_;
         }

         public Builder setTaskType(int value) {
            this.bitField0_ |= 1;
            this.taskType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskType() {
            this.bitField0_ &= -2;
            this.taskType_ = 0;
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

   public static final class S2C_TaskListResult_6502 extends GeneratedMessageV3 implements S2C_TaskListResult_6502OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKS_FIELD_NUMBER = 1;
      private List<TaskData> tasks_;
      public static final int ACTIVE_FIELD_NUMBER = 2;
      private int active_;
      public static final int BOXID_FIELD_NUMBER = 3;
      private Internal.IntList boxId_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskListResult_6502 DEFAULT_INSTANCE = new S2C_TaskListResult_6502();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskListResult_6502> PARSER = new AbstractParser<S2C_TaskListResult_6502>() {
         public S2C_TaskListResult_6502 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskListResult_6502(input, extensionRegistry);
         }
      };

      private S2C_TaskListResult_6502(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskListResult_6502() {
         this.memoizedIsInitialized = -1;
         this.tasks_ = Collections.emptyList();
         this.boxId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskListResult_6502();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskListResult_6502(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.tasks_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.tasks_.add(input.readMessage(TaskMsg.TaskData.PARSER, extensionRegistry));
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.active_ = input.readInt32();
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.boxId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.boxId_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.boxId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.boxId_.addInt(input.readInt32());
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
                  this.tasks_ = Collections.unmodifiableList(this.tasks_);
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.boxId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_TaskListResult_6502_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_TaskListResult_6502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskListResult_6502.class, Builder.class);
      }

      public List<TaskData> getTasksList() {
         return this.tasks_;
      }

      public List<? extends TaskDataOrBuilder> getTasksOrBuilderList() {
         return this.tasks_;
      }

      public int getTasksCount() {
         return this.tasks_.size();
      }

      public TaskData getTasks(int index) {
         return (TaskData)this.tasks_.get(index);
      }

      public TaskDataOrBuilder getTasksOrBuilder(int index) {
         return (TaskDataOrBuilder)this.tasks_.get(index);
      }

      public boolean hasActive() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActive() {
         return this.active_;
      }

      public List<Integer> getBoxIdList() {
         return this.boxId_;
      }

      public int getBoxIdCount() {
         return this.boxId_.size();
      }

      public int getBoxId(int index) {
         return this.boxId_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasActive()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getTasksCount(); ++i) {
               if (!this.getTasks(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.tasks_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.tasks_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.active_);
         }

         for(int i = 0; i < this.boxId_.size(); ++i) {
            output.writeInt32(3, this.boxId_.getInt(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.tasks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.tasks_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.active_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.boxId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.boxId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getBoxIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TaskListResult_6502)) {
            return super.equals(obj);
         } else {
            S2C_TaskListResult_6502 other = (S2C_TaskListResult_6502)obj;
            if (!this.getTasksList().equals(other.getTasksList())) {
               return false;
            } else if (this.hasActive() != other.hasActive()) {
               return false;
            } else if (this.hasActive() && this.getActive() != other.getActive()) {
               return false;
            } else if (!this.getBoxIdList().equals(other.getBoxIdList())) {
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
            if (this.getTasksCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTasksList().hashCode();
            }

            if (this.hasActive()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getActive();
            }

            if (this.getBoxIdCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBoxIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TaskListResult_6502 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskListResult_6502)PARSER.parseFrom(data);
      }

      public static S2C_TaskListResult_6502 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskListResult_6502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskListResult_6502 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskListResult_6502)PARSER.parseFrom(data);
      }

      public static S2C_TaskListResult_6502 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskListResult_6502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskListResult_6502 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskListResult_6502)PARSER.parseFrom(data);
      }

      public static S2C_TaskListResult_6502 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskListResult_6502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskListResult_6502 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskListResult_6502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskListResult_6502 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskListResult_6502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskListResult_6502 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskListResult_6502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskListResult_6502 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskListResult_6502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskListResult_6502 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskListResult_6502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskListResult_6502 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskListResult_6502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskListResult_6502 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskListResult_6502 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskListResult_6502> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskListResult_6502> getParserForType() {
         return PARSER;
      }

      public S2C_TaskListResult_6502 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskListResult_6502OrBuilder {
         private int bitField0_;
         private List<TaskData> tasks_;
         private RepeatedFieldBuilderV3<TaskData, TaskData.Builder, TaskDataOrBuilder> tasksBuilder_;
         private int active_;
         private Internal.IntList boxId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_TaskListResult_6502_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_TaskListResult_6502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskListResult_6502.class, Builder.class);
         }

         private Builder() {
            this.tasks_ = Collections.emptyList();
            this.boxId_ = TaskMsg.S2C_TaskListResult_6502.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.tasks_ = Collections.emptyList();
            this.boxId_ = TaskMsg.S2C_TaskListResult_6502.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TaskMsg.S2C_TaskListResult_6502.alwaysUseFieldBuilders) {
               this.getTasksFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.tasksBuilder_ == null) {
               this.tasks_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.tasksBuilder_.clear();
            }

            this.active_ = 0;
            this.bitField0_ &= -3;
            this.boxId_ = TaskMsg.S2C_TaskListResult_6502.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_TaskListResult_6502_descriptor;
         }

         public S2C_TaskListResult_6502 getDefaultInstanceForType() {
            return TaskMsg.S2C_TaskListResult_6502.getDefaultInstance();
         }

         public S2C_TaskListResult_6502 build() {
            S2C_TaskListResult_6502 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskListResult_6502 buildPartial() {
            S2C_TaskListResult_6502 result = new S2C_TaskListResult_6502(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.tasksBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.tasks_ = Collections.unmodifiableList(this.tasks_);
                  this.bitField0_ &= -2;
               }

               result.tasks_ = this.tasks_;
            } else {
               result.tasks_ = this.tasksBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               result.active_ = this.active_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.boxId_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.boxId_ = this.boxId_;
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
            if (other instanceof S2C_TaskListResult_6502) {
               return this.mergeFrom((S2C_TaskListResult_6502)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskListResult_6502 other) {
            if (other == TaskMsg.S2C_TaskListResult_6502.getDefaultInstance()) {
               return this;
            } else {
               if (this.tasksBuilder_ == null) {
                  if (!other.tasks_.isEmpty()) {
                     if (this.tasks_.isEmpty()) {
                        this.tasks_ = other.tasks_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTasksIsMutable();
                        this.tasks_.addAll(other.tasks_);
                     }

                     this.onChanged();
                  }
               } else if (!other.tasks_.isEmpty()) {
                  if (this.tasksBuilder_.isEmpty()) {
                     this.tasksBuilder_.dispose();
                     this.tasksBuilder_ = null;
                     this.tasks_ = other.tasks_;
                     this.bitField0_ &= -2;
                     this.tasksBuilder_ = TaskMsg.S2C_TaskListResult_6502.alwaysUseFieldBuilders ? this.getTasksFieldBuilder() : null;
                  } else {
                     this.tasksBuilder_.addAllMessages(other.tasks_);
                  }
               }

               if (other.hasActive()) {
                  this.setActive(other.getActive());
               }

               if (!other.boxId_.isEmpty()) {
                  if (this.boxId_.isEmpty()) {
                     this.boxId_ = other.boxId_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureBoxIdIsMutable();
                     this.boxId_.addAll(other.boxId_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActive()) {
               return false;
            } else {
               for(int i = 0; i < this.getTasksCount(); ++i) {
                  if (!this.getTasks(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TaskListResult_6502 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskListResult_6502)TaskMsg.S2C_TaskListResult_6502.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskListResult_6502)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTasksIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.tasks_ = new ArrayList(this.tasks_);
               this.bitField0_ |= 1;
            }

         }

         public List<TaskData> getTasksList() {
            return this.tasksBuilder_ == null ? Collections.unmodifiableList(this.tasks_) : this.tasksBuilder_.getMessageList();
         }

         public int getTasksCount() {
            return this.tasksBuilder_ == null ? this.tasks_.size() : this.tasksBuilder_.getCount();
         }

         public TaskData getTasks(int index) {
            return this.tasksBuilder_ == null ? (TaskData)this.tasks_.get(index) : (TaskData)this.tasksBuilder_.getMessage(index);
         }

         public Builder setTasks(int index, TaskData value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.set(index, value);
               this.onChanged();
            } else {
               this.tasksBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTasks(int index, TaskData.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTasks(TaskData value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.add(value);
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTasks(int index, TaskData value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.add(index, value);
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTasks(TaskData.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTasks(int index, TaskData.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTasks(Iterable<? extends TaskData> values) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.tasks_);
               this.onChanged();
            } else {
               this.tasksBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTasks() {
            if (this.tasksBuilder_ == null) {
               this.tasks_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.tasksBuilder_.clear();
            }

            return this;
         }

         public Builder removeTasks(int index) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.remove(index);
               this.onChanged();
            } else {
               this.tasksBuilder_.remove(index);
            }

            return this;
         }

         public TaskData.Builder getTasksBuilder(int index) {
            return (TaskData.Builder)this.getTasksFieldBuilder().getBuilder(index);
         }

         public TaskDataOrBuilder getTasksOrBuilder(int index) {
            return this.tasksBuilder_ == null ? (TaskDataOrBuilder)this.tasks_.get(index) : (TaskDataOrBuilder)this.tasksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends TaskDataOrBuilder> getTasksOrBuilderList() {
            return this.tasksBuilder_ != null ? this.tasksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.tasks_);
         }

         public TaskData.Builder addTasksBuilder() {
            return (TaskData.Builder)this.getTasksFieldBuilder().addBuilder(TaskMsg.TaskData.getDefaultInstance());
         }

         public TaskData.Builder addTasksBuilder(int index) {
            return (TaskData.Builder)this.getTasksFieldBuilder().addBuilder(index, TaskMsg.TaskData.getDefaultInstance());
         }

         public List<TaskData.Builder> getTasksBuilderList() {
            return this.getTasksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<TaskData, TaskData.Builder, TaskDataOrBuilder> getTasksFieldBuilder() {
            if (this.tasksBuilder_ == null) {
               this.tasksBuilder_ = new RepeatedFieldBuilderV3(this.tasks_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.tasks_ = null;
            }

            return this.tasksBuilder_;
         }

         public boolean hasActive() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getActive() {
            return this.active_;
         }

         public Builder setActive(int value) {
            this.bitField0_ |= 2;
            this.active_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActive() {
            this.bitField0_ &= -3;
            this.active_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureBoxIdIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.boxId_ = TaskMsg.S2C_TaskListResult_6502.mutableCopy(this.boxId_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getBoxIdList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.boxId_) : this.boxId_);
         }

         public int getBoxIdCount() {
            return this.boxId_.size();
         }

         public int getBoxId(int index) {
            return this.boxId_.getInt(index);
         }

         public Builder setBoxId(int index, int value) {
            this.ensureBoxIdIsMutable();
            this.boxId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addBoxId(int value) {
            this.ensureBoxIdIsMutable();
            this.boxId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllBoxId(Iterable<? extends Integer> values) {
            this.ensureBoxIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.boxId_);
            this.onChanged();
            return this;
         }

         public Builder clearBoxId() {
            this.boxId_ = TaskMsg.S2C_TaskListResult_6502.emptyIntList();
            this.bitField0_ &= -5;
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

   public static final class C2S_CommitTask_6503 extends GeneratedMessageV3 implements C2S_CommitTask_6503OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_CommitTask_6503 DEFAULT_INSTANCE = new C2S_CommitTask_6503();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CommitTask_6503> PARSER = new AbstractParser<C2S_CommitTask_6503>() {
         public C2S_CommitTask_6503 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CommitTask_6503(input, extensionRegistry);
         }
      };

      private C2S_CommitTask_6503(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CommitTask_6503() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CommitTask_6503();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CommitTask_6503(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TaskMsg.internal_static_task_com_gzbz_protobuf_C2S_CommitTask_6503_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TaskMsg.internal_static_task_com_gzbz_protobuf_C2S_CommitTask_6503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_6503.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CommitTask_6503)) {
            return super.equals(obj);
         } else {
            C2S_CommitTask_6503 other = (C2S_CommitTask_6503)obj;
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

      public static C2S_CommitTask_6503 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_6503)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_6503 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_6503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_6503 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_6503)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_6503 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_6503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_6503 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_6503)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_6503 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_6503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_6503 parseFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_6503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_6503 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_6503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_6503 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_6503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_6503 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_6503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_6503 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CommitTask_6503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_6503 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_6503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CommitTask_6503 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CommitTask_6503 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CommitTask_6503> parser() {
         return PARSER;
      }

      public Parser<C2S_CommitTask_6503> getParserForType() {
         return PARSER;
      }

      public C2S_CommitTask_6503 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CommitTask_6503OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_C2S_CommitTask_6503_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_C2S_CommitTask_6503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_6503.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TaskMsg.C2S_CommitTask_6503.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_C2S_CommitTask_6503_descriptor;
         }

         public C2S_CommitTask_6503 getDefaultInstanceForType() {
            return TaskMsg.C2S_CommitTask_6503.getDefaultInstance();
         }

         public C2S_CommitTask_6503 build() {
            C2S_CommitTask_6503 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CommitTask_6503 buildPartial() {
            C2S_CommitTask_6503 result = new C2S_CommitTask_6503(this);
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
            if (other instanceof C2S_CommitTask_6503) {
               return this.mergeFrom((C2S_CommitTask_6503)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CommitTask_6503 other) {
            if (other == TaskMsg.C2S_CommitTask_6503.getDefaultInstance()) {
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
            C2S_CommitTask_6503 parsedMessage = null;

            try {
               parsedMessage = (C2S_CommitTask_6503)TaskMsg.C2S_CommitTask_6503.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CommitTask_6503)e.getUnfinishedMessage();
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

   public static final class S2C_CommitTaskResult_6504 extends GeneratedMessageV3 implements S2C_CommitTaskResult_6504OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TASKID_FIELD_NUMBER = 2;
      private int taskId_;
      public static final int COMPLETETIME_FIELD_NUMBER = 3;
      private int completeTime_;
      private byte memoizedIsInitialized;
      private static final S2C_CommitTaskResult_6504 DEFAULT_INSTANCE = new S2C_CommitTaskResult_6504();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CommitTaskResult_6504> PARSER = new AbstractParser<S2C_CommitTaskResult_6504>() {
         public S2C_CommitTaskResult_6504 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CommitTaskResult_6504(input, extensionRegistry);
         }
      };

      private S2C_CommitTaskResult_6504(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CommitTaskResult_6504() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CommitTaskResult_6504();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CommitTaskResult_6504(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.result_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.taskId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.completeTime_ = input.readInt32();
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
         return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_CommitTaskResult_6504_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_CommitTaskResult_6504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTaskResult_6504.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasTaskId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTaskId() {
         return this.taskId_;
      }

      public boolean hasCompleteTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getCompleteTime() {
         return this.completeTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.taskId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.completeTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.result_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.taskId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.completeTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CommitTaskResult_6504)) {
            return super.equals(obj);
         } else {
            S2C_CommitTaskResult_6504 other = (S2C_CommitTaskResult_6504)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasTaskId() != other.hasTaskId()) {
               return false;
            } else if (this.hasTaskId() && this.getTaskId() != other.getTaskId()) {
               return false;
            } else if (this.hasCompleteTime() != other.hasCompleteTime()) {
               return false;
            } else if (this.hasCompleteTime() && this.getCompleteTime() != other.getCompleteTime()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasTaskId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTaskId();
            }

            if (this.hasCompleteTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCompleteTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CommitTaskResult_6504 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CommitTaskResult_6504)PARSER.parseFrom(data);
      }

      public static S2C_CommitTaskResult_6504 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTaskResult_6504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTaskResult_6504 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CommitTaskResult_6504)PARSER.parseFrom(data);
      }

      public static S2C_CommitTaskResult_6504 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTaskResult_6504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTaskResult_6504 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CommitTaskResult_6504)PARSER.parseFrom(data);
      }

      public static S2C_CommitTaskResult_6504 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTaskResult_6504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTaskResult_6504 parseFrom(InputStream input) throws IOException {
         return (S2C_CommitTaskResult_6504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTaskResult_6504 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTaskResult_6504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTaskResult_6504 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CommitTaskResult_6504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CommitTaskResult_6504 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTaskResult_6504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTaskResult_6504 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CommitTaskResult_6504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTaskResult_6504 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTaskResult_6504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CommitTaskResult_6504 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CommitTaskResult_6504 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CommitTaskResult_6504> parser() {
         return PARSER;
      }

      public Parser<S2C_CommitTaskResult_6504> getParserForType() {
         return PARSER;
      }

      public S2C_CommitTaskResult_6504 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CommitTaskResult_6504OrBuilder {
         private int bitField0_;
         private int result_;
         private int taskId_;
         private int completeTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_CommitTaskResult_6504_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_CommitTaskResult_6504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTaskResult_6504.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TaskMsg.S2C_CommitTaskResult_6504.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.taskId_ = 0;
            this.bitField0_ &= -3;
            this.completeTime_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_CommitTaskResult_6504_descriptor;
         }

         public S2C_CommitTaskResult_6504 getDefaultInstanceForType() {
            return TaskMsg.S2C_CommitTaskResult_6504.getDefaultInstance();
         }

         public S2C_CommitTaskResult_6504 build() {
            S2C_CommitTaskResult_6504 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CommitTaskResult_6504 buildPartial() {
            S2C_CommitTaskResult_6504 result = new S2C_CommitTaskResult_6504(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.taskId_ = this.taskId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.completeTime_ = this.completeTime_;
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
            if (other instanceof S2C_CommitTaskResult_6504) {
               return this.mergeFrom((S2C_CommitTaskResult_6504)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CommitTaskResult_6504 other) {
            if (other == TaskMsg.S2C_CommitTaskResult_6504.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasTaskId()) {
                  this.setTaskId(other.getTaskId());
               }

               if (other.hasCompleteTime()) {
                  this.setCompleteTime(other.getCompleteTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else {
               return this.hasTaskId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CommitTaskResult_6504 parsedMessage = null;

            try {
               parsedMessage = (S2C_CommitTaskResult_6504)TaskMsg.S2C_CommitTaskResult_6504.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CommitTaskResult_6504)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 1;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -2;
            this.result_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTaskId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTaskId() {
            return this.taskId_;
         }

         public Builder setTaskId(int value) {
            this.bitField0_ |= 2;
            this.taskId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskId() {
            this.bitField0_ &= -3;
            this.taskId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCompleteTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getCompleteTime() {
            return this.completeTime_;
         }

         public Builder setCompleteTime(int value) {
            this.bitField0_ |= 4;
            this.completeTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCompleteTime() {
            this.bitField0_ &= -5;
            this.completeTime_ = 0;
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

   public static final class C2S_GetActiveBox_6505 extends GeneratedMessageV3 implements C2S_GetActiveBox_6505OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BOXID_FIELD_NUMBER = 1;
      private int boxId_;
      private byte memoizedIsInitialized;
      private static final C2S_GetActiveBox_6505 DEFAULT_INSTANCE = new C2S_GetActiveBox_6505();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GetActiveBox_6505> PARSER = new AbstractParser<C2S_GetActiveBox_6505>() {
         public C2S_GetActiveBox_6505 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GetActiveBox_6505(input, extensionRegistry);
         }
      };

      private C2S_GetActiveBox_6505(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GetActiveBox_6505() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GetActiveBox_6505();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GetActiveBox_6505(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.boxId_ = input.readInt32();
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
         return TaskMsg.internal_static_task_com_gzbz_protobuf_C2S_GetActiveBox_6505_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TaskMsg.internal_static_task_com_gzbz_protobuf_C2S_GetActiveBox_6505_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetActiveBox_6505.class, Builder.class);
      }

      public boolean hasBoxId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBoxId() {
         return this.boxId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBoxId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.boxId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.boxId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_GetActiveBox_6505)) {
            return super.equals(obj);
         } else {
            C2S_GetActiveBox_6505 other = (C2S_GetActiveBox_6505)obj;
            if (this.hasBoxId() != other.hasBoxId()) {
               return false;
            } else if (this.hasBoxId() && this.getBoxId() != other.getBoxId()) {
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
            if (this.hasBoxId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBoxId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_GetActiveBox_6505 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GetActiveBox_6505)PARSER.parseFrom(data);
      }

      public static C2S_GetActiveBox_6505 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetActiveBox_6505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetActiveBox_6505 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GetActiveBox_6505)PARSER.parseFrom(data);
      }

      public static C2S_GetActiveBox_6505 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetActiveBox_6505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetActiveBox_6505 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GetActiveBox_6505)PARSER.parseFrom(data);
      }

      public static C2S_GetActiveBox_6505 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetActiveBox_6505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetActiveBox_6505 parseFrom(InputStream input) throws IOException {
         return (C2S_GetActiveBox_6505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetActiveBox_6505 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetActiveBox_6505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetActiveBox_6505 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GetActiveBox_6505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GetActiveBox_6505 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetActiveBox_6505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetActiveBox_6505 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GetActiveBox_6505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetActiveBox_6505 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetActiveBox_6505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GetActiveBox_6505 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GetActiveBox_6505 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GetActiveBox_6505> parser() {
         return PARSER;
      }

      public Parser<C2S_GetActiveBox_6505> getParserForType() {
         return PARSER;
      }

      public C2S_GetActiveBox_6505 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GetActiveBox_6505OrBuilder {
         private int bitField0_;
         private int boxId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_C2S_GetActiveBox_6505_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_C2S_GetActiveBox_6505_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetActiveBox_6505.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TaskMsg.C2S_GetActiveBox_6505.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.boxId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_C2S_GetActiveBox_6505_descriptor;
         }

         public C2S_GetActiveBox_6505 getDefaultInstanceForType() {
            return TaskMsg.C2S_GetActiveBox_6505.getDefaultInstance();
         }

         public C2S_GetActiveBox_6505 build() {
            C2S_GetActiveBox_6505 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GetActiveBox_6505 buildPartial() {
            C2S_GetActiveBox_6505 result = new C2S_GetActiveBox_6505(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.boxId_ = this.boxId_;
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
            if (other instanceof C2S_GetActiveBox_6505) {
               return this.mergeFrom((C2S_GetActiveBox_6505)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GetActiveBox_6505 other) {
            if (other == TaskMsg.C2S_GetActiveBox_6505.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBoxId()) {
                  this.setBoxId(other.getBoxId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBoxId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_GetActiveBox_6505 parsedMessage = null;

            try {
               parsedMessage = (C2S_GetActiveBox_6505)TaskMsg.C2S_GetActiveBox_6505.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GetActiveBox_6505)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBoxId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBoxId() {
            return this.boxId_;
         }

         public Builder setBoxId(int value) {
            this.bitField0_ |= 1;
            this.boxId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBoxId() {
            this.bitField0_ &= -2;
            this.boxId_ = 0;
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

   public static final class S2C_GetActiveBoxResult_6506 extends GeneratedMessageV3 implements S2C_GetActiveBoxResult_6506OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int BOXID_FIELD_NUMBER = 2;
      private int boxId_;
      private byte memoizedIsInitialized;
      private static final S2C_GetActiveBoxResult_6506 DEFAULT_INSTANCE = new S2C_GetActiveBoxResult_6506();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GetActiveBoxResult_6506> PARSER = new AbstractParser<S2C_GetActiveBoxResult_6506>() {
         public S2C_GetActiveBoxResult_6506 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GetActiveBoxResult_6506(input, extensionRegistry);
         }
      };

      private S2C_GetActiveBoxResult_6506(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GetActiveBoxResult_6506() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GetActiveBoxResult_6506();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GetActiveBoxResult_6506(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.result_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.boxId_ = input.readInt32();
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
         return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_GetActiveBoxResult_6506_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_GetActiveBoxResult_6506_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetActiveBoxResult_6506.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasBoxId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBoxId() {
         return this.boxId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBoxId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.boxId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.result_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.boxId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GetActiveBoxResult_6506)) {
            return super.equals(obj);
         } else {
            S2C_GetActiveBoxResult_6506 other = (S2C_GetActiveBoxResult_6506)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasBoxId() != other.hasBoxId()) {
               return false;
            } else if (this.hasBoxId() && this.getBoxId() != other.getBoxId()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasBoxId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBoxId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GetActiveBoxResult_6506 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GetActiveBoxResult_6506)PARSER.parseFrom(data);
      }

      public static S2C_GetActiveBoxResult_6506 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetActiveBoxResult_6506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetActiveBoxResult_6506 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GetActiveBoxResult_6506)PARSER.parseFrom(data);
      }

      public static S2C_GetActiveBoxResult_6506 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetActiveBoxResult_6506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetActiveBoxResult_6506 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GetActiveBoxResult_6506)PARSER.parseFrom(data);
      }

      public static S2C_GetActiveBoxResult_6506 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetActiveBoxResult_6506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetActiveBoxResult_6506 parseFrom(InputStream input) throws IOException {
         return (S2C_GetActiveBoxResult_6506)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetActiveBoxResult_6506 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetActiveBoxResult_6506)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetActiveBoxResult_6506 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GetActiveBoxResult_6506)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GetActiveBoxResult_6506 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetActiveBoxResult_6506)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetActiveBoxResult_6506 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GetActiveBoxResult_6506)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetActiveBoxResult_6506 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetActiveBoxResult_6506)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GetActiveBoxResult_6506 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GetActiveBoxResult_6506 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GetActiveBoxResult_6506> parser() {
         return PARSER;
      }

      public Parser<S2C_GetActiveBoxResult_6506> getParserForType() {
         return PARSER;
      }

      public S2C_GetActiveBoxResult_6506 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GetActiveBoxResult_6506OrBuilder {
         private int bitField0_;
         private int result_;
         private int boxId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_GetActiveBoxResult_6506_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_GetActiveBoxResult_6506_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetActiveBoxResult_6506.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TaskMsg.S2C_GetActiveBoxResult_6506.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.boxId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_GetActiveBoxResult_6506_descriptor;
         }

         public S2C_GetActiveBoxResult_6506 getDefaultInstanceForType() {
            return TaskMsg.S2C_GetActiveBoxResult_6506.getDefaultInstance();
         }

         public S2C_GetActiveBoxResult_6506 build() {
            S2C_GetActiveBoxResult_6506 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GetActiveBoxResult_6506 buildPartial() {
            S2C_GetActiveBoxResult_6506 result = new S2C_GetActiveBoxResult_6506(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.boxId_ = this.boxId_;
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
            if (other instanceof S2C_GetActiveBoxResult_6506) {
               return this.mergeFrom((S2C_GetActiveBoxResult_6506)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GetActiveBoxResult_6506 other) {
            if (other == TaskMsg.S2C_GetActiveBoxResult_6506.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasBoxId()) {
                  this.setBoxId(other.getBoxId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else {
               return this.hasBoxId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GetActiveBoxResult_6506 parsedMessage = null;

            try {
               parsedMessage = (S2C_GetActiveBoxResult_6506)TaskMsg.S2C_GetActiveBoxResult_6506.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GetActiveBoxResult_6506)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 1;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -2;
            this.result_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBoxId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBoxId() {
            return this.boxId_;
         }

         public Builder setBoxId(int value) {
            this.bitField0_ |= 2;
            this.boxId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBoxId() {
            this.bitField0_ &= -3;
            this.boxId_ = 0;
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

   public static final class S2C_TaskNotify_6508 extends GeneratedMessageV3 implements S2C_TaskNotify_6508OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASK_FIELD_NUMBER = 1;
      private TaskData task_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskNotify_6508 DEFAULT_INSTANCE = new S2C_TaskNotify_6508();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskNotify_6508> PARSER = new AbstractParser<S2C_TaskNotify_6508>() {
         public S2C_TaskNotify_6508 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskNotify_6508(input, extensionRegistry);
         }
      };

      private S2C_TaskNotify_6508(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskNotify_6508() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskNotify_6508();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskNotify_6508(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        TaskData.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.task_.toBuilder();
                        }

                        this.task_ = (TaskData)input.readMessage(TaskMsg.TaskData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.task_);
                           this.task_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
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
         return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_TaskNotify_6508_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_TaskNotify_6508_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskNotify_6508.class, Builder.class);
      }

      public boolean hasTask() {
         return (this.bitField0_ & 1) != 0;
      }

      public TaskData getTask() {
         return this.task_ == null ? TaskMsg.TaskData.getDefaultInstance() : this.task_;
      }

      public TaskDataOrBuilder getTaskOrBuilder() {
         return this.task_ == null ? TaskMsg.TaskData.getDefaultInstance() : this.task_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTask()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getTask().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getTask());
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
               size += CodedOutputStream.computeMessageSize(1, this.getTask());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TaskNotify_6508)) {
            return super.equals(obj);
         } else {
            S2C_TaskNotify_6508 other = (S2C_TaskNotify_6508)obj;
            if (this.hasTask() != other.hasTask()) {
               return false;
            } else if (this.hasTask() && !this.getTask().equals(other.getTask())) {
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
            if (this.hasTask()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTask().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TaskNotify_6508 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_6508)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotify_6508 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_6508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotify_6508 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_6508)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotify_6508 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_6508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotify_6508 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_6508)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotify_6508 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_6508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotify_6508 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskNotify_6508)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskNotify_6508 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotify_6508)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskNotify_6508 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskNotify_6508)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskNotify_6508 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotify_6508)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskNotify_6508 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskNotify_6508)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskNotify_6508 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotify_6508)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskNotify_6508 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskNotify_6508 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskNotify_6508> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskNotify_6508> getParserForType() {
         return PARSER;
      }

      public S2C_TaskNotify_6508 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskNotify_6508OrBuilder {
         private int bitField0_;
         private TaskData task_;
         private SingleFieldBuilderV3<TaskData, TaskData.Builder, TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_TaskNotify_6508_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_TaskNotify_6508_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskNotify_6508.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TaskMsg.S2C_TaskNotify_6508.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.taskBuilder_ == null) {
               this.task_ = null;
            } else {
               this.taskBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_TaskNotify_6508_descriptor;
         }

         public S2C_TaskNotify_6508 getDefaultInstanceForType() {
            return TaskMsg.S2C_TaskNotify_6508.getDefaultInstance();
         }

         public S2C_TaskNotify_6508 build() {
            S2C_TaskNotify_6508 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskNotify_6508 buildPartial() {
            S2C_TaskNotify_6508 result = new S2C_TaskNotify_6508(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.taskBuilder_ == null) {
                  result.task_ = this.task_;
               } else {
                  result.task_ = (TaskData)this.taskBuilder_.build();
               }

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
            if (other instanceof S2C_TaskNotify_6508) {
               return this.mergeFrom((S2C_TaskNotify_6508)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskNotify_6508 other) {
            if (other == TaskMsg.S2C_TaskNotify_6508.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTask()) {
                  this.mergeTask(other.getTask());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTask()) {
               return false;
            } else {
               return this.getTask().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TaskNotify_6508 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskNotify_6508)TaskMsg.S2C_TaskNotify_6508.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskNotify_6508)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTask() {
            return (this.bitField0_ & 1) != 0;
         }

         public TaskData getTask() {
            if (this.taskBuilder_ == null) {
               return this.task_ == null ? TaskMsg.TaskData.getDefaultInstance() : this.task_;
            } else {
               return (TaskData)this.taskBuilder_.getMessage();
            }
         }

         public Builder setTask(TaskData value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.task_ = value;
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setTask(TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.task_ = builderForValue.build();
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeTask(TaskData value) {
            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.task_ != null && this.task_ != TaskMsg.TaskData.getDefaultInstance()) {
                  this.task_ = TaskMsg.TaskData.newBuilder(this.task_).mergeFrom(value).buildPartial();
               } else {
                  this.task_ = value;
               }

               this.onChanged();
            } else {
               this.taskBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearTask() {
            if (this.taskBuilder_ == null) {
               this.task_ = null;
               this.onChanged();
            } else {
               this.taskBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public TaskData.Builder getTaskBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (TaskData.Builder)this.getTaskFieldBuilder().getBuilder();
         }

         public TaskDataOrBuilder getTaskOrBuilder() {
            if (this.taskBuilder_ != null) {
               return (TaskDataOrBuilder)this.taskBuilder_.getMessageOrBuilder();
            } else {
               return this.task_ == null ? TaskMsg.TaskData.getDefaultInstance() : this.task_;
            }
         }

         private SingleFieldBuilderV3<TaskData, TaskData.Builder, TaskDataOrBuilder> getTaskFieldBuilder() {
            if (this.taskBuilder_ == null) {
               this.taskBuilder_ = new SingleFieldBuilderV3(this.getTask(), this.getParentForChildren(), this.isClean());
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

   public static final class S2C_TasksNotify_6510 extends GeneratedMessageV3 implements S2C_TasksNotify_6510OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_TasksNotify_6510 DEFAULT_INSTANCE = new S2C_TasksNotify_6510();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TasksNotify_6510> PARSER = new AbstractParser<S2C_TasksNotify_6510>() {
         public S2C_TasksNotify_6510 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TasksNotify_6510(input, extensionRegistry);
         }
      };

      private S2C_TasksNotify_6510(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TasksNotify_6510() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TasksNotify_6510();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TasksNotify_6510(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.task_.add(input.readMessage(TaskMsg.TaskData.PARSER, extensionRegistry));
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
         return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_TasksNotify_6510_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_TasksNotify_6510_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TasksNotify_6510.class, Builder.class);
      }

      public List<TaskData> getTaskList() {
         return this.task_;
      }

      public List<? extends TaskDataOrBuilder> getTaskOrBuilderList() {
         return this.task_;
      }

      public int getTaskCount() {
         return this.task_.size();
      }

      public TaskData getTask(int index) {
         return (TaskData)this.task_.get(index);
      }

      public TaskDataOrBuilder getTaskOrBuilder(int index) {
         return (TaskDataOrBuilder)this.task_.get(index);
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
         } else if (!(obj instanceof S2C_TasksNotify_6510)) {
            return super.equals(obj);
         } else {
            S2C_TasksNotify_6510 other = (S2C_TasksNotify_6510)obj;
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

      public static S2C_TasksNotify_6510 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TasksNotify_6510)PARSER.parseFrom(data);
      }

      public static S2C_TasksNotify_6510 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TasksNotify_6510)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TasksNotify_6510 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TasksNotify_6510)PARSER.parseFrom(data);
      }

      public static S2C_TasksNotify_6510 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TasksNotify_6510)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TasksNotify_6510 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TasksNotify_6510)PARSER.parseFrom(data);
      }

      public static S2C_TasksNotify_6510 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TasksNotify_6510)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TasksNotify_6510 parseFrom(InputStream input) throws IOException {
         return (S2C_TasksNotify_6510)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TasksNotify_6510 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TasksNotify_6510)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TasksNotify_6510 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TasksNotify_6510)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TasksNotify_6510 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TasksNotify_6510)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TasksNotify_6510 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TasksNotify_6510)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TasksNotify_6510 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TasksNotify_6510)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TasksNotify_6510 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TasksNotify_6510 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TasksNotify_6510> parser() {
         return PARSER;
      }

      public Parser<S2C_TasksNotify_6510> getParserForType() {
         return PARSER;
      }

      public S2C_TasksNotify_6510 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TasksNotify_6510OrBuilder {
         private int bitField0_;
         private List<TaskData> task_;
         private RepeatedFieldBuilderV3<TaskData, TaskData.Builder, TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_TasksNotify_6510_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_TasksNotify_6510_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TasksNotify_6510.class, Builder.class);
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
            if (TaskMsg.S2C_TasksNotify_6510.alwaysUseFieldBuilders) {
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
            return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_TasksNotify_6510_descriptor;
         }

         public S2C_TasksNotify_6510 getDefaultInstanceForType() {
            return TaskMsg.S2C_TasksNotify_6510.getDefaultInstance();
         }

         public S2C_TasksNotify_6510 build() {
            S2C_TasksNotify_6510 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TasksNotify_6510 buildPartial() {
            S2C_TasksNotify_6510 result = new S2C_TasksNotify_6510(this);
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
            if (other instanceof S2C_TasksNotify_6510) {
               return this.mergeFrom((S2C_TasksNotify_6510)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TasksNotify_6510 other) {
            if (other == TaskMsg.S2C_TasksNotify_6510.getDefaultInstance()) {
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
                     this.taskBuilder_ = TaskMsg.S2C_TasksNotify_6510.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_TasksNotify_6510 parsedMessage = null;

            try {
               parsedMessage = (S2C_TasksNotify_6510)TaskMsg.S2C_TasksNotify_6510.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TasksNotify_6510)e.getUnfinishedMessage();
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

         public List<TaskData> getTaskList() {
            return this.taskBuilder_ == null ? Collections.unmodifiableList(this.task_) : this.taskBuilder_.getMessageList();
         }

         public int getTaskCount() {
            return this.taskBuilder_ == null ? this.task_.size() : this.taskBuilder_.getCount();
         }

         public TaskData getTask(int index) {
            return this.taskBuilder_ == null ? (TaskData)this.task_.get(index) : (TaskData)this.taskBuilder_.getMessage(index);
         }

         public Builder setTask(int index, TaskData value) {
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

         public Builder setTask(int index, TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTask(TaskData value) {
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

         public Builder addTask(int index, TaskData value) {
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

         public Builder addTask(TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTask(int index, TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTask(Iterable<? extends TaskData> values) {
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

         public TaskData.Builder getTaskBuilder(int index) {
            return (TaskData.Builder)this.getTaskFieldBuilder().getBuilder(index);
         }

         public TaskDataOrBuilder getTaskOrBuilder(int index) {
            return this.taskBuilder_ == null ? (TaskDataOrBuilder)this.task_.get(index) : (TaskDataOrBuilder)this.taskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends TaskDataOrBuilder> getTaskOrBuilderList() {
            return this.taskBuilder_ != null ? this.taskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.task_);
         }

         public TaskData.Builder addTaskBuilder() {
            return (TaskData.Builder)this.getTaskFieldBuilder().addBuilder(TaskMsg.TaskData.getDefaultInstance());
         }

         public TaskData.Builder addTaskBuilder(int index) {
            return (TaskData.Builder)this.getTaskFieldBuilder().addBuilder(index, TaskMsg.TaskData.getDefaultInstance());
         }

         public List<TaskData.Builder> getTaskBuilderList() {
            return this.getTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<TaskData, TaskData.Builder, TaskDataOrBuilder> getTaskFieldBuilder() {
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

   public static final class C2S_OneKeyCommit_6511 extends GeneratedMessageV3 implements C2S_OneKeyCommit_6511OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKTYPE_FIELD_NUMBER = 1;
      private int taskType_;
      private byte memoizedIsInitialized;
      private static final C2S_OneKeyCommit_6511 DEFAULT_INSTANCE = new C2S_OneKeyCommit_6511();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OneKeyCommit_6511> PARSER = new AbstractParser<C2S_OneKeyCommit_6511>() {
         public C2S_OneKeyCommit_6511 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OneKeyCommit_6511(input, extensionRegistry);
         }
      };

      private C2S_OneKeyCommit_6511(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OneKeyCommit_6511() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OneKeyCommit_6511();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OneKeyCommit_6511(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.taskType_ = input.readInt32();
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
         return TaskMsg.internal_static_task_com_gzbz_protobuf_C2S_OneKeyCommit_6511_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TaskMsg.internal_static_task_com_gzbz_protobuf_C2S_OneKeyCommit_6511_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OneKeyCommit_6511.class, Builder.class);
      }

      public boolean hasTaskType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTaskType() {
         return this.taskType_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTaskType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.taskType_);
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
               size += CodedOutputStream.computeInt32Size(1, this.taskType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_OneKeyCommit_6511)) {
            return super.equals(obj);
         } else {
            C2S_OneKeyCommit_6511 other = (C2S_OneKeyCommit_6511)obj;
            if (this.hasTaskType() != other.hasTaskType()) {
               return false;
            } else if (this.hasTaskType() && this.getTaskType() != other.getTaskType()) {
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
            if (this.hasTaskType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_OneKeyCommit_6511 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyCommit_6511)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyCommit_6511 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyCommit_6511)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyCommit_6511 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyCommit_6511)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyCommit_6511 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyCommit_6511)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyCommit_6511 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyCommit_6511)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyCommit_6511 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyCommit_6511)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyCommit_6511 parseFrom(InputStream input) throws IOException {
         return (C2S_OneKeyCommit_6511)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OneKeyCommit_6511 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyCommit_6511)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OneKeyCommit_6511 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OneKeyCommit_6511)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OneKeyCommit_6511 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyCommit_6511)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OneKeyCommit_6511 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OneKeyCommit_6511)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OneKeyCommit_6511 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyCommit_6511)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OneKeyCommit_6511 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OneKeyCommit_6511 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OneKeyCommit_6511> parser() {
         return PARSER;
      }

      public Parser<C2S_OneKeyCommit_6511> getParserForType() {
         return PARSER;
      }

      public C2S_OneKeyCommit_6511 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OneKeyCommit_6511OrBuilder {
         private int bitField0_;
         private int taskType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_C2S_OneKeyCommit_6511_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_C2S_OneKeyCommit_6511_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OneKeyCommit_6511.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TaskMsg.C2S_OneKeyCommit_6511.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskType_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_C2S_OneKeyCommit_6511_descriptor;
         }

         public C2S_OneKeyCommit_6511 getDefaultInstanceForType() {
            return TaskMsg.C2S_OneKeyCommit_6511.getDefaultInstance();
         }

         public C2S_OneKeyCommit_6511 build() {
            C2S_OneKeyCommit_6511 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OneKeyCommit_6511 buildPartial() {
            C2S_OneKeyCommit_6511 result = new C2S_OneKeyCommit_6511(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.taskType_ = this.taskType_;
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
            if (other instanceof C2S_OneKeyCommit_6511) {
               return this.mergeFrom((C2S_OneKeyCommit_6511)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OneKeyCommit_6511 other) {
            if (other == TaskMsg.C2S_OneKeyCommit_6511.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTaskType()) {
                  this.setTaskType(other.getTaskType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTaskType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_OneKeyCommit_6511 parsedMessage = null;

            try {
               parsedMessage = (C2S_OneKeyCommit_6511)TaskMsg.C2S_OneKeyCommit_6511.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OneKeyCommit_6511)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTaskType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTaskType() {
            return this.taskType_;
         }

         public Builder setTaskType(int value) {
            this.bitField0_ |= 1;
            this.taskType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskType() {
            this.bitField0_ &= -2;
            this.taskType_ = 0;
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

   public static final class S2C_OneKeyCommit_6512 extends GeneratedMessageV3 implements S2C_OneKeyCommit_6512OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKTYPE_FIELD_NUMBER = 1;
      private int taskType_;
      public static final int TASKID_FIELD_NUMBER = 2;
      private Internal.IntList taskId_;
      public static final int BOX_FIELD_NUMBER = 3;
      private Internal.IntList box_;
      private byte memoizedIsInitialized;
      private static final S2C_OneKeyCommit_6512 DEFAULT_INSTANCE = new S2C_OneKeyCommit_6512();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OneKeyCommit_6512> PARSER = new AbstractParser<S2C_OneKeyCommit_6512>() {
         public S2C_OneKeyCommit_6512 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OneKeyCommit_6512(input, extensionRegistry);
         }
      };

      private S2C_OneKeyCommit_6512(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OneKeyCommit_6512() {
         this.memoizedIsInitialized = -1;
         this.taskId_ = emptyIntList();
         this.box_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OneKeyCommit_6512();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OneKeyCommit_6512(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.taskType_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.taskId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.taskId_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.taskId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.box_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.box_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.box_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.box_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.taskId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.taskId_.makeImmutable();
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.box_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_OneKeyCommit_6512_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_OneKeyCommit_6512_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OneKeyCommit_6512.class, Builder.class);
      }

      public boolean hasTaskType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTaskType() {
         return this.taskType_;
      }

      public List<Integer> getTaskIdList() {
         return this.taskId_;
      }

      public int getTaskIdCount() {
         return this.taskId_.size();
      }

      public int getTaskId(int index) {
         return this.taskId_.getInt(index);
      }

      public List<Integer> getBoxList() {
         return this.box_;
      }

      public int getBoxCount() {
         return this.box_.size();
      }

      public int getBox(int index) {
         return this.box_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTaskType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.taskType_);
         }

         for(int i = 0; i < this.taskId_.size(); ++i) {
            output.writeInt32(2, this.taskId_.getInt(i));
         }

         for(int i = 0; i < this.box_.size(); ++i) {
            output.writeInt32(3, this.box_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.taskType_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.taskId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.taskId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTaskIdList().size();
            dataSize = 0;

            for(int i = 0; i < this.box_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.box_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getBoxList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OneKeyCommit_6512)) {
            return super.equals(obj);
         } else {
            S2C_OneKeyCommit_6512 other = (S2C_OneKeyCommit_6512)obj;
            if (this.hasTaskType() != other.hasTaskType()) {
               return false;
            } else if (this.hasTaskType() && this.getTaskType() != other.getTaskType()) {
               return false;
            } else if (!this.getTaskIdList().equals(other.getTaskIdList())) {
               return false;
            } else if (!this.getBoxList().equals(other.getBoxList())) {
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
            if (this.hasTaskType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskType();
            }

            if (this.getTaskIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTaskIdList().hashCode();
            }

            if (this.getBoxCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBoxList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OneKeyCommit_6512 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyCommit_6512)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyCommit_6512 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyCommit_6512)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyCommit_6512 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyCommit_6512)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyCommit_6512 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyCommit_6512)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyCommit_6512 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyCommit_6512)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyCommit_6512 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyCommit_6512)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyCommit_6512 parseFrom(InputStream input) throws IOException {
         return (S2C_OneKeyCommit_6512)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OneKeyCommit_6512 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyCommit_6512)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OneKeyCommit_6512 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OneKeyCommit_6512)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OneKeyCommit_6512 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyCommit_6512)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OneKeyCommit_6512 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OneKeyCommit_6512)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OneKeyCommit_6512 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyCommit_6512)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OneKeyCommit_6512 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OneKeyCommit_6512 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OneKeyCommit_6512> parser() {
         return PARSER;
      }

      public Parser<S2C_OneKeyCommit_6512> getParserForType() {
         return PARSER;
      }

      public S2C_OneKeyCommit_6512 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OneKeyCommit_6512OrBuilder {
         private int bitField0_;
         private int taskType_;
         private Internal.IntList taskId_;
         private Internal.IntList box_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_OneKeyCommit_6512_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_OneKeyCommit_6512_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OneKeyCommit_6512.class, Builder.class);
         }

         private Builder() {
            this.taskId_ = TaskMsg.S2C_OneKeyCommit_6512.emptyIntList();
            this.box_ = TaskMsg.S2C_OneKeyCommit_6512.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.taskId_ = TaskMsg.S2C_OneKeyCommit_6512.emptyIntList();
            this.box_ = TaskMsg.S2C_OneKeyCommit_6512.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TaskMsg.S2C_OneKeyCommit_6512.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskType_ = 0;
            this.bitField0_ &= -2;
            this.taskId_ = TaskMsg.S2C_OneKeyCommit_6512.emptyIntList();
            this.bitField0_ &= -3;
            this.box_ = TaskMsg.S2C_OneKeyCommit_6512.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TaskMsg.internal_static_task_com_gzbz_protobuf_S2C_OneKeyCommit_6512_descriptor;
         }

         public S2C_OneKeyCommit_6512 getDefaultInstanceForType() {
            return TaskMsg.S2C_OneKeyCommit_6512.getDefaultInstance();
         }

         public S2C_OneKeyCommit_6512 build() {
            S2C_OneKeyCommit_6512 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OneKeyCommit_6512 buildPartial() {
            S2C_OneKeyCommit_6512 result = new S2C_OneKeyCommit_6512(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.taskType_ = this.taskType_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.taskId_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.taskId_ = this.taskId_;
            if ((this.bitField0_ & 4) != 0) {
               this.box_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.box_ = this.box_;
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
            if (other instanceof S2C_OneKeyCommit_6512) {
               return this.mergeFrom((S2C_OneKeyCommit_6512)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OneKeyCommit_6512 other) {
            if (other == TaskMsg.S2C_OneKeyCommit_6512.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTaskType()) {
                  this.setTaskType(other.getTaskType());
               }

               if (!other.taskId_.isEmpty()) {
                  if (this.taskId_.isEmpty()) {
                     this.taskId_ = other.taskId_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureTaskIdIsMutable();
                     this.taskId_.addAll(other.taskId_);
                  }

                  this.onChanged();
               }

               if (!other.box_.isEmpty()) {
                  if (this.box_.isEmpty()) {
                     this.box_ = other.box_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureBoxIsMutable();
                     this.box_.addAll(other.box_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTaskType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OneKeyCommit_6512 parsedMessage = null;

            try {
               parsedMessage = (S2C_OneKeyCommit_6512)TaskMsg.S2C_OneKeyCommit_6512.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OneKeyCommit_6512)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTaskType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTaskType() {
            return this.taskType_;
         }

         public Builder setTaskType(int value) {
            this.bitField0_ |= 1;
            this.taskType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskType() {
            this.bitField0_ &= -2;
            this.taskType_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureTaskIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.taskId_ = TaskMsg.S2C_OneKeyCommit_6512.mutableCopy(this.taskId_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getTaskIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.taskId_) : this.taskId_);
         }

         public int getTaskIdCount() {
            return this.taskId_.size();
         }

         public int getTaskId(int index) {
            return this.taskId_.getInt(index);
         }

         public Builder setTaskId(int index, int value) {
            this.ensureTaskIdIsMutable();
            this.taskId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTaskId(int value) {
            this.ensureTaskIdIsMutable();
            this.taskId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTaskId(Iterable<? extends Integer> values) {
            this.ensureTaskIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.taskId_);
            this.onChanged();
            return this;
         }

         public Builder clearTaskId() {
            this.taskId_ = TaskMsg.S2C_OneKeyCommit_6512.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         private void ensureBoxIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.box_ = TaskMsg.S2C_OneKeyCommit_6512.mutableCopy(this.box_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getBoxList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.box_) : this.box_);
         }

         public int getBoxCount() {
            return this.box_.size();
         }

         public int getBox(int index) {
            return this.box_.getInt(index);
         }

         public Builder setBox(int index, int value) {
            this.ensureBoxIsMutable();
            this.box_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addBox(int value) {
            this.ensureBoxIsMutable();
            this.box_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllBox(Iterable<? extends Integer> values) {
            this.ensureBoxIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.box_);
            this.onChanged();
            return this;
         }

         public Builder clearBox() {
            this.box_ = TaskMsg.S2C_OneKeyCommit_6512.emptyIntList();
            this.bitField0_ &= -5;
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

   public interface C2S_CommitTask_6503OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_GetActiveBox_6505OrBuilder extends MessageOrBuilder {
      boolean hasBoxId();

      int getBoxId();
   }

   public interface C2S_OneKeyCommit_6511OrBuilder extends MessageOrBuilder {
      boolean hasTaskType();

      int getTaskType();
   }

   public interface C2S_TaskList_6501OrBuilder extends MessageOrBuilder {
      boolean hasTaskType();

      int getTaskType();
   }

   public interface S2C_CommitTaskResult_6504OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasTaskId();

      int getTaskId();

      boolean hasCompleteTime();

      int getCompleteTime();
   }

   public interface S2C_GetActiveBoxResult_6506OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasBoxId();

      int getBoxId();
   }

   public interface S2C_OneKeyCommit_6512OrBuilder extends MessageOrBuilder {
      boolean hasTaskType();

      int getTaskType();

      List<Integer> getTaskIdList();

      int getTaskIdCount();

      int getTaskId(int index);

      List<Integer> getBoxList();

      int getBoxCount();

      int getBox(int index);
   }

   public interface S2C_TaskListResult_6502OrBuilder extends MessageOrBuilder {
      List<TaskData> getTasksList();

      TaskData getTasks(int index);

      int getTasksCount();

      List<? extends TaskDataOrBuilder> getTasksOrBuilderList();

      TaskDataOrBuilder getTasksOrBuilder(int index);

      boolean hasActive();

      int getActive();

      List<Integer> getBoxIdList();

      int getBoxIdCount();

      int getBoxId(int index);
   }

   public interface S2C_TaskNotify_6508OrBuilder extends MessageOrBuilder {
      boolean hasTask();

      TaskData getTask();

      TaskDataOrBuilder getTaskOrBuilder();
   }

   public interface S2C_TasksNotify_6510OrBuilder extends MessageOrBuilder {
      List<TaskData> getTaskList();

      TaskData getTask(int index);

      int getTaskCount();

      List<? extends TaskDataOrBuilder> getTaskOrBuilderList();

      TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface TaskDataOrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();

      boolean hasTaskType();

      int getTaskType();

      boolean hasState();

      int getState();

      boolean hasProgress();

      int getProgress();

      boolean hasCompleteTime();

      int getCompleteTime();
   }
}
