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

public final class ChongYangMsg {
   private static final Descriptors.Descriptor internal_static_chongYang_com_gzbz_protobuf_SignInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chongYang_com_gzbz_protobuf_SignInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chongYang_com_gzbz_protobuf_C2S_OpenUi_15801_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chongYang_com_gzbz_protobuf_C2S_OpenUi_15801_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chongYang_com_gzbz_protobuf_S2C_OpenUi_15802_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chongYang_com_gzbz_protobuf_S2C_OpenUi_15802_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chongYang_com_gzbz_protobuf_C2S_Sign_15813_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chongYang_com_gzbz_protobuf_C2S_Sign_15813_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chongYang_com_gzbz_protobuf_S2C_SignInfo_15814_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chongYang_com_gzbz_protobuf_S2C_SignInfo_15814_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chongYang_com_gzbz_protobuf_C2S_FindTreasure_15823_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chongYang_com_gzbz_protobuf_C2S_FindTreasure_15823_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_chongYang_com_gzbz_protobuf_S2C_FindTreasure_15824_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_chongYang_com_gzbz_protobuf_S2C_FindTreasure_15824_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ChongYangMsg() {
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
      String[] descriptorData = new String[]{"\n\u000fChongYang.proto\u0012\u001bchongYang.com.gzbz.protobuf\"&\n\bSignInfo\u0012\u000b\n\u0003day\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005state\u0018\u0002 \u0002(\u0005\"\u0012\n\u0010C2S_OpenUi_15801\"}\n\u0010S2C_OpenUi_15802\u00124\n\u0005infos\u0018\u0001 \u0003(\u000b2%.chongYang.com.gzbz.protobuf.SignInfo\u0012\u0014\n\ftakedFreeNum\u0018\u0002 \u0002(\u0005\u0012\u0010\n\broundNum\u0018\u0003 \u0002(\u0005\u0012\u000b\n\u0003day\u0018\u0004 \u0001(\u0005\"\u001d\n\u000eC2S_Sign_15813\u0012\u000b\n\u0003day\u0018\u0001 \u0002(\u0005\"Z\n\u0012S2C_SignInfo_15814\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u00124\n\u0005infos\u0018\u0002 \u0003(\u000b2%.chongYang.com.gzbz.protobuf.SignInfo\"%\n\u0016C2S_FindTreasure_15823\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\"P\n\u0016S2C_FindTreasure_15824\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0014\n\ftakedFreeNum\u0018\u0002 \u0002(\u0005\u0012\u0010\n\broundNum\u0018\u0003 \u0002(\u0005B#\n\u0011com.gzbz.protobufB\fChongYangMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_chongYang_com_gzbz_protobuf_SignInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_chongYang_com_gzbz_protobuf_SignInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chongYang_com_gzbz_protobuf_SignInfo_descriptor, new String[]{"Day", "State"});
      internal_static_chongYang_com_gzbz_protobuf_C2S_OpenUi_15801_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_chongYang_com_gzbz_protobuf_C2S_OpenUi_15801_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chongYang_com_gzbz_protobuf_C2S_OpenUi_15801_descriptor, new String[0]);
      internal_static_chongYang_com_gzbz_protobuf_S2C_OpenUi_15802_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_chongYang_com_gzbz_protobuf_S2C_OpenUi_15802_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chongYang_com_gzbz_protobuf_S2C_OpenUi_15802_descriptor, new String[]{"Infos", "TakedFreeNum", "RoundNum", "Day"});
      internal_static_chongYang_com_gzbz_protobuf_C2S_Sign_15813_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_chongYang_com_gzbz_protobuf_C2S_Sign_15813_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chongYang_com_gzbz_protobuf_C2S_Sign_15813_descriptor, new String[]{"Day"});
      internal_static_chongYang_com_gzbz_protobuf_S2C_SignInfo_15814_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_chongYang_com_gzbz_protobuf_S2C_SignInfo_15814_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chongYang_com_gzbz_protobuf_S2C_SignInfo_15814_descriptor, new String[]{"Result", "Infos"});
      internal_static_chongYang_com_gzbz_protobuf_C2S_FindTreasure_15823_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_chongYang_com_gzbz_protobuf_C2S_FindTreasure_15823_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chongYang_com_gzbz_protobuf_C2S_FindTreasure_15823_descriptor, new String[]{"Num"});
      internal_static_chongYang_com_gzbz_protobuf_S2C_FindTreasure_15824_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_chongYang_com_gzbz_protobuf_S2C_FindTreasure_15824_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_chongYang_com_gzbz_protobuf_S2C_FindTreasure_15824_descriptor, new String[]{"Result", "TakedFreeNum", "RoundNum"});
   }

   public static final class SignInfo extends GeneratedMessageV3 implements SignInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAY_FIELD_NUMBER = 1;
      private int day_;
      public static final int STATE_FIELD_NUMBER = 2;
      private int state_;
      private byte memoizedIsInitialized;
      private static final SignInfo DEFAULT_INSTANCE = new SignInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<SignInfo> PARSER = new AbstractParser<SignInfo>() {
         public SignInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new SignInfo(input, extensionRegistry);
         }
      };

      private SignInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private SignInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new SignInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private SignInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.day_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.state_ = input.readInt32();
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
         return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_SignInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_SignInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SignInfo.class, Builder.class);
      }

      public boolean hasDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDay() {
         return this.day_;
      }

      public boolean hasState() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDay()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.day_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.state_);
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
               size += CodedOutputStream.computeInt32Size(1, this.day_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.state_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof SignInfo)) {
            return super.equals(obj);
         } else {
            SignInfo other = (SignInfo)obj;
            if (this.hasDay() != other.hasDay()) {
               return false;
            } else if (this.hasDay() && this.getDay() != other.getDay()) {
               return false;
            } else if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
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
            if (this.hasDay()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDay();
            }

            if (this.hasState()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getState();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static SignInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (SignInfo)PARSER.parseFrom(data);
      }

      public static SignInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SignInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SignInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (SignInfo)PARSER.parseFrom(data);
      }

      public static SignInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SignInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SignInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (SignInfo)PARSER.parseFrom(data);
      }

      public static SignInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SignInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SignInfo parseFrom(InputStream input) throws IOException {
         return (SignInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SignInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SignInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static SignInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (SignInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static SignInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SignInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static SignInfo parseFrom(CodedInputStream input) throws IOException {
         return (SignInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SignInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SignInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(SignInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static SignInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<SignInfo> parser() {
         return PARSER;
      }

      public Parser<SignInfo> getParserForType() {
         return PARSER;
      }

      public SignInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SignInfoOrBuilder {
         private int bitField0_;
         private int day_;
         private int state_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_SignInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_SignInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SignInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChongYangMsg.SignInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.day_ = 0;
            this.bitField0_ &= -2;
            this.state_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_SignInfo_descriptor;
         }

         public SignInfo getDefaultInstanceForType() {
            return ChongYangMsg.SignInfo.getDefaultInstance();
         }

         public SignInfo build() {
            SignInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public SignInfo buildPartial() {
            SignInfo result = new SignInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.day_ = this.day_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.state_ = this.state_;
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
            if (other instanceof SignInfo) {
               return this.mergeFrom((SignInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(SignInfo other) {
            if (other == ChongYangMsg.SignInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDay()) {
                  this.setDay(other.getDay());
               }

               if (other.hasState()) {
                  this.setState(other.getState());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDay()) {
               return false;
            } else {
               return this.hasState();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            SignInfo parsedMessage = null;

            try {
               parsedMessage = (SignInfo)ChongYangMsg.SignInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (SignInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDay() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDay() {
            return this.day_;
         }

         public Builder setDay(int value) {
            this.bitField0_ |= 1;
            this.day_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDay() {
            this.bitField0_ &= -2;
            this.day_ = 0;
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_OpenUi_15801 extends GeneratedMessageV3 implements C2S_OpenUi_15801OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OpenUi_15801 DEFAULT_INSTANCE = new C2S_OpenUi_15801();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenUi_15801> PARSER = new AbstractParser<C2S_OpenUi_15801>() {
         public C2S_OpenUi_15801 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenUi_15801(input, extensionRegistry);
         }
      };

      private C2S_OpenUi_15801(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenUi_15801() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenUi_15801();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenUi_15801(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_OpenUi_15801_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_OpenUi_15801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenUi_15801.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenUi_15801)) {
            return super.equals(obj);
         } else {
            C2S_OpenUi_15801 other = (C2S_OpenUi_15801)obj;
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

      public static C2S_OpenUi_15801 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_15801)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_15801 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_15801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_15801 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_15801)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_15801 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_15801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_15801 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_15801)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_15801 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_15801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_15801 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenUi_15801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_15801 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_15801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenUi_15801 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenUi_15801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_15801 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_15801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenUi_15801 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenUi_15801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_15801 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_15801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenUi_15801 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenUi_15801 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenUi_15801> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenUi_15801> getParserForType() {
         return PARSER;
      }

      public C2S_OpenUi_15801 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenUi_15801OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_OpenUi_15801_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_OpenUi_15801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenUi_15801.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChongYangMsg.C2S_OpenUi_15801.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_OpenUi_15801_descriptor;
         }

         public C2S_OpenUi_15801 getDefaultInstanceForType() {
            return ChongYangMsg.C2S_OpenUi_15801.getDefaultInstance();
         }

         public C2S_OpenUi_15801 build() {
            C2S_OpenUi_15801 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenUi_15801 buildPartial() {
            C2S_OpenUi_15801 result = new C2S_OpenUi_15801(this);
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
            if (other instanceof C2S_OpenUi_15801) {
               return this.mergeFrom((C2S_OpenUi_15801)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenUi_15801 other) {
            if (other == ChongYangMsg.C2S_OpenUi_15801.getDefaultInstance()) {
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
            C2S_OpenUi_15801 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenUi_15801)ChongYangMsg.C2S_OpenUi_15801.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenUi_15801)e.getUnfinishedMessage();
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

   public static final class S2C_OpenUi_15802 extends GeneratedMessageV3 implements S2C_OpenUi_15802OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<SignInfo> infos_;
      public static final int TAKEDFREENUM_FIELD_NUMBER = 2;
      private int takedFreeNum_;
      public static final int ROUNDNUM_FIELD_NUMBER = 3;
      private int roundNum_;
      public static final int DAY_FIELD_NUMBER = 4;
      private int day_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenUi_15802 DEFAULT_INSTANCE = new S2C_OpenUi_15802();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenUi_15802> PARSER = new AbstractParser<S2C_OpenUi_15802>() {
         public S2C_OpenUi_15802 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenUi_15802(input, extensionRegistry);
         }
      };

      private S2C_OpenUi_15802(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenUi_15802() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenUi_15802();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenUi_15802(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.infos_.add(input.readMessage(ChongYangMsg.SignInfo.PARSER, extensionRegistry));
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.takedFreeNum_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.roundNum_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.day_ = input.readInt32();
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
         return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_OpenUi_15802_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_OpenUi_15802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenUi_15802.class, Builder.class);
      }

      public List<SignInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends SignInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public SignInfo getInfos(int index) {
         return (SignInfo)this.infos_.get(index);
      }

      public SignInfoOrBuilder getInfosOrBuilder(int index) {
         return (SignInfoOrBuilder)this.infos_.get(index);
      }

      public boolean hasTakedFreeNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTakedFreeNum() {
         return this.takedFreeNum_;
      }

      public boolean hasRoundNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRoundNum() {
         return this.roundNum_;
      }

      public boolean hasDay() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getDay() {
         return this.day_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTakedFreeNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRoundNum()) {
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
         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.infos_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.takedFreeNum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.roundNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.day_);
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

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.takedFreeNum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.roundNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.day_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OpenUi_15802)) {
            return super.equals(obj);
         } else {
            S2C_OpenUi_15802 other = (S2C_OpenUi_15802)obj;
            if (!this.getInfosList().equals(other.getInfosList())) {
               return false;
            } else if (this.hasTakedFreeNum() != other.hasTakedFreeNum()) {
               return false;
            } else if (this.hasTakedFreeNum() && this.getTakedFreeNum() != other.getTakedFreeNum()) {
               return false;
            } else if (this.hasRoundNum() != other.hasRoundNum()) {
               return false;
            } else if (this.hasRoundNum() && this.getRoundNum() != other.getRoundNum()) {
               return false;
            } else if (this.hasDay() != other.hasDay()) {
               return false;
            } else if (this.hasDay() && this.getDay() != other.getDay()) {
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

            if (this.hasTakedFreeNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTakedFreeNum();
            }

            if (this.hasRoundNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRoundNum();
            }

            if (this.hasDay()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OpenUi_15802 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenUi_15802)PARSER.parseFrom(data);
      }

      public static S2C_OpenUi_15802 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUi_15802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUi_15802 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenUi_15802)PARSER.parseFrom(data);
      }

      public static S2C_OpenUi_15802 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUi_15802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUi_15802 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenUi_15802)PARSER.parseFrom(data);
      }

      public static S2C_OpenUi_15802 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUi_15802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUi_15802 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenUi_15802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenUi_15802 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUi_15802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenUi_15802 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenUi_15802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenUi_15802 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUi_15802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenUi_15802 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenUi_15802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenUi_15802 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUi_15802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenUi_15802 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenUi_15802 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenUi_15802> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenUi_15802> getParserForType() {
         return PARSER;
      }

      public S2C_OpenUi_15802 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenUi_15802OrBuilder {
         private int bitField0_;
         private List<SignInfo> infos_;
         private RepeatedFieldBuilderV3<SignInfo, SignInfo.Builder, SignInfoOrBuilder> infosBuilder_;
         private int takedFreeNum_;
         private int roundNum_;
         private int day_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_OpenUi_15802_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_OpenUi_15802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenUi_15802.class, Builder.class);
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
            if (ChongYangMsg.S2C_OpenUi_15802.alwaysUseFieldBuilders) {
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

            this.takedFreeNum_ = 0;
            this.bitField0_ &= -3;
            this.roundNum_ = 0;
            this.bitField0_ &= -5;
            this.day_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_OpenUi_15802_descriptor;
         }

         public S2C_OpenUi_15802 getDefaultInstanceForType() {
            return ChongYangMsg.S2C_OpenUi_15802.getDefaultInstance();
         }

         public S2C_OpenUi_15802 build() {
            S2C_OpenUi_15802 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenUi_15802 buildPartial() {
            S2C_OpenUi_15802 result = new S2C_OpenUi_15802(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -2;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               result.takedFreeNum_ = this.takedFreeNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.roundNum_ = this.roundNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.day_ = this.day_;
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
            if (other instanceof S2C_OpenUi_15802) {
               return this.mergeFrom((S2C_OpenUi_15802)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenUi_15802 other) {
            if (other == ChongYangMsg.S2C_OpenUi_15802.getDefaultInstance()) {
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
                     this.infosBuilder_ = ChongYangMsg.S2C_OpenUi_15802.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               if (other.hasTakedFreeNum()) {
                  this.setTakedFreeNum(other.getTakedFreeNum());
               }

               if (other.hasRoundNum()) {
                  this.setRoundNum(other.getRoundNum());
               }

               if (other.hasDay()) {
                  this.setDay(other.getDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTakedFreeNum()) {
               return false;
            } else if (!this.hasRoundNum()) {
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
            S2C_OpenUi_15802 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenUi_15802)ChongYangMsg.S2C_OpenUi_15802.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenUi_15802)e.getUnfinishedMessage();
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

         public List<SignInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public SignInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (SignInfo)this.infos_.get(index) : (SignInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, SignInfo value) {
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

         public Builder setInfos(int index, SignInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(SignInfo value) {
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

         public Builder addInfos(int index, SignInfo value) {
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

         public Builder addInfos(SignInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, SignInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends SignInfo> values) {
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

         public SignInfo.Builder getInfosBuilder(int index) {
            return (SignInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public SignInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (SignInfoOrBuilder)this.infos_.get(index) : (SignInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SignInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public SignInfo.Builder addInfosBuilder() {
            return (SignInfo.Builder)this.getInfosFieldBuilder().addBuilder(ChongYangMsg.SignInfo.getDefaultInstance());
         }

         public SignInfo.Builder addInfosBuilder(int index) {
            return (SignInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, ChongYangMsg.SignInfo.getDefaultInstance());
         }

         public List<SignInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SignInfo, SignInfo.Builder, SignInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         public boolean hasTakedFreeNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTakedFreeNum() {
            return this.takedFreeNum_;
         }

         public Builder setTakedFreeNum(int value) {
            this.bitField0_ |= 2;
            this.takedFreeNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTakedFreeNum() {
            this.bitField0_ &= -3;
            this.takedFreeNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRoundNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getRoundNum() {
            return this.roundNum_;
         }

         public Builder setRoundNum(int value) {
            this.bitField0_ |= 4;
            this.roundNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRoundNum() {
            this.bitField0_ &= -5;
            this.roundNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDay() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getDay() {
            return this.day_;
         }

         public Builder setDay(int value) {
            this.bitField0_ |= 8;
            this.day_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDay() {
            this.bitField0_ &= -9;
            this.day_ = 0;
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

   public static final class C2S_Sign_15813 extends GeneratedMessageV3 implements C2S_Sign_15813OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAY_FIELD_NUMBER = 1;
      private int day_;
      private byte memoizedIsInitialized;
      private static final C2S_Sign_15813 DEFAULT_INSTANCE = new C2S_Sign_15813();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Sign_15813> PARSER = new AbstractParser<C2S_Sign_15813>() {
         public C2S_Sign_15813 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Sign_15813(input, extensionRegistry);
         }
      };

      private C2S_Sign_15813(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Sign_15813() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Sign_15813();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Sign_15813(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.day_ = input.readInt32();
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
         return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_Sign_15813_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_Sign_15813_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Sign_15813.class, Builder.class);
      }

      public boolean hasDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDay() {
         return this.day_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.day_);
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
               size += CodedOutputStream.computeInt32Size(1, this.day_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Sign_15813)) {
            return super.equals(obj);
         } else {
            C2S_Sign_15813 other = (C2S_Sign_15813)obj;
            if (this.hasDay() != other.hasDay()) {
               return false;
            } else if (this.hasDay() && this.getDay() != other.getDay()) {
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
            if (this.hasDay()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Sign_15813 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Sign_15813)PARSER.parseFrom(data);
      }

      public static C2S_Sign_15813 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_15813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_15813 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Sign_15813)PARSER.parseFrom(data);
      }

      public static C2S_Sign_15813 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_15813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_15813 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Sign_15813)PARSER.parseFrom(data);
      }

      public static C2S_Sign_15813 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_15813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_15813 parseFrom(InputStream input) throws IOException {
         return (C2S_Sign_15813)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Sign_15813 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_15813)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Sign_15813 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Sign_15813)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Sign_15813 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_15813)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Sign_15813 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Sign_15813)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Sign_15813 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_15813)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Sign_15813 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Sign_15813 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Sign_15813> parser() {
         return PARSER;
      }

      public Parser<C2S_Sign_15813> getParserForType() {
         return PARSER;
      }

      public C2S_Sign_15813 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Sign_15813OrBuilder {
         private int bitField0_;
         private int day_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_Sign_15813_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_Sign_15813_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Sign_15813.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChongYangMsg.C2S_Sign_15813.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.day_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_Sign_15813_descriptor;
         }

         public C2S_Sign_15813 getDefaultInstanceForType() {
            return ChongYangMsg.C2S_Sign_15813.getDefaultInstance();
         }

         public C2S_Sign_15813 build() {
            C2S_Sign_15813 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Sign_15813 buildPartial() {
            C2S_Sign_15813 result = new C2S_Sign_15813(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.day_ = this.day_;
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
            if (other instanceof C2S_Sign_15813) {
               return this.mergeFrom((C2S_Sign_15813)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Sign_15813 other) {
            if (other == ChongYangMsg.C2S_Sign_15813.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDay()) {
                  this.setDay(other.getDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasDay();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Sign_15813 parsedMessage = null;

            try {
               parsedMessage = (C2S_Sign_15813)ChongYangMsg.C2S_Sign_15813.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Sign_15813)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDay() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDay() {
            return this.day_;
         }

         public Builder setDay(int value) {
            this.bitField0_ |= 1;
            this.day_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDay() {
            this.bitField0_ &= -2;
            this.day_ = 0;
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

   public static final class S2C_SignInfo_15814 extends GeneratedMessageV3 implements S2C_SignInfo_15814OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int INFOS_FIELD_NUMBER = 2;
      private List<SignInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_SignInfo_15814 DEFAULT_INSTANCE = new S2C_SignInfo_15814();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SignInfo_15814> PARSER = new AbstractParser<S2C_SignInfo_15814>() {
         public S2C_SignInfo_15814 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SignInfo_15814(input, extensionRegistry);
         }
      };

      private S2C_SignInfo_15814(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SignInfo_15814() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SignInfo_15814();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SignInfo_15814(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.infos_.add(input.readMessage(ChongYangMsg.SignInfo.PARSER, extensionRegistry));
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
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_SignInfo_15814_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_SignInfo_15814_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SignInfo_15814.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public List<SignInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends SignInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public SignInfo getInfos(int index) {
         return (SignInfo)this.infos_.get(index);
      }

      public SignInfoOrBuilder getInfosOrBuilder(int index) {
         return (SignInfoOrBuilder)this.infos_.get(index);
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
            output.writeInt32(1, this.result_);
         }

         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.infos_.get(i));
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

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.infos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SignInfo_15814)) {
            return super.equals(obj);
         } else {
            S2C_SignInfo_15814 other = (S2C_SignInfo_15814)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SignInfo_15814 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SignInfo_15814)PARSER.parseFrom(data);
      }

      public static S2C_SignInfo_15814 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignInfo_15814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignInfo_15814 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SignInfo_15814)PARSER.parseFrom(data);
      }

      public static S2C_SignInfo_15814 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignInfo_15814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignInfo_15814 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SignInfo_15814)PARSER.parseFrom(data);
      }

      public static S2C_SignInfo_15814 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignInfo_15814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignInfo_15814 parseFrom(InputStream input) throws IOException {
         return (S2C_SignInfo_15814)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SignInfo_15814 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignInfo_15814)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SignInfo_15814 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SignInfo_15814)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SignInfo_15814 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignInfo_15814)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SignInfo_15814 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SignInfo_15814)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SignInfo_15814 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignInfo_15814)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SignInfo_15814 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SignInfo_15814 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SignInfo_15814> parser() {
         return PARSER;
      }

      public Parser<S2C_SignInfo_15814> getParserForType() {
         return PARSER;
      }

      public S2C_SignInfo_15814 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SignInfo_15814OrBuilder {
         private int bitField0_;
         private int result_;
         private List<SignInfo> infos_;
         private RepeatedFieldBuilderV3<SignInfo, SignInfo.Builder, SignInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_SignInfo_15814_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_SignInfo_15814_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SignInfo_15814.class, Builder.class);
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
            if (ChongYangMsg.S2C_SignInfo_15814.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_SignInfo_15814_descriptor;
         }

         public S2C_SignInfo_15814 getDefaultInstanceForType() {
            return ChongYangMsg.S2C_SignInfo_15814.getDefaultInstance();
         }

         public S2C_SignInfo_15814 build() {
            S2C_SignInfo_15814 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SignInfo_15814 buildPartial() {
            S2C_SignInfo_15814 result = new S2C_SignInfo_15814(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -3;
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
            if (other instanceof S2C_SignInfo_15814) {
               return this.mergeFrom((S2C_SignInfo_15814)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SignInfo_15814 other) {
            if (other == ChongYangMsg.S2C_SignInfo_15814.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -3;
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
                     this.bitField0_ &= -3;
                     this.infosBuilder_ = ChongYangMsg.S2C_SignInfo_15814.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
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
            if (!this.hasResult()) {
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
            S2C_SignInfo_15814 parsedMessage = null;

            try {
               parsedMessage = (S2C_SignInfo_15814)ChongYangMsg.S2C_SignInfo_15814.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SignInfo_15814)e.getUnfinishedMessage();
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

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 2;
            }

         }

         public List<SignInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public SignInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (SignInfo)this.infos_.get(index) : (SignInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, SignInfo value) {
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

         public Builder setInfos(int index, SignInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(SignInfo value) {
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

         public Builder addInfos(int index, SignInfo value) {
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

         public Builder addInfos(SignInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, SignInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends SignInfo> values) {
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
               this.bitField0_ &= -3;
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

         public SignInfo.Builder getInfosBuilder(int index) {
            return (SignInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public SignInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (SignInfoOrBuilder)this.infos_.get(index) : (SignInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SignInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public SignInfo.Builder addInfosBuilder() {
            return (SignInfo.Builder)this.getInfosFieldBuilder().addBuilder(ChongYangMsg.SignInfo.getDefaultInstance());
         }

         public SignInfo.Builder addInfosBuilder(int index) {
            return (SignInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, ChongYangMsg.SignInfo.getDefaultInstance());
         }

         public List<SignInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SignInfo, SignInfo.Builder, SignInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class C2S_FindTreasure_15823 extends GeneratedMessageV3 implements C2S_FindTreasure_15823OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_FindTreasure_15823 DEFAULT_INSTANCE = new C2S_FindTreasure_15823();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FindTreasure_15823> PARSER = new AbstractParser<C2S_FindTreasure_15823>() {
         public C2S_FindTreasure_15823 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FindTreasure_15823(input, extensionRegistry);
         }
      };

      private C2S_FindTreasure_15823(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FindTreasure_15823() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FindTreasure_15823();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FindTreasure_15823(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.num_ = input.readInt32();
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
         return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_FindTreasure_15823_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_FindTreasure_15823_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FindTreasure_15823.class, Builder.class);
      }

      public boolean hasNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.num_);
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
               size += CodedOutputStream.computeInt32Size(1, this.num_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FindTreasure_15823)) {
            return super.equals(obj);
         } else {
            C2S_FindTreasure_15823 other = (C2S_FindTreasure_15823)obj;
            if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
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
            if (this.hasNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FindTreasure_15823 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FindTreasure_15823)PARSER.parseFrom(data);
      }

      public static C2S_FindTreasure_15823 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FindTreasure_15823)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FindTreasure_15823 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FindTreasure_15823)PARSER.parseFrom(data);
      }

      public static C2S_FindTreasure_15823 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FindTreasure_15823)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FindTreasure_15823 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FindTreasure_15823)PARSER.parseFrom(data);
      }

      public static C2S_FindTreasure_15823 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FindTreasure_15823)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FindTreasure_15823 parseFrom(InputStream input) throws IOException {
         return (C2S_FindTreasure_15823)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FindTreasure_15823 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FindTreasure_15823)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FindTreasure_15823 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FindTreasure_15823)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FindTreasure_15823 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FindTreasure_15823)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FindTreasure_15823 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FindTreasure_15823)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FindTreasure_15823 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FindTreasure_15823)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FindTreasure_15823 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FindTreasure_15823 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FindTreasure_15823> parser() {
         return PARSER;
      }

      public Parser<C2S_FindTreasure_15823> getParserForType() {
         return PARSER;
      }

      public C2S_FindTreasure_15823 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FindTreasure_15823OrBuilder {
         private int bitField0_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_FindTreasure_15823_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_FindTreasure_15823_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FindTreasure_15823.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChongYangMsg.C2S_FindTreasure_15823.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_C2S_FindTreasure_15823_descriptor;
         }

         public C2S_FindTreasure_15823 getDefaultInstanceForType() {
            return ChongYangMsg.C2S_FindTreasure_15823.getDefaultInstance();
         }

         public C2S_FindTreasure_15823 build() {
            C2S_FindTreasure_15823 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FindTreasure_15823 buildPartial() {
            C2S_FindTreasure_15823 result = new C2S_FindTreasure_15823(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.num_ = this.num_;
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
            if (other instanceof C2S_FindTreasure_15823) {
               return this.mergeFrom((C2S_FindTreasure_15823)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FindTreasure_15823 other) {
            if (other == ChongYangMsg.C2S_FindTreasure_15823.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_FindTreasure_15823 parsedMessage = null;

            try {
               parsedMessage = (C2S_FindTreasure_15823)ChongYangMsg.C2S_FindTreasure_15823.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FindTreasure_15823)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 1;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -2;
            this.num_ = 0;
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

   public static final class S2C_FindTreasure_15824 extends GeneratedMessageV3 implements S2C_FindTreasure_15824OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TAKEDFREENUM_FIELD_NUMBER = 2;
      private int takedFreeNum_;
      public static final int ROUNDNUM_FIELD_NUMBER = 3;
      private int roundNum_;
      private byte memoizedIsInitialized;
      private static final S2C_FindTreasure_15824 DEFAULT_INSTANCE = new S2C_FindTreasure_15824();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FindTreasure_15824> PARSER = new AbstractParser<S2C_FindTreasure_15824>() {
         public S2C_FindTreasure_15824 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FindTreasure_15824(input, extensionRegistry);
         }
      };

      private S2C_FindTreasure_15824(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FindTreasure_15824() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FindTreasure_15824();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FindTreasure_15824(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.takedFreeNum_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.roundNum_ = input.readInt32();
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
         return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_FindTreasure_15824_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_FindTreasure_15824_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FindTreasure_15824.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasTakedFreeNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTakedFreeNum() {
         return this.takedFreeNum_;
      }

      public boolean hasRoundNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getRoundNum() {
         return this.roundNum_;
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
         } else if (!this.hasTakedFreeNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRoundNum()) {
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
            output.writeInt32(2, this.takedFreeNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.roundNum_);
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
               size += CodedOutputStream.computeInt32Size(2, this.takedFreeNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.roundNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FindTreasure_15824)) {
            return super.equals(obj);
         } else {
            S2C_FindTreasure_15824 other = (S2C_FindTreasure_15824)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasTakedFreeNum() != other.hasTakedFreeNum()) {
               return false;
            } else if (this.hasTakedFreeNum() && this.getTakedFreeNum() != other.getTakedFreeNum()) {
               return false;
            } else if (this.hasRoundNum() != other.hasRoundNum()) {
               return false;
            } else if (this.hasRoundNum() && this.getRoundNum() != other.getRoundNum()) {
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

            if (this.hasTakedFreeNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTakedFreeNum();
            }

            if (this.hasRoundNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRoundNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FindTreasure_15824 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FindTreasure_15824)PARSER.parseFrom(data);
      }

      public static S2C_FindTreasure_15824 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FindTreasure_15824)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FindTreasure_15824 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FindTreasure_15824)PARSER.parseFrom(data);
      }

      public static S2C_FindTreasure_15824 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FindTreasure_15824)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FindTreasure_15824 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FindTreasure_15824)PARSER.parseFrom(data);
      }

      public static S2C_FindTreasure_15824 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FindTreasure_15824)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FindTreasure_15824 parseFrom(InputStream input) throws IOException {
         return (S2C_FindTreasure_15824)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FindTreasure_15824 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FindTreasure_15824)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FindTreasure_15824 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FindTreasure_15824)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FindTreasure_15824 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FindTreasure_15824)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FindTreasure_15824 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FindTreasure_15824)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FindTreasure_15824 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FindTreasure_15824)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FindTreasure_15824 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FindTreasure_15824 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FindTreasure_15824> parser() {
         return PARSER;
      }

      public Parser<S2C_FindTreasure_15824> getParserForType() {
         return PARSER;
      }

      public S2C_FindTreasure_15824 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FindTreasure_15824OrBuilder {
         private int bitField0_;
         private int result_;
         private int takedFreeNum_;
         private int roundNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_FindTreasure_15824_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_FindTreasure_15824_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FindTreasure_15824.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ChongYangMsg.S2C_FindTreasure_15824.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.takedFreeNum_ = 0;
            this.bitField0_ &= -3;
            this.roundNum_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ChongYangMsg.internal_static_chongYang_com_gzbz_protobuf_S2C_FindTreasure_15824_descriptor;
         }

         public S2C_FindTreasure_15824 getDefaultInstanceForType() {
            return ChongYangMsg.S2C_FindTreasure_15824.getDefaultInstance();
         }

         public S2C_FindTreasure_15824 build() {
            S2C_FindTreasure_15824 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FindTreasure_15824 buildPartial() {
            S2C_FindTreasure_15824 result = new S2C_FindTreasure_15824(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.takedFreeNum_ = this.takedFreeNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.roundNum_ = this.roundNum_;
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
            if (other instanceof S2C_FindTreasure_15824) {
               return this.mergeFrom((S2C_FindTreasure_15824)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FindTreasure_15824 other) {
            if (other == ChongYangMsg.S2C_FindTreasure_15824.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasTakedFreeNum()) {
                  this.setTakedFreeNum(other.getTakedFreeNum());
               }

               if (other.hasRoundNum()) {
                  this.setRoundNum(other.getRoundNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasTakedFreeNum()) {
               return false;
            } else {
               return this.hasRoundNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FindTreasure_15824 parsedMessage = null;

            try {
               parsedMessage = (S2C_FindTreasure_15824)ChongYangMsg.S2C_FindTreasure_15824.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FindTreasure_15824)e.getUnfinishedMessage();
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

         public boolean hasTakedFreeNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTakedFreeNum() {
            return this.takedFreeNum_;
         }

         public Builder setTakedFreeNum(int value) {
            this.bitField0_ |= 2;
            this.takedFreeNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTakedFreeNum() {
            this.bitField0_ &= -3;
            this.takedFreeNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRoundNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getRoundNum() {
            return this.roundNum_;
         }

         public Builder setRoundNum(int value) {
            this.bitField0_ |= 4;
            this.roundNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRoundNum() {
            this.bitField0_ &= -5;
            this.roundNum_ = 0;
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

   public interface C2S_FindTreasure_15823OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();
   }

   public interface C2S_OpenUi_15801OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Sign_15813OrBuilder extends MessageOrBuilder {
      boolean hasDay();

      int getDay();
   }

   public interface S2C_FindTreasure_15824OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasTakedFreeNum();

      int getTakedFreeNum();

      boolean hasRoundNum();

      int getRoundNum();
   }

   public interface S2C_OpenUi_15802OrBuilder extends MessageOrBuilder {
      List<SignInfo> getInfosList();

      SignInfo getInfos(int index);

      int getInfosCount();

      List<? extends SignInfoOrBuilder> getInfosOrBuilderList();

      SignInfoOrBuilder getInfosOrBuilder(int index);

      boolean hasTakedFreeNum();

      int getTakedFreeNum();

      boolean hasRoundNum();

      int getRoundNum();

      boolean hasDay();

      int getDay();
   }

   public interface S2C_SignInfo_15814OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      List<SignInfo> getInfosList();

      SignInfo getInfos(int index);

      int getInfosCount();

      List<? extends SignInfoOrBuilder> getInfosOrBuilderList();

      SignInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface SignInfoOrBuilder extends MessageOrBuilder {
      boolean hasDay();

      int getDay();

      boolean hasState();

      int getState();
   }
}
