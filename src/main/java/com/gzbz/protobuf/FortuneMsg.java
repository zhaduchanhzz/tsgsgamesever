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

public final class FortuneMsg {
   private static final Descriptors.Descriptor internal_static_fortune_com_gzbz_protobuf_C2S_ActivityInfo_23701_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fortune_com_gzbz_protobuf_C2S_ActivityInfo_23701_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fortune_com_gzbz_protobuf_S2C_ActivityInfo_23702_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fortune_com_gzbz_protobuf_S2C_ActivityInfo_23702_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fortune_com_gzbz_protobuf_C2S_ReceivePointReward_23703_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fortune_com_gzbz_protobuf_C2S_ReceivePointReward_23703_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fortune_com_gzbz_protobuf_S2C_ReceivePointReward_23704_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fortune_com_gzbz_protobuf_S2C_ReceivePointReward_23704_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fortune_com_gzbz_protobuf_C2S_CommitTask_23705_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fortune_com_gzbz_protobuf_C2S_CommitTask_23705_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fortune_com_gzbz_protobuf_S2C_CommitTask_23706_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fortune_com_gzbz_protobuf_S2C_CommitTask_23706_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fortune_com_gzbz_protobuf_C2S_ActivityTaskList_23707_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fortune_com_gzbz_protobuf_C2S_ActivityTaskList_23707_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fortune_com_gzbz_protobuf_S2C_ActivityTaskList_23708_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fortune_com_gzbz_protobuf_S2C_ActivityTaskList_23708_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fortune_com_gzbz_protobuf_S2C_ActivityTaskNotify_23709_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fortune_com_gzbz_protobuf_S2C_ActivityTaskNotify_23709_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_fortune_com_gzbz_protobuf_S2C_NotifyRechargePoint_23710_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_fortune_com_gzbz_protobuf_S2C_NotifyRechargePoint_23710_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private FortuneMsg() {
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
      String[] descriptorData = new String[]{"\n\rFortune.proto\u0012\u0019fortune.com.gzbz.protobuf\u001a\u000eactivity.proto\"\u0018\n\u0016C2S_ActivityInfo_23701\"j\n\u0016S2C_ActivityInfo_23702\u0012\u000f\n\u0007openDay\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bactivityDay\u0018\u0002 \u0002(\u0005\u0012\u0015\n\rrechargeTotal\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000bpointReward\u0018\u0004 \u0003(\u0005\"*\n\u001cC2S_ReceivePointReward_23703\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"3\n\u001cS2C_ReceivePointReward_23704\u0012\u0013\n\u000bpointReward\u0018\u0001 \u0003(\u0005\"&\n\u0014C2S_CommitTask_23705\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"&\n\u0014S2C_CommitTask_23706\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"\u001c\n\u001aC2S_ActivityTaskList_23707\"P\n\u001aS2C_ActivityTaskList_23708\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"R\n\u001cS2C_ActivityTaskNotify_23709\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"6\n\u001dS2C_NotifyRechargePoint_23710\u0012\u0015\n\rrechargeTotal\u0018\u0003 \u0002(\u0005B!\n\u0011com.gzbz.protobufB\nFortuneMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{ActivityMsg.getDescriptor()});
      internal_static_fortune_com_gzbz_protobuf_C2S_ActivityInfo_23701_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_fortune_com_gzbz_protobuf_C2S_ActivityInfo_23701_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fortune_com_gzbz_protobuf_C2S_ActivityInfo_23701_descriptor, new String[0]);
      internal_static_fortune_com_gzbz_protobuf_S2C_ActivityInfo_23702_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_fortune_com_gzbz_protobuf_S2C_ActivityInfo_23702_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fortune_com_gzbz_protobuf_S2C_ActivityInfo_23702_descriptor, new String[]{"OpenDay", "ActivityDay", "RechargeTotal", "PointReward"});
      internal_static_fortune_com_gzbz_protobuf_C2S_ReceivePointReward_23703_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_fortune_com_gzbz_protobuf_C2S_ReceivePointReward_23703_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fortune_com_gzbz_protobuf_C2S_ReceivePointReward_23703_descriptor, new String[]{"Id"});
      internal_static_fortune_com_gzbz_protobuf_S2C_ReceivePointReward_23704_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_fortune_com_gzbz_protobuf_S2C_ReceivePointReward_23704_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fortune_com_gzbz_protobuf_S2C_ReceivePointReward_23704_descriptor, new String[]{"PointReward"});
      internal_static_fortune_com_gzbz_protobuf_C2S_CommitTask_23705_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_fortune_com_gzbz_protobuf_C2S_CommitTask_23705_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fortune_com_gzbz_protobuf_C2S_CommitTask_23705_descriptor, new String[]{"TaskId"});
      internal_static_fortune_com_gzbz_protobuf_S2C_CommitTask_23706_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_fortune_com_gzbz_protobuf_S2C_CommitTask_23706_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fortune_com_gzbz_protobuf_S2C_CommitTask_23706_descriptor, new String[]{"TaskId"});
      internal_static_fortune_com_gzbz_protobuf_C2S_ActivityTaskList_23707_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_fortune_com_gzbz_protobuf_C2S_ActivityTaskList_23707_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fortune_com_gzbz_protobuf_C2S_ActivityTaskList_23707_descriptor, new String[0]);
      internal_static_fortune_com_gzbz_protobuf_S2C_ActivityTaskList_23708_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_fortune_com_gzbz_protobuf_S2C_ActivityTaskList_23708_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fortune_com_gzbz_protobuf_S2C_ActivityTaskList_23708_descriptor, new String[]{"Task"});
      internal_static_fortune_com_gzbz_protobuf_S2C_ActivityTaskNotify_23709_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_fortune_com_gzbz_protobuf_S2C_ActivityTaskNotify_23709_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fortune_com_gzbz_protobuf_S2C_ActivityTaskNotify_23709_descriptor, new String[]{"Task"});
      internal_static_fortune_com_gzbz_protobuf_S2C_NotifyRechargePoint_23710_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_fortune_com_gzbz_protobuf_S2C_NotifyRechargePoint_23710_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_fortune_com_gzbz_protobuf_S2C_NotifyRechargePoint_23710_descriptor, new String[]{"RechargeTotal"});
      ActivityMsg.getDescriptor();
   }

   public static final class C2S_ActivityInfo_23701 extends GeneratedMessageV3 implements C2S_ActivityInfo_23701OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ActivityInfo_23701 DEFAULT_INSTANCE = new C2S_ActivityInfo_23701();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActivityInfo_23701> PARSER = new AbstractParser<C2S_ActivityInfo_23701>() {
         public C2S_ActivityInfo_23701 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActivityInfo_23701(input, extensionRegistry);
         }
      };

      private C2S_ActivityInfo_23701(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActivityInfo_23701() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActivityInfo_23701();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActivityInfo_23701(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_C2S_ActivityInfo_23701_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_C2S_ActivityInfo_23701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_23701.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ActivityInfo_23701)) {
            return super.equals(obj);
         } else {
            C2S_ActivityInfo_23701 other = (C2S_ActivityInfo_23701)obj;
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

      public static C2S_ActivityInfo_23701 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_23701)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_23701 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_23701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_23701 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_23701)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_23701 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_23701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_23701 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_23701)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_23701 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_23701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_23701 parseFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_23701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_23701 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_23701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_23701 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_23701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_23701 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_23701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_23701 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActivityInfo_23701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_23701 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_23701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActivityInfo_23701 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActivityInfo_23701 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActivityInfo_23701> parser() {
         return PARSER;
      }

      public Parser<C2S_ActivityInfo_23701> getParserForType() {
         return PARSER;
      }

      public C2S_ActivityInfo_23701 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActivityInfo_23701OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_C2S_ActivityInfo_23701_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_C2S_ActivityInfo_23701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_23701.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FortuneMsg.C2S_ActivityInfo_23701.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_C2S_ActivityInfo_23701_descriptor;
         }

         public C2S_ActivityInfo_23701 getDefaultInstanceForType() {
            return FortuneMsg.C2S_ActivityInfo_23701.getDefaultInstance();
         }

         public C2S_ActivityInfo_23701 build() {
            C2S_ActivityInfo_23701 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActivityInfo_23701 buildPartial() {
            C2S_ActivityInfo_23701 result = new C2S_ActivityInfo_23701(this);
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
            if (other instanceof C2S_ActivityInfo_23701) {
               return this.mergeFrom((C2S_ActivityInfo_23701)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActivityInfo_23701 other) {
            if (other == FortuneMsg.C2S_ActivityInfo_23701.getDefaultInstance()) {
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
            C2S_ActivityInfo_23701 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActivityInfo_23701)FortuneMsg.C2S_ActivityInfo_23701.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActivityInfo_23701)e.getUnfinishedMessage();
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

   public static final class S2C_ActivityInfo_23702 extends GeneratedMessageV3 implements S2C_ActivityInfo_23702OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OPENDAY_FIELD_NUMBER = 1;
      private int openDay_;
      public static final int ACTIVITYDAY_FIELD_NUMBER = 2;
      private int activityDay_;
      public static final int RECHARGETOTAL_FIELD_NUMBER = 3;
      private int rechargeTotal_;
      public static final int POINTREWARD_FIELD_NUMBER = 4;
      private Internal.IntList pointReward_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivityInfo_23702 DEFAULT_INSTANCE = new S2C_ActivityInfo_23702();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivityInfo_23702> PARSER = new AbstractParser<S2C_ActivityInfo_23702>() {
         public S2C_ActivityInfo_23702 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivityInfo_23702(input, extensionRegistry);
         }
      };

      private S2C_ActivityInfo_23702(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivityInfo_23702() {
         this.memoizedIsInitialized = -1;
         this.pointReward_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivityInfo_23702();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivityInfo_23702(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.openDay_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.activityDay_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.rechargeTotal_ = input.readInt32();
                        break;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.pointReward_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.pointReward_.addInt(input.readInt32());
                        break;
                     case 34:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.pointReward_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.pointReward_.addInt(input.readInt32());
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
               if ((mutable_bitField0_ & 8) != 0) {
                  this.pointReward_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_ActivityInfo_23702_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_ActivityInfo_23702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_23702.class, Builder.class);
      }

      public boolean hasOpenDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getOpenDay() {
         return this.openDay_;
      }

      public boolean hasActivityDay() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getActivityDay() {
         return this.activityDay_;
      }

      public boolean hasRechargeTotal() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getRechargeTotal() {
         return this.rechargeTotal_;
      }

      public List<Integer> getPointRewardList() {
         return this.pointReward_;
      }

      public int getPointRewardCount() {
         return this.pointReward_.size();
      }

      public int getPointReward(int index) {
         return this.pointReward_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasOpenDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasActivityDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRechargeTotal()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.openDay_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.activityDay_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.rechargeTotal_);
         }

         for(int i = 0; i < this.pointReward_.size(); ++i) {
            output.writeInt32(4, this.pointReward_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.openDay_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.activityDay_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.rechargeTotal_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.pointReward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.pointReward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPointRewardList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ActivityInfo_23702)) {
            return super.equals(obj);
         } else {
            S2C_ActivityInfo_23702 other = (S2C_ActivityInfo_23702)obj;
            if (this.hasOpenDay() != other.hasOpenDay()) {
               return false;
            } else if (this.hasOpenDay() && this.getOpenDay() != other.getOpenDay()) {
               return false;
            } else if (this.hasActivityDay() != other.hasActivityDay()) {
               return false;
            } else if (this.hasActivityDay() && this.getActivityDay() != other.getActivityDay()) {
               return false;
            } else if (this.hasRechargeTotal() != other.hasRechargeTotal()) {
               return false;
            } else if (this.hasRechargeTotal() && this.getRechargeTotal() != other.getRechargeTotal()) {
               return false;
            } else if (!this.getPointRewardList().equals(other.getPointRewardList())) {
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
            if (this.hasOpenDay()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOpenDay();
            }

            if (this.hasActivityDay()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getActivityDay();
            }

            if (this.hasRechargeTotal()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRechargeTotal();
            }

            if (this.getPointRewardCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPointRewardList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ActivityInfo_23702 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_23702)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_23702 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_23702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_23702 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_23702)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_23702 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_23702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_23702 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_23702)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_23702 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_23702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_23702 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_23702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_23702 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_23702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_23702 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_23702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_23702 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_23702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_23702 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivityInfo_23702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_23702 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_23702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivityInfo_23702 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivityInfo_23702 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivityInfo_23702> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivityInfo_23702> getParserForType() {
         return PARSER;
      }

      public S2C_ActivityInfo_23702 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivityInfo_23702OrBuilder {
         private int bitField0_;
         private int openDay_;
         private int activityDay_;
         private int rechargeTotal_;
         private Internal.IntList pointReward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_ActivityInfo_23702_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_ActivityInfo_23702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_23702.class, Builder.class);
         }

         private Builder() {
            this.pointReward_ = FortuneMsg.S2C_ActivityInfo_23702.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.pointReward_ = FortuneMsg.S2C_ActivityInfo_23702.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FortuneMsg.S2C_ActivityInfo_23702.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.openDay_ = 0;
            this.bitField0_ &= -2;
            this.activityDay_ = 0;
            this.bitField0_ &= -3;
            this.rechargeTotal_ = 0;
            this.bitField0_ &= -5;
            this.pointReward_ = FortuneMsg.S2C_ActivityInfo_23702.emptyIntList();
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_ActivityInfo_23702_descriptor;
         }

         public S2C_ActivityInfo_23702 getDefaultInstanceForType() {
            return FortuneMsg.S2C_ActivityInfo_23702.getDefaultInstance();
         }

         public S2C_ActivityInfo_23702 build() {
            S2C_ActivityInfo_23702 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivityInfo_23702 buildPartial() {
            S2C_ActivityInfo_23702 result = new S2C_ActivityInfo_23702(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.openDay_ = this.openDay_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.activityDay_ = this.activityDay_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.rechargeTotal_ = this.rechargeTotal_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.pointReward_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.pointReward_ = this.pointReward_;
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
            if (other instanceof S2C_ActivityInfo_23702) {
               return this.mergeFrom((S2C_ActivityInfo_23702)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivityInfo_23702 other) {
            if (other == FortuneMsg.S2C_ActivityInfo_23702.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOpenDay()) {
                  this.setOpenDay(other.getOpenDay());
               }

               if (other.hasActivityDay()) {
                  this.setActivityDay(other.getActivityDay());
               }

               if (other.hasRechargeTotal()) {
                  this.setRechargeTotal(other.getRechargeTotal());
               }

               if (!other.pointReward_.isEmpty()) {
                  if (this.pointReward_.isEmpty()) {
                     this.pointReward_ = other.pointReward_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensurePointRewardIsMutable();
                     this.pointReward_.addAll(other.pointReward_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasOpenDay()) {
               return false;
            } else if (!this.hasActivityDay()) {
               return false;
            } else {
               return this.hasRechargeTotal();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ActivityInfo_23702 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivityInfo_23702)FortuneMsg.S2C_ActivityInfo_23702.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivityInfo_23702)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOpenDay() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getOpenDay() {
            return this.openDay_;
         }

         public Builder setOpenDay(int value) {
            this.bitField0_ |= 1;
            this.openDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpenDay() {
            this.bitField0_ &= -2;
            this.openDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasActivityDay() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getActivityDay() {
            return this.activityDay_;
         }

         public Builder setActivityDay(int value) {
            this.bitField0_ |= 2;
            this.activityDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityDay() {
            this.bitField0_ &= -3;
            this.activityDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRechargeTotal() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getRechargeTotal() {
            return this.rechargeTotal_;
         }

         public Builder setRechargeTotal(int value) {
            this.bitField0_ |= 4;
            this.rechargeTotal_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRechargeTotal() {
            this.bitField0_ &= -5;
            this.rechargeTotal_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePointRewardIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.pointReward_ = FortuneMsg.S2C_ActivityInfo_23702.mutableCopy(this.pointReward_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getPointRewardList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.pointReward_) : this.pointReward_);
         }

         public int getPointRewardCount() {
            return this.pointReward_.size();
         }

         public int getPointReward(int index) {
            return this.pointReward_.getInt(index);
         }

         public Builder setPointReward(int index, int value) {
            this.ensurePointRewardIsMutable();
            this.pointReward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPointReward(int value) {
            this.ensurePointRewardIsMutable();
            this.pointReward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPointReward(Iterable<? extends Integer> values) {
            this.ensurePointRewardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.pointReward_);
            this.onChanged();
            return this;
         }

         public Builder clearPointReward() {
            this.pointReward_ = FortuneMsg.S2C_ActivityInfo_23702.emptyIntList();
            this.bitField0_ &= -9;
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

   public static final class C2S_ReceivePointReward_23703 extends GeneratedMessageV3 implements C2S_ReceivePointReward_23703OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceivePointReward_23703 DEFAULT_INSTANCE = new C2S_ReceivePointReward_23703();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceivePointReward_23703> PARSER = new AbstractParser<C2S_ReceivePointReward_23703>() {
         public C2S_ReceivePointReward_23703 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceivePointReward_23703(input, extensionRegistry);
         }
      };

      private C2S_ReceivePointReward_23703(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceivePointReward_23703() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceivePointReward_23703();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceivePointReward_23703(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_C2S_ReceivePointReward_23703_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_C2S_ReceivePointReward_23703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceivePointReward_23703.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceivePointReward_23703)) {
            return super.equals(obj);
         } else {
            C2S_ReceivePointReward_23703 other = (C2S_ReceivePointReward_23703)obj;
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

      public static C2S_ReceivePointReward_23703 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceivePointReward_23703)PARSER.parseFrom(data);
      }

      public static C2S_ReceivePointReward_23703 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceivePointReward_23703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceivePointReward_23703 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceivePointReward_23703)PARSER.parseFrom(data);
      }

      public static C2S_ReceivePointReward_23703 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceivePointReward_23703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceivePointReward_23703 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceivePointReward_23703)PARSER.parseFrom(data);
      }

      public static C2S_ReceivePointReward_23703 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceivePointReward_23703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceivePointReward_23703 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceivePointReward_23703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceivePointReward_23703 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceivePointReward_23703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceivePointReward_23703 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceivePointReward_23703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceivePointReward_23703 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceivePointReward_23703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceivePointReward_23703 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceivePointReward_23703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceivePointReward_23703 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceivePointReward_23703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceivePointReward_23703 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceivePointReward_23703 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceivePointReward_23703> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceivePointReward_23703> getParserForType() {
         return PARSER;
      }

      public C2S_ReceivePointReward_23703 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceivePointReward_23703OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_C2S_ReceivePointReward_23703_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_C2S_ReceivePointReward_23703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceivePointReward_23703.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FortuneMsg.C2S_ReceivePointReward_23703.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_C2S_ReceivePointReward_23703_descriptor;
         }

         public C2S_ReceivePointReward_23703 getDefaultInstanceForType() {
            return FortuneMsg.C2S_ReceivePointReward_23703.getDefaultInstance();
         }

         public C2S_ReceivePointReward_23703 build() {
            C2S_ReceivePointReward_23703 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceivePointReward_23703 buildPartial() {
            C2S_ReceivePointReward_23703 result = new C2S_ReceivePointReward_23703(this);
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
            if (other instanceof C2S_ReceivePointReward_23703) {
               return this.mergeFrom((C2S_ReceivePointReward_23703)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceivePointReward_23703 other) {
            if (other == FortuneMsg.C2S_ReceivePointReward_23703.getDefaultInstance()) {
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
            C2S_ReceivePointReward_23703 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceivePointReward_23703)FortuneMsg.C2S_ReceivePointReward_23703.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceivePointReward_23703)e.getUnfinishedMessage();
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

   public static final class S2C_ReceivePointReward_23704 extends GeneratedMessageV3 implements S2C_ReceivePointReward_23704OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int POINTREWARD_FIELD_NUMBER = 1;
      private Internal.IntList pointReward_;
      private byte memoizedIsInitialized;
      private static final S2C_ReceivePointReward_23704 DEFAULT_INSTANCE = new S2C_ReceivePointReward_23704();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ReceivePointReward_23704> PARSER = new AbstractParser<S2C_ReceivePointReward_23704>() {
         public S2C_ReceivePointReward_23704 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ReceivePointReward_23704(input, extensionRegistry);
         }
      };

      private S2C_ReceivePointReward_23704(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ReceivePointReward_23704() {
         this.memoizedIsInitialized = -1;
         this.pointReward_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ReceivePointReward_23704();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ReceivePointReward_23704(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.pointReward_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.pointReward_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.pointReward_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.pointReward_.addInt(input.readInt32());
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
                  this.pointReward_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_ReceivePointReward_23704_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_ReceivePointReward_23704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceivePointReward_23704.class, Builder.class);
      }

      public List<Integer> getPointRewardList() {
         return this.pointReward_;
      }

      public int getPointRewardCount() {
         return this.pointReward_.size();
      }

      public int getPointReward(int index) {
         return this.pointReward_.getInt(index);
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
         for(int i = 0; i < this.pointReward_.size(); ++i) {
            output.writeInt32(1, this.pointReward_.getInt(i));
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

            for(int i = 0; i < this.pointReward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.pointReward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPointRewardList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ReceivePointReward_23704)) {
            return super.equals(obj);
         } else {
            S2C_ReceivePointReward_23704 other = (S2C_ReceivePointReward_23704)obj;
            if (!this.getPointRewardList().equals(other.getPointRewardList())) {
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
            if (this.getPointRewardCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPointRewardList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ReceivePointReward_23704 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ReceivePointReward_23704)PARSER.parseFrom(data);
      }

      public static S2C_ReceivePointReward_23704 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceivePointReward_23704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceivePointReward_23704 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ReceivePointReward_23704)PARSER.parseFrom(data);
      }

      public static S2C_ReceivePointReward_23704 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceivePointReward_23704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceivePointReward_23704 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ReceivePointReward_23704)PARSER.parseFrom(data);
      }

      public static S2C_ReceivePointReward_23704 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceivePointReward_23704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceivePointReward_23704 parseFrom(InputStream input) throws IOException {
         return (S2C_ReceivePointReward_23704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceivePointReward_23704 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceivePointReward_23704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceivePointReward_23704 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ReceivePointReward_23704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ReceivePointReward_23704 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceivePointReward_23704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceivePointReward_23704 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ReceivePointReward_23704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceivePointReward_23704 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceivePointReward_23704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ReceivePointReward_23704 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ReceivePointReward_23704 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ReceivePointReward_23704> parser() {
         return PARSER;
      }

      public Parser<S2C_ReceivePointReward_23704> getParserForType() {
         return PARSER;
      }

      public S2C_ReceivePointReward_23704 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ReceivePointReward_23704OrBuilder {
         private int bitField0_;
         private Internal.IntList pointReward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_ReceivePointReward_23704_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_ReceivePointReward_23704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceivePointReward_23704.class, Builder.class);
         }

         private Builder() {
            this.pointReward_ = FortuneMsg.S2C_ReceivePointReward_23704.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.pointReward_ = FortuneMsg.S2C_ReceivePointReward_23704.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FortuneMsg.S2C_ReceivePointReward_23704.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.pointReward_ = FortuneMsg.S2C_ReceivePointReward_23704.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_ReceivePointReward_23704_descriptor;
         }

         public S2C_ReceivePointReward_23704 getDefaultInstanceForType() {
            return FortuneMsg.S2C_ReceivePointReward_23704.getDefaultInstance();
         }

         public S2C_ReceivePointReward_23704 build() {
            S2C_ReceivePointReward_23704 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ReceivePointReward_23704 buildPartial() {
            S2C_ReceivePointReward_23704 result = new S2C_ReceivePointReward_23704(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.pointReward_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.pointReward_ = this.pointReward_;
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
            if (other instanceof S2C_ReceivePointReward_23704) {
               return this.mergeFrom((S2C_ReceivePointReward_23704)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ReceivePointReward_23704 other) {
            if (other == FortuneMsg.S2C_ReceivePointReward_23704.getDefaultInstance()) {
               return this;
            } else {
               if (!other.pointReward_.isEmpty()) {
                  if (this.pointReward_.isEmpty()) {
                     this.pointReward_ = other.pointReward_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensurePointRewardIsMutable();
                     this.pointReward_.addAll(other.pointReward_);
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
            S2C_ReceivePointReward_23704 parsedMessage = null;

            try {
               parsedMessage = (S2C_ReceivePointReward_23704)FortuneMsg.S2C_ReceivePointReward_23704.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ReceivePointReward_23704)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensurePointRewardIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.pointReward_ = FortuneMsg.S2C_ReceivePointReward_23704.mutableCopy(this.pointReward_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getPointRewardList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.pointReward_) : this.pointReward_);
         }

         public int getPointRewardCount() {
            return this.pointReward_.size();
         }

         public int getPointReward(int index) {
            return this.pointReward_.getInt(index);
         }

         public Builder setPointReward(int index, int value) {
            this.ensurePointRewardIsMutable();
            this.pointReward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPointReward(int value) {
            this.ensurePointRewardIsMutable();
            this.pointReward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPointReward(Iterable<? extends Integer> values) {
            this.ensurePointRewardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.pointReward_);
            this.onChanged();
            return this;
         }

         public Builder clearPointReward() {
            this.pointReward_ = FortuneMsg.S2C_ReceivePointReward_23704.emptyIntList();
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

   public static final class C2S_CommitTask_23705 extends GeneratedMessageV3 implements C2S_CommitTask_23705OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_CommitTask_23705 DEFAULT_INSTANCE = new C2S_CommitTask_23705();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CommitTask_23705> PARSER = new AbstractParser<C2S_CommitTask_23705>() {
         public C2S_CommitTask_23705 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CommitTask_23705(input, extensionRegistry);
         }
      };

      private C2S_CommitTask_23705(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CommitTask_23705() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CommitTask_23705();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CommitTask_23705(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_C2S_CommitTask_23705_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_C2S_CommitTask_23705_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_23705.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CommitTask_23705)) {
            return super.equals(obj);
         } else {
            C2S_CommitTask_23705 other = (C2S_CommitTask_23705)obj;
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

      public static C2S_CommitTask_23705 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_23705)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_23705 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_23705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_23705 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_23705)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_23705 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_23705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_23705 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_23705)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_23705 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_23705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_23705 parseFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_23705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_23705 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_23705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_23705 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_23705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_23705 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_23705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_23705 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CommitTask_23705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_23705 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_23705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CommitTask_23705 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CommitTask_23705 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CommitTask_23705> parser() {
         return PARSER;
      }

      public Parser<C2S_CommitTask_23705> getParserForType() {
         return PARSER;
      }

      public C2S_CommitTask_23705 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CommitTask_23705OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_C2S_CommitTask_23705_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_C2S_CommitTask_23705_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_23705.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FortuneMsg.C2S_CommitTask_23705.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_C2S_CommitTask_23705_descriptor;
         }

         public C2S_CommitTask_23705 getDefaultInstanceForType() {
            return FortuneMsg.C2S_CommitTask_23705.getDefaultInstance();
         }

         public C2S_CommitTask_23705 build() {
            C2S_CommitTask_23705 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CommitTask_23705 buildPartial() {
            C2S_CommitTask_23705 result = new C2S_CommitTask_23705(this);
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
            if (other instanceof C2S_CommitTask_23705) {
               return this.mergeFrom((C2S_CommitTask_23705)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CommitTask_23705 other) {
            if (other == FortuneMsg.C2S_CommitTask_23705.getDefaultInstance()) {
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
            C2S_CommitTask_23705 parsedMessage = null;

            try {
               parsedMessage = (C2S_CommitTask_23705)FortuneMsg.C2S_CommitTask_23705.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CommitTask_23705)e.getUnfinishedMessage();
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

   public static final class S2C_CommitTask_23706 extends GeneratedMessageV3 implements S2C_CommitTask_23706OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_CommitTask_23706 DEFAULT_INSTANCE = new S2C_CommitTask_23706();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CommitTask_23706> PARSER = new AbstractParser<S2C_CommitTask_23706>() {
         public S2C_CommitTask_23706 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CommitTask_23706(input, extensionRegistry);
         }
      };

      private S2C_CommitTask_23706(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CommitTask_23706() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CommitTask_23706();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CommitTask_23706(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_CommitTask_23706_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_CommitTask_23706_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTask_23706.class, Builder.class);
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
         } else if (!(obj instanceof S2C_CommitTask_23706)) {
            return super.equals(obj);
         } else {
            S2C_CommitTask_23706 other = (S2C_CommitTask_23706)obj;
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

      public static S2C_CommitTask_23706 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_23706)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_23706 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_23706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_23706 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_23706)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_23706 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_23706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_23706 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_23706)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_23706 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_23706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_23706 parseFrom(InputStream input) throws IOException {
         return (S2C_CommitTask_23706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_23706 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_23706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTask_23706 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CommitTask_23706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_23706 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_23706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTask_23706 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CommitTask_23706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_23706 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_23706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CommitTask_23706 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CommitTask_23706 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CommitTask_23706> parser() {
         return PARSER;
      }

      public Parser<S2C_CommitTask_23706> getParserForType() {
         return PARSER;
      }

      public S2C_CommitTask_23706 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CommitTask_23706OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_CommitTask_23706_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_CommitTask_23706_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTask_23706.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FortuneMsg.S2C_CommitTask_23706.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_CommitTask_23706_descriptor;
         }

         public S2C_CommitTask_23706 getDefaultInstanceForType() {
            return FortuneMsg.S2C_CommitTask_23706.getDefaultInstance();
         }

         public S2C_CommitTask_23706 build() {
            S2C_CommitTask_23706 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CommitTask_23706 buildPartial() {
            S2C_CommitTask_23706 result = new S2C_CommitTask_23706(this);
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
            if (other instanceof S2C_CommitTask_23706) {
               return this.mergeFrom((S2C_CommitTask_23706)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CommitTask_23706 other) {
            if (other == FortuneMsg.S2C_CommitTask_23706.getDefaultInstance()) {
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
            S2C_CommitTask_23706 parsedMessage = null;

            try {
               parsedMessage = (S2C_CommitTask_23706)FortuneMsg.S2C_CommitTask_23706.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CommitTask_23706)e.getUnfinishedMessage();
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

   public static final class C2S_ActivityTaskList_23707 extends GeneratedMessageV3 implements C2S_ActivityTaskList_23707OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ActivityTaskList_23707 DEFAULT_INSTANCE = new C2S_ActivityTaskList_23707();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActivityTaskList_23707> PARSER = new AbstractParser<C2S_ActivityTaskList_23707>() {
         public C2S_ActivityTaskList_23707 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActivityTaskList_23707(input, extensionRegistry);
         }
      };

      private C2S_ActivityTaskList_23707(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActivityTaskList_23707() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActivityTaskList_23707();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActivityTaskList_23707(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_C2S_ActivityTaskList_23707_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_C2S_ActivityTaskList_23707_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityTaskList_23707.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ActivityTaskList_23707)) {
            return super.equals(obj);
         } else {
            C2S_ActivityTaskList_23707 other = (C2S_ActivityTaskList_23707)obj;
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

      public static C2S_ActivityTaskList_23707 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActivityTaskList_23707)PARSER.parseFrom(data);
      }

      public static C2S_ActivityTaskList_23707 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityTaskList_23707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityTaskList_23707 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActivityTaskList_23707)PARSER.parseFrom(data);
      }

      public static C2S_ActivityTaskList_23707 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityTaskList_23707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityTaskList_23707 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActivityTaskList_23707)PARSER.parseFrom(data);
      }

      public static C2S_ActivityTaskList_23707 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityTaskList_23707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityTaskList_23707 parseFrom(InputStream input) throws IOException {
         return (C2S_ActivityTaskList_23707)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityTaskList_23707 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityTaskList_23707)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityTaskList_23707 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActivityTaskList_23707)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActivityTaskList_23707 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityTaskList_23707)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityTaskList_23707 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActivityTaskList_23707)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityTaskList_23707 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityTaskList_23707)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActivityTaskList_23707 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActivityTaskList_23707 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActivityTaskList_23707> parser() {
         return PARSER;
      }

      public Parser<C2S_ActivityTaskList_23707> getParserForType() {
         return PARSER;
      }

      public C2S_ActivityTaskList_23707 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActivityTaskList_23707OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_C2S_ActivityTaskList_23707_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_C2S_ActivityTaskList_23707_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityTaskList_23707.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FortuneMsg.C2S_ActivityTaskList_23707.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_C2S_ActivityTaskList_23707_descriptor;
         }

         public C2S_ActivityTaskList_23707 getDefaultInstanceForType() {
            return FortuneMsg.C2S_ActivityTaskList_23707.getDefaultInstance();
         }

         public C2S_ActivityTaskList_23707 build() {
            C2S_ActivityTaskList_23707 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActivityTaskList_23707 buildPartial() {
            C2S_ActivityTaskList_23707 result = new C2S_ActivityTaskList_23707(this);
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
            if (other instanceof C2S_ActivityTaskList_23707) {
               return this.mergeFrom((C2S_ActivityTaskList_23707)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActivityTaskList_23707 other) {
            if (other == FortuneMsg.C2S_ActivityTaskList_23707.getDefaultInstance()) {
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
            C2S_ActivityTaskList_23707 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActivityTaskList_23707)FortuneMsg.C2S_ActivityTaskList_23707.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActivityTaskList_23707)e.getUnfinishedMessage();
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

   public static final class S2C_ActivityTaskList_23708 extends GeneratedMessageV3 implements S2C_ActivityTaskList_23708OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivityTaskList_23708 DEFAULT_INSTANCE = new S2C_ActivityTaskList_23708();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivityTaskList_23708> PARSER = new AbstractParser<S2C_ActivityTaskList_23708>() {
         public S2C_ActivityTaskList_23708 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivityTaskList_23708(input, extensionRegistry);
         }
      };

      private S2C_ActivityTaskList_23708(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivityTaskList_23708() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivityTaskList_23708();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivityTaskList_23708(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_ActivityTaskList_23708_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_ActivityTaskList_23708_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityTaskList_23708.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ActivityTaskList_23708)) {
            return super.equals(obj);
         } else {
            S2C_ActivityTaskList_23708 other = (S2C_ActivityTaskList_23708)obj;
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

      public static S2C_ActivityTaskList_23708 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskList_23708)PARSER.parseFrom(data);
      }

      public static S2C_ActivityTaskList_23708 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskList_23708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityTaskList_23708 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskList_23708)PARSER.parseFrom(data);
      }

      public static S2C_ActivityTaskList_23708 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskList_23708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityTaskList_23708 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskList_23708)PARSER.parseFrom(data);
      }

      public static S2C_ActivityTaskList_23708 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskList_23708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityTaskList_23708 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivityTaskList_23708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityTaskList_23708 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityTaskList_23708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityTaskList_23708 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivityTaskList_23708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivityTaskList_23708 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityTaskList_23708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityTaskList_23708 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivityTaskList_23708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityTaskList_23708 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityTaskList_23708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivityTaskList_23708 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivityTaskList_23708 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivityTaskList_23708> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivityTaskList_23708> getParserForType() {
         return PARSER;
      }

      public S2C_ActivityTaskList_23708 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivityTaskList_23708OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_ActivityTaskList_23708_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_ActivityTaskList_23708_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityTaskList_23708.class, Builder.class);
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
            if (FortuneMsg.S2C_ActivityTaskList_23708.alwaysUseFieldBuilders) {
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
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_ActivityTaskList_23708_descriptor;
         }

         public S2C_ActivityTaskList_23708 getDefaultInstanceForType() {
            return FortuneMsg.S2C_ActivityTaskList_23708.getDefaultInstance();
         }

         public S2C_ActivityTaskList_23708 build() {
            S2C_ActivityTaskList_23708 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivityTaskList_23708 buildPartial() {
            S2C_ActivityTaskList_23708 result = new S2C_ActivityTaskList_23708(this);
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
            if (other instanceof S2C_ActivityTaskList_23708) {
               return this.mergeFrom((S2C_ActivityTaskList_23708)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivityTaskList_23708 other) {
            if (other == FortuneMsg.S2C_ActivityTaskList_23708.getDefaultInstance()) {
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
                     this.taskBuilder_ = FortuneMsg.S2C_ActivityTaskList_23708.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_ActivityTaskList_23708 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivityTaskList_23708)FortuneMsg.S2C_ActivityTaskList_23708.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivityTaskList_23708)e.getUnfinishedMessage();
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

   public static final class S2C_ActivityTaskNotify_23709 extends GeneratedMessageV3 implements S2C_ActivityTaskNotify_23709OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivityTaskNotify_23709 DEFAULT_INSTANCE = new S2C_ActivityTaskNotify_23709();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivityTaskNotify_23709> PARSER = new AbstractParser<S2C_ActivityTaskNotify_23709>() {
         public S2C_ActivityTaskNotify_23709 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivityTaskNotify_23709(input, extensionRegistry);
         }
      };

      private S2C_ActivityTaskNotify_23709(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivityTaskNotify_23709() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivityTaskNotify_23709();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivityTaskNotify_23709(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_ActivityTaskNotify_23709_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_ActivityTaskNotify_23709_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityTaskNotify_23709.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ActivityTaskNotify_23709)) {
            return super.equals(obj);
         } else {
            S2C_ActivityTaskNotify_23709 other = (S2C_ActivityTaskNotify_23709)obj;
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

      public static S2C_ActivityTaskNotify_23709 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskNotify_23709)PARSER.parseFrom(data);
      }

      public static S2C_ActivityTaskNotify_23709 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskNotify_23709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityTaskNotify_23709 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskNotify_23709)PARSER.parseFrom(data);
      }

      public static S2C_ActivityTaskNotify_23709 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskNotify_23709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityTaskNotify_23709 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskNotify_23709)PARSER.parseFrom(data);
      }

      public static S2C_ActivityTaskNotify_23709 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityTaskNotify_23709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityTaskNotify_23709 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivityTaskNotify_23709)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityTaskNotify_23709 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityTaskNotify_23709)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityTaskNotify_23709 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivityTaskNotify_23709)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivityTaskNotify_23709 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityTaskNotify_23709)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityTaskNotify_23709 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivityTaskNotify_23709)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityTaskNotify_23709 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityTaskNotify_23709)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivityTaskNotify_23709 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivityTaskNotify_23709 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivityTaskNotify_23709> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivityTaskNotify_23709> getParserForType() {
         return PARSER;
      }

      public S2C_ActivityTaskNotify_23709 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivityTaskNotify_23709OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_ActivityTaskNotify_23709_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_ActivityTaskNotify_23709_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityTaskNotify_23709.class, Builder.class);
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
            if (FortuneMsg.S2C_ActivityTaskNotify_23709.alwaysUseFieldBuilders) {
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
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_ActivityTaskNotify_23709_descriptor;
         }

         public S2C_ActivityTaskNotify_23709 getDefaultInstanceForType() {
            return FortuneMsg.S2C_ActivityTaskNotify_23709.getDefaultInstance();
         }

         public S2C_ActivityTaskNotify_23709 build() {
            S2C_ActivityTaskNotify_23709 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivityTaskNotify_23709 buildPartial() {
            S2C_ActivityTaskNotify_23709 result = new S2C_ActivityTaskNotify_23709(this);
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
            if (other instanceof S2C_ActivityTaskNotify_23709) {
               return this.mergeFrom((S2C_ActivityTaskNotify_23709)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivityTaskNotify_23709 other) {
            if (other == FortuneMsg.S2C_ActivityTaskNotify_23709.getDefaultInstance()) {
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
                     this.taskBuilder_ = FortuneMsg.S2C_ActivityTaskNotify_23709.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_ActivityTaskNotify_23709 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivityTaskNotify_23709)FortuneMsg.S2C_ActivityTaskNotify_23709.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivityTaskNotify_23709)e.getUnfinishedMessage();
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

   public static final class S2C_NotifyRechargePoint_23710 extends GeneratedMessageV3 implements S2C_NotifyRechargePoint_23710OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECHARGETOTAL_FIELD_NUMBER = 3;
      private int rechargeTotal_;
      private byte memoizedIsInitialized;
      private static final S2C_NotifyRechargePoint_23710 DEFAULT_INSTANCE = new S2C_NotifyRechargePoint_23710();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NotifyRechargePoint_23710> PARSER = new AbstractParser<S2C_NotifyRechargePoint_23710>() {
         public S2C_NotifyRechargePoint_23710 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NotifyRechargePoint_23710(input, extensionRegistry);
         }
      };

      private S2C_NotifyRechargePoint_23710(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NotifyRechargePoint_23710() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NotifyRechargePoint_23710();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NotifyRechargePoint_23710(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rechargeTotal_ = input.readInt32();
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
         return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_NotifyRechargePoint_23710_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_NotifyRechargePoint_23710_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NotifyRechargePoint_23710.class, Builder.class);
      }

      public boolean hasRechargeTotal() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRechargeTotal() {
         return this.rechargeTotal_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRechargeTotal()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(3, this.rechargeTotal_);
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
               size += CodedOutputStream.computeInt32Size(3, this.rechargeTotal_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_NotifyRechargePoint_23710)) {
            return super.equals(obj);
         } else {
            S2C_NotifyRechargePoint_23710 other = (S2C_NotifyRechargePoint_23710)obj;
            if (this.hasRechargeTotal() != other.hasRechargeTotal()) {
               return false;
            } else if (this.hasRechargeTotal() && this.getRechargeTotal() != other.getRechargeTotal()) {
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
            if (this.hasRechargeTotal()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRechargeTotal();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_NotifyRechargePoint_23710 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NotifyRechargePoint_23710)PARSER.parseFrom(data);
      }

      public static S2C_NotifyRechargePoint_23710 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NotifyRechargePoint_23710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NotifyRechargePoint_23710 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NotifyRechargePoint_23710)PARSER.parseFrom(data);
      }

      public static S2C_NotifyRechargePoint_23710 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NotifyRechargePoint_23710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NotifyRechargePoint_23710 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NotifyRechargePoint_23710)PARSER.parseFrom(data);
      }

      public static S2C_NotifyRechargePoint_23710 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NotifyRechargePoint_23710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NotifyRechargePoint_23710 parseFrom(InputStream input) throws IOException {
         return (S2C_NotifyRechargePoint_23710)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NotifyRechargePoint_23710 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NotifyRechargePoint_23710)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NotifyRechargePoint_23710 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NotifyRechargePoint_23710)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NotifyRechargePoint_23710 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NotifyRechargePoint_23710)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NotifyRechargePoint_23710 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NotifyRechargePoint_23710)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NotifyRechargePoint_23710 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NotifyRechargePoint_23710)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NotifyRechargePoint_23710 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NotifyRechargePoint_23710 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NotifyRechargePoint_23710> parser() {
         return PARSER;
      }

      public Parser<S2C_NotifyRechargePoint_23710> getParserForType() {
         return PARSER;
      }

      public S2C_NotifyRechargePoint_23710 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NotifyRechargePoint_23710OrBuilder {
         private int bitField0_;
         private int rechargeTotal_;

         public static final Descriptors.Descriptor getDescriptor() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_NotifyRechargePoint_23710_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_NotifyRechargePoint_23710_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NotifyRechargePoint_23710.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FortuneMsg.S2C_NotifyRechargePoint_23710.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rechargeTotal_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return FortuneMsg.internal_static_fortune_com_gzbz_protobuf_S2C_NotifyRechargePoint_23710_descriptor;
         }

         public S2C_NotifyRechargePoint_23710 getDefaultInstanceForType() {
            return FortuneMsg.S2C_NotifyRechargePoint_23710.getDefaultInstance();
         }

         public S2C_NotifyRechargePoint_23710 build() {
            S2C_NotifyRechargePoint_23710 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NotifyRechargePoint_23710 buildPartial() {
            S2C_NotifyRechargePoint_23710 result = new S2C_NotifyRechargePoint_23710(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rechargeTotal_ = this.rechargeTotal_;
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
            if (other instanceof S2C_NotifyRechargePoint_23710) {
               return this.mergeFrom((S2C_NotifyRechargePoint_23710)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NotifyRechargePoint_23710 other) {
            if (other == FortuneMsg.S2C_NotifyRechargePoint_23710.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRechargeTotal()) {
                  this.setRechargeTotal(other.getRechargeTotal());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRechargeTotal();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_NotifyRechargePoint_23710 parsedMessage = null;

            try {
               parsedMessage = (S2C_NotifyRechargePoint_23710)FortuneMsg.S2C_NotifyRechargePoint_23710.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NotifyRechargePoint_23710)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRechargeTotal() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRechargeTotal() {
            return this.rechargeTotal_;
         }

         public Builder setRechargeTotal(int value) {
            this.bitField0_ |= 1;
            this.rechargeTotal_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRechargeTotal() {
            this.bitField0_ &= -2;
            this.rechargeTotal_ = 0;
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

   public interface C2S_ActivityInfo_23701OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ActivityTaskList_23707OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_CommitTask_23705OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_ReceivePointReward_23703OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_ActivityInfo_23702OrBuilder extends MessageOrBuilder {
      boolean hasOpenDay();

      int getOpenDay();

      boolean hasActivityDay();

      int getActivityDay();

      boolean hasRechargeTotal();

      int getRechargeTotal();

      List<Integer> getPointRewardList();

      int getPointRewardCount();

      int getPointReward(int index);
   }

   public interface S2C_ActivityTaskList_23708OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_ActivityTaskNotify_23709OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_CommitTask_23706OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_NotifyRechargePoint_23710OrBuilder extends MessageOrBuilder {
      boolean hasRechargeTotal();

      int getRechargeTotal();
   }

   public interface S2C_ReceivePointReward_23704OrBuilder extends MessageOrBuilder {
      List<Integer> getPointRewardList();

      int getPointRewardCount();

      int getPointReward(int index);
   }
}
