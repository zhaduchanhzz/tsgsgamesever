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

public final class TotemMsg {
   private static final Descriptors.Descriptor internal_static_totem_com_gzbz_protobuf_C2S_Upgrade_10701_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_totem_com_gzbz_protobuf_C2S_Upgrade_10701_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_totem_com_gzbz_protobuf_S2C_Upgrade_10702_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_totem_com_gzbz_protobuf_S2C_Upgrade_10702_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_totem_com_gzbz_protobuf_C2S_Breach_10703_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_totem_com_gzbz_protobuf_C2S_Breach_10703_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_totem_com_gzbz_protobuf_S2C_Breach_10704_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_totem_com_gzbz_protobuf_S2C_Breach_10704_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_totem_com_gzbz_protobuf_C2S_PutOn_10705_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_totem_com_gzbz_protobuf_C2S_PutOn_10705_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_totem_com_gzbz_protobuf_S2C_PutOn_10706_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_totem_com_gzbz_protobuf_S2C_PutOn_10706_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_totem_com_gzbz_protobuf_C2S_TakeOff_10707_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_totem_com_gzbz_protobuf_C2S_TakeOff_10707_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_totem_com_gzbz_protobuf_S2C_TakeOff_10708_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_totem_com_gzbz_protobuf_S2C_TakeOff_10708_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_totem_com_gzbz_protobuf_C2S_Reset_10709_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_totem_com_gzbz_protobuf_C2S_Reset_10709_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_totem_com_gzbz_protobuf_S2C_Reset_10710_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_totem_com_gzbz_protobuf_S2C_Reset_10710_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private TotemMsg() {
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
      String[] descriptorData = new String[]{"\n\u000bTotem.proto\u0012\u0017totem.com.gzbz.protobuf\"!\n\u0011C2S_Upgrade_10701\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\"0\n\u0011S2C_Upgrade_10702\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0002 \u0002(\u0005\" \n\u0010C2S_Breach_10703\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\"2\n\u0010S2C_Breach_10704\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bbreachLv\u0018\u0002 \u0002(\u0005\"A\n\u000fC2S_PutOn_10705\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006chCode\u0018\u0003 \u0001(\u0005\"A\n\u000fS2C_PutOn_10706\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006chCode\u0018\u0003 \u0001(\u0005\"3\n\u0011C2S_TakeOff_10707\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\"3\n\u0011S2C_TakeOff_10708\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\"\u001f\n\u000fC2S_Reset_10709\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\"@\n\u000fS2C_Reset_10710\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bbreachLv\u0018\u0003 \u0002(\u0005B\u001f\n\u0011com.gzbz.protobufB\bTotemMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_totem_com_gzbz_protobuf_C2S_Upgrade_10701_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_totem_com_gzbz_protobuf_C2S_Upgrade_10701_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_totem_com_gzbz_protobuf_C2S_Upgrade_10701_descriptor, new String[]{"Code"});
      internal_static_totem_com_gzbz_protobuf_S2C_Upgrade_10702_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_totem_com_gzbz_protobuf_S2C_Upgrade_10702_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_totem_com_gzbz_protobuf_S2C_Upgrade_10702_descriptor, new String[]{"Code", "Level"});
      internal_static_totem_com_gzbz_protobuf_C2S_Breach_10703_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_totem_com_gzbz_protobuf_C2S_Breach_10703_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_totem_com_gzbz_protobuf_C2S_Breach_10703_descriptor, new String[]{"Code"});
      internal_static_totem_com_gzbz_protobuf_S2C_Breach_10704_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_totem_com_gzbz_protobuf_S2C_Breach_10704_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_totem_com_gzbz_protobuf_S2C_Breach_10704_descriptor, new String[]{"Code", "BreachLv"});
      internal_static_totem_com_gzbz_protobuf_C2S_PutOn_10705_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_totem_com_gzbz_protobuf_C2S_PutOn_10705_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_totem_com_gzbz_protobuf_C2S_PutOn_10705_descriptor, new String[]{"Code", "HeroCode", "ChCode"});
      internal_static_totem_com_gzbz_protobuf_S2C_PutOn_10706_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_totem_com_gzbz_protobuf_S2C_PutOn_10706_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_totem_com_gzbz_protobuf_S2C_PutOn_10706_descriptor, new String[]{"Code", "HeroCode", "ChCode"});
      internal_static_totem_com_gzbz_protobuf_C2S_TakeOff_10707_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_totem_com_gzbz_protobuf_C2S_TakeOff_10707_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_totem_com_gzbz_protobuf_C2S_TakeOff_10707_descriptor, new String[]{"Code", "HeroCode"});
      internal_static_totem_com_gzbz_protobuf_S2C_TakeOff_10708_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_totem_com_gzbz_protobuf_S2C_TakeOff_10708_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_totem_com_gzbz_protobuf_S2C_TakeOff_10708_descriptor, new String[]{"Code", "HeroCode"});
      internal_static_totem_com_gzbz_protobuf_C2S_Reset_10709_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_totem_com_gzbz_protobuf_C2S_Reset_10709_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_totem_com_gzbz_protobuf_C2S_Reset_10709_descriptor, new String[]{"Code"});
      internal_static_totem_com_gzbz_protobuf_S2C_Reset_10710_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_totem_com_gzbz_protobuf_S2C_Reset_10710_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_totem_com_gzbz_protobuf_S2C_Reset_10710_descriptor, new String[]{"Code", "Level", "BreachLv"});
   }

   public static final class C2S_Upgrade_10701 extends GeneratedMessageV3 implements C2S_Upgrade_10701OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      private byte memoizedIsInitialized;
      private static final C2S_Upgrade_10701 DEFAULT_INSTANCE = new C2S_Upgrade_10701();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Upgrade_10701> PARSER = new AbstractParser<C2S_Upgrade_10701>() {
         public C2S_Upgrade_10701 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Upgrade_10701(input, extensionRegistry);
         }
      };

      private C2S_Upgrade_10701(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Upgrade_10701() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Upgrade_10701();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Upgrade_10701(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
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
         return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_Upgrade_10701_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_Upgrade_10701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Upgrade_10701.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Upgrade_10701)) {
            return super.equals(obj);
         } else {
            C2S_Upgrade_10701 other = (C2S_Upgrade_10701)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Upgrade_10701 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_10701)PARSER.parseFrom(data);
      }

      public static C2S_Upgrade_10701 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_10701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Upgrade_10701 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_10701)PARSER.parseFrom(data);
      }

      public static C2S_Upgrade_10701 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_10701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Upgrade_10701 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_10701)PARSER.parseFrom(data);
      }

      public static C2S_Upgrade_10701 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_10701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Upgrade_10701 parseFrom(InputStream input) throws IOException {
         return (C2S_Upgrade_10701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Upgrade_10701 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Upgrade_10701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Upgrade_10701 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Upgrade_10701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Upgrade_10701 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Upgrade_10701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Upgrade_10701 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Upgrade_10701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Upgrade_10701 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Upgrade_10701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Upgrade_10701 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Upgrade_10701 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Upgrade_10701> parser() {
         return PARSER;
      }

      public Parser<C2S_Upgrade_10701> getParserForType() {
         return PARSER;
      }

      public C2S_Upgrade_10701 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Upgrade_10701OrBuilder {
         private int bitField0_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_Upgrade_10701_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_Upgrade_10701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Upgrade_10701.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TotemMsg.C2S_Upgrade_10701.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_Upgrade_10701_descriptor;
         }

         public C2S_Upgrade_10701 getDefaultInstanceForType() {
            return TotemMsg.C2S_Upgrade_10701.getDefaultInstance();
         }

         public C2S_Upgrade_10701 build() {
            C2S_Upgrade_10701 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Upgrade_10701 buildPartial() {
            C2S_Upgrade_10701 result = new C2S_Upgrade_10701(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
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
            if (other instanceof C2S_Upgrade_10701) {
               return this.mergeFrom((C2S_Upgrade_10701)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Upgrade_10701 other) {
            if (other == TotemMsg.C2S_Upgrade_10701.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Upgrade_10701 parsedMessage = null;

            try {
               parsedMessage = (C2S_Upgrade_10701)TotemMsg.C2S_Upgrade_10701.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Upgrade_10701)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
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

   public static final class S2C_Upgrade_10702 extends GeneratedMessageV3 implements S2C_Upgrade_10702OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int LEVEL_FIELD_NUMBER = 2;
      private int level_;
      private byte memoizedIsInitialized;
      private static final S2C_Upgrade_10702 DEFAULT_INSTANCE = new S2C_Upgrade_10702();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Upgrade_10702> PARSER = new AbstractParser<S2C_Upgrade_10702>() {
         public S2C_Upgrade_10702 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Upgrade_10702(input, extensionRegistry);
         }
      };

      private S2C_Upgrade_10702(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Upgrade_10702() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Upgrade_10702();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Upgrade_10702(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.level_ = input.readInt32();
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
         return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_Upgrade_10702_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_Upgrade_10702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Upgrade_10702.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.level_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.level_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Upgrade_10702)) {
            return super.equals(obj);
         } else {
            S2C_Upgrade_10702 other = (S2C_Upgrade_10702)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLevel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Upgrade_10702 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_10702)PARSER.parseFrom(data);
      }

      public static S2C_Upgrade_10702 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_10702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Upgrade_10702 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_10702)PARSER.parseFrom(data);
      }

      public static S2C_Upgrade_10702 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_10702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Upgrade_10702 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_10702)PARSER.parseFrom(data);
      }

      public static S2C_Upgrade_10702 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Upgrade_10702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Upgrade_10702 parseFrom(InputStream input) throws IOException {
         return (S2C_Upgrade_10702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Upgrade_10702 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Upgrade_10702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Upgrade_10702 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Upgrade_10702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Upgrade_10702 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Upgrade_10702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Upgrade_10702 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Upgrade_10702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Upgrade_10702 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Upgrade_10702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Upgrade_10702 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Upgrade_10702 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Upgrade_10702> parser() {
         return PARSER;
      }

      public Parser<S2C_Upgrade_10702> getParserForType() {
         return PARSER;
      }

      public S2C_Upgrade_10702 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Upgrade_10702OrBuilder {
         private int bitField0_;
         private int code_;
         private int level_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_Upgrade_10702_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_Upgrade_10702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Upgrade_10702.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TotemMsg.S2C_Upgrade_10702.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.level_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_Upgrade_10702_descriptor;
         }

         public S2C_Upgrade_10702 getDefaultInstanceForType() {
            return TotemMsg.S2C_Upgrade_10702.getDefaultInstance();
         }

         public S2C_Upgrade_10702 build() {
            S2C_Upgrade_10702 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Upgrade_10702 buildPartial() {
            S2C_Upgrade_10702 result = new S2C_Upgrade_10702(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.level_ = this.level_;
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
            if (other instanceof S2C_Upgrade_10702) {
               return this.mergeFrom((S2C_Upgrade_10702)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Upgrade_10702 other) {
            if (other == TotemMsg.S2C_Upgrade_10702.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasLevel();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Upgrade_10702 parsedMessage = null;

            try {
               parsedMessage = (S2C_Upgrade_10702)TotemMsg.S2C_Upgrade_10702.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Upgrade_10702)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_Breach_10703 extends GeneratedMessageV3 implements C2S_Breach_10703OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      private byte memoizedIsInitialized;
      private static final C2S_Breach_10703 DEFAULT_INSTANCE = new C2S_Breach_10703();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Breach_10703> PARSER = new AbstractParser<C2S_Breach_10703>() {
         public C2S_Breach_10703 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Breach_10703(input, extensionRegistry);
         }
      };

      private C2S_Breach_10703(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Breach_10703() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Breach_10703();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Breach_10703(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
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
         return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_Breach_10703_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_Breach_10703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Breach_10703.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Breach_10703)) {
            return super.equals(obj);
         } else {
            C2S_Breach_10703 other = (C2S_Breach_10703)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Breach_10703 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Breach_10703)PARSER.parseFrom(data);
      }

      public static C2S_Breach_10703 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Breach_10703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Breach_10703 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Breach_10703)PARSER.parseFrom(data);
      }

      public static C2S_Breach_10703 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Breach_10703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Breach_10703 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Breach_10703)PARSER.parseFrom(data);
      }

      public static C2S_Breach_10703 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Breach_10703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Breach_10703 parseFrom(InputStream input) throws IOException {
         return (C2S_Breach_10703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Breach_10703 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Breach_10703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Breach_10703 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Breach_10703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Breach_10703 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Breach_10703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Breach_10703 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Breach_10703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Breach_10703 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Breach_10703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Breach_10703 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Breach_10703 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Breach_10703> parser() {
         return PARSER;
      }

      public Parser<C2S_Breach_10703> getParserForType() {
         return PARSER;
      }

      public C2S_Breach_10703 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Breach_10703OrBuilder {
         private int bitField0_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_Breach_10703_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_Breach_10703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Breach_10703.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TotemMsg.C2S_Breach_10703.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_Breach_10703_descriptor;
         }

         public C2S_Breach_10703 getDefaultInstanceForType() {
            return TotemMsg.C2S_Breach_10703.getDefaultInstance();
         }

         public C2S_Breach_10703 build() {
            C2S_Breach_10703 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Breach_10703 buildPartial() {
            C2S_Breach_10703 result = new C2S_Breach_10703(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
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
            if (other instanceof C2S_Breach_10703) {
               return this.mergeFrom((C2S_Breach_10703)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Breach_10703 other) {
            if (other == TotemMsg.C2S_Breach_10703.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Breach_10703 parsedMessage = null;

            try {
               parsedMessage = (C2S_Breach_10703)TotemMsg.C2S_Breach_10703.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Breach_10703)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
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

   public static final class S2C_Breach_10704 extends GeneratedMessageV3 implements S2C_Breach_10704OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int BREACHLV_FIELD_NUMBER = 2;
      private int breachLv_;
      private byte memoizedIsInitialized;
      private static final S2C_Breach_10704 DEFAULT_INSTANCE = new S2C_Breach_10704();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Breach_10704> PARSER = new AbstractParser<S2C_Breach_10704>() {
         public S2C_Breach_10704 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Breach_10704(input, extensionRegistry);
         }
      };

      private S2C_Breach_10704(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Breach_10704() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Breach_10704();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Breach_10704(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.breachLv_ = input.readInt32();
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
         return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_Breach_10704_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_Breach_10704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Breach_10704.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasBreachLv() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBreachLv() {
         return this.breachLv_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBreachLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.breachLv_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.breachLv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Breach_10704)) {
            return super.equals(obj);
         } else {
            S2C_Breach_10704 other = (S2C_Breach_10704)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasBreachLv() != other.hasBreachLv()) {
               return false;
            } else if (this.hasBreachLv() && this.getBreachLv() != other.getBreachLv()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasBreachLv()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBreachLv();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Breach_10704 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Breach_10704)PARSER.parseFrom(data);
      }

      public static S2C_Breach_10704 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Breach_10704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Breach_10704 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Breach_10704)PARSER.parseFrom(data);
      }

      public static S2C_Breach_10704 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Breach_10704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Breach_10704 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Breach_10704)PARSER.parseFrom(data);
      }

      public static S2C_Breach_10704 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Breach_10704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Breach_10704 parseFrom(InputStream input) throws IOException {
         return (S2C_Breach_10704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Breach_10704 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Breach_10704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Breach_10704 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Breach_10704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Breach_10704 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Breach_10704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Breach_10704 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Breach_10704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Breach_10704 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Breach_10704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Breach_10704 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Breach_10704 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Breach_10704> parser() {
         return PARSER;
      }

      public Parser<S2C_Breach_10704> getParserForType() {
         return PARSER;
      }

      public S2C_Breach_10704 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Breach_10704OrBuilder {
         private int bitField0_;
         private int code_;
         private int breachLv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_Breach_10704_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_Breach_10704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Breach_10704.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TotemMsg.S2C_Breach_10704.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.breachLv_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_Breach_10704_descriptor;
         }

         public S2C_Breach_10704 getDefaultInstanceForType() {
            return TotemMsg.S2C_Breach_10704.getDefaultInstance();
         }

         public S2C_Breach_10704 build() {
            S2C_Breach_10704 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Breach_10704 buildPartial() {
            S2C_Breach_10704 result = new S2C_Breach_10704(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.breachLv_ = this.breachLv_;
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
            if (other instanceof S2C_Breach_10704) {
               return this.mergeFrom((S2C_Breach_10704)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Breach_10704 other) {
            if (other == TotemMsg.S2C_Breach_10704.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasBreachLv()) {
                  this.setBreachLv(other.getBreachLv());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasBreachLv();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Breach_10704 parsedMessage = null;

            try {
               parsedMessage = (S2C_Breach_10704)TotemMsg.S2C_Breach_10704.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Breach_10704)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBreachLv() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBreachLv() {
            return this.breachLv_;
         }

         public Builder setBreachLv(int value) {
            this.bitField0_ |= 2;
            this.breachLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBreachLv() {
            this.bitField0_ &= -3;
            this.breachLv_ = 0;
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

   public static final class C2S_PutOn_10705 extends GeneratedMessageV3 implements C2S_PutOn_10705OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      public static final int CHCODE_FIELD_NUMBER = 3;
      private int chCode_;
      private byte memoizedIsInitialized;
      private static final C2S_PutOn_10705 DEFAULT_INSTANCE = new C2S_PutOn_10705();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PutOn_10705> PARSER = new AbstractParser<C2S_PutOn_10705>() {
         public C2S_PutOn_10705 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PutOn_10705(input, extensionRegistry);
         }
      };

      private C2S_PutOn_10705(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PutOn_10705() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PutOn_10705();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PutOn_10705(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.heroCode_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.chCode_ = input.readInt32();
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
         return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_PutOn_10705_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_PutOn_10705_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PutOn_10705.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasChCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getChCode() {
         return this.chCode_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.heroCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.chCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.heroCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.chCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PutOn_10705)) {
            return super.equals(obj);
         } else {
            C2S_PutOn_10705 other = (C2S_PutOn_10705)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasChCode() != other.hasChCode()) {
               return false;
            } else if (this.hasChCode() && this.getChCode() != other.getChCode()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasChCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getChCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PutOn_10705 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PutOn_10705)PARSER.parseFrom(data);
      }

      public static C2S_PutOn_10705 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PutOn_10705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PutOn_10705 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PutOn_10705)PARSER.parseFrom(data);
      }

      public static C2S_PutOn_10705 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PutOn_10705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PutOn_10705 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PutOn_10705)PARSER.parseFrom(data);
      }

      public static C2S_PutOn_10705 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PutOn_10705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PutOn_10705 parseFrom(InputStream input) throws IOException {
         return (C2S_PutOn_10705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PutOn_10705 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PutOn_10705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PutOn_10705 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PutOn_10705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PutOn_10705 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PutOn_10705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PutOn_10705 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PutOn_10705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PutOn_10705 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PutOn_10705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PutOn_10705 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PutOn_10705 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PutOn_10705> parser() {
         return PARSER;
      }

      public Parser<C2S_PutOn_10705> getParserForType() {
         return PARSER;
      }

      public C2S_PutOn_10705 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PutOn_10705OrBuilder {
         private int bitField0_;
         private int code_;
         private int heroCode_;
         private int chCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_PutOn_10705_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_PutOn_10705_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PutOn_10705.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TotemMsg.C2S_PutOn_10705.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            this.chCode_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_PutOn_10705_descriptor;
         }

         public C2S_PutOn_10705 getDefaultInstanceForType() {
            return TotemMsg.C2S_PutOn_10705.getDefaultInstance();
         }

         public C2S_PutOn_10705 build() {
            C2S_PutOn_10705 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PutOn_10705 buildPartial() {
            C2S_PutOn_10705 result = new C2S_PutOn_10705(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.chCode_ = this.chCode_;
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
            if (other instanceof C2S_PutOn_10705) {
               return this.mergeFrom((C2S_PutOn_10705)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PutOn_10705 other) {
            if (other == TotemMsg.C2S_PutOn_10705.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasChCode()) {
                  this.setChCode(other.getChCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasHeroCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_PutOn_10705 parsedMessage = null;

            try {
               parsedMessage = (C2S_PutOn_10705)TotemMsg.C2S_PutOn_10705.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PutOn_10705)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 2;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -3;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasChCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getChCode() {
            return this.chCode_;
         }

         public Builder setChCode(int value) {
            this.bitField0_ |= 4;
            this.chCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChCode() {
            this.bitField0_ &= -5;
            this.chCode_ = 0;
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

   public static final class S2C_PutOn_10706 extends GeneratedMessageV3 implements S2C_PutOn_10706OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      public static final int CHCODE_FIELD_NUMBER = 3;
      private int chCode_;
      private byte memoizedIsInitialized;
      private static final S2C_PutOn_10706 DEFAULT_INSTANCE = new S2C_PutOn_10706();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PutOn_10706> PARSER = new AbstractParser<S2C_PutOn_10706>() {
         public S2C_PutOn_10706 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PutOn_10706(input, extensionRegistry);
         }
      };

      private S2C_PutOn_10706(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PutOn_10706() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PutOn_10706();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PutOn_10706(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.heroCode_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.chCode_ = input.readInt32();
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
         return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_PutOn_10706_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_PutOn_10706_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PutOn_10706.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasChCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getChCode() {
         return this.chCode_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.heroCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.chCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.heroCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.chCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PutOn_10706)) {
            return super.equals(obj);
         } else {
            S2C_PutOn_10706 other = (S2C_PutOn_10706)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasChCode() != other.hasChCode()) {
               return false;
            } else if (this.hasChCode() && this.getChCode() != other.getChCode()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasChCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getChCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PutOn_10706 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PutOn_10706)PARSER.parseFrom(data);
      }

      public static S2C_PutOn_10706 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PutOn_10706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PutOn_10706 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PutOn_10706)PARSER.parseFrom(data);
      }

      public static S2C_PutOn_10706 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PutOn_10706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PutOn_10706 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PutOn_10706)PARSER.parseFrom(data);
      }

      public static S2C_PutOn_10706 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PutOn_10706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PutOn_10706 parseFrom(InputStream input) throws IOException {
         return (S2C_PutOn_10706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PutOn_10706 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PutOn_10706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PutOn_10706 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PutOn_10706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PutOn_10706 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PutOn_10706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PutOn_10706 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PutOn_10706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PutOn_10706 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PutOn_10706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PutOn_10706 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PutOn_10706 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PutOn_10706> parser() {
         return PARSER;
      }

      public Parser<S2C_PutOn_10706> getParserForType() {
         return PARSER;
      }

      public S2C_PutOn_10706 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PutOn_10706OrBuilder {
         private int bitField0_;
         private int code_;
         private int heroCode_;
         private int chCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_PutOn_10706_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_PutOn_10706_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PutOn_10706.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TotemMsg.S2C_PutOn_10706.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            this.chCode_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_PutOn_10706_descriptor;
         }

         public S2C_PutOn_10706 getDefaultInstanceForType() {
            return TotemMsg.S2C_PutOn_10706.getDefaultInstance();
         }

         public S2C_PutOn_10706 build() {
            S2C_PutOn_10706 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PutOn_10706 buildPartial() {
            S2C_PutOn_10706 result = new S2C_PutOn_10706(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.chCode_ = this.chCode_;
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
            if (other instanceof S2C_PutOn_10706) {
               return this.mergeFrom((S2C_PutOn_10706)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PutOn_10706 other) {
            if (other == TotemMsg.S2C_PutOn_10706.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasChCode()) {
                  this.setChCode(other.getChCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasHeroCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PutOn_10706 parsedMessage = null;

            try {
               parsedMessage = (S2C_PutOn_10706)TotemMsg.S2C_PutOn_10706.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PutOn_10706)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 2;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -3;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasChCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getChCode() {
            return this.chCode_;
         }

         public Builder setChCode(int value) {
            this.bitField0_ |= 4;
            this.chCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChCode() {
            this.bitField0_ &= -5;
            this.chCode_ = 0;
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

   public static final class C2S_TakeOff_10707 extends GeneratedMessageV3 implements C2S_TakeOff_10707OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_TakeOff_10707 DEFAULT_INSTANCE = new C2S_TakeOff_10707();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TakeOff_10707> PARSER = new AbstractParser<C2S_TakeOff_10707>() {
         public C2S_TakeOff_10707 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TakeOff_10707(input, extensionRegistry);
         }
      };

      private C2S_TakeOff_10707(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TakeOff_10707() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TakeOff_10707();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TakeOff_10707(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.heroCode_ = input.readInt32();
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
         return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_TakeOff_10707_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_TakeOff_10707_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeOff_10707.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.heroCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.heroCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TakeOff_10707)) {
            return super.equals(obj);
         } else {
            C2S_TakeOff_10707 other = (C2S_TakeOff_10707)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TakeOff_10707 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TakeOff_10707)PARSER.parseFrom(data);
      }

      public static C2S_TakeOff_10707 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeOff_10707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeOff_10707 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TakeOff_10707)PARSER.parseFrom(data);
      }

      public static C2S_TakeOff_10707 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeOff_10707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeOff_10707 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TakeOff_10707)PARSER.parseFrom(data);
      }

      public static C2S_TakeOff_10707 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeOff_10707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeOff_10707 parseFrom(InputStream input) throws IOException {
         return (C2S_TakeOff_10707)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeOff_10707 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeOff_10707)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeOff_10707 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TakeOff_10707)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TakeOff_10707 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeOff_10707)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeOff_10707 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TakeOff_10707)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeOff_10707 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeOff_10707)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TakeOff_10707 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TakeOff_10707 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TakeOff_10707> parser() {
         return PARSER;
      }

      public Parser<C2S_TakeOff_10707> getParserForType() {
         return PARSER;
      }

      public C2S_TakeOff_10707 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TakeOff_10707OrBuilder {
         private int bitField0_;
         private int code_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_TakeOff_10707_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_TakeOff_10707_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeOff_10707.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TotemMsg.C2S_TakeOff_10707.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_TakeOff_10707_descriptor;
         }

         public C2S_TakeOff_10707 getDefaultInstanceForType() {
            return TotemMsg.C2S_TakeOff_10707.getDefaultInstance();
         }

         public C2S_TakeOff_10707 build() {
            C2S_TakeOff_10707 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TakeOff_10707 buildPartial() {
            C2S_TakeOff_10707 result = new C2S_TakeOff_10707(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.heroCode_ = this.heroCode_;
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
            if (other instanceof C2S_TakeOff_10707) {
               return this.mergeFrom((C2S_TakeOff_10707)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TakeOff_10707 other) {
            if (other == TotemMsg.C2S_TakeOff_10707.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasHeroCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TakeOff_10707 parsedMessage = null;

            try {
               parsedMessage = (C2S_TakeOff_10707)TotemMsg.C2S_TakeOff_10707.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TakeOff_10707)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 2;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -3;
            this.heroCode_ = 0;
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

   public static final class S2C_TakeOff_10708 extends GeneratedMessageV3 implements S2C_TakeOff_10708OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final S2C_TakeOff_10708 DEFAULT_INSTANCE = new S2C_TakeOff_10708();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TakeOff_10708> PARSER = new AbstractParser<S2C_TakeOff_10708>() {
         public S2C_TakeOff_10708 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TakeOff_10708(input, extensionRegistry);
         }
      };

      private S2C_TakeOff_10708(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TakeOff_10708() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TakeOff_10708();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TakeOff_10708(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.heroCode_ = input.readInt32();
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
         return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_TakeOff_10708_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_TakeOff_10708_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeOff_10708.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.heroCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.heroCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TakeOff_10708)) {
            return super.equals(obj);
         } else {
            S2C_TakeOff_10708 other = (S2C_TakeOff_10708)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TakeOff_10708 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TakeOff_10708)PARSER.parseFrom(data);
      }

      public static S2C_TakeOff_10708 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeOff_10708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeOff_10708 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TakeOff_10708)PARSER.parseFrom(data);
      }

      public static S2C_TakeOff_10708 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeOff_10708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeOff_10708 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TakeOff_10708)PARSER.parseFrom(data);
      }

      public static S2C_TakeOff_10708 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeOff_10708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeOff_10708 parseFrom(InputStream input) throws IOException {
         return (S2C_TakeOff_10708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeOff_10708 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeOff_10708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeOff_10708 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TakeOff_10708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TakeOff_10708 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeOff_10708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeOff_10708 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TakeOff_10708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeOff_10708 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeOff_10708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TakeOff_10708 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TakeOff_10708 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TakeOff_10708> parser() {
         return PARSER;
      }

      public Parser<S2C_TakeOff_10708> getParserForType() {
         return PARSER;
      }

      public S2C_TakeOff_10708 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TakeOff_10708OrBuilder {
         private int bitField0_;
         private int code_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_TakeOff_10708_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_TakeOff_10708_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeOff_10708.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TotemMsg.S2C_TakeOff_10708.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_TakeOff_10708_descriptor;
         }

         public S2C_TakeOff_10708 getDefaultInstanceForType() {
            return TotemMsg.S2C_TakeOff_10708.getDefaultInstance();
         }

         public S2C_TakeOff_10708 build() {
            S2C_TakeOff_10708 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TakeOff_10708 buildPartial() {
            S2C_TakeOff_10708 result = new S2C_TakeOff_10708(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.heroCode_ = this.heroCode_;
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
            if (other instanceof S2C_TakeOff_10708) {
               return this.mergeFrom((S2C_TakeOff_10708)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TakeOff_10708 other) {
            if (other == TotemMsg.S2C_TakeOff_10708.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasHeroCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TakeOff_10708 parsedMessage = null;

            try {
               parsedMessage = (S2C_TakeOff_10708)TotemMsg.S2C_TakeOff_10708.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TakeOff_10708)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 2;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -3;
            this.heroCode_ = 0;
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

   public static final class C2S_Reset_10709 extends GeneratedMessageV3 implements C2S_Reset_10709OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      private byte memoizedIsInitialized;
      private static final C2S_Reset_10709 DEFAULT_INSTANCE = new C2S_Reset_10709();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Reset_10709> PARSER = new AbstractParser<C2S_Reset_10709>() {
         public C2S_Reset_10709 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Reset_10709(input, extensionRegistry);
         }
      };

      private C2S_Reset_10709(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Reset_10709() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Reset_10709();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Reset_10709(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
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
         return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_Reset_10709_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_Reset_10709_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Reset_10709.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Reset_10709)) {
            return super.equals(obj);
         } else {
            C2S_Reset_10709 other = (C2S_Reset_10709)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Reset_10709 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Reset_10709)PARSER.parseFrom(data);
      }

      public static C2S_Reset_10709 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Reset_10709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Reset_10709 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Reset_10709)PARSER.parseFrom(data);
      }

      public static C2S_Reset_10709 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Reset_10709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Reset_10709 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Reset_10709)PARSER.parseFrom(data);
      }

      public static C2S_Reset_10709 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Reset_10709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Reset_10709 parseFrom(InputStream input) throws IOException {
         return (C2S_Reset_10709)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Reset_10709 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Reset_10709)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Reset_10709 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Reset_10709)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Reset_10709 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Reset_10709)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Reset_10709 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Reset_10709)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Reset_10709 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Reset_10709)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Reset_10709 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Reset_10709 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Reset_10709> parser() {
         return PARSER;
      }

      public Parser<C2S_Reset_10709> getParserForType() {
         return PARSER;
      }

      public C2S_Reset_10709 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Reset_10709OrBuilder {
         private int bitField0_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_Reset_10709_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_Reset_10709_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Reset_10709.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TotemMsg.C2S_Reset_10709.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_C2S_Reset_10709_descriptor;
         }

         public C2S_Reset_10709 getDefaultInstanceForType() {
            return TotemMsg.C2S_Reset_10709.getDefaultInstance();
         }

         public C2S_Reset_10709 build() {
            C2S_Reset_10709 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Reset_10709 buildPartial() {
            C2S_Reset_10709 result = new C2S_Reset_10709(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
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
            if (other instanceof C2S_Reset_10709) {
               return this.mergeFrom((C2S_Reset_10709)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Reset_10709 other) {
            if (other == TotemMsg.C2S_Reset_10709.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Reset_10709 parsedMessage = null;

            try {
               parsedMessage = (C2S_Reset_10709)TotemMsg.C2S_Reset_10709.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Reset_10709)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
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

   public static final class S2C_Reset_10710 extends GeneratedMessageV3 implements S2C_Reset_10710OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int LEVEL_FIELD_NUMBER = 2;
      private int level_;
      public static final int BREACHLV_FIELD_NUMBER = 3;
      private int breachLv_;
      private byte memoizedIsInitialized;
      private static final S2C_Reset_10710 DEFAULT_INSTANCE = new S2C_Reset_10710();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Reset_10710> PARSER = new AbstractParser<S2C_Reset_10710>() {
         public S2C_Reset_10710 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Reset_10710(input, extensionRegistry);
         }
      };

      private S2C_Reset_10710(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Reset_10710() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Reset_10710();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Reset_10710(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.level_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.breachLv_ = input.readInt32();
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
         return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_Reset_10710_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_Reset_10710_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Reset_10710.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public boolean hasBreachLv() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBreachLv() {
         return this.breachLv_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBreachLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.level_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.breachLv_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.level_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.breachLv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Reset_10710)) {
            return super.equals(obj);
         } else {
            S2C_Reset_10710 other = (S2C_Reset_10710)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (this.hasBreachLv() != other.hasBreachLv()) {
               return false;
            } else if (this.hasBreachLv() && this.getBreachLv() != other.getBreachLv()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLevel();
            }

            if (this.hasBreachLv()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBreachLv();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Reset_10710 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Reset_10710)PARSER.parseFrom(data);
      }

      public static S2C_Reset_10710 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Reset_10710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Reset_10710 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Reset_10710)PARSER.parseFrom(data);
      }

      public static S2C_Reset_10710 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Reset_10710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Reset_10710 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Reset_10710)PARSER.parseFrom(data);
      }

      public static S2C_Reset_10710 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Reset_10710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Reset_10710 parseFrom(InputStream input) throws IOException {
         return (S2C_Reset_10710)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Reset_10710 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Reset_10710)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Reset_10710 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Reset_10710)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Reset_10710 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Reset_10710)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Reset_10710 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Reset_10710)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Reset_10710 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Reset_10710)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Reset_10710 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Reset_10710 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Reset_10710> parser() {
         return PARSER;
      }

      public Parser<S2C_Reset_10710> getParserForType() {
         return PARSER;
      }

      public S2C_Reset_10710 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Reset_10710OrBuilder {
         private int bitField0_;
         private int code_;
         private int level_;
         private int breachLv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_Reset_10710_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_Reset_10710_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Reset_10710.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TotemMsg.S2C_Reset_10710.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.level_ = 0;
            this.bitField0_ &= -3;
            this.breachLv_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TotemMsg.internal_static_totem_com_gzbz_protobuf_S2C_Reset_10710_descriptor;
         }

         public S2C_Reset_10710 getDefaultInstanceForType() {
            return TotemMsg.S2C_Reset_10710.getDefaultInstance();
         }

         public S2C_Reset_10710 build() {
            S2C_Reset_10710 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Reset_10710 buildPartial() {
            S2C_Reset_10710 result = new S2C_Reset_10710(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.breachLv_ = this.breachLv_;
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
            if (other instanceof S2C_Reset_10710) {
               return this.mergeFrom((S2C_Reset_10710)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Reset_10710 other) {
            if (other == TotemMsg.S2C_Reset_10710.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (other.hasBreachLv()) {
                  this.setBreachLv(other.getBreachLv());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else if (!this.hasLevel()) {
               return false;
            } else {
               return this.hasBreachLv();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Reset_10710 parsedMessage = null;

            try {
               parsedMessage = (S2C_Reset_10710)TotemMsg.S2C_Reset_10710.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Reset_10710)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
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

         public boolean hasBreachLv() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBreachLv() {
            return this.breachLv_;
         }

         public Builder setBreachLv(int value) {
            this.bitField0_ |= 4;
            this.breachLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBreachLv() {
            this.bitField0_ &= -5;
            this.breachLv_ = 0;
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

   public interface C2S_Breach_10703OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();
   }

   public interface C2S_PutOn_10705OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasHeroCode();

      int getHeroCode();

      boolean hasChCode();

      int getChCode();
   }

   public interface C2S_Reset_10709OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();
   }

   public interface C2S_TakeOff_10707OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_Upgrade_10701OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();
   }

   public interface S2C_Breach_10704OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasBreachLv();

      int getBreachLv();
   }

   public interface S2C_PutOn_10706OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasHeroCode();

      int getHeroCode();

      boolean hasChCode();

      int getChCode();
   }

   public interface S2C_Reset_10710OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasLevel();

      int getLevel();

      boolean hasBreachLv();

      int getBreachLv();
   }

   public interface S2C_TakeOff_10708OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface S2C_Upgrade_10702OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasLevel();

      int getLevel();
   }
}
