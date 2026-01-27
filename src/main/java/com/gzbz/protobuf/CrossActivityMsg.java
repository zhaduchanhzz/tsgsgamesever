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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
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

public final class CrossActivityMsg {
   private static final Descriptors.Descriptor internal_static_crossActivity_com_gzbz_protobuf_S2CR_ActivityUpload_13101_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossActivity_com_gzbz_protobuf_S2CR_ActivityUpload_13101_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossActivity_com_gzbz_protobuf_CR2S_ActivitySettle_13102_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossActivity_com_gzbz_protobuf_CR2S_ActivitySettle_13102_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossActivity_com_gzbz_protobuf_ActivityRank_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossActivity_com_gzbz_protobuf_ActivityRank_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossActivity_com_gzbz_protobuf_PlayerActRankInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossActivity_com_gzbz_protobuf_PlayerActRankInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossActivity_com_gzbz_protobuf_S2CR_ActivityGm_13103_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossActivity_com_gzbz_protobuf_S2CR_ActivityGm_13103_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossActivity_com_gzbz_protobuf_S2CR_DecisiveActivityUpload_13104_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossActivity_com_gzbz_protobuf_S2CR_DecisiveActivityUpload_13104_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossActivity_com_gzbz_protobuf_CR2S_NoticeCrossActOpenDay_13105_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossActivity_com_gzbz_protobuf_CR2S_NoticeCrossActOpenDay_13105_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossActivity_com_gzbz_protobuf_CR2S_FlowerRankInfo_13106_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossActivity_com_gzbz_protobuf_CR2S_FlowerRankInfo_13106_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossActivity_com_gzbz_protobuf_S2CR_BroodActivityUpload_13107_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossActivity_com_gzbz_protobuf_S2CR_BroodActivityUpload_13107_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodActivitySettle_13108_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodActivitySettle_13108_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodRankInfo_13109_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodRankInfo_13109_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossActivity_com_gzbz_protobuf_S2CR_Activity8Upload_13110_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossActivity_com_gzbz_protobuf_S2CR_Activity8Upload_13110_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossActivity_com_gzbz_protobuf_S2CR_UpdateBroodRankScroe_13111_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossActivity_com_gzbz_protobuf_S2CR_UpdateBroodRankScroe_13111_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodActivityInfo_13112_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodActivityInfo_13112_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodRankScoreUpdate_13113_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodRankScoreUpdate_13113_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossActivity_com_gzbz_protobuf_S2CR_BroodSettleTest_13114_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossActivity_com_gzbz_protobuf_S2CR_BroodSettleTest_13114_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodUnlockPoolNotify_13115_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodUnlockPoolNotify_13115_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private CrossActivityMsg() {
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
      String[] descriptorData = new String[]{"\n\u0013CrossActivity.proto\u0012\u001fcrossActivity.com.gzbz.protobuf\u001a\fcommon.proto\"h\n\u0019S2CR_ActivityUpload_13101\u0012\u0014\n\factivityType\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bdropTime\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0003 \u0002(\u0005\u0012\u0012\n\nactOpenDay\u0018\u0004 \u0001(\u0005\"\u009c\u0001\n\u0019CR2S_ActivitySettle_13102\u0012\u0014\n\factivityType\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0002 \u0002(\u0005\u0012C\n\factivityRank\u0018\u0003 \u0003(\u000b2-.crossActivity.com.gzbz.protobuf.ActivityRank\u0012\u0013\n\u000bcrossChange\u0018\u0004 \u0001(\b\"b\n\fActivityRank\u0012\u0010\n\brankType\u0018\u0001 \u0002(\u0005\u0012@\n\u0004rank\u0018\u0002 \u0003(\u000b22.crossActivity.com.gzbz.protobuf.PlayerActRankInfo\"V\n\u0011PlayerActRankInfo\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004rank\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005score\u0018\u0003 \u0002(\u0003\u0012\u0012\n\nplayerName\u0018\u0004 \u0001(\t\"4\n\u0015S2CR_ActivityGm_13103\u0012\u000b\n\u0003cmd\u0018\u0001 \u0002(\t\u0012\u000e\n\u0006params\u0018\u0002 \u0003(\u0005\"\\\n!S2CR_DecisiveActivityUpload_13104\u0012\u0014\n\factivityType\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bdropTime\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0003 \u0002(\u0005\"f\n CR2S_NoticeCrossActOpenDay_13105\u0012\u0014\n\factivityType\u0018\u0001 \u0002(\u0005\u0012\u0017\n\u000fcrossActOpenDay\u0018\u0002 \u0002(\u0005\u0012\u0013\n\u000bjoinServers\u0018\u0003 \u0003(\u0005\"`\n\u0019CR2S_FlowerRankInfo_13106\u0012C\n\factivityRank\u0018\u0001 \u0003(\u000b2-.crossActivity.com.gzbz.protobuf.ActivityRank\"Y\n\u001eS2CR_BroodActivityUpload_13107\u0012\u0014\n\factivityType\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bdropTime\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0003 \u0002(\u0005\"\u0087\u0002\n\u001eCR2S_BroodActivitySettle_13108\u0012\u0014\n\factivityType\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0002 \u0002(\u0005\u0012\u0013\n\u000bcrossChange\u0018\u0003 \u0001(\b\u0012A\n\nserverRank\u0018\u0004 \u0002(\u000b2-.crossActivity.com.gzbz.protobuf.ActivityRank\u0012>\n\u0007tenRank\u0018\u0005 \u0002(\u000b2-.crossActivity.com.gzbz.protobuf.ActivityRank\u0012\u0014\n\fcrossOpenDay\u0018\u0006 \u0002(\u0005\u0012\u0010\n\bpoolType\u0018\u0007 \u0002(\u0005\"_\n\u0018CR2S_BroodRankInfo_13109\u0012\u0012\n\nactivityId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bmoduleId\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006params\u0018\u0003 \u0003(\t\u0012\r\n\u0005limit\u0018\u0004 \u0001(\u0005\"i\n\u001aS2CR_Activity8Upload_13110\u0012\u0014\n\factivityType\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bdropTime\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0003 \u0002(\u0005\u0012\u0012\n\nactOpenDay\u0018\u0004 \u0001(\u0005\"n\n\u001fS2CR_UpdateBroodRankScroe_13111\u0012\u0012\n\nactivityId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0002 \u0002(\u0005\u0012\u0014\n\factivityType\u0018\u0003 \u0002(\u0005\u0012\u0010\n\bendScore\u0018\u0004 \u0002(\u0005\"G\n\u001cCR2S_BroodActivityInfo_13112\u0012\u0012\n\ntotalScore\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bjoinServers\u0018\u0002 \u0003(\u0005\"5\n\u001fCR2S_BroodRankScoreUpdate_13113\u0012\u0012\n\ntotalScore\u0018\u0001 \u0002(\u0005\"*\n\u001aS2CR_BroodSettleTest_13114\u0012\f\n\u0004type\u0018\u0001 \u0002(\t\"L\n CR2S_BroodUnlockPoolNotify_13115\u0012\u0013\n\u000boldPoolType\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bnewPoolType\u0018\u0002 \u0002(\u0005B'\n\u0011com.gzbz.protobufB\u0010CrossActivityMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_crossActivity_com_gzbz_protobuf_S2CR_ActivityUpload_13101_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_crossActivity_com_gzbz_protobuf_S2CR_ActivityUpload_13101_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossActivity_com_gzbz_protobuf_S2CR_ActivityUpload_13101_descriptor, new String[]{"ActivityType", "DropTime", "EndTime", "ActOpenDay"});
      internal_static_crossActivity_com_gzbz_protobuf_CR2S_ActivitySettle_13102_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_crossActivity_com_gzbz_protobuf_CR2S_ActivitySettle_13102_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossActivity_com_gzbz_protobuf_CR2S_ActivitySettle_13102_descriptor, new String[]{"ActivityType", "EndTime", "ActivityRank", "CrossChange"});
      internal_static_crossActivity_com_gzbz_protobuf_ActivityRank_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_crossActivity_com_gzbz_protobuf_ActivityRank_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossActivity_com_gzbz_protobuf_ActivityRank_descriptor, new String[]{"RankType", "Rank"});
      internal_static_crossActivity_com_gzbz_protobuf_PlayerActRankInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_crossActivity_com_gzbz_protobuf_PlayerActRankInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossActivity_com_gzbz_protobuf_PlayerActRankInfo_descriptor, new String[]{"PlayerId", "Rank", "Score", "PlayerName"});
      internal_static_crossActivity_com_gzbz_protobuf_S2CR_ActivityGm_13103_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_crossActivity_com_gzbz_protobuf_S2CR_ActivityGm_13103_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossActivity_com_gzbz_protobuf_S2CR_ActivityGm_13103_descriptor, new String[]{"Cmd", "Params"});
      internal_static_crossActivity_com_gzbz_protobuf_S2CR_DecisiveActivityUpload_13104_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_crossActivity_com_gzbz_protobuf_S2CR_DecisiveActivityUpload_13104_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossActivity_com_gzbz_protobuf_S2CR_DecisiveActivityUpload_13104_descriptor, new String[]{"ActivityType", "DropTime", "EndTime"});
      internal_static_crossActivity_com_gzbz_protobuf_CR2S_NoticeCrossActOpenDay_13105_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_crossActivity_com_gzbz_protobuf_CR2S_NoticeCrossActOpenDay_13105_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossActivity_com_gzbz_protobuf_CR2S_NoticeCrossActOpenDay_13105_descriptor, new String[]{"ActivityType", "CrossActOpenDay", "JoinServers"});
      internal_static_crossActivity_com_gzbz_protobuf_CR2S_FlowerRankInfo_13106_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_crossActivity_com_gzbz_protobuf_CR2S_FlowerRankInfo_13106_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossActivity_com_gzbz_protobuf_CR2S_FlowerRankInfo_13106_descriptor, new String[]{"ActivityRank"});
      internal_static_crossActivity_com_gzbz_protobuf_S2CR_BroodActivityUpload_13107_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_crossActivity_com_gzbz_protobuf_S2CR_BroodActivityUpload_13107_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossActivity_com_gzbz_protobuf_S2CR_BroodActivityUpload_13107_descriptor, new String[]{"ActivityType", "DropTime", "EndTime"});
      internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodActivitySettle_13108_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodActivitySettle_13108_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodActivitySettle_13108_descriptor, new String[]{"ActivityType", "EndTime", "CrossChange", "ServerRank", "TenRank", "CrossOpenDay", "PoolType"});
      internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodRankInfo_13109_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodRankInfo_13109_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodRankInfo_13109_descriptor, new String[]{"ActivityId", "ModuleId", "Params", "Limit"});
      internal_static_crossActivity_com_gzbz_protobuf_S2CR_Activity8Upload_13110_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_crossActivity_com_gzbz_protobuf_S2CR_Activity8Upload_13110_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossActivity_com_gzbz_protobuf_S2CR_Activity8Upload_13110_descriptor, new String[]{"ActivityType", "DropTime", "EndTime", "ActOpenDay"});
      internal_static_crossActivity_com_gzbz_protobuf_S2CR_UpdateBroodRankScroe_13111_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_crossActivity_com_gzbz_protobuf_S2CR_UpdateBroodRankScroe_13111_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossActivity_com_gzbz_protobuf_S2CR_UpdateBroodRankScroe_13111_descriptor, new String[]{"ActivityId", "EndTime", "ActivityType", "EndScore"});
      internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodActivityInfo_13112_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodActivityInfo_13112_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodActivityInfo_13112_descriptor, new String[]{"TotalScore", "JoinServers"});
      internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodRankScoreUpdate_13113_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodRankScoreUpdate_13113_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodRankScoreUpdate_13113_descriptor, new String[]{"TotalScore"});
      internal_static_crossActivity_com_gzbz_protobuf_S2CR_BroodSettleTest_13114_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_crossActivity_com_gzbz_protobuf_S2CR_BroodSettleTest_13114_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossActivity_com_gzbz_protobuf_S2CR_BroodSettleTest_13114_descriptor, new String[]{"Type"});
      internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodUnlockPoolNotify_13115_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodUnlockPoolNotify_13115_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodUnlockPoolNotify_13115_descriptor, new String[]{"OldPoolType", "NewPoolType"});
      CommonMsg.getDescriptor();
   }

   public static final class S2CR_ActivityUpload_13101 extends GeneratedMessageV3 implements S2CR_ActivityUpload_13101OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYTYPE_FIELD_NUMBER = 1;
      private int activityType_;
      public static final int DROPTIME_FIELD_NUMBER = 2;
      private int dropTime_;
      public static final int ENDTIME_FIELD_NUMBER = 3;
      private int endTime_;
      public static final int ACTOPENDAY_FIELD_NUMBER = 4;
      private int actOpenDay_;
      private byte memoizedIsInitialized;
      private static final S2CR_ActivityUpload_13101 DEFAULT_INSTANCE = new S2CR_ActivityUpload_13101();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_ActivityUpload_13101> PARSER = new AbstractParser<S2CR_ActivityUpload_13101>() {
         public S2CR_ActivityUpload_13101 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_ActivityUpload_13101(input, extensionRegistry);
         }
      };

      private S2CR_ActivityUpload_13101(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_ActivityUpload_13101() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_ActivityUpload_13101();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_ActivityUpload_13101(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.dropTime_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.endTime_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.actOpenDay_ = input.readInt32();
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
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_ActivityUpload_13101_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_ActivityUpload_13101_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ActivityUpload_13101.class, Builder.class);
      }

      public boolean hasActivityType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityType() {
         return this.activityType_;
      }

      public boolean hasDropTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDropTime() {
         return this.dropTime_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public boolean hasActOpenDay() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getActOpenDay() {
         return this.actOpenDay_;
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
         } else if (!this.hasDropTime()) {
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
            output.writeInt32(2, this.dropTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.endTime_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.actOpenDay_);
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
               size += CodedOutputStream.computeInt32Size(2, this.dropTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.endTime_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.actOpenDay_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_ActivityUpload_13101)) {
            return super.equals(obj);
         } else {
            S2CR_ActivityUpload_13101 other = (S2CR_ActivityUpload_13101)obj;
            if (this.hasActivityType() != other.hasActivityType()) {
               return false;
            } else if (this.hasActivityType() && this.getActivityType() != other.getActivityType()) {
               return false;
            } else if (this.hasDropTime() != other.hasDropTime()) {
               return false;
            } else if (this.hasDropTime() && this.getDropTime() != other.getDropTime()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasActOpenDay() != other.hasActOpenDay()) {
               return false;
            } else if (this.hasActOpenDay() && this.getActOpenDay() != other.getActOpenDay()) {
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

            if (this.hasDropTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDropTime();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.hasActOpenDay()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getActOpenDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_ActivityUpload_13101 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_ActivityUpload_13101)PARSER.parseFrom(data);
      }

      public static S2CR_ActivityUpload_13101 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ActivityUpload_13101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ActivityUpload_13101 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_ActivityUpload_13101)PARSER.parseFrom(data);
      }

      public static S2CR_ActivityUpload_13101 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ActivityUpload_13101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ActivityUpload_13101 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_ActivityUpload_13101)PARSER.parseFrom(data);
      }

      public static S2CR_ActivityUpload_13101 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ActivityUpload_13101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ActivityUpload_13101 parseFrom(InputStream input) throws IOException {
         return (S2CR_ActivityUpload_13101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ActivityUpload_13101 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ActivityUpload_13101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ActivityUpload_13101 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_ActivityUpload_13101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_ActivityUpload_13101 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ActivityUpload_13101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ActivityUpload_13101 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_ActivityUpload_13101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ActivityUpload_13101 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ActivityUpload_13101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_ActivityUpload_13101 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_ActivityUpload_13101 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_ActivityUpload_13101> parser() {
         return PARSER;
      }

      public Parser<S2CR_ActivityUpload_13101> getParserForType() {
         return PARSER;
      }

      public S2CR_ActivityUpload_13101 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_ActivityUpload_13101OrBuilder {
         private int bitField0_;
         private int activityType_;
         private int dropTime_;
         private int endTime_;
         private int actOpenDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_ActivityUpload_13101_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_ActivityUpload_13101_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ActivityUpload_13101.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossActivityMsg.S2CR_ActivityUpload_13101.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityType_ = 0;
            this.bitField0_ &= -2;
            this.dropTime_ = 0;
            this.bitField0_ &= -3;
            this.endTime_ = 0;
            this.bitField0_ &= -5;
            this.actOpenDay_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_ActivityUpload_13101_descriptor;
         }

         public S2CR_ActivityUpload_13101 getDefaultInstanceForType() {
            return CrossActivityMsg.S2CR_ActivityUpload_13101.getDefaultInstance();
         }

         public S2CR_ActivityUpload_13101 build() {
            S2CR_ActivityUpload_13101 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_ActivityUpload_13101 buildPartial() {
            S2CR_ActivityUpload_13101 result = new S2CR_ActivityUpload_13101(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityType_ = this.activityType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.dropTime_ = this.dropTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.actOpenDay_ = this.actOpenDay_;
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
            if (other instanceof S2CR_ActivityUpload_13101) {
               return this.mergeFrom((S2CR_ActivityUpload_13101)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_ActivityUpload_13101 other) {
            if (other == CrossActivityMsg.S2CR_ActivityUpload_13101.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityType()) {
                  this.setActivityType(other.getActivityType());
               }

               if (other.hasDropTime()) {
                  this.setDropTime(other.getDropTime());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasActOpenDay()) {
                  this.setActOpenDay(other.getActOpenDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActivityType()) {
               return false;
            } else if (!this.hasDropTime()) {
               return false;
            } else {
               return this.hasEndTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_ActivityUpload_13101 parsedMessage = null;

            try {
               parsedMessage = (S2CR_ActivityUpload_13101)CrossActivityMsg.S2CR_ActivityUpload_13101.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_ActivityUpload_13101)e.getUnfinishedMessage();
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

         public boolean hasDropTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDropTime() {
            return this.dropTime_;
         }

         public Builder setDropTime(int value) {
            this.bitField0_ |= 2;
            this.dropTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDropTime() {
            this.bitField0_ &= -3;
            this.dropTime_ = 0;
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

         public boolean hasActOpenDay() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getActOpenDay() {
            return this.actOpenDay_;
         }

         public Builder setActOpenDay(int value) {
            this.bitField0_ |= 8;
            this.actOpenDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActOpenDay() {
            this.bitField0_ &= -9;
            this.actOpenDay_ = 0;
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

   public static final class CR2S_ActivitySettle_13102 extends GeneratedMessageV3 implements CR2S_ActivitySettle_13102OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYTYPE_FIELD_NUMBER = 1;
      private int activityType_;
      public static final int ENDTIME_FIELD_NUMBER = 2;
      private int endTime_;
      public static final int ACTIVITYRANK_FIELD_NUMBER = 3;
      private List<ActivityRank> activityRank_;
      public static final int CROSSCHANGE_FIELD_NUMBER = 4;
      private boolean crossChange_;
      private byte memoizedIsInitialized;
      private static final CR2S_ActivitySettle_13102 DEFAULT_INSTANCE = new CR2S_ActivitySettle_13102();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_ActivitySettle_13102> PARSER = new AbstractParser<CR2S_ActivitySettle_13102>() {
         public CR2S_ActivitySettle_13102 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_ActivitySettle_13102(input, extensionRegistry);
         }
      };

      private CR2S_ActivitySettle_13102(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_ActivitySettle_13102() {
         this.memoizedIsInitialized = -1;
         this.activityRank_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_ActivitySettle_13102();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_ActivitySettle_13102(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.endTime_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.activityRank_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.activityRank_.add(input.readMessage(CrossActivityMsg.ActivityRank.PARSER, extensionRegistry));
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.crossChange_ = input.readBool();
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
                  this.activityRank_ = Collections.unmodifiableList(this.activityRank_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_ActivitySettle_13102_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_ActivitySettle_13102_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ActivitySettle_13102.class, Builder.class);
      }

      public boolean hasActivityType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityType() {
         return this.activityType_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public List<ActivityRank> getActivityRankList() {
         return this.activityRank_;
      }

      public List<? extends ActivityRankOrBuilder> getActivityRankOrBuilderList() {
         return this.activityRank_;
      }

      public int getActivityRankCount() {
         return this.activityRank_.size();
      }

      public ActivityRank getActivityRank(int index) {
         return (ActivityRank)this.activityRank_.get(index);
      }

      public ActivityRankOrBuilder getActivityRankOrBuilder(int index) {
         return (ActivityRankOrBuilder)this.activityRank_.get(index);
      }

      public boolean hasCrossChange() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getCrossChange() {
         return this.crossChange_;
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
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getActivityRankCount(); ++i) {
               if (!this.getActivityRank(i).isInitialized()) {
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
            output.writeInt32(1, this.activityType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.endTime_);
         }

         for(int i = 0; i < this.activityRank_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.activityRank_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(4, this.crossChange_);
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
               size += CodedOutputStream.computeInt32Size(2, this.endTime_);
            }

            for(int i = 0; i < this.activityRank_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.activityRank_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.crossChange_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_ActivitySettle_13102)) {
            return super.equals(obj);
         } else {
            CR2S_ActivitySettle_13102 other = (CR2S_ActivitySettle_13102)obj;
            if (this.hasActivityType() != other.hasActivityType()) {
               return false;
            } else if (this.hasActivityType() && this.getActivityType() != other.getActivityType()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (!this.getActivityRankList().equals(other.getActivityRankList())) {
               return false;
            } else if (this.hasCrossChange() != other.hasCrossChange()) {
               return false;
            } else if (this.hasCrossChange() && this.getCrossChange() != other.getCrossChange()) {
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

            if (this.hasEndTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.getActivityRankCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getActivityRankList().hashCode();
            }

            if (this.hasCrossChange()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getCrossChange());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_ActivitySettle_13102 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_ActivitySettle_13102)PARSER.parseFrom(data);
      }

      public static CR2S_ActivitySettle_13102 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ActivitySettle_13102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ActivitySettle_13102 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_ActivitySettle_13102)PARSER.parseFrom(data);
      }

      public static CR2S_ActivitySettle_13102 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ActivitySettle_13102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ActivitySettle_13102 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_ActivitySettle_13102)PARSER.parseFrom(data);
      }

      public static CR2S_ActivitySettle_13102 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ActivitySettle_13102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ActivitySettle_13102 parseFrom(InputStream input) throws IOException {
         return (CR2S_ActivitySettle_13102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ActivitySettle_13102 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ActivitySettle_13102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ActivitySettle_13102 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_ActivitySettle_13102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_ActivitySettle_13102 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ActivitySettle_13102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ActivitySettle_13102 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_ActivitySettle_13102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ActivitySettle_13102 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ActivitySettle_13102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_ActivitySettle_13102 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_ActivitySettle_13102 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_ActivitySettle_13102> parser() {
         return PARSER;
      }

      public Parser<CR2S_ActivitySettle_13102> getParserForType() {
         return PARSER;
      }

      public CR2S_ActivitySettle_13102 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_ActivitySettle_13102OrBuilder {
         private int bitField0_;
         private int activityType_;
         private int endTime_;
         private List<ActivityRank> activityRank_;
         private RepeatedFieldBuilderV3<ActivityRank, ActivityRank.Builder, ActivityRankOrBuilder> activityRankBuilder_;
         private boolean crossChange_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_ActivitySettle_13102_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_ActivitySettle_13102_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ActivitySettle_13102.class, Builder.class);
         }

         private Builder() {
            this.activityRank_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.activityRank_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossActivityMsg.CR2S_ActivitySettle_13102.alwaysUseFieldBuilders) {
               this.getActivityRankFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.activityType_ = 0;
            this.bitField0_ &= -2;
            this.endTime_ = 0;
            this.bitField0_ &= -3;
            if (this.activityRankBuilder_ == null) {
               this.activityRank_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.activityRankBuilder_.clear();
            }

            this.crossChange_ = false;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_ActivitySettle_13102_descriptor;
         }

         public CR2S_ActivitySettle_13102 getDefaultInstanceForType() {
            return CrossActivityMsg.CR2S_ActivitySettle_13102.getDefaultInstance();
         }

         public CR2S_ActivitySettle_13102 build() {
            CR2S_ActivitySettle_13102 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_ActivitySettle_13102 buildPartial() {
            CR2S_ActivitySettle_13102 result = new CR2S_ActivitySettle_13102(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityType_ = this.activityType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 2;
            }

            if (this.activityRankBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.activityRank_ = Collections.unmodifiableList(this.activityRank_);
                  this.bitField0_ &= -5;
               }

               result.activityRank_ = this.activityRank_;
            } else {
               result.activityRank_ = this.activityRankBuilder_.build();
            }

            if ((from_bitField0_ & 8) != 0) {
               result.crossChange_ = this.crossChange_;
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
            if (other instanceof CR2S_ActivitySettle_13102) {
               return this.mergeFrom((CR2S_ActivitySettle_13102)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_ActivitySettle_13102 other) {
            if (other == CrossActivityMsg.CR2S_ActivitySettle_13102.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityType()) {
                  this.setActivityType(other.getActivityType());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (this.activityRankBuilder_ == null) {
                  if (!other.activityRank_.isEmpty()) {
                     if (this.activityRank_.isEmpty()) {
                        this.activityRank_ = other.activityRank_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureActivityRankIsMutable();
                        this.activityRank_.addAll(other.activityRank_);
                     }

                     this.onChanged();
                  }
               } else if (!other.activityRank_.isEmpty()) {
                  if (this.activityRankBuilder_.isEmpty()) {
                     this.activityRankBuilder_.dispose();
                     this.activityRankBuilder_ = null;
                     this.activityRank_ = other.activityRank_;
                     this.bitField0_ &= -5;
                     this.activityRankBuilder_ = CrossActivityMsg.CR2S_ActivitySettle_13102.alwaysUseFieldBuilders ? this.getActivityRankFieldBuilder() : null;
                  } else {
                     this.activityRankBuilder_.addAllMessages(other.activityRank_);
                  }
               }

               if (other.hasCrossChange()) {
                  this.setCrossChange(other.getCrossChange());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActivityType()) {
               return false;
            } else if (!this.hasEndTime()) {
               return false;
            } else {
               for(int i = 0; i < this.getActivityRankCount(); ++i) {
                  if (!this.getActivityRank(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_ActivitySettle_13102 parsedMessage = null;

            try {
               parsedMessage = (CR2S_ActivitySettle_13102)CrossActivityMsg.CR2S_ActivitySettle_13102.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_ActivitySettle_13102)e.getUnfinishedMessage();
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

         private void ensureActivityRankIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.activityRank_ = new ArrayList(this.activityRank_);
               this.bitField0_ |= 4;
            }

         }

         public List<ActivityRank> getActivityRankList() {
            return this.activityRankBuilder_ == null ? Collections.unmodifiableList(this.activityRank_) : this.activityRankBuilder_.getMessageList();
         }

         public int getActivityRankCount() {
            return this.activityRankBuilder_ == null ? this.activityRank_.size() : this.activityRankBuilder_.getCount();
         }

         public ActivityRank getActivityRank(int index) {
            return this.activityRankBuilder_ == null ? (ActivityRank)this.activityRank_.get(index) : (ActivityRank)this.activityRankBuilder_.getMessage(index);
         }

         public Builder setActivityRank(int index, ActivityRank value) {
            if (this.activityRankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureActivityRankIsMutable();
               this.activityRank_.set(index, value);
               this.onChanged();
            } else {
               this.activityRankBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setActivityRank(int index, ActivityRank.Builder builderForValue) {
            if (this.activityRankBuilder_ == null) {
               this.ensureActivityRankIsMutable();
               this.activityRank_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.activityRankBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addActivityRank(ActivityRank value) {
            if (this.activityRankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureActivityRankIsMutable();
               this.activityRank_.add(value);
               this.onChanged();
            } else {
               this.activityRankBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addActivityRank(int index, ActivityRank value) {
            if (this.activityRankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureActivityRankIsMutable();
               this.activityRank_.add(index, value);
               this.onChanged();
            } else {
               this.activityRankBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addActivityRank(ActivityRank.Builder builderForValue) {
            if (this.activityRankBuilder_ == null) {
               this.ensureActivityRankIsMutable();
               this.activityRank_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.activityRankBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addActivityRank(int index, ActivityRank.Builder builderForValue) {
            if (this.activityRankBuilder_ == null) {
               this.ensureActivityRankIsMutable();
               this.activityRank_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.activityRankBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllActivityRank(Iterable<? extends ActivityRank> values) {
            if (this.activityRankBuilder_ == null) {
               this.ensureActivityRankIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.activityRank_);
               this.onChanged();
            } else {
               this.activityRankBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearActivityRank() {
            if (this.activityRankBuilder_ == null) {
               this.activityRank_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.activityRankBuilder_.clear();
            }

            return this;
         }

         public Builder removeActivityRank(int index) {
            if (this.activityRankBuilder_ == null) {
               this.ensureActivityRankIsMutable();
               this.activityRank_.remove(index);
               this.onChanged();
            } else {
               this.activityRankBuilder_.remove(index);
            }

            return this;
         }

         public ActivityRank.Builder getActivityRankBuilder(int index) {
            return (ActivityRank.Builder)this.getActivityRankFieldBuilder().getBuilder(index);
         }

         public ActivityRankOrBuilder getActivityRankOrBuilder(int index) {
            return this.activityRankBuilder_ == null ? (ActivityRankOrBuilder)this.activityRank_.get(index) : (ActivityRankOrBuilder)this.activityRankBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityRankOrBuilder> getActivityRankOrBuilderList() {
            return this.activityRankBuilder_ != null ? this.activityRankBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.activityRank_);
         }

         public ActivityRank.Builder addActivityRankBuilder() {
            return (ActivityRank.Builder)this.getActivityRankFieldBuilder().addBuilder(CrossActivityMsg.ActivityRank.getDefaultInstance());
         }

         public ActivityRank.Builder addActivityRankBuilder(int index) {
            return (ActivityRank.Builder)this.getActivityRankFieldBuilder().addBuilder(index, CrossActivityMsg.ActivityRank.getDefaultInstance());
         }

         public List<ActivityRank.Builder> getActivityRankBuilderList() {
            return this.getActivityRankFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityRank, ActivityRank.Builder, ActivityRankOrBuilder> getActivityRankFieldBuilder() {
            if (this.activityRankBuilder_ == null) {
               this.activityRankBuilder_ = new RepeatedFieldBuilderV3(this.activityRank_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.activityRank_ = null;
            }

            return this.activityRankBuilder_;
         }

         public boolean hasCrossChange() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getCrossChange() {
            return this.crossChange_;
         }

         public Builder setCrossChange(boolean value) {
            this.bitField0_ |= 8;
            this.crossChange_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCrossChange() {
            this.bitField0_ &= -9;
            this.crossChange_ = false;
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

   public static final class ActivityRank extends GeneratedMessageV3 implements ActivityRankOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANKTYPE_FIELD_NUMBER = 1;
      private int rankType_;
      public static final int RANK_FIELD_NUMBER = 2;
      private List<PlayerActRankInfo> rank_;
      private byte memoizedIsInitialized;
      private static final ActivityRank DEFAULT_INSTANCE = new ActivityRank();
      /** @deprecated */
      @Deprecated
      public static final Parser<ActivityRank> PARSER = new AbstractParser<ActivityRank>() {
         public ActivityRank parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new ActivityRank(input, extensionRegistry);
         }
      };

      private ActivityRank(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ActivityRank() {
         this.memoizedIsInitialized = -1;
         this.rank_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new ActivityRank();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ActivityRank(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rankType_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.rank_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.rank_.add(input.readMessage(CrossActivityMsg.PlayerActRankInfo.PARSER, extensionRegistry));
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
                  this.rank_ = Collections.unmodifiableList(this.rank_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_ActivityRank_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_ActivityRank_fieldAccessorTable.ensureFieldAccessorsInitialized(ActivityRank.class, Builder.class);
      }

      public boolean hasRankType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRankType() {
         return this.rankType_;
      }

      public List<PlayerActRankInfo> getRankList() {
         return this.rank_;
      }

      public List<? extends PlayerActRankInfoOrBuilder> getRankOrBuilderList() {
         return this.rank_;
      }

      public int getRankCount() {
         return this.rank_.size();
      }

      public PlayerActRankInfo getRank(int index) {
         return (PlayerActRankInfo)this.rank_.get(index);
      }

      public PlayerActRankInfoOrBuilder getRankOrBuilder(int index) {
         return (PlayerActRankInfoOrBuilder)this.rank_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRankType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRankCount(); ++i) {
               if (!this.getRank(i).isInitialized()) {
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
            output.writeInt32(1, this.rankType_);
         }

         for(int i = 0; i < this.rank_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.rank_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.rankType_);
            }

            for(int i = 0; i < this.rank_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.rank_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof ActivityRank)) {
            return super.equals(obj);
         } else {
            ActivityRank other = (ActivityRank)obj;
            if (this.hasRankType() != other.hasRankType()) {
               return false;
            } else if (this.hasRankType() && this.getRankType() != other.getRankType()) {
               return false;
            } else if (!this.getRankList().equals(other.getRankList())) {
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
            if (this.hasRankType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRankType();
            }

            if (this.getRankCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRankList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static ActivityRank parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (ActivityRank)PARSER.parseFrom(data);
      }

      public static ActivityRank parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ActivityRank)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ActivityRank parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (ActivityRank)PARSER.parseFrom(data);
      }

      public static ActivityRank parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ActivityRank)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ActivityRank parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (ActivityRank)PARSER.parseFrom(data);
      }

      public static ActivityRank parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ActivityRank)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ActivityRank parseFrom(InputStream input) throws IOException {
         return (ActivityRank)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ActivityRank parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ActivityRank)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static ActivityRank parseDelimitedFrom(InputStream input) throws IOException {
         return (ActivityRank)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static ActivityRank parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ActivityRank)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static ActivityRank parseFrom(CodedInputStream input) throws IOException {
         return (ActivityRank)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ActivityRank parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ActivityRank)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(ActivityRank prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static ActivityRank getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ActivityRank> parser() {
         return PARSER;
      }

      public Parser<ActivityRank> getParserForType() {
         return PARSER;
      }

      public ActivityRank getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActivityRankOrBuilder {
         private int bitField0_;
         private int rankType_;
         private List<PlayerActRankInfo> rank_;
         private RepeatedFieldBuilderV3<PlayerActRankInfo, PlayerActRankInfo.Builder, PlayerActRankInfoOrBuilder> rankBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_ActivityRank_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_ActivityRank_fieldAccessorTable.ensureFieldAccessorsInitialized(ActivityRank.class, Builder.class);
         }

         private Builder() {
            this.rank_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rank_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossActivityMsg.ActivityRank.alwaysUseFieldBuilders) {
               this.getRankFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.rankType_ = 0;
            this.bitField0_ &= -2;
            if (this.rankBuilder_ == null) {
               this.rank_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.rankBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_ActivityRank_descriptor;
         }

         public ActivityRank getDefaultInstanceForType() {
            return CrossActivityMsg.ActivityRank.getDefaultInstance();
         }

         public ActivityRank build() {
            ActivityRank result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public ActivityRank buildPartial() {
            ActivityRank result = new ActivityRank(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rankType_ = this.rankType_;
               to_bitField0_ |= 1;
            }

            if (this.rankBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.rank_ = Collections.unmodifiableList(this.rank_);
                  this.bitField0_ &= -3;
               }

               result.rank_ = this.rank_;
            } else {
               result.rank_ = this.rankBuilder_.build();
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
            if (other instanceof ActivityRank) {
               return this.mergeFrom((ActivityRank)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ActivityRank other) {
            if (other == CrossActivityMsg.ActivityRank.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRankType()) {
                  this.setRankType(other.getRankType());
               }

               if (this.rankBuilder_ == null) {
                  if (!other.rank_.isEmpty()) {
                     if (this.rank_.isEmpty()) {
                        this.rank_ = other.rank_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureRankIsMutable();
                        this.rank_.addAll(other.rank_);
                     }

                     this.onChanged();
                  }
               } else if (!other.rank_.isEmpty()) {
                  if (this.rankBuilder_.isEmpty()) {
                     this.rankBuilder_.dispose();
                     this.rankBuilder_ = null;
                     this.rank_ = other.rank_;
                     this.bitField0_ &= -3;
                     this.rankBuilder_ = CrossActivityMsg.ActivityRank.alwaysUseFieldBuilders ? this.getRankFieldBuilder() : null;
                  } else {
                     this.rankBuilder_.addAllMessages(other.rank_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRankType()) {
               return false;
            } else {
               for(int i = 0; i < this.getRankCount(); ++i) {
                  if (!this.getRank(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            ActivityRank parsedMessage = null;

            try {
               parsedMessage = (ActivityRank)CrossActivityMsg.ActivityRank.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (ActivityRank)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRankType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRankType() {
            return this.rankType_;
         }

         public Builder setRankType(int value) {
            this.bitField0_ |= 1;
            this.rankType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRankType() {
            this.bitField0_ &= -2;
            this.rankType_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRankIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.rank_ = new ArrayList(this.rank_);
               this.bitField0_ |= 2;
            }

         }

         public List<PlayerActRankInfo> getRankList() {
            return this.rankBuilder_ == null ? Collections.unmodifiableList(this.rank_) : this.rankBuilder_.getMessageList();
         }

         public int getRankCount() {
            return this.rankBuilder_ == null ? this.rank_.size() : this.rankBuilder_.getCount();
         }

         public PlayerActRankInfo getRank(int index) {
            return this.rankBuilder_ == null ? (PlayerActRankInfo)this.rank_.get(index) : (PlayerActRankInfo)this.rankBuilder_.getMessage(index);
         }

         public Builder setRank(int index, PlayerActRankInfo value) {
            if (this.rankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankIsMutable();
               this.rank_.set(index, value);
               this.onChanged();
            } else {
               this.rankBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRank(int index, PlayerActRankInfo.Builder builderForValue) {
            if (this.rankBuilder_ == null) {
               this.ensureRankIsMutable();
               this.rank_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRank(PlayerActRankInfo value) {
            if (this.rankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankIsMutable();
               this.rank_.add(value);
               this.onChanged();
            } else {
               this.rankBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRank(int index, PlayerActRankInfo value) {
            if (this.rankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankIsMutable();
               this.rank_.add(index, value);
               this.onChanged();
            } else {
               this.rankBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRank(PlayerActRankInfo.Builder builderForValue) {
            if (this.rankBuilder_ == null) {
               this.ensureRankIsMutable();
               this.rank_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rankBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRank(int index, PlayerActRankInfo.Builder builderForValue) {
            if (this.rankBuilder_ == null) {
               this.ensureRankIsMutable();
               this.rank_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRank(Iterable<? extends PlayerActRankInfo> values) {
            if (this.rankBuilder_ == null) {
               this.ensureRankIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rank_);
               this.onChanged();
            } else {
               this.rankBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRank() {
            if (this.rankBuilder_ == null) {
               this.rank_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.rankBuilder_.clear();
            }

            return this;
         }

         public Builder removeRank(int index) {
            if (this.rankBuilder_ == null) {
               this.ensureRankIsMutable();
               this.rank_.remove(index);
               this.onChanged();
            } else {
               this.rankBuilder_.remove(index);
            }

            return this;
         }

         public PlayerActRankInfo.Builder getRankBuilder(int index) {
            return (PlayerActRankInfo.Builder)this.getRankFieldBuilder().getBuilder(index);
         }

         public PlayerActRankInfoOrBuilder getRankOrBuilder(int index) {
            return this.rankBuilder_ == null ? (PlayerActRankInfoOrBuilder)this.rank_.get(index) : (PlayerActRankInfoOrBuilder)this.rankBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PlayerActRankInfoOrBuilder> getRankOrBuilderList() {
            return this.rankBuilder_ != null ? this.rankBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rank_);
         }

         public PlayerActRankInfo.Builder addRankBuilder() {
            return (PlayerActRankInfo.Builder)this.getRankFieldBuilder().addBuilder(CrossActivityMsg.PlayerActRankInfo.getDefaultInstance());
         }

         public PlayerActRankInfo.Builder addRankBuilder(int index) {
            return (PlayerActRankInfo.Builder)this.getRankFieldBuilder().addBuilder(index, CrossActivityMsg.PlayerActRankInfo.getDefaultInstance());
         }

         public List<PlayerActRankInfo.Builder> getRankBuilderList() {
            return this.getRankFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PlayerActRankInfo, PlayerActRankInfo.Builder, PlayerActRankInfoOrBuilder> getRankFieldBuilder() {
            if (this.rankBuilder_ == null) {
               this.rankBuilder_ = new RepeatedFieldBuilderV3(this.rank_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.rank_ = null;
            }

            return this.rankBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class PlayerActRankInfo extends GeneratedMessageV3 implements PlayerActRankInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int RANK_FIELD_NUMBER = 2;
      private int rank_;
      public static final int SCORE_FIELD_NUMBER = 3;
      private long score_;
      public static final int PLAYERNAME_FIELD_NUMBER = 4;
      private volatile Object playerName_;
      private byte memoizedIsInitialized;
      private static final PlayerActRankInfo DEFAULT_INSTANCE = new PlayerActRankInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<PlayerActRankInfo> PARSER = new AbstractParser<PlayerActRankInfo>() {
         public PlayerActRankInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new PlayerActRankInfo(input, extensionRegistry);
         }
      };

      private PlayerActRankInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private PlayerActRankInfo() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new PlayerActRankInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private PlayerActRankInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.playerId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.rank_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.score_ = input.readInt64();
                        break;
                     case 34:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 8;
                        this.playerName_ = bs;
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
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_PlayerActRankInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_PlayerActRankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerActRankInfo.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasRank() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasScore() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getScore() {
         return this.score_;
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 8) != 0;
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

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRank()) {
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
            output.writeInt32(1, this.playerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.rank_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(3, this.score_);
         }

         if ((this.bitField0_ & 8) != 0) {
            GeneratedMessageV3.writeString(output, 4, this.playerName_);
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
               size += CodedOutputStream.computeInt32Size(1, this.playerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.rank_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(3, this.score_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += GeneratedMessageV3.computeStringSize(4, this.playerName_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof PlayerActRankInfo)) {
            return super.equals(obj);
         } else {
            PlayerActRankInfo other = (PlayerActRankInfo)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasScore() != other.hasScore()) {
               return false;
            } else if (this.hasScore() && this.getScore() != other.getScore()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
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
            if (this.hasPlayerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasRank()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRank();
            }

            if (this.hasScore()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashLong(this.getScore());
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static PlayerActRankInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (PlayerActRankInfo)PARSER.parseFrom(data);
      }

      public static PlayerActRankInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PlayerActRankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PlayerActRankInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (PlayerActRankInfo)PARSER.parseFrom(data);
      }

      public static PlayerActRankInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PlayerActRankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PlayerActRankInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (PlayerActRankInfo)PARSER.parseFrom(data);
      }

      public static PlayerActRankInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PlayerActRankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PlayerActRankInfo parseFrom(InputStream input) throws IOException {
         return (PlayerActRankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PlayerActRankInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PlayerActRankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static PlayerActRankInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (PlayerActRankInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static PlayerActRankInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PlayerActRankInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static PlayerActRankInfo parseFrom(CodedInputStream input) throws IOException {
         return (PlayerActRankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PlayerActRankInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PlayerActRankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(PlayerActRankInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static PlayerActRankInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<PlayerActRankInfo> parser() {
         return PARSER;
      }

      public Parser<PlayerActRankInfo> getParserForType() {
         return PARSER;
      }

      public PlayerActRankInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerActRankInfoOrBuilder {
         private int bitField0_;
         private int playerId_;
         private int rank_;
         private long score_;
         private Object playerName_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_PlayerActRankInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_PlayerActRankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerActRankInfo.class, Builder.class);
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
            if (CrossActivityMsg.PlayerActRankInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.rank_ = 0;
            this.bitField0_ &= -3;
            this.score_ = 0L;
            this.bitField0_ &= -5;
            this.playerName_ = "";
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_PlayerActRankInfo_descriptor;
         }

         public PlayerActRankInfo getDefaultInstanceForType() {
            return CrossActivityMsg.PlayerActRankInfo.getDefaultInstance();
         }

         public PlayerActRankInfo build() {
            PlayerActRankInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public PlayerActRankInfo buildPartial() {
            PlayerActRankInfo result = new PlayerActRankInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.score_ = this.score_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.playerName_ = this.playerName_;
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
            if (other instanceof PlayerActRankInfo) {
               return this.mergeFrom((PlayerActRankInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(PlayerActRankInfo other) {
            if (other == CrossActivityMsg.PlayerActRankInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasScore()) {
                  this.setScore(other.getScore());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 8;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasRank()) {
               return false;
            } else {
               return this.hasScore();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            PlayerActRankInfo parsedMessage = null;

            try {
               parsedMessage = (PlayerActRankInfo)CrossActivityMsg.PlayerActRankInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (PlayerActRankInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPlayerId() {
            return this.playerId_;
         }

         public Builder setPlayerId(int value) {
            this.bitField0_ |= 1;
            this.playerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRank() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRank() {
            return this.rank_;
         }

         public Builder setRank(int value) {
            this.bitField0_ |= 2;
            this.rank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRank() {
            this.bitField0_ &= -3;
            this.rank_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasScore() {
            return (this.bitField0_ & 4) != 0;
         }

         public long getScore() {
            return this.score_;
         }

         public Builder setScore(long value) {
            this.bitField0_ |= 4;
            this.score_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearScore() {
            this.bitField0_ &= -5;
            this.score_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 8) != 0;
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
               this.bitField0_ |= 8;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -9;
            this.playerName_ = CrossActivityMsg.PlayerActRankInfo.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_ActivityGm_13103 extends GeneratedMessageV3 implements S2CR_ActivityGm_13103OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CMD_FIELD_NUMBER = 1;
      private volatile Object cmd_;
      public static final int PARAMS_FIELD_NUMBER = 2;
      private Internal.IntList params_;
      private byte memoizedIsInitialized;
      private static final S2CR_ActivityGm_13103 DEFAULT_INSTANCE = new S2CR_ActivityGm_13103();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_ActivityGm_13103> PARSER = new AbstractParser<S2CR_ActivityGm_13103>() {
         public S2CR_ActivityGm_13103 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_ActivityGm_13103(input, extensionRegistry);
         }
      };

      private S2CR_ActivityGm_13103(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_ActivityGm_13103() {
         this.memoizedIsInitialized = -1;
         this.cmd_ = "";
         this.params_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_ActivityGm_13103();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_ActivityGm_13103(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 1;
                        this.cmd_ = bs;
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.params_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.params_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.params_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.params_.addInt(input.readInt32());
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
                  this.params_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_ActivityGm_13103_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_ActivityGm_13103_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ActivityGm_13103.class, Builder.class);
      }

      public boolean hasCmd() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getCmd() {
         Object ref = this.cmd_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.cmd_ = s;
            }

            return s;
         }
      }

      public ByteString getCmdBytes() {
         Object ref = this.cmd_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.cmd_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public List<Integer> getParamsList() {
         return this.params_;
      }

      public int getParamsCount() {
         return this.params_.size();
      }

      public int getParams(int index) {
         return this.params_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCmd()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.cmd_);
         }

         for(int i = 0; i < this.params_.size(); ++i) {
            output.writeInt32(2, this.params_.getInt(i));
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
               size += GeneratedMessageV3.computeStringSize(1, this.cmd_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.params_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.params_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getParamsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_ActivityGm_13103)) {
            return super.equals(obj);
         } else {
            S2CR_ActivityGm_13103 other = (S2CR_ActivityGm_13103)obj;
            if (this.hasCmd() != other.hasCmd()) {
               return false;
            } else if (this.hasCmd() && !this.getCmd().equals(other.getCmd())) {
               return false;
            } else if (!this.getParamsList().equals(other.getParamsList())) {
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
            if (this.hasCmd()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCmd().hashCode();
            }

            if (this.getParamsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getParamsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_ActivityGm_13103 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_ActivityGm_13103)PARSER.parseFrom(data);
      }

      public static S2CR_ActivityGm_13103 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ActivityGm_13103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ActivityGm_13103 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_ActivityGm_13103)PARSER.parseFrom(data);
      }

      public static S2CR_ActivityGm_13103 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ActivityGm_13103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ActivityGm_13103 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_ActivityGm_13103)PARSER.parseFrom(data);
      }

      public static S2CR_ActivityGm_13103 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ActivityGm_13103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ActivityGm_13103 parseFrom(InputStream input) throws IOException {
         return (S2CR_ActivityGm_13103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ActivityGm_13103 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ActivityGm_13103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ActivityGm_13103 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_ActivityGm_13103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_ActivityGm_13103 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ActivityGm_13103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ActivityGm_13103 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_ActivityGm_13103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ActivityGm_13103 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ActivityGm_13103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_ActivityGm_13103 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_ActivityGm_13103 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_ActivityGm_13103> parser() {
         return PARSER;
      }

      public Parser<S2CR_ActivityGm_13103> getParserForType() {
         return PARSER;
      }

      public S2CR_ActivityGm_13103 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_ActivityGm_13103OrBuilder {
         private int bitField0_;
         private Object cmd_;
         private Internal.IntList params_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_ActivityGm_13103_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_ActivityGm_13103_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ActivityGm_13103.class, Builder.class);
         }

         private Builder() {
            this.cmd_ = "";
            this.params_ = CrossActivityMsg.S2CR_ActivityGm_13103.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.cmd_ = "";
            this.params_ = CrossActivityMsg.S2CR_ActivityGm_13103.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossActivityMsg.S2CR_ActivityGm_13103.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.cmd_ = "";
            this.bitField0_ &= -2;
            this.params_ = CrossActivityMsg.S2CR_ActivityGm_13103.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_ActivityGm_13103_descriptor;
         }

         public S2CR_ActivityGm_13103 getDefaultInstanceForType() {
            return CrossActivityMsg.S2CR_ActivityGm_13103.getDefaultInstance();
         }

         public S2CR_ActivityGm_13103 build() {
            S2CR_ActivityGm_13103 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_ActivityGm_13103 buildPartial() {
            S2CR_ActivityGm_13103 result = new S2CR_ActivityGm_13103(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.cmd_ = this.cmd_;
            if ((this.bitField0_ & 2) != 0) {
               this.params_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.params_ = this.params_;
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
            if (other instanceof S2CR_ActivityGm_13103) {
               return this.mergeFrom((S2CR_ActivityGm_13103)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_ActivityGm_13103 other) {
            if (other == CrossActivityMsg.S2CR_ActivityGm_13103.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCmd()) {
                  this.bitField0_ |= 1;
                  this.cmd_ = other.cmd_;
                  this.onChanged();
               }

               if (!other.params_.isEmpty()) {
                  if (this.params_.isEmpty()) {
                     this.params_ = other.params_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureParamsIsMutable();
                     this.params_.addAll(other.params_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCmd();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_ActivityGm_13103 parsedMessage = null;

            try {
               parsedMessage = (S2CR_ActivityGm_13103)CrossActivityMsg.S2CR_ActivityGm_13103.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_ActivityGm_13103)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCmd() {
            return (this.bitField0_ & 1) != 0;
         }

         public String getCmd() {
            Object ref = this.cmd_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.cmd_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getCmdBytes() {
            Object ref = this.cmd_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.cmd_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setCmd(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.cmd_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearCmd() {
            this.bitField0_ &= -2;
            this.cmd_ = CrossActivityMsg.S2CR_ActivityGm_13103.getDefaultInstance().getCmd();
            this.onChanged();
            return this;
         }

         public Builder setCmdBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.cmd_ = value;
               this.onChanged();
               return this;
            }
         }

         private void ensureParamsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.params_ = CrossActivityMsg.S2CR_ActivityGm_13103.mutableCopy(this.params_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getParamsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.params_) : this.params_);
         }

         public int getParamsCount() {
            return this.params_.size();
         }

         public int getParams(int index) {
            return this.params_.getInt(index);
         }

         public Builder setParams(int index, int value) {
            this.ensureParamsIsMutable();
            this.params_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addParams(int value) {
            this.ensureParamsIsMutable();
            this.params_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllParams(Iterable<? extends Integer> values) {
            this.ensureParamsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.params_);
            this.onChanged();
            return this;
         }

         public Builder clearParams() {
            this.params_ = CrossActivityMsg.S2CR_ActivityGm_13103.emptyIntList();
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

   public static final class S2CR_DecisiveActivityUpload_13104 extends GeneratedMessageV3 implements S2CR_DecisiveActivityUpload_13104OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYTYPE_FIELD_NUMBER = 1;
      private int activityType_;
      public static final int DROPTIME_FIELD_NUMBER = 2;
      private int dropTime_;
      public static final int ENDTIME_FIELD_NUMBER = 3;
      private int endTime_;
      private byte memoizedIsInitialized;
      private static final S2CR_DecisiveActivityUpload_13104 DEFAULT_INSTANCE = new S2CR_DecisiveActivityUpload_13104();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_DecisiveActivityUpload_13104> PARSER = new AbstractParser<S2CR_DecisiveActivityUpload_13104>() {
         public S2CR_DecisiveActivityUpload_13104 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_DecisiveActivityUpload_13104(input, extensionRegistry);
         }
      };

      private S2CR_DecisiveActivityUpload_13104(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_DecisiveActivityUpload_13104() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_DecisiveActivityUpload_13104();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_DecisiveActivityUpload_13104(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.dropTime_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.endTime_ = input.readInt32();
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
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_DecisiveActivityUpload_13104_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_DecisiveActivityUpload_13104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_DecisiveActivityUpload_13104.class, Builder.class);
      }

      public boolean hasActivityType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityType() {
         return this.activityType_;
      }

      public boolean hasDropTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDropTime() {
         return this.dropTime_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getEndTime() {
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
         } else if (!this.hasDropTime()) {
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
            output.writeInt32(2, this.dropTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.endTime_);
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
               size += CodedOutputStream.computeInt32Size(2, this.dropTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.endTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_DecisiveActivityUpload_13104)) {
            return super.equals(obj);
         } else {
            S2CR_DecisiveActivityUpload_13104 other = (S2CR_DecisiveActivityUpload_13104)obj;
            if (this.hasActivityType() != other.hasActivityType()) {
               return false;
            } else if (this.hasActivityType() && this.getActivityType() != other.getActivityType()) {
               return false;
            } else if (this.hasDropTime() != other.hasDropTime()) {
               return false;
            } else if (this.hasDropTime() && this.getDropTime() != other.getDropTime()) {
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

            if (this.hasDropTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDropTime();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getEndTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_DecisiveActivityUpload_13104 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_DecisiveActivityUpload_13104)PARSER.parseFrom(data);
      }

      public static S2CR_DecisiveActivityUpload_13104 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DecisiveActivityUpload_13104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DecisiveActivityUpload_13104 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_DecisiveActivityUpload_13104)PARSER.parseFrom(data);
      }

      public static S2CR_DecisiveActivityUpload_13104 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DecisiveActivityUpload_13104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DecisiveActivityUpload_13104 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_DecisiveActivityUpload_13104)PARSER.parseFrom(data);
      }

      public static S2CR_DecisiveActivityUpload_13104 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_DecisiveActivityUpload_13104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_DecisiveActivityUpload_13104 parseFrom(InputStream input) throws IOException {
         return (S2CR_DecisiveActivityUpload_13104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_DecisiveActivityUpload_13104 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DecisiveActivityUpload_13104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_DecisiveActivityUpload_13104 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_DecisiveActivityUpload_13104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_DecisiveActivityUpload_13104 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DecisiveActivityUpload_13104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_DecisiveActivityUpload_13104 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_DecisiveActivityUpload_13104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_DecisiveActivityUpload_13104 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_DecisiveActivityUpload_13104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_DecisiveActivityUpload_13104 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_DecisiveActivityUpload_13104 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_DecisiveActivityUpload_13104> parser() {
         return PARSER;
      }

      public Parser<S2CR_DecisiveActivityUpload_13104> getParserForType() {
         return PARSER;
      }

      public S2CR_DecisiveActivityUpload_13104 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_DecisiveActivityUpload_13104OrBuilder {
         private int bitField0_;
         private int activityType_;
         private int dropTime_;
         private int endTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_DecisiveActivityUpload_13104_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_DecisiveActivityUpload_13104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_DecisiveActivityUpload_13104.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossActivityMsg.S2CR_DecisiveActivityUpload_13104.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityType_ = 0;
            this.bitField0_ &= -2;
            this.dropTime_ = 0;
            this.bitField0_ &= -3;
            this.endTime_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_DecisiveActivityUpload_13104_descriptor;
         }

         public S2CR_DecisiveActivityUpload_13104 getDefaultInstanceForType() {
            return CrossActivityMsg.S2CR_DecisiveActivityUpload_13104.getDefaultInstance();
         }

         public S2CR_DecisiveActivityUpload_13104 build() {
            S2CR_DecisiveActivityUpload_13104 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_DecisiveActivityUpload_13104 buildPartial() {
            S2CR_DecisiveActivityUpload_13104 result = new S2CR_DecisiveActivityUpload_13104(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityType_ = this.activityType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.dropTime_ = this.dropTime_;
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
            if (other instanceof S2CR_DecisiveActivityUpload_13104) {
               return this.mergeFrom((S2CR_DecisiveActivityUpload_13104)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_DecisiveActivityUpload_13104 other) {
            if (other == CrossActivityMsg.S2CR_DecisiveActivityUpload_13104.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityType()) {
                  this.setActivityType(other.getActivityType());
               }

               if (other.hasDropTime()) {
                  this.setDropTime(other.getDropTime());
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
            } else if (!this.hasDropTime()) {
               return false;
            } else {
               return this.hasEndTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_DecisiveActivityUpload_13104 parsedMessage = null;

            try {
               parsedMessage = (S2CR_DecisiveActivityUpload_13104)CrossActivityMsg.S2CR_DecisiveActivityUpload_13104.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_DecisiveActivityUpload_13104)e.getUnfinishedMessage();
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

         public boolean hasDropTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDropTime() {
            return this.dropTime_;
         }

         public Builder setDropTime(int value) {
            this.bitField0_ |= 2;
            this.dropTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDropTime() {
            this.bitField0_ &= -3;
            this.dropTime_ = 0;
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_NoticeCrossActOpenDay_13105 extends GeneratedMessageV3 implements CR2S_NoticeCrossActOpenDay_13105OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYTYPE_FIELD_NUMBER = 1;
      private int activityType_;
      public static final int CROSSACTOPENDAY_FIELD_NUMBER = 2;
      private int crossActOpenDay_;
      public static final int JOINSERVERS_FIELD_NUMBER = 3;
      private Internal.IntList joinServers_;
      private byte memoizedIsInitialized;
      private static final CR2S_NoticeCrossActOpenDay_13105 DEFAULT_INSTANCE = new CR2S_NoticeCrossActOpenDay_13105();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_NoticeCrossActOpenDay_13105> PARSER = new AbstractParser<CR2S_NoticeCrossActOpenDay_13105>() {
         public CR2S_NoticeCrossActOpenDay_13105 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_NoticeCrossActOpenDay_13105(input, extensionRegistry);
         }
      };

      private CR2S_NoticeCrossActOpenDay_13105(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_NoticeCrossActOpenDay_13105() {
         this.memoizedIsInitialized = -1;
         this.joinServers_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_NoticeCrossActOpenDay_13105();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_NoticeCrossActOpenDay_13105(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.crossActOpenDay_ = input.readInt32();
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.joinServers_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.joinServers_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.joinServers_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.joinServers_.addInt(input.readInt32());
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
                  this.joinServers_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_NoticeCrossActOpenDay_13105_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_NoticeCrossActOpenDay_13105_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_NoticeCrossActOpenDay_13105.class, Builder.class);
      }

      public boolean hasActivityType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityType() {
         return this.activityType_;
      }

      public boolean hasCrossActOpenDay() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCrossActOpenDay() {
         return this.crossActOpenDay_;
      }

      public List<Integer> getJoinServersList() {
         return this.joinServers_;
      }

      public int getJoinServersCount() {
         return this.joinServers_.size();
      }

      public int getJoinServers(int index) {
         return this.joinServers_.getInt(index);
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
         } else if (!this.hasCrossActOpenDay()) {
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
            output.writeInt32(2, this.crossActOpenDay_);
         }

         for(int i = 0; i < this.joinServers_.size(); ++i) {
            output.writeInt32(3, this.joinServers_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(2, this.crossActOpenDay_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.joinServers_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.joinServers_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getJoinServersList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_NoticeCrossActOpenDay_13105)) {
            return super.equals(obj);
         } else {
            CR2S_NoticeCrossActOpenDay_13105 other = (CR2S_NoticeCrossActOpenDay_13105)obj;
            if (this.hasActivityType() != other.hasActivityType()) {
               return false;
            } else if (this.hasActivityType() && this.getActivityType() != other.getActivityType()) {
               return false;
            } else if (this.hasCrossActOpenDay() != other.hasCrossActOpenDay()) {
               return false;
            } else if (this.hasCrossActOpenDay() && this.getCrossActOpenDay() != other.getCrossActOpenDay()) {
               return false;
            } else if (!this.getJoinServersList().equals(other.getJoinServersList())) {
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

            if (this.hasCrossActOpenDay()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCrossActOpenDay();
            }

            if (this.getJoinServersCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getJoinServersList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_NoticeCrossActOpenDay_13105 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_NoticeCrossActOpenDay_13105)PARSER.parseFrom(data);
      }

      public static CR2S_NoticeCrossActOpenDay_13105 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_NoticeCrossActOpenDay_13105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_NoticeCrossActOpenDay_13105 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_NoticeCrossActOpenDay_13105)PARSER.parseFrom(data);
      }

      public static CR2S_NoticeCrossActOpenDay_13105 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_NoticeCrossActOpenDay_13105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_NoticeCrossActOpenDay_13105 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_NoticeCrossActOpenDay_13105)PARSER.parseFrom(data);
      }

      public static CR2S_NoticeCrossActOpenDay_13105 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_NoticeCrossActOpenDay_13105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_NoticeCrossActOpenDay_13105 parseFrom(InputStream input) throws IOException {
         return (CR2S_NoticeCrossActOpenDay_13105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_NoticeCrossActOpenDay_13105 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_NoticeCrossActOpenDay_13105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_NoticeCrossActOpenDay_13105 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_NoticeCrossActOpenDay_13105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_NoticeCrossActOpenDay_13105 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_NoticeCrossActOpenDay_13105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_NoticeCrossActOpenDay_13105 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_NoticeCrossActOpenDay_13105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_NoticeCrossActOpenDay_13105 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_NoticeCrossActOpenDay_13105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_NoticeCrossActOpenDay_13105 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_NoticeCrossActOpenDay_13105 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_NoticeCrossActOpenDay_13105> parser() {
         return PARSER;
      }

      public Parser<CR2S_NoticeCrossActOpenDay_13105> getParserForType() {
         return PARSER;
      }

      public CR2S_NoticeCrossActOpenDay_13105 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_NoticeCrossActOpenDay_13105OrBuilder {
         private int bitField0_;
         private int activityType_;
         private int crossActOpenDay_;
         private Internal.IntList joinServers_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_NoticeCrossActOpenDay_13105_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_NoticeCrossActOpenDay_13105_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_NoticeCrossActOpenDay_13105.class, Builder.class);
         }

         private Builder() {
            this.joinServers_ = CrossActivityMsg.CR2S_NoticeCrossActOpenDay_13105.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.joinServers_ = CrossActivityMsg.CR2S_NoticeCrossActOpenDay_13105.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossActivityMsg.CR2S_NoticeCrossActOpenDay_13105.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityType_ = 0;
            this.bitField0_ &= -2;
            this.crossActOpenDay_ = 0;
            this.bitField0_ &= -3;
            this.joinServers_ = CrossActivityMsg.CR2S_NoticeCrossActOpenDay_13105.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_NoticeCrossActOpenDay_13105_descriptor;
         }

         public CR2S_NoticeCrossActOpenDay_13105 getDefaultInstanceForType() {
            return CrossActivityMsg.CR2S_NoticeCrossActOpenDay_13105.getDefaultInstance();
         }

         public CR2S_NoticeCrossActOpenDay_13105 build() {
            CR2S_NoticeCrossActOpenDay_13105 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_NoticeCrossActOpenDay_13105 buildPartial() {
            CR2S_NoticeCrossActOpenDay_13105 result = new CR2S_NoticeCrossActOpenDay_13105(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityType_ = this.activityType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.crossActOpenDay_ = this.crossActOpenDay_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.joinServers_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.joinServers_ = this.joinServers_;
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
            if (other instanceof CR2S_NoticeCrossActOpenDay_13105) {
               return this.mergeFrom((CR2S_NoticeCrossActOpenDay_13105)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_NoticeCrossActOpenDay_13105 other) {
            if (other == CrossActivityMsg.CR2S_NoticeCrossActOpenDay_13105.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityType()) {
                  this.setActivityType(other.getActivityType());
               }

               if (other.hasCrossActOpenDay()) {
                  this.setCrossActOpenDay(other.getCrossActOpenDay());
               }

               if (!other.joinServers_.isEmpty()) {
                  if (this.joinServers_.isEmpty()) {
                     this.joinServers_ = other.joinServers_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureJoinServersIsMutable();
                     this.joinServers_.addAll(other.joinServers_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActivityType()) {
               return false;
            } else {
               return this.hasCrossActOpenDay();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_NoticeCrossActOpenDay_13105 parsedMessage = null;

            try {
               parsedMessage = (CR2S_NoticeCrossActOpenDay_13105)CrossActivityMsg.CR2S_NoticeCrossActOpenDay_13105.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_NoticeCrossActOpenDay_13105)e.getUnfinishedMessage();
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

         public boolean hasCrossActOpenDay() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCrossActOpenDay() {
            return this.crossActOpenDay_;
         }

         public Builder setCrossActOpenDay(int value) {
            this.bitField0_ |= 2;
            this.crossActOpenDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCrossActOpenDay() {
            this.bitField0_ &= -3;
            this.crossActOpenDay_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureJoinServersIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.joinServers_ = CrossActivityMsg.CR2S_NoticeCrossActOpenDay_13105.mutableCopy(this.joinServers_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getJoinServersList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.joinServers_) : this.joinServers_);
         }

         public int getJoinServersCount() {
            return this.joinServers_.size();
         }

         public int getJoinServers(int index) {
            return this.joinServers_.getInt(index);
         }

         public Builder setJoinServers(int index, int value) {
            this.ensureJoinServersIsMutable();
            this.joinServers_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addJoinServers(int value) {
            this.ensureJoinServersIsMutable();
            this.joinServers_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllJoinServers(Iterable<? extends Integer> values) {
            this.ensureJoinServersIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.joinServers_);
            this.onChanged();
            return this;
         }

         public Builder clearJoinServers() {
            this.joinServers_ = CrossActivityMsg.CR2S_NoticeCrossActOpenDay_13105.emptyIntList();
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

   public static final class CR2S_FlowerRankInfo_13106 extends GeneratedMessageV3 implements CR2S_FlowerRankInfo_13106OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ACTIVITYRANK_FIELD_NUMBER = 1;
      private List<ActivityRank> activityRank_;
      private byte memoizedIsInitialized;
      private static final CR2S_FlowerRankInfo_13106 DEFAULT_INSTANCE = new CR2S_FlowerRankInfo_13106();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_FlowerRankInfo_13106> PARSER = new AbstractParser<CR2S_FlowerRankInfo_13106>() {
         public CR2S_FlowerRankInfo_13106 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_FlowerRankInfo_13106(input, extensionRegistry);
         }
      };

      private CR2S_FlowerRankInfo_13106(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_FlowerRankInfo_13106() {
         this.memoizedIsInitialized = -1;
         this.activityRank_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_FlowerRankInfo_13106();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_FlowerRankInfo_13106(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.activityRank_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.activityRank_.add(input.readMessage(CrossActivityMsg.ActivityRank.PARSER, extensionRegistry));
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
                  this.activityRank_ = Collections.unmodifiableList(this.activityRank_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_FlowerRankInfo_13106_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_FlowerRankInfo_13106_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_FlowerRankInfo_13106.class, Builder.class);
      }

      public List<ActivityRank> getActivityRankList() {
         return this.activityRank_;
      }

      public List<? extends ActivityRankOrBuilder> getActivityRankOrBuilderList() {
         return this.activityRank_;
      }

      public int getActivityRankCount() {
         return this.activityRank_.size();
      }

      public ActivityRank getActivityRank(int index) {
         return (ActivityRank)this.activityRank_.get(index);
      }

      public ActivityRankOrBuilder getActivityRankOrBuilder(int index) {
         return (ActivityRankOrBuilder)this.activityRank_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getActivityRankCount(); ++i) {
               if (!this.getActivityRank(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.activityRank_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.activityRank_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.activityRank_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.activityRank_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_FlowerRankInfo_13106)) {
            return super.equals(obj);
         } else {
            CR2S_FlowerRankInfo_13106 other = (CR2S_FlowerRankInfo_13106)obj;
            if (!this.getActivityRankList().equals(other.getActivityRankList())) {
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
            if (this.getActivityRankCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getActivityRankList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_FlowerRankInfo_13106 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_FlowerRankInfo_13106)PARSER.parseFrom(data);
      }

      public static CR2S_FlowerRankInfo_13106 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_FlowerRankInfo_13106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_FlowerRankInfo_13106 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_FlowerRankInfo_13106)PARSER.parseFrom(data);
      }

      public static CR2S_FlowerRankInfo_13106 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_FlowerRankInfo_13106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_FlowerRankInfo_13106 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_FlowerRankInfo_13106)PARSER.parseFrom(data);
      }

      public static CR2S_FlowerRankInfo_13106 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_FlowerRankInfo_13106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_FlowerRankInfo_13106 parseFrom(InputStream input) throws IOException {
         return (CR2S_FlowerRankInfo_13106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_FlowerRankInfo_13106 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_FlowerRankInfo_13106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_FlowerRankInfo_13106 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_FlowerRankInfo_13106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_FlowerRankInfo_13106 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_FlowerRankInfo_13106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_FlowerRankInfo_13106 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_FlowerRankInfo_13106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_FlowerRankInfo_13106 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_FlowerRankInfo_13106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_FlowerRankInfo_13106 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_FlowerRankInfo_13106 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_FlowerRankInfo_13106> parser() {
         return PARSER;
      }

      public Parser<CR2S_FlowerRankInfo_13106> getParserForType() {
         return PARSER;
      }

      public CR2S_FlowerRankInfo_13106 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_FlowerRankInfo_13106OrBuilder {
         private int bitField0_;
         private List<ActivityRank> activityRank_;
         private RepeatedFieldBuilderV3<ActivityRank, ActivityRank.Builder, ActivityRankOrBuilder> activityRankBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_FlowerRankInfo_13106_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_FlowerRankInfo_13106_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_FlowerRankInfo_13106.class, Builder.class);
         }

         private Builder() {
            this.activityRank_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.activityRank_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossActivityMsg.CR2S_FlowerRankInfo_13106.alwaysUseFieldBuilders) {
               this.getActivityRankFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.activityRankBuilder_ == null) {
               this.activityRank_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.activityRankBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_FlowerRankInfo_13106_descriptor;
         }

         public CR2S_FlowerRankInfo_13106 getDefaultInstanceForType() {
            return CrossActivityMsg.CR2S_FlowerRankInfo_13106.getDefaultInstance();
         }

         public CR2S_FlowerRankInfo_13106 build() {
            CR2S_FlowerRankInfo_13106 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_FlowerRankInfo_13106 buildPartial() {
            CR2S_FlowerRankInfo_13106 result = new CR2S_FlowerRankInfo_13106(this);
            int from_bitField0_ = this.bitField0_;
            if (this.activityRankBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.activityRank_ = Collections.unmodifiableList(this.activityRank_);
                  this.bitField0_ &= -2;
               }

               result.activityRank_ = this.activityRank_;
            } else {
               result.activityRank_ = this.activityRankBuilder_.build();
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
            if (other instanceof CR2S_FlowerRankInfo_13106) {
               return this.mergeFrom((CR2S_FlowerRankInfo_13106)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_FlowerRankInfo_13106 other) {
            if (other == CrossActivityMsg.CR2S_FlowerRankInfo_13106.getDefaultInstance()) {
               return this;
            } else {
               if (this.activityRankBuilder_ == null) {
                  if (!other.activityRank_.isEmpty()) {
                     if (this.activityRank_.isEmpty()) {
                        this.activityRank_ = other.activityRank_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureActivityRankIsMutable();
                        this.activityRank_.addAll(other.activityRank_);
                     }

                     this.onChanged();
                  }
               } else if (!other.activityRank_.isEmpty()) {
                  if (this.activityRankBuilder_.isEmpty()) {
                     this.activityRankBuilder_.dispose();
                     this.activityRankBuilder_ = null;
                     this.activityRank_ = other.activityRank_;
                     this.bitField0_ &= -2;
                     this.activityRankBuilder_ = CrossActivityMsg.CR2S_FlowerRankInfo_13106.alwaysUseFieldBuilders ? this.getActivityRankFieldBuilder() : null;
                  } else {
                     this.activityRankBuilder_.addAllMessages(other.activityRank_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getActivityRankCount(); ++i) {
               if (!this.getActivityRank(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_FlowerRankInfo_13106 parsedMessage = null;

            try {
               parsedMessage = (CR2S_FlowerRankInfo_13106)CrossActivityMsg.CR2S_FlowerRankInfo_13106.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_FlowerRankInfo_13106)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureActivityRankIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.activityRank_ = new ArrayList(this.activityRank_);
               this.bitField0_ |= 1;
            }

         }

         public List<ActivityRank> getActivityRankList() {
            return this.activityRankBuilder_ == null ? Collections.unmodifiableList(this.activityRank_) : this.activityRankBuilder_.getMessageList();
         }

         public int getActivityRankCount() {
            return this.activityRankBuilder_ == null ? this.activityRank_.size() : this.activityRankBuilder_.getCount();
         }

         public ActivityRank getActivityRank(int index) {
            return this.activityRankBuilder_ == null ? (ActivityRank)this.activityRank_.get(index) : (ActivityRank)this.activityRankBuilder_.getMessage(index);
         }

         public Builder setActivityRank(int index, ActivityRank value) {
            if (this.activityRankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureActivityRankIsMutable();
               this.activityRank_.set(index, value);
               this.onChanged();
            } else {
               this.activityRankBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setActivityRank(int index, ActivityRank.Builder builderForValue) {
            if (this.activityRankBuilder_ == null) {
               this.ensureActivityRankIsMutable();
               this.activityRank_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.activityRankBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addActivityRank(ActivityRank value) {
            if (this.activityRankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureActivityRankIsMutable();
               this.activityRank_.add(value);
               this.onChanged();
            } else {
               this.activityRankBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addActivityRank(int index, ActivityRank value) {
            if (this.activityRankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureActivityRankIsMutable();
               this.activityRank_.add(index, value);
               this.onChanged();
            } else {
               this.activityRankBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addActivityRank(ActivityRank.Builder builderForValue) {
            if (this.activityRankBuilder_ == null) {
               this.ensureActivityRankIsMutable();
               this.activityRank_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.activityRankBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addActivityRank(int index, ActivityRank.Builder builderForValue) {
            if (this.activityRankBuilder_ == null) {
               this.ensureActivityRankIsMutable();
               this.activityRank_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.activityRankBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllActivityRank(Iterable<? extends ActivityRank> values) {
            if (this.activityRankBuilder_ == null) {
               this.ensureActivityRankIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.activityRank_);
               this.onChanged();
            } else {
               this.activityRankBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearActivityRank() {
            if (this.activityRankBuilder_ == null) {
               this.activityRank_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.activityRankBuilder_.clear();
            }

            return this;
         }

         public Builder removeActivityRank(int index) {
            if (this.activityRankBuilder_ == null) {
               this.ensureActivityRankIsMutable();
               this.activityRank_.remove(index);
               this.onChanged();
            } else {
               this.activityRankBuilder_.remove(index);
            }

            return this;
         }

         public ActivityRank.Builder getActivityRankBuilder(int index) {
            return (ActivityRank.Builder)this.getActivityRankFieldBuilder().getBuilder(index);
         }

         public ActivityRankOrBuilder getActivityRankOrBuilder(int index) {
            return this.activityRankBuilder_ == null ? (ActivityRankOrBuilder)this.activityRank_.get(index) : (ActivityRankOrBuilder)this.activityRankBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityRankOrBuilder> getActivityRankOrBuilderList() {
            return this.activityRankBuilder_ != null ? this.activityRankBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.activityRank_);
         }

         public ActivityRank.Builder addActivityRankBuilder() {
            return (ActivityRank.Builder)this.getActivityRankFieldBuilder().addBuilder(CrossActivityMsg.ActivityRank.getDefaultInstance());
         }

         public ActivityRank.Builder addActivityRankBuilder(int index) {
            return (ActivityRank.Builder)this.getActivityRankFieldBuilder().addBuilder(index, CrossActivityMsg.ActivityRank.getDefaultInstance());
         }

         public List<ActivityRank.Builder> getActivityRankBuilderList() {
            return this.getActivityRankFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityRank, ActivityRank.Builder, ActivityRankOrBuilder> getActivityRankFieldBuilder() {
            if (this.activityRankBuilder_ == null) {
               this.activityRankBuilder_ = new RepeatedFieldBuilderV3(this.activityRank_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.activityRank_ = null;
            }

            return this.activityRankBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_BroodActivityUpload_13107 extends GeneratedMessageV3 implements S2CR_BroodActivityUpload_13107OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYTYPE_FIELD_NUMBER = 1;
      private int activityType_;
      public static final int DROPTIME_FIELD_NUMBER = 2;
      private int dropTime_;
      public static final int ENDTIME_FIELD_NUMBER = 3;
      private int endTime_;
      private byte memoizedIsInitialized;
      private static final S2CR_BroodActivityUpload_13107 DEFAULT_INSTANCE = new S2CR_BroodActivityUpload_13107();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_BroodActivityUpload_13107> PARSER = new AbstractParser<S2CR_BroodActivityUpload_13107>() {
         public S2CR_BroodActivityUpload_13107 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_BroodActivityUpload_13107(input, extensionRegistry);
         }
      };

      private S2CR_BroodActivityUpload_13107(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_BroodActivityUpload_13107() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_BroodActivityUpload_13107();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_BroodActivityUpload_13107(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.dropTime_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.endTime_ = input.readInt32();
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
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_BroodActivityUpload_13107_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_BroodActivityUpload_13107_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_BroodActivityUpload_13107.class, Builder.class);
      }

      public boolean hasActivityType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityType() {
         return this.activityType_;
      }

      public boolean hasDropTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDropTime() {
         return this.dropTime_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getEndTime() {
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
         } else if (!this.hasDropTime()) {
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
            output.writeInt32(2, this.dropTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.endTime_);
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
               size += CodedOutputStream.computeInt32Size(2, this.dropTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.endTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_BroodActivityUpload_13107)) {
            return super.equals(obj);
         } else {
            S2CR_BroodActivityUpload_13107 other = (S2CR_BroodActivityUpload_13107)obj;
            if (this.hasActivityType() != other.hasActivityType()) {
               return false;
            } else if (this.hasActivityType() && this.getActivityType() != other.getActivityType()) {
               return false;
            } else if (this.hasDropTime() != other.hasDropTime()) {
               return false;
            } else if (this.hasDropTime() && this.getDropTime() != other.getDropTime()) {
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

            if (this.hasDropTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDropTime();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getEndTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_BroodActivityUpload_13107 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_BroodActivityUpload_13107)PARSER.parseFrom(data);
      }

      public static S2CR_BroodActivityUpload_13107 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BroodActivityUpload_13107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BroodActivityUpload_13107 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_BroodActivityUpload_13107)PARSER.parseFrom(data);
      }

      public static S2CR_BroodActivityUpload_13107 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BroodActivityUpload_13107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BroodActivityUpload_13107 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_BroodActivityUpload_13107)PARSER.parseFrom(data);
      }

      public static S2CR_BroodActivityUpload_13107 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BroodActivityUpload_13107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BroodActivityUpload_13107 parseFrom(InputStream input) throws IOException {
         return (S2CR_BroodActivityUpload_13107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_BroodActivityUpload_13107 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BroodActivityUpload_13107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_BroodActivityUpload_13107 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_BroodActivityUpload_13107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_BroodActivityUpload_13107 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BroodActivityUpload_13107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_BroodActivityUpload_13107 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_BroodActivityUpload_13107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_BroodActivityUpload_13107 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BroodActivityUpload_13107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_BroodActivityUpload_13107 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_BroodActivityUpload_13107 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_BroodActivityUpload_13107> parser() {
         return PARSER;
      }

      public Parser<S2CR_BroodActivityUpload_13107> getParserForType() {
         return PARSER;
      }

      public S2CR_BroodActivityUpload_13107 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_BroodActivityUpload_13107OrBuilder {
         private int bitField0_;
         private int activityType_;
         private int dropTime_;
         private int endTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_BroodActivityUpload_13107_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_BroodActivityUpload_13107_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_BroodActivityUpload_13107.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossActivityMsg.S2CR_BroodActivityUpload_13107.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityType_ = 0;
            this.bitField0_ &= -2;
            this.dropTime_ = 0;
            this.bitField0_ &= -3;
            this.endTime_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_BroodActivityUpload_13107_descriptor;
         }

         public S2CR_BroodActivityUpload_13107 getDefaultInstanceForType() {
            return CrossActivityMsg.S2CR_BroodActivityUpload_13107.getDefaultInstance();
         }

         public S2CR_BroodActivityUpload_13107 build() {
            S2CR_BroodActivityUpload_13107 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_BroodActivityUpload_13107 buildPartial() {
            S2CR_BroodActivityUpload_13107 result = new S2CR_BroodActivityUpload_13107(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityType_ = this.activityType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.dropTime_ = this.dropTime_;
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
            if (other instanceof S2CR_BroodActivityUpload_13107) {
               return this.mergeFrom((S2CR_BroodActivityUpload_13107)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_BroodActivityUpload_13107 other) {
            if (other == CrossActivityMsg.S2CR_BroodActivityUpload_13107.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityType()) {
                  this.setActivityType(other.getActivityType());
               }

               if (other.hasDropTime()) {
                  this.setDropTime(other.getDropTime());
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
            } else if (!this.hasDropTime()) {
               return false;
            } else {
               return this.hasEndTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_BroodActivityUpload_13107 parsedMessage = null;

            try {
               parsedMessage = (S2CR_BroodActivityUpload_13107)CrossActivityMsg.S2CR_BroodActivityUpload_13107.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_BroodActivityUpload_13107)e.getUnfinishedMessage();
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

         public boolean hasDropTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDropTime() {
            return this.dropTime_;
         }

         public Builder setDropTime(int value) {
            this.bitField0_ |= 2;
            this.dropTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDropTime() {
            this.bitField0_ &= -3;
            this.dropTime_ = 0;
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_BroodActivitySettle_13108 extends GeneratedMessageV3 implements CR2S_BroodActivitySettle_13108OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYTYPE_FIELD_NUMBER = 1;
      private int activityType_;
      public static final int ENDTIME_FIELD_NUMBER = 2;
      private int endTime_;
      public static final int CROSSCHANGE_FIELD_NUMBER = 3;
      private boolean crossChange_;
      public static final int SERVERRANK_FIELD_NUMBER = 4;
      private ActivityRank serverRank_;
      public static final int TENRANK_FIELD_NUMBER = 5;
      private ActivityRank tenRank_;
      public static final int CROSSOPENDAY_FIELD_NUMBER = 6;
      private int crossOpenDay_;
      public static final int POOLTYPE_FIELD_NUMBER = 7;
      private int poolType_;
      private byte memoizedIsInitialized;
      private static final CR2S_BroodActivitySettle_13108 DEFAULT_INSTANCE = new CR2S_BroodActivitySettle_13108();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_BroodActivitySettle_13108> PARSER = new AbstractParser<CR2S_BroodActivitySettle_13108>() {
         public CR2S_BroodActivitySettle_13108 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_BroodActivitySettle_13108(input, extensionRegistry);
         }
      };

      private CR2S_BroodActivitySettle_13108(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_BroodActivitySettle_13108() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_BroodActivitySettle_13108();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_BroodActivitySettle_13108(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.endTime_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.crossChange_ = input.readBool();
                        break;
                     case 34:
                        ActivityRank.Builder subBuilder = null;
                        if ((this.bitField0_ & 8) != 0) {
                           subBuilder = this.serverRank_.toBuilder();
                        }

                        this.serverRank_ = (ActivityRank)input.readMessage(CrossActivityMsg.ActivityRank.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.serverRank_);
                           this.serverRank_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 8;
                        break;
                     case 42:
                        ActivityRank.Builder subBuilder = null;
                        if ((this.bitField0_ & 16) != 0) {
                           subBuilder = this.tenRank_.toBuilder();
                        }

                        this.tenRank_ = (ActivityRank)input.readMessage(CrossActivityMsg.ActivityRank.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.tenRank_);
                           this.tenRank_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 16;
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.crossOpenDay_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.poolType_ = input.readInt32();
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
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodActivitySettle_13108_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodActivitySettle_13108_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BroodActivitySettle_13108.class, Builder.class);
      }

      public boolean hasActivityType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityType() {
         return this.activityType_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public boolean hasCrossChange() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getCrossChange() {
         return this.crossChange_;
      }

      public boolean hasServerRank() {
         return (this.bitField0_ & 8) != 0;
      }

      public ActivityRank getServerRank() {
         return this.serverRank_ == null ? CrossActivityMsg.ActivityRank.getDefaultInstance() : this.serverRank_;
      }

      public ActivityRankOrBuilder getServerRankOrBuilder() {
         return this.serverRank_ == null ? CrossActivityMsg.ActivityRank.getDefaultInstance() : this.serverRank_;
      }

      public boolean hasTenRank() {
         return (this.bitField0_ & 16) != 0;
      }

      public ActivityRank getTenRank() {
         return this.tenRank_ == null ? CrossActivityMsg.ActivityRank.getDefaultInstance() : this.tenRank_;
      }

      public ActivityRankOrBuilder getTenRankOrBuilder() {
         return this.tenRank_ == null ? CrossActivityMsg.ActivityRank.getDefaultInstance() : this.tenRank_;
      }

      public boolean hasCrossOpenDay() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getCrossOpenDay() {
         return this.crossOpenDay_;
      }

      public boolean hasPoolType() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getPoolType() {
         return this.poolType_;
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
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasServerRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTenRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCrossOpenDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPoolType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getServerRank().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getTenRank().isInitialized()) {
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
            output.writeInt32(2, this.endTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.crossChange_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeMessage(4, this.getServerRank());
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeMessage(5, this.getTenRank());
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.crossOpenDay_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.poolType_);
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
               size += CodedOutputStream.computeInt32Size(2, this.endTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.crossChange_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeMessageSize(4, this.getServerRank());
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeMessageSize(5, this.getTenRank());
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.crossOpenDay_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.poolType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_BroodActivitySettle_13108)) {
            return super.equals(obj);
         } else {
            CR2S_BroodActivitySettle_13108 other = (CR2S_BroodActivitySettle_13108)obj;
            if (this.hasActivityType() != other.hasActivityType()) {
               return false;
            } else if (this.hasActivityType() && this.getActivityType() != other.getActivityType()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasCrossChange() != other.hasCrossChange()) {
               return false;
            } else if (this.hasCrossChange() && this.getCrossChange() != other.getCrossChange()) {
               return false;
            } else if (this.hasServerRank() != other.hasServerRank()) {
               return false;
            } else if (this.hasServerRank() && !this.getServerRank().equals(other.getServerRank())) {
               return false;
            } else if (this.hasTenRank() != other.hasTenRank()) {
               return false;
            } else if (this.hasTenRank() && !this.getTenRank().equals(other.getTenRank())) {
               return false;
            } else if (this.hasCrossOpenDay() != other.hasCrossOpenDay()) {
               return false;
            } else if (this.hasCrossOpenDay() && this.getCrossOpenDay() != other.getCrossOpenDay()) {
               return false;
            } else if (this.hasPoolType() != other.hasPoolType()) {
               return false;
            } else if (this.hasPoolType() && this.getPoolType() != other.getPoolType()) {
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

            if (this.hasEndTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.hasCrossChange()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getCrossChange());
            }

            if (this.hasServerRank()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getServerRank().hashCode();
            }

            if (this.hasTenRank()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getTenRank().hashCode();
            }

            if (this.hasCrossOpenDay()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getCrossOpenDay();
            }

            if (this.hasPoolType()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getPoolType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_BroodActivitySettle_13108 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_BroodActivitySettle_13108)PARSER.parseFrom(data);
      }

      public static CR2S_BroodActivitySettle_13108 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BroodActivitySettle_13108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BroodActivitySettle_13108 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_BroodActivitySettle_13108)PARSER.parseFrom(data);
      }

      public static CR2S_BroodActivitySettle_13108 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BroodActivitySettle_13108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BroodActivitySettle_13108 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_BroodActivitySettle_13108)PARSER.parseFrom(data);
      }

      public static CR2S_BroodActivitySettle_13108 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BroodActivitySettle_13108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BroodActivitySettle_13108 parseFrom(InputStream input) throws IOException {
         return (CR2S_BroodActivitySettle_13108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BroodActivitySettle_13108 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BroodActivitySettle_13108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BroodActivitySettle_13108 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_BroodActivitySettle_13108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_BroodActivitySettle_13108 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BroodActivitySettle_13108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BroodActivitySettle_13108 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_BroodActivitySettle_13108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BroodActivitySettle_13108 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BroodActivitySettle_13108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_BroodActivitySettle_13108 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_BroodActivitySettle_13108 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_BroodActivitySettle_13108> parser() {
         return PARSER;
      }

      public Parser<CR2S_BroodActivitySettle_13108> getParserForType() {
         return PARSER;
      }

      public CR2S_BroodActivitySettle_13108 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_BroodActivitySettle_13108OrBuilder {
         private int bitField0_;
         private int activityType_;
         private int endTime_;
         private boolean crossChange_;
         private ActivityRank serverRank_;
         private SingleFieldBuilderV3<ActivityRank, ActivityRank.Builder, ActivityRankOrBuilder> serverRankBuilder_;
         private ActivityRank tenRank_;
         private SingleFieldBuilderV3<ActivityRank, ActivityRank.Builder, ActivityRankOrBuilder> tenRankBuilder_;
         private int crossOpenDay_;
         private int poolType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodActivitySettle_13108_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodActivitySettle_13108_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BroodActivitySettle_13108.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossActivityMsg.CR2S_BroodActivitySettle_13108.alwaysUseFieldBuilders) {
               this.getServerRankFieldBuilder();
               this.getTenRankFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.activityType_ = 0;
            this.bitField0_ &= -2;
            this.endTime_ = 0;
            this.bitField0_ &= -3;
            this.crossChange_ = false;
            this.bitField0_ &= -5;
            if (this.serverRankBuilder_ == null) {
               this.serverRank_ = null;
            } else {
               this.serverRankBuilder_.clear();
            }

            this.bitField0_ &= -9;
            if (this.tenRankBuilder_ == null) {
               this.tenRank_ = null;
            } else {
               this.tenRankBuilder_.clear();
            }

            this.bitField0_ &= -17;
            this.crossOpenDay_ = 0;
            this.bitField0_ &= -33;
            this.poolType_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodActivitySettle_13108_descriptor;
         }

         public CR2S_BroodActivitySettle_13108 getDefaultInstanceForType() {
            return CrossActivityMsg.CR2S_BroodActivitySettle_13108.getDefaultInstance();
         }

         public CR2S_BroodActivitySettle_13108 build() {
            CR2S_BroodActivitySettle_13108 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_BroodActivitySettle_13108 buildPartial() {
            CR2S_BroodActivitySettle_13108 result = new CR2S_BroodActivitySettle_13108(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityType_ = this.activityType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.crossChange_ = this.crossChange_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               if (this.serverRankBuilder_ == null) {
                  result.serverRank_ = this.serverRank_;
               } else {
                  result.serverRank_ = (ActivityRank)this.serverRankBuilder_.build();
               }

               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               if (this.tenRankBuilder_ == null) {
                  result.tenRank_ = this.tenRank_;
               } else {
                  result.tenRank_ = (ActivityRank)this.tenRankBuilder_.build();
               }

               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.crossOpenDay_ = this.crossOpenDay_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.poolType_ = this.poolType_;
               to_bitField0_ |= 64;
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
            if (other instanceof CR2S_BroodActivitySettle_13108) {
               return this.mergeFrom((CR2S_BroodActivitySettle_13108)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_BroodActivitySettle_13108 other) {
            if (other == CrossActivityMsg.CR2S_BroodActivitySettle_13108.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityType()) {
                  this.setActivityType(other.getActivityType());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasCrossChange()) {
                  this.setCrossChange(other.getCrossChange());
               }

               if (other.hasServerRank()) {
                  this.mergeServerRank(other.getServerRank());
               }

               if (other.hasTenRank()) {
                  this.mergeTenRank(other.getTenRank());
               }

               if (other.hasCrossOpenDay()) {
                  this.setCrossOpenDay(other.getCrossOpenDay());
               }

               if (other.hasPoolType()) {
                  this.setPoolType(other.getPoolType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActivityType()) {
               return false;
            } else if (!this.hasEndTime()) {
               return false;
            } else if (!this.hasServerRank()) {
               return false;
            } else if (!this.hasTenRank()) {
               return false;
            } else if (!this.hasCrossOpenDay()) {
               return false;
            } else if (!this.hasPoolType()) {
               return false;
            } else if (!this.getServerRank().isInitialized()) {
               return false;
            } else {
               return this.getTenRank().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_BroodActivitySettle_13108 parsedMessage = null;

            try {
               parsedMessage = (CR2S_BroodActivitySettle_13108)CrossActivityMsg.CR2S_BroodActivitySettle_13108.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_BroodActivitySettle_13108)e.getUnfinishedMessage();
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

         public boolean hasCrossChange() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getCrossChange() {
            return this.crossChange_;
         }

         public Builder setCrossChange(boolean value) {
            this.bitField0_ |= 4;
            this.crossChange_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCrossChange() {
            this.bitField0_ &= -5;
            this.crossChange_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasServerRank() {
            return (this.bitField0_ & 8) != 0;
         }

         public ActivityRank getServerRank() {
            if (this.serverRankBuilder_ == null) {
               return this.serverRank_ == null ? CrossActivityMsg.ActivityRank.getDefaultInstance() : this.serverRank_;
            } else {
               return (ActivityRank)this.serverRankBuilder_.getMessage();
            }
         }

         public Builder setServerRank(ActivityRank value) {
            if (this.serverRankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.serverRank_ = value;
               this.onChanged();
            } else {
               this.serverRankBuilder_.setMessage(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder setServerRank(ActivityRank.Builder builderForValue) {
            if (this.serverRankBuilder_ == null) {
               this.serverRank_ = builderForValue.build();
               this.onChanged();
            } else {
               this.serverRankBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder mergeServerRank(ActivityRank value) {
            if (this.serverRankBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0 && this.serverRank_ != null && this.serverRank_ != CrossActivityMsg.ActivityRank.getDefaultInstance()) {
                  this.serverRank_ = CrossActivityMsg.ActivityRank.newBuilder(this.serverRank_).mergeFrom(value).buildPartial();
               } else {
                  this.serverRank_ = value;
               }

               this.onChanged();
            } else {
               this.serverRankBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder clearServerRank() {
            if (this.serverRankBuilder_ == null) {
               this.serverRank_ = null;
               this.onChanged();
            } else {
               this.serverRankBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public ActivityRank.Builder getServerRankBuilder() {
            this.bitField0_ |= 8;
            this.onChanged();
            return (ActivityRank.Builder)this.getServerRankFieldBuilder().getBuilder();
         }

         public ActivityRankOrBuilder getServerRankOrBuilder() {
            if (this.serverRankBuilder_ != null) {
               return (ActivityRankOrBuilder)this.serverRankBuilder_.getMessageOrBuilder();
            } else {
               return this.serverRank_ == null ? CrossActivityMsg.ActivityRank.getDefaultInstance() : this.serverRank_;
            }
         }

         private SingleFieldBuilderV3<ActivityRank, ActivityRank.Builder, ActivityRankOrBuilder> getServerRankFieldBuilder() {
            if (this.serverRankBuilder_ == null) {
               this.serverRankBuilder_ = new SingleFieldBuilderV3(this.getServerRank(), this.getParentForChildren(), this.isClean());
               this.serverRank_ = null;
            }

            return this.serverRankBuilder_;
         }

         public boolean hasTenRank() {
            return (this.bitField0_ & 16) != 0;
         }

         public ActivityRank getTenRank() {
            if (this.tenRankBuilder_ == null) {
               return this.tenRank_ == null ? CrossActivityMsg.ActivityRank.getDefaultInstance() : this.tenRank_;
            } else {
               return (ActivityRank)this.tenRankBuilder_.getMessage();
            }
         }

         public Builder setTenRank(ActivityRank value) {
            if (this.tenRankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.tenRank_ = value;
               this.onChanged();
            } else {
               this.tenRankBuilder_.setMessage(value);
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder setTenRank(ActivityRank.Builder builderForValue) {
            if (this.tenRankBuilder_ == null) {
               this.tenRank_ = builderForValue.build();
               this.onChanged();
            } else {
               this.tenRankBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder mergeTenRank(ActivityRank value) {
            if (this.tenRankBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0 && this.tenRank_ != null && this.tenRank_ != CrossActivityMsg.ActivityRank.getDefaultInstance()) {
                  this.tenRank_ = CrossActivityMsg.ActivityRank.newBuilder(this.tenRank_).mergeFrom(value).buildPartial();
               } else {
                  this.tenRank_ = value;
               }

               this.onChanged();
            } else {
               this.tenRankBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder clearTenRank() {
            if (this.tenRankBuilder_ == null) {
               this.tenRank_ = null;
               this.onChanged();
            } else {
               this.tenRankBuilder_.clear();
            }

            this.bitField0_ &= -17;
            return this;
         }

         public ActivityRank.Builder getTenRankBuilder() {
            this.bitField0_ |= 16;
            this.onChanged();
            return (ActivityRank.Builder)this.getTenRankFieldBuilder().getBuilder();
         }

         public ActivityRankOrBuilder getTenRankOrBuilder() {
            if (this.tenRankBuilder_ != null) {
               return (ActivityRankOrBuilder)this.tenRankBuilder_.getMessageOrBuilder();
            } else {
               return this.tenRank_ == null ? CrossActivityMsg.ActivityRank.getDefaultInstance() : this.tenRank_;
            }
         }

         private SingleFieldBuilderV3<ActivityRank, ActivityRank.Builder, ActivityRankOrBuilder> getTenRankFieldBuilder() {
            if (this.tenRankBuilder_ == null) {
               this.tenRankBuilder_ = new SingleFieldBuilderV3(this.getTenRank(), this.getParentForChildren(), this.isClean());
               this.tenRank_ = null;
            }

            return this.tenRankBuilder_;
         }

         public boolean hasCrossOpenDay() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getCrossOpenDay() {
            return this.crossOpenDay_;
         }

         public Builder setCrossOpenDay(int value) {
            this.bitField0_ |= 32;
            this.crossOpenDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCrossOpenDay() {
            this.bitField0_ &= -33;
            this.crossOpenDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPoolType() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getPoolType() {
            return this.poolType_;
         }

         public Builder setPoolType(int value) {
            this.bitField0_ |= 64;
            this.poolType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPoolType() {
            this.bitField0_ &= -65;
            this.poolType_ = 0;
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

   public static final class CR2S_BroodRankInfo_13109 extends GeneratedMessageV3 implements CR2S_BroodRankInfo_13109OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYID_FIELD_NUMBER = 1;
      private int activityId_;
      public static final int MODULEID_FIELD_NUMBER = 2;
      private int moduleId_;
      public static final int PARAMS_FIELD_NUMBER = 3;
      private LazyStringList params_;
      public static final int LIMIT_FIELD_NUMBER = 4;
      private int limit_;
      private byte memoizedIsInitialized;
      private static final CR2S_BroodRankInfo_13109 DEFAULT_INSTANCE = new CR2S_BroodRankInfo_13109();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_BroodRankInfo_13109> PARSER = new AbstractParser<CR2S_BroodRankInfo_13109>() {
         public CR2S_BroodRankInfo_13109 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_BroodRankInfo_13109(input, extensionRegistry);
         }
      };

      private CR2S_BroodRankInfo_13109(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_BroodRankInfo_13109() {
         this.memoizedIsInitialized = -1;
         this.params_ = LazyStringArrayList.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_BroodRankInfo_13109();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_BroodRankInfo_13109(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.moduleId_ = input.readInt32();
                        break;
                     case 26:
                        ByteString bs = input.readBytes();
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.params_ = new LazyStringArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.params_.add(bs);
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.limit_ = input.readInt32();
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
                  this.params_ = this.params_.getUnmodifiableView();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodRankInfo_13109_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodRankInfo_13109_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BroodRankInfo_13109.class, Builder.class);
      }

      public boolean hasActivityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityId() {
         return this.activityId_;
      }

      public boolean hasModuleId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getModuleId() {
         return this.moduleId_;
      }

      public ProtocolStringList getParamsList() {
         return this.params_;
      }

      public int getParamsCount() {
         return this.params_.size();
      }

      public String getParams(int index) {
         return (String)this.params_.get(index);
      }

      public ByteString getParamsBytes(int index) {
         return this.params_.getByteString(index);
      }

      public boolean hasLimit() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLimit() {
         return this.limit_;
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
         } else if (!this.hasModuleId()) {
            this.memoizedIsInitialized = 0;
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.moduleId_);
         }

         for(int i = 0; i < this.params_.size(); ++i) {
            GeneratedMessageV3.writeString(output, 3, this.params_.getRaw(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.limit_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.moduleId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.params_.size(); ++i) {
               dataSize += computeStringSizeNoTag(this.params_.getRaw(i));
            }

            size += dataSize;
            size += 1 * this.getParamsList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.limit_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_BroodRankInfo_13109)) {
            return super.equals(obj);
         } else {
            CR2S_BroodRankInfo_13109 other = (CR2S_BroodRankInfo_13109)obj;
            if (this.hasActivityId() != other.hasActivityId()) {
               return false;
            } else if (this.hasActivityId() && this.getActivityId() != other.getActivityId()) {
               return false;
            } else if (this.hasModuleId() != other.hasModuleId()) {
               return false;
            } else if (this.hasModuleId() && this.getModuleId() != other.getModuleId()) {
               return false;
            } else if (!this.getParamsList().equals(other.getParamsList())) {
               return false;
            } else if (this.hasLimit() != other.hasLimit()) {
               return false;
            } else if (this.hasLimit() && this.getLimit() != other.getLimit()) {
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

            if (this.hasModuleId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getModuleId();
            }

            if (this.getParamsCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getParamsList().hashCode();
            }

            if (this.hasLimit()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getLimit();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_BroodRankInfo_13109 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_BroodRankInfo_13109)PARSER.parseFrom(data);
      }

      public static CR2S_BroodRankInfo_13109 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BroodRankInfo_13109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BroodRankInfo_13109 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_BroodRankInfo_13109)PARSER.parseFrom(data);
      }

      public static CR2S_BroodRankInfo_13109 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BroodRankInfo_13109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BroodRankInfo_13109 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_BroodRankInfo_13109)PARSER.parseFrom(data);
      }

      public static CR2S_BroodRankInfo_13109 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BroodRankInfo_13109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BroodRankInfo_13109 parseFrom(InputStream input) throws IOException {
         return (CR2S_BroodRankInfo_13109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BroodRankInfo_13109 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BroodRankInfo_13109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BroodRankInfo_13109 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_BroodRankInfo_13109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_BroodRankInfo_13109 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BroodRankInfo_13109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BroodRankInfo_13109 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_BroodRankInfo_13109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BroodRankInfo_13109 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BroodRankInfo_13109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_BroodRankInfo_13109 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_BroodRankInfo_13109 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_BroodRankInfo_13109> parser() {
         return PARSER;
      }

      public Parser<CR2S_BroodRankInfo_13109> getParserForType() {
         return PARSER;
      }

      public CR2S_BroodRankInfo_13109 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_BroodRankInfo_13109OrBuilder {
         private int bitField0_;
         private int activityId_;
         private int moduleId_;
         private LazyStringList params_;
         private int limit_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodRankInfo_13109_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodRankInfo_13109_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BroodRankInfo_13109.class, Builder.class);
         }

         private Builder() {
            this.params_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.params_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossActivityMsg.CR2S_BroodRankInfo_13109.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityId_ = 0;
            this.bitField0_ &= -2;
            this.moduleId_ = 0;
            this.bitField0_ &= -3;
            this.params_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -5;
            this.limit_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodRankInfo_13109_descriptor;
         }

         public CR2S_BroodRankInfo_13109 getDefaultInstanceForType() {
            return CrossActivityMsg.CR2S_BroodRankInfo_13109.getDefaultInstance();
         }

         public CR2S_BroodRankInfo_13109 build() {
            CR2S_BroodRankInfo_13109 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_BroodRankInfo_13109 buildPartial() {
            CR2S_BroodRankInfo_13109 result = new CR2S_BroodRankInfo_13109(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityId_ = this.activityId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.moduleId_ = this.moduleId_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.params_ = this.params_.getUnmodifiableView();
               this.bitField0_ &= -5;
            }

            result.params_ = this.params_;
            if ((from_bitField0_ & 8) != 0) {
               result.limit_ = this.limit_;
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
            if (other instanceof CR2S_BroodRankInfo_13109) {
               return this.mergeFrom((CR2S_BroodRankInfo_13109)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_BroodRankInfo_13109 other) {
            if (other == CrossActivityMsg.CR2S_BroodRankInfo_13109.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityId()) {
                  this.setActivityId(other.getActivityId());
               }

               if (other.hasModuleId()) {
                  this.setModuleId(other.getModuleId());
               }

               if (!other.params_.isEmpty()) {
                  if (this.params_.isEmpty()) {
                     this.params_ = other.params_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureParamsIsMutable();
                     this.params_.addAll(other.params_);
                  }

                  this.onChanged();
               }

               if (other.hasLimit()) {
                  this.setLimit(other.getLimit());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActivityId()) {
               return false;
            } else {
               return this.hasModuleId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_BroodRankInfo_13109 parsedMessage = null;

            try {
               parsedMessage = (CR2S_BroodRankInfo_13109)CrossActivityMsg.CR2S_BroodRankInfo_13109.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_BroodRankInfo_13109)e.getUnfinishedMessage();
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

         public boolean hasModuleId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getModuleId() {
            return this.moduleId_;
         }

         public Builder setModuleId(int value) {
            this.bitField0_ |= 2;
            this.moduleId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModuleId() {
            this.bitField0_ &= -3;
            this.moduleId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureParamsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.params_ = new LazyStringArrayList(this.params_);
               this.bitField0_ |= 4;
            }

         }

         public ProtocolStringList getParamsList() {
            return this.params_.getUnmodifiableView();
         }

         public int getParamsCount() {
            return this.params_.size();
         }

         public String getParams(int index) {
            return (String)this.params_.get(index);
         }

         public ByteString getParamsBytes(int index) {
            return this.params_.getByteString(index);
         }

         public Builder setParams(int index, String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureParamsIsMutable();
               this.params_.set(index, value);
               this.onChanged();
               return this;
            }
         }

         public Builder addParams(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureParamsIsMutable();
               this.params_.add(value);
               this.onChanged();
               return this;
            }
         }

         public Builder addAllParams(Iterable<String> values) {
            this.ensureParamsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.params_);
            this.onChanged();
            return this;
         }

         public Builder clearParams() {
            this.params_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         public Builder addParamsBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureParamsIsMutable();
               this.params_.add(value);
               this.onChanged();
               return this;
            }
         }

         public boolean hasLimit() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getLimit() {
            return this.limit_;
         }

         public Builder setLimit(int value) {
            this.bitField0_ |= 8;
            this.limit_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLimit() {
            this.bitField0_ &= -9;
            this.limit_ = 0;
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

   public static final class S2CR_Activity8Upload_13110 extends GeneratedMessageV3 implements S2CR_Activity8Upload_13110OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYTYPE_FIELD_NUMBER = 1;
      private int activityType_;
      public static final int DROPTIME_FIELD_NUMBER = 2;
      private int dropTime_;
      public static final int ENDTIME_FIELD_NUMBER = 3;
      private int endTime_;
      public static final int ACTOPENDAY_FIELD_NUMBER = 4;
      private int actOpenDay_;
      private byte memoizedIsInitialized;
      private static final S2CR_Activity8Upload_13110 DEFAULT_INSTANCE = new S2CR_Activity8Upload_13110();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Activity8Upload_13110> PARSER = new AbstractParser<S2CR_Activity8Upload_13110>() {
         public S2CR_Activity8Upload_13110 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Activity8Upload_13110(input, extensionRegistry);
         }
      };

      private S2CR_Activity8Upload_13110(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Activity8Upload_13110() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Activity8Upload_13110();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Activity8Upload_13110(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.dropTime_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.endTime_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.actOpenDay_ = input.readInt32();
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
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_Activity8Upload_13110_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_Activity8Upload_13110_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Activity8Upload_13110.class, Builder.class);
      }

      public boolean hasActivityType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityType() {
         return this.activityType_;
      }

      public boolean hasDropTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDropTime() {
         return this.dropTime_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public boolean hasActOpenDay() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getActOpenDay() {
         return this.actOpenDay_;
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
         } else if (!this.hasDropTime()) {
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
            output.writeInt32(2, this.dropTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.endTime_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.actOpenDay_);
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
               size += CodedOutputStream.computeInt32Size(2, this.dropTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.endTime_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.actOpenDay_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_Activity8Upload_13110)) {
            return super.equals(obj);
         } else {
            S2CR_Activity8Upload_13110 other = (S2CR_Activity8Upload_13110)obj;
            if (this.hasActivityType() != other.hasActivityType()) {
               return false;
            } else if (this.hasActivityType() && this.getActivityType() != other.getActivityType()) {
               return false;
            } else if (this.hasDropTime() != other.hasDropTime()) {
               return false;
            } else if (this.hasDropTime() && this.getDropTime() != other.getDropTime()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasActOpenDay() != other.hasActOpenDay()) {
               return false;
            } else if (this.hasActOpenDay() && this.getActOpenDay() != other.getActOpenDay()) {
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

            if (this.hasDropTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDropTime();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.hasActOpenDay()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getActOpenDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_Activity8Upload_13110 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Activity8Upload_13110)PARSER.parseFrom(data);
      }

      public static S2CR_Activity8Upload_13110 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Activity8Upload_13110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Activity8Upload_13110 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Activity8Upload_13110)PARSER.parseFrom(data);
      }

      public static S2CR_Activity8Upload_13110 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Activity8Upload_13110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Activity8Upload_13110 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Activity8Upload_13110)PARSER.parseFrom(data);
      }

      public static S2CR_Activity8Upload_13110 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Activity8Upload_13110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Activity8Upload_13110 parseFrom(InputStream input) throws IOException {
         return (S2CR_Activity8Upload_13110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Activity8Upload_13110 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Activity8Upload_13110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Activity8Upload_13110 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Activity8Upload_13110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Activity8Upload_13110 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Activity8Upload_13110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Activity8Upload_13110 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Activity8Upload_13110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Activity8Upload_13110 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Activity8Upload_13110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Activity8Upload_13110 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Activity8Upload_13110 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Activity8Upload_13110> parser() {
         return PARSER;
      }

      public Parser<S2CR_Activity8Upload_13110> getParserForType() {
         return PARSER;
      }

      public S2CR_Activity8Upload_13110 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Activity8Upload_13110OrBuilder {
         private int bitField0_;
         private int activityType_;
         private int dropTime_;
         private int endTime_;
         private int actOpenDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_Activity8Upload_13110_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_Activity8Upload_13110_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Activity8Upload_13110.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossActivityMsg.S2CR_Activity8Upload_13110.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityType_ = 0;
            this.bitField0_ &= -2;
            this.dropTime_ = 0;
            this.bitField0_ &= -3;
            this.endTime_ = 0;
            this.bitField0_ &= -5;
            this.actOpenDay_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_Activity8Upload_13110_descriptor;
         }

         public S2CR_Activity8Upload_13110 getDefaultInstanceForType() {
            return CrossActivityMsg.S2CR_Activity8Upload_13110.getDefaultInstance();
         }

         public S2CR_Activity8Upload_13110 build() {
            S2CR_Activity8Upload_13110 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Activity8Upload_13110 buildPartial() {
            S2CR_Activity8Upload_13110 result = new S2CR_Activity8Upload_13110(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityType_ = this.activityType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.dropTime_ = this.dropTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.actOpenDay_ = this.actOpenDay_;
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
            if (other instanceof S2CR_Activity8Upload_13110) {
               return this.mergeFrom((S2CR_Activity8Upload_13110)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Activity8Upload_13110 other) {
            if (other == CrossActivityMsg.S2CR_Activity8Upload_13110.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityType()) {
                  this.setActivityType(other.getActivityType());
               }

               if (other.hasDropTime()) {
                  this.setDropTime(other.getDropTime());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasActOpenDay()) {
                  this.setActOpenDay(other.getActOpenDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActivityType()) {
               return false;
            } else if (!this.hasDropTime()) {
               return false;
            } else {
               return this.hasEndTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_Activity8Upload_13110 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Activity8Upload_13110)CrossActivityMsg.S2CR_Activity8Upload_13110.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Activity8Upload_13110)e.getUnfinishedMessage();
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

         public boolean hasDropTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDropTime() {
            return this.dropTime_;
         }

         public Builder setDropTime(int value) {
            this.bitField0_ |= 2;
            this.dropTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDropTime() {
            this.bitField0_ &= -3;
            this.dropTime_ = 0;
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

         public boolean hasActOpenDay() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getActOpenDay() {
            return this.actOpenDay_;
         }

         public Builder setActOpenDay(int value) {
            this.bitField0_ |= 8;
            this.actOpenDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActOpenDay() {
            this.bitField0_ &= -9;
            this.actOpenDay_ = 0;
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

   public static final class S2CR_UpdateBroodRankScroe_13111 extends GeneratedMessageV3 implements S2CR_UpdateBroodRankScroe_13111OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYID_FIELD_NUMBER = 1;
      private int activityId_;
      public static final int ENDTIME_FIELD_NUMBER = 2;
      private int endTime_;
      public static final int ACTIVITYTYPE_FIELD_NUMBER = 3;
      private int activityType_;
      public static final int ENDSCORE_FIELD_NUMBER = 4;
      private int endScore_;
      private byte memoizedIsInitialized;
      private static final S2CR_UpdateBroodRankScroe_13111 DEFAULT_INSTANCE = new S2CR_UpdateBroodRankScroe_13111();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UpdateBroodRankScroe_13111> PARSER = new AbstractParser<S2CR_UpdateBroodRankScroe_13111>() {
         public S2CR_UpdateBroodRankScroe_13111 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UpdateBroodRankScroe_13111(input, extensionRegistry);
         }
      };

      private S2CR_UpdateBroodRankScroe_13111(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UpdateBroodRankScroe_13111() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UpdateBroodRankScroe_13111();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UpdateBroodRankScroe_13111(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.endTime_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.activityType_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.endScore_ = input.readInt32();
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
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_UpdateBroodRankScroe_13111_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_UpdateBroodRankScroe_13111_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UpdateBroodRankScroe_13111.class, Builder.class);
      }

      public boolean hasActivityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityId() {
         return this.activityId_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public boolean hasActivityType() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getActivityType() {
         return this.activityType_;
      }

      public boolean hasEndScore() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getEndScore() {
         return this.endScore_;
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
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasActivityType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEndScore()) {
            this.memoizedIsInitialized = 0;
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.endTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.activityType_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.endScore_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.endTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.activityType_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.endScore_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UpdateBroodRankScroe_13111)) {
            return super.equals(obj);
         } else {
            S2CR_UpdateBroodRankScroe_13111 other = (S2CR_UpdateBroodRankScroe_13111)obj;
            if (this.hasActivityId() != other.hasActivityId()) {
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
            } else if (this.hasEndScore() != other.hasEndScore()) {
               return false;
            } else if (this.hasEndScore() && this.getEndScore() != other.getEndScore()) {
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

            if (this.hasEndTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.hasActivityType()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getActivityType();
            }

            if (this.hasEndScore()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getEndScore();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UpdateBroodRankScroe_13111 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UpdateBroodRankScroe_13111)PARSER.parseFrom(data);
      }

      public static S2CR_UpdateBroodRankScroe_13111 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UpdateBroodRankScroe_13111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UpdateBroodRankScroe_13111 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UpdateBroodRankScroe_13111)PARSER.parseFrom(data);
      }

      public static S2CR_UpdateBroodRankScroe_13111 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UpdateBroodRankScroe_13111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UpdateBroodRankScroe_13111 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UpdateBroodRankScroe_13111)PARSER.parseFrom(data);
      }

      public static S2CR_UpdateBroodRankScroe_13111 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UpdateBroodRankScroe_13111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UpdateBroodRankScroe_13111 parseFrom(InputStream input) throws IOException {
         return (S2CR_UpdateBroodRankScroe_13111)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UpdateBroodRankScroe_13111 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UpdateBroodRankScroe_13111)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UpdateBroodRankScroe_13111 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UpdateBroodRankScroe_13111)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UpdateBroodRankScroe_13111 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UpdateBroodRankScroe_13111)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UpdateBroodRankScroe_13111 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UpdateBroodRankScroe_13111)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UpdateBroodRankScroe_13111 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UpdateBroodRankScroe_13111)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UpdateBroodRankScroe_13111 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UpdateBroodRankScroe_13111 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UpdateBroodRankScroe_13111> parser() {
         return PARSER;
      }

      public Parser<S2CR_UpdateBroodRankScroe_13111> getParserForType() {
         return PARSER;
      }

      public S2CR_UpdateBroodRankScroe_13111 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UpdateBroodRankScroe_13111OrBuilder {
         private int bitField0_;
         private int activityId_;
         private int endTime_;
         private int activityType_;
         private int endScore_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_UpdateBroodRankScroe_13111_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_UpdateBroodRankScroe_13111_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UpdateBroodRankScroe_13111.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossActivityMsg.S2CR_UpdateBroodRankScroe_13111.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityId_ = 0;
            this.bitField0_ &= -2;
            this.endTime_ = 0;
            this.bitField0_ &= -3;
            this.activityType_ = 0;
            this.bitField0_ &= -5;
            this.endScore_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_UpdateBroodRankScroe_13111_descriptor;
         }

         public S2CR_UpdateBroodRankScroe_13111 getDefaultInstanceForType() {
            return CrossActivityMsg.S2CR_UpdateBroodRankScroe_13111.getDefaultInstance();
         }

         public S2CR_UpdateBroodRankScroe_13111 build() {
            S2CR_UpdateBroodRankScroe_13111 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UpdateBroodRankScroe_13111 buildPartial() {
            S2CR_UpdateBroodRankScroe_13111 result = new S2CR_UpdateBroodRankScroe_13111(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityId_ = this.activityId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.activityType_ = this.activityType_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.endScore_ = this.endScore_;
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
            if (other instanceof S2CR_UpdateBroodRankScroe_13111) {
               return this.mergeFrom((S2CR_UpdateBroodRankScroe_13111)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UpdateBroodRankScroe_13111 other) {
            if (other == CrossActivityMsg.S2CR_UpdateBroodRankScroe_13111.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityId()) {
                  this.setActivityId(other.getActivityId());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasActivityType()) {
                  this.setActivityType(other.getActivityType());
               }

               if (other.hasEndScore()) {
                  this.setEndScore(other.getEndScore());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActivityId()) {
               return false;
            } else if (!this.hasEndTime()) {
               return false;
            } else if (!this.hasActivityType()) {
               return false;
            } else {
               return this.hasEndScore();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UpdateBroodRankScroe_13111 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UpdateBroodRankScroe_13111)CrossActivityMsg.S2CR_UpdateBroodRankScroe_13111.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UpdateBroodRankScroe_13111)e.getUnfinishedMessage();
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

         public boolean hasActivityType() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getActivityType() {
            return this.activityType_;
         }

         public Builder setActivityType(int value) {
            this.bitField0_ |= 4;
            this.activityType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityType() {
            this.bitField0_ &= -5;
            this.activityType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEndScore() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getEndScore() {
            return this.endScore_;
         }

         public Builder setEndScore(int value) {
            this.bitField0_ |= 8;
            this.endScore_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndScore() {
            this.bitField0_ &= -9;
            this.endScore_ = 0;
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

   public static final class CR2S_BroodActivityInfo_13112 extends GeneratedMessageV3 implements CR2S_BroodActivityInfo_13112OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TOTALSCORE_FIELD_NUMBER = 1;
      private int totalScore_;
      public static final int JOINSERVERS_FIELD_NUMBER = 2;
      private Internal.IntList joinServers_;
      private byte memoizedIsInitialized;
      private static final CR2S_BroodActivityInfo_13112 DEFAULT_INSTANCE = new CR2S_BroodActivityInfo_13112();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_BroodActivityInfo_13112> PARSER = new AbstractParser<CR2S_BroodActivityInfo_13112>() {
         public CR2S_BroodActivityInfo_13112 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_BroodActivityInfo_13112(input, extensionRegistry);
         }
      };

      private CR2S_BroodActivityInfo_13112(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_BroodActivityInfo_13112() {
         this.memoizedIsInitialized = -1;
         this.joinServers_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_BroodActivityInfo_13112();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_BroodActivityInfo_13112(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.totalScore_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.joinServers_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.joinServers_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.joinServers_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.joinServers_.addInt(input.readInt32());
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
                  this.joinServers_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodActivityInfo_13112_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodActivityInfo_13112_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BroodActivityInfo_13112.class, Builder.class);
      }

      public boolean hasTotalScore() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTotalScore() {
         return this.totalScore_;
      }

      public List<Integer> getJoinServersList() {
         return this.joinServers_;
      }

      public int getJoinServersCount() {
         return this.joinServers_.size();
      }

      public int getJoinServers(int index) {
         return this.joinServers_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTotalScore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.totalScore_);
         }

         for(int i = 0; i < this.joinServers_.size(); ++i) {
            output.writeInt32(2, this.joinServers_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.totalScore_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.joinServers_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.joinServers_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getJoinServersList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_BroodActivityInfo_13112)) {
            return super.equals(obj);
         } else {
            CR2S_BroodActivityInfo_13112 other = (CR2S_BroodActivityInfo_13112)obj;
            if (this.hasTotalScore() != other.hasTotalScore()) {
               return false;
            } else if (this.hasTotalScore() && this.getTotalScore() != other.getTotalScore()) {
               return false;
            } else if (!this.getJoinServersList().equals(other.getJoinServersList())) {
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
            if (this.hasTotalScore()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTotalScore();
            }

            if (this.getJoinServersCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getJoinServersList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_BroodActivityInfo_13112 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_BroodActivityInfo_13112)PARSER.parseFrom(data);
      }

      public static CR2S_BroodActivityInfo_13112 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BroodActivityInfo_13112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BroodActivityInfo_13112 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_BroodActivityInfo_13112)PARSER.parseFrom(data);
      }

      public static CR2S_BroodActivityInfo_13112 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BroodActivityInfo_13112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BroodActivityInfo_13112 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_BroodActivityInfo_13112)PARSER.parseFrom(data);
      }

      public static CR2S_BroodActivityInfo_13112 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BroodActivityInfo_13112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BroodActivityInfo_13112 parseFrom(InputStream input) throws IOException {
         return (CR2S_BroodActivityInfo_13112)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BroodActivityInfo_13112 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BroodActivityInfo_13112)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BroodActivityInfo_13112 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_BroodActivityInfo_13112)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_BroodActivityInfo_13112 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BroodActivityInfo_13112)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BroodActivityInfo_13112 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_BroodActivityInfo_13112)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BroodActivityInfo_13112 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BroodActivityInfo_13112)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_BroodActivityInfo_13112 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_BroodActivityInfo_13112 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_BroodActivityInfo_13112> parser() {
         return PARSER;
      }

      public Parser<CR2S_BroodActivityInfo_13112> getParserForType() {
         return PARSER;
      }

      public CR2S_BroodActivityInfo_13112 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_BroodActivityInfo_13112OrBuilder {
         private int bitField0_;
         private int totalScore_;
         private Internal.IntList joinServers_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodActivityInfo_13112_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodActivityInfo_13112_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BroodActivityInfo_13112.class, Builder.class);
         }

         private Builder() {
            this.joinServers_ = CrossActivityMsg.CR2S_BroodActivityInfo_13112.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.joinServers_ = CrossActivityMsg.CR2S_BroodActivityInfo_13112.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossActivityMsg.CR2S_BroodActivityInfo_13112.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.totalScore_ = 0;
            this.bitField0_ &= -2;
            this.joinServers_ = CrossActivityMsg.CR2S_BroodActivityInfo_13112.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodActivityInfo_13112_descriptor;
         }

         public CR2S_BroodActivityInfo_13112 getDefaultInstanceForType() {
            return CrossActivityMsg.CR2S_BroodActivityInfo_13112.getDefaultInstance();
         }

         public CR2S_BroodActivityInfo_13112 build() {
            CR2S_BroodActivityInfo_13112 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_BroodActivityInfo_13112 buildPartial() {
            CR2S_BroodActivityInfo_13112 result = new CR2S_BroodActivityInfo_13112(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.totalScore_ = this.totalScore_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.joinServers_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.joinServers_ = this.joinServers_;
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
            if (other instanceof CR2S_BroodActivityInfo_13112) {
               return this.mergeFrom((CR2S_BroodActivityInfo_13112)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_BroodActivityInfo_13112 other) {
            if (other == CrossActivityMsg.CR2S_BroodActivityInfo_13112.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTotalScore()) {
                  this.setTotalScore(other.getTotalScore());
               }

               if (!other.joinServers_.isEmpty()) {
                  if (this.joinServers_.isEmpty()) {
                     this.joinServers_ = other.joinServers_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureJoinServersIsMutable();
                     this.joinServers_.addAll(other.joinServers_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTotalScore();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_BroodActivityInfo_13112 parsedMessage = null;

            try {
               parsedMessage = (CR2S_BroodActivityInfo_13112)CrossActivityMsg.CR2S_BroodActivityInfo_13112.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_BroodActivityInfo_13112)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTotalScore() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTotalScore() {
            return this.totalScore_;
         }

         public Builder setTotalScore(int value) {
            this.bitField0_ |= 1;
            this.totalScore_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalScore() {
            this.bitField0_ &= -2;
            this.totalScore_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureJoinServersIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.joinServers_ = CrossActivityMsg.CR2S_BroodActivityInfo_13112.mutableCopy(this.joinServers_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getJoinServersList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.joinServers_) : this.joinServers_);
         }

         public int getJoinServersCount() {
            return this.joinServers_.size();
         }

         public int getJoinServers(int index) {
            return this.joinServers_.getInt(index);
         }

         public Builder setJoinServers(int index, int value) {
            this.ensureJoinServersIsMutable();
            this.joinServers_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addJoinServers(int value) {
            this.ensureJoinServersIsMutable();
            this.joinServers_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllJoinServers(Iterable<? extends Integer> values) {
            this.ensureJoinServersIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.joinServers_);
            this.onChanged();
            return this;
         }

         public Builder clearJoinServers() {
            this.joinServers_ = CrossActivityMsg.CR2S_BroodActivityInfo_13112.emptyIntList();
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

   public static final class CR2S_BroodRankScoreUpdate_13113 extends GeneratedMessageV3 implements CR2S_BroodRankScoreUpdate_13113OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TOTALSCORE_FIELD_NUMBER = 1;
      private int totalScore_;
      private byte memoizedIsInitialized;
      private static final CR2S_BroodRankScoreUpdate_13113 DEFAULT_INSTANCE = new CR2S_BroodRankScoreUpdate_13113();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_BroodRankScoreUpdate_13113> PARSER = new AbstractParser<CR2S_BroodRankScoreUpdate_13113>() {
         public CR2S_BroodRankScoreUpdate_13113 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_BroodRankScoreUpdate_13113(input, extensionRegistry);
         }
      };

      private CR2S_BroodRankScoreUpdate_13113(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_BroodRankScoreUpdate_13113() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_BroodRankScoreUpdate_13113();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_BroodRankScoreUpdate_13113(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.totalScore_ = input.readInt32();
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
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodRankScoreUpdate_13113_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodRankScoreUpdate_13113_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BroodRankScoreUpdate_13113.class, Builder.class);
      }

      public boolean hasTotalScore() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTotalScore() {
         return this.totalScore_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTotalScore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.totalScore_);
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
               size += CodedOutputStream.computeInt32Size(1, this.totalScore_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_BroodRankScoreUpdate_13113)) {
            return super.equals(obj);
         } else {
            CR2S_BroodRankScoreUpdate_13113 other = (CR2S_BroodRankScoreUpdate_13113)obj;
            if (this.hasTotalScore() != other.hasTotalScore()) {
               return false;
            } else if (this.hasTotalScore() && this.getTotalScore() != other.getTotalScore()) {
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
            if (this.hasTotalScore()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTotalScore();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_BroodRankScoreUpdate_13113 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_BroodRankScoreUpdate_13113)PARSER.parseFrom(data);
      }

      public static CR2S_BroodRankScoreUpdate_13113 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BroodRankScoreUpdate_13113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BroodRankScoreUpdate_13113 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_BroodRankScoreUpdate_13113)PARSER.parseFrom(data);
      }

      public static CR2S_BroodRankScoreUpdate_13113 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BroodRankScoreUpdate_13113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BroodRankScoreUpdate_13113 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_BroodRankScoreUpdate_13113)PARSER.parseFrom(data);
      }

      public static CR2S_BroodRankScoreUpdate_13113 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BroodRankScoreUpdate_13113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BroodRankScoreUpdate_13113 parseFrom(InputStream input) throws IOException {
         return (CR2S_BroodRankScoreUpdate_13113)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BroodRankScoreUpdate_13113 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BroodRankScoreUpdate_13113)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BroodRankScoreUpdate_13113 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_BroodRankScoreUpdate_13113)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_BroodRankScoreUpdate_13113 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BroodRankScoreUpdate_13113)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BroodRankScoreUpdate_13113 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_BroodRankScoreUpdate_13113)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BroodRankScoreUpdate_13113 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BroodRankScoreUpdate_13113)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_BroodRankScoreUpdate_13113 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_BroodRankScoreUpdate_13113 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_BroodRankScoreUpdate_13113> parser() {
         return PARSER;
      }

      public Parser<CR2S_BroodRankScoreUpdate_13113> getParserForType() {
         return PARSER;
      }

      public CR2S_BroodRankScoreUpdate_13113 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_BroodRankScoreUpdate_13113OrBuilder {
         private int bitField0_;
         private int totalScore_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodRankScoreUpdate_13113_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodRankScoreUpdate_13113_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BroodRankScoreUpdate_13113.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossActivityMsg.CR2S_BroodRankScoreUpdate_13113.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.totalScore_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodRankScoreUpdate_13113_descriptor;
         }

         public CR2S_BroodRankScoreUpdate_13113 getDefaultInstanceForType() {
            return CrossActivityMsg.CR2S_BroodRankScoreUpdate_13113.getDefaultInstance();
         }

         public CR2S_BroodRankScoreUpdate_13113 build() {
            CR2S_BroodRankScoreUpdate_13113 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_BroodRankScoreUpdate_13113 buildPartial() {
            CR2S_BroodRankScoreUpdate_13113 result = new CR2S_BroodRankScoreUpdate_13113(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.totalScore_ = this.totalScore_;
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
            if (other instanceof CR2S_BroodRankScoreUpdate_13113) {
               return this.mergeFrom((CR2S_BroodRankScoreUpdate_13113)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_BroodRankScoreUpdate_13113 other) {
            if (other == CrossActivityMsg.CR2S_BroodRankScoreUpdate_13113.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTotalScore()) {
                  this.setTotalScore(other.getTotalScore());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTotalScore();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_BroodRankScoreUpdate_13113 parsedMessage = null;

            try {
               parsedMessage = (CR2S_BroodRankScoreUpdate_13113)CrossActivityMsg.CR2S_BroodRankScoreUpdate_13113.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_BroodRankScoreUpdate_13113)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTotalScore() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTotalScore() {
            return this.totalScore_;
         }

         public Builder setTotalScore(int value) {
            this.bitField0_ |= 1;
            this.totalScore_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalScore() {
            this.bitField0_ &= -2;
            this.totalScore_ = 0;
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

   public static final class S2CR_BroodSettleTest_13114 extends GeneratedMessageV3 implements S2CR_BroodSettleTest_13114OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private volatile Object type_;
      private byte memoizedIsInitialized;
      private static final S2CR_BroodSettleTest_13114 DEFAULT_INSTANCE = new S2CR_BroodSettleTest_13114();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_BroodSettleTest_13114> PARSER = new AbstractParser<S2CR_BroodSettleTest_13114>() {
         public S2CR_BroodSettleTest_13114 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_BroodSettleTest_13114(input, extensionRegistry);
         }
      };

      private S2CR_BroodSettleTest_13114(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_BroodSettleTest_13114() {
         this.memoizedIsInitialized = -1;
         this.type_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_BroodSettleTest_13114();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_BroodSettleTest_13114(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 1;
                        this.type_ = bs;
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
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_BroodSettleTest_13114_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_BroodSettleTest_13114_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_BroodSettleTest_13114.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getType() {
         Object ref = this.type_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.type_ = s;
            }

            return s;
         }
      }

      public ByteString getTypeBytes() {
         Object ref = this.type_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.type_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
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
            GeneratedMessageV3.writeString(output, 1, this.type_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_BroodSettleTest_13114)) {
            return super.equals(obj);
         } else {
            S2CR_BroodSettleTest_13114 other = (S2CR_BroodSettleTest_13114)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && !this.getType().equals(other.getType())) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_BroodSettleTest_13114 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_BroodSettleTest_13114)PARSER.parseFrom(data);
      }

      public static S2CR_BroodSettleTest_13114 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BroodSettleTest_13114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BroodSettleTest_13114 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_BroodSettleTest_13114)PARSER.parseFrom(data);
      }

      public static S2CR_BroodSettleTest_13114 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BroodSettleTest_13114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BroodSettleTest_13114 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_BroodSettleTest_13114)PARSER.parseFrom(data);
      }

      public static S2CR_BroodSettleTest_13114 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BroodSettleTest_13114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BroodSettleTest_13114 parseFrom(InputStream input) throws IOException {
         return (S2CR_BroodSettleTest_13114)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_BroodSettleTest_13114 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BroodSettleTest_13114)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_BroodSettleTest_13114 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_BroodSettleTest_13114)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_BroodSettleTest_13114 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BroodSettleTest_13114)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_BroodSettleTest_13114 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_BroodSettleTest_13114)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_BroodSettleTest_13114 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BroodSettleTest_13114)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_BroodSettleTest_13114 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_BroodSettleTest_13114 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_BroodSettleTest_13114> parser() {
         return PARSER;
      }

      public Parser<S2CR_BroodSettleTest_13114> getParserForType() {
         return PARSER;
      }

      public S2CR_BroodSettleTest_13114 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_BroodSettleTest_13114OrBuilder {
         private int bitField0_;
         private Object type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_BroodSettleTest_13114_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_BroodSettleTest_13114_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_BroodSettleTest_13114.class, Builder.class);
         }

         private Builder() {
            this.type_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.type_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossActivityMsg.S2CR_BroodSettleTest_13114.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = "";
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_S2CR_BroodSettleTest_13114_descriptor;
         }

         public S2CR_BroodSettleTest_13114 getDefaultInstanceForType() {
            return CrossActivityMsg.S2CR_BroodSettleTest_13114.getDefaultInstance();
         }

         public S2CR_BroodSettleTest_13114 build() {
            S2CR_BroodSettleTest_13114 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_BroodSettleTest_13114 buildPartial() {
            S2CR_BroodSettleTest_13114 result = new S2CR_BroodSettleTest_13114(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.type_ = this.type_;
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
            if (other instanceof S2CR_BroodSettleTest_13114) {
               return this.mergeFrom((S2CR_BroodSettleTest_13114)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_BroodSettleTest_13114 other) {
            if (other == CrossActivityMsg.S2CR_BroodSettleTest_13114.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.bitField0_ |= 1;
                  this.type_ = other.type_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_BroodSettleTest_13114 parsedMessage = null;

            try {
               parsedMessage = (S2CR_BroodSettleTest_13114)CrossActivityMsg.S2CR_BroodSettleTest_13114.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_BroodSettleTest_13114)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
         }

         public String getType() {
            Object ref = this.type_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.type_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getTypeBytes() {
            Object ref = this.type_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.type_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setType(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.type_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = CrossActivityMsg.S2CR_BroodSettleTest_13114.getDefaultInstance().getType();
            this.onChanged();
            return this;
         }

         public Builder setTypeBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.type_ = value;
               this.onChanged();
               return this;
            }
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_BroodUnlockPoolNotify_13115 extends GeneratedMessageV3 implements CR2S_BroodUnlockPoolNotify_13115OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OLDPOOLTYPE_FIELD_NUMBER = 1;
      private int oldPoolType_;
      public static final int NEWPOOLTYPE_FIELD_NUMBER = 2;
      private int newPoolType_;
      private byte memoizedIsInitialized;
      private static final CR2S_BroodUnlockPoolNotify_13115 DEFAULT_INSTANCE = new CR2S_BroodUnlockPoolNotify_13115();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_BroodUnlockPoolNotify_13115> PARSER = new AbstractParser<CR2S_BroodUnlockPoolNotify_13115>() {
         public CR2S_BroodUnlockPoolNotify_13115 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_BroodUnlockPoolNotify_13115(input, extensionRegistry);
         }
      };

      private CR2S_BroodUnlockPoolNotify_13115(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_BroodUnlockPoolNotify_13115() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_BroodUnlockPoolNotify_13115();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_BroodUnlockPoolNotify_13115(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.oldPoolType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.newPoolType_ = input.readInt32();
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
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodUnlockPoolNotify_13115_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodUnlockPoolNotify_13115_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BroodUnlockPoolNotify_13115.class, Builder.class);
      }

      public boolean hasOldPoolType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getOldPoolType() {
         return this.oldPoolType_;
      }

      public boolean hasNewPoolType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getNewPoolType() {
         return this.newPoolType_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasOldPoolType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasNewPoolType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.oldPoolType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.newPoolType_);
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
               size += CodedOutputStream.computeInt32Size(1, this.oldPoolType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.newPoolType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_BroodUnlockPoolNotify_13115)) {
            return super.equals(obj);
         } else {
            CR2S_BroodUnlockPoolNotify_13115 other = (CR2S_BroodUnlockPoolNotify_13115)obj;
            if (this.hasOldPoolType() != other.hasOldPoolType()) {
               return false;
            } else if (this.hasOldPoolType() && this.getOldPoolType() != other.getOldPoolType()) {
               return false;
            } else if (this.hasNewPoolType() != other.hasNewPoolType()) {
               return false;
            } else if (this.hasNewPoolType() && this.getNewPoolType() != other.getNewPoolType()) {
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
            if (this.hasOldPoolType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getOldPoolType();
            }

            if (this.hasNewPoolType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getNewPoolType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_BroodUnlockPoolNotify_13115 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_BroodUnlockPoolNotify_13115)PARSER.parseFrom(data);
      }

      public static CR2S_BroodUnlockPoolNotify_13115 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BroodUnlockPoolNotify_13115)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BroodUnlockPoolNotify_13115 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_BroodUnlockPoolNotify_13115)PARSER.parseFrom(data);
      }

      public static CR2S_BroodUnlockPoolNotify_13115 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BroodUnlockPoolNotify_13115)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BroodUnlockPoolNotify_13115 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_BroodUnlockPoolNotify_13115)PARSER.parseFrom(data);
      }

      public static CR2S_BroodUnlockPoolNotify_13115 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BroodUnlockPoolNotify_13115)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BroodUnlockPoolNotify_13115 parseFrom(InputStream input) throws IOException {
         return (CR2S_BroodUnlockPoolNotify_13115)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BroodUnlockPoolNotify_13115 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BroodUnlockPoolNotify_13115)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BroodUnlockPoolNotify_13115 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_BroodUnlockPoolNotify_13115)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_BroodUnlockPoolNotify_13115 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BroodUnlockPoolNotify_13115)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BroodUnlockPoolNotify_13115 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_BroodUnlockPoolNotify_13115)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BroodUnlockPoolNotify_13115 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BroodUnlockPoolNotify_13115)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_BroodUnlockPoolNotify_13115 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_BroodUnlockPoolNotify_13115 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_BroodUnlockPoolNotify_13115> parser() {
         return PARSER;
      }

      public Parser<CR2S_BroodUnlockPoolNotify_13115> getParserForType() {
         return PARSER;
      }

      public CR2S_BroodUnlockPoolNotify_13115 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_BroodUnlockPoolNotify_13115OrBuilder {
         private int bitField0_;
         private int oldPoolType_;
         private int newPoolType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodUnlockPoolNotify_13115_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodUnlockPoolNotify_13115_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BroodUnlockPoolNotify_13115.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossActivityMsg.CR2S_BroodUnlockPoolNotify_13115.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.oldPoolType_ = 0;
            this.bitField0_ &= -2;
            this.newPoolType_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossActivityMsg.internal_static_crossActivity_com_gzbz_protobuf_CR2S_BroodUnlockPoolNotify_13115_descriptor;
         }

         public CR2S_BroodUnlockPoolNotify_13115 getDefaultInstanceForType() {
            return CrossActivityMsg.CR2S_BroodUnlockPoolNotify_13115.getDefaultInstance();
         }

         public CR2S_BroodUnlockPoolNotify_13115 build() {
            CR2S_BroodUnlockPoolNotify_13115 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_BroodUnlockPoolNotify_13115 buildPartial() {
            CR2S_BroodUnlockPoolNotify_13115 result = new CR2S_BroodUnlockPoolNotify_13115(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.oldPoolType_ = this.oldPoolType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.newPoolType_ = this.newPoolType_;
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
            if (other instanceof CR2S_BroodUnlockPoolNotify_13115) {
               return this.mergeFrom((CR2S_BroodUnlockPoolNotify_13115)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_BroodUnlockPoolNotify_13115 other) {
            if (other == CrossActivityMsg.CR2S_BroodUnlockPoolNotify_13115.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOldPoolType()) {
                  this.setOldPoolType(other.getOldPoolType());
               }

               if (other.hasNewPoolType()) {
                  this.setNewPoolType(other.getNewPoolType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasOldPoolType()) {
               return false;
            } else {
               return this.hasNewPoolType();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_BroodUnlockPoolNotify_13115 parsedMessage = null;

            try {
               parsedMessage = (CR2S_BroodUnlockPoolNotify_13115)CrossActivityMsg.CR2S_BroodUnlockPoolNotify_13115.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_BroodUnlockPoolNotify_13115)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOldPoolType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getOldPoolType() {
            return this.oldPoolType_;
         }

         public Builder setOldPoolType(int value) {
            this.bitField0_ |= 1;
            this.oldPoolType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOldPoolType() {
            this.bitField0_ &= -2;
            this.oldPoolType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasNewPoolType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getNewPoolType() {
            return this.newPoolType_;
         }

         public Builder setNewPoolType(int value) {
            this.bitField0_ |= 2;
            this.newPoolType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNewPoolType() {
            this.bitField0_ &= -3;
            this.newPoolType_ = 0;
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

   public interface ActivityRankOrBuilder extends MessageOrBuilder {
      boolean hasRankType();

      int getRankType();

      List<PlayerActRankInfo> getRankList();

      PlayerActRankInfo getRank(int index);

      int getRankCount();

      List<? extends PlayerActRankInfoOrBuilder> getRankOrBuilderList();

      PlayerActRankInfoOrBuilder getRankOrBuilder(int index);
   }

   public interface CR2S_ActivitySettle_13102OrBuilder extends MessageOrBuilder {
      boolean hasActivityType();

      int getActivityType();

      boolean hasEndTime();

      int getEndTime();

      List<ActivityRank> getActivityRankList();

      ActivityRank getActivityRank(int index);

      int getActivityRankCount();

      List<? extends ActivityRankOrBuilder> getActivityRankOrBuilderList();

      ActivityRankOrBuilder getActivityRankOrBuilder(int index);

      boolean hasCrossChange();

      boolean getCrossChange();
   }

   public interface CR2S_BroodActivityInfo_13112OrBuilder extends MessageOrBuilder {
      boolean hasTotalScore();

      int getTotalScore();

      List<Integer> getJoinServersList();

      int getJoinServersCount();

      int getJoinServers(int index);
   }

   public interface CR2S_BroodActivitySettle_13108OrBuilder extends MessageOrBuilder {
      boolean hasActivityType();

      int getActivityType();

      boolean hasEndTime();

      int getEndTime();

      boolean hasCrossChange();

      boolean getCrossChange();

      boolean hasServerRank();

      ActivityRank getServerRank();

      ActivityRankOrBuilder getServerRankOrBuilder();

      boolean hasTenRank();

      ActivityRank getTenRank();

      ActivityRankOrBuilder getTenRankOrBuilder();

      boolean hasCrossOpenDay();

      int getCrossOpenDay();

      boolean hasPoolType();

      int getPoolType();
   }

   public interface CR2S_BroodRankInfo_13109OrBuilder extends MessageOrBuilder {
      boolean hasActivityId();

      int getActivityId();

      boolean hasModuleId();

      int getModuleId();

      List<String> getParamsList();

      int getParamsCount();

      String getParams(int index);

      ByteString getParamsBytes(int index);

      boolean hasLimit();

      int getLimit();
   }

   public interface CR2S_BroodRankScoreUpdate_13113OrBuilder extends MessageOrBuilder {
      boolean hasTotalScore();

      int getTotalScore();
   }

   public interface CR2S_BroodUnlockPoolNotify_13115OrBuilder extends MessageOrBuilder {
      boolean hasOldPoolType();

      int getOldPoolType();

      boolean hasNewPoolType();

      int getNewPoolType();
   }

   public interface CR2S_FlowerRankInfo_13106OrBuilder extends MessageOrBuilder {
      List<ActivityRank> getActivityRankList();

      ActivityRank getActivityRank(int index);

      int getActivityRankCount();

      List<? extends ActivityRankOrBuilder> getActivityRankOrBuilderList();

      ActivityRankOrBuilder getActivityRankOrBuilder(int index);
   }

   public interface CR2S_NoticeCrossActOpenDay_13105OrBuilder extends MessageOrBuilder {
      boolean hasActivityType();

      int getActivityType();

      boolean hasCrossActOpenDay();

      int getCrossActOpenDay();

      List<Integer> getJoinServersList();

      int getJoinServersCount();

      int getJoinServers(int index);
   }

   public interface PlayerActRankInfoOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasRank();

      int getRank();

      boolean hasScore();

      long getScore();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();
   }

   public interface S2CR_Activity8Upload_13110OrBuilder extends MessageOrBuilder {
      boolean hasActivityType();

      int getActivityType();

      boolean hasDropTime();

      int getDropTime();

      boolean hasEndTime();

      int getEndTime();

      boolean hasActOpenDay();

      int getActOpenDay();
   }

   public interface S2CR_ActivityGm_13103OrBuilder extends MessageOrBuilder {
      boolean hasCmd();

      String getCmd();

      ByteString getCmdBytes();

      List<Integer> getParamsList();

      int getParamsCount();

      int getParams(int index);
   }

   public interface S2CR_ActivityUpload_13101OrBuilder extends MessageOrBuilder {
      boolean hasActivityType();

      int getActivityType();

      boolean hasDropTime();

      int getDropTime();

      boolean hasEndTime();

      int getEndTime();

      boolean hasActOpenDay();

      int getActOpenDay();
   }

   public interface S2CR_BroodActivityUpload_13107OrBuilder extends MessageOrBuilder {
      boolean hasActivityType();

      int getActivityType();

      boolean hasDropTime();

      int getDropTime();

      boolean hasEndTime();

      int getEndTime();
   }

   public interface S2CR_BroodSettleTest_13114OrBuilder extends MessageOrBuilder {
      boolean hasType();

      String getType();

      ByteString getTypeBytes();
   }

   public interface S2CR_DecisiveActivityUpload_13104OrBuilder extends MessageOrBuilder {
      boolean hasActivityType();

      int getActivityType();

      boolean hasDropTime();

      int getDropTime();

      boolean hasEndTime();

      int getEndTime();
   }

   public interface S2CR_UpdateBroodRankScroe_13111OrBuilder extends MessageOrBuilder {
      boolean hasActivityId();

      int getActivityId();

      boolean hasEndTime();

      int getEndTime();

      boolean hasActivityType();

      int getActivityType();

      boolean hasEndScore();

      int getEndScore();
   }
}
