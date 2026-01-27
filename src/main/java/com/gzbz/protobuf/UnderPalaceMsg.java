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

public final class UnderPalaceMsg {
   private static final Descriptors.Descriptor internal_static_underPalace_com_gzbz_protobuf_C2S_UnderPalaceInfo_5701_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_underPalace_com_gzbz_protobuf_C2S_UnderPalaceInfo_5701_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_underPalace_com_gzbz_protobuf_S2C_UnderPalaceInfo_5702_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_underPalace_com_gzbz_protobuf_S2C_UnderPalaceInfo_5702_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_underPalace_com_gzbz_protobuf_PalaceInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_underPalace_com_gzbz_protobuf_PalaceInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_underPalace_com_gzbz_protobuf_C2S_ReceiveCommonAward_5703_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_underPalace_com_gzbz_protobuf_C2S_ReceiveCommonAward_5703_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_underPalace_com_gzbz_protobuf_S2C_ReceiveCommonAward_5704_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_underPalace_com_gzbz_protobuf_S2C_ReceiveCommonAward_5704_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_underPalace_com_gzbz_protobuf_C2S_ReceiveExtraAward_5705_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_underPalace_com_gzbz_protobuf_C2S_ReceiveExtraAward_5705_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_underPalace_com_gzbz_protobuf_S2C_ReceiveExtraAward_5706_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_underPalace_com_gzbz_protobuf_S2C_ReceiveExtraAward_5706_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_underPalace_com_gzbz_protobuf_C2S_RefreshBuff_5707_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_underPalace_com_gzbz_protobuf_C2S_RefreshBuff_5707_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_underPalace_com_gzbz_protobuf_S2C_RefreshBuff_5708_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_underPalace_com_gzbz_protobuf_S2C_RefreshBuff_5708_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_underPalace_com_gzbz_protobuf_S2C_BattleEnd_5709_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_underPalace_com_gzbz_protobuf_S2C_BattleEnd_5709_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_underPalace_com_gzbz_protobuf_C2S_SweepStage_5710_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_underPalace_com_gzbz_protobuf_C2S_SweepStage_5710_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_underPalace_com_gzbz_protobuf_S2C_SweepStage_5711_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_underPalace_com_gzbz_protobuf_S2C_SweepStage_5711_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_underPalace_com_gzbz_protobuf_C2S_RecZiWeiAward_5712_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_underPalace_com_gzbz_protobuf_C2S_RecZiWeiAward_5712_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_underPalace_com_gzbz_protobuf_S2C_RecZiWeiAward_5713_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_underPalace_com_gzbz_protobuf_S2C_RecZiWeiAward_5713_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private UnderPalaceMsg() {
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
      String[] descriptorData = new String[]{"\n\u0011UnderPalace.proto\u0012\u001dunderPalace.com.gzbz.protobuf\"\u001a\n\u0018C2S_UnderPalaceInfo_5701\"¸\u0001\n\u0018S2C_UnderPalaceInfo_5702\u00127\n\u0004info\u0018\u0001 \u0003(\u000b2).underPalace.com.gzbz.protobuf.PalaceInfo\u0012\u000f\n\u0007passSum\u0018\u0002 \u0002(\u0005\u0012\u0014\n\freceiveExtra\u0018\u0003 \u0003(\u0005\u0012\u0013\n\u000bcommonAward\u0018\u0004 \u0003(\u0005\u0012\u0010\n\bsweepNum\u0018\u0005 \u0001(\u0005\u0012\u0015\n\rrecZiWeiAward\u0018\u0006 \u0003(\u0005\"R\n\nPalaceInfo\u0012\u0011\n\tstageType\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007stageId\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005buffs\u0018\u0004 \u0003(\u0005\u0012\u0011\n\tpassState\u0018\u0005 \u0002(\u0005\"/\n\u001bC2S_ReceiveCommonAward_5703\u0012\u0010\n\bstageSum\u0018\u0002 \u0002(\u0005\"U\n\u001bS2C_ReceiveCommonAward_5704\u0012\u0010\n\bstageSum\u0018\u0002 \u0002(\u0005\u0012\u0014\n\freceiveAward\u0018\u0003 \u0003(\u0005\u0012\u000e\n\u0006result\u0018\u0004 \u0002(\u0005\".\n\u001aC2S_ReceiveExtraAward_5705\u0012\u0010\n\bstageSum\u0018\u0001 \u0002(\u0005\"T\n\u001aS2C_ReceiveExtraAward_5706\u0012\u0010\n\bstageSum\u0018\u0001 \u0002(\u0005\u0012\u0014\n\freceiveExtra\u0018\u0003 \u0003(\u0005\u0012\u000e\n\u0006result\u0018\u0002 \u0002(\u0005\":\n\u0014C2S_RefreshBuff_5707\u0012\u0011\n\tstageType\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007stageId\u0018\u0002 \u0002(\u0005\"I\n\u0014S2C_RefreshBuff_5708\u0012\u0011\n\tstageType\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007stageId\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005buffs\u0018\u0003 \u0003(\u0005\"Z\n\u0012S2C_BattleEnd_5709\u0012\u0011\n\tstageType\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007stageId\u0018\u0002 \u0002(\u0005\u0012\u0011\n\tpassState\u0018\u0005 \u0002(\u0005\u0012\r\n\u0005buffs\u0018\u0003 \u0003(\u0005\"&\n\u0013C2S_SweepStage_5710\u0012\u000f\n\u0007stageId\u0018\u0001 \u0002(\u0005\"8\n\u0013S2C_SweepStage_5711\u0012\u000f\n\u0007stageId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bsweepNum\u0018\u0002 \u0002(\u0005\"*\n\u0016C2S_RecZiWeiAward_5712\u0012\u0010\n\bstageSum\u0018\u0001 \u0002(\u0005\"Q\n\u0016S2C_RecZiWeiAward_5713\u0012\u0010\n\bstageSum\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rrecZiWeiAward\u0018\u0003 \u0003(\u0005\u0012\u000e\n\u0006result\u0018\u0002 \u0002(\u0005B%\n\u0011com.gzbz.protobufB\u000eUnderPalaceMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_underPalace_com_gzbz_protobuf_C2S_UnderPalaceInfo_5701_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_underPalace_com_gzbz_protobuf_C2S_UnderPalaceInfo_5701_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_underPalace_com_gzbz_protobuf_C2S_UnderPalaceInfo_5701_descriptor, new String[0]);
      internal_static_underPalace_com_gzbz_protobuf_S2C_UnderPalaceInfo_5702_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_underPalace_com_gzbz_protobuf_S2C_UnderPalaceInfo_5702_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_underPalace_com_gzbz_protobuf_S2C_UnderPalaceInfo_5702_descriptor, new String[]{"Info", "PassSum", "ReceiveExtra", "CommonAward", "SweepNum", "RecZiWeiAward"});
      internal_static_underPalace_com_gzbz_protobuf_PalaceInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_underPalace_com_gzbz_protobuf_PalaceInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_underPalace_com_gzbz_protobuf_PalaceInfo_descriptor, new String[]{"StageType", "StageId", "Buffs", "PassState"});
      internal_static_underPalace_com_gzbz_protobuf_C2S_ReceiveCommonAward_5703_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_underPalace_com_gzbz_protobuf_C2S_ReceiveCommonAward_5703_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_underPalace_com_gzbz_protobuf_C2S_ReceiveCommonAward_5703_descriptor, new String[]{"StageSum"});
      internal_static_underPalace_com_gzbz_protobuf_S2C_ReceiveCommonAward_5704_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_underPalace_com_gzbz_protobuf_S2C_ReceiveCommonAward_5704_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_underPalace_com_gzbz_protobuf_S2C_ReceiveCommonAward_5704_descriptor, new String[]{"StageSum", "ReceiveAward", "Result"});
      internal_static_underPalace_com_gzbz_protobuf_C2S_ReceiveExtraAward_5705_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_underPalace_com_gzbz_protobuf_C2S_ReceiveExtraAward_5705_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_underPalace_com_gzbz_protobuf_C2S_ReceiveExtraAward_5705_descriptor, new String[]{"StageSum"});
      internal_static_underPalace_com_gzbz_protobuf_S2C_ReceiveExtraAward_5706_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_underPalace_com_gzbz_protobuf_S2C_ReceiveExtraAward_5706_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_underPalace_com_gzbz_protobuf_S2C_ReceiveExtraAward_5706_descriptor, new String[]{"StageSum", "ReceiveExtra", "Result"});
      internal_static_underPalace_com_gzbz_protobuf_C2S_RefreshBuff_5707_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_underPalace_com_gzbz_protobuf_C2S_RefreshBuff_5707_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_underPalace_com_gzbz_protobuf_C2S_RefreshBuff_5707_descriptor, new String[]{"StageType", "StageId"});
      internal_static_underPalace_com_gzbz_protobuf_S2C_RefreshBuff_5708_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_underPalace_com_gzbz_protobuf_S2C_RefreshBuff_5708_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_underPalace_com_gzbz_protobuf_S2C_RefreshBuff_5708_descriptor, new String[]{"StageType", "StageId", "Buffs"});
      internal_static_underPalace_com_gzbz_protobuf_S2C_BattleEnd_5709_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_underPalace_com_gzbz_protobuf_S2C_BattleEnd_5709_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_underPalace_com_gzbz_protobuf_S2C_BattleEnd_5709_descriptor, new String[]{"StageType", "StageId", "PassState", "Buffs"});
      internal_static_underPalace_com_gzbz_protobuf_C2S_SweepStage_5710_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_underPalace_com_gzbz_protobuf_C2S_SweepStage_5710_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_underPalace_com_gzbz_protobuf_C2S_SweepStage_5710_descriptor, new String[]{"StageId"});
      internal_static_underPalace_com_gzbz_protobuf_S2C_SweepStage_5711_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_underPalace_com_gzbz_protobuf_S2C_SweepStage_5711_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_underPalace_com_gzbz_protobuf_S2C_SweepStage_5711_descriptor, new String[]{"StageId", "SweepNum"});
      internal_static_underPalace_com_gzbz_protobuf_C2S_RecZiWeiAward_5712_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_underPalace_com_gzbz_protobuf_C2S_RecZiWeiAward_5712_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_underPalace_com_gzbz_protobuf_C2S_RecZiWeiAward_5712_descriptor, new String[]{"StageSum"});
      internal_static_underPalace_com_gzbz_protobuf_S2C_RecZiWeiAward_5713_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_underPalace_com_gzbz_protobuf_S2C_RecZiWeiAward_5713_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_underPalace_com_gzbz_protobuf_S2C_RecZiWeiAward_5713_descriptor, new String[]{"StageSum", "RecZiWeiAward", "Result"});
   }

   public static final class C2S_UnderPalaceInfo_5701 extends GeneratedMessageV3 implements C2S_UnderPalaceInfo_5701OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_UnderPalaceInfo_5701 DEFAULT_INSTANCE = new C2S_UnderPalaceInfo_5701();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UnderPalaceInfo_5701> PARSER = new AbstractParser<C2S_UnderPalaceInfo_5701>() {
         public C2S_UnderPalaceInfo_5701 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UnderPalaceInfo_5701(input, extensionRegistry);
         }
      };

      private C2S_UnderPalaceInfo_5701(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UnderPalaceInfo_5701() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UnderPalaceInfo_5701();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UnderPalaceInfo_5701(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_UnderPalaceInfo_5701_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_UnderPalaceInfo_5701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnderPalaceInfo_5701.class, Builder.class);
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
         } else if (!(obj instanceof C2S_UnderPalaceInfo_5701)) {
            return super.equals(obj);
         } else {
            C2S_UnderPalaceInfo_5701 other = (C2S_UnderPalaceInfo_5701)obj;
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

      public static C2S_UnderPalaceInfo_5701 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UnderPalaceInfo_5701)PARSER.parseFrom(data);
      }

      public static C2S_UnderPalaceInfo_5701 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnderPalaceInfo_5701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnderPalaceInfo_5701 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UnderPalaceInfo_5701)PARSER.parseFrom(data);
      }

      public static C2S_UnderPalaceInfo_5701 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnderPalaceInfo_5701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnderPalaceInfo_5701 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UnderPalaceInfo_5701)PARSER.parseFrom(data);
      }

      public static C2S_UnderPalaceInfo_5701 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnderPalaceInfo_5701)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnderPalaceInfo_5701 parseFrom(InputStream input) throws IOException {
         return (C2S_UnderPalaceInfo_5701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnderPalaceInfo_5701 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnderPalaceInfo_5701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnderPalaceInfo_5701 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UnderPalaceInfo_5701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UnderPalaceInfo_5701 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnderPalaceInfo_5701)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnderPalaceInfo_5701 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UnderPalaceInfo_5701)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnderPalaceInfo_5701 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnderPalaceInfo_5701)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UnderPalaceInfo_5701 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UnderPalaceInfo_5701 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UnderPalaceInfo_5701> parser() {
         return PARSER;
      }

      public Parser<C2S_UnderPalaceInfo_5701> getParserForType() {
         return PARSER;
      }

      public C2S_UnderPalaceInfo_5701 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UnderPalaceInfo_5701OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_UnderPalaceInfo_5701_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_UnderPalaceInfo_5701_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnderPalaceInfo_5701.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnderPalaceMsg.C2S_UnderPalaceInfo_5701.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_UnderPalaceInfo_5701_descriptor;
         }

         public C2S_UnderPalaceInfo_5701 getDefaultInstanceForType() {
            return UnderPalaceMsg.C2S_UnderPalaceInfo_5701.getDefaultInstance();
         }

         public C2S_UnderPalaceInfo_5701 build() {
            C2S_UnderPalaceInfo_5701 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UnderPalaceInfo_5701 buildPartial() {
            C2S_UnderPalaceInfo_5701 result = new C2S_UnderPalaceInfo_5701(this);
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
            if (other instanceof C2S_UnderPalaceInfo_5701) {
               return this.mergeFrom((C2S_UnderPalaceInfo_5701)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UnderPalaceInfo_5701 other) {
            if (other == UnderPalaceMsg.C2S_UnderPalaceInfo_5701.getDefaultInstance()) {
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
            C2S_UnderPalaceInfo_5701 parsedMessage = null;

            try {
               parsedMessage = (C2S_UnderPalaceInfo_5701)UnderPalaceMsg.C2S_UnderPalaceInfo_5701.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UnderPalaceInfo_5701)e.getUnfinishedMessage();
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

   public static final class S2C_UnderPalaceInfo_5702 extends GeneratedMessageV3 implements S2C_UnderPalaceInfo_5702OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private List<PalaceInfo> info_;
      public static final int PASSSUM_FIELD_NUMBER = 2;
      private int passSum_;
      public static final int RECEIVEEXTRA_FIELD_NUMBER = 3;
      private Internal.IntList receiveExtra_;
      public static final int COMMONAWARD_FIELD_NUMBER = 4;
      private Internal.IntList commonAward_;
      public static final int SWEEPNUM_FIELD_NUMBER = 5;
      private int sweepNum_;
      public static final int RECZIWEIAWARD_FIELD_NUMBER = 6;
      private Internal.IntList recZiWeiAward_;
      private byte memoizedIsInitialized;
      private static final S2C_UnderPalaceInfo_5702 DEFAULT_INSTANCE = new S2C_UnderPalaceInfo_5702();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UnderPalaceInfo_5702> PARSER = new AbstractParser<S2C_UnderPalaceInfo_5702>() {
         public S2C_UnderPalaceInfo_5702 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UnderPalaceInfo_5702(input, extensionRegistry);
         }
      };

      private S2C_UnderPalaceInfo_5702(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UnderPalaceInfo_5702() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
         this.receiveExtra_ = emptyIntList();
         this.commonAward_ = emptyIntList();
         this.recZiWeiAward_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UnderPalaceInfo_5702();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UnderPalaceInfo_5702(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 10:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.info_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.info_.add(input.readMessage(UnderPalaceMsg.PalaceInfo.PARSER, extensionRegistry));
                        continue;
                     case 16:
                        this.bitField0_ |= 1;
                        this.passSum_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.receiveExtra_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.receiveExtra_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.receiveExtra_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.commonAward_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.commonAward_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.commonAward_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.commonAward_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 40:
                        this.bitField0_ |= 2;
                        this.sweepNum_ = input.readInt32();
                        continue;
                     case 48:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.recZiWeiAward_ = newIntList();
                           mutable_bitField0_ |= 32;
                        }

                        this.recZiWeiAward_.addInt(input.readInt32());
                        continue;
                     case 50:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 32) == 0 && input.getBytesUntilLimit() > 0) {
                           this.recZiWeiAward_ = newIntList();
                           mutable_bitField0_ |= 32;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.recZiWeiAward_.addInt(input.readInt32());
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
                     this.receiveExtra_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.info_ = Collections.unmodifiableList(this.info_);
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.receiveExtra_.makeImmutable();
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.commonAward_.makeImmutable();
               }

               if ((mutable_bitField0_ & 32) != 0) {
                  this.recZiWeiAward_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_UnderPalaceInfo_5702_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_UnderPalaceInfo_5702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnderPalaceInfo_5702.class, Builder.class);
      }

      public List<PalaceInfo> getInfoList() {
         return this.info_;
      }

      public List<? extends PalaceInfoOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public PalaceInfo getInfo(int index) {
         return (PalaceInfo)this.info_.get(index);
      }

      public PalaceInfoOrBuilder getInfoOrBuilder(int index) {
         return (PalaceInfoOrBuilder)this.info_.get(index);
      }

      public boolean hasPassSum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPassSum() {
         return this.passSum_;
      }

      public List<Integer> getReceiveExtraList() {
         return this.receiveExtra_;
      }

      public int getReceiveExtraCount() {
         return this.receiveExtra_.size();
      }

      public int getReceiveExtra(int index) {
         return this.receiveExtra_.getInt(index);
      }

      public List<Integer> getCommonAwardList() {
         return this.commonAward_;
      }

      public int getCommonAwardCount() {
         return this.commonAward_.size();
      }

      public int getCommonAward(int index) {
         return this.commonAward_.getInt(index);
      }

      public boolean hasSweepNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSweepNum() {
         return this.sweepNum_;
      }

      public List<Integer> getRecZiWeiAwardList() {
         return this.recZiWeiAward_;
      }

      public int getRecZiWeiAwardCount() {
         return this.recZiWeiAward_.size();
      }

      public int getRecZiWeiAward(int index) {
         return this.recZiWeiAward_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPassSum()) {
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
         for(int i = 0; i < this.info_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.info_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.passSum_);
         }

         for(int i = 0; i < this.receiveExtra_.size(); ++i) {
            output.writeInt32(3, this.receiveExtra_.getInt(i));
         }

         for(int i = 0; i < this.commonAward_.size(); ++i) {
            output.writeInt32(4, this.commonAward_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(5, this.sweepNum_);
         }

         for(int i = 0; i < this.recZiWeiAward_.size(); ++i) {
            output.writeInt32(6, this.recZiWeiAward_.getInt(i));
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

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.passSum_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.receiveExtra_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.receiveExtra_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getReceiveExtraList().size();
            dataSize = 0;

            for(int i = 0; i < this.commonAward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.commonAward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCommonAwardList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.sweepNum_);
            }

            dataSize = 0;

            for(int i = 0; i < this.recZiWeiAward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.recZiWeiAward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRecZiWeiAwardList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UnderPalaceInfo_5702)) {
            return super.equals(obj);
         } else {
            S2C_UnderPalaceInfo_5702 other = (S2C_UnderPalaceInfo_5702)obj;
            if (!this.getInfoList().equals(other.getInfoList())) {
               return false;
            } else if (this.hasPassSum() != other.hasPassSum()) {
               return false;
            } else if (this.hasPassSum() && this.getPassSum() != other.getPassSum()) {
               return false;
            } else if (!this.getReceiveExtraList().equals(other.getReceiveExtraList())) {
               return false;
            } else if (!this.getCommonAwardList().equals(other.getCommonAwardList())) {
               return false;
            } else if (this.hasSweepNum() != other.hasSweepNum()) {
               return false;
            } else if (this.hasSweepNum() && this.getSweepNum() != other.getSweepNum()) {
               return false;
            } else if (!this.getRecZiWeiAwardList().equals(other.getRecZiWeiAwardList())) {
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

            if (this.hasPassSum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPassSum();
            }

            if (this.getReceiveExtraCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getReceiveExtraList().hashCode();
            }

            if (this.getCommonAwardCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getCommonAwardList().hashCode();
            }

            if (this.hasSweepNum()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getSweepNum();
            }

            if (this.getRecZiWeiAwardCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getRecZiWeiAwardList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UnderPalaceInfo_5702 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UnderPalaceInfo_5702)PARSER.parseFrom(data);
      }

      public static S2C_UnderPalaceInfo_5702 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnderPalaceInfo_5702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnderPalaceInfo_5702 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UnderPalaceInfo_5702)PARSER.parseFrom(data);
      }

      public static S2C_UnderPalaceInfo_5702 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnderPalaceInfo_5702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnderPalaceInfo_5702 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UnderPalaceInfo_5702)PARSER.parseFrom(data);
      }

      public static S2C_UnderPalaceInfo_5702 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnderPalaceInfo_5702)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnderPalaceInfo_5702 parseFrom(InputStream input) throws IOException {
         return (S2C_UnderPalaceInfo_5702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnderPalaceInfo_5702 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnderPalaceInfo_5702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnderPalaceInfo_5702 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UnderPalaceInfo_5702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UnderPalaceInfo_5702 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnderPalaceInfo_5702)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnderPalaceInfo_5702 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UnderPalaceInfo_5702)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnderPalaceInfo_5702 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnderPalaceInfo_5702)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UnderPalaceInfo_5702 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UnderPalaceInfo_5702 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UnderPalaceInfo_5702> parser() {
         return PARSER;
      }

      public Parser<S2C_UnderPalaceInfo_5702> getParserForType() {
         return PARSER;
      }

      public S2C_UnderPalaceInfo_5702 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UnderPalaceInfo_5702OrBuilder {
         private int bitField0_;
         private List<PalaceInfo> info_;
         private RepeatedFieldBuilderV3<PalaceInfo, PalaceInfo.Builder, PalaceInfoOrBuilder> infoBuilder_;
         private int passSum_;
         private Internal.IntList receiveExtra_;
         private Internal.IntList commonAward_;
         private int sweepNum_;
         private Internal.IntList recZiWeiAward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_UnderPalaceInfo_5702_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_UnderPalaceInfo_5702_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnderPalaceInfo_5702.class, Builder.class);
         }

         private Builder() {
            this.info_ = Collections.emptyList();
            this.receiveExtra_ = UnderPalaceMsg.S2C_UnderPalaceInfo_5702.emptyIntList();
            this.commonAward_ = UnderPalaceMsg.S2C_UnderPalaceInfo_5702.emptyIntList();
            this.recZiWeiAward_ = UnderPalaceMsg.S2C_UnderPalaceInfo_5702.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.info_ = Collections.emptyList();
            this.receiveExtra_ = UnderPalaceMsg.S2C_UnderPalaceInfo_5702.emptyIntList();
            this.commonAward_ = UnderPalaceMsg.S2C_UnderPalaceInfo_5702.emptyIntList();
            this.recZiWeiAward_ = UnderPalaceMsg.S2C_UnderPalaceInfo_5702.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnderPalaceMsg.S2C_UnderPalaceInfo_5702.alwaysUseFieldBuilders) {
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

            this.passSum_ = 0;
            this.bitField0_ &= -3;
            this.receiveExtra_ = UnderPalaceMsg.S2C_UnderPalaceInfo_5702.emptyIntList();
            this.bitField0_ &= -5;
            this.commonAward_ = UnderPalaceMsg.S2C_UnderPalaceInfo_5702.emptyIntList();
            this.bitField0_ &= -9;
            this.sweepNum_ = 0;
            this.bitField0_ &= -17;
            this.recZiWeiAward_ = UnderPalaceMsg.S2C_UnderPalaceInfo_5702.emptyIntList();
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_UnderPalaceInfo_5702_descriptor;
         }

         public S2C_UnderPalaceInfo_5702 getDefaultInstanceForType() {
            return UnderPalaceMsg.S2C_UnderPalaceInfo_5702.getDefaultInstance();
         }

         public S2C_UnderPalaceInfo_5702 build() {
            S2C_UnderPalaceInfo_5702 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UnderPalaceInfo_5702 buildPartial() {
            S2C_UnderPalaceInfo_5702 result = new S2C_UnderPalaceInfo_5702(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.info_ = Collections.unmodifiableList(this.info_);
                  this.bitField0_ &= -2;
               }

               result.info_ = this.info_;
            } else {
               result.info_ = this.infoBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               result.passSum_ = this.passSum_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.receiveExtra_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.receiveExtra_ = this.receiveExtra_;
            if ((this.bitField0_ & 8) != 0) {
               this.commonAward_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.commonAward_ = this.commonAward_;
            if ((from_bitField0_ & 16) != 0) {
               result.sweepNum_ = this.sweepNum_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 32) != 0) {
               this.recZiWeiAward_.makeImmutable();
               this.bitField0_ &= -33;
            }

            result.recZiWeiAward_ = this.recZiWeiAward_;
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
            if (other instanceof S2C_UnderPalaceInfo_5702) {
               return this.mergeFrom((S2C_UnderPalaceInfo_5702)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UnderPalaceInfo_5702 other) {
            if (other == UnderPalaceMsg.S2C_UnderPalaceInfo_5702.getDefaultInstance()) {
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
                     this.infoBuilder_ = UnderPalaceMsg.S2C_UnderPalaceInfo_5702.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
                  } else {
                     this.infoBuilder_.addAllMessages(other.info_);
                  }
               }

               if (other.hasPassSum()) {
                  this.setPassSum(other.getPassSum());
               }

               if (!other.receiveExtra_.isEmpty()) {
                  if (this.receiveExtra_.isEmpty()) {
                     this.receiveExtra_ = other.receiveExtra_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureReceiveExtraIsMutable();
                     this.receiveExtra_.addAll(other.receiveExtra_);
                  }

                  this.onChanged();
               }

               if (!other.commonAward_.isEmpty()) {
                  if (this.commonAward_.isEmpty()) {
                     this.commonAward_ = other.commonAward_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureCommonAwardIsMutable();
                     this.commonAward_.addAll(other.commonAward_);
                  }

                  this.onChanged();
               }

               if (other.hasSweepNum()) {
                  this.setSweepNum(other.getSweepNum());
               }

               if (!other.recZiWeiAward_.isEmpty()) {
                  if (this.recZiWeiAward_.isEmpty()) {
                     this.recZiWeiAward_ = other.recZiWeiAward_;
                     this.bitField0_ &= -33;
                  } else {
                     this.ensureRecZiWeiAwardIsMutable();
                     this.recZiWeiAward_.addAll(other.recZiWeiAward_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPassSum()) {
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
            S2C_UnderPalaceInfo_5702 parsedMessage = null;

            try {
               parsedMessage = (S2C_UnderPalaceInfo_5702)UnderPalaceMsg.S2C_UnderPalaceInfo_5702.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UnderPalaceInfo_5702)e.getUnfinishedMessage();
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

         public List<PalaceInfo> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public PalaceInfo getInfo(int index) {
            return this.infoBuilder_ == null ? (PalaceInfo)this.info_.get(index) : (PalaceInfo)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, PalaceInfo value) {
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

         public Builder setInfo(int index, PalaceInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(PalaceInfo value) {
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

         public Builder addInfo(int index, PalaceInfo value) {
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

         public Builder addInfo(PalaceInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, PalaceInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends PalaceInfo> values) {
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

         public PalaceInfo.Builder getInfoBuilder(int index) {
            return (PalaceInfo.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public PalaceInfoOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (PalaceInfoOrBuilder)this.info_.get(index) : (PalaceInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PalaceInfoOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public PalaceInfo.Builder addInfoBuilder() {
            return (PalaceInfo.Builder)this.getInfoFieldBuilder().addBuilder(UnderPalaceMsg.PalaceInfo.getDefaultInstance());
         }

         public PalaceInfo.Builder addInfoBuilder(int index) {
            return (PalaceInfo.Builder)this.getInfoFieldBuilder().addBuilder(index, UnderPalaceMsg.PalaceInfo.getDefaultInstance());
         }

         public List<PalaceInfo.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PalaceInfo, PalaceInfo.Builder, PalaceInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new RepeatedFieldBuilderV3(this.info_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public boolean hasPassSum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPassSum() {
            return this.passSum_;
         }

         public Builder setPassSum(int value) {
            this.bitField0_ |= 2;
            this.passSum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPassSum() {
            this.bitField0_ &= -3;
            this.passSum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureReceiveExtraIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.receiveExtra_ = UnderPalaceMsg.S2C_UnderPalaceInfo_5702.mutableCopy(this.receiveExtra_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getReceiveExtraList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.receiveExtra_) : this.receiveExtra_);
         }

         public int getReceiveExtraCount() {
            return this.receiveExtra_.size();
         }

         public int getReceiveExtra(int index) {
            return this.receiveExtra_.getInt(index);
         }

         public Builder setReceiveExtra(int index, int value) {
            this.ensureReceiveExtraIsMutable();
            this.receiveExtra_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addReceiveExtra(int value) {
            this.ensureReceiveExtraIsMutable();
            this.receiveExtra_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllReceiveExtra(Iterable<? extends Integer> values) {
            this.ensureReceiveExtraIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.receiveExtra_);
            this.onChanged();
            return this;
         }

         public Builder clearReceiveExtra() {
            this.receiveExtra_ = UnderPalaceMsg.S2C_UnderPalaceInfo_5702.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         private void ensureCommonAwardIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.commonAward_ = UnderPalaceMsg.S2C_UnderPalaceInfo_5702.mutableCopy(this.commonAward_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getCommonAwardList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.commonAward_) : this.commonAward_);
         }

         public int getCommonAwardCount() {
            return this.commonAward_.size();
         }

         public int getCommonAward(int index) {
            return this.commonAward_.getInt(index);
         }

         public Builder setCommonAward(int index, int value) {
            this.ensureCommonAwardIsMutable();
            this.commonAward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCommonAward(int value) {
            this.ensureCommonAwardIsMutable();
            this.commonAward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCommonAward(Iterable<? extends Integer> values) {
            this.ensureCommonAwardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.commonAward_);
            this.onChanged();
            return this;
         }

         public Builder clearCommonAward() {
            this.commonAward_ = UnderPalaceMsg.S2C_UnderPalaceInfo_5702.emptyIntList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         public boolean hasSweepNum() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getSweepNum() {
            return this.sweepNum_;
         }

         public Builder setSweepNum(int value) {
            this.bitField0_ |= 16;
            this.sweepNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSweepNum() {
            this.bitField0_ &= -17;
            this.sweepNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRecZiWeiAwardIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.recZiWeiAward_ = UnderPalaceMsg.S2C_UnderPalaceInfo_5702.mutableCopy(this.recZiWeiAward_);
               this.bitField0_ |= 32;
            }

         }

         public List<Integer> getRecZiWeiAwardList() {
            return (List<Integer>)((this.bitField0_ & 32) != 0 ? Collections.unmodifiableList(this.recZiWeiAward_) : this.recZiWeiAward_);
         }

         public int getRecZiWeiAwardCount() {
            return this.recZiWeiAward_.size();
         }

         public int getRecZiWeiAward(int index) {
            return this.recZiWeiAward_.getInt(index);
         }

         public Builder setRecZiWeiAward(int index, int value) {
            this.ensureRecZiWeiAwardIsMutable();
            this.recZiWeiAward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRecZiWeiAward(int value) {
            this.ensureRecZiWeiAwardIsMutable();
            this.recZiWeiAward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRecZiWeiAward(Iterable<? extends Integer> values) {
            this.ensureRecZiWeiAwardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recZiWeiAward_);
            this.onChanged();
            return this;
         }

         public Builder clearRecZiWeiAward() {
            this.recZiWeiAward_ = UnderPalaceMsg.S2C_UnderPalaceInfo_5702.emptyIntList();
            this.bitField0_ &= -33;
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

   public static final class PalaceInfo extends GeneratedMessageV3 implements PalaceInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGETYPE_FIELD_NUMBER = 1;
      private int stageType_;
      public static final int STAGEID_FIELD_NUMBER = 2;
      private int stageId_;
      public static final int BUFFS_FIELD_NUMBER = 4;
      private Internal.IntList buffs_;
      public static final int PASSSTATE_FIELD_NUMBER = 5;
      private int passState_;
      private byte memoizedIsInitialized;
      private static final PalaceInfo DEFAULT_INSTANCE = new PalaceInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<PalaceInfo> PARSER = new AbstractParser<PalaceInfo>() {
         public PalaceInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new PalaceInfo(input, extensionRegistry);
         }
      };

      private PalaceInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private PalaceInfo() {
         this.memoizedIsInitialized = -1;
         this.buffs_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new PalaceInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private PalaceInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.stageType_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.stageId_ = input.readInt32();
                        continue;
                     case 32:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.buffs_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.buffs_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.buffs_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 40:
                        this.bitField0_ |= 4;
                        this.passState_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.buffs_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.buffs_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_PalaceInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_PalaceInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PalaceInfo.class, Builder.class);
      }

      public boolean hasStageType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStageType() {
         return this.stageType_;
      }

      public boolean hasStageId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStageId() {
         return this.stageId_;
      }

      public List<Integer> getBuffsList() {
         return this.buffs_;
      }

      public int getBuffsCount() {
         return this.buffs_.size();
      }

      public int getBuffs(int index) {
         return this.buffs_.getInt(index);
      }

      public boolean hasPassState() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPassState() {
         return this.passState_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStageType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStageId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPassState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.stageType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.stageId_);
         }

         for(int i = 0; i < this.buffs_.size(); ++i) {
            output.writeInt32(4, this.buffs_.getInt(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(5, this.passState_);
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
               size += CodedOutputStream.computeInt32Size(1, this.stageType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.stageId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.buffs_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.buffs_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getBuffsList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.passState_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof PalaceInfo)) {
            return super.equals(obj);
         } else {
            PalaceInfo other = (PalaceInfo)obj;
            if (this.hasStageType() != other.hasStageType()) {
               return false;
            } else if (this.hasStageType() && this.getStageType() != other.getStageType()) {
               return false;
            } else if (this.hasStageId() != other.hasStageId()) {
               return false;
            } else if (this.hasStageId() && this.getStageId() != other.getStageId()) {
               return false;
            } else if (!this.getBuffsList().equals(other.getBuffsList())) {
               return false;
            } else if (this.hasPassState() != other.hasPassState()) {
               return false;
            } else if (this.hasPassState() && this.getPassState() != other.getPassState()) {
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
            if (this.hasStageType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStageType();
            }

            if (this.hasStageId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStageId();
            }

            if (this.getBuffsCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getBuffsList().hashCode();
            }

            if (this.hasPassState()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getPassState();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static PalaceInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (PalaceInfo)PARSER.parseFrom(data);
      }

      public static PalaceInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PalaceInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PalaceInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (PalaceInfo)PARSER.parseFrom(data);
      }

      public static PalaceInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PalaceInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PalaceInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (PalaceInfo)PARSER.parseFrom(data);
      }

      public static PalaceInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PalaceInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PalaceInfo parseFrom(InputStream input) throws IOException {
         return (PalaceInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PalaceInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PalaceInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static PalaceInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (PalaceInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static PalaceInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PalaceInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static PalaceInfo parseFrom(CodedInputStream input) throws IOException {
         return (PalaceInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PalaceInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PalaceInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(PalaceInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static PalaceInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<PalaceInfo> parser() {
         return PARSER;
      }

      public Parser<PalaceInfo> getParserForType() {
         return PARSER;
      }

      public PalaceInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PalaceInfoOrBuilder {
         private int bitField0_;
         private int stageType_;
         private int stageId_;
         private Internal.IntList buffs_;
         private int passState_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_PalaceInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_PalaceInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PalaceInfo.class, Builder.class);
         }

         private Builder() {
            this.buffs_ = UnderPalaceMsg.PalaceInfo.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.buffs_ = UnderPalaceMsg.PalaceInfo.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnderPalaceMsg.PalaceInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.stageType_ = 0;
            this.bitField0_ &= -2;
            this.stageId_ = 0;
            this.bitField0_ &= -3;
            this.buffs_ = UnderPalaceMsg.PalaceInfo.emptyIntList();
            this.bitField0_ &= -5;
            this.passState_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_PalaceInfo_descriptor;
         }

         public PalaceInfo getDefaultInstanceForType() {
            return UnderPalaceMsg.PalaceInfo.getDefaultInstance();
         }

         public PalaceInfo build() {
            PalaceInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public PalaceInfo buildPartial() {
            PalaceInfo result = new PalaceInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stageType_ = this.stageType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.stageId_ = this.stageId_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.buffs_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.buffs_ = this.buffs_;
            if ((from_bitField0_ & 8) != 0) {
               result.passState_ = this.passState_;
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
            if (other instanceof PalaceInfo) {
               return this.mergeFrom((PalaceInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(PalaceInfo other) {
            if (other == UnderPalaceMsg.PalaceInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStageType()) {
                  this.setStageType(other.getStageType());
               }

               if (other.hasStageId()) {
                  this.setStageId(other.getStageId());
               }

               if (!other.buffs_.isEmpty()) {
                  if (this.buffs_.isEmpty()) {
                     this.buffs_ = other.buffs_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureBuffsIsMutable();
                     this.buffs_.addAll(other.buffs_);
                  }

                  this.onChanged();
               }

               if (other.hasPassState()) {
                  this.setPassState(other.getPassState());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStageType()) {
               return false;
            } else if (!this.hasStageId()) {
               return false;
            } else {
               return this.hasPassState();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            PalaceInfo parsedMessage = null;

            try {
               parsedMessage = (PalaceInfo)UnderPalaceMsg.PalaceInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (PalaceInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStageType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStageType() {
            return this.stageType_;
         }

         public Builder setStageType(int value) {
            this.bitField0_ |= 1;
            this.stageType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageType() {
            this.bitField0_ &= -2;
            this.stageType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStageId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStageId() {
            return this.stageId_;
         }

         public Builder setStageId(int value) {
            this.bitField0_ |= 2;
            this.stageId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageId() {
            this.bitField0_ &= -3;
            this.stageId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureBuffsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.buffs_ = UnderPalaceMsg.PalaceInfo.mutableCopy(this.buffs_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getBuffsList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.buffs_) : this.buffs_);
         }

         public int getBuffsCount() {
            return this.buffs_.size();
         }

         public int getBuffs(int index) {
            return this.buffs_.getInt(index);
         }

         public Builder setBuffs(int index, int value) {
            this.ensureBuffsIsMutable();
            this.buffs_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addBuffs(int value) {
            this.ensureBuffsIsMutable();
            this.buffs_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllBuffs(Iterable<? extends Integer> values) {
            this.ensureBuffsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.buffs_);
            this.onChanged();
            return this;
         }

         public Builder clearBuffs() {
            this.buffs_ = UnderPalaceMsg.PalaceInfo.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         public boolean hasPassState() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getPassState() {
            return this.passState_;
         }

         public Builder setPassState(int value) {
            this.bitField0_ |= 8;
            this.passState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPassState() {
            this.bitField0_ &= -9;
            this.passState_ = 0;
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

   public static final class C2S_ReceiveCommonAward_5703 extends GeneratedMessageV3 implements C2S_ReceiveCommonAward_5703OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGESUM_FIELD_NUMBER = 2;
      private int stageSum_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveCommonAward_5703 DEFAULT_INSTANCE = new C2S_ReceiveCommonAward_5703();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveCommonAward_5703> PARSER = new AbstractParser<C2S_ReceiveCommonAward_5703>() {
         public C2S_ReceiveCommonAward_5703 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveCommonAward_5703(input, extensionRegistry);
         }
      };

      private C2S_ReceiveCommonAward_5703(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveCommonAward_5703() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveCommonAward_5703();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveCommonAward_5703(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.stageSum_ = input.readInt32();
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
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_ReceiveCommonAward_5703_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_ReceiveCommonAward_5703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveCommonAward_5703.class, Builder.class);
      }

      public boolean hasStageSum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStageSum() {
         return this.stageSum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStageSum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.stageSum_);
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
               size += CodedOutputStream.computeInt32Size(2, this.stageSum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ReceiveCommonAward_5703)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveCommonAward_5703 other = (C2S_ReceiveCommonAward_5703)obj;
            if (this.hasStageSum() != other.hasStageSum()) {
               return false;
            } else if (this.hasStageSum() && this.getStageSum() != other.getStageSum()) {
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
            if (this.hasStageSum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStageSum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ReceiveCommonAward_5703 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveCommonAward_5703)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveCommonAward_5703 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveCommonAward_5703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveCommonAward_5703 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveCommonAward_5703)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveCommonAward_5703 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveCommonAward_5703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveCommonAward_5703 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveCommonAward_5703)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveCommonAward_5703 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveCommonAward_5703)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveCommonAward_5703 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveCommonAward_5703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveCommonAward_5703 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveCommonAward_5703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveCommonAward_5703 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveCommonAward_5703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveCommonAward_5703 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveCommonAward_5703)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveCommonAward_5703 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveCommonAward_5703)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveCommonAward_5703 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveCommonAward_5703)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveCommonAward_5703 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveCommonAward_5703 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveCommonAward_5703> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveCommonAward_5703> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveCommonAward_5703 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveCommonAward_5703OrBuilder {
         private int bitField0_;
         private int stageSum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_ReceiveCommonAward_5703_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_ReceiveCommonAward_5703_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveCommonAward_5703.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnderPalaceMsg.C2S_ReceiveCommonAward_5703.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.stageSum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_ReceiveCommonAward_5703_descriptor;
         }

         public C2S_ReceiveCommonAward_5703 getDefaultInstanceForType() {
            return UnderPalaceMsg.C2S_ReceiveCommonAward_5703.getDefaultInstance();
         }

         public C2S_ReceiveCommonAward_5703 build() {
            C2S_ReceiveCommonAward_5703 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveCommonAward_5703 buildPartial() {
            C2S_ReceiveCommonAward_5703 result = new C2S_ReceiveCommonAward_5703(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stageSum_ = this.stageSum_;
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
            if (other instanceof C2S_ReceiveCommonAward_5703) {
               return this.mergeFrom((C2S_ReceiveCommonAward_5703)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveCommonAward_5703 other) {
            if (other == UnderPalaceMsg.C2S_ReceiveCommonAward_5703.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStageSum()) {
                  this.setStageSum(other.getStageSum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasStageSum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ReceiveCommonAward_5703 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveCommonAward_5703)UnderPalaceMsg.C2S_ReceiveCommonAward_5703.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveCommonAward_5703)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStageSum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStageSum() {
            return this.stageSum_;
         }

         public Builder setStageSum(int value) {
            this.bitField0_ |= 1;
            this.stageSum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageSum() {
            this.bitField0_ &= -2;
            this.stageSum_ = 0;
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

   public static final class S2C_ReceiveCommonAward_5704 extends GeneratedMessageV3 implements S2C_ReceiveCommonAward_5704OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGESUM_FIELD_NUMBER = 2;
      private int stageSum_;
      public static final int RECEIVEAWARD_FIELD_NUMBER = 3;
      private Internal.IntList receiveAward_;
      public static final int RESULT_FIELD_NUMBER = 4;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_ReceiveCommonAward_5704 DEFAULT_INSTANCE = new S2C_ReceiveCommonAward_5704();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ReceiveCommonAward_5704> PARSER = new AbstractParser<S2C_ReceiveCommonAward_5704>() {
         public S2C_ReceiveCommonAward_5704 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ReceiveCommonAward_5704(input, extensionRegistry);
         }
      };

      private S2C_ReceiveCommonAward_5704(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ReceiveCommonAward_5704() {
         this.memoizedIsInitialized = -1;
         this.receiveAward_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ReceiveCommonAward_5704();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ReceiveCommonAward_5704(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 1;
                        this.stageSum_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.receiveAward_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.receiveAward_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.receiveAward_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 2;
                        this.result_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.receiveAward_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.receiveAward_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_ReceiveCommonAward_5704_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_ReceiveCommonAward_5704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveCommonAward_5704.class, Builder.class);
      }

      public boolean hasStageSum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStageSum() {
         return this.stageSum_;
      }

      public List<Integer> getReceiveAwardList() {
         return this.receiveAward_;
      }

      public int getReceiveAwardCount() {
         return this.receiveAward_.size();
      }

      public int getReceiveAward(int index) {
         return this.receiveAward_.getInt(index);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasStageSum()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(2, this.stageSum_);
         }

         for(int i = 0; i < this.receiveAward_.size(); ++i) {
            output.writeInt32(3, this.receiveAward_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(4, this.result_);
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
               size += CodedOutputStream.computeInt32Size(2, this.stageSum_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.receiveAward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.receiveAward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getReceiveAwardList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.result_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ReceiveCommonAward_5704)) {
            return super.equals(obj);
         } else {
            S2C_ReceiveCommonAward_5704 other = (S2C_ReceiveCommonAward_5704)obj;
            if (this.hasStageSum() != other.hasStageSum()) {
               return false;
            } else if (this.hasStageSum() && this.getStageSum() != other.getStageSum()) {
               return false;
            } else if (!this.getReceiveAwardList().equals(other.getReceiveAwardList())) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
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
            if (this.hasStageSum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStageSum();
            }

            if (this.getReceiveAwardCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getReceiveAwardList().hashCode();
            }

            if (this.hasResult()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getResult();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ReceiveCommonAward_5704 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveCommonAward_5704)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveCommonAward_5704 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveCommonAward_5704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveCommonAward_5704 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveCommonAward_5704)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveCommonAward_5704 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveCommonAward_5704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveCommonAward_5704 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveCommonAward_5704)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveCommonAward_5704 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveCommonAward_5704)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveCommonAward_5704 parseFrom(InputStream input) throws IOException {
         return (S2C_ReceiveCommonAward_5704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveCommonAward_5704 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveCommonAward_5704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveCommonAward_5704 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ReceiveCommonAward_5704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ReceiveCommonAward_5704 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveCommonAward_5704)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveCommonAward_5704 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ReceiveCommonAward_5704)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveCommonAward_5704 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveCommonAward_5704)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ReceiveCommonAward_5704 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ReceiveCommonAward_5704 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ReceiveCommonAward_5704> parser() {
         return PARSER;
      }

      public Parser<S2C_ReceiveCommonAward_5704> getParserForType() {
         return PARSER;
      }

      public S2C_ReceiveCommonAward_5704 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ReceiveCommonAward_5704OrBuilder {
         private int bitField0_;
         private int stageSum_;
         private Internal.IntList receiveAward_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_ReceiveCommonAward_5704_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_ReceiveCommonAward_5704_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveCommonAward_5704.class, Builder.class);
         }

         private Builder() {
            this.receiveAward_ = UnderPalaceMsg.S2C_ReceiveCommonAward_5704.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.receiveAward_ = UnderPalaceMsg.S2C_ReceiveCommonAward_5704.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnderPalaceMsg.S2C_ReceiveCommonAward_5704.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.stageSum_ = 0;
            this.bitField0_ &= -2;
            this.receiveAward_ = UnderPalaceMsg.S2C_ReceiveCommonAward_5704.emptyIntList();
            this.bitField0_ &= -3;
            this.result_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_ReceiveCommonAward_5704_descriptor;
         }

         public S2C_ReceiveCommonAward_5704 getDefaultInstanceForType() {
            return UnderPalaceMsg.S2C_ReceiveCommonAward_5704.getDefaultInstance();
         }

         public S2C_ReceiveCommonAward_5704 build() {
            S2C_ReceiveCommonAward_5704 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ReceiveCommonAward_5704 buildPartial() {
            S2C_ReceiveCommonAward_5704 result = new S2C_ReceiveCommonAward_5704(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stageSum_ = this.stageSum_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.receiveAward_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.receiveAward_ = this.receiveAward_;
            if ((from_bitField0_ & 4) != 0) {
               result.result_ = this.result_;
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
            if (other instanceof S2C_ReceiveCommonAward_5704) {
               return this.mergeFrom((S2C_ReceiveCommonAward_5704)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ReceiveCommonAward_5704 other) {
            if (other == UnderPalaceMsg.S2C_ReceiveCommonAward_5704.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStageSum()) {
                  this.setStageSum(other.getStageSum());
               }

               if (!other.receiveAward_.isEmpty()) {
                  if (this.receiveAward_.isEmpty()) {
                     this.receiveAward_ = other.receiveAward_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureReceiveAwardIsMutable();
                     this.receiveAward_.addAll(other.receiveAward_);
                  }

                  this.onChanged();
               }

               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStageSum()) {
               return false;
            } else {
               return this.hasResult();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ReceiveCommonAward_5704 parsedMessage = null;

            try {
               parsedMessage = (S2C_ReceiveCommonAward_5704)UnderPalaceMsg.S2C_ReceiveCommonAward_5704.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ReceiveCommonAward_5704)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStageSum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStageSum() {
            return this.stageSum_;
         }

         public Builder setStageSum(int value) {
            this.bitField0_ |= 1;
            this.stageSum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageSum() {
            this.bitField0_ &= -2;
            this.stageSum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureReceiveAwardIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.receiveAward_ = UnderPalaceMsg.S2C_ReceiveCommonAward_5704.mutableCopy(this.receiveAward_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getReceiveAwardList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.receiveAward_) : this.receiveAward_);
         }

         public int getReceiveAwardCount() {
            return this.receiveAward_.size();
         }

         public int getReceiveAward(int index) {
            return this.receiveAward_.getInt(index);
         }

         public Builder setReceiveAward(int index, int value) {
            this.ensureReceiveAwardIsMutable();
            this.receiveAward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addReceiveAward(int value) {
            this.ensureReceiveAwardIsMutable();
            this.receiveAward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllReceiveAward(Iterable<? extends Integer> values) {
            this.ensureReceiveAwardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.receiveAward_);
            this.onChanged();
            return this;
         }

         public Builder clearReceiveAward() {
            this.receiveAward_ = UnderPalaceMsg.S2C_ReceiveCommonAward_5704.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 4;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -5;
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

   public static final class C2S_ReceiveExtraAward_5705 extends GeneratedMessageV3 implements C2S_ReceiveExtraAward_5705OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGESUM_FIELD_NUMBER = 1;
      private int stageSum_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveExtraAward_5705 DEFAULT_INSTANCE = new C2S_ReceiveExtraAward_5705();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveExtraAward_5705> PARSER = new AbstractParser<C2S_ReceiveExtraAward_5705>() {
         public C2S_ReceiveExtraAward_5705 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveExtraAward_5705(input, extensionRegistry);
         }
      };

      private C2S_ReceiveExtraAward_5705(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveExtraAward_5705() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveExtraAward_5705();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveExtraAward_5705(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.stageSum_ = input.readInt32();
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
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_ReceiveExtraAward_5705_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_ReceiveExtraAward_5705_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveExtraAward_5705.class, Builder.class);
      }

      public boolean hasStageSum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStageSum() {
         return this.stageSum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStageSum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.stageSum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.stageSum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ReceiveExtraAward_5705)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveExtraAward_5705 other = (C2S_ReceiveExtraAward_5705)obj;
            if (this.hasStageSum() != other.hasStageSum()) {
               return false;
            } else if (this.hasStageSum() && this.getStageSum() != other.getStageSum()) {
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
            if (this.hasStageSum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStageSum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ReceiveExtraAward_5705 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveExtraAward_5705)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveExtraAward_5705 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveExtraAward_5705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveExtraAward_5705 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveExtraAward_5705)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveExtraAward_5705 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveExtraAward_5705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveExtraAward_5705 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveExtraAward_5705)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveExtraAward_5705 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveExtraAward_5705)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveExtraAward_5705 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveExtraAward_5705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveExtraAward_5705 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveExtraAward_5705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveExtraAward_5705 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveExtraAward_5705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveExtraAward_5705 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveExtraAward_5705)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveExtraAward_5705 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveExtraAward_5705)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveExtraAward_5705 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveExtraAward_5705)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveExtraAward_5705 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveExtraAward_5705 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveExtraAward_5705> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveExtraAward_5705> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveExtraAward_5705 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveExtraAward_5705OrBuilder {
         private int bitField0_;
         private int stageSum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_ReceiveExtraAward_5705_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_ReceiveExtraAward_5705_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveExtraAward_5705.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnderPalaceMsg.C2S_ReceiveExtraAward_5705.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.stageSum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_ReceiveExtraAward_5705_descriptor;
         }

         public C2S_ReceiveExtraAward_5705 getDefaultInstanceForType() {
            return UnderPalaceMsg.C2S_ReceiveExtraAward_5705.getDefaultInstance();
         }

         public C2S_ReceiveExtraAward_5705 build() {
            C2S_ReceiveExtraAward_5705 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveExtraAward_5705 buildPartial() {
            C2S_ReceiveExtraAward_5705 result = new C2S_ReceiveExtraAward_5705(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stageSum_ = this.stageSum_;
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
            if (other instanceof C2S_ReceiveExtraAward_5705) {
               return this.mergeFrom((C2S_ReceiveExtraAward_5705)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveExtraAward_5705 other) {
            if (other == UnderPalaceMsg.C2S_ReceiveExtraAward_5705.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStageSum()) {
                  this.setStageSum(other.getStageSum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasStageSum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ReceiveExtraAward_5705 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveExtraAward_5705)UnderPalaceMsg.C2S_ReceiveExtraAward_5705.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveExtraAward_5705)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStageSum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStageSum() {
            return this.stageSum_;
         }

         public Builder setStageSum(int value) {
            this.bitField0_ |= 1;
            this.stageSum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageSum() {
            this.bitField0_ &= -2;
            this.stageSum_ = 0;
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

   public static final class S2C_ReceiveExtraAward_5706 extends GeneratedMessageV3 implements S2C_ReceiveExtraAward_5706OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGESUM_FIELD_NUMBER = 1;
      private int stageSum_;
      public static final int RECEIVEEXTRA_FIELD_NUMBER = 3;
      private Internal.IntList receiveExtra_;
      public static final int RESULT_FIELD_NUMBER = 2;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_ReceiveExtraAward_5706 DEFAULT_INSTANCE = new S2C_ReceiveExtraAward_5706();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ReceiveExtraAward_5706> PARSER = new AbstractParser<S2C_ReceiveExtraAward_5706>() {
         public S2C_ReceiveExtraAward_5706 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ReceiveExtraAward_5706(input, extensionRegistry);
         }
      };

      private S2C_ReceiveExtraAward_5706(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ReceiveExtraAward_5706() {
         this.memoizedIsInitialized = -1;
         this.receiveExtra_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ReceiveExtraAward_5706();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ReceiveExtraAward_5706(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.stageSum_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.result_ = input.readInt32();
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.receiveExtra_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.receiveExtra_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.receiveExtra_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.receiveExtra_.addInt(input.readInt32());
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
                  this.receiveExtra_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_ReceiveExtraAward_5706_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_ReceiveExtraAward_5706_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveExtraAward_5706.class, Builder.class);
      }

      public boolean hasStageSum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStageSum() {
         return this.stageSum_;
      }

      public List<Integer> getReceiveExtraList() {
         return this.receiveExtra_;
      }

      public int getReceiveExtraCount() {
         return this.receiveExtra_.size();
      }

      public int getReceiveExtra(int index) {
         return this.receiveExtra_.getInt(index);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasStageSum()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.stageSum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.result_);
         }

         for(int i = 0; i < this.receiveExtra_.size(); ++i) {
            output.writeInt32(3, this.receiveExtra_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.stageSum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.result_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.receiveExtra_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.receiveExtra_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getReceiveExtraList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ReceiveExtraAward_5706)) {
            return super.equals(obj);
         } else {
            S2C_ReceiveExtraAward_5706 other = (S2C_ReceiveExtraAward_5706)obj;
            if (this.hasStageSum() != other.hasStageSum()) {
               return false;
            } else if (this.hasStageSum() && this.getStageSum() != other.getStageSum()) {
               return false;
            } else if (!this.getReceiveExtraList().equals(other.getReceiveExtraList())) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
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
            if (this.hasStageSum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStageSum();
            }

            if (this.getReceiveExtraCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getReceiveExtraList().hashCode();
            }

            if (this.hasResult()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getResult();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ReceiveExtraAward_5706 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveExtraAward_5706)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveExtraAward_5706 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveExtraAward_5706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveExtraAward_5706 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveExtraAward_5706)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveExtraAward_5706 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveExtraAward_5706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveExtraAward_5706 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveExtraAward_5706)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveExtraAward_5706 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveExtraAward_5706)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveExtraAward_5706 parseFrom(InputStream input) throws IOException {
         return (S2C_ReceiveExtraAward_5706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveExtraAward_5706 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveExtraAward_5706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveExtraAward_5706 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ReceiveExtraAward_5706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ReceiveExtraAward_5706 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveExtraAward_5706)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveExtraAward_5706 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ReceiveExtraAward_5706)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveExtraAward_5706 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveExtraAward_5706)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ReceiveExtraAward_5706 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ReceiveExtraAward_5706 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ReceiveExtraAward_5706> parser() {
         return PARSER;
      }

      public Parser<S2C_ReceiveExtraAward_5706> getParserForType() {
         return PARSER;
      }

      public S2C_ReceiveExtraAward_5706 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ReceiveExtraAward_5706OrBuilder {
         private int bitField0_;
         private int stageSum_;
         private Internal.IntList receiveExtra_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_ReceiveExtraAward_5706_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_ReceiveExtraAward_5706_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveExtraAward_5706.class, Builder.class);
         }

         private Builder() {
            this.receiveExtra_ = UnderPalaceMsg.S2C_ReceiveExtraAward_5706.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.receiveExtra_ = UnderPalaceMsg.S2C_ReceiveExtraAward_5706.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnderPalaceMsg.S2C_ReceiveExtraAward_5706.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.stageSum_ = 0;
            this.bitField0_ &= -2;
            this.receiveExtra_ = UnderPalaceMsg.S2C_ReceiveExtraAward_5706.emptyIntList();
            this.bitField0_ &= -3;
            this.result_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_ReceiveExtraAward_5706_descriptor;
         }

         public S2C_ReceiveExtraAward_5706 getDefaultInstanceForType() {
            return UnderPalaceMsg.S2C_ReceiveExtraAward_5706.getDefaultInstance();
         }

         public S2C_ReceiveExtraAward_5706 build() {
            S2C_ReceiveExtraAward_5706 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ReceiveExtraAward_5706 buildPartial() {
            S2C_ReceiveExtraAward_5706 result = new S2C_ReceiveExtraAward_5706(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stageSum_ = this.stageSum_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.receiveExtra_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.receiveExtra_ = this.receiveExtra_;
            if ((from_bitField0_ & 4) != 0) {
               result.result_ = this.result_;
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
            if (other instanceof S2C_ReceiveExtraAward_5706) {
               return this.mergeFrom((S2C_ReceiveExtraAward_5706)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ReceiveExtraAward_5706 other) {
            if (other == UnderPalaceMsg.S2C_ReceiveExtraAward_5706.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStageSum()) {
                  this.setStageSum(other.getStageSum());
               }

               if (!other.receiveExtra_.isEmpty()) {
                  if (this.receiveExtra_.isEmpty()) {
                     this.receiveExtra_ = other.receiveExtra_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureReceiveExtraIsMutable();
                     this.receiveExtra_.addAll(other.receiveExtra_);
                  }

                  this.onChanged();
               }

               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStageSum()) {
               return false;
            } else {
               return this.hasResult();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ReceiveExtraAward_5706 parsedMessage = null;

            try {
               parsedMessage = (S2C_ReceiveExtraAward_5706)UnderPalaceMsg.S2C_ReceiveExtraAward_5706.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ReceiveExtraAward_5706)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStageSum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStageSum() {
            return this.stageSum_;
         }

         public Builder setStageSum(int value) {
            this.bitField0_ |= 1;
            this.stageSum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageSum() {
            this.bitField0_ &= -2;
            this.stageSum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureReceiveExtraIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.receiveExtra_ = UnderPalaceMsg.S2C_ReceiveExtraAward_5706.mutableCopy(this.receiveExtra_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getReceiveExtraList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.receiveExtra_) : this.receiveExtra_);
         }

         public int getReceiveExtraCount() {
            return this.receiveExtra_.size();
         }

         public int getReceiveExtra(int index) {
            return this.receiveExtra_.getInt(index);
         }

         public Builder setReceiveExtra(int index, int value) {
            this.ensureReceiveExtraIsMutable();
            this.receiveExtra_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addReceiveExtra(int value) {
            this.ensureReceiveExtraIsMutable();
            this.receiveExtra_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllReceiveExtra(Iterable<? extends Integer> values) {
            this.ensureReceiveExtraIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.receiveExtra_);
            this.onChanged();
            return this;
         }

         public Builder clearReceiveExtra() {
            this.receiveExtra_ = UnderPalaceMsg.S2C_ReceiveExtraAward_5706.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 4;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -5;
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

   public static final class C2S_RefreshBuff_5707 extends GeneratedMessageV3 implements C2S_RefreshBuff_5707OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGETYPE_FIELD_NUMBER = 1;
      private int stageType_;
      public static final int STAGEID_FIELD_NUMBER = 2;
      private int stageId_;
      private byte memoizedIsInitialized;
      private static final C2S_RefreshBuff_5707 DEFAULT_INSTANCE = new C2S_RefreshBuff_5707();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RefreshBuff_5707> PARSER = new AbstractParser<C2S_RefreshBuff_5707>() {
         public C2S_RefreshBuff_5707 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RefreshBuff_5707(input, extensionRegistry);
         }
      };

      private C2S_RefreshBuff_5707(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RefreshBuff_5707() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RefreshBuff_5707();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RefreshBuff_5707(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.stageType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.stageId_ = input.readInt32();
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
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_RefreshBuff_5707_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_RefreshBuff_5707_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RefreshBuff_5707.class, Builder.class);
      }

      public boolean hasStageType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStageType() {
         return this.stageType_;
      }

      public boolean hasStageId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStageId() {
         return this.stageId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStageType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStageId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.stageType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.stageId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.stageType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.stageId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RefreshBuff_5707)) {
            return super.equals(obj);
         } else {
            C2S_RefreshBuff_5707 other = (C2S_RefreshBuff_5707)obj;
            if (this.hasStageType() != other.hasStageType()) {
               return false;
            } else if (this.hasStageType() && this.getStageType() != other.getStageType()) {
               return false;
            } else if (this.hasStageId() != other.hasStageId()) {
               return false;
            } else if (this.hasStageId() && this.getStageId() != other.getStageId()) {
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
            if (this.hasStageType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStageType();
            }

            if (this.hasStageId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStageId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RefreshBuff_5707 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RefreshBuff_5707)PARSER.parseFrom(data);
      }

      public static C2S_RefreshBuff_5707 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefreshBuff_5707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefreshBuff_5707 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RefreshBuff_5707)PARSER.parseFrom(data);
      }

      public static C2S_RefreshBuff_5707 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefreshBuff_5707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefreshBuff_5707 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RefreshBuff_5707)PARSER.parseFrom(data);
      }

      public static C2S_RefreshBuff_5707 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefreshBuff_5707)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefreshBuff_5707 parseFrom(InputStream input) throws IOException {
         return (C2S_RefreshBuff_5707)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RefreshBuff_5707 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefreshBuff_5707)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RefreshBuff_5707 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RefreshBuff_5707)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RefreshBuff_5707 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefreshBuff_5707)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RefreshBuff_5707 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RefreshBuff_5707)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RefreshBuff_5707 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefreshBuff_5707)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RefreshBuff_5707 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RefreshBuff_5707 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RefreshBuff_5707> parser() {
         return PARSER;
      }

      public Parser<C2S_RefreshBuff_5707> getParserForType() {
         return PARSER;
      }

      public C2S_RefreshBuff_5707 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RefreshBuff_5707OrBuilder {
         private int bitField0_;
         private int stageType_;
         private int stageId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_RefreshBuff_5707_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_RefreshBuff_5707_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RefreshBuff_5707.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnderPalaceMsg.C2S_RefreshBuff_5707.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.stageType_ = 0;
            this.bitField0_ &= -2;
            this.stageId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_RefreshBuff_5707_descriptor;
         }

         public C2S_RefreshBuff_5707 getDefaultInstanceForType() {
            return UnderPalaceMsg.C2S_RefreshBuff_5707.getDefaultInstance();
         }

         public C2S_RefreshBuff_5707 build() {
            C2S_RefreshBuff_5707 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RefreshBuff_5707 buildPartial() {
            C2S_RefreshBuff_5707 result = new C2S_RefreshBuff_5707(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stageType_ = this.stageType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.stageId_ = this.stageId_;
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
            if (other instanceof C2S_RefreshBuff_5707) {
               return this.mergeFrom((C2S_RefreshBuff_5707)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RefreshBuff_5707 other) {
            if (other == UnderPalaceMsg.C2S_RefreshBuff_5707.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStageType()) {
                  this.setStageType(other.getStageType());
               }

               if (other.hasStageId()) {
                  this.setStageId(other.getStageId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStageType()) {
               return false;
            } else {
               return this.hasStageId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RefreshBuff_5707 parsedMessage = null;

            try {
               parsedMessage = (C2S_RefreshBuff_5707)UnderPalaceMsg.C2S_RefreshBuff_5707.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RefreshBuff_5707)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStageType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStageType() {
            return this.stageType_;
         }

         public Builder setStageType(int value) {
            this.bitField0_ |= 1;
            this.stageType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageType() {
            this.bitField0_ &= -2;
            this.stageType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStageId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStageId() {
            return this.stageId_;
         }

         public Builder setStageId(int value) {
            this.bitField0_ |= 2;
            this.stageId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageId() {
            this.bitField0_ &= -3;
            this.stageId_ = 0;
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

   public static final class S2C_RefreshBuff_5708 extends GeneratedMessageV3 implements S2C_RefreshBuff_5708OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGETYPE_FIELD_NUMBER = 1;
      private int stageType_;
      public static final int STAGEID_FIELD_NUMBER = 2;
      private int stageId_;
      public static final int BUFFS_FIELD_NUMBER = 3;
      private Internal.IntList buffs_;
      private byte memoizedIsInitialized;
      private static final S2C_RefreshBuff_5708 DEFAULT_INSTANCE = new S2C_RefreshBuff_5708();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RefreshBuff_5708> PARSER = new AbstractParser<S2C_RefreshBuff_5708>() {
         public S2C_RefreshBuff_5708 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RefreshBuff_5708(input, extensionRegistry);
         }
      };

      private S2C_RefreshBuff_5708(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RefreshBuff_5708() {
         this.memoizedIsInitialized = -1;
         this.buffs_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RefreshBuff_5708();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RefreshBuff_5708(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.stageType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.stageId_ = input.readInt32();
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.buffs_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.buffs_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.buffs_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.buffs_.addInt(input.readInt32());
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
               if ((mutable_bitField0_ & 4) != 0) {
                  this.buffs_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_RefreshBuff_5708_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_RefreshBuff_5708_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RefreshBuff_5708.class, Builder.class);
      }

      public boolean hasStageType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStageType() {
         return this.stageType_;
      }

      public boolean hasStageId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStageId() {
         return this.stageId_;
      }

      public List<Integer> getBuffsList() {
         return this.buffs_;
      }

      public int getBuffsCount() {
         return this.buffs_.size();
      }

      public int getBuffs(int index) {
         return this.buffs_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStageType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStageId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.stageType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.stageId_);
         }

         for(int i = 0; i < this.buffs_.size(); ++i) {
            output.writeInt32(3, this.buffs_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.stageType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.stageId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.buffs_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.buffs_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getBuffsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RefreshBuff_5708)) {
            return super.equals(obj);
         } else {
            S2C_RefreshBuff_5708 other = (S2C_RefreshBuff_5708)obj;
            if (this.hasStageType() != other.hasStageType()) {
               return false;
            } else if (this.hasStageType() && this.getStageType() != other.getStageType()) {
               return false;
            } else if (this.hasStageId() != other.hasStageId()) {
               return false;
            } else if (this.hasStageId() && this.getStageId() != other.getStageId()) {
               return false;
            } else if (!this.getBuffsList().equals(other.getBuffsList())) {
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
            if (this.hasStageType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStageType();
            }

            if (this.hasStageId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStageId();
            }

            if (this.getBuffsCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBuffsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RefreshBuff_5708 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RefreshBuff_5708)PARSER.parseFrom(data);
      }

      public static S2C_RefreshBuff_5708 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefreshBuff_5708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefreshBuff_5708 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RefreshBuff_5708)PARSER.parseFrom(data);
      }

      public static S2C_RefreshBuff_5708 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefreshBuff_5708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefreshBuff_5708 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RefreshBuff_5708)PARSER.parseFrom(data);
      }

      public static S2C_RefreshBuff_5708 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefreshBuff_5708)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefreshBuff_5708 parseFrom(InputStream input) throws IOException {
         return (S2C_RefreshBuff_5708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RefreshBuff_5708 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefreshBuff_5708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RefreshBuff_5708 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RefreshBuff_5708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RefreshBuff_5708 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefreshBuff_5708)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RefreshBuff_5708 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RefreshBuff_5708)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RefreshBuff_5708 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefreshBuff_5708)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RefreshBuff_5708 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RefreshBuff_5708 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RefreshBuff_5708> parser() {
         return PARSER;
      }

      public Parser<S2C_RefreshBuff_5708> getParserForType() {
         return PARSER;
      }

      public S2C_RefreshBuff_5708 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RefreshBuff_5708OrBuilder {
         private int bitField0_;
         private int stageType_;
         private int stageId_;
         private Internal.IntList buffs_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_RefreshBuff_5708_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_RefreshBuff_5708_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RefreshBuff_5708.class, Builder.class);
         }

         private Builder() {
            this.buffs_ = UnderPalaceMsg.S2C_RefreshBuff_5708.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.buffs_ = UnderPalaceMsg.S2C_RefreshBuff_5708.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnderPalaceMsg.S2C_RefreshBuff_5708.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.stageType_ = 0;
            this.bitField0_ &= -2;
            this.stageId_ = 0;
            this.bitField0_ &= -3;
            this.buffs_ = UnderPalaceMsg.S2C_RefreshBuff_5708.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_RefreshBuff_5708_descriptor;
         }

         public S2C_RefreshBuff_5708 getDefaultInstanceForType() {
            return UnderPalaceMsg.S2C_RefreshBuff_5708.getDefaultInstance();
         }

         public S2C_RefreshBuff_5708 build() {
            S2C_RefreshBuff_5708 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RefreshBuff_5708 buildPartial() {
            S2C_RefreshBuff_5708 result = new S2C_RefreshBuff_5708(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stageType_ = this.stageType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.stageId_ = this.stageId_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.buffs_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.buffs_ = this.buffs_;
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
            if (other instanceof S2C_RefreshBuff_5708) {
               return this.mergeFrom((S2C_RefreshBuff_5708)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RefreshBuff_5708 other) {
            if (other == UnderPalaceMsg.S2C_RefreshBuff_5708.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStageType()) {
                  this.setStageType(other.getStageType());
               }

               if (other.hasStageId()) {
                  this.setStageId(other.getStageId());
               }

               if (!other.buffs_.isEmpty()) {
                  if (this.buffs_.isEmpty()) {
                     this.buffs_ = other.buffs_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureBuffsIsMutable();
                     this.buffs_.addAll(other.buffs_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStageType()) {
               return false;
            } else {
               return this.hasStageId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RefreshBuff_5708 parsedMessage = null;

            try {
               parsedMessage = (S2C_RefreshBuff_5708)UnderPalaceMsg.S2C_RefreshBuff_5708.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RefreshBuff_5708)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStageType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStageType() {
            return this.stageType_;
         }

         public Builder setStageType(int value) {
            this.bitField0_ |= 1;
            this.stageType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageType() {
            this.bitField0_ &= -2;
            this.stageType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStageId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStageId() {
            return this.stageId_;
         }

         public Builder setStageId(int value) {
            this.bitField0_ |= 2;
            this.stageId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageId() {
            this.bitField0_ &= -3;
            this.stageId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureBuffsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.buffs_ = UnderPalaceMsg.S2C_RefreshBuff_5708.mutableCopy(this.buffs_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getBuffsList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.buffs_) : this.buffs_);
         }

         public int getBuffsCount() {
            return this.buffs_.size();
         }

         public int getBuffs(int index) {
            return this.buffs_.getInt(index);
         }

         public Builder setBuffs(int index, int value) {
            this.ensureBuffsIsMutable();
            this.buffs_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addBuffs(int value) {
            this.ensureBuffsIsMutable();
            this.buffs_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllBuffs(Iterable<? extends Integer> values) {
            this.ensureBuffsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.buffs_);
            this.onChanged();
            return this;
         }

         public Builder clearBuffs() {
            this.buffs_ = UnderPalaceMsg.S2C_RefreshBuff_5708.emptyIntList();
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

   public static final class S2C_BattleEnd_5709 extends GeneratedMessageV3 implements S2C_BattleEnd_5709OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGETYPE_FIELD_NUMBER = 1;
      private int stageType_;
      public static final int STAGEID_FIELD_NUMBER = 2;
      private int stageId_;
      public static final int PASSSTATE_FIELD_NUMBER = 5;
      private int passState_;
      public static final int BUFFS_FIELD_NUMBER = 3;
      private Internal.IntList buffs_;
      private byte memoizedIsInitialized;
      private static final S2C_BattleEnd_5709 DEFAULT_INSTANCE = new S2C_BattleEnd_5709();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BattleEnd_5709> PARSER = new AbstractParser<S2C_BattleEnd_5709>() {
         public S2C_BattleEnd_5709 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BattleEnd_5709(input, extensionRegistry);
         }
      };

      private S2C_BattleEnd_5709(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BattleEnd_5709() {
         this.memoizedIsInitialized = -1;
         this.buffs_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BattleEnd_5709();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BattleEnd_5709(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.stageType_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.stageId_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.buffs_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.buffs_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.buffs_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }
                        break;
                     case 40:
                        this.bitField0_ |= 4;
                        this.passState_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.buffs_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 8) != 0) {
                  this.buffs_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_BattleEnd_5709_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_BattleEnd_5709_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleEnd_5709.class, Builder.class);
      }

      public boolean hasStageType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStageType() {
         return this.stageType_;
      }

      public boolean hasStageId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStageId() {
         return this.stageId_;
      }

      public boolean hasPassState() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPassState() {
         return this.passState_;
      }

      public List<Integer> getBuffsList() {
         return this.buffs_;
      }

      public int getBuffsCount() {
         return this.buffs_.size();
      }

      public int getBuffs(int index) {
         return this.buffs_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStageType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStageId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPassState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.stageType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.stageId_);
         }

         for(int i = 0; i < this.buffs_.size(); ++i) {
            output.writeInt32(3, this.buffs_.getInt(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(5, this.passState_);
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
               size += CodedOutputStream.computeInt32Size(1, this.stageType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.stageId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.buffs_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.buffs_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getBuffsList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.passState_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BattleEnd_5709)) {
            return super.equals(obj);
         } else {
            S2C_BattleEnd_5709 other = (S2C_BattleEnd_5709)obj;
            if (this.hasStageType() != other.hasStageType()) {
               return false;
            } else if (this.hasStageType() && this.getStageType() != other.getStageType()) {
               return false;
            } else if (this.hasStageId() != other.hasStageId()) {
               return false;
            } else if (this.hasStageId() && this.getStageId() != other.getStageId()) {
               return false;
            } else if (this.hasPassState() != other.hasPassState()) {
               return false;
            } else if (this.hasPassState() && this.getPassState() != other.getPassState()) {
               return false;
            } else if (!this.getBuffsList().equals(other.getBuffsList())) {
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
            if (this.hasStageType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStageType();
            }

            if (this.hasStageId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStageId();
            }

            if (this.hasPassState()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getPassState();
            }

            if (this.getBuffsCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBuffsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BattleEnd_5709 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BattleEnd_5709)PARSER.parseFrom(data);
      }

      public static S2C_BattleEnd_5709 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleEnd_5709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleEnd_5709 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BattleEnd_5709)PARSER.parseFrom(data);
      }

      public static S2C_BattleEnd_5709 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleEnd_5709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleEnd_5709 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BattleEnd_5709)PARSER.parseFrom(data);
      }

      public static S2C_BattleEnd_5709 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleEnd_5709)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleEnd_5709 parseFrom(InputStream input) throws IOException {
         return (S2C_BattleEnd_5709)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleEnd_5709 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleEnd_5709)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleEnd_5709 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BattleEnd_5709)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BattleEnd_5709 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleEnd_5709)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleEnd_5709 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BattleEnd_5709)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleEnd_5709 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleEnd_5709)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BattleEnd_5709 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BattleEnd_5709 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BattleEnd_5709> parser() {
         return PARSER;
      }

      public Parser<S2C_BattleEnd_5709> getParserForType() {
         return PARSER;
      }

      public S2C_BattleEnd_5709 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BattleEnd_5709OrBuilder {
         private int bitField0_;
         private int stageType_;
         private int stageId_;
         private int passState_;
         private Internal.IntList buffs_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_BattleEnd_5709_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_BattleEnd_5709_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleEnd_5709.class, Builder.class);
         }

         private Builder() {
            this.buffs_ = UnderPalaceMsg.S2C_BattleEnd_5709.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.buffs_ = UnderPalaceMsg.S2C_BattleEnd_5709.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnderPalaceMsg.S2C_BattleEnd_5709.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.stageType_ = 0;
            this.bitField0_ &= -2;
            this.stageId_ = 0;
            this.bitField0_ &= -3;
            this.passState_ = 0;
            this.bitField0_ &= -5;
            this.buffs_ = UnderPalaceMsg.S2C_BattleEnd_5709.emptyIntList();
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_BattleEnd_5709_descriptor;
         }

         public S2C_BattleEnd_5709 getDefaultInstanceForType() {
            return UnderPalaceMsg.S2C_BattleEnd_5709.getDefaultInstance();
         }

         public S2C_BattleEnd_5709 build() {
            S2C_BattleEnd_5709 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BattleEnd_5709 buildPartial() {
            S2C_BattleEnd_5709 result = new S2C_BattleEnd_5709(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stageType_ = this.stageType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.stageId_ = this.stageId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.passState_ = this.passState_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.buffs_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.buffs_ = this.buffs_;
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
            if (other instanceof S2C_BattleEnd_5709) {
               return this.mergeFrom((S2C_BattleEnd_5709)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BattleEnd_5709 other) {
            if (other == UnderPalaceMsg.S2C_BattleEnd_5709.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStageType()) {
                  this.setStageType(other.getStageType());
               }

               if (other.hasStageId()) {
                  this.setStageId(other.getStageId());
               }

               if (other.hasPassState()) {
                  this.setPassState(other.getPassState());
               }

               if (!other.buffs_.isEmpty()) {
                  if (this.buffs_.isEmpty()) {
                     this.buffs_ = other.buffs_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureBuffsIsMutable();
                     this.buffs_.addAll(other.buffs_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStageType()) {
               return false;
            } else if (!this.hasStageId()) {
               return false;
            } else {
               return this.hasPassState();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BattleEnd_5709 parsedMessage = null;

            try {
               parsedMessage = (S2C_BattleEnd_5709)UnderPalaceMsg.S2C_BattleEnd_5709.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BattleEnd_5709)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStageType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStageType() {
            return this.stageType_;
         }

         public Builder setStageType(int value) {
            this.bitField0_ |= 1;
            this.stageType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageType() {
            this.bitField0_ &= -2;
            this.stageType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStageId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStageId() {
            return this.stageId_;
         }

         public Builder setStageId(int value) {
            this.bitField0_ |= 2;
            this.stageId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageId() {
            this.bitField0_ &= -3;
            this.stageId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPassState() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getPassState() {
            return this.passState_;
         }

         public Builder setPassState(int value) {
            this.bitField0_ |= 4;
            this.passState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPassState() {
            this.bitField0_ &= -5;
            this.passState_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureBuffsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.buffs_ = UnderPalaceMsg.S2C_BattleEnd_5709.mutableCopy(this.buffs_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getBuffsList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.buffs_) : this.buffs_);
         }

         public int getBuffsCount() {
            return this.buffs_.size();
         }

         public int getBuffs(int index) {
            return this.buffs_.getInt(index);
         }

         public Builder setBuffs(int index, int value) {
            this.ensureBuffsIsMutable();
            this.buffs_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addBuffs(int value) {
            this.ensureBuffsIsMutable();
            this.buffs_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllBuffs(Iterable<? extends Integer> values) {
            this.ensureBuffsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.buffs_);
            this.onChanged();
            return this;
         }

         public Builder clearBuffs() {
            this.buffs_ = UnderPalaceMsg.S2C_BattleEnd_5709.emptyIntList();
            this.bitField0_ &= -9;
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

   public static final class C2S_SweepStage_5710 extends GeneratedMessageV3 implements C2S_SweepStage_5710OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGEID_FIELD_NUMBER = 1;
      private int stageId_;
      private byte memoizedIsInitialized;
      private static final C2S_SweepStage_5710 DEFAULT_INSTANCE = new C2S_SweepStage_5710();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SweepStage_5710> PARSER = new AbstractParser<C2S_SweepStage_5710>() {
         public C2S_SweepStage_5710 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SweepStage_5710(input, extensionRegistry);
         }
      };

      private C2S_SweepStage_5710(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SweepStage_5710() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SweepStage_5710();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SweepStage_5710(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.stageId_ = input.readInt32();
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
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_SweepStage_5710_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_SweepStage_5710_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SweepStage_5710.class, Builder.class);
      }

      public boolean hasStageId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStageId() {
         return this.stageId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStageId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.stageId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.stageId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SweepStage_5710)) {
            return super.equals(obj);
         } else {
            C2S_SweepStage_5710 other = (C2S_SweepStage_5710)obj;
            if (this.hasStageId() != other.hasStageId()) {
               return false;
            } else if (this.hasStageId() && this.getStageId() != other.getStageId()) {
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
            if (this.hasStageId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStageId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SweepStage_5710 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SweepStage_5710)PARSER.parseFrom(data);
      }

      public static C2S_SweepStage_5710 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SweepStage_5710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SweepStage_5710 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SweepStage_5710)PARSER.parseFrom(data);
      }

      public static C2S_SweepStage_5710 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SweepStage_5710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SweepStage_5710 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SweepStage_5710)PARSER.parseFrom(data);
      }

      public static C2S_SweepStage_5710 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SweepStage_5710)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SweepStage_5710 parseFrom(InputStream input) throws IOException {
         return (C2S_SweepStage_5710)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SweepStage_5710 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SweepStage_5710)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SweepStage_5710 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SweepStage_5710)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SweepStage_5710 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SweepStage_5710)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SweepStage_5710 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SweepStage_5710)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SweepStage_5710 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SweepStage_5710)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SweepStage_5710 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SweepStage_5710 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SweepStage_5710> parser() {
         return PARSER;
      }

      public Parser<C2S_SweepStage_5710> getParserForType() {
         return PARSER;
      }

      public C2S_SweepStage_5710 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SweepStage_5710OrBuilder {
         private int bitField0_;
         private int stageId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_SweepStage_5710_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_SweepStage_5710_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SweepStage_5710.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnderPalaceMsg.C2S_SweepStage_5710.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.stageId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_SweepStage_5710_descriptor;
         }

         public C2S_SweepStage_5710 getDefaultInstanceForType() {
            return UnderPalaceMsg.C2S_SweepStage_5710.getDefaultInstance();
         }

         public C2S_SweepStage_5710 build() {
            C2S_SweepStage_5710 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SweepStage_5710 buildPartial() {
            C2S_SweepStage_5710 result = new C2S_SweepStage_5710(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stageId_ = this.stageId_;
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
            if (other instanceof C2S_SweepStage_5710) {
               return this.mergeFrom((C2S_SweepStage_5710)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SweepStage_5710 other) {
            if (other == UnderPalaceMsg.C2S_SweepStage_5710.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStageId()) {
                  this.setStageId(other.getStageId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasStageId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_SweepStage_5710 parsedMessage = null;

            try {
               parsedMessage = (C2S_SweepStage_5710)UnderPalaceMsg.C2S_SweepStage_5710.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SweepStage_5710)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStageId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStageId() {
            return this.stageId_;
         }

         public Builder setStageId(int value) {
            this.bitField0_ |= 1;
            this.stageId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageId() {
            this.bitField0_ &= -2;
            this.stageId_ = 0;
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

   public static final class S2C_SweepStage_5711 extends GeneratedMessageV3 implements S2C_SweepStage_5711OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGEID_FIELD_NUMBER = 1;
      private int stageId_;
      public static final int SWEEPNUM_FIELD_NUMBER = 2;
      private int sweepNum_;
      private byte memoizedIsInitialized;
      private static final S2C_SweepStage_5711 DEFAULT_INSTANCE = new S2C_SweepStage_5711();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SweepStage_5711> PARSER = new AbstractParser<S2C_SweepStage_5711>() {
         public S2C_SweepStage_5711 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SweepStage_5711(input, extensionRegistry);
         }
      };

      private S2C_SweepStage_5711(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SweepStage_5711() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SweepStage_5711();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SweepStage_5711(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.stageId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.sweepNum_ = input.readInt32();
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
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_SweepStage_5711_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_SweepStage_5711_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SweepStage_5711.class, Builder.class);
      }

      public boolean hasStageId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStageId() {
         return this.stageId_;
      }

      public boolean hasSweepNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSweepNum() {
         return this.sweepNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStageId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSweepNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.stageId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.sweepNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.stageId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.sweepNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SweepStage_5711)) {
            return super.equals(obj);
         } else {
            S2C_SweepStage_5711 other = (S2C_SweepStage_5711)obj;
            if (this.hasStageId() != other.hasStageId()) {
               return false;
            } else if (this.hasStageId() && this.getStageId() != other.getStageId()) {
               return false;
            } else if (this.hasSweepNum() != other.hasSweepNum()) {
               return false;
            } else if (this.hasSweepNum() && this.getSweepNum() != other.getSweepNum()) {
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
            if (this.hasStageId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStageId();
            }

            if (this.hasSweepNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSweepNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SweepStage_5711 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SweepStage_5711)PARSER.parseFrom(data);
      }

      public static S2C_SweepStage_5711 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SweepStage_5711)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SweepStage_5711 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SweepStage_5711)PARSER.parseFrom(data);
      }

      public static S2C_SweepStage_5711 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SweepStage_5711)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SweepStage_5711 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SweepStage_5711)PARSER.parseFrom(data);
      }

      public static S2C_SweepStage_5711 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SweepStage_5711)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SweepStage_5711 parseFrom(InputStream input) throws IOException {
         return (S2C_SweepStage_5711)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SweepStage_5711 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SweepStage_5711)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SweepStage_5711 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SweepStage_5711)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SweepStage_5711 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SweepStage_5711)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SweepStage_5711 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SweepStage_5711)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SweepStage_5711 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SweepStage_5711)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SweepStage_5711 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SweepStage_5711 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SweepStage_5711> parser() {
         return PARSER;
      }

      public Parser<S2C_SweepStage_5711> getParserForType() {
         return PARSER;
      }

      public S2C_SweepStage_5711 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SweepStage_5711OrBuilder {
         private int bitField0_;
         private int stageId_;
         private int sweepNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_SweepStage_5711_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_SweepStage_5711_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SweepStage_5711.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnderPalaceMsg.S2C_SweepStage_5711.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.stageId_ = 0;
            this.bitField0_ &= -2;
            this.sweepNum_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_SweepStage_5711_descriptor;
         }

         public S2C_SweepStage_5711 getDefaultInstanceForType() {
            return UnderPalaceMsg.S2C_SweepStage_5711.getDefaultInstance();
         }

         public S2C_SweepStage_5711 build() {
            S2C_SweepStage_5711 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SweepStage_5711 buildPartial() {
            S2C_SweepStage_5711 result = new S2C_SweepStage_5711(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stageId_ = this.stageId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.sweepNum_ = this.sweepNum_;
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
            if (other instanceof S2C_SweepStage_5711) {
               return this.mergeFrom((S2C_SweepStage_5711)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SweepStage_5711 other) {
            if (other == UnderPalaceMsg.S2C_SweepStage_5711.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStageId()) {
                  this.setStageId(other.getStageId());
               }

               if (other.hasSweepNum()) {
                  this.setSweepNum(other.getSweepNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStageId()) {
               return false;
            } else {
               return this.hasSweepNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SweepStage_5711 parsedMessage = null;

            try {
               parsedMessage = (S2C_SweepStage_5711)UnderPalaceMsg.S2C_SweepStage_5711.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SweepStage_5711)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStageId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStageId() {
            return this.stageId_;
         }

         public Builder setStageId(int value) {
            this.bitField0_ |= 1;
            this.stageId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageId() {
            this.bitField0_ &= -2;
            this.stageId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSweepNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSweepNum() {
            return this.sweepNum_;
         }

         public Builder setSweepNum(int value) {
            this.bitField0_ |= 2;
            this.sweepNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSweepNum() {
            this.bitField0_ &= -3;
            this.sweepNum_ = 0;
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

   public static final class C2S_RecZiWeiAward_5712 extends GeneratedMessageV3 implements C2S_RecZiWeiAward_5712OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGESUM_FIELD_NUMBER = 1;
      private int stageSum_;
      private byte memoizedIsInitialized;
      private static final C2S_RecZiWeiAward_5712 DEFAULT_INSTANCE = new C2S_RecZiWeiAward_5712();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecZiWeiAward_5712> PARSER = new AbstractParser<C2S_RecZiWeiAward_5712>() {
         public C2S_RecZiWeiAward_5712 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecZiWeiAward_5712(input, extensionRegistry);
         }
      };

      private C2S_RecZiWeiAward_5712(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecZiWeiAward_5712() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecZiWeiAward_5712();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecZiWeiAward_5712(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.stageSum_ = input.readInt32();
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
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_RecZiWeiAward_5712_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_RecZiWeiAward_5712_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecZiWeiAward_5712.class, Builder.class);
      }

      public boolean hasStageSum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStageSum() {
         return this.stageSum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStageSum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.stageSum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.stageSum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RecZiWeiAward_5712)) {
            return super.equals(obj);
         } else {
            C2S_RecZiWeiAward_5712 other = (C2S_RecZiWeiAward_5712)obj;
            if (this.hasStageSum() != other.hasStageSum()) {
               return false;
            } else if (this.hasStageSum() && this.getStageSum() != other.getStageSum()) {
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
            if (this.hasStageSum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStageSum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RecZiWeiAward_5712 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecZiWeiAward_5712)PARSER.parseFrom(data);
      }

      public static C2S_RecZiWeiAward_5712 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecZiWeiAward_5712)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecZiWeiAward_5712 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecZiWeiAward_5712)PARSER.parseFrom(data);
      }

      public static C2S_RecZiWeiAward_5712 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecZiWeiAward_5712)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecZiWeiAward_5712 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecZiWeiAward_5712)PARSER.parseFrom(data);
      }

      public static C2S_RecZiWeiAward_5712 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecZiWeiAward_5712)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecZiWeiAward_5712 parseFrom(InputStream input) throws IOException {
         return (C2S_RecZiWeiAward_5712)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecZiWeiAward_5712 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecZiWeiAward_5712)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecZiWeiAward_5712 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecZiWeiAward_5712)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecZiWeiAward_5712 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecZiWeiAward_5712)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecZiWeiAward_5712 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecZiWeiAward_5712)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecZiWeiAward_5712 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecZiWeiAward_5712)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecZiWeiAward_5712 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecZiWeiAward_5712 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecZiWeiAward_5712> parser() {
         return PARSER;
      }

      public Parser<C2S_RecZiWeiAward_5712> getParserForType() {
         return PARSER;
      }

      public C2S_RecZiWeiAward_5712 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecZiWeiAward_5712OrBuilder {
         private int bitField0_;
         private int stageSum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_RecZiWeiAward_5712_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_RecZiWeiAward_5712_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecZiWeiAward_5712.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnderPalaceMsg.C2S_RecZiWeiAward_5712.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.stageSum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_C2S_RecZiWeiAward_5712_descriptor;
         }

         public C2S_RecZiWeiAward_5712 getDefaultInstanceForType() {
            return UnderPalaceMsg.C2S_RecZiWeiAward_5712.getDefaultInstance();
         }

         public C2S_RecZiWeiAward_5712 build() {
            C2S_RecZiWeiAward_5712 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecZiWeiAward_5712 buildPartial() {
            C2S_RecZiWeiAward_5712 result = new C2S_RecZiWeiAward_5712(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stageSum_ = this.stageSum_;
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
            if (other instanceof C2S_RecZiWeiAward_5712) {
               return this.mergeFrom((C2S_RecZiWeiAward_5712)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecZiWeiAward_5712 other) {
            if (other == UnderPalaceMsg.C2S_RecZiWeiAward_5712.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStageSum()) {
                  this.setStageSum(other.getStageSum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasStageSum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RecZiWeiAward_5712 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecZiWeiAward_5712)UnderPalaceMsg.C2S_RecZiWeiAward_5712.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecZiWeiAward_5712)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStageSum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStageSum() {
            return this.stageSum_;
         }

         public Builder setStageSum(int value) {
            this.bitField0_ |= 1;
            this.stageSum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageSum() {
            this.bitField0_ &= -2;
            this.stageSum_ = 0;
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

   public static final class S2C_RecZiWeiAward_5713 extends GeneratedMessageV3 implements S2C_RecZiWeiAward_5713OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGESUM_FIELD_NUMBER = 1;
      private int stageSum_;
      public static final int RECZIWEIAWARD_FIELD_NUMBER = 3;
      private Internal.IntList recZiWeiAward_;
      public static final int RESULT_FIELD_NUMBER = 2;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_RecZiWeiAward_5713 DEFAULT_INSTANCE = new S2C_RecZiWeiAward_5713();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecZiWeiAward_5713> PARSER = new AbstractParser<S2C_RecZiWeiAward_5713>() {
         public S2C_RecZiWeiAward_5713 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecZiWeiAward_5713(input, extensionRegistry);
         }
      };

      private S2C_RecZiWeiAward_5713(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecZiWeiAward_5713() {
         this.memoizedIsInitialized = -1;
         this.recZiWeiAward_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecZiWeiAward_5713();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecZiWeiAward_5713(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.stageSum_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.result_ = input.readInt32();
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.recZiWeiAward_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.recZiWeiAward_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.recZiWeiAward_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.recZiWeiAward_.addInt(input.readInt32());
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
                  this.recZiWeiAward_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_RecZiWeiAward_5713_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_RecZiWeiAward_5713_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecZiWeiAward_5713.class, Builder.class);
      }

      public boolean hasStageSum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStageSum() {
         return this.stageSum_;
      }

      public List<Integer> getRecZiWeiAwardList() {
         return this.recZiWeiAward_;
      }

      public int getRecZiWeiAwardCount() {
         return this.recZiWeiAward_.size();
      }

      public int getRecZiWeiAward(int index) {
         return this.recZiWeiAward_.getInt(index);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasStageSum()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.stageSum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.result_);
         }

         for(int i = 0; i < this.recZiWeiAward_.size(); ++i) {
            output.writeInt32(3, this.recZiWeiAward_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.stageSum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.result_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.recZiWeiAward_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.recZiWeiAward_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRecZiWeiAwardList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RecZiWeiAward_5713)) {
            return super.equals(obj);
         } else {
            S2C_RecZiWeiAward_5713 other = (S2C_RecZiWeiAward_5713)obj;
            if (this.hasStageSum() != other.hasStageSum()) {
               return false;
            } else if (this.hasStageSum() && this.getStageSum() != other.getStageSum()) {
               return false;
            } else if (!this.getRecZiWeiAwardList().equals(other.getRecZiWeiAwardList())) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
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
            if (this.hasStageSum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStageSum();
            }

            if (this.getRecZiWeiAwardCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRecZiWeiAwardList().hashCode();
            }

            if (this.hasResult()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getResult();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RecZiWeiAward_5713 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecZiWeiAward_5713)PARSER.parseFrom(data);
      }

      public static S2C_RecZiWeiAward_5713 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecZiWeiAward_5713)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecZiWeiAward_5713 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecZiWeiAward_5713)PARSER.parseFrom(data);
      }

      public static S2C_RecZiWeiAward_5713 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecZiWeiAward_5713)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecZiWeiAward_5713 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecZiWeiAward_5713)PARSER.parseFrom(data);
      }

      public static S2C_RecZiWeiAward_5713 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecZiWeiAward_5713)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecZiWeiAward_5713 parseFrom(InputStream input) throws IOException {
         return (S2C_RecZiWeiAward_5713)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecZiWeiAward_5713 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecZiWeiAward_5713)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecZiWeiAward_5713 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecZiWeiAward_5713)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecZiWeiAward_5713 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecZiWeiAward_5713)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecZiWeiAward_5713 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecZiWeiAward_5713)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecZiWeiAward_5713 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecZiWeiAward_5713)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecZiWeiAward_5713 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecZiWeiAward_5713 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecZiWeiAward_5713> parser() {
         return PARSER;
      }

      public Parser<S2C_RecZiWeiAward_5713> getParserForType() {
         return PARSER;
      }

      public S2C_RecZiWeiAward_5713 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecZiWeiAward_5713OrBuilder {
         private int bitField0_;
         private int stageSum_;
         private Internal.IntList recZiWeiAward_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_RecZiWeiAward_5713_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_RecZiWeiAward_5713_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecZiWeiAward_5713.class, Builder.class);
         }

         private Builder() {
            this.recZiWeiAward_ = UnderPalaceMsg.S2C_RecZiWeiAward_5713.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.recZiWeiAward_ = UnderPalaceMsg.S2C_RecZiWeiAward_5713.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnderPalaceMsg.S2C_RecZiWeiAward_5713.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.stageSum_ = 0;
            this.bitField0_ &= -2;
            this.recZiWeiAward_ = UnderPalaceMsg.S2C_RecZiWeiAward_5713.emptyIntList();
            this.bitField0_ &= -3;
            this.result_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnderPalaceMsg.internal_static_underPalace_com_gzbz_protobuf_S2C_RecZiWeiAward_5713_descriptor;
         }

         public S2C_RecZiWeiAward_5713 getDefaultInstanceForType() {
            return UnderPalaceMsg.S2C_RecZiWeiAward_5713.getDefaultInstance();
         }

         public S2C_RecZiWeiAward_5713 build() {
            S2C_RecZiWeiAward_5713 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecZiWeiAward_5713 buildPartial() {
            S2C_RecZiWeiAward_5713 result = new S2C_RecZiWeiAward_5713(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stageSum_ = this.stageSum_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.recZiWeiAward_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.recZiWeiAward_ = this.recZiWeiAward_;
            if ((from_bitField0_ & 4) != 0) {
               result.result_ = this.result_;
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
            if (other instanceof S2C_RecZiWeiAward_5713) {
               return this.mergeFrom((S2C_RecZiWeiAward_5713)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecZiWeiAward_5713 other) {
            if (other == UnderPalaceMsg.S2C_RecZiWeiAward_5713.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStageSum()) {
                  this.setStageSum(other.getStageSum());
               }

               if (!other.recZiWeiAward_.isEmpty()) {
                  if (this.recZiWeiAward_.isEmpty()) {
                     this.recZiWeiAward_ = other.recZiWeiAward_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureRecZiWeiAwardIsMutable();
                     this.recZiWeiAward_.addAll(other.recZiWeiAward_);
                  }

                  this.onChanged();
               }

               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStageSum()) {
               return false;
            } else {
               return this.hasResult();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RecZiWeiAward_5713 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecZiWeiAward_5713)UnderPalaceMsg.S2C_RecZiWeiAward_5713.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecZiWeiAward_5713)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStageSum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStageSum() {
            return this.stageSum_;
         }

         public Builder setStageSum(int value) {
            this.bitField0_ |= 1;
            this.stageSum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageSum() {
            this.bitField0_ &= -2;
            this.stageSum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRecZiWeiAwardIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.recZiWeiAward_ = UnderPalaceMsg.S2C_RecZiWeiAward_5713.mutableCopy(this.recZiWeiAward_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getRecZiWeiAwardList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.recZiWeiAward_) : this.recZiWeiAward_);
         }

         public int getRecZiWeiAwardCount() {
            return this.recZiWeiAward_.size();
         }

         public int getRecZiWeiAward(int index) {
            return this.recZiWeiAward_.getInt(index);
         }

         public Builder setRecZiWeiAward(int index, int value) {
            this.ensureRecZiWeiAwardIsMutable();
            this.recZiWeiAward_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRecZiWeiAward(int value) {
            this.ensureRecZiWeiAwardIsMutable();
            this.recZiWeiAward_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRecZiWeiAward(Iterable<? extends Integer> values) {
            this.ensureRecZiWeiAwardIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recZiWeiAward_);
            this.onChanged();
            return this;
         }

         public Builder clearRecZiWeiAward() {
            this.recZiWeiAward_ = UnderPalaceMsg.S2C_RecZiWeiAward_5713.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 4;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -5;
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

   public interface C2S_RecZiWeiAward_5712OrBuilder extends MessageOrBuilder {
      boolean hasStageSum();

      int getStageSum();
   }

   public interface C2S_ReceiveCommonAward_5703OrBuilder extends MessageOrBuilder {
      boolean hasStageSum();

      int getStageSum();
   }

   public interface C2S_ReceiveExtraAward_5705OrBuilder extends MessageOrBuilder {
      boolean hasStageSum();

      int getStageSum();
   }

   public interface C2S_RefreshBuff_5707OrBuilder extends MessageOrBuilder {
      boolean hasStageType();

      int getStageType();

      boolean hasStageId();

      int getStageId();
   }

   public interface C2S_SweepStage_5710OrBuilder extends MessageOrBuilder {
      boolean hasStageId();

      int getStageId();
   }

   public interface C2S_UnderPalaceInfo_5701OrBuilder extends MessageOrBuilder {
   }

   public interface PalaceInfoOrBuilder extends MessageOrBuilder {
      boolean hasStageType();

      int getStageType();

      boolean hasStageId();

      int getStageId();

      List<Integer> getBuffsList();

      int getBuffsCount();

      int getBuffs(int index);

      boolean hasPassState();

      int getPassState();
   }

   public interface S2C_BattleEnd_5709OrBuilder extends MessageOrBuilder {
      boolean hasStageType();

      int getStageType();

      boolean hasStageId();

      int getStageId();

      boolean hasPassState();

      int getPassState();

      List<Integer> getBuffsList();

      int getBuffsCount();

      int getBuffs(int index);
   }

   public interface S2C_RecZiWeiAward_5713OrBuilder extends MessageOrBuilder {
      boolean hasStageSum();

      int getStageSum();

      List<Integer> getRecZiWeiAwardList();

      int getRecZiWeiAwardCount();

      int getRecZiWeiAward(int index);

      boolean hasResult();

      int getResult();
   }

   public interface S2C_ReceiveCommonAward_5704OrBuilder extends MessageOrBuilder {
      boolean hasStageSum();

      int getStageSum();

      List<Integer> getReceiveAwardList();

      int getReceiveAwardCount();

      int getReceiveAward(int index);

      boolean hasResult();

      int getResult();
   }

   public interface S2C_ReceiveExtraAward_5706OrBuilder extends MessageOrBuilder {
      boolean hasStageSum();

      int getStageSum();

      List<Integer> getReceiveExtraList();

      int getReceiveExtraCount();

      int getReceiveExtra(int index);

      boolean hasResult();

      int getResult();
   }

   public interface S2C_RefreshBuff_5708OrBuilder extends MessageOrBuilder {
      boolean hasStageType();

      int getStageType();

      boolean hasStageId();

      int getStageId();

      List<Integer> getBuffsList();

      int getBuffsCount();

      int getBuffs(int index);
   }

   public interface S2C_SweepStage_5711OrBuilder extends MessageOrBuilder {
      boolean hasStageId();

      int getStageId();

      boolean hasSweepNum();

      int getSweepNum();
   }

   public interface S2C_UnderPalaceInfo_5702OrBuilder extends MessageOrBuilder {
      List<PalaceInfo> getInfoList();

      PalaceInfo getInfo(int index);

      int getInfoCount();

      List<? extends PalaceInfoOrBuilder> getInfoOrBuilderList();

      PalaceInfoOrBuilder getInfoOrBuilder(int index);

      boolean hasPassSum();

      int getPassSum();

      List<Integer> getReceiveExtraList();

      int getReceiveExtraCount();

      int getReceiveExtra(int index);

      List<Integer> getCommonAwardList();

      int getCommonAwardCount();

      int getCommonAward(int index);

      boolean hasSweepNum();

      int getSweepNum();

      List<Integer> getRecZiWeiAwardList();

      int getRecZiWeiAwardCount();

      int getRecZiWeiAward(int index);
   }
}
