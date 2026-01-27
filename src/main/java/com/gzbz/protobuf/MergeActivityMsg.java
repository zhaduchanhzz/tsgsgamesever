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

public final class MergeActivityMsg {
   private static final Descriptors.Descriptor internal_static_mergeActivity_com_gzbz_protobuf_C2S_LiYu_18901_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeActivity_com_gzbz_protobuf_C2S_LiYu_18901_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeActivity_com_gzbz_protobuf_S2C_LiYu_18902_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeActivity_com_gzbz_protobuf_S2C_LiYu_18902_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeActivity_com_gzbz_protobuf_C2S_FancyReward_18911_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeActivity_com_gzbz_protobuf_C2S_FancyReward_18911_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeActivity_com_gzbz_protobuf_S2C_FancyReward_18912_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeActivity_com_gzbz_protobuf_S2C_FancyReward_18912_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeActivity_com_gzbz_protobuf_C2S_SmashEgg_18913_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeActivity_com_gzbz_protobuf_C2S_SmashEgg_18913_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeActivity_com_gzbz_protobuf_S2C_SmashEgg_18914_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeActivity_com_gzbz_protobuf_S2C_SmashEgg_18914_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeActivity_com_gzbz_protobuf_C2S_TakeLuckReward_18915_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeActivity_com_gzbz_protobuf_C2S_TakeLuckReward_18915_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeActivity_com_gzbz_protobuf_S2C_TakeLuckReward_18916_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeActivity_com_gzbz_protobuf_S2C_TakeLuckReward_18916_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeActivity_com_gzbz_protobuf_C2S_OpenEggUi_18917_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeActivity_com_gzbz_protobuf_C2S_OpenEggUi_18917_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeActivity_com_gzbz_protobuf_S2C_OpenEggUi_18918_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeActivity_com_gzbz_protobuf_S2C_OpenEggUi_18918_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeActivity_com_gzbz_protobuf_C2S_SignTotalInfo_18931_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeActivity_com_gzbz_protobuf_C2S_SignTotalInfo_18931_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeActivity_com_gzbz_protobuf_S2C_SignTotalInfo_18932_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeActivity_com_gzbz_protobuf_S2C_SignTotalInfo_18932_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeActivity_com_gzbz_protobuf_C2S_Sign_18933_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeActivity_com_gzbz_protobuf_C2S_Sign_18933_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeActivity_com_gzbz_protobuf_C2S_AddUpSign_18934_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeActivity_com_gzbz_protobuf_C2S_AddUpSign_18934_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeActivity_com_gzbz_protobuf_C2S_RushRankInfo_18935_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeActivity_com_gzbz_protobuf_C2S_RushRankInfo_18935_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeActivity_com_gzbz_protobuf_S2C_RushRankInfo_18936_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeActivity_com_gzbz_protobuf_S2C_RushRankInfo_18936_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mergeActivity_com_gzbz_protobuf_S2C_MergeSubActivityInfo_18937_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mergeActivity_com_gzbz_protobuf_S2C_MergeSubActivityInfo_18937_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private MergeActivityMsg() {
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
      String[] descriptorData = new String[]{"\n\u0013MergeActivity.proto\u0012\u001fmergeActivity.com.gzbz.protobuf\u001a\fcommon.proto\"\u0010\n\u000eC2S_LiYu_18901\"U\n\u000eS2C_LiYu_18902\u0012\u0011\n\tstartTime\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005inDay\u0018\u0003 \u0002(\u0005\u0012\u0010\n\btodayVip\u0018\u0004 \u0002(\u0005\"*\n\u0015C2S_FancyReward_18911\u0012\u0011\n\titemIndex\u0018\u0001 \u0002(\u0005\":\n\u0015S2C_FancyReward_18912\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0011\n\titemIndex\u0018\u0002 \u0002(\u0005\"!\n\u0012C2S_SmashEgg_18913\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\"\u0091\u0001\n\u0012S2C_SmashEgg_18914\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012$\n\tseniorNum\u0018\u0002 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0013\n\u000bsmashEggNum\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000bisHaveFancy\u0018\u0004 \u0001(\b\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\u0005 \u0002(\u0005\",\n\u0018C2S_TakeLuckReward_18915\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\";\n\u0018S2C_TakeLuckReward_18916\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007takedId\u0018\u0002 \u0003(\u0005\"\u0015\n\u0013C2S_OpenEggUi_18917\"¬\u0001\n\u0013S2C_OpenEggUi_18918\u0012\u000f\n\u0007fancyId\u0018\u0001 \u0002(\u0005\u0012(\n\rseniorRewards\u0018\u0002 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0013\n\u000bsmashEggNum\u0018\u0003 \u0002(\u0005\u0012\u0011\n\ttakedLuck\u0018\u0004 \u0003(\u0005\u0012\u0015\n\rsmashEggStage\u0018\u0005 \u0002(\u0005\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\u0006 \u0002(\u0005\"\u0019\n\u0017C2S_SignTotalInfo_18931\"F\n\u0017S2C_SignTotalInfo_18932\u0012\u0013\n\u000bactivityDay\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000esignGotRewards\u0018\u0002 \u0003(\u0005\"\u001d\n\u000eC2S_Sign_18933\u0012\u000b\n\u0003day\u0018\u0001 \u0002(\u0005\"\"\n\u0013C2S_AddUpSign_18934\u0012\u000b\n\u0003day\u0018\u0001 \u0002(\u0005\"\u0018\n\u0016C2S_RushRankInfo_18935\"B\n\u0016S2C_RushRankInfo_18936\u0012\u0012\n\nrushRankId\u0018\u0001 \u0002(\u0005\u0012\u0014\n\fstageEndTime\u0018\u0002 \u0002(\u0003\"Y\n\u001eS2C_MergeSubActivityInfo_18937\u0012\u0014\n\factivityType\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bopenTime\u0018\u0002 \u0002(\u0003\u0012\u000f\n\u0007endTime\u0018\u0003 \u0002(\u0003B'\n\u0011com.gzbz.protobufB\u0010MergeActivityMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_mergeActivity_com_gzbz_protobuf_C2S_LiYu_18901_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_mergeActivity_com_gzbz_protobuf_C2S_LiYu_18901_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeActivity_com_gzbz_protobuf_C2S_LiYu_18901_descriptor, new String[0]);
      internal_static_mergeActivity_com_gzbz_protobuf_S2C_LiYu_18902_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_mergeActivity_com_gzbz_protobuf_S2C_LiYu_18902_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeActivity_com_gzbz_protobuf_S2C_LiYu_18902_descriptor, new String[]{"StartTime", "EndTime", "InDay", "TodayVip"});
      internal_static_mergeActivity_com_gzbz_protobuf_C2S_FancyReward_18911_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_mergeActivity_com_gzbz_protobuf_C2S_FancyReward_18911_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeActivity_com_gzbz_protobuf_C2S_FancyReward_18911_descriptor, new String[]{"ItemIndex"});
      internal_static_mergeActivity_com_gzbz_protobuf_S2C_FancyReward_18912_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_mergeActivity_com_gzbz_protobuf_S2C_FancyReward_18912_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeActivity_com_gzbz_protobuf_S2C_FancyReward_18912_descriptor, new String[]{"Result", "ItemIndex"});
      internal_static_mergeActivity_com_gzbz_protobuf_C2S_SmashEgg_18913_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_mergeActivity_com_gzbz_protobuf_C2S_SmashEgg_18913_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeActivity_com_gzbz_protobuf_C2S_SmashEgg_18913_descriptor, new String[]{"Num"});
      internal_static_mergeActivity_com_gzbz_protobuf_S2C_SmashEgg_18914_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_mergeActivity_com_gzbz_protobuf_S2C_SmashEgg_18914_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeActivity_com_gzbz_protobuf_S2C_SmashEgg_18914_descriptor, new String[]{"Result", "SeniorNum", "SmashEggNum", "IsHaveFancy", "FancyGroupDrawTimes"});
      internal_static_mergeActivity_com_gzbz_protobuf_C2S_TakeLuckReward_18915_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_mergeActivity_com_gzbz_protobuf_C2S_TakeLuckReward_18915_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeActivity_com_gzbz_protobuf_C2S_TakeLuckReward_18915_descriptor, new String[]{"RewardId"});
      internal_static_mergeActivity_com_gzbz_protobuf_S2C_TakeLuckReward_18916_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_mergeActivity_com_gzbz_protobuf_S2C_TakeLuckReward_18916_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeActivity_com_gzbz_protobuf_S2C_TakeLuckReward_18916_descriptor, new String[]{"Result", "TakedId"});
      internal_static_mergeActivity_com_gzbz_protobuf_C2S_OpenEggUi_18917_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_mergeActivity_com_gzbz_protobuf_C2S_OpenEggUi_18917_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeActivity_com_gzbz_protobuf_C2S_OpenEggUi_18917_descriptor, new String[0]);
      internal_static_mergeActivity_com_gzbz_protobuf_S2C_OpenEggUi_18918_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_mergeActivity_com_gzbz_protobuf_S2C_OpenEggUi_18918_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeActivity_com_gzbz_protobuf_S2C_OpenEggUi_18918_descriptor, new String[]{"FancyId", "SeniorRewards", "SmashEggNum", "TakedLuck", "SmashEggStage", "FancyGroupDrawTimes"});
      internal_static_mergeActivity_com_gzbz_protobuf_C2S_SignTotalInfo_18931_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_mergeActivity_com_gzbz_protobuf_C2S_SignTotalInfo_18931_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeActivity_com_gzbz_protobuf_C2S_SignTotalInfo_18931_descriptor, new String[0]);
      internal_static_mergeActivity_com_gzbz_protobuf_S2C_SignTotalInfo_18932_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_mergeActivity_com_gzbz_protobuf_S2C_SignTotalInfo_18932_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeActivity_com_gzbz_protobuf_S2C_SignTotalInfo_18932_descriptor, new String[]{"ActivityDay", "SignGotRewards"});
      internal_static_mergeActivity_com_gzbz_protobuf_C2S_Sign_18933_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_mergeActivity_com_gzbz_protobuf_C2S_Sign_18933_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeActivity_com_gzbz_protobuf_C2S_Sign_18933_descriptor, new String[]{"Day"});
      internal_static_mergeActivity_com_gzbz_protobuf_C2S_AddUpSign_18934_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_mergeActivity_com_gzbz_protobuf_C2S_AddUpSign_18934_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeActivity_com_gzbz_protobuf_C2S_AddUpSign_18934_descriptor, new String[]{"Day"});
      internal_static_mergeActivity_com_gzbz_protobuf_C2S_RushRankInfo_18935_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_mergeActivity_com_gzbz_protobuf_C2S_RushRankInfo_18935_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeActivity_com_gzbz_protobuf_C2S_RushRankInfo_18935_descriptor, new String[0]);
      internal_static_mergeActivity_com_gzbz_protobuf_S2C_RushRankInfo_18936_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_mergeActivity_com_gzbz_protobuf_S2C_RushRankInfo_18936_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeActivity_com_gzbz_protobuf_S2C_RushRankInfo_18936_descriptor, new String[]{"RushRankId", "StageEndTime"});
      internal_static_mergeActivity_com_gzbz_protobuf_S2C_MergeSubActivityInfo_18937_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_mergeActivity_com_gzbz_protobuf_S2C_MergeSubActivityInfo_18937_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mergeActivity_com_gzbz_protobuf_S2C_MergeSubActivityInfo_18937_descriptor, new String[]{"ActivityType", "OpenTime", "EndTime"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_LiYu_18901 extends GeneratedMessageV3 implements C2S_LiYu_18901OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LiYu_18901 DEFAULT_INSTANCE = new C2S_LiYu_18901();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LiYu_18901> PARSER = new AbstractParser<C2S_LiYu_18901>() {
         public C2S_LiYu_18901 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LiYu_18901(input, extensionRegistry);
         }
      };

      private C2S_LiYu_18901(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LiYu_18901() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LiYu_18901();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LiYu_18901(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_LiYu_18901_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_LiYu_18901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LiYu_18901.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LiYu_18901)) {
            return super.equals(obj);
         } else {
            C2S_LiYu_18901 other = (C2S_LiYu_18901)obj;
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

      public static C2S_LiYu_18901 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LiYu_18901)PARSER.parseFrom(data);
      }

      public static C2S_LiYu_18901 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LiYu_18901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LiYu_18901 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LiYu_18901)PARSER.parseFrom(data);
      }

      public static C2S_LiYu_18901 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LiYu_18901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LiYu_18901 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LiYu_18901)PARSER.parseFrom(data);
      }

      public static C2S_LiYu_18901 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LiYu_18901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LiYu_18901 parseFrom(InputStream input) throws IOException {
         return (C2S_LiYu_18901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LiYu_18901 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LiYu_18901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LiYu_18901 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LiYu_18901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LiYu_18901 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LiYu_18901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LiYu_18901 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LiYu_18901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LiYu_18901 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LiYu_18901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LiYu_18901 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LiYu_18901 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LiYu_18901> parser() {
         return PARSER;
      }

      public Parser<C2S_LiYu_18901> getParserForType() {
         return PARSER;
      }

      public C2S_LiYu_18901 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LiYu_18901OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_LiYu_18901_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_LiYu_18901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LiYu_18901.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeActivityMsg.C2S_LiYu_18901.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_LiYu_18901_descriptor;
         }

         public C2S_LiYu_18901 getDefaultInstanceForType() {
            return MergeActivityMsg.C2S_LiYu_18901.getDefaultInstance();
         }

         public C2S_LiYu_18901 build() {
            C2S_LiYu_18901 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LiYu_18901 buildPartial() {
            C2S_LiYu_18901 result = new C2S_LiYu_18901(this);
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
            if (other instanceof C2S_LiYu_18901) {
               return this.mergeFrom((C2S_LiYu_18901)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LiYu_18901 other) {
            if (other == MergeActivityMsg.C2S_LiYu_18901.getDefaultInstance()) {
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
            C2S_LiYu_18901 parsedMessage = null;

            try {
               parsedMessage = (C2S_LiYu_18901)MergeActivityMsg.C2S_LiYu_18901.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LiYu_18901)e.getUnfinishedMessage();
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

   public static final class S2C_LiYu_18902 extends GeneratedMessageV3 implements S2C_LiYu_18902OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STARTTIME_FIELD_NUMBER = 1;
      private int startTime_;
      public static final int ENDTIME_FIELD_NUMBER = 2;
      private int endTime_;
      public static final int INDAY_FIELD_NUMBER = 3;
      private int inDay_;
      public static final int TODAYVIP_FIELD_NUMBER = 4;
      private int todayVip_;
      private byte memoizedIsInitialized;
      private static final S2C_LiYu_18902 DEFAULT_INSTANCE = new S2C_LiYu_18902();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LiYu_18902> PARSER = new AbstractParser<S2C_LiYu_18902>() {
         public S2C_LiYu_18902 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LiYu_18902(input, extensionRegistry);
         }
      };

      private S2C_LiYu_18902(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LiYu_18902() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LiYu_18902();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LiYu_18902(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.startTime_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.endTime_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.inDay_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.todayVip_ = input.readInt32();
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
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_LiYu_18902_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_LiYu_18902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LiYu_18902.class, Builder.class);
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public boolean hasInDay() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getInDay() {
         return this.inDay_;
      }

      public boolean hasTodayVip() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getTodayVip() {
         return this.todayVip_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStartTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasInDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTodayVip()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.startTime_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.endTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.inDay_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.todayVip_);
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
               size += CodedOutputStream.computeInt32Size(1, this.startTime_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.endTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.inDay_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.todayVip_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LiYu_18902)) {
            return super.equals(obj);
         } else {
            S2C_LiYu_18902 other = (S2C_LiYu_18902)obj;
            if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasInDay() != other.hasInDay()) {
               return false;
            } else if (this.hasInDay() && this.getInDay() != other.getInDay()) {
               return false;
            } else if (this.hasTodayVip() != other.hasTodayVip()) {
               return false;
            } else if (this.hasTodayVip() && this.getTodayVip() != other.getTodayVip()) {
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
            if (this.hasStartTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStartTime();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.hasInDay()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getInDay();
            }

            if (this.hasTodayVip()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTodayVip();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LiYu_18902 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LiYu_18902)PARSER.parseFrom(data);
      }

      public static S2C_LiYu_18902 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LiYu_18902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LiYu_18902 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LiYu_18902)PARSER.parseFrom(data);
      }

      public static S2C_LiYu_18902 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LiYu_18902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LiYu_18902 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LiYu_18902)PARSER.parseFrom(data);
      }

      public static S2C_LiYu_18902 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LiYu_18902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LiYu_18902 parseFrom(InputStream input) throws IOException {
         return (S2C_LiYu_18902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LiYu_18902 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LiYu_18902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LiYu_18902 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LiYu_18902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LiYu_18902 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LiYu_18902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LiYu_18902 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LiYu_18902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LiYu_18902 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LiYu_18902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LiYu_18902 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LiYu_18902 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LiYu_18902> parser() {
         return PARSER;
      }

      public Parser<S2C_LiYu_18902> getParserForType() {
         return PARSER;
      }

      public S2C_LiYu_18902 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LiYu_18902OrBuilder {
         private int bitField0_;
         private int startTime_;
         private int endTime_;
         private int inDay_;
         private int todayVip_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_LiYu_18902_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_LiYu_18902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LiYu_18902.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeActivityMsg.S2C_LiYu_18902.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.startTime_ = 0;
            this.bitField0_ &= -2;
            this.endTime_ = 0;
            this.bitField0_ &= -3;
            this.inDay_ = 0;
            this.bitField0_ &= -5;
            this.todayVip_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_LiYu_18902_descriptor;
         }

         public S2C_LiYu_18902 getDefaultInstanceForType() {
            return MergeActivityMsg.S2C_LiYu_18902.getDefaultInstance();
         }

         public S2C_LiYu_18902 build() {
            S2C_LiYu_18902 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LiYu_18902 buildPartial() {
            S2C_LiYu_18902 result = new S2C_LiYu_18902(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.inDay_ = this.inDay_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.todayVip_ = this.todayVip_;
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
            if (other instanceof S2C_LiYu_18902) {
               return this.mergeFrom((S2C_LiYu_18902)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LiYu_18902 other) {
            if (other == MergeActivityMsg.S2C_LiYu_18902.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasInDay()) {
                  this.setInDay(other.getInDay());
               }

               if (other.hasTodayVip()) {
                  this.setTodayVip(other.getTodayVip());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStartTime()) {
               return false;
            } else if (!this.hasEndTime()) {
               return false;
            } else if (!this.hasInDay()) {
               return false;
            } else {
               return this.hasTodayVip();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LiYu_18902 parsedMessage = null;

            try {
               parsedMessage = (S2C_LiYu_18902)MergeActivityMsg.S2C_LiYu_18902.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LiYu_18902)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStartTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(int value) {
            this.bitField0_ |= 1;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -2;
            this.startTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 2;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -3;
            this.endTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasInDay() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getInDay() {
            return this.inDay_;
         }

         public Builder setInDay(int value) {
            this.bitField0_ |= 4;
            this.inDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearInDay() {
            this.bitField0_ &= -5;
            this.inDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTodayVip() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getTodayVip() {
            return this.todayVip_;
         }

         public Builder setTodayVip(int value) {
            this.bitField0_ |= 8;
            this.todayVip_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTodayVip() {
            this.bitField0_ &= -9;
            this.todayVip_ = 0;
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

   public static final class C2S_FancyReward_18911 extends GeneratedMessageV3 implements C2S_FancyReward_18911OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMINDEX_FIELD_NUMBER = 1;
      private int itemIndex_;
      private byte memoizedIsInitialized;
      private static final C2S_FancyReward_18911 DEFAULT_INSTANCE = new C2S_FancyReward_18911();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FancyReward_18911> PARSER = new AbstractParser<C2S_FancyReward_18911>() {
         public C2S_FancyReward_18911 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FancyReward_18911(input, extensionRegistry);
         }
      };

      private C2S_FancyReward_18911(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FancyReward_18911() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FancyReward_18911();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FancyReward_18911(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.itemIndex_ = input.readInt32();
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
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_FancyReward_18911_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_FancyReward_18911_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_18911.class, Builder.class);
      }

      public boolean hasItemIndex() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getItemIndex() {
         return this.itemIndex_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasItemIndex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.itemIndex_);
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
               size += CodedOutputStream.computeInt32Size(1, this.itemIndex_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FancyReward_18911)) {
            return super.equals(obj);
         } else {
            C2S_FancyReward_18911 other = (C2S_FancyReward_18911)obj;
            if (this.hasItemIndex() != other.hasItemIndex()) {
               return false;
            } else if (this.hasItemIndex() && this.getItemIndex() != other.getItemIndex()) {
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
            if (this.hasItemIndex()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemIndex();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FancyReward_18911 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_18911)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_18911 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_18911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_18911 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_18911)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_18911 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_18911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_18911 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_18911)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_18911 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_18911)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_18911 parseFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_18911)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_18911 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_18911)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_18911 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_18911)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_18911 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_18911)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_18911 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FancyReward_18911)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_18911 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_18911)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FancyReward_18911 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FancyReward_18911 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FancyReward_18911> parser() {
         return PARSER;
      }

      public Parser<C2S_FancyReward_18911> getParserForType() {
         return PARSER;
      }

      public C2S_FancyReward_18911 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FancyReward_18911OrBuilder {
         private int bitField0_;
         private int itemIndex_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_FancyReward_18911_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_FancyReward_18911_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_18911.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeActivityMsg.C2S_FancyReward_18911.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemIndex_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_FancyReward_18911_descriptor;
         }

         public C2S_FancyReward_18911 getDefaultInstanceForType() {
            return MergeActivityMsg.C2S_FancyReward_18911.getDefaultInstance();
         }

         public C2S_FancyReward_18911 build() {
            C2S_FancyReward_18911 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FancyReward_18911 buildPartial() {
            C2S_FancyReward_18911 result = new C2S_FancyReward_18911(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.itemIndex_ = this.itemIndex_;
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
            if (other instanceof C2S_FancyReward_18911) {
               return this.mergeFrom((C2S_FancyReward_18911)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FancyReward_18911 other) {
            if (other == MergeActivityMsg.C2S_FancyReward_18911.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasItemIndex()) {
                  this.setItemIndex(other.getItemIndex());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasItemIndex();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_FancyReward_18911 parsedMessage = null;

            try {
               parsedMessage = (C2S_FancyReward_18911)MergeActivityMsg.C2S_FancyReward_18911.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FancyReward_18911)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasItemIndex() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getItemIndex() {
            return this.itemIndex_;
         }

         public Builder setItemIndex(int value) {
            this.bitField0_ |= 1;
            this.itemIndex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemIndex() {
            this.bitField0_ &= -2;
            this.itemIndex_ = 0;
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

   public static final class S2C_FancyReward_18912 extends GeneratedMessageV3 implements S2C_FancyReward_18912OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int ITEMINDEX_FIELD_NUMBER = 2;
      private int itemIndex_;
      private byte memoizedIsInitialized;
      private static final S2C_FancyReward_18912 DEFAULT_INSTANCE = new S2C_FancyReward_18912();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FancyReward_18912> PARSER = new AbstractParser<S2C_FancyReward_18912>() {
         public S2C_FancyReward_18912 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FancyReward_18912(input, extensionRegistry);
         }
      };

      private S2C_FancyReward_18912(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FancyReward_18912() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FancyReward_18912();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FancyReward_18912(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.itemIndex_ = input.readInt32();
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
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_FancyReward_18912_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_FancyReward_18912_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_18912.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasItemIndex() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getItemIndex() {
         return this.itemIndex_;
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
         } else if (!this.hasItemIndex()) {
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
            output.writeInt32(2, this.itemIndex_);
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
               size += CodedOutputStream.computeInt32Size(2, this.itemIndex_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FancyReward_18912)) {
            return super.equals(obj);
         } else {
            S2C_FancyReward_18912 other = (S2C_FancyReward_18912)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasItemIndex() != other.hasItemIndex()) {
               return false;
            } else if (this.hasItemIndex() && this.getItemIndex() != other.getItemIndex()) {
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

            if (this.hasItemIndex()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemIndex();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FancyReward_18912 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_18912)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_18912 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_18912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_18912 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_18912)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_18912 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_18912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_18912 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_18912)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_18912 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_18912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_18912 parseFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_18912)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_18912 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_18912)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_18912 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_18912)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_18912 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_18912)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_18912 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FancyReward_18912)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_18912 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_18912)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FancyReward_18912 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FancyReward_18912 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FancyReward_18912> parser() {
         return PARSER;
      }

      public Parser<S2C_FancyReward_18912> getParserForType() {
         return PARSER;
      }

      public S2C_FancyReward_18912 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FancyReward_18912OrBuilder {
         private int bitField0_;
         private int result_;
         private int itemIndex_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_FancyReward_18912_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_FancyReward_18912_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_18912.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeActivityMsg.S2C_FancyReward_18912.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.itemIndex_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_FancyReward_18912_descriptor;
         }

         public S2C_FancyReward_18912 getDefaultInstanceForType() {
            return MergeActivityMsg.S2C_FancyReward_18912.getDefaultInstance();
         }

         public S2C_FancyReward_18912 build() {
            S2C_FancyReward_18912 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FancyReward_18912 buildPartial() {
            S2C_FancyReward_18912 result = new S2C_FancyReward_18912(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.itemIndex_ = this.itemIndex_;
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
            if (other instanceof S2C_FancyReward_18912) {
               return this.mergeFrom((S2C_FancyReward_18912)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FancyReward_18912 other) {
            if (other == MergeActivityMsg.S2C_FancyReward_18912.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasItemIndex()) {
                  this.setItemIndex(other.getItemIndex());
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
               return this.hasItemIndex();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FancyReward_18912 parsedMessage = null;

            try {
               parsedMessage = (S2C_FancyReward_18912)MergeActivityMsg.S2C_FancyReward_18912.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FancyReward_18912)e.getUnfinishedMessage();
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

         public boolean hasItemIndex() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getItemIndex() {
            return this.itemIndex_;
         }

         public Builder setItemIndex(int value) {
            this.bitField0_ |= 2;
            this.itemIndex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemIndex() {
            this.bitField0_ &= -3;
            this.itemIndex_ = 0;
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

   public static final class C2S_SmashEgg_18913 extends GeneratedMessageV3 implements C2S_SmashEgg_18913OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_SmashEgg_18913 DEFAULT_INSTANCE = new C2S_SmashEgg_18913();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SmashEgg_18913> PARSER = new AbstractParser<C2S_SmashEgg_18913>() {
         public C2S_SmashEgg_18913 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SmashEgg_18913(input, extensionRegistry);
         }
      };

      private C2S_SmashEgg_18913(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SmashEgg_18913() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SmashEgg_18913();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SmashEgg_18913(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_SmashEgg_18913_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_SmashEgg_18913_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SmashEgg_18913.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SmashEgg_18913)) {
            return super.equals(obj);
         } else {
            C2S_SmashEgg_18913 other = (C2S_SmashEgg_18913)obj;
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

      public static C2S_SmashEgg_18913 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_18913)PARSER.parseFrom(data);
      }

      public static C2S_SmashEgg_18913 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_18913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SmashEgg_18913 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_18913)PARSER.parseFrom(data);
      }

      public static C2S_SmashEgg_18913 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_18913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SmashEgg_18913 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_18913)PARSER.parseFrom(data);
      }

      public static C2S_SmashEgg_18913 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_18913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SmashEgg_18913 parseFrom(InputStream input) throws IOException {
         return (C2S_SmashEgg_18913)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SmashEgg_18913 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SmashEgg_18913)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SmashEgg_18913 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SmashEgg_18913)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SmashEgg_18913 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SmashEgg_18913)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SmashEgg_18913 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SmashEgg_18913)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SmashEgg_18913 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SmashEgg_18913)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SmashEgg_18913 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SmashEgg_18913 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SmashEgg_18913> parser() {
         return PARSER;
      }

      public Parser<C2S_SmashEgg_18913> getParserForType() {
         return PARSER;
      }

      public C2S_SmashEgg_18913 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SmashEgg_18913OrBuilder {
         private int bitField0_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_SmashEgg_18913_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_SmashEgg_18913_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SmashEgg_18913.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeActivityMsg.C2S_SmashEgg_18913.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_SmashEgg_18913_descriptor;
         }

         public C2S_SmashEgg_18913 getDefaultInstanceForType() {
            return MergeActivityMsg.C2S_SmashEgg_18913.getDefaultInstance();
         }

         public C2S_SmashEgg_18913 build() {
            C2S_SmashEgg_18913 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SmashEgg_18913 buildPartial() {
            C2S_SmashEgg_18913 result = new C2S_SmashEgg_18913(this);
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
            if (other instanceof C2S_SmashEgg_18913) {
               return this.mergeFrom((C2S_SmashEgg_18913)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SmashEgg_18913 other) {
            if (other == MergeActivityMsg.C2S_SmashEgg_18913.getDefaultInstance()) {
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
            C2S_SmashEgg_18913 parsedMessage = null;

            try {
               parsedMessage = (C2S_SmashEgg_18913)MergeActivityMsg.C2S_SmashEgg_18913.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SmashEgg_18913)e.getUnfinishedMessage();
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

   public static final class S2C_SmashEgg_18914 extends GeneratedMessageV3 implements S2C_SmashEgg_18914OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int SENIORNUM_FIELD_NUMBER = 2;
      private List<CommonMsg.MapDataII> seniorNum_;
      public static final int SMASHEGGNUM_FIELD_NUMBER = 3;
      private int smashEggNum_;
      public static final int ISHAVEFANCY_FIELD_NUMBER = 4;
      private boolean isHaveFancy_;
      public static final int FANCYGROUPDRAWTIMES_FIELD_NUMBER = 5;
      private int fancyGroupDrawTimes_;
      private byte memoizedIsInitialized;
      private static final S2C_SmashEgg_18914 DEFAULT_INSTANCE = new S2C_SmashEgg_18914();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SmashEgg_18914> PARSER = new AbstractParser<S2C_SmashEgg_18914>() {
         public S2C_SmashEgg_18914 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SmashEgg_18914(input, extensionRegistry);
         }
      };

      private S2C_SmashEgg_18914(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SmashEgg_18914() {
         this.memoizedIsInitialized = -1;
         this.seniorNum_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SmashEgg_18914();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SmashEgg_18914(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.seniorNum_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.seniorNum_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.smashEggNum_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.isHaveFancy_ = input.readBool();
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.fancyGroupDrawTimes_ = input.readInt32();
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
                  this.seniorNum_ = Collections.unmodifiableList(this.seniorNum_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_SmashEgg_18914_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_SmashEgg_18914_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SmashEgg_18914.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public List<CommonMsg.MapDataII> getSeniorNumList() {
         return this.seniorNum_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getSeniorNumOrBuilderList() {
         return this.seniorNum_;
      }

      public int getSeniorNumCount() {
         return this.seniorNum_.size();
      }

      public CommonMsg.MapDataII getSeniorNum(int index) {
         return (CommonMsg.MapDataII)this.seniorNum_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getSeniorNumOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.seniorNum_.get(index);
      }

      public boolean hasSmashEggNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSmashEggNum() {
         return this.smashEggNum_;
      }

      public boolean hasIsHaveFancy() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsHaveFancy() {
         return this.isHaveFancy_;
      }

      public boolean hasFancyGroupDrawTimes() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getFancyGroupDrawTimes() {
         return this.fancyGroupDrawTimes_;
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
         } else if (!this.hasSmashEggNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFancyGroupDrawTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getSeniorNumCount(); ++i) {
               if (!this.getSeniorNum(i).isInitialized()) {
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
            output.writeInt32(1, this.result_);
         }

         for(int i = 0; i < this.seniorNum_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.seniorNum_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.smashEggNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(4, this.isHaveFancy_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.fancyGroupDrawTimes_);
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

            for(int i = 0; i < this.seniorNum_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.seniorNum_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.smashEggNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.isHaveFancy_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.fancyGroupDrawTimes_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SmashEgg_18914)) {
            return super.equals(obj);
         } else {
            S2C_SmashEgg_18914 other = (S2C_SmashEgg_18914)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (!this.getSeniorNumList().equals(other.getSeniorNumList())) {
               return false;
            } else if (this.hasSmashEggNum() != other.hasSmashEggNum()) {
               return false;
            } else if (this.hasSmashEggNum() && this.getSmashEggNum() != other.getSmashEggNum()) {
               return false;
            } else if (this.hasIsHaveFancy() != other.hasIsHaveFancy()) {
               return false;
            } else if (this.hasIsHaveFancy() && this.getIsHaveFancy() != other.getIsHaveFancy()) {
               return false;
            } else if (this.hasFancyGroupDrawTimes() != other.hasFancyGroupDrawTimes()) {
               return false;
            } else if (this.hasFancyGroupDrawTimes() && this.getFancyGroupDrawTimes() != other.getFancyGroupDrawTimes()) {
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

            if (this.getSeniorNumCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSeniorNumList().hashCode();
            }

            if (this.hasSmashEggNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSmashEggNum();
            }

            if (this.hasIsHaveFancy()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getIsHaveFancy());
            }

            if (this.hasFancyGroupDrawTimes()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getFancyGroupDrawTimes();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SmashEgg_18914 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_18914)PARSER.parseFrom(data);
      }

      public static S2C_SmashEgg_18914 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_18914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SmashEgg_18914 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_18914)PARSER.parseFrom(data);
      }

      public static S2C_SmashEgg_18914 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_18914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SmashEgg_18914 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_18914)PARSER.parseFrom(data);
      }

      public static S2C_SmashEgg_18914 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_18914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SmashEgg_18914 parseFrom(InputStream input) throws IOException {
         return (S2C_SmashEgg_18914)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SmashEgg_18914 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SmashEgg_18914)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SmashEgg_18914 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SmashEgg_18914)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SmashEgg_18914 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SmashEgg_18914)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SmashEgg_18914 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SmashEgg_18914)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SmashEgg_18914 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SmashEgg_18914)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SmashEgg_18914 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SmashEgg_18914 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SmashEgg_18914> parser() {
         return PARSER;
      }

      public Parser<S2C_SmashEgg_18914> getParserForType() {
         return PARSER;
      }

      public S2C_SmashEgg_18914 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SmashEgg_18914OrBuilder {
         private int bitField0_;
         private int result_;
         private List<CommonMsg.MapDataII> seniorNum_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> seniorNumBuilder_;
         private int smashEggNum_;
         private boolean isHaveFancy_;
         private int fancyGroupDrawTimes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_SmashEgg_18914_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_SmashEgg_18914_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SmashEgg_18914.class, Builder.class);
         }

         private Builder() {
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeActivityMsg.S2C_SmashEgg_18914.alwaysUseFieldBuilders) {
               this.getSeniorNumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            if (this.seniorNumBuilder_ == null) {
               this.seniorNum_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.seniorNumBuilder_.clear();
            }

            this.smashEggNum_ = 0;
            this.bitField0_ &= -5;
            this.isHaveFancy_ = false;
            this.bitField0_ &= -9;
            this.fancyGroupDrawTimes_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_SmashEgg_18914_descriptor;
         }

         public S2C_SmashEgg_18914 getDefaultInstanceForType() {
            return MergeActivityMsg.S2C_SmashEgg_18914.getDefaultInstance();
         }

         public S2C_SmashEgg_18914 build() {
            S2C_SmashEgg_18914 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SmashEgg_18914 buildPartial() {
            S2C_SmashEgg_18914 result = new S2C_SmashEgg_18914(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if (this.seniorNumBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.seniorNum_ = Collections.unmodifiableList(this.seniorNum_);
                  this.bitField0_ &= -3;
               }

               result.seniorNum_ = this.seniorNum_;
            } else {
               result.seniorNum_ = this.seniorNumBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.smashEggNum_ = this.smashEggNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.isHaveFancy_ = this.isHaveFancy_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.fancyGroupDrawTimes_ = this.fancyGroupDrawTimes_;
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
            if (other instanceof S2C_SmashEgg_18914) {
               return this.mergeFrom((S2C_SmashEgg_18914)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SmashEgg_18914 other) {
            if (other == MergeActivityMsg.S2C_SmashEgg_18914.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (this.seniorNumBuilder_ == null) {
                  if (!other.seniorNum_.isEmpty()) {
                     if (this.seniorNum_.isEmpty()) {
                        this.seniorNum_ = other.seniorNum_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureSeniorNumIsMutable();
                        this.seniorNum_.addAll(other.seniorNum_);
                     }

                     this.onChanged();
                  }
               } else if (!other.seniorNum_.isEmpty()) {
                  if (this.seniorNumBuilder_.isEmpty()) {
                     this.seniorNumBuilder_.dispose();
                     this.seniorNumBuilder_ = null;
                     this.seniorNum_ = other.seniorNum_;
                     this.bitField0_ &= -3;
                     this.seniorNumBuilder_ = MergeActivityMsg.S2C_SmashEgg_18914.alwaysUseFieldBuilders ? this.getSeniorNumFieldBuilder() : null;
                  } else {
                     this.seniorNumBuilder_.addAllMessages(other.seniorNum_);
                  }
               }

               if (other.hasSmashEggNum()) {
                  this.setSmashEggNum(other.getSmashEggNum());
               }

               if (other.hasIsHaveFancy()) {
                  this.setIsHaveFancy(other.getIsHaveFancy());
               }

               if (other.hasFancyGroupDrawTimes()) {
                  this.setFancyGroupDrawTimes(other.getFancyGroupDrawTimes());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasSmashEggNum()) {
               return false;
            } else if (!this.hasFancyGroupDrawTimes()) {
               return false;
            } else {
               for(int i = 0; i < this.getSeniorNumCount(); ++i) {
                  if (!this.getSeniorNum(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SmashEgg_18914 parsedMessage = null;

            try {
               parsedMessage = (S2C_SmashEgg_18914)MergeActivityMsg.S2C_SmashEgg_18914.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SmashEgg_18914)e.getUnfinishedMessage();
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

         private void ensureSeniorNumIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.seniorNum_ = new ArrayList(this.seniorNum_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.MapDataII> getSeniorNumList() {
            return this.seniorNumBuilder_ == null ? Collections.unmodifiableList(this.seniorNum_) : this.seniorNumBuilder_.getMessageList();
         }

         public int getSeniorNumCount() {
            return this.seniorNumBuilder_ == null ? this.seniorNum_.size() : this.seniorNumBuilder_.getCount();
         }

         public CommonMsg.MapDataII getSeniorNum(int index) {
            return this.seniorNumBuilder_ == null ? (CommonMsg.MapDataII)this.seniorNum_.get(index) : (CommonMsg.MapDataII)this.seniorNumBuilder_.getMessage(index);
         }

         public Builder setSeniorNum(int index, CommonMsg.MapDataII value) {
            if (this.seniorNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSeniorNumIsMutable();
               this.seniorNum_.set(index, value);
               this.onChanged();
            } else {
               this.seniorNumBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setSeniorNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.seniorNumBuilder_ == null) {
               this.ensureSeniorNumIsMutable();
               this.seniorNum_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.seniorNumBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addSeniorNum(CommonMsg.MapDataII value) {
            if (this.seniorNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSeniorNumIsMutable();
               this.seniorNum_.add(value);
               this.onChanged();
            } else {
               this.seniorNumBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addSeniorNum(int index, CommonMsg.MapDataII value) {
            if (this.seniorNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSeniorNumIsMutable();
               this.seniorNum_.add(index, value);
               this.onChanged();
            } else {
               this.seniorNumBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addSeniorNum(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.seniorNumBuilder_ == null) {
               this.ensureSeniorNumIsMutable();
               this.seniorNum_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.seniorNumBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addSeniorNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.seniorNumBuilder_ == null) {
               this.ensureSeniorNumIsMutable();
               this.seniorNum_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.seniorNumBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllSeniorNum(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.seniorNumBuilder_ == null) {
               this.ensureSeniorNumIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.seniorNum_);
               this.onChanged();
            } else {
               this.seniorNumBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearSeniorNum() {
            if (this.seniorNumBuilder_ == null) {
               this.seniorNum_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.seniorNumBuilder_.clear();
            }

            return this;
         }

         public Builder removeSeniorNum(int index) {
            if (this.seniorNumBuilder_ == null) {
               this.ensureSeniorNumIsMutable();
               this.seniorNum_.remove(index);
               this.onChanged();
            } else {
               this.seniorNumBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getSeniorNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getSeniorNumFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getSeniorNumOrBuilder(int index) {
            return this.seniorNumBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.seniorNum_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.seniorNumBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getSeniorNumOrBuilderList() {
            return this.seniorNumBuilder_ != null ? this.seniorNumBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.seniorNum_);
         }

         public CommonMsg.MapDataII.Builder addSeniorNumBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getSeniorNumFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addSeniorNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getSeniorNumFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getSeniorNumBuilderList() {
            return this.getSeniorNumFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getSeniorNumFieldBuilder() {
            if (this.seniorNumBuilder_ == null) {
               this.seniorNumBuilder_ = new RepeatedFieldBuilderV3(this.seniorNum_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.seniorNum_ = null;
            }

            return this.seniorNumBuilder_;
         }

         public boolean hasSmashEggNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSmashEggNum() {
            return this.smashEggNum_;
         }

         public Builder setSmashEggNum(int value) {
            this.bitField0_ |= 4;
            this.smashEggNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSmashEggNum() {
            this.bitField0_ &= -5;
            this.smashEggNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsHaveFancy() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getIsHaveFancy() {
            return this.isHaveFancy_;
         }

         public Builder setIsHaveFancy(boolean value) {
            this.bitField0_ |= 8;
            this.isHaveFancy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsHaveFancy() {
            this.bitField0_ &= -9;
            this.isHaveFancy_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasFancyGroupDrawTimes() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getFancyGroupDrawTimes() {
            return this.fancyGroupDrawTimes_;
         }

         public Builder setFancyGroupDrawTimes(int value) {
            this.bitField0_ |= 16;
            this.fancyGroupDrawTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFancyGroupDrawTimes() {
            this.bitField0_ &= -17;
            this.fancyGroupDrawTimes_ = 0;
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

   public static final class C2S_TakeLuckReward_18915 extends GeneratedMessageV3 implements C2S_TakeLuckReward_18915OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private int rewardId_;
      private byte memoizedIsInitialized;
      private static final C2S_TakeLuckReward_18915 DEFAULT_INSTANCE = new C2S_TakeLuckReward_18915();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TakeLuckReward_18915> PARSER = new AbstractParser<C2S_TakeLuckReward_18915>() {
         public C2S_TakeLuckReward_18915 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TakeLuckReward_18915(input, extensionRegistry);
         }
      };

      private C2S_TakeLuckReward_18915(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TakeLuckReward_18915() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TakeLuckReward_18915();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TakeLuckReward_18915(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rewardId_ = input.readInt32();
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
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_TakeLuckReward_18915_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_TakeLuckReward_18915_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeLuckReward_18915.class, Builder.class);
      }

      public boolean hasRewardId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRewardId() {
         return this.rewardId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRewardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.rewardId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.rewardId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TakeLuckReward_18915)) {
            return super.equals(obj);
         } else {
            C2S_TakeLuckReward_18915 other = (C2S_TakeLuckReward_18915)obj;
            if (this.hasRewardId() != other.hasRewardId()) {
               return false;
            } else if (this.hasRewardId() && this.getRewardId() != other.getRewardId()) {
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
            if (this.hasRewardId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRewardId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TakeLuckReward_18915 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_18915)PARSER.parseFrom(data);
      }

      public static C2S_TakeLuckReward_18915 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_18915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeLuckReward_18915 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_18915)PARSER.parseFrom(data);
      }

      public static C2S_TakeLuckReward_18915 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_18915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeLuckReward_18915 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_18915)PARSER.parseFrom(data);
      }

      public static C2S_TakeLuckReward_18915 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_18915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeLuckReward_18915 parseFrom(InputStream input) throws IOException {
         return (C2S_TakeLuckReward_18915)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeLuckReward_18915 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeLuckReward_18915)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeLuckReward_18915 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TakeLuckReward_18915)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TakeLuckReward_18915 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeLuckReward_18915)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeLuckReward_18915 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TakeLuckReward_18915)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeLuckReward_18915 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeLuckReward_18915)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TakeLuckReward_18915 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TakeLuckReward_18915 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TakeLuckReward_18915> parser() {
         return PARSER;
      }

      public Parser<C2S_TakeLuckReward_18915> getParserForType() {
         return PARSER;
      }

      public C2S_TakeLuckReward_18915 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TakeLuckReward_18915OrBuilder {
         private int bitField0_;
         private int rewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_TakeLuckReward_18915_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_TakeLuckReward_18915_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeLuckReward_18915.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeActivityMsg.C2S_TakeLuckReward_18915.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_TakeLuckReward_18915_descriptor;
         }

         public C2S_TakeLuckReward_18915 getDefaultInstanceForType() {
            return MergeActivityMsg.C2S_TakeLuckReward_18915.getDefaultInstance();
         }

         public C2S_TakeLuckReward_18915 build() {
            C2S_TakeLuckReward_18915 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TakeLuckReward_18915 buildPartial() {
            C2S_TakeLuckReward_18915 result = new C2S_TakeLuckReward_18915(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rewardId_ = this.rewardId_;
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
            if (other instanceof C2S_TakeLuckReward_18915) {
               return this.mergeFrom((C2S_TakeLuckReward_18915)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TakeLuckReward_18915 other) {
            if (other == MergeActivityMsg.C2S_TakeLuckReward_18915.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRewardId()) {
                  this.setRewardId(other.getRewardId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRewardId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TakeLuckReward_18915 parsedMessage = null;

            try {
               parsedMessage = (C2S_TakeLuckReward_18915)MergeActivityMsg.C2S_TakeLuckReward_18915.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TakeLuckReward_18915)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRewardId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRewardId() {
            return this.rewardId_;
         }

         public Builder setRewardId(int value) {
            this.bitField0_ |= 1;
            this.rewardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardId() {
            this.bitField0_ &= -2;
            this.rewardId_ = 0;
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

   public static final class S2C_TakeLuckReward_18916 extends GeneratedMessageV3 implements S2C_TakeLuckReward_18916OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TAKEDID_FIELD_NUMBER = 2;
      private Internal.IntList takedId_;
      private byte memoizedIsInitialized;
      private static final S2C_TakeLuckReward_18916 DEFAULT_INSTANCE = new S2C_TakeLuckReward_18916();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TakeLuckReward_18916> PARSER = new AbstractParser<S2C_TakeLuckReward_18916>() {
         public S2C_TakeLuckReward_18916 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TakeLuckReward_18916(input, extensionRegistry);
         }
      };

      private S2C_TakeLuckReward_18916(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TakeLuckReward_18916() {
         this.memoizedIsInitialized = -1;
         this.takedId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TakeLuckReward_18916();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TakeLuckReward_18916(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.takedId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.takedId_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.takedId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.takedId_.addInt(input.readInt32());
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
                  this.takedId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_TakeLuckReward_18916_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_TakeLuckReward_18916_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeLuckReward_18916.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public List<Integer> getTakedIdList() {
         return this.takedId_;
      }

      public int getTakedIdCount() {
         return this.takedId_.size();
      }

      public int getTakedId(int index) {
         return this.takedId_.getInt(index);
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

         for(int i = 0; i < this.takedId_.size(); ++i) {
            output.writeInt32(2, this.takedId_.getInt(i));
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

            int dataSize = 0;

            for(int i = 0; i < this.takedId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.takedId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTakedIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TakeLuckReward_18916)) {
            return super.equals(obj);
         } else {
            S2C_TakeLuckReward_18916 other = (S2C_TakeLuckReward_18916)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (!this.getTakedIdList().equals(other.getTakedIdList())) {
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

            if (this.getTakedIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTakedIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TakeLuckReward_18916 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_18916)PARSER.parseFrom(data);
      }

      public static S2C_TakeLuckReward_18916 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_18916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeLuckReward_18916 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_18916)PARSER.parseFrom(data);
      }

      public static S2C_TakeLuckReward_18916 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_18916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeLuckReward_18916 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_18916)PARSER.parseFrom(data);
      }

      public static S2C_TakeLuckReward_18916 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_18916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeLuckReward_18916 parseFrom(InputStream input) throws IOException {
         return (S2C_TakeLuckReward_18916)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeLuckReward_18916 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeLuckReward_18916)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeLuckReward_18916 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TakeLuckReward_18916)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TakeLuckReward_18916 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeLuckReward_18916)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeLuckReward_18916 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TakeLuckReward_18916)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeLuckReward_18916 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeLuckReward_18916)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TakeLuckReward_18916 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TakeLuckReward_18916 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TakeLuckReward_18916> parser() {
         return PARSER;
      }

      public Parser<S2C_TakeLuckReward_18916> getParserForType() {
         return PARSER;
      }

      public S2C_TakeLuckReward_18916 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TakeLuckReward_18916OrBuilder {
         private int bitField0_;
         private int result_;
         private Internal.IntList takedId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_TakeLuckReward_18916_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_TakeLuckReward_18916_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeLuckReward_18916.class, Builder.class);
         }

         private Builder() {
            this.takedId_ = MergeActivityMsg.S2C_TakeLuckReward_18916.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.takedId_ = MergeActivityMsg.S2C_TakeLuckReward_18916.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeActivityMsg.S2C_TakeLuckReward_18916.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.takedId_ = MergeActivityMsg.S2C_TakeLuckReward_18916.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_TakeLuckReward_18916_descriptor;
         }

         public S2C_TakeLuckReward_18916 getDefaultInstanceForType() {
            return MergeActivityMsg.S2C_TakeLuckReward_18916.getDefaultInstance();
         }

         public S2C_TakeLuckReward_18916 build() {
            S2C_TakeLuckReward_18916 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TakeLuckReward_18916 buildPartial() {
            S2C_TakeLuckReward_18916 result = new S2C_TakeLuckReward_18916(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.takedId_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.takedId_ = this.takedId_;
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
            if (other instanceof S2C_TakeLuckReward_18916) {
               return this.mergeFrom((S2C_TakeLuckReward_18916)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TakeLuckReward_18916 other) {
            if (other == MergeActivityMsg.S2C_TakeLuckReward_18916.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (!other.takedId_.isEmpty()) {
                  if (this.takedId_.isEmpty()) {
                     this.takedId_ = other.takedId_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureTakedIdIsMutable();
                     this.takedId_.addAll(other.takedId_);
                  }

                  this.onChanged();
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
            S2C_TakeLuckReward_18916 parsedMessage = null;

            try {
               parsedMessage = (S2C_TakeLuckReward_18916)MergeActivityMsg.S2C_TakeLuckReward_18916.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TakeLuckReward_18916)e.getUnfinishedMessage();
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

         private void ensureTakedIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.takedId_ = MergeActivityMsg.S2C_TakeLuckReward_18916.mutableCopy(this.takedId_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getTakedIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.takedId_) : this.takedId_);
         }

         public int getTakedIdCount() {
            return this.takedId_.size();
         }

         public int getTakedId(int index) {
            return this.takedId_.getInt(index);
         }

         public Builder setTakedId(int index, int value) {
            this.ensureTakedIdIsMutable();
            this.takedId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTakedId(int value) {
            this.ensureTakedIdIsMutable();
            this.takedId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTakedId(Iterable<? extends Integer> values) {
            this.ensureTakedIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.takedId_);
            this.onChanged();
            return this;
         }

         public Builder clearTakedId() {
            this.takedId_ = MergeActivityMsg.S2C_TakeLuckReward_18916.emptyIntList();
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

   public static final class C2S_OpenEggUi_18917 extends GeneratedMessageV3 implements C2S_OpenEggUi_18917OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OpenEggUi_18917 DEFAULT_INSTANCE = new C2S_OpenEggUi_18917();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenEggUi_18917> PARSER = new AbstractParser<C2S_OpenEggUi_18917>() {
         public C2S_OpenEggUi_18917 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenEggUi_18917(input, extensionRegistry);
         }
      };

      private C2S_OpenEggUi_18917(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenEggUi_18917() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenEggUi_18917();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenEggUi_18917(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_OpenEggUi_18917_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_OpenEggUi_18917_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenEggUi_18917.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenEggUi_18917)) {
            return super.equals(obj);
         } else {
            C2S_OpenEggUi_18917 other = (C2S_OpenEggUi_18917)obj;
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

      public static C2S_OpenEggUi_18917 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_18917)PARSER.parseFrom(data);
      }

      public static C2S_OpenEggUi_18917 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_18917)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenEggUi_18917 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_18917)PARSER.parseFrom(data);
      }

      public static C2S_OpenEggUi_18917 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_18917)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenEggUi_18917 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_18917)PARSER.parseFrom(data);
      }

      public static C2S_OpenEggUi_18917 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_18917)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenEggUi_18917 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenEggUi_18917)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenEggUi_18917 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenEggUi_18917)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenEggUi_18917 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenEggUi_18917)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenEggUi_18917 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenEggUi_18917)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenEggUi_18917 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenEggUi_18917)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenEggUi_18917 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenEggUi_18917)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenEggUi_18917 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenEggUi_18917 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenEggUi_18917> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenEggUi_18917> getParserForType() {
         return PARSER;
      }

      public C2S_OpenEggUi_18917 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenEggUi_18917OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_OpenEggUi_18917_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_OpenEggUi_18917_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenEggUi_18917.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeActivityMsg.C2S_OpenEggUi_18917.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_OpenEggUi_18917_descriptor;
         }

         public C2S_OpenEggUi_18917 getDefaultInstanceForType() {
            return MergeActivityMsg.C2S_OpenEggUi_18917.getDefaultInstance();
         }

         public C2S_OpenEggUi_18917 build() {
            C2S_OpenEggUi_18917 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenEggUi_18917 buildPartial() {
            C2S_OpenEggUi_18917 result = new C2S_OpenEggUi_18917(this);
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
            if (other instanceof C2S_OpenEggUi_18917) {
               return this.mergeFrom((C2S_OpenEggUi_18917)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenEggUi_18917 other) {
            if (other == MergeActivityMsg.C2S_OpenEggUi_18917.getDefaultInstance()) {
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
            C2S_OpenEggUi_18917 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenEggUi_18917)MergeActivityMsg.C2S_OpenEggUi_18917.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenEggUi_18917)e.getUnfinishedMessage();
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

   public static final class S2C_OpenEggUi_18918 extends GeneratedMessageV3 implements S2C_OpenEggUi_18918OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FANCYID_FIELD_NUMBER = 1;
      private int fancyId_;
      public static final int SENIORREWARDS_FIELD_NUMBER = 2;
      private List<CommonMsg.MapDataII> seniorRewards_;
      public static final int SMASHEGGNUM_FIELD_NUMBER = 3;
      private int smashEggNum_;
      public static final int TAKEDLUCK_FIELD_NUMBER = 4;
      private Internal.IntList takedLuck_;
      public static final int SMASHEGGSTAGE_FIELD_NUMBER = 5;
      private int smashEggStage_;
      public static final int FANCYGROUPDRAWTIMES_FIELD_NUMBER = 6;
      private int fancyGroupDrawTimes_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenEggUi_18918 DEFAULT_INSTANCE = new S2C_OpenEggUi_18918();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenEggUi_18918> PARSER = new AbstractParser<S2C_OpenEggUi_18918>() {
         public S2C_OpenEggUi_18918 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenEggUi_18918(input, extensionRegistry);
         }
      };

      private S2C_OpenEggUi_18918(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenEggUi_18918() {
         this.memoizedIsInitialized = -1;
         this.seniorRewards_ = Collections.emptyList();
         this.takedLuck_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenEggUi_18918();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenEggUi_18918(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.fancyId_ = input.readInt32();
                        continue;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.seniorRewards_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.seniorRewards_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        continue;
                     case 24:
                        this.bitField0_ |= 2;
                        this.smashEggNum_ = input.readInt32();
                        continue;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.takedLuck_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.takedLuck_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.takedLuck_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }
                        break;
                     case 40:
                        this.bitField0_ |= 4;
                        this.smashEggStage_ = input.readInt32();
                        continue;
                     case 48:
                        this.bitField0_ |= 8;
                        this.fancyGroupDrawTimes_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.takedLuck_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.seniorRewards_ = Collections.unmodifiableList(this.seniorRewards_);
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.takedLuck_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_OpenEggUi_18918_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_OpenEggUi_18918_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenEggUi_18918.class, Builder.class);
      }

      public boolean hasFancyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFancyId() {
         return this.fancyId_;
      }

      public List<CommonMsg.MapDataII> getSeniorRewardsList() {
         return this.seniorRewards_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getSeniorRewardsOrBuilderList() {
         return this.seniorRewards_;
      }

      public int getSeniorRewardsCount() {
         return this.seniorRewards_.size();
      }

      public CommonMsg.MapDataII getSeniorRewards(int index) {
         return (CommonMsg.MapDataII)this.seniorRewards_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getSeniorRewardsOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.seniorRewards_.get(index);
      }

      public boolean hasSmashEggNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSmashEggNum() {
         return this.smashEggNum_;
      }

      public List<Integer> getTakedLuckList() {
         return this.takedLuck_;
      }

      public int getTakedLuckCount() {
         return this.takedLuck_.size();
      }

      public int getTakedLuck(int index) {
         return this.takedLuck_.getInt(index);
      }

      public boolean hasSmashEggStage() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSmashEggStage() {
         return this.smashEggStage_;
      }

      public boolean hasFancyGroupDrawTimes() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getFancyGroupDrawTimes() {
         return this.fancyGroupDrawTimes_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFancyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSmashEggNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSmashEggStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFancyGroupDrawTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getSeniorRewardsCount(); ++i) {
               if (!this.getSeniorRewards(i).isInitialized()) {
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
            output.writeInt32(1, this.fancyId_);
         }

         for(int i = 0; i < this.seniorRewards_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.seniorRewards_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.smashEggNum_);
         }

         for(int i = 0; i < this.takedLuck_.size(); ++i) {
            output.writeInt32(4, this.takedLuck_.getInt(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(5, this.smashEggStage_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(6, this.fancyGroupDrawTimes_);
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
               size += CodedOutputStream.computeInt32Size(1, this.fancyId_);
            }

            for(int i = 0; i < this.seniorRewards_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.seniorRewards_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.smashEggNum_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.takedLuck_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.takedLuck_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTakedLuckList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.smashEggStage_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.fancyGroupDrawTimes_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OpenEggUi_18918)) {
            return super.equals(obj);
         } else {
            S2C_OpenEggUi_18918 other = (S2C_OpenEggUi_18918)obj;
            if (this.hasFancyId() != other.hasFancyId()) {
               return false;
            } else if (this.hasFancyId() && this.getFancyId() != other.getFancyId()) {
               return false;
            } else if (!this.getSeniorRewardsList().equals(other.getSeniorRewardsList())) {
               return false;
            } else if (this.hasSmashEggNum() != other.hasSmashEggNum()) {
               return false;
            } else if (this.hasSmashEggNum() && this.getSmashEggNum() != other.getSmashEggNum()) {
               return false;
            } else if (!this.getTakedLuckList().equals(other.getTakedLuckList())) {
               return false;
            } else if (this.hasSmashEggStage() != other.hasSmashEggStage()) {
               return false;
            } else if (this.hasSmashEggStage() && this.getSmashEggStage() != other.getSmashEggStage()) {
               return false;
            } else if (this.hasFancyGroupDrawTimes() != other.hasFancyGroupDrawTimes()) {
               return false;
            } else if (this.hasFancyGroupDrawTimes() && this.getFancyGroupDrawTimes() != other.getFancyGroupDrawTimes()) {
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
            if (this.hasFancyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFancyId();
            }

            if (this.getSeniorRewardsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSeniorRewardsList().hashCode();
            }

            if (this.hasSmashEggNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSmashEggNum();
            }

            if (this.getTakedLuckCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTakedLuckList().hashCode();
            }

            if (this.hasSmashEggStage()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getSmashEggStage();
            }

            if (this.hasFancyGroupDrawTimes()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getFancyGroupDrawTimes();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OpenEggUi_18918 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_18918)PARSER.parseFrom(data);
      }

      public static S2C_OpenEggUi_18918 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_18918)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenEggUi_18918 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_18918)PARSER.parseFrom(data);
      }

      public static S2C_OpenEggUi_18918 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_18918)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenEggUi_18918 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_18918)PARSER.parseFrom(data);
      }

      public static S2C_OpenEggUi_18918 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_18918)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenEggUi_18918 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenEggUi_18918)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenEggUi_18918 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenEggUi_18918)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenEggUi_18918 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenEggUi_18918)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenEggUi_18918 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenEggUi_18918)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenEggUi_18918 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenEggUi_18918)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenEggUi_18918 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenEggUi_18918)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenEggUi_18918 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenEggUi_18918 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenEggUi_18918> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenEggUi_18918> getParserForType() {
         return PARSER;
      }

      public S2C_OpenEggUi_18918 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenEggUi_18918OrBuilder {
         private int bitField0_;
         private int fancyId_;
         private List<CommonMsg.MapDataII> seniorRewards_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> seniorRewardsBuilder_;
         private int smashEggNum_;
         private Internal.IntList takedLuck_;
         private int smashEggStage_;
         private int fancyGroupDrawTimes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_OpenEggUi_18918_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_OpenEggUi_18918_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenEggUi_18918.class, Builder.class);
         }

         private Builder() {
            this.seniorRewards_ = Collections.emptyList();
            this.takedLuck_ = MergeActivityMsg.S2C_OpenEggUi_18918.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.seniorRewards_ = Collections.emptyList();
            this.takedLuck_ = MergeActivityMsg.S2C_OpenEggUi_18918.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeActivityMsg.S2C_OpenEggUi_18918.alwaysUseFieldBuilders) {
               this.getSeniorRewardsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.fancyId_ = 0;
            this.bitField0_ &= -2;
            if (this.seniorRewardsBuilder_ == null) {
               this.seniorRewards_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.seniorRewardsBuilder_.clear();
            }

            this.smashEggNum_ = 0;
            this.bitField0_ &= -5;
            this.takedLuck_ = MergeActivityMsg.S2C_OpenEggUi_18918.emptyIntList();
            this.bitField0_ &= -9;
            this.smashEggStage_ = 0;
            this.bitField0_ &= -17;
            this.fancyGroupDrawTimes_ = 0;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_OpenEggUi_18918_descriptor;
         }

         public S2C_OpenEggUi_18918 getDefaultInstanceForType() {
            return MergeActivityMsg.S2C_OpenEggUi_18918.getDefaultInstance();
         }

         public S2C_OpenEggUi_18918 build() {
            S2C_OpenEggUi_18918 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenEggUi_18918 buildPartial() {
            S2C_OpenEggUi_18918 result = new S2C_OpenEggUi_18918(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.fancyId_ = this.fancyId_;
               to_bitField0_ |= 1;
            }

            if (this.seniorRewardsBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.seniorRewards_ = Collections.unmodifiableList(this.seniorRewards_);
                  this.bitField0_ &= -3;
               }

               result.seniorRewards_ = this.seniorRewards_;
            } else {
               result.seniorRewards_ = this.seniorRewardsBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.smashEggNum_ = this.smashEggNum_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.takedLuck_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.takedLuck_ = this.takedLuck_;
            if ((from_bitField0_ & 16) != 0) {
               result.smashEggStage_ = this.smashEggStage_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.fancyGroupDrawTimes_ = this.fancyGroupDrawTimes_;
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
            if (other instanceof S2C_OpenEggUi_18918) {
               return this.mergeFrom((S2C_OpenEggUi_18918)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenEggUi_18918 other) {
            if (other == MergeActivityMsg.S2C_OpenEggUi_18918.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFancyId()) {
                  this.setFancyId(other.getFancyId());
               }

               if (this.seniorRewardsBuilder_ == null) {
                  if (!other.seniorRewards_.isEmpty()) {
                     if (this.seniorRewards_.isEmpty()) {
                        this.seniorRewards_ = other.seniorRewards_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureSeniorRewardsIsMutable();
                        this.seniorRewards_.addAll(other.seniorRewards_);
                     }

                     this.onChanged();
                  }
               } else if (!other.seniorRewards_.isEmpty()) {
                  if (this.seniorRewardsBuilder_.isEmpty()) {
                     this.seniorRewardsBuilder_.dispose();
                     this.seniorRewardsBuilder_ = null;
                     this.seniorRewards_ = other.seniorRewards_;
                     this.bitField0_ &= -3;
                     this.seniorRewardsBuilder_ = MergeActivityMsg.S2C_OpenEggUi_18918.alwaysUseFieldBuilders ? this.getSeniorRewardsFieldBuilder() : null;
                  } else {
                     this.seniorRewardsBuilder_.addAllMessages(other.seniorRewards_);
                  }
               }

               if (other.hasSmashEggNum()) {
                  this.setSmashEggNum(other.getSmashEggNum());
               }

               if (!other.takedLuck_.isEmpty()) {
                  if (this.takedLuck_.isEmpty()) {
                     this.takedLuck_ = other.takedLuck_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureTakedLuckIsMutable();
                     this.takedLuck_.addAll(other.takedLuck_);
                  }

                  this.onChanged();
               }

               if (other.hasSmashEggStage()) {
                  this.setSmashEggStage(other.getSmashEggStage());
               }

               if (other.hasFancyGroupDrawTimes()) {
                  this.setFancyGroupDrawTimes(other.getFancyGroupDrawTimes());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFancyId()) {
               return false;
            } else if (!this.hasSmashEggNum()) {
               return false;
            } else if (!this.hasSmashEggStage()) {
               return false;
            } else if (!this.hasFancyGroupDrawTimes()) {
               return false;
            } else {
               for(int i = 0; i < this.getSeniorRewardsCount(); ++i) {
                  if (!this.getSeniorRewards(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OpenEggUi_18918 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenEggUi_18918)MergeActivityMsg.S2C_OpenEggUi_18918.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenEggUi_18918)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFancyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFancyId() {
            return this.fancyId_;
         }

         public Builder setFancyId(int value) {
            this.bitField0_ |= 1;
            this.fancyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFancyId() {
            this.bitField0_ &= -2;
            this.fancyId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureSeniorRewardsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.seniorRewards_ = new ArrayList(this.seniorRewards_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.MapDataII> getSeniorRewardsList() {
            return this.seniorRewardsBuilder_ == null ? Collections.unmodifiableList(this.seniorRewards_) : this.seniorRewardsBuilder_.getMessageList();
         }

         public int getSeniorRewardsCount() {
            return this.seniorRewardsBuilder_ == null ? this.seniorRewards_.size() : this.seniorRewardsBuilder_.getCount();
         }

         public CommonMsg.MapDataII getSeniorRewards(int index) {
            return this.seniorRewardsBuilder_ == null ? (CommonMsg.MapDataII)this.seniorRewards_.get(index) : (CommonMsg.MapDataII)this.seniorRewardsBuilder_.getMessage(index);
         }

         public Builder setSeniorRewards(int index, CommonMsg.MapDataII value) {
            if (this.seniorRewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSeniorRewardsIsMutable();
               this.seniorRewards_.set(index, value);
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setSeniorRewards(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.seniorRewardsBuilder_ == null) {
               this.ensureSeniorRewardsIsMutable();
               this.seniorRewards_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addSeniorRewards(CommonMsg.MapDataII value) {
            if (this.seniorRewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSeniorRewardsIsMutable();
               this.seniorRewards_.add(value);
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addSeniorRewards(int index, CommonMsg.MapDataII value) {
            if (this.seniorRewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSeniorRewardsIsMutable();
               this.seniorRewards_.add(index, value);
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addSeniorRewards(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.seniorRewardsBuilder_ == null) {
               this.ensureSeniorRewardsIsMutable();
               this.seniorRewards_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addSeniorRewards(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.seniorRewardsBuilder_ == null) {
               this.ensureSeniorRewardsIsMutable();
               this.seniorRewards_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllSeniorRewards(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.seniorRewardsBuilder_ == null) {
               this.ensureSeniorRewardsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.seniorRewards_);
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearSeniorRewards() {
            if (this.seniorRewardsBuilder_ == null) {
               this.seniorRewards_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.clear();
            }

            return this;
         }

         public Builder removeSeniorRewards(int index) {
            if (this.seniorRewardsBuilder_ == null) {
               this.ensureSeniorRewardsIsMutable();
               this.seniorRewards_.remove(index);
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getSeniorRewardsBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getSeniorRewardsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getSeniorRewardsOrBuilder(int index) {
            return this.seniorRewardsBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.seniorRewards_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.seniorRewardsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getSeniorRewardsOrBuilderList() {
            return this.seniorRewardsBuilder_ != null ? this.seniorRewardsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.seniorRewards_);
         }

         public CommonMsg.MapDataII.Builder addSeniorRewardsBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getSeniorRewardsFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addSeniorRewardsBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getSeniorRewardsFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getSeniorRewardsBuilderList() {
            return this.getSeniorRewardsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getSeniorRewardsFieldBuilder() {
            if (this.seniorRewardsBuilder_ == null) {
               this.seniorRewardsBuilder_ = new RepeatedFieldBuilderV3(this.seniorRewards_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.seniorRewards_ = null;
            }

            return this.seniorRewardsBuilder_;
         }

         public boolean hasSmashEggNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSmashEggNum() {
            return this.smashEggNum_;
         }

         public Builder setSmashEggNum(int value) {
            this.bitField0_ |= 4;
            this.smashEggNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSmashEggNum() {
            this.bitField0_ &= -5;
            this.smashEggNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureTakedLuckIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.takedLuck_ = MergeActivityMsg.S2C_OpenEggUi_18918.mutableCopy(this.takedLuck_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getTakedLuckList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.takedLuck_) : this.takedLuck_);
         }

         public int getTakedLuckCount() {
            return this.takedLuck_.size();
         }

         public int getTakedLuck(int index) {
            return this.takedLuck_.getInt(index);
         }

         public Builder setTakedLuck(int index, int value) {
            this.ensureTakedLuckIsMutable();
            this.takedLuck_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTakedLuck(int value) {
            this.ensureTakedLuckIsMutable();
            this.takedLuck_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTakedLuck(Iterable<? extends Integer> values) {
            this.ensureTakedLuckIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.takedLuck_);
            this.onChanged();
            return this;
         }

         public Builder clearTakedLuck() {
            this.takedLuck_ = MergeActivityMsg.S2C_OpenEggUi_18918.emptyIntList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         public boolean hasSmashEggStage() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getSmashEggStage() {
            return this.smashEggStage_;
         }

         public Builder setSmashEggStage(int value) {
            this.bitField0_ |= 16;
            this.smashEggStage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSmashEggStage() {
            this.bitField0_ &= -17;
            this.smashEggStage_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFancyGroupDrawTimes() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getFancyGroupDrawTimes() {
            return this.fancyGroupDrawTimes_;
         }

         public Builder setFancyGroupDrawTimes(int value) {
            this.bitField0_ |= 32;
            this.fancyGroupDrawTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFancyGroupDrawTimes() {
            this.bitField0_ &= -33;
            this.fancyGroupDrawTimes_ = 0;
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

   public static final class C2S_SignTotalInfo_18931 extends GeneratedMessageV3 implements C2S_SignTotalInfo_18931OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_SignTotalInfo_18931 DEFAULT_INSTANCE = new C2S_SignTotalInfo_18931();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SignTotalInfo_18931> PARSER = new AbstractParser<C2S_SignTotalInfo_18931>() {
         public C2S_SignTotalInfo_18931 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SignTotalInfo_18931(input, extensionRegistry);
         }
      };

      private C2S_SignTotalInfo_18931(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SignTotalInfo_18931() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SignTotalInfo_18931();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SignTotalInfo_18931(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_SignTotalInfo_18931_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_SignTotalInfo_18931_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SignTotalInfo_18931.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SignTotalInfo_18931)) {
            return super.equals(obj);
         } else {
            C2S_SignTotalInfo_18931 other = (C2S_SignTotalInfo_18931)obj;
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

      public static C2S_SignTotalInfo_18931 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_18931)PARSER.parseFrom(data);
      }

      public static C2S_SignTotalInfo_18931 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_18931)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignTotalInfo_18931 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_18931)PARSER.parseFrom(data);
      }

      public static C2S_SignTotalInfo_18931 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_18931)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignTotalInfo_18931 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_18931)PARSER.parseFrom(data);
      }

      public static C2S_SignTotalInfo_18931 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SignTotalInfo_18931)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SignTotalInfo_18931 parseFrom(InputStream input) throws IOException {
         return (C2S_SignTotalInfo_18931)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SignTotalInfo_18931 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignTotalInfo_18931)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SignTotalInfo_18931 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SignTotalInfo_18931)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SignTotalInfo_18931 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignTotalInfo_18931)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SignTotalInfo_18931 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SignTotalInfo_18931)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SignTotalInfo_18931 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SignTotalInfo_18931)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SignTotalInfo_18931 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SignTotalInfo_18931 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SignTotalInfo_18931> parser() {
         return PARSER;
      }

      public Parser<C2S_SignTotalInfo_18931> getParserForType() {
         return PARSER;
      }

      public C2S_SignTotalInfo_18931 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SignTotalInfo_18931OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_SignTotalInfo_18931_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_SignTotalInfo_18931_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SignTotalInfo_18931.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeActivityMsg.C2S_SignTotalInfo_18931.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_SignTotalInfo_18931_descriptor;
         }

         public C2S_SignTotalInfo_18931 getDefaultInstanceForType() {
            return MergeActivityMsg.C2S_SignTotalInfo_18931.getDefaultInstance();
         }

         public C2S_SignTotalInfo_18931 build() {
            C2S_SignTotalInfo_18931 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SignTotalInfo_18931 buildPartial() {
            C2S_SignTotalInfo_18931 result = new C2S_SignTotalInfo_18931(this);
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
            if (other instanceof C2S_SignTotalInfo_18931) {
               return this.mergeFrom((C2S_SignTotalInfo_18931)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SignTotalInfo_18931 other) {
            if (other == MergeActivityMsg.C2S_SignTotalInfo_18931.getDefaultInstance()) {
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
            C2S_SignTotalInfo_18931 parsedMessage = null;

            try {
               parsedMessage = (C2S_SignTotalInfo_18931)MergeActivityMsg.C2S_SignTotalInfo_18931.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SignTotalInfo_18931)e.getUnfinishedMessage();
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

   public static final class S2C_SignTotalInfo_18932 extends GeneratedMessageV3 implements S2C_SignTotalInfo_18932OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYDAY_FIELD_NUMBER = 1;
      private int activityDay_;
      public static final int SIGNGOTREWARDS_FIELD_NUMBER = 2;
      private Internal.IntList signGotRewards_;
      private byte memoizedIsInitialized;
      private static final S2C_SignTotalInfo_18932 DEFAULT_INSTANCE = new S2C_SignTotalInfo_18932();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SignTotalInfo_18932> PARSER = new AbstractParser<S2C_SignTotalInfo_18932>() {
         public S2C_SignTotalInfo_18932 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SignTotalInfo_18932(input, extensionRegistry);
         }
      };

      private S2C_SignTotalInfo_18932(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SignTotalInfo_18932() {
         this.memoizedIsInitialized = -1;
         this.signGotRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SignTotalInfo_18932();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SignTotalInfo_18932(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.activityDay_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.signGotRewards_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.signGotRewards_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.signGotRewards_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.signGotRewards_.addInt(input.readInt32());
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
                  this.signGotRewards_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_SignTotalInfo_18932_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_SignTotalInfo_18932_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SignTotalInfo_18932.class, Builder.class);
      }

      public boolean hasActivityDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityDay() {
         return this.activityDay_;
      }

      public List<Integer> getSignGotRewardsList() {
         return this.signGotRewards_;
      }

      public int getSignGotRewardsCount() {
         return this.signGotRewards_.size();
      }

      public int getSignGotRewards(int index) {
         return this.signGotRewards_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasActivityDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.activityDay_);
         }

         for(int i = 0; i < this.signGotRewards_.size(); ++i) {
            output.writeInt32(2, this.signGotRewards_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.activityDay_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.signGotRewards_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.signGotRewards_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getSignGotRewardsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SignTotalInfo_18932)) {
            return super.equals(obj);
         } else {
            S2C_SignTotalInfo_18932 other = (S2C_SignTotalInfo_18932)obj;
            if (this.hasActivityDay() != other.hasActivityDay()) {
               return false;
            } else if (this.hasActivityDay() && this.getActivityDay() != other.getActivityDay()) {
               return false;
            } else if (!this.getSignGotRewardsList().equals(other.getSignGotRewardsList())) {
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
            if (this.hasActivityDay()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getActivityDay();
            }

            if (this.getSignGotRewardsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSignGotRewardsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SignTotalInfo_18932 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_18932)PARSER.parseFrom(data);
      }

      public static S2C_SignTotalInfo_18932 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_18932)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignTotalInfo_18932 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_18932)PARSER.parseFrom(data);
      }

      public static S2C_SignTotalInfo_18932 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_18932)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignTotalInfo_18932 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_18932)PARSER.parseFrom(data);
      }

      public static S2C_SignTotalInfo_18932 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SignTotalInfo_18932)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SignTotalInfo_18932 parseFrom(InputStream input) throws IOException {
         return (S2C_SignTotalInfo_18932)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SignTotalInfo_18932 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignTotalInfo_18932)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SignTotalInfo_18932 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SignTotalInfo_18932)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SignTotalInfo_18932 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignTotalInfo_18932)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SignTotalInfo_18932 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SignTotalInfo_18932)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SignTotalInfo_18932 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SignTotalInfo_18932)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SignTotalInfo_18932 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SignTotalInfo_18932 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SignTotalInfo_18932> parser() {
         return PARSER;
      }

      public Parser<S2C_SignTotalInfo_18932> getParserForType() {
         return PARSER;
      }

      public S2C_SignTotalInfo_18932 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SignTotalInfo_18932OrBuilder {
         private int bitField0_;
         private int activityDay_;
         private Internal.IntList signGotRewards_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_SignTotalInfo_18932_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_SignTotalInfo_18932_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SignTotalInfo_18932.class, Builder.class);
         }

         private Builder() {
            this.signGotRewards_ = MergeActivityMsg.S2C_SignTotalInfo_18932.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.signGotRewards_ = MergeActivityMsg.S2C_SignTotalInfo_18932.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeActivityMsg.S2C_SignTotalInfo_18932.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityDay_ = 0;
            this.bitField0_ &= -2;
            this.signGotRewards_ = MergeActivityMsg.S2C_SignTotalInfo_18932.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_SignTotalInfo_18932_descriptor;
         }

         public S2C_SignTotalInfo_18932 getDefaultInstanceForType() {
            return MergeActivityMsg.S2C_SignTotalInfo_18932.getDefaultInstance();
         }

         public S2C_SignTotalInfo_18932 build() {
            S2C_SignTotalInfo_18932 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SignTotalInfo_18932 buildPartial() {
            S2C_SignTotalInfo_18932 result = new S2C_SignTotalInfo_18932(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityDay_ = this.activityDay_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.signGotRewards_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.signGotRewards_ = this.signGotRewards_;
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
            if (other instanceof S2C_SignTotalInfo_18932) {
               return this.mergeFrom((S2C_SignTotalInfo_18932)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SignTotalInfo_18932 other) {
            if (other == MergeActivityMsg.S2C_SignTotalInfo_18932.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityDay()) {
                  this.setActivityDay(other.getActivityDay());
               }

               if (!other.signGotRewards_.isEmpty()) {
                  if (this.signGotRewards_.isEmpty()) {
                     this.signGotRewards_ = other.signGotRewards_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureSignGotRewardsIsMutable();
                     this.signGotRewards_.addAll(other.signGotRewards_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasActivityDay();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SignTotalInfo_18932 parsedMessage = null;

            try {
               parsedMessage = (S2C_SignTotalInfo_18932)MergeActivityMsg.S2C_SignTotalInfo_18932.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SignTotalInfo_18932)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasActivityDay() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getActivityDay() {
            return this.activityDay_;
         }

         public Builder setActivityDay(int value) {
            this.bitField0_ |= 1;
            this.activityDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityDay() {
            this.bitField0_ &= -2;
            this.activityDay_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureSignGotRewardsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.signGotRewards_ = MergeActivityMsg.S2C_SignTotalInfo_18932.mutableCopy(this.signGotRewards_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getSignGotRewardsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.signGotRewards_) : this.signGotRewards_);
         }

         public int getSignGotRewardsCount() {
            return this.signGotRewards_.size();
         }

         public int getSignGotRewards(int index) {
            return this.signGotRewards_.getInt(index);
         }

         public Builder setSignGotRewards(int index, int value) {
            this.ensureSignGotRewardsIsMutable();
            this.signGotRewards_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addSignGotRewards(int value) {
            this.ensureSignGotRewardsIsMutable();
            this.signGotRewards_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllSignGotRewards(Iterable<? extends Integer> values) {
            this.ensureSignGotRewardsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.signGotRewards_);
            this.onChanged();
            return this;
         }

         public Builder clearSignGotRewards() {
            this.signGotRewards_ = MergeActivityMsg.S2C_SignTotalInfo_18932.emptyIntList();
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

   public static final class C2S_Sign_18933 extends GeneratedMessageV3 implements C2S_Sign_18933OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAY_FIELD_NUMBER = 1;
      private int day_;
      private byte memoizedIsInitialized;
      private static final C2S_Sign_18933 DEFAULT_INSTANCE = new C2S_Sign_18933();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Sign_18933> PARSER = new AbstractParser<C2S_Sign_18933>() {
         public C2S_Sign_18933 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Sign_18933(input, extensionRegistry);
         }
      };

      private C2S_Sign_18933(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Sign_18933() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Sign_18933();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Sign_18933(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.day_ = input.readInt32();
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
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_Sign_18933_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_Sign_18933_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Sign_18933.class, Builder.class);
      }

      public boolean hasDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDay() {
         return this.day_;
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
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.day_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Sign_18933)) {
            return super.equals(obj);
         } else {
            C2S_Sign_18933 other = (C2S_Sign_18933)obj;
            if (this.hasDay() != other.hasDay()) {
               return false;
            } else if (this.hasDay() && this.getDay() != other.getDay()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Sign_18933 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Sign_18933)PARSER.parseFrom(data);
      }

      public static C2S_Sign_18933 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_18933)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_18933 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Sign_18933)PARSER.parseFrom(data);
      }

      public static C2S_Sign_18933 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_18933)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_18933 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Sign_18933)PARSER.parseFrom(data);
      }

      public static C2S_Sign_18933 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Sign_18933)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Sign_18933 parseFrom(InputStream input) throws IOException {
         return (C2S_Sign_18933)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Sign_18933 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_18933)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Sign_18933 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Sign_18933)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Sign_18933 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_18933)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Sign_18933 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Sign_18933)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Sign_18933 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Sign_18933)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Sign_18933 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Sign_18933 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Sign_18933> parser() {
         return PARSER;
      }

      public Parser<C2S_Sign_18933> getParserForType() {
         return PARSER;
      }

      public C2S_Sign_18933 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Sign_18933OrBuilder {
         private int bitField0_;
         private int day_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_Sign_18933_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_Sign_18933_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Sign_18933.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeActivityMsg.C2S_Sign_18933.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.day_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_Sign_18933_descriptor;
         }

         public C2S_Sign_18933 getDefaultInstanceForType() {
            return MergeActivityMsg.C2S_Sign_18933.getDefaultInstance();
         }

         public C2S_Sign_18933 build() {
            C2S_Sign_18933 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Sign_18933 buildPartial() {
            C2S_Sign_18933 result = new C2S_Sign_18933(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.day_ = this.day_;
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
            if (other instanceof C2S_Sign_18933) {
               return this.mergeFrom((C2S_Sign_18933)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Sign_18933 other) {
            if (other == MergeActivityMsg.C2S_Sign_18933.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDay()) {
                  this.setDay(other.getDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasDay();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Sign_18933 parsedMessage = null;

            try {
               parsedMessage = (C2S_Sign_18933)MergeActivityMsg.C2S_Sign_18933.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Sign_18933)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_AddUpSign_18934 extends GeneratedMessageV3 implements C2S_AddUpSign_18934OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAY_FIELD_NUMBER = 1;
      private int day_;
      private byte memoizedIsInitialized;
      private static final C2S_AddUpSign_18934 DEFAULT_INSTANCE = new C2S_AddUpSign_18934();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AddUpSign_18934> PARSER = new AbstractParser<C2S_AddUpSign_18934>() {
         public C2S_AddUpSign_18934 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AddUpSign_18934(input, extensionRegistry);
         }
      };

      private C2S_AddUpSign_18934(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AddUpSign_18934() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AddUpSign_18934();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AddUpSign_18934(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.day_ = input.readInt32();
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
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_AddUpSign_18934_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_AddUpSign_18934_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AddUpSign_18934.class, Builder.class);
      }

      public boolean hasDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDay() {
         return this.day_;
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
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.day_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_AddUpSign_18934)) {
            return super.equals(obj);
         } else {
            C2S_AddUpSign_18934 other = (C2S_AddUpSign_18934)obj;
            if (this.hasDay() != other.hasDay()) {
               return false;
            } else if (this.hasDay() && this.getDay() != other.getDay()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_AddUpSign_18934 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AddUpSign_18934)PARSER.parseFrom(data);
      }

      public static C2S_AddUpSign_18934 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AddUpSign_18934)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AddUpSign_18934 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AddUpSign_18934)PARSER.parseFrom(data);
      }

      public static C2S_AddUpSign_18934 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AddUpSign_18934)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AddUpSign_18934 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AddUpSign_18934)PARSER.parseFrom(data);
      }

      public static C2S_AddUpSign_18934 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AddUpSign_18934)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AddUpSign_18934 parseFrom(InputStream input) throws IOException {
         return (C2S_AddUpSign_18934)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AddUpSign_18934 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AddUpSign_18934)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AddUpSign_18934 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AddUpSign_18934)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AddUpSign_18934 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AddUpSign_18934)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AddUpSign_18934 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AddUpSign_18934)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AddUpSign_18934 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AddUpSign_18934)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AddUpSign_18934 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AddUpSign_18934 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AddUpSign_18934> parser() {
         return PARSER;
      }

      public Parser<C2S_AddUpSign_18934> getParserForType() {
         return PARSER;
      }

      public C2S_AddUpSign_18934 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AddUpSign_18934OrBuilder {
         private int bitField0_;
         private int day_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_AddUpSign_18934_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_AddUpSign_18934_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AddUpSign_18934.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeActivityMsg.C2S_AddUpSign_18934.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.day_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_AddUpSign_18934_descriptor;
         }

         public C2S_AddUpSign_18934 getDefaultInstanceForType() {
            return MergeActivityMsg.C2S_AddUpSign_18934.getDefaultInstance();
         }

         public C2S_AddUpSign_18934 build() {
            C2S_AddUpSign_18934 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AddUpSign_18934 buildPartial() {
            C2S_AddUpSign_18934 result = new C2S_AddUpSign_18934(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.day_ = this.day_;
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
            if (other instanceof C2S_AddUpSign_18934) {
               return this.mergeFrom((C2S_AddUpSign_18934)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AddUpSign_18934 other) {
            if (other == MergeActivityMsg.C2S_AddUpSign_18934.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDay()) {
                  this.setDay(other.getDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasDay();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_AddUpSign_18934 parsedMessage = null;

            try {
               parsedMessage = (C2S_AddUpSign_18934)MergeActivityMsg.C2S_AddUpSign_18934.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AddUpSign_18934)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_RushRankInfo_18935 extends GeneratedMessageV3 implements C2S_RushRankInfo_18935OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_RushRankInfo_18935 DEFAULT_INSTANCE = new C2S_RushRankInfo_18935();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RushRankInfo_18935> PARSER = new AbstractParser<C2S_RushRankInfo_18935>() {
         public C2S_RushRankInfo_18935 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RushRankInfo_18935(input, extensionRegistry);
         }
      };

      private C2S_RushRankInfo_18935(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RushRankInfo_18935() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RushRankInfo_18935();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RushRankInfo_18935(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_RushRankInfo_18935_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_RushRankInfo_18935_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RushRankInfo_18935.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RushRankInfo_18935)) {
            return super.equals(obj);
         } else {
            C2S_RushRankInfo_18935 other = (C2S_RushRankInfo_18935)obj;
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

      public static C2S_RushRankInfo_18935 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RushRankInfo_18935)PARSER.parseFrom(data);
      }

      public static C2S_RushRankInfo_18935 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RushRankInfo_18935)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RushRankInfo_18935 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RushRankInfo_18935)PARSER.parseFrom(data);
      }

      public static C2S_RushRankInfo_18935 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RushRankInfo_18935)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RushRankInfo_18935 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RushRankInfo_18935)PARSER.parseFrom(data);
      }

      public static C2S_RushRankInfo_18935 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RushRankInfo_18935)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RushRankInfo_18935 parseFrom(InputStream input) throws IOException {
         return (C2S_RushRankInfo_18935)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RushRankInfo_18935 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RushRankInfo_18935)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RushRankInfo_18935 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RushRankInfo_18935)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RushRankInfo_18935 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RushRankInfo_18935)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RushRankInfo_18935 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RushRankInfo_18935)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RushRankInfo_18935 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RushRankInfo_18935)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RushRankInfo_18935 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RushRankInfo_18935 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RushRankInfo_18935> parser() {
         return PARSER;
      }

      public Parser<C2S_RushRankInfo_18935> getParserForType() {
         return PARSER;
      }

      public C2S_RushRankInfo_18935 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RushRankInfo_18935OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_RushRankInfo_18935_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_RushRankInfo_18935_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RushRankInfo_18935.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeActivityMsg.C2S_RushRankInfo_18935.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_C2S_RushRankInfo_18935_descriptor;
         }

         public C2S_RushRankInfo_18935 getDefaultInstanceForType() {
            return MergeActivityMsg.C2S_RushRankInfo_18935.getDefaultInstance();
         }

         public C2S_RushRankInfo_18935 build() {
            C2S_RushRankInfo_18935 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RushRankInfo_18935 buildPartial() {
            C2S_RushRankInfo_18935 result = new C2S_RushRankInfo_18935(this);
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
            if (other instanceof C2S_RushRankInfo_18935) {
               return this.mergeFrom((C2S_RushRankInfo_18935)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RushRankInfo_18935 other) {
            if (other == MergeActivityMsg.C2S_RushRankInfo_18935.getDefaultInstance()) {
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
            C2S_RushRankInfo_18935 parsedMessage = null;

            try {
               parsedMessage = (C2S_RushRankInfo_18935)MergeActivityMsg.C2S_RushRankInfo_18935.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RushRankInfo_18935)e.getUnfinishedMessage();
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

   public static final class S2C_RushRankInfo_18936 extends GeneratedMessageV3 implements S2C_RushRankInfo_18936OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RUSHRANKID_FIELD_NUMBER = 1;
      private int rushRankId_;
      public static final int STAGEENDTIME_FIELD_NUMBER = 2;
      private long stageEndTime_;
      private byte memoizedIsInitialized;
      private static final S2C_RushRankInfo_18936 DEFAULT_INSTANCE = new S2C_RushRankInfo_18936();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RushRankInfo_18936> PARSER = new AbstractParser<S2C_RushRankInfo_18936>() {
         public S2C_RushRankInfo_18936 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RushRankInfo_18936(input, extensionRegistry);
         }
      };

      private S2C_RushRankInfo_18936(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RushRankInfo_18936() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RushRankInfo_18936();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RushRankInfo_18936(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rushRankId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.stageEndTime_ = input.readInt64();
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
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_RushRankInfo_18936_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_RushRankInfo_18936_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RushRankInfo_18936.class, Builder.class);
      }

      public boolean hasRushRankId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRushRankId() {
         return this.rushRankId_;
      }

      public boolean hasStageEndTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getStageEndTime() {
         return this.stageEndTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRushRankId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStageEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.rushRankId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.stageEndTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.rushRankId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.stageEndTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RushRankInfo_18936)) {
            return super.equals(obj);
         } else {
            S2C_RushRankInfo_18936 other = (S2C_RushRankInfo_18936)obj;
            if (this.hasRushRankId() != other.hasRushRankId()) {
               return false;
            } else if (this.hasRushRankId() && this.getRushRankId() != other.getRushRankId()) {
               return false;
            } else if (this.hasStageEndTime() != other.hasStageEndTime()) {
               return false;
            } else if (this.hasStageEndTime() && this.getStageEndTime() != other.getStageEndTime()) {
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
            if (this.hasRushRankId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRushRankId();
            }

            if (this.hasStageEndTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getStageEndTime());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RushRankInfo_18936 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RushRankInfo_18936)PARSER.parseFrom(data);
      }

      public static S2C_RushRankInfo_18936 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RushRankInfo_18936)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RushRankInfo_18936 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RushRankInfo_18936)PARSER.parseFrom(data);
      }

      public static S2C_RushRankInfo_18936 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RushRankInfo_18936)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RushRankInfo_18936 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RushRankInfo_18936)PARSER.parseFrom(data);
      }

      public static S2C_RushRankInfo_18936 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RushRankInfo_18936)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RushRankInfo_18936 parseFrom(InputStream input) throws IOException {
         return (S2C_RushRankInfo_18936)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RushRankInfo_18936 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RushRankInfo_18936)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RushRankInfo_18936 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RushRankInfo_18936)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RushRankInfo_18936 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RushRankInfo_18936)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RushRankInfo_18936 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RushRankInfo_18936)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RushRankInfo_18936 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RushRankInfo_18936)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RushRankInfo_18936 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RushRankInfo_18936 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RushRankInfo_18936> parser() {
         return PARSER;
      }

      public Parser<S2C_RushRankInfo_18936> getParserForType() {
         return PARSER;
      }

      public S2C_RushRankInfo_18936 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RushRankInfo_18936OrBuilder {
         private int bitField0_;
         private int rushRankId_;
         private long stageEndTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_RushRankInfo_18936_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_RushRankInfo_18936_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RushRankInfo_18936.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeActivityMsg.S2C_RushRankInfo_18936.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rushRankId_ = 0;
            this.bitField0_ &= -2;
            this.stageEndTime_ = 0L;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_RushRankInfo_18936_descriptor;
         }

         public S2C_RushRankInfo_18936 getDefaultInstanceForType() {
            return MergeActivityMsg.S2C_RushRankInfo_18936.getDefaultInstance();
         }

         public S2C_RushRankInfo_18936 build() {
            S2C_RushRankInfo_18936 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RushRankInfo_18936 buildPartial() {
            S2C_RushRankInfo_18936 result = new S2C_RushRankInfo_18936(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rushRankId_ = this.rushRankId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.stageEndTime_ = this.stageEndTime_;
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
            if (other instanceof S2C_RushRankInfo_18936) {
               return this.mergeFrom((S2C_RushRankInfo_18936)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RushRankInfo_18936 other) {
            if (other == MergeActivityMsg.S2C_RushRankInfo_18936.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRushRankId()) {
                  this.setRushRankId(other.getRushRankId());
               }

               if (other.hasStageEndTime()) {
                  this.setStageEndTime(other.getStageEndTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRushRankId()) {
               return false;
            } else {
               return this.hasStageEndTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RushRankInfo_18936 parsedMessage = null;

            try {
               parsedMessage = (S2C_RushRankInfo_18936)MergeActivityMsg.S2C_RushRankInfo_18936.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RushRankInfo_18936)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRushRankId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRushRankId() {
            return this.rushRankId_;
         }

         public Builder setRushRankId(int value) {
            this.bitField0_ |= 1;
            this.rushRankId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRushRankId() {
            this.bitField0_ &= -2;
            this.rushRankId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStageEndTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getStageEndTime() {
            return this.stageEndTime_;
         }

         public Builder setStageEndTime(long value) {
            this.bitField0_ |= 2;
            this.stageEndTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageEndTime() {
            this.bitField0_ &= -3;
            this.stageEndTime_ = 0L;
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

   public static final class S2C_MergeSubActivityInfo_18937 extends GeneratedMessageV3 implements S2C_MergeSubActivityInfo_18937OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYTYPE_FIELD_NUMBER = 1;
      private int activityType_;
      public static final int OPENTIME_FIELD_NUMBER = 2;
      private long openTime_;
      public static final int ENDTIME_FIELD_NUMBER = 3;
      private long endTime_;
      private byte memoizedIsInitialized;
      private static final S2C_MergeSubActivityInfo_18937 DEFAULT_INSTANCE = new S2C_MergeSubActivityInfo_18937();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MergeSubActivityInfo_18937> PARSER = new AbstractParser<S2C_MergeSubActivityInfo_18937>() {
         public S2C_MergeSubActivityInfo_18937 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MergeSubActivityInfo_18937(input, extensionRegistry);
         }
      };

      private S2C_MergeSubActivityInfo_18937(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MergeSubActivityInfo_18937() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MergeSubActivityInfo_18937();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MergeSubActivityInfo_18937(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.activityType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.openTime_ = input.readInt64();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.endTime_ = input.readInt64();
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
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_MergeSubActivityInfo_18937_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_MergeSubActivityInfo_18937_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MergeSubActivityInfo_18937.class, Builder.class);
      }

      public boolean hasActivityType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityType() {
         return this.activityType_;
      }

      public boolean hasOpenTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getOpenTime() {
         return this.openTime_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getEndTime() {
         return this.endTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasActivityType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOpenTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.activityType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.openTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(3, this.endTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.activityType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.openTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(3, this.endTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MergeSubActivityInfo_18937)) {
            return super.equals(obj);
         } else {
            S2C_MergeSubActivityInfo_18937 other = (S2C_MergeSubActivityInfo_18937)obj;
            if (this.hasActivityType() != other.hasActivityType()) {
               return false;
            } else if (this.hasActivityType() && this.getActivityType() != other.getActivityType()) {
               return false;
            } else if (this.hasOpenTime() != other.hasOpenTime()) {
               return false;
            } else if (this.hasOpenTime() && this.getOpenTime() != other.getOpenTime()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
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
            if (this.hasActivityType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getActivityType();
            }

            if (this.hasOpenTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getOpenTime());
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashLong(this.getEndTime());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MergeSubActivityInfo_18937 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MergeSubActivityInfo_18937)PARSER.parseFrom(data);
      }

      public static S2C_MergeSubActivityInfo_18937 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MergeSubActivityInfo_18937)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MergeSubActivityInfo_18937 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MergeSubActivityInfo_18937)PARSER.parseFrom(data);
      }

      public static S2C_MergeSubActivityInfo_18937 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MergeSubActivityInfo_18937)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MergeSubActivityInfo_18937 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MergeSubActivityInfo_18937)PARSER.parseFrom(data);
      }

      public static S2C_MergeSubActivityInfo_18937 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MergeSubActivityInfo_18937)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MergeSubActivityInfo_18937 parseFrom(InputStream input) throws IOException {
         return (S2C_MergeSubActivityInfo_18937)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MergeSubActivityInfo_18937 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MergeSubActivityInfo_18937)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MergeSubActivityInfo_18937 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MergeSubActivityInfo_18937)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MergeSubActivityInfo_18937 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MergeSubActivityInfo_18937)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MergeSubActivityInfo_18937 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MergeSubActivityInfo_18937)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MergeSubActivityInfo_18937 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MergeSubActivityInfo_18937)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MergeSubActivityInfo_18937 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MergeSubActivityInfo_18937 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MergeSubActivityInfo_18937> parser() {
         return PARSER;
      }

      public Parser<S2C_MergeSubActivityInfo_18937> getParserForType() {
         return PARSER;
      }

      public S2C_MergeSubActivityInfo_18937 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MergeSubActivityInfo_18937OrBuilder {
         private int bitField0_;
         private int activityType_;
         private long openTime_;
         private long endTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_MergeSubActivityInfo_18937_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_MergeSubActivityInfo_18937_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MergeSubActivityInfo_18937.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MergeActivityMsg.S2C_MergeSubActivityInfo_18937.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityType_ = 0;
            this.bitField0_ &= -2;
            this.openTime_ = 0L;
            this.bitField0_ &= -3;
            this.endTime_ = 0L;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MergeActivityMsg.internal_static_mergeActivity_com_gzbz_protobuf_S2C_MergeSubActivityInfo_18937_descriptor;
         }

         public S2C_MergeSubActivityInfo_18937 getDefaultInstanceForType() {
            return MergeActivityMsg.S2C_MergeSubActivityInfo_18937.getDefaultInstance();
         }

         public S2C_MergeSubActivityInfo_18937 build() {
            S2C_MergeSubActivityInfo_18937 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MergeSubActivityInfo_18937 buildPartial() {
            S2C_MergeSubActivityInfo_18937 result = new S2C_MergeSubActivityInfo_18937(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityType_ = this.activityType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.openTime_ = this.openTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.endTime_ = this.endTime_;
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
            if (other instanceof S2C_MergeSubActivityInfo_18937) {
               return this.mergeFrom((S2C_MergeSubActivityInfo_18937)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MergeSubActivityInfo_18937 other) {
            if (other == MergeActivityMsg.S2C_MergeSubActivityInfo_18937.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityType()) {
                  this.setActivityType(other.getActivityType());
               }

               if (other.hasOpenTime()) {
                  this.setOpenTime(other.getOpenTime());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActivityType()) {
               return false;
            } else if (!this.hasOpenTime()) {
               return false;
            } else {
               return this.hasEndTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MergeSubActivityInfo_18937 parsedMessage = null;

            try {
               parsedMessage = (S2C_MergeSubActivityInfo_18937)MergeActivityMsg.S2C_MergeSubActivityInfo_18937.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MergeSubActivityInfo_18937)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasActivityType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getActivityType() {
            return this.activityType_;
         }

         public Builder setActivityType(int value) {
            this.bitField0_ |= 1;
            this.activityType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityType() {
            this.bitField0_ &= -2;
            this.activityType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOpenTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getOpenTime() {
            return this.openTime_;
         }

         public Builder setOpenTime(long value) {
            this.bitField0_ |= 2;
            this.openTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpenTime() {
            this.bitField0_ &= -3;
            this.openTime_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public long getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(long value) {
            this.bitField0_ |= 4;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -5;
            this.endTime_ = 0L;
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

   public interface C2S_AddUpSign_18934OrBuilder extends MessageOrBuilder {
      boolean hasDay();

      int getDay();
   }

   public interface C2S_FancyReward_18911OrBuilder extends MessageOrBuilder {
      boolean hasItemIndex();

      int getItemIndex();
   }

   public interface C2S_LiYu_18901OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenEggUi_18917OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_RushRankInfo_18935OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SignTotalInfo_18931OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Sign_18933OrBuilder extends MessageOrBuilder {
      boolean hasDay();

      int getDay();
   }

   public interface C2S_SmashEgg_18913OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();
   }

   public interface C2S_TakeLuckReward_18915OrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();
   }

   public interface S2C_FancyReward_18912OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasItemIndex();

      int getItemIndex();
   }

   public interface S2C_LiYu_18902OrBuilder extends MessageOrBuilder {
      boolean hasStartTime();

      int getStartTime();

      boolean hasEndTime();

      int getEndTime();

      boolean hasInDay();

      int getInDay();

      boolean hasTodayVip();

      int getTodayVip();
   }

   public interface S2C_MergeSubActivityInfo_18937OrBuilder extends MessageOrBuilder {
      boolean hasActivityType();

      int getActivityType();

      boolean hasOpenTime();

      long getOpenTime();

      boolean hasEndTime();

      long getEndTime();
   }

   public interface S2C_OpenEggUi_18918OrBuilder extends MessageOrBuilder {
      boolean hasFancyId();

      int getFancyId();

      List<CommonMsg.MapDataII> getSeniorRewardsList();

      CommonMsg.MapDataII getSeniorRewards(int index);

      int getSeniorRewardsCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getSeniorRewardsOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getSeniorRewardsOrBuilder(int index);

      boolean hasSmashEggNum();

      int getSmashEggNum();

      List<Integer> getTakedLuckList();

      int getTakedLuckCount();

      int getTakedLuck(int index);

      boolean hasSmashEggStage();

      int getSmashEggStage();

      boolean hasFancyGroupDrawTimes();

      int getFancyGroupDrawTimes();
   }

   public interface S2C_RushRankInfo_18936OrBuilder extends MessageOrBuilder {
      boolean hasRushRankId();

      int getRushRankId();

      boolean hasStageEndTime();

      long getStageEndTime();
   }

   public interface S2C_SignTotalInfo_18932OrBuilder extends MessageOrBuilder {
      boolean hasActivityDay();

      int getActivityDay();

      List<Integer> getSignGotRewardsList();

      int getSignGotRewardsCount();

      int getSignGotRewards(int index);
   }

   public interface S2C_SmashEgg_18914OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      List<CommonMsg.MapDataII> getSeniorNumList();

      CommonMsg.MapDataII getSeniorNum(int index);

      int getSeniorNumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getSeniorNumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getSeniorNumOrBuilder(int index);

      boolean hasSmashEggNum();

      int getSmashEggNum();

      boolean hasIsHaveFancy();

      boolean getIsHaveFancy();

      boolean hasFancyGroupDrawTimes();

      int getFancyGroupDrawTimes();
   }

   public interface S2C_TakeLuckReward_18916OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      List<Integer> getTakedIdList();

      int getTakedIdCount();

      int getTakedId(int index);
   }
}
