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

public final class HeroAdvanceNoticeMsg {
   private static final Descriptors.Descriptor internal_static_heroAdvanceNotice_com_gzbz_protobuf_InfoDetail_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroAdvanceNotice_com_gzbz_protobuf_InfoDetail_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroAdvanceNotice_com_gzbz_protobuf_C2S_Info_22201_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroAdvanceNotice_com_gzbz_protobuf_C2S_Info_22201_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroAdvanceNotice_com_gzbz_protobuf_S2C_Info_22202_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroAdvanceNotice_com_gzbz_protobuf_S2C_Info_22202_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroAdvanceNotice_com_gzbz_protobuf_C2S_Reward_22203_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroAdvanceNotice_com_gzbz_protobuf_C2S_Reward_22203_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroAdvanceNotice_com_gzbz_protobuf_S2C_Reward_22204_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroAdvanceNotice_com_gzbz_protobuf_S2C_Reward_22204_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private HeroAdvanceNoticeMsg() {
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
      String[] descriptorData = new String[]{"\n\u0017HeroAdvanceNotice.proto\u0012#heroAdvanceNotice.com.gzbz.protobuf\"O\n\nInfoDetail\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0003 \u0002(\u0005\u0012\u0011\n\tgotReward\u0018\u0004 \u0003(\u0005\"\u0010\n\u000eC2S_Info_22201\"U\n\u000eS2C_Info_22202\u0012C\n\ninfoDetail\u0018\u0001 \u0003(\u000b2/.heroAdvanceNotice.com.gzbz.protobuf.InfoDetail\"\u001e\n\u0010C2S_Reward_22203\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"1\n\u0010S2C_Reward_22204\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tgotReward\u0018\u0002 \u0003(\u0005B+\n\u0011com.gzbz.protobufB\u0014HeroAdvanceNoticeMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_heroAdvanceNotice_com_gzbz_protobuf_InfoDetail_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_heroAdvanceNotice_com_gzbz_protobuf_InfoDetail_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroAdvanceNotice_com_gzbz_protobuf_InfoDetail_descriptor, new String[]{"Id", "StartTime", "EndTime", "GotReward"});
      internal_static_heroAdvanceNotice_com_gzbz_protobuf_C2S_Info_22201_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_heroAdvanceNotice_com_gzbz_protobuf_C2S_Info_22201_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroAdvanceNotice_com_gzbz_protobuf_C2S_Info_22201_descriptor, new String[0]);
      internal_static_heroAdvanceNotice_com_gzbz_protobuf_S2C_Info_22202_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_heroAdvanceNotice_com_gzbz_protobuf_S2C_Info_22202_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroAdvanceNotice_com_gzbz_protobuf_S2C_Info_22202_descriptor, new String[]{"InfoDetail"});
      internal_static_heroAdvanceNotice_com_gzbz_protobuf_C2S_Reward_22203_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_heroAdvanceNotice_com_gzbz_protobuf_C2S_Reward_22203_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroAdvanceNotice_com_gzbz_protobuf_C2S_Reward_22203_descriptor, new String[]{"Id"});
      internal_static_heroAdvanceNotice_com_gzbz_protobuf_S2C_Reward_22204_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_heroAdvanceNotice_com_gzbz_protobuf_S2C_Reward_22204_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroAdvanceNotice_com_gzbz_protobuf_S2C_Reward_22204_descriptor, new String[]{"Id", "GotReward"});
   }

   public static final class InfoDetail extends GeneratedMessageV3 implements InfoDetailOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int STARTTIME_FIELD_NUMBER = 2;
      private int startTime_;
      public static final int ENDTIME_FIELD_NUMBER = 3;
      private int endTime_;
      public static final int GOTREWARD_FIELD_NUMBER = 4;
      private Internal.IntList gotReward_;
      private byte memoizedIsInitialized;
      private static final InfoDetail DEFAULT_INSTANCE = new InfoDetail();
      /** @deprecated */
      @Deprecated
      public static final Parser<InfoDetail> PARSER = new AbstractParser<InfoDetail>() {
         public InfoDetail parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new InfoDetail(input, extensionRegistry);
         }
      };

      private InfoDetail(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private InfoDetail() {
         this.memoizedIsInitialized = -1;
         this.gotReward_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new InfoDetail();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private InfoDetail(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.startTime_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.endTime_ = input.readInt32();
                        break;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.gotReward_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.gotReward_.addInt(input.readInt32());
                        break;
                     case 34:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotReward_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.gotReward_.addInt(input.readInt32());
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
                  this.gotReward_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_InfoDetail_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_InfoDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(InfoDetail.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public List<Integer> getGotRewardList() {
         return this.gotReward_;
      }

      public int getGotRewardCount() {
         return this.gotReward_.size();
      }

      public int getGotReward(int index) {
         return this.gotReward_.getInt(index);
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
         } else if (!this.hasStartTime()) {
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
            output.writeInt32(1, this.id_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.startTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.endTime_);
         }

         for(int i = 0; i < this.gotReward_.size(); ++i) {
            output.writeInt32(4, this.gotReward_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(2, this.startTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.endTime_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotReward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotReward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotRewardList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof InfoDetail)) {
            return super.equals(obj);
         } else {
            InfoDetail other = (InfoDetail)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (!this.getGotRewardList().equals(other.getGotRewardList())) {
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

            if (this.hasStartTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStartTime();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.getGotRewardCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getGotRewardList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static InfoDetail parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (InfoDetail)PARSER.parseFrom(data);
      }

      public static InfoDetail parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (InfoDetail)PARSER.parseFrom(data, extensionRegistry);
      }

      public static InfoDetail parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (InfoDetail)PARSER.parseFrom(data);
      }

      public static InfoDetail parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (InfoDetail)PARSER.parseFrom(data, extensionRegistry);
      }

      public static InfoDetail parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (InfoDetail)PARSER.parseFrom(data);
      }

      public static InfoDetail parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (InfoDetail)PARSER.parseFrom(data, extensionRegistry);
      }

      public static InfoDetail parseFrom(InputStream input) throws IOException {
         return (InfoDetail)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static InfoDetail parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (InfoDetail)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static InfoDetail parseDelimitedFrom(InputStream input) throws IOException {
         return (InfoDetail)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static InfoDetail parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (InfoDetail)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static InfoDetail parseFrom(CodedInputStream input) throws IOException {
         return (InfoDetail)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static InfoDetail parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (InfoDetail)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(InfoDetail prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static InfoDetail getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<InfoDetail> parser() {
         return PARSER;
      }

      public Parser<InfoDetail> getParserForType() {
         return PARSER;
      }

      public InfoDetail getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InfoDetailOrBuilder {
         private int bitField0_;
         private int id_;
         private int startTime_;
         private int endTime_;
         private Internal.IntList gotReward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_InfoDetail_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_InfoDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(InfoDetail.class, Builder.class);
         }

         private Builder() {
            this.gotReward_ = HeroAdvanceNoticeMsg.InfoDetail.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotReward_ = HeroAdvanceNoticeMsg.InfoDetail.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroAdvanceNoticeMsg.InfoDetail.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.startTime_ = 0;
            this.bitField0_ &= -3;
            this.endTime_ = 0;
            this.bitField0_ &= -5;
            this.gotReward_ = HeroAdvanceNoticeMsg.InfoDetail.emptyIntList();
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_InfoDetail_descriptor;
         }

         public InfoDetail getDefaultInstanceForType() {
            return HeroAdvanceNoticeMsg.InfoDetail.getDefaultInstance();
         }

         public InfoDetail build() {
            InfoDetail result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public InfoDetail buildPartial() {
            InfoDetail result = new InfoDetail(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.gotReward_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.gotReward_ = this.gotReward_;
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
            if (other instanceof InfoDetail) {
               return this.mergeFrom((InfoDetail)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(InfoDetail other) {
            if (other == HeroAdvanceNoticeMsg.InfoDetail.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (!other.gotReward_.isEmpty()) {
                  if (this.gotReward_.isEmpty()) {
                     this.gotReward_ = other.gotReward_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureGotRewardIsMutable();
                     this.gotReward_.addAll(other.gotReward_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else if (!this.hasStartTime()) {
               return false;
            } else {
               return this.hasEndTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            InfoDetail parsedMessage = null;

            try {
               parsedMessage = (InfoDetail)HeroAdvanceNoticeMsg.InfoDetail.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (InfoDetail)e.getUnfinishedMessage();
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

         public boolean hasStartTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(int value) {
            this.bitField0_ |= 2;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -3;
            this.startTime_ = 0;
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

         private void ensureGotRewardIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.gotReward_ = HeroAdvanceNoticeMsg.InfoDetail.mutableCopy(this.gotReward_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getGotRewardList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.gotReward_) : this.gotReward_);
         }

         public int getGotRewardCount() {
            return this.gotReward_.size();
         }

         public int getGotReward(int index) {
            return this.gotReward_.getInt(index);
         }

         public Builder setGotReward(int index, int value) {
            this.ensureGotRewardIsMutable();
            this.gotReward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotReward(int value) {
            this.ensureGotRewardIsMutable();
            this.gotReward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotReward(Iterable<? extends Integer> values) {
            this.ensureGotRewardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotReward_);
            this.onChanged();
            return this;
         }

         public Builder clearGotReward() {
            this.gotReward_ = HeroAdvanceNoticeMsg.InfoDetail.emptyIntList();
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

   public static final class C2S_Info_22201 extends GeneratedMessageV3 implements C2S_Info_22201OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Info_22201 DEFAULT_INSTANCE = new C2S_Info_22201();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Info_22201> PARSER = new AbstractParser<C2S_Info_22201>() {
         public C2S_Info_22201 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Info_22201(input, extensionRegistry);
         }
      };

      private C2S_Info_22201(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Info_22201() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Info_22201();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Info_22201(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_C2S_Info_22201_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_C2S_Info_22201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Info_22201.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Info_22201)) {
            return super.equals(obj);
         } else {
            C2S_Info_22201 other = (C2S_Info_22201)obj;
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

      public static C2S_Info_22201 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Info_22201)PARSER.parseFrom(data);
      }

      public static C2S_Info_22201 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Info_22201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Info_22201 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Info_22201)PARSER.parseFrom(data);
      }

      public static C2S_Info_22201 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Info_22201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Info_22201 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Info_22201)PARSER.parseFrom(data);
      }

      public static C2S_Info_22201 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Info_22201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Info_22201 parseFrom(InputStream input) throws IOException {
         return (C2S_Info_22201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Info_22201 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Info_22201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Info_22201 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Info_22201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Info_22201 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Info_22201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Info_22201 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Info_22201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Info_22201 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Info_22201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Info_22201 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Info_22201 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Info_22201> parser() {
         return PARSER;
      }

      public Parser<C2S_Info_22201> getParserForType() {
         return PARSER;
      }

      public C2S_Info_22201 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Info_22201OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_C2S_Info_22201_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_C2S_Info_22201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Info_22201.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroAdvanceNoticeMsg.C2S_Info_22201.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_C2S_Info_22201_descriptor;
         }

         public C2S_Info_22201 getDefaultInstanceForType() {
            return HeroAdvanceNoticeMsg.C2S_Info_22201.getDefaultInstance();
         }

         public C2S_Info_22201 build() {
            C2S_Info_22201 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Info_22201 buildPartial() {
            C2S_Info_22201 result = new C2S_Info_22201(this);
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
            if (other instanceof C2S_Info_22201) {
               return this.mergeFrom((C2S_Info_22201)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Info_22201 other) {
            if (other == HeroAdvanceNoticeMsg.C2S_Info_22201.getDefaultInstance()) {
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
            C2S_Info_22201 parsedMessage = null;

            try {
               parsedMessage = (C2S_Info_22201)HeroAdvanceNoticeMsg.C2S_Info_22201.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Info_22201)e.getUnfinishedMessage();
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

   public static final class S2C_Info_22202 extends GeneratedMessageV3 implements S2C_Info_22202OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFODETAIL_FIELD_NUMBER = 1;
      private List<InfoDetail> infoDetail_;
      private byte memoizedIsInitialized;
      private static final S2C_Info_22202 DEFAULT_INSTANCE = new S2C_Info_22202();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Info_22202> PARSER = new AbstractParser<S2C_Info_22202>() {
         public S2C_Info_22202 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Info_22202(input, extensionRegistry);
         }
      };

      private S2C_Info_22202(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Info_22202() {
         this.memoizedIsInitialized = -1;
         this.infoDetail_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Info_22202();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Info_22202(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.infoDetail_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.infoDetail_.add(input.readMessage(HeroAdvanceNoticeMsg.InfoDetail.PARSER, extensionRegistry));
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
                  this.infoDetail_ = Collections.unmodifiableList(this.infoDetail_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_S2C_Info_22202_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_S2C_Info_22202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Info_22202.class, Builder.class);
      }

      public List<InfoDetail> getInfoDetailList() {
         return this.infoDetail_;
      }

      public List<? extends InfoDetailOrBuilder> getInfoDetailOrBuilderList() {
         return this.infoDetail_;
      }

      public int getInfoDetailCount() {
         return this.infoDetail_.size();
      }

      public InfoDetail getInfoDetail(int index) {
         return (InfoDetail)this.infoDetail_.get(index);
      }

      public InfoDetailOrBuilder getInfoDetailOrBuilder(int index) {
         return (InfoDetailOrBuilder)this.infoDetail_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getInfoDetailCount(); ++i) {
               if (!this.getInfoDetail(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.infoDetail_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.infoDetail_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.infoDetail_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.infoDetail_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Info_22202)) {
            return super.equals(obj);
         } else {
            S2C_Info_22202 other = (S2C_Info_22202)obj;
            if (!this.getInfoDetailList().equals(other.getInfoDetailList())) {
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
            if (this.getInfoDetailCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfoDetailList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Info_22202 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Info_22202)PARSER.parseFrom(data);
      }

      public static S2C_Info_22202 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Info_22202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Info_22202 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Info_22202)PARSER.parseFrom(data);
      }

      public static S2C_Info_22202 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Info_22202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Info_22202 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Info_22202)PARSER.parseFrom(data);
      }

      public static S2C_Info_22202 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Info_22202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Info_22202 parseFrom(InputStream input) throws IOException {
         return (S2C_Info_22202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Info_22202 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Info_22202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Info_22202 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Info_22202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Info_22202 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Info_22202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Info_22202 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Info_22202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Info_22202 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Info_22202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Info_22202 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Info_22202 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Info_22202> parser() {
         return PARSER;
      }

      public Parser<S2C_Info_22202> getParserForType() {
         return PARSER;
      }

      public S2C_Info_22202 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Info_22202OrBuilder {
         private int bitField0_;
         private List<InfoDetail> infoDetail_;
         private RepeatedFieldBuilderV3<InfoDetail, InfoDetail.Builder, InfoDetailOrBuilder> infoDetailBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_S2C_Info_22202_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_S2C_Info_22202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Info_22202.class, Builder.class);
         }

         private Builder() {
            this.infoDetail_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.infoDetail_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroAdvanceNoticeMsg.S2C_Info_22202.alwaysUseFieldBuilders) {
               this.getInfoDetailFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infoDetailBuilder_ == null) {
               this.infoDetail_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.infoDetailBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_S2C_Info_22202_descriptor;
         }

         public S2C_Info_22202 getDefaultInstanceForType() {
            return HeroAdvanceNoticeMsg.S2C_Info_22202.getDefaultInstance();
         }

         public S2C_Info_22202 build() {
            S2C_Info_22202 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Info_22202 buildPartial() {
            S2C_Info_22202 result = new S2C_Info_22202(this);
            int from_bitField0_ = this.bitField0_;
            if (this.infoDetailBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.infoDetail_ = Collections.unmodifiableList(this.infoDetail_);
                  this.bitField0_ &= -2;
               }

               result.infoDetail_ = this.infoDetail_;
            } else {
               result.infoDetail_ = this.infoDetailBuilder_.build();
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
            if (other instanceof S2C_Info_22202) {
               return this.mergeFrom((S2C_Info_22202)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Info_22202 other) {
            if (other == HeroAdvanceNoticeMsg.S2C_Info_22202.getDefaultInstance()) {
               return this;
            } else {
               if (this.infoDetailBuilder_ == null) {
                  if (!other.infoDetail_.isEmpty()) {
                     if (this.infoDetail_.isEmpty()) {
                        this.infoDetail_ = other.infoDetail_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureInfoDetailIsMutable();
                        this.infoDetail_.addAll(other.infoDetail_);
                     }

                     this.onChanged();
                  }
               } else if (!other.infoDetail_.isEmpty()) {
                  if (this.infoDetailBuilder_.isEmpty()) {
                     this.infoDetailBuilder_.dispose();
                     this.infoDetailBuilder_ = null;
                     this.infoDetail_ = other.infoDetail_;
                     this.bitField0_ &= -2;
                     this.infoDetailBuilder_ = HeroAdvanceNoticeMsg.S2C_Info_22202.alwaysUseFieldBuilders ? this.getInfoDetailFieldBuilder() : null;
                  } else {
                     this.infoDetailBuilder_.addAllMessages(other.infoDetail_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getInfoDetailCount(); ++i) {
               if (!this.getInfoDetail(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Info_22202 parsedMessage = null;

            try {
               parsedMessage = (S2C_Info_22202)HeroAdvanceNoticeMsg.S2C_Info_22202.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Info_22202)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureInfoDetailIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.infoDetail_ = new ArrayList(this.infoDetail_);
               this.bitField0_ |= 1;
            }

         }

         public List<InfoDetail> getInfoDetailList() {
            return this.infoDetailBuilder_ == null ? Collections.unmodifiableList(this.infoDetail_) : this.infoDetailBuilder_.getMessageList();
         }

         public int getInfoDetailCount() {
            return this.infoDetailBuilder_ == null ? this.infoDetail_.size() : this.infoDetailBuilder_.getCount();
         }

         public InfoDetail getInfoDetail(int index) {
            return this.infoDetailBuilder_ == null ? (InfoDetail)this.infoDetail_.get(index) : (InfoDetail)this.infoDetailBuilder_.getMessage(index);
         }

         public Builder setInfoDetail(int index, InfoDetail value) {
            if (this.infoDetailBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoDetailIsMutable();
               this.infoDetail_.set(index, value);
               this.onChanged();
            } else {
               this.infoDetailBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInfoDetail(int index, InfoDetail.Builder builderForValue) {
            if (this.infoDetailBuilder_ == null) {
               this.ensureInfoDetailIsMutable();
               this.infoDetail_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoDetailBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfoDetail(InfoDetail value) {
            if (this.infoDetailBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoDetailIsMutable();
               this.infoDetail_.add(value);
               this.onChanged();
            } else {
               this.infoDetailBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInfoDetail(int index, InfoDetail value) {
            if (this.infoDetailBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoDetailIsMutable();
               this.infoDetail_.add(index, value);
               this.onChanged();
            } else {
               this.infoDetailBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInfoDetail(InfoDetail.Builder builderForValue) {
            if (this.infoDetailBuilder_ == null) {
               this.ensureInfoDetailIsMutable();
               this.infoDetail_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoDetailBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfoDetail(int index, InfoDetail.Builder builderForValue) {
            if (this.infoDetailBuilder_ == null) {
               this.ensureInfoDetailIsMutable();
               this.infoDetail_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoDetailBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfoDetail(Iterable<? extends InfoDetail> values) {
            if (this.infoDetailBuilder_ == null) {
               this.ensureInfoDetailIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.infoDetail_);
               this.onChanged();
            } else {
               this.infoDetailBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInfoDetail() {
            if (this.infoDetailBuilder_ == null) {
               this.infoDetail_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.infoDetailBuilder_.clear();
            }

            return this;
         }

         public Builder removeInfoDetail(int index) {
            if (this.infoDetailBuilder_ == null) {
               this.ensureInfoDetailIsMutable();
               this.infoDetail_.remove(index);
               this.onChanged();
            } else {
               this.infoDetailBuilder_.remove(index);
            }

            return this;
         }

         public InfoDetail.Builder getInfoDetailBuilder(int index) {
            return (InfoDetail.Builder)this.getInfoDetailFieldBuilder().getBuilder(index);
         }

         public InfoDetailOrBuilder getInfoDetailOrBuilder(int index) {
            return this.infoDetailBuilder_ == null ? (InfoDetailOrBuilder)this.infoDetail_.get(index) : (InfoDetailOrBuilder)this.infoDetailBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends InfoDetailOrBuilder> getInfoDetailOrBuilderList() {
            return this.infoDetailBuilder_ != null ? this.infoDetailBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infoDetail_);
         }

         public InfoDetail.Builder addInfoDetailBuilder() {
            return (InfoDetail.Builder)this.getInfoDetailFieldBuilder().addBuilder(HeroAdvanceNoticeMsg.InfoDetail.getDefaultInstance());
         }

         public InfoDetail.Builder addInfoDetailBuilder(int index) {
            return (InfoDetail.Builder)this.getInfoDetailFieldBuilder().addBuilder(index, HeroAdvanceNoticeMsg.InfoDetail.getDefaultInstance());
         }

         public List<InfoDetail.Builder> getInfoDetailBuilderList() {
            return this.getInfoDetailFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<InfoDetail, InfoDetail.Builder, InfoDetailOrBuilder> getInfoDetailFieldBuilder() {
            if (this.infoDetailBuilder_ == null) {
               this.infoDetailBuilder_ = new RepeatedFieldBuilderV3(this.infoDetail_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.infoDetail_ = null;
            }

            return this.infoDetailBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_Reward_22203 extends GeneratedMessageV3 implements C2S_Reward_22203OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_Reward_22203 DEFAULT_INSTANCE = new C2S_Reward_22203();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Reward_22203> PARSER = new AbstractParser<C2S_Reward_22203>() {
         public C2S_Reward_22203 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Reward_22203(input, extensionRegistry);
         }
      };

      private C2S_Reward_22203(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Reward_22203() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Reward_22203();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Reward_22203(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_C2S_Reward_22203_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_C2S_Reward_22203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Reward_22203.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Reward_22203)) {
            return super.equals(obj);
         } else {
            C2S_Reward_22203 other = (C2S_Reward_22203)obj;
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

      public static C2S_Reward_22203 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Reward_22203)PARSER.parseFrom(data);
      }

      public static C2S_Reward_22203 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Reward_22203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Reward_22203 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Reward_22203)PARSER.parseFrom(data);
      }

      public static C2S_Reward_22203 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Reward_22203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Reward_22203 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Reward_22203)PARSER.parseFrom(data);
      }

      public static C2S_Reward_22203 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Reward_22203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Reward_22203 parseFrom(InputStream input) throws IOException {
         return (C2S_Reward_22203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Reward_22203 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Reward_22203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Reward_22203 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Reward_22203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Reward_22203 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Reward_22203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Reward_22203 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Reward_22203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Reward_22203 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Reward_22203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Reward_22203 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Reward_22203 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Reward_22203> parser() {
         return PARSER;
      }

      public Parser<C2S_Reward_22203> getParserForType() {
         return PARSER;
      }

      public C2S_Reward_22203 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Reward_22203OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_C2S_Reward_22203_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_C2S_Reward_22203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Reward_22203.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroAdvanceNoticeMsg.C2S_Reward_22203.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_C2S_Reward_22203_descriptor;
         }

         public C2S_Reward_22203 getDefaultInstanceForType() {
            return HeroAdvanceNoticeMsg.C2S_Reward_22203.getDefaultInstance();
         }

         public C2S_Reward_22203 build() {
            C2S_Reward_22203 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Reward_22203 buildPartial() {
            C2S_Reward_22203 result = new C2S_Reward_22203(this);
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
            if (other instanceof C2S_Reward_22203) {
               return this.mergeFrom((C2S_Reward_22203)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Reward_22203 other) {
            if (other == HeroAdvanceNoticeMsg.C2S_Reward_22203.getDefaultInstance()) {
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
            C2S_Reward_22203 parsedMessage = null;

            try {
               parsedMessage = (C2S_Reward_22203)HeroAdvanceNoticeMsg.C2S_Reward_22203.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Reward_22203)e.getUnfinishedMessage();
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

   public static final class S2C_Reward_22204 extends GeneratedMessageV3 implements S2C_Reward_22204OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int GOTREWARD_FIELD_NUMBER = 2;
      private Internal.IntList gotReward_;
      private byte memoizedIsInitialized;
      private static final S2C_Reward_22204 DEFAULT_INSTANCE = new S2C_Reward_22204();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Reward_22204> PARSER = new AbstractParser<S2C_Reward_22204>() {
         public S2C_Reward_22204 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Reward_22204(input, extensionRegistry);
         }
      };

      private S2C_Reward_22204(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Reward_22204() {
         this.memoizedIsInitialized = -1;
         this.gotReward_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Reward_22204();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Reward_22204(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.gotReward_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.gotReward_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotReward_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.gotReward_.addInt(input.readInt32());
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
                  this.gotReward_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_S2C_Reward_22204_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_S2C_Reward_22204_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Reward_22204.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public List<Integer> getGotRewardList() {
         return this.gotReward_;
      }

      public int getGotRewardCount() {
         return this.gotReward_.size();
      }

      public int getGotReward(int index) {
         return this.gotReward_.getInt(index);
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

         for(int i = 0; i < this.gotReward_.size(); ++i) {
            output.writeInt32(2, this.gotReward_.getInt(i));
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

            int dataSize = 0;

            for(int i = 0; i < this.gotReward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotReward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotRewardList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Reward_22204)) {
            return super.equals(obj);
         } else {
            S2C_Reward_22204 other = (S2C_Reward_22204)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (!this.getGotRewardList().equals(other.getGotRewardList())) {
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

            if (this.getGotRewardCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGotRewardList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Reward_22204 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Reward_22204)PARSER.parseFrom(data);
      }

      public static S2C_Reward_22204 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Reward_22204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Reward_22204 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Reward_22204)PARSER.parseFrom(data);
      }

      public static S2C_Reward_22204 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Reward_22204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Reward_22204 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Reward_22204)PARSER.parseFrom(data);
      }

      public static S2C_Reward_22204 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Reward_22204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Reward_22204 parseFrom(InputStream input) throws IOException {
         return (S2C_Reward_22204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Reward_22204 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Reward_22204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Reward_22204 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Reward_22204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Reward_22204 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Reward_22204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Reward_22204 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Reward_22204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Reward_22204 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Reward_22204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Reward_22204 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Reward_22204 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Reward_22204> parser() {
         return PARSER;
      }

      public Parser<S2C_Reward_22204> getParserForType() {
         return PARSER;
      }

      public S2C_Reward_22204 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Reward_22204OrBuilder {
         private int bitField0_;
         private int id_;
         private Internal.IntList gotReward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_S2C_Reward_22204_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_S2C_Reward_22204_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Reward_22204.class, Builder.class);
         }

         private Builder() {
            this.gotReward_ = HeroAdvanceNoticeMsg.S2C_Reward_22204.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotReward_ = HeroAdvanceNoticeMsg.S2C_Reward_22204.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroAdvanceNoticeMsg.S2C_Reward_22204.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.gotReward_ = HeroAdvanceNoticeMsg.S2C_Reward_22204.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroAdvanceNoticeMsg.internal_static_heroAdvanceNotice_com_gzbz_protobuf_S2C_Reward_22204_descriptor;
         }

         public S2C_Reward_22204 getDefaultInstanceForType() {
            return HeroAdvanceNoticeMsg.S2C_Reward_22204.getDefaultInstance();
         }

         public S2C_Reward_22204 build() {
            S2C_Reward_22204 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Reward_22204 buildPartial() {
            S2C_Reward_22204 result = new S2C_Reward_22204(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.gotReward_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.gotReward_ = this.gotReward_;
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
            if (other instanceof S2C_Reward_22204) {
               return this.mergeFrom((S2C_Reward_22204)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Reward_22204 other) {
            if (other == HeroAdvanceNoticeMsg.S2C_Reward_22204.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (!other.gotReward_.isEmpty()) {
                  if (this.gotReward_.isEmpty()) {
                     this.gotReward_ = other.gotReward_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureGotRewardIsMutable();
                     this.gotReward_.addAll(other.gotReward_);
                  }

                  this.onChanged();
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
            S2C_Reward_22204 parsedMessage = null;

            try {
               parsedMessage = (S2C_Reward_22204)HeroAdvanceNoticeMsg.S2C_Reward_22204.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Reward_22204)e.getUnfinishedMessage();
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

         private void ensureGotRewardIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.gotReward_ = HeroAdvanceNoticeMsg.S2C_Reward_22204.mutableCopy(this.gotReward_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getGotRewardList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.gotReward_) : this.gotReward_);
         }

         public int getGotRewardCount() {
            return this.gotReward_.size();
         }

         public int getGotReward(int index) {
            return this.gotReward_.getInt(index);
         }

         public Builder setGotReward(int index, int value) {
            this.ensureGotRewardIsMutable();
            this.gotReward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotReward(int value) {
            this.ensureGotRewardIsMutable();
            this.gotReward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotReward(Iterable<? extends Integer> values) {
            this.ensureGotRewardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotReward_);
            this.onChanged();
            return this;
         }

         public Builder clearGotReward() {
            this.gotReward_ = HeroAdvanceNoticeMsg.S2C_Reward_22204.emptyIntList();
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

   public interface C2S_Info_22201OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Reward_22203OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface InfoDetailOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasStartTime();

      int getStartTime();

      boolean hasEndTime();

      int getEndTime();

      List<Integer> getGotRewardList();

      int getGotRewardCount();

      int getGotReward(int index);
   }

   public interface S2C_Info_22202OrBuilder extends MessageOrBuilder {
      List<InfoDetail> getInfoDetailList();

      InfoDetail getInfoDetail(int index);

      int getInfoDetailCount();

      List<? extends InfoDetailOrBuilder> getInfoDetailOrBuilderList();

      InfoDetailOrBuilder getInfoDetailOrBuilder(int index);
   }

   public interface S2C_Reward_22204OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      List<Integer> getGotRewardList();

      int getGotRewardCount();

      int getGotReward(int index);
   }
}
