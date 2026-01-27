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

public final class TurntableMsg {
   private static final Descriptors.Descriptor internal_static_turntable_com_gzbz_protobuf_C2S_TurntableMain_23801_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_turntable_com_gzbz_protobuf_C2S_TurntableMain_23801_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_turntable_com_gzbz_protobuf_S2C_TurntableMain_23802_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_turntable_com_gzbz_protobuf_S2C_TurntableMain_23802_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_turntable_com_gzbz_protobuf_DrawData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_turntable_com_gzbz_protobuf_DrawData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_turntable_com_gzbz_protobuf_C2S_TurntableCommitTask_23803_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_turntable_com_gzbz_protobuf_C2S_TurntableCommitTask_23803_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_turntable_com_gzbz_protobuf_S2C_TurntableCommitTask_23804_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_turntable_com_gzbz_protobuf_S2C_TurntableCommitTask_23804_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_turntable_com_gzbz_protobuf_C2S_TurntableDraw_23805_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_turntable_com_gzbz_protobuf_C2S_TurntableDraw_23805_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_turntable_com_gzbz_protobuf_S2C_TurntableDraw_23806_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_turntable_com_gzbz_protobuf_S2C_TurntableDraw_23806_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private TurntableMsg() {
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
      String[] descriptorData = new String[]{"\n\u000fTurntable.proto\u0012\u001bturntable.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u000eActivity.proto\"\u0019\n\u0017C2S_TurntableMain_23801\"\u009c\u0001\n\u0017S2C_TurntableMain_23802\u0012\u0010\n\bmaxRound\u0018\u0001 \u0002(\u0005\u00127\n\bdrawData\u0018\u0002 \u0003(\u000b2%.turntable.com.gzbz.protobuf.DrawData\u00126\n\btaskList\u0018\u0003 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"-\n\bDrawData\u0012\u0011\n\tdrawRound\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006drawId\u0018\u0002 \u0003(\u0005\"/\n\u001dC2S_TurntableCommitTask_23803\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"W\n\u001dS2C_TurntableCommitTask_23804\u00126\n\btaskList\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\",\n\u0017C2S_TurntableDraw_23805\u0012\u0011\n\tdrawRound\u0018\u0001 \u0002(\u0005\")\n\u0017S2C_TurntableDraw_23806\u0012\u000e\n\u0006reward\u0018\u0001 \u0002(\u0005B#\n\u0011com.gzbz.protobufB\fTurntableMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), ActivityMsg.getDescriptor()});
      internal_static_turntable_com_gzbz_protobuf_C2S_TurntableMain_23801_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_turntable_com_gzbz_protobuf_C2S_TurntableMain_23801_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_turntable_com_gzbz_protobuf_C2S_TurntableMain_23801_descriptor, new String[0]);
      internal_static_turntable_com_gzbz_protobuf_S2C_TurntableMain_23802_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_turntable_com_gzbz_protobuf_S2C_TurntableMain_23802_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_turntable_com_gzbz_protobuf_S2C_TurntableMain_23802_descriptor, new String[]{"MaxRound", "DrawData", "TaskList"});
      internal_static_turntable_com_gzbz_protobuf_DrawData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_turntable_com_gzbz_protobuf_DrawData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_turntable_com_gzbz_protobuf_DrawData_descriptor, new String[]{"DrawRound", "DrawId"});
      internal_static_turntable_com_gzbz_protobuf_C2S_TurntableCommitTask_23803_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_turntable_com_gzbz_protobuf_C2S_TurntableCommitTask_23803_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_turntable_com_gzbz_protobuf_C2S_TurntableCommitTask_23803_descriptor, new String[]{"TaskId"});
      internal_static_turntable_com_gzbz_protobuf_S2C_TurntableCommitTask_23804_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_turntable_com_gzbz_protobuf_S2C_TurntableCommitTask_23804_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_turntable_com_gzbz_protobuf_S2C_TurntableCommitTask_23804_descriptor, new String[]{"TaskList"});
      internal_static_turntable_com_gzbz_protobuf_C2S_TurntableDraw_23805_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_turntable_com_gzbz_protobuf_C2S_TurntableDraw_23805_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_turntable_com_gzbz_protobuf_C2S_TurntableDraw_23805_descriptor, new String[]{"DrawRound"});
      internal_static_turntable_com_gzbz_protobuf_S2C_TurntableDraw_23806_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_turntable_com_gzbz_protobuf_S2C_TurntableDraw_23806_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_turntable_com_gzbz_protobuf_S2C_TurntableDraw_23806_descriptor, new String[]{"Reward"});
      CommonMsg.getDescriptor();
      ActivityMsg.getDescriptor();
   }

   public static final class C2S_TurntableMain_23801 extends GeneratedMessageV3 implements C2S_TurntableMain_23801OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TurntableMain_23801 DEFAULT_INSTANCE = new C2S_TurntableMain_23801();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TurntableMain_23801> PARSER = new AbstractParser<C2S_TurntableMain_23801>() {
         public C2S_TurntableMain_23801 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TurntableMain_23801(input, extensionRegistry);
         }
      };

      private C2S_TurntableMain_23801(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TurntableMain_23801() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TurntableMain_23801();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TurntableMain_23801(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_C2S_TurntableMain_23801_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_C2S_TurntableMain_23801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TurntableMain_23801.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TurntableMain_23801)) {
            return super.equals(obj);
         } else {
            C2S_TurntableMain_23801 other = (C2S_TurntableMain_23801)obj;
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

      public static C2S_TurntableMain_23801 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TurntableMain_23801)PARSER.parseFrom(data);
      }

      public static C2S_TurntableMain_23801 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TurntableMain_23801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TurntableMain_23801 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TurntableMain_23801)PARSER.parseFrom(data);
      }

      public static C2S_TurntableMain_23801 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TurntableMain_23801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TurntableMain_23801 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TurntableMain_23801)PARSER.parseFrom(data);
      }

      public static C2S_TurntableMain_23801 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TurntableMain_23801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TurntableMain_23801 parseFrom(InputStream input) throws IOException {
         return (C2S_TurntableMain_23801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TurntableMain_23801 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TurntableMain_23801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TurntableMain_23801 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TurntableMain_23801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TurntableMain_23801 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TurntableMain_23801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TurntableMain_23801 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TurntableMain_23801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TurntableMain_23801 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TurntableMain_23801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TurntableMain_23801 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TurntableMain_23801 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TurntableMain_23801> parser() {
         return PARSER;
      }

      public Parser<C2S_TurntableMain_23801> getParserForType() {
         return PARSER;
      }

      public C2S_TurntableMain_23801 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TurntableMain_23801OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_C2S_TurntableMain_23801_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_C2S_TurntableMain_23801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TurntableMain_23801.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TurntableMsg.C2S_TurntableMain_23801.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_C2S_TurntableMain_23801_descriptor;
         }

         public C2S_TurntableMain_23801 getDefaultInstanceForType() {
            return TurntableMsg.C2S_TurntableMain_23801.getDefaultInstance();
         }

         public C2S_TurntableMain_23801 build() {
            C2S_TurntableMain_23801 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TurntableMain_23801 buildPartial() {
            C2S_TurntableMain_23801 result = new C2S_TurntableMain_23801(this);
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
            if (other instanceof C2S_TurntableMain_23801) {
               return this.mergeFrom((C2S_TurntableMain_23801)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TurntableMain_23801 other) {
            if (other == TurntableMsg.C2S_TurntableMain_23801.getDefaultInstance()) {
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
            C2S_TurntableMain_23801 parsedMessage = null;

            try {
               parsedMessage = (C2S_TurntableMain_23801)TurntableMsg.C2S_TurntableMain_23801.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TurntableMain_23801)e.getUnfinishedMessage();
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

   public static final class S2C_TurntableMain_23802 extends GeneratedMessageV3 implements S2C_TurntableMain_23802OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MAXROUND_FIELD_NUMBER = 1;
      private int maxRound_;
      public static final int DRAWDATA_FIELD_NUMBER = 2;
      private List<DrawData> drawData_;
      public static final int TASKLIST_FIELD_NUMBER = 3;
      private List<ActivityMsg.TaskData> taskList_;
      private byte memoizedIsInitialized;
      private static final S2C_TurntableMain_23802 DEFAULT_INSTANCE = new S2C_TurntableMain_23802();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TurntableMain_23802> PARSER = new AbstractParser<S2C_TurntableMain_23802>() {
         public S2C_TurntableMain_23802 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TurntableMain_23802(input, extensionRegistry);
         }
      };

      private S2C_TurntableMain_23802(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TurntableMain_23802() {
         this.memoizedIsInitialized = -1;
         this.drawData_ = Collections.emptyList();
         this.taskList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TurntableMain_23802();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TurntableMain_23802(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.maxRound_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.drawData_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.drawData_.add(input.readMessage(TurntableMsg.DrawData.PARSER, extensionRegistry));
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.taskList_ = new ArrayList();
                           mutable_bitField0_ |= 4;
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
               if ((mutable_bitField0_ & 2) != 0) {
                  this.drawData_ = Collections.unmodifiableList(this.drawData_);
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_S2C_TurntableMain_23802_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_S2C_TurntableMain_23802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TurntableMain_23802.class, Builder.class);
      }

      public boolean hasMaxRound() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getMaxRound() {
         return this.maxRound_;
      }

      public List<DrawData> getDrawDataList() {
         return this.drawData_;
      }

      public List<? extends DrawDataOrBuilder> getDrawDataOrBuilderList() {
         return this.drawData_;
      }

      public int getDrawDataCount() {
         return this.drawData_.size();
      }

      public DrawData getDrawData(int index) {
         return (DrawData)this.drawData_.get(index);
      }

      public DrawDataOrBuilder getDrawDataOrBuilder(int index) {
         return (DrawDataOrBuilder)this.drawData_.get(index);
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
         } else if (!this.hasMaxRound()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getDrawDataCount(); ++i) {
               if (!this.getDrawData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

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
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.maxRound_);
         }

         for(int i = 0; i < this.drawData_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.drawData_.get(i));
         }

         for(int i = 0; i < this.taskList_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.taskList_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.maxRound_);
            }

            for(int i = 0; i < this.drawData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.drawData_.get(i));
            }

            for(int i = 0; i < this.taskList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.taskList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TurntableMain_23802)) {
            return super.equals(obj);
         } else {
            S2C_TurntableMain_23802 other = (S2C_TurntableMain_23802)obj;
            if (this.hasMaxRound() != other.hasMaxRound()) {
               return false;
            } else if (this.hasMaxRound() && this.getMaxRound() != other.getMaxRound()) {
               return false;
            } else if (!this.getDrawDataList().equals(other.getDrawDataList())) {
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
            if (this.hasMaxRound()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMaxRound();
            }

            if (this.getDrawDataCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDrawDataList().hashCode();
            }

            if (this.getTaskListCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTaskListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TurntableMain_23802 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TurntableMain_23802)PARSER.parseFrom(data);
      }

      public static S2C_TurntableMain_23802 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TurntableMain_23802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TurntableMain_23802 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TurntableMain_23802)PARSER.parseFrom(data);
      }

      public static S2C_TurntableMain_23802 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TurntableMain_23802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TurntableMain_23802 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TurntableMain_23802)PARSER.parseFrom(data);
      }

      public static S2C_TurntableMain_23802 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TurntableMain_23802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TurntableMain_23802 parseFrom(InputStream input) throws IOException {
         return (S2C_TurntableMain_23802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TurntableMain_23802 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TurntableMain_23802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TurntableMain_23802 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TurntableMain_23802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TurntableMain_23802 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TurntableMain_23802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TurntableMain_23802 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TurntableMain_23802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TurntableMain_23802 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TurntableMain_23802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TurntableMain_23802 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TurntableMain_23802 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TurntableMain_23802> parser() {
         return PARSER;
      }

      public Parser<S2C_TurntableMain_23802> getParserForType() {
         return PARSER;
      }

      public S2C_TurntableMain_23802 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TurntableMain_23802OrBuilder {
         private int bitField0_;
         private int maxRound_;
         private List<DrawData> drawData_;
         private RepeatedFieldBuilderV3<DrawData, DrawData.Builder, DrawDataOrBuilder> drawDataBuilder_;
         private List<ActivityMsg.TaskData> taskList_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_S2C_TurntableMain_23802_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_S2C_TurntableMain_23802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TurntableMain_23802.class, Builder.class);
         }

         private Builder() {
            this.drawData_ = Collections.emptyList();
            this.taskList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.drawData_ = Collections.emptyList();
            this.taskList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TurntableMsg.S2C_TurntableMain_23802.alwaysUseFieldBuilders) {
               this.getDrawDataFieldBuilder();
               this.getTaskListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.maxRound_ = 0;
            this.bitField0_ &= -2;
            if (this.drawDataBuilder_ == null) {
               this.drawData_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.drawDataBuilder_.clear();
            }

            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.taskListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_S2C_TurntableMain_23802_descriptor;
         }

         public S2C_TurntableMain_23802 getDefaultInstanceForType() {
            return TurntableMsg.S2C_TurntableMain_23802.getDefaultInstance();
         }

         public S2C_TurntableMain_23802 build() {
            S2C_TurntableMain_23802 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TurntableMain_23802 buildPartial() {
            S2C_TurntableMain_23802 result = new S2C_TurntableMain_23802(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.maxRound_ = this.maxRound_;
               to_bitField0_ |= 1;
            }

            if (this.drawDataBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.drawData_ = Collections.unmodifiableList(this.drawData_);
                  this.bitField0_ &= -3;
               }

               result.drawData_ = this.drawData_;
            } else {
               result.drawData_ = this.drawDataBuilder_.build();
            }

            if (this.taskListBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
                  this.bitField0_ &= -5;
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
            if (other instanceof S2C_TurntableMain_23802) {
               return this.mergeFrom((S2C_TurntableMain_23802)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TurntableMain_23802 other) {
            if (other == TurntableMsg.S2C_TurntableMain_23802.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMaxRound()) {
                  this.setMaxRound(other.getMaxRound());
               }

               if (this.drawDataBuilder_ == null) {
                  if (!other.drawData_.isEmpty()) {
                     if (this.drawData_.isEmpty()) {
                        this.drawData_ = other.drawData_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureDrawDataIsMutable();
                        this.drawData_.addAll(other.drawData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.drawData_.isEmpty()) {
                  if (this.drawDataBuilder_.isEmpty()) {
                     this.drawDataBuilder_.dispose();
                     this.drawDataBuilder_ = null;
                     this.drawData_ = other.drawData_;
                     this.bitField0_ &= -3;
                     this.drawDataBuilder_ = TurntableMsg.S2C_TurntableMain_23802.alwaysUseFieldBuilders ? this.getDrawDataFieldBuilder() : null;
                  } else {
                     this.drawDataBuilder_.addAllMessages(other.drawData_);
                  }
               }

               if (this.taskListBuilder_ == null) {
                  if (!other.taskList_.isEmpty()) {
                     if (this.taskList_.isEmpty()) {
                        this.taskList_ = other.taskList_;
                        this.bitField0_ &= -5;
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
                     this.bitField0_ &= -5;
                     this.taskListBuilder_ = TurntableMsg.S2C_TurntableMain_23802.alwaysUseFieldBuilders ? this.getTaskListFieldBuilder() : null;
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
            if (!this.hasMaxRound()) {
               return false;
            } else {
               for(int i = 0; i < this.getDrawDataCount(); ++i) {
                  if (!this.getDrawData(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getTaskListCount(); ++i) {
                  if (!this.getTaskList(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TurntableMain_23802 parsedMessage = null;

            try {
               parsedMessage = (S2C_TurntableMain_23802)TurntableMsg.S2C_TurntableMain_23802.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TurntableMain_23802)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMaxRound() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getMaxRound() {
            return this.maxRound_;
         }

         public Builder setMaxRound(int value) {
            this.bitField0_ |= 1;
            this.maxRound_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMaxRound() {
            this.bitField0_ &= -2;
            this.maxRound_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureDrawDataIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.drawData_ = new ArrayList(this.drawData_);
               this.bitField0_ |= 2;
            }

         }

         public List<DrawData> getDrawDataList() {
            return this.drawDataBuilder_ == null ? Collections.unmodifiableList(this.drawData_) : this.drawDataBuilder_.getMessageList();
         }

         public int getDrawDataCount() {
            return this.drawDataBuilder_ == null ? this.drawData_.size() : this.drawDataBuilder_.getCount();
         }

         public DrawData getDrawData(int index) {
            return this.drawDataBuilder_ == null ? (DrawData)this.drawData_.get(index) : (DrawData)this.drawDataBuilder_.getMessage(index);
         }

         public Builder setDrawData(int index, DrawData value) {
            if (this.drawDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDrawDataIsMutable();
               this.drawData_.set(index, value);
               this.onChanged();
            } else {
               this.drawDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setDrawData(int index, DrawData.Builder builderForValue) {
            if (this.drawDataBuilder_ == null) {
               this.ensureDrawDataIsMutable();
               this.drawData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.drawDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addDrawData(DrawData value) {
            if (this.drawDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDrawDataIsMutable();
               this.drawData_.add(value);
               this.onChanged();
            } else {
               this.drawDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addDrawData(int index, DrawData value) {
            if (this.drawDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDrawDataIsMutable();
               this.drawData_.add(index, value);
               this.onChanged();
            } else {
               this.drawDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addDrawData(DrawData.Builder builderForValue) {
            if (this.drawDataBuilder_ == null) {
               this.ensureDrawDataIsMutable();
               this.drawData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.drawDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addDrawData(int index, DrawData.Builder builderForValue) {
            if (this.drawDataBuilder_ == null) {
               this.ensureDrawDataIsMutable();
               this.drawData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.drawDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllDrawData(Iterable<? extends DrawData> values) {
            if (this.drawDataBuilder_ == null) {
               this.ensureDrawDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.drawData_);
               this.onChanged();
            } else {
               this.drawDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearDrawData() {
            if (this.drawDataBuilder_ == null) {
               this.drawData_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.drawDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeDrawData(int index) {
            if (this.drawDataBuilder_ == null) {
               this.ensureDrawDataIsMutable();
               this.drawData_.remove(index);
               this.onChanged();
            } else {
               this.drawDataBuilder_.remove(index);
            }

            return this;
         }

         public DrawData.Builder getDrawDataBuilder(int index) {
            return (DrawData.Builder)this.getDrawDataFieldBuilder().getBuilder(index);
         }

         public DrawDataOrBuilder getDrawDataOrBuilder(int index) {
            return this.drawDataBuilder_ == null ? (DrawDataOrBuilder)this.drawData_.get(index) : (DrawDataOrBuilder)this.drawDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends DrawDataOrBuilder> getDrawDataOrBuilderList() {
            return this.drawDataBuilder_ != null ? this.drawDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.drawData_);
         }

         public DrawData.Builder addDrawDataBuilder() {
            return (DrawData.Builder)this.getDrawDataFieldBuilder().addBuilder(TurntableMsg.DrawData.getDefaultInstance());
         }

         public DrawData.Builder addDrawDataBuilder(int index) {
            return (DrawData.Builder)this.getDrawDataFieldBuilder().addBuilder(index, TurntableMsg.DrawData.getDefaultInstance());
         }

         public List<DrawData.Builder> getDrawDataBuilderList() {
            return this.getDrawDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<DrawData, DrawData.Builder, DrawDataOrBuilder> getDrawDataFieldBuilder() {
            if (this.drawDataBuilder_ == null) {
               this.drawDataBuilder_ = new RepeatedFieldBuilderV3(this.drawData_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.drawData_ = null;
            }

            return this.drawDataBuilder_;
         }

         private void ensureTaskListIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.taskList_ = new ArrayList(this.taskList_);
               this.bitField0_ |= 4;
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
               this.bitField0_ &= -5;
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
               this.taskListBuilder_ = new RepeatedFieldBuilderV3(this.taskList_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class DrawData extends GeneratedMessageV3 implements DrawDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DRAWROUND_FIELD_NUMBER = 1;
      private int drawRound_;
      public static final int DRAWID_FIELD_NUMBER = 2;
      private Internal.IntList drawId_;
      private byte memoizedIsInitialized;
      private static final DrawData DEFAULT_INSTANCE = new DrawData();
      /** @deprecated */
      @Deprecated
      public static final Parser<DrawData> PARSER = new AbstractParser<DrawData>() {
         public DrawData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new DrawData(input, extensionRegistry);
         }
      };

      private DrawData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private DrawData() {
         this.memoizedIsInitialized = -1;
         this.drawId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new DrawData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private DrawData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.drawRound_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.drawId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.drawId_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.drawId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.drawId_.addInt(input.readInt32());
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
               if ((mutable_bitField0_ & 2) != 0) {
                  this.drawId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_DrawData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_DrawData_fieldAccessorTable.ensureFieldAccessorsInitialized(DrawData.class, Builder.class);
      }

      public boolean hasDrawRound() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDrawRound() {
         return this.drawRound_;
      }

      public List<Integer> getDrawIdList() {
         return this.drawId_;
      }

      public int getDrawIdCount() {
         return this.drawId_.size();
      }

      public int getDrawId(int index) {
         return this.drawId_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDrawRound()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.drawRound_);
         }

         for(int i = 0; i < this.drawId_.size(); ++i) {
            output.writeInt32(2, this.drawId_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.drawRound_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.drawId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.drawId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getDrawIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof DrawData)) {
            return super.equals(obj);
         } else {
            DrawData other = (DrawData)obj;
            if (this.hasDrawRound() != other.hasDrawRound()) {
               return false;
            } else if (this.hasDrawRound() && this.getDrawRound() != other.getDrawRound()) {
               return false;
            } else if (!this.getDrawIdList().equals(other.getDrawIdList())) {
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
            if (this.hasDrawRound()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDrawRound();
            }

            if (this.getDrawIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDrawIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static DrawData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (DrawData)PARSER.parseFrom(data);
      }

      public static DrawData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DrawData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DrawData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (DrawData)PARSER.parseFrom(data);
      }

      public static DrawData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DrawData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DrawData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (DrawData)PARSER.parseFrom(data);
      }

      public static DrawData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DrawData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DrawData parseFrom(InputStream input) throws IOException {
         return (DrawData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static DrawData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DrawData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static DrawData parseDelimitedFrom(InputStream input) throws IOException {
         return (DrawData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static DrawData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DrawData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static DrawData parseFrom(CodedInputStream input) throws IOException {
         return (DrawData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static DrawData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DrawData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(DrawData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static DrawData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<DrawData> parser() {
         return PARSER;
      }

      public Parser<DrawData> getParserForType() {
         return PARSER;
      }

      public DrawData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DrawDataOrBuilder {
         private int bitField0_;
         private int drawRound_;
         private Internal.IntList drawId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_DrawData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_DrawData_fieldAccessorTable.ensureFieldAccessorsInitialized(DrawData.class, Builder.class);
         }

         private Builder() {
            this.drawId_ = TurntableMsg.DrawData.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.drawId_ = TurntableMsg.DrawData.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TurntableMsg.DrawData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.drawRound_ = 0;
            this.bitField0_ &= -2;
            this.drawId_ = TurntableMsg.DrawData.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_DrawData_descriptor;
         }

         public DrawData getDefaultInstanceForType() {
            return TurntableMsg.DrawData.getDefaultInstance();
         }

         public DrawData build() {
            DrawData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public DrawData buildPartial() {
            DrawData result = new DrawData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.drawRound_ = this.drawRound_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.drawId_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.drawId_ = this.drawId_;
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
            if (other instanceof DrawData) {
               return this.mergeFrom((DrawData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(DrawData other) {
            if (other == TurntableMsg.DrawData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDrawRound()) {
                  this.setDrawRound(other.getDrawRound());
               }

               if (!other.drawId_.isEmpty()) {
                  if (this.drawId_.isEmpty()) {
                     this.drawId_ = other.drawId_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureDrawIdIsMutable();
                     this.drawId_.addAll(other.drawId_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasDrawRound();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            DrawData parsedMessage = null;

            try {
               parsedMessage = (DrawData)TurntableMsg.DrawData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (DrawData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDrawRound() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDrawRound() {
            return this.drawRound_;
         }

         public Builder setDrawRound(int value) {
            this.bitField0_ |= 1;
            this.drawRound_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDrawRound() {
            this.bitField0_ &= -2;
            this.drawRound_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureDrawIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.drawId_ = TurntableMsg.DrawData.mutableCopy(this.drawId_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getDrawIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.drawId_) : this.drawId_);
         }

         public int getDrawIdCount() {
            return this.drawId_.size();
         }

         public int getDrawId(int index) {
            return this.drawId_.getInt(index);
         }

         public Builder setDrawId(int index, int value) {
            this.ensureDrawIdIsMutable();
            this.drawId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addDrawId(int value) {
            this.ensureDrawIdIsMutable();
            this.drawId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllDrawId(Iterable<? extends Integer> values) {
            this.ensureDrawIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.drawId_);
            this.onChanged();
            return this;
         }

         public Builder clearDrawId() {
            this.drawId_ = TurntableMsg.DrawData.emptyIntList();
            this.bitField0_ &= -3;
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

   public static final class C2S_TurntableCommitTask_23803 extends GeneratedMessageV3 implements C2S_TurntableCommitTask_23803OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_TurntableCommitTask_23803 DEFAULT_INSTANCE = new C2S_TurntableCommitTask_23803();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TurntableCommitTask_23803> PARSER = new AbstractParser<C2S_TurntableCommitTask_23803>() {
         public C2S_TurntableCommitTask_23803 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TurntableCommitTask_23803(input, extensionRegistry);
         }
      };

      private C2S_TurntableCommitTask_23803(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TurntableCommitTask_23803() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TurntableCommitTask_23803();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TurntableCommitTask_23803(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_C2S_TurntableCommitTask_23803_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_C2S_TurntableCommitTask_23803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TurntableCommitTask_23803.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TurntableCommitTask_23803)) {
            return super.equals(obj);
         } else {
            C2S_TurntableCommitTask_23803 other = (C2S_TurntableCommitTask_23803)obj;
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

      public static C2S_TurntableCommitTask_23803 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TurntableCommitTask_23803)PARSER.parseFrom(data);
      }

      public static C2S_TurntableCommitTask_23803 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TurntableCommitTask_23803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TurntableCommitTask_23803 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TurntableCommitTask_23803)PARSER.parseFrom(data);
      }

      public static C2S_TurntableCommitTask_23803 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TurntableCommitTask_23803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TurntableCommitTask_23803 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TurntableCommitTask_23803)PARSER.parseFrom(data);
      }

      public static C2S_TurntableCommitTask_23803 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TurntableCommitTask_23803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TurntableCommitTask_23803 parseFrom(InputStream input) throws IOException {
         return (C2S_TurntableCommitTask_23803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TurntableCommitTask_23803 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TurntableCommitTask_23803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TurntableCommitTask_23803 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TurntableCommitTask_23803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TurntableCommitTask_23803 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TurntableCommitTask_23803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TurntableCommitTask_23803 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TurntableCommitTask_23803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TurntableCommitTask_23803 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TurntableCommitTask_23803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TurntableCommitTask_23803 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TurntableCommitTask_23803 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TurntableCommitTask_23803> parser() {
         return PARSER;
      }

      public Parser<C2S_TurntableCommitTask_23803> getParserForType() {
         return PARSER;
      }

      public C2S_TurntableCommitTask_23803 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TurntableCommitTask_23803OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_C2S_TurntableCommitTask_23803_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_C2S_TurntableCommitTask_23803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TurntableCommitTask_23803.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TurntableMsg.C2S_TurntableCommitTask_23803.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_C2S_TurntableCommitTask_23803_descriptor;
         }

         public C2S_TurntableCommitTask_23803 getDefaultInstanceForType() {
            return TurntableMsg.C2S_TurntableCommitTask_23803.getDefaultInstance();
         }

         public C2S_TurntableCommitTask_23803 build() {
            C2S_TurntableCommitTask_23803 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TurntableCommitTask_23803 buildPartial() {
            C2S_TurntableCommitTask_23803 result = new C2S_TurntableCommitTask_23803(this);
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
            if (other instanceof C2S_TurntableCommitTask_23803) {
               return this.mergeFrom((C2S_TurntableCommitTask_23803)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TurntableCommitTask_23803 other) {
            if (other == TurntableMsg.C2S_TurntableCommitTask_23803.getDefaultInstance()) {
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
            C2S_TurntableCommitTask_23803 parsedMessage = null;

            try {
               parsedMessage = (C2S_TurntableCommitTask_23803)TurntableMsg.C2S_TurntableCommitTask_23803.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TurntableCommitTask_23803)e.getUnfinishedMessage();
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

   public static final class S2C_TurntableCommitTask_23804 extends GeneratedMessageV3 implements S2C_TurntableCommitTask_23804OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASKLIST_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> taskList_;
      private byte memoizedIsInitialized;
      private static final S2C_TurntableCommitTask_23804 DEFAULT_INSTANCE = new S2C_TurntableCommitTask_23804();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TurntableCommitTask_23804> PARSER = new AbstractParser<S2C_TurntableCommitTask_23804>() {
         public S2C_TurntableCommitTask_23804 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TurntableCommitTask_23804(input, extensionRegistry);
         }
      };

      private S2C_TurntableCommitTask_23804(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TurntableCommitTask_23804() {
         this.memoizedIsInitialized = -1;
         this.taskList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TurntableCommitTask_23804();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TurntableCommitTask_23804(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_S2C_TurntableCommitTask_23804_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_S2C_TurntableCommitTask_23804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TurntableCommitTask_23804.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TurntableCommitTask_23804)) {
            return super.equals(obj);
         } else {
            S2C_TurntableCommitTask_23804 other = (S2C_TurntableCommitTask_23804)obj;
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

      public static S2C_TurntableCommitTask_23804 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TurntableCommitTask_23804)PARSER.parseFrom(data);
      }

      public static S2C_TurntableCommitTask_23804 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TurntableCommitTask_23804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TurntableCommitTask_23804 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TurntableCommitTask_23804)PARSER.parseFrom(data);
      }

      public static S2C_TurntableCommitTask_23804 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TurntableCommitTask_23804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TurntableCommitTask_23804 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TurntableCommitTask_23804)PARSER.parseFrom(data);
      }

      public static S2C_TurntableCommitTask_23804 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TurntableCommitTask_23804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TurntableCommitTask_23804 parseFrom(InputStream input) throws IOException {
         return (S2C_TurntableCommitTask_23804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TurntableCommitTask_23804 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TurntableCommitTask_23804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TurntableCommitTask_23804 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TurntableCommitTask_23804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TurntableCommitTask_23804 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TurntableCommitTask_23804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TurntableCommitTask_23804 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TurntableCommitTask_23804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TurntableCommitTask_23804 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TurntableCommitTask_23804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TurntableCommitTask_23804 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TurntableCommitTask_23804 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TurntableCommitTask_23804> parser() {
         return PARSER;
      }

      public Parser<S2C_TurntableCommitTask_23804> getParserForType() {
         return PARSER;
      }

      public S2C_TurntableCommitTask_23804 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TurntableCommitTask_23804OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> taskList_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_S2C_TurntableCommitTask_23804_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_S2C_TurntableCommitTask_23804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TurntableCommitTask_23804.class, Builder.class);
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
            if (TurntableMsg.S2C_TurntableCommitTask_23804.alwaysUseFieldBuilders) {
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
            return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_S2C_TurntableCommitTask_23804_descriptor;
         }

         public S2C_TurntableCommitTask_23804 getDefaultInstanceForType() {
            return TurntableMsg.S2C_TurntableCommitTask_23804.getDefaultInstance();
         }

         public S2C_TurntableCommitTask_23804 build() {
            S2C_TurntableCommitTask_23804 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TurntableCommitTask_23804 buildPartial() {
            S2C_TurntableCommitTask_23804 result = new S2C_TurntableCommitTask_23804(this);
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
            if (other instanceof S2C_TurntableCommitTask_23804) {
               return this.mergeFrom((S2C_TurntableCommitTask_23804)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TurntableCommitTask_23804 other) {
            if (other == TurntableMsg.S2C_TurntableCommitTask_23804.getDefaultInstance()) {
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
                     this.taskListBuilder_ = TurntableMsg.S2C_TurntableCommitTask_23804.alwaysUseFieldBuilders ? this.getTaskListFieldBuilder() : null;
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
            S2C_TurntableCommitTask_23804 parsedMessage = null;

            try {
               parsedMessage = (S2C_TurntableCommitTask_23804)TurntableMsg.S2C_TurntableCommitTask_23804.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TurntableCommitTask_23804)e.getUnfinishedMessage();
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

   public static final class C2S_TurntableDraw_23805 extends GeneratedMessageV3 implements C2S_TurntableDraw_23805OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DRAWROUND_FIELD_NUMBER = 1;
      private int drawRound_;
      private byte memoizedIsInitialized;
      private static final C2S_TurntableDraw_23805 DEFAULT_INSTANCE = new C2S_TurntableDraw_23805();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TurntableDraw_23805> PARSER = new AbstractParser<C2S_TurntableDraw_23805>() {
         public C2S_TurntableDraw_23805 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TurntableDraw_23805(input, extensionRegistry);
         }
      };

      private C2S_TurntableDraw_23805(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TurntableDraw_23805() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TurntableDraw_23805();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TurntableDraw_23805(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.drawRound_ = input.readInt32();
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
         return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_C2S_TurntableDraw_23805_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_C2S_TurntableDraw_23805_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TurntableDraw_23805.class, Builder.class);
      }

      public boolean hasDrawRound() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDrawRound() {
         return this.drawRound_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDrawRound()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.drawRound_);
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
               size += CodedOutputStream.computeInt32Size(1, this.drawRound_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TurntableDraw_23805)) {
            return super.equals(obj);
         } else {
            C2S_TurntableDraw_23805 other = (C2S_TurntableDraw_23805)obj;
            if (this.hasDrawRound() != other.hasDrawRound()) {
               return false;
            } else if (this.hasDrawRound() && this.getDrawRound() != other.getDrawRound()) {
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
            if (this.hasDrawRound()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDrawRound();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TurntableDraw_23805 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TurntableDraw_23805)PARSER.parseFrom(data);
      }

      public static C2S_TurntableDraw_23805 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TurntableDraw_23805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TurntableDraw_23805 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TurntableDraw_23805)PARSER.parseFrom(data);
      }

      public static C2S_TurntableDraw_23805 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TurntableDraw_23805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TurntableDraw_23805 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TurntableDraw_23805)PARSER.parseFrom(data);
      }

      public static C2S_TurntableDraw_23805 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TurntableDraw_23805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TurntableDraw_23805 parseFrom(InputStream input) throws IOException {
         return (C2S_TurntableDraw_23805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TurntableDraw_23805 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TurntableDraw_23805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TurntableDraw_23805 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TurntableDraw_23805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TurntableDraw_23805 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TurntableDraw_23805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TurntableDraw_23805 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TurntableDraw_23805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TurntableDraw_23805 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TurntableDraw_23805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TurntableDraw_23805 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TurntableDraw_23805 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TurntableDraw_23805> parser() {
         return PARSER;
      }

      public Parser<C2S_TurntableDraw_23805> getParserForType() {
         return PARSER;
      }

      public C2S_TurntableDraw_23805 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TurntableDraw_23805OrBuilder {
         private int bitField0_;
         private int drawRound_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_C2S_TurntableDraw_23805_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_C2S_TurntableDraw_23805_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TurntableDraw_23805.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TurntableMsg.C2S_TurntableDraw_23805.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.drawRound_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_C2S_TurntableDraw_23805_descriptor;
         }

         public C2S_TurntableDraw_23805 getDefaultInstanceForType() {
            return TurntableMsg.C2S_TurntableDraw_23805.getDefaultInstance();
         }

         public C2S_TurntableDraw_23805 build() {
            C2S_TurntableDraw_23805 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TurntableDraw_23805 buildPartial() {
            C2S_TurntableDraw_23805 result = new C2S_TurntableDraw_23805(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.drawRound_ = this.drawRound_;
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
            if (other instanceof C2S_TurntableDraw_23805) {
               return this.mergeFrom((C2S_TurntableDraw_23805)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TurntableDraw_23805 other) {
            if (other == TurntableMsg.C2S_TurntableDraw_23805.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDrawRound()) {
                  this.setDrawRound(other.getDrawRound());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasDrawRound();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TurntableDraw_23805 parsedMessage = null;

            try {
               parsedMessage = (C2S_TurntableDraw_23805)TurntableMsg.C2S_TurntableDraw_23805.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TurntableDraw_23805)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDrawRound() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDrawRound() {
            return this.drawRound_;
         }

         public Builder setDrawRound(int value) {
            this.bitField0_ |= 1;
            this.drawRound_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDrawRound() {
            this.bitField0_ &= -2;
            this.drawRound_ = 0;
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

   public static final class S2C_TurntableDraw_23806 extends GeneratedMessageV3 implements S2C_TurntableDraw_23806OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARD_FIELD_NUMBER = 1;
      private int reward_;
      private byte memoizedIsInitialized;
      private static final S2C_TurntableDraw_23806 DEFAULT_INSTANCE = new S2C_TurntableDraw_23806();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TurntableDraw_23806> PARSER = new AbstractParser<S2C_TurntableDraw_23806>() {
         public S2C_TurntableDraw_23806 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TurntableDraw_23806(input, extensionRegistry);
         }
      };

      private S2C_TurntableDraw_23806(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TurntableDraw_23806() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TurntableDraw_23806();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TurntableDraw_23806(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.reward_ = input.readInt32();
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
         return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_S2C_TurntableDraw_23806_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_S2C_TurntableDraw_23806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TurntableDraw_23806.class, Builder.class);
      }

      public boolean hasReward() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getReward() {
         return this.reward_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.reward_);
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
               size += CodedOutputStream.computeInt32Size(1, this.reward_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TurntableDraw_23806)) {
            return super.equals(obj);
         } else {
            S2C_TurntableDraw_23806 other = (S2C_TurntableDraw_23806)obj;
            if (this.hasReward() != other.hasReward()) {
               return false;
            } else if (this.hasReward() && this.getReward() != other.getReward()) {
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
            if (this.hasReward()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getReward();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TurntableDraw_23806 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TurntableDraw_23806)PARSER.parseFrom(data);
      }

      public static S2C_TurntableDraw_23806 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TurntableDraw_23806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TurntableDraw_23806 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TurntableDraw_23806)PARSER.parseFrom(data);
      }

      public static S2C_TurntableDraw_23806 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TurntableDraw_23806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TurntableDraw_23806 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TurntableDraw_23806)PARSER.parseFrom(data);
      }

      public static S2C_TurntableDraw_23806 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TurntableDraw_23806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TurntableDraw_23806 parseFrom(InputStream input) throws IOException {
         return (S2C_TurntableDraw_23806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TurntableDraw_23806 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TurntableDraw_23806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TurntableDraw_23806 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TurntableDraw_23806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TurntableDraw_23806 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TurntableDraw_23806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TurntableDraw_23806 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TurntableDraw_23806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TurntableDraw_23806 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TurntableDraw_23806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TurntableDraw_23806 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TurntableDraw_23806 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TurntableDraw_23806> parser() {
         return PARSER;
      }

      public Parser<S2C_TurntableDraw_23806> getParserForType() {
         return PARSER;
      }

      public S2C_TurntableDraw_23806 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TurntableDraw_23806OrBuilder {
         private int bitField0_;
         private int reward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_S2C_TurntableDraw_23806_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_S2C_TurntableDraw_23806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TurntableDraw_23806.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TurntableMsg.S2C_TurntableDraw_23806.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.reward_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TurntableMsg.internal_static_turntable_com_gzbz_protobuf_S2C_TurntableDraw_23806_descriptor;
         }

         public S2C_TurntableDraw_23806 getDefaultInstanceForType() {
            return TurntableMsg.S2C_TurntableDraw_23806.getDefaultInstance();
         }

         public S2C_TurntableDraw_23806 build() {
            S2C_TurntableDraw_23806 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TurntableDraw_23806 buildPartial() {
            S2C_TurntableDraw_23806 result = new S2C_TurntableDraw_23806(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.reward_ = this.reward_;
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
            if (other instanceof S2C_TurntableDraw_23806) {
               return this.mergeFrom((S2C_TurntableDraw_23806)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TurntableDraw_23806 other) {
            if (other == TurntableMsg.S2C_TurntableDraw_23806.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasReward()) {
                  this.setReward(other.getReward());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasReward();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TurntableDraw_23806 parsedMessage = null;

            try {
               parsedMessage = (S2C_TurntableDraw_23806)TurntableMsg.S2C_TurntableDraw_23806.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TurntableDraw_23806)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasReward() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getReward() {
            return this.reward_;
         }

         public Builder setReward(int value) {
            this.bitField0_ |= 1;
            this.reward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearReward() {
            this.bitField0_ &= -2;
            this.reward_ = 0;
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

   public interface C2S_TurntableCommitTask_23803OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_TurntableDraw_23805OrBuilder extends MessageOrBuilder {
      boolean hasDrawRound();

      int getDrawRound();
   }

   public interface C2S_TurntableMain_23801OrBuilder extends MessageOrBuilder {
   }

   public interface DrawDataOrBuilder extends MessageOrBuilder {
      boolean hasDrawRound();

      int getDrawRound();

      List<Integer> getDrawIdList();

      int getDrawIdCount();

      int getDrawId(int index);
   }

   public interface S2C_TurntableCommitTask_23804OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskListList();

      ActivityMsg.TaskData getTaskList(int index);

      int getTaskListCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index);
   }

   public interface S2C_TurntableDraw_23806OrBuilder extends MessageOrBuilder {
      boolean hasReward();

      int getReward();
   }

   public interface S2C_TurntableMain_23802OrBuilder extends MessageOrBuilder {
      boolean hasMaxRound();

      int getMaxRound();

      List<DrawData> getDrawDataList();

      DrawData getDrawData(int index);

      int getDrawDataCount();

      List<? extends DrawDataOrBuilder> getDrawDataOrBuilderList();

      DrawDataOrBuilder getDrawDataOrBuilder(int index);

      List<ActivityMsg.TaskData> getTaskListList();

      ActivityMsg.TaskData getTaskList(int index);

      int getTaskListCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskListOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskListOrBuilder(int index);
   }
}
