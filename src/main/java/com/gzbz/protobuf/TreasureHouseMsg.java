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
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class TreasureHouseMsg {
   private static final Descriptors.Descriptor internal_static_treasureHouse_com_gzbz_protobuf_C2S_AllFreeReward_15001_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_treasureHouse_com_gzbz_protobuf_C2S_AllFreeReward_15001_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_treasureHouse_com_gzbz_protobuf_S2C_AllFreeReward_15002_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_treasureHouse_com_gzbz_protobuf_S2C_AllFreeReward_15002_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private TreasureHouseMsg() {
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
      String[] descriptorData = new String[]{"\n\u0013TreasureHouse.proto\u0012\u001ftreasureHouse.com.gzbz.protobuf\"\u0019\n\u0017C2S_AllFreeReward_15001\"\u0019\n\u0017S2C_AllFreeReward_15002B'\n\u0011com.gzbz.protobufB\u0010TreasureHouseMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_treasureHouse_com_gzbz_protobuf_C2S_AllFreeReward_15001_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_treasureHouse_com_gzbz_protobuf_C2S_AllFreeReward_15001_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_treasureHouse_com_gzbz_protobuf_C2S_AllFreeReward_15001_descriptor, new String[0]);
      internal_static_treasureHouse_com_gzbz_protobuf_S2C_AllFreeReward_15002_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_treasureHouse_com_gzbz_protobuf_S2C_AllFreeReward_15002_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_treasureHouse_com_gzbz_protobuf_S2C_AllFreeReward_15002_descriptor, new String[0]);
   }

   public static final class C2S_AllFreeReward_15001 extends GeneratedMessageV3 implements C2S_AllFreeReward_15001OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_AllFreeReward_15001 DEFAULT_INSTANCE = new C2S_AllFreeReward_15001();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AllFreeReward_15001> PARSER = new AbstractParser<C2S_AllFreeReward_15001>() {
         public C2S_AllFreeReward_15001 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AllFreeReward_15001(input, extensionRegistry);
         }
      };

      private C2S_AllFreeReward_15001(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AllFreeReward_15001() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AllFreeReward_15001();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AllFreeReward_15001(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TreasureHouseMsg.internal_static_treasureHouse_com_gzbz_protobuf_C2S_AllFreeReward_15001_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TreasureHouseMsg.internal_static_treasureHouse_com_gzbz_protobuf_C2S_AllFreeReward_15001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AllFreeReward_15001.class, Builder.class);
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
         } else if (!(obj instanceof C2S_AllFreeReward_15001)) {
            return super.equals(obj);
         } else {
            C2S_AllFreeReward_15001 other = (C2S_AllFreeReward_15001)obj;
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

      public static C2S_AllFreeReward_15001 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AllFreeReward_15001)PARSER.parseFrom(data);
      }

      public static C2S_AllFreeReward_15001 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AllFreeReward_15001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AllFreeReward_15001 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AllFreeReward_15001)PARSER.parseFrom(data);
      }

      public static C2S_AllFreeReward_15001 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AllFreeReward_15001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AllFreeReward_15001 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AllFreeReward_15001)PARSER.parseFrom(data);
      }

      public static C2S_AllFreeReward_15001 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AllFreeReward_15001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AllFreeReward_15001 parseFrom(InputStream input) throws IOException {
         return (C2S_AllFreeReward_15001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AllFreeReward_15001 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AllFreeReward_15001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AllFreeReward_15001 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AllFreeReward_15001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AllFreeReward_15001 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AllFreeReward_15001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AllFreeReward_15001 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AllFreeReward_15001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AllFreeReward_15001 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AllFreeReward_15001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AllFreeReward_15001 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AllFreeReward_15001 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AllFreeReward_15001> parser() {
         return PARSER;
      }

      public Parser<C2S_AllFreeReward_15001> getParserForType() {
         return PARSER;
      }

      public C2S_AllFreeReward_15001 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AllFreeReward_15001OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return TreasureHouseMsg.internal_static_treasureHouse_com_gzbz_protobuf_C2S_AllFreeReward_15001_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TreasureHouseMsg.internal_static_treasureHouse_com_gzbz_protobuf_C2S_AllFreeReward_15001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AllFreeReward_15001.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TreasureHouseMsg.C2S_AllFreeReward_15001.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TreasureHouseMsg.internal_static_treasureHouse_com_gzbz_protobuf_C2S_AllFreeReward_15001_descriptor;
         }

         public C2S_AllFreeReward_15001 getDefaultInstanceForType() {
            return TreasureHouseMsg.C2S_AllFreeReward_15001.getDefaultInstance();
         }

         public C2S_AllFreeReward_15001 build() {
            C2S_AllFreeReward_15001 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AllFreeReward_15001 buildPartial() {
            C2S_AllFreeReward_15001 result = new C2S_AllFreeReward_15001(this);
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
            if (other instanceof C2S_AllFreeReward_15001) {
               return this.mergeFrom((C2S_AllFreeReward_15001)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AllFreeReward_15001 other) {
            if (other == TreasureHouseMsg.C2S_AllFreeReward_15001.getDefaultInstance()) {
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
            C2S_AllFreeReward_15001 parsedMessage = null;

            try {
               parsedMessage = (C2S_AllFreeReward_15001)TreasureHouseMsg.C2S_AllFreeReward_15001.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AllFreeReward_15001)e.getUnfinishedMessage();
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

   public static final class S2C_AllFreeReward_15002 extends GeneratedMessageV3 implements S2C_AllFreeReward_15002OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_AllFreeReward_15002 DEFAULT_INSTANCE = new S2C_AllFreeReward_15002();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AllFreeReward_15002> PARSER = new AbstractParser<S2C_AllFreeReward_15002>() {
         public S2C_AllFreeReward_15002 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AllFreeReward_15002(input, extensionRegistry);
         }
      };

      private S2C_AllFreeReward_15002(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AllFreeReward_15002() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AllFreeReward_15002();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AllFreeReward_15002(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TreasureHouseMsg.internal_static_treasureHouse_com_gzbz_protobuf_S2C_AllFreeReward_15002_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TreasureHouseMsg.internal_static_treasureHouse_com_gzbz_protobuf_S2C_AllFreeReward_15002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AllFreeReward_15002.class, Builder.class);
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
         } else if (!(obj instanceof S2C_AllFreeReward_15002)) {
            return super.equals(obj);
         } else {
            S2C_AllFreeReward_15002 other = (S2C_AllFreeReward_15002)obj;
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

      public static S2C_AllFreeReward_15002 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AllFreeReward_15002)PARSER.parseFrom(data);
      }

      public static S2C_AllFreeReward_15002 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AllFreeReward_15002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AllFreeReward_15002 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AllFreeReward_15002)PARSER.parseFrom(data);
      }

      public static S2C_AllFreeReward_15002 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AllFreeReward_15002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AllFreeReward_15002 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AllFreeReward_15002)PARSER.parseFrom(data);
      }

      public static S2C_AllFreeReward_15002 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AllFreeReward_15002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AllFreeReward_15002 parseFrom(InputStream input) throws IOException {
         return (S2C_AllFreeReward_15002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AllFreeReward_15002 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AllFreeReward_15002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AllFreeReward_15002 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AllFreeReward_15002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AllFreeReward_15002 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AllFreeReward_15002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AllFreeReward_15002 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AllFreeReward_15002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AllFreeReward_15002 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AllFreeReward_15002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AllFreeReward_15002 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AllFreeReward_15002 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AllFreeReward_15002> parser() {
         return PARSER;
      }

      public Parser<S2C_AllFreeReward_15002> getParserForType() {
         return PARSER;
      }

      public S2C_AllFreeReward_15002 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AllFreeReward_15002OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return TreasureHouseMsg.internal_static_treasureHouse_com_gzbz_protobuf_S2C_AllFreeReward_15002_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TreasureHouseMsg.internal_static_treasureHouse_com_gzbz_protobuf_S2C_AllFreeReward_15002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AllFreeReward_15002.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TreasureHouseMsg.S2C_AllFreeReward_15002.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TreasureHouseMsg.internal_static_treasureHouse_com_gzbz_protobuf_S2C_AllFreeReward_15002_descriptor;
         }

         public S2C_AllFreeReward_15002 getDefaultInstanceForType() {
            return TreasureHouseMsg.S2C_AllFreeReward_15002.getDefaultInstance();
         }

         public S2C_AllFreeReward_15002 build() {
            S2C_AllFreeReward_15002 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AllFreeReward_15002 buildPartial() {
            S2C_AllFreeReward_15002 result = new S2C_AllFreeReward_15002(this);
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
            if (other instanceof S2C_AllFreeReward_15002) {
               return this.mergeFrom((S2C_AllFreeReward_15002)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AllFreeReward_15002 other) {
            if (other == TreasureHouseMsg.S2C_AllFreeReward_15002.getDefaultInstance()) {
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
            S2C_AllFreeReward_15002 parsedMessage = null;

            try {
               parsedMessage = (S2C_AllFreeReward_15002)TreasureHouseMsg.S2C_AllFreeReward_15002.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AllFreeReward_15002)e.getUnfinishedMessage();
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

   public interface C2S_AllFreeReward_15001OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_AllFreeReward_15002OrBuilder extends MessageOrBuilder {
   }
}
