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

public final class HeroMailMsg {
   private static final Descriptors.Descriptor internal_static_heroMail_com_gzbz_protobuf_HeroMailInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroMail_com_gzbz_protobuf_HeroMailInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroMail_com_gzbz_protobuf_C2S_OpenUi_13701_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroMail_com_gzbz_protobuf_C2S_OpenUi_13701_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroMail_com_gzbz_protobuf_S2C_OpenUi_13702_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroMail_com_gzbz_protobuf_S2C_OpenUi_13702_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroMail_com_gzbz_protobuf_C2S_ReadMail_13703_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroMail_com_gzbz_protobuf_C2S_ReadMail_13703_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroMail_com_gzbz_protobuf_S2C_ReadMail_13704_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroMail_com_gzbz_protobuf_S2C_ReadMail_13704_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroMail_com_gzbz_protobuf_C2S_TakeMail_13705_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroMail_com_gzbz_protobuf_C2S_TakeMail_13705_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroMail_com_gzbz_protobuf_S2C_TakeMail_13706_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroMail_com_gzbz_protobuf_S2C_TakeMail_13706_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroMail_com_gzbz_protobuf_C2S_OneKeyTakeMail_13709_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroMail_com_gzbz_protobuf_C2S_OneKeyTakeMail_13709_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroMail_com_gzbz_protobuf_S2C_OneKeyTakeMail_13710_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroMail_com_gzbz_protobuf_S2C_OneKeyTakeMail_13710_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroMail_com_gzbz_protobuf_S2C_UpdateMail_13722_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroMail_com_gzbz_protobuf_S2C_UpdateMail_13722_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private HeroMailMsg() {
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
      String[] descriptorData = new String[]{"\n\u000eHeroMail.proto\u0012\u001aheroMail.com.gzbz.protobuf\"N\n\fHeroMailInfo\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005state\u0018\u0002 \u0002(\u0005\u0012\u0011\n\ttaskState\u0018\u0003 \u0002(\u0005\u0012\u0010\n\bmailTime\u0018\u0004 \u0002(\u0005\"\u0012\n\u0010C2S_OpenUi_13701\"}\n\u0010S2C_OpenUi_13702\u0012\u0016\n\u000eopenServerTime\u0018\u0001 \u0002(\u0005\u0012\u0018\n\u0010createPlayerTime\u0018\u0002 \u0002(\u0005\u00127\n\u0005infos\u0018\u0003 \u0003(\u000b2(.heroMail.com.gzbz.protobuf.HeroMailInfo\"$\n\u0012C2S_ReadMail_13703\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"4\n\u0012S2C_ReadMail_13704\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006taskId\u0018\u0002 \u0002(\u0005\"$\n\u0012C2S_TakeMail_13705\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"4\n\u0012S2C_TakeMail_13706\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006taskId\u0018\u0002 \u0002(\u0005\"\u001a\n\u0018C2S_OneKeyTakeMail_13709\"*\n\u0018S2C_OneKeyTakeMail_13710\u0012\u000e\n\u0006taskId\u0018\u0002 \u0003(\u0005\"O\n\u0014S2C_UpdateMail_13722\u00127\n\u0005infos\u0018\u0001 \u0003(\u000b2(.heroMail.com.gzbz.protobuf.HeroMailInfoB\"\n\u0011com.gzbz.protobufB\u000bHeroMailMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_heroMail_com_gzbz_protobuf_HeroMailInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_heroMail_com_gzbz_protobuf_HeroMailInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroMail_com_gzbz_protobuf_HeroMailInfo_descriptor, new String[]{"Id", "State", "TaskState", "MailTime"});
      internal_static_heroMail_com_gzbz_protobuf_C2S_OpenUi_13701_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_heroMail_com_gzbz_protobuf_C2S_OpenUi_13701_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroMail_com_gzbz_protobuf_C2S_OpenUi_13701_descriptor, new String[0]);
      internal_static_heroMail_com_gzbz_protobuf_S2C_OpenUi_13702_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_heroMail_com_gzbz_protobuf_S2C_OpenUi_13702_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroMail_com_gzbz_protobuf_S2C_OpenUi_13702_descriptor, new String[]{"OpenServerTime", "CreatePlayerTime", "Infos"});
      internal_static_heroMail_com_gzbz_protobuf_C2S_ReadMail_13703_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_heroMail_com_gzbz_protobuf_C2S_ReadMail_13703_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroMail_com_gzbz_protobuf_C2S_ReadMail_13703_descriptor, new String[]{"TaskId"});
      internal_static_heroMail_com_gzbz_protobuf_S2C_ReadMail_13704_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_heroMail_com_gzbz_protobuf_S2C_ReadMail_13704_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroMail_com_gzbz_protobuf_S2C_ReadMail_13704_descriptor, new String[]{"Result", "TaskId"});
      internal_static_heroMail_com_gzbz_protobuf_C2S_TakeMail_13705_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_heroMail_com_gzbz_protobuf_C2S_TakeMail_13705_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroMail_com_gzbz_protobuf_C2S_TakeMail_13705_descriptor, new String[]{"TaskId"});
      internal_static_heroMail_com_gzbz_protobuf_S2C_TakeMail_13706_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_heroMail_com_gzbz_protobuf_S2C_TakeMail_13706_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroMail_com_gzbz_protobuf_S2C_TakeMail_13706_descriptor, new String[]{"Result", "TaskId"});
      internal_static_heroMail_com_gzbz_protobuf_C2S_OneKeyTakeMail_13709_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_heroMail_com_gzbz_protobuf_C2S_OneKeyTakeMail_13709_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroMail_com_gzbz_protobuf_C2S_OneKeyTakeMail_13709_descriptor, new String[0]);
      internal_static_heroMail_com_gzbz_protobuf_S2C_OneKeyTakeMail_13710_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_heroMail_com_gzbz_protobuf_S2C_OneKeyTakeMail_13710_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroMail_com_gzbz_protobuf_S2C_OneKeyTakeMail_13710_descriptor, new String[]{"TaskId"});
      internal_static_heroMail_com_gzbz_protobuf_S2C_UpdateMail_13722_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_heroMail_com_gzbz_protobuf_S2C_UpdateMail_13722_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroMail_com_gzbz_protobuf_S2C_UpdateMail_13722_descriptor, new String[]{"Infos"});
   }

   public static final class HeroMailInfo extends GeneratedMessageV3 implements HeroMailInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int STATE_FIELD_NUMBER = 2;
      private int state_;
      public static final int TASKSTATE_FIELD_NUMBER = 3;
      private int taskState_;
      public static final int MAILTIME_FIELD_NUMBER = 4;
      private int mailTime_;
      private byte memoizedIsInitialized;
      private static final HeroMailInfo DEFAULT_INSTANCE = new HeroMailInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<HeroMailInfo> PARSER = new AbstractParser<HeroMailInfo>() {
         public HeroMailInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new HeroMailInfo(input, extensionRegistry);
         }
      };

      private HeroMailInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private HeroMailInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new HeroMailInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private HeroMailInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.state_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.taskState_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.mailTime_ = input.readInt32();
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
         return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_HeroMailInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_HeroMailInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(HeroMailInfo.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasState() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public boolean hasTaskState() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getTaskState() {
         return this.taskState_;
      }

      public boolean hasMailTime() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getMailTime() {
         return this.mailTime_;
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
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTaskState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMailTime()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.state_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.taskState_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.mailTime_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.state_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.taskState_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.mailTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof HeroMailInfo)) {
            return super.equals(obj);
         } else {
            HeroMailInfo other = (HeroMailInfo)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
               return false;
            } else if (this.hasTaskState() != other.hasTaskState()) {
               return false;
            } else if (this.hasTaskState() && this.getTaskState() != other.getTaskState()) {
               return false;
            } else if (this.hasMailTime() != other.hasMailTime()) {
               return false;
            } else if (this.hasMailTime() && this.getMailTime() != other.getMailTime()) {
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

            if (this.hasState()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getState();
            }

            if (this.hasTaskState()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTaskState();
            }

            if (this.hasMailTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getMailTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static HeroMailInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (HeroMailInfo)PARSER.parseFrom(data);
      }

      public static HeroMailInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroMailInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroMailInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (HeroMailInfo)PARSER.parseFrom(data);
      }

      public static HeroMailInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroMailInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroMailInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (HeroMailInfo)PARSER.parseFrom(data);
      }

      public static HeroMailInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroMailInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroMailInfo parseFrom(InputStream input) throws IOException {
         return (HeroMailInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HeroMailInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroMailInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static HeroMailInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (HeroMailInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static HeroMailInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroMailInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static HeroMailInfo parseFrom(CodedInputStream input) throws IOException {
         return (HeroMailInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HeroMailInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroMailInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(HeroMailInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static HeroMailInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<HeroMailInfo> parser() {
         return PARSER;
      }

      public Parser<HeroMailInfo> getParserForType() {
         return PARSER;
      }

      public HeroMailInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HeroMailInfoOrBuilder {
         private int bitField0_;
         private int id_;
         private int state_;
         private int taskState_;
         private int mailTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_HeroMailInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_HeroMailInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(HeroMailInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroMailMsg.HeroMailInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.state_ = 0;
            this.bitField0_ &= -3;
            this.taskState_ = 0;
            this.bitField0_ &= -5;
            this.mailTime_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_HeroMailInfo_descriptor;
         }

         public HeroMailInfo getDefaultInstanceForType() {
            return HeroMailMsg.HeroMailInfo.getDefaultInstance();
         }

         public HeroMailInfo build() {
            HeroMailInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public HeroMailInfo buildPartial() {
            HeroMailInfo result = new HeroMailInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.state_ = this.state_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.taskState_ = this.taskState_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.mailTime_ = this.mailTime_;
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
            if (other instanceof HeroMailInfo) {
               return this.mergeFrom((HeroMailInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(HeroMailInfo other) {
            if (other == HeroMailMsg.HeroMailInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasState()) {
                  this.setState(other.getState());
               }

               if (other.hasTaskState()) {
                  this.setTaskState(other.getTaskState());
               }

               if (other.hasMailTime()) {
                  this.setMailTime(other.getMailTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else if (!this.hasState()) {
               return false;
            } else if (!this.hasTaskState()) {
               return false;
            } else {
               return this.hasMailTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            HeroMailInfo parsedMessage = null;

            try {
               parsedMessage = (HeroMailInfo)HeroMailMsg.HeroMailInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (HeroMailInfo)e.getUnfinishedMessage();
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

         public boolean hasTaskState() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getTaskState() {
            return this.taskState_;
         }

         public Builder setTaskState(int value) {
            this.bitField0_ |= 4;
            this.taskState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskState() {
            this.bitField0_ &= -5;
            this.taskState_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMailTime() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getMailTime() {
            return this.mailTime_;
         }

         public Builder setMailTime(int value) {
            this.bitField0_ |= 8;
            this.mailTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMailTime() {
            this.bitField0_ &= -9;
            this.mailTime_ = 0;
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

   public static final class C2S_OpenUi_13701 extends GeneratedMessageV3 implements C2S_OpenUi_13701OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OpenUi_13701 DEFAULT_INSTANCE = new C2S_OpenUi_13701();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenUi_13701> PARSER = new AbstractParser<C2S_OpenUi_13701>() {
         public C2S_OpenUi_13701 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenUi_13701(input, extensionRegistry);
         }
      };

      private C2S_OpenUi_13701(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenUi_13701() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenUi_13701();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenUi_13701(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_C2S_OpenUi_13701_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_C2S_OpenUi_13701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenUi_13701.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenUi_13701)) {
            return super.equals(obj);
         } else {
            C2S_OpenUi_13701 other = (C2S_OpenUi_13701)obj;
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

      public static C2S_OpenUi_13701 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_13701)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_13701 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_13701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_13701 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_13701)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_13701 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_13701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_13701 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_13701)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_13701 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_13701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_13701 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenUi_13701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_13701 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_13701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenUi_13701 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenUi_13701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_13701 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_13701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenUi_13701 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenUi_13701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_13701 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_13701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenUi_13701 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenUi_13701 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenUi_13701> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenUi_13701> getParserForType() {
         return PARSER;
      }

      public C2S_OpenUi_13701 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenUi_13701OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_C2S_OpenUi_13701_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_C2S_OpenUi_13701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenUi_13701.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroMailMsg.C2S_OpenUi_13701.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_C2S_OpenUi_13701_descriptor;
         }

         public C2S_OpenUi_13701 getDefaultInstanceForType() {
            return HeroMailMsg.C2S_OpenUi_13701.getDefaultInstance();
         }

         public C2S_OpenUi_13701 build() {
            C2S_OpenUi_13701 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenUi_13701 buildPartial() {
            C2S_OpenUi_13701 result = new C2S_OpenUi_13701(this);
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
            if (other instanceof C2S_OpenUi_13701) {
               return this.mergeFrom((C2S_OpenUi_13701)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenUi_13701 other) {
            if (other == HeroMailMsg.C2S_OpenUi_13701.getDefaultInstance()) {
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
            C2S_OpenUi_13701 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenUi_13701)HeroMailMsg.C2S_OpenUi_13701.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenUi_13701)e.getUnfinishedMessage();
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

   public static final class S2C_OpenUi_13702 extends GeneratedMessageV3 implements S2C_OpenUi_13702OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OPENSERVERTIME_FIELD_NUMBER = 1;
      private int openServerTime_;
      public static final int CREATEPLAYERTIME_FIELD_NUMBER = 2;
      private int createPlayerTime_;
      public static final int INFOS_FIELD_NUMBER = 3;
      private List<HeroMailInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenUi_13702 DEFAULT_INSTANCE = new S2C_OpenUi_13702();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenUi_13702> PARSER = new AbstractParser<S2C_OpenUi_13702>() {
         public S2C_OpenUi_13702 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenUi_13702(input, extensionRegistry);
         }
      };

      private S2C_OpenUi_13702(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenUi_13702() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenUi_13702();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenUi_13702(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.openServerTime_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.createPlayerTime_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.infos_.add(input.readMessage(HeroMailMsg.HeroMailInfo.PARSER, extensionRegistry));
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
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_OpenUi_13702_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_OpenUi_13702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenUi_13702.class, Builder.class);
      }

      public boolean hasOpenServerTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getOpenServerTime() {
         return this.openServerTime_;
      }

      public boolean hasCreatePlayerTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCreatePlayerTime() {
         return this.createPlayerTime_;
      }

      public List<HeroMailInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends HeroMailInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public HeroMailInfo getInfos(int index) {
         return (HeroMailInfo)this.infos_.get(index);
      }

      public HeroMailInfoOrBuilder getInfosOrBuilder(int index) {
         return (HeroMailInfoOrBuilder)this.infos_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasOpenServerTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCreatePlayerTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
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
            output.writeInt32(1, this.openServerTime_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.createPlayerTime_);
         }

         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.infos_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.openServerTime_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.createPlayerTime_);
            }

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.infos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OpenUi_13702)) {
            return super.equals(obj);
         } else {
            S2C_OpenUi_13702 other = (S2C_OpenUi_13702)obj;
            if (this.hasOpenServerTime() != other.hasOpenServerTime()) {
               return false;
            } else if (this.hasOpenServerTime() && this.getOpenServerTime() != other.getOpenServerTime()) {
               return false;
            } else if (this.hasCreatePlayerTime() != other.hasCreatePlayerTime()) {
               return false;
            } else if (this.hasCreatePlayerTime() && this.getCreatePlayerTime() != other.getCreatePlayerTime()) {
               return false;
            } else if (!this.getInfosList().equals(other.getInfosList())) {
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
            if (this.hasOpenServerTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOpenServerTime();
            }

            if (this.hasCreatePlayerTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCreatePlayerTime();
            }

            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OpenUi_13702 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenUi_13702)PARSER.parseFrom(data);
      }

      public static S2C_OpenUi_13702 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUi_13702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUi_13702 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenUi_13702)PARSER.parseFrom(data);
      }

      public static S2C_OpenUi_13702 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUi_13702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUi_13702 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenUi_13702)PARSER.parseFrom(data);
      }

      public static S2C_OpenUi_13702 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUi_13702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUi_13702 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenUi_13702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenUi_13702 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUi_13702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenUi_13702 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenUi_13702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenUi_13702 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUi_13702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenUi_13702 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenUi_13702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenUi_13702 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUi_13702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenUi_13702 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenUi_13702 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenUi_13702> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenUi_13702> getParserForType() {
         return PARSER;
      }

      public S2C_OpenUi_13702 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenUi_13702OrBuilder {
         private int bitField0_;
         private int openServerTime_;
         private int createPlayerTime_;
         private List<HeroMailInfo> infos_;
         private RepeatedFieldBuilderV3<HeroMailInfo, HeroMailInfo.Builder, HeroMailInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_OpenUi_13702_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_OpenUi_13702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenUi_13702.class, Builder.class);
         }

         private Builder() {
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroMailMsg.S2C_OpenUi_13702.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.openServerTime_ = 0;
            this.bitField0_ &= -2;
            this.createPlayerTime_ = 0;
            this.bitField0_ &= -3;
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_OpenUi_13702_descriptor;
         }

         public S2C_OpenUi_13702 getDefaultInstanceForType() {
            return HeroMailMsg.S2C_OpenUi_13702.getDefaultInstance();
         }

         public S2C_OpenUi_13702 build() {
            S2C_OpenUi_13702 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenUi_13702 buildPartial() {
            S2C_OpenUi_13702 result = new S2C_OpenUi_13702(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.openServerTime_ = this.openServerTime_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.createPlayerTime_ = this.createPlayerTime_;
               to_bitField0_ |= 2;
            }

            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -5;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
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
            if (other instanceof S2C_OpenUi_13702) {
               return this.mergeFrom((S2C_OpenUi_13702)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenUi_13702 other) {
            if (other == HeroMailMsg.S2C_OpenUi_13702.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOpenServerTime()) {
                  this.setOpenServerTime(other.getOpenServerTime());
               }

               if (other.hasCreatePlayerTime()) {
                  this.setCreatePlayerTime(other.getCreatePlayerTime());
               }

               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureInfosIsMutable();
                        this.infos_.addAll(other.infos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.infos_.isEmpty()) {
                  if (this.infosBuilder_.isEmpty()) {
                     this.infosBuilder_.dispose();
                     this.infosBuilder_ = null;
                     this.infos_ = other.infos_;
                     this.bitField0_ &= -5;
                     this.infosBuilder_ = HeroMailMsg.S2C_OpenUi_13702.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasOpenServerTime()) {
               return false;
            } else if (!this.hasCreatePlayerTime()) {
               return false;
            } else {
               for(int i = 0; i < this.getInfosCount(); ++i) {
                  if (!this.getInfos(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OpenUi_13702 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenUi_13702)HeroMailMsg.S2C_OpenUi_13702.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenUi_13702)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOpenServerTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getOpenServerTime() {
            return this.openServerTime_;
         }

         public Builder setOpenServerTime(int value) {
            this.bitField0_ |= 1;
            this.openServerTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpenServerTime() {
            this.bitField0_ &= -2;
            this.openServerTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCreatePlayerTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCreatePlayerTime() {
            return this.createPlayerTime_;
         }

         public Builder setCreatePlayerTime(int value) {
            this.bitField0_ |= 2;
            this.createPlayerTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCreatePlayerTime() {
            this.bitField0_ &= -3;
            this.createPlayerTime_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 4;
            }

         }

         public List<HeroMailInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public HeroMailInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (HeroMailInfo)this.infos_.get(index) : (HeroMailInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, HeroMailInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.set(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInfos(int index, HeroMailInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(HeroMailInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInfos(int index, HeroMailInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInfos(HeroMailInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, HeroMailInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends HeroMailInfo> values) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.infos_);
               this.onChanged();
            } else {
               this.infosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInfos() {
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Builder removeInfos(int index) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.remove(index);
               this.onChanged();
            } else {
               this.infosBuilder_.remove(index);
            }

            return this;
         }

         public HeroMailInfo.Builder getInfosBuilder(int index) {
            return (HeroMailInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public HeroMailInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (HeroMailInfoOrBuilder)this.infos_.get(index) : (HeroMailInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HeroMailInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public HeroMailInfo.Builder addInfosBuilder() {
            return (HeroMailInfo.Builder)this.getInfosFieldBuilder().addBuilder(HeroMailMsg.HeroMailInfo.getDefaultInstance());
         }

         public HeroMailInfo.Builder addInfosBuilder(int index) {
            return (HeroMailInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, HeroMailMsg.HeroMailInfo.getDefaultInstance());
         }

         public List<HeroMailInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HeroMailInfo, HeroMailInfo.Builder, HeroMailInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ReadMail_13703 extends GeneratedMessageV3 implements C2S_ReadMail_13703OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_ReadMail_13703 DEFAULT_INSTANCE = new C2S_ReadMail_13703();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReadMail_13703> PARSER = new AbstractParser<C2S_ReadMail_13703>() {
         public C2S_ReadMail_13703 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReadMail_13703(input, extensionRegistry);
         }
      };

      private C2S_ReadMail_13703(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReadMail_13703() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReadMail_13703();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReadMail_13703(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_C2S_ReadMail_13703_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_C2S_ReadMail_13703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReadMail_13703.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReadMail_13703)) {
            return super.equals(obj);
         } else {
            C2S_ReadMail_13703 other = (C2S_ReadMail_13703)obj;
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

      public static C2S_ReadMail_13703 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReadMail_13703)PARSER.parseFrom(data);
      }

      public static C2S_ReadMail_13703 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReadMail_13703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReadMail_13703 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReadMail_13703)PARSER.parseFrom(data);
      }

      public static C2S_ReadMail_13703 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReadMail_13703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReadMail_13703 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReadMail_13703)PARSER.parseFrom(data);
      }

      public static C2S_ReadMail_13703 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReadMail_13703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReadMail_13703 parseFrom(InputStream input) throws IOException {
         return (C2S_ReadMail_13703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReadMail_13703 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReadMail_13703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReadMail_13703 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReadMail_13703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReadMail_13703 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReadMail_13703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReadMail_13703 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReadMail_13703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReadMail_13703 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReadMail_13703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReadMail_13703 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReadMail_13703 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReadMail_13703> parser() {
         return PARSER;
      }

      public Parser<C2S_ReadMail_13703> getParserForType() {
         return PARSER;
      }

      public C2S_ReadMail_13703 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReadMail_13703OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_C2S_ReadMail_13703_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_C2S_ReadMail_13703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReadMail_13703.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroMailMsg.C2S_ReadMail_13703.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_C2S_ReadMail_13703_descriptor;
         }

         public C2S_ReadMail_13703 getDefaultInstanceForType() {
            return HeroMailMsg.C2S_ReadMail_13703.getDefaultInstance();
         }

         public C2S_ReadMail_13703 build() {
            C2S_ReadMail_13703 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReadMail_13703 buildPartial() {
            C2S_ReadMail_13703 result = new C2S_ReadMail_13703(this);
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
            if (other instanceof C2S_ReadMail_13703) {
               return this.mergeFrom((C2S_ReadMail_13703)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReadMail_13703 other) {
            if (other == HeroMailMsg.C2S_ReadMail_13703.getDefaultInstance()) {
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
            C2S_ReadMail_13703 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReadMail_13703)HeroMailMsg.C2S_ReadMail_13703.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReadMail_13703)e.getUnfinishedMessage();
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

   public static final class S2C_ReadMail_13704 extends GeneratedMessageV3 implements S2C_ReadMail_13704OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TASKID_FIELD_NUMBER = 2;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_ReadMail_13704 DEFAULT_INSTANCE = new S2C_ReadMail_13704();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ReadMail_13704> PARSER = new AbstractParser<S2C_ReadMail_13704>() {
         public S2C_ReadMail_13704 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ReadMail_13704(input, extensionRegistry);
         }
      };

      private S2C_ReadMail_13704(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ReadMail_13704() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ReadMail_13704();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ReadMail_13704(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_ReadMail_13704_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_ReadMail_13704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReadMail_13704.class, Builder.class);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ReadMail_13704)) {
            return super.equals(obj);
         } else {
            S2C_ReadMail_13704 other = (S2C_ReadMail_13704)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasTaskId() != other.hasTaskId()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasTaskId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTaskId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ReadMail_13704 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ReadMail_13704)PARSER.parseFrom(data);
      }

      public static S2C_ReadMail_13704 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReadMail_13704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReadMail_13704 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ReadMail_13704)PARSER.parseFrom(data);
      }

      public static S2C_ReadMail_13704 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReadMail_13704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReadMail_13704 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ReadMail_13704)PARSER.parseFrom(data);
      }

      public static S2C_ReadMail_13704 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReadMail_13704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReadMail_13704 parseFrom(InputStream input) throws IOException {
         return (S2C_ReadMail_13704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReadMail_13704 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReadMail_13704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReadMail_13704 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ReadMail_13704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ReadMail_13704 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReadMail_13704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReadMail_13704 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ReadMail_13704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReadMail_13704 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReadMail_13704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ReadMail_13704 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ReadMail_13704 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ReadMail_13704> parser() {
         return PARSER;
      }

      public Parser<S2C_ReadMail_13704> getParserForType() {
         return PARSER;
      }

      public S2C_ReadMail_13704 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ReadMail_13704OrBuilder {
         private int bitField0_;
         private int result_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_ReadMail_13704_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_ReadMail_13704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReadMail_13704.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroMailMsg.S2C_ReadMail_13704.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.taskId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_ReadMail_13704_descriptor;
         }

         public S2C_ReadMail_13704 getDefaultInstanceForType() {
            return HeroMailMsg.S2C_ReadMail_13704.getDefaultInstance();
         }

         public S2C_ReadMail_13704 build() {
            S2C_ReadMail_13704 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ReadMail_13704 buildPartial() {
            S2C_ReadMail_13704 result = new S2C_ReadMail_13704(this);
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
            if (other instanceof S2C_ReadMail_13704) {
               return this.mergeFrom((S2C_ReadMail_13704)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ReadMail_13704 other) {
            if (other == HeroMailMsg.S2C_ReadMail_13704.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasTaskId()) {
                  this.setTaskId(other.getTaskId());
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
            S2C_ReadMail_13704 parsedMessage = null;

            try {
               parsedMessage = (S2C_ReadMail_13704)HeroMailMsg.S2C_ReadMail_13704.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ReadMail_13704)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_TakeMail_13705 extends GeneratedMessageV3 implements C2S_TakeMail_13705OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_TakeMail_13705 DEFAULT_INSTANCE = new C2S_TakeMail_13705();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TakeMail_13705> PARSER = new AbstractParser<C2S_TakeMail_13705>() {
         public C2S_TakeMail_13705 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TakeMail_13705(input, extensionRegistry);
         }
      };

      private C2S_TakeMail_13705(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TakeMail_13705() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TakeMail_13705();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TakeMail_13705(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_C2S_TakeMail_13705_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_C2S_TakeMail_13705_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeMail_13705.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TakeMail_13705)) {
            return super.equals(obj);
         } else {
            C2S_TakeMail_13705 other = (C2S_TakeMail_13705)obj;
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

      public static C2S_TakeMail_13705 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TakeMail_13705)PARSER.parseFrom(data);
      }

      public static C2S_TakeMail_13705 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeMail_13705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeMail_13705 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TakeMail_13705)PARSER.parseFrom(data);
      }

      public static C2S_TakeMail_13705 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeMail_13705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeMail_13705 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TakeMail_13705)PARSER.parseFrom(data);
      }

      public static C2S_TakeMail_13705 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeMail_13705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeMail_13705 parseFrom(InputStream input) throws IOException {
         return (C2S_TakeMail_13705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeMail_13705 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeMail_13705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeMail_13705 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TakeMail_13705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TakeMail_13705 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeMail_13705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeMail_13705 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TakeMail_13705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeMail_13705 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeMail_13705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TakeMail_13705 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TakeMail_13705 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TakeMail_13705> parser() {
         return PARSER;
      }

      public Parser<C2S_TakeMail_13705> getParserForType() {
         return PARSER;
      }

      public C2S_TakeMail_13705 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TakeMail_13705OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_C2S_TakeMail_13705_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_C2S_TakeMail_13705_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeMail_13705.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroMailMsg.C2S_TakeMail_13705.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_C2S_TakeMail_13705_descriptor;
         }

         public C2S_TakeMail_13705 getDefaultInstanceForType() {
            return HeroMailMsg.C2S_TakeMail_13705.getDefaultInstance();
         }

         public C2S_TakeMail_13705 build() {
            C2S_TakeMail_13705 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TakeMail_13705 buildPartial() {
            C2S_TakeMail_13705 result = new C2S_TakeMail_13705(this);
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
            if (other instanceof C2S_TakeMail_13705) {
               return this.mergeFrom((C2S_TakeMail_13705)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TakeMail_13705 other) {
            if (other == HeroMailMsg.C2S_TakeMail_13705.getDefaultInstance()) {
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
            C2S_TakeMail_13705 parsedMessage = null;

            try {
               parsedMessage = (C2S_TakeMail_13705)HeroMailMsg.C2S_TakeMail_13705.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TakeMail_13705)e.getUnfinishedMessage();
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

   public static final class S2C_TakeMail_13706 extends GeneratedMessageV3 implements S2C_TakeMail_13706OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TASKID_FIELD_NUMBER = 2;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_TakeMail_13706 DEFAULT_INSTANCE = new S2C_TakeMail_13706();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TakeMail_13706> PARSER = new AbstractParser<S2C_TakeMail_13706>() {
         public S2C_TakeMail_13706 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TakeMail_13706(input, extensionRegistry);
         }
      };

      private S2C_TakeMail_13706(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TakeMail_13706() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TakeMail_13706();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TakeMail_13706(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_TakeMail_13706_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_TakeMail_13706_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeMail_13706.class, Builder.class);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TakeMail_13706)) {
            return super.equals(obj);
         } else {
            S2C_TakeMail_13706 other = (S2C_TakeMail_13706)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasTaskId() != other.hasTaskId()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasTaskId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTaskId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TakeMail_13706 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TakeMail_13706)PARSER.parseFrom(data);
      }

      public static S2C_TakeMail_13706 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeMail_13706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeMail_13706 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TakeMail_13706)PARSER.parseFrom(data);
      }

      public static S2C_TakeMail_13706 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeMail_13706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeMail_13706 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TakeMail_13706)PARSER.parseFrom(data);
      }

      public static S2C_TakeMail_13706 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeMail_13706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeMail_13706 parseFrom(InputStream input) throws IOException {
         return (S2C_TakeMail_13706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeMail_13706 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeMail_13706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeMail_13706 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TakeMail_13706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TakeMail_13706 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeMail_13706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeMail_13706 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TakeMail_13706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeMail_13706 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeMail_13706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TakeMail_13706 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TakeMail_13706 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TakeMail_13706> parser() {
         return PARSER;
      }

      public Parser<S2C_TakeMail_13706> getParserForType() {
         return PARSER;
      }

      public S2C_TakeMail_13706 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TakeMail_13706OrBuilder {
         private int bitField0_;
         private int result_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_TakeMail_13706_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_TakeMail_13706_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeMail_13706.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroMailMsg.S2C_TakeMail_13706.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.taskId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_TakeMail_13706_descriptor;
         }

         public S2C_TakeMail_13706 getDefaultInstanceForType() {
            return HeroMailMsg.S2C_TakeMail_13706.getDefaultInstance();
         }

         public S2C_TakeMail_13706 build() {
            S2C_TakeMail_13706 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TakeMail_13706 buildPartial() {
            S2C_TakeMail_13706 result = new S2C_TakeMail_13706(this);
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
            if (other instanceof S2C_TakeMail_13706) {
               return this.mergeFrom((S2C_TakeMail_13706)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TakeMail_13706 other) {
            if (other == HeroMailMsg.S2C_TakeMail_13706.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasTaskId()) {
                  this.setTaskId(other.getTaskId());
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
            S2C_TakeMail_13706 parsedMessage = null;

            try {
               parsedMessage = (S2C_TakeMail_13706)HeroMailMsg.S2C_TakeMail_13706.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TakeMail_13706)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_OneKeyTakeMail_13709 extends GeneratedMessageV3 implements C2S_OneKeyTakeMail_13709OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OneKeyTakeMail_13709 DEFAULT_INSTANCE = new C2S_OneKeyTakeMail_13709();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OneKeyTakeMail_13709> PARSER = new AbstractParser<C2S_OneKeyTakeMail_13709>() {
         public C2S_OneKeyTakeMail_13709 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OneKeyTakeMail_13709(input, extensionRegistry);
         }
      };

      private C2S_OneKeyTakeMail_13709(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OneKeyTakeMail_13709() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OneKeyTakeMail_13709();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OneKeyTakeMail_13709(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_C2S_OneKeyTakeMail_13709_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_C2S_OneKeyTakeMail_13709_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OneKeyTakeMail_13709.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OneKeyTakeMail_13709)) {
            return super.equals(obj);
         } else {
            C2S_OneKeyTakeMail_13709 other = (C2S_OneKeyTakeMail_13709)obj;
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

      public static C2S_OneKeyTakeMail_13709 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyTakeMail_13709)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyTakeMail_13709 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyTakeMail_13709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyTakeMail_13709 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyTakeMail_13709)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyTakeMail_13709 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyTakeMail_13709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyTakeMail_13709 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyTakeMail_13709)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyTakeMail_13709 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyTakeMail_13709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyTakeMail_13709 parseFrom(InputStream input) throws IOException {
         return (C2S_OneKeyTakeMail_13709)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OneKeyTakeMail_13709 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyTakeMail_13709)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OneKeyTakeMail_13709 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OneKeyTakeMail_13709)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OneKeyTakeMail_13709 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyTakeMail_13709)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OneKeyTakeMail_13709 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OneKeyTakeMail_13709)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OneKeyTakeMail_13709 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyTakeMail_13709)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OneKeyTakeMail_13709 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OneKeyTakeMail_13709 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OneKeyTakeMail_13709> parser() {
         return PARSER;
      }

      public Parser<C2S_OneKeyTakeMail_13709> getParserForType() {
         return PARSER;
      }

      public C2S_OneKeyTakeMail_13709 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OneKeyTakeMail_13709OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_C2S_OneKeyTakeMail_13709_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_C2S_OneKeyTakeMail_13709_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OneKeyTakeMail_13709.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroMailMsg.C2S_OneKeyTakeMail_13709.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_C2S_OneKeyTakeMail_13709_descriptor;
         }

         public C2S_OneKeyTakeMail_13709 getDefaultInstanceForType() {
            return HeroMailMsg.C2S_OneKeyTakeMail_13709.getDefaultInstance();
         }

         public C2S_OneKeyTakeMail_13709 build() {
            C2S_OneKeyTakeMail_13709 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OneKeyTakeMail_13709 buildPartial() {
            C2S_OneKeyTakeMail_13709 result = new C2S_OneKeyTakeMail_13709(this);
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
            if (other instanceof C2S_OneKeyTakeMail_13709) {
               return this.mergeFrom((C2S_OneKeyTakeMail_13709)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OneKeyTakeMail_13709 other) {
            if (other == HeroMailMsg.C2S_OneKeyTakeMail_13709.getDefaultInstance()) {
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
            C2S_OneKeyTakeMail_13709 parsedMessage = null;

            try {
               parsedMessage = (C2S_OneKeyTakeMail_13709)HeroMailMsg.C2S_OneKeyTakeMail_13709.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OneKeyTakeMail_13709)e.getUnfinishedMessage();
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

   public static final class S2C_OneKeyTakeMail_13710 extends GeneratedMessageV3 implements S2C_OneKeyTakeMail_13710OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASKID_FIELD_NUMBER = 2;
      private Internal.IntList taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_OneKeyTakeMail_13710 DEFAULT_INSTANCE = new S2C_OneKeyTakeMail_13710();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OneKeyTakeMail_13710> PARSER = new AbstractParser<S2C_OneKeyTakeMail_13710>() {
         public S2C_OneKeyTakeMail_13710 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OneKeyTakeMail_13710(input, extensionRegistry);
         }
      };

      private S2C_OneKeyTakeMail_13710(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OneKeyTakeMail_13710() {
         this.memoizedIsInitialized = -1;
         this.taskId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OneKeyTakeMail_13710();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OneKeyTakeMail_13710(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.taskId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.taskId_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.taskId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.taskId_.addInt(input.readInt32());
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
                  this.taskId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_OneKeyTakeMail_13710_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_OneKeyTakeMail_13710_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OneKeyTakeMail_13710.class, Builder.class);
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
         for(int i = 0; i < this.taskId_.size(); ++i) {
            output.writeInt32(2, this.taskId_.getInt(i));
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

            for(int i = 0; i < this.taskId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.taskId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTaskIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OneKeyTakeMail_13710)) {
            return super.equals(obj);
         } else {
            S2C_OneKeyTakeMail_13710 other = (S2C_OneKeyTakeMail_13710)obj;
            if (!this.getTaskIdList().equals(other.getTaskIdList())) {
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
            if (this.getTaskIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTaskIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OneKeyTakeMail_13710 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyTakeMail_13710)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyTakeMail_13710 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyTakeMail_13710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyTakeMail_13710 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyTakeMail_13710)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyTakeMail_13710 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyTakeMail_13710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyTakeMail_13710 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyTakeMail_13710)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyTakeMail_13710 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyTakeMail_13710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyTakeMail_13710 parseFrom(InputStream input) throws IOException {
         return (S2C_OneKeyTakeMail_13710)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OneKeyTakeMail_13710 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyTakeMail_13710)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OneKeyTakeMail_13710 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OneKeyTakeMail_13710)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OneKeyTakeMail_13710 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyTakeMail_13710)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OneKeyTakeMail_13710 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OneKeyTakeMail_13710)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OneKeyTakeMail_13710 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyTakeMail_13710)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OneKeyTakeMail_13710 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OneKeyTakeMail_13710 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OneKeyTakeMail_13710> parser() {
         return PARSER;
      }

      public Parser<S2C_OneKeyTakeMail_13710> getParserForType() {
         return PARSER;
      }

      public S2C_OneKeyTakeMail_13710 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OneKeyTakeMail_13710OrBuilder {
         private int bitField0_;
         private Internal.IntList taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_OneKeyTakeMail_13710_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_OneKeyTakeMail_13710_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OneKeyTakeMail_13710.class, Builder.class);
         }

         private Builder() {
            this.taskId_ = HeroMailMsg.S2C_OneKeyTakeMail_13710.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.taskId_ = HeroMailMsg.S2C_OneKeyTakeMail_13710.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroMailMsg.S2C_OneKeyTakeMail_13710.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = HeroMailMsg.S2C_OneKeyTakeMail_13710.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_OneKeyTakeMail_13710_descriptor;
         }

         public S2C_OneKeyTakeMail_13710 getDefaultInstanceForType() {
            return HeroMailMsg.S2C_OneKeyTakeMail_13710.getDefaultInstance();
         }

         public S2C_OneKeyTakeMail_13710 build() {
            S2C_OneKeyTakeMail_13710 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OneKeyTakeMail_13710 buildPartial() {
            S2C_OneKeyTakeMail_13710 result = new S2C_OneKeyTakeMail_13710(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.taskId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.taskId_ = this.taskId_;
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
            if (other instanceof S2C_OneKeyTakeMail_13710) {
               return this.mergeFrom((S2C_OneKeyTakeMail_13710)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OneKeyTakeMail_13710 other) {
            if (other == HeroMailMsg.S2C_OneKeyTakeMail_13710.getDefaultInstance()) {
               return this;
            } else {
               if (!other.taskId_.isEmpty()) {
                  if (this.taskId_.isEmpty()) {
                     this.taskId_ = other.taskId_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureTaskIdIsMutable();
                     this.taskId_.addAll(other.taskId_);
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
            S2C_OneKeyTakeMail_13710 parsedMessage = null;

            try {
               parsedMessage = (S2C_OneKeyTakeMail_13710)HeroMailMsg.S2C_OneKeyTakeMail_13710.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OneKeyTakeMail_13710)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTaskIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.taskId_ = HeroMailMsg.S2C_OneKeyTakeMail_13710.mutableCopy(this.taskId_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getTaskIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.taskId_) : this.taskId_);
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
            this.taskId_ = HeroMailMsg.S2C_OneKeyTakeMail_13710.emptyIntList();
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

   public static final class S2C_UpdateMail_13722 extends GeneratedMessageV3 implements S2C_UpdateMail_13722OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<HeroMailInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateMail_13722 DEFAULT_INSTANCE = new S2C_UpdateMail_13722();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateMail_13722> PARSER = new AbstractParser<S2C_UpdateMail_13722>() {
         public S2C_UpdateMail_13722 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateMail_13722(input, extensionRegistry);
         }
      };

      private S2C_UpdateMail_13722(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateMail_13722() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateMail_13722();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateMail_13722(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.infos_.add(input.readMessage(HeroMailMsg.HeroMailInfo.PARSER, extensionRegistry));
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
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_UpdateMail_13722_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_UpdateMail_13722_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateMail_13722.class, Builder.class);
      }

      public List<HeroMailInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends HeroMailInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public HeroMailInfo getInfos(int index) {
         return (HeroMailInfo)this.infos_.get(index);
      }

      public HeroMailInfoOrBuilder getInfosOrBuilder(int index) {
         return (HeroMailInfoOrBuilder)this.infos_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.infos_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.infos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpdateMail_13722)) {
            return super.equals(obj);
         } else {
            S2C_UpdateMail_13722 other = (S2C_UpdateMail_13722)obj;
            if (!this.getInfosList().equals(other.getInfosList())) {
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
            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpdateMail_13722 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateMail_13722)PARSER.parseFrom(data);
      }

      public static S2C_UpdateMail_13722 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateMail_13722)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateMail_13722 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateMail_13722)PARSER.parseFrom(data);
      }

      public static S2C_UpdateMail_13722 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateMail_13722)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateMail_13722 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateMail_13722)PARSER.parseFrom(data);
      }

      public static S2C_UpdateMail_13722 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateMail_13722)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateMail_13722 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateMail_13722)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateMail_13722 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateMail_13722)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateMail_13722 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateMail_13722)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateMail_13722 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateMail_13722)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateMail_13722 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateMail_13722)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateMail_13722 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateMail_13722)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateMail_13722 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateMail_13722 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateMail_13722> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateMail_13722> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateMail_13722 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateMail_13722OrBuilder {
         private int bitField0_;
         private List<HeroMailInfo> infos_;
         private RepeatedFieldBuilderV3<HeroMailInfo, HeroMailInfo.Builder, HeroMailInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_UpdateMail_13722_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_UpdateMail_13722_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateMail_13722.class, Builder.class);
         }

         private Builder() {
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroMailMsg.S2C_UpdateMail_13722.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroMailMsg.internal_static_heroMail_com_gzbz_protobuf_S2C_UpdateMail_13722_descriptor;
         }

         public S2C_UpdateMail_13722 getDefaultInstanceForType() {
            return HeroMailMsg.S2C_UpdateMail_13722.getDefaultInstance();
         }

         public S2C_UpdateMail_13722 build() {
            S2C_UpdateMail_13722 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateMail_13722 buildPartial() {
            S2C_UpdateMail_13722 result = new S2C_UpdateMail_13722(this);
            int from_bitField0_ = this.bitField0_;
            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -2;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
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
            if (other instanceof S2C_UpdateMail_13722) {
               return this.mergeFrom((S2C_UpdateMail_13722)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateMail_13722 other) {
            if (other == HeroMailMsg.S2C_UpdateMail_13722.getDefaultInstance()) {
               return this;
            } else {
               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureInfosIsMutable();
                        this.infos_.addAll(other.infos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.infos_.isEmpty()) {
                  if (this.infosBuilder_.isEmpty()) {
                     this.infosBuilder_.dispose();
                     this.infosBuilder_ = null;
                     this.infos_ = other.infos_;
                     this.bitField0_ &= -2;
                     this.infosBuilder_ = HeroMailMsg.S2C_UpdateMail_13722.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpdateMail_13722 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateMail_13722)HeroMailMsg.S2C_UpdateMail_13722.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateMail_13722)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 1;
            }

         }

         public List<HeroMailInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public HeroMailInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (HeroMailInfo)this.infos_.get(index) : (HeroMailInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, HeroMailInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.set(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInfos(int index, HeroMailInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(HeroMailInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInfos(int index, HeroMailInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInfos(HeroMailInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, HeroMailInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends HeroMailInfo> values) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.infos_);
               this.onChanged();
            } else {
               this.infosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInfos() {
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Builder removeInfos(int index) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.remove(index);
               this.onChanged();
            } else {
               this.infosBuilder_.remove(index);
            }

            return this;
         }

         public HeroMailInfo.Builder getInfosBuilder(int index) {
            return (HeroMailInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public HeroMailInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (HeroMailInfoOrBuilder)this.infos_.get(index) : (HeroMailInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HeroMailInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public HeroMailInfo.Builder addInfosBuilder() {
            return (HeroMailInfo.Builder)this.getInfosFieldBuilder().addBuilder(HeroMailMsg.HeroMailInfo.getDefaultInstance());
         }

         public HeroMailInfo.Builder addInfosBuilder(int index) {
            return (HeroMailInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, HeroMailMsg.HeroMailInfo.getDefaultInstance());
         }

         public List<HeroMailInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HeroMailInfo, HeroMailInfo.Builder, HeroMailInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_OneKeyTakeMail_13709OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenUi_13701OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ReadMail_13703OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_TakeMail_13705OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface HeroMailInfoOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasState();

      int getState();

      boolean hasTaskState();

      int getTaskState();

      boolean hasMailTime();

      int getMailTime();
   }

   public interface S2C_OneKeyTakeMail_13710OrBuilder extends MessageOrBuilder {
      List<Integer> getTaskIdList();

      int getTaskIdCount();

      int getTaskId(int index);
   }

   public interface S2C_OpenUi_13702OrBuilder extends MessageOrBuilder {
      boolean hasOpenServerTime();

      int getOpenServerTime();

      boolean hasCreatePlayerTime();

      int getCreatePlayerTime();

      List<HeroMailInfo> getInfosList();

      HeroMailInfo getInfos(int index);

      int getInfosCount();

      List<? extends HeroMailInfoOrBuilder> getInfosOrBuilderList();

      HeroMailInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2C_ReadMail_13704OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_TakeMail_13706OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_UpdateMail_13722OrBuilder extends MessageOrBuilder {
      List<HeroMailInfo> getInfosList();

      HeroMailInfo getInfos(int index);

      int getInfosCount();

      List<? extends HeroMailInfoOrBuilder> getInfosOrBuilderList();

      HeroMailInfoOrBuilder getInfosOrBuilder(int index);
   }
}
