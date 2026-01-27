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

public final class HeroPromoteMsg {
   private static final Descriptors.Descriptor internal_static_heroPromote_com_gzbz_protobuf_C2S_HeroPromoteInfo_18801_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPromote_com_gzbz_protobuf_C2S_HeroPromoteInfo_18801_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPromote_com_gzbz_protobuf_S2C_HeroPromoteInfo_18802_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPromote_com_gzbz_protobuf_S2C_HeroPromoteInfo_18802_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPromote_com_gzbz_protobuf_C2S_Upgrade_18803_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPromote_com_gzbz_protobuf_C2S_Upgrade_18803_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPromote_com_gzbz_protobuf_S2C_Upgrade_18804_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPromote_com_gzbz_protobuf_S2C_Upgrade_18804_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private HeroPromoteMsg() {
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
      String[] descriptorData = new String[]{"\n\u0011HeroPromote.proto\u0012\u001dheroPromote.com.gzbz.protobuf\"\u001b\n\u0019C2S_HeroPromoteInfo_18801\"\\\n\u0019S2C_HeroPromoteInfo_18802\u0012\r\n\u0005state\u0018\u0001 \u0002(\b\u0012\r\n\u0005level\u0018\u0002 \u0001(\u0005\u0012\r\n\u0005stage\u0018\u0003 \u0001(\u0005\u0012\u0012\n\nlevelLimit\u0018\u0004 \u0001(\u0005\"\u0013\n\u0011C2S_Upgrade_18803\"1\n\u0011S2C_Upgrade_18804\u0012\r\n\u0005level\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0002 \u0002(\u0005B%\n\u0011com.gzbz.protobufB\u000eHeroPromoteMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_heroPromote_com_gzbz_protobuf_C2S_HeroPromoteInfo_18801_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_heroPromote_com_gzbz_protobuf_C2S_HeroPromoteInfo_18801_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPromote_com_gzbz_protobuf_C2S_HeroPromoteInfo_18801_descriptor, new String[0]);
      internal_static_heroPromote_com_gzbz_protobuf_S2C_HeroPromoteInfo_18802_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_heroPromote_com_gzbz_protobuf_S2C_HeroPromoteInfo_18802_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPromote_com_gzbz_protobuf_S2C_HeroPromoteInfo_18802_descriptor, new String[]{"State", "Level", "Stage", "LevelLimit"});
      internal_static_heroPromote_com_gzbz_protobuf_C2S_Upgrade_18803_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_heroPromote_com_gzbz_protobuf_C2S_Upgrade_18803_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPromote_com_gzbz_protobuf_C2S_Upgrade_18803_descriptor, new String[0]);
      internal_static_heroPromote_com_gzbz_protobuf_S2C_Upgrade_18804_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_heroPromote_com_gzbz_protobuf_S2C_Upgrade_18804_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPromote_com_gzbz_protobuf_S2C_Upgrade_18804_descriptor, new String[]{"Level", "Stage"});
   }

   public static final class C2S_HeroPromoteInfo_18801 extends GeneratedMessageV3 implements C2S_HeroPromoteInfo_18801OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_HeroPromoteInfo_18801 DEFAULT_INSTANCE = new C2S_HeroPromoteInfo_18801();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroPromoteInfo_18801> PARSER = new AbstractParser<C2S_HeroPromoteInfo_18801>() {
         public C2S_HeroPromoteInfo_18801 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroPromoteInfo_18801(input, extensionRegistry);
         }
      };

      private C2S_HeroPromoteInfo_18801(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroPromoteInfo_18801() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroPromoteInfo_18801();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroPromoteInfo_18801(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroPromoteMsg.internal_static_heroPromote_com_gzbz_protobuf_C2S_HeroPromoteInfo_18801_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPromoteMsg.internal_static_heroPromote_com_gzbz_protobuf_C2S_HeroPromoteInfo_18801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroPromoteInfo_18801.class, Builder.class);
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
         } else if (!(obj instanceof C2S_HeroPromoteInfo_18801)) {
            return super.equals(obj);
         } else {
            C2S_HeroPromoteInfo_18801 other = (C2S_HeroPromoteInfo_18801)obj;
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

      public static C2S_HeroPromoteInfo_18801 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroPromoteInfo_18801)PARSER.parseFrom(data);
      }

      public static C2S_HeroPromoteInfo_18801 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroPromoteInfo_18801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroPromoteInfo_18801 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroPromoteInfo_18801)PARSER.parseFrom(data);
      }

      public static C2S_HeroPromoteInfo_18801 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroPromoteInfo_18801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroPromoteInfo_18801 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroPromoteInfo_18801)PARSER.parseFrom(data);
      }

      public static C2S_HeroPromoteInfo_18801 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroPromoteInfo_18801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroPromoteInfo_18801 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroPromoteInfo_18801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroPromoteInfo_18801 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroPromoteInfo_18801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroPromoteInfo_18801 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroPromoteInfo_18801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroPromoteInfo_18801 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroPromoteInfo_18801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroPromoteInfo_18801 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroPromoteInfo_18801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroPromoteInfo_18801 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroPromoteInfo_18801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroPromoteInfo_18801 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroPromoteInfo_18801 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroPromoteInfo_18801> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroPromoteInfo_18801> getParserForType() {
         return PARSER;
      }

      public C2S_HeroPromoteInfo_18801 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroPromoteInfo_18801OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPromoteMsg.internal_static_heroPromote_com_gzbz_protobuf_C2S_HeroPromoteInfo_18801_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPromoteMsg.internal_static_heroPromote_com_gzbz_protobuf_C2S_HeroPromoteInfo_18801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroPromoteInfo_18801.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPromoteMsg.C2S_HeroPromoteInfo_18801.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPromoteMsg.internal_static_heroPromote_com_gzbz_protobuf_C2S_HeroPromoteInfo_18801_descriptor;
         }

         public C2S_HeroPromoteInfo_18801 getDefaultInstanceForType() {
            return HeroPromoteMsg.C2S_HeroPromoteInfo_18801.getDefaultInstance();
         }

         public C2S_HeroPromoteInfo_18801 build() {
            C2S_HeroPromoteInfo_18801 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroPromoteInfo_18801 buildPartial() {
            C2S_HeroPromoteInfo_18801 result = new C2S_HeroPromoteInfo_18801(this);
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
            if (other instanceof C2S_HeroPromoteInfo_18801) {
               return this.mergeFrom((C2S_HeroPromoteInfo_18801)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroPromoteInfo_18801 other) {
            if (other == HeroPromoteMsg.C2S_HeroPromoteInfo_18801.getDefaultInstance()) {
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
            C2S_HeroPromoteInfo_18801 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroPromoteInfo_18801)HeroPromoteMsg.C2S_HeroPromoteInfo_18801.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroPromoteInfo_18801)e.getUnfinishedMessage();
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

   public static final class S2C_HeroPromoteInfo_18802 extends GeneratedMessageV3 implements S2C_HeroPromoteInfo_18802OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STATE_FIELD_NUMBER = 1;
      private boolean state_;
      public static final int LEVEL_FIELD_NUMBER = 2;
      private int level_;
      public static final int STAGE_FIELD_NUMBER = 3;
      private int stage_;
      public static final int LEVELLIMIT_FIELD_NUMBER = 4;
      private int levelLimit_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroPromoteInfo_18802 DEFAULT_INSTANCE = new S2C_HeroPromoteInfo_18802();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroPromoteInfo_18802> PARSER = new AbstractParser<S2C_HeroPromoteInfo_18802>() {
         public S2C_HeroPromoteInfo_18802 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroPromoteInfo_18802(input, extensionRegistry);
         }
      };

      private S2C_HeroPromoteInfo_18802(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroPromoteInfo_18802() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroPromoteInfo_18802();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroPromoteInfo_18802(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.state_ = input.readBool();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.level_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.stage_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.levelLimit_ = input.readInt32();
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
         return HeroPromoteMsg.internal_static_heroPromote_com_gzbz_protobuf_S2C_HeroPromoteInfo_18802_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPromoteMsg.internal_static_heroPromote_com_gzbz_protobuf_S2C_HeroPromoteInfo_18802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroPromoteInfo_18802.class, Builder.class);
      }

      public boolean hasState() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getState() {
         return this.state_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public boolean hasStage() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public boolean hasLevelLimit() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getLevelLimit() {
         return this.levelLimit_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.state_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.level_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.stage_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.levelLimit_);
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
               size += CodedOutputStream.computeBoolSize(1, this.state_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.level_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.stage_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.levelLimit_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HeroPromoteInfo_18802)) {
            return super.equals(obj);
         } else {
            S2C_HeroPromoteInfo_18802 other = (S2C_HeroPromoteInfo_18802)obj;
            if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else if (this.hasLevelLimit() != other.hasLevelLimit()) {
               return false;
            } else if (this.hasLevelLimit() && this.getLevelLimit() != other.getLevelLimit()) {
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
            if (this.hasState()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getState());
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLevel();
            }

            if (this.hasStage()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStage();
            }

            if (this.hasLevelLimit()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getLevelLimit();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HeroPromoteInfo_18802 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroPromoteInfo_18802)PARSER.parseFrom(data);
      }

      public static S2C_HeroPromoteInfo_18802 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroPromoteInfo_18802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroPromoteInfo_18802 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroPromoteInfo_18802)PARSER.parseFrom(data);
      }

      public static S2C_HeroPromoteInfo_18802 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroPromoteInfo_18802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroPromoteInfo_18802 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroPromoteInfo_18802)PARSER.parseFrom(data);
      }

      public static S2C_HeroPromoteInfo_18802 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroPromoteInfo_18802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroPromoteInfo_18802 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroPromoteInfo_18802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroPromoteInfo_18802 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroPromoteInfo_18802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroPromoteInfo_18802 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroPromoteInfo_18802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroPromoteInfo_18802 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroPromoteInfo_18802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroPromoteInfo_18802 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroPromoteInfo_18802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroPromoteInfo_18802 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroPromoteInfo_18802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroPromoteInfo_18802 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroPromoteInfo_18802 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroPromoteInfo_18802> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroPromoteInfo_18802> getParserForType() {
         return PARSER;
      }

      public S2C_HeroPromoteInfo_18802 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroPromoteInfo_18802OrBuilder {
         private int bitField0_;
         private boolean state_;
         private int level_;
         private int stage_;
         private int levelLimit_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPromoteMsg.internal_static_heroPromote_com_gzbz_protobuf_S2C_HeroPromoteInfo_18802_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPromoteMsg.internal_static_heroPromote_com_gzbz_protobuf_S2C_HeroPromoteInfo_18802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroPromoteInfo_18802.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPromoteMsg.S2C_HeroPromoteInfo_18802.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.state_ = false;
            this.bitField0_ &= -2;
            this.level_ = 0;
            this.bitField0_ &= -3;
            this.stage_ = 0;
            this.bitField0_ &= -5;
            this.levelLimit_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPromoteMsg.internal_static_heroPromote_com_gzbz_protobuf_S2C_HeroPromoteInfo_18802_descriptor;
         }

         public S2C_HeroPromoteInfo_18802 getDefaultInstanceForType() {
            return HeroPromoteMsg.S2C_HeroPromoteInfo_18802.getDefaultInstance();
         }

         public S2C_HeroPromoteInfo_18802 build() {
            S2C_HeroPromoteInfo_18802 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroPromoteInfo_18802 buildPartial() {
            S2C_HeroPromoteInfo_18802 result = new S2C_HeroPromoteInfo_18802(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.state_ = this.state_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.stage_ = this.stage_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.levelLimit_ = this.levelLimit_;
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
            if (other instanceof S2C_HeroPromoteInfo_18802) {
               return this.mergeFrom((S2C_HeroPromoteInfo_18802)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroPromoteInfo_18802 other) {
            if (other == HeroPromoteMsg.S2C_HeroPromoteInfo_18802.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasState()) {
                  this.setState(other.getState());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               if (other.hasLevelLimit()) {
                  this.setLevelLimit(other.getLevelLimit());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasState();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HeroPromoteInfo_18802 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroPromoteInfo_18802)HeroPromoteMsg.S2C_HeroPromoteInfo_18802.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroPromoteInfo_18802)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasState() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getState() {
            return this.state_;
         }

         public Builder setState(boolean value) {
            this.bitField0_ |= 1;
            this.state_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearState() {
            this.bitField0_ &= -2;
            this.state_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 2;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -3;
            this.level_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 4;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -5;
            this.stage_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLevelLimit() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getLevelLimit() {
            return this.levelLimit_;
         }

         public Builder setLevelLimit(int value) {
            this.bitField0_ |= 8;
            this.levelLimit_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevelLimit() {
            this.bitField0_ &= -9;
            this.levelLimit_ = 0;
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

   public static final class C2S_Upgrade_18803 extends GeneratedMessageV3 implements C2S_Upgrade_18803OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Upgrade_18803 DEFAULT_INSTANCE = new C2S_Upgrade_18803();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Upgrade_18803> PARSER = new AbstractParser<C2S_Upgrade_18803>() {
         public C2S_Upgrade_18803 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Upgrade_18803(input, extensionRegistry);
         }
      };

      private C2S_Upgrade_18803(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Upgrade_18803() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Upgrade_18803();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Upgrade_18803(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroPromoteMsg.internal_static_heroPromote_com_gzbz_protobuf_C2S_Upgrade_18803_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPromoteMsg.internal_static_heroPromote_com_gzbz_protobuf_C2S_Upgrade_18803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Upgrade_18803.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Upgrade_18803)) {
            return super.equals(obj);
         } else {
            C2S_Upgrade_18803 other = (C2S_Upgrade_18803)obj;
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

      public static C2S_Upgrade_18803 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_18803)PARSER.parseFrom(data);
      }

      public static C2S_Upgrade_18803 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_18803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Upgrade_18803 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_18803)PARSER.parseFrom(data);
      }

      public static C2S_Upgrade_18803 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_18803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Upgrade_18803 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_18803)PARSER.parseFrom(data);
      }

      public static C2S_Upgrade_18803 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_18803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Upgrade_18803 parseFrom(InputStream input) throws IOException {
         return (C2S_Upgrade_18803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Upgrade_18803 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Upgrade_18803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Upgrade_18803 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Upgrade_18803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Upgrade_18803 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Upgrade_18803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Upgrade_18803 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Upgrade_18803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Upgrade_18803 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Upgrade_18803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Upgrade_18803 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Upgrade_18803 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Upgrade_18803> parser() {
         return PARSER;
      }

      public Parser<C2S_Upgrade_18803> getParserForType() {
         return PARSER;
      }

      public C2S_Upgrade_18803 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Upgrade_18803OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPromoteMsg.internal_static_heroPromote_com_gzbz_protobuf_C2S_Upgrade_18803_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPromoteMsg.internal_static_heroPromote_com_gzbz_protobuf_C2S_Upgrade_18803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Upgrade_18803.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPromoteMsg.C2S_Upgrade_18803.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPromoteMsg.internal_static_heroPromote_com_gzbz_protobuf_C2S_Upgrade_18803_descriptor;
         }

         public C2S_Upgrade_18803 getDefaultInstanceForType() {
            return HeroPromoteMsg.C2S_Upgrade_18803.getDefaultInstance();
         }

         public C2S_Upgrade_18803 build() {
            C2S_Upgrade_18803 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Upgrade_18803 buildPartial() {
            C2S_Upgrade_18803 result = new C2S_Upgrade_18803(this);
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
            if (other instanceof C2S_Upgrade_18803) {
               return this.mergeFrom((C2S_Upgrade_18803)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Upgrade_18803 other) {
            if (other == HeroPromoteMsg.C2S_Upgrade_18803.getDefaultInstance()) {
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
            C2S_Upgrade_18803 parsedMessage = null;

            try {
               parsedMessage = (C2S_Upgrade_18803)HeroPromoteMsg.C2S_Upgrade_18803.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Upgrade_18803)e.getUnfinishedMessage();
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

   public static final class S2C_Upgrade_18804 extends GeneratedMessageV3 implements S2C_Upgrade_18804OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LEVEL_FIELD_NUMBER = 1;
      private int level_;
      public static final int STAGE_FIELD_NUMBER = 2;
      private int stage_;
      private byte memoizedIsInitialized;
      private static final S2C_Upgrade_18804 DEFAULT_INSTANCE = new S2C_Upgrade_18804();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Upgrade_18804> PARSER = new AbstractParser<S2C_Upgrade_18804>() {
         public S2C_Upgrade_18804 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Upgrade_18804(input, extensionRegistry);
         }
      };

      private S2C_Upgrade_18804(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Upgrade_18804() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Upgrade_18804();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Upgrade_18804(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.stage_ = input.readInt32();
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
         return HeroPromoteMsg.internal_static_heroPromote_com_gzbz_protobuf_S2C_Upgrade_18804_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPromoteMsg.internal_static_heroPromote_com_gzbz_protobuf_S2C_Upgrade_18804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Upgrade_18804.class, Builder.class);
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public boolean hasStage() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStage() {
         return this.stage_;
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
         } else if (!this.hasStage()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.stage_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.stage_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Upgrade_18804)) {
            return super.equals(obj);
         } else {
            S2C_Upgrade_18804 other = (S2C_Upgrade_18804)obj;
            if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
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

            if (this.hasStage()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStage();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Upgrade_18804 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_18804)PARSER.parseFrom(data);
      }

      public static S2C_Upgrade_18804 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_18804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Upgrade_18804 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_18804)PARSER.parseFrom(data);
      }

      public static S2C_Upgrade_18804 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_18804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Upgrade_18804 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_18804)PARSER.parseFrom(data);
      }

      public static S2C_Upgrade_18804 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_18804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Upgrade_18804 parseFrom(InputStream input) throws IOException {
         return (S2C_Upgrade_18804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Upgrade_18804 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Upgrade_18804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Upgrade_18804 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Upgrade_18804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Upgrade_18804 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Upgrade_18804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Upgrade_18804 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Upgrade_18804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Upgrade_18804 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Upgrade_18804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Upgrade_18804 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Upgrade_18804 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Upgrade_18804> parser() {
         return PARSER;
      }

      public Parser<S2C_Upgrade_18804> getParserForType() {
         return PARSER;
      }

      public S2C_Upgrade_18804 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Upgrade_18804OrBuilder {
         private int bitField0_;
         private int level_;
         private int stage_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPromoteMsg.internal_static_heroPromote_com_gzbz_protobuf_S2C_Upgrade_18804_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPromoteMsg.internal_static_heroPromote_com_gzbz_protobuf_S2C_Upgrade_18804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Upgrade_18804.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPromoteMsg.S2C_Upgrade_18804.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.level_ = 0;
            this.bitField0_ &= -2;
            this.stage_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPromoteMsg.internal_static_heroPromote_com_gzbz_protobuf_S2C_Upgrade_18804_descriptor;
         }

         public S2C_Upgrade_18804 getDefaultInstanceForType() {
            return HeroPromoteMsg.S2C_Upgrade_18804.getDefaultInstance();
         }

         public S2C_Upgrade_18804 build() {
            S2C_Upgrade_18804 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Upgrade_18804 buildPartial() {
            S2C_Upgrade_18804 result = new S2C_Upgrade_18804(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.stage_ = this.stage_;
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
            if (other instanceof S2C_Upgrade_18804) {
               return this.mergeFrom((S2C_Upgrade_18804)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Upgrade_18804 other) {
            if (other == HeroPromoteMsg.S2C_Upgrade_18804.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLevel()) {
               return false;
            } else {
               return this.hasStage();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Upgrade_18804 parsedMessage = null;

            try {
               parsedMessage = (S2C_Upgrade_18804)HeroPromoteMsg.S2C_Upgrade_18804.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Upgrade_18804)e.getUnfinishedMessage();
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

         public boolean hasStage() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 2;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -3;
            this.stage_ = 0;
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

   public interface C2S_HeroPromoteInfo_18801OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Upgrade_18803OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_HeroPromoteInfo_18802OrBuilder extends MessageOrBuilder {
      boolean hasState();

      boolean getState();

      boolean hasLevel();

      int getLevel();

      boolean hasStage();

      int getStage();

      boolean hasLevelLimit();

      int getLevelLimit();
   }

   public interface S2C_Upgrade_18804OrBuilder extends MessageOrBuilder {
      boolean hasLevel();

      int getLevel();

      boolean hasStage();

      int getStage();
   }
}
