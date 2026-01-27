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

public final class TreasureMsg {
   private static final Descriptors.Descriptor internal_static_treasure_com_gzbz_protobuf_C2S_GetTreasureInfo_9401_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_treasure_com_gzbz_protobuf_C2S_GetTreasureInfo_9401_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_treasure_com_gzbz_protobuf_S2C_GetTreasureInfo_9402_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_treasure_com_gzbz_protobuf_S2C_GetTreasureInfo_9402_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_treasure_com_gzbz_protobuf_TreasureInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_treasure_com_gzbz_protobuf_TreasureInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_treasure_com_gzbz_protobuf_C2S_UnLockTreasure_9403_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_treasure_com_gzbz_protobuf_C2S_UnLockTreasure_9403_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_treasure_com_gzbz_protobuf_S2C_UnLockTreasure_9404_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_treasure_com_gzbz_protobuf_S2C_UnLockTreasure_9404_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_treasure_com_gzbz_protobuf_C2S_TreasureUpLev_9405_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_treasure_com_gzbz_protobuf_C2S_TreasureUpLev_9405_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_treasure_com_gzbz_protobuf_S2C_TreasureUpLev_9406_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_treasure_com_gzbz_protobuf_S2C_TreasureUpLev_9406_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_treasure_com_gzbz_protobuf_C2S_TreasureUpStage_9407_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_treasure_com_gzbz_protobuf_C2S_TreasureUpStage_9407_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_treasure_com_gzbz_protobuf_S2C_TreasureUpStage_9408_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_treasure_com_gzbz_protobuf_S2C_TreasureUpStage_9408_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_treasure_com_gzbz_protobuf_C2S_TreasureReset_9409_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_treasure_com_gzbz_protobuf_C2S_TreasureReset_9409_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_treasure_com_gzbz_protobuf_S2C_TreasureReset_9410_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_treasure_com_gzbz_protobuf_S2C_TreasureReset_9410_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_treasure_com_gzbz_protobuf_TreasureTransferCostInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_treasure_com_gzbz_protobuf_TreasureTransferCostInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_treasure_com_gzbz_protobuf_C2S_TransferTreasureItem_9411_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_treasure_com_gzbz_protobuf_C2S_TransferTreasureItem_9411_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_treasure_com_gzbz_protobuf_S2C_TransferTreasureItem_9412_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_treasure_com_gzbz_protobuf_S2C_TransferTreasureItem_9412_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_treasure_com_gzbz_protobuf_C2S_TreasureResetLv_9413_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_treasure_com_gzbz_protobuf_C2S_TreasureResetLv_9413_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_treasure_com_gzbz_protobuf_S2C_TreasureResetLv_9414_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_treasure_com_gzbz_protobuf_S2C_TreasureResetLv_9414_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_treasure_com_gzbz_protobuf_C2S_ResetLvResource_9415_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_treasure_com_gzbz_protobuf_C2S_ResetLvResource_9415_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_treasure_com_gzbz_protobuf_S2C_ResetLvResource_9416_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_treasure_com_gzbz_protobuf_S2C_ResetLvResource_9416_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private TreasureMsg() {
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
      String[] descriptorData = new String[]{"\n\u000eTreasure.proto\u0012\u001atreasure.com.gzbz.protobuf\u001a\fcommon.proto\"\u001a\n\u0018C2S_GetTreasureInfo_9401\"R\n\u0018S2C_GetTreasureInfo_9402\u00126\n\u0004info\u0018\u0001 \u0003(\u000b2(.treasure.com.gzbz.protobuf.TreasureInfo\"_\n\fTreasureInfo\u0012\u0012\n\ntreasureId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007starSum\u0018\u0004 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0005 \u0002(\u0005\u0012\u000b\n\u0003exp\u0018\u0006 \u0002(\u0005\u0012\u000e\n\u0006unLock\u0018\u0007 \u0002(\b\"?\n\u0017C2S_UnLockTreasure_9403\u0012\u0012\n\ntreasureId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\"\u0080\u0001\n\u0017S2C_UnLockTreasure_9404\u00126\n\u0004info\u0018\u0002 \u0002(\u000b2(.treasure.com.gzbz.protobuf.TreasureInfo\u0012-\n\u000fpropertyChanges\u0018\u0003 \u0003(\u000b2\u0014.common.PropertyInfo\",\n\u0016C2S_TreasureUpLev_9405\u0012\u0012\n\ntreasureId\u0018\u0001 \u0002(\u0005\"\u007f\n\u0016S2C_TreasureUpLev_9406\u00126\n\u0004info\u0018\u0003 \u0002(\u000b2(.treasure.com.gzbz.protobuf.TreasureInfo\u0012-\n\u000fpropertyChanges\u0018\u0004 \u0003(\u000b2\u0014.common.PropertyInfo\".\n\u0018C2S_TreasureUpStage_9407\u0012\u0012\n\ntreasureId\u0018\u0001 \u0002(\u0005\"\u0081\u0001\n\u0018S2C_TreasureUpStage_9408\u00126\n\u0004info\u0018\u0003 \u0002(\u000b2(.treasure.com.gzbz.protobuf.TreasureInfo\u0012-\n\u000fpropertyChanges\u0018\u0004 \u0003(\u000b2\u0014.common.PropertyInfo\",\n\u0016C2S_TreasureReset_9409\u0012\u0012\n\ntreasureId\u0018\u0001 \u0002(\u0005\"\u007f\n\u0016S2C_TreasureReset_9410\u00126\n\u0004info\u0018\u0002 \u0002(\u000b2(.treasure.com.gzbz.protobuf.TreasureInfo\u0012-\n\u000fpropertyChanges\u0018\u0003 \u0003(\u000b2\u0014.common.PropertyInfo\"7\n\u0018TreasureTransferCostInfo\u0012\u000e\n\u0006itemId\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\"\u0081\u0001\n\u001dC2S_TransferTreasureItem_9411\u0012J\n\ftransferInfo\u0018\u0001 \u0003(\u000b24.treasure.com.gzbz.protobuf.TreasureTransferCostInfo\u0012\u0014\n\ftargetItemId\u0018\u0002 \u0002(\u0005\"/\n\u001dS2C_TransferTreasureItem_9412\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\".\n\u0018C2S_TreasureResetLv_9413\u0012\u0012\n\ntreasureId\u0018\u0001 \u0002(\u0005\"R\n\u0018S2C_TreasureResetLv_9414\u00126\n\u0004info\u0018\u0002 \u0002(\u000b2(.treasure.com.gzbz.protobuf.TreasureInfo\".\n\u0018C2S_ResetLvResource_9415\u0012\u0012\n\ntreasureId\u0018\u0001 \u0002(\u0005\"D\n\u0018S2C_ResetLvResource_9416\u0012(\n\u000ereturnResource\u0018\u0001 \u0003(\u000b2\u0010.common.ItemInfoB\"\n\u0011com.gzbz.protobufB\u000bTreasureMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_treasure_com_gzbz_protobuf_C2S_GetTreasureInfo_9401_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_treasure_com_gzbz_protobuf_C2S_GetTreasureInfo_9401_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_treasure_com_gzbz_protobuf_C2S_GetTreasureInfo_9401_descriptor, new String[0]);
      internal_static_treasure_com_gzbz_protobuf_S2C_GetTreasureInfo_9402_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_treasure_com_gzbz_protobuf_S2C_GetTreasureInfo_9402_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_treasure_com_gzbz_protobuf_S2C_GetTreasureInfo_9402_descriptor, new String[]{"Info"});
      internal_static_treasure_com_gzbz_protobuf_TreasureInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_treasure_com_gzbz_protobuf_TreasureInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_treasure_com_gzbz_protobuf_TreasureInfo_descriptor, new String[]{"TreasureId", "StarSum", "Level", "Exp", "UnLock"});
      internal_static_treasure_com_gzbz_protobuf_C2S_UnLockTreasure_9403_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_treasure_com_gzbz_protobuf_C2S_UnLockTreasure_9403_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_treasure_com_gzbz_protobuf_C2S_UnLockTreasure_9403_descriptor, new String[]{"TreasureId", "HeroCode"});
      internal_static_treasure_com_gzbz_protobuf_S2C_UnLockTreasure_9404_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_treasure_com_gzbz_protobuf_S2C_UnLockTreasure_9404_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_treasure_com_gzbz_protobuf_S2C_UnLockTreasure_9404_descriptor, new String[]{"Info", "PropertyChanges"});
      internal_static_treasure_com_gzbz_protobuf_C2S_TreasureUpLev_9405_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_treasure_com_gzbz_protobuf_C2S_TreasureUpLev_9405_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_treasure_com_gzbz_protobuf_C2S_TreasureUpLev_9405_descriptor, new String[]{"TreasureId"});
      internal_static_treasure_com_gzbz_protobuf_S2C_TreasureUpLev_9406_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_treasure_com_gzbz_protobuf_S2C_TreasureUpLev_9406_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_treasure_com_gzbz_protobuf_S2C_TreasureUpLev_9406_descriptor, new String[]{"Info", "PropertyChanges"});
      internal_static_treasure_com_gzbz_protobuf_C2S_TreasureUpStage_9407_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_treasure_com_gzbz_protobuf_C2S_TreasureUpStage_9407_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_treasure_com_gzbz_protobuf_C2S_TreasureUpStage_9407_descriptor, new String[]{"TreasureId"});
      internal_static_treasure_com_gzbz_protobuf_S2C_TreasureUpStage_9408_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_treasure_com_gzbz_protobuf_S2C_TreasureUpStage_9408_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_treasure_com_gzbz_protobuf_S2C_TreasureUpStage_9408_descriptor, new String[]{"Info", "PropertyChanges"});
      internal_static_treasure_com_gzbz_protobuf_C2S_TreasureReset_9409_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_treasure_com_gzbz_protobuf_C2S_TreasureReset_9409_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_treasure_com_gzbz_protobuf_C2S_TreasureReset_9409_descriptor, new String[]{"TreasureId"});
      internal_static_treasure_com_gzbz_protobuf_S2C_TreasureReset_9410_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_treasure_com_gzbz_protobuf_S2C_TreasureReset_9410_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_treasure_com_gzbz_protobuf_S2C_TreasureReset_9410_descriptor, new String[]{"Info", "PropertyChanges"});
      internal_static_treasure_com_gzbz_protobuf_TreasureTransferCostInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_treasure_com_gzbz_protobuf_TreasureTransferCostInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_treasure_com_gzbz_protobuf_TreasureTransferCostInfo_descriptor, new String[]{"ItemId", "Num"});
      internal_static_treasure_com_gzbz_protobuf_C2S_TransferTreasureItem_9411_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_treasure_com_gzbz_protobuf_C2S_TransferTreasureItem_9411_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_treasure_com_gzbz_protobuf_C2S_TransferTreasureItem_9411_descriptor, new String[]{"TransferInfo", "TargetItemId"});
      internal_static_treasure_com_gzbz_protobuf_S2C_TransferTreasureItem_9412_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_treasure_com_gzbz_protobuf_S2C_TransferTreasureItem_9412_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_treasure_com_gzbz_protobuf_S2C_TransferTreasureItem_9412_descriptor, new String[]{"Result"});
      internal_static_treasure_com_gzbz_protobuf_C2S_TreasureResetLv_9413_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_treasure_com_gzbz_protobuf_C2S_TreasureResetLv_9413_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_treasure_com_gzbz_protobuf_C2S_TreasureResetLv_9413_descriptor, new String[]{"TreasureId"});
      internal_static_treasure_com_gzbz_protobuf_S2C_TreasureResetLv_9414_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_treasure_com_gzbz_protobuf_S2C_TreasureResetLv_9414_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_treasure_com_gzbz_protobuf_S2C_TreasureResetLv_9414_descriptor, new String[]{"Info"});
      internal_static_treasure_com_gzbz_protobuf_C2S_ResetLvResource_9415_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_treasure_com_gzbz_protobuf_C2S_ResetLvResource_9415_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_treasure_com_gzbz_protobuf_C2S_ResetLvResource_9415_descriptor, new String[]{"TreasureId"});
      internal_static_treasure_com_gzbz_protobuf_S2C_ResetLvResource_9416_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_treasure_com_gzbz_protobuf_S2C_ResetLvResource_9416_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_treasure_com_gzbz_protobuf_S2C_ResetLvResource_9416_descriptor, new String[]{"ReturnResource"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_GetTreasureInfo_9401 extends GeneratedMessageV3 implements C2S_GetTreasureInfo_9401OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GetTreasureInfo_9401 DEFAULT_INSTANCE = new C2S_GetTreasureInfo_9401();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GetTreasureInfo_9401> PARSER = new AbstractParser<C2S_GetTreasureInfo_9401>() {
         public C2S_GetTreasureInfo_9401 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GetTreasureInfo_9401(input, extensionRegistry);
         }
      };

      private C2S_GetTreasureInfo_9401(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GetTreasureInfo_9401() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GetTreasureInfo_9401();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GetTreasureInfo_9401(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_GetTreasureInfo_9401_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_GetTreasureInfo_9401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetTreasureInfo_9401.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GetTreasureInfo_9401)) {
            return super.equals(obj);
         } else {
            C2S_GetTreasureInfo_9401 other = (C2S_GetTreasureInfo_9401)obj;
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

      public static C2S_GetTreasureInfo_9401 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GetTreasureInfo_9401)PARSER.parseFrom(data);
      }

      public static C2S_GetTreasureInfo_9401 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetTreasureInfo_9401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetTreasureInfo_9401 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GetTreasureInfo_9401)PARSER.parseFrom(data);
      }

      public static C2S_GetTreasureInfo_9401 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetTreasureInfo_9401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetTreasureInfo_9401 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GetTreasureInfo_9401)PARSER.parseFrom(data);
      }

      public static C2S_GetTreasureInfo_9401 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetTreasureInfo_9401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetTreasureInfo_9401 parseFrom(InputStream input) throws IOException {
         return (C2S_GetTreasureInfo_9401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetTreasureInfo_9401 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetTreasureInfo_9401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetTreasureInfo_9401 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GetTreasureInfo_9401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GetTreasureInfo_9401 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetTreasureInfo_9401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetTreasureInfo_9401 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GetTreasureInfo_9401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetTreasureInfo_9401 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetTreasureInfo_9401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GetTreasureInfo_9401 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GetTreasureInfo_9401 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GetTreasureInfo_9401> parser() {
         return PARSER;
      }

      public Parser<C2S_GetTreasureInfo_9401> getParserForType() {
         return PARSER;
      }

      public C2S_GetTreasureInfo_9401 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GetTreasureInfo_9401OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_GetTreasureInfo_9401_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_GetTreasureInfo_9401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetTreasureInfo_9401.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TreasureMsg.C2S_GetTreasureInfo_9401.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_GetTreasureInfo_9401_descriptor;
         }

         public C2S_GetTreasureInfo_9401 getDefaultInstanceForType() {
            return TreasureMsg.C2S_GetTreasureInfo_9401.getDefaultInstance();
         }

         public C2S_GetTreasureInfo_9401 build() {
            C2S_GetTreasureInfo_9401 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GetTreasureInfo_9401 buildPartial() {
            C2S_GetTreasureInfo_9401 result = new C2S_GetTreasureInfo_9401(this);
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
            if (other instanceof C2S_GetTreasureInfo_9401) {
               return this.mergeFrom((C2S_GetTreasureInfo_9401)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GetTreasureInfo_9401 other) {
            if (other == TreasureMsg.C2S_GetTreasureInfo_9401.getDefaultInstance()) {
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
            C2S_GetTreasureInfo_9401 parsedMessage = null;

            try {
               parsedMessage = (C2S_GetTreasureInfo_9401)TreasureMsg.C2S_GetTreasureInfo_9401.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GetTreasureInfo_9401)e.getUnfinishedMessage();
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

   public static final class S2C_GetTreasureInfo_9402 extends GeneratedMessageV3 implements S2C_GetTreasureInfo_9402OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFO_FIELD_NUMBER = 1;
      private List<TreasureInfo> info_;
      private byte memoizedIsInitialized;
      private static final S2C_GetTreasureInfo_9402 DEFAULT_INSTANCE = new S2C_GetTreasureInfo_9402();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GetTreasureInfo_9402> PARSER = new AbstractParser<S2C_GetTreasureInfo_9402>() {
         public S2C_GetTreasureInfo_9402 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GetTreasureInfo_9402(input, extensionRegistry);
         }
      };

      private S2C_GetTreasureInfo_9402(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GetTreasureInfo_9402() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GetTreasureInfo_9402();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GetTreasureInfo_9402(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.info_.add(input.readMessage(TreasureMsg.TreasureInfo.PARSER, extensionRegistry));
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
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_GetTreasureInfo_9402_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_GetTreasureInfo_9402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetTreasureInfo_9402.class, Builder.class);
      }

      public List<TreasureInfo> getInfoList() {
         return this.info_;
      }

      public List<? extends TreasureInfoOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public TreasureInfo getInfo(int index) {
         return (TreasureInfo)this.info_.get(index);
      }

      public TreasureInfoOrBuilder getInfoOrBuilder(int index) {
         return (TreasureInfoOrBuilder)this.info_.get(index);
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
         } else if (!(obj instanceof S2C_GetTreasureInfo_9402)) {
            return super.equals(obj);
         } else {
            S2C_GetTreasureInfo_9402 other = (S2C_GetTreasureInfo_9402)obj;
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

      public static S2C_GetTreasureInfo_9402 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GetTreasureInfo_9402)PARSER.parseFrom(data);
      }

      public static S2C_GetTreasureInfo_9402 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetTreasureInfo_9402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetTreasureInfo_9402 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GetTreasureInfo_9402)PARSER.parseFrom(data);
      }

      public static S2C_GetTreasureInfo_9402 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetTreasureInfo_9402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetTreasureInfo_9402 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GetTreasureInfo_9402)PARSER.parseFrom(data);
      }

      public static S2C_GetTreasureInfo_9402 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetTreasureInfo_9402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetTreasureInfo_9402 parseFrom(InputStream input) throws IOException {
         return (S2C_GetTreasureInfo_9402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetTreasureInfo_9402 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetTreasureInfo_9402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetTreasureInfo_9402 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GetTreasureInfo_9402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GetTreasureInfo_9402 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetTreasureInfo_9402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetTreasureInfo_9402 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GetTreasureInfo_9402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetTreasureInfo_9402 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetTreasureInfo_9402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GetTreasureInfo_9402 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GetTreasureInfo_9402 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GetTreasureInfo_9402> parser() {
         return PARSER;
      }

      public Parser<S2C_GetTreasureInfo_9402> getParserForType() {
         return PARSER;
      }

      public S2C_GetTreasureInfo_9402 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GetTreasureInfo_9402OrBuilder {
         private int bitField0_;
         private List<TreasureInfo> info_;
         private RepeatedFieldBuilderV3<TreasureInfo, TreasureInfo.Builder, TreasureInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_GetTreasureInfo_9402_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_GetTreasureInfo_9402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetTreasureInfo_9402.class, Builder.class);
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
            if (TreasureMsg.S2C_GetTreasureInfo_9402.alwaysUseFieldBuilders) {
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
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_GetTreasureInfo_9402_descriptor;
         }

         public S2C_GetTreasureInfo_9402 getDefaultInstanceForType() {
            return TreasureMsg.S2C_GetTreasureInfo_9402.getDefaultInstance();
         }

         public S2C_GetTreasureInfo_9402 build() {
            S2C_GetTreasureInfo_9402 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GetTreasureInfo_9402 buildPartial() {
            S2C_GetTreasureInfo_9402 result = new S2C_GetTreasureInfo_9402(this);
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
            if (other instanceof S2C_GetTreasureInfo_9402) {
               return this.mergeFrom((S2C_GetTreasureInfo_9402)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GetTreasureInfo_9402 other) {
            if (other == TreasureMsg.S2C_GetTreasureInfo_9402.getDefaultInstance()) {
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
                     this.infoBuilder_ = TreasureMsg.S2C_GetTreasureInfo_9402.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
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
            S2C_GetTreasureInfo_9402 parsedMessage = null;

            try {
               parsedMessage = (S2C_GetTreasureInfo_9402)TreasureMsg.S2C_GetTreasureInfo_9402.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GetTreasureInfo_9402)e.getUnfinishedMessage();
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

         public List<TreasureInfo> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public TreasureInfo getInfo(int index) {
            return this.infoBuilder_ == null ? (TreasureInfo)this.info_.get(index) : (TreasureInfo)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, TreasureInfo value) {
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

         public Builder setInfo(int index, TreasureInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(TreasureInfo value) {
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

         public Builder addInfo(int index, TreasureInfo value) {
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

         public Builder addInfo(TreasureInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, TreasureInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends TreasureInfo> values) {
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

         public TreasureInfo.Builder getInfoBuilder(int index) {
            return (TreasureInfo.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public TreasureInfoOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (TreasureInfoOrBuilder)this.info_.get(index) : (TreasureInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends TreasureInfoOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public TreasureInfo.Builder addInfoBuilder() {
            return (TreasureInfo.Builder)this.getInfoFieldBuilder().addBuilder(TreasureMsg.TreasureInfo.getDefaultInstance());
         }

         public TreasureInfo.Builder addInfoBuilder(int index) {
            return (TreasureInfo.Builder)this.getInfoFieldBuilder().addBuilder(index, TreasureMsg.TreasureInfo.getDefaultInstance());
         }

         public List<TreasureInfo.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<TreasureInfo, TreasureInfo.Builder, TreasureInfoOrBuilder> getInfoFieldBuilder() {
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

   public static final class TreasureInfo extends GeneratedMessageV3 implements TreasureInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TREASUREID_FIELD_NUMBER = 1;
      private int treasureId_;
      public static final int STARSUM_FIELD_NUMBER = 4;
      private int starSum_;
      public static final int LEVEL_FIELD_NUMBER = 5;
      private int level_;
      public static final int EXP_FIELD_NUMBER = 6;
      private int exp_;
      public static final int UNLOCK_FIELD_NUMBER = 7;
      private boolean unLock_;
      private byte memoizedIsInitialized;
      private static final TreasureInfo DEFAULT_INSTANCE = new TreasureInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<TreasureInfo> PARSER = new AbstractParser<TreasureInfo>() {
         public TreasureInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new TreasureInfo(input, extensionRegistry);
         }
      };

      private TreasureInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private TreasureInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new TreasureInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private TreasureInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.treasureId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 2;
                        this.starSum_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 4;
                        this.level_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 8;
                        this.exp_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 16;
                        this.unLock_ = input.readBool();
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
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_TreasureInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_TreasureInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TreasureInfo.class, Builder.class);
      }

      public boolean hasTreasureId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTreasureId() {
         return this.treasureId_;
      }

      public boolean hasStarSum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStarSum() {
         return this.starSum_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public boolean hasExp() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getExp() {
         return this.exp_;
      }

      public boolean hasUnLock() {
         return (this.bitField0_ & 16) != 0;
      }

      public boolean getUnLock() {
         return this.unLock_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTreasureId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStarSum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasExp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasUnLock()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.treasureId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(4, this.starSum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(5, this.level_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(6, this.exp_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeBool(7, this.unLock_);
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
               size += CodedOutputStream.computeInt32Size(1, this.treasureId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.starSum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.level_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.exp_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeBoolSize(7, this.unLock_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof TreasureInfo)) {
            return super.equals(obj);
         } else {
            TreasureInfo other = (TreasureInfo)obj;
            if (this.hasTreasureId() != other.hasTreasureId()) {
               return false;
            } else if (this.hasTreasureId() && this.getTreasureId() != other.getTreasureId()) {
               return false;
            } else if (this.hasStarSum() != other.hasStarSum()) {
               return false;
            } else if (this.hasStarSum() && this.getStarSum() != other.getStarSum()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (this.hasExp() != other.hasExp()) {
               return false;
            } else if (this.hasExp() && this.getExp() != other.getExp()) {
               return false;
            } else if (this.hasUnLock() != other.hasUnLock()) {
               return false;
            } else if (this.hasUnLock() && this.getUnLock() != other.getUnLock()) {
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
            if (this.hasTreasureId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTreasureId();
            }

            if (this.hasStarSum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getStarSum();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getLevel();
            }

            if (this.hasExp()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getExp();
            }

            if (this.hasUnLock()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + Internal.hashBoolean(this.getUnLock());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static TreasureInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (TreasureInfo)PARSER.parseFrom(data);
      }

      public static TreasureInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TreasureInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TreasureInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (TreasureInfo)PARSER.parseFrom(data);
      }

      public static TreasureInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TreasureInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TreasureInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (TreasureInfo)PARSER.parseFrom(data);
      }

      public static TreasureInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TreasureInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TreasureInfo parseFrom(InputStream input) throws IOException {
         return (TreasureInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TreasureInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TreasureInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static TreasureInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (TreasureInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static TreasureInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TreasureInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static TreasureInfo parseFrom(CodedInputStream input) throws IOException {
         return (TreasureInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TreasureInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TreasureInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(TreasureInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static TreasureInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<TreasureInfo> parser() {
         return PARSER;
      }

      public Parser<TreasureInfo> getParserForType() {
         return PARSER;
      }

      public TreasureInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TreasureInfoOrBuilder {
         private int bitField0_;
         private int treasureId_;
         private int starSum_;
         private int level_;
         private int exp_;
         private boolean unLock_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_TreasureInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_TreasureInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TreasureInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TreasureMsg.TreasureInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.treasureId_ = 0;
            this.bitField0_ &= -2;
            this.starSum_ = 0;
            this.bitField0_ &= -3;
            this.level_ = 0;
            this.bitField0_ &= -5;
            this.exp_ = 0;
            this.bitField0_ &= -9;
            this.unLock_ = false;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_TreasureInfo_descriptor;
         }

         public TreasureInfo getDefaultInstanceForType() {
            return TreasureMsg.TreasureInfo.getDefaultInstance();
         }

         public TreasureInfo build() {
            TreasureInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public TreasureInfo buildPartial() {
            TreasureInfo result = new TreasureInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.treasureId_ = this.treasureId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.starSum_ = this.starSum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.exp_ = this.exp_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.unLock_ = this.unLock_;
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
            if (other instanceof TreasureInfo) {
               return this.mergeFrom((TreasureInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(TreasureInfo other) {
            if (other == TreasureMsg.TreasureInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTreasureId()) {
                  this.setTreasureId(other.getTreasureId());
               }

               if (other.hasStarSum()) {
                  this.setStarSum(other.getStarSum());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (other.hasExp()) {
                  this.setExp(other.getExp());
               }

               if (other.hasUnLock()) {
                  this.setUnLock(other.getUnLock());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTreasureId()) {
               return false;
            } else if (!this.hasStarSum()) {
               return false;
            } else if (!this.hasLevel()) {
               return false;
            } else if (!this.hasExp()) {
               return false;
            } else {
               return this.hasUnLock();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            TreasureInfo parsedMessage = null;

            try {
               parsedMessage = (TreasureInfo)TreasureMsg.TreasureInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (TreasureInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTreasureId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTreasureId() {
            return this.treasureId_;
         }

         public Builder setTreasureId(int value) {
            this.bitField0_ |= 1;
            this.treasureId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTreasureId() {
            this.bitField0_ &= -2;
            this.treasureId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStarSum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStarSum() {
            return this.starSum_;
         }

         public Builder setStarSum(int value) {
            this.bitField0_ |= 2;
            this.starSum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStarSum() {
            this.bitField0_ &= -3;
            this.starSum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 4;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -5;
            this.level_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasExp() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getExp() {
            return this.exp_;
         }

         public Builder setExp(int value) {
            this.bitField0_ |= 8;
            this.exp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearExp() {
            this.bitField0_ &= -9;
            this.exp_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnLock() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getUnLock() {
            return this.unLock_;
         }

         public Builder setUnLock(boolean value) {
            this.bitField0_ |= 16;
            this.unLock_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnLock() {
            this.bitField0_ &= -17;
            this.unLock_ = false;
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

   public static final class C2S_UnLockTreasure_9403 extends GeneratedMessageV3 implements C2S_UnLockTreasure_9403OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TREASUREID_FIELD_NUMBER = 1;
      private int treasureId_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_UnLockTreasure_9403 DEFAULT_INSTANCE = new C2S_UnLockTreasure_9403();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UnLockTreasure_9403> PARSER = new AbstractParser<C2S_UnLockTreasure_9403>() {
         public C2S_UnLockTreasure_9403 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UnLockTreasure_9403(input, extensionRegistry);
         }
      };

      private C2S_UnLockTreasure_9403(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UnLockTreasure_9403() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UnLockTreasure_9403();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UnLockTreasure_9403(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.treasureId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
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
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_UnLockTreasure_9403_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_UnLockTreasure_9403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnLockTreasure_9403.class, Builder.class);
      }

      public boolean hasTreasureId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTreasureId() {
         return this.treasureId_;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasTreasureId()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.treasureId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.heroCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.treasureId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.heroCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_UnLockTreasure_9403)) {
            return super.equals(obj);
         } else {
            C2S_UnLockTreasure_9403 other = (C2S_UnLockTreasure_9403)obj;
            if (this.hasTreasureId() != other.hasTreasureId()) {
               return false;
            } else if (this.hasTreasureId() && this.getTreasureId() != other.getTreasureId()) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
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
            if (this.hasTreasureId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTreasureId();
            }

            if (this.hasHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_UnLockTreasure_9403 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UnLockTreasure_9403)PARSER.parseFrom(data);
      }

      public static C2S_UnLockTreasure_9403 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnLockTreasure_9403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnLockTreasure_9403 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UnLockTreasure_9403)PARSER.parseFrom(data);
      }

      public static C2S_UnLockTreasure_9403 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnLockTreasure_9403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnLockTreasure_9403 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UnLockTreasure_9403)PARSER.parseFrom(data);
      }

      public static C2S_UnLockTreasure_9403 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnLockTreasure_9403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnLockTreasure_9403 parseFrom(InputStream input) throws IOException {
         return (C2S_UnLockTreasure_9403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnLockTreasure_9403 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnLockTreasure_9403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnLockTreasure_9403 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UnLockTreasure_9403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UnLockTreasure_9403 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnLockTreasure_9403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnLockTreasure_9403 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UnLockTreasure_9403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnLockTreasure_9403 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnLockTreasure_9403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UnLockTreasure_9403 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UnLockTreasure_9403 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UnLockTreasure_9403> parser() {
         return PARSER;
      }

      public Parser<C2S_UnLockTreasure_9403> getParserForType() {
         return PARSER;
      }

      public C2S_UnLockTreasure_9403 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UnLockTreasure_9403OrBuilder {
         private int bitField0_;
         private int treasureId_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_UnLockTreasure_9403_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_UnLockTreasure_9403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnLockTreasure_9403.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TreasureMsg.C2S_UnLockTreasure_9403.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.treasureId_ = 0;
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_UnLockTreasure_9403_descriptor;
         }

         public C2S_UnLockTreasure_9403 getDefaultInstanceForType() {
            return TreasureMsg.C2S_UnLockTreasure_9403.getDefaultInstance();
         }

         public C2S_UnLockTreasure_9403 build() {
            C2S_UnLockTreasure_9403 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UnLockTreasure_9403 buildPartial() {
            C2S_UnLockTreasure_9403 result = new C2S_UnLockTreasure_9403(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.treasureId_ = this.treasureId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.heroCode_ = this.heroCode_;
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
            if (other instanceof C2S_UnLockTreasure_9403) {
               return this.mergeFrom((C2S_UnLockTreasure_9403)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UnLockTreasure_9403 other) {
            if (other == TreasureMsg.C2S_UnLockTreasure_9403.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTreasureId()) {
                  this.setTreasureId(other.getTreasureId());
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTreasureId()) {
               return false;
            } else {
               return this.hasHeroCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_UnLockTreasure_9403 parsedMessage = null;

            try {
               parsedMessage = (C2S_UnLockTreasure_9403)TreasureMsg.C2S_UnLockTreasure_9403.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UnLockTreasure_9403)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTreasureId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTreasureId() {
            return this.treasureId_;
         }

         public Builder setTreasureId(int value) {
            this.bitField0_ |= 1;
            this.treasureId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTreasureId() {
            this.bitField0_ &= -2;
            this.treasureId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 2;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -3;
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

   public static final class S2C_UnLockTreasure_9404 extends GeneratedMessageV3 implements S2C_UnLockTreasure_9404OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 2;
      private TreasureInfo info_;
      public static final int PROPERTYCHANGES_FIELD_NUMBER = 3;
      private List<CommonMsg.PropertyInfo> propertyChanges_;
      private byte memoizedIsInitialized;
      private static final S2C_UnLockTreasure_9404 DEFAULT_INSTANCE = new S2C_UnLockTreasure_9404();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UnLockTreasure_9404> PARSER = new AbstractParser<S2C_UnLockTreasure_9404>() {
         public S2C_UnLockTreasure_9404 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UnLockTreasure_9404(input, extensionRegistry);
         }
      };

      private S2C_UnLockTreasure_9404(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UnLockTreasure_9404() {
         this.memoizedIsInitialized = -1;
         this.propertyChanges_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UnLockTreasure_9404();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UnLockTreasure_9404(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        TreasureInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (TreasureInfo)input.readMessage(TreasureMsg.TreasureInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.propertyChanges_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.propertyChanges_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
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
                  this.propertyChanges_ = Collections.unmodifiableList(this.propertyChanges_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_UnLockTreasure_9404_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_UnLockTreasure_9404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnLockTreasure_9404.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public TreasureInfo getInfo() {
         return this.info_ == null ? TreasureMsg.TreasureInfo.getDefaultInstance() : this.info_;
      }

      public TreasureInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? TreasureMsg.TreasureInfo.getDefaultInstance() : this.info_;
      }

      public List<CommonMsg.PropertyInfo> getPropertyChangesList() {
         return this.propertyChanges_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesOrBuilderList() {
         return this.propertyChanges_;
      }

      public int getPropertyChangesCount() {
         return this.propertyChanges_.size();
      }

      public CommonMsg.PropertyInfo getPropertyChanges(int index) {
         return (CommonMsg.PropertyInfo)this.propertyChanges_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getPropertyChangesOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.propertyChanges_.get(index);
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
            for(int i = 0; i < this.getPropertyChangesCount(); ++i) {
               if (!this.getPropertyChanges(i).isInitialized()) {
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
            output.writeMessage(2, this.getInfo());
         }

         for(int i = 0; i < this.propertyChanges_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.propertyChanges_.get(i));
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

            for(int i = 0; i < this.propertyChanges_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.propertyChanges_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UnLockTreasure_9404)) {
            return super.equals(obj);
         } else {
            S2C_UnLockTreasure_9404 other = (S2C_UnLockTreasure_9404)obj;
            if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
               return false;
            } else if (!this.getPropertyChangesList().equals(other.getPropertyChangesList())) {
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

            if (this.getPropertyChangesCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPropertyChangesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UnLockTreasure_9404 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UnLockTreasure_9404)PARSER.parseFrom(data);
      }

      public static S2C_UnLockTreasure_9404 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnLockTreasure_9404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnLockTreasure_9404 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UnLockTreasure_9404)PARSER.parseFrom(data);
      }

      public static S2C_UnLockTreasure_9404 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnLockTreasure_9404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnLockTreasure_9404 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UnLockTreasure_9404)PARSER.parseFrom(data);
      }

      public static S2C_UnLockTreasure_9404 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnLockTreasure_9404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnLockTreasure_9404 parseFrom(InputStream input) throws IOException {
         return (S2C_UnLockTreasure_9404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnLockTreasure_9404 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnLockTreasure_9404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnLockTreasure_9404 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UnLockTreasure_9404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UnLockTreasure_9404 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnLockTreasure_9404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnLockTreasure_9404 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UnLockTreasure_9404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnLockTreasure_9404 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnLockTreasure_9404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UnLockTreasure_9404 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UnLockTreasure_9404 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UnLockTreasure_9404> parser() {
         return PARSER;
      }

      public Parser<S2C_UnLockTreasure_9404> getParserForType() {
         return PARSER;
      }

      public S2C_UnLockTreasure_9404 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UnLockTreasure_9404OrBuilder {
         private int bitField0_;
         private TreasureInfo info_;
         private SingleFieldBuilderV3<TreasureInfo, TreasureInfo.Builder, TreasureInfoOrBuilder> infoBuilder_;
         private List<CommonMsg.PropertyInfo> propertyChanges_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> propertyChangesBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_UnLockTreasure_9404_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_UnLockTreasure_9404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnLockTreasure_9404.class, Builder.class);
         }

         private Builder() {
            this.propertyChanges_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.propertyChanges_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TreasureMsg.S2C_UnLockTreasure_9404.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
               this.getPropertyChangesFieldBuilder();
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
            if (this.propertyChangesBuilder_ == null) {
               this.propertyChanges_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.propertyChangesBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_UnLockTreasure_9404_descriptor;
         }

         public S2C_UnLockTreasure_9404 getDefaultInstanceForType() {
            return TreasureMsg.S2C_UnLockTreasure_9404.getDefaultInstance();
         }

         public S2C_UnLockTreasure_9404 build() {
            S2C_UnLockTreasure_9404 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UnLockTreasure_9404 buildPartial() {
            S2C_UnLockTreasure_9404 result = new S2C_UnLockTreasure_9404(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (TreasureInfo)this.infoBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if (this.propertyChangesBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.propertyChanges_ = Collections.unmodifiableList(this.propertyChanges_);
                  this.bitField0_ &= -3;
               }

               result.propertyChanges_ = this.propertyChanges_;
            } else {
               result.propertyChanges_ = this.propertyChangesBuilder_.build();
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
            if (other instanceof S2C_UnLockTreasure_9404) {
               return this.mergeFrom((S2C_UnLockTreasure_9404)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UnLockTreasure_9404 other) {
            if (other == TreasureMsg.S2C_UnLockTreasure_9404.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               if (this.propertyChangesBuilder_ == null) {
                  if (!other.propertyChanges_.isEmpty()) {
                     if (this.propertyChanges_.isEmpty()) {
                        this.propertyChanges_ = other.propertyChanges_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensurePropertyChangesIsMutable();
                        this.propertyChanges_.addAll(other.propertyChanges_);
                     }

                     this.onChanged();
                  }
               } else if (!other.propertyChanges_.isEmpty()) {
                  if (this.propertyChangesBuilder_.isEmpty()) {
                     this.propertyChangesBuilder_.dispose();
                     this.propertyChangesBuilder_ = null;
                     this.propertyChanges_ = other.propertyChanges_;
                     this.bitField0_ &= -3;
                     this.propertyChangesBuilder_ = TreasureMsg.S2C_UnLockTreasure_9404.alwaysUseFieldBuilders ? this.getPropertyChangesFieldBuilder() : null;
                  } else {
                     this.propertyChangesBuilder_.addAllMessages(other.propertyChanges_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasInfo()) {
               return false;
            } else if (!this.getInfo().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getPropertyChangesCount(); ++i) {
                  if (!this.getPropertyChanges(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UnLockTreasure_9404 parsedMessage = null;

            try {
               parsedMessage = (S2C_UnLockTreasure_9404)TreasureMsg.S2C_UnLockTreasure_9404.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UnLockTreasure_9404)e.getUnfinishedMessage();
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

         public TreasureInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? TreasureMsg.TreasureInfo.getDefaultInstance() : this.info_;
            } else {
               return (TreasureInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(TreasureInfo value) {
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

         public Builder setInfo(TreasureInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(TreasureInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != TreasureMsg.TreasureInfo.getDefaultInstance()) {
                  this.info_ = TreasureMsg.TreasureInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public TreasureInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (TreasureInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public TreasureInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (TreasureInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? TreasureMsg.TreasureInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<TreasureInfo, TreasureInfo.Builder, TreasureInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         private void ensurePropertyChangesIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.propertyChanges_ = new ArrayList(this.propertyChanges_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.PropertyInfo> getPropertyChangesList() {
            return this.propertyChangesBuilder_ == null ? Collections.unmodifiableList(this.propertyChanges_) : this.propertyChangesBuilder_.getMessageList();
         }

         public int getPropertyChangesCount() {
            return this.propertyChangesBuilder_ == null ? this.propertyChanges_.size() : this.propertyChangesBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getPropertyChanges(int index) {
            return this.propertyChangesBuilder_ == null ? (CommonMsg.PropertyInfo)this.propertyChanges_.get(index) : (CommonMsg.PropertyInfo)this.propertyChangesBuilder_.getMessage(index);
         }

         public Builder setPropertyChanges(int index, CommonMsg.PropertyInfo value) {
            if (this.propertyChangesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.set(index, value);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPropertyChanges(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPropertyChanges(CommonMsg.PropertyInfo value) {
            if (this.propertyChangesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(value);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPropertyChanges(int index, CommonMsg.PropertyInfo value) {
            if (this.propertyChangesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(index, value);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPropertyChanges(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPropertyChanges(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPropertyChanges(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.propertyChanges_);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPropertyChanges() {
            if (this.propertyChangesBuilder_ == null) {
               this.propertyChanges_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.clear();
            }

            return this;
         }

         public Builder removePropertyChanges(int index) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.remove(index);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getPropertyChangesBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getPropertyChangesOrBuilder(int index) {
            return this.propertyChangesBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.propertyChanges_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.propertyChangesBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesOrBuilderList() {
            return this.propertyChangesBuilder_ != null ? this.propertyChangesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.propertyChanges_);
         }

         public CommonMsg.PropertyInfo.Builder addPropertyChangesBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addPropertyChangesBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getPropertyChangesBuilderList() {
            return this.getPropertyChangesFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getPropertyChangesFieldBuilder() {
            if (this.propertyChangesBuilder_ == null) {
               this.propertyChangesBuilder_ = new RepeatedFieldBuilderV3(this.propertyChanges_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.propertyChanges_ = null;
            }

            return this.propertyChangesBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_TreasureUpLev_9405 extends GeneratedMessageV3 implements C2S_TreasureUpLev_9405OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TREASUREID_FIELD_NUMBER = 1;
      private int treasureId_;
      private byte memoizedIsInitialized;
      private static final C2S_TreasureUpLev_9405 DEFAULT_INSTANCE = new C2S_TreasureUpLev_9405();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TreasureUpLev_9405> PARSER = new AbstractParser<C2S_TreasureUpLev_9405>() {
         public C2S_TreasureUpLev_9405 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TreasureUpLev_9405(input, extensionRegistry);
         }
      };

      private C2S_TreasureUpLev_9405(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TreasureUpLev_9405() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TreasureUpLev_9405();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TreasureUpLev_9405(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.treasureId_ = input.readInt32();
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
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TreasureUpLev_9405_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TreasureUpLev_9405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureUpLev_9405.class, Builder.class);
      }

      public boolean hasTreasureId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTreasureId() {
         return this.treasureId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTreasureId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.treasureId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.treasureId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TreasureUpLev_9405)) {
            return super.equals(obj);
         } else {
            C2S_TreasureUpLev_9405 other = (C2S_TreasureUpLev_9405)obj;
            if (this.hasTreasureId() != other.hasTreasureId()) {
               return false;
            } else if (this.hasTreasureId() && this.getTreasureId() != other.getTreasureId()) {
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
            if (this.hasTreasureId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTreasureId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TreasureUpLev_9405 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TreasureUpLev_9405)PARSER.parseFrom(data);
      }

      public static C2S_TreasureUpLev_9405 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureUpLev_9405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureUpLev_9405 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TreasureUpLev_9405)PARSER.parseFrom(data);
      }

      public static C2S_TreasureUpLev_9405 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureUpLev_9405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureUpLev_9405 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TreasureUpLev_9405)PARSER.parseFrom(data);
      }

      public static C2S_TreasureUpLev_9405 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureUpLev_9405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureUpLev_9405 parseFrom(InputStream input) throws IOException {
         return (C2S_TreasureUpLev_9405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureUpLev_9405 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureUpLev_9405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureUpLev_9405 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TreasureUpLev_9405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TreasureUpLev_9405 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureUpLev_9405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureUpLev_9405 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TreasureUpLev_9405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureUpLev_9405 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureUpLev_9405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TreasureUpLev_9405 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TreasureUpLev_9405 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TreasureUpLev_9405> parser() {
         return PARSER;
      }

      public Parser<C2S_TreasureUpLev_9405> getParserForType() {
         return PARSER;
      }

      public C2S_TreasureUpLev_9405 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TreasureUpLev_9405OrBuilder {
         private int bitField0_;
         private int treasureId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TreasureUpLev_9405_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TreasureUpLev_9405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureUpLev_9405.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TreasureMsg.C2S_TreasureUpLev_9405.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.treasureId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TreasureUpLev_9405_descriptor;
         }

         public C2S_TreasureUpLev_9405 getDefaultInstanceForType() {
            return TreasureMsg.C2S_TreasureUpLev_9405.getDefaultInstance();
         }

         public C2S_TreasureUpLev_9405 build() {
            C2S_TreasureUpLev_9405 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TreasureUpLev_9405 buildPartial() {
            C2S_TreasureUpLev_9405 result = new C2S_TreasureUpLev_9405(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.treasureId_ = this.treasureId_;
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
            if (other instanceof C2S_TreasureUpLev_9405) {
               return this.mergeFrom((C2S_TreasureUpLev_9405)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TreasureUpLev_9405 other) {
            if (other == TreasureMsg.C2S_TreasureUpLev_9405.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTreasureId()) {
                  this.setTreasureId(other.getTreasureId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTreasureId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TreasureUpLev_9405 parsedMessage = null;

            try {
               parsedMessage = (C2S_TreasureUpLev_9405)TreasureMsg.C2S_TreasureUpLev_9405.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TreasureUpLev_9405)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTreasureId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTreasureId() {
            return this.treasureId_;
         }

         public Builder setTreasureId(int value) {
            this.bitField0_ |= 1;
            this.treasureId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTreasureId() {
            this.bitField0_ &= -2;
            this.treasureId_ = 0;
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

   public static final class S2C_TreasureUpLev_9406 extends GeneratedMessageV3 implements S2C_TreasureUpLev_9406OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 3;
      private TreasureInfo info_;
      public static final int PROPERTYCHANGES_FIELD_NUMBER = 4;
      private List<CommonMsg.PropertyInfo> propertyChanges_;
      private byte memoizedIsInitialized;
      private static final S2C_TreasureUpLev_9406 DEFAULT_INSTANCE = new S2C_TreasureUpLev_9406();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TreasureUpLev_9406> PARSER = new AbstractParser<S2C_TreasureUpLev_9406>() {
         public S2C_TreasureUpLev_9406 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TreasureUpLev_9406(input, extensionRegistry);
         }
      };

      private S2C_TreasureUpLev_9406(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TreasureUpLev_9406() {
         this.memoizedIsInitialized = -1;
         this.propertyChanges_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TreasureUpLev_9406();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TreasureUpLev_9406(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 26:
                        TreasureInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (TreasureInfo)input.readMessage(TreasureMsg.TreasureInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.propertyChanges_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.propertyChanges_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
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
                  this.propertyChanges_ = Collections.unmodifiableList(this.propertyChanges_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TreasureUpLev_9406_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TreasureUpLev_9406_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureUpLev_9406.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public TreasureInfo getInfo() {
         return this.info_ == null ? TreasureMsg.TreasureInfo.getDefaultInstance() : this.info_;
      }

      public TreasureInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? TreasureMsg.TreasureInfo.getDefaultInstance() : this.info_;
      }

      public List<CommonMsg.PropertyInfo> getPropertyChangesList() {
         return this.propertyChanges_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesOrBuilderList() {
         return this.propertyChanges_;
      }

      public int getPropertyChangesCount() {
         return this.propertyChanges_.size();
      }

      public CommonMsg.PropertyInfo getPropertyChanges(int index) {
         return (CommonMsg.PropertyInfo)this.propertyChanges_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getPropertyChangesOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.propertyChanges_.get(index);
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
            for(int i = 0; i < this.getPropertyChangesCount(); ++i) {
               if (!this.getPropertyChanges(i).isInitialized()) {
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
            output.writeMessage(3, this.getInfo());
         }

         for(int i = 0; i < this.propertyChanges_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.propertyChanges_.get(i));
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
               size += CodedOutputStream.computeMessageSize(3, this.getInfo());
            }

            for(int i = 0; i < this.propertyChanges_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.propertyChanges_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TreasureUpLev_9406)) {
            return super.equals(obj);
         } else {
            S2C_TreasureUpLev_9406 other = (S2C_TreasureUpLev_9406)obj;
            if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
               return false;
            } else if (!this.getPropertyChangesList().equals(other.getPropertyChangesList())) {
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
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            if (this.getPropertyChangesCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPropertyChangesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TreasureUpLev_9406 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TreasureUpLev_9406)PARSER.parseFrom(data);
      }

      public static S2C_TreasureUpLev_9406 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureUpLev_9406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureUpLev_9406 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TreasureUpLev_9406)PARSER.parseFrom(data);
      }

      public static S2C_TreasureUpLev_9406 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureUpLev_9406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureUpLev_9406 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TreasureUpLev_9406)PARSER.parseFrom(data);
      }

      public static S2C_TreasureUpLev_9406 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureUpLev_9406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureUpLev_9406 parseFrom(InputStream input) throws IOException {
         return (S2C_TreasureUpLev_9406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureUpLev_9406 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureUpLev_9406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureUpLev_9406 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TreasureUpLev_9406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TreasureUpLev_9406 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureUpLev_9406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureUpLev_9406 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TreasureUpLev_9406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureUpLev_9406 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureUpLev_9406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TreasureUpLev_9406 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TreasureUpLev_9406 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TreasureUpLev_9406> parser() {
         return PARSER;
      }

      public Parser<S2C_TreasureUpLev_9406> getParserForType() {
         return PARSER;
      }

      public S2C_TreasureUpLev_9406 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TreasureUpLev_9406OrBuilder {
         private int bitField0_;
         private TreasureInfo info_;
         private SingleFieldBuilderV3<TreasureInfo, TreasureInfo.Builder, TreasureInfoOrBuilder> infoBuilder_;
         private List<CommonMsg.PropertyInfo> propertyChanges_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> propertyChangesBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TreasureUpLev_9406_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TreasureUpLev_9406_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureUpLev_9406.class, Builder.class);
         }

         private Builder() {
            this.propertyChanges_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.propertyChanges_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TreasureMsg.S2C_TreasureUpLev_9406.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
               this.getPropertyChangesFieldBuilder();
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
            if (this.propertyChangesBuilder_ == null) {
               this.propertyChanges_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.propertyChangesBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TreasureUpLev_9406_descriptor;
         }

         public S2C_TreasureUpLev_9406 getDefaultInstanceForType() {
            return TreasureMsg.S2C_TreasureUpLev_9406.getDefaultInstance();
         }

         public S2C_TreasureUpLev_9406 build() {
            S2C_TreasureUpLev_9406 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TreasureUpLev_9406 buildPartial() {
            S2C_TreasureUpLev_9406 result = new S2C_TreasureUpLev_9406(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (TreasureInfo)this.infoBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if (this.propertyChangesBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.propertyChanges_ = Collections.unmodifiableList(this.propertyChanges_);
                  this.bitField0_ &= -3;
               }

               result.propertyChanges_ = this.propertyChanges_;
            } else {
               result.propertyChanges_ = this.propertyChangesBuilder_.build();
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
            if (other instanceof S2C_TreasureUpLev_9406) {
               return this.mergeFrom((S2C_TreasureUpLev_9406)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TreasureUpLev_9406 other) {
            if (other == TreasureMsg.S2C_TreasureUpLev_9406.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               if (this.propertyChangesBuilder_ == null) {
                  if (!other.propertyChanges_.isEmpty()) {
                     if (this.propertyChanges_.isEmpty()) {
                        this.propertyChanges_ = other.propertyChanges_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensurePropertyChangesIsMutable();
                        this.propertyChanges_.addAll(other.propertyChanges_);
                     }

                     this.onChanged();
                  }
               } else if (!other.propertyChanges_.isEmpty()) {
                  if (this.propertyChangesBuilder_.isEmpty()) {
                     this.propertyChangesBuilder_.dispose();
                     this.propertyChangesBuilder_ = null;
                     this.propertyChanges_ = other.propertyChanges_;
                     this.bitField0_ &= -3;
                     this.propertyChangesBuilder_ = TreasureMsg.S2C_TreasureUpLev_9406.alwaysUseFieldBuilders ? this.getPropertyChangesFieldBuilder() : null;
                  } else {
                     this.propertyChangesBuilder_.addAllMessages(other.propertyChanges_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasInfo()) {
               return false;
            } else if (!this.getInfo().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getPropertyChangesCount(); ++i) {
                  if (!this.getPropertyChanges(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TreasureUpLev_9406 parsedMessage = null;

            try {
               parsedMessage = (S2C_TreasureUpLev_9406)TreasureMsg.S2C_TreasureUpLev_9406.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TreasureUpLev_9406)e.getUnfinishedMessage();
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

         public TreasureInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? TreasureMsg.TreasureInfo.getDefaultInstance() : this.info_;
            } else {
               return (TreasureInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(TreasureInfo value) {
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

         public Builder setInfo(TreasureInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(TreasureInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != TreasureMsg.TreasureInfo.getDefaultInstance()) {
                  this.info_ = TreasureMsg.TreasureInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public TreasureInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (TreasureInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public TreasureInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (TreasureInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? TreasureMsg.TreasureInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<TreasureInfo, TreasureInfo.Builder, TreasureInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         private void ensurePropertyChangesIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.propertyChanges_ = new ArrayList(this.propertyChanges_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.PropertyInfo> getPropertyChangesList() {
            return this.propertyChangesBuilder_ == null ? Collections.unmodifiableList(this.propertyChanges_) : this.propertyChangesBuilder_.getMessageList();
         }

         public int getPropertyChangesCount() {
            return this.propertyChangesBuilder_ == null ? this.propertyChanges_.size() : this.propertyChangesBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getPropertyChanges(int index) {
            return this.propertyChangesBuilder_ == null ? (CommonMsg.PropertyInfo)this.propertyChanges_.get(index) : (CommonMsg.PropertyInfo)this.propertyChangesBuilder_.getMessage(index);
         }

         public Builder setPropertyChanges(int index, CommonMsg.PropertyInfo value) {
            if (this.propertyChangesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.set(index, value);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPropertyChanges(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPropertyChanges(CommonMsg.PropertyInfo value) {
            if (this.propertyChangesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(value);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPropertyChanges(int index, CommonMsg.PropertyInfo value) {
            if (this.propertyChangesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(index, value);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPropertyChanges(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPropertyChanges(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPropertyChanges(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.propertyChanges_);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPropertyChanges() {
            if (this.propertyChangesBuilder_ == null) {
               this.propertyChanges_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.clear();
            }

            return this;
         }

         public Builder removePropertyChanges(int index) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.remove(index);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getPropertyChangesBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getPropertyChangesOrBuilder(int index) {
            return this.propertyChangesBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.propertyChanges_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.propertyChangesBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesOrBuilderList() {
            return this.propertyChangesBuilder_ != null ? this.propertyChangesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.propertyChanges_);
         }

         public CommonMsg.PropertyInfo.Builder addPropertyChangesBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addPropertyChangesBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getPropertyChangesBuilderList() {
            return this.getPropertyChangesFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getPropertyChangesFieldBuilder() {
            if (this.propertyChangesBuilder_ == null) {
               this.propertyChangesBuilder_ = new RepeatedFieldBuilderV3(this.propertyChanges_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.propertyChanges_ = null;
            }

            return this.propertyChangesBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_TreasureUpStage_9407 extends GeneratedMessageV3 implements C2S_TreasureUpStage_9407OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TREASUREID_FIELD_NUMBER = 1;
      private int treasureId_;
      private byte memoizedIsInitialized;
      private static final C2S_TreasureUpStage_9407 DEFAULT_INSTANCE = new C2S_TreasureUpStage_9407();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TreasureUpStage_9407> PARSER = new AbstractParser<C2S_TreasureUpStage_9407>() {
         public C2S_TreasureUpStage_9407 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TreasureUpStage_9407(input, extensionRegistry);
         }
      };

      private C2S_TreasureUpStage_9407(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TreasureUpStage_9407() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TreasureUpStage_9407();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TreasureUpStage_9407(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.treasureId_ = input.readInt32();
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
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TreasureUpStage_9407_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TreasureUpStage_9407_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureUpStage_9407.class, Builder.class);
      }

      public boolean hasTreasureId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTreasureId() {
         return this.treasureId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTreasureId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.treasureId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.treasureId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TreasureUpStage_9407)) {
            return super.equals(obj);
         } else {
            C2S_TreasureUpStage_9407 other = (C2S_TreasureUpStage_9407)obj;
            if (this.hasTreasureId() != other.hasTreasureId()) {
               return false;
            } else if (this.hasTreasureId() && this.getTreasureId() != other.getTreasureId()) {
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
            if (this.hasTreasureId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTreasureId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TreasureUpStage_9407 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TreasureUpStage_9407)PARSER.parseFrom(data);
      }

      public static C2S_TreasureUpStage_9407 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureUpStage_9407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureUpStage_9407 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TreasureUpStage_9407)PARSER.parseFrom(data);
      }

      public static C2S_TreasureUpStage_9407 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureUpStage_9407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureUpStage_9407 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TreasureUpStage_9407)PARSER.parseFrom(data);
      }

      public static C2S_TreasureUpStage_9407 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureUpStage_9407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureUpStage_9407 parseFrom(InputStream input) throws IOException {
         return (C2S_TreasureUpStage_9407)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureUpStage_9407 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureUpStage_9407)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureUpStage_9407 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TreasureUpStage_9407)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TreasureUpStage_9407 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureUpStage_9407)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureUpStage_9407 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TreasureUpStage_9407)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureUpStage_9407 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureUpStage_9407)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TreasureUpStage_9407 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TreasureUpStage_9407 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TreasureUpStage_9407> parser() {
         return PARSER;
      }

      public Parser<C2S_TreasureUpStage_9407> getParserForType() {
         return PARSER;
      }

      public C2S_TreasureUpStage_9407 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TreasureUpStage_9407OrBuilder {
         private int bitField0_;
         private int treasureId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TreasureUpStage_9407_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TreasureUpStage_9407_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureUpStage_9407.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TreasureMsg.C2S_TreasureUpStage_9407.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.treasureId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TreasureUpStage_9407_descriptor;
         }

         public C2S_TreasureUpStage_9407 getDefaultInstanceForType() {
            return TreasureMsg.C2S_TreasureUpStage_9407.getDefaultInstance();
         }

         public C2S_TreasureUpStage_9407 build() {
            C2S_TreasureUpStage_9407 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TreasureUpStage_9407 buildPartial() {
            C2S_TreasureUpStage_9407 result = new C2S_TreasureUpStage_9407(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.treasureId_ = this.treasureId_;
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
            if (other instanceof C2S_TreasureUpStage_9407) {
               return this.mergeFrom((C2S_TreasureUpStage_9407)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TreasureUpStage_9407 other) {
            if (other == TreasureMsg.C2S_TreasureUpStage_9407.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTreasureId()) {
                  this.setTreasureId(other.getTreasureId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTreasureId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TreasureUpStage_9407 parsedMessage = null;

            try {
               parsedMessage = (C2S_TreasureUpStage_9407)TreasureMsg.C2S_TreasureUpStage_9407.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TreasureUpStage_9407)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTreasureId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTreasureId() {
            return this.treasureId_;
         }

         public Builder setTreasureId(int value) {
            this.bitField0_ |= 1;
            this.treasureId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTreasureId() {
            this.bitField0_ &= -2;
            this.treasureId_ = 0;
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

   public static final class S2C_TreasureUpStage_9408 extends GeneratedMessageV3 implements S2C_TreasureUpStage_9408OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 3;
      private TreasureInfo info_;
      public static final int PROPERTYCHANGES_FIELD_NUMBER = 4;
      private List<CommonMsg.PropertyInfo> propertyChanges_;
      private byte memoizedIsInitialized;
      private static final S2C_TreasureUpStage_9408 DEFAULT_INSTANCE = new S2C_TreasureUpStage_9408();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TreasureUpStage_9408> PARSER = new AbstractParser<S2C_TreasureUpStage_9408>() {
         public S2C_TreasureUpStage_9408 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TreasureUpStage_9408(input, extensionRegistry);
         }
      };

      private S2C_TreasureUpStage_9408(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TreasureUpStage_9408() {
         this.memoizedIsInitialized = -1;
         this.propertyChanges_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TreasureUpStage_9408();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TreasureUpStage_9408(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 26:
                        TreasureInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (TreasureInfo)input.readMessage(TreasureMsg.TreasureInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.propertyChanges_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.propertyChanges_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
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
                  this.propertyChanges_ = Collections.unmodifiableList(this.propertyChanges_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TreasureUpStage_9408_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TreasureUpStage_9408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureUpStage_9408.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public TreasureInfo getInfo() {
         return this.info_ == null ? TreasureMsg.TreasureInfo.getDefaultInstance() : this.info_;
      }

      public TreasureInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? TreasureMsg.TreasureInfo.getDefaultInstance() : this.info_;
      }

      public List<CommonMsg.PropertyInfo> getPropertyChangesList() {
         return this.propertyChanges_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesOrBuilderList() {
         return this.propertyChanges_;
      }

      public int getPropertyChangesCount() {
         return this.propertyChanges_.size();
      }

      public CommonMsg.PropertyInfo getPropertyChanges(int index) {
         return (CommonMsg.PropertyInfo)this.propertyChanges_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getPropertyChangesOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.propertyChanges_.get(index);
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
            for(int i = 0; i < this.getPropertyChangesCount(); ++i) {
               if (!this.getPropertyChanges(i).isInitialized()) {
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
            output.writeMessage(3, this.getInfo());
         }

         for(int i = 0; i < this.propertyChanges_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.propertyChanges_.get(i));
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
               size += CodedOutputStream.computeMessageSize(3, this.getInfo());
            }

            for(int i = 0; i < this.propertyChanges_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.propertyChanges_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TreasureUpStage_9408)) {
            return super.equals(obj);
         } else {
            S2C_TreasureUpStage_9408 other = (S2C_TreasureUpStage_9408)obj;
            if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
               return false;
            } else if (!this.getPropertyChangesList().equals(other.getPropertyChangesList())) {
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
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            if (this.getPropertyChangesCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPropertyChangesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TreasureUpStage_9408 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TreasureUpStage_9408)PARSER.parseFrom(data);
      }

      public static S2C_TreasureUpStage_9408 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureUpStage_9408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureUpStage_9408 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TreasureUpStage_9408)PARSER.parseFrom(data);
      }

      public static S2C_TreasureUpStage_9408 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureUpStage_9408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureUpStage_9408 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TreasureUpStage_9408)PARSER.parseFrom(data);
      }

      public static S2C_TreasureUpStage_9408 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureUpStage_9408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureUpStage_9408 parseFrom(InputStream input) throws IOException {
         return (S2C_TreasureUpStage_9408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureUpStage_9408 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureUpStage_9408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureUpStage_9408 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TreasureUpStage_9408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TreasureUpStage_9408 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureUpStage_9408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureUpStage_9408 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TreasureUpStage_9408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureUpStage_9408 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureUpStage_9408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TreasureUpStage_9408 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TreasureUpStage_9408 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TreasureUpStage_9408> parser() {
         return PARSER;
      }

      public Parser<S2C_TreasureUpStage_9408> getParserForType() {
         return PARSER;
      }

      public S2C_TreasureUpStage_9408 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TreasureUpStage_9408OrBuilder {
         private int bitField0_;
         private TreasureInfo info_;
         private SingleFieldBuilderV3<TreasureInfo, TreasureInfo.Builder, TreasureInfoOrBuilder> infoBuilder_;
         private List<CommonMsg.PropertyInfo> propertyChanges_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> propertyChangesBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TreasureUpStage_9408_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TreasureUpStage_9408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureUpStage_9408.class, Builder.class);
         }

         private Builder() {
            this.propertyChanges_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.propertyChanges_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TreasureMsg.S2C_TreasureUpStage_9408.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
               this.getPropertyChangesFieldBuilder();
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
            if (this.propertyChangesBuilder_ == null) {
               this.propertyChanges_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.propertyChangesBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TreasureUpStage_9408_descriptor;
         }

         public S2C_TreasureUpStage_9408 getDefaultInstanceForType() {
            return TreasureMsg.S2C_TreasureUpStage_9408.getDefaultInstance();
         }

         public S2C_TreasureUpStage_9408 build() {
            S2C_TreasureUpStage_9408 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TreasureUpStage_9408 buildPartial() {
            S2C_TreasureUpStage_9408 result = new S2C_TreasureUpStage_9408(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (TreasureInfo)this.infoBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if (this.propertyChangesBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.propertyChanges_ = Collections.unmodifiableList(this.propertyChanges_);
                  this.bitField0_ &= -3;
               }

               result.propertyChanges_ = this.propertyChanges_;
            } else {
               result.propertyChanges_ = this.propertyChangesBuilder_.build();
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
            if (other instanceof S2C_TreasureUpStage_9408) {
               return this.mergeFrom((S2C_TreasureUpStage_9408)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TreasureUpStage_9408 other) {
            if (other == TreasureMsg.S2C_TreasureUpStage_9408.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               if (this.propertyChangesBuilder_ == null) {
                  if (!other.propertyChanges_.isEmpty()) {
                     if (this.propertyChanges_.isEmpty()) {
                        this.propertyChanges_ = other.propertyChanges_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensurePropertyChangesIsMutable();
                        this.propertyChanges_.addAll(other.propertyChanges_);
                     }

                     this.onChanged();
                  }
               } else if (!other.propertyChanges_.isEmpty()) {
                  if (this.propertyChangesBuilder_.isEmpty()) {
                     this.propertyChangesBuilder_.dispose();
                     this.propertyChangesBuilder_ = null;
                     this.propertyChanges_ = other.propertyChanges_;
                     this.bitField0_ &= -3;
                     this.propertyChangesBuilder_ = TreasureMsg.S2C_TreasureUpStage_9408.alwaysUseFieldBuilders ? this.getPropertyChangesFieldBuilder() : null;
                  } else {
                     this.propertyChangesBuilder_.addAllMessages(other.propertyChanges_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasInfo()) {
               return false;
            } else if (!this.getInfo().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getPropertyChangesCount(); ++i) {
                  if (!this.getPropertyChanges(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TreasureUpStage_9408 parsedMessage = null;

            try {
               parsedMessage = (S2C_TreasureUpStage_9408)TreasureMsg.S2C_TreasureUpStage_9408.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TreasureUpStage_9408)e.getUnfinishedMessage();
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

         public TreasureInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? TreasureMsg.TreasureInfo.getDefaultInstance() : this.info_;
            } else {
               return (TreasureInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(TreasureInfo value) {
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

         public Builder setInfo(TreasureInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(TreasureInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != TreasureMsg.TreasureInfo.getDefaultInstance()) {
                  this.info_ = TreasureMsg.TreasureInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public TreasureInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (TreasureInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public TreasureInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (TreasureInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? TreasureMsg.TreasureInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<TreasureInfo, TreasureInfo.Builder, TreasureInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         private void ensurePropertyChangesIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.propertyChanges_ = new ArrayList(this.propertyChanges_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.PropertyInfo> getPropertyChangesList() {
            return this.propertyChangesBuilder_ == null ? Collections.unmodifiableList(this.propertyChanges_) : this.propertyChangesBuilder_.getMessageList();
         }

         public int getPropertyChangesCount() {
            return this.propertyChangesBuilder_ == null ? this.propertyChanges_.size() : this.propertyChangesBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getPropertyChanges(int index) {
            return this.propertyChangesBuilder_ == null ? (CommonMsg.PropertyInfo)this.propertyChanges_.get(index) : (CommonMsg.PropertyInfo)this.propertyChangesBuilder_.getMessage(index);
         }

         public Builder setPropertyChanges(int index, CommonMsg.PropertyInfo value) {
            if (this.propertyChangesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.set(index, value);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPropertyChanges(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPropertyChanges(CommonMsg.PropertyInfo value) {
            if (this.propertyChangesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(value);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPropertyChanges(int index, CommonMsg.PropertyInfo value) {
            if (this.propertyChangesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(index, value);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPropertyChanges(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPropertyChanges(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPropertyChanges(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.propertyChanges_);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPropertyChanges() {
            if (this.propertyChangesBuilder_ == null) {
               this.propertyChanges_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.clear();
            }

            return this;
         }

         public Builder removePropertyChanges(int index) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.remove(index);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getPropertyChangesBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getPropertyChangesOrBuilder(int index) {
            return this.propertyChangesBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.propertyChanges_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.propertyChangesBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesOrBuilderList() {
            return this.propertyChangesBuilder_ != null ? this.propertyChangesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.propertyChanges_);
         }

         public CommonMsg.PropertyInfo.Builder addPropertyChangesBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addPropertyChangesBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getPropertyChangesBuilderList() {
            return this.getPropertyChangesFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getPropertyChangesFieldBuilder() {
            if (this.propertyChangesBuilder_ == null) {
               this.propertyChangesBuilder_ = new RepeatedFieldBuilderV3(this.propertyChanges_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.propertyChanges_ = null;
            }

            return this.propertyChangesBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_TreasureReset_9409 extends GeneratedMessageV3 implements C2S_TreasureReset_9409OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TREASUREID_FIELD_NUMBER = 1;
      private int treasureId_;
      private byte memoizedIsInitialized;
      private static final C2S_TreasureReset_9409 DEFAULT_INSTANCE = new C2S_TreasureReset_9409();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TreasureReset_9409> PARSER = new AbstractParser<C2S_TreasureReset_9409>() {
         public C2S_TreasureReset_9409 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TreasureReset_9409(input, extensionRegistry);
         }
      };

      private C2S_TreasureReset_9409(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TreasureReset_9409() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TreasureReset_9409();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TreasureReset_9409(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.treasureId_ = input.readInt32();
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
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TreasureReset_9409_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TreasureReset_9409_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureReset_9409.class, Builder.class);
      }

      public boolean hasTreasureId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTreasureId() {
         return this.treasureId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTreasureId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.treasureId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.treasureId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TreasureReset_9409)) {
            return super.equals(obj);
         } else {
            C2S_TreasureReset_9409 other = (C2S_TreasureReset_9409)obj;
            if (this.hasTreasureId() != other.hasTreasureId()) {
               return false;
            } else if (this.hasTreasureId() && this.getTreasureId() != other.getTreasureId()) {
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
            if (this.hasTreasureId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTreasureId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TreasureReset_9409 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TreasureReset_9409)PARSER.parseFrom(data);
      }

      public static C2S_TreasureReset_9409 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureReset_9409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureReset_9409 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TreasureReset_9409)PARSER.parseFrom(data);
      }

      public static C2S_TreasureReset_9409 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureReset_9409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureReset_9409 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TreasureReset_9409)PARSER.parseFrom(data);
      }

      public static C2S_TreasureReset_9409 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureReset_9409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureReset_9409 parseFrom(InputStream input) throws IOException {
         return (C2S_TreasureReset_9409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureReset_9409 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureReset_9409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureReset_9409 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TreasureReset_9409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TreasureReset_9409 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureReset_9409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureReset_9409 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TreasureReset_9409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureReset_9409 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureReset_9409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TreasureReset_9409 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TreasureReset_9409 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TreasureReset_9409> parser() {
         return PARSER;
      }

      public Parser<C2S_TreasureReset_9409> getParserForType() {
         return PARSER;
      }

      public C2S_TreasureReset_9409 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TreasureReset_9409OrBuilder {
         private int bitField0_;
         private int treasureId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TreasureReset_9409_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TreasureReset_9409_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureReset_9409.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TreasureMsg.C2S_TreasureReset_9409.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.treasureId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TreasureReset_9409_descriptor;
         }

         public C2S_TreasureReset_9409 getDefaultInstanceForType() {
            return TreasureMsg.C2S_TreasureReset_9409.getDefaultInstance();
         }

         public C2S_TreasureReset_9409 build() {
            C2S_TreasureReset_9409 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TreasureReset_9409 buildPartial() {
            C2S_TreasureReset_9409 result = new C2S_TreasureReset_9409(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.treasureId_ = this.treasureId_;
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
            if (other instanceof C2S_TreasureReset_9409) {
               return this.mergeFrom((C2S_TreasureReset_9409)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TreasureReset_9409 other) {
            if (other == TreasureMsg.C2S_TreasureReset_9409.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTreasureId()) {
                  this.setTreasureId(other.getTreasureId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTreasureId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TreasureReset_9409 parsedMessage = null;

            try {
               parsedMessage = (C2S_TreasureReset_9409)TreasureMsg.C2S_TreasureReset_9409.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TreasureReset_9409)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTreasureId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTreasureId() {
            return this.treasureId_;
         }

         public Builder setTreasureId(int value) {
            this.bitField0_ |= 1;
            this.treasureId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTreasureId() {
            this.bitField0_ &= -2;
            this.treasureId_ = 0;
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

   public static final class S2C_TreasureReset_9410 extends GeneratedMessageV3 implements S2C_TreasureReset_9410OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 2;
      private TreasureInfo info_;
      public static final int PROPERTYCHANGES_FIELD_NUMBER = 3;
      private List<CommonMsg.PropertyInfo> propertyChanges_;
      private byte memoizedIsInitialized;
      private static final S2C_TreasureReset_9410 DEFAULT_INSTANCE = new S2C_TreasureReset_9410();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TreasureReset_9410> PARSER = new AbstractParser<S2C_TreasureReset_9410>() {
         public S2C_TreasureReset_9410 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TreasureReset_9410(input, extensionRegistry);
         }
      };

      private S2C_TreasureReset_9410(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TreasureReset_9410() {
         this.memoizedIsInitialized = -1;
         this.propertyChanges_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TreasureReset_9410();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TreasureReset_9410(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        TreasureInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (TreasureInfo)input.readMessage(TreasureMsg.TreasureInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.propertyChanges_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.propertyChanges_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
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
                  this.propertyChanges_ = Collections.unmodifiableList(this.propertyChanges_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TreasureReset_9410_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TreasureReset_9410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureReset_9410.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public TreasureInfo getInfo() {
         return this.info_ == null ? TreasureMsg.TreasureInfo.getDefaultInstance() : this.info_;
      }

      public TreasureInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? TreasureMsg.TreasureInfo.getDefaultInstance() : this.info_;
      }

      public List<CommonMsg.PropertyInfo> getPropertyChangesList() {
         return this.propertyChanges_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesOrBuilderList() {
         return this.propertyChanges_;
      }

      public int getPropertyChangesCount() {
         return this.propertyChanges_.size();
      }

      public CommonMsg.PropertyInfo getPropertyChanges(int index) {
         return (CommonMsg.PropertyInfo)this.propertyChanges_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getPropertyChangesOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.propertyChanges_.get(index);
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
            for(int i = 0; i < this.getPropertyChangesCount(); ++i) {
               if (!this.getPropertyChanges(i).isInitialized()) {
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
            output.writeMessage(2, this.getInfo());
         }

         for(int i = 0; i < this.propertyChanges_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.propertyChanges_.get(i));
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

            for(int i = 0; i < this.propertyChanges_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.propertyChanges_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TreasureReset_9410)) {
            return super.equals(obj);
         } else {
            S2C_TreasureReset_9410 other = (S2C_TreasureReset_9410)obj;
            if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
               return false;
            } else if (!this.getPropertyChangesList().equals(other.getPropertyChangesList())) {
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

            if (this.getPropertyChangesCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPropertyChangesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TreasureReset_9410 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TreasureReset_9410)PARSER.parseFrom(data);
      }

      public static S2C_TreasureReset_9410 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureReset_9410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureReset_9410 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TreasureReset_9410)PARSER.parseFrom(data);
      }

      public static S2C_TreasureReset_9410 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureReset_9410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureReset_9410 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TreasureReset_9410)PARSER.parseFrom(data);
      }

      public static S2C_TreasureReset_9410 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureReset_9410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureReset_9410 parseFrom(InputStream input) throws IOException {
         return (S2C_TreasureReset_9410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureReset_9410 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureReset_9410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureReset_9410 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TreasureReset_9410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TreasureReset_9410 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureReset_9410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureReset_9410 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TreasureReset_9410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureReset_9410 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureReset_9410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TreasureReset_9410 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TreasureReset_9410 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TreasureReset_9410> parser() {
         return PARSER;
      }

      public Parser<S2C_TreasureReset_9410> getParserForType() {
         return PARSER;
      }

      public S2C_TreasureReset_9410 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TreasureReset_9410OrBuilder {
         private int bitField0_;
         private TreasureInfo info_;
         private SingleFieldBuilderV3<TreasureInfo, TreasureInfo.Builder, TreasureInfoOrBuilder> infoBuilder_;
         private List<CommonMsg.PropertyInfo> propertyChanges_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> propertyChangesBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TreasureReset_9410_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TreasureReset_9410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureReset_9410.class, Builder.class);
         }

         private Builder() {
            this.propertyChanges_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.propertyChanges_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TreasureMsg.S2C_TreasureReset_9410.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
               this.getPropertyChangesFieldBuilder();
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
            if (this.propertyChangesBuilder_ == null) {
               this.propertyChanges_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.propertyChangesBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TreasureReset_9410_descriptor;
         }

         public S2C_TreasureReset_9410 getDefaultInstanceForType() {
            return TreasureMsg.S2C_TreasureReset_9410.getDefaultInstance();
         }

         public S2C_TreasureReset_9410 build() {
            S2C_TreasureReset_9410 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TreasureReset_9410 buildPartial() {
            S2C_TreasureReset_9410 result = new S2C_TreasureReset_9410(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (TreasureInfo)this.infoBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if (this.propertyChangesBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.propertyChanges_ = Collections.unmodifiableList(this.propertyChanges_);
                  this.bitField0_ &= -3;
               }

               result.propertyChanges_ = this.propertyChanges_;
            } else {
               result.propertyChanges_ = this.propertyChangesBuilder_.build();
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
            if (other instanceof S2C_TreasureReset_9410) {
               return this.mergeFrom((S2C_TreasureReset_9410)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TreasureReset_9410 other) {
            if (other == TreasureMsg.S2C_TreasureReset_9410.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               if (this.propertyChangesBuilder_ == null) {
                  if (!other.propertyChanges_.isEmpty()) {
                     if (this.propertyChanges_.isEmpty()) {
                        this.propertyChanges_ = other.propertyChanges_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensurePropertyChangesIsMutable();
                        this.propertyChanges_.addAll(other.propertyChanges_);
                     }

                     this.onChanged();
                  }
               } else if (!other.propertyChanges_.isEmpty()) {
                  if (this.propertyChangesBuilder_.isEmpty()) {
                     this.propertyChangesBuilder_.dispose();
                     this.propertyChangesBuilder_ = null;
                     this.propertyChanges_ = other.propertyChanges_;
                     this.bitField0_ &= -3;
                     this.propertyChangesBuilder_ = TreasureMsg.S2C_TreasureReset_9410.alwaysUseFieldBuilders ? this.getPropertyChangesFieldBuilder() : null;
                  } else {
                     this.propertyChangesBuilder_.addAllMessages(other.propertyChanges_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasInfo()) {
               return false;
            } else if (!this.getInfo().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getPropertyChangesCount(); ++i) {
                  if (!this.getPropertyChanges(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TreasureReset_9410 parsedMessage = null;

            try {
               parsedMessage = (S2C_TreasureReset_9410)TreasureMsg.S2C_TreasureReset_9410.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TreasureReset_9410)e.getUnfinishedMessage();
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

         public TreasureInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? TreasureMsg.TreasureInfo.getDefaultInstance() : this.info_;
            } else {
               return (TreasureInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(TreasureInfo value) {
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

         public Builder setInfo(TreasureInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(TreasureInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != TreasureMsg.TreasureInfo.getDefaultInstance()) {
                  this.info_ = TreasureMsg.TreasureInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public TreasureInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (TreasureInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public TreasureInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (TreasureInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? TreasureMsg.TreasureInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<TreasureInfo, TreasureInfo.Builder, TreasureInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         private void ensurePropertyChangesIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.propertyChanges_ = new ArrayList(this.propertyChanges_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.PropertyInfo> getPropertyChangesList() {
            return this.propertyChangesBuilder_ == null ? Collections.unmodifiableList(this.propertyChanges_) : this.propertyChangesBuilder_.getMessageList();
         }

         public int getPropertyChangesCount() {
            return this.propertyChangesBuilder_ == null ? this.propertyChanges_.size() : this.propertyChangesBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getPropertyChanges(int index) {
            return this.propertyChangesBuilder_ == null ? (CommonMsg.PropertyInfo)this.propertyChanges_.get(index) : (CommonMsg.PropertyInfo)this.propertyChangesBuilder_.getMessage(index);
         }

         public Builder setPropertyChanges(int index, CommonMsg.PropertyInfo value) {
            if (this.propertyChangesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.set(index, value);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPropertyChanges(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPropertyChanges(CommonMsg.PropertyInfo value) {
            if (this.propertyChangesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(value);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPropertyChanges(int index, CommonMsg.PropertyInfo value) {
            if (this.propertyChangesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(index, value);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPropertyChanges(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPropertyChanges(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPropertyChanges(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.propertyChanges_);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPropertyChanges() {
            if (this.propertyChangesBuilder_ == null) {
               this.propertyChanges_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.clear();
            }

            return this;
         }

         public Builder removePropertyChanges(int index) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.remove(index);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getPropertyChangesBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getPropertyChangesOrBuilder(int index) {
            return this.propertyChangesBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.propertyChanges_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.propertyChangesBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesOrBuilderList() {
            return this.propertyChangesBuilder_ != null ? this.propertyChangesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.propertyChanges_);
         }

         public CommonMsg.PropertyInfo.Builder addPropertyChangesBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addPropertyChangesBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getPropertyChangesBuilderList() {
            return this.getPropertyChangesFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getPropertyChangesFieldBuilder() {
            if (this.propertyChangesBuilder_ == null) {
               this.propertyChangesBuilder_ = new RepeatedFieldBuilderV3(this.propertyChanges_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.propertyChanges_ = null;
            }

            return this.propertyChangesBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class TreasureTransferCostInfo extends GeneratedMessageV3 implements TreasureTransferCostInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMID_FIELD_NUMBER = 1;
      private int itemId_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final TreasureTransferCostInfo DEFAULT_INSTANCE = new TreasureTransferCostInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<TreasureTransferCostInfo> PARSER = new AbstractParser<TreasureTransferCostInfo>() {
         public TreasureTransferCostInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new TreasureTransferCostInfo(input, extensionRegistry);
         }
      };

      private TreasureTransferCostInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private TreasureTransferCostInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new TreasureTransferCostInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private TreasureTransferCostInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.itemId_ = input.readInt32();
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
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_TreasureTransferCostInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_TreasureTransferCostInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TreasureTransferCostInfo.class, Builder.class);
      }

      public boolean hasItemId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getItemId() {
         return this.itemId_;
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
            output.writeInt32(1, this.itemId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.itemId_);
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
         } else if (!(obj instanceof TreasureTransferCostInfo)) {
            return super.equals(obj);
         } else {
            TreasureTransferCostInfo other = (TreasureTransferCostInfo)obj;
            if (this.hasItemId() != other.hasItemId()) {
               return false;
            } else if (this.hasItemId() && this.getItemId() != other.getItemId()) {
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
            if (this.hasItemId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemId();
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

      public static TreasureTransferCostInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (TreasureTransferCostInfo)PARSER.parseFrom(data);
      }

      public static TreasureTransferCostInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TreasureTransferCostInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TreasureTransferCostInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (TreasureTransferCostInfo)PARSER.parseFrom(data);
      }

      public static TreasureTransferCostInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TreasureTransferCostInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TreasureTransferCostInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (TreasureTransferCostInfo)PARSER.parseFrom(data);
      }

      public static TreasureTransferCostInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TreasureTransferCostInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TreasureTransferCostInfo parseFrom(InputStream input) throws IOException {
         return (TreasureTransferCostInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TreasureTransferCostInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TreasureTransferCostInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static TreasureTransferCostInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (TreasureTransferCostInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static TreasureTransferCostInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TreasureTransferCostInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static TreasureTransferCostInfo parseFrom(CodedInputStream input) throws IOException {
         return (TreasureTransferCostInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TreasureTransferCostInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TreasureTransferCostInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(TreasureTransferCostInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static TreasureTransferCostInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<TreasureTransferCostInfo> parser() {
         return PARSER;
      }

      public Parser<TreasureTransferCostInfo> getParserForType() {
         return PARSER;
      }

      public TreasureTransferCostInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TreasureTransferCostInfoOrBuilder {
         private int bitField0_;
         private int itemId_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_TreasureTransferCostInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_TreasureTransferCostInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TreasureTransferCostInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TreasureMsg.TreasureTransferCostInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemId_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_TreasureTransferCostInfo_descriptor;
         }

         public TreasureTransferCostInfo getDefaultInstanceForType() {
            return TreasureMsg.TreasureTransferCostInfo.getDefaultInstance();
         }

         public TreasureTransferCostInfo build() {
            TreasureTransferCostInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public TreasureTransferCostInfo buildPartial() {
            TreasureTransferCostInfo result = new TreasureTransferCostInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.itemId_ = this.itemId_;
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
            if (other instanceof TreasureTransferCostInfo) {
               return this.mergeFrom((TreasureTransferCostInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(TreasureTransferCostInfo other) {
            if (other == TreasureMsg.TreasureTransferCostInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasItemId()) {
                  this.setItemId(other.getItemId());
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
            if (!this.hasItemId()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            TreasureTransferCostInfo parsedMessage = null;

            try {
               parsedMessage = (TreasureTransferCostInfo)TreasureMsg.TreasureTransferCostInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (TreasureTransferCostInfo)e.getUnfinishedMessage();
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

   public static final class C2S_TransferTreasureItem_9411 extends GeneratedMessageV3 implements C2S_TransferTreasureItem_9411OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TRANSFERINFO_FIELD_NUMBER = 1;
      private List<TreasureTransferCostInfo> transferInfo_;
      public static final int TARGETITEMID_FIELD_NUMBER = 2;
      private int targetItemId_;
      private byte memoizedIsInitialized;
      private static final C2S_TransferTreasureItem_9411 DEFAULT_INSTANCE = new C2S_TransferTreasureItem_9411();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TransferTreasureItem_9411> PARSER = new AbstractParser<C2S_TransferTreasureItem_9411>() {
         public C2S_TransferTreasureItem_9411 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TransferTreasureItem_9411(input, extensionRegistry);
         }
      };

      private C2S_TransferTreasureItem_9411(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TransferTreasureItem_9411() {
         this.memoizedIsInitialized = -1;
         this.transferInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TransferTreasureItem_9411();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TransferTreasureItem_9411(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.transferInfo_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.transferInfo_.add(input.readMessage(TreasureMsg.TreasureTransferCostInfo.PARSER, extensionRegistry));
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.targetItemId_ = input.readInt32();
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
                  this.transferInfo_ = Collections.unmodifiableList(this.transferInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TransferTreasureItem_9411_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TransferTreasureItem_9411_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TransferTreasureItem_9411.class, Builder.class);
      }

      public List<TreasureTransferCostInfo> getTransferInfoList() {
         return this.transferInfo_;
      }

      public List<? extends TreasureTransferCostInfoOrBuilder> getTransferInfoOrBuilderList() {
         return this.transferInfo_;
      }

      public int getTransferInfoCount() {
         return this.transferInfo_.size();
      }

      public TreasureTransferCostInfo getTransferInfo(int index) {
         return (TreasureTransferCostInfo)this.transferInfo_.get(index);
      }

      public TreasureTransferCostInfoOrBuilder getTransferInfoOrBuilder(int index) {
         return (TreasureTransferCostInfoOrBuilder)this.transferInfo_.get(index);
      }

      public boolean hasTargetItemId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTargetItemId() {
         return this.targetItemId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTargetItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getTransferInfoCount(); ++i) {
               if (!this.getTransferInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.transferInfo_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.transferInfo_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.targetItemId_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.transferInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.transferInfo_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.targetItemId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TransferTreasureItem_9411)) {
            return super.equals(obj);
         } else {
            C2S_TransferTreasureItem_9411 other = (C2S_TransferTreasureItem_9411)obj;
            if (!this.getTransferInfoList().equals(other.getTransferInfoList())) {
               return false;
            } else if (this.hasTargetItemId() != other.hasTargetItemId()) {
               return false;
            } else if (this.hasTargetItemId() && this.getTargetItemId() != other.getTargetItemId()) {
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
            if (this.getTransferInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTransferInfoList().hashCode();
            }

            if (this.hasTargetItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTargetItemId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TransferTreasureItem_9411 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TransferTreasureItem_9411)PARSER.parseFrom(data);
      }

      public static C2S_TransferTreasureItem_9411 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TransferTreasureItem_9411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TransferTreasureItem_9411 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TransferTreasureItem_9411)PARSER.parseFrom(data);
      }

      public static C2S_TransferTreasureItem_9411 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TransferTreasureItem_9411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TransferTreasureItem_9411 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TransferTreasureItem_9411)PARSER.parseFrom(data);
      }

      public static C2S_TransferTreasureItem_9411 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TransferTreasureItem_9411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TransferTreasureItem_9411 parseFrom(InputStream input) throws IOException {
         return (C2S_TransferTreasureItem_9411)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TransferTreasureItem_9411 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TransferTreasureItem_9411)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TransferTreasureItem_9411 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TransferTreasureItem_9411)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TransferTreasureItem_9411 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TransferTreasureItem_9411)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TransferTreasureItem_9411 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TransferTreasureItem_9411)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TransferTreasureItem_9411 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TransferTreasureItem_9411)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TransferTreasureItem_9411 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TransferTreasureItem_9411 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TransferTreasureItem_9411> parser() {
         return PARSER;
      }

      public Parser<C2S_TransferTreasureItem_9411> getParserForType() {
         return PARSER;
      }

      public C2S_TransferTreasureItem_9411 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TransferTreasureItem_9411OrBuilder {
         private int bitField0_;
         private List<TreasureTransferCostInfo> transferInfo_;
         private RepeatedFieldBuilderV3<TreasureTransferCostInfo, TreasureTransferCostInfo.Builder, TreasureTransferCostInfoOrBuilder> transferInfoBuilder_;
         private int targetItemId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TransferTreasureItem_9411_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TransferTreasureItem_9411_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TransferTreasureItem_9411.class, Builder.class);
         }

         private Builder() {
            this.transferInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.transferInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TreasureMsg.C2S_TransferTreasureItem_9411.alwaysUseFieldBuilders) {
               this.getTransferInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.transferInfoBuilder_ == null) {
               this.transferInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.transferInfoBuilder_.clear();
            }

            this.targetItemId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TransferTreasureItem_9411_descriptor;
         }

         public C2S_TransferTreasureItem_9411 getDefaultInstanceForType() {
            return TreasureMsg.C2S_TransferTreasureItem_9411.getDefaultInstance();
         }

         public C2S_TransferTreasureItem_9411 build() {
            C2S_TransferTreasureItem_9411 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TransferTreasureItem_9411 buildPartial() {
            C2S_TransferTreasureItem_9411 result = new C2S_TransferTreasureItem_9411(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.transferInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.transferInfo_ = Collections.unmodifiableList(this.transferInfo_);
                  this.bitField0_ &= -2;
               }

               result.transferInfo_ = this.transferInfo_;
            } else {
               result.transferInfo_ = this.transferInfoBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               result.targetItemId_ = this.targetItemId_;
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
            if (other instanceof C2S_TransferTreasureItem_9411) {
               return this.mergeFrom((C2S_TransferTreasureItem_9411)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TransferTreasureItem_9411 other) {
            if (other == TreasureMsg.C2S_TransferTreasureItem_9411.getDefaultInstance()) {
               return this;
            } else {
               if (this.transferInfoBuilder_ == null) {
                  if (!other.transferInfo_.isEmpty()) {
                     if (this.transferInfo_.isEmpty()) {
                        this.transferInfo_ = other.transferInfo_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTransferInfoIsMutable();
                        this.transferInfo_.addAll(other.transferInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.transferInfo_.isEmpty()) {
                  if (this.transferInfoBuilder_.isEmpty()) {
                     this.transferInfoBuilder_.dispose();
                     this.transferInfoBuilder_ = null;
                     this.transferInfo_ = other.transferInfo_;
                     this.bitField0_ &= -2;
                     this.transferInfoBuilder_ = TreasureMsg.C2S_TransferTreasureItem_9411.alwaysUseFieldBuilders ? this.getTransferInfoFieldBuilder() : null;
                  } else {
                     this.transferInfoBuilder_.addAllMessages(other.transferInfo_);
                  }
               }

               if (other.hasTargetItemId()) {
                  this.setTargetItemId(other.getTargetItemId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTargetItemId()) {
               return false;
            } else {
               for(int i = 0; i < this.getTransferInfoCount(); ++i) {
                  if (!this.getTransferInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TransferTreasureItem_9411 parsedMessage = null;

            try {
               parsedMessage = (C2S_TransferTreasureItem_9411)TreasureMsg.C2S_TransferTreasureItem_9411.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TransferTreasureItem_9411)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTransferInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.transferInfo_ = new ArrayList(this.transferInfo_);
               this.bitField0_ |= 1;
            }

         }

         public List<TreasureTransferCostInfo> getTransferInfoList() {
            return this.transferInfoBuilder_ == null ? Collections.unmodifiableList(this.transferInfo_) : this.transferInfoBuilder_.getMessageList();
         }

         public int getTransferInfoCount() {
            return this.transferInfoBuilder_ == null ? this.transferInfo_.size() : this.transferInfoBuilder_.getCount();
         }

         public TreasureTransferCostInfo getTransferInfo(int index) {
            return this.transferInfoBuilder_ == null ? (TreasureTransferCostInfo)this.transferInfo_.get(index) : (TreasureTransferCostInfo)this.transferInfoBuilder_.getMessage(index);
         }

         public Builder setTransferInfo(int index, TreasureTransferCostInfo value) {
            if (this.transferInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTransferInfoIsMutable();
               this.transferInfo_.set(index, value);
               this.onChanged();
            } else {
               this.transferInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTransferInfo(int index, TreasureTransferCostInfo.Builder builderForValue) {
            if (this.transferInfoBuilder_ == null) {
               this.ensureTransferInfoIsMutable();
               this.transferInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.transferInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTransferInfo(TreasureTransferCostInfo value) {
            if (this.transferInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTransferInfoIsMutable();
               this.transferInfo_.add(value);
               this.onChanged();
            } else {
               this.transferInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTransferInfo(int index, TreasureTransferCostInfo value) {
            if (this.transferInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTransferInfoIsMutable();
               this.transferInfo_.add(index, value);
               this.onChanged();
            } else {
               this.transferInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTransferInfo(TreasureTransferCostInfo.Builder builderForValue) {
            if (this.transferInfoBuilder_ == null) {
               this.ensureTransferInfoIsMutable();
               this.transferInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.transferInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTransferInfo(int index, TreasureTransferCostInfo.Builder builderForValue) {
            if (this.transferInfoBuilder_ == null) {
               this.ensureTransferInfoIsMutable();
               this.transferInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.transferInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTransferInfo(Iterable<? extends TreasureTransferCostInfo> values) {
            if (this.transferInfoBuilder_ == null) {
               this.ensureTransferInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.transferInfo_);
               this.onChanged();
            } else {
               this.transferInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTransferInfo() {
            if (this.transferInfoBuilder_ == null) {
               this.transferInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.transferInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeTransferInfo(int index) {
            if (this.transferInfoBuilder_ == null) {
               this.ensureTransferInfoIsMutable();
               this.transferInfo_.remove(index);
               this.onChanged();
            } else {
               this.transferInfoBuilder_.remove(index);
            }

            return this;
         }

         public TreasureTransferCostInfo.Builder getTransferInfoBuilder(int index) {
            return (TreasureTransferCostInfo.Builder)this.getTransferInfoFieldBuilder().getBuilder(index);
         }

         public TreasureTransferCostInfoOrBuilder getTransferInfoOrBuilder(int index) {
            return this.transferInfoBuilder_ == null ? (TreasureTransferCostInfoOrBuilder)this.transferInfo_.get(index) : (TreasureTransferCostInfoOrBuilder)this.transferInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends TreasureTransferCostInfoOrBuilder> getTransferInfoOrBuilderList() {
            return this.transferInfoBuilder_ != null ? this.transferInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.transferInfo_);
         }

         public TreasureTransferCostInfo.Builder addTransferInfoBuilder() {
            return (TreasureTransferCostInfo.Builder)this.getTransferInfoFieldBuilder().addBuilder(TreasureMsg.TreasureTransferCostInfo.getDefaultInstance());
         }

         public TreasureTransferCostInfo.Builder addTransferInfoBuilder(int index) {
            return (TreasureTransferCostInfo.Builder)this.getTransferInfoFieldBuilder().addBuilder(index, TreasureMsg.TreasureTransferCostInfo.getDefaultInstance());
         }

         public List<TreasureTransferCostInfo.Builder> getTransferInfoBuilderList() {
            return this.getTransferInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<TreasureTransferCostInfo, TreasureTransferCostInfo.Builder, TreasureTransferCostInfoOrBuilder> getTransferInfoFieldBuilder() {
            if (this.transferInfoBuilder_ == null) {
               this.transferInfoBuilder_ = new RepeatedFieldBuilderV3(this.transferInfo_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.transferInfo_ = null;
            }

            return this.transferInfoBuilder_;
         }

         public boolean hasTargetItemId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTargetItemId() {
            return this.targetItemId_;
         }

         public Builder setTargetItemId(int value) {
            this.bitField0_ |= 2;
            this.targetItemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTargetItemId() {
            this.bitField0_ &= -3;
            this.targetItemId_ = 0;
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

   public static final class S2C_TransferTreasureItem_9412 extends GeneratedMessageV3 implements S2C_TransferTreasureItem_9412OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_TransferTreasureItem_9412 DEFAULT_INSTANCE = new S2C_TransferTreasureItem_9412();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TransferTreasureItem_9412> PARSER = new AbstractParser<S2C_TransferTreasureItem_9412>() {
         public S2C_TransferTreasureItem_9412 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TransferTreasureItem_9412(input, extensionRegistry);
         }
      };

      private S2C_TransferTreasureItem_9412(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TransferTreasureItem_9412() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TransferTreasureItem_9412();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TransferTreasureItem_9412(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TransferTreasureItem_9412_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TransferTreasureItem_9412_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TransferTreasureItem_9412.class, Builder.class);
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
         } else if (!(obj instanceof S2C_TransferTreasureItem_9412)) {
            return super.equals(obj);
         } else {
            S2C_TransferTreasureItem_9412 other = (S2C_TransferTreasureItem_9412)obj;
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

      public static S2C_TransferTreasureItem_9412 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TransferTreasureItem_9412)PARSER.parseFrom(data);
      }

      public static S2C_TransferTreasureItem_9412 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TransferTreasureItem_9412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TransferTreasureItem_9412 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TransferTreasureItem_9412)PARSER.parseFrom(data);
      }

      public static S2C_TransferTreasureItem_9412 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TransferTreasureItem_9412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TransferTreasureItem_9412 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TransferTreasureItem_9412)PARSER.parseFrom(data);
      }

      public static S2C_TransferTreasureItem_9412 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TransferTreasureItem_9412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TransferTreasureItem_9412 parseFrom(InputStream input) throws IOException {
         return (S2C_TransferTreasureItem_9412)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TransferTreasureItem_9412 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TransferTreasureItem_9412)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TransferTreasureItem_9412 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TransferTreasureItem_9412)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TransferTreasureItem_9412 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TransferTreasureItem_9412)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TransferTreasureItem_9412 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TransferTreasureItem_9412)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TransferTreasureItem_9412 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TransferTreasureItem_9412)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TransferTreasureItem_9412 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TransferTreasureItem_9412 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TransferTreasureItem_9412> parser() {
         return PARSER;
      }

      public Parser<S2C_TransferTreasureItem_9412> getParserForType() {
         return PARSER;
      }

      public S2C_TransferTreasureItem_9412 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TransferTreasureItem_9412OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TransferTreasureItem_9412_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TransferTreasureItem_9412_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TransferTreasureItem_9412.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TreasureMsg.S2C_TransferTreasureItem_9412.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TransferTreasureItem_9412_descriptor;
         }

         public S2C_TransferTreasureItem_9412 getDefaultInstanceForType() {
            return TreasureMsg.S2C_TransferTreasureItem_9412.getDefaultInstance();
         }

         public S2C_TransferTreasureItem_9412 build() {
            S2C_TransferTreasureItem_9412 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TransferTreasureItem_9412 buildPartial() {
            S2C_TransferTreasureItem_9412 result = new S2C_TransferTreasureItem_9412(this);
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
            if (other instanceof S2C_TransferTreasureItem_9412) {
               return this.mergeFrom((S2C_TransferTreasureItem_9412)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TransferTreasureItem_9412 other) {
            if (other == TreasureMsg.S2C_TransferTreasureItem_9412.getDefaultInstance()) {
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
            S2C_TransferTreasureItem_9412 parsedMessage = null;

            try {
               parsedMessage = (S2C_TransferTreasureItem_9412)TreasureMsg.S2C_TransferTreasureItem_9412.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TransferTreasureItem_9412)e.getUnfinishedMessage();
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

   public static final class C2S_TreasureResetLv_9413 extends GeneratedMessageV3 implements C2S_TreasureResetLv_9413OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TREASUREID_FIELD_NUMBER = 1;
      private int treasureId_;
      private byte memoizedIsInitialized;
      private static final C2S_TreasureResetLv_9413 DEFAULT_INSTANCE = new C2S_TreasureResetLv_9413();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TreasureResetLv_9413> PARSER = new AbstractParser<C2S_TreasureResetLv_9413>() {
         public C2S_TreasureResetLv_9413 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TreasureResetLv_9413(input, extensionRegistry);
         }
      };

      private C2S_TreasureResetLv_9413(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TreasureResetLv_9413() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TreasureResetLv_9413();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TreasureResetLv_9413(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.treasureId_ = input.readInt32();
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
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TreasureResetLv_9413_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TreasureResetLv_9413_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureResetLv_9413.class, Builder.class);
      }

      public boolean hasTreasureId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTreasureId() {
         return this.treasureId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTreasureId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.treasureId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.treasureId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TreasureResetLv_9413)) {
            return super.equals(obj);
         } else {
            C2S_TreasureResetLv_9413 other = (C2S_TreasureResetLv_9413)obj;
            if (this.hasTreasureId() != other.hasTreasureId()) {
               return false;
            } else if (this.hasTreasureId() && this.getTreasureId() != other.getTreasureId()) {
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
            if (this.hasTreasureId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTreasureId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TreasureResetLv_9413 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TreasureResetLv_9413)PARSER.parseFrom(data);
      }

      public static C2S_TreasureResetLv_9413 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureResetLv_9413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureResetLv_9413 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TreasureResetLv_9413)PARSER.parseFrom(data);
      }

      public static C2S_TreasureResetLv_9413 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureResetLv_9413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureResetLv_9413 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TreasureResetLv_9413)PARSER.parseFrom(data);
      }

      public static C2S_TreasureResetLv_9413 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureResetLv_9413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureResetLv_9413 parseFrom(InputStream input) throws IOException {
         return (C2S_TreasureResetLv_9413)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureResetLv_9413 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureResetLv_9413)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureResetLv_9413 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TreasureResetLv_9413)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TreasureResetLv_9413 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureResetLv_9413)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureResetLv_9413 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TreasureResetLv_9413)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureResetLv_9413 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureResetLv_9413)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TreasureResetLv_9413 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TreasureResetLv_9413 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TreasureResetLv_9413> parser() {
         return PARSER;
      }

      public Parser<C2S_TreasureResetLv_9413> getParserForType() {
         return PARSER;
      }

      public C2S_TreasureResetLv_9413 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TreasureResetLv_9413OrBuilder {
         private int bitField0_;
         private int treasureId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TreasureResetLv_9413_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TreasureResetLv_9413_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureResetLv_9413.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TreasureMsg.C2S_TreasureResetLv_9413.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.treasureId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_TreasureResetLv_9413_descriptor;
         }

         public C2S_TreasureResetLv_9413 getDefaultInstanceForType() {
            return TreasureMsg.C2S_TreasureResetLv_9413.getDefaultInstance();
         }

         public C2S_TreasureResetLv_9413 build() {
            C2S_TreasureResetLv_9413 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TreasureResetLv_9413 buildPartial() {
            C2S_TreasureResetLv_9413 result = new C2S_TreasureResetLv_9413(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.treasureId_ = this.treasureId_;
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
            if (other instanceof C2S_TreasureResetLv_9413) {
               return this.mergeFrom((C2S_TreasureResetLv_9413)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TreasureResetLv_9413 other) {
            if (other == TreasureMsg.C2S_TreasureResetLv_9413.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTreasureId()) {
                  this.setTreasureId(other.getTreasureId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTreasureId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TreasureResetLv_9413 parsedMessage = null;

            try {
               parsedMessage = (C2S_TreasureResetLv_9413)TreasureMsg.C2S_TreasureResetLv_9413.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TreasureResetLv_9413)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTreasureId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTreasureId() {
            return this.treasureId_;
         }

         public Builder setTreasureId(int value) {
            this.bitField0_ |= 1;
            this.treasureId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTreasureId() {
            this.bitField0_ &= -2;
            this.treasureId_ = 0;
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

   public static final class S2C_TreasureResetLv_9414 extends GeneratedMessageV3 implements S2C_TreasureResetLv_9414OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 2;
      private TreasureInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_TreasureResetLv_9414 DEFAULT_INSTANCE = new S2C_TreasureResetLv_9414();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TreasureResetLv_9414> PARSER = new AbstractParser<S2C_TreasureResetLv_9414>() {
         public S2C_TreasureResetLv_9414 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TreasureResetLv_9414(input, extensionRegistry);
         }
      };

      private S2C_TreasureResetLv_9414(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TreasureResetLv_9414() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TreasureResetLv_9414();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TreasureResetLv_9414(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        TreasureInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (TreasureInfo)input.readMessage(TreasureMsg.TreasureInfo.PARSER, extensionRegistry);
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
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TreasureResetLv_9414_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TreasureResetLv_9414_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureResetLv_9414.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public TreasureInfo getInfo() {
         return this.info_ == null ? TreasureMsg.TreasureInfo.getDefaultInstance() : this.info_;
      }

      public TreasureInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? TreasureMsg.TreasureInfo.getDefaultInstance() : this.info_;
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
         } else if (!(obj instanceof S2C_TreasureResetLv_9414)) {
            return super.equals(obj);
         } else {
            S2C_TreasureResetLv_9414 other = (S2C_TreasureResetLv_9414)obj;
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

      public static S2C_TreasureResetLv_9414 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TreasureResetLv_9414)PARSER.parseFrom(data);
      }

      public static S2C_TreasureResetLv_9414 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureResetLv_9414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureResetLv_9414 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TreasureResetLv_9414)PARSER.parseFrom(data);
      }

      public static S2C_TreasureResetLv_9414 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureResetLv_9414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureResetLv_9414 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TreasureResetLv_9414)PARSER.parseFrom(data);
      }

      public static S2C_TreasureResetLv_9414 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TreasureResetLv_9414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TreasureResetLv_9414 parseFrom(InputStream input) throws IOException {
         return (S2C_TreasureResetLv_9414)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureResetLv_9414 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureResetLv_9414)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureResetLv_9414 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TreasureResetLv_9414)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TreasureResetLv_9414 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureResetLv_9414)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TreasureResetLv_9414 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TreasureResetLv_9414)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TreasureResetLv_9414 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TreasureResetLv_9414)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TreasureResetLv_9414 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TreasureResetLv_9414 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TreasureResetLv_9414> parser() {
         return PARSER;
      }

      public Parser<S2C_TreasureResetLv_9414> getParserForType() {
         return PARSER;
      }

      public S2C_TreasureResetLv_9414 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TreasureResetLv_9414OrBuilder {
         private int bitField0_;
         private TreasureInfo info_;
         private SingleFieldBuilderV3<TreasureInfo, TreasureInfo.Builder, TreasureInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TreasureResetLv_9414_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TreasureResetLv_9414_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TreasureResetLv_9414.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TreasureMsg.S2C_TreasureResetLv_9414.alwaysUseFieldBuilders) {
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
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_TreasureResetLv_9414_descriptor;
         }

         public S2C_TreasureResetLv_9414 getDefaultInstanceForType() {
            return TreasureMsg.S2C_TreasureResetLv_9414.getDefaultInstance();
         }

         public S2C_TreasureResetLv_9414 build() {
            S2C_TreasureResetLv_9414 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TreasureResetLv_9414 buildPartial() {
            S2C_TreasureResetLv_9414 result = new S2C_TreasureResetLv_9414(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (TreasureInfo)this.infoBuilder_.build();
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
            if (other instanceof S2C_TreasureResetLv_9414) {
               return this.mergeFrom((S2C_TreasureResetLv_9414)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TreasureResetLv_9414 other) {
            if (other == TreasureMsg.S2C_TreasureResetLv_9414.getDefaultInstance()) {
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
            S2C_TreasureResetLv_9414 parsedMessage = null;

            try {
               parsedMessage = (S2C_TreasureResetLv_9414)TreasureMsg.S2C_TreasureResetLv_9414.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TreasureResetLv_9414)e.getUnfinishedMessage();
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

         public TreasureInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? TreasureMsg.TreasureInfo.getDefaultInstance() : this.info_;
            } else {
               return (TreasureInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(TreasureInfo value) {
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

         public Builder setInfo(TreasureInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(TreasureInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != TreasureMsg.TreasureInfo.getDefaultInstance()) {
                  this.info_ = TreasureMsg.TreasureInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public TreasureInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (TreasureInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public TreasureInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (TreasureInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? TreasureMsg.TreasureInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<TreasureInfo, TreasureInfo.Builder, TreasureInfoOrBuilder> getInfoFieldBuilder() {
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

   public static final class C2S_ResetLvResource_9415 extends GeneratedMessageV3 implements C2S_ResetLvResource_9415OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TREASUREID_FIELD_NUMBER = 1;
      private int treasureId_;
      private byte memoizedIsInitialized;
      private static final C2S_ResetLvResource_9415 DEFAULT_INSTANCE = new C2S_ResetLvResource_9415();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ResetLvResource_9415> PARSER = new AbstractParser<C2S_ResetLvResource_9415>() {
         public C2S_ResetLvResource_9415 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ResetLvResource_9415(input, extensionRegistry);
         }
      };

      private C2S_ResetLvResource_9415(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ResetLvResource_9415() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ResetLvResource_9415();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ResetLvResource_9415(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.treasureId_ = input.readInt32();
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
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_ResetLvResource_9415_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_ResetLvResource_9415_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ResetLvResource_9415.class, Builder.class);
      }

      public boolean hasTreasureId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTreasureId() {
         return this.treasureId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTreasureId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.treasureId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.treasureId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ResetLvResource_9415)) {
            return super.equals(obj);
         } else {
            C2S_ResetLvResource_9415 other = (C2S_ResetLvResource_9415)obj;
            if (this.hasTreasureId() != other.hasTreasureId()) {
               return false;
            } else if (this.hasTreasureId() && this.getTreasureId() != other.getTreasureId()) {
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
            if (this.hasTreasureId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTreasureId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ResetLvResource_9415 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ResetLvResource_9415)PARSER.parseFrom(data);
      }

      public static C2S_ResetLvResource_9415 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetLvResource_9415)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetLvResource_9415 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ResetLvResource_9415)PARSER.parseFrom(data);
      }

      public static C2S_ResetLvResource_9415 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetLvResource_9415)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetLvResource_9415 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ResetLvResource_9415)PARSER.parseFrom(data);
      }

      public static C2S_ResetLvResource_9415 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetLvResource_9415)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetLvResource_9415 parseFrom(InputStream input) throws IOException {
         return (C2S_ResetLvResource_9415)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ResetLvResource_9415 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetLvResource_9415)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ResetLvResource_9415 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ResetLvResource_9415)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ResetLvResource_9415 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetLvResource_9415)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ResetLvResource_9415 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ResetLvResource_9415)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ResetLvResource_9415 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetLvResource_9415)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ResetLvResource_9415 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ResetLvResource_9415 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ResetLvResource_9415> parser() {
         return PARSER;
      }

      public Parser<C2S_ResetLvResource_9415> getParserForType() {
         return PARSER;
      }

      public C2S_ResetLvResource_9415 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ResetLvResource_9415OrBuilder {
         private int bitField0_;
         private int treasureId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_ResetLvResource_9415_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_ResetLvResource_9415_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ResetLvResource_9415.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TreasureMsg.C2S_ResetLvResource_9415.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.treasureId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_C2S_ResetLvResource_9415_descriptor;
         }

         public C2S_ResetLvResource_9415 getDefaultInstanceForType() {
            return TreasureMsg.C2S_ResetLvResource_9415.getDefaultInstance();
         }

         public C2S_ResetLvResource_9415 build() {
            C2S_ResetLvResource_9415 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ResetLvResource_9415 buildPartial() {
            C2S_ResetLvResource_9415 result = new C2S_ResetLvResource_9415(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.treasureId_ = this.treasureId_;
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
            if (other instanceof C2S_ResetLvResource_9415) {
               return this.mergeFrom((C2S_ResetLvResource_9415)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ResetLvResource_9415 other) {
            if (other == TreasureMsg.C2S_ResetLvResource_9415.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTreasureId()) {
                  this.setTreasureId(other.getTreasureId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTreasureId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ResetLvResource_9415 parsedMessage = null;

            try {
               parsedMessage = (C2S_ResetLvResource_9415)TreasureMsg.C2S_ResetLvResource_9415.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ResetLvResource_9415)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTreasureId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTreasureId() {
            return this.treasureId_;
         }

         public Builder setTreasureId(int value) {
            this.bitField0_ |= 1;
            this.treasureId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTreasureId() {
            this.bitField0_ &= -2;
            this.treasureId_ = 0;
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

   public static final class S2C_ResetLvResource_9416 extends GeneratedMessageV3 implements S2C_ResetLvResource_9416OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RETURNRESOURCE_FIELD_NUMBER = 1;
      private List<CommonMsg.ItemInfo> returnResource_;
      private byte memoizedIsInitialized;
      private static final S2C_ResetLvResource_9416 DEFAULT_INSTANCE = new S2C_ResetLvResource_9416();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ResetLvResource_9416> PARSER = new AbstractParser<S2C_ResetLvResource_9416>() {
         public S2C_ResetLvResource_9416 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ResetLvResource_9416(input, extensionRegistry);
         }
      };

      private S2C_ResetLvResource_9416(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ResetLvResource_9416() {
         this.memoizedIsInitialized = -1;
         this.returnResource_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ResetLvResource_9416();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ResetLvResource_9416(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.returnResource_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.returnResource_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
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
                  this.returnResource_ = Collections.unmodifiableList(this.returnResource_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_ResetLvResource_9416_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_ResetLvResource_9416_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ResetLvResource_9416.class, Builder.class);
      }

      public List<CommonMsg.ItemInfo> getReturnResourceList() {
         return this.returnResource_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getReturnResourceOrBuilderList() {
         return this.returnResource_;
      }

      public int getReturnResourceCount() {
         return this.returnResource_.size();
      }

      public CommonMsg.ItemInfo getReturnResource(int index) {
         return (CommonMsg.ItemInfo)this.returnResource_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getReturnResourceOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.returnResource_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getReturnResourceCount(); ++i) {
               if (!this.getReturnResource(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.returnResource_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.returnResource_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.returnResource_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.returnResource_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ResetLvResource_9416)) {
            return super.equals(obj);
         } else {
            S2C_ResetLvResource_9416 other = (S2C_ResetLvResource_9416)obj;
            if (!this.getReturnResourceList().equals(other.getReturnResourceList())) {
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
            if (this.getReturnResourceCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getReturnResourceList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ResetLvResource_9416 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ResetLvResource_9416)PARSER.parseFrom(data);
      }

      public static S2C_ResetLvResource_9416 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetLvResource_9416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetLvResource_9416 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ResetLvResource_9416)PARSER.parseFrom(data);
      }

      public static S2C_ResetLvResource_9416 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetLvResource_9416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetLvResource_9416 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ResetLvResource_9416)PARSER.parseFrom(data);
      }

      public static S2C_ResetLvResource_9416 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetLvResource_9416)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetLvResource_9416 parseFrom(InputStream input) throws IOException {
         return (S2C_ResetLvResource_9416)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ResetLvResource_9416 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetLvResource_9416)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ResetLvResource_9416 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ResetLvResource_9416)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ResetLvResource_9416 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetLvResource_9416)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ResetLvResource_9416 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ResetLvResource_9416)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ResetLvResource_9416 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetLvResource_9416)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ResetLvResource_9416 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ResetLvResource_9416 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ResetLvResource_9416> parser() {
         return PARSER;
      }

      public Parser<S2C_ResetLvResource_9416> getParserForType() {
         return PARSER;
      }

      public S2C_ResetLvResource_9416 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ResetLvResource_9416OrBuilder {
         private int bitField0_;
         private List<CommonMsg.ItemInfo> returnResource_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> returnResourceBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_ResetLvResource_9416_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_ResetLvResource_9416_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ResetLvResource_9416.class, Builder.class);
         }

         private Builder() {
            this.returnResource_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.returnResource_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TreasureMsg.S2C_ResetLvResource_9416.alwaysUseFieldBuilders) {
               this.getReturnResourceFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.returnResourceBuilder_ == null) {
               this.returnResource_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.returnResourceBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TreasureMsg.internal_static_treasure_com_gzbz_protobuf_S2C_ResetLvResource_9416_descriptor;
         }

         public S2C_ResetLvResource_9416 getDefaultInstanceForType() {
            return TreasureMsg.S2C_ResetLvResource_9416.getDefaultInstance();
         }

         public S2C_ResetLvResource_9416 build() {
            S2C_ResetLvResource_9416 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ResetLvResource_9416 buildPartial() {
            S2C_ResetLvResource_9416 result = new S2C_ResetLvResource_9416(this);
            int from_bitField0_ = this.bitField0_;
            if (this.returnResourceBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.returnResource_ = Collections.unmodifiableList(this.returnResource_);
                  this.bitField0_ &= -2;
               }

               result.returnResource_ = this.returnResource_;
            } else {
               result.returnResource_ = this.returnResourceBuilder_.build();
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
            if (other instanceof S2C_ResetLvResource_9416) {
               return this.mergeFrom((S2C_ResetLvResource_9416)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ResetLvResource_9416 other) {
            if (other == TreasureMsg.S2C_ResetLvResource_9416.getDefaultInstance()) {
               return this;
            } else {
               if (this.returnResourceBuilder_ == null) {
                  if (!other.returnResource_.isEmpty()) {
                     if (this.returnResource_.isEmpty()) {
                        this.returnResource_ = other.returnResource_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureReturnResourceIsMutable();
                        this.returnResource_.addAll(other.returnResource_);
                     }

                     this.onChanged();
                  }
               } else if (!other.returnResource_.isEmpty()) {
                  if (this.returnResourceBuilder_.isEmpty()) {
                     this.returnResourceBuilder_.dispose();
                     this.returnResourceBuilder_ = null;
                     this.returnResource_ = other.returnResource_;
                     this.bitField0_ &= -2;
                     this.returnResourceBuilder_ = TreasureMsg.S2C_ResetLvResource_9416.alwaysUseFieldBuilders ? this.getReturnResourceFieldBuilder() : null;
                  } else {
                     this.returnResourceBuilder_.addAllMessages(other.returnResource_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getReturnResourceCount(); ++i) {
               if (!this.getReturnResource(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ResetLvResource_9416 parsedMessage = null;

            try {
               parsedMessage = (S2C_ResetLvResource_9416)TreasureMsg.S2C_ResetLvResource_9416.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ResetLvResource_9416)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureReturnResourceIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.returnResource_ = new ArrayList(this.returnResource_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.ItemInfo> getReturnResourceList() {
            return this.returnResourceBuilder_ == null ? Collections.unmodifiableList(this.returnResource_) : this.returnResourceBuilder_.getMessageList();
         }

         public int getReturnResourceCount() {
            return this.returnResourceBuilder_ == null ? this.returnResource_.size() : this.returnResourceBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getReturnResource(int index) {
            return this.returnResourceBuilder_ == null ? (CommonMsg.ItemInfo)this.returnResource_.get(index) : (CommonMsg.ItemInfo)this.returnResourceBuilder_.getMessage(index);
         }

         public Builder setReturnResource(int index, CommonMsg.ItemInfo value) {
            if (this.returnResourceBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureReturnResourceIsMutable();
               this.returnResource_.set(index, value);
               this.onChanged();
            } else {
               this.returnResourceBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setReturnResource(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.returnResourceBuilder_ == null) {
               this.ensureReturnResourceIsMutable();
               this.returnResource_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.returnResourceBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addReturnResource(CommonMsg.ItemInfo value) {
            if (this.returnResourceBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureReturnResourceIsMutable();
               this.returnResource_.add(value);
               this.onChanged();
            } else {
               this.returnResourceBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addReturnResource(int index, CommonMsg.ItemInfo value) {
            if (this.returnResourceBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureReturnResourceIsMutable();
               this.returnResource_.add(index, value);
               this.onChanged();
            } else {
               this.returnResourceBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addReturnResource(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.returnResourceBuilder_ == null) {
               this.ensureReturnResourceIsMutable();
               this.returnResource_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.returnResourceBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addReturnResource(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.returnResourceBuilder_ == null) {
               this.ensureReturnResourceIsMutable();
               this.returnResource_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.returnResourceBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllReturnResource(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.returnResourceBuilder_ == null) {
               this.ensureReturnResourceIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.returnResource_);
               this.onChanged();
            } else {
               this.returnResourceBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearReturnResource() {
            if (this.returnResourceBuilder_ == null) {
               this.returnResource_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.returnResourceBuilder_.clear();
            }

            return this;
         }

         public Builder removeReturnResource(int index) {
            if (this.returnResourceBuilder_ == null) {
               this.ensureReturnResourceIsMutable();
               this.returnResource_.remove(index);
               this.onChanged();
            } else {
               this.returnResourceBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getReturnResourceBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getReturnResourceFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getReturnResourceOrBuilder(int index) {
            return this.returnResourceBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.returnResource_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.returnResourceBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getReturnResourceOrBuilderList() {
            return this.returnResourceBuilder_ != null ? this.returnResourceBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.returnResource_);
         }

         public CommonMsg.ItemInfo.Builder addReturnResourceBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getReturnResourceFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addReturnResourceBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getReturnResourceFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getReturnResourceBuilderList() {
            return this.getReturnResourceFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getReturnResourceFieldBuilder() {
            if (this.returnResourceBuilder_ == null) {
               this.returnResourceBuilder_ = new RepeatedFieldBuilderV3(this.returnResource_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.returnResource_ = null;
            }

            return this.returnResourceBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_GetTreasureInfo_9401OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ResetLvResource_9415OrBuilder extends MessageOrBuilder {
      boolean hasTreasureId();

      int getTreasureId();
   }

   public interface C2S_TransferTreasureItem_9411OrBuilder extends MessageOrBuilder {
      List<TreasureTransferCostInfo> getTransferInfoList();

      TreasureTransferCostInfo getTransferInfo(int index);

      int getTransferInfoCount();

      List<? extends TreasureTransferCostInfoOrBuilder> getTransferInfoOrBuilderList();

      TreasureTransferCostInfoOrBuilder getTransferInfoOrBuilder(int index);

      boolean hasTargetItemId();

      int getTargetItemId();
   }

   public interface C2S_TreasureResetLv_9413OrBuilder extends MessageOrBuilder {
      boolean hasTreasureId();

      int getTreasureId();
   }

   public interface C2S_TreasureReset_9409OrBuilder extends MessageOrBuilder {
      boolean hasTreasureId();

      int getTreasureId();
   }

   public interface C2S_TreasureUpLev_9405OrBuilder extends MessageOrBuilder {
      boolean hasTreasureId();

      int getTreasureId();
   }

   public interface C2S_TreasureUpStage_9407OrBuilder extends MessageOrBuilder {
      boolean hasTreasureId();

      int getTreasureId();
   }

   public interface C2S_UnLockTreasure_9403OrBuilder extends MessageOrBuilder {
      boolean hasTreasureId();

      int getTreasureId();

      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface S2C_GetTreasureInfo_9402OrBuilder extends MessageOrBuilder {
      List<TreasureInfo> getInfoList();

      TreasureInfo getInfo(int index);

      int getInfoCount();

      List<? extends TreasureInfoOrBuilder> getInfoOrBuilderList();

      TreasureInfoOrBuilder getInfoOrBuilder(int index);
   }

   public interface S2C_ResetLvResource_9416OrBuilder extends MessageOrBuilder {
      List<CommonMsg.ItemInfo> getReturnResourceList();

      CommonMsg.ItemInfo getReturnResource(int index);

      int getReturnResourceCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getReturnResourceOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getReturnResourceOrBuilder(int index);
   }

   public interface S2C_TransferTreasureItem_9412OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_TreasureResetLv_9414OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      TreasureInfo getInfo();

      TreasureInfoOrBuilder getInfoOrBuilder();
   }

   public interface S2C_TreasureReset_9410OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      TreasureInfo getInfo();

      TreasureInfoOrBuilder getInfoOrBuilder();

      List<CommonMsg.PropertyInfo> getPropertyChangesList();

      CommonMsg.PropertyInfo getPropertyChanges(int index);

      int getPropertyChangesCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getPropertyChangesOrBuilder(int index);
   }

   public interface S2C_TreasureUpLev_9406OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      TreasureInfo getInfo();

      TreasureInfoOrBuilder getInfoOrBuilder();

      List<CommonMsg.PropertyInfo> getPropertyChangesList();

      CommonMsg.PropertyInfo getPropertyChanges(int index);

      int getPropertyChangesCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getPropertyChangesOrBuilder(int index);
   }

   public interface S2C_TreasureUpStage_9408OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      TreasureInfo getInfo();

      TreasureInfoOrBuilder getInfoOrBuilder();

      List<CommonMsg.PropertyInfo> getPropertyChangesList();

      CommonMsg.PropertyInfo getPropertyChanges(int index);

      int getPropertyChangesCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getPropertyChangesOrBuilder(int index);
   }

   public interface S2C_UnLockTreasure_9404OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      TreasureInfo getInfo();

      TreasureInfoOrBuilder getInfoOrBuilder();

      List<CommonMsg.PropertyInfo> getPropertyChangesList();

      CommonMsg.PropertyInfo getPropertyChanges(int index);

      int getPropertyChangesCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getPropertyChangesOrBuilder(int index);
   }

   public interface TreasureInfoOrBuilder extends MessageOrBuilder {
      boolean hasTreasureId();

      int getTreasureId();

      boolean hasStarSum();

      int getStarSum();

      boolean hasLevel();

      int getLevel();

      boolean hasExp();

      int getExp();

      boolean hasUnLock();

      boolean getUnLock();
   }

   public interface TreasureTransferCostInfoOrBuilder extends MessageOrBuilder {
      boolean hasItemId();

      int getItemId();

      boolean hasNum();

      int getNum();
   }
}
