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

public final class ArmyArrayMsg {
   private static final Descriptors.Descriptor internal_static_armyArray_com_gzbz_protobuf_ArrayData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_armyArray_com_gzbz_protobuf_ArrayData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_armyArray_com_gzbz_protobuf_C2S_Info_20601_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_armyArray_com_gzbz_protobuf_C2S_Info_20601_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_armyArray_com_gzbz_protobuf_S2C_Info_20602_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_armyArray_com_gzbz_protobuf_S2C_Info_20602_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_armyArray_com_gzbz_protobuf_C2S_Unlock_20603_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_armyArray_com_gzbz_protobuf_C2S_Unlock_20603_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_armyArray_com_gzbz_protobuf_S2C_Unlock_20604_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_armyArray_com_gzbz_protobuf_S2C_Unlock_20604_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_armyArray_com_gzbz_protobuf_C2S_SelectArray_20605_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_armyArray_com_gzbz_protobuf_C2S_SelectArray_20605_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_armyArray_com_gzbz_protobuf_C2S_PutEye_20607_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_armyArray_com_gzbz_protobuf_C2S_PutEye_20607_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_armyArray_com_gzbz_protobuf_C2S_PutMaterial_20609_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_armyArray_com_gzbz_protobuf_C2S_PutMaterial_20609_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_armyArray_com_gzbz_protobuf_S2C_PutMaterial_20610_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_armyArray_com_gzbz_protobuf_S2C_PutMaterial_20610_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_armyArray_com_gzbz_protobuf_S2C_UpdateShowGridNum_20612_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_armyArray_com_gzbz_protobuf_S2C_UpdateShowGridNum_20612_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ArmyArrayMsg() {
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
      String[] descriptorData = new String[]{"\n\u000fArmyArray.proto\u0012\u001barmyArray.com.gzbz.protobuf\u001a\fcommon.proto\"^\n\tArrayData\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007arrayId\u0018\u0002 \u0002(\u0005\u0012\u000b\n\u0003eye\u0018\u0003 \u0002(\u0005\u0012%\n\u000bprotectData\u0018\u0004 \u0003(\u000b2\u0010.common.ItemInfo\"\u0010\n\u000eC2S_Info_20601\"\u007f\n\u000eS2C_Info_20602\u0012\u000e\n\u0006isOpen\u0018\u0001 \u0002(\b\u0012\r\n\u0005grids\u0018\u0002 \u0003(\u0005\u00129\n\tarrayData\u0018\u0003 \u0003(\u000b2&.armyArray.com.gzbz.protobuf.ArrayData\u0012\u0013\n\u000bshowGridNum\u0018\u0004 \u0001(\u0005\" \n\u0010C2S_Unlock_20603\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\" \n\u0010S2C_Unlock_20604\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\"6\n\u0015C2S_SelectArray_20605\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007arrayId\u0018\u0002 \u0002(\u0005\"-\n\u0010C2S_PutEye_20607\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003eye\u0018\u0002 \u0002(\u0005\"B\n\u0015C2S_PutMaterial_20609\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003pos\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006itemId\u0018\u0003 \u0002(\u0005\"B\n\u0015S2C_PutMaterial_20610\u0012\f\n\u0004grid\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003pos\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006itemId\u0018\u0003 \u0002(\u0005\"2\n\u001bS2C_UpdateShowGridNum_20612\u0012\u0013\n\u000bshowGridNum\u0018\u0001 \u0002(\u0005B#\n\u0011com.gzbz.protobufB\fArmyArrayMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_armyArray_com_gzbz_protobuf_ArrayData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_armyArray_com_gzbz_protobuf_ArrayData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_armyArray_com_gzbz_protobuf_ArrayData_descriptor, new String[]{"Grid", "ArrayId", "Eye", "ProtectData"});
      internal_static_armyArray_com_gzbz_protobuf_C2S_Info_20601_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_armyArray_com_gzbz_protobuf_C2S_Info_20601_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_armyArray_com_gzbz_protobuf_C2S_Info_20601_descriptor, new String[0]);
      internal_static_armyArray_com_gzbz_protobuf_S2C_Info_20602_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_armyArray_com_gzbz_protobuf_S2C_Info_20602_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_armyArray_com_gzbz_protobuf_S2C_Info_20602_descriptor, new String[]{"IsOpen", "Grids", "ArrayData", "ShowGridNum"});
      internal_static_armyArray_com_gzbz_protobuf_C2S_Unlock_20603_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_armyArray_com_gzbz_protobuf_C2S_Unlock_20603_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_armyArray_com_gzbz_protobuf_C2S_Unlock_20603_descriptor, new String[]{"Grid"});
      internal_static_armyArray_com_gzbz_protobuf_S2C_Unlock_20604_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_armyArray_com_gzbz_protobuf_S2C_Unlock_20604_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_armyArray_com_gzbz_protobuf_S2C_Unlock_20604_descriptor, new String[]{"Grid"});
      internal_static_armyArray_com_gzbz_protobuf_C2S_SelectArray_20605_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_armyArray_com_gzbz_protobuf_C2S_SelectArray_20605_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_armyArray_com_gzbz_protobuf_C2S_SelectArray_20605_descriptor, new String[]{"Grid", "ArrayId"});
      internal_static_armyArray_com_gzbz_protobuf_C2S_PutEye_20607_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_armyArray_com_gzbz_protobuf_C2S_PutEye_20607_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_armyArray_com_gzbz_protobuf_C2S_PutEye_20607_descriptor, new String[]{"Grid", "Eye"});
      internal_static_armyArray_com_gzbz_protobuf_C2S_PutMaterial_20609_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_armyArray_com_gzbz_protobuf_C2S_PutMaterial_20609_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_armyArray_com_gzbz_protobuf_C2S_PutMaterial_20609_descriptor, new String[]{"Grid", "Pos", "ItemId"});
      internal_static_armyArray_com_gzbz_protobuf_S2C_PutMaterial_20610_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_armyArray_com_gzbz_protobuf_S2C_PutMaterial_20610_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_armyArray_com_gzbz_protobuf_S2C_PutMaterial_20610_descriptor, new String[]{"Grid", "Pos", "ItemId"});
      internal_static_armyArray_com_gzbz_protobuf_S2C_UpdateShowGridNum_20612_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_armyArray_com_gzbz_protobuf_S2C_UpdateShowGridNum_20612_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_armyArray_com_gzbz_protobuf_S2C_UpdateShowGridNum_20612_descriptor, new String[]{"ShowGridNum"});
      CommonMsg.getDescriptor();
   }

   public static final class ArrayData extends GeneratedMessageV3 implements ArrayDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      public static final int ARRAYID_FIELD_NUMBER = 2;
      private int arrayId_;
      public static final int EYE_FIELD_NUMBER = 3;
      private int eye_;
      public static final int PROTECTDATA_FIELD_NUMBER = 4;
      private List<CommonMsg.ItemInfo> protectData_;
      private byte memoizedIsInitialized;
      private static final ArrayData DEFAULT_INSTANCE = new ArrayData();
      /** @deprecated */
      @Deprecated
      public static final Parser<ArrayData> PARSER = new AbstractParser<ArrayData>() {
         public ArrayData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new ArrayData(input, extensionRegistry);
         }
      };

      private ArrayData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ArrayData() {
         this.memoizedIsInitialized = -1;
         this.protectData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new ArrayData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ArrayData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.grid_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.arrayId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.eye_ = input.readInt32();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.protectData_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.protectData_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
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
                  this.protectData_ = Collections.unmodifiableList(this.protectData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_ArrayData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_ArrayData_fieldAccessorTable.ensureFieldAccessorsInitialized(ArrayData.class, Builder.class);
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public boolean hasArrayId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getArrayId() {
         return this.arrayId_;
      }

      public boolean hasEye() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getEye() {
         return this.eye_;
      }

      public List<CommonMsg.ItemInfo> getProtectDataList() {
         return this.protectData_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getProtectDataOrBuilderList() {
         return this.protectData_;
      }

      public int getProtectDataCount() {
         return this.protectData_.size();
      }

      public CommonMsg.ItemInfo getProtectData(int index) {
         return (CommonMsg.ItemInfo)this.protectData_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getProtectDataOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.protectData_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasArrayId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEye()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getProtectDataCount(); ++i) {
               if (!this.getProtectData(i).isInitialized()) {
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
            output.writeInt32(1, this.grid_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.arrayId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.eye_);
         }

         for(int i = 0; i < this.protectData_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.protectData_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.grid_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.arrayId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.eye_);
            }

            for(int i = 0; i < this.protectData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.protectData_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof ArrayData)) {
            return super.equals(obj);
         } else {
            ArrayData other = (ArrayData)obj;
            if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
               return false;
            } else if (this.hasArrayId() != other.hasArrayId()) {
               return false;
            } else if (this.hasArrayId() && this.getArrayId() != other.getArrayId()) {
               return false;
            } else if (this.hasEye() != other.hasEye()) {
               return false;
            } else if (this.hasEye() && this.getEye() != other.getEye()) {
               return false;
            } else if (!this.getProtectDataList().equals(other.getProtectDataList())) {
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
            if (this.hasGrid()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGrid();
            }

            if (this.hasArrayId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getArrayId();
            }

            if (this.hasEye()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getEye();
            }

            if (this.getProtectDataCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getProtectDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static ArrayData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (ArrayData)PARSER.parseFrom(data);
      }

      public static ArrayData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ArrayData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ArrayData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (ArrayData)PARSER.parseFrom(data);
      }

      public static ArrayData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ArrayData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ArrayData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (ArrayData)PARSER.parseFrom(data);
      }

      public static ArrayData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ArrayData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ArrayData parseFrom(InputStream input) throws IOException {
         return (ArrayData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ArrayData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ArrayData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static ArrayData parseDelimitedFrom(InputStream input) throws IOException {
         return (ArrayData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static ArrayData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ArrayData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static ArrayData parseFrom(CodedInputStream input) throws IOException {
         return (ArrayData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ArrayData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ArrayData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(ArrayData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static ArrayData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ArrayData> parser() {
         return PARSER;
      }

      public Parser<ArrayData> getParserForType() {
         return PARSER;
      }

      public ArrayData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ArrayDataOrBuilder {
         private int bitField0_;
         private int grid_;
         private int arrayId_;
         private int eye_;
         private List<CommonMsg.ItemInfo> protectData_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> protectDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_ArrayData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_ArrayData_fieldAccessorTable.ensureFieldAccessorsInitialized(ArrayData.class, Builder.class);
         }

         private Builder() {
            this.protectData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.protectData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArmyArrayMsg.ArrayData.alwaysUseFieldBuilders) {
               this.getProtectDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            this.arrayId_ = 0;
            this.bitField0_ &= -3;
            this.eye_ = 0;
            this.bitField0_ &= -5;
            if (this.protectDataBuilder_ == null) {
               this.protectData_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.protectDataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_ArrayData_descriptor;
         }

         public ArrayData getDefaultInstanceForType() {
            return ArmyArrayMsg.ArrayData.getDefaultInstance();
         }

         public ArrayData build() {
            ArrayData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public ArrayData buildPartial() {
            ArrayData result = new ArrayData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.grid_ = this.grid_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.arrayId_ = this.arrayId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.eye_ = this.eye_;
               to_bitField0_ |= 4;
            }

            if (this.protectDataBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.protectData_ = Collections.unmodifiableList(this.protectData_);
                  this.bitField0_ &= -9;
               }

               result.protectData_ = this.protectData_;
            } else {
               result.protectData_ = this.protectDataBuilder_.build();
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
            if (other instanceof ArrayData) {
               return this.mergeFrom((ArrayData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ArrayData other) {
            if (other == ArmyArrayMsg.ArrayData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               if (other.hasArrayId()) {
                  this.setArrayId(other.getArrayId());
               }

               if (other.hasEye()) {
                  this.setEye(other.getEye());
               }

               if (this.protectDataBuilder_ == null) {
                  if (!other.protectData_.isEmpty()) {
                     if (this.protectData_.isEmpty()) {
                        this.protectData_ = other.protectData_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureProtectDataIsMutable();
                        this.protectData_.addAll(other.protectData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.protectData_.isEmpty()) {
                  if (this.protectDataBuilder_.isEmpty()) {
                     this.protectDataBuilder_.dispose();
                     this.protectDataBuilder_ = null;
                     this.protectData_ = other.protectData_;
                     this.bitField0_ &= -9;
                     this.protectDataBuilder_ = ArmyArrayMsg.ArrayData.alwaysUseFieldBuilders ? this.getProtectDataFieldBuilder() : null;
                  } else {
                     this.protectDataBuilder_.addAllMessages(other.protectData_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGrid()) {
               return false;
            } else if (!this.hasArrayId()) {
               return false;
            } else if (!this.hasEye()) {
               return false;
            } else {
               for(int i = 0; i < this.getProtectDataCount(); ++i) {
                  if (!this.getProtectData(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            ArrayData parsedMessage = null;

            try {
               parsedMessage = (ArrayData)ArmyArrayMsg.ArrayData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (ArrayData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGrid() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGrid() {
            return this.grid_;
         }

         public Builder setGrid(int value) {
            this.bitField0_ |= 1;
            this.grid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrid() {
            this.bitField0_ &= -2;
            this.grid_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasArrayId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getArrayId() {
            return this.arrayId_;
         }

         public Builder setArrayId(int value) {
            this.bitField0_ |= 2;
            this.arrayId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearArrayId() {
            this.bitField0_ &= -3;
            this.arrayId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEye() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getEye() {
            return this.eye_;
         }

         public Builder setEye(int value) {
            this.bitField0_ |= 4;
            this.eye_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEye() {
            this.bitField0_ &= -5;
            this.eye_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureProtectDataIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.protectData_ = new ArrayList(this.protectData_);
               this.bitField0_ |= 8;
            }

         }

         public List<CommonMsg.ItemInfo> getProtectDataList() {
            return this.protectDataBuilder_ == null ? Collections.unmodifiableList(this.protectData_) : this.protectDataBuilder_.getMessageList();
         }

         public int getProtectDataCount() {
            return this.protectDataBuilder_ == null ? this.protectData_.size() : this.protectDataBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getProtectData(int index) {
            return this.protectDataBuilder_ == null ? (CommonMsg.ItemInfo)this.protectData_.get(index) : (CommonMsg.ItemInfo)this.protectDataBuilder_.getMessage(index);
         }

         public Builder setProtectData(int index, CommonMsg.ItemInfo value) {
            if (this.protectDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureProtectDataIsMutable();
               this.protectData_.set(index, value);
               this.onChanged();
            } else {
               this.protectDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setProtectData(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.protectDataBuilder_ == null) {
               this.ensureProtectDataIsMutable();
               this.protectData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.protectDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addProtectData(CommonMsg.ItemInfo value) {
            if (this.protectDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureProtectDataIsMutable();
               this.protectData_.add(value);
               this.onChanged();
            } else {
               this.protectDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addProtectData(int index, CommonMsg.ItemInfo value) {
            if (this.protectDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureProtectDataIsMutable();
               this.protectData_.add(index, value);
               this.onChanged();
            } else {
               this.protectDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addProtectData(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.protectDataBuilder_ == null) {
               this.ensureProtectDataIsMutable();
               this.protectData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.protectDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addProtectData(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.protectDataBuilder_ == null) {
               this.ensureProtectDataIsMutable();
               this.protectData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.protectDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllProtectData(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.protectDataBuilder_ == null) {
               this.ensureProtectDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.protectData_);
               this.onChanged();
            } else {
               this.protectDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearProtectData() {
            if (this.protectDataBuilder_ == null) {
               this.protectData_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.protectDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeProtectData(int index) {
            if (this.protectDataBuilder_ == null) {
               this.ensureProtectDataIsMutable();
               this.protectData_.remove(index);
               this.onChanged();
            } else {
               this.protectDataBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getProtectDataBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getProtectDataFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getProtectDataOrBuilder(int index) {
            return this.protectDataBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.protectData_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.protectDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getProtectDataOrBuilderList() {
            return this.protectDataBuilder_ != null ? this.protectDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.protectData_);
         }

         public CommonMsg.ItemInfo.Builder addProtectDataBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getProtectDataFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addProtectDataBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getProtectDataFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getProtectDataBuilderList() {
            return this.getProtectDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getProtectDataFieldBuilder() {
            if (this.protectDataBuilder_ == null) {
               this.protectDataBuilder_ = new RepeatedFieldBuilderV3(this.protectData_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.protectData_ = null;
            }

            return this.protectDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_Info_20601 extends GeneratedMessageV3 implements C2S_Info_20601OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Info_20601 DEFAULT_INSTANCE = new C2S_Info_20601();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Info_20601> PARSER = new AbstractParser<C2S_Info_20601>() {
         public C2S_Info_20601 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Info_20601(input, extensionRegistry);
         }
      };

      private C2S_Info_20601(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Info_20601() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Info_20601();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Info_20601(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_Info_20601_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_Info_20601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Info_20601.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Info_20601)) {
            return super.equals(obj);
         } else {
            C2S_Info_20601 other = (C2S_Info_20601)obj;
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

      public static C2S_Info_20601 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Info_20601)PARSER.parseFrom(data);
      }

      public static C2S_Info_20601 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Info_20601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Info_20601 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Info_20601)PARSER.parseFrom(data);
      }

      public static C2S_Info_20601 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Info_20601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Info_20601 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Info_20601)PARSER.parseFrom(data);
      }

      public static C2S_Info_20601 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Info_20601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Info_20601 parseFrom(InputStream input) throws IOException {
         return (C2S_Info_20601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Info_20601 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Info_20601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Info_20601 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Info_20601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Info_20601 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Info_20601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Info_20601 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Info_20601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Info_20601 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Info_20601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Info_20601 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Info_20601 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Info_20601> parser() {
         return PARSER;
      }

      public Parser<C2S_Info_20601> getParserForType() {
         return PARSER;
      }

      public C2S_Info_20601 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Info_20601OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_Info_20601_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_Info_20601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Info_20601.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArmyArrayMsg.C2S_Info_20601.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_Info_20601_descriptor;
         }

         public C2S_Info_20601 getDefaultInstanceForType() {
            return ArmyArrayMsg.C2S_Info_20601.getDefaultInstance();
         }

         public C2S_Info_20601 build() {
            C2S_Info_20601 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Info_20601 buildPartial() {
            C2S_Info_20601 result = new C2S_Info_20601(this);
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
            if (other instanceof C2S_Info_20601) {
               return this.mergeFrom((C2S_Info_20601)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Info_20601 other) {
            if (other == ArmyArrayMsg.C2S_Info_20601.getDefaultInstance()) {
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
            C2S_Info_20601 parsedMessage = null;

            try {
               parsedMessage = (C2S_Info_20601)ArmyArrayMsg.C2S_Info_20601.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Info_20601)e.getUnfinishedMessage();
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

   public static final class S2C_Info_20602 extends GeneratedMessageV3 implements S2C_Info_20602OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ISOPEN_FIELD_NUMBER = 1;
      private boolean isOpen_;
      public static final int GRIDS_FIELD_NUMBER = 2;
      private Internal.IntList grids_;
      public static final int ARRAYDATA_FIELD_NUMBER = 3;
      private List<ArrayData> arrayData_;
      public static final int SHOWGRIDNUM_FIELD_NUMBER = 4;
      private int showGridNum_;
      private byte memoizedIsInitialized;
      private static final S2C_Info_20602 DEFAULT_INSTANCE = new S2C_Info_20602();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Info_20602> PARSER = new AbstractParser<S2C_Info_20602>() {
         public S2C_Info_20602 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Info_20602(input, extensionRegistry);
         }
      };

      private S2C_Info_20602(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Info_20602() {
         this.memoizedIsInitialized = -1;
         this.grids_ = emptyIntList();
         this.arrayData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Info_20602();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Info_20602(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                  int limit;
                  switch (tag) {
                     case 0:
                        done = true;
                        continue;
                     case 8:
                        this.bitField0_ |= 1;
                        this.isOpen_ = input.readBool();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.grids_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.grids_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.grids_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.arrayData_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.arrayData_.add(input.readMessage(ArmyArrayMsg.ArrayData.PARSER, extensionRegistry));
                        continue;
                     case 32:
                        this.bitField0_ |= 2;
                        this.showGridNum_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.grids_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.grids_.makeImmutable();
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.arrayData_ = Collections.unmodifiableList(this.arrayData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_S2C_Info_20602_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_S2C_Info_20602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Info_20602.class, Builder.class);
      }

      public boolean hasIsOpen() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsOpen() {
         return this.isOpen_;
      }

      public List<Integer> getGridsList() {
         return this.grids_;
      }

      public int getGridsCount() {
         return this.grids_.size();
      }

      public int getGrids(int index) {
         return this.grids_.getInt(index);
      }

      public List<ArrayData> getArrayDataList() {
         return this.arrayData_;
      }

      public List<? extends ArrayDataOrBuilder> getArrayDataOrBuilderList() {
         return this.arrayData_;
      }

      public int getArrayDataCount() {
         return this.arrayData_.size();
      }

      public ArrayData getArrayData(int index) {
         return (ArrayData)this.arrayData_.get(index);
      }

      public ArrayDataOrBuilder getArrayDataOrBuilder(int index) {
         return (ArrayDataOrBuilder)this.arrayData_.get(index);
      }

      public boolean hasShowGridNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getShowGridNum() {
         return this.showGridNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIsOpen()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getArrayDataCount(); ++i) {
               if (!this.getArrayData(i).isInitialized()) {
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
            output.writeBool(1, this.isOpen_);
         }

         for(int i = 0; i < this.grids_.size(); ++i) {
            output.writeInt32(2, this.grids_.getInt(i));
         }

         for(int i = 0; i < this.arrayData_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.arrayData_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(4, this.showGridNum_);
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
               size += CodedOutputStream.computeBoolSize(1, this.isOpen_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.grids_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.grids_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGridsList().size();

            for(int i = 0; i < this.arrayData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.arrayData_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.showGridNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Info_20602)) {
            return super.equals(obj);
         } else {
            S2C_Info_20602 other = (S2C_Info_20602)obj;
            if (this.hasIsOpen() != other.hasIsOpen()) {
               return false;
            } else if (this.hasIsOpen() && this.getIsOpen() != other.getIsOpen()) {
               return false;
            } else if (!this.getGridsList().equals(other.getGridsList())) {
               return false;
            } else if (!this.getArrayDataList().equals(other.getArrayDataList())) {
               return false;
            } else if (this.hasShowGridNum() != other.hasShowGridNum()) {
               return false;
            } else if (this.hasShowGridNum() && this.getShowGridNum() != other.getShowGridNum()) {
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
            if (this.hasIsOpen()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getIsOpen());
            }

            if (this.getGridsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGridsList().hashCode();
            }

            if (this.getArrayDataCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getArrayDataList().hashCode();
            }

            if (this.hasShowGridNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getShowGridNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Info_20602 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Info_20602)PARSER.parseFrom(data);
      }

      public static S2C_Info_20602 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Info_20602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Info_20602 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Info_20602)PARSER.parseFrom(data);
      }

      public static S2C_Info_20602 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Info_20602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Info_20602 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Info_20602)PARSER.parseFrom(data);
      }

      public static S2C_Info_20602 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Info_20602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Info_20602 parseFrom(InputStream input) throws IOException {
         return (S2C_Info_20602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Info_20602 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Info_20602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Info_20602 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Info_20602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Info_20602 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Info_20602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Info_20602 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Info_20602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Info_20602 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Info_20602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Info_20602 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Info_20602 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Info_20602> parser() {
         return PARSER;
      }

      public Parser<S2C_Info_20602> getParserForType() {
         return PARSER;
      }

      public S2C_Info_20602 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Info_20602OrBuilder {
         private int bitField0_;
         private boolean isOpen_;
         private Internal.IntList grids_;
         private List<ArrayData> arrayData_;
         private RepeatedFieldBuilderV3<ArrayData, ArrayData.Builder, ArrayDataOrBuilder> arrayDataBuilder_;
         private int showGridNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_S2C_Info_20602_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_S2C_Info_20602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Info_20602.class, Builder.class);
         }

         private Builder() {
            this.grids_ = ArmyArrayMsg.S2C_Info_20602.emptyIntList();
            this.arrayData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.grids_ = ArmyArrayMsg.S2C_Info_20602.emptyIntList();
            this.arrayData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArmyArrayMsg.S2C_Info_20602.alwaysUseFieldBuilders) {
               this.getArrayDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.isOpen_ = false;
            this.bitField0_ &= -2;
            this.grids_ = ArmyArrayMsg.S2C_Info_20602.emptyIntList();
            this.bitField0_ &= -3;
            if (this.arrayDataBuilder_ == null) {
               this.arrayData_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.arrayDataBuilder_.clear();
            }

            this.showGridNum_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_S2C_Info_20602_descriptor;
         }

         public S2C_Info_20602 getDefaultInstanceForType() {
            return ArmyArrayMsg.S2C_Info_20602.getDefaultInstance();
         }

         public S2C_Info_20602 build() {
            S2C_Info_20602 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Info_20602 buildPartial() {
            S2C_Info_20602 result = new S2C_Info_20602(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.isOpen_ = this.isOpen_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.grids_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.grids_ = this.grids_;
            if (this.arrayDataBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.arrayData_ = Collections.unmodifiableList(this.arrayData_);
                  this.bitField0_ &= -5;
               }

               result.arrayData_ = this.arrayData_;
            } else {
               result.arrayData_ = this.arrayDataBuilder_.build();
            }

            if ((from_bitField0_ & 8) != 0) {
               result.showGridNum_ = this.showGridNum_;
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
            if (other instanceof S2C_Info_20602) {
               return this.mergeFrom((S2C_Info_20602)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Info_20602 other) {
            if (other == ArmyArrayMsg.S2C_Info_20602.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIsOpen()) {
                  this.setIsOpen(other.getIsOpen());
               }

               if (!other.grids_.isEmpty()) {
                  if (this.grids_.isEmpty()) {
                     this.grids_ = other.grids_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureGridsIsMutable();
                     this.grids_.addAll(other.grids_);
                  }

                  this.onChanged();
               }

               if (this.arrayDataBuilder_ == null) {
                  if (!other.arrayData_.isEmpty()) {
                     if (this.arrayData_.isEmpty()) {
                        this.arrayData_ = other.arrayData_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureArrayDataIsMutable();
                        this.arrayData_.addAll(other.arrayData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.arrayData_.isEmpty()) {
                  if (this.arrayDataBuilder_.isEmpty()) {
                     this.arrayDataBuilder_.dispose();
                     this.arrayDataBuilder_ = null;
                     this.arrayData_ = other.arrayData_;
                     this.bitField0_ &= -5;
                     this.arrayDataBuilder_ = ArmyArrayMsg.S2C_Info_20602.alwaysUseFieldBuilders ? this.getArrayDataFieldBuilder() : null;
                  } else {
                     this.arrayDataBuilder_.addAllMessages(other.arrayData_);
                  }
               }

               if (other.hasShowGridNum()) {
                  this.setShowGridNum(other.getShowGridNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasIsOpen()) {
               return false;
            } else {
               for(int i = 0; i < this.getArrayDataCount(); ++i) {
                  if (!this.getArrayData(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Info_20602 parsedMessage = null;

            try {
               parsedMessage = (S2C_Info_20602)ArmyArrayMsg.S2C_Info_20602.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Info_20602)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIsOpen() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getIsOpen() {
            return this.isOpen_;
         }

         public Builder setIsOpen(boolean value) {
            this.bitField0_ |= 1;
            this.isOpen_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsOpen() {
            this.bitField0_ &= -2;
            this.isOpen_ = false;
            this.onChanged();
            return this;
         }

         private void ensureGridsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.grids_ = ArmyArrayMsg.S2C_Info_20602.mutableCopy(this.grids_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getGridsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.grids_) : this.grids_);
         }

         public int getGridsCount() {
            return this.grids_.size();
         }

         public int getGrids(int index) {
            return this.grids_.getInt(index);
         }

         public Builder setGrids(int index, int value) {
            this.ensureGridsIsMutable();
            this.grids_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGrids(int value) {
            this.ensureGridsIsMutable();
            this.grids_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGrids(Iterable<? extends Integer> values) {
            this.ensureGridsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.grids_);
            this.onChanged();
            return this;
         }

         public Builder clearGrids() {
            this.grids_ = ArmyArrayMsg.S2C_Info_20602.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         private void ensureArrayDataIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.arrayData_ = new ArrayList(this.arrayData_);
               this.bitField0_ |= 4;
            }

         }

         public List<ArrayData> getArrayDataList() {
            return this.arrayDataBuilder_ == null ? Collections.unmodifiableList(this.arrayData_) : this.arrayDataBuilder_.getMessageList();
         }

         public int getArrayDataCount() {
            return this.arrayDataBuilder_ == null ? this.arrayData_.size() : this.arrayDataBuilder_.getCount();
         }

         public ArrayData getArrayData(int index) {
            return this.arrayDataBuilder_ == null ? (ArrayData)this.arrayData_.get(index) : (ArrayData)this.arrayDataBuilder_.getMessage(index);
         }

         public Builder setArrayData(int index, ArrayData value) {
            if (this.arrayDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureArrayDataIsMutable();
               this.arrayData_.set(index, value);
               this.onChanged();
            } else {
               this.arrayDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setArrayData(int index, ArrayData.Builder builderForValue) {
            if (this.arrayDataBuilder_ == null) {
               this.ensureArrayDataIsMutable();
               this.arrayData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.arrayDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addArrayData(ArrayData value) {
            if (this.arrayDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureArrayDataIsMutable();
               this.arrayData_.add(value);
               this.onChanged();
            } else {
               this.arrayDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addArrayData(int index, ArrayData value) {
            if (this.arrayDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureArrayDataIsMutable();
               this.arrayData_.add(index, value);
               this.onChanged();
            } else {
               this.arrayDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addArrayData(ArrayData.Builder builderForValue) {
            if (this.arrayDataBuilder_ == null) {
               this.ensureArrayDataIsMutable();
               this.arrayData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.arrayDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addArrayData(int index, ArrayData.Builder builderForValue) {
            if (this.arrayDataBuilder_ == null) {
               this.ensureArrayDataIsMutable();
               this.arrayData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.arrayDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllArrayData(Iterable<? extends ArrayData> values) {
            if (this.arrayDataBuilder_ == null) {
               this.ensureArrayDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.arrayData_);
               this.onChanged();
            } else {
               this.arrayDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearArrayData() {
            if (this.arrayDataBuilder_ == null) {
               this.arrayData_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.arrayDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeArrayData(int index) {
            if (this.arrayDataBuilder_ == null) {
               this.ensureArrayDataIsMutable();
               this.arrayData_.remove(index);
               this.onChanged();
            } else {
               this.arrayDataBuilder_.remove(index);
            }

            return this;
         }

         public ArrayData.Builder getArrayDataBuilder(int index) {
            return (ArrayData.Builder)this.getArrayDataFieldBuilder().getBuilder(index);
         }

         public ArrayDataOrBuilder getArrayDataOrBuilder(int index) {
            return this.arrayDataBuilder_ == null ? (ArrayDataOrBuilder)this.arrayData_.get(index) : (ArrayDataOrBuilder)this.arrayDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ArrayDataOrBuilder> getArrayDataOrBuilderList() {
            return this.arrayDataBuilder_ != null ? this.arrayDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.arrayData_);
         }

         public ArrayData.Builder addArrayDataBuilder() {
            return (ArrayData.Builder)this.getArrayDataFieldBuilder().addBuilder(ArmyArrayMsg.ArrayData.getDefaultInstance());
         }

         public ArrayData.Builder addArrayDataBuilder(int index) {
            return (ArrayData.Builder)this.getArrayDataFieldBuilder().addBuilder(index, ArmyArrayMsg.ArrayData.getDefaultInstance());
         }

         public List<ArrayData.Builder> getArrayDataBuilderList() {
            return this.getArrayDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ArrayData, ArrayData.Builder, ArrayDataOrBuilder> getArrayDataFieldBuilder() {
            if (this.arrayDataBuilder_ == null) {
               this.arrayDataBuilder_ = new RepeatedFieldBuilderV3(this.arrayData_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.arrayData_ = null;
            }

            return this.arrayDataBuilder_;
         }

         public boolean hasShowGridNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getShowGridNum() {
            return this.showGridNum_;
         }

         public Builder setShowGridNum(int value) {
            this.bitField0_ |= 8;
            this.showGridNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShowGridNum() {
            this.bitField0_ &= -9;
            this.showGridNum_ = 0;
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

   public static final class C2S_Unlock_20603 extends GeneratedMessageV3 implements C2S_Unlock_20603OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      private byte memoizedIsInitialized;
      private static final C2S_Unlock_20603 DEFAULT_INSTANCE = new C2S_Unlock_20603();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Unlock_20603> PARSER = new AbstractParser<C2S_Unlock_20603>() {
         public C2S_Unlock_20603 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Unlock_20603(input, extensionRegistry);
         }
      };

      private C2S_Unlock_20603(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Unlock_20603() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Unlock_20603();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Unlock_20603(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.grid_ = input.readInt32();
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
         return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_Unlock_20603_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_Unlock_20603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Unlock_20603.class, Builder.class);
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.grid_);
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
               size += CodedOutputStream.computeInt32Size(1, this.grid_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Unlock_20603)) {
            return super.equals(obj);
         } else {
            C2S_Unlock_20603 other = (C2S_Unlock_20603)obj;
            if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
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
            if (this.hasGrid()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGrid();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Unlock_20603 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Unlock_20603)PARSER.parseFrom(data);
      }

      public static C2S_Unlock_20603 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Unlock_20603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Unlock_20603 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Unlock_20603)PARSER.parseFrom(data);
      }

      public static C2S_Unlock_20603 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Unlock_20603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Unlock_20603 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Unlock_20603)PARSER.parseFrom(data);
      }

      public static C2S_Unlock_20603 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Unlock_20603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Unlock_20603 parseFrom(InputStream input) throws IOException {
         return (C2S_Unlock_20603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Unlock_20603 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Unlock_20603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Unlock_20603 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Unlock_20603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Unlock_20603 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Unlock_20603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Unlock_20603 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Unlock_20603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Unlock_20603 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Unlock_20603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Unlock_20603 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Unlock_20603 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Unlock_20603> parser() {
         return PARSER;
      }

      public Parser<C2S_Unlock_20603> getParserForType() {
         return PARSER;
      }

      public C2S_Unlock_20603 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Unlock_20603OrBuilder {
         private int bitField0_;
         private int grid_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_Unlock_20603_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_Unlock_20603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Unlock_20603.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArmyArrayMsg.C2S_Unlock_20603.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_Unlock_20603_descriptor;
         }

         public C2S_Unlock_20603 getDefaultInstanceForType() {
            return ArmyArrayMsg.C2S_Unlock_20603.getDefaultInstance();
         }

         public C2S_Unlock_20603 build() {
            C2S_Unlock_20603 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Unlock_20603 buildPartial() {
            C2S_Unlock_20603 result = new C2S_Unlock_20603(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.grid_ = this.grid_;
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
            if (other instanceof C2S_Unlock_20603) {
               return this.mergeFrom((C2S_Unlock_20603)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Unlock_20603 other) {
            if (other == ArmyArrayMsg.C2S_Unlock_20603.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGrid();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Unlock_20603 parsedMessage = null;

            try {
               parsedMessage = (C2S_Unlock_20603)ArmyArrayMsg.C2S_Unlock_20603.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Unlock_20603)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGrid() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGrid() {
            return this.grid_;
         }

         public Builder setGrid(int value) {
            this.bitField0_ |= 1;
            this.grid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrid() {
            this.bitField0_ &= -2;
            this.grid_ = 0;
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

   public static final class S2C_Unlock_20604 extends GeneratedMessageV3 implements S2C_Unlock_20604OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      private byte memoizedIsInitialized;
      private static final S2C_Unlock_20604 DEFAULT_INSTANCE = new S2C_Unlock_20604();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Unlock_20604> PARSER = new AbstractParser<S2C_Unlock_20604>() {
         public S2C_Unlock_20604 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Unlock_20604(input, extensionRegistry);
         }
      };

      private S2C_Unlock_20604(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Unlock_20604() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Unlock_20604();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Unlock_20604(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.grid_ = input.readInt32();
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
         return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_S2C_Unlock_20604_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_S2C_Unlock_20604_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Unlock_20604.class, Builder.class);
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.grid_);
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
               size += CodedOutputStream.computeInt32Size(1, this.grid_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Unlock_20604)) {
            return super.equals(obj);
         } else {
            S2C_Unlock_20604 other = (S2C_Unlock_20604)obj;
            if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
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
            if (this.hasGrid()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGrid();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Unlock_20604 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Unlock_20604)PARSER.parseFrom(data);
      }

      public static S2C_Unlock_20604 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Unlock_20604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Unlock_20604 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Unlock_20604)PARSER.parseFrom(data);
      }

      public static S2C_Unlock_20604 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Unlock_20604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Unlock_20604 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Unlock_20604)PARSER.parseFrom(data);
      }

      public static S2C_Unlock_20604 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Unlock_20604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Unlock_20604 parseFrom(InputStream input) throws IOException {
         return (S2C_Unlock_20604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Unlock_20604 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Unlock_20604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Unlock_20604 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Unlock_20604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Unlock_20604 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Unlock_20604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Unlock_20604 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Unlock_20604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Unlock_20604 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Unlock_20604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Unlock_20604 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Unlock_20604 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Unlock_20604> parser() {
         return PARSER;
      }

      public Parser<S2C_Unlock_20604> getParserForType() {
         return PARSER;
      }

      public S2C_Unlock_20604 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Unlock_20604OrBuilder {
         private int bitField0_;
         private int grid_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_S2C_Unlock_20604_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_S2C_Unlock_20604_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Unlock_20604.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArmyArrayMsg.S2C_Unlock_20604.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_S2C_Unlock_20604_descriptor;
         }

         public S2C_Unlock_20604 getDefaultInstanceForType() {
            return ArmyArrayMsg.S2C_Unlock_20604.getDefaultInstance();
         }

         public S2C_Unlock_20604 build() {
            S2C_Unlock_20604 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Unlock_20604 buildPartial() {
            S2C_Unlock_20604 result = new S2C_Unlock_20604(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.grid_ = this.grid_;
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
            if (other instanceof S2C_Unlock_20604) {
               return this.mergeFrom((S2C_Unlock_20604)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Unlock_20604 other) {
            if (other == ArmyArrayMsg.S2C_Unlock_20604.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGrid();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Unlock_20604 parsedMessage = null;

            try {
               parsedMessage = (S2C_Unlock_20604)ArmyArrayMsg.S2C_Unlock_20604.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Unlock_20604)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGrid() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGrid() {
            return this.grid_;
         }

         public Builder setGrid(int value) {
            this.bitField0_ |= 1;
            this.grid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrid() {
            this.bitField0_ &= -2;
            this.grid_ = 0;
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

   public static final class C2S_SelectArray_20605 extends GeneratedMessageV3 implements C2S_SelectArray_20605OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      public static final int ARRAYID_FIELD_NUMBER = 2;
      private int arrayId_;
      private byte memoizedIsInitialized;
      private static final C2S_SelectArray_20605 DEFAULT_INSTANCE = new C2S_SelectArray_20605();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SelectArray_20605> PARSER = new AbstractParser<C2S_SelectArray_20605>() {
         public C2S_SelectArray_20605 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SelectArray_20605(input, extensionRegistry);
         }
      };

      private C2S_SelectArray_20605(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SelectArray_20605() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SelectArray_20605();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SelectArray_20605(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.grid_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.arrayId_ = input.readInt32();
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
         return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_SelectArray_20605_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_SelectArray_20605_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SelectArray_20605.class, Builder.class);
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public boolean hasArrayId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getArrayId() {
         return this.arrayId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasArrayId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.grid_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.arrayId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.grid_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.arrayId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SelectArray_20605)) {
            return super.equals(obj);
         } else {
            C2S_SelectArray_20605 other = (C2S_SelectArray_20605)obj;
            if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
               return false;
            } else if (this.hasArrayId() != other.hasArrayId()) {
               return false;
            } else if (this.hasArrayId() && this.getArrayId() != other.getArrayId()) {
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
            if (this.hasGrid()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGrid();
            }

            if (this.hasArrayId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getArrayId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SelectArray_20605 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SelectArray_20605)PARSER.parseFrom(data);
      }

      public static C2S_SelectArray_20605 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SelectArray_20605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SelectArray_20605 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SelectArray_20605)PARSER.parseFrom(data);
      }

      public static C2S_SelectArray_20605 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SelectArray_20605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SelectArray_20605 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SelectArray_20605)PARSER.parseFrom(data);
      }

      public static C2S_SelectArray_20605 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SelectArray_20605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SelectArray_20605 parseFrom(InputStream input) throws IOException {
         return (C2S_SelectArray_20605)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SelectArray_20605 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SelectArray_20605)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SelectArray_20605 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SelectArray_20605)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SelectArray_20605 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SelectArray_20605)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SelectArray_20605 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SelectArray_20605)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SelectArray_20605 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SelectArray_20605)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SelectArray_20605 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SelectArray_20605 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SelectArray_20605> parser() {
         return PARSER;
      }

      public Parser<C2S_SelectArray_20605> getParserForType() {
         return PARSER;
      }

      public C2S_SelectArray_20605 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SelectArray_20605OrBuilder {
         private int bitField0_;
         private int grid_;
         private int arrayId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_SelectArray_20605_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_SelectArray_20605_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SelectArray_20605.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArmyArrayMsg.C2S_SelectArray_20605.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            this.arrayId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_SelectArray_20605_descriptor;
         }

         public C2S_SelectArray_20605 getDefaultInstanceForType() {
            return ArmyArrayMsg.C2S_SelectArray_20605.getDefaultInstance();
         }

         public C2S_SelectArray_20605 build() {
            C2S_SelectArray_20605 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SelectArray_20605 buildPartial() {
            C2S_SelectArray_20605 result = new C2S_SelectArray_20605(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.grid_ = this.grid_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.arrayId_ = this.arrayId_;
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
            if (other instanceof C2S_SelectArray_20605) {
               return this.mergeFrom((C2S_SelectArray_20605)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SelectArray_20605 other) {
            if (other == ArmyArrayMsg.C2S_SelectArray_20605.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               if (other.hasArrayId()) {
                  this.setArrayId(other.getArrayId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGrid()) {
               return false;
            } else {
               return this.hasArrayId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_SelectArray_20605 parsedMessage = null;

            try {
               parsedMessage = (C2S_SelectArray_20605)ArmyArrayMsg.C2S_SelectArray_20605.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SelectArray_20605)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGrid() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGrid() {
            return this.grid_;
         }

         public Builder setGrid(int value) {
            this.bitField0_ |= 1;
            this.grid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrid() {
            this.bitField0_ &= -2;
            this.grid_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasArrayId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getArrayId() {
            return this.arrayId_;
         }

         public Builder setArrayId(int value) {
            this.bitField0_ |= 2;
            this.arrayId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearArrayId() {
            this.bitField0_ &= -3;
            this.arrayId_ = 0;
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

   public static final class C2S_PutEye_20607 extends GeneratedMessageV3 implements C2S_PutEye_20607OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      public static final int EYE_FIELD_NUMBER = 2;
      private int eye_;
      private byte memoizedIsInitialized;
      private static final C2S_PutEye_20607 DEFAULT_INSTANCE = new C2S_PutEye_20607();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PutEye_20607> PARSER = new AbstractParser<C2S_PutEye_20607>() {
         public C2S_PutEye_20607 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PutEye_20607(input, extensionRegistry);
         }
      };

      private C2S_PutEye_20607(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PutEye_20607() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PutEye_20607();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PutEye_20607(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.grid_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.eye_ = input.readInt32();
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
         return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_PutEye_20607_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_PutEye_20607_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PutEye_20607.class, Builder.class);
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public boolean hasEye() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEye() {
         return this.eye_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEye()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.grid_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.eye_);
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
               size += CodedOutputStream.computeInt32Size(1, this.grid_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.eye_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PutEye_20607)) {
            return super.equals(obj);
         } else {
            C2S_PutEye_20607 other = (C2S_PutEye_20607)obj;
            if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
               return false;
            } else if (this.hasEye() != other.hasEye()) {
               return false;
            } else if (this.hasEye() && this.getEye() != other.getEye()) {
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
            if (this.hasGrid()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGrid();
            }

            if (this.hasEye()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEye();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PutEye_20607 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PutEye_20607)PARSER.parseFrom(data);
      }

      public static C2S_PutEye_20607 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PutEye_20607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PutEye_20607 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PutEye_20607)PARSER.parseFrom(data);
      }

      public static C2S_PutEye_20607 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PutEye_20607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PutEye_20607 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PutEye_20607)PARSER.parseFrom(data);
      }

      public static C2S_PutEye_20607 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PutEye_20607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PutEye_20607 parseFrom(InputStream input) throws IOException {
         return (C2S_PutEye_20607)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PutEye_20607 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PutEye_20607)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PutEye_20607 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PutEye_20607)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PutEye_20607 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PutEye_20607)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PutEye_20607 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PutEye_20607)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PutEye_20607 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PutEye_20607)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PutEye_20607 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PutEye_20607 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PutEye_20607> parser() {
         return PARSER;
      }

      public Parser<C2S_PutEye_20607> getParserForType() {
         return PARSER;
      }

      public C2S_PutEye_20607 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PutEye_20607OrBuilder {
         private int bitField0_;
         private int grid_;
         private int eye_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_PutEye_20607_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_PutEye_20607_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PutEye_20607.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArmyArrayMsg.C2S_PutEye_20607.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            this.eye_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_PutEye_20607_descriptor;
         }

         public C2S_PutEye_20607 getDefaultInstanceForType() {
            return ArmyArrayMsg.C2S_PutEye_20607.getDefaultInstance();
         }

         public C2S_PutEye_20607 build() {
            C2S_PutEye_20607 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PutEye_20607 buildPartial() {
            C2S_PutEye_20607 result = new C2S_PutEye_20607(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.grid_ = this.grid_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.eye_ = this.eye_;
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
            if (other instanceof C2S_PutEye_20607) {
               return this.mergeFrom((C2S_PutEye_20607)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PutEye_20607 other) {
            if (other == ArmyArrayMsg.C2S_PutEye_20607.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               if (other.hasEye()) {
                  this.setEye(other.getEye());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGrid()) {
               return false;
            } else {
               return this.hasEye();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_PutEye_20607 parsedMessage = null;

            try {
               parsedMessage = (C2S_PutEye_20607)ArmyArrayMsg.C2S_PutEye_20607.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PutEye_20607)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGrid() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGrid() {
            return this.grid_;
         }

         public Builder setGrid(int value) {
            this.bitField0_ |= 1;
            this.grid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrid() {
            this.bitField0_ &= -2;
            this.grid_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEye() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEye() {
            return this.eye_;
         }

         public Builder setEye(int value) {
            this.bitField0_ |= 2;
            this.eye_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEye() {
            this.bitField0_ &= -3;
            this.eye_ = 0;
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

   public static final class C2S_PutMaterial_20609 extends GeneratedMessageV3 implements C2S_PutMaterial_20609OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      public static final int POS_FIELD_NUMBER = 2;
      private int pos_;
      public static final int ITEMID_FIELD_NUMBER = 3;
      private int itemId_;
      private byte memoizedIsInitialized;
      private static final C2S_PutMaterial_20609 DEFAULT_INSTANCE = new C2S_PutMaterial_20609();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PutMaterial_20609> PARSER = new AbstractParser<C2S_PutMaterial_20609>() {
         public C2S_PutMaterial_20609 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PutMaterial_20609(input, extensionRegistry);
         }
      };

      private C2S_PutMaterial_20609(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PutMaterial_20609() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PutMaterial_20609();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PutMaterial_20609(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.grid_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.pos_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.itemId_ = input.readInt32();
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
         return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_PutMaterial_20609_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_PutMaterial_20609_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PutMaterial_20609.class, Builder.class);
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public boolean hasPos() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPos() {
         return this.pos_;
      }

      public boolean hasItemId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getItemId() {
         return this.itemId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.grid_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.pos_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.itemId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.grid_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.pos_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.itemId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PutMaterial_20609)) {
            return super.equals(obj);
         } else {
            C2S_PutMaterial_20609 other = (C2S_PutMaterial_20609)obj;
            if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
               return false;
            } else if (this.hasPos() != other.hasPos()) {
               return false;
            } else if (this.hasPos() && this.getPos() != other.getPos()) {
               return false;
            } else if (this.hasItemId() != other.hasItemId()) {
               return false;
            } else if (this.hasItemId() && this.getItemId() != other.getItemId()) {
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
            if (this.hasGrid()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGrid();
            }

            if (this.hasPos()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPos();
            }

            if (this.hasItemId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getItemId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PutMaterial_20609 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PutMaterial_20609)PARSER.parseFrom(data);
      }

      public static C2S_PutMaterial_20609 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PutMaterial_20609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PutMaterial_20609 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PutMaterial_20609)PARSER.parseFrom(data);
      }

      public static C2S_PutMaterial_20609 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PutMaterial_20609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PutMaterial_20609 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PutMaterial_20609)PARSER.parseFrom(data);
      }

      public static C2S_PutMaterial_20609 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PutMaterial_20609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PutMaterial_20609 parseFrom(InputStream input) throws IOException {
         return (C2S_PutMaterial_20609)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PutMaterial_20609 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PutMaterial_20609)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PutMaterial_20609 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PutMaterial_20609)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PutMaterial_20609 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PutMaterial_20609)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PutMaterial_20609 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PutMaterial_20609)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PutMaterial_20609 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PutMaterial_20609)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PutMaterial_20609 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PutMaterial_20609 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PutMaterial_20609> parser() {
         return PARSER;
      }

      public Parser<C2S_PutMaterial_20609> getParserForType() {
         return PARSER;
      }

      public C2S_PutMaterial_20609 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PutMaterial_20609OrBuilder {
         private int bitField0_;
         private int grid_;
         private int pos_;
         private int itemId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_PutMaterial_20609_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_PutMaterial_20609_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PutMaterial_20609.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArmyArrayMsg.C2S_PutMaterial_20609.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            this.pos_ = 0;
            this.bitField0_ &= -3;
            this.itemId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_C2S_PutMaterial_20609_descriptor;
         }

         public C2S_PutMaterial_20609 getDefaultInstanceForType() {
            return ArmyArrayMsg.C2S_PutMaterial_20609.getDefaultInstance();
         }

         public C2S_PutMaterial_20609 build() {
            C2S_PutMaterial_20609 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PutMaterial_20609 buildPartial() {
            C2S_PutMaterial_20609 result = new C2S_PutMaterial_20609(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.grid_ = this.grid_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.pos_ = this.pos_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.itemId_ = this.itemId_;
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
            if (other instanceof C2S_PutMaterial_20609) {
               return this.mergeFrom((C2S_PutMaterial_20609)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PutMaterial_20609 other) {
            if (other == ArmyArrayMsg.C2S_PutMaterial_20609.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               if (other.hasPos()) {
                  this.setPos(other.getPos());
               }

               if (other.hasItemId()) {
                  this.setItemId(other.getItemId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGrid()) {
               return false;
            } else if (!this.hasPos()) {
               return false;
            } else {
               return this.hasItemId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_PutMaterial_20609 parsedMessage = null;

            try {
               parsedMessage = (C2S_PutMaterial_20609)ArmyArrayMsg.C2S_PutMaterial_20609.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PutMaterial_20609)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGrid() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGrid() {
            return this.grid_;
         }

         public Builder setGrid(int value) {
            this.bitField0_ |= 1;
            this.grid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrid() {
            this.bitField0_ &= -2;
            this.grid_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPos() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPos() {
            return this.pos_;
         }

         public Builder setPos(int value) {
            this.bitField0_ |= 2;
            this.pos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPos() {
            this.bitField0_ &= -3;
            this.pos_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasItemId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getItemId() {
            return this.itemId_;
         }

         public Builder setItemId(int value) {
            this.bitField0_ |= 4;
            this.itemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemId() {
            this.bitField0_ &= -5;
            this.itemId_ = 0;
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

   public static final class S2C_PutMaterial_20610 extends GeneratedMessageV3 implements S2C_PutMaterial_20610OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GRID_FIELD_NUMBER = 1;
      private int grid_;
      public static final int POS_FIELD_NUMBER = 2;
      private int pos_;
      public static final int ITEMID_FIELD_NUMBER = 3;
      private int itemId_;
      private byte memoizedIsInitialized;
      private static final S2C_PutMaterial_20610 DEFAULT_INSTANCE = new S2C_PutMaterial_20610();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PutMaterial_20610> PARSER = new AbstractParser<S2C_PutMaterial_20610>() {
         public S2C_PutMaterial_20610 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PutMaterial_20610(input, extensionRegistry);
         }
      };

      private S2C_PutMaterial_20610(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PutMaterial_20610() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PutMaterial_20610();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PutMaterial_20610(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.grid_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.pos_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.itemId_ = input.readInt32();
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
         return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_S2C_PutMaterial_20610_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_S2C_PutMaterial_20610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PutMaterial_20610.class, Builder.class);
      }

      public boolean hasGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGrid() {
         return this.grid_;
      }

      public boolean hasPos() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPos() {
         return this.pos_;
      }

      public boolean hasItemId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getItemId() {
         return this.itemId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.grid_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.pos_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.itemId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.grid_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.pos_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.itemId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PutMaterial_20610)) {
            return super.equals(obj);
         } else {
            S2C_PutMaterial_20610 other = (S2C_PutMaterial_20610)obj;
            if (this.hasGrid() != other.hasGrid()) {
               return false;
            } else if (this.hasGrid() && this.getGrid() != other.getGrid()) {
               return false;
            } else if (this.hasPos() != other.hasPos()) {
               return false;
            } else if (this.hasPos() && this.getPos() != other.getPos()) {
               return false;
            } else if (this.hasItemId() != other.hasItemId()) {
               return false;
            } else if (this.hasItemId() && this.getItemId() != other.getItemId()) {
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
            if (this.hasGrid()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGrid();
            }

            if (this.hasPos()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPos();
            }

            if (this.hasItemId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getItemId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PutMaterial_20610 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PutMaterial_20610)PARSER.parseFrom(data);
      }

      public static S2C_PutMaterial_20610 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PutMaterial_20610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PutMaterial_20610 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PutMaterial_20610)PARSER.parseFrom(data);
      }

      public static S2C_PutMaterial_20610 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PutMaterial_20610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PutMaterial_20610 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PutMaterial_20610)PARSER.parseFrom(data);
      }

      public static S2C_PutMaterial_20610 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PutMaterial_20610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PutMaterial_20610 parseFrom(InputStream input) throws IOException {
         return (S2C_PutMaterial_20610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PutMaterial_20610 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PutMaterial_20610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PutMaterial_20610 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PutMaterial_20610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PutMaterial_20610 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PutMaterial_20610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PutMaterial_20610 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PutMaterial_20610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PutMaterial_20610 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PutMaterial_20610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PutMaterial_20610 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PutMaterial_20610 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PutMaterial_20610> parser() {
         return PARSER;
      }

      public Parser<S2C_PutMaterial_20610> getParserForType() {
         return PARSER;
      }

      public S2C_PutMaterial_20610 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PutMaterial_20610OrBuilder {
         private int bitField0_;
         private int grid_;
         private int pos_;
         private int itemId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_S2C_PutMaterial_20610_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_S2C_PutMaterial_20610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PutMaterial_20610.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArmyArrayMsg.S2C_PutMaterial_20610.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.grid_ = 0;
            this.bitField0_ &= -2;
            this.pos_ = 0;
            this.bitField0_ &= -3;
            this.itemId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_S2C_PutMaterial_20610_descriptor;
         }

         public S2C_PutMaterial_20610 getDefaultInstanceForType() {
            return ArmyArrayMsg.S2C_PutMaterial_20610.getDefaultInstance();
         }

         public S2C_PutMaterial_20610 build() {
            S2C_PutMaterial_20610 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PutMaterial_20610 buildPartial() {
            S2C_PutMaterial_20610 result = new S2C_PutMaterial_20610(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.grid_ = this.grid_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.pos_ = this.pos_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.itemId_ = this.itemId_;
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
            if (other instanceof S2C_PutMaterial_20610) {
               return this.mergeFrom((S2C_PutMaterial_20610)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PutMaterial_20610 other) {
            if (other == ArmyArrayMsg.S2C_PutMaterial_20610.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGrid()) {
                  this.setGrid(other.getGrid());
               }

               if (other.hasPos()) {
                  this.setPos(other.getPos());
               }

               if (other.hasItemId()) {
                  this.setItemId(other.getItemId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGrid()) {
               return false;
            } else if (!this.hasPos()) {
               return false;
            } else {
               return this.hasItemId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PutMaterial_20610 parsedMessage = null;

            try {
               parsedMessage = (S2C_PutMaterial_20610)ArmyArrayMsg.S2C_PutMaterial_20610.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PutMaterial_20610)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGrid() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGrid() {
            return this.grid_;
         }

         public Builder setGrid(int value) {
            this.bitField0_ |= 1;
            this.grid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGrid() {
            this.bitField0_ &= -2;
            this.grid_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPos() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPos() {
            return this.pos_;
         }

         public Builder setPos(int value) {
            this.bitField0_ |= 2;
            this.pos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPos() {
            this.bitField0_ &= -3;
            this.pos_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasItemId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getItemId() {
            return this.itemId_;
         }

         public Builder setItemId(int value) {
            this.bitField0_ |= 4;
            this.itemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemId() {
            this.bitField0_ &= -5;
            this.itemId_ = 0;
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

   public static final class S2C_UpdateShowGridNum_20612 extends GeneratedMessageV3 implements S2C_UpdateShowGridNum_20612OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SHOWGRIDNUM_FIELD_NUMBER = 1;
      private int showGridNum_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateShowGridNum_20612 DEFAULT_INSTANCE = new S2C_UpdateShowGridNum_20612();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateShowGridNum_20612> PARSER = new AbstractParser<S2C_UpdateShowGridNum_20612>() {
         public S2C_UpdateShowGridNum_20612 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateShowGridNum_20612(input, extensionRegistry);
         }
      };

      private S2C_UpdateShowGridNum_20612(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateShowGridNum_20612() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateShowGridNum_20612();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateShowGridNum_20612(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.showGridNum_ = input.readInt32();
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
         return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_S2C_UpdateShowGridNum_20612_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_S2C_UpdateShowGridNum_20612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateShowGridNum_20612.class, Builder.class);
      }

      public boolean hasShowGridNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getShowGridNum() {
         return this.showGridNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasShowGridNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.showGridNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.showGridNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpdateShowGridNum_20612)) {
            return super.equals(obj);
         } else {
            S2C_UpdateShowGridNum_20612 other = (S2C_UpdateShowGridNum_20612)obj;
            if (this.hasShowGridNum() != other.hasShowGridNum()) {
               return false;
            } else if (this.hasShowGridNum() && this.getShowGridNum() != other.getShowGridNum()) {
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
            if (this.hasShowGridNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getShowGridNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpdateShowGridNum_20612 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateShowGridNum_20612)PARSER.parseFrom(data);
      }

      public static S2C_UpdateShowGridNum_20612 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateShowGridNum_20612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateShowGridNum_20612 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateShowGridNum_20612)PARSER.parseFrom(data);
      }

      public static S2C_UpdateShowGridNum_20612 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateShowGridNum_20612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateShowGridNum_20612 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateShowGridNum_20612)PARSER.parseFrom(data);
      }

      public static S2C_UpdateShowGridNum_20612 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateShowGridNum_20612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateShowGridNum_20612 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateShowGridNum_20612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateShowGridNum_20612 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateShowGridNum_20612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateShowGridNum_20612 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateShowGridNum_20612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateShowGridNum_20612 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateShowGridNum_20612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateShowGridNum_20612 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateShowGridNum_20612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateShowGridNum_20612 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateShowGridNum_20612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateShowGridNum_20612 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateShowGridNum_20612 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateShowGridNum_20612> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateShowGridNum_20612> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateShowGridNum_20612 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateShowGridNum_20612OrBuilder {
         private int bitField0_;
         private int showGridNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_S2C_UpdateShowGridNum_20612_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_S2C_UpdateShowGridNum_20612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateShowGridNum_20612.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArmyArrayMsg.S2C_UpdateShowGridNum_20612.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.showGridNum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArmyArrayMsg.internal_static_armyArray_com_gzbz_protobuf_S2C_UpdateShowGridNum_20612_descriptor;
         }

         public S2C_UpdateShowGridNum_20612 getDefaultInstanceForType() {
            return ArmyArrayMsg.S2C_UpdateShowGridNum_20612.getDefaultInstance();
         }

         public S2C_UpdateShowGridNum_20612 build() {
            S2C_UpdateShowGridNum_20612 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateShowGridNum_20612 buildPartial() {
            S2C_UpdateShowGridNum_20612 result = new S2C_UpdateShowGridNum_20612(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.showGridNum_ = this.showGridNum_;
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
            if (other instanceof S2C_UpdateShowGridNum_20612) {
               return this.mergeFrom((S2C_UpdateShowGridNum_20612)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateShowGridNum_20612 other) {
            if (other == ArmyArrayMsg.S2C_UpdateShowGridNum_20612.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasShowGridNum()) {
                  this.setShowGridNum(other.getShowGridNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasShowGridNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpdateShowGridNum_20612 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateShowGridNum_20612)ArmyArrayMsg.S2C_UpdateShowGridNum_20612.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateShowGridNum_20612)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasShowGridNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getShowGridNum() {
            return this.showGridNum_;
         }

         public Builder setShowGridNum(int value) {
            this.bitField0_ |= 1;
            this.showGridNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShowGridNum() {
            this.bitField0_ &= -2;
            this.showGridNum_ = 0;
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

   public interface ArrayDataOrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();

      boolean hasArrayId();

      int getArrayId();

      boolean hasEye();

      int getEye();

      List<CommonMsg.ItemInfo> getProtectDataList();

      CommonMsg.ItemInfo getProtectData(int index);

      int getProtectDataCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getProtectDataOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getProtectDataOrBuilder(int index);
   }

   public interface C2S_Info_20601OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_PutEye_20607OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();

      boolean hasEye();

      int getEye();
   }

   public interface C2S_PutMaterial_20609OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();

      boolean hasPos();

      int getPos();

      boolean hasItemId();

      int getItemId();
   }

   public interface C2S_SelectArray_20605OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();

      boolean hasArrayId();

      int getArrayId();
   }

   public interface C2S_Unlock_20603OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();
   }

   public interface S2C_Info_20602OrBuilder extends MessageOrBuilder {
      boolean hasIsOpen();

      boolean getIsOpen();

      List<Integer> getGridsList();

      int getGridsCount();

      int getGrids(int index);

      List<ArrayData> getArrayDataList();

      ArrayData getArrayData(int index);

      int getArrayDataCount();

      List<? extends ArrayDataOrBuilder> getArrayDataOrBuilderList();

      ArrayDataOrBuilder getArrayDataOrBuilder(int index);

      boolean hasShowGridNum();

      int getShowGridNum();
   }

   public interface S2C_PutMaterial_20610OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();

      boolean hasPos();

      int getPos();

      boolean hasItemId();

      int getItemId();
   }

   public interface S2C_Unlock_20604OrBuilder extends MessageOrBuilder {
      boolean hasGrid();

      int getGrid();
   }

   public interface S2C_UpdateShowGridNum_20612OrBuilder extends MessageOrBuilder {
      boolean hasShowGridNum();

      int getShowGridNum();
   }
}
