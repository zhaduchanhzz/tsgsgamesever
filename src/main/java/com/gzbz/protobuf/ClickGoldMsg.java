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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ClickGoldMsg {
   private static final Descriptors.Descriptor internal_static_clickGold_com_gzbz_protobuf_ClickGoldInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_clickGold_com_gzbz_protobuf_ClickGoldInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_clickGold_com_gzbz_protobuf_C2S_OpenUi_8201_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_clickGold_com_gzbz_protobuf_C2S_OpenUi_8201_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_clickGold_com_gzbz_protobuf_S2C_OpenUiResult_8202_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_clickGold_com_gzbz_protobuf_S2C_OpenUiResult_8202_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_clickGold_com_gzbz_protobuf_C2S_Click_8203_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_clickGold_com_gzbz_protobuf_C2S_Click_8203_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_clickGold_com_gzbz_protobuf_S2C_ClickResult_8204_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_clickGold_com_gzbz_protobuf_S2C_ClickResult_8204_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_clickGold_com_gzbz_protobuf_C2S_OneKeyClick_8205_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_clickGold_com_gzbz_protobuf_C2S_OneKeyClick_8205_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_clickGold_com_gzbz_protobuf_S2C_OneKeyClick_8206_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_clickGold_com_gzbz_protobuf_S2C_OneKeyClick_8206_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ClickGoldMsg() {
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
      String[] descriptorData = new String[]{"\n\u000fClickGold.proto\u0012\u001bclickGold.com.gzbz.protobuf\"V\n\rClickGoldInfo\u00128\n\u0004type\u0018\u0001 \u0002(\u000e2*.clickGold.com.gzbz.protobuf.ClickGoldType\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\"#\n\u000fC2S_OpenUi_8201\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\"R\n\u0015S2C_OpenUiResult_8202\u00129\n\u0005infos\u0018\u0001 \u0003(\u000b2*.clickGold.com.gzbz.protobuf.ClickGoldInfo\"J\n\u000eC2S_Click_8203\u00128\n\u0004type\u0018\u0001 \u0002(\u000e2*.clickGold.com.gzbz.protobuf.ClickGoldType\"&\n\u0014S2C_ClickResult_8204\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"\u0016\n\u0014C2S_OneKeyClick_8205\"D\n\u0014S2C_OneKeyClick_8206\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006copper\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004gold\u0018\u0003 \u0002(\u0005*;\n\rClickGoldType\u0012\r\n\tTYPE_FREE\u0010\u0001\u0012\f\n\bTYPE_LOW\u0010\u0002\u0012\r\n\tTYPE_HIGH\u0010\u0003B#\n\u0011com.gzbz.protobufB\fClickGoldMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_clickGold_com_gzbz_protobuf_ClickGoldInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_clickGold_com_gzbz_protobuf_ClickGoldInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_clickGold_com_gzbz_protobuf_ClickGoldInfo_descriptor, new String[]{"Type", "Num"});
      internal_static_clickGold_com_gzbz_protobuf_C2S_OpenUi_8201_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_clickGold_com_gzbz_protobuf_C2S_OpenUi_8201_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_clickGold_com_gzbz_protobuf_C2S_OpenUi_8201_descriptor, new String[]{"PlayerId"});
      internal_static_clickGold_com_gzbz_protobuf_S2C_OpenUiResult_8202_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_clickGold_com_gzbz_protobuf_S2C_OpenUiResult_8202_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_clickGold_com_gzbz_protobuf_S2C_OpenUiResult_8202_descriptor, new String[]{"Infos"});
      internal_static_clickGold_com_gzbz_protobuf_C2S_Click_8203_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_clickGold_com_gzbz_protobuf_C2S_Click_8203_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_clickGold_com_gzbz_protobuf_C2S_Click_8203_descriptor, new String[]{"Type"});
      internal_static_clickGold_com_gzbz_protobuf_S2C_ClickResult_8204_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_clickGold_com_gzbz_protobuf_S2C_ClickResult_8204_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_clickGold_com_gzbz_protobuf_S2C_ClickResult_8204_descriptor, new String[]{"Result"});
      internal_static_clickGold_com_gzbz_protobuf_C2S_OneKeyClick_8205_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_clickGold_com_gzbz_protobuf_C2S_OneKeyClick_8205_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_clickGold_com_gzbz_protobuf_C2S_OneKeyClick_8205_descriptor, new String[0]);
      internal_static_clickGold_com_gzbz_protobuf_S2C_OneKeyClick_8206_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_clickGold_com_gzbz_protobuf_S2C_OneKeyClick_8206_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_clickGold_com_gzbz_protobuf_S2C_OneKeyClick_8206_descriptor, new String[]{"Result", "Copper", "Gold"});
   }

   public static enum ClickGoldType implements ProtocolMessageEnum {
      TYPE_FREE(1),
      TYPE_LOW(2),
      TYPE_HIGH(3);

      public static final int TYPE_FREE_VALUE = 1;
      public static final int TYPE_LOW_VALUE = 2;
      public static final int TYPE_HIGH_VALUE = 3;
      private static final Internal.EnumLiteMap<ClickGoldType> internalValueMap = new Internal.EnumLiteMap<ClickGoldType>() {
         public ClickGoldType findValueByNumber(int number) {
            return ClickGoldMsg.ClickGoldType.forNumber(number);
         }
      };
      private static final ClickGoldType[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static ClickGoldType valueOf(int value) {
         return forNumber(value);
      }

      public static ClickGoldType forNumber(int value) {
         switch (value) {
            case 1:
               return TYPE_FREE;
            case 2:
               return TYPE_LOW;
            case 3:
               return TYPE_HIGH;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<ClickGoldType> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)ClickGoldMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static ClickGoldType valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private ClickGoldType(int value) {
         this.value = value;
      }
   }

   public static final class ClickGoldInfo extends GeneratedMessageV3 implements ClickGoldInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final ClickGoldInfo DEFAULT_INSTANCE = new ClickGoldInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<ClickGoldInfo> PARSER = new AbstractParser<ClickGoldInfo>() {
         public ClickGoldInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new ClickGoldInfo(input, extensionRegistry);
         }
      };

      private ClickGoldInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ClickGoldInfo() {
         this.memoizedIsInitialized = -1;
         this.type_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new ClickGoldInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ClickGoldInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        int rawValue = input.readEnum();
                        ClickGoldType value = ClickGoldMsg.ClickGoldType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.type_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
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
         return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_ClickGoldInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_ClickGoldInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ClickGoldInfo.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public ClickGoldType getType() {
         ClickGoldType result = ClickGoldMsg.ClickGoldType.valueOf(this.type_);
         return result == null ? ClickGoldMsg.ClickGoldType.TYPE_FREE : result;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
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
            output.writeEnum(1, this.type_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.num_);
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
               size += CodedOutputStream.computeEnumSize(1, this.type_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.num_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof ClickGoldInfo)) {
            return super.equals(obj);
         } else {
            ClickGoldInfo other = (ClickGoldInfo)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.type_ != other.type_) {
               return false;
            } else if (this.hasNum() != other.hasNum()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.type_;
            }

            if (this.hasNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static ClickGoldInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (ClickGoldInfo)PARSER.parseFrom(data);
      }

      public static ClickGoldInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ClickGoldInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ClickGoldInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (ClickGoldInfo)PARSER.parseFrom(data);
      }

      public static ClickGoldInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ClickGoldInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ClickGoldInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (ClickGoldInfo)PARSER.parseFrom(data);
      }

      public static ClickGoldInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ClickGoldInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ClickGoldInfo parseFrom(InputStream input) throws IOException {
         return (ClickGoldInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ClickGoldInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ClickGoldInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static ClickGoldInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (ClickGoldInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static ClickGoldInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ClickGoldInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static ClickGoldInfo parseFrom(CodedInputStream input) throws IOException {
         return (ClickGoldInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ClickGoldInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ClickGoldInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(ClickGoldInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static ClickGoldInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ClickGoldInfo> parser() {
         return PARSER;
      }

      public Parser<ClickGoldInfo> getParserForType() {
         return PARSER;
      }

      public ClickGoldInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ClickGoldInfoOrBuilder {
         private int bitField0_;
         private int type_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_ClickGoldInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_ClickGoldInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ClickGoldInfo.class, Builder.class);
         }

         private Builder() {
            this.type_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.type_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ClickGoldMsg.ClickGoldInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 1;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_ClickGoldInfo_descriptor;
         }

         public ClickGoldInfo getDefaultInstanceForType() {
            return ClickGoldMsg.ClickGoldInfo.getDefaultInstance();
         }

         public ClickGoldInfo build() {
            ClickGoldInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public ClickGoldInfo buildPartial() {
            ClickGoldInfo result = new ClickGoldInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.type_ = this.type_;
            if ((from_bitField0_ & 2) != 0) {
               result.num_ = this.num_;
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
            if (other instanceof ClickGoldInfo) {
               return this.mergeFrom((ClickGoldInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ClickGoldInfo other) {
            if (other == ClickGoldMsg.ClickGoldInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            ClickGoldInfo parsedMessage = null;

            try {
               parsedMessage = (ClickGoldInfo)ClickGoldMsg.ClickGoldInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (ClickGoldInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
         }

         public ClickGoldType getType() {
            ClickGoldType result = ClickGoldMsg.ClickGoldType.valueOf(this.type_);
            return result == null ? ClickGoldMsg.ClickGoldType.TYPE_FREE : result;
         }

         public Builder setType(ClickGoldType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.type_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 2;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -3;
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

   public static final class C2S_OpenUi_8201 extends GeneratedMessageV3 implements C2S_OpenUi_8201OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      private byte memoizedIsInitialized;
      private static final C2S_OpenUi_8201 DEFAULT_INSTANCE = new C2S_OpenUi_8201();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenUi_8201> PARSER = new AbstractParser<C2S_OpenUi_8201>() {
         public C2S_OpenUi_8201 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenUi_8201(input, extensionRegistry);
         }
      };

      private C2S_OpenUi_8201(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenUi_8201() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenUi_8201();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenUi_8201(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.playerId_ = input.readInt32();
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
         return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_C2S_OpenUi_8201_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_C2S_OpenUi_8201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenUi_8201.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.playerId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.playerId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_OpenUi_8201)) {
            return super.equals(obj);
         } else {
            C2S_OpenUi_8201 other = (C2S_OpenUi_8201)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
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
            if (this.hasPlayerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_OpenUi_8201 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_8201)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_8201 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_8201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_8201 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_8201)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_8201 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_8201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_8201 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_8201)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_8201 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_8201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_8201 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenUi_8201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_8201 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_8201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenUi_8201 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenUi_8201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_8201 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_8201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenUi_8201 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenUi_8201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_8201 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_8201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenUi_8201 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenUi_8201 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenUi_8201> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenUi_8201> getParserForType() {
         return PARSER;
      }

      public C2S_OpenUi_8201 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenUi_8201OrBuilder {
         private int bitField0_;
         private int playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_C2S_OpenUi_8201_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_C2S_OpenUi_8201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenUi_8201.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ClickGoldMsg.C2S_OpenUi_8201.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_C2S_OpenUi_8201_descriptor;
         }

         public C2S_OpenUi_8201 getDefaultInstanceForType() {
            return ClickGoldMsg.C2S_OpenUi_8201.getDefaultInstance();
         }

         public C2S_OpenUi_8201 build() {
            C2S_OpenUi_8201 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenUi_8201 buildPartial() {
            C2S_OpenUi_8201 result = new C2S_OpenUi_8201(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
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
            if (other instanceof C2S_OpenUi_8201) {
               return this.mergeFrom((C2S_OpenUi_8201)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenUi_8201 other) {
            if (other == ClickGoldMsg.C2S_OpenUi_8201.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPlayerId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_OpenUi_8201 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenUi_8201)ClickGoldMsg.C2S_OpenUi_8201.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenUi_8201)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPlayerId() {
            return this.playerId_;
         }

         public Builder setPlayerId(int value) {
            this.bitField0_ |= 1;
            this.playerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.bitField0_ &= -2;
            this.playerId_ = 0;
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

   public static final class S2C_OpenUiResult_8202 extends GeneratedMessageV3 implements S2C_OpenUiResult_8202OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<ClickGoldInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenUiResult_8202 DEFAULT_INSTANCE = new S2C_OpenUiResult_8202();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenUiResult_8202> PARSER = new AbstractParser<S2C_OpenUiResult_8202>() {
         public S2C_OpenUiResult_8202 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenUiResult_8202(input, extensionRegistry);
         }
      };

      private S2C_OpenUiResult_8202(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenUiResult_8202() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenUiResult_8202();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenUiResult_8202(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.infos_.add(input.readMessage(ClickGoldMsg.ClickGoldInfo.PARSER, extensionRegistry));
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
         return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_S2C_OpenUiResult_8202_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_S2C_OpenUiResult_8202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenUiResult_8202.class, Builder.class);
      }

      public List<ClickGoldInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends ClickGoldInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public ClickGoldInfo getInfos(int index) {
         return (ClickGoldInfo)this.infos_.get(index);
      }

      public ClickGoldInfoOrBuilder getInfosOrBuilder(int index) {
         return (ClickGoldInfoOrBuilder)this.infos_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OpenUiResult_8202)) {
            return super.equals(obj);
         } else {
            S2C_OpenUiResult_8202 other = (S2C_OpenUiResult_8202)obj;
            if (!this.getInfosList().equals(other.getInfosList())) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OpenUiResult_8202 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_8202)PARSER.parseFrom(data);
      }

      public static S2C_OpenUiResult_8202 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_8202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUiResult_8202 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_8202)PARSER.parseFrom(data);
      }

      public static S2C_OpenUiResult_8202 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_8202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUiResult_8202 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_8202)PARSER.parseFrom(data);
      }

      public static S2C_OpenUiResult_8202 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_8202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUiResult_8202 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenUiResult_8202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenUiResult_8202 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUiResult_8202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenUiResult_8202 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenUiResult_8202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenUiResult_8202 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUiResult_8202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenUiResult_8202 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenUiResult_8202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenUiResult_8202 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUiResult_8202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenUiResult_8202 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenUiResult_8202 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenUiResult_8202> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenUiResult_8202> getParserForType() {
         return PARSER;
      }

      public S2C_OpenUiResult_8202 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenUiResult_8202OrBuilder {
         private int bitField0_;
         private List<ClickGoldInfo> infos_;
         private RepeatedFieldBuilderV3<ClickGoldInfo, ClickGoldInfo.Builder, ClickGoldInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_S2C_OpenUiResult_8202_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_S2C_OpenUiResult_8202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenUiResult_8202.class, Builder.class);
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
            if (ClickGoldMsg.S2C_OpenUiResult_8202.alwaysUseFieldBuilders) {
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

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_S2C_OpenUiResult_8202_descriptor;
         }

         public S2C_OpenUiResult_8202 getDefaultInstanceForType() {
            return ClickGoldMsg.S2C_OpenUiResult_8202.getDefaultInstance();
         }

         public S2C_OpenUiResult_8202 build() {
            S2C_OpenUiResult_8202 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenUiResult_8202 buildPartial() {
            S2C_OpenUiResult_8202 result = new S2C_OpenUiResult_8202(this);
            int from_bitField0_ = this.bitField0_;
            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -2;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
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
            if (other instanceof S2C_OpenUiResult_8202) {
               return this.mergeFrom((S2C_OpenUiResult_8202)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenUiResult_8202 other) {
            if (other == ClickGoldMsg.S2C_OpenUiResult_8202.getDefaultInstance()) {
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
                     this.infosBuilder_ = ClickGoldMsg.S2C_OpenUiResult_8202.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
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
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OpenUiResult_8202 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenUiResult_8202)ClickGoldMsg.S2C_OpenUiResult_8202.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenUiResult_8202)e.getUnfinishedMessage();
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

         public List<ClickGoldInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public ClickGoldInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (ClickGoldInfo)this.infos_.get(index) : (ClickGoldInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, ClickGoldInfo value) {
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

         public Builder setInfos(int index, ClickGoldInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(ClickGoldInfo value) {
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

         public Builder addInfos(int index, ClickGoldInfo value) {
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

         public Builder addInfos(ClickGoldInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, ClickGoldInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends ClickGoldInfo> values) {
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

         public ClickGoldInfo.Builder getInfosBuilder(int index) {
            return (ClickGoldInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public ClickGoldInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (ClickGoldInfoOrBuilder)this.infos_.get(index) : (ClickGoldInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ClickGoldInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public ClickGoldInfo.Builder addInfosBuilder() {
            return (ClickGoldInfo.Builder)this.getInfosFieldBuilder().addBuilder(ClickGoldMsg.ClickGoldInfo.getDefaultInstance());
         }

         public ClickGoldInfo.Builder addInfosBuilder(int index) {
            return (ClickGoldInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, ClickGoldMsg.ClickGoldInfo.getDefaultInstance());
         }

         public List<ClickGoldInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ClickGoldInfo, ClickGoldInfo.Builder, ClickGoldInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class C2S_Click_8203 extends GeneratedMessageV3 implements C2S_Click_8203OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_Click_8203 DEFAULT_INSTANCE = new C2S_Click_8203();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Click_8203> PARSER = new AbstractParser<C2S_Click_8203>() {
         public C2S_Click_8203 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Click_8203(input, extensionRegistry);
         }
      };

      private C2S_Click_8203(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Click_8203() {
         this.memoizedIsInitialized = -1;
         this.type_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Click_8203();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Click_8203(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        int rawValue = input.readEnum();
                        ClickGoldType value = ClickGoldMsg.ClickGoldType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.type_ = rawValue;
                        }
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
         return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_C2S_Click_8203_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_C2S_Click_8203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Click_8203.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public ClickGoldType getType() {
         ClickGoldType result = ClickGoldMsg.ClickGoldType.valueOf(this.type_);
         return result == null ? ClickGoldMsg.ClickGoldType.TYPE_FREE : result;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.type_);
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
               size += CodedOutputStream.computeEnumSize(1, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Click_8203)) {
            return super.equals(obj);
         } else {
            C2S_Click_8203 other = (C2S_Click_8203)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.type_ != other.type_) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.type_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Click_8203 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Click_8203)PARSER.parseFrom(data);
      }

      public static C2S_Click_8203 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Click_8203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Click_8203 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Click_8203)PARSER.parseFrom(data);
      }

      public static C2S_Click_8203 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Click_8203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Click_8203 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Click_8203)PARSER.parseFrom(data);
      }

      public static C2S_Click_8203 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Click_8203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Click_8203 parseFrom(InputStream input) throws IOException {
         return (C2S_Click_8203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Click_8203 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Click_8203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Click_8203 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Click_8203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Click_8203 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Click_8203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Click_8203 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Click_8203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Click_8203 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Click_8203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Click_8203 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Click_8203 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Click_8203> parser() {
         return PARSER;
      }

      public Parser<C2S_Click_8203> getParserForType() {
         return PARSER;
      }

      public C2S_Click_8203 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Click_8203OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_C2S_Click_8203_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_C2S_Click_8203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Click_8203.class, Builder.class);
         }

         private Builder() {
            this.type_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.type_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ClickGoldMsg.C2S_Click_8203.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 1;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_C2S_Click_8203_descriptor;
         }

         public C2S_Click_8203 getDefaultInstanceForType() {
            return ClickGoldMsg.C2S_Click_8203.getDefaultInstance();
         }

         public C2S_Click_8203 build() {
            C2S_Click_8203 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Click_8203 buildPartial() {
            C2S_Click_8203 result = new C2S_Click_8203(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.type_ = this.type_;
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
            if (other instanceof C2S_Click_8203) {
               return this.mergeFrom((C2S_Click_8203)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Click_8203 other) {
            if (other == ClickGoldMsg.C2S_Click_8203.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Click_8203 parsedMessage = null;

            try {
               parsedMessage = (C2S_Click_8203)ClickGoldMsg.C2S_Click_8203.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Click_8203)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
         }

         public ClickGoldType getType() {
            ClickGoldType result = ClickGoldMsg.ClickGoldType.valueOf(this.type_);
            return result == null ? ClickGoldMsg.ClickGoldType.TYPE_FREE : result;
         }

         public Builder setType(ClickGoldType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.type_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 1;
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

   public static final class S2C_ClickResult_8204 extends GeneratedMessageV3 implements S2C_ClickResult_8204OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_ClickResult_8204 DEFAULT_INSTANCE = new S2C_ClickResult_8204();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ClickResult_8204> PARSER = new AbstractParser<S2C_ClickResult_8204>() {
         public S2C_ClickResult_8204 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ClickResult_8204(input, extensionRegistry);
         }
      };

      private S2C_ClickResult_8204(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ClickResult_8204() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ClickResult_8204();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ClickResult_8204(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_S2C_ClickResult_8204_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_S2C_ClickResult_8204_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ClickResult_8204.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
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
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.result_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ClickResult_8204)) {
            return super.equals(obj);
         } else {
            S2C_ClickResult_8204 other = (S2C_ClickResult_8204)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ClickResult_8204 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ClickResult_8204)PARSER.parseFrom(data);
      }

      public static S2C_ClickResult_8204 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ClickResult_8204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ClickResult_8204 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ClickResult_8204)PARSER.parseFrom(data);
      }

      public static S2C_ClickResult_8204 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ClickResult_8204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ClickResult_8204 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ClickResult_8204)PARSER.parseFrom(data);
      }

      public static S2C_ClickResult_8204 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ClickResult_8204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ClickResult_8204 parseFrom(InputStream input) throws IOException {
         return (S2C_ClickResult_8204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ClickResult_8204 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ClickResult_8204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ClickResult_8204 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ClickResult_8204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ClickResult_8204 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ClickResult_8204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ClickResult_8204 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ClickResult_8204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ClickResult_8204 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ClickResult_8204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ClickResult_8204 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ClickResult_8204 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ClickResult_8204> parser() {
         return PARSER;
      }

      public Parser<S2C_ClickResult_8204> getParserForType() {
         return PARSER;
      }

      public S2C_ClickResult_8204 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ClickResult_8204OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_S2C_ClickResult_8204_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_S2C_ClickResult_8204_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ClickResult_8204.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ClickGoldMsg.S2C_ClickResult_8204.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_S2C_ClickResult_8204_descriptor;
         }

         public S2C_ClickResult_8204 getDefaultInstanceForType() {
            return ClickGoldMsg.S2C_ClickResult_8204.getDefaultInstance();
         }

         public S2C_ClickResult_8204 build() {
            S2C_ClickResult_8204 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ClickResult_8204 buildPartial() {
            S2C_ClickResult_8204 result = new S2C_ClickResult_8204(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
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
            if (other instanceof S2C_ClickResult_8204) {
               return this.mergeFrom((S2C_ClickResult_8204)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ClickResult_8204 other) {
            if (other == ClickGoldMsg.S2C_ClickResult_8204.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasResult();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ClickResult_8204 parsedMessage = null;

            try {
               parsedMessage = (S2C_ClickResult_8204)ClickGoldMsg.S2C_ClickResult_8204.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ClickResult_8204)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_OneKeyClick_8205 extends GeneratedMessageV3 implements C2S_OneKeyClick_8205OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OneKeyClick_8205 DEFAULT_INSTANCE = new C2S_OneKeyClick_8205();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OneKeyClick_8205> PARSER = new AbstractParser<C2S_OneKeyClick_8205>() {
         public C2S_OneKeyClick_8205 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OneKeyClick_8205(input, extensionRegistry);
         }
      };

      private C2S_OneKeyClick_8205(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OneKeyClick_8205() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OneKeyClick_8205();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OneKeyClick_8205(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_C2S_OneKeyClick_8205_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_C2S_OneKeyClick_8205_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OneKeyClick_8205.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OneKeyClick_8205)) {
            return super.equals(obj);
         } else {
            C2S_OneKeyClick_8205 other = (C2S_OneKeyClick_8205)obj;
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

      public static C2S_OneKeyClick_8205 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyClick_8205)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyClick_8205 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyClick_8205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyClick_8205 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyClick_8205)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyClick_8205 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyClick_8205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyClick_8205 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyClick_8205)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyClick_8205 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyClick_8205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyClick_8205 parseFrom(InputStream input) throws IOException {
         return (C2S_OneKeyClick_8205)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OneKeyClick_8205 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyClick_8205)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OneKeyClick_8205 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OneKeyClick_8205)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OneKeyClick_8205 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyClick_8205)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OneKeyClick_8205 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OneKeyClick_8205)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OneKeyClick_8205 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyClick_8205)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OneKeyClick_8205 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OneKeyClick_8205 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OneKeyClick_8205> parser() {
         return PARSER;
      }

      public Parser<C2S_OneKeyClick_8205> getParserForType() {
         return PARSER;
      }

      public C2S_OneKeyClick_8205 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OneKeyClick_8205OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_C2S_OneKeyClick_8205_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_C2S_OneKeyClick_8205_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OneKeyClick_8205.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ClickGoldMsg.C2S_OneKeyClick_8205.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_C2S_OneKeyClick_8205_descriptor;
         }

         public C2S_OneKeyClick_8205 getDefaultInstanceForType() {
            return ClickGoldMsg.C2S_OneKeyClick_8205.getDefaultInstance();
         }

         public C2S_OneKeyClick_8205 build() {
            C2S_OneKeyClick_8205 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OneKeyClick_8205 buildPartial() {
            C2S_OneKeyClick_8205 result = new C2S_OneKeyClick_8205(this);
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
            if (other instanceof C2S_OneKeyClick_8205) {
               return this.mergeFrom((C2S_OneKeyClick_8205)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OneKeyClick_8205 other) {
            if (other == ClickGoldMsg.C2S_OneKeyClick_8205.getDefaultInstance()) {
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
            C2S_OneKeyClick_8205 parsedMessage = null;

            try {
               parsedMessage = (C2S_OneKeyClick_8205)ClickGoldMsg.C2S_OneKeyClick_8205.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OneKeyClick_8205)e.getUnfinishedMessage();
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

   public static final class S2C_OneKeyClick_8206 extends GeneratedMessageV3 implements S2C_OneKeyClick_8206OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int COPPER_FIELD_NUMBER = 2;
      private int copper_;
      public static final int GOLD_FIELD_NUMBER = 3;
      private int gold_;
      private byte memoizedIsInitialized;
      private static final S2C_OneKeyClick_8206 DEFAULT_INSTANCE = new S2C_OneKeyClick_8206();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OneKeyClick_8206> PARSER = new AbstractParser<S2C_OneKeyClick_8206>() {
         public S2C_OneKeyClick_8206 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OneKeyClick_8206(input, extensionRegistry);
         }
      };

      private S2C_OneKeyClick_8206(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OneKeyClick_8206() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OneKeyClick_8206();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OneKeyClick_8206(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.copper_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.gold_ = input.readInt32();
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
         return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_S2C_OneKeyClick_8206_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_S2C_OneKeyClick_8206_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OneKeyClick_8206.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasCopper() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCopper() {
         return this.copper_;
      }

      public boolean hasGold() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getGold() {
         return this.gold_;
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
         } else if (!this.hasCopper()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGold()) {
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
            output.writeInt32(2, this.copper_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.gold_);
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
               size += CodedOutputStream.computeInt32Size(2, this.copper_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.gold_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OneKeyClick_8206)) {
            return super.equals(obj);
         } else {
            S2C_OneKeyClick_8206 other = (S2C_OneKeyClick_8206)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasCopper() != other.hasCopper()) {
               return false;
            } else if (this.hasCopper() && this.getCopper() != other.getCopper()) {
               return false;
            } else if (this.hasGold() != other.hasGold()) {
               return false;
            } else if (this.hasGold() && this.getGold() != other.getGold()) {
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

            if (this.hasCopper()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCopper();
            }

            if (this.hasGold()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGold();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OneKeyClick_8206 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyClick_8206)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyClick_8206 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyClick_8206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyClick_8206 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyClick_8206)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyClick_8206 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyClick_8206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyClick_8206 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyClick_8206)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyClick_8206 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyClick_8206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyClick_8206 parseFrom(InputStream input) throws IOException {
         return (S2C_OneKeyClick_8206)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OneKeyClick_8206 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyClick_8206)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OneKeyClick_8206 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OneKeyClick_8206)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OneKeyClick_8206 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyClick_8206)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OneKeyClick_8206 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OneKeyClick_8206)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OneKeyClick_8206 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyClick_8206)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OneKeyClick_8206 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OneKeyClick_8206 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OneKeyClick_8206> parser() {
         return PARSER;
      }

      public Parser<S2C_OneKeyClick_8206> getParserForType() {
         return PARSER;
      }

      public S2C_OneKeyClick_8206 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OneKeyClick_8206OrBuilder {
         private int bitField0_;
         private int result_;
         private int copper_;
         private int gold_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_S2C_OneKeyClick_8206_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_S2C_OneKeyClick_8206_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OneKeyClick_8206.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ClickGoldMsg.S2C_OneKeyClick_8206.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.copper_ = 0;
            this.bitField0_ &= -3;
            this.gold_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ClickGoldMsg.internal_static_clickGold_com_gzbz_protobuf_S2C_OneKeyClick_8206_descriptor;
         }

         public S2C_OneKeyClick_8206 getDefaultInstanceForType() {
            return ClickGoldMsg.S2C_OneKeyClick_8206.getDefaultInstance();
         }

         public S2C_OneKeyClick_8206 build() {
            S2C_OneKeyClick_8206 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OneKeyClick_8206 buildPartial() {
            S2C_OneKeyClick_8206 result = new S2C_OneKeyClick_8206(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.copper_ = this.copper_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.gold_ = this.gold_;
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
            if (other instanceof S2C_OneKeyClick_8206) {
               return this.mergeFrom((S2C_OneKeyClick_8206)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OneKeyClick_8206 other) {
            if (other == ClickGoldMsg.S2C_OneKeyClick_8206.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasCopper()) {
                  this.setCopper(other.getCopper());
               }

               if (other.hasGold()) {
                  this.setGold(other.getGold());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasCopper()) {
               return false;
            } else {
               return this.hasGold();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OneKeyClick_8206 parsedMessage = null;

            try {
               parsedMessage = (S2C_OneKeyClick_8206)ClickGoldMsg.S2C_OneKeyClick_8206.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OneKeyClick_8206)e.getUnfinishedMessage();
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

         public boolean hasCopper() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCopper() {
            return this.copper_;
         }

         public Builder setCopper(int value) {
            this.bitField0_ |= 2;
            this.copper_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCopper() {
            this.bitField0_ &= -3;
            this.copper_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGold() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getGold() {
            return this.gold_;
         }

         public Builder setGold(int value) {
            this.bitField0_ |= 4;
            this.gold_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGold() {
            this.bitField0_ &= -5;
            this.gold_ = 0;
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

   public interface C2S_Click_8203OrBuilder extends MessageOrBuilder {
      boolean hasType();

      ClickGoldType getType();
   }

   public interface C2S_OneKeyClick_8205OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenUi_8201OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();
   }

   public interface ClickGoldInfoOrBuilder extends MessageOrBuilder {
      boolean hasType();

      ClickGoldType getType();

      boolean hasNum();

      int getNum();
   }

   public interface S2C_ClickResult_8204OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_OneKeyClick_8206OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasCopper();

      int getCopper();

      boolean hasGold();

      int getGold();
   }

   public interface S2C_OpenUiResult_8202OrBuilder extends MessageOrBuilder {
      List<ClickGoldInfo> getInfosList();

      ClickGoldInfo getInfos(int index);

      int getInfosCount();

      List<? extends ClickGoldInfoOrBuilder> getInfosOrBuilderList();

      ClickGoldInfoOrBuilder getInfosOrBuilder(int index);
   }
}
