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

public final class ActivityLampMsg {
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_RewardRecordData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_RewardRecordData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_C2S_Main_15501_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_C2S_Main_15501_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_S2C_Main_15502_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_S2C_Main_15502_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_C2S_GetReward_15503_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_C2S_GetReward_15503_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_S2C_GetReward_15504_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_S2C_GetReward_15504_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_C2S_RewardRecord_15505_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_C2S_RewardRecord_15505_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_midAutumn_com_gzbz_protobuf_S2C_RewardRecord_15506_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_midAutumn_com_gzbz_protobuf_S2C_RewardRecord_15506_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ActivityLampMsg() {
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
      String[] descriptorData = new String[]{"\n\u0012ActivityLamp.proto\u0012\u001bmidAutumn.com.gzbz.protobuf\"I\n\u0010RewardRecordData\u0012\f\n\u0004head\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0002 \u0002(\t\u0012\u000b\n\u0003num\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004time\u0018\u0004 \u0002(\u0005\"\u0010\n\u000eC2S_Main_15501\"\"\n\u000eS2C_Main_15502\u0012\u0010\n\bgotTimes\u0018\u0001 \u0002(\u0005\"!\n\u0013C2S_GetReward_15503\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"3\n\u0013S2C_GetReward_15504\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bgotTimes\u0018\u0002 \u0002(\u0005\"\u0018\n\u0016C2S_RewardRecord_15505\"[\n\u0016S2C_RewardRecord_15506\u0012A\n\nrecordData\u0018\u0001 \u0003(\u000b2-.midAutumn.com.gzbz.protobuf.RewardRecordDataB&\n\u0011com.gzbz.protobufB\u000fActivityLampMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_midAutumn_com_gzbz_protobuf_RewardRecordData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_midAutumn_com_gzbz_protobuf_RewardRecordData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_RewardRecordData_descriptor, new String[]{"Head", "Name", "Num", "Time"});
      internal_static_midAutumn_com_gzbz_protobuf_C2S_Main_15501_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_midAutumn_com_gzbz_protobuf_C2S_Main_15501_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_C2S_Main_15501_descriptor, new String[0]);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_Main_15502_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_Main_15502_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_S2C_Main_15502_descriptor, new String[]{"GotTimes"});
      internal_static_midAutumn_com_gzbz_protobuf_C2S_GetReward_15503_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_midAutumn_com_gzbz_protobuf_C2S_GetReward_15503_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_C2S_GetReward_15503_descriptor, new String[]{"Id"});
      internal_static_midAutumn_com_gzbz_protobuf_S2C_GetReward_15504_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_GetReward_15504_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_S2C_GetReward_15504_descriptor, new String[]{"Id", "GotTimes"});
      internal_static_midAutumn_com_gzbz_protobuf_C2S_RewardRecord_15505_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_midAutumn_com_gzbz_protobuf_C2S_RewardRecord_15505_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_C2S_RewardRecord_15505_descriptor, new String[0]);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_RewardRecord_15506_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_midAutumn_com_gzbz_protobuf_S2C_RewardRecord_15506_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_midAutumn_com_gzbz_protobuf_S2C_RewardRecord_15506_descriptor, new String[]{"RecordData"});
   }

   public static final class RewardRecordData extends GeneratedMessageV3 implements RewardRecordDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEAD_FIELD_NUMBER = 1;
      private int head_;
      public static final int NAME_FIELD_NUMBER = 2;
      private volatile Object name_;
      public static final int NUM_FIELD_NUMBER = 3;
      private int num_;
      public static final int TIME_FIELD_NUMBER = 4;
      private int time_;
      private byte memoizedIsInitialized;
      private static final RewardRecordData DEFAULT_INSTANCE = new RewardRecordData();
      /** @deprecated */
      @Deprecated
      public static final Parser<RewardRecordData> PARSER = new AbstractParser<RewardRecordData>() {
         public RewardRecordData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RewardRecordData(input, extensionRegistry);
         }
      };

      private RewardRecordData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RewardRecordData() {
         this.memoizedIsInitialized = -1;
         this.name_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RewardRecordData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RewardRecordData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.head_ = input.readInt32();
                        break;
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.name_ = bs;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.num_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.time_ = input.readInt32();
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
         return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_RewardRecordData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_RewardRecordData_fieldAccessorTable.ensureFieldAccessorsInitialized(RewardRecordData.class, Builder.class);
      }

      public boolean hasHead() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasName() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getName() {
         Object ref = this.name_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.name_ = s;
            }

            return s;
         }
      }

      public ByteString getNameBytes() {
         Object ref = this.name_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.name_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public boolean hasTime() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getTime() {
         return this.time_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.head_);
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.name_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.num_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.time_);
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
               size += CodedOutputStream.computeInt32Size(1, this.head_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(2, this.name_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.num_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.time_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RewardRecordData)) {
            return super.equals(obj);
         } else {
            RewardRecordData other = (RewardRecordData)obj;
            if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasName() != other.hasName()) {
               return false;
            } else if (this.hasName() && !this.getName().equals(other.getName())) {
               return false;
            } else if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
               return false;
            } else if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
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
            if (this.hasHead()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasName()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getName().hashCode();
            }

            if (this.hasNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getNum();
            }

            if (this.hasTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RewardRecordData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RewardRecordData)PARSER.parseFrom(data);
      }

      public static RewardRecordData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RewardRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RewardRecordData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RewardRecordData)PARSER.parseFrom(data);
      }

      public static RewardRecordData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RewardRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RewardRecordData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RewardRecordData)PARSER.parseFrom(data);
      }

      public static RewardRecordData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RewardRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RewardRecordData parseFrom(InputStream input) throws IOException {
         return (RewardRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RewardRecordData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RewardRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RewardRecordData parseDelimitedFrom(InputStream input) throws IOException {
         return (RewardRecordData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RewardRecordData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RewardRecordData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RewardRecordData parseFrom(CodedInputStream input) throws IOException {
         return (RewardRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RewardRecordData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RewardRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RewardRecordData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RewardRecordData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RewardRecordData> parser() {
         return PARSER;
      }

      public Parser<RewardRecordData> getParserForType() {
         return PARSER;
      }

      public RewardRecordData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RewardRecordDataOrBuilder {
         private int bitField0_;
         private int head_;
         private Object name_;
         private int num_;
         private int time_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_RewardRecordData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_RewardRecordData_fieldAccessorTable.ensureFieldAccessorsInitialized(RewardRecordData.class, Builder.class);
         }

         private Builder() {
            this.name_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.name_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityLampMsg.RewardRecordData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.head_ = 0;
            this.bitField0_ &= -2;
            this.name_ = "";
            this.bitField0_ &= -3;
            this.num_ = 0;
            this.bitField0_ &= -5;
            this.time_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_RewardRecordData_descriptor;
         }

         public RewardRecordData getDefaultInstanceForType() {
            return ActivityLampMsg.RewardRecordData.getDefaultInstance();
         }

         public RewardRecordData build() {
            RewardRecordData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RewardRecordData buildPartial() {
            RewardRecordData result = new RewardRecordData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.name_ = this.name_;
            if ((from_bitField0_ & 4) != 0) {
               result.num_ = this.num_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.time_ = this.time_;
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
            if (other instanceof RewardRecordData) {
               return this.mergeFrom((RewardRecordData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RewardRecordData other) {
            if (other == ActivityLampMsg.RewardRecordData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasName()) {
                  this.bitField0_ |= 2;
                  this.name_ = other.name_;
                  this.onChanged();
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               if (other.hasTime()) {
                  this.setTime(other.getTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHead()) {
               return false;
            } else if (!this.hasName()) {
               return false;
            } else if (!this.hasNum()) {
               return false;
            } else {
               return this.hasTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RewardRecordData parsedMessage = null;

            try {
               parsedMessage = (RewardRecordData)ActivityLampMsg.RewardRecordData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RewardRecordData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHead() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHead() {
            return this.head_;
         }

         public Builder setHead(int value) {
            this.bitField0_ |= 1;
            this.head_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHead() {
            this.bitField0_ &= -2;
            this.head_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasName() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getName() {
            Object ref = this.name_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.name_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getNameBytes() {
            Object ref = this.name_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.name_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.name_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearName() {
            this.bitField0_ &= -3;
            this.name_ = ActivityLampMsg.RewardRecordData.getDefaultInstance().getName();
            this.onChanged();
            return this;
         }

         public Builder setNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.name_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 4;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -5;
            this.num_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTime() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getTime() {
            return this.time_;
         }

         public Builder setTime(int value) {
            this.bitField0_ |= 8;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -9;
            this.time_ = 0;
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

   public static final class C2S_Main_15501 extends GeneratedMessageV3 implements C2S_Main_15501OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Main_15501 DEFAULT_INSTANCE = new C2S_Main_15501();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Main_15501> PARSER = new AbstractParser<C2S_Main_15501>() {
         public C2S_Main_15501 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Main_15501(input, extensionRegistry);
         }
      };

      private C2S_Main_15501(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Main_15501() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Main_15501();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Main_15501(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_Main_15501_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_Main_15501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_15501.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Main_15501)) {
            return super.equals(obj);
         } else {
            C2S_Main_15501 other = (C2S_Main_15501)obj;
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

      public static C2S_Main_15501 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Main_15501)PARSER.parseFrom(data);
      }

      public static C2S_Main_15501 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_15501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_15501 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Main_15501)PARSER.parseFrom(data);
      }

      public static C2S_Main_15501 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_15501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_15501 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Main_15501)PARSER.parseFrom(data);
      }

      public static C2S_Main_15501 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_15501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_15501 parseFrom(InputStream input) throws IOException {
         return (C2S_Main_15501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_15501 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_15501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_15501 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Main_15501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Main_15501 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_15501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_15501 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Main_15501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_15501 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_15501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Main_15501 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Main_15501 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Main_15501> parser() {
         return PARSER;
      }

      public Parser<C2S_Main_15501> getParserForType() {
         return PARSER;
      }

      public C2S_Main_15501 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Main_15501OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_Main_15501_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_Main_15501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_15501.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityLampMsg.C2S_Main_15501.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_Main_15501_descriptor;
         }

         public C2S_Main_15501 getDefaultInstanceForType() {
            return ActivityLampMsg.C2S_Main_15501.getDefaultInstance();
         }

         public C2S_Main_15501 build() {
            C2S_Main_15501 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Main_15501 buildPartial() {
            C2S_Main_15501 result = new C2S_Main_15501(this);
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
            if (other instanceof C2S_Main_15501) {
               return this.mergeFrom((C2S_Main_15501)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Main_15501 other) {
            if (other == ActivityLampMsg.C2S_Main_15501.getDefaultInstance()) {
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
            C2S_Main_15501 parsedMessage = null;

            try {
               parsedMessage = (C2S_Main_15501)ActivityLampMsg.C2S_Main_15501.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Main_15501)e.getUnfinishedMessage();
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

   public static final class S2C_Main_15502 extends GeneratedMessageV3 implements S2C_Main_15502OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GOTTIMES_FIELD_NUMBER = 1;
      private int gotTimes_;
      private byte memoizedIsInitialized;
      private static final S2C_Main_15502 DEFAULT_INSTANCE = new S2C_Main_15502();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Main_15502> PARSER = new AbstractParser<S2C_Main_15502>() {
         public S2C_Main_15502 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Main_15502(input, extensionRegistry);
         }
      };

      private S2C_Main_15502(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Main_15502() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Main_15502();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Main_15502(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.gotTimes_ = input.readInt32();
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
         return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_Main_15502_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_Main_15502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Main_15502.class, Builder.class);
      }

      public boolean hasGotTimes() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGotTimes() {
         return this.gotTimes_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGotTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.gotTimes_);
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
               size += CodedOutputStream.computeInt32Size(1, this.gotTimes_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Main_15502)) {
            return super.equals(obj);
         } else {
            S2C_Main_15502 other = (S2C_Main_15502)obj;
            if (this.hasGotTimes() != other.hasGotTimes()) {
               return false;
            } else if (this.hasGotTimes() && this.getGotTimes() != other.getGotTimes()) {
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
            if (this.hasGotTimes()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGotTimes();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Main_15502 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Main_15502)PARSER.parseFrom(data);
      }

      public static S2C_Main_15502 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_15502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_15502 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Main_15502)PARSER.parseFrom(data);
      }

      public static S2C_Main_15502 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_15502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_15502 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Main_15502)PARSER.parseFrom(data);
      }

      public static S2C_Main_15502 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_15502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_15502 parseFrom(InputStream input) throws IOException {
         return (S2C_Main_15502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Main_15502 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_15502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Main_15502 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Main_15502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Main_15502 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_15502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Main_15502 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Main_15502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Main_15502 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_15502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Main_15502 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Main_15502 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Main_15502> parser() {
         return PARSER;
      }

      public Parser<S2C_Main_15502> getParserForType() {
         return PARSER;
      }

      public S2C_Main_15502 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Main_15502OrBuilder {
         private int bitField0_;
         private int gotTimes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_Main_15502_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_Main_15502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Main_15502.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityLampMsg.S2C_Main_15502.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.gotTimes_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_Main_15502_descriptor;
         }

         public S2C_Main_15502 getDefaultInstanceForType() {
            return ActivityLampMsg.S2C_Main_15502.getDefaultInstance();
         }

         public S2C_Main_15502 build() {
            S2C_Main_15502 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Main_15502 buildPartial() {
            S2C_Main_15502 result = new S2C_Main_15502(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.gotTimes_ = this.gotTimes_;
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
            if (other instanceof S2C_Main_15502) {
               return this.mergeFrom((S2C_Main_15502)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Main_15502 other) {
            if (other == ActivityLampMsg.S2C_Main_15502.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGotTimes()) {
                  this.setGotTimes(other.getGotTimes());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGotTimes();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Main_15502 parsedMessage = null;

            try {
               parsedMessage = (S2C_Main_15502)ActivityLampMsg.S2C_Main_15502.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Main_15502)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGotTimes() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGotTimes() {
            return this.gotTimes_;
         }

         public Builder setGotTimes(int value) {
            this.bitField0_ |= 1;
            this.gotTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGotTimes() {
            this.bitField0_ &= -2;
            this.gotTimes_ = 0;
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

   public static final class C2S_GetReward_15503 extends GeneratedMessageV3 implements C2S_GetReward_15503OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_GetReward_15503 DEFAULT_INSTANCE = new C2S_GetReward_15503();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GetReward_15503> PARSER = new AbstractParser<C2S_GetReward_15503>() {
         public C2S_GetReward_15503 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GetReward_15503(input, extensionRegistry);
         }
      };

      private C2S_GetReward_15503(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GetReward_15503() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GetReward_15503();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GetReward_15503(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_GetReward_15503_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_GetReward_15503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetReward_15503.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GetReward_15503)) {
            return super.equals(obj);
         } else {
            C2S_GetReward_15503 other = (C2S_GetReward_15503)obj;
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

      public static C2S_GetReward_15503 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GetReward_15503)PARSER.parseFrom(data);
      }

      public static C2S_GetReward_15503 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetReward_15503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetReward_15503 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GetReward_15503)PARSER.parseFrom(data);
      }

      public static C2S_GetReward_15503 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetReward_15503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetReward_15503 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GetReward_15503)PARSER.parseFrom(data);
      }

      public static C2S_GetReward_15503 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetReward_15503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetReward_15503 parseFrom(InputStream input) throws IOException {
         return (C2S_GetReward_15503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetReward_15503 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetReward_15503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetReward_15503 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GetReward_15503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GetReward_15503 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetReward_15503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetReward_15503 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GetReward_15503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetReward_15503 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetReward_15503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GetReward_15503 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GetReward_15503 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GetReward_15503> parser() {
         return PARSER;
      }

      public Parser<C2S_GetReward_15503> getParserForType() {
         return PARSER;
      }

      public C2S_GetReward_15503 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GetReward_15503OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_GetReward_15503_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_GetReward_15503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetReward_15503.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityLampMsg.C2S_GetReward_15503.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_GetReward_15503_descriptor;
         }

         public C2S_GetReward_15503 getDefaultInstanceForType() {
            return ActivityLampMsg.C2S_GetReward_15503.getDefaultInstance();
         }

         public C2S_GetReward_15503 build() {
            C2S_GetReward_15503 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GetReward_15503 buildPartial() {
            C2S_GetReward_15503 result = new C2S_GetReward_15503(this);
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
            if (other instanceof C2S_GetReward_15503) {
               return this.mergeFrom((C2S_GetReward_15503)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GetReward_15503 other) {
            if (other == ActivityLampMsg.C2S_GetReward_15503.getDefaultInstance()) {
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
            C2S_GetReward_15503 parsedMessage = null;

            try {
               parsedMessage = (C2S_GetReward_15503)ActivityLampMsg.C2S_GetReward_15503.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GetReward_15503)e.getUnfinishedMessage();
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

   public static final class S2C_GetReward_15504 extends GeneratedMessageV3 implements S2C_GetReward_15504OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int GOTTIMES_FIELD_NUMBER = 2;
      private int gotTimes_;
      private byte memoizedIsInitialized;
      private static final S2C_GetReward_15504 DEFAULT_INSTANCE = new S2C_GetReward_15504();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GetReward_15504> PARSER = new AbstractParser<S2C_GetReward_15504>() {
         public S2C_GetReward_15504 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GetReward_15504(input, extensionRegistry);
         }
      };

      private S2C_GetReward_15504(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GetReward_15504() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GetReward_15504();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GetReward_15504(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.gotTimes_ = input.readInt32();
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
         return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_GetReward_15504_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_GetReward_15504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetReward_15504.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasGotTimes() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getGotTimes() {
         return this.gotTimes_;
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
         } else if (!this.hasGotTimes()) {
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
            output.writeInt32(2, this.gotTimes_);
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
               size += CodedOutputStream.computeInt32Size(2, this.gotTimes_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GetReward_15504)) {
            return super.equals(obj);
         } else {
            S2C_GetReward_15504 other = (S2C_GetReward_15504)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasGotTimes() != other.hasGotTimes()) {
               return false;
            } else if (this.hasGotTimes() && this.getGotTimes() != other.getGotTimes()) {
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

            if (this.hasGotTimes()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGotTimes();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GetReward_15504 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GetReward_15504)PARSER.parseFrom(data);
      }

      public static S2C_GetReward_15504 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetReward_15504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetReward_15504 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GetReward_15504)PARSER.parseFrom(data);
      }

      public static S2C_GetReward_15504 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetReward_15504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetReward_15504 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GetReward_15504)PARSER.parseFrom(data);
      }

      public static S2C_GetReward_15504 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetReward_15504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetReward_15504 parseFrom(InputStream input) throws IOException {
         return (S2C_GetReward_15504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetReward_15504 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetReward_15504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetReward_15504 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GetReward_15504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GetReward_15504 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetReward_15504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetReward_15504 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GetReward_15504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetReward_15504 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetReward_15504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GetReward_15504 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GetReward_15504 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GetReward_15504> parser() {
         return PARSER;
      }

      public Parser<S2C_GetReward_15504> getParserForType() {
         return PARSER;
      }

      public S2C_GetReward_15504 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GetReward_15504OrBuilder {
         private int bitField0_;
         private int id_;
         private int gotTimes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_GetReward_15504_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_GetReward_15504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetReward_15504.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityLampMsg.S2C_GetReward_15504.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.gotTimes_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_GetReward_15504_descriptor;
         }

         public S2C_GetReward_15504 getDefaultInstanceForType() {
            return ActivityLampMsg.S2C_GetReward_15504.getDefaultInstance();
         }

         public S2C_GetReward_15504 build() {
            S2C_GetReward_15504 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GetReward_15504 buildPartial() {
            S2C_GetReward_15504 result = new S2C_GetReward_15504(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.gotTimes_ = this.gotTimes_;
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
            if (other instanceof S2C_GetReward_15504) {
               return this.mergeFrom((S2C_GetReward_15504)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GetReward_15504 other) {
            if (other == ActivityLampMsg.S2C_GetReward_15504.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasGotTimes()) {
                  this.setGotTimes(other.getGotTimes());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else {
               return this.hasGotTimes();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GetReward_15504 parsedMessage = null;

            try {
               parsedMessage = (S2C_GetReward_15504)ActivityLampMsg.S2C_GetReward_15504.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GetReward_15504)e.getUnfinishedMessage();
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

         public boolean hasGotTimes() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getGotTimes() {
            return this.gotTimes_;
         }

         public Builder setGotTimes(int value) {
            this.bitField0_ |= 2;
            this.gotTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGotTimes() {
            this.bitField0_ &= -3;
            this.gotTimes_ = 0;
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

   public static final class C2S_RewardRecord_15505 extends GeneratedMessageV3 implements C2S_RewardRecord_15505OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_RewardRecord_15505 DEFAULT_INSTANCE = new C2S_RewardRecord_15505();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RewardRecord_15505> PARSER = new AbstractParser<C2S_RewardRecord_15505>() {
         public C2S_RewardRecord_15505 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RewardRecord_15505(input, extensionRegistry);
         }
      };

      private C2S_RewardRecord_15505(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RewardRecord_15505() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RewardRecord_15505();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RewardRecord_15505(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_RewardRecord_15505_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_RewardRecord_15505_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RewardRecord_15505.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RewardRecord_15505)) {
            return super.equals(obj);
         } else {
            C2S_RewardRecord_15505 other = (C2S_RewardRecord_15505)obj;
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

      public static C2S_RewardRecord_15505 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RewardRecord_15505)PARSER.parseFrom(data);
      }

      public static C2S_RewardRecord_15505 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RewardRecord_15505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RewardRecord_15505 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RewardRecord_15505)PARSER.parseFrom(data);
      }

      public static C2S_RewardRecord_15505 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RewardRecord_15505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RewardRecord_15505 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RewardRecord_15505)PARSER.parseFrom(data);
      }

      public static C2S_RewardRecord_15505 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RewardRecord_15505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RewardRecord_15505 parseFrom(InputStream input) throws IOException {
         return (C2S_RewardRecord_15505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RewardRecord_15505 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RewardRecord_15505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RewardRecord_15505 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RewardRecord_15505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RewardRecord_15505 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RewardRecord_15505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RewardRecord_15505 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RewardRecord_15505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RewardRecord_15505 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RewardRecord_15505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RewardRecord_15505 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RewardRecord_15505 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RewardRecord_15505> parser() {
         return PARSER;
      }

      public Parser<C2S_RewardRecord_15505> getParserForType() {
         return PARSER;
      }

      public C2S_RewardRecord_15505 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RewardRecord_15505OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_RewardRecord_15505_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_RewardRecord_15505_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RewardRecord_15505.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityLampMsg.C2S_RewardRecord_15505.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_C2S_RewardRecord_15505_descriptor;
         }

         public C2S_RewardRecord_15505 getDefaultInstanceForType() {
            return ActivityLampMsg.C2S_RewardRecord_15505.getDefaultInstance();
         }

         public C2S_RewardRecord_15505 build() {
            C2S_RewardRecord_15505 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RewardRecord_15505 buildPartial() {
            C2S_RewardRecord_15505 result = new C2S_RewardRecord_15505(this);
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
            if (other instanceof C2S_RewardRecord_15505) {
               return this.mergeFrom((C2S_RewardRecord_15505)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RewardRecord_15505 other) {
            if (other == ActivityLampMsg.C2S_RewardRecord_15505.getDefaultInstance()) {
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
            C2S_RewardRecord_15505 parsedMessage = null;

            try {
               parsedMessage = (C2S_RewardRecord_15505)ActivityLampMsg.C2S_RewardRecord_15505.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RewardRecord_15505)e.getUnfinishedMessage();
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

   public static final class S2C_RewardRecord_15506 extends GeneratedMessageV3 implements S2C_RewardRecord_15506OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECORDDATA_FIELD_NUMBER = 1;
      private List<RewardRecordData> recordData_;
      private byte memoizedIsInitialized;
      private static final S2C_RewardRecord_15506 DEFAULT_INSTANCE = new S2C_RewardRecord_15506();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RewardRecord_15506> PARSER = new AbstractParser<S2C_RewardRecord_15506>() {
         public S2C_RewardRecord_15506 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RewardRecord_15506(input, extensionRegistry);
         }
      };

      private S2C_RewardRecord_15506(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RewardRecord_15506() {
         this.memoizedIsInitialized = -1;
         this.recordData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RewardRecord_15506();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RewardRecord_15506(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.recordData_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.recordData_.add(input.readMessage(ActivityLampMsg.RewardRecordData.PARSER, extensionRegistry));
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
                  this.recordData_ = Collections.unmodifiableList(this.recordData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_RewardRecord_15506_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_RewardRecord_15506_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RewardRecord_15506.class, Builder.class);
      }

      public List<RewardRecordData> getRecordDataList() {
         return this.recordData_;
      }

      public List<? extends RewardRecordDataOrBuilder> getRecordDataOrBuilderList() {
         return this.recordData_;
      }

      public int getRecordDataCount() {
         return this.recordData_.size();
      }

      public RewardRecordData getRecordData(int index) {
         return (RewardRecordData)this.recordData_.get(index);
      }

      public RewardRecordDataOrBuilder getRecordDataOrBuilder(int index) {
         return (RewardRecordDataOrBuilder)this.recordData_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getRecordDataCount(); ++i) {
               if (!this.getRecordData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.recordData_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.recordData_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.recordData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.recordData_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RewardRecord_15506)) {
            return super.equals(obj);
         } else {
            S2C_RewardRecord_15506 other = (S2C_RewardRecord_15506)obj;
            if (!this.getRecordDataList().equals(other.getRecordDataList())) {
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
            if (this.getRecordDataCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecordDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RewardRecord_15506 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RewardRecord_15506)PARSER.parseFrom(data);
      }

      public static S2C_RewardRecord_15506 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RewardRecord_15506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RewardRecord_15506 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RewardRecord_15506)PARSER.parseFrom(data);
      }

      public static S2C_RewardRecord_15506 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RewardRecord_15506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RewardRecord_15506 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RewardRecord_15506)PARSER.parseFrom(data);
      }

      public static S2C_RewardRecord_15506 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RewardRecord_15506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RewardRecord_15506 parseFrom(InputStream input) throws IOException {
         return (S2C_RewardRecord_15506)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RewardRecord_15506 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RewardRecord_15506)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RewardRecord_15506 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RewardRecord_15506)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RewardRecord_15506 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RewardRecord_15506)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RewardRecord_15506 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RewardRecord_15506)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RewardRecord_15506 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RewardRecord_15506)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RewardRecord_15506 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RewardRecord_15506 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RewardRecord_15506> parser() {
         return PARSER;
      }

      public Parser<S2C_RewardRecord_15506> getParserForType() {
         return PARSER;
      }

      public S2C_RewardRecord_15506 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RewardRecord_15506OrBuilder {
         private int bitField0_;
         private List<RewardRecordData> recordData_;
         private RepeatedFieldBuilderV3<RewardRecordData, RewardRecordData.Builder, RewardRecordDataOrBuilder> recordDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_RewardRecord_15506_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_RewardRecord_15506_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RewardRecord_15506.class, Builder.class);
         }

         private Builder() {
            this.recordData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.recordData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityLampMsg.S2C_RewardRecord_15506.alwaysUseFieldBuilders) {
               this.getRecordDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.recordDataBuilder_ == null) {
               this.recordData_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.recordDataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityLampMsg.internal_static_midAutumn_com_gzbz_protobuf_S2C_RewardRecord_15506_descriptor;
         }

         public S2C_RewardRecord_15506 getDefaultInstanceForType() {
            return ActivityLampMsg.S2C_RewardRecord_15506.getDefaultInstance();
         }

         public S2C_RewardRecord_15506 build() {
            S2C_RewardRecord_15506 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RewardRecord_15506 buildPartial() {
            S2C_RewardRecord_15506 result = new S2C_RewardRecord_15506(this);
            int from_bitField0_ = this.bitField0_;
            if (this.recordDataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.recordData_ = Collections.unmodifiableList(this.recordData_);
                  this.bitField0_ &= -2;
               }

               result.recordData_ = this.recordData_;
            } else {
               result.recordData_ = this.recordDataBuilder_.build();
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
            if (other instanceof S2C_RewardRecord_15506) {
               return this.mergeFrom((S2C_RewardRecord_15506)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RewardRecord_15506 other) {
            if (other == ActivityLampMsg.S2C_RewardRecord_15506.getDefaultInstance()) {
               return this;
            } else {
               if (this.recordDataBuilder_ == null) {
                  if (!other.recordData_.isEmpty()) {
                     if (this.recordData_.isEmpty()) {
                        this.recordData_ = other.recordData_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureRecordDataIsMutable();
                        this.recordData_.addAll(other.recordData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.recordData_.isEmpty()) {
                  if (this.recordDataBuilder_.isEmpty()) {
                     this.recordDataBuilder_.dispose();
                     this.recordDataBuilder_ = null;
                     this.recordData_ = other.recordData_;
                     this.bitField0_ &= -2;
                     this.recordDataBuilder_ = ActivityLampMsg.S2C_RewardRecord_15506.alwaysUseFieldBuilders ? this.getRecordDataFieldBuilder() : null;
                  } else {
                     this.recordDataBuilder_.addAllMessages(other.recordData_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getRecordDataCount(); ++i) {
               if (!this.getRecordData(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RewardRecord_15506 parsedMessage = null;

            try {
               parsedMessage = (S2C_RewardRecord_15506)ActivityLampMsg.S2C_RewardRecord_15506.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RewardRecord_15506)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRecordDataIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.recordData_ = new ArrayList(this.recordData_);
               this.bitField0_ |= 1;
            }

         }

         public List<RewardRecordData> getRecordDataList() {
            return this.recordDataBuilder_ == null ? Collections.unmodifiableList(this.recordData_) : this.recordDataBuilder_.getMessageList();
         }

         public int getRecordDataCount() {
            return this.recordDataBuilder_ == null ? this.recordData_.size() : this.recordDataBuilder_.getCount();
         }

         public RewardRecordData getRecordData(int index) {
            return this.recordDataBuilder_ == null ? (RewardRecordData)this.recordData_.get(index) : (RewardRecordData)this.recordDataBuilder_.getMessage(index);
         }

         public Builder setRecordData(int index, RewardRecordData value) {
            if (this.recordDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordDataIsMutable();
               this.recordData_.set(index, value);
               this.onChanged();
            } else {
               this.recordDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRecordData(int index, RewardRecordData.Builder builderForValue) {
            if (this.recordDataBuilder_ == null) {
               this.ensureRecordDataIsMutable();
               this.recordData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecordData(RewardRecordData value) {
            if (this.recordDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordDataIsMutable();
               this.recordData_.add(value);
               this.onChanged();
            } else {
               this.recordDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRecordData(int index, RewardRecordData value) {
            if (this.recordDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordDataIsMutable();
               this.recordData_.add(index, value);
               this.onChanged();
            } else {
               this.recordDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRecordData(RewardRecordData.Builder builderForValue) {
            if (this.recordDataBuilder_ == null) {
               this.ensureRecordDataIsMutable();
               this.recordData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recordDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecordData(int index, RewardRecordData.Builder builderForValue) {
            if (this.recordDataBuilder_ == null) {
               this.ensureRecordDataIsMutable();
               this.recordData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecordData(Iterable<? extends RewardRecordData> values) {
            if (this.recordDataBuilder_ == null) {
               this.ensureRecordDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recordData_);
               this.onChanged();
            } else {
               this.recordDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRecordData() {
            if (this.recordDataBuilder_ == null) {
               this.recordData_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.recordDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeRecordData(int index) {
            if (this.recordDataBuilder_ == null) {
               this.ensureRecordDataIsMutable();
               this.recordData_.remove(index);
               this.onChanged();
            } else {
               this.recordDataBuilder_.remove(index);
            }

            return this;
         }

         public RewardRecordData.Builder getRecordDataBuilder(int index) {
            return (RewardRecordData.Builder)this.getRecordDataFieldBuilder().getBuilder(index);
         }

         public RewardRecordDataOrBuilder getRecordDataOrBuilder(int index) {
            return this.recordDataBuilder_ == null ? (RewardRecordDataOrBuilder)this.recordData_.get(index) : (RewardRecordDataOrBuilder)this.recordDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RewardRecordDataOrBuilder> getRecordDataOrBuilderList() {
            return this.recordDataBuilder_ != null ? this.recordDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.recordData_);
         }

         public RewardRecordData.Builder addRecordDataBuilder() {
            return (RewardRecordData.Builder)this.getRecordDataFieldBuilder().addBuilder(ActivityLampMsg.RewardRecordData.getDefaultInstance());
         }

         public RewardRecordData.Builder addRecordDataBuilder(int index) {
            return (RewardRecordData.Builder)this.getRecordDataFieldBuilder().addBuilder(index, ActivityLampMsg.RewardRecordData.getDefaultInstance());
         }

         public List<RewardRecordData.Builder> getRecordDataBuilderList() {
            return this.getRecordDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RewardRecordData, RewardRecordData.Builder, RewardRecordDataOrBuilder> getRecordDataFieldBuilder() {
            if (this.recordDataBuilder_ == null) {
               this.recordDataBuilder_ = new RepeatedFieldBuilderV3(this.recordData_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.recordData_ = null;
            }

            return this.recordDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_GetReward_15503OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_Main_15501OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_RewardRecord_15505OrBuilder extends MessageOrBuilder {
   }

   public interface RewardRecordDataOrBuilder extends MessageOrBuilder {
      boolean hasHead();

      int getHead();

      boolean hasName();

      String getName();

      ByteString getNameBytes();

      boolean hasNum();

      int getNum();

      boolean hasTime();

      int getTime();
   }

   public interface S2C_GetReward_15504OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasGotTimes();

      int getGotTimes();
   }

   public interface S2C_Main_15502OrBuilder extends MessageOrBuilder {
      boolean hasGotTimes();

      int getGotTimes();
   }

   public interface S2C_RewardRecord_15506OrBuilder extends MessageOrBuilder {
      List<RewardRecordData> getRecordDataList();

      RewardRecordData getRecordData(int index);

      int getRecordDataCount();

      List<? extends RewardRecordDataOrBuilder> getRecordDataOrBuilderList();

      RewardRecordDataOrBuilder getRecordDataOrBuilder(int index);
   }
}
