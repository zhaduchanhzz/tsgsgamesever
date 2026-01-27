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
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class YuanDanFireWorkMsg {
   private static final Descriptors.Descriptor internal_static_yuanDanFireWork_com_gzbz_protobuf_C2S_Main_22701_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDanFireWork_com_gzbz_protobuf_C2S_Main_22701_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDanFireWork_com_gzbz_protobuf_S2C_Main_22702_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDanFireWork_com_gzbz_protobuf_S2C_Main_22702_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDanFireWork_com_gzbz_protobuf_C2S_FireWorkAward_22703_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDanFireWork_com_gzbz_protobuf_C2S_FireWorkAward_22703_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_yuanDanFireWork_com_gzbz_protobuf_S2C_FireWorkAward_22704_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_yuanDanFireWork_com_gzbz_protobuf_S2C_FireWorkAward_22704_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private YuanDanFireWorkMsg() {
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
      String[] descriptorData = new String[]{"\n\u0015YuanDanFireWork.proto\u0012!yuanDanFireWork.com.gzbz.protobuf\"\u0010\n\u000eC2S_Main_22701\"o\n\u000eS2C_Main_22702\u0012\u0014\n\factivityTime\u0018\u0001 \u0002(\u0005\u0012\u0019\n\u0011fireWorkThemeType\u0018\u0002 \u0002(\u0005\u0012\u0015\n\rserverOpenDay\u0018\u0003 \u0002(\u0005\u0012\u0015\n\rhadGotRewards\u0018\u0004 \u0003(\u0005\"%\n\u0017C2S_FireWorkAward_22703\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"%\n\u0017S2C_FireWorkAward_22704\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005B)\n\u0011com.gzbz.protobufB\u0012YuanDanFireWorkMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_yuanDanFireWork_com_gzbz_protobuf_C2S_Main_22701_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_yuanDanFireWork_com_gzbz_protobuf_C2S_Main_22701_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDanFireWork_com_gzbz_protobuf_C2S_Main_22701_descriptor, new String[0]);
      internal_static_yuanDanFireWork_com_gzbz_protobuf_S2C_Main_22702_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_yuanDanFireWork_com_gzbz_protobuf_S2C_Main_22702_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDanFireWork_com_gzbz_protobuf_S2C_Main_22702_descriptor, new String[]{"ActivityTime", "FireWorkThemeType", "ServerOpenDay", "HadGotRewards"});
      internal_static_yuanDanFireWork_com_gzbz_protobuf_C2S_FireWorkAward_22703_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_yuanDanFireWork_com_gzbz_protobuf_C2S_FireWorkAward_22703_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDanFireWork_com_gzbz_protobuf_C2S_FireWorkAward_22703_descriptor, new String[]{"Id"});
      internal_static_yuanDanFireWork_com_gzbz_protobuf_S2C_FireWorkAward_22704_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_yuanDanFireWork_com_gzbz_protobuf_S2C_FireWorkAward_22704_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_yuanDanFireWork_com_gzbz_protobuf_S2C_FireWorkAward_22704_descriptor, new String[]{"Id"});
   }

   public static final class C2S_Main_22701 extends GeneratedMessageV3 implements C2S_Main_22701OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Main_22701 DEFAULT_INSTANCE = new C2S_Main_22701();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Main_22701> PARSER = new AbstractParser<C2S_Main_22701>() {
         public C2S_Main_22701 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Main_22701(input, extensionRegistry);
         }
      };

      private C2S_Main_22701(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Main_22701() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Main_22701();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Main_22701(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return YuanDanFireWorkMsg.internal_static_yuanDanFireWork_com_gzbz_protobuf_C2S_Main_22701_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanFireWorkMsg.internal_static_yuanDanFireWork_com_gzbz_protobuf_C2S_Main_22701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_22701.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Main_22701)) {
            return super.equals(obj);
         } else {
            C2S_Main_22701 other = (C2S_Main_22701)obj;
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

      public static C2S_Main_22701 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Main_22701)PARSER.parseFrom(data);
      }

      public static C2S_Main_22701 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_22701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_22701 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Main_22701)PARSER.parseFrom(data);
      }

      public static C2S_Main_22701 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_22701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_22701 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Main_22701)PARSER.parseFrom(data);
      }

      public static C2S_Main_22701 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_22701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_22701 parseFrom(InputStream input) throws IOException {
         return (C2S_Main_22701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_22701 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_22701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_22701 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Main_22701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Main_22701 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_22701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_22701 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Main_22701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_22701 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_22701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Main_22701 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Main_22701 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Main_22701> parser() {
         return PARSER;
      }

      public Parser<C2S_Main_22701> getParserForType() {
         return PARSER;
      }

      public C2S_Main_22701 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Main_22701OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanFireWorkMsg.internal_static_yuanDanFireWork_com_gzbz_protobuf_C2S_Main_22701_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanFireWorkMsg.internal_static_yuanDanFireWork_com_gzbz_protobuf_C2S_Main_22701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_22701.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanFireWorkMsg.C2S_Main_22701.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanFireWorkMsg.internal_static_yuanDanFireWork_com_gzbz_protobuf_C2S_Main_22701_descriptor;
         }

         public C2S_Main_22701 getDefaultInstanceForType() {
            return YuanDanFireWorkMsg.C2S_Main_22701.getDefaultInstance();
         }

         public C2S_Main_22701 build() {
            C2S_Main_22701 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Main_22701 buildPartial() {
            C2S_Main_22701 result = new C2S_Main_22701(this);
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
            if (other instanceof C2S_Main_22701) {
               return this.mergeFrom((C2S_Main_22701)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Main_22701 other) {
            if (other == YuanDanFireWorkMsg.C2S_Main_22701.getDefaultInstance()) {
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
            C2S_Main_22701 parsedMessage = null;

            try {
               parsedMessage = (C2S_Main_22701)YuanDanFireWorkMsg.C2S_Main_22701.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Main_22701)e.getUnfinishedMessage();
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

   public static final class S2C_Main_22702 extends GeneratedMessageV3 implements S2C_Main_22702OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYTIME_FIELD_NUMBER = 1;
      private int activityTime_;
      public static final int FIREWORKTHEMETYPE_FIELD_NUMBER = 2;
      private int fireWorkThemeType_;
      public static final int SERVEROPENDAY_FIELD_NUMBER = 3;
      private int serverOpenDay_;
      public static final int HADGOTREWARDS_FIELD_NUMBER = 4;
      private Internal.IntList hadGotRewards_;
      private byte memoizedIsInitialized;
      private static final S2C_Main_22702 DEFAULT_INSTANCE = new S2C_Main_22702();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Main_22702> PARSER = new AbstractParser<S2C_Main_22702>() {
         public S2C_Main_22702 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Main_22702(input, extensionRegistry);
         }
      };

      private S2C_Main_22702(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Main_22702() {
         this.memoizedIsInitialized = -1;
         this.hadGotRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Main_22702();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Main_22702(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.activityTime_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.fireWorkThemeType_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.serverOpenDay_ = input.readInt32();
                        break;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.hadGotRewards_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.hadGotRewards_.addInt(input.readInt32());
                        break;
                     case 34:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.hadGotRewards_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.hadGotRewards_.addInt(input.readInt32());
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
                  this.hadGotRewards_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return YuanDanFireWorkMsg.internal_static_yuanDanFireWork_com_gzbz_protobuf_S2C_Main_22702_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanFireWorkMsg.internal_static_yuanDanFireWork_com_gzbz_protobuf_S2C_Main_22702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Main_22702.class, Builder.class);
      }

      public boolean hasActivityTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityTime() {
         return this.activityTime_;
      }

      public boolean hasFireWorkThemeType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getFireWorkThemeType() {
         return this.fireWorkThemeType_;
      }

      public boolean hasServerOpenDay() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getServerOpenDay() {
         return this.serverOpenDay_;
      }

      public List<Integer> getHadGotRewardsList() {
         return this.hadGotRewards_;
      }

      public int getHadGotRewardsCount() {
         return this.hadGotRewards_.size();
      }

      public int getHadGotRewards(int index) {
         return this.hadGotRewards_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasActivityTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFireWorkThemeType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasServerOpenDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.activityTime_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.fireWorkThemeType_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.serverOpenDay_);
         }

         for(int i = 0; i < this.hadGotRewards_.size(); ++i) {
            output.writeInt32(4, this.hadGotRewards_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.activityTime_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.fireWorkThemeType_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.serverOpenDay_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.hadGotRewards_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.hadGotRewards_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHadGotRewardsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Main_22702)) {
            return super.equals(obj);
         } else {
            S2C_Main_22702 other = (S2C_Main_22702)obj;
            if (this.hasActivityTime() != other.hasActivityTime()) {
               return false;
            } else if (this.hasActivityTime() && this.getActivityTime() != other.getActivityTime()) {
               return false;
            } else if (this.hasFireWorkThemeType() != other.hasFireWorkThemeType()) {
               return false;
            } else if (this.hasFireWorkThemeType() && this.getFireWorkThemeType() != other.getFireWorkThemeType()) {
               return false;
            } else if (this.hasServerOpenDay() != other.hasServerOpenDay()) {
               return false;
            } else if (this.hasServerOpenDay() && this.getServerOpenDay() != other.getServerOpenDay()) {
               return false;
            } else if (!this.getHadGotRewardsList().equals(other.getHadGotRewardsList())) {
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
            if (this.hasActivityTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getActivityTime();
            }

            if (this.hasFireWorkThemeType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getFireWorkThemeType();
            }

            if (this.hasServerOpenDay()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getServerOpenDay();
            }

            if (this.getHadGotRewardsCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHadGotRewardsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Main_22702 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Main_22702)PARSER.parseFrom(data);
      }

      public static S2C_Main_22702 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_22702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_22702 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Main_22702)PARSER.parseFrom(data);
      }

      public static S2C_Main_22702 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_22702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_22702 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Main_22702)PARSER.parseFrom(data);
      }

      public static S2C_Main_22702 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_22702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_22702 parseFrom(InputStream input) throws IOException {
         return (S2C_Main_22702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Main_22702 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_22702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Main_22702 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Main_22702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Main_22702 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_22702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Main_22702 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Main_22702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Main_22702 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_22702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Main_22702 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Main_22702 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Main_22702> parser() {
         return PARSER;
      }

      public Parser<S2C_Main_22702> getParserForType() {
         return PARSER;
      }

      public S2C_Main_22702 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Main_22702OrBuilder {
         private int bitField0_;
         private int activityTime_;
         private int fireWorkThemeType_;
         private int serverOpenDay_;
         private Internal.IntList hadGotRewards_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanFireWorkMsg.internal_static_yuanDanFireWork_com_gzbz_protobuf_S2C_Main_22702_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanFireWorkMsg.internal_static_yuanDanFireWork_com_gzbz_protobuf_S2C_Main_22702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Main_22702.class, Builder.class);
         }

         private Builder() {
            this.hadGotRewards_ = YuanDanFireWorkMsg.S2C_Main_22702.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.hadGotRewards_ = YuanDanFireWorkMsg.S2C_Main_22702.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanFireWorkMsg.S2C_Main_22702.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityTime_ = 0;
            this.bitField0_ &= -2;
            this.fireWorkThemeType_ = 0;
            this.bitField0_ &= -3;
            this.serverOpenDay_ = 0;
            this.bitField0_ &= -5;
            this.hadGotRewards_ = YuanDanFireWorkMsg.S2C_Main_22702.emptyIntList();
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanFireWorkMsg.internal_static_yuanDanFireWork_com_gzbz_protobuf_S2C_Main_22702_descriptor;
         }

         public S2C_Main_22702 getDefaultInstanceForType() {
            return YuanDanFireWorkMsg.S2C_Main_22702.getDefaultInstance();
         }

         public S2C_Main_22702 build() {
            S2C_Main_22702 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Main_22702 buildPartial() {
            S2C_Main_22702 result = new S2C_Main_22702(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityTime_ = this.activityTime_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.fireWorkThemeType_ = this.fireWorkThemeType_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.serverOpenDay_ = this.serverOpenDay_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.hadGotRewards_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.hadGotRewards_ = this.hadGotRewards_;
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
            if (other instanceof S2C_Main_22702) {
               return this.mergeFrom((S2C_Main_22702)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Main_22702 other) {
            if (other == YuanDanFireWorkMsg.S2C_Main_22702.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityTime()) {
                  this.setActivityTime(other.getActivityTime());
               }

               if (other.hasFireWorkThemeType()) {
                  this.setFireWorkThemeType(other.getFireWorkThemeType());
               }

               if (other.hasServerOpenDay()) {
                  this.setServerOpenDay(other.getServerOpenDay());
               }

               if (!other.hadGotRewards_.isEmpty()) {
                  if (this.hadGotRewards_.isEmpty()) {
                     this.hadGotRewards_ = other.hadGotRewards_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureHadGotRewardsIsMutable();
                     this.hadGotRewards_.addAll(other.hadGotRewards_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActivityTime()) {
               return false;
            } else if (!this.hasFireWorkThemeType()) {
               return false;
            } else {
               return this.hasServerOpenDay();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Main_22702 parsedMessage = null;

            try {
               parsedMessage = (S2C_Main_22702)YuanDanFireWorkMsg.S2C_Main_22702.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Main_22702)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasActivityTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getActivityTime() {
            return this.activityTime_;
         }

         public Builder setActivityTime(int value) {
            this.bitField0_ |= 1;
            this.activityTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityTime() {
            this.bitField0_ &= -2;
            this.activityTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFireWorkThemeType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getFireWorkThemeType() {
            return this.fireWorkThemeType_;
         }

         public Builder setFireWorkThemeType(int value) {
            this.bitField0_ |= 2;
            this.fireWorkThemeType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFireWorkThemeType() {
            this.bitField0_ &= -3;
            this.fireWorkThemeType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasServerOpenDay() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getServerOpenDay() {
            return this.serverOpenDay_;
         }

         public Builder setServerOpenDay(int value) {
            this.bitField0_ |= 4;
            this.serverOpenDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerOpenDay() {
            this.bitField0_ &= -5;
            this.serverOpenDay_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureHadGotRewardsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.hadGotRewards_ = YuanDanFireWorkMsg.S2C_Main_22702.mutableCopy(this.hadGotRewards_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getHadGotRewardsList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.hadGotRewards_) : this.hadGotRewards_);
         }

         public int getHadGotRewardsCount() {
            return this.hadGotRewards_.size();
         }

         public int getHadGotRewards(int index) {
            return this.hadGotRewards_.getInt(index);
         }

         public Builder setHadGotRewards(int index, int value) {
            this.ensureHadGotRewardsIsMutable();
            this.hadGotRewards_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHadGotRewards(int value) {
            this.ensureHadGotRewardsIsMutable();
            this.hadGotRewards_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHadGotRewards(Iterable<? extends Integer> values) {
            this.ensureHadGotRewardsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.hadGotRewards_);
            this.onChanged();
            return this;
         }

         public Builder clearHadGotRewards() {
            this.hadGotRewards_ = YuanDanFireWorkMsg.S2C_Main_22702.emptyIntList();
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

   public static final class C2S_FireWorkAward_22703 extends GeneratedMessageV3 implements C2S_FireWorkAward_22703OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_FireWorkAward_22703 DEFAULT_INSTANCE = new C2S_FireWorkAward_22703();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FireWorkAward_22703> PARSER = new AbstractParser<C2S_FireWorkAward_22703>() {
         public C2S_FireWorkAward_22703 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FireWorkAward_22703(input, extensionRegistry);
         }
      };

      private C2S_FireWorkAward_22703(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FireWorkAward_22703() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FireWorkAward_22703();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FireWorkAward_22703(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return YuanDanFireWorkMsg.internal_static_yuanDanFireWork_com_gzbz_protobuf_C2S_FireWorkAward_22703_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanFireWorkMsg.internal_static_yuanDanFireWork_com_gzbz_protobuf_C2S_FireWorkAward_22703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FireWorkAward_22703.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FireWorkAward_22703)) {
            return super.equals(obj);
         } else {
            C2S_FireWorkAward_22703 other = (C2S_FireWorkAward_22703)obj;
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

      public static C2S_FireWorkAward_22703 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FireWorkAward_22703)PARSER.parseFrom(data);
      }

      public static C2S_FireWorkAward_22703 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FireWorkAward_22703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FireWorkAward_22703 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FireWorkAward_22703)PARSER.parseFrom(data);
      }

      public static C2S_FireWorkAward_22703 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FireWorkAward_22703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FireWorkAward_22703 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FireWorkAward_22703)PARSER.parseFrom(data);
      }

      public static C2S_FireWorkAward_22703 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FireWorkAward_22703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FireWorkAward_22703 parseFrom(InputStream input) throws IOException {
         return (C2S_FireWorkAward_22703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FireWorkAward_22703 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FireWorkAward_22703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FireWorkAward_22703 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FireWorkAward_22703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FireWorkAward_22703 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FireWorkAward_22703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FireWorkAward_22703 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FireWorkAward_22703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FireWorkAward_22703 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FireWorkAward_22703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FireWorkAward_22703 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FireWorkAward_22703 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FireWorkAward_22703> parser() {
         return PARSER;
      }

      public Parser<C2S_FireWorkAward_22703> getParserForType() {
         return PARSER;
      }

      public C2S_FireWorkAward_22703 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FireWorkAward_22703OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanFireWorkMsg.internal_static_yuanDanFireWork_com_gzbz_protobuf_C2S_FireWorkAward_22703_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanFireWorkMsg.internal_static_yuanDanFireWork_com_gzbz_protobuf_C2S_FireWorkAward_22703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FireWorkAward_22703.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanFireWorkMsg.C2S_FireWorkAward_22703.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanFireWorkMsg.internal_static_yuanDanFireWork_com_gzbz_protobuf_C2S_FireWorkAward_22703_descriptor;
         }

         public C2S_FireWorkAward_22703 getDefaultInstanceForType() {
            return YuanDanFireWorkMsg.C2S_FireWorkAward_22703.getDefaultInstance();
         }

         public C2S_FireWorkAward_22703 build() {
            C2S_FireWorkAward_22703 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FireWorkAward_22703 buildPartial() {
            C2S_FireWorkAward_22703 result = new C2S_FireWorkAward_22703(this);
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
            if (other instanceof C2S_FireWorkAward_22703) {
               return this.mergeFrom((C2S_FireWorkAward_22703)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FireWorkAward_22703 other) {
            if (other == YuanDanFireWorkMsg.C2S_FireWorkAward_22703.getDefaultInstance()) {
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
            C2S_FireWorkAward_22703 parsedMessage = null;

            try {
               parsedMessage = (C2S_FireWorkAward_22703)YuanDanFireWorkMsg.C2S_FireWorkAward_22703.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FireWorkAward_22703)e.getUnfinishedMessage();
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

   public static final class S2C_FireWorkAward_22704 extends GeneratedMessageV3 implements S2C_FireWorkAward_22704OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_FireWorkAward_22704 DEFAULT_INSTANCE = new S2C_FireWorkAward_22704();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FireWorkAward_22704> PARSER = new AbstractParser<S2C_FireWorkAward_22704>() {
         public S2C_FireWorkAward_22704 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FireWorkAward_22704(input, extensionRegistry);
         }
      };

      private S2C_FireWorkAward_22704(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FireWorkAward_22704() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FireWorkAward_22704();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FireWorkAward_22704(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return YuanDanFireWorkMsg.internal_static_yuanDanFireWork_com_gzbz_protobuf_S2C_FireWorkAward_22704_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanDanFireWorkMsg.internal_static_yuanDanFireWork_com_gzbz_protobuf_S2C_FireWorkAward_22704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FireWorkAward_22704.class, Builder.class);
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
         } else if (!(obj instanceof S2C_FireWorkAward_22704)) {
            return super.equals(obj);
         } else {
            S2C_FireWorkAward_22704 other = (S2C_FireWorkAward_22704)obj;
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

      public static S2C_FireWorkAward_22704 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FireWorkAward_22704)PARSER.parseFrom(data);
      }

      public static S2C_FireWorkAward_22704 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FireWorkAward_22704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FireWorkAward_22704 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FireWorkAward_22704)PARSER.parseFrom(data);
      }

      public static S2C_FireWorkAward_22704 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FireWorkAward_22704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FireWorkAward_22704 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FireWorkAward_22704)PARSER.parseFrom(data);
      }

      public static S2C_FireWorkAward_22704 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FireWorkAward_22704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FireWorkAward_22704 parseFrom(InputStream input) throws IOException {
         return (S2C_FireWorkAward_22704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FireWorkAward_22704 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FireWorkAward_22704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FireWorkAward_22704 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FireWorkAward_22704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FireWorkAward_22704 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FireWorkAward_22704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FireWorkAward_22704 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FireWorkAward_22704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FireWorkAward_22704 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FireWorkAward_22704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FireWorkAward_22704 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FireWorkAward_22704 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FireWorkAward_22704> parser() {
         return PARSER;
      }

      public Parser<S2C_FireWorkAward_22704> getParserForType() {
         return PARSER;
      }

      public S2C_FireWorkAward_22704 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FireWorkAward_22704OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanDanFireWorkMsg.internal_static_yuanDanFireWork_com_gzbz_protobuf_S2C_FireWorkAward_22704_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanDanFireWorkMsg.internal_static_yuanDanFireWork_com_gzbz_protobuf_S2C_FireWorkAward_22704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FireWorkAward_22704.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanDanFireWorkMsg.S2C_FireWorkAward_22704.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanDanFireWorkMsg.internal_static_yuanDanFireWork_com_gzbz_protobuf_S2C_FireWorkAward_22704_descriptor;
         }

         public S2C_FireWorkAward_22704 getDefaultInstanceForType() {
            return YuanDanFireWorkMsg.S2C_FireWorkAward_22704.getDefaultInstance();
         }

         public S2C_FireWorkAward_22704 build() {
            S2C_FireWorkAward_22704 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FireWorkAward_22704 buildPartial() {
            S2C_FireWorkAward_22704 result = new S2C_FireWorkAward_22704(this);
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
            if (other instanceof S2C_FireWorkAward_22704) {
               return this.mergeFrom((S2C_FireWorkAward_22704)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FireWorkAward_22704 other) {
            if (other == YuanDanFireWorkMsg.S2C_FireWorkAward_22704.getDefaultInstance()) {
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
            S2C_FireWorkAward_22704 parsedMessage = null;

            try {
               parsedMessage = (S2C_FireWorkAward_22704)YuanDanFireWorkMsg.S2C_FireWorkAward_22704.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FireWorkAward_22704)e.getUnfinishedMessage();
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

   public interface C2S_FireWorkAward_22703OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_Main_22701OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_FireWorkAward_22704OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_Main_22702OrBuilder extends MessageOrBuilder {
      boolean hasActivityTime();

      int getActivityTime();

      boolean hasFireWorkThemeType();

      int getFireWorkThemeType();

      boolean hasServerOpenDay();

      int getServerOpenDay();

      List<Integer> getHadGotRewardsList();

      int getHadGotRewardsCount();

      int getHadGotRewards(int index);
   }
}
