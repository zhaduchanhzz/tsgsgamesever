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

public final class ActivityComeBackMsg {
   private static final Descriptors.Descriptor internal_static_activityComeBack_com_gzbz_protobuf_C2S_ActivityInfo_21201_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityComeBack_com_gzbz_protobuf_C2S_ActivityInfo_21201_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityComeBack_com_gzbz_protobuf_S2C_ActivityInfo_21202_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityComeBack_com_gzbz_protobuf_S2C_ActivityInfo_21202_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityComeBack_com_gzbz_protobuf_C2S_FirstChargeReceive_21203_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityComeBack_com_gzbz_protobuf_C2S_FirstChargeReceive_21203_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityComeBack_com_gzbz_protobuf_S2C_FirstChargeReceive_21204_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityComeBack_com_gzbz_protobuf_S2C_FirstChargeReceive_21204_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityComeBack_com_gzbz_protobuf_C2S_ChargeReturnReceive_21205_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityComeBack_com_gzbz_protobuf_C2S_ChargeReturnReceive_21205_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityComeBack_com_gzbz_protobuf_S2C_ChargeReturnReceive_21206_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityComeBack_com_gzbz_protobuf_S2C_ChargeReturnReceive_21206_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityComeBack_com_gzbz_protobuf_C2S_SignReceive_21207_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityComeBack_com_gzbz_protobuf_C2S_SignReceive_21207_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityComeBack_com_gzbz_protobuf_S2C_SignReceive_21208_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityComeBack_com_gzbz_protobuf_S2C_SignReceive_21208_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityComeBack_com_gzbz_protobuf_C2S_PowerBoxReceive_21209_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityComeBack_com_gzbz_protobuf_C2S_PowerBoxReceive_21209_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityComeBack_com_gzbz_protobuf_S2C_PowerBoxReceive_21210_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityComeBack_com_gzbz_protobuf_S2C_PowerBoxReceive_21210_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityComeBack_com_gzbz_protobuf_S2C_PrayTaskNotify_21211_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityComeBack_com_gzbz_protobuf_S2C_PrayTaskNotify_21211_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityComeBack_com_gzbz_protobuf_C2S_TenDraw_21213_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityComeBack_com_gzbz_protobuf_C2S_TenDraw_21213_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityComeBack_com_gzbz_protobuf_S2C_TenDraw_21214_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityComeBack_com_gzbz_protobuf_S2C_TenDraw_21214_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityComeBack_com_gzbz_protobuf_C2S_ReturnDraw_21215_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityComeBack_com_gzbz_protobuf_C2S_ReturnDraw_21215_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityComeBack_com_gzbz_protobuf_S2C_ReturnDraw_21216_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityComeBack_com_gzbz_protobuf_S2C_ReturnDraw_21216_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityComeBack_com_gzbz_protobuf_C2S_TaskRewardReceive_21217_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityComeBack_com_gzbz_protobuf_C2S_TaskRewardReceive_21217_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_activityComeBack_com_gzbz_protobuf_S2C_PowerUpdate_21218_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_activityComeBack_com_gzbz_protobuf_S2C_PowerUpdate_21218_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ActivityComeBackMsg() {
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
      String[] descriptorData = new String[]{"\n\u0016ActivityComeBack.proto\u0012\"activityComeBack.com.gzbz.protobuf\u001a\u000eActivity.proto\u001a\fcommon.proto\"\u0018\n\u0016C2S_ActivityInfo_21201\"\u0094\u0003\n\u0016S2C_ActivityInfo_21202\u0012\u0019\n\u0011serverActivityDay\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rchargeAccount\u0018\u0002 \u0002(\u0005\u0012\u001d\n\u0015firstChargeReceiveIds\u0018\u0003 \u0003(\u0005\u0012\u001e\n\u0016chargeReturnReceiveIds\u0018\u0004 \u0003(\u0005\u0012\u0016\n\u000esignReceiveIds\u0018\u0005 \u0003(\u0005\u0012\r\n\u0005power\u0018\u0006 \u0002(\u0005\u0012\u0017\n\u000fpowerReceiveIds\u0018\u0007 \u0003(\u0005\u0012\u001a\n\u0012actTotalOnlineTime\u0018\b \u0002(\u0003\u0012\u0015\n\rtenDrawUseIds\u0018\t \u0003(\u0005\u0012\u001c\n\u0014nextTenDrawCountDown\u0018\n \u0002(\u0003\u00122\n\u0004task\u0018\u000b \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\u0012\u0017\n\u000freturnDrawTimes\u0018\f \u0002(\u0005\u0012+\n\u0010returnGoldRecord\u0018\r \u0003(\u000b2\u0011.common.MapDataII\"*\n\u001cC2S_FirstChargeReceive_21203\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"2\n\u001cS2C_FirstChargeReceive_21204\u0012\u0012\n\nreceiveIds\u0018\u0001 \u0003(\u0005\"+\n\u001dC2S_ChargeReturnReceive_21205\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"3\n\u001dS2C_ChargeReturnReceive_21206\u0012\u0012\n\nreceiveIds\u0018\u0001 \u0003(\u0005\"\u0017\n\u0015C2S_SignReceive_21207\"+\n\u0015S2C_SignReceive_21208\u0012\u0012\n\nreceiveIds\u0018\u0001 \u0003(\u0005\"'\n\u0019C2S_PowerBoxReceive_21209\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"/\n\u0019S2C_PowerBoxReceive_21210\u0012\u0012\n\nreceiveIds\u0018\u0001 \u0003(\u0005\"N\n\u0018S2C_PrayTaskNotify_21211\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"\u0013\n\u0011C2S_TenDraw_21213\";\n\u0011S2C_TenDraw_21214\u0012\u0015\n\rtenDrawUseIds\u0018\u0001 \u0003(\u0005\u0012\u000f\n\u0007heroIds\u0018\u0002 \u0003(\u0005\"\u0016\n\u0014C2S_ReturnDraw_21215\"\\\n\u0014S2C_ReturnDraw_21216\u0012\u0017\n\u000freturnDrawTimes\u0018\u0001 \u0002(\u0005\u0012+\n\u0010returnGoldRecord\u0018\u0002 \u0003(\u000b2\u0011.common.MapDataII\"-\n\u001bC2S_TaskRewardReceive_21217\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"&\n\u0015S2C_PowerUpdate_21218\u0012\r\n\u0005power\u0018\u0001 \u0002(\u0005B*\n\u0011com.gzbz.protobufB\u0013ActivityComeBackMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{ActivityMsg.getDescriptor(), CommonMsg.getDescriptor()});
      internal_static_activityComeBack_com_gzbz_protobuf_C2S_ActivityInfo_21201_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_activityComeBack_com_gzbz_protobuf_C2S_ActivityInfo_21201_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityComeBack_com_gzbz_protobuf_C2S_ActivityInfo_21201_descriptor, new String[0]);
      internal_static_activityComeBack_com_gzbz_protobuf_S2C_ActivityInfo_21202_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_activityComeBack_com_gzbz_protobuf_S2C_ActivityInfo_21202_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityComeBack_com_gzbz_protobuf_S2C_ActivityInfo_21202_descriptor, new String[]{"ServerActivityDay", "ChargeAccount", "FirstChargeReceiveIds", "ChargeReturnReceiveIds", "SignReceiveIds", "Power", "PowerReceiveIds", "ActTotalOnlineTime", "TenDrawUseIds", "NextTenDrawCountDown", "Task", "ReturnDrawTimes", "ReturnGoldRecord"});
      internal_static_activityComeBack_com_gzbz_protobuf_C2S_FirstChargeReceive_21203_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_activityComeBack_com_gzbz_protobuf_C2S_FirstChargeReceive_21203_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityComeBack_com_gzbz_protobuf_C2S_FirstChargeReceive_21203_descriptor, new String[]{"Id"});
      internal_static_activityComeBack_com_gzbz_protobuf_S2C_FirstChargeReceive_21204_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_activityComeBack_com_gzbz_protobuf_S2C_FirstChargeReceive_21204_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityComeBack_com_gzbz_protobuf_S2C_FirstChargeReceive_21204_descriptor, new String[]{"ReceiveIds"});
      internal_static_activityComeBack_com_gzbz_protobuf_C2S_ChargeReturnReceive_21205_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_activityComeBack_com_gzbz_protobuf_C2S_ChargeReturnReceive_21205_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityComeBack_com_gzbz_protobuf_C2S_ChargeReturnReceive_21205_descriptor, new String[]{"Id"});
      internal_static_activityComeBack_com_gzbz_protobuf_S2C_ChargeReturnReceive_21206_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_activityComeBack_com_gzbz_protobuf_S2C_ChargeReturnReceive_21206_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityComeBack_com_gzbz_protobuf_S2C_ChargeReturnReceive_21206_descriptor, new String[]{"ReceiveIds"});
      internal_static_activityComeBack_com_gzbz_protobuf_C2S_SignReceive_21207_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_activityComeBack_com_gzbz_protobuf_C2S_SignReceive_21207_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityComeBack_com_gzbz_protobuf_C2S_SignReceive_21207_descriptor, new String[0]);
      internal_static_activityComeBack_com_gzbz_protobuf_S2C_SignReceive_21208_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_activityComeBack_com_gzbz_protobuf_S2C_SignReceive_21208_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityComeBack_com_gzbz_protobuf_S2C_SignReceive_21208_descriptor, new String[]{"ReceiveIds"});
      internal_static_activityComeBack_com_gzbz_protobuf_C2S_PowerBoxReceive_21209_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_activityComeBack_com_gzbz_protobuf_C2S_PowerBoxReceive_21209_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityComeBack_com_gzbz_protobuf_C2S_PowerBoxReceive_21209_descriptor, new String[]{"Id"});
      internal_static_activityComeBack_com_gzbz_protobuf_S2C_PowerBoxReceive_21210_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_activityComeBack_com_gzbz_protobuf_S2C_PowerBoxReceive_21210_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityComeBack_com_gzbz_protobuf_S2C_PowerBoxReceive_21210_descriptor, new String[]{"ReceiveIds"});
      internal_static_activityComeBack_com_gzbz_protobuf_S2C_PrayTaskNotify_21211_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_activityComeBack_com_gzbz_protobuf_S2C_PrayTaskNotify_21211_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityComeBack_com_gzbz_protobuf_S2C_PrayTaskNotify_21211_descriptor, new String[]{"Task"});
      internal_static_activityComeBack_com_gzbz_protobuf_C2S_TenDraw_21213_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_activityComeBack_com_gzbz_protobuf_C2S_TenDraw_21213_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityComeBack_com_gzbz_protobuf_C2S_TenDraw_21213_descriptor, new String[0]);
      internal_static_activityComeBack_com_gzbz_protobuf_S2C_TenDraw_21214_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_activityComeBack_com_gzbz_protobuf_S2C_TenDraw_21214_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityComeBack_com_gzbz_protobuf_S2C_TenDraw_21214_descriptor, new String[]{"TenDrawUseIds", "HeroIds"});
      internal_static_activityComeBack_com_gzbz_protobuf_C2S_ReturnDraw_21215_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_activityComeBack_com_gzbz_protobuf_C2S_ReturnDraw_21215_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityComeBack_com_gzbz_protobuf_C2S_ReturnDraw_21215_descriptor, new String[0]);
      internal_static_activityComeBack_com_gzbz_protobuf_S2C_ReturnDraw_21216_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_activityComeBack_com_gzbz_protobuf_S2C_ReturnDraw_21216_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityComeBack_com_gzbz_protobuf_S2C_ReturnDraw_21216_descriptor, new String[]{"ReturnDrawTimes", "ReturnGoldRecord"});
      internal_static_activityComeBack_com_gzbz_protobuf_C2S_TaskRewardReceive_21217_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_activityComeBack_com_gzbz_protobuf_C2S_TaskRewardReceive_21217_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityComeBack_com_gzbz_protobuf_C2S_TaskRewardReceive_21217_descriptor, new String[]{"TaskId"});
      internal_static_activityComeBack_com_gzbz_protobuf_S2C_PowerUpdate_21218_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_activityComeBack_com_gzbz_protobuf_S2C_PowerUpdate_21218_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_activityComeBack_com_gzbz_protobuf_S2C_PowerUpdate_21218_descriptor, new String[]{"Power"});
      ActivityMsg.getDescriptor();
      CommonMsg.getDescriptor();
   }

   public static final class C2S_ActivityInfo_21201 extends GeneratedMessageV3 implements C2S_ActivityInfo_21201OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ActivityInfo_21201 DEFAULT_INSTANCE = new C2S_ActivityInfo_21201();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActivityInfo_21201> PARSER = new AbstractParser<C2S_ActivityInfo_21201>() {
         public C2S_ActivityInfo_21201 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActivityInfo_21201(input, extensionRegistry);
         }
      };

      private C2S_ActivityInfo_21201(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActivityInfo_21201() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActivityInfo_21201();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActivityInfo_21201(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_ActivityInfo_21201_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_ActivityInfo_21201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_21201.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ActivityInfo_21201)) {
            return super.equals(obj);
         } else {
            C2S_ActivityInfo_21201 other = (C2S_ActivityInfo_21201)obj;
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

      public static C2S_ActivityInfo_21201 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_21201)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_21201 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_21201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_21201 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_21201)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_21201 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_21201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_21201 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_21201)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_21201 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_21201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_21201 parseFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_21201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_21201 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_21201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_21201 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_21201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_21201 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_21201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_21201 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActivityInfo_21201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_21201 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_21201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActivityInfo_21201 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActivityInfo_21201 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActivityInfo_21201> parser() {
         return PARSER;
      }

      public Parser<C2S_ActivityInfo_21201> getParserForType() {
         return PARSER;
      }

      public C2S_ActivityInfo_21201 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActivityInfo_21201OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_ActivityInfo_21201_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_ActivityInfo_21201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_21201.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityComeBackMsg.C2S_ActivityInfo_21201.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_ActivityInfo_21201_descriptor;
         }

         public C2S_ActivityInfo_21201 getDefaultInstanceForType() {
            return ActivityComeBackMsg.C2S_ActivityInfo_21201.getDefaultInstance();
         }

         public C2S_ActivityInfo_21201 build() {
            C2S_ActivityInfo_21201 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActivityInfo_21201 buildPartial() {
            C2S_ActivityInfo_21201 result = new C2S_ActivityInfo_21201(this);
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
            if (other instanceof C2S_ActivityInfo_21201) {
               return this.mergeFrom((C2S_ActivityInfo_21201)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActivityInfo_21201 other) {
            if (other == ActivityComeBackMsg.C2S_ActivityInfo_21201.getDefaultInstance()) {
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
            C2S_ActivityInfo_21201 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActivityInfo_21201)ActivityComeBackMsg.C2S_ActivityInfo_21201.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActivityInfo_21201)e.getUnfinishedMessage();
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

   public static final class S2C_ActivityInfo_21202 extends GeneratedMessageV3 implements S2C_ActivityInfo_21202OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SERVERACTIVITYDAY_FIELD_NUMBER = 1;
      private int serverActivityDay_;
      public static final int CHARGEACCOUNT_FIELD_NUMBER = 2;
      private int chargeAccount_;
      public static final int FIRSTCHARGERECEIVEIDS_FIELD_NUMBER = 3;
      private Internal.IntList firstChargeReceiveIds_;
      public static final int CHARGERETURNRECEIVEIDS_FIELD_NUMBER = 4;
      private Internal.IntList chargeReturnReceiveIds_;
      public static final int SIGNRECEIVEIDS_FIELD_NUMBER = 5;
      private Internal.IntList signReceiveIds_;
      public static final int POWER_FIELD_NUMBER = 6;
      private int power_;
      public static final int POWERRECEIVEIDS_FIELD_NUMBER = 7;
      private Internal.IntList powerReceiveIds_;
      public static final int ACTTOTALONLINETIME_FIELD_NUMBER = 8;
      private long actTotalOnlineTime_;
      public static final int TENDRAWUSEIDS_FIELD_NUMBER = 9;
      private Internal.IntList tenDrawUseIds_;
      public static final int NEXTTENDRAWCOUNTDOWN_FIELD_NUMBER = 10;
      private long nextTenDrawCountDown_;
      public static final int TASK_FIELD_NUMBER = 11;
      private List<ActivityMsg.TaskData> task_;
      public static final int RETURNDRAWTIMES_FIELD_NUMBER = 12;
      private int returnDrawTimes_;
      public static final int RETURNGOLDRECORD_FIELD_NUMBER = 13;
      private List<CommonMsg.MapDataII> returnGoldRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivityInfo_21202 DEFAULT_INSTANCE = new S2C_ActivityInfo_21202();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivityInfo_21202> PARSER = new AbstractParser<S2C_ActivityInfo_21202>() {
         public S2C_ActivityInfo_21202 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivityInfo_21202(input, extensionRegistry);
         }
      };

      private S2C_ActivityInfo_21202(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivityInfo_21202() {
         this.memoizedIsInitialized = -1;
         this.firstChargeReceiveIds_ = emptyIntList();
         this.chargeReturnReceiveIds_ = emptyIntList();
         this.signReceiveIds_ = emptyIntList();
         this.powerReceiveIds_ = emptyIntList();
         this.tenDrawUseIds_ = emptyIntList();
         this.task_ = Collections.emptyList();
         this.returnGoldRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivityInfo_21202();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivityInfo_21202(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.serverActivityDay_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.chargeAccount_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.firstChargeReceiveIds_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.firstChargeReceiveIds_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.firstChargeReceiveIds_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.chargeReturnReceiveIds_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.chargeReturnReceiveIds_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.chargeReturnReceiveIds_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.chargeReturnReceiveIds_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 40:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.signReceiveIds_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        this.signReceiveIds_.addInt(input.readInt32());
                        continue;
                     case 42:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 16) == 0 && input.getBytesUntilLimit() > 0) {
                           this.signReceiveIds_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.signReceiveIds_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 48:
                        this.bitField0_ |= 4;
                        this.power_ = input.readInt32();
                        continue;
                     case 56:
                        if ((mutable_bitField0_ & 64) == 0) {
                           this.powerReceiveIds_ = newIntList();
                           mutable_bitField0_ |= 64;
                        }

                        this.powerReceiveIds_.addInt(input.readInt32());
                        continue;
                     case 58:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 64) == 0 && input.getBytesUntilLimit() > 0) {
                           this.powerReceiveIds_ = newIntList();
                           mutable_bitField0_ |= 64;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.powerReceiveIds_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 64:
                        this.bitField0_ |= 8;
                        this.actTotalOnlineTime_ = input.readInt64();
                        continue;
                     case 72:
                        if ((mutable_bitField0_ & 256) == 0) {
                           this.tenDrawUseIds_ = newIntList();
                           mutable_bitField0_ |= 256;
                        }

                        this.tenDrawUseIds_.addInt(input.readInt32());
                        continue;
                     case 74:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 256) == 0 && input.getBytesUntilLimit() > 0) {
                           this.tenDrawUseIds_ = newIntList();
                           mutable_bitField0_ |= 256;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.tenDrawUseIds_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 80:
                        this.bitField0_ |= 16;
                        this.nextTenDrawCountDown_ = input.readInt64();
                        continue;
                     case 90:
                        if ((mutable_bitField0_ & 1024) == 0) {
                           this.task_ = new ArrayList();
                           mutable_bitField0_ |= 1024;
                        }

                        this.task_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
                        continue;
                     case 96:
                        this.bitField0_ |= 32;
                        this.returnDrawTimes_ = input.readInt32();
                        continue;
                     case 106:
                        if ((mutable_bitField0_ & 4096) == 0) {
                           this.returnGoldRecord_ = new ArrayList();
                           mutable_bitField0_ |= 4096;
                        }

                        this.returnGoldRecord_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.firstChargeReceiveIds_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.firstChargeReceiveIds_.makeImmutable();
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.chargeReturnReceiveIds_.makeImmutable();
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.signReceiveIds_.makeImmutable();
               }

               if ((mutable_bitField0_ & 64) != 0) {
                  this.powerReceiveIds_.makeImmutable();
               }

               if ((mutable_bitField0_ & 256) != 0) {
                  this.tenDrawUseIds_.makeImmutable();
               }

               if ((mutable_bitField0_ & 1024) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
               }

               if ((mutable_bitField0_ & 4096) != 0) {
                  this.returnGoldRecord_ = Collections.unmodifiableList(this.returnGoldRecord_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_ActivityInfo_21202_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_ActivityInfo_21202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_21202.class, Builder.class);
      }

      public boolean hasServerActivityDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getServerActivityDay() {
         return this.serverActivityDay_;
      }

      public boolean hasChargeAccount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getChargeAccount() {
         return this.chargeAccount_;
      }

      public List<Integer> getFirstChargeReceiveIdsList() {
         return this.firstChargeReceiveIds_;
      }

      public int getFirstChargeReceiveIdsCount() {
         return this.firstChargeReceiveIds_.size();
      }

      public int getFirstChargeReceiveIds(int index) {
         return this.firstChargeReceiveIds_.getInt(index);
      }

      public List<Integer> getChargeReturnReceiveIdsList() {
         return this.chargeReturnReceiveIds_;
      }

      public int getChargeReturnReceiveIdsCount() {
         return this.chargeReturnReceiveIds_.size();
      }

      public int getChargeReturnReceiveIds(int index) {
         return this.chargeReturnReceiveIds_.getInt(index);
      }

      public List<Integer> getSignReceiveIdsList() {
         return this.signReceiveIds_;
      }

      public int getSignReceiveIdsCount() {
         return this.signReceiveIds_.size();
      }

      public int getSignReceiveIds(int index) {
         return this.signReceiveIds_.getInt(index);
      }

      public boolean hasPower() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPower() {
         return this.power_;
      }

      public List<Integer> getPowerReceiveIdsList() {
         return this.powerReceiveIds_;
      }

      public int getPowerReceiveIdsCount() {
         return this.powerReceiveIds_.size();
      }

      public int getPowerReceiveIds(int index) {
         return this.powerReceiveIds_.getInt(index);
      }

      public boolean hasActTotalOnlineTime() {
         return (this.bitField0_ & 8) != 0;
      }

      public long getActTotalOnlineTime() {
         return this.actTotalOnlineTime_;
      }

      public List<Integer> getTenDrawUseIdsList() {
         return this.tenDrawUseIds_;
      }

      public int getTenDrawUseIdsCount() {
         return this.tenDrawUseIds_.size();
      }

      public int getTenDrawUseIds(int index) {
         return this.tenDrawUseIds_.getInt(index);
      }

      public boolean hasNextTenDrawCountDown() {
         return (this.bitField0_ & 16) != 0;
      }

      public long getNextTenDrawCountDown() {
         return this.nextTenDrawCountDown_;
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

      public boolean hasReturnDrawTimes() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getReturnDrawTimes() {
         return this.returnDrawTimes_;
      }

      public List<CommonMsg.MapDataII> getReturnGoldRecordList() {
         return this.returnGoldRecord_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getReturnGoldRecordOrBuilderList() {
         return this.returnGoldRecord_;
      }

      public int getReturnGoldRecordCount() {
         return this.returnGoldRecord_.size();
      }

      public CommonMsg.MapDataII getReturnGoldRecord(int index) {
         return (CommonMsg.MapDataII)this.returnGoldRecord_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getReturnGoldRecordOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.returnGoldRecord_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasServerActivityDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasChargeAccount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPower()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasActTotalOnlineTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasNextTenDrawCountDown()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasReturnDrawTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getReturnGoldRecordCount(); ++i) {
               if (!this.getReturnGoldRecord(i).isInitialized()) {
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
            output.writeInt32(1, this.serverActivityDay_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.chargeAccount_);
         }

         for(int i = 0; i < this.firstChargeReceiveIds_.size(); ++i) {
            output.writeInt32(3, this.firstChargeReceiveIds_.getInt(i));
         }

         for(int i = 0; i < this.chargeReturnReceiveIds_.size(); ++i) {
            output.writeInt32(4, this.chargeReturnReceiveIds_.getInt(i));
         }

         for(int i = 0; i < this.signReceiveIds_.size(); ++i) {
            output.writeInt32(5, this.signReceiveIds_.getInt(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(6, this.power_);
         }

         for(int i = 0; i < this.powerReceiveIds_.size(); ++i) {
            output.writeInt32(7, this.powerReceiveIds_.getInt(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt64(8, this.actTotalOnlineTime_);
         }

         for(int i = 0; i < this.tenDrawUseIds_.size(); ++i) {
            output.writeInt32(9, this.tenDrawUseIds_.getInt(i));
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt64(10, this.nextTenDrawCountDown_);
         }

         for(int i = 0; i < this.task_.size(); ++i) {
            output.writeMessage(11, (MessageLite)this.task_.get(i));
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(12, this.returnDrawTimes_);
         }

         for(int i = 0; i < this.returnGoldRecord_.size(); ++i) {
            output.writeMessage(13, (MessageLite)this.returnGoldRecord_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.serverActivityDay_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.chargeAccount_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.firstChargeReceiveIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.firstChargeReceiveIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getFirstChargeReceiveIdsList().size();
            dataSize = 0;

            for(int i = 0; i < this.chargeReturnReceiveIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.chargeReturnReceiveIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getChargeReturnReceiveIdsList().size();
            dataSize = 0;

            for(int i = 0; i < this.signReceiveIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.signReceiveIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getSignReceiveIdsList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.power_);
            }

            dataSize = 0;

            for(int i = 0; i < this.powerReceiveIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.powerReceiveIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPowerReceiveIdsList().size();
            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt64Size(8, this.actTotalOnlineTime_);
            }

            dataSize = 0;

            for(int i = 0; i < this.tenDrawUseIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.tenDrawUseIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTenDrawUseIdsList().size();
            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt64Size(10, this.nextTenDrawCountDown_);
            }

            for(int i = 0; i < this.task_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(11, (MessageLite)this.task_.get(i));
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(12, this.returnDrawTimes_);
            }

            for(int i = 0; i < this.returnGoldRecord_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(13, (MessageLite)this.returnGoldRecord_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ActivityInfo_21202)) {
            return super.equals(obj);
         } else {
            S2C_ActivityInfo_21202 other = (S2C_ActivityInfo_21202)obj;
            if (this.hasServerActivityDay() != other.hasServerActivityDay()) {
               return false;
            } else if (this.hasServerActivityDay() && this.getServerActivityDay() != other.getServerActivityDay()) {
               return false;
            } else if (this.hasChargeAccount() != other.hasChargeAccount()) {
               return false;
            } else if (this.hasChargeAccount() && this.getChargeAccount() != other.getChargeAccount()) {
               return false;
            } else if (!this.getFirstChargeReceiveIdsList().equals(other.getFirstChargeReceiveIdsList())) {
               return false;
            } else if (!this.getChargeReturnReceiveIdsList().equals(other.getChargeReturnReceiveIdsList())) {
               return false;
            } else if (!this.getSignReceiveIdsList().equals(other.getSignReceiveIdsList())) {
               return false;
            } else if (this.hasPower() != other.hasPower()) {
               return false;
            } else if (this.hasPower() && this.getPower() != other.getPower()) {
               return false;
            } else if (!this.getPowerReceiveIdsList().equals(other.getPowerReceiveIdsList())) {
               return false;
            } else if (this.hasActTotalOnlineTime() != other.hasActTotalOnlineTime()) {
               return false;
            } else if (this.hasActTotalOnlineTime() && this.getActTotalOnlineTime() != other.getActTotalOnlineTime()) {
               return false;
            } else if (!this.getTenDrawUseIdsList().equals(other.getTenDrawUseIdsList())) {
               return false;
            } else if (this.hasNextTenDrawCountDown() != other.hasNextTenDrawCountDown()) {
               return false;
            } else if (this.hasNextTenDrawCountDown() && this.getNextTenDrawCountDown() != other.getNextTenDrawCountDown()) {
               return false;
            } else if (!this.getTaskList().equals(other.getTaskList())) {
               return false;
            } else if (this.hasReturnDrawTimes() != other.hasReturnDrawTimes()) {
               return false;
            } else if (this.hasReturnDrawTimes() && this.getReturnDrawTimes() != other.getReturnDrawTimes()) {
               return false;
            } else if (!this.getReturnGoldRecordList().equals(other.getReturnGoldRecordList())) {
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
            if (this.hasServerActivityDay()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getServerActivityDay();
            }

            if (this.hasChargeAccount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getChargeAccount();
            }

            if (this.getFirstChargeReceiveIdsCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getFirstChargeReceiveIdsList().hashCode();
            }

            if (this.getChargeReturnReceiveIdsCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getChargeReturnReceiveIdsList().hashCode();
            }

            if (this.getSignReceiveIdsCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getSignReceiveIdsList().hashCode();
            }

            if (this.hasPower()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getPower();
            }

            if (this.getPowerReceiveIdsCount() > 0) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getPowerReceiveIdsList().hashCode();
            }

            if (this.hasActTotalOnlineTime()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + Internal.hashLong(this.getActTotalOnlineTime());
            }

            if (this.getTenDrawUseIdsCount() > 0) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getTenDrawUseIdsList().hashCode();
            }

            if (this.hasNextTenDrawCountDown()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + Internal.hashLong(this.getNextTenDrawCountDown());
            }

            if (this.getTaskCount() > 0) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getTaskList().hashCode();
            }

            if (this.hasReturnDrawTimes()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getReturnDrawTimes();
            }

            if (this.getReturnGoldRecordCount() > 0) {
               hash = 37 * hash + 13;
               hash = 53 * hash + this.getReturnGoldRecordList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ActivityInfo_21202 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_21202)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_21202 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_21202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_21202 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_21202)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_21202 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_21202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_21202 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_21202)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_21202 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_21202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_21202 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_21202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_21202 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_21202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_21202 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_21202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_21202 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_21202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_21202 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivityInfo_21202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_21202 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_21202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivityInfo_21202 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivityInfo_21202 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivityInfo_21202> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivityInfo_21202> getParserForType() {
         return PARSER;
      }

      public S2C_ActivityInfo_21202 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivityInfo_21202OrBuilder {
         private int bitField0_;
         private int serverActivityDay_;
         private int chargeAccount_;
         private Internal.IntList firstChargeReceiveIds_;
         private Internal.IntList chargeReturnReceiveIds_;
         private Internal.IntList signReceiveIds_;
         private int power_;
         private Internal.IntList powerReceiveIds_;
         private long actTotalOnlineTime_;
         private Internal.IntList tenDrawUseIds_;
         private long nextTenDrawCountDown_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;
         private int returnDrawTimes_;
         private List<CommonMsg.MapDataII> returnGoldRecord_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> returnGoldRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_ActivityInfo_21202_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_ActivityInfo_21202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_21202.class, Builder.class);
         }

         private Builder() {
            this.firstChargeReceiveIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.emptyIntList();
            this.chargeReturnReceiveIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.emptyIntList();
            this.signReceiveIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.emptyIntList();
            this.powerReceiveIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.emptyIntList();
            this.tenDrawUseIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.emptyIntList();
            this.task_ = Collections.emptyList();
            this.returnGoldRecord_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.firstChargeReceiveIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.emptyIntList();
            this.chargeReturnReceiveIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.emptyIntList();
            this.signReceiveIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.emptyIntList();
            this.powerReceiveIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.emptyIntList();
            this.tenDrawUseIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.emptyIntList();
            this.task_ = Collections.emptyList();
            this.returnGoldRecord_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityComeBackMsg.S2C_ActivityInfo_21202.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
               this.getReturnGoldRecordFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.serverActivityDay_ = 0;
            this.bitField0_ &= -2;
            this.chargeAccount_ = 0;
            this.bitField0_ &= -3;
            this.firstChargeReceiveIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.emptyIntList();
            this.bitField0_ &= -5;
            this.chargeReturnReceiveIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.emptyIntList();
            this.bitField0_ &= -9;
            this.signReceiveIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.emptyIntList();
            this.bitField0_ &= -17;
            this.power_ = 0;
            this.bitField0_ &= -33;
            this.powerReceiveIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.emptyIntList();
            this.bitField0_ &= -65;
            this.actTotalOnlineTime_ = 0L;
            this.bitField0_ &= -129;
            this.tenDrawUseIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.emptyIntList();
            this.bitField0_ &= -257;
            this.nextTenDrawCountDown_ = 0L;
            this.bitField0_ &= -513;
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -1025;
            } else {
               this.taskBuilder_.clear();
            }

            this.returnDrawTimes_ = 0;
            this.bitField0_ &= -2049;
            if (this.returnGoldRecordBuilder_ == null) {
               this.returnGoldRecord_ = Collections.emptyList();
               this.bitField0_ &= -4097;
            } else {
               this.returnGoldRecordBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_ActivityInfo_21202_descriptor;
         }

         public S2C_ActivityInfo_21202 getDefaultInstanceForType() {
            return ActivityComeBackMsg.S2C_ActivityInfo_21202.getDefaultInstance();
         }

         public S2C_ActivityInfo_21202 build() {
            S2C_ActivityInfo_21202 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivityInfo_21202 buildPartial() {
            S2C_ActivityInfo_21202 result = new S2C_ActivityInfo_21202(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.serverActivityDay_ = this.serverActivityDay_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.chargeAccount_ = this.chargeAccount_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.firstChargeReceiveIds_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.firstChargeReceiveIds_ = this.firstChargeReceiveIds_;
            if ((this.bitField0_ & 8) != 0) {
               this.chargeReturnReceiveIds_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.chargeReturnReceiveIds_ = this.chargeReturnReceiveIds_;
            if ((this.bitField0_ & 16) != 0) {
               this.signReceiveIds_.makeImmutable();
               this.bitField0_ &= -17;
            }

            result.signReceiveIds_ = this.signReceiveIds_;
            if ((from_bitField0_ & 32) != 0) {
               result.power_ = this.power_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 64) != 0) {
               this.powerReceiveIds_.makeImmutable();
               this.bitField0_ &= -65;
            }

            result.powerReceiveIds_ = this.powerReceiveIds_;
            if ((from_bitField0_ & 128) != 0) {
               result.actTotalOnlineTime_ = this.actTotalOnlineTime_;
               to_bitField0_ |= 8;
            }

            if ((this.bitField0_ & 256) != 0) {
               this.tenDrawUseIds_.makeImmutable();
               this.bitField0_ &= -257;
            }

            result.tenDrawUseIds_ = this.tenDrawUseIds_;
            if ((from_bitField0_ & 512) != 0) {
               result.nextTenDrawCountDown_ = this.nextTenDrawCountDown_;
               to_bitField0_ |= 16;
            }

            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 1024) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
                  this.bitField0_ &= -1025;
               }

               result.task_ = this.task_;
            } else {
               result.task_ = this.taskBuilder_.build();
            }

            if ((from_bitField0_ & 2048) != 0) {
               result.returnDrawTimes_ = this.returnDrawTimes_;
               to_bitField0_ |= 32;
            }

            if (this.returnGoldRecordBuilder_ == null) {
               if ((this.bitField0_ & 4096) != 0) {
                  this.returnGoldRecord_ = Collections.unmodifiableList(this.returnGoldRecord_);
                  this.bitField0_ &= -4097;
               }

               result.returnGoldRecord_ = this.returnGoldRecord_;
            } else {
               result.returnGoldRecord_ = this.returnGoldRecordBuilder_.build();
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
            if (other instanceof S2C_ActivityInfo_21202) {
               return this.mergeFrom((S2C_ActivityInfo_21202)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivityInfo_21202 other) {
            if (other == ActivityComeBackMsg.S2C_ActivityInfo_21202.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasServerActivityDay()) {
                  this.setServerActivityDay(other.getServerActivityDay());
               }

               if (other.hasChargeAccount()) {
                  this.setChargeAccount(other.getChargeAccount());
               }

               if (!other.firstChargeReceiveIds_.isEmpty()) {
                  if (this.firstChargeReceiveIds_.isEmpty()) {
                     this.firstChargeReceiveIds_ = other.firstChargeReceiveIds_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureFirstChargeReceiveIdsIsMutable();
                     this.firstChargeReceiveIds_.addAll(other.firstChargeReceiveIds_);
                  }

                  this.onChanged();
               }

               if (!other.chargeReturnReceiveIds_.isEmpty()) {
                  if (this.chargeReturnReceiveIds_.isEmpty()) {
                     this.chargeReturnReceiveIds_ = other.chargeReturnReceiveIds_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureChargeReturnReceiveIdsIsMutable();
                     this.chargeReturnReceiveIds_.addAll(other.chargeReturnReceiveIds_);
                  }

                  this.onChanged();
               }

               if (!other.signReceiveIds_.isEmpty()) {
                  if (this.signReceiveIds_.isEmpty()) {
                     this.signReceiveIds_ = other.signReceiveIds_;
                     this.bitField0_ &= -17;
                  } else {
                     this.ensureSignReceiveIdsIsMutable();
                     this.signReceiveIds_.addAll(other.signReceiveIds_);
                  }

                  this.onChanged();
               }

               if (other.hasPower()) {
                  this.setPower(other.getPower());
               }

               if (!other.powerReceiveIds_.isEmpty()) {
                  if (this.powerReceiveIds_.isEmpty()) {
                     this.powerReceiveIds_ = other.powerReceiveIds_;
                     this.bitField0_ &= -65;
                  } else {
                     this.ensurePowerReceiveIdsIsMutable();
                     this.powerReceiveIds_.addAll(other.powerReceiveIds_);
                  }

                  this.onChanged();
               }

               if (other.hasActTotalOnlineTime()) {
                  this.setActTotalOnlineTime(other.getActTotalOnlineTime());
               }

               if (!other.tenDrawUseIds_.isEmpty()) {
                  if (this.tenDrawUseIds_.isEmpty()) {
                     this.tenDrawUseIds_ = other.tenDrawUseIds_;
                     this.bitField0_ &= -257;
                  } else {
                     this.ensureTenDrawUseIdsIsMutable();
                     this.tenDrawUseIds_.addAll(other.tenDrawUseIds_);
                  }

                  this.onChanged();
               }

               if (other.hasNextTenDrawCountDown()) {
                  this.setNextTenDrawCountDown(other.getNextTenDrawCountDown());
               }

               if (this.taskBuilder_ == null) {
                  if (!other.task_.isEmpty()) {
                     if (this.task_.isEmpty()) {
                        this.task_ = other.task_;
                        this.bitField0_ &= -1025;
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
                     this.bitField0_ &= -1025;
                     this.taskBuilder_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
                  } else {
                     this.taskBuilder_.addAllMessages(other.task_);
                  }
               }

               if (other.hasReturnDrawTimes()) {
                  this.setReturnDrawTimes(other.getReturnDrawTimes());
               }

               if (this.returnGoldRecordBuilder_ == null) {
                  if (!other.returnGoldRecord_.isEmpty()) {
                     if (this.returnGoldRecord_.isEmpty()) {
                        this.returnGoldRecord_ = other.returnGoldRecord_;
                        this.bitField0_ &= -4097;
                     } else {
                        this.ensureReturnGoldRecordIsMutable();
                        this.returnGoldRecord_.addAll(other.returnGoldRecord_);
                     }

                     this.onChanged();
                  }
               } else if (!other.returnGoldRecord_.isEmpty()) {
                  if (this.returnGoldRecordBuilder_.isEmpty()) {
                     this.returnGoldRecordBuilder_.dispose();
                     this.returnGoldRecordBuilder_ = null;
                     this.returnGoldRecord_ = other.returnGoldRecord_;
                     this.bitField0_ &= -4097;
                     this.returnGoldRecordBuilder_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.alwaysUseFieldBuilders ? this.getReturnGoldRecordFieldBuilder() : null;
                  } else {
                     this.returnGoldRecordBuilder_.addAllMessages(other.returnGoldRecord_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasServerActivityDay()) {
               return false;
            } else if (!this.hasChargeAccount()) {
               return false;
            } else if (!this.hasPower()) {
               return false;
            } else if (!this.hasActTotalOnlineTime()) {
               return false;
            } else if (!this.hasNextTenDrawCountDown()) {
               return false;
            } else if (!this.hasReturnDrawTimes()) {
               return false;
            } else {
               for(int i = 0; i < this.getTaskCount(); ++i) {
                  if (!this.getTask(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getReturnGoldRecordCount(); ++i) {
                  if (!this.getReturnGoldRecord(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ActivityInfo_21202 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivityInfo_21202)ActivityComeBackMsg.S2C_ActivityInfo_21202.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivityInfo_21202)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasServerActivityDay() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getServerActivityDay() {
            return this.serverActivityDay_;
         }

         public Builder setServerActivityDay(int value) {
            this.bitField0_ |= 1;
            this.serverActivityDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerActivityDay() {
            this.bitField0_ &= -2;
            this.serverActivityDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasChargeAccount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getChargeAccount() {
            return this.chargeAccount_;
         }

         public Builder setChargeAccount(int value) {
            this.bitField0_ |= 2;
            this.chargeAccount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChargeAccount() {
            this.bitField0_ &= -3;
            this.chargeAccount_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureFirstChargeReceiveIdsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.firstChargeReceiveIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.mutableCopy(this.firstChargeReceiveIds_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getFirstChargeReceiveIdsList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.firstChargeReceiveIds_) : this.firstChargeReceiveIds_);
         }

         public int getFirstChargeReceiveIdsCount() {
            return this.firstChargeReceiveIds_.size();
         }

         public int getFirstChargeReceiveIds(int index) {
            return this.firstChargeReceiveIds_.getInt(index);
         }

         public Builder setFirstChargeReceiveIds(int index, int value) {
            this.ensureFirstChargeReceiveIdsIsMutable();
            this.firstChargeReceiveIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addFirstChargeReceiveIds(int value) {
            this.ensureFirstChargeReceiveIdsIsMutable();
            this.firstChargeReceiveIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllFirstChargeReceiveIds(Iterable<? extends Integer> values) {
            this.ensureFirstChargeReceiveIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.firstChargeReceiveIds_);
            this.onChanged();
            return this;
         }

         public Builder clearFirstChargeReceiveIds() {
            this.firstChargeReceiveIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         private void ensureChargeReturnReceiveIdsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.chargeReturnReceiveIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.mutableCopy(this.chargeReturnReceiveIds_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getChargeReturnReceiveIdsList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.chargeReturnReceiveIds_) : this.chargeReturnReceiveIds_);
         }

         public int getChargeReturnReceiveIdsCount() {
            return this.chargeReturnReceiveIds_.size();
         }

         public int getChargeReturnReceiveIds(int index) {
            return this.chargeReturnReceiveIds_.getInt(index);
         }

         public Builder setChargeReturnReceiveIds(int index, int value) {
            this.ensureChargeReturnReceiveIdsIsMutable();
            this.chargeReturnReceiveIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addChargeReturnReceiveIds(int value) {
            this.ensureChargeReturnReceiveIdsIsMutable();
            this.chargeReturnReceiveIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllChargeReturnReceiveIds(Iterable<? extends Integer> values) {
            this.ensureChargeReturnReceiveIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.chargeReturnReceiveIds_);
            this.onChanged();
            return this;
         }

         public Builder clearChargeReturnReceiveIds() {
            this.chargeReturnReceiveIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.emptyIntList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         private void ensureSignReceiveIdsIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.signReceiveIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.mutableCopy(this.signReceiveIds_);
               this.bitField0_ |= 16;
            }

         }

         public List<Integer> getSignReceiveIdsList() {
            return (List<Integer>)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.signReceiveIds_) : this.signReceiveIds_);
         }

         public int getSignReceiveIdsCount() {
            return this.signReceiveIds_.size();
         }

         public int getSignReceiveIds(int index) {
            return this.signReceiveIds_.getInt(index);
         }

         public Builder setSignReceiveIds(int index, int value) {
            this.ensureSignReceiveIdsIsMutable();
            this.signReceiveIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addSignReceiveIds(int value) {
            this.ensureSignReceiveIdsIsMutable();
            this.signReceiveIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllSignReceiveIds(Iterable<? extends Integer> values) {
            this.ensureSignReceiveIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.signReceiveIds_);
            this.onChanged();
            return this;
         }

         public Builder clearSignReceiveIds() {
            this.signReceiveIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.emptyIntList();
            this.bitField0_ &= -17;
            this.onChanged();
            return this;
         }

         public boolean hasPower() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getPower() {
            return this.power_;
         }

         public Builder setPower(int value) {
            this.bitField0_ |= 32;
            this.power_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPower() {
            this.bitField0_ &= -33;
            this.power_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePowerReceiveIdsIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
               this.powerReceiveIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.mutableCopy(this.powerReceiveIds_);
               this.bitField0_ |= 64;
            }

         }

         public List<Integer> getPowerReceiveIdsList() {
            return (List<Integer>)((this.bitField0_ & 64) != 0 ? Collections.unmodifiableList(this.powerReceiveIds_) : this.powerReceiveIds_);
         }

         public int getPowerReceiveIdsCount() {
            return this.powerReceiveIds_.size();
         }

         public int getPowerReceiveIds(int index) {
            return this.powerReceiveIds_.getInt(index);
         }

         public Builder setPowerReceiveIds(int index, int value) {
            this.ensurePowerReceiveIdsIsMutable();
            this.powerReceiveIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPowerReceiveIds(int value) {
            this.ensurePowerReceiveIdsIsMutable();
            this.powerReceiveIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPowerReceiveIds(Iterable<? extends Integer> values) {
            this.ensurePowerReceiveIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.powerReceiveIds_);
            this.onChanged();
            return this;
         }

         public Builder clearPowerReceiveIds() {
            this.powerReceiveIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.emptyIntList();
            this.bitField0_ &= -65;
            this.onChanged();
            return this;
         }

         public boolean hasActTotalOnlineTime() {
            return (this.bitField0_ & 128) != 0;
         }

         public long getActTotalOnlineTime() {
            return this.actTotalOnlineTime_;
         }

         public Builder setActTotalOnlineTime(long value) {
            this.bitField0_ |= 128;
            this.actTotalOnlineTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActTotalOnlineTime() {
            this.bitField0_ &= -129;
            this.actTotalOnlineTime_ = 0L;
            this.onChanged();
            return this;
         }

         private void ensureTenDrawUseIdsIsMutable() {
            if ((this.bitField0_ & 256) == 0) {
               this.tenDrawUseIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.mutableCopy(this.tenDrawUseIds_);
               this.bitField0_ |= 256;
            }

         }

         public List<Integer> getTenDrawUseIdsList() {
            return (List<Integer>)((this.bitField0_ & 256) != 0 ? Collections.unmodifiableList(this.tenDrawUseIds_) : this.tenDrawUseIds_);
         }

         public int getTenDrawUseIdsCount() {
            return this.tenDrawUseIds_.size();
         }

         public int getTenDrawUseIds(int index) {
            return this.tenDrawUseIds_.getInt(index);
         }

         public Builder setTenDrawUseIds(int index, int value) {
            this.ensureTenDrawUseIdsIsMutable();
            this.tenDrawUseIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTenDrawUseIds(int value) {
            this.ensureTenDrawUseIdsIsMutable();
            this.tenDrawUseIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTenDrawUseIds(Iterable<? extends Integer> values) {
            this.ensureTenDrawUseIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.tenDrawUseIds_);
            this.onChanged();
            return this;
         }

         public Builder clearTenDrawUseIds() {
            this.tenDrawUseIds_ = ActivityComeBackMsg.S2C_ActivityInfo_21202.emptyIntList();
            this.bitField0_ &= -257;
            this.onChanged();
            return this;
         }

         public boolean hasNextTenDrawCountDown() {
            return (this.bitField0_ & 512) != 0;
         }

         public long getNextTenDrawCountDown() {
            return this.nextTenDrawCountDown_;
         }

         public Builder setNextTenDrawCountDown(long value) {
            this.bitField0_ |= 512;
            this.nextTenDrawCountDown_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNextTenDrawCountDown() {
            this.bitField0_ &= -513;
            this.nextTenDrawCountDown_ = 0L;
            this.onChanged();
            return this;
         }

         private void ensureTaskIsMutable() {
            if ((this.bitField0_ & 1024) == 0) {
               this.task_ = new ArrayList(this.task_);
               this.bitField0_ |= 1024;
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
               this.bitField0_ &= -1025;
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
               this.taskBuilder_ = new RepeatedFieldBuilderV3(this.task_, (this.bitField0_ & 1024) != 0, this.getParentForChildren(), this.isClean());
               this.task_ = null;
            }

            return this.taskBuilder_;
         }

         public boolean hasReturnDrawTimes() {
            return (this.bitField0_ & 2048) != 0;
         }

         public int getReturnDrawTimes() {
            return this.returnDrawTimes_;
         }

         public Builder setReturnDrawTimes(int value) {
            this.bitField0_ |= 2048;
            this.returnDrawTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearReturnDrawTimes() {
            this.bitField0_ &= -2049;
            this.returnDrawTimes_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureReturnGoldRecordIsMutable() {
            if ((this.bitField0_ & 4096) == 0) {
               this.returnGoldRecord_ = new ArrayList(this.returnGoldRecord_);
               this.bitField0_ |= 4096;
            }

         }

         public List<CommonMsg.MapDataII> getReturnGoldRecordList() {
            return this.returnGoldRecordBuilder_ == null ? Collections.unmodifiableList(this.returnGoldRecord_) : this.returnGoldRecordBuilder_.getMessageList();
         }

         public int getReturnGoldRecordCount() {
            return this.returnGoldRecordBuilder_ == null ? this.returnGoldRecord_.size() : this.returnGoldRecordBuilder_.getCount();
         }

         public CommonMsg.MapDataII getReturnGoldRecord(int index) {
            return this.returnGoldRecordBuilder_ == null ? (CommonMsg.MapDataII)this.returnGoldRecord_.get(index) : (CommonMsg.MapDataII)this.returnGoldRecordBuilder_.getMessage(index);
         }

         public Builder setReturnGoldRecord(int index, CommonMsg.MapDataII value) {
            if (this.returnGoldRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureReturnGoldRecordIsMutable();
               this.returnGoldRecord_.set(index, value);
               this.onChanged();
            } else {
               this.returnGoldRecordBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setReturnGoldRecord(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.returnGoldRecordBuilder_ == null) {
               this.ensureReturnGoldRecordIsMutable();
               this.returnGoldRecord_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.returnGoldRecordBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addReturnGoldRecord(CommonMsg.MapDataII value) {
            if (this.returnGoldRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureReturnGoldRecordIsMutable();
               this.returnGoldRecord_.add(value);
               this.onChanged();
            } else {
               this.returnGoldRecordBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addReturnGoldRecord(int index, CommonMsg.MapDataII value) {
            if (this.returnGoldRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureReturnGoldRecordIsMutable();
               this.returnGoldRecord_.add(index, value);
               this.onChanged();
            } else {
               this.returnGoldRecordBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addReturnGoldRecord(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.returnGoldRecordBuilder_ == null) {
               this.ensureReturnGoldRecordIsMutable();
               this.returnGoldRecord_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.returnGoldRecordBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addReturnGoldRecord(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.returnGoldRecordBuilder_ == null) {
               this.ensureReturnGoldRecordIsMutable();
               this.returnGoldRecord_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.returnGoldRecordBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllReturnGoldRecord(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.returnGoldRecordBuilder_ == null) {
               this.ensureReturnGoldRecordIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.returnGoldRecord_);
               this.onChanged();
            } else {
               this.returnGoldRecordBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearReturnGoldRecord() {
            if (this.returnGoldRecordBuilder_ == null) {
               this.returnGoldRecord_ = Collections.emptyList();
               this.bitField0_ &= -4097;
               this.onChanged();
            } else {
               this.returnGoldRecordBuilder_.clear();
            }

            return this;
         }

         public Builder removeReturnGoldRecord(int index) {
            if (this.returnGoldRecordBuilder_ == null) {
               this.ensureReturnGoldRecordIsMutable();
               this.returnGoldRecord_.remove(index);
               this.onChanged();
            } else {
               this.returnGoldRecordBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getReturnGoldRecordBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getReturnGoldRecordFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getReturnGoldRecordOrBuilder(int index) {
            return this.returnGoldRecordBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.returnGoldRecord_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.returnGoldRecordBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getReturnGoldRecordOrBuilderList() {
            return this.returnGoldRecordBuilder_ != null ? this.returnGoldRecordBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.returnGoldRecord_);
         }

         public CommonMsg.MapDataII.Builder addReturnGoldRecordBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getReturnGoldRecordFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addReturnGoldRecordBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getReturnGoldRecordFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getReturnGoldRecordBuilderList() {
            return this.getReturnGoldRecordFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getReturnGoldRecordFieldBuilder() {
            if (this.returnGoldRecordBuilder_ == null) {
               this.returnGoldRecordBuilder_ = new RepeatedFieldBuilderV3(this.returnGoldRecord_, (this.bitField0_ & 4096) != 0, this.getParentForChildren(), this.isClean());
               this.returnGoldRecord_ = null;
            }

            return this.returnGoldRecordBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_FirstChargeReceive_21203 extends GeneratedMessageV3 implements C2S_FirstChargeReceive_21203OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_FirstChargeReceive_21203 DEFAULT_INSTANCE = new C2S_FirstChargeReceive_21203();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FirstChargeReceive_21203> PARSER = new AbstractParser<C2S_FirstChargeReceive_21203>() {
         public C2S_FirstChargeReceive_21203 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FirstChargeReceive_21203(input, extensionRegistry);
         }
      };

      private C2S_FirstChargeReceive_21203(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FirstChargeReceive_21203() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FirstChargeReceive_21203();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FirstChargeReceive_21203(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_FirstChargeReceive_21203_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_FirstChargeReceive_21203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FirstChargeReceive_21203.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FirstChargeReceive_21203)) {
            return super.equals(obj);
         } else {
            C2S_FirstChargeReceive_21203 other = (C2S_FirstChargeReceive_21203)obj;
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

      public static C2S_FirstChargeReceive_21203 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FirstChargeReceive_21203)PARSER.parseFrom(data);
      }

      public static C2S_FirstChargeReceive_21203 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FirstChargeReceive_21203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FirstChargeReceive_21203 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FirstChargeReceive_21203)PARSER.parseFrom(data);
      }

      public static C2S_FirstChargeReceive_21203 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FirstChargeReceive_21203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FirstChargeReceive_21203 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FirstChargeReceive_21203)PARSER.parseFrom(data);
      }

      public static C2S_FirstChargeReceive_21203 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FirstChargeReceive_21203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FirstChargeReceive_21203 parseFrom(InputStream input) throws IOException {
         return (C2S_FirstChargeReceive_21203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FirstChargeReceive_21203 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FirstChargeReceive_21203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FirstChargeReceive_21203 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FirstChargeReceive_21203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FirstChargeReceive_21203 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FirstChargeReceive_21203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FirstChargeReceive_21203 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FirstChargeReceive_21203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FirstChargeReceive_21203 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FirstChargeReceive_21203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FirstChargeReceive_21203 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FirstChargeReceive_21203 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FirstChargeReceive_21203> parser() {
         return PARSER;
      }

      public Parser<C2S_FirstChargeReceive_21203> getParserForType() {
         return PARSER;
      }

      public C2S_FirstChargeReceive_21203 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FirstChargeReceive_21203OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_FirstChargeReceive_21203_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_FirstChargeReceive_21203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FirstChargeReceive_21203.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityComeBackMsg.C2S_FirstChargeReceive_21203.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_FirstChargeReceive_21203_descriptor;
         }

         public C2S_FirstChargeReceive_21203 getDefaultInstanceForType() {
            return ActivityComeBackMsg.C2S_FirstChargeReceive_21203.getDefaultInstance();
         }

         public C2S_FirstChargeReceive_21203 build() {
            C2S_FirstChargeReceive_21203 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FirstChargeReceive_21203 buildPartial() {
            C2S_FirstChargeReceive_21203 result = new C2S_FirstChargeReceive_21203(this);
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
            if (other instanceof C2S_FirstChargeReceive_21203) {
               return this.mergeFrom((C2S_FirstChargeReceive_21203)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FirstChargeReceive_21203 other) {
            if (other == ActivityComeBackMsg.C2S_FirstChargeReceive_21203.getDefaultInstance()) {
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
            C2S_FirstChargeReceive_21203 parsedMessage = null;

            try {
               parsedMessage = (C2S_FirstChargeReceive_21203)ActivityComeBackMsg.C2S_FirstChargeReceive_21203.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FirstChargeReceive_21203)e.getUnfinishedMessage();
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

   public static final class S2C_FirstChargeReceive_21204 extends GeneratedMessageV3 implements S2C_FirstChargeReceive_21204OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECEIVEIDS_FIELD_NUMBER = 1;
      private Internal.IntList receiveIds_;
      private byte memoizedIsInitialized;
      private static final S2C_FirstChargeReceive_21204 DEFAULT_INSTANCE = new S2C_FirstChargeReceive_21204();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FirstChargeReceive_21204> PARSER = new AbstractParser<S2C_FirstChargeReceive_21204>() {
         public S2C_FirstChargeReceive_21204 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FirstChargeReceive_21204(input, extensionRegistry);
         }
      };

      private S2C_FirstChargeReceive_21204(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FirstChargeReceive_21204() {
         this.memoizedIsInitialized = -1;
         this.receiveIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FirstChargeReceive_21204();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FirstChargeReceive_21204(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.receiveIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.receiveIds_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.receiveIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.receiveIds_.addInt(input.readInt32());
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
                  this.receiveIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_FirstChargeReceive_21204_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_FirstChargeReceive_21204_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FirstChargeReceive_21204.class, Builder.class);
      }

      public List<Integer> getReceiveIdsList() {
         return this.receiveIds_;
      }

      public int getReceiveIdsCount() {
         return this.receiveIds_.size();
      }

      public int getReceiveIds(int index) {
         return this.receiveIds_.getInt(index);
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
         for(int i = 0; i < this.receiveIds_.size(); ++i) {
            output.writeInt32(1, this.receiveIds_.getInt(i));
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

            for(int i = 0; i < this.receiveIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.receiveIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getReceiveIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FirstChargeReceive_21204)) {
            return super.equals(obj);
         } else {
            S2C_FirstChargeReceive_21204 other = (S2C_FirstChargeReceive_21204)obj;
            if (!this.getReceiveIdsList().equals(other.getReceiveIdsList())) {
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
            if (this.getReceiveIdsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getReceiveIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FirstChargeReceive_21204 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FirstChargeReceive_21204)PARSER.parseFrom(data);
      }

      public static S2C_FirstChargeReceive_21204 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FirstChargeReceive_21204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FirstChargeReceive_21204 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FirstChargeReceive_21204)PARSER.parseFrom(data);
      }

      public static S2C_FirstChargeReceive_21204 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FirstChargeReceive_21204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FirstChargeReceive_21204 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FirstChargeReceive_21204)PARSER.parseFrom(data);
      }

      public static S2C_FirstChargeReceive_21204 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FirstChargeReceive_21204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FirstChargeReceive_21204 parseFrom(InputStream input) throws IOException {
         return (S2C_FirstChargeReceive_21204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FirstChargeReceive_21204 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FirstChargeReceive_21204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FirstChargeReceive_21204 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FirstChargeReceive_21204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FirstChargeReceive_21204 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FirstChargeReceive_21204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FirstChargeReceive_21204 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FirstChargeReceive_21204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FirstChargeReceive_21204 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FirstChargeReceive_21204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FirstChargeReceive_21204 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FirstChargeReceive_21204 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FirstChargeReceive_21204> parser() {
         return PARSER;
      }

      public Parser<S2C_FirstChargeReceive_21204> getParserForType() {
         return PARSER;
      }

      public S2C_FirstChargeReceive_21204 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FirstChargeReceive_21204OrBuilder {
         private int bitField0_;
         private Internal.IntList receiveIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_FirstChargeReceive_21204_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_FirstChargeReceive_21204_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FirstChargeReceive_21204.class, Builder.class);
         }

         private Builder() {
            this.receiveIds_ = ActivityComeBackMsg.S2C_FirstChargeReceive_21204.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.receiveIds_ = ActivityComeBackMsg.S2C_FirstChargeReceive_21204.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityComeBackMsg.S2C_FirstChargeReceive_21204.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.receiveIds_ = ActivityComeBackMsg.S2C_FirstChargeReceive_21204.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_FirstChargeReceive_21204_descriptor;
         }

         public S2C_FirstChargeReceive_21204 getDefaultInstanceForType() {
            return ActivityComeBackMsg.S2C_FirstChargeReceive_21204.getDefaultInstance();
         }

         public S2C_FirstChargeReceive_21204 build() {
            S2C_FirstChargeReceive_21204 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FirstChargeReceive_21204 buildPartial() {
            S2C_FirstChargeReceive_21204 result = new S2C_FirstChargeReceive_21204(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.receiveIds_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.receiveIds_ = this.receiveIds_;
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
            if (other instanceof S2C_FirstChargeReceive_21204) {
               return this.mergeFrom((S2C_FirstChargeReceive_21204)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FirstChargeReceive_21204 other) {
            if (other == ActivityComeBackMsg.S2C_FirstChargeReceive_21204.getDefaultInstance()) {
               return this;
            } else {
               if (!other.receiveIds_.isEmpty()) {
                  if (this.receiveIds_.isEmpty()) {
                     this.receiveIds_ = other.receiveIds_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureReceiveIdsIsMutable();
                     this.receiveIds_.addAll(other.receiveIds_);
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
            S2C_FirstChargeReceive_21204 parsedMessage = null;

            try {
               parsedMessage = (S2C_FirstChargeReceive_21204)ActivityComeBackMsg.S2C_FirstChargeReceive_21204.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FirstChargeReceive_21204)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureReceiveIdsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.receiveIds_ = ActivityComeBackMsg.S2C_FirstChargeReceive_21204.mutableCopy(this.receiveIds_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getReceiveIdsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.receiveIds_) : this.receiveIds_);
         }

         public int getReceiveIdsCount() {
            return this.receiveIds_.size();
         }

         public int getReceiveIds(int index) {
            return this.receiveIds_.getInt(index);
         }

         public Builder setReceiveIds(int index, int value) {
            this.ensureReceiveIdsIsMutable();
            this.receiveIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addReceiveIds(int value) {
            this.ensureReceiveIdsIsMutable();
            this.receiveIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllReceiveIds(Iterable<? extends Integer> values) {
            this.ensureReceiveIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.receiveIds_);
            this.onChanged();
            return this;
         }

         public Builder clearReceiveIds() {
            this.receiveIds_ = ActivityComeBackMsg.S2C_FirstChargeReceive_21204.emptyIntList();
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

   public static final class C2S_ChargeReturnReceive_21205 extends GeneratedMessageV3 implements C2S_ChargeReturnReceive_21205OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_ChargeReturnReceive_21205 DEFAULT_INSTANCE = new C2S_ChargeReturnReceive_21205();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ChargeReturnReceive_21205> PARSER = new AbstractParser<C2S_ChargeReturnReceive_21205>() {
         public C2S_ChargeReturnReceive_21205 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ChargeReturnReceive_21205(input, extensionRegistry);
         }
      };

      private C2S_ChargeReturnReceive_21205(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ChargeReturnReceive_21205() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ChargeReturnReceive_21205();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ChargeReturnReceive_21205(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_ChargeReturnReceive_21205_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_ChargeReturnReceive_21205_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChargeReturnReceive_21205.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ChargeReturnReceive_21205)) {
            return super.equals(obj);
         } else {
            C2S_ChargeReturnReceive_21205 other = (C2S_ChargeReturnReceive_21205)obj;
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

      public static C2S_ChargeReturnReceive_21205 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ChargeReturnReceive_21205)PARSER.parseFrom(data);
      }

      public static C2S_ChargeReturnReceive_21205 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChargeReturnReceive_21205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChargeReturnReceive_21205 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ChargeReturnReceive_21205)PARSER.parseFrom(data);
      }

      public static C2S_ChargeReturnReceive_21205 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChargeReturnReceive_21205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChargeReturnReceive_21205 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ChargeReturnReceive_21205)PARSER.parseFrom(data);
      }

      public static C2S_ChargeReturnReceive_21205 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChargeReturnReceive_21205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChargeReturnReceive_21205 parseFrom(InputStream input) throws IOException {
         return (C2S_ChargeReturnReceive_21205)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChargeReturnReceive_21205 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChargeReturnReceive_21205)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChargeReturnReceive_21205 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ChargeReturnReceive_21205)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ChargeReturnReceive_21205 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChargeReturnReceive_21205)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChargeReturnReceive_21205 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ChargeReturnReceive_21205)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChargeReturnReceive_21205 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChargeReturnReceive_21205)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ChargeReturnReceive_21205 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ChargeReturnReceive_21205 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ChargeReturnReceive_21205> parser() {
         return PARSER;
      }

      public Parser<C2S_ChargeReturnReceive_21205> getParserForType() {
         return PARSER;
      }

      public C2S_ChargeReturnReceive_21205 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ChargeReturnReceive_21205OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_ChargeReturnReceive_21205_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_ChargeReturnReceive_21205_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChargeReturnReceive_21205.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityComeBackMsg.C2S_ChargeReturnReceive_21205.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_ChargeReturnReceive_21205_descriptor;
         }

         public C2S_ChargeReturnReceive_21205 getDefaultInstanceForType() {
            return ActivityComeBackMsg.C2S_ChargeReturnReceive_21205.getDefaultInstance();
         }

         public C2S_ChargeReturnReceive_21205 build() {
            C2S_ChargeReturnReceive_21205 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ChargeReturnReceive_21205 buildPartial() {
            C2S_ChargeReturnReceive_21205 result = new C2S_ChargeReturnReceive_21205(this);
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
            if (other instanceof C2S_ChargeReturnReceive_21205) {
               return this.mergeFrom((C2S_ChargeReturnReceive_21205)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ChargeReturnReceive_21205 other) {
            if (other == ActivityComeBackMsg.C2S_ChargeReturnReceive_21205.getDefaultInstance()) {
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
            C2S_ChargeReturnReceive_21205 parsedMessage = null;

            try {
               parsedMessage = (C2S_ChargeReturnReceive_21205)ActivityComeBackMsg.C2S_ChargeReturnReceive_21205.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ChargeReturnReceive_21205)e.getUnfinishedMessage();
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

   public static final class S2C_ChargeReturnReceive_21206 extends GeneratedMessageV3 implements S2C_ChargeReturnReceive_21206OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECEIVEIDS_FIELD_NUMBER = 1;
      private Internal.IntList receiveIds_;
      private byte memoizedIsInitialized;
      private static final S2C_ChargeReturnReceive_21206 DEFAULT_INSTANCE = new S2C_ChargeReturnReceive_21206();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ChargeReturnReceive_21206> PARSER = new AbstractParser<S2C_ChargeReturnReceive_21206>() {
         public S2C_ChargeReturnReceive_21206 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ChargeReturnReceive_21206(input, extensionRegistry);
         }
      };

      private S2C_ChargeReturnReceive_21206(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ChargeReturnReceive_21206() {
         this.memoizedIsInitialized = -1;
         this.receiveIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ChargeReturnReceive_21206();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ChargeReturnReceive_21206(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.receiveIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.receiveIds_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.receiveIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.receiveIds_.addInt(input.readInt32());
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
                  this.receiveIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_ChargeReturnReceive_21206_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_ChargeReturnReceive_21206_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChargeReturnReceive_21206.class, Builder.class);
      }

      public List<Integer> getReceiveIdsList() {
         return this.receiveIds_;
      }

      public int getReceiveIdsCount() {
         return this.receiveIds_.size();
      }

      public int getReceiveIds(int index) {
         return this.receiveIds_.getInt(index);
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
         for(int i = 0; i < this.receiveIds_.size(); ++i) {
            output.writeInt32(1, this.receiveIds_.getInt(i));
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

            for(int i = 0; i < this.receiveIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.receiveIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getReceiveIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ChargeReturnReceive_21206)) {
            return super.equals(obj);
         } else {
            S2C_ChargeReturnReceive_21206 other = (S2C_ChargeReturnReceive_21206)obj;
            if (!this.getReceiveIdsList().equals(other.getReceiveIdsList())) {
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
            if (this.getReceiveIdsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getReceiveIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ChargeReturnReceive_21206 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ChargeReturnReceive_21206)PARSER.parseFrom(data);
      }

      public static S2C_ChargeReturnReceive_21206 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChargeReturnReceive_21206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChargeReturnReceive_21206 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ChargeReturnReceive_21206)PARSER.parseFrom(data);
      }

      public static S2C_ChargeReturnReceive_21206 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChargeReturnReceive_21206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChargeReturnReceive_21206 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ChargeReturnReceive_21206)PARSER.parseFrom(data);
      }

      public static S2C_ChargeReturnReceive_21206 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChargeReturnReceive_21206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChargeReturnReceive_21206 parseFrom(InputStream input) throws IOException {
         return (S2C_ChargeReturnReceive_21206)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChargeReturnReceive_21206 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChargeReturnReceive_21206)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChargeReturnReceive_21206 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ChargeReturnReceive_21206)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ChargeReturnReceive_21206 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChargeReturnReceive_21206)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChargeReturnReceive_21206 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ChargeReturnReceive_21206)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChargeReturnReceive_21206 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChargeReturnReceive_21206)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ChargeReturnReceive_21206 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ChargeReturnReceive_21206 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ChargeReturnReceive_21206> parser() {
         return PARSER;
      }

      public Parser<S2C_ChargeReturnReceive_21206> getParserForType() {
         return PARSER;
      }

      public S2C_ChargeReturnReceive_21206 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ChargeReturnReceive_21206OrBuilder {
         private int bitField0_;
         private Internal.IntList receiveIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_ChargeReturnReceive_21206_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_ChargeReturnReceive_21206_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChargeReturnReceive_21206.class, Builder.class);
         }

         private Builder() {
            this.receiveIds_ = ActivityComeBackMsg.S2C_ChargeReturnReceive_21206.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.receiveIds_ = ActivityComeBackMsg.S2C_ChargeReturnReceive_21206.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityComeBackMsg.S2C_ChargeReturnReceive_21206.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.receiveIds_ = ActivityComeBackMsg.S2C_ChargeReturnReceive_21206.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_ChargeReturnReceive_21206_descriptor;
         }

         public S2C_ChargeReturnReceive_21206 getDefaultInstanceForType() {
            return ActivityComeBackMsg.S2C_ChargeReturnReceive_21206.getDefaultInstance();
         }

         public S2C_ChargeReturnReceive_21206 build() {
            S2C_ChargeReturnReceive_21206 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ChargeReturnReceive_21206 buildPartial() {
            S2C_ChargeReturnReceive_21206 result = new S2C_ChargeReturnReceive_21206(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.receiveIds_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.receiveIds_ = this.receiveIds_;
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
            if (other instanceof S2C_ChargeReturnReceive_21206) {
               return this.mergeFrom((S2C_ChargeReturnReceive_21206)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ChargeReturnReceive_21206 other) {
            if (other == ActivityComeBackMsg.S2C_ChargeReturnReceive_21206.getDefaultInstance()) {
               return this;
            } else {
               if (!other.receiveIds_.isEmpty()) {
                  if (this.receiveIds_.isEmpty()) {
                     this.receiveIds_ = other.receiveIds_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureReceiveIdsIsMutable();
                     this.receiveIds_.addAll(other.receiveIds_);
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
            S2C_ChargeReturnReceive_21206 parsedMessage = null;

            try {
               parsedMessage = (S2C_ChargeReturnReceive_21206)ActivityComeBackMsg.S2C_ChargeReturnReceive_21206.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ChargeReturnReceive_21206)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureReceiveIdsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.receiveIds_ = ActivityComeBackMsg.S2C_ChargeReturnReceive_21206.mutableCopy(this.receiveIds_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getReceiveIdsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.receiveIds_) : this.receiveIds_);
         }

         public int getReceiveIdsCount() {
            return this.receiveIds_.size();
         }

         public int getReceiveIds(int index) {
            return this.receiveIds_.getInt(index);
         }

         public Builder setReceiveIds(int index, int value) {
            this.ensureReceiveIdsIsMutable();
            this.receiveIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addReceiveIds(int value) {
            this.ensureReceiveIdsIsMutable();
            this.receiveIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllReceiveIds(Iterable<? extends Integer> values) {
            this.ensureReceiveIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.receiveIds_);
            this.onChanged();
            return this;
         }

         public Builder clearReceiveIds() {
            this.receiveIds_ = ActivityComeBackMsg.S2C_ChargeReturnReceive_21206.emptyIntList();
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

   public static final class C2S_SignReceive_21207 extends GeneratedMessageV3 implements C2S_SignReceive_21207OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_SignReceive_21207 DEFAULT_INSTANCE = new C2S_SignReceive_21207();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SignReceive_21207> PARSER = new AbstractParser<C2S_SignReceive_21207>() {
         public C2S_SignReceive_21207 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SignReceive_21207(input, extensionRegistry);
         }
      };

      private C2S_SignReceive_21207(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SignReceive_21207() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SignReceive_21207();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SignReceive_21207(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_SignReceive_21207_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_SignReceive_21207_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SignReceive_21207.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SignReceive_21207)) {
            return super.equals(obj);
         } else {
            C2S_SignReceive_21207 other = (C2S_SignReceive_21207)obj;
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

      public static C2S_SignReceive_21207 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SignReceive_21207)PARSER.parseFrom(data);
      }

      public static C2S_SignReceive_21207 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignReceive_21207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignReceive_21207 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SignReceive_21207)PARSER.parseFrom(data);
      }

      public static C2S_SignReceive_21207 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignReceive_21207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignReceive_21207 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SignReceive_21207)PARSER.parseFrom(data);
      }

      public static C2S_SignReceive_21207 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignReceive_21207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignReceive_21207 parseFrom(InputStream input) throws IOException {
         return (C2S_SignReceive_21207)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SignReceive_21207 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignReceive_21207)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SignReceive_21207 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SignReceive_21207)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SignReceive_21207 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignReceive_21207)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SignReceive_21207 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SignReceive_21207)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SignReceive_21207 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignReceive_21207)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SignReceive_21207 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SignReceive_21207 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SignReceive_21207> parser() {
         return PARSER;
      }

      public Parser<C2S_SignReceive_21207> getParserForType() {
         return PARSER;
      }

      public C2S_SignReceive_21207 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SignReceive_21207OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_SignReceive_21207_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_SignReceive_21207_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SignReceive_21207.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityComeBackMsg.C2S_SignReceive_21207.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_SignReceive_21207_descriptor;
         }

         public C2S_SignReceive_21207 getDefaultInstanceForType() {
            return ActivityComeBackMsg.C2S_SignReceive_21207.getDefaultInstance();
         }

         public C2S_SignReceive_21207 build() {
            C2S_SignReceive_21207 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SignReceive_21207 buildPartial() {
            C2S_SignReceive_21207 result = new C2S_SignReceive_21207(this);
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
            if (other instanceof C2S_SignReceive_21207) {
               return this.mergeFrom((C2S_SignReceive_21207)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SignReceive_21207 other) {
            if (other == ActivityComeBackMsg.C2S_SignReceive_21207.getDefaultInstance()) {
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
            C2S_SignReceive_21207 parsedMessage = null;

            try {
               parsedMessage = (C2S_SignReceive_21207)ActivityComeBackMsg.C2S_SignReceive_21207.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SignReceive_21207)e.getUnfinishedMessage();
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

   public static final class S2C_SignReceive_21208 extends GeneratedMessageV3 implements S2C_SignReceive_21208OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECEIVEIDS_FIELD_NUMBER = 1;
      private Internal.IntList receiveIds_;
      private byte memoizedIsInitialized;
      private static final S2C_SignReceive_21208 DEFAULT_INSTANCE = new S2C_SignReceive_21208();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SignReceive_21208> PARSER = new AbstractParser<S2C_SignReceive_21208>() {
         public S2C_SignReceive_21208 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SignReceive_21208(input, extensionRegistry);
         }
      };

      private S2C_SignReceive_21208(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SignReceive_21208() {
         this.memoizedIsInitialized = -1;
         this.receiveIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SignReceive_21208();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SignReceive_21208(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.receiveIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.receiveIds_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.receiveIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.receiveIds_.addInt(input.readInt32());
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
                  this.receiveIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_SignReceive_21208_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_SignReceive_21208_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SignReceive_21208.class, Builder.class);
      }

      public List<Integer> getReceiveIdsList() {
         return this.receiveIds_;
      }

      public int getReceiveIdsCount() {
         return this.receiveIds_.size();
      }

      public int getReceiveIds(int index) {
         return this.receiveIds_.getInt(index);
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
         for(int i = 0; i < this.receiveIds_.size(); ++i) {
            output.writeInt32(1, this.receiveIds_.getInt(i));
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

            for(int i = 0; i < this.receiveIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.receiveIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getReceiveIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SignReceive_21208)) {
            return super.equals(obj);
         } else {
            S2C_SignReceive_21208 other = (S2C_SignReceive_21208)obj;
            if (!this.getReceiveIdsList().equals(other.getReceiveIdsList())) {
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
            if (this.getReceiveIdsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getReceiveIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SignReceive_21208 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SignReceive_21208)PARSER.parseFrom(data);
      }

      public static S2C_SignReceive_21208 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignReceive_21208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignReceive_21208 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SignReceive_21208)PARSER.parseFrom(data);
      }

      public static S2C_SignReceive_21208 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignReceive_21208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignReceive_21208 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SignReceive_21208)PARSER.parseFrom(data);
      }

      public static S2C_SignReceive_21208 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignReceive_21208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignReceive_21208 parseFrom(InputStream input) throws IOException {
         return (S2C_SignReceive_21208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SignReceive_21208 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignReceive_21208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SignReceive_21208 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SignReceive_21208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SignReceive_21208 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignReceive_21208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SignReceive_21208 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SignReceive_21208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SignReceive_21208 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignReceive_21208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SignReceive_21208 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SignReceive_21208 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SignReceive_21208> parser() {
         return PARSER;
      }

      public Parser<S2C_SignReceive_21208> getParserForType() {
         return PARSER;
      }

      public S2C_SignReceive_21208 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SignReceive_21208OrBuilder {
         private int bitField0_;
         private Internal.IntList receiveIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_SignReceive_21208_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_SignReceive_21208_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SignReceive_21208.class, Builder.class);
         }

         private Builder() {
            this.receiveIds_ = ActivityComeBackMsg.S2C_SignReceive_21208.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.receiveIds_ = ActivityComeBackMsg.S2C_SignReceive_21208.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityComeBackMsg.S2C_SignReceive_21208.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.receiveIds_ = ActivityComeBackMsg.S2C_SignReceive_21208.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_SignReceive_21208_descriptor;
         }

         public S2C_SignReceive_21208 getDefaultInstanceForType() {
            return ActivityComeBackMsg.S2C_SignReceive_21208.getDefaultInstance();
         }

         public S2C_SignReceive_21208 build() {
            S2C_SignReceive_21208 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SignReceive_21208 buildPartial() {
            S2C_SignReceive_21208 result = new S2C_SignReceive_21208(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.receiveIds_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.receiveIds_ = this.receiveIds_;
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
            if (other instanceof S2C_SignReceive_21208) {
               return this.mergeFrom((S2C_SignReceive_21208)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SignReceive_21208 other) {
            if (other == ActivityComeBackMsg.S2C_SignReceive_21208.getDefaultInstance()) {
               return this;
            } else {
               if (!other.receiveIds_.isEmpty()) {
                  if (this.receiveIds_.isEmpty()) {
                     this.receiveIds_ = other.receiveIds_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureReceiveIdsIsMutable();
                     this.receiveIds_.addAll(other.receiveIds_);
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
            S2C_SignReceive_21208 parsedMessage = null;

            try {
               parsedMessage = (S2C_SignReceive_21208)ActivityComeBackMsg.S2C_SignReceive_21208.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SignReceive_21208)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureReceiveIdsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.receiveIds_ = ActivityComeBackMsg.S2C_SignReceive_21208.mutableCopy(this.receiveIds_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getReceiveIdsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.receiveIds_) : this.receiveIds_);
         }

         public int getReceiveIdsCount() {
            return this.receiveIds_.size();
         }

         public int getReceiveIds(int index) {
            return this.receiveIds_.getInt(index);
         }

         public Builder setReceiveIds(int index, int value) {
            this.ensureReceiveIdsIsMutable();
            this.receiveIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addReceiveIds(int value) {
            this.ensureReceiveIdsIsMutable();
            this.receiveIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllReceiveIds(Iterable<? extends Integer> values) {
            this.ensureReceiveIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.receiveIds_);
            this.onChanged();
            return this;
         }

         public Builder clearReceiveIds() {
            this.receiveIds_ = ActivityComeBackMsg.S2C_SignReceive_21208.emptyIntList();
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

   public static final class C2S_PowerBoxReceive_21209 extends GeneratedMessageV3 implements C2S_PowerBoxReceive_21209OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_PowerBoxReceive_21209 DEFAULT_INSTANCE = new C2S_PowerBoxReceive_21209();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PowerBoxReceive_21209> PARSER = new AbstractParser<C2S_PowerBoxReceive_21209>() {
         public C2S_PowerBoxReceive_21209 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PowerBoxReceive_21209(input, extensionRegistry);
         }
      };

      private C2S_PowerBoxReceive_21209(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PowerBoxReceive_21209() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PowerBoxReceive_21209();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PowerBoxReceive_21209(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_PowerBoxReceive_21209_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_PowerBoxReceive_21209_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PowerBoxReceive_21209.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PowerBoxReceive_21209)) {
            return super.equals(obj);
         } else {
            C2S_PowerBoxReceive_21209 other = (C2S_PowerBoxReceive_21209)obj;
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

      public static C2S_PowerBoxReceive_21209 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PowerBoxReceive_21209)PARSER.parseFrom(data);
      }

      public static C2S_PowerBoxReceive_21209 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PowerBoxReceive_21209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PowerBoxReceive_21209 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PowerBoxReceive_21209)PARSER.parseFrom(data);
      }

      public static C2S_PowerBoxReceive_21209 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PowerBoxReceive_21209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PowerBoxReceive_21209 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PowerBoxReceive_21209)PARSER.parseFrom(data);
      }

      public static C2S_PowerBoxReceive_21209 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PowerBoxReceive_21209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PowerBoxReceive_21209 parseFrom(InputStream input) throws IOException {
         return (C2S_PowerBoxReceive_21209)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PowerBoxReceive_21209 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PowerBoxReceive_21209)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PowerBoxReceive_21209 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PowerBoxReceive_21209)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PowerBoxReceive_21209 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PowerBoxReceive_21209)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PowerBoxReceive_21209 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PowerBoxReceive_21209)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PowerBoxReceive_21209 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PowerBoxReceive_21209)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PowerBoxReceive_21209 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PowerBoxReceive_21209 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PowerBoxReceive_21209> parser() {
         return PARSER;
      }

      public Parser<C2S_PowerBoxReceive_21209> getParserForType() {
         return PARSER;
      }

      public C2S_PowerBoxReceive_21209 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PowerBoxReceive_21209OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_PowerBoxReceive_21209_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_PowerBoxReceive_21209_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PowerBoxReceive_21209.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityComeBackMsg.C2S_PowerBoxReceive_21209.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_PowerBoxReceive_21209_descriptor;
         }

         public C2S_PowerBoxReceive_21209 getDefaultInstanceForType() {
            return ActivityComeBackMsg.C2S_PowerBoxReceive_21209.getDefaultInstance();
         }

         public C2S_PowerBoxReceive_21209 build() {
            C2S_PowerBoxReceive_21209 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PowerBoxReceive_21209 buildPartial() {
            C2S_PowerBoxReceive_21209 result = new C2S_PowerBoxReceive_21209(this);
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
            if (other instanceof C2S_PowerBoxReceive_21209) {
               return this.mergeFrom((C2S_PowerBoxReceive_21209)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PowerBoxReceive_21209 other) {
            if (other == ActivityComeBackMsg.C2S_PowerBoxReceive_21209.getDefaultInstance()) {
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
            C2S_PowerBoxReceive_21209 parsedMessage = null;

            try {
               parsedMessage = (C2S_PowerBoxReceive_21209)ActivityComeBackMsg.C2S_PowerBoxReceive_21209.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PowerBoxReceive_21209)e.getUnfinishedMessage();
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

   public static final class S2C_PowerBoxReceive_21210 extends GeneratedMessageV3 implements S2C_PowerBoxReceive_21210OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECEIVEIDS_FIELD_NUMBER = 1;
      private Internal.IntList receiveIds_;
      private byte memoizedIsInitialized;
      private static final S2C_PowerBoxReceive_21210 DEFAULT_INSTANCE = new S2C_PowerBoxReceive_21210();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PowerBoxReceive_21210> PARSER = new AbstractParser<S2C_PowerBoxReceive_21210>() {
         public S2C_PowerBoxReceive_21210 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PowerBoxReceive_21210(input, extensionRegistry);
         }
      };

      private S2C_PowerBoxReceive_21210(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PowerBoxReceive_21210() {
         this.memoizedIsInitialized = -1;
         this.receiveIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PowerBoxReceive_21210();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PowerBoxReceive_21210(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.receiveIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.receiveIds_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.receiveIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.receiveIds_.addInt(input.readInt32());
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
                  this.receiveIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_PowerBoxReceive_21210_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_PowerBoxReceive_21210_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PowerBoxReceive_21210.class, Builder.class);
      }

      public List<Integer> getReceiveIdsList() {
         return this.receiveIds_;
      }

      public int getReceiveIdsCount() {
         return this.receiveIds_.size();
      }

      public int getReceiveIds(int index) {
         return this.receiveIds_.getInt(index);
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
         for(int i = 0; i < this.receiveIds_.size(); ++i) {
            output.writeInt32(1, this.receiveIds_.getInt(i));
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

            for(int i = 0; i < this.receiveIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.receiveIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getReceiveIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PowerBoxReceive_21210)) {
            return super.equals(obj);
         } else {
            S2C_PowerBoxReceive_21210 other = (S2C_PowerBoxReceive_21210)obj;
            if (!this.getReceiveIdsList().equals(other.getReceiveIdsList())) {
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
            if (this.getReceiveIdsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getReceiveIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PowerBoxReceive_21210 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PowerBoxReceive_21210)PARSER.parseFrom(data);
      }

      public static S2C_PowerBoxReceive_21210 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PowerBoxReceive_21210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PowerBoxReceive_21210 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PowerBoxReceive_21210)PARSER.parseFrom(data);
      }

      public static S2C_PowerBoxReceive_21210 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PowerBoxReceive_21210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PowerBoxReceive_21210 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PowerBoxReceive_21210)PARSER.parseFrom(data);
      }

      public static S2C_PowerBoxReceive_21210 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PowerBoxReceive_21210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PowerBoxReceive_21210 parseFrom(InputStream input) throws IOException {
         return (S2C_PowerBoxReceive_21210)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PowerBoxReceive_21210 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PowerBoxReceive_21210)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PowerBoxReceive_21210 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PowerBoxReceive_21210)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PowerBoxReceive_21210 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PowerBoxReceive_21210)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PowerBoxReceive_21210 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PowerBoxReceive_21210)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PowerBoxReceive_21210 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PowerBoxReceive_21210)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PowerBoxReceive_21210 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PowerBoxReceive_21210 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PowerBoxReceive_21210> parser() {
         return PARSER;
      }

      public Parser<S2C_PowerBoxReceive_21210> getParserForType() {
         return PARSER;
      }

      public S2C_PowerBoxReceive_21210 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PowerBoxReceive_21210OrBuilder {
         private int bitField0_;
         private Internal.IntList receiveIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_PowerBoxReceive_21210_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_PowerBoxReceive_21210_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PowerBoxReceive_21210.class, Builder.class);
         }

         private Builder() {
            this.receiveIds_ = ActivityComeBackMsg.S2C_PowerBoxReceive_21210.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.receiveIds_ = ActivityComeBackMsg.S2C_PowerBoxReceive_21210.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityComeBackMsg.S2C_PowerBoxReceive_21210.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.receiveIds_ = ActivityComeBackMsg.S2C_PowerBoxReceive_21210.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_PowerBoxReceive_21210_descriptor;
         }

         public S2C_PowerBoxReceive_21210 getDefaultInstanceForType() {
            return ActivityComeBackMsg.S2C_PowerBoxReceive_21210.getDefaultInstance();
         }

         public S2C_PowerBoxReceive_21210 build() {
            S2C_PowerBoxReceive_21210 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PowerBoxReceive_21210 buildPartial() {
            S2C_PowerBoxReceive_21210 result = new S2C_PowerBoxReceive_21210(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.receiveIds_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.receiveIds_ = this.receiveIds_;
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
            if (other instanceof S2C_PowerBoxReceive_21210) {
               return this.mergeFrom((S2C_PowerBoxReceive_21210)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PowerBoxReceive_21210 other) {
            if (other == ActivityComeBackMsg.S2C_PowerBoxReceive_21210.getDefaultInstance()) {
               return this;
            } else {
               if (!other.receiveIds_.isEmpty()) {
                  if (this.receiveIds_.isEmpty()) {
                     this.receiveIds_ = other.receiveIds_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureReceiveIdsIsMutable();
                     this.receiveIds_.addAll(other.receiveIds_);
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
            S2C_PowerBoxReceive_21210 parsedMessage = null;

            try {
               parsedMessage = (S2C_PowerBoxReceive_21210)ActivityComeBackMsg.S2C_PowerBoxReceive_21210.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PowerBoxReceive_21210)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureReceiveIdsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.receiveIds_ = ActivityComeBackMsg.S2C_PowerBoxReceive_21210.mutableCopy(this.receiveIds_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getReceiveIdsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.receiveIds_) : this.receiveIds_);
         }

         public int getReceiveIdsCount() {
            return this.receiveIds_.size();
         }

         public int getReceiveIds(int index) {
            return this.receiveIds_.getInt(index);
         }

         public Builder setReceiveIds(int index, int value) {
            this.ensureReceiveIdsIsMutable();
            this.receiveIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addReceiveIds(int value) {
            this.ensureReceiveIdsIsMutable();
            this.receiveIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllReceiveIds(Iterable<? extends Integer> values) {
            this.ensureReceiveIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.receiveIds_);
            this.onChanged();
            return this;
         }

         public Builder clearReceiveIds() {
            this.receiveIds_ = ActivityComeBackMsg.S2C_PowerBoxReceive_21210.emptyIntList();
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

   public static final class S2C_PrayTaskNotify_21211 extends GeneratedMessageV3 implements S2C_PrayTaskNotify_21211OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_PrayTaskNotify_21211 DEFAULT_INSTANCE = new S2C_PrayTaskNotify_21211();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PrayTaskNotify_21211> PARSER = new AbstractParser<S2C_PrayTaskNotify_21211>() {
         public S2C_PrayTaskNotify_21211 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PrayTaskNotify_21211(input, extensionRegistry);
         }
      };

      private S2C_PrayTaskNotify_21211(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PrayTaskNotify_21211() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PrayTaskNotify_21211();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PrayTaskNotify_21211(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_PrayTaskNotify_21211_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_PrayTaskNotify_21211_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayTaskNotify_21211.class, Builder.class);
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
         } else if (!(obj instanceof S2C_PrayTaskNotify_21211)) {
            return super.equals(obj);
         } else {
            S2C_PrayTaskNotify_21211 other = (S2C_PrayTaskNotify_21211)obj;
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

      public static S2C_PrayTaskNotify_21211 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_21211)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskNotify_21211 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_21211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_21211 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_21211)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskNotify_21211 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_21211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_21211 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_21211)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskNotify_21211 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_21211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_21211 parseFrom(InputStream input) throws IOException {
         return (S2C_PrayTaskNotify_21211)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskNotify_21211 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskNotify_21211)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_21211 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PrayTaskNotify_21211)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskNotify_21211 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskNotify_21211)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_21211 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PrayTaskNotify_21211)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskNotify_21211 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskNotify_21211)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PrayTaskNotify_21211 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PrayTaskNotify_21211 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PrayTaskNotify_21211> parser() {
         return PARSER;
      }

      public Parser<S2C_PrayTaskNotify_21211> getParserForType() {
         return PARSER;
      }

      public S2C_PrayTaskNotify_21211 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PrayTaskNotify_21211OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_PrayTaskNotify_21211_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_PrayTaskNotify_21211_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayTaskNotify_21211.class, Builder.class);
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
            if (ActivityComeBackMsg.S2C_PrayTaskNotify_21211.alwaysUseFieldBuilders) {
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
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_PrayTaskNotify_21211_descriptor;
         }

         public S2C_PrayTaskNotify_21211 getDefaultInstanceForType() {
            return ActivityComeBackMsg.S2C_PrayTaskNotify_21211.getDefaultInstance();
         }

         public S2C_PrayTaskNotify_21211 build() {
            S2C_PrayTaskNotify_21211 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PrayTaskNotify_21211 buildPartial() {
            S2C_PrayTaskNotify_21211 result = new S2C_PrayTaskNotify_21211(this);
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
            if (other instanceof S2C_PrayTaskNotify_21211) {
               return this.mergeFrom((S2C_PrayTaskNotify_21211)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PrayTaskNotify_21211 other) {
            if (other == ActivityComeBackMsg.S2C_PrayTaskNotify_21211.getDefaultInstance()) {
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
                     this.taskBuilder_ = ActivityComeBackMsg.S2C_PrayTaskNotify_21211.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_PrayTaskNotify_21211 parsedMessage = null;

            try {
               parsedMessage = (S2C_PrayTaskNotify_21211)ActivityComeBackMsg.S2C_PrayTaskNotify_21211.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PrayTaskNotify_21211)e.getUnfinishedMessage();
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

   public static final class C2S_TenDraw_21213 extends GeneratedMessageV3 implements C2S_TenDraw_21213OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TenDraw_21213 DEFAULT_INSTANCE = new C2S_TenDraw_21213();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TenDraw_21213> PARSER = new AbstractParser<C2S_TenDraw_21213>() {
         public C2S_TenDraw_21213 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TenDraw_21213(input, extensionRegistry);
         }
      };

      private C2S_TenDraw_21213(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TenDraw_21213() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TenDraw_21213();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TenDraw_21213(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_TenDraw_21213_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_TenDraw_21213_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TenDraw_21213.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TenDraw_21213)) {
            return super.equals(obj);
         } else {
            C2S_TenDraw_21213 other = (C2S_TenDraw_21213)obj;
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

      public static C2S_TenDraw_21213 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TenDraw_21213)PARSER.parseFrom(data);
      }

      public static C2S_TenDraw_21213 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TenDraw_21213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TenDraw_21213 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TenDraw_21213)PARSER.parseFrom(data);
      }

      public static C2S_TenDraw_21213 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TenDraw_21213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TenDraw_21213 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TenDraw_21213)PARSER.parseFrom(data);
      }

      public static C2S_TenDraw_21213 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TenDraw_21213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TenDraw_21213 parseFrom(InputStream input) throws IOException {
         return (C2S_TenDraw_21213)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TenDraw_21213 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TenDraw_21213)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TenDraw_21213 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TenDraw_21213)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TenDraw_21213 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TenDraw_21213)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TenDraw_21213 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TenDraw_21213)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TenDraw_21213 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TenDraw_21213)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TenDraw_21213 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TenDraw_21213 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TenDraw_21213> parser() {
         return PARSER;
      }

      public Parser<C2S_TenDraw_21213> getParserForType() {
         return PARSER;
      }

      public C2S_TenDraw_21213 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TenDraw_21213OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_TenDraw_21213_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_TenDraw_21213_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TenDraw_21213.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityComeBackMsg.C2S_TenDraw_21213.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_TenDraw_21213_descriptor;
         }

         public C2S_TenDraw_21213 getDefaultInstanceForType() {
            return ActivityComeBackMsg.C2S_TenDraw_21213.getDefaultInstance();
         }

         public C2S_TenDraw_21213 build() {
            C2S_TenDraw_21213 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TenDraw_21213 buildPartial() {
            C2S_TenDraw_21213 result = new C2S_TenDraw_21213(this);
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
            if (other instanceof C2S_TenDraw_21213) {
               return this.mergeFrom((C2S_TenDraw_21213)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TenDraw_21213 other) {
            if (other == ActivityComeBackMsg.C2S_TenDraw_21213.getDefaultInstance()) {
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
            C2S_TenDraw_21213 parsedMessage = null;

            try {
               parsedMessage = (C2S_TenDraw_21213)ActivityComeBackMsg.C2S_TenDraw_21213.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TenDraw_21213)e.getUnfinishedMessage();
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

   public static final class S2C_TenDraw_21214 extends GeneratedMessageV3 implements S2C_TenDraw_21214OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TENDRAWUSEIDS_FIELD_NUMBER = 1;
      private Internal.IntList tenDrawUseIds_;
      public static final int HEROIDS_FIELD_NUMBER = 2;
      private Internal.IntList heroIds_;
      private byte memoizedIsInitialized;
      private static final S2C_TenDraw_21214 DEFAULT_INSTANCE = new S2C_TenDraw_21214();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TenDraw_21214> PARSER = new AbstractParser<S2C_TenDraw_21214>() {
         public S2C_TenDraw_21214 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TenDraw_21214(input, extensionRegistry);
         }
      };

      private S2C_TenDraw_21214(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TenDraw_21214() {
         this.memoizedIsInitialized = -1;
         this.tenDrawUseIds_ = emptyIntList();
         this.heroIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TenDraw_21214();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TenDraw_21214(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.tenDrawUseIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.tenDrawUseIds_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.tenDrawUseIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.heroIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.heroIds_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.heroIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.heroIds_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.tenDrawUseIds_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.tenDrawUseIds_.makeImmutable();
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.heroIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_TenDraw_21214_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_TenDraw_21214_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TenDraw_21214.class, Builder.class);
      }

      public List<Integer> getTenDrawUseIdsList() {
         return this.tenDrawUseIds_;
      }

      public int getTenDrawUseIdsCount() {
         return this.tenDrawUseIds_.size();
      }

      public int getTenDrawUseIds(int index) {
         return this.tenDrawUseIds_.getInt(index);
      }

      public List<Integer> getHeroIdsList() {
         return this.heroIds_;
      }

      public int getHeroIdsCount() {
         return this.heroIds_.size();
      }

      public int getHeroIds(int index) {
         return this.heroIds_.getInt(index);
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
         for(int i = 0; i < this.tenDrawUseIds_.size(); ++i) {
            output.writeInt32(1, this.tenDrawUseIds_.getInt(i));
         }

         for(int i = 0; i < this.heroIds_.size(); ++i) {
            output.writeInt32(2, this.heroIds_.getInt(i));
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

            for(int i = 0; i < this.tenDrawUseIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.tenDrawUseIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTenDrawUseIdsList().size();
            dataSize = 0;

            for(int i = 0; i < this.heroIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.heroIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHeroIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TenDraw_21214)) {
            return super.equals(obj);
         } else {
            S2C_TenDraw_21214 other = (S2C_TenDraw_21214)obj;
            if (!this.getTenDrawUseIdsList().equals(other.getTenDrawUseIdsList())) {
               return false;
            } else if (!this.getHeroIdsList().equals(other.getHeroIdsList())) {
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
            if (this.getTenDrawUseIdsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTenDrawUseIdsList().hashCode();
            }

            if (this.getHeroIdsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TenDraw_21214 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TenDraw_21214)PARSER.parseFrom(data);
      }

      public static S2C_TenDraw_21214 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TenDraw_21214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TenDraw_21214 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TenDraw_21214)PARSER.parseFrom(data);
      }

      public static S2C_TenDraw_21214 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TenDraw_21214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TenDraw_21214 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TenDraw_21214)PARSER.parseFrom(data);
      }

      public static S2C_TenDraw_21214 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TenDraw_21214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TenDraw_21214 parseFrom(InputStream input) throws IOException {
         return (S2C_TenDraw_21214)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TenDraw_21214 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TenDraw_21214)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TenDraw_21214 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TenDraw_21214)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TenDraw_21214 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TenDraw_21214)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TenDraw_21214 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TenDraw_21214)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TenDraw_21214 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TenDraw_21214)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TenDraw_21214 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TenDraw_21214 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TenDraw_21214> parser() {
         return PARSER;
      }

      public Parser<S2C_TenDraw_21214> getParserForType() {
         return PARSER;
      }

      public S2C_TenDraw_21214 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TenDraw_21214OrBuilder {
         private int bitField0_;
         private Internal.IntList tenDrawUseIds_;
         private Internal.IntList heroIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_TenDraw_21214_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_TenDraw_21214_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TenDraw_21214.class, Builder.class);
         }

         private Builder() {
            this.tenDrawUseIds_ = ActivityComeBackMsg.S2C_TenDraw_21214.emptyIntList();
            this.heroIds_ = ActivityComeBackMsg.S2C_TenDraw_21214.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.tenDrawUseIds_ = ActivityComeBackMsg.S2C_TenDraw_21214.emptyIntList();
            this.heroIds_ = ActivityComeBackMsg.S2C_TenDraw_21214.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityComeBackMsg.S2C_TenDraw_21214.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.tenDrawUseIds_ = ActivityComeBackMsg.S2C_TenDraw_21214.emptyIntList();
            this.bitField0_ &= -2;
            this.heroIds_ = ActivityComeBackMsg.S2C_TenDraw_21214.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_TenDraw_21214_descriptor;
         }

         public S2C_TenDraw_21214 getDefaultInstanceForType() {
            return ActivityComeBackMsg.S2C_TenDraw_21214.getDefaultInstance();
         }

         public S2C_TenDraw_21214 build() {
            S2C_TenDraw_21214 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TenDraw_21214 buildPartial() {
            S2C_TenDraw_21214 result = new S2C_TenDraw_21214(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.tenDrawUseIds_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.tenDrawUseIds_ = this.tenDrawUseIds_;
            if ((this.bitField0_ & 2) != 0) {
               this.heroIds_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.heroIds_ = this.heroIds_;
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
            if (other instanceof S2C_TenDraw_21214) {
               return this.mergeFrom((S2C_TenDraw_21214)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TenDraw_21214 other) {
            if (other == ActivityComeBackMsg.S2C_TenDraw_21214.getDefaultInstance()) {
               return this;
            } else {
               if (!other.tenDrawUseIds_.isEmpty()) {
                  if (this.tenDrawUseIds_.isEmpty()) {
                     this.tenDrawUseIds_ = other.tenDrawUseIds_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureTenDrawUseIdsIsMutable();
                     this.tenDrawUseIds_.addAll(other.tenDrawUseIds_);
                  }

                  this.onChanged();
               }

               if (!other.heroIds_.isEmpty()) {
                  if (this.heroIds_.isEmpty()) {
                     this.heroIds_ = other.heroIds_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureHeroIdsIsMutable();
                     this.heroIds_.addAll(other.heroIds_);
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
            S2C_TenDraw_21214 parsedMessage = null;

            try {
               parsedMessage = (S2C_TenDraw_21214)ActivityComeBackMsg.S2C_TenDraw_21214.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TenDraw_21214)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTenDrawUseIdsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.tenDrawUseIds_ = ActivityComeBackMsg.S2C_TenDraw_21214.mutableCopy(this.tenDrawUseIds_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getTenDrawUseIdsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.tenDrawUseIds_) : this.tenDrawUseIds_);
         }

         public int getTenDrawUseIdsCount() {
            return this.tenDrawUseIds_.size();
         }

         public int getTenDrawUseIds(int index) {
            return this.tenDrawUseIds_.getInt(index);
         }

         public Builder setTenDrawUseIds(int index, int value) {
            this.ensureTenDrawUseIdsIsMutable();
            this.tenDrawUseIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTenDrawUseIds(int value) {
            this.ensureTenDrawUseIdsIsMutable();
            this.tenDrawUseIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTenDrawUseIds(Iterable<? extends Integer> values) {
            this.ensureTenDrawUseIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.tenDrawUseIds_);
            this.onChanged();
            return this;
         }

         public Builder clearTenDrawUseIds() {
            this.tenDrawUseIds_ = ActivityComeBackMsg.S2C_TenDraw_21214.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         private void ensureHeroIdsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.heroIds_ = ActivityComeBackMsg.S2C_TenDraw_21214.mutableCopy(this.heroIds_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getHeroIdsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.heroIds_) : this.heroIds_);
         }

         public int getHeroIdsCount() {
            return this.heroIds_.size();
         }

         public int getHeroIds(int index) {
            return this.heroIds_.getInt(index);
         }

         public Builder setHeroIds(int index, int value) {
            this.ensureHeroIdsIsMutable();
            this.heroIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHeroIds(int value) {
            this.ensureHeroIdsIsMutable();
            this.heroIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHeroIds(Iterable<? extends Integer> values) {
            this.ensureHeroIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroIds_);
            this.onChanged();
            return this;
         }

         public Builder clearHeroIds() {
            this.heroIds_ = ActivityComeBackMsg.S2C_TenDraw_21214.emptyIntList();
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

   public static final class C2S_ReturnDraw_21215 extends GeneratedMessageV3 implements C2S_ReturnDraw_21215OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ReturnDraw_21215 DEFAULT_INSTANCE = new C2S_ReturnDraw_21215();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReturnDraw_21215> PARSER = new AbstractParser<C2S_ReturnDraw_21215>() {
         public C2S_ReturnDraw_21215 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReturnDraw_21215(input, extensionRegistry);
         }
      };

      private C2S_ReturnDraw_21215(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReturnDraw_21215() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReturnDraw_21215();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReturnDraw_21215(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_ReturnDraw_21215_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_ReturnDraw_21215_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReturnDraw_21215.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReturnDraw_21215)) {
            return super.equals(obj);
         } else {
            C2S_ReturnDraw_21215 other = (C2S_ReturnDraw_21215)obj;
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

      public static C2S_ReturnDraw_21215 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReturnDraw_21215)PARSER.parseFrom(data);
      }

      public static C2S_ReturnDraw_21215 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReturnDraw_21215)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReturnDraw_21215 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReturnDraw_21215)PARSER.parseFrom(data);
      }

      public static C2S_ReturnDraw_21215 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReturnDraw_21215)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReturnDraw_21215 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReturnDraw_21215)PARSER.parseFrom(data);
      }

      public static C2S_ReturnDraw_21215 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReturnDraw_21215)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReturnDraw_21215 parseFrom(InputStream input) throws IOException {
         return (C2S_ReturnDraw_21215)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReturnDraw_21215 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReturnDraw_21215)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReturnDraw_21215 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReturnDraw_21215)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReturnDraw_21215 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReturnDraw_21215)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReturnDraw_21215 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReturnDraw_21215)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReturnDraw_21215 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReturnDraw_21215)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReturnDraw_21215 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReturnDraw_21215 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReturnDraw_21215> parser() {
         return PARSER;
      }

      public Parser<C2S_ReturnDraw_21215> getParserForType() {
         return PARSER;
      }

      public C2S_ReturnDraw_21215 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReturnDraw_21215OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_ReturnDraw_21215_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_ReturnDraw_21215_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReturnDraw_21215.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityComeBackMsg.C2S_ReturnDraw_21215.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_ReturnDraw_21215_descriptor;
         }

         public C2S_ReturnDraw_21215 getDefaultInstanceForType() {
            return ActivityComeBackMsg.C2S_ReturnDraw_21215.getDefaultInstance();
         }

         public C2S_ReturnDraw_21215 build() {
            C2S_ReturnDraw_21215 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReturnDraw_21215 buildPartial() {
            C2S_ReturnDraw_21215 result = new C2S_ReturnDraw_21215(this);
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
            if (other instanceof C2S_ReturnDraw_21215) {
               return this.mergeFrom((C2S_ReturnDraw_21215)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReturnDraw_21215 other) {
            if (other == ActivityComeBackMsg.C2S_ReturnDraw_21215.getDefaultInstance()) {
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
            C2S_ReturnDraw_21215 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReturnDraw_21215)ActivityComeBackMsg.C2S_ReturnDraw_21215.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReturnDraw_21215)e.getUnfinishedMessage();
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

   public static final class S2C_ReturnDraw_21216 extends GeneratedMessageV3 implements S2C_ReturnDraw_21216OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RETURNDRAWTIMES_FIELD_NUMBER = 1;
      private int returnDrawTimes_;
      public static final int RETURNGOLDRECORD_FIELD_NUMBER = 2;
      private List<CommonMsg.MapDataII> returnGoldRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_ReturnDraw_21216 DEFAULT_INSTANCE = new S2C_ReturnDraw_21216();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ReturnDraw_21216> PARSER = new AbstractParser<S2C_ReturnDraw_21216>() {
         public S2C_ReturnDraw_21216 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ReturnDraw_21216(input, extensionRegistry);
         }
      };

      private S2C_ReturnDraw_21216(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ReturnDraw_21216() {
         this.memoizedIsInitialized = -1;
         this.returnGoldRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ReturnDraw_21216();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ReturnDraw_21216(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.returnDrawTimes_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.returnGoldRecord_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.returnGoldRecord_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
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
                  this.returnGoldRecord_ = Collections.unmodifiableList(this.returnGoldRecord_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_ReturnDraw_21216_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_ReturnDraw_21216_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReturnDraw_21216.class, Builder.class);
      }

      public boolean hasReturnDrawTimes() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getReturnDrawTimes() {
         return this.returnDrawTimes_;
      }

      public List<CommonMsg.MapDataII> getReturnGoldRecordList() {
         return this.returnGoldRecord_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getReturnGoldRecordOrBuilderList() {
         return this.returnGoldRecord_;
      }

      public int getReturnGoldRecordCount() {
         return this.returnGoldRecord_.size();
      }

      public CommonMsg.MapDataII getReturnGoldRecord(int index) {
         return (CommonMsg.MapDataII)this.returnGoldRecord_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getReturnGoldRecordOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.returnGoldRecord_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasReturnDrawTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getReturnGoldRecordCount(); ++i) {
               if (!this.getReturnGoldRecord(i).isInitialized()) {
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
            output.writeInt32(1, this.returnDrawTimes_);
         }

         for(int i = 0; i < this.returnGoldRecord_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.returnGoldRecord_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.returnDrawTimes_);
            }

            for(int i = 0; i < this.returnGoldRecord_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.returnGoldRecord_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ReturnDraw_21216)) {
            return super.equals(obj);
         } else {
            S2C_ReturnDraw_21216 other = (S2C_ReturnDraw_21216)obj;
            if (this.hasReturnDrawTimes() != other.hasReturnDrawTimes()) {
               return false;
            } else if (this.hasReturnDrawTimes() && this.getReturnDrawTimes() != other.getReturnDrawTimes()) {
               return false;
            } else if (!this.getReturnGoldRecordList().equals(other.getReturnGoldRecordList())) {
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
            if (this.hasReturnDrawTimes()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getReturnDrawTimes();
            }

            if (this.getReturnGoldRecordCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getReturnGoldRecordList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ReturnDraw_21216 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ReturnDraw_21216)PARSER.parseFrom(data);
      }

      public static S2C_ReturnDraw_21216 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReturnDraw_21216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReturnDraw_21216 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ReturnDraw_21216)PARSER.parseFrom(data);
      }

      public static S2C_ReturnDraw_21216 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReturnDraw_21216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReturnDraw_21216 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ReturnDraw_21216)PARSER.parseFrom(data);
      }

      public static S2C_ReturnDraw_21216 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReturnDraw_21216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReturnDraw_21216 parseFrom(InputStream input) throws IOException {
         return (S2C_ReturnDraw_21216)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReturnDraw_21216 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReturnDraw_21216)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReturnDraw_21216 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ReturnDraw_21216)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ReturnDraw_21216 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReturnDraw_21216)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReturnDraw_21216 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ReturnDraw_21216)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReturnDraw_21216 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReturnDraw_21216)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ReturnDraw_21216 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ReturnDraw_21216 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ReturnDraw_21216> parser() {
         return PARSER;
      }

      public Parser<S2C_ReturnDraw_21216> getParserForType() {
         return PARSER;
      }

      public S2C_ReturnDraw_21216 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ReturnDraw_21216OrBuilder {
         private int bitField0_;
         private int returnDrawTimes_;
         private List<CommonMsg.MapDataII> returnGoldRecord_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> returnGoldRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_ReturnDraw_21216_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_ReturnDraw_21216_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReturnDraw_21216.class, Builder.class);
         }

         private Builder() {
            this.returnGoldRecord_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.returnGoldRecord_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityComeBackMsg.S2C_ReturnDraw_21216.alwaysUseFieldBuilders) {
               this.getReturnGoldRecordFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.returnDrawTimes_ = 0;
            this.bitField0_ &= -2;
            if (this.returnGoldRecordBuilder_ == null) {
               this.returnGoldRecord_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.returnGoldRecordBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_ReturnDraw_21216_descriptor;
         }

         public S2C_ReturnDraw_21216 getDefaultInstanceForType() {
            return ActivityComeBackMsg.S2C_ReturnDraw_21216.getDefaultInstance();
         }

         public S2C_ReturnDraw_21216 build() {
            S2C_ReturnDraw_21216 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ReturnDraw_21216 buildPartial() {
            S2C_ReturnDraw_21216 result = new S2C_ReturnDraw_21216(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.returnDrawTimes_ = this.returnDrawTimes_;
               to_bitField0_ |= 1;
            }

            if (this.returnGoldRecordBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.returnGoldRecord_ = Collections.unmodifiableList(this.returnGoldRecord_);
                  this.bitField0_ &= -3;
               }

               result.returnGoldRecord_ = this.returnGoldRecord_;
            } else {
               result.returnGoldRecord_ = this.returnGoldRecordBuilder_.build();
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
            if (other instanceof S2C_ReturnDraw_21216) {
               return this.mergeFrom((S2C_ReturnDraw_21216)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ReturnDraw_21216 other) {
            if (other == ActivityComeBackMsg.S2C_ReturnDraw_21216.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasReturnDrawTimes()) {
                  this.setReturnDrawTimes(other.getReturnDrawTimes());
               }

               if (this.returnGoldRecordBuilder_ == null) {
                  if (!other.returnGoldRecord_.isEmpty()) {
                     if (this.returnGoldRecord_.isEmpty()) {
                        this.returnGoldRecord_ = other.returnGoldRecord_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureReturnGoldRecordIsMutable();
                        this.returnGoldRecord_.addAll(other.returnGoldRecord_);
                     }

                     this.onChanged();
                  }
               } else if (!other.returnGoldRecord_.isEmpty()) {
                  if (this.returnGoldRecordBuilder_.isEmpty()) {
                     this.returnGoldRecordBuilder_.dispose();
                     this.returnGoldRecordBuilder_ = null;
                     this.returnGoldRecord_ = other.returnGoldRecord_;
                     this.bitField0_ &= -3;
                     this.returnGoldRecordBuilder_ = ActivityComeBackMsg.S2C_ReturnDraw_21216.alwaysUseFieldBuilders ? this.getReturnGoldRecordFieldBuilder() : null;
                  } else {
                     this.returnGoldRecordBuilder_.addAllMessages(other.returnGoldRecord_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasReturnDrawTimes()) {
               return false;
            } else {
               for(int i = 0; i < this.getReturnGoldRecordCount(); ++i) {
                  if (!this.getReturnGoldRecord(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ReturnDraw_21216 parsedMessage = null;

            try {
               parsedMessage = (S2C_ReturnDraw_21216)ActivityComeBackMsg.S2C_ReturnDraw_21216.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ReturnDraw_21216)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasReturnDrawTimes() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getReturnDrawTimes() {
            return this.returnDrawTimes_;
         }

         public Builder setReturnDrawTimes(int value) {
            this.bitField0_ |= 1;
            this.returnDrawTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearReturnDrawTimes() {
            this.bitField0_ &= -2;
            this.returnDrawTimes_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureReturnGoldRecordIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.returnGoldRecord_ = new ArrayList(this.returnGoldRecord_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.MapDataII> getReturnGoldRecordList() {
            return this.returnGoldRecordBuilder_ == null ? Collections.unmodifiableList(this.returnGoldRecord_) : this.returnGoldRecordBuilder_.getMessageList();
         }

         public int getReturnGoldRecordCount() {
            return this.returnGoldRecordBuilder_ == null ? this.returnGoldRecord_.size() : this.returnGoldRecordBuilder_.getCount();
         }

         public CommonMsg.MapDataII getReturnGoldRecord(int index) {
            return this.returnGoldRecordBuilder_ == null ? (CommonMsg.MapDataII)this.returnGoldRecord_.get(index) : (CommonMsg.MapDataII)this.returnGoldRecordBuilder_.getMessage(index);
         }

         public Builder setReturnGoldRecord(int index, CommonMsg.MapDataII value) {
            if (this.returnGoldRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureReturnGoldRecordIsMutable();
               this.returnGoldRecord_.set(index, value);
               this.onChanged();
            } else {
               this.returnGoldRecordBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setReturnGoldRecord(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.returnGoldRecordBuilder_ == null) {
               this.ensureReturnGoldRecordIsMutable();
               this.returnGoldRecord_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.returnGoldRecordBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addReturnGoldRecord(CommonMsg.MapDataII value) {
            if (this.returnGoldRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureReturnGoldRecordIsMutable();
               this.returnGoldRecord_.add(value);
               this.onChanged();
            } else {
               this.returnGoldRecordBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addReturnGoldRecord(int index, CommonMsg.MapDataII value) {
            if (this.returnGoldRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureReturnGoldRecordIsMutable();
               this.returnGoldRecord_.add(index, value);
               this.onChanged();
            } else {
               this.returnGoldRecordBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addReturnGoldRecord(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.returnGoldRecordBuilder_ == null) {
               this.ensureReturnGoldRecordIsMutable();
               this.returnGoldRecord_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.returnGoldRecordBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addReturnGoldRecord(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.returnGoldRecordBuilder_ == null) {
               this.ensureReturnGoldRecordIsMutable();
               this.returnGoldRecord_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.returnGoldRecordBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllReturnGoldRecord(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.returnGoldRecordBuilder_ == null) {
               this.ensureReturnGoldRecordIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.returnGoldRecord_);
               this.onChanged();
            } else {
               this.returnGoldRecordBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearReturnGoldRecord() {
            if (this.returnGoldRecordBuilder_ == null) {
               this.returnGoldRecord_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.returnGoldRecordBuilder_.clear();
            }

            return this;
         }

         public Builder removeReturnGoldRecord(int index) {
            if (this.returnGoldRecordBuilder_ == null) {
               this.ensureReturnGoldRecordIsMutable();
               this.returnGoldRecord_.remove(index);
               this.onChanged();
            } else {
               this.returnGoldRecordBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getReturnGoldRecordBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getReturnGoldRecordFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getReturnGoldRecordOrBuilder(int index) {
            return this.returnGoldRecordBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.returnGoldRecord_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.returnGoldRecordBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getReturnGoldRecordOrBuilderList() {
            return this.returnGoldRecordBuilder_ != null ? this.returnGoldRecordBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.returnGoldRecord_);
         }

         public CommonMsg.MapDataII.Builder addReturnGoldRecordBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getReturnGoldRecordFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addReturnGoldRecordBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getReturnGoldRecordFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getReturnGoldRecordBuilderList() {
            return this.getReturnGoldRecordFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getReturnGoldRecordFieldBuilder() {
            if (this.returnGoldRecordBuilder_ == null) {
               this.returnGoldRecordBuilder_ = new RepeatedFieldBuilderV3(this.returnGoldRecord_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.returnGoldRecord_ = null;
            }

            return this.returnGoldRecordBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_TaskRewardReceive_21217 extends GeneratedMessageV3 implements C2S_TaskRewardReceive_21217OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_TaskRewardReceive_21217 DEFAULT_INSTANCE = new C2S_TaskRewardReceive_21217();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TaskRewardReceive_21217> PARSER = new AbstractParser<C2S_TaskRewardReceive_21217>() {
         public C2S_TaskRewardReceive_21217 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TaskRewardReceive_21217(input, extensionRegistry);
         }
      };

      private C2S_TaskRewardReceive_21217(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TaskRewardReceive_21217() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TaskRewardReceive_21217();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TaskRewardReceive_21217(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_TaskRewardReceive_21217_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_TaskRewardReceive_21217_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskRewardReceive_21217.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TaskRewardReceive_21217)) {
            return super.equals(obj);
         } else {
            C2S_TaskRewardReceive_21217 other = (C2S_TaskRewardReceive_21217)obj;
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

      public static C2S_TaskRewardReceive_21217 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TaskRewardReceive_21217)PARSER.parseFrom(data);
      }

      public static C2S_TaskRewardReceive_21217 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskRewardReceive_21217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskRewardReceive_21217 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TaskRewardReceive_21217)PARSER.parseFrom(data);
      }

      public static C2S_TaskRewardReceive_21217 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskRewardReceive_21217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskRewardReceive_21217 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TaskRewardReceive_21217)PARSER.parseFrom(data);
      }

      public static C2S_TaskRewardReceive_21217 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskRewardReceive_21217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskRewardReceive_21217 parseFrom(InputStream input) throws IOException {
         return (C2S_TaskRewardReceive_21217)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskRewardReceive_21217 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskRewardReceive_21217)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskRewardReceive_21217 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TaskRewardReceive_21217)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TaskRewardReceive_21217 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskRewardReceive_21217)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskRewardReceive_21217 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TaskRewardReceive_21217)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskRewardReceive_21217 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskRewardReceive_21217)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TaskRewardReceive_21217 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TaskRewardReceive_21217 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TaskRewardReceive_21217> parser() {
         return PARSER;
      }

      public Parser<C2S_TaskRewardReceive_21217> getParserForType() {
         return PARSER;
      }

      public C2S_TaskRewardReceive_21217 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TaskRewardReceive_21217OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_TaskRewardReceive_21217_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_TaskRewardReceive_21217_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskRewardReceive_21217.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityComeBackMsg.C2S_TaskRewardReceive_21217.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_C2S_TaskRewardReceive_21217_descriptor;
         }

         public C2S_TaskRewardReceive_21217 getDefaultInstanceForType() {
            return ActivityComeBackMsg.C2S_TaskRewardReceive_21217.getDefaultInstance();
         }

         public C2S_TaskRewardReceive_21217 build() {
            C2S_TaskRewardReceive_21217 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TaskRewardReceive_21217 buildPartial() {
            C2S_TaskRewardReceive_21217 result = new C2S_TaskRewardReceive_21217(this);
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
            if (other instanceof C2S_TaskRewardReceive_21217) {
               return this.mergeFrom((C2S_TaskRewardReceive_21217)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TaskRewardReceive_21217 other) {
            if (other == ActivityComeBackMsg.C2S_TaskRewardReceive_21217.getDefaultInstance()) {
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
            C2S_TaskRewardReceive_21217 parsedMessage = null;

            try {
               parsedMessage = (C2S_TaskRewardReceive_21217)ActivityComeBackMsg.C2S_TaskRewardReceive_21217.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TaskRewardReceive_21217)e.getUnfinishedMessage();
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

   public static final class S2C_PowerUpdate_21218 extends GeneratedMessageV3 implements S2C_PowerUpdate_21218OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POWER_FIELD_NUMBER = 1;
      private int power_;
      private byte memoizedIsInitialized;
      private static final S2C_PowerUpdate_21218 DEFAULT_INSTANCE = new S2C_PowerUpdate_21218();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PowerUpdate_21218> PARSER = new AbstractParser<S2C_PowerUpdate_21218>() {
         public S2C_PowerUpdate_21218 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PowerUpdate_21218(input, extensionRegistry);
         }
      };

      private S2C_PowerUpdate_21218(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PowerUpdate_21218() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PowerUpdate_21218();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PowerUpdate_21218(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.power_ = input.readInt32();
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
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_PowerUpdate_21218_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_PowerUpdate_21218_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PowerUpdate_21218.class, Builder.class);
      }

      public boolean hasPower() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPower() {
         return this.power_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPower()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.power_);
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
               size += CodedOutputStream.computeInt32Size(1, this.power_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PowerUpdate_21218)) {
            return super.equals(obj);
         } else {
            S2C_PowerUpdate_21218 other = (S2C_PowerUpdate_21218)obj;
            if (this.hasPower() != other.hasPower()) {
               return false;
            } else if (this.hasPower() && this.getPower() != other.getPower()) {
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
            if (this.hasPower()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPower();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PowerUpdate_21218 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PowerUpdate_21218)PARSER.parseFrom(data);
      }

      public static S2C_PowerUpdate_21218 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PowerUpdate_21218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PowerUpdate_21218 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PowerUpdate_21218)PARSER.parseFrom(data);
      }

      public static S2C_PowerUpdate_21218 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PowerUpdate_21218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PowerUpdate_21218 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PowerUpdate_21218)PARSER.parseFrom(data);
      }

      public static S2C_PowerUpdate_21218 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PowerUpdate_21218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PowerUpdate_21218 parseFrom(InputStream input) throws IOException {
         return (S2C_PowerUpdate_21218)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PowerUpdate_21218 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PowerUpdate_21218)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PowerUpdate_21218 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PowerUpdate_21218)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PowerUpdate_21218 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PowerUpdate_21218)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PowerUpdate_21218 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PowerUpdate_21218)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PowerUpdate_21218 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PowerUpdate_21218)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PowerUpdate_21218 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PowerUpdate_21218 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PowerUpdate_21218> parser() {
         return PARSER;
      }

      public Parser<S2C_PowerUpdate_21218> getParserForType() {
         return PARSER;
      }

      public S2C_PowerUpdate_21218 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PowerUpdate_21218OrBuilder {
         private int bitField0_;
         private int power_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_PowerUpdate_21218_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_PowerUpdate_21218_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PowerUpdate_21218.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ActivityComeBackMsg.S2C_PowerUpdate_21218.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.power_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ActivityComeBackMsg.internal_static_activityComeBack_com_gzbz_protobuf_S2C_PowerUpdate_21218_descriptor;
         }

         public S2C_PowerUpdate_21218 getDefaultInstanceForType() {
            return ActivityComeBackMsg.S2C_PowerUpdate_21218.getDefaultInstance();
         }

         public S2C_PowerUpdate_21218 build() {
            S2C_PowerUpdate_21218 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PowerUpdate_21218 buildPartial() {
            S2C_PowerUpdate_21218 result = new S2C_PowerUpdate_21218(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.power_ = this.power_;
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
            if (other instanceof S2C_PowerUpdate_21218) {
               return this.mergeFrom((S2C_PowerUpdate_21218)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PowerUpdate_21218 other) {
            if (other == ActivityComeBackMsg.S2C_PowerUpdate_21218.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPower()) {
                  this.setPower(other.getPower());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPower();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PowerUpdate_21218 parsedMessage = null;

            try {
               parsedMessage = (S2C_PowerUpdate_21218)ActivityComeBackMsg.S2C_PowerUpdate_21218.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PowerUpdate_21218)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPower() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPower() {
            return this.power_;
         }

         public Builder setPower(int value) {
            this.bitField0_ |= 1;
            this.power_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPower() {
            this.bitField0_ &= -2;
            this.power_ = 0;
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

   public interface C2S_ActivityInfo_21201OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ChargeReturnReceive_21205OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_FirstChargeReceive_21203OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_PowerBoxReceive_21209OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_ReturnDraw_21215OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SignReceive_21207OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TaskRewardReceive_21217OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_TenDraw_21213OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_ActivityInfo_21202OrBuilder extends MessageOrBuilder {
      boolean hasServerActivityDay();

      int getServerActivityDay();

      boolean hasChargeAccount();

      int getChargeAccount();

      List<Integer> getFirstChargeReceiveIdsList();

      int getFirstChargeReceiveIdsCount();

      int getFirstChargeReceiveIds(int index);

      List<Integer> getChargeReturnReceiveIdsList();

      int getChargeReturnReceiveIdsCount();

      int getChargeReturnReceiveIds(int index);

      List<Integer> getSignReceiveIdsList();

      int getSignReceiveIdsCount();

      int getSignReceiveIds(int index);

      boolean hasPower();

      int getPower();

      List<Integer> getPowerReceiveIdsList();

      int getPowerReceiveIdsCount();

      int getPowerReceiveIds(int index);

      boolean hasActTotalOnlineTime();

      long getActTotalOnlineTime();

      List<Integer> getTenDrawUseIdsList();

      int getTenDrawUseIdsCount();

      int getTenDrawUseIds(int index);

      boolean hasNextTenDrawCountDown();

      long getNextTenDrawCountDown();

      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);

      boolean hasReturnDrawTimes();

      int getReturnDrawTimes();

      List<CommonMsg.MapDataII> getReturnGoldRecordList();

      CommonMsg.MapDataII getReturnGoldRecord(int index);

      int getReturnGoldRecordCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getReturnGoldRecordOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getReturnGoldRecordOrBuilder(int index);
   }

   public interface S2C_ChargeReturnReceive_21206OrBuilder extends MessageOrBuilder {
      List<Integer> getReceiveIdsList();

      int getReceiveIdsCount();

      int getReceiveIds(int index);
   }

   public interface S2C_FirstChargeReceive_21204OrBuilder extends MessageOrBuilder {
      List<Integer> getReceiveIdsList();

      int getReceiveIdsCount();

      int getReceiveIds(int index);
   }

   public interface S2C_PowerBoxReceive_21210OrBuilder extends MessageOrBuilder {
      List<Integer> getReceiveIdsList();

      int getReceiveIdsCount();

      int getReceiveIds(int index);
   }

   public interface S2C_PowerUpdate_21218OrBuilder extends MessageOrBuilder {
      boolean hasPower();

      int getPower();
   }

   public interface S2C_PrayTaskNotify_21211OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_ReturnDraw_21216OrBuilder extends MessageOrBuilder {
      boolean hasReturnDrawTimes();

      int getReturnDrawTimes();

      List<CommonMsg.MapDataII> getReturnGoldRecordList();

      CommonMsg.MapDataII getReturnGoldRecord(int index);

      int getReturnGoldRecordCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getReturnGoldRecordOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getReturnGoldRecordOrBuilder(int index);
   }

   public interface S2C_SignReceive_21208OrBuilder extends MessageOrBuilder {
      List<Integer> getReceiveIdsList();

      int getReceiveIdsCount();

      int getReceiveIds(int index);
   }

   public interface S2C_TenDraw_21214OrBuilder extends MessageOrBuilder {
      List<Integer> getTenDrawUseIdsList();

      int getTenDrawUseIdsCount();

      int getTenDrawUseIds(int index);

      List<Integer> getHeroIdsList();

      int getHeroIdsCount();

      int getHeroIds(int index);
   }
}
