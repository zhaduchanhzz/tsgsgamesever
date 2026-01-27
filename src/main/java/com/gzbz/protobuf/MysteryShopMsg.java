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

public final class MysteryShopMsg {
   private static final Descriptors.Descriptor internal_static_mysteryshop_com_gzbz_protobuf_MysteryShopItem_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mysteryshop_com_gzbz_protobuf_MysteryShopItem_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mysteryshop_com_gzbz_protobuf_RecordInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mysteryshop_com_gzbz_protobuf_RecordInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mysteryshop_com_gzbz_protobuf_C2S_MysteryShopData_7301_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mysteryshop_com_gzbz_protobuf_C2S_MysteryShopData_7301_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mysteryshop_com_gzbz_protobuf_S2C_MysteryShopData_7302_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mysteryshop_com_gzbz_protobuf_S2C_MysteryShopData_7302_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mysteryshop_com_gzbz_protobuf_C2S_Refresh_7303_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mysteryshop_com_gzbz_protobuf_C2S_Refresh_7303_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mysteryshop_com_gzbz_protobuf_C2S_BuyItem_7305_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mysteryshop_com_gzbz_protobuf_C2S_BuyItem_7305_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mysteryshop_com_gzbz_protobuf_S2C_BuyItem_7306_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mysteryshop_com_gzbz_protobuf_S2C_BuyItem_7306_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mysteryshop_com_gzbz_protobuf_C2S_AutoBuyIds_7307_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mysteryshop_com_gzbz_protobuf_C2S_AutoBuyIds_7307_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mysteryshop_com_gzbz_protobuf_S2C_AutoBuyIds_7308_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mysteryshop_com_gzbz_protobuf_S2C_AutoBuyIds_7308_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mysteryshop_com_gzbz_protobuf_C2S_Record_7309_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mysteryshop_com_gzbz_protobuf_C2S_Record_7309_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mysteryshop_com_gzbz_protobuf_S2C_Record_7310_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mysteryshop_com_gzbz_protobuf_S2C_Record_7310_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private MysteryShopMsg() {
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
      String[] descriptorData = new String[]{"\n\u0011MysteryShop.proto\u0012\u001dmysteryshop.com.gzbz.protobuf\"\u0088\u0002\n\u000fMysteryShopItem\u0012\u000b\n\u0003idx\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bitemType\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006itemId\u0018\u0003 \u0002(\u0005\u0012\u0012\n\ncombineNum\u0018\u0004 \u0002(\u0005\u0012\u000f\n\u0007restNum\u0018\u0005 \u0002(\u0005\u0012\u0014\n\fresourceType\u0018\u0006 \u0002(\u0005\u0012\u0012\n\nresourceId\u0018\u0007 \u0002(\u0005\u0012\u0010\n\boriPrice\u0018\b \u0002(\u0005\u0012\u0010\n\bdisPrice\u0018\t \u0002(\u0005\u0012\u0011\n\trecommend\u0018\n \u0002(\u0005\u0012\u0010\n\bvipLimit\u0018\u000b \u0002(\u0005\u0012\u000f\n\u0007discont\u0018\f \u0002(\u0005\u0012\u0011\n\ttimeLimit\u0018\r \u0002(\b\u0012\n\n\u0002id\u0018\u000e \u0002(\u0005\"I\n\nRecordInfo\u0012\u0010\n\bitemType\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006itemId\u0018\u0002 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004time\u0018\u0004 \u0002(\u0005\",\n\u0018C2S_MysteryShopData_7301\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\"\u009a\u0001\n\u0018S2C_MysteryShopData_7302\u0012\u0015\n\rusedFreeTimes\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ntotalTimes\u0018\u0002 \u0002(\u0005\u0012\u0014\n\frefreshTimes\u0018\u0003 \u0002(\u0003\u0012=\n\u0005items\u0018\u0004 \u0003(\u000b2..mysteryshop.com.gzbz.protobuf.MysteryShopItem\"5\n\u0010C2S_Refresh_7303\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007autoBuy\u0018\u0002 \u0001(\b\"a\n\u0010C2S_BuyItem_7305\u0012\u000b\n\u0003idx\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bitemType\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006itemId\u0018\u0003 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0004 \u0002(\u0005\u0012\u0011\n\tguideStep\u0018\u0005 \u0001(\u0005\"0\n\u0010S2C_BuyItem_7306\u0012\u000b\n\u0003idx\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007restNum\u0018\u0002 \u0002(\u0005\"\"\n\u0013C2S_AutoBuyIds_7307\u0012\u000b\n\u0003idx\u0018\u0001 \u0003(\u0005\"\"\n\u0013S2C_AutoBuyIds_7308\u0012\u000b\n\u0003idx\u0018\u0001 \u0003(\u0005\"\u0011\n\u000fC2S_Record_7309\"J\n\u000fS2C_Record_7310\u00127\n\u0004info\u0018\u0001 \u0003(\u000b2).mysteryshop.com.gzbz.protobuf.RecordInfoB%\n\u0011com.gzbz.protobufB\u000eMysteryShopMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_mysteryshop_com_gzbz_protobuf_MysteryShopItem_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_mysteryshop_com_gzbz_protobuf_MysteryShopItem_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mysteryshop_com_gzbz_protobuf_MysteryShopItem_descriptor, new String[]{"Idx", "ItemType", "ItemId", "CombineNum", "RestNum", "ResourceType", "ResourceId", "OriPrice", "DisPrice", "Recommend", "VipLimit", "Discont", "TimeLimit", "Id"});
      internal_static_mysteryshop_com_gzbz_protobuf_RecordInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_mysteryshop_com_gzbz_protobuf_RecordInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mysteryshop_com_gzbz_protobuf_RecordInfo_descriptor, new String[]{"ItemType", "ItemId", "Num", "Time"});
      internal_static_mysteryshop_com_gzbz_protobuf_C2S_MysteryShopData_7301_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_mysteryshop_com_gzbz_protobuf_C2S_MysteryShopData_7301_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mysteryshop_com_gzbz_protobuf_C2S_MysteryShopData_7301_descriptor, new String[]{"PlayerId"});
      internal_static_mysteryshop_com_gzbz_protobuf_S2C_MysteryShopData_7302_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_mysteryshop_com_gzbz_protobuf_S2C_MysteryShopData_7302_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mysteryshop_com_gzbz_protobuf_S2C_MysteryShopData_7302_descriptor, new String[]{"UsedFreeTimes", "TotalTimes", "RefreshTimes", "Items"});
      internal_static_mysteryshop_com_gzbz_protobuf_C2S_Refresh_7303_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_mysteryshop_com_gzbz_protobuf_C2S_Refresh_7303_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mysteryshop_com_gzbz_protobuf_C2S_Refresh_7303_descriptor, new String[]{"PlayerId", "AutoBuy"});
      internal_static_mysteryshop_com_gzbz_protobuf_C2S_BuyItem_7305_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_mysteryshop_com_gzbz_protobuf_C2S_BuyItem_7305_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mysteryshop_com_gzbz_protobuf_C2S_BuyItem_7305_descriptor, new String[]{"Idx", "ItemType", "ItemId", "Num", "GuideStep"});
      internal_static_mysteryshop_com_gzbz_protobuf_S2C_BuyItem_7306_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_mysteryshop_com_gzbz_protobuf_S2C_BuyItem_7306_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mysteryshop_com_gzbz_protobuf_S2C_BuyItem_7306_descriptor, new String[]{"Idx", "RestNum"});
      internal_static_mysteryshop_com_gzbz_protobuf_C2S_AutoBuyIds_7307_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_mysteryshop_com_gzbz_protobuf_C2S_AutoBuyIds_7307_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mysteryshop_com_gzbz_protobuf_C2S_AutoBuyIds_7307_descriptor, new String[]{"Idx"});
      internal_static_mysteryshop_com_gzbz_protobuf_S2C_AutoBuyIds_7308_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_mysteryshop_com_gzbz_protobuf_S2C_AutoBuyIds_7308_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mysteryshop_com_gzbz_protobuf_S2C_AutoBuyIds_7308_descriptor, new String[]{"Idx"});
      internal_static_mysteryshop_com_gzbz_protobuf_C2S_Record_7309_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_mysteryshop_com_gzbz_protobuf_C2S_Record_7309_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mysteryshop_com_gzbz_protobuf_C2S_Record_7309_descriptor, new String[0]);
      internal_static_mysteryshop_com_gzbz_protobuf_S2C_Record_7310_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_mysteryshop_com_gzbz_protobuf_S2C_Record_7310_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mysteryshop_com_gzbz_protobuf_S2C_Record_7310_descriptor, new String[]{"Info"});
   }

   public static final class MysteryShopItem extends GeneratedMessageV3 implements MysteryShopItemOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int IDX_FIELD_NUMBER = 1;
      private int idx_;
      public static final int ITEMTYPE_FIELD_NUMBER = 2;
      private int itemType_;
      public static final int ITEMID_FIELD_NUMBER = 3;
      private int itemId_;
      public static final int COMBINENUM_FIELD_NUMBER = 4;
      private int combineNum_;
      public static final int RESTNUM_FIELD_NUMBER = 5;
      private int restNum_;
      public static final int RESOURCETYPE_FIELD_NUMBER = 6;
      private int resourceType_;
      public static final int RESOURCEID_FIELD_NUMBER = 7;
      private int resourceId_;
      public static final int ORIPRICE_FIELD_NUMBER = 8;
      private int oriPrice_;
      public static final int DISPRICE_FIELD_NUMBER = 9;
      private int disPrice_;
      public static final int RECOMMEND_FIELD_NUMBER = 10;
      private int recommend_;
      public static final int VIPLIMIT_FIELD_NUMBER = 11;
      private int vipLimit_;
      public static final int DISCONT_FIELD_NUMBER = 12;
      private int discont_;
      public static final int TIMELIMIT_FIELD_NUMBER = 13;
      private boolean timeLimit_;
      public static final int ID_FIELD_NUMBER = 14;
      private int id_;
      private byte memoizedIsInitialized;
      private static final MysteryShopItem DEFAULT_INSTANCE = new MysteryShopItem();
      /** @deprecated */
      @Deprecated
      public static final Parser<MysteryShopItem> PARSER = new AbstractParser<MysteryShopItem>() {
         public MysteryShopItem parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysteryShopItem(input, extensionRegistry);
         }
      };

      private MysteryShopItem(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private MysteryShopItem() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new MysteryShopItem();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private MysteryShopItem(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.idx_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.itemType_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.itemId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.combineNum_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.restNum_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.resourceType_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.resourceId_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.oriPrice_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.disPrice_ = input.readInt32();
                        break;
                     case 80:
                        this.bitField0_ |= 512;
                        this.recommend_ = input.readInt32();
                        break;
                     case 88:
                        this.bitField0_ |= 1024;
                        this.vipLimit_ = input.readInt32();
                        break;
                     case 96:
                        this.bitField0_ |= 2048;
                        this.discont_ = input.readInt32();
                        break;
                     case 104:
                        this.bitField0_ |= 4096;
                        this.timeLimit_ = input.readBool();
                        break;
                     case 112:
                        this.bitField0_ |= 8192;
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
         return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_MysteryShopItem_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_MysteryShopItem_fieldAccessorTable.ensureFieldAccessorsInitialized(MysteryShopItem.class, Builder.class);
      }

      public boolean hasIdx() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getIdx() {
         return this.idx_;
      }

      public boolean hasItemType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getItemType() {
         return this.itemType_;
      }

      public boolean hasItemId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getItemId() {
         return this.itemId_;
      }

      public boolean hasCombineNum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getCombineNum() {
         return this.combineNum_;
      }

      public boolean hasRestNum() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getRestNum() {
         return this.restNum_;
      }

      public boolean hasResourceType() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getResourceType() {
         return this.resourceType_;
      }

      public boolean hasResourceId() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getResourceId() {
         return this.resourceId_;
      }

      public boolean hasOriPrice() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getOriPrice() {
         return this.oriPrice_;
      }

      public boolean hasDisPrice() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getDisPrice() {
         return this.disPrice_;
      }

      public boolean hasRecommend() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getRecommend() {
         return this.recommend_;
      }

      public boolean hasVipLimit() {
         return (this.bitField0_ & 1024) != 0;
      }

      public int getVipLimit() {
         return this.vipLimit_;
      }

      public boolean hasDiscont() {
         return (this.bitField0_ & 2048) != 0;
      }

      public int getDiscont() {
         return this.discont_;
      }

      public boolean hasTimeLimit() {
         return (this.bitField0_ & 4096) != 0;
      }

      public boolean getTimeLimit() {
         return this.timeLimit_;
      }

      public boolean hasId() {
         return (this.bitField0_ & 8192) != 0;
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
         } else if (!this.hasIdx()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasItemType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCombineNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRestNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResourceType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResourceId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOriPrice()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDisPrice()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecommend()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasVipLimit()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDiscont()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTimeLimit()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.idx_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.itemType_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.itemId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.combineNum_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.restNum_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.resourceType_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.resourceId_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.oriPrice_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.disPrice_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(10, this.recommend_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeInt32(11, this.vipLimit_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            output.writeInt32(12, this.discont_);
         }

         if ((this.bitField0_ & 4096) != 0) {
            output.writeBool(13, this.timeLimit_);
         }

         if ((this.bitField0_ & 8192) != 0) {
            output.writeInt32(14, this.id_);
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
               size += CodedOutputStream.computeInt32Size(1, this.idx_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.itemType_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.itemId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.combineNum_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.restNum_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.resourceType_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.resourceId_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.oriPrice_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.disPrice_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.recommend_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.vipLimit_);
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += CodedOutputStream.computeInt32Size(12, this.discont_);
            }

            if ((this.bitField0_ & 4096) != 0) {
               size += CodedOutputStream.computeBoolSize(13, this.timeLimit_);
            }

            if ((this.bitField0_ & 8192) != 0) {
               size += CodedOutputStream.computeInt32Size(14, this.id_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MysteryShopItem)) {
            return super.equals(obj);
         } else {
            MysteryShopItem other = (MysteryShopItem)obj;
            if (this.hasIdx() != other.hasIdx()) {
               return false;
            } else if (this.hasIdx() && this.getIdx() != other.getIdx()) {
               return false;
            } else if (this.hasItemType() != other.hasItemType()) {
               return false;
            } else if (this.hasItemType() && this.getItemType() != other.getItemType()) {
               return false;
            } else if (this.hasItemId() != other.hasItemId()) {
               return false;
            } else if (this.hasItemId() && this.getItemId() != other.getItemId()) {
               return false;
            } else if (this.hasCombineNum() != other.hasCombineNum()) {
               return false;
            } else if (this.hasCombineNum() && this.getCombineNum() != other.getCombineNum()) {
               return false;
            } else if (this.hasRestNum() != other.hasRestNum()) {
               return false;
            } else if (this.hasRestNum() && this.getRestNum() != other.getRestNum()) {
               return false;
            } else if (this.hasResourceType() != other.hasResourceType()) {
               return false;
            } else if (this.hasResourceType() && this.getResourceType() != other.getResourceType()) {
               return false;
            } else if (this.hasResourceId() != other.hasResourceId()) {
               return false;
            } else if (this.hasResourceId() && this.getResourceId() != other.getResourceId()) {
               return false;
            } else if (this.hasOriPrice() != other.hasOriPrice()) {
               return false;
            } else if (this.hasOriPrice() && this.getOriPrice() != other.getOriPrice()) {
               return false;
            } else if (this.hasDisPrice() != other.hasDisPrice()) {
               return false;
            } else if (this.hasDisPrice() && this.getDisPrice() != other.getDisPrice()) {
               return false;
            } else if (this.hasRecommend() != other.hasRecommend()) {
               return false;
            } else if (this.hasRecommend() && this.getRecommend() != other.getRecommend()) {
               return false;
            } else if (this.hasVipLimit() != other.hasVipLimit()) {
               return false;
            } else if (this.hasVipLimit() && this.getVipLimit() != other.getVipLimit()) {
               return false;
            } else if (this.hasDiscont() != other.hasDiscont()) {
               return false;
            } else if (this.hasDiscont() && this.getDiscont() != other.getDiscont()) {
               return false;
            } else if (this.hasTimeLimit() != other.hasTimeLimit()) {
               return false;
            } else if (this.hasTimeLimit() && this.getTimeLimit() != other.getTimeLimit()) {
               return false;
            } else if (this.hasId() != other.hasId()) {
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
            if (this.hasIdx()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIdx();
            }

            if (this.hasItemType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemType();
            }

            if (this.hasItemId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getItemId();
            }

            if (this.hasCombineNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getCombineNum();
            }

            if (this.hasRestNum()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getRestNum();
            }

            if (this.hasResourceType()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getResourceType();
            }

            if (this.hasResourceId()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getResourceId();
            }

            if (this.hasOriPrice()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getOriPrice();
            }

            if (this.hasDisPrice()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getDisPrice();
            }

            if (this.hasRecommend()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getRecommend();
            }

            if (this.hasVipLimit()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getVipLimit();
            }

            if (this.hasDiscont()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getDiscont();
            }

            if (this.hasTimeLimit()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + Internal.hashBoolean(this.getTimeLimit());
            }

            if (this.hasId()) {
               hash = 37 * hash + 14;
               hash = 53 * hash + this.getId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MysteryShopItem parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MysteryShopItem)PARSER.parseFrom(data);
      }

      public static MysteryShopItem parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MysteryShopItem)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MysteryShopItem parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MysteryShopItem)PARSER.parseFrom(data);
      }

      public static MysteryShopItem parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MysteryShopItem)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MysteryShopItem parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MysteryShopItem)PARSER.parseFrom(data);
      }

      public static MysteryShopItem parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MysteryShopItem)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MysteryShopItem parseFrom(InputStream input) throws IOException {
         return (MysteryShopItem)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MysteryShopItem parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MysteryShopItem)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MysteryShopItem parseDelimitedFrom(InputStream input) throws IOException {
         return (MysteryShopItem)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MysteryShopItem parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MysteryShopItem)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MysteryShopItem parseFrom(CodedInputStream input) throws IOException {
         return (MysteryShopItem)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MysteryShopItem parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MysteryShopItem)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(MysteryShopItem prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static MysteryShopItem getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MysteryShopItem> parser() {
         return PARSER;
      }

      public Parser<MysteryShopItem> getParserForType() {
         return PARSER;
      }

      public MysteryShopItem getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MysteryShopItemOrBuilder {
         private int bitField0_;
         private int idx_;
         private int itemType_;
         private int itemId_;
         private int combineNum_;
         private int restNum_;
         private int resourceType_;
         private int resourceId_;
         private int oriPrice_;
         private int disPrice_;
         private int recommend_;
         private int vipLimit_;
         private int discont_;
         private boolean timeLimit_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_MysteryShopItem_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_MysteryShopItem_fieldAccessorTable.ensureFieldAccessorsInitialized(MysteryShopItem.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MysteryShopMsg.MysteryShopItem.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.idx_ = 0;
            this.bitField0_ &= -2;
            this.itemType_ = 0;
            this.bitField0_ &= -3;
            this.itemId_ = 0;
            this.bitField0_ &= -5;
            this.combineNum_ = 0;
            this.bitField0_ &= -9;
            this.restNum_ = 0;
            this.bitField0_ &= -17;
            this.resourceType_ = 0;
            this.bitField0_ &= -33;
            this.resourceId_ = 0;
            this.bitField0_ &= -65;
            this.oriPrice_ = 0;
            this.bitField0_ &= -129;
            this.disPrice_ = 0;
            this.bitField0_ &= -257;
            this.recommend_ = 0;
            this.bitField0_ &= -513;
            this.vipLimit_ = 0;
            this.bitField0_ &= -1025;
            this.discont_ = 0;
            this.bitField0_ &= -2049;
            this.timeLimit_ = false;
            this.bitField0_ &= -4097;
            this.id_ = 0;
            this.bitField0_ &= -8193;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_MysteryShopItem_descriptor;
         }

         public MysteryShopItem getDefaultInstanceForType() {
            return MysteryShopMsg.MysteryShopItem.getDefaultInstance();
         }

         public MysteryShopItem build() {
            MysteryShopItem result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MysteryShopItem buildPartial() {
            MysteryShopItem result = new MysteryShopItem(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.idx_ = this.idx_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.itemType_ = this.itemType_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.itemId_ = this.itemId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.combineNum_ = this.combineNum_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.restNum_ = this.restNum_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.resourceType_ = this.resourceType_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.resourceId_ = this.resourceId_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.oriPrice_ = this.oriPrice_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.disPrice_ = this.disPrice_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.recommend_ = this.recommend_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.vipLimit_ = this.vipLimit_;
               to_bitField0_ |= 1024;
            }

            if ((from_bitField0_ & 2048) != 0) {
               result.discont_ = this.discont_;
               to_bitField0_ |= 2048;
            }

            if ((from_bitField0_ & 4096) != 0) {
               result.timeLimit_ = this.timeLimit_;
               to_bitField0_ |= 4096;
            }

            if ((from_bitField0_ & 8192) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 8192;
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
            if (other instanceof MysteryShopItem) {
               return this.mergeFrom((MysteryShopItem)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(MysteryShopItem other) {
            if (other == MysteryShopMsg.MysteryShopItem.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIdx()) {
                  this.setIdx(other.getIdx());
               }

               if (other.hasItemType()) {
                  this.setItemType(other.getItemType());
               }

               if (other.hasItemId()) {
                  this.setItemId(other.getItemId());
               }

               if (other.hasCombineNum()) {
                  this.setCombineNum(other.getCombineNum());
               }

               if (other.hasRestNum()) {
                  this.setRestNum(other.getRestNum());
               }

               if (other.hasResourceType()) {
                  this.setResourceType(other.getResourceType());
               }

               if (other.hasResourceId()) {
                  this.setResourceId(other.getResourceId());
               }

               if (other.hasOriPrice()) {
                  this.setOriPrice(other.getOriPrice());
               }

               if (other.hasDisPrice()) {
                  this.setDisPrice(other.getDisPrice());
               }

               if (other.hasRecommend()) {
                  this.setRecommend(other.getRecommend());
               }

               if (other.hasVipLimit()) {
                  this.setVipLimit(other.getVipLimit());
               }

               if (other.hasDiscont()) {
                  this.setDiscont(other.getDiscont());
               }

               if (other.hasTimeLimit()) {
                  this.setTimeLimit(other.getTimeLimit());
               }

               if (other.hasId()) {
                  this.setId(other.getId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasIdx()) {
               return false;
            } else if (!this.hasItemType()) {
               return false;
            } else if (!this.hasItemId()) {
               return false;
            } else if (!this.hasCombineNum()) {
               return false;
            } else if (!this.hasRestNum()) {
               return false;
            } else if (!this.hasResourceType()) {
               return false;
            } else if (!this.hasResourceId()) {
               return false;
            } else if (!this.hasOriPrice()) {
               return false;
            } else if (!this.hasDisPrice()) {
               return false;
            } else if (!this.hasRecommend()) {
               return false;
            } else if (!this.hasVipLimit()) {
               return false;
            } else if (!this.hasDiscont()) {
               return false;
            } else if (!this.hasTimeLimit()) {
               return false;
            } else {
               return this.hasId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysteryShopItem parsedMessage = null;

            try {
               parsedMessage = (MysteryShopItem)MysteryShopMsg.MysteryShopItem.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (MysteryShopItem)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIdx() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getIdx() {
            return this.idx_;
         }

         public Builder setIdx(int value) {
            this.bitField0_ |= 1;
            this.idx_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIdx() {
            this.bitField0_ &= -2;
            this.idx_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasItemType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getItemType() {
            return this.itemType_;
         }

         public Builder setItemType(int value) {
            this.bitField0_ |= 2;
            this.itemType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemType() {
            this.bitField0_ &= -3;
            this.itemType_ = 0;
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

         public boolean hasCombineNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getCombineNum() {
            return this.combineNum_;
         }

         public Builder setCombineNum(int value) {
            this.bitField0_ |= 8;
            this.combineNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCombineNum() {
            this.bitField0_ &= -9;
            this.combineNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRestNum() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getRestNum() {
            return this.restNum_;
         }

         public Builder setRestNum(int value) {
            this.bitField0_ |= 16;
            this.restNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRestNum() {
            this.bitField0_ &= -17;
            this.restNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasResourceType() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getResourceType() {
            return this.resourceType_;
         }

         public Builder setResourceType(int value) {
            this.bitField0_ |= 32;
            this.resourceType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResourceType() {
            this.bitField0_ &= -33;
            this.resourceType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasResourceId() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getResourceId() {
            return this.resourceId_;
         }

         public Builder setResourceId(int value) {
            this.bitField0_ |= 64;
            this.resourceId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResourceId() {
            this.bitField0_ &= -65;
            this.resourceId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOriPrice() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getOriPrice() {
            return this.oriPrice_;
         }

         public Builder setOriPrice(int value) {
            this.bitField0_ |= 128;
            this.oriPrice_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOriPrice() {
            this.bitField0_ &= -129;
            this.oriPrice_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDisPrice() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getDisPrice() {
            return this.disPrice_;
         }

         public Builder setDisPrice(int value) {
            this.bitField0_ |= 256;
            this.disPrice_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDisPrice() {
            this.bitField0_ &= -257;
            this.disPrice_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRecommend() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getRecommend() {
            return this.recommend_;
         }

         public Builder setRecommend(int value) {
            this.bitField0_ |= 512;
            this.recommend_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecommend() {
            this.bitField0_ &= -513;
            this.recommend_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasVipLimit() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getVipLimit() {
            return this.vipLimit_;
         }

         public Builder setVipLimit(int value) {
            this.bitField0_ |= 1024;
            this.vipLimit_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearVipLimit() {
            this.bitField0_ &= -1025;
            this.vipLimit_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDiscont() {
            return (this.bitField0_ & 2048) != 0;
         }

         public int getDiscont() {
            return this.discont_;
         }

         public Builder setDiscont(int value) {
            this.bitField0_ |= 2048;
            this.discont_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDiscont() {
            this.bitField0_ &= -2049;
            this.discont_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTimeLimit() {
            return (this.bitField0_ & 4096) != 0;
         }

         public boolean getTimeLimit() {
            return this.timeLimit_;
         }

         public Builder setTimeLimit(boolean value) {
            this.bitField0_ |= 4096;
            this.timeLimit_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTimeLimit() {
            this.bitField0_ &= -4097;
            this.timeLimit_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasId() {
            return (this.bitField0_ & 8192) != 0;
         }

         public int getId() {
            return this.id_;
         }

         public Builder setId(int value) {
            this.bitField0_ |= 8192;
            this.id_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearId() {
            this.bitField0_ &= -8193;
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
         return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_RecordInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_RecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RecordInfo.class, Builder.class);
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
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_RecordInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_RecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RecordInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MysteryShopMsg.RecordInfo.alwaysUseFieldBuilders) {
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
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_RecordInfo_descriptor;
         }

         public RecordInfo getDefaultInstanceForType() {
            return MysteryShopMsg.RecordInfo.getDefaultInstance();
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
            if (other == MysteryShopMsg.RecordInfo.getDefaultInstance()) {
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
               parsedMessage = (RecordInfo)MysteryShopMsg.RecordInfo.PARSER.parsePartialFrom(input, extensionRegistry);
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

   public static final class C2S_MysteryShopData_7301 extends GeneratedMessageV3 implements C2S_MysteryShopData_7301OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      private byte memoizedIsInitialized;
      private static final C2S_MysteryShopData_7301 DEFAULT_INSTANCE = new C2S_MysteryShopData_7301();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MysteryShopData_7301> PARSER = new AbstractParser<C2S_MysteryShopData_7301>() {
         public C2S_MysteryShopData_7301 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MysteryShopData_7301(input, extensionRegistry);
         }
      };

      private C2S_MysteryShopData_7301(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MysteryShopData_7301() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MysteryShopData_7301();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MysteryShopData_7301(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_MysteryShopData_7301_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_MysteryShopData_7301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MysteryShopData_7301.class, Builder.class);
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
         } else if (!(obj instanceof C2S_MysteryShopData_7301)) {
            return super.equals(obj);
         } else {
            C2S_MysteryShopData_7301 other = (C2S_MysteryShopData_7301)obj;
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

      public static C2S_MysteryShopData_7301 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MysteryShopData_7301)PARSER.parseFrom(data);
      }

      public static C2S_MysteryShopData_7301 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MysteryShopData_7301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MysteryShopData_7301 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MysteryShopData_7301)PARSER.parseFrom(data);
      }

      public static C2S_MysteryShopData_7301 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MysteryShopData_7301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MysteryShopData_7301 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MysteryShopData_7301)PARSER.parseFrom(data);
      }

      public static C2S_MysteryShopData_7301 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MysteryShopData_7301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MysteryShopData_7301 parseFrom(InputStream input) throws IOException {
         return (C2S_MysteryShopData_7301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MysteryShopData_7301 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MysteryShopData_7301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MysteryShopData_7301 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MysteryShopData_7301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MysteryShopData_7301 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MysteryShopData_7301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MysteryShopData_7301 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MysteryShopData_7301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MysteryShopData_7301 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MysteryShopData_7301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MysteryShopData_7301 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MysteryShopData_7301 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MysteryShopData_7301> parser() {
         return PARSER;
      }

      public Parser<C2S_MysteryShopData_7301> getParserForType() {
         return PARSER;
      }

      public C2S_MysteryShopData_7301 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MysteryShopData_7301OrBuilder {
         private int bitField0_;
         private int playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_MysteryShopData_7301_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_MysteryShopData_7301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MysteryShopData_7301.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MysteryShopMsg.C2S_MysteryShopData_7301.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_MysteryShopData_7301_descriptor;
         }

         public C2S_MysteryShopData_7301 getDefaultInstanceForType() {
            return MysteryShopMsg.C2S_MysteryShopData_7301.getDefaultInstance();
         }

         public C2S_MysteryShopData_7301 build() {
            C2S_MysteryShopData_7301 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MysteryShopData_7301 buildPartial() {
            C2S_MysteryShopData_7301 result = new C2S_MysteryShopData_7301(this);
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
            if (other instanceof C2S_MysteryShopData_7301) {
               return this.mergeFrom((C2S_MysteryShopData_7301)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MysteryShopData_7301 other) {
            if (other == MysteryShopMsg.C2S_MysteryShopData_7301.getDefaultInstance()) {
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
            C2S_MysteryShopData_7301 parsedMessage = null;

            try {
               parsedMessage = (C2S_MysteryShopData_7301)MysteryShopMsg.C2S_MysteryShopData_7301.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MysteryShopData_7301)e.getUnfinishedMessage();
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

   public static final class S2C_MysteryShopData_7302 extends GeneratedMessageV3 implements S2C_MysteryShopData_7302OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int USEDFREETIMES_FIELD_NUMBER = 1;
      private int usedFreeTimes_;
      public static final int TOTALTIMES_FIELD_NUMBER = 2;
      private int totalTimes_;
      public static final int REFRESHTIMES_FIELD_NUMBER = 3;
      private long refreshTimes_;
      public static final int ITEMS_FIELD_NUMBER = 4;
      private List<MysteryShopItem> items_;
      private byte memoizedIsInitialized;
      private static final S2C_MysteryShopData_7302 DEFAULT_INSTANCE = new S2C_MysteryShopData_7302();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MysteryShopData_7302> PARSER = new AbstractParser<S2C_MysteryShopData_7302>() {
         public S2C_MysteryShopData_7302 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MysteryShopData_7302(input, extensionRegistry);
         }
      };

      private S2C_MysteryShopData_7302(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MysteryShopData_7302() {
         this.memoizedIsInitialized = -1;
         this.items_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MysteryShopData_7302();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MysteryShopData_7302(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.usedFreeTimes_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.totalTimes_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.refreshTimes_ = input.readInt64();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.items_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.items_.add(input.readMessage(MysteryShopMsg.MysteryShopItem.PARSER, extensionRegistry));
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
                  this.items_ = Collections.unmodifiableList(this.items_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_S2C_MysteryShopData_7302_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_S2C_MysteryShopData_7302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MysteryShopData_7302.class, Builder.class);
      }

      public boolean hasUsedFreeTimes() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getUsedFreeTimes() {
         return this.usedFreeTimes_;
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

      public List<MysteryShopItem> getItemsList() {
         return this.items_;
      }

      public List<? extends MysteryShopItemOrBuilder> getItemsOrBuilderList() {
         return this.items_;
      }

      public int getItemsCount() {
         return this.items_.size();
      }

      public MysteryShopItem getItems(int index) {
         return (MysteryShopItem)this.items_.get(index);
      }

      public MysteryShopItemOrBuilder getItemsOrBuilder(int index) {
         return (MysteryShopItemOrBuilder)this.items_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasUsedFreeTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRefreshTimes()) {
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
            output.writeInt32(1, this.usedFreeTimes_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.totalTimes_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(3, this.refreshTimes_);
         }

         for(int i = 0; i < this.items_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.items_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.usedFreeTimes_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.totalTimes_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(3, this.refreshTimes_);
            }

            for(int i = 0; i < this.items_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.items_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MysteryShopData_7302)) {
            return super.equals(obj);
         } else {
            S2C_MysteryShopData_7302 other = (S2C_MysteryShopData_7302)obj;
            if (this.hasUsedFreeTimes() != other.hasUsedFreeTimes()) {
               return false;
            } else if (this.hasUsedFreeTimes() && this.getUsedFreeTimes() != other.getUsedFreeTimes()) {
               return false;
            } else if (this.hasTotalTimes() != other.hasTotalTimes()) {
               return false;
            } else if (this.hasTotalTimes() && this.getTotalTimes() != other.getTotalTimes()) {
               return false;
            } else if (this.hasRefreshTimes() != other.hasRefreshTimes()) {
               return false;
            } else if (this.hasRefreshTimes() && this.getRefreshTimes() != other.getRefreshTimes()) {
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
            if (this.hasUsedFreeTimes()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUsedFreeTimes();
            }

            if (this.hasTotalTimes()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTotalTimes();
            }

            if (this.hasRefreshTimes()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashLong(this.getRefreshTimes());
            }

            if (this.getItemsCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getItemsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MysteryShopData_7302 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MysteryShopData_7302)PARSER.parseFrom(data);
      }

      public static S2C_MysteryShopData_7302 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MysteryShopData_7302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MysteryShopData_7302 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MysteryShopData_7302)PARSER.parseFrom(data);
      }

      public static S2C_MysteryShopData_7302 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MysteryShopData_7302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MysteryShopData_7302 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MysteryShopData_7302)PARSER.parseFrom(data);
      }

      public static S2C_MysteryShopData_7302 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MysteryShopData_7302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MysteryShopData_7302 parseFrom(InputStream input) throws IOException {
         return (S2C_MysteryShopData_7302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MysteryShopData_7302 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MysteryShopData_7302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MysteryShopData_7302 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MysteryShopData_7302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MysteryShopData_7302 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MysteryShopData_7302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MysteryShopData_7302 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MysteryShopData_7302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MysteryShopData_7302 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MysteryShopData_7302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MysteryShopData_7302 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MysteryShopData_7302 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MysteryShopData_7302> parser() {
         return PARSER;
      }

      public Parser<S2C_MysteryShopData_7302> getParserForType() {
         return PARSER;
      }

      public S2C_MysteryShopData_7302 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MysteryShopData_7302OrBuilder {
         private int bitField0_;
         private int usedFreeTimes_;
         private int totalTimes_;
         private long refreshTimes_;
         private List<MysteryShopItem> items_;
         private RepeatedFieldBuilderV3<MysteryShopItem, MysteryShopItem.Builder, MysteryShopItemOrBuilder> itemsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_S2C_MysteryShopData_7302_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_S2C_MysteryShopData_7302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MysteryShopData_7302.class, Builder.class);
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
            if (MysteryShopMsg.S2C_MysteryShopData_7302.alwaysUseFieldBuilders) {
               this.getItemsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.usedFreeTimes_ = 0;
            this.bitField0_ &= -2;
            this.totalTimes_ = 0;
            this.bitField0_ &= -3;
            this.refreshTimes_ = 0L;
            this.bitField0_ &= -5;
            if (this.itemsBuilder_ == null) {
               this.items_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.itemsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_S2C_MysteryShopData_7302_descriptor;
         }

         public S2C_MysteryShopData_7302 getDefaultInstanceForType() {
            return MysteryShopMsg.S2C_MysteryShopData_7302.getDefaultInstance();
         }

         public S2C_MysteryShopData_7302 build() {
            S2C_MysteryShopData_7302 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MysteryShopData_7302 buildPartial() {
            S2C_MysteryShopData_7302 result = new S2C_MysteryShopData_7302(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.usedFreeTimes_ = this.usedFreeTimes_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.totalTimes_ = this.totalTimes_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.refreshTimes_ = this.refreshTimes_;
               to_bitField0_ |= 4;
            }

            if (this.itemsBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.items_ = Collections.unmodifiableList(this.items_);
                  this.bitField0_ &= -9;
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
            if (other instanceof S2C_MysteryShopData_7302) {
               return this.mergeFrom((S2C_MysteryShopData_7302)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MysteryShopData_7302 other) {
            if (other == MysteryShopMsg.S2C_MysteryShopData_7302.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasUsedFreeTimes()) {
                  this.setUsedFreeTimes(other.getUsedFreeTimes());
               }

               if (other.hasTotalTimes()) {
                  this.setTotalTimes(other.getTotalTimes());
               }

               if (other.hasRefreshTimes()) {
                  this.setRefreshTimes(other.getRefreshTimes());
               }

               if (this.itemsBuilder_ == null) {
                  if (!other.items_.isEmpty()) {
                     if (this.items_.isEmpty()) {
                        this.items_ = other.items_;
                        this.bitField0_ &= -9;
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
                     this.bitField0_ &= -9;
                     this.itemsBuilder_ = MysteryShopMsg.S2C_MysteryShopData_7302.alwaysUseFieldBuilders ? this.getItemsFieldBuilder() : null;
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
            if (!this.hasUsedFreeTimes()) {
               return false;
            } else if (!this.hasTotalTimes()) {
               return false;
            } else if (!this.hasRefreshTimes()) {
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
            S2C_MysteryShopData_7302 parsedMessage = null;

            try {
               parsedMessage = (S2C_MysteryShopData_7302)MysteryShopMsg.S2C_MysteryShopData_7302.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MysteryShopData_7302)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasUsedFreeTimes() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getUsedFreeTimes() {
            return this.usedFreeTimes_;
         }

         public Builder setUsedFreeTimes(int value) {
            this.bitField0_ |= 1;
            this.usedFreeTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUsedFreeTimes() {
            this.bitField0_ &= -2;
            this.usedFreeTimes_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTotalTimes() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTotalTimes() {
            return this.totalTimes_;
         }

         public Builder setTotalTimes(int value) {
            this.bitField0_ |= 2;
            this.totalTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalTimes() {
            this.bitField0_ &= -3;
            this.totalTimes_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRefreshTimes() {
            return (this.bitField0_ & 4) != 0;
         }

         public long getRefreshTimes() {
            return this.refreshTimes_;
         }

         public Builder setRefreshTimes(long value) {
            this.bitField0_ |= 4;
            this.refreshTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRefreshTimes() {
            this.bitField0_ &= -5;
            this.refreshTimes_ = 0L;
            this.onChanged();
            return this;
         }

         private void ensureItemsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.items_ = new ArrayList(this.items_);
               this.bitField0_ |= 8;
            }

         }

         public List<MysteryShopItem> getItemsList() {
            return this.itemsBuilder_ == null ? Collections.unmodifiableList(this.items_) : this.itemsBuilder_.getMessageList();
         }

         public int getItemsCount() {
            return this.itemsBuilder_ == null ? this.items_.size() : this.itemsBuilder_.getCount();
         }

         public MysteryShopItem getItems(int index) {
            return this.itemsBuilder_ == null ? (MysteryShopItem)this.items_.get(index) : (MysteryShopItem)this.itemsBuilder_.getMessage(index);
         }

         public Builder setItems(int index, MysteryShopItem value) {
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

         public Builder setItems(int index, MysteryShopItem.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItems(MysteryShopItem value) {
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

         public Builder addItems(int index, MysteryShopItem value) {
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

         public Builder addItems(MysteryShopItem.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItems(int index, MysteryShopItem.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItems(Iterable<? extends MysteryShopItem> values) {
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
               this.bitField0_ &= -9;
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

         public MysteryShopItem.Builder getItemsBuilder(int index) {
            return (MysteryShopItem.Builder)this.getItemsFieldBuilder().getBuilder(index);
         }

         public MysteryShopItemOrBuilder getItemsOrBuilder(int index) {
            return this.itemsBuilder_ == null ? (MysteryShopItemOrBuilder)this.items_.get(index) : (MysteryShopItemOrBuilder)this.itemsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MysteryShopItemOrBuilder> getItemsOrBuilderList() {
            return this.itemsBuilder_ != null ? this.itemsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.items_);
         }

         public MysteryShopItem.Builder addItemsBuilder() {
            return (MysteryShopItem.Builder)this.getItemsFieldBuilder().addBuilder(MysteryShopMsg.MysteryShopItem.getDefaultInstance());
         }

         public MysteryShopItem.Builder addItemsBuilder(int index) {
            return (MysteryShopItem.Builder)this.getItemsFieldBuilder().addBuilder(index, MysteryShopMsg.MysteryShopItem.getDefaultInstance());
         }

         public List<MysteryShopItem.Builder> getItemsBuilderList() {
            return this.getItemsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MysteryShopItem, MysteryShopItem.Builder, MysteryShopItemOrBuilder> getItemsFieldBuilder() {
            if (this.itemsBuilder_ == null) {
               this.itemsBuilder_ = new RepeatedFieldBuilderV3(this.items_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class C2S_Refresh_7303 extends GeneratedMessageV3 implements C2S_Refresh_7303OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int AUTOBUY_FIELD_NUMBER = 2;
      private boolean autoBuy_;
      private byte memoizedIsInitialized;
      private static final C2S_Refresh_7303 DEFAULT_INSTANCE = new C2S_Refresh_7303();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Refresh_7303> PARSER = new AbstractParser<C2S_Refresh_7303>() {
         public C2S_Refresh_7303 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Refresh_7303(input, extensionRegistry);
         }
      };

      private C2S_Refresh_7303(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Refresh_7303() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Refresh_7303();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Refresh_7303(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_Refresh_7303_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_Refresh_7303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Refresh_7303.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
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
               size += CodedOutputStream.computeInt32Size(1, this.playerId_);
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
         } else if (!(obj instanceof C2S_Refresh_7303)) {
            return super.equals(obj);
         } else {
            C2S_Refresh_7303 other = (C2S_Refresh_7303)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
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
            if (this.hasPlayerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerId();
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

      public static C2S_Refresh_7303 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Refresh_7303)PARSER.parseFrom(data);
      }

      public static C2S_Refresh_7303 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Refresh_7303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Refresh_7303 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Refresh_7303)PARSER.parseFrom(data);
      }

      public static C2S_Refresh_7303 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Refresh_7303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Refresh_7303 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Refresh_7303)PARSER.parseFrom(data);
      }

      public static C2S_Refresh_7303 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Refresh_7303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Refresh_7303 parseFrom(InputStream input) throws IOException {
         return (C2S_Refresh_7303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Refresh_7303 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Refresh_7303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Refresh_7303 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Refresh_7303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Refresh_7303 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Refresh_7303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Refresh_7303 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Refresh_7303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Refresh_7303 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Refresh_7303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Refresh_7303 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Refresh_7303 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Refresh_7303> parser() {
         return PARSER;
      }

      public Parser<C2S_Refresh_7303> getParserForType() {
         return PARSER;
      }

      public C2S_Refresh_7303 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Refresh_7303OrBuilder {
         private int bitField0_;
         private int playerId_;
         private boolean autoBuy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_Refresh_7303_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_Refresh_7303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Refresh_7303.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MysteryShopMsg.C2S_Refresh_7303.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.autoBuy_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_Refresh_7303_descriptor;
         }

         public C2S_Refresh_7303 getDefaultInstanceForType() {
            return MysteryShopMsg.C2S_Refresh_7303.getDefaultInstance();
         }

         public C2S_Refresh_7303 build() {
            C2S_Refresh_7303 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Refresh_7303 buildPartial() {
            C2S_Refresh_7303 result = new C2S_Refresh_7303(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
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
            if (other instanceof C2S_Refresh_7303) {
               return this.mergeFrom((C2S_Refresh_7303)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Refresh_7303 other) {
            if (other == MysteryShopMsg.C2S_Refresh_7303.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
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
            return this.hasPlayerId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Refresh_7303 parsedMessage = null;

            try {
               parsedMessage = (C2S_Refresh_7303)MysteryShopMsg.C2S_Refresh_7303.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Refresh_7303)e.getUnfinishedMessage();
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

   public static final class C2S_BuyItem_7305 extends GeneratedMessageV3 implements C2S_BuyItem_7305OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int IDX_FIELD_NUMBER = 1;
      private int idx_;
      public static final int ITEMTYPE_FIELD_NUMBER = 2;
      private int itemType_;
      public static final int ITEMID_FIELD_NUMBER = 3;
      private int itemId_;
      public static final int NUM_FIELD_NUMBER = 4;
      private int num_;
      public static final int GUIDESTEP_FIELD_NUMBER = 5;
      private int guideStep_;
      private byte memoizedIsInitialized;
      private static final C2S_BuyItem_7305 DEFAULT_INSTANCE = new C2S_BuyItem_7305();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BuyItem_7305> PARSER = new AbstractParser<C2S_BuyItem_7305>() {
         public C2S_BuyItem_7305 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BuyItem_7305(input, extensionRegistry);
         }
      };

      private C2S_BuyItem_7305(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BuyItem_7305() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BuyItem_7305();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BuyItem_7305(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.idx_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.itemType_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.itemId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.num_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.guideStep_ = input.readInt32();
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
         return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_BuyItem_7305_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_BuyItem_7305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyItem_7305.class, Builder.class);
      }

      public boolean hasIdx() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getIdx() {
         return this.idx_;
      }

      public boolean hasItemType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getItemType() {
         return this.itemType_;
      }

      public boolean hasItemId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getItemId() {
         return this.itemId_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public boolean hasGuideStep() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getGuideStep() {
         return this.guideStep_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIdx()) {
            this.memoizedIsInitialized = 0;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.idx_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.itemType_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.itemId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.num_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.guideStep_);
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
               size += CodedOutputStream.computeInt32Size(1, this.idx_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.itemType_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.itemId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.num_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.guideStep_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_BuyItem_7305)) {
            return super.equals(obj);
         } else {
            C2S_BuyItem_7305 other = (C2S_BuyItem_7305)obj;
            if (this.hasIdx() != other.hasIdx()) {
               return false;
            } else if (this.hasIdx() && this.getIdx() != other.getIdx()) {
               return false;
            } else if (this.hasItemType() != other.hasItemType()) {
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
            } else if (this.hasGuideStep() != other.hasGuideStep()) {
               return false;
            } else if (this.hasGuideStep() && this.getGuideStep() != other.getGuideStep()) {
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
            if (this.hasIdx()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIdx();
            }

            if (this.hasItemType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemType();
            }

            if (this.hasItemId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getItemId();
            }

            if (this.hasNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getNum();
            }

            if (this.hasGuideStep()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getGuideStep();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_BuyItem_7305 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_7305)PARSER.parseFrom(data);
      }

      public static C2S_BuyItem_7305 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_7305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyItem_7305 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_7305)PARSER.parseFrom(data);
      }

      public static C2S_BuyItem_7305 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_7305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyItem_7305 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_7305)PARSER.parseFrom(data);
      }

      public static C2S_BuyItem_7305 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyItem_7305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyItem_7305 parseFrom(InputStream input) throws IOException {
         return (C2S_BuyItem_7305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyItem_7305 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyItem_7305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyItem_7305 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BuyItem_7305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BuyItem_7305 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyItem_7305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyItem_7305 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BuyItem_7305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyItem_7305 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyItem_7305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BuyItem_7305 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BuyItem_7305 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BuyItem_7305> parser() {
         return PARSER;
      }

      public Parser<C2S_BuyItem_7305> getParserForType() {
         return PARSER;
      }

      public C2S_BuyItem_7305 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BuyItem_7305OrBuilder {
         private int bitField0_;
         private int idx_;
         private int itemType_;
         private int itemId_;
         private int num_;
         private int guideStep_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_BuyItem_7305_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_BuyItem_7305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyItem_7305.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MysteryShopMsg.C2S_BuyItem_7305.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.idx_ = 0;
            this.bitField0_ &= -2;
            this.itemType_ = 0;
            this.bitField0_ &= -3;
            this.itemId_ = 0;
            this.bitField0_ &= -5;
            this.num_ = 0;
            this.bitField0_ &= -9;
            this.guideStep_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_BuyItem_7305_descriptor;
         }

         public C2S_BuyItem_7305 getDefaultInstanceForType() {
            return MysteryShopMsg.C2S_BuyItem_7305.getDefaultInstance();
         }

         public C2S_BuyItem_7305 build() {
            C2S_BuyItem_7305 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BuyItem_7305 buildPartial() {
            C2S_BuyItem_7305 result = new C2S_BuyItem_7305(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.idx_ = this.idx_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.itemType_ = this.itemType_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.itemId_ = this.itemId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.num_ = this.num_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.guideStep_ = this.guideStep_;
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
            if (other instanceof C2S_BuyItem_7305) {
               return this.mergeFrom((C2S_BuyItem_7305)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BuyItem_7305 other) {
            if (other == MysteryShopMsg.C2S_BuyItem_7305.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIdx()) {
                  this.setIdx(other.getIdx());
               }

               if (other.hasItemType()) {
                  this.setItemType(other.getItemType());
               }

               if (other.hasItemId()) {
                  this.setItemId(other.getItemId());
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               if (other.hasGuideStep()) {
                  this.setGuideStep(other.getGuideStep());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasIdx()) {
               return false;
            } else if (!this.hasItemType()) {
               return false;
            } else if (!this.hasItemId()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_BuyItem_7305 parsedMessage = null;

            try {
               parsedMessage = (C2S_BuyItem_7305)MysteryShopMsg.C2S_BuyItem_7305.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BuyItem_7305)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIdx() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getIdx() {
            return this.idx_;
         }

         public Builder setIdx(int value) {
            this.bitField0_ |= 1;
            this.idx_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIdx() {
            this.bitField0_ &= -2;
            this.idx_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasItemType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getItemType() {
            return this.itemType_;
         }

         public Builder setItemType(int value) {
            this.bitField0_ |= 2;
            this.itemType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemType() {
            this.bitField0_ &= -3;
            this.itemType_ = 0;
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

         public boolean hasNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 8;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -9;
            this.num_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGuideStep() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getGuideStep() {
            return this.guideStep_;
         }

         public Builder setGuideStep(int value) {
            this.bitField0_ |= 16;
            this.guideStep_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGuideStep() {
            this.bitField0_ &= -17;
            this.guideStep_ = 0;
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

   public static final class S2C_BuyItem_7306 extends GeneratedMessageV3 implements S2C_BuyItem_7306OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int IDX_FIELD_NUMBER = 1;
      private int idx_;
      public static final int RESTNUM_FIELD_NUMBER = 2;
      private int restNum_;
      private byte memoizedIsInitialized;
      private static final S2C_BuyItem_7306 DEFAULT_INSTANCE = new S2C_BuyItem_7306();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BuyItem_7306> PARSER = new AbstractParser<S2C_BuyItem_7306>() {
         public S2C_BuyItem_7306 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BuyItem_7306(input, extensionRegistry);
         }
      };

      private S2C_BuyItem_7306(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BuyItem_7306() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BuyItem_7306();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BuyItem_7306(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.idx_ = input.readInt32();
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
         return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_S2C_BuyItem_7306_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_S2C_BuyItem_7306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyItem_7306.class, Builder.class);
      }

      public boolean hasIdx() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getIdx() {
         return this.idx_;
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
         } else if (!this.hasIdx()) {
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
            output.writeInt32(1, this.idx_);
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
               size += CodedOutputStream.computeInt32Size(1, this.idx_);
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
         } else if (!(obj instanceof S2C_BuyItem_7306)) {
            return super.equals(obj);
         } else {
            S2C_BuyItem_7306 other = (S2C_BuyItem_7306)obj;
            if (this.hasIdx() != other.hasIdx()) {
               return false;
            } else if (this.hasIdx() && this.getIdx() != other.getIdx()) {
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
            if (this.hasIdx()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIdx();
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

      public static S2C_BuyItem_7306 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BuyItem_7306)PARSER.parseFrom(data);
      }

      public static S2C_BuyItem_7306 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyItem_7306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyItem_7306 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BuyItem_7306)PARSER.parseFrom(data);
      }

      public static S2C_BuyItem_7306 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyItem_7306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyItem_7306 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BuyItem_7306)PARSER.parseFrom(data);
      }

      public static S2C_BuyItem_7306 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyItem_7306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyItem_7306 parseFrom(InputStream input) throws IOException {
         return (S2C_BuyItem_7306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyItem_7306 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyItem_7306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyItem_7306 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BuyItem_7306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BuyItem_7306 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyItem_7306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyItem_7306 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BuyItem_7306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyItem_7306 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyItem_7306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BuyItem_7306 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BuyItem_7306 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BuyItem_7306> parser() {
         return PARSER;
      }

      public Parser<S2C_BuyItem_7306> getParserForType() {
         return PARSER;
      }

      public S2C_BuyItem_7306 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BuyItem_7306OrBuilder {
         private int bitField0_;
         private int idx_;
         private int restNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_S2C_BuyItem_7306_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_S2C_BuyItem_7306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyItem_7306.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MysteryShopMsg.S2C_BuyItem_7306.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.idx_ = 0;
            this.bitField0_ &= -2;
            this.restNum_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_S2C_BuyItem_7306_descriptor;
         }

         public S2C_BuyItem_7306 getDefaultInstanceForType() {
            return MysteryShopMsg.S2C_BuyItem_7306.getDefaultInstance();
         }

         public S2C_BuyItem_7306 build() {
            S2C_BuyItem_7306 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BuyItem_7306 buildPartial() {
            S2C_BuyItem_7306 result = new S2C_BuyItem_7306(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.idx_ = this.idx_;
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
            if (other instanceof S2C_BuyItem_7306) {
               return this.mergeFrom((S2C_BuyItem_7306)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BuyItem_7306 other) {
            if (other == MysteryShopMsg.S2C_BuyItem_7306.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIdx()) {
                  this.setIdx(other.getIdx());
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
            if (!this.hasIdx()) {
               return false;
            } else {
               return this.hasRestNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BuyItem_7306 parsedMessage = null;

            try {
               parsedMessage = (S2C_BuyItem_7306)MysteryShopMsg.S2C_BuyItem_7306.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BuyItem_7306)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIdx() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getIdx() {
            return this.idx_;
         }

         public Builder setIdx(int value) {
            this.bitField0_ |= 1;
            this.idx_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIdx() {
            this.bitField0_ &= -2;
            this.idx_ = 0;
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

   public static final class C2S_AutoBuyIds_7307 extends GeneratedMessageV3 implements C2S_AutoBuyIds_7307OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int IDX_FIELD_NUMBER = 1;
      private Internal.IntList idx_;
      private byte memoizedIsInitialized;
      private static final C2S_AutoBuyIds_7307 DEFAULT_INSTANCE = new C2S_AutoBuyIds_7307();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AutoBuyIds_7307> PARSER = new AbstractParser<C2S_AutoBuyIds_7307>() {
         public C2S_AutoBuyIds_7307 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AutoBuyIds_7307(input, extensionRegistry);
         }
      };

      private C2S_AutoBuyIds_7307(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AutoBuyIds_7307() {
         this.memoizedIsInitialized = -1;
         this.idx_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AutoBuyIds_7307();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AutoBuyIds_7307(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.idx_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.idx_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.idx_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.idx_.addInt(input.readInt32());
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
                  this.idx_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_AutoBuyIds_7307_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_AutoBuyIds_7307_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AutoBuyIds_7307.class, Builder.class);
      }

      public List<Integer> getIdxList() {
         return this.idx_;
      }

      public int getIdxCount() {
         return this.idx_.size();
      }

      public int getIdx(int index) {
         return this.idx_.getInt(index);
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
         for(int i = 0; i < this.idx_.size(); ++i) {
            output.writeInt32(1, this.idx_.getInt(i));
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

            for(int i = 0; i < this.idx_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.idx_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getIdxList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_AutoBuyIds_7307)) {
            return super.equals(obj);
         } else {
            C2S_AutoBuyIds_7307 other = (C2S_AutoBuyIds_7307)obj;
            if (!this.getIdxList().equals(other.getIdxList())) {
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
            if (this.getIdxCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIdxList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_AutoBuyIds_7307 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AutoBuyIds_7307)PARSER.parseFrom(data);
      }

      public static C2S_AutoBuyIds_7307 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AutoBuyIds_7307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AutoBuyIds_7307 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AutoBuyIds_7307)PARSER.parseFrom(data);
      }

      public static C2S_AutoBuyIds_7307 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AutoBuyIds_7307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AutoBuyIds_7307 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AutoBuyIds_7307)PARSER.parseFrom(data);
      }

      public static C2S_AutoBuyIds_7307 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AutoBuyIds_7307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AutoBuyIds_7307 parseFrom(InputStream input) throws IOException {
         return (C2S_AutoBuyIds_7307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AutoBuyIds_7307 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AutoBuyIds_7307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AutoBuyIds_7307 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AutoBuyIds_7307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AutoBuyIds_7307 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AutoBuyIds_7307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AutoBuyIds_7307 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AutoBuyIds_7307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AutoBuyIds_7307 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AutoBuyIds_7307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AutoBuyIds_7307 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AutoBuyIds_7307 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AutoBuyIds_7307> parser() {
         return PARSER;
      }

      public Parser<C2S_AutoBuyIds_7307> getParserForType() {
         return PARSER;
      }

      public C2S_AutoBuyIds_7307 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AutoBuyIds_7307OrBuilder {
         private int bitField0_;
         private Internal.IntList idx_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_AutoBuyIds_7307_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_AutoBuyIds_7307_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AutoBuyIds_7307.class, Builder.class);
         }

         private Builder() {
            this.idx_ = MysteryShopMsg.C2S_AutoBuyIds_7307.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.idx_ = MysteryShopMsg.C2S_AutoBuyIds_7307.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MysteryShopMsg.C2S_AutoBuyIds_7307.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.idx_ = MysteryShopMsg.C2S_AutoBuyIds_7307.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_AutoBuyIds_7307_descriptor;
         }

         public C2S_AutoBuyIds_7307 getDefaultInstanceForType() {
            return MysteryShopMsg.C2S_AutoBuyIds_7307.getDefaultInstance();
         }

         public C2S_AutoBuyIds_7307 build() {
            C2S_AutoBuyIds_7307 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AutoBuyIds_7307 buildPartial() {
            C2S_AutoBuyIds_7307 result = new C2S_AutoBuyIds_7307(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.idx_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.idx_ = this.idx_;
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
            if (other instanceof C2S_AutoBuyIds_7307) {
               return this.mergeFrom((C2S_AutoBuyIds_7307)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AutoBuyIds_7307 other) {
            if (other == MysteryShopMsg.C2S_AutoBuyIds_7307.getDefaultInstance()) {
               return this;
            } else {
               if (!other.idx_.isEmpty()) {
                  if (this.idx_.isEmpty()) {
                     this.idx_ = other.idx_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureIdxIsMutable();
                     this.idx_.addAll(other.idx_);
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
            C2S_AutoBuyIds_7307 parsedMessage = null;

            try {
               parsedMessage = (C2S_AutoBuyIds_7307)MysteryShopMsg.C2S_AutoBuyIds_7307.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AutoBuyIds_7307)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureIdxIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.idx_ = MysteryShopMsg.C2S_AutoBuyIds_7307.mutableCopy(this.idx_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getIdxList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.idx_) : this.idx_);
         }

         public int getIdxCount() {
            return this.idx_.size();
         }

         public int getIdx(int index) {
            return this.idx_.getInt(index);
         }

         public Builder setIdx(int index, int value) {
            this.ensureIdxIsMutable();
            this.idx_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addIdx(int value) {
            this.ensureIdxIsMutable();
            this.idx_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllIdx(Iterable<? extends Integer> values) {
            this.ensureIdxIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.idx_);
            this.onChanged();
            return this;
         }

         public Builder clearIdx() {
            this.idx_ = MysteryShopMsg.C2S_AutoBuyIds_7307.emptyIntList();
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

   public static final class S2C_AutoBuyIds_7308 extends GeneratedMessageV3 implements S2C_AutoBuyIds_7308OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int IDX_FIELD_NUMBER = 1;
      private Internal.IntList idx_;
      private byte memoizedIsInitialized;
      private static final S2C_AutoBuyIds_7308 DEFAULT_INSTANCE = new S2C_AutoBuyIds_7308();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AutoBuyIds_7308> PARSER = new AbstractParser<S2C_AutoBuyIds_7308>() {
         public S2C_AutoBuyIds_7308 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AutoBuyIds_7308(input, extensionRegistry);
         }
      };

      private S2C_AutoBuyIds_7308(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AutoBuyIds_7308() {
         this.memoizedIsInitialized = -1;
         this.idx_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AutoBuyIds_7308();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AutoBuyIds_7308(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.idx_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.idx_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.idx_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.idx_.addInt(input.readInt32());
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
                  this.idx_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_S2C_AutoBuyIds_7308_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_S2C_AutoBuyIds_7308_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AutoBuyIds_7308.class, Builder.class);
      }

      public List<Integer> getIdxList() {
         return this.idx_;
      }

      public int getIdxCount() {
         return this.idx_.size();
      }

      public int getIdx(int index) {
         return this.idx_.getInt(index);
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
         for(int i = 0; i < this.idx_.size(); ++i) {
            output.writeInt32(1, this.idx_.getInt(i));
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

            for(int i = 0; i < this.idx_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.idx_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getIdxList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_AutoBuyIds_7308)) {
            return super.equals(obj);
         } else {
            S2C_AutoBuyIds_7308 other = (S2C_AutoBuyIds_7308)obj;
            if (!this.getIdxList().equals(other.getIdxList())) {
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
            if (this.getIdxCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIdxList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_AutoBuyIds_7308 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AutoBuyIds_7308)PARSER.parseFrom(data);
      }

      public static S2C_AutoBuyIds_7308 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AutoBuyIds_7308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AutoBuyIds_7308 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AutoBuyIds_7308)PARSER.parseFrom(data);
      }

      public static S2C_AutoBuyIds_7308 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AutoBuyIds_7308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AutoBuyIds_7308 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AutoBuyIds_7308)PARSER.parseFrom(data);
      }

      public static S2C_AutoBuyIds_7308 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AutoBuyIds_7308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AutoBuyIds_7308 parseFrom(InputStream input) throws IOException {
         return (S2C_AutoBuyIds_7308)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AutoBuyIds_7308 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AutoBuyIds_7308)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AutoBuyIds_7308 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AutoBuyIds_7308)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AutoBuyIds_7308 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AutoBuyIds_7308)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AutoBuyIds_7308 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AutoBuyIds_7308)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AutoBuyIds_7308 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AutoBuyIds_7308)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AutoBuyIds_7308 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AutoBuyIds_7308 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AutoBuyIds_7308> parser() {
         return PARSER;
      }

      public Parser<S2C_AutoBuyIds_7308> getParserForType() {
         return PARSER;
      }

      public S2C_AutoBuyIds_7308 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AutoBuyIds_7308OrBuilder {
         private int bitField0_;
         private Internal.IntList idx_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_S2C_AutoBuyIds_7308_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_S2C_AutoBuyIds_7308_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AutoBuyIds_7308.class, Builder.class);
         }

         private Builder() {
            this.idx_ = MysteryShopMsg.S2C_AutoBuyIds_7308.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.idx_ = MysteryShopMsg.S2C_AutoBuyIds_7308.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MysteryShopMsg.S2C_AutoBuyIds_7308.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.idx_ = MysteryShopMsg.S2C_AutoBuyIds_7308.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_S2C_AutoBuyIds_7308_descriptor;
         }

         public S2C_AutoBuyIds_7308 getDefaultInstanceForType() {
            return MysteryShopMsg.S2C_AutoBuyIds_7308.getDefaultInstance();
         }

         public S2C_AutoBuyIds_7308 build() {
            S2C_AutoBuyIds_7308 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AutoBuyIds_7308 buildPartial() {
            S2C_AutoBuyIds_7308 result = new S2C_AutoBuyIds_7308(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.idx_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.idx_ = this.idx_;
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
            if (other instanceof S2C_AutoBuyIds_7308) {
               return this.mergeFrom((S2C_AutoBuyIds_7308)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AutoBuyIds_7308 other) {
            if (other == MysteryShopMsg.S2C_AutoBuyIds_7308.getDefaultInstance()) {
               return this;
            } else {
               if (!other.idx_.isEmpty()) {
                  if (this.idx_.isEmpty()) {
                     this.idx_ = other.idx_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureIdxIsMutable();
                     this.idx_.addAll(other.idx_);
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
            S2C_AutoBuyIds_7308 parsedMessage = null;

            try {
               parsedMessage = (S2C_AutoBuyIds_7308)MysteryShopMsg.S2C_AutoBuyIds_7308.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AutoBuyIds_7308)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureIdxIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.idx_ = MysteryShopMsg.S2C_AutoBuyIds_7308.mutableCopy(this.idx_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getIdxList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.idx_) : this.idx_);
         }

         public int getIdxCount() {
            return this.idx_.size();
         }

         public int getIdx(int index) {
            return this.idx_.getInt(index);
         }

         public Builder setIdx(int index, int value) {
            this.ensureIdxIsMutable();
            this.idx_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addIdx(int value) {
            this.ensureIdxIsMutable();
            this.idx_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllIdx(Iterable<? extends Integer> values) {
            this.ensureIdxIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.idx_);
            this.onChanged();
            return this;
         }

         public Builder clearIdx() {
            this.idx_ = MysteryShopMsg.S2C_AutoBuyIds_7308.emptyIntList();
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

   public static final class C2S_Record_7309 extends GeneratedMessageV3 implements C2S_Record_7309OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Record_7309 DEFAULT_INSTANCE = new C2S_Record_7309();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Record_7309> PARSER = new AbstractParser<C2S_Record_7309>() {
         public C2S_Record_7309 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Record_7309(input, extensionRegistry);
         }
      };

      private C2S_Record_7309(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Record_7309() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Record_7309();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Record_7309(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_Record_7309_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_Record_7309_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Record_7309.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Record_7309)) {
            return super.equals(obj);
         } else {
            C2S_Record_7309 other = (C2S_Record_7309)obj;
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

      public static C2S_Record_7309 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Record_7309)PARSER.parseFrom(data);
      }

      public static C2S_Record_7309 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Record_7309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Record_7309 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Record_7309)PARSER.parseFrom(data);
      }

      public static C2S_Record_7309 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Record_7309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Record_7309 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Record_7309)PARSER.parseFrom(data);
      }

      public static C2S_Record_7309 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Record_7309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Record_7309 parseFrom(InputStream input) throws IOException {
         return (C2S_Record_7309)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Record_7309 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Record_7309)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Record_7309 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Record_7309)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Record_7309 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Record_7309)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Record_7309 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Record_7309)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Record_7309 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Record_7309)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Record_7309 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Record_7309 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Record_7309> parser() {
         return PARSER;
      }

      public Parser<C2S_Record_7309> getParserForType() {
         return PARSER;
      }

      public C2S_Record_7309 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Record_7309OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_Record_7309_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_Record_7309_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Record_7309.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MysteryShopMsg.C2S_Record_7309.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_C2S_Record_7309_descriptor;
         }

         public C2S_Record_7309 getDefaultInstanceForType() {
            return MysteryShopMsg.C2S_Record_7309.getDefaultInstance();
         }

         public C2S_Record_7309 build() {
            C2S_Record_7309 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Record_7309 buildPartial() {
            C2S_Record_7309 result = new C2S_Record_7309(this);
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
            if (other instanceof C2S_Record_7309) {
               return this.mergeFrom((C2S_Record_7309)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Record_7309 other) {
            if (other == MysteryShopMsg.C2S_Record_7309.getDefaultInstance()) {
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
            C2S_Record_7309 parsedMessage = null;

            try {
               parsedMessage = (C2S_Record_7309)MysteryShopMsg.C2S_Record_7309.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Record_7309)e.getUnfinishedMessage();
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

   public static final class S2C_Record_7310 extends GeneratedMessageV3 implements S2C_Record_7310OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFO_FIELD_NUMBER = 1;
      private List<RecordInfo> info_;
      private byte memoizedIsInitialized;
      private static final S2C_Record_7310 DEFAULT_INSTANCE = new S2C_Record_7310();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Record_7310> PARSER = new AbstractParser<S2C_Record_7310>() {
         public S2C_Record_7310 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Record_7310(input, extensionRegistry);
         }
      };

      private S2C_Record_7310(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Record_7310() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Record_7310();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Record_7310(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.info_.add(input.readMessage(MysteryShopMsg.RecordInfo.PARSER, extensionRegistry));
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
         return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_S2C_Record_7310_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_S2C_Record_7310_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Record_7310.class, Builder.class);
      }

      public List<RecordInfo> getInfoList() {
         return this.info_;
      }

      public List<? extends RecordInfoOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public RecordInfo getInfo(int index) {
         return (RecordInfo)this.info_.get(index);
      }

      public RecordInfoOrBuilder getInfoOrBuilder(int index) {
         return (RecordInfoOrBuilder)this.info_.get(index);
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
         } else if (!(obj instanceof S2C_Record_7310)) {
            return super.equals(obj);
         } else {
            S2C_Record_7310 other = (S2C_Record_7310)obj;
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

      public static S2C_Record_7310 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Record_7310)PARSER.parseFrom(data);
      }

      public static S2C_Record_7310 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Record_7310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Record_7310 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Record_7310)PARSER.parseFrom(data);
      }

      public static S2C_Record_7310 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Record_7310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Record_7310 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Record_7310)PARSER.parseFrom(data);
      }

      public static S2C_Record_7310 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Record_7310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Record_7310 parseFrom(InputStream input) throws IOException {
         return (S2C_Record_7310)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Record_7310 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Record_7310)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Record_7310 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Record_7310)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Record_7310 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Record_7310)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Record_7310 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Record_7310)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Record_7310 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Record_7310)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Record_7310 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Record_7310 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Record_7310> parser() {
         return PARSER;
      }

      public Parser<S2C_Record_7310> getParserForType() {
         return PARSER;
      }

      public S2C_Record_7310 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Record_7310OrBuilder {
         private int bitField0_;
         private List<RecordInfo> info_;
         private RepeatedFieldBuilderV3<RecordInfo, RecordInfo.Builder, RecordInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_S2C_Record_7310_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_S2C_Record_7310_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Record_7310.class, Builder.class);
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
            if (MysteryShopMsg.S2C_Record_7310.alwaysUseFieldBuilders) {
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
            return MysteryShopMsg.internal_static_mysteryshop_com_gzbz_protobuf_S2C_Record_7310_descriptor;
         }

         public S2C_Record_7310 getDefaultInstanceForType() {
            return MysteryShopMsg.S2C_Record_7310.getDefaultInstance();
         }

         public S2C_Record_7310 build() {
            S2C_Record_7310 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Record_7310 buildPartial() {
            S2C_Record_7310 result = new S2C_Record_7310(this);
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
            if (other instanceof S2C_Record_7310) {
               return this.mergeFrom((S2C_Record_7310)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Record_7310 other) {
            if (other == MysteryShopMsg.S2C_Record_7310.getDefaultInstance()) {
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
                     this.infoBuilder_ = MysteryShopMsg.S2C_Record_7310.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
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
            S2C_Record_7310 parsedMessage = null;

            try {
               parsedMessage = (S2C_Record_7310)MysteryShopMsg.S2C_Record_7310.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Record_7310)e.getUnfinishedMessage();
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

         public List<RecordInfo> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public RecordInfo getInfo(int index) {
            return this.infoBuilder_ == null ? (RecordInfo)this.info_.get(index) : (RecordInfo)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, RecordInfo value) {
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

         public Builder setInfo(int index, RecordInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(RecordInfo value) {
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

         public Builder addInfo(int index, RecordInfo value) {
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

         public Builder addInfo(RecordInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, RecordInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends RecordInfo> values) {
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

         public RecordInfo.Builder getInfoBuilder(int index) {
            return (RecordInfo.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public RecordInfoOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (RecordInfoOrBuilder)this.info_.get(index) : (RecordInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RecordInfoOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public RecordInfo.Builder addInfoBuilder() {
            return (RecordInfo.Builder)this.getInfoFieldBuilder().addBuilder(MysteryShopMsg.RecordInfo.getDefaultInstance());
         }

         public RecordInfo.Builder addInfoBuilder(int index) {
            return (RecordInfo.Builder)this.getInfoFieldBuilder().addBuilder(index, MysteryShopMsg.RecordInfo.getDefaultInstance());
         }

         public List<RecordInfo.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RecordInfo, RecordInfo.Builder, RecordInfoOrBuilder> getInfoFieldBuilder() {
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

   public interface C2S_AutoBuyIds_7307OrBuilder extends MessageOrBuilder {
      List<Integer> getIdxList();

      int getIdxCount();

      int getIdx(int index);
   }

   public interface C2S_BuyItem_7305OrBuilder extends MessageOrBuilder {
      boolean hasIdx();

      int getIdx();

      boolean hasItemType();

      int getItemType();

      boolean hasItemId();

      int getItemId();

      boolean hasNum();

      int getNum();

      boolean hasGuideStep();

      int getGuideStep();
   }

   public interface C2S_MysteryShopData_7301OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();
   }

   public interface C2S_Record_7309OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Refresh_7303OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasAutoBuy();

      boolean getAutoBuy();
   }

   public interface MysteryShopItemOrBuilder extends MessageOrBuilder {
      boolean hasIdx();

      int getIdx();

      boolean hasItemType();

      int getItemType();

      boolean hasItemId();

      int getItemId();

      boolean hasCombineNum();

      int getCombineNum();

      boolean hasRestNum();

      int getRestNum();

      boolean hasResourceType();

      int getResourceType();

      boolean hasResourceId();

      int getResourceId();

      boolean hasOriPrice();

      int getOriPrice();

      boolean hasDisPrice();

      int getDisPrice();

      boolean hasRecommend();

      int getRecommend();

      boolean hasVipLimit();

      int getVipLimit();

      boolean hasDiscont();

      int getDiscont();

      boolean hasTimeLimit();

      boolean getTimeLimit();

      boolean hasId();

      int getId();
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

   public interface S2C_AutoBuyIds_7308OrBuilder extends MessageOrBuilder {
      List<Integer> getIdxList();

      int getIdxCount();

      int getIdx(int index);
   }

   public interface S2C_BuyItem_7306OrBuilder extends MessageOrBuilder {
      boolean hasIdx();

      int getIdx();

      boolean hasRestNum();

      int getRestNum();
   }

   public interface S2C_MysteryShopData_7302OrBuilder extends MessageOrBuilder {
      boolean hasUsedFreeTimes();

      int getUsedFreeTimes();

      boolean hasTotalTimes();

      int getTotalTimes();

      boolean hasRefreshTimes();

      long getRefreshTimes();

      List<MysteryShopItem> getItemsList();

      MysteryShopItem getItems(int index);

      int getItemsCount();

      List<? extends MysteryShopItemOrBuilder> getItemsOrBuilderList();

      MysteryShopItemOrBuilder getItemsOrBuilder(int index);
   }

   public interface S2C_Record_7310OrBuilder extends MessageOrBuilder {
      List<RecordInfo> getInfoList();

      RecordInfo getInfo(int index);

      int getInfoCount();

      List<? extends RecordInfoOrBuilder> getInfoOrBuilderList();

      RecordInfoOrBuilder getInfoOrBuilder(int index);
   }
}
