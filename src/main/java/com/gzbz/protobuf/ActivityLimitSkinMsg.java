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

public final class ActivityLimitSkinMsg {
   private static final Descriptors.Descriptor internal_static_activityLimitSkin_com_gzbz_protobuf_C2S_LimitSkinInfo_23401_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityLimitSkin_com_gzbz_protobuf_C2S_LimitSkinInfo_23401_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityLimitSkin_com_gzbz_protobuf_S2C_LimitSkinInfo_23402_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityLimitSkin_com_gzbz_protobuf_S2C_LimitSkinInfo_23402_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ActivityLimitSkinMsg() {
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
      String[] descriptorData = new String[]{"\n\u0017ActivityLimitSkin.proto\u0012#activityLimitSkin.com.gzbz.protobuf\"\u0019\n\u0017C2S_LimitSkinInfo_23401\"0\n\u0017S2C_LimitSkinInfo_23402\u0012\u0015\n\rlimitSkinList\u0018\u0001 \u0003(\u0005B+\n\u0011com.gzbz.protobufB\u0014ActivityLimitSkinMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_activityLimitSkin_com_gzbz_protobuf_C2S_LimitSkinInfo_23401_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_activityLimitSkin_com_gzbz_protobuf_C2S_LimitSkinInfo_23401_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityLimitSkin_com_gzbz_protobuf_C2S_LimitSkinInfo_23401_descriptor, new String[0]);
      internal_static_activityLimitSkin_com_gzbz_protobuf_S2C_LimitSkinInfo_23402_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_activityLimitSkin_com_gzbz_protobuf_S2C_LimitSkinInfo_23402_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityLimitSkin_com_gzbz_protobuf_S2C_LimitSkinInfo_23402_descriptor, new String[]{"LimitSkinList"});
   }

