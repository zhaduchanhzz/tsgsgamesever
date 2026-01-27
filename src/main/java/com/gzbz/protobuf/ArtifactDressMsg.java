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

public final class ArtifactDressMsg {
   private static final Descriptors.Descriptor internal_static_artifactDress_com_gzbz_protobuf_DressInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactDress_com_gzbz_protobuf_DressInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactDress_com_gzbz_protobuf_C2S_Main_11101_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactDress_com_gzbz_protobuf_C2S_Main_11101_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactDress_com_gzbz_protobuf_S2C_MainResult_11102_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactDress_com_gzbz_protobuf_S2C_MainResult_11102_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactDress_com_gzbz_protobuf_C2S_TakeTask_11103_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactDress_com_gzbz_protobuf_C2S_TakeTask_11103_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactDress_com_gzbz_protobuf_S2C_UpdateTask_11104_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactDress_com_gzbz_protobuf_S2C_UpdateTask_11104_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactDress_com_gzbz_protobuf_S2C_UnlockDress_11106_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactDress_com_gzbz_protobuf_S2C_UnlockDress_11106_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactDress_com_gzbz_protobuf_C2S_Activation_11107_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactDress_com_gzbz_protobuf_C2S_Activation_11107_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactDress_com_gzbz_protobuf_S2C_ActivationResult_11108_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactDress_com_gzbz_protobuf_S2C_ActivationResult_11108_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactDress_com_gzbz_protobuf_C2S_Upgrade_11109_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactDress_com_gzbz_protobuf_C2S_Upgrade_11109_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactDress_com_gzbz_protobuf_S2C_UpgradeResult_11110_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactDress_com_gzbz_protobuf_S2C_UpgradeResult_11110_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactDress_com_gzbz_protobuf_C2S_Wear_11111_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactDress_com_gzbz_protobuf_C2S_Wear_11111_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactDress_com_gzbz_protobuf_S2C_WearResult_11112_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactDress_com_gzbz_protobuf_S2C_WearResult_11112_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactDress_com_gzbz_protobuf_C2S_Undress_11113_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactDress_com_gzbz_protobuf_C2S_Undress_11113_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactDress_com_gzbz_protobuf_S2C_UndressResult_11114_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactDress_com_gzbz_protobuf_S2C_UndressResult_11114_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactDress_com_gzbz_protobuf_C2S_Smelt_11115_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactDress_com_gzbz_protobuf_C2S_Smelt_11115_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactDress_com_gzbz_protobuf_S2C_Smelt_11116_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactDress_com_gzbz_protobuf_S2C_Smelt_11116_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifactDress_com_gzbz_protobuf_S2C_UseDress_11118_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifactDress_com_gzbz_protobuf_S2C_UseDress_11118_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ArtifactDressMsg() {
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
      String[] descriptorData = new String[]{"\n\u0013ArtifactDress.proto\u0012\u001fartifactDress.com.gzbz.protobuf\u001a\fcommon.proto\"\u0089\u0001\n\tDressInfo\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006unlock\u0018\u0002 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0003 \u0001(\u0005\u0012\u000f\n\u0007endTime\u0018\u0004 \u0001(\u0005\u0012\u0012\n\nunlockType\u0018\u0005 \u0001(\u0005\u0012\u001b\n\u0005tasks\u0018\u0006 \u0003(\u000b2\f.common.Task\u0012\u0012\n\nartifactId\u0018\u0007 \u0001(\u0005\"\u0010\n\u000eC2S_Main_11101\"c\n\u0014S2C_MainResult_11102\u00129\n\u0005infos\u0018\u0001 \u0003(\u000b2*.artifactDress.com.gzbz.protobuf.DressInfo\u0012\u0010\n\bisUpdate\u0018\u0002 \u0001(\b\"0\n\u0012C2S_TakeTask_11103\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006taskId\u0018\u0002 \u0002(\u0005\"3\n\u0014S2C_UpdateTask_11104\u0012\u001b\n\u0005tasks\u0018\u0001 \u0003(\u000b2\f.common.Task\"Q\n\u0015S2C_UnlockDress_11106\u00128\n\u0004info\u0018\u0001 \u0002(\u000b2*.artifactDress.com.gzbz.protobuf.DressInfo\"0\n\u0014C2S_Activation_11107\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0002 \u0002(\u0005\"d\n\u001aS2C_ActivationResult_11108\u00128\n\u0004info\u0018\u0001 \u0002(\u000b2*.artifactDress.com.gzbz.protobuf.DressInfo\u0012\f\n\u0004type\u0018\u0002 \u0001(\u0005\"\u001f\n\u0011C2S_Upgrade_11109\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"S\n\u0017S2C_UpgradeResult_11110\u00128\n\u0004info\u0018\u0001 \u0002(\u000b2*.artifactDress.com.gzbz.protobuf.DressInfo\"0\n\u000eC2S_Wear_11111\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nartifactId\u0018\u0002 \u0002(\u0005\"P\n\u0014S2C_WearResult_11112\u00128\n\u0004info\u0018\u0001 \u0002(\u000b2*.artifactDress.com.gzbz.protobuf.DressInfo\"\u001f\n\u0011C2S_Undress_11113\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"S\n\u0017S2C_UndressResult_11114\u00128\n\u0004info\u0018\u0001 \u0002(\u000b2*.artifactDress.com.gzbz.protobuf.DressInfo\"!\n\u000fC2S_Smelt_11115\u0012\u000e\n\u0006itemId\u0018\u0002 \u0002(\u0005\".\n\u000fS2C_Smelt_11116\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\"N\n\u0012S2C_UseDress_11118\u00128\n\u0004info\u0018\u0001 \u0002(\u000b2*.artifactDress.com.gzbz.protobuf.DressInfoB'\n\u0011com.gzbz.protobufB\u0010ArtifactDressMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_artifactDress_com_gzbz_protobuf_DressInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_artifactDress_com_gzbz_protobuf_DressInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactDress_com_gzbz_protobuf_DressInfo_descriptor, new String[]{"Id", "Unlock", "Lv", "EndTime", "UnlockType", "Tasks", "ArtifactId"});
      internal_static_artifactDress_com_gzbz_protobuf_C2S_Main_11101_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_artifactDress_com_gzbz_protobuf_C2S_Main_11101_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactDress_com_gzbz_protobuf_C2S_Main_11101_descriptor, new String[0]);
      internal_static_artifactDress_com_gzbz_protobuf_S2C_MainResult_11102_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_artifactDress_com_gzbz_protobuf_S2C_MainResult_11102_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactDress_com_gzbz_protobuf_S2C_MainResult_11102_descriptor, new String[]{"Infos", "IsUpdate"});
      internal_static_artifactDress_com_gzbz_protobuf_C2S_TakeTask_11103_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_artifactDress_com_gzbz_protobuf_C2S_TakeTask_11103_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactDress_com_gzbz_protobuf_C2S_TakeTask_11103_descriptor, new String[]{"Id", "TaskId"});
      internal_static_artifactDress_com_gzbz_protobuf_S2C_UpdateTask_11104_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_artifactDress_com_gzbz_protobuf_S2C_UpdateTask_11104_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactDress_com_gzbz_protobuf_S2C_UpdateTask_11104_descriptor, new String[]{"Tasks"});
      internal_static_artifactDress_com_gzbz_protobuf_S2C_UnlockDress_11106_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_artifactDress_com_gzbz_protobuf_S2C_UnlockDress_11106_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactDress_com_gzbz_protobuf_S2C_UnlockDress_11106_descriptor, new String[]{"Info"});
      internal_static_artifactDress_com_gzbz_protobuf_C2S_Activation_11107_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_artifactDress_com_gzbz_protobuf_C2S_Activation_11107_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactDress_com_gzbz_protobuf_C2S_Activation_11107_descriptor, new String[]{"Id", "Type"});
      internal_static_artifactDress_com_gzbz_protobuf_S2C_ActivationResult_11108_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_artifactDress_com_gzbz_protobuf_S2C_ActivationResult_11108_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactDress_com_gzbz_protobuf_S2C_ActivationResult_11108_descriptor, new String[]{"Info", "Type"});
      internal_static_artifactDress_com_gzbz_protobuf_C2S_Upgrade_11109_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_artifactDress_com_gzbz_protobuf_C2S_Upgrade_11109_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactDress_com_gzbz_protobuf_C2S_Upgrade_11109_descriptor, new String[]{"Id"});
      internal_static_artifactDress_com_gzbz_protobuf_S2C_UpgradeResult_11110_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_artifactDress_com_gzbz_protobuf_S2C_UpgradeResult_11110_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactDress_com_gzbz_protobuf_S2C_UpgradeResult_11110_descriptor, new String[]{"Info"});
      internal_static_artifactDress_com_gzbz_protobuf_C2S_Wear_11111_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_artifactDress_com_gzbz_protobuf_C2S_Wear_11111_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactDress_com_gzbz_protobuf_C2S_Wear_11111_descriptor, new String[]{"Id", "ArtifactId"});
      internal_static_artifactDress_com_gzbz_protobuf_S2C_WearResult_11112_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_artifactDress_com_gzbz_protobuf_S2C_WearResult_11112_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactDress_com_gzbz_protobuf_S2C_WearResult_11112_descriptor, new String[]{"Info"});
      internal_static_artifactDress_com_gzbz_protobuf_C2S_Undress_11113_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_artifactDress_com_gzbz_protobuf_C2S_Undress_11113_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactDress_com_gzbz_protobuf_C2S_Undress_11113_descriptor, new String[]{"Id"});
      internal_static_artifactDress_com_gzbz_protobuf_S2C_UndressResult_11114_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_artifactDress_com_gzbz_protobuf_S2C_UndressResult_11114_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactDress_com_gzbz_protobuf_S2C_UndressResult_11114_descriptor, new String[]{"Info"});
      internal_static_artifactDress_com_gzbz_protobuf_C2S_Smelt_11115_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_artifactDress_com_gzbz_protobuf_C2S_Smelt_11115_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactDress_com_gzbz_protobuf_C2S_Smelt_11115_descriptor, new String[]{"ItemId"});
      internal_static_artifactDress_com_gzbz_protobuf_S2C_Smelt_11116_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_artifactDress_com_gzbz_protobuf_S2C_Smelt_11116_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactDress_com_gzbz_protobuf_S2C_Smelt_11116_descriptor, new String[]{"Result", "Num"});
      internal_static_artifactDress_com_gzbz_protobuf_S2C_UseDress_11118_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_artifactDress_com_gzbz_protobuf_S2C_UseDress_11118_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifactDress_com_gzbz_protobuf_S2C_UseDress_11118_descriptor, new String[]{"Info"});
      CommonMsg.getDescriptor();
   }

   public static final class DressInfo extends GeneratedMessageV3 implements DressInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int UNLOCK_FIELD_NUMBER = 2;
      private int unlock_;
      public static final int LV_FIELD_NUMBER = 3;
      private int lv_;
      public static final int ENDTIME_FIELD_NUMBER = 4;
      private int endTime_;
      public static final int UNLOCKTYPE_FIELD_NUMBER = 5;
      private int unlockType_;
      public static final int TASKS_FIELD_NUMBER = 6;
      private List<CommonMsg.Task> tasks_;
      public static final int ARTIFACTID_FIELD_NUMBER = 7;
      private int artifactId_;
      private byte memoizedIsInitialized;
      private static final DressInfo DEFAULT_INSTANCE = new DressInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<DressInfo> PARSER = new AbstractParser<DressInfo>() {
         public DressInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new DressInfo(input, extensionRegistry);
         }
      };

      private DressInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private DressInfo() {
         this.memoizedIsInitialized = -1;
         this.tasks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new DressInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private DressInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.unlock_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.lv_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.endTime_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.unlockType_ = input.readInt32();
                        break;
                     case 50:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.tasks_ = new ArrayList();
                           mutable_bitField0_ |= 32;
                        }

                        this.tasks_.add(input.readMessage(CommonMsg.Task.PARSER, extensionRegistry));
                        break;
                     case 56:
                        this.bitField0_ |= 32;
                        this.artifactId_ = input.readInt32();
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
               if ((mutable_bitField0_ & 32) != 0) {
                  this.tasks_ = Collections.unmodifiableList(this.tasks_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_DressInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_DressInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(DressInfo.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasUnlock() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getUnlock() {
         return this.unlock_;
      }

      public boolean hasLv() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public boolean hasUnlockType() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getUnlockType() {
         return this.unlockType_;
      }

      public List<CommonMsg.Task> getTasksList() {
         return this.tasks_;
      }

      public List<? extends CommonMsg.TaskOrBuilder> getTasksOrBuilderList() {
         return this.tasks_;
      }

      public int getTasksCount() {
         return this.tasks_.size();
      }

      public CommonMsg.Task getTasks(int index) {
         return (CommonMsg.Task)this.tasks_.get(index);
      }

      public CommonMsg.TaskOrBuilder getTasksOrBuilder(int index) {
         return (CommonMsg.TaskOrBuilder)this.tasks_.get(index);
      }

      public boolean hasArtifactId() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getArtifactId() {
         return this.artifactId_;
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
         } else if (!this.hasUnlock()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getTasksCount(); ++i) {
               if (!this.getTasks(i).isInitialized()) {
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
            output.writeInt32(1, this.id_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.unlock_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.lv_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.endTime_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.unlockType_);
         }

         for(int i = 0; i < this.tasks_.size(); ++i) {
            output.writeMessage(6, (MessageLite)this.tasks_.get(i));
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(7, this.artifactId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.unlock_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.lv_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.endTime_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.unlockType_);
            }

            for(int i = 0; i < this.tasks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(6, (MessageLite)this.tasks_.get(i));
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.artifactId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof DressInfo)) {
            return super.equals(obj);
         } else {
            DressInfo other = (DressInfo)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasUnlock() != other.hasUnlock()) {
               return false;
            } else if (this.hasUnlock() && this.getUnlock() != other.getUnlock()) {
               return false;
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasUnlockType() != other.hasUnlockType()) {
               return false;
            } else if (this.hasUnlockType() && this.getUnlockType() != other.getUnlockType()) {
               return false;
            } else if (!this.getTasksList().equals(other.getTasksList())) {
               return false;
            } else if (this.hasArtifactId() != other.hasArtifactId()) {
               return false;
            } else if (this.hasArtifactId() && this.getArtifactId() != other.getArtifactId()) {
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

            if (this.hasUnlock()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getUnlock();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLv();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.hasUnlockType()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getUnlockType();
            }

            if (this.getTasksCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getTasksList().hashCode();
            }

            if (this.hasArtifactId()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getArtifactId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static DressInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (DressInfo)PARSER.parseFrom(data);
      }

      public static DressInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DressInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DressInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (DressInfo)PARSER.parseFrom(data);
      }

      public static DressInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DressInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DressInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (DressInfo)PARSER.parseFrom(data);
      }

      public static DressInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DressInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DressInfo parseFrom(InputStream input) throws IOException {
         return (DressInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static DressInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DressInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static DressInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (DressInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static DressInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DressInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static DressInfo parseFrom(CodedInputStream input) throws IOException {
         return (DressInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static DressInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DressInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(DressInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static DressInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<DressInfo> parser() {
         return PARSER;
      }

      public Parser<DressInfo> getParserForType() {
         return PARSER;
      }

      public DressInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DressInfoOrBuilder {
         private int bitField0_;
         private int id_;
         private int unlock_;
         private int lv_;
         private int endTime_;
         private int unlockType_;
         private List<CommonMsg.Task> tasks_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> tasksBuilder_;
         private int artifactId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_DressInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_DressInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(DressInfo.class, Builder.class);
         }

         private Builder() {
            this.tasks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.tasks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactDressMsg.DressInfo.alwaysUseFieldBuilders) {
               this.getTasksFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.unlock_ = 0;
            this.bitField0_ &= -3;
            this.lv_ = 0;
            this.bitField0_ &= -5;
            this.endTime_ = 0;
            this.bitField0_ &= -9;
            this.unlockType_ = 0;
            this.bitField0_ &= -17;
            if (this.tasksBuilder_ == null) {
               this.tasks_ = Collections.emptyList();
               this.bitField0_ &= -33;
            } else {
               this.tasksBuilder_.clear();
            }

            this.artifactId_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_DressInfo_descriptor;
         }

         public DressInfo getDefaultInstanceForType() {
            return ArtifactDressMsg.DressInfo.getDefaultInstance();
         }

         public DressInfo build() {
            DressInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public DressInfo buildPartial() {
            DressInfo result = new DressInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.unlock_ = this.unlock_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.lv_ = this.lv_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.unlockType_ = this.unlockType_;
               to_bitField0_ |= 16;
            }

            if (this.tasksBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0) {
                  this.tasks_ = Collections.unmodifiableList(this.tasks_);
                  this.bitField0_ &= -33;
               }

               result.tasks_ = this.tasks_;
            } else {
               result.tasks_ = this.tasksBuilder_.build();
            }

            if ((from_bitField0_ & 64) != 0) {
               result.artifactId_ = this.artifactId_;
               to_bitField0_ |= 32;
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
            if (other instanceof DressInfo) {
               return this.mergeFrom((DressInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(DressInfo other) {
            if (other == ArtifactDressMsg.DressInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasUnlock()) {
                  this.setUnlock(other.getUnlock());
               }

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasUnlockType()) {
                  this.setUnlockType(other.getUnlockType());
               }

               if (this.tasksBuilder_ == null) {
                  if (!other.tasks_.isEmpty()) {
                     if (this.tasks_.isEmpty()) {
                        this.tasks_ = other.tasks_;
                        this.bitField0_ &= -33;
                     } else {
                        this.ensureTasksIsMutable();
                        this.tasks_.addAll(other.tasks_);
                     }

                     this.onChanged();
                  }
               } else if (!other.tasks_.isEmpty()) {
                  if (this.tasksBuilder_.isEmpty()) {
                     this.tasksBuilder_.dispose();
                     this.tasksBuilder_ = null;
                     this.tasks_ = other.tasks_;
                     this.bitField0_ &= -33;
                     this.tasksBuilder_ = ArtifactDressMsg.DressInfo.alwaysUseFieldBuilders ? this.getTasksFieldBuilder() : null;
                  } else {
                     this.tasksBuilder_.addAllMessages(other.tasks_);
                  }
               }

               if (other.hasArtifactId()) {
                  this.setArtifactId(other.getArtifactId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else if (!this.hasUnlock()) {
               return false;
            } else {
               for(int i = 0; i < this.getTasksCount(); ++i) {
                  if (!this.getTasks(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            DressInfo parsedMessage = null;

            try {
               parsedMessage = (DressInfo)ArtifactDressMsg.DressInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (DressInfo)e.getUnfinishedMessage();
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

         public boolean hasUnlock() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getUnlock() {
            return this.unlock_;
         }

         public Builder setUnlock(int value) {
            this.bitField0_ |= 2;
            this.unlock_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnlock() {
            this.bitField0_ &= -3;
            this.unlock_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLv() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 4;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -5;
            this.lv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 8;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -9;
            this.endTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnlockType() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getUnlockType() {
            return this.unlockType_;
         }

         public Builder setUnlockType(int value) {
            this.bitField0_ |= 16;
            this.unlockType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnlockType() {
            this.bitField0_ &= -17;
            this.unlockType_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureTasksIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.tasks_ = new ArrayList(this.tasks_);
               this.bitField0_ |= 32;
            }

         }

         public List<CommonMsg.Task> getTasksList() {
            return this.tasksBuilder_ == null ? Collections.unmodifiableList(this.tasks_) : this.tasksBuilder_.getMessageList();
         }

         public int getTasksCount() {
            return this.tasksBuilder_ == null ? this.tasks_.size() : this.tasksBuilder_.getCount();
         }

         public CommonMsg.Task getTasks(int index) {
            return this.tasksBuilder_ == null ? (CommonMsg.Task)this.tasks_.get(index) : (CommonMsg.Task)this.tasksBuilder_.getMessage(index);
         }

         public Builder setTasks(int index, CommonMsg.Task value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.set(index, value);
               this.onChanged();
            } else {
               this.tasksBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTasks(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTasks(CommonMsg.Task value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.add(value);
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTasks(int index, CommonMsg.Task value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.add(index, value);
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTasks(CommonMsg.Task.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTasks(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTasks(Iterable<? extends CommonMsg.Task> values) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.tasks_);
               this.onChanged();
            } else {
               this.tasksBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTasks() {
            if (this.tasksBuilder_ == null) {
               this.tasks_ = Collections.emptyList();
               this.bitField0_ &= -33;
               this.onChanged();
            } else {
               this.tasksBuilder_.clear();
            }

            return this;
         }

         public Builder removeTasks(int index) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.remove(index);
               this.onChanged();
            } else {
               this.tasksBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.Task.Builder getTasksBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTasksFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TaskOrBuilder getTasksOrBuilder(int index) {
            return this.tasksBuilder_ == null ? (CommonMsg.TaskOrBuilder)this.tasks_.get(index) : (CommonMsg.TaskOrBuilder)this.tasksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TaskOrBuilder> getTasksOrBuilderList() {
            return this.tasksBuilder_ != null ? this.tasksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.tasks_);
         }

         public CommonMsg.Task.Builder addTasksBuilder() {
            return (CommonMsg.Task.Builder)this.getTasksFieldBuilder().addBuilder(CommonMsg.Task.getDefaultInstance());
         }

         public CommonMsg.Task.Builder addTasksBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTasksFieldBuilder().addBuilder(index, CommonMsg.Task.getDefaultInstance());
         }

         public List<CommonMsg.Task.Builder> getTasksBuilderList() {
            return this.getTasksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTasksFieldBuilder() {
            if (this.tasksBuilder_ == null) {
               this.tasksBuilder_ = new RepeatedFieldBuilderV3(this.tasks_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean());
               this.tasks_ = null;
            }

            return this.tasksBuilder_;
         }

         public boolean hasArtifactId() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getArtifactId() {
            return this.artifactId_;
         }

         public Builder setArtifactId(int value) {
            this.bitField0_ |= 64;
            this.artifactId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearArtifactId() {
            this.bitField0_ &= -65;
            this.artifactId_ = 0;
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

   public static final class C2S_Main_11101 extends GeneratedMessageV3 implements C2S_Main_11101OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Main_11101 DEFAULT_INSTANCE = new C2S_Main_11101();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Main_11101> PARSER = new AbstractParser<C2S_Main_11101>() {
         public C2S_Main_11101 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Main_11101(input, extensionRegistry);
         }
      };

      private C2S_Main_11101(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Main_11101() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Main_11101();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Main_11101(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Main_11101_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Main_11101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_11101.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Main_11101)) {
            return super.equals(obj);
         } else {
            C2S_Main_11101 other = (C2S_Main_11101)obj;
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

      public static C2S_Main_11101 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Main_11101)PARSER.parseFrom(data);
      }

      public static C2S_Main_11101 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_11101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_11101 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Main_11101)PARSER.parseFrom(data);
      }

      public static C2S_Main_11101 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_11101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_11101 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Main_11101)PARSER.parseFrom(data);
      }

      public static C2S_Main_11101 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_11101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_11101 parseFrom(InputStream input) throws IOException {
         return (C2S_Main_11101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_11101 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_11101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_11101 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Main_11101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Main_11101 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_11101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_11101 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Main_11101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_11101 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_11101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Main_11101 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Main_11101 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Main_11101> parser() {
         return PARSER;
      }

      public Parser<C2S_Main_11101> getParserForType() {
         return PARSER;
      }

      public C2S_Main_11101 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Main_11101OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Main_11101_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Main_11101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_11101.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactDressMsg.C2S_Main_11101.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Main_11101_descriptor;
         }

         public C2S_Main_11101 getDefaultInstanceForType() {
            return ArtifactDressMsg.C2S_Main_11101.getDefaultInstance();
         }

         public C2S_Main_11101 build() {
            C2S_Main_11101 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Main_11101 buildPartial() {
            C2S_Main_11101 result = new C2S_Main_11101(this);
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
            if (other instanceof C2S_Main_11101) {
               return this.mergeFrom((C2S_Main_11101)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Main_11101 other) {
            if (other == ArtifactDressMsg.C2S_Main_11101.getDefaultInstance()) {
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
            C2S_Main_11101 parsedMessage = null;

            try {
               parsedMessage = (C2S_Main_11101)ArtifactDressMsg.C2S_Main_11101.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Main_11101)e.getUnfinishedMessage();
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

   public static final class S2C_MainResult_11102 extends GeneratedMessageV3 implements S2C_MainResult_11102OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<DressInfo> infos_;
      public static final int ISUPDATE_FIELD_NUMBER = 2;
      private boolean isUpdate_;
      private byte memoizedIsInitialized;
      private static final S2C_MainResult_11102 DEFAULT_INSTANCE = new S2C_MainResult_11102();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MainResult_11102> PARSER = new AbstractParser<S2C_MainResult_11102>() {
         public S2C_MainResult_11102 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MainResult_11102(input, extensionRegistry);
         }
      };

      private S2C_MainResult_11102(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MainResult_11102() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MainResult_11102();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MainResult_11102(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.infos_.add(input.readMessage(ArtifactDressMsg.DressInfo.PARSER, extensionRegistry));
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.isUpdate_ = input.readBool();
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
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_MainResult_11102_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_MainResult_11102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MainResult_11102.class, Builder.class);
      }

      public List<DressInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends DressInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public DressInfo getInfos(int index) {
         return (DressInfo)this.infos_.get(index);
      }

      public DressInfoOrBuilder getInfosOrBuilder(int index) {
         return (DressInfoOrBuilder)this.infos_.get(index);
      }

      public boolean hasIsUpdate() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsUpdate() {
         return this.isUpdate_;
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

         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(2, this.isUpdate_);
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
               size += CodedOutputStream.computeBoolSize(2, this.isUpdate_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MainResult_11102)) {
            return super.equals(obj);
         } else {
            S2C_MainResult_11102 other = (S2C_MainResult_11102)obj;
            if (!this.getInfosList().equals(other.getInfosList())) {
               return false;
            } else if (this.hasIsUpdate() != other.hasIsUpdate()) {
               return false;
            } else if (this.hasIsUpdate() && this.getIsUpdate() != other.getIsUpdate()) {
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

            if (this.hasIsUpdate()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsUpdate());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MainResult_11102 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MainResult_11102)PARSER.parseFrom(data);
      }

      public static S2C_MainResult_11102 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MainResult_11102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MainResult_11102 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MainResult_11102)PARSER.parseFrom(data);
      }

      public static S2C_MainResult_11102 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MainResult_11102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MainResult_11102 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MainResult_11102)PARSER.parseFrom(data);
      }

      public static S2C_MainResult_11102 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MainResult_11102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MainResult_11102 parseFrom(InputStream input) throws IOException {
         return (S2C_MainResult_11102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MainResult_11102 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MainResult_11102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MainResult_11102 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MainResult_11102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MainResult_11102 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MainResult_11102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MainResult_11102 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MainResult_11102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MainResult_11102 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MainResult_11102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MainResult_11102 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MainResult_11102 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MainResult_11102> parser() {
         return PARSER;
      }

      public Parser<S2C_MainResult_11102> getParserForType() {
         return PARSER;
      }

      public S2C_MainResult_11102 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MainResult_11102OrBuilder {
         private int bitField0_;
         private List<DressInfo> infos_;
         private RepeatedFieldBuilderV3<DressInfo, DressInfo.Builder, DressInfoOrBuilder> infosBuilder_;
         private boolean isUpdate_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_MainResult_11102_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_MainResult_11102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MainResult_11102.class, Builder.class);
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
            if (ArtifactDressMsg.S2C_MainResult_11102.alwaysUseFieldBuilders) {
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

            this.isUpdate_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_MainResult_11102_descriptor;
         }

         public S2C_MainResult_11102 getDefaultInstanceForType() {
            return ArtifactDressMsg.S2C_MainResult_11102.getDefaultInstance();
         }

         public S2C_MainResult_11102 build() {
            S2C_MainResult_11102 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MainResult_11102 buildPartial() {
            S2C_MainResult_11102 result = new S2C_MainResult_11102(this);
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
               result.isUpdate_ = this.isUpdate_;
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
            if (other instanceof S2C_MainResult_11102) {
               return this.mergeFrom((S2C_MainResult_11102)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MainResult_11102 other) {
            if (other == ArtifactDressMsg.S2C_MainResult_11102.getDefaultInstance()) {
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
                     this.infosBuilder_ = ArtifactDressMsg.S2C_MainResult_11102.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               if (other.hasIsUpdate()) {
                  this.setIsUpdate(other.getIsUpdate());
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
            S2C_MainResult_11102 parsedMessage = null;

            try {
               parsedMessage = (S2C_MainResult_11102)ArtifactDressMsg.S2C_MainResult_11102.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MainResult_11102)e.getUnfinishedMessage();
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

         public List<DressInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public DressInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (DressInfo)this.infos_.get(index) : (DressInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, DressInfo value) {
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

         public Builder setInfos(int index, DressInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(DressInfo value) {
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

         public Builder addInfos(int index, DressInfo value) {
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

         public Builder addInfos(DressInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, DressInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends DressInfo> values) {
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

         public DressInfo.Builder getInfosBuilder(int index) {
            return (DressInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public DressInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (DressInfoOrBuilder)this.infos_.get(index) : (DressInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends DressInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public DressInfo.Builder addInfosBuilder() {
            return (DressInfo.Builder)this.getInfosFieldBuilder().addBuilder(ArtifactDressMsg.DressInfo.getDefaultInstance());
         }

         public DressInfo.Builder addInfosBuilder(int index) {
            return (DressInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, ArtifactDressMsg.DressInfo.getDefaultInstance());
         }

         public List<DressInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<DressInfo, DressInfo.Builder, DressInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         public boolean hasIsUpdate() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsUpdate() {
            return this.isUpdate_;
         }

         public Builder setIsUpdate(boolean value) {
            this.bitField0_ |= 2;
            this.isUpdate_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsUpdate() {
            this.bitField0_ &= -3;
            this.isUpdate_ = false;
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

   public static final class C2S_TakeTask_11103 extends GeneratedMessageV3 implements C2S_TakeTask_11103OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int TASKID_FIELD_NUMBER = 2;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_TakeTask_11103 DEFAULT_INSTANCE = new C2S_TakeTask_11103();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TakeTask_11103> PARSER = new AbstractParser<C2S_TakeTask_11103>() {
         public C2S_TakeTask_11103 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TakeTask_11103(input, extensionRegistry);
         }
      };

      private C2S_TakeTask_11103(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TakeTask_11103() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TakeTask_11103();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TakeTask_11103(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_TakeTask_11103_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_TakeTask_11103_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeTask_11103.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasTaskId() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasId()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.id_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.taskId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.taskId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TakeTask_11103)) {
            return super.equals(obj);
         } else {
            C2S_TakeTask_11103 other = (C2S_TakeTask_11103)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasTaskId() != other.hasTaskId()) {
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
            if (this.hasId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getId();
            }

            if (this.hasTaskId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTaskId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TakeTask_11103 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TakeTask_11103)PARSER.parseFrom(data);
      }

      public static C2S_TakeTask_11103 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeTask_11103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeTask_11103 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TakeTask_11103)PARSER.parseFrom(data);
      }

      public static C2S_TakeTask_11103 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeTask_11103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeTask_11103 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TakeTask_11103)PARSER.parseFrom(data);
      }

      public static C2S_TakeTask_11103 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeTask_11103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeTask_11103 parseFrom(InputStream input) throws IOException {
         return (C2S_TakeTask_11103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeTask_11103 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeTask_11103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeTask_11103 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TakeTask_11103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TakeTask_11103 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeTask_11103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeTask_11103 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TakeTask_11103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeTask_11103 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeTask_11103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TakeTask_11103 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TakeTask_11103 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TakeTask_11103> parser() {
         return PARSER;
      }

      public Parser<C2S_TakeTask_11103> getParserForType() {
         return PARSER;
      }

      public C2S_TakeTask_11103 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TakeTask_11103OrBuilder {
         private int bitField0_;
         private int id_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_TakeTask_11103_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_TakeTask_11103_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeTask_11103.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactDressMsg.C2S_TakeTask_11103.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.taskId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_TakeTask_11103_descriptor;
         }

         public C2S_TakeTask_11103 getDefaultInstanceForType() {
            return ArtifactDressMsg.C2S_TakeTask_11103.getDefaultInstance();
         }

         public C2S_TakeTask_11103 build() {
            C2S_TakeTask_11103 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TakeTask_11103 buildPartial() {
            C2S_TakeTask_11103 result = new C2S_TakeTask_11103(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.taskId_ = this.taskId_;
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
            if (other instanceof C2S_TakeTask_11103) {
               return this.mergeFrom((C2S_TakeTask_11103)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TakeTask_11103 other) {
            if (other == ArtifactDressMsg.C2S_TakeTask_11103.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasTaskId()) {
                  this.setTaskId(other.getTaskId());
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
               return this.hasTaskId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TakeTask_11103 parsedMessage = null;

            try {
               parsedMessage = (C2S_TakeTask_11103)ArtifactDressMsg.C2S_TakeTask_11103.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TakeTask_11103)e.getUnfinishedMessage();
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

         public boolean hasTaskId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTaskId() {
            return this.taskId_;
         }

         public Builder setTaskId(int value) {
            this.bitField0_ |= 2;
            this.taskId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskId() {
            this.bitField0_ &= -3;
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

   public static final class S2C_UpdateTask_11104 extends GeneratedMessageV3 implements S2C_UpdateTask_11104OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASKS_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> tasks_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateTask_11104 DEFAULT_INSTANCE = new S2C_UpdateTask_11104();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateTask_11104> PARSER = new AbstractParser<S2C_UpdateTask_11104>() {
         public S2C_UpdateTask_11104 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateTask_11104(input, extensionRegistry);
         }
      };

      private S2C_UpdateTask_11104(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateTask_11104() {
         this.memoizedIsInitialized = -1;
         this.tasks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateTask_11104();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateTask_11104(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.tasks_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.tasks_.add(input.readMessage(CommonMsg.Task.PARSER, extensionRegistry));
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
                  this.tasks_ = Collections.unmodifiableList(this.tasks_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UpdateTask_11104_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UpdateTask_11104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateTask_11104.class, Builder.class);
      }

      public List<CommonMsg.Task> getTasksList() {
         return this.tasks_;
      }

      public List<? extends CommonMsg.TaskOrBuilder> getTasksOrBuilderList() {
         return this.tasks_;
      }

      public int getTasksCount() {
         return this.tasks_.size();
      }

      public CommonMsg.Task getTasks(int index) {
         return (CommonMsg.Task)this.tasks_.get(index);
      }

      public CommonMsg.TaskOrBuilder getTasksOrBuilder(int index) {
         return (CommonMsg.TaskOrBuilder)this.tasks_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTasksCount(); ++i) {
               if (!this.getTasks(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.tasks_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.tasks_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.tasks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.tasks_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpdateTask_11104)) {
            return super.equals(obj);
         } else {
            S2C_UpdateTask_11104 other = (S2C_UpdateTask_11104)obj;
            if (!this.getTasksList().equals(other.getTasksList())) {
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
            if (this.getTasksCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTasksList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpdateTask_11104 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_11104)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTask_11104 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_11104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTask_11104 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_11104)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTask_11104 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_11104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTask_11104 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_11104)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTask_11104 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_11104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTask_11104 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateTask_11104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateTask_11104 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTask_11104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateTask_11104 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateTask_11104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateTask_11104 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTask_11104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateTask_11104 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateTask_11104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateTask_11104 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTask_11104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateTask_11104 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateTask_11104 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateTask_11104> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateTask_11104> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateTask_11104 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateTask_11104OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> tasks_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> tasksBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UpdateTask_11104_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UpdateTask_11104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateTask_11104.class, Builder.class);
         }

         private Builder() {
            this.tasks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.tasks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactDressMsg.S2C_UpdateTask_11104.alwaysUseFieldBuilders) {
               this.getTasksFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.tasksBuilder_ == null) {
               this.tasks_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.tasksBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UpdateTask_11104_descriptor;
         }

         public S2C_UpdateTask_11104 getDefaultInstanceForType() {
            return ArtifactDressMsg.S2C_UpdateTask_11104.getDefaultInstance();
         }

         public S2C_UpdateTask_11104 build() {
            S2C_UpdateTask_11104 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateTask_11104 buildPartial() {
            S2C_UpdateTask_11104 result = new S2C_UpdateTask_11104(this);
            int from_bitField0_ = this.bitField0_;
            if (this.tasksBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.tasks_ = Collections.unmodifiableList(this.tasks_);
                  this.bitField0_ &= -2;
               }

               result.tasks_ = this.tasks_;
            } else {
               result.tasks_ = this.tasksBuilder_.build();
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
            if (other instanceof S2C_UpdateTask_11104) {
               return this.mergeFrom((S2C_UpdateTask_11104)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateTask_11104 other) {
            if (other == ArtifactDressMsg.S2C_UpdateTask_11104.getDefaultInstance()) {
               return this;
            } else {
               if (this.tasksBuilder_ == null) {
                  if (!other.tasks_.isEmpty()) {
                     if (this.tasks_.isEmpty()) {
                        this.tasks_ = other.tasks_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTasksIsMutable();
                        this.tasks_.addAll(other.tasks_);
                     }

                     this.onChanged();
                  }
               } else if (!other.tasks_.isEmpty()) {
                  if (this.tasksBuilder_.isEmpty()) {
                     this.tasksBuilder_.dispose();
                     this.tasksBuilder_ = null;
                     this.tasks_ = other.tasks_;
                     this.bitField0_ &= -2;
                     this.tasksBuilder_ = ArtifactDressMsg.S2C_UpdateTask_11104.alwaysUseFieldBuilders ? this.getTasksFieldBuilder() : null;
                  } else {
                     this.tasksBuilder_.addAllMessages(other.tasks_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTasksCount(); ++i) {
               if (!this.getTasks(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpdateTask_11104 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateTask_11104)ArtifactDressMsg.S2C_UpdateTask_11104.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateTask_11104)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTasksIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.tasks_ = new ArrayList(this.tasks_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.Task> getTasksList() {
            return this.tasksBuilder_ == null ? Collections.unmodifiableList(this.tasks_) : this.tasksBuilder_.getMessageList();
         }

         public int getTasksCount() {
            return this.tasksBuilder_ == null ? this.tasks_.size() : this.tasksBuilder_.getCount();
         }

         public CommonMsg.Task getTasks(int index) {
            return this.tasksBuilder_ == null ? (CommonMsg.Task)this.tasks_.get(index) : (CommonMsg.Task)this.tasksBuilder_.getMessage(index);
         }

         public Builder setTasks(int index, CommonMsg.Task value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.set(index, value);
               this.onChanged();
            } else {
               this.tasksBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTasks(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTasks(CommonMsg.Task value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.add(value);
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTasks(int index, CommonMsg.Task value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.add(index, value);
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTasks(CommonMsg.Task.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTasks(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTasks(Iterable<? extends CommonMsg.Task> values) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.tasks_);
               this.onChanged();
            } else {
               this.tasksBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTasks() {
            if (this.tasksBuilder_ == null) {
               this.tasks_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.tasksBuilder_.clear();
            }

            return this;
         }

         public Builder removeTasks(int index) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.remove(index);
               this.onChanged();
            } else {
               this.tasksBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.Task.Builder getTasksBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTasksFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TaskOrBuilder getTasksOrBuilder(int index) {
            return this.tasksBuilder_ == null ? (CommonMsg.TaskOrBuilder)this.tasks_.get(index) : (CommonMsg.TaskOrBuilder)this.tasksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TaskOrBuilder> getTasksOrBuilderList() {
            return this.tasksBuilder_ != null ? this.tasksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.tasks_);
         }

         public CommonMsg.Task.Builder addTasksBuilder() {
            return (CommonMsg.Task.Builder)this.getTasksFieldBuilder().addBuilder(CommonMsg.Task.getDefaultInstance());
         }

         public CommonMsg.Task.Builder addTasksBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTasksFieldBuilder().addBuilder(index, CommonMsg.Task.getDefaultInstance());
         }

         public List<CommonMsg.Task.Builder> getTasksBuilderList() {
            return this.getTasksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTasksFieldBuilder() {
            if (this.tasksBuilder_ == null) {
               this.tasksBuilder_ = new RepeatedFieldBuilderV3(this.tasks_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.tasks_ = null;
            }

            return this.tasksBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_UnlockDress_11106 extends GeneratedMessageV3 implements S2C_UnlockDress_11106OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private DressInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_UnlockDress_11106 DEFAULT_INSTANCE = new S2C_UnlockDress_11106();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UnlockDress_11106> PARSER = new AbstractParser<S2C_UnlockDress_11106>() {
         public S2C_UnlockDress_11106 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UnlockDress_11106(input, extensionRegistry);
         }
      };

      private S2C_UnlockDress_11106(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UnlockDress_11106() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UnlockDress_11106();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UnlockDress_11106(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        DressInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (DressInfo)input.readMessage(ArtifactDressMsg.DressInfo.PARSER, extensionRegistry);
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
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UnlockDress_11106_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UnlockDress_11106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockDress_11106.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public DressInfo getInfo() {
         return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
      }

      public DressInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
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
            output.writeMessage(1, this.getInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UnlockDress_11106)) {
            return super.equals(obj);
         } else {
            S2C_UnlockDress_11106 other = (S2C_UnlockDress_11106)obj;
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
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UnlockDress_11106 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UnlockDress_11106)PARSER.parseFrom(data);
      }

      public static S2C_UnlockDress_11106 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockDress_11106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockDress_11106 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UnlockDress_11106)PARSER.parseFrom(data);
      }

      public static S2C_UnlockDress_11106 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockDress_11106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockDress_11106 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UnlockDress_11106)PARSER.parseFrom(data);
      }

      public static S2C_UnlockDress_11106 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockDress_11106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockDress_11106 parseFrom(InputStream input) throws IOException {
         return (S2C_UnlockDress_11106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockDress_11106 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockDress_11106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockDress_11106 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UnlockDress_11106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UnlockDress_11106 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockDress_11106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockDress_11106 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UnlockDress_11106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockDress_11106 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockDress_11106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UnlockDress_11106 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UnlockDress_11106 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UnlockDress_11106> parser() {
         return PARSER;
      }

      public Parser<S2C_UnlockDress_11106> getParserForType() {
         return PARSER;
      }

      public S2C_UnlockDress_11106 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UnlockDress_11106OrBuilder {
         private int bitField0_;
         private DressInfo info_;
         private SingleFieldBuilderV3<DressInfo, DressInfo.Builder, DressInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UnlockDress_11106_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UnlockDress_11106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockDress_11106.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactDressMsg.S2C_UnlockDress_11106.alwaysUseFieldBuilders) {
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
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UnlockDress_11106_descriptor;
         }

         public S2C_UnlockDress_11106 getDefaultInstanceForType() {
            return ArtifactDressMsg.S2C_UnlockDress_11106.getDefaultInstance();
         }

         public S2C_UnlockDress_11106 build() {
            S2C_UnlockDress_11106 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UnlockDress_11106 buildPartial() {
            S2C_UnlockDress_11106 result = new S2C_UnlockDress_11106(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (DressInfo)this.infoBuilder_.build();
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
            if (other instanceof S2C_UnlockDress_11106) {
               return this.mergeFrom((S2C_UnlockDress_11106)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UnlockDress_11106 other) {
            if (other == ArtifactDressMsg.S2C_UnlockDress_11106.getDefaultInstance()) {
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
            S2C_UnlockDress_11106 parsedMessage = null;

            try {
               parsedMessage = (S2C_UnlockDress_11106)ArtifactDressMsg.S2C_UnlockDress_11106.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UnlockDress_11106)e.getUnfinishedMessage();
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

         public DressInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
            } else {
               return (DressInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(DressInfo value) {
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

         public Builder setInfo(DressInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(DressInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != ArtifactDressMsg.DressInfo.getDefaultInstance()) {
                  this.info_ = ArtifactDressMsg.DressInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public DressInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (DressInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public DressInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (DressInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<DressInfo, DressInfo.Builder, DressInfoOrBuilder> getInfoFieldBuilder() {
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

   public static final class C2S_Activation_11107 extends GeneratedMessageV3 implements C2S_Activation_11107OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_Activation_11107 DEFAULT_INSTANCE = new C2S_Activation_11107();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Activation_11107> PARSER = new AbstractParser<C2S_Activation_11107>() {
         public C2S_Activation_11107 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Activation_11107(input, extensionRegistry);
         }
      };

      private C2S_Activation_11107(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Activation_11107() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Activation_11107();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Activation_11107(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.type_ = input.readInt32();
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
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Activation_11107_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Activation_11107_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Activation_11107.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getType() {
         return this.type_;
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
            output.writeInt32(1, this.id_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.type_);
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
               size += CodedOutputStream.computeInt32Size(2, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Activation_11107)) {
            return super.equals(obj);
         } else {
            C2S_Activation_11107 other = (C2S_Activation_11107)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
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

            if (this.hasType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Activation_11107 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Activation_11107)PARSER.parseFrom(data);
      }

      public static C2S_Activation_11107 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Activation_11107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Activation_11107 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Activation_11107)PARSER.parseFrom(data);
      }

      public static C2S_Activation_11107 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Activation_11107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Activation_11107 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Activation_11107)PARSER.parseFrom(data);
      }

      public static C2S_Activation_11107 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Activation_11107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Activation_11107 parseFrom(InputStream input) throws IOException {
         return (C2S_Activation_11107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Activation_11107 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Activation_11107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Activation_11107 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Activation_11107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Activation_11107 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Activation_11107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Activation_11107 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Activation_11107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Activation_11107 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Activation_11107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Activation_11107 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Activation_11107 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Activation_11107> parser() {
         return PARSER;
      }

      public Parser<C2S_Activation_11107> getParserForType() {
         return PARSER;
      }

      public C2S_Activation_11107 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Activation_11107OrBuilder {
         private int bitField0_;
         private int id_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Activation_11107_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Activation_11107_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Activation_11107.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactDressMsg.C2S_Activation_11107.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Activation_11107_descriptor;
         }

         public C2S_Activation_11107 getDefaultInstanceForType() {
            return ArtifactDressMsg.C2S_Activation_11107.getDefaultInstance();
         }

         public C2S_Activation_11107 build() {
            C2S_Activation_11107 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Activation_11107 buildPartial() {
            C2S_Activation_11107 result = new C2S_Activation_11107(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof C2S_Activation_11107) {
               return this.mergeFrom((C2S_Activation_11107)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Activation_11107 other) {
            if (other == ArtifactDressMsg.C2S_Activation_11107.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
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
               return this.hasType();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Activation_11107 parsedMessage = null;

            try {
               parsedMessage = (C2S_Activation_11107)ArtifactDressMsg.C2S_Activation_11107.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Activation_11107)e.getUnfinishedMessage();
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

         public boolean hasType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 2;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -3;
            this.type_ = 0;
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

   public static final class S2C_ActivationResult_11108 extends GeneratedMessageV3 implements S2C_ActivationResult_11108OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private DressInfo info_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivationResult_11108 DEFAULT_INSTANCE = new S2C_ActivationResult_11108();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivationResult_11108> PARSER = new AbstractParser<S2C_ActivationResult_11108>() {
         public S2C_ActivationResult_11108 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivationResult_11108(input, extensionRegistry);
         }
      };

      private S2C_ActivationResult_11108(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivationResult_11108() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivationResult_11108();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivationResult_11108(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        DressInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (DressInfo)input.readMessage(ArtifactDressMsg.DressInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.type_ = input.readInt32();
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
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_ActivationResult_11108_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_ActivationResult_11108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivationResult_11108.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public DressInfo getInfo() {
         return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
      }

      public DressInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getType() {
         return this.type_;
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
            output.writeMessage(1, this.getInfo());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.type_);
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
               size += CodedOutputStream.computeMessageSize(1, this.getInfo());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ActivationResult_11108)) {
            return super.equals(obj);
         } else {
            S2C_ActivationResult_11108 other = (S2C_ActivationResult_11108)obj;
            if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
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
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            if (this.hasType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ActivationResult_11108 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivationResult_11108)PARSER.parseFrom(data);
      }

      public static S2C_ActivationResult_11108 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivationResult_11108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivationResult_11108 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivationResult_11108)PARSER.parseFrom(data);
      }

      public static S2C_ActivationResult_11108 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivationResult_11108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivationResult_11108 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivationResult_11108)PARSER.parseFrom(data);
      }

      public static S2C_ActivationResult_11108 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivationResult_11108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivationResult_11108 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivationResult_11108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivationResult_11108 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivationResult_11108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivationResult_11108 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivationResult_11108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivationResult_11108 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivationResult_11108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivationResult_11108 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivationResult_11108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivationResult_11108 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivationResult_11108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivationResult_11108 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivationResult_11108 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivationResult_11108> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivationResult_11108> getParserForType() {
         return PARSER;
      }

      public S2C_ActivationResult_11108 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivationResult_11108OrBuilder {
         private int bitField0_;
         private DressInfo info_;
         private SingleFieldBuilderV3<DressInfo, DressInfo.Builder, DressInfoOrBuilder> infoBuilder_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_ActivationResult_11108_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_ActivationResult_11108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivationResult_11108.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactDressMsg.S2C_ActivationResult_11108.alwaysUseFieldBuilders) {
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
            this.type_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_ActivationResult_11108_descriptor;
         }

         public S2C_ActivationResult_11108 getDefaultInstanceForType() {
            return ArtifactDressMsg.S2C_ActivationResult_11108.getDefaultInstance();
         }

         public S2C_ActivationResult_11108 build() {
            S2C_ActivationResult_11108 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivationResult_11108 buildPartial() {
            S2C_ActivationResult_11108 result = new S2C_ActivationResult_11108(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (DressInfo)this.infoBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof S2C_ActivationResult_11108) {
               return this.mergeFrom((S2C_ActivationResult_11108)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivationResult_11108 other) {
            if (other == ArtifactDressMsg.S2C_ActivationResult_11108.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
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
            S2C_ActivationResult_11108 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivationResult_11108)ArtifactDressMsg.S2C_ActivationResult_11108.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivationResult_11108)e.getUnfinishedMessage();
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

         public DressInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
            } else {
               return (DressInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(DressInfo value) {
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

         public Builder setInfo(DressInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(DressInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != ArtifactDressMsg.DressInfo.getDefaultInstance()) {
                  this.info_ = ArtifactDressMsg.DressInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public DressInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (DressInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public DressInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (DressInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<DressInfo, DressInfo.Builder, DressInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public boolean hasType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 2;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -3;
            this.type_ = 0;
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

   public static final class C2S_Upgrade_11109 extends GeneratedMessageV3 implements C2S_Upgrade_11109OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_Upgrade_11109 DEFAULT_INSTANCE = new C2S_Upgrade_11109();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Upgrade_11109> PARSER = new AbstractParser<C2S_Upgrade_11109>() {
         public C2S_Upgrade_11109 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Upgrade_11109(input, extensionRegistry);
         }
      };

      private C2S_Upgrade_11109(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Upgrade_11109() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Upgrade_11109();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Upgrade_11109(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Upgrade_11109_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Upgrade_11109_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Upgrade_11109.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Upgrade_11109)) {
            return super.equals(obj);
         } else {
            C2S_Upgrade_11109 other = (C2S_Upgrade_11109)obj;
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

      public static C2S_Upgrade_11109 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_11109)PARSER.parseFrom(data);
      }

      public static C2S_Upgrade_11109 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_11109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Upgrade_11109 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_11109)PARSER.parseFrom(data);
      }

      public static C2S_Upgrade_11109 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_11109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Upgrade_11109 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_11109)PARSER.parseFrom(data);
      }

      public static C2S_Upgrade_11109 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Upgrade_11109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Upgrade_11109 parseFrom(InputStream input) throws IOException {
         return (C2S_Upgrade_11109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Upgrade_11109 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Upgrade_11109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Upgrade_11109 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Upgrade_11109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Upgrade_11109 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Upgrade_11109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Upgrade_11109 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Upgrade_11109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Upgrade_11109 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Upgrade_11109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Upgrade_11109 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Upgrade_11109 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Upgrade_11109> parser() {
         return PARSER;
      }

      public Parser<C2S_Upgrade_11109> getParserForType() {
         return PARSER;
      }

      public C2S_Upgrade_11109 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Upgrade_11109OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Upgrade_11109_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Upgrade_11109_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Upgrade_11109.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactDressMsg.C2S_Upgrade_11109.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Upgrade_11109_descriptor;
         }

         public C2S_Upgrade_11109 getDefaultInstanceForType() {
            return ArtifactDressMsg.C2S_Upgrade_11109.getDefaultInstance();
         }

         public C2S_Upgrade_11109 build() {
            C2S_Upgrade_11109 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Upgrade_11109 buildPartial() {
            C2S_Upgrade_11109 result = new C2S_Upgrade_11109(this);
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
            if (other instanceof C2S_Upgrade_11109) {
               return this.mergeFrom((C2S_Upgrade_11109)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Upgrade_11109 other) {
            if (other == ArtifactDressMsg.C2S_Upgrade_11109.getDefaultInstance()) {
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
            C2S_Upgrade_11109 parsedMessage = null;

            try {
               parsedMessage = (C2S_Upgrade_11109)ArtifactDressMsg.C2S_Upgrade_11109.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Upgrade_11109)e.getUnfinishedMessage();
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

   public static final class S2C_UpgradeResult_11110 extends GeneratedMessageV3 implements S2C_UpgradeResult_11110OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private DressInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_UpgradeResult_11110 DEFAULT_INSTANCE = new S2C_UpgradeResult_11110();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpgradeResult_11110> PARSER = new AbstractParser<S2C_UpgradeResult_11110>() {
         public S2C_UpgradeResult_11110 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpgradeResult_11110(input, extensionRegistry);
         }
      };

      private S2C_UpgradeResult_11110(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpgradeResult_11110() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpgradeResult_11110();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpgradeResult_11110(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        DressInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (DressInfo)input.readMessage(ArtifactDressMsg.DressInfo.PARSER, extensionRegistry);
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
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UpgradeResult_11110_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UpgradeResult_11110_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpgradeResult_11110.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public DressInfo getInfo() {
         return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
      }

      public DressInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
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
            output.writeMessage(1, this.getInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpgradeResult_11110)) {
            return super.equals(obj);
         } else {
            S2C_UpgradeResult_11110 other = (S2C_UpgradeResult_11110)obj;
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
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpgradeResult_11110 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpgradeResult_11110)PARSER.parseFrom(data);
      }

      public static S2C_UpgradeResult_11110 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpgradeResult_11110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpgradeResult_11110 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpgradeResult_11110)PARSER.parseFrom(data);
      }

      public static S2C_UpgradeResult_11110 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpgradeResult_11110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpgradeResult_11110 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpgradeResult_11110)PARSER.parseFrom(data);
      }

      public static S2C_UpgradeResult_11110 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpgradeResult_11110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpgradeResult_11110 parseFrom(InputStream input) throws IOException {
         return (S2C_UpgradeResult_11110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpgradeResult_11110 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpgradeResult_11110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpgradeResult_11110 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpgradeResult_11110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpgradeResult_11110 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpgradeResult_11110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpgradeResult_11110 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpgradeResult_11110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpgradeResult_11110 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpgradeResult_11110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpgradeResult_11110 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpgradeResult_11110 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpgradeResult_11110> parser() {
         return PARSER;
      }

      public Parser<S2C_UpgradeResult_11110> getParserForType() {
         return PARSER;
      }

      public S2C_UpgradeResult_11110 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpgradeResult_11110OrBuilder {
         private int bitField0_;
         private DressInfo info_;
         private SingleFieldBuilderV3<DressInfo, DressInfo.Builder, DressInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UpgradeResult_11110_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UpgradeResult_11110_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpgradeResult_11110.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactDressMsg.S2C_UpgradeResult_11110.alwaysUseFieldBuilders) {
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
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UpgradeResult_11110_descriptor;
         }

         public S2C_UpgradeResult_11110 getDefaultInstanceForType() {
            return ArtifactDressMsg.S2C_UpgradeResult_11110.getDefaultInstance();
         }

         public S2C_UpgradeResult_11110 build() {
            S2C_UpgradeResult_11110 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpgradeResult_11110 buildPartial() {
            S2C_UpgradeResult_11110 result = new S2C_UpgradeResult_11110(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (DressInfo)this.infoBuilder_.build();
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
            if (other instanceof S2C_UpgradeResult_11110) {
               return this.mergeFrom((S2C_UpgradeResult_11110)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpgradeResult_11110 other) {
            if (other == ArtifactDressMsg.S2C_UpgradeResult_11110.getDefaultInstance()) {
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
            S2C_UpgradeResult_11110 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpgradeResult_11110)ArtifactDressMsg.S2C_UpgradeResult_11110.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpgradeResult_11110)e.getUnfinishedMessage();
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

         public DressInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
            } else {
               return (DressInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(DressInfo value) {
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

         public Builder setInfo(DressInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(DressInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != ArtifactDressMsg.DressInfo.getDefaultInstance()) {
                  this.info_ = ArtifactDressMsg.DressInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public DressInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (DressInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public DressInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (DressInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<DressInfo, DressInfo.Builder, DressInfoOrBuilder> getInfoFieldBuilder() {
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

   public static final class C2S_Wear_11111 extends GeneratedMessageV3 implements C2S_Wear_11111OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int ARTIFACTID_FIELD_NUMBER = 2;
      private int artifactId_;
      private byte memoizedIsInitialized;
      private static final C2S_Wear_11111 DEFAULT_INSTANCE = new C2S_Wear_11111();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Wear_11111> PARSER = new AbstractParser<C2S_Wear_11111>() {
         public C2S_Wear_11111 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Wear_11111(input, extensionRegistry);
         }
      };

      private C2S_Wear_11111(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Wear_11111() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Wear_11111();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Wear_11111(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.artifactId_ = input.readInt32();
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
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Wear_11111_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Wear_11111_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Wear_11111.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasArtifactId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getArtifactId() {
         return this.artifactId_;
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
         } else if (!this.hasArtifactId()) {
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
            output.writeInt32(2, this.artifactId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.artifactId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Wear_11111)) {
            return super.equals(obj);
         } else {
            C2S_Wear_11111 other = (C2S_Wear_11111)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasArtifactId() != other.hasArtifactId()) {
               return false;
            } else if (this.hasArtifactId() && this.getArtifactId() != other.getArtifactId()) {
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

            if (this.hasArtifactId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getArtifactId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Wear_11111 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Wear_11111)PARSER.parseFrom(data);
      }

      public static C2S_Wear_11111 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Wear_11111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Wear_11111 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Wear_11111)PARSER.parseFrom(data);
      }

      public static C2S_Wear_11111 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Wear_11111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Wear_11111 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Wear_11111)PARSER.parseFrom(data);
      }

      public static C2S_Wear_11111 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Wear_11111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Wear_11111 parseFrom(InputStream input) throws IOException {
         return (C2S_Wear_11111)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Wear_11111 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Wear_11111)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Wear_11111 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Wear_11111)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Wear_11111 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Wear_11111)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Wear_11111 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Wear_11111)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Wear_11111 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Wear_11111)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Wear_11111 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Wear_11111 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Wear_11111> parser() {
         return PARSER;
      }

      public Parser<C2S_Wear_11111> getParserForType() {
         return PARSER;
      }

      public C2S_Wear_11111 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Wear_11111OrBuilder {
         private int bitField0_;
         private int id_;
         private int artifactId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Wear_11111_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Wear_11111_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Wear_11111.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactDressMsg.C2S_Wear_11111.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.artifactId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Wear_11111_descriptor;
         }

         public C2S_Wear_11111 getDefaultInstanceForType() {
            return ArtifactDressMsg.C2S_Wear_11111.getDefaultInstance();
         }

         public C2S_Wear_11111 build() {
            C2S_Wear_11111 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Wear_11111 buildPartial() {
            C2S_Wear_11111 result = new C2S_Wear_11111(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.artifactId_ = this.artifactId_;
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
            if (other instanceof C2S_Wear_11111) {
               return this.mergeFrom((C2S_Wear_11111)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Wear_11111 other) {
            if (other == ArtifactDressMsg.C2S_Wear_11111.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasArtifactId()) {
                  this.setArtifactId(other.getArtifactId());
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
               return this.hasArtifactId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Wear_11111 parsedMessage = null;

            try {
               parsedMessage = (C2S_Wear_11111)ArtifactDressMsg.C2S_Wear_11111.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Wear_11111)e.getUnfinishedMessage();
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

         public boolean hasArtifactId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getArtifactId() {
            return this.artifactId_;
         }

         public Builder setArtifactId(int value) {
            this.bitField0_ |= 2;
            this.artifactId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearArtifactId() {
            this.bitField0_ &= -3;
            this.artifactId_ = 0;
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

   public static final class S2C_WearResult_11112 extends GeneratedMessageV3 implements S2C_WearResult_11112OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private DressInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_WearResult_11112 DEFAULT_INSTANCE = new S2C_WearResult_11112();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WearResult_11112> PARSER = new AbstractParser<S2C_WearResult_11112>() {
         public S2C_WearResult_11112 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WearResult_11112(input, extensionRegistry);
         }
      };

      private S2C_WearResult_11112(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WearResult_11112() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WearResult_11112();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WearResult_11112(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        DressInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (DressInfo)input.readMessage(ArtifactDressMsg.DressInfo.PARSER, extensionRegistry);
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
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_WearResult_11112_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_WearResult_11112_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WearResult_11112.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public DressInfo getInfo() {
         return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
      }

      public DressInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
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
            output.writeMessage(1, this.getInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WearResult_11112)) {
            return super.equals(obj);
         } else {
            S2C_WearResult_11112 other = (S2C_WearResult_11112)obj;
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
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WearResult_11112 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WearResult_11112)PARSER.parseFrom(data);
      }

      public static S2C_WearResult_11112 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WearResult_11112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WearResult_11112 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WearResult_11112)PARSER.parseFrom(data);
      }

      public static S2C_WearResult_11112 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WearResult_11112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WearResult_11112 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WearResult_11112)PARSER.parseFrom(data);
      }

      public static S2C_WearResult_11112 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WearResult_11112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WearResult_11112 parseFrom(InputStream input) throws IOException {
         return (S2C_WearResult_11112)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WearResult_11112 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WearResult_11112)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WearResult_11112 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WearResult_11112)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WearResult_11112 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WearResult_11112)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WearResult_11112 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WearResult_11112)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WearResult_11112 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WearResult_11112)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WearResult_11112 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WearResult_11112 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WearResult_11112> parser() {
         return PARSER;
      }

      public Parser<S2C_WearResult_11112> getParserForType() {
         return PARSER;
      }

      public S2C_WearResult_11112 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WearResult_11112OrBuilder {
         private int bitField0_;
         private DressInfo info_;
         private SingleFieldBuilderV3<DressInfo, DressInfo.Builder, DressInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_WearResult_11112_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_WearResult_11112_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WearResult_11112.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactDressMsg.S2C_WearResult_11112.alwaysUseFieldBuilders) {
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
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_WearResult_11112_descriptor;
         }

         public S2C_WearResult_11112 getDefaultInstanceForType() {
            return ArtifactDressMsg.S2C_WearResult_11112.getDefaultInstance();
         }

         public S2C_WearResult_11112 build() {
            S2C_WearResult_11112 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WearResult_11112 buildPartial() {
            S2C_WearResult_11112 result = new S2C_WearResult_11112(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (DressInfo)this.infoBuilder_.build();
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
            if (other instanceof S2C_WearResult_11112) {
               return this.mergeFrom((S2C_WearResult_11112)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WearResult_11112 other) {
            if (other == ArtifactDressMsg.S2C_WearResult_11112.getDefaultInstance()) {
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
            S2C_WearResult_11112 parsedMessage = null;

            try {
               parsedMessage = (S2C_WearResult_11112)ArtifactDressMsg.S2C_WearResult_11112.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WearResult_11112)e.getUnfinishedMessage();
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

         public DressInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
            } else {
               return (DressInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(DressInfo value) {
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

         public Builder setInfo(DressInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(DressInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != ArtifactDressMsg.DressInfo.getDefaultInstance()) {
                  this.info_ = ArtifactDressMsg.DressInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public DressInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (DressInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public DressInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (DressInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<DressInfo, DressInfo.Builder, DressInfoOrBuilder> getInfoFieldBuilder() {
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

   public static final class C2S_Undress_11113 extends GeneratedMessageV3 implements C2S_Undress_11113OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_Undress_11113 DEFAULT_INSTANCE = new C2S_Undress_11113();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Undress_11113> PARSER = new AbstractParser<C2S_Undress_11113>() {
         public C2S_Undress_11113 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Undress_11113(input, extensionRegistry);
         }
      };

      private C2S_Undress_11113(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Undress_11113() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Undress_11113();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Undress_11113(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Undress_11113_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Undress_11113_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Undress_11113.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Undress_11113)) {
            return super.equals(obj);
         } else {
            C2S_Undress_11113 other = (C2S_Undress_11113)obj;
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

      public static C2S_Undress_11113 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Undress_11113)PARSER.parseFrom(data);
      }

      public static C2S_Undress_11113 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Undress_11113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Undress_11113 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Undress_11113)PARSER.parseFrom(data);
      }

      public static C2S_Undress_11113 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Undress_11113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Undress_11113 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Undress_11113)PARSER.parseFrom(data);
      }

      public static C2S_Undress_11113 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Undress_11113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Undress_11113 parseFrom(InputStream input) throws IOException {
         return (C2S_Undress_11113)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Undress_11113 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Undress_11113)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Undress_11113 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Undress_11113)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Undress_11113 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Undress_11113)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Undress_11113 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Undress_11113)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Undress_11113 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Undress_11113)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Undress_11113 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Undress_11113 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Undress_11113> parser() {
         return PARSER;
      }

      public Parser<C2S_Undress_11113> getParserForType() {
         return PARSER;
      }

      public C2S_Undress_11113 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Undress_11113OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Undress_11113_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Undress_11113_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Undress_11113.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactDressMsg.C2S_Undress_11113.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Undress_11113_descriptor;
         }

         public C2S_Undress_11113 getDefaultInstanceForType() {
            return ArtifactDressMsg.C2S_Undress_11113.getDefaultInstance();
         }

         public C2S_Undress_11113 build() {
            C2S_Undress_11113 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Undress_11113 buildPartial() {
            C2S_Undress_11113 result = new C2S_Undress_11113(this);
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
            if (other instanceof C2S_Undress_11113) {
               return this.mergeFrom((C2S_Undress_11113)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Undress_11113 other) {
            if (other == ArtifactDressMsg.C2S_Undress_11113.getDefaultInstance()) {
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
            C2S_Undress_11113 parsedMessage = null;

            try {
               parsedMessage = (C2S_Undress_11113)ArtifactDressMsg.C2S_Undress_11113.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Undress_11113)e.getUnfinishedMessage();
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

   public static final class S2C_UndressResult_11114 extends GeneratedMessageV3 implements S2C_UndressResult_11114OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private DressInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_UndressResult_11114 DEFAULT_INSTANCE = new S2C_UndressResult_11114();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UndressResult_11114> PARSER = new AbstractParser<S2C_UndressResult_11114>() {
         public S2C_UndressResult_11114 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UndressResult_11114(input, extensionRegistry);
         }
      };

      private S2C_UndressResult_11114(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UndressResult_11114() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UndressResult_11114();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UndressResult_11114(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        DressInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (DressInfo)input.readMessage(ArtifactDressMsg.DressInfo.PARSER, extensionRegistry);
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
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UndressResult_11114_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UndressResult_11114_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UndressResult_11114.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public DressInfo getInfo() {
         return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
      }

      public DressInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
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
            output.writeMessage(1, this.getInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UndressResult_11114)) {
            return super.equals(obj);
         } else {
            S2C_UndressResult_11114 other = (S2C_UndressResult_11114)obj;
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
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UndressResult_11114 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UndressResult_11114)PARSER.parseFrom(data);
      }

      public static S2C_UndressResult_11114 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UndressResult_11114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UndressResult_11114 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UndressResult_11114)PARSER.parseFrom(data);
      }

      public static S2C_UndressResult_11114 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UndressResult_11114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UndressResult_11114 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UndressResult_11114)PARSER.parseFrom(data);
      }

      public static S2C_UndressResult_11114 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UndressResult_11114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UndressResult_11114 parseFrom(InputStream input) throws IOException {
         return (S2C_UndressResult_11114)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UndressResult_11114 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UndressResult_11114)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UndressResult_11114 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UndressResult_11114)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UndressResult_11114 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UndressResult_11114)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UndressResult_11114 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UndressResult_11114)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UndressResult_11114 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UndressResult_11114)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UndressResult_11114 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UndressResult_11114 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UndressResult_11114> parser() {
         return PARSER;
      }

      public Parser<S2C_UndressResult_11114> getParserForType() {
         return PARSER;
      }

      public S2C_UndressResult_11114 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UndressResult_11114OrBuilder {
         private int bitField0_;
         private DressInfo info_;
         private SingleFieldBuilderV3<DressInfo, DressInfo.Builder, DressInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UndressResult_11114_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UndressResult_11114_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UndressResult_11114.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactDressMsg.S2C_UndressResult_11114.alwaysUseFieldBuilders) {
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
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UndressResult_11114_descriptor;
         }

         public S2C_UndressResult_11114 getDefaultInstanceForType() {
            return ArtifactDressMsg.S2C_UndressResult_11114.getDefaultInstance();
         }

         public S2C_UndressResult_11114 build() {
            S2C_UndressResult_11114 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UndressResult_11114 buildPartial() {
            S2C_UndressResult_11114 result = new S2C_UndressResult_11114(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (DressInfo)this.infoBuilder_.build();
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
            if (other instanceof S2C_UndressResult_11114) {
               return this.mergeFrom((S2C_UndressResult_11114)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UndressResult_11114 other) {
            if (other == ArtifactDressMsg.S2C_UndressResult_11114.getDefaultInstance()) {
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
            S2C_UndressResult_11114 parsedMessage = null;

            try {
               parsedMessage = (S2C_UndressResult_11114)ArtifactDressMsg.S2C_UndressResult_11114.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UndressResult_11114)e.getUnfinishedMessage();
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

         public DressInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
            } else {
               return (DressInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(DressInfo value) {
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

         public Builder setInfo(DressInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(DressInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != ArtifactDressMsg.DressInfo.getDefaultInstance()) {
                  this.info_ = ArtifactDressMsg.DressInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public DressInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (DressInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public DressInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (DressInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<DressInfo, DressInfo.Builder, DressInfoOrBuilder> getInfoFieldBuilder() {
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

   public static final class C2S_Smelt_11115 extends GeneratedMessageV3 implements C2S_Smelt_11115OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMID_FIELD_NUMBER = 2;
      private int itemId_;
      private byte memoizedIsInitialized;
      private static final C2S_Smelt_11115 DEFAULT_INSTANCE = new C2S_Smelt_11115();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Smelt_11115> PARSER = new AbstractParser<C2S_Smelt_11115>() {
         public C2S_Smelt_11115 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Smelt_11115(input, extensionRegistry);
         }
      };

      private C2S_Smelt_11115(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Smelt_11115() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Smelt_11115();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Smelt_11115(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 1;
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
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Smelt_11115_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Smelt_11115_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Smelt_11115.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Smelt_11115)) {
            return super.equals(obj);
         } else {
            C2S_Smelt_11115 other = (C2S_Smelt_11115)obj;
            if (this.hasItemId() != other.hasItemId()) {
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
            if (this.hasItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Smelt_11115 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Smelt_11115)PARSER.parseFrom(data);
      }

      public static C2S_Smelt_11115 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Smelt_11115)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Smelt_11115 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Smelt_11115)PARSER.parseFrom(data);
      }

      public static C2S_Smelt_11115 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Smelt_11115)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Smelt_11115 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Smelt_11115)PARSER.parseFrom(data);
      }

      public static C2S_Smelt_11115 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Smelt_11115)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Smelt_11115 parseFrom(InputStream input) throws IOException {
         return (C2S_Smelt_11115)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Smelt_11115 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Smelt_11115)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Smelt_11115 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Smelt_11115)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Smelt_11115 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Smelt_11115)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Smelt_11115 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Smelt_11115)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Smelt_11115 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Smelt_11115)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Smelt_11115 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Smelt_11115 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Smelt_11115> parser() {
         return PARSER;
      }

      public Parser<C2S_Smelt_11115> getParserForType() {
         return PARSER;
      }

      public C2S_Smelt_11115 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Smelt_11115OrBuilder {
         private int bitField0_;
         private int itemId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Smelt_11115_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Smelt_11115_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Smelt_11115.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactDressMsg.C2S_Smelt_11115.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_C2S_Smelt_11115_descriptor;
         }

         public C2S_Smelt_11115 getDefaultInstanceForType() {
            return ArtifactDressMsg.C2S_Smelt_11115.getDefaultInstance();
         }

         public C2S_Smelt_11115 build() {
            C2S_Smelt_11115 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Smelt_11115 buildPartial() {
            C2S_Smelt_11115 result = new C2S_Smelt_11115(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
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
            if (other instanceof C2S_Smelt_11115) {
               return this.mergeFrom((C2S_Smelt_11115)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Smelt_11115 other) {
            if (other == ArtifactDressMsg.C2S_Smelt_11115.getDefaultInstance()) {
               return this;
            } else {
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
            C2S_Smelt_11115 parsedMessage = null;

            try {
               parsedMessage = (C2S_Smelt_11115)ArtifactDressMsg.C2S_Smelt_11115.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Smelt_11115)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasItemId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getItemId() {
            return this.itemId_;
         }

         public Builder setItemId(int value) {
            this.bitField0_ |= 1;
            this.itemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemId() {
            this.bitField0_ &= -2;
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

   public static final class S2C_Smelt_11116 extends GeneratedMessageV3 implements S2C_Smelt_11116OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final S2C_Smelt_11116 DEFAULT_INSTANCE = new S2C_Smelt_11116();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Smelt_11116> PARSER = new AbstractParser<S2C_Smelt_11116>() {
         public S2C_Smelt_11116 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Smelt_11116(input, extensionRegistry);
         }
      };

      private S2C_Smelt_11116(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Smelt_11116() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Smelt_11116();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Smelt_11116(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_Smelt_11116_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_Smelt_11116_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Smelt_11116.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
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
         } else if (!this.hasResult()) {
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
            output.writeInt32(1, this.result_);
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
               size += CodedOutputStream.computeInt32Size(1, this.result_);
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
         } else if (!(obj instanceof S2C_Smelt_11116)) {
            return super.equals(obj);
         } else {
            S2C_Smelt_11116 other = (S2C_Smelt_11116)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
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

      public static S2C_Smelt_11116 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Smelt_11116)PARSER.parseFrom(data);
      }

      public static S2C_Smelt_11116 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Smelt_11116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Smelt_11116 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Smelt_11116)PARSER.parseFrom(data);
      }

      public static S2C_Smelt_11116 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Smelt_11116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Smelt_11116 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Smelt_11116)PARSER.parseFrom(data);
      }

      public static S2C_Smelt_11116 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Smelt_11116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Smelt_11116 parseFrom(InputStream input) throws IOException {
         return (S2C_Smelt_11116)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Smelt_11116 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Smelt_11116)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Smelt_11116 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Smelt_11116)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Smelt_11116 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Smelt_11116)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Smelt_11116 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Smelt_11116)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Smelt_11116 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Smelt_11116)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Smelt_11116 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Smelt_11116 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Smelt_11116> parser() {
         return PARSER;
      }

      public Parser<S2C_Smelt_11116> getParserForType() {
         return PARSER;
      }

      public S2C_Smelt_11116 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Smelt_11116OrBuilder {
         private int bitField0_;
         private int result_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_Smelt_11116_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_Smelt_11116_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Smelt_11116.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactDressMsg.S2C_Smelt_11116.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_Smelt_11116_descriptor;
         }

         public S2C_Smelt_11116 getDefaultInstanceForType() {
            return ArtifactDressMsg.S2C_Smelt_11116.getDefaultInstance();
         }

         public S2C_Smelt_11116 build() {
            S2C_Smelt_11116 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Smelt_11116 buildPartial() {
            S2C_Smelt_11116 result = new S2C_Smelt_11116(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

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
            if (other instanceof S2C_Smelt_11116) {
               return this.mergeFrom((S2C_Smelt_11116)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Smelt_11116 other) {
            if (other == ArtifactDressMsg.S2C_Smelt_11116.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
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
            if (!this.hasResult()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Smelt_11116 parsedMessage = null;

            try {
               parsedMessage = (S2C_Smelt_11116)ArtifactDressMsg.S2C_Smelt_11116.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Smelt_11116)e.getUnfinishedMessage();
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

   public static final class S2C_UseDress_11118 extends GeneratedMessageV3 implements S2C_UseDress_11118OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private DressInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_UseDress_11118 DEFAULT_INSTANCE = new S2C_UseDress_11118();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UseDress_11118> PARSER = new AbstractParser<S2C_UseDress_11118>() {
         public S2C_UseDress_11118 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UseDress_11118(input, extensionRegistry);
         }
      };

      private S2C_UseDress_11118(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UseDress_11118() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UseDress_11118();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UseDress_11118(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        DressInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (DressInfo)input.readMessage(ArtifactDressMsg.DressInfo.PARSER, extensionRegistry);
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
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UseDress_11118_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UseDress_11118_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UseDress_11118.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public DressInfo getInfo() {
         return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
      }

      public DressInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
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
            output.writeMessage(1, this.getInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UseDress_11118)) {
            return super.equals(obj);
         } else {
            S2C_UseDress_11118 other = (S2C_UseDress_11118)obj;
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
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UseDress_11118 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UseDress_11118)PARSER.parseFrom(data);
      }

      public static S2C_UseDress_11118 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UseDress_11118)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UseDress_11118 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UseDress_11118)PARSER.parseFrom(data);
      }

      public static S2C_UseDress_11118 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UseDress_11118)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UseDress_11118 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UseDress_11118)PARSER.parseFrom(data);
      }

      public static S2C_UseDress_11118 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UseDress_11118)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UseDress_11118 parseFrom(InputStream input) throws IOException {
         return (S2C_UseDress_11118)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UseDress_11118 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UseDress_11118)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UseDress_11118 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UseDress_11118)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UseDress_11118 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UseDress_11118)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UseDress_11118 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UseDress_11118)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UseDress_11118 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UseDress_11118)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UseDress_11118 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UseDress_11118 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UseDress_11118> parser() {
         return PARSER;
      }

      public Parser<S2C_UseDress_11118> getParserForType() {
         return PARSER;
      }

      public S2C_UseDress_11118 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UseDress_11118OrBuilder {
         private int bitField0_;
         private DressInfo info_;
         private SingleFieldBuilderV3<DressInfo, DressInfo.Builder, DressInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UseDress_11118_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UseDress_11118_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UseDress_11118.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactDressMsg.S2C_UseDress_11118.alwaysUseFieldBuilders) {
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
            return ArtifactDressMsg.internal_static_artifactDress_com_gzbz_protobuf_S2C_UseDress_11118_descriptor;
         }

         public S2C_UseDress_11118 getDefaultInstanceForType() {
            return ArtifactDressMsg.S2C_UseDress_11118.getDefaultInstance();
         }

         public S2C_UseDress_11118 build() {
            S2C_UseDress_11118 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UseDress_11118 buildPartial() {
            S2C_UseDress_11118 result = new S2C_UseDress_11118(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (DressInfo)this.infoBuilder_.build();
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
            if (other instanceof S2C_UseDress_11118) {
               return this.mergeFrom((S2C_UseDress_11118)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UseDress_11118 other) {
            if (other == ArtifactDressMsg.S2C_UseDress_11118.getDefaultInstance()) {
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
            S2C_UseDress_11118 parsedMessage = null;

            try {
               parsedMessage = (S2C_UseDress_11118)ArtifactDressMsg.S2C_UseDress_11118.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UseDress_11118)e.getUnfinishedMessage();
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

         public DressInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
            } else {
               return (DressInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(DressInfo value) {
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

         public Builder setInfo(DressInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(DressInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != ArtifactDressMsg.DressInfo.getDefaultInstance()) {
                  this.info_ = ArtifactDressMsg.DressInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public DressInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (DressInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public DressInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (DressInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? ArtifactDressMsg.DressInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<DressInfo, DressInfo.Builder, DressInfoOrBuilder> getInfoFieldBuilder() {
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

   public interface C2S_Activation_11107OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasType();

      int getType();
   }

   public interface C2S_Main_11101OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Smelt_11115OrBuilder extends MessageOrBuilder {
      boolean hasItemId();

      int getItemId();
   }

   public interface C2S_TakeTask_11103OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_Undress_11113OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_Upgrade_11109OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_Wear_11111OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasArtifactId();

      int getArtifactId();
   }

   public interface DressInfoOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasUnlock();

      int getUnlock();

      boolean hasLv();

      int getLv();

      boolean hasEndTime();

      int getEndTime();

      boolean hasUnlockType();

      int getUnlockType();

      List<CommonMsg.Task> getTasksList();

      CommonMsg.Task getTasks(int index);

      int getTasksCount();

      List<? extends CommonMsg.TaskOrBuilder> getTasksOrBuilderList();

      CommonMsg.TaskOrBuilder getTasksOrBuilder(int index);

      boolean hasArtifactId();

      int getArtifactId();
   }

   public interface S2C_ActivationResult_11108OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      DressInfo getInfo();

      DressInfoOrBuilder getInfoOrBuilder();

      boolean hasType();

      int getType();
   }

   public interface S2C_MainResult_11102OrBuilder extends MessageOrBuilder {
      List<DressInfo> getInfosList();

      DressInfo getInfos(int index);

      int getInfosCount();

      List<? extends DressInfoOrBuilder> getInfosOrBuilderList();

      DressInfoOrBuilder getInfosOrBuilder(int index);

      boolean hasIsUpdate();

      boolean getIsUpdate();
   }

   public interface S2C_Smelt_11116OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasNum();

      int getNum();
   }

   public interface S2C_UndressResult_11114OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      DressInfo getInfo();

      DressInfoOrBuilder getInfoOrBuilder();
   }

   public interface S2C_UnlockDress_11106OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      DressInfo getInfo();

      DressInfoOrBuilder getInfoOrBuilder();
   }

   public interface S2C_UpdateTask_11104OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTasksList();

      CommonMsg.Task getTasks(int index);

      int getTasksCount();

      List<? extends CommonMsg.TaskOrBuilder> getTasksOrBuilderList();

      CommonMsg.TaskOrBuilder getTasksOrBuilder(int index);
   }

   public interface S2C_UpgradeResult_11110OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      DressInfo getInfo();

      DressInfoOrBuilder getInfoOrBuilder();
   }

   public interface S2C_UseDress_11118OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      DressInfo getInfo();

      DressInfoOrBuilder getInfoOrBuilder();
   }

   public interface S2C_WearResult_11112OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      DressInfo getInfo();

      DressInfoOrBuilder getInfoOrBuilder();
   }
}
