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

public final class HeroDressMsg {
   private static final Descriptors.Descriptor internal_static_heroDress_com_gzbz_protobuf_HeroDressInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroDress_com_gzbz_protobuf_HeroDressInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroDress_com_gzbz_protobuf_C2S_Main_11201_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroDress_com_gzbz_protobuf_C2S_Main_11201_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroDress_com_gzbz_protobuf_S2C_MainResult_11202_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroDress_com_gzbz_protobuf_S2C_MainResult_11202_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroDress_com_gzbz_protobuf_C2S_DelDress_11203_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroDress_com_gzbz_protobuf_C2S_DelDress_11203_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroDress_com_gzbz_protobuf_S2C_DelDress_11204_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroDress_com_gzbz_protobuf_S2C_DelDress_11204_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroDress_com_gzbz_protobuf_C2S_Wear_11205_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroDress_com_gzbz_protobuf_C2S_Wear_11205_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroDress_com_gzbz_protobuf_S2C_WearResult_11206_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroDress_com_gzbz_protobuf_S2C_WearResult_11206_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroDress_com_gzbz_protobuf_C2S_Undress_11207_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroDress_com_gzbz_protobuf_C2S_Undress_11207_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroDress_com_gzbz_protobuf_S2C_UndressResult_11208_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroDress_com_gzbz_protobuf_S2C_UndressResult_11208_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroDress_com_gzbz_protobuf_C2S_Upgrade_11209_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroDress_com_gzbz_protobuf_C2S_Upgrade_11209_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroDress_com_gzbz_protobuf_S2C_UpgradeResult_11210_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroDress_com_gzbz_protobuf_S2C_UpgradeResult_11210_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroDress_com_gzbz_protobuf_C2S_Decompose_11211_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroDress_com_gzbz_protobuf_C2S_Decompose_11211_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroDress_com_gzbz_protobuf_S2C_DecomposeResult_11212_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroDress_com_gzbz_protobuf_S2C_DecomposeResult_11212_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroDress_com_gzbz_protobuf_C2S_ResetDress_11213_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroDress_com_gzbz_protobuf_C2S_ResetDress_11213_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroDress_com_gzbz_protobuf_S2C_ResetDress_11214_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroDress_com_gzbz_protobuf_S2C_ResetDress_11214_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroDress_com_gzbz_protobuf_C2S_DeleteDress_11217_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroDress_com_gzbz_protobuf_C2S_DeleteDress_11217_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroDress_com_gzbz_protobuf_S2C_DeleteDress_11218_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroDress_com_gzbz_protobuf_S2C_DeleteDress_11218_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private HeroDressMsg() {
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
      String[] descriptorData = new String[]{"\n\u000fHeroDress.proto\u0012\u001bheroDress.com.gzbz.protobuf\u001a\fcommon.proto\"H\n\rHeroDressInfo\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0002 \u0001(\u0005\u0012\u000f\n\u0007endTime\u0018\u0003 \u0001(\u0005\u0012\u000e\n\u0006hreoId\u0018\u0004 \u0001(\u0005\"\u0010\n\u000eC2S_Main_11201\"Q\n\u0014S2C_MainResult_11202\u00129\n\u0005infos\u0018\u0001 \u0003(\u000b2*.heroDress.com.gzbz.protobuf.HeroDressInfo\" \n\u0012C2S_DelDress_11203\u0012\n\n\u0002id\u0018\u0001 \u0003(\u0005\" \n\u0012S2C_DelDress_11204\u0012\n\n\u0002id\u0018\u0001 \u0003(\u0005\"3\n\u000eC2S_Wear_11205\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007dressId\u0018\u0002 \u0002(\u0005\"&\n\u0014S2C_WearResult_11206\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"%\n\u0011C2S_Undress_11207\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\")\n\u0017S2C_UndressResult_11208\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"$\n\u0011C2S_Upgrade_11209\u0012\u000f\n\u0007dressId\u0018\u0001 \u0002(\u0005\"c\n\u0017S2C_UpgradeResult_11210\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u00128\n\u0004info\u0018\u0002 \u0002(\u000b2*.heroDress.com.gzbz.protobuf.HeroDressInfo\"&\n\u0013C2S_Decompose_11211\u0012\u000f\n\u0007dressId\u0018\u0001 \u0002(\u0005\"<\n\u0019S2C_DecomposeResult_11212\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007dressId\u0018\u0002 \u0002(\u0005\"'\n\u0014C2S_ResetDress_11213\u0012\u000f\n\u0007dressId\u0018\u0001 \u0002(\u0005\"7\n\u0014S2C_ResetDress_11214\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007dressId\u0018\u0002 \u0002(\u0005\"(\n\u0015C2S_DeleteDress_11217\u0012\u000f\n\u0007dressId\u0018\u0001 \u0002(\u0005\"(\n\u0015S2C_DeleteDress_11218\u0012\u000f\n\u0007dressId\u0018\u0001 \u0002(\u0005B#\n\u0011com.gzbz.protobufB\fHeroDressMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_heroDress_com_gzbz_protobuf_HeroDressInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_heroDress_com_gzbz_protobuf_HeroDressInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroDress_com_gzbz_protobuf_HeroDressInfo_descriptor, new String[]{"Id", "Lv", "EndTime", "HreoId"});
      internal_static_heroDress_com_gzbz_protobuf_C2S_Main_11201_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_heroDress_com_gzbz_protobuf_C2S_Main_11201_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroDress_com_gzbz_protobuf_C2S_Main_11201_descriptor, new String[0]);
      internal_static_heroDress_com_gzbz_protobuf_S2C_MainResult_11202_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_heroDress_com_gzbz_protobuf_S2C_MainResult_11202_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroDress_com_gzbz_protobuf_S2C_MainResult_11202_descriptor, new String[]{"Infos"});
      internal_static_heroDress_com_gzbz_protobuf_C2S_DelDress_11203_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_heroDress_com_gzbz_protobuf_C2S_DelDress_11203_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroDress_com_gzbz_protobuf_C2S_DelDress_11203_descriptor, new String[]{"Id"});
      internal_static_heroDress_com_gzbz_protobuf_S2C_DelDress_11204_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_heroDress_com_gzbz_protobuf_S2C_DelDress_11204_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroDress_com_gzbz_protobuf_S2C_DelDress_11204_descriptor, new String[]{"Id"});
      internal_static_heroDress_com_gzbz_protobuf_C2S_Wear_11205_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_heroDress_com_gzbz_protobuf_C2S_Wear_11205_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroDress_com_gzbz_protobuf_C2S_Wear_11205_descriptor, new String[]{"HeroCode", "DressId"});
      internal_static_heroDress_com_gzbz_protobuf_S2C_WearResult_11206_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_heroDress_com_gzbz_protobuf_S2C_WearResult_11206_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroDress_com_gzbz_protobuf_S2C_WearResult_11206_descriptor, new String[]{"Result"});
      internal_static_heroDress_com_gzbz_protobuf_C2S_Undress_11207_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_heroDress_com_gzbz_protobuf_C2S_Undress_11207_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroDress_com_gzbz_protobuf_C2S_Undress_11207_descriptor, new String[]{"HeroCode"});
      internal_static_heroDress_com_gzbz_protobuf_S2C_UndressResult_11208_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_heroDress_com_gzbz_protobuf_S2C_UndressResult_11208_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroDress_com_gzbz_protobuf_S2C_UndressResult_11208_descriptor, new String[]{"Result"});
      internal_static_heroDress_com_gzbz_protobuf_C2S_Upgrade_11209_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_heroDress_com_gzbz_protobuf_C2S_Upgrade_11209_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroDress_com_gzbz_protobuf_C2S_Upgrade_11209_descriptor, new String[]{"DressId"});
      internal_static_heroDress_com_gzbz_protobuf_S2C_UpgradeResult_11210_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_heroDress_com_gzbz_protobuf_S2C_UpgradeResult_11210_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroDress_com_gzbz_protobuf_S2C_UpgradeResult_11210_descriptor, new String[]{"Result", "Info"});
      internal_static_heroDress_com_gzbz_protobuf_C2S_Decompose_11211_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_heroDress_com_gzbz_protobuf_C2S_Decompose_11211_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroDress_com_gzbz_protobuf_C2S_Decompose_11211_descriptor, new String[]{"DressId"});
      internal_static_heroDress_com_gzbz_protobuf_S2C_DecomposeResult_11212_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_heroDress_com_gzbz_protobuf_S2C_DecomposeResult_11212_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroDress_com_gzbz_protobuf_S2C_DecomposeResult_11212_descriptor, new String[]{"Result", "DressId"});
      internal_static_heroDress_com_gzbz_protobuf_C2S_ResetDress_11213_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_heroDress_com_gzbz_protobuf_C2S_ResetDress_11213_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroDress_com_gzbz_protobuf_C2S_ResetDress_11213_descriptor, new String[]{"DressId"});
      internal_static_heroDress_com_gzbz_protobuf_S2C_ResetDress_11214_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_heroDress_com_gzbz_protobuf_S2C_ResetDress_11214_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroDress_com_gzbz_protobuf_S2C_ResetDress_11214_descriptor, new String[]{"Result", "DressId"});
      internal_static_heroDress_com_gzbz_protobuf_C2S_DeleteDress_11217_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_heroDress_com_gzbz_protobuf_C2S_DeleteDress_11217_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroDress_com_gzbz_protobuf_C2S_DeleteDress_11217_descriptor, new String[]{"DressId"});
      internal_static_heroDress_com_gzbz_protobuf_S2C_DeleteDress_11218_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_heroDress_com_gzbz_protobuf_S2C_DeleteDress_11218_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroDress_com_gzbz_protobuf_S2C_DeleteDress_11218_descriptor, new String[]{"DressId"});
      CommonMsg.getDescriptor();
   }

   public static final class HeroDressInfo extends GeneratedMessageV3 implements HeroDressInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int LV_FIELD_NUMBER = 2;
      private int lv_;
      public static final int ENDTIME_FIELD_NUMBER = 3;
      private int endTime_;
      public static final int HREOID_FIELD_NUMBER = 4;
      private int hreoId_;
      private byte memoizedIsInitialized;
      private static final HeroDressInfo DEFAULT_INSTANCE = new HeroDressInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<HeroDressInfo> PARSER = new AbstractParser<HeroDressInfo>() {
         public HeroDressInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new HeroDressInfo(input, extensionRegistry);
         }
      };

      private HeroDressInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private HeroDressInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new HeroDressInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private HeroDressInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.lv_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.endTime_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.hreoId_ = input.readInt32();
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
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_HeroDressInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_HeroDressInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(HeroDressInfo.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasLv() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public boolean hasHreoId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getHreoId() {
         return this.hreoId_;
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.lv_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.endTime_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.hreoId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.lv_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.endTime_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.hreoId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof HeroDressInfo)) {
            return super.equals(obj);
         } else {
            HeroDressInfo other = (HeroDressInfo)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasHreoId() != other.hasHreoId()) {
               return false;
            } else if (this.hasHreoId() && this.getHreoId() != other.getHreoId()) {
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

            if (this.hasLv()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLv();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.hasHreoId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHreoId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static HeroDressInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (HeroDressInfo)PARSER.parseFrom(data);
      }

      public static HeroDressInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroDressInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroDressInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (HeroDressInfo)PARSER.parseFrom(data);
      }

      public static HeroDressInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroDressInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroDressInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (HeroDressInfo)PARSER.parseFrom(data);
      }

      public static HeroDressInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroDressInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroDressInfo parseFrom(InputStream input) throws IOException {
         return (HeroDressInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HeroDressInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroDressInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static HeroDressInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (HeroDressInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static HeroDressInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroDressInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static HeroDressInfo parseFrom(CodedInputStream input) throws IOException {
         return (HeroDressInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HeroDressInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroDressInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(HeroDressInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static HeroDressInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<HeroDressInfo> parser() {
         return PARSER;
      }

      public Parser<HeroDressInfo> getParserForType() {
         return PARSER;
      }

      public HeroDressInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HeroDressInfoOrBuilder {
         private int bitField0_;
         private int id_;
         private int lv_;
         private int endTime_;
         private int hreoId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_HeroDressInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_HeroDressInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(HeroDressInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroDressMsg.HeroDressInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.lv_ = 0;
            this.bitField0_ &= -3;
            this.endTime_ = 0;
            this.bitField0_ &= -5;
            this.hreoId_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_HeroDressInfo_descriptor;
         }

         public HeroDressInfo getDefaultInstanceForType() {
            return HeroDressMsg.HeroDressInfo.getDefaultInstance();
         }

         public HeroDressInfo build() {
            HeroDressInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public HeroDressInfo buildPartial() {
            HeroDressInfo result = new HeroDressInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.lv_ = this.lv_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.hreoId_ = this.hreoId_;
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
            if (other instanceof HeroDressInfo) {
               return this.mergeFrom((HeroDressInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(HeroDressInfo other) {
            if (other == HeroDressMsg.HeroDressInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasHreoId()) {
                  this.setHreoId(other.getHreoId());
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
            HeroDressInfo parsedMessage = null;

            try {
               parsedMessage = (HeroDressInfo)HeroDressMsg.HeroDressInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (HeroDressInfo)e.getUnfinishedMessage();
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

         public boolean hasLv() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 2;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -3;
            this.lv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 4;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -5;
            this.endTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHreoId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getHreoId() {
            return this.hreoId_;
         }

         public Builder setHreoId(int value) {
            this.bitField0_ |= 8;
            this.hreoId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHreoId() {
            this.bitField0_ &= -9;
            this.hreoId_ = 0;
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

   public static final class C2S_Main_11201 extends GeneratedMessageV3 implements C2S_Main_11201OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Main_11201 DEFAULT_INSTANCE = new C2S_Main_11201();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Main_11201> PARSER = new AbstractParser<C2S_Main_11201>() {
         public C2S_Main_11201 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Main_11201(input, extensionRegistry);
         }
      };

      private C2S_Main_11201(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Main_11201() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Main_11201();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Main_11201(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Main_11201_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Main_11201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_11201.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Main_11201)) {
            return super.equals(obj);
         } else {
            C2S_Main_11201 other = (C2S_Main_11201)obj;
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

      public static C2S_Main_11201 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Main_11201)PARSER.parseFrom(data);
      }

      public static C2S_Main_11201 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_11201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_11201 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Main_11201)PARSER.parseFrom(data);
      }

      public static C2S_Main_11201 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_11201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_11201 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Main_11201)PARSER.parseFrom(data);
      }

      public static C2S_Main_11201 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_11201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_11201 parseFrom(InputStream input) throws IOException {
         return (C2S_Main_11201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_11201 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_11201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_11201 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Main_11201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Main_11201 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_11201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_11201 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Main_11201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_11201 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_11201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Main_11201 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Main_11201 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Main_11201> parser() {
         return PARSER;
      }

      public Parser<C2S_Main_11201> getParserForType() {
         return PARSER;
      }

      public C2S_Main_11201 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Main_11201OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Main_11201_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Main_11201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_11201.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroDressMsg.C2S_Main_11201.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Main_11201_descriptor;
         }

         public C2S_Main_11201 getDefaultInstanceForType() {
            return HeroDressMsg.C2S_Main_11201.getDefaultInstance();
         }

         public C2S_Main_11201 build() {
            C2S_Main_11201 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Main_11201 buildPartial() {
            C2S_Main_11201 result = new C2S_Main_11201(this);
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
            if (other instanceof C2S_Main_11201) {
               return this.mergeFrom((C2S_Main_11201)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Main_11201 other) {
            if (other == HeroDressMsg.C2S_Main_11201.getDefaultInstance()) {
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
            C2S_Main_11201 parsedMessage = null;

            try {
               parsedMessage = (C2S_Main_11201)HeroDressMsg.C2S_Main_11201.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Main_11201)e.getUnfinishedMessage();
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

   public static final class S2C_MainResult_11202 extends GeneratedMessageV3 implements S2C_MainResult_11202OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<HeroDressInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_MainResult_11202 DEFAULT_INSTANCE = new S2C_MainResult_11202();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MainResult_11202> PARSER = new AbstractParser<S2C_MainResult_11202>() {
         public S2C_MainResult_11202 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MainResult_11202(input, extensionRegistry);
         }
      };

      private S2C_MainResult_11202(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MainResult_11202() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MainResult_11202();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MainResult_11202(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.infos_.add(input.readMessage(HeroDressMsg.HeroDressInfo.PARSER, extensionRegistry));
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
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_MainResult_11202_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_MainResult_11202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MainResult_11202.class, Builder.class);
      }

      public List<HeroDressInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends HeroDressInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public HeroDressInfo getInfos(int index) {
         return (HeroDressInfo)this.infos_.get(index);
      }

      public HeroDressInfoOrBuilder getInfosOrBuilder(int index) {
         return (HeroDressInfoOrBuilder)this.infos_.get(index);
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
         } else if (!(obj instanceof S2C_MainResult_11202)) {
            return super.equals(obj);
         } else {
            S2C_MainResult_11202 other = (S2C_MainResult_11202)obj;
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

      public static S2C_MainResult_11202 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MainResult_11202)PARSER.parseFrom(data);
      }

      public static S2C_MainResult_11202 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MainResult_11202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MainResult_11202 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MainResult_11202)PARSER.parseFrom(data);
      }

      public static S2C_MainResult_11202 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MainResult_11202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MainResult_11202 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MainResult_11202)PARSER.parseFrom(data);
      }

      public static S2C_MainResult_11202 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MainResult_11202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MainResult_11202 parseFrom(InputStream input) throws IOException {
         return (S2C_MainResult_11202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MainResult_11202 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MainResult_11202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MainResult_11202 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MainResult_11202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MainResult_11202 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MainResult_11202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MainResult_11202 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MainResult_11202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MainResult_11202 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MainResult_11202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MainResult_11202 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MainResult_11202 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MainResult_11202> parser() {
         return PARSER;
      }

      public Parser<S2C_MainResult_11202> getParserForType() {
         return PARSER;
      }

      public S2C_MainResult_11202 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MainResult_11202OrBuilder {
         private int bitField0_;
         private List<HeroDressInfo> infos_;
         private RepeatedFieldBuilderV3<HeroDressInfo, HeroDressInfo.Builder, HeroDressInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_MainResult_11202_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_MainResult_11202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MainResult_11202.class, Builder.class);
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
            if (HeroDressMsg.S2C_MainResult_11202.alwaysUseFieldBuilders) {
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
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_MainResult_11202_descriptor;
         }

         public S2C_MainResult_11202 getDefaultInstanceForType() {
            return HeroDressMsg.S2C_MainResult_11202.getDefaultInstance();
         }

         public S2C_MainResult_11202 build() {
            S2C_MainResult_11202 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MainResult_11202 buildPartial() {
            S2C_MainResult_11202 result = new S2C_MainResult_11202(this);
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
            if (other instanceof S2C_MainResult_11202) {
               return this.mergeFrom((S2C_MainResult_11202)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MainResult_11202 other) {
            if (other == HeroDressMsg.S2C_MainResult_11202.getDefaultInstance()) {
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
                     this.infosBuilder_ = HeroDressMsg.S2C_MainResult_11202.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
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
            S2C_MainResult_11202 parsedMessage = null;

            try {
               parsedMessage = (S2C_MainResult_11202)HeroDressMsg.S2C_MainResult_11202.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MainResult_11202)e.getUnfinishedMessage();
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

         public List<HeroDressInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public HeroDressInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (HeroDressInfo)this.infos_.get(index) : (HeroDressInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, HeroDressInfo value) {
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

         public Builder setInfos(int index, HeroDressInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(HeroDressInfo value) {
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

         public Builder addInfos(int index, HeroDressInfo value) {
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

         public Builder addInfos(HeroDressInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, HeroDressInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends HeroDressInfo> values) {
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

         public HeroDressInfo.Builder getInfosBuilder(int index) {
            return (HeroDressInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public HeroDressInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (HeroDressInfoOrBuilder)this.infos_.get(index) : (HeroDressInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HeroDressInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public HeroDressInfo.Builder addInfosBuilder() {
            return (HeroDressInfo.Builder)this.getInfosFieldBuilder().addBuilder(HeroDressMsg.HeroDressInfo.getDefaultInstance());
         }

         public HeroDressInfo.Builder addInfosBuilder(int index) {
            return (HeroDressInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, HeroDressMsg.HeroDressInfo.getDefaultInstance());
         }

         public List<HeroDressInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HeroDressInfo, HeroDressInfo.Builder, HeroDressInfoOrBuilder> getInfosFieldBuilder() {
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

   public static final class C2S_DelDress_11203 extends GeneratedMessageV3 implements C2S_DelDress_11203OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ID_FIELD_NUMBER = 1;
      private Internal.IntList id_;
      private byte memoizedIsInitialized;
      private static final C2S_DelDress_11203 DEFAULT_INSTANCE = new C2S_DelDress_11203();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DelDress_11203> PARSER = new AbstractParser<C2S_DelDress_11203>() {
         public C2S_DelDress_11203 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DelDress_11203(input, extensionRegistry);
         }
      };

      private C2S_DelDress_11203(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DelDress_11203() {
         this.memoizedIsInitialized = -1;
         this.id_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DelDress_11203();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DelDress_11203(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.id_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 1;
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
               if ((mutable_bitField0_ & 1) != 0) {
                  this.id_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_DelDress_11203_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_DelDress_11203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DelDress_11203.class, Builder.class);
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.id_.size(); ++i) {
            output.writeInt32(1, this.id_.getInt(i));
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
         } else if (!(obj instanceof C2S_DelDress_11203)) {
            return super.equals(obj);
         } else {
            C2S_DelDress_11203 other = (C2S_DelDress_11203)obj;
            if (!this.getIdList().equals(other.getIdList())) {
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
            if (this.getIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_DelDress_11203 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DelDress_11203)PARSER.parseFrom(data);
      }

      public static C2S_DelDress_11203 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DelDress_11203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DelDress_11203 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DelDress_11203)PARSER.parseFrom(data);
      }

      public static C2S_DelDress_11203 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DelDress_11203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DelDress_11203 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DelDress_11203)PARSER.parseFrom(data);
      }

      public static C2S_DelDress_11203 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DelDress_11203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DelDress_11203 parseFrom(InputStream input) throws IOException {
         return (C2S_DelDress_11203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DelDress_11203 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DelDress_11203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DelDress_11203 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DelDress_11203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DelDress_11203 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DelDress_11203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DelDress_11203 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DelDress_11203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DelDress_11203 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DelDress_11203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DelDress_11203 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DelDress_11203 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DelDress_11203> parser() {
         return PARSER;
      }

      public Parser<C2S_DelDress_11203> getParserForType() {
         return PARSER;
      }

      public C2S_DelDress_11203 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DelDress_11203OrBuilder {
         private int bitField0_;
         private Internal.IntList id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_DelDress_11203_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_DelDress_11203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DelDress_11203.class, Builder.class);
         }

         private Builder() {
            this.id_ = HeroDressMsg.C2S_DelDress_11203.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.id_ = HeroDressMsg.C2S_DelDress_11203.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroDressMsg.C2S_DelDress_11203.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = HeroDressMsg.C2S_DelDress_11203.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_DelDress_11203_descriptor;
         }

         public C2S_DelDress_11203 getDefaultInstanceForType() {
            return HeroDressMsg.C2S_DelDress_11203.getDefaultInstance();
         }

         public C2S_DelDress_11203 build() {
            C2S_DelDress_11203 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DelDress_11203 buildPartial() {
            C2S_DelDress_11203 result = new C2S_DelDress_11203(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.id_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.id_ = this.id_;
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
            if (other instanceof C2S_DelDress_11203) {
               return this.mergeFrom((C2S_DelDress_11203)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DelDress_11203 other) {
            if (other == HeroDressMsg.C2S_DelDress_11203.getDefaultInstance()) {
               return this;
            } else {
               if (!other.id_.isEmpty()) {
                  if (this.id_.isEmpty()) {
                     this.id_ = other.id_;
                     this.bitField0_ &= -2;
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
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_DelDress_11203 parsedMessage = null;

            try {
               parsedMessage = (C2S_DelDress_11203)HeroDressMsg.C2S_DelDress_11203.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DelDress_11203)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.id_ = HeroDressMsg.C2S_DelDress_11203.mutableCopy(this.id_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.id_) : this.id_);
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
            this.id_ = HeroDressMsg.C2S_DelDress_11203.emptyIntList();
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

   public static final class S2C_DelDress_11204 extends GeneratedMessageV3 implements S2C_DelDress_11204OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ID_FIELD_NUMBER = 1;
      private Internal.IntList id_;
      private byte memoizedIsInitialized;
      private static final S2C_DelDress_11204 DEFAULT_INSTANCE = new S2C_DelDress_11204();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DelDress_11204> PARSER = new AbstractParser<S2C_DelDress_11204>() {
         public S2C_DelDress_11204 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DelDress_11204(input, extensionRegistry);
         }
      };

      private S2C_DelDress_11204(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DelDress_11204() {
         this.memoizedIsInitialized = -1;
         this.id_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DelDress_11204();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DelDress_11204(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.id_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 1;
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
               if ((mutable_bitField0_ & 1) != 0) {
                  this.id_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_DelDress_11204_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_DelDress_11204_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DelDress_11204.class, Builder.class);
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.id_.size(); ++i) {
            output.writeInt32(1, this.id_.getInt(i));
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
         } else if (!(obj instanceof S2C_DelDress_11204)) {
            return super.equals(obj);
         } else {
            S2C_DelDress_11204 other = (S2C_DelDress_11204)obj;
            if (!this.getIdList().equals(other.getIdList())) {
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
            if (this.getIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DelDress_11204 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DelDress_11204)PARSER.parseFrom(data);
      }

      public static S2C_DelDress_11204 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DelDress_11204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DelDress_11204 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DelDress_11204)PARSER.parseFrom(data);
      }

      public static S2C_DelDress_11204 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DelDress_11204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DelDress_11204 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DelDress_11204)PARSER.parseFrom(data);
      }

      public static S2C_DelDress_11204 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DelDress_11204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DelDress_11204 parseFrom(InputStream input) throws IOException {
         return (S2C_DelDress_11204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DelDress_11204 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DelDress_11204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DelDress_11204 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DelDress_11204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DelDress_11204 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DelDress_11204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DelDress_11204 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DelDress_11204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DelDress_11204 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DelDress_11204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DelDress_11204 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DelDress_11204 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DelDress_11204> parser() {
         return PARSER;
      }

      public Parser<S2C_DelDress_11204> getParserForType() {
         return PARSER;
      }

      public S2C_DelDress_11204 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DelDress_11204OrBuilder {
         private int bitField0_;
         private Internal.IntList id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_DelDress_11204_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_DelDress_11204_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DelDress_11204.class, Builder.class);
         }

         private Builder() {
            this.id_ = HeroDressMsg.S2C_DelDress_11204.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.id_ = HeroDressMsg.S2C_DelDress_11204.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroDressMsg.S2C_DelDress_11204.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = HeroDressMsg.S2C_DelDress_11204.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_DelDress_11204_descriptor;
         }

         public S2C_DelDress_11204 getDefaultInstanceForType() {
            return HeroDressMsg.S2C_DelDress_11204.getDefaultInstance();
         }

         public S2C_DelDress_11204 build() {
            S2C_DelDress_11204 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DelDress_11204 buildPartial() {
            S2C_DelDress_11204 result = new S2C_DelDress_11204(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.id_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.id_ = this.id_;
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
            if (other instanceof S2C_DelDress_11204) {
               return this.mergeFrom((S2C_DelDress_11204)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DelDress_11204 other) {
            if (other == HeroDressMsg.S2C_DelDress_11204.getDefaultInstance()) {
               return this;
            } else {
               if (!other.id_.isEmpty()) {
                  if (this.id_.isEmpty()) {
                     this.id_ = other.id_;
                     this.bitField0_ &= -2;
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
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DelDress_11204 parsedMessage = null;

            try {
               parsedMessage = (S2C_DelDress_11204)HeroDressMsg.S2C_DelDress_11204.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DelDress_11204)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.id_ = HeroDressMsg.S2C_DelDress_11204.mutableCopy(this.id_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.id_) : this.id_);
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
            this.id_ = HeroDressMsg.S2C_DelDress_11204.emptyIntList();
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

   public static final class C2S_Wear_11205 extends GeneratedMessageV3 implements C2S_Wear_11205OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int DRESSID_FIELD_NUMBER = 2;
      private int dressId_;
      private byte memoizedIsInitialized;
      private static final C2S_Wear_11205 DEFAULT_INSTANCE = new C2S_Wear_11205();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Wear_11205> PARSER = new AbstractParser<C2S_Wear_11205>() {
         public C2S_Wear_11205 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Wear_11205(input, extensionRegistry);
         }
      };

      private C2S_Wear_11205(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Wear_11205() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Wear_11205();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Wear_11205(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.dressId_ = input.readInt32();
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
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Wear_11205_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Wear_11205_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Wear_11205.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasDressId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDressId() {
         return this.dressId_;
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
         } else if (!this.hasDressId()) {
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
            output.writeInt32(2, this.dressId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.dressId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Wear_11205)) {
            return super.equals(obj);
         } else {
            C2S_Wear_11205 other = (C2S_Wear_11205)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasDressId() != other.hasDressId()) {
               return false;
            } else if (this.hasDressId() && this.getDressId() != other.getDressId()) {
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

            if (this.hasDressId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDressId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Wear_11205 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Wear_11205)PARSER.parseFrom(data);
      }

      public static C2S_Wear_11205 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Wear_11205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Wear_11205 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Wear_11205)PARSER.parseFrom(data);
      }

      public static C2S_Wear_11205 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Wear_11205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Wear_11205 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Wear_11205)PARSER.parseFrom(data);
      }

      public static C2S_Wear_11205 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Wear_11205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Wear_11205 parseFrom(InputStream input) throws IOException {
         return (C2S_Wear_11205)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Wear_11205 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Wear_11205)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Wear_11205 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Wear_11205)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Wear_11205 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Wear_11205)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Wear_11205 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Wear_11205)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Wear_11205 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Wear_11205)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Wear_11205 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Wear_11205 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Wear_11205> parser() {
         return PARSER;
      }

      public Parser<C2S_Wear_11205> getParserForType() {
         return PARSER;
      }

      public C2S_Wear_11205 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Wear_11205OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int dressId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Wear_11205_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Wear_11205_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Wear_11205.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroDressMsg.C2S_Wear_11205.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.dressId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Wear_11205_descriptor;
         }

         public C2S_Wear_11205 getDefaultInstanceForType() {
            return HeroDressMsg.C2S_Wear_11205.getDefaultInstance();
         }

         public C2S_Wear_11205 build() {
            C2S_Wear_11205 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Wear_11205 buildPartial() {
            C2S_Wear_11205 result = new C2S_Wear_11205(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.dressId_ = this.dressId_;
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
            if (other instanceof C2S_Wear_11205) {
               return this.mergeFrom((C2S_Wear_11205)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Wear_11205 other) {
            if (other == HeroDressMsg.C2S_Wear_11205.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasDressId()) {
                  this.setDressId(other.getDressId());
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
               return this.hasDressId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Wear_11205 parsedMessage = null;

            try {
               parsedMessage = (C2S_Wear_11205)HeroDressMsg.C2S_Wear_11205.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Wear_11205)e.getUnfinishedMessage();
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

         public boolean hasDressId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDressId() {
            return this.dressId_;
         }

         public Builder setDressId(int value) {
            this.bitField0_ |= 2;
            this.dressId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDressId() {
            this.bitField0_ &= -3;
            this.dressId_ = 0;
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

   public static final class S2C_WearResult_11206 extends GeneratedMessageV3 implements S2C_WearResult_11206OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_WearResult_11206 DEFAULT_INSTANCE = new S2C_WearResult_11206();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WearResult_11206> PARSER = new AbstractParser<S2C_WearResult_11206>() {
         public S2C_WearResult_11206 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WearResult_11206(input, extensionRegistry);
         }
      };

      private S2C_WearResult_11206(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WearResult_11206() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WearResult_11206();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WearResult_11206(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_WearResult_11206_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_WearResult_11206_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WearResult_11206.class, Builder.class);
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
         } else if (!(obj instanceof S2C_WearResult_11206)) {
            return super.equals(obj);
         } else {
            S2C_WearResult_11206 other = (S2C_WearResult_11206)obj;
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

      public static S2C_WearResult_11206 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WearResult_11206)PARSER.parseFrom(data);
      }

      public static S2C_WearResult_11206 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WearResult_11206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WearResult_11206 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WearResult_11206)PARSER.parseFrom(data);
      }

      public static S2C_WearResult_11206 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WearResult_11206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WearResult_11206 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WearResult_11206)PARSER.parseFrom(data);
      }

      public static S2C_WearResult_11206 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WearResult_11206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WearResult_11206 parseFrom(InputStream input) throws IOException {
         return (S2C_WearResult_11206)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WearResult_11206 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WearResult_11206)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WearResult_11206 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WearResult_11206)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WearResult_11206 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WearResult_11206)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WearResult_11206 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WearResult_11206)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WearResult_11206 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WearResult_11206)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WearResult_11206 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WearResult_11206 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WearResult_11206> parser() {
         return PARSER;
      }

      public Parser<S2C_WearResult_11206> getParserForType() {
         return PARSER;
      }

      public S2C_WearResult_11206 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WearResult_11206OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_WearResult_11206_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_WearResult_11206_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WearResult_11206.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroDressMsg.S2C_WearResult_11206.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_WearResult_11206_descriptor;
         }

         public S2C_WearResult_11206 getDefaultInstanceForType() {
            return HeroDressMsg.S2C_WearResult_11206.getDefaultInstance();
         }

         public S2C_WearResult_11206 build() {
            S2C_WearResult_11206 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WearResult_11206 buildPartial() {
            S2C_WearResult_11206 result = new S2C_WearResult_11206(this);
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
            if (other instanceof S2C_WearResult_11206) {
               return this.mergeFrom((S2C_WearResult_11206)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WearResult_11206 other) {
            if (other == HeroDressMsg.S2C_WearResult_11206.getDefaultInstance()) {
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
            S2C_WearResult_11206 parsedMessage = null;

            try {
               parsedMessage = (S2C_WearResult_11206)HeroDressMsg.S2C_WearResult_11206.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WearResult_11206)e.getUnfinishedMessage();
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

   public static final class C2S_Undress_11207 extends GeneratedMessageV3 implements C2S_Undress_11207OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_Undress_11207 DEFAULT_INSTANCE = new C2S_Undress_11207();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Undress_11207> PARSER = new AbstractParser<C2S_Undress_11207>() {
         public C2S_Undress_11207 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Undress_11207(input, extensionRegistry);
         }
      };

      private C2S_Undress_11207(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Undress_11207() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Undress_11207();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Undress_11207(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Undress_11207_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Undress_11207_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Undress_11207.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Undress_11207)) {
            return super.equals(obj);
         } else {
            C2S_Undress_11207 other = (C2S_Undress_11207)obj;
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

      public static C2S_Undress_11207 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Undress_11207)PARSER.parseFrom(data);
      }

      public static C2S_Undress_11207 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Undress_11207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Undress_11207 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Undress_11207)PARSER.parseFrom(data);
      }

      public static C2S_Undress_11207 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Undress_11207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Undress_11207 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Undress_11207)PARSER.parseFrom(data);
      }

      public static C2S_Undress_11207 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Undress_11207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Undress_11207 parseFrom(InputStream input) throws IOException {
         return (C2S_Undress_11207)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Undress_11207 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Undress_11207)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Undress_11207 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Undress_11207)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Undress_11207 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Undress_11207)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Undress_11207 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Undress_11207)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Undress_11207 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Undress_11207)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Undress_11207 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Undress_11207 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Undress_11207> parser() {
         return PARSER;
      }

      public Parser<C2S_Undress_11207> getParserForType() {
         return PARSER;
      }

      public C2S_Undress_11207 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Undress_11207OrBuilder {
         private int bitField0_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Undress_11207_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Undress_11207_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Undress_11207.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroDressMsg.C2S_Undress_11207.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Undress_11207_descriptor;
         }

         public C2S_Undress_11207 getDefaultInstanceForType() {
            return HeroDressMsg.C2S_Undress_11207.getDefaultInstance();
         }

         public C2S_Undress_11207 build() {
            C2S_Undress_11207 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Undress_11207 buildPartial() {
            C2S_Undress_11207 result = new C2S_Undress_11207(this);
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
            if (other instanceof C2S_Undress_11207) {
               return this.mergeFrom((C2S_Undress_11207)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Undress_11207 other) {
            if (other == HeroDressMsg.C2S_Undress_11207.getDefaultInstance()) {
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
            C2S_Undress_11207 parsedMessage = null;

            try {
               parsedMessage = (C2S_Undress_11207)HeroDressMsg.C2S_Undress_11207.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Undress_11207)e.getUnfinishedMessage();
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

   public static final class S2C_UndressResult_11208 extends GeneratedMessageV3 implements S2C_UndressResult_11208OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_UndressResult_11208 DEFAULT_INSTANCE = new S2C_UndressResult_11208();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UndressResult_11208> PARSER = new AbstractParser<S2C_UndressResult_11208>() {
         public S2C_UndressResult_11208 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UndressResult_11208(input, extensionRegistry);
         }
      };

      private S2C_UndressResult_11208(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UndressResult_11208() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UndressResult_11208();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UndressResult_11208(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_UndressResult_11208_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_UndressResult_11208_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UndressResult_11208.class, Builder.class);
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
         } else if (!(obj instanceof S2C_UndressResult_11208)) {
            return super.equals(obj);
         } else {
            S2C_UndressResult_11208 other = (S2C_UndressResult_11208)obj;
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

      public static S2C_UndressResult_11208 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UndressResult_11208)PARSER.parseFrom(data);
      }

      public static S2C_UndressResult_11208 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UndressResult_11208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UndressResult_11208 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UndressResult_11208)PARSER.parseFrom(data);
      }

      public static S2C_UndressResult_11208 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UndressResult_11208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UndressResult_11208 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UndressResult_11208)PARSER.parseFrom(data);
      }

      public static S2C_UndressResult_11208 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UndressResult_11208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UndressResult_11208 parseFrom(InputStream input) throws IOException {
         return (S2C_UndressResult_11208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UndressResult_11208 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UndressResult_11208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UndressResult_11208 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UndressResult_11208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UndressResult_11208 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UndressResult_11208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UndressResult_11208 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UndressResult_11208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UndressResult_11208 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UndressResult_11208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UndressResult_11208 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UndressResult_11208 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UndressResult_11208> parser() {
         return PARSER;
      }

      public Parser<S2C_UndressResult_11208> getParserForType() {
         return PARSER;
      }

      public S2C_UndressResult_11208 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UndressResult_11208OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_UndressResult_11208_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_UndressResult_11208_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UndressResult_11208.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroDressMsg.S2C_UndressResult_11208.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_UndressResult_11208_descriptor;
         }

         public S2C_UndressResult_11208 getDefaultInstanceForType() {
            return HeroDressMsg.S2C_UndressResult_11208.getDefaultInstance();
         }

         public S2C_UndressResult_11208 build() {
            S2C_UndressResult_11208 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UndressResult_11208 buildPartial() {
            S2C_UndressResult_11208 result = new S2C_UndressResult_11208(this);
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
            if (other instanceof S2C_UndressResult_11208) {
               return this.mergeFrom((S2C_UndressResult_11208)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UndressResult_11208 other) {
            if (other == HeroDressMsg.S2C_UndressResult_11208.getDefaultInstance()) {
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
            S2C_UndressResult_11208 parsedMessage = null;

            try {
               parsedMessage = (S2C_UndressResult_11208)HeroDressMsg.S2C_UndressResult_11208.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UndressResult_11208)e.getUnfinishedMessage();
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

   public static final class C2S_Upgrade_11209 extends GeneratedMessageV3 implements C2S_Upgrade_11209OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DRESSID_FIELD_NUMBER = 1;
      private int dressId_;
      private byte memoizedIsInitialized;
      private static final C2S_Upgrade_11209 DEFAULT_INSTANCE = new C2S_Upgrade_11209();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Upgrade_11209> PARSER = new AbstractParser<C2S_Upgrade_11209>() {
         public C2S_Upgrade_11209 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Upgrade_11209(input, extensionRegistry);
         }
      };

      private C2S_Upgrade_11209(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Upgrade_11209() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Upgrade_11209();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Upgrade_11209(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.dressId_ = input.readInt32();
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
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Upgrade_11209_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Upgrade_11209_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Upgrade_11209.class, Builder.class);
      }

      public boolean hasDressId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDressId() {
         return this.dressId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDressId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.dressId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.dressId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Upgrade_11209)) {
            return super.equals(obj);
         } else {
            C2S_Upgrade_11209 other = (C2S_Upgrade_11209)obj;
            if (this.hasDressId() != other.hasDressId()) {
               return false;
            } else if (this.hasDressId() && this.getDressId() != other.getDressId()) {
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
            if (this.hasDressId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDressId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Upgrade_11209 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_11209)PARSER.parseFrom(data);
      }

      public static C2S_Upgrade_11209 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_11209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Upgrade_11209 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_11209)PARSER.parseFrom(data);
      }

      public static C2S_Upgrade_11209 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_11209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Upgrade_11209 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_11209)PARSER.parseFrom(data);
      }

      public static C2S_Upgrade_11209 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_11209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Upgrade_11209 parseFrom(InputStream input) throws IOException {
         return (C2S_Upgrade_11209)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Upgrade_11209 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Upgrade_11209)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Upgrade_11209 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Upgrade_11209)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Upgrade_11209 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Upgrade_11209)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Upgrade_11209 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Upgrade_11209)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Upgrade_11209 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Upgrade_11209)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Upgrade_11209 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Upgrade_11209 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Upgrade_11209> parser() {
         return PARSER;
      }

      public Parser<C2S_Upgrade_11209> getParserForType() {
         return PARSER;
      }

      public C2S_Upgrade_11209 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Upgrade_11209OrBuilder {
         private int bitField0_;
         private int dressId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Upgrade_11209_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Upgrade_11209_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Upgrade_11209.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroDressMsg.C2S_Upgrade_11209.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.dressId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Upgrade_11209_descriptor;
         }

         public C2S_Upgrade_11209 getDefaultInstanceForType() {
            return HeroDressMsg.C2S_Upgrade_11209.getDefaultInstance();
         }

         public C2S_Upgrade_11209 build() {
            C2S_Upgrade_11209 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Upgrade_11209 buildPartial() {
            C2S_Upgrade_11209 result = new C2S_Upgrade_11209(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.dressId_ = this.dressId_;
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
            if (other instanceof C2S_Upgrade_11209) {
               return this.mergeFrom((C2S_Upgrade_11209)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Upgrade_11209 other) {
            if (other == HeroDressMsg.C2S_Upgrade_11209.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDressId()) {
                  this.setDressId(other.getDressId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasDressId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Upgrade_11209 parsedMessage = null;

            try {
               parsedMessage = (C2S_Upgrade_11209)HeroDressMsg.C2S_Upgrade_11209.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Upgrade_11209)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDressId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDressId() {
            return this.dressId_;
         }

         public Builder setDressId(int value) {
            this.bitField0_ |= 1;
            this.dressId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDressId() {
            this.bitField0_ &= -2;
            this.dressId_ = 0;
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

   public static final class S2C_UpgradeResult_11210 extends GeneratedMessageV3 implements S2C_UpgradeResult_11210OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int INFO_FIELD_NUMBER = 2;
      private HeroDressInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_UpgradeResult_11210 DEFAULT_INSTANCE = new S2C_UpgradeResult_11210();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpgradeResult_11210> PARSER = new AbstractParser<S2C_UpgradeResult_11210>() {
         public S2C_UpgradeResult_11210 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpgradeResult_11210(input, extensionRegistry);
         }
      };

      private S2C_UpgradeResult_11210(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpgradeResult_11210() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpgradeResult_11210();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpgradeResult_11210(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        HeroDressInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (HeroDressInfo)input.readMessage(HeroDressMsg.HeroDressInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
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
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_UpgradeResult_11210_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_UpgradeResult_11210_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpgradeResult_11210.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public HeroDressInfo getInfo() {
         return this.info_ == null ? HeroDressMsg.HeroDressInfo.getDefaultInstance() : this.info_;
      }

      public HeroDressInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? HeroDressMsg.HeroDressInfo.getDefaultInstance() : this.info_;
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
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
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
               size += CodedOutputStream.computeInt32Size(1, this.result_);
            }

            if ((this.bitField0_ & 2) != 0) {
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
         } else if (!(obj instanceof S2C_UpgradeResult_11210)) {
            return super.equals(obj);
         } else {
            S2C_UpgradeResult_11210 other = (S2C_UpgradeResult_11210)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasInfo() != other.hasInfo()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpgradeResult_11210 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpgradeResult_11210)PARSER.parseFrom(data);
      }

      public static S2C_UpgradeResult_11210 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpgradeResult_11210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpgradeResult_11210 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpgradeResult_11210)PARSER.parseFrom(data);
      }

      public static S2C_UpgradeResult_11210 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpgradeResult_11210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpgradeResult_11210 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpgradeResult_11210)PARSER.parseFrom(data);
      }

      public static S2C_UpgradeResult_11210 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpgradeResult_11210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpgradeResult_11210 parseFrom(InputStream input) throws IOException {
         return (S2C_UpgradeResult_11210)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpgradeResult_11210 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpgradeResult_11210)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpgradeResult_11210 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpgradeResult_11210)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpgradeResult_11210 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpgradeResult_11210)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpgradeResult_11210 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpgradeResult_11210)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpgradeResult_11210 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpgradeResult_11210)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpgradeResult_11210 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpgradeResult_11210 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpgradeResult_11210> parser() {
         return PARSER;
      }

      public Parser<S2C_UpgradeResult_11210> getParserForType() {
         return PARSER;
      }

      public S2C_UpgradeResult_11210 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpgradeResult_11210OrBuilder {
         private int bitField0_;
         private int result_;
         private HeroDressInfo info_;
         private SingleFieldBuilderV3<HeroDressInfo, HeroDressInfo.Builder, HeroDressInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_UpgradeResult_11210_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_UpgradeResult_11210_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpgradeResult_11210.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroDressMsg.S2C_UpgradeResult_11210.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            if (this.infoBuilder_ == null) {
               this.info_ = null;
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_UpgradeResult_11210_descriptor;
         }

         public S2C_UpgradeResult_11210 getDefaultInstanceForType() {
            return HeroDressMsg.S2C_UpgradeResult_11210.getDefaultInstance();
         }

         public S2C_UpgradeResult_11210 build() {
            S2C_UpgradeResult_11210 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpgradeResult_11210 buildPartial() {
            S2C_UpgradeResult_11210 result = new S2C_UpgradeResult_11210(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (HeroDressInfo)this.infoBuilder_.build();
               }

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
            if (other instanceof S2C_UpgradeResult_11210) {
               return this.mergeFrom((S2C_UpgradeResult_11210)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpgradeResult_11210 other) {
            if (other == HeroDressMsg.S2C_UpgradeResult_11210.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasInfo()) {
               return false;
            } else {
               return this.getInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpgradeResult_11210 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpgradeResult_11210)HeroDressMsg.S2C_UpgradeResult_11210.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpgradeResult_11210)e.getUnfinishedMessage();
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

         public boolean hasInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public HeroDressInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? HeroDressMsg.HeroDressInfo.getDefaultInstance() : this.info_;
            } else {
               return (HeroDressInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(HeroDressInfo value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.info_ = value;
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setInfo(HeroDressInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeInfo(HeroDressInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.info_ != null && this.info_ != HeroDressMsg.HeroDressInfo.getDefaultInstance()) {
                  this.info_ = HeroDressMsg.HeroDressInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
               } else {
                  this.info_ = value;
               }

               this.onChanged();
            } else {
               this.infoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = null;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public HeroDressInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (HeroDressInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public HeroDressInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (HeroDressInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? HeroDressMsg.HeroDressInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<HeroDressInfo, HeroDressInfo.Builder, HeroDressInfoOrBuilder> getInfoFieldBuilder() {
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

   public static final class C2S_Decompose_11211 extends GeneratedMessageV3 implements C2S_Decompose_11211OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DRESSID_FIELD_NUMBER = 1;
      private int dressId_;
      private byte memoizedIsInitialized;
      private static final C2S_Decompose_11211 DEFAULT_INSTANCE = new C2S_Decompose_11211();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Decompose_11211> PARSER = new AbstractParser<C2S_Decompose_11211>() {
         public C2S_Decompose_11211 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Decompose_11211(input, extensionRegistry);
         }
      };

      private C2S_Decompose_11211(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Decompose_11211() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Decompose_11211();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Decompose_11211(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.dressId_ = input.readInt32();
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
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Decompose_11211_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Decompose_11211_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Decompose_11211.class, Builder.class);
      }

      public boolean hasDressId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDressId() {
         return this.dressId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDressId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.dressId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.dressId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Decompose_11211)) {
            return super.equals(obj);
         } else {
            C2S_Decompose_11211 other = (C2S_Decompose_11211)obj;
            if (this.hasDressId() != other.hasDressId()) {
               return false;
            } else if (this.hasDressId() && this.getDressId() != other.getDressId()) {
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
            if (this.hasDressId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDressId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Decompose_11211 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Decompose_11211)PARSER.parseFrom(data);
      }

      public static C2S_Decompose_11211 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Decompose_11211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Decompose_11211 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Decompose_11211)PARSER.parseFrom(data);
      }

      public static C2S_Decompose_11211 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Decompose_11211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Decompose_11211 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Decompose_11211)PARSER.parseFrom(data);
      }

      public static C2S_Decompose_11211 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Decompose_11211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Decompose_11211 parseFrom(InputStream input) throws IOException {
         return (C2S_Decompose_11211)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Decompose_11211 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Decompose_11211)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Decompose_11211 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Decompose_11211)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Decompose_11211 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Decompose_11211)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Decompose_11211 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Decompose_11211)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Decompose_11211 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Decompose_11211)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Decompose_11211 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Decompose_11211 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Decompose_11211> parser() {
         return PARSER;
      }

      public Parser<C2S_Decompose_11211> getParserForType() {
         return PARSER;
      }

      public C2S_Decompose_11211 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Decompose_11211OrBuilder {
         private int bitField0_;
         private int dressId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Decompose_11211_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Decompose_11211_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Decompose_11211.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroDressMsg.C2S_Decompose_11211.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.dressId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_Decompose_11211_descriptor;
         }

         public C2S_Decompose_11211 getDefaultInstanceForType() {
            return HeroDressMsg.C2S_Decompose_11211.getDefaultInstance();
         }

         public C2S_Decompose_11211 build() {
            C2S_Decompose_11211 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Decompose_11211 buildPartial() {
            C2S_Decompose_11211 result = new C2S_Decompose_11211(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.dressId_ = this.dressId_;
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
            if (other instanceof C2S_Decompose_11211) {
               return this.mergeFrom((C2S_Decompose_11211)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Decompose_11211 other) {
            if (other == HeroDressMsg.C2S_Decompose_11211.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDressId()) {
                  this.setDressId(other.getDressId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasDressId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Decompose_11211 parsedMessage = null;

            try {
               parsedMessage = (C2S_Decompose_11211)HeroDressMsg.C2S_Decompose_11211.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Decompose_11211)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDressId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDressId() {
            return this.dressId_;
         }

         public Builder setDressId(int value) {
            this.bitField0_ |= 1;
            this.dressId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDressId() {
            this.bitField0_ &= -2;
            this.dressId_ = 0;
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

   public static final class S2C_DecomposeResult_11212 extends GeneratedMessageV3 implements S2C_DecomposeResult_11212OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int DRESSID_FIELD_NUMBER = 2;
      private int dressId_;
      private byte memoizedIsInitialized;
      private static final S2C_DecomposeResult_11212 DEFAULT_INSTANCE = new S2C_DecomposeResult_11212();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DecomposeResult_11212> PARSER = new AbstractParser<S2C_DecomposeResult_11212>() {
         public S2C_DecomposeResult_11212 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DecomposeResult_11212(input, extensionRegistry);
         }
      };

      private S2C_DecomposeResult_11212(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DecomposeResult_11212() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DecomposeResult_11212();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DecomposeResult_11212(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.dressId_ = input.readInt32();
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
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_DecomposeResult_11212_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_DecomposeResult_11212_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DecomposeResult_11212.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasDressId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDressId() {
         return this.dressId_;
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
         } else if (!this.hasDressId()) {
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
            output.writeInt32(2, this.dressId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.dressId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DecomposeResult_11212)) {
            return super.equals(obj);
         } else {
            S2C_DecomposeResult_11212 other = (S2C_DecomposeResult_11212)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasDressId() != other.hasDressId()) {
               return false;
            } else if (this.hasDressId() && this.getDressId() != other.getDressId()) {
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

            if (this.hasDressId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDressId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DecomposeResult_11212 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DecomposeResult_11212)PARSER.parseFrom(data);
      }

      public static S2C_DecomposeResult_11212 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DecomposeResult_11212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DecomposeResult_11212 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DecomposeResult_11212)PARSER.parseFrom(data);
      }

      public static S2C_DecomposeResult_11212 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DecomposeResult_11212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DecomposeResult_11212 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DecomposeResult_11212)PARSER.parseFrom(data);
      }

      public static S2C_DecomposeResult_11212 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DecomposeResult_11212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DecomposeResult_11212 parseFrom(InputStream input) throws IOException {
         return (S2C_DecomposeResult_11212)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DecomposeResult_11212 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DecomposeResult_11212)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DecomposeResult_11212 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DecomposeResult_11212)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DecomposeResult_11212 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DecomposeResult_11212)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DecomposeResult_11212 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DecomposeResult_11212)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DecomposeResult_11212 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DecomposeResult_11212)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DecomposeResult_11212 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DecomposeResult_11212 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DecomposeResult_11212> parser() {
         return PARSER;
      }

      public Parser<S2C_DecomposeResult_11212> getParserForType() {
         return PARSER;
      }

      public S2C_DecomposeResult_11212 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DecomposeResult_11212OrBuilder {
         private int bitField0_;
         private int result_;
         private int dressId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_DecomposeResult_11212_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_DecomposeResult_11212_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DecomposeResult_11212.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroDressMsg.S2C_DecomposeResult_11212.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.dressId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_DecomposeResult_11212_descriptor;
         }

         public S2C_DecomposeResult_11212 getDefaultInstanceForType() {
            return HeroDressMsg.S2C_DecomposeResult_11212.getDefaultInstance();
         }

         public S2C_DecomposeResult_11212 build() {
            S2C_DecomposeResult_11212 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DecomposeResult_11212 buildPartial() {
            S2C_DecomposeResult_11212 result = new S2C_DecomposeResult_11212(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.dressId_ = this.dressId_;
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
            if (other instanceof S2C_DecomposeResult_11212) {
               return this.mergeFrom((S2C_DecomposeResult_11212)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DecomposeResult_11212 other) {
            if (other == HeroDressMsg.S2C_DecomposeResult_11212.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasDressId()) {
                  this.setDressId(other.getDressId());
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
               return this.hasDressId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DecomposeResult_11212 parsedMessage = null;

            try {
               parsedMessage = (S2C_DecomposeResult_11212)HeroDressMsg.S2C_DecomposeResult_11212.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DecomposeResult_11212)e.getUnfinishedMessage();
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

         public boolean hasDressId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDressId() {
            return this.dressId_;
         }

         public Builder setDressId(int value) {
            this.bitField0_ |= 2;
            this.dressId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDressId() {
            this.bitField0_ &= -3;
            this.dressId_ = 0;
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

   public static final class C2S_ResetDress_11213 extends GeneratedMessageV3 implements C2S_ResetDress_11213OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DRESSID_FIELD_NUMBER = 1;
      private int dressId_;
      private byte memoizedIsInitialized;
      private static final C2S_ResetDress_11213 DEFAULT_INSTANCE = new C2S_ResetDress_11213();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ResetDress_11213> PARSER = new AbstractParser<C2S_ResetDress_11213>() {
         public C2S_ResetDress_11213 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ResetDress_11213(input, extensionRegistry);
         }
      };

      private C2S_ResetDress_11213(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ResetDress_11213() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ResetDress_11213();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ResetDress_11213(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.dressId_ = input.readInt32();
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
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_ResetDress_11213_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_ResetDress_11213_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ResetDress_11213.class, Builder.class);
      }

      public boolean hasDressId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDressId() {
         return this.dressId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDressId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.dressId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.dressId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ResetDress_11213)) {
            return super.equals(obj);
         } else {
            C2S_ResetDress_11213 other = (C2S_ResetDress_11213)obj;
            if (this.hasDressId() != other.hasDressId()) {
               return false;
            } else if (this.hasDressId() && this.getDressId() != other.getDressId()) {
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
            if (this.hasDressId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDressId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ResetDress_11213 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ResetDress_11213)PARSER.parseFrom(data);
      }

      public static C2S_ResetDress_11213 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetDress_11213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetDress_11213 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ResetDress_11213)PARSER.parseFrom(data);
      }

      public static C2S_ResetDress_11213 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetDress_11213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetDress_11213 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ResetDress_11213)PARSER.parseFrom(data);
      }

      public static C2S_ResetDress_11213 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetDress_11213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetDress_11213 parseFrom(InputStream input) throws IOException {
         return (C2S_ResetDress_11213)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ResetDress_11213 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetDress_11213)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ResetDress_11213 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ResetDress_11213)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ResetDress_11213 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetDress_11213)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ResetDress_11213 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ResetDress_11213)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ResetDress_11213 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetDress_11213)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ResetDress_11213 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ResetDress_11213 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ResetDress_11213> parser() {
         return PARSER;
      }

      public Parser<C2S_ResetDress_11213> getParserForType() {
         return PARSER;
      }

      public C2S_ResetDress_11213 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ResetDress_11213OrBuilder {
         private int bitField0_;
         private int dressId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_ResetDress_11213_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_ResetDress_11213_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ResetDress_11213.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroDressMsg.C2S_ResetDress_11213.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.dressId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_ResetDress_11213_descriptor;
         }

         public C2S_ResetDress_11213 getDefaultInstanceForType() {
            return HeroDressMsg.C2S_ResetDress_11213.getDefaultInstance();
         }

         public C2S_ResetDress_11213 build() {
            C2S_ResetDress_11213 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ResetDress_11213 buildPartial() {
            C2S_ResetDress_11213 result = new C2S_ResetDress_11213(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.dressId_ = this.dressId_;
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
            if (other instanceof C2S_ResetDress_11213) {
               return this.mergeFrom((C2S_ResetDress_11213)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ResetDress_11213 other) {
            if (other == HeroDressMsg.C2S_ResetDress_11213.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDressId()) {
                  this.setDressId(other.getDressId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasDressId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ResetDress_11213 parsedMessage = null;

            try {
               parsedMessage = (C2S_ResetDress_11213)HeroDressMsg.C2S_ResetDress_11213.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ResetDress_11213)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDressId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDressId() {
            return this.dressId_;
         }

         public Builder setDressId(int value) {
            this.bitField0_ |= 1;
            this.dressId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDressId() {
            this.bitField0_ &= -2;
            this.dressId_ = 0;
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

   public static final class S2C_ResetDress_11214 extends GeneratedMessageV3 implements S2C_ResetDress_11214OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int DRESSID_FIELD_NUMBER = 2;
      private int dressId_;
      private byte memoizedIsInitialized;
      private static final S2C_ResetDress_11214 DEFAULT_INSTANCE = new S2C_ResetDress_11214();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ResetDress_11214> PARSER = new AbstractParser<S2C_ResetDress_11214>() {
         public S2C_ResetDress_11214 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ResetDress_11214(input, extensionRegistry);
         }
      };

      private S2C_ResetDress_11214(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ResetDress_11214() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ResetDress_11214();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ResetDress_11214(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.dressId_ = input.readInt32();
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
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_ResetDress_11214_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_ResetDress_11214_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ResetDress_11214.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasDressId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDressId() {
         return this.dressId_;
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
         } else if (!this.hasDressId()) {
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
            output.writeInt32(2, this.dressId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.dressId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ResetDress_11214)) {
            return super.equals(obj);
         } else {
            S2C_ResetDress_11214 other = (S2C_ResetDress_11214)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasDressId() != other.hasDressId()) {
               return false;
            } else if (this.hasDressId() && this.getDressId() != other.getDressId()) {
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

            if (this.hasDressId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDressId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ResetDress_11214 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ResetDress_11214)PARSER.parseFrom(data);
      }

      public static S2C_ResetDress_11214 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetDress_11214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetDress_11214 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ResetDress_11214)PARSER.parseFrom(data);
      }

      public static S2C_ResetDress_11214 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetDress_11214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetDress_11214 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ResetDress_11214)PARSER.parseFrom(data);
      }

      public static S2C_ResetDress_11214 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetDress_11214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetDress_11214 parseFrom(InputStream input) throws IOException {
         return (S2C_ResetDress_11214)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ResetDress_11214 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetDress_11214)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ResetDress_11214 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ResetDress_11214)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ResetDress_11214 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetDress_11214)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ResetDress_11214 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ResetDress_11214)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ResetDress_11214 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetDress_11214)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ResetDress_11214 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ResetDress_11214 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ResetDress_11214> parser() {
         return PARSER;
      }

      public Parser<S2C_ResetDress_11214> getParserForType() {
         return PARSER;
      }

      public S2C_ResetDress_11214 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ResetDress_11214OrBuilder {
         private int bitField0_;
         private int result_;
         private int dressId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_ResetDress_11214_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_ResetDress_11214_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ResetDress_11214.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroDressMsg.S2C_ResetDress_11214.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.dressId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_ResetDress_11214_descriptor;
         }

         public S2C_ResetDress_11214 getDefaultInstanceForType() {
            return HeroDressMsg.S2C_ResetDress_11214.getDefaultInstance();
         }

         public S2C_ResetDress_11214 build() {
            S2C_ResetDress_11214 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ResetDress_11214 buildPartial() {
            S2C_ResetDress_11214 result = new S2C_ResetDress_11214(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.dressId_ = this.dressId_;
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
            if (other instanceof S2C_ResetDress_11214) {
               return this.mergeFrom((S2C_ResetDress_11214)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ResetDress_11214 other) {
            if (other == HeroDressMsg.S2C_ResetDress_11214.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasDressId()) {
                  this.setDressId(other.getDressId());
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
               return this.hasDressId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ResetDress_11214 parsedMessage = null;

            try {
               parsedMessage = (S2C_ResetDress_11214)HeroDressMsg.S2C_ResetDress_11214.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ResetDress_11214)e.getUnfinishedMessage();
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

         public boolean hasDressId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDressId() {
            return this.dressId_;
         }

         public Builder setDressId(int value) {
            this.bitField0_ |= 2;
            this.dressId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDressId() {
            this.bitField0_ &= -3;
            this.dressId_ = 0;
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

   public static final class C2S_DeleteDress_11217 extends GeneratedMessageV3 implements C2S_DeleteDress_11217OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DRESSID_FIELD_NUMBER = 1;
      private int dressId_;
      private byte memoizedIsInitialized;
      private static final C2S_DeleteDress_11217 DEFAULT_INSTANCE = new C2S_DeleteDress_11217();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DeleteDress_11217> PARSER = new AbstractParser<C2S_DeleteDress_11217>() {
         public C2S_DeleteDress_11217 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DeleteDress_11217(input, extensionRegistry);
         }
      };

      private C2S_DeleteDress_11217(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DeleteDress_11217() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DeleteDress_11217();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DeleteDress_11217(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.dressId_ = input.readInt32();
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
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_DeleteDress_11217_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_DeleteDress_11217_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DeleteDress_11217.class, Builder.class);
      }

      public boolean hasDressId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDressId() {
         return this.dressId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDressId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.dressId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.dressId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_DeleteDress_11217)) {
            return super.equals(obj);
         } else {
            C2S_DeleteDress_11217 other = (C2S_DeleteDress_11217)obj;
            if (this.hasDressId() != other.hasDressId()) {
               return false;
            } else if (this.hasDressId() && this.getDressId() != other.getDressId()) {
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
            if (this.hasDressId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDressId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_DeleteDress_11217 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DeleteDress_11217)PARSER.parseFrom(data);
      }

      public static C2S_DeleteDress_11217 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DeleteDress_11217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DeleteDress_11217 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DeleteDress_11217)PARSER.parseFrom(data);
      }

      public static C2S_DeleteDress_11217 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DeleteDress_11217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DeleteDress_11217 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DeleteDress_11217)PARSER.parseFrom(data);
      }

      public static C2S_DeleteDress_11217 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DeleteDress_11217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DeleteDress_11217 parseFrom(InputStream input) throws IOException {
         return (C2S_DeleteDress_11217)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DeleteDress_11217 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DeleteDress_11217)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DeleteDress_11217 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DeleteDress_11217)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DeleteDress_11217 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DeleteDress_11217)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DeleteDress_11217 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DeleteDress_11217)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DeleteDress_11217 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DeleteDress_11217)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DeleteDress_11217 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DeleteDress_11217 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DeleteDress_11217> parser() {
         return PARSER;
      }

      public Parser<C2S_DeleteDress_11217> getParserForType() {
         return PARSER;
      }

      public C2S_DeleteDress_11217 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DeleteDress_11217OrBuilder {
         private int bitField0_;
         private int dressId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_DeleteDress_11217_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_DeleteDress_11217_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DeleteDress_11217.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroDressMsg.C2S_DeleteDress_11217.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.dressId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_C2S_DeleteDress_11217_descriptor;
         }

         public C2S_DeleteDress_11217 getDefaultInstanceForType() {
            return HeroDressMsg.C2S_DeleteDress_11217.getDefaultInstance();
         }

         public C2S_DeleteDress_11217 build() {
            C2S_DeleteDress_11217 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DeleteDress_11217 buildPartial() {
            C2S_DeleteDress_11217 result = new C2S_DeleteDress_11217(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.dressId_ = this.dressId_;
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
            if (other instanceof C2S_DeleteDress_11217) {
               return this.mergeFrom((C2S_DeleteDress_11217)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DeleteDress_11217 other) {
            if (other == HeroDressMsg.C2S_DeleteDress_11217.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDressId()) {
                  this.setDressId(other.getDressId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasDressId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_DeleteDress_11217 parsedMessage = null;

            try {
               parsedMessage = (C2S_DeleteDress_11217)HeroDressMsg.C2S_DeleteDress_11217.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DeleteDress_11217)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDressId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDressId() {
            return this.dressId_;
         }

         public Builder setDressId(int value) {
            this.bitField0_ |= 1;
            this.dressId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDressId() {
            this.bitField0_ &= -2;
            this.dressId_ = 0;
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

   public static final class S2C_DeleteDress_11218 extends GeneratedMessageV3 implements S2C_DeleteDress_11218OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DRESSID_FIELD_NUMBER = 1;
      private int dressId_;
      private byte memoizedIsInitialized;
      private static final S2C_DeleteDress_11218 DEFAULT_INSTANCE = new S2C_DeleteDress_11218();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DeleteDress_11218> PARSER = new AbstractParser<S2C_DeleteDress_11218>() {
         public S2C_DeleteDress_11218 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DeleteDress_11218(input, extensionRegistry);
         }
      };

      private S2C_DeleteDress_11218(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DeleteDress_11218() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DeleteDress_11218();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DeleteDress_11218(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.dressId_ = input.readInt32();
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
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_DeleteDress_11218_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_DeleteDress_11218_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DeleteDress_11218.class, Builder.class);
      }

      public boolean hasDressId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDressId() {
         return this.dressId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDressId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.dressId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.dressId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DeleteDress_11218)) {
            return super.equals(obj);
         } else {
            S2C_DeleteDress_11218 other = (S2C_DeleteDress_11218)obj;
            if (this.hasDressId() != other.hasDressId()) {
               return false;
            } else if (this.hasDressId() && this.getDressId() != other.getDressId()) {
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
            if (this.hasDressId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDressId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DeleteDress_11218 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DeleteDress_11218)PARSER.parseFrom(data);
      }

      public static S2C_DeleteDress_11218 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DeleteDress_11218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DeleteDress_11218 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DeleteDress_11218)PARSER.parseFrom(data);
      }

      public static S2C_DeleteDress_11218 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DeleteDress_11218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DeleteDress_11218 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DeleteDress_11218)PARSER.parseFrom(data);
      }

      public static S2C_DeleteDress_11218 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DeleteDress_11218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DeleteDress_11218 parseFrom(InputStream input) throws IOException {
         return (S2C_DeleteDress_11218)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DeleteDress_11218 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DeleteDress_11218)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DeleteDress_11218 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DeleteDress_11218)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DeleteDress_11218 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DeleteDress_11218)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DeleteDress_11218 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DeleteDress_11218)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DeleteDress_11218 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DeleteDress_11218)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DeleteDress_11218 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DeleteDress_11218 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DeleteDress_11218> parser() {
         return PARSER;
      }

      public Parser<S2C_DeleteDress_11218> getParserForType() {
         return PARSER;
      }

      public S2C_DeleteDress_11218 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DeleteDress_11218OrBuilder {
         private int bitField0_;
         private int dressId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_DeleteDress_11218_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_DeleteDress_11218_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DeleteDress_11218.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroDressMsg.S2C_DeleteDress_11218.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.dressId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroDressMsg.internal_static_heroDress_com_gzbz_protobuf_S2C_DeleteDress_11218_descriptor;
         }

         public S2C_DeleteDress_11218 getDefaultInstanceForType() {
            return HeroDressMsg.S2C_DeleteDress_11218.getDefaultInstance();
         }

         public S2C_DeleteDress_11218 build() {
            S2C_DeleteDress_11218 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DeleteDress_11218 buildPartial() {
            S2C_DeleteDress_11218 result = new S2C_DeleteDress_11218(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.dressId_ = this.dressId_;
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
            if (other instanceof S2C_DeleteDress_11218) {
               return this.mergeFrom((S2C_DeleteDress_11218)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DeleteDress_11218 other) {
            if (other == HeroDressMsg.S2C_DeleteDress_11218.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDressId()) {
                  this.setDressId(other.getDressId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasDressId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DeleteDress_11218 parsedMessage = null;

            try {
               parsedMessage = (S2C_DeleteDress_11218)HeroDressMsg.S2C_DeleteDress_11218.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DeleteDress_11218)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDressId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDressId() {
            return this.dressId_;
         }

         public Builder setDressId(int value) {
            this.bitField0_ |= 1;
            this.dressId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDressId() {
            this.bitField0_ &= -2;
            this.dressId_ = 0;
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

   public interface C2S_Decompose_11211OrBuilder extends MessageOrBuilder {
      boolean hasDressId();

      int getDressId();
   }

   public interface C2S_DelDress_11203OrBuilder extends MessageOrBuilder {
      List<Integer> getIdList();

      int getIdCount();

      int getId(int index);
   }

   public interface C2S_DeleteDress_11217OrBuilder extends MessageOrBuilder {
      boolean hasDressId();

      int getDressId();
   }

   public interface C2S_Main_11201OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ResetDress_11213OrBuilder extends MessageOrBuilder {
      boolean hasDressId();

      int getDressId();
   }

   public interface C2S_Undress_11207OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_Upgrade_11209OrBuilder extends MessageOrBuilder {
      boolean hasDressId();

      int getDressId();
   }

   public interface C2S_Wear_11205OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasDressId();

      int getDressId();
   }

   public interface HeroDressInfoOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasLv();

      int getLv();

      boolean hasEndTime();

      int getEndTime();

      boolean hasHreoId();

      int getHreoId();
   }

   public interface S2C_DecomposeResult_11212OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasDressId();

      int getDressId();
   }

   public interface S2C_DelDress_11204OrBuilder extends MessageOrBuilder {
      List<Integer> getIdList();

      int getIdCount();

      int getId(int index);
   }

   public interface S2C_DeleteDress_11218OrBuilder extends MessageOrBuilder {
      boolean hasDressId();

      int getDressId();
   }

   public interface S2C_MainResult_11202OrBuilder extends MessageOrBuilder {
      List<HeroDressInfo> getInfosList();

      HeroDressInfo getInfos(int index);

      int getInfosCount();

      List<? extends HeroDressInfoOrBuilder> getInfosOrBuilderList();

      HeroDressInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2C_ResetDress_11214OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasDressId();

      int getDressId();
   }

   public interface S2C_UndressResult_11208OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_UpgradeResult_11210OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasInfo();

      HeroDressInfo getInfo();

      HeroDressInfoOrBuilder getInfoOrBuilder();
   }

   public interface S2C_WearResult_11206OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }
}
