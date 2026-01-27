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

public final class ShopMsg {
   private static final Descriptors.Descriptor internal_static_shop_com_gzbz_protobuf_BuyItem_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shop_com_gzbz_protobuf_BuyItem_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shop_com_gzbz_protobuf_Shop_Item_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shop_com_gzbz_protobuf_Shop_Item_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shop_com_gzbz_protobuf_AutoInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shop_com_gzbz_protobuf_AutoInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shop_com_gzbz_protobuf_C2S_ShopData_7601_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shop_com_gzbz_protobuf_C2S_ShopData_7601_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shop_com_gzbz_protobuf_S2C_ShopData_7602_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shop_com_gzbz_protobuf_S2C_ShopData_7602_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shop_com_gzbz_protobuf_C2S_Refresh_7603_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shop_com_gzbz_protobuf_C2S_Refresh_7603_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shop_com_gzbz_protobuf_C2S_BuyItem_7605_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shop_com_gzbz_protobuf_C2S_BuyItem_7605_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shop_com_gzbz_protobuf_S2C_BuyItem_7606_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shop_com_gzbz_protobuf_S2C_BuyItem_7606_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shop_com_gzbz_protobuf_C2S_AutoInfo_7607_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shop_com_gzbz_protobuf_C2S_AutoInfo_7607_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shop_com_gzbz_protobuf_C2S_SetAutoBuy_7609_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shop_com_gzbz_protobuf_C2S_SetAutoBuy_7609_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shop_com_gzbz_protobuf_S2C_SetAutoBuy_7610_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shop_com_gzbz_protobuf_S2C_SetAutoBuy_7610_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shop_com_gzbz_protobuf_RecordInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shop_com_gzbz_protobuf_RecordInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shop_com_gzbz_protobuf_ShopRecordInfos_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shop_com_gzbz_protobuf_ShopRecordInfos_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shop_com_gzbz_protobuf_C2S_ShopBuyRecord_7611_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shop_com_gzbz_protobuf_C2S_ShopBuyRecord_7611_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_shop_com_gzbz_protobuf_S2C_ShopBuyRecord_7612_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_shop_com_gzbz_protobuf_S2C_ShopBuyRecord_7612_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ShopMsg() {
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
      String[] descriptorData = new String[]{"\n\nShop.proto\u0012\u0016shop.com.gzbz.protobuf\"(\n\u0007BuyItem\u0012\r\n\u0005buyId\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006buyNum\u0018\u0002 \u0002(\u0005\"(\n\tShop_Item\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007restNum\u0018\u0002 \u0002(\u0005\"&\n\bAutoInfo\u0012\u000e\n\u0006shopId\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0003(\u0005\"#\n\u0011C2S_ShopData_7601\u0012\u000e\n\u0006shopId\u0018\u0001 \u0002(\u0005\"£\u0001\n\u0011S2C_ShopData_7602\u0012\u000e\n\u0006shopId\u0018\u0001 \u0002(\u0005\u0012/\n\u0004item\u0018\u0002 \u0003(\u000b2!.shop.com.gzbz.protobuf.Shop_Item\u0012\u0012\n\ntotalTimes\u0018\u0003 \u0001(\u0005\u0012\u0014\n\frefreshTimes\u0018\u0004 \u0001(\u0003\u0012\u000e\n\u0006opType\u0018\u0005 \u0001(\u0005\u0012\u0013\n\u000buseFreeTime\u0018\u0006 \u0001(\u0005\"3\n\u0010C2S_Refresh_7603\u0012\u000e\n\u0006shopId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007autoBuy\u0018\u0002 \u0001(\b\";\n\u0010C2S_BuyItem_7605\u0012\u000e\n\u0006shopId\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0003 \u0002(\u0005\"?\n\u0010S2C_BuyItem_7606\u0012\u000e\n\u0006shopId\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007restNum\u0018\u0003 \u0002(\u0005\"#\n\u0011C2S_AutoInfo_7607\u0012\u000e\n\u0006shopId\u0018\u0001 \u0002(\u0005\"1\n\u0013C2S_SetAutoBuy_7609\u0012\u000e\n\u0006shopId\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0003(\u0005\"I\n\u0013S2C_SetAutoBuy_7610\u00122\n\bautoInfo\u0018\u0001 \u0003(\u000b2 .shop.com.gzbz.protobuf.AutoInfo\"I\n\nRecordInfo\u0012\u0010\n\bitemType\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006itemId\u0018\u0002 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004time\u0018\u0004 \u0002(\u0005\"Y\n\u000fShopRecordInfos\u0012\u000e\n\u0006shopId\u0018\u0001 \u0002(\u0005\u00126\n\nrecordInfo\u0018\u0002 \u0003(\u000b2\".shop.com.gzbz.protobuf.RecordInfo\"(\n\u0016C2S_ShopBuyRecord_7611\u0012\u000e\n\u0006shopId\u0018\u0001 \u0002(\u0005\"R\n\u0016S2C_ShopBuyRecord_7612\u00128\n\u0007records\u0018\u0001 \u0003(\u000b2'.shop.com.gzbz.protobuf.ShopRecordInfosB\u001e\n\u0011com.gzbz.protobufB\u0007ShopMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_shop_com_gzbz_protobuf_BuyItem_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_shop_com_gzbz_protobuf_BuyItem_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shop_com_gzbz_protobuf_BuyItem_descriptor, new String[]{"BuyId", "BuyNum"});
      internal_static_shop_com_gzbz_protobuf_Shop_Item_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_shop_com_gzbz_protobuf_Shop_Item_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shop_com_gzbz_protobuf_Shop_Item_descriptor, new String[]{"Id", "RestNum"});
      internal_static_shop_com_gzbz_protobuf_AutoInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_shop_com_gzbz_protobuf_AutoInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shop_com_gzbz_protobuf_AutoInfo_descriptor, new String[]{"ShopId", "Id"});
      internal_static_shop_com_gzbz_protobuf_C2S_ShopData_7601_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_shop_com_gzbz_protobuf_C2S_ShopData_7601_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shop_com_gzbz_protobuf_C2S_ShopData_7601_descriptor, new String[]{"ShopId"});
      internal_static_shop_com_gzbz_protobuf_S2C_ShopData_7602_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_shop_com_gzbz_protobuf_S2C_ShopData_7602_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shop_com_gzbz_protobuf_S2C_ShopData_7602_descriptor, new String[]{"ShopId", "Item", "TotalTimes", "RefreshTimes", "OpType", "UseFreeTime"});
      internal_static_shop_com_gzbz_protobuf_C2S_Refresh_7603_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_shop_com_gzbz_protobuf_C2S_Refresh_7603_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shop_com_gzbz_protobuf_C2S_Refresh_7603_descriptor, new String[]{"ShopId", "AutoBuy"});
      internal_static_shop_com_gzbz_protobuf_C2S_BuyItem_7605_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_shop_com_gzbz_protobuf_C2S_BuyItem_7605_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shop_com_gzbz_protobuf_C2S_BuyItem_7605_descriptor, new String[]{"ShopId", "Id", "Num"});
      internal_static_shop_com_gzbz_protobuf_S2C_BuyItem_7606_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_shop_com_gzbz_protobuf_S2C_BuyItem_7606_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shop_com_gzbz_protobuf_S2C_BuyItem_7606_descriptor, new String[]{"ShopId", "Id", "RestNum"});
      internal_static_shop_com_gzbz_protobuf_C2S_AutoInfo_7607_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_shop_com_gzbz_protobuf_C2S_AutoInfo_7607_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shop_com_gzbz_protobuf_C2S_AutoInfo_7607_descriptor, new String[]{"ShopId"});
      internal_static_shop_com_gzbz_protobuf_C2S_SetAutoBuy_7609_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_shop_com_gzbz_protobuf_C2S_SetAutoBuy_7609_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shop_com_gzbz_protobuf_C2S_SetAutoBuy_7609_descriptor, new String[]{"ShopId", "Id"});
      internal_static_shop_com_gzbz_protobuf_S2C_SetAutoBuy_7610_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_shop_com_gzbz_protobuf_S2C_SetAutoBuy_7610_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shop_com_gzbz_protobuf_S2C_SetAutoBuy_7610_descriptor, new String[]{"AutoInfo"});
      internal_static_shop_com_gzbz_protobuf_RecordInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_shop_com_gzbz_protobuf_RecordInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shop_com_gzbz_protobuf_RecordInfo_descriptor, new String[]{"ItemType", "ItemId", "Num", "Time"});
      internal_static_shop_com_gzbz_protobuf_ShopRecordInfos_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_shop_com_gzbz_protobuf_ShopRecordInfos_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shop_com_gzbz_protobuf_ShopRecordInfos_descriptor, new String[]{"ShopId", "RecordInfo"});
      internal_static_shop_com_gzbz_protobuf_C2S_ShopBuyRecord_7611_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_shop_com_gzbz_protobuf_C2S_ShopBuyRecord_7611_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shop_com_gzbz_protobuf_C2S_ShopBuyRecord_7611_descriptor, new String[]{"ShopId"});
      internal_static_shop_com_gzbz_protobuf_S2C_ShopBuyRecord_7612_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_shop_com_gzbz_protobuf_S2C_ShopBuyRecord_7612_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_shop_com_gzbz_protobuf_S2C_ShopBuyRecord_7612_descriptor, new String[]{"Records"});
   }

   public static final class BuyItem extends GeneratedMessageV3 implements BuyItemOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYID_FIELD_NUMBER = 1;
      private int buyId_;
      public static final int BUYNUM_FIELD_NUMBER = 2;
      private int buyNum_;
      private byte memoizedIsInitialized;
      private static final BuyItem DEFAULT_INSTANCE = new BuyItem();
      /** @deprecated */
      @Deprecated
      public static final Parser<BuyItem> PARSER = new AbstractParser<BuyItem>() {
         public BuyItem parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new BuyItem(input, extensionRegistry);
         }
      };

      private BuyItem(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private BuyItem() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new BuyItem();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private BuyItem(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buyId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.buyNum_ = input.readInt32();
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
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_BuyItem_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_BuyItem_fieldAccessorTable.ensureFieldAccessorsInitialized(BuyItem.class, Builder.class);
      }

      public boolean hasBuyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuyId() {
         return this.buyId_;
      }

      public boolean hasBuyNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBuyNum() {
         return this.buyNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuyNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.buyId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.buyNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.buyId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.buyNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof BuyItem)) {
            return super.equals(obj);
         } else {
            BuyItem other = (BuyItem)obj;
            if (this.hasBuyId() != other.hasBuyId()) {
               return false;
            } else if (this.hasBuyId() && this.getBuyId() != other.getBuyId()) {
               return false;
            } else if (this.hasBuyNum() != other.hasBuyNum()) {
               return false;
            } else if (this.hasBuyNum() && this.getBuyNum() != other.getBuyNum()) {
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
            if (this.hasBuyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuyId();
            }

            if (this.hasBuyNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static BuyItem parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (BuyItem)PARSER.parseFrom(data);
      }

      public static BuyItem parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (BuyItem)PARSER.parseFrom(data, extensionRegistry);
      }

      public static BuyItem parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (BuyItem)PARSER.parseFrom(data);
      }

      public static BuyItem parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (BuyItem)PARSER.parseFrom(data, extensionRegistry);
      }

      public static BuyItem parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (BuyItem)PARSER.parseFrom(data);
      }

      public static BuyItem parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (BuyItem)PARSER.parseFrom(data, extensionRegistry);
      }

      public static BuyItem parseFrom(InputStream input) throws IOException {
         return (BuyItem)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static BuyItem parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (BuyItem)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static BuyItem parseDelimitedFrom(InputStream input) throws IOException {
         return (BuyItem)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static BuyItem parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (BuyItem)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static BuyItem parseFrom(CodedInputStream input) throws IOException {
         return (BuyItem)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static BuyItem parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (BuyItem)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(BuyItem prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static BuyItem getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<BuyItem> parser() {
         return PARSER;
      }

      public Parser<BuyItem> getParserForType() {
         return PARSER;
      }

      public BuyItem getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BuyItemOrBuilder {
         private int bitField0_;
         private int buyId_;
         private int buyNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_BuyItem_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_BuyItem_fieldAccessorTable.ensureFieldAccessorsInitialized(BuyItem.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShopMsg.BuyItem.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyId_ = 0;
            this.bitField0_ &= -2;
            this.buyNum_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_BuyItem_descriptor;
         }

         public BuyItem getDefaultInstanceForType() {
            return ShopMsg.BuyItem.getDefaultInstance();
         }

         public BuyItem build() {
            BuyItem result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public BuyItem buildPartial() {
            BuyItem result = new BuyItem(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buyId_ = this.buyId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buyNum_ = this.buyNum_;
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
            if (other instanceof BuyItem) {
               return this.mergeFrom((BuyItem)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(BuyItem other) {
            if (other == ShopMsg.BuyItem.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuyId()) {
                  this.setBuyId(other.getBuyId());
               }

               if (other.hasBuyNum()) {
                  this.setBuyNum(other.getBuyNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBuyId()) {
               return false;
            } else {
               return this.hasBuyNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            BuyItem parsedMessage = null;

            try {
               parsedMessage = (BuyItem)ShopMsg.BuyItem.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (BuyItem)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuyId() {
            return this.buyId_;
         }

         public Builder setBuyId(int value) {
            this.bitField0_ |= 1;
            this.buyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyId() {
            this.bitField0_ &= -2;
            this.buyId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuyNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuyNum() {
            return this.buyNum_;
         }

         public Builder setBuyNum(int value) {
            this.bitField0_ |= 2;
            this.buyNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyNum() {
            this.bitField0_ &= -3;
            this.buyNum_ = 0;
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

   public static final class Shop_Item extends GeneratedMessageV3 implements Shop_ItemOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int RESTNUM_FIELD_NUMBER = 2;
      private int restNum_;
      private byte memoizedIsInitialized;
      private static final Shop_Item DEFAULT_INSTANCE = new Shop_Item();
      /** @deprecated */
      @Deprecated
      public static final Parser<Shop_Item> PARSER = new AbstractParser<Shop_Item>() {
         public Shop_Item parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new Shop_Item(input, extensionRegistry);
         }
      };

      private Shop_Item(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private Shop_Item() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new Shop_Item();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private Shop_Item(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.restNum_ = input.readInt32();
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
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_Shop_Item_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_Shop_Item_fieldAccessorTable.ensureFieldAccessorsInitialized(Shop_Item.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasRestNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRestNum() {
         return this.restNum_;
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
         } else if (!this.hasRestNum()) {
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
            output.writeInt32(2, this.restNum_);
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
               size += CodedOutputStream.computeInt32Size(2, this.restNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof Shop_Item)) {
            return super.equals(obj);
         } else {
            Shop_Item other = (Shop_Item)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasRestNum() != other.hasRestNum()) {
               return false;
            } else if (this.hasRestNum() && this.getRestNum() != other.getRestNum()) {
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

            if (this.hasRestNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRestNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static Shop_Item parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (Shop_Item)PARSER.parseFrom(data);
      }

      public static Shop_Item parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Shop_Item)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Shop_Item parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (Shop_Item)PARSER.parseFrom(data);
      }

      public static Shop_Item parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Shop_Item)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Shop_Item parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (Shop_Item)PARSER.parseFrom(data);
      }

      public static Shop_Item parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Shop_Item)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Shop_Item parseFrom(InputStream input) throws IOException {
         return (Shop_Item)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static Shop_Item parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Shop_Item)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static Shop_Item parseDelimitedFrom(InputStream input) throws IOException {
         return (Shop_Item)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static Shop_Item parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Shop_Item)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static Shop_Item parseFrom(CodedInputStream input) throws IOException {
         return (Shop_Item)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static Shop_Item parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Shop_Item)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(Shop_Item prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static Shop_Item getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<Shop_Item> parser() {
         return PARSER;
      }

      public Parser<Shop_Item> getParserForType() {
         return PARSER;
      }

      public Shop_Item getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Shop_ItemOrBuilder {
         private int bitField0_;
         private int id_;
         private int restNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_Shop_Item_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_Shop_Item_fieldAccessorTable.ensureFieldAccessorsInitialized(Shop_Item.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShopMsg.Shop_Item.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.restNum_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_Shop_Item_descriptor;
         }

         public Shop_Item getDefaultInstanceForType() {
            return ShopMsg.Shop_Item.getDefaultInstance();
         }

         public Shop_Item build() {
            Shop_Item result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public Shop_Item buildPartial() {
            Shop_Item result = new Shop_Item(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.restNum_ = this.restNum_;
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
            if (other instanceof Shop_Item) {
               return this.mergeFrom((Shop_Item)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(Shop_Item other) {
            if (other == ShopMsg.Shop_Item.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasRestNum()) {
                  this.setRestNum(other.getRestNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else {
               return this.hasRestNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            Shop_Item parsedMessage = null;

            try {
               parsedMessage = (Shop_Item)ShopMsg.Shop_Item.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (Shop_Item)e.getUnfinishedMessage();
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

         public boolean hasRestNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRestNum() {
            return this.restNum_;
         }

         public Builder setRestNum(int value) {
            this.bitField0_ |= 2;
            this.restNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRestNum() {
            this.bitField0_ &= -3;
            this.restNum_ = 0;
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

   public static final class AutoInfo extends GeneratedMessageV3 implements AutoInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SHOPID_FIELD_NUMBER = 1;
      private int shopId_;
      public static final int ID_FIELD_NUMBER = 2;
      private Internal.IntList id_;
      private byte memoizedIsInitialized;
      private static final AutoInfo DEFAULT_INSTANCE = new AutoInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<AutoInfo> PARSER = new AbstractParser<AutoInfo>() {
         public AutoInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new AutoInfo(input, extensionRegistry);
         }
      };

      private AutoInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private AutoInfo() {
         this.memoizedIsInitialized = -1;
         this.id_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new AutoInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private AutoInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.shopId_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.id_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.id_.addInt(input.readInt32());
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
                  this.id_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_AutoInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_AutoInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AutoInfo.class, Builder.class);
      }

      public boolean hasShopId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getShopId() {
         return this.shopId_;
      }

      public List<Integer> getIdList() {
         return this.id_;
      }

      public int getIdCount() {
         return this.id_.size();
      }

      public int getId(int index) {
         return this.id_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasShopId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.shopId_);
         }

         for(int i = 0; i < this.id_.size(); ++i) {
            output.writeInt32(2, this.id_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.shopId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.id_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.id_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof AutoInfo)) {
            return super.equals(obj);
         } else {
            AutoInfo other = (AutoInfo)obj;
            if (this.hasShopId() != other.hasShopId()) {
               return false;
            } else if (this.hasShopId() && this.getShopId() != other.getShopId()) {
               return false;
            } else if (!this.getIdList().equals(other.getIdList())) {
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
            if (this.hasShopId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getShopId();
            }

            if (this.getIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static AutoInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (AutoInfo)PARSER.parseFrom(data);
      }

      public static AutoInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (AutoInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static AutoInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (AutoInfo)PARSER.parseFrom(data);
      }

      public static AutoInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (AutoInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static AutoInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (AutoInfo)PARSER.parseFrom(data);
      }

      public static AutoInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (AutoInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static AutoInfo parseFrom(InputStream input) throws IOException {
         return (AutoInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static AutoInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (AutoInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static AutoInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (AutoInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static AutoInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (AutoInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static AutoInfo parseFrom(CodedInputStream input) throws IOException {
         return (AutoInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static AutoInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (AutoInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(AutoInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static AutoInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<AutoInfo> parser() {
         return PARSER;
      }

      public Parser<AutoInfo> getParserForType() {
         return PARSER;
      }

      public AutoInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AutoInfoOrBuilder {
         private int bitField0_;
         private int shopId_;
         private Internal.IntList id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_AutoInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_AutoInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AutoInfo.class, Builder.class);
         }

         private Builder() {
            this.id_ = ShopMsg.AutoInfo.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.id_ = ShopMsg.AutoInfo.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShopMsg.AutoInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.shopId_ = 0;
            this.bitField0_ &= -2;
            this.id_ = ShopMsg.AutoInfo.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_AutoInfo_descriptor;
         }

         public AutoInfo getDefaultInstanceForType() {
            return ShopMsg.AutoInfo.getDefaultInstance();
         }

         public AutoInfo build() {
            AutoInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public AutoInfo buildPartial() {
            AutoInfo result = new AutoInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.shopId_ = this.shopId_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.id_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.id_ = this.id_;
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
            if (other instanceof AutoInfo) {
               return this.mergeFrom((AutoInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(AutoInfo other) {
            if (other == ShopMsg.AutoInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasShopId()) {
                  this.setShopId(other.getShopId());
               }

               if (!other.id_.isEmpty()) {
                  if (this.id_.isEmpty()) {
                     this.id_ = other.id_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureIdIsMutable();
                     this.id_.addAll(other.id_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasShopId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            AutoInfo parsedMessage = null;

            try {
               parsedMessage = (AutoInfo)ShopMsg.AutoInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (AutoInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasShopId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getShopId() {
            return this.shopId_;
         }

         public Builder setShopId(int value) {
            this.bitField0_ |= 1;
            this.shopId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShopId() {
            this.bitField0_ &= -2;
            this.shopId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.id_ = ShopMsg.AutoInfo.mutableCopy(this.id_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.id_) : this.id_);
         }

         public int getIdCount() {
            return this.id_.size();
         }

         public int getId(int index) {
            return this.id_.getInt(index);
         }

         public Builder setId(int index, int value) {
            this.ensureIdIsMutable();
            this.id_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addId(int value) {
            this.ensureIdIsMutable();
            this.id_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllId(Iterable<? extends Integer> values) {
            this.ensureIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.id_);
            this.onChanged();
            return this;
         }

         public Builder clearId() {
            this.id_ = ShopMsg.AutoInfo.emptyIntList();
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

   public static final class C2S_ShopData_7601 extends GeneratedMessageV3 implements C2S_ShopData_7601OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SHOPID_FIELD_NUMBER = 1;
      private int shopId_;
      private byte memoizedIsInitialized;
      private static final C2S_ShopData_7601 DEFAULT_INSTANCE = new C2S_ShopData_7601();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ShopData_7601> PARSER = new AbstractParser<C2S_ShopData_7601>() {
         public C2S_ShopData_7601 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ShopData_7601(input, extensionRegistry);
         }
      };

      private C2S_ShopData_7601(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ShopData_7601() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ShopData_7601();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ShopData_7601(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.shopId_ = input.readInt32();
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
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_ShopData_7601_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_ShopData_7601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopData_7601.class, Builder.class);
      }

      public boolean hasShopId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getShopId() {
         return this.shopId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasShopId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.shopId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.shopId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ShopData_7601)) {
            return super.equals(obj);
         } else {
            C2S_ShopData_7601 other = (C2S_ShopData_7601)obj;
            if (this.hasShopId() != other.hasShopId()) {
               return false;
            } else if (this.hasShopId() && this.getShopId() != other.getShopId()) {
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
            if (this.hasShopId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getShopId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ShopData_7601 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ShopData_7601)PARSER.parseFrom(data);
      }

      public static C2S_ShopData_7601 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopData_7601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopData_7601 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ShopData_7601)PARSER.parseFrom(data);
      }

      public static C2S_ShopData_7601 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopData_7601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopData_7601 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ShopData_7601)PARSER.parseFrom(data);
      }

      public static C2S_ShopData_7601 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopData_7601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopData_7601 parseFrom(InputStream input) throws IOException {
         return (C2S_ShopData_7601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopData_7601 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopData_7601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopData_7601 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ShopData_7601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ShopData_7601 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopData_7601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopData_7601 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ShopData_7601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopData_7601 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopData_7601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ShopData_7601 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ShopData_7601 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ShopData_7601> parser() {
         return PARSER;
      }

      public Parser<C2S_ShopData_7601> getParserForType() {
         return PARSER;
      }

      public C2S_ShopData_7601 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ShopData_7601OrBuilder {
         private int bitField0_;
         private int shopId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_ShopData_7601_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_ShopData_7601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopData_7601.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShopMsg.C2S_ShopData_7601.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.shopId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_ShopData_7601_descriptor;
         }

         public C2S_ShopData_7601 getDefaultInstanceForType() {
            return ShopMsg.C2S_ShopData_7601.getDefaultInstance();
         }

         public C2S_ShopData_7601 build() {
            C2S_ShopData_7601 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ShopData_7601 buildPartial() {
            C2S_ShopData_7601 result = new C2S_ShopData_7601(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.shopId_ = this.shopId_;
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
            if (other instanceof C2S_ShopData_7601) {
               return this.mergeFrom((C2S_ShopData_7601)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ShopData_7601 other) {
            if (other == ShopMsg.C2S_ShopData_7601.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasShopId()) {
                  this.setShopId(other.getShopId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasShopId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ShopData_7601 parsedMessage = null;

            try {
               parsedMessage = (C2S_ShopData_7601)ShopMsg.C2S_ShopData_7601.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ShopData_7601)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasShopId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getShopId() {
            return this.shopId_;
         }

         public Builder setShopId(int value) {
            this.bitField0_ |= 1;
            this.shopId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShopId() {
            this.bitField0_ &= -2;
            this.shopId_ = 0;
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

   public static final class S2C_ShopData_7602 extends GeneratedMessageV3 implements S2C_ShopData_7602OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SHOPID_FIELD_NUMBER = 1;
      private int shopId_;
      public static final int ITEM_FIELD_NUMBER = 2;
      private List<Shop_Item> item_;
      public static final int TOTALTIMES_FIELD_NUMBER = 3;
      private int totalTimes_;
      public static final int REFRESHTIMES_FIELD_NUMBER = 4;
      private long refreshTimes_;
      public static final int OPTYPE_FIELD_NUMBER = 5;
      private int opType_;
      public static final int USEFREETIME_FIELD_NUMBER = 6;
      private int useFreeTime_;
      private byte memoizedIsInitialized;
      private static final S2C_ShopData_7602 DEFAULT_INSTANCE = new S2C_ShopData_7602();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ShopData_7602> PARSER = new AbstractParser<S2C_ShopData_7602>() {
         public S2C_ShopData_7602 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ShopData_7602(input, extensionRegistry);
         }
      };

      private S2C_ShopData_7602(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ShopData_7602() {
         this.memoizedIsInitialized = -1;
         this.item_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ShopData_7602();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ShopData_7602(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.shopId_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.item_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.item_.add(input.readMessage(ShopMsg.Shop_Item.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.totalTimes_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.refreshTimes_ = input.readInt64();
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.opType_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 16;
                        this.useFreeTime_ = input.readInt32();
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
                  this.item_ = Collections.unmodifiableList(this.item_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_S2C_ShopData_7602_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_S2C_ShopData_7602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopData_7602.class, Builder.class);
      }

      public boolean hasShopId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getShopId() {
         return this.shopId_;
      }

      public List<Shop_Item> getItemList() {
         return this.item_;
      }

      public List<? extends Shop_ItemOrBuilder> getItemOrBuilderList() {
         return this.item_;
      }

      public int getItemCount() {
         return this.item_.size();
      }

      public Shop_Item getItem(int index) {
         return (Shop_Item)this.item_.get(index);
      }

      public Shop_ItemOrBuilder getItemOrBuilder(int index) {
         return (Shop_ItemOrBuilder)this.item_.get(index);
      }

      public boolean hasTotalTimes() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTotalTimes() {
         return this.totalTimes_;
      }

      public boolean hasRefreshTimes() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getRefreshTimes() {
         return this.refreshTimes_;
      }

      public boolean hasOpType() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getOpType() {
         return this.opType_;
      }

      public boolean hasUseFreeTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getUseFreeTime() {
         return this.useFreeTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasShopId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getItemCount(); ++i) {
               if (!this.getItem(i).isInitialized()) {
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
            output.writeInt32(1, this.shopId_);
         }

         for(int i = 0; i < this.item_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.item_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.totalTimes_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(4, this.refreshTimes_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.opType_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(6, this.useFreeTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.shopId_);
            }

            for(int i = 0; i < this.item_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.item_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.totalTimes_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(4, this.refreshTimes_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.opType_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.useFreeTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ShopData_7602)) {
            return super.equals(obj);
         } else {
            S2C_ShopData_7602 other = (S2C_ShopData_7602)obj;
            if (this.hasShopId() != other.hasShopId()) {
               return false;
            } else if (this.hasShopId() && this.getShopId() != other.getShopId()) {
               return false;
            } else if (!this.getItemList().equals(other.getItemList())) {
               return false;
            } else if (this.hasTotalTimes() != other.hasTotalTimes()) {
               return false;
            } else if (this.hasTotalTimes() && this.getTotalTimes() != other.getTotalTimes()) {
               return false;
            } else if (this.hasRefreshTimes() != other.hasRefreshTimes()) {
               return false;
            } else if (this.hasRefreshTimes() && this.getRefreshTimes() != other.getRefreshTimes()) {
               return false;
            } else if (this.hasOpType() != other.hasOpType()) {
               return false;
            } else if (this.hasOpType() && this.getOpType() != other.getOpType()) {
               return false;
            } else if (this.hasUseFreeTime() != other.hasUseFreeTime()) {
               return false;
            } else if (this.hasUseFreeTime() && this.getUseFreeTime() != other.getUseFreeTime()) {
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
            if (this.hasShopId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getShopId();
            }

            if (this.getItemCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemList().hashCode();
            }

            if (this.hasTotalTimes()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTotalTimes();
            }

            if (this.hasRefreshTimes()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashLong(this.getRefreshTimes());
            }

            if (this.hasOpType()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getOpType();
            }

            if (this.hasUseFreeTime()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getUseFreeTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ShopData_7602 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ShopData_7602)PARSER.parseFrom(data);
      }

      public static S2C_ShopData_7602 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopData_7602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopData_7602 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ShopData_7602)PARSER.parseFrom(data);
      }

      public static S2C_ShopData_7602 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopData_7602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopData_7602 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ShopData_7602)PARSER.parseFrom(data);
      }

      public static S2C_ShopData_7602 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopData_7602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopData_7602 parseFrom(InputStream input) throws IOException {
         return (S2C_ShopData_7602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopData_7602 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopData_7602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopData_7602 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ShopData_7602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ShopData_7602 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopData_7602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopData_7602 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ShopData_7602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopData_7602 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopData_7602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ShopData_7602 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ShopData_7602 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ShopData_7602> parser() {
         return PARSER;
      }

      public Parser<S2C_ShopData_7602> getParserForType() {
         return PARSER;
      }

      public S2C_ShopData_7602 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ShopData_7602OrBuilder {
         private int bitField0_;
         private int shopId_;
         private List<Shop_Item> item_;
         private RepeatedFieldBuilderV3<Shop_Item, Shop_Item.Builder, Shop_ItemOrBuilder> itemBuilder_;
         private int totalTimes_;
         private long refreshTimes_;
         private int opType_;
         private int useFreeTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_S2C_ShopData_7602_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_S2C_ShopData_7602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopData_7602.class, Builder.class);
         }

         private Builder() {
            this.item_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.item_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShopMsg.S2C_ShopData_7602.alwaysUseFieldBuilders) {
               this.getItemFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.shopId_ = 0;
            this.bitField0_ &= -2;
            if (this.itemBuilder_ == null) {
               this.item_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.itemBuilder_.clear();
            }

            this.totalTimes_ = 0;
            this.bitField0_ &= -5;
            this.refreshTimes_ = 0L;
            this.bitField0_ &= -9;
            this.opType_ = 0;
            this.bitField0_ &= -17;
            this.useFreeTime_ = 0;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_S2C_ShopData_7602_descriptor;
         }

         public S2C_ShopData_7602 getDefaultInstanceForType() {
            return ShopMsg.S2C_ShopData_7602.getDefaultInstance();
         }

         public S2C_ShopData_7602 build() {
            S2C_ShopData_7602 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ShopData_7602 buildPartial() {
            S2C_ShopData_7602 result = new S2C_ShopData_7602(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.shopId_ = this.shopId_;
               to_bitField0_ |= 1;
            }

            if (this.itemBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.item_ = Collections.unmodifiableList(this.item_);
                  this.bitField0_ &= -3;
               }

               result.item_ = this.item_;
            } else {
               result.item_ = this.itemBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.totalTimes_ = this.totalTimes_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.refreshTimes_ = this.refreshTimes_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.opType_ = this.opType_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.useFreeTime_ = this.useFreeTime_;
               to_bitField0_ |= 16;
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
            if (other instanceof S2C_ShopData_7602) {
               return this.mergeFrom((S2C_ShopData_7602)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ShopData_7602 other) {
            if (other == ShopMsg.S2C_ShopData_7602.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasShopId()) {
                  this.setShopId(other.getShopId());
               }

               if (this.itemBuilder_ == null) {
                  if (!other.item_.isEmpty()) {
                     if (this.item_.isEmpty()) {
                        this.item_ = other.item_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureItemIsMutable();
                        this.item_.addAll(other.item_);
                     }

                     this.onChanged();
                  }
               } else if (!other.item_.isEmpty()) {
                  if (this.itemBuilder_.isEmpty()) {
                     this.itemBuilder_.dispose();
                     this.itemBuilder_ = null;
                     this.item_ = other.item_;
                     this.bitField0_ &= -3;
                     this.itemBuilder_ = ShopMsg.S2C_ShopData_7602.alwaysUseFieldBuilders ? this.getItemFieldBuilder() : null;
                  } else {
                     this.itemBuilder_.addAllMessages(other.item_);
                  }
               }

               if (other.hasTotalTimes()) {
                  this.setTotalTimes(other.getTotalTimes());
               }

               if (other.hasRefreshTimes()) {
                  this.setRefreshTimes(other.getRefreshTimes());
               }

               if (other.hasOpType()) {
                  this.setOpType(other.getOpType());
               }

               if (other.hasUseFreeTime()) {
                  this.setUseFreeTime(other.getUseFreeTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasShopId()) {
               return false;
            } else {
               for(int i = 0; i < this.getItemCount(); ++i) {
                  if (!this.getItem(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ShopData_7602 parsedMessage = null;

            try {
               parsedMessage = (S2C_ShopData_7602)ShopMsg.S2C_ShopData_7602.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ShopData_7602)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasShopId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getShopId() {
            return this.shopId_;
         }

         public Builder setShopId(int value) {
            this.bitField0_ |= 1;
            this.shopId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShopId() {
            this.bitField0_ &= -2;
            this.shopId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureItemIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.item_ = new ArrayList(this.item_);
               this.bitField0_ |= 2;
            }

         }

         public List<Shop_Item> getItemList() {
            return this.itemBuilder_ == null ? Collections.unmodifiableList(this.item_) : this.itemBuilder_.getMessageList();
         }

         public int getItemCount() {
            return this.itemBuilder_ == null ? this.item_.size() : this.itemBuilder_.getCount();
         }

         public Shop_Item getItem(int index) {
            return this.itemBuilder_ == null ? (Shop_Item)this.item_.get(index) : (Shop_Item)this.itemBuilder_.getMessage(index);
         }

         public Builder setItem(int index, Shop_Item value) {
            if (this.itemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemIsMutable();
               this.item_.set(index, value);
               this.onChanged();
            } else {
               this.itemBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setItem(int index, Shop_Item.Builder builderForValue) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               this.item_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItem(Shop_Item value) {
            if (this.itemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemIsMutable();
               this.item_.add(value);
               this.onChanged();
            } else {
               this.itemBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addItem(int index, Shop_Item value) {
            if (this.itemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemIsMutable();
               this.item_.add(index, value);
               this.onChanged();
            } else {
               this.itemBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addItem(Shop_Item.Builder builderForValue) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               this.item_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItem(int index, Shop_Item.Builder builderForValue) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               this.item_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItem(Iterable<? extends Shop_Item> values) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.item_);
               this.onChanged();
            } else {
               this.itemBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearItem() {
            if (this.itemBuilder_ == null) {
               this.item_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.itemBuilder_.clear();
            }

            return this;
         }

         public Builder removeItem(int index) {
            if (this.itemBuilder_ == null) {
               this.ensureItemIsMutable();
               this.item_.remove(index);
               this.onChanged();
            } else {
               this.itemBuilder_.remove(index);
            }

            return this;
         }

         public Shop_Item.Builder getItemBuilder(int index) {
            return (Shop_Item.Builder)this.getItemFieldBuilder().getBuilder(index);
         }

         public Shop_ItemOrBuilder getItemOrBuilder(int index) {
            return this.itemBuilder_ == null ? (Shop_ItemOrBuilder)this.item_.get(index) : (Shop_ItemOrBuilder)this.itemBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends Shop_ItemOrBuilder> getItemOrBuilderList() {
            return this.itemBuilder_ != null ? this.itemBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.item_);
         }

         public Shop_Item.Builder addItemBuilder() {
            return (Shop_Item.Builder)this.getItemFieldBuilder().addBuilder(ShopMsg.Shop_Item.getDefaultInstance());
         }

         public Shop_Item.Builder addItemBuilder(int index) {
            return (Shop_Item.Builder)this.getItemFieldBuilder().addBuilder(index, ShopMsg.Shop_Item.getDefaultInstance());
         }

         public List<Shop_Item.Builder> getItemBuilderList() {
            return this.getItemFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<Shop_Item, Shop_Item.Builder, Shop_ItemOrBuilder> getItemFieldBuilder() {
            if (this.itemBuilder_ == null) {
               this.itemBuilder_ = new RepeatedFieldBuilderV3(this.item_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.item_ = null;
            }

            return this.itemBuilder_;
         }

         public boolean hasTotalTimes() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getTotalTimes() {
            return this.totalTimes_;
         }

         public Builder setTotalTimes(int value) {
            this.bitField0_ |= 4;
            this.totalTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalTimes() {
            this.bitField0_ &= -5;
            this.totalTimes_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRefreshTimes() {
            return (this.bitField0_ & 8) != 0;
         }

         public long getRefreshTimes() {
            return this.refreshTimes_;
         }

         public Builder setRefreshTimes(long value) {
            this.bitField0_ |= 8;
            this.refreshTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRefreshTimes() {
            this.bitField0_ &= -9;
            this.refreshTimes_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasOpType() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getOpType() {
            return this.opType_;
         }

         public Builder setOpType(int value) {
            this.bitField0_ |= 16;
            this.opType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpType() {
            this.bitField0_ &= -17;
            this.opType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUseFreeTime() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getUseFreeTime() {
            return this.useFreeTime_;
         }

         public Builder setUseFreeTime(int value) {
            this.bitField0_ |= 32;
            this.useFreeTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUseFreeTime() {
            this.bitField0_ &= -33;
            this.useFreeTime_ = 0;
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

   public static final class C2S_Refresh_7603 extends GeneratedMessageV3 implements C2S_Refresh_7603OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SHOPID_FIELD_NUMBER = 1;
      private int shopId_;
      public static final int AUTOBUY_FIELD_NUMBER = 2;
      private boolean autoBuy_;
      private byte memoizedIsInitialized;
      private static final C2S_Refresh_7603 DEFAULT_INSTANCE = new C2S_Refresh_7603();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Refresh_7603> PARSER = new AbstractParser<C2S_Refresh_7603>() {
         public C2S_Refresh_7603 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Refresh_7603(input, extensionRegistry);
         }
      };

      private C2S_Refresh_7603(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Refresh_7603() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Refresh_7603();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Refresh_7603(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.shopId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.autoBuy_ = input.readBool();
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
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_Refresh_7603_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_Refresh_7603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Refresh_7603.class, Builder.class);
      }

      public boolean hasShopId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getShopId() {
         return this.shopId_;
      }

      public boolean hasAutoBuy() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getAutoBuy() {
         return this.autoBuy_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasShopId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.shopId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.autoBuy_);
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
               size += CodedOutputStream.computeInt32Size(1, this.shopId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.autoBuy_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Refresh_7603)) {
            return super.equals(obj);
         } else {
            C2S_Refresh_7603 other = (C2S_Refresh_7603)obj;
            if (this.hasShopId() != other.hasShopId()) {
               return false;
            } else if (this.hasShopId() && this.getShopId() != other.getShopId()) {
               return false;
            } else if (this.hasAutoBuy() != other.hasAutoBuy()) {
               return false;
            } else if (this.hasAutoBuy() && this.getAutoBuy() != other.getAutoBuy()) {
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
            if (this.hasShopId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getShopId();
            }

            if (this.hasAutoBuy()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getAutoBuy());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Refresh_7603 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Refresh_7603)PARSER.parseFrom(data);
      }

      public static C2S_Refresh_7603 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Refresh_7603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Refresh_7603 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Refresh_7603)PARSER.parseFrom(data);
      }

      public static C2S_Refresh_7603 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Refresh_7603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Refresh_7603 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Refresh_7603)PARSER.parseFrom(data);
      }

      public static C2S_Refresh_7603 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Refresh_7603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Refresh_7603 parseFrom(InputStream input) throws IOException {
         return (C2S_Refresh_7603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Refresh_7603 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Refresh_7603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Refresh_7603 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Refresh_7603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Refresh_7603 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Refresh_7603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Refresh_7603 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Refresh_7603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Refresh_7603 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Refresh_7603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Refresh_7603 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Refresh_7603 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Refresh_7603> parser() {
         return PARSER;
      }

      public Parser<C2S_Refresh_7603> getParserForType() {
         return PARSER;
      }

      public C2S_Refresh_7603 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Refresh_7603OrBuilder {
         private int bitField0_;
         private int shopId_;
         private boolean autoBuy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_Refresh_7603_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_Refresh_7603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Refresh_7603.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShopMsg.C2S_Refresh_7603.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.shopId_ = 0;
            this.bitField0_ &= -2;
            this.autoBuy_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_Refresh_7603_descriptor;
         }

         public C2S_Refresh_7603 getDefaultInstanceForType() {
            return ShopMsg.C2S_Refresh_7603.getDefaultInstance();
         }

         public C2S_Refresh_7603 build() {
            C2S_Refresh_7603 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Refresh_7603 buildPartial() {
            C2S_Refresh_7603 result = new C2S_Refresh_7603(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.shopId_ = this.shopId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.autoBuy_ = this.autoBuy_;
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
            if (other instanceof C2S_Refresh_7603) {
               return this.mergeFrom((C2S_Refresh_7603)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Refresh_7603 other) {
            if (other == ShopMsg.C2S_Refresh_7603.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasShopId()) {
                  this.setShopId(other.getShopId());
               }

               if (other.hasAutoBuy()) {
                  this.setAutoBuy(other.getAutoBuy());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasShopId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Refresh_7603 parsedMessage = null;

            try {
               parsedMessage = (C2S_Refresh_7603)ShopMsg.C2S_Refresh_7603.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Refresh_7603)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasShopId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getShopId() {
            return this.shopId_;
         }

         public Builder setShopId(int value) {
            this.bitField0_ |= 1;
            this.shopId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShopId() {
            this.bitField0_ &= -2;
            this.shopId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAutoBuy() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getAutoBuy() {
            return this.autoBuy_;
         }

         public Builder setAutoBuy(boolean value) {
            this.bitField0_ |= 2;
            this.autoBuy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAutoBuy() {
            this.bitField0_ &= -3;
            this.autoBuy_ = false;
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

   public static final class C2S_BuyItem_7605 extends GeneratedMessageV3 implements C2S_BuyItem_7605OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SHOPID_FIELD_NUMBER = 1;
      private int shopId_;
      public static final int ID_FIELD_NUMBER = 2;
      private int id_;
      public static final int NUM_FIELD_NUMBER = 3;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_BuyItem_7605 DEFAULT_INSTANCE = new C2S_BuyItem_7605();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BuyItem_7605> PARSER = new AbstractParser<C2S_BuyItem_7605>() {
         public C2S_BuyItem_7605 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BuyItem_7605(input, extensionRegistry);
         }
      };

      private C2S_BuyItem_7605(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BuyItem_7605() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BuyItem_7605();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BuyItem_7605(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.shopId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.id_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
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
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_BuyItem_7605_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_BuyItem_7605_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyItem_7605.class, Builder.class);
      }

      public boolean hasShopId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getShopId() {
         return this.shopId_;
      }

      public boolean hasId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 4) != 0;
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
         } else if (!this.hasShopId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasId()) {
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
            output.writeInt32(1, this.shopId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.id_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.num_);
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
               size += CodedOutputStream.computeInt32Size(1, this.shopId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.id_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.num_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_BuyItem_7605)) {
            return super.equals(obj);
         } else {
            C2S_BuyItem_7605 other = (C2S_BuyItem_7605)obj;
            if (this.hasShopId() != other.hasShopId()) {
               return false;
            } else if (this.hasShopId() && this.getShopId() != other.getShopId()) {
               return false;
            } else if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
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
            if (this.hasShopId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getShopId();
            }

            if (this.hasId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getId();
            }

            if (this.hasNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_BuyItem_7605 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_7605)PARSER.parseFrom(data);
      }

      public static C2S_BuyItem_7605 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_7605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyItem_7605 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_7605)PARSER.parseFrom(data);
      }

      public static C2S_BuyItem_7605 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_7605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyItem_7605 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_7605)PARSER.parseFrom(data);
      }

      public static C2S_BuyItem_7605 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_7605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyItem_7605 parseFrom(InputStream input) throws IOException {
         return (C2S_BuyItem_7605)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyItem_7605 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyItem_7605)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyItem_7605 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BuyItem_7605)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BuyItem_7605 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyItem_7605)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyItem_7605 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BuyItem_7605)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyItem_7605 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyItem_7605)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BuyItem_7605 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BuyItem_7605 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BuyItem_7605> parser() {
         return PARSER;
      }

      public Parser<C2S_BuyItem_7605> getParserForType() {
         return PARSER;
      }

      public C2S_BuyItem_7605 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BuyItem_7605OrBuilder {
         private int bitField0_;
         private int shopId_;
         private int id_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_BuyItem_7605_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_BuyItem_7605_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyItem_7605.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShopMsg.C2S_BuyItem_7605.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.shopId_ = 0;
            this.bitField0_ &= -2;
            this.id_ = 0;
            this.bitField0_ &= -3;
            this.num_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_BuyItem_7605_descriptor;
         }

         public C2S_BuyItem_7605 getDefaultInstanceForType() {
            return ShopMsg.C2S_BuyItem_7605.getDefaultInstance();
         }

         public C2S_BuyItem_7605 build() {
            C2S_BuyItem_7605 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BuyItem_7605 buildPartial() {
            C2S_BuyItem_7605 result = new C2S_BuyItem_7605(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.shopId_ = this.shopId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.num_ = this.num_;
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
            if (other instanceof C2S_BuyItem_7605) {
               return this.mergeFrom((C2S_BuyItem_7605)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BuyItem_7605 other) {
            if (other == ShopMsg.C2S_BuyItem_7605.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasShopId()) {
                  this.setShopId(other.getShopId());
               }

               if (other.hasId()) {
                  this.setId(other.getId());
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
            if (!this.hasShopId()) {
               return false;
            } else if (!this.hasId()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_BuyItem_7605 parsedMessage = null;

            try {
               parsedMessage = (C2S_BuyItem_7605)ShopMsg.C2S_BuyItem_7605.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BuyItem_7605)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasShopId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getShopId() {
            return this.shopId_;
         }

         public Builder setShopId(int value) {
            this.bitField0_ |= 1;
            this.shopId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShopId() {
            this.bitField0_ &= -2;
            this.shopId_ = 0;
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

         public boolean hasNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 4;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -5;
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

   public static final class S2C_BuyItem_7606 extends GeneratedMessageV3 implements S2C_BuyItem_7606OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SHOPID_FIELD_NUMBER = 1;
      private int shopId_;
      public static final int ID_FIELD_NUMBER = 2;
      private int id_;
      public static final int RESTNUM_FIELD_NUMBER = 3;
      private int restNum_;
      private byte memoizedIsInitialized;
      private static final S2C_BuyItem_7606 DEFAULT_INSTANCE = new S2C_BuyItem_7606();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BuyItem_7606> PARSER = new AbstractParser<S2C_BuyItem_7606>() {
         public S2C_BuyItem_7606 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BuyItem_7606(input, extensionRegistry);
         }
      };

      private S2C_BuyItem_7606(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BuyItem_7606() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BuyItem_7606();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BuyItem_7606(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.shopId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.id_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.restNum_ = input.readInt32();
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
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_S2C_BuyItem_7606_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_S2C_BuyItem_7606_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyItem_7606.class, Builder.class);
      }

      public boolean hasShopId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getShopId() {
         return this.shopId_;
      }

      public boolean hasId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasRestNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getRestNum() {
         return this.restNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasShopId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRestNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.shopId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.id_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.restNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.shopId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.id_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.restNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BuyItem_7606)) {
            return super.equals(obj);
         } else {
            S2C_BuyItem_7606 other = (S2C_BuyItem_7606)obj;
            if (this.hasShopId() != other.hasShopId()) {
               return false;
            } else if (this.hasShopId() && this.getShopId() != other.getShopId()) {
               return false;
            } else if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasRestNum() != other.hasRestNum()) {
               return false;
            } else if (this.hasRestNum() && this.getRestNum() != other.getRestNum()) {
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
            if (this.hasShopId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getShopId();
            }

            if (this.hasId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getId();
            }

            if (this.hasRestNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRestNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BuyItem_7606 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BuyItem_7606)PARSER.parseFrom(data);
      }

      public static S2C_BuyItem_7606 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyItem_7606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyItem_7606 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BuyItem_7606)PARSER.parseFrom(data);
      }

      public static S2C_BuyItem_7606 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyItem_7606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyItem_7606 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BuyItem_7606)PARSER.parseFrom(data);
      }

      public static S2C_BuyItem_7606 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyItem_7606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyItem_7606 parseFrom(InputStream input) throws IOException {
         return (S2C_BuyItem_7606)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyItem_7606 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyItem_7606)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyItem_7606 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BuyItem_7606)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BuyItem_7606 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyItem_7606)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyItem_7606 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BuyItem_7606)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyItem_7606 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyItem_7606)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BuyItem_7606 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BuyItem_7606 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BuyItem_7606> parser() {
         return PARSER;
      }

      public Parser<S2C_BuyItem_7606> getParserForType() {
         return PARSER;
      }

      public S2C_BuyItem_7606 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BuyItem_7606OrBuilder {
         private int bitField0_;
         private int shopId_;
         private int id_;
         private int restNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_S2C_BuyItem_7606_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_S2C_BuyItem_7606_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyItem_7606.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShopMsg.S2C_BuyItem_7606.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.shopId_ = 0;
            this.bitField0_ &= -2;
            this.id_ = 0;
            this.bitField0_ &= -3;
            this.restNum_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_S2C_BuyItem_7606_descriptor;
         }

         public S2C_BuyItem_7606 getDefaultInstanceForType() {
            return ShopMsg.S2C_BuyItem_7606.getDefaultInstance();
         }

         public S2C_BuyItem_7606 build() {
            S2C_BuyItem_7606 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BuyItem_7606 buildPartial() {
            S2C_BuyItem_7606 result = new S2C_BuyItem_7606(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.shopId_ = this.shopId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.restNum_ = this.restNum_;
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
            if (other instanceof S2C_BuyItem_7606) {
               return this.mergeFrom((S2C_BuyItem_7606)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BuyItem_7606 other) {
            if (other == ShopMsg.S2C_BuyItem_7606.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasShopId()) {
                  this.setShopId(other.getShopId());
               }

               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasRestNum()) {
                  this.setRestNum(other.getRestNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasShopId()) {
               return false;
            } else if (!this.hasId()) {
               return false;
            } else {
               return this.hasRestNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BuyItem_7606 parsedMessage = null;

            try {
               parsedMessage = (S2C_BuyItem_7606)ShopMsg.S2C_BuyItem_7606.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BuyItem_7606)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasShopId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getShopId() {
            return this.shopId_;
         }

         public Builder setShopId(int value) {
            this.bitField0_ |= 1;
            this.shopId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShopId() {
            this.bitField0_ &= -2;
            this.shopId_ = 0;
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

         public boolean hasRestNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getRestNum() {
            return this.restNum_;
         }

         public Builder setRestNum(int value) {
            this.bitField0_ |= 4;
            this.restNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRestNum() {
            this.bitField0_ &= -5;
            this.restNum_ = 0;
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

   public static final class C2S_AutoInfo_7607 extends GeneratedMessageV3 implements C2S_AutoInfo_7607OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SHOPID_FIELD_NUMBER = 1;
      private int shopId_;
      private byte memoizedIsInitialized;
      private static final C2S_AutoInfo_7607 DEFAULT_INSTANCE = new C2S_AutoInfo_7607();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AutoInfo_7607> PARSER = new AbstractParser<C2S_AutoInfo_7607>() {
         public C2S_AutoInfo_7607 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AutoInfo_7607(input, extensionRegistry);
         }
      };

      private C2S_AutoInfo_7607(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AutoInfo_7607() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AutoInfo_7607();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AutoInfo_7607(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.shopId_ = input.readInt32();
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
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_AutoInfo_7607_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_AutoInfo_7607_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AutoInfo_7607.class, Builder.class);
      }

      public boolean hasShopId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getShopId() {
         return this.shopId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasShopId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.shopId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.shopId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_AutoInfo_7607)) {
            return super.equals(obj);
         } else {
            C2S_AutoInfo_7607 other = (C2S_AutoInfo_7607)obj;
            if (this.hasShopId() != other.hasShopId()) {
               return false;
            } else if (this.hasShopId() && this.getShopId() != other.getShopId()) {
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
            if (this.hasShopId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getShopId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_AutoInfo_7607 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AutoInfo_7607)PARSER.parseFrom(data);
      }

      public static C2S_AutoInfo_7607 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AutoInfo_7607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AutoInfo_7607 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AutoInfo_7607)PARSER.parseFrom(data);
      }

      public static C2S_AutoInfo_7607 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AutoInfo_7607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AutoInfo_7607 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AutoInfo_7607)PARSER.parseFrom(data);
      }

      public static C2S_AutoInfo_7607 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AutoInfo_7607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AutoInfo_7607 parseFrom(InputStream input) throws IOException {
         return (C2S_AutoInfo_7607)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AutoInfo_7607 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AutoInfo_7607)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AutoInfo_7607 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AutoInfo_7607)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AutoInfo_7607 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AutoInfo_7607)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AutoInfo_7607 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AutoInfo_7607)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AutoInfo_7607 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AutoInfo_7607)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AutoInfo_7607 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AutoInfo_7607 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AutoInfo_7607> parser() {
         return PARSER;
      }

      public Parser<C2S_AutoInfo_7607> getParserForType() {
         return PARSER;
      }

      public C2S_AutoInfo_7607 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AutoInfo_7607OrBuilder {
         private int bitField0_;
         private int shopId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_AutoInfo_7607_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_AutoInfo_7607_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AutoInfo_7607.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShopMsg.C2S_AutoInfo_7607.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.shopId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_AutoInfo_7607_descriptor;
         }

         public C2S_AutoInfo_7607 getDefaultInstanceForType() {
            return ShopMsg.C2S_AutoInfo_7607.getDefaultInstance();
         }

         public C2S_AutoInfo_7607 build() {
            C2S_AutoInfo_7607 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AutoInfo_7607 buildPartial() {
            C2S_AutoInfo_7607 result = new C2S_AutoInfo_7607(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.shopId_ = this.shopId_;
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
            if (other instanceof C2S_AutoInfo_7607) {
               return this.mergeFrom((C2S_AutoInfo_7607)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AutoInfo_7607 other) {
            if (other == ShopMsg.C2S_AutoInfo_7607.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasShopId()) {
                  this.setShopId(other.getShopId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasShopId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_AutoInfo_7607 parsedMessage = null;

            try {
               parsedMessage = (C2S_AutoInfo_7607)ShopMsg.C2S_AutoInfo_7607.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AutoInfo_7607)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasShopId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getShopId() {
            return this.shopId_;
         }

         public Builder setShopId(int value) {
            this.bitField0_ |= 1;
            this.shopId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShopId() {
            this.bitField0_ &= -2;
            this.shopId_ = 0;
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

   public static final class C2S_SetAutoBuy_7609 extends GeneratedMessageV3 implements C2S_SetAutoBuy_7609OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SHOPID_FIELD_NUMBER = 1;
      private int shopId_;
      public static final int ID_FIELD_NUMBER = 2;
      private Internal.IntList id_;
      private byte memoizedIsInitialized;
      private static final C2S_SetAutoBuy_7609 DEFAULT_INSTANCE = new C2S_SetAutoBuy_7609();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SetAutoBuy_7609> PARSER = new AbstractParser<C2S_SetAutoBuy_7609>() {
         public C2S_SetAutoBuy_7609 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SetAutoBuy_7609(input, extensionRegistry);
         }
      };

      private C2S_SetAutoBuy_7609(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SetAutoBuy_7609() {
         this.memoizedIsInitialized = -1;
         this.id_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SetAutoBuy_7609();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SetAutoBuy_7609(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.shopId_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.id_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.id_.addInt(input.readInt32());
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
                  this.id_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_SetAutoBuy_7609_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_SetAutoBuy_7609_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SetAutoBuy_7609.class, Builder.class);
      }

      public boolean hasShopId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getShopId() {
         return this.shopId_;
      }

      public List<Integer> getIdList() {
         return this.id_;
      }

      public int getIdCount() {
         return this.id_.size();
      }

      public int getId(int index) {
         return this.id_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasShopId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.shopId_);
         }

         for(int i = 0; i < this.id_.size(); ++i) {
            output.writeInt32(2, this.id_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.shopId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.id_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.id_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SetAutoBuy_7609)) {
            return super.equals(obj);
         } else {
            C2S_SetAutoBuy_7609 other = (C2S_SetAutoBuy_7609)obj;
            if (this.hasShopId() != other.hasShopId()) {
               return false;
            } else if (this.hasShopId() && this.getShopId() != other.getShopId()) {
               return false;
            } else if (!this.getIdList().equals(other.getIdList())) {
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
            if (this.hasShopId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getShopId();
            }

            if (this.getIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SetAutoBuy_7609 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SetAutoBuy_7609)PARSER.parseFrom(data);
      }

      public static C2S_SetAutoBuy_7609 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SetAutoBuy_7609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SetAutoBuy_7609 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SetAutoBuy_7609)PARSER.parseFrom(data);
      }

      public static C2S_SetAutoBuy_7609 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SetAutoBuy_7609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SetAutoBuy_7609 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SetAutoBuy_7609)PARSER.parseFrom(data);
      }

      public static C2S_SetAutoBuy_7609 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SetAutoBuy_7609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SetAutoBuy_7609 parseFrom(InputStream input) throws IOException {
         return (C2S_SetAutoBuy_7609)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SetAutoBuy_7609 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SetAutoBuy_7609)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SetAutoBuy_7609 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SetAutoBuy_7609)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SetAutoBuy_7609 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SetAutoBuy_7609)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SetAutoBuy_7609 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SetAutoBuy_7609)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SetAutoBuy_7609 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SetAutoBuy_7609)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SetAutoBuy_7609 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SetAutoBuy_7609 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SetAutoBuy_7609> parser() {
         return PARSER;
      }

      public Parser<C2S_SetAutoBuy_7609> getParserForType() {
         return PARSER;
      }

      public C2S_SetAutoBuy_7609 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SetAutoBuy_7609OrBuilder {
         private int bitField0_;
         private int shopId_;
         private Internal.IntList id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_SetAutoBuy_7609_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_SetAutoBuy_7609_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SetAutoBuy_7609.class, Builder.class);
         }

         private Builder() {
            this.id_ = ShopMsg.C2S_SetAutoBuy_7609.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.id_ = ShopMsg.C2S_SetAutoBuy_7609.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShopMsg.C2S_SetAutoBuy_7609.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.shopId_ = 0;
            this.bitField0_ &= -2;
            this.id_ = ShopMsg.C2S_SetAutoBuy_7609.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_SetAutoBuy_7609_descriptor;
         }

         public C2S_SetAutoBuy_7609 getDefaultInstanceForType() {
            return ShopMsg.C2S_SetAutoBuy_7609.getDefaultInstance();
         }

         public C2S_SetAutoBuy_7609 build() {
            C2S_SetAutoBuy_7609 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SetAutoBuy_7609 buildPartial() {
            C2S_SetAutoBuy_7609 result = new C2S_SetAutoBuy_7609(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.shopId_ = this.shopId_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.id_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.id_ = this.id_;
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
            if (other instanceof C2S_SetAutoBuy_7609) {
               return this.mergeFrom((C2S_SetAutoBuy_7609)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SetAutoBuy_7609 other) {
            if (other == ShopMsg.C2S_SetAutoBuy_7609.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasShopId()) {
                  this.setShopId(other.getShopId());
               }

               if (!other.id_.isEmpty()) {
                  if (this.id_.isEmpty()) {
                     this.id_ = other.id_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureIdIsMutable();
                     this.id_.addAll(other.id_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasShopId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_SetAutoBuy_7609 parsedMessage = null;

            try {
               parsedMessage = (C2S_SetAutoBuy_7609)ShopMsg.C2S_SetAutoBuy_7609.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SetAutoBuy_7609)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasShopId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getShopId() {
            return this.shopId_;
         }

         public Builder setShopId(int value) {
            this.bitField0_ |= 1;
            this.shopId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShopId() {
            this.bitField0_ &= -2;
            this.shopId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.id_ = ShopMsg.C2S_SetAutoBuy_7609.mutableCopy(this.id_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.id_) : this.id_);
         }

         public int getIdCount() {
            return this.id_.size();
         }

         public int getId(int index) {
            return this.id_.getInt(index);
         }

         public Builder setId(int index, int value) {
            this.ensureIdIsMutable();
            this.id_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addId(int value) {
            this.ensureIdIsMutable();
            this.id_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllId(Iterable<? extends Integer> values) {
            this.ensureIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.id_);
            this.onChanged();
            return this;
         }

         public Builder clearId() {
            this.id_ = ShopMsg.C2S_SetAutoBuy_7609.emptyIntList();
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

   public static final class S2C_SetAutoBuy_7610 extends GeneratedMessageV3 implements S2C_SetAutoBuy_7610OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int AUTOINFO_FIELD_NUMBER = 1;
      private List<AutoInfo> autoInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_SetAutoBuy_7610 DEFAULT_INSTANCE = new S2C_SetAutoBuy_7610();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SetAutoBuy_7610> PARSER = new AbstractParser<S2C_SetAutoBuy_7610>() {
         public S2C_SetAutoBuy_7610 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SetAutoBuy_7610(input, extensionRegistry);
         }
      };

      private S2C_SetAutoBuy_7610(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SetAutoBuy_7610() {
         this.memoizedIsInitialized = -1;
         this.autoInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SetAutoBuy_7610();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SetAutoBuy_7610(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.autoInfo_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.autoInfo_.add(input.readMessage(ShopMsg.AutoInfo.PARSER, extensionRegistry));
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
                  this.autoInfo_ = Collections.unmodifiableList(this.autoInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_S2C_SetAutoBuy_7610_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_S2C_SetAutoBuy_7610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SetAutoBuy_7610.class, Builder.class);
      }

      public List<AutoInfo> getAutoInfoList() {
         return this.autoInfo_;
      }

      public List<? extends AutoInfoOrBuilder> getAutoInfoOrBuilderList() {
         return this.autoInfo_;
      }

      public int getAutoInfoCount() {
         return this.autoInfo_.size();
      }

      public AutoInfo getAutoInfo(int index) {
         return (AutoInfo)this.autoInfo_.get(index);
      }

      public AutoInfoOrBuilder getAutoInfoOrBuilder(int index) {
         return (AutoInfoOrBuilder)this.autoInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getAutoInfoCount(); ++i) {
               if (!this.getAutoInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.autoInfo_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.autoInfo_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.autoInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.autoInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SetAutoBuy_7610)) {
            return super.equals(obj);
         } else {
            S2C_SetAutoBuy_7610 other = (S2C_SetAutoBuy_7610)obj;
            if (!this.getAutoInfoList().equals(other.getAutoInfoList())) {
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
            if (this.getAutoInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAutoInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SetAutoBuy_7610 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SetAutoBuy_7610)PARSER.parseFrom(data);
      }

      public static S2C_SetAutoBuy_7610 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SetAutoBuy_7610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SetAutoBuy_7610 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SetAutoBuy_7610)PARSER.parseFrom(data);
      }

      public static S2C_SetAutoBuy_7610 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SetAutoBuy_7610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SetAutoBuy_7610 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SetAutoBuy_7610)PARSER.parseFrom(data);
      }

      public static S2C_SetAutoBuy_7610 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SetAutoBuy_7610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SetAutoBuy_7610 parseFrom(InputStream input) throws IOException {
         return (S2C_SetAutoBuy_7610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SetAutoBuy_7610 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SetAutoBuy_7610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SetAutoBuy_7610 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SetAutoBuy_7610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SetAutoBuy_7610 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SetAutoBuy_7610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SetAutoBuy_7610 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SetAutoBuy_7610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SetAutoBuy_7610 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SetAutoBuy_7610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SetAutoBuy_7610 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SetAutoBuy_7610 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SetAutoBuy_7610> parser() {
         return PARSER;
      }

      public Parser<S2C_SetAutoBuy_7610> getParserForType() {
         return PARSER;
      }

      public S2C_SetAutoBuy_7610 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SetAutoBuy_7610OrBuilder {
         private int bitField0_;
         private List<AutoInfo> autoInfo_;
         private RepeatedFieldBuilderV3<AutoInfo, AutoInfo.Builder, AutoInfoOrBuilder> autoInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_S2C_SetAutoBuy_7610_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_S2C_SetAutoBuy_7610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SetAutoBuy_7610.class, Builder.class);
         }

         private Builder() {
            this.autoInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.autoInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShopMsg.S2C_SetAutoBuy_7610.alwaysUseFieldBuilders) {
               this.getAutoInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.autoInfoBuilder_ == null) {
               this.autoInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.autoInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_S2C_SetAutoBuy_7610_descriptor;
         }

         public S2C_SetAutoBuy_7610 getDefaultInstanceForType() {
            return ShopMsg.S2C_SetAutoBuy_7610.getDefaultInstance();
         }

         public S2C_SetAutoBuy_7610 build() {
            S2C_SetAutoBuy_7610 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SetAutoBuy_7610 buildPartial() {
            S2C_SetAutoBuy_7610 result = new S2C_SetAutoBuy_7610(this);
            int from_bitField0_ = this.bitField0_;
            if (this.autoInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.autoInfo_ = Collections.unmodifiableList(this.autoInfo_);
                  this.bitField0_ &= -2;
               }

               result.autoInfo_ = this.autoInfo_;
            } else {
               result.autoInfo_ = this.autoInfoBuilder_.build();
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
            if (other instanceof S2C_SetAutoBuy_7610) {
               return this.mergeFrom((S2C_SetAutoBuy_7610)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SetAutoBuy_7610 other) {
            if (other == ShopMsg.S2C_SetAutoBuy_7610.getDefaultInstance()) {
               return this;
            } else {
               if (this.autoInfoBuilder_ == null) {
                  if (!other.autoInfo_.isEmpty()) {
                     if (this.autoInfo_.isEmpty()) {
                        this.autoInfo_ = other.autoInfo_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureAutoInfoIsMutable();
                        this.autoInfo_.addAll(other.autoInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.autoInfo_.isEmpty()) {
                  if (this.autoInfoBuilder_.isEmpty()) {
                     this.autoInfoBuilder_.dispose();
                     this.autoInfoBuilder_ = null;
                     this.autoInfo_ = other.autoInfo_;
                     this.bitField0_ &= -2;
                     this.autoInfoBuilder_ = ShopMsg.S2C_SetAutoBuy_7610.alwaysUseFieldBuilders ? this.getAutoInfoFieldBuilder() : null;
                  } else {
                     this.autoInfoBuilder_.addAllMessages(other.autoInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getAutoInfoCount(); ++i) {
               if (!this.getAutoInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SetAutoBuy_7610 parsedMessage = null;

            try {
               parsedMessage = (S2C_SetAutoBuy_7610)ShopMsg.S2C_SetAutoBuy_7610.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SetAutoBuy_7610)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureAutoInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.autoInfo_ = new ArrayList(this.autoInfo_);
               this.bitField0_ |= 1;
            }

         }

         public List<AutoInfo> getAutoInfoList() {
            return this.autoInfoBuilder_ == null ? Collections.unmodifiableList(this.autoInfo_) : this.autoInfoBuilder_.getMessageList();
         }

         public int getAutoInfoCount() {
            return this.autoInfoBuilder_ == null ? this.autoInfo_.size() : this.autoInfoBuilder_.getCount();
         }

         public AutoInfo getAutoInfo(int index) {
            return this.autoInfoBuilder_ == null ? (AutoInfo)this.autoInfo_.get(index) : (AutoInfo)this.autoInfoBuilder_.getMessage(index);
         }

         public Builder setAutoInfo(int index, AutoInfo value) {
            if (this.autoInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAutoInfoIsMutable();
               this.autoInfo_.set(index, value);
               this.onChanged();
            } else {
               this.autoInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAutoInfo(int index, AutoInfo.Builder builderForValue) {
            if (this.autoInfoBuilder_ == null) {
               this.ensureAutoInfoIsMutable();
               this.autoInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.autoInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAutoInfo(AutoInfo value) {
            if (this.autoInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAutoInfoIsMutable();
               this.autoInfo_.add(value);
               this.onChanged();
            } else {
               this.autoInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAutoInfo(int index, AutoInfo value) {
            if (this.autoInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAutoInfoIsMutable();
               this.autoInfo_.add(index, value);
               this.onChanged();
            } else {
               this.autoInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAutoInfo(AutoInfo.Builder builderForValue) {
            if (this.autoInfoBuilder_ == null) {
               this.ensureAutoInfoIsMutable();
               this.autoInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.autoInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAutoInfo(int index, AutoInfo.Builder builderForValue) {
            if (this.autoInfoBuilder_ == null) {
               this.ensureAutoInfoIsMutable();
               this.autoInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.autoInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAutoInfo(Iterable<? extends AutoInfo> values) {
            if (this.autoInfoBuilder_ == null) {
               this.ensureAutoInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.autoInfo_);
               this.onChanged();
            } else {
               this.autoInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAutoInfo() {
            if (this.autoInfoBuilder_ == null) {
               this.autoInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.autoInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeAutoInfo(int index) {
            if (this.autoInfoBuilder_ == null) {
               this.ensureAutoInfoIsMutable();
               this.autoInfo_.remove(index);
               this.onChanged();
            } else {
               this.autoInfoBuilder_.remove(index);
            }

            return this;
         }

         public AutoInfo.Builder getAutoInfoBuilder(int index) {
            return (AutoInfo.Builder)this.getAutoInfoFieldBuilder().getBuilder(index);
         }

         public AutoInfoOrBuilder getAutoInfoOrBuilder(int index) {
            return this.autoInfoBuilder_ == null ? (AutoInfoOrBuilder)this.autoInfo_.get(index) : (AutoInfoOrBuilder)this.autoInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends AutoInfoOrBuilder> getAutoInfoOrBuilderList() {
            return this.autoInfoBuilder_ != null ? this.autoInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.autoInfo_);
         }

         public AutoInfo.Builder addAutoInfoBuilder() {
            return (AutoInfo.Builder)this.getAutoInfoFieldBuilder().addBuilder(ShopMsg.AutoInfo.getDefaultInstance());
         }

         public AutoInfo.Builder addAutoInfoBuilder(int index) {
            return (AutoInfo.Builder)this.getAutoInfoFieldBuilder().addBuilder(index, ShopMsg.AutoInfo.getDefaultInstance());
         }

         public List<AutoInfo.Builder> getAutoInfoBuilderList() {
            return this.getAutoInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<AutoInfo, AutoInfo.Builder, AutoInfoOrBuilder> getAutoInfoFieldBuilder() {
            if (this.autoInfoBuilder_ == null) {
               this.autoInfoBuilder_ = new RepeatedFieldBuilderV3(this.autoInfo_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.autoInfo_ = null;
            }

            return this.autoInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class RecordInfo extends GeneratedMessageV3 implements RecordInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMTYPE_FIELD_NUMBER = 1;
      private int itemType_;
      public static final int ITEMID_FIELD_NUMBER = 2;
      private int itemId_;
      public static final int NUM_FIELD_NUMBER = 3;
      private int num_;
      public static final int TIME_FIELD_NUMBER = 4;
      private int time_;
      private byte memoizedIsInitialized;
      private static final RecordInfo DEFAULT_INSTANCE = new RecordInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<RecordInfo> PARSER = new AbstractParser<RecordInfo>() {
         public RecordInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RecordInfo(input, extensionRegistry);
         }
      };

      private RecordInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RecordInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RecordInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RecordInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.itemType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.itemId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.num_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.time_ = input.readInt32();
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
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_RecordInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_RecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RecordInfo.class, Builder.class);
      }

      public boolean hasItemType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getItemType() {
         return this.itemType_;
      }

      public boolean hasItemId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getItemId() {
         return this.itemId_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public boolean hasTime() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getTime() {
         return this.time_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasItemType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.itemType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.itemId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.num_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.time_);
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
               size += CodedOutputStream.computeInt32Size(1, this.itemType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.itemId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.num_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.time_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RecordInfo)) {
            return super.equals(obj);
         } else {
            RecordInfo other = (RecordInfo)obj;
            if (this.hasItemType() != other.hasItemType()) {
               return false;
            } else if (this.hasItemType() && this.getItemType() != other.getItemType()) {
               return false;
            } else if (this.hasItemId() != other.hasItemId()) {
               return false;
            } else if (this.hasItemId() && this.getItemId() != other.getItemId()) {
               return false;
            } else if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
               return false;
            } else if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
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
            if (this.hasItemType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemType();
            }

            if (this.hasItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemId();
            }

            if (this.hasNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getNum();
            }

            if (this.hasTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RecordInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data);
      }

      public static RecordInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecordInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data);
      }

      public static RecordInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecordInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data);
      }

      public static RecordInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecordInfo parseFrom(InputStream input) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RecordInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RecordInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RecordInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RecordInfo parseFrom(CodedInputStream input) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RecordInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RecordInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RecordInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RecordInfo> parser() {
         return PARSER;
      }

      public Parser<RecordInfo> getParserForType() {
         return PARSER;
      }

      public RecordInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RecordInfoOrBuilder {
         private int bitField0_;
         private int itemType_;
         private int itemId_;
         private int num_;
         private int time_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_RecordInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_RecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RecordInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShopMsg.RecordInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemType_ = 0;
            this.bitField0_ &= -2;
            this.itemId_ = 0;
            this.bitField0_ &= -3;
            this.num_ = 0;
            this.bitField0_ &= -5;
            this.time_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_RecordInfo_descriptor;
         }

         public RecordInfo getDefaultInstanceForType() {
            return ShopMsg.RecordInfo.getDefaultInstance();
         }

         public RecordInfo build() {
            RecordInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RecordInfo buildPartial() {
            RecordInfo result = new RecordInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.itemType_ = this.itemType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.itemId_ = this.itemId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.num_ = this.num_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.time_ = this.time_;
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
            if (other instanceof RecordInfo) {
               return this.mergeFrom((RecordInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RecordInfo other) {
            if (other == ShopMsg.RecordInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasItemType()) {
                  this.setItemType(other.getItemType());
               }

               if (other.hasItemId()) {
                  this.setItemId(other.getItemId());
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               if (other.hasTime()) {
                  this.setTime(other.getTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasItemType()) {
               return false;
            } else if (!this.hasItemId()) {
               return false;
            } else if (!this.hasNum()) {
               return false;
            } else {
               return this.hasTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RecordInfo parsedMessage = null;

            try {
               parsedMessage = (RecordInfo)ShopMsg.RecordInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RecordInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasItemType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getItemType() {
            return this.itemType_;
         }

         public Builder setItemType(int value) {
            this.bitField0_ |= 1;
            this.itemType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemType() {
            this.bitField0_ &= -2;
            this.itemType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasItemId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getItemId() {
            return this.itemId_;
         }

         public Builder setItemId(int value) {
            this.bitField0_ |= 2;
            this.itemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemId() {
            this.bitField0_ &= -3;
            this.itemId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 4;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -5;
            this.num_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTime() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getTime() {
            return this.time_;
         }

         public Builder setTime(int value) {
            this.bitField0_ |= 8;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -9;
            this.time_ = 0;
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

   public static final class ShopRecordInfos extends GeneratedMessageV3 implements ShopRecordInfosOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SHOPID_FIELD_NUMBER = 1;
      private int shopId_;
      public static final int RECORDINFO_FIELD_NUMBER = 2;
      private List<RecordInfo> recordInfo_;
      private byte memoizedIsInitialized;
      private static final ShopRecordInfos DEFAULT_INSTANCE = new ShopRecordInfos();
      /** @deprecated */
      @Deprecated
      public static final Parser<ShopRecordInfos> PARSER = new AbstractParser<ShopRecordInfos>() {
         public ShopRecordInfos parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new ShopRecordInfos(input, extensionRegistry);
         }
      };

      private ShopRecordInfos(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ShopRecordInfos() {
         this.memoizedIsInitialized = -1;
         this.recordInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new ShopRecordInfos();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ShopRecordInfos(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.shopId_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.recordInfo_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.recordInfo_.add(input.readMessage(ShopMsg.RecordInfo.PARSER, extensionRegistry));
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
                  this.recordInfo_ = Collections.unmodifiableList(this.recordInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_ShopRecordInfos_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_ShopRecordInfos_fieldAccessorTable.ensureFieldAccessorsInitialized(ShopRecordInfos.class, Builder.class);
      }

      public boolean hasShopId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getShopId() {
         return this.shopId_;
      }

      public List<RecordInfo> getRecordInfoList() {
         return this.recordInfo_;
      }

      public List<? extends RecordInfoOrBuilder> getRecordInfoOrBuilderList() {
         return this.recordInfo_;
      }

      public int getRecordInfoCount() {
         return this.recordInfo_.size();
      }

      public RecordInfo getRecordInfo(int index) {
         return (RecordInfo)this.recordInfo_.get(index);
      }

      public RecordInfoOrBuilder getRecordInfoOrBuilder(int index) {
         return (RecordInfoOrBuilder)this.recordInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasShopId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRecordInfoCount(); ++i) {
               if (!this.getRecordInfo(i).isInitialized()) {
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
            output.writeInt32(1, this.shopId_);
         }

         for(int i = 0; i < this.recordInfo_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.recordInfo_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.shopId_);
            }

            for(int i = 0; i < this.recordInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.recordInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof ShopRecordInfos)) {
            return super.equals(obj);
         } else {
            ShopRecordInfos other = (ShopRecordInfos)obj;
            if (this.hasShopId() != other.hasShopId()) {
               return false;
            } else if (this.hasShopId() && this.getShopId() != other.getShopId()) {
               return false;
            } else if (!this.getRecordInfoList().equals(other.getRecordInfoList())) {
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
            if (this.hasShopId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getShopId();
            }

            if (this.getRecordInfoCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRecordInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static ShopRecordInfos parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (ShopRecordInfos)PARSER.parseFrom(data);
      }

      public static ShopRecordInfos parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ShopRecordInfos)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ShopRecordInfos parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (ShopRecordInfos)PARSER.parseFrom(data);
      }

      public static ShopRecordInfos parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ShopRecordInfos)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ShopRecordInfos parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (ShopRecordInfos)PARSER.parseFrom(data);
      }

      public static ShopRecordInfos parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ShopRecordInfos)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ShopRecordInfos parseFrom(InputStream input) throws IOException {
         return (ShopRecordInfos)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ShopRecordInfos parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ShopRecordInfos)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static ShopRecordInfos parseDelimitedFrom(InputStream input) throws IOException {
         return (ShopRecordInfos)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static ShopRecordInfos parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ShopRecordInfos)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static ShopRecordInfos parseFrom(CodedInputStream input) throws IOException {
         return (ShopRecordInfos)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ShopRecordInfos parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ShopRecordInfos)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(ShopRecordInfos prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static ShopRecordInfos getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ShopRecordInfos> parser() {
         return PARSER;
      }

      public Parser<ShopRecordInfos> getParserForType() {
         return PARSER;
      }

      public ShopRecordInfos getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ShopRecordInfosOrBuilder {
         private int bitField0_;
         private int shopId_;
         private List<RecordInfo> recordInfo_;
         private RepeatedFieldBuilderV3<RecordInfo, RecordInfo.Builder, RecordInfoOrBuilder> recordInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_ShopRecordInfos_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_ShopRecordInfos_fieldAccessorTable.ensureFieldAccessorsInitialized(ShopRecordInfos.class, Builder.class);
         }

         private Builder() {
            this.recordInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.recordInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShopMsg.ShopRecordInfos.alwaysUseFieldBuilders) {
               this.getRecordInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.shopId_ = 0;
            this.bitField0_ &= -2;
            if (this.recordInfoBuilder_ == null) {
               this.recordInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.recordInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_ShopRecordInfos_descriptor;
         }

         public ShopRecordInfos getDefaultInstanceForType() {
            return ShopMsg.ShopRecordInfos.getDefaultInstance();
         }

         public ShopRecordInfos build() {
            ShopRecordInfos result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public ShopRecordInfos buildPartial() {
            ShopRecordInfos result = new ShopRecordInfos(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.shopId_ = this.shopId_;
               to_bitField0_ |= 1;
            }

            if (this.recordInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.recordInfo_ = Collections.unmodifiableList(this.recordInfo_);
                  this.bitField0_ &= -3;
               }

               result.recordInfo_ = this.recordInfo_;
            } else {
               result.recordInfo_ = this.recordInfoBuilder_.build();
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
            if (other instanceof ShopRecordInfos) {
               return this.mergeFrom((ShopRecordInfos)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ShopRecordInfos other) {
            if (other == ShopMsg.ShopRecordInfos.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasShopId()) {
                  this.setShopId(other.getShopId());
               }

               if (this.recordInfoBuilder_ == null) {
                  if (!other.recordInfo_.isEmpty()) {
                     if (this.recordInfo_.isEmpty()) {
                        this.recordInfo_ = other.recordInfo_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureRecordInfoIsMutable();
                        this.recordInfo_.addAll(other.recordInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.recordInfo_.isEmpty()) {
                  if (this.recordInfoBuilder_.isEmpty()) {
                     this.recordInfoBuilder_.dispose();
                     this.recordInfoBuilder_ = null;
                     this.recordInfo_ = other.recordInfo_;
                     this.bitField0_ &= -3;
                     this.recordInfoBuilder_ = ShopMsg.ShopRecordInfos.alwaysUseFieldBuilders ? this.getRecordInfoFieldBuilder() : null;
                  } else {
                     this.recordInfoBuilder_.addAllMessages(other.recordInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasShopId()) {
               return false;
            } else {
               for(int i = 0; i < this.getRecordInfoCount(); ++i) {
                  if (!this.getRecordInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            ShopRecordInfos parsedMessage = null;

            try {
               parsedMessage = (ShopRecordInfos)ShopMsg.ShopRecordInfos.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (ShopRecordInfos)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasShopId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getShopId() {
            return this.shopId_;
         }

         public Builder setShopId(int value) {
            this.bitField0_ |= 1;
            this.shopId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShopId() {
            this.bitField0_ &= -2;
            this.shopId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRecordInfoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.recordInfo_ = new ArrayList(this.recordInfo_);
               this.bitField0_ |= 2;
            }

         }

         public List<RecordInfo> getRecordInfoList() {
            return this.recordInfoBuilder_ == null ? Collections.unmodifiableList(this.recordInfo_) : this.recordInfoBuilder_.getMessageList();
         }

         public int getRecordInfoCount() {
            return this.recordInfoBuilder_ == null ? this.recordInfo_.size() : this.recordInfoBuilder_.getCount();
         }

         public RecordInfo getRecordInfo(int index) {
            return this.recordInfoBuilder_ == null ? (RecordInfo)this.recordInfo_.get(index) : (RecordInfo)this.recordInfoBuilder_.getMessage(index);
         }

         public Builder setRecordInfo(int index, RecordInfo value) {
            if (this.recordInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordInfoIsMutable();
               this.recordInfo_.set(index, value);
               this.onChanged();
            } else {
               this.recordInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRecordInfo(int index, RecordInfo.Builder builderForValue) {
            if (this.recordInfoBuilder_ == null) {
               this.ensureRecordInfoIsMutable();
               this.recordInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecordInfo(RecordInfo value) {
            if (this.recordInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordInfoIsMutable();
               this.recordInfo_.add(value);
               this.onChanged();
            } else {
               this.recordInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRecordInfo(int index, RecordInfo value) {
            if (this.recordInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordInfoIsMutable();
               this.recordInfo_.add(index, value);
               this.onChanged();
            } else {
               this.recordInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRecordInfo(RecordInfo.Builder builderForValue) {
            if (this.recordInfoBuilder_ == null) {
               this.ensureRecordInfoIsMutable();
               this.recordInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recordInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecordInfo(int index, RecordInfo.Builder builderForValue) {
            if (this.recordInfoBuilder_ == null) {
               this.ensureRecordInfoIsMutable();
               this.recordInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecordInfo(Iterable<? extends RecordInfo> values) {
            if (this.recordInfoBuilder_ == null) {
               this.ensureRecordInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recordInfo_);
               this.onChanged();
            } else {
               this.recordInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRecordInfo() {
            if (this.recordInfoBuilder_ == null) {
               this.recordInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.recordInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeRecordInfo(int index) {
            if (this.recordInfoBuilder_ == null) {
               this.ensureRecordInfoIsMutable();
               this.recordInfo_.remove(index);
               this.onChanged();
            } else {
               this.recordInfoBuilder_.remove(index);
            }

            return this;
         }

         public RecordInfo.Builder getRecordInfoBuilder(int index) {
            return (RecordInfo.Builder)this.getRecordInfoFieldBuilder().getBuilder(index);
         }

         public RecordInfoOrBuilder getRecordInfoOrBuilder(int index) {
            return this.recordInfoBuilder_ == null ? (RecordInfoOrBuilder)this.recordInfo_.get(index) : (RecordInfoOrBuilder)this.recordInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RecordInfoOrBuilder> getRecordInfoOrBuilderList() {
            return this.recordInfoBuilder_ != null ? this.recordInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.recordInfo_);
         }

         public RecordInfo.Builder addRecordInfoBuilder() {
            return (RecordInfo.Builder)this.getRecordInfoFieldBuilder().addBuilder(ShopMsg.RecordInfo.getDefaultInstance());
         }

         public RecordInfo.Builder addRecordInfoBuilder(int index) {
            return (RecordInfo.Builder)this.getRecordInfoFieldBuilder().addBuilder(index, ShopMsg.RecordInfo.getDefaultInstance());
         }

         public List<RecordInfo.Builder> getRecordInfoBuilderList() {
            return this.getRecordInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RecordInfo, RecordInfo.Builder, RecordInfoOrBuilder> getRecordInfoFieldBuilder() {
            if (this.recordInfoBuilder_ == null) {
               this.recordInfoBuilder_ = new RepeatedFieldBuilderV3(this.recordInfo_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.recordInfo_ = null;
            }

            return this.recordInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ShopBuyRecord_7611 extends GeneratedMessageV3 implements C2S_ShopBuyRecord_7611OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SHOPID_FIELD_NUMBER = 1;
      private int shopId_;
      private byte memoizedIsInitialized;
      private static final C2S_ShopBuyRecord_7611 DEFAULT_INSTANCE = new C2S_ShopBuyRecord_7611();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ShopBuyRecord_7611> PARSER = new AbstractParser<C2S_ShopBuyRecord_7611>() {
         public C2S_ShopBuyRecord_7611 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ShopBuyRecord_7611(input, extensionRegistry);
         }
      };

      private C2S_ShopBuyRecord_7611(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ShopBuyRecord_7611() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ShopBuyRecord_7611();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ShopBuyRecord_7611(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.shopId_ = input.readInt32();
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
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_ShopBuyRecord_7611_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_ShopBuyRecord_7611_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopBuyRecord_7611.class, Builder.class);
      }

      public boolean hasShopId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getShopId() {
         return this.shopId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasShopId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.shopId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.shopId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ShopBuyRecord_7611)) {
            return super.equals(obj);
         } else {
            C2S_ShopBuyRecord_7611 other = (C2S_ShopBuyRecord_7611)obj;
            if (this.hasShopId() != other.hasShopId()) {
               return false;
            } else if (this.hasShopId() && this.getShopId() != other.getShopId()) {
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
            if (this.hasShopId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getShopId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ShopBuyRecord_7611 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ShopBuyRecord_7611)PARSER.parseFrom(data);
      }

      public static C2S_ShopBuyRecord_7611 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopBuyRecord_7611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopBuyRecord_7611 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ShopBuyRecord_7611)PARSER.parseFrom(data);
      }

      public static C2S_ShopBuyRecord_7611 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopBuyRecord_7611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopBuyRecord_7611 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ShopBuyRecord_7611)PARSER.parseFrom(data);
      }

      public static C2S_ShopBuyRecord_7611 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopBuyRecord_7611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopBuyRecord_7611 parseFrom(InputStream input) throws IOException {
         return (C2S_ShopBuyRecord_7611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopBuyRecord_7611 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopBuyRecord_7611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopBuyRecord_7611 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ShopBuyRecord_7611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ShopBuyRecord_7611 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopBuyRecord_7611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopBuyRecord_7611 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ShopBuyRecord_7611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopBuyRecord_7611 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopBuyRecord_7611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ShopBuyRecord_7611 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ShopBuyRecord_7611 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ShopBuyRecord_7611> parser() {
         return PARSER;
      }

      public Parser<C2S_ShopBuyRecord_7611> getParserForType() {
         return PARSER;
      }

      public C2S_ShopBuyRecord_7611 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ShopBuyRecord_7611OrBuilder {
         private int bitField0_;
         private int shopId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_ShopBuyRecord_7611_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_ShopBuyRecord_7611_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopBuyRecord_7611.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShopMsg.C2S_ShopBuyRecord_7611.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.shopId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_C2S_ShopBuyRecord_7611_descriptor;
         }

         public C2S_ShopBuyRecord_7611 getDefaultInstanceForType() {
            return ShopMsg.C2S_ShopBuyRecord_7611.getDefaultInstance();
         }

         public C2S_ShopBuyRecord_7611 build() {
            C2S_ShopBuyRecord_7611 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ShopBuyRecord_7611 buildPartial() {
            C2S_ShopBuyRecord_7611 result = new C2S_ShopBuyRecord_7611(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.shopId_ = this.shopId_;
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
            if (other instanceof C2S_ShopBuyRecord_7611) {
               return this.mergeFrom((C2S_ShopBuyRecord_7611)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ShopBuyRecord_7611 other) {
            if (other == ShopMsg.C2S_ShopBuyRecord_7611.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasShopId()) {
                  this.setShopId(other.getShopId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasShopId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ShopBuyRecord_7611 parsedMessage = null;

            try {
               parsedMessage = (C2S_ShopBuyRecord_7611)ShopMsg.C2S_ShopBuyRecord_7611.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ShopBuyRecord_7611)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasShopId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getShopId() {
            return this.shopId_;
         }

         public Builder setShopId(int value) {
            this.bitField0_ |= 1;
            this.shopId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShopId() {
            this.bitField0_ &= -2;
            this.shopId_ = 0;
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

   public static final class S2C_ShopBuyRecord_7612 extends GeneratedMessageV3 implements S2C_ShopBuyRecord_7612OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECORDS_FIELD_NUMBER = 1;
      private List<ShopRecordInfos> records_;
      private byte memoizedIsInitialized;
      private static final S2C_ShopBuyRecord_7612 DEFAULT_INSTANCE = new S2C_ShopBuyRecord_7612();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ShopBuyRecord_7612> PARSER = new AbstractParser<S2C_ShopBuyRecord_7612>() {
         public S2C_ShopBuyRecord_7612 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ShopBuyRecord_7612(input, extensionRegistry);
         }
      };

      private S2C_ShopBuyRecord_7612(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ShopBuyRecord_7612() {
         this.memoizedIsInitialized = -1;
         this.records_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ShopBuyRecord_7612();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ShopBuyRecord_7612(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.records_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.records_.add(input.readMessage(ShopMsg.ShopRecordInfos.PARSER, extensionRegistry));
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
                  this.records_ = Collections.unmodifiableList(this.records_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_S2C_ShopBuyRecord_7612_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ShopMsg.internal_static_shop_com_gzbz_protobuf_S2C_ShopBuyRecord_7612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopBuyRecord_7612.class, Builder.class);
      }

      public List<ShopRecordInfos> getRecordsList() {
         return this.records_;
      }

      public List<? extends ShopRecordInfosOrBuilder> getRecordsOrBuilderList() {
         return this.records_;
      }

      public int getRecordsCount() {
         return this.records_.size();
      }

      public ShopRecordInfos getRecords(int index) {
         return (ShopRecordInfos)this.records_.get(index);
      }

      public ShopRecordInfosOrBuilder getRecordsOrBuilder(int index) {
         return (ShopRecordInfosOrBuilder)this.records_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getRecordsCount(); ++i) {
               if (!this.getRecords(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.records_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.records_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.records_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.records_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ShopBuyRecord_7612)) {
            return super.equals(obj);
         } else {
            S2C_ShopBuyRecord_7612 other = (S2C_ShopBuyRecord_7612)obj;
            if (!this.getRecordsList().equals(other.getRecordsList())) {
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
            if (this.getRecordsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecordsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ShopBuyRecord_7612 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ShopBuyRecord_7612)PARSER.parseFrom(data);
      }

      public static S2C_ShopBuyRecord_7612 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopBuyRecord_7612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopBuyRecord_7612 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ShopBuyRecord_7612)PARSER.parseFrom(data);
      }

      public static S2C_ShopBuyRecord_7612 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopBuyRecord_7612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopBuyRecord_7612 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ShopBuyRecord_7612)PARSER.parseFrom(data);
      }

      public static S2C_ShopBuyRecord_7612 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopBuyRecord_7612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopBuyRecord_7612 parseFrom(InputStream input) throws IOException {
         return (S2C_ShopBuyRecord_7612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopBuyRecord_7612 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopBuyRecord_7612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopBuyRecord_7612 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ShopBuyRecord_7612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ShopBuyRecord_7612 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopBuyRecord_7612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopBuyRecord_7612 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ShopBuyRecord_7612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopBuyRecord_7612 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopBuyRecord_7612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ShopBuyRecord_7612 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ShopBuyRecord_7612 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ShopBuyRecord_7612> parser() {
         return PARSER;
      }

      public Parser<S2C_ShopBuyRecord_7612> getParserForType() {
         return PARSER;
      }

      public S2C_ShopBuyRecord_7612 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ShopBuyRecord_7612OrBuilder {
         private int bitField0_;
         private List<ShopRecordInfos> records_;
         private RepeatedFieldBuilderV3<ShopRecordInfos, ShopRecordInfos.Builder, ShopRecordInfosOrBuilder> recordsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_S2C_ShopBuyRecord_7612_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_S2C_ShopBuyRecord_7612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopBuyRecord_7612.class, Builder.class);
         }

         private Builder() {
            this.records_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.records_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ShopMsg.S2C_ShopBuyRecord_7612.alwaysUseFieldBuilders) {
               this.getRecordsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.recordsBuilder_ == null) {
               this.records_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.recordsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ShopMsg.internal_static_shop_com_gzbz_protobuf_S2C_ShopBuyRecord_7612_descriptor;
         }

         public S2C_ShopBuyRecord_7612 getDefaultInstanceForType() {
            return ShopMsg.S2C_ShopBuyRecord_7612.getDefaultInstance();
         }

         public S2C_ShopBuyRecord_7612 build() {
            S2C_ShopBuyRecord_7612 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ShopBuyRecord_7612 buildPartial() {
            S2C_ShopBuyRecord_7612 result = new S2C_ShopBuyRecord_7612(this);
            int from_bitField0_ = this.bitField0_;
            if (this.recordsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.records_ = Collections.unmodifiableList(this.records_);
                  this.bitField0_ &= -2;
               }

               result.records_ = this.records_;
            } else {
               result.records_ = this.recordsBuilder_.build();
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
            if (other instanceof S2C_ShopBuyRecord_7612) {
               return this.mergeFrom((S2C_ShopBuyRecord_7612)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ShopBuyRecord_7612 other) {
            if (other == ShopMsg.S2C_ShopBuyRecord_7612.getDefaultInstance()) {
               return this;
            } else {
               if (this.recordsBuilder_ == null) {
                  if (!other.records_.isEmpty()) {
                     if (this.records_.isEmpty()) {
                        this.records_ = other.records_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureRecordsIsMutable();
                        this.records_.addAll(other.records_);
                     }

                     this.onChanged();
                  }
               } else if (!other.records_.isEmpty()) {
                  if (this.recordsBuilder_.isEmpty()) {
                     this.recordsBuilder_.dispose();
                     this.recordsBuilder_ = null;
                     this.records_ = other.records_;
                     this.bitField0_ &= -2;
                     this.recordsBuilder_ = ShopMsg.S2C_ShopBuyRecord_7612.alwaysUseFieldBuilders ? this.getRecordsFieldBuilder() : null;
                  } else {
                     this.recordsBuilder_.addAllMessages(other.records_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getRecordsCount(); ++i) {
               if (!this.getRecords(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ShopBuyRecord_7612 parsedMessage = null;

            try {
               parsedMessage = (S2C_ShopBuyRecord_7612)ShopMsg.S2C_ShopBuyRecord_7612.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ShopBuyRecord_7612)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRecordsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.records_ = new ArrayList(this.records_);
               this.bitField0_ |= 1;
            }

         }

         public List<ShopRecordInfos> getRecordsList() {
            return this.recordsBuilder_ == null ? Collections.unmodifiableList(this.records_) : this.recordsBuilder_.getMessageList();
         }

         public int getRecordsCount() {
            return this.recordsBuilder_ == null ? this.records_.size() : this.recordsBuilder_.getCount();
         }

         public ShopRecordInfos getRecords(int index) {
            return this.recordsBuilder_ == null ? (ShopRecordInfos)this.records_.get(index) : (ShopRecordInfos)this.recordsBuilder_.getMessage(index);
         }

         public Builder setRecords(int index, ShopRecordInfos value) {
            if (this.recordsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordsIsMutable();
               this.records_.set(index, value);
               this.onChanged();
            } else {
               this.recordsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRecords(int index, ShopRecordInfos.Builder builderForValue) {
            if (this.recordsBuilder_ == null) {
               this.ensureRecordsIsMutable();
               this.records_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecords(ShopRecordInfos value) {
            if (this.recordsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordsIsMutable();
               this.records_.add(value);
               this.onChanged();
            } else {
               this.recordsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRecords(int index, ShopRecordInfos value) {
            if (this.recordsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordsIsMutable();
               this.records_.add(index, value);
               this.onChanged();
            } else {
               this.recordsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRecords(ShopRecordInfos.Builder builderForValue) {
            if (this.recordsBuilder_ == null) {
               this.ensureRecordsIsMutable();
               this.records_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recordsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecords(int index, ShopRecordInfos.Builder builderForValue) {
            if (this.recordsBuilder_ == null) {
               this.ensureRecordsIsMutable();
               this.records_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecords(Iterable<? extends ShopRecordInfos> values) {
            if (this.recordsBuilder_ == null) {
               this.ensureRecordsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.records_);
               this.onChanged();
            } else {
               this.recordsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRecords() {
            if (this.recordsBuilder_ == null) {
               this.records_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.recordsBuilder_.clear();
            }

            return this;
         }

         public Builder removeRecords(int index) {
            if (this.recordsBuilder_ == null) {
               this.ensureRecordsIsMutable();
               this.records_.remove(index);
               this.onChanged();
            } else {
               this.recordsBuilder_.remove(index);
            }

            return this;
         }

         public ShopRecordInfos.Builder getRecordsBuilder(int index) {
            return (ShopRecordInfos.Builder)this.getRecordsFieldBuilder().getBuilder(index);
         }

         public ShopRecordInfosOrBuilder getRecordsOrBuilder(int index) {
            return this.recordsBuilder_ == null ? (ShopRecordInfosOrBuilder)this.records_.get(index) : (ShopRecordInfosOrBuilder)this.recordsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ShopRecordInfosOrBuilder> getRecordsOrBuilderList() {
            return this.recordsBuilder_ != null ? this.recordsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.records_);
         }

         public ShopRecordInfos.Builder addRecordsBuilder() {
            return (ShopRecordInfos.Builder)this.getRecordsFieldBuilder().addBuilder(ShopMsg.ShopRecordInfos.getDefaultInstance());
         }

         public ShopRecordInfos.Builder addRecordsBuilder(int index) {
            return (ShopRecordInfos.Builder)this.getRecordsFieldBuilder().addBuilder(index, ShopMsg.ShopRecordInfos.getDefaultInstance());
         }

         public List<ShopRecordInfos.Builder> getRecordsBuilderList() {
            return this.getRecordsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ShopRecordInfos, ShopRecordInfos.Builder, ShopRecordInfosOrBuilder> getRecordsFieldBuilder() {
            if (this.recordsBuilder_ == null) {
               this.recordsBuilder_ = new RepeatedFieldBuilderV3(this.records_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.records_ = null;
            }

            return this.recordsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface AutoInfoOrBuilder extends MessageOrBuilder {
      boolean hasShopId();

      int getShopId();

      List<Integer> getIdList();

      int getIdCount();

      int getId(int index);
   }

   public interface BuyItemOrBuilder extends MessageOrBuilder {
      boolean hasBuyId();

      int getBuyId();

      boolean hasBuyNum();

      int getBuyNum();
   }

   public interface C2S_AutoInfo_7607OrBuilder extends MessageOrBuilder {
      boolean hasShopId();

      int getShopId();
   }

   public interface C2S_BuyItem_7605OrBuilder extends MessageOrBuilder {
      boolean hasShopId();

      int getShopId();

      boolean hasId();

      int getId();

      boolean hasNum();

      int getNum();
   }

   public interface C2S_Refresh_7603OrBuilder extends MessageOrBuilder {
      boolean hasShopId();

      int getShopId();

      boolean hasAutoBuy();

      boolean getAutoBuy();
   }

   public interface C2S_SetAutoBuy_7609OrBuilder extends MessageOrBuilder {
      boolean hasShopId();

      int getShopId();

      List<Integer> getIdList();

      int getIdCount();

      int getId(int index);
   }

   public interface C2S_ShopBuyRecord_7611OrBuilder extends MessageOrBuilder {
      boolean hasShopId();

      int getShopId();
   }

   public interface C2S_ShopData_7601OrBuilder extends MessageOrBuilder {
      boolean hasShopId();

      int getShopId();
   }

   public interface RecordInfoOrBuilder extends MessageOrBuilder {
      boolean hasItemType();

      int getItemType();

      boolean hasItemId();

      int getItemId();

      boolean hasNum();

      int getNum();

      boolean hasTime();

      int getTime();
   }

   public interface S2C_BuyItem_7606OrBuilder extends MessageOrBuilder {
      boolean hasShopId();

      int getShopId();

      boolean hasId();

      int getId();

      boolean hasRestNum();

      int getRestNum();
   }

   public interface S2C_SetAutoBuy_7610OrBuilder extends MessageOrBuilder {
      List<AutoInfo> getAutoInfoList();

      AutoInfo getAutoInfo(int index);

      int getAutoInfoCount();

      List<? extends AutoInfoOrBuilder> getAutoInfoOrBuilderList();

      AutoInfoOrBuilder getAutoInfoOrBuilder(int index);
   }

   public interface S2C_ShopBuyRecord_7612OrBuilder extends MessageOrBuilder {
      List<ShopRecordInfos> getRecordsList();

      ShopRecordInfos getRecords(int index);

      int getRecordsCount();

      List<? extends ShopRecordInfosOrBuilder> getRecordsOrBuilderList();

      ShopRecordInfosOrBuilder getRecordsOrBuilder(int index);
   }

   public interface S2C_ShopData_7602OrBuilder extends MessageOrBuilder {
      boolean hasShopId();

      int getShopId();

      List<Shop_Item> getItemList();

      Shop_Item getItem(int index);

      int getItemCount();

      List<? extends Shop_ItemOrBuilder> getItemOrBuilderList();

      Shop_ItemOrBuilder getItemOrBuilder(int index);

      boolean hasTotalTimes();

      int getTotalTimes();

      boolean hasRefreshTimes();

      long getRefreshTimes();

      boolean hasOpType();

      int getOpType();

      boolean hasUseFreeTime();

      int getUseFreeTime();
   }

   public interface ShopRecordInfosOrBuilder extends MessageOrBuilder {
      boolean hasShopId();

      int getShopId();

      List<RecordInfo> getRecordInfoList();

      RecordInfo getRecordInfo(int index);

      int getRecordInfoCount();

      List<? extends RecordInfoOrBuilder> getRecordInfoOrBuilderList();

      RecordInfoOrBuilder getRecordInfoOrBuilder(int index);
   }

   public interface Shop_ItemOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasRestNum();

      int getRestNum();
   }
}
