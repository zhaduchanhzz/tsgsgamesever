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

public final class NeiDanMsg {
   private static final Descriptors.Descriptor internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanHatch_28901_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanHatch_28901_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanHatch_28902_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanHatch_28902_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_neiDan_com_gzbz_protobuf_DressState_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_neiDan_com_gzbz_protobuf_DressState_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanLvUp_28903_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanLvUp_28903_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanLvUp_28904_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanLvUp_28904_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanLvReset_28905_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanLvReset_28905_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanLvReset_28906_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanLvReset_28906_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanCompound_28907_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanCompound_28907_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanCompound_28908_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanCompound_28908_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanDress_28909_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanDress_28909_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanDress_28910_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanDress_28910_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_neiDan_com_gzbz_protobuf_C2S_UndressNeiDan_28911_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_neiDan_com_gzbz_protobuf_C2S_UndressNeiDan_28911_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_neiDan_com_gzbz_protobuf_S2C_UndressNeiDan_28912_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_neiDan_com_gzbz_protobuf_S2C_UndressNeiDan_28912_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_neiDan_com_gzbz_protobuf_C2S_LockNeiDan_28913_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_neiDan_com_gzbz_protobuf_C2S_LockNeiDan_28913_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_neiDan_com_gzbz_protobuf_S2C_LockNeiDan_28914_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_neiDan_com_gzbz_protobuf_S2C_LockNeiDan_28914_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_neiDan_com_gzbz_protobuf_C2S_LvResetPreview_28915_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_neiDan_com_gzbz_protobuf_C2S_LvResetPreview_28915_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_neiDan_com_gzbz_protobuf_S2C_LvResetPreview_28916_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_neiDan_com_gzbz_protobuf_S2C_LvResetPreview_28916_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private NeiDanMsg() {
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
      String[] descriptorData = new String[]{"\n\fNeiDan.proto\u0012\u0018neiDan.com.gzbz.protobuf\u001a\fcommon.proto\"\u0017\n\u0015C2S_NeiDanHatch_28901\"\u0017\n\u0015S2C_NeiDanHatch_28902\"6\n\nDressState\u0012\r\n\u0005state\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0002 \u0002(\u0005\u0012\u000b\n\u0003pos\u0018\u0003 \u0001(\u0005\"\u0089\u0001\n\u0014C2S_NeiDanLvUp_28903\u00124\n\u0006source\u0018\u0001 \u0002(\u000b2$.neiDan.com.gzbz.protobuf.DressState\u0012#\n\bcostItem\u0018\u0002 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0016\n\u000ecostNeiDanCode\u0018\u0003 \u0003(\u0005\"\u0016\n\u0014S2C_NeiDanLvUp_28904\"O\n\u0017C2S_NeiDanLvReset_28905\u00124\n\u0006source\u0018\u0001 \u0002(\u000b2$.neiDan.com.gzbz.protobuf.DressState\"\u0019\n\u0017S2C_NeiDanLvReset_28906\"F\n\u0018C2S_NeiDanCompound_28907\u0012\u000f\n\u0007comType\u0018\u0001 \u0002(\u0005\u0012\u0019\n\u0011recNeiDanItemCode\u0018\u0002 \u0003(\u0005\"\u001a\n\u0018S2C_NeiDanCompound_28908\"\u0085\u0001\n\u0015C2S_NeiDanDress_28909\u00126\n\bresource\u0018\u0001 \u0002(\u000b2$.neiDan.com.gzbz.protobuf.DressState\u00124\n\u0006target\u0018\u0002 \u0002(\u000b2$.neiDan.com.gzbz.protobuf.DressState\"\u0017\n\u0015S2C_NeiDanDress_28910\"Q\n\u0017C2S_UndressNeiDan_28911\u00126\n\bresource\u0018\u0001 \u0002(\u000b2$.neiDan.com.gzbz.protobuf.DressState\"\u0019\n\u0017S2C_UndressNeiDan_28912\"]\n\u0014C2S_LockNeiDan_28913\u00126\n\bresource\u0018\u0001 \u0002(\u000b2$.neiDan.com.gzbz.protobuf.DressState\u0012\r\n\u0005state\u0018\u0002 \u0002(\u0005\"]\n\u0014S2C_LockNeiDan_28914\u00126\n\bresource\u0018\u0001 \u0002(\u000b2$.neiDan.com.gzbz.protobuf.DressState\u0012\r\n\u0005state\u0018\u0002 \u0002(\u0005\"P\n\u0018C2S_LvResetPreview_28915\u00124\n\u0006source\u0018\u0001 \u0002(\u000b2$.neiDan.com.gzbz.protobuf.DressState\"B\n\u0018S2C_LvResetPreview_28916\u0012&\n\freturnReward\u0018\u0001 \u0003(\u000b2\u0010.common.ItemInfoB \n\u0011com.gzbz.protobufB\tNeiDanMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanHatch_28901_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanHatch_28901_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanHatch_28901_descriptor, new String[0]);
      internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanHatch_28902_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanHatch_28902_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanHatch_28902_descriptor, new String[0]);
      internal_static_neiDan_com_gzbz_protobuf_DressState_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_neiDan_com_gzbz_protobuf_DressState_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_neiDan_com_gzbz_protobuf_DressState_descriptor, new String[]{"State", "Code", "Pos"});
      internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanLvUp_28903_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanLvUp_28903_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanLvUp_28903_descriptor, new String[]{"Source", "CostItem", "CostNeiDanCode"});
      internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanLvUp_28904_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanLvUp_28904_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanLvUp_28904_descriptor, new String[0]);
      internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanLvReset_28905_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanLvReset_28905_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanLvReset_28905_descriptor, new String[]{"Source"});
      internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanLvReset_28906_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanLvReset_28906_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanLvReset_28906_descriptor, new String[0]);
      internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanCompound_28907_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanCompound_28907_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanCompound_28907_descriptor, new String[]{"ComType", "RecNeiDanItemCode"});
      internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanCompound_28908_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanCompound_28908_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanCompound_28908_descriptor, new String[0]);
      internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanDress_28909_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanDress_28909_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanDress_28909_descriptor, new String[]{"Resource", "Target"});
      internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanDress_28910_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanDress_28910_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanDress_28910_descriptor, new String[0]);
      internal_static_neiDan_com_gzbz_protobuf_C2S_UndressNeiDan_28911_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_neiDan_com_gzbz_protobuf_C2S_UndressNeiDan_28911_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_neiDan_com_gzbz_protobuf_C2S_UndressNeiDan_28911_descriptor, new String[]{"Resource"});
      internal_static_neiDan_com_gzbz_protobuf_S2C_UndressNeiDan_28912_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_neiDan_com_gzbz_protobuf_S2C_UndressNeiDan_28912_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_neiDan_com_gzbz_protobuf_S2C_UndressNeiDan_28912_descriptor, new String[0]);
      internal_static_neiDan_com_gzbz_protobuf_C2S_LockNeiDan_28913_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_neiDan_com_gzbz_protobuf_C2S_LockNeiDan_28913_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_neiDan_com_gzbz_protobuf_C2S_LockNeiDan_28913_descriptor, new String[]{"Resource", "State"});
      internal_static_neiDan_com_gzbz_protobuf_S2C_LockNeiDan_28914_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_neiDan_com_gzbz_protobuf_S2C_LockNeiDan_28914_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_neiDan_com_gzbz_protobuf_S2C_LockNeiDan_28914_descriptor, new String[]{"Resource", "State"});
      internal_static_neiDan_com_gzbz_protobuf_C2S_LvResetPreview_28915_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_neiDan_com_gzbz_protobuf_C2S_LvResetPreview_28915_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_neiDan_com_gzbz_protobuf_C2S_LvResetPreview_28915_descriptor, new String[]{"Source"});
      internal_static_neiDan_com_gzbz_protobuf_S2C_LvResetPreview_28916_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_neiDan_com_gzbz_protobuf_S2C_LvResetPreview_28916_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_neiDan_com_gzbz_protobuf_S2C_LvResetPreview_28916_descriptor, new String[]{"ReturnReward"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_NeiDanHatch_28901 extends GeneratedMessageV3 implements C2S_NeiDanHatch_28901OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_NeiDanHatch_28901 DEFAULT_INSTANCE = new C2S_NeiDanHatch_28901();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_NeiDanHatch_28901> PARSER = new AbstractParser<C2S_NeiDanHatch_28901>() {
         public C2S_NeiDanHatch_28901 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_NeiDanHatch_28901(input, extensionRegistry);
         }
      };

      private C2S_NeiDanHatch_28901(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_NeiDanHatch_28901() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_NeiDanHatch_28901();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_NeiDanHatch_28901(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanHatch_28901_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanHatch_28901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NeiDanHatch_28901.class, Builder.class);
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
         } else if (!(obj instanceof C2S_NeiDanHatch_28901)) {
            return super.equals(obj);
         } else {
            C2S_NeiDanHatch_28901 other = (C2S_NeiDanHatch_28901)obj;
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

      public static C2S_NeiDanHatch_28901 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_NeiDanHatch_28901)PARSER.parseFrom(data);
      }

      public static C2S_NeiDanHatch_28901 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NeiDanHatch_28901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NeiDanHatch_28901 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_NeiDanHatch_28901)PARSER.parseFrom(data);
      }

      public static C2S_NeiDanHatch_28901 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NeiDanHatch_28901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NeiDanHatch_28901 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_NeiDanHatch_28901)PARSER.parseFrom(data);
      }

      public static C2S_NeiDanHatch_28901 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NeiDanHatch_28901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NeiDanHatch_28901 parseFrom(InputStream input) throws IOException {
         return (C2S_NeiDanHatch_28901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NeiDanHatch_28901 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NeiDanHatch_28901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NeiDanHatch_28901 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_NeiDanHatch_28901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_NeiDanHatch_28901 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NeiDanHatch_28901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NeiDanHatch_28901 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_NeiDanHatch_28901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NeiDanHatch_28901 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NeiDanHatch_28901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_NeiDanHatch_28901 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_NeiDanHatch_28901 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_NeiDanHatch_28901> parser() {
         return PARSER;
      }

      public Parser<C2S_NeiDanHatch_28901> getParserForType() {
         return PARSER;
      }

      public C2S_NeiDanHatch_28901 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_NeiDanHatch_28901OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanHatch_28901_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanHatch_28901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NeiDanHatch_28901.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NeiDanMsg.C2S_NeiDanHatch_28901.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanHatch_28901_descriptor;
         }

         public C2S_NeiDanHatch_28901 getDefaultInstanceForType() {
            return NeiDanMsg.C2S_NeiDanHatch_28901.getDefaultInstance();
         }

         public C2S_NeiDanHatch_28901 build() {
            C2S_NeiDanHatch_28901 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_NeiDanHatch_28901 buildPartial() {
            C2S_NeiDanHatch_28901 result = new C2S_NeiDanHatch_28901(this);
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
            if (other instanceof C2S_NeiDanHatch_28901) {
               return this.mergeFrom((C2S_NeiDanHatch_28901)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_NeiDanHatch_28901 other) {
            if (other == NeiDanMsg.C2S_NeiDanHatch_28901.getDefaultInstance()) {
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
            C2S_NeiDanHatch_28901 parsedMessage = null;

            try {
               parsedMessage = (C2S_NeiDanHatch_28901)NeiDanMsg.C2S_NeiDanHatch_28901.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_NeiDanHatch_28901)e.getUnfinishedMessage();
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

   public static final class S2C_NeiDanHatch_28902 extends GeneratedMessageV3 implements S2C_NeiDanHatch_28902OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_NeiDanHatch_28902 DEFAULT_INSTANCE = new S2C_NeiDanHatch_28902();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NeiDanHatch_28902> PARSER = new AbstractParser<S2C_NeiDanHatch_28902>() {
         public S2C_NeiDanHatch_28902 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NeiDanHatch_28902(input, extensionRegistry);
         }
      };

      private S2C_NeiDanHatch_28902(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NeiDanHatch_28902() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NeiDanHatch_28902();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NeiDanHatch_28902(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanHatch_28902_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanHatch_28902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NeiDanHatch_28902.class, Builder.class);
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
         } else if (!(obj instanceof S2C_NeiDanHatch_28902)) {
            return super.equals(obj);
         } else {
            S2C_NeiDanHatch_28902 other = (S2C_NeiDanHatch_28902)obj;
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

      public static S2C_NeiDanHatch_28902 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NeiDanHatch_28902)PARSER.parseFrom(data);
      }

      public static S2C_NeiDanHatch_28902 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NeiDanHatch_28902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NeiDanHatch_28902 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NeiDanHatch_28902)PARSER.parseFrom(data);
      }

      public static S2C_NeiDanHatch_28902 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NeiDanHatch_28902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NeiDanHatch_28902 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NeiDanHatch_28902)PARSER.parseFrom(data);
      }

      public static S2C_NeiDanHatch_28902 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NeiDanHatch_28902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NeiDanHatch_28902 parseFrom(InputStream input) throws IOException {
         return (S2C_NeiDanHatch_28902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NeiDanHatch_28902 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NeiDanHatch_28902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NeiDanHatch_28902 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NeiDanHatch_28902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NeiDanHatch_28902 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NeiDanHatch_28902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NeiDanHatch_28902 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NeiDanHatch_28902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NeiDanHatch_28902 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NeiDanHatch_28902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NeiDanHatch_28902 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NeiDanHatch_28902 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NeiDanHatch_28902> parser() {
         return PARSER;
      }

      public Parser<S2C_NeiDanHatch_28902> getParserForType() {
         return PARSER;
      }

      public S2C_NeiDanHatch_28902 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NeiDanHatch_28902OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanHatch_28902_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanHatch_28902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NeiDanHatch_28902.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NeiDanMsg.S2C_NeiDanHatch_28902.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanHatch_28902_descriptor;
         }

         public S2C_NeiDanHatch_28902 getDefaultInstanceForType() {
            return NeiDanMsg.S2C_NeiDanHatch_28902.getDefaultInstance();
         }

         public S2C_NeiDanHatch_28902 build() {
            S2C_NeiDanHatch_28902 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NeiDanHatch_28902 buildPartial() {
            S2C_NeiDanHatch_28902 result = new S2C_NeiDanHatch_28902(this);
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
            if (other instanceof S2C_NeiDanHatch_28902) {
               return this.mergeFrom((S2C_NeiDanHatch_28902)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NeiDanHatch_28902 other) {
            if (other == NeiDanMsg.S2C_NeiDanHatch_28902.getDefaultInstance()) {
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
            S2C_NeiDanHatch_28902 parsedMessage = null;

            try {
               parsedMessage = (S2C_NeiDanHatch_28902)NeiDanMsg.S2C_NeiDanHatch_28902.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NeiDanHatch_28902)e.getUnfinishedMessage();
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

   public static final class DressState extends GeneratedMessageV3 implements DressStateOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STATE_FIELD_NUMBER = 1;
      private int state_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      public static final int POS_FIELD_NUMBER = 3;
      private int pos_;
      private byte memoizedIsInitialized;
      private static final DressState DEFAULT_INSTANCE = new DressState();
      /** @deprecated */
      @Deprecated
      public static final Parser<DressState> PARSER = new AbstractParser<DressState>() {
         public DressState parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new DressState(input, extensionRegistry);
         }
      };

      private DressState(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private DressState() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new DressState();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private DressState(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.state_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.code_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.pos_ = input.readInt32();
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
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_DressState_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_DressState_fieldAccessorTable.ensureFieldAccessorsInitialized(DressState.class, Builder.class);
      }

      public boolean hasState() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasPos() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPos() {
         return this.pos_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.state_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.code_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.pos_);
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
               size += CodedOutputStream.computeInt32Size(1, this.state_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.code_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.pos_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof DressState)) {
            return super.equals(obj);
         } else {
            DressState other = (DressState)obj;
            if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasPos() != other.hasPos()) {
               return false;
            } else if (this.hasPos() && this.getPos() != other.getPos()) {
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
            if (this.hasState()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getState();
            }

            if (this.hasCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasPos()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPos();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static DressState parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (DressState)PARSER.parseFrom(data);
      }

      public static DressState parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DressState)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DressState parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (DressState)PARSER.parseFrom(data);
      }

      public static DressState parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DressState)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DressState parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (DressState)PARSER.parseFrom(data);
      }

      public static DressState parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DressState)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DressState parseFrom(InputStream input) throws IOException {
         return (DressState)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static DressState parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DressState)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static DressState parseDelimitedFrom(InputStream input) throws IOException {
         return (DressState)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static DressState parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DressState)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static DressState parseFrom(CodedInputStream input) throws IOException {
         return (DressState)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static DressState parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DressState)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(DressState prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static DressState getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<DressState> parser() {
         return PARSER;
      }

      public Parser<DressState> getParserForType() {
         return PARSER;
      }

      public DressState getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DressStateOrBuilder {
         private int bitField0_;
         private int state_;
         private int code_;
         private int pos_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_DressState_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_DressState_fieldAccessorTable.ensureFieldAccessorsInitialized(DressState.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NeiDanMsg.DressState.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.state_ = 0;
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.bitField0_ &= -3;
            this.pos_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_DressState_descriptor;
         }

         public DressState getDefaultInstanceForType() {
            return NeiDanMsg.DressState.getDefaultInstance();
         }

         public DressState build() {
            DressState result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public DressState buildPartial() {
            DressState result = new DressState(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.state_ = this.state_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.pos_ = this.pos_;
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
            if (other instanceof DressState) {
               return this.mergeFrom((DressState)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(DressState other) {
            if (other == NeiDanMsg.DressState.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasState()) {
                  this.setState(other.getState());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasPos()) {
                  this.setPos(other.getPos());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasState()) {
               return false;
            } else {
               return this.hasCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            DressState parsedMessage = null;

            try {
               parsedMessage = (DressState)NeiDanMsg.DressState.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (DressState)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasState() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getState() {
            return this.state_;
         }

         public Builder setState(int value) {
            this.bitField0_ |= 1;
            this.state_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearState() {
            this.bitField0_ &= -2;
            this.state_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 2;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -3;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPos() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getPos() {
            return this.pos_;
         }

         public Builder setPos(int value) {
            this.bitField0_ |= 4;
            this.pos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPos() {
            this.bitField0_ &= -5;
            this.pos_ = 0;
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

   public static final class C2S_NeiDanLvUp_28903 extends GeneratedMessageV3 implements C2S_NeiDanLvUp_28903OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SOURCE_FIELD_NUMBER = 1;
      private DressState source_;
      public static final int COSTITEM_FIELD_NUMBER = 2;
      private List<CommonMsg.MapDataII> costItem_;
      public static final int COSTNEIDANCODE_FIELD_NUMBER = 3;
      private Internal.IntList costNeiDanCode_;
      private byte memoizedIsInitialized;
      private static final C2S_NeiDanLvUp_28903 DEFAULT_INSTANCE = new C2S_NeiDanLvUp_28903();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_NeiDanLvUp_28903> PARSER = new AbstractParser<C2S_NeiDanLvUp_28903>() {
         public C2S_NeiDanLvUp_28903 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_NeiDanLvUp_28903(input, extensionRegistry);
         }
      };

      private C2S_NeiDanLvUp_28903(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_NeiDanLvUp_28903() {
         this.memoizedIsInitialized = -1;
         this.costItem_ = Collections.emptyList();
         this.costNeiDanCode_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_NeiDanLvUp_28903();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_NeiDanLvUp_28903(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        DressState.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.source_.toBuilder();
                        }

                        this.source_ = (DressState)input.readMessage(NeiDanMsg.DressState.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.source_);
                           this.source_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.costItem_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.costItem_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.costNeiDanCode_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.costNeiDanCode_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.costNeiDanCode_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.costNeiDanCode_.addInt(input.readInt32());
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
                  this.costItem_ = Collections.unmodifiableList(this.costItem_);
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.costNeiDanCode_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanLvUp_28903_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanLvUp_28903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NeiDanLvUp_28903.class, Builder.class);
      }

      public boolean hasSource() {
         return (this.bitField0_ & 1) != 0;
      }

      public DressState getSource() {
         return this.source_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.source_;
      }

      public DressStateOrBuilder getSourceOrBuilder() {
         return this.source_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.source_;
      }

      public List<CommonMsg.MapDataII> getCostItemList() {
         return this.costItem_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getCostItemOrBuilderList() {
         return this.costItem_;
      }

      public int getCostItemCount() {
         return this.costItem_.size();
      }

      public CommonMsg.MapDataII getCostItem(int index) {
         return (CommonMsg.MapDataII)this.costItem_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getCostItemOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.costItem_.get(index);
      }

      public List<Integer> getCostNeiDanCodeList() {
         return this.costNeiDanCode_;
      }

      public int getCostNeiDanCodeCount() {
         return this.costNeiDanCode_.size();
      }

      public int getCostNeiDanCode(int index) {
         return this.costNeiDanCode_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSource()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getSource().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getCostItemCount(); ++i) {
               if (!this.getCostItem(i).isInitialized()) {
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
            output.writeMessage(1, this.getSource());
         }

         for(int i = 0; i < this.costItem_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.costItem_.get(i));
         }

         for(int i = 0; i < this.costNeiDanCode_.size(); ++i) {
            output.writeInt32(3, this.costNeiDanCode_.getInt(i));
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
               size += CodedOutputStream.computeMessageSize(1, this.getSource());
            }

            for(int i = 0; i < this.costItem_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.costItem_.get(i));
            }

            int dataSize = 0;

            for(int i = 0; i < this.costNeiDanCode_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.costNeiDanCode_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCostNeiDanCodeList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_NeiDanLvUp_28903)) {
            return super.equals(obj);
         } else {
            C2S_NeiDanLvUp_28903 other = (C2S_NeiDanLvUp_28903)obj;
            if (this.hasSource() != other.hasSource()) {
               return false;
            } else if (this.hasSource() && !this.getSource().equals(other.getSource())) {
               return false;
            } else if (!this.getCostItemList().equals(other.getCostItemList())) {
               return false;
            } else if (!this.getCostNeiDanCodeList().equals(other.getCostNeiDanCodeList())) {
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
            if (this.hasSource()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSource().hashCode();
            }

            if (this.getCostItemCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCostItemList().hashCode();
            }

            if (this.getCostNeiDanCodeCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCostNeiDanCodeList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_NeiDanLvUp_28903 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_NeiDanLvUp_28903)PARSER.parseFrom(data);
      }

      public static C2S_NeiDanLvUp_28903 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NeiDanLvUp_28903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NeiDanLvUp_28903 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_NeiDanLvUp_28903)PARSER.parseFrom(data);
      }

      public static C2S_NeiDanLvUp_28903 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NeiDanLvUp_28903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NeiDanLvUp_28903 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_NeiDanLvUp_28903)PARSER.parseFrom(data);
      }

      public static C2S_NeiDanLvUp_28903 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NeiDanLvUp_28903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NeiDanLvUp_28903 parseFrom(InputStream input) throws IOException {
         return (C2S_NeiDanLvUp_28903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NeiDanLvUp_28903 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NeiDanLvUp_28903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NeiDanLvUp_28903 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_NeiDanLvUp_28903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_NeiDanLvUp_28903 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NeiDanLvUp_28903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NeiDanLvUp_28903 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_NeiDanLvUp_28903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NeiDanLvUp_28903 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NeiDanLvUp_28903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_NeiDanLvUp_28903 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_NeiDanLvUp_28903 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_NeiDanLvUp_28903> parser() {
         return PARSER;
      }

      public Parser<C2S_NeiDanLvUp_28903> getParserForType() {
         return PARSER;
      }

      public C2S_NeiDanLvUp_28903 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_NeiDanLvUp_28903OrBuilder {
         private int bitField0_;
         private DressState source_;
         private SingleFieldBuilderV3<DressState, DressState.Builder, DressStateOrBuilder> sourceBuilder_;
         private List<CommonMsg.MapDataII> costItem_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> costItemBuilder_;
         private Internal.IntList costNeiDanCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanLvUp_28903_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanLvUp_28903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NeiDanLvUp_28903.class, Builder.class);
         }

         private Builder() {
            this.costItem_ = Collections.emptyList();
            this.costNeiDanCode_ = NeiDanMsg.C2S_NeiDanLvUp_28903.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.costItem_ = Collections.emptyList();
            this.costNeiDanCode_ = NeiDanMsg.C2S_NeiDanLvUp_28903.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NeiDanMsg.C2S_NeiDanLvUp_28903.alwaysUseFieldBuilders) {
               this.getSourceFieldBuilder();
               this.getCostItemFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.sourceBuilder_ == null) {
               this.source_ = null;
            } else {
               this.sourceBuilder_.clear();
            }

            this.bitField0_ &= -2;
            if (this.costItemBuilder_ == null) {
               this.costItem_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.costItemBuilder_.clear();
            }

            this.costNeiDanCode_ = NeiDanMsg.C2S_NeiDanLvUp_28903.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanLvUp_28903_descriptor;
         }

         public C2S_NeiDanLvUp_28903 getDefaultInstanceForType() {
            return NeiDanMsg.C2S_NeiDanLvUp_28903.getDefaultInstance();
         }

         public C2S_NeiDanLvUp_28903 build() {
            C2S_NeiDanLvUp_28903 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_NeiDanLvUp_28903 buildPartial() {
            C2S_NeiDanLvUp_28903 result = new C2S_NeiDanLvUp_28903(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.sourceBuilder_ == null) {
                  result.source_ = this.source_;
               } else {
                  result.source_ = (DressState)this.sourceBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if (this.costItemBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.costItem_ = Collections.unmodifiableList(this.costItem_);
                  this.bitField0_ &= -3;
               }

               result.costItem_ = this.costItem_;
            } else {
               result.costItem_ = this.costItemBuilder_.build();
            }

            if ((this.bitField0_ & 4) != 0) {
               this.costNeiDanCode_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.costNeiDanCode_ = this.costNeiDanCode_;
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
            if (other instanceof C2S_NeiDanLvUp_28903) {
               return this.mergeFrom((C2S_NeiDanLvUp_28903)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_NeiDanLvUp_28903 other) {
            if (other == NeiDanMsg.C2S_NeiDanLvUp_28903.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSource()) {
                  this.mergeSource(other.getSource());
               }

               if (this.costItemBuilder_ == null) {
                  if (!other.costItem_.isEmpty()) {
                     if (this.costItem_.isEmpty()) {
                        this.costItem_ = other.costItem_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureCostItemIsMutable();
                        this.costItem_.addAll(other.costItem_);
                     }

                     this.onChanged();
                  }
               } else if (!other.costItem_.isEmpty()) {
                  if (this.costItemBuilder_.isEmpty()) {
                     this.costItemBuilder_.dispose();
                     this.costItemBuilder_ = null;
                     this.costItem_ = other.costItem_;
                     this.bitField0_ &= -3;
                     this.costItemBuilder_ = NeiDanMsg.C2S_NeiDanLvUp_28903.alwaysUseFieldBuilders ? this.getCostItemFieldBuilder() : null;
                  } else {
                     this.costItemBuilder_.addAllMessages(other.costItem_);
                  }
               }

               if (!other.costNeiDanCode_.isEmpty()) {
                  if (this.costNeiDanCode_.isEmpty()) {
                     this.costNeiDanCode_ = other.costNeiDanCode_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureCostNeiDanCodeIsMutable();
                     this.costNeiDanCode_.addAll(other.costNeiDanCode_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSource()) {
               return false;
            } else if (!this.getSource().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getCostItemCount(); ++i) {
                  if (!this.getCostItem(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_NeiDanLvUp_28903 parsedMessage = null;

            try {
               parsedMessage = (C2S_NeiDanLvUp_28903)NeiDanMsg.C2S_NeiDanLvUp_28903.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_NeiDanLvUp_28903)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSource() {
            return (this.bitField0_ & 1) != 0;
         }

         public DressState getSource() {
            if (this.sourceBuilder_ == null) {
               return this.source_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.source_;
            } else {
               return (DressState)this.sourceBuilder_.getMessage();
            }
         }

         public Builder setSource(DressState value) {
            if (this.sourceBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.source_ = value;
               this.onChanged();
            } else {
               this.sourceBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setSource(DressState.Builder builderForValue) {
            if (this.sourceBuilder_ == null) {
               this.source_ = builderForValue.build();
               this.onChanged();
            } else {
               this.sourceBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeSource(DressState value) {
            if (this.sourceBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.source_ != null && this.source_ != NeiDanMsg.DressState.getDefaultInstance()) {
                  this.source_ = NeiDanMsg.DressState.newBuilder(this.source_).mergeFrom(value).buildPartial();
               } else {
                  this.source_ = value;
               }

               this.onChanged();
            } else {
               this.sourceBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearSource() {
            if (this.sourceBuilder_ == null) {
               this.source_ = null;
               this.onChanged();
            } else {
               this.sourceBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public DressState.Builder getSourceBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (DressState.Builder)this.getSourceFieldBuilder().getBuilder();
         }

         public DressStateOrBuilder getSourceOrBuilder() {
            if (this.sourceBuilder_ != null) {
               return (DressStateOrBuilder)this.sourceBuilder_.getMessageOrBuilder();
            } else {
               return this.source_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.source_;
            }
         }

         private SingleFieldBuilderV3<DressState, DressState.Builder, DressStateOrBuilder> getSourceFieldBuilder() {
            if (this.sourceBuilder_ == null) {
               this.sourceBuilder_ = new SingleFieldBuilderV3(this.getSource(), this.getParentForChildren(), this.isClean());
               this.source_ = null;
            }

            return this.sourceBuilder_;
         }

         private void ensureCostItemIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.costItem_ = new ArrayList(this.costItem_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.MapDataII> getCostItemList() {
            return this.costItemBuilder_ == null ? Collections.unmodifiableList(this.costItem_) : this.costItemBuilder_.getMessageList();
         }

         public int getCostItemCount() {
            return this.costItemBuilder_ == null ? this.costItem_.size() : this.costItemBuilder_.getCount();
         }

         public CommonMsg.MapDataII getCostItem(int index) {
            return this.costItemBuilder_ == null ? (CommonMsg.MapDataII)this.costItem_.get(index) : (CommonMsg.MapDataII)this.costItemBuilder_.getMessage(index);
         }

         public Builder setCostItem(int index, CommonMsg.MapDataII value) {
            if (this.costItemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCostItemIsMutable();
               this.costItem_.set(index, value);
               this.onChanged();
            } else {
               this.costItemBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setCostItem(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.costItemBuilder_ == null) {
               this.ensureCostItemIsMutable();
               this.costItem_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.costItemBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addCostItem(CommonMsg.MapDataII value) {
            if (this.costItemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCostItemIsMutable();
               this.costItem_.add(value);
               this.onChanged();
            } else {
               this.costItemBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addCostItem(int index, CommonMsg.MapDataII value) {
            if (this.costItemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCostItemIsMutable();
               this.costItem_.add(index, value);
               this.onChanged();
            } else {
               this.costItemBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addCostItem(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.costItemBuilder_ == null) {
               this.ensureCostItemIsMutable();
               this.costItem_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.costItemBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addCostItem(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.costItemBuilder_ == null) {
               this.ensureCostItemIsMutable();
               this.costItem_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.costItemBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllCostItem(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.costItemBuilder_ == null) {
               this.ensureCostItemIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.costItem_);
               this.onChanged();
            } else {
               this.costItemBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearCostItem() {
            if (this.costItemBuilder_ == null) {
               this.costItem_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.costItemBuilder_.clear();
            }

            return this;
         }

         public Builder removeCostItem(int index) {
            if (this.costItemBuilder_ == null) {
               this.ensureCostItemIsMutable();
               this.costItem_.remove(index);
               this.onChanged();
            } else {
               this.costItemBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getCostItemBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getCostItemFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getCostItemOrBuilder(int index) {
            return this.costItemBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.costItem_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.costItemBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getCostItemOrBuilderList() {
            return this.costItemBuilder_ != null ? this.costItemBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.costItem_);
         }

         public CommonMsg.MapDataII.Builder addCostItemBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getCostItemFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addCostItemBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getCostItemFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getCostItemBuilderList() {
            return this.getCostItemFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getCostItemFieldBuilder() {
            if (this.costItemBuilder_ == null) {
               this.costItemBuilder_ = new RepeatedFieldBuilderV3(this.costItem_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.costItem_ = null;
            }

            return this.costItemBuilder_;
         }

         private void ensureCostNeiDanCodeIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.costNeiDanCode_ = NeiDanMsg.C2S_NeiDanLvUp_28903.mutableCopy(this.costNeiDanCode_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getCostNeiDanCodeList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.costNeiDanCode_) : this.costNeiDanCode_);
         }

         public int getCostNeiDanCodeCount() {
            return this.costNeiDanCode_.size();
         }

         public int getCostNeiDanCode(int index) {
            return this.costNeiDanCode_.getInt(index);
         }

         public Builder setCostNeiDanCode(int index, int value) {
            this.ensureCostNeiDanCodeIsMutable();
            this.costNeiDanCode_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCostNeiDanCode(int value) {
            this.ensureCostNeiDanCodeIsMutable();
            this.costNeiDanCode_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCostNeiDanCode(Iterable<? extends Integer> values) {
            this.ensureCostNeiDanCodeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.costNeiDanCode_);
            this.onChanged();
            return this;
         }

         public Builder clearCostNeiDanCode() {
            this.costNeiDanCode_ = NeiDanMsg.C2S_NeiDanLvUp_28903.emptyIntList();
            this.bitField0_ &= -5;
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

   public static final class S2C_NeiDanLvUp_28904 extends GeneratedMessageV3 implements S2C_NeiDanLvUp_28904OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_NeiDanLvUp_28904 DEFAULT_INSTANCE = new S2C_NeiDanLvUp_28904();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NeiDanLvUp_28904> PARSER = new AbstractParser<S2C_NeiDanLvUp_28904>() {
         public S2C_NeiDanLvUp_28904 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NeiDanLvUp_28904(input, extensionRegistry);
         }
      };

      private S2C_NeiDanLvUp_28904(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NeiDanLvUp_28904() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NeiDanLvUp_28904();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NeiDanLvUp_28904(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanLvUp_28904_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanLvUp_28904_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NeiDanLvUp_28904.class, Builder.class);
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
         } else if (!(obj instanceof S2C_NeiDanLvUp_28904)) {
            return super.equals(obj);
         } else {
            S2C_NeiDanLvUp_28904 other = (S2C_NeiDanLvUp_28904)obj;
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

      public static S2C_NeiDanLvUp_28904 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NeiDanLvUp_28904)PARSER.parseFrom(data);
      }

      public static S2C_NeiDanLvUp_28904 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NeiDanLvUp_28904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NeiDanLvUp_28904 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NeiDanLvUp_28904)PARSER.parseFrom(data);
      }

      public static S2C_NeiDanLvUp_28904 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NeiDanLvUp_28904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NeiDanLvUp_28904 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NeiDanLvUp_28904)PARSER.parseFrom(data);
      }

      public static S2C_NeiDanLvUp_28904 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NeiDanLvUp_28904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NeiDanLvUp_28904 parseFrom(InputStream input) throws IOException {
         return (S2C_NeiDanLvUp_28904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NeiDanLvUp_28904 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NeiDanLvUp_28904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NeiDanLvUp_28904 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NeiDanLvUp_28904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NeiDanLvUp_28904 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NeiDanLvUp_28904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NeiDanLvUp_28904 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NeiDanLvUp_28904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NeiDanLvUp_28904 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NeiDanLvUp_28904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NeiDanLvUp_28904 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NeiDanLvUp_28904 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NeiDanLvUp_28904> parser() {
         return PARSER;
      }

      public Parser<S2C_NeiDanLvUp_28904> getParserForType() {
         return PARSER;
      }

      public S2C_NeiDanLvUp_28904 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NeiDanLvUp_28904OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanLvUp_28904_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanLvUp_28904_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NeiDanLvUp_28904.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NeiDanMsg.S2C_NeiDanLvUp_28904.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanLvUp_28904_descriptor;
         }

         public S2C_NeiDanLvUp_28904 getDefaultInstanceForType() {
            return NeiDanMsg.S2C_NeiDanLvUp_28904.getDefaultInstance();
         }

         public S2C_NeiDanLvUp_28904 build() {
            S2C_NeiDanLvUp_28904 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NeiDanLvUp_28904 buildPartial() {
            S2C_NeiDanLvUp_28904 result = new S2C_NeiDanLvUp_28904(this);
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
            if (other instanceof S2C_NeiDanLvUp_28904) {
               return this.mergeFrom((S2C_NeiDanLvUp_28904)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NeiDanLvUp_28904 other) {
            if (other == NeiDanMsg.S2C_NeiDanLvUp_28904.getDefaultInstance()) {
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
            S2C_NeiDanLvUp_28904 parsedMessage = null;

            try {
               parsedMessage = (S2C_NeiDanLvUp_28904)NeiDanMsg.S2C_NeiDanLvUp_28904.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NeiDanLvUp_28904)e.getUnfinishedMessage();
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

   public static final class C2S_NeiDanLvReset_28905 extends GeneratedMessageV3 implements C2S_NeiDanLvReset_28905OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SOURCE_FIELD_NUMBER = 1;
      private DressState source_;
      private byte memoizedIsInitialized;
      private static final C2S_NeiDanLvReset_28905 DEFAULT_INSTANCE = new C2S_NeiDanLvReset_28905();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_NeiDanLvReset_28905> PARSER = new AbstractParser<C2S_NeiDanLvReset_28905>() {
         public C2S_NeiDanLvReset_28905 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_NeiDanLvReset_28905(input, extensionRegistry);
         }
      };

      private C2S_NeiDanLvReset_28905(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_NeiDanLvReset_28905() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_NeiDanLvReset_28905();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_NeiDanLvReset_28905(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        DressState.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.source_.toBuilder();
                        }

                        this.source_ = (DressState)input.readMessage(NeiDanMsg.DressState.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.source_);
                           this.source_ = subBuilder.buildPartial();
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
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanLvReset_28905_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanLvReset_28905_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NeiDanLvReset_28905.class, Builder.class);
      }

      public boolean hasSource() {
         return (this.bitField0_ & 1) != 0;
      }

      public DressState getSource() {
         return this.source_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.source_;
      }

      public DressStateOrBuilder getSourceOrBuilder() {
         return this.source_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.source_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSource()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getSource().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getSource());
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
               size += CodedOutputStream.computeMessageSize(1, this.getSource());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_NeiDanLvReset_28905)) {
            return super.equals(obj);
         } else {
            C2S_NeiDanLvReset_28905 other = (C2S_NeiDanLvReset_28905)obj;
            if (this.hasSource() != other.hasSource()) {
               return false;
            } else if (this.hasSource() && !this.getSource().equals(other.getSource())) {
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
            if (this.hasSource()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSource().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_NeiDanLvReset_28905 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_NeiDanLvReset_28905)PARSER.parseFrom(data);
      }

      public static C2S_NeiDanLvReset_28905 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NeiDanLvReset_28905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NeiDanLvReset_28905 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_NeiDanLvReset_28905)PARSER.parseFrom(data);
      }

      public static C2S_NeiDanLvReset_28905 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NeiDanLvReset_28905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NeiDanLvReset_28905 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_NeiDanLvReset_28905)PARSER.parseFrom(data);
      }

      public static C2S_NeiDanLvReset_28905 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NeiDanLvReset_28905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NeiDanLvReset_28905 parseFrom(InputStream input) throws IOException {
         return (C2S_NeiDanLvReset_28905)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NeiDanLvReset_28905 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NeiDanLvReset_28905)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NeiDanLvReset_28905 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_NeiDanLvReset_28905)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_NeiDanLvReset_28905 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NeiDanLvReset_28905)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NeiDanLvReset_28905 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_NeiDanLvReset_28905)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NeiDanLvReset_28905 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NeiDanLvReset_28905)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_NeiDanLvReset_28905 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_NeiDanLvReset_28905 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_NeiDanLvReset_28905> parser() {
         return PARSER;
      }

      public Parser<C2S_NeiDanLvReset_28905> getParserForType() {
         return PARSER;
      }

      public C2S_NeiDanLvReset_28905 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_NeiDanLvReset_28905OrBuilder {
         private int bitField0_;
         private DressState source_;
         private SingleFieldBuilderV3<DressState, DressState.Builder, DressStateOrBuilder> sourceBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanLvReset_28905_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanLvReset_28905_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NeiDanLvReset_28905.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NeiDanMsg.C2S_NeiDanLvReset_28905.alwaysUseFieldBuilders) {
               this.getSourceFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.sourceBuilder_ == null) {
               this.source_ = null;
            } else {
               this.sourceBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanLvReset_28905_descriptor;
         }

         public C2S_NeiDanLvReset_28905 getDefaultInstanceForType() {
            return NeiDanMsg.C2S_NeiDanLvReset_28905.getDefaultInstance();
         }

         public C2S_NeiDanLvReset_28905 build() {
            C2S_NeiDanLvReset_28905 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_NeiDanLvReset_28905 buildPartial() {
            C2S_NeiDanLvReset_28905 result = new C2S_NeiDanLvReset_28905(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.sourceBuilder_ == null) {
                  result.source_ = this.source_;
               } else {
                  result.source_ = (DressState)this.sourceBuilder_.build();
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
            if (other instanceof C2S_NeiDanLvReset_28905) {
               return this.mergeFrom((C2S_NeiDanLvReset_28905)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_NeiDanLvReset_28905 other) {
            if (other == NeiDanMsg.C2S_NeiDanLvReset_28905.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSource()) {
                  this.mergeSource(other.getSource());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSource()) {
               return false;
            } else {
               return this.getSource().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_NeiDanLvReset_28905 parsedMessage = null;

            try {
               parsedMessage = (C2S_NeiDanLvReset_28905)NeiDanMsg.C2S_NeiDanLvReset_28905.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_NeiDanLvReset_28905)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSource() {
            return (this.bitField0_ & 1) != 0;
         }

         public DressState getSource() {
            if (this.sourceBuilder_ == null) {
               return this.source_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.source_;
            } else {
               return (DressState)this.sourceBuilder_.getMessage();
            }
         }

         public Builder setSource(DressState value) {
            if (this.sourceBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.source_ = value;
               this.onChanged();
            } else {
               this.sourceBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setSource(DressState.Builder builderForValue) {
            if (this.sourceBuilder_ == null) {
               this.source_ = builderForValue.build();
               this.onChanged();
            } else {
               this.sourceBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeSource(DressState value) {
            if (this.sourceBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.source_ != null && this.source_ != NeiDanMsg.DressState.getDefaultInstance()) {
                  this.source_ = NeiDanMsg.DressState.newBuilder(this.source_).mergeFrom(value).buildPartial();
               } else {
                  this.source_ = value;
               }

               this.onChanged();
            } else {
               this.sourceBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearSource() {
            if (this.sourceBuilder_ == null) {
               this.source_ = null;
               this.onChanged();
            } else {
               this.sourceBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public DressState.Builder getSourceBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (DressState.Builder)this.getSourceFieldBuilder().getBuilder();
         }

         public DressStateOrBuilder getSourceOrBuilder() {
            if (this.sourceBuilder_ != null) {
               return (DressStateOrBuilder)this.sourceBuilder_.getMessageOrBuilder();
            } else {
               return this.source_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.source_;
            }
         }

         private SingleFieldBuilderV3<DressState, DressState.Builder, DressStateOrBuilder> getSourceFieldBuilder() {
            if (this.sourceBuilder_ == null) {
               this.sourceBuilder_ = new SingleFieldBuilderV3(this.getSource(), this.getParentForChildren(), this.isClean());
               this.source_ = null;
            }

            return this.sourceBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_NeiDanLvReset_28906 extends GeneratedMessageV3 implements S2C_NeiDanLvReset_28906OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_NeiDanLvReset_28906 DEFAULT_INSTANCE = new S2C_NeiDanLvReset_28906();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NeiDanLvReset_28906> PARSER = new AbstractParser<S2C_NeiDanLvReset_28906>() {
         public S2C_NeiDanLvReset_28906 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NeiDanLvReset_28906(input, extensionRegistry);
         }
      };

      private S2C_NeiDanLvReset_28906(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NeiDanLvReset_28906() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NeiDanLvReset_28906();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NeiDanLvReset_28906(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanLvReset_28906_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanLvReset_28906_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NeiDanLvReset_28906.class, Builder.class);
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
         } else if (!(obj instanceof S2C_NeiDanLvReset_28906)) {
            return super.equals(obj);
         } else {
            S2C_NeiDanLvReset_28906 other = (S2C_NeiDanLvReset_28906)obj;
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

      public static S2C_NeiDanLvReset_28906 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NeiDanLvReset_28906)PARSER.parseFrom(data);
      }

      public static S2C_NeiDanLvReset_28906 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NeiDanLvReset_28906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NeiDanLvReset_28906 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NeiDanLvReset_28906)PARSER.parseFrom(data);
      }

      public static S2C_NeiDanLvReset_28906 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NeiDanLvReset_28906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NeiDanLvReset_28906 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NeiDanLvReset_28906)PARSER.parseFrom(data);
      }

      public static S2C_NeiDanLvReset_28906 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NeiDanLvReset_28906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NeiDanLvReset_28906 parseFrom(InputStream input) throws IOException {
         return (S2C_NeiDanLvReset_28906)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NeiDanLvReset_28906 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NeiDanLvReset_28906)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NeiDanLvReset_28906 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NeiDanLvReset_28906)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NeiDanLvReset_28906 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NeiDanLvReset_28906)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NeiDanLvReset_28906 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NeiDanLvReset_28906)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NeiDanLvReset_28906 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NeiDanLvReset_28906)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NeiDanLvReset_28906 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NeiDanLvReset_28906 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NeiDanLvReset_28906> parser() {
         return PARSER;
      }

      public Parser<S2C_NeiDanLvReset_28906> getParserForType() {
         return PARSER;
      }

      public S2C_NeiDanLvReset_28906 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NeiDanLvReset_28906OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanLvReset_28906_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanLvReset_28906_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NeiDanLvReset_28906.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NeiDanMsg.S2C_NeiDanLvReset_28906.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanLvReset_28906_descriptor;
         }

         public S2C_NeiDanLvReset_28906 getDefaultInstanceForType() {
            return NeiDanMsg.S2C_NeiDanLvReset_28906.getDefaultInstance();
         }

         public S2C_NeiDanLvReset_28906 build() {
            S2C_NeiDanLvReset_28906 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NeiDanLvReset_28906 buildPartial() {
            S2C_NeiDanLvReset_28906 result = new S2C_NeiDanLvReset_28906(this);
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
            if (other instanceof S2C_NeiDanLvReset_28906) {
               return this.mergeFrom((S2C_NeiDanLvReset_28906)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NeiDanLvReset_28906 other) {
            if (other == NeiDanMsg.S2C_NeiDanLvReset_28906.getDefaultInstance()) {
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
            S2C_NeiDanLvReset_28906 parsedMessage = null;

            try {
               parsedMessage = (S2C_NeiDanLvReset_28906)NeiDanMsg.S2C_NeiDanLvReset_28906.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NeiDanLvReset_28906)e.getUnfinishedMessage();
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

   public static final class C2S_NeiDanCompound_28907 extends GeneratedMessageV3 implements C2S_NeiDanCompound_28907OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int COMTYPE_FIELD_NUMBER = 1;
      private int comType_;
      public static final int RECNEIDANITEMCODE_FIELD_NUMBER = 2;
      private Internal.IntList recNeiDanItemCode_;
      private byte memoizedIsInitialized;
      private static final C2S_NeiDanCompound_28907 DEFAULT_INSTANCE = new C2S_NeiDanCompound_28907();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_NeiDanCompound_28907> PARSER = new AbstractParser<C2S_NeiDanCompound_28907>() {
         public C2S_NeiDanCompound_28907 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_NeiDanCompound_28907(input, extensionRegistry);
         }
      };

      private C2S_NeiDanCompound_28907(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_NeiDanCompound_28907() {
         this.memoizedIsInitialized = -1;
         this.recNeiDanItemCode_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_NeiDanCompound_28907();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_NeiDanCompound_28907(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.comType_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.recNeiDanItemCode_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.recNeiDanItemCode_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.recNeiDanItemCode_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.recNeiDanItemCode_.addInt(input.readInt32());
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
                  this.recNeiDanItemCode_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanCompound_28907_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanCompound_28907_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NeiDanCompound_28907.class, Builder.class);
      }

      public boolean hasComType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getComType() {
         return this.comType_;
      }

      public List<Integer> getRecNeiDanItemCodeList() {
         return this.recNeiDanItemCode_;
      }

      public int getRecNeiDanItemCodeCount() {
         return this.recNeiDanItemCode_.size();
      }

      public int getRecNeiDanItemCode(int index) {
         return this.recNeiDanItemCode_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasComType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.comType_);
         }

         for(int i = 0; i < this.recNeiDanItemCode_.size(); ++i) {
            output.writeInt32(2, this.recNeiDanItemCode_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.comType_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.recNeiDanItemCode_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.recNeiDanItemCode_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRecNeiDanItemCodeList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_NeiDanCompound_28907)) {
            return super.equals(obj);
         } else {
            C2S_NeiDanCompound_28907 other = (C2S_NeiDanCompound_28907)obj;
            if (this.hasComType() != other.hasComType()) {
               return false;
            } else if (this.hasComType() && this.getComType() != other.getComType()) {
               return false;
            } else if (!this.getRecNeiDanItemCodeList().equals(other.getRecNeiDanItemCodeList())) {
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
            if (this.hasComType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getComType();
            }

            if (this.getRecNeiDanItemCodeCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRecNeiDanItemCodeList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_NeiDanCompound_28907 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_NeiDanCompound_28907)PARSER.parseFrom(data);
      }

      public static C2S_NeiDanCompound_28907 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NeiDanCompound_28907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NeiDanCompound_28907 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_NeiDanCompound_28907)PARSER.parseFrom(data);
      }

      public static C2S_NeiDanCompound_28907 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NeiDanCompound_28907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NeiDanCompound_28907 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_NeiDanCompound_28907)PARSER.parseFrom(data);
      }

      public static C2S_NeiDanCompound_28907 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NeiDanCompound_28907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NeiDanCompound_28907 parseFrom(InputStream input) throws IOException {
         return (C2S_NeiDanCompound_28907)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NeiDanCompound_28907 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NeiDanCompound_28907)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NeiDanCompound_28907 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_NeiDanCompound_28907)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_NeiDanCompound_28907 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NeiDanCompound_28907)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NeiDanCompound_28907 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_NeiDanCompound_28907)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NeiDanCompound_28907 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NeiDanCompound_28907)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_NeiDanCompound_28907 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_NeiDanCompound_28907 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_NeiDanCompound_28907> parser() {
         return PARSER;
      }

      public Parser<C2S_NeiDanCompound_28907> getParserForType() {
         return PARSER;
      }

      public C2S_NeiDanCompound_28907 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_NeiDanCompound_28907OrBuilder {
         private int bitField0_;
         private int comType_;
         private Internal.IntList recNeiDanItemCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanCompound_28907_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanCompound_28907_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NeiDanCompound_28907.class, Builder.class);
         }

         private Builder() {
            this.recNeiDanItemCode_ = NeiDanMsg.C2S_NeiDanCompound_28907.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.recNeiDanItemCode_ = NeiDanMsg.C2S_NeiDanCompound_28907.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NeiDanMsg.C2S_NeiDanCompound_28907.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.comType_ = 0;
            this.bitField0_ &= -2;
            this.recNeiDanItemCode_ = NeiDanMsg.C2S_NeiDanCompound_28907.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanCompound_28907_descriptor;
         }

         public C2S_NeiDanCompound_28907 getDefaultInstanceForType() {
            return NeiDanMsg.C2S_NeiDanCompound_28907.getDefaultInstance();
         }

         public C2S_NeiDanCompound_28907 build() {
            C2S_NeiDanCompound_28907 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_NeiDanCompound_28907 buildPartial() {
            C2S_NeiDanCompound_28907 result = new C2S_NeiDanCompound_28907(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.comType_ = this.comType_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.recNeiDanItemCode_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.recNeiDanItemCode_ = this.recNeiDanItemCode_;
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
            if (other instanceof C2S_NeiDanCompound_28907) {
               return this.mergeFrom((C2S_NeiDanCompound_28907)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_NeiDanCompound_28907 other) {
            if (other == NeiDanMsg.C2S_NeiDanCompound_28907.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasComType()) {
                  this.setComType(other.getComType());
               }

               if (!other.recNeiDanItemCode_.isEmpty()) {
                  if (this.recNeiDanItemCode_.isEmpty()) {
                     this.recNeiDanItemCode_ = other.recNeiDanItemCode_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureRecNeiDanItemCodeIsMutable();
                     this.recNeiDanItemCode_.addAll(other.recNeiDanItemCode_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasComType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_NeiDanCompound_28907 parsedMessage = null;

            try {
               parsedMessage = (C2S_NeiDanCompound_28907)NeiDanMsg.C2S_NeiDanCompound_28907.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_NeiDanCompound_28907)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasComType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getComType() {
            return this.comType_;
         }

         public Builder setComType(int value) {
            this.bitField0_ |= 1;
            this.comType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearComType() {
            this.bitField0_ &= -2;
            this.comType_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRecNeiDanItemCodeIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.recNeiDanItemCode_ = NeiDanMsg.C2S_NeiDanCompound_28907.mutableCopy(this.recNeiDanItemCode_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getRecNeiDanItemCodeList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.recNeiDanItemCode_) : this.recNeiDanItemCode_);
         }

         public int getRecNeiDanItemCodeCount() {
            return this.recNeiDanItemCode_.size();
         }

         public int getRecNeiDanItemCode(int index) {
            return this.recNeiDanItemCode_.getInt(index);
         }

         public Builder setRecNeiDanItemCode(int index, int value) {
            this.ensureRecNeiDanItemCodeIsMutable();
            this.recNeiDanItemCode_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRecNeiDanItemCode(int value) {
            this.ensureRecNeiDanItemCodeIsMutable();
            this.recNeiDanItemCode_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRecNeiDanItemCode(Iterable<? extends Integer> values) {
            this.ensureRecNeiDanItemCodeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recNeiDanItemCode_);
            this.onChanged();
            return this;
         }

         public Builder clearRecNeiDanItemCode() {
            this.recNeiDanItemCode_ = NeiDanMsg.C2S_NeiDanCompound_28907.emptyIntList();
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

   public static final class S2C_NeiDanCompound_28908 extends GeneratedMessageV3 implements S2C_NeiDanCompound_28908OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_NeiDanCompound_28908 DEFAULT_INSTANCE = new S2C_NeiDanCompound_28908();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NeiDanCompound_28908> PARSER = new AbstractParser<S2C_NeiDanCompound_28908>() {
         public S2C_NeiDanCompound_28908 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NeiDanCompound_28908(input, extensionRegistry);
         }
      };

      private S2C_NeiDanCompound_28908(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NeiDanCompound_28908() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NeiDanCompound_28908();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NeiDanCompound_28908(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanCompound_28908_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanCompound_28908_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NeiDanCompound_28908.class, Builder.class);
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
         } else if (!(obj instanceof S2C_NeiDanCompound_28908)) {
            return super.equals(obj);
         } else {
            S2C_NeiDanCompound_28908 other = (S2C_NeiDanCompound_28908)obj;
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

      public static S2C_NeiDanCompound_28908 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NeiDanCompound_28908)PARSER.parseFrom(data);
      }

      public static S2C_NeiDanCompound_28908 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NeiDanCompound_28908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NeiDanCompound_28908 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NeiDanCompound_28908)PARSER.parseFrom(data);
      }

      public static S2C_NeiDanCompound_28908 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NeiDanCompound_28908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NeiDanCompound_28908 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NeiDanCompound_28908)PARSER.parseFrom(data);
      }

      public static S2C_NeiDanCompound_28908 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NeiDanCompound_28908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NeiDanCompound_28908 parseFrom(InputStream input) throws IOException {
         return (S2C_NeiDanCompound_28908)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NeiDanCompound_28908 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NeiDanCompound_28908)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NeiDanCompound_28908 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NeiDanCompound_28908)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NeiDanCompound_28908 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NeiDanCompound_28908)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NeiDanCompound_28908 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NeiDanCompound_28908)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NeiDanCompound_28908 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NeiDanCompound_28908)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NeiDanCompound_28908 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NeiDanCompound_28908 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NeiDanCompound_28908> parser() {
         return PARSER;
      }

      public Parser<S2C_NeiDanCompound_28908> getParserForType() {
         return PARSER;
      }

      public S2C_NeiDanCompound_28908 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NeiDanCompound_28908OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanCompound_28908_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanCompound_28908_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NeiDanCompound_28908.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NeiDanMsg.S2C_NeiDanCompound_28908.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanCompound_28908_descriptor;
         }

         public S2C_NeiDanCompound_28908 getDefaultInstanceForType() {
            return NeiDanMsg.S2C_NeiDanCompound_28908.getDefaultInstance();
         }

         public S2C_NeiDanCompound_28908 build() {
            S2C_NeiDanCompound_28908 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NeiDanCompound_28908 buildPartial() {
            S2C_NeiDanCompound_28908 result = new S2C_NeiDanCompound_28908(this);
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
            if (other instanceof S2C_NeiDanCompound_28908) {
               return this.mergeFrom((S2C_NeiDanCompound_28908)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NeiDanCompound_28908 other) {
            if (other == NeiDanMsg.S2C_NeiDanCompound_28908.getDefaultInstance()) {
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
            S2C_NeiDanCompound_28908 parsedMessage = null;

            try {
               parsedMessage = (S2C_NeiDanCompound_28908)NeiDanMsg.S2C_NeiDanCompound_28908.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NeiDanCompound_28908)e.getUnfinishedMessage();
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

   public static final class C2S_NeiDanDress_28909 extends GeneratedMessageV3 implements C2S_NeiDanDress_28909OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESOURCE_FIELD_NUMBER = 1;
      private DressState resource_;
      public static final int TARGET_FIELD_NUMBER = 2;
      private DressState target_;
      private byte memoizedIsInitialized;
      private static final C2S_NeiDanDress_28909 DEFAULT_INSTANCE = new C2S_NeiDanDress_28909();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_NeiDanDress_28909> PARSER = new AbstractParser<C2S_NeiDanDress_28909>() {
         public C2S_NeiDanDress_28909 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_NeiDanDress_28909(input, extensionRegistry);
         }
      };

      private C2S_NeiDanDress_28909(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_NeiDanDress_28909() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_NeiDanDress_28909();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_NeiDanDress_28909(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        DressState.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.resource_.toBuilder();
                        }

                        this.resource_ = (DressState)input.readMessage(NeiDanMsg.DressState.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.resource_);
                           this.resource_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        DressState.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.target_.toBuilder();
                        }

                        this.target_ = (DressState)input.readMessage(NeiDanMsg.DressState.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.target_);
                           this.target_ = subBuilder.buildPartial();
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
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanDress_28909_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanDress_28909_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NeiDanDress_28909.class, Builder.class);
      }

      public boolean hasResource() {
         return (this.bitField0_ & 1) != 0;
      }

      public DressState getResource() {
         return this.resource_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.resource_;
      }

      public DressStateOrBuilder getResourceOrBuilder() {
         return this.resource_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.resource_;
      }

      public boolean hasTarget() {
         return (this.bitField0_ & 2) != 0;
      }

      public DressState getTarget() {
         return this.target_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.target_;
      }

      public DressStateOrBuilder getTargetOrBuilder() {
         return this.target_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.target_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasResource()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTarget()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getResource().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getTarget().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getResource());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getTarget());
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
               size += CodedOutputStream.computeMessageSize(1, this.getResource());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getTarget());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_NeiDanDress_28909)) {
            return super.equals(obj);
         } else {
            C2S_NeiDanDress_28909 other = (C2S_NeiDanDress_28909)obj;
            if (this.hasResource() != other.hasResource()) {
               return false;
            } else if (this.hasResource() && !this.getResource().equals(other.getResource())) {
               return false;
            } else if (this.hasTarget() != other.hasTarget()) {
               return false;
            } else if (this.hasTarget() && !this.getTarget().equals(other.getTarget())) {
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
            if (this.hasResource()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResource().hashCode();
            }

            if (this.hasTarget()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTarget().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_NeiDanDress_28909 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_NeiDanDress_28909)PARSER.parseFrom(data);
      }

      public static C2S_NeiDanDress_28909 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NeiDanDress_28909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NeiDanDress_28909 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_NeiDanDress_28909)PARSER.parseFrom(data);
      }

      public static C2S_NeiDanDress_28909 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NeiDanDress_28909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NeiDanDress_28909 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_NeiDanDress_28909)PARSER.parseFrom(data);
      }

      public static C2S_NeiDanDress_28909 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NeiDanDress_28909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NeiDanDress_28909 parseFrom(InputStream input) throws IOException {
         return (C2S_NeiDanDress_28909)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NeiDanDress_28909 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NeiDanDress_28909)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NeiDanDress_28909 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_NeiDanDress_28909)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_NeiDanDress_28909 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NeiDanDress_28909)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NeiDanDress_28909 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_NeiDanDress_28909)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NeiDanDress_28909 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NeiDanDress_28909)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_NeiDanDress_28909 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_NeiDanDress_28909 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_NeiDanDress_28909> parser() {
         return PARSER;
      }

      public Parser<C2S_NeiDanDress_28909> getParserForType() {
         return PARSER;
      }

      public C2S_NeiDanDress_28909 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_NeiDanDress_28909OrBuilder {
         private int bitField0_;
         private DressState resource_;
         private SingleFieldBuilderV3<DressState, DressState.Builder, DressStateOrBuilder> resourceBuilder_;
         private DressState target_;
         private SingleFieldBuilderV3<DressState, DressState.Builder, DressStateOrBuilder> targetBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanDress_28909_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanDress_28909_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NeiDanDress_28909.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NeiDanMsg.C2S_NeiDanDress_28909.alwaysUseFieldBuilders) {
               this.getResourceFieldBuilder();
               this.getTargetFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.resourceBuilder_ == null) {
               this.resource_ = null;
            } else {
               this.resourceBuilder_.clear();
            }

            this.bitField0_ &= -2;
            if (this.targetBuilder_ == null) {
               this.target_ = null;
            } else {
               this.targetBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_NeiDanDress_28909_descriptor;
         }

         public C2S_NeiDanDress_28909 getDefaultInstanceForType() {
            return NeiDanMsg.C2S_NeiDanDress_28909.getDefaultInstance();
         }

         public C2S_NeiDanDress_28909 build() {
            C2S_NeiDanDress_28909 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_NeiDanDress_28909 buildPartial() {
            C2S_NeiDanDress_28909 result = new C2S_NeiDanDress_28909(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.resourceBuilder_ == null) {
                  result.resource_ = this.resource_;
               } else {
                  result.resource_ = (DressState)this.resourceBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.targetBuilder_ == null) {
                  result.target_ = this.target_;
               } else {
                  result.target_ = (DressState)this.targetBuilder_.build();
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
            if (other instanceof C2S_NeiDanDress_28909) {
               return this.mergeFrom((C2S_NeiDanDress_28909)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_NeiDanDress_28909 other) {
            if (other == NeiDanMsg.C2S_NeiDanDress_28909.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResource()) {
                  this.mergeResource(other.getResource());
               }

               if (other.hasTarget()) {
                  this.mergeTarget(other.getTarget());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResource()) {
               return false;
            } else if (!this.hasTarget()) {
               return false;
            } else if (!this.getResource().isInitialized()) {
               return false;
            } else {
               return this.getTarget().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_NeiDanDress_28909 parsedMessage = null;

            try {
               parsedMessage = (C2S_NeiDanDress_28909)NeiDanMsg.C2S_NeiDanDress_28909.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_NeiDanDress_28909)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasResource() {
            return (this.bitField0_ & 1) != 0;
         }

         public DressState getResource() {
            if (this.resourceBuilder_ == null) {
               return this.resource_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.resource_;
            } else {
               return (DressState)this.resourceBuilder_.getMessage();
            }
         }

         public Builder setResource(DressState value) {
            if (this.resourceBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.resource_ = value;
               this.onChanged();
            } else {
               this.resourceBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setResource(DressState.Builder builderForValue) {
            if (this.resourceBuilder_ == null) {
               this.resource_ = builderForValue.build();
               this.onChanged();
            } else {
               this.resourceBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeResource(DressState value) {
            if (this.resourceBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.resource_ != null && this.resource_ != NeiDanMsg.DressState.getDefaultInstance()) {
                  this.resource_ = NeiDanMsg.DressState.newBuilder(this.resource_).mergeFrom(value).buildPartial();
               } else {
                  this.resource_ = value;
               }

               this.onChanged();
            } else {
               this.resourceBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearResource() {
            if (this.resourceBuilder_ == null) {
               this.resource_ = null;
               this.onChanged();
            } else {
               this.resourceBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public DressState.Builder getResourceBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (DressState.Builder)this.getResourceFieldBuilder().getBuilder();
         }

         public DressStateOrBuilder getResourceOrBuilder() {
            if (this.resourceBuilder_ != null) {
               return (DressStateOrBuilder)this.resourceBuilder_.getMessageOrBuilder();
            } else {
               return this.resource_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.resource_;
            }
         }

         private SingleFieldBuilderV3<DressState, DressState.Builder, DressStateOrBuilder> getResourceFieldBuilder() {
            if (this.resourceBuilder_ == null) {
               this.resourceBuilder_ = new SingleFieldBuilderV3(this.getResource(), this.getParentForChildren(), this.isClean());
               this.resource_ = null;
            }

            return this.resourceBuilder_;
         }

         public boolean hasTarget() {
            return (this.bitField0_ & 2) != 0;
         }

         public DressState getTarget() {
            if (this.targetBuilder_ == null) {
               return this.target_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.target_;
            } else {
               return (DressState)this.targetBuilder_.getMessage();
            }
         }

         public Builder setTarget(DressState value) {
            if (this.targetBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.target_ = value;
               this.onChanged();
            } else {
               this.targetBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setTarget(DressState.Builder builderForValue) {
            if (this.targetBuilder_ == null) {
               this.target_ = builderForValue.build();
               this.onChanged();
            } else {
               this.targetBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeTarget(DressState value) {
            if (this.targetBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.target_ != null && this.target_ != NeiDanMsg.DressState.getDefaultInstance()) {
                  this.target_ = NeiDanMsg.DressState.newBuilder(this.target_).mergeFrom(value).buildPartial();
               } else {
                  this.target_ = value;
               }

               this.onChanged();
            } else {
               this.targetBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearTarget() {
            if (this.targetBuilder_ == null) {
               this.target_ = null;
               this.onChanged();
            } else {
               this.targetBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public DressState.Builder getTargetBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (DressState.Builder)this.getTargetFieldBuilder().getBuilder();
         }

         public DressStateOrBuilder getTargetOrBuilder() {
            if (this.targetBuilder_ != null) {
               return (DressStateOrBuilder)this.targetBuilder_.getMessageOrBuilder();
            } else {
               return this.target_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.target_;
            }
         }

         private SingleFieldBuilderV3<DressState, DressState.Builder, DressStateOrBuilder> getTargetFieldBuilder() {
            if (this.targetBuilder_ == null) {
               this.targetBuilder_ = new SingleFieldBuilderV3(this.getTarget(), this.getParentForChildren(), this.isClean());
               this.target_ = null;
            }

            return this.targetBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_NeiDanDress_28910 extends GeneratedMessageV3 implements S2C_NeiDanDress_28910OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_NeiDanDress_28910 DEFAULT_INSTANCE = new S2C_NeiDanDress_28910();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NeiDanDress_28910> PARSER = new AbstractParser<S2C_NeiDanDress_28910>() {
         public S2C_NeiDanDress_28910 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NeiDanDress_28910(input, extensionRegistry);
         }
      };

      private S2C_NeiDanDress_28910(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NeiDanDress_28910() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NeiDanDress_28910();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NeiDanDress_28910(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanDress_28910_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanDress_28910_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NeiDanDress_28910.class, Builder.class);
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
         } else if (!(obj instanceof S2C_NeiDanDress_28910)) {
            return super.equals(obj);
         } else {
            S2C_NeiDanDress_28910 other = (S2C_NeiDanDress_28910)obj;
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

      public static S2C_NeiDanDress_28910 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NeiDanDress_28910)PARSER.parseFrom(data);
      }

      public static S2C_NeiDanDress_28910 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NeiDanDress_28910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NeiDanDress_28910 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NeiDanDress_28910)PARSER.parseFrom(data);
      }

      public static S2C_NeiDanDress_28910 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NeiDanDress_28910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NeiDanDress_28910 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NeiDanDress_28910)PARSER.parseFrom(data);
      }

      public static S2C_NeiDanDress_28910 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NeiDanDress_28910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NeiDanDress_28910 parseFrom(InputStream input) throws IOException {
         return (S2C_NeiDanDress_28910)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NeiDanDress_28910 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NeiDanDress_28910)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NeiDanDress_28910 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NeiDanDress_28910)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NeiDanDress_28910 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NeiDanDress_28910)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NeiDanDress_28910 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NeiDanDress_28910)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NeiDanDress_28910 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NeiDanDress_28910)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NeiDanDress_28910 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NeiDanDress_28910 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NeiDanDress_28910> parser() {
         return PARSER;
      }

      public Parser<S2C_NeiDanDress_28910> getParserForType() {
         return PARSER;
      }

      public S2C_NeiDanDress_28910 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NeiDanDress_28910OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanDress_28910_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanDress_28910_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NeiDanDress_28910.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NeiDanMsg.S2C_NeiDanDress_28910.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_NeiDanDress_28910_descriptor;
         }

         public S2C_NeiDanDress_28910 getDefaultInstanceForType() {
            return NeiDanMsg.S2C_NeiDanDress_28910.getDefaultInstance();
         }

         public S2C_NeiDanDress_28910 build() {
            S2C_NeiDanDress_28910 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NeiDanDress_28910 buildPartial() {
            S2C_NeiDanDress_28910 result = new S2C_NeiDanDress_28910(this);
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
            if (other instanceof S2C_NeiDanDress_28910) {
               return this.mergeFrom((S2C_NeiDanDress_28910)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NeiDanDress_28910 other) {
            if (other == NeiDanMsg.S2C_NeiDanDress_28910.getDefaultInstance()) {
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
            S2C_NeiDanDress_28910 parsedMessage = null;

            try {
               parsedMessage = (S2C_NeiDanDress_28910)NeiDanMsg.S2C_NeiDanDress_28910.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NeiDanDress_28910)e.getUnfinishedMessage();
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

   public static final class C2S_UndressNeiDan_28911 extends GeneratedMessageV3 implements C2S_UndressNeiDan_28911OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESOURCE_FIELD_NUMBER = 1;
      private DressState resource_;
      private byte memoizedIsInitialized;
      private static final C2S_UndressNeiDan_28911 DEFAULT_INSTANCE = new C2S_UndressNeiDan_28911();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UndressNeiDan_28911> PARSER = new AbstractParser<C2S_UndressNeiDan_28911>() {
         public C2S_UndressNeiDan_28911 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UndressNeiDan_28911(input, extensionRegistry);
         }
      };

      private C2S_UndressNeiDan_28911(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UndressNeiDan_28911() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UndressNeiDan_28911();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UndressNeiDan_28911(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        DressState.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.resource_.toBuilder();
                        }

                        this.resource_ = (DressState)input.readMessage(NeiDanMsg.DressState.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.resource_);
                           this.resource_ = subBuilder.buildPartial();
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
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_UndressNeiDan_28911_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_UndressNeiDan_28911_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UndressNeiDan_28911.class, Builder.class);
      }

      public boolean hasResource() {
         return (this.bitField0_ & 1) != 0;
      }

      public DressState getResource() {
         return this.resource_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.resource_;
      }

      public DressStateOrBuilder getResourceOrBuilder() {
         return this.resource_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.resource_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasResource()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getResource().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getResource());
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
               size += CodedOutputStream.computeMessageSize(1, this.getResource());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_UndressNeiDan_28911)) {
            return super.equals(obj);
         } else {
            C2S_UndressNeiDan_28911 other = (C2S_UndressNeiDan_28911)obj;
            if (this.hasResource() != other.hasResource()) {
               return false;
            } else if (this.hasResource() && !this.getResource().equals(other.getResource())) {
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
            if (this.hasResource()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResource().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_UndressNeiDan_28911 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UndressNeiDan_28911)PARSER.parseFrom(data);
      }

      public static C2S_UndressNeiDan_28911 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UndressNeiDan_28911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UndressNeiDan_28911 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UndressNeiDan_28911)PARSER.parseFrom(data);
      }

      public static C2S_UndressNeiDan_28911 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UndressNeiDan_28911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UndressNeiDan_28911 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UndressNeiDan_28911)PARSER.parseFrom(data);
      }

      public static C2S_UndressNeiDan_28911 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UndressNeiDan_28911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UndressNeiDan_28911 parseFrom(InputStream input) throws IOException {
         return (C2S_UndressNeiDan_28911)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UndressNeiDan_28911 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UndressNeiDan_28911)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UndressNeiDan_28911 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UndressNeiDan_28911)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UndressNeiDan_28911 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UndressNeiDan_28911)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UndressNeiDan_28911 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UndressNeiDan_28911)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UndressNeiDan_28911 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UndressNeiDan_28911)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UndressNeiDan_28911 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UndressNeiDan_28911 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UndressNeiDan_28911> parser() {
         return PARSER;
      }

      public Parser<C2S_UndressNeiDan_28911> getParserForType() {
         return PARSER;
      }

      public C2S_UndressNeiDan_28911 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UndressNeiDan_28911OrBuilder {
         private int bitField0_;
         private DressState resource_;
         private SingleFieldBuilderV3<DressState, DressState.Builder, DressStateOrBuilder> resourceBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_UndressNeiDan_28911_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_UndressNeiDan_28911_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UndressNeiDan_28911.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NeiDanMsg.C2S_UndressNeiDan_28911.alwaysUseFieldBuilders) {
               this.getResourceFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.resourceBuilder_ == null) {
               this.resource_ = null;
            } else {
               this.resourceBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_UndressNeiDan_28911_descriptor;
         }

         public C2S_UndressNeiDan_28911 getDefaultInstanceForType() {
            return NeiDanMsg.C2S_UndressNeiDan_28911.getDefaultInstance();
         }

         public C2S_UndressNeiDan_28911 build() {
            C2S_UndressNeiDan_28911 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UndressNeiDan_28911 buildPartial() {
            C2S_UndressNeiDan_28911 result = new C2S_UndressNeiDan_28911(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.resourceBuilder_ == null) {
                  result.resource_ = this.resource_;
               } else {
                  result.resource_ = (DressState)this.resourceBuilder_.build();
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
            if (other instanceof C2S_UndressNeiDan_28911) {
               return this.mergeFrom((C2S_UndressNeiDan_28911)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UndressNeiDan_28911 other) {
            if (other == NeiDanMsg.C2S_UndressNeiDan_28911.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResource()) {
                  this.mergeResource(other.getResource());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResource()) {
               return false;
            } else {
               return this.getResource().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_UndressNeiDan_28911 parsedMessage = null;

            try {
               parsedMessage = (C2S_UndressNeiDan_28911)NeiDanMsg.C2S_UndressNeiDan_28911.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UndressNeiDan_28911)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasResource() {
            return (this.bitField0_ & 1) != 0;
         }

         public DressState getResource() {
            if (this.resourceBuilder_ == null) {
               return this.resource_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.resource_;
            } else {
               return (DressState)this.resourceBuilder_.getMessage();
            }
         }

         public Builder setResource(DressState value) {
            if (this.resourceBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.resource_ = value;
               this.onChanged();
            } else {
               this.resourceBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setResource(DressState.Builder builderForValue) {
            if (this.resourceBuilder_ == null) {
               this.resource_ = builderForValue.build();
               this.onChanged();
            } else {
               this.resourceBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeResource(DressState value) {
            if (this.resourceBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.resource_ != null && this.resource_ != NeiDanMsg.DressState.getDefaultInstance()) {
                  this.resource_ = NeiDanMsg.DressState.newBuilder(this.resource_).mergeFrom(value).buildPartial();
               } else {
                  this.resource_ = value;
               }

               this.onChanged();
            } else {
               this.resourceBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearResource() {
            if (this.resourceBuilder_ == null) {
               this.resource_ = null;
               this.onChanged();
            } else {
               this.resourceBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public DressState.Builder getResourceBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (DressState.Builder)this.getResourceFieldBuilder().getBuilder();
         }

         public DressStateOrBuilder getResourceOrBuilder() {
            if (this.resourceBuilder_ != null) {
               return (DressStateOrBuilder)this.resourceBuilder_.getMessageOrBuilder();
            } else {
               return this.resource_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.resource_;
            }
         }

         private SingleFieldBuilderV3<DressState, DressState.Builder, DressStateOrBuilder> getResourceFieldBuilder() {
            if (this.resourceBuilder_ == null) {
               this.resourceBuilder_ = new SingleFieldBuilderV3(this.getResource(), this.getParentForChildren(), this.isClean());
               this.resource_ = null;
            }

            return this.resourceBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_UndressNeiDan_28912 extends GeneratedMessageV3 implements S2C_UndressNeiDan_28912OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_UndressNeiDan_28912 DEFAULT_INSTANCE = new S2C_UndressNeiDan_28912();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UndressNeiDan_28912> PARSER = new AbstractParser<S2C_UndressNeiDan_28912>() {
         public S2C_UndressNeiDan_28912 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UndressNeiDan_28912(input, extensionRegistry);
         }
      };

      private S2C_UndressNeiDan_28912(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UndressNeiDan_28912() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UndressNeiDan_28912();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UndressNeiDan_28912(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_UndressNeiDan_28912_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_UndressNeiDan_28912_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UndressNeiDan_28912.class, Builder.class);
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
         } else if (!(obj instanceof S2C_UndressNeiDan_28912)) {
            return super.equals(obj);
         } else {
            S2C_UndressNeiDan_28912 other = (S2C_UndressNeiDan_28912)obj;
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

      public static S2C_UndressNeiDan_28912 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UndressNeiDan_28912)PARSER.parseFrom(data);
      }

      public static S2C_UndressNeiDan_28912 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UndressNeiDan_28912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UndressNeiDan_28912 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UndressNeiDan_28912)PARSER.parseFrom(data);
      }

      public static S2C_UndressNeiDan_28912 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UndressNeiDan_28912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UndressNeiDan_28912 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UndressNeiDan_28912)PARSER.parseFrom(data);
      }

      public static S2C_UndressNeiDan_28912 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UndressNeiDan_28912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UndressNeiDan_28912 parseFrom(InputStream input) throws IOException {
         return (S2C_UndressNeiDan_28912)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UndressNeiDan_28912 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UndressNeiDan_28912)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UndressNeiDan_28912 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UndressNeiDan_28912)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UndressNeiDan_28912 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UndressNeiDan_28912)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UndressNeiDan_28912 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UndressNeiDan_28912)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UndressNeiDan_28912 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UndressNeiDan_28912)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UndressNeiDan_28912 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UndressNeiDan_28912 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UndressNeiDan_28912> parser() {
         return PARSER;
      }

      public Parser<S2C_UndressNeiDan_28912> getParserForType() {
         return PARSER;
      }

      public S2C_UndressNeiDan_28912 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UndressNeiDan_28912OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_UndressNeiDan_28912_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_UndressNeiDan_28912_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UndressNeiDan_28912.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NeiDanMsg.S2C_UndressNeiDan_28912.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_UndressNeiDan_28912_descriptor;
         }

         public S2C_UndressNeiDan_28912 getDefaultInstanceForType() {
            return NeiDanMsg.S2C_UndressNeiDan_28912.getDefaultInstance();
         }

         public S2C_UndressNeiDan_28912 build() {
            S2C_UndressNeiDan_28912 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UndressNeiDan_28912 buildPartial() {
            S2C_UndressNeiDan_28912 result = new S2C_UndressNeiDan_28912(this);
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
            if (other instanceof S2C_UndressNeiDan_28912) {
               return this.mergeFrom((S2C_UndressNeiDan_28912)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UndressNeiDan_28912 other) {
            if (other == NeiDanMsg.S2C_UndressNeiDan_28912.getDefaultInstance()) {
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
            S2C_UndressNeiDan_28912 parsedMessage = null;

            try {
               parsedMessage = (S2C_UndressNeiDan_28912)NeiDanMsg.S2C_UndressNeiDan_28912.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UndressNeiDan_28912)e.getUnfinishedMessage();
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

   public static final class C2S_LockNeiDan_28913 extends GeneratedMessageV3 implements C2S_LockNeiDan_28913OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESOURCE_FIELD_NUMBER = 1;
      private DressState resource_;
      public static final int STATE_FIELD_NUMBER = 2;
      private int state_;
      private byte memoizedIsInitialized;
      private static final C2S_LockNeiDan_28913 DEFAULT_INSTANCE = new C2S_LockNeiDan_28913();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LockNeiDan_28913> PARSER = new AbstractParser<C2S_LockNeiDan_28913>() {
         public C2S_LockNeiDan_28913 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LockNeiDan_28913(input, extensionRegistry);
         }
      };

      private C2S_LockNeiDan_28913(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LockNeiDan_28913() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LockNeiDan_28913();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LockNeiDan_28913(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        DressState.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.resource_.toBuilder();
                        }

                        this.resource_ = (DressState)input.readMessage(NeiDanMsg.DressState.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.resource_);
                           this.resource_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.state_ = input.readInt32();
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
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_LockNeiDan_28913_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_LockNeiDan_28913_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LockNeiDan_28913.class, Builder.class);
      }

      public boolean hasResource() {
         return (this.bitField0_ & 1) != 0;
      }

      public DressState getResource() {
         return this.resource_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.resource_;
      }

      public DressStateOrBuilder getResourceOrBuilder() {
         return this.resource_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.resource_;
      }

      public boolean hasState() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasResource()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getResource().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getResource());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.state_);
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
               size += CodedOutputStream.computeMessageSize(1, this.getResource());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.state_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LockNeiDan_28913)) {
            return super.equals(obj);
         } else {
            C2S_LockNeiDan_28913 other = (C2S_LockNeiDan_28913)obj;
            if (this.hasResource() != other.hasResource()) {
               return false;
            } else if (this.hasResource() && !this.getResource().equals(other.getResource())) {
               return false;
            } else if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
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
            if (this.hasResource()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResource().hashCode();
            }

            if (this.hasState()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getState();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LockNeiDan_28913 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LockNeiDan_28913)PARSER.parseFrom(data);
      }

      public static C2S_LockNeiDan_28913 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LockNeiDan_28913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LockNeiDan_28913 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LockNeiDan_28913)PARSER.parseFrom(data);
      }

      public static C2S_LockNeiDan_28913 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LockNeiDan_28913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LockNeiDan_28913 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LockNeiDan_28913)PARSER.parseFrom(data);
      }

      public static C2S_LockNeiDan_28913 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LockNeiDan_28913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LockNeiDan_28913 parseFrom(InputStream input) throws IOException {
         return (C2S_LockNeiDan_28913)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LockNeiDan_28913 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LockNeiDan_28913)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LockNeiDan_28913 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LockNeiDan_28913)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LockNeiDan_28913 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LockNeiDan_28913)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LockNeiDan_28913 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LockNeiDan_28913)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LockNeiDan_28913 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LockNeiDan_28913)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LockNeiDan_28913 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LockNeiDan_28913 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LockNeiDan_28913> parser() {
         return PARSER;
      }

      public Parser<C2S_LockNeiDan_28913> getParserForType() {
         return PARSER;
      }

      public C2S_LockNeiDan_28913 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LockNeiDan_28913OrBuilder {
         private int bitField0_;
         private DressState resource_;
         private SingleFieldBuilderV3<DressState, DressState.Builder, DressStateOrBuilder> resourceBuilder_;
         private int state_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_LockNeiDan_28913_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_LockNeiDan_28913_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LockNeiDan_28913.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NeiDanMsg.C2S_LockNeiDan_28913.alwaysUseFieldBuilders) {
               this.getResourceFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.resourceBuilder_ == null) {
               this.resource_ = null;
            } else {
               this.resourceBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.state_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_LockNeiDan_28913_descriptor;
         }

         public C2S_LockNeiDan_28913 getDefaultInstanceForType() {
            return NeiDanMsg.C2S_LockNeiDan_28913.getDefaultInstance();
         }

         public C2S_LockNeiDan_28913 build() {
            C2S_LockNeiDan_28913 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LockNeiDan_28913 buildPartial() {
            C2S_LockNeiDan_28913 result = new C2S_LockNeiDan_28913(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.resourceBuilder_ == null) {
                  result.resource_ = this.resource_;
               } else {
                  result.resource_ = (DressState)this.resourceBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.state_ = this.state_;
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
            if (other instanceof C2S_LockNeiDan_28913) {
               return this.mergeFrom((C2S_LockNeiDan_28913)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LockNeiDan_28913 other) {
            if (other == NeiDanMsg.C2S_LockNeiDan_28913.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResource()) {
                  this.mergeResource(other.getResource());
               }

               if (other.hasState()) {
                  this.setState(other.getState());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResource()) {
               return false;
            } else if (!this.hasState()) {
               return false;
            } else {
               return this.getResource().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_LockNeiDan_28913 parsedMessage = null;

            try {
               parsedMessage = (C2S_LockNeiDan_28913)NeiDanMsg.C2S_LockNeiDan_28913.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LockNeiDan_28913)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasResource() {
            return (this.bitField0_ & 1) != 0;
         }

         public DressState getResource() {
            if (this.resourceBuilder_ == null) {
               return this.resource_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.resource_;
            } else {
               return (DressState)this.resourceBuilder_.getMessage();
            }
         }

         public Builder setResource(DressState value) {
            if (this.resourceBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.resource_ = value;
               this.onChanged();
            } else {
               this.resourceBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setResource(DressState.Builder builderForValue) {
            if (this.resourceBuilder_ == null) {
               this.resource_ = builderForValue.build();
               this.onChanged();
            } else {
               this.resourceBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeResource(DressState value) {
            if (this.resourceBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.resource_ != null && this.resource_ != NeiDanMsg.DressState.getDefaultInstance()) {
                  this.resource_ = NeiDanMsg.DressState.newBuilder(this.resource_).mergeFrom(value).buildPartial();
               } else {
                  this.resource_ = value;
               }

               this.onChanged();
            } else {
               this.resourceBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearResource() {
            if (this.resourceBuilder_ == null) {
               this.resource_ = null;
               this.onChanged();
            } else {
               this.resourceBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public DressState.Builder getResourceBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (DressState.Builder)this.getResourceFieldBuilder().getBuilder();
         }

         public DressStateOrBuilder getResourceOrBuilder() {
            if (this.resourceBuilder_ != null) {
               return (DressStateOrBuilder)this.resourceBuilder_.getMessageOrBuilder();
            } else {
               return this.resource_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.resource_;
            }
         }

         private SingleFieldBuilderV3<DressState, DressState.Builder, DressStateOrBuilder> getResourceFieldBuilder() {
            if (this.resourceBuilder_ == null) {
               this.resourceBuilder_ = new SingleFieldBuilderV3(this.getResource(), this.getParentForChildren(), this.isClean());
               this.resource_ = null;
            }

            return this.resourceBuilder_;
         }

         public boolean hasState() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getState() {
            return this.state_;
         }

         public Builder setState(int value) {
            this.bitField0_ |= 2;
            this.state_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearState() {
            this.bitField0_ &= -3;
            this.state_ = 0;
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

   public static final class S2C_LockNeiDan_28914 extends GeneratedMessageV3 implements S2C_LockNeiDan_28914OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESOURCE_FIELD_NUMBER = 1;
      private DressState resource_;
      public static final int STATE_FIELD_NUMBER = 2;
      private int state_;
      private byte memoizedIsInitialized;
      private static final S2C_LockNeiDan_28914 DEFAULT_INSTANCE = new S2C_LockNeiDan_28914();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LockNeiDan_28914> PARSER = new AbstractParser<S2C_LockNeiDan_28914>() {
         public S2C_LockNeiDan_28914 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LockNeiDan_28914(input, extensionRegistry);
         }
      };

      private S2C_LockNeiDan_28914(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LockNeiDan_28914() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LockNeiDan_28914();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LockNeiDan_28914(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        DressState.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.resource_.toBuilder();
                        }

                        this.resource_ = (DressState)input.readMessage(NeiDanMsg.DressState.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.resource_);
                           this.resource_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.state_ = input.readInt32();
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
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_LockNeiDan_28914_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_LockNeiDan_28914_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LockNeiDan_28914.class, Builder.class);
      }

      public boolean hasResource() {
         return (this.bitField0_ & 1) != 0;
      }

      public DressState getResource() {
         return this.resource_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.resource_;
      }

      public DressStateOrBuilder getResourceOrBuilder() {
         return this.resource_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.resource_;
      }

      public boolean hasState() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasResource()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getResource().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getResource());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.state_);
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
               size += CodedOutputStream.computeMessageSize(1, this.getResource());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.state_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LockNeiDan_28914)) {
            return super.equals(obj);
         } else {
            S2C_LockNeiDan_28914 other = (S2C_LockNeiDan_28914)obj;
            if (this.hasResource() != other.hasResource()) {
               return false;
            } else if (this.hasResource() && !this.getResource().equals(other.getResource())) {
               return false;
            } else if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
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
            if (this.hasResource()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResource().hashCode();
            }

            if (this.hasState()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getState();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LockNeiDan_28914 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LockNeiDan_28914)PARSER.parseFrom(data);
      }

      public static S2C_LockNeiDan_28914 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LockNeiDan_28914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LockNeiDan_28914 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LockNeiDan_28914)PARSER.parseFrom(data);
      }

      public static S2C_LockNeiDan_28914 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LockNeiDan_28914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LockNeiDan_28914 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LockNeiDan_28914)PARSER.parseFrom(data);
      }

      public static S2C_LockNeiDan_28914 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LockNeiDan_28914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LockNeiDan_28914 parseFrom(InputStream input) throws IOException {
         return (S2C_LockNeiDan_28914)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LockNeiDan_28914 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LockNeiDan_28914)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LockNeiDan_28914 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LockNeiDan_28914)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LockNeiDan_28914 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LockNeiDan_28914)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LockNeiDan_28914 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LockNeiDan_28914)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LockNeiDan_28914 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LockNeiDan_28914)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LockNeiDan_28914 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LockNeiDan_28914 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LockNeiDan_28914> parser() {
         return PARSER;
      }

      public Parser<S2C_LockNeiDan_28914> getParserForType() {
         return PARSER;
      }

      public S2C_LockNeiDan_28914 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LockNeiDan_28914OrBuilder {
         private int bitField0_;
         private DressState resource_;
         private SingleFieldBuilderV3<DressState, DressState.Builder, DressStateOrBuilder> resourceBuilder_;
         private int state_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_LockNeiDan_28914_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_LockNeiDan_28914_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LockNeiDan_28914.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NeiDanMsg.S2C_LockNeiDan_28914.alwaysUseFieldBuilders) {
               this.getResourceFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.resourceBuilder_ == null) {
               this.resource_ = null;
            } else {
               this.resourceBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.state_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_LockNeiDan_28914_descriptor;
         }

         public S2C_LockNeiDan_28914 getDefaultInstanceForType() {
            return NeiDanMsg.S2C_LockNeiDan_28914.getDefaultInstance();
         }

         public S2C_LockNeiDan_28914 build() {
            S2C_LockNeiDan_28914 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LockNeiDan_28914 buildPartial() {
            S2C_LockNeiDan_28914 result = new S2C_LockNeiDan_28914(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.resourceBuilder_ == null) {
                  result.resource_ = this.resource_;
               } else {
                  result.resource_ = (DressState)this.resourceBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.state_ = this.state_;
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
            if (other instanceof S2C_LockNeiDan_28914) {
               return this.mergeFrom((S2C_LockNeiDan_28914)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LockNeiDan_28914 other) {
            if (other == NeiDanMsg.S2C_LockNeiDan_28914.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResource()) {
                  this.mergeResource(other.getResource());
               }

               if (other.hasState()) {
                  this.setState(other.getState());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResource()) {
               return false;
            } else if (!this.hasState()) {
               return false;
            } else {
               return this.getResource().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LockNeiDan_28914 parsedMessage = null;

            try {
               parsedMessage = (S2C_LockNeiDan_28914)NeiDanMsg.S2C_LockNeiDan_28914.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LockNeiDan_28914)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasResource() {
            return (this.bitField0_ & 1) != 0;
         }

         public DressState getResource() {
            if (this.resourceBuilder_ == null) {
               return this.resource_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.resource_;
            } else {
               return (DressState)this.resourceBuilder_.getMessage();
            }
         }

         public Builder setResource(DressState value) {
            if (this.resourceBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.resource_ = value;
               this.onChanged();
            } else {
               this.resourceBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setResource(DressState.Builder builderForValue) {
            if (this.resourceBuilder_ == null) {
               this.resource_ = builderForValue.build();
               this.onChanged();
            } else {
               this.resourceBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeResource(DressState value) {
            if (this.resourceBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.resource_ != null && this.resource_ != NeiDanMsg.DressState.getDefaultInstance()) {
                  this.resource_ = NeiDanMsg.DressState.newBuilder(this.resource_).mergeFrom(value).buildPartial();
               } else {
                  this.resource_ = value;
               }

               this.onChanged();
            } else {
               this.resourceBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearResource() {
            if (this.resourceBuilder_ == null) {
               this.resource_ = null;
               this.onChanged();
            } else {
               this.resourceBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public DressState.Builder getResourceBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (DressState.Builder)this.getResourceFieldBuilder().getBuilder();
         }

         public DressStateOrBuilder getResourceOrBuilder() {
            if (this.resourceBuilder_ != null) {
               return (DressStateOrBuilder)this.resourceBuilder_.getMessageOrBuilder();
            } else {
               return this.resource_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.resource_;
            }
         }

         private SingleFieldBuilderV3<DressState, DressState.Builder, DressStateOrBuilder> getResourceFieldBuilder() {
            if (this.resourceBuilder_ == null) {
               this.resourceBuilder_ = new SingleFieldBuilderV3(this.getResource(), this.getParentForChildren(), this.isClean());
               this.resource_ = null;
            }

            return this.resourceBuilder_;
         }

         public boolean hasState() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getState() {
            return this.state_;
         }

         public Builder setState(int value) {
            this.bitField0_ |= 2;
            this.state_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearState() {
            this.bitField0_ &= -3;
            this.state_ = 0;
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

   public static final class C2S_LvResetPreview_28915 extends GeneratedMessageV3 implements C2S_LvResetPreview_28915OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SOURCE_FIELD_NUMBER = 1;
      private DressState source_;
      private byte memoizedIsInitialized;
      private static final C2S_LvResetPreview_28915 DEFAULT_INSTANCE = new C2S_LvResetPreview_28915();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LvResetPreview_28915> PARSER = new AbstractParser<C2S_LvResetPreview_28915>() {
         public C2S_LvResetPreview_28915 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LvResetPreview_28915(input, extensionRegistry);
         }
      };

      private C2S_LvResetPreview_28915(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LvResetPreview_28915() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LvResetPreview_28915();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LvResetPreview_28915(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        DressState.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.source_.toBuilder();
                        }

                        this.source_ = (DressState)input.readMessage(NeiDanMsg.DressState.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.source_);
                           this.source_ = subBuilder.buildPartial();
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
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_LvResetPreview_28915_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_LvResetPreview_28915_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LvResetPreview_28915.class, Builder.class);
      }

      public boolean hasSource() {
         return (this.bitField0_ & 1) != 0;
      }

      public DressState getSource() {
         return this.source_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.source_;
      }

      public DressStateOrBuilder getSourceOrBuilder() {
         return this.source_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.source_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSource()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getSource().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getSource());
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
               size += CodedOutputStream.computeMessageSize(1, this.getSource());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LvResetPreview_28915)) {
            return super.equals(obj);
         } else {
            C2S_LvResetPreview_28915 other = (C2S_LvResetPreview_28915)obj;
            if (this.hasSource() != other.hasSource()) {
               return false;
            } else if (this.hasSource() && !this.getSource().equals(other.getSource())) {
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
            if (this.hasSource()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSource().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LvResetPreview_28915 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LvResetPreview_28915)PARSER.parseFrom(data);
      }

      public static C2S_LvResetPreview_28915 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LvResetPreview_28915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LvResetPreview_28915 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LvResetPreview_28915)PARSER.parseFrom(data);
      }

      public static C2S_LvResetPreview_28915 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LvResetPreview_28915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LvResetPreview_28915 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LvResetPreview_28915)PARSER.parseFrom(data);
      }

      public static C2S_LvResetPreview_28915 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LvResetPreview_28915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LvResetPreview_28915 parseFrom(InputStream input) throws IOException {
         return (C2S_LvResetPreview_28915)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LvResetPreview_28915 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LvResetPreview_28915)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LvResetPreview_28915 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LvResetPreview_28915)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LvResetPreview_28915 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LvResetPreview_28915)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LvResetPreview_28915 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LvResetPreview_28915)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LvResetPreview_28915 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LvResetPreview_28915)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LvResetPreview_28915 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LvResetPreview_28915 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LvResetPreview_28915> parser() {
         return PARSER;
      }

      public Parser<C2S_LvResetPreview_28915> getParserForType() {
         return PARSER;
      }

      public C2S_LvResetPreview_28915 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LvResetPreview_28915OrBuilder {
         private int bitField0_;
         private DressState source_;
         private SingleFieldBuilderV3<DressState, DressState.Builder, DressStateOrBuilder> sourceBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_LvResetPreview_28915_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_LvResetPreview_28915_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LvResetPreview_28915.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NeiDanMsg.C2S_LvResetPreview_28915.alwaysUseFieldBuilders) {
               this.getSourceFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.sourceBuilder_ == null) {
               this.source_ = null;
            } else {
               this.sourceBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_C2S_LvResetPreview_28915_descriptor;
         }

         public C2S_LvResetPreview_28915 getDefaultInstanceForType() {
            return NeiDanMsg.C2S_LvResetPreview_28915.getDefaultInstance();
         }

         public C2S_LvResetPreview_28915 build() {
            C2S_LvResetPreview_28915 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LvResetPreview_28915 buildPartial() {
            C2S_LvResetPreview_28915 result = new C2S_LvResetPreview_28915(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.sourceBuilder_ == null) {
                  result.source_ = this.source_;
               } else {
                  result.source_ = (DressState)this.sourceBuilder_.build();
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
            if (other instanceof C2S_LvResetPreview_28915) {
               return this.mergeFrom((C2S_LvResetPreview_28915)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LvResetPreview_28915 other) {
            if (other == NeiDanMsg.C2S_LvResetPreview_28915.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSource()) {
                  this.mergeSource(other.getSource());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSource()) {
               return false;
            } else {
               return this.getSource().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_LvResetPreview_28915 parsedMessage = null;

            try {
               parsedMessage = (C2S_LvResetPreview_28915)NeiDanMsg.C2S_LvResetPreview_28915.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LvResetPreview_28915)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSource() {
            return (this.bitField0_ & 1) != 0;
         }

         public DressState getSource() {
            if (this.sourceBuilder_ == null) {
               return this.source_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.source_;
            } else {
               return (DressState)this.sourceBuilder_.getMessage();
            }
         }

         public Builder setSource(DressState value) {
            if (this.sourceBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.source_ = value;
               this.onChanged();
            } else {
               this.sourceBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setSource(DressState.Builder builderForValue) {
            if (this.sourceBuilder_ == null) {
               this.source_ = builderForValue.build();
               this.onChanged();
            } else {
               this.sourceBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeSource(DressState value) {
            if (this.sourceBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.source_ != null && this.source_ != NeiDanMsg.DressState.getDefaultInstance()) {
                  this.source_ = NeiDanMsg.DressState.newBuilder(this.source_).mergeFrom(value).buildPartial();
               } else {
                  this.source_ = value;
               }

               this.onChanged();
            } else {
               this.sourceBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearSource() {
            if (this.sourceBuilder_ == null) {
               this.source_ = null;
               this.onChanged();
            } else {
               this.sourceBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public DressState.Builder getSourceBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (DressState.Builder)this.getSourceFieldBuilder().getBuilder();
         }

         public DressStateOrBuilder getSourceOrBuilder() {
            if (this.sourceBuilder_ != null) {
               return (DressStateOrBuilder)this.sourceBuilder_.getMessageOrBuilder();
            } else {
               return this.source_ == null ? NeiDanMsg.DressState.getDefaultInstance() : this.source_;
            }
         }

         private SingleFieldBuilderV3<DressState, DressState.Builder, DressStateOrBuilder> getSourceFieldBuilder() {
            if (this.sourceBuilder_ == null) {
               this.sourceBuilder_ = new SingleFieldBuilderV3(this.getSource(), this.getParentForChildren(), this.isClean());
               this.source_ = null;
            }

            return this.sourceBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_LvResetPreview_28916 extends GeneratedMessageV3 implements S2C_LvResetPreview_28916OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RETURNREWARD_FIELD_NUMBER = 1;
      private List<CommonMsg.ItemInfo> returnReward_;
      private byte memoizedIsInitialized;
      private static final S2C_LvResetPreview_28916 DEFAULT_INSTANCE = new S2C_LvResetPreview_28916();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LvResetPreview_28916> PARSER = new AbstractParser<S2C_LvResetPreview_28916>() {
         public S2C_LvResetPreview_28916 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LvResetPreview_28916(input, extensionRegistry);
         }
      };

      private S2C_LvResetPreview_28916(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LvResetPreview_28916() {
         this.memoizedIsInitialized = -1;
         this.returnReward_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LvResetPreview_28916();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LvResetPreview_28916(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.returnReward_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.returnReward_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
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
                  this.returnReward_ = Collections.unmodifiableList(this.returnReward_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_LvResetPreview_28916_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_LvResetPreview_28916_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LvResetPreview_28916.class, Builder.class);
      }

      public List<CommonMsg.ItemInfo> getReturnRewardList() {
         return this.returnReward_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getReturnRewardOrBuilderList() {
         return this.returnReward_;
      }

      public int getReturnRewardCount() {
         return this.returnReward_.size();
      }

      public CommonMsg.ItemInfo getReturnReward(int index) {
         return (CommonMsg.ItemInfo)this.returnReward_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getReturnRewardOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.returnReward_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getReturnRewardCount(); ++i) {
               if (!this.getReturnReward(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.returnReward_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.returnReward_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.returnReward_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.returnReward_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LvResetPreview_28916)) {
            return super.equals(obj);
         } else {
            S2C_LvResetPreview_28916 other = (S2C_LvResetPreview_28916)obj;
            if (!this.getReturnRewardList().equals(other.getReturnRewardList())) {
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
            if (this.getReturnRewardCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getReturnRewardList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LvResetPreview_28916 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LvResetPreview_28916)PARSER.parseFrom(data);
      }

      public static S2C_LvResetPreview_28916 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LvResetPreview_28916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LvResetPreview_28916 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LvResetPreview_28916)PARSER.parseFrom(data);
      }

      public static S2C_LvResetPreview_28916 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LvResetPreview_28916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LvResetPreview_28916 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LvResetPreview_28916)PARSER.parseFrom(data);
      }

      public static S2C_LvResetPreview_28916 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LvResetPreview_28916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LvResetPreview_28916 parseFrom(InputStream input) throws IOException {
         return (S2C_LvResetPreview_28916)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LvResetPreview_28916 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LvResetPreview_28916)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LvResetPreview_28916 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LvResetPreview_28916)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LvResetPreview_28916 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LvResetPreview_28916)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LvResetPreview_28916 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LvResetPreview_28916)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LvResetPreview_28916 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LvResetPreview_28916)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LvResetPreview_28916 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LvResetPreview_28916 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LvResetPreview_28916> parser() {
         return PARSER;
      }

      public Parser<S2C_LvResetPreview_28916> getParserForType() {
         return PARSER;
      }

      public S2C_LvResetPreview_28916 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LvResetPreview_28916OrBuilder {
         private int bitField0_;
         private List<CommonMsg.ItemInfo> returnReward_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> returnRewardBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_LvResetPreview_28916_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_LvResetPreview_28916_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LvResetPreview_28916.class, Builder.class);
         }

         private Builder() {
            this.returnReward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.returnReward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (NeiDanMsg.S2C_LvResetPreview_28916.alwaysUseFieldBuilders) {
               this.getReturnRewardFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.returnRewardBuilder_ == null) {
               this.returnReward_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.returnRewardBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return NeiDanMsg.internal_static_neiDan_com_gzbz_protobuf_S2C_LvResetPreview_28916_descriptor;
         }

         public S2C_LvResetPreview_28916 getDefaultInstanceForType() {
            return NeiDanMsg.S2C_LvResetPreview_28916.getDefaultInstance();
         }

         public S2C_LvResetPreview_28916 build() {
            S2C_LvResetPreview_28916 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LvResetPreview_28916 buildPartial() {
            S2C_LvResetPreview_28916 result = new S2C_LvResetPreview_28916(this);
            int from_bitField0_ = this.bitField0_;
            if (this.returnRewardBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.returnReward_ = Collections.unmodifiableList(this.returnReward_);
                  this.bitField0_ &= -2;
               }

               result.returnReward_ = this.returnReward_;
            } else {
               result.returnReward_ = this.returnRewardBuilder_.build();
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
            if (other instanceof S2C_LvResetPreview_28916) {
               return this.mergeFrom((S2C_LvResetPreview_28916)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LvResetPreview_28916 other) {
            if (other == NeiDanMsg.S2C_LvResetPreview_28916.getDefaultInstance()) {
               return this;
            } else {
               if (this.returnRewardBuilder_ == null) {
                  if (!other.returnReward_.isEmpty()) {
                     if (this.returnReward_.isEmpty()) {
                        this.returnReward_ = other.returnReward_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureReturnRewardIsMutable();
                        this.returnReward_.addAll(other.returnReward_);
                     }

                     this.onChanged();
                  }
               } else if (!other.returnReward_.isEmpty()) {
                  if (this.returnRewardBuilder_.isEmpty()) {
                     this.returnRewardBuilder_.dispose();
                     this.returnRewardBuilder_ = null;
                     this.returnReward_ = other.returnReward_;
                     this.bitField0_ &= -2;
                     this.returnRewardBuilder_ = NeiDanMsg.S2C_LvResetPreview_28916.alwaysUseFieldBuilders ? this.getReturnRewardFieldBuilder() : null;
                  } else {
                     this.returnRewardBuilder_.addAllMessages(other.returnReward_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getReturnRewardCount(); ++i) {
               if (!this.getReturnReward(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LvResetPreview_28916 parsedMessage = null;

            try {
               parsedMessage = (S2C_LvResetPreview_28916)NeiDanMsg.S2C_LvResetPreview_28916.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LvResetPreview_28916)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureReturnRewardIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.returnReward_ = new ArrayList(this.returnReward_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.ItemInfo> getReturnRewardList() {
            return this.returnRewardBuilder_ == null ? Collections.unmodifiableList(this.returnReward_) : this.returnRewardBuilder_.getMessageList();
         }

         public int getReturnRewardCount() {
            return this.returnRewardBuilder_ == null ? this.returnReward_.size() : this.returnRewardBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getReturnReward(int index) {
            return this.returnRewardBuilder_ == null ? (CommonMsg.ItemInfo)this.returnReward_.get(index) : (CommonMsg.ItemInfo)this.returnRewardBuilder_.getMessage(index);
         }

         public Builder setReturnReward(int index, CommonMsg.ItemInfo value) {
            if (this.returnRewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureReturnRewardIsMutable();
               this.returnReward_.set(index, value);
               this.onChanged();
            } else {
               this.returnRewardBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setReturnReward(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.returnRewardBuilder_ == null) {
               this.ensureReturnRewardIsMutable();
               this.returnReward_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.returnRewardBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addReturnReward(CommonMsg.ItemInfo value) {
            if (this.returnRewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureReturnRewardIsMutable();
               this.returnReward_.add(value);
               this.onChanged();
            } else {
               this.returnRewardBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addReturnReward(int index, CommonMsg.ItemInfo value) {
            if (this.returnRewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureReturnRewardIsMutable();
               this.returnReward_.add(index, value);
               this.onChanged();
            } else {
               this.returnRewardBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addReturnReward(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.returnRewardBuilder_ == null) {
               this.ensureReturnRewardIsMutable();
               this.returnReward_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.returnRewardBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addReturnReward(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.returnRewardBuilder_ == null) {
               this.ensureReturnRewardIsMutable();
               this.returnReward_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.returnRewardBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllReturnReward(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.returnRewardBuilder_ == null) {
               this.ensureReturnRewardIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.returnReward_);
               this.onChanged();
            } else {
               this.returnRewardBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearReturnReward() {
            if (this.returnRewardBuilder_ == null) {
               this.returnReward_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.returnRewardBuilder_.clear();
            }

            return this;
         }

         public Builder removeReturnReward(int index) {
            if (this.returnRewardBuilder_ == null) {
               this.ensureReturnRewardIsMutable();
               this.returnReward_.remove(index);
               this.onChanged();
            } else {
               this.returnRewardBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getReturnRewardBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getReturnRewardFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getReturnRewardOrBuilder(int index) {
            return this.returnRewardBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.returnReward_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.returnRewardBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getReturnRewardOrBuilderList() {
            return this.returnRewardBuilder_ != null ? this.returnRewardBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.returnReward_);
         }

         public CommonMsg.ItemInfo.Builder addReturnRewardBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getReturnRewardFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addReturnRewardBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getReturnRewardFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getReturnRewardBuilderList() {
            return this.getReturnRewardFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getReturnRewardFieldBuilder() {
            if (this.returnRewardBuilder_ == null) {
               this.returnRewardBuilder_ = new RepeatedFieldBuilderV3(this.returnReward_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.returnReward_ = null;
            }

            return this.returnRewardBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_LockNeiDan_28913OrBuilder extends MessageOrBuilder {
      boolean hasResource();

      DressState getResource();

      DressStateOrBuilder getResourceOrBuilder();

      boolean hasState();

      int getState();
   }

   public interface C2S_LvResetPreview_28915OrBuilder extends MessageOrBuilder {
      boolean hasSource();

      DressState getSource();

      DressStateOrBuilder getSourceOrBuilder();
   }

   public interface C2S_NeiDanCompound_28907OrBuilder extends MessageOrBuilder {
      boolean hasComType();

      int getComType();

      List<Integer> getRecNeiDanItemCodeList();

      int getRecNeiDanItemCodeCount();

      int getRecNeiDanItemCode(int index);
   }

   public interface C2S_NeiDanDress_28909OrBuilder extends MessageOrBuilder {
      boolean hasResource();

      DressState getResource();

      DressStateOrBuilder getResourceOrBuilder();

      boolean hasTarget();

      DressState getTarget();

      DressStateOrBuilder getTargetOrBuilder();
   }

   public interface C2S_NeiDanHatch_28901OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_NeiDanLvReset_28905OrBuilder extends MessageOrBuilder {
      boolean hasSource();

      DressState getSource();

      DressStateOrBuilder getSourceOrBuilder();
   }

   public interface C2S_NeiDanLvUp_28903OrBuilder extends MessageOrBuilder {
      boolean hasSource();

      DressState getSource();

      DressStateOrBuilder getSourceOrBuilder();

      List<CommonMsg.MapDataII> getCostItemList();

      CommonMsg.MapDataII getCostItem(int index);

      int getCostItemCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getCostItemOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getCostItemOrBuilder(int index);

      List<Integer> getCostNeiDanCodeList();

      int getCostNeiDanCodeCount();

      int getCostNeiDanCode(int index);
   }

   public interface C2S_UndressNeiDan_28911OrBuilder extends MessageOrBuilder {
      boolean hasResource();

      DressState getResource();

      DressStateOrBuilder getResourceOrBuilder();
   }

   public interface DressStateOrBuilder extends MessageOrBuilder {
      boolean hasState();

      int getState();

      boolean hasCode();

      int getCode();

      boolean hasPos();

      int getPos();
   }

   public interface S2C_LockNeiDan_28914OrBuilder extends MessageOrBuilder {
      boolean hasResource();

      DressState getResource();

      DressStateOrBuilder getResourceOrBuilder();

      boolean hasState();

      int getState();
   }

   public interface S2C_LvResetPreview_28916OrBuilder extends MessageOrBuilder {
      List<CommonMsg.ItemInfo> getReturnRewardList();

      CommonMsg.ItemInfo getReturnReward(int index);

      int getReturnRewardCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getReturnRewardOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getReturnRewardOrBuilder(int index);
   }

   public interface S2C_NeiDanCompound_28908OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_NeiDanDress_28910OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_NeiDanHatch_28902OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_NeiDanLvReset_28906OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_NeiDanLvUp_28904OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_UndressNeiDan_28912OrBuilder extends MessageOrBuilder {
   }
}
