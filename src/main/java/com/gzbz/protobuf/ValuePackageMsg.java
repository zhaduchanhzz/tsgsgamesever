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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ValuePackageMsg {
   private static final Descriptors.Descriptor internal_static_valuepackage_com_gzbz_protobuf_ValueInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_valuepackage_com_gzbz_protobuf_ValueInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_valuepackage_com_gzbz_protobuf_C2S_ValuePackageInfo_10501_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_valuepackage_com_gzbz_protobuf_C2S_ValuePackageInfo_10501_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_valuepackage_com_gzbz_protobuf_S2C_ValuePackageInfo_10502_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_valuepackage_com_gzbz_protobuf_S2C_ValuePackageInfo_10502_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_valuepackage_com_gzbz_protobuf_C2S_BuyItem_10503_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_valuepackage_com_gzbz_protobuf_C2S_BuyItem_10503_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_valuepackage_com_gzbz_protobuf_S2C_BuyItem_10504_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_valuepackage_com_gzbz_protobuf_S2C_BuyItem_10504_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ValuePackageMsg() {
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
      String[] descriptorData = new String[]{"\n\u0012ValuePackage.proto\u0012\u001evaluepackage.com.gzbz.protobuf\u001a\fcommon.proto\"¡\u0001\n\tValueInfo\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bbuyTimes\u0018\u0003 \u0002(\u0005\u0012\u0012\n\ntotalTimes\u0018\u0004 \u0002(\u0005\u0012\u0010\n\boriPrice\u0018\u0005 \u0002(\u0005\u0012\u0010\n\bdisPrice\u0018\u0006 \u0002(\u0005\u0012\u000f\n\u0007lvLimit\u0018\u0007 \u0002(\u0005\u0012\u001f\n\u0005items\u0018\b \u0003(\u000b2\u0010.common.ItemInfo\"\u001c\n\u001aC2S_ValuePackageInfo_10501\"j\n\u001aS2C_ValuePackageInfo_10502\u0012\u0013\n\u000brefreshTime\u0018\u0001 \u0002(\u0005\u00127\n\u0004info\u0018\u0002 \u0003(\u000b2).valuepackage.com.gzbz.protobuf.ValueInfo\"\u001f\n\u0011C2S_BuyItem_10503\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"L\n\u0011S2C_BuyItem_10504\u00127\n\u0004info\u0018\u0002 \u0002(\u000b2).valuepackage.com.gzbz.protobuf.ValueInfoB&\n\u0011com.gzbz.protobufB\u000fValuePackageMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_valuepackage_com_gzbz_protobuf_ValueInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_valuepackage_com_gzbz_protobuf_ValueInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_valuepackage_com_gzbz_protobuf_ValueInfo_descriptor, new String[]{"Type", "Id", "BuyTimes", "TotalTimes", "OriPrice", "DisPrice", "LvLimit", "Items"});
      internal_static_valuepackage_com_gzbz_protobuf_C2S_ValuePackageInfo_10501_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_valuepackage_com_gzbz_protobuf_C2S_ValuePackageInfo_10501_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_valuepackage_com_gzbz_protobuf_C2S_ValuePackageInfo_10501_descriptor, new String[0]);
      internal_static_valuepackage_com_gzbz_protobuf_S2C_ValuePackageInfo_10502_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_valuepackage_com_gzbz_protobuf_S2C_ValuePackageInfo_10502_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_valuepackage_com_gzbz_protobuf_S2C_ValuePackageInfo_10502_descriptor, new String[]{"RefreshTime", "Info"});
      internal_static_valuepackage_com_gzbz_protobuf_C2S_BuyItem_10503_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_valuepackage_com_gzbz_protobuf_C2S_BuyItem_10503_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_valuepackage_com_gzbz_protobuf_C2S_BuyItem_10503_descriptor, new String[]{"Id"});
      internal_static_valuepackage_com_gzbz_protobuf_S2C_BuyItem_10504_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_valuepackage_com_gzbz_protobuf_S2C_BuyItem_10504_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_valuepackage_com_gzbz_protobuf_S2C_BuyItem_10504_descriptor, new String[]{"Info"});
      CommonMsg.getDescriptor();
   }

   public static final class ValueInfo extends GeneratedMessageV3 implements ValueInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int ID_FIELD_NUMBER = 2;
      private int id_;
      public static final int BUYTIMES_FIELD_NUMBER = 3;
      private int buyTimes_;
      public static final int TOTALTIMES_FIELD_NUMBER = 4;
      private int totalTimes_;
      public static final int ORIPRICE_FIELD_NUMBER = 5;
      private int oriPrice_;
      public static final int DISPRICE_FIELD_NUMBER = 6;
      private int disPrice_;
      public static final int LVLIMIT_FIELD_NUMBER = 7;
      private int lvLimit_;
      public static final int ITEMS_FIELD_NUMBER = 8;
      private List<CommonMsg.ItemInfo> items_;
      private byte memoizedIsInitialized;
      private static final ValueInfo DEFAULT_INSTANCE = new ValueInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<ValueInfo> PARSER = new AbstractParser<ValueInfo>() {
         public ValueInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new ValueInfo(input, extensionRegistry);
         }
      };

      private ValueInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ValueInfo() {
         this.memoizedIsInitialized = -1;
         this.items_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new ValueInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ValueInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.type_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.id_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.buyTimes_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.totalTimes_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.oriPrice_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.disPrice_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.lvLimit_ = input.readInt32();
                        break;
                     case 66:
                        if ((mutable_bitField0_ & 128) == 0) {
                           this.items_ = new ArrayList();
                           mutable_bitField0_ |= 128;
                        }

                        this.items_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
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
               if ((mutable_bitField0_ & 128) != 0) {
                  this.items_ = Collections.unmodifiableList(this.items_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_ValueInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_ValueInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ValueInfo.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasBuyTimes() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBuyTimes() {
         return this.buyTimes_;
      }

      public boolean hasTotalTimes() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getTotalTimes() {
         return this.totalTimes_;
      }

      public boolean hasOriPrice() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getOriPrice() {
         return this.oriPrice_;
      }

      public boolean hasDisPrice() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getDisPrice() {
         return this.disPrice_;
      }

      public boolean hasLvLimit() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getLvLimit() {
         return this.lvLimit_;
      }

      public List<CommonMsg.ItemInfo> getItemsList() {
         return this.items_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList() {
         return this.items_;
      }

      public int getItemsCount() {
         return this.items_.size();
      }

      public CommonMsg.ItemInfo getItems(int index) {
         return (CommonMsg.ItemInfo)this.items_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.items_.get(index);
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
         } else if (!this.hasId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuyTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOriPrice()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDisPrice()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLvLimit()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getItemsCount(); ++i) {
               if (!this.getItems(i).isInitialized()) {
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
            output.writeInt32(1, this.type_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.id_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.buyTimes_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.totalTimes_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.oriPrice_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.disPrice_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.lvLimit_);
         }

         for(int i = 0; i < this.items_.size(); ++i) {
            output.writeMessage(8, (MessageLite)this.items_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.type_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.id_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.buyTimes_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.totalTimes_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.oriPrice_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.disPrice_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.lvLimit_);
            }

            for(int i = 0; i < this.items_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(8, (MessageLite)this.items_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof ValueInfo)) {
            return super.equals(obj);
         } else {
            ValueInfo other = (ValueInfo)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasBuyTimes() != other.hasBuyTimes()) {
               return false;
            } else if (this.hasBuyTimes() && this.getBuyTimes() != other.getBuyTimes()) {
               return false;
            } else if (this.hasTotalTimes() != other.hasTotalTimes()) {
               return false;
            } else if (this.hasTotalTimes() && this.getTotalTimes() != other.getTotalTimes()) {
               return false;
            } else if (this.hasOriPrice() != other.hasOriPrice()) {
               return false;
            } else if (this.hasOriPrice() && this.getOriPrice() != other.getOriPrice()) {
               return false;
            } else if (this.hasDisPrice() != other.hasDisPrice()) {
               return false;
            } else if (this.hasDisPrice() && this.getDisPrice() != other.getDisPrice()) {
               return false;
            } else if (this.hasLvLimit() != other.hasLvLimit()) {
               return false;
            } else if (this.hasLvLimit() && this.getLvLimit() != other.getLvLimit()) {
               return false;
            } else if (!this.getItemsList().equals(other.getItemsList())) {
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
               hash = 53 * hash + this.getType();
            }

            if (this.hasId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getId();
            }

            if (this.hasBuyTimes()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBuyTimes();
            }

            if (this.hasTotalTimes()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTotalTimes();
            }

            if (this.hasOriPrice()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getOriPrice();
            }

            if (this.hasDisPrice()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getDisPrice();
            }

            if (this.hasLvLimit()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getLvLimit();
            }

            if (this.getItemsCount() > 0) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getItemsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static ValueInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (ValueInfo)PARSER.parseFrom(data);
      }

      public static ValueInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ValueInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ValueInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (ValueInfo)PARSER.parseFrom(data);
      }

      public static ValueInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ValueInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ValueInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (ValueInfo)PARSER.parseFrom(data);
      }

      public static ValueInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ValueInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ValueInfo parseFrom(InputStream input) throws IOException {
         return (ValueInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ValueInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ValueInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static ValueInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (ValueInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static ValueInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ValueInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static ValueInfo parseFrom(CodedInputStream input) throws IOException {
         return (ValueInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ValueInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ValueInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(ValueInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static ValueInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ValueInfo> parser() {
         return PARSER;
      }

      public Parser<ValueInfo> getParserForType() {
         return PARSER;
      }

      public ValueInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ValueInfoOrBuilder {
         private int bitField0_;
         private int type_;
         private int id_;
         private int buyTimes_;
         private int totalTimes_;
         private int oriPrice_;
         private int disPrice_;
         private int lvLimit_;
         private List<CommonMsg.ItemInfo> items_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_ValueInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_ValueInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ValueInfo.class, Builder.class);
         }

         private Builder() {
            this.items_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.items_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ValuePackageMsg.ValueInfo.alwaysUseFieldBuilders) {
               this.getItemsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.id_ = 0;
            this.bitField0_ &= -3;
            this.buyTimes_ = 0;
            this.bitField0_ &= -5;
            this.totalTimes_ = 0;
            this.bitField0_ &= -9;
            this.oriPrice_ = 0;
            this.bitField0_ &= -17;
            this.disPrice_ = 0;
            this.bitField0_ &= -33;
            this.lvLimit_ = 0;
            this.bitField0_ &= -65;
            if (this.itemsBuilder_ == null) {
               this.items_ = Collections.emptyList();
               this.bitField0_ &= -129;
            } else {
               this.itemsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_ValueInfo_descriptor;
         }

         public ValueInfo getDefaultInstanceForType() {
            return ValuePackageMsg.ValueInfo.getDefaultInstance();
         }

         public ValueInfo build() {
            ValueInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public ValueInfo buildPartial() {
            ValueInfo result = new ValueInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.buyTimes_ = this.buyTimes_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.totalTimes_ = this.totalTimes_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.oriPrice_ = this.oriPrice_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.disPrice_ = this.disPrice_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.lvLimit_ = this.lvLimit_;
               to_bitField0_ |= 64;
            }

            if (this.itemsBuilder_ == null) {
               if ((this.bitField0_ & 128) != 0) {
                  this.items_ = Collections.unmodifiableList(this.items_);
                  this.bitField0_ &= -129;
               }

               result.items_ = this.items_;
            } else {
               result.items_ = this.itemsBuilder_.build();
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
            if (other instanceof ValueInfo) {
               return this.mergeFrom((ValueInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ValueInfo other) {
            if (other == ValuePackageMsg.ValueInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasBuyTimes()) {
                  this.setBuyTimes(other.getBuyTimes());
               }

               if (other.hasTotalTimes()) {
                  this.setTotalTimes(other.getTotalTimes());
               }

               if (other.hasOriPrice()) {
                  this.setOriPrice(other.getOriPrice());
               }

               if (other.hasDisPrice()) {
                  this.setDisPrice(other.getDisPrice());
               }

               if (other.hasLvLimit()) {
                  this.setLvLimit(other.getLvLimit());
               }

               if (this.itemsBuilder_ == null) {
                  if (!other.items_.isEmpty()) {
                     if (this.items_.isEmpty()) {
                        this.items_ = other.items_;
                        this.bitField0_ &= -129;
                     } else {
                        this.ensureItemsIsMutable();
                        this.items_.addAll(other.items_);
                     }

                     this.onChanged();
                  }
               } else if (!other.items_.isEmpty()) {
                  if (this.itemsBuilder_.isEmpty()) {
                     this.itemsBuilder_.dispose();
                     this.itemsBuilder_ = null;
                     this.items_ = other.items_;
                     this.bitField0_ &= -129;
                     this.itemsBuilder_ = ValuePackageMsg.ValueInfo.alwaysUseFieldBuilders ? this.getItemsFieldBuilder() : null;
                  } else {
                     this.itemsBuilder_.addAllMessages(other.items_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else if (!this.hasId()) {
               return false;
            } else if (!this.hasBuyTimes()) {
               return false;
            } else if (!this.hasTotalTimes()) {
               return false;
            } else if (!this.hasOriPrice()) {
               return false;
            } else if (!this.hasDisPrice()) {
               return false;
            } else if (!this.hasLvLimit()) {
               return false;
            } else {
               for(int i = 0; i < this.getItemsCount(); ++i) {
                  if (!this.getItems(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            ValueInfo parsedMessage = null;

            try {
               parsedMessage = (ValueInfo)ValuePackageMsg.ValueInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (ValueInfo)e.getUnfinishedMessage();
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

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 1;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getId() {
            return this.id_;
         }

         public Builder setId(int value) {
            this.bitField0_ |= 2;
            this.id_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearId() {
            this.bitField0_ &= -3;
            this.id_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuyTimes() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBuyTimes() {
            return this.buyTimes_;
         }

         public Builder setBuyTimes(int value) {
            this.bitField0_ |= 4;
            this.buyTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyTimes() {
            this.bitField0_ &= -5;
            this.buyTimes_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTotalTimes() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getTotalTimes() {
            return this.totalTimes_;
         }

         public Builder setTotalTimes(int value) {
            this.bitField0_ |= 8;
            this.totalTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalTimes() {
            this.bitField0_ &= -9;
            this.totalTimes_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOriPrice() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getOriPrice() {
            return this.oriPrice_;
         }

         public Builder setOriPrice(int value) {
            this.bitField0_ |= 16;
            this.oriPrice_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOriPrice() {
            this.bitField0_ &= -17;
            this.oriPrice_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDisPrice() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getDisPrice() {
            return this.disPrice_;
         }

         public Builder setDisPrice(int value) {
            this.bitField0_ |= 32;
            this.disPrice_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDisPrice() {
            this.bitField0_ &= -33;
            this.disPrice_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLvLimit() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getLvLimit() {
            return this.lvLimit_;
         }

         public Builder setLvLimit(int value) {
            this.bitField0_ |= 64;
            this.lvLimit_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLvLimit() {
            this.bitField0_ &= -65;
            this.lvLimit_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureItemsIsMutable() {
            if ((this.bitField0_ & 128) == 0) {
               this.items_ = new ArrayList(this.items_);
               this.bitField0_ |= 128;
            }

         }

         public List<CommonMsg.ItemInfo> getItemsList() {
            return this.itemsBuilder_ == null ? Collections.unmodifiableList(this.items_) : this.itemsBuilder_.getMessageList();
         }

         public int getItemsCount() {
            return this.itemsBuilder_ == null ? this.items_.size() : this.itemsBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getItems(int index) {
            return this.itemsBuilder_ == null ? (CommonMsg.ItemInfo)this.items_.get(index) : (CommonMsg.ItemInfo)this.itemsBuilder_.getMessage(index);
         }

         public Builder setItems(int index, CommonMsg.ItemInfo value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.set(index, value);
               this.onChanged();
            } else {
               this.itemsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setItems(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItems(CommonMsg.ItemInfo value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.add(value);
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addItems(int index, CommonMsg.ItemInfo value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.add(index, value);
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addItems(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItems(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItems(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.items_);
               this.onChanged();
            } else {
               this.itemsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearItems() {
            if (this.itemsBuilder_ == null) {
               this.items_ = Collections.emptyList();
               this.bitField0_ &= -129;
               this.onChanged();
            } else {
               this.itemsBuilder_.clear();
            }

            return this;
         }

         public Builder removeItems(int index) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.remove(index);
               this.onChanged();
            } else {
               this.itemsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getItemsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index) {
            return this.itemsBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.items_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.itemsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList() {
            return this.itemsBuilder_ != null ? this.itemsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.items_);
         }

         public CommonMsg.ItemInfo.Builder addItemsBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addItemsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getItemsBuilderList() {
            return this.getItemsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getItemsFieldBuilder() {
            if (this.itemsBuilder_ == null) {
               this.itemsBuilder_ = new RepeatedFieldBuilderV3(this.items_, (this.bitField0_ & 128) != 0, this.getParentForChildren(), this.isClean());
               this.items_ = null;
            }

            return this.itemsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ValuePackageInfo_10501 extends GeneratedMessageV3 implements C2S_ValuePackageInfo_10501OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ValuePackageInfo_10501 DEFAULT_INSTANCE = new C2S_ValuePackageInfo_10501();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ValuePackageInfo_10501> PARSER = new AbstractParser<C2S_ValuePackageInfo_10501>() {
         public C2S_ValuePackageInfo_10501 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ValuePackageInfo_10501(input, extensionRegistry);
         }
      };

      private C2S_ValuePackageInfo_10501(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ValuePackageInfo_10501() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ValuePackageInfo_10501();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ValuePackageInfo_10501(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_C2S_ValuePackageInfo_10501_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_C2S_ValuePackageInfo_10501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ValuePackageInfo_10501.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ValuePackageInfo_10501)) {
            return super.equals(obj);
         } else {
            C2S_ValuePackageInfo_10501 other = (C2S_ValuePackageInfo_10501)obj;
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

      public static C2S_ValuePackageInfo_10501 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ValuePackageInfo_10501)PARSER.parseFrom(data);
      }

      public static C2S_ValuePackageInfo_10501 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ValuePackageInfo_10501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ValuePackageInfo_10501 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ValuePackageInfo_10501)PARSER.parseFrom(data);
      }

      public static C2S_ValuePackageInfo_10501 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ValuePackageInfo_10501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ValuePackageInfo_10501 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ValuePackageInfo_10501)PARSER.parseFrom(data);
      }

      public static C2S_ValuePackageInfo_10501 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ValuePackageInfo_10501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ValuePackageInfo_10501 parseFrom(InputStream input) throws IOException {
         return (C2S_ValuePackageInfo_10501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ValuePackageInfo_10501 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ValuePackageInfo_10501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ValuePackageInfo_10501 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ValuePackageInfo_10501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ValuePackageInfo_10501 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ValuePackageInfo_10501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ValuePackageInfo_10501 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ValuePackageInfo_10501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ValuePackageInfo_10501 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ValuePackageInfo_10501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ValuePackageInfo_10501 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ValuePackageInfo_10501 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ValuePackageInfo_10501> parser() {
         return PARSER;
      }

      public Parser<C2S_ValuePackageInfo_10501> getParserForType() {
         return PARSER;
      }

      public C2S_ValuePackageInfo_10501 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ValuePackageInfo_10501OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_C2S_ValuePackageInfo_10501_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_C2S_ValuePackageInfo_10501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ValuePackageInfo_10501.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ValuePackageMsg.C2S_ValuePackageInfo_10501.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_C2S_ValuePackageInfo_10501_descriptor;
         }

         public C2S_ValuePackageInfo_10501 getDefaultInstanceForType() {
            return ValuePackageMsg.C2S_ValuePackageInfo_10501.getDefaultInstance();
         }

         public C2S_ValuePackageInfo_10501 build() {
            C2S_ValuePackageInfo_10501 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ValuePackageInfo_10501 buildPartial() {
            C2S_ValuePackageInfo_10501 result = new C2S_ValuePackageInfo_10501(this);
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
            if (other instanceof C2S_ValuePackageInfo_10501) {
               return this.mergeFrom((C2S_ValuePackageInfo_10501)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ValuePackageInfo_10501 other) {
            if (other == ValuePackageMsg.C2S_ValuePackageInfo_10501.getDefaultInstance()) {
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
            C2S_ValuePackageInfo_10501 parsedMessage = null;

            try {
               parsedMessage = (C2S_ValuePackageInfo_10501)ValuePackageMsg.C2S_ValuePackageInfo_10501.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ValuePackageInfo_10501)e.getUnfinishedMessage();
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

   public static final class S2C_ValuePackageInfo_10502 extends GeneratedMessageV3 implements S2C_ValuePackageInfo_10502OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REFRESHTIME_FIELD_NUMBER = 1;
      private int refreshTime_;
      public static final int INFO_FIELD_NUMBER = 2;
      private List<ValueInfo> info_;
      private byte memoizedIsInitialized;
      private static final S2C_ValuePackageInfo_10502 DEFAULT_INSTANCE = new S2C_ValuePackageInfo_10502();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ValuePackageInfo_10502> PARSER = new AbstractParser<S2C_ValuePackageInfo_10502>() {
         public S2C_ValuePackageInfo_10502 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ValuePackageInfo_10502(input, extensionRegistry);
         }
      };

      private S2C_ValuePackageInfo_10502(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ValuePackageInfo_10502() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ValuePackageInfo_10502();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ValuePackageInfo_10502(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.refreshTime_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.info_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.info_.add(input.readMessage(ValuePackageMsg.ValueInfo.PARSER, extensionRegistry));
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
                  this.info_ = Collections.unmodifiableList(this.info_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_S2C_ValuePackageInfo_10502_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_S2C_ValuePackageInfo_10502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ValuePackageInfo_10502.class, Builder.class);
      }

      public boolean hasRefreshTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRefreshTime() {
         return this.refreshTime_;
      }

      public List<ValueInfo> getInfoList() {
         return this.info_;
      }

      public List<? extends ValueInfoOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public ValueInfo getInfo(int index) {
         return (ValueInfo)this.info_.get(index);
      }

      public ValueInfoOrBuilder getInfoOrBuilder(int index) {
         return (ValueInfoOrBuilder)this.info_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRefreshTime()) {
            this.memoizedIsInitialized = 0;
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
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.refreshTime_);
         }

         for(int i = 0; i < this.info_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.info_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.refreshTime_);
            }

            for(int i = 0; i < this.info_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.info_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ValuePackageInfo_10502)) {
            return super.equals(obj);
         } else {
            S2C_ValuePackageInfo_10502 other = (S2C_ValuePackageInfo_10502)obj;
            if (this.hasRefreshTime() != other.hasRefreshTime()) {
               return false;
            } else if (this.hasRefreshTime() && this.getRefreshTime() != other.getRefreshTime()) {
               return false;
            } else if (!this.getInfoList().equals(other.getInfoList())) {
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
            if (this.hasRefreshTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRefreshTime();
            }

            if (this.getInfoCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ValuePackageInfo_10502 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ValuePackageInfo_10502)PARSER.parseFrom(data);
      }

      public static S2C_ValuePackageInfo_10502 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ValuePackageInfo_10502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ValuePackageInfo_10502 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ValuePackageInfo_10502)PARSER.parseFrom(data);
      }

      public static S2C_ValuePackageInfo_10502 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ValuePackageInfo_10502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ValuePackageInfo_10502 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ValuePackageInfo_10502)PARSER.parseFrom(data);
      }

      public static S2C_ValuePackageInfo_10502 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ValuePackageInfo_10502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ValuePackageInfo_10502 parseFrom(InputStream input) throws IOException {
         return (S2C_ValuePackageInfo_10502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ValuePackageInfo_10502 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ValuePackageInfo_10502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ValuePackageInfo_10502 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ValuePackageInfo_10502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ValuePackageInfo_10502 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ValuePackageInfo_10502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ValuePackageInfo_10502 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ValuePackageInfo_10502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ValuePackageInfo_10502 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ValuePackageInfo_10502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ValuePackageInfo_10502 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ValuePackageInfo_10502 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ValuePackageInfo_10502> parser() {
         return PARSER;
      }

      public Parser<S2C_ValuePackageInfo_10502> getParserForType() {
         return PARSER;
      }

      public S2C_ValuePackageInfo_10502 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ValuePackageInfo_10502OrBuilder {
         private int bitField0_;
         private int refreshTime_;
         private List<ValueInfo> info_;
         private RepeatedFieldBuilderV3<ValueInfo, ValueInfo.Builder, ValueInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_S2C_ValuePackageInfo_10502_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_S2C_ValuePackageInfo_10502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ValuePackageInfo_10502.class, Builder.class);
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
            if (ValuePackageMsg.S2C_ValuePackageInfo_10502.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.refreshTime_ = 0;
            this.bitField0_ &= -2;
            if (this.infoBuilder_ == null) {
               this.info_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.infoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_S2C_ValuePackageInfo_10502_descriptor;
         }

         public S2C_ValuePackageInfo_10502 getDefaultInstanceForType() {
            return ValuePackageMsg.S2C_ValuePackageInfo_10502.getDefaultInstance();
         }

         public S2C_ValuePackageInfo_10502 build() {
            S2C_ValuePackageInfo_10502 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ValuePackageInfo_10502 buildPartial() {
            S2C_ValuePackageInfo_10502 result = new S2C_ValuePackageInfo_10502(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.refreshTime_ = this.refreshTime_;
               to_bitField0_ |= 1;
            }

            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.info_ = Collections.unmodifiableList(this.info_);
                  this.bitField0_ &= -3;
               }

               result.info_ = this.info_;
            } else {
               result.info_ = this.infoBuilder_.build();
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
            if (other instanceof S2C_ValuePackageInfo_10502) {
               return this.mergeFrom((S2C_ValuePackageInfo_10502)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ValuePackageInfo_10502 other) {
            if (other == ValuePackageMsg.S2C_ValuePackageInfo_10502.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRefreshTime()) {
                  this.setRefreshTime(other.getRefreshTime());
               }

               if (this.infoBuilder_ == null) {
                  if (!other.info_.isEmpty()) {
                     if (this.info_.isEmpty()) {
                        this.info_ = other.info_;
                        this.bitField0_ &= -3;
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
                     this.bitField0_ &= -3;
                     this.infoBuilder_ = ValuePackageMsg.S2C_ValuePackageInfo_10502.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
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
            if (!this.hasRefreshTime()) {
               return false;
            } else {
               for(int i = 0; i < this.getInfoCount(); ++i) {
                  if (!this.getInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ValuePackageInfo_10502 parsedMessage = null;

            try {
               parsedMessage = (S2C_ValuePackageInfo_10502)ValuePackageMsg.S2C_ValuePackageInfo_10502.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ValuePackageInfo_10502)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRefreshTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRefreshTime() {
            return this.refreshTime_;
         }

         public Builder setRefreshTime(int value) {
            this.bitField0_ |= 1;
            this.refreshTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRefreshTime() {
            this.bitField0_ &= -2;
            this.refreshTime_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureInfoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.info_ = new ArrayList(this.info_);
               this.bitField0_ |= 2;
            }

         }

         public List<ValueInfo> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public ValueInfo getInfo(int index) {
            return this.infoBuilder_ == null ? (ValueInfo)this.info_.get(index) : (ValueInfo)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, ValueInfo value) {
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

         public Builder setInfo(int index, ValueInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(ValueInfo value) {
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

         public Builder addInfo(int index, ValueInfo value) {
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

         public Builder addInfo(ValueInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, ValueInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends ValueInfo> values) {
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
               this.bitField0_ &= -3;
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

         public ValueInfo.Builder getInfoBuilder(int index) {
            return (ValueInfo.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public ValueInfoOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (ValueInfoOrBuilder)this.info_.get(index) : (ValueInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ValueInfoOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public ValueInfo.Builder addInfoBuilder() {
            return (ValueInfo.Builder)this.getInfoFieldBuilder().addBuilder(ValuePackageMsg.ValueInfo.getDefaultInstance());
         }

         public ValueInfo.Builder addInfoBuilder(int index) {
            return (ValueInfo.Builder)this.getInfoFieldBuilder().addBuilder(index, ValuePackageMsg.ValueInfo.getDefaultInstance());
         }

         public List<ValueInfo.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ValueInfo, ValueInfo.Builder, ValueInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new RepeatedFieldBuilderV3(this.info_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class C2S_BuyItem_10503 extends GeneratedMessageV3 implements C2S_BuyItem_10503OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_BuyItem_10503 DEFAULT_INSTANCE = new C2S_BuyItem_10503();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BuyItem_10503> PARSER = new AbstractParser<C2S_BuyItem_10503>() {
         public C2S_BuyItem_10503 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BuyItem_10503(input, extensionRegistry);
         }
      };

      private C2S_BuyItem_10503(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BuyItem_10503() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BuyItem_10503();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BuyItem_10503(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_C2S_BuyItem_10503_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_C2S_BuyItem_10503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyItem_10503.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BuyItem_10503)) {
            return super.equals(obj);
         } else {
            C2S_BuyItem_10503 other = (C2S_BuyItem_10503)obj;
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

      public static C2S_BuyItem_10503 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_10503)PARSER.parseFrom(data);
      }

      public static C2S_BuyItem_10503 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_10503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyItem_10503 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_10503)PARSER.parseFrom(data);
      }

      public static C2S_BuyItem_10503 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_10503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyItem_10503 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_10503)PARSER.parseFrom(data);
      }

      public static C2S_BuyItem_10503 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_10503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyItem_10503 parseFrom(InputStream input) throws IOException {
         return (C2S_BuyItem_10503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyItem_10503 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyItem_10503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyItem_10503 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BuyItem_10503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BuyItem_10503 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyItem_10503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyItem_10503 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BuyItem_10503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyItem_10503 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyItem_10503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BuyItem_10503 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BuyItem_10503 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BuyItem_10503> parser() {
         return PARSER;
      }

      public Parser<C2S_BuyItem_10503> getParserForType() {
         return PARSER;
      }

      public C2S_BuyItem_10503 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BuyItem_10503OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_C2S_BuyItem_10503_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_C2S_BuyItem_10503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyItem_10503.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ValuePackageMsg.C2S_BuyItem_10503.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_C2S_BuyItem_10503_descriptor;
         }

         public C2S_BuyItem_10503 getDefaultInstanceForType() {
            return ValuePackageMsg.C2S_BuyItem_10503.getDefaultInstance();
         }

         public C2S_BuyItem_10503 build() {
            C2S_BuyItem_10503 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BuyItem_10503 buildPartial() {
            C2S_BuyItem_10503 result = new C2S_BuyItem_10503(this);
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
            if (other instanceof C2S_BuyItem_10503) {
               return this.mergeFrom((C2S_BuyItem_10503)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BuyItem_10503 other) {
            if (other == ValuePackageMsg.C2S_BuyItem_10503.getDefaultInstance()) {
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
            C2S_BuyItem_10503 parsedMessage = null;

            try {
               parsedMessage = (C2S_BuyItem_10503)ValuePackageMsg.C2S_BuyItem_10503.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BuyItem_10503)e.getUnfinishedMessage();
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

   public static final class S2C_BuyItem_10504 extends GeneratedMessageV3 implements S2C_BuyItem_10504OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 2;
      private ValueInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_BuyItem_10504 DEFAULT_INSTANCE = new S2C_BuyItem_10504();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BuyItem_10504> PARSER = new AbstractParser<S2C_BuyItem_10504>() {
         public S2C_BuyItem_10504 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BuyItem_10504(input, extensionRegistry);
         }
      };

      private S2C_BuyItem_10504(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BuyItem_10504() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BuyItem_10504();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BuyItem_10504(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        ValueInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (ValueInfo)input.readMessage(ValuePackageMsg.ValueInfo.PARSER, extensionRegistry);
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
         return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_S2C_BuyItem_10504_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_S2C_BuyItem_10504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyItem_10504.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public ValueInfo getInfo() {
         return this.info_ == null ? ValuePackageMsg.ValueInfo.getDefaultInstance() : this.info_;
      }

      public ValueInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? ValuePackageMsg.ValueInfo.getDefaultInstance() : this.info_;
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
            output.writeMessage(2, this.getInfo());
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
               size += CodedOutputStream.computeMessageSize(2, this.getInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BuyItem_10504)) {
            return super.equals(obj);
         } else {
            S2C_BuyItem_10504 other = (S2C_BuyItem_10504)obj;
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
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BuyItem_10504 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BuyItem_10504)PARSER.parseFrom(data);
      }

      public static S2C_BuyItem_10504 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyItem_10504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyItem_10504 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BuyItem_10504)PARSER.parseFrom(data);
      }

      public static S2C_BuyItem_10504 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyItem_10504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyItem_10504 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BuyItem_10504)PARSER.parseFrom(data);
      }

      public static S2C_BuyItem_10504 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyItem_10504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyItem_10504 parseFrom(InputStream input) throws IOException {
         return (S2C_BuyItem_10504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyItem_10504 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyItem_10504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyItem_10504 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BuyItem_10504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BuyItem_10504 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyItem_10504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyItem_10504 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BuyItem_10504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyItem_10504 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyItem_10504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BuyItem_10504 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BuyItem_10504 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BuyItem_10504> parser() {
         return PARSER;
      }

      public Parser<S2C_BuyItem_10504> getParserForType() {
         return PARSER;
      }

      public S2C_BuyItem_10504 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BuyItem_10504OrBuilder {
         private int bitField0_;
         private ValueInfo info_;
         private SingleFieldBuilderV3<ValueInfo, ValueInfo.Builder, ValueInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_S2C_BuyItem_10504_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_S2C_BuyItem_10504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyItem_10504.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ValuePackageMsg.S2C_BuyItem_10504.alwaysUseFieldBuilders) {
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
            return ValuePackageMsg.internal_static_valuepackage_com_gzbz_protobuf_S2C_BuyItem_10504_descriptor;
         }

         public S2C_BuyItem_10504 getDefaultInstanceForType() {
            return ValuePackageMsg.S2C_BuyItem_10504.getDefaultInstance();
         }

         public S2C_BuyItem_10504 build() {
            S2C_BuyItem_10504 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BuyItem_10504 buildPartial() {
            S2C_BuyItem_10504 result = new S2C_BuyItem_10504(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (ValueInfo)this.infoBuilder_.build();
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
            if (other instanceof S2C_BuyItem_10504) {
               return this.mergeFrom((S2C_BuyItem_10504)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BuyItem_10504 other) {
            if (other == ValuePackageMsg.S2C_BuyItem_10504.getDefaultInstance()) {
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
            S2C_BuyItem_10504 parsedMessage = null;

            try {
               parsedMessage = (S2C_BuyItem_10504)ValuePackageMsg.S2C_BuyItem_10504.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BuyItem_10504)e.getUnfinishedMessage();
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

         public ValueInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? ValuePackageMsg.ValueInfo.getDefaultInstance() : this.info_;
            } else {
               return (ValueInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(ValueInfo value) {
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

         public Builder setInfo(ValueInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(ValueInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != ValuePackageMsg.ValueInfo.getDefaultInstance()) {
                  this.info_ = ValuePackageMsg.ValueInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public ValueInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (ValueInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public ValueInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (ValueInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? ValuePackageMsg.ValueInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<ValueInfo, ValueInfo.Builder, ValueInfoOrBuilder> getInfoFieldBuilder() {
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

   public interface C2S_BuyItem_10503OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_ValuePackageInfo_10501OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_BuyItem_10504OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      ValueInfo getInfo();

      ValueInfoOrBuilder getInfoOrBuilder();
   }

   public interface S2C_ValuePackageInfo_10502OrBuilder extends MessageOrBuilder {
      boolean hasRefreshTime();

      int getRefreshTime();

      List<ValueInfo> getInfoList();

      ValueInfo getInfo(int index);

      int getInfoCount();

      List<? extends ValueInfoOrBuilder> getInfoOrBuilderList();

      ValueInfoOrBuilder getInfoOrBuilder(int index);
   }

   public interface ValueInfoOrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasId();

      int getId();

      boolean hasBuyTimes();

      int getBuyTimes();

      boolean hasTotalTimes();

      int getTotalTimes();

      boolean hasOriPrice();

      int getOriPrice();

      boolean hasDisPrice();

      int getDisPrice();

      boolean hasLvLimit();

      int getLvLimit();

      List<CommonMsg.ItemInfo> getItemsList();

      CommonMsg.ItemInfo getItems(int index);

      int getItemsCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index);
   }
}