   public static final class C2S_LimitSkinInfo_23401 extends GeneratedMessageV3 implements C2S_LimitSkinInfo_23401OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LimitSkinInfo_23401 DEFAULT_INSTANCE = new C2S_LimitSkinInfo_23401();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LimitSkinInfo_23401> PARSER = new AbstractParser<C2S_LimitSkinInfo_23401>() {
         public C2S_LimitSkinInfo_23401 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LimitSkinInfo_23401(input, extensionRegistry);
         }
      };

      private C2S_LimitSkinInfo_23401(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LimitSkinInfo_23401() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LimitSkinInfo_23401();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LimitSkinInfo_23401(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityLimitSkinMsg.internal_static_activityLimitSkin_com_gzbz_protobuf_C2S_LimitSkinInfo_23401_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityLimitSkinMsg.internal_static_activityLimitSkin_com_gzbz_protobuf_C2S_LimitSkinInfo_23401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LimitSkinInfo_23401.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LimitSkinInfo_23401)) {
            return super.equals(obj);
         } else {
            C2S_LimitSkinInfo_23401 other = (C2S_LimitSkinInfo_23401)obj;
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

      public static C2S_LimitSkinInfo_23401 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LimitSkinInfo_23401)PARSER.parseFrom(data);
      }

      public static C2S_LimitSkinInfo_23401 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LimitSkinInfo_23401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LimitSkinInfo_23401 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LimitSkinInfo_23401)PARSER.parseFrom(data);
      }

      public static C2S_LimitSkinInfo_23401 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LimitSkinInfo_23401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LimitSkinInfo_23401 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LimitSkinInfo_23401)PARSER.parseFrom(data);
      }

      public static C2S_LimitSkinInfo_23401 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LimitSkinInfo_23401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LimitSkinInfo_23401 parseFrom(InputStream input) throws IOException {
         return (C2S_LimitSkinInfo_23401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LimitSkinInfo_23401 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LimitSkinInfo_23401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LimitSkinInfo_23401 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LimitSkinInfo_23401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LimitSkinInfo_23401 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LimitSkinInfo_23401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LimitSkinInfo_23401 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LimitSkinInfo_23401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LimitSkinInfo_23401 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LimitSkinInfo_23401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LimitSkinInfo_23401 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LimitSkinInfo_23401 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LimitSkinInfo_23401> parser() {
         return PARSER;
      }

      public Parser<C2S_LimitSkinInfo_23401> getParserForType() {
         return PARSER;
      }

      public C2S_LimitSkinInfo_23401 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LimitSkinInfo_23401OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityLimitSkinMsg.internal_static_activityLimitSkin_com_gzbz_protobuf_C2S_LimitSkinInfo_23401_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityLimitSkinMsg.internal_static_activityLimitSkin_com_gzbz_protobuf_C2S_LimitSkinInfo_23401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LimitSkinInfo_23401.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityLimitSkinMsg.C2S_LimitSkinInfo_23401.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityLimitSkinMsg.internal_static_activityLimitSkin_com_gzbz_protobuf_C2S_LimitSkinInfo_23401_descriptor;
         }

         public C2S_LimitSkinInfo_23401 getDefaultInstanceForType() {
            return ActivityLimitSkinMsg.C2S_LimitSkinInfo_23401.getDefaultInstance();
         }

         public C2S_LimitSkinInfo_23401 build() {
            C2S_LimitSkinInfo_23401 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LimitSkinInfo_23401 buildPartial() {
            C2S_LimitSkinInfo_23401 result = new C2S_LimitSkinInfo_23401(this);
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
            if (other instanceof C2S_LimitSkinInfo_23401) {
               return this.mergeFrom((C2S_LimitSkinInfo_23401)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LimitSkinInfo_23401 other) {
            if (other == ActivityLimitSkinMsg.C2S_LimitSkinInfo_23401.getDefaultInstance()) {
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
            C2S_LimitSkinInfo_23401 parsedMessage = null;

            try {
               parsedMessage = (C2S_LimitSkinInfo_23401)ActivityLimitSkinMsg.C2S_LimitSkinInfo_23401.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LimitSkinInfo_23401)e.getUnfinishedMessage();
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

   public static final class S2C_LimitSkinInfo_23402 extends GeneratedMessageV3 implements S2C_LimitSkinInfo_23402OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int LIMITSKINLIST_FIELD_NUMBER = 1;
      private Internal.IntList limitSkinList_;
      private byte memoizedIsInitialized;
      private static final S2C_LimitSkinInfo_23402 DEFAULT_INSTANCE = new S2C_LimitSkinInfo_23402();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LimitSkinInfo_23402> PARSER = new AbstractParser<S2C_LimitSkinInfo_23402>() {
         public S2C_LimitSkinInfo_23402 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LimitSkinInfo_23402(input, extensionRegistry);
         }
      };

      private S2C_LimitSkinInfo_23402(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LimitSkinInfo_23402() {
         this.memoizedIsInitialized = -1;
         this.limitSkinList_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LimitSkinInfo_23402();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LimitSkinInfo_23402(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.limitSkinList_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.limitSkinList_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.limitSkinList_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.limitSkinList_.addInt(input.readInt32());
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
                  this.limitSkinList_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityLimitSkinMsg.internal_static_activityLimitSkin_com_gzbz_protobuf_S2C_LimitSkinInfo_23402_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityLimitSkinMsg.internal_static_activityLimitSkin_com_gzbz_protobuf_S2C_LimitSkinInfo_23402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LimitSkinInfo_23402.class, Builder.class);
      }

      public List<Integer> getLimitSkinListList() {
         return this.limitSkinList_;
      }

      public int getLimitSkinListCount() {
         return this.limitSkinList_.size();
      }

      public int getLimitSkinList(int index) {
         return this.limitSkinList_.getInt(index);
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
         for(int i = 0; i < this.limitSkinList_.size(); ++i) {
            output.writeInt32(1, this.limitSkinList_.getInt(i));
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

            for(int i = 0; i < this.limitSkinList_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.limitSkinList_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getLimitSkinListList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LimitSkinInfo_23402)) {
            return super.equals(obj);
         } else {
            S2C_LimitSkinInfo_23402 other = (S2C_LimitSkinInfo_23402)obj;
            if (!this.getLimitSkinListList().equals(other.getLimitSkinListList())) {
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
            if (this.getLimitSkinListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLimitSkinListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LimitSkinInfo_23402 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LimitSkinInfo_23402)PARSER.parseFrom(data);
      }

      public static S2C_LimitSkinInfo_23402 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LimitSkinInfo_23402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LimitSkinInfo_23402 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LimitSkinInfo_23402)PARSER.parseFrom(data);
      }

      public static S2C_LimitSkinInfo_23402 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LimitSkinInfo_23402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LimitSkinInfo_23402 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LimitSkinInfo_23402)PARSER.parseFrom(data);
      }

      public static S2C_LimitSkinInfo_23402 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LimitSkinInfo_23402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LimitSkinInfo_23402 parseFrom(InputStream input) throws IOException {
         return (S2C_LimitSkinInfo_23402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LimitSkinInfo_23402 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LimitSkinInfo_23402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LimitSkinInfo_23402 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LimitSkinInfo_23402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LimitSkinInfo_23402 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LimitSkinInfo_23402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LimitSkinInfo_23402 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LimitSkinInfo_23402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LimitSkinInfo_23402 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LimitSkinInfo_23402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LimitSkinInfo_23402 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LimitSkinInfo_23402 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LimitSkinInfo_23402> parser() {
         return PARSER;
      }

      public Parser<S2C_LimitSkinInfo_23402> getParserForType() {
         return PARSER;
      }

      public S2C_LimitSkinInfo_23402 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LimitSkinInfo_23402OrBuilder {
         private int bitField0_;
         private Internal.IntList limitSkinList_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityLimitSkinMsg.internal_static_activityLimitSkin_com_gzbz_protobuf_S2C_LimitSkinInfo_23402_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityLimitSkinMsg.internal_static_activityLimitSkin_com_gzbz_protobuf_S2C_LimitSkinInfo_23402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LimitSkinInfo_23402.class, Builder.class);
         }

         private Builder() {
            this.limitSkinList_ = ActivityLimitSkinMsg.S2C_LimitSkinInfo_23402.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.limitSkinList_ = ActivityLimitSkinMsg.S2C_LimitSkinInfo_23402.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityLimitSkinMsg.S2C_LimitSkinInfo_23402.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.limitSkinList_ = ActivityLimitSkinMsg.S2C_LimitSkinInfo_23402.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityLimitSkinMsg.internal_static_activityLimitSkin_com_gzbz_protobuf_S2C_LimitSkinInfo_23402_descriptor;
         }

         public S2C_LimitSkinInfo_23402 getDefaultInstanceForType() {
            return ActivityLimitSkinMsg.S2C_LimitSkinInfo_23402.getDefaultInstance();
         }

         public S2C_LimitSkinInfo_23402 build() {
            S2C_LimitSkinInfo_23402 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LimitSkinInfo_23402 buildPartial() {
            S2C_LimitSkinInfo_23402 result = new S2C_LimitSkinInfo_23402(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.limitSkinList_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.limitSkinList_ = this.limitSkinList_;
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
            if (other instanceof S2C_LimitSkinInfo_23402) {
               return this.mergeFrom((S2C_LimitSkinInfo_23402)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LimitSkinInfo_23402 other) {
            if (other == ActivityLimitSkinMsg.S2C_LimitSkinInfo_23402.getDefaultInstance()) {
               return this;
            } else {
               if (!other.limitSkinList_.isEmpty()) {
                  if (this.limitSkinList_.isEmpty()) {
                     this.limitSkinList_ = other.limitSkinList_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureLimitSkinListIsMutable();
                     this.limitSkinList_.addAll(other.limitSkinList_);
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
            S2C_LimitSkinInfo_23402 parsedMessage = null;

            try {
               parsedMessage = (S2C_LimitSkinInfo_23402)ActivityLimitSkinMsg.S2C_LimitSkinInfo_23402.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LimitSkinInfo_23402)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureLimitSkinListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.limitSkinList_ = ActivityLimitSkinMsg.S2C_LimitSkinInfo_23402.mutableCopy(this.limitSkinList_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getLimitSkinListList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.limitSkinList_) : this.limitSkinList_);
         }

         public int getLimitSkinListCount() {
            return this.limitSkinList_.size();
         }

         public int getLimitSkinList(int index) {
            return this.limitSkinList_.getInt(index);
         }

         public Builder setLimitSkinList(int index, int value) {
            this.ensureLimitSkinListIsMutable();
            this.limitSkinList_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addLimitSkinList(int value) {
            this.ensureLimitSkinListIsMutable();
            this.limitSkinList_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllLimitSkinList(Iterable<? extends Integer> values) {
            this.ensureLimitSkinListIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.limitSkinList_);
            this.onChanged();
            return this;
         }

         public Builder clearLimitSkinList() {
            this.limitSkinList_ = ActivityLimitSkinMsg.S2C_LimitSkinInfo_23402.emptyIntList();
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

   public interface C2S_LimitSkinInfo_23401OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_LimitSkinInfo_23402OrBuilder extends MessageOrBuilder {
      List<Integer> getLimitSkinListList();

      int getLimitSkinListCount();

      int getLimitSkinList(int index);
   }
}
