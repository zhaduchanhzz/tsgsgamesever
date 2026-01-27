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

public final class ActivityNewWeekMsg {
   private static final Descriptors.Descriptor internal_static_activityNewWeek_com_gzbz_protobuf_NewWeekGroupDate_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityNewWeek_com_gzbz_protobuf_NewWeekGroupDate_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekInfo_25101_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekInfo_25101_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekInfo_25102_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekInfo_25102_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityNewWeek_com_gzbz_protobuf_S2C_HeroRiseTasks_25103_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityNewWeek_com_gzbz_protobuf_S2C_HeroRiseTasks_25103_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekReward_25104_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekReward_25104_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekReward_25105_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekReward_25105_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekBuy_25106_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekBuy_25106_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekBuy_25107_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekBuy_25107_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekUpdate_25108_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekUpdate_25108_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityNewWeek_com_gzbz_protobuf_C2S_ReceiveMakeUpReward_25109_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityNewWeek_com_gzbz_protobuf_C2S_ReceiveMakeUpReward_25109_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityNewWeek_com_gzbz_protobuf_S2C_ReceiveMakeUpReward_25110_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityNewWeek_com_gzbz_protobuf_S2C_ReceiveMakeUpReward_25110_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ActivityNewWeekMsg() {
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
      String[] descriptorData = new String[]{"\n\u0015ActivityNewWeek.proto\u0012!activityNewWeek.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u000eActivity.proto\"g\n\u0010NewWeekGroupDate\u0012\u000e\n\u0006stepId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0002 \u0002(\u0005\u00122\n\u0004task\u0018\u0003 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"\u0017\n\u0015C2S_NewWeekInfo_25101\"\u0096\u0001\n\u0015S2C_NewWeekInfo_25102\u0012\u0011\n\tstartTime\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0003 \u0002(\u0005\u0012J\n\rtaskGroupData\u0018\u0004 \u0003(\u000b23.activityNewWeek.com.gzbz.protobuf.NewWeekGroupDate\"M\n\u0017S2C_HeroRiseTasks_25103\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\")\n\u0017C2S_NewWeekReward_25104\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\")\n\u0017S2C_NewWeekReward_25105\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"3\n\u0014C2S_NewWeekBuy_25106\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005count\u0018\u0002 \u0002(\u0005\"B\n\u0014S2C_NewWeekBuy_25107\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005count\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0003 \u0002(\u0005\"(\n\u0017S2C_NewWeekUpdate_25108\u0012\r\n\u0005level\u0018\u0001 \u0002(\u0005\"+\n\u001dC2S_ReceiveMakeUpReward_25109\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"8\n\u001dS2C_ReceiveMakeUpReward_25110\u0012\u0017\n\u000fmakeUpReceiveId\u0018\u0001 \u0003(\u0005B)\n\u0011com.gzbz.protobufB\u0012ActivityNewWeekMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), ActivityMsg.getDescriptor()});
      internal_static_activityNewWeek_com_gzbz_protobuf_NewWeekGroupDate_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_activityNewWeek_com_gzbz_protobuf_NewWeekGroupDate_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityNewWeek_com_gzbz_protobuf_NewWeekGroupDate_descriptor, new String[]{"StepId", "EndTime", "Task"});
      internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekInfo_25101_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekInfo_25101_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekInfo_25101_descriptor, new String[0]);
      internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekInfo_25102_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekInfo_25102_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekInfo_25102_descriptor, new String[]{"StartTime", "EndTime", "Level", "TaskGroupData"});
      internal_static_activityNewWeek_com_gzbz_protobuf_S2C_HeroRiseTasks_25103_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_activityNewWeek_com_gzbz_protobuf_S2C_HeroRiseTasks_25103_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityNewWeek_com_gzbz_protobuf_S2C_HeroRiseTasks_25103_descriptor, new String[]{"Task"});
      internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekReward_25104_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekReward_25104_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekReward_25104_descriptor, new String[]{"TaskId"});
      internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekReward_25105_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekReward_25105_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekReward_25105_descriptor, new String[]{"TaskId"});
      internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekBuy_25106_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekBuy_25106_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekBuy_25106_descriptor, new String[]{"Type", "Count"});
      internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekBuy_25107_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekBuy_25107_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekBuy_25107_descriptor, new String[]{"Type", "Count", "Level"});
      internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekUpdate_25108_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekUpdate_25108_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekUpdate_25108_descriptor, new String[]{"Level"});
      internal_static_activityNewWeek_com_gzbz_protobuf_C2S_ReceiveMakeUpReward_25109_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_activityNewWeek_com_gzbz_protobuf_C2S_ReceiveMakeUpReward_25109_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityNewWeek_com_gzbz_protobuf_C2S_ReceiveMakeUpReward_25109_descriptor, new String[]{"Id"});
      internal_static_activityNewWeek_com_gzbz_protobuf_S2C_ReceiveMakeUpReward_25110_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_activityNewWeek_com_gzbz_protobuf_S2C_ReceiveMakeUpReward_25110_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityNewWeek_com_gzbz_protobuf_S2C_ReceiveMakeUpReward_25110_descriptor, new String[]{"MakeUpReceiveId"});
      CommonMsg.getDescriptor();
      ActivityMsg.getDescriptor();
   }

   public static final class NewWeekGroupDate extends GeneratedMessageV3 implements NewWeekGroupDateOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STEPID_FIELD_NUMBER = 1;
      private int stepId_;
      public static final int ENDTIME_FIELD_NUMBER = 2;
      private int endTime_;
      public static final int TASK_FIELD_NUMBER = 3;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final NewWeekGroupDate DEFAULT_INSTANCE = new NewWeekGroupDate();
      /** @deprecated */
      @Deprecated
      public static final Parser<NewWeekGroupDate> PARSER = new AbstractParser<NewWeekGroupDate>() {
         public NewWeekGroupDate parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new NewWeekGroupDate(input, extensionRegistry);
         }
      };

      private NewWeekGroupDate(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private NewWeekGroupDate() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new NewWeekGroupDate();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private NewWeekGroupDate(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_NewWeekGroupDate_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_NewWeekGroupDate_fieldAccessorTable.ensureFieldAccessorsInitialized(NewWeekGroupDate.class, Builder.class);
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
         } else if (!(obj instanceof NewWeekGroupDate)) {
            return super.equals(obj);
         } else {
            NewWeekGroupDate other = (NewWeekGroupDate)obj;
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

      public static NewWeekGroupDate parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (NewWeekGroupDate)PARSER.parseFrom(data);
      }

      public static NewWeekGroupDate parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (NewWeekGroupDate)PARSER.parseFrom(data, extensionRegistry);
      }

      public static NewWeekGroupDate parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (NewWeekGroupDate)PARSER.parseFrom(data);
      }

      public static NewWeekGroupDate parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (NewWeekGroupDate)PARSER.parseFrom(data, extensionRegistry);
      }

      public static NewWeekGroupDate parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (NewWeekGroupDate)PARSER.parseFrom(data);
      }

      public static NewWeekGroupDate parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (NewWeekGroupDate)PARSER.parseFrom(data, extensionRegistry);
      }

      public static NewWeekGroupDate parseFrom(InputStream input) throws IOException {
         return (NewWeekGroupDate)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static NewWeekGroupDate parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (NewWeekGroupDate)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static NewWeekGroupDate parseDelimitedFrom(InputStream input) throws IOException {
         return (NewWeekGroupDate)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static NewWeekGroupDate parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (NewWeekGroupDate)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static NewWeekGroupDate parseFrom(CodedInputStream input) throws IOException {
         return (NewWeekGroupDate)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static NewWeekGroupDate parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (NewWeekGroupDate)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(NewWeekGroupDate prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static NewWeekGroupDate getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<NewWeekGroupDate> parser() {
         return PARSER;
      }

      public Parser<NewWeekGroupDate> getParserForType() {
         return PARSER;
      }

      public NewWeekGroupDate getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NewWeekGroupDateOrBuilder {
         private int bitField0_;
         private int stepId_;
         private int endTime_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_NewWeekGroupDate_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_NewWeekGroupDate_fieldAccessorTable.ensureFieldAccessorsInitialized(NewWeekGroupDate.class, Builder.class);
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
            if (ActivityNewWeekMsg.NewWeekGroupDate.alwaysUseFieldBuilders) {
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
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_NewWeekGroupDate_descriptor;
         }

         public NewWeekGroupDate getDefaultInstanceForType() {
            return ActivityNewWeekMsg.NewWeekGroupDate.getDefaultInstance();
         }

         public NewWeekGroupDate build() {
            NewWeekGroupDate result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public NewWeekGroupDate buildPartial() {
            NewWeekGroupDate result = new NewWeekGroupDate(this);
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
            if (other instanceof NewWeekGroupDate) {
               return this.mergeFrom((NewWeekGroupDate)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(NewWeekGroupDate other) {
            if (other == ActivityNewWeekMsg.NewWeekGroupDate.getDefaultInstance()) {
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
                     this.taskBuilder_ = ActivityNewWeekMsg.NewWeekGroupDate.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            NewWeekGroupDate parsedMessage = null;

            try {
               parsedMessage = (NewWeekGroupDate)ActivityNewWeekMsg.NewWeekGroupDate.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (NewWeekGroupDate)e.getUnfinishedMessage();
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

   public static final class C2S_NewWeekInfo_25101 extends GeneratedMessageV3 implements C2S_NewWeekInfo_25101OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_NewWeekInfo_25101 DEFAULT_INSTANCE = new C2S_NewWeekInfo_25101();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_NewWeekInfo_25101> PARSER = new AbstractParser<C2S_NewWeekInfo_25101>() {
         public C2S_NewWeekInfo_25101 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_NewWeekInfo_25101(input, extensionRegistry);
         }
      };

      private C2S_NewWeekInfo_25101(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_NewWeekInfo_25101() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_NewWeekInfo_25101();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_NewWeekInfo_25101(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekInfo_25101_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekInfo_25101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NewWeekInfo_25101.class, Builder.class);
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
         } else if (!(obj instanceof C2S_NewWeekInfo_25101)) {
            return super.equals(obj);
         } else {
            C2S_NewWeekInfo_25101 other = (C2S_NewWeekInfo_25101)obj;
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

      public static C2S_NewWeekInfo_25101 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_NewWeekInfo_25101)PARSER.parseFrom(data);
      }

      public static C2S_NewWeekInfo_25101 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NewWeekInfo_25101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NewWeekInfo_25101 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_NewWeekInfo_25101)PARSER.parseFrom(data);
      }

      public static C2S_NewWeekInfo_25101 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NewWeekInfo_25101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NewWeekInfo_25101 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_NewWeekInfo_25101)PARSER.parseFrom(data);
      }

      public static C2S_NewWeekInfo_25101 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NewWeekInfo_25101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NewWeekInfo_25101 parseFrom(InputStream input) throws IOException {
         return (C2S_NewWeekInfo_25101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NewWeekInfo_25101 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NewWeekInfo_25101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NewWeekInfo_25101 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_NewWeekInfo_25101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_NewWeekInfo_25101 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NewWeekInfo_25101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NewWeekInfo_25101 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_NewWeekInfo_25101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NewWeekInfo_25101 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NewWeekInfo_25101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_NewWeekInfo_25101 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_NewWeekInfo_25101 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_NewWeekInfo_25101> parser() {
         return PARSER;
      }

      public Parser<C2S_NewWeekInfo_25101> getParserForType() {
         return PARSER;
      }

      public C2S_NewWeekInfo_25101 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_NewWeekInfo_25101OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekInfo_25101_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekInfo_25101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NewWeekInfo_25101.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityNewWeekMsg.C2S_NewWeekInfo_25101.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekInfo_25101_descriptor;
         }

         public C2S_NewWeekInfo_25101 getDefaultInstanceForType() {
            return ActivityNewWeekMsg.C2S_NewWeekInfo_25101.getDefaultInstance();
         }

         public C2S_NewWeekInfo_25101 build() {
            C2S_NewWeekInfo_25101 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_NewWeekInfo_25101 buildPartial() {
            C2S_NewWeekInfo_25101 result = new C2S_NewWeekInfo_25101(this);
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
            if (other instanceof C2S_NewWeekInfo_25101) {
               return this.mergeFrom((C2S_NewWeekInfo_25101)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_NewWeekInfo_25101 other) {
            if (other == ActivityNewWeekMsg.C2S_NewWeekInfo_25101.getDefaultInstance()) {
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
            C2S_NewWeekInfo_25101 parsedMessage = null;

            try {
               parsedMessage = (C2S_NewWeekInfo_25101)ActivityNewWeekMsg.C2S_NewWeekInfo_25101.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_NewWeekInfo_25101)e.getUnfinishedMessage();
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

   public static final class S2C_NewWeekInfo_25102 extends GeneratedMessageV3 implements S2C_NewWeekInfo_25102OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STARTTIME_FIELD_NUMBER = 1;
      private int startTime_;
      public static final int ENDTIME_FIELD_NUMBER = 2;
      private int endTime_;
      public static final int LEVEL_FIELD_NUMBER = 3;
      private int level_;
      public static final int TASKGROUPDATA_FIELD_NUMBER = 4;
      private List<NewWeekGroupDate> taskGroupData_;
      private byte memoizedIsInitialized;
      private static final S2C_NewWeekInfo_25102 DEFAULT_INSTANCE = new S2C_NewWeekInfo_25102();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NewWeekInfo_25102> PARSER = new AbstractParser<S2C_NewWeekInfo_25102>() {
         public S2C_NewWeekInfo_25102 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NewWeekInfo_25102(input, extensionRegistry);
         }
      };

      private S2C_NewWeekInfo_25102(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NewWeekInfo_25102() {
         this.memoizedIsInitialized = -1;
         this.taskGroupData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NewWeekInfo_25102();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NewWeekInfo_25102(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.taskGroupData_.add(input.readMessage(ActivityNewWeekMsg.NewWeekGroupDate.PARSER, extensionRegistry));
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
         return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekInfo_25102_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekInfo_25102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NewWeekInfo_25102.class, Builder.class);
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

      public List<NewWeekGroupDate> getTaskGroupDataList() {
         return this.taskGroupData_;
      }

      public List<? extends NewWeekGroupDateOrBuilder> getTaskGroupDataOrBuilderList() {
         return this.taskGroupData_;
      }

      public int getTaskGroupDataCount() {
         return this.taskGroupData_.size();
      }

      public NewWeekGroupDate getTaskGroupData(int index) {
         return (NewWeekGroupDate)this.taskGroupData_.get(index);
      }

      public NewWeekGroupDateOrBuilder getTaskGroupDataOrBuilder(int index) {
         return (NewWeekGroupDateOrBuilder)this.taskGroupData_.get(index);
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
         } else if (!(obj instanceof S2C_NewWeekInfo_25102)) {
            return super.equals(obj);
         } else {
            S2C_NewWeekInfo_25102 other = (S2C_NewWeekInfo_25102)obj;
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

      public static S2C_NewWeekInfo_25102 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NewWeekInfo_25102)PARSER.parseFrom(data);
      }

      public static S2C_NewWeekInfo_25102 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewWeekInfo_25102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewWeekInfo_25102 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NewWeekInfo_25102)PARSER.parseFrom(data);
      }

      public static S2C_NewWeekInfo_25102 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewWeekInfo_25102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewWeekInfo_25102 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NewWeekInfo_25102)PARSER.parseFrom(data);
      }

      public static S2C_NewWeekInfo_25102 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewWeekInfo_25102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewWeekInfo_25102 parseFrom(InputStream input) throws IOException {
         return (S2C_NewWeekInfo_25102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NewWeekInfo_25102 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewWeekInfo_25102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NewWeekInfo_25102 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NewWeekInfo_25102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NewWeekInfo_25102 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewWeekInfo_25102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NewWeekInfo_25102 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NewWeekInfo_25102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NewWeekInfo_25102 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewWeekInfo_25102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NewWeekInfo_25102 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NewWeekInfo_25102 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NewWeekInfo_25102> parser() {
         return PARSER;
      }

      public Parser<S2C_NewWeekInfo_25102> getParserForType() {
         return PARSER;
      }

      public S2C_NewWeekInfo_25102 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NewWeekInfo_25102OrBuilder {
         private int bitField0_;
         private int startTime_;
         private int endTime_;
         private int level_;
         private List<NewWeekGroupDate> taskGroupData_;
         private RepeatedFieldBuilderV3<NewWeekGroupDate, NewWeekGroupDate.Builder, NewWeekGroupDateOrBuilder> taskGroupDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekInfo_25102_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekInfo_25102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NewWeekInfo_25102.class, Builder.class);
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
            if (ActivityNewWeekMsg.S2C_NewWeekInfo_25102.alwaysUseFieldBuilders) {
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
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekInfo_25102_descriptor;
         }

         public S2C_NewWeekInfo_25102 getDefaultInstanceForType() {
            return ActivityNewWeekMsg.S2C_NewWeekInfo_25102.getDefaultInstance();
         }

         public S2C_NewWeekInfo_25102 build() {
            S2C_NewWeekInfo_25102 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NewWeekInfo_25102 buildPartial() {
            S2C_NewWeekInfo_25102 result = new S2C_NewWeekInfo_25102(this);
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
            if (other instanceof S2C_NewWeekInfo_25102) {
               return this.mergeFrom((S2C_NewWeekInfo_25102)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NewWeekInfo_25102 other) {
            if (other == ActivityNewWeekMsg.S2C_NewWeekInfo_25102.getDefaultInstance()) {
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
                     this.taskGroupDataBuilder_ = ActivityNewWeekMsg.S2C_NewWeekInfo_25102.alwaysUseFieldBuilders ? this.getTaskGroupDataFieldBuilder() : null;
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
            S2C_NewWeekInfo_25102 parsedMessage = null;

            try {
               parsedMessage = (S2C_NewWeekInfo_25102)ActivityNewWeekMsg.S2C_NewWeekInfo_25102.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NewWeekInfo_25102)e.getUnfinishedMessage();
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

         public List<NewWeekGroupDate> getTaskGroupDataList() {
            return this.taskGroupDataBuilder_ == null ? Collections.unmodifiableList(this.taskGroupData_) : this.taskGroupDataBuilder_.getMessageList();
         }

         public int getTaskGroupDataCount() {
            return this.taskGroupDataBuilder_ == null ? this.taskGroupData_.size() : this.taskGroupDataBuilder_.getCount();
         }

         public NewWeekGroupDate getTaskGroupData(int index) {
            return this.taskGroupDataBuilder_ == null ? (NewWeekGroupDate)this.taskGroupData_.get(index) : (NewWeekGroupDate)this.taskGroupDataBuilder_.getMessage(index);
         }

         public Builder setTaskGroupData(int index, NewWeekGroupDate value) {
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

         public Builder setTaskGroupData(int index, NewWeekGroupDate.Builder builderForValue) {
            if (this.taskGroupDataBuilder_ == null) {
               this.ensureTaskGroupDataIsMutable();
               this.taskGroupData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskGroupDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTaskGroupData(NewWeekGroupDate value) {
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

         public Builder addTaskGroupData(int index, NewWeekGroupDate value) {
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

         public Builder addTaskGroupData(NewWeekGroupDate.Builder builderForValue) {
            if (this.taskGroupDataBuilder_ == null) {
               this.ensureTaskGroupDataIsMutable();
               this.taskGroupData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskGroupDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTaskGroupData(int index, NewWeekGroupDate.Builder builderForValue) {
            if (this.taskGroupDataBuilder_ == null) {
               this.ensureTaskGroupDataIsMutable();
               this.taskGroupData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskGroupDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTaskGroupData(Iterable<? extends NewWeekGroupDate> values) {
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

         public NewWeekGroupDate.Builder getTaskGroupDataBuilder(int index) {
            return (NewWeekGroupDate.Builder)this.getTaskGroupDataFieldBuilder().getBuilder(index);
         }

         public NewWeekGroupDateOrBuilder getTaskGroupDataOrBuilder(int index) {
            return this.taskGroupDataBuilder_ == null ? (NewWeekGroupDateOrBuilder)this.taskGroupData_.get(index) : (NewWeekGroupDateOrBuilder)this.taskGroupDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends NewWeekGroupDateOrBuilder> getTaskGroupDataOrBuilderList() {
            return this.taskGroupDataBuilder_ != null ? this.taskGroupDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.taskGroupData_);
         }

         public NewWeekGroupDate.Builder addTaskGroupDataBuilder() {
            return (NewWeekGroupDate.Builder)this.getTaskGroupDataFieldBuilder().addBuilder(ActivityNewWeekMsg.NewWeekGroupDate.getDefaultInstance());
         }

         public NewWeekGroupDate.Builder addTaskGroupDataBuilder(int index) {
            return (NewWeekGroupDate.Builder)this.getTaskGroupDataFieldBuilder().addBuilder(index, ActivityNewWeekMsg.NewWeekGroupDate.getDefaultInstance());
         }

         public List<NewWeekGroupDate.Builder> getTaskGroupDataBuilderList() {
            return this.getTaskGroupDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<NewWeekGroupDate, NewWeekGroupDate.Builder, NewWeekGroupDateOrBuilder> getTaskGroupDataFieldBuilder() {
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

   public static final class S2C_HeroRiseTasks_25103 extends GeneratedMessageV3 implements S2C_HeroRiseTasks_25103OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroRiseTasks_25103 DEFAULT_INSTANCE = new S2C_HeroRiseTasks_25103();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroRiseTasks_25103> PARSER = new AbstractParser<S2C_HeroRiseTasks_25103>() {
         public S2C_HeroRiseTasks_25103 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroRiseTasks_25103(input, extensionRegistry);
         }
      };

      private S2C_HeroRiseTasks_25103(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroRiseTasks_25103() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroRiseTasks_25103();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroRiseTasks_25103(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_HeroRiseTasks_25103_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_HeroRiseTasks_25103_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroRiseTasks_25103.class, Builder.class);
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
         } else if (!(obj instanceof S2C_HeroRiseTasks_25103)) {
            return super.equals(obj);
         } else {
            S2C_HeroRiseTasks_25103 other = (S2C_HeroRiseTasks_25103)obj;
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

      public static S2C_HeroRiseTasks_25103 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroRiseTasks_25103)PARSER.parseFrom(data);
      }

      public static S2C_HeroRiseTasks_25103 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroRiseTasks_25103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroRiseTasks_25103 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroRiseTasks_25103)PARSER.parseFrom(data);
      }

      public static S2C_HeroRiseTasks_25103 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroRiseTasks_25103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroRiseTasks_25103 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroRiseTasks_25103)PARSER.parseFrom(data);
      }

      public static S2C_HeroRiseTasks_25103 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroRiseTasks_25103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroRiseTasks_25103 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroRiseTasks_25103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroRiseTasks_25103 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroRiseTasks_25103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroRiseTasks_25103 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroRiseTasks_25103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroRiseTasks_25103 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroRiseTasks_25103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroRiseTasks_25103 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroRiseTasks_25103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroRiseTasks_25103 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroRiseTasks_25103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroRiseTasks_25103 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroRiseTasks_25103 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroRiseTasks_25103> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroRiseTasks_25103> getParserForType() {
         return PARSER;
      }

      public S2C_HeroRiseTasks_25103 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroRiseTasks_25103OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_HeroRiseTasks_25103_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_HeroRiseTasks_25103_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroRiseTasks_25103.class, Builder.class);
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
            if (ActivityNewWeekMsg.S2C_HeroRiseTasks_25103.alwaysUseFieldBuilders) {
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
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_HeroRiseTasks_25103_descriptor;
         }

         public S2C_HeroRiseTasks_25103 getDefaultInstanceForType() {
            return ActivityNewWeekMsg.S2C_HeroRiseTasks_25103.getDefaultInstance();
         }

         public S2C_HeroRiseTasks_25103 build() {
            S2C_HeroRiseTasks_25103 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroRiseTasks_25103 buildPartial() {
            S2C_HeroRiseTasks_25103 result = new S2C_HeroRiseTasks_25103(this);
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
            if (other instanceof S2C_HeroRiseTasks_25103) {
               return this.mergeFrom((S2C_HeroRiseTasks_25103)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroRiseTasks_25103 other) {
            if (other == ActivityNewWeekMsg.S2C_HeroRiseTasks_25103.getDefaultInstance()) {
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
                     this.taskBuilder_ = ActivityNewWeekMsg.S2C_HeroRiseTasks_25103.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_HeroRiseTasks_25103 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroRiseTasks_25103)ActivityNewWeekMsg.S2C_HeroRiseTasks_25103.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroRiseTasks_25103)e.getUnfinishedMessage();
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

   public static final class C2S_NewWeekReward_25104 extends GeneratedMessageV3 implements C2S_NewWeekReward_25104OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_NewWeekReward_25104 DEFAULT_INSTANCE = new C2S_NewWeekReward_25104();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_NewWeekReward_25104> PARSER = new AbstractParser<C2S_NewWeekReward_25104>() {
         public C2S_NewWeekReward_25104 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_NewWeekReward_25104(input, extensionRegistry);
         }
      };

      private C2S_NewWeekReward_25104(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_NewWeekReward_25104() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_NewWeekReward_25104();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_NewWeekReward_25104(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekReward_25104_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekReward_25104_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NewWeekReward_25104.class, Builder.class);
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
         } else if (!(obj instanceof C2S_NewWeekReward_25104)) {
            return super.equals(obj);
         } else {
            C2S_NewWeekReward_25104 other = (C2S_NewWeekReward_25104)obj;
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

      public static C2S_NewWeekReward_25104 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_NewWeekReward_25104)PARSER.parseFrom(data);
      }

      public static C2S_NewWeekReward_25104 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NewWeekReward_25104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NewWeekReward_25104 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_NewWeekReward_25104)PARSER.parseFrom(data);
      }

      public static C2S_NewWeekReward_25104 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NewWeekReward_25104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NewWeekReward_25104 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_NewWeekReward_25104)PARSER.parseFrom(data);
      }

      public static C2S_NewWeekReward_25104 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NewWeekReward_25104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NewWeekReward_25104 parseFrom(InputStream input) throws IOException {
         return (C2S_NewWeekReward_25104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NewWeekReward_25104 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NewWeekReward_25104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NewWeekReward_25104 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_NewWeekReward_25104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_NewWeekReward_25104 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NewWeekReward_25104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NewWeekReward_25104 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_NewWeekReward_25104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NewWeekReward_25104 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NewWeekReward_25104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_NewWeekReward_25104 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_NewWeekReward_25104 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_NewWeekReward_25104> parser() {
         return PARSER;
      }

      public Parser<C2S_NewWeekReward_25104> getParserForType() {
         return PARSER;
      }

      public C2S_NewWeekReward_25104 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_NewWeekReward_25104OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekReward_25104_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekReward_25104_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NewWeekReward_25104.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityNewWeekMsg.C2S_NewWeekReward_25104.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekReward_25104_descriptor;
         }

         public C2S_NewWeekReward_25104 getDefaultInstanceForType() {
            return ActivityNewWeekMsg.C2S_NewWeekReward_25104.getDefaultInstance();
         }

         public C2S_NewWeekReward_25104 build() {
            C2S_NewWeekReward_25104 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_NewWeekReward_25104 buildPartial() {
            C2S_NewWeekReward_25104 result = new C2S_NewWeekReward_25104(this);
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
            if (other instanceof C2S_NewWeekReward_25104) {
               return this.mergeFrom((C2S_NewWeekReward_25104)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_NewWeekReward_25104 other) {
            if (other == ActivityNewWeekMsg.C2S_NewWeekReward_25104.getDefaultInstance()) {
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
            C2S_NewWeekReward_25104 parsedMessage = null;

            try {
               parsedMessage = (C2S_NewWeekReward_25104)ActivityNewWeekMsg.C2S_NewWeekReward_25104.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_NewWeekReward_25104)e.getUnfinishedMessage();
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

   public static final class S2C_NewWeekReward_25105 extends GeneratedMessageV3 implements S2C_NewWeekReward_25105OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_NewWeekReward_25105 DEFAULT_INSTANCE = new S2C_NewWeekReward_25105();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NewWeekReward_25105> PARSER = new AbstractParser<S2C_NewWeekReward_25105>() {
         public S2C_NewWeekReward_25105 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NewWeekReward_25105(input, extensionRegistry);
         }
      };

      private S2C_NewWeekReward_25105(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NewWeekReward_25105() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NewWeekReward_25105();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NewWeekReward_25105(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekReward_25105_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekReward_25105_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NewWeekReward_25105.class, Builder.class);
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
         } else if (!(obj instanceof S2C_NewWeekReward_25105)) {
            return super.equals(obj);
         } else {
            S2C_NewWeekReward_25105 other = (S2C_NewWeekReward_25105)obj;
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

      public static S2C_NewWeekReward_25105 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NewWeekReward_25105)PARSER.parseFrom(data);
      }

      public static S2C_NewWeekReward_25105 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewWeekReward_25105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewWeekReward_25105 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NewWeekReward_25105)PARSER.parseFrom(data);
      }

      public static S2C_NewWeekReward_25105 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewWeekReward_25105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewWeekReward_25105 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NewWeekReward_25105)PARSER.parseFrom(data);
      }

      public static S2C_NewWeekReward_25105 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewWeekReward_25105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewWeekReward_25105 parseFrom(InputStream input) throws IOException {
         return (S2C_NewWeekReward_25105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NewWeekReward_25105 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewWeekReward_25105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NewWeekReward_25105 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NewWeekReward_25105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NewWeekReward_25105 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewWeekReward_25105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NewWeekReward_25105 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NewWeekReward_25105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NewWeekReward_25105 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewWeekReward_25105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NewWeekReward_25105 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NewWeekReward_25105 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NewWeekReward_25105> parser() {
         return PARSER;
      }

      public Parser<S2C_NewWeekReward_25105> getParserForType() {
         return PARSER;
      }

      public S2C_NewWeekReward_25105 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NewWeekReward_25105OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekReward_25105_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekReward_25105_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NewWeekReward_25105.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityNewWeekMsg.S2C_NewWeekReward_25105.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekReward_25105_descriptor;
         }

         public S2C_NewWeekReward_25105 getDefaultInstanceForType() {
            return ActivityNewWeekMsg.S2C_NewWeekReward_25105.getDefaultInstance();
         }

         public S2C_NewWeekReward_25105 build() {
            S2C_NewWeekReward_25105 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NewWeekReward_25105 buildPartial() {
            S2C_NewWeekReward_25105 result = new S2C_NewWeekReward_25105(this);
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
            if (other instanceof S2C_NewWeekReward_25105) {
               return this.mergeFrom((S2C_NewWeekReward_25105)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NewWeekReward_25105 other) {
            if (other == ActivityNewWeekMsg.S2C_NewWeekReward_25105.getDefaultInstance()) {
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
            S2C_NewWeekReward_25105 parsedMessage = null;

            try {
               parsedMessage = (S2C_NewWeekReward_25105)ActivityNewWeekMsg.S2C_NewWeekReward_25105.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NewWeekReward_25105)e.getUnfinishedMessage();
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

   public static final class C2S_NewWeekBuy_25106 extends GeneratedMessageV3 implements C2S_NewWeekBuy_25106OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int COUNT_FIELD_NUMBER = 2;
      private int count_;
      private byte memoizedIsInitialized;
      private static final C2S_NewWeekBuy_25106 DEFAULT_INSTANCE = new C2S_NewWeekBuy_25106();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_NewWeekBuy_25106> PARSER = new AbstractParser<C2S_NewWeekBuy_25106>() {
         public C2S_NewWeekBuy_25106 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_NewWeekBuy_25106(input, extensionRegistry);
         }
      };

      private C2S_NewWeekBuy_25106(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_NewWeekBuy_25106() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_NewWeekBuy_25106();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_NewWeekBuy_25106(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekBuy_25106_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekBuy_25106_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NewWeekBuy_25106.class, Builder.class);
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
         } else if (!(obj instanceof C2S_NewWeekBuy_25106)) {
            return super.equals(obj);
         } else {
            C2S_NewWeekBuy_25106 other = (C2S_NewWeekBuy_25106)obj;
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

      public static C2S_NewWeekBuy_25106 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_NewWeekBuy_25106)PARSER.parseFrom(data);
      }

      public static C2S_NewWeekBuy_25106 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NewWeekBuy_25106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NewWeekBuy_25106 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_NewWeekBuy_25106)PARSER.parseFrom(data);
      }

      public static C2S_NewWeekBuy_25106 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NewWeekBuy_25106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NewWeekBuy_25106 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_NewWeekBuy_25106)PARSER.parseFrom(data);
      }

      public static C2S_NewWeekBuy_25106 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NewWeekBuy_25106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NewWeekBuy_25106 parseFrom(InputStream input) throws IOException {
         return (C2S_NewWeekBuy_25106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NewWeekBuy_25106 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NewWeekBuy_25106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NewWeekBuy_25106 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_NewWeekBuy_25106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_NewWeekBuy_25106 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NewWeekBuy_25106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NewWeekBuy_25106 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_NewWeekBuy_25106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NewWeekBuy_25106 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NewWeekBuy_25106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_NewWeekBuy_25106 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_NewWeekBuy_25106 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_NewWeekBuy_25106> parser() {
         return PARSER;
      }

      public Parser<C2S_NewWeekBuy_25106> getParserForType() {
         return PARSER;
      }

      public C2S_NewWeekBuy_25106 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_NewWeekBuy_25106OrBuilder {
         private int bitField0_;
         private int type_;
         private int count_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekBuy_25106_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekBuy_25106_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NewWeekBuy_25106.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityNewWeekMsg.C2S_NewWeekBuy_25106.alwaysUseFieldBuilders) {
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
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_C2S_NewWeekBuy_25106_descriptor;
         }

         public C2S_NewWeekBuy_25106 getDefaultInstanceForType() {
            return ActivityNewWeekMsg.C2S_NewWeekBuy_25106.getDefaultInstance();
         }

         public C2S_NewWeekBuy_25106 build() {
            C2S_NewWeekBuy_25106 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_NewWeekBuy_25106 buildPartial() {
            C2S_NewWeekBuy_25106 result = new C2S_NewWeekBuy_25106(this);
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
            if (other instanceof C2S_NewWeekBuy_25106) {
               return this.mergeFrom((C2S_NewWeekBuy_25106)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_NewWeekBuy_25106 other) {
            if (other == ActivityNewWeekMsg.C2S_NewWeekBuy_25106.getDefaultInstance()) {
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
            C2S_NewWeekBuy_25106 parsedMessage = null;

            try {
               parsedMessage = (C2S_NewWeekBuy_25106)ActivityNewWeekMsg.C2S_NewWeekBuy_25106.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_NewWeekBuy_25106)e.getUnfinishedMessage();
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

   public static final class S2C_NewWeekBuy_25107 extends GeneratedMessageV3 implements S2C_NewWeekBuy_25107OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int COUNT_FIELD_NUMBER = 2;
      private int count_;
      public static final int LEVEL_FIELD_NUMBER = 3;
      private int level_;
      private byte memoizedIsInitialized;
      private static final S2C_NewWeekBuy_25107 DEFAULT_INSTANCE = new S2C_NewWeekBuy_25107();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NewWeekBuy_25107> PARSER = new AbstractParser<S2C_NewWeekBuy_25107>() {
         public S2C_NewWeekBuy_25107 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NewWeekBuy_25107(input, extensionRegistry);
         }
      };

      private S2C_NewWeekBuy_25107(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NewWeekBuy_25107() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NewWeekBuy_25107();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NewWeekBuy_25107(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekBuy_25107_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekBuy_25107_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NewWeekBuy_25107.class, Builder.class);
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
         } else if (!(obj instanceof S2C_NewWeekBuy_25107)) {
            return super.equals(obj);
         } else {
            S2C_NewWeekBuy_25107 other = (S2C_NewWeekBuy_25107)obj;
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

      public static S2C_NewWeekBuy_25107 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NewWeekBuy_25107)PARSER.parseFrom(data);
      }

      public static S2C_NewWeekBuy_25107 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewWeekBuy_25107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewWeekBuy_25107 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NewWeekBuy_25107)PARSER.parseFrom(data);
      }

      public static S2C_NewWeekBuy_25107 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewWeekBuy_25107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewWeekBuy_25107 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NewWeekBuy_25107)PARSER.parseFrom(data);
      }

      public static S2C_NewWeekBuy_25107 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewWeekBuy_25107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewWeekBuy_25107 parseFrom(InputStream input) throws IOException {
         return (S2C_NewWeekBuy_25107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NewWeekBuy_25107 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewWeekBuy_25107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NewWeekBuy_25107 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NewWeekBuy_25107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NewWeekBuy_25107 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewWeekBuy_25107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NewWeekBuy_25107 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NewWeekBuy_25107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NewWeekBuy_25107 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewWeekBuy_25107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NewWeekBuy_25107 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NewWeekBuy_25107 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NewWeekBuy_25107> parser() {
         return PARSER;
      }

      public Parser<S2C_NewWeekBuy_25107> getParserForType() {
         return PARSER;
      }

      public S2C_NewWeekBuy_25107 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NewWeekBuy_25107OrBuilder {
         private int bitField0_;
         private int type_;
         private int count_;
         private int level_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekBuy_25107_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekBuy_25107_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NewWeekBuy_25107.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityNewWeekMsg.S2C_NewWeekBuy_25107.alwaysUseFieldBuilders) {
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
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekBuy_25107_descriptor;
         }

         public S2C_NewWeekBuy_25107 getDefaultInstanceForType() {
            return ActivityNewWeekMsg.S2C_NewWeekBuy_25107.getDefaultInstance();
         }

         public S2C_NewWeekBuy_25107 build() {
            S2C_NewWeekBuy_25107 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NewWeekBuy_25107 buildPartial() {
            S2C_NewWeekBuy_25107 result = new S2C_NewWeekBuy_25107(this);
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
            if (other instanceof S2C_NewWeekBuy_25107) {
               return this.mergeFrom((S2C_NewWeekBuy_25107)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NewWeekBuy_25107 other) {
            if (other == ActivityNewWeekMsg.S2C_NewWeekBuy_25107.getDefaultInstance()) {
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
            S2C_NewWeekBuy_25107 parsedMessage = null;

            try {
               parsedMessage = (S2C_NewWeekBuy_25107)ActivityNewWeekMsg.S2C_NewWeekBuy_25107.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NewWeekBuy_25107)e.getUnfinishedMessage();
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

   public static final class S2C_NewWeekUpdate_25108 extends GeneratedMessageV3 implements S2C_NewWeekUpdate_25108OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LEVEL_FIELD_NUMBER = 1;
      private int level_;
      private byte memoizedIsInitialized;
      private static final S2C_NewWeekUpdate_25108 DEFAULT_INSTANCE = new S2C_NewWeekUpdate_25108();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NewWeekUpdate_25108> PARSER = new AbstractParser<S2C_NewWeekUpdate_25108>() {
         public S2C_NewWeekUpdate_25108 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NewWeekUpdate_25108(input, extensionRegistry);
         }
      };

      private S2C_NewWeekUpdate_25108(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NewWeekUpdate_25108() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NewWeekUpdate_25108();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NewWeekUpdate_25108(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekUpdate_25108_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekUpdate_25108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NewWeekUpdate_25108.class, Builder.class);
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
         } else if (!(obj instanceof S2C_NewWeekUpdate_25108)) {
            return super.equals(obj);
         } else {
            S2C_NewWeekUpdate_25108 other = (S2C_NewWeekUpdate_25108)obj;
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

      public static S2C_NewWeekUpdate_25108 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NewWeekUpdate_25108)PARSER.parseFrom(data);
      }

      public static S2C_NewWeekUpdate_25108 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewWeekUpdate_25108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewWeekUpdate_25108 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NewWeekUpdate_25108)PARSER.parseFrom(data);
      }

      public static S2C_NewWeekUpdate_25108 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewWeekUpdate_25108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewWeekUpdate_25108 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NewWeekUpdate_25108)PARSER.parseFrom(data);
      }

      public static S2C_NewWeekUpdate_25108 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewWeekUpdate_25108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewWeekUpdate_25108 parseFrom(InputStream input) throws IOException {
         return (S2C_NewWeekUpdate_25108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NewWeekUpdate_25108 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewWeekUpdate_25108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NewWeekUpdate_25108 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NewWeekUpdate_25108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NewWeekUpdate_25108 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewWeekUpdate_25108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NewWeekUpdate_25108 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NewWeekUpdate_25108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NewWeekUpdate_25108 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewWeekUpdate_25108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NewWeekUpdate_25108 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NewWeekUpdate_25108 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NewWeekUpdate_25108> parser() {
         return PARSER;
      }

      public Parser<S2C_NewWeekUpdate_25108> getParserForType() {
         return PARSER;
      }

      public S2C_NewWeekUpdate_25108 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NewWeekUpdate_25108OrBuilder {
         private int bitField0_;
         private int level_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekUpdate_25108_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekUpdate_25108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NewWeekUpdate_25108.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityNewWeekMsg.S2C_NewWeekUpdate_25108.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.level_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_NewWeekUpdate_25108_descriptor;
         }

         public S2C_NewWeekUpdate_25108 getDefaultInstanceForType() {
            return ActivityNewWeekMsg.S2C_NewWeekUpdate_25108.getDefaultInstance();
         }

         public S2C_NewWeekUpdate_25108 build() {
            S2C_NewWeekUpdate_25108 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NewWeekUpdate_25108 buildPartial() {
            S2C_NewWeekUpdate_25108 result = new S2C_NewWeekUpdate_25108(this);
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
            if (other instanceof S2C_NewWeekUpdate_25108) {
               return this.mergeFrom((S2C_NewWeekUpdate_25108)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NewWeekUpdate_25108 other) {
            if (other == ActivityNewWeekMsg.S2C_NewWeekUpdate_25108.getDefaultInstance()) {
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
            S2C_NewWeekUpdate_25108 parsedMessage = null;

            try {
               parsedMessage = (S2C_NewWeekUpdate_25108)ActivityNewWeekMsg.S2C_NewWeekUpdate_25108.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NewWeekUpdate_25108)e.getUnfinishedMessage();
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

   public static final class C2S_ReceiveMakeUpReward_25109 extends GeneratedMessageV3 implements C2S_ReceiveMakeUpReward_25109OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveMakeUpReward_25109 DEFAULT_INSTANCE = new C2S_ReceiveMakeUpReward_25109();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveMakeUpReward_25109> PARSER = new AbstractParser<C2S_ReceiveMakeUpReward_25109>() {
         public C2S_ReceiveMakeUpReward_25109 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveMakeUpReward_25109(input, extensionRegistry);
         }
      };

      private C2S_ReceiveMakeUpReward_25109(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveMakeUpReward_25109() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveMakeUpReward_25109();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveMakeUpReward_25109(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_C2S_ReceiveMakeUpReward_25109_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_C2S_ReceiveMakeUpReward_25109_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveMakeUpReward_25109.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveMakeUpReward_25109)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveMakeUpReward_25109 other = (C2S_ReceiveMakeUpReward_25109)obj;
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

      public static C2S_ReceiveMakeUpReward_25109 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveMakeUpReward_25109)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveMakeUpReward_25109 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveMakeUpReward_25109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveMakeUpReward_25109 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveMakeUpReward_25109)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveMakeUpReward_25109 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveMakeUpReward_25109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveMakeUpReward_25109 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveMakeUpReward_25109)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveMakeUpReward_25109 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveMakeUpReward_25109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveMakeUpReward_25109 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveMakeUpReward_25109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveMakeUpReward_25109 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveMakeUpReward_25109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveMakeUpReward_25109 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveMakeUpReward_25109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveMakeUpReward_25109 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveMakeUpReward_25109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveMakeUpReward_25109 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveMakeUpReward_25109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveMakeUpReward_25109 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveMakeUpReward_25109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveMakeUpReward_25109 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveMakeUpReward_25109 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveMakeUpReward_25109> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveMakeUpReward_25109> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveMakeUpReward_25109 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveMakeUpReward_25109OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_C2S_ReceiveMakeUpReward_25109_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_C2S_ReceiveMakeUpReward_25109_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveMakeUpReward_25109.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityNewWeekMsg.C2S_ReceiveMakeUpReward_25109.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_C2S_ReceiveMakeUpReward_25109_descriptor;
         }

         public C2S_ReceiveMakeUpReward_25109 getDefaultInstanceForType() {
            return ActivityNewWeekMsg.C2S_ReceiveMakeUpReward_25109.getDefaultInstance();
         }

         public C2S_ReceiveMakeUpReward_25109 build() {
            C2S_ReceiveMakeUpReward_25109 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveMakeUpReward_25109 buildPartial() {
            C2S_ReceiveMakeUpReward_25109 result = new C2S_ReceiveMakeUpReward_25109(this);
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
            if (other instanceof C2S_ReceiveMakeUpReward_25109) {
               return this.mergeFrom((C2S_ReceiveMakeUpReward_25109)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveMakeUpReward_25109 other) {
            if (other == ActivityNewWeekMsg.C2S_ReceiveMakeUpReward_25109.getDefaultInstance()) {
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
            C2S_ReceiveMakeUpReward_25109 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveMakeUpReward_25109)ActivityNewWeekMsg.C2S_ReceiveMakeUpReward_25109.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveMakeUpReward_25109)e.getUnfinishedMessage();
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

   public static final class S2C_ReceiveMakeUpReward_25110 extends GeneratedMessageV3 implements S2C_ReceiveMakeUpReward_25110OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MAKEUPRECEIVEID_FIELD_NUMBER = 1;
      private Internal.IntList makeUpReceiveId_;
      private byte memoizedIsInitialized;
      private static final S2C_ReceiveMakeUpReward_25110 DEFAULT_INSTANCE = new S2C_ReceiveMakeUpReward_25110();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ReceiveMakeUpReward_25110> PARSER = new AbstractParser<S2C_ReceiveMakeUpReward_25110>() {
         public S2C_ReceiveMakeUpReward_25110 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ReceiveMakeUpReward_25110(input, extensionRegistry);
         }
      };

      private S2C_ReceiveMakeUpReward_25110(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ReceiveMakeUpReward_25110() {
         this.memoizedIsInitialized = -1;
         this.makeUpReceiveId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ReceiveMakeUpReward_25110();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ReceiveMakeUpReward_25110(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.makeUpReceiveId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.makeUpReceiveId_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.makeUpReceiveId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.makeUpReceiveId_.addInt(input.readInt32());
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
                  this.makeUpReceiveId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_ReceiveMakeUpReward_25110_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_ReceiveMakeUpReward_25110_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveMakeUpReward_25110.class, Builder.class);
      }

      public List<Integer> getMakeUpReceiveIdList() {
         return this.makeUpReceiveId_;
      }

      public int getMakeUpReceiveIdCount() {
         return this.makeUpReceiveId_.size();
      }

      public int getMakeUpReceiveId(int index) {
         return this.makeUpReceiveId_.getInt(index);
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
         for(int i = 0; i < this.makeUpReceiveId_.size(); ++i) {
            output.writeInt32(1, this.makeUpReceiveId_.getInt(i));
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

            for(int i = 0; i < this.makeUpReceiveId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.makeUpReceiveId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getMakeUpReceiveIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ReceiveMakeUpReward_25110)) {
            return super.equals(obj);
         } else {
            S2C_ReceiveMakeUpReward_25110 other = (S2C_ReceiveMakeUpReward_25110)obj;
            if (!this.getMakeUpReceiveIdList().equals(other.getMakeUpReceiveIdList())) {
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
            if (this.getMakeUpReceiveIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMakeUpReceiveIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ReceiveMakeUpReward_25110 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveMakeUpReward_25110)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveMakeUpReward_25110 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveMakeUpReward_25110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveMakeUpReward_25110 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveMakeUpReward_25110)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveMakeUpReward_25110 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveMakeUpReward_25110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveMakeUpReward_25110 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveMakeUpReward_25110)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveMakeUpReward_25110 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveMakeUpReward_25110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveMakeUpReward_25110 parseFrom(InputStream input) throws IOException {
         return (S2C_ReceiveMakeUpReward_25110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveMakeUpReward_25110 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveMakeUpReward_25110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveMakeUpReward_25110 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ReceiveMakeUpReward_25110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ReceiveMakeUpReward_25110 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveMakeUpReward_25110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveMakeUpReward_25110 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ReceiveMakeUpReward_25110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveMakeUpReward_25110 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveMakeUpReward_25110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ReceiveMakeUpReward_25110 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ReceiveMakeUpReward_25110 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ReceiveMakeUpReward_25110> parser() {
         return PARSER;
      }

      public Parser<S2C_ReceiveMakeUpReward_25110> getParserForType() {
         return PARSER;
      }

      public S2C_ReceiveMakeUpReward_25110 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ReceiveMakeUpReward_25110OrBuilder {
         private int bitField0_;
         private Internal.IntList makeUpReceiveId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_ReceiveMakeUpReward_25110_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_ReceiveMakeUpReward_25110_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveMakeUpReward_25110.class, Builder.class);
         }

         private Builder() {
            this.makeUpReceiveId_ = ActivityNewWeekMsg.S2C_ReceiveMakeUpReward_25110.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.makeUpReceiveId_ = ActivityNewWeekMsg.S2C_ReceiveMakeUpReward_25110.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityNewWeekMsg.S2C_ReceiveMakeUpReward_25110.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.makeUpReceiveId_ = ActivityNewWeekMsg.S2C_ReceiveMakeUpReward_25110.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityNewWeekMsg.internal_static_activityNewWeek_com_gzbz_protobuf_S2C_ReceiveMakeUpReward_25110_descriptor;
         }

         public S2C_ReceiveMakeUpReward_25110 getDefaultInstanceForType() {
            return ActivityNewWeekMsg.S2C_ReceiveMakeUpReward_25110.getDefaultInstance();
         }

         public S2C_ReceiveMakeUpReward_25110 build() {
            S2C_ReceiveMakeUpReward_25110 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ReceiveMakeUpReward_25110 buildPartial() {
            S2C_ReceiveMakeUpReward_25110 result = new S2C_ReceiveMakeUpReward_25110(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.makeUpReceiveId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.makeUpReceiveId_ = this.makeUpReceiveId_;
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
            if (other instanceof S2C_ReceiveMakeUpReward_25110) {
               return this.mergeFrom((S2C_ReceiveMakeUpReward_25110)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ReceiveMakeUpReward_25110 other) {
            if (other == ActivityNewWeekMsg.S2C_ReceiveMakeUpReward_25110.getDefaultInstance()) {
               return this;
            } else {
               if (!other.makeUpReceiveId_.isEmpty()) {
                  if (this.makeUpReceiveId_.isEmpty()) {
                     this.makeUpReceiveId_ = other.makeUpReceiveId_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureMakeUpReceiveIdIsMutable();
                     this.makeUpReceiveId_.addAll(other.makeUpReceiveId_);
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
            S2C_ReceiveMakeUpReward_25110 parsedMessage = null;

            try {
               parsedMessage = (S2C_ReceiveMakeUpReward_25110)ActivityNewWeekMsg.S2C_ReceiveMakeUpReward_25110.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ReceiveMakeUpReward_25110)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureMakeUpReceiveIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.makeUpReceiveId_ = ActivityNewWeekMsg.S2C_ReceiveMakeUpReward_25110.mutableCopy(this.makeUpReceiveId_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getMakeUpReceiveIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.makeUpReceiveId_) : this.makeUpReceiveId_);
         }

         public int getMakeUpReceiveIdCount() {
            return this.makeUpReceiveId_.size();
         }

         public int getMakeUpReceiveId(int index) {
            return this.makeUpReceiveId_.getInt(index);
         }

         public Builder setMakeUpReceiveId(int index, int value) {
            this.ensureMakeUpReceiveIdIsMutable();
            this.makeUpReceiveId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addMakeUpReceiveId(int value) {
            this.ensureMakeUpReceiveIdIsMutable();
            this.makeUpReceiveId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllMakeUpReceiveId(Iterable<? extends Integer> values) {
            this.ensureMakeUpReceiveIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.makeUpReceiveId_);
            this.onChanged();
            return this;
         }

         public Builder clearMakeUpReceiveId() {
            this.makeUpReceiveId_ = ActivityNewWeekMsg.S2C_ReceiveMakeUpReward_25110.emptyIntList();
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

   public interface C2S_NewWeekBuy_25106OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasCount();

      int getCount();
   }

   public interface C2S_NewWeekInfo_25101OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_NewWeekReward_25104OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_ReceiveMakeUpReward_25109OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface NewWeekGroupDateOrBuilder extends MessageOrBuilder {
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

   public interface S2C_HeroRiseTasks_25103OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_NewWeekBuy_25107OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasCount();

      int getCount();

      boolean hasLevel();

      int getLevel();
   }

   public interface S2C_NewWeekInfo_25102OrBuilder extends MessageOrBuilder {
      boolean hasStartTime();

      int getStartTime();

      boolean hasEndTime();

      int getEndTime();

      boolean hasLevel();

      int getLevel();

      List<NewWeekGroupDate> getTaskGroupDataList();

      NewWeekGroupDate getTaskGroupData(int index);

      int getTaskGroupDataCount();

      List<? extends NewWeekGroupDateOrBuilder> getTaskGroupDataOrBuilderList();

      NewWeekGroupDateOrBuilder getTaskGroupDataOrBuilder(int index);
   }

   public interface S2C_NewWeekReward_25105OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_NewWeekUpdate_25108OrBuilder extends MessageOrBuilder {
      boolean hasLevel();

      int getLevel();
   }

   public interface S2C_ReceiveMakeUpReward_25110OrBuilder extends MessageOrBuilder {
      List<Integer> getMakeUpReceiveIdList();

      int getMakeUpReceiveIdCount();

      int getMakeUpReceiveId(int index);
   }
}
