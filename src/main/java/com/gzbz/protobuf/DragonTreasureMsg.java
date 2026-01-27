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

public final class DragonTreasureMsg {
   private static final Descriptors.Descriptor internal_static_dragonTreasure_com_gzbz_protobuf_C2S_DragonTreasureInfo_4901_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTreasure_com_gzbz_protobuf_C2S_DragonTreasureInfo_4901_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonTreasure_com_gzbz_protobuf_S2C_DragonTreasureInfo_4902_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTreasure_com_gzbz_protobuf_S2C_DragonTreasureInfo_4902_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonTreasure_com_gzbz_protobuf_C2S_RecruitAward_4903_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTreasure_com_gzbz_protobuf_C2S_RecruitAward_4903_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonTreasure_com_gzbz_protobuf_S2C_RecruitAward_4904_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTreasure_com_gzbz_protobuf_S2C_RecruitAward_4904_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonTreasure_com_gzbz_protobuf_C2S_RefreshPool_4905_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTreasure_com_gzbz_protobuf_C2S_RefreshPool_4905_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonTreasure_com_gzbz_protobuf_S2C_RefreshPool_4906_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTreasure_com_gzbz_protobuf_S2C_RefreshPool_4906_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonTreasure_com_gzbz_protobuf_C2S_PointRank_4907_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTreasure_com_gzbz_protobuf_C2S_PointRank_4907_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonTreasure_com_gzbz_protobuf_S2C_PointRank_4908_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTreasure_com_gzbz_protobuf_S2C_PointRank_4908_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonTreasure_com_gzbz_protobuf_C2S_ReceiveBoxAward_4909_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTreasure_com_gzbz_protobuf_C2S_ReceiveBoxAward_4909_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonTreasure_com_gzbz_protobuf_S2C_ReceiveBoxAward_4910_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTreasure_com_gzbz_protobuf_S2C_ReceiveBoxAward_4910_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonTreasure_com_gzbz_protobuf_RankData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTreasure_com_gzbz_protobuf_RankData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonTreasure_com_gzbz_protobuf_AwardPool_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTreasure_com_gzbz_protobuf_AwardPool_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonTreasure_com_gzbz_protobuf_RecruitRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTreasure_com_gzbz_protobuf_RecruitRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonTreasure_com_gzbz_protobuf_S2S_UpdateRecord_4930_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTreasure_com_gzbz_protobuf_S2S_UpdateRecord_4930_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonTreasure_com_gzbz_protobuf_S2S_UpdatePoint_4931_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTreasure_com_gzbz_protobuf_S2S_UpdatePoint_4931_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonTreasure_com_gzbz_protobuf_S2S_NotifySendAward_4932_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTreasure_com_gzbz_protobuf_S2S_NotifySendAward_4932_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_dragonTreasure_com_gzbz_protobuf_S2S_BroadcastAward_4933_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_dragonTreasure_com_gzbz_protobuf_S2S_BroadcastAward_4933_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private DragonTreasureMsg() {
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
      String[] descriptorData = new String[]{"\n\u0014DragonTreasure.proto\u0012 dragonTreasure.com.gzbz.protobuf\u001a\fcommon.proto\"\u001d\n\u001bC2S_DragonTreasureInfo_4901\"\u0093\u0004\n\u001bS2C_DragonTreasureInfo_4902\u0012>\n\tawardPool\u0018\u0001 \u0003(\u000b2+.dragonTreasure.com.gzbz.protobuf.AwardPool\u0012\u0012\n\nluckyPoint\u0018\u0002 \u0002(\u0005\u0012\u0010\n\baddMoney\u0018\u0004 \u0002(\u0005\u0012\u000f\n\u0007goldNum\u0018\u0005 \u0002(\u0005\u0012\u000f\n\u0007propNum\u0018\u0006 \u0002(\u0005\u0012\u0012\n\nrefreshNum\u0018\u0007 \u0002(\u0005\u0012A\n\bmyRecord\u0018\b \u0003(\u000b2/.dragonTreasure.com.gzbz.protobuf.RecruitRecord\u0012B\n\tallRecord\u0018\t \u0003(\u000b2/.dragonTreasure.com.gzbz.protobuf.RecruitRecord\u00129\n\u0005ranks\u0018\n \u0003(\u000b2*.dragonTreasure.com.gzbz.protobuf.RankData\u0012$\n\tawardList\u0018\u000b \u0003(\u000b2\u0011.common.MapDataII\u0012\u0012\n\nreceiveBox\u0018\f \u0003(\u0005\u0012\u000e\n\u0006myRank\u0018\r \u0001(\u0005\u0012\u0012\n\nactivityId\u0018\u000e \u0001(\u0005\u0012\u000f\n\u0007endTime\u0018\u000f \u0001(\u0005\u0012\u0011\n\taheadTime\u0018\u0010 \u0001(\u0005\u0012\u0014\n\factivityType\u0018\u0011 \u0001(\u0005\",\n\u0015C2S_RecruitAward_4903\u0012\u0013\n\u000brecruitType\u0018\u0001 \u0002(\u0005\",\n\u0015S2C_RecruitAward_4904\u0012\u0013\n\u000brecruitType\u0018\u0001 \u0002(\u0005\"\u0016\n\u0014C2S_RefreshPool_4905\"j\n\u0014S2C_RefreshPool_4906\u0012\u0012\n\nrefreshNum\u0018\u0001 \u0002(\u0005\u0012>\n\tawardPool\u0018\u0002 \u0003(\u000b2+.dragonTreasure.com.gzbz.protobuf.AwardPool\"(\n\u0012C2S_PointRank_4907\u0012\u0012\n\nactivityId\u0018\u0001 \u0001(\u0005\"\u008b\u0001\n\u0012S2C_PointRank_4908\u0012:\n\u0006myRank\u0018\u0001 \u0001(\u000b2*.dragonTreasure.com.gzbz.protobuf.RankData\u00129\n\u0005ranks\u0018\u0002 \u0003(\u000b2*.dragonTreasure.com.gzbz.protobuf.RankData\"-\n\u0018C2S_ReceiveBoxAward_4909\u0012\u0011\n\tluckPoint\u0018\u0001 \u0002(\u0005\".\n\u0018S2C_ReceiveBoxAward_4910\u0012\u0012\n\nreceiveBox\u0018\u0001 \u0003(\u0005\"\u008c\u0001\n\bRankData\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bserverId\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004head\u0018\u0004 \u0002(\u0005\u0012\u0011\n\theadFrame\u0018\u0005 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0006 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0007 \u0002(\t\u0012\r\n\u0005score\u0018\b \u0002(\u0005\";\n\tAwardPool\u0012\u0010\n\bposition\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007awardId\u0018\u0002 \u0002(\u0005\u0012\u000b\n\u0003end\u0018\u0003 \u0002(\b\"k\n\rRecruitRecord\u0012\u0010\n\bserverId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0002(\t\u0012\u000f\n\u0007awardId\u0018\u0004 \u0002(\u0005\u0012\u0011\n\tbroadcast\u0018\u0005 \u0002(\b\">\n\u0015S2S_UpdateRecord_4930\u0012\u0011\n\tawardList\u0018\u0001 \u0003(\u0005\u0012\u0012\n\nactivityId\u0018\u0002 \u0002(\u0005\"c\n\u0014S2S_UpdatePoint_4931\u0012\u0010\n\baddPoint\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nactivityId\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0003 \u0002(\u0005\u0012\u0014\n\factivityType\u0018\u0004 \u0002(\u0005\"7\n\u0018S2S_NotifySendAward_4932\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005point\u0018\u0002 \u0002(\u0005\"\u0019\n\u0017S2S_BroadcastAward_4933B(\n\u0011com.gzbz.protobufB\u0011DragonTreasureMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_dragonTreasure_com_gzbz_protobuf_C2S_DragonTreasureInfo_4901_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_dragonTreasure_com_gzbz_protobuf_C2S_DragonTreasureInfo_4901_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTreasure_com_gzbz_protobuf_C2S_DragonTreasureInfo_4901_descriptor, new String[0]);
      internal_static_dragonTreasure_com_gzbz_protobuf_S2C_DragonTreasureInfo_4902_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_dragonTreasure_com_gzbz_protobuf_S2C_DragonTreasureInfo_4902_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTreasure_com_gzbz_protobuf_S2C_DragonTreasureInfo_4902_descriptor, new String[]{"AwardPool", "LuckyPoint", "AddMoney", "GoldNum", "PropNum", "RefreshNum", "MyRecord", "AllRecord", "Ranks", "AwardList", "ReceiveBox", "MyRank", "ActivityId", "EndTime", "AheadTime", "ActivityType"});
      internal_static_dragonTreasure_com_gzbz_protobuf_C2S_RecruitAward_4903_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_dragonTreasure_com_gzbz_protobuf_C2S_RecruitAward_4903_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTreasure_com_gzbz_protobuf_C2S_RecruitAward_4903_descriptor, new String[]{"RecruitType"});
      internal_static_dragonTreasure_com_gzbz_protobuf_S2C_RecruitAward_4904_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_dragonTreasure_com_gzbz_protobuf_S2C_RecruitAward_4904_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTreasure_com_gzbz_protobuf_S2C_RecruitAward_4904_descriptor, new String[]{"RecruitType"});
      internal_static_dragonTreasure_com_gzbz_protobuf_C2S_RefreshPool_4905_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_dragonTreasure_com_gzbz_protobuf_C2S_RefreshPool_4905_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTreasure_com_gzbz_protobuf_C2S_RefreshPool_4905_descriptor, new String[0]);
      internal_static_dragonTreasure_com_gzbz_protobuf_S2C_RefreshPool_4906_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_dragonTreasure_com_gzbz_protobuf_S2C_RefreshPool_4906_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTreasure_com_gzbz_protobuf_S2C_RefreshPool_4906_descriptor, new String[]{"RefreshNum", "AwardPool"});
      internal_static_dragonTreasure_com_gzbz_protobuf_C2S_PointRank_4907_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_dragonTreasure_com_gzbz_protobuf_C2S_PointRank_4907_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTreasure_com_gzbz_protobuf_C2S_PointRank_4907_descriptor, new String[]{"ActivityId"});
      internal_static_dragonTreasure_com_gzbz_protobuf_S2C_PointRank_4908_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_dragonTreasure_com_gzbz_protobuf_S2C_PointRank_4908_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTreasure_com_gzbz_protobuf_S2C_PointRank_4908_descriptor, new String[]{"MyRank", "Ranks"});
      internal_static_dragonTreasure_com_gzbz_protobuf_C2S_ReceiveBoxAward_4909_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_dragonTreasure_com_gzbz_protobuf_C2S_ReceiveBoxAward_4909_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTreasure_com_gzbz_protobuf_C2S_ReceiveBoxAward_4909_descriptor, new String[]{"LuckPoint"});
      internal_static_dragonTreasure_com_gzbz_protobuf_S2C_ReceiveBoxAward_4910_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_dragonTreasure_com_gzbz_protobuf_S2C_ReceiveBoxAward_4910_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTreasure_com_gzbz_protobuf_S2C_ReceiveBoxAward_4910_descriptor, new String[]{"ReceiveBox"});
      internal_static_dragonTreasure_com_gzbz_protobuf_RankData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_dragonTreasure_com_gzbz_protobuf_RankData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTreasure_com_gzbz_protobuf_RankData_descriptor, new String[]{"Rank", "ServerId", "PlayerId", "Head", "HeadFrame", "Lv", "PlayerName", "Score"});
      internal_static_dragonTreasure_com_gzbz_protobuf_AwardPool_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_dragonTreasure_com_gzbz_protobuf_AwardPool_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTreasure_com_gzbz_protobuf_AwardPool_descriptor, new String[]{"Position", "AwardId", "End"});
      internal_static_dragonTreasure_com_gzbz_protobuf_RecruitRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_dragonTreasure_com_gzbz_protobuf_RecruitRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTreasure_com_gzbz_protobuf_RecruitRecord_descriptor, new String[]{"ServerId", "PlayerId", "PlayerName", "AwardId", "Broadcast"});
      internal_static_dragonTreasure_com_gzbz_protobuf_S2S_UpdateRecord_4930_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_dragonTreasure_com_gzbz_protobuf_S2S_UpdateRecord_4930_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTreasure_com_gzbz_protobuf_S2S_UpdateRecord_4930_descriptor, new String[]{"AwardList", "ActivityId"});
      internal_static_dragonTreasure_com_gzbz_protobuf_S2S_UpdatePoint_4931_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_dragonTreasure_com_gzbz_protobuf_S2S_UpdatePoint_4931_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTreasure_com_gzbz_protobuf_S2S_UpdatePoint_4931_descriptor, new String[]{"AddPoint", "ActivityId", "EndTime", "ActivityType"});
      internal_static_dragonTreasure_com_gzbz_protobuf_S2S_NotifySendAward_4932_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_dragonTreasure_com_gzbz_protobuf_S2S_NotifySendAward_4932_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTreasure_com_gzbz_protobuf_S2S_NotifySendAward_4932_descriptor, new String[]{"Rank", "Point"});
      internal_static_dragonTreasure_com_gzbz_protobuf_S2S_BroadcastAward_4933_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_dragonTreasure_com_gzbz_protobuf_S2S_BroadcastAward_4933_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_dragonTreasure_com_gzbz_protobuf_S2S_BroadcastAward_4933_descriptor, new String[0]);
      CommonMsg.getDescriptor();
   }

   public static final class C2S_DragonTreasureInfo_4901 extends GeneratedMessageV3 implements C2S_DragonTreasureInfo_4901OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DragonTreasureInfo_4901 DEFAULT_INSTANCE = new C2S_DragonTreasureInfo_4901();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DragonTreasureInfo_4901> PARSER = new AbstractParser<C2S_DragonTreasureInfo_4901>() {
         public C2S_DragonTreasureInfo_4901 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DragonTreasureInfo_4901(input, extensionRegistry);
         }
      };

      private C2S_DragonTreasureInfo_4901(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DragonTreasureInfo_4901() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DragonTreasureInfo_4901();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DragonTreasureInfo_4901(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_DragonTreasureInfo_4901_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_DragonTreasureInfo_4901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DragonTreasureInfo_4901.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DragonTreasureInfo_4901)) {
            return super.equals(obj);
         } else {
            C2S_DragonTreasureInfo_4901 other = (C2S_DragonTreasureInfo_4901)obj;
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

      public static C2S_DragonTreasureInfo_4901 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DragonTreasureInfo_4901)PARSER.parseFrom(data);
      }

      public static C2S_DragonTreasureInfo_4901 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DragonTreasureInfo_4901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DragonTreasureInfo_4901 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DragonTreasureInfo_4901)PARSER.parseFrom(data);
      }

      public static C2S_DragonTreasureInfo_4901 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DragonTreasureInfo_4901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DragonTreasureInfo_4901 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DragonTreasureInfo_4901)PARSER.parseFrom(data);
      }

      public static C2S_DragonTreasureInfo_4901 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DragonTreasureInfo_4901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DragonTreasureInfo_4901 parseFrom(InputStream input) throws IOException {
         return (C2S_DragonTreasureInfo_4901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DragonTreasureInfo_4901 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DragonTreasureInfo_4901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DragonTreasureInfo_4901 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DragonTreasureInfo_4901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DragonTreasureInfo_4901 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DragonTreasureInfo_4901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DragonTreasureInfo_4901 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DragonTreasureInfo_4901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DragonTreasureInfo_4901 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DragonTreasureInfo_4901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DragonTreasureInfo_4901 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DragonTreasureInfo_4901 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DragonTreasureInfo_4901> parser() {
         return PARSER;
      }

      public Parser<C2S_DragonTreasureInfo_4901> getParserForType() {
         return PARSER;
      }

      public C2S_DragonTreasureInfo_4901 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DragonTreasureInfo_4901OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_DragonTreasureInfo_4901_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_DragonTreasureInfo_4901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DragonTreasureInfo_4901.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTreasureMsg.C2S_DragonTreasureInfo_4901.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_DragonTreasureInfo_4901_descriptor;
         }

         public C2S_DragonTreasureInfo_4901 getDefaultInstanceForType() {
            return DragonTreasureMsg.C2S_DragonTreasureInfo_4901.getDefaultInstance();
         }

         public C2S_DragonTreasureInfo_4901 build() {
            C2S_DragonTreasureInfo_4901 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DragonTreasureInfo_4901 buildPartial() {
            C2S_DragonTreasureInfo_4901 result = new C2S_DragonTreasureInfo_4901(this);
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
            if (other instanceof C2S_DragonTreasureInfo_4901) {
               return this.mergeFrom((C2S_DragonTreasureInfo_4901)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DragonTreasureInfo_4901 other) {
            if (other == DragonTreasureMsg.C2S_DragonTreasureInfo_4901.getDefaultInstance()) {
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
            C2S_DragonTreasureInfo_4901 parsedMessage = null;

            try {
               parsedMessage = (C2S_DragonTreasureInfo_4901)DragonTreasureMsg.C2S_DragonTreasureInfo_4901.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DragonTreasureInfo_4901)e.getUnfinishedMessage();
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

   public static final class S2C_DragonTreasureInfo_4902 extends GeneratedMessageV3 implements S2C_DragonTreasureInfo_4902OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int AWARDPOOL_FIELD_NUMBER = 1;
      private List<AwardPool> awardPool_;
      public static final int LUCKYPOINT_FIELD_NUMBER = 2;
      private int luckyPoint_;
      public static final int ADDMONEY_FIELD_NUMBER = 4;
      private int addMoney_;
      public static final int GOLDNUM_FIELD_NUMBER = 5;
      private int goldNum_;
      public static final int PROPNUM_FIELD_NUMBER = 6;
      private int propNum_;
      public static final int REFRESHNUM_FIELD_NUMBER = 7;
      private int refreshNum_;
      public static final int MYRECORD_FIELD_NUMBER = 8;
      private List<RecruitRecord> myRecord_;
      public static final int ALLRECORD_FIELD_NUMBER = 9;
      private List<RecruitRecord> allRecord_;
      public static final int RANKS_FIELD_NUMBER = 10;
      private List<RankData> ranks_;
      public static final int AWARDLIST_FIELD_NUMBER = 11;
      private List<CommonMsg.MapDataII> awardList_;
      public static final int RECEIVEBOX_FIELD_NUMBER = 12;
      private Internal.IntList receiveBox_;
      public static final int MYRANK_FIELD_NUMBER = 13;
      private int myRank_;
      public static final int ACTIVITYID_FIELD_NUMBER = 14;
      private int activityId_;
      public static final int ENDTIME_FIELD_NUMBER = 15;
      private int endTime_;
      public static final int AHEADTIME_FIELD_NUMBER = 16;
      private int aheadTime_;
      public static final int ACTIVITYTYPE_FIELD_NUMBER = 17;
      private int activityType_;
      private byte memoizedIsInitialized;
      private static final S2C_DragonTreasureInfo_4902 DEFAULT_INSTANCE = new S2C_DragonTreasureInfo_4902();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DragonTreasureInfo_4902> PARSER = new AbstractParser<S2C_DragonTreasureInfo_4902>() {
         public S2C_DragonTreasureInfo_4902 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DragonTreasureInfo_4902(input, extensionRegistry);
         }
      };

      private S2C_DragonTreasureInfo_4902(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DragonTreasureInfo_4902() {
         this.memoizedIsInitialized = -1;
         this.awardPool_ = Collections.emptyList();
         this.myRecord_ = Collections.emptyList();
         this.allRecord_ = Collections.emptyList();
         this.ranks_ = Collections.emptyList();
         this.awardList_ = Collections.emptyList();
         this.receiveBox_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DragonTreasureInfo_4902();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DragonTreasureInfo_4902(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.awardPool_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.awardPool_.add(input.readMessage(DragonTreasureMsg.AwardPool.PARSER, extensionRegistry));
                        continue;
                     case 16:
                        this.bitField0_ |= 1;
                        this.luckyPoint_ = input.readInt32();
                        continue;
                     case 32:
                        this.bitField0_ |= 2;
                        this.addMoney_ = input.readInt32();
                        continue;
                     case 40:
                        this.bitField0_ |= 4;
                        this.goldNum_ = input.readInt32();
                        continue;
                     case 48:
                        this.bitField0_ |= 8;
                        this.propNum_ = input.readInt32();
                        continue;
                     case 56:
                        this.bitField0_ |= 16;
                        this.refreshNum_ = input.readInt32();
                        continue;
                     case 66:
                        if ((mutable_bitField0_ & 64) == 0) {
                           this.myRecord_ = new ArrayList();
                           mutable_bitField0_ |= 64;
                        }

                        this.myRecord_.add(input.readMessage(DragonTreasureMsg.RecruitRecord.PARSER, extensionRegistry));
                        continue;
                     case 74:
                        if ((mutable_bitField0_ & 128) == 0) {
                           this.allRecord_ = new ArrayList();
                           mutable_bitField0_ |= 128;
                        }

                        this.allRecord_.add(input.readMessage(DragonTreasureMsg.RecruitRecord.PARSER, extensionRegistry));
                        continue;
                     case 82:
                        if ((mutable_bitField0_ & 256) == 0) {
                           this.ranks_ = new ArrayList();
                           mutable_bitField0_ |= 256;
                        }

                        this.ranks_.add(input.readMessage(DragonTreasureMsg.RankData.PARSER, extensionRegistry));
                        continue;
                     case 90:
                        if ((mutable_bitField0_ & 512) == 0) {
                           this.awardList_ = new ArrayList();
                           mutable_bitField0_ |= 512;
                        }

                        this.awardList_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        continue;
                     case 96:
                        if ((mutable_bitField0_ & 1024) == 0) {
                           this.receiveBox_ = newIntList();
                           mutable_bitField0_ |= 1024;
                        }

                        this.receiveBox_.addInt(input.readInt32());
                        continue;
                     case 98:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1024) == 0 && input.getBytesUntilLimit() > 0) {
                           this.receiveBox_ = newIntList();
                           mutable_bitField0_ |= 1024;
                        }
                        break;
                     case 104:
                        this.bitField0_ |= 32;
                        this.myRank_ = input.readInt32();
                        continue;
                     case 112:
                        this.bitField0_ |= 64;
                        this.activityId_ = input.readInt32();
                        continue;
                     case 120:
                        this.bitField0_ |= 128;
                        this.endTime_ = input.readInt32();
                        continue;
                     case 128:
                        this.bitField0_ |= 256;
                        this.aheadTime_ = input.readInt32();
                        continue;
                     case 136:
                        this.bitField0_ |= 512;
                        this.activityType_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.receiveBox_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.awardPool_ = Collections.unmodifiableList(this.awardPool_);
               }

               if ((mutable_bitField0_ & 64) != 0) {
                  this.myRecord_ = Collections.unmodifiableList(this.myRecord_);
               }

               if ((mutable_bitField0_ & 128) != 0) {
                  this.allRecord_ = Collections.unmodifiableList(this.allRecord_);
               }

               if ((mutable_bitField0_ & 256) != 0) {
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
               }

               if ((mutable_bitField0_ & 512) != 0) {
                  this.awardList_ = Collections.unmodifiableList(this.awardList_);
               }

               if ((mutable_bitField0_ & 1024) != 0) {
                  this.receiveBox_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_DragonTreasureInfo_4902_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_DragonTreasureInfo_4902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DragonTreasureInfo_4902.class, Builder.class);
      }

      public List<AwardPool> getAwardPoolList() {
         return this.awardPool_;
      }

      public List<? extends AwardPoolOrBuilder> getAwardPoolOrBuilderList() {
         return this.awardPool_;
      }

      public int getAwardPoolCount() {
         return this.awardPool_.size();
      }

      public AwardPool getAwardPool(int index) {
         return (AwardPool)this.awardPool_.get(index);
      }

      public AwardPoolOrBuilder getAwardPoolOrBuilder(int index) {
         return (AwardPoolOrBuilder)this.awardPool_.get(index);
      }

      public boolean hasLuckyPoint() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLuckyPoint() {
         return this.luckyPoint_;
      }

      public boolean hasAddMoney() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getAddMoney() {
         return this.addMoney_;
      }

      public boolean hasGoldNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getGoldNum() {
         return this.goldNum_;
      }

      public boolean hasPropNum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getPropNum() {
         return this.propNum_;
      }

      public boolean hasRefreshNum() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getRefreshNum() {
         return this.refreshNum_;
      }

      public List<RecruitRecord> getMyRecordList() {
         return this.myRecord_;
      }

      public List<? extends RecruitRecordOrBuilder> getMyRecordOrBuilderList() {
         return this.myRecord_;
      }

      public int getMyRecordCount() {
         return this.myRecord_.size();
      }

      public RecruitRecord getMyRecord(int index) {
         return (RecruitRecord)this.myRecord_.get(index);
      }

      public RecruitRecordOrBuilder getMyRecordOrBuilder(int index) {
         return (RecruitRecordOrBuilder)this.myRecord_.get(index);
      }

      public List<RecruitRecord> getAllRecordList() {
         return this.allRecord_;
      }

      public List<? extends RecruitRecordOrBuilder> getAllRecordOrBuilderList() {
         return this.allRecord_;
      }

      public int getAllRecordCount() {
         return this.allRecord_.size();
      }

      public RecruitRecord getAllRecord(int index) {
         return (RecruitRecord)this.allRecord_.get(index);
      }

      public RecruitRecordOrBuilder getAllRecordOrBuilder(int index) {
         return (RecruitRecordOrBuilder)this.allRecord_.get(index);
      }

      public List<RankData> getRanksList() {
         return this.ranks_;
      }

      public List<? extends RankDataOrBuilder> getRanksOrBuilderList() {
         return this.ranks_;
      }

      public int getRanksCount() {
         return this.ranks_.size();
      }

      public RankData getRanks(int index) {
         return (RankData)this.ranks_.get(index);
      }

      public RankDataOrBuilder getRanksOrBuilder(int index) {
         return (RankDataOrBuilder)this.ranks_.get(index);
      }

      public List<CommonMsg.MapDataII> getAwardListList() {
         return this.awardList_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getAwardListOrBuilderList() {
         return this.awardList_;
      }

      public int getAwardListCount() {
         return this.awardList_.size();
      }

      public CommonMsg.MapDataII getAwardList(int index) {
         return (CommonMsg.MapDataII)this.awardList_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getAwardListOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.awardList_.get(index);
      }

      public List<Integer> getReceiveBoxList() {
         return this.receiveBox_;
      }

      public int getReceiveBoxCount() {
         return this.receiveBox_.size();
      }

      public int getReceiveBox(int index) {
         return this.receiveBox_.getInt(index);
      }

      public boolean hasMyRank() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getMyRank() {
         return this.myRank_;
      }

      public boolean hasActivityId() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getActivityId() {
         return this.activityId_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public boolean hasAheadTime() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getAheadTime() {
         return this.aheadTime_;
      }

      public boolean hasActivityType() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getActivityType() {
         return this.activityType_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLuckyPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAddMoney()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGoldNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPropNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRefreshNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getAwardPoolCount(); ++i) {
               if (!this.getAwardPool(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getMyRecordCount(); ++i) {
               if (!this.getMyRecord(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getAllRecordCount(); ++i) {
               if (!this.getAllRecord(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getRanksCount(); ++i) {
               if (!this.getRanks(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getAwardListCount(); ++i) {
               if (!this.getAwardList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.awardPool_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.awardPool_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.luckyPoint_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(4, this.addMoney_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(5, this.goldNum_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(6, this.propNum_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(7, this.refreshNum_);
         }

         for(int i = 0; i < this.myRecord_.size(); ++i) {
            output.writeMessage(8, (MessageLite)this.myRecord_.get(i));
         }

         for(int i = 0; i < this.allRecord_.size(); ++i) {
            output.writeMessage(9, (MessageLite)this.allRecord_.get(i));
         }

         for(int i = 0; i < this.ranks_.size(); ++i) {
            output.writeMessage(10, (MessageLite)this.ranks_.get(i));
         }

         for(int i = 0; i < this.awardList_.size(); ++i) {
            output.writeMessage(11, (MessageLite)this.awardList_.get(i));
         }

         for(int i = 0; i < this.receiveBox_.size(); ++i) {
            output.writeInt32(12, this.receiveBox_.getInt(i));
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(13, this.myRank_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(14, this.activityId_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(15, this.endTime_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(16, this.aheadTime_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(17, this.activityType_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.awardPool_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.awardPool_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.luckyPoint_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.addMoney_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.goldNum_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.propNum_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.refreshNum_);
            }

            for(int i = 0; i < this.myRecord_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(8, (MessageLite)this.myRecord_.get(i));
            }

            for(int i = 0; i < this.allRecord_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(9, (MessageLite)this.allRecord_.get(i));
            }

            for(int i = 0; i < this.ranks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(10, (MessageLite)this.ranks_.get(i));
            }

            for(int i = 0; i < this.awardList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(11, (MessageLite)this.awardList_.get(i));
            }

            int dataSize = 0;

            for(int i = 0; i < this.receiveBox_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.receiveBox_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getReceiveBoxList().size();
            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(13, this.myRank_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(14, this.activityId_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(15, this.endTime_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(16, this.aheadTime_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(17, this.activityType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DragonTreasureInfo_4902)) {
            return super.equals(obj);
         } else {
            S2C_DragonTreasureInfo_4902 other = (S2C_DragonTreasureInfo_4902)obj;
            if (!this.getAwardPoolList().equals(other.getAwardPoolList())) {
               return false;
            } else if (this.hasLuckyPoint() != other.hasLuckyPoint()) {
               return false;
            } else if (this.hasLuckyPoint() && this.getLuckyPoint() != other.getLuckyPoint()) {
               return false;
            } else if (this.hasAddMoney() != other.hasAddMoney()) {
               return false;
            } else if (this.hasAddMoney() && this.getAddMoney() != other.getAddMoney()) {
               return false;
            } else if (this.hasGoldNum() != other.hasGoldNum()) {
               return false;
            } else if (this.hasGoldNum() && this.getGoldNum() != other.getGoldNum()) {
               return false;
            } else if (this.hasPropNum() != other.hasPropNum()) {
               return false;
            } else if (this.hasPropNum() && this.getPropNum() != other.getPropNum()) {
               return false;
            } else if (this.hasRefreshNum() != other.hasRefreshNum()) {
               return false;
            } else if (this.hasRefreshNum() && this.getRefreshNum() != other.getRefreshNum()) {
               return false;
            } else if (!this.getMyRecordList().equals(other.getMyRecordList())) {
               return false;
            } else if (!this.getAllRecordList().equals(other.getAllRecordList())) {
               return false;
            } else if (!this.getRanksList().equals(other.getRanksList())) {
               return false;
            } else if (!this.getAwardListList().equals(other.getAwardListList())) {
               return false;
            } else if (!this.getReceiveBoxList().equals(other.getReceiveBoxList())) {
               return false;
            } else if (this.hasMyRank() != other.hasMyRank()) {
               return false;
            } else if (this.hasMyRank() && this.getMyRank() != other.getMyRank()) {
               return false;
            } else if (this.hasActivityId() != other.hasActivityId()) {
               return false;
            } else if (this.hasActivityId() && this.getActivityId() != other.getActivityId()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasAheadTime() != other.hasAheadTime()) {
               return false;
            } else if (this.hasAheadTime() && this.getAheadTime() != other.getAheadTime()) {
               return false;
            } else if (this.hasActivityType() != other.hasActivityType()) {
               return false;
            } else if (this.hasActivityType() && this.getActivityType() != other.getActivityType()) {
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
            if (this.getAwardPoolCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAwardPoolList().hashCode();
            }

            if (this.hasLuckyPoint()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLuckyPoint();
            }

            if (this.hasAddMoney()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getAddMoney();
            }

            if (this.hasGoldNum()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getGoldNum();
            }

            if (this.hasPropNum()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getPropNum();
            }

            if (this.hasRefreshNum()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getRefreshNum();
            }

            if (this.getMyRecordCount() > 0) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getMyRecordList().hashCode();
            }

            if (this.getAllRecordCount() > 0) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getAllRecordList().hashCode();
            }

            if (this.getRanksCount() > 0) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getRanksList().hashCode();
            }

            if (this.getAwardListCount() > 0) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getAwardListList().hashCode();
            }

            if (this.getReceiveBoxCount() > 0) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getReceiveBoxList().hashCode();
            }

            if (this.hasMyRank()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + this.getMyRank();
            }

            if (this.hasActivityId()) {
               hash = 37 * hash + 14;
               hash = 53 * hash + this.getActivityId();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 15;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.hasAheadTime()) {
               hash = 37 * hash + 16;
               hash = 53 * hash + this.getAheadTime();
            }

            if (this.hasActivityType()) {
               hash = 37 * hash + 17;
               hash = 53 * hash + this.getActivityType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DragonTreasureInfo_4902 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DragonTreasureInfo_4902)PARSER.parseFrom(data);
      }

      public static S2C_DragonTreasureInfo_4902 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonTreasureInfo_4902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonTreasureInfo_4902 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DragonTreasureInfo_4902)PARSER.parseFrom(data);
      }

      public static S2C_DragonTreasureInfo_4902 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonTreasureInfo_4902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonTreasureInfo_4902 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DragonTreasureInfo_4902)PARSER.parseFrom(data);
      }

      public static S2C_DragonTreasureInfo_4902 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DragonTreasureInfo_4902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DragonTreasureInfo_4902 parseFrom(InputStream input) throws IOException {
         return (S2C_DragonTreasureInfo_4902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DragonTreasureInfo_4902 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonTreasureInfo_4902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DragonTreasureInfo_4902 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DragonTreasureInfo_4902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DragonTreasureInfo_4902 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonTreasureInfo_4902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DragonTreasureInfo_4902 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DragonTreasureInfo_4902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DragonTreasureInfo_4902 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DragonTreasureInfo_4902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DragonTreasureInfo_4902 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DragonTreasureInfo_4902 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DragonTreasureInfo_4902> parser() {
         return PARSER;
      }

      public Parser<S2C_DragonTreasureInfo_4902> getParserForType() {
         return PARSER;
      }

      public S2C_DragonTreasureInfo_4902 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DragonTreasureInfo_4902OrBuilder {
         private int bitField0_;
         private List<AwardPool> awardPool_;
         private RepeatedFieldBuilderV3<AwardPool, AwardPool.Builder, AwardPoolOrBuilder> awardPoolBuilder_;
         private int luckyPoint_;
         private int addMoney_;
         private int goldNum_;
         private int propNum_;
         private int refreshNum_;
         private List<RecruitRecord> myRecord_;
         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> myRecordBuilder_;
         private List<RecruitRecord> allRecord_;
         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> allRecordBuilder_;
         private List<RankData> ranks_;
         private RepeatedFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> ranksBuilder_;
         private List<CommonMsg.MapDataII> awardList_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> awardListBuilder_;
         private Internal.IntList receiveBox_;
         private int myRank_;
         private int activityId_;
         private int endTime_;
         private int aheadTime_;
         private int activityType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_DragonTreasureInfo_4902_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_DragonTreasureInfo_4902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DragonTreasureInfo_4902.class, Builder.class);
         }

         private Builder() {
            this.awardPool_ = Collections.emptyList();
            this.myRecord_ = Collections.emptyList();
            this.allRecord_ = Collections.emptyList();
            this.ranks_ = Collections.emptyList();
            this.awardList_ = Collections.emptyList();
            this.receiveBox_ = DragonTreasureMsg.S2C_DragonTreasureInfo_4902.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.awardPool_ = Collections.emptyList();
            this.myRecord_ = Collections.emptyList();
            this.allRecord_ = Collections.emptyList();
            this.ranks_ = Collections.emptyList();
            this.awardList_ = Collections.emptyList();
            this.receiveBox_ = DragonTreasureMsg.S2C_DragonTreasureInfo_4902.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTreasureMsg.S2C_DragonTreasureInfo_4902.alwaysUseFieldBuilders) {
               this.getAwardPoolFieldBuilder();
               this.getMyRecordFieldBuilder();
               this.getAllRecordFieldBuilder();
               this.getRanksFieldBuilder();
               this.getAwardListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.awardPoolBuilder_ == null) {
               this.awardPool_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.awardPoolBuilder_.clear();
            }

            this.luckyPoint_ = 0;
            this.bitField0_ &= -3;
            this.addMoney_ = 0;
            this.bitField0_ &= -5;
            this.goldNum_ = 0;
            this.bitField0_ &= -9;
            this.propNum_ = 0;
            this.bitField0_ &= -17;
            this.refreshNum_ = 0;
            this.bitField0_ &= -33;
            if (this.myRecordBuilder_ == null) {
               this.myRecord_ = Collections.emptyList();
               this.bitField0_ &= -65;
            } else {
               this.myRecordBuilder_.clear();
            }

            if (this.allRecordBuilder_ == null) {
               this.allRecord_ = Collections.emptyList();
               this.bitField0_ &= -129;
            } else {
               this.allRecordBuilder_.clear();
            }

            if (this.ranksBuilder_ == null) {
               this.ranks_ = Collections.emptyList();
               this.bitField0_ &= -257;
            } else {
               this.ranksBuilder_.clear();
            }

            if (this.awardListBuilder_ == null) {
               this.awardList_ = Collections.emptyList();
               this.bitField0_ &= -513;
            } else {
               this.awardListBuilder_.clear();
            }

            this.receiveBox_ = DragonTreasureMsg.S2C_DragonTreasureInfo_4902.emptyIntList();
            this.bitField0_ &= -1025;
            this.myRank_ = 0;
            this.bitField0_ &= -2049;
            this.activityId_ = 0;
            this.bitField0_ &= -4097;
            this.endTime_ = 0;
            this.bitField0_ &= -8193;
            this.aheadTime_ = 0;
            this.bitField0_ &= -16385;
            this.activityType_ = 0;
            this.bitField0_ &= -32769;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_DragonTreasureInfo_4902_descriptor;
         }

         public S2C_DragonTreasureInfo_4902 getDefaultInstanceForType() {
            return DragonTreasureMsg.S2C_DragonTreasureInfo_4902.getDefaultInstance();
         }

         public S2C_DragonTreasureInfo_4902 build() {
            S2C_DragonTreasureInfo_4902 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DragonTreasureInfo_4902 buildPartial() {
            S2C_DragonTreasureInfo_4902 result = new S2C_DragonTreasureInfo_4902(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.awardPoolBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.awardPool_ = Collections.unmodifiableList(this.awardPool_);
                  this.bitField0_ &= -2;
               }

               result.awardPool_ = this.awardPool_;
            } else {
               result.awardPool_ = this.awardPoolBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               result.luckyPoint_ = this.luckyPoint_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.addMoney_ = this.addMoney_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.goldNum_ = this.goldNum_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.propNum_ = this.propNum_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.refreshNum_ = this.refreshNum_;
               to_bitField0_ |= 16;
            }

            if (this.myRecordBuilder_ == null) {
               if ((this.bitField0_ & 64) != 0) {
                  this.myRecord_ = Collections.unmodifiableList(this.myRecord_);
                  this.bitField0_ &= -65;
               }

               result.myRecord_ = this.myRecord_;
            } else {
               result.myRecord_ = this.myRecordBuilder_.build();
            }

            if (this.allRecordBuilder_ == null) {
               if ((this.bitField0_ & 128) != 0) {
                  this.allRecord_ = Collections.unmodifiableList(this.allRecord_);
                  this.bitField0_ &= -129;
               }

               result.allRecord_ = this.allRecord_;
            } else {
               result.allRecord_ = this.allRecordBuilder_.build();
            }

            if (this.ranksBuilder_ == null) {
               if ((this.bitField0_ & 256) != 0) {
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
                  this.bitField0_ &= -257;
               }

               result.ranks_ = this.ranks_;
            } else {
               result.ranks_ = this.ranksBuilder_.build();
            }

            if (this.awardListBuilder_ == null) {
               if ((this.bitField0_ & 512) != 0) {
                  this.awardList_ = Collections.unmodifiableList(this.awardList_);
                  this.bitField0_ &= -513;
               }

               result.awardList_ = this.awardList_;
            } else {
               result.awardList_ = this.awardListBuilder_.build();
            }

            if ((this.bitField0_ & 1024) != 0) {
               this.receiveBox_.makeImmutable();
               this.bitField0_ &= -1025;
            }

            result.receiveBox_ = this.receiveBox_;
            if ((from_bitField0_ & 2048) != 0) {
               result.myRank_ = this.myRank_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 4096) != 0) {
               result.activityId_ = this.activityId_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 8192) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 16384) != 0) {
               result.aheadTime_ = this.aheadTime_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & '耀') != 0) {
               result.activityType_ = this.activityType_;
               to_bitField0_ |= 512;
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
            if (other instanceof S2C_DragonTreasureInfo_4902) {
               return this.mergeFrom((S2C_DragonTreasureInfo_4902)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DragonTreasureInfo_4902 other) {
            if (other == DragonTreasureMsg.S2C_DragonTreasureInfo_4902.getDefaultInstance()) {
               return this;
            } else {
               if (this.awardPoolBuilder_ == null) {
                  if (!other.awardPool_.isEmpty()) {
                     if (this.awardPool_.isEmpty()) {
                        this.awardPool_ = other.awardPool_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureAwardPoolIsMutable();
                        this.awardPool_.addAll(other.awardPool_);
                     }

                     this.onChanged();
                  }
               } else if (!other.awardPool_.isEmpty()) {
                  if (this.awardPoolBuilder_.isEmpty()) {
                     this.awardPoolBuilder_.dispose();
                     this.awardPoolBuilder_ = null;
                     this.awardPool_ = other.awardPool_;
                     this.bitField0_ &= -2;
                     this.awardPoolBuilder_ = DragonTreasureMsg.S2C_DragonTreasureInfo_4902.alwaysUseFieldBuilders ? this.getAwardPoolFieldBuilder() : null;
                  } else {
                     this.awardPoolBuilder_.addAllMessages(other.awardPool_);
                  }
               }

               if (other.hasLuckyPoint()) {
                  this.setLuckyPoint(other.getLuckyPoint());
               }

               if (other.hasAddMoney()) {
                  this.setAddMoney(other.getAddMoney());
               }

               if (other.hasGoldNum()) {
                  this.setGoldNum(other.getGoldNum());
               }

               if (other.hasPropNum()) {
                  this.setPropNum(other.getPropNum());
               }

               if (other.hasRefreshNum()) {
                  this.setRefreshNum(other.getRefreshNum());
               }

               if (this.myRecordBuilder_ == null) {
                  if (!other.myRecord_.isEmpty()) {
                     if (this.myRecord_.isEmpty()) {
                        this.myRecord_ = other.myRecord_;
                        this.bitField0_ &= -65;
                     } else {
                        this.ensureMyRecordIsMutable();
                        this.myRecord_.addAll(other.myRecord_);
                     }

                     this.onChanged();
                  }
               } else if (!other.myRecord_.isEmpty()) {
                  if (this.myRecordBuilder_.isEmpty()) {
                     this.myRecordBuilder_.dispose();
                     this.myRecordBuilder_ = null;
                     this.myRecord_ = other.myRecord_;
                     this.bitField0_ &= -65;
                     this.myRecordBuilder_ = DragonTreasureMsg.S2C_DragonTreasureInfo_4902.alwaysUseFieldBuilders ? this.getMyRecordFieldBuilder() : null;
                  } else {
                     this.myRecordBuilder_.addAllMessages(other.myRecord_);
                  }
               }

               if (this.allRecordBuilder_ == null) {
                  if (!other.allRecord_.isEmpty()) {
                     if (this.allRecord_.isEmpty()) {
                        this.allRecord_ = other.allRecord_;
                        this.bitField0_ &= -129;
                     } else {
                        this.ensureAllRecordIsMutable();
                        this.allRecord_.addAll(other.allRecord_);
                     }

                     this.onChanged();
                  }
               } else if (!other.allRecord_.isEmpty()) {
                  if (this.allRecordBuilder_.isEmpty()) {
                     this.allRecordBuilder_.dispose();
                     this.allRecordBuilder_ = null;
                     this.allRecord_ = other.allRecord_;
                     this.bitField0_ &= -129;
                     this.allRecordBuilder_ = DragonTreasureMsg.S2C_DragonTreasureInfo_4902.alwaysUseFieldBuilders ? this.getAllRecordFieldBuilder() : null;
                  } else {
                     this.allRecordBuilder_.addAllMessages(other.allRecord_);
                  }
               }

               if (this.ranksBuilder_ == null) {
                  if (!other.ranks_.isEmpty()) {
                     if (this.ranks_.isEmpty()) {
                        this.ranks_ = other.ranks_;
                        this.bitField0_ &= -257;
                     } else {
                        this.ensureRanksIsMutable();
                        this.ranks_.addAll(other.ranks_);
                     }

                     this.onChanged();
                  }
               } else if (!other.ranks_.isEmpty()) {
                  if (this.ranksBuilder_.isEmpty()) {
                     this.ranksBuilder_.dispose();
                     this.ranksBuilder_ = null;
                     this.ranks_ = other.ranks_;
                     this.bitField0_ &= -257;
                     this.ranksBuilder_ = DragonTreasureMsg.S2C_DragonTreasureInfo_4902.alwaysUseFieldBuilders ? this.getRanksFieldBuilder() : null;
                  } else {
                     this.ranksBuilder_.addAllMessages(other.ranks_);
                  }
               }

               if (this.awardListBuilder_ == null) {
                  if (!other.awardList_.isEmpty()) {
                     if (this.awardList_.isEmpty()) {
                        this.awardList_ = other.awardList_;
                        this.bitField0_ &= -513;
                     } else {
                        this.ensureAwardListIsMutable();
                        this.awardList_.addAll(other.awardList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.awardList_.isEmpty()) {
                  if (this.awardListBuilder_.isEmpty()) {
                     this.awardListBuilder_.dispose();
                     this.awardListBuilder_ = null;
                     this.awardList_ = other.awardList_;
                     this.bitField0_ &= -513;
                     this.awardListBuilder_ = DragonTreasureMsg.S2C_DragonTreasureInfo_4902.alwaysUseFieldBuilders ? this.getAwardListFieldBuilder() : null;
                  } else {
                     this.awardListBuilder_.addAllMessages(other.awardList_);
                  }
               }

               if (!other.receiveBox_.isEmpty()) {
                  if (this.receiveBox_.isEmpty()) {
                     this.receiveBox_ = other.receiveBox_;
                     this.bitField0_ &= -1025;
                  } else {
                     this.ensureReceiveBoxIsMutable();
                     this.receiveBox_.addAll(other.receiveBox_);
                  }

                  this.onChanged();
               }

               if (other.hasMyRank()) {
                  this.setMyRank(other.getMyRank());
               }

               if (other.hasActivityId()) {
                  this.setActivityId(other.getActivityId());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasAheadTime()) {
                  this.setAheadTime(other.getAheadTime());
               }

               if (other.hasActivityType()) {
                  this.setActivityType(other.getActivityType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLuckyPoint()) {
               return false;
            } else if (!this.hasAddMoney()) {
               return false;
            } else if (!this.hasGoldNum()) {
               return false;
            } else if (!this.hasPropNum()) {
               return false;
            } else if (!this.hasRefreshNum()) {
               return false;
            } else {
               for(int i = 0; i < this.getAwardPoolCount(); ++i) {
                  if (!this.getAwardPool(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getMyRecordCount(); ++i) {
                  if (!this.getMyRecord(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getAllRecordCount(); ++i) {
                  if (!this.getAllRecord(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getRanksCount(); ++i) {
                  if (!this.getRanks(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getAwardListCount(); ++i) {
                  if (!this.getAwardList(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DragonTreasureInfo_4902 parsedMessage = null;

            try {
               parsedMessage = (S2C_DragonTreasureInfo_4902)DragonTreasureMsg.S2C_DragonTreasureInfo_4902.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DragonTreasureInfo_4902)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureAwardPoolIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.awardPool_ = new ArrayList(this.awardPool_);
               this.bitField0_ |= 1;
            }

         }

         public List<AwardPool> getAwardPoolList() {
            return this.awardPoolBuilder_ == null ? Collections.unmodifiableList(this.awardPool_) : this.awardPoolBuilder_.getMessageList();
         }

         public int getAwardPoolCount() {
            return this.awardPoolBuilder_ == null ? this.awardPool_.size() : this.awardPoolBuilder_.getCount();
         }

         public AwardPool getAwardPool(int index) {
            return this.awardPoolBuilder_ == null ? (AwardPool)this.awardPool_.get(index) : (AwardPool)this.awardPoolBuilder_.getMessage(index);
         }

         public Builder setAwardPool(int index, AwardPool value) {
            if (this.awardPoolBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardPoolIsMutable();
               this.awardPool_.set(index, value);
               this.onChanged();
            } else {
               this.awardPoolBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAwardPool(int index, AwardPool.Builder builderForValue) {
            if (this.awardPoolBuilder_ == null) {
               this.ensureAwardPoolIsMutable();
               this.awardPool_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.awardPoolBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAwardPool(AwardPool value) {
            if (this.awardPoolBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardPoolIsMutable();
               this.awardPool_.add(value);
               this.onChanged();
            } else {
               this.awardPoolBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAwardPool(int index, AwardPool value) {
            if (this.awardPoolBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardPoolIsMutable();
               this.awardPool_.add(index, value);
               this.onChanged();
            } else {
               this.awardPoolBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAwardPool(AwardPool.Builder builderForValue) {
            if (this.awardPoolBuilder_ == null) {
               this.ensureAwardPoolIsMutable();
               this.awardPool_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.awardPoolBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAwardPool(int index, AwardPool.Builder builderForValue) {
            if (this.awardPoolBuilder_ == null) {
               this.ensureAwardPoolIsMutable();
               this.awardPool_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.awardPoolBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAwardPool(Iterable<? extends AwardPool> values) {
            if (this.awardPoolBuilder_ == null) {
               this.ensureAwardPoolIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.awardPool_);
               this.onChanged();
            } else {
               this.awardPoolBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAwardPool() {
            if (this.awardPoolBuilder_ == null) {
               this.awardPool_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.awardPoolBuilder_.clear();
            }

            return this;
         }

         public Builder removeAwardPool(int index) {
            if (this.awardPoolBuilder_ == null) {
               this.ensureAwardPoolIsMutable();
               this.awardPool_.remove(index);
               this.onChanged();
            } else {
               this.awardPoolBuilder_.remove(index);
            }

            return this;
         }

         public AwardPool.Builder getAwardPoolBuilder(int index) {
            return (AwardPool.Builder)this.getAwardPoolFieldBuilder().getBuilder(index);
         }

         public AwardPoolOrBuilder getAwardPoolOrBuilder(int index) {
            return this.awardPoolBuilder_ == null ? (AwardPoolOrBuilder)this.awardPool_.get(index) : (AwardPoolOrBuilder)this.awardPoolBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends AwardPoolOrBuilder> getAwardPoolOrBuilderList() {
            return this.awardPoolBuilder_ != null ? this.awardPoolBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.awardPool_);
         }

         public AwardPool.Builder addAwardPoolBuilder() {
            return (AwardPool.Builder)this.getAwardPoolFieldBuilder().addBuilder(DragonTreasureMsg.AwardPool.getDefaultInstance());
         }

         public AwardPool.Builder addAwardPoolBuilder(int index) {
            return (AwardPool.Builder)this.getAwardPoolFieldBuilder().addBuilder(index, DragonTreasureMsg.AwardPool.getDefaultInstance());
         }

         public List<AwardPool.Builder> getAwardPoolBuilderList() {
            return this.getAwardPoolFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<AwardPool, AwardPool.Builder, AwardPoolOrBuilder> getAwardPoolFieldBuilder() {
            if (this.awardPoolBuilder_ == null) {
               this.awardPoolBuilder_ = new RepeatedFieldBuilderV3(this.awardPool_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.awardPool_ = null;
            }

            return this.awardPoolBuilder_;
         }

         public boolean hasLuckyPoint() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLuckyPoint() {
            return this.luckyPoint_;
         }

         public Builder setLuckyPoint(int value) {
            this.bitField0_ |= 2;
            this.luckyPoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLuckyPoint() {
            this.bitField0_ &= -3;
            this.luckyPoint_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAddMoney() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getAddMoney() {
            return this.addMoney_;
         }

         public Builder setAddMoney(int value) {
            this.bitField0_ |= 4;
            this.addMoney_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAddMoney() {
            this.bitField0_ &= -5;
            this.addMoney_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGoldNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getGoldNum() {
            return this.goldNum_;
         }

         public Builder setGoldNum(int value) {
            this.bitField0_ |= 8;
            this.goldNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGoldNum() {
            this.bitField0_ &= -9;
            this.goldNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPropNum() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getPropNum() {
            return this.propNum_;
         }

         public Builder setPropNum(int value) {
            this.bitField0_ |= 16;
            this.propNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPropNum() {
            this.bitField0_ &= -17;
            this.propNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRefreshNum() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getRefreshNum() {
            return this.refreshNum_;
         }

         public Builder setRefreshNum(int value) {
            this.bitField0_ |= 32;
            this.refreshNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRefreshNum() {
            this.bitField0_ &= -33;
            this.refreshNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureMyRecordIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
               this.myRecord_ = new ArrayList(this.myRecord_);
               this.bitField0_ |= 64;
            }

         }

         public List<RecruitRecord> getMyRecordList() {
            return this.myRecordBuilder_ == null ? Collections.unmodifiableList(this.myRecord_) : this.myRecordBuilder_.getMessageList();
         }

         public int getMyRecordCount() {
            return this.myRecordBuilder_ == null ? this.myRecord_.size() : this.myRecordBuilder_.getCount();
         }

         public RecruitRecord getMyRecord(int index) {
            return this.myRecordBuilder_ == null ? (RecruitRecord)this.myRecord_.get(index) : (RecruitRecord)this.myRecordBuilder_.getMessage(index);
         }

         public Builder setMyRecord(int index, RecruitRecord value) {
            if (this.myRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyRecordIsMutable();
               this.myRecord_.set(index, value);
               this.onChanged();
            } else {
               this.myRecordBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setMyRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMyRecord(RecruitRecord value) {
            if (this.myRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyRecordIsMutable();
               this.myRecord_.add(value);
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addMyRecord(int index, RecruitRecord value) {
            if (this.myRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyRecordIsMutable();
               this.myRecord_.add(index, value);
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addMyRecord(RecruitRecord.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMyRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myRecordBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMyRecord(Iterable<? extends RecruitRecord> values) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.myRecord_);
               this.onChanged();
            } else {
               this.myRecordBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearMyRecord() {
            if (this.myRecordBuilder_ == null) {
               this.myRecord_ = Collections.emptyList();
               this.bitField0_ &= -65;
               this.onChanged();
            } else {
               this.myRecordBuilder_.clear();
            }

            return this;
         }

         public Builder removeMyRecord(int index) {
            if (this.myRecordBuilder_ == null) {
               this.ensureMyRecordIsMutable();
               this.myRecord_.remove(index);
               this.onChanged();
            } else {
               this.myRecordBuilder_.remove(index);
            }

            return this;
         }

         public RecruitRecord.Builder getMyRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getMyRecordFieldBuilder().getBuilder(index);
         }

         public RecruitRecordOrBuilder getMyRecordOrBuilder(int index) {
            return this.myRecordBuilder_ == null ? (RecruitRecordOrBuilder)this.myRecord_.get(index) : (RecruitRecordOrBuilder)this.myRecordBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RecruitRecordOrBuilder> getMyRecordOrBuilderList() {
            return this.myRecordBuilder_ != null ? this.myRecordBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.myRecord_);
         }

         public RecruitRecord.Builder addMyRecordBuilder() {
            return (RecruitRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(DragonTreasureMsg.RecruitRecord.getDefaultInstance());
         }

         public RecruitRecord.Builder addMyRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getMyRecordFieldBuilder().addBuilder(index, DragonTreasureMsg.RecruitRecord.getDefaultInstance());
         }

         public List<RecruitRecord.Builder> getMyRecordBuilderList() {
            return this.getMyRecordFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> getMyRecordFieldBuilder() {
            if (this.myRecordBuilder_ == null) {
               this.myRecordBuilder_ = new RepeatedFieldBuilderV3(this.myRecord_, (this.bitField0_ & 64) != 0, this.getParentForChildren(), this.isClean());
               this.myRecord_ = null;
            }

            return this.myRecordBuilder_;
         }

         private void ensureAllRecordIsMutable() {
            if ((this.bitField0_ & 128) == 0) {
               this.allRecord_ = new ArrayList(this.allRecord_);
               this.bitField0_ |= 128;
            }

         }

         public List<RecruitRecord> getAllRecordList() {
            return this.allRecordBuilder_ == null ? Collections.unmodifiableList(this.allRecord_) : this.allRecordBuilder_.getMessageList();
         }

         public int getAllRecordCount() {
            return this.allRecordBuilder_ == null ? this.allRecord_.size() : this.allRecordBuilder_.getCount();
         }

         public RecruitRecord getAllRecord(int index) {
            return this.allRecordBuilder_ == null ? (RecruitRecord)this.allRecord_.get(index) : (RecruitRecord)this.allRecordBuilder_.getMessage(index);
         }

         public Builder setAllRecord(int index, RecruitRecord value) {
            if (this.allRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAllRecordIsMutable();
               this.allRecord_.set(index, value);
               this.onChanged();
            } else {
               this.allRecordBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAllRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.allRecordBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecord(RecruitRecord value) {
            if (this.allRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAllRecordIsMutable();
               this.allRecord_.add(value);
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAllRecord(int index, RecruitRecord value) {
            if (this.allRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAllRecordIsMutable();
               this.allRecord_.add(index, value);
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAllRecord(RecruitRecord.Builder builderForValue) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecord(int index, RecruitRecord.Builder builderForValue) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.allRecordBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAllRecord(Iterable<? extends RecruitRecord> values) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.allRecord_);
               this.onChanged();
            } else {
               this.allRecordBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAllRecord() {
            if (this.allRecordBuilder_ == null) {
               this.allRecord_ = Collections.emptyList();
               this.bitField0_ &= -129;
               this.onChanged();
            } else {
               this.allRecordBuilder_.clear();
            }

            return this;
         }

         public Builder removeAllRecord(int index) {
            if (this.allRecordBuilder_ == null) {
               this.ensureAllRecordIsMutable();
               this.allRecord_.remove(index);
               this.onChanged();
            } else {
               this.allRecordBuilder_.remove(index);
            }

            return this;
         }

         public RecruitRecord.Builder getAllRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getAllRecordFieldBuilder().getBuilder(index);
         }

         public RecruitRecordOrBuilder getAllRecordOrBuilder(int index) {
            return this.allRecordBuilder_ == null ? (RecruitRecordOrBuilder)this.allRecord_.get(index) : (RecruitRecordOrBuilder)this.allRecordBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RecruitRecordOrBuilder> getAllRecordOrBuilderList() {
            return this.allRecordBuilder_ != null ? this.allRecordBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.allRecord_);
         }

         public RecruitRecord.Builder addAllRecordBuilder() {
            return (RecruitRecord.Builder)this.getAllRecordFieldBuilder().addBuilder(DragonTreasureMsg.RecruitRecord.getDefaultInstance());
         }

         public RecruitRecord.Builder addAllRecordBuilder(int index) {
            return (RecruitRecord.Builder)this.getAllRecordFieldBuilder().addBuilder(index, DragonTreasureMsg.RecruitRecord.getDefaultInstance());
         }

         public List<RecruitRecord.Builder> getAllRecordBuilderList() {
            return this.getAllRecordFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RecruitRecord, RecruitRecord.Builder, RecruitRecordOrBuilder> getAllRecordFieldBuilder() {
            if (this.allRecordBuilder_ == null) {
               this.allRecordBuilder_ = new RepeatedFieldBuilderV3(this.allRecord_, (this.bitField0_ & 128) != 0, this.getParentForChildren(), this.isClean());
               this.allRecord_ = null;
            }

            return this.allRecordBuilder_;
         }

         private void ensureRanksIsMutable() {
            if ((this.bitField0_ & 256) == 0) {
               this.ranks_ = new ArrayList(this.ranks_);
               this.bitField0_ |= 256;
            }

         }

         public List<RankData> getRanksList() {
            return this.ranksBuilder_ == null ? Collections.unmodifiableList(this.ranks_) : this.ranksBuilder_.getMessageList();
         }

         public int getRanksCount() {
            return this.ranksBuilder_ == null ? this.ranks_.size() : this.ranksBuilder_.getCount();
         }

         public RankData getRanks(int index) {
            return this.ranksBuilder_ == null ? (RankData)this.ranks_.get(index) : (RankData)this.ranksBuilder_.getMessage(index);
         }

         public Builder setRanks(int index, RankData value) {
            if (this.ranksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRanksIsMutable();
               this.ranks_.set(index, value);
               this.onChanged();
            } else {
               this.ranksBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRanks(int index, RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(RankData value) {
            if (this.ranksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRanksIsMutable();
               this.ranks_.add(value);
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRanks(int index, RankData value) {
            if (this.ranksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRanksIsMutable();
               this.ranks_.add(index, value);
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRanks(RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(int index, RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRanks(Iterable<? extends RankData> values) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.ranks_);
               this.onChanged();
            } else {
               this.ranksBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRanks() {
            if (this.ranksBuilder_ == null) {
               this.ranks_ = Collections.emptyList();
               this.bitField0_ &= -257;
               this.onChanged();
            } else {
               this.ranksBuilder_.clear();
            }

            return this;
         }

         public Builder removeRanks(int index) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.remove(index);
               this.onChanged();
            } else {
               this.ranksBuilder_.remove(index);
            }

            return this;
         }

         public RankData.Builder getRanksBuilder(int index) {
            return (RankData.Builder)this.getRanksFieldBuilder().getBuilder(index);
         }

         public RankDataOrBuilder getRanksOrBuilder(int index) {
            return this.ranksBuilder_ == null ? (RankDataOrBuilder)this.ranks_.get(index) : (RankDataOrBuilder)this.ranksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankDataOrBuilder> getRanksOrBuilderList() {
            return this.ranksBuilder_ != null ? this.ranksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.ranks_);
         }

         public RankData.Builder addRanksBuilder() {
            return (RankData.Builder)this.getRanksFieldBuilder().addBuilder(DragonTreasureMsg.RankData.getDefaultInstance());
         }

         public RankData.Builder addRanksBuilder(int index) {
            return (RankData.Builder)this.getRanksFieldBuilder().addBuilder(index, DragonTreasureMsg.RankData.getDefaultInstance());
         }

         public List<RankData.Builder> getRanksBuilderList() {
            return this.getRanksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> getRanksFieldBuilder() {
            if (this.ranksBuilder_ == null) {
               this.ranksBuilder_ = new RepeatedFieldBuilderV3(this.ranks_, (this.bitField0_ & 256) != 0, this.getParentForChildren(), this.isClean());
               this.ranks_ = null;
            }

            return this.ranksBuilder_;
         }

         private void ensureAwardListIsMutable() {
            if ((this.bitField0_ & 512) == 0) {
               this.awardList_ = new ArrayList(this.awardList_);
               this.bitField0_ |= 512;
            }

         }

         public List<CommonMsg.MapDataII> getAwardListList() {
            return this.awardListBuilder_ == null ? Collections.unmodifiableList(this.awardList_) : this.awardListBuilder_.getMessageList();
         }

         public int getAwardListCount() {
            return this.awardListBuilder_ == null ? this.awardList_.size() : this.awardListBuilder_.getCount();
         }

         public CommonMsg.MapDataII getAwardList(int index) {
            return this.awardListBuilder_ == null ? (CommonMsg.MapDataII)this.awardList_.get(index) : (CommonMsg.MapDataII)this.awardListBuilder_.getMessage(index);
         }

         public Builder setAwardList(int index, CommonMsg.MapDataII value) {
            if (this.awardListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardListIsMutable();
               this.awardList_.set(index, value);
               this.onChanged();
            } else {
               this.awardListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAwardList(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               this.awardList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.awardListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAwardList(CommonMsg.MapDataII value) {
            if (this.awardListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardListIsMutable();
               this.awardList_.add(value);
               this.onChanged();
            } else {
               this.awardListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAwardList(int index, CommonMsg.MapDataII value) {
            if (this.awardListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardListIsMutable();
               this.awardList_.add(index, value);
               this.onChanged();
            } else {
               this.awardListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAwardList(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               this.awardList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.awardListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAwardList(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               this.awardList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.awardListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAwardList(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.awardList_);
               this.onChanged();
            } else {
               this.awardListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAwardList() {
            if (this.awardListBuilder_ == null) {
               this.awardList_ = Collections.emptyList();
               this.bitField0_ &= -513;
               this.onChanged();
            } else {
               this.awardListBuilder_.clear();
            }

            return this;
         }

         public Builder removeAwardList(int index) {
            if (this.awardListBuilder_ == null) {
               this.ensureAwardListIsMutable();
               this.awardList_.remove(index);
               this.onChanged();
            } else {
               this.awardListBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getAwardListBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getAwardListFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getAwardListOrBuilder(int index) {
            return this.awardListBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.awardList_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.awardListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getAwardListOrBuilderList() {
            return this.awardListBuilder_ != null ? this.awardListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.awardList_);
         }

         public CommonMsg.MapDataII.Builder addAwardListBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getAwardListFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addAwardListBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getAwardListFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getAwardListBuilderList() {
            return this.getAwardListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getAwardListFieldBuilder() {
            if (this.awardListBuilder_ == null) {
               this.awardListBuilder_ = new RepeatedFieldBuilderV3(this.awardList_, (this.bitField0_ & 512) != 0, this.getParentForChildren(), this.isClean());
               this.awardList_ = null;
            }

            return this.awardListBuilder_;
         }

         private void ensureReceiveBoxIsMutable() {
            if ((this.bitField0_ & 1024) == 0) {
               this.receiveBox_ = DragonTreasureMsg.S2C_DragonTreasureInfo_4902.mutableCopy(this.receiveBox_);
               this.bitField0_ |= 1024;
            }

         }

         public List<Integer> getReceiveBoxList() {
            return (List<Integer>)((this.bitField0_ & 1024) != 0 ? Collections.unmodifiableList(this.receiveBox_) : this.receiveBox_);
         }

         public int getReceiveBoxCount() {
            return this.receiveBox_.size();
         }

         public int getReceiveBox(int index) {
            return this.receiveBox_.getInt(index);
         }

         public Builder setReceiveBox(int index, int value) {
            this.ensureReceiveBoxIsMutable();
            this.receiveBox_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addReceiveBox(int value) {
            this.ensureReceiveBoxIsMutable();
            this.receiveBox_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllReceiveBox(Iterable<? extends Integer> values) {
            this.ensureReceiveBoxIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.receiveBox_);
            this.onChanged();
            return this;
         }

         public Builder clearReceiveBox() {
            this.receiveBox_ = DragonTreasureMsg.S2C_DragonTreasureInfo_4902.emptyIntList();
            this.bitField0_ &= -1025;
            this.onChanged();
            return this;
         }

         public boolean hasMyRank() {
            return (this.bitField0_ & 2048) != 0;
         }

         public int getMyRank() {
            return this.myRank_;
         }

         public Builder setMyRank(int value) {
            this.bitField0_ |= 2048;
            this.myRank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMyRank() {
            this.bitField0_ &= -2049;
            this.myRank_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasActivityId() {
            return (this.bitField0_ & 4096) != 0;
         }

         public int getActivityId() {
            return this.activityId_;
         }

         public Builder setActivityId(int value) {
            this.bitField0_ |= 4096;
            this.activityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityId() {
            this.bitField0_ &= -4097;
            this.activityId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 8192) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 8192;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -8193;
            this.endTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAheadTime() {
            return (this.bitField0_ & 16384) != 0;
         }

         public int getAheadTime() {
            return this.aheadTime_;
         }

         public Builder setAheadTime(int value) {
            this.bitField0_ |= 16384;
            this.aheadTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAheadTime() {
            this.bitField0_ &= -16385;
            this.aheadTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasActivityType() {
            return (this.bitField0_ & '耀') != 0;
         }

         public int getActivityType() {
            return this.activityType_;
         }

         public Builder setActivityType(int value) {
            this.bitField0_ |= 32768;
            this.activityType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityType() {
            this.bitField0_ &= -32769;
            this.activityType_ = 0;
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

   public static final class C2S_RecruitAward_4903 extends GeneratedMessageV3 implements C2S_RecruitAward_4903OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECRUITTYPE_FIELD_NUMBER = 1;
      private int recruitType_;
      private byte memoizedIsInitialized;
      private static final C2S_RecruitAward_4903 DEFAULT_INSTANCE = new C2S_RecruitAward_4903();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecruitAward_4903> PARSER = new AbstractParser<C2S_RecruitAward_4903>() {
         public C2S_RecruitAward_4903 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecruitAward_4903(input, extensionRegistry);
         }
      };

      private C2S_RecruitAward_4903(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecruitAward_4903() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecruitAward_4903();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecruitAward_4903(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.recruitType_ = input.readInt32();
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
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_RecruitAward_4903_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_RecruitAward_4903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecruitAward_4903.class, Builder.class);
      }

      public boolean hasRecruitType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRecruitType() {
         return this.recruitType_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRecruitType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.recruitType_);
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
               size += CodedOutputStream.computeInt32Size(1, this.recruitType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RecruitAward_4903)) {
            return super.equals(obj);
         } else {
            C2S_RecruitAward_4903 other = (C2S_RecruitAward_4903)obj;
            if (this.hasRecruitType() != other.hasRecruitType()) {
               return false;
            } else if (this.hasRecruitType() && this.getRecruitType() != other.getRecruitType()) {
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
            if (this.hasRecruitType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecruitType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RecruitAward_4903 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecruitAward_4903)PARSER.parseFrom(data);
      }

      public static C2S_RecruitAward_4903 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitAward_4903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitAward_4903 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecruitAward_4903)PARSER.parseFrom(data);
      }

      public static C2S_RecruitAward_4903 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitAward_4903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitAward_4903 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecruitAward_4903)PARSER.parseFrom(data);
      }

      public static C2S_RecruitAward_4903 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecruitAward_4903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecruitAward_4903 parseFrom(InputStream input) throws IOException {
         return (C2S_RecruitAward_4903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecruitAward_4903 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitAward_4903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecruitAward_4903 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecruitAward_4903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecruitAward_4903 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitAward_4903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecruitAward_4903 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecruitAward_4903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecruitAward_4903 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecruitAward_4903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecruitAward_4903 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecruitAward_4903 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecruitAward_4903> parser() {
         return PARSER;
      }

      public Parser<C2S_RecruitAward_4903> getParserForType() {
         return PARSER;
      }

      public C2S_RecruitAward_4903 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecruitAward_4903OrBuilder {
         private int bitField0_;
         private int recruitType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_RecruitAward_4903_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_RecruitAward_4903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecruitAward_4903.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTreasureMsg.C2S_RecruitAward_4903.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.recruitType_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_RecruitAward_4903_descriptor;
         }

         public C2S_RecruitAward_4903 getDefaultInstanceForType() {
            return DragonTreasureMsg.C2S_RecruitAward_4903.getDefaultInstance();
         }

         public C2S_RecruitAward_4903 build() {
            C2S_RecruitAward_4903 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecruitAward_4903 buildPartial() {
            C2S_RecruitAward_4903 result = new C2S_RecruitAward_4903(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.recruitType_ = this.recruitType_;
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
            if (other instanceof C2S_RecruitAward_4903) {
               return this.mergeFrom((C2S_RecruitAward_4903)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecruitAward_4903 other) {
            if (other == DragonTreasureMsg.C2S_RecruitAward_4903.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRecruitType()) {
                  this.setRecruitType(other.getRecruitType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRecruitType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RecruitAward_4903 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecruitAward_4903)DragonTreasureMsg.C2S_RecruitAward_4903.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecruitAward_4903)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRecruitType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRecruitType() {
            return this.recruitType_;
         }

         public Builder setRecruitType(int value) {
            this.bitField0_ |= 1;
            this.recruitType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecruitType() {
            this.bitField0_ &= -2;
            this.recruitType_ = 0;
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

   public static final class S2C_RecruitAward_4904 extends GeneratedMessageV3 implements S2C_RecruitAward_4904OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECRUITTYPE_FIELD_NUMBER = 1;
      private int recruitType_;
      private byte memoizedIsInitialized;
      private static final S2C_RecruitAward_4904 DEFAULT_INSTANCE = new S2C_RecruitAward_4904();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecruitAward_4904> PARSER = new AbstractParser<S2C_RecruitAward_4904>() {
         public S2C_RecruitAward_4904 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecruitAward_4904(input, extensionRegistry);
         }
      };

      private S2C_RecruitAward_4904(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecruitAward_4904() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecruitAward_4904();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecruitAward_4904(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.recruitType_ = input.readInt32();
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
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_RecruitAward_4904_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_RecruitAward_4904_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitAward_4904.class, Builder.class);
      }

      public boolean hasRecruitType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRecruitType() {
         return this.recruitType_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRecruitType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.recruitType_);
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
               size += CodedOutputStream.computeInt32Size(1, this.recruitType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RecruitAward_4904)) {
            return super.equals(obj);
         } else {
            S2C_RecruitAward_4904 other = (S2C_RecruitAward_4904)obj;
            if (this.hasRecruitType() != other.hasRecruitType()) {
               return false;
            } else if (this.hasRecruitType() && this.getRecruitType() != other.getRecruitType()) {
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
            if (this.hasRecruitType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecruitType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RecruitAward_4904 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecruitAward_4904)PARSER.parseFrom(data);
      }

      public static S2C_RecruitAward_4904 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitAward_4904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitAward_4904 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecruitAward_4904)PARSER.parseFrom(data);
      }

      public static S2C_RecruitAward_4904 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitAward_4904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitAward_4904 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecruitAward_4904)PARSER.parseFrom(data);
      }

      public static S2C_RecruitAward_4904 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecruitAward_4904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecruitAward_4904 parseFrom(InputStream input) throws IOException {
         return (S2C_RecruitAward_4904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitAward_4904 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitAward_4904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitAward_4904 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecruitAward_4904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecruitAward_4904 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitAward_4904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecruitAward_4904 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecruitAward_4904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecruitAward_4904 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecruitAward_4904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecruitAward_4904 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecruitAward_4904 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecruitAward_4904> parser() {
         return PARSER;
      }

      public Parser<S2C_RecruitAward_4904> getParserForType() {
         return PARSER;
      }

      public S2C_RecruitAward_4904 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecruitAward_4904OrBuilder {
         private int bitField0_;
         private int recruitType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_RecruitAward_4904_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_RecruitAward_4904_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecruitAward_4904.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTreasureMsg.S2C_RecruitAward_4904.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.recruitType_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_RecruitAward_4904_descriptor;
         }

         public S2C_RecruitAward_4904 getDefaultInstanceForType() {
            return DragonTreasureMsg.S2C_RecruitAward_4904.getDefaultInstance();
         }

         public S2C_RecruitAward_4904 build() {
            S2C_RecruitAward_4904 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecruitAward_4904 buildPartial() {
            S2C_RecruitAward_4904 result = new S2C_RecruitAward_4904(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.recruitType_ = this.recruitType_;
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
            if (other instanceof S2C_RecruitAward_4904) {
               return this.mergeFrom((S2C_RecruitAward_4904)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecruitAward_4904 other) {
            if (other == DragonTreasureMsg.S2C_RecruitAward_4904.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRecruitType()) {
                  this.setRecruitType(other.getRecruitType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRecruitType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RecruitAward_4904 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecruitAward_4904)DragonTreasureMsg.S2C_RecruitAward_4904.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecruitAward_4904)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRecruitType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRecruitType() {
            return this.recruitType_;
         }

         public Builder setRecruitType(int value) {
            this.bitField0_ |= 1;
            this.recruitType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecruitType() {
            this.bitField0_ &= -2;
            this.recruitType_ = 0;
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

   public static final class C2S_RefreshPool_4905 extends GeneratedMessageV3 implements C2S_RefreshPool_4905OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_RefreshPool_4905 DEFAULT_INSTANCE = new C2S_RefreshPool_4905();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RefreshPool_4905> PARSER = new AbstractParser<C2S_RefreshPool_4905>() {
         public C2S_RefreshPool_4905 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RefreshPool_4905(input, extensionRegistry);
         }
      };

      private C2S_RefreshPool_4905(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RefreshPool_4905() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RefreshPool_4905();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RefreshPool_4905(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_RefreshPool_4905_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_RefreshPool_4905_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RefreshPool_4905.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RefreshPool_4905)) {
            return super.equals(obj);
         } else {
            C2S_RefreshPool_4905 other = (C2S_RefreshPool_4905)obj;
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

      public static C2S_RefreshPool_4905 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RefreshPool_4905)PARSER.parseFrom(data);
      }

      public static C2S_RefreshPool_4905 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefreshPool_4905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefreshPool_4905 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RefreshPool_4905)PARSER.parseFrom(data);
      }

      public static C2S_RefreshPool_4905 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefreshPool_4905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefreshPool_4905 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RefreshPool_4905)PARSER.parseFrom(data);
      }

      public static C2S_RefreshPool_4905 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefreshPool_4905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefreshPool_4905 parseFrom(InputStream input) throws IOException {
         return (C2S_RefreshPool_4905)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RefreshPool_4905 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefreshPool_4905)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RefreshPool_4905 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RefreshPool_4905)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RefreshPool_4905 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefreshPool_4905)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RefreshPool_4905 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RefreshPool_4905)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RefreshPool_4905 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefreshPool_4905)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RefreshPool_4905 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RefreshPool_4905 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RefreshPool_4905> parser() {
         return PARSER;
      }

      public Parser<C2S_RefreshPool_4905> getParserForType() {
         return PARSER;
      }

      public C2S_RefreshPool_4905 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RefreshPool_4905OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_RefreshPool_4905_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_RefreshPool_4905_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RefreshPool_4905.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTreasureMsg.C2S_RefreshPool_4905.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_RefreshPool_4905_descriptor;
         }

         public C2S_RefreshPool_4905 getDefaultInstanceForType() {
            return DragonTreasureMsg.C2S_RefreshPool_4905.getDefaultInstance();
         }

         public C2S_RefreshPool_4905 build() {
            C2S_RefreshPool_4905 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RefreshPool_4905 buildPartial() {
            C2S_RefreshPool_4905 result = new C2S_RefreshPool_4905(this);
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
            if (other instanceof C2S_RefreshPool_4905) {
               return this.mergeFrom((C2S_RefreshPool_4905)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RefreshPool_4905 other) {
            if (other == DragonTreasureMsg.C2S_RefreshPool_4905.getDefaultInstance()) {
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
            C2S_RefreshPool_4905 parsedMessage = null;

            try {
               parsedMessage = (C2S_RefreshPool_4905)DragonTreasureMsg.C2S_RefreshPool_4905.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RefreshPool_4905)e.getUnfinishedMessage();
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

   public static final class S2C_RefreshPool_4906 extends GeneratedMessageV3 implements S2C_RefreshPool_4906OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REFRESHNUM_FIELD_NUMBER = 1;
      private int refreshNum_;
      public static final int AWARDPOOL_FIELD_NUMBER = 2;
      private List<AwardPool> awardPool_;
      private byte memoizedIsInitialized;
      private static final S2C_RefreshPool_4906 DEFAULT_INSTANCE = new S2C_RefreshPool_4906();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RefreshPool_4906> PARSER = new AbstractParser<S2C_RefreshPool_4906>() {
         public S2C_RefreshPool_4906 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RefreshPool_4906(input, extensionRegistry);
         }
      };

      private S2C_RefreshPool_4906(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RefreshPool_4906() {
         this.memoizedIsInitialized = -1;
         this.awardPool_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RefreshPool_4906();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RefreshPool_4906(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.refreshNum_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.awardPool_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.awardPool_.add(input.readMessage(DragonTreasureMsg.AwardPool.PARSER, extensionRegistry));
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
                  this.awardPool_ = Collections.unmodifiableList(this.awardPool_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_RefreshPool_4906_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_RefreshPool_4906_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RefreshPool_4906.class, Builder.class);
      }

      public boolean hasRefreshNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRefreshNum() {
         return this.refreshNum_;
      }

      public List<AwardPool> getAwardPoolList() {
         return this.awardPool_;
      }

      public List<? extends AwardPoolOrBuilder> getAwardPoolOrBuilderList() {
         return this.awardPool_;
      }

      public int getAwardPoolCount() {
         return this.awardPool_.size();
      }

      public AwardPool getAwardPool(int index) {
         return (AwardPool)this.awardPool_.get(index);
      }

      public AwardPoolOrBuilder getAwardPoolOrBuilder(int index) {
         return (AwardPoolOrBuilder)this.awardPool_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRefreshNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getAwardPoolCount(); ++i) {
               if (!this.getAwardPool(i).isInitialized()) {
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
            output.writeInt32(1, this.refreshNum_);
         }

         for(int i = 0; i < this.awardPool_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.awardPool_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.refreshNum_);
            }

            for(int i = 0; i < this.awardPool_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.awardPool_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RefreshPool_4906)) {
            return super.equals(obj);
         } else {
            S2C_RefreshPool_4906 other = (S2C_RefreshPool_4906)obj;
            if (this.hasRefreshNum() != other.hasRefreshNum()) {
               return false;
            } else if (this.hasRefreshNum() && this.getRefreshNum() != other.getRefreshNum()) {
               return false;
            } else if (!this.getAwardPoolList().equals(other.getAwardPoolList())) {
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
            if (this.hasRefreshNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRefreshNum();
            }

            if (this.getAwardPoolCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAwardPoolList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RefreshPool_4906 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RefreshPool_4906)PARSER.parseFrom(data);
      }

      public static S2C_RefreshPool_4906 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefreshPool_4906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefreshPool_4906 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RefreshPool_4906)PARSER.parseFrom(data);
      }

      public static S2C_RefreshPool_4906 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefreshPool_4906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefreshPool_4906 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RefreshPool_4906)PARSER.parseFrom(data);
      }

      public static S2C_RefreshPool_4906 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefreshPool_4906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefreshPool_4906 parseFrom(InputStream input) throws IOException {
         return (S2C_RefreshPool_4906)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RefreshPool_4906 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefreshPool_4906)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RefreshPool_4906 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RefreshPool_4906)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RefreshPool_4906 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefreshPool_4906)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RefreshPool_4906 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RefreshPool_4906)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RefreshPool_4906 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefreshPool_4906)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RefreshPool_4906 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RefreshPool_4906 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RefreshPool_4906> parser() {
         return PARSER;
      }

      public Parser<S2C_RefreshPool_4906> getParserForType() {
         return PARSER;
      }

      public S2C_RefreshPool_4906 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RefreshPool_4906OrBuilder {
         private int bitField0_;
         private int refreshNum_;
         private List<AwardPool> awardPool_;
         private RepeatedFieldBuilderV3<AwardPool, AwardPool.Builder, AwardPoolOrBuilder> awardPoolBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_RefreshPool_4906_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_RefreshPool_4906_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RefreshPool_4906.class, Builder.class);
         }

         private Builder() {
            this.awardPool_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.awardPool_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTreasureMsg.S2C_RefreshPool_4906.alwaysUseFieldBuilders) {
               this.getAwardPoolFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.refreshNum_ = 0;
            this.bitField0_ &= -2;
            if (this.awardPoolBuilder_ == null) {
               this.awardPool_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.awardPoolBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_RefreshPool_4906_descriptor;
         }

         public S2C_RefreshPool_4906 getDefaultInstanceForType() {
            return DragonTreasureMsg.S2C_RefreshPool_4906.getDefaultInstance();
         }

         public S2C_RefreshPool_4906 build() {
            S2C_RefreshPool_4906 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RefreshPool_4906 buildPartial() {
            S2C_RefreshPool_4906 result = new S2C_RefreshPool_4906(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.refreshNum_ = this.refreshNum_;
               to_bitField0_ |= 1;
            }

            if (this.awardPoolBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.awardPool_ = Collections.unmodifiableList(this.awardPool_);
                  this.bitField0_ &= -3;
               }

               result.awardPool_ = this.awardPool_;
            } else {
               result.awardPool_ = this.awardPoolBuilder_.build();
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
            if (other instanceof S2C_RefreshPool_4906) {
               return this.mergeFrom((S2C_RefreshPool_4906)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RefreshPool_4906 other) {
            if (other == DragonTreasureMsg.S2C_RefreshPool_4906.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRefreshNum()) {
                  this.setRefreshNum(other.getRefreshNum());
               }

               if (this.awardPoolBuilder_ == null) {
                  if (!other.awardPool_.isEmpty()) {
                     if (this.awardPool_.isEmpty()) {
                        this.awardPool_ = other.awardPool_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureAwardPoolIsMutable();
                        this.awardPool_.addAll(other.awardPool_);
                     }

                     this.onChanged();
                  }
               } else if (!other.awardPool_.isEmpty()) {
                  if (this.awardPoolBuilder_.isEmpty()) {
                     this.awardPoolBuilder_.dispose();
                     this.awardPoolBuilder_ = null;
                     this.awardPool_ = other.awardPool_;
                     this.bitField0_ &= -3;
                     this.awardPoolBuilder_ = DragonTreasureMsg.S2C_RefreshPool_4906.alwaysUseFieldBuilders ? this.getAwardPoolFieldBuilder() : null;
                  } else {
                     this.awardPoolBuilder_.addAllMessages(other.awardPool_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRefreshNum()) {
               return false;
            } else {
               for(int i = 0; i < this.getAwardPoolCount(); ++i) {
                  if (!this.getAwardPool(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RefreshPool_4906 parsedMessage = null;

            try {
               parsedMessage = (S2C_RefreshPool_4906)DragonTreasureMsg.S2C_RefreshPool_4906.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RefreshPool_4906)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRefreshNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRefreshNum() {
            return this.refreshNum_;
         }

         public Builder setRefreshNum(int value) {
            this.bitField0_ |= 1;
            this.refreshNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRefreshNum() {
            this.bitField0_ &= -2;
            this.refreshNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureAwardPoolIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.awardPool_ = new ArrayList(this.awardPool_);
               this.bitField0_ |= 2;
            }

         }

         public List<AwardPool> getAwardPoolList() {
            return this.awardPoolBuilder_ == null ? Collections.unmodifiableList(this.awardPool_) : this.awardPoolBuilder_.getMessageList();
         }

         public int getAwardPoolCount() {
            return this.awardPoolBuilder_ == null ? this.awardPool_.size() : this.awardPoolBuilder_.getCount();
         }

         public AwardPool getAwardPool(int index) {
            return this.awardPoolBuilder_ == null ? (AwardPool)this.awardPool_.get(index) : (AwardPool)this.awardPoolBuilder_.getMessage(index);
         }

         public Builder setAwardPool(int index, AwardPool value) {
            if (this.awardPoolBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardPoolIsMutable();
               this.awardPool_.set(index, value);
               this.onChanged();
            } else {
               this.awardPoolBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAwardPool(int index, AwardPool.Builder builderForValue) {
            if (this.awardPoolBuilder_ == null) {
               this.ensureAwardPoolIsMutable();
               this.awardPool_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.awardPoolBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAwardPool(AwardPool value) {
            if (this.awardPoolBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardPoolIsMutable();
               this.awardPool_.add(value);
               this.onChanged();
            } else {
               this.awardPoolBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAwardPool(int index, AwardPool value) {
            if (this.awardPoolBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAwardPoolIsMutable();
               this.awardPool_.add(index, value);
               this.onChanged();
            } else {
               this.awardPoolBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAwardPool(AwardPool.Builder builderForValue) {
            if (this.awardPoolBuilder_ == null) {
               this.ensureAwardPoolIsMutable();
               this.awardPool_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.awardPoolBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAwardPool(int index, AwardPool.Builder builderForValue) {
            if (this.awardPoolBuilder_ == null) {
               this.ensureAwardPoolIsMutable();
               this.awardPool_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.awardPoolBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAwardPool(Iterable<? extends AwardPool> values) {
            if (this.awardPoolBuilder_ == null) {
               this.ensureAwardPoolIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.awardPool_);
               this.onChanged();
            } else {
               this.awardPoolBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAwardPool() {
            if (this.awardPoolBuilder_ == null) {
               this.awardPool_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.awardPoolBuilder_.clear();
            }

            return this;
         }

         public Builder removeAwardPool(int index) {
            if (this.awardPoolBuilder_ == null) {
               this.ensureAwardPoolIsMutable();
               this.awardPool_.remove(index);
               this.onChanged();
            } else {
               this.awardPoolBuilder_.remove(index);
            }

            return this;
         }

         public AwardPool.Builder getAwardPoolBuilder(int index) {
            return (AwardPool.Builder)this.getAwardPoolFieldBuilder().getBuilder(index);
         }

         public AwardPoolOrBuilder getAwardPoolOrBuilder(int index) {
            return this.awardPoolBuilder_ == null ? (AwardPoolOrBuilder)this.awardPool_.get(index) : (AwardPoolOrBuilder)this.awardPoolBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends AwardPoolOrBuilder> getAwardPoolOrBuilderList() {
            return this.awardPoolBuilder_ != null ? this.awardPoolBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.awardPool_);
         }

         public AwardPool.Builder addAwardPoolBuilder() {
            return (AwardPool.Builder)this.getAwardPoolFieldBuilder().addBuilder(DragonTreasureMsg.AwardPool.getDefaultInstance());
         }

         public AwardPool.Builder addAwardPoolBuilder(int index) {
            return (AwardPool.Builder)this.getAwardPoolFieldBuilder().addBuilder(index, DragonTreasureMsg.AwardPool.getDefaultInstance());
         }

         public List<AwardPool.Builder> getAwardPoolBuilderList() {
            return this.getAwardPoolFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<AwardPool, AwardPool.Builder, AwardPoolOrBuilder> getAwardPoolFieldBuilder() {
            if (this.awardPoolBuilder_ == null) {
               this.awardPoolBuilder_ = new RepeatedFieldBuilderV3(this.awardPool_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.awardPool_ = null;
            }

            return this.awardPoolBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_PointRank_4907 extends GeneratedMessageV3 implements C2S_PointRank_4907OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYID_FIELD_NUMBER = 1;
      private int activityId_;
      private byte memoizedIsInitialized;
      private static final C2S_PointRank_4907 DEFAULT_INSTANCE = new C2S_PointRank_4907();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PointRank_4907> PARSER = new AbstractParser<C2S_PointRank_4907>() {
         public C2S_PointRank_4907 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PointRank_4907(input, extensionRegistry);
         }
      };

      private C2S_PointRank_4907(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PointRank_4907() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PointRank_4907();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PointRank_4907(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.activityId_ = input.readInt32();
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
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_PointRank_4907_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_PointRank_4907_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PointRank_4907.class, Builder.class);
      }

      public boolean hasActivityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityId() {
         return this.activityId_;
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
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.activityId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.activityId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PointRank_4907)) {
            return super.equals(obj);
         } else {
            C2S_PointRank_4907 other = (C2S_PointRank_4907)obj;
            if (this.hasActivityId() != other.hasActivityId()) {
               return false;
            } else if (this.hasActivityId() && this.getActivityId() != other.getActivityId()) {
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
            if (this.hasActivityId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getActivityId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PointRank_4907 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PointRank_4907)PARSER.parseFrom(data);
      }

      public static C2S_PointRank_4907 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PointRank_4907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PointRank_4907 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PointRank_4907)PARSER.parseFrom(data);
      }

      public static C2S_PointRank_4907 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PointRank_4907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PointRank_4907 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PointRank_4907)PARSER.parseFrom(data);
      }

      public static C2S_PointRank_4907 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PointRank_4907)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PointRank_4907 parseFrom(InputStream input) throws IOException {
         return (C2S_PointRank_4907)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PointRank_4907 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PointRank_4907)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PointRank_4907 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PointRank_4907)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PointRank_4907 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PointRank_4907)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PointRank_4907 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PointRank_4907)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PointRank_4907 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PointRank_4907)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PointRank_4907 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PointRank_4907 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PointRank_4907> parser() {
         return PARSER;
      }

      public Parser<C2S_PointRank_4907> getParserForType() {
         return PARSER;
      }

      public C2S_PointRank_4907 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PointRank_4907OrBuilder {
         private int bitField0_;
         private int activityId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_PointRank_4907_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_PointRank_4907_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PointRank_4907.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTreasureMsg.C2S_PointRank_4907.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_PointRank_4907_descriptor;
         }

         public C2S_PointRank_4907 getDefaultInstanceForType() {
            return DragonTreasureMsg.C2S_PointRank_4907.getDefaultInstance();
         }

         public C2S_PointRank_4907 build() {
            C2S_PointRank_4907 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PointRank_4907 buildPartial() {
            C2S_PointRank_4907 result = new C2S_PointRank_4907(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityId_ = this.activityId_;
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
            if (other instanceof C2S_PointRank_4907) {
               return this.mergeFrom((C2S_PointRank_4907)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PointRank_4907 other) {
            if (other == DragonTreasureMsg.C2S_PointRank_4907.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityId()) {
                  this.setActivityId(other.getActivityId());
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
            C2S_PointRank_4907 parsedMessage = null;

            try {
               parsedMessage = (C2S_PointRank_4907)DragonTreasureMsg.C2S_PointRank_4907.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PointRank_4907)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasActivityId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getActivityId() {
            return this.activityId_;
         }

         public Builder setActivityId(int value) {
            this.bitField0_ |= 1;
            this.activityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityId() {
            this.bitField0_ &= -2;
            this.activityId_ = 0;
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

   public static final class S2C_PointRank_4908 extends GeneratedMessageV3 implements S2C_PointRank_4908OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MYRANK_FIELD_NUMBER = 1;
      private RankData myRank_;
      public static final int RANKS_FIELD_NUMBER = 2;
      private List<RankData> ranks_;
      private byte memoizedIsInitialized;
      private static final S2C_PointRank_4908 DEFAULT_INSTANCE = new S2C_PointRank_4908();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PointRank_4908> PARSER = new AbstractParser<S2C_PointRank_4908>() {
         public S2C_PointRank_4908 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PointRank_4908(input, extensionRegistry);
         }
      };

      private S2C_PointRank_4908(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PointRank_4908() {
         this.memoizedIsInitialized = -1;
         this.ranks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PointRank_4908();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PointRank_4908(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        RankData.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.myRank_.toBuilder();
                        }

                        this.myRank_ = (RankData)input.readMessage(DragonTreasureMsg.RankData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.myRank_);
                           this.myRank_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.ranks_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.ranks_.add(input.readMessage(DragonTreasureMsg.RankData.PARSER, extensionRegistry));
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
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_PointRank_4908_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_PointRank_4908_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PointRank_4908.class, Builder.class);
      }

      public boolean hasMyRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public RankData getMyRank() {
         return this.myRank_ == null ? DragonTreasureMsg.RankData.getDefaultInstance() : this.myRank_;
      }

      public RankDataOrBuilder getMyRankOrBuilder() {
         return this.myRank_ == null ? DragonTreasureMsg.RankData.getDefaultInstance() : this.myRank_;
      }

      public List<RankData> getRanksList() {
         return this.ranks_;
      }

      public List<? extends RankDataOrBuilder> getRanksOrBuilderList() {
         return this.ranks_;
      }

      public int getRanksCount() {
         return this.ranks_.size();
      }

      public RankData getRanks(int index) {
         return (RankData)this.ranks_.get(index);
      }

      public RankDataOrBuilder getRanksOrBuilder(int index) {
         return (RankDataOrBuilder)this.ranks_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (this.hasMyRank() && !this.getMyRank().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRanksCount(); ++i) {
               if (!this.getRanks(i).isInitialized()) {
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
            output.writeMessage(1, this.getMyRank());
         }

         for(int i = 0; i < this.ranks_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.ranks_.get(i));
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
               size += CodedOutputStream.computeMessageSize(1, this.getMyRank());
            }

            for(int i = 0; i < this.ranks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.ranks_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PointRank_4908)) {
            return super.equals(obj);
         } else {
            S2C_PointRank_4908 other = (S2C_PointRank_4908)obj;
            if (this.hasMyRank() != other.hasMyRank()) {
               return false;
            } else if (this.hasMyRank() && !this.getMyRank().equals(other.getMyRank())) {
               return false;
            } else if (!this.getRanksList().equals(other.getRanksList())) {
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
            if (this.hasMyRank()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMyRank().hashCode();
            }

            if (this.getRanksCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRanksList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PointRank_4908 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PointRank_4908)PARSER.parseFrom(data);
      }

      public static S2C_PointRank_4908 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PointRank_4908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PointRank_4908 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PointRank_4908)PARSER.parseFrom(data);
      }

      public static S2C_PointRank_4908 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PointRank_4908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PointRank_4908 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PointRank_4908)PARSER.parseFrom(data);
      }

      public static S2C_PointRank_4908 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PointRank_4908)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PointRank_4908 parseFrom(InputStream input) throws IOException {
         return (S2C_PointRank_4908)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PointRank_4908 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PointRank_4908)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PointRank_4908 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PointRank_4908)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PointRank_4908 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PointRank_4908)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PointRank_4908 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PointRank_4908)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PointRank_4908 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PointRank_4908)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PointRank_4908 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PointRank_4908 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PointRank_4908> parser() {
         return PARSER;
      }

      public Parser<S2C_PointRank_4908> getParserForType() {
         return PARSER;
      }

      public S2C_PointRank_4908 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PointRank_4908OrBuilder {
         private int bitField0_;
         private RankData myRank_;
         private SingleFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> myRankBuilder_;
         private List<RankData> ranks_;
         private RepeatedFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> ranksBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_PointRank_4908_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_PointRank_4908_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PointRank_4908.class, Builder.class);
         }

         private Builder() {
            this.ranks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.ranks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTreasureMsg.S2C_PointRank_4908.alwaysUseFieldBuilders) {
               this.getMyRankFieldBuilder();
               this.getRanksFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.myRankBuilder_ == null) {
               this.myRank_ = null;
            } else {
               this.myRankBuilder_.clear();
            }

            this.bitField0_ &= -2;
            if (this.ranksBuilder_ == null) {
               this.ranks_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.ranksBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_PointRank_4908_descriptor;
         }

         public S2C_PointRank_4908 getDefaultInstanceForType() {
            return DragonTreasureMsg.S2C_PointRank_4908.getDefaultInstance();
         }

         public S2C_PointRank_4908 build() {
            S2C_PointRank_4908 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PointRank_4908 buildPartial() {
            S2C_PointRank_4908 result = new S2C_PointRank_4908(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.myRankBuilder_ == null) {
                  result.myRank_ = this.myRank_;
               } else {
                  result.myRank_ = (RankData)this.myRankBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if (this.ranksBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
                  this.bitField0_ &= -3;
               }

               result.ranks_ = this.ranks_;
            } else {
               result.ranks_ = this.ranksBuilder_.build();
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
            if (other instanceof S2C_PointRank_4908) {
               return this.mergeFrom((S2C_PointRank_4908)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PointRank_4908 other) {
            if (other == DragonTreasureMsg.S2C_PointRank_4908.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMyRank()) {
                  this.mergeMyRank(other.getMyRank());
               }

               if (this.ranksBuilder_ == null) {
                  if (!other.ranks_.isEmpty()) {
                     if (this.ranks_.isEmpty()) {
                        this.ranks_ = other.ranks_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureRanksIsMutable();
                        this.ranks_.addAll(other.ranks_);
                     }

                     this.onChanged();
                  }
               } else if (!other.ranks_.isEmpty()) {
                  if (this.ranksBuilder_.isEmpty()) {
                     this.ranksBuilder_.dispose();
                     this.ranksBuilder_ = null;
                     this.ranks_ = other.ranks_;
                     this.bitField0_ &= -3;
                     this.ranksBuilder_ = DragonTreasureMsg.S2C_PointRank_4908.alwaysUseFieldBuilders ? this.getRanksFieldBuilder() : null;
                  } else {
                     this.ranksBuilder_.addAllMessages(other.ranks_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (this.hasMyRank() && !this.getMyRank().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getRanksCount(); ++i) {
                  if (!this.getRanks(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PointRank_4908 parsedMessage = null;

            try {
               parsedMessage = (S2C_PointRank_4908)DragonTreasureMsg.S2C_PointRank_4908.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PointRank_4908)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMyRank() {
            return (this.bitField0_ & 1) != 0;
         }

         public RankData getMyRank() {
            if (this.myRankBuilder_ == null) {
               return this.myRank_ == null ? DragonTreasureMsg.RankData.getDefaultInstance() : this.myRank_;
            } else {
               return (RankData)this.myRankBuilder_.getMessage();
            }
         }

         public Builder setMyRank(RankData value) {
            if (this.myRankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.myRank_ = value;
               this.onChanged();
            } else {
               this.myRankBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setMyRank(RankData.Builder builderForValue) {
            if (this.myRankBuilder_ == null) {
               this.myRank_ = builderForValue.build();
               this.onChanged();
            } else {
               this.myRankBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeMyRank(RankData value) {
            if (this.myRankBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.myRank_ != null && this.myRank_ != DragonTreasureMsg.RankData.getDefaultInstance()) {
                  this.myRank_ = DragonTreasureMsg.RankData.newBuilder(this.myRank_).mergeFrom(value).buildPartial();
               } else {
                  this.myRank_ = value;
               }

               this.onChanged();
            } else {
               this.myRankBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearMyRank() {
            if (this.myRankBuilder_ == null) {
               this.myRank_ = null;
               this.onChanged();
            } else {
               this.myRankBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public RankData.Builder getMyRankBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (RankData.Builder)this.getMyRankFieldBuilder().getBuilder();
         }

         public RankDataOrBuilder getMyRankOrBuilder() {
            if (this.myRankBuilder_ != null) {
               return (RankDataOrBuilder)this.myRankBuilder_.getMessageOrBuilder();
            } else {
               return this.myRank_ == null ? DragonTreasureMsg.RankData.getDefaultInstance() : this.myRank_;
            }
         }

         private SingleFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> getMyRankFieldBuilder() {
            if (this.myRankBuilder_ == null) {
               this.myRankBuilder_ = new SingleFieldBuilderV3(this.getMyRank(), this.getParentForChildren(), this.isClean());
               this.myRank_ = null;
            }

            return this.myRankBuilder_;
         }

         private void ensureRanksIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.ranks_ = new ArrayList(this.ranks_);
               this.bitField0_ |= 2;
            }

         }

         public List<RankData> getRanksList() {
            return this.ranksBuilder_ == null ? Collections.unmodifiableList(this.ranks_) : this.ranksBuilder_.getMessageList();
         }

         public int getRanksCount() {
            return this.ranksBuilder_ == null ? this.ranks_.size() : this.ranksBuilder_.getCount();
         }

         public RankData getRanks(int index) {
            return this.ranksBuilder_ == null ? (RankData)this.ranks_.get(index) : (RankData)this.ranksBuilder_.getMessage(index);
         }

         public Builder setRanks(int index, RankData value) {
            if (this.ranksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRanksIsMutable();
               this.ranks_.set(index, value);
               this.onChanged();
            } else {
               this.ranksBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRanks(int index, RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(RankData value) {
            if (this.ranksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRanksIsMutable();
               this.ranks_.add(value);
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRanks(int index, RankData value) {
            if (this.ranksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRanksIsMutable();
               this.ranks_.add(index, value);
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRanks(RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(int index, RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRanks(Iterable<? extends RankData> values) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.ranks_);
               this.onChanged();
            } else {
               this.ranksBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRanks() {
            if (this.ranksBuilder_ == null) {
               this.ranks_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.ranksBuilder_.clear();
            }

            return this;
         }

         public Builder removeRanks(int index) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.remove(index);
               this.onChanged();
            } else {
               this.ranksBuilder_.remove(index);
            }

            return this;
         }

         public RankData.Builder getRanksBuilder(int index) {
            return (RankData.Builder)this.getRanksFieldBuilder().getBuilder(index);
         }

         public RankDataOrBuilder getRanksOrBuilder(int index) {
            return this.ranksBuilder_ == null ? (RankDataOrBuilder)this.ranks_.get(index) : (RankDataOrBuilder)this.ranksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankDataOrBuilder> getRanksOrBuilderList() {
            return this.ranksBuilder_ != null ? this.ranksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.ranks_);
         }

         public RankData.Builder addRanksBuilder() {
            return (RankData.Builder)this.getRanksFieldBuilder().addBuilder(DragonTreasureMsg.RankData.getDefaultInstance());
         }

         public RankData.Builder addRanksBuilder(int index) {
            return (RankData.Builder)this.getRanksFieldBuilder().addBuilder(index, DragonTreasureMsg.RankData.getDefaultInstance());
         }

         public List<RankData.Builder> getRanksBuilderList() {
            return this.getRanksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> getRanksFieldBuilder() {
            if (this.ranksBuilder_ == null) {
               this.ranksBuilder_ = new RepeatedFieldBuilderV3(this.ranks_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.ranks_ = null;
            }

            return this.ranksBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ReceiveBoxAward_4909 extends GeneratedMessageV3 implements C2S_ReceiveBoxAward_4909OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LUCKPOINT_FIELD_NUMBER = 1;
      private int luckPoint_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveBoxAward_4909 DEFAULT_INSTANCE = new C2S_ReceiveBoxAward_4909();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveBoxAward_4909> PARSER = new AbstractParser<C2S_ReceiveBoxAward_4909>() {
         public C2S_ReceiveBoxAward_4909 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveBoxAward_4909(input, extensionRegistry);
         }
      };

      private C2S_ReceiveBoxAward_4909(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveBoxAward_4909() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveBoxAward_4909();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveBoxAward_4909(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.luckPoint_ = input.readInt32();
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
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_ReceiveBoxAward_4909_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_ReceiveBoxAward_4909_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveBoxAward_4909.class, Builder.class);
      }

      public boolean hasLuckPoint() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLuckPoint() {
         return this.luckPoint_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLuckPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.luckPoint_);
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
               size += CodedOutputStream.computeInt32Size(1, this.luckPoint_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ReceiveBoxAward_4909)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveBoxAward_4909 other = (C2S_ReceiveBoxAward_4909)obj;
            if (this.hasLuckPoint() != other.hasLuckPoint()) {
               return false;
            } else if (this.hasLuckPoint() && this.getLuckPoint() != other.getLuckPoint()) {
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
            if (this.hasLuckPoint()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLuckPoint();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ReceiveBoxAward_4909 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveBoxAward_4909)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveBoxAward_4909 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveBoxAward_4909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveBoxAward_4909 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveBoxAward_4909)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveBoxAward_4909 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveBoxAward_4909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveBoxAward_4909 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveBoxAward_4909)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveBoxAward_4909 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveBoxAward_4909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveBoxAward_4909 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveBoxAward_4909)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveBoxAward_4909 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveBoxAward_4909)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveBoxAward_4909 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveBoxAward_4909)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveBoxAward_4909 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveBoxAward_4909)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveBoxAward_4909 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveBoxAward_4909)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveBoxAward_4909 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveBoxAward_4909)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveBoxAward_4909 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveBoxAward_4909 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveBoxAward_4909> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveBoxAward_4909> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveBoxAward_4909 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveBoxAward_4909OrBuilder {
         private int bitField0_;
         private int luckPoint_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_ReceiveBoxAward_4909_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_ReceiveBoxAward_4909_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveBoxAward_4909.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTreasureMsg.C2S_ReceiveBoxAward_4909.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.luckPoint_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_C2S_ReceiveBoxAward_4909_descriptor;
         }

         public C2S_ReceiveBoxAward_4909 getDefaultInstanceForType() {
            return DragonTreasureMsg.C2S_ReceiveBoxAward_4909.getDefaultInstance();
         }

         public C2S_ReceiveBoxAward_4909 build() {
            C2S_ReceiveBoxAward_4909 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveBoxAward_4909 buildPartial() {
            C2S_ReceiveBoxAward_4909 result = new C2S_ReceiveBoxAward_4909(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.luckPoint_ = this.luckPoint_;
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
            if (other instanceof C2S_ReceiveBoxAward_4909) {
               return this.mergeFrom((C2S_ReceiveBoxAward_4909)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveBoxAward_4909 other) {
            if (other == DragonTreasureMsg.C2S_ReceiveBoxAward_4909.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLuckPoint()) {
                  this.setLuckPoint(other.getLuckPoint());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasLuckPoint();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ReceiveBoxAward_4909 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveBoxAward_4909)DragonTreasureMsg.C2S_ReceiveBoxAward_4909.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveBoxAward_4909)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLuckPoint() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getLuckPoint() {
            return this.luckPoint_;
         }

         public Builder setLuckPoint(int value) {
            this.bitField0_ |= 1;
            this.luckPoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLuckPoint() {
            this.bitField0_ &= -2;
            this.luckPoint_ = 0;
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

   public static final class S2C_ReceiveBoxAward_4910 extends GeneratedMessageV3 implements S2C_ReceiveBoxAward_4910OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECEIVEBOX_FIELD_NUMBER = 1;
      private Internal.IntList receiveBox_;
      private byte memoizedIsInitialized;
      private static final S2C_ReceiveBoxAward_4910 DEFAULT_INSTANCE = new S2C_ReceiveBoxAward_4910();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ReceiveBoxAward_4910> PARSER = new AbstractParser<S2C_ReceiveBoxAward_4910>() {
         public S2C_ReceiveBoxAward_4910 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ReceiveBoxAward_4910(input, extensionRegistry);
         }
      };

      private S2C_ReceiveBoxAward_4910(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ReceiveBoxAward_4910() {
         this.memoizedIsInitialized = -1;
         this.receiveBox_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ReceiveBoxAward_4910();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ReceiveBoxAward_4910(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.receiveBox_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.receiveBox_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.receiveBox_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.receiveBox_.addInt(input.readInt32());
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
                  this.receiveBox_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_ReceiveBoxAward_4910_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_ReceiveBoxAward_4910_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveBoxAward_4910.class, Builder.class);
      }

      public List<Integer> getReceiveBoxList() {
         return this.receiveBox_;
      }

      public int getReceiveBoxCount() {
         return this.receiveBox_.size();
      }

      public int getReceiveBox(int index) {
         return this.receiveBox_.getInt(index);
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
         for(int i = 0; i < this.receiveBox_.size(); ++i) {
            output.writeInt32(1, this.receiveBox_.getInt(i));
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

            for(int i = 0; i < this.receiveBox_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.receiveBox_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getReceiveBoxList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ReceiveBoxAward_4910)) {
            return super.equals(obj);
         } else {
            S2C_ReceiveBoxAward_4910 other = (S2C_ReceiveBoxAward_4910)obj;
            if (!this.getReceiveBoxList().equals(other.getReceiveBoxList())) {
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
            if (this.getReceiveBoxCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getReceiveBoxList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ReceiveBoxAward_4910 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveBoxAward_4910)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveBoxAward_4910 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveBoxAward_4910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveBoxAward_4910 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveBoxAward_4910)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveBoxAward_4910 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveBoxAward_4910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveBoxAward_4910 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveBoxAward_4910)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveBoxAward_4910 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveBoxAward_4910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveBoxAward_4910 parseFrom(InputStream input) throws IOException {
         return (S2C_ReceiveBoxAward_4910)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveBoxAward_4910 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveBoxAward_4910)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveBoxAward_4910 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ReceiveBoxAward_4910)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ReceiveBoxAward_4910 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveBoxAward_4910)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveBoxAward_4910 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ReceiveBoxAward_4910)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveBoxAward_4910 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveBoxAward_4910)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ReceiveBoxAward_4910 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ReceiveBoxAward_4910 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ReceiveBoxAward_4910> parser() {
         return PARSER;
      }

      public Parser<S2C_ReceiveBoxAward_4910> getParserForType() {
         return PARSER;
      }

      public S2C_ReceiveBoxAward_4910 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ReceiveBoxAward_4910OrBuilder {
         private int bitField0_;
         private Internal.IntList receiveBox_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_ReceiveBoxAward_4910_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_ReceiveBoxAward_4910_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveBoxAward_4910.class, Builder.class);
         }

         private Builder() {
            this.receiveBox_ = DragonTreasureMsg.S2C_ReceiveBoxAward_4910.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.receiveBox_ = DragonTreasureMsg.S2C_ReceiveBoxAward_4910.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTreasureMsg.S2C_ReceiveBoxAward_4910.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.receiveBox_ = DragonTreasureMsg.S2C_ReceiveBoxAward_4910.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2C_ReceiveBoxAward_4910_descriptor;
         }

         public S2C_ReceiveBoxAward_4910 getDefaultInstanceForType() {
            return DragonTreasureMsg.S2C_ReceiveBoxAward_4910.getDefaultInstance();
         }

         public S2C_ReceiveBoxAward_4910 build() {
            S2C_ReceiveBoxAward_4910 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ReceiveBoxAward_4910 buildPartial() {
            S2C_ReceiveBoxAward_4910 result = new S2C_ReceiveBoxAward_4910(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.receiveBox_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.receiveBox_ = this.receiveBox_;
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
            if (other instanceof S2C_ReceiveBoxAward_4910) {
               return this.mergeFrom((S2C_ReceiveBoxAward_4910)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ReceiveBoxAward_4910 other) {
            if (other == DragonTreasureMsg.S2C_ReceiveBoxAward_4910.getDefaultInstance()) {
               return this;
            } else {
               if (!other.receiveBox_.isEmpty()) {
                  if (this.receiveBox_.isEmpty()) {
                     this.receiveBox_ = other.receiveBox_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureReceiveBoxIsMutable();
                     this.receiveBox_.addAll(other.receiveBox_);
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
            S2C_ReceiveBoxAward_4910 parsedMessage = null;

            try {
               parsedMessage = (S2C_ReceiveBoxAward_4910)DragonTreasureMsg.S2C_ReceiveBoxAward_4910.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ReceiveBoxAward_4910)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureReceiveBoxIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.receiveBox_ = DragonTreasureMsg.S2C_ReceiveBoxAward_4910.mutableCopy(this.receiveBox_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getReceiveBoxList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.receiveBox_) : this.receiveBox_);
         }

         public int getReceiveBoxCount() {
            return this.receiveBox_.size();
         }

         public int getReceiveBox(int index) {
            return this.receiveBox_.getInt(index);
         }

         public Builder setReceiveBox(int index, int value) {
            this.ensureReceiveBoxIsMutable();
            this.receiveBox_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addReceiveBox(int value) {
            this.ensureReceiveBoxIsMutable();
            this.receiveBox_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllReceiveBox(Iterable<? extends Integer> values) {
            this.ensureReceiveBoxIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.receiveBox_);
            this.onChanged();
            return this;
         }

         public Builder clearReceiveBox() {
            this.receiveBox_ = DragonTreasureMsg.S2C_ReceiveBoxAward_4910.emptyIntList();
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

   public static final class RankData extends GeneratedMessageV3 implements RankDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int SERVERID_FIELD_NUMBER = 2;
      private int serverId_;
      public static final int PLAYERID_FIELD_NUMBER = 3;
      private int playerId_;
      public static final int HEAD_FIELD_NUMBER = 4;
      private int head_;
      public static final int HEADFRAME_FIELD_NUMBER = 5;
      private int headFrame_;
      public static final int LV_FIELD_NUMBER = 6;
      private int lv_;
      public static final int PLAYERNAME_FIELD_NUMBER = 7;
      private volatile Object playerName_;
      public static final int SCORE_FIELD_NUMBER = 8;
      private int score_;
      private byte memoizedIsInitialized;
      private static final RankData DEFAULT_INSTANCE = new RankData();
      /** @deprecated */
      @Deprecated
      public static final Parser<RankData> PARSER = new AbstractParser<RankData>() {
         public RankData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RankData(input, extensionRegistry);
         }
      };

      private RankData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RankData() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RankData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RankData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rank_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.serverId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.playerId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.head_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.lv_ = input.readInt32();
                        break;
                     case 58:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 64;
                        this.playerName_ = bs;
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.score_ = input.readInt32();
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
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_RankData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_RankData_fieldAccessorTable.ensureFieldAccessorsInitialized(RankData.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasHead() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasLv() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 64) != 0;
      }

      public String getPlayerName() {
         Object ref = this.playerName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.playerName_ = s;
            }

            return s;
         }
      }

      public ByteString getPlayerNameBytes() {
         Object ref = this.playerName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.playerName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasScore() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getScore() {
         return this.score_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeadFrame()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasScore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.rank_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.serverId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.playerId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.head_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.headFrame_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.lv_);
         }

         if ((this.bitField0_ & 64) != 0) {
            GeneratedMessageV3.writeString(output, 7, this.playerName_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.score_);
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
               size += CodedOutputStream.computeInt32Size(1, this.rank_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.serverId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.playerId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.head_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.headFrame_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.lv_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += GeneratedMessageV3.computeStringSize(7, this.playerName_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.score_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RankData)) {
            return super.equals(obj);
         } else {
            RankData other = (RankData)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasScore() != other.hasScore()) {
               return false;
            } else if (this.hasScore() && this.getScore() != other.getScore()) {
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
            if (this.hasRank()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRank();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasHead()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getLv();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasScore()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getScore();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RankData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RankData)PARSER.parseFrom(data);
      }

      public static RankData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RankData)PARSER.parseFrom(data);
      }

      public static RankData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RankData)PARSER.parseFrom(data);
      }

      public static RankData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankData parseFrom(InputStream input) throws IOException {
         return (RankData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RankData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RankData parseDelimitedFrom(InputStream input) throws IOException {
         return (RankData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RankData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RankData parseFrom(CodedInputStream input) throws IOException {
         return (RankData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RankData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RankData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RankData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RankData> parser() {
         return PARSER;
      }

      public Parser<RankData> getParserForType() {
         return PARSER;
      }

      public RankData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RankDataOrBuilder {
         private int bitField0_;
         private int rank_;
         private int serverId_;
         private int playerId_;
         private int head_;
         private int headFrame_;
         private int lv_;
         private Object playerName_;
         private int score_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_RankData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_RankData_fieldAccessorTable.ensureFieldAccessorsInitialized(RankData.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTreasureMsg.RankData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.serverId_ = 0;
            this.bitField0_ &= -3;
            this.playerId_ = 0;
            this.bitField0_ &= -5;
            this.head_ = 0;
            this.bitField0_ &= -9;
            this.headFrame_ = 0;
            this.bitField0_ &= -17;
            this.lv_ = 0;
            this.bitField0_ &= -33;
            this.playerName_ = "";
            this.bitField0_ &= -65;
            this.score_ = 0;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_RankData_descriptor;
         }

         public RankData getDefaultInstanceForType() {
            return DragonTreasureMsg.RankData.getDefaultInstance();
         }

         public RankData build() {
            RankData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RankData buildPartial() {
            RankData result = new RankData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.lv_ = this.lv_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               to_bitField0_ |= 64;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 128) != 0) {
               result.score_ = this.score_;
               to_bitField0_ |= 128;
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
            if (other instanceof RankData) {
               return this.mergeFrom((RankData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RankData other) {
            if (other == DragonTreasureMsg.RankData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 64;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasScore()) {
                  this.setScore(other.getScore());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRank()) {
               return false;
            } else if (!this.hasServerId()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasHead()) {
               return false;
            } else if (!this.hasHeadFrame()) {
               return false;
            } else if (!this.hasLv()) {
               return false;
            } else if (!this.hasPlayerName()) {
               return false;
            } else {
               return this.hasScore();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RankData parsedMessage = null;

            try {
               parsedMessage = (RankData)DragonTreasureMsg.RankData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RankData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRank() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRank() {
            return this.rank_;
         }

         public Builder setRank(int value) {
            this.bitField0_ |= 1;
            this.rank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRank() {
            this.bitField0_ &= -2;
            this.rank_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 2;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -3;
            this.serverId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getPlayerId() {
            return this.playerId_;
         }

         public Builder setPlayerId(int value) {
            this.bitField0_ |= 4;
            this.playerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.bitField0_ &= -5;
            this.playerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHead() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getHead() {
            return this.head_;
         }

         public Builder setHead(int value) {
            this.bitField0_ |= 8;
            this.head_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHead() {
            this.bitField0_ &= -9;
            this.head_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeadFrame() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getHeadFrame() {
            return this.headFrame_;
         }

         public Builder setHeadFrame(int value) {
            this.bitField0_ |= 16;
            this.headFrame_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadFrame() {
            this.bitField0_ &= -17;
            this.headFrame_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLv() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 32;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -33;
            this.lv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 64) != 0;
         }

         public String getPlayerName() {
            Object ref = this.playerName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.playerName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getPlayerNameBytes() {
            Object ref = this.playerName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.playerName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setPlayerName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 64;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -65;
            this.playerName_ = DragonTreasureMsg.RankData.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 64;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasScore() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getScore() {
            return this.score_;
         }

         public Builder setScore(int value) {
            this.bitField0_ |= 128;
            this.score_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearScore() {
            this.bitField0_ &= -129;
            this.score_ = 0;
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

   public static final class AwardPool extends GeneratedMessageV3 implements AwardPoolOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private int position_;
      public static final int AWARDID_FIELD_NUMBER = 2;
      private int awardId_;
      public static final int END_FIELD_NUMBER = 3;
      private boolean end_;
      private byte memoizedIsInitialized;
      private static final AwardPool DEFAULT_INSTANCE = new AwardPool();
      /** @deprecated */
      @Deprecated
      public static final Parser<AwardPool> PARSER = new AbstractParser<AwardPool>() {
         public AwardPool parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new AwardPool(input, extensionRegistry);
         }
      };

      private AwardPool(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private AwardPool() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new AwardPool();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private AwardPool(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.position_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.awardId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.end_ = input.readBool();
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
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_AwardPool_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_AwardPool_fieldAccessorTable.ensureFieldAccessorsInitialized(AwardPool.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPosition() {
         return this.position_;
      }

      public boolean hasAwardId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getAwardId() {
         return this.awardId_;
      }

      public boolean hasEnd() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getEnd() {
         return this.end_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAwardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEnd()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.position_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.awardId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.end_);
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
               size += CodedOutputStream.computeInt32Size(1, this.position_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.awardId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.end_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof AwardPool)) {
            return super.equals(obj);
         } else {
            AwardPool other = (AwardPool)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.getPosition() != other.getPosition()) {
               return false;
            } else if (this.hasAwardId() != other.hasAwardId()) {
               return false;
            } else if (this.hasAwardId() && this.getAwardId() != other.getAwardId()) {
               return false;
            } else if (this.hasEnd() != other.hasEnd()) {
               return false;
            } else if (this.hasEnd() && this.getEnd() != other.getEnd()) {
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
            if (this.hasPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPosition();
            }

            if (this.hasAwardId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAwardId();
            }

            if (this.hasEnd()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getEnd());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static AwardPool parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (AwardPool)PARSER.parseFrom(data);
      }

      public static AwardPool parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (AwardPool)PARSER.parseFrom(data, extensionRegistry);
      }

      public static AwardPool parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (AwardPool)PARSER.parseFrom(data);
      }

      public static AwardPool parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (AwardPool)PARSER.parseFrom(data, extensionRegistry);
      }

      public static AwardPool parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (AwardPool)PARSER.parseFrom(data);
      }

      public static AwardPool parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (AwardPool)PARSER.parseFrom(data, extensionRegistry);
      }

      public static AwardPool parseFrom(InputStream input) throws IOException {
         return (AwardPool)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static AwardPool parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (AwardPool)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static AwardPool parseDelimitedFrom(InputStream input) throws IOException {
         return (AwardPool)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static AwardPool parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (AwardPool)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static AwardPool parseFrom(CodedInputStream input) throws IOException {
         return (AwardPool)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static AwardPool parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (AwardPool)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(AwardPool prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static AwardPool getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<AwardPool> parser() {
         return PARSER;
      }

      public Parser<AwardPool> getParserForType() {
         return PARSER;
      }

      public AwardPool getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AwardPoolOrBuilder {
         private int bitField0_;
         private int position_;
         private int awardId_;
         private boolean end_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_AwardPool_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_AwardPool_fieldAccessorTable.ensureFieldAccessorsInitialized(AwardPool.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTreasureMsg.AwardPool.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.position_ = 0;
            this.bitField0_ &= -2;
            this.awardId_ = 0;
            this.bitField0_ &= -3;
            this.end_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_AwardPool_descriptor;
         }

         public AwardPool getDefaultInstanceForType() {
            return DragonTreasureMsg.AwardPool.getDefaultInstance();
         }

         public AwardPool build() {
            AwardPool result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public AwardPool buildPartial() {
            AwardPool result = new AwardPool(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.position_ = this.position_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.awardId_ = this.awardId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.end_ = this.end_;
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
            if (other instanceof AwardPool) {
               return this.mergeFrom((AwardPool)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(AwardPool other) {
            if (other == DragonTreasureMsg.AwardPool.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasAwardId()) {
                  this.setAwardId(other.getAwardId());
               }

               if (other.hasEnd()) {
                  this.setEnd(other.getEnd());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPosition()) {
               return false;
            } else if (!this.hasAwardId()) {
               return false;
            } else {
               return this.hasEnd();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            AwardPool parsedMessage = null;

            try {
               parsedMessage = (AwardPool)DragonTreasureMsg.AwardPool.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (AwardPool)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPosition() {
            return this.position_;
         }

         public Builder setPosition(int value) {
            this.bitField0_ |= 1;
            this.position_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPosition() {
            this.bitField0_ &= -2;
            this.position_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAwardId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getAwardId() {
            return this.awardId_;
         }

         public Builder setAwardId(int value) {
            this.bitField0_ |= 2;
            this.awardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAwardId() {
            this.bitField0_ &= -3;
            this.awardId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEnd() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getEnd() {
            return this.end_;
         }

         public Builder setEnd(boolean value) {
            this.bitField0_ |= 4;
            this.end_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEnd() {
            this.bitField0_ &= -5;
            this.end_ = false;
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

   public static final class RecruitRecord extends GeneratedMessageV3 implements RecruitRecordOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SERVERID_FIELD_NUMBER = 1;
      private int serverId_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 3;
      private volatile Object playerName_;
      public static final int AWARDID_FIELD_NUMBER = 4;
      private int awardId_;
      public static final int BROADCAST_FIELD_NUMBER = 5;
      private boolean broadcast_;
      private byte memoizedIsInitialized;
      private static final RecruitRecord DEFAULT_INSTANCE = new RecruitRecord();
      /** @deprecated */
      @Deprecated
      public static final Parser<RecruitRecord> PARSER = new AbstractParser<RecruitRecord>() {
         public RecruitRecord parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RecruitRecord(input, extensionRegistry);
         }
      };

      private RecruitRecord(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RecruitRecord() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RecruitRecord();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RecruitRecord(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.serverId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.playerId_ = input.readInt32();
                        break;
                     case 26:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.playerName_ = bs;
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.awardId_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.broadcast_ = input.readBool();
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
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_RecruitRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_RecruitRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(RecruitRecord.class, Builder.class);
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 4) != 0;
      }

      public String getPlayerName() {
         Object ref = this.playerName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.playerName_ = s;
            }

            return s;
         }
      }

      public ByteString getPlayerNameBytes() {
         Object ref = this.playerName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.playerName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasAwardId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getAwardId() {
         return this.awardId_;
      }

      public boolean hasBroadcast() {
         return (this.bitField0_ & 16) != 0;
      }

      public boolean getBroadcast() {
         return this.broadcast_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAwardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBroadcast()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.serverId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.playerName_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.awardId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeBool(5, this.broadcast_);
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
               size += CodedOutputStream.computeInt32Size(1, this.serverId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.playerName_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.awardId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeBoolSize(5, this.broadcast_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RecruitRecord)) {
            return super.equals(obj);
         } else {
            RecruitRecord other = (RecruitRecord)obj;
            if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasAwardId() != other.hasAwardId()) {
               return false;
            } else if (this.hasAwardId() && this.getAwardId() != other.getAwardId()) {
               return false;
            } else if (this.hasBroadcast() != other.hasBroadcast()) {
               return false;
            } else if (this.hasBroadcast() && this.getBroadcast() != other.getBroadcast()) {
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
            if (this.hasServerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasAwardId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getAwardId();
            }

            if (this.hasBroadcast()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashBoolean(this.getBroadcast());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RecruitRecord parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RecruitRecord)PARSER.parseFrom(data);
      }

      public static RecruitRecord parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecruitRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecruitRecord parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RecruitRecord)PARSER.parseFrom(data);
      }

      public static RecruitRecord parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecruitRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecruitRecord parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RecruitRecord)PARSER.parseFrom(data);
      }

      public static RecruitRecord parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecruitRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecruitRecord parseFrom(InputStream input) throws IOException {
         return (RecruitRecord)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RecruitRecord parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecruitRecord)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RecruitRecord parseDelimitedFrom(InputStream input) throws IOException {
         return (RecruitRecord)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RecruitRecord parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecruitRecord)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RecruitRecord parseFrom(CodedInputStream input) throws IOException {
         return (RecruitRecord)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RecruitRecord parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecruitRecord)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RecruitRecord prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RecruitRecord getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RecruitRecord> parser() {
         return PARSER;
      }

      public Parser<RecruitRecord> getParserForType() {
         return PARSER;
      }

      public RecruitRecord getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RecruitRecordOrBuilder {
         private int bitField0_;
         private int serverId_;
         private int playerId_;
         private Object playerName_;
         private int awardId_;
         private boolean broadcast_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_RecruitRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_RecruitRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(RecruitRecord.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTreasureMsg.RecruitRecord.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.serverId_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.playerName_ = "";
            this.bitField0_ &= -5;
            this.awardId_ = 0;
            this.bitField0_ &= -9;
            this.broadcast_ = false;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_RecruitRecord_descriptor;
         }

         public RecruitRecord getDefaultInstanceForType() {
            return DragonTreasureMsg.RecruitRecord.getDefaultInstance();
         }

         public RecruitRecord build() {
            RecruitRecord result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RecruitRecord buildPartial() {
            RecruitRecord result = new RecruitRecord(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 8) != 0) {
               result.awardId_ = this.awardId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.broadcast_ = this.broadcast_;
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
            if (other instanceof RecruitRecord) {
               return this.mergeFrom((RecruitRecord)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RecruitRecord other) {
            if (other == DragonTreasureMsg.RecruitRecord.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 4;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasAwardId()) {
                  this.setAwardId(other.getAwardId());
               }

               if (other.hasBroadcast()) {
                  this.setBroadcast(other.getBroadcast());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasServerId()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasAwardId()) {
               return false;
            } else {
               return this.hasBroadcast();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RecruitRecord parsedMessage = null;

            try {
               parsedMessage = (RecruitRecord)DragonTreasureMsg.RecruitRecord.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RecruitRecord)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 1;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -2;
            this.serverId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPlayerId() {
            return this.playerId_;
         }

         public Builder setPlayerId(int value) {
            this.bitField0_ |= 2;
            this.playerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.bitField0_ &= -3;
            this.playerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 4) != 0;
         }

         public String getPlayerName() {
            Object ref = this.playerName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.playerName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getPlayerNameBytes() {
            Object ref = this.playerName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.playerName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setPlayerName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -5;
            this.playerName_ = DragonTreasureMsg.RecruitRecord.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasAwardId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getAwardId() {
            return this.awardId_;
         }

         public Builder setAwardId(int value) {
            this.bitField0_ |= 8;
            this.awardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAwardId() {
            this.bitField0_ &= -9;
            this.awardId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBroadcast() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getBroadcast() {
            return this.broadcast_;
         }

         public Builder setBroadcast(boolean value) {
            this.bitField0_ |= 16;
            this.broadcast_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBroadcast() {
            this.bitField0_ &= -17;
            this.broadcast_ = false;
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

   public static final class S2S_UpdateRecord_4930 extends GeneratedMessageV3 implements S2S_UpdateRecord_4930OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int AWARDLIST_FIELD_NUMBER = 1;
      private Internal.IntList awardList_;
      public static final int ACTIVITYID_FIELD_NUMBER = 2;
      private int activityId_;
      private byte memoizedIsInitialized;
      private static final S2S_UpdateRecord_4930 DEFAULT_INSTANCE = new S2S_UpdateRecord_4930();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_UpdateRecord_4930> PARSER = new AbstractParser<S2S_UpdateRecord_4930>() {
         public S2S_UpdateRecord_4930 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_UpdateRecord_4930(input, extensionRegistry);
         }
      };

      private S2S_UpdateRecord_4930(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_UpdateRecord_4930() {
         this.memoizedIsInitialized = -1;
         this.awardList_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_UpdateRecord_4930();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_UpdateRecord_4930(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.awardList_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.awardList_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.awardList_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.activityId_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.awardList_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.awardList_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2S_UpdateRecord_4930_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2S_UpdateRecord_4930_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_UpdateRecord_4930.class, Builder.class);
      }

      public List<Integer> getAwardListList() {
         return this.awardList_;
      }

      public int getAwardListCount() {
         return this.awardList_.size();
      }

      public int getAwardList(int index) {
         return this.awardList_.getInt(index);
      }

      public boolean hasActivityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityId() {
         return this.activityId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasActivityId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.awardList_.size(); ++i) {
            output.writeInt32(1, this.awardList_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.activityId_);
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

            for(int i = 0; i < this.awardList_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.awardList_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getAwardListList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.activityId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_UpdateRecord_4930)) {
            return super.equals(obj);
         } else {
            S2S_UpdateRecord_4930 other = (S2S_UpdateRecord_4930)obj;
            if (!this.getAwardListList().equals(other.getAwardListList())) {
               return false;
            } else if (this.hasActivityId() != other.hasActivityId()) {
               return false;
            } else if (this.hasActivityId() && this.getActivityId() != other.getActivityId()) {
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
            if (this.getAwardListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAwardListList().hashCode();
            }

            if (this.hasActivityId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getActivityId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_UpdateRecord_4930 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_UpdateRecord_4930)PARSER.parseFrom(data);
      }

      public static S2S_UpdateRecord_4930 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_UpdateRecord_4930)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_UpdateRecord_4930 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_UpdateRecord_4930)PARSER.parseFrom(data);
      }

      public static S2S_UpdateRecord_4930 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_UpdateRecord_4930)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_UpdateRecord_4930 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_UpdateRecord_4930)PARSER.parseFrom(data);
      }

      public static S2S_UpdateRecord_4930 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_UpdateRecord_4930)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_UpdateRecord_4930 parseFrom(InputStream input) throws IOException {
         return (S2S_UpdateRecord_4930)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_UpdateRecord_4930 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_UpdateRecord_4930)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_UpdateRecord_4930 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_UpdateRecord_4930)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_UpdateRecord_4930 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_UpdateRecord_4930)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_UpdateRecord_4930 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_UpdateRecord_4930)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_UpdateRecord_4930 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_UpdateRecord_4930)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_UpdateRecord_4930 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_UpdateRecord_4930 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_UpdateRecord_4930> parser() {
         return PARSER;
      }

      public Parser<S2S_UpdateRecord_4930> getParserForType() {
         return PARSER;
      }

      public S2S_UpdateRecord_4930 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_UpdateRecord_4930OrBuilder {
         private int bitField0_;
         private Internal.IntList awardList_;
         private int activityId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2S_UpdateRecord_4930_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2S_UpdateRecord_4930_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_UpdateRecord_4930.class, Builder.class);
         }

         private Builder() {
            this.awardList_ = DragonTreasureMsg.S2S_UpdateRecord_4930.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.awardList_ = DragonTreasureMsg.S2S_UpdateRecord_4930.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTreasureMsg.S2S_UpdateRecord_4930.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.awardList_ = DragonTreasureMsg.S2S_UpdateRecord_4930.emptyIntList();
            this.bitField0_ &= -2;
            this.activityId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2S_UpdateRecord_4930_descriptor;
         }

         public S2S_UpdateRecord_4930 getDefaultInstanceForType() {
            return DragonTreasureMsg.S2S_UpdateRecord_4930.getDefaultInstance();
         }

         public S2S_UpdateRecord_4930 build() {
            S2S_UpdateRecord_4930 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_UpdateRecord_4930 buildPartial() {
            S2S_UpdateRecord_4930 result = new S2S_UpdateRecord_4930(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.awardList_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.awardList_ = this.awardList_;
            if ((from_bitField0_ & 2) != 0) {
               result.activityId_ = this.activityId_;
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
            if (other instanceof S2S_UpdateRecord_4930) {
               return this.mergeFrom((S2S_UpdateRecord_4930)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_UpdateRecord_4930 other) {
            if (other == DragonTreasureMsg.S2S_UpdateRecord_4930.getDefaultInstance()) {
               return this;
            } else {
               if (!other.awardList_.isEmpty()) {
                  if (this.awardList_.isEmpty()) {
                     this.awardList_ = other.awardList_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureAwardListIsMutable();
                     this.awardList_.addAll(other.awardList_);
                  }

                  this.onChanged();
               }

               if (other.hasActivityId()) {
                  this.setActivityId(other.getActivityId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasActivityId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_UpdateRecord_4930 parsedMessage = null;

            try {
               parsedMessage = (S2S_UpdateRecord_4930)DragonTreasureMsg.S2S_UpdateRecord_4930.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_UpdateRecord_4930)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureAwardListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.awardList_ = DragonTreasureMsg.S2S_UpdateRecord_4930.mutableCopy(this.awardList_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getAwardListList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.awardList_) : this.awardList_);
         }

         public int getAwardListCount() {
            return this.awardList_.size();
         }

         public int getAwardList(int index) {
            return this.awardList_.getInt(index);
         }

         public Builder setAwardList(int index, int value) {
            this.ensureAwardListIsMutable();
            this.awardList_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addAwardList(int value) {
            this.ensureAwardListIsMutable();
            this.awardList_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllAwardList(Iterable<? extends Integer> values) {
            this.ensureAwardListIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.awardList_);
            this.onChanged();
            return this;
         }

         public Builder clearAwardList() {
            this.awardList_ = DragonTreasureMsg.S2S_UpdateRecord_4930.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public boolean hasActivityId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getActivityId() {
            return this.activityId_;
         }

         public Builder setActivityId(int value) {
            this.bitField0_ |= 2;
            this.activityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityId() {
            this.bitField0_ &= -3;
            this.activityId_ = 0;
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

   public static final class S2S_UpdatePoint_4931 extends GeneratedMessageV3 implements S2S_UpdatePoint_4931OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ADDPOINT_FIELD_NUMBER = 1;
      private int addPoint_;
      public static final int ACTIVITYID_FIELD_NUMBER = 2;
      private int activityId_;
      public static final int ENDTIME_FIELD_NUMBER = 3;
      private int endTime_;
      public static final int ACTIVITYTYPE_FIELD_NUMBER = 4;
      private int activityType_;
      private byte memoizedIsInitialized;
      private static final S2S_UpdatePoint_4931 DEFAULT_INSTANCE = new S2S_UpdatePoint_4931();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_UpdatePoint_4931> PARSER = new AbstractParser<S2S_UpdatePoint_4931>() {
         public S2S_UpdatePoint_4931 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_UpdatePoint_4931(input, extensionRegistry);
         }
      };

      private S2S_UpdatePoint_4931(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_UpdatePoint_4931() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_UpdatePoint_4931();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_UpdatePoint_4931(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.addPoint_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.activityId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.endTime_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.activityType_ = input.readInt32();
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
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2S_UpdatePoint_4931_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2S_UpdatePoint_4931_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_UpdatePoint_4931.class, Builder.class);
      }

      public boolean hasAddPoint() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getAddPoint() {
         return this.addPoint_;
      }

      public boolean hasActivityId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getActivityId() {
         return this.activityId_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public boolean hasActivityType() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getActivityType() {
         return this.activityType_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasAddPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasActivityId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasActivityType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.addPoint_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.activityId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.endTime_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.activityType_);
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
               size += CodedOutputStream.computeInt32Size(1, this.addPoint_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.activityId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.endTime_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.activityType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_UpdatePoint_4931)) {
            return super.equals(obj);
         } else {
            S2S_UpdatePoint_4931 other = (S2S_UpdatePoint_4931)obj;
            if (this.hasAddPoint() != other.hasAddPoint()) {
               return false;
            } else if (this.hasAddPoint() && this.getAddPoint() != other.getAddPoint()) {
               return false;
            } else if (this.hasActivityId() != other.hasActivityId()) {
               return false;
            } else if (this.hasActivityId() && this.getActivityId() != other.getActivityId()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasActivityType() != other.hasActivityType()) {
               return false;
            } else if (this.hasActivityType() && this.getActivityType() != other.getActivityType()) {
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
            if (this.hasAddPoint()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAddPoint();
            }

            if (this.hasActivityId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getActivityId();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.hasActivityType()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getActivityType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_UpdatePoint_4931 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_UpdatePoint_4931)PARSER.parseFrom(data);
      }

      public static S2S_UpdatePoint_4931 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_UpdatePoint_4931)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_UpdatePoint_4931 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_UpdatePoint_4931)PARSER.parseFrom(data);
      }

      public static S2S_UpdatePoint_4931 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_UpdatePoint_4931)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_UpdatePoint_4931 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_UpdatePoint_4931)PARSER.parseFrom(data);
      }

      public static S2S_UpdatePoint_4931 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_UpdatePoint_4931)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_UpdatePoint_4931 parseFrom(InputStream input) throws IOException {
         return (S2S_UpdatePoint_4931)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_UpdatePoint_4931 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_UpdatePoint_4931)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_UpdatePoint_4931 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_UpdatePoint_4931)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_UpdatePoint_4931 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_UpdatePoint_4931)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_UpdatePoint_4931 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_UpdatePoint_4931)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_UpdatePoint_4931 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_UpdatePoint_4931)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_UpdatePoint_4931 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_UpdatePoint_4931 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_UpdatePoint_4931> parser() {
         return PARSER;
      }

      public Parser<S2S_UpdatePoint_4931> getParserForType() {
         return PARSER;
      }

      public S2S_UpdatePoint_4931 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_UpdatePoint_4931OrBuilder {
         private int bitField0_;
         private int addPoint_;
         private int activityId_;
         private int endTime_;
         private int activityType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2S_UpdatePoint_4931_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2S_UpdatePoint_4931_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_UpdatePoint_4931.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTreasureMsg.S2S_UpdatePoint_4931.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.addPoint_ = 0;
            this.bitField0_ &= -2;
            this.activityId_ = 0;
            this.bitField0_ &= -3;
            this.endTime_ = 0;
            this.bitField0_ &= -5;
            this.activityType_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2S_UpdatePoint_4931_descriptor;
         }

         public S2S_UpdatePoint_4931 getDefaultInstanceForType() {
            return DragonTreasureMsg.S2S_UpdatePoint_4931.getDefaultInstance();
         }

         public S2S_UpdatePoint_4931 build() {
            S2S_UpdatePoint_4931 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_UpdatePoint_4931 buildPartial() {
            S2S_UpdatePoint_4931 result = new S2S_UpdatePoint_4931(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.addPoint_ = this.addPoint_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.activityId_ = this.activityId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.activityType_ = this.activityType_;
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
            if (other instanceof S2S_UpdatePoint_4931) {
               return this.mergeFrom((S2S_UpdatePoint_4931)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_UpdatePoint_4931 other) {
            if (other == DragonTreasureMsg.S2S_UpdatePoint_4931.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasAddPoint()) {
                  this.setAddPoint(other.getAddPoint());
               }

               if (other.hasActivityId()) {
                  this.setActivityId(other.getActivityId());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasActivityType()) {
                  this.setActivityType(other.getActivityType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasAddPoint()) {
               return false;
            } else if (!this.hasActivityId()) {
               return false;
            } else if (!this.hasEndTime()) {
               return false;
            } else {
               return this.hasActivityType();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_UpdatePoint_4931 parsedMessage = null;

            try {
               parsedMessage = (S2S_UpdatePoint_4931)DragonTreasureMsg.S2S_UpdatePoint_4931.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_UpdatePoint_4931)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasAddPoint() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getAddPoint() {
            return this.addPoint_;
         }

         public Builder setAddPoint(int value) {
            this.bitField0_ |= 1;
            this.addPoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAddPoint() {
            this.bitField0_ &= -2;
            this.addPoint_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasActivityId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getActivityId() {
            return this.activityId_;
         }

         public Builder setActivityId(int value) {
            this.bitField0_ |= 2;
            this.activityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityId() {
            this.bitField0_ &= -3;
            this.activityId_ = 0;
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

         public boolean hasActivityType() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getActivityType() {
            return this.activityType_;
         }

         public Builder setActivityType(int value) {
            this.bitField0_ |= 8;
            this.activityType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityType() {
            this.bitField0_ &= -9;
            this.activityType_ = 0;
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

   public static final class S2S_NotifySendAward_4932 extends GeneratedMessageV3 implements S2S_NotifySendAward_4932OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int POINT_FIELD_NUMBER = 2;
      private int point_;
      private byte memoizedIsInitialized;
      private static final S2S_NotifySendAward_4932 DEFAULT_INSTANCE = new S2S_NotifySendAward_4932();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_NotifySendAward_4932> PARSER = new AbstractParser<S2S_NotifySendAward_4932>() {
         public S2S_NotifySendAward_4932 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_NotifySendAward_4932(input, extensionRegistry);
         }
      };

      private S2S_NotifySendAward_4932(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_NotifySendAward_4932() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_NotifySendAward_4932();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_NotifySendAward_4932(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rank_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.point_ = input.readInt32();
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
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2S_NotifySendAward_4932_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2S_NotifySendAward_4932_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_NotifySendAward_4932.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasPoint() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPoint() {
         return this.point_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.rank_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.point_);
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
               size += CodedOutputStream.computeInt32Size(1, this.rank_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.point_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_NotifySendAward_4932)) {
            return super.equals(obj);
         } else {
            S2S_NotifySendAward_4932 other = (S2S_NotifySendAward_4932)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasPoint() != other.hasPoint()) {
               return false;
            } else if (this.hasPoint() && this.getPoint() != other.getPoint()) {
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
            if (this.hasRank()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRank();
            }

            if (this.hasPoint()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPoint();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_NotifySendAward_4932 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_NotifySendAward_4932)PARSER.parseFrom(data);
      }

      public static S2S_NotifySendAward_4932 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_NotifySendAward_4932)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_NotifySendAward_4932 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_NotifySendAward_4932)PARSER.parseFrom(data);
      }

      public static S2S_NotifySendAward_4932 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_NotifySendAward_4932)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_NotifySendAward_4932 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_NotifySendAward_4932)PARSER.parseFrom(data);
      }

      public static S2S_NotifySendAward_4932 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_NotifySendAward_4932)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_NotifySendAward_4932 parseFrom(InputStream input) throws IOException {
         return (S2S_NotifySendAward_4932)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_NotifySendAward_4932 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_NotifySendAward_4932)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_NotifySendAward_4932 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_NotifySendAward_4932)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_NotifySendAward_4932 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_NotifySendAward_4932)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_NotifySendAward_4932 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_NotifySendAward_4932)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_NotifySendAward_4932 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_NotifySendAward_4932)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_NotifySendAward_4932 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_NotifySendAward_4932 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_NotifySendAward_4932> parser() {
         return PARSER;
      }

      public Parser<S2S_NotifySendAward_4932> getParserForType() {
         return PARSER;
      }

      public S2S_NotifySendAward_4932 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_NotifySendAward_4932OrBuilder {
         private int bitField0_;
         private int rank_;
         private int point_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2S_NotifySendAward_4932_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2S_NotifySendAward_4932_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_NotifySendAward_4932.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTreasureMsg.S2S_NotifySendAward_4932.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.point_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2S_NotifySendAward_4932_descriptor;
         }

         public S2S_NotifySendAward_4932 getDefaultInstanceForType() {
            return DragonTreasureMsg.S2S_NotifySendAward_4932.getDefaultInstance();
         }

         public S2S_NotifySendAward_4932 build() {
            S2S_NotifySendAward_4932 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_NotifySendAward_4932 buildPartial() {
            S2S_NotifySendAward_4932 result = new S2S_NotifySendAward_4932(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.point_ = this.point_;
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
            if (other instanceof S2S_NotifySendAward_4932) {
               return this.mergeFrom((S2S_NotifySendAward_4932)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_NotifySendAward_4932 other) {
            if (other == DragonTreasureMsg.S2S_NotifySendAward_4932.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasPoint()) {
                  this.setPoint(other.getPoint());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRank()) {
               return false;
            } else {
               return this.hasPoint();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_NotifySendAward_4932 parsedMessage = null;

            try {
               parsedMessage = (S2S_NotifySendAward_4932)DragonTreasureMsg.S2S_NotifySendAward_4932.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_NotifySendAward_4932)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRank() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRank() {
            return this.rank_;
         }

         public Builder setRank(int value) {
            this.bitField0_ |= 1;
            this.rank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRank() {
            this.bitField0_ &= -2;
            this.rank_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPoint() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPoint() {
            return this.point_;
         }

         public Builder setPoint(int value) {
            this.bitField0_ |= 2;
            this.point_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPoint() {
            this.bitField0_ &= -3;
            this.point_ = 0;
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

   public static final class S2S_BroadcastAward_4933 extends GeneratedMessageV3 implements S2S_BroadcastAward_4933OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2S_BroadcastAward_4933 DEFAULT_INSTANCE = new S2S_BroadcastAward_4933();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_BroadcastAward_4933> PARSER = new AbstractParser<S2S_BroadcastAward_4933>() {
         public S2S_BroadcastAward_4933 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_BroadcastAward_4933(input, extensionRegistry);
         }
      };

      private S2S_BroadcastAward_4933(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_BroadcastAward_4933() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_BroadcastAward_4933();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_BroadcastAward_4933(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2S_BroadcastAward_4933_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2S_BroadcastAward_4933_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_BroadcastAward_4933.class, Builder.class);
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
         } else if (!(obj instanceof S2S_BroadcastAward_4933)) {
            return super.equals(obj);
         } else {
            S2S_BroadcastAward_4933 other = (S2S_BroadcastAward_4933)obj;
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

      public static S2S_BroadcastAward_4933 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_BroadcastAward_4933)PARSER.parseFrom(data);
      }

      public static S2S_BroadcastAward_4933 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_BroadcastAward_4933)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_BroadcastAward_4933 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_BroadcastAward_4933)PARSER.parseFrom(data);
      }

      public static S2S_BroadcastAward_4933 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_BroadcastAward_4933)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_BroadcastAward_4933 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_BroadcastAward_4933)PARSER.parseFrom(data);
      }

      public static S2S_BroadcastAward_4933 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_BroadcastAward_4933)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_BroadcastAward_4933 parseFrom(InputStream input) throws IOException {
         return (S2S_BroadcastAward_4933)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_BroadcastAward_4933 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_BroadcastAward_4933)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_BroadcastAward_4933 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_BroadcastAward_4933)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_BroadcastAward_4933 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_BroadcastAward_4933)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_BroadcastAward_4933 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_BroadcastAward_4933)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_BroadcastAward_4933 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_BroadcastAward_4933)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_BroadcastAward_4933 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_BroadcastAward_4933 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_BroadcastAward_4933> parser() {
         return PARSER;
      }

      public Parser<S2S_BroadcastAward_4933> getParserForType() {
         return PARSER;
      }

      public S2S_BroadcastAward_4933 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_BroadcastAward_4933OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2S_BroadcastAward_4933_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2S_BroadcastAward_4933_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_BroadcastAward_4933.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DragonTreasureMsg.S2S_BroadcastAward_4933.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DragonTreasureMsg.internal_static_dragonTreasure_com_gzbz_protobuf_S2S_BroadcastAward_4933_descriptor;
         }

         public S2S_BroadcastAward_4933 getDefaultInstanceForType() {
            return DragonTreasureMsg.S2S_BroadcastAward_4933.getDefaultInstance();
         }

         public S2S_BroadcastAward_4933 build() {
            S2S_BroadcastAward_4933 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_BroadcastAward_4933 buildPartial() {
            S2S_BroadcastAward_4933 result = new S2S_BroadcastAward_4933(this);
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
            if (other instanceof S2S_BroadcastAward_4933) {
               return this.mergeFrom((S2S_BroadcastAward_4933)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_BroadcastAward_4933 other) {
            if (other == DragonTreasureMsg.S2S_BroadcastAward_4933.getDefaultInstance()) {
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
            S2S_BroadcastAward_4933 parsedMessage = null;

            try {
               parsedMessage = (S2S_BroadcastAward_4933)DragonTreasureMsg.S2S_BroadcastAward_4933.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_BroadcastAward_4933)e.getUnfinishedMessage();
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

   public interface AwardPoolOrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      int getPosition();

      boolean hasAwardId();

      int getAwardId();

      boolean hasEnd();

      boolean getEnd();
   }

   public interface C2S_DragonTreasureInfo_4901OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_PointRank_4907OrBuilder extends MessageOrBuilder {
      boolean hasActivityId();

      int getActivityId();
   }

   public interface C2S_ReceiveBoxAward_4909OrBuilder extends MessageOrBuilder {
      boolean hasLuckPoint();

      int getLuckPoint();
   }

   public interface C2S_RecruitAward_4903OrBuilder extends MessageOrBuilder {
      boolean hasRecruitType();

      int getRecruitType();
   }

   public interface C2S_RefreshPool_4905OrBuilder extends MessageOrBuilder {
   }

   public interface RankDataOrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasServerId();

      int getServerId();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasHead();

      int getHead();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasLv();

      int getLv();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasScore();

      int getScore();
   }

   public interface RecruitRecordOrBuilder extends MessageOrBuilder {
      boolean hasServerId();

      int getServerId();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasAwardId();

      int getAwardId();

      boolean hasBroadcast();

      boolean getBroadcast();
   }

   public interface S2C_DragonTreasureInfo_4902OrBuilder extends MessageOrBuilder {
      List<AwardPool> getAwardPoolList();

      AwardPool getAwardPool(int index);

      int getAwardPoolCount();

      List<? extends AwardPoolOrBuilder> getAwardPoolOrBuilderList();

      AwardPoolOrBuilder getAwardPoolOrBuilder(int index);

      boolean hasLuckyPoint();

      int getLuckyPoint();

      boolean hasAddMoney();

      int getAddMoney();

      boolean hasGoldNum();

      int getGoldNum();

      boolean hasPropNum();

      int getPropNum();

      boolean hasRefreshNum();

      int getRefreshNum();

      List<RecruitRecord> getMyRecordList();

      RecruitRecord getMyRecord(int index);

      int getMyRecordCount();

      List<? extends RecruitRecordOrBuilder> getMyRecordOrBuilderList();

      RecruitRecordOrBuilder getMyRecordOrBuilder(int index);

      List<RecruitRecord> getAllRecordList();

      RecruitRecord getAllRecord(int index);

      int getAllRecordCount();

      List<? extends RecruitRecordOrBuilder> getAllRecordOrBuilderList();

      RecruitRecordOrBuilder getAllRecordOrBuilder(int index);

      List<RankData> getRanksList();

      RankData getRanks(int index);

      int getRanksCount();

      List<? extends RankDataOrBuilder> getRanksOrBuilderList();

      RankDataOrBuilder getRanksOrBuilder(int index);

      List<CommonMsg.MapDataII> getAwardListList();

      CommonMsg.MapDataII getAwardList(int index);

      int getAwardListCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getAwardListOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getAwardListOrBuilder(int index);

      List<Integer> getReceiveBoxList();

      int getReceiveBoxCount();

      int getReceiveBox(int index);

      boolean hasMyRank();

      int getMyRank();

      boolean hasActivityId();

      int getActivityId();

      boolean hasEndTime();

      int getEndTime();

      boolean hasAheadTime();

      int getAheadTime();

      boolean hasActivityType();

      int getActivityType();
   }

   public interface S2C_PointRank_4908OrBuilder extends MessageOrBuilder {
      boolean hasMyRank();

      RankData getMyRank();

      RankDataOrBuilder getMyRankOrBuilder();

      List<RankData> getRanksList();

      RankData getRanks(int index);

      int getRanksCount();

      List<? extends RankDataOrBuilder> getRanksOrBuilderList();

      RankDataOrBuilder getRanksOrBuilder(int index);
   }

   public interface S2C_ReceiveBoxAward_4910OrBuilder extends MessageOrBuilder {
      List<Integer> getReceiveBoxList();

      int getReceiveBoxCount();

      int getReceiveBox(int index);
   }

   public interface S2C_RecruitAward_4904OrBuilder extends MessageOrBuilder {
      boolean hasRecruitType();

      int getRecruitType();
   }

   public interface S2C_RefreshPool_4906OrBuilder extends MessageOrBuilder {
      boolean hasRefreshNum();

      int getRefreshNum();

      List<AwardPool> getAwardPoolList();

      AwardPool getAwardPool(int index);

      int getAwardPoolCount();

      List<? extends AwardPoolOrBuilder> getAwardPoolOrBuilderList();

      AwardPoolOrBuilder getAwardPoolOrBuilder(int index);
   }

   public interface S2S_BroadcastAward_4933OrBuilder extends MessageOrBuilder {
   }

   public interface S2S_NotifySendAward_4932OrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasPoint();

      int getPoint();
   }

   public interface S2S_UpdatePoint_4931OrBuilder extends MessageOrBuilder {
      boolean hasAddPoint();

      int getAddPoint();

      boolean hasActivityId();

      int getActivityId();

      boolean hasEndTime();

      int getEndTime();

      boolean hasActivityType();

      int getActivityType();
   }

   public interface S2S_UpdateRecord_4930OrBuilder extends MessageOrBuilder {
      List<Integer> getAwardListList();

      int getAwardListCount();

      int getAwardList(int index);

      boolean hasActivityId();

      int getActivityId();
   }
}
