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
import java.util.Collections;
import java.util.List;

public final class AideMsg {
   private static final Descriptors.Descriptor internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChoice_9201_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChoice_9201_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_aide_com_gzbz_protobuf_S2C_HeroAideChoice_9202_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_aide_com_gzbz_protobuf_S2C_HeroAideChoice_9202_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_aide_com_gzbz_protobuf_C2S_HeroAideDown_9203_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_aide_com_gzbz_protobuf_C2S_HeroAideDown_9203_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_aide_com_gzbz_protobuf_S2C_HeroAideDown_9204_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_aide_com_gzbz_protobuf_S2C_HeroAideDown_9204_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_aide_com_gzbz_protobuf_C2S_HeroAideUpgrade_9205_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_aide_com_gzbz_protobuf_C2S_HeroAideUpgrade_9205_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_aide_com_gzbz_protobuf_S2C_HeroAideUpgrade_9206_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_aide_com_gzbz_protobuf_S2C_HeroAideUpgrade_9206_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_aide_com_gzbz_protobuf_C2S_HeroAideRecord_9207_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_aide_com_gzbz_protobuf_C2S_HeroAideRecord_9207_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_aide_com_gzbz_protobuf_S2C_HeroAideRecord_9208_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_aide_com_gzbz_protobuf_S2C_HeroAideRecord_9208_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_aide_com_gzbz_protobuf_C2S_HeroAideOneKeyDiscompose_9209_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_aide_com_gzbz_protobuf_C2S_HeroAideOneKeyDiscompose_9209_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_aide_com_gzbz_protobuf_S2C_HeroAideOneKeyDiscompose_9210_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_aide_com_gzbz_protobuf_S2C_HeroAideOneKeyDiscompose_9210_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_aide_com_gzbz_protobuf_C2S_HeroAideUniteSkill_9211_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_aide_com_gzbz_protobuf_C2S_HeroAideUniteSkill_9211_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_aide_com_gzbz_protobuf_S2C_HeroAideUniteSkill_9212_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_aide_com_gzbz_protobuf_S2C_HeroAideUniteSkill_9212_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChange_9213_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChange_9213_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_aide_com_gzbz_protobuf_S2C_HeroAideChange_9214_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_aide_com_gzbz_protobuf_S2C_HeroAideChange_9214_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_aide_com_gzbz_protobuf_C2S_HeroAideCanSel_9215_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_aide_com_gzbz_protobuf_C2S_HeroAideCanSel_9215_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_aide_com_gzbz_protobuf_S2C_HeroAideCanSel_9216_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_aide_com_gzbz_protobuf_S2C_HeroAideCanSel_9216_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChangeInBag_9217_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChangeInBag_9217_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_aide_com_gzbz_protobuf_S2C_HeroAideInBag_9218_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_aide_com_gzbz_protobuf_S2C_HeroAideInBag_9218_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private AideMsg() {
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
      String[] descriptorData = new String[]{"\n\u000eHeroAide.proto\u0012\u0016aide.com.gzbz.protobuf\"C\n\u0017C2S_HeroAideChoice_9201\u0012\f\n\u0004hero\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004item\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004site\u0018\u0003 \u0002(\u0005\"E\n\u0017S2C_HeroAideChoice_9202\u0012\f\n\u0004hero\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006aideId\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004site\u0018\u0003 \u0002(\u0005\"3\n\u0015C2S_HeroAideDown_9203\u0012\f\n\u0004hero\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004site\u0018\u0002 \u0002(\u0005\"3\n\u0015S2C_HeroAideDown_9204\u0012\f\n\u0004hero\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004site\u0018\u0002 \u0002(\u0005\"I\n\u0018C2S_HeroAideUpgrade_9205\u0012\f\n\u0004hero\u0018\u0001 \u0002(\u0005\u0012\u0011\n\titemCodes\u0018\u0002 \u0003(\u0005\u0012\f\n\u0004site\u0018\u0003 \u0002(\u0005\"F\n\u0018S2C_HeroAideUpgrade_9206\u0012\f\n\u0004hero\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006aideId\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004site\u0018\u0003 \u0002(\u0005\"\u0019\n\u0017C2S_HeroAideRecord_9207\"*\n\u0017S2C_HeroAideRecord_9208\u0012\u000f\n\u0007itemIds\u0018\u0001 \u0003(\u0005\"2\n!C2S_HeroAideOneKeyDiscompose_9209\u0012\r\n\u0005codes\u0018\u0001 \u0003(\u0005\"2\n!S2C_HeroAideOneKeyDiscompose_9210\u0012\r\n\u0005codes\u0018\u0001 \u0003(\u0005\"C\n\u001bC2S_HeroAideUniteSkill_9211\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ntrammelsId\u0018\u0002 \u0002(\u0005\"C\n\u001bS2C_HeroAideUniteSkill_9212\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ntrammelsId\u0018\u0002 \u0002(\u0005\"I\n\u0017C2S_HeroAideChange_9213\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004site\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006itemId\u0018\u0003 \u0002(\u0005\"I\n\u0017S2C_HeroAideChange_9214\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004site\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006itemId\u0018\u0003 \u0002(\u0005\"+\n\u0017C2S_HeroAideCanSel_9215\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\"+\n\u0017S2C_HeroAideCanSel_9216\u0012\u0010\n\btrammels\u0018\u0001 \u0003(\u0005\"@\n\u001cC2S_HeroAideChangeInBag_9217\u0012\u0010\n\bitemCode\u0018\u0001 \u0003(\u0005\u0012\u000e\n\u0006itemId\u0018\u0002 \u0002(\u0005\":\n\u0016S2C_HeroAideInBag_9218\u0012\u0010\n\bitemCode\u0018\u0001 \u0003(\u0005\u0012\u000e\n\u0006itemId\u0018\u0002 \u0002(\u0005B\u001e\n\u0011com.gzbz.protobufB\u0007AideMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChoice_9201_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChoice_9201_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChoice_9201_descriptor, new String[]{"Hero", "Item", "Site"});
      internal_static_aide_com_gzbz_protobuf_S2C_HeroAideChoice_9202_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_aide_com_gzbz_protobuf_S2C_HeroAideChoice_9202_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_aide_com_gzbz_protobuf_S2C_HeroAideChoice_9202_descriptor, new String[]{"Hero", "AideId", "Site"});
      internal_static_aide_com_gzbz_protobuf_C2S_HeroAideDown_9203_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_aide_com_gzbz_protobuf_C2S_HeroAideDown_9203_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_aide_com_gzbz_protobuf_C2S_HeroAideDown_9203_descriptor, new String[]{"Hero", "Site"});
      internal_static_aide_com_gzbz_protobuf_S2C_HeroAideDown_9204_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_aide_com_gzbz_protobuf_S2C_HeroAideDown_9204_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_aide_com_gzbz_protobuf_S2C_HeroAideDown_9204_descriptor, new String[]{"Hero", "Site"});
      internal_static_aide_com_gzbz_protobuf_C2S_HeroAideUpgrade_9205_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_aide_com_gzbz_protobuf_C2S_HeroAideUpgrade_9205_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_aide_com_gzbz_protobuf_C2S_HeroAideUpgrade_9205_descriptor, new String[]{"Hero", "ItemCodes", "Site"});
      internal_static_aide_com_gzbz_protobuf_S2C_HeroAideUpgrade_9206_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_aide_com_gzbz_protobuf_S2C_HeroAideUpgrade_9206_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_aide_com_gzbz_protobuf_S2C_HeroAideUpgrade_9206_descriptor, new String[]{"Hero", "AideId", "Site"});
      internal_static_aide_com_gzbz_protobuf_C2S_HeroAideRecord_9207_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_aide_com_gzbz_protobuf_C2S_HeroAideRecord_9207_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_aide_com_gzbz_protobuf_C2S_HeroAideRecord_9207_descriptor, new String[0]);
      internal_static_aide_com_gzbz_protobuf_S2C_HeroAideRecord_9208_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_aide_com_gzbz_protobuf_S2C_HeroAideRecord_9208_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_aide_com_gzbz_protobuf_S2C_HeroAideRecord_9208_descriptor, new String[]{"ItemIds"});
      internal_static_aide_com_gzbz_protobuf_C2S_HeroAideOneKeyDiscompose_9209_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_aide_com_gzbz_protobuf_C2S_HeroAideOneKeyDiscompose_9209_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_aide_com_gzbz_protobuf_C2S_HeroAideOneKeyDiscompose_9209_descriptor, new String[]{"Codes"});
      internal_static_aide_com_gzbz_protobuf_S2C_HeroAideOneKeyDiscompose_9210_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_aide_com_gzbz_protobuf_S2C_HeroAideOneKeyDiscompose_9210_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_aide_com_gzbz_protobuf_S2C_HeroAideOneKeyDiscompose_9210_descriptor, new String[]{"Codes"});
      internal_static_aide_com_gzbz_protobuf_C2S_HeroAideUniteSkill_9211_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_aide_com_gzbz_protobuf_C2S_HeroAideUniteSkill_9211_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_aide_com_gzbz_protobuf_C2S_HeroAideUniteSkill_9211_descriptor, new String[]{"HeroCode", "TrammelsId"});
      internal_static_aide_com_gzbz_protobuf_S2C_HeroAideUniteSkill_9212_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_aide_com_gzbz_protobuf_S2C_HeroAideUniteSkill_9212_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_aide_com_gzbz_protobuf_S2C_HeroAideUniteSkill_9212_descriptor, new String[]{"HeroCode", "TrammelsId"});
      internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChange_9213_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChange_9213_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChange_9213_descriptor, new String[]{"HeroCode", "Site", "ItemId"});
      internal_static_aide_com_gzbz_protobuf_S2C_HeroAideChange_9214_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_aide_com_gzbz_protobuf_S2C_HeroAideChange_9214_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_aide_com_gzbz_protobuf_S2C_HeroAideChange_9214_descriptor, new String[]{"HeroCode", "Site", "ItemId"});
      internal_static_aide_com_gzbz_protobuf_C2S_HeroAideCanSel_9215_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_aide_com_gzbz_protobuf_C2S_HeroAideCanSel_9215_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_aide_com_gzbz_protobuf_C2S_HeroAideCanSel_9215_descriptor, new String[]{"HeroCode"});
      internal_static_aide_com_gzbz_protobuf_S2C_HeroAideCanSel_9216_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_aide_com_gzbz_protobuf_S2C_HeroAideCanSel_9216_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_aide_com_gzbz_protobuf_S2C_HeroAideCanSel_9216_descriptor, new String[]{"Trammels"});
      internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChangeInBag_9217_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChangeInBag_9217_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChangeInBag_9217_descriptor, new String[]{"ItemCode", "ItemId"});
      internal_static_aide_com_gzbz_protobuf_S2C_HeroAideInBag_9218_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_aide_com_gzbz_protobuf_S2C_HeroAideInBag_9218_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_aide_com_gzbz_protobuf_S2C_HeroAideInBag_9218_descriptor, new String[]{"ItemCode", "ItemId"});
   }

   public static final class C2S_HeroAideChoice_9201 extends GeneratedMessageV3 implements C2S_HeroAideChoice_9201OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HERO_FIELD_NUMBER = 1;
      private int hero_;
      public static final int ITEM_FIELD_NUMBER = 2;
      private int item_;
      public static final int SITE_FIELD_NUMBER = 3;
      private int site_;
      private byte memoizedIsInitialized;
      private static final C2S_HeroAideChoice_9201 DEFAULT_INSTANCE = new C2S_HeroAideChoice_9201();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroAideChoice_9201> PARSER = new AbstractParser<C2S_HeroAideChoice_9201>() {
         public C2S_HeroAideChoice_9201 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroAideChoice_9201(input, extensionRegistry);
         }
      };

      private C2S_HeroAideChoice_9201(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroAideChoice_9201() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroAideChoice_9201();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroAideChoice_9201(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.hero_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.item_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.site_ = input.readInt32();
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
         return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChoice_9201_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChoice_9201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroAideChoice_9201.class, Builder.class);
      }

      public boolean hasHero() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHero() {
         return this.hero_;
      }

      public boolean hasItem() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getItem() {
         return this.item_;
      }

      public boolean hasSite() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSite() {
         return this.site_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHero()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasItem()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSite()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.hero_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.item_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.site_);
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
               size += CodedOutputStream.computeInt32Size(1, this.hero_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.item_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.site_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_HeroAideChoice_9201)) {
            return super.equals(obj);
         } else {
            C2S_HeroAideChoice_9201 other = (C2S_HeroAideChoice_9201)obj;
            if (this.hasHero() != other.hasHero()) {
               return false;
            } else if (this.hasHero() && this.getHero() != other.getHero()) {
               return false;
            } else if (this.hasItem() != other.hasItem()) {
               return false;
            } else if (this.hasItem() && this.getItem() != other.getItem()) {
               return false;
            } else if (this.hasSite() != other.hasSite()) {
               return false;
            } else if (this.hasSite() && this.getSite() != other.getSite()) {
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
            if (this.hasHero()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHero();
            }

            if (this.hasItem()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItem();
            }

            if (this.hasSite()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSite();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_HeroAideChoice_9201 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideChoice_9201)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideChoice_9201 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideChoice_9201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideChoice_9201 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideChoice_9201)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideChoice_9201 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideChoice_9201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideChoice_9201 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideChoice_9201)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideChoice_9201 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideChoice_9201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideChoice_9201 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroAideChoice_9201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroAideChoice_9201 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideChoice_9201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroAideChoice_9201 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroAideChoice_9201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroAideChoice_9201 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideChoice_9201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroAideChoice_9201 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroAideChoice_9201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroAideChoice_9201 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideChoice_9201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroAideChoice_9201 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroAideChoice_9201 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroAideChoice_9201> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroAideChoice_9201> getParserForType() {
         return PARSER;
      }

      public C2S_HeroAideChoice_9201 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroAideChoice_9201OrBuilder {
         private int bitField0_;
         private int hero_;
         private int item_;
         private int site_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChoice_9201_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChoice_9201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroAideChoice_9201.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AideMsg.C2S_HeroAideChoice_9201.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.hero_ = 0;
            this.bitField0_ &= -2;
            this.item_ = 0;
            this.bitField0_ &= -3;
            this.site_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChoice_9201_descriptor;
         }

         public C2S_HeroAideChoice_9201 getDefaultInstanceForType() {
            return AideMsg.C2S_HeroAideChoice_9201.getDefaultInstance();
         }

         public C2S_HeroAideChoice_9201 build() {
            C2S_HeroAideChoice_9201 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroAideChoice_9201 buildPartial() {
            C2S_HeroAideChoice_9201 result = new C2S_HeroAideChoice_9201(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.hero_ = this.hero_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.item_ = this.item_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.site_ = this.site_;
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
            if (other instanceof C2S_HeroAideChoice_9201) {
               return this.mergeFrom((C2S_HeroAideChoice_9201)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroAideChoice_9201 other) {
            if (other == AideMsg.C2S_HeroAideChoice_9201.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHero()) {
                  this.setHero(other.getHero());
               }

               if (other.hasItem()) {
                  this.setItem(other.getItem());
               }

               if (other.hasSite()) {
                  this.setSite(other.getSite());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHero()) {
               return false;
            } else if (!this.hasItem()) {
               return false;
            } else {
               return this.hasSite();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_HeroAideChoice_9201 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroAideChoice_9201)AideMsg.C2S_HeroAideChoice_9201.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroAideChoice_9201)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHero() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHero() {
            return this.hero_;
         }

         public Builder setHero(int value) {
            this.bitField0_ |= 1;
            this.hero_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHero() {
            this.bitField0_ &= -2;
            this.hero_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasItem() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getItem() {
            return this.item_;
         }

         public Builder setItem(int value) {
            this.bitField0_ |= 2;
            this.item_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItem() {
            this.bitField0_ &= -3;
            this.item_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSite() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSite() {
            return this.site_;
         }

         public Builder setSite(int value) {
            this.bitField0_ |= 4;
            this.site_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSite() {
            this.bitField0_ &= -5;
            this.site_ = 0;
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

   public static final class S2C_HeroAideChoice_9202 extends GeneratedMessageV3 implements S2C_HeroAideChoice_9202OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HERO_FIELD_NUMBER = 1;
      private int hero_;
      public static final int AIDEID_FIELD_NUMBER = 2;
      private int aideId_;
      public static final int SITE_FIELD_NUMBER = 3;
      private int site_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroAideChoice_9202 DEFAULT_INSTANCE = new S2C_HeroAideChoice_9202();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroAideChoice_9202> PARSER = new AbstractParser<S2C_HeroAideChoice_9202>() {
         public S2C_HeroAideChoice_9202 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroAideChoice_9202(input, extensionRegistry);
         }
      };

      private S2C_HeroAideChoice_9202(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroAideChoice_9202() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroAideChoice_9202();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroAideChoice_9202(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.hero_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.aideId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.site_ = input.readInt32();
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
         return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideChoice_9202_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideChoice_9202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroAideChoice_9202.class, Builder.class);
      }

      public boolean hasHero() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHero() {
         return this.hero_;
      }

      public boolean hasAideId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getAideId() {
         return this.aideId_;
      }

      public boolean hasSite() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSite() {
         return this.site_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHero()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAideId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSite()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.hero_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.aideId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.site_);
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
               size += CodedOutputStream.computeInt32Size(1, this.hero_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.aideId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.site_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HeroAideChoice_9202)) {
            return super.equals(obj);
         } else {
            S2C_HeroAideChoice_9202 other = (S2C_HeroAideChoice_9202)obj;
            if (this.hasHero() != other.hasHero()) {
               return false;
            } else if (this.hasHero() && this.getHero() != other.getHero()) {
               return false;
            } else if (this.hasAideId() != other.hasAideId()) {
               return false;
            } else if (this.hasAideId() && this.getAideId() != other.getAideId()) {
               return false;
            } else if (this.hasSite() != other.hasSite()) {
               return false;
            } else if (this.hasSite() && this.getSite() != other.getSite()) {
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
            if (this.hasHero()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHero();
            }

            if (this.hasAideId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAideId();
            }

            if (this.hasSite()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSite();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HeroAideChoice_9202 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideChoice_9202)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideChoice_9202 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideChoice_9202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideChoice_9202 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideChoice_9202)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideChoice_9202 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideChoice_9202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideChoice_9202 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideChoice_9202)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideChoice_9202 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideChoice_9202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideChoice_9202 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroAideChoice_9202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroAideChoice_9202 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideChoice_9202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroAideChoice_9202 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroAideChoice_9202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroAideChoice_9202 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideChoice_9202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroAideChoice_9202 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroAideChoice_9202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroAideChoice_9202 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideChoice_9202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroAideChoice_9202 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroAideChoice_9202 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroAideChoice_9202> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroAideChoice_9202> getParserForType() {
         return PARSER;
      }

      public S2C_HeroAideChoice_9202 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroAideChoice_9202OrBuilder {
         private int bitField0_;
         private int hero_;
         private int aideId_;
         private int site_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideChoice_9202_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideChoice_9202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroAideChoice_9202.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AideMsg.S2C_HeroAideChoice_9202.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.hero_ = 0;
            this.bitField0_ &= -2;
            this.aideId_ = 0;
            this.bitField0_ &= -3;
            this.site_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideChoice_9202_descriptor;
         }

         public S2C_HeroAideChoice_9202 getDefaultInstanceForType() {
            return AideMsg.S2C_HeroAideChoice_9202.getDefaultInstance();
         }

         public S2C_HeroAideChoice_9202 build() {
            S2C_HeroAideChoice_9202 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroAideChoice_9202 buildPartial() {
            S2C_HeroAideChoice_9202 result = new S2C_HeroAideChoice_9202(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.hero_ = this.hero_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.aideId_ = this.aideId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.site_ = this.site_;
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
            if (other instanceof S2C_HeroAideChoice_9202) {
               return this.mergeFrom((S2C_HeroAideChoice_9202)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroAideChoice_9202 other) {
            if (other == AideMsg.S2C_HeroAideChoice_9202.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHero()) {
                  this.setHero(other.getHero());
               }

               if (other.hasAideId()) {
                  this.setAideId(other.getAideId());
               }

               if (other.hasSite()) {
                  this.setSite(other.getSite());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHero()) {
               return false;
            } else if (!this.hasAideId()) {
               return false;
            } else {
               return this.hasSite();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HeroAideChoice_9202 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroAideChoice_9202)AideMsg.S2C_HeroAideChoice_9202.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroAideChoice_9202)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHero() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHero() {
            return this.hero_;
         }

         public Builder setHero(int value) {
            this.bitField0_ |= 1;
            this.hero_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHero() {
            this.bitField0_ &= -2;
            this.hero_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAideId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getAideId() {
            return this.aideId_;
         }

         public Builder setAideId(int value) {
            this.bitField0_ |= 2;
            this.aideId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAideId() {
            this.bitField0_ &= -3;
            this.aideId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSite() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSite() {
            return this.site_;
         }

         public Builder setSite(int value) {
            this.bitField0_ |= 4;
            this.site_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSite() {
            this.bitField0_ &= -5;
            this.site_ = 0;
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

   public static final class C2S_HeroAideDown_9203 extends GeneratedMessageV3 implements C2S_HeroAideDown_9203OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HERO_FIELD_NUMBER = 1;
      private int hero_;
      public static final int SITE_FIELD_NUMBER = 2;
      private int site_;
      private byte memoizedIsInitialized;
      private static final C2S_HeroAideDown_9203 DEFAULT_INSTANCE = new C2S_HeroAideDown_9203();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroAideDown_9203> PARSER = new AbstractParser<C2S_HeroAideDown_9203>() {
         public C2S_HeroAideDown_9203 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroAideDown_9203(input, extensionRegistry);
         }
      };

      private C2S_HeroAideDown_9203(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroAideDown_9203() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroAideDown_9203();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroAideDown_9203(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.hero_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.site_ = input.readInt32();
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
         return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideDown_9203_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideDown_9203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroAideDown_9203.class, Builder.class);
      }

      public boolean hasHero() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHero() {
         return this.hero_;
      }

      public boolean hasSite() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSite() {
         return this.site_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHero()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSite()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.hero_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.site_);
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
               size += CodedOutputStream.computeInt32Size(1, this.hero_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.site_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_HeroAideDown_9203)) {
            return super.equals(obj);
         } else {
            C2S_HeroAideDown_9203 other = (C2S_HeroAideDown_9203)obj;
            if (this.hasHero() != other.hasHero()) {
               return false;
            } else if (this.hasHero() && this.getHero() != other.getHero()) {
               return false;
            } else if (this.hasSite() != other.hasSite()) {
               return false;
            } else if (this.hasSite() && this.getSite() != other.getSite()) {
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
            if (this.hasHero()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHero();
            }

            if (this.hasSite()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSite();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_HeroAideDown_9203 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideDown_9203)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideDown_9203 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideDown_9203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideDown_9203 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideDown_9203)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideDown_9203 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideDown_9203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideDown_9203 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideDown_9203)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideDown_9203 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideDown_9203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideDown_9203 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroAideDown_9203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroAideDown_9203 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideDown_9203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroAideDown_9203 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroAideDown_9203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroAideDown_9203 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideDown_9203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroAideDown_9203 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroAideDown_9203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroAideDown_9203 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideDown_9203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroAideDown_9203 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroAideDown_9203 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroAideDown_9203> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroAideDown_9203> getParserForType() {
         return PARSER;
      }

      public C2S_HeroAideDown_9203 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroAideDown_9203OrBuilder {
         private int bitField0_;
         private int hero_;
         private int site_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideDown_9203_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideDown_9203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroAideDown_9203.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AideMsg.C2S_HeroAideDown_9203.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.hero_ = 0;
            this.bitField0_ &= -2;
            this.site_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideDown_9203_descriptor;
         }

         public C2S_HeroAideDown_9203 getDefaultInstanceForType() {
            return AideMsg.C2S_HeroAideDown_9203.getDefaultInstance();
         }

         public C2S_HeroAideDown_9203 build() {
            C2S_HeroAideDown_9203 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroAideDown_9203 buildPartial() {
            C2S_HeroAideDown_9203 result = new C2S_HeroAideDown_9203(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.hero_ = this.hero_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.site_ = this.site_;
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
            if (other instanceof C2S_HeroAideDown_9203) {
               return this.mergeFrom((C2S_HeroAideDown_9203)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroAideDown_9203 other) {
            if (other == AideMsg.C2S_HeroAideDown_9203.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHero()) {
                  this.setHero(other.getHero());
               }

               if (other.hasSite()) {
                  this.setSite(other.getSite());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHero()) {
               return false;
            } else {
               return this.hasSite();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_HeroAideDown_9203 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroAideDown_9203)AideMsg.C2S_HeroAideDown_9203.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroAideDown_9203)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHero() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHero() {
            return this.hero_;
         }

         public Builder setHero(int value) {
            this.bitField0_ |= 1;
            this.hero_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHero() {
            this.bitField0_ &= -2;
            this.hero_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSite() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSite() {
            return this.site_;
         }

         public Builder setSite(int value) {
            this.bitField0_ |= 2;
            this.site_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSite() {
            this.bitField0_ &= -3;
            this.site_ = 0;
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

   public static final class S2C_HeroAideDown_9204 extends GeneratedMessageV3 implements S2C_HeroAideDown_9204OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HERO_FIELD_NUMBER = 1;
      private int hero_;
      public static final int SITE_FIELD_NUMBER = 2;
      private int site_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroAideDown_9204 DEFAULT_INSTANCE = new S2C_HeroAideDown_9204();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroAideDown_9204> PARSER = new AbstractParser<S2C_HeroAideDown_9204>() {
         public S2C_HeroAideDown_9204 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroAideDown_9204(input, extensionRegistry);
         }
      };

      private S2C_HeroAideDown_9204(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroAideDown_9204() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroAideDown_9204();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroAideDown_9204(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.hero_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.site_ = input.readInt32();
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
         return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideDown_9204_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideDown_9204_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroAideDown_9204.class, Builder.class);
      }

      public boolean hasHero() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHero() {
         return this.hero_;
      }

      public boolean hasSite() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSite() {
         return this.site_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHero()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSite()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.hero_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.site_);
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
               size += CodedOutputStream.computeInt32Size(1, this.hero_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.site_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HeroAideDown_9204)) {
            return super.equals(obj);
         } else {
            S2C_HeroAideDown_9204 other = (S2C_HeroAideDown_9204)obj;
            if (this.hasHero() != other.hasHero()) {
               return false;
            } else if (this.hasHero() && this.getHero() != other.getHero()) {
               return false;
            } else if (this.hasSite() != other.hasSite()) {
               return false;
            } else if (this.hasSite() && this.getSite() != other.getSite()) {
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
            if (this.hasHero()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHero();
            }

            if (this.hasSite()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSite();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HeroAideDown_9204 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideDown_9204)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideDown_9204 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideDown_9204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideDown_9204 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideDown_9204)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideDown_9204 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideDown_9204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideDown_9204 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideDown_9204)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideDown_9204 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideDown_9204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideDown_9204 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroAideDown_9204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroAideDown_9204 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideDown_9204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroAideDown_9204 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroAideDown_9204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroAideDown_9204 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideDown_9204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroAideDown_9204 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroAideDown_9204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroAideDown_9204 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideDown_9204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroAideDown_9204 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroAideDown_9204 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroAideDown_9204> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroAideDown_9204> getParserForType() {
         return PARSER;
      }

      public S2C_HeroAideDown_9204 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroAideDown_9204OrBuilder {
         private int bitField0_;
         private int hero_;
         private int site_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideDown_9204_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideDown_9204_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroAideDown_9204.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AideMsg.S2C_HeroAideDown_9204.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.hero_ = 0;
            this.bitField0_ &= -2;
            this.site_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideDown_9204_descriptor;
         }

         public S2C_HeroAideDown_9204 getDefaultInstanceForType() {
            return AideMsg.S2C_HeroAideDown_9204.getDefaultInstance();
         }

         public S2C_HeroAideDown_9204 build() {
            S2C_HeroAideDown_9204 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroAideDown_9204 buildPartial() {
            S2C_HeroAideDown_9204 result = new S2C_HeroAideDown_9204(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.hero_ = this.hero_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.site_ = this.site_;
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
            if (other instanceof S2C_HeroAideDown_9204) {
               return this.mergeFrom((S2C_HeroAideDown_9204)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroAideDown_9204 other) {
            if (other == AideMsg.S2C_HeroAideDown_9204.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHero()) {
                  this.setHero(other.getHero());
               }

               if (other.hasSite()) {
                  this.setSite(other.getSite());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHero()) {
               return false;
            } else {
               return this.hasSite();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HeroAideDown_9204 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroAideDown_9204)AideMsg.S2C_HeroAideDown_9204.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroAideDown_9204)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHero() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHero() {
            return this.hero_;
         }

         public Builder setHero(int value) {
            this.bitField0_ |= 1;
            this.hero_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHero() {
            this.bitField0_ &= -2;
            this.hero_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSite() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSite() {
            return this.site_;
         }

         public Builder setSite(int value) {
            this.bitField0_ |= 2;
            this.site_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSite() {
            this.bitField0_ &= -3;
            this.site_ = 0;
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

   public static final class C2S_HeroAideUpgrade_9205 extends GeneratedMessageV3 implements C2S_HeroAideUpgrade_9205OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HERO_FIELD_NUMBER = 1;
      private int hero_;
      public static final int ITEMCODES_FIELD_NUMBER = 2;
      private Internal.IntList itemCodes_;
      public static final int SITE_FIELD_NUMBER = 3;
      private int site_;
      private byte memoizedIsInitialized;
      private static final C2S_HeroAideUpgrade_9205 DEFAULT_INSTANCE = new C2S_HeroAideUpgrade_9205();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroAideUpgrade_9205> PARSER = new AbstractParser<C2S_HeroAideUpgrade_9205>() {
         public C2S_HeroAideUpgrade_9205 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroAideUpgrade_9205(input, extensionRegistry);
         }
      };

      private C2S_HeroAideUpgrade_9205(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroAideUpgrade_9205() {
         this.memoizedIsInitialized = -1;
         this.itemCodes_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroAideUpgrade_9205();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroAideUpgrade_9205(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.hero_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.itemCodes_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.itemCodes_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.itemCodes_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.site_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.itemCodes_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.itemCodes_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideUpgrade_9205_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideUpgrade_9205_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroAideUpgrade_9205.class, Builder.class);
      }

      public boolean hasHero() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHero() {
         return this.hero_;
      }

      public List<Integer> getItemCodesList() {
         return this.itemCodes_;
      }

      public int getItemCodesCount() {
         return this.itemCodes_.size();
      }

      public int getItemCodes(int index) {
         return this.itemCodes_.getInt(index);
      }

      public boolean hasSite() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSite() {
         return this.site_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHero()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSite()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.hero_);
         }

         for(int i = 0; i < this.itemCodes_.size(); ++i) {
            output.writeInt32(2, this.itemCodes_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.site_);
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
               size += CodedOutputStream.computeInt32Size(1, this.hero_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.itemCodes_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.itemCodes_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getItemCodesList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.site_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_HeroAideUpgrade_9205)) {
            return super.equals(obj);
         } else {
            C2S_HeroAideUpgrade_9205 other = (C2S_HeroAideUpgrade_9205)obj;
            if (this.hasHero() != other.hasHero()) {
               return false;
            } else if (this.hasHero() && this.getHero() != other.getHero()) {
               return false;
            } else if (!this.getItemCodesList().equals(other.getItemCodesList())) {
               return false;
            } else if (this.hasSite() != other.hasSite()) {
               return false;
            } else if (this.hasSite() && this.getSite() != other.getSite()) {
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
            if (this.hasHero()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHero();
            }

            if (this.getItemCodesCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemCodesList().hashCode();
            }

            if (this.hasSite()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSite();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_HeroAideUpgrade_9205 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideUpgrade_9205)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideUpgrade_9205 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideUpgrade_9205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideUpgrade_9205 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideUpgrade_9205)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideUpgrade_9205 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideUpgrade_9205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideUpgrade_9205 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideUpgrade_9205)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideUpgrade_9205 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideUpgrade_9205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideUpgrade_9205 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroAideUpgrade_9205)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroAideUpgrade_9205 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideUpgrade_9205)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroAideUpgrade_9205 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroAideUpgrade_9205)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroAideUpgrade_9205 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideUpgrade_9205)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroAideUpgrade_9205 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroAideUpgrade_9205)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroAideUpgrade_9205 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideUpgrade_9205)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroAideUpgrade_9205 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroAideUpgrade_9205 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroAideUpgrade_9205> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroAideUpgrade_9205> getParserForType() {
         return PARSER;
      }

      public C2S_HeroAideUpgrade_9205 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroAideUpgrade_9205OrBuilder {
         private int bitField0_;
         private int hero_;
         private Internal.IntList itemCodes_;
         private int site_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideUpgrade_9205_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideUpgrade_9205_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroAideUpgrade_9205.class, Builder.class);
         }

         private Builder() {
            this.itemCodes_ = AideMsg.C2S_HeroAideUpgrade_9205.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.itemCodes_ = AideMsg.C2S_HeroAideUpgrade_9205.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AideMsg.C2S_HeroAideUpgrade_9205.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.hero_ = 0;
            this.bitField0_ &= -2;
            this.itemCodes_ = AideMsg.C2S_HeroAideUpgrade_9205.emptyIntList();
            this.bitField0_ &= -3;
            this.site_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideUpgrade_9205_descriptor;
         }

         public C2S_HeroAideUpgrade_9205 getDefaultInstanceForType() {
            return AideMsg.C2S_HeroAideUpgrade_9205.getDefaultInstance();
         }

         public C2S_HeroAideUpgrade_9205 build() {
            C2S_HeroAideUpgrade_9205 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroAideUpgrade_9205 buildPartial() {
            C2S_HeroAideUpgrade_9205 result = new C2S_HeroAideUpgrade_9205(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.hero_ = this.hero_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.itemCodes_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.itemCodes_ = this.itemCodes_;
            if ((from_bitField0_ & 4) != 0) {
               result.site_ = this.site_;
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
            if (other instanceof C2S_HeroAideUpgrade_9205) {
               return this.mergeFrom((C2S_HeroAideUpgrade_9205)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroAideUpgrade_9205 other) {
            if (other == AideMsg.C2S_HeroAideUpgrade_9205.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHero()) {
                  this.setHero(other.getHero());
               }

               if (!other.itemCodes_.isEmpty()) {
                  if (this.itemCodes_.isEmpty()) {
                     this.itemCodes_ = other.itemCodes_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureItemCodesIsMutable();
                     this.itemCodes_.addAll(other.itemCodes_);
                  }

                  this.onChanged();
               }

               if (other.hasSite()) {
                  this.setSite(other.getSite());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHero()) {
               return false;
            } else {
               return this.hasSite();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_HeroAideUpgrade_9205 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroAideUpgrade_9205)AideMsg.C2S_HeroAideUpgrade_9205.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroAideUpgrade_9205)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHero() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHero() {
            return this.hero_;
         }

         public Builder setHero(int value) {
            this.bitField0_ |= 1;
            this.hero_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHero() {
            this.bitField0_ &= -2;
            this.hero_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureItemCodesIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.itemCodes_ = AideMsg.C2S_HeroAideUpgrade_9205.mutableCopy(this.itemCodes_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getItemCodesList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.itemCodes_) : this.itemCodes_);
         }

         public int getItemCodesCount() {
            return this.itemCodes_.size();
         }

         public int getItemCodes(int index) {
            return this.itemCodes_.getInt(index);
         }

         public Builder setItemCodes(int index, int value) {
            this.ensureItemCodesIsMutable();
            this.itemCodes_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addItemCodes(int value) {
            this.ensureItemCodesIsMutable();
            this.itemCodes_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllItemCodes(Iterable<? extends Integer> values) {
            this.ensureItemCodesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.itemCodes_);
            this.onChanged();
            return this;
         }

         public Builder clearItemCodes() {
            this.itemCodes_ = AideMsg.C2S_HeroAideUpgrade_9205.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasSite() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSite() {
            return this.site_;
         }

         public Builder setSite(int value) {
            this.bitField0_ |= 4;
            this.site_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSite() {
            this.bitField0_ &= -5;
            this.site_ = 0;
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

   public static final class S2C_HeroAideUpgrade_9206 extends GeneratedMessageV3 implements S2C_HeroAideUpgrade_9206OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HERO_FIELD_NUMBER = 1;
      private int hero_;
      public static final int AIDEID_FIELD_NUMBER = 2;
      private int aideId_;
      public static final int SITE_FIELD_NUMBER = 3;
      private int site_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroAideUpgrade_9206 DEFAULT_INSTANCE = new S2C_HeroAideUpgrade_9206();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroAideUpgrade_9206> PARSER = new AbstractParser<S2C_HeroAideUpgrade_9206>() {
         public S2C_HeroAideUpgrade_9206 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroAideUpgrade_9206(input, extensionRegistry);
         }
      };

      private S2C_HeroAideUpgrade_9206(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroAideUpgrade_9206() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroAideUpgrade_9206();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroAideUpgrade_9206(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.hero_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.aideId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.site_ = input.readInt32();
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
         return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideUpgrade_9206_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideUpgrade_9206_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroAideUpgrade_9206.class, Builder.class);
      }

      public boolean hasHero() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHero() {
         return this.hero_;
      }

      public boolean hasAideId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getAideId() {
         return this.aideId_;
      }

      public boolean hasSite() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSite() {
         return this.site_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHero()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAideId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSite()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.hero_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.aideId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.site_);
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
               size += CodedOutputStream.computeInt32Size(1, this.hero_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.aideId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.site_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HeroAideUpgrade_9206)) {
            return super.equals(obj);
         } else {
            S2C_HeroAideUpgrade_9206 other = (S2C_HeroAideUpgrade_9206)obj;
            if (this.hasHero() != other.hasHero()) {
               return false;
            } else if (this.hasHero() && this.getHero() != other.getHero()) {
               return false;
            } else if (this.hasAideId() != other.hasAideId()) {
               return false;
            } else if (this.hasAideId() && this.getAideId() != other.getAideId()) {
               return false;
            } else if (this.hasSite() != other.hasSite()) {
               return false;
            } else if (this.hasSite() && this.getSite() != other.getSite()) {
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
            if (this.hasHero()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHero();
            }

            if (this.hasAideId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAideId();
            }

            if (this.hasSite()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSite();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HeroAideUpgrade_9206 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideUpgrade_9206)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideUpgrade_9206 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideUpgrade_9206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideUpgrade_9206 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideUpgrade_9206)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideUpgrade_9206 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideUpgrade_9206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideUpgrade_9206 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideUpgrade_9206)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideUpgrade_9206 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideUpgrade_9206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideUpgrade_9206 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroAideUpgrade_9206)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroAideUpgrade_9206 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideUpgrade_9206)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroAideUpgrade_9206 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroAideUpgrade_9206)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroAideUpgrade_9206 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideUpgrade_9206)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroAideUpgrade_9206 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroAideUpgrade_9206)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroAideUpgrade_9206 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideUpgrade_9206)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroAideUpgrade_9206 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroAideUpgrade_9206 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroAideUpgrade_9206> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroAideUpgrade_9206> getParserForType() {
         return PARSER;
      }

      public S2C_HeroAideUpgrade_9206 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroAideUpgrade_9206OrBuilder {
         private int bitField0_;
         private int hero_;
         private int aideId_;
         private int site_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideUpgrade_9206_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideUpgrade_9206_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroAideUpgrade_9206.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AideMsg.S2C_HeroAideUpgrade_9206.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.hero_ = 0;
            this.bitField0_ &= -2;
            this.aideId_ = 0;
            this.bitField0_ &= -3;
            this.site_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideUpgrade_9206_descriptor;
         }

         public S2C_HeroAideUpgrade_9206 getDefaultInstanceForType() {
            return AideMsg.S2C_HeroAideUpgrade_9206.getDefaultInstance();
         }

         public S2C_HeroAideUpgrade_9206 build() {
            S2C_HeroAideUpgrade_9206 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroAideUpgrade_9206 buildPartial() {
            S2C_HeroAideUpgrade_9206 result = new S2C_HeroAideUpgrade_9206(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.hero_ = this.hero_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.aideId_ = this.aideId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.site_ = this.site_;
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
            if (other instanceof S2C_HeroAideUpgrade_9206) {
               return this.mergeFrom((S2C_HeroAideUpgrade_9206)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroAideUpgrade_9206 other) {
            if (other == AideMsg.S2C_HeroAideUpgrade_9206.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHero()) {
                  this.setHero(other.getHero());
               }

               if (other.hasAideId()) {
                  this.setAideId(other.getAideId());
               }

               if (other.hasSite()) {
                  this.setSite(other.getSite());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHero()) {
               return false;
            } else if (!this.hasAideId()) {
               return false;
            } else {
               return this.hasSite();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HeroAideUpgrade_9206 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroAideUpgrade_9206)AideMsg.S2C_HeroAideUpgrade_9206.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroAideUpgrade_9206)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHero() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHero() {
            return this.hero_;
         }

         public Builder setHero(int value) {
            this.bitField0_ |= 1;
            this.hero_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHero() {
            this.bitField0_ &= -2;
            this.hero_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAideId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getAideId() {
            return this.aideId_;
         }

         public Builder setAideId(int value) {
            this.bitField0_ |= 2;
            this.aideId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAideId() {
            this.bitField0_ &= -3;
            this.aideId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSite() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSite() {
            return this.site_;
         }

         public Builder setSite(int value) {
            this.bitField0_ |= 4;
            this.site_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSite() {
            this.bitField0_ &= -5;
            this.site_ = 0;
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

   public static final class C2S_HeroAideRecord_9207 extends GeneratedMessageV3 implements C2S_HeroAideRecord_9207OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_HeroAideRecord_9207 DEFAULT_INSTANCE = new C2S_HeroAideRecord_9207();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroAideRecord_9207> PARSER = new AbstractParser<C2S_HeroAideRecord_9207>() {
         public C2S_HeroAideRecord_9207 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroAideRecord_9207(input, extensionRegistry);
         }
      };

      private C2S_HeroAideRecord_9207(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroAideRecord_9207() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroAideRecord_9207();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroAideRecord_9207(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideRecord_9207_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideRecord_9207_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroAideRecord_9207.class, Builder.class);
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
         } else if (!(obj instanceof C2S_HeroAideRecord_9207)) {
            return super.equals(obj);
         } else {
            C2S_HeroAideRecord_9207 other = (C2S_HeroAideRecord_9207)obj;
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

      public static C2S_HeroAideRecord_9207 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideRecord_9207)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideRecord_9207 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideRecord_9207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideRecord_9207 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideRecord_9207)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideRecord_9207 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideRecord_9207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideRecord_9207 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideRecord_9207)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideRecord_9207 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideRecord_9207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideRecord_9207 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroAideRecord_9207)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroAideRecord_9207 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideRecord_9207)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroAideRecord_9207 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroAideRecord_9207)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroAideRecord_9207 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideRecord_9207)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroAideRecord_9207 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroAideRecord_9207)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroAideRecord_9207 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideRecord_9207)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroAideRecord_9207 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroAideRecord_9207 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroAideRecord_9207> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroAideRecord_9207> getParserForType() {
         return PARSER;
      }

      public C2S_HeroAideRecord_9207 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroAideRecord_9207OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideRecord_9207_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideRecord_9207_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroAideRecord_9207.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AideMsg.C2S_HeroAideRecord_9207.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideRecord_9207_descriptor;
         }

         public C2S_HeroAideRecord_9207 getDefaultInstanceForType() {
            return AideMsg.C2S_HeroAideRecord_9207.getDefaultInstance();
         }

         public C2S_HeroAideRecord_9207 build() {
            C2S_HeroAideRecord_9207 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroAideRecord_9207 buildPartial() {
            C2S_HeroAideRecord_9207 result = new C2S_HeroAideRecord_9207(this);
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
            if (other instanceof C2S_HeroAideRecord_9207) {
               return this.mergeFrom((C2S_HeroAideRecord_9207)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroAideRecord_9207 other) {
            if (other == AideMsg.C2S_HeroAideRecord_9207.getDefaultInstance()) {
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
            C2S_HeroAideRecord_9207 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroAideRecord_9207)AideMsg.C2S_HeroAideRecord_9207.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroAideRecord_9207)e.getUnfinishedMessage();
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

   public static final class S2C_HeroAideRecord_9208 extends GeneratedMessageV3 implements S2C_HeroAideRecord_9208OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ITEMIDS_FIELD_NUMBER = 1;
      private Internal.IntList itemIds_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroAideRecord_9208 DEFAULT_INSTANCE = new S2C_HeroAideRecord_9208();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroAideRecord_9208> PARSER = new AbstractParser<S2C_HeroAideRecord_9208>() {
         public S2C_HeroAideRecord_9208 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroAideRecord_9208(input, extensionRegistry);
         }
      };

      private S2C_HeroAideRecord_9208(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroAideRecord_9208() {
         this.memoizedIsInitialized = -1;
         this.itemIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroAideRecord_9208();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroAideRecord_9208(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.itemIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.itemIds_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.itemIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.itemIds_.addInt(input.readInt32());
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
                  this.itemIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideRecord_9208_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideRecord_9208_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroAideRecord_9208.class, Builder.class);
      }

      public List<Integer> getItemIdsList() {
         return this.itemIds_;
      }

      public int getItemIdsCount() {
         return this.itemIds_.size();
      }

      public int getItemIds(int index) {
         return this.itemIds_.getInt(index);
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
         for(int i = 0; i < this.itemIds_.size(); ++i) {
            output.writeInt32(1, this.itemIds_.getInt(i));
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

            for(int i = 0; i < this.itemIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.itemIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getItemIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HeroAideRecord_9208)) {
            return super.equals(obj);
         } else {
            S2C_HeroAideRecord_9208 other = (S2C_HeroAideRecord_9208)obj;
            if (!this.getItemIdsList().equals(other.getItemIdsList())) {
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
            if (this.getItemIdsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HeroAideRecord_9208 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideRecord_9208)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideRecord_9208 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideRecord_9208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideRecord_9208 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideRecord_9208)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideRecord_9208 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideRecord_9208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideRecord_9208 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideRecord_9208)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideRecord_9208 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideRecord_9208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideRecord_9208 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroAideRecord_9208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroAideRecord_9208 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideRecord_9208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroAideRecord_9208 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroAideRecord_9208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroAideRecord_9208 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideRecord_9208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroAideRecord_9208 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroAideRecord_9208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroAideRecord_9208 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideRecord_9208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroAideRecord_9208 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroAideRecord_9208 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroAideRecord_9208> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroAideRecord_9208> getParserForType() {
         return PARSER;
      }

      public S2C_HeroAideRecord_9208 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroAideRecord_9208OrBuilder {
         private int bitField0_;
         private Internal.IntList itemIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideRecord_9208_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideRecord_9208_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroAideRecord_9208.class, Builder.class);
         }

         private Builder() {
            this.itemIds_ = AideMsg.S2C_HeroAideRecord_9208.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.itemIds_ = AideMsg.S2C_HeroAideRecord_9208.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AideMsg.S2C_HeroAideRecord_9208.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemIds_ = AideMsg.S2C_HeroAideRecord_9208.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideRecord_9208_descriptor;
         }

         public S2C_HeroAideRecord_9208 getDefaultInstanceForType() {
            return AideMsg.S2C_HeroAideRecord_9208.getDefaultInstance();
         }

         public S2C_HeroAideRecord_9208 build() {
            S2C_HeroAideRecord_9208 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroAideRecord_9208 buildPartial() {
            S2C_HeroAideRecord_9208 result = new S2C_HeroAideRecord_9208(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.itemIds_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.itemIds_ = this.itemIds_;
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
            if (other instanceof S2C_HeroAideRecord_9208) {
               return this.mergeFrom((S2C_HeroAideRecord_9208)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroAideRecord_9208 other) {
            if (other == AideMsg.S2C_HeroAideRecord_9208.getDefaultInstance()) {
               return this;
            } else {
               if (!other.itemIds_.isEmpty()) {
                  if (this.itemIds_.isEmpty()) {
                     this.itemIds_ = other.itemIds_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureItemIdsIsMutable();
                     this.itemIds_.addAll(other.itemIds_);
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
            S2C_HeroAideRecord_9208 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroAideRecord_9208)AideMsg.S2C_HeroAideRecord_9208.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroAideRecord_9208)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureItemIdsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.itemIds_ = AideMsg.S2C_HeroAideRecord_9208.mutableCopy(this.itemIds_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getItemIdsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.itemIds_) : this.itemIds_);
         }

         public int getItemIdsCount() {
            return this.itemIds_.size();
         }

         public int getItemIds(int index) {
            return this.itemIds_.getInt(index);
         }

         public Builder setItemIds(int index, int value) {
            this.ensureItemIdsIsMutable();
            this.itemIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addItemIds(int value) {
            this.ensureItemIdsIsMutable();
            this.itemIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllItemIds(Iterable<? extends Integer> values) {
            this.ensureItemIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.itemIds_);
            this.onChanged();
            return this;
         }

         public Builder clearItemIds() {
            this.itemIds_ = AideMsg.S2C_HeroAideRecord_9208.emptyIntList();
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

   public static final class C2S_HeroAideOneKeyDiscompose_9209 extends GeneratedMessageV3 implements C2S_HeroAideOneKeyDiscompose_9209OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CODES_FIELD_NUMBER = 1;
      private Internal.IntList codes_;
      private byte memoizedIsInitialized;
      private static final C2S_HeroAideOneKeyDiscompose_9209 DEFAULT_INSTANCE = new C2S_HeroAideOneKeyDiscompose_9209();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroAideOneKeyDiscompose_9209> PARSER = new AbstractParser<C2S_HeroAideOneKeyDiscompose_9209>() {
         public C2S_HeroAideOneKeyDiscompose_9209 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroAideOneKeyDiscompose_9209(input, extensionRegistry);
         }
      };

      private C2S_HeroAideOneKeyDiscompose_9209(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroAideOneKeyDiscompose_9209() {
         this.memoizedIsInitialized = -1;
         this.codes_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroAideOneKeyDiscompose_9209();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroAideOneKeyDiscompose_9209(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.codes_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.codes_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.codes_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.codes_.addInt(input.readInt32());
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
                  this.codes_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideOneKeyDiscompose_9209_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideOneKeyDiscompose_9209_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroAideOneKeyDiscompose_9209.class, Builder.class);
      }

      public List<Integer> getCodesList() {
         return this.codes_;
      }

      public int getCodesCount() {
         return this.codes_.size();
      }

      public int getCodes(int index) {
         return this.codes_.getInt(index);
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
         for(int i = 0; i < this.codes_.size(); ++i) {
            output.writeInt32(1, this.codes_.getInt(i));
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

            for(int i = 0; i < this.codes_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.codes_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCodesList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_HeroAideOneKeyDiscompose_9209)) {
            return super.equals(obj);
         } else {
            C2S_HeroAideOneKeyDiscompose_9209 other = (C2S_HeroAideOneKeyDiscompose_9209)obj;
            if (!this.getCodesList().equals(other.getCodesList())) {
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
            if (this.getCodesCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCodesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_HeroAideOneKeyDiscompose_9209 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideOneKeyDiscompose_9209)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideOneKeyDiscompose_9209 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideOneKeyDiscompose_9209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideOneKeyDiscompose_9209 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideOneKeyDiscompose_9209)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideOneKeyDiscompose_9209 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideOneKeyDiscompose_9209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideOneKeyDiscompose_9209 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideOneKeyDiscompose_9209)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideOneKeyDiscompose_9209 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideOneKeyDiscompose_9209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideOneKeyDiscompose_9209 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroAideOneKeyDiscompose_9209)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroAideOneKeyDiscompose_9209 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideOneKeyDiscompose_9209)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroAideOneKeyDiscompose_9209 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroAideOneKeyDiscompose_9209)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroAideOneKeyDiscompose_9209 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideOneKeyDiscompose_9209)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroAideOneKeyDiscompose_9209 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroAideOneKeyDiscompose_9209)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroAideOneKeyDiscompose_9209 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideOneKeyDiscompose_9209)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroAideOneKeyDiscompose_9209 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroAideOneKeyDiscompose_9209 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroAideOneKeyDiscompose_9209> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroAideOneKeyDiscompose_9209> getParserForType() {
         return PARSER;
      }

      public C2S_HeroAideOneKeyDiscompose_9209 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroAideOneKeyDiscompose_9209OrBuilder {
         private int bitField0_;
         private Internal.IntList codes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideOneKeyDiscompose_9209_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideOneKeyDiscompose_9209_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroAideOneKeyDiscompose_9209.class, Builder.class);
         }

         private Builder() {
            this.codes_ = AideMsg.C2S_HeroAideOneKeyDiscompose_9209.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codes_ = AideMsg.C2S_HeroAideOneKeyDiscompose_9209.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AideMsg.C2S_HeroAideOneKeyDiscompose_9209.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.codes_ = AideMsg.C2S_HeroAideOneKeyDiscompose_9209.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideOneKeyDiscompose_9209_descriptor;
         }

         public C2S_HeroAideOneKeyDiscompose_9209 getDefaultInstanceForType() {
            return AideMsg.C2S_HeroAideOneKeyDiscompose_9209.getDefaultInstance();
         }

         public C2S_HeroAideOneKeyDiscompose_9209 build() {
            C2S_HeroAideOneKeyDiscompose_9209 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroAideOneKeyDiscompose_9209 buildPartial() {
            C2S_HeroAideOneKeyDiscompose_9209 result = new C2S_HeroAideOneKeyDiscompose_9209(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.codes_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.codes_ = this.codes_;
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
            if (other instanceof C2S_HeroAideOneKeyDiscompose_9209) {
               return this.mergeFrom((C2S_HeroAideOneKeyDiscompose_9209)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroAideOneKeyDiscompose_9209 other) {
            if (other == AideMsg.C2S_HeroAideOneKeyDiscompose_9209.getDefaultInstance()) {
               return this;
            } else {
               if (!other.codes_.isEmpty()) {
                  if (this.codes_.isEmpty()) {
                     this.codes_ = other.codes_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureCodesIsMutable();
                     this.codes_.addAll(other.codes_);
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
            C2S_HeroAideOneKeyDiscompose_9209 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroAideOneKeyDiscompose_9209)AideMsg.C2S_HeroAideOneKeyDiscompose_9209.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroAideOneKeyDiscompose_9209)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureCodesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.codes_ = AideMsg.C2S_HeroAideOneKeyDiscompose_9209.mutableCopy(this.codes_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getCodesList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.codes_) : this.codes_);
         }

         public int getCodesCount() {
            return this.codes_.size();
         }

         public int getCodes(int index) {
            return this.codes_.getInt(index);
         }

         public Builder setCodes(int index, int value) {
            this.ensureCodesIsMutable();
            this.codes_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCodes(int value) {
            this.ensureCodesIsMutable();
            this.codes_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCodes(Iterable<? extends Integer> values) {
            this.ensureCodesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.codes_);
            this.onChanged();
            return this;
         }

         public Builder clearCodes() {
            this.codes_ = AideMsg.C2S_HeroAideOneKeyDiscompose_9209.emptyIntList();
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

   public static final class S2C_HeroAideOneKeyDiscompose_9210 extends GeneratedMessageV3 implements S2C_HeroAideOneKeyDiscompose_9210OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CODES_FIELD_NUMBER = 1;
      private Internal.IntList codes_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroAideOneKeyDiscompose_9210 DEFAULT_INSTANCE = new S2C_HeroAideOneKeyDiscompose_9210();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroAideOneKeyDiscompose_9210> PARSER = new AbstractParser<S2C_HeroAideOneKeyDiscompose_9210>() {
         public S2C_HeroAideOneKeyDiscompose_9210 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroAideOneKeyDiscompose_9210(input, extensionRegistry);
         }
      };

      private S2C_HeroAideOneKeyDiscompose_9210(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroAideOneKeyDiscompose_9210() {
         this.memoizedIsInitialized = -1;
         this.codes_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroAideOneKeyDiscompose_9210();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroAideOneKeyDiscompose_9210(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.codes_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.codes_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.codes_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.codes_.addInt(input.readInt32());
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
                  this.codes_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideOneKeyDiscompose_9210_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideOneKeyDiscompose_9210_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroAideOneKeyDiscompose_9210.class, Builder.class);
      }

      public List<Integer> getCodesList() {
         return this.codes_;
      }

      public int getCodesCount() {
         return this.codes_.size();
      }

      public int getCodes(int index) {
         return this.codes_.getInt(index);
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
         for(int i = 0; i < this.codes_.size(); ++i) {
            output.writeInt32(1, this.codes_.getInt(i));
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

            for(int i = 0; i < this.codes_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.codes_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCodesList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HeroAideOneKeyDiscompose_9210)) {
            return super.equals(obj);
         } else {
            S2C_HeroAideOneKeyDiscompose_9210 other = (S2C_HeroAideOneKeyDiscompose_9210)obj;
            if (!this.getCodesList().equals(other.getCodesList())) {
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
            if (this.getCodesCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCodesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HeroAideOneKeyDiscompose_9210 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideOneKeyDiscompose_9210)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideOneKeyDiscompose_9210 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideOneKeyDiscompose_9210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideOneKeyDiscompose_9210 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideOneKeyDiscompose_9210)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideOneKeyDiscompose_9210 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideOneKeyDiscompose_9210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideOneKeyDiscompose_9210 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideOneKeyDiscompose_9210)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideOneKeyDiscompose_9210 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideOneKeyDiscompose_9210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideOneKeyDiscompose_9210 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroAideOneKeyDiscompose_9210)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroAideOneKeyDiscompose_9210 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideOneKeyDiscompose_9210)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroAideOneKeyDiscompose_9210 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroAideOneKeyDiscompose_9210)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroAideOneKeyDiscompose_9210 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideOneKeyDiscompose_9210)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroAideOneKeyDiscompose_9210 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroAideOneKeyDiscompose_9210)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroAideOneKeyDiscompose_9210 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideOneKeyDiscompose_9210)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroAideOneKeyDiscompose_9210 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroAideOneKeyDiscompose_9210 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroAideOneKeyDiscompose_9210> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroAideOneKeyDiscompose_9210> getParserForType() {
         return PARSER;
      }

      public S2C_HeroAideOneKeyDiscompose_9210 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroAideOneKeyDiscompose_9210OrBuilder {
         private int bitField0_;
         private Internal.IntList codes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideOneKeyDiscompose_9210_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideOneKeyDiscompose_9210_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroAideOneKeyDiscompose_9210.class, Builder.class);
         }

         private Builder() {
            this.codes_ = AideMsg.S2C_HeroAideOneKeyDiscompose_9210.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codes_ = AideMsg.S2C_HeroAideOneKeyDiscompose_9210.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AideMsg.S2C_HeroAideOneKeyDiscompose_9210.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.codes_ = AideMsg.S2C_HeroAideOneKeyDiscompose_9210.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideOneKeyDiscompose_9210_descriptor;
         }

         public S2C_HeroAideOneKeyDiscompose_9210 getDefaultInstanceForType() {
            return AideMsg.S2C_HeroAideOneKeyDiscompose_9210.getDefaultInstance();
         }

         public S2C_HeroAideOneKeyDiscompose_9210 build() {
            S2C_HeroAideOneKeyDiscompose_9210 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroAideOneKeyDiscompose_9210 buildPartial() {
            S2C_HeroAideOneKeyDiscompose_9210 result = new S2C_HeroAideOneKeyDiscompose_9210(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.codes_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.codes_ = this.codes_;
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
            if (other instanceof S2C_HeroAideOneKeyDiscompose_9210) {
               return this.mergeFrom((S2C_HeroAideOneKeyDiscompose_9210)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroAideOneKeyDiscompose_9210 other) {
            if (other == AideMsg.S2C_HeroAideOneKeyDiscompose_9210.getDefaultInstance()) {
               return this;
            } else {
               if (!other.codes_.isEmpty()) {
                  if (this.codes_.isEmpty()) {
                     this.codes_ = other.codes_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureCodesIsMutable();
                     this.codes_.addAll(other.codes_);
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
            S2C_HeroAideOneKeyDiscompose_9210 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroAideOneKeyDiscompose_9210)AideMsg.S2C_HeroAideOneKeyDiscompose_9210.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroAideOneKeyDiscompose_9210)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureCodesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.codes_ = AideMsg.S2C_HeroAideOneKeyDiscompose_9210.mutableCopy(this.codes_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getCodesList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.codes_) : this.codes_);
         }

         public int getCodesCount() {
            return this.codes_.size();
         }

         public int getCodes(int index) {
            return this.codes_.getInt(index);
         }

         public Builder setCodes(int index, int value) {
            this.ensureCodesIsMutable();
            this.codes_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCodes(int value) {
            this.ensureCodesIsMutable();
            this.codes_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCodes(Iterable<? extends Integer> values) {
            this.ensureCodesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.codes_);
            this.onChanged();
            return this;
         }

         public Builder clearCodes() {
            this.codes_ = AideMsg.S2C_HeroAideOneKeyDiscompose_9210.emptyIntList();
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

   public static final class C2S_HeroAideUniteSkill_9211 extends GeneratedMessageV3 implements C2S_HeroAideUniteSkill_9211OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int TRAMMELSID_FIELD_NUMBER = 2;
      private int trammelsId_;
      private byte memoizedIsInitialized;
      private static final C2S_HeroAideUniteSkill_9211 DEFAULT_INSTANCE = new C2S_HeroAideUniteSkill_9211();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroAideUniteSkill_9211> PARSER = new AbstractParser<C2S_HeroAideUniteSkill_9211>() {
         public C2S_HeroAideUniteSkill_9211 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroAideUniteSkill_9211(input, extensionRegistry);
         }
      };

      private C2S_HeroAideUniteSkill_9211(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroAideUniteSkill_9211() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroAideUniteSkill_9211();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroAideUniteSkill_9211(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.trammelsId_ = input.readInt32();
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
         return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideUniteSkill_9211_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideUniteSkill_9211_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroAideUniteSkill_9211.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasTrammelsId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTrammelsId() {
         return this.trammelsId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTrammelsId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.trammelsId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.trammelsId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_HeroAideUniteSkill_9211)) {
            return super.equals(obj);
         } else {
            C2S_HeroAideUniteSkill_9211 other = (C2S_HeroAideUniteSkill_9211)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasTrammelsId() != other.hasTrammelsId()) {
               return false;
            } else if (this.hasTrammelsId() && this.getTrammelsId() != other.getTrammelsId()) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasTrammelsId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTrammelsId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_HeroAideUniteSkill_9211 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideUniteSkill_9211)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideUniteSkill_9211 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideUniteSkill_9211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideUniteSkill_9211 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideUniteSkill_9211)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideUniteSkill_9211 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideUniteSkill_9211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideUniteSkill_9211 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideUniteSkill_9211)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideUniteSkill_9211 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideUniteSkill_9211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideUniteSkill_9211 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroAideUniteSkill_9211)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroAideUniteSkill_9211 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideUniteSkill_9211)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroAideUniteSkill_9211 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroAideUniteSkill_9211)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroAideUniteSkill_9211 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideUniteSkill_9211)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroAideUniteSkill_9211 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroAideUniteSkill_9211)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroAideUniteSkill_9211 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideUniteSkill_9211)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroAideUniteSkill_9211 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroAideUniteSkill_9211 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroAideUniteSkill_9211> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroAideUniteSkill_9211> getParserForType() {
         return PARSER;
      }

      public C2S_HeroAideUniteSkill_9211 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroAideUniteSkill_9211OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int trammelsId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideUniteSkill_9211_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideUniteSkill_9211_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroAideUniteSkill_9211.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AideMsg.C2S_HeroAideUniteSkill_9211.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.trammelsId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideUniteSkill_9211_descriptor;
         }

         public C2S_HeroAideUniteSkill_9211 getDefaultInstanceForType() {
            return AideMsg.C2S_HeroAideUniteSkill_9211.getDefaultInstance();
         }

         public C2S_HeroAideUniteSkill_9211 build() {
            C2S_HeroAideUniteSkill_9211 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroAideUniteSkill_9211 buildPartial() {
            C2S_HeroAideUniteSkill_9211 result = new C2S_HeroAideUniteSkill_9211(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.trammelsId_ = this.trammelsId_;
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
            if (other instanceof C2S_HeroAideUniteSkill_9211) {
               return this.mergeFrom((C2S_HeroAideUniteSkill_9211)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroAideUniteSkill_9211 other) {
            if (other == AideMsg.C2S_HeroAideUniteSkill_9211.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasTrammelsId()) {
                  this.setTrammelsId(other.getTrammelsId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else {
               return this.hasTrammelsId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_HeroAideUniteSkill_9211 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroAideUniteSkill_9211)AideMsg.C2S_HeroAideUniteSkill_9211.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroAideUniteSkill_9211)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 1;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTrammelsId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTrammelsId() {
            return this.trammelsId_;
         }

         public Builder setTrammelsId(int value) {
            this.bitField0_ |= 2;
            this.trammelsId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTrammelsId() {
            this.bitField0_ &= -3;
            this.trammelsId_ = 0;
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

   public static final class S2C_HeroAideUniteSkill_9212 extends GeneratedMessageV3 implements S2C_HeroAideUniteSkill_9212OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int TRAMMELSID_FIELD_NUMBER = 2;
      private int trammelsId_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroAideUniteSkill_9212 DEFAULT_INSTANCE = new S2C_HeroAideUniteSkill_9212();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroAideUniteSkill_9212> PARSER = new AbstractParser<S2C_HeroAideUniteSkill_9212>() {
         public S2C_HeroAideUniteSkill_9212 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroAideUniteSkill_9212(input, extensionRegistry);
         }
      };

      private S2C_HeroAideUniteSkill_9212(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroAideUniteSkill_9212() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroAideUniteSkill_9212();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroAideUniteSkill_9212(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.trammelsId_ = input.readInt32();
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
         return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideUniteSkill_9212_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideUniteSkill_9212_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroAideUniteSkill_9212.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasTrammelsId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTrammelsId() {
         return this.trammelsId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTrammelsId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.trammelsId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.trammelsId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HeroAideUniteSkill_9212)) {
            return super.equals(obj);
         } else {
            S2C_HeroAideUniteSkill_9212 other = (S2C_HeroAideUniteSkill_9212)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasTrammelsId() != other.hasTrammelsId()) {
               return false;
            } else if (this.hasTrammelsId() && this.getTrammelsId() != other.getTrammelsId()) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasTrammelsId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTrammelsId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HeroAideUniteSkill_9212 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideUniteSkill_9212)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideUniteSkill_9212 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideUniteSkill_9212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideUniteSkill_9212 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideUniteSkill_9212)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideUniteSkill_9212 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideUniteSkill_9212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideUniteSkill_9212 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideUniteSkill_9212)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideUniteSkill_9212 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideUniteSkill_9212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideUniteSkill_9212 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroAideUniteSkill_9212)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroAideUniteSkill_9212 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideUniteSkill_9212)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroAideUniteSkill_9212 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroAideUniteSkill_9212)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroAideUniteSkill_9212 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideUniteSkill_9212)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroAideUniteSkill_9212 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroAideUniteSkill_9212)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroAideUniteSkill_9212 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideUniteSkill_9212)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroAideUniteSkill_9212 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroAideUniteSkill_9212 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroAideUniteSkill_9212> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroAideUniteSkill_9212> getParserForType() {
         return PARSER;
      }

      public S2C_HeroAideUniteSkill_9212 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroAideUniteSkill_9212OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int trammelsId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideUniteSkill_9212_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideUniteSkill_9212_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroAideUniteSkill_9212.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AideMsg.S2C_HeroAideUniteSkill_9212.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.trammelsId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideUniteSkill_9212_descriptor;
         }

         public S2C_HeroAideUniteSkill_9212 getDefaultInstanceForType() {
            return AideMsg.S2C_HeroAideUniteSkill_9212.getDefaultInstance();
         }

         public S2C_HeroAideUniteSkill_9212 build() {
            S2C_HeroAideUniteSkill_9212 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroAideUniteSkill_9212 buildPartial() {
            S2C_HeroAideUniteSkill_9212 result = new S2C_HeroAideUniteSkill_9212(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.trammelsId_ = this.trammelsId_;
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
            if (other instanceof S2C_HeroAideUniteSkill_9212) {
               return this.mergeFrom((S2C_HeroAideUniteSkill_9212)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroAideUniteSkill_9212 other) {
            if (other == AideMsg.S2C_HeroAideUniteSkill_9212.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasTrammelsId()) {
                  this.setTrammelsId(other.getTrammelsId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else {
               return this.hasTrammelsId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HeroAideUniteSkill_9212 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroAideUniteSkill_9212)AideMsg.S2C_HeroAideUniteSkill_9212.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroAideUniteSkill_9212)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 1;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTrammelsId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTrammelsId() {
            return this.trammelsId_;
         }

         public Builder setTrammelsId(int value) {
            this.bitField0_ |= 2;
            this.trammelsId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTrammelsId() {
            this.bitField0_ &= -3;
            this.trammelsId_ = 0;
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

   public static final class C2S_HeroAideChange_9213 extends GeneratedMessageV3 implements C2S_HeroAideChange_9213OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int SITE_FIELD_NUMBER = 2;
      private int site_;
      public static final int ITEMID_FIELD_NUMBER = 3;
      private int itemId_;
      private byte memoizedIsInitialized;
      private static final C2S_HeroAideChange_9213 DEFAULT_INSTANCE = new C2S_HeroAideChange_9213();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroAideChange_9213> PARSER = new AbstractParser<C2S_HeroAideChange_9213>() {
         public C2S_HeroAideChange_9213 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroAideChange_9213(input, extensionRegistry);
         }
      };

      private C2S_HeroAideChange_9213(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroAideChange_9213() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroAideChange_9213();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroAideChange_9213(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.site_ = input.readInt32();
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
         return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChange_9213_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChange_9213_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroAideChange_9213.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasSite() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSite() {
         return this.site_;
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
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSite()) {
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
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.site_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.site_);
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
         } else if (!(obj instanceof C2S_HeroAideChange_9213)) {
            return super.equals(obj);
         } else {
            C2S_HeroAideChange_9213 other = (C2S_HeroAideChange_9213)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasSite() != other.hasSite()) {
               return false;
            } else if (this.hasSite() && this.getSite() != other.getSite()) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasSite()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSite();
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

      public static C2S_HeroAideChange_9213 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideChange_9213)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideChange_9213 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideChange_9213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideChange_9213 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideChange_9213)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideChange_9213 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideChange_9213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideChange_9213 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideChange_9213)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideChange_9213 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideChange_9213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideChange_9213 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroAideChange_9213)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroAideChange_9213 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideChange_9213)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroAideChange_9213 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroAideChange_9213)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroAideChange_9213 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideChange_9213)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroAideChange_9213 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroAideChange_9213)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroAideChange_9213 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideChange_9213)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroAideChange_9213 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroAideChange_9213 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroAideChange_9213> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroAideChange_9213> getParserForType() {
         return PARSER;
      }

      public C2S_HeroAideChange_9213 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroAideChange_9213OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int site_;
         private int itemId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChange_9213_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChange_9213_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroAideChange_9213.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AideMsg.C2S_HeroAideChange_9213.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.site_ = 0;
            this.bitField0_ &= -3;
            this.itemId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChange_9213_descriptor;
         }

         public C2S_HeroAideChange_9213 getDefaultInstanceForType() {
            return AideMsg.C2S_HeroAideChange_9213.getDefaultInstance();
         }

         public C2S_HeroAideChange_9213 build() {
            C2S_HeroAideChange_9213 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroAideChange_9213 buildPartial() {
            C2S_HeroAideChange_9213 result = new C2S_HeroAideChange_9213(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.site_ = this.site_;
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
            if (other instanceof C2S_HeroAideChange_9213) {
               return this.mergeFrom((C2S_HeroAideChange_9213)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroAideChange_9213 other) {
            if (other == AideMsg.C2S_HeroAideChange_9213.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasSite()) {
                  this.setSite(other.getSite());
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
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasSite()) {
               return false;
            } else {
               return this.hasItemId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_HeroAideChange_9213 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroAideChange_9213)AideMsg.C2S_HeroAideChange_9213.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroAideChange_9213)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 1;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSite() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSite() {
            return this.site_;
         }

         public Builder setSite(int value) {
            this.bitField0_ |= 2;
            this.site_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSite() {
            this.bitField0_ &= -3;
            this.site_ = 0;
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

   public static final class S2C_HeroAideChange_9214 extends GeneratedMessageV3 implements S2C_HeroAideChange_9214OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int SITE_FIELD_NUMBER = 2;
      private int site_;
      public static final int ITEMID_FIELD_NUMBER = 3;
      private int itemId_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroAideChange_9214 DEFAULT_INSTANCE = new S2C_HeroAideChange_9214();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroAideChange_9214> PARSER = new AbstractParser<S2C_HeroAideChange_9214>() {
         public S2C_HeroAideChange_9214 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroAideChange_9214(input, extensionRegistry);
         }
      };

      private S2C_HeroAideChange_9214(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroAideChange_9214() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroAideChange_9214();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroAideChange_9214(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.site_ = input.readInt32();
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
         return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideChange_9214_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideChange_9214_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroAideChange_9214.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasSite() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSite() {
         return this.site_;
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
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSite()) {
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
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.site_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.site_);
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
         } else if (!(obj instanceof S2C_HeroAideChange_9214)) {
            return super.equals(obj);
         } else {
            S2C_HeroAideChange_9214 other = (S2C_HeroAideChange_9214)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasSite() != other.hasSite()) {
               return false;
            } else if (this.hasSite() && this.getSite() != other.getSite()) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasSite()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSite();
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

      public static S2C_HeroAideChange_9214 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideChange_9214)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideChange_9214 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideChange_9214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideChange_9214 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideChange_9214)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideChange_9214 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideChange_9214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideChange_9214 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideChange_9214)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideChange_9214 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideChange_9214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideChange_9214 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroAideChange_9214)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroAideChange_9214 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideChange_9214)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroAideChange_9214 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroAideChange_9214)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroAideChange_9214 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideChange_9214)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroAideChange_9214 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroAideChange_9214)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroAideChange_9214 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideChange_9214)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroAideChange_9214 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroAideChange_9214 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroAideChange_9214> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroAideChange_9214> getParserForType() {
         return PARSER;
      }

      public S2C_HeroAideChange_9214 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroAideChange_9214OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int site_;
         private int itemId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideChange_9214_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideChange_9214_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroAideChange_9214.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AideMsg.S2C_HeroAideChange_9214.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.site_ = 0;
            this.bitField0_ &= -3;
            this.itemId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideChange_9214_descriptor;
         }

         public S2C_HeroAideChange_9214 getDefaultInstanceForType() {
            return AideMsg.S2C_HeroAideChange_9214.getDefaultInstance();
         }

         public S2C_HeroAideChange_9214 build() {
            S2C_HeroAideChange_9214 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroAideChange_9214 buildPartial() {
            S2C_HeroAideChange_9214 result = new S2C_HeroAideChange_9214(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.site_ = this.site_;
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
            if (other instanceof S2C_HeroAideChange_9214) {
               return this.mergeFrom((S2C_HeroAideChange_9214)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroAideChange_9214 other) {
            if (other == AideMsg.S2C_HeroAideChange_9214.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasSite()) {
                  this.setSite(other.getSite());
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
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasSite()) {
               return false;
            } else {
               return this.hasItemId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HeroAideChange_9214 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroAideChange_9214)AideMsg.S2C_HeroAideChange_9214.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroAideChange_9214)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 1;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSite() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSite() {
            return this.site_;
         }

         public Builder setSite(int value) {
            this.bitField0_ |= 2;
            this.site_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSite() {
            this.bitField0_ &= -3;
            this.site_ = 0;
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

   public static final class C2S_HeroAideCanSel_9215 extends GeneratedMessageV3 implements C2S_HeroAideCanSel_9215OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_HeroAideCanSel_9215 DEFAULT_INSTANCE = new C2S_HeroAideCanSel_9215();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroAideCanSel_9215> PARSER = new AbstractParser<C2S_HeroAideCanSel_9215>() {
         public C2S_HeroAideCanSel_9215 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroAideCanSel_9215(input, extensionRegistry);
         }
      };

      private C2S_HeroAideCanSel_9215(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroAideCanSel_9215() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroAideCanSel_9215();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroAideCanSel_9215(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideCanSel_9215_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideCanSel_9215_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroAideCanSel_9215.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
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
            output.writeInt32(1, this.heroCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_HeroAideCanSel_9215)) {
            return super.equals(obj);
         } else {
            C2S_HeroAideCanSel_9215 other = (C2S_HeroAideCanSel_9215)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_HeroAideCanSel_9215 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideCanSel_9215)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideCanSel_9215 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideCanSel_9215)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideCanSel_9215 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideCanSel_9215)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideCanSel_9215 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideCanSel_9215)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideCanSel_9215 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideCanSel_9215)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideCanSel_9215 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideCanSel_9215)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideCanSel_9215 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroAideCanSel_9215)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroAideCanSel_9215 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideCanSel_9215)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroAideCanSel_9215 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroAideCanSel_9215)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroAideCanSel_9215 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideCanSel_9215)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroAideCanSel_9215 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroAideCanSel_9215)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroAideCanSel_9215 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideCanSel_9215)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroAideCanSel_9215 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroAideCanSel_9215 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroAideCanSel_9215> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroAideCanSel_9215> getParserForType() {
         return PARSER;
      }

      public C2S_HeroAideCanSel_9215 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroAideCanSel_9215OrBuilder {
         private int bitField0_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideCanSel_9215_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideCanSel_9215_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroAideCanSel_9215.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AideMsg.C2S_HeroAideCanSel_9215.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideCanSel_9215_descriptor;
         }

         public C2S_HeroAideCanSel_9215 getDefaultInstanceForType() {
            return AideMsg.C2S_HeroAideCanSel_9215.getDefaultInstance();
         }

         public C2S_HeroAideCanSel_9215 build() {
            C2S_HeroAideCanSel_9215 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroAideCanSel_9215 buildPartial() {
            C2S_HeroAideCanSel_9215 result = new C2S_HeroAideCanSel_9215(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
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
            if (other instanceof C2S_HeroAideCanSel_9215) {
               return this.mergeFrom((C2S_HeroAideCanSel_9215)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroAideCanSel_9215 other) {
            if (other == AideMsg.C2S_HeroAideCanSel_9215.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasHeroCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_HeroAideCanSel_9215 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroAideCanSel_9215)AideMsg.C2S_HeroAideCanSel_9215.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroAideCanSel_9215)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 1;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -2;
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

   public static final class S2C_HeroAideCanSel_9216 extends GeneratedMessageV3 implements S2C_HeroAideCanSel_9216OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TRAMMELS_FIELD_NUMBER = 1;
      private Internal.IntList trammels_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroAideCanSel_9216 DEFAULT_INSTANCE = new S2C_HeroAideCanSel_9216();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroAideCanSel_9216> PARSER = new AbstractParser<S2C_HeroAideCanSel_9216>() {
         public S2C_HeroAideCanSel_9216 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroAideCanSel_9216(input, extensionRegistry);
         }
      };

      private S2C_HeroAideCanSel_9216(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroAideCanSel_9216() {
         this.memoizedIsInitialized = -1;
         this.trammels_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroAideCanSel_9216();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroAideCanSel_9216(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.trammels_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.trammels_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.trammels_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.trammels_.addInt(input.readInt32());
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
                  this.trammels_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideCanSel_9216_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideCanSel_9216_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroAideCanSel_9216.class, Builder.class);
      }

      public List<Integer> getTrammelsList() {
         return this.trammels_;
      }

      public int getTrammelsCount() {
         return this.trammels_.size();
      }

      public int getTrammels(int index) {
         return this.trammels_.getInt(index);
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
         for(int i = 0; i < this.trammels_.size(); ++i) {
            output.writeInt32(1, this.trammels_.getInt(i));
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

            for(int i = 0; i < this.trammels_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.trammels_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTrammelsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HeroAideCanSel_9216)) {
            return super.equals(obj);
         } else {
            S2C_HeroAideCanSel_9216 other = (S2C_HeroAideCanSel_9216)obj;
            if (!this.getTrammelsList().equals(other.getTrammelsList())) {
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
            if (this.getTrammelsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTrammelsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HeroAideCanSel_9216 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideCanSel_9216)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideCanSel_9216 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideCanSel_9216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideCanSel_9216 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideCanSel_9216)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideCanSel_9216 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideCanSel_9216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideCanSel_9216 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideCanSel_9216)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideCanSel_9216 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideCanSel_9216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideCanSel_9216 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroAideCanSel_9216)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroAideCanSel_9216 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideCanSel_9216)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroAideCanSel_9216 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroAideCanSel_9216)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroAideCanSel_9216 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideCanSel_9216)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroAideCanSel_9216 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroAideCanSel_9216)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroAideCanSel_9216 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideCanSel_9216)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroAideCanSel_9216 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroAideCanSel_9216 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroAideCanSel_9216> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroAideCanSel_9216> getParserForType() {
         return PARSER;
      }

      public S2C_HeroAideCanSel_9216 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroAideCanSel_9216OrBuilder {
         private int bitField0_;
         private Internal.IntList trammels_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideCanSel_9216_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideCanSel_9216_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroAideCanSel_9216.class, Builder.class);
         }

         private Builder() {
            this.trammels_ = AideMsg.S2C_HeroAideCanSel_9216.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.trammels_ = AideMsg.S2C_HeroAideCanSel_9216.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AideMsg.S2C_HeroAideCanSel_9216.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.trammels_ = AideMsg.S2C_HeroAideCanSel_9216.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideCanSel_9216_descriptor;
         }

         public S2C_HeroAideCanSel_9216 getDefaultInstanceForType() {
            return AideMsg.S2C_HeroAideCanSel_9216.getDefaultInstance();
         }

         public S2C_HeroAideCanSel_9216 build() {
            S2C_HeroAideCanSel_9216 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroAideCanSel_9216 buildPartial() {
            S2C_HeroAideCanSel_9216 result = new S2C_HeroAideCanSel_9216(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.trammels_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.trammels_ = this.trammels_;
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
            if (other instanceof S2C_HeroAideCanSel_9216) {
               return this.mergeFrom((S2C_HeroAideCanSel_9216)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroAideCanSel_9216 other) {
            if (other == AideMsg.S2C_HeroAideCanSel_9216.getDefaultInstance()) {
               return this;
            } else {
               if (!other.trammels_.isEmpty()) {
                  if (this.trammels_.isEmpty()) {
                     this.trammels_ = other.trammels_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureTrammelsIsMutable();
                     this.trammels_.addAll(other.trammels_);
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
            S2C_HeroAideCanSel_9216 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroAideCanSel_9216)AideMsg.S2C_HeroAideCanSel_9216.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroAideCanSel_9216)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTrammelsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.trammels_ = AideMsg.S2C_HeroAideCanSel_9216.mutableCopy(this.trammels_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getTrammelsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.trammels_) : this.trammels_);
         }

         public int getTrammelsCount() {
            return this.trammels_.size();
         }

         public int getTrammels(int index) {
            return this.trammels_.getInt(index);
         }

         public Builder setTrammels(int index, int value) {
            this.ensureTrammelsIsMutable();
            this.trammels_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTrammels(int value) {
            this.ensureTrammelsIsMutable();
            this.trammels_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTrammels(Iterable<? extends Integer> values) {
            this.ensureTrammelsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.trammels_);
            this.onChanged();
            return this;
         }

         public Builder clearTrammels() {
            this.trammels_ = AideMsg.S2C_HeroAideCanSel_9216.emptyIntList();
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

   public static final class C2S_HeroAideChangeInBag_9217 extends GeneratedMessageV3 implements C2S_HeroAideChangeInBag_9217OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMCODE_FIELD_NUMBER = 1;
      private Internal.IntList itemCode_;
      public static final int ITEMID_FIELD_NUMBER = 2;
      private int itemId_;
      private byte memoizedIsInitialized;
      private static final C2S_HeroAideChangeInBag_9217 DEFAULT_INSTANCE = new C2S_HeroAideChangeInBag_9217();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroAideChangeInBag_9217> PARSER = new AbstractParser<C2S_HeroAideChangeInBag_9217>() {
         public C2S_HeroAideChangeInBag_9217 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroAideChangeInBag_9217(input, extensionRegistry);
         }
      };

      private C2S_HeroAideChangeInBag_9217(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroAideChangeInBag_9217() {
         this.memoizedIsInitialized = -1;
         this.itemCode_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroAideChangeInBag_9217();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroAideChangeInBag_9217(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.itemCode_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.itemCode_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.itemCode_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.itemId_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.itemCode_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.itemCode_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChangeInBag_9217_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChangeInBag_9217_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroAideChangeInBag_9217.class, Builder.class);
      }

      public List<Integer> getItemCodeList() {
         return this.itemCode_;
      }

      public int getItemCodeCount() {
         return this.itemCode_.size();
      }

      public int getItemCode(int index) {
         return this.itemCode_.getInt(index);
      }

      public boolean hasItemId() {
         return (this.bitField0_ & 1) != 0;
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
         } else if (!this.hasItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.itemCode_.size(); ++i) {
            output.writeInt32(1, this.itemCode_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.itemId_);
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

            for(int i = 0; i < this.itemCode_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.itemCode_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getItemCodeList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.itemId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_HeroAideChangeInBag_9217)) {
            return super.equals(obj);
         } else {
            C2S_HeroAideChangeInBag_9217 other = (C2S_HeroAideChangeInBag_9217)obj;
            if (!this.getItemCodeList().equals(other.getItemCodeList())) {
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
            if (this.getItemCodeCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemCodeList().hashCode();
            }

            if (this.hasItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_HeroAideChangeInBag_9217 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideChangeInBag_9217)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideChangeInBag_9217 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideChangeInBag_9217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideChangeInBag_9217 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideChangeInBag_9217)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideChangeInBag_9217 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideChangeInBag_9217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideChangeInBag_9217 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroAideChangeInBag_9217)PARSER.parseFrom(data);
      }

      public static C2S_HeroAideChangeInBag_9217 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroAideChangeInBag_9217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroAideChangeInBag_9217 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroAideChangeInBag_9217)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroAideChangeInBag_9217 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideChangeInBag_9217)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroAideChangeInBag_9217 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroAideChangeInBag_9217)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroAideChangeInBag_9217 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideChangeInBag_9217)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroAideChangeInBag_9217 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroAideChangeInBag_9217)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroAideChangeInBag_9217 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroAideChangeInBag_9217)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroAideChangeInBag_9217 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroAideChangeInBag_9217 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroAideChangeInBag_9217> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroAideChangeInBag_9217> getParserForType() {
         return PARSER;
      }

      public C2S_HeroAideChangeInBag_9217 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroAideChangeInBag_9217OrBuilder {
         private int bitField0_;
         private Internal.IntList itemCode_;
         private int itemId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChangeInBag_9217_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChangeInBag_9217_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroAideChangeInBag_9217.class, Builder.class);
         }

         private Builder() {
            this.itemCode_ = AideMsg.C2S_HeroAideChangeInBag_9217.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.itemCode_ = AideMsg.C2S_HeroAideChangeInBag_9217.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AideMsg.C2S_HeroAideChangeInBag_9217.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemCode_ = AideMsg.C2S_HeroAideChangeInBag_9217.emptyIntList();
            this.bitField0_ &= -2;
            this.itemId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_C2S_HeroAideChangeInBag_9217_descriptor;
         }

         public C2S_HeroAideChangeInBag_9217 getDefaultInstanceForType() {
            return AideMsg.C2S_HeroAideChangeInBag_9217.getDefaultInstance();
         }

         public C2S_HeroAideChangeInBag_9217 build() {
            C2S_HeroAideChangeInBag_9217 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroAideChangeInBag_9217 buildPartial() {
            C2S_HeroAideChangeInBag_9217 result = new C2S_HeroAideChangeInBag_9217(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.itemCode_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.itemCode_ = this.itemCode_;
            if ((from_bitField0_ & 2) != 0) {
               result.itemId_ = this.itemId_;
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
            if (other instanceof C2S_HeroAideChangeInBag_9217) {
               return this.mergeFrom((C2S_HeroAideChangeInBag_9217)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroAideChangeInBag_9217 other) {
            if (other == AideMsg.C2S_HeroAideChangeInBag_9217.getDefaultInstance()) {
               return this;
            } else {
               if (!other.itemCode_.isEmpty()) {
                  if (this.itemCode_.isEmpty()) {
                     this.itemCode_ = other.itemCode_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureItemCodeIsMutable();
                     this.itemCode_.addAll(other.itemCode_);
                  }

                  this.onChanged();
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
            return this.hasItemId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_HeroAideChangeInBag_9217 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroAideChangeInBag_9217)AideMsg.C2S_HeroAideChangeInBag_9217.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroAideChangeInBag_9217)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureItemCodeIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.itemCode_ = AideMsg.C2S_HeroAideChangeInBag_9217.mutableCopy(this.itemCode_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getItemCodeList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.itemCode_) : this.itemCode_);
         }

         public int getItemCodeCount() {
            return this.itemCode_.size();
         }

         public int getItemCode(int index) {
            return this.itemCode_.getInt(index);
         }

         public Builder setItemCode(int index, int value) {
            this.ensureItemCodeIsMutable();
            this.itemCode_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addItemCode(int value) {
            this.ensureItemCodeIsMutable();
            this.itemCode_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllItemCode(Iterable<? extends Integer> values) {
            this.ensureItemCodeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.itemCode_);
            this.onChanged();
            return this;
         }

         public Builder clearItemCode() {
            this.itemCode_ = AideMsg.C2S_HeroAideChangeInBag_9217.emptyIntList();
            this.bitField0_ &= -2;
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_HeroAideInBag_9218 extends GeneratedMessageV3 implements S2C_HeroAideInBag_9218OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMCODE_FIELD_NUMBER = 1;
      private Internal.IntList itemCode_;
      public static final int ITEMID_FIELD_NUMBER = 2;
      private int itemId_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroAideInBag_9218 DEFAULT_INSTANCE = new S2C_HeroAideInBag_9218();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroAideInBag_9218> PARSER = new AbstractParser<S2C_HeroAideInBag_9218>() {
         public S2C_HeroAideInBag_9218 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroAideInBag_9218(input, extensionRegistry);
         }
      };

      private S2C_HeroAideInBag_9218(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroAideInBag_9218() {
         this.memoizedIsInitialized = -1;
         this.itemCode_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroAideInBag_9218();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroAideInBag_9218(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.itemCode_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.itemCode_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.itemCode_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.itemId_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.itemCode_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.itemCode_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideInBag_9218_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideInBag_9218_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroAideInBag_9218.class, Builder.class);
      }

      public List<Integer> getItemCodeList() {
         return this.itemCode_;
      }

      public int getItemCodeCount() {
         return this.itemCode_.size();
      }

      public int getItemCode(int index) {
         return this.itemCode_.getInt(index);
      }

      public boolean hasItemId() {
         return (this.bitField0_ & 1) != 0;
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
         } else if (!this.hasItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.itemCode_.size(); ++i) {
            output.writeInt32(1, this.itemCode_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.itemId_);
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

            for(int i = 0; i < this.itemCode_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.itemCode_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getItemCodeList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.itemId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HeroAideInBag_9218)) {
            return super.equals(obj);
         } else {
            S2C_HeroAideInBag_9218 other = (S2C_HeroAideInBag_9218)obj;
            if (!this.getItemCodeList().equals(other.getItemCodeList())) {
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
            if (this.getItemCodeCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemCodeList().hashCode();
            }

            if (this.hasItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HeroAideInBag_9218 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideInBag_9218)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideInBag_9218 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideInBag_9218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideInBag_9218 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideInBag_9218)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideInBag_9218 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideInBag_9218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideInBag_9218 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroAideInBag_9218)PARSER.parseFrom(data);
      }

      public static S2C_HeroAideInBag_9218 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroAideInBag_9218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroAideInBag_9218 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroAideInBag_9218)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroAideInBag_9218 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideInBag_9218)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroAideInBag_9218 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroAideInBag_9218)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroAideInBag_9218 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideInBag_9218)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroAideInBag_9218 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroAideInBag_9218)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroAideInBag_9218 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroAideInBag_9218)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroAideInBag_9218 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroAideInBag_9218 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroAideInBag_9218> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroAideInBag_9218> getParserForType() {
         return PARSER;
      }

      public S2C_HeroAideInBag_9218 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroAideInBag_9218OrBuilder {
         private int bitField0_;
         private Internal.IntList itemCode_;
         private int itemId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideInBag_9218_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideInBag_9218_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroAideInBag_9218.class, Builder.class);
         }

         private Builder() {
            this.itemCode_ = AideMsg.S2C_HeroAideInBag_9218.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.itemCode_ = AideMsg.S2C_HeroAideInBag_9218.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AideMsg.S2C_HeroAideInBag_9218.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemCode_ = AideMsg.S2C_HeroAideInBag_9218.emptyIntList();
            this.bitField0_ &= -2;
            this.itemId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AideMsg.internal_static_aide_com_gzbz_protobuf_S2C_HeroAideInBag_9218_descriptor;
         }

         public S2C_HeroAideInBag_9218 getDefaultInstanceForType() {
            return AideMsg.S2C_HeroAideInBag_9218.getDefaultInstance();
         }

         public S2C_HeroAideInBag_9218 build() {
            S2C_HeroAideInBag_9218 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroAideInBag_9218 buildPartial() {
            S2C_HeroAideInBag_9218 result = new S2C_HeroAideInBag_9218(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.itemCode_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.itemCode_ = this.itemCode_;
            if ((from_bitField0_ & 2) != 0) {
               result.itemId_ = this.itemId_;
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
            if (other instanceof S2C_HeroAideInBag_9218) {
               return this.mergeFrom((S2C_HeroAideInBag_9218)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroAideInBag_9218 other) {
            if (other == AideMsg.S2C_HeroAideInBag_9218.getDefaultInstance()) {
               return this;
            } else {
               if (!other.itemCode_.isEmpty()) {
                  if (this.itemCode_.isEmpty()) {
                     this.itemCode_ = other.itemCode_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureItemCodeIsMutable();
                     this.itemCode_.addAll(other.itemCode_);
                  }

                  this.onChanged();
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
            return this.hasItemId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HeroAideInBag_9218 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroAideInBag_9218)AideMsg.S2C_HeroAideInBag_9218.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroAideInBag_9218)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureItemCodeIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.itemCode_ = AideMsg.S2C_HeroAideInBag_9218.mutableCopy(this.itemCode_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getItemCodeList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.itemCode_) : this.itemCode_);
         }

         public int getItemCodeCount() {
            return this.itemCode_.size();
         }

         public int getItemCode(int index) {
            return this.itemCode_.getInt(index);
         }

         public Builder setItemCode(int index, int value) {
            this.ensureItemCodeIsMutable();
            this.itemCode_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addItemCode(int value) {
            this.ensureItemCodeIsMutable();
            this.itemCode_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllItemCode(Iterable<? extends Integer> values) {
            this.ensureItemCodeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.itemCode_);
            this.onChanged();
            return this;
         }

         public Builder clearItemCode() {
            this.itemCode_ = AideMsg.S2C_HeroAideInBag_9218.emptyIntList();
            this.bitField0_ &= -2;
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_HeroAideCanSel_9215OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_HeroAideChangeInBag_9217OrBuilder extends MessageOrBuilder {
      List<Integer> getItemCodeList();

      int getItemCodeCount();

      int getItemCode(int index);

      boolean hasItemId();

      int getItemId();
   }

   public interface C2S_HeroAideChange_9213OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasSite();

      int getSite();

      boolean hasItemId();

      int getItemId();
   }

   public interface C2S_HeroAideChoice_9201OrBuilder extends MessageOrBuilder {
      boolean hasHero();

      int getHero();

      boolean hasItem();

      int getItem();

      boolean hasSite();

      int getSite();
   }

   public interface C2S_HeroAideDown_9203OrBuilder extends MessageOrBuilder {
      boolean hasHero();

      int getHero();

      boolean hasSite();

      int getSite();
   }

   public interface C2S_HeroAideOneKeyDiscompose_9209OrBuilder extends MessageOrBuilder {
      List<Integer> getCodesList();

      int getCodesCount();

      int getCodes(int index);
   }

   public interface C2S_HeroAideRecord_9207OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_HeroAideUniteSkill_9211OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasTrammelsId();

      int getTrammelsId();
   }

   public interface C2S_HeroAideUpgrade_9205OrBuilder extends MessageOrBuilder {
      boolean hasHero();

      int getHero();

      List<Integer> getItemCodesList();

      int getItemCodesCount();

      int getItemCodes(int index);

      boolean hasSite();

      int getSite();
   }

   public interface S2C_HeroAideCanSel_9216OrBuilder extends MessageOrBuilder {
      List<Integer> getTrammelsList();

      int getTrammelsCount();

      int getTrammels(int index);
   }

   public interface S2C_HeroAideChange_9214OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasSite();

      int getSite();

      boolean hasItemId();

      int getItemId();
   }

   public interface S2C_HeroAideChoice_9202OrBuilder extends MessageOrBuilder {
      boolean hasHero();

      int getHero();

      boolean hasAideId();

      int getAideId();

      boolean hasSite();

      int getSite();
   }

   public interface S2C_HeroAideDown_9204OrBuilder extends MessageOrBuilder {
      boolean hasHero();

      int getHero();

      boolean hasSite();

      int getSite();
   }

   public interface S2C_HeroAideInBag_9218OrBuilder extends MessageOrBuilder {
      List<Integer> getItemCodeList();

      int getItemCodeCount();

      int getItemCode(int index);

      boolean hasItemId();

      int getItemId();
   }

   public interface S2C_HeroAideOneKeyDiscompose_9210OrBuilder extends MessageOrBuilder {
      List<Integer> getCodesList();

      int getCodesCount();

      int getCodes(int index);
   }

   public interface S2C_HeroAideRecord_9208OrBuilder extends MessageOrBuilder {
      List<Integer> getItemIdsList();

      int getItemIdsCount();

      int getItemIds(int index);
   }

   public interface S2C_HeroAideUniteSkill_9212OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasTrammelsId();

      int getTrammelsId();
   }

   public interface S2C_HeroAideUpgrade_9206OrBuilder extends MessageOrBuilder {
      boolean hasHero();

      int getHero();

      boolean hasAideId();

      int getAideId();

      boolean hasSite();

      int getSite();
   }
}
