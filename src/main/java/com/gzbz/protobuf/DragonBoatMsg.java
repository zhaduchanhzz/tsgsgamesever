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

public final class DragonBoatMsg {
   private static final Descriptors.Descriptor internal_static_dragonBoat_com_gzbz_protobuf_C2S_MakeWine_14001_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonBoat_com_gzbz_protobuf_C2S_MakeWine_14001_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonBoat_com_gzbz_protobuf_S2C_MakeWine_14002_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonBoat_com_gzbz_protobuf_S2C_MakeWine_14002_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonBoat_com_gzbz_protobuf_C2S_TakePlumReward_14003_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonBoat_com_gzbz_protobuf_C2S_TakePlumReward_14003_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonBoat_com_gzbz_protobuf_S2C_TakePlumReward_14004_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonBoat_com_gzbz_protobuf_S2C_TakePlumReward_14004_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonBoat_com_gzbz_protobuf_C2S_Drink_14005_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonBoat_com_gzbz_protobuf_C2S_Drink_14005_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonBoat_com_gzbz_protobuf_S2C_Drink_14006_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonBoat_com_gzbz_protobuf_S2C_Drink_14006_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonBoat_com_gzbz_protobuf_C2S_FreeDrinkNum_14007_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonBoat_com_gzbz_protobuf_C2S_FreeDrinkNum_14007_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonBoat_com_gzbz_protobuf_S2C_FreeDrinkNum_14008_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonBoat_com_gzbz_protobuf_S2C_FreeDrinkNum_14008_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonBoat_com_gzbz_protobuf_C2S_CommitTask_14011_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonBoat_com_gzbz_protobuf_C2S_CommitTask_14011_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonBoat_com_gzbz_protobuf_S2C_CommitTask_14012_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonBoat_com_gzbz_protobuf_S2C_CommitTask_14012_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatTasks_14013_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatTasks_14013_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatTasks_14014_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatTasks_14014_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonBoat_com_gzbz_protobuf_S2C_UpdateTasks_14016_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonBoat_com_gzbz_protobuf_S2C_UpdateTasks_14016_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatPrayMain_14021_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatPrayMain_14021_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPrayMain_14022_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPrayMain_14022_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatPray_14023_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatPray_14023_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPray_14024_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPray_14024_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPrayTaskNotify_14026_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPrayTaskNotify_14026_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private DragonBoatMsg() {
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
      String[] descriptorData = new String[]{"\n\u0010DragonBoat.proto\u0012\u001cdragonBoat.com.gzbz.protobuf\u001a\u000eActivity.proto\u001a\fcommon.proto\"!\n\u0012C2S_MakeWine_14001\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\":\n\u0012S2C_MakeWine_14002\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0014\n\ftotalWineNum\u0018\u0002 \u0002(\u0005\"\u001a\n\u0018C2S_TakePlumReward_14003\"*\n\u0018S2C_TakePlumReward_14004\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"\u0011\n\u000fC2S_Drink_14005\"2\n\u000fS2C_Drink_14006\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007freeNum\u0018\u0002 \u0002(\u0005\"\u0018\n\u0016C2S_FreeDrinkNum_14007\"P\n\u0016S2C_FreeDrinkNum_14008\u0012\u000f\n\u0007freeNum\u0018\u0001 \u0002(\u0005\u0012\u0014\n\ftotalWineNum\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007isTaked\u0018\u0003 \u0002(\b\"&\n\u0014C2S_CommitTask_14011\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"&\n\u0014S2C_CommitTask_14012\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"\u001b\n\u0019C2S_DragonBoatTasks_14013\"7\n\u0019S2C_DragonBoatTasks_14014\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\"3\n\u0015S2C_UpdateTasks_14016\u0012\u001a\n\u0004task\u0018\u0001 \u0003(\u000b2\f.common.Task\"\u001e\n\u001cC2S_DragonBoatPrayMain_14021\"k\n\u001cS2C_DragonBoatPrayMain_14022\u0012\u000b\n\u0003day\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0003(\u0005\u00122\n\u0004task\u0018\u0003 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"&\n\u0018C2S_DragonBoatPray_14023\u0012\n\n\u0002id\u0018\u0001 \u0003(\u0005\"&\n\u0018S2C_DragonBoatPray_14024\u0012\n\n\u0002id\u0018\u0001 \u0003(\u0005\"X\n\"S2C_DragonBoatPrayTaskNotify_14026\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskDataB$\n\u0011com.gzbz.protobufB\rDragonBoatMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{ActivityMsg.getDescriptor(), CommonMsg.getDescriptor()});
      internal_static_dragonBoat_com_gzbz_protobuf_C2S_MakeWine_14001_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_dragonBoat_com_gzbz_protobuf_C2S_MakeWine_14001_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonBoat_com_gzbz_protobuf_C2S_MakeWine_14001_descriptor, new String[]{"Num"});
      internal_static_dragonBoat_com_gzbz_protobuf_S2C_MakeWine_14002_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_dragonBoat_com_gzbz_protobuf_S2C_MakeWine_14002_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonBoat_com_gzbz_protobuf_S2C_MakeWine_14002_descriptor, new String[]{"Result", "TotalWineNum"});
      internal_static_dragonBoat_com_gzbz_protobuf_C2S_TakePlumReward_14003_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_dragonBoat_com_gzbz_protobuf_C2S_TakePlumReward_14003_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonBoat_com_gzbz_protobuf_C2S_TakePlumReward_14003_descriptor, new String[0]);
      internal_static_dragonBoat_com_gzbz_protobuf_S2C_TakePlumReward_14004_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_dragonBoat_com_gzbz_protobuf_S2C_TakePlumReward_14004_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonBoat_com_gzbz_protobuf_S2C_TakePlumReward_14004_descriptor, new String[]{"Result"});
      internal_static_dragonBoat_com_gzbz_protobuf_C2S_Drink_14005_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_dragonBoat_com_gzbz_protobuf_C2S_Drink_14005_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonBoat_com_gzbz_protobuf_C2S_Drink_14005_descriptor, new String[0]);
      internal_static_dragonBoat_com_gzbz_protobuf_S2C_Drink_14006_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_dragonBoat_com_gzbz_protobuf_S2C_Drink_14006_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonBoat_com_gzbz_protobuf_S2C_Drink_14006_descriptor, new String[]{"Result", "FreeNum"});
      internal_static_dragonBoat_com_gzbz_protobuf_C2S_FreeDrinkNum_14007_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_dragonBoat_com_gzbz_protobuf_C2S_FreeDrinkNum_14007_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonBoat_com_gzbz_protobuf_C2S_FreeDrinkNum_14007_descriptor, new String[0]);
      internal_static_dragonBoat_com_gzbz_protobuf_S2C_FreeDrinkNum_14008_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_dragonBoat_com_gzbz_protobuf_S2C_FreeDrinkNum_14008_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonBoat_com_gzbz_protobuf_S2C_FreeDrinkNum_14008_descriptor, new String[]{"FreeNum", "TotalWineNum", "IsTaked"});
      internal_static_dragonBoat_com_gzbz_protobuf_C2S_CommitTask_14011_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_dragonBoat_com_gzbz_protobuf_C2S_CommitTask_14011_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonBoat_com_gzbz_protobuf_C2S_CommitTask_14011_descriptor, new String[]{"TaskId"});
      internal_static_dragonBoat_com_gzbz_protobuf_S2C_CommitTask_14012_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_dragonBoat_com_gzbz_protobuf_S2C_CommitTask_14012_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonBoat_com_gzbz_protobuf_S2C_CommitTask_14012_descriptor, new String[]{"TaskId"});
      internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatTasks_14013_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatTasks_14013_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatTasks_14013_descriptor, new String[0]);
      internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatTasks_14014_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatTasks_14014_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatTasks_14014_descriptor, new String[]{"Task"});
      internal_static_dragonBoat_com_gzbz_protobuf_S2C_UpdateTasks_14016_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_dragonBoat_com_gzbz_protobuf_S2C_UpdateTasks_14016_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonBoat_com_gzbz_protobuf_S2C_UpdateTasks_14016_descriptor, new String[]{"Task"});
      internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatPrayMain_14021_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatPrayMain_14021_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatPrayMain_14021_descriptor, new String[0]);
      internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPrayMain_14022_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPrayMain_14022_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPrayMain_14022_descriptor, new String[]{"Day", "Id", "Task"});
      internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatPray_14023_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatPray_14023_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatPray_14023_descriptor, new String[]{"Id"});
      internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPray_14024_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPray_14024_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPray_14024_descriptor, new String[]{"Id"});
      internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPrayTaskNotify_14026_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPrayTaskNotify_14026_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPrayTaskNotify_14026_descriptor, new String[]{"Task"});
      ActivityMsg.getDescriptor();
      CommonMsg.getDescriptor();
   }

   public static final class C2S_MakeWine_14001 extends GeneratedMessageV3 implements C2S_MakeWine_14001OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_MakeWine_14001 DEFAULT_INSTANCE = new C2S_MakeWine_14001();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MakeWine_14001> PARSER = new AbstractParser<C2S_MakeWine_14001>() {
         public C2S_MakeWine_14001 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MakeWine_14001(input, extensionRegistry);
         }
      };

      private C2S_MakeWine_14001(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MakeWine_14001() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MakeWine_14001();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MakeWine_14001(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_MakeWine_14001_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_MakeWine_14001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MakeWine_14001.class, Builder.class);
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
         } else if (!(obj instanceof C2S_MakeWine_14001)) {
            return super.equals(obj);
         } else {
            C2S_MakeWine_14001 other = (C2S_MakeWine_14001)obj;
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

      public static C2S_MakeWine_14001 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_14001)PARSER.parseFrom(data);
      }

      public static C2S_MakeWine_14001 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_14001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MakeWine_14001 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_14001)PARSER.parseFrom(data);
      }

      public static C2S_MakeWine_14001 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_14001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MakeWine_14001 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_14001)PARSER.parseFrom(data);
      }

      public static C2S_MakeWine_14001 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MakeWine_14001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MakeWine_14001 parseFrom(InputStream input) throws IOException {
         return (C2S_MakeWine_14001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MakeWine_14001 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MakeWine_14001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MakeWine_14001 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MakeWine_14001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MakeWine_14001 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MakeWine_14001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MakeWine_14001 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MakeWine_14001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MakeWine_14001 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MakeWine_14001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MakeWine_14001 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MakeWine_14001 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MakeWine_14001> parser() {
         return PARSER;
      }

      public Parser<C2S_MakeWine_14001> getParserForType() {
         return PARSER;
      }

      public C2S_MakeWine_14001 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MakeWine_14001OrBuilder {
         private int bitField0_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_MakeWine_14001_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_MakeWine_14001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MakeWine_14001.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonBoatMsg.C2S_MakeWine_14001.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_MakeWine_14001_descriptor;
         }

         public C2S_MakeWine_14001 getDefaultInstanceForType() {
            return DragonBoatMsg.C2S_MakeWine_14001.getDefaultInstance();
         }

         public C2S_MakeWine_14001 build() {
            C2S_MakeWine_14001 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MakeWine_14001 buildPartial() {
            C2S_MakeWine_14001 result = new C2S_MakeWine_14001(this);
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
            if (other instanceof C2S_MakeWine_14001) {
               return this.mergeFrom((C2S_MakeWine_14001)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MakeWine_14001 other) {
            if (other == DragonBoatMsg.C2S_MakeWine_14001.getDefaultInstance()) {
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
            C2S_MakeWine_14001 parsedMessage = null;

            try {
               parsedMessage = (C2S_MakeWine_14001)DragonBoatMsg.C2S_MakeWine_14001.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MakeWine_14001)e.getUnfinishedMessage();
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

   public static final class S2C_MakeWine_14002 extends GeneratedMessageV3 implements S2C_MakeWine_14002OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TOTALWINENUM_FIELD_NUMBER = 2;
      private int totalWineNum_;
      private byte memoizedIsInitialized;
      private static final S2C_MakeWine_14002 DEFAULT_INSTANCE = new S2C_MakeWine_14002();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MakeWine_14002> PARSER = new AbstractParser<S2C_MakeWine_14002>() {
         public S2C_MakeWine_14002 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MakeWine_14002(input, extensionRegistry);
         }
      };

      private S2C_MakeWine_14002(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MakeWine_14002() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MakeWine_14002();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MakeWine_14002(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.totalWineNum_ = input.readInt32();
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
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_MakeWine_14002_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_MakeWine_14002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MakeWine_14002.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasTotalWineNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTotalWineNum() {
         return this.totalWineNum_;
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
         } else if (!this.hasTotalWineNum()) {
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
            output.writeInt32(2, this.totalWineNum_);
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
               size += CodedOutputStream.computeInt32Size(2, this.totalWineNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MakeWine_14002)) {
            return super.equals(obj);
         } else {
            S2C_MakeWine_14002 other = (S2C_MakeWine_14002)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasTotalWineNum() != other.hasTotalWineNum()) {
               return false;
            } else if (this.hasTotalWineNum() && this.getTotalWineNum() != other.getTotalWineNum()) {
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

            if (this.hasTotalWineNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTotalWineNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MakeWine_14002 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_14002)PARSER.parseFrom(data);
      }

      public static S2C_MakeWine_14002 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_14002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MakeWine_14002 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_14002)PARSER.parseFrom(data);
      }

      public static S2C_MakeWine_14002 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_14002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MakeWine_14002 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_14002)PARSER.parseFrom(data);
      }

      public static S2C_MakeWine_14002 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MakeWine_14002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MakeWine_14002 parseFrom(InputStream input) throws IOException {
         return (S2C_MakeWine_14002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MakeWine_14002 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MakeWine_14002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MakeWine_14002 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MakeWine_14002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MakeWine_14002 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MakeWine_14002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MakeWine_14002 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MakeWine_14002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MakeWine_14002 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MakeWine_14002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MakeWine_14002 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MakeWine_14002 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MakeWine_14002> parser() {
         return PARSER;
      }

      public Parser<S2C_MakeWine_14002> getParserForType() {
         return PARSER;
      }

      public S2C_MakeWine_14002 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MakeWine_14002OrBuilder {
         private int bitField0_;
         private int result_;
         private int totalWineNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_MakeWine_14002_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_MakeWine_14002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MakeWine_14002.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonBoatMsg.S2C_MakeWine_14002.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.totalWineNum_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_MakeWine_14002_descriptor;
         }

         public S2C_MakeWine_14002 getDefaultInstanceForType() {
            return DragonBoatMsg.S2C_MakeWine_14002.getDefaultInstance();
         }

         public S2C_MakeWine_14002 build() {
            S2C_MakeWine_14002 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MakeWine_14002 buildPartial() {
            S2C_MakeWine_14002 result = new S2C_MakeWine_14002(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.totalWineNum_ = this.totalWineNum_;
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
            if (other instanceof S2C_MakeWine_14002) {
               return this.mergeFrom((S2C_MakeWine_14002)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MakeWine_14002 other) {
            if (other == DragonBoatMsg.S2C_MakeWine_14002.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasTotalWineNum()) {
                  this.setTotalWineNum(other.getTotalWineNum());
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
               return this.hasTotalWineNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MakeWine_14002 parsedMessage = null;

            try {
               parsedMessage = (S2C_MakeWine_14002)DragonBoatMsg.S2C_MakeWine_14002.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MakeWine_14002)e.getUnfinishedMessage();
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

         public boolean hasTotalWineNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTotalWineNum() {
            return this.totalWineNum_;
         }

         public Builder setTotalWineNum(int value) {
            this.bitField0_ |= 2;
            this.totalWineNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalWineNum() {
            this.bitField0_ &= -3;
            this.totalWineNum_ = 0;
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

   public static final class C2S_TakePlumReward_14003 extends GeneratedMessageV3 implements C2S_TakePlumReward_14003OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TakePlumReward_14003 DEFAULT_INSTANCE = new C2S_TakePlumReward_14003();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TakePlumReward_14003> PARSER = new AbstractParser<C2S_TakePlumReward_14003>() {
         public C2S_TakePlumReward_14003 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TakePlumReward_14003(input, extensionRegistry);
         }
      };

      private C2S_TakePlumReward_14003(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TakePlumReward_14003() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TakePlumReward_14003();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TakePlumReward_14003(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_TakePlumReward_14003_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_TakePlumReward_14003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakePlumReward_14003.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TakePlumReward_14003)) {
            return super.equals(obj);
         } else {
            C2S_TakePlumReward_14003 other = (C2S_TakePlumReward_14003)obj;
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

      public static C2S_TakePlumReward_14003 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_14003)PARSER.parseFrom(data);
      }

      public static C2S_TakePlumReward_14003 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_14003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakePlumReward_14003 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_14003)PARSER.parseFrom(data);
      }

      public static C2S_TakePlumReward_14003 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_14003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakePlumReward_14003 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_14003)PARSER.parseFrom(data);
      }

      public static C2S_TakePlumReward_14003 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakePlumReward_14003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakePlumReward_14003 parseFrom(InputStream input) throws IOException {
         return (C2S_TakePlumReward_14003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakePlumReward_14003 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakePlumReward_14003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakePlumReward_14003 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TakePlumReward_14003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TakePlumReward_14003 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakePlumReward_14003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakePlumReward_14003 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TakePlumReward_14003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakePlumReward_14003 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakePlumReward_14003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TakePlumReward_14003 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TakePlumReward_14003 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TakePlumReward_14003> parser() {
         return PARSER;
      }

      public Parser<C2S_TakePlumReward_14003> getParserForType() {
         return PARSER;
      }

      public C2S_TakePlumReward_14003 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TakePlumReward_14003OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_TakePlumReward_14003_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_TakePlumReward_14003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakePlumReward_14003.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonBoatMsg.C2S_TakePlumReward_14003.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_TakePlumReward_14003_descriptor;
         }

         public C2S_TakePlumReward_14003 getDefaultInstanceForType() {
            return DragonBoatMsg.C2S_TakePlumReward_14003.getDefaultInstance();
         }

         public C2S_TakePlumReward_14003 build() {
            C2S_TakePlumReward_14003 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TakePlumReward_14003 buildPartial() {
            C2S_TakePlumReward_14003 result = new C2S_TakePlumReward_14003(this);
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
            if (other instanceof C2S_TakePlumReward_14003) {
               return this.mergeFrom((C2S_TakePlumReward_14003)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TakePlumReward_14003 other) {
            if (other == DragonBoatMsg.C2S_TakePlumReward_14003.getDefaultInstance()) {
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
            C2S_TakePlumReward_14003 parsedMessage = null;

            try {
               parsedMessage = (C2S_TakePlumReward_14003)DragonBoatMsg.C2S_TakePlumReward_14003.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TakePlumReward_14003)e.getUnfinishedMessage();
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

   public static final class S2C_TakePlumReward_14004 extends GeneratedMessageV3 implements S2C_TakePlumReward_14004OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_TakePlumReward_14004 DEFAULT_INSTANCE = new S2C_TakePlumReward_14004();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TakePlumReward_14004> PARSER = new AbstractParser<S2C_TakePlumReward_14004>() {
         public S2C_TakePlumReward_14004 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TakePlumReward_14004(input, extensionRegistry);
         }
      };

      private S2C_TakePlumReward_14004(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TakePlumReward_14004() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TakePlumReward_14004();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TakePlumReward_14004(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_TakePlumReward_14004_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_TakePlumReward_14004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakePlumReward_14004.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TakePlumReward_14004)) {
            return super.equals(obj);
         } else {
            S2C_TakePlumReward_14004 other = (S2C_TakePlumReward_14004)obj;
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

      public static S2C_TakePlumReward_14004 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_14004)PARSER.parseFrom(data);
      }

      public static S2C_TakePlumReward_14004 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_14004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakePlumReward_14004 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_14004)PARSER.parseFrom(data);
      }

      public static S2C_TakePlumReward_14004 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_14004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakePlumReward_14004 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_14004)PARSER.parseFrom(data);
      }

      public static S2C_TakePlumReward_14004 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakePlumReward_14004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakePlumReward_14004 parseFrom(InputStream input) throws IOException {
         return (S2C_TakePlumReward_14004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakePlumReward_14004 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakePlumReward_14004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakePlumReward_14004 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TakePlumReward_14004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TakePlumReward_14004 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakePlumReward_14004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakePlumReward_14004 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TakePlumReward_14004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakePlumReward_14004 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakePlumReward_14004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TakePlumReward_14004 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TakePlumReward_14004 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TakePlumReward_14004> parser() {
         return PARSER;
      }

      public Parser<S2C_TakePlumReward_14004> getParserForType() {
         return PARSER;
      }

      public S2C_TakePlumReward_14004 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TakePlumReward_14004OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_TakePlumReward_14004_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_TakePlumReward_14004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakePlumReward_14004.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonBoatMsg.S2C_TakePlumReward_14004.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_TakePlumReward_14004_descriptor;
         }

         public S2C_TakePlumReward_14004 getDefaultInstanceForType() {
            return DragonBoatMsg.S2C_TakePlumReward_14004.getDefaultInstance();
         }

         public S2C_TakePlumReward_14004 build() {
            S2C_TakePlumReward_14004 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TakePlumReward_14004 buildPartial() {
            S2C_TakePlumReward_14004 result = new S2C_TakePlumReward_14004(this);
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
            if (other instanceof S2C_TakePlumReward_14004) {
               return this.mergeFrom((S2C_TakePlumReward_14004)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TakePlumReward_14004 other) {
            if (other == DragonBoatMsg.S2C_TakePlumReward_14004.getDefaultInstance()) {
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
            S2C_TakePlumReward_14004 parsedMessage = null;

            try {
               parsedMessage = (S2C_TakePlumReward_14004)DragonBoatMsg.S2C_TakePlumReward_14004.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TakePlumReward_14004)e.getUnfinishedMessage();
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

   public static final class C2S_Drink_14005 extends GeneratedMessageV3 implements C2S_Drink_14005OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Drink_14005 DEFAULT_INSTANCE = new C2S_Drink_14005();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Drink_14005> PARSER = new AbstractParser<C2S_Drink_14005>() {
         public C2S_Drink_14005 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Drink_14005(input, extensionRegistry);
         }
      };

      private C2S_Drink_14005(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Drink_14005() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Drink_14005();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Drink_14005(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_Drink_14005_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_Drink_14005_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Drink_14005.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Drink_14005)) {
            return super.equals(obj);
         } else {
            C2S_Drink_14005 other = (C2S_Drink_14005)obj;
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

      public static C2S_Drink_14005 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Drink_14005)PARSER.parseFrom(data);
      }

      public static C2S_Drink_14005 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Drink_14005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Drink_14005 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Drink_14005)PARSER.parseFrom(data);
      }

      public static C2S_Drink_14005 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Drink_14005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Drink_14005 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Drink_14005)PARSER.parseFrom(data);
      }

      public static C2S_Drink_14005 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Drink_14005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Drink_14005 parseFrom(InputStream input) throws IOException {
         return (C2S_Drink_14005)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Drink_14005 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Drink_14005)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Drink_14005 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Drink_14005)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Drink_14005 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Drink_14005)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Drink_14005 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Drink_14005)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Drink_14005 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Drink_14005)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Drink_14005 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Drink_14005 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Drink_14005> parser() {
         return PARSER;
      }

      public Parser<C2S_Drink_14005> getParserForType() {
         return PARSER;
      }

      public C2S_Drink_14005 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Drink_14005OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_Drink_14005_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_Drink_14005_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Drink_14005.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonBoatMsg.C2S_Drink_14005.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_Drink_14005_descriptor;
         }

         public C2S_Drink_14005 getDefaultInstanceForType() {
            return DragonBoatMsg.C2S_Drink_14005.getDefaultInstance();
         }

         public C2S_Drink_14005 build() {
            C2S_Drink_14005 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Drink_14005 buildPartial() {
            C2S_Drink_14005 result = new C2S_Drink_14005(this);
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
            if (other instanceof C2S_Drink_14005) {
               return this.mergeFrom((C2S_Drink_14005)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Drink_14005 other) {
            if (other == DragonBoatMsg.C2S_Drink_14005.getDefaultInstance()) {
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
            C2S_Drink_14005 parsedMessage = null;

            try {
               parsedMessage = (C2S_Drink_14005)DragonBoatMsg.C2S_Drink_14005.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Drink_14005)e.getUnfinishedMessage();
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

   public static final class S2C_Drink_14006 extends GeneratedMessageV3 implements S2C_Drink_14006OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int FREENUM_FIELD_NUMBER = 2;
      private int freeNum_;
      private byte memoizedIsInitialized;
      private static final S2C_Drink_14006 DEFAULT_INSTANCE = new S2C_Drink_14006();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Drink_14006> PARSER = new AbstractParser<S2C_Drink_14006>() {
         public S2C_Drink_14006 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Drink_14006(input, extensionRegistry);
         }
      };

      private S2C_Drink_14006(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Drink_14006() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Drink_14006();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Drink_14006(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.freeNum_ = input.readInt32();
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
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_Drink_14006_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_Drink_14006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Drink_14006.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasFreeNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getFreeNum() {
         return this.freeNum_;
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
         } else if (!this.hasFreeNum()) {
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
            output.writeInt32(2, this.freeNum_);
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
               size += CodedOutputStream.computeInt32Size(2, this.freeNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Drink_14006)) {
            return super.equals(obj);
         } else {
            S2C_Drink_14006 other = (S2C_Drink_14006)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasFreeNum() != other.hasFreeNum()) {
               return false;
            } else if (this.hasFreeNum() && this.getFreeNum() != other.getFreeNum()) {
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

            if (this.hasFreeNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getFreeNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Drink_14006 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Drink_14006)PARSER.parseFrom(data);
      }

      public static S2C_Drink_14006 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Drink_14006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Drink_14006 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Drink_14006)PARSER.parseFrom(data);
      }

      public static S2C_Drink_14006 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Drink_14006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Drink_14006 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Drink_14006)PARSER.parseFrom(data);
      }

      public static S2C_Drink_14006 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Drink_14006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Drink_14006 parseFrom(InputStream input) throws IOException {
         return (S2C_Drink_14006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Drink_14006 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Drink_14006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Drink_14006 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Drink_14006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Drink_14006 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Drink_14006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Drink_14006 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Drink_14006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Drink_14006 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Drink_14006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Drink_14006 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Drink_14006 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Drink_14006> parser() {
         return PARSER;
      }

      public Parser<S2C_Drink_14006> getParserForType() {
         return PARSER;
      }

      public S2C_Drink_14006 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Drink_14006OrBuilder {
         private int bitField0_;
         private int result_;
         private int freeNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_Drink_14006_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_Drink_14006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Drink_14006.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonBoatMsg.S2C_Drink_14006.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.freeNum_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_Drink_14006_descriptor;
         }

         public S2C_Drink_14006 getDefaultInstanceForType() {
            return DragonBoatMsg.S2C_Drink_14006.getDefaultInstance();
         }

         public S2C_Drink_14006 build() {
            S2C_Drink_14006 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Drink_14006 buildPartial() {
            S2C_Drink_14006 result = new S2C_Drink_14006(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.freeNum_ = this.freeNum_;
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
            if (other instanceof S2C_Drink_14006) {
               return this.mergeFrom((S2C_Drink_14006)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Drink_14006 other) {
            if (other == DragonBoatMsg.S2C_Drink_14006.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasFreeNum()) {
                  this.setFreeNum(other.getFreeNum());
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
               return this.hasFreeNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Drink_14006 parsedMessage = null;

            try {
               parsedMessage = (S2C_Drink_14006)DragonBoatMsg.S2C_Drink_14006.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Drink_14006)e.getUnfinishedMessage();
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

         public boolean hasFreeNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getFreeNum() {
            return this.freeNum_;
         }

         public Builder setFreeNum(int value) {
            this.bitField0_ |= 2;
            this.freeNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFreeNum() {
            this.bitField0_ &= -3;
            this.freeNum_ = 0;
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

   public static final class C2S_FreeDrinkNum_14007 extends GeneratedMessageV3 implements C2S_FreeDrinkNum_14007OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_FreeDrinkNum_14007 DEFAULT_INSTANCE = new C2S_FreeDrinkNum_14007();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FreeDrinkNum_14007> PARSER = new AbstractParser<C2S_FreeDrinkNum_14007>() {
         public C2S_FreeDrinkNum_14007 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FreeDrinkNum_14007(input, extensionRegistry);
         }
      };

      private C2S_FreeDrinkNum_14007(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FreeDrinkNum_14007() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FreeDrinkNum_14007();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FreeDrinkNum_14007(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_FreeDrinkNum_14007_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_FreeDrinkNum_14007_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FreeDrinkNum_14007.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FreeDrinkNum_14007)) {
            return super.equals(obj);
         } else {
            C2S_FreeDrinkNum_14007 other = (C2S_FreeDrinkNum_14007)obj;
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

      public static C2S_FreeDrinkNum_14007 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_14007)PARSER.parseFrom(data);
      }

      public static C2S_FreeDrinkNum_14007 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_14007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FreeDrinkNum_14007 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_14007)PARSER.parseFrom(data);
      }

      public static C2S_FreeDrinkNum_14007 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_14007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FreeDrinkNum_14007 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_14007)PARSER.parseFrom(data);
      }

      public static C2S_FreeDrinkNum_14007 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FreeDrinkNum_14007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FreeDrinkNum_14007 parseFrom(InputStream input) throws IOException {
         return (C2S_FreeDrinkNum_14007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FreeDrinkNum_14007 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FreeDrinkNum_14007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FreeDrinkNum_14007 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FreeDrinkNum_14007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FreeDrinkNum_14007 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FreeDrinkNum_14007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FreeDrinkNum_14007 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FreeDrinkNum_14007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FreeDrinkNum_14007 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FreeDrinkNum_14007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FreeDrinkNum_14007 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FreeDrinkNum_14007 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FreeDrinkNum_14007> parser() {
         return PARSER;
      }

      public Parser<C2S_FreeDrinkNum_14007> getParserForType() {
         return PARSER;
      }

      public C2S_FreeDrinkNum_14007 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FreeDrinkNum_14007OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_FreeDrinkNum_14007_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_FreeDrinkNum_14007_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FreeDrinkNum_14007.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonBoatMsg.C2S_FreeDrinkNum_14007.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_FreeDrinkNum_14007_descriptor;
         }

         public C2S_FreeDrinkNum_14007 getDefaultInstanceForType() {
            return DragonBoatMsg.C2S_FreeDrinkNum_14007.getDefaultInstance();
         }

         public C2S_FreeDrinkNum_14007 build() {
            C2S_FreeDrinkNum_14007 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FreeDrinkNum_14007 buildPartial() {
            C2S_FreeDrinkNum_14007 result = new C2S_FreeDrinkNum_14007(this);
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
            if (other instanceof C2S_FreeDrinkNum_14007) {
               return this.mergeFrom((C2S_FreeDrinkNum_14007)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FreeDrinkNum_14007 other) {
            if (other == DragonBoatMsg.C2S_FreeDrinkNum_14007.getDefaultInstance()) {
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
            C2S_FreeDrinkNum_14007 parsedMessage = null;

            try {
               parsedMessage = (C2S_FreeDrinkNum_14007)DragonBoatMsg.C2S_FreeDrinkNum_14007.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FreeDrinkNum_14007)e.getUnfinishedMessage();
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

   public static final class S2C_FreeDrinkNum_14008 extends GeneratedMessageV3 implements S2C_FreeDrinkNum_14008OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FREENUM_FIELD_NUMBER = 1;
      private int freeNum_;
      public static final int TOTALWINENUM_FIELD_NUMBER = 2;
      private int totalWineNum_;
      public static final int ISTAKED_FIELD_NUMBER = 3;
      private boolean isTaked_;
      private byte memoizedIsInitialized;
      private static final S2C_FreeDrinkNum_14008 DEFAULT_INSTANCE = new S2C_FreeDrinkNum_14008();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FreeDrinkNum_14008> PARSER = new AbstractParser<S2C_FreeDrinkNum_14008>() {
         public S2C_FreeDrinkNum_14008 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FreeDrinkNum_14008(input, extensionRegistry);
         }
      };

      private S2C_FreeDrinkNum_14008(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FreeDrinkNum_14008() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FreeDrinkNum_14008();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FreeDrinkNum_14008(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.freeNum_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.totalWineNum_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.isTaked_ = input.readBool();
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
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_FreeDrinkNum_14008_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_FreeDrinkNum_14008_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FreeDrinkNum_14008.class, Builder.class);
      }

      public boolean hasFreeNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFreeNum() {
         return this.freeNum_;
      }

      public boolean hasTotalWineNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTotalWineNum() {
         return this.totalWineNum_;
      }

      public boolean hasIsTaked() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsTaked() {
         return this.isTaked_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFreeNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalWineNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsTaked()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.freeNum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.totalWineNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.isTaked_);
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
               size += CodedOutputStream.computeInt32Size(1, this.freeNum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.totalWineNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.isTaked_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FreeDrinkNum_14008)) {
            return super.equals(obj);
         } else {
            S2C_FreeDrinkNum_14008 other = (S2C_FreeDrinkNum_14008)obj;
            if (this.hasFreeNum() != other.hasFreeNum()) {
               return false;
            } else if (this.hasFreeNum() && this.getFreeNum() != other.getFreeNum()) {
               return false;
            } else if (this.hasTotalWineNum() != other.hasTotalWineNum()) {
               return false;
            } else if (this.hasTotalWineNum() && this.getTotalWineNum() != other.getTotalWineNum()) {
               return false;
            } else if (this.hasIsTaked() != other.hasIsTaked()) {
               return false;
            } else if (this.hasIsTaked() && this.getIsTaked() != other.getIsTaked()) {
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
            if (this.hasFreeNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFreeNum();
            }

            if (this.hasTotalWineNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTotalWineNum();
            }

            if (this.hasIsTaked()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getIsTaked());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FreeDrinkNum_14008 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_14008)PARSER.parseFrom(data);
      }

      public static S2C_FreeDrinkNum_14008 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_14008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FreeDrinkNum_14008 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_14008)PARSER.parseFrom(data);
      }

      public static S2C_FreeDrinkNum_14008 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_14008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FreeDrinkNum_14008 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_14008)PARSER.parseFrom(data);
      }

      public static S2C_FreeDrinkNum_14008 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FreeDrinkNum_14008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FreeDrinkNum_14008 parseFrom(InputStream input) throws IOException {
         return (S2C_FreeDrinkNum_14008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FreeDrinkNum_14008 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FreeDrinkNum_14008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FreeDrinkNum_14008 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FreeDrinkNum_14008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FreeDrinkNum_14008 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FreeDrinkNum_14008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FreeDrinkNum_14008 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FreeDrinkNum_14008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FreeDrinkNum_14008 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FreeDrinkNum_14008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FreeDrinkNum_14008 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FreeDrinkNum_14008 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FreeDrinkNum_14008> parser() {
         return PARSER;
      }

      public Parser<S2C_FreeDrinkNum_14008> getParserForType() {
         return PARSER;
      }

      public S2C_FreeDrinkNum_14008 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FreeDrinkNum_14008OrBuilder {
         private int bitField0_;
         private int freeNum_;
         private int totalWineNum_;
         private boolean isTaked_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_FreeDrinkNum_14008_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_FreeDrinkNum_14008_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FreeDrinkNum_14008.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonBoatMsg.S2C_FreeDrinkNum_14008.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.freeNum_ = 0;
            this.bitField0_ &= -2;
            this.totalWineNum_ = 0;
            this.bitField0_ &= -3;
            this.isTaked_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_FreeDrinkNum_14008_descriptor;
         }

         public S2C_FreeDrinkNum_14008 getDefaultInstanceForType() {
            return DragonBoatMsg.S2C_FreeDrinkNum_14008.getDefaultInstance();
         }

         public S2C_FreeDrinkNum_14008 build() {
            S2C_FreeDrinkNum_14008 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FreeDrinkNum_14008 buildPartial() {
            S2C_FreeDrinkNum_14008 result = new S2C_FreeDrinkNum_14008(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.freeNum_ = this.freeNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.totalWineNum_ = this.totalWineNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.isTaked_ = this.isTaked_;
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
            if (other instanceof S2C_FreeDrinkNum_14008) {
               return this.mergeFrom((S2C_FreeDrinkNum_14008)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FreeDrinkNum_14008 other) {
            if (other == DragonBoatMsg.S2C_FreeDrinkNum_14008.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFreeNum()) {
                  this.setFreeNum(other.getFreeNum());
               }

               if (other.hasTotalWineNum()) {
                  this.setTotalWineNum(other.getTotalWineNum());
               }

               if (other.hasIsTaked()) {
                  this.setIsTaked(other.getIsTaked());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFreeNum()) {
               return false;
            } else if (!this.hasTotalWineNum()) {
               return false;
            } else {
               return this.hasIsTaked();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FreeDrinkNum_14008 parsedMessage = null;

            try {
               parsedMessage = (S2C_FreeDrinkNum_14008)DragonBoatMsg.S2C_FreeDrinkNum_14008.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FreeDrinkNum_14008)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFreeNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFreeNum() {
            return this.freeNum_;
         }

         public Builder setFreeNum(int value) {
            this.bitField0_ |= 1;
            this.freeNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFreeNum() {
            this.bitField0_ &= -2;
            this.freeNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTotalWineNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTotalWineNum() {
            return this.totalWineNum_;
         }

         public Builder setTotalWineNum(int value) {
            this.bitField0_ |= 2;
            this.totalWineNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalWineNum() {
            this.bitField0_ &= -3;
            this.totalWineNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsTaked() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getIsTaked() {
            return this.isTaked_;
         }

         public Builder setIsTaked(boolean value) {
            this.bitField0_ |= 4;
            this.isTaked_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsTaked() {
            this.bitField0_ &= -5;
            this.isTaked_ = false;
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

   public static final class C2S_CommitTask_14011 extends GeneratedMessageV3 implements C2S_CommitTask_14011OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_CommitTask_14011 DEFAULT_INSTANCE = new C2S_CommitTask_14011();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CommitTask_14011> PARSER = new AbstractParser<C2S_CommitTask_14011>() {
         public C2S_CommitTask_14011 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CommitTask_14011(input, extensionRegistry);
         }
      };

      private C2S_CommitTask_14011(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CommitTask_14011() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CommitTask_14011();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CommitTask_14011(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.taskId_ = input.readInt32();
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
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_CommitTask_14011_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_CommitTask_14011_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_14011.class, Builder.class);
      }

      public boolean hasTaskId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTaskId() {
         return this.taskId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTaskId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.taskId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.taskId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_CommitTask_14011)) {
            return super.equals(obj);
         } else {
            C2S_CommitTask_14011 other = (C2S_CommitTask_14011)obj;
            if (this.hasTaskId() != other.hasTaskId()) {
               return false;
            } else if (this.hasTaskId() && this.getTaskId() != other.getTaskId()) {
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
            if (this.hasTaskId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_CommitTask_14011 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_14011)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_14011 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_14011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_14011 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_14011)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_14011 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_14011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_14011 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_14011)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_14011 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_14011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_14011 parseFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_14011)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_14011 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_14011)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_14011 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_14011)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_14011 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_14011)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_14011 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CommitTask_14011)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_14011 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_14011)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CommitTask_14011 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CommitTask_14011 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CommitTask_14011> parser() {
         return PARSER;
      }

      public Parser<C2S_CommitTask_14011> getParserForType() {
         return PARSER;
      }

      public C2S_CommitTask_14011 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CommitTask_14011OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_CommitTask_14011_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_CommitTask_14011_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_14011.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonBoatMsg.C2S_CommitTask_14011.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_CommitTask_14011_descriptor;
         }

         public C2S_CommitTask_14011 getDefaultInstanceForType() {
            return DragonBoatMsg.C2S_CommitTask_14011.getDefaultInstance();
         }

         public C2S_CommitTask_14011 build() {
            C2S_CommitTask_14011 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CommitTask_14011 buildPartial() {
            C2S_CommitTask_14011 result = new C2S_CommitTask_14011(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.taskId_ = this.taskId_;
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
            if (other instanceof C2S_CommitTask_14011) {
               return this.mergeFrom((C2S_CommitTask_14011)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CommitTask_14011 other) {
            if (other == DragonBoatMsg.C2S_CommitTask_14011.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTaskId()) {
                  this.setTaskId(other.getTaskId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTaskId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_CommitTask_14011 parsedMessage = null;

            try {
               parsedMessage = (C2S_CommitTask_14011)DragonBoatMsg.C2S_CommitTask_14011.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CommitTask_14011)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTaskId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTaskId() {
            return this.taskId_;
         }

         public Builder setTaskId(int value) {
            this.bitField0_ |= 1;
            this.taskId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskId() {
            this.bitField0_ &= -2;
            this.taskId_ = 0;
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

   public static final class S2C_CommitTask_14012 extends GeneratedMessageV3 implements S2C_CommitTask_14012OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_CommitTask_14012 DEFAULT_INSTANCE = new S2C_CommitTask_14012();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CommitTask_14012> PARSER = new AbstractParser<S2C_CommitTask_14012>() {
         public S2C_CommitTask_14012 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CommitTask_14012(input, extensionRegistry);
         }
      };

      private S2C_CommitTask_14012(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CommitTask_14012() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CommitTask_14012();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CommitTask_14012(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.taskId_ = input.readInt32();
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
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_CommitTask_14012_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_CommitTask_14012_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTask_14012.class, Builder.class);
      }

      public boolean hasTaskId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTaskId() {
         return this.taskId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTaskId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.taskId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.taskId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CommitTask_14012)) {
            return super.equals(obj);
         } else {
            S2C_CommitTask_14012 other = (S2C_CommitTask_14012)obj;
            if (this.hasTaskId() != other.hasTaskId()) {
               return false;
            } else if (this.hasTaskId() && this.getTaskId() != other.getTaskId()) {
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
            if (this.hasTaskId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CommitTask_14012 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_14012)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_14012 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_14012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_14012 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_14012)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_14012 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_14012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_14012 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_14012)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_14012 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_14012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_14012 parseFrom(InputStream input) throws IOException {
         return (S2C_CommitTask_14012)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_14012 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_14012)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTask_14012 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CommitTask_14012)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_14012 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_14012)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTask_14012 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CommitTask_14012)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_14012 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_14012)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CommitTask_14012 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CommitTask_14012 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CommitTask_14012> parser() {
         return PARSER;
      }

      public Parser<S2C_CommitTask_14012> getParserForType() {
         return PARSER;
      }

      public S2C_CommitTask_14012 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CommitTask_14012OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_CommitTask_14012_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_CommitTask_14012_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTask_14012.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonBoatMsg.S2C_CommitTask_14012.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_CommitTask_14012_descriptor;
         }

         public S2C_CommitTask_14012 getDefaultInstanceForType() {
            return DragonBoatMsg.S2C_CommitTask_14012.getDefaultInstance();
         }

         public S2C_CommitTask_14012 build() {
            S2C_CommitTask_14012 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CommitTask_14012 buildPartial() {
            S2C_CommitTask_14012 result = new S2C_CommitTask_14012(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.taskId_ = this.taskId_;
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
            if (other instanceof S2C_CommitTask_14012) {
               return this.mergeFrom((S2C_CommitTask_14012)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CommitTask_14012 other) {
            if (other == DragonBoatMsg.S2C_CommitTask_14012.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTaskId()) {
                  this.setTaskId(other.getTaskId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTaskId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CommitTask_14012 parsedMessage = null;

            try {
               parsedMessage = (S2C_CommitTask_14012)DragonBoatMsg.S2C_CommitTask_14012.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CommitTask_14012)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTaskId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTaskId() {
            return this.taskId_;
         }

         public Builder setTaskId(int value) {
            this.bitField0_ |= 1;
            this.taskId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskId() {
            this.bitField0_ &= -2;
            this.taskId_ = 0;
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

   public static final class C2S_DragonBoatTasks_14013 extends GeneratedMessageV3 implements C2S_DragonBoatTasks_14013OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DragonBoatTasks_14013 DEFAULT_INSTANCE = new C2S_DragonBoatTasks_14013();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DragonBoatTasks_14013> PARSER = new AbstractParser<C2S_DragonBoatTasks_14013>() {
         public C2S_DragonBoatTasks_14013 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DragonBoatTasks_14013(input, extensionRegistry);
         }
      };

      private C2S_DragonBoatTasks_14013(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DragonBoatTasks_14013() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DragonBoatTasks_14013();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DragonBoatTasks_14013(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatTasks_14013_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatTasks_14013_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DragonBoatTasks_14013.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DragonBoatTasks_14013)) {
            return super.equals(obj);
         } else {
            C2S_DragonBoatTasks_14013 other = (C2S_DragonBoatTasks_14013)obj;
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

      public static C2S_DragonBoatTasks_14013 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DragonBoatTasks_14013)PARSER.parseFrom(data);
      }

      public static C2S_DragonBoatTasks_14013 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DragonBoatTasks_14013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DragonBoatTasks_14013 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DragonBoatTasks_14013)PARSER.parseFrom(data);
      }

      public static C2S_DragonBoatTasks_14013 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DragonBoatTasks_14013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DragonBoatTasks_14013 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DragonBoatTasks_14013)PARSER.parseFrom(data);
      }

      public static C2S_DragonBoatTasks_14013 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DragonBoatTasks_14013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DragonBoatTasks_14013 parseFrom(InputStream input) throws IOException {
         return (C2S_DragonBoatTasks_14013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DragonBoatTasks_14013 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DragonBoatTasks_14013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DragonBoatTasks_14013 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DragonBoatTasks_14013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DragonBoatTasks_14013 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DragonBoatTasks_14013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DragonBoatTasks_14013 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DragonBoatTasks_14013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DragonBoatTasks_14013 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DragonBoatTasks_14013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DragonBoatTasks_14013 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DragonBoatTasks_14013 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DragonBoatTasks_14013> parser() {
         return PARSER;
      }

      public Parser<C2S_DragonBoatTasks_14013> getParserForType() {
         return PARSER;
      }

      public C2S_DragonBoatTasks_14013 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DragonBoatTasks_14013OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatTasks_14013_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatTasks_14013_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DragonBoatTasks_14013.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonBoatMsg.C2S_DragonBoatTasks_14013.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatTasks_14013_descriptor;
         }

         public C2S_DragonBoatTasks_14013 getDefaultInstanceForType() {
            return DragonBoatMsg.C2S_DragonBoatTasks_14013.getDefaultInstance();
         }

         public C2S_DragonBoatTasks_14013 build() {
            C2S_DragonBoatTasks_14013 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DragonBoatTasks_14013 buildPartial() {
            C2S_DragonBoatTasks_14013 result = new C2S_DragonBoatTasks_14013(this);
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
            if (other instanceof C2S_DragonBoatTasks_14013) {
               return this.mergeFrom((C2S_DragonBoatTasks_14013)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DragonBoatTasks_14013 other) {
            if (other == DragonBoatMsg.C2S_DragonBoatTasks_14013.getDefaultInstance()) {
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
            C2S_DragonBoatTasks_14013 parsedMessage = null;

            try {
               parsedMessage = (C2S_DragonBoatTasks_14013)DragonBoatMsg.C2S_DragonBoatTasks_14013.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DragonBoatTasks_14013)e.getUnfinishedMessage();
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

   public static final class S2C_DragonBoatTasks_14014 extends GeneratedMessageV3 implements S2C_DragonBoatTasks_14014OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_DragonBoatTasks_14014 DEFAULT_INSTANCE = new S2C_DragonBoatTasks_14014();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DragonBoatTasks_14014> PARSER = new AbstractParser<S2C_DragonBoatTasks_14014>() {
         public S2C_DragonBoatTasks_14014 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DragonBoatTasks_14014(input, extensionRegistry);
         }
      };

      private S2C_DragonBoatTasks_14014(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DragonBoatTasks_14014() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DragonBoatTasks_14014();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DragonBoatTasks_14014(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.task_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.task_.add(input.readMessage(CommonMsg.Task.PARSER, extensionRegistry));
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
                  this.task_ = Collections.unmodifiableList(this.task_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatTasks_14014_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatTasks_14014_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DragonBoatTasks_14014.class, Builder.class);
      }

      public List<CommonMsg.Task> getTaskList() {
         return this.task_;
      }

      public List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList() {
         return this.task_;
      }

      public int getTaskCount() {
         return this.task_.size();
      }

      public CommonMsg.Task getTask(int index) {
         return (CommonMsg.Task)this.task_.get(index);
      }

      public CommonMsg.TaskOrBuilder getTaskOrBuilder(int index) {
         return (CommonMsg.TaskOrBuilder)this.task_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.task_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.task_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.task_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.task_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DragonBoatTasks_14014)) {
            return super.equals(obj);
         } else {
            S2C_DragonBoatTasks_14014 other = (S2C_DragonBoatTasks_14014)obj;
            if (!this.getTaskList().equals(other.getTaskList())) {
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
            if (this.getTaskCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DragonBoatTasks_14014 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatTasks_14014)PARSER.parseFrom(data);
      }

      public static S2C_DragonBoatTasks_14014 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatTasks_14014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonBoatTasks_14014 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatTasks_14014)PARSER.parseFrom(data);
      }

      public static S2C_DragonBoatTasks_14014 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatTasks_14014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonBoatTasks_14014 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatTasks_14014)PARSER.parseFrom(data);
      }

      public static S2C_DragonBoatTasks_14014 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatTasks_14014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonBoatTasks_14014 parseFrom(InputStream input) throws IOException {
         return (S2C_DragonBoatTasks_14014)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DragonBoatTasks_14014 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonBoatTasks_14014)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DragonBoatTasks_14014 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DragonBoatTasks_14014)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DragonBoatTasks_14014 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonBoatTasks_14014)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DragonBoatTasks_14014 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DragonBoatTasks_14014)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DragonBoatTasks_14014 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonBoatTasks_14014)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DragonBoatTasks_14014 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DragonBoatTasks_14014 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DragonBoatTasks_14014> parser() {
         return PARSER;
      }

      public Parser<S2C_DragonBoatTasks_14014> getParserForType() {
         return PARSER;
      }

      public S2C_DragonBoatTasks_14014 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DragonBoatTasks_14014OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatTasks_14014_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatTasks_14014_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DragonBoatTasks_14014.class, Builder.class);
         }

         private Builder() {
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonBoatMsg.S2C_DragonBoatTasks_14014.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatTasks_14014_descriptor;
         }

         public S2C_DragonBoatTasks_14014 getDefaultInstanceForType() {
            return DragonBoatMsg.S2C_DragonBoatTasks_14014.getDefaultInstance();
         }

         public S2C_DragonBoatTasks_14014 build() {
            S2C_DragonBoatTasks_14014 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DragonBoatTasks_14014 buildPartial() {
            S2C_DragonBoatTasks_14014 result = new S2C_DragonBoatTasks_14014(this);
            int from_bitField0_ = this.bitField0_;
            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
                  this.bitField0_ &= -2;
               }

               result.task_ = this.task_;
            } else {
               result.task_ = this.taskBuilder_.build();
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
            if (other instanceof S2C_DragonBoatTasks_14014) {
               return this.mergeFrom((S2C_DragonBoatTasks_14014)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DragonBoatTasks_14014 other) {
            if (other == DragonBoatMsg.S2C_DragonBoatTasks_14014.getDefaultInstance()) {
               return this;
            } else {
               if (this.taskBuilder_ == null) {
                  if (!other.task_.isEmpty()) {
                     if (this.task_.isEmpty()) {
                        this.task_ = other.task_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTaskIsMutable();
                        this.task_.addAll(other.task_);
                     }

                     this.onChanged();
                  }
               } else if (!other.task_.isEmpty()) {
                  if (this.taskBuilder_.isEmpty()) {
                     this.taskBuilder_.dispose();
                     this.taskBuilder_ = null;
                     this.task_ = other.task_;
                     this.bitField0_ &= -2;
                     this.taskBuilder_ = DragonBoatMsg.S2C_DragonBoatTasks_14014.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
                  } else {
                     this.taskBuilder_.addAllMessages(other.task_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DragonBoatTasks_14014 parsedMessage = null;

            try {
               parsedMessage = (S2C_DragonBoatTasks_14014)DragonBoatMsg.S2C_DragonBoatTasks_14014.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DragonBoatTasks_14014)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTaskIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.task_ = new ArrayList(this.task_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.Task> getTaskList() {
            return this.taskBuilder_ == null ? Collections.unmodifiableList(this.task_) : this.taskBuilder_.getMessageList();
         }

         public int getTaskCount() {
            return this.taskBuilder_ == null ? this.task_.size() : this.taskBuilder_.getCount();
         }

         public CommonMsg.Task getTask(int index) {
            return this.taskBuilder_ == null ? (CommonMsg.Task)this.task_.get(index) : (CommonMsg.Task)this.taskBuilder_.getMessage(index);
         }

         public Builder setTask(int index, CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.set(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTask(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTask(CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTask(int index, CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTask(CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTask(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTask(Iterable<? extends CommonMsg.Task> values) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.task_);
               this.onChanged();
            } else {
               this.taskBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTask() {
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Builder removeTask(int index) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.remove(index);
               this.onChanged();
            } else {
               this.taskBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.Task.Builder getTaskBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TaskOrBuilder getTaskOrBuilder(int index) {
            return this.taskBuilder_ == null ? (CommonMsg.TaskOrBuilder)this.task_.get(index) : (CommonMsg.TaskOrBuilder)this.taskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList() {
            return this.taskBuilder_ != null ? this.taskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.task_);
         }

         public CommonMsg.Task.Builder addTaskBuilder() {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().addBuilder(CommonMsg.Task.getDefaultInstance());
         }

         public CommonMsg.Task.Builder addTaskBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().addBuilder(index, CommonMsg.Task.getDefaultInstance());
         }

         public List<CommonMsg.Task.Builder> getTaskBuilderList() {
            return this.getTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTaskFieldBuilder() {
            if (this.taskBuilder_ == null) {
               this.taskBuilder_ = new RepeatedFieldBuilderV3(this.task_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.task_ = null;
            }

            return this.taskBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_UpdateTasks_14016 extends GeneratedMessageV3 implements S2C_UpdateTasks_14016OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> task_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateTasks_14016 DEFAULT_INSTANCE = new S2C_UpdateTasks_14016();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateTasks_14016> PARSER = new AbstractParser<S2C_UpdateTasks_14016>() {
         public S2C_UpdateTasks_14016 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateTasks_14016(input, extensionRegistry);
         }
      };

      private S2C_UpdateTasks_14016(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateTasks_14016() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateTasks_14016();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateTasks_14016(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.task_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.task_.add(input.readMessage(CommonMsg.Task.PARSER, extensionRegistry));
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
                  this.task_ = Collections.unmodifiableList(this.task_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_UpdateTasks_14016_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_UpdateTasks_14016_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateTasks_14016.class, Builder.class);
      }

      public List<CommonMsg.Task> getTaskList() {
         return this.task_;
      }

      public List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList() {
         return this.task_;
      }

      public int getTaskCount() {
         return this.task_.size();
      }

      public CommonMsg.Task getTask(int index) {
         return (CommonMsg.Task)this.task_.get(index);
      }

      public CommonMsg.TaskOrBuilder getTaskOrBuilder(int index) {
         return (CommonMsg.TaskOrBuilder)this.task_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.task_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.task_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.task_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.task_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpdateTasks_14016)) {
            return super.equals(obj);
         } else {
            S2C_UpdateTasks_14016 other = (S2C_UpdateTasks_14016)obj;
            if (!this.getTaskList().equals(other.getTaskList())) {
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
            if (this.getTaskCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpdateTasks_14016 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_14016)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTasks_14016 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_14016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTasks_14016 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_14016)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTasks_14016 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_14016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTasks_14016 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_14016)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTasks_14016 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTasks_14016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTasks_14016 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateTasks_14016)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateTasks_14016 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTasks_14016)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateTasks_14016 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateTasks_14016)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateTasks_14016 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTasks_14016)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateTasks_14016 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateTasks_14016)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateTasks_14016 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTasks_14016)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateTasks_14016 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateTasks_14016 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateTasks_14016> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateTasks_14016> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateTasks_14016 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateTasks_14016OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> task_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_UpdateTasks_14016_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_UpdateTasks_14016_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateTasks_14016.class, Builder.class);
         }

         private Builder() {
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonBoatMsg.S2C_UpdateTasks_14016.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_UpdateTasks_14016_descriptor;
         }

         public S2C_UpdateTasks_14016 getDefaultInstanceForType() {
            return DragonBoatMsg.S2C_UpdateTasks_14016.getDefaultInstance();
         }

         public S2C_UpdateTasks_14016 build() {
            S2C_UpdateTasks_14016 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateTasks_14016 buildPartial() {
            S2C_UpdateTasks_14016 result = new S2C_UpdateTasks_14016(this);
            int from_bitField0_ = this.bitField0_;
            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
                  this.bitField0_ &= -2;
               }

               result.task_ = this.task_;
            } else {
               result.task_ = this.taskBuilder_.build();
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
            if (other instanceof S2C_UpdateTasks_14016) {
               return this.mergeFrom((S2C_UpdateTasks_14016)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateTasks_14016 other) {
            if (other == DragonBoatMsg.S2C_UpdateTasks_14016.getDefaultInstance()) {
               return this;
            } else {
               if (this.taskBuilder_ == null) {
                  if (!other.task_.isEmpty()) {
                     if (this.task_.isEmpty()) {
                        this.task_ = other.task_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTaskIsMutable();
                        this.task_.addAll(other.task_);
                     }

                     this.onChanged();
                  }
               } else if (!other.task_.isEmpty()) {
                  if (this.taskBuilder_.isEmpty()) {
                     this.taskBuilder_.dispose();
                     this.taskBuilder_ = null;
                     this.task_ = other.task_;
                     this.bitField0_ &= -2;
                     this.taskBuilder_ = DragonBoatMsg.S2C_UpdateTasks_14016.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
                  } else {
                     this.taskBuilder_.addAllMessages(other.task_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpdateTasks_14016 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateTasks_14016)DragonBoatMsg.S2C_UpdateTasks_14016.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateTasks_14016)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTaskIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.task_ = new ArrayList(this.task_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.Task> getTaskList() {
            return this.taskBuilder_ == null ? Collections.unmodifiableList(this.task_) : this.taskBuilder_.getMessageList();
         }

         public int getTaskCount() {
            return this.taskBuilder_ == null ? this.task_.size() : this.taskBuilder_.getCount();
         }

         public CommonMsg.Task getTask(int index) {
            return this.taskBuilder_ == null ? (CommonMsg.Task)this.task_.get(index) : (CommonMsg.Task)this.taskBuilder_.getMessage(index);
         }

         public Builder setTask(int index, CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.set(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTask(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTask(CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTask(int index, CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTask(CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTask(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTask(Iterable<? extends CommonMsg.Task> values) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.task_);
               this.onChanged();
            } else {
               this.taskBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTask() {
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Builder removeTask(int index) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.remove(index);
               this.onChanged();
            } else {
               this.taskBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.Task.Builder getTaskBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TaskOrBuilder getTaskOrBuilder(int index) {
            return this.taskBuilder_ == null ? (CommonMsg.TaskOrBuilder)this.task_.get(index) : (CommonMsg.TaskOrBuilder)this.taskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList() {
            return this.taskBuilder_ != null ? this.taskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.task_);
         }

         public CommonMsg.Task.Builder addTaskBuilder() {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().addBuilder(CommonMsg.Task.getDefaultInstance());
         }

         public CommonMsg.Task.Builder addTaskBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().addBuilder(index, CommonMsg.Task.getDefaultInstance());
         }

         public List<CommonMsg.Task.Builder> getTaskBuilderList() {
            return this.getTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTaskFieldBuilder() {
            if (this.taskBuilder_ == null) {
               this.taskBuilder_ = new RepeatedFieldBuilderV3(this.task_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.task_ = null;
            }

            return this.taskBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_DragonBoatPrayMain_14021 extends GeneratedMessageV3 implements C2S_DragonBoatPrayMain_14021OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DragonBoatPrayMain_14021 DEFAULT_INSTANCE = new C2S_DragonBoatPrayMain_14021();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DragonBoatPrayMain_14021> PARSER = new AbstractParser<C2S_DragonBoatPrayMain_14021>() {
         public C2S_DragonBoatPrayMain_14021 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DragonBoatPrayMain_14021(input, extensionRegistry);
         }
      };

      private C2S_DragonBoatPrayMain_14021(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DragonBoatPrayMain_14021() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DragonBoatPrayMain_14021();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DragonBoatPrayMain_14021(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatPrayMain_14021_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatPrayMain_14021_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DragonBoatPrayMain_14021.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DragonBoatPrayMain_14021)) {
            return super.equals(obj);
         } else {
            C2S_DragonBoatPrayMain_14021 other = (C2S_DragonBoatPrayMain_14021)obj;
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

      public static C2S_DragonBoatPrayMain_14021 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DragonBoatPrayMain_14021)PARSER.parseFrom(data);
      }

      public static C2S_DragonBoatPrayMain_14021 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DragonBoatPrayMain_14021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DragonBoatPrayMain_14021 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DragonBoatPrayMain_14021)PARSER.parseFrom(data);
      }

      public static C2S_DragonBoatPrayMain_14021 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DragonBoatPrayMain_14021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DragonBoatPrayMain_14021 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DragonBoatPrayMain_14021)PARSER.parseFrom(data);
      }

      public static C2S_DragonBoatPrayMain_14021 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DragonBoatPrayMain_14021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DragonBoatPrayMain_14021 parseFrom(InputStream input) throws IOException {
         return (C2S_DragonBoatPrayMain_14021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DragonBoatPrayMain_14021 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DragonBoatPrayMain_14021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DragonBoatPrayMain_14021 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DragonBoatPrayMain_14021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DragonBoatPrayMain_14021 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DragonBoatPrayMain_14021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DragonBoatPrayMain_14021 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DragonBoatPrayMain_14021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DragonBoatPrayMain_14021 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DragonBoatPrayMain_14021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DragonBoatPrayMain_14021 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DragonBoatPrayMain_14021 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DragonBoatPrayMain_14021> parser() {
         return PARSER;
      }

      public Parser<C2S_DragonBoatPrayMain_14021> getParserForType() {
         return PARSER;
      }

      public C2S_DragonBoatPrayMain_14021 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DragonBoatPrayMain_14021OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatPrayMain_14021_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatPrayMain_14021_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DragonBoatPrayMain_14021.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonBoatMsg.C2S_DragonBoatPrayMain_14021.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatPrayMain_14021_descriptor;
         }

         public C2S_DragonBoatPrayMain_14021 getDefaultInstanceForType() {
            return DragonBoatMsg.C2S_DragonBoatPrayMain_14021.getDefaultInstance();
         }

         public C2S_DragonBoatPrayMain_14021 build() {
            C2S_DragonBoatPrayMain_14021 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DragonBoatPrayMain_14021 buildPartial() {
            C2S_DragonBoatPrayMain_14021 result = new C2S_DragonBoatPrayMain_14021(this);
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
            if (other instanceof C2S_DragonBoatPrayMain_14021) {
               return this.mergeFrom((C2S_DragonBoatPrayMain_14021)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DragonBoatPrayMain_14021 other) {
            if (other == DragonBoatMsg.C2S_DragonBoatPrayMain_14021.getDefaultInstance()) {
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
            C2S_DragonBoatPrayMain_14021 parsedMessage = null;

            try {
               parsedMessage = (C2S_DragonBoatPrayMain_14021)DragonBoatMsg.C2S_DragonBoatPrayMain_14021.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DragonBoatPrayMain_14021)e.getUnfinishedMessage();
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

   public static final class S2C_DragonBoatPrayMain_14022 extends GeneratedMessageV3 implements S2C_DragonBoatPrayMain_14022OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAY_FIELD_NUMBER = 1;
      private int day_;
      public static final int ID_FIELD_NUMBER = 2;
      private Internal.IntList id_;
      public static final int TASK_FIELD_NUMBER = 3;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_DragonBoatPrayMain_14022 DEFAULT_INSTANCE = new S2C_DragonBoatPrayMain_14022();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DragonBoatPrayMain_14022> PARSER = new AbstractParser<S2C_DragonBoatPrayMain_14022>() {
         public S2C_DragonBoatPrayMain_14022 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DragonBoatPrayMain_14022(input, extensionRegistry);
         }
      };

      private S2C_DragonBoatPrayMain_14022(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DragonBoatPrayMain_14022() {
         this.memoizedIsInitialized = -1;
         this.id_ = emptyIntList();
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DragonBoatPrayMain_14022();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DragonBoatPrayMain_14022(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.day_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.id_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.task_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.task_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.id_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.id_.makeImmutable();
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPrayMain_14022_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPrayMain_14022_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DragonBoatPrayMain_14022.class, Builder.class);
      }

      public boolean hasDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDay() {
         return this.day_;
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

      public List<ActivityMsg.TaskData> getTaskList() {
         return this.task_;
      }

      public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList() {
         return this.task_;
      }

      public int getTaskCount() {
         return this.task_.size();
      }

      public ActivityMsg.TaskData getTask(int index) {
         return (ActivityMsg.TaskData)this.task_.get(index);
      }

      public ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index) {
         return (ActivityMsg.TaskDataOrBuilder)this.task_.get(index);
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
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
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
            output.writeInt32(1, this.day_);
         }

         for(int i = 0; i < this.id_.size(); ++i) {
            output.writeInt32(2, this.id_.getInt(i));
         }

         for(int i = 0; i < this.task_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.task_.get(i));
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

            int dataSize = 0;

            for(int i = 0; i < this.id_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.id_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getIdList().size();

            for(int i = 0; i < this.task_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.task_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DragonBoatPrayMain_14022)) {
            return super.equals(obj);
         } else {
            S2C_DragonBoatPrayMain_14022 other = (S2C_DragonBoatPrayMain_14022)obj;
            if (this.hasDay() != other.hasDay()) {
               return false;
            } else if (this.hasDay() && this.getDay() != other.getDay()) {
               return false;
            } else if (!this.getIdList().equals(other.getIdList())) {
               return false;
            } else if (!this.getTaskList().equals(other.getTaskList())) {
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

            if (this.getIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getIdList().hashCode();
            }

            if (this.getTaskCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTaskList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DragonBoatPrayMain_14022 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatPrayMain_14022)PARSER.parseFrom(data);
      }

      public static S2C_DragonBoatPrayMain_14022 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatPrayMain_14022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonBoatPrayMain_14022 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatPrayMain_14022)PARSER.parseFrom(data);
      }

      public static S2C_DragonBoatPrayMain_14022 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatPrayMain_14022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonBoatPrayMain_14022 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatPrayMain_14022)PARSER.parseFrom(data);
      }

      public static S2C_DragonBoatPrayMain_14022 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatPrayMain_14022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonBoatPrayMain_14022 parseFrom(InputStream input) throws IOException {
         return (S2C_DragonBoatPrayMain_14022)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DragonBoatPrayMain_14022 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonBoatPrayMain_14022)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DragonBoatPrayMain_14022 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DragonBoatPrayMain_14022)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DragonBoatPrayMain_14022 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonBoatPrayMain_14022)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DragonBoatPrayMain_14022 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DragonBoatPrayMain_14022)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DragonBoatPrayMain_14022 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonBoatPrayMain_14022)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DragonBoatPrayMain_14022 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DragonBoatPrayMain_14022 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DragonBoatPrayMain_14022> parser() {
         return PARSER;
      }

      public Parser<S2C_DragonBoatPrayMain_14022> getParserForType() {
         return PARSER;
      }

      public S2C_DragonBoatPrayMain_14022 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DragonBoatPrayMain_14022OrBuilder {
         private int bitField0_;
         private int day_;
         private Internal.IntList id_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPrayMain_14022_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPrayMain_14022_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DragonBoatPrayMain_14022.class, Builder.class);
         }

         private Builder() {
            this.id_ = DragonBoatMsg.S2C_DragonBoatPrayMain_14022.emptyIntList();
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.id_ = DragonBoatMsg.S2C_DragonBoatPrayMain_14022.emptyIntList();
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonBoatMsg.S2C_DragonBoatPrayMain_14022.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.day_ = 0;
            this.bitField0_ &= -2;
            this.id_ = DragonBoatMsg.S2C_DragonBoatPrayMain_14022.emptyIntList();
            this.bitField0_ &= -3;
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPrayMain_14022_descriptor;
         }

         public S2C_DragonBoatPrayMain_14022 getDefaultInstanceForType() {
            return DragonBoatMsg.S2C_DragonBoatPrayMain_14022.getDefaultInstance();
         }

         public S2C_DragonBoatPrayMain_14022 build() {
            S2C_DragonBoatPrayMain_14022 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DragonBoatPrayMain_14022 buildPartial() {
            S2C_DragonBoatPrayMain_14022 result = new S2C_DragonBoatPrayMain_14022(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.day_ = this.day_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.id_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.id_ = this.id_;
            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
                  this.bitField0_ &= -5;
               }

               result.task_ = this.task_;
            } else {
               result.task_ = this.taskBuilder_.build();
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
            if (other instanceof S2C_DragonBoatPrayMain_14022) {
               return this.mergeFrom((S2C_DragonBoatPrayMain_14022)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DragonBoatPrayMain_14022 other) {
            if (other == DragonBoatMsg.S2C_DragonBoatPrayMain_14022.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDay()) {
                  this.setDay(other.getDay());
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

               if (this.taskBuilder_ == null) {
                  if (!other.task_.isEmpty()) {
                     if (this.task_.isEmpty()) {
                        this.task_ = other.task_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureTaskIsMutable();
                        this.task_.addAll(other.task_);
                     }

                     this.onChanged();
                  }
               } else if (!other.task_.isEmpty()) {
                  if (this.taskBuilder_.isEmpty()) {
                     this.taskBuilder_.dispose();
                     this.taskBuilder_ = null;
                     this.task_ = other.task_;
                     this.bitField0_ &= -5;
                     this.taskBuilder_ = DragonBoatMsg.S2C_DragonBoatPrayMain_14022.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
                  } else {
                     this.taskBuilder_.addAllMessages(other.task_);
                  }
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
               for(int i = 0; i < this.getTaskCount(); ++i) {
                  if (!this.getTask(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DragonBoatPrayMain_14022 parsedMessage = null;

            try {
               parsedMessage = (S2C_DragonBoatPrayMain_14022)DragonBoatMsg.S2C_DragonBoatPrayMain_14022.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DragonBoatPrayMain_14022)e.getUnfinishedMessage();
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

         private void ensureIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.id_ = DragonBoatMsg.S2C_DragonBoatPrayMain_14022.mutableCopy(this.id_);
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
            this.id_ = DragonBoatMsg.S2C_DragonBoatPrayMain_14022.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         private void ensureTaskIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.task_ = new ArrayList(this.task_);
               this.bitField0_ |= 4;
            }

         }

         public List<ActivityMsg.TaskData> getTaskList() {
            return this.taskBuilder_ == null ? Collections.unmodifiableList(this.task_) : this.taskBuilder_.getMessageList();
         }

         public int getTaskCount() {
            return this.taskBuilder_ == null ? this.task_.size() : this.taskBuilder_.getCount();
         }

         public ActivityMsg.TaskData getTask(int index) {
            return this.taskBuilder_ == null ? (ActivityMsg.TaskData)this.task_.get(index) : (ActivityMsg.TaskData)this.taskBuilder_.getMessage(index);
         }

         public Builder setTask(int index, ActivityMsg.TaskData value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.set(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTask(ActivityMsg.TaskData value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTask(int index, ActivityMsg.TaskData value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTask(ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTask(Iterable<? extends ActivityMsg.TaskData> values) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.task_);
               this.onChanged();
            } else {
               this.taskBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTask() {
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Builder removeTask(int index) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.remove(index);
               this.onChanged();
            } else {
               this.taskBuilder_.remove(index);
            }

            return this;
         }

         public ActivityMsg.TaskData.Builder getTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index) {
            return this.taskBuilder_ == null ? (ActivityMsg.TaskDataOrBuilder)this.task_.get(index) : (ActivityMsg.TaskDataOrBuilder)this.taskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList() {
            return this.taskBuilder_ != null ? this.taskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.task_);
         }

         public ActivityMsg.TaskData.Builder addTaskBuilder() {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().addBuilder(ActivityMsg.TaskData.getDefaultInstance());
         }

         public ActivityMsg.TaskData.Builder addTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().addBuilder(index, ActivityMsg.TaskData.getDefaultInstance());
         }

         public List<ActivityMsg.TaskData.Builder> getTaskBuilderList() {
            return this.getTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> getTaskFieldBuilder() {
            if (this.taskBuilder_ == null) {
               this.taskBuilder_ = new RepeatedFieldBuilderV3(this.task_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.task_ = null;
            }

            return this.taskBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_DragonBoatPray_14023 extends GeneratedMessageV3 implements C2S_DragonBoatPray_14023OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ID_FIELD_NUMBER = 1;
      private Internal.IntList id_;
      private byte memoizedIsInitialized;
      private static final C2S_DragonBoatPray_14023 DEFAULT_INSTANCE = new C2S_DragonBoatPray_14023();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DragonBoatPray_14023> PARSER = new AbstractParser<C2S_DragonBoatPray_14023>() {
         public C2S_DragonBoatPray_14023 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DragonBoatPray_14023(input, extensionRegistry);
         }
      };

      private C2S_DragonBoatPray_14023(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DragonBoatPray_14023() {
         this.memoizedIsInitialized = -1;
         this.id_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DragonBoatPray_14023();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DragonBoatPray_14023(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatPray_14023_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatPray_14023_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DragonBoatPray_14023.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DragonBoatPray_14023)) {
            return super.equals(obj);
         } else {
            C2S_DragonBoatPray_14023 other = (C2S_DragonBoatPray_14023)obj;
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

      public static C2S_DragonBoatPray_14023 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DragonBoatPray_14023)PARSER.parseFrom(data);
      }

      public static C2S_DragonBoatPray_14023 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DragonBoatPray_14023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DragonBoatPray_14023 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DragonBoatPray_14023)PARSER.parseFrom(data);
      }

      public static C2S_DragonBoatPray_14023 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DragonBoatPray_14023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DragonBoatPray_14023 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DragonBoatPray_14023)PARSER.parseFrom(data);
      }

      public static C2S_DragonBoatPray_14023 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DragonBoatPray_14023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DragonBoatPray_14023 parseFrom(InputStream input) throws IOException {
         return (C2S_DragonBoatPray_14023)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DragonBoatPray_14023 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DragonBoatPray_14023)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DragonBoatPray_14023 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DragonBoatPray_14023)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DragonBoatPray_14023 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DragonBoatPray_14023)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DragonBoatPray_14023 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DragonBoatPray_14023)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DragonBoatPray_14023 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DragonBoatPray_14023)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DragonBoatPray_14023 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DragonBoatPray_14023 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DragonBoatPray_14023> parser() {
         return PARSER;
      }

      public Parser<C2S_DragonBoatPray_14023> getParserForType() {
         return PARSER;
      }

      public C2S_DragonBoatPray_14023 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DragonBoatPray_14023OrBuilder {
         private int bitField0_;
         private Internal.IntList id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatPray_14023_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatPray_14023_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DragonBoatPray_14023.class, Builder.class);
         }

         private Builder() {
            this.id_ = DragonBoatMsg.C2S_DragonBoatPray_14023.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.id_ = DragonBoatMsg.C2S_DragonBoatPray_14023.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonBoatMsg.C2S_DragonBoatPray_14023.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = DragonBoatMsg.C2S_DragonBoatPray_14023.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_C2S_DragonBoatPray_14023_descriptor;
         }

         public C2S_DragonBoatPray_14023 getDefaultInstanceForType() {
            return DragonBoatMsg.C2S_DragonBoatPray_14023.getDefaultInstance();
         }

         public C2S_DragonBoatPray_14023 build() {
            C2S_DragonBoatPray_14023 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DragonBoatPray_14023 buildPartial() {
            C2S_DragonBoatPray_14023 result = new C2S_DragonBoatPray_14023(this);
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
            if (other instanceof C2S_DragonBoatPray_14023) {
               return this.mergeFrom((C2S_DragonBoatPray_14023)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DragonBoatPray_14023 other) {
            if (other == DragonBoatMsg.C2S_DragonBoatPray_14023.getDefaultInstance()) {
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
            C2S_DragonBoatPray_14023 parsedMessage = null;

            try {
               parsedMessage = (C2S_DragonBoatPray_14023)DragonBoatMsg.C2S_DragonBoatPray_14023.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DragonBoatPray_14023)e.getUnfinishedMessage();
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
               this.id_ = DragonBoatMsg.C2S_DragonBoatPray_14023.mutableCopy(this.id_);
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
            this.id_ = DragonBoatMsg.C2S_DragonBoatPray_14023.emptyIntList();
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

   public static final class S2C_DragonBoatPray_14024 extends GeneratedMessageV3 implements S2C_DragonBoatPray_14024OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ID_FIELD_NUMBER = 1;
      private Internal.IntList id_;
      private byte memoizedIsInitialized;
      private static final S2C_DragonBoatPray_14024 DEFAULT_INSTANCE = new S2C_DragonBoatPray_14024();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DragonBoatPray_14024> PARSER = new AbstractParser<S2C_DragonBoatPray_14024>() {
         public S2C_DragonBoatPray_14024 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DragonBoatPray_14024(input, extensionRegistry);
         }
      };

      private S2C_DragonBoatPray_14024(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DragonBoatPray_14024() {
         this.memoizedIsInitialized = -1;
         this.id_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DragonBoatPray_14024();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DragonBoatPray_14024(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPray_14024_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPray_14024_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DragonBoatPray_14024.class, Builder.class);
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
         } else if (!(obj instanceof S2C_DragonBoatPray_14024)) {
            return super.equals(obj);
         } else {
            S2C_DragonBoatPray_14024 other = (S2C_DragonBoatPray_14024)obj;
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

      public static S2C_DragonBoatPray_14024 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatPray_14024)PARSER.parseFrom(data);
      }

      public static S2C_DragonBoatPray_14024 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatPray_14024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonBoatPray_14024 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatPray_14024)PARSER.parseFrom(data);
      }

      public static S2C_DragonBoatPray_14024 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatPray_14024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonBoatPray_14024 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatPray_14024)PARSER.parseFrom(data);
      }

      public static S2C_DragonBoatPray_14024 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatPray_14024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonBoatPray_14024 parseFrom(InputStream input) throws IOException {
         return (S2C_DragonBoatPray_14024)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DragonBoatPray_14024 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonBoatPray_14024)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DragonBoatPray_14024 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DragonBoatPray_14024)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DragonBoatPray_14024 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonBoatPray_14024)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DragonBoatPray_14024 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DragonBoatPray_14024)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DragonBoatPray_14024 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonBoatPray_14024)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DragonBoatPray_14024 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DragonBoatPray_14024 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DragonBoatPray_14024> parser() {
         return PARSER;
      }

      public Parser<S2C_DragonBoatPray_14024> getParserForType() {
         return PARSER;
      }

      public S2C_DragonBoatPray_14024 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DragonBoatPray_14024OrBuilder {
         private int bitField0_;
         private Internal.IntList id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPray_14024_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPray_14024_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DragonBoatPray_14024.class, Builder.class);
         }

         private Builder() {
            this.id_ = DragonBoatMsg.S2C_DragonBoatPray_14024.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.id_ = DragonBoatMsg.S2C_DragonBoatPray_14024.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonBoatMsg.S2C_DragonBoatPray_14024.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = DragonBoatMsg.S2C_DragonBoatPray_14024.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPray_14024_descriptor;
         }

         public S2C_DragonBoatPray_14024 getDefaultInstanceForType() {
            return DragonBoatMsg.S2C_DragonBoatPray_14024.getDefaultInstance();
         }

         public S2C_DragonBoatPray_14024 build() {
            S2C_DragonBoatPray_14024 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DragonBoatPray_14024 buildPartial() {
            S2C_DragonBoatPray_14024 result = new S2C_DragonBoatPray_14024(this);
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
            if (other instanceof S2C_DragonBoatPray_14024) {
               return this.mergeFrom((S2C_DragonBoatPray_14024)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DragonBoatPray_14024 other) {
            if (other == DragonBoatMsg.S2C_DragonBoatPray_14024.getDefaultInstance()) {
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
            S2C_DragonBoatPray_14024 parsedMessage = null;

            try {
               parsedMessage = (S2C_DragonBoatPray_14024)DragonBoatMsg.S2C_DragonBoatPray_14024.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DragonBoatPray_14024)e.getUnfinishedMessage();
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
               this.id_ = DragonBoatMsg.S2C_DragonBoatPray_14024.mutableCopy(this.id_);
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
            this.id_ = DragonBoatMsg.S2C_DragonBoatPray_14024.emptyIntList();
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

   public static final class S2C_DragonBoatPrayTaskNotify_14026 extends GeneratedMessageV3 implements S2C_DragonBoatPrayTaskNotify_14026OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_DragonBoatPrayTaskNotify_14026 DEFAULT_INSTANCE = new S2C_DragonBoatPrayTaskNotify_14026();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DragonBoatPrayTaskNotify_14026> PARSER = new AbstractParser<S2C_DragonBoatPrayTaskNotify_14026>() {
         public S2C_DragonBoatPrayTaskNotify_14026 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DragonBoatPrayTaskNotify_14026(input, extensionRegistry);
         }
      };

      private S2C_DragonBoatPrayTaskNotify_14026(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DragonBoatPrayTaskNotify_14026() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DragonBoatPrayTaskNotify_14026();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DragonBoatPrayTaskNotify_14026(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.task_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.task_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
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
                  this.task_ = Collections.unmodifiableList(this.task_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPrayTaskNotify_14026_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPrayTaskNotify_14026_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DragonBoatPrayTaskNotify_14026.class, Builder.class);
      }

      public List<ActivityMsg.TaskData> getTaskList() {
         return this.task_;
      }

      public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList() {
         return this.task_;
      }

      public int getTaskCount() {
         return this.task_.size();
      }

      public ActivityMsg.TaskData getTask(int index) {
         return (ActivityMsg.TaskData)this.task_.get(index);
      }

      public ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index) {
         return (ActivityMsg.TaskDataOrBuilder)this.task_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.task_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.task_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.task_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.task_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DragonBoatPrayTaskNotify_14026)) {
            return super.equals(obj);
         } else {
            S2C_DragonBoatPrayTaskNotify_14026 other = (S2C_DragonBoatPrayTaskNotify_14026)obj;
            if (!this.getTaskList().equals(other.getTaskList())) {
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
            if (this.getTaskCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DragonBoatPrayTaskNotify_14026 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatPrayTaskNotify_14026)PARSER.parseFrom(data);
      }

      public static S2C_DragonBoatPrayTaskNotify_14026 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatPrayTaskNotify_14026)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonBoatPrayTaskNotify_14026 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatPrayTaskNotify_14026)PARSER.parseFrom(data);
      }

      public static S2C_DragonBoatPrayTaskNotify_14026 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatPrayTaskNotify_14026)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonBoatPrayTaskNotify_14026 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatPrayTaskNotify_14026)PARSER.parseFrom(data);
      }

      public static S2C_DragonBoatPrayTaskNotify_14026 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonBoatPrayTaskNotify_14026)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonBoatPrayTaskNotify_14026 parseFrom(InputStream input) throws IOException {
         return (S2C_DragonBoatPrayTaskNotify_14026)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DragonBoatPrayTaskNotify_14026 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonBoatPrayTaskNotify_14026)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DragonBoatPrayTaskNotify_14026 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DragonBoatPrayTaskNotify_14026)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DragonBoatPrayTaskNotify_14026 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonBoatPrayTaskNotify_14026)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DragonBoatPrayTaskNotify_14026 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DragonBoatPrayTaskNotify_14026)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DragonBoatPrayTaskNotify_14026 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonBoatPrayTaskNotify_14026)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DragonBoatPrayTaskNotify_14026 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DragonBoatPrayTaskNotify_14026 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DragonBoatPrayTaskNotify_14026> parser() {
         return PARSER;
      }

      public Parser<S2C_DragonBoatPrayTaskNotify_14026> getParserForType() {
         return PARSER;
      }

      public S2C_DragonBoatPrayTaskNotify_14026 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DragonBoatPrayTaskNotify_14026OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPrayTaskNotify_14026_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPrayTaskNotify_14026_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DragonBoatPrayTaskNotify_14026.class, Builder.class);
         }

         private Builder() {
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonBoatMsg.S2C_DragonBoatPrayTaskNotify_14026.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonBoatMsg.internal_static_dragonBoat_com_gzbz_protobuf_S2C_DragonBoatPrayTaskNotify_14026_descriptor;
         }

         public S2C_DragonBoatPrayTaskNotify_14026 getDefaultInstanceForType() {
            return DragonBoatMsg.S2C_DragonBoatPrayTaskNotify_14026.getDefaultInstance();
         }

         public S2C_DragonBoatPrayTaskNotify_14026 build() {
            S2C_DragonBoatPrayTaskNotify_14026 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DragonBoatPrayTaskNotify_14026 buildPartial() {
            S2C_DragonBoatPrayTaskNotify_14026 result = new S2C_DragonBoatPrayTaskNotify_14026(this);
            int from_bitField0_ = this.bitField0_;
            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
                  this.bitField0_ &= -2;
               }

               result.task_ = this.task_;
            } else {
               result.task_ = this.taskBuilder_.build();
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
            if (other instanceof S2C_DragonBoatPrayTaskNotify_14026) {
               return this.mergeFrom((S2C_DragonBoatPrayTaskNotify_14026)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DragonBoatPrayTaskNotify_14026 other) {
            if (other == DragonBoatMsg.S2C_DragonBoatPrayTaskNotify_14026.getDefaultInstance()) {
               return this;
            } else {
               if (this.taskBuilder_ == null) {
                  if (!other.task_.isEmpty()) {
                     if (this.task_.isEmpty()) {
                        this.task_ = other.task_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTaskIsMutable();
                        this.task_.addAll(other.task_);
                     }

                     this.onChanged();
                  }
               } else if (!other.task_.isEmpty()) {
                  if (this.taskBuilder_.isEmpty()) {
                     this.taskBuilder_.dispose();
                     this.taskBuilder_ = null;
                     this.task_ = other.task_;
                     this.bitField0_ &= -2;
                     this.taskBuilder_ = DragonBoatMsg.S2C_DragonBoatPrayTaskNotify_14026.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
                  } else {
                     this.taskBuilder_.addAllMessages(other.task_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DragonBoatPrayTaskNotify_14026 parsedMessage = null;

            try {
               parsedMessage = (S2C_DragonBoatPrayTaskNotify_14026)DragonBoatMsg.S2C_DragonBoatPrayTaskNotify_14026.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DragonBoatPrayTaskNotify_14026)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTaskIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.task_ = new ArrayList(this.task_);
               this.bitField0_ |= 1;
            }

         }

         public List<ActivityMsg.TaskData> getTaskList() {
            return this.taskBuilder_ == null ? Collections.unmodifiableList(this.task_) : this.taskBuilder_.getMessageList();
         }

         public int getTaskCount() {
            return this.taskBuilder_ == null ? this.task_.size() : this.taskBuilder_.getCount();
         }

         public ActivityMsg.TaskData getTask(int index) {
            return this.taskBuilder_ == null ? (ActivityMsg.TaskData)this.task_.get(index) : (ActivityMsg.TaskData)this.taskBuilder_.getMessage(index);
         }

         public Builder setTask(int index, ActivityMsg.TaskData value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.set(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTask(ActivityMsg.TaskData value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTask(int index, ActivityMsg.TaskData value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTask(ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTask(Iterable<? extends ActivityMsg.TaskData> values) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.task_);
               this.onChanged();
            } else {
               this.taskBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTask() {
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Builder removeTask(int index) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.remove(index);
               this.onChanged();
            } else {
               this.taskBuilder_.remove(index);
            }

            return this;
         }

         public ActivityMsg.TaskData.Builder getTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index) {
            return this.taskBuilder_ == null ? (ActivityMsg.TaskDataOrBuilder)this.task_.get(index) : (ActivityMsg.TaskDataOrBuilder)this.taskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList() {
            return this.taskBuilder_ != null ? this.taskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.task_);
         }

         public ActivityMsg.TaskData.Builder addTaskBuilder() {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().addBuilder(ActivityMsg.TaskData.getDefaultInstance());
         }

         public ActivityMsg.TaskData.Builder addTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().addBuilder(index, ActivityMsg.TaskData.getDefaultInstance());
         }

         public List<ActivityMsg.TaskData.Builder> getTaskBuilderList() {
            return this.getTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> getTaskFieldBuilder() {
            if (this.taskBuilder_ == null) {
               this.taskBuilder_ = new RepeatedFieldBuilderV3(this.task_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.task_ = null;
            }

            return this.taskBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_CommitTask_14011OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_DragonBoatPrayMain_14021OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_DragonBoatPray_14023OrBuilder extends MessageOrBuilder {
      List<Integer> getIdList();

      int getIdCount();

      int getId(int index);
   }

   public interface C2S_DragonBoatTasks_14013OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Drink_14005OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_FreeDrinkNum_14007OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_MakeWine_14001OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();
   }

   public interface C2S_TakePlumReward_14003OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_CommitTask_14012OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_DragonBoatPrayMain_14022OrBuilder extends MessageOrBuilder {
      boolean hasDay();

      int getDay();

      List<Integer> getIdList();

      int getIdCount();

      int getId(int index);

      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_DragonBoatPrayTaskNotify_14026OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_DragonBoatPray_14024OrBuilder extends MessageOrBuilder {
      List<Integer> getIdList();

      int getIdCount();

      int getId(int index);
   }

   public interface S2C_DragonBoatTasks_14014OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_Drink_14006OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasFreeNum();

      int getFreeNum();
   }

   public interface S2C_FreeDrinkNum_14008OrBuilder extends MessageOrBuilder {
      boolean hasFreeNum();

      int getFreeNum();

      boolean hasTotalWineNum();

      int getTotalWineNum();

      boolean hasIsTaked();

      boolean getIsTaked();
   }

   public interface S2C_MakeWine_14002OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasTotalWineNum();

      int getTotalWineNum();
   }

   public interface S2C_TakePlumReward_14004OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_UpdateTasks_14016OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskList();

      CommonMsg.Task getTask(int index);

      int getTaskCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskOrBuilder(int index);
   }
}
