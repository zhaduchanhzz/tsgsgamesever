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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class DivineGeneralsMsg {
   private static final Descriptors.Descriptor internal_static_divineGenerals_com_gzbz_protobuf_Divine_Info_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_divineGenerals_com_gzbz_protobuf_Divine_Info_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_divineGenerals_com_gzbz_protobuf_C2S_DivineGeneralsInfo_10001_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_divineGenerals_com_gzbz_protobuf_C2S_DivineGeneralsInfo_10001_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_divineGenerals_com_gzbz_protobuf_S2C_DivineGeneralsInfo_10002_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_divineGenerals_com_gzbz_protobuf_S2C_DivineGeneralsInfo_10002_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_divineGenerals_com_gzbz_protobuf_C2S_Upgrade_10003_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_divineGenerals_com_gzbz_protobuf_C2S_Upgrade_10003_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_divineGenerals_com_gzbz_protobuf_S2C_Upgrade_10004_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_divineGenerals_com_gzbz_protobuf_S2C_Upgrade_10004_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private DivineGeneralsMsg() {
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
      String[] descriptorData = new String[]{"\n\u0014DivineGenerals.proto\u0012 divineGenerals.com.gzbz.protobuf\"8\n\u000bDivine_Info\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006useNew\u0018\u0003 \u0002(\b\"\u001e\n\u001cC2S_DivineGeneralsInfo_10001\"[\n\u001cS2C_DivineGeneralsInfo_10002\u0012;\n\u0004info\u0018\u0001 \u0003(\u000b2-.divineGenerals.com.gzbz.protobuf.Divine_Info\"1\n\u0011C2S_Upgrade_10003\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bheroCode\u0018\u0002 \u0003(\u0005\"P\n\u0011S2C_Upgrade_10004\u0012;\n\u0004info\u0018\u0001 \u0002(\u000b2-.divineGenerals.com.gzbz.protobuf.Divine_InfoB(\n\u0011com.gzbz.protobufB\u0011DivineGeneralsMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_divineGenerals_com_gzbz_protobuf_Divine_Info_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_divineGenerals_com_gzbz_protobuf_Divine_Info_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_divineGenerals_com_gzbz_protobuf_Divine_Info_descriptor, new String[]{"Id", "Level", "UseNew"});
      internal_static_divineGenerals_com_gzbz_protobuf_C2S_DivineGeneralsInfo_10001_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_divineGenerals_com_gzbz_protobuf_C2S_DivineGeneralsInfo_10001_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_divineGenerals_com_gzbz_protobuf_C2S_DivineGeneralsInfo_10001_descriptor, new String[0]);
      internal_static_divineGenerals_com_gzbz_protobuf_S2C_DivineGeneralsInfo_10002_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_divineGenerals_com_gzbz_protobuf_S2C_DivineGeneralsInfo_10002_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_divineGenerals_com_gzbz_protobuf_S2C_DivineGeneralsInfo_10002_descriptor, new String[]{"Info"});
      internal_static_divineGenerals_com_gzbz_protobuf_C2S_Upgrade_10003_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_divineGenerals_com_gzbz_protobuf_C2S_Upgrade_10003_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_divineGenerals_com_gzbz_protobuf_C2S_Upgrade_10003_descriptor, new String[]{"Id", "HeroCode"});
      internal_static_divineGenerals_com_gzbz_protobuf_S2C_Upgrade_10004_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_divineGenerals_com_gzbz_protobuf_S2C_Upgrade_10004_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_divineGenerals_com_gzbz_protobuf_S2C_Upgrade_10004_descriptor, new String[]{"Info"});
   }

   public static final class Divine_Info extends GeneratedMessageV3 implements Divine_InfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int LEVEL_FIELD_NUMBER = 2;
      private int level_;
      public static final int USENEW_FIELD_NUMBER = 3;
      private boolean useNew_;
      private byte memoizedIsInitialized;
      private static final Divine_Info DEFAULT_INSTANCE = new Divine_Info();
      /** @deprecated */
      @Deprecated
      public static final Parser<Divine_Info> PARSER = new AbstractParser<Divine_Info>() {
         public Divine_Info parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new Divine_Info(input, extensionRegistry);
         }
      };

      private Divine_Info(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private Divine_Info() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new Divine_Info();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private Divine_Info(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.level_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.useNew_ = input.readBool();
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
         return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_Divine_Info_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_Divine_Info_fieldAccessorTable.ensureFieldAccessorsInitialized(Divine_Info.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public boolean hasUseNew() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getUseNew() {
         return this.useNew_;
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
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasUseNew()) {
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
            output.writeInt32(2, this.level_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.useNew_);
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
               size += CodedOutputStream.computeInt32Size(2, this.level_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.useNew_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof Divine_Info)) {
            return super.equals(obj);
         } else {
            Divine_Info other = (Divine_Info)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (this.hasUseNew() != other.hasUseNew()) {
               return false;
            } else if (this.hasUseNew() && this.getUseNew() != other.getUseNew()) {
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

            if (this.hasLevel()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLevel();
            }

            if (this.hasUseNew()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getUseNew());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static Divine_Info parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (Divine_Info)PARSER.parseFrom(data);
      }

      public static Divine_Info parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Divine_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Divine_Info parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (Divine_Info)PARSER.parseFrom(data);
      }

      public static Divine_Info parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Divine_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Divine_Info parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (Divine_Info)PARSER.parseFrom(data);
      }

      public static Divine_Info parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Divine_Info)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Divine_Info parseFrom(InputStream input) throws IOException {
         return (Divine_Info)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static Divine_Info parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Divine_Info)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static Divine_Info parseDelimitedFrom(InputStream input) throws IOException {
         return (Divine_Info)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static Divine_Info parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Divine_Info)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static Divine_Info parseFrom(CodedInputStream input) throws IOException {
         return (Divine_Info)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static Divine_Info parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Divine_Info)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(Divine_Info prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static Divine_Info getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<Divine_Info> parser() {
         return PARSER;
      }

      public Parser<Divine_Info> getParserForType() {
         return PARSER;
      }

      public Divine_Info getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Divine_InfoOrBuilder {
         private int bitField0_;
         private int id_;
         private int level_;
         private boolean useNew_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_Divine_Info_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_Divine_Info_fieldAccessorTable.ensureFieldAccessorsInitialized(Divine_Info.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DivineGeneralsMsg.Divine_Info.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.level_ = 0;
            this.bitField0_ &= -3;
            this.useNew_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_Divine_Info_descriptor;
         }

         public Divine_Info getDefaultInstanceForType() {
            return DivineGeneralsMsg.Divine_Info.getDefaultInstance();
         }

         public Divine_Info build() {
            Divine_Info result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public Divine_Info buildPartial() {
            Divine_Info result = new Divine_Info(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.useNew_ = this.useNew_;
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
            if (other instanceof Divine_Info) {
               return this.mergeFrom((Divine_Info)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(Divine_Info other) {
            if (other == DivineGeneralsMsg.Divine_Info.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (other.hasUseNew()) {
                  this.setUseNew(other.getUseNew());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else if (!this.hasLevel()) {
               return false;
            } else {
               return this.hasUseNew();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            Divine_Info parsedMessage = null;

            try {
               parsedMessage = (Divine_Info)DivineGeneralsMsg.Divine_Info.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (Divine_Info)e.getUnfinishedMessage();
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

         public boolean hasUseNew() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getUseNew() {
            return this.useNew_;
         }

         public Builder setUseNew(boolean value) {
            this.bitField0_ |= 4;
            this.useNew_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUseNew() {
            this.bitField0_ &= -5;
            this.useNew_ = false;
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

   public static final class C2S_DivineGeneralsInfo_10001 extends GeneratedMessageV3 implements C2S_DivineGeneralsInfo_10001OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DivineGeneralsInfo_10001 DEFAULT_INSTANCE = new C2S_DivineGeneralsInfo_10001();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DivineGeneralsInfo_10001> PARSER = new AbstractParser<C2S_DivineGeneralsInfo_10001>() {
         public C2S_DivineGeneralsInfo_10001 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DivineGeneralsInfo_10001(input, extensionRegistry);
         }
      };

      private C2S_DivineGeneralsInfo_10001(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DivineGeneralsInfo_10001() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DivineGeneralsInfo_10001();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DivineGeneralsInfo_10001(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_C2S_DivineGeneralsInfo_10001_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_C2S_DivineGeneralsInfo_10001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DivineGeneralsInfo_10001.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DivineGeneralsInfo_10001)) {
            return super.equals(obj);
         } else {
            C2S_DivineGeneralsInfo_10001 other = (C2S_DivineGeneralsInfo_10001)obj;
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

      public static C2S_DivineGeneralsInfo_10001 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DivineGeneralsInfo_10001)PARSER.parseFrom(data);
      }

      public static C2S_DivineGeneralsInfo_10001 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DivineGeneralsInfo_10001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DivineGeneralsInfo_10001 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DivineGeneralsInfo_10001)PARSER.parseFrom(data);
      }

      public static C2S_DivineGeneralsInfo_10001 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DivineGeneralsInfo_10001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DivineGeneralsInfo_10001 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DivineGeneralsInfo_10001)PARSER.parseFrom(data);
      }

      public static C2S_DivineGeneralsInfo_10001 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DivineGeneralsInfo_10001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DivineGeneralsInfo_10001 parseFrom(InputStream input) throws IOException {
         return (C2S_DivineGeneralsInfo_10001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DivineGeneralsInfo_10001 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DivineGeneralsInfo_10001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DivineGeneralsInfo_10001 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DivineGeneralsInfo_10001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DivineGeneralsInfo_10001 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DivineGeneralsInfo_10001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DivineGeneralsInfo_10001 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DivineGeneralsInfo_10001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DivineGeneralsInfo_10001 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DivineGeneralsInfo_10001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DivineGeneralsInfo_10001 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DivineGeneralsInfo_10001 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DivineGeneralsInfo_10001> parser() {
         return PARSER;
      }

      public Parser<C2S_DivineGeneralsInfo_10001> getParserForType() {
         return PARSER;
      }

      public C2S_DivineGeneralsInfo_10001 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DivineGeneralsInfo_10001OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_C2S_DivineGeneralsInfo_10001_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_C2S_DivineGeneralsInfo_10001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DivineGeneralsInfo_10001.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DivineGeneralsMsg.C2S_DivineGeneralsInfo_10001.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_C2S_DivineGeneralsInfo_10001_descriptor;
         }

         public C2S_DivineGeneralsInfo_10001 getDefaultInstanceForType() {
            return DivineGeneralsMsg.C2S_DivineGeneralsInfo_10001.getDefaultInstance();
         }

         public C2S_DivineGeneralsInfo_10001 build() {
            C2S_DivineGeneralsInfo_10001 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DivineGeneralsInfo_10001 buildPartial() {
            C2S_DivineGeneralsInfo_10001 result = new C2S_DivineGeneralsInfo_10001(this);
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
            if (other instanceof C2S_DivineGeneralsInfo_10001) {
               return this.mergeFrom((C2S_DivineGeneralsInfo_10001)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DivineGeneralsInfo_10001 other) {
            if (other == DivineGeneralsMsg.C2S_DivineGeneralsInfo_10001.getDefaultInstance()) {
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
            C2S_DivineGeneralsInfo_10001 parsedMessage = null;

            try {
               parsedMessage = (C2S_DivineGeneralsInfo_10001)DivineGeneralsMsg.C2S_DivineGeneralsInfo_10001.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DivineGeneralsInfo_10001)e.getUnfinishedMessage();
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

   public static final class S2C_DivineGeneralsInfo_10002 extends GeneratedMessageV3 implements S2C_DivineGeneralsInfo_10002OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFO_FIELD_NUMBER = 1;
      private List<Divine_Info> info_;
      private byte memoizedIsInitialized;
      private static final S2C_DivineGeneralsInfo_10002 DEFAULT_INSTANCE = new S2C_DivineGeneralsInfo_10002();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DivineGeneralsInfo_10002> PARSER = new AbstractParser<S2C_DivineGeneralsInfo_10002>() {
         public S2C_DivineGeneralsInfo_10002 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DivineGeneralsInfo_10002(input, extensionRegistry);
         }
      };

      private S2C_DivineGeneralsInfo_10002(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DivineGeneralsInfo_10002() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DivineGeneralsInfo_10002();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DivineGeneralsInfo_10002(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.info_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.info_.add(input.readMessage(DivineGeneralsMsg.Divine_Info.PARSER, extensionRegistry));
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
                  this.info_ = Collections.unmodifiableList(this.info_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_S2C_DivineGeneralsInfo_10002_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_S2C_DivineGeneralsInfo_10002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DivineGeneralsInfo_10002.class, Builder.class);
      }

      public List<Divine_Info> getInfoList() {
         return this.info_;
      }

      public List<? extends Divine_InfoOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public Divine_Info getInfo(int index) {
         return (Divine_Info)this.info_.get(index);
      }

      public Divine_InfoOrBuilder getInfoOrBuilder(int index) {
         return (Divine_InfoOrBuilder)this.info_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getInfoCount(); ++i) {
               if (!this.getInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.info_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.info_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.info_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.info_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DivineGeneralsInfo_10002)) {
            return super.equals(obj);
         } else {
            S2C_DivineGeneralsInfo_10002 other = (S2C_DivineGeneralsInfo_10002)obj;
            if (!this.getInfoList().equals(other.getInfoList())) {
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
            if (this.getInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DivineGeneralsInfo_10002 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DivineGeneralsInfo_10002)PARSER.parseFrom(data);
      }

      public static S2C_DivineGeneralsInfo_10002 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DivineGeneralsInfo_10002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DivineGeneralsInfo_10002 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DivineGeneralsInfo_10002)PARSER.parseFrom(data);
      }

      public static S2C_DivineGeneralsInfo_10002 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DivineGeneralsInfo_10002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DivineGeneralsInfo_10002 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DivineGeneralsInfo_10002)PARSER.parseFrom(data);
      }

      public static S2C_DivineGeneralsInfo_10002 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DivineGeneralsInfo_10002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DivineGeneralsInfo_10002 parseFrom(InputStream input) throws IOException {
         return (S2C_DivineGeneralsInfo_10002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DivineGeneralsInfo_10002 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DivineGeneralsInfo_10002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DivineGeneralsInfo_10002 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DivineGeneralsInfo_10002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DivineGeneralsInfo_10002 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DivineGeneralsInfo_10002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DivineGeneralsInfo_10002 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DivineGeneralsInfo_10002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DivineGeneralsInfo_10002 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DivineGeneralsInfo_10002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DivineGeneralsInfo_10002 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DivineGeneralsInfo_10002 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DivineGeneralsInfo_10002> parser() {
         return PARSER;
      }

      public Parser<S2C_DivineGeneralsInfo_10002> getParserForType() {
         return PARSER;
      }

      public S2C_DivineGeneralsInfo_10002 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DivineGeneralsInfo_10002OrBuilder {
         private int bitField0_;
         private List<Divine_Info> info_;
         private RepeatedFieldBuilderV3<Divine_Info, Divine_Info.Builder, Divine_InfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_S2C_DivineGeneralsInfo_10002_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_S2C_DivineGeneralsInfo_10002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DivineGeneralsInfo_10002.class, Builder.class);
         }

         private Builder() {
            this.info_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.info_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DivineGeneralsMsg.S2C_DivineGeneralsInfo_10002.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infoBuilder_ == null) {
               this.info_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.infoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_S2C_DivineGeneralsInfo_10002_descriptor;
         }

         public S2C_DivineGeneralsInfo_10002 getDefaultInstanceForType() {
            return DivineGeneralsMsg.S2C_DivineGeneralsInfo_10002.getDefaultInstance();
         }

         public S2C_DivineGeneralsInfo_10002 build() {
            S2C_DivineGeneralsInfo_10002 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DivineGeneralsInfo_10002 buildPartial() {
            S2C_DivineGeneralsInfo_10002 result = new S2C_DivineGeneralsInfo_10002(this);
            int from_bitField0_ = this.bitField0_;
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.info_ = Collections.unmodifiableList(this.info_);
                  this.bitField0_ &= -2;
               }

               result.info_ = this.info_;
            } else {
               result.info_ = this.infoBuilder_.build();
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
            if (other instanceof S2C_DivineGeneralsInfo_10002) {
               return this.mergeFrom((S2C_DivineGeneralsInfo_10002)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DivineGeneralsInfo_10002 other) {
            if (other == DivineGeneralsMsg.S2C_DivineGeneralsInfo_10002.getDefaultInstance()) {
               return this;
            } else {
               if (this.infoBuilder_ == null) {
                  if (!other.info_.isEmpty()) {
                     if (this.info_.isEmpty()) {
                        this.info_ = other.info_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureInfoIsMutable();
                        this.info_.addAll(other.info_);
                     }

                     this.onChanged();
                  }
               } else if (!other.info_.isEmpty()) {
                  if (this.infoBuilder_.isEmpty()) {
                     this.infoBuilder_.dispose();
                     this.infoBuilder_ = null;
                     this.info_ = other.info_;
                     this.bitField0_ &= -2;
                     this.infoBuilder_ = DivineGeneralsMsg.S2C_DivineGeneralsInfo_10002.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
                  } else {
                     this.infoBuilder_.addAllMessages(other.info_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getInfoCount(); ++i) {
               if (!this.getInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DivineGeneralsInfo_10002 parsedMessage = null;

            try {
               parsedMessage = (S2C_DivineGeneralsInfo_10002)DivineGeneralsMsg.S2C_DivineGeneralsInfo_10002.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DivineGeneralsInfo_10002)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.info_ = new ArrayList(this.info_);
               this.bitField0_ |= 1;
            }

         }

         public List<Divine_Info> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public Divine_Info getInfo(int index) {
            return this.infoBuilder_ == null ? (Divine_Info)this.info_.get(index) : (Divine_Info)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, Divine_Info value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoIsMutable();
               this.info_.set(index, value);
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInfo(int index, Divine_Info.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(Divine_Info value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoIsMutable();
               this.info_.add(value);
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInfo(int index, Divine_Info value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoIsMutable();
               this.info_.add(index, value);
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInfo(Divine_Info.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, Divine_Info.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends Divine_Info> values) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.info_);
               this.onChanged();
            } else {
               this.infoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            return this;
         }

         public Builder removeInfo(int index) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.remove(index);
               this.onChanged();
            } else {
               this.infoBuilder_.remove(index);
            }

            return this;
         }

         public Divine_Info.Builder getInfoBuilder(int index) {
            return (Divine_Info.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public Divine_InfoOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (Divine_InfoOrBuilder)this.info_.get(index) : (Divine_InfoOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends Divine_InfoOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public Divine_Info.Builder addInfoBuilder() {
            return (Divine_Info.Builder)this.getInfoFieldBuilder().addBuilder(DivineGeneralsMsg.Divine_Info.getDefaultInstance());
         }

         public Divine_Info.Builder addInfoBuilder(int index) {
            return (Divine_Info.Builder)this.getInfoFieldBuilder().addBuilder(index, DivineGeneralsMsg.Divine_Info.getDefaultInstance());
         }

         public List<Divine_Info.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<Divine_Info, Divine_Info.Builder, Divine_InfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new RepeatedFieldBuilderV3(this.info_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_Upgrade_10003 extends GeneratedMessageV3 implements C2S_Upgrade_10003OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private Internal.IntList heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_Upgrade_10003 DEFAULT_INSTANCE = new C2S_Upgrade_10003();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Upgrade_10003> PARSER = new AbstractParser<C2S_Upgrade_10003>() {
         public C2S_Upgrade_10003 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Upgrade_10003(input, extensionRegistry);
         }
      };

      private C2S_Upgrade_10003(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Upgrade_10003() {
         this.memoizedIsInitialized = -1;
         this.heroCode_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Upgrade_10003();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Upgrade_10003(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.heroCode_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.heroCode_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.heroCode_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.heroCode_.addInt(input.readInt32());
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
                  this.heroCode_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_C2S_Upgrade_10003_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_C2S_Upgrade_10003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Upgrade_10003.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public List<Integer> getHeroCodeList() {
         return this.heroCode_;
      }

      public int getHeroCodeCount() {
         return this.heroCode_.size();
      }

      public int getHeroCode(int index) {
         return this.heroCode_.getInt(index);
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

         for(int i = 0; i < this.heroCode_.size(); ++i) {
            output.writeInt32(2, this.heroCode_.getInt(i));
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

            for(int i = 0; i < this.heroCode_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.heroCode_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHeroCodeList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Upgrade_10003)) {
            return super.equals(obj);
         } else {
            C2S_Upgrade_10003 other = (C2S_Upgrade_10003)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (!this.getHeroCodeList().equals(other.getHeroCodeList())) {
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

            if (this.getHeroCodeCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCodeList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Upgrade_10003 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_10003)PARSER.parseFrom(data);
      }

      public static C2S_Upgrade_10003 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_10003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Upgrade_10003 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_10003)PARSER.parseFrom(data);
      }

      public static C2S_Upgrade_10003 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_10003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Upgrade_10003 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_10003)PARSER.parseFrom(data);
      }

      public static C2S_Upgrade_10003 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_10003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Upgrade_10003 parseFrom(InputStream input) throws IOException {
         return (C2S_Upgrade_10003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Upgrade_10003 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Upgrade_10003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Upgrade_10003 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Upgrade_10003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Upgrade_10003 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Upgrade_10003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Upgrade_10003 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Upgrade_10003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Upgrade_10003 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Upgrade_10003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Upgrade_10003 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Upgrade_10003 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Upgrade_10003> parser() {
         return PARSER;
      }

      public Parser<C2S_Upgrade_10003> getParserForType() {
         return PARSER;
      }

      public C2S_Upgrade_10003 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Upgrade_10003OrBuilder {
         private int bitField0_;
         private int id_;
         private Internal.IntList heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_C2S_Upgrade_10003_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_C2S_Upgrade_10003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Upgrade_10003.class, Builder.class);
         }

         private Builder() {
            this.heroCode_ = DivineGeneralsMsg.C2S_Upgrade_10003.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroCode_ = DivineGeneralsMsg.C2S_Upgrade_10003.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DivineGeneralsMsg.C2S_Upgrade_10003.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.heroCode_ = DivineGeneralsMsg.C2S_Upgrade_10003.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_C2S_Upgrade_10003_descriptor;
         }

         public C2S_Upgrade_10003 getDefaultInstanceForType() {
            return DivineGeneralsMsg.C2S_Upgrade_10003.getDefaultInstance();
         }

         public C2S_Upgrade_10003 build() {
            C2S_Upgrade_10003 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Upgrade_10003 buildPartial() {
            C2S_Upgrade_10003 result = new C2S_Upgrade_10003(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.heroCode_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.heroCode_ = this.heroCode_;
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
            if (other instanceof C2S_Upgrade_10003) {
               return this.mergeFrom((C2S_Upgrade_10003)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Upgrade_10003 other) {
            if (other == DivineGeneralsMsg.C2S_Upgrade_10003.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (!other.heroCode_.isEmpty()) {
                  if (this.heroCode_.isEmpty()) {
                     this.heroCode_ = other.heroCode_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureHeroCodeIsMutable();
                     this.heroCode_.addAll(other.heroCode_);
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
            C2S_Upgrade_10003 parsedMessage = null;

            try {
               parsedMessage = (C2S_Upgrade_10003)DivineGeneralsMsg.C2S_Upgrade_10003.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Upgrade_10003)e.getUnfinishedMessage();
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

         private void ensureHeroCodeIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.heroCode_ = DivineGeneralsMsg.C2S_Upgrade_10003.mutableCopy(this.heroCode_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getHeroCodeList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.heroCode_) : this.heroCode_);
         }

         public int getHeroCodeCount() {
            return this.heroCode_.size();
         }

         public int getHeroCode(int index) {
            return this.heroCode_.getInt(index);
         }

         public Builder setHeroCode(int index, int value) {
            this.ensureHeroCodeIsMutable();
            this.heroCode_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHeroCode(int value) {
            this.ensureHeroCodeIsMutable();
            this.heroCode_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHeroCode(Iterable<? extends Integer> values) {
            this.ensureHeroCodeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroCode_);
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.heroCode_ = DivineGeneralsMsg.C2S_Upgrade_10003.emptyIntList();
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

   public static final class S2C_Upgrade_10004 extends GeneratedMessageV3 implements S2C_Upgrade_10004OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private Divine_Info info_;
      private byte memoizedIsInitialized;
      private static final S2C_Upgrade_10004 DEFAULT_INSTANCE = new S2C_Upgrade_10004();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Upgrade_10004> PARSER = new AbstractParser<S2C_Upgrade_10004>() {
         public S2C_Upgrade_10004 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Upgrade_10004(input, extensionRegistry);
         }
      };

      private S2C_Upgrade_10004(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Upgrade_10004() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Upgrade_10004();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Upgrade_10004(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        Divine_Info.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (Divine_Info)input.readMessage(DivineGeneralsMsg.Divine_Info.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
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
         return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_S2C_Upgrade_10004_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_S2C_Upgrade_10004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Upgrade_10004.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public Divine_Info getInfo() {
         return this.info_ == null ? DivineGeneralsMsg.Divine_Info.getDefaultInstance() : this.info_;
      }

      public Divine_InfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? DivineGeneralsMsg.Divine_Info.getDefaultInstance() : this.info_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Upgrade_10004)) {
            return super.equals(obj);
         } else {
            S2C_Upgrade_10004 other = (S2C_Upgrade_10004)obj;
            if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
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
            if (this.hasInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Upgrade_10004 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_10004)PARSER.parseFrom(data);
      }

      public static S2C_Upgrade_10004 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_10004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Upgrade_10004 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_10004)PARSER.parseFrom(data);
      }

      public static S2C_Upgrade_10004 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_10004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Upgrade_10004 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_10004)PARSER.parseFrom(data);
      }

      public static S2C_Upgrade_10004 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_10004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Upgrade_10004 parseFrom(InputStream input) throws IOException {
         return (S2C_Upgrade_10004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Upgrade_10004 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Upgrade_10004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Upgrade_10004 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Upgrade_10004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Upgrade_10004 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Upgrade_10004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Upgrade_10004 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Upgrade_10004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Upgrade_10004 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Upgrade_10004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Upgrade_10004 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Upgrade_10004 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Upgrade_10004> parser() {
         return PARSER;
      }

      public Parser<S2C_Upgrade_10004> getParserForType() {
         return PARSER;
      }

      public S2C_Upgrade_10004 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Upgrade_10004OrBuilder {
         private int bitField0_;
         private Divine_Info info_;
         private SingleFieldBuilderV3<Divine_Info, Divine_Info.Builder, Divine_InfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_S2C_Upgrade_10004_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_S2C_Upgrade_10004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Upgrade_10004.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DivineGeneralsMsg.S2C_Upgrade_10004.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infoBuilder_ == null) {
               this.info_ = null;
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DivineGeneralsMsg.internal_static_divineGenerals_com_gzbz_protobuf_S2C_Upgrade_10004_descriptor;
         }

         public S2C_Upgrade_10004 getDefaultInstanceForType() {
            return DivineGeneralsMsg.S2C_Upgrade_10004.getDefaultInstance();
         }

         public S2C_Upgrade_10004 build() {
            S2C_Upgrade_10004 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Upgrade_10004 buildPartial() {
            S2C_Upgrade_10004 result = new S2C_Upgrade_10004(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (Divine_Info)this.infoBuilder_.build();
               }

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
            if (other instanceof S2C_Upgrade_10004) {
               return this.mergeFrom((S2C_Upgrade_10004)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Upgrade_10004 other) {
            if (other == DivineGeneralsMsg.S2C_Upgrade_10004.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasInfo()) {
               return false;
            } else {
               return this.getInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Upgrade_10004 parsedMessage = null;

            try {
               parsedMessage = (S2C_Upgrade_10004)DivineGeneralsMsg.S2C_Upgrade_10004.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Upgrade_10004)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public Divine_Info getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? DivineGeneralsMsg.Divine_Info.getDefaultInstance() : this.info_;
            } else {
               return (Divine_Info)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(Divine_Info value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.info_ = value;
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setInfo(Divine_Info.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(Divine_Info value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != DivineGeneralsMsg.Divine_Info.getDefaultInstance()) {
                  this.info_ = DivineGeneralsMsg.Divine_Info.newBuilder(this.info_).mergeFrom(value).buildPartial();
               } else {
                  this.info_ = value;
               }

               this.onChanged();
            } else {
               this.infoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = null;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Divine_Info.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (Divine_Info.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public Divine_InfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (Divine_InfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? DivineGeneralsMsg.Divine_Info.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<Divine_Info, Divine_Info.Builder, Divine_InfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_DivineGeneralsInfo_10001OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Upgrade_10003OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      List<Integer> getHeroCodeList();

      int getHeroCodeCount();

      int getHeroCode(int index);
   }

   public interface Divine_InfoOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasLevel();

      int getLevel();

      boolean hasUseNew();

      boolean getUseNew();
   }

   public interface S2C_DivineGeneralsInfo_10002OrBuilder extends MessageOrBuilder {
      List<Divine_Info> getInfoList();

      Divine_Info getInfo(int index);

      int getInfoCount();

      List<? extends Divine_InfoOrBuilder> getInfoOrBuilderList();

      Divine_InfoOrBuilder getInfoOrBuilder(int index);
   }

   public interface S2C_Upgrade_10004OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      Divine_Info getInfo();

      Divine_InfoOrBuilder getInfoOrBuilder();
   }
}
